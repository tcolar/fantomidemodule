/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import java.util.List;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.ast.FanAstScope;
import net.colar.netbeans.fan.ast.FanLexAstUtils;
import net.colar.netbeans.fan.ast.FanRootScope;
import net.colar.netbeans.fan.indexer.model.FanSlot;
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
	// TODO not being set
	private boolean nullableContext = false;
	// whether it's used in a static context: ex Str. vs str.
	private boolean staticContext = false;

	public FanResolvedType(String qualifiedType)
	{
		this.qualifiedType = qualifiedType;
		if (qualifiedType != null && ! qualifiedType.equals(FanIndexer.UNRESOLVED_TYPE))
		{
			dbType = FanType.findByQualifiedName(qualifiedType);
		} else
		{
			dbType = null;
		}
	}

	public boolean isResolved()
	{
		return dbType != null;
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
		return new FanResolvedType(FanIndexer.UNRESOLVED_TYPE);
	}

	public static FanResolvedType makeFromSimpleTypeWithWarning(FanAstScope scope, CommonTree node)
	{
		FanResolvedType result = makeFromSimpleType(scope, node);
		if (!result.isResolved())
		{
			String type = FanLexAstUtils.getNodeContent(scope.getRoot().getParserResult(), node);
			//TODO: Propose to auto-add using statements (Hints)
			scope.getRoot().addError("Unresolved type: " + type, node);
		}
		return result;
	}

	public static FanResolvedType makeFromSimpleType(FanAstScope scope, CommonTree node)
	{
		if (node == null)
		{
			return makeUnresolved();
		}
		// TODO: deal with whole grammar !
		// can be complex: typeRoot  SP_QMARK? (LIST_TYPE SP_QMARK?)*
		// typeRoot	:	mapType | nonMapType;
		// nonMapType	:	funcType | simpleType;
		//TODO: formals, functiontype, assignedType

		// TODO: Only works for super simple basic types
		FanRootScope root = scope.getRoot();
		String type = FanLexAstUtils.getNodeContent(root.getParserResult(), node).trim();

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
		FanResolvedType resolved = makeUnresolved();
		// TODO Deal with maps
		/*if (map != null)
		{
		CommonTree keyNode = (CommonTree) map.getChild(0);
		CommonTree valueNode = (CommonTree) map.getChild(1);
		if (keyNode != null && valueNode != null)
		{
		// Find key / value type
		FanResolvedType keyType = makeFromSimpleType(scope, keyNode).getType();
		FanResolvedType valueType = makeFromSimpleType(scope, valueNode).getType();
		if (keyType.isResolved() && valueType.isResolved())
		{
		MapType mapType = new MapType(keyType, valueType);
		resolved = new FanResolvedType(mapType.qname());
		}
		}
		} else*/
		{
			// "regular" type
			resolved = root.lookupUsing(type);
		}
		// TODO: list
		/*if (list)
		{
		if (resolved.isResolved())
		{
		resolved = makeFromFanType(resolved.getType().getType().toListOf());
		}
		}*/

		resolved.setNullableContext(nullable);
		//System.out.println("Type: " + type + " resolved to: " + resolved);

		return resolved;
	}

	public static FanResolvedType makeFromExpr(FanParserResult result, CommonTree exprNode, int lastGoodTokenIndex)
	{
		FanAstScope scope = result.getRootScope().findClosestScope(exprNode);
		FanUtilities.GENERIC_LOGGER.debug("** scope: " + scope);
		FanResolvedType type = resolveExpr(result, scope, null, exprNode, lastGoodTokenIndex);
		if (type == null)
		{
			type = makeUnresolved();
		}
		FanUtilities.GENERIC_LOGGER.debug("** resolvedType: " + type);
		return type;
	}

	/**
	 * recursive
	 * @param result
	 * @param scope
	 * @param baseType
	 * @param node
	 * @param index
	 * @return
	 */
	private static FanResolvedType resolveExpr(FanParserResult result, FanAstScope scope,
			FanResolvedType baseType, CommonTree node, int index)
	{
		// if unresolveable no point searching further
		if (baseType != null && ! baseType.isResolved())
		{
			return baseType;
		}
		//System.out.println("Node type: " + node.getType());
		String t = FanLexAstUtils.getNodeContent(result, node);
		FanUtilities.GENERIC_LOGGER.debug("** type: " + t + " " + node.toStringTree() + " " + baseType);
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
					if ( ! baseType.isResolved())
					{
						// Try a static type (ex: Str.)
						baseType = makeFromSimpleType(scope, node);
						baseType.setStaticContext(true);
					}
				} else
				{
					FanSlot slot = FanSlot.findByTypeAndName(baseType.getQualifiedType(), t);
					if (slot != null)
					{
						baseType = new FanResolvedType(slot.returnedType);
					} else
					{
						baseType = makeUnresolved();
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
					FanUtilities.GENERIC_LOGGER.info("Don't know how to resolve: " + t + " " + node.toStringTree());
					//baseType = makeUnresolved();
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

	public boolean isStaticContext()
	{
		return staticContext;
	}

	public void setNullableContext(boolean nullable)
	{
		nullableContext = nullable;
	}

	public boolean isNullable()
	{
		return nullableContext;
	}

	public void setStaticContext(boolean b)
	{
		staticContext = b;
	}
}
