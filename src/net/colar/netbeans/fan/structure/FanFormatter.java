/*
 * Thibaut Colar Aug 6, 2009
 */

package net.colar.netbeans.fan.structure;

import org.netbeans.modules.csl.api.Formatter;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.editor.indent.spi.Context;

/**
 * The formatter, is responsible for "pretty-formatting" a file when requested
 * (indentation etc....)
 * @author thibautc
 */
public class FanFormatter implements Formatter
{
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
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void reindent(Context context)
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

}
