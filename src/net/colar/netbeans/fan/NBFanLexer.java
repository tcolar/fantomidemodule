/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan;

import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;
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
    private static HashMap tokenIds=new HashMap();

    static
    {
	FanLexer referenceLexer=new FanLexer();
	String[] tokenNames=referenceLexer.getTokenNames();
	for(int i=0; i!=tokenNames.length; i++)
	{
	    String name=tokenNames[i];
	    //referenceLexer.get
	    //FanTokenID token=new FanTokenID(name, id, "String");
	    //tokenIds.put(new Integer(id),token);
	}
    }

    public static Collection getTokenIds()
    {
	return tokenIds.values();
    }

    public NBFanLexer()
    {
	lexer=new FanLexer();
	tokens = new CommonTokenStream(lexer);
        //TokenFactory fact=new TokenFactory(this);
    }

    public Token nextToken()
    {
	org.antlr.runtime.Token antToken=lexer.nextToken();
	Integer id=new Integer(antToken.getType());
	return (Token)tokenIds.get(id);
    }

    public Object state()
    {
	return new Integer(1);
    }

    public void release()
    {
	lexer=null;
	tokens=null;
	//tokenIds=new Vector();
    }

}
