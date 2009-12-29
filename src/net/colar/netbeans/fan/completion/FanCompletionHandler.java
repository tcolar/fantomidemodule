/*
 * Thibaut Colar Aug 18, 2009
 */
package net.colar.netbeans.fan.completion;

import fan.sys.Slot;
import fan.sys.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.ast.FanLexAstUtils;
import net.colar.netbeans.fan.ast.FanAstResolvResult;
import net.colar.netbeans.fan.ast.FanAstResolvedType;
import net.colar.netbeans.fan.ast.FanAstScope;
import net.colar.netbeans.fan.ast.FanAstScopeVarBase;
import net.colar.netbeans.fan.ast.FanRootScope;
import net.colar.netbeans.fan.indexer.FanJavaIndexer;
import net.colar.netbeans.fan.indexer.FanPodIndexer;
import net.colar.netbeans.fan.structure.FanBasicElementHandle;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.api.java.classpath.GlobalPathRegistry;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.csl.api.CodeCompletionContext;
import org.netbeans.modules.csl.api.CodeCompletionHandler;
import org.netbeans.modules.csl.api.CodeCompletionResult;
import org.netbeans.modules.csl.api.CompletionProposal;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ParameterInfo;
import org.netbeans.modules.csl.spi.DefaultCompletionResult;
import org.netbeans.modules.csl.spi.ParserResult;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 * Code Completion
 * @author thibautc
 */
public class FanCompletionHandler implements CodeCompletionHandler
{

	private static enum DocTypes
	{

		NA,
		POD,
		TYPE,
		SLOT,
	};
	DocTypes docType = DocTypes.NA;
	String preamble = "";
	public static final String[] ROOT_ITEMS =
	{
		"class", "mixin", "enum", "public", "internal", "abstract", "final", "const", "using"
	};

	@Override
	public CodeCompletionResult complete(CodeCompletionContext context)
	{
		ArrayList<CompletionProposal> proposals = new ArrayList<CompletionProposal>();
		try
		{
		String prefix = context.getPrefix();
		if (prefix == null)
		{
			prefix = "";
		}

		FanCompletionContext cpl = new FanCompletionContext(context);
		int anchor = context.getCaretOffset();
		preamble = cpl.getPreamble();
		FanUtilities.GENERIC_LOGGER.debug("preamb: " + preamble);
		FanParserResult result = (FanParserResult) context.getParserResult();
		FanRootScope rootScope = result.getRootScope();

		switch (cpl.getCompletionType())
		{
			case ROOT_LEVEL:
				proposeRootItems(proposals, anchor, prefix.toLowerCase());
				break;
			case IMPORT_POD:
				proposeUsing(proposals, context);
				break;
			case ID:
				proposeVars(proposals, context, prefix);
				proposeDefinedTypes(proposals, anchor, prefix, rootScope);
				docType = DocTypes.TYPE;
				break;
			case CALL:
				proposeCalls(proposals, context);
				break;
		}
		}
		catch(Exception e)
		{	e.printStackTrace();
			FanParserResult result=(FanParserResult)context.getParserResult();
			if(result!=null)
				result.addError("Completion error",e);
		}
		DefaultCompletionResult completionResult = new DefaultCompletionResult(proposals, false);
		return completionResult;
	}

	/*private void addtoTypeProposals(ArrayList<CompletionProposal> proposals, Collection<? extends IndexResult> findRootTypes)
	{
	Iterator it = findRootTypes.iterator();
	while (it.hasNext())
	{
	IndexResult result = (IndexResult) it.next();
	String txt = result.getValue(FanIndexer.INDEX_CLASS);
	System.out.println("Prop: " + txt);
	if (txt != null)
	{
	String type = txt.substring(0, txt.indexOf(';')).trim();
	String pod = findPod(result.getFile());

	proposals.add(new FanTypeProposal(type, 0, pod));
	}
	}
	}*/
	@Override
	public String document(ParserResult result, ElementHandle handle)
	{
		String doc = "";
		switch (docType)
		{
			case POD:
				doc = FanPodIndexer.getInstance().getPodDoc(handle.getName());
				break;
			case TYPE:
				doc = ((FanBasicElementHandle) handle).getDoc();
				break;
			case SLOT:
				doc = ((FanBasicElementHandle) handle).getDoc();
				break;
		}
		return doc;
	}

	public String findPod(FileObject file)
	{
		Set<FileObject> fos = GlobalPathRegistry.getDefault().getSourceRoots();
		for (FileObject fo : fos)
		{
			// It will return the "fan" or "test" subfolder, so we want the parent.
			if (FileUtil.isParentOf(fo, file))
			{
				return fo.getParent().getName();
			}
		}
		return null;
	}

	@Override
	public ElementHandle resolveLink(String link, ElementHandle handle)
	{
		//TODO: resolve links
		/*System.out.println("Resolve link: "+link);
		link="sys.File";
		return new ElementHandle.UrlHandle(link);*/
		return null;
	}

	@Override
	public String getPrefix(ParserResult result, int arg1, boolean arg2)
	{
		return null;
	}

	@Override
	public QueryType getAutoQuery(JTextComponent comp, String arg1)
	{
		return QueryType.NONE;
	}

	@Override
	public String resolveTemplateVariable(String arg0, ParserResult result, int arg2, String arg3, Map arg4)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Set<String> getApplicableTemplates(ParserResult result, int arg1, int arg2)
	{
		return (Set<String>) Collections.EMPTY_SET;
	}

	@Override
	public ParameterInfo parameters(ParserResult result, int arg1, CompletionProposal proposal)
	{
		return ParameterInfo.NONE;
	}

	/**
	Root level (outside class/mixin/enum)
	propose slot begining keywords (class,enum,mixin , public, abstract and so on)
	also propose imports items (if within "using ...")
	proposeImports(proposals);
	 */
	private void proposeRootItems(ArrayList<CompletionProposal> proposals, int anchor, String prefix)
	{
		for (String item : ROOT_ITEMS)
		{
			//if (item.toLowerCase().startsWith(prefix))
			{
				proposals.add(new FanKeywordProposal(item, anchor - prefix.length()));
			}
		}
	}

	/**
	 * Complete imports (using)
	 * If not in an import do nothing and return false
	 * Forms of imports:
	 * using id('. id)* eos    // whole pod
	 * using id('. id)* '::' id eos   // Particular type
	 * using ([id])? id('.' id)* '::' id eos  // FFI
	 * using ([id])? id('.' id)* '::' (id | '$') as id eos  // with 'as'
	 * @param proposals
	 * @param anchor
	 * @return
	 */
	private void proposePods(ArrayList<CompletionProposal> proposals, int anchor, String prefix)
	{
		Set<String> names = FanPodIndexer.getInstance().getAllPodNames();
		if (prefix.length() == 0)
		{
			proposals.add(new FanImportProposal("[java] ", anchor - prefix.length(), true));
		}
		for (String name : names)
		{
			if (name.toLowerCase().startsWith(prefix))
			{
				proposals.add(new FanImportProposal(name, anchor - prefix.length(), false));
				docType = DocTypes.POD;
			}
		}
	}

	/**
	 * Propose Types (class, enum, mixin)
	 * @param podName null means all
	 * @param proposals
	 * @param anchor
	 * @param prefix
	 */
	private void proposeTypes(String podName, ArrayList<CompletionProposal> proposals, int anchor, String prefix)
	{
		Set<Type> types;
		if (podName == null)
		{
			types = FanPodIndexer.getInstance().getAllTypes();
		} else
		{
			types = FanPodIndexer.getInstance().getPodTypes(podName);
		}
		for (Type type : types)
		{
			// TODO: filter out internals / private ?
			if (//!type.isInternal() &&
				type.name().startsWith(prefix))
			{
				proposals.add(new FanTypeProposal(type, anchor - prefix.length(), null));
			}
		}
		docType = DocTypes.TYPE;
	}

	/**
	 * Propose slots(functions, methods etc...) of a specific types.
	 * @param pod
	 * @param type
	 * @param proposals
	 * @param anchor
	 * @param prefix
	 */
	private void proposeSlots(FanAstResolvResult type, ArrayList<CompletionProposal> proposals, int anchor, String prefix)
	{
		Slot[] slots = (Slot[]) type.getType().getType().slots().asArray(Slot.class);
		for (Slot slot : slots)
		{
			if (slot.name().toLowerCase().startsWith(prefix))
			{
				// constructor are not marked as static ... but fot this purpose they are
				boolean isStatic = slot.isStatic() || slot.isCtor();
				if (type.isStaticContext() == isStatic)
				{
					proposals.add(new FanSlotProposal(slot, anchor - prefix.length()));
					docType = DocTypes.SLOT; // TODO
				}
			}
		}
	}

	/**
	 * Java packages
	 * @param proposals
	 * @param anchor
	 * @param pod
	 */
	private void proposeJavaPacks(ArrayList<CompletionProposal> proposals, int anchor, String basePack)
	{
		String base = basePack.substring(6).trim();
		List<String> items = FanJavaIndexer.getInstance().listSubPackages(base);
		for (String s : items)
		{
			FanUtilities.GENERIC_LOGGER.debug("Proposal: " + s);
			// TODO: JavaProps
			proposals.add(new FanImportProposal(s, anchor - base.length(), true));
		}
	}

	/**
	 *
	 * @param proposals
	 * @param anchor
	 * @param basePack   null means from any package
	 * @param type  type (starts with "[java]")
	 */
	private void proposeJavaTypes(ArrayList<CompletionProposal> proposals, int anchor, String basePack, String type)
	{
		String base = null;
		if (basePack != null)
		{
			base = basePack.substring(6).trim();
		}
		List<String> items = FanJavaIndexer.getInstance().listItems(base, type);
		for (String s : items)
		{
			FanUtilities.GENERIC_LOGGER.debug("Proposal: " + s);
			// TODO: JavaProps
			proposals.add(new FanImportProposal(s, anchor - type.length(), true));
		}
	}

	/**
	 * Propose defined types (fan.sys) + whatever listed in using
	 */
	private void proposeDefinedTypes(ArrayList<CompletionProposal> proposals, int anchor, String prefix, FanRootScope rootScope)
	{
		ArrayList<CompletionProposal> props = new ArrayList<CompletionProposal>();
		Hashtable<String, FanAstResolvedType> usings = rootScope.getUsing();
		for (String key : usings.keySet())
		{
			if (key.startsWith(prefix))
			{
				FanAstResolvedType type = usings.get(key);
				if (!type.isUnresolved())
				{
					props.add(new FanTypeProposal(type.getType(), anchor - prefix.length(), key));
				}
			}
		}
		proposeTypes("sys", props, anchor, prefix);
		proposals.addAll(props);
	}

	// TODO: setup nice icons(package/class etc..) in importproposals
	private void proposeUsing(ArrayList<CompletionProposal> proposals, CodeCompletionContext context)
	{
		FanParserResult result = (FanParserResult) context.getParserResult();
		Document doc = result.getSnapshot().getSource().getDocument(true);
		TokenSequence ts = FanLexAstUtils.getFanTokenSequence(doc);
		int offset = context.getCaretOffset();
		//String prefix = context.getPrefix();
		int anchor = context.getCaretOffset();
		FanLexAstUtils.moveToPrevNonWsToken(ts, offset, 0);
		CommonTree baseNode = FanLexAstUtils.findASTNodeAt(result, ts.index());
		offset = ts.offset();
		CommonTree curNode = FanLexAstUtils.findParentNode(baseNode, FanParser.AST_USING_POD);
		FanUtilities.GENERIC_LOGGER.debug("Base node:" + baseNode.toString());
		//System.out.println("Cur node:"+curNode.toString());
		if (curNode == null)
		{
			curNode = FanLexAstUtils.findParentNode(baseNode, FanParser.AST_INC_USING);
		}
		if (curNode.getType() == FanParser.AST_USING_POD)
		{
			String pod = FanLexAstUtils.getNodeContent(result, curNode.getChild(0));
			String type = curNode.getChildCount() == 1 ? null : FanLexAstUtils.getNodeContent(result, curNode.getChild(1));

			FanUtilities.GENERIC_LOGGER.debug("Pod: " + pod);
			FanUtilities.GENERIC_LOGGER.debug("Type: " + type);

			if (type == null || type.length() == 0)
			{
				if (pod.startsWith("[java]"))
				{
					proposeJavaPacks(proposals, anchor, pod);
				} else
				{
					proposePods(proposals, anchor, pod);
				}
			} else
			{
				if (pod.startsWith("[java]"))
				{
					proposeJavaTypes(proposals, anchor, pod, type);
				} else
				{
					proposeTypes(pod, proposals, anchor, type);
				}
			}

		} else if (curNode.getType() == FanParser.AST_INC_USING)
		{
			String pod = FanLexAstUtils.getNodeContent(result, curNode.getChild(1));
			FanUtilities.GENERIC_LOGGER.debug("Pod: " + pod);
			if (pod == null || pod.length() == 0)
			{
				proposePods(proposals, anchor, "");
			} else
			{
				if (pod.startsWith("[java]"))
				{
					if (pod.trim().endsWith("::"))
					{
						String p = pod.trim();
						p = p.substring(0, pod.length() - 2);
						proposeJavaTypes(proposals, anchor, p, "");
					} else
					{
						proposeJavaPacks(proposals, anchor, pod);
					}
				} else
				{
					if (pod.trim().endsWith("::"))
					{
						String p = pod.trim();
						p = p.substring(0, pod.length() - 2);
						proposeTypes(p, proposals, anchor, "");
					} else
					{
						proposeTypes(pod, proposals, anchor, "");
					}
				}
			}
		}
	}

	/**
	 * Propose options for a DOT_CALL ex:
	 * SomeClass._
	 * SomeClass.get_
	 * object.method()._
	 * Window{title="a"}._
	 * @param proposals
	 * @param context
	 */
	private void proposeCalls(ArrayList<CompletionProposal> proposals, CodeCompletionContext context)
	{
		FanParserResult result = (FanParserResult) context.getParserResult();
		int offset = context.getCaretOffset();
		// we want to look at offset -1 (ie: before the caret) so we are IN the expression, not just after.
		if (offset > 0)
		{
			offset--;
		}
		int tkIndex = FanLexAstUtils.offsetToTokenIndex(result, offset);
		CommonTree curNode = FanLexAstUtils.findASTNodeAt(result, tkIndex);
		FanUtilities.GENERIC_LOGGER.debug("Cur Node: " + curNode.toStringTree());
		CommonTree exprNode = FanLexAstUtils.findParentNode(curNode, FanParser.AST_TERM_EXPR);
		if (exprNode != null)
		{
			FanUtilities.GENERIC_LOGGER.debug("Expr Node: " + exprNode.toStringTree());

			//TODO:OP_ARROW ??
			int index = FanLexAstUtils.findLastTokenIndexByType(result, exprNode, FanParser.DOT);
			int index2 = FanLexAstUtils.findLastTokenIndexByType(result, exprNode, FanParser.OP_SAFE_CALL);
			index = index2 > index ? index2 : index;

			String prefix = "";
			if (exprNode.getTokenStopIndex() > index)
			{
				prefix = result.getTokenStream().get(index + 1).getText();
			}
			FanUtilities.GENERIC_LOGGER.debug("Prefix: " + prefix);
			// we want to stop just before the Call token
			index--;
			if (index < 0)
			{
				// should not happen ?
				FanUtilities.GENERIC_LOGGER.info("Call separator not found !");
				return;
			}
			FanAstResolvResult type = FanAstResolvResult.makeFromExpr(result, exprNode, index);
			FanUtilities.GENERIC_LOGGER.debug("Type: " + type.toString());
			if (!type.getType().isUnresolved())
			{
				proposeSlots(type, proposals, offset + 1, prefix);
			}
		}
	}

	private void proposeVars(ArrayList<CompletionProposal> proposals, CodeCompletionContext context, String prefix)
	{
		FanParserResult result = (FanParserResult) context.getParserResult();
		int index = FanLexAstUtils.offsetToTokenIndex(result, context.getCaretOffset());
		CommonTree node = FanLexAstUtils.findASTNodeAt(result, index);
		FanAstScope scope = result.getRootScope().findClosestScope(node);
		for (FanAstScopeVarBase var : scope.getScopeVarsRecursive())
		{
			if (var.getName().startsWith(prefix))
			{
				FanVarProposal prop = new FanVarProposal(var, context.getCaretOffset() - prefix.length());
				proposals.add(prop);
			}
		}
	}
}
