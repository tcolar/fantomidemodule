/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import javax.swing.text.Document;
import net.colar.netbeans.fan.ast.FanLexAstUtils;
import net.colar.netbeans.fan.ast.FanAstParser;
import net.colar.netbeans.fan.ast.FanRootScope;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.MismatchedRangeException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.UnwantedTokenException;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.api.Severity;
import org.netbeans.modules.csl.spi.DefaultError;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;

/**
 * Represents a "snapshot" of the results of parsing a fan file.
 * @author  tcolar
 */
public class FanParserResult extends ParserResult
{

	List<Error> errors = new Vector<Error>();
	private final String sourceName;
	private ParserRuleReturnScope antlrScope = null;
	private CommonTokenStream tokenStream;
	private FanRootScope rootScope;

	public FanParserResult(Snapshot snapshot, CommonTokenStream tokenStream)
	{
		super(snapshot);
		this.sourceName = snapshot.getSource().getFileObject().getName();
		this.tokenStream = tokenStream;
	}

	/**
	 * Parser will callback this to fill-in ANTLR results
	 * @param scope
	 */
	public void setAntlrScope(ParserRuleReturnScope scope)
	{
		this.antlrScope = scope;
	}

	@Override
	public List<? extends Error> getDiagnostics()
	{
		return errors;
	}

	@Override
	protected void invalidate()
	{
		// what should this do ?
	}

	/**
	 * Add an antlr error to the error list
	 * Try to give a more useful error message to the user.
	 * @param e
	 * @param paraphrase
	 */
	public void addAntlrError(RecognitionException e, Stack<String> paraphrase)
	{
		String location = null;
		if (!paraphrase.isEmpty())
		{
			location = paraphrase.peek();
		}
		Enumeration el = paraphrase.elements();
		//String trace="";
	/*int cpt=0;
		while(el.hasMoreElements())
		{
		trace+=el.nextElement()+" ->";
		cpt++;
		if(cpt%4==0) trace+="\n";
		}*/
		CommonToken token = (CommonToken) e.token;
		String key = "NBFanParser(" + sourceName + ")";
		String desc = "";
		int start = token.getStartIndex();
		int end = token.getStopIndex();
		String loc = location != null ? location : e.token.getText();

		// trying to build some nicer error messages.
		if (e instanceof MissingTokenException)
		{//tested
			MissingTokenException ee = (MissingTokenException) e;
			Object inserted = ee.inserted;
			if (inserted != null && inserted instanceof Token)
			{
				Token tk = (Token) inserted;
				desc = "Was expecting :'" + loc + "', but got '" + tk.getText() + "' instead." + "\n" + desc;
			}
		} else if (e instanceof FailedPredicateException)
		{ // tested
			desc = "Expecting: '" + loc + "' but found: '" + token.getText() + "' instead.";
		} else if (e instanceof MismatchedTokenException)
		{// tested
			desc = "Mismatch, looking for: '" + loc + "' but found: '" + token.getText() + "'";
		} else if (e instanceof EarlyExitException)
		{//tested
			desc = "Missing required item(s) after: " + loc;
		} else if (e instanceof MismatchedRangeException)
		{
			MismatchedRangeException ee = (MismatchedRangeException) e;
			desc = "Unexpected token range-> " + e.getUnexpectedType() + " should be within [" + ee.a + "-" + ee.b + "] at: " + e.token.getText();
		} else if (e instanceof NoViableAltException)
		{//tested
			desc = "Unexpected token: '" + token.getText() + "'";
		} else if (e instanceof UnwantedTokenException)
		{// tested
			desc = "Unwanted token: '" + token.getText() + "' before '" + loc + "'";
		}
		//desc+="\n"+trace;
		desc += "\n" + e.toString();
		Error error = DefaultError.createDefaultError(key, desc, "Syntax Error", null, start, end, e.approximateLineInfo, Severity.ERROR);
		//System.err.println("Adding parsing error: " + key + "| Syntax Error | " + desc + " | " + start + " | " + end + " | " + e.line + " |" + token);
		//e.printStackTrace();
		errors.add(error);
	}

	public void addError(String title, Throwable t)
	{
		Error error = DefaultError.createDefaultError(title, t.toString(), title, null, 0, 0, true, Severity.ERROR);
		errors.add(error);
	}

	/**
	 * Return ANTLR AST tree generated by this parsing
	 * @return
	 */
	public CommonTree getTree()
	{
		if (antlrScope == null)
		{
			return null;
		}
		return (CommonTree) antlrScope.getTree();
	}

	/**
	 * Dump AST tree generated by ANTLR to console (to debug)
	 */
	public void dumpTree()
	{
		System.err.println("-------------------Start AST Tree dump-----------------------");
		CommonTree tree = getTree();
		if (tree != null)
		{
			FanLexAstUtils.dumpTree(tree, 0);
		}
		System.err.println("-------------------End AST Tree dump-----------------------");
	}

	public CommonTokenStream getTokenStream()
	{
		return tokenStream;
	}

	public ParserRuleReturnScope getAntlrScope()
	{
		return antlrScope;
	}

	/**
	 * Shotcut method for getSnapshot().getSource().getDocument(true);
	 * @return
	 */
	public Document getDocument()
	{
		return getSnapshot().getSource().getDocument(true);
	}

	/**
	 * The root scope gets fille in by FanAstParser
	 * @return
	 */
	public FanRootScope getRootScope()
	{
		return rootScope;
	}

	void parseAstScope()
	{
		rootScope = FanAstParser.parseScope(this);
	}
}
