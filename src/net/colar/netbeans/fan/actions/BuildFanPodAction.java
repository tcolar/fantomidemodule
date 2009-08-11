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
public class BuildFanPodAction extends FanAction
{
	public static final String COMMAND_BUILD_FAN_POD = "COMMAND_BUILD_FAN_POD";

	public BuildFanPodAction(FanProject project)
	{
		super(project);
	}

	@Override
	public String getCommandId()
	{
		return COMMAND_BUILD_FAN_POD;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		buildPodAction(context);
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
	{
		return true;
	}
}
