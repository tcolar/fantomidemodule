/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.util.List;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;

/**
 *
 * @author tcolar
 */
public class FanParserResult extends ParserResult {

    protected FanParserResult(Snapshot snapshot) {
	super(snapshot);
    }

    @Override
    public List<? extends Error> getDiagnostics() {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void invalidate() {
	throw new UnsupportedOperationException("Not supported yet.");
    }
}
