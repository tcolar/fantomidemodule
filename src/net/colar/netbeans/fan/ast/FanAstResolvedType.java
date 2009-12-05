/*
 * Thibaut Colar Dec 3, 2009
 */
package net.colar.netbeans.fan.ast;

import fan.sys.ListType;
import fan.sys.MapType;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanLexAstUtils;
import net.colar.netbeans.fan.antlr.FanParser;
import org.antlr.runtime.tree.CommonTree;

/**
 * Value of a resolved type (Fan or Java)
 * Maybe use an interface/abstract class later.
 * @author thibautc
 */
public class FanAstResolvedType
{

	boolean nullable = true;

	public enum types
	{

		UNRESOLVED, FAN, FFI_JAVA
	}
	Object typeObj;
	types type = types.UNRESOLVED;

	/**
	 * Use make* factory methods
	 * obj=null means unresolved
	 * @param obj
	 */
	private FanAstResolvedType(Object obj)
	{
		typeObj = obj;
		if (obj == null)
		{
			type = type.UNRESOLVED;
		} else
		{
			if (obj instanceof fan.sys.Type)
			{
				type = types.FAN;
				nullable = ((fan.sys.Type) obj).isNullable();
			} else if (obj instanceof java.lang.reflect.Type)
			{
				type = types.FFI_JAVA;
			} else
			{
				throw (new RuntimeException("Creating a " + getClass().getName() + " with an invalid type: " + obj.getClass() + "!"));
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

	/***
	 * CommonTree is an AST_TYPE node
	 * @param scope
	 * @param commonTree
	 * @return
	 */
	public static FanAstResolvedType makeFromSimpleType(FanAstScope scope, CommonTree node)
	{
		// TODO: deal with whole grammar !
		// can be complex: typeRoot  SP_QMARK? (LIST_TYPE SP_QMARK?)*
		// typeRoot	:	mapType | nonMapType;
		// nonMapType	:	funcType | simpleType;
		//TODO: formals, functiontype, assignedType

		// TODO: Only works for super simple basic types
		FanRootScope root = scope.getRoot();
		String type = FanLexAstUtils.getNodeContent(root.getParserResult(), node);

		boolean nullable = true;
		boolean list = false;
		if (type.endsWith("?"))
		{
			type = type.substring(0, type.length() - 1);
		} else
		{
			nullable = false;
		}

		if (type.endsWith("[]"))
		{
			list = true;
			type = type.substring(0, type.length() - 2);
		}

		CommonTree map = (CommonTree) node.getFirstChildWithType(FanParser.AST_MAP);
		FanAstResolvedType resolved;
		if (map != null)
		{
			// map type
			//TODO: get key child, get value child
			// then call makeFromSimpleType on each and then create the map type from that
			resolved = FanAstResolvedType.makeUnresolved();
		} else
		{
			// regular type
			FanAstResolvedType lookedup = root.lookupUsing(type);
			// we don't want to mess with the original using type.
			resolved = clone(lookedup);
		}
		resolved.setNullable(nullable);

		if (list)
		{
			// will that work if fan list of java types ??
			if (resolved.isFanType())
			{
				resolved = makeFromFanType(root.getParserResult(), resolved.getAsFanType().toListOf());
			} else if (resolved.isJavaType())
			{
				// TODO
				resolved = makeUnresolved();
				//java.lang.reflect.Type javaType = resolved.getAsJavaType();
				//resolved = makeFromFanType(root.getParserResult(), javaType);
			}
		}

		return resolved;
	}

	public static FanAstResolvedType makeUnresolved()
	{
		return new FanAstResolvedType(null);
	}

	public static FanAstResolvedType makeFromFanType(FanParserResult result, fan.sys.Type fanType)
	{
		FanAstResolvedType type = new FanAstResolvedType(fanType);
		return type;
	}

	public static FanAstResolvedType makeFromJavaType(FanParserResult result, java.lang.reflect.Type javaType)
	{
		return new FanAstResolvedType(javaType);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(type.toString());
		if (typeObj != null)
		{
			sb = sb.append(" [").append(typeObj.toString()).append("]");
		}
		sb = sb.append(" nullable:").append(nullable);
		return sb.toString();
	}

	private static FanAstResolvedType clone(FanAstResolvedType original)
	{
		if (original == null)
		{
			return null;
		}
		FanAstResolvedType clone = new FanAstResolvedType(original.typeObj);
		return clone;
	}

	public void setNullable(boolean nullable)
	{
		this.nullable = nullable;
	}

	public boolean isNullable()
	{
		return nullable;
	}

	public boolean isFanType()
	{
		return type == types.FAN;
	}

	public boolean isJavaType()
	{
		return type == types.FFI_JAVA;
	}

	public boolean isUnresolved()
	{
		return type == types.UNRESOLVED;
	}
}
