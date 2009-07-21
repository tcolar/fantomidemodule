/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.util.Vector;
import javax.swing.Action;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.support.CommonProjectActions;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.filesystems.FileObject;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;

/**
 *
 * @author thibautc
 */
@NodeFactory.Registration(projectType = "net-colar-netbeans-fan-project-FanProject", position = 200)
public class FanNodeFactory implements NodeFactory
{

    public FanNodeFactory()
    {
    }

    @Override
    public NodeList createNodes(Project prj)
    {
	AbstractNode nd = getNode(prj.getProjectDirectory());
	return NodeFactorySupport.fixedNodeList(nd);
    }

    private FanNode getNode(FileObject dir)
    {
	System.err.println(dir.getPath());
	FileObject[] children = dir.getChildren();
	FanNode[] nodes = new FanNode[children.length];
	for (int i = 0; i != children.length; i++)
	{
	    nodes[i] = getNode(children[i]);
	}
	Children childs = Children.LEAF;
	if (nodes.length > 0)
	{
	    childs = new Children.Array();
	    childs.add(nodes);
	}
	FanNode nd = new FanNode(dir, childs);
	return nd;

    }

    private class FanNode extends AbstractNode
    {
	boolean isPod=false;
	boolean isRoot=false;
	boolean isRunnable=false;

	public FanNode(FileObject dir, Children children)
	{
	    super(children);
	    setDisplayName(dir.getNameExt());
	    doIcon(dir);
	    //isRoot=getParentNode()==null;
	}

	private void doIcon(FileObject dir)
	{
	    // Deal with icon
	    if (!dir.isFolder())
	    {
		if (dir.getNameExt().equalsIgnoreCase("build.fan"))
		{
		    setIconBaseWithExtension("net/colar/netbeans/fan/project/resources/fanBuild.png");
		    //((FanNode) getParentNode()).setIconBaseWithExtension("net/colar/netbeans/fan/fan.png");
		    //((FanNode) getParentNode()).isPod=true;
		} else if (dir.getExt().equalsIgnoreCase("fan"))
		{
		    setIconBaseWithExtension("net/colar/netbeans/fan/project/resources/fanFile.png");
		} else if (dir.getExt().equalsIgnoreCase("fwt"))
		{
		    setIconBaseWithExtension("net/colar/netbeans/fan/project/resources/fanFwt.png");
		}

	    } else
	    {
		if (dir.getName().equalsIgnoreCase("fan"))
		{
		    setIconBaseWithExtension("net/colar/netbeans/fan/project/resources/folderFan.png");
		} else if (dir.getName().equalsIgnoreCase("java"))
		{
		    setIconBaseWithExtension("net/colar/netbeans/fan/project/resources/folderJava.png");
		} else if (dir.getName().equalsIgnoreCase("test"))
		{
		    setIconBaseWithExtension("net/colar/netbeans/fan/project/resources/folderTest.png");
		} else
		{
		    setIconBaseWithExtension("net/colar/netbeans/fan/project/resources/folder.png");
		}
	    }
	}

	@Override
	public Action[] getActions(boolean arg0)
	{
	    Vector<Action> actions=new Vector();
	    if(isRoot)
	    {
		CommonProjectActions.setAsMainProjectAction();
		CommonProjectActions.deleteProjectAction();
		CommonProjectActions.closeProjectAction();
	    }
	    if(!isRoot && isPod)
	    {
	    }
	    if(! isLeaf())
	    {
		CommonProjectActions.newFileAction();
	    }

	    return (Action[])actions.toArray();
	}
    }
}

