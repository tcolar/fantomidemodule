/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.wizard;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JComponent;
import org.netbeans.spi.options.OptionsPanelController;
import org.openide.util.HelpCtx;
import org.openide.util.Lookup;

/**
 *
 * @author tcolar
 */
public class FanGlobalSettingsController extends OptionsPanelController
{

    private FanGlobalSettingsPanel panel;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private boolean changed;

    public void update()
    {
	//TODO:
	changed();
    }

    public void applyChanges()
    {
	//TODO: 
	System.err.println("would be saving fan home");
	changed = false;
    }

    public void cancel()
    {
	// need not do anything special, if no changes have been persisted yet
    }

    public boolean isValid()
    {
	return getPanel().valid();
    }

    public boolean isChanged()
    {
	return changed;
    }

    public HelpCtx getHelpCtx()
    {
	return null;
    }

    public JComponent getComponent(Lookup masterLookup)
    {
	return getPanel();
    }

    public void addPropertyChangeListener(PropertyChangeListener l)
    {
	pcs.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l)
    {
	pcs.removePropertyChangeListener(l);
    }

    private FanGlobalSettingsPanel getPanel()
    {
	if (panel == null)
	{
	    panel = new FanGlobalSettingsPanel(this);
	}
	return panel;
    }

    void changed()
    {
	if (!changed)
	{
	    changed = true;
	    pcs.firePropertyChange(OptionsPanelController.PROP_CHANGED, false, true);
	}
	pcs.firePropertyChange(OptionsPanelController.PROP_VALID, null, null);
    }
}
