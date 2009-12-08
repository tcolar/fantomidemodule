/*
 * Thibaut Colar Dec 3, 2009
 */
package net.colar.netbeans.fan.ast;

import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

/**
 * Parent class for scope vars (fields / methods etc..)
 * @author thibautc
 */
public class FanAstScopeVar
{

	protected String name;
	protected FanAstResolvedType type;
	protected ArrayList<FanAstScopeVar.modifs> modifiers = new ArrayList<FanAstScopeVar.modifs>();
	protected FanAstScope scope;
	protected CommonTree node;

	// Modifiers
	public enum modifs
	{

		PRIVATE, PROTECTED, INTERNAL, PUBLIC, STATIC
	}

	public FanAstScopeVar(FanAstScope scope, CommonTree node)
	{
		this.scope = scope;
		this.node = node;
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

	public ArrayList<FanAstScopeVar.modifs> getModifiers()
	{
		return modifiers;
	}

	public FanAstResolvedType getType()
	{
		return type;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(getClass().getSimpleName()).append(" :").append(name).append(" -> ").append(type.toString()).append(" [");
		for (FanAstScopeVar.modifs m : modifiers)
		{
			sb = sb.append(m.toString()).append(", ");
		}
		return sb.append("]").toString();
	}

	/**
	 * Reda modifier string and return enum type
	 * @param m
	 * @return
	 */
	public static modifs parseModifier(String m)
	{
		//TODO: const ?
		if (m.toLowerCase().equalsIgnoreCase("private"))
		{
			return modifs.PRIVATE;
		} else if (m.toLowerCase().equalsIgnoreCase("public"))
		{
			return modifs.PUBLIC;
		} else if (m.toLowerCase().equalsIgnoreCase("protected"))
		{
			return modifs.PROTECTED;
		} else if (m.toLowerCase().equalsIgnoreCase("internal"))
		{
			return modifs.INTERNAL;
		}
		else if (m.toLowerCase().equalsIgnoreCase("static"))
		{
			return modifs.STATIC;
		} else
		{
			System.out.println("Unrecognized modifier: " + m);
		}
		return null;
	}

	public boolean hasModifier(modifs modifier)
	{
		return modifiers.contains(modifier);
	}
}
