/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import javax.swing.event.ChangeListener;
import net.colar.netbeans.fan.antlr.FanLexer;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.parboiled.FantomParser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;
import org.parboiled.support.ParsingResult;

/**
 * Parser impl.
 * Bridges NB parser with parboiled parser
 * @author tcolar
 */
public class NBFanParser extends Parser
{

	FanParserResult result;

	@Override
	public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) throws ParseException
	{
		parse(snapshot);
	}

	public void parse(Snapshot snapshot)
	{
		FanUtilities.GENERIC_LOGGER.debug("Starting parsing of: " + snapshot.getSource().getFileObject().getPath());

		result = new FanParserResult(snapshot);
		try
		{
			result.parse();
			result.parseAstScope();
		} catch (Throwable t)
		{
			//throw new ParseException("Parser Exception.", e);
			result.addError("Parsing Error", t);
			t.printStackTrace();
		}

	}

	@Override
	public Result getResult(Task task) throws ParseException
	{
		return getResult();
	}

	public Result getResult()
	{
		return result;
	}

	@Override
	public void cancel()
	{
		//throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void addChangeListener(ChangeListener changeListener)
	{
		//throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void removeChangeListener(ChangeListener changeListener)
	{
		//throw new UnsupportedOperationException("Not supported yet.");
	}

}
