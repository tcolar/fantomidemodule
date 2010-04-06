/*
 * Thibaut Colar Mar 10, 2010
 */
package net.colar.netbeans.fan.test;

import java.util.prefs.Preferences;
import net.colar.netbeans.fan.FanModuleInstall;
import net.colar.netbeans.fan.platform.FanPlatform;
import net.colar.netbeans.fan.platform.FanPlatformSettings;
import net.colar.netbeans.fan.test.mock.MockLookup;
import net.jot.testing.JOTTestable;
import org.netbeans.junit.internal.MemoryPreferencesFactory;

/**
 * Base class for CSL tests, which require a minimal Netbeans "Env" to be available
 * Also craetes the platform and update the Type indexes.
 * @author thibautc
 */
public abstract class FantomCSLTest implements JOTTestable
{

	public void jotTest() throws Throwable
	{
		// Set netbeans props
		System.setProperty("netbeans.full.hack", "true"); // NOI18N
		System.setProperty("java.util.prefs.PreferencesFactory",
			MemoryPreferencesFactory.class.getName());//NOI18N
		Preferences.userRoot().sync();
		// Addd the required trampoline impl.
		MockLookup.setInstances(new MockTrampoline());

		// Setup the test Platform
		FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_FAN_HOME, FantomParserTest.FAN_HOME);
		FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_DEBUG_PORT, "8080");
		FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_RUN_OPTIONS, "-Xmx256m");
		FanPlatform.updateFromSettings();

		// Initialize the module (JavaOnTracks startup hooks)
		FanModuleInstall mi = new FanModuleInstall();
		// Note: this will run the indexer (might take a while the first time)
		mi.restored();

		try
		{
			// Run the user test
			cslTest();
		} catch (Throwable t)
		{
			throw(t);
		} finally
		{
			// try to always shutdown properly
			mi.closing();
		}
	}

	/**
	 * Implement and fill with your test code
	 * @throws Throwable
	 */
	public abstract void cslTest() throws Throwable;
}
