/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.wizard;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.swing.event.ChangeListener;
import net.colar.netbeans.fan.templates.TemplateUtils;
import net.colar.netbeans.fan.templates.TemplateView;
import net.jot.logger.JOTLogger;
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
	String podFolder = panel.getProjectFolder();
	String podName = panel.getPodName();
	String podDesc = panel.getPodDesc();
	boolean createBuildFile = panel.getCreateBuildFile();

	// create project
	File pf = FileUtil.normalizeFile(new File(podFolder));
	pf.mkdirs();
	FileObject pfFo = FileUtil.toFileObject(pf);
	// fan sources folder
	File fan = FileUtil.normalizeFile(new File(pf, "fan"));
	fan.mkdirs();
	File test = FileUtil.normalizeFile(new File(pf, "test"));
	test.mkdirs();
	//build.fan
	FileObject fanFo = FileUtil.toFileObject(fan);
	FileObject testFo = FileUtil.toFileObject(test);
	FileObject buildFo = null;
	if (createBuildFile)
	{
	    FileObject template = Templates.getTemplate(wizard);

	    JOTLightweightView view = new TemplateView(template,podName);
	    
	    view.addVariable("desc", podDesc);

	    File buildFile = new File(pf, "build.fan");

	    String templateText = template.asText();

	    JOTLogger.initIfNecessary(TemplateUtils.LOG_FILE.getAbsolutePath(), new String[0], "");
	    TemplateUtils.createFromTemplate(view, templateText, buildFile);

	    buildFo = FileUtil.toFileObject(buildFile);
	}

	// Look for nested projects to open as well:
	LinkedHashSet resultSet = new LinkedHashSet();
	resultSet.add(pfFo);
	resultSet.add(fanFo);
	resultSet.add(testFo);
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
	for (int i = 0; i <
		res.length; i++)
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
