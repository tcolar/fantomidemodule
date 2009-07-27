/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.awt.Image;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.Action;
import net.colar.netbeans.fan.actions.RunFanShellAction;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.ui.support.CommonProjectActions;
import org.netbeans.spi.project.ui.support.ProjectSensitiveActions;
import org.openide.filesystems.FileObject;
import org.openide.nodes.Node;
import org.openide.util.lookup.Lookups;
import org.openide.actions.*;
import org.openide.nodes.FilterNode;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.ProxyLookup;

/**
 * Fan project Nodes (used within logical view)
 * @author tcolar
 */
public class FanNode extends FilterNode
{

    public static final String ATTR_NODE_FILEOBJECT = "NODE_FILEOBJECT";
    //TODO: are those vars working ?
    boolean isPod = false;
    boolean isRoot = false;
    boolean isRunnable = false;
    Project project;
    //FileObject file;
    //private String icon;

    public FanNode(Project project, Node originalNode, FileObject file)
    {
	super(originalNode, new FilterNode.Children(originalNode),
		//The projects system wants the project in the Node's lookup.
		//NewAction and friends want the original Node's lookup.
		//Make a merge of both:
		new ProxyLookup(new Lookup[]
		{
		    Lookups.singleton(project),
		    originalNode.getLookup()
		}));
	this.project = project;
	//this.file=file;
	//setDisplayName(file.getNameExt());
	//doIcon(file);
    }

    /*private void doIcon(FileObject dir)
    {
	// Deal with icon
	if (!dir.isFolder())
	{
	    if (dir.getNameExt().equalsIgnoreCase("build.fan"))
	    {
		setIcon("net/colar/netbeans/fan/project/resources/fanBuild.png");
		((FanNode) getParentNode()).setIcon("net/colar/netbeans/fan/fan.png");
		((FanNode) getParentNode()).isPod = true;
	    } else if (dir.getExt().equalsIgnoreCase("fan"))
	    {
		setIcon("net/colar/netbeans/fan/project/resources/fanFile.png");
	    } else if (dir.getExt().equalsIgnoreCase("fwt"))
	    {
		setIcon("net/colar/netbeans/fan/project/resources/fanFwt.png");
	    }

	} else
	{
	    if (dir.getName().equalsIgnoreCase("fan"))
	    {
		setIcon("net/colar/netbeans/fan/project/resources/folderFan.png");
	    } else if (dir.getName().equalsIgnoreCase("java"))
	    {
		setIcon("net/colar/netbeans/fan/project/resources/folderJava.png");
	    } else if (dir.getName().equalsIgnoreCase("test"))
	    {
		setIcon("net/colar/netbeans/fan/project/resources/folderTest.png");
	    } else
	    {
		setIcon("net/colar/netbeans/fan/project/resources/folder.png");
	    }
	}
    }*/

    @Override
    public Action[] getActions(boolean popup)
    {
	Vector<Action> actions = new Vector();

	if (isRoot || isPod)
	{
	    // project level actions
	    actions.add(CommonProjectActions.newFileAction());
	    actions.add(null);
	    actions.add(ProjectSensitiveActions.projectCommandAction(RunFanShellAction.COMMAND_RUN_FAN_SHELL, "Start Fan Shell", null));
	    actions.add(null);
	    //actions.add(CommonProjectActions.copyProjectAction());
	    actions.add(CommonProjectActions.deleteProjectAction());
	    actions.add(CommonProjectActions.closeProjectAction());
	    actions.add(SystemAction.get(PasteAction.class));

	    actions.add(null);
	    actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_BUILD, "Build", null));
	    // TODO: rename ?
	    // TODO: run (build.fan)
	    // TODO: debug
	} else
	{
	    // Folder actions
	    if (getChildren().getNodesCount() != 0)
	    {
		actions.add(CommonProjectActions.newFileAction());
		actions.add(SystemAction.get(FindAction.class));
		actions.add(SystemAction.get(PasteAction.class));
	    } else
	    // item actions
	    {
		actions.add(SystemAction.get(OpenAction.class));
		actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_RUN_SINGLE, "Run Fan file", null));
	    }

	    actions.add(null);
	    actions.add(SystemAction.get(CopyAction.class));
	    actions.add(SystemAction.get(CutAction.class));
	    actions.add(SystemAction.get(DeleteAction.class));
	    actions.add(null);
	    actions.add(SystemAction.get(RenameAction.class));
	}

	// standard actions
	actions.add(null);
	Action[] stdActions = super.getActions(popup);
	List list = Arrays.asList(stdActions);
	actions.addAll(list);

	return actions.toArray(new Action[0]);
    }

    @Override
    public Image getIcon(int arg0)
    {
	return ImageUtilities.loadImage("net/colar/netbeans/fan/fan.png");
    }

}
