/*
 * Thibaut Colar Aug 19, 2009
 */

package net.colar.netbeans.fan.completion;

import javax.swing.text.Document;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.FanTokenID;
import net.colar.netbeans.fan.antlr.FanLexer;
import net.colar.netbeans.fan.antlr.LexerUtils;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.csl.api.CodeCompletionContext;
import org.netbeans.modules.csl.api.CodeCompletionHandler.QueryType;

/**
 * Store completion context data
 * and determine which completion type to provide (ie: pod etc...)
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

	public static enum completionTypes{UNKNOWN, ROOT_LEVEL, IMPORT_POD, IMPORT_FFI_JAVA, BASE_TYPE};

	private final CodeCompletionContext context;
	FanParserResult result;
	private String preamble="";

	public FanCompletionContext(CodeCompletionContext context)
	{
		this.context=context;
		result = (FanParserResult) context.getParserResult();
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
		tokenStream = LexerUtils.getFanTokenSequence(doc);
		rootNode = result.getTree();
		curNode = LexerUtils.findASTNodeAt(result, offset);

		completionType=completionTypes.UNKNOWN;
		determineCompletionType();
	}

	/**
	 * Figure out what type of completion we will propose
	 */
	private void determineCompletionType()
	{
		tokenStream.move(offset);
		if(curNode.isNil())
		{
			// ie: not within a type (class etc...)
			completionType=completionTypes.ROOT_LEVEL;
			int begin=LexerUtils.getLineBeginOffset(tokenStream, offset, true);
			if(LexerUtils.moveToNextNonWSToken(tokenStream, begin, offset))
			{
				Token tk=tokenStream.token();
				int tkType=tk.id().ordinal();
				if(tkType == FanLexer.KW_USING)
				{
					completionType=completionTypes.IMPORT_POD;
					tokenStream.moveNext();
					while(LexerUtils.moveToNextNonWSToken(tokenStream, tokenStream.offset(), offset))
					{
						Token t=tokenStream.token();
						preamble+=t.toString();
						tokenStream.moveNext();
						if(preamble.startsWith("[java]"))
						{
							completionType=completionTypes.IMPORT_FFI_JAVA;
							preamble="";
						}
					}
				}
				System.out.println("Preamble:" + preamble);
			}
		}
		else
		{
			LexerUtils.moveToPrevNonWSToken(tokenStream, offset, 0);
			System.out.println("curNode :"+curNode.toStringTree());
			//System.out.println("curNodeToken :"+curNode.token.toString());
			Token tk=tokenStream.token();
			System.out.println("token :"+tk.toString());
			System.out.println("tokenId :"+tk.id().toString());
			completionType=completionTypes.BASE_TYPE;
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
