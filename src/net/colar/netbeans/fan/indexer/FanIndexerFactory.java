/*
 * Thibaut Colar Sep 2, 2009
 */
package net.colar.netbeans.fan.indexer;

import java.util.Date;
import java.util.Hashtable;
import org.netbeans.modules.parsing.spi.indexing.Context;
import org.netbeans.modules.parsing.spi.indexing.CustomIndexer;
import org.netbeans.modules.parsing.spi.indexing.CustomIndexerFactory;
import org.netbeans.modules.parsing.spi.indexing.Indexable;

/**
 * Indexer Factory impl.
 * @author thibautc
 */

// Registered through layer.xml
public class FanIndexerFactory extends CustomIndexerFactory
{
	public static final String NAME = "FanIndexer";
	public static final int VERSION = 1;
	Hashtable<String, Long> toBeIndexed = new Hashtable<String, Long>();
	private final FanIndexerThread indexerThread;
	public static volatile boolean shutdown = false;

	public FanIndexerFactory()
	{
		System.err.println("Fantom - Init indexer Factory");
		indexerThread = new FanIndexerThread();
		indexerThread.start();
	}

	public static void shutdown()
	{
		shutdown = true;
	}

	@Override
	public CustomIndexer createIndexer()
	{
		return new FanIndexer();
	}

	@Override
	public boolean supportsEmbeddedIndexers()
	{
		// TODO: ??
		return false;
	}


	@Override
	public String getIndexerName()
	{
		return NAME;
	}

	@Override
	public int getIndexVersion()
	{
		return VERSION;
	}

	@Override
	public void filesDeleted(Iterable<? extends Indexable> itrbl, Context cntxt)
	{
		//TODO
	}

	@Override
	public void filesDirty(Iterable<? extends Indexable> itrbl, Context cntxt)
	{
		//TODO: maybe use a queue or a thread or something and not reindex at very single chnage
		// of tghe source file
		// ie: if changed but not in last 1500ms
		for(Indexable indexable : itrbl)
		{
			String doc = indexable.getURL().getPath();
			toBeIndexed.put(doc, new Date().getTime());
		}
	}

	@Override
	public void scanFinished(Context cntxt)
	{
		// TODO: csna the db to highlight unreolved items / errors ?
		super.scanFinished(cntxt);
	}

	class FanIndexerThread extends Thread implements Runnable
	{
		@Override
		public void run()
		{
			while(!shutdown)
			{
				try{sleep(1000);}catch(Exception e){};
				long now = new Date().getTime();
				for(String path : toBeIndexed.keySet())
				{
					Long  l = toBeIndexed.get(path);
					// Hasn't changed in acouple seconds
					if(l.longValue() < now - 2000)
					{
						toBeIndexed.remove(path);
						FanIndexer indexer = (FanIndexer)createIndexer();
						indexer.index(path);
					}
				}
			}
		}

	}
}


