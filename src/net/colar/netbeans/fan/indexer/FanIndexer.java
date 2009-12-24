/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.NBFanParser;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.ast.FanAstResolvedType;
import net.colar.netbeans.fan.ast.FanAstScope;
import net.colar.netbeans.fan.ast.FanAstScopeVarBase;
import net.colar.netbeans.fan.ast.FanRootScope;
import net.colar.netbeans.fan.ast.FanTypeScope;
import net.colar.netbeans.fan.indexer.model.FanDocUsing;
import net.colar.netbeans.fan.indexer.model.FanDocument;
import net.colar.netbeans.fan.indexer.model.FanSlot;
import net.colar.netbeans.fan.indexer.model.FanType;
import net.colar.netbeans.fan.indexer.model.FanTypeInheritance;
import net.jot.logger.JOTLoggerLocation;
import net.jot.persistance.JOTModel;
import net.jot.persistance.JOTSQLCondition;
import net.jot.persistance.JOTTransaction;
import net.jot.persistance.builders.JOTQueryBuilder;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.indexing.Context;
import org.netbeans.modules.parsing.spi.indexing.CustomIndexer;
import org.netbeans.modules.parsing.spi.indexing.Indexable;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 *
 * Update: Will not be using lucerne anymore ...
 *
 * Index parsed files (used later for completion etc...)
 * I feel like it's not right to have the item data encoded into a string
 * This should probably be backed by a JavaDB instead ... but whatever
 * @author tcolar
 */
public class FanIndexer extends CustomIndexer
{

	JOTLoggerLocation log = new JOTLoggerLocation(getClass());

	public FanIndexer()
	{
		super();
	}

	@Override
	protected void index(Iterable<? extends Indexable> iterable, Context context)
	{
		for (Indexable indexable : iterable)
		{
			index(indexable.getURL().getPath());
		}
	}

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
		parser.parse(snapshot);
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
		indexDoc(path, fanResult.getRootScope());
	}

	/**
	 * Index the document in the DB, using the root scope.
	 * @param doc
	 * @param indexable
	 * @param rootScope
	 */
	public void indexDoc(String path, FanRootScope rootScope)
	{
		//TODO: does this need to be synchronized or is NB taking care of that ?
		JOTTransaction transaction = null;
		try
		{
			transaction = new JOTTransaction("default");
			if (rootScope != null)
			{
				// create / update the doument
				FanDocument doc = FanDocument.findOrCreateOne(transaction, path);
				if (doc.isNew())
				{
					doc.setPath(path);
					doc.setTstamp(new Date().getTime());
					doc.save(transaction);
				}

				// Update the  "using" / try to be smart as to not delete / recreate all everytime.
				Vector<FanDocUsing> usings = FanDocUsing.findAllForDoc(transaction, doc.getId());
				Vector<FanType> types = FanType.findAllForDoc(transaction, doc.getId());
				Vector<Long> inh2Delete = new Vector<Long>();

				Vector<String> addedUsings = new Vector();
				for (FanAstResolvedType type : rootScope.getUsing().values())
				{
					String sig = type.getTypeText();
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
							using.save(transaction);
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
						FanType dbType = (FanType) JOTQueryBuilder.selectQuery(transaction, FanType.class).where(cond).findOrCreateOne();
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
						dbType.setIsNative(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.NATIVE));
						dbType.setIsOverride(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.OVERRIDE));
						dbType.setIsReadonly(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.READONLY));
						dbType.setIsStatic(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.STATIC));
						dbType.setIsVirtual(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.VIRTUAL));
						dbType.setQualifiedName(typeScope.getQName());
						dbType.setSimpleName(typeScope.getName());
						dbType.setPod(typeScope.getPod());
						dbType.setProtection(typeScope.getProtection());

						dbType.save(transaction);

						// Try to reuse existing db entries.
						Vector<FanTypeInheritance> currentInh = FanTypeInheritance.findAllForMainType(transaction, typeScope.getQName());
						for (FanAstResolvedType item : typeScope.getInheritedItems())
						{
							String mainType = typeScope.getQName();
							String inhType = item.getTypeText();
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
								inh.save(transaction);
							}
						}
						// Whatever wasn't removed from the vector is not needed anymore.
						for (FanTypeInheritance inh : currentInh)
						{
							inh2Delete.add(inh.getId());
						}
						// TODO: Do the slots.

						/*Collection<FanAstScopeVarBase> vars = child.getScopeVars();
						for (FanAstScopeVarBase slot : vars)
						{
						if (slot instanceof FanAstMethod)
						{
						}
						// otherwise it's a field, nothing to do with it
						}*/
					}
				}
				// Only commit if everything went well.
				transaction.commit();

				// the delete can be done now.
				// remove old usings
				for (FanDocUsing using : usings)
				{
					using.delete();
				}
				// old inherited types
				for(Long inh : inh2Delete)
				{
					JOTQueryBuilder.deleteByID(null, FanTypeInheritance.class, inh);
				}
				// remove old types
				for (FanType t : types)
				{
					JOTTransaction trans = new JOTTransaction(JOTModel.DEFAULT_STORAGE);
					// delete associated inheroted types
					String name = t.getQualifiedName();
					JOTSQLCondition cond = new JOTSQLCondition("mainType", JOTSQLCondition.IS_EQUAL, name);
					JOTQueryBuilder.deleteQuery(trans, FanTypeInheritance.class).where(cond).delete();
					// delete main type
					t.delete(trans);
					trans.commit();
				}
			}

		} catch (Exception e)
		{
			log.exception("Indexing of: " + path, e);
			try
			{
				if (transaction != null)
				{
					log.info("Rolling back failed indexing of: " + path);
					transaction.rollBack();
				}
			} catch (Exception e2)
			{
				log.exception("Indexing rollback failed for: " + path, e);
			}
		}
	}
}
