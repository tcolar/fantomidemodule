/*
 * Thibaut Colar Jan 8, 2010
 */
package net.colar.netbeans.fan.types;

import java.util.List;
import net.colar.netbeans.fan.parboiled.AstNode;

/**
 *
 * @author thibautc
 */
public class FanResolvedFuncType extends FanResolvedType
{

	private final FanResolvedType retType;
	private final List<FanResolvedType> types;

	public FanResolvedFuncType(AstNode scopeNode, List<FanResolvedType> types, FanResolvedType retType)
	{
		super(scopeNode, "sys::Func", scopeNode.getRoot().getParserTask().findCachedQualifiedType("sys::Func"));
		if(retType == null)
			retType = FanResolvedType.makeFromDbType(scopeNode, "sys::Void");
		this.retType = retType;
		this.types = types;
	}

	public FanResolvedType getRetType()
	{
		return retType;
	}

	public List<FanResolvedType> getTypes()
	{
		return types;
	}

	@Override
	public String toTypeSig(boolean fullyQualified)
	{
		String sig = "|";
		boolean first=true;
		for(FanResolvedType type : types)
		{
			if(!first)
			{
				first = false;
				sig+=", ";
			}
			sig+=type.toTypeSig(fullyQualified);
		}
		sig+= "->";
		sig += retType.toTypeSig(fullyQualified) + "|";
		sig += isNullable()?"?":"";
		return sig;
	}
}
