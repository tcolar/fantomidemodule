/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.project.FanProject;
import org.openide.util.Lookup;

/**
 *
 * @author tcolar
 */
public class RunTalesProjectAction extends FanAction
{
        public static final String COMMAND_RUN_WITH_TALES = "COMMAND_RUN_WITH_TALES";

	public RunTalesProjectAction(FanProject project)
	{
            super(project);
	}

	@Override
	public String getCommandId()
	{
		return COMMAND_RUN_WITH_TALES;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		runTalesProject(context, false).run();
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
	{
		return true;
	}
}
