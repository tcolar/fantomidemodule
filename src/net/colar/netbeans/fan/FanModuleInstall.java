/*
 * Thibaut Colar Dec 18, 2009
 */
package net.colar.netbeans.fan;

import net.jot.JOTInitializer;
import org.openide.filesystems.FileUtil;
import org.openide.modules.ModuleInstall;

/**
 * Module startup/shutdown hooks.
 * @author thibautc
 */
public class FanModuleInstall extends ModuleInstall
{

	/**
	 * Startup
	 */
	@Override
	public void restored()
	{

		// Initialize special logging as needed
		FanNBLogging.setupLogging();
		String jotPrefs = getClass().getClassLoader().getResource("net/colar/netbeans/fan/jot.prefs").getFile();
		System.setProperty("jot.prefs", jotPrefs);
		System.out.println("Starting up Fantom plugin.");
		super.restored();
		try
		{
			JOTInitializer.getInstance().init();
			RunTest.main(null);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Shutdown
	 * @return
	 */
	@Override
	public boolean closing()
	{
		System.out.println("Shutting down Fantom plugin.");
		try
		{
			JOTInitializer.getInstance().destroy();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return super.closing();
	}
}
