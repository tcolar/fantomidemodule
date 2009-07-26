/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import javax.swing.JOptionPane;
import net.colar.netbeans.fan.project.FanProject;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.windows.TopComponent;

/**
 * Command / Action Base
 * Copied/modified from Python module
 */
public abstract class FanAction
{

    private final FanProject project;

    public FanAction(FanProject project)
    {
	this.project = project;
	assert project != null;
    }

    public abstract String getCommandId();

    public abstract void invokeAction(Lookup context) throws IllegalArgumentException;

    public abstract boolean isActionEnabled(Lookup context) throws IllegalArgumentException;

    public boolean asyncCallRequired()
    {
	return true;
    }

    public boolean saveRequired()
    {
	return true;
    }

    public final FanProject getProject()
    {
	return project;
    }

    public Node[] getSelectedNodes()
    {
	return TopComponent.getRegistry().getCurrentNodes();
    }

    protected void showLaunchError(String message)
    {
	JOptionPane.showMessageDialog(null, message, "Python Launch Error", JOptionPane.ERROR_MESSAGE);

    }
}
