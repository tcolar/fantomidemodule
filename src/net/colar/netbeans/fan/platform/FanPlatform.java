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
    private static FanPlatform instance=new FanPlatform();

    //TODO: hardcoded - Need global Fan prefs.
    private final String FAN_HOME="/home/tcolar/fan/";
    private final boolean IS_WIN=System.getProperty("os.name").toLowerCase().indexOf("windows")!=-1;

    private final String FAN_BIN=FAN_HOME+"bin"+File.separator+(IS_WIN?"fan.exe":"fan");
    private final String FANSH_BIN=FAN_HOME+"bin"+File.separator+(IS_WIN?"fansh.exe":"fansh");

    public static FanPlatform getInstance()
    {
	return instance;
    }

    public String getFanBinaryPath()
    {
	return FAN_BIN;
    }

    public String getFanShellBinaryPath()
    {
	return FANSH_BIN;
    }
}
