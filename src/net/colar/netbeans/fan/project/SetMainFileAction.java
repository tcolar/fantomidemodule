/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.project;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import org.netbeans.api.project.FileOwnerQuery;
import org.netbeans.api.project.Project;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.util.ContextAwareAction;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.Utilities;

/**
 *
 * @author thibautc
 */
public class SetMainFileAction extends AbstractAction implements ContextAwareAction, LookupListener {
    private final Lookup lkp;
    private final Lookup.Result res;
    /** Creates a new instance of SetMainFileAction */
    public SetMainFileAction() {
        this (Utilities.actionsGlobalContext());
    }

    public SetMainFileAction (Lookup lkp) {
        this.lkp = lkp;
        putValue (NAME, "Set Main File");
        assert lkp != null;
        this.res = lkp.lookupResult(DataObject.class);
        resultChanged (null);
    }

    public void actionPerformed(ActionEvent e) {
        FanProject proj = getDbProject();
        DataObject ob = lkp.lookup (DataObject.class);
        if (ob != null && proj != null) {
            proj.setMainFile(ob.getPrimaryFile());
        }
    }

    public Action createContextAwareInstance(Lookup actionContext) {
        return new SetMainFileAction (actionContext);
    }

    public void resultChanged(LookupEvent ev) {
        res.allInstances();
        DataObject dob = lkp.lookup(DataObject.class);
        FanProject proj = getDbProject();
        boolean enable = proj != null && dob != null;
        System.err.println("First test " + enable + " dob " + dob + " proj " + proj);
        if (enable) {
            FileObject main = proj.getMainFile();
            FileObject mine = dob.getPrimaryFile();
            enable = !mine.equals(main);
            System.err.println("Second test " + enable + " for " + mine + " on lkp " + lkp + " main file " + main);
        }
        setEnabled (enable);
    }

    private FanProject getDbProject() {
        DataObject ob = lkp.lookup(DataObject.class);
        FanProject result = null;
        if (ob != null) {
            Project p = FileOwnerQuery.getOwner(ob.getPrimaryFile());
            System.err.println("Found project " + p);
            System.err.println("Class match: " + (FanProject.class.isAssignableFrom(p.getClass())));
            System.err.println("  cm2 " + (p instanceof FanProject));
            if (p instanceof FanProject) {
                result = (FanProject) p;
                System.err.println("Fan PROJECT IS PROJECT " + result);
            } else if (p != null) {
                result = p.getLookup().lookup (FanProject.class);
                System.err.println("Found Fan Project " + result);
            }
        }
        return result;
    }

}

