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

    //TODO: hardcoded !
    private final String FAN_HOME="/home/thibautc/fan/";
    private final boolean IS_WIN=System.getProperty("os.name").toLowerCase().indexOf("windows")!=0;

    private final String FAN_BIN=FAN_HOME+"bin"+File.separator+(IS_WIN?"fan.exe":"fan");

    public static FanPlatform getInstance()
    {
	return instance;
    }

    public String getFanBinaryPath()
    {
	return FAN_BIN;
    }
}
