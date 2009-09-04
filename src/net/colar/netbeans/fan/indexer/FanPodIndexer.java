/*
 * Thibaut Colar Sep 4, 2009
 */
package net.colar.netbeans.fan.indexer;

import fan.sys.Repo;
import fan.sys.Sys;
import fanx.fcode.FPod;
import java.io.FileInputStream;
import java.util.HashMap;
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
		if(platform == null)
			return;

		FileUtil.addFileChangeListener(this, Sys.PodsDir);

		allPods = new TreeMap<String, FPod>();
		HashMap<String, java.io.File> pods = Repo.findAllPods();
		for(String key : pods.keySet())
		{
			indexPod(pods.get(key));
		}
		/*{
			HashMap map = Repo.findAllPods();
			//List pods = new List(Sys.PodType, map.size());
			Iterator it = map.keySet().iterator();
			while (it.hasNext())
			{
				String name = (String) it.next();
				try
				{
					allPodsList.add(doFind(name, true, null, null));
				} catch (Throwable e)
				{
					System.out.println("ERROR: Invalid pod file: " + name);
					e.printStackTrace();
				}
			}
		}*/
	}

	private void indexPod(java.io.File pod)
	{
		FPod fpod = new FPod(null, null, null);
		try
		{
			FileInputStream fos=new FileInputStream(pod);
			fpod.readFully(new ZipInputStream(fos));
			// close -> move to finaly
			fos.close();
			System.out.println("### Adding pod: "+pod.getPath()+" "+fpod.podName);
			allPods.put(fpod.podName, fpod);
		}
		catch(Exception e)
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

}
