/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.util.Vector;
import javax.swing.Action;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.ui.support.CommonProjectActions;
import org.netbeans.spi.project.ui.support.ProjectSensitiveActions;
import org.openide.filesystems.FileObject;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.lookup.Lookups;

/**
 * Fan project Nodes (used within logical view)
 * @author tcolar
 */
public class FanNode extends AbstractNode
{

    public static final String ATTR_NODE_FILEOBJECT = "NODE_FILEOBJECT";
    //TODO: are those vars working ?
    boolean isPod = false;
    boolean isRoot = false;
    boolean isRunnable = false;
    private final FileObject file;

    public FanNode(Project project, FileObject file, Children children)
    {
	super(children, Lookups.singleton(project));
	this.file = file;
	setDisplayName(file.getNameExt());
	// Set this attribute so we can access it from a Filenode
	// which will wrap this Node but not give acces to it directly
	// (Has to go through attributes)
	setValue(ATTR_NODE_FILEOBJECT, file);
    }

    /**
     * Recursively enhance this node and subnodes
     * Usually called on root node
     * Mostly set icon according to file type
     */
    protected static void enhanceNodeTree(FanNode rootNode)
    {
	rootNode.doIcon(rootNode.file);
	Children children = rootNode.getChildren();
	Node[] nodes = children.getNodes();
	for (int i = 0; i != nodes.length; i++)
	{
	    enhanceNodeTree((FanNode) nodes[i]);
	}
    }

    private void doIcon(FileObject dir)
    {
	// Deal with icon
	if (!dir.isFolder())
	{
	    if (dir.getNameExt().equalsIgnoreCase("build.fan"))
	    {
		setIconBaseWithExtension("net/colar/netbeans/fan/project/resources/fanBuild.png");
		((FanNode) getParentNode()).setIconBaseWithExtension("net/colar/netbeans/fan/fan.png");
		((FanNode) getParentNode()).isPod = true;
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
    public Action[] getActions(boolean popup)
    {
	Vector<Action> actions = new Vector();
	if (isRoot || isPod)
	{
	    actions.add(CommonProjectActions.copyProjectAction());
	    actions.add(CommonProjectActions.deleteProjectAction());
	    actions.add(CommonProjectActions.closeProjectAction());
	    actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_BUILD, "Build Project", null));
	}
	if (isPod)
	{
	    //
	}
	if (getChildren().getNodesCount() != 0)
	{
	    actions.add(CommonProjectActions.newFileAction());
	} else
	{
	    actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_RUN_SINGLE, "Run Fan file", null));
	}

	return actions.toArray(new Action[0]);
    }

}
