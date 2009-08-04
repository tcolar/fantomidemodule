/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.antlr;

import javax.swing.text.Document;
import net.colar.netbeans.fan.FanTokenID;
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
     * Looking for matching(balanced) opeing/closing token
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

	while (move(ts,lookForClosing))
	{
	    Token<? extends FanTokenID> token = ts.token();
	    int ord = token.id().ordinal();

	    if (ord == openingID)
	    {
		if ( (!lookForClosing) && balance == 0)
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
	if(forward)
	    return ts.moveNext();
	else
	    return ts.movePrevious();
    }
}
