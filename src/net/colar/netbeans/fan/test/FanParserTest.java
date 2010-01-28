/*
 * Thibaut Colar Aug 19, 2009
 */
package net.colar.netbeans.fan.test;

import java.io.File;
import java.util.List;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.NBFanParser;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.openide.filesystems.FileUtil;

/**
 * Takes a path as an argument, and recursively find .fan files in it.
 * Then for each .fan file, invoke the Fanparser.
 * @author thibautc
 */
public class FanParserTest
{

	public static void main(String args[]) throws Exception
	{
		if (args.length < 1)
		{
			System.err.println("Please provide a path where to find .fan files, as an argument.");
			System.exit(-1);
		}
		String folder = args[0];
		File f = new File(folder);
		System.out.println("Testing in: " + f.getAbsolutePath());
		parseFanFolder(folder);
	}

	public static void parseFanFolder(String path) throws Exception
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

				} catch (RuntimeException e)
				{
					System.err.println("Parsing failed for: " + f.getPath());
					//e.getCause().printStackTrace();
				}
				/*FanLexer; lex = new FanLexer(new ANTLRFileStream(f.getPath()));
				CommonTokenStream tokens = new CommonTokenStream(lex);

				FanParser g = new FanParser(tokens);

				try
				{
				//System.out.println("Parsing : " + f.getPath());
				g.prog();
				}
				catch (RuntimeException e)
				{
				System.err.println("Parsing failed for: " + f.getPath());
				//e.getCause().printStackTrace();
				}*/
			}
			Thread.sleep(50);
		}
	}
}
