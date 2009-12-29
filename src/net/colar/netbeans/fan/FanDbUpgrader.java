/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan;

import net.jot.db.JOTDBManager;
import net.jot.persistance.JOTDBUpgrader;
import net.jot.persistance.JOTPersistanceManager;

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
		// TODO: For now just whipeout the DB and let it rebuild ?
	}

	@Override
	public int getLatestVersion()
	{
		return VERSION;
	}

}
