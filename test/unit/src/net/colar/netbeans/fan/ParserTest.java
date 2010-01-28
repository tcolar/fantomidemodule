/*
 * Thibaut Colar Jan 28, 2010
 */
package net.colar.netbeans.fan;

import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.List;
import java.util.concurrent.Future;
import net.colar.netbeans.fan.indexer.FanIndexer;
import net.colar.netbeans.fan.platform.FanPlatform;
import net.colar.netbeans.fan.platform.FanPlatformSettings;
import net.jot.JOTInitializer;
import net.jot.prefs.JOTPreferences;
import org.netbeans.api.project.Project;
import org.netbeans.junit.NbTestCase;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.netbeans.modules.project.uiapi.OpenProjectsTrampoline;
import org.openide.filesystems.FileUtil;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author thibautc
 */
public class ParserTest extends NbTestCase
{

	public ParserTest()
	{
		super(ParserTest.class.getName());
	}

	@Override
	protected void setUp() throws Exception
	{
		super.setUp();
		//clearWorkDir();
		//System.setProperty("netbeans.user", getWorkDirPath());
		// This has to be before touching ClassPath class (createSnapshot does)

		MockLookup.setInstances(new MockTrampoline(), Lookups.metaInfServices(MockLookup.class.getClassLoader()), Lookups.singleton(MockLookup.class.getClassLoader()));

		getDataDir();
		System.out.println("Data dir: " + getDataDir());
		JOTPreferences.setWebConfPath(getDataDir().getAbsolutePath());
		JOTInitializer.getInstance().setTestMode(true);
		JOTInitializer.getInstance().init();

		FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_FAN_HOME, "/home/thibautc/fantom/");
		assertEquals(FanPlatform.checkFanHome(FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_FAN_HOME)), true);

		FanPlatform.getInstance(false).update();

	}

	@Override
	protected void tearDown() throws Exception
	{
		System.out.println("#### teardown");
		FanIndexer.shutdown();
		JOTInitializer.getInstance().destroy();
	}

	public void testParser() throws Exception
	{
		String folder = "/home/thibautc/fantom-1.0.49/src/";
		File file = new File(folder);
		System.out.println("Testing in: " + file.getAbsolutePath());
		parseFanFolder(folder);
	}

	public void parseFanFolder(String path) throws Exception
	{
		File[] files;
		File folder = new File(path);
		if (folder.isFile())
		{
			// single file
			files = new File[1];
			files[0] = folder;
		} else
		{
			files = new File(path).listFiles();
		}
		for (int i = 0; i != files.length; i++)
		{
			File f = files[i];
			if (f.isDirectory())
			{
				parseFanFolder(f.getPath());
				continue;
			}
			if (f.getName().toLowerCase().endsWith(".fan"))
			{
				NBFanParser parser = new NBFanParser();
				try
				{
					Source source = Source.create(FileUtil.toFileObject(f));
					System.out.println("Checking: " + f.getAbsolutePath());
					Snapshot snapshot = source.createSnapshot();
					parser.parse(snapshot);
					FanParserResult result = (FanParserResult) parser.getResult();
					List<? extends org.netbeans.modules.csl.api.Error> errors = result.getDiagnostics();
					if (errors != null && errors.size() > 0)
					{
						for (org.netbeans.modules.csl.api.Error error : errors)
						{
							System.err.println("Error: " + error);
							result.dumpTree();
						}
					}
					//result.getAntlrErrors();

				} catch (Throwable e)
				{
					System.err.println("Parsing failed for: " + f.getPath());
					System.out.println("Parsing trace:");
					e.printStackTrace();
					fail("Parsing failed for: " + f.getPath());
				}
			}
		}
	}

	public class MockTrampoline implements OpenProjectsTrampoline
	{

		public Project[] getOpenProjectsAPI()
		{
			System.out.println("getOpenPrjApis");
			return null;
		}

		public void openAPI(Project[] prjcts, boolean bln, boolean bln1)
		{
		}

		public void closeAPI(Project[] prjcts)
		{
		}

		public void addPropertyChangeListenerAPI(PropertyChangeListener pl, Object o)
		{
		}

		public Future<Project[]> openProjectsAPI()
		{
			System.out.println("apis");
			return null;
		}

		public void removePropertyChangeListenerAPI(PropertyChangeListener pl)
		{
		}

		public Project getMainProject()
		{
			System.out.println("getMainProject");
			return null;
		}

		public void setMainProject(Project prjct)
		{
		}
	}

	
}
