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
public class CleanAndBuildFanPodAction extends FanAction
{
	public CleanAndBuildFanPodAction(FanProject project)
	{
		super(project);
	}

	@Override
	public String getCommandId()
	{
		// std clean&build action
		return ActionProvider.COMMAND_REBUILD;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		FanExecutionGroup group = new FanExecutionGroup(cleanPodAction(context), runPodAction(context, false));
		//group.call();
		/*Future future = cleanPodAction(context);
		Object result=null;
		try
		{
			if(future!=null)
				result=future.get();
		}catch(Exception e){e.printStackTrace();}
		// if clean didn't fail, then run the build.
		if(result!=null)
		{
			if(((Integer)result)==0)
				buildPodAction(context);
		}*/
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
	{
		return true;
	}
}
