/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.beans.PropertyChangeListener;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import net.colar.netbeans.fan.debugger.FanDebugPathProvider;
import net.colar.netbeans.fan.project.path.FanClassPathProvider;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.java.classpath.GlobalPathRegistry;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.spi.project.ProjectState;
import org.netbeans.spi.project.ui.ProjectOpenedHook;
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
	//TODO: make src folders dynamic

	public static final String HARDCODED_JAVA_SRC_FOLDER = "java";
	public static final String HARDCODED_FAN_SRC_FOLDER = "fan";
	public static final String HARDCODED_TEST_SRC_FOLDER = "test";
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
				new FanClassPathProvider(this),
				new FanDebugPathProvider(),
				new ProjectOpenedHookImpl(),
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

	private final class ProjectOpenedHookImpl extends ProjectOpenedHook
	{

		protected void projectOpened()
		{
			//TODO: register this folder, or the parent ???
			FanClassPathProvider cpProvider = lkp.lookup(FanClassPathProvider.class);
			//GlobalPathRegistry.getDefault().register(PATH_BOOT, cpProvider.getProjectClassPaths(PATH_BOOT));
			GlobalPathRegistry.getDefault().register(ClassPath.SOURCE, cpProvider.getProjectClassPaths(ClassPath.SOURCE));
		}

		protected void projectClosed()
		{
			FanClassPathProvider cpProvider = lkp.lookup(FanClassPathProvider.class);
			GlobalPathRegistry.getDefault().unregister(ClassPath.SOURCE, cpProvider.getProjectClassPaths(ClassPath.SOURCE));
		}
	}

}
