/*
 * Thibaut Colar Dec 9, 2009
 */
package net.colar.netbeans.fan.ast;

import java.util.List;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.types.FanResolvedType;
import org.antlr.runtime.tree.CommonTree;

/**
 * Generic scope
 * Usually delimited by a code block (brackets etc...)
 * @author thibautc
 */
public class FanBlockScope extends FanAstScope
{
	public FanBlockScope(FanAstScope parent, CommonTree codeBlock)
	{
		super(parent, codeBlock);
	}

	/**
	 * Parse the code block recursively and create apropriate subscopes
	 * @param codeBlock
	 */
	protected void parse()
	{
		parseBlock(this, getAstNode());
	}

	/**
	 * Recursive
	 * Static to avoid using this node's method by accident
	 * @param node
	 */
	private static void parseBlock(FanAstScope scope, CommonTree node)
	{
		//System.out.println(node.toStringTree());
		FanParserResult result = scope.getRoot().getParserResult();
		if (node == null || node.getChildCount() == 0)
		{
			return;
		}
		for (CommonTree child : (List<CommonTree>) node.getChildren())
		{
			if (child.getType() == FanParser.AST_CODE_BLOCK
				|| child.getType() == FanParser.AST_IT_BLOCK
				|| child.getType() == FanParser.AST_CTOR_BLOCK
				|| child.getType() == FanParser.AST_SCOPE)
			{
				FanBlockScope subScope = new FanBlockScope(scope, child);
				scope.addChild(subScope);
				subScope.parse();
				if(child.getType() == FanParser.AST_CTOR_BLOCK)
				{
					// add it
					CommonTree type = (CommonTree) child.getFirstChildWithType(FanParser.AST_TYPE);
					if(type != null)
					{
						FanResolvedType resolved = FanResolvedType.makeFromTypeSigWithWarning(scope, type);
						FanAstScopeVar var = new FanAstScopeVar(scope, node, "it", resolved);
						subScope.addScopeVar(var, true);
					}
				}
			} else
			{
				FanResolvedType resolved = FanResolvedType.makeUnresolved();
				switch (child.getType())
				{
					case FanParser.AST_LOCAL_DEF:
					case FanParser.AST_FOR_INIT:
					case FanParser.AST_CATCH_DEF:
						CommonTree name = (CommonTree) child.getFirstChildWithType(FanParser.AST_ID);
						CommonTree type = (CommonTree) child.getFirstChildWithType(FanParser.AST_TYPE);
						String nm = FanLexAstUtils.getNodeContent(result, name);
						resolved = FanResolvedType.makeUnresolved();
						if (type == null || type.isNil())
						{
							//TODO NOW: other kinds of expressions
							CommonTree expr = (CommonTree) child.getFirstChildWithType(FanParser.AST_CAST);
							if(expr==null)
								expr = (CommonTree) child.getFirstChildWithType(FanParser.AST_TERM_EXPR);
							//FanLexAstUtils.dumpTree(child, 0);
							if (expr != null)
							{
								resolved = FanResolvedType.makeFromExpr(scope, result, expr, expr.getTokenStopIndex()); // ??
							}
						} else
						{
							resolved = FanResolvedType.makeFromTypeSigWithWarning(scope, type);
						}
						FanAstScopeVar var = new FanAstScopeVar(scope, node, nm, resolved);
						//TODO: Now: for a catch, create a new scope
						scope.addScopeVar(var, true);
						break;
					case FanParser.AST_FORMAL:
						CommonTree fname = (CommonTree) child.getFirstChildWithType(FanParser.AST_ID);
						CommonTree ftype = (CommonTree) child.getFirstChildWithType(FanParser.AST_TYPE);
						String fnm = "it"; // If not named, it's "it"
						if (fname != null)
						{
							fnm = FanLexAstUtils.getNodeContent(result, fname);
						}
						resolved = FanResolvedType.makeUnresolved();
						if (ftype != null && !ftype.isNil())
						{
							resolved = FanResolvedType.makeFromTypeSig(scope, ftype);
							FanAstScopeVar fvar = new FanAstScopeVar(scope, node, fnm, resolved);
							scope.addScopeVar(fvar, true);
						}
						break;
					// Warn of incomplete items
					case FanParser.AST_INC_DOTCALL:
					case FanParser.AST_INC_SAFEDOTCALL:
						scope.getRoot().addError("Incomplete expression", node);
						break;
				}
				// recurse
				parseBlock(scope, child);
			}
		}
	}

	/*public static String resolveItType(FanAstScope scope)
	{
		FanBlockScope sc = scope.findParentItBlock(scope);
		if(sc!=null)
		{
			int idx = scope.getAstNode().getTokenStartIndex() -1;
			CommonTree blockNode = scope.getAstNode();
			CommonTree ctorNode = FanLexAstUtils.findParentNode(blockNode, FanParser.AST_CTOR_BLOCK);
			if(ctorNode != null)
			{
				CommonTree idNode = (CommonTree)ctorNode.getChild(0);
				System.out.println("ctorNode: "+idNode.toStringTree());
				return resolveExpr(sc, null, idNode, idx).getQualifiedType();
			}
			CommonTree exprNode = FanLexAstUtils.findParentNode(blockNode, FanParser.AST_TERM_EXPR);
			if(exprNode != null)
			{
				System.out.println("exprNode: "+exprNode.toStringTree());
				CommonTree base = (CommonTree)exprNode.getChild(0);
				CommonTree chain = (CommonTree)exprNode.getChild(1);
				System.out.println("base: "+base.toStringTree());
				System.out.println("chain: "+chain.toStringTree());
				FanResolvedType type = resolveExpr(scope, null, base, idx );
				FanResolvedType type2 = resolveExpr(scope, type, chain,  idx);
				System.out.println("type: "+type);
				return type2.getQualifiedType();
			}
		}
		return FanIndexer.UNRESOLVED_TYPE;
	}*/


}
