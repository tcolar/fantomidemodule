/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan;

import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;


/**
 * * @author thibautc
 */
public class FanLanguage extends DefaultLanguageConfig
{

    @Override
    public String getDisplayName()
    {
	return "Fan";
    }

    @Override
    public Language getLexerLanguage()
    {
	return null;
    }

    @Override
    public String getPreferredExtension()
    {
	return ".fan";
    }

}
