/*
 * Thibaut Colar Sep 4, 2009
 */
package net.colar.netbeans.fan.indexer;

import fan.sys.Buf;
import fan.sys.FanObj;
import fan.sys.List;
import fan.sys.Pod;
import fan.sys.Repo;
import fan.sys.Slot;
import fan.sys.Sys;
import fan.sys.Type;
import fanx.fcode.FPod;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import net.colar.netbeans.fan.platform.FanPlatform;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileRenameEvent;
import org.openide.filesystems.FileUtil;

/**
 * Index (and watch for changes) Fan pods.
 * @author thibautc
 */
public class FanPodIndexer implements FileChangeListener
{
	// closures are compiled into classes with names ending by $ and a number
	private final static Pattern CLOSURECLASS = Pattern.compile(".*?\\$\\d+\\z");


	private static final FanPodIndexer instance = new FanPodIndexer();
	// treemap is sorted
	TreeMap<String, FPod> allPods = new TreeMap<String, FPod>();

	public static FanPodIndexer getInstance()
	{
		return instance;
	}

	private FanPodIndexer()
	{
		initializeIndex();
	}

	public void initializeIndex()
	{
		// If fan.home not set yet (no fan platform yet), skip
		FanPlatform platform = FanPlatform.getInstance(false);
		if (platform == null)
		{
			return;
		}

		FileUtil.addFileChangeListener(this, Sys.PodsDir);

		allPods = new TreeMap<String, FPod>();
		HashMap<String, java.io.File> pods = Repo.findAllPods();
		for (String key : pods.keySet())
		{
			indexPod(pods.get(key));
		}
	}

	private void indexPod(java.io.File pod)
	{
		FPod fpod = new FPod(null, null, null);
		try
		{
			FileInputStream fos = new FileInputStream(pod);
			fpod.readFully(new ZipInputStream(fos));
			// close -> move to finaly
			fos.close();
			System.out.println("### Adding pod: " + pod.getPath() + " " + fpod.podName);
			allPods.put(fpod.podName, fpod);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void fileDataCreated(FileEvent arg0)
	{
		java.io.File pod = FileUtil.toFile(arg0.getFile());
		indexPod(pod);
	}

	public void fileChanged(FileEvent arg0)
	{
		java.io.File pod = FileUtil.toFile(arg0.getFile());
		indexPod(pod);
	}

	public void fileAttributeChanged(FileAttributeEvent arg0)
	{
	}

	public void fileDeleted(FileEvent arg0)
	{
	}

	public void fileRenamed(FileRenameEvent arg0)
	{
	}

	public void fileFolderCreated(FileEvent arg0)
	{
	}

	public Set<String> getAllPodNames()
	{
		return allPods.keySet();
	}

	public String getPodDoc(String podName)
	{
		if (allPods.containsKey(podName))
		{
			return fanDocToHtml(Pod.find(podName).doc());
		}
		return null;
	}

	/**
	 *
	 * @param podName null = all pods
	 * @return
	 */
	public Set<Type> getImportTypes(String podName)
	{
		Set<Type> result = new HashSet();
		if (allPods.containsKey(podName))
		{
			List types = Pod.find(podName).types();
			for (int i = 0; i != types.size(); i++)
			{
				Type type = (Type) types.get(i);
				String name = type.name();
				if(!CLOSURECLASS.matcher(name).matches())
					result.add(type);
			}
		}
		return result;
	}

	public Set<Type> getAllTypes()
	{
		Set<Type> result = new HashSet();
		for (String podName : allPods.keySet())
		{
			result.addAll(getImportTypes(podName));
		}
		return result;
	}

	public String getPodTypeDoc(String podName, String typeName)
	{
		if (allPods.containsKey(podName))
		{
			Pod pod = Pod.find(podName);
			Type t = pod.findType(typeName);
			if (t != null)
			{
				return fanDocToHtml(t.doc());
			}
		}
		return null;
	}

	/**
	 * Parse Fandoc text into HTML using fan's builtin parser.
	 * @param fandoc
	 * @return
	 */
	public static String fanDocToHtml(String fandoc)
	{
		FanPlatform platform = FanPlatform.getInstance(false);
		if (platform == null)
		{
			return fandoc;
		}
		String html = fandoc;
		try
		{
			FanObj parser = (FanObj) Type.find("fandoc::FandocParser").make();
			FanObj doc = (FanObj) parser.type().method("parseStr").call(parser, fandoc);
			Buf buf = Buf.make();
			FanObj writer = (FanObj) Type.find("fandoc::HtmlDocWriter").method("make").call(buf.out());
			doc.type().method("write").call(doc, writer);
			html = buf.flip().readAllStr();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		//System.out.println("Html doc: "+html);
		return html;
	}

	public Set<Slot> getSlots(String pod, String t)
	{
		Set<Slot> result = new HashSet();
		if (allPods.containsKey(pod))
		{
			Type type = Pod.find(pod).findType(t);
			if (type != null)
			{
				List slots = type.slots();
				for (int i=0; i!=slots.size(); i++)
				{
					Slot slot = (Slot)slots.get(i);
					result.add(slot);
				}
			}
		}
		return result;
	}
}
