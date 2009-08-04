/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.handlers;

import java.util.Collections;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import net.colar.netbeans.fan.FanLanguage;
import net.colar.netbeans.fan.FanTokenID;
import net.colar.netbeans.fan.antlr.FanLexer;
import net.colar.netbeans.fan.antlr.LexerUtils;
import org.netbeans.api.lexer.Token;
import org.netbeans.editor.BaseDocument;
import org.netbeans.editor.Utilities;
import org.netbeans.modules.csl.api.EditorOptions;
import org.netbeans.modules.csl.api.KeystrokeHandler;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.editor.indent.api.IndentUtils;

/**
 * Impl. of keystrokeHandler
 * Provides support for closing bracket/quote insertion and the likes
 * Also deals with trying to guess/insert proper indentation.
 * @author tcolar
 */
public class FanKeyStrokeHandler implements KeystrokeHandler
{

    private int lastAdditions;

    public boolean beforeCharInserted(Document document, int caretOffset, JTextComponent target, char car) throws BadLocationException
    {
	lastAdditions = 0;
	boolean modified = false;
	BaseDocument doc = (BaseDocument) document;
	String toInsert = "";
	String prev = null;
	if (caretOffset > 0)
	{
	    prev = doc.getText(caretOffset - 1, 1);
	}
	Token<? extends FanTokenID> token = LexerUtils.getFanTokenAt(document, caretOffset);

	// If User types closing item we closed automaticaly, skip it
	if ((car == '"' && token.id().ordinal() == FanLexer.INC_STR) ||
		(car == '"' && token.id().ordinal() == FanLexer.STR) ||
		(car == '"' && token.id().ordinal() == FanLexer.QUOTSTR) ||
		(car == '`' && token.id().ordinal() == FanLexer.INC_URI) ||
		(car == '\'' && token.id().ordinal() == FanLexer.CHAR) ||
		(car == '`' && token.id().ordinal() == FanLexer.INC_URI) ||
		(car == '`' && token.id().ordinal() == FanLexer.URI) ||
		(car == '}' && lastUnclosedToken(caretOffset)=='{') ||
		(car == ')' && lastUnclosedToken(caretOffset)=='(') ||
		(car == '[' && lastUnclosedToken(caretOffset)==']')
		)
	{
	    // just skip the existing same characters
	    target.getCaret().setDot(caretOffset + 1);	    
	    return true;
	}

	// Same but dual characters
	if ((car == '/' && prev.equals("*") && token.id().ordinal() == FanLexer.MULTI_COMMENT) ||
		(car == '>' && prev.equals("|") && token.id().ordinal() == FanLexer.DSL))
	{
	    // remove previous char and then skip existing one
	    doc.remove(caretOffset - 1, 1);
	    target.getCaret().setDot(caretOffset + 1);
	    return true;
	}

	// If within those tokens, don't do anything special
	if (token.id().ordinal() == FanLexer.STR ||
		token.id().ordinal() == FanLexer.CHAR ||
		token.id().ordinal() == FanLexer.DOC ||
		token.id().ordinal() == FanLexer.DSL ||
		token.id().ordinal() == FanLexer.EXEC_COMMENT ||
		token.id().ordinal() == FanLexer.INC_COMMENT ||
		token.id().ordinal() == FanLexer.INC_DSL ||
		token.id().ordinal() == FanLexer.INC_STR ||
		token.id().ordinal() == FanLexer.INC_URI ||
		token.id().ordinal() == FanLexer.LINE_COMMENT ||
		token.id().ordinal() == FanLexer.MULTI_COMMENT ||
		token.id().ordinal() == FanLexer.QUOTSTR ||
		token.id().ordinal() == FanLexer.STR ||
		token.id().ordinal() == FanLexer.URI)
	{
	    return false;
	}

	// Automatically add closing item/brace when opening one entered
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
	    case '*':
		if (prev.equals("/"))
		{
		    toInsert = "**/";
		}
		break;
	}
	// do the insertiuon job
	if (toInsert.length() > 0)
	{
	    doc.insertString(caretOffset, toInsert, null);
	    target.getCaret().setDot(caretOffset + 1);
	    modified = true;
	    if (toInsert.length() > 0)
	    {
		lastAdditions = toInsert.length() - 1;
	    }
	}
	return modified;
    }

    public boolean afterCharInserted(Document document, int caretOffset, JTextComponent target, char car) throws BadLocationException
    {
	// doing all in beforeCharInserted for now.
	return false;
    }

    public boolean charBackspaced(Document document, int caretOffset, JTextComponent target, char car) throws BadLocationException
    {
	// If we just auto-added chars in beforeCharInserted() and the user press backspace right away,
	// we remove them now.
	if (lastAdditions > 0)
	{
	    BaseDocument doc = (BaseDocument) document;
	    doc.remove(caretOffset, lastAdditions);
	    //target.getCaret().setDot(caretOffset - 1);
	    return true;
	}
	return false;
    }

    public int beforeBreak(Document document, int caretOffset, JTextComponent target) throws BadLocationException
    {
	String NL =/*Character.LINE_SEPARATOR*/ "\n";
	int indentSize=IndentUtils.indentLevelSize(document);
	Caret caret = target.getCaret();
	BaseDocument doc = (BaseDocument) document;

	int lineBegin = Utilities.getRowStart(doc, caretOffset);
	int lineEnd = Utilities.getRowEnd(doc, caretOffset);

	int above = Utilities.getPositionAbove(target, caretOffset, 0);
	int prevLineBegin = Utilities.getRowStart(doc, above);
	int prevLineEnd = Utilities.getRowEnd(doc, above);

	String line = null;
	String prevLine = null;
	if (lineBegin > -1 && lineEnd > lineBegin)
	{
	    line = doc.getText(lineBegin, lineEnd - lineBegin);
	}
	if (prevLineBegin > -1 && prevLineEnd > prevLineBegin)
	{
	    prevLine = doc.getText(prevLineBegin, prevLineEnd - prevLineBegin);
	}

	String lineHead = doc.getText(lineBegin, caretOffset - lineBegin);
	String lineTail = doc.getText(caretOffset, lineEnd - caretOffset);

	// standard indent (same as the line we pressed return on)
	int indent = 0;
	if (lineBegin > 0)
	{
	    indent = IndentUtils.lineIndent(document, lineBegin);
	}

	int dotOffset=0;
	String insert = "";
	String trimmedLine = line.trim();
	if (line != null)
	{
	    // If within doc -> insert the ** on next line
	    // insert only if the prev doc line is not empty("**") - except for first one (empty ok)
	    boolean isFirstDocLine = prevLine == null || !prevLine.trim().startsWith("**");
	    if (trimmedLine.startsWith("**") && (isFirstDocLine || trimmedLine.length() > 3))
	    {
		insert = "** ";
	    } else if (lineHead.trim().endsWith("{"))
	    {
		if(lineTail.trim().startsWith("}"))
		{
		    insert=NL;
		    dotOffset=-1;
		}
		indent+=indentSize;
	    }
	}

	// Do the insertion.
	String indentStr = IndentUtils.createIndentString(document, indent);
	doc.insertString(caretOffset, indentStr + insert, null);
	caret.setDot(caretOffset);
	return caretOffset + indentStr.length() + insert.length() + 1 + dotOffset;
    }

    public OffsetRange findMatching(Document document, int caretOffset)
    {
	// not impl yet.
	return OffsetRange.NONE;
    }

    public List<OffsetRange> findLogicalRanges(ParserResult arg0, int arg1)
    {
	// not impl yet.
	// TODO: logical view/parser results can provide this ?
	return Collections.emptyList();
    }

    public int getNextWordOffset(Document arg0, int arg1, boolean arg2)
    {
	// not impl yet.
	return -1;
    }

    // TODO: unused, use that after checking if this option works
    public boolean isInsertMatchingEnabled(BaseDocument doc)
    {
	// Default: true
	EditorOptions options = EditorOptions.get(FanLanguage.FAN_MIME_TYPE);
	if (options != null)
	{
	    return options.getMatchBrackets();
	}
	return true;
    }

    // Look backward in tokenstream for first unclosed char
    // either { [ or (
    // within this ident level ?
    private char lastUnclosedToken(int caretOffset)
    {
	throw new UnsupportedOperationException("Not yet implemented");
    }
}
