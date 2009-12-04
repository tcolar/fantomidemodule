/*
 * Thibaut Colar Dec 3, 2009
 */
package net.colar.netbeans.fan.ast;

import net.colar.netbeans.fan.FanParserResult;
import org.antlr.runtime.tree.CommonTree;

/**
 * Value of a resolved type (Fan or Java)
 * Maybe use an interface/abstract class later.
 * @author thibautc
 */
public class FanAstResolvedType
{

	public enum types
	{
		UNRESOLVED, FAN, FFI_JAVA
	}
	Object typeObj;
	types type = types.UNRESOLVED;

	/** obj=null means unresolved
	 * @param obj
	 */
	private FanAstResolvedType(Object obj)
	{
		if (obj == null)
		{
			type = type.UNRESOLVED;
		} else
		{
			if (obj instanceof fan.sys.Type)
			{
				type = types.FAN;
			}
			if (obj instanceof java.lang.reflect.Type)
			{
				type = types.FFI_JAVA;
			} else
			{
				throw (new RuntimeException("Creating a " + getClass().getName() + " with an invalid type: " + type.getClass() + "!"));
			}
		}
	}

	public fan.sys.Type getAsFanType()
	{
		if (type != types.FAN)
		{
			return null;
		}
		return (fan.sys.Type) typeObj;
	}

	public java.lang.reflect.Type getAsJavaType()
	{
		if (type != types.FFI_JAVA)
		{
			return null;
		}
		return (java.lang.reflect.Type) typeObj;
	}

	public types getType()
	{
		return type;
	}

	/**
	 * Given an expression try to resolve the type we are trying to complete and create a ResolvedType object
	 * @param exprNode
	 * @return
	 */
	public static FanAstResolvedType makeFromExpr(FanParserResult result, CommonTree exprNode)
	{
		//TODO
		/*String type = null;
		List<CommonTree> children = exprNode.getChildren();
		for (CommonTree node : children)
		{
			switch (node.getType())
			{
				case FanParser.AST_STATIC_CALL:
					CommonTree tNode = (CommonTree) node.getFirstChildWithType(FanParser.AST_TYPE);
					if (tNode != null && tNode.getChildCount() > 0)
					{
						type = tNode.getChild(0).getText();
					}
					break;
			}

		}*/
		return new FanAstResolvedType(null);
	}

	@Override
	public String toString()
	{
		StringBuilder sb=new StringBuilder(type.toString());
		if(typeObj != null)
			sb=sb.append(" [").append(typeObj.toString()).append("]");
		return sb.toString();
	}


}
