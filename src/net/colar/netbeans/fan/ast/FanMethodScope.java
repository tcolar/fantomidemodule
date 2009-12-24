/*
 * Thibaut Colar Dec 9, 2009
 */
package net.colar.netbeans.fan.ast;

import java.util.Hashtable;
import org.antlr.runtime.tree.CommonTree;

/**
 * Scope for a method
 * @author thibautc
 */
public class FanMethodScope extends FanBlockScope
{
	private final FanAstMethod methodSlot;

	public FanMethodScope(FanAstScope parent, FanAstMethod methodSlot)
	{
		super(parent, methodSlot.getNode());
		this.methodSlot=methodSlot;
	}

	@Override
	protected void parse()
	{
		CommonTree node=getAstNode();
		//System.out.println(getClass().getName()+" -> "+node.toStringTree());
		//This is mostly a regular codeBlock but we need to add the method params as scope variables
		Hashtable<String, FanAstResolvResult> params = methodSlot.getParameters();
		for(String name : params.keySet())
		{
			FanAstResolvResult type = params.get(name);
			FanAstScopeVar var = new FanAstScopeVar(this, node, name, type);
			addScopeVar(var, true);
		}
		// Do normal code block parsing
		super.parse();
	}
}
