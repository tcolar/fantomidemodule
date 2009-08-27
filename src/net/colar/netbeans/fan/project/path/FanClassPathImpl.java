/*
 * Thibaut Colar Aug 21, 2009
 */

package net.colar.netbeans.fan.project.path;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.netbeans.spi.java.classpath.ClassPathImplementation;
import org.netbeans.spi.java.classpath.PathResourceImplementation;
import org.openide.filesystems.FileObject;

/**
 *
 * @author thibautc
 */
public class FanClassPathImpl implements ClassPathImplementation
{
	private static List<PathResourceImplementation> resources = new ArrayList();

	public FanClassPathImpl(FileObject fo)
	{
		add(fo);
	}

	public void add(FileObject fo)
	{
		/*if(fo.isFolder())
		{
			FileObject[] children = fo.getChildren();
			for(FileObject child : children)
				add(child);
		}
		else*/
		{
			FanPathResourceImpl impl=new FanPathResourceImpl(fo);
			//ClassPathSupport.createClassPath(fo);
			resources.add(impl);
			System.out.println(getClass().getName()+ " -> "+fo.getPath());
		}
	}

	public List<? extends PathResourceImplementation> getResources()
	{
		System.out.println(getClass().getName()+" -> getresources");
		return Collections.unmodifiableList(resources);
	}

	public void addPropertyChangeListener(PropertyChangeListener arg0)
	{
	}

	public void removePropertyChangeListener(PropertyChangeListener arg0)
	{
	}

}
