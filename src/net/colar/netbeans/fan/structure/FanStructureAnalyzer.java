/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.ast.FanLexAstUtils;
import net.colar.netbeans.fan.antlr.FanParser;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.StructureItem;
import org.netbeans.modules.csl.api.StructureScanner;
import org.netbeans.modules.csl.spi.ParserResult;

/**
 * StructureScanner impl.
 * Generates a structure tree from the source (~AST), used for Navigator window (class,enum,mixin,field...)
 * Also provides code folding support.
 * 
 * See: http://hg.netbeans.org/main/file/24d72d2643e1/csl.api/src/org/netbeans/modules/csl/editor/fold/GsfFoldManager.java
 * @author thibautc
 */
public class FanStructureAnalyzer implements StructureScanner
{
	// TODO: Rewrite using the AstParser / scopes


	public static final String CODE_FOLDS = "codeblocks";
	public static final String DOC_FOLDS = "comments";
	public static final String COMMENT_FOLDS = "comments";
	public static final String IMPORT_FOLDS = "imports";

	@Override
	public List<StructureItem> scan(ParserResult result)
	{
		List<StructureItem> list = new ArrayList<StructureItem>();
		try
		{
			FanParserResult fanResult = (FanParserResult) result;
			CommonTree ast = fanResult.getTree();

			String trace = "";
			scanTree(list, ast, fanResult, trace);
		}
		catch (Exception e)
		{
			// if there is an error here, we don't want to propagate to the user, should log though
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Map<String, List<OffsetRange>> folds(ParserResult result)
	{
		CommonTokenStream tokenStream = ((FanParserResult) result).getTokenStream();

		FanParserResult fanResult = (FanParserResult) result;
		Map<String, List<OffsetRange>> folds = new HashMap<String, List<OffsetRange>>();
		CommonTree ast = fanResult.getTree();
		addFolds(tokenStream, folds, ast);
		return folds;
	}

	/**
	 * Scan down the tree for structure items, and add them to the tree if necesary
	 * TODO: make use of the ASTParser instead ??
	 * Recursive.
	 * @param list
	 * @param node
	 */
	public void scanTree(List<StructureItem> list, CommonTree node, FanParserResult result, String trace)
	{
		if (node != null && result != null)
		{
			FanStructureItem item = null;
			trace += "->" + node.getText();
			switch (node.getType())
			{
				case FanParser.AST_FIELD:
					item = new FanStructureItem(node, ElementKind.FIELD, result);
					String name = FanLexAstUtils.getSubChildTextByType(result, node, FanParser.AST_ID);
					String modif = FanLexAstUtils.getSubChildTextByType(result, node, FanParser.AST_MODIFIER);
					String type = FanLexAstUtils.getSubChildTextByType(result, node, FanParser.AST_TYPE);
					handleModifiers(item, modif);
					item.setName(name);
					String html = name;
					if (type.length() > 0)
					{
						html += " : <font color='#aaaaaa'>" + type + "</font>";
					}
					item.setHtml(html);
					break;

				case FanParser.AST_CLASS:
				case FanParser.AST_MIXIN:
				case FanParser.AST_ENUM:
					item = new FanStructureItem(node, ElementKind.CLASS, result);
					name = FanLexAstUtils.getSubChildTextByType(result, node, FanParser.AST_ID);
					String inheritance = FanLexAstUtils.getSubChildTextByType(result, node, FanParser.AST_INHERITANCE);
					item.setName(name);
					html = name;
					if (inheritance.length() > 0)
					{
						html += "<font color='#aaaaaa'>" + inheritance + "</font>";
					}
					item.setHtml(html);
					break;

				case FanParser.AST_METHOD:
				case FanParser.AST_CONSTRUCTOR:
					ElementKind kind = node.getType() == FanParser.AST_METHOD ? ElementKind.METHOD : ElementKind.CONSTRUCTOR;

					item = new FanStructureItem(node, kind, result);
					String returnType = FanLexAstUtils.getSubChildTextByType(result, node, FanParser.AST_TYPE);
					if (returnType.equalsIgnoreCase("void"))
					{
						returnType = "";
					}
					String constChain = FanLexAstUtils.getSubChildTextByType(result, node, FanParser.AST_CONSTRUCTOR_CHAIN);
					name = FanLexAstUtils.getSubChildTextByType(result, node, FanParser.AST_ID);
					List<CommonTree> paramNodes=FanLexAstUtils.getAllChildrenWithType(node, FanParser.AST_PARAM);
					String params="";
					for(CommonTree paramNode : paramNodes)
					{
						if(params.length()>0)
							params+=", ";
						params += FanLexAstUtils.getNodeContent(result, paramNode);
					}
					modif = FanLexAstUtils.getSubChildTextByType(result, node, FanParser.AST_MODIFIER);
					handleModifiers(item, modif);
					item.setName(name);
					html = name + "(<font color='#aaaaaa'>" + params + "</font>)";
					if (returnType.length() > 0)
					{
						html += " : <font color='#aaaaaa'>" + returnType + "</font>";
					} else if (constChain.length() > 0)
					{
						html += " : <font color='#aaaaaa'>" + returnType + "</font>";
					}
					item.setHtml(html);
					break;
			}
			for (int i = 0; i < node.getChildCount(); i++)
			{
				CommonTree subNode = (CommonTree) node.getChild(i);
				// For the ROOT node, we had directly to list, not sublist
				if (node.isNil() || item == null)
				{
					//recurse into children
					scanTree(list, subNode, result, trace);
				} else
				{
					List<StructureItem> subList = new ArrayList<StructureItem>();
					scanTree(subList, subNode, result, trace);
					if (item != null && !subList.isEmpty())
					{
						item.setNestedItems(subList);
					}
				}
			}

			if (item != null)
			{
				//System.err.println("Adding to item list " + item.getName() + " " + trace);
				list.add(item);
			}
		}
	}

	public Configuration getConfiguration()
	{
		return null;
	}


	// TODO: use FanAstVar.modifiers instead of hardcoded
	private void handleModifiers(FanStructureItem item, String modif)
	{
		if (modif.indexOf("private") != -1)
		{
			item.addModifier(Modifier.PRIVATE);
		} else if (modif.indexOf("protected") != -1)
		{
			item.addModifier(Modifier.PROTECTED);
		} else if (modif.indexOf("public") != -1)
		{
			item.addModifier(Modifier.PUBLIC);
		}
		if (modif.indexOf("static") != -1)
		{
			item.addModifier(Modifier.STATIC);
		}
	}

	private void addFolds(CommonTokenStream tokenStream, Map<String, List<OffsetRange>> folds, CommonTree node)
	{
		if (node != null)
		{
			boolean foldable = false;
			String type = CODE_FOLDS;
			//System.err.println("** " + node.getText());
			switch (node.getType())
			{
				case FanParser.AST_CODE_BLOCK:
					type = CODE_FOLDS;
					foldable = true;
					break;
				case FanParser.AST_DOCS:
					//TODO: comments folding (in hidden channel)
					//TODO: also imports folding (using)
					//case FanParser.MULTI_COMMENT:
					type = DOC_FOLDS;
					foldable = true;
					break;
			}

			if (foldable && node.getTokenStartIndex() != -1 && node.getTokenStopIndex() != -1)
			{
				CommonToken startToken = (CommonToken) tokenStream.get(node.getTokenStartIndex());
				CommonToken endToken = (CommonToken) tokenStream.get(node.getTokenStopIndex());
				int start = startToken.getStartIndex();
				int end = endToken.getStopIndex() + 1;
				// don't add unless at least 1 long (ex: class with def alone)
				if (start >= 0 && end >= 0 && end > start)
				{
					OffsetRange range = new OffsetRange(start, end);
					List<OffsetRange> fold = folds.get(type);
					if (fold == null)
					{
						fold = new ArrayList<OffsetRange>();
						folds.put(type, fold);
					}
					fold.add(range);
				}
			}
			// recurse into children
			for (int i = 0; i < node.getChildCount(); i++)
			{
				CommonTree subNode = (CommonTree) node.getChild(i);
				addFolds(tokenStream, folds, subNode);
			}

		}
	}
	
}
