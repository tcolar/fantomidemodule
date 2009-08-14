/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.beans.PropertyChangeListener;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.spi.project.ProjectState;
import org.openide.filesystems.FileObject;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.RequestProcessor;
import org.openide.util.lookup.Lookups;

/**
 * Inspired/copied from Docbook project
 * Fan Project implementation
 * Provides detection of fan project(folder with build.fan)
 * Provides actions list(Actionprovider innerclass) allowed to be run on project item (run/debug etc...)
 * @author thibautc
 */
public class FanProject implements Project, ProjectInformation
{

	private final FileObject dir;
	private final Lookup lkp;
	final RequestProcessor rp;
	final Properties props = new Properties();

	public FanProject(FileObject dir, ProjectState state)
	{
		this.dir = dir;
		lkp = Lookups.fixed(new Object[]
			{
				this,
				new FanLogicalView(this),
				new FanProjectActionProvider(this),
				new FanCustomizedProperties(this),
				new FanProjectProperties(this),
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
		return new ImageIcon(ImageUtilities.loadImage("net/colar/netbeans/fan/fan.png"));
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

	public static boolean isProject(FileObject projectDirectory)
	{
		//TODO: is this enough ?
		return projectDirectory.getFileObject(FanProjectFactory.FAN_BUILD_FILE) != null;
	}

}
