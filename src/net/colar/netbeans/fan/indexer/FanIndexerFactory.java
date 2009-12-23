/*
 * Thibaut Colar Sep 2, 2009
 */
package net.colar.netbeans.fan.indexer;

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

	static
	{
		System.err.println("Fantom - Init indexer Factory");
	}
	public static final String NAME = "FanIndexer";
	public static final int VERSION = 1;

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
		FanIndexer indexer = (FanIndexer) createIndexer();
		indexer.index(itrbl, cntxt);
	}

}


