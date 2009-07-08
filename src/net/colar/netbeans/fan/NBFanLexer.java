/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import net.colar.netbeans.fan.antlr.NetbeansAntlrStream;
import java.util.Collection;
import java.util.Hashtable;
import net.colar.netbeans.fan.antlr.FanLexer;
import net.colar.netbeans.fan.antlr.FanStates;
import org.antlr.runtime.CommonToken;
import org.netbeans.api.lexer.Token;
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
	return tokenIds.values();
    }

    public NBFanLexer(LexerRestartInfo<FanTokenID> info)
    {
	this.info = info;
	NetbeansAntlrStream lexerInputStream = new NetbeansAntlrStream(info.input(), "FanLexer");
	lexer = new FanLexer(lexerInputStream);
    }

    public Token<FanTokenID> nextToken()
    {
         curToken = (CommonToken) lexer.nextToken();

	if(lexer.getTypeOverride()!=-1)
	{
	    curToken.setType(lexer.getTypeOverride());
	    lexer.clearTypeOverride();
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
	/*if (result != null)
	{
	    System.err.println(tk.name() + (result.isFlyweight() ? "(FlyWeight)" : "") + " : " + curToken.getText());
	}*/
	return result;
    }

    public Object state()
    {
	return null;//lexer.getState();
    }

    public void release()
    {
	lexer = null;
	//tokens = null;
    }

    /*private void dealWithUnclosedToken(FanLexer lexer, CommonToken curToken)
    {
	    // try to revover from imcomplete tokens
	    int state = lexer.getState();
	    switch (state)
	    {
		case FanStates.INCOMPLETE_DSL:
		    System.err.println("Unclosed token: "+curToken.getText());

		    curToken.setType(FanLexer.INCOMPLETE_DSL);
		    //lexer.consumeUntil(lexer.getCharStream(), -1);
		    break;
	    }
	    lexer.clearState();
    }*/
}
