/*
 * Thibaut Colar Mar 10, 2010
 */
package net.colar.netbeans.fan.test;

import java.io.File;
import net.colar.netbeans.fan.FanParserTask;
import net.colar.netbeans.fan.structure.FanStructureAnalyzer;
import net.jot.testing.JOTTester;
import org.netbeans.modules.parsing.api.Snapshot;

/**
 * Test the structure analyzer
 *
 * Note: This doesn't run any indexing, so index database must be up to date before running.
 *
 * @author thibautc
 */
public class FantomStructureAnalyzerTest extends FantomCSLTest
{

	public void cslTest() throws Throwable
	{
		testAllFanFilesUnder(FantomParserTest.FAN_HOME + "/examples/");
	}

	private static void testAllFanFilesUnder(String folderPath) throws Exception
	{
		File folder = new File(folderPath);
		File[] files = folder.listFiles();
		for (File f : files)
		{
			if (f.isDirectory())
			{
				testAllFanFilesUnder(f.getAbsolutePath());
			} else
			{
				if (f.getName().equals("gamma.fan")) // Known invalid file
				{
					continue;
				}
				if (f.getName().endsWith(".fan") || f.getName().endsWith(".fwt"))
				{
					Exception e=null;
					try
					{
						analyzeFile(f);
					}catch(Exception ex){e=ex;}
					JOTTester.checkIf("StructAnanlysis of: "+f.getAbsolutePath(), e==null);
				}
			}
		}
	}

	public static void analyzeFile(File file) throws Exception
	{
		Snapshot snap = NBTestUtilities.fileToSnapshot(file);
		FanParserTask task = new FanParserTask(snap);
		task.parse();
		task.parseScope();
		if (task.getParsingResult().hasErrors())
		{
			for (org.netbeans.modules.csl.api.Error err : task.getDiagnostics())
			{
				System.err.println("Error: " + err);
			}
			throw new Exception("Parsing errors");
		}
		FanStructureAnalyzer analyzer = new FanStructureAnalyzer();
		analyzer.scan(task);
		if (task.getDiagnostics().size() > 0)
		{
			for (org.netbeans.modules.csl.api.Error err : task.getDiagnostics())
			{
				System.err.println("Error: " + err);
			}
			throw new Exception("Structure analyzer errors");
		}
	}

	public static void main(String[] args)
	{
		try
		{
			JOTTester.singleTest(new FantomStructureAnalyzerTest(), false);
		} catch (Throwable t)
		{
			t.printStackTrace();
		}
	}

}
