/*
 * Thibaut Colar Nov 24, 2009
 */
package net.colar.netbeans.fan.ast;

import fan.sys.Type;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanLexAstUtils;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.indexer.FanJavaIndexer;
import net.colar.netbeans.fan.indexer.FanPodIndexer;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.api.Hint;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.Severity;
import org.netbeans.modules.csl.spi.DefaultError;

/**
 * RootScope for a Fan file
 * Also holds errors (unresolvable imports, undefined vars and so on)
 * @author thibautc
 */
public class FanRootScope extends FanAstScope
{
	// using statements. type=null means unresolvable

	private Hashtable<String, FanAstResolvedType> using = new Hashtable<String, FanAstResolvedType>();
	// Root node holds errors and hints, to be used by HintsProvider
	// For example unesolvable pods, undefined vars and so on
	List<Error> errors = new ArrayList<Error>();
	List<Hint> hints = new ArrayList<Hint>();
	private final FanParserResult parserResult;

	public FanRootScope(FanParserResult result)
	{
		super(null, result.getTree());
		this.parserResult = result;
		CommonTree ast = parserResult.getTree();
		parse(ast);
	}

	private void addUsing(String name, fan.sys.Type type, CommonTree node)
	{
		FanAstResolvedType resolved = FanAstResolvedType.makeFromFanType(parserResult, type);
		System.out.println("- Using " + resolved.toString());
		if (using.containsKey(name))
		{
			addError("Duplicated using: " + resolved + " / " + using.get(name), node);
		}
		using.put(name, resolved);
	}

	private void addType(FanAstScope type)
	{
		if (type != null)
		{
			addChild(type);
		}
	}

	public Hashtable<String, FanAstResolvedType> getUsing()
	{
		return using;
	}

	@Override
	public void dump()
	{
		System.out.println("---Root Scope---");
		for (String key : using.keySet())
		{
			System.out.println("Using: " + key + " (" + using.get(key) + ")");
		}
		for (FanAstScope node : getChildren())
		{
			node.dump();
		}
	}

	public List<Error> getErrors()
	{
		return errors;
	}

	public List<Hint> getHints()
	{
		return hints;
	}

	public void addError(String info, CommonTree node)
	{
		String key = "FanASTParser";
		OffsetRange range = FanLexAstUtils.getNodeRange(parserResult, node);
		int start = range.getStart();
		int end = range.getEnd();
		//System.out.println("Start: "+start+"End:"+end);
		Error error = DefaultError.createDefaultError(key, info, "Syntax Error", null, start, end, false, Severity.ERROR);
		errors.add(error);
	}

	private void addUsing(CommonTree usingNode)
	{
		//TODO: warn/highlight if duplicated using
		String name = null;
		String type = null;
		switch (usingNode.getChildCount())
		{
			case 1: // using Sys
				type = FanLexAstUtils.getNodeContent(parserResult, usingNode.getChild(0)).trim();
				name = type;
				break;
			case 2: // using Sys::Time
				name = FanLexAstUtils.getNodeContent(parserResult, usingNode.getChild(1)).trim();
				type = FanLexAstUtils.getNodeContent(parserResult, usingNode.getChild(0)).trim() + "::" + name;
				break;
			case 3: // using Sys::Time as Ti  or using [java] Sys::Time as Ti
				type = FanLexAstUtils.getNodeContent(parserResult, usingNode.getChild(0)).trim() + "::" + FanLexAstUtils.getNodeContent(parserResult, usingNode.getChild(1)).trim();
				name = FanLexAstUtils.getNodeContent(parserResult, usingNode.getChild(2)).trim();
				break;
		}
		//System.out.println("name: " + name);
		//System.out.println("type:" + type);
		if (name != null && type != null)
		{
			//TODO: what about other FFI types ?
			if (type.toLowerCase().startsWith("[java]"))
			{
				String qname = type.substring(6).trim().replaceAll("::", "\\.");
				/*   Syntax not possible with Fan grammar
				if (qname.endsWith(".*"))
				{
				//  Whole package
				String pack = qname.substring(0, qname.length() - 2);
				if (!FanJavaIndexer.getInstance().hasPackage(pack))
				{
				addError("Unresolvable Java Package: " + qname, usingNode);
				} else
				{
				List<String> items = FanJavaIndexer.getInstance().listItems(pack, "");
				for (String s : items)
				{
				java.lang.reflect.Type t = FanJavaIndexer.getInstance().resolveType(s);
				addJavaUsing(name, t);
				}
				}
				} else*/
				{
					// Individual Item
					if (!FanJavaIndexer.getInstance().hasItem(qname))
					{
						addError("Unresolvable Java Item: " + qname, usingNode);
					} else
					{
						fan.sys.Type t = FanJavaIndexer.getInstance().resolveType(qname);
						addUsing(name, t, usingNode);
					}
				}
			} else
			{
				// ! FFI type -> Fan Pod
				if (type.indexOf("::") > 0)
				{
					// Adding a specific type
					String[] data = type.split("::");
					if (!FanPodIndexer.getInstance().hasPod(data[0]))
					{
						addError("Unresolvable Pod: " + data[0], usingNode);
					} else if (!FanPodIndexer.getInstance().hasPodType(data[0], data[1]))
					{
						addError("Unresolvable Type: " + data[0] + "::" + data[1], usingNode);
					}

					Type t = FanPodIndexer.getInstance().getPodType(data[0], data[1]);
					addUsing(name, t, usingNode);
				} else
				{
					// Adding all the types of a Pod
					if (!FanPodIndexer.getInstance().hasPod(name))
					{
						addError("Unresolvable Pod: " + name, usingNode);
					} else
					{
						Set<Type> items = FanPodIndexer.getInstance().getPodTypes(name);
						for (Type t : items)
						{
							addUsing(t.name(), t, usingNode);
						}
					}
				}
			}
		}
	}

	private void parse(CommonTree ast)
	{
		List<CommonTree> children = (List<CommonTree>) ast.getChildren();
		if (children != null)
		{
			// check using statement first
			for (CommonTree child : children)
			{
				switch (child.getType())
				{
					case FanParser.AST_INC_USING:
						addError("Incomplete import statement.", child);
						break;

					case FanParser.AST_USING_POD:
						addUsing(child);
						break;

				}
			}
			// Second pass, look for types
			for (CommonTree child : children)
			{
				switch (child.getType())
				{
					case FanParser.AST_CLASS:
					case FanParser.AST_ENUM:
					case FanParser.AST_MIXIN:
						// will parse and add the type
						addType(new FanTypeScope(this, child));
						break;

				}
			}
		}
	}

	public FanParserResult getParserResult()
	{
		return parserResult;
	}

	public FanAstResolvedType lookupUsing(String type)
	{
		if (using.containsKey(type))
		{
			return using.get(type);
		}
		// Try Fan standrad API's
		if (FanPodIndexer.getInstance().hasPodType("sys", type))
		{
			Type t = FanPodIndexer.getInstance().getPodType("sys", type);
			return FanAstResolvedType.makeFromFanType(parserResult, t);
		}
		// Try Java standrad API's -> No: not avail by defalt in Fan
		// Unresolvable
		return FanAstResolvedType.makeUnresolved();
	}

	/**
	 * Find the smallest enclosing scope fro a given AST node
	 * TODO: maybe save(lazy cache) this into the node(commontree) ?
	 * this is quite expensive
	 * @param node
	 * @return
	 */
	public FanAstScope findClosestScope(CommonTree node)
	{
		// start at the root node (this) and scan down
		FanAstScope scope = findClosestScope(this, node);
		return scope==null?this:scope;
	}

	/**
	 * recursive
	 * @param scope
	 * @param node
	 */
	private FanAstScope findClosestScope(FanAstScope scope, CommonTree node)
	{
		CommonTree scopeNode=scope.getAstNode();
		if(FanLexAstUtils.isParentNodeOf(scopeNode, node))
		{
			for(FanAstScope child: scope.getChildren())
			{
				FanAstScope found = findClosestScope(child, node);
				if(found!=null)
				{
					return found;
				}
			}
			return scope;
		}
		return null;
	}
}

