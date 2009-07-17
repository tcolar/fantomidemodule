/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.util.Arrays;
import java.util.List;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;

/**
 *
 * @author thibautc
 */
public class ImageChildren extends FilterNode.Children
{

    private static final List exts = Arrays.asList(new String[]
	    {
		"jpg", "jpeg", "gif", "png" //XXX get from 1.6 imageio method
	    });

    public ImageChildren(FileObject folder) throws DataObjectNotFoundException
    {
	super(DataObject.find(folder).getNodeDelegate());
    }

    protected Node[] createNodes(Node key)
    {
	DataObject ob = key.getLookup().lookup(DataObject.class);
	if (ob != null)
	{
	    FileObject fob = ob.getPrimaryFile();
	    if (exts.contains(fob.getExt().toLowerCase()))
	    {
		return super.createNodes(key);
	    }
	}
	return new Node[0];
    }
}

