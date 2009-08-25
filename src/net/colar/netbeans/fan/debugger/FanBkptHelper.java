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
public class FanBkptHelper
{

	public static LineBreakpoint createFanBp(String url, int lineNb)
	{
		//TODO: finish this, all harcoded
		LineBreakpoint bp = LineBreakpoint.create(url, lineNb);
		bp.setStratum("Fan");
		bp.setHidden(false);
		bp.setSourceName(getName(url));
		bp.setPrintText(getName(url));
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
}
