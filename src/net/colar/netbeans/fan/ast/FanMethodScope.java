/*
 * Thibaut Colar Dec 9, 2009
 */
package net.colar.netbeans.fan.ast;

import net.colar.netbeans.fan.scope.FanAstScopeVar;
import java.util.Hashtable;
import net.colar.netbeans.fan.types.FanResolvedType;
import org.antlr.runtime.tree.CommonTree;

/**
 * Scope for a method
 * @author thibautc
 */
/*@Deprecated
public class FanMethodScope extends FanBlockScope
{
	private final FanAstMethod methodSlot;

	public FanMethodScope(FanAstScope parent, FanAstMethod methodSlot)
	{
		super(null);
		this.methodSlot=methodSlot;
	}

	@Override
	protected void parse()
	{
		CommonTree node=getAstNode();
		//System.out.println(getClass().getName()+" -> "+node.toStringTree());
		//This is mostly a regular codeBlock but we need to add the method params as scope variables
		Hashtable<String, FanResolvedType> params = methodSlot.getParameters();
		for(String name : params.keySet())
		{
			FanResolvedType type = params.get(name);
			FanAstScopeVar var = null;//new FanAstScopeVar(this, node, name, type);
			addScopeVar(var, true);
		}
		// Do normal code block parsing
		super.parse();
	}
}*/
