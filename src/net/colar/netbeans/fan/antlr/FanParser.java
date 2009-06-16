// $ANTLR 3.1.2 src/net/colar/netbeans/fan/antlr/Fan.g 2009-06-16 15:21:36
package net.colar.netbeans.fan.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FanParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KW_BREAK", "KW_CONTINUE", "KW_FOR", "KW_IF", "KW_RETURN", "KW_SWITCH", "KW_THROW", "KW_WHILE", "KW_TRY", "KW_CASE", "KW_DEFAULT", "KW_CATCH", "KW_FINALLY", "KW_USING", "KW_AS", "KW_RD_ONLY", "KW_CONST", "KW_STATIC", "KW_NATIVE", "KW_VOLATILE", "KW_OVERRIDE", "KW_VIRTUAL", "KW_FINAL", "KW_VOID", "KW_CLASS", "KW_ENUM", "KW_MIXIN", "KW_ABSTRACT", "KW_PRIVATE", "KW_PROTECTED", "KW_PUBLIC", "KW_INTERNAL", "KW_NEW", "KW_ONCE", "KW_THIS", "KW_SUPER", "KW_ELSE", "KW_IS", "KW_ISNOT", "KW_NULL", "KW_IT", "KW_TRUE", "KW_FALSE", "SP_COLCOL", "DOT", "SQ_BRACKET_L", "SQ_BRACKET_R", "BRACKET_L", "BRACKET_R", "SP_COLON", "SP_COMMA", "PAR_L", "PAR_R", "SP_QMARK", "LIST_TYPE", "SP_PIPE", "OP_ARROW", "AS_INIT_VAL", "SP_SEMI", "AS_EQUAL", "AS_ASSIGN_OP", "OP_OR", "OP_AND", "CP_EQUALITY", "CP_COMPARATORS", "OP_ELVIS", "OP_RANG_EXCL_OLD", "OP_RANGE_EXCL", "OP_RANGE", "OP_BITOR", "OP_CURRY", "OP_LSHIFT", "OP_RSHIFT", "OP_PLUS", "OP_MINUS", "OP_MULTI", "OP_DIV", "OP_MOD", "OP_BANG", "OP_2PLUS", "OP_2MINUS", "OP_TILDA", "DSL", "OP_SAFE_CALL", "OP_SAFEDYN_CALL", "AT", "ID", "QUOTSTR", "STR", "URI", "CHAR", "OP_POUND", "DOC", "NUMBER", "LB", "WS", "LINE_COMMENT", "EXEC_COMMENT", "MULTI_COMMENT", "DIGIT", "HEXLETTER", "KEYWORD", "UNDERSCORE", "HEX_HEADER", "HEXNB", "DECIMAL", "FRACTIONAL", "HEXHEADER", "FRACTION", "EXPONENT", "NBTYPE", "LETTER"
    };
    public static final int HEX_HEADER=107;
    public static final int AS_INIT_VAL=61;
    public static final int OP_MULTI=79;
    public static final int NUMBER=97;
    public static final int QUOTSTR=91;
    public static final int KW_DEFAULT=14;
    public static final int OP_ELVIS=69;
    public static final int OP_2MINUS=84;
    public static final int FRACTION=112;
    public static final int OP_MOD=81;
    public static final int KW_NULL=43;
    public static final int KW_ISNOT=42;
    public static final int KW_BREAK=4;
    public static final int OP_LSHIFT=75;
    public static final int DOT=48;
    public static final int CP_COMPARATORS=68;
    public static final int PAR_R=56;
    public static final int OP_BITOR=73;
    public static final int KW_ENUM=29;
    public static final int OP_ARROW=60;
    public static final int OP_TILDA=85;
    public static final int EXEC_COMMENT=101;
    public static final int KW_CONST=20;
    public static final int HEXNB=108;
    public static final int OP_BANG=82;
    public static final int AT=89;
    public static final int LIST_TYPE=58;
    public static final int OP_SAFE_CALL=87;
    public static final int KW_VOLATILE=23;
    public static final int OP_DIV=80;
    public static final int DSL=86;
    public static final int WS=99;
    public static final int CHAR=94;
    public static final int KW_RETURN=8;
    public static final int OP_RANGE=72;
    public static final int SP_SEMI=62;
    public static final int OP_SAFEDYN_CALL=88;
    public static final int SP_COLON=53;
    public static final int SP_COMMA=54;
    public static final int KW_PRIVATE=32;
    public static final int OP_POUND=95;
    public static final int LINE_COMMENT=100;
    public static final int KW_OVERRIDE=24;
    public static final int KW_IS=41;
    public static final int HEXLETTER=104;
    public static final int KW_THROW=10;
    public static final int KW_PUBLIC=34;
    public static final int KW_ABSTRACT=31;
    public static final int OP_RANGE_EXCL=71;
    public static final int KW_INTERNAL=35;
    public static final int OP_MINUS=78;
    public static final int LB=98;
    public static final int OP_CURRY=74;
    public static final int KW_TRY=12;
    public static final int FRACTIONAL=110;
    public static final int KW_CLASS=28;
    public static final int HEXHEADER=111;
    public static final int UNDERSCORE=106;
    public static final int KW_SWITCH=9;
    public static final int KW_VOID=27;
    public static final int SP_QMARK=57;
    public static final int SP_PIPE=59;
    public static final int NBTYPE=114;
    public static final int KW_USING=17;
    public static final int KW_FALSE=46;
    public static final int KW_FOR=6;
    public static final int SQ_BRACKET_L=49;
    public static final int KW_IT=44;
    public static final int KW_FINAL=26;
    public static final int DOC=96;
    public static final int KW_VIRTUAL=25;
    public static final int KW_TRUE=45;
    public static final int DECIMAL=109;
    public static final int URI=93;
    public static final int KW_THIS=38;
    public static final int PAR_L=55;
    public static final int OP_OR=65;
    public static final int OP_PLUS=77;
    public static final int KW_CASE=13;
    public static final int KW_ELSE=40;
    public static final int BRACKET_L=51;
    public static final int KW_CONTINUE=5;
    public static final int OP_RSHIFT=76;
    public static final int DIGIT=103;
    public static final int KW_MIXIN=30;
    public static final int KW_FINALLY=16;
    public static final int ID=90;
    public static final int LETTER=115;
    public static final int AS_EQUAL=63;
    public static final int KEYWORD=105;
    public static final int KW_NEW=36;
    public static final int KW_STATIC=21;
    public static final int KW_RD_ONLY=19;
    public static final int KW_AS=18;
    public static final int AS_ASSIGN_OP=64;
    public static final int MULTI_COMMENT=102;
    public static final int STR=92;
    public static final int BRACKET_R=52;
    public static final int KW_SUPER=39;
    public static final int OP_AND=66;
    public static final int KW_CATCH=15;
    public static final int KW_ONCE=37;
    public static final int KW_WHILE=11;
    public static final int KW_PROTECTED=33;
    public static final int EXPONENT=113;
    public static final int EOF=-1;
    public static final int SP_COLCOL=47;
    public static final int OP_2PLUS=83;
    public static final int SQ_BRACKET_R=50;
    public static final int CP_EQUALITY=67;
    public static final int OP_RANG_EXCL_OLD=70;
    public static final int KW_IF=7;
    public static final int KW_NATIVE=22;

    // delegates
    // delegators


        public FanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[376+1];
             
             
        }
        

    public String[] getTokenNames() { return FanParser.tokenNames; }
    public String getGrammarFileName() { return "src/net/colar/netbeans/fan/antlr/Fan.g"; }


    	/*
           		Thibaut. C
           		 This looks for a linebreak/newline, which are usually ignored (hidden channel)
       	      	Yet in other case they are meaningful (IE: end of expression)
         		index is the index of the current "next non-hidden" token, what that means is that it will
           		have skipped the linebreaks and be pointing at the NEXT token after the line breaks
           		So we need to look BACKWARD at the hidden tokens to check for newLine.
           		Note that the hiden tokens might include other things like tabs or whitespace that does not qualify
        	*/
          	private boolean lookupNL()
           	{
           		int index=input.index();
    		int start=input.mark();
    		if(index < input.size())
    		{
    			// Always allowing comma as end of line might be a bit too "loose"
    			// it's neeed for itBlocks Add feature
    			// maybe i shoul match only when in an itBlock ?
    			if(input.get(index).getType() == SP_COMMA)
    				return true;
    			// if next token is a BRACKET_R, that counts as a newline
    			if(input.get(index).getType() == BRACKET_R)
    				return true;
    		}
     		Token token;
    		boolean result=false;
    		while (index > 0)
    		{
    			// look back in the hidden channel until we find a linebreak
    			index--;
    			token = input.get(index);
    			if (token.getChannel() != Token.HIDDEN_CHANNEL)
    			{
    				/* We are out of the hidden channel, in other word we found a "real" item,
    				which means we didn't find a linebreak, so we are done (false)
    				*/
    				break;
    			}
    			if (token.getType() == LB)
    			{
    				// found our LineBreak (true)
    				result=true;
    				break;
    			}
    		}
    		if(index==0)
    			result=true;
    		input.rewind(start);
    		return result;
        	}

        	/**
        	Some items ("(" "[") cannot be preceded by an EndOfLine in an expression
        	*/
        	private boolean notAfterEol()
        	{
           		int index=input.index();
    		int start=input.mark();
     		Token token;
    		boolean result=false;
    		while (index > 0)
    		{
    			index--;
    			token = input.get(index);
    			if (token.getChannel() != Token.HIDDEN_CHANNEL)
    			{
    				result=true;
    				break;
    			}
    			if (token.getType() == LB)
    			{
    				result=false;
    				break;
    			}
    		}
    		input.rewind(start);
    		return result;
        	}



    // $ANTLR start "prog"
    // src/net/colar/netbeans/fan/antlr/Fan.g:172:1: prog : ( using )* ( typeDef )* docs EOF ;
    public final void prog() throws RecognitionException {
        int prog_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:172:7: ( ( using )* ( typeDef )* docs EOF )
            // src/net/colar/netbeans/fan/antlr/Fan.g:172:11: ( using )* ( typeDef )* docs EOF
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:172:11: ( using )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KW_USING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: using
            	    {
            	    pushFollow(FOLLOW_using_in_prog325);
            	    using();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:172:18: ( typeDef )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: typeDef
            	    {
            	    pushFollow(FOLLOW_typeDef_in_prog328);
            	    typeDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_docs_in_prog331);
            docs();

            state._fsp--;
            if (state.failed) return ;
            match(input,EOF,FOLLOW_EOF_in_prog333); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "using"
    // src/net/colar/netbeans/fan/antlr/Fan.g:173:1: using : ( usingPod | usingType | usingAs ) ;
    public final void using() throws RecognitionException {
        int using_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:173:8: ( ( usingPod | usingType | usingAs ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:173:10: ( usingPod | usingType | usingAs )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:173:10: ( usingPod | usingType | usingAs )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:173:11: usingPod
                    {
                    pushFollow(FOLLOW_usingPod_in_using342);
                    usingPod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:173:22: usingType
                    {
                    pushFollow(FOLLOW_usingType_in_using346);
                    usingType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:173:34: usingAs
                    {
                    pushFollow(FOLLOW_usingAs_in_using350);
                    usingAs();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, using_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "using"


    // $ANTLR start "usingPod"
    // src/net/colar/netbeans/fan/antlr/Fan.g:174:1: usingPod : KW_USING podSpec eos ;
    public final void usingPod() throws RecognitionException {
        int usingPod_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:175:3: ( KW_USING podSpec eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:175:5: KW_USING podSpec eos
            {
            match(input,KW_USING,FOLLOW_KW_USING_in_usingPod360); if (state.failed) return ;
            pushFollow(FOLLOW_podSpec_in_usingPod362);
            podSpec();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_usingPod364);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, usingPod_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "usingPod"


    // $ANTLR start "usingType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:176:1: usingType : KW_USING podSpec SP_COLCOL id eos ;
    public final void usingType() throws RecognitionException {
        int usingType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:177:3: ( KW_USING podSpec SP_COLCOL id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:177:5: KW_USING podSpec SP_COLCOL id eos
            {
            match(input,KW_USING,FOLLOW_KW_USING_in_usingType374); if (state.failed) return ;
            pushFollow(FOLLOW_podSpec_in_usingType376);
            podSpec();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingType378); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_usingType380);
            id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_usingType382);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, usingType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "usingType"


    // $ANTLR start "usingAs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:178:1: usingAs : KW_USING podSpec SP_COLCOL id KW_AS id eos ;
    public final void usingAs() throws RecognitionException {
        int usingAs_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:178:10: ( KW_USING podSpec SP_COLCOL id KW_AS id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:178:12: KW_USING podSpec SP_COLCOL id KW_AS id eos
            {
            match(input,KW_USING,FOLLOW_KW_USING_in_usingAs390); if (state.failed) return ;
            pushFollow(FOLLOW_podSpec_in_usingAs392);
            podSpec();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingAs394); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_usingAs396);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,KW_AS,FOLLOW_KW_AS_in_usingAs398); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_usingAs400);
            id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_usingAs402);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, usingAs_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "usingAs"


    // $ANTLR start "podSpec"
    // src/net/colar/netbeans/fan/antlr/Fan.g:179:1: podSpec : ( ffi )? id ( DOT id )* ;
    public final void podSpec() throws RecognitionException {
        int podSpec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:179:10: ( ( ffi )? id ( DOT id )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:179:12: ( ffi )? id ( DOT id )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:179:12: ( ffi )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SQ_BRACKET_L) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ffi
                    {
                    pushFollow(FOLLOW_ffi_in_podSpec410);
                    ffi();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_podSpec413);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:179:20: ( DOT id )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DOT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:179:21: DOT id
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_podSpec416); if (state.failed) return ;
            	    pushFollow(FOLLOW_id_in_podSpec418);
            	    id();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, podSpec_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "podSpec"


    // $ANTLR start "ffi"
    // src/net/colar/netbeans/fan/antlr/Fan.g:180:1: ffi : SQ_BRACKET_L id SQ_BRACKET_R ;
    public final void ffi() throws RecognitionException {
        int ffi_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:180:7: ( SQ_BRACKET_L id SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:180:9: SQ_BRACKET_L id SQ_BRACKET_R
            {
            match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_ffi429); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_ffi431);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_ffi433); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, ffi_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ffi"


    // $ANTLR start "typeDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:182:1: typeDef : docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) ;
    public final void typeDef() throws RecognitionException {
        int typeDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:182:10: ( docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:182:12: docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            {
            pushFollow(FOLLOW_docs_in_typeDef442);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:182:17: ( facet )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==AT) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==ID) ) {
                        int LA6_3 = input.LA(3);

                        if ( (synpred7_Fan()) ) {
                            alt6=1;
                        }


                    }


                }


                switch (alt6) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_typeDef444);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:182:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:182:25: ( ( classFlags )* KW_CLASS )=> classDef
                    {
                    pushFollow(FOLLOW_classDef_in_typeDef455);
                    classDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:183:4: ( ( protection )? KW_ENUM )=> enumDef
                    {
                    pushFollow(FOLLOW_enumDef_in_typeDef469);
                    enumDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:183:37: mixinDef
                    {
                    pushFollow(FOLLOW_mixinDef_in_typeDef473);
                    mixinDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, typeDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeDef"


    // $ANTLR start "classDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:184:1: classDef : classHeader classBody ;
    public final void classDef() throws RecognitionException {
        int classDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:184:11: ( classHeader classBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:184:15: classHeader classBody
            {
            pushFollow(FOLLOW_classHeader_in_classDef484);
            classHeader();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_classBody_in_classDef486);
            classBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, classDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classDef"


    // $ANTLR start "classHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:185:1: classHeader : docs ( facet )* ( classFlags )* KW_CLASS id ( inheritance )? ;
    public final void classHeader() throws RecognitionException {
        int classHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:185:13: ( docs ( facet )* ( classFlags )* KW_CLASS id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:185:15: docs ( facet )* ( classFlags )* KW_CLASS id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_classHeader493);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:185:20: ( facet )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_classHeader495);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:185:27: ( classFlags )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=KW_CONST && LA9_0<=KW_STATIC)||LA9_0==KW_FINAL||(LA9_0>=KW_ABSTRACT && LA9_0<=KW_INTERNAL)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: classFlags
            	    {
            	    pushFollow(FOLLOW_classFlags_in_classHeader498);
            	    classFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,KW_CLASS,FOLLOW_KW_CLASS_in_classHeader501); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_classHeader503);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:185:51: ( inheritance )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SP_COLON) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_classHeader505);
                    inheritance();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, classHeader_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classHeader"


    // $ANTLR start "classFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:186:1: classFlags : ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC );
    public final void classFlags() throws RecognitionException {
        int classFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:186:13: ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC )
            int alt11=5;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt11=1;
                }
                break;
            case KW_ABSTRACT:
                {
                alt11=2;
                }
                break;
            case KW_FINAL:
                {
                alt11=3;
                }
                break;
            case KW_CONST:
                {
                alt11=4;
                }
                break;
            case KW_STATIC:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:186:15: protection
                    {
                    pushFollow(FOLLOW_protection_in_classFlags514);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:186:28: KW_ABSTRACT
                    {
                    match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_classFlags518); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:186:42: KW_FINAL
                    {
                    match(input,KW_FINAL,FOLLOW_KW_FINAL_in_classFlags522); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:186:53: KW_CONST
                    {
                    match(input,KW_CONST,FOLLOW_KW_CONST_in_classFlags526); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:186:64: KW_STATIC
                    {
                    match(input,KW_STATIC,FOLLOW_KW_STATIC_in_classFlags530); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, classFlags_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classFlags"


    // $ANTLR start "classBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:187:1: classBody : BRACKET_L ( slotDef )* BRACKET_R ;
    public final void classBody() throws RecognitionException {
        int classBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:187:12: ( BRACKET_L ( slotDef )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:187:14: BRACKET_L ( slotDef )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_classBody538); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:187:24: ( slotDef )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=KW_RD_ONLY && LA12_0<=KW_VOID)||(LA12_0>=KW_ABSTRACT && LA12_0<=KW_ONCE)||LA12_0==SQ_BRACKET_L||LA12_0==SP_PIPE||(LA12_0>=AT && LA12_0<=ID)||LA12_0==DOC) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_classBody540);
            	    slotDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_classBody543); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, classBody_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classBody"


    // $ANTLR start "protection"
    // src/net/colar/netbeans/fan/antlr/Fan.g:188:1: protection : ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL );
    public final void protection() throws RecognitionException {
        int protection_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:188:12: ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            if ( (input.LA(1)>=KW_PRIVATE && input.LA(1)<=KW_INTERNAL) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, protection_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "protection"


    // $ANTLR start "mixinDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:189:1: mixinDef : mixinHeader mixinBody ;
    public final void mixinDef() throws RecognitionException {
        int mixinDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:189:10: ( mixinHeader mixinBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:189:12: mixinHeader mixinBody
            {
            pushFollow(FOLLOW_mixinHeader_in_mixinDef569);
            mixinHeader();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_mixinBody_in_mixinDef571);
            mixinBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, mixinDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mixinDef"


    // $ANTLR start "mixinHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:190:1: mixinHeader : docs ( facet )* ( mixinFlags )* KW_MIXIN id ( inheritance )? ;
    public final void mixinHeader() throws RecognitionException {
        int mixinHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:190:13: ( docs ( facet )* ( mixinFlags )* KW_MIXIN id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:190:15: docs ( facet )* ( mixinFlags )* KW_MIXIN id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_mixinHeader578);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:190:20: ( facet )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_mixinHeader580);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:190:27: ( mixinFlags )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=KW_CONST && LA14_0<=KW_STATIC)||LA14_0==KW_FINAL||(LA14_0>=KW_PRIVATE && LA14_0<=KW_INTERNAL)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: mixinFlags
            	    {
            	    pushFollow(FOLLOW_mixinFlags_in_mixinHeader583);
            	    mixinFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,KW_MIXIN,FOLLOW_KW_MIXIN_in_mixinHeader586); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_mixinHeader588);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:190:51: ( inheritance )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==SP_COLON) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_mixinHeader590);
                    inheritance();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, mixinHeader_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mixinHeader"


    // $ANTLR start "mixinFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:191:1: mixinFlags : ( protection | KW_CONST | KW_STATIC | KW_FINAL );
    public final void mixinFlags() throws RecognitionException {
        int mixinFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:191:12: ( protection | KW_CONST | KW_STATIC | KW_FINAL )
            int alt16=4;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt16=1;
                }
                break;
            case KW_CONST:
                {
                alt16=2;
                }
                break;
            case KW_STATIC:
                {
                alt16=3;
                }
                break;
            case KW_FINAL:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:191:14: protection
                    {
                    pushFollow(FOLLOW_protection_in_mixinFlags598);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:191:27: KW_CONST
                    {
                    match(input,KW_CONST,FOLLOW_KW_CONST_in_mixinFlags602); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:191:38: KW_STATIC
                    {
                    match(input,KW_STATIC,FOLLOW_KW_STATIC_in_mixinFlags606); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:191:50: KW_FINAL
                    {
                    match(input,KW_FINAL,FOLLOW_KW_FINAL_in_mixinFlags610); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, mixinFlags_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mixinFlags"


    // $ANTLR start "mixinBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:192:1: mixinBody : BRACKET_L ( slotDef )* BRACKET_R ;
    public final void mixinBody() throws RecognitionException {
        int mixinBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:192:11: ( BRACKET_L ( slotDef )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:192:13: BRACKET_L ( slotDef )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_mixinBody617); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:192:23: ( slotDef )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=KW_RD_ONLY && LA17_0<=KW_VOID)||(LA17_0>=KW_ABSTRACT && LA17_0<=KW_ONCE)||LA17_0==SQ_BRACKET_L||LA17_0==SP_PIPE||(LA17_0>=AT && LA17_0<=ID)||LA17_0==DOC) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_mixinBody619);
            	    slotDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_mixinBody622); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, mixinBody_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mixinBody"


    // $ANTLR start "enumDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:193:1: enumDef : enumHeader enumBody ;
    public final void enumDef() throws RecognitionException {
        int enumDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:193:10: ( enumHeader enumBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:193:12: enumHeader enumBody
            {
            pushFollow(FOLLOW_enumHeader_in_enumDef630);
            enumHeader();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_enumBody_in_enumDef632);
            enumBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, enumDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumDef"


    // $ANTLR start "enumHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:194:1: enumHeader : docs ( facet )* ( protection )? KW_ENUM id ( inheritance )? ;
    public final void enumHeader() throws RecognitionException {
        int enumHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:194:12: ( docs ( facet )* ( protection )? KW_ENUM id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:194:17: docs ( facet )* ( protection )? KW_ENUM id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_enumHeader642);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:194:22: ( facet )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==AT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_enumHeader644);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:194:29: ( protection )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=KW_PRIVATE && LA19_0<=KW_INTERNAL)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    {
                    pushFollow(FOLLOW_protection_in_enumHeader647);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,KW_ENUM,FOLLOW_KW_ENUM_in_enumHeader650); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_enumHeader652);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:194:52: ( inheritance )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==SP_COLON) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_enumHeader654);
                    inheritance();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, enumHeader_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumHeader"


    // $ANTLR start "enumBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:195:1: enumBody : BRACKET_L enumValDefs ( slotDef )* BRACKET_R ;
    public final void enumBody() throws RecognitionException {
        int enumBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:195:10: ( BRACKET_L enumValDefs ( slotDef )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:195:12: BRACKET_L enumValDefs ( slotDef )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_enumBody662); if (state.failed) return ;
            pushFollow(FOLLOW_enumValDefs_in_enumBody664);
            enumValDefs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:195:34: ( slotDef )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=KW_RD_ONLY && LA21_0<=KW_VOID)||(LA21_0>=KW_ABSTRACT && LA21_0<=KW_ONCE)||LA21_0==SQ_BRACKET_L||LA21_0==SP_PIPE||(LA21_0>=AT && LA21_0<=ID)||LA21_0==DOC) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_enumBody666);
            	    slotDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_enumBody669); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, enumBody_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumBody"


    // $ANTLR start "inheritance"
    // src/net/colar/netbeans/fan/antlr/Fan.g:196:1: inheritance : SP_COLON typeList ;
    public final void inheritance() throws RecognitionException {
        int inheritance_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:196:14: ( SP_COLON typeList )
            // src/net/colar/netbeans/fan/antlr/Fan.g:196:16: SP_COLON typeList
            {
            match(input,SP_COLON,FOLLOW_SP_COLON_in_inheritance678); if (state.failed) return ;
            pushFollow(FOLLOW_typeList_in_inheritance680);
            typeList();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, inheritance_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "inheritance"


    // $ANTLR start "enumValDefs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:197:1: enumValDefs : enumValDef ( SP_COMMA enumValDef )* eos ;
    public final void enumValDefs() throws RecognitionException {
        int enumValDefs_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:197:14: ( enumValDef ( SP_COMMA enumValDef )* eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:197:16: enumValDef ( SP_COMMA enumValDef )* eos
            {
            pushFollow(FOLLOW_enumValDef_in_enumValDefs688);
            enumValDef();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:197:27: ( SP_COMMA enumValDef )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==SP_COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:197:28: SP_COMMA enumValDef
            	    {
            	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_enumValDefs691); if (state.failed) return ;
            	    pushFollow(FOLLOW_enumValDef_in_enumValDefs694);
            	    enumValDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            pushFollow(FOLLOW_eos_in_enumValDefs698);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, enumValDefs_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumValDefs"


    // $ANTLR start "enumValDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:198:1: enumValDef : docs id ( PAR_L ( args )? PAR_R )? ;
    public final void enumValDef() throws RecognitionException {
        int enumValDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:198:13: ( docs id ( PAR_L ( args )? PAR_R )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:198:15: docs id ( PAR_L ( args )? PAR_R )?
            {
            pushFollow(FOLLOW_docs_in_enumValDef706);
            docs();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_enumValDef708);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:198:23: ( PAR_L ( args )? PAR_R )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==PAR_L) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:198:24: PAR_L ( args )? PAR_R
                    {
                    match(input,PAR_L,FOLLOW_PAR_L_in_enumValDef711); if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:198:30: ( args )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=KW_THIS && LA23_0<=KW_SUPER)||(LA23_0>=KW_NULL && LA23_0<=KW_FALSE)||LA23_0==SQ_BRACKET_L||LA23_0==PAR_L||LA23_0==SP_PIPE||LA23_0==OP_CURRY||(LA23_0>=OP_PLUS && LA23_0<=OP_MINUS)||(LA23_0>=OP_BANG && LA23_0<=OP_TILDA)||(LA23_0>=AT && LA23_0<=OP_POUND)||LA23_0==NUMBER) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                            {
                            pushFollow(FOLLOW_args_in_enumValDef713);
                            args();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,PAR_R,FOLLOW_PAR_R_in_enumValDef716); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, enumValDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumValDef"


    // $ANTLR start "typeList"
    // src/net/colar/netbeans/fan/antlr/Fan.g:199:1: typeList : type ( SP_COMMA type )* ;
    public final void typeList() throws RecognitionException {
        int typeList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:199:10: ( type ( SP_COMMA type )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:199:14: type ( SP_COMMA type )*
            {
            pushFollow(FOLLOW_type_in_typeList727);
            type();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:199:19: ( SP_COMMA type )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==SP_COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:199:20: SP_COMMA type
            	    {
            	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_typeList730); if (state.failed) return ;
            	    pushFollow(FOLLOW_type_in_typeList732);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, typeList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeList"


    // $ANTLR start "type"
    // src/net/colar/netbeans/fan/antlr/Fan.g:201:1: type : typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ;
    public final void type() throws RecognitionException {
        int type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:201:14: ( typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:201:18: typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )*
            {
            pushFollow(FOLLOW_typeRoot_in_type752);
            typeRoot();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:201:28: ( SP_QMARK )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==SP_QMARK) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred38_Fan()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type755); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:201:38: ( LIST_TYPE ( SP_QMARK )? )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==LIST_TYPE) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred40_Fan()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:201:39: LIST_TYPE ( SP_QMARK )?
            	    {
            	    match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_type759); if (state.failed) return ;
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:201:49: ( SP_QMARK )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==SP_QMARK) ) {
            	        int LA27_1 = input.LA(2);

            	        if ( (synpred39_Fan()) ) {
            	            alt27=1;
            	        }
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type761); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "nonMapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:202:1: nonMapType : ( funcType | simpleType );
    public final void nonMapType() throws RecognitionException {
        int nonMapType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:202:12: ( funcType | simpleType )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==SP_PIPE) ) {
                alt29=1;
            }
            else if ( (LA29_0==ID) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:202:14: funcType
                    {
                    pushFollow(FOLLOW_funcType_in_nonMapType772);
                    funcType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:202:25: simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_nonMapType776);
                    simpleType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, nonMapType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "nonMapType"


    // $ANTLR start "typeRoot"
    // src/net/colar/netbeans/fan/antlr/Fan.g:203:1: typeRoot : ( mapType | nonMapType );
    public final void typeRoot() throws RecognitionException {
        int typeRoot_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:203:10: ( mapType | nonMapType )
            int alt30=2;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                alt30=1;
                }
                break;
            case SP_PIPE:
                {
                int LA30_2 = input.LA(2);

                if ( (synpred42_Fan()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA30_3 = input.LA(2);

                if ( (synpred42_Fan()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:203:12: mapType
                    {
                    pushFollow(FOLLOW_mapType_in_typeRoot783);
                    mapType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:203:22: nonMapType
                    {
                    pushFollow(FOLLOW_nonMapType_in_typeRoot787);
                    nonMapType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, typeRoot_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeRoot"


    // $ANTLR start "simpleType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:204:1: simpleType : id ( SP_COLCOL id )? ;
    public final void simpleType() throws RecognitionException {
        int simpleType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:204:17: ( id ( SP_COLCOL id )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:204:21: id ( SP_COLCOL id )?
            {
            pushFollow(FOLLOW_id_in_simpleType801);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:204:24: ( SP_COLCOL id )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SP_COLCOL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:204:25: SP_COLCOL id
                    {
                    match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_simpleType804); if (state.failed) return ;
                    pushFollow(FOLLOW_id_in_simpleType806);
                    id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, simpleType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "simpleType"


    // $ANTLR start "mapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:206:1: mapType : ( SQ_BRACKET_L )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( SQ_BRACKET_R )? ;
    public final void mapType() throws RecognitionException {
        int mapType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:206:10: ( ( SQ_BRACKET_L )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( SQ_BRACKET_R )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:206:12: ( SQ_BRACKET_L )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( SQ_BRACKET_R )?
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:206:12: ( SQ_BRACKET_L )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==SQ_BRACKET_L) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SQ_BRACKET_L
                    {
                    match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_mapType817); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_nonMapType_in_mapType820);
            nonMapType();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:206:37: ( SP_QMARK )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==SP_QMARK) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType822); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:206:47: ( LIST_TYPE ( SP_QMARK )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LIST_TYPE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:206:48: LIST_TYPE ( SP_QMARK )?
            	    {
            	    match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_mapType826); if (state.failed) return ;
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:206:58: ( SP_QMARK )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==SP_QMARK) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType828); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:207:5: ({...}? SP_COLON {...}? type )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==SP_COLON) ) {
                    int LA36_2 = input.LA(2);

                    if ( ((synpred48_Fan()&&(notAfterEol()))) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:207:6: {...}? SP_COLON {...}? type
            	    {
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    match(input,SP_COLON,FOLLOW_SP_COLON_in_mapType840); if (state.failed) return ;
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    pushFollow(FOLLOW_type_in_mapType844);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:207:56: ( SQ_BRACKET_R )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==SQ_BRACKET_R) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred49_Fan()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SQ_BRACKET_R
                    {
                    match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_mapType848); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, mapType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mapType"


    // $ANTLR start "funcType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:208:1: funcType : SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE ;
    public final void funcType() throws RecognitionException {
        int funcType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:208:11: ( SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE )
            // src/net/colar/netbeans/fan/antlr/Fan.g:208:13: SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE
            {
            match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType857); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:208:21: ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==SP_COMMA) ) {
                alt39=1;
            }
            else if ( (LA39_0==SQ_BRACKET_L||LA39_0==SP_PIPE||LA39_0==ID) ) {
                alt39=2;
            }
            else if ( (LA39_0==OP_ARROW) && (synpred53_Fan())) {
                alt39=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:208:22: SP_COMMA
                    {
                    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_funcType860); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:208:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:208:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:208:34: formals ( ( OP_ARROW )=> assignedType )?
                    {
                    pushFollow(FOLLOW_formals_in_funcType865);
                    formals();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:208:42: ( ( OP_ARROW )=> assignedType )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==OP_ARROW) && (synpred51_Fan())) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:208:43: ( OP_ARROW )=> assignedType
                            {
                            pushFollow(FOLLOW_assignedType_in_funcType872);
                            assignedType();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:208:73: ( ( OP_ARROW )=> assignedType )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:208:73: ( ( OP_ARROW )=> assignedType )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:208:74: ( OP_ARROW )=> assignedType
                    {
                    pushFollow(FOLLOW_assignedType_in_funcType884);
                    assignedType();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;

            }

            match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType888); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, funcType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "funcType"


    // $ANTLR start "assignedType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:209:1: assignedType : OP_ARROW type ;
    public final void assignedType() throws RecognitionException {
        int assignedType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:209:14: ( OP_ARROW type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:209:16: OP_ARROW type
            {
            match(input,OP_ARROW,FOLLOW_OP_ARROW_in_assignedType895); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_assignedType897);
            type();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, assignedType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "assignedType"


    // $ANTLR start "formals"
    // src/net/colar/netbeans/fan/antlr/Fan.g:210:1: formals : formal ( SP_COMMA formal )* ;
    public final void formals() throws RecognitionException {
        int formals_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:210:10: ( formal ( SP_COMMA formal )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:210:14: formal ( SP_COMMA formal )*
            {
            pushFollow(FOLLOW_formal_in_formals907);
            formal();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:210:21: ( SP_COMMA formal )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==SP_COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:210:22: SP_COMMA formal
            	    {
            	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_formals910); if (state.failed) return ;
            	    pushFollow(FOLLOW_formal_in_formals912);
            	    formal();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, formals_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "formals"


    // $ANTLR start "formal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:211:1: formal : ( formalFull | formalTypeOnly | formalInferred );
    public final void formal() throws RecognitionException {
        int formal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:211:9: ( formalFull | formalTypeOnly | formalInferred )
            int alt41=3;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                int LA41_1 = input.LA(2);

                if ( (synpred55_Fan()) ) {
                    alt41=1;
                }
                else if ( (synpred56_Fan()) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case SP_PIPE:
                {
                int LA41_2 = input.LA(2);

                if ( (synpred55_Fan()) ) {
                    alt41=1;
                }
                else if ( (synpred56_Fan()) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA41_3 = input.LA(2);

                if ( (synpred55_Fan()) ) {
                    alt41=1;
                }
                else if ( (synpred56_Fan()) ) {
                    alt41=2;
                }
                else if ( (true) ) {
                    alt41=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:211:11: formalFull
                    {
                    pushFollow(FOLLOW_formalFull_in_formal922);
                    formalFull();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:211:24: formalTypeOnly
                    {
                    pushFollow(FOLLOW_formalTypeOnly_in_formal926);
                    formalTypeOnly();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:211:41: formalInferred
                    {
                    pushFollow(FOLLOW_formalInferred_in_formal930);
                    formalInferred();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, formal_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "formal"


    // $ANTLR start "formalFull"
    // src/net/colar/netbeans/fan/antlr/Fan.g:212:1: formalFull : type id ;
    public final void formalFull() throws RecognitionException {
        int formalFull_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:212:17: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:212:19: type id
            {
            pushFollow(FOLLOW_type_in_formalFull942);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_formalFull944);
            id();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, formalFull_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "formalFull"


    // $ANTLR start "formalTypeOnly"
    // src/net/colar/netbeans/fan/antlr/Fan.g:213:1: formalTypeOnly : type ;
    public final void formalTypeOnly() throws RecognitionException {
        int formalTypeOnly_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:213:17: ( type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:213:21: type
            {
            pushFollow(FOLLOW_type_in_formalTypeOnly954);
            type();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, formalTypeOnly_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "formalTypeOnly"


    // $ANTLR start "formalInferred"
    // src/net/colar/netbeans/fan/antlr/Fan.g:214:1: formalInferred : id ;
    public final void formalInferred() throws RecognitionException {
        int formalInferred_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:214:17: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:214:21: id
            {
            pushFollow(FOLLOW_id_in_formalInferred964);
            id();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, formalInferred_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "formalInferred"


    // $ANTLR start "slotDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:215:1: slotDef : ( ( KW_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) ) ) ;
    public final void slotDef() throws RecognitionException {
        int slotDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:215:10: ( ( ( KW_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:215:12: ( ( KW_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) ) )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:215:12: ( ( KW_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) ) )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:215:13: ( KW_STATIC BRACKET_L )=> staticBlock
                    {
                    pushFollow(FOLLOW_staticBlock_in_slotDef980);
                    staticBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:216:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:216:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:216:6: docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef )
                    {
                    pushFollow(FOLLOW_docs_in_slotDef988);
                    docs();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:216:11: ( facet )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==AT) ) {
                            int LA42_2 = input.LA(2);

                            if ( (LA42_2==ID) ) {
                                int LA42_3 = input.LA(3);

                                if ( (synpred58_Fan()) ) {
                                    alt42=1;
                                }


                            }


                        }


                        switch (alt42) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
                    	    {
                    	    pushFollow(FOLLOW_facet_in_slotDef990);
                    	    facet();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:217:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef )
                    int alt43=3;
                    alt43 = dfa43.predict(input);
                    switch (alt43) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:218:7: ( ( ctorFlags )* KW_NEW )=> ctorDef
                            {
                            pushFollow(FOLLOW_ctorDef_in_slotDef1013);
                            ctorDef();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:219:7: ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef
                            {
                            pushFollow(FOLLOW_methodDef_in_slotDef1040);
                            methodDef();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:220:7: fieldDef
                            {
                            pushFollow(FOLLOW_fieldDef_in_slotDef1050);
                            fieldDef();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, slotDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "slotDef"


    // $ANTLR start "fieldDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:224:1: fieldDef : docs ( facet )* fieldFlags typeId ( AS_INIT_VAL expr )? ( ( BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R ) | eos ) ;
    public final void fieldDef() throws RecognitionException {
        int fieldDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:224:10: ( docs ( facet )* fieldFlags typeId ( AS_INIT_VAL expr )? ( ( BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R ) | eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:224:12: docs ( facet )* fieldFlags typeId ( AS_INIT_VAL expr )? ( ( BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R ) | eos )
            {
            pushFollow(FOLLOW_docs_in_fieldDef1075);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:224:17: ( facet )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==AT) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_fieldDef1077);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            pushFollow(FOLLOW_fieldFlags_in_fieldDef1080);
            fieldFlags();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_typeId_in_fieldDef1082);
            typeId();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:224:42: ( AS_INIT_VAL expr )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==AS_INIT_VAL) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:224:43: AS_INIT_VAL expr
                    {
                    match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_fieldDef1085); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_fieldDef1087);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:225:5: ( ( BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R ) | eos )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==BRACKET_L) ) {
                alt52=1;
            }
            else if ( (LA52_0==EOF||(LA52_0>=KW_RD_ONLY && LA52_0<=KW_VOID)||(LA52_0>=KW_ABSTRACT && LA52_0<=KW_ONCE)||LA52_0==SQ_BRACKET_L||LA52_0==BRACKET_R||LA52_0==SP_PIPE||LA52_0==SP_SEMI||(LA52_0>=AT && LA52_0<=ID)||LA52_0==DOC) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:226:5: ( BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:226:5: ( BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:226:6: BRACKET_L ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ BRACKET_R
                    {
                    match(input,BRACKET_L,FOLLOW_BRACKET_L_in_fieldDef1102); if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:226:16: ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( ((LA51_0>=KW_PRIVATE && LA51_0<=KW_INTERNAL)||LA51_0==ID) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:226:17: ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )?
                    	    {
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:226:17: ( protection )?
                    	    int alt47=2;
                    	    int LA47_0 = input.LA(1);

                    	    if ( ((LA47_0>=KW_PRIVATE && LA47_0<=KW_INTERNAL)) ) {
                    	        alt47=1;
                    	    }
                    	    switch (alt47) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    	            {
                    	            pushFollow(FOLLOW_protection_in_fieldDef1105);
                    	            protection();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:226:29: ( getter | setter )
                    	    int alt48=2;
                    	    int LA48_0 = input.LA(1);

                    	    if ( (LA48_0==ID) ) {
                    	        int LA48_1 = input.LA(2);

                    	        if ( (synpred67_Fan()) ) {
                    	            alt48=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt48=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return ;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 48, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 48, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt48) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:226:30: getter
                    	            {
                    	            pushFollow(FOLLOW_getter_in_fieldDef1109);
                    	            getter();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:226:39: setter
                    	            {
                    	            pushFollow(FOLLOW_setter_in_fieldDef1113);
                    	            setter();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:226:47: ( SP_SEMI )?
                    	    int alt49=2;
                    	    int LA49_0 = input.LA(1);

                    	    if ( (LA49_0==SP_SEMI) ) {
                    	        alt49=1;
                    	    }
                    	    switch (alt49) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
                    	            {
                    	            match(input,SP_SEMI,FOLLOW_SP_SEMI_in_fieldDef1116); if (state.failed) return ;

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:226:56: ( block )?
                    	    int alt50=2;
                    	    int LA50_0 = input.LA(1);

                    	    if ( ((LA50_0>=KW_BREAK && LA50_0<=KW_TRY)||(LA50_0>=KW_THIS && LA50_0<=KW_SUPER)||(LA50_0>=KW_NULL && LA50_0<=KW_FALSE)||LA50_0==SQ_BRACKET_L||LA50_0==BRACKET_L||LA50_0==PAR_L||LA50_0==SP_PIPE||LA50_0==OP_CURRY||(LA50_0>=OP_PLUS && LA50_0<=OP_MINUS)||(LA50_0>=OP_BANG && LA50_0<=OP_TILDA)||LA50_0==AT||(LA50_0>=QUOTSTR && LA50_0<=OP_POUND)||LA50_0==NUMBER) ) {
                    	        alt50=1;
                    	    }
                    	    else if ( (LA50_0==ID) ) {
                    	        int LA50_2 = input.LA(2);

                    	        if ( (synpred69_Fan()) ) {
                    	            alt50=1;
                    	        }
                    	    }
                    	    switch (alt50) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: block
                    	            {
                    	            pushFollow(FOLLOW_block_in_fieldDef1119);
                    	            block();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);

                    match(input,BRACKET_R,FOLLOW_BRACKET_R_in_fieldDef1124); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:227:7: eos
                    {
                    pushFollow(FOLLOW_eos_in_fieldDef1133);
                    eos();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, fieldDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "fieldDef"


    // $ANTLR start "typeId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:229:1: typeId : ( ( type id )=> typeAndId | id ) ;
    public final void typeId() throws RecognitionException {
        int typeId_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:229:9: ( ( ( type id )=> typeAndId | id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:229:11: ( ( type id )=> typeAndId | id )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:229:11: ( ( type id )=> typeAndId | id )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:229:12: ( type id )=> typeAndId
                    {
                    pushFollow(FOLLOW_typeAndId_in_typeId1150);
                    typeAndId();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:229:35: id
                    {
                    pushFollow(FOLLOW_id_in_typeId1154);
                    id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, typeId_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeId"


    // $ANTLR start "typeAndId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:230:1: typeAndId : type id ;
    public final void typeAndId() throws RecognitionException {
        int typeAndId_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:230:11: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:230:13: type id
            {
            pushFollow(FOLLOW_type_in_typeAndId1162);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_typeAndId1164);
            id();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, typeAndId_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeAndId"


    // $ANTLR start "fieldFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:231:1: fieldFlags : ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* ;
    public final void fieldFlags() throws RecognitionException {
        int fieldFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:231:12: ( ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:231:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:231:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            loop54:
            do {
                int alt54=11;
                switch ( input.LA(1) ) {
                case KW_ABSTRACT:
                    {
                    alt54=1;
                    }
                    break;
                case KW_RD_ONLY:
                    {
                    alt54=2;
                    }
                    break;
                case KW_CONST:
                    {
                    alt54=3;
                    }
                    break;
                case KW_STATIC:
                    {
                    alt54=4;
                    }
                    break;
                case KW_NATIVE:
                    {
                    alt54=5;
                    }
                    break;
                case KW_VOLATILE:
                    {
                    alt54=6;
                    }
                    break;
                case KW_OVERRIDE:
                    {
                    alt54=7;
                    }
                    break;
                case KW_VIRTUAL:
                    {
                    alt54=8;
                    }
                    break;
                case KW_FINAL:
                    {
                    alt54=9;
                    }
                    break;
                case KW_PRIVATE:
                case KW_PROTECTED:
                case KW_PUBLIC:
                case KW_INTERNAL:
                    {
                    alt54=10;
                    }
                    break;

                }

                switch (alt54) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:231:15: KW_ABSTRACT
            	    {
            	    match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_fieldFlags1172); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:231:29: KW_RD_ONLY
            	    {
            	    match(input,KW_RD_ONLY,FOLLOW_KW_RD_ONLY_in_fieldFlags1176); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:231:42: KW_CONST
            	    {
            	    match(input,KW_CONST,FOLLOW_KW_CONST_in_fieldFlags1180); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:231:53: KW_STATIC
            	    {
            	    match(input,KW_STATIC,FOLLOW_KW_STATIC_in_fieldFlags1184); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:231:65: KW_NATIVE
            	    {
            	    match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_fieldFlags1188); if (state.failed) return ;

            	    }
            	    break;
            	case 6 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:231:77: KW_VOLATILE
            	    {
            	    match(input,KW_VOLATILE,FOLLOW_KW_VOLATILE_in_fieldFlags1192); if (state.failed) return ;

            	    }
            	    break;
            	case 7 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:231:91: KW_OVERRIDE
            	    {
            	    match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_fieldFlags1196); if (state.failed) return ;

            	    }
            	    break;
            	case 8 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:231:105: KW_VIRTUAL
            	    {
            	    match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_fieldFlags1200); if (state.failed) return ;

            	    }
            	    break;
            	case 9 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:231:118: KW_FINAL
            	    {
            	    match(input,KW_FINAL,FOLLOW_KW_FINAL_in_fieldFlags1204); if (state.failed) return ;

            	    }
            	    break;
            	case 10 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:231:129: protection
            	    {
            	    pushFollow(FOLLOW_protection_in_fieldFlags1208);
            	    protection();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, fieldFlags_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "fieldFlags"


    // $ANTLR start "methodDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:232:1: methodDef : docs ( facet )* ( methodFlags )* ( type | KW_VOID ) id PAR_L params PAR_R methodBody ;
    public final void methodDef() throws RecognitionException {
        int methodDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:232:11: ( docs ( facet )* ( methodFlags )* ( type | KW_VOID ) id PAR_L params PAR_R methodBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:232:13: docs ( facet )* ( methodFlags )* ( type | KW_VOID ) id PAR_L params PAR_R methodBody
            {
            pushFollow(FOLLOW_docs_in_methodDef1217);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:232:18: ( facet )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==AT) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_methodDef1219);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:232:25: ( methodFlags )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=KW_STATIC && LA56_0<=KW_NATIVE)||(LA56_0>=KW_OVERRIDE && LA56_0<=KW_FINAL)||(LA56_0>=KW_ABSTRACT && LA56_0<=KW_INTERNAL)||LA56_0==KW_ONCE) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: methodFlags
            	    {
            	    pushFollow(FOLLOW_methodFlags_in_methodDef1222);
            	    methodFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:232:38: ( type | KW_VOID )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==SQ_BRACKET_L||LA57_0==SP_PIPE||LA57_0==ID) ) {
                alt57=1;
            }
            else if ( (LA57_0==KW_VOID) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:232:39: type
                    {
                    pushFollow(FOLLOW_type_in_methodDef1226);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:232:46: KW_VOID
                    {
                    match(input,KW_VOID,FOLLOW_KW_VOID_in_methodDef1230); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_methodDef1233);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_methodDef1235); if (state.failed) return ;
            pushFollow(FOLLOW_params_in_methodDef1237);
            params();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_methodDef1239); if (state.failed) return ;
            pushFollow(FOLLOW_methodBody_in_methodDef1241);
            methodBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, methodDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "methodDef"


    // $ANTLR start "methodFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:233:1: methodFlags : ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL );
    public final void methodFlags() throws RecognitionException {
        int methodFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:233:13: ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL )
            int alt58=8;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt58=1;
                }
                break;
            case KW_VIRTUAL:
                {
                alt58=2;
                }
                break;
            case KW_OVERRIDE:
                {
                alt58=3;
                }
                break;
            case KW_ABSTRACT:
                {
                alt58=4;
                }
                break;
            case KW_STATIC:
                {
                alt58=5;
                }
                break;
            case KW_ONCE:
                {
                alt58=6;
                }
                break;
            case KW_NATIVE:
                {
                alt58=7;
                }
                break;
            case KW_FINAL:
                {
                alt58=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:233:15: protection
                    {
                    pushFollow(FOLLOW_protection_in_methodFlags1248);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:233:28: KW_VIRTUAL
                    {
                    match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_methodFlags1252); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:233:41: KW_OVERRIDE
                    {
                    match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_methodFlags1256); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:233:55: KW_ABSTRACT
                    {
                    match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_methodFlags1260); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:233:69: KW_STATIC
                    {
                    match(input,KW_STATIC,FOLLOW_KW_STATIC_in_methodFlags1264); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:233:81: KW_ONCE
                    {
                    match(input,KW_ONCE,FOLLOW_KW_ONCE_in_methodFlags1268); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:234:5: KW_NATIVE
                    {
                    match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_methodFlags1276); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:234:17: KW_FINAL
                    {
                    match(input,KW_FINAL,FOLLOW_KW_FINAL_in_methodFlags1280); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, methodFlags_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "methodFlags"


    // $ANTLR start "params"
    // src/net/colar/netbeans/fan/antlr/Fan.g:235:1: params : ( param ( SP_COMMA param )* )? ;
    public final void params() throws RecognitionException {
        int params_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:235:9: ( ( param ( SP_COMMA param )* )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:235:11: ( param ( SP_COMMA param )* )?
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:235:11: ( param ( SP_COMMA param )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==SQ_BRACKET_L||LA60_0==SP_PIPE||LA60_0==ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:235:12: param ( SP_COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_params1289);
                    param();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:235:18: ( SP_COMMA param )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==SP_COMMA) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:235:19: SP_COMMA param
                    	    {
                    	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_params1292); if (state.failed) return ;
                    	    pushFollow(FOLLOW_param_in_params1294);
                    	    param();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, params_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "params"


    // $ANTLR start "param"
    // src/net/colar/netbeans/fan/antlr/Fan.g:236:1: param : type id ( AS_INIT_VAL expr )? ;
    public final void param() throws RecognitionException {
        int param_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:9: ( type id ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:11: type id ( AS_INIT_VAL expr )?
            {
            pushFollow(FOLLOW_type_in_param1307);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_param1309);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:19: ( AS_INIT_VAL expr )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==AS_INIT_VAL) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:236:20: AS_INIT_VAL expr
                    {
                    match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_param1312); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_param1314);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, param_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "param"


    // $ANTLR start "methodBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:237:1: methodBody : ( ( BRACKET_L ( stmt )* BRACKET_R ) | eos );
    public final void methodBody() throws RecognitionException {
        int methodBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:237:12: ( ( BRACKET_L ( stmt )* BRACKET_R ) | eos )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==BRACKET_L) ) {
                alt63=1;
            }
            else if ( (LA63_0==EOF||(LA63_0>=KW_RD_ONLY && LA63_0<=KW_VOID)||(LA63_0>=KW_ABSTRACT && LA63_0<=KW_ONCE)||LA63_0==SQ_BRACKET_L||LA63_0==BRACKET_R||LA63_0==SP_PIPE||LA63_0==SP_SEMI||(LA63_0>=AT && LA63_0<=ID)||LA63_0==DOC) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:237:14: ( BRACKET_L ( stmt )* BRACKET_R )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:237:14: ( BRACKET_L ( stmt )* BRACKET_R )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:237:15: BRACKET_L ( stmt )* BRACKET_R
                    {
                    match(input,BRACKET_L,FOLLOW_BRACKET_L_in_methodBody1324); if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:237:25: ( stmt )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( ((LA62_0>=KW_BREAK && LA62_0<=KW_TRY)||(LA62_0>=KW_THIS && LA62_0<=KW_SUPER)||(LA62_0>=KW_NULL && LA62_0<=KW_FALSE)||LA62_0==SQ_BRACKET_L||LA62_0==PAR_L||LA62_0==SP_PIPE||LA62_0==OP_CURRY||(LA62_0>=OP_PLUS && LA62_0<=OP_MINUS)||(LA62_0>=OP_BANG && LA62_0<=OP_TILDA)||(LA62_0>=AT && LA62_0<=OP_POUND)||LA62_0==NUMBER) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_methodBody1326);
                    	    stmt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    match(input,BRACKET_R,FOLLOW_BRACKET_R_in_methodBody1329); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:237:44: eos
                    {
                    pushFollow(FOLLOW_eos_in_methodBody1334);
                    eos();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, methodBody_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "methodBody"


    // $ANTLR start "ctorDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:238:1: ctorDef : docs ( facet )* ( ctorFlags )* KW_NEW id PAR_L params PAR_R ( ( SP_COLON )=> ctorChain )? methodBody ;
    public final void ctorDef() throws RecognitionException {
        int ctorDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:238:10: ( docs ( facet )* ( ctorFlags )* KW_NEW id PAR_L params PAR_R ( ( SP_COLON )=> ctorChain )? methodBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:238:12: docs ( facet )* ( ctorFlags )* KW_NEW id PAR_L params PAR_R ( ( SP_COLON )=> ctorChain )? methodBody
            {
            pushFollow(FOLLOW_docs_in_ctorDef1342);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:238:17: ( facet )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==AT) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_ctorDef1344);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:238:24: ( ctorFlags )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=KW_PRIVATE && LA65_0<=KW_INTERNAL)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ctorFlags
            	    {
            	    pushFollow(FOLLOW_ctorFlags_in_ctorDef1347);
            	    ctorFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            match(input,KW_NEW,FOLLOW_KW_NEW_in_ctorDef1350); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_ctorDef1352);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_ctorDef1354); if (state.failed) return ;
            pushFollow(FOLLOW_params_in_ctorDef1356);
            params();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_ctorDef1358); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:238:64: ( ( SP_COLON )=> ctorChain )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==SP_COLON) && (synpred100_Fan())) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:238:65: ( SP_COLON )=> ctorChain
                    {
                    pushFollow(FOLLOW_ctorChain_in_ctorDef1365);
                    ctorChain();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_ctorDef1369);
            methodBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, ctorDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ctorDef"


    // $ANTLR start "ctorFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:239:1: ctorFlags : protection ;
    public final void ctorFlags() throws RecognitionException {
        int ctorFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:239:11: ( protection )
            // src/net/colar/netbeans/fan/antlr/Fan.g:239:13: protection
            {
            pushFollow(FOLLOW_protection_in_ctorFlags1376);
            protection();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, ctorFlags_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ctorFlags"


    // $ANTLR start "ctorChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:240:1: ctorChain : SP_COLON ( ctorChainThis | ctorChainSuper ) ;
    public final void ctorChain() throws RecognitionException {
        int ctorChain_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:240:11: ( SP_COLON ( ctorChainThis | ctorChainSuper ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:240:13: SP_COLON ( ctorChainThis | ctorChainSuper )
            {
            match(input,SP_COLON,FOLLOW_SP_COLON_in_ctorChain1383); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:240:22: ( ctorChainThis | ctorChainSuper )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==KW_THIS) ) {
                alt67=1;
            }
            else if ( (LA67_0==KW_SUPER) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:240:23: ctorChainThis
                    {
                    pushFollow(FOLLOW_ctorChainThis_in_ctorChain1386);
                    ctorChainThis();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:240:39: ctorChainSuper
                    {
                    pushFollow(FOLLOW_ctorChainSuper_in_ctorChain1390);
                    ctorChainSuper();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, ctorChain_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ctorChain"


    // $ANTLR start "ctorChainThis"
    // src/net/colar/netbeans/fan/antlr/Fan.g:242:1: ctorChainThis : KW_THIS DOT id PAR_L ( args )? PAR_R ;
    public final void ctorChainThis() throws RecognitionException {
        int ctorChainThis_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:242:15: ( KW_THIS DOT id PAR_L ( args )? PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:242:17: KW_THIS DOT id PAR_L ( args )? PAR_R
            {
            match(input,KW_THIS,FOLLOW_KW_THIS_in_ctorChainThis1399); if (state.failed) return ;
            match(input,DOT,FOLLOW_DOT_in_ctorChainThis1401); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_ctorChainThis1403);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_ctorChainThis1405); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:242:38: ( args )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=KW_THIS && LA68_0<=KW_SUPER)||(LA68_0>=KW_NULL && LA68_0<=KW_FALSE)||LA68_0==SQ_BRACKET_L||LA68_0==PAR_L||LA68_0==SP_PIPE||LA68_0==OP_CURRY||(LA68_0>=OP_PLUS && LA68_0<=OP_MINUS)||(LA68_0>=OP_BANG && LA68_0<=OP_TILDA)||(LA68_0>=AT && LA68_0<=OP_POUND)||LA68_0==NUMBER) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainThis1407);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_ctorChainThis1410); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, ctorChainThis_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ctorChainThis"


    // $ANTLR start "ctorChainSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:243:1: ctorChainSuper : KW_SUPER ( DOT id )? PAR_L ( args )? PAR_R ;
    public final void ctorChainSuper() throws RecognitionException {
        int ctorChainSuper_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:243:16: ( KW_SUPER ( DOT id )? PAR_L ( args )? PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:243:18: KW_SUPER ( DOT id )? PAR_L ( args )? PAR_R
            {
            match(input,KW_SUPER,FOLLOW_KW_SUPER_in_ctorChainSuper1417); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:243:27: ( DOT id )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==DOT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:243:28: DOT id
                    {
                    match(input,DOT,FOLLOW_DOT_in_ctorChainSuper1420); if (state.failed) return ;
                    pushFollow(FOLLOW_id_in_ctorChainSuper1422);
                    id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_L,FOLLOW_PAR_L_in_ctorChainSuper1426); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:243:43: ( args )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=KW_THIS && LA70_0<=KW_SUPER)||(LA70_0>=KW_NULL && LA70_0<=KW_FALSE)||LA70_0==SQ_BRACKET_L||LA70_0==PAR_L||LA70_0==SP_PIPE||LA70_0==OP_CURRY||(LA70_0>=OP_PLUS && LA70_0<=OP_MINUS)||(LA70_0>=OP_BANG && LA70_0<=OP_TILDA)||(LA70_0>=AT && LA70_0<=OP_POUND)||LA70_0==NUMBER) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainSuper1428);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_ctorChainSuper1431); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, ctorChainSuper_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ctorChainSuper"


    // $ANTLR start "staticBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:245:1: staticBlock : KW_STATIC block ;
    public final void staticBlock() throws RecognitionException {
        int staticBlock_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:245:13: ( KW_STATIC block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:245:15: KW_STATIC block
            {
            match(input,KW_STATIC,FOLLOW_KW_STATIC_in_staticBlock1439); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_staticBlock1441);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, staticBlock_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "staticBlock"


    // $ANTLR start "block"
    // src/net/colar/netbeans/fan/antlr/Fan.g:246:1: block : ( ( BRACKET_L )=> multiStmt | stmt ) ;
    public final void block() throws RecognitionException {
        int block_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:246:9: ( ( ( BRACKET_L )=> multiStmt | stmt ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:246:11: ( ( BRACKET_L )=> multiStmt | stmt )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:246:11: ( ( BRACKET_L )=> multiStmt | stmt )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==BRACKET_L) && (synpred105_Fan())) {
                alt71=1;
            }
            else if ( ((LA71_0>=KW_BREAK && LA71_0<=KW_TRY)||(LA71_0>=KW_THIS && LA71_0<=KW_SUPER)||(LA71_0>=KW_NULL && LA71_0<=KW_FALSE)||LA71_0==SQ_BRACKET_L||LA71_0==PAR_L||LA71_0==SP_PIPE||LA71_0==OP_CURRY||(LA71_0>=OP_PLUS && LA71_0<=OP_MINUS)||(LA71_0>=OP_BANG && LA71_0<=OP_TILDA)||(LA71_0>=AT && LA71_0<=OP_POUND)||LA71_0==NUMBER) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:246:12: ( BRACKET_L )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_block1455);
                    multiStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:246:37: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_block1459);
                    stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, block_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "block"


    // $ANTLR start "multiStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:247:1: multiStmt : BRACKET_L ( stmt )* BRACKET_R ;
    public final void multiStmt() throws RecognitionException {
        int multiStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:11: ( BRACKET_L ( stmt )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:13: BRACKET_L ( stmt )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_multiStmt1467); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:24: ( stmt )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=KW_BREAK && LA72_0<=KW_TRY)||(LA72_0>=KW_THIS && LA72_0<=KW_SUPER)||(LA72_0>=KW_NULL && LA72_0<=KW_FALSE)||LA72_0==SQ_BRACKET_L||LA72_0==PAR_L||LA72_0==SP_PIPE||LA72_0==OP_CURRY||(LA72_0>=OP_PLUS && LA72_0<=OP_MINUS)||(LA72_0>=OP_BANG && LA72_0<=OP_TILDA)||(LA72_0>=AT && LA72_0<=OP_POUND)||LA72_0==NUMBER) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_multiStmt1470);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_multiStmt1473); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, multiStmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "multiStmt"


    // $ANTLR start "stmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:248:1: stmt : ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) ;
    public final void stmt() throws RecognitionException {
        int stmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:248:8: ( ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:248:10: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:248:10: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            int alt73=11;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:248:11: g_if
                    {
                    pushFollow(FOLLOW_g_if_in_stmt1483);
                    g_if();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:248:18: g_for
                    {
                    pushFollow(FOLLOW_g_for_in_stmt1487);
                    g_for();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:248:26: g_while
                    {
                    pushFollow(FOLLOW_g_while_in_stmt1491);
                    g_while();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:248:36: g_break
                    {
                    pushFollow(FOLLOW_g_break_in_stmt1495);
                    g_break();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:4: g_continue
                    {
                    pushFollow(FOLLOW_g_continue_in_stmt1502);
                    g_continue();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:17: g_return
                    {
                    pushFollow(FOLLOW_g_return_in_stmt1506);
                    g_return();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:28: g_switch
                    {
                    pushFollow(FOLLOW_g_switch_in_stmt1510);
                    g_switch();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:250:4: g_throw
                    {
                    pushFollow(FOLLOW_g_throw_in_stmt1517);
                    g_throw();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:250:14: g_try
                    {
                    pushFollow(FOLLOW_g_try_in_stmt1521);
                    g_try();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:250:22: exprStmt
                    {
                    pushFollow(FOLLOW_exprStmt_in_stmt1525);
                    exprStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:250:33: localDef
                    {
                    pushFollow(FOLLOW_localDef_in_stmt1529);
                    localDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, stmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "stmt"


    // $ANTLR start "g_break"
    // src/net/colar/netbeans/fan/antlr/Fan.g:257:1: g_break : KW_BREAK eos ;
    public final void g_break() throws RecognitionException {
        int g_break_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:257:10: ( KW_BREAK eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:257:12: KW_BREAK eos
            {
            match(input,KW_BREAK,FOLLOW_KW_BREAK_in_g_break1542); if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_g_break1544);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, g_break_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_break"


    // $ANTLR start "g_continue"
    // src/net/colar/netbeans/fan/antlr/Fan.g:258:1: g_continue : KW_CONTINUE eos ;
    public final void g_continue() throws RecognitionException {
        int g_continue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:258:12: ( KW_CONTINUE eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:258:14: KW_CONTINUE eos
            {
            match(input,KW_CONTINUE,FOLLOW_KW_CONTINUE_in_g_continue1551); if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_g_continue1553);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, g_continue_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_continue"


    // $ANTLR start "g_for"
    // src/net/colar/netbeans/fan/antlr/Fan.g:259:1: g_for : KW_FOR PAR_L ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? PAR_R block ;
    public final void g_for() throws RecognitionException {
        int g_for_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:8: ( KW_FOR PAR_L ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? PAR_R block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:10: KW_FOR PAR_L ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? PAR_R block
            {
            match(input,KW_FOR,FOLLOW_KW_FOR_in_g_for1561); if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_g_for1563); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:23: ( forInit )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=KW_THIS && LA74_0<=KW_SUPER)||(LA74_0>=KW_NULL && LA74_0<=KW_FALSE)||LA74_0==SQ_BRACKET_L||LA74_0==PAR_L||LA74_0==SP_PIPE||LA74_0==OP_CURRY||(LA74_0>=OP_PLUS && LA74_0<=OP_MINUS)||(LA74_0>=OP_BANG && LA74_0<=OP_TILDA)||(LA74_0>=AT && LA74_0<=OP_POUND)||LA74_0==NUMBER) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_g_for1565);
                    forInit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for1568); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:40: ( expr )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=KW_THIS && LA75_0<=KW_SUPER)||(LA75_0>=KW_NULL && LA75_0<=KW_FALSE)||LA75_0==SQ_BRACKET_L||LA75_0==PAR_L||LA75_0==SP_PIPE||LA75_0==OP_CURRY||(LA75_0>=OP_PLUS && LA75_0<=OP_MINUS)||(LA75_0>=OP_BANG && LA75_0<=OP_TILDA)||(LA75_0>=AT && LA75_0<=OP_POUND)||LA75_0==NUMBER) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for1570);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for1573); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:54: ( expr )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=KW_THIS && LA76_0<=KW_SUPER)||(LA76_0>=KW_NULL && LA76_0<=KW_FALSE)||LA76_0==SQ_BRACKET_L||LA76_0==PAR_L||LA76_0==SP_PIPE||LA76_0==OP_CURRY||(LA76_0>=OP_PLUS && LA76_0<=OP_MINUS)||(LA76_0>=OP_BANG && LA76_0<=OP_TILDA)||(LA76_0>=AT && LA76_0<=OP_POUND)||LA76_0==NUMBER) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for1575);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_g_for1578); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_g_for1581);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, g_for_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_for"


    // $ANTLR start "g_if"
    // src/net/colar/netbeans/fan/antlr/Fan.g:260:1: g_if : KW_IF PAR_L expr PAR_R block ( KW_ELSE block )? ;
    public final void g_if() throws RecognitionException {
        int g_if_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:260:7: ( KW_IF PAR_L expr PAR_R block ( KW_ELSE block )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:260:9: KW_IF PAR_L expr PAR_R block ( KW_ELSE block )?
            {
            match(input,KW_IF,FOLLOW_KW_IF_in_g_if1589); if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_g_if1591); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_if1593);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_g_if1595); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_g_if1597);
            block();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:261:5: ( KW_ELSE block )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==KW_ELSE) ) {
                int LA77_1 = input.LA(2);

                if ( (synpred120_Fan()) ) {
                    alt77=1;
                }
            }
            switch (alt77) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:261:6: KW_ELSE block
                    {
                    match(input,KW_ELSE,FOLLOW_KW_ELSE_in_g_if1604); if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_g_if1606);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, g_if_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_if"


    // $ANTLR start "g_return"
    // src/net/colar/netbeans/fan/antlr/Fan.g:262:1: g_return : KW_RETURN ( eos | expr eos ) ;
    public final void g_return() throws RecognitionException {
        int g_return_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:10: ( KW_RETURN ( eos | expr eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:12: KW_RETURN ( eos | expr eos )
            {
            match(input,KW_RETURN,FOLLOW_KW_RETURN_in_g_return1615); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:22: ( eos | expr eos )
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:262:23: eos
                    {
                    pushFollow(FOLLOW_eos_in_g_return1618);
                    eos();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:262:29: expr eos
                    {
                    pushFollow(FOLLOW_expr_in_g_return1622);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_eos_in_g_return1624);
                    eos();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, g_return_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_return"


    // $ANTLR start "g_switch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:263:1: g_switch : KW_SWITCH PAR_L expr PAR_R BRACKET_L ( g_case )* ( g_default )? BRACKET_R ;
    public final void g_switch() throws RecognitionException {
        int g_switch_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:263:10: ( KW_SWITCH PAR_L expr PAR_R BRACKET_L ( g_case )* ( g_default )? BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:263:12: KW_SWITCH PAR_L expr PAR_R BRACKET_L ( g_case )* ( g_default )? BRACKET_R
            {
            match(input,KW_SWITCH,FOLLOW_KW_SWITCH_in_g_switch1632); if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_g_switch1634); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_switch1636);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_g_switch1638); if (state.failed) return ;
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_g_switch1640); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:263:49: ( g_case )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==KW_CASE) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:263:50: g_case
            	    {
            	    pushFollow(FOLLOW_g_case_in_g_switch1643);
            	    g_case();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:263:59: ( g_default )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==KW_DEFAULT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:263:60: g_default
                    {
                    pushFollow(FOLLOW_g_default_in_g_switch1648);
                    g_default();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_g_switch1652); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, g_switch_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_switch"


    // $ANTLR start "g_throw"
    // src/net/colar/netbeans/fan/antlr/Fan.g:264:1: g_throw : KW_THROW expr eos ;
    public final void g_throw() throws RecognitionException {
        int g_throw_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:264:10: ( KW_THROW expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:264:12: KW_THROW expr eos
            {
            match(input,KW_THROW,FOLLOW_KW_THROW_in_g_throw1660); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_throw1662);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_g_throw1664);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, g_throw_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_throw"


    // $ANTLR start "g_while"
    // src/net/colar/netbeans/fan/antlr/Fan.g:265:1: g_while : KW_WHILE PAR_L expr PAR_R block ;
    public final void g_while() throws RecognitionException {
        int g_while_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:265:10: ( KW_WHILE PAR_L expr PAR_R block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:265:12: KW_WHILE PAR_L expr PAR_R block
            {
            match(input,KW_WHILE,FOLLOW_KW_WHILE_in_g_while1672); if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_g_while1674); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_while1676);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_g_while1678); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_g_while1680);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, g_while_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_while"


    // $ANTLR start "g_try"
    // src/net/colar/netbeans/fan/antlr/Fan.g:266:1: g_try : KW_TRY ( ( BRACKET_L )=> try_long | ( stmt )* ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? ;
    public final void g_try() throws RecognitionException {
        int g_try_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:8: ( KW_TRY ( ( BRACKET_L )=> try_long | ( stmt )* ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:10: KW_TRY ( ( BRACKET_L )=> try_long | ( stmt )* ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )?
            {
            match(input,KW_TRY,FOLLOW_KW_TRY_in_g_try1688); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:17: ( ( BRACKET_L )=> try_long | ( stmt )* )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==BRACKET_L) && (synpred124_Fan())) {
                alt82=1;
            }
            else if ( (LA82_0==EOF||(LA82_0>=KW_BREAK && LA82_0<=KW_FINALLY)||(LA82_0>=KW_RD_ONLY && LA82_0<=KW_VOID)||(LA82_0>=KW_ABSTRACT && LA82_0<=KW_ELSE)||(LA82_0>=KW_NULL && LA82_0<=KW_FALSE)||LA82_0==SQ_BRACKET_L||LA82_0==BRACKET_R||(LA82_0>=SP_COMMA && LA82_0<=PAR_L)||LA82_0==SP_PIPE||LA82_0==SP_SEMI||LA82_0==OP_CURRY||(LA82_0>=OP_PLUS && LA82_0<=OP_MINUS)||(LA82_0>=OP_BANG && LA82_0<=OP_TILDA)||(LA82_0>=AT && LA82_0<=NUMBER)) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:266:18: ( BRACKET_L )=> try_long
                    {
                    pushFollow(FOLLOW_try_long_in_g_try1695);
                    try_long();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:266:42: ( stmt )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:266:42: ( stmt )*
                    loop81:
                    do {
                        int alt81=2;
                        alt81 = dfa81.predict(input);
                        switch (alt81) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_try1699);
                    	    stmt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:266:49: ( ( KW_CATCH )=> g_catch )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==KW_CATCH) ) {
                    int LA83_2 = input.LA(2);

                    if ( (synpred126_Fan()) ) {
                        alt83=1;
                    }


                }


                switch (alt83) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:266:50: ( KW_CATCH )=> g_catch
            	    {
            	    pushFollow(FOLLOW_g_catch_in_g_try1708);
            	    g_catch();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:266:72: ( ( KW_FINALLY )=> g_finally )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==KW_FINALLY) ) {
                int LA84_1 = input.LA(2);

                if ( (synpred127_Fan()) ) {
                    alt84=1;
                }
            }
            switch (alt84) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:266:73: ( KW_FINALLY )=> g_finally
                    {
                    pushFollow(FOLLOW_g_finally_in_g_try1717);
                    g_finally();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, g_try_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_try"


    // $ANTLR start "try_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:267:1: try_long : BRACKET_L ( stmt )* BRACKET_R ;
    public final void try_long() throws RecognitionException {
        int try_long_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:10: ( BRACKET_L ( stmt )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:12: BRACKET_L ( stmt )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_try_long1726); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:22: ( stmt )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( ((LA85_0>=KW_BREAK && LA85_0<=KW_TRY)||(LA85_0>=KW_THIS && LA85_0<=KW_SUPER)||(LA85_0>=KW_NULL && LA85_0<=KW_FALSE)||LA85_0==SQ_BRACKET_L||LA85_0==PAR_L||LA85_0==SP_PIPE||LA85_0==OP_CURRY||(LA85_0>=OP_PLUS && LA85_0<=OP_MINUS)||(LA85_0>=OP_BANG && LA85_0<=OP_TILDA)||(LA85_0>=AT && LA85_0<=OP_POUND)||LA85_0==NUMBER) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_try_long1728);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_try_long1731); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, try_long_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "try_long"


    // $ANTLR start "exprStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:268:1: exprStmt : expr eos ;
    public final void exprStmt() throws RecognitionException {
        int exprStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:268:10: ( expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:268:12: expr eos
            {
            pushFollow(FOLLOW_expr_in_exprStmt1738);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_exprStmt1740);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, exprStmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "exprStmt"


    // $ANTLR start "localDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:269:1: localDef : typeId ( AS_INIT_VAL expr )? eos ;
    public final void localDef() throws RecognitionException {
        int localDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:10: ( typeId ( AS_INIT_VAL expr )? eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:12: typeId ( AS_INIT_VAL expr )? eos
            {
            pushFollow(FOLLOW_typeId_in_localDef1747);
            typeId();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:19: ( AS_INIT_VAL expr )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==AS_INIT_VAL) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:269:20: AS_INIT_VAL expr
                    {
                    match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_localDef1750); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_localDef1752);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_eos_in_localDef1756);
            eos();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, localDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "localDef"


    // $ANTLR start "forInit"
    // src/net/colar/netbeans/fan/antlr/Fan.g:270:1: forInit : ( forInitDef | expr );
    public final void forInit() throws RecognitionException {
        int forInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:270:10: ( forInitDef | expr )
            int alt87=2;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:270:12: forInitDef
                    {
                    pushFollow(FOLLOW_forInitDef_in_forInit1764);
                    forInitDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:270:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_forInit1768);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, forInit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "forInit"


    // $ANTLR start "forInitDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:271:1: forInitDef : typeId ( AS_INIT_VAL expr )? ;
    public final void forInitDef() throws RecognitionException {
        int forInitDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:12: ( typeId ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:14: typeId ( AS_INIT_VAL expr )?
            {
            pushFollow(FOLLOW_typeId_in_forInitDef1775);
            typeId();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:21: ( AS_INIT_VAL expr )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==AS_INIT_VAL) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:22: AS_INIT_VAL expr
                    {
                    match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_forInitDef1778); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_forInitDef1780);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, forInitDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "forInitDef"


    // $ANTLR start "g_catch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:273:1: g_catch : KW_CATCH ( catchDef )? ( ( BRACKET_L )=> catch_long | ( stmt )* ) ;
    public final void g_catch() throws RecognitionException {
        int g_catch_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:10: ( KW_CATCH ( catchDef )? ( ( BRACKET_L )=> catch_long | ( stmt )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:12: KW_CATCH ( catchDef )? ( ( BRACKET_L )=> catch_long | ( stmt )* )
            {
            match(input,KW_CATCH,FOLLOW_KW_CATCH_in_g_catch1791); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:21: ( catchDef )?
            int alt89=2;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: catchDef
                    {
                    pushFollow(FOLLOW_catchDef_in_g_catch1793);
                    catchDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:273:31: ( ( BRACKET_L )=> catch_long | ( stmt )* )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==BRACKET_L) && (synpred133_Fan())) {
                alt91=1;
            }
            else if ( (LA91_0==EOF||(LA91_0>=KW_BREAK && LA91_0<=KW_FINALLY)||(LA91_0>=KW_RD_ONLY && LA91_0<=KW_VOID)||(LA91_0>=KW_ABSTRACT && LA91_0<=KW_ELSE)||(LA91_0>=KW_NULL && LA91_0<=KW_FALSE)||LA91_0==SQ_BRACKET_L||LA91_0==BRACKET_R||(LA91_0>=SP_COMMA && LA91_0<=PAR_L)||LA91_0==SP_PIPE||LA91_0==SP_SEMI||LA91_0==OP_CURRY||(LA91_0>=OP_PLUS && LA91_0<=OP_MINUS)||(LA91_0>=OP_BANG && LA91_0<=OP_TILDA)||(LA91_0>=AT && LA91_0<=NUMBER)) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:273:32: ( BRACKET_L )=> catch_long
                    {
                    pushFollow(FOLLOW_catch_long_in_g_catch1801);
                    catch_long();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:273:58: ( stmt )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:273:58: ( stmt )*
                    loop90:
                    do {
                        int alt90=2;
                        alt90 = dfa90.predict(input);
                        switch (alt90) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_catch1805);
                    	    stmt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, g_catch_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_catch"


    // $ANTLR start "catch_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:274:1: catch_long : BRACKET_L ( stmt )* BRACKET_R ;
    public final void catch_long() throws RecognitionException {
        int catch_long_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:274:12: ( BRACKET_L ( stmt )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:274:14: BRACKET_L ( stmt )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_catch_long1814); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:274:24: ( stmt )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=KW_BREAK && LA92_0<=KW_TRY)||(LA92_0>=KW_THIS && LA92_0<=KW_SUPER)||(LA92_0>=KW_NULL && LA92_0<=KW_FALSE)||LA92_0==SQ_BRACKET_L||LA92_0==PAR_L||LA92_0==SP_PIPE||LA92_0==OP_CURRY||(LA92_0>=OP_PLUS && LA92_0<=OP_MINUS)||(LA92_0>=OP_BANG && LA92_0<=OP_TILDA)||(LA92_0>=AT && LA92_0<=OP_POUND)||LA92_0==NUMBER) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_catch_long1816);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_catch_long1819); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, catch_long_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "catch_long"


    // $ANTLR start "catchDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:275:1: catchDef : PAR_L type id PAR_R ;
    public final void catchDef() throws RecognitionException {
        int catchDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:11: ( PAR_L type id PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:13: PAR_L type id PAR_R
            {
            match(input,PAR_L,FOLLOW_PAR_L_in_catchDef1827); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_catchDef1829);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_catchDef1831);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_catchDef1833); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, catchDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "catchDef"


    // $ANTLR start "g_finally"
    // src/net/colar/netbeans/fan/antlr/Fan.g:277:1: g_finally : KW_FINALLY ( ( BRACKET_L )=> finally_long | ( stmt )* ) ;
    public final void g_finally() throws RecognitionException {
        int g_finally_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:277:11: ( KW_FINALLY ( ( BRACKET_L )=> finally_long | ( stmt )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:277:13: KW_FINALLY ( ( BRACKET_L )=> finally_long | ( stmt )* )
            {
            match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_g_finally1841); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:277:24: ( ( BRACKET_L )=> finally_long | ( stmt )* )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==BRACKET_L) && (synpred136_Fan())) {
                alt94=1;
            }
            else if ( (LA94_0==EOF||(LA94_0>=KW_BREAK && LA94_0<=KW_FINALLY)||(LA94_0>=KW_RD_ONLY && LA94_0<=KW_VOID)||(LA94_0>=KW_ABSTRACT && LA94_0<=KW_ELSE)||(LA94_0>=KW_NULL && LA94_0<=KW_FALSE)||LA94_0==SQ_BRACKET_L||LA94_0==BRACKET_R||(LA94_0>=SP_COMMA && LA94_0<=PAR_L)||LA94_0==SP_PIPE||LA94_0==SP_SEMI||LA94_0==OP_CURRY||(LA94_0>=OP_PLUS && LA94_0<=OP_MINUS)||(LA94_0>=OP_BANG && LA94_0<=OP_TILDA)||(LA94_0>=AT && LA94_0<=NUMBER)) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:277:25: ( BRACKET_L )=> finally_long
                    {
                    pushFollow(FOLLOW_finally_long_in_g_finally1848);
                    finally_long();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:277:53: ( stmt )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:277:53: ( stmt )*
                    loop93:
                    do {
                        int alt93=2;
                        alt93 = dfa93.predict(input);
                        switch (alt93) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_finally1852);
                    	    stmt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, g_finally_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_finally"


    // $ANTLR start "finally_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:278:1: finally_long : BRACKET_L ( stmt )* BRACKET_R ;
    public final void finally_long() throws RecognitionException {
        int finally_long_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:14: ( BRACKET_L ( stmt )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:16: BRACKET_L ( stmt )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_finally_long1861); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:26: ( stmt )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( ((LA95_0>=KW_BREAK && LA95_0<=KW_TRY)||(LA95_0>=KW_THIS && LA95_0<=KW_SUPER)||(LA95_0>=KW_NULL && LA95_0<=KW_FALSE)||LA95_0==SQ_BRACKET_L||LA95_0==PAR_L||LA95_0==SP_PIPE||LA95_0==OP_CURRY||(LA95_0>=OP_PLUS && LA95_0<=OP_MINUS)||(LA95_0>=OP_BANG && LA95_0<=OP_TILDA)||(LA95_0>=AT && LA95_0<=OP_POUND)||LA95_0==NUMBER) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_finally_long1863);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_finally_long1866); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, finally_long_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "finally_long"


    // $ANTLR start "g_case"
    // src/net/colar/netbeans/fan/antlr/Fan.g:279:1: g_case : KW_CASE expr SP_COLON ( stmt )* ;
    public final void g_case() throws RecognitionException {
        int g_case_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:9: ( KW_CASE expr SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:11: KW_CASE expr SP_COLON ( stmt )*
            {
            match(input,KW_CASE,FOLLOW_KW_CASE_in_g_case1874); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_case1876);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLON,FOLLOW_SP_COLON_in_g_case1878); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:33: ( stmt )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( ((LA96_0>=KW_BREAK && LA96_0<=KW_TRY)||(LA96_0>=KW_THIS && LA96_0<=KW_SUPER)||(LA96_0>=KW_NULL && LA96_0<=KW_FALSE)||LA96_0==SQ_BRACKET_L||LA96_0==PAR_L||LA96_0==SP_PIPE||LA96_0==OP_CURRY||(LA96_0>=OP_PLUS && LA96_0<=OP_MINUS)||(LA96_0>=OP_BANG && LA96_0<=OP_TILDA)||(LA96_0>=AT && LA96_0<=OP_POUND)||LA96_0==NUMBER) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_case1880);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, g_case_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_case"


    // $ANTLR start "g_default"
    // src/net/colar/netbeans/fan/antlr/Fan.g:280:1: g_default : KW_DEFAULT SP_COLON ( stmt )* ;
    public final void g_default() throws RecognitionException {
        int g_default_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:11: ( KW_DEFAULT SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:13: KW_DEFAULT SP_COLON ( stmt )*
            {
            match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_g_default1888); if (state.failed) return ;
            match(input,SP_COLON,FOLLOW_SP_COLON_in_g_default1890); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:33: ( stmt )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=KW_BREAK && LA97_0<=KW_TRY)||(LA97_0>=KW_THIS && LA97_0<=KW_SUPER)||(LA97_0>=KW_NULL && LA97_0<=KW_FALSE)||LA97_0==SQ_BRACKET_L||LA97_0==PAR_L||LA97_0==SP_PIPE||LA97_0==OP_CURRY||(LA97_0>=OP_PLUS && LA97_0<=OP_MINUS)||(LA97_0>=OP_BANG && LA97_0<=OP_TILDA)||(LA97_0>=AT && LA97_0<=OP_POUND)||LA97_0==NUMBER) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_default1892);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, g_default_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "g_default"


    // $ANTLR start "expr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:283:1: expr : assignExpr ;
    public final void expr() throws RecognitionException {
        int expr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:7: ( assignExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:9: assignExpr
            {
            pushFollow(FOLLOW_assignExpr_in_expr1903);
            assignExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, expr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "assignExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:284:1: assignExpr : ternaryExpr ( assignOp assignExpr )? ;
    public final void assignExpr() throws RecognitionException {
        int assignExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:12: ( ternaryExpr ( assignOp assignExpr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:14: ternaryExpr ( assignOp assignExpr )?
            {
            pushFollow(FOLLOW_ternaryExpr_in_assignExpr1910);
            ternaryExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:26: ( assignOp assignExpr )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=AS_EQUAL && LA98_0<=AS_ASSIGN_OP)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:284:27: assignOp assignExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr1913);
                    assignOp();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_assignExpr_in_assignExpr1915);
                    assignExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, assignExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "assignExpr"


    // $ANTLR start "ternaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:285:1: ternaryExpr : condOrExpr ( ternaryTail )? ;
    public final void ternaryExpr() throws RecognitionException {
        int ternaryExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:285:13: ( condOrExpr ( ternaryTail )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:285:15: condOrExpr ( ternaryTail )?
            {
            pushFollow(FOLLOW_condOrExpr_in_ternaryExpr1924);
            condOrExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:285:26: ( ternaryTail )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==SP_QMARK) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:27: ternaryTail
                    {
                    pushFollow(FOLLOW_ternaryTail_in_ternaryExpr1927);
                    ternaryTail();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, ternaryExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ternaryExpr"


    // $ANTLR start "ternaryTail"
    // src/net/colar/netbeans/fan/antlr/Fan.g:287:1: ternaryTail : SP_QMARK condOrExpr SP_COLON condOrExpr ;
    public final void ternaryTail() throws RecognitionException {
        int ternaryTail_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:13: ( SP_QMARK condOrExpr SP_COLON condOrExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:15: SP_QMARK condOrExpr SP_COLON condOrExpr
            {
            match(input,SP_QMARK,FOLLOW_SP_QMARK_in_ternaryTail1937); if (state.failed) return ;
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail1939);
            condOrExpr();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLON,FOLLOW_SP_COLON_in_ternaryTail1941); if (state.failed) return ;
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail1943);
            condOrExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, ternaryTail_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ternaryTail"


    // $ANTLR start "assignOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:288:1: assignOp : ( AS_EQUAL | AS_ASSIGN_OP );
    public final void assignOp() throws RecognitionException {
        int assignOp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:288:10: ( AS_EQUAL | AS_ASSIGN_OP )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            if ( (input.LA(1)>=AS_EQUAL && input.LA(1)<=AS_ASSIGN_OP) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, assignOp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "assignOp"


    // $ANTLR start "condOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:289:1: condOrExpr : condAndExpr ( OP_OR condAndExpr )* ;
    public final void condOrExpr() throws RecognitionException {
        int condOrExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:13: ( condAndExpr ( OP_OR condAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:15: condAndExpr ( OP_OR condAndExpr )*
            {
            pushFollow(FOLLOW_condAndExpr_in_condOrExpr1962);
            condAndExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:28: ( OP_OR condAndExpr )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==OP_OR) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:289:29: OP_OR condAndExpr
            	    {
            	    match(input,OP_OR,FOLLOW_OP_OR_in_condOrExpr1966); if (state.failed) return ;
            	    pushFollow(FOLLOW_condAndExpr_in_condOrExpr1969);
            	    condAndExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, condOrExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "condOrExpr"


    // $ANTLR start "condAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:290:1: condAndExpr : equalityExpr ( OP_AND equalityExpr )* ;
    public final void condAndExpr() throws RecognitionException {
        int condAndExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:290:14: ( equalityExpr ( OP_AND equalityExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:290:16: equalityExpr ( OP_AND equalityExpr )*
            {
            pushFollow(FOLLOW_equalityExpr_in_condAndExpr1979);
            equalityExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:290:29: ( OP_AND equalityExpr )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==OP_AND) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:290:30: OP_AND equalityExpr
            	    {
            	    match(input,OP_AND,FOLLOW_OP_AND_in_condAndExpr1982); if (state.failed) return ;
            	    pushFollow(FOLLOW_equalityExpr_in_condAndExpr1985);
            	    equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, condAndExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "condAndExpr"


    // $ANTLR start "equalityExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:291:1: equalityExpr : relationalExpr ( CP_EQUALITY relationalExpr )* ;
    public final void equalityExpr() throws RecognitionException {
        int equalityExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:14: ( relationalExpr ( CP_EQUALITY relationalExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:16: relationalExpr ( CP_EQUALITY relationalExpr )*
            {
            pushFollow(FOLLOW_relationalExpr_in_equalityExpr1995);
            relationalExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:31: ( CP_EQUALITY relationalExpr )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==CP_EQUALITY) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:291:32: CP_EQUALITY relationalExpr
            	    {
            	    match(input,CP_EQUALITY,FOLLOW_CP_EQUALITY_in_equalityExpr1998); if (state.failed) return ;
            	    pushFollow(FOLLOW_relationalExpr_in_equalityExpr2000);
            	    relationalExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, equalityExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "equalityExpr"


    // $ANTLR start "relationalExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:293:1: relationalExpr : elvisExpr ( typeCheck | compare ) ;
    public final void relationalExpr() throws RecognitionException {
        int relationalExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:293:16: ( elvisExpr ( typeCheck | compare ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:293:20: elvisExpr ( typeCheck | compare )
            {
            pushFollow(FOLLOW_elvisExpr_in_relationalExpr2013);
            elvisExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:293:30: ( typeCheck | compare )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==KW_AS||(LA103_0>=KW_IS && LA103_0<=KW_ISNOT)) ) {
                alt103=1;
            }
            else if ( (LA103_0==EOF||(LA103_0>=KW_BREAK && LA103_0<=KW_USING)||(LA103_0>=KW_RD_ONLY && LA103_0<=KW_ELSE)||(LA103_0>=KW_NULL && LA103_0<=KW_FALSE)||(LA103_0>=SQ_BRACKET_L && LA103_0<=SP_QMARK)||LA103_0==SP_PIPE||(LA103_0>=SP_SEMI && LA103_0<=CP_COMPARATORS)||LA103_0==OP_CURRY||(LA103_0>=OP_PLUS && LA103_0<=OP_MINUS)||(LA103_0>=OP_BANG && LA103_0<=OP_TILDA)||(LA103_0>=AT && LA103_0<=NUMBER)) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:293:31: typeCheck
                    {
                    pushFollow(FOLLOW_typeCheck_in_relationalExpr2016);
                    typeCheck();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:293:43: compare
                    {
                    pushFollow(FOLLOW_compare_in_relationalExpr2020);
                    compare();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, relationalExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "relationalExpr"


    // $ANTLR start "typeCheck"
    // src/net/colar/netbeans/fan/antlr/Fan.g:295:1: typeCheck : ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* ;
    public final void typeCheck() throws RecognitionException {
        int typeCheck_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:295:11: ( ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:295:15: ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )*
            {
            if ( input.LA(1)==KW_AS||(input.LA(1)>=KW_IS && input.LA(1)<=KW_ISNOT) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_typeRoot_in_typeCheck2043);
            typeRoot();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:295:51: ( ( SP_QMARK )? {...}? '[]' )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==SP_QMARK) ) {
                    int LA105_2 = input.LA(2);

                    if ( (LA105_2==LIST_TYPE) ) {
                        alt105=1;
                    }


                }
                else if ( (LA105_0==LIST_TYPE) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:295:52: ( SP_QMARK )? {...}? '[]'
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:295:52: ( SP_QMARK )?
            	    int alt104=2;
            	    int LA104_0 = input.LA(1);

            	    if ( (LA104_0==SP_QMARK) ) {
            	        alt104=1;
            	    }
            	    switch (alt104) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            match(input,SP_QMARK,FOLLOW_SP_QMARK_in_typeCheck2046); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "typeCheck", "notAfterEol()");
            	    }
            	    match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_typeCheck2051); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, typeCheck_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeCheck"


    // $ANTLR start "compare"
    // src/net/colar/netbeans/fan/antlr/Fan.g:296:1: compare : ( CP_COMPARATORS elvisExpr )* ;
    public final void compare() throws RecognitionException {
        int compare_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:10: ( ( CP_COMPARATORS elvisExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:14: ( CP_COMPARATORS elvisExpr )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:14: ( CP_COMPARATORS elvisExpr )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==CP_COMPARATORS) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:296:15: CP_COMPARATORS elvisExpr
            	    {
            	    match(input,CP_COMPARATORS,FOLLOW_CP_COMPARATORS_in_compare2064); if (state.failed) return ;
            	    pushFollow(FOLLOW_elvisExpr_in_compare2066);
            	    elvisExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, compare_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "compare"


    // $ANTLR start "elvisExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:298:1: elvisExpr : rangeExpr ( OP_ELVIS rangeExpr )* ;
    public final void elvisExpr() throws RecognitionException {
        int elvisExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:12: ( rangeExpr ( OP_ELVIS rangeExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:14: rangeExpr ( OP_ELVIS rangeExpr )*
            {
            pushFollow(FOLLOW_rangeExpr_in_elvisExpr2077);
            rangeExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:24: ( OP_ELVIS rangeExpr )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==OP_ELVIS) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:298:25: OP_ELVIS rangeExpr
            	    {
            	    match(input,OP_ELVIS,FOLLOW_OP_ELVIS_in_elvisExpr2080); if (state.failed) return ;
            	    pushFollow(FOLLOW_rangeExpr_in_elvisExpr2082);
            	    rangeExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, elvisExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "elvisExpr"


    // $ANTLR start "rangeExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:299:1: rangeExpr : bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* ;
    public final void rangeExpr() throws RecognitionException {
        int rangeExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:12: ( bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:14: bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            {
            pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2093);
            bitOrExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:24: ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( ((LA108_0>=OP_RANG_EXCL_OLD && LA108_0<=OP_RANGE)) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:299:25: ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr
            	    {
            	    if ( (input.LA(1)>=OP_RANG_EXCL_OLD && input.LA(1)<=OP_RANGE) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2110);
            	    bitOrExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, rangeExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "rangeExpr"


    // $ANTLR start "bitOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:300:1: bitOrExpr : bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* ;
    public final void bitOrExpr() throws RecognitionException {
        int bitOrExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:12: ( bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:14: bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            {
            pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2121);
            bitAndExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            loop109:
            do {
                int alt109=2;
                alt109 = dfa109.predict(input);
                switch (alt109) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:300:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
            	    {
            	    if ( input.LA(1)==SP_PIPE||input.LA(1)==OP_BITOR ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2132);
            	    bitAndExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, bitOrExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bitOrExpr"


    // $ANTLR start "bitAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:301:1: bitAndExpr : shiftExpr ( OP_CURRY shiftExpr )* ;
    public final void bitAndExpr() throws RecognitionException {
        int bitAndExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:301:13: ( shiftExpr ( OP_CURRY shiftExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:301:15: shiftExpr ( OP_CURRY shiftExpr )*
            {
            pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2143);
            shiftExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:301:25: ( OP_CURRY shiftExpr )*
            loop110:
            do {
                int alt110=2;
                alt110 = dfa110.predict(input);
                switch (alt110) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:301:26: OP_CURRY shiftExpr
            	    {
            	    match(input,OP_CURRY,FOLLOW_OP_CURRY_in_bitAndExpr2146); if (state.failed) return ;
            	    pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2148);
            	    shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, bitAndExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bitAndExpr"


    // $ANTLR start "shiftExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:302:1: shiftExpr : addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* ;
    public final void shiftExpr() throws RecognitionException {
        int shiftExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:12: ( addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:14: addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2160);
            addExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:22: ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( ((LA111_0>=OP_LSHIFT && LA111_0<=OP_RSHIFT)) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:302:23: ( OP_LSHIFT | OP_RSHIFT ) addExpr
            	    {
            	    if ( (input.LA(1)>=OP_LSHIFT && input.LA(1)<=OP_RSHIFT) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2171);
            	    addExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, shiftExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "shiftExpr"


    // $ANTLR start "addExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:303:1: addExpr : multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* ;
    public final void addExpr() throws RecognitionException {
        int addExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:10: ( multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:12: multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2182);
            multExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*
            loop112:
            do {
                int alt112=2;
                alt112 = dfa112.predict(input);
                switch (alt112) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:303:22: ( OP_PLUS | OP_MINUS ) multExpr
            	    {
            	    if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2193);
            	    multExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, addExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "addExpr"


    // $ANTLR start "addAppend"
    // src/net/colar/netbeans/fan/antlr/Fan.g:304:1: addAppend : ( OP_PLUS | OP_MINUS ) parenExpr ;
    public final void addAppend() throws RecognitionException {
        int addAppend_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:11: ( ( OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:13: ( OP_PLUS | OP_MINUS ) parenExpr
            {
            if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_addAppend2211);
            parenExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, addAppend_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "addAppend"


    // $ANTLR start "multExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:305:1: multExpr : parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* ;
    public final void multExpr() throws RecognitionException {
        int multExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:11: ( parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:13: parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            {
            pushFollow(FOLLOW_parenExpr_in_multExpr2219);
            parenExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:23: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( ((LA113_0>=OP_MULTI && LA113_0<=OP_MOD)) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:305:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
            	    {
            	    if ( (input.LA(1)>=OP_MULTI && input.LA(1)<=OP_MOD) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_parenExpr_in_multExpr2234);
            	    parenExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop113;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, multExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "multExpr"


    // $ANTLR start "parenExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:306:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );
    public final void parenExpr() throws RecognitionException {
        int parenExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:306:12: ( castExpr | groupedExpr | unaryExpr )
            int alt114=3;
            alt114 = dfa114.predict(input);
            switch (alt114) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:306:14: castExpr
                    {
                    pushFollow(FOLLOW_castExpr_in_parenExpr2245);
                    castExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:306:25: groupedExpr
                    {
                    pushFollow(FOLLOW_groupedExpr_in_parenExpr2249);
                    groupedExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:306:39: unaryExpr
                    {
                    pushFollow(FOLLOW_unaryExpr_in_parenExpr2253);
                    unaryExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, parenExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "parenExpr"


    // $ANTLR start "castExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:308:1: castExpr : {...}? PAR_L type PAR_R parenExpr ;
    public final void castExpr() throws RecognitionException {
        int castExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:308:11: ({...}? PAR_L type PAR_R parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:308:13: {...}? PAR_L type PAR_R parenExpr
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "castExpr", "notAfterEol()");
            }
            match(input,PAR_L,FOLLOW_PAR_L_in_castExpr2264); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_castExpr2266);
            type();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_castExpr2268); if (state.failed) return ;
            pushFollow(FOLLOW_parenExpr_in_castExpr2270);
            parenExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, castExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "castExpr"


    // $ANTLR start "groupedExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:310:1: groupedExpr : PAR_L expr PAR_R ( termChain )* ;
    public final void groupedExpr() throws RecognitionException {
        int groupedExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:14: ( PAR_L expr PAR_R ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:16: PAR_L expr PAR_R ( termChain )*
            {
            match(input,PAR_L,FOLLOW_PAR_L_in_groupedExpr2279); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_groupedExpr2281);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_groupedExpr2283); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:33: ( termChain )*
            loop115:
            do {
                int alt115=2;
                alt115 = dfa115.predict(input);
                switch (alt115) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_groupedExpr2285);
            	    termChain();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 98, groupedExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "groupedExpr"


    // $ANTLR start "unaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:311:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );
    public final void unaryExpr() throws RecognitionException {
        int unaryExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:311:12: ( prefixExpr | postfixExpr | termExpr )
            int alt116=3;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:311:14: prefixExpr
                    {
                    pushFollow(FOLLOW_prefixExpr_in_unaryExpr2294);
                    prefixExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:311:27: postfixExpr
                    {
                    pushFollow(FOLLOW_postfixExpr_in_unaryExpr2298);
                    postfixExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:311:41: termExpr
                    {
                    pushFollow(FOLLOW_termExpr_in_unaryExpr2302);
                    termExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, unaryExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "unaryExpr"


    // $ANTLR start "prefixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:312:1: prefixExpr : ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr ;
    public final void prefixExpr() throws RecognitionException {
        int prefixExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:312:13: ( ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:312:15: ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr
            {
            if ( input.LA(1)==OP_CURRY||(input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS)||(input.LA(1)>=OP_BANG && input.LA(1)<=OP_TILDA) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_prefixExpr2338);
            parenExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, prefixExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "prefixExpr"


    // $ANTLR start "postfixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:313:1: postfixExpr : termExpr ( OP_2PLUS | OP_2MINUS ) ;
    public final void postfixExpr() throws RecognitionException {
        int postfixExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:14: ( termExpr ( OP_2PLUS | OP_2MINUS ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:16: termExpr ( OP_2PLUS | OP_2MINUS )
            {
            pushFollow(FOLLOW_termExpr_in_postfixExpr2347);
            termExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( (input.LA(1)>=OP_2PLUS && input.LA(1)<=OP_2MINUS) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, postfixExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "postfixExpr"


    // $ANTLR start "termExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:314:1: termExpr : termBase ( termChain )* ;
    public final void termExpr() throws RecognitionException {
        int termExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:11: ( termBase ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:13: termBase ( termChain )*
            {
            pushFollow(FOLLOW_termBase_in_termExpr2364);
            termBase();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:22: ( termChain )*
            loop117:
            do {
                int alt117=2;
                alt117 = dfa117.predict(input);
                switch (alt117) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_termExpr2366);
            	    termChain();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 102, termExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "termExpr"


    // $ANTLR start "termBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:316:1: termBase : ( idExprReq | literal | typeBase | id );
    public final void termBase() throws RecognitionException {
        int termBase_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:11: ( idExprReq | literal | typeBase | id )
            int alt118=4;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:13: idExprReq
                    {
                    pushFollow(FOLLOW_idExprReq_in_termBase2376);
                    idExprReq();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:25: literal
                    {
                    pushFollow(FOLLOW_literal_in_termBase2380);
                    literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:35: typeBase
                    {
                    pushFollow(FOLLOW_typeBase_in_termBase2384);
                    typeBase();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:46: id
                    {
                    pushFollow(FOLLOW_id_in_termBase2388);
                    id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, termBase_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "termBase"


    // $ANTLR start "typeBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:317:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );
    public final void typeBase() throws RecognitionException {
        int typeBase_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:10: ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock )
            int alt119=8;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:317:12: typeLiteral
                    {
                    pushFollow(FOLLOW_typeLiteral_in_typeBase2395);
                    typeLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:317:26: slotLiteral
                    {
                    pushFollow(FOLLOW_slotLiteral_in_typeBase2399);
                    slotLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:317:40: namedSuper
                    {
                    pushFollow(FOLLOW_namedSuper_in_typeBase2403);
                    namedSuper();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:317:53: staticCall
                    {
                    pushFollow(FOLLOW_staticCall_in_typeBase2407);
                    staticCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:318:19: dsl
                    {
                    pushFollow(FOLLOW_dsl_in_typeBase2429);
                    dsl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:318:25: closure
                    {
                    pushFollow(FOLLOW_closure_in_typeBase2433);
                    closure();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:318:35: simple
                    {
                    pushFollow(FOLLOW_simple_in_typeBase2437);
                    simple();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:318:44: ctorBlock
                    {
                    pushFollow(FOLLOW_ctorBlock_in_typeBase2441);
                    ctorBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 104, typeBase_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeBase"


    // $ANTLR start "ctorBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:319:1: ctorBlock : type itBlock ;
    public final void ctorBlock() throws RecognitionException {
        int ctorBlock_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:319:11: ( type itBlock )
            // src/net/colar/netbeans/fan/antlr/Fan.g:319:13: type itBlock
            {
            pushFollow(FOLLOW_type_in_ctorBlock2448);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_itBlock_in_ctorBlock2450);
            itBlock();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, ctorBlock_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ctorBlock"


    // $ANTLR start "staticCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:320:1: staticCall : type DOT idExpr ;
    public final void staticCall() throws RecognitionException {
        int staticCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:320:12: ( type DOT idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:320:14: type DOT idExpr
            {
            pushFollow(FOLLOW_type_in_staticCall2457);
            type();

            state._fsp--;
            if (state.failed) return ;
            match(input,DOT,FOLLOW_DOT_in_staticCall2459); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_staticCall2461);
            idExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 106, staticCall_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "staticCall"


    // $ANTLR start "termChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:322:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock );
    public final void termChain() throws RecognitionException {
        int termChain_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:322:12: ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock )
            int alt120=7;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt120=1;
                }
                break;
            case OP_ARROW:
                {
                alt120=2;
                }
                break;
            case OP_SAFE_CALL:
                {
                alt120=3;
                }
                break;
            case OP_SAFEDYN_CALL:
                {
                alt120=4;
                }
                break;
            case SQ_BRACKET_L:
                {
                alt120=5;
                }
                break;
            case PAR_L:
                {
                alt120=6;
                }
                break;
            case BRACKET_L:
                {
                alt120=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:322:14: dotCall
                    {
                    pushFollow(FOLLOW_dotCall_in_termChain2470);
                    dotCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:322:24: dynCall
                    {
                    pushFollow(FOLLOW_dynCall_in_termChain2474);
                    dynCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:322:34: safeDotCall
                    {
                    pushFollow(FOLLOW_safeDotCall_in_termChain2478);
                    safeDotCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:322:48: safeDynCall
                    {
                    pushFollow(FOLLOW_safeDynCall_in_termChain2482);
                    safeDynCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:323:4: indexExpr
                    {
                    pushFollow(FOLLOW_indexExpr_in_termChain2489);
                    indexExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:323:16: callOp
                    {
                    pushFollow(FOLLOW_callOp_in_termChain2493);
                    callOp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:323:25: itBlock
                    {
                    pushFollow(FOLLOW_itBlock_in_termChain2497);
                    itBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, termChain_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "termChain"


    // $ANTLR start "dsl"
    // src/net/colar/netbeans/fan/antlr/Fan.g:324:1: dsl : simpleType DSL ;
    public final void dsl() throws RecognitionException {
        int dsl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:324:13: ( simpleType DSL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:324:15: simpleType DSL
            {
            pushFollow(FOLLOW_simpleType_in_dsl2512);
            simpleType();

            state._fsp--;
            if (state.failed) return ;
            match(input,DSL,FOLLOW_DSL_in_dsl2514); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 108, dsl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "dsl"


    // $ANTLR start "itBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:327:1: itBlock : BRACKET_L ( stmt ( SP_COMMA )? ( SP_SEMI )? )* BRACKET_R ;
    public final void itBlock() throws RecognitionException {
        int itBlock_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:10: ( BRACKET_L ( stmt ( SP_COMMA )? ( SP_SEMI )? )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:12: BRACKET_L ( stmt ( SP_COMMA )? ( SP_SEMI )? )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_itBlock2524); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:22: ( stmt ( SP_COMMA )? ( SP_SEMI )? )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( ((LA123_0>=KW_BREAK && LA123_0<=KW_TRY)||(LA123_0>=KW_THIS && LA123_0<=KW_SUPER)||(LA123_0>=KW_NULL && LA123_0<=KW_FALSE)||LA123_0==SQ_BRACKET_L||LA123_0==PAR_L||LA123_0==SP_PIPE||LA123_0==OP_CURRY||(LA123_0>=OP_PLUS && LA123_0<=OP_MINUS)||(LA123_0>=OP_BANG && LA123_0<=OP_TILDA)||(LA123_0>=AT && LA123_0<=OP_POUND)||LA123_0==NUMBER) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:23: stmt ( SP_COMMA )? ( SP_SEMI )?
            	    {
            	    pushFollow(FOLLOW_stmt_in_itBlock2527);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:28: ( SP_COMMA )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==SP_COMMA) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
            	            {
            	            match(input,SP_COMMA,FOLLOW_SP_COMMA_in_itBlock2529); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:38: ( SP_SEMI )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==SP_SEMI) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
            	            {
            	            match(input,SP_SEMI,FOLLOW_SP_SEMI_in_itBlock2532); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_itBlock2537); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 109, itBlock_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "itBlock"


    // $ANTLR start "dotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:328:1: dotCall : DOT idExpr ;
    public final void dotCall() throws RecognitionException {
        int dotCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:328:10: ( DOT idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:328:12: DOT idExpr
            {
            match(input,DOT,FOLLOW_DOT_in_dotCall2545); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_dotCall2547);
            idExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 110, dotCall_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "dotCall"


    // $ANTLR start "dynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:329:1: dynCall : OP_ARROW idExpr ;
    public final void dynCall() throws RecognitionException {
        int dynCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:329:10: ( OP_ARROW idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:329:12: OP_ARROW idExpr
            {
            match(input,OP_ARROW,FOLLOW_OP_ARROW_in_dynCall2555); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_dynCall2557);
            idExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 111, dynCall_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "dynCall"


    // $ANTLR start "safeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:330:1: safeDotCall : OP_SAFE_CALL idExpr ;
    public final void safeDotCall() throws RecognitionException {
        int safeDotCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:14: ( OP_SAFE_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:16: OP_SAFE_CALL idExpr
            {
            match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_safeDotCall2565); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_safeDotCall2567);
            idExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 112, safeDotCall_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "safeDotCall"


    // $ANTLR start "safeDynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:331:1: safeDynCall : OP_SAFEDYN_CALL idExpr ;
    public final void safeDynCall() throws RecognitionException {
        int safeDynCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:13: ( OP_SAFEDYN_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:15: OP_SAFEDYN_CALL idExpr
            {
            match(input,OP_SAFEDYN_CALL,FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall2574); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_safeDynCall2576);
            idExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 113, safeDynCall_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "safeDynCall"


    // $ANTLR start "indexExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:332:1: indexExpr : {...}? SQ_BRACKET_L expr SQ_BRACKET_R ;
    public final void indexExpr() throws RecognitionException {
        int indexExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:12: ({...}? SQ_BRACKET_L expr SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:14: {...}? SQ_BRACKET_L expr SQ_BRACKET_R
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "indexExpr", "notAfterEol()");
            }
            match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_indexExpr2586); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_indexExpr2588);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_indexExpr2590); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 114, indexExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "indexExpr"


    // $ANTLR start "callOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:334:1: callOp : {...}? PAR_L ( args )? PAR_R ( closure )* ;
    public final void callOp() throws RecognitionException {
        int callOp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:9: ({...}? PAR_L ( args )? PAR_R ( closure )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:11: {...}? PAR_L ( args )? PAR_R ( closure )*
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "callOp", "notAfterEol()");
            }
            match(input,PAR_L,FOLLOW_PAR_L_in_callOp2601); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:34: ( args )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( ((LA124_0>=KW_THIS && LA124_0<=KW_SUPER)||(LA124_0>=KW_NULL && LA124_0<=KW_FALSE)||LA124_0==SQ_BRACKET_L||LA124_0==PAR_L||LA124_0==SP_PIPE||LA124_0==OP_CURRY||(LA124_0>=OP_PLUS && LA124_0<=OP_MINUS)||(LA124_0>=OP_BANG && LA124_0<=OP_TILDA)||(LA124_0>=AT && LA124_0<=OP_POUND)||LA124_0==NUMBER) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callOp2603);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_callOp2607); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:47: ( closure )*
            loop125:
            do {
                int alt125=2;
                alt125 = dfa125.predict(input);
                switch (alt125) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: closure
            	    {
            	    pushFollow(FOLLOW_closure_in_callOp2609);
            	    closure();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 115, callOp_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "callOp"


    // $ANTLR start "closure"
    // src/net/colar/netbeans/fan/antlr/Fan.g:335:1: closure : funcType BRACKET_L ( stmt )* BRACKET_R ;
    public final void closure() throws RecognitionException {
        int closure_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:10: ( funcType BRACKET_L ( stmt )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:14: funcType BRACKET_L ( stmt )* BRACKET_R
            {
            pushFollow(FOLLOW_funcType_in_closure2620);
            funcType();

            state._fsp--;
            if (state.failed) return ;
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_closure2622); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:33: ( stmt )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( ((LA126_0>=KW_BREAK && LA126_0<=KW_TRY)||(LA126_0>=KW_THIS && LA126_0<=KW_SUPER)||(LA126_0>=KW_NULL && LA126_0<=KW_FALSE)||LA126_0==SQ_BRACKET_L||LA126_0==PAR_L||LA126_0==SP_PIPE||LA126_0==OP_CURRY||(LA126_0>=OP_PLUS && LA126_0<=OP_MINUS)||(LA126_0>=OP_BANG && LA126_0<=OP_TILDA)||(LA126_0>=AT && LA126_0<=OP_POUND)||LA126_0==NUMBER) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_closure2624);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_closure2627); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 116, closure_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "closure"


    // $ANTLR start "idExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:337:1: idExpr : ( idExprReq | id );
    public final void idExpr() throws RecognitionException {
        int idExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:10: ( idExprReq | id )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==AT) ) {
                alt127=1;
            }
            else if ( (LA127_0==ID) ) {
                int LA127_2 = input.LA(2);

                if ( (synpred203_Fan()) ) {
                    alt127=1;
                }
                else if ( (true) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:337:12: idExprReq
                    {
                    pushFollow(FOLLOW_idExprReq_in_idExpr2637);
                    idExprReq();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:337:24: id
                    {
                    pushFollow(FOLLOW_id_in_idExpr2641);
                    id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 117, idExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "idExpr"


    // $ANTLR start "idExprReq"
    // src/net/colar/netbeans/fan/antlr/Fan.g:339:1: idExprReq : ( field | call );
    public final void idExprReq() throws RecognitionException {
        int idExprReq_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:339:11: ( field | call )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==AT) ) {
                alt128=1;
            }
            else if ( (LA128_0==ID) ) {
                alt128=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:339:13: field
                    {
                    pushFollow(FOLLOW_field_in_idExprReq2649);
                    field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:339:21: call
                    {
                    pushFollow(FOLLOW_call_in_idExprReq2653);
                    call();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 118, idExprReq_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "idExprReq"


    // $ANTLR start "field"
    // src/net/colar/netbeans/fan/antlr/Fan.g:341:1: field : AT ID ;
    public final void field() throws RecognitionException {
        int field_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:341:8: ( AT ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:341:10: AT ID
            {
            match(input,AT,FOLLOW_AT_in_field2662); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_field2664); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 119, field_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "field"


    // $ANTLR start "call"
    // src/net/colar/netbeans/fan/antlr/Fan.g:343:1: call : id ( ( callParams closure ) | callParams | closure ) ;
    public final void call() throws RecognitionException {
        int call_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:7: ( id ( ( callParams closure ) | callParams | closure ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:9: id ( ( callParams closure ) | callParams | closure )
            {
            pushFollow(FOLLOW_id_in_call2674);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:12: ( ( callParams closure ) | callParams | closure )
            int alt129=3;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==PAR_L) ) {
                int LA129_1 = input.LA(2);

                if ( ((synpred205_Fan()&&(notAfterEol()))) ) {
                    alt129=1;
                }
                else if ( ((synpred206_Fan()&&(notAfterEol()))) ) {
                    alt129=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA129_0==SP_PIPE) ) {
                alt129=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:343:13: ( callParams closure )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:343:13: ( callParams closure )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:343:14: callParams closure
                    {
                    pushFollow(FOLLOW_callParams_in_call2678);
                    callParams();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_closure_in_call2680);
                    closure();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:343:36: callParams
                    {
                    pushFollow(FOLLOW_callParams_in_call2685);
                    callParams();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:343:49: closure
                    {
                    pushFollow(FOLLOW_closure_in_call2689);
                    closure();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 120, call_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "call"


    // $ANTLR start "callParams"
    // src/net/colar/netbeans/fan/antlr/Fan.g:345:1: callParams : {...}? PAR_L ( args )? PAR_R ;
    public final void callParams() throws RecognitionException {
        int callParams_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:12: ({...}? PAR_L ( args )? PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:14: {...}? PAR_L ( args )? PAR_R
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "callParams", "notAfterEol()");
            }
            match(input,PAR_L,FOLLOW_PAR_L_in_callParams2700); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:37: ( args )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( ((LA130_0>=KW_THIS && LA130_0<=KW_SUPER)||(LA130_0>=KW_NULL && LA130_0<=KW_FALSE)||LA130_0==SQ_BRACKET_L||LA130_0==PAR_L||LA130_0==SP_PIPE||LA130_0==OP_CURRY||(LA130_0>=OP_PLUS && LA130_0<=OP_MINUS)||(LA130_0>=OP_BANG && LA130_0<=OP_TILDA)||(LA130_0>=AT && LA130_0<=OP_POUND)||LA130_0==NUMBER) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callParams2702);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_callParams2705); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 121, callParams_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "callParams"


    // $ANTLR start "args"
    // src/net/colar/netbeans/fan/antlr/Fan.g:346:1: args : expr ( SP_COMMA expr )* ;
    public final void args() throws RecognitionException {
        int args_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:346:8: ( expr ( SP_COMMA expr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:346:10: expr ( SP_COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_args2714);
            expr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:346:15: ( SP_COMMA expr )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==SP_COMMA) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:346:16: SP_COMMA expr
            	    {
            	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_args2717); if (state.failed) return ;
            	    pushFollow(FOLLOW_expr_in_args2720);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 122, args_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "args"


    // $ANTLR start "literal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:348:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple );
    public final void literal() throws RecognitionException {
        int literal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:10: ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple )
            int alt132=17;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:12: KW_NULL
                    {
                    match(input,KW_NULL,FOLLOW_KW_NULL_in_literal2731); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:22: KW_THIS
                    {
                    match(input,KW_THIS,FOLLOW_KW_THIS_in_literal2735); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:32: KW_SUPER
                    {
                    match(input,KW_SUPER,FOLLOW_KW_SUPER_in_literal2739); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:43: KW_IT
                    {
                    match(input,KW_IT,FOLLOW_KW_IT_in_literal2743); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:51: KW_TRUE
                    {
                    match(input,KW_TRUE,FOLLOW_KW_TRUE_in_literal2747); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:61: KW_FALSE
                    {
                    match(input,KW_FALSE,FOLLOW_KW_FALSE_in_literal2751); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:72: QUOTSTR
                    {
                    match(input,QUOTSTR,FOLLOW_QUOTSTR_in_literal2755); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:82: STR
                    {
                    match(input,STR,FOLLOW_STR_in_literal2759); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:88: URI
                    {
                    match(input,URI,FOLLOW_URI_in_literal2763); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:349:4: number
                    {
                    pushFollow(FOLLOW_number_in_literal2770);
                    number();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:349:13: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_literal2774); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:349:20: namedSuper
                    {
                    pushFollow(FOLLOW_namedSuper_in_literal2778);
                    namedSuper();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:350:4: slotLiteral
                    {
                    pushFollow(FOLLOW_slotLiteral_in_literal2785);
                    slotLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:350:18: typeLiteral
                    {
                    pushFollow(FOLLOW_typeLiteral_in_literal2789);
                    typeLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:350:32: list
                    {
                    pushFollow(FOLLOW_list_in_literal2793);
                    list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 16 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:350:39: map
                    {
                    pushFollow(FOLLOW_map_in_literal2797);
                    map();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:350:45: simple
                    {
                    pushFollow(FOLLOW_simple_in_literal2801);
                    simple();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 123, literal_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "literal"


    // $ANTLR start "typeLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:351:1: typeLiteral : type {...}? OP_POUND ;
    public final void typeLiteral() throws RecognitionException {
        int typeLiteral_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:13: ( type {...}? OP_POUND )
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:17: type {...}? OP_POUND
            {
            pushFollow(FOLLOW_type_in_typeLiteral2810);
            type();

            state._fsp--;
            if (state.failed) return ;
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "typeLiteral", "notAfterEol()");
            }
            match(input,OP_POUND,FOLLOW_OP_POUND_in_typeLiteral2814); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 124, typeLiteral_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeLiteral"


    // $ANTLR start "slotLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:352:1: slotLiteral : ( type )? OP_POUND {...}? id ;
    public final void slotLiteral() throws RecognitionException {
        int slotLiteral_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:352:13: ( ( type )? OP_POUND {...}? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:352:17: ( type )? OP_POUND {...}? id
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:352:17: ( type )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==SQ_BRACKET_L||LA133_0==SP_PIPE||LA133_0==ID) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_slotLiteral2823);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,OP_POUND,FOLLOW_OP_POUND_in_slotLiteral2826); if (state.failed) return ;
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "slotLiteral", "notAfterEol()");
            }
            pushFollow(FOLLOW_id_in_slotLiteral2830);
            id();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 125, slotLiteral_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "slotLiteral"


    // $ANTLR start "namedSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:353:1: namedSuper : simpleType DOT KW_SUPER ;
    public final void namedSuper() throws RecognitionException {
        int namedSuper_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:13: ( simpleType DOT KW_SUPER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:15: simpleType DOT KW_SUPER
            {
            pushFollow(FOLLOW_simpleType_in_namedSuper2838);
            simpleType();

            state._fsp--;
            if (state.failed) return ;
            match(input,DOT,FOLLOW_DOT_in_namedSuper2840); if (state.failed) return ;
            match(input,KW_SUPER,FOLLOW_KW_SUPER_in_namedSuper2842); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 126, namedSuper_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "namedSuper"


    // $ANTLR start "list"
    // src/net/colar/netbeans/fan/antlr/Fan.g:354:1: list : ( type {...}?)? SQ_BRACKET_L listItems SQ_BRACKET_R ;
    public final void list() throws RecognitionException {
        int list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:8: ( ( type {...}?)? SQ_BRACKET_L listItems SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:10: ( type {...}?)? SQ_BRACKET_L listItems SQ_BRACKET_R
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:10: ( type {...}?)?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==SQ_BRACKET_L) ) {
                int LA134_1 = input.LA(2);

                if ( (synpred226_Fan()) ) {
                    alt134=1;
                }
            }
            else if ( (LA134_0==SP_PIPE||LA134_0==ID) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:354:11: type {...}?
                    {
                    pushFollow(FOLLOW_type_in_list2852);
                    type();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "list", "notAfterEol()");
                    }

                    }
                    break;

            }

            match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_list2858); if (state.failed) return ;
            pushFollow(FOLLOW_listItems_in_list2860);
            listItems();

            state._fsp--;
            if (state.failed) return ;
            match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_list2862); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 127, list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "list"


    // $ANTLR start "listItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:355:1: listItems : ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA );
    public final void listItems() throws RecognitionException {
        int listItems_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:12: ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( ((LA137_0>=KW_THIS && LA137_0<=KW_SUPER)||(LA137_0>=KW_NULL && LA137_0<=KW_FALSE)||LA137_0==SQ_BRACKET_L||LA137_0==PAR_L||LA137_0==SP_PIPE||LA137_0==OP_CURRY||(LA137_0>=OP_PLUS && LA137_0<=OP_MINUS)||(LA137_0>=OP_BANG && LA137_0<=OP_TILDA)||(LA137_0>=AT && LA137_0<=OP_POUND)||LA137_0==NUMBER) ) {
                alt137=1;
            }
            else if ( (LA137_0==SP_COMMA) ) {
                alt137=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:355:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:355:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:355:15: expr ( SP_COMMA expr )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_listItems2871);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:355:20: ( SP_COMMA expr )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==SP_COMMA) ) {
                            int LA135_1 = input.LA(2);

                            if ( ((LA135_1>=KW_THIS && LA135_1<=KW_SUPER)||(LA135_1>=KW_NULL && LA135_1<=KW_FALSE)||LA135_1==SQ_BRACKET_L||LA135_1==PAR_L||LA135_1==SP_PIPE||LA135_1==OP_CURRY||(LA135_1>=OP_PLUS && LA135_1<=OP_MINUS)||(LA135_1>=OP_BANG && LA135_1<=OP_TILDA)||(LA135_1>=AT && LA135_1<=OP_POUND)||LA135_1==NUMBER) ) {
                                alt135=1;
                            }


                        }


                        switch (alt135) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:355:21: SP_COMMA expr
                    	    {
                    	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems2874); if (state.failed) return ;
                    	    pushFollow(FOLLOW_expr_in_listItems2876);
                    	    expr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:355:38: ( SP_COMMA )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==SP_COMMA) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems2881); if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:355:51: SP_COMMA
                    {
                    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems2887); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 128, listItems_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "listItems"


    // $ANTLR start "map"
    // src/net/colar/netbeans/fan/antlr/Fan.g:356:1: map : ( mapType {...}?)? SQ_BRACKET_L mapItems SQ_BRACKET_R ;
    public final void map() throws RecognitionException {
        int map_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:7: ( ( mapType {...}?)? SQ_BRACKET_L mapItems SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:9: ( mapType {...}?)? SQ_BRACKET_L mapItems SQ_BRACKET_R
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:9: ( mapType {...}?)?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==SQ_BRACKET_L) ) {
                int LA138_1 = input.LA(2);

                if ( (synpred230_Fan()) ) {
                    alt138=1;
                }
            }
            else if ( (LA138_0==SP_PIPE||LA138_0==ID) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:356:10: mapType {...}?
                    {
                    pushFollow(FOLLOW_mapType_in_map2897);
                    mapType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "map", "notAfterEol()");
                    }

                    }
                    break;

            }

            match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_map2903); if (state.failed) return ;
            pushFollow(FOLLOW_mapItems_in_map2905);
            mapItems();

            state._fsp--;
            if (state.failed) return ;
            match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_map2907); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 129, map_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "map"


    // $ANTLR start "mapItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:357:1: mapItems : ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON );
    public final void mapItems() throws RecognitionException {
        int mapItems_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:357:11: ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( ((LA141_0>=KW_THIS && LA141_0<=KW_SUPER)||(LA141_0>=KW_NULL && LA141_0<=KW_FALSE)||LA141_0==SQ_BRACKET_L||LA141_0==PAR_L||LA141_0==SP_PIPE||LA141_0==OP_CURRY||(LA141_0>=OP_PLUS && LA141_0<=OP_MINUS)||(LA141_0>=OP_BANG && LA141_0<=OP_TILDA)||(LA141_0>=AT && LA141_0<=OP_POUND)||LA141_0==NUMBER) ) {
                alt141=1;
            }
            else if ( (LA141_0==SP_COLON) ) {
                alt141=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:357:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:357:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:357:14: mapPair ( SP_COMMA mapPair )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_mapPair_in_mapItems2916);
                    mapPair();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:357:22: ( SP_COMMA mapPair )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==SP_COMMA) ) {
                            int LA139_1 = input.LA(2);

                            if ( ((LA139_1>=KW_THIS && LA139_1<=KW_SUPER)||(LA139_1>=KW_NULL && LA139_1<=KW_FALSE)||LA139_1==SQ_BRACKET_L||LA139_1==PAR_L||LA139_1==SP_PIPE||LA139_1==OP_CURRY||(LA139_1>=OP_PLUS && LA139_1<=OP_MINUS)||(LA139_1>=OP_BANG && LA139_1<=OP_TILDA)||(LA139_1>=AT && LA139_1<=OP_POUND)||LA139_1==NUMBER) ) {
                                alt139=1;
                            }


                        }


                        switch (alt139) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:357:23: SP_COMMA mapPair
                    	    {
                    	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems2919); if (state.failed) return ;
                    	    pushFollow(FOLLOW_mapPair_in_mapItems2921);
                    	    mapPair();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:357:42: ( SP_COMMA )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==SP_COMMA) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems2925); if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:357:55: SP_COLON
                    {
                    match(input,SP_COLON,FOLLOW_SP_COLON_in_mapItems2931); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 130, mapItems_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mapItems"


    // $ANTLR start "mapPair"
    // src/net/colar/netbeans/fan/antlr/Fan.g:358:1: mapPair : expr SP_COLON expr ;
    public final void mapPair() throws RecognitionException {
        int mapPair_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:358:10: ( expr SP_COLON expr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:358:12: expr SP_COLON expr
            {
            pushFollow(FOLLOW_expr_in_mapPair2939);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLON,FOLLOW_SP_COLON_in_mapPair2941); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_mapPair2943);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 131, mapPair_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mapPair"


    // $ANTLR start "simple"
    // src/net/colar/netbeans/fan/antlr/Fan.g:359:1: simple : type PAR_L expr PAR_R ;
    public final void simple() throws RecognitionException {
        int simple_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:9: ( type PAR_L expr PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:11: type PAR_L expr PAR_R
            {
            pushFollow(FOLLOW_type_in_simple2951);
            type();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_simple2953); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_simple2955);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_simple2957); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 132, simple_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "simple"


    // $ANTLR start "docs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:361:1: docs : ( DOC )* ;
    public final void docs() throws RecognitionException {
        int docs_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:7: ( ( DOC )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:9: ( DOC )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:9: ( DOC )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==DOC) ) {
                    int LA142_2 = input.LA(2);

                    if ( (synpred234_Fan()) ) {
                        alt142=1;
                    }


                }


                switch (alt142) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: DOC
            	    {
            	    match(input,DOC,FOLLOW_DOC_in_docs2966); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop142;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 133, docs_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "docs"


    // $ANTLR start "number"
    // src/net/colar/netbeans/fan/antlr/Fan.g:363:1: number : ( OP_MINUS )? NUMBER ;
    public final void number() throws RecognitionException {
        int number_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:9: ( ( OP_MINUS )? NUMBER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:12: ( OP_MINUS )? NUMBER
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:12: ( OP_MINUS )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==OP_MINUS) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: OP_MINUS
                    {
                    match(input,OP_MINUS,FOLLOW_OP_MINUS_in_number2977); if (state.failed) return ;

                    }
                    break;

            }

            match(input,NUMBER,FOLLOW_NUMBER_in_number2980); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 134, number_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "number"


    // $ANTLR start "facet"
    // src/net/colar/netbeans/fan/antlr/Fan.g:364:1: facet : AT id ( AS_EQUAL expr )? ;
    public final void facet() throws RecognitionException {
        int facet_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:8: ( AT id ( AS_EQUAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:10: AT id ( AS_EQUAL expr )?
            {
            match(input,AT,FOLLOW_AT_in_facet2988); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_facet2990);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:16: ( AS_EQUAL expr )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==AS_EQUAL) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:364:17: AS_EQUAL expr
                    {
                    match(input,AS_EQUAL,FOLLOW_AS_EQUAL_in_facet2993); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_facet2995);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 135, facet_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "facet"


    // $ANTLR start "eos"
    // src/net/colar/netbeans/fan/antlr/Fan.g:367:1: eos : ( SP_SEMI | {...}?);
    public final void eos() throws RecognitionException {
        int eos_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:367:6: ( SP_SEMI | {...}?)
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==SP_SEMI) ) {
                int LA145_1 = input.LA(2);

                if ( (synpred237_Fan()) ) {
                    alt145=1;
                }
                else if ( ((lookupNL())) ) {
                    alt145=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA145_0==EOF||(LA145_0>=KW_BREAK && LA145_0<=KW_USING)||(LA145_0>=KW_RD_ONLY && LA145_0<=KW_ELSE)||(LA145_0>=KW_NULL && LA145_0<=KW_FALSE)||LA145_0==SQ_BRACKET_L||LA145_0==BRACKET_R||(LA145_0>=SP_COMMA && LA145_0<=PAR_L)||LA145_0==SP_PIPE||LA145_0==OP_CURRY||(LA145_0>=OP_PLUS && LA145_0<=OP_MINUS)||(LA145_0>=OP_BANG && LA145_0<=OP_TILDA)||(LA145_0>=AT && LA145_0<=NUMBER)) ) {
                alt145=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:367:8: SP_SEMI
                    {
                    match(input,SP_SEMI,FOLLOW_SP_SEMI_in_eos3007); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:367:18: {...}?
                    {
                    if ( !((lookupNL())) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "eos", "lookupNL()");
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 136, eos_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "eos"


    // $ANTLR start "id"
    // src/net/colar/netbeans/fan/antlr/Fan.g:369:1: id : ID ;
    public final void id() throws RecognitionException {
        int id_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:5: ( ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:8: ID
            {
            match(input,ID,FOLLOW_ID_in_id3021); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 137, id_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "id"


    // $ANTLR start "getter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:375:1: getter : t= ID {...}?;
    public final void getter() throws RecognitionException {
        int getter_StartIndex = input.index();
        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:375:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:375:12: t= ID {...}?
            {
            t=(Token)match(input,ID,FOLLOW_ID_in_getter3034); if (state.failed) return ;
            if ( !((t.getText().equals("get"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "getter", "t.getText().equals(\"get\")");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 138, getter_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "getter"


    // $ANTLR start "setter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:376:1: setter : t= ID {...}?;
    public final void setter() throws RecognitionException {
        int setter_StartIndex = input.index();
        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:12: t= ID {...}?
            {
            t=(Token)match(input,ID,FOLLOW_ID_in_setter3047); if (state.failed) return ;
            if ( !((t.getText().equals("set"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "setter", "t.getText().equals(\"set\")");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 139, setter_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "setter"

    // $ANTLR start synpred7_Fan
    public final void synpred7_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:182:17: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:182:17: facet
        {
        pushFollow(FOLLOW_facet_in_synpred7_Fan444);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_Fan

    // $ANTLR start synpred9_Fan
    public final void synpred9_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:182:25: ( ( classFlags )* KW_CLASS )
        // src/net/colar/netbeans/fan/antlr/Fan.g:182:26: ( classFlags )* KW_CLASS
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:182:26: ( classFlags )*
        loop146:
        do {
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( ((LA146_0>=KW_CONST && LA146_0<=KW_STATIC)||LA146_0==KW_FINAL||(LA146_0>=KW_ABSTRACT && LA146_0<=KW_INTERNAL)) ) {
                alt146=1;
            }


            switch (alt146) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: classFlags
        	    {
        	    pushFollow(FOLLOW_classFlags_in_synpred9_Fan449);
        	    classFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop146;
            }
        } while (true);

        match(input,KW_CLASS,FOLLOW_KW_CLASS_in_synpred9_Fan452); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Fan

    // $ANTLR start synpred11_Fan
    public final void synpred11_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:183:4: ( ( protection )? KW_ENUM )
        // src/net/colar/netbeans/fan/antlr/Fan.g:183:5: ( protection )? KW_ENUM
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:183:5: ( protection )?
        int alt147=2;
        int LA147_0 = input.LA(1);

        if ( ((LA147_0>=KW_PRIVATE && LA147_0<=KW_INTERNAL)) ) {
            alt147=1;
        }
        switch (alt147) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                {
                pushFollow(FOLLOW_protection_in_synpred11_Fan463);
                protection();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,KW_ENUM,FOLLOW_KW_ENUM_in_synpred11_Fan466); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_Fan

    // $ANTLR start synpred38_Fan
    public final void synpred38_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:201:28: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:201:28: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred38_Fan755); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_Fan

    // $ANTLR start synpred39_Fan
    public final void synpred39_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:201:49: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:201:49: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred39_Fan761); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_Fan

    // $ANTLR start synpred40_Fan
    public final void synpred40_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:201:39: ( LIST_TYPE ( SP_QMARK )? )
        // src/net/colar/netbeans/fan/antlr/Fan.g:201:39: LIST_TYPE ( SP_QMARK )?
        {
        match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_synpred40_Fan759); if (state.failed) return ;
        // src/net/colar/netbeans/fan/antlr/Fan.g:201:49: ( SP_QMARK )?
        int alt149=2;
        int LA149_0 = input.LA(1);

        if ( (LA149_0==SP_QMARK) ) {
            alt149=1;
        }
        switch (alt149) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                {
                match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred40_Fan761); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred40_Fan

    // $ANTLR start synpred42_Fan
    public final void synpred42_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:203:12: ( mapType )
        // src/net/colar/netbeans/fan/antlr/Fan.g:203:12: mapType
        {
        pushFollow(FOLLOW_mapType_in_synpred42_Fan783);
        mapType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_Fan

    // $ANTLR start synpred48_Fan
    public final void synpred48_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:207:6: ({...}? SP_COLON {...}? type )
        // src/net/colar/netbeans/fan/antlr/Fan.g:207:6: {...}? SP_COLON {...}? type
        {
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_Fan", "notAfterEol()");
        }
        match(input,SP_COLON,FOLLOW_SP_COLON_in_synpred48_Fan840); if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_Fan", "notAfterEol()");
        }
        pushFollow(FOLLOW_type_in_synpred48_Fan844);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Fan

    // $ANTLR start synpred49_Fan
    public final void synpred49_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:207:56: ( SQ_BRACKET_R )
        // src/net/colar/netbeans/fan/antlr/Fan.g:207:56: SQ_BRACKET_R
        {
        match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_synpred49_Fan848); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_Fan

    // $ANTLR start synpred51_Fan
    public final void synpred51_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:208:43: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:208:44: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred51_Fan869); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_Fan

    // $ANTLR start synpred53_Fan
    public final void synpred53_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:208:74: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:208:75: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred53_Fan881); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_Fan

    // $ANTLR start synpred55_Fan
    public final void synpred55_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:211:11: ( formalFull )
        // src/net/colar/netbeans/fan/antlr/Fan.g:211:11: formalFull
        {
        pushFollow(FOLLOW_formalFull_in_synpred55_Fan922);
        formalFull();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_Fan

    // $ANTLR start synpred56_Fan
    public final void synpred56_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:211:24: ( formalTypeOnly )
        // src/net/colar/netbeans/fan/antlr/Fan.g:211:24: formalTypeOnly
        {
        pushFollow(FOLLOW_formalTypeOnly_in_synpred56_Fan926);
        formalTypeOnly();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_Fan

    // $ANTLR start synpred57_Fan
    public final void synpred57_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:215:13: ( KW_STATIC BRACKET_L )
        // src/net/colar/netbeans/fan/antlr/Fan.g:215:14: KW_STATIC BRACKET_L
        {
        match(input,KW_STATIC,FOLLOW_KW_STATIC_in_synpred57_Fan974); if (state.failed) return ;
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred57_Fan976); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_Fan

    // $ANTLR start synpred58_Fan
    public final void synpred58_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:216:11: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:216:11: facet
        {
        pushFollow(FOLLOW_facet_in_synpred58_Fan990);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_Fan

    // $ANTLR start synpred60_Fan
    public final void synpred60_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:218:7: ( ( ctorFlags )* KW_NEW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:218:8: ( ctorFlags )* KW_NEW
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:218:8: ( ctorFlags )*
        loop152:
        do {
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( ((LA152_0>=KW_PRIVATE && LA152_0<=KW_INTERNAL)) ) {
                alt152=1;
            }


            switch (alt152) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ctorFlags
        	    {
        	    pushFollow(FOLLOW_ctorFlags_in_synpred60_Fan1007);
        	    ctorFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop152;
            }
        } while (true);

        match(input,KW_NEW,FOLLOW_KW_NEW_in_synpred60_Fan1010); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_Fan

    // $ANTLR start synpred63_Fan
    public final void synpred63_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:219:7: ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )
        // src/net/colar/netbeans/fan/antlr/Fan.g:219:8: ( methodFlags )* ( type | KW_VOID ) id PAR_L
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:219:8: ( methodFlags )*
        loop153:
        do {
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( ((LA153_0>=KW_STATIC && LA153_0<=KW_NATIVE)||(LA153_0>=KW_OVERRIDE && LA153_0<=KW_FINAL)||(LA153_0>=KW_ABSTRACT && LA153_0<=KW_INTERNAL)||LA153_0==KW_ONCE) ) {
                alt153=1;
            }


            switch (alt153) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: methodFlags
        	    {
        	    pushFollow(FOLLOW_methodFlags_in_synpred63_Fan1024);
        	    methodFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop153;
            }
        } while (true);

        // src/net/colar/netbeans/fan/antlr/Fan.g:219:21: ( type | KW_VOID )
        int alt154=2;
        int LA154_0 = input.LA(1);

        if ( (LA154_0==SQ_BRACKET_L||LA154_0==SP_PIPE||LA154_0==ID) ) {
            alt154=1;
        }
        else if ( (LA154_0==KW_VOID) ) {
            alt154=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 154, 0, input);

            throw nvae;
        }
        switch (alt154) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:219:22: type
                {
                pushFollow(FOLLOW_type_in_synpred63_Fan1028);
                type();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:219:29: KW_VOID
                {
                match(input,KW_VOID,FOLLOW_KW_VOID_in_synpred63_Fan1032); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_id_in_synpred63_Fan1035);
        id();

        state._fsp--;
        if (state.failed) return ;
        match(input,PAR_L,FOLLOW_PAR_L_in_synpred63_Fan1037); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_Fan

    // $ANTLR start synpred67_Fan
    public final void synpred67_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:226:30: ( getter )
        // src/net/colar/netbeans/fan/antlr/Fan.g:226:30: getter
        {
        pushFollow(FOLLOW_getter_in_synpred67_Fan1109);
        getter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_Fan

    // $ANTLR start synpred69_Fan
    public final void synpred69_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:226:56: ( block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:226:56: block
        {
        pushFollow(FOLLOW_block_in_synpred69_Fan1119);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Fan

    // $ANTLR start synpred72_Fan
    public final void synpred72_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:229:12: ( type id )
        // src/net/colar/netbeans/fan/antlr/Fan.g:229:13: type id
        {
        pushFollow(FOLLOW_type_in_synpred72_Fan1145);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_id_in_synpred72_Fan1147);
        id();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_Fan

    // $ANTLR start synpred100_Fan
    public final void synpred100_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:238:65: ( SP_COLON )
        // src/net/colar/netbeans/fan/antlr/Fan.g:238:66: SP_COLON
        {
        match(input,SP_COLON,FOLLOW_SP_COLON_in_synpred100_Fan1362); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_Fan

    // $ANTLR start synpred105_Fan
    public final void synpred105_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:246:12: ( BRACKET_L )
        // src/net/colar/netbeans/fan/antlr/Fan.g:246:13: BRACKET_L
        {
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred105_Fan1452); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_Fan

    // $ANTLR start synpred116_Fan
    public final void synpred116_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:250:22: ( exprStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:250:22: exprStmt
        {
        pushFollow(FOLLOW_exprStmt_in_synpred116_Fan1525);
        exprStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred116_Fan

    // $ANTLR start synpred120_Fan
    public final void synpred120_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:261:6: ( KW_ELSE block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:261:6: KW_ELSE block
        {
        match(input,KW_ELSE,FOLLOW_KW_ELSE_in_synpred120_Fan1604); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred120_Fan1606);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_Fan

    // $ANTLR start synpred121_Fan
    public final void synpred121_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:262:23: ( eos )
        // src/net/colar/netbeans/fan/antlr/Fan.g:262:23: eos
        {
        pushFollow(FOLLOW_eos_in_synpred121_Fan1618);
        eos();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred121_Fan

    // $ANTLR start synpred124_Fan
    public final void synpred124_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:266:18: ( BRACKET_L )
        // src/net/colar/netbeans/fan/antlr/Fan.g:266:19: BRACKET_L
        {
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred124_Fan1692); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_Fan

    // $ANTLR start synpred125_Fan
    public final void synpred125_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:266:42: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:266:42: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred125_Fan1699);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_Fan

    // $ANTLR start synpred126_Fan
    public final void synpred126_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:266:50: ( KW_CATCH )
        // src/net/colar/netbeans/fan/antlr/Fan.g:266:51: KW_CATCH
        {
        match(input,KW_CATCH,FOLLOW_KW_CATCH_in_synpred126_Fan1705); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred126_Fan

    // $ANTLR start synpred127_Fan
    public final void synpred127_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:266:73: ( KW_FINALLY )
        // src/net/colar/netbeans/fan/antlr/Fan.g:266:74: KW_FINALLY
        {
        match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_synpred127_Fan1714); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred127_Fan

    // $ANTLR start synpred130_Fan
    public final void synpred130_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:270:12: ( forInitDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:270:12: forInitDef
        {
        pushFollow(FOLLOW_forInitDef_in_synpred130_Fan1764);
        forInitDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_Fan

    // $ANTLR start synpred132_Fan
    public final void synpred132_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:273:21: ( catchDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:273:21: catchDef
        {
        pushFollow(FOLLOW_catchDef_in_synpred132_Fan1793);
        catchDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred132_Fan

    // $ANTLR start synpred133_Fan
    public final void synpred133_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:273:32: ( BRACKET_L )
        // src/net/colar/netbeans/fan/antlr/Fan.g:273:33: BRACKET_L
        {
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred133_Fan1798); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_Fan

    // $ANTLR start synpred134_Fan
    public final void synpred134_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:273:58: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:273:58: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred134_Fan1805);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred134_Fan

    // $ANTLR start synpred136_Fan
    public final void synpred136_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:277:25: ( BRACKET_L )
        // src/net/colar/netbeans/fan/antlr/Fan.g:277:26: BRACKET_L
        {
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred136_Fan1845); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_Fan

    // $ANTLR start synpred137_Fan
    public final void synpred137_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:277:53: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:277:53: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred137_Fan1852);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_Fan

    // $ANTLR start synpred158_Fan
    public final void synpred158_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:300:26: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:300:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
        {
        if ( input.LA(1)==SP_PIPE||input.LA(1)==OP_BITOR ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_bitAndExpr_in_synpred158_Fan2132);
        bitAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred158_Fan

    // $ANTLR start synpred159_Fan
    public final void synpred159_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:301:26: ( OP_CURRY shiftExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:301:26: OP_CURRY shiftExpr
        {
        match(input,OP_CURRY,FOLLOW_OP_CURRY_in_synpred159_Fan2146); if (state.failed) return ;
        pushFollow(FOLLOW_shiftExpr_in_synpred159_Fan2148);
        shiftExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred159_Fan

    // $ANTLR start synpred163_Fan
    public final void synpred163_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:303:22: ( ( OP_PLUS | OP_MINUS ) multExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:303:22: ( OP_PLUS | OP_MINUS ) multExpr
        {
        if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_multExpr_in_synpred163_Fan2193);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred163_Fan

    // $ANTLR start synpred168_Fan
    public final void synpred168_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:14: ( castExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:14: castExpr
        {
        pushFollow(FOLLOW_castExpr_in_synpred168_Fan2245);
        castExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred168_Fan

    // $ANTLR start synpred169_Fan
    public final void synpred169_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:25: ( groupedExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:25: groupedExpr
        {
        pushFollow(FOLLOW_groupedExpr_in_synpred169_Fan2249);
        groupedExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred169_Fan

    // $ANTLR start synpred170_Fan
    public final void synpred170_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:310:33: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:310:33: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred170_Fan2285);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred170_Fan

    // $ANTLR start synpred171_Fan
    public final void synpred171_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:311:14: ( prefixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:311:14: prefixExpr
        {
        pushFollow(FOLLOW_prefixExpr_in_synpred171_Fan2294);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred171_Fan

    // $ANTLR start synpred172_Fan
    public final void synpred172_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:311:27: ( postfixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:311:27: postfixExpr
        {
        pushFollow(FOLLOW_postfixExpr_in_synpred172_Fan2298);
        postfixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred172_Fan

    // $ANTLR start synpred180_Fan
    public final void synpred180_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:314:22: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:314:22: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred180_Fan2366);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred180_Fan

    // $ANTLR start synpred181_Fan
    public final void synpred181_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:13: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:13: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred181_Fan2376);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred181_Fan

    // $ANTLR start synpred182_Fan
    public final void synpred182_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:25: ( literal )
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:25: literal
        {
        pushFollow(FOLLOW_literal_in_synpred182_Fan2380);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred182_Fan

    // $ANTLR start synpred183_Fan
    public final void synpred183_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:35: ( typeBase )
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:35: typeBase
        {
        pushFollow(FOLLOW_typeBase_in_synpred183_Fan2384);
        typeBase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred183_Fan

    // $ANTLR start synpred184_Fan
    public final void synpred184_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:12: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:12: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred184_Fan2395);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred184_Fan

    // $ANTLR start synpred185_Fan
    public final void synpred185_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:26: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:26: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred185_Fan2399);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred185_Fan

    // $ANTLR start synpred186_Fan
    public final void synpred186_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:40: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:40: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred186_Fan2403);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred186_Fan

    // $ANTLR start synpred187_Fan
    public final void synpred187_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:53: ( staticCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:53: staticCall
        {
        pushFollow(FOLLOW_staticCall_in_synpred187_Fan2407);
        staticCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred187_Fan

    // $ANTLR start synpred188_Fan
    public final void synpred188_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:19: ( dsl )
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:19: dsl
        {
        pushFollow(FOLLOW_dsl_in_synpred188_Fan2429);
        dsl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred188_Fan

    // $ANTLR start synpred189_Fan
    public final void synpred189_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:25: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:25: closure
        {
        pushFollow(FOLLOW_closure_in_synpred189_Fan2433);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred189_Fan

    // $ANTLR start synpred190_Fan
    public final void synpred190_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:35: ( simple )
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:35: simple
        {
        pushFollow(FOLLOW_simple_in_synpred190_Fan2437);
        simple();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred190_Fan

    // $ANTLR start synpred201_Fan
    public final void synpred201_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:334:47: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:334:47: closure
        {
        pushFollow(FOLLOW_closure_in_synpred201_Fan2609);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred201_Fan

    // $ANTLR start synpred203_Fan
    public final void synpred203_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:337:12: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:337:12: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred203_Fan2637);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred203_Fan

    // $ANTLR start synpred205_Fan
    public final void synpred205_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:343:13: ( ( callParams closure ) )
        // src/net/colar/netbeans/fan/antlr/Fan.g:343:13: ( callParams closure )
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:343:13: ( callParams closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:343:14: callParams closure
        {
        pushFollow(FOLLOW_callParams_in_synpred205_Fan2678);
        callParams();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_closure_in_synpred205_Fan2680);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred205_Fan

    // $ANTLR start synpred206_Fan
    public final void synpred206_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:343:36: ( callParams )
        // src/net/colar/netbeans/fan/antlr/Fan.g:343:36: callParams
        {
        pushFollow(FOLLOW_callParams_in_synpred206_Fan2685);
        callParams();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred206_Fan

    // $ANTLR start synpred220_Fan
    public final void synpred220_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:349:20: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:349:20: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred220_Fan2778);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred220_Fan

    // $ANTLR start synpred221_Fan
    public final void synpred221_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:4: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:4: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred221_Fan2785);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred221_Fan

    // $ANTLR start synpred222_Fan
    public final void synpred222_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:18: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:18: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred222_Fan2789);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred222_Fan

    // $ANTLR start synpred223_Fan
    public final void synpred223_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:32: ( list )
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:32: list
        {
        pushFollow(FOLLOW_list_in_synpred223_Fan2793);
        list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred223_Fan

    // $ANTLR start synpred224_Fan
    public final void synpred224_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:39: ( map )
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:39: map
        {
        pushFollow(FOLLOW_map_in_synpred224_Fan2797);
        map();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred224_Fan

    // $ANTLR start synpred226_Fan
    public final void synpred226_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:354:11: ( type {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:354:11: type {...}?
        {
        pushFollow(FOLLOW_type_in_synpred226_Fan2852);
        type();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred226_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred226_Fan

    // $ANTLR start synpred230_Fan
    public final void synpred230_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:356:10: ( mapType {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:356:10: mapType {...}?
        {
        pushFollow(FOLLOW_mapType_in_synpred230_Fan2897);
        mapType();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred230_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred230_Fan

    // $ANTLR start synpred234_Fan
    public final void synpred234_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:361:9: ( DOC )
        // src/net/colar/netbeans/fan/antlr/Fan.g:361:9: DOC
        {
        match(input,DOC,FOLLOW_DOC_in_synpred234_Fan2966); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred234_Fan

    // $ANTLR start synpred237_Fan
    public final void synpred237_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:367:8: ( SP_SEMI )
        // src/net/colar/netbeans/fan/antlr/Fan.g:367:8: SP_SEMI
        {
        match(input,SP_SEMI,FOLLOW_SP_SEMI_in_synpred237_Fan3007); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred237_Fan

    // Delegated rules

    public final boolean synpred220_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred220_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred184_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred184_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred230_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred230_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred124_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred124_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred182_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred182_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred205_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred205_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred237_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred237_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred134_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred134_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred126_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred126_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred127_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred127_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred159_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred159_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred170_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred170_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred183_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred183_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred222_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred222_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred120_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred120_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred172_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred172_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred187_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred187_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred105_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred130_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred130_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred221_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred221_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred234_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred234_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred190_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred190_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred137_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred137_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred185_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred185_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred206_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred206_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred189_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred189_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred158_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred158_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred116_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred224_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred224_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred180_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred180_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred169_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred169_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred181_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred181_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred186_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred186_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred136_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred226_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred226_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred171_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred171_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred132_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred223_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred223_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred201_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred201_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred168_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred168_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred188_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred188_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred203_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred203_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred163_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred163_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA109 dfa109 = new DFA109(this);
    protected DFA110 dfa110 = new DFA110(this);
    protected DFA112 dfa112 = new DFA112(this);
    protected DFA114 dfa114 = new DFA114(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA117 dfa117 = new DFA117(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA125 dfa125 = new DFA125(this);
    protected DFA132 dfa132 = new DFA132(this);
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\2\2\2\uffff";
    static final String DFA2_minS =
        "\2\24\2\uffff";
    static final String DFA2_maxS =
        "\2\140\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\3\4\uffff\1\3\1\uffff\10\3\65\uffff\1\3\6\uffff\1\1",
            "\2\3\4\uffff\1\3\1\uffff\10\3\65\uffff\1\3\6\uffff\1\1",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 172:18: ( typeDef )*";
        }
    }
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\3\uffff\1\7\5\uffff\1\7\1\13\2\uffff";
    static final String DFA3_minS =
        "\1\21\1\61\1\132\1\21\1\62\2\132\1\uffff\1\132\2\21\2\uffff";
    static final String DFA3_maxS =
        "\1\21\2\132\1\140\1\62\2\132\1\uffff\1\132\2\140\2\uffff";
    static final String DFA3_acceptS =
        "\7\uffff\1\1\3\uffff\1\2\1\3";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2\50\uffff\1\3",
            "\1\4",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\13\uffff\1\6\1\5"+
            "\15\uffff\1\7\32\uffff\1\7\6\uffff\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            "\1\3",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\13\uffff\1\6\1\5"+
            "\15\uffff\1\7\32\uffff\1\7\6\uffff\1\7",
            "\1\13\1\14\1\uffff\2\13\4\uffff\1\13\1\uffff\10\13\32\uffff"+
            "\1\13\32\uffff\1\13\6\uffff\1\13",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "173:10: ( usingPod | usingType | usingAs )";
        }
    }
    static final String DFA7_eotS =
        "\13\uffff";
    static final String DFA7_eofS =
        "\13\uffff";
    static final String DFA7_minS =
        "\1\24\3\0\1\uffff\3\0\3\uffff";
    static final String DFA7_maxS =
        "\1\140\3\0\1\uffff\3\0\3\uffff";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\3\uffff\1\1\1\2\1\3";
    static final String DFA7_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\3\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\6\1\7\4\uffff\1\5\1\uffff\1\10\1\11\1\12\1\4\4\3\65\uffff"+
            "\1\2\6\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "182:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_0 = input.LA(1);

                         
                        int index7_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_0==DOC) ) {s = 1;}

                        else if ( (LA7_0==AT) ) {s = 2;}

                        else if ( ((LA7_0>=KW_PRIVATE && LA7_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA7_0==KW_ABSTRACT) && (synpred9_Fan())) {s = 4;}

                        else if ( (LA7_0==KW_FINAL) ) {s = 5;}

                        else if ( (LA7_0==KW_CONST) ) {s = 6;}

                        else if ( (LA7_0==KW_STATIC) ) {s = 7;}

                        else if ( (LA7_0==KW_CLASS) && (synpred9_Fan())) {s = 8;}

                        else if ( (LA7_0==KW_ENUM) && (synpred11_Fan())) {s = 9;}

                        else if ( (LA7_0==KW_MIXIN) ) {s = 10;}

                         
                        input.seek(index7_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Fan()) ) {s = 8;}

                        else if ( (synpred11_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Fan()) ) {s = 8;}

                        else if ( (synpred11_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Fan()) ) {s = 8;}

                        else if ( (synpred11_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_7 = input.LA(1);

                         
                        int index7_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index7_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\24\uffff";
    static final String DFA44_eofS =
        "\24\uffff";
    static final String DFA44_minS =
        "\1\23\1\0\22\uffff";
    static final String DFA44_maxS =
        "\1\140\1\0\22\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA44_specialS =
        "\1\uffff\1\0\22\uffff}>";
    static final String[] DFA44_transitionS = {
            "\2\2\1\1\6\2\3\uffff\7\2\13\uffff\1\2\11\uffff\1\2\35\uffff"+
            "\2\2\5\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "215:12: ( ( KW_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\23\uffff";
    static final String DFA43_eofS =
        "\23\uffff";
    static final String DFA43_minS =
        "\1\23\3\0\1\uffff\4\0\1\uffff\5\0\4\uffff";
    static final String DFA43_maxS =
        "\1\140\3\0\1\uffff\4\0\1\uffff\5\0\4\uffff";
    static final String DFA43_acceptS =
        "\4\uffff\1\1\4\uffff\1\2\5\uffff\1\2\1\3\2\uffff";
    static final String DFA43_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12"+
        "\1\13\1\14\4\uffff}>";
    static final String[] DFA43_transitionS = {
            "\2\20\1\10\1\12\1\20\1\6\1\5\1\13\1\17\3\uffff\1\7\4\3\1\4\1"+
            "\11\13\uffff\1\14\11\uffff\1\15\35\uffff\1\2\1\16\5\uffff\1"+
            "\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "217:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id PAR_L )=> methodDef | fieldDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_0 = input.LA(1);

                         
                        int index43_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA43_0==DOC) ) {s = 1;}

                        else if ( (LA43_0==AT) ) {s = 2;}

                        else if ( ((LA43_0>=KW_PRIVATE && LA43_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA43_0==KW_NEW) && (synpred60_Fan())) {s = 4;}

                        else if ( (LA43_0==KW_VIRTUAL) ) {s = 5;}

                        else if ( (LA43_0==KW_OVERRIDE) ) {s = 6;}

                        else if ( (LA43_0==KW_ABSTRACT) ) {s = 7;}

                        else if ( (LA43_0==KW_STATIC) ) {s = 8;}

                        else if ( (LA43_0==KW_ONCE) && (synpred63_Fan())) {s = 9;}

                        else if ( (LA43_0==KW_NATIVE) ) {s = 10;}

                        else if ( (LA43_0==KW_FINAL) ) {s = 11;}

                        else if ( (LA43_0==SQ_BRACKET_L) ) {s = 12;}

                        else if ( (LA43_0==SP_PIPE) ) {s = 13;}

                        else if ( (LA43_0==ID) ) {s = 14;}

                        else if ( (LA43_0==KW_VOID) && (synpred63_Fan())) {s = 15;}

                        else if ( ((LA43_0>=KW_RD_ONLY && LA43_0<=KW_CONST)||LA43_0==KW_VOLATILE) ) {s = 16;}

                         
                        input.seek(index43_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_1 = input.LA(1);

                         
                        int index43_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_Fan()) ) {s = 4;}

                        else if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_Fan()) ) {s = 4;}

                        else if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_3 = input.LA(1);

                         
                        int index43_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_Fan()) ) {s = 4;}

                        else if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA43_5 = input.LA(1);

                         
                        int index43_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA43_6 = input.LA(1);

                         
                        int index43_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA43_7 = input.LA(1);

                         
                        int index43_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA43_8 = input.LA(1);

                         
                        int index43_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA43_10 = input.LA(1);

                         
                        int index43_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA43_11 = input.LA(1);

                         
                        int index43_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA43_12 = input.LA(1);

                         
                        int index43_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA43_13 = input.LA(1);

                         
                        int index43_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA43_14 = input.LA(1);

                         
                        int index43_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index43_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\12\uffff";
    static final String DFA53_eofS =
        "\3\uffff\1\4\6\uffff";
    static final String DFA53_minS =
        "\1\61\2\uffff\1\4\1\uffff\1\0\4\uffff";
    static final String DFA53_maxS =
        "\1\132\2\uffff\1\141\1\uffff\1\0\4\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\2\1\1\uffff\1\2\1\uffff\4\1";
    static final String DFA53_specialS =
        "\1\1\2\uffff\1\0\1\uffff\1\2\4\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\11\uffff\1\2\36\uffff\1\3",
            "",
            "",
            "\15\4\2\uffff\11\4\3\uffff\12\4\2\uffff\4\4\1\6\1\uffff\1\4"+
            "\1\uffff\2\4\1\11\2\4\1\uffff\1\7\1\10\1\4\1\uffff\2\4\13\uffff"+
            "\1\4\2\uffff\2\4\3\uffff\4\4\3\uffff\1\4\1\5\7\4",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "229:11: ( ( type id )=> typeAndId | id )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_3 = input.LA(1);

                         
                        int index53_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_3==EOF||(LA53_3>=KW_BREAK && LA53_3<=KW_FINALLY)||(LA53_3>=KW_RD_ONLY && LA53_3<=KW_VOID)||(LA53_3>=KW_ABSTRACT && LA53_3<=KW_ELSE)||(LA53_3>=KW_NULL && LA53_3<=KW_FALSE)||LA53_3==SQ_BRACKET_L||(LA53_3>=BRACKET_L && LA53_3<=BRACKET_R)||(LA53_3>=SP_COMMA && LA53_3<=PAR_L)||LA53_3==SP_PIPE||(LA53_3>=AS_INIT_VAL && LA53_3<=SP_SEMI)||LA53_3==OP_CURRY||(LA53_3>=OP_PLUS && LA53_3<=OP_MINUS)||(LA53_3>=OP_BANG && LA53_3<=OP_TILDA)||LA53_3==AT||(LA53_3>=QUOTSTR && LA53_3<=NUMBER)) ) {s = 4;}

                        else if ( (LA53_3==ID) ) {s = 5;}

                        else if ( (LA53_3==SP_COLCOL) && (synpred72_Fan())) {s = 6;}

                        else if ( (LA53_3==SP_QMARK) && (synpred72_Fan())) {s = 7;}

                        else if ( (LA53_3==LIST_TYPE) && (synpred72_Fan())) {s = 8;}

                        else if ( (LA53_3==SP_COLON) && (synpred72_Fan())) {s = 9;}

                         
                        input.seek(index53_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==SQ_BRACKET_L) && (synpred72_Fan())) {s = 1;}

                        else if ( (LA53_0==SP_PIPE) && (synpred72_Fan())) {s = 2;}

                        else if ( (LA53_0==ID) ) {s = 3;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_5 = input.LA(1);

                         
                        int index53_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index53_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\36\uffff";
    static final String DFA73_eofS =
        "\36\uffff";
    static final String DFA73_minS =
        "\1\4\14\uffff\1\0\14\uffff\2\0\2\uffff";
    static final String DFA73_maxS =
        "\1\141\14\uffff\1\0\14\uffff\2\0\2\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\22\uffff\1\13";
    static final String DFA73_specialS =
        "\15\uffff\1\0\14\uffff\1\1\1\2\2\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\4\1\5\1\2\1\1\1\6\1\7\1\10\1\3\1\11\31\uffff\2\12\3\uffff"+
            "\4\12\2\uffff\1\32\5\uffff\1\12\3\uffff\1\33\16\uffff\1\12\2"+
            "\uffff\2\12\3\uffff\4\12\3\uffff\1\12\1\15\5\12\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "248:10: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_26 = input.LA(1);

                         
                        int index73_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_27 = input.LA(1);

                         
                        int index73_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index73_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\65\uffff";
    static final String DFA78_eofS =
        "\1\1\64\uffff";
    static final String DFA78_minS =
        "\1\4\13\uffff\23\0\26\uffff";
    static final String DFA78_maxS =
        "\1\141\13\uffff\23\0\26\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\62\uffff\1\2";
    static final String DFA78_specialS =
        "\14\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\26\uffff}>";
    static final String[] DFA78_transitionS = {
            "\15\1\2\uffff\11\1\3\uffff\7\1\1\21\1\22\1\1\2\uffff\1\20\1"+
            "\23\1\24\1\25\2\uffff\1\34\2\uffff\1\1\1\uffff\1\1\1\14\3\uffff"+
            "\1\35\2\uffff\1\1\13\uffff\1\31\2\uffff\1\31\1\15\3\uffff\4"+
            "\31\3\uffff\1\16\1\17\1\26\1\27\1\30\1\33\1\36\1\1\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "262:22: ( eos | expr eos )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_12 = input.LA(1);

                         
                        int index78_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||(synpred121_Fan()&&(lookupNL()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol())))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_13 = input.LA(1);

                         
                        int index78_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA78_14 = input.LA(1);

                         
                        int index78_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA78_15 = input.LA(1);

                         
                        int index78_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA78_16 = input.LA(1);

                         
                        int index78_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_16);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA78_17 = input.LA(1);

                         
                        int index78_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA78_18 = input.LA(1);

                         
                        int index78_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_18);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA78_19 = input.LA(1);

                         
                        int index78_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_19);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA78_20 = input.LA(1);

                         
                        int index78_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_20);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA78_21 = input.LA(1);

                         
                        int index78_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_21);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA78_22 = input.LA(1);

                         
                        int index78_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_22);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA78_23 = input.LA(1);

                         
                        int index78_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_23);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA78_24 = input.LA(1);

                         
                        int index78_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_24);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA78_25 = input.LA(1);

                         
                        int index78_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_25);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA78_26 = input.LA(1);

                         
                        int index78_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_26);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA78_27 = input.LA(1);

                         
                        int index78_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_27);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA78_28 = input.LA(1);

                         
                        int index78_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_28);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA78_29 = input.LA(1);

                         
                        int index78_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_29);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA78_30 = input.LA(1);

                         
                        int index78_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index78_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\65\uffff";
    static final String DFA81_eofS =
        "\1\1\64\uffff";
    static final String DFA81_minS =
        "\1\4\3\uffff\34\0\25\uffff";
    static final String DFA81_maxS =
        "\1\141\3\uffff\34\0\25\uffff";
    static final String DFA81_acceptS =
        "\1\uffff\1\2\62\uffff\1\1";
    static final String DFA81_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\25\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\7\1\10\1\5\1\4\1\11\1\12\1\13\1\6\1\14\4\1\2\uffff\11\1\3"+
            "\uffff\7\1\1\22\1\23\1\1\2\uffff\1\21\1\24\1\25\1\26\2\uffff"+
            "\1\35\2\uffff\1\1\1\uffff\1\1\1\15\3\uffff\1\36\2\uffff\1\1"+
            "\13\uffff\1\32\2\uffff\1\32\1\16\3\uffff\4\32\3\uffff\1\17\1"+
            "\20\1\27\1\30\1\31\1\34\1\37\1\1\1\33",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "()* loopback of 266:42: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_4 = input.LA(1);

                         
                        int index81_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_5 = input.LA(1);

                         
                        int index81_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_6 = input.LA(1);

                         
                        int index81_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_7 = input.LA(1);

                         
                        int index81_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_8 = input.LA(1);

                         
                        int index81_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA81_9 = input.LA(1);

                         
                        int index81_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA81_10 = input.LA(1);

                         
                        int index81_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA81_11 = input.LA(1);

                         
                        int index81_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA81_12 = input.LA(1);

                         
                        int index81_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_12);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA81_13 = input.LA(1);

                         
                        int index81_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred125_Fan()&&(notAfterEol()))||synpred125_Fan())) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_13);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA81_14 = input.LA(1);

                         
                        int index81_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_14);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA81_15 = input.LA(1);

                         
                        int index81_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_15);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA81_16 = input.LA(1);

                         
                        int index81_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_16);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA81_17 = input.LA(1);

                         
                        int index81_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_17);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA81_18 = input.LA(1);

                         
                        int index81_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_18);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA81_19 = input.LA(1);

                         
                        int index81_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_19);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA81_20 = input.LA(1);

                         
                        int index81_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_20);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA81_21 = input.LA(1);

                         
                        int index81_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_21);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA81_22 = input.LA(1);

                         
                        int index81_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_22);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA81_23 = input.LA(1);

                         
                        int index81_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_23);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA81_24 = input.LA(1);

                         
                        int index81_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_24);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA81_25 = input.LA(1);

                         
                        int index81_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_25);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA81_26 = input.LA(1);

                         
                        int index81_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_26);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA81_27 = input.LA(1);

                         
                        int index81_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_27);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA81_28 = input.LA(1);

                         
                        int index81_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_28);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA81_29 = input.LA(1);

                         
                        int index81_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_29);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA81_30 = input.LA(1);

                         
                        int index81_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_30);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA81_31 = input.LA(1);

                         
                        int index81_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_31);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA87_eotS =
        "\25\uffff";
    static final String DFA87_eofS =
        "\25\uffff";
    static final String DFA87_minS =
        "\1\46\3\0\21\uffff";
    static final String DFA87_maxS =
        "\1\141\3\0\21\uffff";
    static final String DFA87_acceptS =
        "\4\uffff\1\2\17\uffff\1\1";
    static final String DFA87_specialS =
        "\1\uffff\1\0\1\1\1\2\21\uffff}>";
    static final String[] DFA87_transitionS = {
            "\2\4\3\uffff\4\4\2\uffff\1\1\5\uffff\1\4\3\uffff\1\2\16\uffff"+
            "\1\4\2\uffff\2\4\3\uffff\4\4\3\uffff\1\4\1\3\5\4\1\uffff\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
    static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
    static final char[] DFA87_min = DFA.unpackEncodedStringToUnsignedChars(DFA87_minS);
    static final char[] DFA87_max = DFA.unpackEncodedStringToUnsignedChars(DFA87_maxS);
    static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
    static final short[] DFA87_special = DFA.unpackEncodedString(DFA87_specialS);
    static final short[][] DFA87_transition;

    static {
        int numStates = DFA87_transitionS.length;
        DFA87_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
        }
    }

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = DFA87_eot;
            this.eof = DFA87_eof;
            this.min = DFA87_min;
            this.max = DFA87_max;
            this.accept = DFA87_accept;
            this.special = DFA87_special;
            this.transition = DFA87_transition;
        }
        public String getDescription() {
            return "270:1: forInit : ( forInitDef | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA87_1 = input.LA(1);

                         
                        int index87_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred130_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index87_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA87_2 = input.LA(1);

                         
                        int index87_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred130_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index87_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA87_3 = input.LA(1);

                         
                        int index87_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred130_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index87_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 87, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA89_eotS =
        "\66\uffff";
    static final String DFA89_eofS =
        "\1\2\65\uffff";
    static final String DFA89_minS =
        "\1\4\1\0\64\uffff";
    static final String DFA89_maxS =
        "\1\141\1\0\64\uffff";
    static final String DFA89_acceptS =
        "\2\uffff\1\2\62\uffff\1\1";
    static final String DFA89_specialS =
        "\1\uffff\1\0\64\uffff}>";
    static final String[] DFA89_transitionS = {
            "\15\2\2\uffff\11\2\3\uffff\12\2\2\uffff\4\2\2\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\1\3\uffff\1\2\2\uffff\1\2\13\uffff\1\2\2"+
            "\uffff\2\2\3\uffff\4\2\3\uffff\11\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA89_eot = DFA.unpackEncodedString(DFA89_eotS);
    static final short[] DFA89_eof = DFA.unpackEncodedString(DFA89_eofS);
    static final char[] DFA89_min = DFA.unpackEncodedStringToUnsignedChars(DFA89_minS);
    static final char[] DFA89_max = DFA.unpackEncodedStringToUnsignedChars(DFA89_maxS);
    static final short[] DFA89_accept = DFA.unpackEncodedString(DFA89_acceptS);
    static final short[] DFA89_special = DFA.unpackEncodedString(DFA89_specialS);
    static final short[][] DFA89_transition;

    static {
        int numStates = DFA89_transitionS.length;
        DFA89_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA89_transition[i] = DFA.unpackEncodedString(DFA89_transitionS[i]);
        }
    }

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = DFA89_eot;
            this.eof = DFA89_eof;
            this.min = DFA89_min;
            this.max = DFA89_max;
            this.accept = DFA89_accept;
            this.special = DFA89_special;
            this.transition = DFA89_transition;
        }
        public String getDescription() {
            return "273:21: ( catchDef )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA89_1 = input.LA(1);

                         
                        int index89_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_Fan()) ) {s = 53;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index89_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 89, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA90_eotS =
        "\65\uffff";
    static final String DFA90_eofS =
        "\1\1\64\uffff";
    static final String DFA90_minS =
        "\1\4\2\uffff\34\0\26\uffff";
    static final String DFA90_maxS =
        "\1\141\2\uffff\34\0\26\uffff";
    static final String DFA90_acceptS =
        "\1\uffff\1\2\62\uffff\1\1";
    static final String DFA90_specialS =
        "\3\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\26\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\6\1\7\1\4\1\3\1\10\1\11\1\12\1\5\1\13\4\1\2\uffff\11\1\3"+
            "\uffff\7\1\1\21\1\22\1\1\2\uffff\1\20\1\23\1\24\1\25\2\uffff"+
            "\1\34\2\uffff\1\1\1\uffff\1\1\1\14\3\uffff\1\35\2\uffff\1\1"+
            "\13\uffff\1\31\2\uffff\1\31\1\15\3\uffff\4\31\3\uffff\1\16\1"+
            "\17\1\26\1\27\1\30\1\33\1\36\1\1\1\32",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "()* loopback of 273:58: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA90_3 = input.LA(1);

                         
                        int index90_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA90_4 = input.LA(1);

                         
                        int index90_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA90_5 = input.LA(1);

                         
                        int index90_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA90_6 = input.LA(1);

                         
                        int index90_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA90_7 = input.LA(1);

                         
                        int index90_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA90_8 = input.LA(1);

                         
                        int index90_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA90_9 = input.LA(1);

                         
                        int index90_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA90_10 = input.LA(1);

                         
                        int index90_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA90_11 = input.LA(1);

                         
                        int index90_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA90_12 = input.LA(1);

                         
                        int index90_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred134_Fan()&&(notAfterEol()))||synpred134_Fan())) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA90_13 = input.LA(1);

                         
                        int index90_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA90_14 = input.LA(1);

                         
                        int index90_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_14);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA90_15 = input.LA(1);

                         
                        int index90_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_15);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA90_16 = input.LA(1);

                         
                        int index90_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_16);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA90_17 = input.LA(1);

                         
                        int index90_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_17);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA90_18 = input.LA(1);

                         
                        int index90_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_18);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA90_19 = input.LA(1);

                         
                        int index90_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_19);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA90_20 = input.LA(1);

                         
                        int index90_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_20);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA90_21 = input.LA(1);

                         
                        int index90_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_21);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA90_22 = input.LA(1);

                         
                        int index90_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_22);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA90_23 = input.LA(1);

                         
                        int index90_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_23);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA90_24 = input.LA(1);

                         
                        int index90_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_24);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA90_25 = input.LA(1);

                         
                        int index90_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_25);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA90_26 = input.LA(1);

                         
                        int index90_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_26);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA90_27 = input.LA(1);

                         
                        int index90_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_27);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA90_28 = input.LA(1);

                         
                        int index90_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_28);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA90_29 = input.LA(1);

                         
                        int index90_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_29);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA90_30 = input.LA(1);

                         
                        int index90_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 90, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA93_eotS =
        "\65\uffff";
    static final String DFA93_eofS =
        "\1\1\64\uffff";
    static final String DFA93_minS =
        "\1\4\1\uffff\34\0\27\uffff";
    static final String DFA93_maxS =
        "\1\141\1\uffff\34\0\27\uffff";
    static final String DFA93_acceptS =
        "\1\uffff\1\2\62\uffff\1\1";
    static final String DFA93_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\27\uffff}>";
    static final String[] DFA93_transitionS = {
            "\1\5\1\6\1\3\1\2\1\7\1\10\1\11\1\4\1\12\4\1\2\uffff\11\1\3\uffff"+
            "\7\1\1\20\1\21\1\1\2\uffff\1\17\1\22\1\23\1\24\2\uffff\1\33"+
            "\2\uffff\1\1\1\uffff\1\1\1\13\3\uffff\1\34\2\uffff\1\1\13\uffff"+
            "\1\30\2\uffff\1\30\1\14\3\uffff\4\30\3\uffff\1\15\1\16\1\25"+
            "\1\26\1\27\1\32\1\35\1\1\1\31",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "()* loopback of 277:53: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA93_2 = input.LA(1);

                         
                        int index93_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA93_3 = input.LA(1);

                         
                        int index93_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA93_4 = input.LA(1);

                         
                        int index93_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA93_5 = input.LA(1);

                         
                        int index93_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA93_6 = input.LA(1);

                         
                        int index93_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA93_7 = input.LA(1);

                         
                        int index93_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA93_8 = input.LA(1);

                         
                        int index93_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA93_9 = input.LA(1);

                         
                        int index93_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA93_10 = input.LA(1);

                         
                        int index93_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA93_11 = input.LA(1);

                         
                        int index93_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred137_Fan()&&(notAfterEol()))||synpred137_Fan())) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA93_12 = input.LA(1);

                         
                        int index93_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA93_13 = input.LA(1);

                         
                        int index93_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA93_14 = input.LA(1);

                         
                        int index93_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA93_15 = input.LA(1);

                         
                        int index93_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA93_16 = input.LA(1);

                         
                        int index93_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA93_17 = input.LA(1);

                         
                        int index93_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA93_18 = input.LA(1);

                         
                        int index93_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA93_19 = input.LA(1);

                         
                        int index93_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA93_20 = input.LA(1);

                         
                        int index93_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_20);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA93_21 = input.LA(1);

                         
                        int index93_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_21);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA93_22 = input.LA(1);

                         
                        int index93_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_22);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA93_23 = input.LA(1);

                         
                        int index93_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_23);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA93_24 = input.LA(1);

                         
                        int index93_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_24);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA93_25 = input.LA(1);

                         
                        int index93_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_25);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA93_26 = input.LA(1);

                         
                        int index93_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_26);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA93_27 = input.LA(1);

                         
                        int index93_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_27);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA93_28 = input.LA(1);

                         
                        int index93_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_28);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA93_29 = input.LA(1);

                         
                        int index93_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_29);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 93, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA109_eotS =
        "\105\uffff";
    static final String DFA109_eofS =
        "\1\1\104\uffff";
    static final String DFA109_minS =
        "\1\4\30\uffff\1\0\53\uffff";
    static final String DFA109_maxS =
        "\1\141\30\uffff\1\0\53\uffff";
    static final String DFA109_acceptS =
        "\1\uffff\1\2\102\uffff\1\1";
    static final String DFA109_specialS =
        "\31\uffff\1\0\53\uffff}>";
    static final String[] DFA109_transitionS = {
            "\15\1\1\uffff\35\1\2\uffff\11\1\1\uffff\1\31\2\uffff\13\1\1"+
            "\104\1\1\2\uffff\2\1\3\uffff\4\1\3\uffff\11\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA109_eot = DFA.unpackEncodedString(DFA109_eotS);
    static final short[] DFA109_eof = DFA.unpackEncodedString(DFA109_eofS);
    static final char[] DFA109_min = DFA.unpackEncodedStringToUnsignedChars(DFA109_minS);
    static final char[] DFA109_max = DFA.unpackEncodedStringToUnsignedChars(DFA109_maxS);
    static final short[] DFA109_accept = DFA.unpackEncodedString(DFA109_acceptS);
    static final short[] DFA109_special = DFA.unpackEncodedString(DFA109_specialS);
    static final short[][] DFA109_transition;

    static {
        int numStates = DFA109_transitionS.length;
        DFA109_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA109_transition[i] = DFA.unpackEncodedString(DFA109_transitionS[i]);
        }
    }

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = DFA109_eot;
            this.eof = DFA109_eof;
            this.min = DFA109_min;
            this.max = DFA109_max;
            this.accept = DFA109_accept;
            this.special = DFA109_special;
            this.transition = DFA109_transition;
        }
        public String getDescription() {
            return "()* loopback of 300:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_25 = input.LA(1);

                         
                        int index109_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred158_Fan()) ) {s = 68;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index109_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 109, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA110_eotS =
        "\107\uffff";
    static final String DFA110_eofS =
        "\1\1\106\uffff";
    static final String DFA110_minS =
        "\1\4\66\uffff\1\0\17\uffff";
    static final String DFA110_maxS =
        "\1\141\66\uffff\1\0\17\uffff";
    static final String DFA110_acceptS =
        "\1\uffff\1\2\104\uffff\1\1";
    static final String DFA110_specialS =
        "\67\uffff\1\0\17\uffff}>";
    static final String[] DFA110_transitionS = {
            "\15\1\1\uffff\35\1\2\uffff\11\1\1\uffff\1\1\2\uffff\14\1\1\67"+
            "\2\uffff\2\1\3\uffff\4\1\3\uffff\11\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA110_eot = DFA.unpackEncodedString(DFA110_eotS);
    static final short[] DFA110_eof = DFA.unpackEncodedString(DFA110_eofS);
    static final char[] DFA110_min = DFA.unpackEncodedStringToUnsignedChars(DFA110_minS);
    static final char[] DFA110_max = DFA.unpackEncodedStringToUnsignedChars(DFA110_maxS);
    static final short[] DFA110_accept = DFA.unpackEncodedString(DFA110_acceptS);
    static final short[] DFA110_special = DFA.unpackEncodedString(DFA110_specialS);
    static final short[][] DFA110_transition;

    static {
        int numStates = DFA110_transitionS.length;
        DFA110_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA110_transition[i] = DFA.unpackEncodedString(DFA110_transitionS[i]);
        }
    }

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = DFA110_eot;
            this.eof = DFA110_eof;
            this.min = DFA110_min;
            this.max = DFA110_max;
            this.accept = DFA110_accept;
            this.special = DFA110_special;
            this.transition = DFA110_transition;
        }
        public String getDescription() {
            return "()* loopback of 301:25: ( OP_CURRY shiftExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_55 = input.LA(1);

                         
                        int index110_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred159_Fan()) ) {s = 70;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index110_55);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 110, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA112_eotS =
        "\111\uffff";
    static final String DFA112_eofS =
        "\1\1\110\uffff";
    static final String DFA112_minS =
        "\1\4\56\uffff\1\0\11\uffff\1\0\17\uffff";
    static final String DFA112_maxS =
        "\1\141\56\uffff\1\0\11\uffff\1\0\17\uffff";
    static final String DFA112_acceptS =
        "\1\uffff\1\2\106\uffff\1\1";
    static final String DFA112_specialS =
        "\57\uffff\1\0\11\uffff\1\1\17\uffff}>";
    static final String[] DFA112_transitionS = {
            "\15\1\1\uffff\35\1\2\uffff\11\1\1\uffff\1\1\2\uffff\17\1\1\71"+
            "\1\57\3\uffff\4\1\3\uffff\11\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA112_eot = DFA.unpackEncodedString(DFA112_eotS);
    static final short[] DFA112_eof = DFA.unpackEncodedString(DFA112_eofS);
    static final char[] DFA112_min = DFA.unpackEncodedStringToUnsignedChars(DFA112_minS);
    static final char[] DFA112_max = DFA.unpackEncodedStringToUnsignedChars(DFA112_maxS);
    static final short[] DFA112_accept = DFA.unpackEncodedString(DFA112_acceptS);
    static final short[] DFA112_special = DFA.unpackEncodedString(DFA112_specialS);
    static final short[][] DFA112_transition;

    static {
        int numStates = DFA112_transitionS.length;
        DFA112_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA112_transition[i] = DFA.unpackEncodedString(DFA112_transitionS[i]);
        }
    }

    class DFA112 extends DFA {

        public DFA112(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 112;
            this.eot = DFA112_eot;
            this.eof = DFA112_eof;
            this.min = DFA112_min;
            this.max = DFA112_max;
            this.accept = DFA112_accept;
            this.special = DFA112_special;
            this.transition = DFA112_transition;
        }
        public String getDescription() {
            return "()* loopback of 303:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA112_47 = input.LA(1);

                         
                        int index112_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred163_Fan()) ) {s = 72;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index112_47);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA112_57 = input.LA(1);

                         
                        int index112_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred163_Fan()) ) {s = 72;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index112_57);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 112, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA114_eotS =
        "\26\uffff";
    static final String DFA114_eofS =
        "\26\uffff";
    static final String DFA114_minS =
        "\1\46\1\0\24\uffff";
    static final String DFA114_maxS =
        "\1\141\1\0\24\uffff";
    static final String DFA114_acceptS =
        "\2\uffff\1\3\21\uffff\1\1\1\2";
    static final String DFA114_specialS =
        "\1\uffff\1\0\24\uffff}>";
    static final String[] DFA114_transitionS = {
            "\2\2\3\uffff\4\2\2\uffff\1\2\5\uffff\1\1\3\uffff\1\2\16\uffff"+
            "\1\2\2\uffff\2\2\3\uffff\4\2\3\uffff\7\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA114_eot = DFA.unpackEncodedString(DFA114_eotS);
    static final short[] DFA114_eof = DFA.unpackEncodedString(DFA114_eofS);
    static final char[] DFA114_min = DFA.unpackEncodedStringToUnsignedChars(DFA114_minS);
    static final char[] DFA114_max = DFA.unpackEncodedStringToUnsignedChars(DFA114_maxS);
    static final short[] DFA114_accept = DFA.unpackEncodedString(DFA114_acceptS);
    static final short[] DFA114_special = DFA.unpackEncodedString(DFA114_specialS);
    static final short[][] DFA114_transition;

    static {
        int numStates = DFA114_transitionS.length;
        DFA114_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA114_transition[i] = DFA.unpackEncodedString(DFA114_transitionS[i]);
        }
    }

    class DFA114 extends DFA {

        public DFA114(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 114;
            this.eot = DFA114_eot;
            this.eof = DFA114_eof;
            this.min = DFA114_min;
            this.max = DFA114_max;
            this.accept = DFA114_accept;
            this.special = DFA114_special;
            this.transition = DFA114_transition;
        }
        public String getDescription() {
            return "306:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA114_1 = input.LA(1);

                         
                        int index114_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred168_Fan()&&(notAfterEol()))) ) {s = 20;}

                        else if ( (synpred169_Fan()) ) {s = 21;}

                         
                        input.seek(index114_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 114, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA115_eotS =
        "\115\uffff";
    static final String DFA115_eofS =
        "\1\1\114\uffff";
    static final String DFA115_minS =
        "\1\4\17\uffff\1\0\15\uffff\1\0\21\uffff\1\0\34\uffff";
    static final String DFA115_maxS =
        "\1\141\17\uffff\1\0\15\uffff\1\0\21\uffff\1\0\34\uffff";
    static final String DFA115_acceptS =
        "\1\uffff\1\2\107\uffff\1\1\3\uffff";
    static final String DFA115_specialS =
        "\20\uffff\1\0\15\uffff\1\1\21\uffff\1\2\34\uffff}>";
    static final String[] DFA115_transitionS = {
            "\15\1\1\uffff\35\1\1\uffff\1\111\1\36\1\1\1\20\3\1\1\60\2\1"+
            "\1\uffff\1\1\1\111\1\uffff\30\1\1\uffff\2\111\11\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA115_eot = DFA.unpackEncodedString(DFA115_eotS);
    static final short[] DFA115_eof = DFA.unpackEncodedString(DFA115_eofS);
    static final char[] DFA115_min = DFA.unpackEncodedStringToUnsignedChars(DFA115_minS);
    static final char[] DFA115_max = DFA.unpackEncodedStringToUnsignedChars(DFA115_maxS);
    static final short[] DFA115_accept = DFA.unpackEncodedString(DFA115_acceptS);
    static final short[] DFA115_special = DFA.unpackEncodedString(DFA115_specialS);
    static final short[][] DFA115_transition;

    static {
        int numStates = DFA115_transitionS.length;
        DFA115_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA115_transition[i] = DFA.unpackEncodedString(DFA115_transitionS[i]);
        }
    }

    class DFA115 extends DFA {

        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = DFA115_eot;
            this.eof = DFA115_eof;
            this.min = DFA115_min;
            this.max = DFA115_max;
            this.accept = DFA115_accept;
            this.special = DFA115_special;
            this.transition = DFA115_transition;
        }
        public String getDescription() {
            return "()* loopback of 310:33: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA115_16 = input.LA(1);

                         
                        int index115_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index115_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA115_30 = input.LA(1);

                         
                        int index115_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred170_Fan()&&(notAfterEol()))) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index115_30);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA115_48 = input.LA(1);

                         
                        int index115_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred170_Fan()&&(notAfterEol()))) ) {s = 73;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL()))) ) {s = 1;}

                         
                        input.seek(index115_48);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 115, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA116_eotS =
        "\25\uffff";
    static final String DFA116_eofS =
        "\25\uffff";
    static final String DFA116_minS =
        "\1\46\14\0\1\uffff\5\0\2\uffff";
    static final String DFA116_maxS =
        "\1\141\14\0\1\uffff\5\0\2\uffff";
    static final String DFA116_acceptS =
        "\15\uffff\1\1\5\uffff\1\2\1\3";
    static final String DFA116_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\14\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] DFA116_transitionS = {
            "\1\5\1\6\3\uffff\1\4\1\7\1\10\1\11\2\uffff\1\20\11\uffff\1\21"+
            "\16\uffff\1\15\2\uffff\1\15\1\1\3\uffff\4\15\3\uffff\1\2\1\3"+
            "\1\12\1\13\1\14\1\17\1\22\1\uffff\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA116_eot = DFA.unpackEncodedString(DFA116_eotS);
    static final short[] DFA116_eof = DFA.unpackEncodedString(DFA116_eofS);
    static final char[] DFA116_min = DFA.unpackEncodedStringToUnsignedChars(DFA116_minS);
    static final char[] DFA116_max = DFA.unpackEncodedStringToUnsignedChars(DFA116_maxS);
    static final short[] DFA116_accept = DFA.unpackEncodedString(DFA116_acceptS);
    static final short[] DFA116_special = DFA.unpackEncodedString(DFA116_specialS);
    static final short[][] DFA116_transition;

    static {
        int numStates = DFA116_transitionS.length;
        DFA116_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA116_transition[i] = DFA.unpackEncodedString(DFA116_transitionS[i]);
        }
    }

    class DFA116 extends DFA {

        public DFA116(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 116;
            this.eot = DFA116_eot;
            this.eof = DFA116_eof;
            this.min = DFA116_min;
            this.max = DFA116_max;
            this.accept = DFA116_accept;
            this.special = DFA116_special;
            this.transition = DFA116_transition;
        }
        public String getDescription() {
            return "311:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA116_1 = input.LA(1);

                         
                        int index116_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 13;}

                        else if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA116_2 = input.LA(1);

                         
                        int index116_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA116_3 = input.LA(1);

                         
                        int index116_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA116_4 = input.LA(1);

                         
                        int index116_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA116_5 = input.LA(1);

                         
                        int index116_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA116_6 = input.LA(1);

                         
                        int index116_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA116_7 = input.LA(1);

                         
                        int index116_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA116_8 = input.LA(1);

                         
                        int index116_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA116_9 = input.LA(1);

                         
                        int index116_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA116_10 = input.LA(1);

                         
                        int index116_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA116_11 = input.LA(1);

                         
                        int index116_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA116_12 = input.LA(1);

                         
                        int index116_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA116_14 = input.LA(1);

                         
                        int index116_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA116_15 = input.LA(1);

                         
                        int index116_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA116_16 = input.LA(1);

                         
                        int index116_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA116_17 = input.LA(1);

                         
                        int index116_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA116_18 = input.LA(1);

                         
                        int index116_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 116, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA117_eotS =
        "\116\uffff";
    static final String DFA117_eofS =
        "\1\1\115\uffff";
    static final String DFA117_minS =
        "\1\4\17\uffff\1\0\15\uffff\1\0\21\uffff\1\0\35\uffff";
    static final String DFA117_maxS =
        "\1\141\17\uffff\1\0\15\uffff\1\0\21\uffff\1\0\35\uffff";
    static final String DFA117_acceptS =
        "\1\uffff\1\2\110\uffff\1\1\3\uffff";
    static final String DFA117_specialS =
        "\20\uffff\1\0\15\uffff\1\1\21\uffff\1\2\35\uffff}>";
    static final String[] DFA117_transitionS = {
            "\15\1\1\uffff\35\1\1\uffff\1\112\1\36\1\1\1\20\3\1\1\60\2\1"+
            "\1\uffff\1\1\1\112\1\uffff\30\1\1\uffff\2\112\11\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA117_eot = DFA.unpackEncodedString(DFA117_eotS);
    static final short[] DFA117_eof = DFA.unpackEncodedString(DFA117_eofS);
    static final char[] DFA117_min = DFA.unpackEncodedStringToUnsignedChars(DFA117_minS);
    static final char[] DFA117_max = DFA.unpackEncodedStringToUnsignedChars(DFA117_maxS);
    static final short[] DFA117_accept = DFA.unpackEncodedString(DFA117_acceptS);
    static final short[] DFA117_special = DFA.unpackEncodedString(DFA117_specialS);
    static final short[][] DFA117_transition;

    static {
        int numStates = DFA117_transitionS.length;
        DFA117_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA117_transition[i] = DFA.unpackEncodedString(DFA117_transitionS[i]);
        }
    }

    class DFA117 extends DFA {

        public DFA117(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 117;
            this.eot = DFA117_eot;
            this.eof = DFA117_eof;
            this.min = DFA117_min;
            this.max = DFA117_max;
            this.accept = DFA117_accept;
            this.special = DFA117_special;
            this.transition = DFA117_transition;
        }
        public String getDescription() {
            return "()* loopback of 314:22: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA117_16 = input.LA(1);

                         
                        int index117_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_Fan()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index117_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA117_30 = input.LA(1);

                         
                        int index117_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred180_Fan()&&(notAfterEol()))) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index117_30);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA117_48 = input.LA(1);

                         
                        int index117_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred180_Fan()&&(notAfterEol()))) ) {s = 74;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL()))) ) {s = 1;}

                         
                        input.seek(index117_48);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 117, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA118_eotS =
        "\24\uffff";
    static final String DFA118_eofS =
        "\24\uffff";
    static final String DFA118_minS =
        "\1\46\1\uffff\1\0\14\uffff\3\0\2\uffff";
    static final String DFA118_maxS =
        "\1\141\1\uffff\1\0\14\uffff\3\0\2\uffff";
    static final String DFA118_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\16\uffff\1\3\1\4";
    static final String DFA118_specialS =
        "\2\uffff\1\0\14\uffff\1\1\1\2\1\3\2\uffff}>";
    static final String[] DFA118_transitionS = {
            "\2\3\3\uffff\4\3\2\uffff\1\17\11\uffff\1\20\22\uffff\1\3\12"+
            "\uffff\1\1\1\2\4\3\1\21\1\uffff\1\3",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA118_eot = DFA.unpackEncodedString(DFA118_eotS);
    static final short[] DFA118_eof = DFA.unpackEncodedString(DFA118_eofS);
    static final char[] DFA118_min = DFA.unpackEncodedStringToUnsignedChars(DFA118_minS);
    static final char[] DFA118_max = DFA.unpackEncodedStringToUnsignedChars(DFA118_maxS);
    static final short[] DFA118_accept = DFA.unpackEncodedString(DFA118_acceptS);
    static final short[] DFA118_special = DFA.unpackEncodedString(DFA118_specialS);
    static final short[][] DFA118_transition;

    static {
        int numStates = DFA118_transitionS.length;
        DFA118_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA118_transition[i] = DFA.unpackEncodedString(DFA118_transitionS[i]);
        }
    }

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = DFA118_eot;
            this.eof = DFA118_eof;
            this.min = DFA118_min;
            this.max = DFA118_max;
            this.accept = DFA118_accept;
            this.special = DFA118_special;
            this.transition = DFA118_transition;
        }
        public String getDescription() {
            return "316:1: termBase : ( idExprReq | literal | typeBase | id );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA118_2 = input.LA(1);

                         
                        int index118_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred181_Fan()) ) {s = 1;}

                        else if ( (synpred182_Fan()) ) {s = 3;}

                        else if ( (synpred183_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index118_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA118_15 = input.LA(1);

                         
                        int index118_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 3;}

                        else if ( (synpred183_Fan()) ) {s = 18;}

                         
                        input.seek(index118_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA118_16 = input.LA(1);

                         
                        int index118_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 3;}

                        else if ( (synpred183_Fan()) ) {s = 18;}

                         
                        input.seek(index118_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA118_17 = input.LA(1);

                         
                        int index118_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 3;}

                        else if ( (synpred183_Fan()) ) {s = 18;}

                         
                        input.seek(index118_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 118, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA119_eotS =
        "\14\uffff";
    static final String DFA119_eofS =
        "\14\uffff";
    static final String DFA119_minS =
        "\1\61\3\0\10\uffff";
    static final String DFA119_maxS =
        "\1\137\3\0\10\uffff";
    static final String DFA119_acceptS =
        "\4\uffff\1\2\1\1\1\4\1\7\1\10\1\6\1\3\1\5";
    static final String DFA119_specialS =
        "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] DFA119_transitionS = {
            "\1\1\11\uffff\1\2\36\uffff\1\3\4\uffff\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA119_eot = DFA.unpackEncodedString(DFA119_eotS);
    static final short[] DFA119_eof = DFA.unpackEncodedString(DFA119_eofS);
    static final char[] DFA119_min = DFA.unpackEncodedStringToUnsignedChars(DFA119_minS);
    static final char[] DFA119_max = DFA.unpackEncodedStringToUnsignedChars(DFA119_maxS);
    static final short[] DFA119_accept = DFA.unpackEncodedString(DFA119_acceptS);
    static final short[] DFA119_special = DFA.unpackEncodedString(DFA119_specialS);
    static final short[][] DFA119_transition;

    static {
        int numStates = DFA119_transitionS.length;
        DFA119_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA119_transition[i] = DFA.unpackEncodedString(DFA119_transitionS[i]);
        }
    }

    class DFA119 extends DFA {

        public DFA119(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 119;
            this.eot = DFA119_eot;
            this.eof = DFA119_eof;
            this.min = DFA119_min;
            this.max = DFA119_max;
            this.accept = DFA119_accept;
            this.special = DFA119_special;
            this.transition = DFA119_transition;
        }
        public String getDescription() {
            return "317:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA119_1 = input.LA(1);

                         
                        int index119_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred184_Fan()) ) {s = 5;}

                        else if ( (synpred185_Fan()) ) {s = 4;}

                        else if ( (synpred187_Fan()) ) {s = 6;}

                        else if ( (synpred190_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index119_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA119_2 = input.LA(1);

                         
                        int index119_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred184_Fan()) ) {s = 5;}

                        else if ( (synpred185_Fan()) ) {s = 4;}

                        else if ( (synpred187_Fan()) ) {s = 6;}

                        else if ( (synpred189_Fan()) ) {s = 9;}

                        else if ( (synpred190_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index119_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA119_3 = input.LA(1);

                         
                        int index119_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred184_Fan()) ) {s = 5;}

                        else if ( (synpred185_Fan()) ) {s = 4;}

                        else if ( (synpred186_Fan()) ) {s = 10;}

                        else if ( (synpred187_Fan()) ) {s = 6;}

                        else if ( (synpred188_Fan()) ) {s = 11;}

                        else if ( (synpred190_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index119_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 119, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA125_eotS =
        "\117\uffff";
    static final String DFA125_eofS =
        "\1\1\116\uffff";
    static final String DFA125_minS =
        "\1\4\5\uffff\1\0\110\uffff";
    static final String DFA125_maxS =
        "\1\141\5\uffff\1\0\110\uffff";
    static final String DFA125_acceptS =
        "\1\uffff\1\2\114\uffff\1\1";
    static final String DFA125_specialS =
        "\6\uffff\1\0\110\uffff}>";
    static final String[] DFA125_transitionS = {
            "\15\1\1\uffff\35\1\1\uffff\12\1\1\uffff\1\6\1\1\1\uffff\30\1"+
            "\1\uffff\13\1",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA125_eot = DFA.unpackEncodedString(DFA125_eotS);
    static final short[] DFA125_eof = DFA.unpackEncodedString(DFA125_eofS);
    static final char[] DFA125_min = DFA.unpackEncodedStringToUnsignedChars(DFA125_minS);
    static final char[] DFA125_max = DFA.unpackEncodedStringToUnsignedChars(DFA125_maxS);
    static final short[] DFA125_accept = DFA.unpackEncodedString(DFA125_acceptS);
    static final short[] DFA125_special = DFA.unpackEncodedString(DFA125_specialS);
    static final short[][] DFA125_transition;

    static {
        int numStates = DFA125_transitionS.length;
        DFA125_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA125_transition[i] = DFA.unpackEncodedString(DFA125_transitionS[i]);
        }
    }

    class DFA125 extends DFA {

        public DFA125(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 125;
            this.eot = DFA125_eot;
            this.eof = DFA125_eof;
            this.min = DFA125_min;
            this.max = DFA125_max;
            this.accept = DFA125_accept;
            this.special = DFA125_special;
            this.transition = DFA125_transition;
        }
        public String getDescription() {
            return "()* loopback of 334:47: ( closure )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA125_6 = input.LA(1);

                         
                        int index125_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred201_Fan()) ) {s = 78;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index125_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 125, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA132_eotS =
        "\26\uffff";
    static final String DFA132_eofS =
        "\26\uffff";
    static final String DFA132_minS =
        "\1\46\14\uffff\3\0\6\uffff";
    static final String DFA132_maxS =
        "\1\141\14\uffff\3\0\6\uffff";
    static final String DFA132_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\13"+
        "\3\uffff\1\15\1\14\1\16\1\17\1\20\1\21";
    static final String DFA132_specialS =
        "\15\uffff\1\0\1\1\1\2\6\uffff}>";
    static final String[] DFA132_transitionS = {
            "\1\2\1\3\3\uffff\1\1\1\4\1\5\1\6\2\uffff\1\16\11\uffff\1\17"+
            "\22\uffff\1\12\13\uffff\1\15\1\7\1\10\1\11\1\14\1\20\1\uffff"+
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA132_eot = DFA.unpackEncodedString(DFA132_eotS);
    static final short[] DFA132_eof = DFA.unpackEncodedString(DFA132_eofS);
    static final char[] DFA132_min = DFA.unpackEncodedStringToUnsignedChars(DFA132_minS);
    static final char[] DFA132_max = DFA.unpackEncodedStringToUnsignedChars(DFA132_maxS);
    static final short[] DFA132_accept = DFA.unpackEncodedString(DFA132_acceptS);
    static final short[] DFA132_special = DFA.unpackEncodedString(DFA132_specialS);
    static final short[][] DFA132_transition;

    static {
        int numStates = DFA132_transitionS.length;
        DFA132_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA132_transition[i] = DFA.unpackEncodedString(DFA132_transitionS[i]);
        }
    }

    class DFA132 extends DFA {

        public DFA132(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 132;
            this.eot = DFA132_eot;
            this.eof = DFA132_eof;
            this.min = DFA132_min;
            this.max = DFA132_max;
            this.accept = DFA132_accept;
            this.special = DFA132_special;
            this.transition = DFA132_transition;
        }
        public String getDescription() {
            return "348:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA132_13 = input.LA(1);

                         
                        int index132_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred220_Fan()) ) {s = 17;}

                        else if ( (synpred221_Fan()) ) {s = 16;}

                        else if ( (synpred222_Fan()) ) {s = 18;}

                        else if ( (synpred223_Fan()) ) {s = 19;}

                        else if ( (synpred224_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index132_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA132_14 = input.LA(1);

                         
                        int index132_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred221_Fan()) ) {s = 16;}

                        else if ( (synpred222_Fan()) ) {s = 18;}

                        else if ( (synpred223_Fan()) ) {s = 19;}

                        else if ( (synpred224_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index132_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA132_15 = input.LA(1);

                         
                        int index132_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred221_Fan()) ) {s = 16;}

                        else if ( (synpred222_Fan()) ) {s = 18;}

                        else if ( (synpred223_Fan()) ) {s = 19;}

                        else if ( (synpred224_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index132_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 132, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_using_in_prog325 = new BitSet(new long[]{0x0000000FF4320000L,0x0000000102000000L});
    public static final BitSet FOLLOW_typeDef_in_prog328 = new BitSet(new long[]{0x0000000FF4300000L,0x0000000102000000L});
    public static final BitSet FOLLOW_docs_in_prog331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingPod_in_using342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingType_in_using346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingAs_in_using350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingPod360 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_podSpec_in_usingPod362 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_eos_in_usingPod364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingType374 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_podSpec_in_usingType376 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingType378 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_usingType380 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_eos_in_usingType382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingAs390 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_podSpec_in_usingAs392 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingAs394 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_usingAs396 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KW_AS_in_usingAs398 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_usingAs400 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_eos_in_usingAs402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ffi_in_podSpec410 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_podSpec413 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_DOT_in_podSpec416 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_podSpec418 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_ffi429 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_ffi431 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_ffi433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_typeDef442 = new BitSet(new long[]{0x0000000FF4300000L,0x0000000102000000L});
    public static final BitSet FOLLOW_facet_in_typeDef444 = new BitSet(new long[]{0x0000000FF4300000L,0x0000000102000000L});
    public static final BitSet FOLLOW_classDef_in_typeDef455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDef_in_typeDef469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinDef_in_typeDef473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classHeader_in_classDef484 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_classBody_in_classDef486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_classHeader493 = new BitSet(new long[]{0x0000000F94300000L,0x0000000002000000L});
    public static final BitSet FOLLOW_facet_in_classHeader495 = new BitSet(new long[]{0x0000000F94300000L,0x0000000002000000L});
    public static final BitSet FOLLOW_classFlags_in_classHeader498 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_classHeader501 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_classHeader503 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_inheritance_in_classHeader505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_classFlags514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_classFlags518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_classFlags522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_classFlags526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_classFlags530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_classBody538 = new BitSet(new long[]{0x0812003F8FF80000L,0x0000000106000000L});
    public static final BitSet FOLLOW_slotDef_in_classBody540 = new BitSet(new long[]{0x0812003F8FF80000L,0x0000000106000000L});
    public static final BitSet FOLLOW_BRACKET_R_in_classBody543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_protection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinHeader_in_mixinDef569 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_mixinBody_in_mixinDef571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_mixinHeader578 = new BitSet(new long[]{0x0000000F44300000L,0x0000000002000000L});
    public static final BitSet FOLLOW_facet_in_mixinHeader580 = new BitSet(new long[]{0x0000000F44300000L,0x0000000002000000L});
    public static final BitSet FOLLOW_mixinFlags_in_mixinHeader583 = new BitSet(new long[]{0x0000000F44300000L});
    public static final BitSet FOLLOW_KW_MIXIN_in_mixinHeader586 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_mixinHeader588 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_inheritance_in_mixinHeader590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_mixinFlags598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_mixinFlags602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_mixinFlags606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_mixinFlags610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_mixinBody617 = new BitSet(new long[]{0x0812003F8FF80000L,0x0000000106000000L});
    public static final BitSet FOLLOW_slotDef_in_mixinBody619 = new BitSet(new long[]{0x0812003F8FF80000L,0x0000000106000000L});
    public static final BitSet FOLLOW_BRACKET_R_in_mixinBody622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumHeader_in_enumDef630 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_enumBody_in_enumDef632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumHeader642 = new BitSet(new long[]{0x0000000F20000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_facet_in_enumHeader644 = new BitSet(new long[]{0x0000000F20000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_protection_in_enumHeader647 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_enumHeader650 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_enumHeader652 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_inheritance_in_enumHeader654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_enumBody662 = new BitSet(new long[]{0x0002000000000000L,0x0000000104000000L});
    public static final BitSet FOLLOW_enumValDefs_in_enumBody664 = new BitSet(new long[]{0x0812003F8FF80000L,0x0000000106000000L});
    public static final BitSet FOLLOW_slotDef_in_enumBody666 = new BitSet(new long[]{0x0812003F8FF80000L,0x0000000106000000L});
    public static final BitSet FOLLOW_BRACKET_R_in_enumBody669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_inheritance678 = new BitSet(new long[]{0x0802000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_typeList_in_inheritance680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs688 = new BitSet(new long[]{0x4040000000000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_enumValDefs691 = new BitSet(new long[]{0x0002000000000000L,0x0000000104000000L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs694 = new BitSet(new long[]{0x4040000000000000L});
    public static final BitSet FOLLOW_eos_in_enumValDefs698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumValDef706 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_enumValDef708 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_enumValDef711 = new BitSet(new long[]{0x098278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_args_in_enumValDef713 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_enumValDef716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList727 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_typeList730 = new BitSet(new long[]{0x0802000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_type_in_typeList732 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_typeRoot_in_type752 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_type755 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_type759 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_type761 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_funcType_in_nonMapType772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_nonMapType776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_typeRoot783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonMapType_in_typeRoot787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_simpleType801 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_SP_COLCOL_in_simpleType804 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_simpleType806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_mapType817 = new BitSet(new long[]{0x0802000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_nonMapType_in_mapType820 = new BitSet(new long[]{0x0620000000000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType822 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_mapType826 = new BitSet(new long[]{0x0620000000000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType828 = new BitSet(new long[]{0x0420000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapType840 = new BitSet(new long[]{0x0802000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_type_in_mapType844 = new BitSet(new long[]{0x0024000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_mapType848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType857 = new BitSet(new long[]{0x1842000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_funcType860 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_formals_in_funcType865 = new BitSet(new long[]{0x1842000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_assignedType_in_funcType872 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_assignedType_in_funcType884 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_assignedType895 = new BitSet(new long[]{0x0802000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_type_in_assignedType897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_in_formals907 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_formals910 = new BitSet(new long[]{0x0802000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_formal_in_formals912 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_formalFull_in_formal922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_formal926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalInferred_in_formal930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalFull942 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_formalFull944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalTypeOnly954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_formalInferred964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticBlock_in_slotDef980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_slotDef988 = new BitSet(new long[]{0x0802003F8FF80000L,0x0000000106000000L});
    public static final BitSet FOLLOW_facet_in_slotDef990 = new BitSet(new long[]{0x0802003F8FF80000L,0x0000000106000000L});
    public static final BitSet FOLLOW_ctorDef_in_slotDef1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDef_in_slotDef1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDef_in_slotDef1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_fieldDef1075 = new BitSet(new long[]{0x0802003F8FF80000L,0x0000000106000000L});
    public static final BitSet FOLLOW_facet_in_fieldDef1077 = new BitSet(new long[]{0x0802003F8FF80000L,0x0000000106000000L});
    public static final BitSet FOLLOW_fieldFlags_in_fieldDef1080 = new BitSet(new long[]{0x0802003F8FF80000L,0x0000000106000000L});
    public static final BitSet FOLLOW_typeId_in_fieldDef1082 = new BitSet(new long[]{0x6008000000000000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_fieldDef1085 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_fieldDef1087 = new BitSet(new long[]{0x4008000000000000L});
    public static final BitSet FOLLOW_BRACKET_L_in_fieldDef1102 = new BitSet(new long[]{0x0000000F00000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_protection_in_fieldDef1105 = new BitSet(new long[]{0x0000000F00000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_getter_in_fieldDef1109 = new BitSet(new long[]{0x489A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_setter_in_fieldDef1113 = new BitSet(new long[]{0x489A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_SP_SEMI_in_fieldDef1116 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_block_in_fieldDef1119 = new BitSet(new long[]{0x0010000F00000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_BRACKET_R_in_fieldDef1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_fieldDef1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeAndId_in_typeId1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_typeId1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeAndId1162 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_typeAndId1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_fieldFlags1172 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_RD_ONLY_in_fieldFlags1176 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_CONST_in_fieldFlags1180 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_STATIC_in_fieldFlags1184 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_fieldFlags1188 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VOLATILE_in_fieldFlags1192 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_fieldFlags1196 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_fieldFlags1200 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_FINAL_in_fieldFlags1204 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_protection_in_fieldFlags1208 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_docs_in_methodDef1217 = new BitSet(new long[]{0x0802002F8F600000L,0x0000000006000000L});
    public static final BitSet FOLLOW_facet_in_methodDef1219 = new BitSet(new long[]{0x0802002F8F600000L,0x0000000006000000L});
    public static final BitSet FOLLOW_methodFlags_in_methodDef1222 = new BitSet(new long[]{0x0802002F8F600000L,0x0000000004000000L});
    public static final BitSet FOLLOW_type_in_methodDef1226 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KW_VOID_in_methodDef1230 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_methodDef1233 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_methodDef1235 = new BitSet(new long[]{0x0902000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_params_in_methodDef1237 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_methodDef1239 = new BitSet(new long[]{0x4008000000000000L});
    public static final BitSet FOLLOW_methodBody_in_methodDef1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_methodFlags1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_methodFlags1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_methodFlags1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_methodFlags1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_methodFlags1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ONCE_in_methodFlags1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_methodFlags1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_methodFlags1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params1289 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_params1292 = new BitSet(new long[]{0x0802000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_param_in_params1294 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_type_in_param1307 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_param1309 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_param1312 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_param1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_methodBody1324 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_stmt_in_methodBody1326 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_BRACKET_R_in_methodBody1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_methodBody1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_ctorDef1342 = new BitSet(new long[]{0x0000001F00000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_facet_in_ctorDef1344 = new BitSet(new long[]{0x0000001F00000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ctorFlags_in_ctorDef1347 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_ctorDef1350 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_ctorDef1352 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_ctorDef1354 = new BitSet(new long[]{0x0902000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_params_in_ctorDef1356 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_ctorDef1358 = new BitSet(new long[]{0x4028000000000000L});
    public static final BitSet FOLLOW_ctorChain_in_ctorDef1365 = new BitSet(new long[]{0x4008000000000000L});
    public static final BitSet FOLLOW_methodBody_in_ctorDef1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_ctorFlags1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_ctorChain1383 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ctorChainThis_in_ctorChain1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorChainSuper_in_ctorChain1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_ctorChainThis1399 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainThis1401 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_ctorChainThis1403 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_ctorChainThis1405 = new BitSet(new long[]{0x098278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_args_in_ctorChainThis1407 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_ctorChainThis1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_ctorChainSuper1417 = new BitSet(new long[]{0x0081000000000000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainSuper1420 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_ctorChainSuper1422 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_ctorChainSuper1426 = new BitSet(new long[]{0x098278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_args_in_ctorChainSuper1428 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_ctorChainSuper1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_staticBlock1439 = new BitSet(new long[]{0x088A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_block_in_staticBlock1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_block1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_multiStmt1467 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_stmt_in_multiStmt1470 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_BRACKET_R_in_multiStmt1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_if_in_stmt1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_for_in_stmt1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_while_in_stmt1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_break_in_stmt1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_continue_in_stmt1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_return_in_stmt1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switch_in_stmt1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_throw_in_stmt1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_try_in_stmt1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_stmt1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localDef_in_stmt1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_BREAK_in_g_break1542 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_eos_in_g_break1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONTINUE_in_g_continue1551 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_eos_in_g_continue1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_g_for1561 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_g_for1563 = new BitSet(new long[]{0x488278FF8FF80000L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_forInit_in_g_for1565 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for1568 = new BitSet(new long[]{0x488278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_g_for1570 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for1573 = new BitSet(new long[]{0x098278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_g_for1575 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_g_for1578 = new BitSet(new long[]{0x088A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_block_in_g_for1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_g_if1589 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_g_if1591 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_g_if1593 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_g_if1595 = new BitSet(new long[]{0x088A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_block_in_g_if1597 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_g_if1604 = new BitSet(new long[]{0x088A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_block_in_g_if1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_g_return1615 = new BitSet(new long[]{0x488278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_eos_in_g_return1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_g_return1622 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_eos_in_g_return1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SWITCH_in_g_switch1632 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_g_switch1634 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_g_switch1636 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_g_switch1638 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_BRACKET_L_in_g_switch1640 = new BitSet(new long[]{0x0010000000006000L});
    public static final BitSet FOLLOW_g_case_in_g_switch1643 = new BitSet(new long[]{0x0010000000006000L});
    public static final BitSet FOLLOW_g_default_in_g_switch1648 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_BRACKET_R_in_g_switch1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_g_throw1660 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_g_throw1662 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_eos_in_g_throw1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHILE_in_g_while1672 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_g_while1674 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_g_while1676 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_g_while1678 = new BitSet(new long[]{0x088A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_block_in_g_while1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_g_try1688 = new BitSet(new long[]{0x088A78FF8FF99FF2L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_try_long_in_g_try1695 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_stmt_in_g_try1699 = new BitSet(new long[]{0x088A78FF8FF99FF2L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_g_catch_in_g_try1708 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_finally_in_g_try1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_try_long1726 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_stmt_in_try_long1728 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_BRACKET_R_in_try_long1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprStmt1738 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_eos_in_exprStmt1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_localDef1747 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_localDef1750 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_localDef1752 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_eos_in_localDef1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_forInit1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forInit1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_forInitDef1775 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_forInitDef1778 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_forInitDef1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_g_catch1791 = new BitSet(new long[]{0x088A78FF8FF81FF2L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_catchDef_in_g_catch1793 = new BitSet(new long[]{0x088A78FF8FF81FF2L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_catch_long_in_g_catch1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_g_catch1805 = new BitSet(new long[]{0x088A78FF8FF81FF2L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_BRACKET_L_in_catch_long1814 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_stmt_in_catch_long1816 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_BRACKET_R_in_catch_long1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_catchDef1827 = new BitSet(new long[]{0x0802000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_type_in_catchDef1829 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_catchDef1831 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_catchDef1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_g_finally1841 = new BitSet(new long[]{0x088A78FF8FF81FF2L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_finally_long_in_g_finally1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_g_finally1852 = new BitSet(new long[]{0x088A78FF8FF81FF2L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_BRACKET_L_in_finally_long1861 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_stmt_in_finally_long1863 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_BRACKET_R_in_finally_long1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_g_case1874 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_g_case1876 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_case1878 = new BitSet(new long[]{0x088A78FF8FF81FF2L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_stmt_in_g_case1880 = new BitSet(new long[]{0x088A78FF8FF81FF2L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_KW_DEFAULT_in_g_default1888 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_default1890 = new BitSet(new long[]{0x088A78FF8FF81FF2L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_stmt_in_g_default1892 = new BitSet(new long[]{0x088A78FF8FF81FF2L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_assignExpr_in_expr1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr1910 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr1913 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_assignExpr_in_assignExpr1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryExpr1924 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ternaryTail_in_ternaryExpr1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_ternaryTail1937 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail1939 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_ternaryTail1941 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr1962 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OR_in_condOrExpr1966 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr1969 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr1979 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_OP_AND_in_condAndExpr1982 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr1985 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr1995 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_CP_EQUALITY_in_equalityExpr1998 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2000 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_elvisExpr_in_relationalExpr2013 = new BitSet(new long[]{0x0000060000040000L,0x0000000000000010L});
    public static final BitSet FOLLOW_typeCheck_in_relationalExpr2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_relationalExpr2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCheck2031 = new BitSet(new long[]{0x0802000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_typeRoot_in_typeCheck2043 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_typeCheck2046 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_typeCheck2051 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_CP_COMPARATORS_in_compare2064 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_elvisExpr_in_compare2066 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2077 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_OP_ELVIS_in_elvisExpr2080 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2082 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2093 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_set_in_rangeExpr2096 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2110 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2121 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_bitOrExpr2124 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2132 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2143 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_OP_CURRY_in_bitAndExpr2146 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2148 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2160 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_shiftExpr2163 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2171 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2182 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_set_in_addExpr2185 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2193 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_set_in_addAppend2203 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_parenExpr_in_addAppend2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2219 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_set_in_multExpr2222 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2234 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_castExpr_in_parenExpr2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_parenExpr2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_parenExpr2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_castExpr2264 = new BitSet(new long[]{0x0802000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_type_in_castExpr2266 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_castExpr2268 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_parenExpr_in_castExpr2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_groupedExpr2279 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_groupedExpr2281 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_groupedExpr2283 = new BitSet(new long[]{0x108B000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_termChain_in_groupedExpr2285 = new BitSet(new long[]{0x108B000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_prefixExpr_in_unaryExpr2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_unaryExpr2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_unaryExpr2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr2310 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_parenExpr_in_prefixExpr2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_postfixExpr2347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_postfixExpr2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termBase_in_termExpr2364 = new BitSet(new long[]{0x108B000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_termChain_in_termExpr2366 = new BitSet(new long[]{0x108B000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_idExprReq_in_termBase2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_termBase2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_termBase2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_termBase2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_typeBase2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_typeBase2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_typeBase2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_typeBase2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_typeBase2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_typeBase2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_typeBase2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorBlock_in_typeBase2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_ctorBlock2448 = new BitSet(new long[]{0x108B000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_itBlock_in_ctorBlock2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_staticCall2457 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_DOT_in_staticCall2459 = new BitSet(new long[]{0x0002000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_idExpr_in_staticCall2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_termChain2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynCall_in_termChain2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_termChain2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDynCall_in_termChain2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpr_in_termChain2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callOp_in_termChain2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itBlock_in_termChain2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_dsl2512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DSL_in_dsl2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_itBlock2524 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_stmt_in_itBlock2527 = new BitSet(new long[]{0x48DA78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_SP_COMMA_in_itBlock2529 = new BitSet(new long[]{0x489A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_SP_SEMI_in_itBlock2532 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_BRACKET_R_in_itBlock2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotCall2545 = new BitSet(new long[]{0x0002000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_idExpr_in_dotCall2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_dynCall2555 = new BitSet(new long[]{0x0002000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_idExpr_in_dynCall2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_safeDotCall2565 = new BitSet(new long[]{0x0002000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_idExpr_in_safeDotCall2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall2574 = new BitSet(new long[]{0x0002000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_idExpr_in_safeDynCall2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_indexExpr2586 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_indexExpr2588 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_indexExpr2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_callOp2601 = new BitSet(new long[]{0x098278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_args_in_callOp2603 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_callOp2607 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_closure_in_callOp2609 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_funcType_in_closure2620 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_BRACKET_L_in_closure2622 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_stmt_in_closure2624 = new BitSet(new long[]{0x089A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_BRACKET_R_in_closure2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_idExpr2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idExpr2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_idExprReq2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_idExprReq2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_field2662 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_field2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call2674 = new BitSet(new long[]{0x0880000000000000L});
    public static final BitSet FOLLOW_callParams_in_call2678 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_closure_in_call2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_call2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_call2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_callParams2700 = new BitSet(new long[]{0x098278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_args_in_callParams2702 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_callParams2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args2714 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_args2717 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_args2720 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_KW_NULL_in_literal2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_literal2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_literal2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IT_in_literal2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_literal2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_literal2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTSTR_in_literal2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_literal2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_literal2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_literal2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_literal2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_literal2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_literal2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_literal2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_literal2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_literal2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_literal2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeLiteral2810 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_OP_POUND_in_typeLiteral2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_slotLiteral2823 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_OP_POUND_in_slotLiteral2826 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_slotLiteral2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_namedSuper2838 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_DOT_in_namedSuper2840 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_SUPER_in_namedSuper2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_list2852 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_list2858 = new BitSet(new long[]{0x08C278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_listItems_in_list2860 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_list2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_listItems2871 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems2874 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_listItems2876 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_map2897 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_map2903 = new BitSet(new long[]{0x08A278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_mapItems_in_map2905 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_map2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapPair_in_mapItems2916 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems2919 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_mapPair_in_mapItems2921 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_mapItems2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_mapPair2939 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapPair2941 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_mapPair2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_simple2951 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_simple2953 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_simple2955 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_simple2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_docs2966 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OP_MINUS_in_number2977 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NUMBER_in_number2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_facet2988 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_facet2990 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_AS_EQUAL_in_facet2993 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_expr_in_facet2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_eos3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getter3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setter3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred7_Fan444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classFlags_in_synpred9_Fan449 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_synpred9_Fan452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_synpred11_Fan463 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_synpred11_Fan466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred38_Fan755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred39_Fan761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_synpred40_Fan759 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred40_Fan761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred42_Fan783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_synpred48_Fan840 = new BitSet(new long[]{0x0802000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_type_in_synpred48_Fan844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_synpred49_Fan848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred51_Fan869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred53_Fan881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_synpred55_Fan922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_synpred56_Fan926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_synpred57_Fan974 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred57_Fan976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred58_Fan990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorFlags_in_synpred60_Fan1007 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_synpred60_Fan1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodFlags_in_synpred63_Fan1024 = new BitSet(new long[]{0x0802002F8F600000L,0x0000000004000000L});
    public static final BitSet FOLLOW_type_in_synpred63_Fan1028 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_KW_VOID_in_synpred63_Fan1032 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_synpred63_Fan1035 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_synpred63_Fan1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getter_in_synpred67_Fan1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred69_Fan1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred72_Fan1145 = new BitSet(new long[]{0x0002000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_id_in_synpred72_Fan1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_synpred100_Fan1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred105_Fan1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_synpred116_Fan1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_synpred120_Fan1604 = new BitSet(new long[]{0x088A78FF8FF81FF0L,0x00000003FE3C6400L});
    public static final BitSet FOLLOW_block_in_synpred120_Fan1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_synpred121_Fan1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred124_Fan1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred125_Fan1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_synpred126_Fan1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_synpred127_Fan1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_synpred130_Fan1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchDef_in_synpred132_Fan1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred133_Fan1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred134_Fan1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred136_Fan1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred137_Fan1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred158_Fan2124 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_bitAndExpr_in_synpred158_Fan2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_CURRY_in_synpred159_Fan2146 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_shiftExpr_in_synpred159_Fan2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred163_Fan2185 = new BitSet(new long[]{0x088278C000000000L,0x00000002FE3C6400L});
    public static final BitSet FOLLOW_multExpr_in_synpred163_Fan2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_synpred168_Fan2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_synpred169_Fan2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred170_Fan2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred171_Fan2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_synpred172_Fan2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred180_Fan2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred181_Fan2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred182_Fan2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_synpred183_Fan2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred184_Fan2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred185_Fan2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred186_Fan2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_synpred187_Fan2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_synpred188_Fan2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred189_Fan2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_synpred190_Fan2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred201_Fan2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred203_Fan2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred205_Fan2678 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_closure_in_synpred205_Fan2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred206_Fan2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred220_Fan2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred221_Fan2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred222_Fan2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_synpred223_Fan2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_synpred224_Fan2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred226_Fan2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred230_Fan2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_synpred234_Fan2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_synpred237_Fan3007 = new BitSet(new long[]{0x0000000000000002L});

}