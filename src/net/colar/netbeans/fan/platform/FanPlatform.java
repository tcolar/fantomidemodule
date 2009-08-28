/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.platform;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.java.classpath.GlobalPathRegistry;
import org.netbeans.spi.java.classpath.support.ClassPathSupport;

/**
 * Provides acces to "plaform" settings
 * For exampel FAN_HOME etc...
 * @author thibautc
 */
public class FanPlatform
{
	//TODO: should not be hardcoded

	private Set<ClassPath> sourcePaths = null;
	private final boolean IS_WIN = System.getProperty("os.name").toLowerCase().indexOf("windows") != -1;
	private static FanPlatform instance = new FanPlatform();
	private String fanHome;
	private String fanBin;
	private String fanshBin;
	private String fanSrc;

	public FanPlatform()
	{
		readSettings();
	}

	public void readSettings()
	{
		fanHome = FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_FAN_HOME);
		if (fanHome != null)
		{
			if (!fanHome.endsWith(File.separator))
			{
				fanHome += File.separator;
			}
			fanBin = fanHome + "bin" + File.separator + (IS_WIN ? "fan.exe" : "fan");
			fanshBin = fanHome + "bin" + File.separator + (IS_WIN ? "fansh.exe" : "fansh");
			fanSrc = fanHome + "src" + File.separator;
		}
		// force updating paths
		sourcePaths = null;
	}

	public static boolean checkFanHome(String path)
	{
		if (path != null)
		{
			File f = new File(path);
			if (f.exists() && f.isDirectory())
			{
				File exe = new File(path + File.separator + "bin", "fan");
				return exe.exists() && exe.isFile() /*&& exe.canExecute()*/;//TODO: fix
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
		if (checkNull && instance.fanHome == null)
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

	public String getFanSrcPath()
	{
		return fanSrc;
	}

	public String getFanShellBinaryPath()
	{
		return fanshBin;
	}

	/**
	 * Add Fan Source items (pods src)
	 * @return
	 */
	public synchronized Set<ClassPath> getSourceClassPaths()
	{
		if (sourcePaths == null && fanSrc != null)
		{
			sourcePaths = new HashSet<ClassPath>();
			File f = new File(fanSrc);
			File[] files = f.listFiles();
			for (File file : files)
			{
				if (file.isDirectory() && new File(file, "pod.fan").exists())
				{
					addFolder(new File(file, FanProject.HARDCODED_JAVA_SRC_FOLDER));
					addFolder(new File(file, FanProject.HARDCODED_FAN_SRC_FOLDER));
					addFolder(new File(file, FanProject.HARDCODED_TEST_SRC_FOLDER));
				}
			}
			GlobalPathRegistry.getDefault().register(ClassPath.SOURCE, sourcePaths.toArray(new ClassPath[sourcePaths.size()]));
		}
		return sourcePaths;
	}

	private void addFolder(File folder)
	{
		if (folder.exists() && folder.isDirectory())
		{
			ClassPath jcp = ClassPathSupport.createClassPath(folder.getAbsolutePath());
			sourcePaths.add(jcp);
			System.out.println("### " + folder.getAbsolutePath());
		}
	}
}
