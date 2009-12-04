/*
 * Thibaut Colar Nov 24, 2009
 */
package net.colar.netbeans.fan.ast;

import java.util.Hashtable;

/**
 * Base object for scope.
 * @author thibautc
 */
public abstract class FanAstScope
{
	// parent scope -> If root scope: null
	private FanAstScope parent = null;
	// Lits of defined/named items in this (local) scope
	private Hashtable<String, FanAstScopeVar> scopeVars = new Hashtable<String, FanAstScopeVar>();

	public FanAstScope(FanAstScope parent)
	{
		this.parent = parent;
	}

	public void dump()
	{
		System.out.println("Ast Scope Node: " + toString());
		for(FanAstScopeVar var : scopeVars.values())
		{
			System.out.println("Scope Var: " + var.toString());
		}
	}

	public FanAstScope getParent()
	{
		return parent;
	}

	/**
	 * Return the root node
	 * @return
	 */
	public FanRootScope getRoot()
	{
		FanAstScope current = this;
		while (current.parent != null)
		{
			current = current.getParent();
		}
		return (FanRootScope) current;
	}

	/**
	 * If allowOverride is false and the name is duplicated, it will shiw an error
	 * @param slot
	 * @param allowOverride
	 */
	public void addScopeVar(FanAstScopeVar var, boolean allowOverride)
	{
		String name = var.getName();
		// Can't have duplicated slot name in scope no matter what ?
		FanAstScope scope = this;
		while ((scope = scope.getParent()) != null)
		{
			if (scope.hasScopevar(name))
			{
				getRoot().addError("Duplicated slot name: " + name, var.getNode());
				return;
			}
		}
		//TODO: check inherited(type) vars (slots)
		scopeVars.put(name, var);
	}

	public boolean hasScopevar(String name)
	{
		return scopeVars.containsKey(name);
	}

	public FanAstScopeVar getScopeVar(String name)
	{
		return scopeVars.get(name);
	}
}
