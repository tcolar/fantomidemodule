/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.platform;

import java.io.File;

/**
 *
 * @author thibautc
 */
public class FanPlatform
{

    private final boolean IS_WIN = System.getProperty("os.name").toLowerCase().indexOf("windows") != -1;

    private static FanPlatform instance = new FanPlatform();

    private String fanHome;
    private String fanBin;
    private String fanshBin;

    public FanPlatform()
    {
	readSettings();
    }

    public void readSettings()
    {
	fanHome=FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_FAN_HOME);
	if(!fanHome.endsWith(File.separator))
	    fanHome+=File.separator;
	if(fanHome!=null)
	{
	    fanBin = fanHome + "bin" + File.separator + (IS_WIN ? "fan.exe" : "fan");
	    fanshBin = fanHome + "bin" + File.separator + (IS_WIN ? "fansh.exe" : "fansh");
	}
    }

    public static boolean checkFanHome(String path)
    {
	if (path != null)
	{
	    File f = new File(path);
	    if (f.exists() && f.isDirectory())
	    {
		File exe = new File(path + File.separator + "bin", "fan");
		return exe.exists() && exe.isFile() && exe.canExecute();
	    }
	}
	return false;
    }

    public static FanPlatform getInstance()
    {
	return getInstance(true);
    }

    public static FanPlatform getInstance(boolean checkNull)
    {
	if(instance.fanHome==null)
	{
	    //TODO: handle this cleanly (warning dialog)
	    throw new RuntimeException("Fan Home is undefined, update Netbeans options!");
	}
	return instance;
    }

    public String getFanBinaryPath()
    {
	return fanBin;
    }

    public String getFanShellBinaryPath()
    {
	return fanshBin;
    }
}
