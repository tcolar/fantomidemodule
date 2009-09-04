/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import net.colar.netbeans.fan.FanParserResult;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.indexing.Context;
import org.netbeans.modules.parsing.spi.indexing.EmbeddingIndexer;
import org.netbeans.modules.parsing.spi.indexing.Indexable;
import org.netbeans.modules.parsing.spi.indexing.support.IndexDocument;
import org.netbeans.modules.parsing.spi.indexing.support.IndexingSupport;
/**
 * Index parsed files (used later for completion etc...)
 * @author tcolar
 */
public class FanIndexer extends EmbeddingIndexer
{

	public static final String INDEX_POD = "INDEX_POD";

	public FanIndexer()
	{
		super();
	}

	@Override
	protected void index(Indexable indexable, Result parserResult, Context context)
	{
		System.err.println("Indexing requested for: " + indexable.getURL());
		try
		{
			IndexingSupport support = IndexingSupport.getInstance(context);

			FanParserResult fanResult = (FanParserResult) parserResult;
			CommonTree ast = fanResult.getTree();
			Set<IndexDocument> docs = parseTree(support, indexable, ast);

			for (IndexDocument doc : docs)
			{
				support.addDocument(doc);
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private Set<IndexDocument> parseTree(IndexingSupport support, Indexable indexable, CommonTree node)
	{
		Set<IndexDocument> docs = new HashSet();
		if (node != null && !node.isNil())
		{
			switch (node.getType())
			{
				/*case FanParser.AST_CLASS:
				case FanParser.AST_MIXIN:
				case FanParser.AST_ENUM:
				*/
			}
			IndexDocument doc = support.createDocument(indexable);
			//doc.addPair(INDEX_POD, pod, true, true);
			support.addDocument(doc);

			for (int i = 0; i < node.getChildCount(); i++)
			{
				CommonTree subNode = (CommonTree) node.getChild(i);
				if (subNode != null && !subNode.isNil())
				{
					docs.addAll(parseTree(support, indexable, node));
				}
			}
		}
		return docs;
	}
}
