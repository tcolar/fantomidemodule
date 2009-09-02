/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.indexer;

import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.indexing.Context;
import org.netbeans.modules.parsing.spi.indexing.EmbeddingIndexer;
import org.netbeans.modules.parsing.spi.indexing.Indexable;

/**
 * Index parsed files (used later for completion etc...)
 * @author tcolar
 */
public class FanIndexer extends EmbeddingIndexer
{

	public FanIndexer()
	{
		super();
	}

	@Override
	protected void index(Indexable indexable, Result parserResult, Context context)
	{
		System.err.println("Indexing requested for: "+indexable.getRelativePath());
	}

}
