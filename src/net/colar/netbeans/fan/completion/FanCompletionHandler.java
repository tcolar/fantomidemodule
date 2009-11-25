/*
 * Thibaut Colar Aug 18, 2009
 */
package net.colar.netbeans.fan.completion;

import fan.sys.Slot;
import fan.sys.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanLexer;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.antlr.LexerUtils;
import net.colar.netbeans.fan.indexer.FanPodIndexer;
import net.colar.netbeans.fan.structure.FanDummyElementHandle;
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
		FileObject fo = context.getParserResult().getSnapshot().getSource().getFileObject();
		String prefix = context.getPrefix();
		if (prefix == null)
		{
			prefix = "";
		}

		FanCompletionContext cpl = new FanCompletionContext(context);
		ArrayList<CompletionProposal> proposals = new ArrayList();
		int anchor = context.getCaretOffset();
		preamble = cpl.getPreamble();
		System.out.println("preamb: " + preamble);

		switch (cpl.getCompletionType())
		{
			case ROOT_LEVEL:
				proposeRootItems(proposals, anchor, prefix.toLowerCase());
				break;
			case IMPORT_POD:
				proposePods(proposals, context);
				break;
			case IMPORT_FFI_JAVA:
				//TODO
				break;
			case BASE_TYPE:
				proposeTypes(null, proposals, anchor, prefix.toLowerCase());
				docType = DocTypes.TYPE;
				break;
			case DOTCALL:
				proposeCalls(proposals, context);
				break;
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
		String pod = "";
		switch (docType)
		{
			case POD:
				doc = FanPodIndexer.getInstance().getPodDoc(handle.getName());
				break;
			case TYPE:
				pod = ((FanDummyElementHandle) handle).getCustomParams().get(FanDummyElementHandle.params.POD);
				if (pod != null)
				{
					doc = FanPodIndexer.getInstance().getPodTypeDoc(pod, handle.getName());
				}
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
	 * Propose Typoes (class, enum, mixin)
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
				proposals.add(new FanTypeProposal(type.name(), anchor - prefix.length(), podName));
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
	private void proposeSlots(String pod, String type, ArrayList<CompletionProposal> proposals, int anchor, String prefix)
	{
		Set<Slot> slots = FanPodIndexer.getInstance().getSlots(pod, type);
		for (Slot slot : slots)
		{
			if (slot.name().toLowerCase().startsWith(prefix))
			{
				//TODO: FanSlotProposal
				proposals.add(new FanKeywordProposal(slot.name(), anchor - prefix.length()));
				docType = DocTypes.NA; // TODO
			}
		}
	}

	private void proposePods(ArrayList<CompletionProposal> proposals, CodeCompletionContext context)
	{
		FanParserResult result = (FanParserResult) context.getParserResult();
		Document doc = result.getSnapshot().getSource().getDocument(true);
		TokenSequence ts = LexerUtils.getFanTokenSequence(doc);
		int offset = context.getCaretOffset();
		//String prefix = context.getPrefix();
		int anchor = context.getCaretOffset();
		// we want to look at offset -1 (ie: before the caret) so we are IN the expression, not just after.
		LexerUtils.moveToPrevNonWSToken(ts, offset, 0);
		offset = ts.offset();
		CommonTree baseNode = LexerUtils.findASTNodeAt(result, offset);
		CommonTree curNode = LexerUtils.findParentNode(baseNode, FanParser.AST_USING_POD);
		if (curNode == null)
		{
			curNode = LexerUtils.findParentNode(baseNode, FanParser.AST_INC_USING);
		}
		if (curNode.getType() == FanParser.AST_USING_POD)
		{
			String pod = LexerUtils.getNodeContent(result, curNode.getChild(0));
			String type = curNode.getChildCount()==1?null:LexerUtils.getNodeContent(result, curNode.getChild(1));

			if (type == null || type.length() == 0)
			{
				proposePods(proposals, anchor, pod);
			} else
			{
				proposeTypes(pod, proposals, anchor, type);
			}

		} else if (curNode.getType() == FanParser.AST_INC_USING)
		{
			String pod = LexerUtils.getNodeContent(result, curNode.getChild(1));
			if (pod == null || pod.length() == 0)
			{
				proposePods(proposals, anchor, "");
			} else
			{
				proposeTypes(pod, proposals, anchor, "");
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
		CommonTree curNode = LexerUtils.findASTNodeAt(result, offset);
		CommonTree exprNode = LexerUtils.findParentNode(curNode, FanParser.AST_TERM_EXPR);
		if (exprNode != null)
		{
			System.out.println("Expr Node: " + exprNode.toStringTree());
			String type = resolveTypeOfExpr(exprNode);
			System.out.println("Type: " + type);
			//TODO: continue this
		}
	}

	/**
	 * Given an expression try to resolve the type we are trying to complete
	 * Return null if can't figure the type out.
	 * @param exprNode
	 * @return
	 */
	private String resolveTypeOfExpr(CommonTree exprNode)
	{
		String type = null;
		List<CommonTree> children = exprNode.getChildren();
		for (CommonTree node : children)
		{
			switch (node.getType())
			{
				case FanParser.AST_STATIC_CALL:
					CommonTree tNode = (CommonTree) node.getFirstChildWithType(FanParser.AST_TYPE);
					if (tNode != null && tNode.getChildCount() > 0)
					{
						type = tNode.getChild(0).getText();
					}
			}

		}
		return type;
	}
}
