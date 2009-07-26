/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.FanTokenID;
import net.colar.netbeans.fan.platform.FanPlatform;
import net.colar.netbeans.fan.project.FanNode;
import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.spi.project.ActionProvider;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.nodes.FilterNode;
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
	return ActionProvider.COMMAND_RUN_SINGLE;
    }

    @Override
    public void invokeAction(Lookup context) throws IllegalArgumentException
    {
	Node[] activatedNodes = getSelectedNodes();
	FilterNode nd=(FilterNode)activatedNodes[0];
	FileObject file = (FileObject)nd.getValue(FanNode.ATTR_NODE_FILEOBJECT);
	if (file.getMIMEType().equals(FanTokenID.FAN_MIME_TYPE))
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
	System.err.println("Active nodes: "+activatedNodes.length);
	if (activatedNodes != null && activatedNodes.length > 0)
	{
	System.err.println("lookups : "+activatedNodes[0].getLookup().toString());
	    DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
	    if (gdo != null && gdo.getPrimaryFile() != null)
	    {
		results = gdo.getPrimaryFile().getMIMEType().equals(
			FanTokenID.FAN_MIME_TYPE);
	    }
	}
	return results;
    }
}
