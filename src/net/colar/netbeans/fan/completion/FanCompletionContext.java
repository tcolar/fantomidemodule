/*
 * Thibaut Colar Aug 19, 2009
 */
package net.colar.netbeans.fan.completion;

import javax.swing.text.Document;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.FanTokenID;
import net.colar.netbeans.fan.antlr.FanLexer;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.antlr.LexerUtils;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.api.lexer.Token;
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

		UNKNOWN, ROOT_LEVEL, IMPORT_POD, IMPORT_FFI_JAVA, BASE_TYPE, DOTCALL};
	private final CodeCompletionContext context;
	FanParserResult result;
	private String preamble = "";

	public FanCompletionContext(CodeCompletionContext context)
	{
		this.context = context;
		result = (FanParserResult) context.getParserResult();
		result.dumpTree();

		offset = context.getCaretOffset();//>0?context.getCaretOffset()-1:0;
		String prefix = context.getPrefix();
		if (prefix == null)
		{
			prefix = "";
		}
		queryType = context.getQueryType();// what's this ?
		caseSensitive = context.isCaseSensitive();
		isPrefixMatch = context.isPrefixMatch(); // ?
		doc = result.getSnapshot().getSource().getDocument(true);
		tokenStream = LexerUtils.getFanTokenSequence(doc);
		rootNode = result.getTree();
		curNode = LexerUtils.findASTNodeAt(result, offset);

		completionType = completionTypes.UNKNOWN;
		determineCompletionType();
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
	private void determineCompletionType()
	{
		completionType = completionTypes.BASE_TYPE;

		tokenStream.move(offset);
		if (curNode.isNil())
		{
			// Root level (not in type) default
			completionType = completionTypes.ROOT_LEVEL;
			int begin = LexerUtils.getLineBeginOffset(tokenStream, offset, true);
			if (LexerUtils.moveToNextNonWSToken(tokenStream, begin, offset))
			{
				Token tk = tokenStream.token();
				int tkType = tk.id().ordinal();
				if (tkType == FanLexer.KW_USING)
				{
					// Using statement
					completionType = completionTypes.IMPORT_POD;
					tokenStream.moveNext();
					while (LexerUtils.moveToNextNonWSToken(tokenStream, tokenStream.offset(), offset))
					{
						Token t = tokenStream.token();
						preamble += t.toString();
						tokenStream.moveNext();
						if (preamble.startsWith("[java]"))
						{
							completionType = completionTypes.IMPORT_FFI_JAVA;
							preamble = "";
						}
					}
				}
				System.out.println("Preamble:" + preamble);
			}
		} else
		{
			tokenStream.movePrevious();
			CommonTree node = LexerUtils.findASTNodeAt(result, tokenStream.offset());
			int ord = node.getType();
			// expression completion after a '.' or '?.'
			if (ord == FanParser.INC_DOTCALL || ord == FanParser.INC_SAFEDOTCALL)
			{
				completionType = completionType.DOTCALL;
				// Start at the . or ?. node.
				System.out.println("Node :" + node.toStringTree());
			}
			//TODO: id / method completion
		}
		// restore ts offset
		tokenStream.move(offset);
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
