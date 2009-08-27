/*
 * Thibaut Colar Aug 24, 2009
 */
package net.colar.netbeans.fan.debugger;

import java.net.URL;
import org.netbeans.api.debugger.jpda.LineBreakpoint;
import org.netbeans.api.java.classpath.ClassPath;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.filesystems.URLMapper;

/**
 *
 * @author thibautc
 */
public class FanDebugHelper
{

	public static LineBreakpoint createFanBp(String url, int lineNb)
	{
		//TODO: finish this, all harcoded
		//TODO: fan.podname.classname
		//TODO: main method code -> fan.podname.Classname$main$0.class?
		LineBreakpoint bp = LineBreakpoint.create(url, lineNb);
		bp.setStratum("Fan");
		bp.setHidden(false);
		bp.setSourceName("Main.fan");
		bp.setPrintText("Main.fan");
		/*
		 * SourcePath is required to match path in jar (LineBreakPointImpl check this)
		 * so we have no choice but to give that path rather than the 'real' path
		 * Our custom FanSourcePathProvider takes care of finding the right source file
		 * given this 'jar' path.
		 */
		bp.setSourcePath("fan/Debug/Main.fan"/*getPath(url)*/);
		bp.setPreferredClassName("fan.Debug.Main*"/*getClassFilter(url)*/);
		//bp.setPreferredClassName(url);
		bp.setSuspend(LineBreakpoint.SUSPEND_ALL);
		System.out.println("bp class:" + bp.getPreferredClassName());
		System.out.println("bp sourceName:" + bp.getSourceName());
		System.out.println("bp lineNb:" + bp.getLineNumber());
		System.out.println("bp cond:" + bp.getCondition());
		System.out.println("bp printText:" + bp.getPrintText());
		System.out.println("bp groupName:" + bp.getGroupName());
		System.out.println("bp vMessage:" + bp.getValidityMessage());
		System.out.println("bp sourcePath:" + bp.getSourcePath());
		System.out.println("bp url:" + bp.getURL());
		return bp;
	}

	private static String getName(String url)
	{
		FileObject fo = null;
		try
		{
			fo = URLMapper.findFileObject(new URL(url));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		if (fo != null)
		{
			System.err.println("Name: " + fo.getNameExt());
			return fo.getNameExt();
		}
		System.err.println("Name: " + url);
		return (url == null) ? null : url.toString();
	}

	private static String getPath(String url)
	{
		FileObject fo = null;
		try
		{
			fo = URLMapper.findFileObject(new URL(url));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		String relativePath = url;
		if (fo != null)
		{
			FileObject root = ClassPath.getClassPath(fo, ClassPath.SOURCE).findOwnerRoot(fo);
			relativePath = FileUtil.getRelativePath(root, fo);
		}
		System.err.println("sourcePath: " + relativePath);
		return relativePath;
	}

	private static String getClassFilter(String url)
	{
		FileObject fo = null;
		try
		{
			fo = URLMapper.findFileObject(new URL(url));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		String relativePath = url;
		if (fo != null)
		{
			ClassPath cp = ClassPath.getClassPath(fo, ClassPath.SOURCE);
			if (cp == null)
			{
				System.err.println("No classpath for " + url);
				return null;
			}
			FileObject root = cp.findOwnerRoot(fo);
			if (root == null)
			{
				return null;
			}
			relativePath = FileUtil.getRelativePath(root, fo);
		}
		if (relativePath.endsWith(".fan") || relativePath.endsWith(".fwt"))
		{ // NOI18N
			relativePath = relativePath.substring(0, relativePath.length() - 4);
		}
		relativePath = relativePath.replace('/', '.') + "*";
		System.err.println("filter: " + relativePath);
		return relativePath;
	}

	/**
	 * Transform a path sent from the debugger such as fan/podname/classname.fan
	 * into a Fan source path (ie: fan/classname.path)
	 * @param relativePath
	 */
	public static String binaryPathToFanSourcePath(String relativePath)
	{
		// TODO: instead of hard-coding fan spurecs to /fan, read from build.fan / pod.fan sources paths
		String result=relativePath;
		if(relativePath!=null)
		{
			// we get something like fan/Debug/Main.fan (Debug isthe pod name)
			// we want to find fan/Main.fan  .... hum that could be in any pod :(
			//remove "fan/"
			result=relativePath.substring(relativePath.indexOf("/")+1);
			// remove "podname/"
			int index=result.indexOf("/")+1;
			result=result.substring(0, index)+"fan/"+result.substring(index);
		}
		return result;
	}

	public static String binaryPathToJavaSourcePath(String relativePath)
	{
		String result=relativePath;
		if(relativePath!=null)
		{
			result=relativePath.substring(relativePath.indexOf("/")+1);
			int index=result.indexOf("/")+1;
			result=result.substring(0, index)+"java/"+result.substring(index);
		}
		return result;
	}
}
