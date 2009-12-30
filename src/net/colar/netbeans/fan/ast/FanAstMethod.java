/*
 * Thibaut Colar Dec 9, 2009
 */
package net.colar.netbeans.fan.ast;

import java.util.Hashtable;
import java.util.List;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.indexer.FanResolvedType;
import org.antlr.runtime.tree.CommonTree;

/**
 * Method or Ctor.
 * @author thibautc
 */
public class FanAstMethod extends FanAstField
{

	boolean isCtor = false;
	Hashtable<String, FanResolvedType> parameters = new Hashtable<String, FanResolvedType>();

	public FanAstMethod(FanAstScope scope, CommonTree node, boolean isCtor)
	{
		// Same as a field basically.
		super(scope, node);
		FanParserResult result = scope.getRoot().getParserResult();

		this.isCtor = isCtor;

		// parameters
		List<CommonTree> params = FanLexAstUtils.getAllChildrenWithType(node, FanParser.AST_PARAM);
		for (CommonTree param : params)
		{
			// TODO: hasDefault()
			//System.out.println("Param Node: " + param.toStringTree());
			CommonTree id = (CommonTree) param.getFirstChildWithType(FanParser.AST_ID);
			CommonTree typeNode = (CommonTree) param.getFirstChildWithType(FanParser.AST_TYPE);
			// shouldn;t be null, but we dont want to risk parser exceptions
			if (typeNode != null && id != null)
			{
				String pName = FanLexAstUtils.getNodeContent(result, id);
				FanResolvedType pType = FanResolvedType.makeFromSimpleTypeWithWarning(scope, typeNode);
				if (!parameters.containsKey(pName))
				{
					parameters.put(pName, pType);
				} else
				{
					scope.getRoot().addError("Duplicated parameter name", id);
				}
			}
		}
	}

	public Hashtable<String, FanResolvedType> getParameters()
	{
		return parameters;
	}

	public boolean isCtor()
	{
		return isCtor;
	}


}
