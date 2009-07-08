/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import java.util.List;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.text.Document;
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
    private final ParserResult info=null;
    private final Document doc=null;

    /*private FanStructureItem(AstElement node, ParserResult info)
    {
	this.node = node;
	this.kind = node.getKind();
	this.info = info;
	this.doc = info.getSnapshot().getSource().getDocument(false);
    }*/

    public String getName()
    {
	return null;
    }

    public String getSortText()
    {
	return null;
    }

    public String getHtml(HtmlFormatter arg0)
    {
	return null;
    }

    public ElementHandle getElementHandle()
    {
	return null;
    }

    public ElementKind getKind()
    {
	return null;
    }

    public Set<Modifier> getModifiers()
    {
	return null;
    }

    public boolean isLeaf()
    {
	return false;
    }

    public List<? extends StructureItem> getNestedItems()
    {
	return null;
    }

    public long getPosition()
    {
	return -1;
    }

    public long getEndPosition()
    {
	return -1;
    }

    public ImageIcon getCustomIcon()
    {
	return null;
    }
}
