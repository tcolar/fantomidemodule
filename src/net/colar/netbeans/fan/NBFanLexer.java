/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import net.colar.netbeans.fan.antlr.NetbeansAntlrStream;
import java.util.Collection;
import java.util.Hashtable;
import net.colar.netbeans.fan.antlr.FanLexer;
import org.antlr.runtime.CommonToken;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 * Lexer implementation
 * Bridges NB lexer with Antlr lexer.
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

	//System.err.println("Token: "+curToken.getType()+" ["+curToken.getStartIndex()+" "+curToken.getStopIndex()+"]\n    : "+curToken.getText());
	return result;
    }

    public Object state()
    {
	return null;
    }

    public void release()
    {
	lexer = null;
	//tokens = null;
    }

}
