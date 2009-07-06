/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan;

import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.parsing.spi.Parser;


/**
 * * @author thibautc
 */
public class FanLanguage extends DefaultLanguageConfig
{
    public FanLanguage()
    {
	super();
	System.err.println("~~~Fan - init FanLanguage");
    }


    @Override
    public String getDisplayName()
    {
	return "Fan";
    }

    @Override
    public Language getLexerLanguage() {
	System.err.println("~~~Fan - getlexerlang.");
	return FanTokenID.language();
    }

    @Override
    public String getPreferredExtension()
    {
	System.err.println("~~~Fan - getprefext.");
	return "fan";
    }

    @Override
    public Parser getParser() {
	return new NBFanParser();
    }

}
