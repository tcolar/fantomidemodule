/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.util.List;
import java.util.Vector;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.MismatchedRangeException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTreeNodeException;
import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
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
	// what should this do ?
    }

    public void addAntlrError(RecognitionException e)
    {
	CommonToken token =(CommonToken)e.token;
	String key="NBFanParser("+sourceName+")";
	String desc=e.toString();
	int start=token.getStartIndex();
	int end= token.getStopIndex();

	// trying to make some nicer erro messages.
	if(e instanceof MissingTokenException)
	{
	    MissingTokenException ee=(MissingTokenException)e;
	    Object inserted=ee.inserted;
	    if(inserted!=null && inserted instanceof Token)
	    {
		Token tk=(Token)inserted;
		desc="Was expecting :'"+tk.getText()+"', but got '"+token.getText()+"' instead."+"\n"+desc;
	    }
	}else if(e instanceof FailedPredicateException)
	{
	    FailedPredicateException ee=(FailedPredicateException)e;
	    desc="Expecting: '"+ee.predicateText+"' but found: '"+token.getText()+"' instead."+"\n"+desc;
	}else if(e instanceof EarlyExitException)
	{
	    EarlyExitException ee=(EarlyExitException) e;
	    desc="Missing required item(s) at: "+ee.token.getText()+"\n"+desc;
	}else if(e instanceof MismatchedRangeException)
	{
	    MismatchedRangeException ee=(MismatchedRangeException) e;
	    desc="Unexpected token range-> "+ee.getUnexpectedType()+" should be within ["+ee.a+"-"+ee.b+"] at: "+ee.token.getText()+"\n"+desc;
	}else if(e instanceof NoViableAltException)
	{
	    NoViableAltException ee=(NoViableAltException)e;
	    desc="Unrecognized item(s) "+(char)ee.getUnexpectedType()+" at '"+ee.grammarDecisionDescription+"' \n"+desc;
	}
	// String key, String displayName, String description, File file, int start, int end,boolean lineError, Severity severity
	Error error=DefaultError.createDefaultError(key,desc,"Syntax Error",null,start,end,e.approximateLineInfo,Severity.ERROR);
	System.err.println("Adding parsing error: "+key+"| Syntax Error | "+desc+" | "+start+" | "+end+" | "+e.line+" |"+token);
	//e.printStackTrace();
	errors.add(error);
    }
}
