/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Collections;
import java.util.regex.Pattern;
import org.openide.ErrorManager;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileStateInvalidException;
import org.openide.filesystems.FileSystem;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.RequestProcessor;

/**
 *
 * @author thibautc
 */
public class FanFileFilterNode extends FilterNode
{

    private final FanProject project;
    private RequestProcessor.Task task;

    public FanFileFilterNode(Node orig, FanProject project, FileObject parentFolder) throws DataObjectNotFoundException
    {
	super(orig, new ImageChildren(parentFolder));
	this.project = project;
	DataObject ob = orig.getLookup().lookup(org.openide.loaders.DataObject.class);
	setName(ob.getName());
    }
    private String cachedName = null;
    private final Object lock = new Object();

    @Override
    public String getDisplayName()
    {
	String result;
	String nm = super.getDisplayName();
	String cachedName;
	synchronized (lock)
	{
	    cachedName = this.cachedName;
	}
	if (cachedName == null)
	{
	    enqueue();
	    result = super.getDisplayName();
	} else
	{
	    result = NO_NAME.equals(cachedName) ? nm : cachedName;
	    FileObject ob = ((DataNode) getOriginal()).getDataObject().getPrimaryFile();
	    try
	    {
		String nue = ob.getFileSystem().getStatus().annotateName(nm,
			Collections.singleton(ob));
		result = nue.replace(nm, result);
	    } catch (FileStateInvalidException ex)
	    {
		ErrorManager.getDefault().notify(ex);
	    }
	}
	return result;
    }

    @Override
    public String getHtmlDisplayName()
    {
	FileObject ob = ((DataNode) getOriginal()).getDataObject().getPrimaryFile();
	String origHtml = getOriginal().getHtmlDisplayName();
	String result = null;
	boolean main = ob.equals(project.getMainFile());
	if (main || origHtml != null)
	{
	    result = getDisplayName(); //NOI18N
	}
	if (result != null)
	{
	    try
	    {
		FileSystem.Status stat =
			ob.getFileSystem().getStatus();
		if (stat instanceof FileSystem.HtmlStatus)
		{
		    FileSystem.HtmlStatus hstat = (FileSystem.HtmlStatus) stat;

		    String old = result;
		    result = hstat.annotateNameHtml(
			    result, Collections.singleton(ob));

		    if (main)
		    {
			result = "<b>" + (result == null ? old : result);
		    }

		    //Make sure the super string was really modified
		    if (!super.getDisplayName().equals(result))
		    {
			return result;
		    }
		}
	    } catch (FileStateInvalidException ex)
	    {
		ErrorManager.getDefault().notify(ex);
	    }
	}
	return result;
    }
    private volatile boolean enqueued = false;

    private void enqueue()
    {
	/*if (!enqueued) {
	ParsingService serv = ((DataNode) getOriginal()).getLookup().lookup(ParsingService.class);
	if (serv != null) {
	serv.register(nameUpdater);
	enqueued = true;
	}
	}*/
    }
//    void detach() {
//        ParsingService serv = ((DataNode) getOriginal()).getLookup().lookup(ParsingService.class);
//        if (serv != null) {
//            serv.unregister(nameUpdater);
//            enqueued = false;
//        }
//    }
    //private Callback<Pattern> nameUpdater = new NameUpdater();

    /*private class NameUpdater extends PatternCallback
    {

	public NameUpdater()
	{
	    super(TITLE_PATTERN);
	}

	public boolean process(FileObject f, MatchResult match, CharSequence content)
	{
	    String s = match.group(1).trim();
	    String old;
	    synchronized (lock)
	    {
		old = cachedName;
		cachedName = s;
	    }
	    if (!s.equals(old))
	    {
		fireDisplayNameChange(old, s);
	    }
	    enqueued = false;
	    //XXX in the future we want to listen, but not by being permanently
	    //registered.  For now, we never update node title.
	    ParsingService serv = ((DataNode) getOriginal()).getLookup().lookup(ParsingService.class);
	    serv.unregister(this);
	    return false;
	}
    }*/
    private static final String NO_NAME = "Unknown"; //NOI18N

    public String getShortDescription()
    {
	return super.getDisplayName();
    }
    private static final CharsetDecoder decoder =
	    Charset.defaultCharset().newDecoder();
    private static final Pattern TITLE_PATTERN =
	    Pattern.compile("<title>\\s*(.*)\\s*</title>"); //NOI18N
    //<?xml version="1.0" encoding="UTF-8"?>
    private static final String CONTENT_TYPE_PATTERN =
	    ".*<\\?xml.*?\\s*encoding=\\s*\\\"(.*?)\\\".*?>"; //NOI18N
    private static final Pattern encodingPattern =
	    Pattern.compile(CONTENT_TYPE_PATTERN,
	    Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
}

