/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.ast;

import java.lang.reflect.Type;
import java.util.Hashtable;
import java.util.Vector;

/**
 * Scope for a type, maybe contains fields and other scopes -> slots
 * @author tcolar
 */
public class FanTypeScope extends FanAstScope
{
	private Vector<FanAstScope> slots = new Vector<FanAstScope>();

	public FanTypeScope(FanRootScope parent)
	{
		super(parent);
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


	private static void addField(FanParserResult result, FanRootScope rootScope, CommonTree node)
	{
		String name = null;
		String type = null;
		type = LexerUtils.getNodeContent(result, node.getChild(0)).trim();
		name = LexerUtils.getNodeContent(result, node.getChild(1)).trim();
		System.out.println("name: " + name);
		System.out.println("type:" + type);
	}
*/
}