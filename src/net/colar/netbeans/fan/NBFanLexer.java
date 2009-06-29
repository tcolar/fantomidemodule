/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.util.Collection;
import java.util.Hashtable;
import net.colar.netbeans.fan.antlr.FanLexer;
import net.colar.netbeans.fan.antlr.FanStates;
import org.antlr.runtime.CommonToken;
import org.netbeans.api.lexer.Token;
import org.netbeans.lib.lexer.TokenHierarchyOperation;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author thibautc
 */
public class NBFanLexer implements Lexer<FanTokenID>
{

    private FanLexer lexer = null;
    //private CommonTokenStream tokens = null;
    private static Hashtable<Integer, FanTokenID> tokenIds = FanTokens.getTokens();
    private LexerRestartInfo<FanTokenID> info;
    private CommonToken curToken;

    public static Collection<FanTokenID> getTokenIds()
    {
	System.err.println("~~~Fan - gettokenids  nbfanlexer");

	return tokenIds.values();
    }

    public NBFanLexer(LexerRestartInfo<FanTokenID> info)
    {
	this.info = info;
	System.err.println("~~~Fan - init nbfanlexer");
	NetbeansAntlrStream lexerInputStream = new NetbeansAntlrStream(info.input(), "FanLexer");
	lexer = new FanLexer(lexerInputStream);
	//tokens = new CommonTokenStream(lexer);
    }

    public Token<FanTokenID> nextToken()
    {
	try
	{
	    curToken = (CommonToken) lexer.nextToken();
	} catch (Exception e)
	{
	    recoverError(lexer, curToken);
	}
	Integer id = new Integer(curToken.getType());
	FanTokenID tk = tokenIds.get(id);
	Token<FanTokenID> result = null;
	if (tk != null)
	{
	    result = null;

	    if (tk.getFixedText() != null)
	    {
		result = info.tokenFactory().getFlyweightToken(tk, tk.getFixedText());
	    } else
	    {
		result = info.tokenFactory().createToken(tk);
	    }
	}
	if (result != null)
	{
	    System.err.println(tk.name() + (result.isFlyweight() ? "(FlyWeight)" : "") + " : " + curToken.getText());
	}
	return result;
    }

    public Object state()
    {
	return lexer.getState();
    }

    public void release()
    {
	lexer = null;
	//tokens = null;
    }

    private void recoverError(FanLexer lexer, CommonToken curToken)
    {
	    // try to revover from imcomplete tokens
	    int incomplete;
	    int state = lexer.getState();
	    switch (state)
	    {
		case FanStates.INCOMPLETE_DSL:
		    incomplete = FanLexer.INCOMPLETE_DSL;
		    break;

		default:
		    throw new IllegalStateException(); // unhandled case

	    }
	    lexer.clearState();

	    curToken.setType(incomplete);
    }
}
