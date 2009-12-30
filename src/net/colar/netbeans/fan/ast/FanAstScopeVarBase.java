/*
 * Thibaut Colar Dec 3, 2009
 */
package net.colar.netbeans.fan.ast;

import java.util.ArrayList;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.indexer.FanResolvedType;
import org.antlr.runtime.tree.CommonTree;

/**
 * Base class for scope vars (fields / methods etc..)
 * @author thibautc
 */
public abstract class FanAstScopeVarBase
{

	protected String name;
	// The type of the field / or returned type for a method
	protected FanResolvedType type = FanResolvedType.makeUnresolved();
	protected ArrayList<FanAstScopeVarBase.ModifEnum> modifiers = new ArrayList<FanAstScopeVarBase.ModifEnum>();
	protected FanAstScope scope;
	protected CommonTree node;

	// Modifiers
	public enum ModifEnum
	{
		PRIVATE(1), PROTECTED(2), INTERNAL(3), PUBLIC(4), STATIC(5), CONST(6),
		ABSTRACT(7), NATIVE(8), OVERRIDE(9), VIRTUAL(10), READONLY(11), ONCE(12),
		FINAL (13);
		int val;
		ModifEnum(int i)
		{
			val=i;
		}
		public int value() {return val;}
	}

	public FanAstScopeVarBase(FanAstScope scope, CommonTree node)
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

	public ArrayList<FanAstScopeVarBase.ModifEnum> getModifiers()
	{
		return modifiers;
	}

	public FanResolvedType getType()
	{
		return type;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(getClass().getSimpleName()).append(" :").append(name).append(" -> ").append(type.toString()).append(" [");
		for (FanAstScopeVarBase.ModifEnum m : modifiers)
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
	public static ModifEnum parseModifier(String m)
	{
		//TODO: const ?
		if (m.toLowerCase().equalsIgnoreCase("private"))
		{
			return ModifEnum.PRIVATE;
		} else if (m.toLowerCase().equalsIgnoreCase("public"))
		{
			return ModifEnum.PUBLIC;
		} else if (m.toLowerCase().equalsIgnoreCase("protected"))
		{
			return ModifEnum.PROTECTED;
		} else if (m.toLowerCase().equalsIgnoreCase("internal"))
		{
			return ModifEnum.INTERNAL;
		} else if (m.toLowerCase().equalsIgnoreCase("const"))
		{
			return ModifEnum.CONST;
		} else if (m.toLowerCase().equalsIgnoreCase("static"))
		{
			return ModifEnum.ONCE;
		} else if (m.toLowerCase().equalsIgnoreCase("once"))
		{
			return ModifEnum.STATIC;
		} else if (m.toLowerCase().equalsIgnoreCase("abstract"))
		{
			return ModifEnum.ABSTRACT;
		} else if (m.toLowerCase().equalsIgnoreCase("native"))
		{
			return ModifEnum.NATIVE;
		} else if (m.toLowerCase().equalsIgnoreCase("override"))
		{
			return ModifEnum.OVERRIDE;
		} else if (m.toLowerCase().equalsIgnoreCase("readonly"))
		{
			return ModifEnum.READONLY;
		} else if (m.toLowerCase().equalsIgnoreCase("virtual"))
		{
			return ModifEnum.VIRTUAL;
		} else if (m.toLowerCase().equalsIgnoreCase("final"))
		{
			return ModifEnum.FINAL;
		} else
		{
			FanUtilities.GENERIC_LOGGER.info("Unrecognized modifier: " + m);
			//throw new RuntimeException();
		}
		return null;
	}

	public boolean hasModifier(ModifEnum modifier)
	{
		return modifiers.contains(modifier);
	}

	public int getProtection()
	{
		if (hasModifier(ModifEnum.PRIVATE))
		{
			return ModifEnum.PRIVATE.value();
		}
		if (hasModifier(ModifEnum.PROTECTED))
		{
			return ModifEnum.PROTECTED.value();
		}
		if (hasModifier(ModifEnum.INTERNAL))
		{
			return ModifEnum.INTERNAL.value();
		}
		// default is public
		return ModifEnum.PUBLIC.value();
	}

}
