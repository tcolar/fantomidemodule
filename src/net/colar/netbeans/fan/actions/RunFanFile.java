/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.FanLanguage;
import net.colar.netbeans.fan.platform.FanPlatform;
import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.spi.project.ActionProvider;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.util.Lookup;

/**
 * Run a single fan file (.fan, .fwt)
 * @author tcolar
 */
public class RunFanFile extends FanAction
{

	protected boolean isTest;

	public RunFanFile(FanProject project, boolean isTest)
	{
		super(project);
		this.isTest = isTest;
	}

	@Override
	public String getCommandId()
	{
		// std run single command
		return ActionProvider.COMMAND_RUN_SINGLE;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		Node[] activatedNodes = getSelectedNodes();
		FileObject file = null;
		DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
		if (gdo != null && gdo.getPrimaryFile() != null)
		{
			file = gdo.getPrimaryFile();
		}
		if (file != null && file.getMIMEType().equals(FanLanguage.FAN_MIME_TYPE))
		{
			String path = FileUtil.toFile(file.getParent()).getAbsolutePath();
			String script = FileUtil.toFile(file).getAbsolutePath();

			FanExecution fanExec = new FanExecution();
			fanExec.setDisplayName(file.getName());
			fanExec.setWorkingDirectory(path);
			fanExec.setCommand(FanPlatform.getInstance().getFanBinaryPath());
			fanExec.setCommandArgs(script);

			fanExec.run();
		}
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
	{
		boolean results = false;
		Node[] activatedNodes = getSelectedNodes();
		if (activatedNodes != null && activatedNodes.length > 0)
		{
			DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
			if (gdo != null && gdo.getPrimaryFile() != null)
			{
				results = gdo.getPrimaryFile().getMIMEType().equals(
						FanLanguage.FAN_MIME_TYPE);
			}
		}
		return results;
	}
}
