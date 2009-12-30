/*
 * Thibaut Colar Dec 3, 2009
 */
package net.colar.netbeans.fan.ast;

import net.colar.netbeans.fan.indexer.FanIndexer;
import net.colar.netbeans.fan.indexer.model.FanType;

/**
 * Value of a resolved type (Fan or Java)
 * Maybe use an interface/abstract class later.
 * @author thibautc
 */
public class FanAstResolvedType
{
	/*
	String qualifiedType = FanIndexer.UNRESOLVED_TYPE;
	boolean unresolved=true;

	private FanAstResolvedType(String qType, boolean resolved)
	{
		qualifiedType = qType;
		this.unresolved = ! resolved;
	}

	public static FanAstResolvedType makeUnresolved()
	{
		return new FanAstResolvedType(FanIndexer.UNRESOLVED_TYPE, false);
	}

	public static FanAstResolvedType makeFromQualifiedType(String qName)
	{
		FanType type = FanType.findByQualifiedName(qName);
		return new FanAstResolvedType(qName, type!=null);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(qualifiedType).append(" resolved:").append( ! unresolved);
		return sb.toString();
	}

	public boolean isUnresolved()
	{
		return unresolved;
	}

	public String getQualifiedType()
	{
		return qualifiedType;
	}

}
