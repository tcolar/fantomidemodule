/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.ImageIcon;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.LexerUtils;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.StructureItem;
import org.netbeans.modules.csl.spi.ParserResult;

/**
 * Implementation of a  StructureItem
 * Represents an item(ex: class) as found by the structureanalyzer
 * @author thibautc
 */
public class FanStructureItem implements StructureItem
{
    private final CommonTree node;
    private final ParserResult result;
    private final FanElementHandle handle;
    private String name;
    private List<StructureItem> items=new ArrayList<StructureItem>();
    private String html;
    private int start=0;
    private int stop=0;
    

    public FanStructureItem(CommonTree node, ElementKind kind, ParserResult result)
    {
	this.node = node;
	//this.kind = node.getKind();
	this.result = result;
	//TODO: modifiers
	this.name=node.getText();
	// node gives up index of 1st and last token part of this struct. item
	// then we finx those tokens by index in tokenStream (from lexer)
	// from that we can find start and end location of struct. text in source file.
	OffsetRange range=LexerUtils.getNodeRange((FanParserResult)result, node);
	start=range.getStart();
	stop=range.getEnd();
	this.handle=new FanElementHandle(kind, (CommonToken)node.getToken(), result, range);
    }

    public String getName()
    {
	return name;
    }

    public String getSortText()
    {
	return getName();
    }

    public String getHtml(HtmlFormatter arg0)
    {
	return html!=null?html:getName();
    }

    public ElementHandle getElementHandle()
    {
	return handle;
    }

    public ElementKind getKind()
    {
	return handle.getKind();
    }

    public Set<Modifier> getModifiers()
    {
	return handle.getModifiers();
    }

    public boolean isLeaf()
    {
	return items.isEmpty();
    }

    public List<? extends StructureItem> getNestedItems()
    {
	return items;
    }

    public long getPosition()
    {
	return start;
    }

    public long getEndPosition()
    {
	return stop;
    }

    public ImageIcon getCustomIcon()
    {
	return null;
    }

    void setName(String text) {
	name=text;
    }

    void addModifier(Modifier modifier) {
	getModifiers().add(modifier);
    }

    void setNestedItems(List<StructureItem> subList) {
	items=subList;
   }

    void setHtml(String string)
    {
	html=string;
    }
}
