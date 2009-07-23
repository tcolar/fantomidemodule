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
import java.awt.Image;
import java.beans.PropertyChangeListener;
import java.util.Properties;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.ProjectState;
import org.netbeans.spi.project.ui.support.CommonProjectActions;
import org.netbeans.spi.project.ui.support.DefaultProjectOperations;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.netbeans.spi.project.ui.support.ProjectSensitiveActions;
import org.openide.filesystems.FileObject;
import org.openide.nodes.AbstractNode;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.RequestProcessor;
import org.openide.util.Utilities;
import org.openide.util.lookup.Lookups;

public class FanProject implements Project, ProjectInformation
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
		    new FanLogicalView(this),
		    new FanActionProvider(),
		    state,
		    props,
		});
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

    static boolean isProject(FileObject projectDirectory)
    {
	return projectDirectory.getFileObject(PROJECT_DIR) != null;
    }

    private final class FanActionProvider implements ActionProvider
    {

	private String[] supported = new String[]
	{
	    ActionProvider.COMMAND_DELETE,
	    ActionProvider.COMMAND_COPY,
	    ActionProvider.COMMAND_BUILD,
	    ActionProvider.COMMAND_CLEAN,
	ActionProvider.COMMAND_RUN,/*
	ActionProvider.COMMAND_RUN_SINGLE,
	ActionProvider.COMMAND_TEST,
	ActionProvider.COMMAND_COPY,
	ActionProvider.COMMAND_DELETE,
	ActionProvider.COMMAND_MOVE,
	ActionProvider.COMMAND_RENAME,*/
	};

	@Override
	public String[] getSupportedActions()
	{
	    return supported;
	}

	@Override
	public void invokeAction(String string, Lookup lookup) throws IllegalArgumentException
	{
	    if (string.equals(ActionProvider.COMMAND_DELETE))
	    {
		DefaultProjectOperations.performDefaultDeleteOperation(FanProject.this);
	    }
	    if (string.equals(ActionProvider.COMMAND_COPY))
	    {
		DefaultProjectOperations.performDefaultCopyOperation(FanProject.this);
	    }
	    //Here we find the Ant script and call the target we need!
	    if (string.equals(ActionProvider.COMMAND_BUILD))
	    {
		//todo
	    }
	}

	@Override
	public boolean isActionEnabled(String command, Lookup lookup) throws IllegalArgumentException
	{
	    return true;
	}
    }

 
}
