/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.FilterNode.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 * Logical view for Fan project
 * @author thibautc
 */
public class FanLogicalView implements LogicalViewProvider
{

    public static final String REGISTERED_NODE_LOCATION =
	    "Projects/net-colar-netbeans-fan-project-FanProject/Nodes";
    private final FanProject project;

    public FanLogicalView(FanProject project)
    {
	this.project = project;
    }

    @Override
    public Node createLogicalView()
    {
	try
	{

	    //Get the scenes directory, creating it if deleted:
	    FileObject dir = project.getProjectDirectory();

	    //Get the DataObject that represents it:
	    DataObject dobj = DataObject.find(dir);

	    //Get its default node: we'll wrap our node around it to change the
	    //display name, icon, etc:
	    Node originalObj = dobj.getNodeDelegate();

	    //This FilterNode will be our project node:
	    return new FanNode(project, originalObj, dir);

	} catch (DataObjectNotFoundException donfe)
	{
	    Exceptions.printStackTrace(donfe);
	    //Fallback: the directory couldn't be created -
	    //read-only filesystem or something evil happened:
	    return new AbstractNode(Children.LEAF);
	}
//	return NodeFactorySupport.createCompositeChildren(project, REGISTERED_NODE_LOCATION).getNodeAt(0);
    }

    @Override
    public Node findPath(Node root, Object target)
    {
	// Not impl.
	return null;
    }
}

