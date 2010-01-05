package net.colar.netbeans.fan.indexer;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.ast.FanAstScopeVarBase.ModifEnum;
import net.colar.netbeans.fan.ast.FanTypeScope;
import net.colar.netbeans.fan.indexer.model.FanDocument;
import net.colar.netbeans.fan.indexer.model.FanType;
import net.jot.logger.JOTLoggerLocation;
import net.jot.persistance.JOTSQLCondition;
import net.jot.persistance.builders.JOTQueryBuilder;
import org.netbeans.api.java.platform.JavaPlatform;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.filesystems.FileUtil;

/**
 * ??TODO: do the file listnere to listen to jars changes and new/chnaged jars in Fantom lib folder. (and jdk ?? -> no, tsratup only)
 *
 * Index java jars - used through FanIndexer
 * @author tcolar
 */
public class FanJarsIndexer implements FileChangeListener
{

	public static final String UNRESOLVED_TYPE = "!!UNRESOLVED!!";
	private final static Pattern CLOSURECLASS = Pattern.compile(".*?\\$\\d+\\z");
	static JOTLoggerLocation log = new JOTLoggerLocation(FanIndexer.class);
	public static volatile boolean shutdown = false;
	Hashtable<String, Long> toBeIndexed = new Hashtable<String, Long>();
	private FanJavaClassLoader cl;
	// temp.
	private ArrayList<String> classes = new ArrayList<String>();
	// In memory caches
	private List<String> packagesCache = new ArrayList<String>();
	private Hashtable<String, Class> classesCache = new Hashtable<String, Class>();

	public FanJarsIndexer()
	{
	}

	public void indexJars(boolean runInBackground)
	{
		long then = new Date().getTime();
		cl = new FanJavaClassLoader();
		classes.clear();
		FanJarsIndexerThread thread = new FanJarsIndexerThread();
		thread.start();
		if (!runInBackground)
		{
			thread.waitFor();
		}
		long now = new Date().getTime();
		log.info("Fantom Jars Parsing completed in " + (now - then) + " ms.");
	}

	private void indexJar(String j)
	{
		boolean success = false;
		log.info("Indexing jar: " + j);
		if (j.toLowerCase().endsWith(".jar"))
		{
			FanDocument doc = null;
			try
			{
				// create the doc
				doc = FanDocument.findOrCreateOne(null, j);
				if (doc.isNew())
				{
					doc.setPath(j);
					doc.setTstamp(new Date().getTime());
					doc.setIsSource(false);
					doc.save();
				}

				JarFile jar = new JarFile(j);

				Enumeration<JarEntry> jarEntries = jar.entries();
				while (jarEntries.hasMoreElements())
				{
					JarEntry entry = jarEntries.nextElement();
					String ename = entry.getName();
					if (ename.toLowerCase().endsWith(".class"))
					{
						String cname = ename.substring(0, ename.length() - 6).replaceAll(File.separator, ".");
						try
						{
							//System.out.println("cname: " + cname);
							// trying to findclass same class twice = no good !
							// also not bothering with sun internal classes
							if (!classes.contains(cname)
									&& !cname.startsWith("org.eclipse.swt.internal.")
									&& !cname.startsWith("sun.")
									&& !cname.startsWith("com.sun."))
							{

								Class c = findClass(cname);
								if (c != null)
								{
									classes.add(cname);
									indexClass(doc, c);
								}
							}
						} catch (Exception ce)
						{
							FanUtilities.GENERIC_LOGGER.exception("Error indexing jar", ce);
						}
					}
				}
				//TODO: delete outdated types (timestamp) ?
			} catch (Exception e)
			{
				log.exception("Jar indexing error", e);
				if (doc != null)
				{
					try
					{
						// Invalidate the doc
						doc.setTstamp(0L);
						doc.delete();
					} catch (Exception e2)
					{
					}
				}
				;
			}
		}
	}

	private Class findClass(String name) throws ClassNotFoundException
	{
		// Try Fan classloader first (Fan classes)
		Class c = null;
		try
		{
			c = cl.find(name);
		} catch (NoClassDefFoundError e)
		{
		} catch (ClassNotFoundException e)
		{
		}
		if (c == null)
		{
			// try standard class loader (java)
			try
			{
				c = getClass().getClassLoader().loadClass(name);
			} catch (NoClassDefFoundError e)
			{
			} catch (ClassNotFoundException e)
			{
			}
		}
		if (c == null)
		{
			throw (new ClassNotFoundException("Class not found: " + name));
		}
		return c;
	}

	public static void shutdown()
	{
		shutdown = true;
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
		indexJar(
				path);
	}

	public void fileChanged(FileEvent fe)
	{
		String path = fe.getFile().getPath();
		log.debug("File changed: " + path);
		indexJar(
				path);
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

	/**
	 * Places we are going to look for jars at.
	 * @return
	 */
	public List<URL> getJarPaths()
	{
		ArrayList<URL> urls = new ArrayList<URL>();
		// adding Fan jars
		URL[] fanUrls = FanJavaClassLoader.getExtUrls();
		for (URL url : fanUrls)
		{
			urls.add(url);
		}
		// JVM cp
		String javaHome = JavaPlatform.getDefault().getSystemProperties().get("java.home");
		String lib = javaHome + File.separator + "lib" + File.separator;
		String[] cps = JavaPlatform.getDefault().getSystemProperties().get("sun.boot.class.path").split(File.pathSeparator);
		for (String cp : cps)
		{
			String f = new File(cp).getName();
			File file = new File(f);
			// skip those large resources jars to save time.
			if (f.equals("deploy.jar") || f.equals("charsets.jar") || f.equals("javaws.jar"))
			{
				continue;
			} //System.out.println("jbcp: " + cp);
			try
			{
				urls.add(new URL("file://" + cp));
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		// use lib/rt.jar as the backup
		if (cps.length == 0)
		{
			String cp = lib + "rt.jar";
			FanUtilities.GENERIC_LOGGER.debug("jrtcp: " + cp);
			try
			{
				urls.add(new URL("file://" + cp));
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		// jvm lib/ext/*
		File[] ext = new File(lib + "ext").listFiles();
		for (File jar : ext)
		{
			//System.out.println("jecp: " + jar.getAbsolutePath());
			try
			{
				urls.add(new URL("file://" + jar.getAbsolutePath()));
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		return urls;
	}

	private void indexClass(FanDocument doc, Class c)
	{
		String pack = c.getPackage().getName();
		String qname = c.getName();
		String name = c.getSimpleName();
		try
		{
			log.info("Indexing class: " + c.getName());

			Vector<FanType> types = FanType.findAllForDoc(null, doc.getId());

			// Skipping "internal" classes - closures and the likes
			// synthetic means generated by compiler
			if (c.isSynthetic() || CLOSURECLASS.matcher(c.getName()).matches())
			{
				return;
			}

			JOTSQLCondition cond = new JOTSQLCondition("qualifiedName", JOTSQLCondition.IS_EQUAL, qname);
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
			int flags = c.getModifiers();
			dbType.setDocumentId(doc.getId());
			dbType.setKind(getKind(c));
			dbType.setIsAbstract(Modifier.isAbstract(flags));
			dbType.setIsConst(Modifier.isFinal(flags) && Modifier.isStatic(flags));
			dbType.setIsFinal(Modifier.isFinal(flags));
			dbType.setQualifiedName(qname);
			dbType.setSimpleName(name);
			dbType.setPod(pack);
			dbType.setProtection(getProtection(flags));
			dbType.setIsFromSource(false);

			dbType.save();
			// Slots
			// Try to reuse existing db entries.
			/*Vector<FanSlot> currentSlots = FanSlot.findAllForType(dbType.getId());
			Vector<Member> slots = new Vector();
			slots.addAll(Arrays.asList(c.getDeclaredFields()));
			slots.addAll(Arrays.asList(c.getDeclaredMethods()));
			slots.addAll(Arrays.asList(c.getDeclaredConstructors()));
			// TODO: deal with annotations ?
			//slots.addAll(Arrays.asList(c.getDeclaredAnnotations()));
			for (Member slot : slots)
			{
				// determine kind of slot
				FanModelConstants.SlotKind kind = FanModelConstants.SlotKind.FIELD;
				Class<?> retType = null;
				if (slot instanceof Field)
				{
					kind = FanModelConstants.SlotKind.FIELD;
					retType = ((Field) slot).getType();
				} else if (slot instanceof Constructor)
				{
					retType = c.getClass();
					kind = FanModelConstants.SlotKind.CTOR;
				} else if (slot instanceof Method)
				{
					retType = ((Method) slot).getReturnType();
					kind = FanModelConstants.SlotKind.METHOD;
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
				int sflags = slot.getModifiers();
				dbSlot.setTypeId(dbType.getId());
				dbSlot.setSlotKind(kind.value());
				dbSlot.setReturnedType(retType.getName());
				dbSlot.setName(slot.getName());
				dbSlot.setIsAbstract(Modifier.isAbstract(sflags));
				dbSlot.setIsNative(Modifier.isNative(sflags));
				// N/A
				dbSlot.setIsOverride(false);
				dbSlot.setIsStatic(Modifier.isStatic(sflags));
				// java always true
				dbSlot.setIsVirtual(true);
				dbSlot.setIsConst(Modifier.isStatic(sflags) && Modifier.isFinal(sflags));
				dbSlot.setProtection(getProtection(sflags));
				// java always nullable
				dbSlot.setIsNullable(true);

				dbSlot.save();
//TODO: CTOR too !
				// deal with parameters of method/ctor
				if (slot instanceof Method)
				{

					Method method = (Method) slot;
					TypeVariable<Method>[] parameters = method.getTypeParameters();
					// Try to reuse existing db entries.
					Vector<FanMethodParam> currentParams = FanMethodParam.findAllForSlot(dbSlot.getId());
					for (TypeVariable<Method> param : parameters)
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
						dbParam.setSlotId(dbSlot.getId());
						dbParam.setName(param.getName());
						dbParam.setQualifiedType((param.getBounds()[0]).toString());
						// always true for java
						dbParam.setIsNullable(true);
						// always false for java
						dbParam.setHasDefault(false);

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
*/
		} catch (Exception e)
		{
			log.exception("Indexing failed for: " + c, e);
			try
			{
				// remove broken enrty, will try again next time
				if (doc != null)
				{
					doc.delete();
				}
			} catch (Exception e2)
			{
				log.exception("Indexing 'rollback' failed for: " + c, e);
			}
		}
		finally
		{
			// cache is dirty.
			packagesCache.clear();
			classesCache.clear();
		}
	}

	private int getKind(Class c)
	{
		if (c.isInterface())
		{
			return FanTypeScope.TypeKind.JAVA_INTERFACE.value();
		}
		if (c.isAnnotation())
		{
			return FanTypeScope.TypeKind.JAVA_ANNOTATION.value();
		}
		if (c.isEnum())
		{
			return FanTypeScope.TypeKind.JAVA_ENUM.value();
		}
		// class is default
		return FanTypeScope.TypeKind.JAVA_CLASS.value();
	}

	private int getProtection(int flags)
	{
		if (Modifier.isPrivate(flags))
		{
			return ModifEnum.PRIVATE.value();
		}
		if (Modifier.isProtected(flags))
		{
			return ModifEnum.PROTECTED.value();
		}
		if (Modifier.isPublic(flags))
		{
			return ModifEnum.PUBLIC.value();
		}
		// default is package private
		return ModifEnum.INTERNAL.value();
	}

	/*********************************************************************
	 *  Indexer Thread class
	 */
	class FanJarsIndexerThread extends Thread implements Runnable
	{

		volatile boolean done = false;

		@Override
		public void run()
		{
			done = false;
			try
			{
				for (URL url : getJarPaths())
				{
					if (shutdown)
					{
						break;
					}
					String file = url.getFile();
					if (file.toLowerCase().endsWith(".jar"))
					{
						// boot clasppath lists sme jars that do not necerally exists (optional)
						File jar = new File(file);
						if (jar.exists())
						{
							FanUtilities.GENERIC_LOGGER.debug("Indexing jar:  " + jar);
							// listen to changes
							FileUtil.addFileChangeListener(FanJarsIndexer.this, jar);
							// index the pods if not up to date
							String path = jar.getAbsolutePath();
							if (FanIndexer.checkIfNeedsReindexing(path, jar.lastModified()))
							{
								indexJar(path);
							}
						}
					}
				}
			} catch (Throwable t)
			{
				log.exception("Pod indexing thread error", t);
			}

			done = true;
		}

		protected void waitFor()
		{
			while (!done)
			{
				try
				{
					sleep(50);
				} catch (Exception e)
				{
				}
			}
		}
	}
}
