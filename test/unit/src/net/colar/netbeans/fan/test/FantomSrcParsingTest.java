/*
 * Thibaut Colar Jan 29, 2010
 */
package net.colar.netbeans.fan.test;

import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Future;
import net.colar.netbeans.fan.FanParserTask;
import net.colar.netbeans.fan.NBFanParser;
import net.colar.netbeans.fan.test.mock.MockLookup;
import net.colar.netbeans.fan.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.indexer.FanIndexer;
import net.colar.netbeans.fan.indexer.FanIndexerFactory;
import net.colar.netbeans.fan.platform.FanPlatform;
import net.colar.netbeans.fan.platform.FanPlatformSettings;
import org.netbeans.modules.csl.api.Error;
import net.jot.JOTInitializer;
import net.jot.testing.JOTTestable;
import net.jot.testing.JOTTester;
import org.netbeans.api.project.Project;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.netbeans.modules.project.uiapi.OpenProjectsTrampoline;
import org.openide.filesystems.FileUtil;
import org.openide.util.lookup.Lookups;

/**
 * Large, Slow test.
 * Parse most Fantom disctribution source files to make sure the parser can deal with them properly
 * @author thibautc
 */
public class FantomSrcParsingTest implements JOTTestable
{
	//public static final String sources = "/home/thibautc/fantom/src/";
	//public static final String sources = "/home/thibautc/fantom/test/";
	// Files known to have parser errors
	public static final String sources = "/home/thibautc/NetBeansProjects/Fan/test/parser_test/";


	public void jotTest() throws Throwable
	{
		/*setUp();

		try
		{
			File file = new File(sources);
			Vector<File> files = getFanFiles(file);
			for (File f : files)
			{
				parseFile(f);
			}
		} catch (Throwable e)
		{
			e.printStackTrace();
		}
		tearDown();*/
	}

	protected void setUp() throws Exception
	{
		System.setProperty("netbeans.full.hack", "true"); // NOI18N
		System.setProperty("netbeans.user", System.getProperty("user.dir")); // NOI18N

		//This has to be before touching ClassPath class (createSnapshot does)
		MockLookup.setInstances(new MockTrampoline(), Lookups.metaInfServices(MockLookup.class.getClassLoader()), Lookups.singleton(MockLookup.class.getClassLoader()));

		JOTInitializer.getInstance().setTestMode(true);
		JOTInitializer.getInstance().init();

		FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_FAN_HOME, "/home/thibautc/fantom/");
		JOTTester.checkIf("Fan home setup check ", FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_FAN_HOME) != null);

		FanPlatform.getInstance(false).readSettings();
		// Do it in the foreground .. waitFor()
		FanIndexerFactory.getIndexer().indexAll(false);
		//TODO: this causes indexing ... so maybe we can add some index unit tests here (using golden source files)
	}

	protected void tearDown() throws Exception
	{
		FanIndexer.shutdown();
		Thread.sleep(500);
		JOTInitializer.getInstance().destroy();
	}

	private void parseFile(File f)
	{
		NBFanParser parser = new NBFanParser();
		try
		{
			Source source = Source.create(FileUtil.toFileObject(f));
			Snapshot snapshot = source.createSnapshot();
			parser.parse(snapshot);
			FanParserTask result = (FanParserTask) parser.getResult();
			List<? extends org.netbeans.modules.csl.api.Error> errors = result.getDiagnostics();
			// Look for failed parsing (antlr)
			boolean hasErrors = false;
			if (errors != null && errors.size() > 0)
			{
				for (org.netbeans.modules.csl.api.Error error : errors)
				{
					System.err.println("Error: " + error);
				}
				FanLexAstUtils.dumpTree(null/*result.getTree()*/, 0);
				hasErrors = true;
			}
			JOTTester.checkIf("ANTLR Parsing " + f.getAbsolutePath(), ! hasErrors);
			// TODO: look for unresolved items
			hasErrors = false;
			for (Error error : result.getErrors())
			{
				System.err.println("Error: " + error);
				hasErrors = true;
			}
			JOTTester.checkIf("Semantic analysis " + f.getAbsolutePath(), ! hasErrors);
		} catch (Throwable e)
		{
			System.err.println("Parsing failed for: " + f.getPath());
			e.printStackTrace();
		}
	}

	private Vector<File> getFanFiles(File file)
	{
		Vector<File> files = new Vector<File>();
		if (file.isFile())
		{
			// single file
			if (file.getName().toLowerCase().endsWith(".fan"))
			{
				files.add(file);
			}
		} else
		{
			File[] children = file.listFiles();
			for (int i = 0; i != children.length; i++)
			{
				files.addAll(getFanFiles(children[i]));
			}
		}
		return files;
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
