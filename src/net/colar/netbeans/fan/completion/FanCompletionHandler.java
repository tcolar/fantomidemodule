/*
 * Thibaut Colar Aug 18, 2009
 */
package net.colar.netbeans.fan.completion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.swing.text.JTextComponent;
import org.netbeans.modules.csl.api.CodeCompletionContext;
import org.netbeans.modules.csl.api.CodeCompletionHandler;
import org.netbeans.modules.csl.api.CodeCompletionResult;
import org.netbeans.modules.csl.api.CompletionProposal;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ParameterInfo;
import org.netbeans.modules.csl.spi.DefaultCompletionResult;
import org.netbeans.modules.csl.spi.ParserResult;

/**
 * Code Completion
 * @author thibautc
 */
public class FanCompletionHandler implements CodeCompletionHandler
{

	public static final String[] ROOT_ITEMS =
	{
		"class", "mixin", "enum", "public", "internal", "abstract", "final", "const", "using"
	};

	@Override
	public CodeCompletionResult complete(CodeCompletionContext context)
	{
		FanCompletionContext cpl = new FanCompletionContext(context);
		ArrayList<CompletionProposal> proposals = new ArrayList();
		int anchor = context.getCaretOffset();

		switch (cpl.getCompletionType())
		{
			case ROOT_LEVEL:
				proposeRootItems(proposals, anchor);
				break;
			case IMPORT:
				proposeImports(proposals, anchor);
				break;
		}

		DefaultCompletionResult completionResult = new DefaultCompletionResult(proposals, false);
		return completionResult;
	}

	@Override
	public String document(ParserResult result, ElementHandle handle)
	{
		return "";
	}

	@Override
	public ElementHandle resolveLink(String link, ElementHandle handle)
	{
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
		return Collections.EMPTY_SET;
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
	private void proposeRootItems(ArrayList<CompletionProposal> proposals, int anchor)
	{
		for (String item : ROOT_ITEMS)
		{
			proposals.add(new FanKeywordProposal(item, anchor));
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
	private void proposeImports(ArrayList<CompletionProposal> proposals, int anchor)
	{
		proposals.add(new FanKeywordProposal("sys", anchor));
	}
}
