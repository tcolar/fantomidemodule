/*
 * Thibaut Colar Nov 24, 2009
 */
package net.colar.netbeans.fan.ast;

import java.util.List;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import org.antlr.runtime.tree.CommonTree;

/**
 * Use as fanParserResult(ANTLR tree) and create the scope AST tree from it
 * The Antlr ast/tree is not all that good to use directly so we create our own cleaner AST from it
 * Also it has scope builtin so we can use it find variables/fields etc... for a given node/token.
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
		//result.dumpTree();
		FanRootScope rootScope = new FanRootScope(result);
		rootScope.dump();
		return rootScope;
	}

	/**
	 * Find the closest scope item for a given AST node.
	 * @param node
	 * @return
	 */
	public static CommonTree findClosestScope(CommonTree node/*maybe Token instead ??*/)
	{
		//TODO findClosestScope
		return null;
	}
}
