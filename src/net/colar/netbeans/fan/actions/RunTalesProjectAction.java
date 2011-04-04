/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Future;
import net.colar.netbeans.fan.project.FanProject;
import org.openide.awt.HtmlBrowser;
import org.openide.util.Lookup;

/**
 *
 * @author tcolar
 */
public class RunTalesProjectAction extends FanAction {

	public static final String COMMAND_RUN_WITH_TALES = "COMMAND_RUN_WITH_TALES";
	private static Future<Integer> handle;
	boolean debug = false;

	public RunTalesProjectAction(FanProject project) {
		super(project);
	}

	@Override
	public String getCommandId() {
		return COMMAND_RUN_WITH_TALES;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException {
		handle = runTalesProject(context, debug).run();
		HtmlBrowser.URLDisplayer displayer = HtmlBrowser.URLDisplayer.getDefault();
		try {
			Thread.sleep(2000);
			displayer.showURLExternal(new URL("http://127.0.0.1:8000/"));
		} catch (MalformedURLException e) {
		} catch (InterruptedException e) {
		}
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException {
		return true;
	}

	/**
	 * Try to shutdown properly
	 */
	public static void shutdown() {
		if (handle != null && !handle.isDone()) {
			handle.cancel(true);
		}
	}
}
