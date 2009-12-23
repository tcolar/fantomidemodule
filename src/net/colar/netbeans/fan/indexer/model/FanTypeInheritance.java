/*
 * Thibaut Colar Dec 22, 2009
 */

package net.colar.netbeans.fan.indexer.model;

import net.jot.persistance.JOTModel;
import net.jot.persistance.JOTModelMapping;

/**
 * DB model for a Type inherance
 * @author thibautc
 */
public class FanTypeInheritance extends JOTModel
{
	public String mainType = ""; // fully qualified
	public String inheritedType = ""; // fully qualified

	@Override
	protected void customize(JOTModelMapping mapping)
	{
		mapping.defineFieldSize("inheritedType", 255);
		mapping.defineFieldSize("mainType", 255);
	}

	public String getInheritedType()
	{
		return inheritedType;
	}

	public void setInheritedType(String inheritedType)
	{
		this.inheritedType = inheritedType;
	}

	public String getMainType()
	{
		return mainType;
	}

	public void setMainType(String mainType)
	{
		this.mainType = mainType;
	}

	
}
