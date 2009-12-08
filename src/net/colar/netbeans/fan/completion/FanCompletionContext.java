/*
 * Thibaut Colar Aug 19, 2009
 */
package net.colar.netbeans.fan.completion;

import javax.swing.text.Document;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.FanTokenID;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.antlr.FanLexAstUtils;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.csl.api.CodeCompletionContext;
import org.netbeans.modules.csl.api.CodeCompletionHandler.QueryType;

/**
 * Store completion context data
 * and determine which completion type to provide (ie: pod etc...)
 *
 * See javadoc of determineCompletionType() for much more details
 * 
 * @author thibautc
 */
public class FanCompletionContext
{

	private completionTypes completionType;
	private final int offset;
	private final QueryType queryType;
	private final boolean caseSensitive;
	private final boolean isPrefixMatch;
	private final Document doc;
	private final CommonTree rootNode;
	private final TokenSequence<? extends FanTokenID> tokenStream;
	private final CommonTree curNode;

	public static enum completionTypes
	{

		UNKNOWN, ROOT_LEVEL, IMPORT_POD, IMPORT_FFI_JAVA, BASE_TYPE, DOTCALL
	};
	private final CodeCompletionContext context;
	FanParserResult result;
	private String preamble = "";

	public FanCompletionContext(CodeCompletionContext context)
	{
		this.context = context;
		result = (FanParserResult) context.getParserResult();

		//result.dumpTree();

		offset = context.getCaretOffset();
		String prefix = context.getPrefix();
		if (prefix == null)
		{
			prefix = "";
		}
		queryType = context.getQueryType();// what's this ?
		caseSensitive = context.isCaseSensitive();
		isPrefixMatch = context.isPrefixMatch(); // ?
		doc = result.getSnapshot().getSource().getDocument(true);
		tokenStream = FanLexAstUtils.getFanTokenSequence(doc);
		rootNode = result.getTree();
		curNode = FanLexAstUtils.findASTNodeAt(result, offset);

		completionType = determineCompletionType();
		System.out.println("Compl. type:" + completionType.toString());
	}

	/**
	 * Figure out what type of completion we will propose
	 *
	 * TODO: Propose after '->' ? -> probably not since a dynamic call anyhow.
	 *
	 * NOTE: Call can be after '.' or '?.'
	 * NOTE: For inferred vars ... try to recognize the 'easy' ones (literals): http://wiki.colar.net/fan_cheat_sheet#literals
	 *		Easy: Local Fields, Local method calls, Bool, Numbers(Char), Str, Uri, 'Type (#)'??
	 *		Less easy: Lists, Maps, Range, Inherited methods calls, Inherited fields, Static method/field
	 *		More Difficult: External fields, methods.
	 *
	 * What to complete ?
	 * - Outside of type, default: propose root level items (Class, public etc...)
	 *
	 * - In using statement
	 *   * before '::' give pod lists + 'java'
	 *   * after '::' give type list of given pod
	 *
	 * - In a Type (class,mixin, enum)
	 *   * After 'super.' -> Propose methods to override (abstract, override)
	 *   * After '.' -> if type before '.' can be determined, propose that type's slot.
	 *					Since we are in Type .. must be another (possibly inherited) Field or a static call .. so the type must be known.
	 *   * Default -> List all Types ? (favor/only? 'using' types ?), autoadd new types to using ?
	 *
	 * - In a Method (incl constructors)
	 *	 * Default: Propose other slots (fields/methods) including inerited, propose method params,
	 *				propose localVars. Propose all Types too ?
	 *   * After 'this.' : Propose fields (incl. inherited), methods?(no)
	 *   * After '.': if type before '.' can be determined, propose that type's slot.
	 *				  Otherwise ? propose nothing ? or just Obj slots ?
	 *   * After 'super.' : Propose inherited slots.
	 *
	 * - It block
	 *	 * Try to propose right stuff for 'it.'
	 *
	 * - Closure
	 *	 * Propose closure params
	 *
	 * - Switch Case: Propose enum values if switching over enum
	 *
	 * - Try/Catch : No completion for now - fantom unchecked
	 *
	 * TODO: Propositions visibility (Don't propose things that are not accesible)
	 * - Propose localVars only within same "block"
	 * - Propose private slots only within same Type
	 * - Propose internal slots only within same Pod
	 * - Propose protected slots only within "subtypes"
	 *
	 */
	private completionTypes determineCompletionType()
	{
		// We want the significant node before the cursor
		FanLexAstUtils.moveToPrevNonWSToken(tokenStream, offset, 0);
		CommonTree node = FanLexAstUtils.findASTNodeAt(result, tokenStream.offset());
		if (node==null)
		{
			System.out.println("Node : Nill !");
			// Root level (not in type) default
			return completionTypes.ROOT_LEVEL;
		} else
		{
			CommonTree usingNode = FanLexAstUtils.findParentNode(node, FanParser.AST_USING_POD);
			if (usingNode == null)
			{
				usingNode = FanLexAstUtils.findParentNode(node, FanParser.AST_INC_USING);
			}
			else
			{
				return completionTypes.IMPORT_POD;
			}
			// expression completion after a '.' or '?.'
			System.out.println("Node :" + node.toString() + " " + node.toStringTree());
			if(FanLexAstUtils.findParentNode(node, FanParser.AST_TERM_EXPR)!=null)
			{
				// TODO: check if it's a dot call or another kind of call. -> ?. ?-> etc...
				return completionType.DOTCALL;
			}
		}
		// restore ts offset
		//tokenStream.move(offset);
		return completionTypes.UNKNOWN;
	}

	public boolean isCaseSensitive()
	{
		return caseSensitive;
	}

	public completionTypes getCompletionType()
	{
		return completionType;
	}

	public CodeCompletionContext getContext()
	{
		return context;
	}

	public CommonTree getCurNode()
	{
		return curNode;
	}

	public Document getDoc()
	{
		return doc;
	}

	public boolean isIsPrefixMatch()
	{
		return isPrefixMatch;
	}

	public int getOffset()
	{
		return offset;
	}

	public QueryType getQueryType()
	{
		return queryType;
	}

	public FanParserResult getResult()
	{
		return result;
	}

	public CommonTree getRootNode()
	{
		return rootNode;
	}

	public TokenSequence<? extends FanTokenID> getTokenStream()
	{
		return tokenStream;
	}

	/**
	 * Preamble contains prefix text relevant to the completion
	 * @return
	 */
	public String getPreamble()
	{
		return preamble;
	}
}
