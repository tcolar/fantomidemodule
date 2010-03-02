/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import javax.swing.event.ChangeListener;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

/**
 *
 * Parser impl.
 * Bridges NB parser with parboiled parser
 * Base of a parsing job results
 * @author tcolar
 */
public class NBFanParser extends Parser
{

	FanParserTask result;

	@Override
	public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) throws ParseException
	{
		parse(snapshot);
	}

	public void parse(Snapshot snapshot)
	{
		FanUtilities.GENERIC_LOGGER.debug("Starting parsing of: " + snapshot.getSource().getFileObject().getPath());

		result = new FanParserTask(snapshot);
		result.parse();
		result.parseScope();
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
