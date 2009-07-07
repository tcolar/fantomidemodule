/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.util.List;
import java.util.Vector;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.api.Severity;
import org.netbeans.modules.csl.spi.DefaultError;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;

/**
 *
 * @author tcolar
 */
public class FanParserResult extends ParserResult {

    List<Error> errors=new Vector<Error>();
    private final String sourceName;

    public FanParserResult(Snapshot snapshot)
    {
	super(snapshot);
	this.sourceName=snapshot.getSource().getFileObject().getName();
    }

    @Override
    public List<? extends Error> getDiagnostics() {
	return errors;
    }

    @Override
    protected void invalidate() {
    }

    public void addAntlrError(RecognitionException e)
    {
	CommonToken token=(CommonToken)e.token;
	String key="NBFanParser("+sourceName+")";
	String desc=e.toString();
	int start=token.getStartIndex();
	int end= token.getStopIndex();
	// String key, String displayName, String description, File file, int start, int end,boolean lineError, Severity severity
	Error error=DefaultError.createDefaultError(key,desc,"Syntax Error",null,start,end,e.approximateLineInfo,Severity.ERROR);
	System.err.println("Adding parsing error: "+key+"| Syntax Error | "+desc+" | "+start+" | "+end+" | "+e.line+" |"+token);
	//e.printStackTrace();
	errors.add(error);
    }
}
