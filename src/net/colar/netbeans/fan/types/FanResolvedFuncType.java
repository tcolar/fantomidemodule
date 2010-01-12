/*
 * Thibaut Colar Jan 8, 2010
 */
package net.colar.netbeans.fan.types;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author thibautc
 */
public class FanResolvedFuncType extends FanResolvedType
{

	private FanResolvedType retType;
	private List<FanResolvedType> types = new Vector<FanResolvedType>();

	public FanResolvedFuncType(Vector<FanResolvedType> types, FanResolvedType retType)
	{
		super("sys::Func");
		if(retType == null)
			retType = new FanResolvedType("sys::Void");
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
	public String toDbSig(boolean fullyQualified)
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
			sig+=type.toDbSig(fullyQualified);
		}
		sig+= "->";
		sig += retType.toDbSig(fullyQualified) + "|";
		return sig;
	}
}
