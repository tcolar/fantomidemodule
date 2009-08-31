/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.actions;

import java.util.concurrent.Future;
import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.spi.project.ActionProvider;
import org.openide.util.Lookup;

/**
 *
 * @author tcolar
 */
public class DebugFanPodAction extends FanAction
{
	public static final String COMMAND_DEBUG_FAN_POD = ActionProvider.COMMAND_DEBUG;

	public DebugFanPodAction(FanProject project)
	{
		super(project);
	}

	@Override
	public String getCommandId()
	{
		return COMMAND_DEBUG_FAN_POD;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		//TODO: only build if files changed
		Future future = buildPodAction(context);
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
				// true = debug mode
				runPodAction(context, true);
		}
		// TODO: attach to it standrad code ??
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
	{
		return true;
	}
}
