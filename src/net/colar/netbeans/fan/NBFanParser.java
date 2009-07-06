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
import org.antlr.runtime.RecognitionException;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

/**
 *
 * @author tcolar
 */
public class NBFanParser extends Parser{


    @Override
    public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) throws ParseException {
	FanLexer lexer = new FanLexer(new ANTLRStringStream(snapshot.getText().toString()));
	CommonTokenStream tokens = new CommonTokenStream(lexer);

	FanParser parser=new FanParser(tokens);
	try
	{
	   parser.prog();
	}
	catch(RecognitionException re)
	{
	    throw new ParseException("Parsing failed.",re);
	}
    }

    @Override
    public Result getResult(Task task) throws ParseException {
	return null;//throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void cancel() {
	//throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addChangeListener(ChangeListener changeListener) {
	//throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeChangeListener(ChangeListener changeListener) {
	//throw new UnsupportedOperationException("Not supported yet.");
    }

}
