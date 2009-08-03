package net.colar.netbeans.fan.templates;

import java.text.DateFormat;
import java.util.Date;
import net.jot.web.views.JOTLightweightView;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 * Custom view for tJOT templates used in netbeans.
 * @author thibautc
 */
public class TemplateView extends JOTLightweightView
{

    private final FileObject root;

    public TemplateView(FileObject rootFile, String name)
    {
	this.root = rootFile;
	Date d = new Date();
	addVariable("name", name);
	addVariable("date", DateFormat.getDateInstance().format(d));
	addVariable("time", DateFormat.getTimeInstance().format(d));
	addVariable("user", System.getProperty("user.name"));
    }

    /**
     * Support for including subtemplates
     * Standard jot:include is not supported in LightweightViews
     * And NB doesn't use standrad files, but FileObjects
     * @param path
     * @return
     */
    public String includeTemplate(String path)
    {
	// TODO: not working
	String result = "";
	FileObject tpl = root.getFileObject("Licenses").getFileObject(path);
	try
	{
	    result = tpl.asText();
	} catch (Exception e)
	{
	    result="// Include failed for:"+path+"->"+e.toString();
	}
	return result;
    }
}
