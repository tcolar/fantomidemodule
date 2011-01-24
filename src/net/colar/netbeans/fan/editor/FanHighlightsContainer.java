/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.editor;

import java.awt.Color;
import java.util.List;
import java.util.NoSuchElementException;
import javax.swing.text.AttributeSet;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import net.colar.netbeans.fan.FanLanguage;
import net.colar.netbeans.fan.FanUtilities;
import org.netbeans.api.editor.mimelookup.MimeLookup;
import org.netbeans.api.editor.settings.AttributesUtilities;
import org.netbeans.api.editor.settings.FontColorSettings;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.LanguagePath;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenHierarchyEvent;
import org.netbeans.api.lexer.TokenHierarchyListener;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.spi.editor.highlighting.HighlightsSequence;
import org.netbeans.spi.editor.highlighting.support.AbstractHighlightsContainer;
import org.openide.util.WeakListeners;

/**
 * Provided colored background for embedded code (html / javascript)
 * @author tcolar
 */
public class FanHighlightsContainer extends AbstractHighlightsContainer implements TokenHierarchyListener
{

    private final AttributeSet javascriptBackground;
    private final Document document;
    private TokenHierarchy<? extends Document> hierarchy = null;
    private static final String JAVASCRIPT_MIME_TYPE = "text/javascript"; //NOI18N
    private static final String JAVASCRIPT_BACKGROUND_TOKEN_NAME = "javascript-embedded"; //NOI18N
    private long version = 0;
    
    public FanHighlightsContainer(Document document)
    {
        this.document = document;

        //try load the background from html settings
        FontColorSettings fcs = MimeLookup.getLookup(FanLanguage.FAN_MIME_TYPE).lookup(FontColorSettings.class);
        Color jsBC = null;
        if (fcs != null)
        {
            jsBC = getColoring(fcs, JAVASCRIPT_BACKGROUND_TOKEN_NAME);
        }
        
        javascriptBackground = jsBC == null ? SimpleAttributeSet.EMPTY : AttributesUtilities.createImmutable(
                StyleConstants.Background, jsBC,
                ATTR_EXTENDS_EOL, Boolean.TRUE);
    }
    
    @Override
    public HighlightsSequence getHighlights(int startOffset, int endOffset)
    {
        synchronized (this)
        {
            if (javascriptBackground != null)
            {
                if (hierarchy == null)
                {
                    hierarchy = TokenHierarchy.get(document);
                    if (hierarchy != null)
                    {
                        hierarchy.addTokenHierarchyListener(WeakListeners.create(TokenHierarchyListener.class, this, hierarchy));
                    }
                }
                
                if (hierarchy != null)
                {
                    return new Highlights(version, hierarchy, startOffset, endOffset);
                }
            }
            return HighlightsSequence.EMPTY;
        }
    }
    
    public void tokenHierarchyChanged(TokenHierarchyEvent evt)
    {
        fireHighlightsChange(evt.affectedStartOffset(), evt.affectedEndOffset());
    }
    
    private static Color getColoring(FontColorSettings fcs, String tokenName)
    {
        AttributeSet as = fcs.getTokenFontColors(tokenName);
        if (as != null)
        {
            return (Color) as.getAttribute(StyleConstants.Background);
        }
        return null;
    }
    
    private class Highlights implements HighlightsSequence
    {
        
        private final long version;
        private final TokenHierarchy<? extends Document> scanner;
        private final int startOffsetBoundary;
        private final int endOffsetBoundary;
        private List<TokenSequence<?>> tokenSequenceList = null;
        private int startOffset;
        private int endOffset;
        private int realEndOffset;
        private AttributeSet attributeSet;
        private boolean finished = false;
        
        private Highlights(long version, TokenHierarchy<? extends Document> scanner, int startOffset, int endOffset)
        {
            this.version = version;
            this.scanner = scanner;
            this.startOffsetBoundary = startOffset;
            this.endOffsetBoundary = endOffset;
        }
        
        private boolean _moveNext()
        {
            if (tokenSequenceList == null)
            {
                // initialize
                this.startOffset = startOffsetBoundary;
                this.endOffset = startOffsetBoundary;
                this.realEndOffset = startOffsetBoundary;
                
                String mimeType = (String) document.getProperty("mimeType"); //NOI18N
                Language<?> language = Language.find(mimeType);
                if (language != null)
                {
                    //get fan token sequence list
                    LanguagePath topLevelLanguagePath = LanguagePath.get(language);
                    tokenSequenceList = scanner.tokenSequenceList(topLevelLanguagePath, startOffsetBoundary, endOffsetBoundary);
                } else
                {
                    FanUtilities.GENERIC_LOGGER.info("Language " + mimeType + " obtained from the document mimeType property cannot be found!"); //NOI18N
                }
            }
            
            if (tokenSequenceList != null)
            {
                for (TokenSequence tokenSequence : tokenSequenceList)
                {
                    assert tokenSequence.language().mimeType().equals(FanLanguage.FAN_MIME_TYPE);
                    tokenSequence.move(realEndOffset);
                    while (tokenSequence.moveNext() && tokenSequence.offset() < endOffsetBoundary)
                    {
                        TokenSequence eTokenSequence = tokenSequence.embedded();
                        
                        if (eTokenSequence == null || !eTokenSequence.moveNext())
                        {
                            continue;
                        }
                        String embeddedMimeType = eTokenSequence.language().mimeType();
                        if ((JAVASCRIPT_MIME_TYPE).equals(embeddedMimeType))
                        {
                                startOffset = eTokenSequence.offset();
                                do
                                {
                                    endOffset = eTokenSequence.offset() + eTokenSequence.token().length();
                                } while (eTokenSequence.moveNext());
                                
                                realEndOffset = endOffset > realEndOffset ? endOffset : realEndOffset + 1;
                                
                                attributeSet = javascriptBackground;
                                if (attributeSet != null)
                                {
                                    return true;
                                }
                        }
                    }
                }
            }
            
            return false;
        }
        
        @Override
        public boolean moveNext()
        {
            synchronized (FanHighlightsContainer.this)
            {
                if (checkVersion())
                {
                    if (_moveNext())
                    {
                        return true;
                    }
                }
            }
            
            finished = true;
            return false;
        }
        
        @Override
        public int getStartOffset()
        {
            synchronized (FanHighlightsContainer.this)
            {
                if (finished)
                {
                    throw new NoSuchElementException();
                } else
                {
                    assert tokenSequenceList != null : "Sequence not initialized, call moveNext() first."; //NOI18N
                    return startOffset;
                }
            }
        }
        
        @Override
        public int getEndOffset()
        {
            synchronized (FanHighlightsContainer.this)
            {
                if (finished)
                {
                    throw new NoSuchElementException();
                } else
                {
                    assert tokenSequenceList != null : "Sequence not initialized, call moveNext() first."; //NOI18N
                    return endOffset;
                }
            }
        }
        
        @Override
        public AttributeSet getAttributes()
        {
            synchronized (FanHighlightsContainer.this)
            {
                if (finished)
                {
                    throw new NoSuchElementException();
                } else
                {
                    assert tokenSequenceList != null : "Sequence not initialized, call moveNext() first."; //NOI18N
                    return attributeSet;
                }
            }
        }
        
        private boolean checkVersion()
        {
            return this.version == FanHighlightsContainer.this.version;
        }
    }
}
