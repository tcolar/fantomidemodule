/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.actions;

import java.util.concurrent.Future;
import net.colar.netbeans.fan.project.FanProject;
import org.openide.util.Lookup;

/**
 *
 * @author tcolar
 */
public class BuildAndRunFanPodAction extends FanAction
{
	public static final String COMMAND_BUILD_RUN_FAN_POD = "COMMAND_BUILD_RUN_FAN_POD";

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
		//TODO: only build if files changed
		Future future = buildPodAction(context);
		Object result=null;
		try
		{
			result=future.get();
		}catch(Exception e){e.printStackTrace();}
		// if build didn't fail, then run the pod.
		if(result!=null && !future.isCancelled())
		{
			if(((Integer)result)==0)
				runPodAction(context);
		}
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
	{
		return true;
	}
}
