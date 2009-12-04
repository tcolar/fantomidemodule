/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.ast;

import java.util.List;
import net.colar.netbeans.fan.antlr.FanLexAstUtils;
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
		super(parent);
		parse(ast);
	}

	private void parse(CommonTree ast)
	{
		if (ast == null)
		{
			return;
		}
		List<CommonTree> children = (List<CommonTree>)ast.getChildren();
		CommonTree nameNode=(CommonTree)ast.getFirstChildWithType(FanParser.AST_ID);
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
					FanLexAstUtils.dumpTree(child, 0);
					FanAstField field=new FanAstField(this, child);
					if(field.getType().isUnresolved())
					{
						//TODO: Propose to auto-add using statements (Hints)
						getRoot().addError("Unresolveable field type", child);
					}
					addScopeVar(field, false);
					break;
				case FanParser.AST_CODE_BLOCK:
					// recurse because field might be in a code block or other sublevels
					parse(child);
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
