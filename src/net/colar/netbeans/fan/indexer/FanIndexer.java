/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import java.io.IOException;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.structure.FanStructureAnalyzer;
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
	public static final String INDEX_CLASS = "INDEX_CLASS";
	public static final String INDEX_MIXIN = "INDEX_MIXIN";
	public static final String INDEX_ENUM = "INDEX_ENUM";
	public static final String INDEX_FUNCTION = "INDEX_FUNCTION";
	public static final String INDEX_FIELD = "INDEX_FIELD";

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
			IndexDocument doc = support.createDocument(indexable);

			FanParserResult fanResult = (FanParserResult) parserResult;
			CommonTree ast = fanResult.getTree();
			parseTree(doc, indexable, ast);

			support.addDocument(doc);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private IndexDocument parseTree(IndexDocument doc, Indexable indexable, CommonTree node)
	{
		if (node != null)
		{
			switch (node.getType())
			{
				case FanParser.AST_CLASS:
					addType(INDEX_CLASS, doc, node);
					break;
				case FanParser.AST_MIXIN:
					addType(INDEX_MIXIN, doc, node);
					break;
				case FanParser.AST_ENUM:
					addType(INDEX_ENUM, doc, node);
					break;
				case FanParser.AST_FIELD:
					addField(INDEX_FIELD, doc, node);
					break;
			}
			//doc.addPair(INDEX_POD, pod, true, true);

			for (int i = 0; i < node.getChildCount(); i++)
			{
				CommonTree subNode = (CommonTree) node.getChild(i);
				if (subNode != null && !subNode.isNil())
				{
					parseTree(doc, indexable, subNode);
				}
			}
		}
		return doc;
	}

	/**
	 * Add a type (mixin, class, enum)
	 * @param type
	 * @param doc
	 * @param node
	 */
	private void addType(String type, IndexDocument doc, CommonTree node)
	{
		FanIndexItem item = new FanIndexItem();
		String id = FanStructureAnalyzer.getSubChildTextByType(node, FanParser.AST_ID, -1);
		String modifs = FanStructureAnalyzer.getSubChildTextByType(node, FanParser.AST_MODIFIER, -1);
		String inheritance = FanStructureAnalyzer.getSubChildTextByType(node, FanParser.AST_INHERITANCE, -1);
		item.addItem(FanIndexItem.TYPE.ID, id);
		item.addItem(FanIndexItem.TYPE.MODIFIERS, modifs);
		item.addItem(FanIndexItem.TYPE.INHERITANCE, inheritance);
		StringBuilder infos = new StringBuilder(item.toString(FanIndexItem.TYPE.ID));
		infos = infos.append(";").append(item.toString(FanIndexItem.TYPE.MODIFIERS));
		infos = infos.append(";").append(item.toString(FanIndexItem.TYPE.INHERITANCE));
		System.out.println("Indexing "+type+" : "+infos.toString());
		doc.addPair(type, infos.toString(), true, true);
	}

	private void addField(String type, IndexDocument doc, CommonTree node)
	{
		FanIndexItem item = new FanIndexItem();
		String id = FanStructureAnalyzer.getSubChildTextByType(node, FanParser.AST_ID, -1);
		String modifs = FanStructureAnalyzer.getSubChildTextByType(node, FanParser.AST_MODIFIER, -1);
		String fieldType = FanStructureAnalyzer.getSubChildTextByType(node, FanParser.AST_TYPE, -1);
		item.addItem(FanIndexItem.TYPE.ID, id);
		item.addItem(FanIndexItem.TYPE.TYPE, fieldType);
		item.addItem(FanIndexItem.TYPE.MODIFIERS, modifs);
		StringBuilder infos = new StringBuilder(item.toString(FanIndexItem.TYPE.ID));
		infos = infos.append(";").append(item.toString(FanIndexItem.TYPE.TYPE));
		infos = infos.append(";").append(item.toString(FanIndexItem.TYPE.MODIFIERS));
		System.out.println("Indexing "+type+" : "+infos.toString());
		doc.addPair(type, infos.toString(), true, true);
	}
}
