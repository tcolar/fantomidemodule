/*
 * Thibaut Colar Nov 24, 2009
 */
package net.colar.netbeans.fan.ast;

import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.LexerUtils;
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
		return rootScope;
	}

}
