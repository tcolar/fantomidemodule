/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.wizard;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.swing.event.ChangeListener;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.project.FanProjectProperties;
import net.colar.netbeans.fan.project.FanBuild;
import net.colar.netbeans.fan.templates.TemplateUtils;
import net.colar.netbeans.fan.templates.TemplateView;
import net.jot.web.views.JOTLightweightView;
import org.netbeans.spi.project.ui.support.ProjectChooser;
import org.netbeans.spi.project.ui.templates.support.Templates;
import org.openide.WizardDescriptor;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 * Generated by NB "New wizard"
 * Iterator for new fan project/pod wizard
 * @author tcolar
 */
public final class FanPodWizardIterator implements WizardDescriptor.InstantiatingIterator
{

	private int index;
	private WizardDescriptor wizard;
	private WizardDescriptor.Panel[] panels;
	/**
	 * Initialize panels representing individual wizard's steps and sets
	 * various properties for them influencing wizard appearance.
	 */
	private WizardDescriptor.Panel packageChooserPanel;

	private WizardDescriptor.Panel[] getPanels()
	{
		if (panels == null)
		{
			panels = new WizardDescriptor.Panel[]
                        {
                            new FanPodWizardPanel1(System.getProperty("user.dir")),
                        };
		}
		return panels;
	}

	public FanPodWizardPanel1 getPanel()
	{
		return (FanPodWizardPanel1) panels[0];
	}

	/**
	 * Called when "finish" is pressed
	 * @return
	 * @throws IOException
	 */
	public Set instantiate() throws IOException
	{
		FanPodWizardPanel1 panel = getPanel();
		// create project
                String podFolder = panel.getProjectFolder();
		File pf = FileUtil.normalizeFile(new File(podFolder));
		pf.mkdirs();
		FileObject pfFo = FileUtil.toFileObject(pf);
                
		// fan sources folder
		File fan = FileUtil.normalizeFile(new File(pf, "fan"));
		fan.mkdirs();
                FileObject fanFo = FileUtil.toFileObject(fan);

		FileObject buildTemplate = Templates.getTemplate(wizard);

		// Create main class
                String name = panel.getMainClassName();
		if (name != null)
		{
                    File mainFile = new File(fan, name + ".fan");
                    JOTLightweightView view = new TemplateView(buildTemplate, name);
                    view.addVariable("doClass", Boolean.TRUE);
                    view.addVariable("doMain", Boolean.TRUE);
                    FileObject license = FanUtilities.getRelativeFileObject(buildTemplate, "../../Licenses/FanDefaultLicense.txt");
                    view.addVariable("license", license.asText());
                    FileObject newTemplate = FanUtilities.getRelativeFileObject(buildTemplate, "../../Fantom/FantomFile");
                    String templateText = newTemplate.asText();
                    //open it in editor
                    TemplateUtils.createFromTemplate(view, templateText, mainFile);
                    FanUtilities.openFileInEditor(mainFile);
                    // save main class in props
                    /*File props = new File(pf.getAbsolutePath() + File.separator + FanProjectProperties.PROJ_PROPS_PATH);
                    props.getParentFile().mkdirs();
                    Hashtable<String, String> map = new Hashtable<String, String>();
                    map.put(FanProjectProperties.MAIN_METHOD, name + ".main");
                    FanProjectProperties.createFromScratch(map, props);*/
		}
                // save main class in props
                File props = new File(pf.getAbsolutePath() + File.separator + FanProjectProperties.PROJ_PROPS_PATH);
                props.getParentFile().mkdirs();
                Hashtable<String, String> map = new Hashtable<String, String>();
                if (name != null) {
                    if (!name.endsWith(".main")) {
                        name += ".main";
                    }
                    map.put(FanProjectProperties.MAIN_METHOD, name);
                }
                String buildFanTemplateURI = buildTemplate.getURL().toExternalForm();
                map.put(FanProjectProperties.BUILD_FAN_TEMPLATE, buildFanTemplateURI);

                FanProjectProperties.createFromScratch(map, props);

		// Create the build file LAST, because as soon as that is created,
		// NB will recognize this as a project, so we want everything(props) to be ready by then
                FanBuild build = new FanBuild(podFolder);
                build.setPodName(panel.getPodName());
                build.setPodDescription(panel.getPodDesc());
                build.setPodVersion(panel.getPodVersion());
                build.setDependencies(panel.getDependencies());
                build.setMeta(panel.getMeta());
                build.setIndex(panel.getIndex());
                build.setOutputDirectory(panel.getOutDir());
                build.setDocSrc(panel.getDocSrc());
                build.setDocApi(panel.getDocApi());
                build.setSourceDirs(panel.getSourceDirs());
                build.setResourceDirs(panel.getResourceDirs());
                build.create(buildFanTemplateURI);

                File b = new File(podFolder, "build.fan");
                FileObject buildFo = null;
                if (b.exists()) {
                    buildFo = FileUtil.toFileObject(b);
                }

		// Look for nested projects to open as well:
		LinkedHashSet<FileObject> resultSet = new LinkedHashSet<FileObject>();
		resultSet.add(pfFo);
		resultSet.add(fanFo);
		if (buildFo != null)
		{
                    resultSet.add(buildFo);
		}

		File parent = pf.getParentFile();
		// Always open top dir as a project:
		if (parent != null && parent.exists())
		{
                    ProjectChooser.setProjectsFolder(parent);
		}

		return resultSet;
	}

	public static FanPodWizardIterator instance()
	{
		return new FanPodWizardIterator();
	}

	public void initialize(WizardDescriptor wizard)
	{
		this.wizard = wizard;
	}

	public void uninitialize(WizardDescriptor wizard)
	{
		panels = null;
	}

	public WizardDescriptor.Panel current()
	{
		return getPanels()[index];
	}

	public String name()
	{
		return index + 1 + ". from " + getPanels().length;
	}

	public boolean hasNext()
	{
		return index < getPanels().length - 1;
	}

	public boolean hasPrevious()
	{
		return index > 0;
	}

	public void nextPanel()
	{
		if (!hasNext())
		{
			throw new NoSuchElementException();
		}

		index++;
	}

	public void previousPanel()
	{
		if (!hasPrevious())
		{
			throw new NoSuchElementException();
		}

		index--;
	}

// If nothing unusual changes in the middle of the wizard, simply:
	public void addChangeListener(ChangeListener l)
	{
	}

	public void removeChangeListener(ChangeListener l)
	{
	}

	// You could safely ignore this method. Is is here to keep steps which were
	// there before this wizard was instantiated. It should be better handled
	// by NetBeans Wizard API itself rather than needed to be implemented by a
	// client code.
	private String[] createSteps()
	{
		String[] beforeSteps = null;
		Object prop = wizard.getProperty("WizardPanel_contentData");
		if (prop != null && prop instanceof String[])
		{
			beforeSteps = (String[]) prop;
		}

		if (beforeSteps == null)
		{
			beforeSteps = new String[0];
		}

		String[] res = new String[(beforeSteps.length - 1) + panels.length];
		for (int i = 0; i
			< res.length; i++)
		{
			if (i < (beforeSteps.length - 1))
			{
				res[i] = beforeSteps[i];
			} else
			{
				res[i] = panels[i - beforeSteps.length + 1].getComponent().getName();
			}

		}
		return res;
	}
}
