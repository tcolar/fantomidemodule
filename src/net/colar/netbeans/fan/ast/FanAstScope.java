/*
 * Thibaut Colar Nov 24, 2009
 */
package net.colar.netbeans.fan.ast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import org.antlr.runtime.tree.CommonTree;

/**
 * Base object for scope.
 * @author thibautc
 */
public abstract class FanAstScope
{
	// the AST node this scope is for

	private CommonTree astNode = null;
	// parent scope -> If root scope: null
	private FanAstScope parent = null;
	// Lits of defined/named items in this (local) scope
	private Hashtable<String, FanAstScopeVarBase> scopeVars = new Hashtable<String, FanAstScopeVarBase>();
	// root scope of the tree - lazy inited
	private FanRootScope root;
	// Node childs
	private List<FanAstScope> children = new ArrayList<FanAstScope>();

	public FanAstScope(FanAstScope parent, CommonTree astNode)
	{
		this.parent = parent;
		this.astNode = astNode;
	}

	public void dump()
	{
		System.out.println("Ast Scope Node: " + toString());
		for (FanAstScopeVarBase var : scopeVars.values())
		{
			System.out.println("Scope Var: " + var.toString());
		}
	}

	public FanAstScope getParent()
	{
		return parent;
	}

	/**
	 * Return the root node .. lazily cached
	 * @return
	 */
	public FanRootScope getRoot()
	{
		if (root == null)
		{
			synchronized (this)
			{
				FanAstScope current = this;
				while (current.parent != null)
				{
					current = current.getParent();
				}
				root = (FanRootScope) current;
			}
		}
		return root;
	}

	/**
	 * If allowOverride is false and the name is duplicated, it will shiw an error
	 * @param slot
	 * @param allowOverride
	 */
	public void addScopeVar(FanAstScopeVarBase var, boolean allowOverride)
	{
		//System.out.println("Adding scope var: " + var);
		String name = var.getName();
		// Can't have duplicated slot name in scope no matter what
		if(hasScopevar(name))
		{
			getRoot().addError("Duplicated name in scope: " + name, var.getNode());
			return;
		}
		// check for duplicate name in parent scope if !oallowOverride
		if (!allowOverride)
		{
			FanAstScope scope = this;
			while (scope != null)
			{
				if (scope.hasScopevar(name))
				{
					getRoot().addError("Duplicated name: " + name, var.getNode());
					return;
				}
				scope = scope.getParent();
			}
		}

		//TODO: check inherited(type) vars (slots) using allowOverride
		scopeVars.put(name, var);
	}

	public boolean hasScopevar(String name)
	{
		return scopeVars.containsKey(name);
	}

	public FanAstScopeVarBase getScopeVar(String name)
	{
		return scopeVars.get(name);
	}

	public CommonTree getAstNode()
	{
		return astNode;
	}

	public List<FanAstScope> getChildren()
	{
		return children;
	}

	public void addChild(FanAstScope child)
	{
		children.add(child);
	}

	FanAstResolvedType resolveVar(String type)
	{
		if (type == null)
		{
			return FanAstResolvedType.makeUnresolved();
		}
		FanAstScope scope = this;
		do
		{
			if (scope.hasScopevar(type))
			{
				return scope.getScopeVar(type).getResolvedType();
			}
			scope = scope.getParent();
		} while (scope != null);
		// Not found
		return FanAstResolvedType.makeUnresolved();
	}

	/**
	 * return all the vars defined in this scope and all the parent scopes
	 * Note: If a var is overriden only return the one from the narrowest scope
	 */
	public Collection<FanAstScopeVarBase> getScopeVarsRecursive()
	{
		Hashtable<String, FanAstScopeVarBase> vars = new Hashtable<String, FanAstScopeVarBase>();
		FanAstScope scope = this;
		while (scope != null)
		{
			for (FanAstScopeVarBase var : scope.getScopeVars())
			{
				if (!vars.containsKey(var.getName()))
				{
					vars.put(var.getName(), var);
				}
			}
			scope = scope.getParent();
		}
		return vars.values();
	}

	/**
	 * Return the vars defined in this scope
	 */
	public Collection<FanAstScopeVarBase> getScopeVars()
	{
		return scopeVars.values();
	}

	protected abstract void parse();
}
