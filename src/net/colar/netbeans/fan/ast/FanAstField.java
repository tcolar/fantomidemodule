/*
 * Thibaut Colar Dec 3, 2009
 */

package net.colar.netbeans.fan.ast;

import java.util.List;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.indexer.FanResolvedType;
import org.antlr.runtime.tree.CommonTree;

/**
 * Type field
 * @author thibautc
 */
public class FanAstField extends FanAstScopeVarBase
{
	// the string the type was resolved from
	protected String typeString;

	public FanAstField(FanAstScope scope, CommonTree node)
	{
		super(scope, node);
		FanParserResult result = scope.getRoot().getParserResult();
		name = FanLexAstUtils.getNodeContent(result, node.getFirstChildWithType(FanParser.AST_ID)).trim();
		CommonTree typeNode = (CommonTree)node.getFirstChildWithType(FanParser.AST_TYPE);
		typeString = FanLexAstUtils.getNodeContent(result, typeNode);
		type = FanResolvedType.makeFromSimpleTypeWithWarning(scope, typeNode);
		List<CommonTree> modifs = FanLexAstUtils.getAllChildrenWithType(node, FanParser.AST_MODIFIER);
		for(CommonTree m : modifs)
		{
			FanAstScopeVarBase.ModifEnum modif = FanAstScopeVarBase.parseModifier(FanLexAstUtils.getNodeContent(result, m).trim());
			if(modif!=null)
				modifiers.add(modif);
		}
	}

	public String getTypeString()
	{
		return typeString;
	}


}
