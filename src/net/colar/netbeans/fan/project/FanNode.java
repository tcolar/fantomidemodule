/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.awt.Image;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.Action;
import net.colar.netbeans.fan.actions.BuildAndRunFanPodAction;
import net.colar.netbeans.fan.actions.DebugFanPodAction;
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

	public static final Pattern MAIN_METHOD = Pattern.compile("Void\\s+main\\([^)]*\\)\\s*\\{");
	public static final String ATTR_NODE_FILEOBJECT = "NODE_FILEOBJECT";
	boolean isPod = false;
	boolean isRoot = false;
	boolean isRunnable = false;
	private final FileObject file;
	private String icon;
	private String desc;
	private Vector<Action> actions;

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
		actions = new Vector<Action>();

		if (isRoot || isPod)
		{
			// project level actions
			putAction(CommonProjectActions.newFileAction());
			putAction(null);
			putAction(ProjectSensitiveActions.projectCommandAction(BuildAndRunFanPodAction.COMMAND_BUILD_RUN_FAN_POD, "Build & Run Pod", null));
			putAction(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_BUILD, "Build Pod", null));
			putAction(ProjectSensitiveActions.projectCommandAction(RunFanPodAction.COMMAND_RUN_FAN_POD, "Run Pod", null));
			putAction(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_CLEAN, "Clean Pod", null));
			putAction(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_REBUILD, "Clean & Build Pod", null));
			putAction(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_TEST, "Test Pod", null));
			putAction(null);
			putAction(ProjectSensitiveActions.projectCommandAction(DebugFanPodAction.COMMAND_DEBUG_FAN_POD, "Build & Debug Pod", null));
			putAction(null);
			putAction(ProjectSensitiveActions.projectCommandAction(RunFanShellAction.COMMAND_RUN_FAN_SHELL, "Start Fan Shell", null));
			putAction(null);
			putAction(SystemAction.get(FindAction.class));
			putAction(SystemAction.get(PasteAction.class));
			putAction(CommonProjectActions.renameProjectAction());
			putAction(CommonProjectActions.deleteProjectAction());
			putAction(null);
			putAction(CommonProjectActions.setAsMainProjectAction());
			putAction(CommonProjectActions.closeProjectAction());
		} else
		{
			// Folder actions
			if (getChildren().getNodesCount() != 0)
			{
				putAction(CommonProjectActions.newFileAction());
				putAction(SystemAction.get(FindAction.class));
				putAction(null);
				putAction(SystemAction.get(PasteAction.class));
			} else
			// item actions
			{
				putAction(SystemAction.get(OpenAction.class));
				if (isRunnable)
				{
					putAction(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_RUN_SINGLE, "Run Fan script", null));
					putAction(null);
				}
			}

			putAction(SystemAction.get(CopyAction.class));
			putAction(SystemAction.get(CutAction.class));
			putAction(SystemAction.get(DeleteAction.class));
			putAction(null);
			putAction(SystemAction.get(RenameAction.class));
		}

		// add OTHER standard actions
		putAction(null);
		putAction(SystemAction.get(ToolsAction.class));
		putAction(SystemAction.get(FileSystemAction.class));

		if (isRoot || isPod)
		{ // put props last always
			putAction(null);
			putAction(CommonProjectActions.customizeProjectAction());
		}
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
		boolean result = false;
		try
		{
			// look for main method
			result = MAIN_METHOD.matcher(file.asText()).find();
		} catch (Exception e)
		{
		}
		return result;
	}

	private void putAction(Action action)
	{
		actions.add(action);
	}
}
