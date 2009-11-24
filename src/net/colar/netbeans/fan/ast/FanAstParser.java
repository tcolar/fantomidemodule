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
	 * @return
	 */
	public static FanAstScope parseScope(FanParserResult result)
	{
		FanRootScope rootScope = new FanRootScope();
		CommonTree ast = result.getTree();
		List<CommonTree> children = ast.getChildren();
		for(CommonTree child : children)
		{
			switch(child.getType())
			{
				//case FanParser.AST_USING:
				//	break;
				case FanParser.AST_CLASS:
				case FanParser.AST_ENUM:
				case FanParser.AST_MIXIN:
					rootScope.addType(parseType(child));
					break;
			}
		}
		return rootScope;
	}

	private static FanAstScope parseType(CommonTree node)
	{
/*						case FanParser.AST_FIELD:
					item = new FanStructureItem(node, ElementKind.FIELD, result);
					String name = getSubChildTextByType(node, FanParser.AST_ID, -1);
					String modif = getSubChildTextByType(node, FanParser.AST_MODIFIER, -1);
					String type = getSubChildTextByType(node, FanParser.AST_TYPE, -1);
					handleModifiers(item, modif);
					item.setName(name);
*/
		return null;
	}
}
