/*
 * Thibaut Colar Dec 9, 2009
 */
package net.colar.netbeans.fan.ast;

import java.util.List;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanLexAstUtils;
import net.colar.netbeans.fan.antlr.FanParser;
import org.antlr.runtime.tree.CommonTree;

/**
 * Generic scope
 * Usually delimited by a code block (brackets etc...)
 * // TODO: What else limits scope - research fantom doc
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
		FanParserResult result=scope.getRoot().getParserResult();
		if(node==null || node.getChildCount()==0)
			return;
		for (CommonTree child : (List<CommonTree>) node.getChildren())
		{
			if (child.getType() == FanParser.AST_CODE_BLOCK)
			{
				FanBlockScope subScope = new FanBlockScope(scope, child);
				subScope.parse();
				scope.addChild(subScope);
			} else
			{
				switch (child.getType())
				{
					case FanParser.AST_LOCAL_DEF:
						CommonTree name=(CommonTree)child.getFirstChildWithType(FanParser.AST_ID);
						CommonTree type=(CommonTree)child.getFirstChildWithType(FanParser.AST_TYPE);
						String nm=FanLexAstUtils.getNodeContent(result, name);
						FanAstResolvResult resolved = FanAstResolvResult.makeFromSimpleTypeWithWarning(scope, type);
						FanAstScopeVar var = new FanAstScopeVar(scope, node, nm, resolved);
						scope.addScopeVar(var, true);
						//if(type==null)
						//TODO: resolve infered types
						break;
					// Warn of incomplete items
					case FanParser.AST_INC_DOTCALL:
					case FanParser.AST_INC_SAFEDOTCALL:
						scope.getRoot().addError("Incomplete expression", node);
						break;
					// TODO: Variable definition / assignment
					// TODO: Loop vars
					// TODO: other verification
				}
				// recurse
				parseBlock(scope, child);
			}
		}
	}
}
