/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project.wizard;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.swing.JComponent;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.api.project.ProjectManager;
import org.netbeans.spi.project.ui.support.ProjectChooser;
import org.netbeans.spi.project.ui.templates.support.Templates;
import org.openide.WizardDescriptor;
import org.openide.WizardDescriptor.Panel;
import org.openide.filesystems.FileLock;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileSystem;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle;

/**
 *
 * @author thibautc
 */
public class ProjectWizzard implements WizardDescriptor.InstantiatingIterator, ChangeListener
{

    private transient int panelIndex;
    private transient WizardDescriptor.Panel[] panels;
    private transient WizardDescriptor wiz;
    List<ChangeListener> listeners = Collections.synchronizedList(new LinkedList<ChangeListener>());

    public static ProjectWizzard instance()
    {
	return new ProjectWizzard();
    }

    private String codeNamify(String name)
    {
	StringBuilder b = new StringBuilder(name.toLowerCase());
	for (int i = 0; i < b.length(); i++)
	{
	    if (Character.isWhitespace(b.charAt(i)))
	    {
		b.setCharAt(i, '_');
	    }
	}
	return b.toString();
    }

    /*
     * *********** OVERIDES *****************
     */
    public Set instantiate() throws IOException
    {
	Set resultSet = new LinkedHashSet();
	String dirName = (String) wiz.getProperty("location"); //NOI18N
	String projName = (String) wiz.getProperty("projectName"); //NOI18N
	String projCodeName = codeNamify(projName);
	String projKind = (String) wiz.getProperty("kind"); //NOI18N
	if (projName == null || projName.trim().length() == 0)
	{
	    throw new IOException("Name not specified");
	}

	File dirF = FileUtil.normalizeFile(new File(dirName));

	File projDirectory = new File(dirF, projCodeName);
	projDirectory.mkdirs();

	FileObject template = Templates.getTemplate(wiz);
	FileObject dir = FileUtil.toFileObject(projDirectory);
	dir.getFileSystem().runAtomicAction(new FSWriter(dir, projName, projCodeName, projKind, resultSet));
	File parent = dirF.getParentFile();
	if (parent != null && parent.exists())
	{
	    ProjectChooser.setProjectsFolder(parent);
	}

	return resultSet;
    }

    public void initialize(WizardDescriptor wiz)
    {
	this.wiz = wiz;
	panelIndex = 0;
	panels = createPanels();
	// Make sure list of steps is accurate.
	String[] steps = createSteps();
	for (int i = 0; i < panels.length; i++)
	{
	    Component c = panels[i].getComponent();
	    if (steps[i] == null)
	    {
		// Default step name to component name of panel.
		// Mainly useful for getting the name of the target
		// chooser to appear in the list of steps.
		steps[i] = c.getName();
	    }
	    if (c instanceof JComponent)
	    { // assume Swing components
		JComponent jc = (JComponent) c;
		// Step #.
		jc.putClientProperty("WizardPanel_contentSelectedIndex", new Integer(i));
		// Step name (actually the whole list for reference).
		jc.putClientProperty("WizardPanel_contentData", steps);
	    }
	}
	wiz.setValid(false);
    }

    public void uninitialize(WizardDescriptor wiz)
    {
	this.wiz.putProperty("projdir", null);
	this.wiz.putProperty("name", null);
	this.wiz = null;
	panels = null;
    }

    public Panel current()
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public String name()
    {
	return MessageFormat.format("{0} of {1}",
		new Object[]
		{
		    new Integer(panelIndex + 1), new Integer(panels.length)
		});
    }

    public boolean hasNext()
    {
	return panelIndex < panels.length - 1;
    }

    public boolean hasPrevious()
    {
	return panelIndex > 0;
    }

    public void nextPanel()
    {
	if (!hasNext())
	{
	    throw new NoSuchElementException();
	}
	panelIndex++;
    }

    public void previousPanel()
    {
	if (!hasPrevious())
	{
	    throw new NoSuchElementException();
	}
	panelIndex--;
    }

    public void addChangeListener(ChangeListener l)
    {
	listeners.add(l);
    }

    public void removeChangeListener(ChangeListener l)
    {
	listeners.remove(l);
    }

    public void stateChanged(ChangeEvent arg0)
    {
	wiz.setValid(((ProjectPanel) panels[0]).isValid());
	fire();
    }

    /*
     * *********** END OVERIDES *****************
     */
    private void fire()
    {
	ChangeListener[] l =
		(ChangeListener[]) listeners.toArray(new ChangeListener[0]);
	for (int i = 0; i < l.length; i++)
	{
	    l[i].stateChanged(new ChangeEvent(this));
	}
    }

    private WizardDescriptor.Panel[] createPanels()
    {
	return new WizardDescriptor.Panel[]
		{
		    new ProjectPanel(),
		};
    }

    private String[] createSteps()
    {
	return new String[]
		{
		    NbBundle.getMessage(getClass(), "LBL_CreateProjectStep")
		};
    }

    private class FSWriter implements FileSystem.AtomicAction
    {

	private final Set resultSet;
	private final String codeName;
	private final String projName;
	private final FileObject dir;
	private final String projKind;

	FSWriter(FileObject dir, String projName, String codeName, String projKind, Set resultSet)
	{
	    this.dir = dir;
	    this.projName = projName;
	    this.codeName = codeName;
	    this.projKind = projKind;
	    this.resultSet = resultSet;
	}

	public void run() throws IOException
	{
	    String mainFileName = codeName + ".xml";
	    FileObject projDir = dir.createFolder("fanproject"); //NOI18N
	    FileObject metadata = projDir.createData("project", "properties"); //NOI18N

	    FileObject mainFile = dir.createData(mainFileName);
	    writeMainFile(mainFile, projKind);
	    writeMetadata(metadata, mainFile);

	    // Always open top dir as a project:
	    resultSet.add(dir);
	    resultSet.add(mainFile);
	    // Look for nested projects to open as well:
	    Enumeration e = dir.getFolders(true);
	    while (e.hasMoreElements())
	    {
		FileObject subfolder = (FileObject) e.nextElement();
		if (ProjectManager.getDefault().isProject(subfolder))
		{
		    resultSet.add(subfolder);
		}
	    }

	}

	private void writeMetadata(FileObject metadata, FileObject mainFile) throws IOException
	{
	    String s = "main.file=" + mainFile.getNameExt() + "\n";
	    FileLock lock = metadata.lock();
	    OutputStream os = metadata.getOutputStream(lock);
	    PrintWriter pw = new PrintWriter(os);
	    try
	    {
		pw.println(s);
	    } finally
	    {
		pw.close();
		os.close();
		lock.releaseLock();
	    }
	}

	private void writeMainFile(FileObject file, String kind) throws IOException
	{
	    FileLock lock = file.lock();
	    OutputStream os = file.getOutputStream(lock);
	    PrintWriter pw = new PrintWriter(os);
	    try
	    {
		String header;
		String content;
		//TODO
		//pw.println(header);
		//pw.println(content);
	    } finally
	    {
		pw.close();
		lock.releaseLock();
		os.close();
	    }
	}
    }
}
