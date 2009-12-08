/*
 * Thibaut Colar Dec 3, 2009
 */
package net.colar.netbeans.fan.ast;

import fan.sys.Field;
import fan.sys.MapType;
import fan.sys.Method;
import fan.sys.Slot;
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
	public static FanAstResolvedType makeFromExpr(FanParserResult result, CommonTree exprNode, int lastGoodTokenIndex)
	{
		FanAstScope scope = result.getRootScope().findClosestScope(exprNode);
		System.out.println("** scope: " + scope);
		FanAstResolvedType type = resolveExpr(result, scope, null, exprNode, lastGoodTokenIndex);
		if (type == null)
		{
			type = makeUnresolved();
		}
		System.out.println("** resolvedType: " + type);
		return type;
	}

	/**
	 * Start recursion with baseType=null;
	 * @param result
	 * @param baseType
	 * @param node
	 * @return
	 */
	private static FanAstResolvedType resolveExpr(FanParserResult result, FanAstScope scope,
		FanAstResolvedType baseType, CommonTree node, int index)
	{
		// if unresolveable no point searching further
		if (baseType != null && baseType.isUnresolved())
		{
			return baseType;
		}
		//System.out.println("Node type: " + node.getType());
		String t = FanLexAstUtils.getNodeContent(result, node);
		//System.out.println("** type: " + t + " " + node.toStringTree());
		//System.out.println("Index: " + FanLexAstUtils.getTokenStart(node) + " VS " + index);
		// Skip the imcomplete part past what we care about
		if (!isValidTokenStart(node, index))
		{
			return baseType;
		}
		List<CommonTree> children = node.getChildren();
		switch (node.getType())
		{
			case FanParser.AST_TERM_EXPR:
				CommonTree termBase = children.get(0);
				CommonTree termChain = children.get(1);
				baseType = resolveExpr(result, scope, null, termBase, index);
				baseType = resolveExpr(result, scope, baseType, termChain, index);
			case FanParser.AST_STATIC_CALL:
				CommonTree type = children.get(0);
				CommonTree idExpr = children.get(1);
				baseType = resolveExpr(result, scope, null, type, index);
				baseType = resolveExpr(result, scope, baseType, idExpr, index);
				break;
			case FanParser.AST_ID:
				if (baseType == null)
				{
					baseType = scope.resolveVar(t);
				} else
				{
					Slot slot =  baseType.getType().slot(t);
					if(slot.isMethod() || slot.isCtor())
						baseType = makeFromFanType(result, ((Method)slot).returns());
					else if(slot.isField())
						baseType = makeFromFanType(result, ((Field)slot).of());
				}
				break;
			// TODO case itBlock :  skip;
			default:
				// "Meaningless" nodes (interm of expression resolving)
				if (node.getChildCount() > 0)
				{
					baseType = resolveExpr(result, scope, baseType, (CommonTree) node.getChild(0), index);
				} else
				{
					//System.out.println("Don't know how to resolve: " + t + " " + node.toStringTree());
					baseType = makeUnresolved();
				}
				break;
		}
		//System.out.println("** End type: " + baseType);
		return baseType;
	}

	private static boolean isValidTokenStart(CommonTree node, int maxIndex)
	{
		int index = FanLexAstUtils.getTokenStart(node);
		// will be -1 for a Nill node
		return index >= 0 && index <= maxIndex;
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
