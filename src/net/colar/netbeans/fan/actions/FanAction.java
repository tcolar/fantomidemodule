/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import java.util.concurrent.Future;
import javax.swing.JOptionPane;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.platform.FanPlatform;
import net.colar.netbeans.fan.project.FanProject;
import net.colar.netbeans.fan.project.FanProjectProperties;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.windows.TopComponent;

/**
 * Command / Action Base
 * Copied/modified from Python module
 */
public abstract class FanAction
{

	private final FanProject project;

	public FanAction(FanProject project)
	{
		this.project = project;
		assert project != null;
	}

	public abstract String getCommandId();

	public abstract void invokeAction(Lookup context) throws IllegalArgumentException;

	public abstract boolean isActionEnabled(Lookup context) throws IllegalArgumentException;

	public boolean asyncCallRequired()
	{
		return true;
	}

	public boolean saveRequired()
	{
		return true;
	}

	public final FanProject getProject()
	{
		return project;
	}

	public Node[] getSelectedNodes()
	{
		return TopComponent.getRegistry().getCurrentNodes();
	}

	protected void showLaunchError(String message)
	{
		JOptionPane.showMessageDialog(null, message, "Fantom Launch Error", JOptionPane.ERROR_MESSAGE);

	}

	protected Future buildPodAction(Lookup lookup)
	{
		// run default target (build)
		return buildAction(lookup, "");
	}

	protected Future cleanPodAction(Lookup lookup)
	{
		// run default target (build)
		return buildAction(lookup, "clean");
	}

	protected Future testPodAction(Lookup lookup)
	{
		// run default target (build)
		return buildAction(lookup, "test");
	}

	protected Future customBuildAction(Lookup lookup, String buildTarget)
	{
		// run default target (build)
		return buildAction(lookup, buildTarget);
	}

	protected Future runPodAction(Lookup lookup, boolean debug)
	{
		FileObject file = findTargetProject(lookup);
		if (file != null)
		{
			String podName = file.getName();
			String path = FileUtil.toFile(file.getParent()).getAbsolutePath();
			// see if user specified custom main method
			String target = podName + "::" + FanProjectProperties.getProperties(project).getMainMethod();
			if (target == null || target.length() == 0)
			{
				// otherwise use default
				target = podName + "::" + "Main" + "." + "main";
			}
			FanExecution fanExec = new FanExecution();
			fanExec.setDisplayName((debug ? "Debug " : "") + file.getName());
			fanExec.setWorkingDirectory(path);
			FanPlatform.getInstance().buildFanCall(fanExec, debug);
			fanExec.addCommandArg(FanPlatform.FAN_CLASS);
			fanExec.addCommandArg(target);
			return fanExec.run();
		}
		return null;
	}

	/**
	 * "OLD" way of calling fan using the fan wrapper script
	 * @param lookup
	 * @param target
	 * @return
	 */
	/*private Future buildActionExternal(Lookup lookup, String target)
	{
	// if default target "", see what user chose in props;
	if (target.equals(""))
	{
	String newTarget = FanProjectProperties.getProperties(project).getBuildTarget();
	if (newTarget != null)
	{
	target = newTarget;
	}
	}
	FileObject file = findTargetProject(lookup);
	if (file != null)
	{
	FileObject buildFile = file.getFileObject("build.fan");
	if (buildFile != null)
	{
	String path = FileUtil.toFile(file).getAbsolutePath();
	FanExecution fanExec = new FanExecution();
	fanExec.setDisplayName(file.getName());
	fanExec.setWorkingDirectory(path);
	fanExec.setCommand(FanPlatform.getInstance().getFanBinaryPath());
	fanExec.addCommandArg("build.fan");
	fanExec.addCommandArg(target);
	return fanExec.run();
	}
	}
	return null;
	}*/
	/**
	 * Call the action using internal call to Fan java class (not the wrapper scripts).
	 * @param lookup
	 * @param target
	 * @return
	 */
	private Future buildAction(Lookup lookup, String target/*, String extraParams*/)
	{
		// if default target "", see what user chose in props;
		if (target.equals(""))
		{
			String newTarget = FanProjectProperties.getProperties(project).getBuildTarget();
			if (newTarget != null)
			{
				target = newTarget;
			}
		}
		FileObject file = findTargetProject(lookup);
		if (file != null)
		{
			FileObject buildFile = file.getFileObject("build.fan");
			if (buildFile != null)
			{
				String path = FileUtil.toFile(file).getAbsolutePath();
				FanExecution fanExec = new FanExecution();
				fanExec.setDisplayName(file.getName());
				fanExec.setWorkingDirectory(path);
				FanPlatform.getInstance().buildFanCall(fanExec);
				fanExec.addCommandArg(FanPlatform.FAN_CLASS);
				fanExec.addCommandArg("build.fan");
				fanExec.addCommandArg(target);
				return fanExec.run();
			}
		}
		return null;
	}

	/**
	 * TODO If the user "selects" a project node it will run that one rather
	 * than the 'actual' main project (when running main project)\
	 * But to avoid that i would have to setup separate actions for running a project from contextual menu
	 * vs running it from "run main project" button .... which seems a bit silly.
	 * @param lookup
	 * @return
	 */
	private FileObject findTargetProject(Lookup lookup)
	{
		FileObject file = null;
		Node[] activatedNodes = getSelectedNodes();
		if (activatedNodes != null && activatedNodes.length > 0)
		{
			DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
			if (gdo != null && gdo.getPrimaryFile() != null)
			{
				file = gdo.getPrimaryFile();
				if (FanProject.isProject(file))
				{
					return file;
				}
			}
		}
		// If we get there, current selected item is NOT a project
		// so use the "main" one
		// use "main project", if fan project
		Project prj = OpenProjects.getDefault().getMainProject();
		if (prj != null && FanProject.isProject(prj.getProjectDirectory()))
		{
			return OpenProjects.getDefault().getMainProject().getProjectDirectory();
		}
		// try to fall back to the selected item project folder
		return file==null?null
				: FileUtil.toFileObject(FanUtilities.getPodFolderForPath(file.getPath()));
	}
}
