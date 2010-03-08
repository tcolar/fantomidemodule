/*
 * Thibaut Colar Dec 3, 2009
 */
package net.colar.netbeans.fan.ast;

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
