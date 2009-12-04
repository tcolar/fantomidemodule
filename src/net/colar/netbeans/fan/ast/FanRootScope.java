/*
 * Thibaut Colar Nov 24, 2009
 */
package net.colar.netbeans.fan.ast;

import fan.sys.Type;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.antlr.FanLexAstUtils;
import net.colar.netbeans.fan.indexer.FanJavaIndexer;
import net.colar.netbeans.fan.indexer.FanPodIndexer;
import org.antlr.runtime.tree.CommonTree;
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
	private Hashtable<String, Type> using = new Hashtable<String, Type>();
	// types (classes/enums/mixins)
	private Vector<FanAstScope> types = new Vector<FanAstScope>();
	// Root node holds errors and hints, to be used by HintsProvider
	// For example unesolvable pods, undefined vars and so on
	List<Error> errors = new ArrayList<Error>();
	List<Hint> hints = new ArrayList<Hint>();
	private final FanParserResult parserResult;

	public FanRootScope(FanParserResult result)
	{
		super(null);
		this.parserResult = result;
		CommonTree ast = result.getTree();
		parse(ast);
	}

	private void addUsing(String name, Type type)
	{
		System.out.println("- Using "+name+" : "+type);
		using.put(name, type);
	}

	private void addType(FanAstScope type)
	{
		if (type != null)
		{
			types.add(type);
		}
	}

	public Hashtable<String, Type> getUsing()
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
		for (FanAstScope node : types)
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
				if (!FanJavaIndexer.getInstance().hasItem(qname))
				{
					addError("Unresolvable Java Item: " + qname, usingNode);
				}
			} else
			{
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
					if (t != null)
					{
						addUsing(name, t);
					}
				} else
				{
					// Adding all the types of a Pod
					if (!FanPodIndexer.getInstance().hasPod(name))
					{
						addError("Unresolvable Pod: " + name, usingNode);
					}
					Set<Type> types = FanPodIndexer.getInstance().getPodTypes(name);
					for (Type t : types)
					{
						//TODO: There could be duplicates (says Sys.Time and My.Time) .. should we deal with that ?
						if (using.containsKey(t.name()))
						{
							System.out.println("Duplicated using: " + t.name() + " (" + name + ")");
						}
						addUsing(t.name(), t);
					}
				}

			}
		}
	}

	private void parse(CommonTree ast)
	{
		List<CommonTree> children = (List<CommonTree>)ast.getChildren();
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

	
}


