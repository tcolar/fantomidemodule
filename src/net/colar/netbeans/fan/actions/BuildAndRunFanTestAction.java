/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.api.extexecution.ExecutionService;
import org.netbeans.spi.project.ActionProvider;
import org.openide.util.Lookup;

/**
 *
 * @author tcolar
 */
public class BuildAndRunFanTestAction extends FanAction
{
	public BuildAndRunFanTestAction(FanProject project)
	{
		super(project);		
	}

	@Override
	public String getCommandId()
	{
		return ActionProvider.COMMAND_TEST;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		//TODO: only build if files changed ?
		FanExecutionGroup group = new FanExecutionGroup(
				buildPodAction(context),
				testFileAction(context, RunFanTest.getFileName(context, getSelectedNodes())));

		ExecutionService service =
				ExecutionService.newService(
				group,
				descriptor, getProjectName(context));

		service.run();
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
	{
		return true;
	}
}
