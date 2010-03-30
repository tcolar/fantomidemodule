/*
 * Thibaut Colar Mar 22, 2010
 */
package net.colar.netbeans.fan.scope;

import java.util.Hashtable;
import net.colar.netbeans.fan.indexer.model.FanSlot;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.types.FanResolvedType;

/**
 *
 * @author thibautc
 */
public class FanLocalScopeVar extends FanAstScopeVar
{

	private FanSlot slot = null;
	Hashtable<String, FanResolvedType> parameters = new Hashtable<String, FanResolvedType>();

	/**
	 * Use this constructor for "implied/local" variables
	 * @param node
	 * @param kind
	 * @param name
	 * @param type
	 */
	public FanLocalScopeVar(AstNode node, VarKind kind, String name, FanResolvedType type)
	{
		super(node, kind, name, type);
	}

	private static FanResolvedType getSlotType(AstNode node, FanResolvedType baseType, FanSlot slot)
	{
		FanResolvedType type = FanResolvedType.fromTypeSig(node, slot.getReturnedType());
		if(FanResolvedType.isGenericType(type))
			type = FanResolvedType.fromGenerics(baseType, type);
		return type;
	}

	public FanLocalScopeVar(AstNode node, FanResolvedType baseType, FanSlot slot, String name)
	{
		super(node, VarKind.makeFromVal(slot.getSlotKind()), name, getSlotType(node, baseType, slot));
		this.slot = slot;

		if (slot.isField())
		{
			this.kind = VarKind.FIELD;
		}
		if (slot.isMethod())
		{
			this.kind = VarKind.METHOD;
		}
		if (slot.isCtor())
		{
			this.kind = VarKind.CTOR;
		}
	}

	public FanSlot getSlot()
	{
		return slot;
	}

}
