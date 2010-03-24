/*
 * Thibaut Colar Mar 22, 2010
 */

package net.colar.netbeans.fan.types;

import net.colar.netbeans.fan.indexer.model.FanType;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.jot.persistance.JOTTransaction;

/**
 * Special type to carry "null"
 * @author thibautc
 */
public class FanResolvedNullType extends FanResolvedType
{
	public FanResolvedNullType(AstNode node)
	{
		super(node, "null", new FanDummyType());
	}

}
