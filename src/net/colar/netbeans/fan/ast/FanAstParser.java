/*
 * Thibaut Colar Nov 24, 2009
 */
package net.colar.netbeans.fan.ast;

import fan.sys.Type;
import java.util.List;
import java.util.Set;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.antlr.LexerUtils;
import net.colar.netbeans.fan.indexer.FanJavaIndexer;
import net.colar.netbeans.fan.indexer.FanPodIndexer;
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
	 * Also track errors (unresolvable imports, undefined vars and so on)
	 * @return
	 */
	public static FanRootScope parseScope(FanParserResult result)
	{
		FanRootScope rootScope = new FanRootScope();
		CommonTree ast = result.getTree();
		List<CommonTree> children = ast.getChildren();
		if (children != null)
		{
			for (CommonTree child : children)
			{
				switch (child.getType())
				{
					case FanParser.AST_INC_USING:
						rootScope.addError(result, "Incomplete import statement.", child);
						break;
					case FanParser.AST_USING_POD:
						addUsing(result, rootScope, child);
						break;
					case FanParser.AST_CLASS:
					case FanParser.AST_ENUM:
					case FanParser.AST_MIXIN:
						rootScope.addType(parseType(child));
						break;
				}
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

	private static void addUsing(FanParserResult result, FanRootScope rootScope, CommonTree usingNode)
	{
		//TODO: warn/highlight if duplicated using
		String name = null;
		String type = null;
		switch (usingNode.getChildCount())
		{
			case 1: // using Sys
				type = LexerUtils.getNodeContent(result, usingNode.getChild(0)).trim();
				name = type;
				break;
			case 2: // using Sys::Time
				name = LexerUtils.getNodeContent(result, usingNode.getChild(1)).trim();
				type = LexerUtils.getNodeContent(result, usingNode.getChild(0)).trim() + "::" + name;
				break;
			case 3: // using Sys::Time as Ti  or using [java] Sys::Time as Ti
				type = LexerUtils.getNodeContent(result, usingNode.getChild(0)).trim() + "::" + LexerUtils.getNodeContent(result, usingNode.getChild(1)).trim();
				name = LexerUtils.getNodeContent(result, usingNode.getChild(2)).trim();
				break;
		}
		System.out.println("name: " + name);
		System.out.println("type:" + type);
		if (name != null && type != null)
		{
			if (type.toLowerCase().startsWith("[java]"))
			{
				String qname=type.substring(6).trim().replaceAll("::", "\\.");
				if( ! FanJavaIndexer.getInstance().hasItem(qname))
				{
					rootScope.addError(result, "Unresolvable Java Item: " + qname, usingNode);
				}
				/*else
				{
					rootScope.addUsedType(name, );
				}*/
			} else
			{
				if (type.indexOf("::") > 0)
				{
					// Adding a specific type
					String[] data = type.split("::");
					if (!FanPodIndexer.getInstance().hasPod(data[0]))
					{
						rootScope.addError(result, "Unresolvable Pod: " + data[0], usingNode);
					} else if (!FanPodIndexer.getInstance().hasPodType(data[0], data[1]))
					{
						rootScope.addError(result, "Unresolvable Type: " + data[0] + "::" + data[1], usingNode);
					}

					Type t = FanPodIndexer.getInstance().getPodType(data[0], data[1]);
					if (t != null)
					{
						rootScope.addUsedType(name, t);
					}
				} else
				{
					// Adding all the types of a Pod
					if (!FanPodIndexer.getInstance().hasPod(name))
					{
						rootScope.addError(result, "Unresolvable Pod: " + name, usingNode);
					}
					Set<Type> types = FanPodIndexer.getInstance().getPodTypes(name);
					for (Type t : types)
					{
						//TODO: There could be duplicates (says Sys.Time and My.Time) .. should we deal with that ?
						if (rootScope.getUsedTypes().containsKey(t.name()))
						{
							System.out.println("Duplicated using: " + t.name() + " (" + name + ")");
						}
						rootScope.addUsedType(t.name(), t);
					}
				}

			}
		}
	}
}
