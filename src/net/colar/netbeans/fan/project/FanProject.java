/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

/**
 * Inspired/copied from Docbook project
 * http://hg.netbeans.org/main/contrib/file/e3f63eeb0f1f/docbook.project/src/org/netbeans/modules/docbook/project/DbProject.java
 * @author thibautc
 */
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Properties;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.ProjectState;
import org.openide.ErrorManager;
import org.openide.filesystems.FileLock;
import org.openide.filesystems.FileObject;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;
import org.openide.util.RequestProcessor;
import org.openide.util.Utilities;
import org.openide.util.lookup.Lookups;

public class FanProject implements Project, ProjectInformation, ActionProvider
{

    private final FileObject dir;
    private final Lookup lkp;
    private static final String MAIN_FILE_KEY = "main.file";
    private static final String PROJECT_DIR = "nbproject";
    final RequestProcessor rp;
    final Properties props = new Properties();

    public FanProject(FileObject dir, ProjectState state)
    {
	this.dir = dir;
	lkp = Lookups.fixed(new Object[]
		{
		    this,
		    new FanLogicalViewProvider(this),
		    state,
		    props,
		});
	/*if (dir.getFileObject(PROJECT_DIR) != null)
	{
	    try
	    {
		loadProperties(props);
	    } catch (IOException ex)
	    {
		ErrorManager.getDefault().notify(ex);
	    }
	}
	*/
	rp = new RequestProcessor("Resolver thread for " + dir.getName() + " Fan Project", Thread.MIN_PRIORITY,
		true);
    }

    public FileObject getProjectDirectory()
    {
	return dir;
    }

    public Lookup getLookup()
    {
	return lkp;
    }

    public String getName()
    {
	return dir.getName();
    }

    public String getDisplayName()
    {
	return dir.getName();
    }

    public Icon getIcon()
    {
	return new ImageIcon(
		Utilities.loadImage(
		"net/colar/netbeans/fan/fan.png"));
    }

    public Project getProject()
    {
	return this;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener)
    {
    }

    public void removePropertyChangeListener(PropertyChangeListener listener)
    {
    }

    public String[] getSupportedActions()
    {
	return new String[]
		{
		    COMMAND_BUILD,
		    COMMAND_CLEAN,
		};
    }
    private static final String OUTPUT_FOLDER = "dist";

    private FileObject getOutputFolder() throws IOException
    {
	FileObject result = dir.getFileObject(OUTPUT_FOLDER);
	if (result == null)
	{
	    result = dir.createFolder(OUTPUT_FOLDER);
	}
	return result;
    }

    public void invokeAction(String command, Lookup context) throws IllegalArgumentException
    {
	if (COMMAND_BUILD.equals(command))
	{
	    /*FileObject ob = getMainFile();
	    if (ob != null)
	    {
		try
		{
		    DataObject dob = DataObject.find(ob);
		    Node n = dob.getNodeDelegate();
		    /*Renderer ren = n.getLookup().lookup(Renderer.class);
		    if (ren != null)
		    {
			ren.render(FileUtil.toFile(getOutputFolder()), this);
		    } else
		    {
			StatusDisplayer.getDefault().setStatusText("Could not render " +
				ob.getPath());
		    }
		} catch (DataObjectNotFoundException ex)
		{
		    throw new IllegalArgumentException(ex);
		} catch (IOException ex)
		{
		    throw new IllegalArgumentException(ex);
		}
	    } else
	    {
		StatusDisplayer.getDefault().setStatusText("Could not render " +
			ob.getPath());
	    }*/
	} else if (COMMAND_CLEAN.equals(command))
	{/*
	    FileObject ob = dir.getFileObject(OUTPUT_FOLDER);
	    if (ob != null)
	    {
		try
		{
		    ob.delete();
		    StatusDisplayer.getDefault().setStatusText("Cleaned " + getDisplayName());
		} catch (IOException ioe)
		{
		    throw new IllegalArgumentException(ioe);
		}
	    }*/
	}
    }

    public boolean isActionEnabled(String command, Lookup context) throws IllegalArgumentException
    {
	return (COMMAND_BUILD.equals(command) && getMainFile() != null) ||
		(COMMAND_CLEAN.equals(command) && dir.getFileObject(OUTPUT_FOLDER) != null);
    }

    public boolean isMainFile(FileObject ob)
    {
	return ob.equals(getMainFile());
    }

    FileObject getMainFile()
    {
	String path = props.getProperty(MAIN_FILE_KEY);
	if (path == null)
	{
	    return null;
	}
	FileObject result = dir.getFileObject(path);
	return result;
    }

    void setMainFile(FileObject ob)
    {
	FileObject old = getMainFile();
	/*if (!ob.equals(old))
	{
	    String dirPath = dir.getPath();
	    String obPath = ob == null ? dirPath : ob.getPath();
	    assert ob == null || obPath.startsWith(dirPath);
	    String path = ob == null ? "" : obPath.substring(dirPath.length());
	    props.setProperty(MAIN_FILE_KEY, path);
	    ProjectState state = getLookup().lookup(ProjectState.class);
	    state.markModified();
	    try
	    {
		if (old != null)
		{
		    Node n = DataObject.find(old).getNodeDelegate();
		    MainFileProvider.Notifier not1 =
			    n.getLookup().lookup(MainFileProvider.Notifier.class);
		    if (not1 != null)
		    {
			not1.change();
		    }
		}
		if (ob != null)
		{
		    Node n1 = DataObject.find(ob).getNodeDelegate();
		    MainFileProvider.Notifier not2 =
			    n1.getLookup().lookup(MainFileProvider.Notifier.class);
		    if (not2 != null)
		    {
			not2.change();
		    }
		}
		DbLogicalViewProvider prov = getLookup().lookup(
			DbLogicalViewProvider.class);
		prov.notifyChange();

	    } catch (DataObjectNotFoundException donfe)
	    {
		throw new IllegalStateException(donfe);
	    }
	    assert (ob == null && getMainFile() == null) ||
		    ob.equals(getMainFile());
	}*/
    }
/*
    void loadProperties(Properties props) throws IOException
    {
	FileObject ob = dir.getFileObject(PROJECT_DIR);
	if (ob != null)
	{
	    FileObject pob = ob.getFileObject("project", "properties");
	    if (pob != null)
	    {
		InputStream is = pob.getInputStream();
		try
		{
		    props.load(is);
		} finally
		{
		    is.close();
		}
	    }
	}
    }

    void saveProperties(Properties props) throws IOException
    {
	FileObject ob = dir.getFileObject(PROJECT_DIR);
	FileObject pp;
	if (ob == null)
	{
	    dir.createFolder(PROJECT_DIR);
	    pp = ob.createData("project", "properties");
	} else
	{
	    pp = ob.getFileObject("project.properties");
	    if (pp == null)
	    {
		pp = ob.createData("project", "properties");
	    }
	}
	FileLock lock = pp.lock();
	try
	{
	    OutputStream out = pp.getOutputStream(lock);
	    props.store(out, "NetBeans Fan Project Properties " + new Date());
	} finally
	{
	    lock.releaseLock();
	}
    }

    public void save() throws IOException
    {
	saveProperties(props);
    }
*/
    static boolean isProject(FileObject projectDirectory)
    {
	return projectDirectory.getFileObject(PROJECT_DIR) != null;
    }

    Action[] getActions()
    {
	return new Action[]
		{
		    new GA("build"),
		    new GA("clean"),
		};
    }

    private class GA extends AbstractAction
    {

	private final String key;

	public GA(String key)
	{
	    this.key = key;
	    putValue(NAME, key);
	}

	public boolean isEnabled()
	{
	    return isActionEnabled(key, null);
	}

	public void actionPerformed(ActionEvent e)
	{
	    if (isEnabled())
	    {
		invokeAction(key, null);
	    }
	}
    }
}
