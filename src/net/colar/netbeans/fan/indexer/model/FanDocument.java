/*
 * Thibaut Colar Dec 22, 2009
 */
package net.colar.netbeans.fan.indexer.model;

import java.util.Date;
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

	public String path = ""; // filesystem path
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
	
}
