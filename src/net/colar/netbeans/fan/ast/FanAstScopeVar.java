/*
 * Thibaut Colar Dec 3, 2009
 */

package net.colar.netbeans.fan.ast;

import org.antlr.runtime.tree.CommonTree;

/**
 * Parent class for scope vars (fields / methods etc..)
 * @author thibautc
 */
public class FanAstScopeVar
{
	protected String name;
	protected FanAstScope scope;
	protected CommonTree node;

	// Modifiers
	public enum modifs{PRIVATE,PROTECTED,INTERNAL,PUBLIC}

	public FanAstScopeVar(FanAstScope scope, CommonTree node)
	{
		this.scope=scope;
		this.node=node;
	}

	public String getName()
	{
		return name;
	}

	public CommonTree getNode()
	{
		return node;
	}

	public FanAstScope getScope()
	{
		return scope;
	}

	/**
	 * Reda modifier string and return enum type
	 * @param m
	 * @return
	 */
	public static modifs parseModifier(String m)
	{
		//TODO: const ?
		if(m.toLowerCase().equalsIgnoreCase("private"))
			return modifs.PRIVATE;
		else if(m.toLowerCase().equalsIgnoreCase("public"))
			return modifs.PUBLIC;
		else if(m.toLowerCase().equalsIgnoreCase("protected"))
			return modifs.PROTECTED;
		else if(m.toLowerCase().equalsIgnoreCase("internal"))
			return modifs.INTERNAL;
		else
			System.out.println("Unrecognized modifier: "+m);
		return null;
	}
}
