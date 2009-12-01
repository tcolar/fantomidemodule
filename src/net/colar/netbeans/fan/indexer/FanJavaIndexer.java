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
	ArrayList classes = new ArrayList();
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
		return cl.findClass(name);
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
		// JVM cp
		String[] cps=System.getProperty("java.class.path", "").split(File.pathSeparator);
		for (String cp : cps)
		{
			//System.out.println("cp: "+cp);
			urls.add(new URL("file://"+cp));
		}


		// Browsing and finidng items
		for (URL url : urls)
		{
			String f = url.getFile();
			System.out.println("F   "+f);
			if (f.toLowerCase().endsWith(".jar"))
			{
				// skip those large resources jars to save time.
				if (f.equals("deploy.jar") || f.equals("charsets.jar") || f.equals("javaws.jar")) continue;

				JarFile jar=new JarFile(f);
				Enumeration<JarEntry> jarEntries = jar.entries();
				while(jarEntries.hasMoreElements())
				{
					JarEntry entry=jarEntries.nextElement();
					String ename = entry.getName();
					if (ename.toLowerCase().endsWith(".class"))
					{
						String cname=ename.substring(0,ename.length()-6).replaceAll(File.separator, ".");
						System.out.println("CP item: " + cname);
						try
						{
							Class c = Class.forName(cname);//findClass(cname);
							if(c.isInterface())
								System.out.println("Is interface");
						}catch(ClassNotFoundException ce)
						{
							System.out.println("Not found: "+ename);
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
