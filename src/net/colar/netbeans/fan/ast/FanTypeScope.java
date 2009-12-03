/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.ast;

import java.util.List;
import java.util.Vector;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.antlr.LexerUtils;
import org.antlr.runtime.tree.CommonTree;

/**
 * Scope for a type, maybe contains fields and other scopes -> slots
 * @author tcolar
 */
public class FanTypeScope extends FanAstScope
{

	private Vector<FanAstScope> slots = new Vector<FanAstScope>();

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
		List<CommonTree> children = ast.getChildren();
		if (children == null)
		{
			return;
		}
		for (CommonTree child : children)
		{
			switch (child.getType())
			{
				case FanParser.AST_FIELD:
					addField(child);
					break;
				case FanParser.AST_CODE_BLOCK:
					// recurse because field might be in a code block or other sublevels
					parse(child);
					break;
			}
		}
	}

	private void addField(CommonTree node)
	{
		FanParserResult result = getRoot().getParserResult();
		String name = LexerUtils.getNodeContent(result, node.getChild(0)).trim();
		String type = LexerUtils.getNodeContent(result, node.getChild(1)).trim();
		//String val = LexerUtils.getNodeContent(result, node.getChild(2)).trim();
		System.out.println("- Field " + name + " : " + type);
	}

	/*
	private static FanAstScope parseType(CommonTree node)
	{
	item = new FanStructureItem(node, ElementKind.FIELD, result);
	String name = getSubChildTextByType(node, FanParser.AST_ID, -1);
	String modif = getSubChildTextByType(node, FanParser.AST_MODIFIER, -1);
	String type = getSubChildTextByType(node, FanParser.AST_TYPE, -1);
	handleModifiers(item, modif);
	item.setName(name);
	return null;
	}
	 */
	/*@Override
	public void dump()
	{
	System.out.println("---Type Scope---");
	for (String key : u)
	{
	System.out.println("Using: " + key + " (" + using.get(key) + ")");
	}
	for (FanAstScope node : types)
	{
	node.dump();
	}
	}*/
}
