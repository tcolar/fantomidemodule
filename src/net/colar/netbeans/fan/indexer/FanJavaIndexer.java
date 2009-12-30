/*
 * Thibaut Colar Nov 30, 2009
 */
package net.colar.netbeans.fan.indexer;

import fanx.util.FanUtil;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import net.colar.netbeans.fan.FanUtilities;
import org.netbeans.api.java.platform.JavaPlatform;

/**
 * Indexer for the Java classes / jars
 * JVM + the ones in Fan repo.
 *
 * Helper method to find / resolve Java types
 *
 * //TODO: add file change listener like in FanPodIndexer to reindex chnaged jars
 * //TODO: add persistant caching
 *
 * @author thibautc
 */
public class FanJavaIndexer
{

	private FanJavaClassLoader cl;
	private static FanJavaIndexer instance = new FanJavaIndexer();
	boolean indexed = false;
	boolean running = false;
	ArrayList<String> packages = new ArrayList();
	ArrayList<String> classes = new ArrayList();
	ArrayList<String> interfaces = new ArrayList();
	ArrayList<String> enums = new ArrayList();
	ArrayList<String> annotations = new ArrayList();

	private FanJavaIndexer()
	{
		super();
	}

	/*public synchronized static FanJavaIndexer getInstance()
	{
		if (!instance.indexed && !instance.running)
		{
			instance.indexed = true;
			instance.running = true;
			instance.cl = new FanJavaClassLoader();
			// Start java indexing
			FanJavaIndexerThread indexer = new FanJavaIndexerThread();
			indexer.start();
			// It's more confusing than anyhting if partially indexed, so wait for.
			indexer.waitFor();
		}
		return instance;
	}*/

	public fan.sys.Type resolveType(String cname)
	{
		try
		{
			Class c = findClass(cname);
			fan.sys.Type type = FanUtil.toFanType(c, true);
			return type;
		} catch (Exception e)
		{
			//e.printStackTrace();
		}
		return null;
	}

	/**
	 * List packages starting with base (1 level)
	 * @param packroot
	 * @return
	 */
	public List<String> listSubPackages(String packbase)
	{
		ArrayList<String> packs = new ArrayList<String>();
		for (String s : packages)
		{
			if (s.toLowerCase().startsWith(packbase) &&
				s.indexOf(".", packbase.length() + 1) == -1)
			{
				packs.add(s);
			}
		}
		return packs;
	}

	/**
	 * List all of the items matching a package and the given item name prefix
	 * @param pack if null - ignore which package.
	 * @param prefix - prefix of the item name to match again. "" = any
	 * @return
	 */
	public List<String> listItems(String pack, String prefix)
	{
		ArrayList<String> items = new ArrayList<String>();
		items.addAll(listInterfaces(pack, prefix));
		items.addAll(listEnums(pack, prefix));
		items.addAll(listAnnotations(pack, prefix));
		items.addAll(listClasses(pack, prefix));
		Collections.sort(items);
		return items;
	}

	/**
	 * List all childrens: sub packages & items (1 evel)
	 * @param pack
	 * @param prefix
	 * @return
	 */
	public List<String> listChildren(String pack, String prefix)
	{
		String p = pack.length() == 0 ? prefix : pack + "." + prefix;
		ArrayList<String> items = new ArrayList<String>();
		items.addAll(listSubPackages(p));
		items.addAll(listItems(pack, prefix));
		Collections.sort(items);
		return items;
	}

	public List<String> listInterfaces(String pack, String prefix)
	{
		return listItems(pack, prefix, interfaces);
	}

	public List<String> listEnums(String pack, String prefix)
	{
		return listItems(pack, prefix, enums);
	}

	public List<String> listAnnotations(String pack, String prefix)
	{
		return listItems(pack, prefix, annotations);
	}

	public List<String> listClasses(String pack, String prefix)
	{
		return listItems(pack, prefix, classes);
	}

	private List<String> listItems(String packName, String prefix, ArrayList<String> itemsList)
	{
		if (packName != null && !packages.contains(packName))
		{
			return Collections.EMPTY_LIST;
		}
		ArrayList<String> items = new ArrayList<String>();
		for (String s : itemsList)
		{
			String name = parseItem(s);
			String pack = parsePackage(s);
			if (packName == null || (pack.startsWith(packName) && pack.indexOf(".", packName.length()) == -1))
			{
				if (name.toLowerCase().startsWith(prefix.toLowerCase()) && name.indexOf("$") == -1)
				{
					items.add(name);
				}
			}
		}
		return items;
	}

	public boolean hasPackage(String pack)
	{
		return packages.contains(pack);
	}

	/**
	 * Look if the item is indexed
	 * @param qname - qualified item(ie: class) name
	 * @return
	 */
	public boolean hasItem(String qname)
	{
		String pack = parsePackage(qname);
		// if package not indexed, no point searching
		if (!packages.contains(pack))
		{
			return false;
		}
		// checking smaller arrays first
		if (enums.contains(qname) ||
			annotations.contains(qname) ||
			interfaces.contains(qname) ||
			classes.contains(qname))
		{
			return true;
		}
		// not indexed
		return false;
	}

	public String parsePackage(String qname)
	{
		if (qname == null)
		{
			return "";
		}
		String pack = "";
		int dot = qname.lastIndexOf(".");
		if (dot > -1)
		{
			pack = qname.substring(0, dot);
		}
		return pack;
	}

	public String parseItem(String qname)
	{
		if (qname == null)
		{
			return "";
		}
		String item = qname;
		int dot = qname.lastIndexOf(".");
		if (dot > -1)
		{
			if (qname.length() > dot + 1)
			{
				item = qname.substring(dot + 1);
			}
		}
		return item;
	}

	private Class findClass(String name) throws ClassNotFoundException
	{
		// Try Fan classloader first (Fan classes)
		Class c = null;
		try
		{
			c = cl.find(name);
		} catch (NoClassDefFoundError e)
		{
		} catch (ClassNotFoundException e)
		{
		}
		if (c == null)
		{
			// try standard class loader (java)
			try
			{
				c = getClass().getClassLoader().loadClass(name);
			} catch (NoClassDefFoundError e)
			{
			} catch (ClassNotFoundException e)
			{
			}
		}
		if (c == null)
		{
			throw (new ClassNotFoundException("Class not found: " + name));
		}
		return c;
		//return cl.find(name);
	}

	private void indexDirectory(File dir, String pack)
	{
		File[] files = dir.listFiles();
		for (File f : files)
		{
			if (f.isDirectory())
			{
				pack = pack.length() == 0 ? dir.getName() : pack + "." + dir.getName();
				FanUtilities.GENERIC_LOGGER.debug("Pack: " + pack);
				indexDirectory(dir, pack);
			} else if (f.getName().toLowerCase().endsWith(".class"))
			{
				FanUtilities.GENERIC_LOGGER.debug("CP item: " + f.getName());
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

	private static class FanJavaIndexerThread extends Thread implements Runnable
	{

		boolean done = false;

		@Override
		public void run()
		{
			done = false;
			long start = new Date().getTime();
			try
			{
				ArrayList<URL> urls = new ArrayList<URL>();
				// adding Fan jars
				URL[] fanUrls = FanJavaClassLoader.getExtUrls();
				for (URL url : fanUrls)
				{
					urls.add(url);
				}
				// JVM boot cp
				String javaHome = JavaPlatform.getDefault().getSystemProperties().get("java.home");
				String lib = javaHome + File.separator + "lib" + File.separator;
				//File[] main = new File(javaHome).listFiles();
				//File[] ext = new File(lib + "ext").listFiles();
				String[] cps = JavaPlatform.getDefault().getSystemProperties().get("sun.boot.class.path").split(File.pathSeparator);
				for (String cp : cps)
				{
					String f = new File(cp).getName();
					// skip those large resources jars to save time.
					if (f.equals("deploy.jar") || f.equals("charsets.jar") || f.equals("javaws.jar"))
					{
						continue;
					}
					//System.out.println("jbcp: " + cp);
					try
					{
						urls.add(new URL("file://" + cp));
					} catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				// use lib/rt.jar as the backup
				if (cps.length == 0)
				{
					String cp = lib + "rt.jar";
					FanUtilities.GENERIC_LOGGER.debug("jrtcp: " + cp);
					try
					{
						urls.add(new URL("file://" + cp));
					} catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				// lib/ext/*
				File[] ext = new File(lib + "ext").listFiles();
				for (File jar : ext)
				{
					//System.out.println("jecp: " + jar.getAbsolutePath());
					try
					{
						urls.add(new URL("file://" + jar.getAbsolutePath()));
					} catch (IOException e)
					{
						e.printStackTrace();
					}
				}
				// Not adding java.classpath because it has all kind of Netbeans stuff we don't want

				// Browsing and finidng items
				for (URL url : urls)
				{
					String f = url.getFile();
					if (f.toLowerCase().endsWith(".jar"))
					{
						// boot clasppath lists sme jars that do not necerally exists (optional)
						if (new File(f).exists())
						{
							FanUtilities.GENERIC_LOGGER.debug("Indexing jar:  " + f);
							try
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
											//System.out.println("cname: " + cname);
											// trying to findclass same class twice = no good !
											// also not bothering with sun internal classes
											if (!instance.classes.contains(cname) &&
												!cname.startsWith("sun.") &&
												!cname.startsWith("com.sun."))
											{
												//System.out.println("CP item: " + cname);
												String pack = instance.parsePackage(cname);
												indexPackages(pack);

												Class c = instance.findClass(cname);
												if (c != null)
												{
													if (c.isAnnotation())
													{
														instance.annotations.add(cname);
													} else if (c.isEnum())
													{
														instance.enums.add(cname);
													} else if (c.isInterface())
													{
														instance.interfaces.add(cname);
													} else
													{
														instance.classes.add(cname);
													}

													//System.out.println("Is interface");
												}
											}
										} catch (ClassNotFoundException ce)
										{
											FanUtilities.GENERIC_LOGGER.debug(ce.getMessage());
										}
									}
								}
							} catch (IOException e)
							{
								e.printStackTrace();
							}
						}
					} else if (f.endsWith(File.separator))
					{
						// TODO
						//File file = new File(f);
						// Todo recure in dir to find class/packages
						//indexDirectory(file, "");
					}
				}
				// sort in alpha order.
				Collections.sort(instance.packages);
				Collections.sort(instance.classes);
				Collections.sort(instance.enums);
				Collections.sort(instance.interfaces);
				Collections.sort(instance.annotations);
			} catch (Throwable t)
			{
				t.printStackTrace();
			} finally
			{
				done = true;
				instance.running = false;
				FanUtilities.GENERIC_LOGGER.info("Java Indexer completed, ellapsed time: " + (new Date().getTime() - start) + " Items: " + instance.classes.size() + " (" + instance.packages.size() + " packages)");
			}

		}

		public void waitFor()
		{
			while (!done)
			{
				try
				{
					sleep(100);
				} catch (Exception e)
				{
				}
			}
		}

		/**
		 * 
		 * @param pack
		 */
		private void indexPackages(String pack)
		{
			//TODO: Not very inneficient
			String[] packs = pack.split("\\.");
			String packList = "";
			for (String p : packs)
			{
				packList += packList.length() == 0 ? p : "." + p;
				if (!instance.packages.contains(packList))
				{
					instance.packages.add(packList);
				}
			}
		}
	}
}
