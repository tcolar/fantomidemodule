/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import javax.swing.event.ChangeListener;
import net.colar.netbeans.fan.antlr.FanLexer;
import net.colar.netbeans.fan.antlr.FanParser;
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

/**
 * Parser impl.
 * Bridges NB parser with ANTLR parser
 * @author tcolar
 */
public class NBFanParser extends Parser
{

	FanParserResult result;

	@Override
	public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) throws ParseException
	{
		//System.out.println("Starting parsing of: "+snapshot.getSource().getFileObject().getPath());
		FanLexer lexer = new FanLexer(new ANTLRStringStream(snapshot.getText().toString()));
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		FanParser parser = new FanParser(tokens);
		parser.nbErrors=true;
		parser.setTreeAdaptor(FAN_TREE_ADAPTOR);

		result = new FanParserResult(snapshot, tokens);
		try
		{
			result = parser.parse(result);			
			result.parseAstScope();
		} catch (Exception e)
		{
			throw new ParseException("Parser Exception.", e);
		}
	}

	@Override
	public Result getResult(Task task) throws ParseException
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
	/**
	 * Static ANTLR tree adaptor.
	 */
	static final TreeAdaptor FAN_TREE_ADAPTOR = new CommonTreeAdaptor()
	{

		@Override
		public Object create(Token payload)
		{
			return new CommonTree(payload);
		}
	};
}
