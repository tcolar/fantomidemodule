/*
 * Thibaut Colar Mar 10, 2010
 */

package net.colar.netbeans.fan.test;

import java.io.File;
import org.netbeans.editor.BaseDocument;
import org.netbeans.modules.csl.spi.GsfUtilities;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 *
 * @author thibautc
 */
public class NBTestUtilities {
	
	public static Snapshot fileToSnapshot(File f)
	{
		FileObject fo = FileUtil.toFileObject(f);
		BaseDocument doc = GsfUtilities.getDocument(fo, true);
		Source source = Source.create(doc);
		Snapshot snap = source.createSnapshot();
		return snap;
	}
}
