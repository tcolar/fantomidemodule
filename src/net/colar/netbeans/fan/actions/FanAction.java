/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import java.util.concurrent.Future;
import javax.swing.JOptionPane;
import net.colar.netbeans.fan.platform.FanPlatform;
import net.colar.netbeans.fan.project.FanProject;
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
		JOptionPane.showMessageDialog(null, message, "Fan Launch Error", JOptionPane.ERROR_MESSAGE);

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

	protected Future runPodAction(Lookup lookup)
	{
		Node[] activatedNodes = getSelectedNodes();
		FileObject file = null;
		DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
		if (gdo != null && gdo.getPrimaryFile() != null)
		{
			file = gdo.getPrimaryFile();
		}
		if (file != null)
		{
			String podName = file.getName();
			String path = FileUtil.toFile(file.getParent()).getAbsolutePath();
			//TODO: make main method configurable
			String script = podName + "::" + "Main" + "." + "main";
			FanExecution fanExec = new FanExecution();
			fanExec.setDisplayName(file.getName());
			fanExec.setWorkingDirectory(path);
			fanExec.setCommand(FanPlatform.getInstance().getFanBinaryPath());
			fanExec.setCommandArgs(script);
			return fanExec.run();
		}
		return null;
	}

	private Future buildAction(Lookup lookup, String target)
	{
		Node[] activatedNodes = getSelectedNodes();
		FileObject file = null;
		DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
		if (gdo != null && gdo.getPrimaryFile() != null)
		{
			file = gdo.getPrimaryFile();
		}
		if (file != null)
		{
			FileObject buildFile = file.getFileObject("build.fan");
			if (buildFile != null)
			{
				String path = FileUtil.toFile(file).getAbsolutePath();
				String script = "build.fan "+target;
				FanExecution fanExec = new FanExecution();
				fanExec.setDisplayName(file.getName());
				fanExec.setWorkingDirectory(path);
				fanExec.setCommand(FanPlatform.getInstance().getFanBinaryPath());
				fanExec.setCommandArgs(script);
				return fanExec.run();
			}
		}
		return null;
	}
}
