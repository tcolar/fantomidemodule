/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.platform;

import java.util.prefs.Preferences;
import org.openide.util.NbPreferences;

/**
 * Platform Settings support for Fan
 * uch as FAN_HOME
 * @author tcolar
 */
public class FanPlatformSettings
{

	public static final String PREF_FAN_HOME = "net.colar.netbeans.fan.prefs.FAN_HOME";
	public static final String PREF_DEBUG_PORT = "net.colar.netbeans.fan.prefs.DEBUG_PORT";
	public static final String PREF_RUN_OPTIONS = "net.colar.netbeans.fan.prefs.RUN_OPTIONS";

	private static final FanPlatformSettings instance = new FanPlatformSettings();
	private Preferences prefs;

	public static FanPlatformSettings getInstance()
	{
		return instance;
	}

	private FanPlatformSettings()
	{
		prefs = NbPreferences.forModule(FanPlatformSettings.class);
	}

	public String get(String key)
	{
		return get(key, null);
	}

	public String get(String key, String defaultVal)
	{
		return prefs.get(key, defaultVal);
	}

	public void put(String key, String value)
	{
		prefs.put(key, value);
		try
		{
			prefs.flush();
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}
}
