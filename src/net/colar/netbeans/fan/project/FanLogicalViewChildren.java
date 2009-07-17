/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.project;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.loaders.DataObject;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.WeakListeners;
import org.openide.util.WeakSet;

/**
 *
 * @author thibautc
 */
public class FanLogicalViewChildren extends ChildFactory<FileObject> implements FileChangeListener {
    private final FanProject proj;
    private static final Logger log = Logger.getLogger(FanLogicalViewChildren.class.getName());
    final Object lock = new Object();
    public FanLogicalViewChildren(FanProject proj) {
        this.proj = proj;
    }

    public void fileFolderCreated(FileEvent fe) {
        refresh(false);
    }

    public void fileDataCreated(FileEvent fe) {
        refresh(false);
    }

    public void fileChanged(FileEvent fe) {
        //do nothing
    }

    public void fileDeleted(FileEvent fe) {
        refresh(false);
    }

    public void fileRenamed(FileRenameEvent fe) {
        refresh(false);
    }

    public void fileAttributeChanged(FileAttributeEvent fe) {
        //do nothing
    }

    WeakSet <FanFileFilterNode> nodes = new WeakSet <FanFileFilterNode> (); //temporary fix
    @Override
    protected Node createNodeForKey(FileObject key) {
        try {
            DataObject dob = DataObject.find(key);
            FanFileFilterNode result = new FanFileFilterNode (dob.getNodeDelegate(), proj, key.getParent());
            return result;
        } catch (IOException ioe) {
            AbstractNode result = new AbstractNode(Children.LEAF);
            result.setDisplayName (ioe.getMessage());
            Exceptions.printStackTrace (ioe);
            return result;
        }
    }

    private boolean initialized;
    protected boolean createKeys(List <FileObject> toPopulate) {
        try {
            FileObject projdir = proj.getProjectDirectory();
            if (!initialized) {
                projdir.addFileChangeListener(WeakListeners.create(FileChangeListener.class, this, projdir));
                initialized = true;
            }
            boolean result = findFiles (projdir, toPopulate);
            return result;
        } catch (InterruptedException ex) {
            Exceptions.printStackTrace( ex );
            return true;
        }
    }

    private boolean findFiles (FileObject dir, Collection <FileObject> dest) throws InterruptedException {
        int sz = dest.size();
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (dir.isFolder()) {
            FileObject[] obs = dir.getChildren();
            for (int i = 0; i < obs.length; i++) {
                findFiles (obs[i], dest);
            }
        } else if ("text/x-docbook+xml".equals(dir.getMIMEType())) {
            dest.add (dir);
        }
        boolean result = dest.size() > sz;
        return result;
    }
}
