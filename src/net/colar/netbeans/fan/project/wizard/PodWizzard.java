/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.project.wizard;
import java.io.IOException;
import java.util.Set;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.openide.WizardDescriptor;
import org.openide.WizardDescriptor.Panel;

/**
 *
 * @author thibautc
 */
public class PodWizzard implements WizardDescriptor.InstantiatingIterator, ChangeListener{

    public static PodWizzard instance()
    {
	return new PodWizzard();
    }

    /*
     * *********** OVERIDES *****************
    */
    public Set instantiate() throws IOException
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public void initialize(WizardDescriptor arg0)
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public void uninitialize(WizardDescriptor arg0)
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public Panel current()
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public String name()
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean hasNext()
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean hasPrevious()
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public void nextPanel()
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public void previousPanel()
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addChangeListener(ChangeListener arg0)
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removeChangeListener(ChangeListener arg0)
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public void stateChanged(ChangeEvent arg0)
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }
     /*
     * *********** END OVERIDES *****************
    */

}
