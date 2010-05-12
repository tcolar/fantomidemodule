/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.jot.logger.JOTLoggerLocation;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;

/**
 * Generic utilities
 * @author thibautc
 */
public class FanUtilities
{

	public static final JOTLoggerLocation GENERIC_LOGGER = new JOTLoggerLocation("Generic (FanUtilities)");
	public final static Pattern POD_NAME_PATTERN = Pattern.compile("podName\\s*=\\s*\"(\\S+)\"");

	/**
	 * Opens the given file in the editor.
	 * @param newFile
	 * @throws DataObjectNotFoundException
	 */
	public static void openFileInEditor(File newFile) throws DataObjectNotFoundException
	{
		FileObject fob = FileUtil.toFileObject(FileUtil.normalizeFile(newFile));
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

	/**
	 * Find a file object relative to a current fileobject.
	 * @param fo
	 * @param path
	 * @return
	 */
	public static FileObject getRelativeFileObject(final FileObject fo, String relativePath)
	{
		StringTokenizer st = new StringTokenizer(relativePath.replaceAll("\\\\", "/"), "/");
		// If fo is a  file, we start from the parent folder
		FileObject curFile = fo.isFolder() ? fo : fo.getParent();
		// folow the relative path to try and find the requested file
		while ((curFile != null) && st.hasMoreTokens())
		{
			String nameExt = st.nextToken();
			// if "." do nothing.
			if (!nameExt.equals("."))
			{
				if (nameExt.equals(".."))
				{
					curFile = curFile.getParent();

				} else
				{
					curFile = curFile.getFileObject(nameExt);

				}
			}
		}
		return curFile;
	}

	/**
	 * Debug fileObject
	 * @param fo
	 */
	public static void dumpFileObject(FileObject fo)
	{
		FanUtilities.GENERIC_LOGGER.debug("---- FileObject DUMP -----");
		try
		{
			dumpFileObject(fo, "");
			FanUtilities.GENERIC_LOGGER.debug("**---- FileObject root dump -----");
			//dumpFileObject(fo.getFileSystem().getRoot(),"**");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void dumpFileObject(FileObject fo, String indent) throws Exception
	{
		FanUtilities.GENERIC_LOGGER.debug(indent + "toStr: " + fo.toString());
		FanUtilities.GENERIC_LOGGER.debug(indent + "Name: " + fo.getNameExt());
		FanUtilities.GENERIC_LOGGER.debug(indent + "Path: " + fo.getPath());
		FanUtilities.GENERIC_LOGGER.debug(indent + "URL: " + fo.getURL());
		FileObject[] children = fo.getChildren();
		//indent+="  ";
		//for(int i=0;i!=children.length;i++)
		//    dumpFileObject(children[i],indent);
	}

	public static File getFanUserHome()
	{
		// netbeans.user: ex ~/.netbeans/fantom/
		String nbHome = System.getProperty("netbeans.user");
		String fantomHome = nbHome + File.separator + "fantom" + File.separator;
		File f = new File(fantomHome);
		f.mkdirs();
		return f;
	}

	/**
	 * Try to resolve the pod name given a source path
	 *
	 * Changed from using fantom script parser, because it always fails on partial files.
	 * It is very possible for the file to be unparseable (incompete)
	 *
	 * @param path
	 * @return
	 */
	public static String getPodForPath(String path)
	{
		File folder = new File(path).getParentFile();
		File scriptFolder = folder;
		String pod = null;
		while (folder != null)
		{
			if (new File(folder, "build.fan").exists())
			{
				try
				{
					File buildFan = new File(folder, "build.fan");
					String buildText = FileUtil.toFileObject(FileUtil.normalizeFile(buildFan)).asText();
					Matcher m = POD_NAME_PATTERN.matcher(buildText);
					if(m.find())
					{
						pod = m.group(1);
						// found it, break out of loop
						break;
					}
				} catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			folder = folder.getParentFile();
		}
		if (pod == null)
		{
			GENERIC_LOGGER.error("Could not find pod for: " + path);
			// Must be a script, make-up a "pod" from folder name .. should probably normalize it
			return "_SCRIPT_" + scriptFolder.getName();
		}
		return pod;
	}

	public static File getPodFolderForPath(String path)
	{
		File folder = new File(path);
		if (folder.isFile())
		{
			folder = folder.getParentFile();
		}
		while (folder != null)
		{
			File f = new File(folder, "build.fan");
			if (f.exists())
			{
				return FileUtil.normalizeFile(folder);
			}
			folder = folder.getParentFile();
		}
		return null;
	}
}
