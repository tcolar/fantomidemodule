/*
 * Thibaut Colar Nov 24, 2009
 */
package net.colar.netbeans.fan.ast;

import java.util.List;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import org.antlr.runtime.tree.CommonTree;

/**
 * Use as fanParserResult and create the scope tree from it
 * @author thibautc
 */
public class FanAstParser
{

	/**
	 * Go through the AST and create the scope
	 * ie: find defined variables, used pods and so on.
	 * Also track errors (unresolvable imports, undefined vars and so on)
	 * @return
	 */
	public static FanRootScope parseScope(FanParserResult result)
	{
		FanRootScope rootScope = new FanRootScope(result);
		rootScope.dump();
		return rootScope;
	}

	/**
	 * Given an expression try to resolve the type we are trying to complete
	 * Return null if can't figure the type out.
	 * @param exprNode
	 * @return
	 */
	public static String resolveTypeOfExpr(CommonTree exprNode)
	{
		String type = null;
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

		}
		return type;
	}

	/**
	 * Find the closest scope item for a given AST node.
	 * @param node
	 * @return
	 */
	public static CommonTree findClosestScope(CommonTree node)
	{
		//TODO findClosestScope
		return null;
	}
}
