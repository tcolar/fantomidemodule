/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan;

import net.colar.netbeans.fan.handlers.FanKeyStrokeHandler;
import net.colar.netbeans.fan.structure.FanStructureAnalyzer;
import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.api.KeystrokeHandler;
import org.netbeans.modules.csl.api.StructureScanner;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.parsing.spi.Parser;


/**
 * Primamry Fan language definition
 * Provides "hooks" into various language support implementation
 * * @author thibautc
 */
public class FanLanguage extends DefaultLanguageConfig
{
    // Fan mime Type (used all over)
    public static final String FAN_MIME_TYPE = "text/x-fan";

    public FanLanguage()
    {
	super();
	System.err.println("Fan - init FanLanguage");
    }


    @Override
    public String getDisplayName()
    {
	return "Fan";
    }

    @Override
    public Language getLexerLanguage() {
	return FanTokenID.language();
    }

    @Override
    public String getPreferredExtension()
    {
	return "fan";
    }

    @Override
    public Parser getParser() {
	return new NBFanParser();
    }

    @Override
    public boolean hasStructureScanner()
    {
	return true;
    }

    @Override
    public StructureScanner getStructureScanner()
    {
	return new FanStructureAnalyzer();
    }

    @Override
    public KeystrokeHandler getKeystrokeHandler()
    {
	return new FanKeyStrokeHandler();
    }

}
