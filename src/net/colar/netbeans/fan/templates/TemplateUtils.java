/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.templates;

import java.io.File;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.jot.web.view.JOTViewParser;
import net.jot.web.views.JOTLightweightView;
import org.openide.filesystems.FileUtil;

/**
 * Provide acces to JavaOnTrack templating API
 * Alternative to using fremarker which has large dependencies in NB and wouldn't parse the files for some reason.
 * @author thibautc
 */
public class TemplateUtils
{
	/**
	 * Create a file using a template and a view.
	 * @param view
	 * @param template
	 * @param destFile
	 */
	public static void createFromTemplate(JOTLightweightView view, String templateText, File destFile)
	{
		String parsedFile = "";
		try
		{
			parsedFile = JOTViewParser.parse(view, templateText, null);
                        
                        // Take out the empty lines from the build.fan file, which can happen
                        // when some of the params don't have values.
                        Pattern p = Pattern.compile("^.*\\[\\]$", Pattern.MULTILINE);
                        Matcher m = p.matcher(parsedFile);
                        parsedFile = m.replaceAll("");
                        p = Pattern.compile("^.*= $", Pattern.MULTILINE);
                        m = p.matcher(parsedFile);
                        parsedFile = m.replaceAll("");
                        p = Pattern.compile("^.*= \"\"$", Pattern.MULTILINE);
                        m = p.matcher(parsedFile);
                        parsedFile = m.replaceAll("");
                        p = Pattern.compile("^.*= Version.fromStr\\(\"\"\\)$", Pattern.MULTILINE);
                        m = p.matcher(parsedFile);
                        parsedFile = m.replaceAll("");

		} catch (Exception e)
		{
			parsedFile = e.toString();
			e.printStackTrace();
			new RuntimeException("Failed parsing template: " + templateText, e);
		}
		try
		{
			//System.err.println("parsed: " + parsedFile);
			//System.err.println("writing to: " + destFile.getPath());
			PrintWriter pw = new PrintWriter(destFile);
			pw.print(parsedFile);
			pw.close();
			// Tell the IDE to update the project/files view asap as sometimes it seems to lag otherwise
			FileUtil.refreshFor(destFile);
		} catch (Exception e)
		{
			new RuntimeException("Failed writing parsed template: " + destFile.getPath(), e);
		}
	}
}
