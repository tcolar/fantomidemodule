/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.platform;

import javax.tools.FileObject;
import org.openide.util.Task;

/**
 *
 * @author thibautc
 */
public class FanExecutor
{

    public void runFanScript(FileObject fanFile)
    {
	Task task=new Task(new FanScriptRunner(fanFile));
	task.run();
    }

    private class FanScriptRunner implements Runnable
    {
	private final FileObject fanFile;
	public FanScriptRunner(FileObject fanFile)
	{
	    this.fanFile=fanFile;
	}

	public void run()
	{
	    String fan=FanPlatform.getInstance().getFanBinaryPath();
	    try
	    {
		Process p=Runtime.getRuntime().exec(fan);
		p.waitFor();
	    }
	    catch(Exception e)
	    {
		e.printStackTrace();
	    }
	}
    }
}