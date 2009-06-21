/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan;

import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;


/**
 * * @author thibautc
 */
public class FanLanguage<T extends TokenId> extends DefaultLanguageConfig
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

}
