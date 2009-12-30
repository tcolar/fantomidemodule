/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import fan.sys.Buf;
import fan.sys.FanObj;
import fan.sys.Pod;
import fan.sys.Type;
import fanx.fcode.FConst;
import fanx.fcode.FField;
import fanx.fcode.FMethod;
import fanx.fcode.FMethodVar;
import fanx.fcode.FPod;
import fanx.fcode.FSlot;
import fanx.fcode.FType;
import fanx.fcode.FTypeRef;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Hashtable;
import java.util.Vector;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.NBFanParser;
import net.colar.netbeans.fan.ast.FanAstField;
import net.colar.netbeans.fan.ast.FanAstMethod;
import net.colar.netbeans.fan.ast.FanAstResolvResult;
import net.colar.netbeans.fan.ast.FanAstResolvedType;
import net.colar.netbeans.fan.ast.FanAstScope;
import net.colar.netbeans.fan.ast.FanAstScopeVarBase;
import net.colar.netbeans.fan.ast.FanAstScopeVarBase.ModifEnum;
import net.colar.netbeans.fan.ast.FanRootScope;
import net.colar.netbeans.fan.ast.FanTypeScope;
import net.colar.netbeans.fan.indexer.model.FanDocUsing;
import net.colar.netbeans.fan.indexer.model.FanDocument;
import net.colar.netbeans.fan.indexer.model.FanMethodParam;
import net.colar.netbeans.fan.indexer.model.FanModelConstants;
import net.colar.netbeans.fan.indexer.model.FanSlot;
import net.colar.netbeans.fan.indexer.model.FanType;
import net.colar.netbeans.fan.indexer.model.FanTypeInheritance;
import net.colar.netbeans.fan.platform.FanPlatform;
import net.jot.logger.JOTLoggerLocation;
import net.jot.persistance.JOTSQLCondition;
import net.jot.persistance.builders.JOTQueryBuilder;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.indexing.Context;
import org.netbeans.modules.parsing.spi.indexing.CustomIndexer;
import org.netbeans.modules.parsing.spi.indexing.Indexable;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.filesystems.FileUtil;

/**
 * This indexer is backed by a DB(H2 database)
 * This class does all the Index updates(write)
 * Use FanIndexQyery to search it.
 *
 * Index all the documents:
 * fan/fwt sources
 * fantom distro pods/libs
 * jdk libs ?
 * @author tcolar
 */
public class FanIndexer extends CustomIndexer implements FileChangeListener
{

	public static final String UNRESOLVED_TYPE = "!!UNRESOLVED!!";
	private final static Pattern CLOSURECLASS = Pattern.compile(".*?\\$\\d+\\z");
	static JOTLoggerLocation log = new JOTLoggerLocation(FanIndexer.class);
	private final FanIndexerThread indexerThread;
	public static volatile boolean shutdown = false;
	Hashtable<String, Long> toBeIndexed = new Hashtable<String, Long>();

	public FanIndexer()
	{
		super();
		indexerThread = new FanIndexerThread();
		indexerThread.start();
		// start the indexing thread
		// index Fantom libs right aways
		long then = new Date().getTime();
		indexFantomPods();
		long now = new Date().getTime();
		log.info("Fantom Pod Parsing completed in " + (now - then) + " ms.");
		// index Fantom jars + standrad java jars ?
		//indexJava();
		// sources indexes will be called  through scanStarted()
		// TODO: cleanup docs that don't exist any more docs (binaries & sources)?
		// TODO: Log db stats (# of docs, types, slots)
	}

	@Override
	protected void index(Iterable<? extends Indexable> iterable, Context context)
	{
		for (Indexable indexable : iterable)
		{
			index(indexable.getURL().getPath());
		}
	}

	// TODO: It would be MUCH faster to just parse what we need (types/slots)
	// Might need a separte ANTLR grammar though.
	public void index(String path)
	{

		long then = new Date().getTime();
		log.info("Indexing requested for: " + path);
		// Get a snaphost of the source
		File f = new File(path);

		FileObject fo = FileUtil.toFileObject(f);
		Source source = Source.create(fo);
		Snapshot snapshot = source.createSnapshot();
		// Parse the snaphot
		NBFanParser parser = new NBFanParser();
		try
		{
			parser.parse(snapshot);
		} catch (Throwable e)
		{
			log.exception("Parsing failed for: " + path, e);
			return;
		}
		Result result = parser.getResult();
		long now = new Date().getTime();
		log.debug("Indexing - parsing done in " + (now - then) + " ms for: " + path);
		// Index the parsed doc
		index(path, result);
		now = new Date().getTime();
		log.debug("Indexing completed in " + (now - then) + " ms for: " + path);
	}

	public void index(String path, Result parserResult)
	{
		log.debug("Indexing parsed result for : " + path);

		FanParserResult fanResult = (FanParserResult) parserResult;
		indexSrcDoc(path, fanResult.getRootScope());
	}

	/**
	 * Index the document in the DB, using the root scope.
	 * @param doc
	 * @param indexable
	 * @param rootScope
	 */
	public void indexSrcDoc(String path, FanRootScope rootScope)
	{
		//TODO: does this need to be synchronized or is NB taking care of that ?
		//JOTTransaction transaction = null;
		FanDocument doc = null;
		try
		{
			if (rootScope != null)
			{
				// create / update the doument
				doc = FanDocument.findOrCreateOne(null, path);
				if (doc.isNew())
				{
					doc.setPath(path);
					doc.setTstamp(new Date().getTime());
					doc.setIsSource(true);
					doc.save();
				}

				// Update the  "using" / try to be smart as to not delete / recreate all everytime.
				Vector<FanDocUsing> usings = FanDocUsing.findAllForDoc(null, doc.getId());
				Vector<FanType> types = FanType.findAllForDoc(null, doc.getId());
				Vector<Long> inh2Delete = new Vector<Long>();

				Vector<String> addedUsings = new Vector();
				for (FanResolvedType type : rootScope.getUsing().values())
				{
					String sig = type.getQualifiedType();
					int foundIdx = -1;
					for (int i = 0; i != usings.size(); i++)
					{
						FanDocUsing using = usings.get(i);
						if (using.getType().equals(sig))
						{
							foundIdx = i;
							break;
						}
					}
					if (foundIdx != -1)
					{
						// already in there, leave it alone
						usings.remove(foundIdx);
					} else
					{
						// there can be duplicates because of the way rootscope usings works
						if (!addedUsings.contains(sig))
						{
							addedUsings.add(sig);
							// new one, creating it
							FanDocUsing using = new FanDocUsing();
							using.setDocumentId(doc.getId());
							using.setType(sig);
							using.save();
						}
					}
				}

				// types
				// TODO: remove the old ones too
				for (FanAstScope child : rootScope.getChildren())
				{
					// should be but check anyway in case of future change
					if (child instanceof FanTypeScope)
					{
						FanTypeScope typeScope = (FanTypeScope) child;
						JOTSQLCondition cond = new JOTSQLCondition("qualifiedName", JOTSQLCondition.IS_EQUAL, typeScope.getQName());
						FanType dbType = (FanType) JOTQueryBuilder.selectQuery(null, FanType.class).where(cond).findOrCreateOne();
						if (!dbType.isNew())
						{
							for (int i = 0; i != types.size(); i++)
							{
								FanType t = types.get(i);
								if (t.getId() == dbType.getId())
								{
									types.remove(i);
									break;
								}
							}
						}
						dbType.setDocumentId(doc.getId());
						dbType.setKind(typeScope.getKind().value());
						dbType.setIsAbstract(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.ABSTRACT));
						dbType.setIsConst(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.CONST));
						dbType.setIsFinal(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.FINAL));
						dbType.setQualifiedName(typeScope.getQName());
						dbType.setSimpleName(typeScope.getName());
						dbType.setPod(typeScope.getPod());
						dbType.setProtection(typeScope.getProtection());
						dbType.setIsFromSource(true);

						dbType.save();

						// Try to reuse existing db entries.
						Vector<FanTypeInheritance> currentInh = FanTypeInheritance.findAllForMainType(null, typeScope.getQName());
						for (FanResolvedType item : typeScope.getInheritedItems())
						{
							String mainType = typeScope.getQName();
							String inhType = item.getQualifiedType();
							int foundIdx = -1;
							for (int i = 0; i != currentInh.size(); i++)
							{
								FanTypeInheritance cur = currentInh.get(i);
								if (cur.getMainType().equals(mainType) && cur.getInheritedType().equals(inhType))
								{
									foundIdx = i;
									break;
								}
							}
							if (foundIdx != -1)
							{
								// already in there, leave it alone
								currentInh.remove(foundIdx);
							} else
							{
								// new one, creating it
								FanTypeInheritance inh = new FanTypeInheritance();
								inh.setMainType(mainType);
								inh.setInheritedType(inhType);
								inh.save();
							}
						}
						// Whatever wasn't removed from the vector is not needed anymore.
						for (FanTypeInheritance inh : currentInh)
						{
							inh2Delete.add(inh.getId());
						}

						// Slots
						// Try to reuse existing db entries.
						Vector<FanSlot> currentSlots = FanSlot.findAllForType(null, dbType.getId());
						for (FanAstScopeVarBase slot : typeScope.getScopeVars())
						{
							// determine kind of slot
							FanModelConstants.SlotKind kind = FanModelConstants.SlotKind.FIELD;
							if (slot instanceof FanAstField)
							{
								kind = FanModelConstants.SlotKind.FIELD;
							} else if (slot instanceof FanAstMethod)
							{
								if (((FanAstMethod) slot).isCtor())
								{
									kind = FanModelConstants.SlotKind.CTOR;
								} else
								{
									kind = FanModelConstants.SlotKind.METHOD;
								}
							} else
							{
								throw new RuntimeException("Unexpected Slot kind: " + slot.getClass().getName());
							}

							JOTSQLCondition cond2 = new JOTSQLCondition("typeId", JOTSQLCondition.IS_EQUAL, dbType.getId());
							JOTSQLCondition cond3 = new JOTSQLCondition("name", JOTSQLCondition.IS_EQUAL, slot.getName());
							FanSlot dbSlot = (FanSlot) JOTQueryBuilder.selectQuery(null, FanSlot.class).where(cond2).where(cond3).findOrCreateOne();
							if (!dbSlot.isNew())
							{
								for (int i = 0; i != currentSlots.size(); i++)
								{
									FanSlot s = currentSlots.get(i);
									if (s.getId() == dbSlot.getId())
									{
										currentSlots.remove(i);
										break;
									}
								}
							}
							dbSlot.setTypeId(dbType.getId());
							dbSlot.setSlotKind(kind.value());
							String type = UNRESOLVED_TYPE; // can that happen ?
							FanResolvedType slotType = slot.getType();
							if (slotType.isResolved())
							{
								type = slotType.getDbType().getQualifiedName();
							}
							dbSlot.setReturnedType(type);
							dbSlot.setName(slot.getName());
							dbSlot.setIsAbstract(slot.hasModifier(ModifEnum.ABSTRACT));
							dbSlot.setIsNative(slot.hasModifier(ModifEnum.NATIVE));
							//dbSlot.setIsOnce(slot.hasModifier(ModifEnum.ONCE));
							dbSlot.setIsOverride(slot.hasModifier(ModifEnum.OVERRIDE));
							//dbSlot.setIsReadonly(slot.hasModifier(ModifEnum.READONLY));
							dbSlot.setIsStatic(slot.hasModifier(ModifEnum.STATIC));
							dbSlot.setIsVirtual(slot.hasModifier(ModifEnum.VIRTUAL));
							dbSlot.setIsConst(slot.hasModifier(ModifEnum.CONST));
							dbSlot.setProtection(slot.getProtection());
							dbSlot.setIsNullable(slotType.isNullable());

							dbSlot.save();

							// deal with parameters of method/ctor
							if (slot instanceof FanAstMethod)
							{
								FanAstMethod method = (FanAstMethod) slot;
								Hashtable<String, FanResolvedType> parameters = method.getParameters();

								// Try to reuse existing db entries.
								Vector<FanMethodParam> currentParams = FanMethodParam.findAllForSlot(null, dbSlot.getId());
								for (String paramName : parameters.keySet())
								{
									FanResolvedType paramResult = parameters.get(paramName);
									JOTSQLCondition cond4 = new JOTSQLCondition("slotId", JOTSQLCondition.IS_EQUAL, dbSlot.getId());
									FanMethodParam dbParam = (FanMethodParam) JOTQueryBuilder.selectQuery(null, FanMethodParam.class).where(cond4).findOrCreateOne();
									if (!dbParam.isNew())
									{
										for (int i = 0; i != currentParams.size(); i++)
										{
											FanMethodParam p = currentParams.get(i);
											if (p.getId() == dbParam.getId())
											{
												currentParams.remove(i);
												break;
											}
										}
									}
									dbParam.setSlotId(dbSlot.getId());
									dbParam.setName(paramName);
									String pType = UNRESOLVED_TYPE; // can that happen ?
									if (paramResult.isResolved())
									{
										pType = paramResult.getDbType().getQualifiedName();
									}
									dbParam.setQualifiedType(pType);
									dbParam.setIsNullable(paramResult.isNullable());

									dbParam.save();

								} // end param loop
								// Whatever param wasn't removed from the vector is not needed anymore.
								for (FanMethodParam param : currentParams)
								{
									param.delete();
								}
							}
						} // end slot loop
						// Whatever slot wasn't removed from the vector is not needed anymore.
						for (FanSlot s : currentSlots)
						{
							s.delete();
						}
					}
				} // end type loop

				// remove old usings
				for (FanDocUsing using : usings)
				{
					using.delete();
				}
				// old inherited types
				for (Long inh : inh2Delete)
				{
					JOTQueryBuilder.deleteByID(null, FanTypeInheritance.class, inh);
				}
				// remove old types
				for (FanType t : types)
				{
					t.delete();
				}
			}

		} catch (Exception e)
		{
			log.exception("Indexing Failed for: " + path, e);
			try
			{
				// remove the incomplete doc ... wil try again next time.
				if (doc != null)
				{
					doc.delete();
				}
			} catch (Exception e2)
			{
				log.exception("Indexing 'rollback' failed for: " + path, e);
			}
		}
	}

	static boolean checkIfNeedsReindexing(String path, long tstamp)
	{
		JOTSQLCondition cond = new JOTSQLCondition("path", JOTSQLCondition.IS_EQUAL, path);
		try
		{
			FanDocument doc = (FanDocument) JOTQueryBuilder.selectQuery(null, FanDocument.class).where(cond).findOne();
			if (doc != null)
			{
				long indexedTime = doc.getTstamp();
				if (indexedTime >= tstamp)
				{
					return false;
				}
			}
		} catch (Exception e)
		{
			log.exception("FanDocument search exception", e);
		}
		return true;
	}

	public void indexFantomPods()
	{
		FanPlatform platform = FanPlatform.getInstance(false);
		if (platform != null)
		{
			String podsDir = platform.getPodsDir();
			File f = new File(podsDir);
			// listen to changes in pod folder
			FileUtil.addFileChangeListener(this, f);
			// index the pods if not up to date
			File[] pods = f.listFiles();
			for (File pod : pods)
			{
				String path = pod.getAbsolutePath();
				if (checkIfNeedsReindexing(path, pod.lastModified()))
				{
					indexPod(path);
				}
			}
		}
	}

	private void indexPod(String pod)
	{
		if (pod.toLowerCase().endsWith(".pod"))
		{
			FanDocument doc = null;
			try
			{

				ZipFile zpod = new ZipFile(pod);
				FPod fpod = new FPod(null, zpod, null);
				fpod.readFully();
				log.debug("Indexing pod: " + pod);
				// Create the document
				doc = FanDocument.findOrCreateOne(null, pod);
				if (doc.isNew())
				{
					doc.setPath(pod);
					doc.setTstamp(new Date().getTime());
					doc.setIsSource(false);
					doc.save();
				}
				Vector<FanType> types = FanType.findAllForDoc(null, doc.getId());

				for (FType type : fpod.types)
				{
					FTypeRef typeRef = type.pod.typeRef(type.self);
					String sig = typeRef.signature;
					int flags = type.flags;
					// Skipping "internal" classes - closures and the likes
					// synthetic means generated by compiler
					if (hasFlag(flags, FConst.Synthetic) || CLOSURECLASS.matcher(typeRef.typeName).matches())
					{
						continue;
					}
					FanUtilities.GENERIC_LOGGER.info("Indexing Pod Type: " + sig);

					JOTSQLCondition cond = new JOTSQLCondition("qualifiedName", JOTSQLCondition.IS_EQUAL, sig);
					FanType dbType = (FanType) JOTQueryBuilder.selectQuery(null, FanType.class).where(cond).findOrCreateOne();
					if (!dbType.isNew())
					{
						for (int i = 0; i != types.size(); i++)
						{
							FanType t = types.get(i);
							if (t.getId() == dbType.getId())
							{
								types.remove(i);
								break;
							}
						}
					}
					dbType.setDocumentId(doc.getId());
					dbType.setKind(getKind(type));
					dbType.setIsAbstract(hasFlag(flags, FConst.Abstract));
					dbType.setIsConst(hasFlag(flags, FConst.Const));
					dbType.setIsFinal(hasFlag(flags, FConst.Final));
					dbType.setQualifiedName(sig);
					dbType.setSimpleName(typeRef.typeName);
					dbType.setPod(typeRef.podName);
					dbType.setProtection(getProtection(type.flags));
					dbType.setIsFromSource(false);

					dbType.save();
					// Slots
					// Try to reuse existing db entries.
					Vector<FanSlot> currentSlots = FanSlot.findAllForType(null, dbType.getId());
					Vector<FSlot> slots = new Vector();
					slots.addAll(Arrays.asList(type.fields));
					slots.addAll(Arrays.asList(type.methods));
					for (FSlot slot : slots)
					{
						// determine kind of slot
						FanModelConstants.SlotKind kind = FanModelConstants.SlotKind.FIELD;
						FTypeRef retType = null;
						if (slot instanceof FField)
						{
							kind = FanModelConstants.SlotKind.FIELD;
							retType = type.pod.typeRef(((FField) slot).type);
						} else if (slot instanceof FMethod)
						{
							retType = type.pod.typeRef(((FMethod) slot).ret);
							if (hasFlag(slot.flags, FConst.Ctor))
							{
								kind = FanModelConstants.SlotKind.CTOR;
							} else
							{
								kind = FanModelConstants.SlotKind.METHOD;
							}
						} else
						{
							throw new RuntimeException("Unexpected Slot kind: " + slot.getClass().getName());
						}

						JOTSQLCondition cond2 = new JOTSQLCondition("typeId", JOTSQLCondition.IS_EQUAL, dbType.getId());
						JOTSQLCondition cond3 = new JOTSQLCondition("name", JOTSQLCondition.IS_EQUAL, slot.name);
						FanSlot dbSlot = (FanSlot) JOTQueryBuilder.selectQuery(null, FanSlot.class).where(cond2).where(cond3).findOrCreateOne();
						if (!dbSlot.isNew())
						{
							for (int i = 0; i != currentSlots.size(); i++)
							{
								FanSlot s = currentSlots.get(i);
								if (s.getId() == dbSlot.getId())
								{
									currentSlots.remove(i);
									break;
								}
							}
						}
						dbSlot.setTypeId(dbType.getId());
						dbSlot.setSlotKind(kind.value());
						dbSlot.setReturnedType(retType.signature);
						dbSlot.setName(slot.name);
						dbSlot.setIsAbstract(hasFlag(slot.flags, FConst.Abstract));
						dbSlot.setIsNative(hasFlag(slot.flags, FConst.Native));
						//dbSlot.setIsOnce(hasFlag(slot.flags, FConst.ONCE));
						dbSlot.setIsOverride(hasFlag(slot.flags, FConst.Override));
						//dbSlot.setIsReadonly(hasFlag(slot.flags, FConst.READONLY));
						dbSlot.setIsStatic(hasFlag(slot.flags, FConst.Static));
						dbSlot.setIsVirtual(hasFlag(slot.flags, FConst.Virtual));
						dbSlot.setIsConst(hasFlag(slot.flags, FConst.Const));
						dbSlot.setProtection(getProtection(slot.flags));
						dbSlot.setIsNullable(retType.isNullable());

						dbSlot.save();

						// deal with parameters of method/ctor
						if (slot instanceof FMethod)
						{

							FMethod method = (FMethod) slot;
							FMethodVar[] parameters = method.params();
							// Try to reuse existing db entries.
							Vector<FanMethodParam> currentParams = FanMethodParam.findAllForSlot(null, dbSlot.getId());
							for (FMethodVar param : parameters)
							{
								JOTSQLCondition cond4 = new JOTSQLCondition("slotId", JOTSQLCondition.IS_EQUAL, dbSlot.getId());
								FanMethodParam dbParam = (FanMethodParam) JOTQueryBuilder.selectQuery(null, FanMethodParam.class).where(cond4).findOrCreateOne();
								if (!dbParam.isNew())
								{
									for (int i = 0; i != currentParams.size(); i++)
									{
										FanMethodParam p = currentParams.get(i);
										if (p.getId() == dbParam.getId())
										{
											currentParams.remove(i);
											break;
										}
									}
								}
								FTypeRef tRef = type.pod.typeRef(param.type);
								dbParam.setSlotId(dbSlot.getId());
								dbParam.setName(param.name);
								dbParam.setQualifiedType(tRef.signature);
								dbParam.setIsNullable(tRef.isNullable());

								dbParam.save();

							} // end param loop
							// Whatever param wasn't removed from the vector is not needed anymore.
							for (FanMethodParam param : currentParams)
							{
								param.delete();
							}
						}
					} // end slot loop
					// Whatever slot wasn't removed from the vector is not needed anymore.
					for (FanSlot s : currentSlots)
					{
						s.delete();
					}

				}

				for (FanType t : types)
				{
					t.delete();
				}
			} catch (Exception e)
			{
				log.exception("Indexing failed for: " + pod, e);
				try
				{
					// remove broken enrty, will try again next time
					if (doc != null)
					{
						doc.delete();
					}
				} catch (Exception e2)
				{
					log.exception("Indexing 'rollback' failed for: " + pod, e);
				}
			}
		}
	}

	private int getKind(FType type)
	{
		if (hasFlag(type.flags, FConst.Mixin))
		{
			return FanTypeScope.TypeKind.MIXIN.value();
		}
		if (hasFlag(type.flags, FConst.Enum))
		{
			return FanTypeScope.TypeKind.ENUM.value();
		}
		// class is default
		return FanTypeScope.TypeKind.CLASS.value();
	}

	public boolean hasFlag(int flags, int flag)
	{
		return (flags & flag) != 0;
	}

	public static void shutdown()
	{
		shutdown = true;
	}

	private int getProtection(int flags)
	{
		if (hasFlag(flags, FConst.Private))
		{
			return ModifEnum.PRIVATE.value();
		}
		if (hasFlag(flags, FConst.Protected))
		{
			return ModifEnum.PROTECTED.value();
		}
		if (hasFlag(flags, FConst.Internal))
		{
			return ModifEnum.INTERNAL.value();
		}
		// default is public
		return ModifEnum.PUBLIC.value();
	}

	//*********** File listeners ****************************
	public void fileFolderCreated(FileEvent fe)
	{
		// Listen for changes
		String path = fe.getFile().getPath();
		log.debug("Folder created: " + path);
		FileUtil.addFileChangeListener(this, FileUtil.toFile(fe.getFile()));
	}

	public void fileDataCreated(FileEvent fe)
	{
		String path = fe.getFile().getPath();
		log.debug("File created: " + path);
		indexPod(path);
	}

	public void fileChanged(FileEvent fe)
	{
		String path = fe.getFile().getPath();
		log.debug("File changed: " + path);
		indexPod(path);
	}

	public void fileDeleted(FileEvent fe)
	{
		String path = fe.getFile().getPath();
		log.debug("File deleted: " + path);
		FanDocument.deleteForPath(null, path);
	}

	public void fileRenamed(FileRenameEvent fre)
	{
		// TODO: not sure if that's good
		FileObject src = (FileObject) fre.getSource();
		log.debug("File renamed: " + src.getPath() + " -> " + fre.getFile().getPath());
		FanDocument.renameDoc(src.getPath(), fre.getFile().getPath());
	}

	public void fileAttributeChanged(FileAttributeEvent fae)
	{
		// don't care
	}

	/*********************************************************************
	 *  Indexer Thread class
	 */
	class FanIndexerThread extends Thread implements Runnable
	{

		@Override
		public void run()
		{
			while (!shutdown)
			{
				try
				{
					sleep(1000);
				} catch (Exception e)
				{
				}
				;
				long now = new Date().getTime();
				for (String path : toBeIndexed.keySet())
				{
					Long l = toBeIndexed.get(path);
					// Hasn't changed in acouple seconds
					if (l.longValue() < now - 2000)
					{
						toBeIndexed.remove(path);
						index(path);
					}
				}
			}
		}
	}

	public static String getPodDoc(String podName)
	{
		Pod pod = Pod.find(podName);
		if (pod != null)
		{
			return fanDocToHtml(pod.doc());
		}
		return null;
	}

	public static String getDoc(FanType type)
	{
		Pod pod = Pod.find(type.getPod());
		Type t = pod.findType(type.getSimpleName());
		if (t != null)
		{
			return fanDocToHtml(t.doc());
		}
		return null;
	}

	/**
	 * Parse Fandoc text into HTML using fan's builtin parser.
	 * @param fandoc
	 * @return
	 */
	public static String fanDocToHtml(String fandoc)
	{
		if (fandoc == null)
		{
			return null;
		}
		FanPlatform platform = FanPlatform.getInstance(false);
		if (platform == null)
		{
			return fandoc;
		}
		String html = fandoc;
		try
		{
			FanObj parser = (FanObj) Type.find("fandoc::FandocParser").make();
			FanObj doc = (FanObj) parser.type().method("parseStr").call(parser, fandoc);
			Buf buf = Buf.make();
			FanObj writer = (FanObj) Type.find("fandoc::HtmlDocWriter").method("make").call(buf.out());
			doc.type().method("write").call(doc, writer);
			html = buf.flip().readAllStr();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		//System.out.println("Html doc: "+html);
		return html;
	}
}
