/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.io.File;
import java.util.List;
import java.util.Vector;
import javax.swing.text.Document;
import net.colar.netbeans.fan.scope.FanAstScopeVar;
import net.colar.netbeans.fan.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.indexer.model.FanType;
import net.colar.netbeans.fan.parboiled.AstKind;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.parboiled.FantomParser;
import net.colar.netbeans.fan.parboiled.pred.NodeKindPredicate;
import net.colar.netbeans.fan.scope.FanTypeScopeVar;
import net.colar.netbeans.fan.types.FanResolvedType;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.Severity;
import org.netbeans.modules.csl.spi.DefaultError;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.parboiled.Node;
import org.parboiled.Parboiled;
import org.parboiled.RecoveringParseRunner;
import org.parboiled.errors.ParseError;
import org.parboiled.support.ParseTreeUtils;
import org.parboiled.support.ParsingResult;

/**
 * Parse a fan file and holds the results
 * parse() parses the file
 * parseScope() adds to the tree scope vraiables etc...
 * @author  tcolar
 */
public class FanParserTask extends ParserResult
{

	List<Error> errors = new Vector<Error>(); // -> use parsingResult.errors ?
	// full path of the source file
	private final FileObject sourceFile;
	// simple name of the source file
	private final String sourceName;
	// pod name
	private final String pod;
	// once parse() is called, will contain the parboiled parsing result
	private ParsingResult<AstNode> parsingResult;
	private AstNode astRoot;

	public FanParserTask(Snapshot snapshot)
	{
		super(snapshot);
		sourceName = snapshot.getSource().getFileObject().getName();
		sourceFile = FileUtil.toFileObject(new File(snapshot.getSource().getFileObject().getPath()));
		pod = FanUtilities.getPodForPath(sourceFile.getPath());
	}

	@Override
	public List<? extends Error> getDiagnostics()
	{
		return errors;
	}

	@Override
	protected void invalidate()
	{
		// what should this do ?
	}

	/**
	 * Return AST tree generated by this parsing
	 * @return
	 */
	public Node getTree()
	{
		if (parsingResult != null)
		{
			return parsingResult.parseTreeRoot;
		}
		return null;
	}

	/**
	 * Dump AST tree 
	 */
	public void dumpTree()
	{
		FanUtilities.GENERIC_LOGGER.trace("-------------------Start AST Tree dump-----------------------");
		ParseTreeUtils.printNodeTree(parsingResult);
		FanUtilities.GENERIC_LOGGER.trace("-------------------End AST Tree dump-----------------------");
	}

	/**
	 * Shotcut method for getSnapshot().getSource().getDocument(true);
	 * @return
	 */
	public Document getDocument()
	{
		return getSnapshot().getSource().getDocument(true);
	}

	public void addError(String title, Throwable t)
	{
		// "High level error"
		Error error = DefaultError.createDefaultError(title, t.toString(), title, null, 0, 0, true, Severity.ERROR);
		errors.add(error);
	}

	/**
	 * The root scope
	 * @return
	 */
	public AstNode getRootScope()
	{
		return astRoot;
	}

	public FileObject getSourceFile()
	{
		return sourceFile;
	}

	/**
	 * Add an error (not the parser errors, but others like semantic etc..)
	 * @param info
	 * @param node
	 */
	public void addError(String info, AstNode node)
	{
		if (node == null)
		{
			return;
		}
		String key = "FanParserTask";
		OffsetRange range = FanLexAstUtils.getNodeRange(node);
		int start = range.getStart();
		int end = range.getEnd();
		//System.out.println("Start: "+start+"End:"+end);
		Error error = DefaultError.createDefaultError(key, info, "Syntax Error", sourceFile, start, end, true, Severity.ERROR);
		errors.add(error);
	}

	/**
	 * Parse the file (using parboiled FantomParser)
	 */
	public void parse()
	{
		FantomParser parser = Parboiled.createParser(FantomParser.class, this);

		try
		{
			parsingResult = RecoveringParseRunner.run(parser.compilationUnit(), getSnapshot().getText().toString());
			astRoot = parsingResult.parseTreeRoot.getValue();
			// Copy parboiled parse error into a CSL errrors
			for (ParseError err : parsingResult.parseErrors)
			{
				// key, displayName, description, file, start, end, lineError?, severity
				Error error = DefaultError.createDefaultError(err.getErrorMessage(), err.toString(), err.toString(),
					sourceFile, err.getErrorLocation().getIndex(), err.getErrorLocation().getIndex() + err.getErrorCharCount(),
					false, Severity.ERROR);
				errors.add(error);
			}
		} catch (Exception e)
		{
			addError("Parser error", e);
			e.printStackTrace();
		}
	}

	/**
	 * Call after parsing to add scope variables / type resolution to the AST tree
	 */
	public void parseScope()
	{
		if (astRoot == null)
		{
			return;
		}
		// First run : lookup using statements
		for (AstNode node : astRoot.getChildren())
		{
			switch (node.getKind())
			{
				case AST_INC_USING:
					addError("Incomplete import statement", node);
					break;

				case AST_USING:
					addUsing(node);
					break;

			}
		}

		// Second pass, lookup types and slots
		for (AstNode node : astRoot.getChildren())
		{
			switch (node.getKind())
			{
				case AST_TYPE_DEF:
					String name = FanLexAstUtils.getFirstChildText(node, new NodeKindPredicate(AstKind.AST_ID));
					FanTypeScopeVar var = new FanTypeScopeVar(node, name);
					var.parse();
					AstNode scopeNode = FanLexAstUtils.getScopeNode(node);
					scopeNode.getLocalScopeVars().put(name, var);
					break;
			}
		}

		// Now do all the local scopes / variables
		for (AstNode node : astRoot.getChildren())
		{
			// should be but check anyway in case of future change
			if (node.getKind() == AstKind.AST_TYPE_DEF)
			{
				/*Collection<FanAstScopeVarBase> vars = child.getScopeVars();
				for (FanAstScopeVarBase slot : vars)
				{
				if (slot instanceof FanAstMethod)
				{
				FanMethodScope scope = new FanMethodScope(child, (FanAstMethod) slot);
				child.addChild(scope);
				scope.parse();
				}
				// otherwise it's a field, nothing to do with it
				}*/
			}
		}
		int bkpt=0;
	}

	private void addUsing(AstNode usingNode)
	{
		String type = FanLexAstUtils.getFirstChildText(usingNode, new NodeKindPredicate(AstKind.AST_ID));
		String as = FanLexAstUtils.getFirstChildText(usingNode, new NodeKindPredicate(AstKind.AST_USING_AS));
		String ffi = FanLexAstUtils.getFirstChildText(usingNode, new NodeKindPredicate(AstKind.AST_USING_FFI));

		String name = as != null ? as : type;

		if (ffi != null && ffi.toLowerCase().equals("java"))
		{
			String qname = type.replaceAll("::", "\\.");
			// Individual Item
			if (FanType.findByQualifiedName(qname) == null)
			{
				addError("Unresolved Java Item: " + qname, usingNode);
			} else
			{
				addUsing(name, qname, usingNode, type);
			}
		} else
		{
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
				if (name.equalsIgnoreCase("sys")) // sys is always avail.
				{
					return;
				}
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

	private void addUsing(String name, String qType, AstNode node, String text)
	{
		AstNode scopeNode = FanLexAstUtils.getScopeNode(node);
		if (scopeNode == null)
		{
			return;
		}
		if (scopeNode.getLocalScopeVars().containsKey(name))
		{
			addError("Duplicated using: " + qType + " / " + scopeNode.getLocalScopeVars().get(name), node);
		}
		FanType type = FanType.findByPodAndType("sys", name);
		if (type != null)
		{
			if (type.getPod().equals("sys"))
			{
				addError("Duplicated using: " + qType + " / " + "sys::" + name, node);
			}
		}
		scopeNode.addScopeVar(name, FanAstScopeVar.VarKind.IMPORT, new FanResolvedType(qType));
	}

	public ParsingResult<AstNode> getParsingResult()
	{
		return parsingResult;
	}

	public String getPod()
	{
		return pod;
	}

}


