/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.platform.FanPlatform;
import net.colar.netbeans.fan.project.FanProject;
import org.openide.util.Lookup;

/**
 * Runs the Fan interactive shell.
 * @author tcolar
 */
public class RunFanShellAction extends FanAction
{
    public static final String COMMAND_RUN_FAN_SHELL="COMMAND_RUN_FAN_SHELL";

    public RunFanShellAction(FanProject project)
    {
	super(project);
    }

    @Override
    public String getCommandId()
    {
	return COMMAND_RUN_FAN_SHELL;
    }

    @Override
    public void invokeAction(Lookup context) throws IllegalArgumentException
    {
	    FanExecution fanExec = new FanExecution();
	    fanExec.setDisplayName("Fan Shell (fansh)");
	    //fanExec.setWorkingDirectory(path);
	    fanExec.setCommand(FanPlatform.getInstance().getFanShellBinaryPath());

	    fanExec.run();
    }

    @Override
    public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
    {
	return true;
    }

}
