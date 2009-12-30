/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.indexer;

import net.colar.netbeans.fan.ast.FanAstScope;
import net.colar.netbeans.fan.ast.FanTypeScope;
import net.colar.netbeans.fan.indexer.model.FanType;
import org.antlr.runtime.tree.CommonTree;

/**
 * Resolved type
 * @author tcolar
 */
public class FanResolvedType
{

	private final String qualifiedType;
	private final FanType dbType;
	// whether it's used in a  nullable context : ex: Str? vs Str
	private boolean nullableContext=false;
	// whether it's used in a static context: ex Str. vs str.
	private boolean staticContext=false;

	public FanResolvedType(String qualifiedType)
	{
		this.qualifiedType=qualifiedType;
		if(qualifiedType!=null)
		{
			dbType=FanType.findByQualifiedName(qualifiedType);
		}
		else
		{
			dbType=null;
		}
	}

	public boolean isResolved()
	{
		return dbType!=null;
	}

	public FanType getDbType()
	{
		return dbType;
	}

	public String getQualifiedType()
	{
		return qualifiedType;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(qualifiedType).append(" resolved:").append(isResolved());
		return sb.toString();
	}

	public static FanResolvedType makeUnresolved()
	{
		return new FanResolvedType(null);
	}

	public static FanResolvedType makeFromSimpleTypeWithWarning(FanAstScope scope, CommonTree typeNode)
	{
	}

	public static FanResolvedType makeFromSimpleType(FanTypeScope aThis, CommonTree child)
	{
	}
	boolean isNullable()
	{

	}

	public boolean isStaticContext()
	{
	}


}
