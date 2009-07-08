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
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.StructureItem;
import org.netbeans.modules.csl.api.StructureScanner;
import org.netbeans.modules.csl.spi.ParserResult;

/**
 *
 * @author thibautc
 */
public class FanStructureAnalyzer implements StructureScanner{

    public List<? extends StructureItem> scan(ParserResult result)
    {
	FanParserResult fanResult=(FanParserResult)result;
	CommonTree ast=fanResult.getTree();

	List<? extends StructureItem> list=new ArrayList<StructureItem>();

	scanTree(list, ast);
	
	return list;
    }

    /**
     * Scan down the tree for structure items, and add them to the tree if necesary
     * Recursive.
     * @param list
     * @param node
     */
    public void scanTree(List<? extends StructureItem> list, CommonTree node)
    {
	if (node != null)
	{
	    /*if(node.getType() == FanTokens.getTokens().get(""))
	    {
		    System.err.println("Node: "+node.getText()+" "+node.getType());
	    }*/
	    System.err.println("NODE: "+node.toStringTree());

	    for (int i = 0; i < node.getChildCount(); i++)
	    {
		scanTree(list, (CommonTree)node.getChild(i));
	    }
	}
    }

    public Map<String, List<OffsetRange>> folds(ParserResult result)
    {
	FanParserResult fanResult=(FanParserResult)result;
	Map<String, List<OffsetRange>> folds= new HashMap<String, List<OffsetRange>>();
	//TODO
	return folds;
    }

    public Configuration getConfiguration()
    {
	return null;
    }

}
