/*
 * Thibaut Colar Mar 22, 2010
 */

package net.colar.netbeans.fan.scope;

import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.types.FanResolvedType;

/**
 *
 * @author thibautc
 */
public class FanLocalScopeVar extends FanAstScopeVar
{
	public FanLocalScopeVar(AstNode node, VarKind kind, String name, FanResolvedType type)
	{
		super(node, kind, name, type);
	}
}
