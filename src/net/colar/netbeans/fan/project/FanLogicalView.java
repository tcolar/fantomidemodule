/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.openide.nodes.Node;

/**
 *
 * @author thibautc
 */
public class FanLogicalView implements LogicalViewProvider
{

    public static final String REGISTERED_NODE_LOCATION =
	    "Projects/net-colar-netbeans-fan-project-FanProject/Nodes";
    private final FanProject project;

    public FanLogicalView(FanProject project)
    {
	super();
	this.project = project;
    }

    @Override
    public Node createLogicalView()
    {
	return NodeFactorySupport.createCompositeChildren(project, REGISTERED_NODE_LOCATION).getNodeAt(0);
    }

    @Override
    public Node findPath(Node root, Object target)
    {
	return null;
    }
}

