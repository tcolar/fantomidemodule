/*
 * Thibaut Colar Dec 8, 2009
 */

package net.colar.netbeans.fan.ast;

import fan.sys.Field;
import fan.sys.MapType;
import fan.sys.Method;
import fan.sys.Slot;
import fan.sys.Type;
import java.util.List;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import org.antlr.runtime.tree.CommonTree;

/**
 * Hold results of resolvig an expression type
 * @author thibautc
 */
public class FanAstResolvResult
{

	private final FanAstResolvedType type;
	// wether it's used in a  nullable context : ex: Str? vs Str
	private boolean nullableContext=false;
	// wether it's used in a static context: ex Str. vs str.
	private boolean staticContext=false;

	public FanAstResolvResult(FanAstResolvedType type)
	{
		this.type=type;
		this.nullableContext = type.isNullable();
	}

	public boolean isNullableContext()
	{
		return nullableContext;
	}

	public void setNullableContext(boolean nullableContext)
	{
		this.nullableContext = nullableContext;
	}

	public boolean isStaticContext()
	{
		return staticContext;
	}

	public void setStaticContext(boolean staticContext)
	{
		this.staticContext = staticContext;
	}

	public FanAstResolvedType getType()
	{
		return type;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(type.toString());
		sb = sb.append(" NullCtx:").append(nullableContext).append(" StaticCtx:").append(staticContext);
		return sb.toString();
	}

		/**
	 * Given an expression try to resolve the type we are trying to complete and create a ResolvedType object
	 * @param exprNode
	 * @return
	 */
	public static FanAstResolvResult makeFromExpr(FanParserResult result, CommonTree exprNode, int lastGoodTokenIndex)
	{
		FanAstScope scope = result.getRootScope().findClosestScope(exprNode);
		System.out.println("** scope: " + scope);
		FanAstResolvResult type = resolveExpr(result, scope, null, exprNode, lastGoodTokenIndex);
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
	private static FanAstResolvResult resolveExpr(FanParserResult result, FanAstScope scope,
		FanAstResolvResult baseType, CommonTree node, int index)
	{
		// if unresolveable no point searching further
		if (baseType != null && baseType.getType().isUnresolved())
		{
			return baseType;
		}
		//System.out.println("Node type: " + node.getType());
		String t = FanLexAstUtils.getNodeContent(result, node);
		System.out.println("** type: " + t + " " + node.toStringTree()+" "+baseType);
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
					baseType = new FanAstResolvResult(scope.resolveVar(t));
					if(baseType.getType().isUnresolved())
					{
						// Try a static type (ex: Str.)
						baseType = makeFromSimpleType(scope, node);
						baseType.setStaticContext(true);
					}
				} else
				{
					Slot slot =  baseType.getType().getType().slot(t, false);
					if(slot!=null)
					{
					if(slot.isMethod() || slot.isCtor())
						baseType = makeFromFanType(((Method)slot).returns());
					else if(slot.isField())
						baseType = makeFromFanType(((Field)slot).of());
					}
					else
					{
						baseType=makeUnresolved();
					}
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
					System.out.println("Don't know how to resolve: " + t + " " + node.toStringTree());
					//baseType = makeUnresolved();
				}
				break;
		}
		//System.out.println("** End type: " + baseType);
		return baseType;
	}

	public static FanAstResolvResult makeFromSimpleTypeWithWarning(FanAstScope scope, CommonTree node)
	{
		FanAstResolvResult result=makeFromSimpleType(scope, node);
		if (result.getType().isUnresolved())
		{
			String type=FanLexAstUtils.getNodeContent(scope.getRoot().getParserResult(), node);
			//TODO: Propose to auto-add using statements (Hints)
			scope.getRoot().addError("Unresolved type: "+type, node);
		}
		return result;
	}


	/***
	 * CommonTree is an AST_TYPE node
	 * @param scope
	 * @param commonTree
	 * @return
	 */
	public static FanAstResolvResult makeFromSimpleType(FanAstScope scope, CommonTree node)
	{
		if(node==null)
			return makeUnresolved();
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
		FanAstResolvResult resolved = makeUnresolved();
		// Deal with maps
		if (map != null)
		{
			CommonTree keyNode = (CommonTree) map.getChild(0);
			CommonTree valueNode = (CommonTree) map.getChild(1);
			if (keyNode != null && valueNode != null)
			{
				// Find key / value type
				FanAstResolvedType keyType = makeFromSimpleType(scope, keyNode).getType();
				FanAstResolvedType valueType = makeFromSimpleType(scope, valueNode).getType();
				if (!keyType.isUnresolved() && !valueType.isUnresolved())
				{
					MapType mapType = new MapType(keyType.getType(), valueType.getType());
					resolved = makeFromFanType(mapType);
				}
			}
		} else
		{
			// "regular" type
			FanAstResolvedType lookedup = root.lookupUsing(type);
			resolved = new FanAstResolvResult(lookedup);
		}

		if (list)
		{
			if ( ! resolved.getType().isUnresolved())
			{
				resolved = makeFromFanType(resolved.getType().getType().toListOf());
			}
		}

		resolved.setNullableContext(nullable);
		//System.out.println("Type: " + type + " resolved to: " + resolved);

		return resolved;
	}

	public static FanAstResolvResult makeUnresolved()
	{
		return new FanAstResolvResult(FanAstResolvedType.makeUnresolved());
	}

	private static boolean isValidTokenStart(CommonTree node, int maxIndex)
	{
		int index = FanLexAstUtils.getTokenStart(node);
		// will be -1 for a Nill node
		return index >= 0 && index <= maxIndex;
	}

	private static FanAstResolvResult makeFromFanType(Type type)
	{
		return new FanAstResolvResult(FanAstResolvedType.makeFromFanType(type));
	}

}
