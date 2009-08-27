/*
 * Thibaut Colar Aug 21, 2009
 */
package net.colar.netbeans.fan.project.path;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.spi.java.classpath.ClassPathProvider;
import org.netbeans.spi.java.classpath.support.ClassPathSupport;
import org.openide.filesystems.FileObject;

/**
 * Classpath provider for Fan projects
 * See http://bits.netbeans.org/dev/javadoc/org-netbeans-api-java-classpath/
 * @author thibautc
 */
public class FanClassPathProvider implements ClassPathProvider, PropertyChangeListener
{

	ClassPath sourcePath = null;
	private final FanProject project;

	public FanClassPathProvider(FanProject project)
	{
		this.project = project;
		sourcePath=ClassPathSupport.createClassPath(project.getProjectDirectory());
	}

	public void propertyChange(PropertyChangeEvent arg0)
	{
	}

	public ClassPath[] getProjectClassPaths(String type)
	{
		System.out.println(getClass().getName()+" -> getprojectcps");
		ClassPath[] cps =
		{
			sourcePath
		};
		return cps;
	}

	public ClassPath findClassPath(FileObject file, String type)
	{
		//System.out.println(getClass().getName()+" -> findclasspath "+file);
		ClassPath result=null;
		result=getSourcepath(file);
		//System.out.println(getClass().getName()+" -> Result: "+result);
		return result;
	}

	private ClassPath getSourcepath(FileObject file)
	{
		//System.out.println(getClass().getName()+" -> get source path "+file+ ": "+sourcePath);
		return sourcePath;
	}
}
