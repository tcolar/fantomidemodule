/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan;

import net.jot.persistance.JOTDBUpgrader;

/**
 * Handles DB upgrades
 * @author tcolar
 */
public class FanDbUpgrader extends JOTDBUpgrader
{
	private int VERSION = 1;

	@Override
	public void upgradeDb(int fromVersion) throws Exception
	{
	}

	@Override
	public int getLatestVersion()
	{
		return VERSION;
	}

}
