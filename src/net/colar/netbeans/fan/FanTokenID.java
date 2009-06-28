/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.util.Collection;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author thibautc
 */
public class FanTokenID implements TokenId {

    public static final String FAN_MIME_TYPE = "text/x-fan";
    private final String name;
    private final String category;
    private final int ordinal;
    private String fixedText;

    public FanTokenID(String name, int ordinal, String category) {
	this.name = name;
	this.ordinal = ordinal;
	this.category = category;
    }

    public String name() {
	return name;
    }

    public int ordinal() {
	return ordinal;
    }

    public String primaryCategory() {
	return category;
    }

    public void setFixedText(String text) {
	fixedText = text;
    }

    public String getFixedText() {
	return fixedText;
    }
    
    private static final Language<FanTokenID> language = new LanguageHierarchy<FanTokenID>() {

	@Override
	protected String mimeType() {
	    		System.err.println("~~~Fan - getmimetype.");
	    return FAN_MIME_TYPE;
	}

	@Override
	protected Collection<FanTokenID> createTokenIds() {
	    		System.err.println("~~~Fan - create tokens.");

	    return NBFanLexer.getTokenIds();
	}

	@Override
	protected Lexer<FanTokenID> createLexer(LexerRestartInfo<FanTokenID> info) {
		System.err.println("~~~Fan - create lexer()");
	    return new NBFanLexer(info);
	}
    }.language();

    public static Language<FanTokenID> language() {
		System.err.println("~~~Fan - getlangaug().");

	return language;
    }
}
