/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.api.extexecution.ExecutionDescriptor;
import org.netbeans.api.extexecution.ExecutionService;
import org.netbeans.spi.project.ActionProvider;
import org.openide.util.Lookup;

/**
 *
 * @author tcolar
 */
public class BuildAndRunFanPodAction extends FanAction
{
	// Make this the standard RUN command for now
	public static final String COMMAND_BUILD_RUN_FAN_POD = ActionProvider.COMMAND_RUN;

	public BuildAndRunFanPodAction(FanProject project)
	{
		super(project);
		
	}

	@Override
	public String getCommandId()
	{
		return COMMAND_BUILD_RUN_FAN_POD;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		ExecutionDescriptor descriptor = new ExecutionDescriptor().frontWindow(true).controllable(true).inputVisible(true).showProgress(true).showSuspended(true);

		FanExecutionGroup group = new FanExecutionGroup(buildPodAction(context), runPodAction(context, false));

		ExecutionService service =
				ExecutionService.newService(
				group,
				descriptor, "blah");

		service.run();
		//TODO: only build if files changed
		/*
		Future future = buildPodAction(context).run();
		Object result=null;
		try
		{
			if(future!=null)
				result=future.get();
		}catch(Exception e){e.printStackTrace();}
		// if build didn't fail, then run the pod.
		if(result!=null)
		{
			if(((Integer)result)==0)
				runPodAction(context, false);
		}*/
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
	{
		return true;
	}
}
