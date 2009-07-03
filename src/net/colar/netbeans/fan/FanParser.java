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
 * @author tcolar
 */
public class FanParser extends Parser{

    @Override
    public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) throws ParseException {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Result getResult(Task task) throws ParseException {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void cancel() {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addChangeListener(ChangeListener changeListener) {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeChangeListener(ChangeListener changeListener) {
	throw new UnsupportedOperationException("Not supported yet.");
    }

}
