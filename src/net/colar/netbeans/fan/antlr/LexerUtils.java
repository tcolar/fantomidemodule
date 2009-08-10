/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.antlr;

import javax.swing.text.Document;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.FanTokenID;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.csl.api.OffsetRange;

/**
 * Utilities for lexer
 * For example helps finding the Token at a given position in the text ddocument.
 * @author tcolar
 */
public class LexerUtils
{

	/**
	 * Return the Actual token at the given caret position in the document.
	 * @param doc
	 * @param caretIndex
	 * @return
	 */
	public static Token<? extends FanTokenID> getFanTokenAt(Document doc, int caretIndex)
	{
		TokenSequence ts = getFanTokenSequence(doc);
		ts.move(caretIndex);
		ts.moveNext();
		Token<? extends FanTokenID> token = ts.token();
		return token;
	}

	/**
	 * Returns the tokensequence from adoc
	 * @param doc
	 * @return
	 */
	public static TokenSequence<? extends FanTokenID> getFanTokenSequence(Document doc)
	{
		//System.err.println("doc:" + doc);
		TokenHierarchy<Document> th = TokenHierarchy.get(doc);
		//System.err.println("hierarchy: " + th);
		return getFanTokenSequence(th);
	}

	/**
	 * Returns the tokensequence from th tokenhierarchy
	 * @param th
	 * @return
	 */
	public static TokenSequence<? extends FanTokenID> getFanTokenSequence(TokenHierarchy<?> th)
	{
		TokenSequence<? extends FanTokenID> ts = th.tokenSequence(FanTokenID.language());
		return ts;
	}

	/**
	 * Find the closing token matching the opening one (balanced) and return the range between the two
	 * @param doc
	 * @param ts
	 * @param opening
	 * @param closing
	 * @return
	 */
	public static OffsetRange findRangeFromOpening(Document doc, TokenSequence<? extends FanTokenID> ts, int openingTokenID, int closingTokenID)
	{
		return findRange(doc, ts, openingTokenID, closingTokenID, true);
	}

	/**
	 * Find (backward) the opening token matching the closing one (balanced) and return the range between the two
	 * @param doc
	 * @param ts
	 * @param opening
	 * @param closing
	 * @return
	 */
	public static OffsetRange findRangeFromClosing(Document doc, TokenSequence<? extends FanTokenID> ts, int openingTokenID, int closingTokenID)
	{
		return findRange(doc, ts, openingTokenID, closingTokenID, false);
	}

	/**
	 * Looking for matching(balanced) opening/closing token
	 * @param doc
	 * @param ts
	 * @param openingID
	 * @param closingID
	 * @param lookForClosing (false=lookForOpening  - backward)
	 * @return
	 */
	private static OffsetRange findRange(Document doc, TokenSequence<? extends FanTokenID> ts, int openingID, int closingID, boolean lookForClosing)
	{
		int balance = 0;

		while (move(ts, lookForClosing))
		{
			Token<? extends FanTokenID> token = ts.token();
			int ord = token.id().ordinal();

			if (ord == openingID)
			{
				if ((!lookForClosing) && balance == 0)
				{
					return new OffsetRange(ts.offset(), ts.offset() + token.length());
				}
				balance++;
			} else if (ord == closingID)
			{
				if (lookForClosing && balance == 0)
				{
					return new OffsetRange(ts.offset(), ts.offset() + token.length());
				}
				balance--;
			}
		}

		return OffsetRange.NONE;
	}

	private static boolean move(TokenSequence ts, boolean forward)
	{
		if (forward)
		{
			return ts.moveNext();
		} else
		{
			return ts.movePrevious();
		}
	}

	/**
	 * Return the range (start/end position in source file) of an AST node
	 * for a given FanParserResult (using the ANTLR tokenStream)
	 * @param result
	 * @param node
	 * @return range or null if range is invalid
	 */
	public static OffsetRange getNodeRange(FanParserResult result, CommonTree node)
	{
		if (node == null)
		{
			return null;
		}
		OffsetRange range = null;
		try
		{
			CommonTokenStream tokenStream = result.getTokenStream();
			CommonToken startToken = (CommonToken) tokenStream.get(node.getTokenStartIndex());
			CommonToken endToken = (CommonToken) tokenStream.get(node.getTokenStopIndex());
			if (startToken.getStartIndex() >= 0 && endToken.getStopIndex() >= startToken.getStartIndex())
			{
				range = new OffsetRange(startToken.getStartIndex(), endToken.getStopIndex() + 1);
			}
		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Incomplete node ? " + node.getText());
		}
		return range;
	}

	/**
	 * Get the range ofthe whole node content (not just the node itself)
	 * @param fanParserResult
	 * @param idNode
	 * @return
	 */
	public static OffsetRange getContentNodeRange(FanParserResult fanParserResult, CommonTree node)
	{
		OffsetRange range = null;
		if (node.getChildCount() >= 0)
		{
			CommonTree startNode = (CommonTree) node.getChild(0);
			CommonTree endNode = (CommonTree) node.getChild(node.getChildCount() - 1);
			OffsetRange range1 = getNodeRange(fanParserResult, startNode);
			OffsetRange range2 = getNodeRange(fanParserResult, endNode);
			if (range1 != null && range2 != null)
			{
				range = new OffsetRange(range1.getStart(), range2.getEnd());
			}
		}
		return range;
	}
}