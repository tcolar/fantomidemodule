/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import fan.sys.MapType;
import fan.sys.Type;
import java.lang.reflect.Member;
import java.util.List;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.ast.FanAstScope;
import net.colar.netbeans.fan.ast.FanLexAstUtils;
import net.colar.netbeans.fan.ast.FanRootScope;
import net.colar.netbeans.fan.ast.FanTypeScope;
import net.colar.netbeans.fan.indexer.model.FanSlot;
import net.colar.netbeans.fan.indexer.model.FanType;
import org.antlr.runtime.tree.CommonTree;

/**
 * Resolved type
 * Store infos of a resolved type
 * Also contains the factory methods / logic to resolve a type expr.
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
		if (qualifiedType != null && !qualifiedType.equals(FanIndexer.UNRESOLVED_TYPE))
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
		//TODO: formals, functiontype, assignedType

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
		if (map != null)
		{
			CommonTree keyNode = (CommonTree) map.getChild(0);
			CommonTree valueNode = (CommonTree) map.getChild(1);
			if (keyNode != null && valueNode != null)
			{
				// Find key / value type
				FanResolvedType keyType = makeFromSimpleType(scope, keyNode);
				FanResolvedType valueType = makeFromSimpleType(scope, valueNode);
				if (keyType.isResolved() && valueType.isResolved())
				{
					MapType mapType = new MapType(Type.find(keyType.getQualifiedType()), Type.find(valueType.getQualifiedType()));
					resolved = new FanResolvedType(mapType.qname());
				}
			}
		} else
		{
			// "regular" type
			resolved = root.lookupUsing(type);
		}
		// TODO: list
		if (list)
		{
			if (resolved.isResolved())
			{
				resolved = new FanResolvedType(Type.find(resolved.getQualifiedType()).toListOf().qname());
			}
		}

		resolved.setNullableContext(nullable);
		//System.out.println("Type: " + type + " resolved to: " + resolved);

		return resolved;
	}

	public static FanResolvedType makeFromExpr(FanRootScope rootScope, FanParserResult result, CommonTree exprNode, int lastGoodTokenIndex)
	{
		FanAstScope scope = rootScope.findClosestScope(exprNode);
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
		if (baseType != null && !baseType.isResolved())
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
		//System.out.println("Node type: "+t+" -> "+node.getText()+"("+node.getType()+")");
		switch (node.getType())
		{
			case FanParser.AST_TERM_EXPR:
				CommonTree termBase = children.get(0);
				CommonTree termChain = children.get(1);
				baseType = resolveExpr(result, scope, null, termBase, index);
				baseType = resolveExpr(result, scope, baseType, termChain, index);
				break;
			case FanParser.AST_STATIC_CALL:
				CommonTree type = children.get(0);
				CommonTree idExpr = children.get(1);
				baseType = resolveExpr(result, scope, null, type, index);
				baseType = resolveExpr(result, scope, baseType, idExpr, index);
				break;
			case FanParser.AST_STR:
				baseType = new FanResolvedType("sys::Str");
				break;
			case FanParser.KW_TRUE:
			case FanParser.KW_FALSE:
				baseType = new FanResolvedType("sys::Bool");
				break;
			case FanParser.CHAR:
				baseType = new FanResolvedType("sys::Int");
				break;
			case FanParser.NUMBER:
				String ftype = parseNumberType(node.getText());
				baseType = new FanResolvedType(ftype);
				break;
			case FanParser.URI:
				baseType = new FanResolvedType("sys::Uri");
				break;
			case FanParser.KW_IT:
				baseType = new FanResolvedType(resolveItType(scope));
				break;
			case FanParser.KW_THIS:
				baseType = new FanResolvedType(resolveThisType(scope));
				break;
			case FanParser.AST_NAMED_SUPER:
				//TODO
				break;
			case FanParser.KW_SUPER:
				//TODO
				break;
			case FanParser.AST_LIST:
				//TODO
				break;
			case FanParser.AST_MAP:
				//TODO
				break;
			case FanParser.AST_TYPE_LIT:
				//TODO
				break;
			case FanParser.AST_SLOT_LIT:
				//TODO
				break;
			case FanParser.AST_SYMBOL:
				//TODO
				break;
			case FanParser.AST_ID:
				if (baseType == null)
				{
					baseType = scope.resolveVar(t);
					if (!baseType.isResolved())
					{
						// Try a static type (ex: Str.)
						baseType = makeFromSimpleType(scope, node);
						baseType.setStaticContext(true);
					}
				} else
				{
					if (baseType.isResolved() && baseType.getDbType().isJava())
					{
						// java slots
						List<Member> members = FanIndexerFactory.getJavaIndexer().findTypeSlots(baseType.getQualifiedType());
						boolean found = false;
						// Returrning the first match .. because java has overloading this could be wrong
						// However i assume overloaded methods return the same type (If it doesn't too bad, it's ugly coe anyway :) )
						for (Member member : members)
						{
							if (member.getName().equalsIgnoreCase(t))
							{
								baseType = new FanResolvedType(FanIndexerFactory.getJavaIndexer().getReturnType(member));
								found = true;
								break;
							}
						}
						if (!found)
						{
							baseType = makeUnresolved();
						}

					} else
					{
						// Fan slots
						FanSlot slot = FanSlot.findByTypeAndName(baseType.getQualifiedType(), t);
						if (slot != null)
						{
							baseType = new FanResolvedType(slot.returnedType);
						} else
						{
							baseType = makeUnresolved();
						}
					}
				}
				break;
			default:
				// "Meaningless" 'wrapper' nodes (in term of expression resolving)
				if (node.getChildCount() > 0)
				{
					baseType = resolveExpr(result, scope, baseType, (CommonTree) node.getChild(0), index);
				} else
				{
					FanUtilities.GENERIC_LOGGER.info("Don't know how to resolve: " + t + " " + node.toStringTree());
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

	/**
	 * Parse number litterals
	 * http://fantom.org/doc/docLang/Literals.html#int
	 * @param text
	 * @return
	 */
	private static String parseNumberType(String text)
	{
		System.out.println("text: "+text);
		text = text.toLowerCase();
		if(text.endsWith("ns") || text.endsWith("ms")||
				text.endsWith("sec") || text.endsWith("min")||
				text.endsWith("hr") || text.endsWith("day"))
			return "sys::Duration";
		if(text.startsWith("0x")) // hex
			return "sys::Int"; // char
		if(text.endsWith("f"))
			return "sys::Float";
		if(text.endsWith("d") || text.indexOf(".")!=-1)
			return "sys::Decimal";
		return "sys::Int";
	}

	public static String resolveThisType(FanAstScope scope)
	{
		// TODO: does 'this' always refer to the type even when in it block ?
		FanTypeScope tscope = scope.getTypeScope();
		if(tscope==null)
			return FanIndexer.UNRESOLVED_TYPE;
		return tscope.getQName();
	}

	public static String resolveItType(FanAstScope scope)
	{
		// TODO: find the it block
		//FanTypeScope tscope = scope.getTypeScope();
		//if(tscope==null)
		return FanIndexer.UNRESOLVED_TYPE;
		//return tscope.getQName();
	}
}
