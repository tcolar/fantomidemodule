/*
 * Thibaut Colar Dec 18, 2009
 */

package net.colar.netbeans.fan.indexer.model;

import net.jot.persistance.JOTModel;
import net.jot.persistance.JOTModelMapping;

/**
 * Test
 * @author thibautc
 */
public class FanTypeModel extends JOTModel
{
	public String name="blah";

	@Override
	protected void customize(JOTModelMapping mapping)
	{
		mapping.defineFieldSize("name", 80);
	}
}
