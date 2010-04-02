/*
 * Thibaut Colar Apr 2, 2010
 */
package net.colar.netbeans.fan.scope;

import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.types.FanResolvedType;

/**
 *
 * @author thibautc
 */
public class FanScopeMethodParam
{

	private final AstNode defaultValNode;
	private FanResolvedType type;

	public FanScopeMethodParam(FanResolvedType type, AstNode defaultValNode)
	{
		this.defaultValNode = defaultValNode;
		this.type = type;
	}

	public AstNode getDefaultValNode()
	{
		return defaultValNode;
	}

	public FanResolvedType getType()
	{
		return type;
	}

	public boolean hasDefaultValue()
	{
		return defaultValNode != null;
	}
}
