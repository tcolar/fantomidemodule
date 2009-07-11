/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.ImageIcon;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.StructureItem;
import org.netbeans.modules.csl.spi.ParserResult;

/**
 *
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
    private TokenHierarchy tokenHierarchy;

    public FanStructureItem(CommonTree node, ElementKind kind, ParserResult result)
    {
	this.node = node;
	//this.kind = node.getKind();
	this.result = result;
	this.handle=new FanElementHandle(kind, (CommonToken)node.getToken(), result);
	//TODO: modifiers
	this.name=node.getText();
	this.tokenHierarchy=result.getSnapshot().getTokenHierarchy();
	//tokenHierarchy.
	System.err.println(name+" ["+getPosition()+"-"+getEndPosition()+"]");
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
	return node.getTokenStartIndex();
    }

    public long getEndPosition()
    {
	return node.getTokenStopIndex();
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
