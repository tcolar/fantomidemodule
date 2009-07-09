/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.StructureItem;
import org.netbeans.modules.csl.api.StructureScanner;
import org.netbeans.modules.csl.spi.ParserResult;

/**
 *
 * @author thibautc
 */
public class FanStructureAnalyzer implements StructureScanner
{

    public List<StructureItem> scan(ParserResult result)
    {
	FanParserResult fanResult = (FanParserResult) result;
	CommonTree ast = fanResult.getTree();

	List<StructureItem> list = new ArrayList<StructureItem>();
	String trace = "";
	scanTree(list, ast, result, trace);

	return list;
    }

    /**
     * Scan down the tree for structure items, and add them to the tree if necesary
     * Recursive.
     * @param list
     * @param node
     */
    public void scanTree(List<StructureItem> list, CommonTree node, ParserResult result, String trace)
    {
	if (node != null)
	{
	    FanStructureItem item = null;

	    trace += "->" + node.getText();
	    System.err.println("NODE: " + trace);//"+node.toStringTree());
	    if (node.getType() == FanParser.AST_CLASS)
	    {
		item = new FanStructureItem(node, ElementKind.CLASS, result);
		String name = getSubChildTextByType(node, FanParser.AST_ID, 0);
		String inheritance = getSubChildTextByType(node, FanParser.AST_INHERITANCE, 1);
		item.setName(name);
		String html=name;
		if(inheritance.length()>0)
		    html+= " : <font color='#aaaaaa'>" + inheritance + "</font>";
		item.setHtml(html);
	    } else if (node.getType() == FanParser.AST_METHOD)
	    {
		item = new FanStructureItem(node, ElementKind.METHOD, result);
		String returnType = getSubChildTextByType(node, FanParser.AST_RETURN, 0);
		if(returnType.equalsIgnoreCase("void"))
		    returnType="";
		String name = getSubChildTextByType(node, FanParser.AST_ID, 0);
		String params = getSubChildTextByType(node, FanParser.AST_PARAMS, 0);
		String modif1 = getSubChildTextByType(node, FanParser.AST_MODIFIER, 0);
		if(modif1.equals("private"))
		{
		    item.addModifier(Modifier.PRIVATE);
		}
		item.setName(name);
		String html=name+"(<font color='#aaaaaa'>" + params + "</font>)";
		if(returnType.length()>0)
		    html+=" : <font color='#aaaaaa'>" + returnType + "</font>";
		item.setHtml(html);
	    }
	    List<StructureItem> subList = new ArrayList<StructureItem>();
	    for (int i = 0; i < node.getChildCount(); i++)
	    {
		CommonTree subNode = (CommonTree) node.getChild(i);
		// For the ROOT node, we had directly to list, not sublist
		if (node.isNil())
		{
		    scanTree(list, subNode, result, trace);
		} else
		{
		    scanTree(subList, subNode, result, trace);
		}
		if (item != null && !subList.isEmpty())
		{
		    item.setNestedItems(subList);
		}
	    }

	    if (item != null)
	    {
		System.err.println("Adding to list " + item.getName() + " " + trace);
		list.add(item);
	    }
	}
    }

    public Map<String, List<OffsetRange>> folds(ParserResult result)
    {
	FanParserResult fanResult = (FanParserResult) result;
	Map<String, List<OffsetRange>> folds = new HashMap<String, List<OffsetRange>>();
	//TODO
	return folds;
    }

    public Configuration getConfiguration()
    {
	return null;
    }

    private String getChildTextByType(CommonTree node, int itemIndex)
    {
	String text = "";
	if (node != null)
	{
	    Tree node2 = node.getChild(itemIndex);
	    if (node2 != null)
	    {
		text = node2.getText();
		if (text == null)
		{
		    text = "";
		}
	    }
	}
	return text;
    }

    private String getSubChildTextByType(CommonTree node, int astType, int itemIndex)
    {
	String text = "";
	if (node != null)
	{
	    CommonTree node2 = (CommonTree)node.getFirstChildWithType(astType);
	    text = getChildTextByType(node2, itemIndex);
	}
	return text;
    }
}
