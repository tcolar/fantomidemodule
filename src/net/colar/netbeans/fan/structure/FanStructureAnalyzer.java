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
public class FanStructureAnalyzer implements StructureScanner {

    public List<StructureItem> scan(ParserResult result) {
	FanParserResult fanResult = (FanParserResult) result;
	CommonTree ast = fanResult.getTree();

	List<StructureItem> list = new ArrayList<StructureItem>();
String trace="";
	scanTree(list, ast, result, trace);

	return list;
    }

    /**
     * Scan down the tree for structure items, and add them to the tree if necesary
     * Recursive.
     * @param list
     * @param node
     */
    public void scanTree(List<StructureItem> list, CommonTree node, ParserResult result, String trace) {
	if (node != null) {
	    FanStructureItem item = null;

	    trace+="->"+node.getText();
	    System.err.println("NODE: " + trace);//"+node.toStringTree());
	    if (node.getType() == FanParser.AST_CLASS) {
		item = new FanStructureItem(node, ElementKind.CLASS, result);
		item.setName("class");
	    }
	    else if (node.getType() == FanParser.AST_METHOD) {
		item = new FanStructureItem(node, ElementKind.METHOD, result);
		item.setName("method");
	    }
	    for (int i = 0; i < node.getChildCount(); i++) {
		CommonTree subNode = (CommonTree) node.getChild(i);
		/*if (subNode.getType() == FanParser.AST_ID) {
		    item.setName(subNode.getChild(0).getText());
		} else if (subNode.getType() == FanParser.AST_MODIFIER) {
		    //TODO
		    item.addModifier(Modifier.PRIVATE);
		}else if (subNode.getType() == FanParser.AST_METHOD) {
		    //TODO
		    item.addModifier(Modifier.PRIVATE);
		} else*/
		if(node.isNil())
		{
		    scanTree(list, subNode, result, trace);		    
		}else
		{
		List<StructureItem> subList=new ArrayList<StructureItem>();
		scanTree(subList, subNode, result, trace);
		if(item!=null)
		    item.setNestedItems(subList);
		}
	    }

	    if (item != null) {
		System.err.println("Adding to list "+item.getName()+" "+trace);
		list.add(item);
	    }
	}
    }

    public Map<String, List<OffsetRange>> folds(ParserResult result) {
	FanParserResult fanResult = (FanParserResult) result;
	Map<String, List<OffsetRange>> folds = new HashMap<String, List<OffsetRange>>();
	//TODO
	return folds;
    }

    public Configuration getConfiguration() {
	return null;
    }
}
