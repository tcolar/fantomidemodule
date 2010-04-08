/*
 * Thibaut Colar Aug 13, 2009
 */
package net.colar.netbeans.fan.project;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JPanel;
import net.colar.netbeans.fan.wizard.FanProjectPropertiesPanel;
import javax.swing.SwingWorker;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.spi.project.ui.CustomizerProvider;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.netbeans.spi.project.ui.support.ProjectCustomizer.Category;

/**
 * Project/Pod propeties
 * @author thibautc
 */
public class FanCustomizedProperties implements CustomizerProvider
{
	private ProjectCustomizer.CategoryComponentProvider panelProvider;
	private final FanProject project;
	private Category[] categories;
	Map<Category,JComponent> panels = new HashMap<Category,JComponent>();

	public FanCustomizedProperties(FanProject project)
	{
		this.project = project;
	}

	public void init()
	{
		Category settings = Category.create(
			"Pod Settings",
			"Pod Settings",
			null,
			(Category[]) null);
		// ! panel order used in actionPerformed !
		categories = new Category[]
		{
			settings,
		};

		FanProjectProperties props=project.getLookup().lookup(FanProjectProperties.class);
                String folder = project.getProjectDirectory().getPath();
                if (!folder.endsWith("/")) {
                    folder += "/";
                }
		FanProjectPropertiesPanel settingsPanel=new FanProjectPropertiesPanel(folder);
		if(props!=null)
		{
                    settingsPanel.setMainClassName(props.getMainMethod());
                }
                FanBuild build = new FanBuild(project.getProjectDirectory().getPath());
                build.parse();
                settingsPanel.setPodName(build.getPodName());
                settingsPanel.setPodDescription(build.getPodDescription());
                settingsPanel.setPodVersion(build.getPodVersion());
                settingsPanel.setOutputDirectory(build.getOutputDirectory());
                settingsPanel.setDocApi(build.getDocApi());
                settingsPanel.setDocSrc(build.getDocSrc());
                settingsPanel.setDependencies(build.getDependencies());
                settingsPanel.setSourceDirs(build.getSourceDirs());
                settingsPanel.setResourceDirs(build.getResourceDirs());
                settingsPanel.setIndex(build.getIndex());
                settingsPanel.setMeta(build.getMeta());
		
		panels.put(settings, settingsPanel);
		panelProvider = new PanelProvider(panels);
	}

	public void showCustomizer()
	{
		init();

		OptionListener listener = new OptionListener(project);
		Dialog dialog = ProjectCustomizer.createCustomizerDialog(categories, panelProvider,
			null, listener, null);
		dialog.addWindowListener(listener);

		dialog.setTitle(ProjectUtils.getInformation(project).getDisplayName());

		dialog.setVisible(true);
	}

	private static class PanelProvider implements ProjectCustomizer.CategoryComponentProvider
	{
		private Map<Category, JComponent> panels;
		private JPanel EMPTY_PANEL = new JPanel();

		public PanelProvider(Map<Category,JComponent> panels)
		{
			this.panels = panels;
		}

		public JComponent create(ProjectCustomizer.Category category)
		{
			JComponent panel = panels.get(category);
			return panel == null ? EMPTY_PANEL : panel;
		}
	}

	private class OptionListener extends WindowAdapter implements ActionListener
	{

		private FanProject project;

		OptionListener(FanProject project)
		{
			this.project = project;
		}

		public void actionPerformed(final ActionEvent e)
		{
                    final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                        public Integer doInBackground() {
                            if(e.getActionCommand().equals("OK"))
                            {
                                final FanProjectProperties props=project.getLookup().lookup(FanProjectProperties.class);
                                final FanProjectPropertiesPanel settingsPanel = (FanProjectPropertiesPanel) panels.get(categories[0]);
                                if(props != null)
                                {
                                    props.setMainMethod(settingsPanel.getMainClassName());
                                    props.save();
                                }
                                final String template = props.getBuildFileTemplate();
                                FanBuild build = new FanBuild(project.getProjectDirectory().getPath());
                                build.setPodName(settingsPanel.getPodName());
                                build.setPodDescription(settingsPanel.getPodDescription());
                                build.setPodVersion(settingsPanel.getPodVersion());
                                build.setSourceDirs(settingsPanel.getSourceDirs());
                                build.setResourceDirs(settingsPanel.getResourceDirs());
                                build.setOutputDirectory(settingsPanel.getOutputDirectory());
                                build.setDocSrc(settingsPanel.getDocSrc());
                                build.setDocApi(settingsPanel.getDocApi());
                                build.setDependencies(settingsPanel.getDependencies());
                                build.setIndex(settingsPanel.getIndex());
                                build.setMeta(settingsPanel.getMeta());
                                build.create(template);
                            }
                            return 0;
                        }
                    };
                    sw.execute();
                }

		@Override
                public void windowClosed(WindowEvent e)
		{
		}

                @Override
		public void windowClosing(WindowEvent e)
		{
		}
	}
}
