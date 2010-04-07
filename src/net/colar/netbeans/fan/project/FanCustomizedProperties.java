/*
 * Thibaut Colar Aug 13, 2009
 */
package net.colar.netbeans.fan.project;

import java.io.IOException;
import net.colar.netbeans.fan.FanUtilities;
import net.jot.web.views.JOTLightweightView;
import net.colar.netbeans.fan.templates.TemplateUtils;
import net.colar.netbeans.fan.templates.TemplateView;
import org.netbeans.spi.project.ui.templates.support.Templates;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Lookup;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import javax.swing.JComponent;
import javax.swing.JPanel;
import net.colar.netbeans.fan.wizard.FanProjectPropertiesPanel;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.spi.project.ui.CustomizerProvider;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.netbeans.spi.project.ui.support.ProjectCustomizer.Category;

import fan.sys.Env;
import fan.sys.FanObj;
import org.openide.WizardDescriptor;
import org.openide.util.Exceptions;

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

                    final File buildFan = new File(folder, "build.fan");
                    if (buildFan.exists())
                    {
                        fan.sys.File buildFile = new fan.sys.LocalFile(buildFan);
                        FanObj script = (FanObj) Env.cur().compileScript(buildFile).make();
                        String buildType = script.typeof().base().name();
                        String pod;
                        if(buildType.equals("BuildPod"))
                        {
                            pod = (String) script.typeof().field("podName").get(script);
                        }
                        else
                        {
                            pod = folder;
                        }
                        settingsPanel.setPodName(pod);

                        final String description = (String) script.typeof().field("summary").get(script);
                        settingsPanel.setPodDescription(description);

                        final fan.sys.Version verObj = (fan.sys.Version) script.typeof().field("version").get(script);
                        final String version = fan.sys.Version.toStr(verObj);
                        settingsPanel.setPodVersion(version);

                        final String outDir = (String) script.typeof().field("outDir").get(script);
                        settingsPanel.setOutputDirectory(outDir);

                        Boolean docApi = (Boolean) script.typeof().field("docApi").get(script);
                        if (null == docApi) {
                            docApi = Boolean.FALSE;
                        }
                        settingsPanel.setDocApi(docApi);

                        Boolean docSrc = (Boolean) script.typeof().field("docSrc").get(script);
                        if (null == docSrc) {
                            docSrc = Boolean.FALSE;
                        }
                        settingsPanel.setDocSrc(docSrc);

                        StringBuilder sb = new StringBuilder();
                        final fan.sys.List depObj = (fan.sys.List) script.typeof().field("depends").get(script);
                        if (null != depObj) {
                            for (long i = 0; i < depObj.size(); i++ ) {
                                final String s = (String) depObj.get(i);
                                sb.append("\"");
                                sb.append(s.trim());
                                sb.append("\"");
                            }
                        }
                        settingsPanel.setDependencies(sb.toString());

                        sb = new StringBuilder();
                        final fan.sys.List srcObj = (fan.sys.List) script.typeof().field("srcDirs").get(script);
                        if (null != srcObj) {
                            for (long i = 0; i < srcObj.size(); i++ ) {
                                String s = (String) srcObj.get(i);
                                s = folder + s;
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append("`");
                                sb.append(s);
                                sb.append("`");
                            }
                        }
                        settingsPanel.setSourceDirs(sb.toString());

                        sb = new StringBuilder();
                        final fan.sys.List resObj = (fan.sys.List) script.typeof().field("resDirs").get(script);
                        if (null != resObj) {
                            for (long i = 0; i < resObj.size(); i++ ) {
                                String s = (String) resObj.get(i);
                                s = folder + s;
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append("`");
                                sb.append(s);
                                sb.append("`");
                            }
                        }
                        settingsPanel.setResourceDirs(sb.toString());

                        final fan.sys.Map idxObj = (fan.sys.Map) script.typeof().field("index").get(script);
                        if (null != idxObj) {
                            final fan.sys.List idxKeys = (fan.sys.List) idxObj.keys();
                            for (long i = 0; i < idxKeys.size(); i++ ) {
                                final String k = (String) idxKeys.get(i);
                                final String v = (String) idxObj.get(k);
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append("\"");
                                sb.append(k);
                                sb.append("\" : \"");
                                sb.append(v);
                                sb.append("\"");
                            }
                        }
                        settingsPanel.setIndex(sb.toString());

                        sb = new StringBuilder();
                        final fan.sys.Map metObj = (fan.sys.Map) script.typeof().field("meta").get(script);
                        if (null != metObj) {
                            final fan.sys.List metKeys = (fan.sys.List) metObj.keys();
                            for (long i = 0; i < metKeys.size(); i++ ) {
                                final String k = (String) metKeys.get(i);
                                final String v = (String) metObj.get(k);
                                if (sb.length() != 0) {
                                    sb.append(", ");
                                }
                                sb.append("\"");
                                sb.append(k);
                                sb.append("\" : \"");
                                sb.append(v);
                                sb.append("\"");
                            }
                        }
                        settingsPanel.setMeta(sb.toString());
                    }
		}
		
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

		private Project project;

		OptionListener(Project project)
		{
			this.project = project;
		}

		public void actionPerformed(ActionEvent e)
		{
			if(e.getActionCommand().equals("OK"))
			{
				FanProjectProperties props=project.getLookup().lookup(FanProjectProperties.class);
				if(props != null)
				{
                                    try {
                                        final FanProjectPropertiesPanel settingsPanel = (FanProjectPropertiesPanel) panels.get(categories[0]);
                                        props.setMainMethod(settingsPanel.getMainClassName());
                                        props.save();
                                        final String folder = project.getProjectDirectory().getPath();

                                        final File f = new File(props.getBuildFileTemplate());
                                        final FileObject buildTemplate = FileUtil.toFileObject(f);
                                        final JOTLightweightView view = new TemplateView(buildTemplate, settingsPanel.getPodName());
                                        view.addVariable("desc", settingsPanel.getPodDescription());
                                        view.addVariable("version", settingsPanel.getPodVersion());
                                        view.addVariable("dependencies", settingsPanel.getDependencies());
                                        view.addVariable("srcDirs", settingsPanel.getSourceDirs());
                                        view.addVariable("resDirs", settingsPanel.getResourceDirs());
                                        view.addVariable("outDir", settingsPanel.getOutputDirectory());
                                        view.addVariable("indexes", settingsPanel.getIndex());
                                        view.addVariable("metas", settingsPanel.getMeta());
                                        view.addVariable("docSrc", Boolean.toString(settingsPanel.getDocSrc()));
                                        view.addVariable("docApi", Boolean.toString(settingsPanel.getDocApi()));
                                        File buildFile = new File(folder, "build.fan");
                                        if (buildFile.exists()) {
                                            buildFile.delete();
                                        }
                                        final FileObject buildFo = FileUtil.toFileObject(buildFile);
                                        final FileObject license = FanUtilities.getRelativeFileObject(buildTemplate, "../../Licenses/FanDefaultLicense.txt");
                                        view.addVariable("license", license.asText());
                                        String buildText = buildTemplate.asText();
                                        // Take out the empty lines from the build.fan file, which can happen
                                        // when some of the params don't have values.
                                        Pattern p = Pattern.compile("^.*\\[\\]$", Pattern.MULTILINE);
                                        Matcher m = p.matcher(buildText);
                                        buildText = m.replaceAll("");
                                        p = Pattern.compile("^.*= $", Pattern.MULTILINE);
                                        m = p.matcher(buildText);
                                        buildText = m.replaceAll("");
                                        p = Pattern.compile("^.*= \"\"$", Pattern.MULTILINE);
                                        m = p.matcher(buildText);
                                        buildText = m.replaceAll("");
                                        p = Pattern.compile("^.*= Version.fromStr\\(\"\"\\)$", Pattern.MULTILINE);
                                        m = p.matcher(buildText);
                                        buildText = m.replaceAll("");
                                        // create build.fan
                                        TemplateUtils.createFromTemplate(view, buildText, buildFile);
                                    } catch (IOException ex) {
                                        Exceptions.printStackTrace(ex);
                                    }
				}
			}
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
