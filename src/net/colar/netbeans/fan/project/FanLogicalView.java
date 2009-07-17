/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.ErrorManager;
import org.openide.actions.FileSystemAction;
import org.openide.actions.NewTemplateAction;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.nodes.NodeAdapter;
import org.openide.nodes.NodeEvent;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author thibautc
 */
public class FanLogicalView extends AbstractNode
{

    public FanLogicalView(FanProject proj) throws DataObjectNotFoundException
    {
	super(Children.<FileObject>create(new FanLogicalViewChildren(proj), true),
		Lookups.fixed(proj, DataObject.find(proj.getProjectDirectory())));
	setDisplayName(proj.getProjectDirectory().getName());
	setIconBaseWithExtension("net/colar/netbeans/fan/fan.png"); //NOI18N
	notifyMainNameChanged();
    }
    private FanFileFilterNode lnode = null;

    void notifyMainNameChanged()
    {
	FanProject proj = getLookup().lookup(FanProject.class);
	FileObject fob = proj.getMainFile();
	if (lnode != null)
	{
	    lnode.removeNodeListener(nl);
	    lnode = null;
	}
	if (fob != null)
	{
	    try
	    {
		DataObject dob = DataObject.find(fob);
		Node n = dob.getNodeDelegate();
		lnode = new FanFileFilterNode(n, proj, fob.getParent());
		lnode.addNodeListener(nl);
		nl.propertyChange(new PropertyChangeEvent(lnode,
			Node.PROP_DISPLAY_NAME, null, null));
	    } catch (Exception e)
	    {
		ErrorManager.getDefault().notify(e);
	    }
	}
    }
    private NL nl = new NL();

    private class NL extends NodeAdapter
    {

	public void nodeDestroyed(NodeEvent ev)
	{
	    ev.getNode().removeNodeListener(this);
	}

	public void propertyChange(PropertyChangeEvent evt)
	{
	    if (Node.PROP_DISPLAY_NAME.equals(evt.getPropertyName()))
	    {
		setDisplayName(((Node) evt.getSource()).getDisplayName());
	    }
	}
    }

    public Action[] getActions(boolean context)
    {
	FanProject proj = getLookup().lookup(FanProject.class);
	Action[] a = proj.getActions();
	List<Action> l = new ArrayList<Action>(Arrays.<Action>asList(a));
	l.add(0, SystemAction.get(NewTemplateAction.class));
	l.add(1, null);
	l.add(2, SystemAction.get(org.openide.actions.FindAction.class));
	l.add(null);
	l.add(new SetMainProjectAction());
	l.add(new CloseProjectAction());
	l.add(null);
	l.add(SystemAction.get(FileSystemAction.class));

	a = l.toArray(a);
	return a;
    }

    private class SetMainProjectAction extends AbstractAction
    {

	public SetMainProjectAction()
	{
	    putValue(NAME, "Set Main Project");
	}

	public void actionPerformed(ActionEvent e)
	{
	    OpenProjects.getDefault().setMainProject(getLookup().lookup(Project.class));
	}
    }

    private class CloseProjectAction extends AbstractAction
    {

	public CloseProjectAction()
	{
	    putValue(NAME, "Close Project");
	}

	public void actionPerformed(ActionEvent e)
	{
	    OpenProjects.getDefault().close(new Project[]
		    {
			getLookup().lookup(Project.class)
		    });
	}
    }
}

