/*
 * Thibaut Colar Nov 30, 2009
 */
package net.colar.netbeans.fan.indexer;

import fan.sys.Sys;
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

/**
 * Classloader made of the java jars plus the fan jars
 *
 * TODO: have this update when jars chnages in getExtUrls() are modified.
 * @author thibautc
 */
public class FanJavaClassLoader extends URLClassLoader
{

	public FanJavaClassLoader()
	{
		// create with the standard jars + the fan jars
		super(getExtUrls(), FanJavaClassLoader.class.getClassLoader());
	}

	/**
	 * Fan jars, see: Fantom's src/sys/java/fan/sys/FanClassLoader.java
	 * @return
	 */
	public static URL[] getExtUrls()
	{
		try
		{
			String sep = File.separator;
			File extDir = new File(Sys.HomeDir, "lib" + sep + "java" + sep + "ext");
			File platDir = new File(extDir, Sys.platform());
			ArrayList acc = new ArrayList();
			addExtJars(acc, extDir);
			addExtJars(acc, platDir);
			return (URL[]) acc.toArray(new URL[acc.size()]);
		} catch (Exception e)
		{
			e.printStackTrace();
			return new URL[0];
		}
	}

	private static void addExtJars(ArrayList acc, File extDir) throws Exception
	{
		File[] list = extDir.listFiles();
		for (int i = 0; list != null && i < list.length; ++i)
		{
			if (list[i].getName().endsWith(".jar"))
			{
				acc.add(list[i].toURI().toURL());
			}
		}
	}

	protected Class find(String name) throws ClassNotFoundException
	{
		Class c = findLoadedClass(name);
		if (c == null)
		{
			try
			{
				System.out.println("find class: " + name);
				c = findClass(name);
			} catch (Throwable t)
			{
				t.printStackTrace();
			}
		}
		return c;
	}
}


