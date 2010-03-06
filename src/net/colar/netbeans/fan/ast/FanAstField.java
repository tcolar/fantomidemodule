/*
 * Thibaut Colar Dec 3, 2009
 */
package net.colar.netbeans.fan.ast;

import java.util.List;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.parboiled.AstKind;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase;
import net.colar.netbeans.fan.types.FanResolvedType;
import org.antlr.runtime.tree.CommonTree;

/**
 * Type field
 * @author thibautc
 */
/*@Deprecated
public class FanAstField extends FanAstScopeVarBase
{
	// the string the type was resolved from

/*	protected String typeString;

	public FanAstField(AstNode fieldNode, String name)
	{
		super(fieldNode, name);
		if (node.getKind() == AstKind.AST_CTOR_DEF)
		{
			type = new FanResolvedType(FanResolvedType.resolveThisType());
		} else
		{
			CommonTree typeNode = (CommonTree) node.getFirstChildWithType(FanParser.AST_TYPE);
			typeString = FanLexAstUtils.getNodeContent(result, typeNode);
			type = FanResolvedType.makeFromTypeSigWithWarning(typeNode);
		}
		if(type==null)
			FanUtilities.GENERIC_LOGGER.info("Failed resolving slot type: "+node.toStringTree());
		//FanLexAstUtils.dumpTree(node, 0);
		List<CommonTree> modifs = FanLexAstUtils.getAllChildrenWithType(node, FanParser.AST_MODIFIER);
		for (CommonTree m : modifs)
		{
			String[] mStrs = FanLexAstUtils.getNodeContent(result, m).split(" ");
			for (String mStr : mStrs)
			{
				FanAstScopeVarBase.ModifEnum modif = parseModifier(mStr.trim());
				if (modif != null)
				{
					modifiers.add(modif);
				}
			}
		}
	}

	public String getTypeString()
	{
		return typeString;
	}
}*/
