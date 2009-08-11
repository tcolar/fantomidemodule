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
public class TestFanPodAction extends FanAction
{
	public TestFanPodAction(FanProject project)
	{
		super(project);
	}

	@Override
	public String getCommandId()
	{
		// std test action
		return ActionProvider.COMMAND_TEST;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		testPodAction(context);
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
	{
		return true;
	}
}
