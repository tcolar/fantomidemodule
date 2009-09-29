/*
 * Thibaut Colar Aug 6, 2009
 */
package net.colar.netbeans.fan.structure;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.netbeans.modules.csl.api.Formatter;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.editor.indent.spi.Context;
import net.colar.netbeans.fan.antlr.LexerUtils;
import net.colar.netbeans.fan.antlr.FanLexer;
import net.colar.netbeans.fan.handlers.FanKeyStrokeHandler;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.editor.BaseDocument;
import org.netbeans.editor.Utilities;
import org.netbeans.modules.editor.indent.api.IndentUtils;

/**
 * The formatter, is responsible for "pretty-formatting" a file when requested
 * (indentation etc....)
 * @author thibautc
 */
public class FanFormatter implements Formatter
{
	//TODO: implement PrettyFormatter
	public enum INDENT_TYPES{INCREASE, DECREASE, INCREASE_ONCE, SAME};

	@Override
	public boolean needsParserResult()
	{
		return false;
	}

	@Override
	public int indentSize()
	{
		// TODO shouldn't this be a setting ?
		return 2;
	}

	@Override
	public int hangingIndentSize()
	{
		// TODO shouldn't this be a setting ?
		return indentSize();
	}

	@Override
	public void reformat(Context context, ParserResult compilationInfo)
	{
		TokenSequence ts = LexerUtils.getFanTokenSequence(context.document());
		//System.out.println("Reformat start: "+context.startOffset());
		//System.out.println("Reformat end: "+context.endOffset());
		int startIndent = 0;
		if (context.startOffset() != 0)
		{
			int startWs = LexerUtils.getLineBeginOffset(ts, context.startOffset(), false);
			int endOfLine = LexerUtils.getLineEndOffset(ts, context.startOffset(), false);
			LexerUtils.moveToNextNonWSToken(ts, startWs, endOfLine);
			ts.moveNext();
			int endWs = ts.offset();
			//System.out.println("StartWs: "+startWs+" EndWs: "+endWs);
			try
			{
				startIndent = Utilities.getVisualColumn((BaseDocument) context.document(), endWs);
			} catch (BadLocationException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Start indent: " + startIndent);

		int indentSize = IndentUtils.indentLevelSize(context.document());

		int indent = startIndent;
		int offset = context.startOffset();
		int endOffset = context.endOffset();
		while ((offset = LexerUtils.nextLineStartOffset(ts, offset, endOffset)) >= 0)
		{
			try
			{
				INDENT_TYPES type = getLineIndentOffset(context, startIndent);
				switch(type)
				{
					case INCREASE:
					case INCREASE_ONCE:
						indent++;
					case DECREASE:
						indent--;
				}
				if(indent<0)
					indent=0;
				// Update indent
				//if(context.lineIndent(offset) != offset)
					context.modifyIndent(offset, indent * indentSize);
				switch(type)
				{
					case INCREASE_ONCE:
						indent--;
				}
			} catch (Exception e)
			{
				e.printStackTrace();
			}
			ts = LexerUtils.getFanTokenSequence(context.document());
		}
	}

	@Override
	public void reindent(Context context)
	{
		System.out.println("Reindent start: " + context.startOffset());
		System.out.println("Reindent end: " + context.endOffset());
	}

	/**
	 * Rturn by how much to increase / decrease indent
	 * @param context
	 * @param startOfLine
	 * @return
	 * @throws Exception
	 */
	public INDENT_TYPES getLineIndentOffset(Context context, int startOfLine) throws Exception
	{
		Document document = context.document();
		Token tkNext = LexerUtils.getFanTokenAt(document, startOfLine);
		int prevLineOffset = startOfLine == 0 ? 0 : startOfLine - 1;
		// Get token BEFORE line break
		Token tk = LexerUtils.getFanTokenAt(document, prevLineOffset);
		//If within DSL, STR, URI don't touch it
		/*if (tkNext != null && tk != null)
		{
			int ord = tk.id().ordinal();
			int ord2 = tkNext.id().ordinal();
			if ((ord == FanLexer.DSL && ord2 == ord) |
				(ord == FanLexer.STR && ord2 == ord) |
				(ord == FanLexer.QUOTSTR && ord2 == ord) |
				(ord == FanLexer.URI && ord2 == ord) |
				ord == FanLexer.INC_DSL |
				ord == FanLexer.INC_STR |
				ord == FanLexer.INC_URI)
			{
				return INDENT_TYPES.SAME;
			}
		}*/

		//Caret caret = target.getCaret();
		BaseDocument doc = (BaseDocument) document;

		int lineBegin = Utilities.getRowStart(doc, startOfLine);
		int lineEnd = Utilities.getRowEnd(doc, startOfLine);

		int prevLineBegin = Utilities.getRowStart(doc, prevLineOffset);
		int prevLineEnd = Utilities.getRowEnd(doc, prevLineOffset);

		String line = null;
		String prevLine = null;

		System.out.println("line: "+line);
		System.out.println("prev: "+line);

		if (lineBegin > -1 && lineEnd > lineBegin)
		{
			line = doc.getText(lineBegin, lineEnd - lineBegin);
		}

		if (prevLineBegin > -1 && prevLineEnd > prevLineBegin)
		{
			prevLine = doc.getText(prevLineBegin, prevLineEnd - prevLineBegin);
		}

		if (line != null && prevLine != null)
		{
			if (prevLine.trim().endsWith("{"))
			{
				if (!line.trim().startsWith("}"))
				{
					return INDENT_TYPES.INCREASE;
				}
			}
			else if (line.trim().endsWith("}"))
			{
				return INDENT_TYPES.DECREASE;
			}
			else
			{
				for (int i = 0; i != FanKeyStrokeHandler.INDENT_AFTER_PATTERNS.length; i++)
				{
					if (FanKeyStrokeHandler.INDENT_AFTER_PATTERNS[i].matcher(prevLine).matches())
					{
						return INDENT_TYPES.INCREASE_ONCE;
					}

				}
			}
		}
		return INDENT_TYPES.SAME;
	}
}
