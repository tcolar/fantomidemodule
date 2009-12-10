/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.ast;

import java.util.List;
import net.colar.netbeans.fan.antlr.FanParser;
import org.antlr.runtime.tree.CommonTree;

/**
 * Scope for a type, maybe contains fields and other scopes -> slots
 * @author tcolar
 */
public class FanTypeScope extends FanAstScope
{
	String name="";

	public FanTypeScope(FanRootScope parent, CommonTree ast)
	{
		super(parent, ast);
	}

	protected void parse()
	{
		CommonTree ast = getAstNode();
		//TODO: Deal with inheritance 
		if (ast == null)
		{
			return;
		}
		CommonTree nameNode=(CommonTree)ast.getFirstChildWithType(FanParser.AST_ID);
		// fields are within the code_block of the type
		CommonTree content=(CommonTree)ast.getFirstChildWithType(FanParser.AST_CODE_BLOCK);
		List<CommonTree> children = (List<CommonTree>)content.getChildren();
		if(nameNode!=null)
		{
			name=FanLexAstUtils.getNodeContent(getRoot().getParserResult(), nameNode);
		}
		if (children == null)
		{
			return;
		}
		for (CommonTree child : children)
		{
			switch (child.getType())
			{
				case FanParser.AST_FIELD:
					FanAstField field=new FanAstField(this, child);
					if(field.getResolvedType().isUnresolved())
					{
						//TODO: Propose to auto-add using statements (Hints)
						getRoot().addError("Unresolved field type", child);
					}
					addScopeVar(field, false);
					break;
				case FanParser.AST_METHOD:
				case FanParser.AST_CONSTRUCTOR:
					FanAstMethod method=new FanAstMethod(this, child, child.getType() == FanParser.AST_CONSTRUCTOR);
					addScopeVar(method, false);
					break;
			}
		}
	}

	public String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		StringBuilder sb=new StringBuilder("Type : ").append(name);
		return sb.toString();
	}
}
