/*
 * Thibaut Colar Mar 11, 2010
 */
package net.colar.netbeans.fan.test;

import java.io.File;
import java.io.FileOutputStream;
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
	File failedListFile=null;
	final String[] badFiles = {
		"/home/thibautc/fantom-1.0.52/src/email/fan/FilePart.fan",
		"/home/thibautc/fantom-1.0.52/src/testCompiler/fan/NamespaceTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testCompiler/fan/FacetTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testCompiler/fan/CompilerTest.fan",
		"/home/thibautc/fantom-1.0.52/src/web/fan/WebUtil.fan",
		"/home/thibautc/fantom-1.0.52/src/web/test/UtilTest.fan",
		"/home/thibautc/fantom-1.0.52/src/web/test/WebClientTest.fan",
		"/home/thibautc/fantom-1.0.52/src/buildall.fan",
		"/home/thibautc/fantom-1.0.52/src/wisp/fan/WispRes.fan",
		"/home/thibautc/fantom-1.0.52/src/compiler/fan/ast/Stmt.fan",
		"/home/thibautc/fantom-1.0.52/src/compiler/fan/ast/Expr.fan",
		"/home/thibautc/fantom-1.0.52/src/compiler/fan/parser/Token.fan",
		"/home/thibautc/fantom-1.0.52/src/compiler/fan/parser/Parser.fan",
		"/home/thibautc/fantom-1.0.52/src/compiler/fan/parser/Tokenizer.fan",
		"/home/thibautc/fantom-1.0.52/src/compiler/fan/namespace/ReflectSlot.fan",
		"/home/thibautc/fantom-1.0.52/src/compiler/fan/util/CallResolver.fan",
		"/home/thibautc/fantom-1.0.52/src/compiler/fan/fcode/FCodePrinter.fan",
		"/home/thibautc/fantom-1.0.52/src/compiler/fan/fcode/Fanp.fan",
		"/home/thibautc/fantom-1.0.52/src/compiler/fan/steps/ScanForUsingsAndTypes.fan",
		"/home/thibautc/fantom-1.0.52/src/compiler/fan/steps/CompileJs.fan",
		"/home/thibautc/fantom-1.0.52/src/compiler/fan/steps/CheckErrors.fan",
		"/home/thibautc/fantom-1.0.52/src/compiler/fan/steps/ResolveImports.fan",
		"/home/thibautc/fantom-1.0.52/src/fandoc/fan/FandocParser.fan",
		"/home/thibautc/fantom-1.0.52/src/fandoc/fan/DocModel.fan",
		"/home/thibautc/fantom-1.0.52/src/util/test/CsvTest.fan",
		"/home/thibautc/fantom-1.0.52/src/util/test/JsonTest.fan",
		"/home/thibautc/fantom-1.0.52/src/docCompiler/fan/DocCompiler.fan",
		"/home/thibautc/fantom-1.0.52/src/docCompiler/fan/html/HtmlGenerator.fan",
		"/home/thibautc/fantom-1.0.52/src/docCompiler/fan/html/PodDocGenerator.fan",
		"/home/thibautc/fantom-1.0.52/src/docCompiler/fan/html/FandocToHtmlGenerator.fan",
		"/home/thibautc/fantom-1.0.52/src/obix/fan/Contract.fan",
		"/home/thibautc/fantom-1.0.52/src/obix/test/ObjTest.fan",
		"/home/thibautc/fantom-1.0.52/src/xml/fan/XParser.fan",
		"/home/thibautc/fantom-1.0.52/src/xml/fan/XText.fan",
		"/home/thibautc/fantom-1.0.52/src/xml/test/ParserTest.fan",
		"/home/thibautc/fantom-1.0.52/src/xml/test/DomTest.fan",
		"/home/thibautc/fantom-1.0.52/src/xml/test/WriteTest.fan",
		"/home/thibautc/fantom-1.0.52/src/xml/test/PullTest.fan",
		"/home/thibautc/fantom-1.0.52/src/compilerJs/fan/ast/JsMethod.fan",
		"/home/thibautc/fantom-1.0.52/src/compilerJs/fan/ast/JsPod.fan",
		"/home/thibautc/fantom-1.0.52/src/compilerJs/fan/runner/TestRunner.fan",
		"/home/thibautc/fantom-1.0.52/src/compilerJs/fan/runner/Runner.fan",
		"/home/thibautc/fantom-1.0.52/src/compilerJs/fan/runner/Dump.fan",
		"/home/thibautc/fantom-1.0.52/src/sys/dotnet/build.fan",
		"/home/thibautc/fantom-1.0.52/src/sys/build.fan",
		"/home/thibautc/fantom-1.0.52/src/fwt/fan/Dialog.fan",
		"/home/thibautc/fantom-1.0.52/src/fwt/fan/Menu.fan",
		"/home/thibautc/fantom-1.0.52/src/fwt/fan/Enums.fan",
		"/home/thibautc/fantom-1.0.52/src/fwt/fan/Command.fan",
		"/home/thibautc/fantom-1.0.52/src/fwt/test/PaneTest.fan",
		"/home/thibautc/fantom-1.0.52/src/flux/fluxText/fan/FindBar.fan",
		"/home/thibautc/fantom-1.0.52/src/flux/fluxText/fan/TextEditor.fan",
		"/home/thibautc/fantom-1.0.52/src/flux/fluxText/fan/Parser.fan",
		"/home/thibautc/fantom-1.0.52/src/flux/flux/fan/FileResource.fan",
		"/home/thibautc/fantom-1.0.52/src/flux/flux/fan/Frame.fan",
		"/home/thibautc/fantom-1.0.52/src/flux/flux/fan/sidebars/NavBar.fan",
		"/home/thibautc/fantom-1.0.52/src/flux/flux/fan/sidebars/Console.fan",
		"/home/thibautc/fantom-1.0.52/src/flux/flux/fan/FindInFiles.fan",
		"/home/thibautc/fantom-1.0.52/src/flux/flux/fan/Commands.fan",
		"/home/thibautc/fantom-1.0.52/src/flux/flux/fan/views/HtmlView.fan",
		"/home/thibautc/fantom-1.0.52/src/flux/flux/fan/views/ImageView.fan",
		"/home/thibautc/fantom-1.0.52/src/flux/flux/fan/views/StartView.fan",
		"/home/thibautc/fantom-1.0.52/src/flux/flux/fan/View.fan",
		"/home/thibautc/fantom-1.0.52/src/gfx/fan/Image.fan",
		"/home/thibautc/fantom-1.0.52/src/json/test/JsonTestCase.fan",
		"/home/thibautc/fantom-1.0.52/src/json/test/SimpleJsonTest.fan",
		"/home/thibautc/fantom-1.0.52/src/json/test/BrowserTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testSys/fan/SerializationTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testSys/fan/MixinTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testSys/fan/ObjTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testSys/fan/StreamTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testSys/fan/PodTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testSys/fan/ParserTotureTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testSys/fan/ExprTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testSys/fan/ProcessTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testSys/fan/RangeTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testSys/fan/RegexTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testSys/fan/ClosureTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testSys/fan/FacetsTest.fan",
		"/home/thibautc/fantom-1.0.52/src/testSys/fan/IntTest.fan",
		"/home/thibautc/fantom-1.0.52/src/compilerJava/fan/JavaType.fan",
		"/home/thibautc/fantom-1.0.52/src/compilerJava/fan/JavaReflect.fan",
		"/home/thibautc/fantom-1.0.52/src/compilerJava/fan/JavaBridge.fan",
		"/home/thibautc/fantom-1.0.52/src/compilerJava/fan/ClassPath.fan",
	};

	public void cslTest() throws Throwable
	{
		// Outputs the names of the failed files into a text file, ina  format that makes it easy to use in a java string array
		failedListFile = new File (prefs.getString("test.home")+File.separator+"failed.txt");
		failedListFile.delete();
		
		//String fanHome = prefs.getString("fantom.home");
		//testAllFanFilesUnder(fanHome + "/src/");

		for(String file : badFiles)
		{
			testFile(new File(file));
		}
	}

	private void testAllFanFilesUnder(String folderPath) throws Exception
	{
		List<File> files = NBTestUtilities.listAllFanFilesUnder(folderPath);
		for (File f : files)
		{
			testFile(f);
		}
	}

	private void testFile(File f) throws Exception
	{
		FanParserTask task = null;
		try
		{
			Snapshot snap = NBTestUtilities.fileToSnapshot(f);
			task = new FanParserTask(snap);
			analyze(task);
		} catch (Exception e)
		{
			e.printStackTrace();
			JOTTester.checkIf("Exception during semantic analysis " + f.getPath(), false);
			if (task != null)
			{
				documentFailedFile(task.getSourceFile().getPath());
			}
		}
	}

	public void analyze(FanParserTask task) throws Exception
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
		if (hasErr)
		{
			documentFailedFile(task.getSourceFile().getPath());
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

	private void documentFailedFile(String path) throws Exception
	{
		FileOutputStream fis = new FileOutputStream(failedListFile, true);
		String txt = "\t\t\""+path+"\",\n";
		fis.write(txt.getBytes());
		fis.close();
	}
}
