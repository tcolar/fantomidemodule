/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import org.antlr.runtime.tree.CommonTree;
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
	    switch (node.getType())
	    {
		case FanParser.AST_FIELD:
		    item = new FanStructureItem(node, ElementKind.FIELD, result);
		    String name = getSubChildTextByType(node, FanParser.AST_ID, -1);
		    String modif = getSubChildTextByType(node, FanParser.AST_MODIFIER, -1);
		    String type = getSubChildTextByType(node, FanParser.AST_TYPE, -1);
		    handleModifiers(item, modif);
		    item.setName(name);
		    String html = name;
		    if (type.length() > 0)
		    {
			html += " : <font color='#aaaaaa'>" + type + "</font>";
		    }
		    item.setHtml(html);
		    break;

		case FanParser.AST_CLASS:
		case FanParser.AST_MIXIN:
		case FanParser.AST_ENUM:
		    item = new FanStructureItem(node, ElementKind.CLASS, result);
		    name = getSubChildTextByType(node, FanParser.AST_ID, -1);
		    String inheritance = getSubChildTextByType(node, FanParser.AST_INHERITANCE, -1);
		    item.setName(name);
		    html = name;
		    if (inheritance.length() > 0)
		    {
			html += "<font color='#aaaaaa'>" + inheritance + "</font>";
		    }
		    item.setHtml(html);
		    break;

		case FanParser.AST_METHOD:
		case FanParser.AST_CONSTRUCTOR:
		    ElementKind kind=node.getType()==FanParser.AST_METHOD?ElementKind.METHOD:ElementKind.CONSTRUCTOR;

		    item = new FanStructureItem(node, kind, result);
		    String returnType = getSubChildTextByType(node, FanParser.AST_TYPE, -1);
		    if (returnType.equalsIgnoreCase("void"))
		    {
			returnType = "";
		    }
		    String constChain = getSubChildTextByType(node, FanParser.AST_CONSTRUCTOR_CHAIN, -1);
		    name = getSubChildTextByType(node, FanParser.AST_ID, -1);
		    String params = getSubChildTextByType(node, FanParser.AST_PARAMS, -1);
		    modif = getSubChildTextByType(node, FanParser.AST_MODIFIER, -1);
		    handleModifiers(item, modif);
		    item.setName(name);
		    html = name + "(<font color='#aaaaaa'>" + params + "</font>)";
		    if (returnType.length() > 0)
		    {
			html += " : <font color='#aaaaaa'>" + returnType + "</font>";
		    }
		    else if (constChain.length() > 0)
		    {
			html += " : <font color='#aaaaaa'>" + returnType + "</font>";
		    }
		    item.setHtml(html);
		    break;
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
	    if (itemIndex != -1 && itemIndex < node.getChildCount())
	    {
		CommonTree node2 = (CommonTree) node.getChild(itemIndex);
		if (node2 != null)
		{
		    text = node2.getText();
		}
	    } else
	    {
		Iterator children = node.getChildren().iterator();
		while(children.hasNext())
		{
		    CommonTree node3=(CommonTree)children.next();
		    if(text.length()>0)
			text+=" ";
		    text+=node3.getText();
		}
	    }
	}
	if (text == null)
	{
	    text = "";
	}
	return text;
    }

    private String getSubChildTextByType(CommonTree node, int astType, int itemIndex)
    {
	String text = "";
	if (node != null)
	{
	    CommonTree node2 = (CommonTree) node.getFirstChildWithType(astType);
	    text = getChildTextByType(node2, itemIndex);
	}
	return text;
    }

    private void handleModifiers(FanStructureItem item, String modif)
    {
	if (modif.indexOf("private")!=-1)
	{
	    item.addModifier(Modifier.PRIVATE);
	}
	else if (modif.indexOf("protected")!=-1)
	{
	    item.addModifier(Modifier.PROTECTED);
	}
	else if (modif.indexOf("public")!=-1)
	{
	    item.addModifier(Modifier.PUBLIC);
	}
	if (modif.indexOf("static")!=-1)
	{
	    item.addModifier(Modifier.STATIC);
	}
    }

}
