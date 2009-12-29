/*
 * Thibaut Colar Dec 22, 2009
 */
package net.colar.netbeans.fan.indexer.model;

import java.util.Date;
import net.jot.logger.JOTLogger;
import net.jot.persistance.JOTModel;
import net.jot.persistance.JOTModelMapping;
import net.jot.persistance.JOTSQLCondition;
import net.jot.persistance.JOTTransaction;
import net.jot.persistance.builders.JOTQueryBuilder;

/**
 * DB model for a document (source)
 * @author thibautc
 */
public class FanDocument extends JOTModel
{

	/**
	 * Filesystem path
	 * Source path for sources
	 * LIBRARY/POD PATH for pods (libs)
	 */
	public String path = "";
	// source or binary/lib ?
	public Boolean isSource = true;
	public Long tstamp = new Date().getTime();

	@Override
	protected void customize(JOTModelMapping mapping)
	{
		mapping.defineFieldSize("path", 350);
	}

	public static FanDocument findOrCreateOne(JOTTransaction transaction, String path) throws Exception
	{
		JOTSQLCondition cond = new JOTSQLCondition("path", JOTSQLCondition.IS_EQUAL, path);
		FanDocument doc = (FanDocument) JOTQueryBuilder.selectQuery(transaction, FanDocument.class).where(cond).findOrCreateOne();
		return doc;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public String getPath()
	{
		return path;
	}

	public Long getTstamp()
	{
		return tstamp;
	}

	public void setTstamp(Long tstamp)
	{
		this.tstamp = tstamp;
	}

	public Boolean isSource()
	{
		return isSource;
	}

	public void setIsSource(Boolean isSource)
	{
		this.isSource = isSource;
	}

	public static void renameDoc(String oldPath, String newPath)
	{
		FanDocument doc = findByPath(oldPath);
		try
		{
			if (doc != null)
			{
				doc.setPath(newPath);
				doc.save();
			}
		} catch (Exception e)
		{
			JOTLogger.logException(FanDocument.class, "Failed renaming doc: " + oldPath, e);
		}
	}

	public static void deleteForPath(JOTTransaction trans, String path)
	{
		FanDocument doc = findByPath(path);
		try
		{
			if (doc != null)
			{
				doc.delete(trans);
			}
		} catch (Exception e)
		{
			JOTLogger.logException(FanDocument.class, "Failed deleting doc: " + path, e);
		}
	}

	@Override
	public void delete(JOTTransaction trans) throws Exception
	{
			FanType.deleteForDoc(trans, getId());
			delete(trans);
	}

	public static FanDocument findByPath(String path)
	{
		FanDocument result = null;
		try
		{
			JOTSQLCondition cond = new JOTSQLCondition("path", JOTSQLCondition.IS_EQUAL, path);
			result = (FanDocument) JOTQueryBuilder.selectQuery(null, FanDocument.class).where(cond).findOne();
		} catch (Exception e)
		{
			JOTLogger.logException(FanDocument.class, "Failed renaming doc: " + path, e);
		}
		return result;
	}
}
