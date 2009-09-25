/*
 * Thibaut Colar Sep 4, 2009
 */
package net.colar.netbeans.fan.indexer;

import fan.sys.FanObj;
import fan.sys.List;
import fan.sys.Pod;
import fan.sys.Repo;
import fan.sys.Sys;
import fan.sys.Type;
import fanx.fcode.FPod;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
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

	public Set<String> getImportTypes(String podName)
	{
		Set<String> result = new HashSet();
		if (allPods.containsKey(podName))
		{
			List types = Pod.find(podName).types();
			for (int i = 0; i != types.size(); i++)
			{
				Type type = (Type) types.get(i);
				result.add(type.name());
			}
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
		if(platform==null)
			return fandoc;
		String html = fandoc;
		try
		{
			FanObj parser = (FanObj) Type.find("fandoc::FandocParser").make();
			FanObj doc = (FanObj) parser.type().method("parseStr").call(parser, fandoc);
			html = (String) doc.type().method("write").call(doc, Type.find("fandoc::HtmlDocWriter").make());
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Html doc: "+html);
		return html;
	}
}
