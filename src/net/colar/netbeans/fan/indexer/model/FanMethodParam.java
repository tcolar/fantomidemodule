/*
 * Thibaut Colar Dec 22, 2009
 */

package net.colar.netbeans.fan.indexer.model;

import java.util.Vector;
import net.jot.persistance.JOTModel;
import net.jot.persistance.JOTModelMapping;
import net.jot.persistance.JOTSQLCondition;
import net.jot.persistance.builders.JOTQueryBuilder;

/**
 * DB model for a method/constructor parameters
 * @author thibautc
 */
public class FanMethodParam extends JOTModel
{

	public Long slotId = -1L;
	public String name = "";
	public String qualifiedType = ""; // qualified type of the parameter
	public boolean isNullable = false;

	@Override
	protected void customize(JOTModelMapping mapping)
	{
		mapping.defineFieldSize("qualifiedType", 255);
		mapping.defineFieldSize("name", 80);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getQualifiedType()
	{
		return qualifiedType;
	}

	public void setQualifiedType(String qualifiedType)
	{
		this.qualifiedType = qualifiedType;
	}

	public long getSlotId()
	{
		return slotId;
	}

	public void setSlotId(long slotId)
	{
		this.slotId = slotId;
	}

	public boolean isNullable()
	{
		return isNullable;
	}

	public void setIsNullable(boolean isNullable)
	{
		this.isNullable = isNullable;
	}


	public static Vector<FanMethodParam> findAllForSlot(long id)
	{
		try
		{
			JOTSQLCondition cond = new JOTSQLCondition("slotId", JOTSQLCondition.IS_EQUAL, id);
			return (Vector<FanMethodParam>)JOTQueryBuilder.selectQuery(null, FanMethodParam.class).where(cond).find().getAllResults();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
}
