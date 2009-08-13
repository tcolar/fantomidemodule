/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.beans.PropertyChangeListener;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import net.colar.netbeans.fan.actions.BuildAndRunFanPodAction;
import net.colar.netbeans.fan.actions.BuildFanPodAction;
import net.colar.netbeans.fan.actions.CleanAndBuildFanPodAction;
import net.colar.netbeans.fan.actions.CleanFanPodAction;
import net.colar.netbeans.fan.actions.FanAction;
import net.colar.netbeans.fan.actions.RunFanFile;
import net.colar.netbeans.fan.actions.RunFanPodAction;
import net.colar.netbeans.fan.actions.RunFanShellAction;
import net.colar.netbeans.fan.actions.TestFanPodAction;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.ProjectState;
import org.openide.LifecycleManager;
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
					new FanActionProvider(this),
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

	/**
	 * ActionProvider impl.
	 * Provides supported actions for project.
	 */
	private final class FanActionProvider implements ActionProvider
	{

		FanProject project;
		private final Map<String, FanAction> commands;

		public FanActionProvider(FanProject project)
		{
			commands = new LinkedHashMap<String, FanAction>();
			FanAction[] commandArray = new FanAction[]
			{
				new RunFanPodAction(project),
				new BuildAndRunFanPodAction(project),
				new TestFanPodAction(project),
				new BuildFanPodAction(project),
				new CleanFanPodAction(project),
				new CleanAndBuildFanPodAction(project),
				new RunFanFile(project, false),
				new RunFanShellAction(project),
			};
			for (FanAction command : commandArray)
			{
				commands.put(command.getCommandId(), command);
			}
		}

		@Override
		public String[] getSupportedActions()
		{
			final Set<String> names = commands.keySet();
			return names.toArray(new String[names.size()]);
		}

		@Override
		public void invokeAction(final String commandName, final Lookup context) throws IllegalArgumentException
		{
			final FanAction command = findCommand(commandName);
			assert command != null;
			if (command.saveRequired())
			{
				LifecycleManager.getDefault().saveAll();
			}
			if (!command.asyncCallRequired())
			{
				command.invokeAction(context);
			} else
			{
				RequestProcessor.getDefault().post(new Runnable()
				{

					public void run()
					{
						command.invokeAction(context);
					}
				});
			}
		}

		@Override
		public boolean isActionEnabled(String commandName, Lookup context) throws IllegalArgumentException
		{
			//TODO: enhance this as needed
			return true;
			/*
			final Command command = findCommand(commandName);
			assert command != null;
			return command.isActionEnabled(context);
			 */
		}

		private FanAction findCommand(final String commandName)
		{
			assert commandName != null;
			return commands.get(commandName);
		}
	}
}
