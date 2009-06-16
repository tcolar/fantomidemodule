package net.colar.netbeans.fan.antlr;

// $ANTLR 3.1.2 antlr/Fan.g 2009-06-15 12:51:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FanParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "T_BREAK", "T_CONTINUE", "T_FOR", "T_IF", "T_RETURN", "T_SWITCH", "T_THROW", "T_WHILE", "T_TRY", "T_CASE", "T_DEFAULT", "T_CATCH", "T_FINALLY", "T_USING", "T_AS", "T_RD_ONLY", "T_CONST", "T_STATIC", "T_NATIVE", "T_VOLATILE", "T_OVERRIDE", "T_VIRTUAL", "T_FINAL", "T_VOID", "T_CLASS", "T_ENUM", "T_MIXIN", "T_ABSTRACT", "T_PRIVATE", "T_PROTECTED", "T_PUBLIC", "T_INTERNAL", "T_NEW", "T_ONCE", "T_THIS", "T_SUPER", "T_ELSE", "T_IS", "T_ISNOT", "T_NULL", "T_IT", "COLCOL", "DOT", "SQ_BRACKET_L", "SQ_BRACKET_R", "BRACKET_L", "BRACKET_R", "COLON", "COMMA", "PAR_L", "PAR_R", "QMARK", "PIPE", "ARROW", "INIT_VAL", "SEMI", "EQUAL", "ELVIS", "RANG_EXCL_OLD", "RANGE_EXCL", "RANGE", "BITOR", "CURRY", "DSL", "AT", "ID", "BOOL_VAL", "QUOTSTR", "STR", "URI", "CHAR", "POUND", "DOC", "MINUS", "NUMBER", "LB", "WS", "LINE_COMMENT", "EXEC_COMMENT", "MULTI_COMMENT", "DIGIT", "HEXLETTER", "KEYWORD", "UNDERSCORE", "HEX_HEADER", "HEXNB", "DECIMAL", "FRACTIONAL", "HEXHEADER", "FRACTION", "EXPONENT", "NBTYPE", "LETTER", "'[]'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'||'", "'&&'", "'==='", "'!=='", "'=='", "'!='", "'<=>'", "'<='", "'<'", "'>='", "'>'", "'<<'", "'>>'", "'+'", "'*'", "'/'", "'%'", "'!'", "'++'", "'--'", "'~'", "'?.'", "'?->'"
    };
    public static final int COMMA=52;
    public static final int HEX_HEADER=88;
    public static final int MINUS=77;
    public static final int T_VOID=27;
    public static final int T_ISNOT=42;
    public static final int NUMBER=78;
    public static final int QUOTSTR=71;
    public static final int T__122=122;
    public static final int T__109=109;
    public static final int T__115=115;
    public static final int FRACTION=93;
    public static final int T__123=123;
    public static final int T_PROTECTED=33;
    public static final int PIPE=56;
    public static final int DOT=46;
    public static final int PAR_R=54;
    public static final int T__128=128;
    public static final int T_IT=44;
    public static final int T_PUBLIC=34;
    public static final int T_ELSE=40;
    public static final int T_MIXIN=30;
    public static final int T__119=119;
    public static final int EXEC_COMMENT=82;
    public static final int T__108=108;
    public static final int T__112=112;
    public static final int HEXNB=89;
    public static final int T_IS=41;
    public static final int T__118=118;
    public static final int AT=68;
    public static final int T__113=113;
    public static final int RANGE=64;
    public static final int T_CONST=20;
    public static final int T_THROW=10;
    public static final int DSL=67;
    public static final int WS=80;
    public static final int CHAR=74;
    public static final int T_CONTINUE=5;
    public static final int BOOL_VAL=70;
    public static final int RANGE_EXCL=63;
    public static final int T__130=130;
    public static final int LINE_COMMENT=81;
    public static final int T_ENUM=29;
    public static final int HEXLETTER=85;
    public static final int SEMI=59;
    public static final int T_SUPER=39;
    public static final int T_USING=17;
    public static final int EQUAL=60;
    public static final int T__114=114;
    public static final int T__125=125;
    public static final int T__110=110;
    public static final int T_FOR=6;
    public static final int T_OVERRIDE=24;
    public static final int T_CATCH=15;
    public static final int QMARK=55;
    public static final int LB=79;
    public static final int COLCOL=45;
    public static final int COLON=51;
    public static final int T_VOLATILE=23;
    public static final int T__124=124;
    public static final int FRACTIONAL=91;
    public static final int T_CASE=13;
    public static final int POUND=75;
    public static final int T_AS=18;
    public static final int HEXHEADER=92;
    public static final int UNDERSCORE=87;
    public static final int T_VIRTUAL=25;
    public static final int T_ABSTRACT=31;
    public static final int T_FINAL=26;
    public static final int NBTYPE=95;
    public static final int T__100=100;
    public static final int T_TRY=12;
    public static final int ARROW=57;
    public static final int T_RETURN=8;
    public static final int T__126=126;
    public static final int SQ_BRACKET_L=47;
    public static final int T_FINALLY=16;
    public static final int T_SWITCH=9;
    public static final int DOC=76;
    public static final int T__101=101;
    public static final int CURRY=66;
    public static final int T__104=104;
    public static final int DECIMAL=90;
    public static final int T_NATIVE=22;
    public static final int URI=73;
    public static final int T__107=107;
    public static final int T_ONCE=37;
    public static final int T__106=106;
    public static final int T_THIS=38;
    public static final int PAR_L=53;
    public static final int T_DEFAULT=14;
    public static final int BITOR=65;
    public static final int BRACKET_L=49;
    public static final int T_IF=7;
    public static final int T__127=127;
    public static final int T_PRIVATE=32;
    public static final int DIGIT=84;
    public static final int T__120=120;
    public static final int T__98=98;
    public static final int ID=69;
    public static final int LETTER=96;
    public static final int T_RD_ONLY=19;
    public static final int T__117=117;
    public static final int T_NEW=36;
    public static final int KEYWORD=86;
    public static final int ELVIS=61;
    public static final int T__99=99;
    public static final int T_STATIC=21;
    public static final int MULTI_COMMENT=83;
    public static final int STR=72;
    public static final int BRACKET_R=50;
    public static final int T_CLASS=28;
    public static final int T__129=129;
    public static final int T__121=121;
    public static final int T__103=103;
    public static final int T_INTERNAL=35;
    public static final int T__97=97;
    public static final int EXPONENT=94;
    public static final int T__105=105;
    public static final int T__111=111;
    public static final int INIT_VAL=58;
    public static final int T__116=116;
    public static final int EOF=-1;
    public static final int T_BREAK=4;
    public static final int T_WHILE=11;
    public static final int SQ_BRACKET_R=48;
    public static final int T_NULL=43;
    public static final int RANG_EXCL_OLD=62;
    public static final int T__102=102;

    // delegates
    // delegators


        public FanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[391+1];
             
             
        }
        

    public String[] getTokenNames() { return FanParser.tokenNames; }
    public String getGrammarFileName() { return "antlr/Fan.g"; }


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
    			if(input.get(index).getType() == COMMA)
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
    // antlr/Fan.g:153:1: prog : ( using )* ( typeDef )* docs EOF ;
    public final void prog() throws RecognitionException {
        int prog_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // antlr/Fan.g:153:7: ( ( using )* ( typeDef )* docs EOF )
            // antlr/Fan.g:153:11: ( using )* ( typeDef )* docs EOF
            {
            // antlr/Fan.g:153:11: ( using )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==T_USING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // antlr/Fan.g:0:0: using
            	    {
            	    pushFollow(FOLLOW_using_in_prog317);
            	    using();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // antlr/Fan.g:153:18: ( typeDef )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // antlr/Fan.g:0:0: typeDef
            	    {
            	    pushFollow(FOLLOW_typeDef_in_prog320);
            	    typeDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_docs_in_prog323);
            docs();

            state._fsp--;
            if (state.failed) return ;
            match(input,EOF,FOLLOW_EOF_in_prog325); if (state.failed) return ;

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
    // antlr/Fan.g:154:1: using : ( usingPod | usingType | usingAs ) ;
    public final void using() throws RecognitionException {
        int using_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // antlr/Fan.g:154:8: ( ( usingPod | usingType | usingAs ) )
            // antlr/Fan.g:154:10: ( usingPod | usingType | usingAs )
            {
            // antlr/Fan.g:154:10: ( usingPod | usingType | usingAs )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // antlr/Fan.g:154:11: usingPod
                    {
                    pushFollow(FOLLOW_usingPod_in_using334);
                    usingPod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:154:22: usingType
                    {
                    pushFollow(FOLLOW_usingType_in_using338);
                    usingType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:154:34: usingAs
                    {
                    pushFollow(FOLLOW_usingAs_in_using342);
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
    // antlr/Fan.g:155:1: usingPod : T_USING podSpec eos ;
    public final void usingPod() throws RecognitionException {
        int usingPod_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // antlr/Fan.g:156:3: ( T_USING podSpec eos )
            // antlr/Fan.g:156:5: T_USING podSpec eos
            {
            match(input,T_USING,FOLLOW_T_USING_in_usingPod352); if (state.failed) return ;
            pushFollow(FOLLOW_podSpec_in_usingPod354);
            podSpec();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_usingPod356);
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
    // antlr/Fan.g:157:1: usingType : T_USING podSpec COLCOL id eos ;
    public final void usingType() throws RecognitionException {
        int usingType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // antlr/Fan.g:158:3: ( T_USING podSpec COLCOL id eos )
            // antlr/Fan.g:158:5: T_USING podSpec COLCOL id eos
            {
            match(input,T_USING,FOLLOW_T_USING_in_usingType366); if (state.failed) return ;
            pushFollow(FOLLOW_podSpec_in_usingType368);
            podSpec();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLCOL,FOLLOW_COLCOL_in_usingType370); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_usingType372);
            id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_usingType374);
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
    // antlr/Fan.g:159:1: usingAs : T_USING podSpec COLCOL id T_AS id eos ;
    public final void usingAs() throws RecognitionException {
        int usingAs_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // antlr/Fan.g:159:10: ( T_USING podSpec COLCOL id T_AS id eos )
            // antlr/Fan.g:159:12: T_USING podSpec COLCOL id T_AS id eos
            {
            match(input,T_USING,FOLLOW_T_USING_in_usingAs382); if (state.failed) return ;
            pushFollow(FOLLOW_podSpec_in_usingAs384);
            podSpec();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLCOL,FOLLOW_COLCOL_in_usingAs386); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_usingAs388);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,T_AS,FOLLOW_T_AS_in_usingAs390); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_usingAs392);
            id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_usingAs394);
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
    // antlr/Fan.g:160:1: podSpec : ( ffi )? id ( DOT id )* ;
    public final void podSpec() throws RecognitionException {
        int podSpec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // antlr/Fan.g:160:10: ( ( ffi )? id ( DOT id )* )
            // antlr/Fan.g:160:12: ( ffi )? id ( DOT id )*
            {
            // antlr/Fan.g:160:12: ( ffi )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SQ_BRACKET_L) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // antlr/Fan.g:0:0: ffi
                    {
                    pushFollow(FOLLOW_ffi_in_podSpec402);
                    ffi();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_podSpec405);
            id();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:160:20: ( DOT id )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DOT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // antlr/Fan.g:160:21: DOT id
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_podSpec408); if (state.failed) return ;
            	    pushFollow(FOLLOW_id_in_podSpec410);
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
    // antlr/Fan.g:161:1: ffi : SQ_BRACKET_L id SQ_BRACKET_R ;
    public final void ffi() throws RecognitionException {
        int ffi_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // antlr/Fan.g:161:7: ( SQ_BRACKET_L id SQ_BRACKET_R )
            // antlr/Fan.g:161:9: SQ_BRACKET_L id SQ_BRACKET_R
            {
            match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_ffi421); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_ffi423);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_ffi425); if (state.failed) return ;

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
    // antlr/Fan.g:163:1: typeDef : docs ( facet )* ( ( ( classFlags )* T_CLASS )=> classDef | ( ( protection )? T_ENUM )=> enumDef | mixinDef ) ;
    public final void typeDef() throws RecognitionException {
        int typeDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // antlr/Fan.g:163:10: ( docs ( facet )* ( ( ( classFlags )* T_CLASS )=> classDef | ( ( protection )? T_ENUM )=> enumDef | mixinDef ) )
            // antlr/Fan.g:163:12: docs ( facet )* ( ( ( classFlags )* T_CLASS )=> classDef | ( ( protection )? T_ENUM )=> enumDef | mixinDef )
            {
            pushFollow(FOLLOW_docs_in_typeDef434);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:163:17: ( facet )*
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
            	    // antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_typeDef436);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // antlr/Fan.g:163:24: ( ( ( classFlags )* T_CLASS )=> classDef | ( ( protection )? T_ENUM )=> enumDef | mixinDef )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // antlr/Fan.g:163:25: ( ( classFlags )* T_CLASS )=> classDef
                    {
                    pushFollow(FOLLOW_classDef_in_typeDef447);
                    classDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:164:4: ( ( protection )? T_ENUM )=> enumDef
                    {
                    pushFollow(FOLLOW_enumDef_in_typeDef461);
                    enumDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:164:36: mixinDef
                    {
                    pushFollow(FOLLOW_mixinDef_in_typeDef465);
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
    // antlr/Fan.g:165:1: classDef : classHeader classBody ;
    public final void classDef() throws RecognitionException {
        int classDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // antlr/Fan.g:165:11: ( classHeader classBody )
            // antlr/Fan.g:165:15: classHeader classBody
            {
            pushFollow(FOLLOW_classHeader_in_classDef476);
            classHeader();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_classBody_in_classDef478);
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
    // antlr/Fan.g:166:1: classHeader : docs ( facet )* ( classFlags )* T_CLASS id ( inheritance )? ;
    public final void classHeader() throws RecognitionException {
        int classHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // antlr/Fan.g:166:13: ( docs ( facet )* ( classFlags )* T_CLASS id ( inheritance )? )
            // antlr/Fan.g:166:15: docs ( facet )* ( classFlags )* T_CLASS id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_classHeader485);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:166:20: ( facet )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_classHeader487);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // antlr/Fan.g:166:27: ( classFlags )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=T_CONST && LA9_0<=T_STATIC)||LA9_0==T_FINAL||(LA9_0>=T_ABSTRACT && LA9_0<=T_INTERNAL)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // antlr/Fan.g:0:0: classFlags
            	    {
            	    pushFollow(FOLLOW_classFlags_in_classHeader490);
            	    classFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,T_CLASS,FOLLOW_T_CLASS_in_classHeader493); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_classHeader495);
            id();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:166:50: ( inheritance )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==COLON) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_classHeader497);
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
    // antlr/Fan.g:167:1: classFlags : ( protection | T_ABSTRACT | T_FINAL | T_CONST | T_STATIC );
    public final void classFlags() throws RecognitionException {
        int classFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // antlr/Fan.g:167:13: ( protection | T_ABSTRACT | T_FINAL | T_CONST | T_STATIC )
            int alt11=5;
            switch ( input.LA(1) ) {
            case T_PRIVATE:
            case T_PROTECTED:
            case T_PUBLIC:
            case T_INTERNAL:
                {
                alt11=1;
                }
                break;
            case T_ABSTRACT:
                {
                alt11=2;
                }
                break;
            case T_FINAL:
                {
                alt11=3;
                }
                break;
            case T_CONST:
                {
                alt11=4;
                }
                break;
            case T_STATIC:
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
                    // antlr/Fan.g:167:15: protection
                    {
                    pushFollow(FOLLOW_protection_in_classFlags506);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:167:28: T_ABSTRACT
                    {
                    match(input,T_ABSTRACT,FOLLOW_T_ABSTRACT_in_classFlags510); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:167:41: T_FINAL
                    {
                    match(input,T_FINAL,FOLLOW_T_FINAL_in_classFlags514); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // antlr/Fan.g:167:51: T_CONST
                    {
                    match(input,T_CONST,FOLLOW_T_CONST_in_classFlags518); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // antlr/Fan.g:167:61: T_STATIC
                    {
                    match(input,T_STATIC,FOLLOW_T_STATIC_in_classFlags522); if (state.failed) return ;

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
    // antlr/Fan.g:168:1: classBody : BRACKET_L ( slotDef )* BRACKET_R ;
    public final void classBody() throws RecognitionException {
        int classBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // antlr/Fan.g:168:12: ( BRACKET_L ( slotDef )* BRACKET_R )
            // antlr/Fan.g:168:14: BRACKET_L ( slotDef )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_classBody530); if (state.failed) return ;
            // antlr/Fan.g:168:24: ( slotDef )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=T_RD_ONLY && LA12_0<=T_VOID)||(LA12_0>=T_ABSTRACT && LA12_0<=T_ONCE)||LA12_0==SQ_BRACKET_L||LA12_0==PIPE||(LA12_0>=AT && LA12_0<=ID)||LA12_0==DOC) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_classBody532);
            	    slotDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_classBody535); if (state.failed) return ;

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
    // antlr/Fan.g:169:1: protection : ( T_PUBLIC | T_PROTECTED | T_PRIVATE | T_INTERNAL );
    public final void protection() throws RecognitionException {
        int protection_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // antlr/Fan.g:169:12: ( T_PUBLIC | T_PROTECTED | T_PRIVATE | T_INTERNAL )
            // antlr/Fan.g:
            {
            if ( (input.LA(1)>=T_PRIVATE && input.LA(1)<=T_INTERNAL) ) {
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
    // antlr/Fan.g:170:1: mixinDef : mixinHeader mixinBody ;
    public final void mixinDef() throws RecognitionException {
        int mixinDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // antlr/Fan.g:170:10: ( mixinHeader mixinBody )
            // antlr/Fan.g:170:12: mixinHeader mixinBody
            {
            pushFollow(FOLLOW_mixinHeader_in_mixinDef561);
            mixinHeader();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_mixinBody_in_mixinDef563);
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
    // antlr/Fan.g:171:1: mixinHeader : docs ( facet )* ( mixinFlags )* T_MIXIN id ( inheritance )? ;
    public final void mixinHeader() throws RecognitionException {
        int mixinHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // antlr/Fan.g:171:13: ( docs ( facet )* ( mixinFlags )* T_MIXIN id ( inheritance )? )
            // antlr/Fan.g:171:15: docs ( facet )* ( mixinFlags )* T_MIXIN id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_mixinHeader570);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:171:20: ( facet )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_mixinHeader572);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // antlr/Fan.g:171:27: ( mixinFlags )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=T_CONST && LA14_0<=T_STATIC)||LA14_0==T_FINAL||(LA14_0>=T_PRIVATE && LA14_0<=T_INTERNAL)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // antlr/Fan.g:0:0: mixinFlags
            	    {
            	    pushFollow(FOLLOW_mixinFlags_in_mixinHeader575);
            	    mixinFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,T_MIXIN,FOLLOW_T_MIXIN_in_mixinHeader578); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_mixinHeader580);
            id();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:171:50: ( inheritance )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==COLON) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_mixinHeader582);
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
    // antlr/Fan.g:172:1: mixinFlags : ( protection | T_CONST | T_STATIC | T_FINAL );
    public final void mixinFlags() throws RecognitionException {
        int mixinFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // antlr/Fan.g:172:12: ( protection | T_CONST | T_STATIC | T_FINAL )
            int alt16=4;
            switch ( input.LA(1) ) {
            case T_PRIVATE:
            case T_PROTECTED:
            case T_PUBLIC:
            case T_INTERNAL:
                {
                alt16=1;
                }
                break;
            case T_CONST:
                {
                alt16=2;
                }
                break;
            case T_STATIC:
                {
                alt16=3;
                }
                break;
            case T_FINAL:
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
                    // antlr/Fan.g:172:14: protection
                    {
                    pushFollow(FOLLOW_protection_in_mixinFlags590);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:172:27: T_CONST
                    {
                    match(input,T_CONST,FOLLOW_T_CONST_in_mixinFlags594); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:172:37: T_STATIC
                    {
                    match(input,T_STATIC,FOLLOW_T_STATIC_in_mixinFlags598); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // antlr/Fan.g:172:48: T_FINAL
                    {
                    match(input,T_FINAL,FOLLOW_T_FINAL_in_mixinFlags602); if (state.failed) return ;

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
    // antlr/Fan.g:173:1: mixinBody : BRACKET_L ( slotDef )* BRACKET_R ;
    public final void mixinBody() throws RecognitionException {
        int mixinBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // antlr/Fan.g:173:11: ( BRACKET_L ( slotDef )* BRACKET_R )
            // antlr/Fan.g:173:13: BRACKET_L ( slotDef )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_mixinBody609); if (state.failed) return ;
            // antlr/Fan.g:173:23: ( slotDef )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=T_RD_ONLY && LA17_0<=T_VOID)||(LA17_0>=T_ABSTRACT && LA17_0<=T_ONCE)||LA17_0==SQ_BRACKET_L||LA17_0==PIPE||(LA17_0>=AT && LA17_0<=ID)||LA17_0==DOC) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_mixinBody611);
            	    slotDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_mixinBody614); if (state.failed) return ;

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
    // antlr/Fan.g:174:1: enumDef : enumHeader enumBody ;
    public final void enumDef() throws RecognitionException {
        int enumDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // antlr/Fan.g:174:10: ( enumHeader enumBody )
            // antlr/Fan.g:174:12: enumHeader enumBody
            {
            pushFollow(FOLLOW_enumHeader_in_enumDef622);
            enumHeader();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_enumBody_in_enumDef624);
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
    // antlr/Fan.g:175:1: enumHeader : docs ( facet )* ( protection )? T_ENUM id ( inheritance )? ;
    public final void enumHeader() throws RecognitionException {
        int enumHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // antlr/Fan.g:175:12: ( docs ( facet )* ( protection )? T_ENUM id ( inheritance )? )
            // antlr/Fan.g:175:17: docs ( facet )* ( protection )? T_ENUM id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_enumHeader634);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:175:22: ( facet )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==AT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_enumHeader636);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // antlr/Fan.g:175:29: ( protection )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=T_PRIVATE && LA19_0<=T_INTERNAL)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // antlr/Fan.g:0:0: protection
                    {
                    pushFollow(FOLLOW_protection_in_enumHeader639);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,T_ENUM,FOLLOW_T_ENUM_in_enumHeader642); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_enumHeader644);
            id();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:175:51: ( inheritance )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==COLON) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_enumHeader646);
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
    // antlr/Fan.g:176:1: enumBody : BRACKET_L enumValDefs ( slotDef )* BRACKET_R ;
    public final void enumBody() throws RecognitionException {
        int enumBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // antlr/Fan.g:176:10: ( BRACKET_L enumValDefs ( slotDef )* BRACKET_R )
            // antlr/Fan.g:176:12: BRACKET_L enumValDefs ( slotDef )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_enumBody654); if (state.failed) return ;
            pushFollow(FOLLOW_enumValDefs_in_enumBody656);
            enumValDefs();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:176:34: ( slotDef )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=T_RD_ONLY && LA21_0<=T_VOID)||(LA21_0>=T_ABSTRACT && LA21_0<=T_ONCE)||LA21_0==SQ_BRACKET_L||LA21_0==PIPE||(LA21_0>=AT && LA21_0<=ID)||LA21_0==DOC) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_enumBody658);
            	    slotDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_enumBody661); if (state.failed) return ;

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
    // antlr/Fan.g:177:1: inheritance : COLON typeList ;
    public final void inheritance() throws RecognitionException {
        int inheritance_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // antlr/Fan.g:177:14: ( COLON typeList )
            // antlr/Fan.g:177:16: COLON typeList
            {
            match(input,COLON,FOLLOW_COLON_in_inheritance670); if (state.failed) return ;
            pushFollow(FOLLOW_typeList_in_inheritance672);
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
    // antlr/Fan.g:178:1: enumValDefs : enumValDef ( COMMA enumValDef )* eos ;
    public final void enumValDefs() throws RecognitionException {
        int enumValDefs_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // antlr/Fan.g:178:14: ( enumValDef ( COMMA enumValDef )* eos )
            // antlr/Fan.g:178:16: enumValDef ( COMMA enumValDef )* eos
            {
            pushFollow(FOLLOW_enumValDef_in_enumValDefs680);
            enumValDef();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:178:27: ( COMMA enumValDef )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // antlr/Fan.g:178:28: COMMA enumValDef
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_enumValDefs683); if (state.failed) return ;
            	    pushFollow(FOLLOW_enumValDef_in_enumValDefs686);
            	    enumValDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            pushFollow(FOLLOW_eos_in_enumValDefs690);
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
    // antlr/Fan.g:179:1: enumValDef : docs id ( PAR_L ( args )? PAR_R )? ;
    public final void enumValDef() throws RecognitionException {
        int enumValDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // antlr/Fan.g:179:13: ( docs id ( PAR_L ( args )? PAR_R )? )
            // antlr/Fan.g:179:15: docs id ( PAR_L ( args )? PAR_R )?
            {
            pushFollow(FOLLOW_docs_in_enumValDef698);
            docs();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_enumValDef700);
            id();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:179:23: ( PAR_L ( args )? PAR_R )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==PAR_L) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // antlr/Fan.g:179:24: PAR_L ( args )? PAR_R
                    {
                    match(input,PAR_L,FOLLOW_PAR_L_in_enumValDef703); if (state.failed) return ;
                    // antlr/Fan.g:179:30: ( args )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=T_THIS && LA23_0<=T_SUPER)||(LA23_0>=T_NULL && LA23_0<=T_IT)||LA23_0==SQ_BRACKET_L||LA23_0==PAR_L||LA23_0==PIPE||LA23_0==CURRY||(LA23_0>=AT && LA23_0<=POUND)||(LA23_0>=MINUS && LA23_0<=NUMBER)||LA23_0==121||(LA23_0>=125 && LA23_0<=128)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // antlr/Fan.g:0:0: args
                            {
                            pushFollow(FOLLOW_args_in_enumValDef705);
                            args();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,PAR_R,FOLLOW_PAR_R_in_enumValDef708); if (state.failed) return ;

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
    // antlr/Fan.g:180:1: typeList : type ( COMMA type )* ;
    public final void typeList() throws RecognitionException {
        int typeList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // antlr/Fan.g:180:10: ( type ( COMMA type )* )
            // antlr/Fan.g:180:14: type ( COMMA type )*
            {
            pushFollow(FOLLOW_type_in_typeList719);
            type();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:180:19: ( COMMA type )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // antlr/Fan.g:180:20: COMMA type
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_typeList722); if (state.failed) return ;
            	    pushFollow(FOLLOW_type_in_typeList724);
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
    // antlr/Fan.g:182:1: type : typeRoot ( QMARK )? ( '[]' ( QMARK )? )* ;
    public final void type() throws RecognitionException {
        int type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // antlr/Fan.g:182:14: ( typeRoot ( QMARK )? ( '[]' ( QMARK )? )* )
            // antlr/Fan.g:182:18: typeRoot ( QMARK )? ( '[]' ( QMARK )? )*
            {
            pushFollow(FOLLOW_typeRoot_in_type744);
            typeRoot();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:182:28: ( QMARK )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==QMARK) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred38_Fan()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // antlr/Fan.g:0:0: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_type747); if (state.failed) return ;

                    }
                    break;

            }

            // antlr/Fan.g:182:35: ( '[]' ( QMARK )? )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==97) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred40_Fan()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // antlr/Fan.g:182:36: '[]' ( QMARK )?
            	    {
            	    match(input,97,FOLLOW_97_in_type751); if (state.failed) return ;
            	    // antlr/Fan.g:182:41: ( QMARK )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==QMARK) ) {
            	        int LA27_1 = input.LA(2);

            	        if ( (synpred39_Fan()) ) {
            	            alt27=1;
            	        }
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // antlr/Fan.g:0:0: QMARK
            	            {
            	            match(input,QMARK,FOLLOW_QMARK_in_type753); if (state.failed) return ;

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
    // antlr/Fan.g:183:1: nonMapType : ( funcType | simpleType );
    public final void nonMapType() throws RecognitionException {
        int nonMapType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }
            // antlr/Fan.g:183:12: ( funcType | simpleType )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==PIPE) ) {
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
                    // antlr/Fan.g:183:14: funcType
                    {
                    pushFollow(FOLLOW_funcType_in_nonMapType764);
                    funcType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:183:25: simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_nonMapType768);
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
    // antlr/Fan.g:184:1: typeRoot : ( mapType | nonMapType );
    public final void typeRoot() throws RecognitionException {
        int typeRoot_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // antlr/Fan.g:184:10: ( mapType | nonMapType )
            int alt30=2;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                alt30=1;
                }
                break;
            case PIPE:
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
                    // antlr/Fan.g:184:12: mapType
                    {
                    pushFollow(FOLLOW_mapType_in_typeRoot775);
                    mapType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:184:22: nonMapType
                    {
                    pushFollow(FOLLOW_nonMapType_in_typeRoot779);
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
    // antlr/Fan.g:185:1: simpleType : id ( COLCOL id )? ;
    public final void simpleType() throws RecognitionException {
        int simpleType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // antlr/Fan.g:185:17: ( id ( COLCOL id )? )
            // antlr/Fan.g:185:21: id ( COLCOL id )?
            {
            pushFollow(FOLLOW_id_in_simpleType793);
            id();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:185:24: ( COLCOL id )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==COLCOL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // antlr/Fan.g:185:25: COLCOL id
                    {
                    match(input,COLCOL,FOLLOW_COLCOL_in_simpleType796); if (state.failed) return ;
                    pushFollow(FOLLOW_id_in_simpleType798);
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
    // antlr/Fan.g:187:1: mapType : ( SQ_BRACKET_L )? nonMapType ( QMARK )? ( '[]' ( QMARK )? )* ({...}? COLON {...}? type )+ ( SQ_BRACKET_R )? ;
    public final void mapType() throws RecognitionException {
        int mapType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // antlr/Fan.g:187:10: ( ( SQ_BRACKET_L )? nonMapType ( QMARK )? ( '[]' ( QMARK )? )* ({...}? COLON {...}? type )+ ( SQ_BRACKET_R )? )
            // antlr/Fan.g:187:12: ( SQ_BRACKET_L )? nonMapType ( QMARK )? ( '[]' ( QMARK )? )* ({...}? COLON {...}? type )+ ( SQ_BRACKET_R )?
            {
            // antlr/Fan.g:187:12: ( SQ_BRACKET_L )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==SQ_BRACKET_L) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // antlr/Fan.g:0:0: SQ_BRACKET_L
                    {
                    match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_mapType809); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_nonMapType_in_mapType812);
            nonMapType();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:187:37: ( QMARK )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==QMARK) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // antlr/Fan.g:0:0: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_mapType814); if (state.failed) return ;

                    }
                    break;

            }

            // antlr/Fan.g:187:44: ( '[]' ( QMARK )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==97) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // antlr/Fan.g:187:45: '[]' ( QMARK )?
            	    {
            	    match(input,97,FOLLOW_97_in_mapType818); if (state.failed) return ;
            	    // antlr/Fan.g:187:50: ( QMARK )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==QMARK) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // antlr/Fan.g:0:0: QMARK
            	            {
            	            match(input,QMARK,FOLLOW_QMARK_in_mapType820); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // antlr/Fan.g:188:5: ({...}? COLON {...}? type )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==COLON) ) {
                    int LA36_2 = input.LA(2);

                    if ( ((synpred48_Fan()&&(notAfterEol()))) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // antlr/Fan.g:188:6: {...}? COLON {...}? type
            	    {
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    match(input,COLON,FOLLOW_COLON_in_mapType832); if (state.failed) return ;
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    pushFollow(FOLLOW_type_in_mapType836);
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

            // antlr/Fan.g:188:53: ( SQ_BRACKET_R )?
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
                    // antlr/Fan.g:0:0: SQ_BRACKET_R
                    {
                    match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_mapType840); if (state.failed) return ;

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
    // antlr/Fan.g:189:1: funcType : PIPE ( COMMA | ( formals ( ( ARROW )=> assignedType )? ) | ( ( ARROW )=> assignedType ) ) PIPE ;
    public final void funcType() throws RecognitionException {
        int funcType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // antlr/Fan.g:189:11: ( PIPE ( COMMA | ( formals ( ( ARROW )=> assignedType )? ) | ( ( ARROW )=> assignedType ) ) PIPE )
            // antlr/Fan.g:189:13: PIPE ( COMMA | ( formals ( ( ARROW )=> assignedType )? ) | ( ( ARROW )=> assignedType ) ) PIPE
            {
            match(input,PIPE,FOLLOW_PIPE_in_funcType849); if (state.failed) return ;
            // antlr/Fan.g:189:18: ( COMMA | ( formals ( ( ARROW )=> assignedType )? ) | ( ( ARROW )=> assignedType ) )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==COMMA) ) {
                alt39=1;
            }
            else if ( (LA39_0==SQ_BRACKET_L||LA39_0==PIPE||LA39_0==ID) ) {
                alt39=2;
            }
            else if ( (LA39_0==ARROW) && (synpred53_Fan())) {
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
                    // antlr/Fan.g:189:19: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_funcType852); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:189:27: ( formals ( ( ARROW )=> assignedType )? )
                    {
                    // antlr/Fan.g:189:27: ( formals ( ( ARROW )=> assignedType )? )
                    // antlr/Fan.g:189:28: formals ( ( ARROW )=> assignedType )?
                    {
                    pushFollow(FOLLOW_formals_in_funcType857);
                    formals();

                    state._fsp--;
                    if (state.failed) return ;
                    // antlr/Fan.g:189:36: ( ( ARROW )=> assignedType )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ARROW) && (synpred51_Fan())) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // antlr/Fan.g:189:37: ( ARROW )=> assignedType
                            {
                            pushFollow(FOLLOW_assignedType_in_funcType864);
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
                    // antlr/Fan.g:189:64: ( ( ARROW )=> assignedType )
                    {
                    // antlr/Fan.g:189:64: ( ( ARROW )=> assignedType )
                    // antlr/Fan.g:189:65: ( ARROW )=> assignedType
                    {
                    pushFollow(FOLLOW_assignedType_in_funcType876);
                    assignedType();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;

            }

            match(input,PIPE,FOLLOW_PIPE_in_funcType880); if (state.failed) return ;

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
    // antlr/Fan.g:190:1: assignedType : ARROW type ;
    public final void assignedType() throws RecognitionException {
        int assignedType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // antlr/Fan.g:190:14: ( ARROW type )
            // antlr/Fan.g:190:16: ARROW type
            {
            match(input,ARROW,FOLLOW_ARROW_in_assignedType887); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_assignedType889);
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
    // antlr/Fan.g:191:1: formals : formal ( COMMA formal )* ;
    public final void formals() throws RecognitionException {
        int formals_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // antlr/Fan.g:191:10: ( formal ( COMMA formal )* )
            // antlr/Fan.g:191:14: formal ( COMMA formal )*
            {
            pushFollow(FOLLOW_formal_in_formals899);
            formal();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:191:21: ( COMMA formal )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // antlr/Fan.g:191:22: COMMA formal
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_formals902); if (state.failed) return ;
            	    pushFollow(FOLLOW_formal_in_formals904);
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
    // antlr/Fan.g:192:1: formal : ( formalFull | formalTypeOnly | formalInferred );
    public final void formal() throws RecognitionException {
        int formal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // antlr/Fan.g:192:9: ( formalFull | formalTypeOnly | formalInferred )
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
            case PIPE:
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
                    // antlr/Fan.g:192:11: formalFull
                    {
                    pushFollow(FOLLOW_formalFull_in_formal914);
                    formalFull();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:192:24: formalTypeOnly
                    {
                    pushFollow(FOLLOW_formalTypeOnly_in_formal918);
                    formalTypeOnly();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:192:41: formalInferred
                    {
                    pushFollow(FOLLOW_formalInferred_in_formal922);
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
    // antlr/Fan.g:193:1: formalFull : type id ;
    public final void formalFull() throws RecognitionException {
        int formalFull_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }
            // antlr/Fan.g:193:17: ( type id )
            // antlr/Fan.g:193:19: type id
            {
            pushFollow(FOLLOW_type_in_formalFull934);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_formalFull936);
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
    // antlr/Fan.g:194:1: formalTypeOnly : type ;
    public final void formalTypeOnly() throws RecognitionException {
        int formalTypeOnly_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }
            // antlr/Fan.g:194:17: ( type )
            // antlr/Fan.g:194:21: type
            {
            pushFollow(FOLLOW_type_in_formalTypeOnly946);
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
    // antlr/Fan.g:195:1: formalInferred : id ;
    public final void formalInferred() throws RecognitionException {
        int formalInferred_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }
            // antlr/Fan.g:195:17: ( id )
            // antlr/Fan.g:195:21: id
            {
            pushFollow(FOLLOW_id_in_formalInferred956);
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
    // antlr/Fan.g:196:1: slotDef : ( ( T_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* T_NEW )=> ctorDef | ( ( methodFlags )* ( type | T_VOID ) id PAR_L )=> methodDef | fieldDef ) ) ) ;
    public final void slotDef() throws RecognitionException {
        int slotDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }
            // antlr/Fan.g:196:10: ( ( ( T_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* T_NEW )=> ctorDef | ( ( methodFlags )* ( type | T_VOID ) id PAR_L )=> methodDef | fieldDef ) ) ) )
            // antlr/Fan.g:196:12: ( ( T_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* T_NEW )=> ctorDef | ( ( methodFlags )* ( type | T_VOID ) id PAR_L )=> methodDef | fieldDef ) ) )
            {
            // antlr/Fan.g:196:12: ( ( T_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* T_NEW )=> ctorDef | ( ( methodFlags )* ( type | T_VOID ) id PAR_L )=> methodDef | fieldDef ) ) )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // antlr/Fan.g:196:13: ( T_STATIC BRACKET_L )=> staticBlock
                    {
                    pushFollow(FOLLOW_staticBlock_in_slotDef972);
                    staticBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:197:5: ( docs ( facet )* ( ( ( ctorFlags )* T_NEW )=> ctorDef | ( ( methodFlags )* ( type | T_VOID ) id PAR_L )=> methodDef | fieldDef ) )
                    {
                    // antlr/Fan.g:197:5: ( docs ( facet )* ( ( ( ctorFlags )* T_NEW )=> ctorDef | ( ( methodFlags )* ( type | T_VOID ) id PAR_L )=> methodDef | fieldDef ) )
                    // antlr/Fan.g:197:6: docs ( facet )* ( ( ( ctorFlags )* T_NEW )=> ctorDef | ( ( methodFlags )* ( type | T_VOID ) id PAR_L )=> methodDef | fieldDef )
                    {
                    pushFollow(FOLLOW_docs_in_slotDef980);
                    docs();

                    state._fsp--;
                    if (state.failed) return ;
                    // antlr/Fan.g:197:11: ( facet )*
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
                    	    // antlr/Fan.g:0:0: facet
                    	    {
                    	    pushFollow(FOLLOW_facet_in_slotDef982);
                    	    facet();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    // antlr/Fan.g:198:6: ( ( ( ctorFlags )* T_NEW )=> ctorDef | ( ( methodFlags )* ( type | T_VOID ) id PAR_L )=> methodDef | fieldDef )
                    int alt43=3;
                    alt43 = dfa43.predict(input);
                    switch (alt43) {
                        case 1 :
                            // antlr/Fan.g:199:7: ( ( ctorFlags )* T_NEW )=> ctorDef
                            {
                            pushFollow(FOLLOW_ctorDef_in_slotDef1005);
                            ctorDef();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // antlr/Fan.g:200:7: ( ( methodFlags )* ( type | T_VOID ) id PAR_L )=> methodDef
                            {
                            pushFollow(FOLLOW_methodDef_in_slotDef1032);
                            methodDef();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // antlr/Fan.g:201:7: fieldDef
                            {
                            pushFollow(FOLLOW_fieldDef_in_slotDef1042);
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
    // antlr/Fan.g:205:1: fieldDef : docs ( facet )* fieldFlags typeId ( INIT_VAL expr )? ( ( BRACKET_L ( ( protection )? ( getter | setter ) ( SEMI )? ( block )? )+ BRACKET_R ) | eos ) ;
    public final void fieldDef() throws RecognitionException {
        int fieldDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }
            // antlr/Fan.g:205:10: ( docs ( facet )* fieldFlags typeId ( INIT_VAL expr )? ( ( BRACKET_L ( ( protection )? ( getter | setter ) ( SEMI )? ( block )? )+ BRACKET_R ) | eos ) )
            // antlr/Fan.g:205:12: docs ( facet )* fieldFlags typeId ( INIT_VAL expr )? ( ( BRACKET_L ( ( protection )? ( getter | setter ) ( SEMI )? ( block )? )+ BRACKET_R ) | eos )
            {
            pushFollow(FOLLOW_docs_in_fieldDef1067);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:205:17: ( facet )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==AT) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_fieldDef1069);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            pushFollow(FOLLOW_fieldFlags_in_fieldDef1072);
            fieldFlags();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_typeId_in_fieldDef1074);
            typeId();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:205:42: ( INIT_VAL expr )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==INIT_VAL) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // antlr/Fan.g:205:43: INIT_VAL expr
                    {
                    match(input,INIT_VAL,FOLLOW_INIT_VAL_in_fieldDef1077); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_fieldDef1079);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // antlr/Fan.g:206:5: ( ( BRACKET_L ( ( protection )? ( getter | setter ) ( SEMI )? ( block )? )+ BRACKET_R ) | eos )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==BRACKET_L) ) {
                alt52=1;
            }
            else if ( (LA52_0==EOF||(LA52_0>=T_RD_ONLY && LA52_0<=T_VOID)||(LA52_0>=T_ABSTRACT && LA52_0<=T_ONCE)||LA52_0==SQ_BRACKET_L||LA52_0==BRACKET_R||LA52_0==PIPE||LA52_0==SEMI||(LA52_0>=AT && LA52_0<=ID)||LA52_0==DOC) ) {
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
                    // antlr/Fan.g:207:5: ( BRACKET_L ( ( protection )? ( getter | setter ) ( SEMI )? ( block )? )+ BRACKET_R )
                    {
                    // antlr/Fan.g:207:5: ( BRACKET_L ( ( protection )? ( getter | setter ) ( SEMI )? ( block )? )+ BRACKET_R )
                    // antlr/Fan.g:207:6: BRACKET_L ( ( protection )? ( getter | setter ) ( SEMI )? ( block )? )+ BRACKET_R
                    {
                    match(input,BRACKET_L,FOLLOW_BRACKET_L_in_fieldDef1094); if (state.failed) return ;
                    // antlr/Fan.g:207:16: ( ( protection )? ( getter | setter ) ( SEMI )? ( block )? )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( ((LA51_0>=T_PRIVATE && LA51_0<=T_INTERNAL)||LA51_0==ID) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // antlr/Fan.g:207:17: ( protection )? ( getter | setter ) ( SEMI )? ( block )?
                    	    {
                    	    // antlr/Fan.g:207:17: ( protection )?
                    	    int alt47=2;
                    	    int LA47_0 = input.LA(1);

                    	    if ( ((LA47_0>=T_PRIVATE && LA47_0<=T_INTERNAL)) ) {
                    	        alt47=1;
                    	    }
                    	    switch (alt47) {
                    	        case 1 :
                    	            // antlr/Fan.g:0:0: protection
                    	            {
                    	            pushFollow(FOLLOW_protection_in_fieldDef1097);
                    	            protection();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }

                    	    // antlr/Fan.g:207:29: ( getter | setter )
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
                    	            // antlr/Fan.g:207:30: getter
                    	            {
                    	            pushFollow(FOLLOW_getter_in_fieldDef1101);
                    	            getter();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;
                    	        case 2 :
                    	            // antlr/Fan.g:207:39: setter
                    	            {
                    	            pushFollow(FOLLOW_setter_in_fieldDef1105);
                    	            setter();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }

                    	    // antlr/Fan.g:207:47: ( SEMI )?
                    	    int alt49=2;
                    	    int LA49_0 = input.LA(1);

                    	    if ( (LA49_0==SEMI) ) {
                    	        alt49=1;
                    	    }
                    	    switch (alt49) {
                    	        case 1 :
                    	            // antlr/Fan.g:0:0: SEMI
                    	            {
                    	            match(input,SEMI,FOLLOW_SEMI_in_fieldDef1108); if (state.failed) return ;

                    	            }
                    	            break;

                    	    }

                    	    // antlr/Fan.g:207:53: ( block )?
                    	    int alt50=2;
                    	    int LA50_0 = input.LA(1);

                    	    if ( ((LA50_0>=T_BREAK && LA50_0<=T_TRY)||(LA50_0>=T_THIS && LA50_0<=T_SUPER)||(LA50_0>=T_NULL && LA50_0<=T_IT)||LA50_0==SQ_BRACKET_L||LA50_0==BRACKET_L||LA50_0==PAR_L||LA50_0==PIPE||LA50_0==CURRY||LA50_0==AT||(LA50_0>=BOOL_VAL && LA50_0<=POUND)||(LA50_0>=MINUS && LA50_0<=NUMBER)||LA50_0==121||(LA50_0>=125 && LA50_0<=128)) ) {
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
                    	            // antlr/Fan.g:0:0: block
                    	            {
                    	            pushFollow(FOLLOW_block_in_fieldDef1111);
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

                    match(input,BRACKET_R,FOLLOW_BRACKET_R_in_fieldDef1116); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // antlr/Fan.g:208:7: eos
                    {
                    pushFollow(FOLLOW_eos_in_fieldDef1125);
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
    // antlr/Fan.g:210:1: typeId : ( ( type id )=> typeAndId | id ) ;
    public final void typeId() throws RecognitionException {
        int typeId_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }
            // antlr/Fan.g:210:9: ( ( ( type id )=> typeAndId | id ) )
            // antlr/Fan.g:210:11: ( ( type id )=> typeAndId | id )
            {
            // antlr/Fan.g:210:11: ( ( type id )=> typeAndId | id )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // antlr/Fan.g:210:12: ( type id )=> typeAndId
                    {
                    pushFollow(FOLLOW_typeAndId_in_typeId1142);
                    typeAndId();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:210:35: id
                    {
                    pushFollow(FOLLOW_id_in_typeId1146);
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
    // antlr/Fan.g:211:1: typeAndId : type id ;
    public final void typeAndId() throws RecognitionException {
        int typeAndId_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }
            // antlr/Fan.g:211:11: ( type id )
            // antlr/Fan.g:211:13: type id
            {
            pushFollow(FOLLOW_type_in_typeAndId1154);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_typeAndId1156);
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
    // antlr/Fan.g:212:1: fieldFlags : ( T_ABSTRACT | T_RD_ONLY | T_CONST | T_STATIC | T_NATIVE | T_VOLATILE | T_OVERRIDE | T_VIRTUAL | T_FINAL | protection )* ;
    public final void fieldFlags() throws RecognitionException {
        int fieldFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }
            // antlr/Fan.g:212:12: ( ( T_ABSTRACT | T_RD_ONLY | T_CONST | T_STATIC | T_NATIVE | T_VOLATILE | T_OVERRIDE | T_VIRTUAL | T_FINAL | protection )* )
            // antlr/Fan.g:212:14: ( T_ABSTRACT | T_RD_ONLY | T_CONST | T_STATIC | T_NATIVE | T_VOLATILE | T_OVERRIDE | T_VIRTUAL | T_FINAL | protection )*
            {
            // antlr/Fan.g:212:14: ( T_ABSTRACT | T_RD_ONLY | T_CONST | T_STATIC | T_NATIVE | T_VOLATILE | T_OVERRIDE | T_VIRTUAL | T_FINAL | protection )*
            loop54:
            do {
                int alt54=11;
                switch ( input.LA(1) ) {
                case T_ABSTRACT:
                    {
                    alt54=1;
                    }
                    break;
                case T_RD_ONLY:
                    {
                    alt54=2;
                    }
                    break;
                case T_CONST:
                    {
                    alt54=3;
                    }
                    break;
                case T_STATIC:
                    {
                    alt54=4;
                    }
                    break;
                case T_NATIVE:
                    {
                    alt54=5;
                    }
                    break;
                case T_VOLATILE:
                    {
                    alt54=6;
                    }
                    break;
                case T_OVERRIDE:
                    {
                    alt54=7;
                    }
                    break;
                case T_VIRTUAL:
                    {
                    alt54=8;
                    }
                    break;
                case T_FINAL:
                    {
                    alt54=9;
                    }
                    break;
                case T_PRIVATE:
                case T_PROTECTED:
                case T_PUBLIC:
                case T_INTERNAL:
                    {
                    alt54=10;
                    }
                    break;

                }

                switch (alt54) {
            	case 1 :
            	    // antlr/Fan.g:212:15: T_ABSTRACT
            	    {
            	    match(input,T_ABSTRACT,FOLLOW_T_ABSTRACT_in_fieldFlags1164); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // antlr/Fan.g:212:28: T_RD_ONLY
            	    {
            	    match(input,T_RD_ONLY,FOLLOW_T_RD_ONLY_in_fieldFlags1168); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // antlr/Fan.g:212:40: T_CONST
            	    {
            	    match(input,T_CONST,FOLLOW_T_CONST_in_fieldFlags1172); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // antlr/Fan.g:212:50: T_STATIC
            	    {
            	    match(input,T_STATIC,FOLLOW_T_STATIC_in_fieldFlags1176); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // antlr/Fan.g:212:61: T_NATIVE
            	    {
            	    match(input,T_NATIVE,FOLLOW_T_NATIVE_in_fieldFlags1180); if (state.failed) return ;

            	    }
            	    break;
            	case 6 :
            	    // antlr/Fan.g:212:72: T_VOLATILE
            	    {
            	    match(input,T_VOLATILE,FOLLOW_T_VOLATILE_in_fieldFlags1184); if (state.failed) return ;

            	    }
            	    break;
            	case 7 :
            	    // antlr/Fan.g:212:85: T_OVERRIDE
            	    {
            	    match(input,T_OVERRIDE,FOLLOW_T_OVERRIDE_in_fieldFlags1188); if (state.failed) return ;

            	    }
            	    break;
            	case 8 :
            	    // antlr/Fan.g:212:98: T_VIRTUAL
            	    {
            	    match(input,T_VIRTUAL,FOLLOW_T_VIRTUAL_in_fieldFlags1192); if (state.failed) return ;

            	    }
            	    break;
            	case 9 :
            	    // antlr/Fan.g:212:110: T_FINAL
            	    {
            	    match(input,T_FINAL,FOLLOW_T_FINAL_in_fieldFlags1196); if (state.failed) return ;

            	    }
            	    break;
            	case 10 :
            	    // antlr/Fan.g:212:120: protection
            	    {
            	    pushFollow(FOLLOW_protection_in_fieldFlags1200);
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
    // antlr/Fan.g:213:1: methodDef : docs ( facet )* ( methodFlags )* ( type | T_VOID ) id PAR_L params PAR_R methodBody ;
    public final void methodDef() throws RecognitionException {
        int methodDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }
            // antlr/Fan.g:213:11: ( docs ( facet )* ( methodFlags )* ( type | T_VOID ) id PAR_L params PAR_R methodBody )
            // antlr/Fan.g:213:13: docs ( facet )* ( methodFlags )* ( type | T_VOID ) id PAR_L params PAR_R methodBody
            {
            pushFollow(FOLLOW_docs_in_methodDef1209);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:213:18: ( facet )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==AT) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_methodDef1211);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // antlr/Fan.g:213:25: ( methodFlags )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=T_STATIC && LA56_0<=T_NATIVE)||(LA56_0>=T_OVERRIDE && LA56_0<=T_FINAL)||(LA56_0>=T_ABSTRACT && LA56_0<=T_INTERNAL)||LA56_0==T_ONCE) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // antlr/Fan.g:0:0: methodFlags
            	    {
            	    pushFollow(FOLLOW_methodFlags_in_methodDef1214);
            	    methodFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // antlr/Fan.g:213:38: ( type | T_VOID )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==SQ_BRACKET_L||LA57_0==PIPE||LA57_0==ID) ) {
                alt57=1;
            }
            else if ( (LA57_0==T_VOID) ) {
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
                    // antlr/Fan.g:213:39: type
                    {
                    pushFollow(FOLLOW_type_in_methodDef1218);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:213:46: T_VOID
                    {
                    match(input,T_VOID,FOLLOW_T_VOID_in_methodDef1222); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_methodDef1225);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_methodDef1227); if (state.failed) return ;
            pushFollow(FOLLOW_params_in_methodDef1229);
            params();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_methodDef1231); if (state.failed) return ;
            pushFollow(FOLLOW_methodBody_in_methodDef1233);
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
    // antlr/Fan.g:214:1: methodFlags : ( protection | T_VIRTUAL | T_OVERRIDE | T_ABSTRACT | T_STATIC | T_ONCE | T_NATIVE | T_FINAL );
    public final void methodFlags() throws RecognitionException {
        int methodFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }
            // antlr/Fan.g:214:13: ( protection | T_VIRTUAL | T_OVERRIDE | T_ABSTRACT | T_STATIC | T_ONCE | T_NATIVE | T_FINAL )
            int alt58=8;
            switch ( input.LA(1) ) {
            case T_PRIVATE:
            case T_PROTECTED:
            case T_PUBLIC:
            case T_INTERNAL:
                {
                alt58=1;
                }
                break;
            case T_VIRTUAL:
                {
                alt58=2;
                }
                break;
            case T_OVERRIDE:
                {
                alt58=3;
                }
                break;
            case T_ABSTRACT:
                {
                alt58=4;
                }
                break;
            case T_STATIC:
                {
                alt58=5;
                }
                break;
            case T_ONCE:
                {
                alt58=6;
                }
                break;
            case T_NATIVE:
                {
                alt58=7;
                }
                break;
            case T_FINAL:
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
                    // antlr/Fan.g:214:15: protection
                    {
                    pushFollow(FOLLOW_protection_in_methodFlags1240);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:214:28: T_VIRTUAL
                    {
                    match(input,T_VIRTUAL,FOLLOW_T_VIRTUAL_in_methodFlags1244); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:214:40: T_OVERRIDE
                    {
                    match(input,T_OVERRIDE,FOLLOW_T_OVERRIDE_in_methodFlags1248); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // antlr/Fan.g:214:53: T_ABSTRACT
                    {
                    match(input,T_ABSTRACT,FOLLOW_T_ABSTRACT_in_methodFlags1252); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // antlr/Fan.g:214:66: T_STATIC
                    {
                    match(input,T_STATIC,FOLLOW_T_STATIC_in_methodFlags1256); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // antlr/Fan.g:214:77: T_ONCE
                    {
                    match(input,T_ONCE,FOLLOW_T_ONCE_in_methodFlags1260); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // antlr/Fan.g:215:5: T_NATIVE
                    {
                    match(input,T_NATIVE,FOLLOW_T_NATIVE_in_methodFlags1268); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // antlr/Fan.g:215:16: T_FINAL
                    {
                    match(input,T_FINAL,FOLLOW_T_FINAL_in_methodFlags1272); if (state.failed) return ;

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
    // antlr/Fan.g:216:1: params : ( param ( COMMA param )* )? ;
    public final void params() throws RecognitionException {
        int params_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }
            // antlr/Fan.g:216:9: ( ( param ( COMMA param )* )? )
            // antlr/Fan.g:216:11: ( param ( COMMA param )* )?
            {
            // antlr/Fan.g:216:11: ( param ( COMMA param )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==SQ_BRACKET_L||LA60_0==PIPE||LA60_0==ID) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // antlr/Fan.g:216:12: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_params1281);
                    param();

                    state._fsp--;
                    if (state.failed) return ;
                    // antlr/Fan.g:216:18: ( COMMA param )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==COMMA) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // antlr/Fan.g:216:19: COMMA param
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_params1284); if (state.failed) return ;
                    	    pushFollow(FOLLOW_param_in_params1286);
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
    // antlr/Fan.g:217:1: param : type id ( INIT_VAL expr )? ;
    public final void param() throws RecognitionException {
        int param_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }
            // antlr/Fan.g:217:9: ( type id ( INIT_VAL expr )? )
            // antlr/Fan.g:217:11: type id ( INIT_VAL expr )?
            {
            pushFollow(FOLLOW_type_in_param1299);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_param1301);
            id();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:217:19: ( INIT_VAL expr )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==INIT_VAL) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // antlr/Fan.g:217:20: INIT_VAL expr
                    {
                    match(input,INIT_VAL,FOLLOW_INIT_VAL_in_param1304); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_param1306);
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
    // antlr/Fan.g:218:1: methodBody : ( ( BRACKET_L ( stmt )* BRACKET_R ) | eos );
    public final void methodBody() throws RecognitionException {
        int methodBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }
            // antlr/Fan.g:218:12: ( ( BRACKET_L ( stmt )* BRACKET_R ) | eos )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==BRACKET_L) ) {
                alt63=1;
            }
            else if ( (LA63_0==EOF||(LA63_0>=T_RD_ONLY && LA63_0<=T_VOID)||(LA63_0>=T_ABSTRACT && LA63_0<=T_ONCE)||LA63_0==SQ_BRACKET_L||LA63_0==BRACKET_R||LA63_0==PIPE||LA63_0==SEMI||(LA63_0>=AT && LA63_0<=ID)||LA63_0==DOC) ) {
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
                    // antlr/Fan.g:218:14: ( BRACKET_L ( stmt )* BRACKET_R )
                    {
                    // antlr/Fan.g:218:14: ( BRACKET_L ( stmt )* BRACKET_R )
                    // antlr/Fan.g:218:15: BRACKET_L ( stmt )* BRACKET_R
                    {
                    match(input,BRACKET_L,FOLLOW_BRACKET_L_in_methodBody1316); if (state.failed) return ;
                    // antlr/Fan.g:218:25: ( stmt )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( ((LA62_0>=T_BREAK && LA62_0<=T_TRY)||(LA62_0>=T_THIS && LA62_0<=T_SUPER)||(LA62_0>=T_NULL && LA62_0<=T_IT)||LA62_0==SQ_BRACKET_L||LA62_0==PAR_L||LA62_0==PIPE||LA62_0==CURRY||(LA62_0>=AT && LA62_0<=POUND)||(LA62_0>=MINUS && LA62_0<=NUMBER)||LA62_0==121||(LA62_0>=125 && LA62_0<=128)) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_methodBody1318);
                    	    stmt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    match(input,BRACKET_R,FOLLOW_BRACKET_R_in_methodBody1321); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // antlr/Fan.g:218:44: eos
                    {
                    pushFollow(FOLLOW_eos_in_methodBody1326);
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
    // antlr/Fan.g:219:1: ctorDef : docs ( facet )* ( ctorFlags )* T_NEW id PAR_L params PAR_R ( ( COLON )=> ctorChain )? methodBody ;
    public final void ctorDef() throws RecognitionException {
        int ctorDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }
            // antlr/Fan.g:219:10: ( docs ( facet )* ( ctorFlags )* T_NEW id PAR_L params PAR_R ( ( COLON )=> ctorChain )? methodBody )
            // antlr/Fan.g:219:12: docs ( facet )* ( ctorFlags )* T_NEW id PAR_L params PAR_R ( ( COLON )=> ctorChain )? methodBody
            {
            pushFollow(FOLLOW_docs_in_ctorDef1334);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:219:17: ( facet )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==AT) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_ctorDef1336);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // antlr/Fan.g:219:24: ( ctorFlags )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=T_PRIVATE && LA65_0<=T_INTERNAL)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // antlr/Fan.g:0:0: ctorFlags
            	    {
            	    pushFollow(FOLLOW_ctorFlags_in_ctorDef1339);
            	    ctorFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            match(input,T_NEW,FOLLOW_T_NEW_in_ctorDef1342); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_ctorDef1344);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_ctorDef1346); if (state.failed) return ;
            pushFollow(FOLLOW_params_in_ctorDef1348);
            params();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_ctorDef1350); if (state.failed) return ;
            // antlr/Fan.g:219:63: ( ( COLON )=> ctorChain )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==COLON) && (synpred100_Fan())) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // antlr/Fan.g:219:64: ( COLON )=> ctorChain
                    {
                    pushFollow(FOLLOW_ctorChain_in_ctorDef1357);
                    ctorChain();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_ctorDef1361);
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
    // antlr/Fan.g:220:1: ctorFlags : protection ;
    public final void ctorFlags() throws RecognitionException {
        int ctorFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }
            // antlr/Fan.g:220:11: ( protection )
            // antlr/Fan.g:220:13: protection
            {
            pushFollow(FOLLOW_protection_in_ctorFlags1368);
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
    // antlr/Fan.g:221:1: ctorChain : COLON ( ctorChainThis | ctorChainSuper ) ;
    public final void ctorChain() throws RecognitionException {
        int ctorChain_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }
            // antlr/Fan.g:221:11: ( COLON ( ctorChainThis | ctorChainSuper ) )
            // antlr/Fan.g:221:13: COLON ( ctorChainThis | ctorChainSuper )
            {
            match(input,COLON,FOLLOW_COLON_in_ctorChain1375); if (state.failed) return ;
            // antlr/Fan.g:221:19: ( ctorChainThis | ctorChainSuper )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==T_THIS) ) {
                alt67=1;
            }
            else if ( (LA67_0==T_SUPER) ) {
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
                    // antlr/Fan.g:221:20: ctorChainThis
                    {
                    pushFollow(FOLLOW_ctorChainThis_in_ctorChain1378);
                    ctorChainThis();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:221:36: ctorChainSuper
                    {
                    pushFollow(FOLLOW_ctorChainSuper_in_ctorChain1382);
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
    // antlr/Fan.g:223:1: ctorChainThis : T_THIS DOT id PAR_L ( args )? PAR_R ;
    public final void ctorChainThis() throws RecognitionException {
        int ctorChainThis_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }
            // antlr/Fan.g:223:15: ( T_THIS DOT id PAR_L ( args )? PAR_R )
            // antlr/Fan.g:223:17: T_THIS DOT id PAR_L ( args )? PAR_R
            {
            match(input,T_THIS,FOLLOW_T_THIS_in_ctorChainThis1391); if (state.failed) return ;
            match(input,DOT,FOLLOW_DOT_in_ctorChainThis1393); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_ctorChainThis1395);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_ctorChainThis1397); if (state.failed) return ;
            // antlr/Fan.g:223:37: ( args )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=T_THIS && LA68_0<=T_SUPER)||(LA68_0>=T_NULL && LA68_0<=T_IT)||LA68_0==SQ_BRACKET_L||LA68_0==PAR_L||LA68_0==PIPE||LA68_0==CURRY||(LA68_0>=AT && LA68_0<=POUND)||(LA68_0>=MINUS && LA68_0<=NUMBER)||LA68_0==121||(LA68_0>=125 && LA68_0<=128)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainThis1399);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_ctorChainThis1402); if (state.failed) return ;

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
    // antlr/Fan.g:224:1: ctorChainSuper : T_SUPER ( DOT id )? PAR_L ( args )? PAR_R ;
    public final void ctorChainSuper() throws RecognitionException {
        int ctorChainSuper_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }
            // antlr/Fan.g:224:16: ( T_SUPER ( DOT id )? PAR_L ( args )? PAR_R )
            // antlr/Fan.g:224:18: T_SUPER ( DOT id )? PAR_L ( args )? PAR_R
            {
            match(input,T_SUPER,FOLLOW_T_SUPER_in_ctorChainSuper1409); if (state.failed) return ;
            // antlr/Fan.g:224:26: ( DOT id )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==DOT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // antlr/Fan.g:224:27: DOT id
                    {
                    match(input,DOT,FOLLOW_DOT_in_ctorChainSuper1412); if (state.failed) return ;
                    pushFollow(FOLLOW_id_in_ctorChainSuper1414);
                    id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_L,FOLLOW_PAR_L_in_ctorChainSuper1418); if (state.failed) return ;
            // antlr/Fan.g:224:42: ( args )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=T_THIS && LA70_0<=T_SUPER)||(LA70_0>=T_NULL && LA70_0<=T_IT)||LA70_0==SQ_BRACKET_L||LA70_0==PAR_L||LA70_0==PIPE||LA70_0==CURRY||(LA70_0>=AT && LA70_0<=POUND)||(LA70_0>=MINUS && LA70_0<=NUMBER)||LA70_0==121||(LA70_0>=125 && LA70_0<=128)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainSuper1420);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_ctorChainSuper1423); if (state.failed) return ;

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
    // antlr/Fan.g:226:1: staticBlock : T_STATIC block ;
    public final void staticBlock() throws RecognitionException {
        int staticBlock_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }
            // antlr/Fan.g:226:13: ( T_STATIC block )
            // antlr/Fan.g:226:15: T_STATIC block
            {
            match(input,T_STATIC,FOLLOW_T_STATIC_in_staticBlock1431); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_staticBlock1433);
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
    // antlr/Fan.g:227:1: block : ( ( BRACKET_L )=> multiStmt | stmt ) ;
    public final void block() throws RecognitionException {
        int block_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }
            // antlr/Fan.g:227:9: ( ( ( BRACKET_L )=> multiStmt | stmt ) )
            // antlr/Fan.g:227:11: ( ( BRACKET_L )=> multiStmt | stmt )
            {
            // antlr/Fan.g:227:11: ( ( BRACKET_L )=> multiStmt | stmt )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==BRACKET_L) && (synpred105_Fan())) {
                alt71=1;
            }
            else if ( ((LA71_0>=T_BREAK && LA71_0<=T_TRY)||(LA71_0>=T_THIS && LA71_0<=T_SUPER)||(LA71_0>=T_NULL && LA71_0<=T_IT)||LA71_0==SQ_BRACKET_L||LA71_0==PAR_L||LA71_0==PIPE||LA71_0==CURRY||(LA71_0>=AT && LA71_0<=POUND)||(LA71_0>=MINUS && LA71_0<=NUMBER)||LA71_0==121||(LA71_0>=125 && LA71_0<=128)) ) {
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
                    // antlr/Fan.g:227:12: ( BRACKET_L )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_block1447);
                    multiStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:227:37: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_block1451);
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
    // antlr/Fan.g:228:1: multiStmt : BRACKET_L ( stmt )* BRACKET_R ;
    public final void multiStmt() throws RecognitionException {
        int multiStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }
            // antlr/Fan.g:228:11: ( BRACKET_L ( stmt )* BRACKET_R )
            // antlr/Fan.g:228:13: BRACKET_L ( stmt )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_multiStmt1459); if (state.failed) return ;
            // antlr/Fan.g:228:24: ( stmt )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=T_BREAK && LA72_0<=T_TRY)||(LA72_0>=T_THIS && LA72_0<=T_SUPER)||(LA72_0>=T_NULL && LA72_0<=T_IT)||LA72_0==SQ_BRACKET_L||LA72_0==PAR_L||LA72_0==PIPE||LA72_0==CURRY||(LA72_0>=AT && LA72_0<=POUND)||(LA72_0>=MINUS && LA72_0<=NUMBER)||LA72_0==121||(LA72_0>=125 && LA72_0<=128)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_multiStmt1462);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_multiStmt1465); if (state.failed) return ;

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
    // antlr/Fan.g:229:1: stmt : ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) ;
    public final void stmt() throws RecognitionException {
        int stmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }
            // antlr/Fan.g:229:8: ( ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) )
            // antlr/Fan.g:229:10: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            {
            // antlr/Fan.g:229:10: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            int alt73=11;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // antlr/Fan.g:229:11: g_if
                    {
                    pushFollow(FOLLOW_g_if_in_stmt1475);
                    g_if();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:229:18: g_for
                    {
                    pushFollow(FOLLOW_g_for_in_stmt1479);
                    g_for();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:229:26: g_while
                    {
                    pushFollow(FOLLOW_g_while_in_stmt1483);
                    g_while();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // antlr/Fan.g:229:36: g_break
                    {
                    pushFollow(FOLLOW_g_break_in_stmt1487);
                    g_break();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // antlr/Fan.g:230:4: g_continue
                    {
                    pushFollow(FOLLOW_g_continue_in_stmt1494);
                    g_continue();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // antlr/Fan.g:230:17: g_return
                    {
                    pushFollow(FOLLOW_g_return_in_stmt1498);
                    g_return();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // antlr/Fan.g:230:28: g_switch
                    {
                    pushFollow(FOLLOW_g_switch_in_stmt1502);
                    g_switch();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // antlr/Fan.g:231:4: g_throw
                    {
                    pushFollow(FOLLOW_g_throw_in_stmt1509);
                    g_throw();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // antlr/Fan.g:231:14: g_try
                    {
                    pushFollow(FOLLOW_g_try_in_stmt1513);
                    g_try();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // antlr/Fan.g:231:22: exprStmt
                    {
                    pushFollow(FOLLOW_exprStmt_in_stmt1517);
                    exprStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // antlr/Fan.g:231:33: localDef
                    {
                    pushFollow(FOLLOW_localDef_in_stmt1521);
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
    // antlr/Fan.g:238:1: g_break : T_BREAK eos ;
    public final void g_break() throws RecognitionException {
        int g_break_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }
            // antlr/Fan.g:238:10: ( T_BREAK eos )
            // antlr/Fan.g:238:12: T_BREAK eos
            {
            match(input,T_BREAK,FOLLOW_T_BREAK_in_g_break1534); if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_g_break1536);
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
    // antlr/Fan.g:239:1: g_continue : T_CONTINUE eos ;
    public final void g_continue() throws RecognitionException {
        int g_continue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }
            // antlr/Fan.g:239:12: ( T_CONTINUE eos )
            // antlr/Fan.g:239:14: T_CONTINUE eos
            {
            match(input,T_CONTINUE,FOLLOW_T_CONTINUE_in_g_continue1543); if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_g_continue1545);
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
    // antlr/Fan.g:240:1: g_for : T_FOR PAR_L ( forInit )? SEMI ( expr )? SEMI ( expr )? PAR_R block ;
    public final void g_for() throws RecognitionException {
        int g_for_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }
            // antlr/Fan.g:240:8: ( T_FOR PAR_L ( forInit )? SEMI ( expr )? SEMI ( expr )? PAR_R block )
            // antlr/Fan.g:240:10: T_FOR PAR_L ( forInit )? SEMI ( expr )? SEMI ( expr )? PAR_R block
            {
            match(input,T_FOR,FOLLOW_T_FOR_in_g_for1553); if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_g_for1555); if (state.failed) return ;
            // antlr/Fan.g:240:22: ( forInit )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=T_THIS && LA74_0<=T_SUPER)||(LA74_0>=T_NULL && LA74_0<=T_IT)||LA74_0==SQ_BRACKET_L||LA74_0==PAR_L||LA74_0==PIPE||LA74_0==CURRY||(LA74_0>=AT && LA74_0<=POUND)||(LA74_0>=MINUS && LA74_0<=NUMBER)||LA74_0==121||(LA74_0>=125 && LA74_0<=128)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // antlr/Fan.g:0:0: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_g_for1557);
                    forInit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,SEMI,FOLLOW_SEMI_in_g_for1560); if (state.failed) return ;
            // antlr/Fan.g:240:36: ( expr )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=T_THIS && LA75_0<=T_SUPER)||(LA75_0>=T_NULL && LA75_0<=T_IT)||LA75_0==SQ_BRACKET_L||LA75_0==PAR_L||LA75_0==PIPE||LA75_0==CURRY||(LA75_0>=AT && LA75_0<=POUND)||(LA75_0>=MINUS && LA75_0<=NUMBER)||LA75_0==121||(LA75_0>=125 && LA75_0<=128)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for1562);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,SEMI,FOLLOW_SEMI_in_g_for1565); if (state.failed) return ;
            // antlr/Fan.g:240:47: ( expr )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=T_THIS && LA76_0<=T_SUPER)||(LA76_0>=T_NULL && LA76_0<=T_IT)||LA76_0==SQ_BRACKET_L||LA76_0==PAR_L||LA76_0==PIPE||LA76_0==CURRY||(LA76_0>=AT && LA76_0<=POUND)||(LA76_0>=MINUS && LA76_0<=NUMBER)||LA76_0==121||(LA76_0>=125 && LA76_0<=128)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for1567);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_g_for1570); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_g_for1573);
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
    // antlr/Fan.g:241:1: g_if : T_IF PAR_L expr PAR_R block ( T_ELSE block )? ;
    public final void g_if() throws RecognitionException {
        int g_if_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }
            // antlr/Fan.g:241:7: ( T_IF PAR_L expr PAR_R block ( T_ELSE block )? )
            // antlr/Fan.g:241:9: T_IF PAR_L expr PAR_R block ( T_ELSE block )?
            {
            match(input,T_IF,FOLLOW_T_IF_in_g_if1581); if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_g_if1583); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_if1585);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_g_if1587); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_g_if1589);
            block();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:242:5: ( T_ELSE block )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==T_ELSE) ) {
                int LA77_1 = input.LA(2);

                if ( (synpred120_Fan()) ) {
                    alt77=1;
                }
            }
            switch (alt77) {
                case 1 :
                    // antlr/Fan.g:242:6: T_ELSE block
                    {
                    match(input,T_ELSE,FOLLOW_T_ELSE_in_g_if1596); if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_g_if1598);
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
    // antlr/Fan.g:243:1: g_return : T_RETURN ( eos | expr eos ) ;
    public final void g_return() throws RecognitionException {
        int g_return_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }
            // antlr/Fan.g:243:10: ( T_RETURN ( eos | expr eos ) )
            // antlr/Fan.g:243:12: T_RETURN ( eos | expr eos )
            {
            match(input,T_RETURN,FOLLOW_T_RETURN_in_g_return1607); if (state.failed) return ;
            // antlr/Fan.g:243:21: ( eos | expr eos )
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // antlr/Fan.g:243:22: eos
                    {
                    pushFollow(FOLLOW_eos_in_g_return1610);
                    eos();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:243:28: expr eos
                    {
                    pushFollow(FOLLOW_expr_in_g_return1614);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_eos_in_g_return1616);
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
    // antlr/Fan.g:244:1: g_switch : T_SWITCH PAR_L expr PAR_R BRACKET_L ( g_case )* ( g_default )? BRACKET_R ;
    public final void g_switch() throws RecognitionException {
        int g_switch_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }
            // antlr/Fan.g:244:10: ( T_SWITCH PAR_L expr PAR_R BRACKET_L ( g_case )* ( g_default )? BRACKET_R )
            // antlr/Fan.g:244:12: T_SWITCH PAR_L expr PAR_R BRACKET_L ( g_case )* ( g_default )? BRACKET_R
            {
            match(input,T_SWITCH,FOLLOW_T_SWITCH_in_g_switch1624); if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_g_switch1626); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_switch1628);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_g_switch1630); if (state.failed) return ;
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_g_switch1632); if (state.failed) return ;
            // antlr/Fan.g:244:48: ( g_case )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==T_CASE) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // antlr/Fan.g:244:49: g_case
            	    {
            	    pushFollow(FOLLOW_g_case_in_g_switch1635);
            	    g_case();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // antlr/Fan.g:244:58: ( g_default )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==T_DEFAULT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // antlr/Fan.g:244:59: g_default
                    {
                    pushFollow(FOLLOW_g_default_in_g_switch1640);
                    g_default();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_g_switch1644); if (state.failed) return ;

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
    // antlr/Fan.g:245:1: g_throw : T_THROW expr eos ;
    public final void g_throw() throws RecognitionException {
        int g_throw_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }
            // antlr/Fan.g:245:10: ( T_THROW expr eos )
            // antlr/Fan.g:245:12: T_THROW expr eos
            {
            match(input,T_THROW,FOLLOW_T_THROW_in_g_throw1652); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_throw1654);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_g_throw1656);
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
    // antlr/Fan.g:246:1: g_while : T_WHILE PAR_L expr PAR_R block ;
    public final void g_while() throws RecognitionException {
        int g_while_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }
            // antlr/Fan.g:246:10: ( T_WHILE PAR_L expr PAR_R block )
            // antlr/Fan.g:246:12: T_WHILE PAR_L expr PAR_R block
            {
            match(input,T_WHILE,FOLLOW_T_WHILE_in_g_while1664); if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_g_while1666); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_while1668);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_g_while1670); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_g_while1672);
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
    // antlr/Fan.g:247:1: g_try : T_TRY ( ( BRACKET_L )=> try_long | ( stmt )* ) ( ( T_CATCH )=> g_catch )* ( ( T_FINALLY )=> g_finally )? ;
    public final void g_try() throws RecognitionException {
        int g_try_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }
            // antlr/Fan.g:247:8: ( T_TRY ( ( BRACKET_L )=> try_long | ( stmt )* ) ( ( T_CATCH )=> g_catch )* ( ( T_FINALLY )=> g_finally )? )
            // antlr/Fan.g:247:10: T_TRY ( ( BRACKET_L )=> try_long | ( stmt )* ) ( ( T_CATCH )=> g_catch )* ( ( T_FINALLY )=> g_finally )?
            {
            match(input,T_TRY,FOLLOW_T_TRY_in_g_try1680); if (state.failed) return ;
            // antlr/Fan.g:247:16: ( ( BRACKET_L )=> try_long | ( stmt )* )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==BRACKET_L) && (synpred124_Fan())) {
                alt82=1;
            }
            else if ( (LA82_0==EOF||(LA82_0>=T_BREAK && LA82_0<=T_FINALLY)||(LA82_0>=T_RD_ONLY && LA82_0<=T_VOID)||(LA82_0>=T_ABSTRACT && LA82_0<=T_ELSE)||(LA82_0>=T_NULL && LA82_0<=T_IT)||LA82_0==SQ_BRACKET_L||LA82_0==BRACKET_R||(LA82_0>=COMMA && LA82_0<=PAR_L)||LA82_0==PIPE||LA82_0==SEMI||LA82_0==CURRY||(LA82_0>=AT && LA82_0<=NUMBER)||LA82_0==121||(LA82_0>=125 && LA82_0<=128)) ) {
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
                    // antlr/Fan.g:247:17: ( BRACKET_L )=> try_long
                    {
                    pushFollow(FOLLOW_try_long_in_g_try1687);
                    try_long();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:247:41: ( stmt )*
                    {
                    // antlr/Fan.g:247:41: ( stmt )*
                    loop81:
                    do {
                        int alt81=2;
                        alt81 = dfa81.predict(input);
                        switch (alt81) {
                    	case 1 :
                    	    // antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_try1691);
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

            // antlr/Fan.g:247:48: ( ( T_CATCH )=> g_catch )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==T_CATCH) ) {
                    int LA83_2 = input.LA(2);

                    if ( (synpred126_Fan()) ) {
                        alt83=1;
                    }


                }


                switch (alt83) {
            	case 1 :
            	    // antlr/Fan.g:247:49: ( T_CATCH )=> g_catch
            	    {
            	    pushFollow(FOLLOW_g_catch_in_g_try1700);
            	    g_catch();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            // antlr/Fan.g:247:70: ( ( T_FINALLY )=> g_finally )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==T_FINALLY) ) {
                int LA84_1 = input.LA(2);

                if ( (synpred127_Fan()) ) {
                    alt84=1;
                }
            }
            switch (alt84) {
                case 1 :
                    // antlr/Fan.g:247:71: ( T_FINALLY )=> g_finally
                    {
                    pushFollow(FOLLOW_g_finally_in_g_try1709);
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
    // antlr/Fan.g:248:1: try_long : BRACKET_L ( stmt )* BRACKET_R ;
    public final void try_long() throws RecognitionException {
        int try_long_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }
            // antlr/Fan.g:248:10: ( BRACKET_L ( stmt )* BRACKET_R )
            // antlr/Fan.g:248:12: BRACKET_L ( stmt )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_try_long1718); if (state.failed) return ;
            // antlr/Fan.g:248:22: ( stmt )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( ((LA85_0>=T_BREAK && LA85_0<=T_TRY)||(LA85_0>=T_THIS && LA85_0<=T_SUPER)||(LA85_0>=T_NULL && LA85_0<=T_IT)||LA85_0==SQ_BRACKET_L||LA85_0==PAR_L||LA85_0==PIPE||LA85_0==CURRY||(LA85_0>=AT && LA85_0<=POUND)||(LA85_0>=MINUS && LA85_0<=NUMBER)||LA85_0==121||(LA85_0>=125 && LA85_0<=128)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_try_long1720);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_try_long1723); if (state.failed) return ;

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
    // antlr/Fan.g:249:1: exprStmt : expr eos ;
    public final void exprStmt() throws RecognitionException {
        int exprStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }
            // antlr/Fan.g:249:10: ( expr eos )
            // antlr/Fan.g:249:12: expr eos
            {
            pushFollow(FOLLOW_expr_in_exprStmt1730);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_exprStmt1732);
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
    // antlr/Fan.g:250:1: localDef : typeId ( INIT_VAL expr )? eos ;
    public final void localDef() throws RecognitionException {
        int localDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }
            // antlr/Fan.g:250:10: ( typeId ( INIT_VAL expr )? eos )
            // antlr/Fan.g:250:12: typeId ( INIT_VAL expr )? eos
            {
            pushFollow(FOLLOW_typeId_in_localDef1739);
            typeId();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:250:19: ( INIT_VAL expr )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==INIT_VAL) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // antlr/Fan.g:250:20: INIT_VAL expr
                    {
                    match(input,INIT_VAL,FOLLOW_INIT_VAL_in_localDef1742); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_localDef1744);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_eos_in_localDef1748);
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
    // antlr/Fan.g:251:1: forInit : ( forInitDef | expr );
    public final void forInit() throws RecognitionException {
        int forInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }
            // antlr/Fan.g:251:10: ( forInitDef | expr )
            int alt87=2;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // antlr/Fan.g:251:12: forInitDef
                    {
                    pushFollow(FOLLOW_forInitDef_in_forInit1756);
                    forInitDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:251:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_forInit1760);
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
    // antlr/Fan.g:252:1: forInitDef : typeId ( INIT_VAL expr )? ;
    public final void forInitDef() throws RecognitionException {
        int forInitDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }
            // antlr/Fan.g:252:12: ( typeId ( INIT_VAL expr )? )
            // antlr/Fan.g:252:14: typeId ( INIT_VAL expr )?
            {
            pushFollow(FOLLOW_typeId_in_forInitDef1767);
            typeId();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:252:21: ( INIT_VAL expr )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==INIT_VAL) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // antlr/Fan.g:252:22: INIT_VAL expr
                    {
                    match(input,INIT_VAL,FOLLOW_INIT_VAL_in_forInitDef1770); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_forInitDef1772);
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
    // antlr/Fan.g:254:1: g_catch : T_CATCH ( catchDef )? ( ( BRACKET_L )=> catch_long | ( stmt )* ) ;
    public final void g_catch() throws RecognitionException {
        int g_catch_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return ; }
            // antlr/Fan.g:254:10: ( T_CATCH ( catchDef )? ( ( BRACKET_L )=> catch_long | ( stmt )* ) )
            // antlr/Fan.g:254:12: T_CATCH ( catchDef )? ( ( BRACKET_L )=> catch_long | ( stmt )* )
            {
            match(input,T_CATCH,FOLLOW_T_CATCH_in_g_catch1783); if (state.failed) return ;
            // antlr/Fan.g:254:20: ( catchDef )?
            int alt89=2;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // antlr/Fan.g:0:0: catchDef
                    {
                    pushFollow(FOLLOW_catchDef_in_g_catch1785);
                    catchDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // antlr/Fan.g:254:30: ( ( BRACKET_L )=> catch_long | ( stmt )* )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==BRACKET_L) && (synpred133_Fan())) {
                alt91=1;
            }
            else if ( (LA91_0==EOF||(LA91_0>=T_BREAK && LA91_0<=T_FINALLY)||(LA91_0>=T_RD_ONLY && LA91_0<=T_VOID)||(LA91_0>=T_ABSTRACT && LA91_0<=T_ELSE)||(LA91_0>=T_NULL && LA91_0<=T_IT)||LA91_0==SQ_BRACKET_L||LA91_0==BRACKET_R||(LA91_0>=COMMA && LA91_0<=PAR_L)||LA91_0==PIPE||LA91_0==SEMI||LA91_0==CURRY||(LA91_0>=AT && LA91_0<=NUMBER)||LA91_0==121||(LA91_0>=125 && LA91_0<=128)) ) {
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
                    // antlr/Fan.g:254:31: ( BRACKET_L )=> catch_long
                    {
                    pushFollow(FOLLOW_catch_long_in_g_catch1793);
                    catch_long();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:254:57: ( stmt )*
                    {
                    // antlr/Fan.g:254:57: ( stmt )*
                    loop90:
                    do {
                        int alt90=2;
                        alt90 = dfa90.predict(input);
                        switch (alt90) {
                    	case 1 :
                    	    // antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_catch1797);
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
    // antlr/Fan.g:255:1: catch_long : BRACKET_L ( stmt )* BRACKET_R ;
    public final void catch_long() throws RecognitionException {
        int catch_long_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return ; }
            // antlr/Fan.g:255:12: ( BRACKET_L ( stmt )* BRACKET_R )
            // antlr/Fan.g:255:14: BRACKET_L ( stmt )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_catch_long1806); if (state.failed) return ;
            // antlr/Fan.g:255:24: ( stmt )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=T_BREAK && LA92_0<=T_TRY)||(LA92_0>=T_THIS && LA92_0<=T_SUPER)||(LA92_0>=T_NULL && LA92_0<=T_IT)||LA92_0==SQ_BRACKET_L||LA92_0==PAR_L||LA92_0==PIPE||LA92_0==CURRY||(LA92_0>=AT && LA92_0<=POUND)||(LA92_0>=MINUS && LA92_0<=NUMBER)||LA92_0==121||(LA92_0>=125 && LA92_0<=128)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_catch_long1808);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_catch_long1811); if (state.failed) return ;

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
    // antlr/Fan.g:256:1: catchDef : PAR_L type id PAR_R ;
    public final void catchDef() throws RecognitionException {
        int catchDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return ; }
            // antlr/Fan.g:256:11: ( PAR_L type id PAR_R )
            // antlr/Fan.g:256:13: PAR_L type id PAR_R
            {
            match(input,PAR_L,FOLLOW_PAR_L_in_catchDef1819); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_catchDef1821);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_catchDef1823);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_catchDef1825); if (state.failed) return ;

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
    // antlr/Fan.g:258:1: g_finally : T_FINALLY ( ( BRACKET_L )=> finally_long | ( stmt )* ) ;
    public final void g_finally() throws RecognitionException {
        int g_finally_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return ; }
            // antlr/Fan.g:258:11: ( T_FINALLY ( ( BRACKET_L )=> finally_long | ( stmt )* ) )
            // antlr/Fan.g:258:13: T_FINALLY ( ( BRACKET_L )=> finally_long | ( stmt )* )
            {
            match(input,T_FINALLY,FOLLOW_T_FINALLY_in_g_finally1833); if (state.failed) return ;
            // antlr/Fan.g:258:23: ( ( BRACKET_L )=> finally_long | ( stmt )* )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==BRACKET_L) && (synpred136_Fan())) {
                alt94=1;
            }
            else if ( (LA94_0==EOF||(LA94_0>=T_BREAK && LA94_0<=T_FINALLY)||(LA94_0>=T_RD_ONLY && LA94_0<=T_VOID)||(LA94_0>=T_ABSTRACT && LA94_0<=T_ELSE)||(LA94_0>=T_NULL && LA94_0<=T_IT)||LA94_0==SQ_BRACKET_L||LA94_0==BRACKET_R||(LA94_0>=COMMA && LA94_0<=PAR_L)||LA94_0==PIPE||LA94_0==SEMI||LA94_0==CURRY||(LA94_0>=AT && LA94_0<=NUMBER)||LA94_0==121||(LA94_0>=125 && LA94_0<=128)) ) {
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
                    // antlr/Fan.g:258:24: ( BRACKET_L )=> finally_long
                    {
                    pushFollow(FOLLOW_finally_long_in_g_finally1840);
                    finally_long();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:258:52: ( stmt )*
                    {
                    // antlr/Fan.g:258:52: ( stmt )*
                    loop93:
                    do {
                        int alt93=2;
                        alt93 = dfa93.predict(input);
                        switch (alt93) {
                    	case 1 :
                    	    // antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_finally1844);
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
    // antlr/Fan.g:259:1: finally_long : BRACKET_L ( stmt )* BRACKET_R ;
    public final void finally_long() throws RecognitionException {
        int finally_long_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return ; }
            // antlr/Fan.g:259:14: ( BRACKET_L ( stmt )* BRACKET_R )
            // antlr/Fan.g:259:16: BRACKET_L ( stmt )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_finally_long1853); if (state.failed) return ;
            // antlr/Fan.g:259:26: ( stmt )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( ((LA95_0>=T_BREAK && LA95_0<=T_TRY)||(LA95_0>=T_THIS && LA95_0<=T_SUPER)||(LA95_0>=T_NULL && LA95_0<=T_IT)||LA95_0==SQ_BRACKET_L||LA95_0==PAR_L||LA95_0==PIPE||LA95_0==CURRY||(LA95_0>=AT && LA95_0<=POUND)||(LA95_0>=MINUS && LA95_0<=NUMBER)||LA95_0==121||(LA95_0>=125 && LA95_0<=128)) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_finally_long1855);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_finally_long1858); if (state.failed) return ;

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
    // antlr/Fan.g:260:1: g_case : T_CASE expr COLON ( stmt )* ;
    public final void g_case() throws RecognitionException {
        int g_case_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return ; }
            // antlr/Fan.g:260:9: ( T_CASE expr COLON ( stmt )* )
            // antlr/Fan.g:260:11: T_CASE expr COLON ( stmt )*
            {
            match(input,T_CASE,FOLLOW_T_CASE_in_g_case1866); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_case1868);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_g_case1870); if (state.failed) return ;
            // antlr/Fan.g:260:29: ( stmt )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( ((LA96_0>=T_BREAK && LA96_0<=T_TRY)||(LA96_0>=T_THIS && LA96_0<=T_SUPER)||(LA96_0>=T_NULL && LA96_0<=T_IT)||LA96_0==SQ_BRACKET_L||LA96_0==PAR_L||LA96_0==PIPE||LA96_0==CURRY||(LA96_0>=AT && LA96_0<=POUND)||(LA96_0>=MINUS && LA96_0<=NUMBER)||LA96_0==121||(LA96_0>=125 && LA96_0<=128)) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_case1872);
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
    // antlr/Fan.g:261:1: g_default : T_DEFAULT COLON ( stmt )* ;
    public final void g_default() throws RecognitionException {
        int g_default_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return ; }
            // antlr/Fan.g:261:11: ( T_DEFAULT COLON ( stmt )* )
            // antlr/Fan.g:261:13: T_DEFAULT COLON ( stmt )*
            {
            match(input,T_DEFAULT,FOLLOW_T_DEFAULT_in_g_default1880); if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_g_default1882); if (state.failed) return ;
            // antlr/Fan.g:261:29: ( stmt )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=T_BREAK && LA97_0<=T_TRY)||(LA97_0>=T_THIS && LA97_0<=T_SUPER)||(LA97_0>=T_NULL && LA97_0<=T_IT)||LA97_0==SQ_BRACKET_L||LA97_0==PAR_L||LA97_0==PIPE||LA97_0==CURRY||(LA97_0>=AT && LA97_0<=POUND)||(LA97_0>=MINUS && LA97_0<=NUMBER)||LA97_0==121||(LA97_0>=125 && LA97_0<=128)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_default1884);
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
    // antlr/Fan.g:264:1: expr : assignExpr ;
    public final void expr() throws RecognitionException {
        int expr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return ; }
            // antlr/Fan.g:264:7: ( assignExpr )
            // antlr/Fan.g:264:9: assignExpr
            {
            pushFollow(FOLLOW_assignExpr_in_expr1895);
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
    // antlr/Fan.g:265:1: assignExpr : ternaryExpr ( assignOp assignExpr )? ;
    public final void assignExpr() throws RecognitionException {
        int assignExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return ; }
            // antlr/Fan.g:265:12: ( ternaryExpr ( assignOp assignExpr )? )
            // antlr/Fan.g:265:14: ternaryExpr ( assignOp assignExpr )?
            {
            pushFollow(FOLLOW_ternaryExpr_in_assignExpr1902);
            ternaryExpr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:265:26: ( assignOp assignExpr )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==EQUAL||(LA98_0>=98 && LA98_0<=107)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // antlr/Fan.g:265:27: assignOp assignExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr1905);
                    assignOp();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_assignExpr_in_assignExpr1907);
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
    // antlr/Fan.g:266:1: ternaryExpr : condOrExpr ( ternaryTail )? ;
    public final void ternaryExpr() throws RecognitionException {
        int ternaryExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return ; }
            // antlr/Fan.g:266:13: ( condOrExpr ( ternaryTail )? )
            // antlr/Fan.g:266:15: condOrExpr ( ternaryTail )?
            {
            pushFollow(FOLLOW_condOrExpr_in_ternaryExpr1916);
            condOrExpr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:266:26: ( ternaryTail )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==QMARK) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // antlr/Fan.g:266:27: ternaryTail
                    {
                    pushFollow(FOLLOW_ternaryTail_in_ternaryExpr1919);
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
    // antlr/Fan.g:268:1: ternaryTail : QMARK condOrExpr COLON condOrExpr ;
    public final void ternaryTail() throws RecognitionException {
        int ternaryTail_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return ; }
            // antlr/Fan.g:268:13: ( QMARK condOrExpr COLON condOrExpr )
            // antlr/Fan.g:268:15: QMARK condOrExpr COLON condOrExpr
            {
            match(input,QMARK,FOLLOW_QMARK_in_ternaryTail1929); if (state.failed) return ;
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail1931);
            condOrExpr();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_ternaryTail1933); if (state.failed) return ;
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail1935);
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
    // antlr/Fan.g:269:1: assignOp : ( EQUAL | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
    public final void assignOp() throws RecognitionException {
        int assignOp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }
            // antlr/Fan.g:269:10: ( EQUAL | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
            // antlr/Fan.g:
            {
            if ( input.LA(1)==EQUAL||(input.LA(1)>=98 && input.LA(1)<=107) ) {
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
    // antlr/Fan.g:271:1: condOrExpr : condAndExpr ( '||' condAndExpr )* ;
    public final void condOrExpr() throws RecognitionException {
        int condOrExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return ; }
            // antlr/Fan.g:271:13: ( condAndExpr ( '||' condAndExpr )* )
            // antlr/Fan.g:271:15: condAndExpr ( '||' condAndExpr )*
            {
            pushFollow(FOLLOW_condAndExpr_in_condOrExpr2013);
            condAndExpr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:271:28: ( '||' condAndExpr )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==108) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // antlr/Fan.g:271:29: '||' condAndExpr
            	    {
            	    match(input,108,FOLLOW_108_in_condOrExpr2017); if (state.failed) return ;
            	    pushFollow(FOLLOW_condAndExpr_in_condOrExpr2020);
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
    // antlr/Fan.g:272:1: condAndExpr : equalityExpr ( '&&' equalityExpr )* ;
    public final void condAndExpr() throws RecognitionException {
        int condAndExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }
            // antlr/Fan.g:272:14: ( equalityExpr ( '&&' equalityExpr )* )
            // antlr/Fan.g:272:16: equalityExpr ( '&&' equalityExpr )*
            {
            pushFollow(FOLLOW_equalityExpr_in_condAndExpr2030);
            equalityExpr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:272:29: ( '&&' equalityExpr )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==109) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // antlr/Fan.g:272:30: '&&' equalityExpr
            	    {
            	    match(input,109,FOLLOW_109_in_condAndExpr2033); if (state.failed) return ;
            	    pushFollow(FOLLOW_equalityExpr_in_condAndExpr2036);
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
    // antlr/Fan.g:273:1: equalityExpr : relationalExpr ( ( '===' | '!==' | '==' | '!=' ) relationalExpr )* ;
    public final void equalityExpr() throws RecognitionException {
        int equalityExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return ; }
            // antlr/Fan.g:273:14: ( relationalExpr ( ( '===' | '!==' | '==' | '!=' ) relationalExpr )* )
            // antlr/Fan.g:273:16: relationalExpr ( ( '===' | '!==' | '==' | '!=' ) relationalExpr )*
            {
            pushFollow(FOLLOW_relationalExpr_in_equalityExpr2046);
            relationalExpr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:273:31: ( ( '===' | '!==' | '==' | '!=' ) relationalExpr )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( ((LA102_0>=110 && LA102_0<=113)) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // antlr/Fan.g:273:32: ( '===' | '!==' | '==' | '!=' ) relationalExpr
            	    {
            	    if ( (input.LA(1)>=110 && input.LA(1)<=113) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpr_in_equalityExpr2065);
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
    // antlr/Fan.g:275:1: relationalExpr : elvisExpr ( typeCheck | compare ) ;
    public final void relationalExpr() throws RecognitionException {
        int relationalExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return ; }
            // antlr/Fan.g:275:16: ( elvisExpr ( typeCheck | compare ) )
            // antlr/Fan.g:275:20: elvisExpr ( typeCheck | compare )
            {
            pushFollow(FOLLOW_elvisExpr_in_relationalExpr2078);
            elvisExpr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:275:30: ( typeCheck | compare )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==T_AS||(LA103_0>=T_IS && LA103_0<=T_ISNOT)) ) {
                alt103=1;
            }
            else if ( (LA103_0==EOF||(LA103_0>=T_BREAK && LA103_0<=T_USING)||(LA103_0>=T_RD_ONLY && LA103_0<=T_ELSE)||(LA103_0>=T_NULL && LA103_0<=T_IT)||(LA103_0>=SQ_BRACKET_L && LA103_0<=PIPE)||(LA103_0>=SEMI && LA103_0<=EQUAL)||LA103_0==CURRY||(LA103_0>=AT && LA103_0<=NUMBER)||(LA103_0>=98 && LA103_0<=118)||LA103_0==121||(LA103_0>=125 && LA103_0<=128)) ) {
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
                    // antlr/Fan.g:275:31: typeCheck
                    {
                    pushFollow(FOLLOW_typeCheck_in_relationalExpr2081);
                    typeCheck();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:275:43: compare
                    {
                    pushFollow(FOLLOW_compare_in_relationalExpr2085);
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
    // antlr/Fan.g:277:1: typeCheck : ( T_ISNOT | T_IS | T_AS ) typeRoot ( ( QMARK )? {...}? '[]' )* ;
    public final void typeCheck() throws RecognitionException {
        int typeCheck_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return ; }
            // antlr/Fan.g:277:11: ( ( T_ISNOT | T_IS | T_AS ) typeRoot ( ( QMARK )? {...}? '[]' )* )
            // antlr/Fan.g:277:15: ( T_ISNOT | T_IS | T_AS ) typeRoot ( ( QMARK )? {...}? '[]' )*
            {
            if ( input.LA(1)==T_AS||(input.LA(1)>=T_IS && input.LA(1)<=T_ISNOT) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_typeRoot_in_typeCheck2108);
            typeRoot();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:277:48: ( ( QMARK )? {...}? '[]' )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==QMARK) ) {
                    int LA105_2 = input.LA(2);

                    if ( (LA105_2==97) ) {
                        alt105=1;
                    }


                }
                else if ( (LA105_0==97) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // antlr/Fan.g:277:49: ( QMARK )? {...}? '[]'
            	    {
            	    // antlr/Fan.g:277:49: ( QMARK )?
            	    int alt104=2;
            	    int LA104_0 = input.LA(1);

            	    if ( (LA104_0==QMARK) ) {
            	        alt104=1;
            	    }
            	    switch (alt104) {
            	        case 1 :
            	            // antlr/Fan.g:0:0: QMARK
            	            {
            	            match(input,QMARK,FOLLOW_QMARK_in_typeCheck2111); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "typeCheck", "notAfterEol()");
            	    }
            	    match(input,97,FOLLOW_97_in_typeCheck2116); if (state.failed) return ;

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
    // antlr/Fan.g:278:1: compare : ( ( '<=>' | '<=' | '<' | '>=' | '>' ) elvisExpr )* ;
    public final void compare() throws RecognitionException {
        int compare_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return ; }
            // antlr/Fan.g:278:10: ( ( ( '<=>' | '<=' | '<' | '>=' | '>' ) elvisExpr )* )
            // antlr/Fan.g:278:14: ( ( '<=>' | '<=' | '<' | '>=' | '>' ) elvisExpr )*
            {
            // antlr/Fan.g:278:14: ( ( '<=>' | '<=' | '<' | '>=' | '>' ) elvisExpr )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( ((LA106_0>=114 && LA106_0<=118)) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // antlr/Fan.g:278:15: ( '<=>' | '<=' | '<' | '>=' | '>' ) elvisExpr
            	    {
            	    if ( (input.LA(1)>=114 && input.LA(1)<=118) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_elvisExpr_in_compare2149);
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
    // antlr/Fan.g:280:1: elvisExpr : rangeExpr ( ELVIS rangeExpr )* ;
    public final void elvisExpr() throws RecognitionException {
        int elvisExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }
            // antlr/Fan.g:280:12: ( rangeExpr ( ELVIS rangeExpr )* )
            // antlr/Fan.g:280:14: rangeExpr ( ELVIS rangeExpr )*
            {
            pushFollow(FOLLOW_rangeExpr_in_elvisExpr2160);
            rangeExpr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:280:24: ( ELVIS rangeExpr )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==ELVIS) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // antlr/Fan.g:280:25: ELVIS rangeExpr
            	    {
            	    match(input,ELVIS,FOLLOW_ELVIS_in_elvisExpr2163); if (state.failed) return ;
            	    pushFollow(FOLLOW_rangeExpr_in_elvisExpr2165);
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
    // antlr/Fan.g:281:1: rangeExpr : bitOrExpr ( ( RANG_EXCL_OLD | RANGE_EXCL | RANGE ) bitOrExpr )* ;
    public final void rangeExpr() throws RecognitionException {
        int rangeExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return ; }
            // antlr/Fan.g:281:12: ( bitOrExpr ( ( RANG_EXCL_OLD | RANGE_EXCL | RANGE ) bitOrExpr )* )
            // antlr/Fan.g:281:14: bitOrExpr ( ( RANG_EXCL_OLD | RANGE_EXCL | RANGE ) bitOrExpr )*
            {
            pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2176);
            bitOrExpr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:281:24: ( ( RANG_EXCL_OLD | RANGE_EXCL | RANGE ) bitOrExpr )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( ((LA108_0>=RANG_EXCL_OLD && LA108_0<=RANGE)) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // antlr/Fan.g:281:25: ( RANG_EXCL_OLD | RANGE_EXCL | RANGE ) bitOrExpr
            	    {
            	    if ( (input.LA(1)>=RANG_EXCL_OLD && input.LA(1)<=RANGE) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2193);
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
    // antlr/Fan.g:282:1: bitOrExpr : bitAndExpr ( ( BITOR | PIPE ) bitAndExpr )* ;
    public final void bitOrExpr() throws RecognitionException {
        int bitOrExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return ; }
            // antlr/Fan.g:282:12: ( bitAndExpr ( ( BITOR | PIPE ) bitAndExpr )* )
            // antlr/Fan.g:282:14: bitAndExpr ( ( BITOR | PIPE ) bitAndExpr )*
            {
            pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2204);
            bitAndExpr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:282:25: ( ( BITOR | PIPE ) bitAndExpr )*
            loop109:
            do {
                int alt109=2;
                alt109 = dfa109.predict(input);
                switch (alt109) {
            	case 1 :
            	    // antlr/Fan.g:282:26: ( BITOR | PIPE ) bitAndExpr
            	    {
            	    if ( input.LA(1)==PIPE||input.LA(1)==BITOR ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2215);
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
    // antlr/Fan.g:283:1: bitAndExpr : shiftExpr ( '&' shiftExpr )* ;
    public final void bitAndExpr() throws RecognitionException {
        int bitAndExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return ; }
            // antlr/Fan.g:283:13: ( shiftExpr ( '&' shiftExpr )* )
            // antlr/Fan.g:283:15: shiftExpr ( '&' shiftExpr )*
            {
            pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2226);
            shiftExpr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:283:25: ( '&' shiftExpr )*
            loop110:
            do {
                int alt110=2;
                alt110 = dfa110.predict(input);
                switch (alt110) {
            	case 1 :
            	    // antlr/Fan.g:283:26: '&' shiftExpr
            	    {
            	    match(input,CURRY,FOLLOW_CURRY_in_bitAndExpr2229); if (state.failed) return ;
            	    pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2231);
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
    // antlr/Fan.g:284:1: shiftExpr : addExpr ( ( '<<' | '>>' ) addExpr )* ;
    public final void shiftExpr() throws RecognitionException {
        int shiftExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return ; }
            // antlr/Fan.g:284:12: ( addExpr ( ( '<<' | '>>' ) addExpr )* )
            // antlr/Fan.g:284:14: addExpr ( ( '<<' | '>>' ) addExpr )*
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2243);
            addExpr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:284:22: ( ( '<<' | '>>' ) addExpr )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( ((LA111_0>=119 && LA111_0<=120)) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // antlr/Fan.g:284:23: ( '<<' | '>>' ) addExpr
            	    {
            	    if ( (input.LA(1)>=119 && input.LA(1)<=120) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2254);
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
    // antlr/Fan.g:285:1: addExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
    public final void addExpr() throws RecognitionException {
        int addExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return ; }
            // antlr/Fan.g:285:10: ( multExpr ( ( '+' | '-' ) multExpr )* )
            // antlr/Fan.g:285:12: multExpr ( ( '+' | '-' ) multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2265);
            multExpr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:285:21: ( ( '+' | '-' ) multExpr )*
            loop112:
            do {
                int alt112=2;
                alt112 = dfa112.predict(input);
                switch (alt112) {
            	case 1 :
            	    // antlr/Fan.g:285:22: ( '+' | '-' ) multExpr
            	    {
            	    if ( input.LA(1)==MINUS||input.LA(1)==121 ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2276);
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
    // antlr/Fan.g:286:1: addAppend : ( '+' | '-' ) parenExpr ;
    public final void addAppend() throws RecognitionException {
        int addAppend_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return ; }
            // antlr/Fan.g:286:11: ( ( '+' | '-' ) parenExpr )
            // antlr/Fan.g:286:13: ( '+' | '-' ) parenExpr
            {
            if ( input.LA(1)==MINUS||input.LA(1)==121 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_addAppend2294);
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
    // antlr/Fan.g:287:1: multExpr : parenExpr ( ( '*' | '/' | '%' ) parenExpr )* ;
    public final void multExpr() throws RecognitionException {
        int multExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return ; }
            // antlr/Fan.g:287:11: ( parenExpr ( ( '*' | '/' | '%' ) parenExpr )* )
            // antlr/Fan.g:287:13: parenExpr ( ( '*' | '/' | '%' ) parenExpr )*
            {
            pushFollow(FOLLOW_parenExpr_in_multExpr2302);
            parenExpr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:287:23: ( ( '*' | '/' | '%' ) parenExpr )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( ((LA113_0>=122 && LA113_0<=124)) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // antlr/Fan.g:287:24: ( '*' | '/' | '%' ) parenExpr
            	    {
            	    if ( (input.LA(1)>=122 && input.LA(1)<=124) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_parenExpr_in_multExpr2317);
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
    // antlr/Fan.g:288:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );
    public final void parenExpr() throws RecognitionException {
        int parenExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return ; }
            // antlr/Fan.g:288:12: ( castExpr | groupedExpr | unaryExpr )
            int alt114=3;
            alt114 = dfa114.predict(input);
            switch (alt114) {
                case 1 :
                    // antlr/Fan.g:288:14: castExpr
                    {
                    pushFollow(FOLLOW_castExpr_in_parenExpr2328);
                    castExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:288:25: groupedExpr
                    {
                    pushFollow(FOLLOW_groupedExpr_in_parenExpr2332);
                    groupedExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:288:39: unaryExpr
                    {
                    pushFollow(FOLLOW_unaryExpr_in_parenExpr2336);
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
    // antlr/Fan.g:290:1: castExpr : {...}? PAR_L type PAR_R parenExpr ;
    public final void castExpr() throws RecognitionException {
        int castExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return ; }
            // antlr/Fan.g:290:11: ({...}? PAR_L type PAR_R parenExpr )
            // antlr/Fan.g:290:13: {...}? PAR_L type PAR_R parenExpr
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "castExpr", "notAfterEol()");
            }
            match(input,PAR_L,FOLLOW_PAR_L_in_castExpr2347); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_castExpr2349);
            type();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_castExpr2351); if (state.failed) return ;
            pushFollow(FOLLOW_parenExpr_in_castExpr2353);
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
    // antlr/Fan.g:292:1: groupedExpr : PAR_L expr PAR_R ( termChain )* ;
    public final void groupedExpr() throws RecognitionException {
        int groupedExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return ; }
            // antlr/Fan.g:292:14: ( PAR_L expr PAR_R ( termChain )* )
            // antlr/Fan.g:292:16: PAR_L expr PAR_R ( termChain )*
            {
            match(input,PAR_L,FOLLOW_PAR_L_in_groupedExpr2362); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_groupedExpr2364);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_groupedExpr2366); if (state.failed) return ;
            // antlr/Fan.g:292:33: ( termChain )*
            loop115:
            do {
                int alt115=2;
                alt115 = dfa115.predict(input);
                switch (alt115) {
            	case 1 :
            	    // antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_groupedExpr2368);
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
    // antlr/Fan.g:293:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );
    public final void unaryExpr() throws RecognitionException {
        int unaryExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return ; }
            // antlr/Fan.g:293:12: ( prefixExpr | postfixExpr | termExpr )
            int alt116=3;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // antlr/Fan.g:293:14: prefixExpr
                    {
                    pushFollow(FOLLOW_prefixExpr_in_unaryExpr2377);
                    prefixExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:293:27: postfixExpr
                    {
                    pushFollow(FOLLOW_postfixExpr_in_unaryExpr2381);
                    postfixExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:293:41: termExpr
                    {
                    pushFollow(FOLLOW_termExpr_in_unaryExpr2385);
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
    // antlr/Fan.g:294:1: prefixExpr : ( CURRY | '!' | '++' | '--' | '~' | '+' | '-' ) parenExpr ;
    public final void prefixExpr() throws RecognitionException {
        int prefixExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return ; }
            // antlr/Fan.g:294:13: ( ( CURRY | '!' | '++' | '--' | '~' | '+' | '-' ) parenExpr )
            // antlr/Fan.g:294:15: ( CURRY | '!' | '++' | '--' | '~' | '+' | '-' ) parenExpr
            {
            if ( input.LA(1)==CURRY||input.LA(1)==MINUS||input.LA(1)==121||(input.LA(1)>=125 && input.LA(1)<=128) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_prefixExpr2421);
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
    // antlr/Fan.g:295:1: postfixExpr : termExpr ( '++' | '--' ) ;
    public final void postfixExpr() throws RecognitionException {
        int postfixExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return ; }
            // antlr/Fan.g:295:14: ( termExpr ( '++' | '--' ) )
            // antlr/Fan.g:295:16: termExpr ( '++' | '--' )
            {
            pushFollow(FOLLOW_termExpr_in_postfixExpr2430);
            termExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( (input.LA(1)>=126 && input.LA(1)<=127) ) {
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
    // antlr/Fan.g:296:1: termExpr : termBase ( termChain )* ;
    public final void termExpr() throws RecognitionException {
        int termExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return ; }
            // antlr/Fan.g:296:11: ( termBase ( termChain )* )
            // antlr/Fan.g:296:13: termBase ( termChain )*
            {
            pushFollow(FOLLOW_termBase_in_termExpr2447);
            termBase();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:296:22: ( termChain )*
            loop117:
            do {
                int alt117=2;
                alt117 = dfa117.predict(input);
                switch (alt117) {
            	case 1 :
            	    // antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_termExpr2449);
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
    // antlr/Fan.g:298:1: termBase : ( idExprReq | literal | typeBase | id );
    public final void termBase() throws RecognitionException {
        int termBase_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return ; }
            // antlr/Fan.g:298:11: ( idExprReq | literal | typeBase | id )
            int alt118=4;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // antlr/Fan.g:298:13: idExprReq
                    {
                    pushFollow(FOLLOW_idExprReq_in_termBase2459);
                    idExprReq();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:298:25: literal
                    {
                    pushFollow(FOLLOW_literal_in_termBase2463);
                    literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:298:35: typeBase
                    {
                    pushFollow(FOLLOW_typeBase_in_termBase2467);
                    typeBase();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // antlr/Fan.g:298:46: id
                    {
                    pushFollow(FOLLOW_id_in_termBase2471);
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
    // antlr/Fan.g:299:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );
    public final void typeBase() throws RecognitionException {
        int typeBase_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return ; }
            // antlr/Fan.g:299:10: ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock )
            int alt119=8;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // antlr/Fan.g:299:12: typeLiteral
                    {
                    pushFollow(FOLLOW_typeLiteral_in_typeBase2478);
                    typeLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:299:26: slotLiteral
                    {
                    pushFollow(FOLLOW_slotLiteral_in_typeBase2482);
                    slotLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:299:40: namedSuper
                    {
                    pushFollow(FOLLOW_namedSuper_in_typeBase2486);
                    namedSuper();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // antlr/Fan.g:299:53: staticCall
                    {
                    pushFollow(FOLLOW_staticCall_in_typeBase2490);
                    staticCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // antlr/Fan.g:300:19: dsl
                    {
                    pushFollow(FOLLOW_dsl_in_typeBase2512);
                    dsl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // antlr/Fan.g:300:25: closure
                    {
                    pushFollow(FOLLOW_closure_in_typeBase2516);
                    closure();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // antlr/Fan.g:300:35: simple
                    {
                    pushFollow(FOLLOW_simple_in_typeBase2520);
                    simple();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // antlr/Fan.g:300:44: ctorBlock
                    {
                    pushFollow(FOLLOW_ctorBlock_in_typeBase2524);
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
    // antlr/Fan.g:301:1: ctorBlock : type itBlock ;
    public final void ctorBlock() throws RecognitionException {
        int ctorBlock_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return ; }
            // antlr/Fan.g:301:11: ( type itBlock )
            // antlr/Fan.g:301:13: type itBlock
            {
            pushFollow(FOLLOW_type_in_ctorBlock2531);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_itBlock_in_ctorBlock2533);
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
    // antlr/Fan.g:302:1: staticCall : type DOT idExpr ;
    public final void staticCall() throws RecognitionException {
        int staticCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return ; }
            // antlr/Fan.g:302:12: ( type DOT idExpr )
            // antlr/Fan.g:302:14: type DOT idExpr
            {
            pushFollow(FOLLOW_type_in_staticCall2540);
            type();

            state._fsp--;
            if (state.failed) return ;
            match(input,DOT,FOLLOW_DOT_in_staticCall2542); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_staticCall2544);
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
    // antlr/Fan.g:304:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock );
    public final void termChain() throws RecognitionException {
        int termChain_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return ; }
            // antlr/Fan.g:304:12: ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock )
            int alt120=7;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt120=1;
                }
                break;
            case ARROW:
                {
                alt120=2;
                }
                break;
            case 129:
                {
                alt120=3;
                }
                break;
            case 130:
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
                    // antlr/Fan.g:304:14: dotCall
                    {
                    pushFollow(FOLLOW_dotCall_in_termChain2553);
                    dotCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:304:24: dynCall
                    {
                    pushFollow(FOLLOW_dynCall_in_termChain2557);
                    dynCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:304:34: safeDotCall
                    {
                    pushFollow(FOLLOW_safeDotCall_in_termChain2561);
                    safeDotCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // antlr/Fan.g:304:48: safeDynCall
                    {
                    pushFollow(FOLLOW_safeDynCall_in_termChain2565);
                    safeDynCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // antlr/Fan.g:305:4: indexExpr
                    {
                    pushFollow(FOLLOW_indexExpr_in_termChain2572);
                    indexExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // antlr/Fan.g:305:16: callOp
                    {
                    pushFollow(FOLLOW_callOp_in_termChain2576);
                    callOp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // antlr/Fan.g:305:25: itBlock
                    {
                    pushFollow(FOLLOW_itBlock_in_termChain2580);
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
    // antlr/Fan.g:306:1: dsl : simpleType DSL ;
    public final void dsl() throws RecognitionException {
        int dsl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return ; }
            // antlr/Fan.g:306:13: ( simpleType DSL )
            // antlr/Fan.g:306:15: simpleType DSL
            {
            pushFollow(FOLLOW_simpleType_in_dsl2595);
            simpleType();

            state._fsp--;
            if (state.failed) return ;
            match(input,DSL,FOLLOW_DSL_in_dsl2597); if (state.failed) return ;

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
    // antlr/Fan.g:309:1: itBlock : BRACKET_L ( stmt ( COMMA )? ( SEMI )? )* BRACKET_R ;
    public final void itBlock() throws RecognitionException {
        int itBlock_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return ; }
            // antlr/Fan.g:309:10: ( BRACKET_L ( stmt ( COMMA )? ( SEMI )? )* BRACKET_R )
            // antlr/Fan.g:309:12: BRACKET_L ( stmt ( COMMA )? ( SEMI )? )* BRACKET_R
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_itBlock2607); if (state.failed) return ;
            // antlr/Fan.g:309:22: ( stmt ( COMMA )? ( SEMI )? )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( ((LA123_0>=T_BREAK && LA123_0<=T_TRY)||(LA123_0>=T_THIS && LA123_0<=T_SUPER)||(LA123_0>=T_NULL && LA123_0<=T_IT)||LA123_0==SQ_BRACKET_L||LA123_0==PAR_L||LA123_0==PIPE||LA123_0==CURRY||(LA123_0>=AT && LA123_0<=POUND)||(LA123_0>=MINUS && LA123_0<=NUMBER)||LA123_0==121||(LA123_0>=125 && LA123_0<=128)) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // antlr/Fan.g:309:23: stmt ( COMMA )? ( SEMI )?
            	    {
            	    pushFollow(FOLLOW_stmt_in_itBlock2610);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    // antlr/Fan.g:309:28: ( COMMA )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==COMMA) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // antlr/Fan.g:0:0: COMMA
            	            {
            	            match(input,COMMA,FOLLOW_COMMA_in_itBlock2612); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    // antlr/Fan.g:309:35: ( SEMI )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==SEMI) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // antlr/Fan.g:0:0: SEMI
            	            {
            	            match(input,SEMI,FOLLOW_SEMI_in_itBlock2615); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_itBlock2620); if (state.failed) return ;

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
    // antlr/Fan.g:310:1: dotCall : DOT idExpr ;
    public final void dotCall() throws RecognitionException {
        int dotCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return ; }
            // antlr/Fan.g:310:10: ( DOT idExpr )
            // antlr/Fan.g:310:12: DOT idExpr
            {
            match(input,DOT,FOLLOW_DOT_in_dotCall2628); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_dotCall2630);
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
    // antlr/Fan.g:311:1: dynCall : '->' idExpr ;
    public final void dynCall() throws RecognitionException {
        int dynCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return ; }
            // antlr/Fan.g:311:10: ( '->' idExpr )
            // antlr/Fan.g:311:12: '->' idExpr
            {
            match(input,ARROW,FOLLOW_ARROW_in_dynCall2638); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_dynCall2640);
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
    // antlr/Fan.g:312:1: safeDotCall : '?.' idExpr ;
    public final void safeDotCall() throws RecognitionException {
        int safeDotCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return ; }
            // antlr/Fan.g:312:14: ( '?.' idExpr )
            // antlr/Fan.g:312:16: '?.' idExpr
            {
            match(input,129,FOLLOW_129_in_safeDotCall2648); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_safeDotCall2650);
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
    // antlr/Fan.g:313:1: safeDynCall : '?->' idExpr ;
    public final void safeDynCall() throws RecognitionException {
        int safeDynCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return ; }
            // antlr/Fan.g:313:13: ( '?->' idExpr )
            // antlr/Fan.g:313:15: '?->' idExpr
            {
            match(input,130,FOLLOW_130_in_safeDynCall2657); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_safeDynCall2659);
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
    // antlr/Fan.g:314:1: indexExpr : {...}? SQ_BRACKET_L expr SQ_BRACKET_R ;
    public final void indexExpr() throws RecognitionException {
        int indexExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return ; }
            // antlr/Fan.g:314:12: ({...}? SQ_BRACKET_L expr SQ_BRACKET_R )
            // antlr/Fan.g:314:14: {...}? SQ_BRACKET_L expr SQ_BRACKET_R
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "indexExpr", "notAfterEol()");
            }
            match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_indexExpr2669); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_indexExpr2671);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_indexExpr2673); if (state.failed) return ;

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
    // antlr/Fan.g:316:1: callOp : {...}? PAR_L ( args )? PAR_R ( closure )* ;
    public final void callOp() throws RecognitionException {
        int callOp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return ; }
            // antlr/Fan.g:316:9: ({...}? PAR_L ( args )? PAR_R ( closure )* )
            // antlr/Fan.g:316:11: {...}? PAR_L ( args )? PAR_R ( closure )*
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "callOp", "notAfterEol()");
            }
            match(input,PAR_L,FOLLOW_PAR_L_in_callOp2684); if (state.failed) return ;
            // antlr/Fan.g:316:34: ( args )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( ((LA124_0>=T_THIS && LA124_0<=T_SUPER)||(LA124_0>=T_NULL && LA124_0<=T_IT)||LA124_0==SQ_BRACKET_L||LA124_0==PAR_L||LA124_0==PIPE||LA124_0==CURRY||(LA124_0>=AT && LA124_0<=POUND)||(LA124_0>=MINUS && LA124_0<=NUMBER)||LA124_0==121||(LA124_0>=125 && LA124_0<=128)) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callOp2686);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_callOp2690); if (state.failed) return ;
            // antlr/Fan.g:316:47: ( closure )*
            loop125:
            do {
                int alt125=2;
                alt125 = dfa125.predict(input);
                switch (alt125) {
            	case 1 :
            	    // antlr/Fan.g:0:0: closure
            	    {
            	    pushFollow(FOLLOW_closure_in_callOp2692);
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
    // antlr/Fan.g:317:1: closure : funcType BRACKET_L ( stmt )* BRACKET_R ;
    public final void closure() throws RecognitionException {
        int closure_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return ; }
            // antlr/Fan.g:317:10: ( funcType BRACKET_L ( stmt )* BRACKET_R )
            // antlr/Fan.g:317:14: funcType BRACKET_L ( stmt )* BRACKET_R
            {
            pushFollow(FOLLOW_funcType_in_closure2703);
            funcType();

            state._fsp--;
            if (state.failed) return ;
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_closure2705); if (state.failed) return ;
            // antlr/Fan.g:317:33: ( stmt )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( ((LA126_0>=T_BREAK && LA126_0<=T_TRY)||(LA126_0>=T_THIS && LA126_0<=T_SUPER)||(LA126_0>=T_NULL && LA126_0<=T_IT)||LA126_0==SQ_BRACKET_L||LA126_0==PAR_L||LA126_0==PIPE||LA126_0==CURRY||(LA126_0>=AT && LA126_0<=POUND)||(LA126_0>=MINUS && LA126_0<=NUMBER)||LA126_0==121||(LA126_0>=125 && LA126_0<=128)) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_closure2707);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);

            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_closure2710); if (state.failed) return ;

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
    // antlr/Fan.g:319:1: idExpr : ( idExprReq | id );
    public final void idExpr() throws RecognitionException {
        int idExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return ; }
            // antlr/Fan.g:319:10: ( idExprReq | id )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==AT) ) {
                alt127=1;
            }
            else if ( (LA127_0==ID) ) {
                int LA127_2 = input.LA(2);

                if ( (synpred219_Fan()) ) {
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
                    // antlr/Fan.g:319:12: idExprReq
                    {
                    pushFollow(FOLLOW_idExprReq_in_idExpr2720);
                    idExprReq();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:319:24: id
                    {
                    pushFollow(FOLLOW_id_in_idExpr2724);
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
    // antlr/Fan.g:321:1: idExprReq : ( field | call );
    public final void idExprReq() throws RecognitionException {
        int idExprReq_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return ; }
            // antlr/Fan.g:321:11: ( field | call )
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
                    // antlr/Fan.g:321:13: field
                    {
                    pushFollow(FOLLOW_field_in_idExprReq2732);
                    field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:321:21: call
                    {
                    pushFollow(FOLLOW_call_in_idExprReq2736);
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
    // antlr/Fan.g:323:1: field : AT ID ;
    public final void field() throws RecognitionException {
        int field_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return ; }
            // antlr/Fan.g:323:8: ( AT ID )
            // antlr/Fan.g:323:10: AT ID
            {
            match(input,AT,FOLLOW_AT_in_field2745); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_field2747); if (state.failed) return ;

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
    // antlr/Fan.g:325:1: call : id ( ( callParams closure ) | callParams | closure ) ;
    public final void call() throws RecognitionException {
        int call_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return ; }
            // antlr/Fan.g:325:7: ( id ( ( callParams closure ) | callParams | closure ) )
            // antlr/Fan.g:325:9: id ( ( callParams closure ) | callParams | closure )
            {
            pushFollow(FOLLOW_id_in_call2757);
            id();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:325:12: ( ( callParams closure ) | callParams | closure )
            int alt129=3;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==PAR_L) ) {
                int LA129_1 = input.LA(2);

                if ( ((synpred221_Fan()&&(notAfterEol()))) ) {
                    alt129=1;
                }
                else if ( ((synpred222_Fan()&&(notAfterEol()))) ) {
                    alt129=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA129_0==PIPE) ) {
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
                    // antlr/Fan.g:325:13: ( callParams closure )
                    {
                    // antlr/Fan.g:325:13: ( callParams closure )
                    // antlr/Fan.g:325:14: callParams closure
                    {
                    pushFollow(FOLLOW_callParams_in_call2761);
                    callParams();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_closure_in_call2763);
                    closure();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // antlr/Fan.g:325:36: callParams
                    {
                    pushFollow(FOLLOW_callParams_in_call2768);
                    callParams();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:325:49: closure
                    {
                    pushFollow(FOLLOW_closure_in_call2772);
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
    // antlr/Fan.g:327:1: callParams : {...}? PAR_L ( args )? PAR_R ;
    public final void callParams() throws RecognitionException {
        int callParams_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return ; }
            // antlr/Fan.g:327:12: ({...}? PAR_L ( args )? PAR_R )
            // antlr/Fan.g:327:14: {...}? PAR_L ( args )? PAR_R
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "callParams", "notAfterEol()");
            }
            match(input,PAR_L,FOLLOW_PAR_L_in_callParams2783); if (state.failed) return ;
            // antlr/Fan.g:327:37: ( args )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( ((LA130_0>=T_THIS && LA130_0<=T_SUPER)||(LA130_0>=T_NULL && LA130_0<=T_IT)||LA130_0==SQ_BRACKET_L||LA130_0==PAR_L||LA130_0==PIPE||LA130_0==CURRY||(LA130_0>=AT && LA130_0<=POUND)||(LA130_0>=MINUS && LA130_0<=NUMBER)||LA130_0==121||(LA130_0>=125 && LA130_0<=128)) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callParams2785);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,PAR_R,FOLLOW_PAR_R_in_callParams2788); if (state.failed) return ;

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
    // antlr/Fan.g:328:1: args : expr ( COMMA expr )* ;
    public final void args() throws RecognitionException {
        int args_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return ; }
            // antlr/Fan.g:328:8: ( expr ( COMMA expr )* )
            // antlr/Fan.g:328:10: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_args2797);
            expr();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:328:15: ( COMMA expr )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==COMMA) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // antlr/Fan.g:328:16: COMMA expr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_args2800); if (state.failed) return ;
            	    pushFollow(FOLLOW_expr_in_args2803);
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
    // antlr/Fan.g:330:1: literal : ( T_NULL | T_THIS | T_SUPER | T_IT | BOOL_VAL | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple );
    public final void literal() throws RecognitionException {
        int literal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return ; }
            // antlr/Fan.g:330:10: ( T_NULL | T_THIS | T_SUPER | T_IT | BOOL_VAL | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple )
            int alt132=16;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // antlr/Fan.g:330:12: T_NULL
                    {
                    match(input,T_NULL,FOLLOW_T_NULL_in_literal2814); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:330:21: T_THIS
                    {
                    match(input,T_THIS,FOLLOW_T_THIS_in_literal2818); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:330:30: T_SUPER
                    {
                    match(input,T_SUPER,FOLLOW_T_SUPER_in_literal2822); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // antlr/Fan.g:330:40: T_IT
                    {
                    match(input,T_IT,FOLLOW_T_IT_in_literal2826); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // antlr/Fan.g:330:47: BOOL_VAL
                    {
                    match(input,BOOL_VAL,FOLLOW_BOOL_VAL_in_literal2830); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // antlr/Fan.g:330:58: QUOTSTR
                    {
                    match(input,QUOTSTR,FOLLOW_QUOTSTR_in_literal2834); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // antlr/Fan.g:330:68: STR
                    {
                    match(input,STR,FOLLOW_STR_in_literal2838); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // antlr/Fan.g:330:74: URI
                    {
                    match(input,URI,FOLLOW_URI_in_literal2842); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // antlr/Fan.g:331:4: number
                    {
                    pushFollow(FOLLOW_number_in_literal2849);
                    number();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // antlr/Fan.g:331:13: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_literal2853); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // antlr/Fan.g:331:20: namedSuper
                    {
                    pushFollow(FOLLOW_namedSuper_in_literal2857);
                    namedSuper();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // antlr/Fan.g:332:4: slotLiteral
                    {
                    pushFollow(FOLLOW_slotLiteral_in_literal2864);
                    slotLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // antlr/Fan.g:332:18: typeLiteral
                    {
                    pushFollow(FOLLOW_typeLiteral_in_literal2868);
                    typeLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // antlr/Fan.g:332:32: list
                    {
                    pushFollow(FOLLOW_list_in_literal2872);
                    list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // antlr/Fan.g:332:39: map
                    {
                    pushFollow(FOLLOW_map_in_literal2876);
                    map();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 16 :
                    // antlr/Fan.g:332:45: simple
                    {
                    pushFollow(FOLLOW_simple_in_literal2880);
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
    // antlr/Fan.g:333:1: typeLiteral : type {...}? POUND ;
    public final void typeLiteral() throws RecognitionException {
        int typeLiteral_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return ; }
            // antlr/Fan.g:333:13: ( type {...}? POUND )
            // antlr/Fan.g:333:17: type {...}? POUND
            {
            pushFollow(FOLLOW_type_in_typeLiteral2889);
            type();

            state._fsp--;
            if (state.failed) return ;
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "typeLiteral", "notAfterEol()");
            }
            match(input,POUND,FOLLOW_POUND_in_typeLiteral2893); if (state.failed) return ;

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
    // antlr/Fan.g:334:1: slotLiteral : ( type )? POUND {...}? id ;
    public final void slotLiteral() throws RecognitionException {
        int slotLiteral_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return ; }
            // antlr/Fan.g:334:13: ( ( type )? POUND {...}? id )
            // antlr/Fan.g:334:17: ( type )? POUND {...}? id
            {
            // antlr/Fan.g:334:17: ( type )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==SQ_BRACKET_L||LA133_0==PIPE||LA133_0==ID) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_slotLiteral2902);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,POUND,FOLLOW_POUND_in_slotLiteral2905); if (state.failed) return ;
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "slotLiteral", "notAfterEol()");
            }
            pushFollow(FOLLOW_id_in_slotLiteral2909);
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
    // antlr/Fan.g:335:1: namedSuper : simpleType DOT T_SUPER ;
    public final void namedSuper() throws RecognitionException {
        int namedSuper_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return ; }
            // antlr/Fan.g:335:13: ( simpleType DOT T_SUPER )
            // antlr/Fan.g:335:15: simpleType DOT T_SUPER
            {
            pushFollow(FOLLOW_simpleType_in_namedSuper2917);
            simpleType();

            state._fsp--;
            if (state.failed) return ;
            match(input,DOT,FOLLOW_DOT_in_namedSuper2919); if (state.failed) return ;
            match(input,T_SUPER,FOLLOW_T_SUPER_in_namedSuper2921); if (state.failed) return ;

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
    // antlr/Fan.g:336:1: list : ( type {...}?)? SQ_BRACKET_L listItems SQ_BRACKET_R ;
    public final void list() throws RecognitionException {
        int list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return ; }
            // antlr/Fan.g:336:8: ( ( type {...}?)? SQ_BRACKET_L listItems SQ_BRACKET_R )
            // antlr/Fan.g:336:10: ( type {...}?)? SQ_BRACKET_L listItems SQ_BRACKET_R
            {
            // antlr/Fan.g:336:10: ( type {...}?)?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==SQ_BRACKET_L) ) {
                int LA134_1 = input.LA(2);

                if ( (synpred241_Fan()) ) {
                    alt134=1;
                }
            }
            else if ( (LA134_0==PIPE||LA134_0==ID) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // antlr/Fan.g:336:11: type {...}?
                    {
                    pushFollow(FOLLOW_type_in_list2931);
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

            match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_list2937); if (state.failed) return ;
            pushFollow(FOLLOW_listItems_in_list2939);
            listItems();

            state._fsp--;
            if (state.failed) return ;
            match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_list2941); if (state.failed) return ;

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
    // antlr/Fan.g:337:1: listItems : ( ( expr ( COMMA expr )* ( COMMA )? ) | COMMA );
    public final void listItems() throws RecognitionException {
        int listItems_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return ; }
            // antlr/Fan.g:337:12: ( ( expr ( COMMA expr )* ( COMMA )? ) | COMMA )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( ((LA137_0>=T_THIS && LA137_0<=T_SUPER)||(LA137_0>=T_NULL && LA137_0<=T_IT)||LA137_0==SQ_BRACKET_L||LA137_0==PAR_L||LA137_0==PIPE||LA137_0==CURRY||(LA137_0>=AT && LA137_0<=POUND)||(LA137_0>=MINUS && LA137_0<=NUMBER)||LA137_0==121||(LA137_0>=125 && LA137_0<=128)) ) {
                alt137=1;
            }
            else if ( (LA137_0==COMMA) ) {
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
                    // antlr/Fan.g:337:14: ( expr ( COMMA expr )* ( COMMA )? )
                    {
                    // antlr/Fan.g:337:14: ( expr ( COMMA expr )* ( COMMA )? )
                    // antlr/Fan.g:337:15: expr ( COMMA expr )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_listItems2950);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    // antlr/Fan.g:337:20: ( COMMA expr )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==COMMA) ) {
                            int LA135_1 = input.LA(2);

                            if ( ((LA135_1>=T_THIS && LA135_1<=T_SUPER)||(LA135_1>=T_NULL && LA135_1<=T_IT)||LA135_1==SQ_BRACKET_L||LA135_1==PAR_L||LA135_1==PIPE||LA135_1==CURRY||(LA135_1>=AT && LA135_1<=POUND)||(LA135_1>=MINUS && LA135_1<=NUMBER)||LA135_1==121||(LA135_1>=125 && LA135_1<=128)) ) {
                                alt135=1;
                            }


                        }


                        switch (alt135) {
                    	case 1 :
                    	    // antlr/Fan.g:337:21: COMMA expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_listItems2953); if (state.failed) return ;
                    	    pushFollow(FOLLOW_expr_in_listItems2955);
                    	    expr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    // antlr/Fan.g:337:35: ( COMMA )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==COMMA) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // antlr/Fan.g:0:0: COMMA
                            {
                            match(input,COMMA,FOLLOW_COMMA_in_listItems2960); if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // antlr/Fan.g:337:45: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_listItems2966); if (state.failed) return ;

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
    // antlr/Fan.g:338:1: map : ( mapType {...}?)? SQ_BRACKET_L mapItems SQ_BRACKET_R ;
    public final void map() throws RecognitionException {
        int map_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return ; }
            // antlr/Fan.g:338:7: ( ( mapType {...}?)? SQ_BRACKET_L mapItems SQ_BRACKET_R )
            // antlr/Fan.g:338:9: ( mapType {...}?)? SQ_BRACKET_L mapItems SQ_BRACKET_R
            {
            // antlr/Fan.g:338:9: ( mapType {...}?)?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==SQ_BRACKET_L) ) {
                int LA138_1 = input.LA(2);

                if ( (synpred245_Fan()) ) {
                    alt138=1;
                }
            }
            else if ( (LA138_0==PIPE||LA138_0==ID) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // antlr/Fan.g:338:10: mapType {...}?
                    {
                    pushFollow(FOLLOW_mapType_in_map2976);
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

            match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_map2982); if (state.failed) return ;
            pushFollow(FOLLOW_mapItems_in_map2984);
            mapItems();

            state._fsp--;
            if (state.failed) return ;
            match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_map2986); if (state.failed) return ;

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
    // antlr/Fan.g:339:1: mapItems : ( ( mapPair ( COMMA mapPair )* ( COMMA )? ) | COLON );
    public final void mapItems() throws RecognitionException {
        int mapItems_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return ; }
            // antlr/Fan.g:339:11: ( ( mapPair ( COMMA mapPair )* ( COMMA )? ) | COLON )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( ((LA141_0>=T_THIS && LA141_0<=T_SUPER)||(LA141_0>=T_NULL && LA141_0<=T_IT)||LA141_0==SQ_BRACKET_L||LA141_0==PAR_L||LA141_0==PIPE||LA141_0==CURRY||(LA141_0>=AT && LA141_0<=POUND)||(LA141_0>=MINUS && LA141_0<=NUMBER)||LA141_0==121||(LA141_0>=125 && LA141_0<=128)) ) {
                alt141=1;
            }
            else if ( (LA141_0==COLON) ) {
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
                    // antlr/Fan.g:339:13: ( mapPair ( COMMA mapPair )* ( COMMA )? )
                    {
                    // antlr/Fan.g:339:13: ( mapPair ( COMMA mapPair )* ( COMMA )? )
                    // antlr/Fan.g:339:14: mapPair ( COMMA mapPair )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_mapPair_in_mapItems2995);
                    mapPair();

                    state._fsp--;
                    if (state.failed) return ;
                    // antlr/Fan.g:339:22: ( COMMA mapPair )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==COMMA) ) {
                            int LA139_1 = input.LA(2);

                            if ( ((LA139_1>=T_THIS && LA139_1<=T_SUPER)||(LA139_1>=T_NULL && LA139_1<=T_IT)||LA139_1==SQ_BRACKET_L||LA139_1==PAR_L||LA139_1==PIPE||LA139_1==CURRY||(LA139_1>=AT && LA139_1<=POUND)||(LA139_1>=MINUS && LA139_1<=NUMBER)||LA139_1==121||(LA139_1>=125 && LA139_1<=128)) ) {
                                alt139=1;
                            }


                        }


                        switch (alt139) {
                    	case 1 :
                    	    // antlr/Fan.g:339:23: COMMA mapPair
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_mapItems2998); if (state.failed) return ;
                    	    pushFollow(FOLLOW_mapPair_in_mapItems3000);
                    	    mapPair();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    // antlr/Fan.g:339:39: ( COMMA )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==COMMA) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // antlr/Fan.g:0:0: COMMA
                            {
                            match(input,COMMA,FOLLOW_COMMA_in_mapItems3004); if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // antlr/Fan.g:339:49: COLON
                    {
                    match(input,COLON,FOLLOW_COLON_in_mapItems3010); if (state.failed) return ;

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
    // antlr/Fan.g:340:1: mapPair : expr COLON expr ;
    public final void mapPair() throws RecognitionException {
        int mapPair_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return ; }
            // antlr/Fan.g:340:10: ( expr COLON expr )
            // antlr/Fan.g:340:12: expr COLON expr
            {
            pushFollow(FOLLOW_expr_in_mapPair3018);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_mapPair3020); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_mapPair3022);
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
    // antlr/Fan.g:341:1: simple : type PAR_L expr PAR_R ;
    public final void simple() throws RecognitionException {
        int simple_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return ; }
            // antlr/Fan.g:341:9: ( type PAR_L expr PAR_R )
            // antlr/Fan.g:341:11: type PAR_L expr PAR_R
            {
            pushFollow(FOLLOW_type_in_simple3030);
            type();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_L,FOLLOW_PAR_L_in_simple3032); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_simple3034);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,PAR_R,FOLLOW_PAR_R_in_simple3036); if (state.failed) return ;

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
    // antlr/Fan.g:343:1: docs : ( DOC )* ;
    public final void docs() throws RecognitionException {
        int docs_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return ; }
            // antlr/Fan.g:343:7: ( ( DOC )* )
            // antlr/Fan.g:343:9: ( DOC )*
            {
            // antlr/Fan.g:343:9: ( DOC )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==DOC) ) {
                    int LA142_2 = input.LA(2);

                    if ( (synpred249_Fan()) ) {
                        alt142=1;
                    }


                }


                switch (alt142) {
            	case 1 :
            	    // antlr/Fan.g:0:0: DOC
            	    {
            	    match(input,DOC,FOLLOW_DOC_in_docs3045); if (state.failed) return ;

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
    // antlr/Fan.g:345:1: number : ( MINUS )? NUMBER ;
    public final void number() throws RecognitionException {
        int number_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return ; }
            // antlr/Fan.g:345:9: ( ( MINUS )? NUMBER )
            // antlr/Fan.g:345:12: ( MINUS )? NUMBER
            {
            // antlr/Fan.g:345:12: ( MINUS )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==MINUS) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // antlr/Fan.g:0:0: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_number3056); if (state.failed) return ;

                    }
                    break;

            }

            match(input,NUMBER,FOLLOW_NUMBER_in_number3059); if (state.failed) return ;

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
    // antlr/Fan.g:346:1: facet : AT id ( EQUAL expr )? ;
    public final void facet() throws RecognitionException {
        int facet_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return ; }
            // antlr/Fan.g:346:8: ( AT id ( EQUAL expr )? )
            // antlr/Fan.g:346:10: AT id ( EQUAL expr )?
            {
            match(input,AT,FOLLOW_AT_in_facet3067); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_facet3069);
            id();

            state._fsp--;
            if (state.failed) return ;
            // antlr/Fan.g:346:16: ( EQUAL expr )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==EQUAL) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // antlr/Fan.g:346:17: EQUAL expr
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_facet3072); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_facet3074);
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
    // antlr/Fan.g:349:1: eos : ( SEMI | {...}?);
    public final void eos() throws RecognitionException {
        int eos_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return ; }
            // antlr/Fan.g:349:6: ( SEMI | {...}?)
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==SEMI) ) {
                int LA145_1 = input.LA(2);

                if ( (synpred252_Fan()) ) {
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
            else if ( (LA145_0==EOF||(LA145_0>=T_BREAK && LA145_0<=T_USING)||(LA145_0>=T_RD_ONLY && LA145_0<=T_ELSE)||(LA145_0>=T_NULL && LA145_0<=T_IT)||LA145_0==SQ_BRACKET_L||LA145_0==BRACKET_R||(LA145_0>=COMMA && LA145_0<=PAR_L)||LA145_0==PIPE||LA145_0==CURRY||(LA145_0>=AT && LA145_0<=NUMBER)||LA145_0==121||(LA145_0>=125 && LA145_0<=128)) ) {
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
                    // antlr/Fan.g:349:8: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_eos3086); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:349:15: {...}?
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
    // antlr/Fan.g:351:1: id : ID ;
    public final void id() throws RecognitionException {
        int id_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return ; }
            // antlr/Fan.g:351:5: ( ID )
            // antlr/Fan.g:351:8: ID
            {
            match(input,ID,FOLLOW_ID_in_id3100); if (state.failed) return ;

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
    // antlr/Fan.g:357:1: getter : t= ID {...}?;
    public final void getter() throws RecognitionException {
        int getter_StartIndex = input.index();
        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return ; }
            // antlr/Fan.g:357:10: (t= ID {...}?)
            // antlr/Fan.g:357:12: t= ID {...}?
            {
            t=(Token)match(input,ID,FOLLOW_ID_in_getter3113); if (state.failed) return ;
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
    // antlr/Fan.g:358:1: setter : t= ID {...}?;
    public final void setter() throws RecognitionException {
        int setter_StartIndex = input.index();
        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return ; }
            // antlr/Fan.g:358:10: (t= ID {...}?)
            // antlr/Fan.g:358:12: t= ID {...}?
            {
            t=(Token)match(input,ID,FOLLOW_ID_in_setter3126); if (state.failed) return ;
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
        // antlr/Fan.g:163:17: ( facet )
        // antlr/Fan.g:163:17: facet
        {
        pushFollow(FOLLOW_facet_in_synpred7_Fan436);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_Fan

    // $ANTLR start synpred9_Fan
    public final void synpred9_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:163:25: ( ( classFlags )* T_CLASS )
        // antlr/Fan.g:163:26: ( classFlags )* T_CLASS
        {
        // antlr/Fan.g:163:26: ( classFlags )*
        loop146:
        do {
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( ((LA146_0>=T_CONST && LA146_0<=T_STATIC)||LA146_0==T_FINAL||(LA146_0>=T_ABSTRACT && LA146_0<=T_INTERNAL)) ) {
                alt146=1;
            }


            switch (alt146) {
        	case 1 :
        	    // antlr/Fan.g:0:0: classFlags
        	    {
        	    pushFollow(FOLLOW_classFlags_in_synpred9_Fan441);
        	    classFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop146;
            }
        } while (true);

        match(input,T_CLASS,FOLLOW_T_CLASS_in_synpred9_Fan444); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Fan

    // $ANTLR start synpred11_Fan
    public final void synpred11_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:164:4: ( ( protection )? T_ENUM )
        // antlr/Fan.g:164:5: ( protection )? T_ENUM
        {
        // antlr/Fan.g:164:5: ( protection )?
        int alt147=2;
        int LA147_0 = input.LA(1);

        if ( ((LA147_0>=T_PRIVATE && LA147_0<=T_INTERNAL)) ) {
            alt147=1;
        }
        switch (alt147) {
            case 1 :
                // antlr/Fan.g:0:0: protection
                {
                pushFollow(FOLLOW_protection_in_synpred11_Fan455);
                protection();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,T_ENUM,FOLLOW_T_ENUM_in_synpred11_Fan458); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_Fan

    // $ANTLR start synpred38_Fan
    public final void synpred38_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:182:28: ( QMARK )
        // antlr/Fan.g:182:28: QMARK
        {
        match(input,QMARK,FOLLOW_QMARK_in_synpred38_Fan747); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_Fan

    // $ANTLR start synpred39_Fan
    public final void synpred39_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:182:41: ( QMARK )
        // antlr/Fan.g:182:41: QMARK
        {
        match(input,QMARK,FOLLOW_QMARK_in_synpred39_Fan753); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_Fan

    // $ANTLR start synpred40_Fan
    public final void synpred40_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:182:36: ( '[]' ( QMARK )? )
        // antlr/Fan.g:182:36: '[]' ( QMARK )?
        {
        match(input,97,FOLLOW_97_in_synpred40_Fan751); if (state.failed) return ;
        // antlr/Fan.g:182:41: ( QMARK )?
        int alt149=2;
        int LA149_0 = input.LA(1);

        if ( (LA149_0==QMARK) ) {
            alt149=1;
        }
        switch (alt149) {
            case 1 :
                // antlr/Fan.g:0:0: QMARK
                {
                match(input,QMARK,FOLLOW_QMARK_in_synpred40_Fan753); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred40_Fan

    // $ANTLR start synpred42_Fan
    public final void synpred42_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:184:12: ( mapType )
        // antlr/Fan.g:184:12: mapType
        {
        pushFollow(FOLLOW_mapType_in_synpred42_Fan775);
        mapType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_Fan

    // $ANTLR start synpred48_Fan
    public final void synpred48_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:188:6: ({...}? COLON {...}? type )
        // antlr/Fan.g:188:6: {...}? COLON {...}? type
        {
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_Fan", "notAfterEol()");
        }
        match(input,COLON,FOLLOW_COLON_in_synpred48_Fan832); if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_Fan", "notAfterEol()");
        }
        pushFollow(FOLLOW_type_in_synpred48_Fan836);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Fan

    // $ANTLR start synpred49_Fan
    public final void synpred49_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:188:53: ( SQ_BRACKET_R )
        // antlr/Fan.g:188:53: SQ_BRACKET_R
        {
        match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_synpred49_Fan840); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_Fan

    // $ANTLR start synpred51_Fan
    public final void synpred51_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:189:37: ( ARROW )
        // antlr/Fan.g:189:38: ARROW
        {
        match(input,ARROW,FOLLOW_ARROW_in_synpred51_Fan861); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_Fan

    // $ANTLR start synpred53_Fan
    public final void synpred53_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:189:65: ( ARROW )
        // antlr/Fan.g:189:66: ARROW
        {
        match(input,ARROW,FOLLOW_ARROW_in_synpred53_Fan873); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_Fan

    // $ANTLR start synpred55_Fan
    public final void synpred55_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:192:11: ( formalFull )
        // antlr/Fan.g:192:11: formalFull
        {
        pushFollow(FOLLOW_formalFull_in_synpred55_Fan914);
        formalFull();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_Fan

    // $ANTLR start synpred56_Fan
    public final void synpred56_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:192:24: ( formalTypeOnly )
        // antlr/Fan.g:192:24: formalTypeOnly
        {
        pushFollow(FOLLOW_formalTypeOnly_in_synpred56_Fan918);
        formalTypeOnly();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_Fan

    // $ANTLR start synpred57_Fan
    public final void synpred57_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:196:13: ( T_STATIC BRACKET_L )
        // antlr/Fan.g:196:14: T_STATIC BRACKET_L
        {
        match(input,T_STATIC,FOLLOW_T_STATIC_in_synpred57_Fan966); if (state.failed) return ;
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred57_Fan968); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_Fan

    // $ANTLR start synpred58_Fan
    public final void synpred58_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:197:11: ( facet )
        // antlr/Fan.g:197:11: facet
        {
        pushFollow(FOLLOW_facet_in_synpred58_Fan982);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_Fan

    // $ANTLR start synpred60_Fan
    public final void synpred60_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:199:7: ( ( ctorFlags )* T_NEW )
        // antlr/Fan.g:199:8: ( ctorFlags )* T_NEW
        {
        // antlr/Fan.g:199:8: ( ctorFlags )*
        loop152:
        do {
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( ((LA152_0>=T_PRIVATE && LA152_0<=T_INTERNAL)) ) {
                alt152=1;
            }


            switch (alt152) {
        	case 1 :
        	    // antlr/Fan.g:0:0: ctorFlags
        	    {
        	    pushFollow(FOLLOW_ctorFlags_in_synpred60_Fan999);
        	    ctorFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop152;
            }
        } while (true);

        match(input,T_NEW,FOLLOW_T_NEW_in_synpred60_Fan1002); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_Fan

    // $ANTLR start synpred63_Fan
    public final void synpred63_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:200:7: ( ( methodFlags )* ( type | T_VOID ) id PAR_L )
        // antlr/Fan.g:200:8: ( methodFlags )* ( type | T_VOID ) id PAR_L
        {
        // antlr/Fan.g:200:8: ( methodFlags )*
        loop153:
        do {
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( ((LA153_0>=T_STATIC && LA153_0<=T_NATIVE)||(LA153_0>=T_OVERRIDE && LA153_0<=T_FINAL)||(LA153_0>=T_ABSTRACT && LA153_0<=T_INTERNAL)||LA153_0==T_ONCE) ) {
                alt153=1;
            }


            switch (alt153) {
        	case 1 :
        	    // antlr/Fan.g:0:0: methodFlags
        	    {
        	    pushFollow(FOLLOW_methodFlags_in_synpred63_Fan1016);
        	    methodFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop153;
            }
        } while (true);

        // antlr/Fan.g:200:21: ( type | T_VOID )
        int alt154=2;
        int LA154_0 = input.LA(1);

        if ( (LA154_0==SQ_BRACKET_L||LA154_0==PIPE||LA154_0==ID) ) {
            alt154=1;
        }
        else if ( (LA154_0==T_VOID) ) {
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
                // antlr/Fan.g:200:22: type
                {
                pushFollow(FOLLOW_type_in_synpred63_Fan1020);
                type();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // antlr/Fan.g:200:29: T_VOID
                {
                match(input,T_VOID,FOLLOW_T_VOID_in_synpred63_Fan1024); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_id_in_synpred63_Fan1027);
        id();

        state._fsp--;
        if (state.failed) return ;
        match(input,PAR_L,FOLLOW_PAR_L_in_synpred63_Fan1029); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_Fan

    // $ANTLR start synpred67_Fan
    public final void synpred67_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:207:30: ( getter )
        // antlr/Fan.g:207:30: getter
        {
        pushFollow(FOLLOW_getter_in_synpred67_Fan1101);
        getter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_Fan

    // $ANTLR start synpred69_Fan
    public final void synpred69_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:207:53: ( block )
        // antlr/Fan.g:207:53: block
        {
        pushFollow(FOLLOW_block_in_synpred69_Fan1111);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Fan

    // $ANTLR start synpred72_Fan
    public final void synpred72_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:210:12: ( type id )
        // antlr/Fan.g:210:13: type id
        {
        pushFollow(FOLLOW_type_in_synpred72_Fan1137);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_id_in_synpred72_Fan1139);
        id();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_Fan

    // $ANTLR start synpred100_Fan
    public final void synpred100_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:219:64: ( COLON )
        // antlr/Fan.g:219:65: COLON
        {
        match(input,COLON,FOLLOW_COLON_in_synpred100_Fan1354); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_Fan

    // $ANTLR start synpred105_Fan
    public final void synpred105_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:227:12: ( BRACKET_L )
        // antlr/Fan.g:227:13: BRACKET_L
        {
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred105_Fan1444); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_Fan

    // $ANTLR start synpred116_Fan
    public final void synpred116_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:231:22: ( exprStmt )
        // antlr/Fan.g:231:22: exprStmt
        {
        pushFollow(FOLLOW_exprStmt_in_synpred116_Fan1517);
        exprStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred116_Fan

    // $ANTLR start synpred120_Fan
    public final void synpred120_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:242:6: ( T_ELSE block )
        // antlr/Fan.g:242:6: T_ELSE block
        {
        match(input,T_ELSE,FOLLOW_T_ELSE_in_synpred120_Fan1596); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred120_Fan1598);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_Fan

    // $ANTLR start synpred121_Fan
    public final void synpred121_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:243:22: ( eos )
        // antlr/Fan.g:243:22: eos
        {
        pushFollow(FOLLOW_eos_in_synpred121_Fan1610);
        eos();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred121_Fan

    // $ANTLR start synpred124_Fan
    public final void synpred124_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:247:17: ( BRACKET_L )
        // antlr/Fan.g:247:18: BRACKET_L
        {
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred124_Fan1684); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_Fan

    // $ANTLR start synpred125_Fan
    public final void synpred125_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:247:41: ( stmt )
        // antlr/Fan.g:247:41: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred125_Fan1691);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_Fan

    // $ANTLR start synpred126_Fan
    public final void synpred126_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:247:49: ( T_CATCH )
        // antlr/Fan.g:247:50: T_CATCH
        {
        match(input,T_CATCH,FOLLOW_T_CATCH_in_synpred126_Fan1697); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred126_Fan

    // $ANTLR start synpred127_Fan
    public final void synpred127_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:247:71: ( T_FINALLY )
        // antlr/Fan.g:247:72: T_FINALLY
        {
        match(input,T_FINALLY,FOLLOW_T_FINALLY_in_synpred127_Fan1706); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred127_Fan

    // $ANTLR start synpred130_Fan
    public final void synpred130_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:251:12: ( forInitDef )
        // antlr/Fan.g:251:12: forInitDef
        {
        pushFollow(FOLLOW_forInitDef_in_synpred130_Fan1756);
        forInitDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_Fan

    // $ANTLR start synpred132_Fan
    public final void synpred132_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:254:20: ( catchDef )
        // antlr/Fan.g:254:20: catchDef
        {
        pushFollow(FOLLOW_catchDef_in_synpred132_Fan1785);
        catchDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred132_Fan

    // $ANTLR start synpred133_Fan
    public final void synpred133_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:254:31: ( BRACKET_L )
        // antlr/Fan.g:254:32: BRACKET_L
        {
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred133_Fan1790); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_Fan

    // $ANTLR start synpred134_Fan
    public final void synpred134_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:254:57: ( stmt )
        // antlr/Fan.g:254:57: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred134_Fan1797);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred134_Fan

    // $ANTLR start synpred136_Fan
    public final void synpred136_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:258:24: ( BRACKET_L )
        // antlr/Fan.g:258:25: BRACKET_L
        {
        match(input,BRACKET_L,FOLLOW_BRACKET_L_in_synpred136_Fan1837); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_Fan

    // $ANTLR start synpred137_Fan
    public final void synpred137_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:258:52: ( stmt )
        // antlr/Fan.g:258:52: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred137_Fan1844);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_Fan

    // $ANTLR start synpred174_Fan
    public final void synpred174_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:282:26: ( ( BITOR | PIPE ) bitAndExpr )
        // antlr/Fan.g:282:26: ( BITOR | PIPE ) bitAndExpr
        {
        if ( input.LA(1)==PIPE||input.LA(1)==BITOR ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_bitAndExpr_in_synpred174_Fan2215);
        bitAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred174_Fan

    // $ANTLR start synpred175_Fan
    public final void synpred175_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:283:26: ( '&' shiftExpr )
        // antlr/Fan.g:283:26: '&' shiftExpr
        {
        match(input,CURRY,FOLLOW_CURRY_in_synpred175_Fan2229); if (state.failed) return ;
        pushFollow(FOLLOW_shiftExpr_in_synpred175_Fan2231);
        shiftExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred175_Fan

    // $ANTLR start synpred179_Fan
    public final void synpred179_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:285:22: ( ( '+' | '-' ) multExpr )
        // antlr/Fan.g:285:22: ( '+' | '-' ) multExpr
        {
        if ( input.LA(1)==MINUS||input.LA(1)==121 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_multExpr_in_synpred179_Fan2276);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred179_Fan

    // $ANTLR start synpred184_Fan
    public final void synpred184_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:288:14: ( castExpr )
        // antlr/Fan.g:288:14: castExpr
        {
        pushFollow(FOLLOW_castExpr_in_synpred184_Fan2328);
        castExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred184_Fan

    // $ANTLR start synpred185_Fan
    public final void synpred185_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:288:25: ( groupedExpr )
        // antlr/Fan.g:288:25: groupedExpr
        {
        pushFollow(FOLLOW_groupedExpr_in_synpred185_Fan2332);
        groupedExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred185_Fan

    // $ANTLR start synpred186_Fan
    public final void synpred186_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:292:33: ( termChain )
        // antlr/Fan.g:292:33: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred186_Fan2368);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred186_Fan

    // $ANTLR start synpred187_Fan
    public final void synpred187_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:293:14: ( prefixExpr )
        // antlr/Fan.g:293:14: prefixExpr
        {
        pushFollow(FOLLOW_prefixExpr_in_synpred187_Fan2377);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred187_Fan

    // $ANTLR start synpred188_Fan
    public final void synpred188_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:293:27: ( postfixExpr )
        // antlr/Fan.g:293:27: postfixExpr
        {
        pushFollow(FOLLOW_postfixExpr_in_synpred188_Fan2381);
        postfixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred188_Fan

    // $ANTLR start synpred196_Fan
    public final void synpred196_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:296:22: ( termChain )
        // antlr/Fan.g:296:22: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred196_Fan2449);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred196_Fan

    // $ANTLR start synpred197_Fan
    public final void synpred197_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:298:13: ( idExprReq )
        // antlr/Fan.g:298:13: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred197_Fan2459);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred197_Fan

    // $ANTLR start synpred198_Fan
    public final void synpred198_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:298:25: ( literal )
        // antlr/Fan.g:298:25: literal
        {
        pushFollow(FOLLOW_literal_in_synpred198_Fan2463);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred198_Fan

    // $ANTLR start synpred199_Fan
    public final void synpred199_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:298:35: ( typeBase )
        // antlr/Fan.g:298:35: typeBase
        {
        pushFollow(FOLLOW_typeBase_in_synpred199_Fan2467);
        typeBase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred199_Fan

    // $ANTLR start synpred200_Fan
    public final void synpred200_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:299:12: ( typeLiteral )
        // antlr/Fan.g:299:12: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred200_Fan2478);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred200_Fan

    // $ANTLR start synpred201_Fan
    public final void synpred201_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:299:26: ( slotLiteral )
        // antlr/Fan.g:299:26: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred201_Fan2482);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred201_Fan

    // $ANTLR start synpred202_Fan
    public final void synpred202_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:299:40: ( namedSuper )
        // antlr/Fan.g:299:40: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred202_Fan2486);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred202_Fan

    // $ANTLR start synpred203_Fan
    public final void synpred203_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:299:53: ( staticCall )
        // antlr/Fan.g:299:53: staticCall
        {
        pushFollow(FOLLOW_staticCall_in_synpred203_Fan2490);
        staticCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred203_Fan

    // $ANTLR start synpred204_Fan
    public final void synpred204_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:300:19: ( dsl )
        // antlr/Fan.g:300:19: dsl
        {
        pushFollow(FOLLOW_dsl_in_synpred204_Fan2512);
        dsl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred204_Fan

    // $ANTLR start synpred205_Fan
    public final void synpred205_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:300:25: ( closure )
        // antlr/Fan.g:300:25: closure
        {
        pushFollow(FOLLOW_closure_in_synpred205_Fan2516);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred205_Fan

    // $ANTLR start synpred206_Fan
    public final void synpred206_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:300:35: ( simple )
        // antlr/Fan.g:300:35: simple
        {
        pushFollow(FOLLOW_simple_in_synpred206_Fan2520);
        simple();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred206_Fan

    // $ANTLR start synpred217_Fan
    public final void synpred217_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:316:47: ( closure )
        // antlr/Fan.g:316:47: closure
        {
        pushFollow(FOLLOW_closure_in_synpred217_Fan2692);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred217_Fan

    // $ANTLR start synpred219_Fan
    public final void synpred219_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:319:12: ( idExprReq )
        // antlr/Fan.g:319:12: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred219_Fan2720);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred219_Fan

    // $ANTLR start synpred221_Fan
    public final void synpred221_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:325:13: ( ( callParams closure ) )
        // antlr/Fan.g:325:13: ( callParams closure )
        {
        // antlr/Fan.g:325:13: ( callParams closure )
        // antlr/Fan.g:325:14: callParams closure
        {
        pushFollow(FOLLOW_callParams_in_synpred221_Fan2761);
        callParams();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_closure_in_synpred221_Fan2763);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred221_Fan

    // $ANTLR start synpred222_Fan
    public final void synpred222_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:325:36: ( callParams )
        // antlr/Fan.g:325:36: callParams
        {
        pushFollow(FOLLOW_callParams_in_synpred222_Fan2768);
        callParams();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred222_Fan

    // $ANTLR start synpred235_Fan
    public final void synpred235_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:331:20: ( namedSuper )
        // antlr/Fan.g:331:20: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred235_Fan2857);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred235_Fan

    // $ANTLR start synpred236_Fan
    public final void synpred236_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:332:4: ( slotLiteral )
        // antlr/Fan.g:332:4: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred236_Fan2864);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred236_Fan

    // $ANTLR start synpred237_Fan
    public final void synpred237_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:332:18: ( typeLiteral )
        // antlr/Fan.g:332:18: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred237_Fan2868);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred237_Fan

    // $ANTLR start synpred238_Fan
    public final void synpred238_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:332:32: ( list )
        // antlr/Fan.g:332:32: list
        {
        pushFollow(FOLLOW_list_in_synpred238_Fan2872);
        list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred238_Fan

    // $ANTLR start synpred239_Fan
    public final void synpred239_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:332:39: ( map )
        // antlr/Fan.g:332:39: map
        {
        pushFollow(FOLLOW_map_in_synpred239_Fan2876);
        map();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred239_Fan

    // $ANTLR start synpred241_Fan
    public final void synpred241_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:336:11: ( type {...}?)
        // antlr/Fan.g:336:11: type {...}?
        {
        pushFollow(FOLLOW_type_in_synpred241_Fan2931);
        type();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred241_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred241_Fan

    // $ANTLR start synpred245_Fan
    public final void synpred245_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:338:10: ( mapType {...}?)
        // antlr/Fan.g:338:10: mapType {...}?
        {
        pushFollow(FOLLOW_mapType_in_synpred245_Fan2976);
        mapType();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred245_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred245_Fan

    // $ANTLR start synpred249_Fan
    public final void synpred249_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:343:9: ( DOC )
        // antlr/Fan.g:343:9: DOC
        {
        match(input,DOC,FOLLOW_DOC_in_synpred249_Fan3045); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred249_Fan

    // $ANTLR start synpred252_Fan
    public final void synpred252_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:349:8: ( SEMI )
        // antlr/Fan.g:349:8: SEMI
        {
        match(input,SEMI,FOLLOW_SEMI_in_synpred252_Fan3086); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred252_Fan

    // Delegated rules

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
    public final boolean synpred217_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred217_Fan_fragment(); // can never throw exception
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
    public final boolean synpred175_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred175_Fan_fragment(); // can never throw exception
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
    public final boolean synpred219_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred219_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred204_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred204_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred239_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred239_Fan_fragment(); // can never throw exception
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
    public final boolean synpred245_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred245_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred238_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred238_Fan_fragment(); // can never throw exception
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
    public final boolean synpred241_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred241_Fan_fragment(); // can never throw exception
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
    public final boolean synpred196_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred196_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred202_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred202_Fan_fragment(); // can never throw exception
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
    public final boolean synpred197_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred197_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred199_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred199_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred174_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred174_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred249_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred249_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred235_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred235_Fan_fragment(); // can never throw exception
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
    public final boolean synpred236_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred236_Fan_fragment(); // can never throw exception
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
    public final boolean synpred252_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred252_Fan_fragment(); // can never throw exception
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
    public final boolean synpred198_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred198_Fan_fragment(); // can never throw exception
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
    public final boolean synpred179_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred179_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred200_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred200_Fan_fragment(); // can never throw exception
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
        "\2\114\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\3\4\uffff\1\3\1\uffff\10\3\40\uffff\1\3\7\uffff\1\1",
            "\2\3\4\uffff\1\3\1\uffff\10\3\40\uffff\1\3\7\uffff\1\1",
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
            return "()* loopback of 153:18: ( typeDef )*";
        }
    }
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\3\uffff\1\7\5\uffff\1\7\1\13\2\uffff";
    static final String DFA3_minS =
        "\1\21\1\57\1\105\1\21\1\60\2\105\1\uffff\1\105\2\21\2\uffff";
    static final String DFA3_maxS =
        "\1\21\2\105\1\114\1\60\2\105\1\uffff\1\105\2\114\2\uffff";
    static final String DFA3_acceptS =
        "\7\uffff\1\1\3\uffff\1\2\1\3";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2\25\uffff\1\3",
            "\1\4",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\11\uffff\1\6\1\5"+
            "\14\uffff\1\7\10\uffff\1\7\7\uffff\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            "\1\3",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\11\uffff\1\6\1\5"+
            "\14\uffff\1\7\10\uffff\1\7\7\uffff\1\7",
            "\1\13\1\14\1\uffff\2\13\4\uffff\1\13\1\uffff\10\13\27\uffff"+
            "\1\13\10\uffff\1\13\7\uffff\1\13",
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
            return "154:10: ( usingPod | usingType | usingAs )";
        }
    }
    static final String DFA7_eotS =
        "\13\uffff";
    static final String DFA7_eofS =
        "\13\uffff";
    static final String DFA7_minS =
        "\1\24\3\0\1\uffff\3\0\3\uffff";
    static final String DFA7_maxS =
        "\1\114\3\0\1\uffff\3\0\3\uffff";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\3\uffff\1\1\1\2\1\3";
    static final String DFA7_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\3\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\6\1\7\4\uffff\1\5\1\uffff\1\10\1\11\1\12\1\4\4\3\40\uffff"+
            "\1\2\7\uffff\1\1",
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
            return "163:24: ( ( ( classFlags )* T_CLASS )=> classDef | ( ( protection )? T_ENUM )=> enumDef | mixinDef )";
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

                        else if ( ((LA7_0>=T_PRIVATE && LA7_0<=T_INTERNAL)) ) {s = 3;}

                        else if ( (LA7_0==T_ABSTRACT) && (synpred9_Fan())) {s = 4;}

                        else if ( (LA7_0==T_FINAL) ) {s = 5;}

                        else if ( (LA7_0==T_CONST) ) {s = 6;}

                        else if ( (LA7_0==T_STATIC) ) {s = 7;}

                        else if ( (LA7_0==T_CLASS) && (synpred9_Fan())) {s = 8;}

                        else if ( (LA7_0==T_ENUM) && (synpred11_Fan())) {s = 9;}

                        else if ( (LA7_0==T_MIXIN) ) {s = 10;}

                         
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
        "\1\114\1\0\22\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA44_specialS =
        "\1\uffff\1\0\22\uffff}>";
    static final String[] DFA44_transitionS = {
            "\2\2\1\1\6\2\3\uffff\7\2\11\uffff\1\2\10\uffff\1\2\13\uffff"+
            "\2\2\6\uffff\1\2",
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
            return "196:12: ( ( T_STATIC BRACKET_L )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* T_NEW )=> ctorDef | ( ( methodFlags )* ( type | T_VOID ) id PAR_L )=> methodDef | fieldDef ) ) )";
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
        "\1\114\3\0\1\uffff\4\0\1\uffff\5\0\4\uffff";
    static final String DFA43_acceptS =
        "\4\uffff\1\1\4\uffff\1\2\5\uffff\1\2\1\3\2\uffff";
    static final String DFA43_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12"+
        "\1\13\1\14\4\uffff}>";
    static final String[] DFA43_transitionS = {
            "\2\20\1\10\1\12\1\20\1\6\1\5\1\13\1\17\3\uffff\1\7\4\3\1\4\1"+
            "\11\11\uffff\1\14\10\uffff\1\15\13\uffff\1\2\1\16\6\uffff\1"+
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
            return "198:6: ( ( ( ctorFlags )* T_NEW )=> ctorDef | ( ( methodFlags )* ( type | T_VOID ) id PAR_L )=> methodDef | fieldDef )";
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

                        else if ( ((LA43_0>=T_PRIVATE && LA43_0<=T_INTERNAL)) ) {s = 3;}

                        else if ( (LA43_0==T_NEW) && (synpred60_Fan())) {s = 4;}

                        else if ( (LA43_0==T_VIRTUAL) ) {s = 5;}

                        else if ( (LA43_0==T_OVERRIDE) ) {s = 6;}

                        else if ( (LA43_0==T_ABSTRACT) ) {s = 7;}

                        else if ( (LA43_0==T_STATIC) ) {s = 8;}

                        else if ( (LA43_0==T_ONCE) && (synpred63_Fan())) {s = 9;}

                        else if ( (LA43_0==T_NATIVE) ) {s = 10;}

                        else if ( (LA43_0==T_FINAL) ) {s = 11;}

                        else if ( (LA43_0==SQ_BRACKET_L) ) {s = 12;}

                        else if ( (LA43_0==PIPE) ) {s = 13;}

                        else if ( (LA43_0==ID) ) {s = 14;}

                        else if ( (LA43_0==T_VOID) && (synpred63_Fan())) {s = 15;}

                        else if ( ((LA43_0>=T_RD_ONLY && LA43_0<=T_CONST)||LA43_0==T_VOLATILE) ) {s = 16;}

                         
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
        "\1\57\2\uffff\1\4\1\uffff\1\0\4\uffff";
    static final String DFA53_maxS =
        "\1\105\2\uffff\1\u0080\1\uffff\1\0\4\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\2\1\1\uffff\1\2\1\uffff\4\1";
    static final String DFA53_specialS =
        "\1\0\2\uffff\1\1\1\uffff\1\2\4\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1\10\uffff\1\2\14\uffff\1\3",
            "",
            "",
            "\15\4\2\uffff\11\4\3\uffff\12\4\2\uffff\2\4\1\6\1\uffff\1\4"+
            "\1\uffff\2\4\1\11\2\4\1\uffff\1\7\1\4\1\uffff\2\4\6\uffff\1"+
            "\4\1\uffff\1\4\1\5\11\4\22\uffff\1\10\27\uffff\1\4\3\uffff\4"+
            "\4",
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
            return "210:11: ( ( type id )=> typeAndId | id )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==SQ_BRACKET_L) && (synpred72_Fan())) {s = 1;}

                        else if ( (LA53_0==PIPE) && (synpred72_Fan())) {s = 2;}

                        else if ( (LA53_0==ID) ) {s = 3;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_3 = input.LA(1);

                         
                        int index53_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_3==EOF||(LA53_3>=T_BREAK && LA53_3<=T_FINALLY)||(LA53_3>=T_RD_ONLY && LA53_3<=T_VOID)||(LA53_3>=T_ABSTRACT && LA53_3<=T_ELSE)||(LA53_3>=T_NULL && LA53_3<=T_IT)||LA53_3==SQ_BRACKET_L||(LA53_3>=BRACKET_L && LA53_3<=BRACKET_R)||(LA53_3>=COMMA && LA53_3<=PAR_L)||LA53_3==PIPE||(LA53_3>=INIT_VAL && LA53_3<=SEMI)||LA53_3==CURRY||LA53_3==AT||(LA53_3>=BOOL_VAL && LA53_3<=NUMBER)||LA53_3==121||(LA53_3>=125 && LA53_3<=128)) ) {s = 4;}

                        else if ( (LA53_3==ID) ) {s = 5;}

                        else if ( (LA53_3==COLCOL) && (synpred72_Fan())) {s = 6;}

                        else if ( (LA53_3==QMARK) && (synpred72_Fan())) {s = 7;}

                        else if ( (LA53_3==97) && (synpred72_Fan())) {s = 8;}

                        else if ( (LA53_3==COLON) && (synpred72_Fan())) {s = 9;}

                         
                        input.seek(index53_3);
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
        "\35\uffff";
    static final String DFA73_eofS =
        "\35\uffff";
    static final String DFA73_minS =
        "\1\4\14\uffff\1\0\13\uffff\2\0\2\uffff";
    static final String DFA73_maxS =
        "\1\u0080\14\uffff\1\0\13\uffff\2\0\2\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\21\uffff\1\13";
    static final String DFA73_specialS =
        "\15\uffff\1\0\13\uffff\1\1\1\2\2\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\4\1\5\1\2\1\1\1\6\1\7\1\10\1\3\1\11\31\uffff\2\12\3\uffff"+
            "\2\12\2\uffff\1\31\5\uffff\1\12\2\uffff\1\32\11\uffff\1\12\1"+
            "\uffff\1\12\1\15\6\12\1\uffff\2\12\52\uffff\1\12\3\uffff\4\12",
            "",
            "",
            "",
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
            return "229:10: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )";
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

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_25 = input.LA(1);

                         
                        int index73_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index73_25);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_26 = input.LA(1);

                         
                        int index73_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred116_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index73_26);
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
        "\64\uffff";
    static final String DFA78_eofS =
        "\1\1\63\uffff";
    static final String DFA78_minS =
        "\1\4\13\uffff\22\0\26\uffff";
    static final String DFA78_maxS =
        "\1\u0080\13\uffff\22\0\26\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\61\uffff\1\2";
    static final String DFA78_specialS =
        "\14\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\26\uffff}>";
    static final String[] DFA78_transitionS = {
            "\15\1\2\uffff\11\1\3\uffff\7\1\1\21\1\22\1\1\2\uffff\1\20\1"+
            "\23\2\uffff\1\33\2\uffff\1\1\1\uffff\1\1\1\14\2\uffff\1\34\2"+
            "\uffff\1\1\6\uffff\1\30\1\uffff\1\16\1\17\1\24\1\25\1\26\1\27"+
            "\1\32\1\35\1\1\1\15\1\31\52\uffff\1\30\3\uffff\4\30",
            "",
            "",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "243:21: ( eos | expr eos )";
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
                        if ( ((((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||(synpred121_Fan()&&(lookupNL()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol())))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_13 = input.LA(1);

                         
                        int index78_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA78_14 = input.LA(1);

                         
                        int index78_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA78_15 = input.LA(1);

                         
                        int index78_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA78_16 = input.LA(1);

                         
                        int index78_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_16);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA78_17 = input.LA(1);

                         
                        int index78_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA78_18 = input.LA(1);

                         
                        int index78_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_18);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA78_19 = input.LA(1);

                         
                        int index78_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_19);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA78_20 = input.LA(1);

                         
                        int index78_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_20);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA78_21 = input.LA(1);

                         
                        int index78_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_21);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA78_22 = input.LA(1);

                         
                        int index78_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_22);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA78_23 = input.LA(1);

                         
                        int index78_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_23);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA78_24 = input.LA(1);

                         
                        int index78_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_24);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA78_25 = input.LA(1);

                         
                        int index78_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_25);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA78_26 = input.LA(1);

                         
                        int index78_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_26);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA78_27 = input.LA(1);

                         
                        int index78_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_27);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA78_28 = input.LA(1);

                         
                        int index78_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_28);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA78_29 = input.LA(1);

                         
                        int index78_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_29);
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
        "\64\uffff";
    static final String DFA81_eofS =
        "\1\1\63\uffff";
    static final String DFA81_minS =
        "\1\4\3\uffff\33\0\25\uffff";
    static final String DFA81_maxS =
        "\1\u0080\3\uffff\33\0\25\uffff";
    static final String DFA81_acceptS =
        "\1\uffff\1\2\61\uffff\1\1";
    static final String DFA81_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\25\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\7\1\10\1\5\1\4\1\11\1\12\1\13\1\6\1\14\4\1\2\uffff\11\1\3"+
            "\uffff\7\1\1\22\1\23\1\1\2\uffff\1\21\1\24\2\uffff\1\34\2\uffff"+
            "\1\1\1\uffff\1\1\1\15\2\uffff\1\35\2\uffff\1\1\6\uffff\1\31"+
            "\1\uffff\1\17\1\20\1\25\1\26\1\27\1\30\1\33\1\36\1\1\1\16\1"+
            "\32\52\uffff\1\31\3\uffff\4\31",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 247:41: ( stmt )*";
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
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_5 = input.LA(1);

                         
                        int index81_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_6 = input.LA(1);

                         
                        int index81_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_7 = input.LA(1);

                         
                        int index81_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_8 = input.LA(1);

                         
                        int index81_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA81_9 = input.LA(1);

                         
                        int index81_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA81_10 = input.LA(1);

                         
                        int index81_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA81_11 = input.LA(1);

                         
                        int index81_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA81_12 = input.LA(1);

                         
                        int index81_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_12);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA81_13 = input.LA(1);

                         
                        int index81_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()||(synpred125_Fan()&&(notAfterEol())))) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_13);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA81_14 = input.LA(1);

                         
                        int index81_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_14);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA81_15 = input.LA(1);

                         
                        int index81_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_15);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA81_16 = input.LA(1);

                         
                        int index81_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_16);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA81_17 = input.LA(1);

                         
                        int index81_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_17);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA81_18 = input.LA(1);

                         
                        int index81_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_18);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA81_19 = input.LA(1);

                         
                        int index81_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_19);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA81_20 = input.LA(1);

                         
                        int index81_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_20);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA81_21 = input.LA(1);

                         
                        int index81_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_21);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA81_22 = input.LA(1);

                         
                        int index81_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_22);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA81_23 = input.LA(1);

                         
                        int index81_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_23);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA81_24 = input.LA(1);

                         
                        int index81_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_24);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA81_25 = input.LA(1);

                         
                        int index81_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_25);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA81_26 = input.LA(1);

                         
                        int index81_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_26);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA81_27 = input.LA(1);

                         
                        int index81_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_27);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA81_28 = input.LA(1);

                         
                        int index81_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_28);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA81_29 = input.LA(1);

                         
                        int index81_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_29);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA81_30 = input.LA(1);

                         
                        int index81_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_30);
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
        "\24\uffff";
    static final String DFA87_eofS =
        "\24\uffff";
    static final String DFA87_minS =
        "\1\46\3\0\20\uffff";
    static final String DFA87_maxS =
        "\1\u0080\3\0\20\uffff";
    static final String DFA87_acceptS =
        "\4\uffff\1\2\16\uffff\1\1";
    static final String DFA87_specialS =
        "\1\uffff\1\0\1\1\1\2\20\uffff}>";
    static final String[] DFA87_transitionS = {
            "\2\4\3\uffff\2\4\2\uffff\1\1\5\uffff\1\4\2\uffff\1\2\11\uffff"+
            "\1\4\1\uffff\1\4\1\3\6\4\1\uffff\2\4\52\uffff\1\4\3\uffff\4"+
            "\4",
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
            return "251:1: forInit : ( forInitDef | expr );";
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
                        if ( (synpred130_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index87_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA87_2 = input.LA(1);

                         
                        int index87_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred130_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index87_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA87_3 = input.LA(1);

                         
                        int index87_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred130_Fan()) ) {s = 19;}

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
        "\65\uffff";
    static final String DFA89_eofS =
        "\1\2\64\uffff";
    static final String DFA89_minS =
        "\1\4\1\0\63\uffff";
    static final String DFA89_maxS =
        "\1\u0080\1\0\63\uffff";
    static final String DFA89_acceptS =
        "\2\uffff\1\2\61\uffff\1\1";
    static final String DFA89_specialS =
        "\1\uffff\1\0\63\uffff}>";
    static final String[] DFA89_transitionS = {
            "\15\2\2\uffff\11\2\3\uffff\12\2\2\uffff\2\2\2\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\1\2\uffff\1\2\2\uffff\1\2\6\uffff\1\2\1\uffff"+
            "\13\2\52\uffff\1\2\3\uffff\4\2",
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
            return "254:20: ( catchDef )?";
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
                        if ( (synpred132_Fan()) ) {s = 52;}

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
        "\64\uffff";
    static final String DFA90_eofS =
        "\1\1\63\uffff";
    static final String DFA90_minS =
        "\1\4\2\uffff\33\0\26\uffff";
    static final String DFA90_maxS =
        "\1\u0080\2\uffff\33\0\26\uffff";
    static final String DFA90_acceptS =
        "\1\uffff\1\2\61\uffff\1\1";
    static final String DFA90_specialS =
        "\3\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\26\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\6\1\7\1\4\1\3\1\10\1\11\1\12\1\5\1\13\4\1\2\uffff\11\1\3"+
            "\uffff\7\1\1\21\1\22\1\1\2\uffff\1\20\1\23\2\uffff\1\33\2\uffff"+
            "\1\1\1\uffff\1\1\1\14\2\uffff\1\34\2\uffff\1\1\6\uffff\1\30"+
            "\1\uffff\1\16\1\17\1\24\1\25\1\26\1\27\1\32\1\35\1\1\1\15\1"+
            "\31\52\uffff\1\30\3\uffff\4\30",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 254:57: ( stmt )*";
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
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA90_4 = input.LA(1);

                         
                        int index90_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA90_5 = input.LA(1);

                         
                        int index90_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA90_6 = input.LA(1);

                         
                        int index90_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA90_7 = input.LA(1);

                         
                        int index90_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA90_8 = input.LA(1);

                         
                        int index90_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA90_9 = input.LA(1);

                         
                        int index90_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA90_10 = input.LA(1);

                         
                        int index90_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA90_11 = input.LA(1);

                         
                        int index90_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA90_12 = input.LA(1);

                         
                        int index90_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred134_Fan()&&(notAfterEol()))||synpred134_Fan())) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA90_13 = input.LA(1);

                         
                        int index90_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA90_14 = input.LA(1);

                         
                        int index90_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_14);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA90_15 = input.LA(1);

                         
                        int index90_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_15);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA90_16 = input.LA(1);

                         
                        int index90_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_16);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA90_17 = input.LA(1);

                         
                        int index90_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_17);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA90_18 = input.LA(1);

                         
                        int index90_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_18);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA90_19 = input.LA(1);

                         
                        int index90_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_19);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA90_20 = input.LA(1);

                         
                        int index90_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_20);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA90_21 = input.LA(1);

                         
                        int index90_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_21);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA90_22 = input.LA(1);

                         
                        int index90_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_22);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA90_23 = input.LA(1);

                         
                        int index90_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_23);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA90_24 = input.LA(1);

                         
                        int index90_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_24);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA90_25 = input.LA(1);

                         
                        int index90_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_25);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA90_26 = input.LA(1);

                         
                        int index90_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_26);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA90_27 = input.LA(1);

                         
                        int index90_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_27);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA90_28 = input.LA(1);

                         
                        int index90_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_28);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA90_29 = input.LA(1);

                         
                        int index90_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_29);
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
        "\64\uffff";
    static final String DFA93_eofS =
        "\1\1\63\uffff";
    static final String DFA93_minS =
        "\1\4\1\uffff\33\0\27\uffff";
    static final String DFA93_maxS =
        "\1\u0080\1\uffff\33\0\27\uffff";
    static final String DFA93_acceptS =
        "\1\uffff\1\2\61\uffff\1\1";
    static final String DFA93_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\27\uffff}>";
    static final String[] DFA93_transitionS = {
            "\1\5\1\6\1\3\1\2\1\7\1\10\1\11\1\4\1\12\4\1\2\uffff\11\1\3\uffff"+
            "\7\1\1\20\1\21\1\1\2\uffff\1\17\1\22\2\uffff\1\32\2\uffff\1"+
            "\1\1\uffff\1\1\1\13\2\uffff\1\33\2\uffff\1\1\6\uffff\1\27\1"+
            "\uffff\1\15\1\16\1\23\1\24\1\25\1\26\1\31\1\34\1\1\1\14\1\30"+
            "\52\uffff\1\27\3\uffff\4\27",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 258:52: ( stmt )*";
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
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA93_3 = input.LA(1);

                         
                        int index93_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA93_4 = input.LA(1);

                         
                        int index93_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA93_5 = input.LA(1);

                         
                        int index93_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA93_6 = input.LA(1);

                         
                        int index93_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA93_7 = input.LA(1);

                         
                        int index93_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA93_8 = input.LA(1);

                         
                        int index93_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA93_9 = input.LA(1);

                         
                        int index93_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA93_10 = input.LA(1);

                         
                        int index93_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA93_11 = input.LA(1);

                         
                        int index93_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred137_Fan()&&(notAfterEol()))||synpred137_Fan())) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA93_12 = input.LA(1);

                         
                        int index93_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA93_13 = input.LA(1);

                         
                        int index93_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA93_14 = input.LA(1);

                         
                        int index93_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA93_15 = input.LA(1);

                         
                        int index93_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA93_16 = input.LA(1);

                         
                        int index93_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA93_17 = input.LA(1);

                         
                        int index93_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA93_18 = input.LA(1);

                         
                        int index93_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA93_19 = input.LA(1);

                         
                        int index93_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA93_20 = input.LA(1);

                         
                        int index93_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_20);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA93_21 = input.LA(1);

                         
                        int index93_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_21);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA93_22 = input.LA(1);

                         
                        int index93_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_22);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA93_23 = input.LA(1);

                         
                        int index93_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_23);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA93_24 = input.LA(1);

                         
                        int index93_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_24);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA93_25 = input.LA(1);

                         
                        int index93_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_25);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA93_26 = input.LA(1);

                         
                        int index93_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_26);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA93_27 = input.LA(1);

                         
                        int index93_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_27);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA93_28 = input.LA(1);

                         
                        int index93_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index93_28);
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
        "\104\uffff";
    static final String DFA109_eofS =
        "\1\1\103\uffff";
    static final String DFA109_minS =
        "\1\4\30\uffff\1\0\52\uffff";
    static final String DFA109_maxS =
        "\1\u0080\30\uffff\1\0\52\uffff";
    static final String DFA109_acceptS =
        "\1\uffff\1\2\101\uffff\1\1";
    static final String DFA109_specialS =
        "\31\uffff\1\0\52\uffff}>";
    static final String[] DFA109_transitionS = {
            "\15\1\1\uffff\33\1\2\uffff\11\1\1\31\2\uffff\6\1\1\103\1\1\1"+
            "\uffff\13\1\23\uffff\25\1\2\uffff\1\1\3\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 282:25: ( ( BITOR | PIPE ) bitAndExpr )*";
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
                        if ( (synpred174_Fan()) ) {s = 67;}

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
        "\106\uffff";
    static final String DFA110_eofS =
        "\1\1\105\uffff";
    static final String DFA110_minS =
        "\1\4\65\uffff\1\0\17\uffff";
    static final String DFA110_maxS =
        "\1\u0080\65\uffff\1\0\17\uffff";
    static final String DFA110_acceptS =
        "\1\uffff\1\2\103\uffff\1\1";
    static final String DFA110_specialS =
        "\66\uffff\1\0\17\uffff}>";
    static final String[] DFA110_transitionS = {
            "\15\1\1\uffff\33\1\2\uffff\12\1\2\uffff\7\1\1\66\1\uffff\13"+
            "\1\23\uffff\25\1\2\uffff\1\1\3\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 283:25: ( '&' shiftExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_54 = input.LA(1);

                         
                        int index110_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred175_Fan()) ) {s = 69;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index110_54);
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
        "\110\uffff";
    static final String DFA112_eofS =
        "\1\1\107\uffff";
    static final String DFA112_minS =
        "\1\4\56\uffff\1\0\10\uffff\1\0\17\uffff";
    static final String DFA112_maxS =
        "\1\u0080\56\uffff\1\0\10\uffff\1\0\17\uffff";
    static final String DFA112_acceptS =
        "\1\uffff\1\2\105\uffff\1\1";
    static final String DFA112_specialS =
        "\57\uffff\1\0\10\uffff\1\1\17\uffff}>";
    static final String[] DFA112_transitionS = {
            "\15\1\1\uffff\33\1\2\uffff\12\1\2\uffff\10\1\1\uffff\11\1\1"+
            "\57\1\1\23\uffff\27\1\1\70\3\uffff\4\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 285:21: ( ( '+' | '-' ) multExpr )*";
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
                        if ( (synpred179_Fan()) ) {s = 71;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index112_47);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA112_56 = input.LA(1);

                         
                        int index112_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred179_Fan()) ) {s = 71;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index112_56);
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
        "\25\uffff";
    static final String DFA114_eofS =
        "\25\uffff";
    static final String DFA114_minS =
        "\1\46\1\0\23\uffff";
    static final String DFA114_maxS =
        "\1\u0080\1\0\23\uffff";
    static final String DFA114_acceptS =
        "\2\uffff\1\3\20\uffff\1\1\1\2";
    static final String DFA114_specialS =
        "\1\uffff\1\0\23\uffff}>";
    static final String[] DFA114_transitionS = {
            "\2\2\3\uffff\2\2\2\uffff\1\2\5\uffff\1\1\2\uffff\1\2\11\uffff"+
            "\1\2\1\uffff\10\2\1\uffff\2\2\52\uffff\1\2\3\uffff\4\2",
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
            return "288:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );";
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
                        if ( ((synpred184_Fan()&&(notAfterEol()))) ) {s = 19;}

                        else if ( (synpred185_Fan()) ) {s = 20;}

                         
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
        "\114\uffff";
    static final String DFA115_eofS =
        "\1\1\113\uffff";
    static final String DFA115_minS =
        "\1\4\17\uffff\1\0\15\uffff\1\0\21\uffff\1\0\33\uffff";
    static final String DFA115_maxS =
        "\1\u0082\17\uffff\1\0\15\uffff\1\0\21\uffff\1\0\33\uffff";
    static final String DFA115_acceptS =
        "\1\uffff\1\2\106\uffff\1\1\3\uffff";
    static final String DFA115_specialS =
        "\20\uffff\1\0\15\uffff\1\1\21\uffff\1\2\33\uffff}>";
    static final String[] DFA115_transitionS = {
            "\15\1\1\uffff\33\1\1\uffff\1\110\1\36\1\1\1\20\3\1\1\60\3\1"+
            "\1\110\1\uffff\10\1\1\uffff\13\1\23\uffff\37\1\2\110",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 292:33: ( termChain )*";
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
                        if ( (synpred186_Fan()) ) {s = 72;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index115_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA115_30 = input.LA(1);

                         
                        int index115_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred186_Fan()&&(notAfterEol()))) ) {s = 72;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index115_30);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA115_48 = input.LA(1);

                         
                        int index115_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred186_Fan()&&(notAfterEol()))) ) {s = 72;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL())||((lookupNL())&&(notAfterEol())))) ) {s = 1;}

                         
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
        "\24\uffff";
    static final String DFA116_eofS =
        "\24\uffff";
    static final String DFA116_minS =
        "\1\46\13\0\1\uffff\5\0\2\uffff";
    static final String DFA116_maxS =
        "\1\u0080\13\0\1\uffff\5\0\2\uffff";
    static final String DFA116_acceptS =
        "\14\uffff\1\1\5\uffff\1\2\1\3";
    static final String DFA116_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff"+
        "\1\13\1\14\1\15\1\16\1\17\2\uffff}>";
    static final String[] DFA116_transitionS = {
            "\1\5\1\6\3\uffff\1\4\1\7\2\uffff\1\17\10\uffff\1\20\11\uffff"+
            "\1\14\1\uffff\1\2\1\3\1\10\1\11\1\12\1\13\1\16\1\21\1\uffff"+
            "\1\1\1\15\52\uffff\1\14\3\uffff\4\14",
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
            return "293:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );";
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
                        if ( (synpred187_Fan()) ) {s = 12;}

                        else if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA116_2 = input.LA(1);

                         
                        int index116_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA116_3 = input.LA(1);

                         
                        int index116_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA116_4 = input.LA(1);

                         
                        int index116_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA116_5 = input.LA(1);

                         
                        int index116_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA116_6 = input.LA(1);

                         
                        int index116_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA116_7 = input.LA(1);

                         
                        int index116_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA116_8 = input.LA(1);

                         
                        int index116_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA116_9 = input.LA(1);

                         
                        int index116_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA116_10 = input.LA(1);

                         
                        int index116_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA116_11 = input.LA(1);

                         
                        int index116_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA116_13 = input.LA(1);

                         
                        int index116_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA116_14 = input.LA(1);

                         
                        int index116_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA116_15 = input.LA(1);

                         
                        int index116_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA116_16 = input.LA(1);

                         
                        int index116_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA116_17 = input.LA(1);

                         
                        int index116_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index116_17);
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
        "\115\uffff";
    static final String DFA117_eofS =
        "\1\1\114\uffff";
    static final String DFA117_minS =
        "\1\4\17\uffff\1\0\15\uffff\1\0\21\uffff\1\0\34\uffff";
    static final String DFA117_maxS =
        "\1\u0082\17\uffff\1\0\15\uffff\1\0\21\uffff\1\0\34\uffff";
    static final String DFA117_acceptS =
        "\1\uffff\1\2\107\uffff\1\1\3\uffff";
    static final String DFA117_specialS =
        "\20\uffff\1\0\15\uffff\1\1\21\uffff\1\2\34\uffff}>";
    static final String[] DFA117_transitionS = {
            "\15\1\1\uffff\33\1\1\uffff\1\111\1\36\1\1\1\20\3\1\1\60\3\1"+
            "\1\111\1\uffff\10\1\1\uffff\13\1\23\uffff\37\1\2\111",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 296:22: ( termChain )*";
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
                        if ( (synpred196_Fan()) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index117_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA117_30 = input.LA(1);

                         
                        int index117_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred196_Fan()&&(notAfterEol()))) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index117_30);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA117_48 = input.LA(1);

                         
                        int index117_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred196_Fan()&&(notAfterEol()))) ) {s = 73;}

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
        "\23\uffff";
    static final String DFA118_eofS =
        "\23\uffff";
    static final String DFA118_minS =
        "\1\46\1\uffff\1\0\13\uffff\3\0\2\uffff";
    static final String DFA118_maxS =
        "\1\116\1\uffff\1\0\13\uffff\3\0\2\uffff";
    static final String DFA118_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\15\uffff\1\3\1\4";
    static final String DFA118_specialS =
        "\2\uffff\1\0\13\uffff\1\1\1\2\1\3\2\uffff}>";
    static final String[] DFA118_transitionS = {
            "\2\3\3\uffff\2\3\2\uffff\1\16\10\uffff\1\17\13\uffff\1\1\1\2"+
            "\5\3\1\20\1\uffff\2\3",
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
            return "298:1: termBase : ( idExprReq | literal | typeBase | id );";
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
                        if ( (synpred197_Fan()) ) {s = 1;}

                        else if ( (synpred198_Fan()) ) {s = 3;}

                        else if ( (synpred199_Fan()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index118_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA118_14 = input.LA(1);

                         
                        int index118_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred198_Fan()) ) {s = 3;}

                        else if ( (synpred199_Fan()) ) {s = 17;}

                         
                        input.seek(index118_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA118_15 = input.LA(1);

                         
                        int index118_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred198_Fan()) ) {s = 3;}

                        else if ( (synpred199_Fan()) ) {s = 17;}

                         
                        input.seek(index118_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA118_16 = input.LA(1);

                         
                        int index118_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred198_Fan()) ) {s = 3;}

                        else if ( (synpred199_Fan()) ) {s = 17;}

                         
                        input.seek(index118_16);
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
        "\1\57\3\0\10\uffff";
    static final String DFA119_maxS =
        "\1\113\3\0\10\uffff";
    static final String DFA119_acceptS =
        "\4\uffff\1\2\1\1\1\4\1\7\1\10\1\6\1\3\1\5";
    static final String DFA119_specialS =
        "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] DFA119_transitionS = {
            "\1\1\10\uffff\1\2\14\uffff\1\3\5\uffff\1\4",
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
            return "299:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );";
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
                        if ( (synpred200_Fan()) ) {s = 5;}

                        else if ( (synpred201_Fan()) ) {s = 4;}

                        else if ( (synpred203_Fan()) ) {s = 6;}

                        else if ( (synpred206_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index119_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA119_2 = input.LA(1);

                         
                        int index119_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred200_Fan()) ) {s = 5;}

                        else if ( (synpred201_Fan()) ) {s = 4;}

                        else if ( (synpred203_Fan()) ) {s = 6;}

                        else if ( (synpred205_Fan()) ) {s = 9;}

                        else if ( (synpred206_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index119_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA119_3 = input.LA(1);

                         
                        int index119_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred200_Fan()) ) {s = 5;}

                        else if ( (synpred201_Fan()) ) {s = 4;}

                        else if ( (synpred202_Fan()) ) {s = 10;}

                        else if ( (synpred203_Fan()) ) {s = 6;}

                        else if ( (synpred204_Fan()) ) {s = 11;}

                        else if ( (synpred206_Fan()) ) {s = 7;}

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
        "\116\uffff";
    static final String DFA125_eofS =
        "\1\1\115\uffff";
    static final String DFA125_minS =
        "\1\4\5\uffff\1\0\107\uffff";
    static final String DFA125_maxS =
        "\1\u0082\5\uffff\1\0\107\uffff";
    static final String DFA125_acceptS =
        "\1\uffff\1\2\113\uffff\1\1";
    static final String DFA125_specialS =
        "\6\uffff\1\0\107\uffff}>";
    static final String[] DFA125_transitionS = {
            "\15\1\1\uffff\33\1\1\uffff\12\1\1\6\1\1\1\uffff\10\1\1\uffff"+
            "\13\1\23\uffff\41\1",
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
            return "()* loopback of 316:47: ( closure )*";
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
                        if ( (synpred217_Fan()) ) {s = 77;}

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
        "\25\uffff";
    static final String DFA132_eofS =
        "\25\uffff";
    static final String DFA132_minS =
        "\1\46\13\uffff\3\0\6\uffff";
    static final String DFA132_maxS =
        "\1\116\13\uffff\3\0\6\uffff";
    static final String DFA132_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\3\uffff"+
        "\1\14\1\13\1\15\1\16\1\17\1\20";
    static final String DFA132_specialS =
        "\14\uffff\1\0\1\1\1\2\6\uffff}>";
    static final String[] DFA132_transitionS = {
            "\1\2\1\3\3\uffff\1\1\1\4\2\uffff\1\15\10\uffff\1\16\14\uffff"+
            "\1\14\1\5\1\6\1\7\1\10\1\13\1\17\1\uffff\2\11",
            "",
            "",
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
            return "330:1: literal : ( T_NULL | T_THIS | T_SUPER | T_IT | BOOL_VAL | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA132_12 = input.LA(1);

                         
                        int index132_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred235_Fan()) ) {s = 16;}

                        else if ( (synpred236_Fan()) ) {s = 15;}

                        else if ( (synpred237_Fan()) ) {s = 17;}

                        else if ( (synpred238_Fan()) ) {s = 18;}

                        else if ( (synpred239_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index132_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA132_13 = input.LA(1);

                         
                        int index132_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred236_Fan()) ) {s = 15;}

                        else if ( (synpred237_Fan()) ) {s = 17;}

                        else if ( (synpred238_Fan()) ) {s = 18;}

                        else if ( (synpred239_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index132_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA132_14 = input.LA(1);

                         
                        int index132_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred236_Fan()) ) {s = 15;}

                        else if ( (synpred237_Fan()) ) {s = 17;}

                        else if ( (synpred238_Fan()) ) {s = 18;}

                        else if ( (synpred239_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index132_14);
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
 

    public static final BitSet FOLLOW_using_in_prog317 = new BitSet(new long[]{0x0000000FF4320000L,0x0000000000001010L});
    public static final BitSet FOLLOW_typeDef_in_prog320 = new BitSet(new long[]{0x0000000FF4300000L,0x0000000000001010L});
    public static final BitSet FOLLOW_docs_in_prog323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingPod_in_using334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingType_in_using338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingAs_in_using342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_USING_in_usingPod352 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_podSpec_in_usingPod354 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_eos_in_usingPod356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_USING_in_usingType366 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_podSpec_in_usingType368 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLCOL_in_usingType370 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_usingType372 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_eos_in_usingType374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_USING_in_usingAs382 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_podSpec_in_usingAs384 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLCOL_in_usingAs386 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_usingAs388 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_T_AS_in_usingAs390 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_usingAs392 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_eos_in_usingAs394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ffi_in_podSpec402 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_podSpec405 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_DOT_in_podSpec408 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_podSpec410 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_ffi421 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_ffi423 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_ffi425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_typeDef434 = new BitSet(new long[]{0x0000000FF4300000L,0x0000000000001010L});
    public static final BitSet FOLLOW_facet_in_typeDef436 = new BitSet(new long[]{0x0000000FF4300000L,0x0000000000001010L});
    public static final BitSet FOLLOW_classDef_in_typeDef447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDef_in_typeDef461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinDef_in_typeDef465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classHeader_in_classDef476 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_classBody_in_classDef478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_classHeader485 = new BitSet(new long[]{0x0000000F94300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_facet_in_classHeader487 = new BitSet(new long[]{0x0000000F94300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_classFlags_in_classHeader490 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_T_CLASS_in_classHeader493 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_classHeader495 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_inheritance_in_classHeader497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_classFlags506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_ABSTRACT_in_classFlags510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FINAL_in_classFlags514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_CONST_in_classFlags518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STATIC_in_classFlags522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_classBody530 = new BitSet(new long[]{0x0104803F8FF80000L,0x0000000000001030L});
    public static final BitSet FOLLOW_slotDef_in_classBody532 = new BitSet(new long[]{0x0104803F8FF80000L,0x0000000000001030L});
    public static final BitSet FOLLOW_BRACKET_R_in_classBody535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_protection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinHeader_in_mixinDef561 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_mixinBody_in_mixinDef563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_mixinHeader570 = new BitSet(new long[]{0x0000000F44300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_facet_in_mixinHeader572 = new BitSet(new long[]{0x0000000F44300000L,0x0000000000000010L});
    public static final BitSet FOLLOW_mixinFlags_in_mixinHeader575 = new BitSet(new long[]{0x0000000F44300000L});
    public static final BitSet FOLLOW_T_MIXIN_in_mixinHeader578 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_mixinHeader580 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_inheritance_in_mixinHeader582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_mixinFlags590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_CONST_in_mixinFlags594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STATIC_in_mixinFlags598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FINAL_in_mixinFlags602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_mixinBody609 = new BitSet(new long[]{0x0104803F8FF80000L,0x0000000000001030L});
    public static final BitSet FOLLOW_slotDef_in_mixinBody611 = new BitSet(new long[]{0x0104803F8FF80000L,0x0000000000001030L});
    public static final BitSet FOLLOW_BRACKET_R_in_mixinBody614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumHeader_in_enumDef622 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_enumBody_in_enumDef624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumHeader634 = new BitSet(new long[]{0x0000000F20000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_facet_in_enumHeader636 = new BitSet(new long[]{0x0000000F20000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_protection_in_enumHeader639 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_T_ENUM_in_enumHeader642 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_enumHeader644 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_inheritance_in_enumHeader646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_enumBody654 = new BitSet(new long[]{0x0000800000000000L,0x0000000000001020L});
    public static final BitSet FOLLOW_enumValDefs_in_enumBody656 = new BitSet(new long[]{0x0104803F8FF80000L,0x0000000000001030L});
    public static final BitSet FOLLOW_slotDef_in_enumBody658 = new BitSet(new long[]{0x0104803F8FF80000L,0x0000000000001030L});
    public static final BitSet FOLLOW_BRACKET_R_in_enumBody661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_inheritance670 = new BitSet(new long[]{0x0100800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_typeList_in_inheritance672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs680 = new BitSet(new long[]{0x0810000000000000L});
    public static final BitSet FOLLOW_COMMA_in_enumValDefs683 = new BitSet(new long[]{0x0000800000000000L,0x0000000000001020L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs686 = new BitSet(new long[]{0x0810000000000000L});
    public static final BitSet FOLLOW_eos_in_enumValDefs690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumValDef698 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_enumValDef700 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_enumValDef703 = new BitSet(new long[]{0x016098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_enumValDef705 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_enumValDef708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList719 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList722 = new BitSet(new long[]{0x0100800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_typeList724 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_typeRoot_in_type744 = new BitSet(new long[]{0x0080000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_QMARK_in_type747 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_type751 = new BitSet(new long[]{0x0080000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_QMARK_in_type753 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_funcType_in_nonMapType764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_nonMapType768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_typeRoot775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonMapType_in_typeRoot779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_simpleType793 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_COLCOL_in_simpleType796 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_simpleType798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_mapType809 = new BitSet(new long[]{0x0100800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_nonMapType_in_mapType812 = new BitSet(new long[]{0x0088000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_QMARK_in_mapType814 = new BitSet(new long[]{0x0008000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_mapType818 = new BitSet(new long[]{0x0088000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_QMARK_in_mapType820 = new BitSet(new long[]{0x0008000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_mapType832 = new BitSet(new long[]{0x0100800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_mapType836 = new BitSet(new long[]{0x0009000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_mapType840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PIPE_in_funcType849 = new BitSet(new long[]{0x0310800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_funcType852 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_formals_in_funcType857 = new BitSet(new long[]{0x0310800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_assignedType_in_funcType864 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_assignedType_in_funcType876 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PIPE_in_funcType880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_assignedType887 = new BitSet(new long[]{0x0100800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_assignedType889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_in_formals899 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_formals902 = new BitSet(new long[]{0x0100800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formal_in_formals904 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_formalFull_in_formal914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_formal918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalInferred_in_formal922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalFull934 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_formalFull936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalTypeOnly946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_formalInferred956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticBlock_in_slotDef972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_slotDef980 = new BitSet(new long[]{0x0100803F8FF80000L,0x0000000000001030L});
    public static final BitSet FOLLOW_facet_in_slotDef982 = new BitSet(new long[]{0x0100803F8FF80000L,0x0000000000001030L});
    public static final BitSet FOLLOW_ctorDef_in_slotDef1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDef_in_slotDef1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDef_in_slotDef1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_fieldDef1067 = new BitSet(new long[]{0x0100803F8FF80000L,0x0000000000001030L});
    public static final BitSet FOLLOW_facet_in_fieldDef1069 = new BitSet(new long[]{0x0100803F8FF80000L,0x0000000000001030L});
    public static final BitSet FOLLOW_fieldFlags_in_fieldDef1072 = new BitSet(new long[]{0x0100803F8FF80000L,0x0000000000001030L});
    public static final BitSet FOLLOW_typeId_in_fieldDef1074 = new BitSet(new long[]{0x0C02000000000000L});
    public static final BitSet FOLLOW_INIT_VAL_in_fieldDef1077 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_fieldDef1079 = new BitSet(new long[]{0x0802000000000000L});
    public static final BitSet FOLLOW_BRACKET_L_in_fieldDef1094 = new BitSet(new long[]{0x0000000F00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_protection_in_fieldDef1097 = new BitSet(new long[]{0x0000000F00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_getter_in_fieldDef1101 = new BitSet(new long[]{0x092698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_setter_in_fieldDef1105 = new BitSet(new long[]{0x092698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_fieldDef1108 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_fieldDef1111 = new BitSet(new long[]{0x0004000F00000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_BRACKET_R_in_fieldDef1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_fieldDef1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeAndId_in_typeId1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_typeId1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeAndId1154 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_typeAndId1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_ABSTRACT_in_fieldFlags1164 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_T_RD_ONLY_in_fieldFlags1168 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_T_CONST_in_fieldFlags1172 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_T_STATIC_in_fieldFlags1176 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_T_NATIVE_in_fieldFlags1180 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_T_VOLATILE_in_fieldFlags1184 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_T_OVERRIDE_in_fieldFlags1188 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_T_VIRTUAL_in_fieldFlags1192 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_T_FINAL_in_fieldFlags1196 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_protection_in_fieldFlags1200 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_docs_in_methodDef1209 = new BitSet(new long[]{0x0100802F8F600000L,0x0000000000000030L});
    public static final BitSet FOLLOW_facet_in_methodDef1211 = new BitSet(new long[]{0x0100802F8F600000L,0x0000000000000030L});
    public static final BitSet FOLLOW_methodFlags_in_methodDef1214 = new BitSet(new long[]{0x0100802F8F600000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_methodDef1218 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_T_VOID_in_methodDef1222 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_methodDef1225 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_methodDef1227 = new BitSet(new long[]{0x0140800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_params_in_methodDef1229 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_methodDef1231 = new BitSet(new long[]{0x0802000000000000L});
    public static final BitSet FOLLOW_methodBody_in_methodDef1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_methodFlags1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_VIRTUAL_in_methodFlags1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_OVERRIDE_in_methodFlags1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_ABSTRACT_in_methodFlags1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STATIC_in_methodFlags1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_ONCE_in_methodFlags1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_NATIVE_in_methodFlags1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FINAL_in_methodFlags1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params1281 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_params1284 = new BitSet(new long[]{0x0100800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_param_in_params1286 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_type_in_param1299 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_param1301 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_INIT_VAL_in_param1304 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_param1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_methodBody1316 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_methodBody1318 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_BRACKET_R_in_methodBody1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_methodBody1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_ctorDef1334 = new BitSet(new long[]{0x0000001F00000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_facet_in_ctorDef1336 = new BitSet(new long[]{0x0000001F00000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ctorFlags_in_ctorDef1339 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_T_NEW_in_ctorDef1342 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_ctorDef1344 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_ctorDef1346 = new BitSet(new long[]{0x0140800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_params_in_ctorDef1348 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_ctorDef1350 = new BitSet(new long[]{0x080A000000000000L});
    public static final BitSet FOLLOW_ctorChain_in_ctorDef1357 = new BitSet(new long[]{0x0802000000000000L});
    public static final BitSet FOLLOW_methodBody_in_ctorDef1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_ctorFlags1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_ctorChain1375 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ctorChainThis_in_ctorChain1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorChainSuper_in_ctorChain1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_THIS_in_ctorChainThis1391 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainThis1393 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_ctorChainThis1395 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_ctorChainThis1397 = new BitSet(new long[]{0x016098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_ctorChainThis1399 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_ctorChainThis1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SUPER_in_ctorChainSuper1409 = new BitSet(new long[]{0x0020400000000000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainSuper1412 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_ctorChainSuper1414 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_ctorChainSuper1418 = new BitSet(new long[]{0x016098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_ctorChainSuper1420 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_ctorChainSuper1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STATIC_in_staticBlock1431 = new BitSet(new long[]{0x012298FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_staticBlock1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_block1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_multiStmt1459 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_multiStmt1462 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_BRACKET_R_in_multiStmt1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_if_in_stmt1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_for_in_stmt1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_while_in_stmt1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_break_in_stmt1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_continue_in_stmt1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_return_in_stmt1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switch_in_stmt1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_throw_in_stmt1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_try_in_stmt1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_stmt1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localDef_in_stmt1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BREAK_in_g_break1534 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_eos_in_g_break1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_CONTINUE_in_g_continue1543 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_eos_in_g_continue1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FOR_in_g_for1553 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_g_for1555 = new BitSet(new long[]{0x092098FF8FF80000L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_forInit_in_g_for1557 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_SEMI_in_g_for1560 = new BitSet(new long[]{0x092098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_g_for1562 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_SEMI_in_g_for1565 = new BitSet(new long[]{0x016098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_g_for1567 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_g_for1570 = new BitSet(new long[]{0x012298FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_g_for1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_IF_in_g_if1581 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_g_if1583 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_g_if1585 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_g_if1587 = new BitSet(new long[]{0x012298FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_g_if1589 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_T_ELSE_in_g_if1596 = new BitSet(new long[]{0x012298FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_g_if1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_RETURN_in_g_return1607 = new BitSet(new long[]{0x092098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_eos_in_g_return1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_g_return1614 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_eos_in_g_return1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SWITCH_in_g_switch1624 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_g_switch1626 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_g_switch1628 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_g_switch1630 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_BRACKET_L_in_g_switch1632 = new BitSet(new long[]{0x0004000000006000L});
    public static final BitSet FOLLOW_g_case_in_g_switch1635 = new BitSet(new long[]{0x0004000000006000L});
    public static final BitSet FOLLOW_g_default_in_g_switch1640 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_BRACKET_R_in_g_switch1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_THROW_in_g_throw1652 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_g_throw1654 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_eos_in_g_throw1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_WHILE_in_g_while1664 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_g_while1666 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_g_while1668 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_g_while1670 = new BitSet(new long[]{0x012298FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_g_while1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_TRY_in_g_try1680 = new BitSet(new long[]{0x012298FF8FF99FF2L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_try_long_in_g_try1687 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_stmt_in_g_try1691 = new BitSet(new long[]{0x012298FF8FF99FF2L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_g_catch_in_g_try1700 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_finally_in_g_try1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_try_long1718 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_try_long1720 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_BRACKET_R_in_try_long1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprStmt1730 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_eos_in_exprStmt1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_localDef1739 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_INIT_VAL_in_localDef1742 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_localDef1744 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_eos_in_localDef1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_forInit1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forInit1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_forInitDef1767 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_INIT_VAL_in_forInitDef1770 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_forInitDef1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_CATCH_in_g_catch1783 = new BitSet(new long[]{0x012298FF8FF81FF2L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_catchDef_in_g_catch1785 = new BitSet(new long[]{0x012298FF8FF81FF2L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_catch_long_in_g_catch1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_g_catch1797 = new BitSet(new long[]{0x012298FF8FF81FF2L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_BRACKET_L_in_catch_long1806 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_catch_long1808 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_BRACKET_R_in_catch_long1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_catchDef1819 = new BitSet(new long[]{0x0100800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_catchDef1821 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_catchDef1823 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_catchDef1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FINALLY_in_g_finally1833 = new BitSet(new long[]{0x012298FF8FF81FF2L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_finally_long_in_g_finally1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_g_finally1844 = new BitSet(new long[]{0x012298FF8FF81FF2L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_BRACKET_L_in_finally_long1853 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_finally_long1855 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_BRACKET_R_in_finally_long1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_CASE_in_g_case1866 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_g_case1868 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLON_in_g_case1870 = new BitSet(new long[]{0x012298FF8FF81FF2L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_g_case1872 = new BitSet(new long[]{0x012298FF8FF81FF2L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_T_DEFAULT_in_g_default1880 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLON_in_g_default1882 = new BitSet(new long[]{0x012298FF8FF81FF2L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_g_default1884 = new BitSet(new long[]{0x012298FF8FF81FF2L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignExpr_in_expr1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr1902 = new BitSet(new long[]{0x1000000000000002L,0x00000FFC00000000L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr1905 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignExpr_in_assignExpr1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryExpr1916 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ternaryTail_in_ternaryExpr1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_ternaryTail1929 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail1931 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryTail1933 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2013 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_condOrExpr2017 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2020 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2030 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_condAndExpr2033 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2036 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2046 = new BitSet(new long[]{0x0000000000000002L,0x0003C00000000000L});
    public static final BitSet FOLLOW_set_in_equalityExpr2049 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2065 = new BitSet(new long[]{0x0000000000000002L,0x0003C00000000000L});
    public static final BitSet FOLLOW_elvisExpr_in_relationalExpr2078 = new BitSet(new long[]{0x0000060000040000L,0x007C000000000000L});
    public static final BitSet FOLLOW_typeCheck_in_relationalExpr2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_relationalExpr2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCheck2096 = new BitSet(new long[]{0x0100800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_typeRoot_in_typeCheck2108 = new BitSet(new long[]{0x0080000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_QMARK_in_typeCheck2111 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_typeCheck2116 = new BitSet(new long[]{0x0080000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_set_in_compare2129 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_elvisExpr_in_compare2149 = new BitSet(new long[]{0x0000000000000002L,0x007C000000000000L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2160 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ELVIS_in_elvisExpr2163 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2165 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2176 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_rangeExpr2179 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2193 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2204 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bitOrExpr2207 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2215 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2226 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_CURRY_in_bitAndExpr2229 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2231 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2243 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L});
    public static final BitSet FOLLOW_set_in_shiftExpr2246 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2254 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2265 = new BitSet(new long[]{0x0000000000000002L,0x0200000000002000L});
    public static final BitSet FOLLOW_set_in_addExpr2268 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2276 = new BitSet(new long[]{0x0000000000000002L,0x0200000000002000L});
    public static final BitSet FOLLOW_set_in_addAppend2286 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_parenExpr_in_addAppend2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2302 = new BitSet(new long[]{0x0000000000000002L,0x1C00000000000000L});
    public static final BitSet FOLLOW_set_in_multExpr2305 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2317 = new BitSet(new long[]{0x0000000000000002L,0x1C00000000000000L});
    public static final BitSet FOLLOW_castExpr_in_parenExpr2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_parenExpr2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_parenExpr2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_castExpr2347 = new BitSet(new long[]{0x0100800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_castExpr2349 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_castExpr2351 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_parenExpr_in_castExpr2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_groupedExpr2362 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_groupedExpr2364 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_groupedExpr2366 = new BitSet(new long[]{0x0222C00000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_termChain_in_groupedExpr2368 = new BitSet(new long[]{0x0222C00000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_prefixExpr_in_unaryExpr2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_unaryExpr2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_unaryExpr2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr2393 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_parenExpr_in_prefixExpr2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_postfixExpr2430 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_set_in_postfixExpr2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termBase_in_termExpr2447 = new BitSet(new long[]{0x0222C00000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_termChain_in_termExpr2449 = new BitSet(new long[]{0x0222C00000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_idExprReq_in_termBase2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_termBase2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_termBase2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_termBase2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_typeBase2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_typeBase2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_typeBase2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_typeBase2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_typeBase2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_typeBase2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_typeBase2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorBlock_in_typeBase2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_ctorBlock2531 = new BitSet(new long[]{0x0222C00000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_itBlock_in_ctorBlock2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_staticCall2540 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DOT_in_staticCall2542 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_idExpr_in_staticCall2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_termChain2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynCall_in_termChain2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_termChain2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDynCall_in_termChain2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpr_in_termChain2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callOp_in_termChain2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itBlock_in_termChain2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_dsl2595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DSL_in_dsl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_itBlock2607 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_itBlock2610 = new BitSet(new long[]{0x093698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_COMMA_in_itBlock2612 = new BitSet(new long[]{0x092698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_itBlock2615 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_BRACKET_R_in_itBlock2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotCall2628 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_idExpr_in_dotCall2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_dynCall2638 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_idExpr_in_dynCall2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_safeDotCall2648 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_idExpr_in_safeDotCall2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_safeDynCall2657 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_idExpr_in_safeDynCall2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_indexExpr2669 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_indexExpr2671 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_indexExpr2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_callOp2684 = new BitSet(new long[]{0x016098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_callOp2686 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_callOp2690 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_closure_in_callOp2692 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_funcType_in_closure2703 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_BRACKET_L_in_closure2705 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmt_in_closure2707 = new BitSet(new long[]{0x012698FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_BRACKET_R_in_closure2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_idExpr2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idExpr2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_idExprReq2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_idExprReq2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_field2745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_field2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call2757 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_callParams_in_call2761 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_closure_in_call2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_call2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_call2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_callParams2783 = new BitSet(new long[]{0x016098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_callParams2785 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_callParams2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args2797 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_args2800 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_args2803 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_T_NULL_in_literal2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_THIS_in_literal2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SUPER_in_literal2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_IT_in_literal2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_VAL_in_literal2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTSTR_in_literal2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_literal2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_literal2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_literal2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_literal2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_literal2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_literal2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_literal2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_literal2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_literal2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_literal2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeLiteral2889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_POUND_in_typeLiteral2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_slotLiteral2902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_POUND_in_slotLiteral2905 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_slotLiteral2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_namedSuper2917 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DOT_in_namedSuper2919 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_T_SUPER_in_namedSuper2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_list2931 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_list2937 = new BitSet(new long[]{0x013098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_listItems_in_list2939 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_list2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_listItems2950 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_listItems2953 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_listItems2955 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_listItems2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_listItems2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_map2976 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_map2982 = new BitSet(new long[]{0x012898C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_mapItems_in_map2984 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_map2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapPair_in_mapItems2995 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_mapItems2998 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_mapPair_in_mapItems3000 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_COMMA_in_mapItems3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_mapItems3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_mapPair3018 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLON_in_mapPair3020 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_mapPair3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_simple3030 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_simple3032 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_simple3034 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_PAR_R_in_simple3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_docs3045 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_MINUS_in_number3056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_number3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_facet3067 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_facet3069 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_facet3072 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_facet3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_eos3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getter3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setter3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred7_Fan436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classFlags_in_synpred9_Fan441 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_T_CLASS_in_synpred9_Fan444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_synpred11_Fan455 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_T_ENUM_in_synpred11_Fan458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_synpred38_Fan747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_synpred39_Fan753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_synpred40_Fan751 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_QMARK_in_synpred40_Fan753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred42_Fan775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred48_Fan832 = new BitSet(new long[]{0x0100800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_synpred48_Fan836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_synpred49_Fan840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_synpred51_Fan861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_synpred53_Fan873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_synpred55_Fan914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_synpred56_Fan918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STATIC_in_synpred57_Fan966 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred57_Fan968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred58_Fan982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorFlags_in_synpred60_Fan999 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_T_NEW_in_synpred60_Fan1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodFlags_in_synpred63_Fan1016 = new BitSet(new long[]{0x0100802F8F600000L,0x0000000000000020L});
    public static final BitSet FOLLOW_type_in_synpred63_Fan1020 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_T_VOID_in_synpred63_Fan1024 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_synpred63_Fan1027 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_PAR_L_in_synpred63_Fan1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getter_in_synpred67_Fan1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred69_Fan1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred72_Fan1137 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_id_in_synpred72_Fan1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred100_Fan1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred105_Fan1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_synpred116_Fan1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_ELSE_in_synpred120_Fan1596 = new BitSet(new long[]{0x012298FF8FF81FF0L,0xE200000000007FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_synpred120_Fan1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_synpred121_Fan1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred124_Fan1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred125_Fan1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_CATCH_in_synpred126_Fan1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FINALLY_in_synpred127_Fan1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_synpred130_Fan1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchDef_in_synpred132_Fan1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred133_Fan1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred134_Fan1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_synpred136_Fan1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred137_Fan1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred174_Fan2207 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_bitAndExpr_in_synpred174_Fan2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRY_in_synpred175_Fan2229 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_shiftExpr_in_synpred175_Fan2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred179_Fan2268 = new BitSet(new long[]{0x012098C000000000L,0xE200000000006FF4L,0x0000000000000001L});
    public static final BitSet FOLLOW_multExpr_in_synpred179_Fan2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_synpred184_Fan2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_synpred185_Fan2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred186_Fan2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred187_Fan2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_synpred188_Fan2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred196_Fan2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred197_Fan2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred198_Fan2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_synpred199_Fan2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred200_Fan2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred201_Fan2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred202_Fan2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_synpred203_Fan2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_synpred204_Fan2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred205_Fan2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_synpred206_Fan2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred217_Fan2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred219_Fan2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred221_Fan2761 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_closure_in_synpred221_Fan2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred222_Fan2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred235_Fan2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred236_Fan2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred237_Fan2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_synpred238_Fan2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_synpred239_Fan2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred241_Fan2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred245_Fan2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_synpred249_Fan3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_synpred252_Fan3086 = new BitSet(new long[]{0x0000000000000002L});

}