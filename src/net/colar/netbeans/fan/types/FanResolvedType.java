/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.types;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Vector;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.ast.FanAstScope;
import net.colar.netbeans.fan.ast.FanLexAstUtils;
import net.colar.netbeans.fan.ast.FanRootScope;
import net.colar.netbeans.fan.ast.FanTypeScope;
import net.colar.netbeans.fan.indexer.FanIndexer;
import net.colar.netbeans.fan.indexer.FanIndexerFactory;
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

	private final String asTypedType;
	private final FanType dbType;
	// whether it's used in a  nullable context : ex: Str? vs Str
	private boolean nullableContext = false;
	// whether it's used in a static context: ex Str. vs str.
	private boolean staticContext = false;
	private final String shortAsTypedType;

	public FanResolvedType(String enteredType)
	{
		this.asTypedType = enteredType;
		shortAsTypedType = asTypedType.indexOf("::") != -1 ? asTypedType.substring(asTypedType.indexOf("::") + 2) : asTypedType;
		if (enteredType != null && !enteredType.equals(FanIndexer.UNRESOLVED_TYPE))
		{
			dbType = FanType.findByQualifiedName(enteredType);
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

	public String getAsTypedType()
	{
		return asTypedType;
	}

	public String getShortAsTypedType()
	{
		return shortAsTypedType;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(asTypedType).append(" resolved:").append(isResolved());
		return sb.toString();
	}

	public static FanResolvedType makeUnresolved()
	{
		return new FanResolvedType(FanIndexer.UNRESOLVED_TYPE);
	}

	public static FanResolvedType makeFromTypeSigWithWarning(FanAstScope scope, CommonTree node)
	{
		FanResolvedType result = makeFromTypeSig(scope, node);
		if (!result.isResolved())
		{
			String type = FanLexAstUtils.getNodeContent(scope.getRoot().getParserResult(), node);
			//TODO: Propose to auto-add using statements (Hints)
			scope.getRoot().addError("Unresolved type: " + type, node);
		}
		return result;
	}

	/**
	 * Resolve a type (type signature)
	 * Recursive
	 * @param scope
	 * @param node
	 * @return
	 */
	public static FanResolvedType makeFromTypeSig(FanAstScope scope, CommonTree node)
	{
		return makeFromTypeSig(scope, node, FanResolvedType.makeUnresolved());
	}

	private static FanResolvedType makeFromTypeSig(FanAstScope scope, CommonTree node, FanResolvedType baseType)
	{
		if (node == null)
		{
			return baseType;
		}
		FanRootScope root = scope.getRoot();

		//System.out.println("Node Type: " + node.toStringTree());

		switch (node.getType())
		{
			// type is just a wrapper node
			case FanParser.AST_TYPE:
				for (CommonTree n : (List<CommonTree>) node.getChildren())
				{
					baseType = makeFromTypeSig(scope, n, baseType);
				}
				break;
			case FanParser.AST_CHILD:
				// just a wrapper node
				CommonTree subNode = (CommonTree) node.getChild(0);
				baseType = makeFromTypeSig(scope, subNode);
			case FanParser.AST_ID:
				String typeText = FanLexAstUtils.getNodeContent(scope.getRoot().getParserResult(), node);
				baseType = root.lookupUsing(typeText);
				break;
			case FanParser.SP_QMARK:
				baseType.setNullableContext(true);
			case FanParser.LIST_TYPE:
				baseType = new FanResolvedListType(baseType);
				break;
			case FanParser.AST_MAP:
				CommonTree keyNode = (CommonTree) node.getChild(0);
				CommonTree valueNode = (CommonTree) node.getChild(1);
				if (keyNode != null && valueNode != null)
				{
					FanResolvedType keyType = makeFromTypeSig(scope, keyNode);
					FanResolvedType valueType = makeFromTypeSig(scope, valueNode);
					if (keyType.isResolved() && valueType.isResolved())
					{
						baseType = new FanResolvedMapType(keyType, valueType);
					}
				}
				break;
			case FanParser.AST_FUNC_TYPE:
				FanResolvedType returnType = null;
				Vector<FanResolvedType> types = new Vector<FanResolvedType>();
				boolean passedArrow = false;
				for (CommonTree n : (List<CommonTree>) node.getChildren())
				{
					switch (n.getType())
					{
						case FanParser.OP_ARROW:
							passedArrow = true;
							break;
						case FanParser.AST_TYPE:
							if ( ! passedArrow)
							{
								types.add(makeFromTypeSig(scope, n));
							} else
							{
								returnType = makeFromTypeSig(scope, n);
							}
					}
				}

				baseType = new FanResolvedFuncType(types, returnType);
				break;
			default:
				FanUtilities.GENERIC_LOGGER.info("Unexpected item during type parsing" + node.toStringTree());
				baseType = makeUnresolved();
				break;
		}
		return baseType;
	}

	public static FanResolvedType makeFromExpr(FanAstScope sc, FanParserResult result, CommonTree exprNode, int lastGoodTokenIndex)
	{
		FanAstScope scope = sc.getRoot().findClosestScope(exprNode);
		FanUtilities.GENERIC_LOGGER.debug("** scope: " + scope);
		FanResolvedType type = resolveExpr(scope, null, exprNode, lastGoodTokenIndex);
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
	private static FanResolvedType resolveExpr(FanAstScope scope,
		FanResolvedType baseType, CommonTree node, int index)
	{
		FanParserResult result = scope.getRoot().getParserResult();
		// if unresolveable no point searching further
		if (baseType != null && !baseType.isResolved())
		{
			return baseType;
		}
		//System.out.println("Node type: " + node.getType());
		String t = FanLexAstUtils.getNodeContent(result, node);
		if (node == null || t == null)
		{
			FanUtilities.GENERIC_LOGGER.info("Node is empty! " + node.getParent().toStringTree());
			return makeUnresolved();
		}
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
			//TODO: ranges (tricky)
			case FanParser.AST_CAST:
				CommonTree castType = (CommonTree) node.getFirstChildWithType(FanParser.AST_TYPE);
				baseType = makeFromTypeSigWithWarning(scope, castType);
			case FanParser.AST_TERM_EXPR:
				CommonTree termBase = children.get(0);
				CommonTree termChain = children.get(1);
				baseType = resolveExpr(scope, null, termBase, index);
				baseType = resolveExpr(scope, baseType, termChain, index);
				break;
			case FanParser.AST_STATIC_CALL:
				CommonTree type = children.get(0);
				CommonTree idExpr = children.get(1);
				baseType = resolveExpr(scope, null, type, index);
				baseType = resolveExpr(scope, baseType, idExpr, index);
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
			case FanParser.AST_NAMED_SUPER:
				CommonTree nameNode = (CommonTree) node.getFirstChildWithType(FanParser.AST_ID);
				baseType = resolveExpr(scope, baseType, nameNode, index);
				baseType.setStaticContext(false);
				break;
			case FanParser.KW_SUPER:
				baseType = new FanResolvedType(resolveSuper(scope));
				baseType.setStaticContext(false);
				break;
			case FanParser.KW_THIS:
				baseType = new FanResolvedType(resolveThisType(scope));
				break;
			case FanParser.AST_IT_BLOCK:
				// Do nothing, keep type of left hand side.
				baseType.setStaticContext(false);
				break;
			case FanParser.AST_CTOR_BLOCK:
				CommonTree ctorNode = (CommonTree) node.getFirstChildWithType(FanParser.AST_TYPE);
				baseType = resolveExpr(scope, baseType, ctorNode, index);
				baseType.setStaticContext(false);
				break;
			case FanParser.AST_LIST:
				// TODO NOW: list of what ?
				//CommonTree listTypeNode = (CommonTree)node.getFirstChildWithType(FanParser.AST_TERM_EXPR);
				//FanResolvedType listType = resolveExpr(result, scope, null, listTypeNode, index);
				baseType = new FanResolvedType("sys::List");
				break;
			case FanParser.AST_MAP:
				// TODO NOW: map of what ?
				baseType = new FanResolvedType("sys::Map");
				break;
			case FanParser.AST_TYPE_LIT: // type litteral
				String lit = FanLexAstUtils.getNodeContent(result, node);
				if (lit.endsWith("#")) // it should
				{
					lit = lit.substring(0, lit.length() - 1);
				}
				baseType = scope.getRoot().lookupUsing(lit);
				baseType.setStaticContext(true);
				break;
			case FanParser.AST_SLOT_LIT:
				baseType = new FanResolvedType("sys::Slot");
				break;
			case FanParser.AST_SYMBOL:
				// TODO: is this correct - not sure
				baseType = new FanResolvedType("sys::Symbol");
				break;
			case FanParser.AST_ID:
			case FanParser.KW_IT:
				if (baseType == null)
				{
					baseType = scope.resolveVar(t);
					if (!baseType.isResolved())
					{
						// Try a static type (ex: Str.)
						baseType = makeFromTypeSigWithWarning(scope, node);
						baseType.setStaticContext(true);
					}
				} else
				{
					if (baseType.isResolved() && baseType.getDbType().isJava())
					{
						// java slots
						List<Member> members = FanIndexerFactory.getJavaIndexer().findTypeSlots(baseType.getAsTypedType());
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
						FanSlot slot = FanSlot.findByTypeAndName(baseType.getAsTypedType(), t);
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
					baseType = resolveExpr(scope, baseType, (CommonTree) node.getChild(0), index);
				} else
				{
					FanUtilities.GENERIC_LOGGER.info("Don't know how to resolve: " + t + " " + node.toStringTree());
				}
				break;
		}
		//System.out.println("** End type: " + baseType + "  "+baseType.isStaticContext());
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
		text = text.toLowerCase();
		if (text.endsWith("ns") || text.endsWith("ms")
			|| text.endsWith("sec") || text.endsWith("min")
			|| text.endsWith("hr") || text.endsWith("day"))
		{
			return "sys::Duration";
		}
		if (text.startsWith("0x")) // hex
		{
			return "sys::Int"; // char
		}
		if (text.endsWith("f"))
		{
			return "sys::Float";
		}
		if (text.endsWith("d") || text.indexOf(".") != -1)
		{
			return "sys::Decimal";
		}
		return "sys::Int";
	}

	public static String resolveThisType(FanAstScope scope)
	{
		FanAstScope tscope = scope.getTypeScope();
		if (tscope == null)
		{
			return FanIndexer.UNRESOLVED_TYPE;
		}
		return ((FanTypeScope) tscope).getQName();
	}

	public static String resolveSuper(FanAstScope scope)
	{
		FanAstScope tscope = scope;
		while (tscope != null && !(tscope instanceof FanTypeScope))
		{
			tscope = tscope.getParent();
		}
		if (tscope != null)
		{
			FanResolvedType superType = ((FanTypeScope) tscope).getSuperClass();
			return superType.getAsTypedType();
		} else
		{
			return FanIndexer.UNRESOLVED_TYPE;
		}
	}

	public String getSignature(boolean fullyQualified)
	{
		if(isResolved())
		{
			if(fullyQualified)
				return dbType.getQualifiedName();
			else
				return dbType.getSimpleName();
		}
		if(fullyQualified)
			return getAsTypedType();
		else
			return getShortAsTypedType();
	}
}
