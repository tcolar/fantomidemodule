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
 * Helper utilities
 * Fan breapoint creator.
 * @author thibautc
 */
public class FanDebugHelper
{
	// this is very lame ... use user defined project src folders instead

	public static final String HARD_CODED_FAN_SRC_DIR = "fan";

	/**
	 * Create a fan Breakpoint
	 * Fan directory structure does not matches the java packages created by Fan
	 * So I had to be a little creative with pathing.
	 * @param url
	 * @param lineNb
	 * @return
	 */
	public static LineBreakpoint createFanBp(String url, int lineNb)
	{
		LineBreakpoint bp = LineBreakpoint.create(url, lineNb);
		String name = getName(url);
		String path = getPath(url);
		String pod = getPod(url);
		String filter = getClassFilter(pod, path);

		bp.setStratum("Fan");
		bp.setHidden(false);
		bp.setSourceName(name);
		bp.setPrintText("[" + pod + "] " + HARD_CODED_FAN_SRC_DIR + "/" + path);
		/*
		 * SourcePath is required to match path in jar (LineBreakPointImpl check this)
		 * so we have no choice but to give that path rather than the 'real' path
		 * Our custom FanSourcePathProvider takes care of finding the right source file
		 * given this 'jar' path.
		 */
		bp.setSourcePath(HARD_CODED_FAN_SRC_DIR + "/" + pod + "/" + path);
		bp.setPreferredClassName(filter);
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

	/**
	 * The file name alone: example: Main.fan
	 * @param url
	 * @return
	 */
	private static String getName(String url)
	{
		FileObject fo = getUrlFo(url);
		if (fo != null)
		{
			return fo.getNameExt();
		}
		return (url == null) ? null : url.toString();
	}

	/**
	 * The path without the 'fan' folder
	 * ex: Main.fan  or mydir/Main.fan
	 * @param url
	 * @return
	 */
	private static String getPath(String url)
	{
		FileObject fo = getUrlFo(url);
		String relativePath = url;
		if (fo != null)
		{
			FileObject root = ClassPath.getClassPath(fo, ClassPath.SOURCE).findOwnerRoot(fo);
			FileObject srcFolder = root.getFileObject(HARD_CODED_FAN_SRC_DIR);
			if (srcFolder != null)
			{
				root = srcFolder;
			}
			relativePath = FileUtil.getRelativePath(root, fo);
		}
		return relativePath;
	}

	/**
	 * The pod name for the url.
	 * @param url
	 * @return
	 */
	private static String getPod(String url)
	{
		FileObject fo = getUrlFo(url);
		String pod = "";
		if (fo != null)
		{
			FileObject root = ClassPath.getClassPath(fo, ClassPath.SOURCE).findOwnerRoot(fo);
			pod = root.getName();
			System.err.println("~~~ Pod: " + root.getName());
		}
		return pod;
	}

	/**
	 * Breakpoint class filter
	 * ex: fan.Debug.Main*
	 * @param pod
	 * @param path
	 * @return
	 */
	private static String getClassFilter(String pod, String path)
	{
		if (path.endsWith(".fan") || path.endsWith(".fwt"))
		{
			path = path.substring(0, path.lastIndexOf("."));
		}
		path = path.replace('/', '.');
		return HARD_CODED_FAN_SRC_DIR + "." + pod + "." + path + "*";
	}

	private static FileObject getUrlFo(String url)
	{
		FileObject fo = null;
		try
		{
			fo = URLMapper.findFileObject(new URL(url));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return fo;
	}
}
