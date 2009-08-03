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
	TokenSequence ts=getFanTokenSequence(doc);
	ts.move(caretIndex);
	ts.moveNext();
	Token<? extends FanTokenID> token = ts.token();
	return token;
    }

    public static TokenSequence<? extends FanTokenID> getFanTokenSequence(Document doc)
    {
	System.err.println("doc:"+ doc);
	TokenHierarchy<Document> th = TokenHierarchy.get(doc);
	System.err.println("hierarchy: "+th);
	
	return getFanTokenSequence(th);
    }

    public static TokenSequence<? extends FanTokenID> getFanTokenSequence(TokenHierarchy<?> th)
    {
	TokenSequence<? extends FanTokenID> ts = th.tokenSequence(FanTokenID.language());
	return ts;
    }
}
