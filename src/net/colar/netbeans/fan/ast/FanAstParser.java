/*
 * Thibaut Colar Nov 24, 2009
 */
package net.colar.netbeans.fan.ast;

import fan.sys.Type;
import java.util.List;
import java.util.Set;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
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
	 * @return
	 */
	public static FanAstScope parseScope(FanParserResult result)
	{
		FanRootScope rootScope = new FanRootScope();
		CommonTree ast = result.getTree();
		List<CommonTree> children = ast.getChildren();
		for (CommonTree child : children)
		{
			switch (child.getType())
			{
				case FanParser.AST_USING_POD:
					addUsing(rootScope, child);
					break;
				case FanParser.AST_CLASS:
				case FanParser.AST_ENUM:
				case FanParser.AST_MIXIN:
					rootScope.addType(parseType(child));
					break;
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

	private static void addUsing(FanRootScope rootScope, CommonTree usingNode)
	{
		String name=null;
		String type=null;
		switch (usingNode.getChildCount())
		{
			case 1: // using Sys
				type=usingNode.getChild(0).getText().trim();
				name=type;
				break;
			case 2: // using Sys::Time
				name=usingNode.getChild(1).getText().trim();
				type=usingNode.getChild(0).getText().trim()+"::"+name;
				break;
			case 3: // using Sys::Time as Ti  or using [java] Sys::Time as Ti
				type=usingNode.getChild(0).getText().trim()+"::"+usingNode.getChild(1).getText().trim();
				name=usingNode.getChild(2).getText().trim();
				break;
		}
		if(name!=null && type!=null)
		{
			if(type.trim().startsWith("["))
			{
				System.out.println("TODO: Using FFI AST support.");
			}
			else
			{
				if(type.indexOf("::")>0)
				{
					// Adding a specific type
					String[] data = type.split("::");
					Type t = FanPodIndexer.getInstance().getPodType(data[0], data[1]);
					if(t!=null)
						rootScope.addUsedType(name, t);
				}
				else
				{
					// Adding all the types of a Pod
					Set<Type> types = FanPodIndexer.getInstance().getPodTypes(name);
					for(Type t : types)
					{
						//TODO: There could be duplicates (says Sys.Time and My.Time) .. should we deal with that ?
						if(rootScope.getUsedTypes().containsKey(t.name()))
							System.out.println("Duplicated using: "+t.name()+" ("+name+")");
						rootScope.addUsedType(t.name(), t);
					}
				}
				
			}
		}
	}
}
