/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.util.Collection;
import java.util.Hashtable;
import net.colar.netbeans.fan.antlr.FanLexer;
import org.antlr.runtime.CommonTokenStream;
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
    private CommonTokenStream tokens = null;
    private static Hashtable<Integer, FanTokenID> tokenIds = FanTokens.getTokens();
    private LexerRestartInfo<FanTokenID> info;

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
	org.antlr.runtime.Token antlrToken = lexer.nextToken();
	Integer id = new Integer(antlrToken.getType());
	System.err.println("~~~Fan nexttoken:" + id);
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
	    System.err.println("Token id: " + result.text() + " / " + result.isFlyweight() + " / " + result.id() + " / " + tk.name());
	}
	return result;
    }

    public Object state()
    {
	return null;
    }

    public void release()
    {
	lexer = null;
	tokens = null;
    }
}
