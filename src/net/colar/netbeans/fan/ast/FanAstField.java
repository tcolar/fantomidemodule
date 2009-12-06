/*
 * Thibaut Colar Dec 3, 2009
 */

package net.colar.netbeans.fan.ast;

import java.util.ArrayList;
import java.util.List;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.antlr.FanLexAstUtils;
import org.antlr.runtime.tree.CommonTree;

/**
 * Type field
 * @author thibautc
 */
public class FanAstField extends FanAstScopeVar
{
	
	public FanAstField(FanAstScope scope, CommonTree node)
	{
		super(scope, node);
		FanParserResult result = scope.getRoot().getParserResult();
		name = FanLexAstUtils.getNodeContent(result, node.getFirstChildWithType(FanParser.AST_ID)).trim();
		type = FanAstResolvedType.makeFromSimpleType(scope, (CommonTree)node.getFirstChildWithType(FanParser.AST_TYPE));
		// modifiers ??
		List<CommonTree> modifs = FanLexAstUtils.getAllChildrenWithType(node, FanParser.AST_MODIFIER);
		for(CommonTree m : modifs)
		{
			FanAstScopeVar.modifs modif = FanAstScopeVar.parseModifier(FanLexAstUtils.getNodeContent(result, m).trim());
			if(modif!=null)
				modifiers.add(modif);
		}
	}


}
