/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.awt.Image;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.Action;
import net.colar.netbeans.fan.actions.BuildAndRunFanPodAction;
import net.colar.netbeans.fan.actions.BuildFanPodAction;
import net.colar.netbeans.fan.actions.RunFanPodAction;
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
 * Fan project individual Node (used within logical view)
 * @author tcolar
 */
public class FanNode extends FilterNode
{
	public static final Pattern MAIN_METHOD=Pattern.compile("Void\\s+main\\([^)]*\\)\\s*\\{");

	public static final String ATTR_NODE_FILEOBJECT = "NODE_FILEOBJECT";
	//TODO: are those vars working ?
	boolean isPod = false;
	boolean isRoot = false;
	boolean isRunnable = false;
	private final FileObject file;
	private String icon;
	private String desc;

	public FanNode(Project project, Node originalNode, org.openide.nodes.Children children, FileObject file)
	{
		super(originalNode, children, new ProxyLookup(new Lookup[]
				{
					Lookups.singleton(project),
					originalNode.getLookup()
				}));
		this.file = file;
		// customize the node
		if (file.isFolder())
		{
			//Customize interesting nodes according to folder/file type.
			if (file.getFileObject("build.fan") != null)
			{
				isPod = true;
			}
			if (isPod)
			{
				setIcon("net/colar/netbeans/fan/fan.png");
			} else if (getName().equalsIgnoreCase("fan"))
			{
				setIcon("net/colar/netbeans/fan/project/resources/folderFan.png");
				desc = "<b>Fan Sources</b>";
			} else if (file.getName().equalsIgnoreCase("java"))
			{
				setIcon("net/colar/netbeans/fan/project/resources/folderJava.png");
				desc = "<b>Java Sources</b>";
			} else if (file.getName().equalsIgnoreCase("test"))
			{
				setIcon("net/colar/netbeans/fan/project/resources/folderTest.png");
				desc = "<b>Unit Tests</b>";
			}
		} else
		{
			if (file.getNameExt().equalsIgnoreCase("build.fan"))
			{
				isRunnable = true;
				setIcon("net/colar/netbeans/fan/project/resources/fanBuild.png");
				desc = "<b>build.fan</b>";
			} else if (file.getExt().equalsIgnoreCase("fan"))
			{
				setIcon("net/colar/netbeans/fan/project/resources/fanFile.png");
			} else if (file.getExt().equalsIgnoreCase("fwt"))
			{
				setIcon("net/colar/netbeans/fan/project/resources/fanFwt.png");
			}

			if (file.getExt().equalsIgnoreCase("fan"))
			{
				if (isRunnable(file))
				{
					isRunnable = true;
				}
			}
		}
		//System.out.println("Node: " + file.getPath() + " " + (isRoot ? "project" : "") + (isPod ? "pod" : "")+(isRunnable ? "runnable" : ""));
	}

	/**
	 * Return list of actions available for this node.
	 * @param popup
	 * @return
	 */
	@Override
	public Action[] getActions(boolean popup)
	{
		Vector<Action> actions = new Vector();

		if (isRoot || isPod)
		{
			// project level actions
			actions.add(ProjectSensitiveActions.projectCommandAction(BuildAndRunFanPodAction.COMMAND_BUILD_RUN_FAN_POD, "Build & Run Pod", null));
			actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_BUILD, "Build Pod", null));
			actions.add(ProjectSensitiveActions.projectCommandAction(RunFanPodAction.COMMAND_RUN_FAN_POD, "Run Pod", null));
			actions.add(null);
			actions.add(ProjectSensitiveActions.projectCommandAction(RunFanShellAction.COMMAND_RUN_FAN_SHELL, "Start Fan Shell", null));
			actions.add(null);
			actions.add(CommonProjectActions.setAsMainProjectAction());
			actions.add(null);
			actions.add(CommonProjectActions.closeProjectAction());
			actions.add(SystemAction.get(PasteAction.class));
			actions.add(null);
			// TODO: rename ?
			// TODO: test / debug
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
				if (isRunnable)
				{
					actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_RUN_SINGLE, "Run Fan script", null));
				}
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
		if (icon == null)
		{
			return super.getIcon(arg0);
		}
		return ImageUtilities.loadImage(icon);
	}

	@Override
	public Image getOpenedIcon(int arg0)
	{
		return getIcon(arg0);
	}

	protected void setIcon(String ic)
	{
		icon = ic;
	}

	@Override
	public String getHtmlDisplayName()
	{
		if (desc == null)
		{
			return super.getHtmlDisplayName();
		}
		return desc;
	}

	private boolean isRunnable(FileObject file)
	{
		boolean result=false;
		try
		{
			// look for main method
			result=MAIN_METHOD.matcher(file.asText()).find();
		}catch(Exception e){}
		return result;
	}
}
