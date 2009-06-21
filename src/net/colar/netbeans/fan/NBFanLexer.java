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

/**
 *
 * @author thibautc
 */
public class NBFanLexer implements Lexer{

    private FanLexer lexer=null;
    private CommonTokenStream tokens=null;
    private static Hashtable tokenIds=FanTokens.getTokens();


    public static Collection getTokenIds()
    {
		System.err.println("~~~Fan - gettokenids  nbfanlexer");

	return tokenIds.values();
    }

    public NBFanLexer()
    {
		System.err.println("~~~Fan - init nbfanlexer");

	lexer=new FanLexer();
	//tokens = new CommonTokenStream(lexer);
    }

    public Token nextToken()
    {
	//tokens.
	org.antlr.runtime.Token antlrToken=lexer.nextToken();
	Integer id=new Integer(antlrToken.getType());
	System.err.println("~~~Fan nexttoken:"+id);
	return (Token)tokenIds.get(id);
    }

    public Object state()
    {
	return null;
    }

    public void release()
    {
	lexer=null;
	tokens=null;
    }

}
