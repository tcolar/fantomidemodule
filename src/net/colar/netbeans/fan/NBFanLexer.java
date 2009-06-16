/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan;

import net.colar.netbeans.fan.antlr.FanLexer;
import org.antlr.runtime.CommonTokenStream;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.TokenFactory;

/**
 *
 * @author thibautc
 */
public class NBFanLexer implements Lexer{

    private FanLexer lexer=null;
    private CommonTokenStream tokens=null;


    public NBFanLexer()
    {
	lexer=new FanLexer();
	tokens = new CommonTokenStream(lexer);
        //TokenFactory fact=new TokenFactory(this);
    }

    public Token nextToken()
    {
	//tokens.
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object state()
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

    public void release()
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }

}
