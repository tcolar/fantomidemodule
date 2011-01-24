/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.editor;

import net.colar.netbeans.fan.parboiled.FantomLexerTokens.TokenName;
import org.netbeans.api.lexer.InputAttributes;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.LanguagePath;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.LanguageEmbedding;
import org.netbeans.spi.lexer.LanguageProvider;
import org.openide.util.lookup.ServiceProvider;
import org.netbeans.api.editor.mimelookup.MimeLookup;

/**
 * Provide syntax highlighting for DSL's (embedded language)
 * 
 * @author tcolar
 */
@ServiceProvider(service = LanguageProvider.class)
public class FanDslEmbeddingProvider extends LanguageProvider
{

    public static final String DSL_OPEN = "<|";
    public static final String DSL_CLOSE = "|>";
    public static final String TALES_DSL_CLIENT_ID = "client";
    Language jscript;
    //Language html = MimeLookup.getLookup("text/html").lookup(Language.class);

    @Override
    public Language<?> findLanguage(String string)
    {
        return null;
    }

    @Override
    public LanguageEmbedding<?> findLanguageEmbedding(Token<?> token, LanguagePath lp, InputAttributes ia)
    {
        if (jscript == null)
        {
            jscript = MimeLookup.getLookup("text/javascript").lookup(Language.class);
        }
        if (token != null && token.id() != null && token.text() != null && jscript != null)
        {
            if (token.id().name().equalsIgnoreCase(TokenName.DSL.name()))
            {
                if (token.text().toString().startsWith(TALES_DSL_CLIENT_ID + DSL_OPEN))
                {
                    int start = TALES_DSL_CLIENT_ID.length() + DSL_OPEN.length();
                    return LanguageEmbedding.create(jscript, start, DSL_CLOSE.length());
                }
            }
        }
        return null;
    }
}
