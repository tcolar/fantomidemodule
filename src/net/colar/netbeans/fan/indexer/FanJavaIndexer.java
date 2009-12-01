/*
 * Thibaut Colar Nov 30, 2009
 */
package net.colar.netbeans.fan.indexer;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipException;

/**
 * Indexer for the Java classes / jars
 * JVM + the ones in Fan repo.
 *
 * Helper method to find / resolve Java types
 * @author thibautc
 */
public class FanJavaIndexer
{

	private FanJavaClassLoader cl;
	private static FanJavaIndexer instance;
	ArrayList<String> packages = new ArrayList();
	ArrayList<String> classes = new ArrayList();
	ArrayList interfaces = new ArrayList();
	ArrayList enums = new ArrayList();
	ArrayList annotations = new ArrayList();

	private FanJavaIndexer()
	{
		super();
	}

	public static FanJavaIndexer getInstance()
	{
		if (instance == null)
		{
			instance = new FanJavaIndexer();
			instance.cl = new FanJavaClassLoader();
			try
			{
				instance.indexJavaItems();
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		return instance;
	}

	public Class findClass(String name) throws ClassNotFoundException
	{
		return cl.find(name);
	}

	/**
	 * Builds an index of all the java classes/interfaces and so on
	 */
	private void indexJavaItems() throws IOException
	{
		long start = new Date().getTime();
		ArrayList<URL> urls = new ArrayList<URL>();
		// adding Fan jars
		URL[] fanUrls = FanJavaClassLoader.getExtUrls();
		for (URL url : fanUrls)
		{
			urls.add(url);
		}
		// JVM boot cp
		String lib = System.getProperty("java.home", "") + File.separator + File.separator + "lib" + File.separator;
		String[] cps = System.getProperty("sun.boot.class.path", "").split(File.pathSeparator);
		for (String cp : cps)
		{
			String f = new File(cp).getName();
			// skip those large resources jars to save time.
			if (f.equals("deploy.jar") || f.equals("charsets.jar") || f.equals("javaws.jar"))
			{
				continue;
			}
			System.out.println("jbcp: " + cp);
			urls.add(new URL("file://" + cp));
		}
		// use lib/rt.jar as the backup
		if (cps.length == 0)
		{
			String cp = lib + "rt.jar";
			System.out.println("jrtcp: " + cp);
			urls.add(new URL("file://" + cp));
		}
		// lib/ext/*
		File[] ext = new File(lib + "ext").listFiles();
		for (File jar : ext)
		{
			System.out.println("jecp: " + jar.getAbsolutePath());
			urls.add(new URL("file://" + jar.getAbsolutePath()));
		}
		// Not adding java.classpath because it has all kind of Netbeans stuff we don't want

		// Browsing and finidng items
		for (URL url : urls)
		{
			String f = url.getFile();
			System.out.println("F   " + f);
			if (f.toLowerCase().endsWith(".jar"))
			{
				if (new File(f).exists())
				{
					JarFile jar = new JarFile(f);

					Enumeration<JarEntry> jarEntries = jar.entries();
					while (jarEntries.hasMoreElements())
					{
						JarEntry entry = jarEntries.nextElement();
						String ename = entry.getName();
						if (ename.toLowerCase().endsWith(".class"))
						{
							String cname = ename.substring(0, ename.length() - 6).replaceAll(File.separator, ".");
							try
							{
								// trying to findclass same class twice = no good !
								// also not bothering with sun internal classes
								if (!classes.contains(cname) &&
										!cname.startsWith("sun.") &&
										!cname.startsWith("com.sun."))
								{
									//System.out.println("CP item: " + cname);
									classes.add(cname);
									Class c = findClass(cname);
									if (c != null && c.isInterface())
									{
										System.out.println("Is interface");
										findClass(cname);
									}
								}
							} catch (ClassNotFoundException ce)
							{
								System.out.println("Not found: " + ename);
							}
						}
					}
				}
			} else if (f.endsWith(File.separator))
			{
				File file = new File(f);
				// Todo recure in dir to find class/packages
				indexDirectory(file, "");
			}
		}
		System.out.println("CP ellapsed time: " + (new Date().getTime() - start));
	}

	private void indexDirectory(File dir, String pack)
	{
		File[] files = dir.listFiles();
		for (File f : files)
		{
			if (f.isDirectory())
			{
				pack = pack.length() == 0 ? dir.getName() : pack + "." + dir.getName();
				System.out.println("Pack: " + pack);
				indexDirectory(dir, pack);
			} else if (f.getName().toLowerCase().endsWith(".class"))
			{
				System.out.println("CP item: " + f.getName());
			}
		}
	}
	//TODO: for testing
	//readJavaTypes();
	/*public void getJavaTypes()
	{
	if(javaTypes==null)
	javaTypes=readJavaTypes();
	return javaTypes;
	}
	public String readJavaTypes()
	{
	JavaPlatform.getDefault().getBootstrapLibraries();
	ClassPath cp = JavaPlatform.getDefault().getStandardLibraries();
	cp.findResource(null);
	//JavaPlatform.getDefault().getJavadocFolders();

	FanPlatform platform = FanPlatform.getInstance(false);
	if (platform == null)
	{
	return null;
	}
	try
	{
	//TODO: make those Fan names constants somewhere
	FanObj classPath = (FanObj) Type.find("compilerJava::ClassPath").method("makeForCurrent").call();
	Map map = (Map) classPath.type().field("classes").get(classPath);
	String[] packages = (String[]) map.keys().asArray(String.class);
	for (String pack : packages)
	{
	String[] classes = (String[]) ((List) map.get(pack)).asArray(String.class);
	for (String clazz : classes)
	{
	System.out.println(pack + "." + clazz);
	}
	}
	} catch (Exception e)
	{
	e.printStackTrace();
	}
	return null;
	}*/
}
