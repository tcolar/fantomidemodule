/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.handlers;

import java.util.Collections;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import net.colar.netbeans.fan.FanTokenID;
import net.colar.netbeans.fan.antlr.LexerUtils;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.csl.api.EditorOptions;
import org.netbeans.modules.csl.api.KeystrokeHandler;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.editor.BaseDocument;

/**
 *
 * @author tcolar
 */
public class FanKeyStrokeHandler implements KeystrokeHandler
{

    public boolean beforeCharInserted(Document document, int caretOffset, JTextComponent target, char car) throws BadLocationException
    {
	boolean modified = false;
	BaseDocument doc = (BaseDocument) document;
	String toInsert = "";
	String prev = null;
	if (caretOffset > 0)
	{
	    prev = doc.getText(caretOffset - 1, 1);
	}
	Token<? extends FanTokenID> token = LexerUtils.getFanTokenAt(document, caretOffset);
	
	//TODO: Token will be for example STR ... to be used later

	/*TODO
	 * Do not doucle things if within unclosed string (except " for triple quotes ?)
	 * Do not dbl anything in DSL, or uri's
	 * Do not dbl things in comments, fandocs
	 *
	 */
	switch (car)
	{
	    case '{':
		toInsert = "{}";
		break;
	    case '(':
		toInsert = "()";
		break;
	    case '[':
		toInsert = "[]";
		break;
	    case '`':
		toInsert = "``";
		break;
	    case '\'':
		toInsert = "''";
		break;
	    case '"':
		toInsert = "\"\"";
		break;
	    case '|':
		if (prev.equals("<"))
		{
		    toInsert = "||>";
		}
		break;
	}
	if (toInsert.length() > 0)
	{
	    doc.insertString(caretOffset, toInsert, null);
	    target.getCaret().setDot(caretOffset + 1);
	    modified = true;
	}
	return modified;
    }

    public boolean afterCharInserted(Document document, int caretOffset, JTextComponent target, char car) throws BadLocationException
    {
	return false;
    }

    public boolean charBackspaced(Document document, int caretOffset, JTextComponent target, char car) throws BadLocationException
    {
	return false;
    }

    public int beforeBreak(Document document, int caretOffset, JTextComponent target) throws BadLocationException
    {
	// if withing doc -> insert the **
	// or withon /* */  same
	//indentation ?
	return -1;
    }

    public OffsetRange findMatching(Document document, int caretOffset)
    {
	return OffsetRange.NONE;
    }

    public List<OffsetRange> findLogicalRanges(ParserResult arg0, int arg1)
    {
	return Collections.emptyList();
    }

    public int getNextWordOffset(Document arg0, int arg1, boolean arg2)
    {
	return -1;
    }

    // Non interface methods
    public boolean isInsertMatchingEnabled(BaseDocument doc)
    {
	EditorOptions options = EditorOptions.get(FanTokenID.FAN_MIME_TYPE);
	if (options != null)
	{
	    return options.getMatchBrackets();
	}
	return true;
    }
}
