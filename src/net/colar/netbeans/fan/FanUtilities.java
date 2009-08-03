/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan;

import java.io.File;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;

/**
 * Generic utilities
 * @author thibautc
 */
public class FanUtilities {

    /**
     * Opens the given file in the editor.
     * @param newFile
     * @throws DataObjectNotFoundException
     */
    public static void openFileInEditor(File newFile) throws DataObjectNotFoundException
    {
	FileObject fob=FileUtil.toFileObject(newFile);
	openFileInEditor(fob);
    }

    private static void openFileInEditor(FileObject fob) throws DataObjectNotFoundException
    {
	if (fob != null)
	{
	    DataObject dob = DataObject.find(fob);
	    OpenCookie oc = dob.getCookie(OpenCookie.class);
	    if (oc != null)
	    {
		oc.open();
	    }
	}
    }

}
