/*
 * Thibaut Colar Mar 11, 2010
 */
package net.colar.netbeans.fan.test;

import java.io.File;
import java.util.List;
import net.colar.netbeans.fan.FanParserTask;
import net.colar.netbeans.fan.structure.FanSemanticAnalyzer;
import net.jot.testing.JOTTester;
import org.netbeans.modules.parsing.api.Snapshot;

/**
 *
 * @author thibautc
 */
public class FantomSemanticAnalyzerTest extends FantomCSLTest
{

	public void cslTest() throws Throwable
	{
		String fanHome = prefs.getString("fantom.home");
		// NOTE: semantic analyzer needs the files to be indexed first
		testAllFanFilesUnder(fanHome + "/src/");
	}

	private static void testAllFanFilesUnder(String folderPath) throws Exception
	{
		List<File> files = NBTestUtilities.listAllFanFilesUnder(folderPath);
		for (File f : files)
		{
			try
			{
				Snapshot snap = NBTestUtilities.fileToSnapshot(f);
				FanParserTask task = new FanParserTask(snap);
				analyze(task);
			} catch (Exception e)
			{
				e.printStackTrace();
				JOTTester.checkIf("Exception during semantic analysis " + f.getPath(), false);
			}
		}
	}

	public static void analyze(FanParserTask task) throws Exception
	{
		task.parse();
		task.parseGlobalScope();
		task.parseLocalScopes();
		FanSemanticAnalyzer analyzer = new FanSemanticAnalyzer();
		analyzer.run(task, null);
		boolean hasErr = false;
		if (task.getDiagnostics().size() > 0)
		{
			for (org.netbeans.modules.csl.api.Error err : task.getDiagnostics())
			{
				String desc = err.getDisplayName();
				// Avoid known false positives (we don't index java.awt & javax.swing by default)
				if (!desc.contains("java.awt") && !desc.contains("javax.swing") && !desc.contains("javax.script") && !desc.contains("ScriptEngine"))
				{
					hasErr = true;
					System.err.println("Error: " + err);
				}
			}
		}
		JOTTester.checkIf("Semantic errors in " + task.getSourceFile().getPath(), !hasErr);
	}

	public static void main(String[] args)
	{
		try
		{
			JOTTester.singleTest(new FantomSemanticAnalyzerTest(), false);
		} catch (Throwable t)
		{
			t.printStackTrace();
		}
	}
}
