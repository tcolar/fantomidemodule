/*
 * Thibaut Colar Nov 24, 2009
 */
package net.colar.netbeans.fan.ast;

/**
 * RootScope for a Fan file
 * Also holds errors (unresolvable imports, undefined vars and so on)
 * @author thibautc
 */
/*@Deprecated
public class FanRootScope extends FanAstScope
{
	// using statements. type=null means unresolvable
	// name -> qualifiedType
	private Hashtable<String, FanResolvedType> using = new Hashtable<String, FanResolvedType>();
	// Root node holds errors and hints, to be used by HintsProvider
	// For example unesolvable pods, undefined vars and so on
	List<Error> errors = new ArrayList<Error>();
	List<Hint> hints = new ArrayList<Hint>();
	private final FanParserTask parserResult;
	private final String pod;

	public FanRootScope(FanParserTask result)
	{
		super(null);
		this.parserResult = result;

		//FanLexAstUtils.dumpTree(result.getTree(),0);
		
		pod = FanUtilities.getPodForPath(result.getSourceFile().getPath());
	}

	private void addUsing(String name, String qType, CommonTree node, String text)
	{
		if (using.containsKey(name))
		{
			addError("Duplicated using: " + qType + " / " + using.get(name), node);
		}
		FanType type=FanType.findByPodAndType("sys", name);
		if (type!=null)
		{
			if (type.getPod().equals("sys"))
			{
				addError("Duplicated using: " + qType + " / " + "sys::" + name, node);
			}
		}
		using.put(name, new FanResolvedType(qType));
	}

	public Hashtable<String, FanResolvedType> getUsing()
	{
		return using;
	}

	@Override
	public void dump()
	{
		FanUtilities.GENERIC_LOGGER.debug("---Root Scope---");
		for (String key : using.keySet())
		{
			FanUtilities.GENERIC_LOGGER.debug("Using: " + key + " (" + using.get(key) + ")");
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
		if (node == null)
		{
			return;
		}
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
				// Individual Item
				if (FanType.findByQualifiedName(qname)==null)
				{
					addError("Unresolved Java Item: " + qname, usingNode);
				} else
				{
					addUsing(name, qname, usingNode, type);
				}
			} else
			{
				// ! FFI type -> Fan Pod
				if (type.indexOf("::") > 0)
				{
					// Adding a specific type
					String[] data = type.split("::");
					if (!FanType.hasPod(data[0]))
					{
						addError("Unresolved Pod: " + data[0], usingNode);
					} else if (FanType.findByQualifiedName(type) == null)
					{
						addError("Unresolved Type: " + type, usingNode);
					}

					//Type t = FanPodIndexer.getInstance().getPodType(data[0], data[1]);
					addUsing(name, type, usingNode, type);
				} else
				{
					// Adding all the types of a Pod
					if (!FanType.hasPod(name))
					{
						addError("Unresolved Pod: " + name, usingNode);
					} else
					{
						Vector<FanType> items = FanType.findPodTypes(name, "");
						for (FanType t : items)
						{
							addUsing(t.getSimpleName(), t.getQualifiedName(), usingNode, type);
						}
					}
				}
			}
		}
	}

	protected void parse()
	{
		CommonTree ast = getAstNode();
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
			// Second pass, look for types and their slots
			for (CommonTree child : children)
			{
				switch (child.getType())
				{
					case FanParser.AST_CLASS:
					case FanParser.AST_ENUM:
					case FanParser.AST_MIXIN:
						// will parse and add the type
						FanTypeScope scope = new FanTypeScope(this, child);
						scope.parse();
						addChild(scope);
						break;

				}
			}
			// Now do all the local scopes / variables
			for (FanAstScope child : getChildren())
			{
				// should be but check anyway in case of future change
				if (child instanceof FanTypeScope)
				{
					Collection<FanAstScopeVarBase> vars = child.getScopeVars();
					for (FanAstScopeVarBase slot : vars)
					{
						if (slot instanceof FanAstMethod)
						{
							FanMethodScope scope = new FanMethodScope(child, (FanAstMethod) slot);
							child.addChild(scope);
							scope.parse();
						}
						// otherwise it's a field, nothing to do with it
					}
				}
			}
		}
	}

	public FanParserTask getParserResult()
	{
		return parserResult;
	}

	public FanResolvedType lookupUsing(String type)
	{
		if (using.containsKey(type))
		{
			return using.get(type);
		}
		// fully qualified
		if(type.indexOf("::") != -1)
		{
			return new FanResolvedType(type);
		}
		// Try local pod types
		FanType t = FanType.findByPodAndType(pod, type);
		if (t!=null)
		{
			return new FanResolvedType(t.getQualifiedName());
		}
		// Try Fan standard API's (not fully qualified)
		t = FanType.findByPodAndType("sys", type);
		if (t!=null)
		{
			return new FanResolvedType(t.getQualifiedName());
		}
		// Try Java standrad API's -> No: not avail by defalt in Fan (must use 'using')
		// Unresolvable
		return FanResolvedType.makeUnresolved();
	}

	public FanAstScope findClosestScope(CommonTree node)
	{
		// start at the root node (this) and scan down
		FanAstScope scope = findClosestScope(this, node);
		return scope == null ? this : scope;
	}

	private FanAstScope findClosestScope(FanAstScope scope, CommonTree node)
	{
		CommonTree scopeNode = scope.getAstNode();
		if (FanLexAstUtils.isParentNodeOf(scopeNode, node))
		{
			for (FanAstScope child : scope.getChildren())
			{
				FanAstScope found = findClosestScope(child, node);
				if (found != null)
				{
					return found;
				}
			}
			return scope;
		}
		return null;
	}

	public String getPod()
	{
		return pod;
	}


}*/

