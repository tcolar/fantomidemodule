/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.openide.ErrorManager;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;

/**
 *
 * @author thibautc
 */
public class FanLogicalViewProvider implements LogicalViewProvider
{

    private final FanProject project;
    private Node nd;

    /** Creates a new instance of FanLogicalView */
    public FanLogicalViewProvider(FanProject project)
    {
	this.project = project;
    }

    void notifyChange()
    {
	if (nd instanceof FanLogicalView)
	{
	    ((FanLogicalView) nd).notifyMainNameChanged();
	}
    }

    public Node createLogicalView()
    {
	if (nd == null)
	{
	    try
	    {
		nd = new FanLogicalView(project);
	    } catch (DataObjectNotFoundException donfe)
	    {
		ErrorManager.getDefault().notify(donfe);
		nd = new AbstractNode(Children.LEAF);
		nd.setDisplayName(donfe.getMessage());
	    }
	}
	return nd;
    }

    public Node findPath(Node root, Object target)
    {
	System.err.println("GOT A " + target + " of " + target.getClass());
	DataObject ob = target instanceof DataObject ? (DataObject) target : null;

	if (ob != null)
	{
	    Node[] n = root.getChildren().getNodes(true);
	    for (int i = 0; i < n.length; i++)
	    {
		if (n[i].getCookie(DataObject.class) == ob)
		{
		    return n[i];
		}
	    }
	}
	return null;
    }
}

