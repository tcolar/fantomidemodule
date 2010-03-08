/*
 * Thibaut Colar Nov 24, 2009
 */
package net.colar.netbeans.fan.ast;

/**
 * Base object for scope.
 * @author thibautc
 */
/*@Deprecated
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

	public FanAstScope(FanAstScope parent)
	{
		this.parent = parent;
		//this.astNode = astNode;
	}

	public void dump()
	{
		FanUtilities.GENERIC_LOGGER.debug("Ast Scope Node: " + toString());
		for (FanAstScopeVarBase var : scopeVars.values())
		{
			FanUtilities.GENERIC_LOGGER.debug("Scope Var: " + var.toString());
		}
	}

	public FanAstScope getParent()
	{
		return parent;
	}

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

	public void addScopeVar(FanAstScopeVarBase var, boolean allowOverride)
	{
		FanUtilities.GENERIC_LOGGER.debug("Adding scope var: " + var);
		String name = var.getName();
		if (name.length() == 0)
		{
			return;
		}
		// Can't have duplicated slot name in scope no matter what
		if (hasScopevar(name))
		{
			//getRoot().addError("Duplicated name in scope: " + name, var.getNode());
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
					//getRoot().addError("Duplicated name: " + name, var.getNode());
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

	public FanResolvedType resolveVar(String varName)
	{
		if (varName == null)
		{
			return FanResolvedType.makeUnresolved();
		}
		FanAstScope scope = this;
		do
		{
			if (scope.hasScopevar(varName))
			{
				return scope.getScopeVar(varName).getType();
			}
			// if we get here, try in the type inheritance
			if (scope instanceof FanTypeScope)
			{
				Hashtable<String, FanSlot> table = ((FanTypeScope) scope).inheritedSlots;
				if (table.containsKey(varName))
				{
					return FanResolvedType.fromTypeSig(table.get(varName).getReturnedType());
				}
			}
			scope = scope.getParent();
		} while (scope != null);
		// Not found
		return FanResolvedType.makeUnresolved();
	}

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
			// add inherited slots
			if (scope instanceof FanTypeScope)
			{
				Hashtable<String, FanSlot> inhSlots = ((FanTypeScope) scope).getInheritedSlots();
				for (FanSlot slot : inhSlots.values())
				{
					if (!vars.containsKey(slot.getName()))
					{
						FanResolvedType type = FanResolvedType.fromTypeSig(slot.getReturnedType());
						FanAstScopeVarBase var= null; //new FanAstScopeVar(scope, astNode, slot.getName(), type);
						vars.put(slot.getName(), var);
					}
				}
			}
			scope = scope.getParent();
		}
		return vars.values();
	}

	public Collection<FanAstScopeVarBase> getScopeVars()
	{
		return scopeVars.values();
	}

	protected abstract void parse();

	public FanTypeScope getTypeScope()
	{
		return (FanTypeScope) findParentScopByType(FanTypeScope.class);
	}

	public FanAstScope findParentScopByType(Class type)
	{
		FanAstScope tscope = this;
		while (tscope != null && !(tscope.getClass() == type))
		{
			tscope = tscope.getParent();
		}
		return tscope;
	}
}*/
