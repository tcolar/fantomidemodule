/*
 * Thibaut Colar Dec 9, 2009
 */

package net.colar.netbeans.fan.ast;

import org.antlr.runtime.tree.CommonTree;

/**
 * "Standard" scope variable
 * @author thibautc
 */
public class FanAstScopeVar extends FanAstScopeVarBase
{

	public FanAstScopeVar(FanAstScope scope, CommonTree node, String name, FanAstResolvResult type)
	{
		super(scope, node);
		super.name=name;
		super.type=type;
	}
}
