/*
 * Thibaut Colar Dec 3, 2009
 */
package net.colar.netbeans.fan.ast;

import fan.sys.MapType;
import java.util.List;
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

	boolean nullable = false;

	public enum types
	{

		UNRESOLVED, FAN
	}
	fan.sys.Type typeObj;
	types kind = types.UNRESOLVED;

	/**
	 * Use make* factory methods
	 * obj=null means unresolved
	 * @param obj
	 */
	private FanAstResolvedType(fan.sys.Type obj)
	{
		typeObj = obj;
		if (obj == null)
		{
			kind = kind.UNRESOLVED;
		} else
		{
			kind = types.FAN;
			nullable = ((fan.sys.Type) obj).isNullable();
		}
	}

	public fan.sys.Type getType()
	{
		if (kind != types.FAN)
		{
			return null;
		}
		return (fan.sys.Type) typeObj;
	}

	public types getKind()
	{
		return kind;
	}

	/**
	 * Given an expression try to resolve the type we are trying to complete and create a ResolvedType object
	 * @param exprNode
	 * @return
	 */
	public static FanAstResolvedType makeFromExpr(FanParserResult result, CommonTree exprNode)
	{
		//TODO
		//String type = null;
		//List<CommonTree> children = exprNode.getChildren();
		/*for (CommonTree node : children)
		{
			System.out.println("Node type: "+node.getType());
			switch (node.getType())
			{
				case FanParser.AST_INC_DOTCALL:
					break;
				case FanParser.AST_STATIC_CALL:
					CommonTree tNode = (CommonTree) node.getFirstChildWithType(FanParser.AST_TYPE);
					if (tNode != null && tNode.getChildCount() > 0)
					{
						type = tNode.getChild(0).getText();
					}
					break;
			}

		}*/
		String type = FanLexAstUtils.getNodeContent(result, exprNode);
		//TODO: yuk (call end with .)
		if(type.endsWith("."))
			type=type.substring(0, type.length() -1 );
		System.out.println("** type: "+type);
		FanAstScope scope = result.getRootScope().findClosestScope(exprNode);
		System.out.println("** scope: "+scope);
		FanAstResolvedType resolvedType = scope.resolveVar(type);
		System.out.println("** resolvedType: "+resolvedType);
		return resolvedType;
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
		FanAstResolvedType resolved = FanAstResolvedType.makeUnresolved();
		// Deal with maps
		if (map != null)
		{
			CommonTree keyNode = (CommonTree) map.getChild(0);
			CommonTree valueNode = (CommonTree) map.getChild(1);
			if (keyNode != null && valueNode != null)
			{
				// Find key / value type
				FanAstResolvedType keyType = makeFromSimpleType(scope, keyNode);
				FanAstResolvedType valueType = makeFromSimpleType(scope, valueNode);
				if (!keyType.isUnresolved() && !valueType.isUnresolved())
				{
					MapType mapType = new MapType(keyType.getType(), valueType.getType());
					resolved = FanAstResolvedType.makeFromFanType(root.getParserResult(), mapType);
				}
			}
		} else
		{
			// "regular" type
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
				resolved = makeFromFanType(root.getParserResult(), resolved.getType().toListOf());
			}
		}

		System.out.println("Type: " + type + " resolved to: " + resolved);
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

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(kind.toString());
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
		return kind == types.FAN;
	}

	public boolean isUnresolved()
	{
		return kind == types.UNRESOLVED;
	}
}
