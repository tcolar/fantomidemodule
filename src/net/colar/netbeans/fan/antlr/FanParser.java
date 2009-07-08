// $ANTLR 3.1.2 src/net/colar/netbeans/fan/antlr/Fan.g 2009-07-08 06:41:27
package net.colar.netbeans.fan.antlr;
import net.colar.netbeans.fan.FanParserResult;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FanParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KW_BREAK", "KW_CONTINUE", "KW_FOR", "KW_IF", "KW_RETURN", "KW_SWITCH", "KW_THROW", "KW_WHILE", "KW_TRY", "KW_CASE", "KW_DEFAULT", "KW_CATCH", "KW_FINALLY", "KW_USING", "KW_AS", "KW_RD_ONLY", "KW_CONST", "KW_STATIC", "KW_NATIVE", "KW_VOLATILE", "KW_OVERRIDE", "KW_VIRTUAL", "KW_FINAL", "KW_VOID", "KW_CLASS", "KW_ENUM", "KW_MIXIN", "KW_ABSTRACT", "KW_PRIVATE", "KW_PROTECTED", "KW_PUBLIC", "KW_INTERNAL", "KW_NEW", "KW_ONCE", "KW_THIS", "KW_SUPER", "KW_ELSE", "KW_IS", "KW_ISNOT", "KW_NULL", "KW_IT", "KW_TRUE", "KW_FALSE", "INC_STR", "INC_URI", "INC_COMMENT", "INC_DSL", "SP_COLCOL", "DOT", "SP_COLON", "SP_COMMA", "SP_QMARK", "LIST_TYPE", "SP_PIPE", "OP_ARROW", "AS_INIT_VAL", "SP_SEMI", "AS_EQUAL", "AS_ASSIGN_OP", "OP_OR", "OP_AND", "CP_EQUALITY", "CP_COMPARATORS", "OP_ELVIS", "OP_RANG_EXCL_OLD", "OP_RANGE_EXCL", "OP_RANGE", "OP_BITOR", "OP_CURRY", "OP_LSHIFT", "OP_RSHIFT", "OP_PLUS", "OP_MINUS", "OP_MULTI", "OP_DIV", "OP_MOD", "OP_BANG", "OP_2PLUS", "OP_2MINUS", "OP_TILDA", "DSL", "OP_SAFE_CALL", "OP_SAFEDYN_CALL", "AT", "ID", "QUOTSTR", "STR", "URI", "CHAR", "OP_POUND", "DOC", "NUMBER", "BRACKET_L", "BRACKET_R", "LB", "WS", "LINE_COMMENT", "EXEC_COMMENT", "COMPL_ML_COMMENT", "MULTI_COMMENT", "COMPL_DSL", "DIGIT", "HEXLETTER", "COMPL_QSTR", "COMPL_STR", "COMPL_URI", "KEYWORD", "SQ_BRACKET_L", "SQ_BRACKET_R", "PAR_L", "PAR_R", "UNDERSCORE", "HEX_HEADER", "HEXNB", "DECIMAL", "FRACTIONAL", "HEXHEADER", "FRACTION", "EXPONENT", "NBTYPE", "LETTER", "INC_UNKNOWN_ITEM"
    };
    public static final int EXPONENT=122;
    public static final int DSL=84;
    public static final int KW_NATIVE=22;
    public static final int OP_AND=64;
    public static final int LETTER=124;
    public static final int HEXNB=117;
    public static final int CHAR=92;
    public static final int KW_DEFAULT=14;
    public static final int OP_2PLUS=81;
    public static final int KW_ONCE=37;
    public static final int SP_SEMI=60;
    public static final int INC_UNKNOWN_ITEM=125;
    public static final int EOF=-1;
    public static final int KW_PUBLIC=34;
    public static final int KW_ISNOT=42;
    public static final int OP_MOD=79;
    public static final int PAR_R=114;
    public static final int OP_MINUS=76;
    public static final int KW_NEW=36;
    public static final int KW_BREAK=4;
    public static final int KW_SWITCH=9;
    public static final int OP_RANG_EXCL_OLD=68;
    public static final int OP_BITOR=71;
    public static final int QUOTSTR=89;
    public static final int OP_BANG=80;
    public static final int PAR_L=113;
    public static final int OP_MULTI=77;
    public static final int KEYWORD=110;
    public static final int KW_PROTECTED=33;
    public static final int LINE_COMMENT=100;
    public static final int CP_COMPARATORS=66;
    public static final int NUMBER=95;
    public static final int KW_CATCH=15;
    public static final int AS_EQUAL=61;
    public static final int UNDERSCORE=115;
    public static final int OP_DIV=78;
    public static final int SP_COMMA=54;
    public static final int URI=91;
    public static final int KW_FINALLY=16;
    public static final int WS=99;
    public static final int KW_THROW=10;
    public static final int OP_POUND=93;
    public static final int KW_STATIC=21;
    public static final int INC_COMMENT=49;
    public static final int SP_QMARK=55;
    public static final int HEXHEADER=120;
    public static final int AS_INIT_VAL=59;
    public static final int COMPL_DSL=104;
    public static final int NBTYPE=123;
    public static final int KW_SUPER=39;
    public static final int OP_2MINUS=82;
    public static final int KW_ELSE=40;
    public static final int OP_RSHIFT=74;
    public static final int OP_OR=63;
    public static final int DOC=94;
    public static final int KW_OVERRIDE=24;
    public static final int KW_ABSTRACT=31;
    public static final int MULTI_COMMENT=103;
    public static final int KW_CONST=20;
    public static final int COMPL_ML_COMMENT=102;
    public static final int OP_ELVIS=67;
    public static final int BRACKET_R=97;
    public static final int KW_TRUE=45;
    public static final int SP_COLON=53;
    public static final int ID=88;
    public static final int BRACKET_L=96;
    public static final int AT=87;
    public static final int STR=90;
    public static final int SP_PIPE=57;
    public static final int OP_RANGE_EXCL=69;
    public static final int COMPL_QSTR=107;
    public static final int KW_VIRTUAL=25;
    public static final int OP_TILDA=83;
    public static final int CP_EQUALITY=65;
    public static final int KW_FOR=6;
    public static final int KW_WHILE=11;
    public static final int COMPL_URI=109;
    public static final int OP_RANGE=70;
    public static final int KW_RETURN=8;
    public static final int INC_DSL=50;
    public static final int SQ_BRACKET_R=112;
    public static final int KW_IS=41;
    public static final int DIGIT=105;
    public static final int KW_TRY=12;
    public static final int KW_IT=44;
    public static final int DOT=52;
    public static final int KW_THIS=38;
    public static final int KW_IF=7;
    public static final int OP_CURRY=72;
    public static final int SQ_BRACKET_L=111;
    public static final int OP_PLUS=75;
    public static final int KW_FALSE=46;
    public static final int KW_INTERNAL=35;
    public static final int KW_FINAL=26;
    public static final int HEXLETTER=106;
    public static final int KW_CONTINUE=5;
    public static final int KW_PRIVATE=32;
    public static final int KW_ENUM=29;
    public static final int HEX_HEADER=116;
    public static final int OP_SAFEDYN_CALL=86;
    public static final int KW_VOLATILE=23;
    public static final int KW_CASE=13;
    public static final int LIST_TYPE=56;
    public static final int FRACTIONAL=119;
    public static final int OP_LSHIFT=73;
    public static final int EXEC_COMMENT=101;
    public static final int KW_MIXIN=30;
    public static final int OP_ARROW=58;
    public static final int KW_VOID=27;
    public static final int DECIMAL=118;
    public static final int INC_URI=48;
    public static final int KW_CLASS=28;
    public static final int AS_ASSIGN_OP=62;
    public static final int KW_RD_ONLY=19;
    public static final int INC_STR=47;
    public static final int KW_AS=18;
    public static final int OP_SAFE_CALL=85;
    public static final int COMPL_STR=108;
    public static final int LB=98;
    public static final int KW_USING=17;
    public static final int KW_NULL=43;
    public static final int FRACTION=121;
    public static final int SP_COLCOL=51;

    // delegates
    // delegators


        public FanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[382+1];
             
             
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
    			// if next token is a '}', that counts as a newline
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

        /* Error Handling */
        FanParserResult parsingResult=null;
        public FanParserResult parse(FanParserResult parsingResult) throws RecognitionException
        {
    	this.parsingResult=parsingResult;
    	prog();
    	return this.parsingResult;
        }
        @Override
        public void reportError(RecognitionException e)
        {
    	    parsingResult.addAntlrError(e,paraphrase);
        }
        
        Stack<String> paraphrase = new Stack<String>();




    // $ANTLR start "prog"
    // src/net/colar/netbeans/fan/antlr/Fan.g:209:1: prog : ( using )* ( typeDef )* docs EOF ;
    public final void prog() throws RecognitionException {
        int prog_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:209:7: ( ( using )* ( typeDef )* docs EOF )
            // src/net/colar/netbeans/fan/antlr/Fan.g:209:11: ( using )* ( typeDef )* docs EOF
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:209:11: ( using )*
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
            	    pushFollow(FOLLOW_using_in_prog357);
            	    using();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:209:18: ( typeDef )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: typeDef
            	    {
            	    pushFollow(FOLLOW_typeDef_in_prog360);
            	    typeDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_docs_in_prog363);
            docs();

            state._fsp--;
            if (state.failed) return ;
            match(input,EOF,FOLLOW_EOF_in_prog365); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:210:1: using : ( usingPod | usingType | usingAs ) ;
    public final void using() throws RecognitionException {
        int using_StartIndex = input.index();
        paraphrase.push("Using statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:211:3: ( ( usingPod | usingType | usingAs ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:211:5: ( usingPod | usingType | usingAs )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:211:5: ( usingPod | usingType | usingAs )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:211:6: usingPod
                    {
                    pushFollow(FOLLOW_usingPod_in_using385);
                    usingPod();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:211:17: usingType
                    {
                    pushFollow(FOLLOW_usingType_in_using389);
                    usingType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:211:29: usingAs
                    {
                    pushFollow(FOLLOW_usingAs_in_using393);
                    usingAs();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:212:1: usingPod : KW_USING podSpec eos ;
    public final void usingPod() throws RecognitionException {
        int usingPod_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:213:3: ( KW_USING podSpec eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:213:5: KW_USING podSpec eos
            {
            match(input,KW_USING,FOLLOW_KW_USING_in_usingPod403); if (state.failed) return ;
            pushFollow(FOLLOW_podSpec_in_usingPod405);
            podSpec();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_usingPod407);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:214:1: usingType : KW_USING podSpec SP_COLCOL id eos ;
    public final void usingType() throws RecognitionException {
        int usingType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:215:3: ( KW_USING podSpec SP_COLCOL id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:215:5: KW_USING podSpec SP_COLCOL id eos
            {
            match(input,KW_USING,FOLLOW_KW_USING_in_usingType417); if (state.failed) return ;
            pushFollow(FOLLOW_podSpec_in_usingType419);
            podSpec();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingType421); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_usingType423);
            id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_usingType425);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:216:1: usingAs : KW_USING podSpec SP_COLCOL id KW_AS id eos ;
    public final void usingAs() throws RecognitionException {
        int usingAs_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:216:10: ( KW_USING podSpec SP_COLCOL id KW_AS id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:216:12: KW_USING podSpec SP_COLCOL id KW_AS id eos
            {
            match(input,KW_USING,FOLLOW_KW_USING_in_usingAs433); if (state.failed) return ;
            pushFollow(FOLLOW_podSpec_in_usingAs435);
            podSpec();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingAs437); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_usingAs439);
            id();

            state._fsp--;
            if (state.failed) return ;
            match(input,KW_AS,FOLLOW_KW_AS_in_usingAs441); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_usingAs443);
            id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_usingAs445);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:217:1: podSpec : ( ffi )? id ( DOT id )* ;
    public final void podSpec() throws RecognitionException {
        int podSpec_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:217:10: ( ( ffi )? id ( DOT id )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:217:12: ( ffi )? id ( DOT id )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:217:12: ( ffi )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==BRACKET_R) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ffi
                    {
                    pushFollow(FOLLOW_ffi_in_podSpec453);
                    ffi();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_podSpec456);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:217:20: ( DOT id )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DOT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:217:21: DOT id
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_podSpec459); if (state.failed) return ;
            	    pushFollow(FOLLOW_id_in_podSpec461);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:218:1: ffi : sq_bracketL id sq_bracketR ;
    public final void ffi() throws RecognitionException {
        int ffi_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:218:7: ( sq_bracketL id sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:218:9: sq_bracketL id sq_bracketR
            {
            pushFollow(FOLLOW_sq_bracketL_in_ffi472);
            sq_bracketL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_ffi474);
            id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_sq_bracketR_in_ffi476);
            sq_bracketR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:220:1: typeDef : docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) ;
    public final void typeDef() throws RecognitionException {
        int typeDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:220:10: ( docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:220:12: docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            {
            pushFollow(FOLLOW_docs_in_typeDef485);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:220:17: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_typeDef487);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:220:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:220:25: ( ( classFlags )* KW_CLASS )=> classDef
                    {
                    pushFollow(FOLLOW_classDef_in_typeDef498);
                    classDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:221:4: ( ( protection )? KW_ENUM )=> enumDef
                    {
                    pushFollow(FOLLOW_enumDef_in_typeDef512);
                    enumDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:221:37: mixinDef
                    {
                    pushFollow(FOLLOW_mixinDef_in_typeDef516);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:222:1: classDef : classHeader classBody ;
    public final void classDef() throws RecognitionException {
        int classDef_StartIndex = input.index();
        paraphrase.push("Class definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:223:3: ( classHeader classBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:223:7: classHeader classBody
            {
            pushFollow(FOLLOW_classHeader_in_classDef538);
            classHeader();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_classBody_in_classDef540);
            classBody();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:224:1: classHeader : docs ( facet )* ( classFlags )* KW_CLASS id ( inheritance )? ;
    public final void classHeader() throws RecognitionException {
        int classHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:224:13: ( docs ( facet )* ( classFlags )* KW_CLASS id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:224:15: docs ( facet )* ( classFlags )* KW_CLASS id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_classHeader547);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:224:20: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_classHeader549);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:224:27: ( classFlags )*
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
            	    pushFollow(FOLLOW_classFlags_in_classHeader552);
            	    classFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,KW_CLASS,FOLLOW_KW_CLASS_in_classHeader555); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_classHeader557);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:224:51: ( inheritance )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SP_COLON) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_classHeader559);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:225:1: classFlags : ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC );
    public final void classFlags() throws RecognitionException {
        int classFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:225:13: ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:225:15: protection
                    {
                    pushFollow(FOLLOW_protection_in_classFlags568);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:225:28: KW_ABSTRACT
                    {
                    match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_classFlags572); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:225:42: KW_FINAL
                    {
                    match(input,KW_FINAL,FOLLOW_KW_FINAL_in_classFlags576); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:225:53: KW_CONST
                    {
                    match(input,KW_CONST,FOLLOW_KW_CONST_in_classFlags580); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:225:64: KW_STATIC
                    {
                    match(input,KW_STATIC,FOLLOW_KW_STATIC_in_classFlags584); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:226:1: classBody : bracketL ( slotDef )* bracketR ;
    public final void classBody() throws RecognitionException {
        int classBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:226:12: ( bracketL ( slotDef )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:226:14: bracketL ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_classBody592);
            bracketL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:226:23: ( slotDef )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==BRACKET_R) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==SP_PIPE||LA12_1==ID) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>=KW_RD_ONLY && LA12_0<=KW_VOID)||(LA12_0>=KW_ABSTRACT && LA12_0<=KW_ONCE)||LA12_0==SP_PIPE||(LA12_0>=AT && LA12_0<=ID)||LA12_0==DOC) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_classBody594);
            	    slotDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_classBody597);
            bracketR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:227:1: protection : ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL );
    public final void protection() throws RecognitionException {
        int protection_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:227:12: ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL )
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:228:1: mixinDef : mixinHeader mixinBody ;
    public final void mixinDef() throws RecognitionException {
        int mixinDef_StartIndex = input.index();
        paraphrase.push("Mixin definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:229:3: ( mixinHeader mixinBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:229:5: mixinHeader mixinBody
            {
            pushFollow(FOLLOW_mixinHeader_in_mixinDef634);
            mixinHeader();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_mixinBody_in_mixinDef636);
            mixinBody();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:230:1: mixinHeader : docs ( facet )* ( mixinFlags )* KW_MIXIN id ( inheritance )? ;
    public final void mixinHeader() throws RecognitionException {
        int mixinHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:230:13: ( docs ( facet )* ( mixinFlags )* KW_MIXIN id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:230:15: docs ( facet )* ( mixinFlags )* KW_MIXIN id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_mixinHeader643);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:230:20: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_mixinHeader645);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:230:27: ( mixinFlags )*
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
            	    pushFollow(FOLLOW_mixinFlags_in_mixinHeader648);
            	    mixinFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,KW_MIXIN,FOLLOW_KW_MIXIN_in_mixinHeader651); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_mixinHeader653);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:230:51: ( inheritance )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==SP_COLON) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_mixinHeader655);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:231:1: mixinFlags : ( protection | KW_CONST | KW_STATIC | KW_FINAL );
    public final void mixinFlags() throws RecognitionException {
        int mixinFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:231:12: ( protection | KW_CONST | KW_STATIC | KW_FINAL )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:231:14: protection
                    {
                    pushFollow(FOLLOW_protection_in_mixinFlags663);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:231:27: KW_CONST
                    {
                    match(input,KW_CONST,FOLLOW_KW_CONST_in_mixinFlags667); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:231:38: KW_STATIC
                    {
                    match(input,KW_STATIC,FOLLOW_KW_STATIC_in_mixinFlags671); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:231:50: KW_FINAL
                    {
                    match(input,KW_FINAL,FOLLOW_KW_FINAL_in_mixinFlags675); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:232:1: mixinBody : bracketL ( slotDef )* bracketR ;
    public final void mixinBody() throws RecognitionException {
        int mixinBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:232:11: ( bracketL ( slotDef )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:232:13: bracketL ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_mixinBody682);
            bracketL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:232:22: ( slotDef )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==BRACKET_R) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==SP_PIPE||LA17_1==ID) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>=KW_RD_ONLY && LA17_0<=KW_VOID)||(LA17_0>=KW_ABSTRACT && LA17_0<=KW_ONCE)||LA17_0==SP_PIPE||(LA17_0>=AT && LA17_0<=ID)||LA17_0==DOC) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_mixinBody684);
            	    slotDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_mixinBody687);
            bracketR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:233:1: enumDef : enumHeader enumBody ;
    public final void enumDef() throws RecognitionException {
        int enumDef_StartIndex = input.index();
        paraphrase.push("Enumeration definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:234:3: ( enumHeader enumBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:234:5: enumHeader enumBody
            {
            pushFollow(FOLLOW_enumHeader_in_enumDef706);
            enumHeader();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_enumBody_in_enumDef708);
            enumBody();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:235:1: enumHeader : docs ( facet )* ( protection )? KW_ENUM id ( inheritance )? ;
    public final void enumHeader() throws RecognitionException {
        int enumHeader_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:235:12: ( docs ( facet )* ( protection )? KW_ENUM id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:235:17: docs ( facet )* ( protection )? KW_ENUM id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_enumHeader718);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:235:22: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_enumHeader720);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:235:29: ( protection )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=KW_PRIVATE && LA19_0<=KW_INTERNAL)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    {
                    pushFollow(FOLLOW_protection_in_enumHeader723);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,KW_ENUM,FOLLOW_KW_ENUM_in_enumHeader726); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_enumHeader728);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:235:52: ( inheritance )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==SP_COLON) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_enumHeader730);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:236:1: enumBody : bracketL enumValDefs ( slotDef )* bracketR ;
    public final void enumBody() throws RecognitionException {
        int enumBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:10: ( bracketL enumValDefs ( slotDef )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:12: bracketL enumValDefs ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_enumBody738);
            bracketL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_enumValDefs_in_enumBody740);
            enumValDefs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:33: ( slotDef )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==BRACKET_R) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==SP_PIPE||LA21_1==ID) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>=KW_RD_ONLY && LA21_0<=KW_VOID)||(LA21_0>=KW_ABSTRACT && LA21_0<=KW_ONCE)||LA21_0==SP_PIPE||(LA21_0>=AT && LA21_0<=ID)||LA21_0==DOC) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_enumBody742);
            	    slotDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_enumBody745);
            bracketR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:237:1: inheritance : SP_COLON typeList ;
    public final void inheritance() throws RecognitionException {
        int inheritance_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:237:14: ( SP_COLON typeList )
            // src/net/colar/netbeans/fan/antlr/Fan.g:237:16: SP_COLON typeList
            {
            match(input,SP_COLON,FOLLOW_SP_COLON_in_inheritance754); if (state.failed) return ;
            pushFollow(FOLLOW_typeList_in_inheritance756);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:238:1: enumValDefs : enumValDef ( SP_COMMA enumValDef )* eos ;
    public final void enumValDefs() throws RecognitionException {
        int enumValDefs_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:238:14: ( enumValDef ( SP_COMMA enumValDef )* eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:238:16: enumValDef ( SP_COMMA enumValDef )* eos
            {
            pushFollow(FOLLOW_enumValDef_in_enumValDefs764);
            enumValDef();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:238:27: ( SP_COMMA enumValDef )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==SP_COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:238:28: SP_COMMA enumValDef
            	    {
            	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_enumValDefs767); if (state.failed) return ;
            	    pushFollow(FOLLOW_enumValDef_in_enumValDefs770);
            	    enumValDef();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            pushFollow(FOLLOW_eos_in_enumValDefs774);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:239:1: enumValDef : docs id ( parL ( args )? parR )? ;
    public final void enumValDef() throws RecognitionException {
        int enumValDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:239:13: ( docs id ( parL ( args )? parR )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:239:15: docs id ( parL ( args )? parR )?
            {
            pushFollow(FOLLOW_docs_in_enumValDef782);
            docs();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_enumValDef784);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:239:23: ( parL ( args )? parR )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BRACKET_L) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:239:24: parL ( args )? parR
                    {
                    pushFollow(FOLLOW_parL_in_enumValDef787);
                    parL();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:239:29: ( args )?
                    int alt23=2;
                    alt23 = dfa23.predict(input);
                    switch (alt23) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                            {
                            pushFollow(FOLLOW_args_in_enumValDef789);
                            args();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_parR_in_enumValDef792);
                    parR();

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
            if ( state.backtracking>0 ) { memoize(input, 23, enumValDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumValDef"


    // $ANTLR start "typeList"
    // src/net/colar/netbeans/fan/antlr/Fan.g:240:1: typeList : type ( SP_COMMA type )* ;
    public final void typeList() throws RecognitionException {
        int typeList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:240:10: ( type ( SP_COMMA type )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:240:14: type ( SP_COMMA type )*
            {
            pushFollow(FOLLOW_type_in_typeList803);
            type();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:240:19: ( SP_COMMA type )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==SP_COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:240:20: SP_COMMA type
            	    {
            	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_typeList806); if (state.failed) return ;
            	    pushFollow(FOLLOW_type_in_typeList808);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:242:1: type : typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ;
    public final void type() throws RecognitionException {
        int type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:242:14: ( typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:242:18: typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )*
            {
            pushFollow(FOLLOW_typeRoot_in_type828);
            typeRoot();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:242:28: ( SP_QMARK )?
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
                    match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type831); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:242:38: ( LIST_TYPE ( SP_QMARK )? )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:242:39: LIST_TYPE ( SP_QMARK )?
            	    {
            	    match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_type835); if (state.failed) return ;
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:242:49: ( SP_QMARK )?
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
            	            match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type837); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:243:1: nonMapType : ( funcType | simpleType );
    public final void nonMapType() throws RecognitionException {
        int nonMapType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:243:12: ( funcType | simpleType )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:243:14: funcType
                    {
                    pushFollow(FOLLOW_funcType_in_nonMapType848);
                    funcType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:243:25: simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_nonMapType852);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:244:1: typeRoot : ( mapType | nonMapType );
    public final void typeRoot() throws RecognitionException {
        int typeRoot_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:244:10: ( mapType | nonMapType )
            int alt30=2;
            switch ( input.LA(1) ) {
            case BRACKET_R:
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:244:12: mapType
                    {
                    pushFollow(FOLLOW_mapType_in_typeRoot859);
                    mapType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:244:22: nonMapType
                    {
                    pushFollow(FOLLOW_nonMapType_in_typeRoot863);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:245:1: simpleType : id ( SP_COLCOL id )? ;
    public final void simpleType() throws RecognitionException {
        int simpleType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:245:17: ( id ( SP_COLCOL id )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:245:21: id ( SP_COLCOL id )?
            {
            pushFollow(FOLLOW_id_in_simpleType877);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:245:24: ( SP_COLCOL id )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SP_COLCOL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:245:25: SP_COLCOL id
                    {
                    match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_simpleType880); if (state.failed) return ;
                    pushFollow(FOLLOW_id_in_simpleType882);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:247:1: mapType : ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? ;
    public final void mapType() throws RecognitionException {
        int mapType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:10: ( ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:12: ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )?
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:12: ( sq_bracketL )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==BRACKET_R) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: sq_bracketL
                    {
                    pushFollow(FOLLOW_sq_bracketL_in_mapType893);
                    sq_bracketL();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_nonMapType_in_mapType896);
            nonMapType();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:36: ( SP_QMARK )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==SP_QMARK) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType898); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:247:46: ( LIST_TYPE ( SP_QMARK )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LIST_TYPE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:247:47: LIST_TYPE ( SP_QMARK )?
            	    {
            	    match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_mapType902); if (state.failed) return ;
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:247:57: ( SP_QMARK )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==SP_QMARK) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType904); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:248:5: ({...}? SP_COLON {...}? type )+
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:248:6: {...}? SP_COLON {...}? type
            	    {
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    match(input,SP_COLON,FOLLOW_SP_COLON_in_mapType916); if (state.failed) return ;
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    pushFollow(FOLLOW_type_in_mapType920);
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

            // src/net/colar/netbeans/fan/antlr/Fan.g:248:56: ( sq_bracketR )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==BRACKET_R) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred49_Fan()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: sq_bracketR
                    {
                    pushFollow(FOLLOW_sq_bracketR_in_mapType924);
                    sq_bracketR();

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
            if ( state.backtracking>0 ) { memoize(input, 29, mapType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "mapType"


    // $ANTLR start "funcType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:249:1: funcType : SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE ;
    public final void funcType() throws RecognitionException {
        int funcType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:249:11: ( SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE )
            // src/net/colar/netbeans/fan/antlr/Fan.g:249:13: SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE
            {
            match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType933); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:249:21: ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==SP_COMMA) ) {
                alt39=1;
            }
            else if ( (LA39_0==SP_PIPE||LA39_0==ID||LA39_0==BRACKET_R) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:22: SP_COMMA
                    {
                    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_funcType936); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:34: formals ( ( OP_ARROW )=> assignedType )?
                    {
                    pushFollow(FOLLOW_formals_in_funcType941);
                    formals();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:42: ( ( OP_ARROW )=> assignedType )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==OP_ARROW) && (synpred51_Fan())) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:249:43: ( OP_ARROW )=> assignedType
                            {
                            pushFollow(FOLLOW_assignedType_in_funcType948);
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:73: ( ( OP_ARROW )=> assignedType )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:73: ( ( OP_ARROW )=> assignedType )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:74: ( OP_ARROW )=> assignedType
                    {
                    pushFollow(FOLLOW_assignedType_in_funcType960);
                    assignedType();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;

            }

            match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType964); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:250:1: assignedType : OP_ARROW type ;
    public final void assignedType() throws RecognitionException {
        int assignedType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:250:14: ( OP_ARROW type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:250:16: OP_ARROW type
            {
            match(input,OP_ARROW,FOLLOW_OP_ARROW_in_assignedType971); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_assignedType973);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:251:1: formals : formal ( SP_COMMA formal )* ;
    public final void formals() throws RecognitionException {
        int formals_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:251:10: ( formal ( SP_COMMA formal )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:251:14: formal ( SP_COMMA formal )*
            {
            pushFollow(FOLLOW_formal_in_formals983);
            formal();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:251:21: ( SP_COMMA formal )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==SP_COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:251:22: SP_COMMA formal
            	    {
            	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_formals986); if (state.failed) return ;
            	    pushFollow(FOLLOW_formal_in_formals988);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:252:1: formal : ( formalFull | formalTypeOnly | formalInferred );
    public final void formal() throws RecognitionException {
        int formal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:252:9: ( formalFull | formalTypeOnly | formalInferred )
            int alt41=3;
            switch ( input.LA(1) ) {
            case BRACKET_R:
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:252:11: formalFull
                    {
                    pushFollow(FOLLOW_formalFull_in_formal998);
                    formalFull();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:252:24: formalTypeOnly
                    {
                    pushFollow(FOLLOW_formalTypeOnly_in_formal1002);
                    formalTypeOnly();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:252:41: formalInferred
                    {
                    pushFollow(FOLLOW_formalInferred_in_formal1006);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:253:1: formalFull : type id ;
    public final void formalFull() throws RecognitionException {
        int formalFull_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:17: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:19: type id
            {
            pushFollow(FOLLOW_type_in_formalFull1018);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_formalFull1020);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:254:1: formalTypeOnly : type ;
    public final void formalTypeOnly() throws RecognitionException {
        int formalTypeOnly_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:254:17: ( type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:254:21: type
            {
            pushFollow(FOLLOW_type_in_formalTypeOnly1030);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:255:1: formalInferred : id ;
    public final void formalInferred() throws RecognitionException {
        int formalInferred_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:255:17: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:255:21: id
            {
            pushFollow(FOLLOW_id_in_formalInferred1040);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:256:1: slotDef : ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) ;
    public final void slotDef() throws RecognitionException {
        int slotDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:256:10: ( ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:256:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:256:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:256:13: ( KW_STATIC bracketL )=> staticBlock
                    {
                    pushFollow(FOLLOW_staticBlock_in_slotDef1056);
                    staticBlock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:257:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:257:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:257:6: docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    {
                    pushFollow(FOLLOW_docs_in_slotDef1064);
                    docs();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:257:11: ( facet )*
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
                    	    pushFollow(FOLLOW_facet_in_slotDef1066);
                    	    facet();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:258:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    int alt43=3;
                    alt43 = dfa43.predict(input);
                    switch (alt43) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:259:7: ( ( ctorFlags )* KW_NEW )=> ctorDef
                            {
                            pushFollow(FOLLOW_ctorDef_in_slotDef1089);
                            ctorDef();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:260:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef
                            {
                            pushFollow(FOLLOW_methodDef_in_slotDef1116);
                            methodDef();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:261:7: fieldDef
                            {
                            pushFollow(FOLLOW_fieldDef_in_slotDef1126);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:265:1: fieldDef : docs ( facet )* fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) ;
    public final void fieldDef() throws RecognitionException {
        int fieldDef_StartIndex = input.index();
        paraphrase.push("Field definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:3: ( docs ( facet )* fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:5: docs ( facet )* fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            {
            pushFollow(FOLLOW_docs_in_fieldDef1162);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:10: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_fieldDef1164);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            pushFollow(FOLLOW_fieldFlags_in_fieldDef1167);
            fieldFlags();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_typeId_in_fieldDef1169);
            typeId();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:35: ( AS_INIT_VAL expr )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==AS_INIT_VAL) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:266:36: AS_INIT_VAL expr
                    {
                    match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_fieldDef1172); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_fieldDef1174);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:267:5: ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==BRACKET_L) ) {
                alt52=1;
            }
            else if ( (LA52_0==EOF||(LA52_0>=KW_RD_ONLY && LA52_0<=KW_VOID)||(LA52_0>=KW_ABSTRACT && LA52_0<=KW_ONCE)||LA52_0==SP_PIPE||LA52_0==SP_SEMI||(LA52_0>=AT && LA52_0<=ID)||LA52_0==DOC||LA52_0==BRACKET_R) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:268:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:268:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:268:6: bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR
                    {
                    pushFollow(FOLLOW_bracketL_in_fieldDef1189);
                    bracketL();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:268:15: ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+
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
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:268:16: ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )?
                    	    {
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:268:16: ( protection )?
                    	    int alt47=2;
                    	    int LA47_0 = input.LA(1);

                    	    if ( ((LA47_0>=KW_PRIVATE && LA47_0<=KW_INTERNAL)) ) {
                    	        alt47=1;
                    	    }
                    	    switch (alt47) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    	            {
                    	            pushFollow(FOLLOW_protection_in_fieldDef1192);
                    	            protection();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:268:28: ( getter | setter )
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
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:268:29: getter
                    	            {
                    	            pushFollow(FOLLOW_getter_in_fieldDef1196);
                    	            getter();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:268:38: setter
                    	            {
                    	            pushFollow(FOLLOW_setter_in_fieldDef1200);
                    	            setter();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:268:46: ( SP_SEMI )?
                    	    int alt49=2;
                    	    int LA49_0 = input.LA(1);

                    	    if ( (LA49_0==SP_SEMI) ) {
                    	        alt49=1;
                    	    }
                    	    switch (alt49) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
                    	            {
                    	            match(input,SP_SEMI,FOLLOW_SP_SEMI_in_fieldDef1203); if (state.failed) return ;

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:268:55: ( block )?
                    	    int alt50=2;
                    	    alt50 = dfa50.predict(input);
                    	    switch (alt50) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: block
                    	            {
                    	            pushFollow(FOLLOW_block_in_fieldDef1206);
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

                    pushFollow(FOLLOW_bracketR_in_fieldDef1211);
                    bracketR();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:269:7: eos
                    {
                    pushFollow(FOLLOW_eos_in_fieldDef1220);
                    eos();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:271:1: typeId : ( ( type id )=> typeAndId | id ) ;
    public final void typeId() throws RecognitionException {
        int typeId_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:9: ( ( ( type id )=> typeAndId | id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:11: ( ( type id )=> typeAndId | id )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:11: ( ( type id )=> typeAndId | id )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:12: ( type id )=> typeAndId
                    {
                    pushFollow(FOLLOW_typeAndId_in_typeId1237);
                    typeAndId();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:35: id
                    {
                    pushFollow(FOLLOW_id_in_typeId1241);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:272:1: typeAndId : type id ;
    public final void typeAndId() throws RecognitionException {
        int typeAndId_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:11: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:13: type id
            {
            pushFollow(FOLLOW_type_in_typeAndId1249);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_typeAndId1251);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:273:1: fieldFlags : ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* ;
    public final void fieldFlags() throws RecognitionException {
        int fieldFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:12: ( ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:273:15: KW_ABSTRACT
            	    {
            	    match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_fieldFlags1259); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:273:29: KW_RD_ONLY
            	    {
            	    match(input,KW_RD_ONLY,FOLLOW_KW_RD_ONLY_in_fieldFlags1263); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:273:42: KW_CONST
            	    {
            	    match(input,KW_CONST,FOLLOW_KW_CONST_in_fieldFlags1267); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:273:53: KW_STATIC
            	    {
            	    match(input,KW_STATIC,FOLLOW_KW_STATIC_in_fieldFlags1271); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:273:65: KW_NATIVE
            	    {
            	    match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_fieldFlags1275); if (state.failed) return ;

            	    }
            	    break;
            	case 6 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:273:77: KW_VOLATILE
            	    {
            	    match(input,KW_VOLATILE,FOLLOW_KW_VOLATILE_in_fieldFlags1279); if (state.failed) return ;

            	    }
            	    break;
            	case 7 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:273:91: KW_OVERRIDE
            	    {
            	    match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_fieldFlags1283); if (state.failed) return ;

            	    }
            	    break;
            	case 8 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:273:105: KW_VIRTUAL
            	    {
            	    match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_fieldFlags1287); if (state.failed) return ;

            	    }
            	    break;
            	case 9 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:273:118: KW_FINAL
            	    {
            	    match(input,KW_FINAL,FOLLOW_KW_FINAL_in_fieldFlags1291); if (state.failed) return ;

            	    }
            	    break;
            	case 10 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:273:129: protection
            	    {
            	    pushFollow(FOLLOW_protection_in_fieldFlags1295);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:274:1: methodDef : docs ( facet )* ( methodFlags )* ( type | KW_VOID ) id parL params parR methodBody ;
    public final void methodDef() throws RecognitionException {
        int methodDef_StartIndex = input.index();
        paraphrase.push("Method definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:3: ( docs ( facet )* ( methodFlags )* ( type | KW_VOID ) id parL params parR methodBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:5: docs ( facet )* ( methodFlags )* ( type | KW_VOID ) id parL params parR methodBody
            {
            pushFollow(FOLLOW_docs_in_methodDef1315);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:10: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_methodDef1317);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:275:17: ( methodFlags )*
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
            	    pushFollow(FOLLOW_methodFlags_in_methodDef1320);
            	    methodFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:275:30: ( type | KW_VOID )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==SP_PIPE||LA57_0==ID||LA57_0==BRACKET_R) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:275:31: type
                    {
                    pushFollow(FOLLOW_type_in_methodDef1324);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:275:38: KW_VOID
                    {
                    match(input,KW_VOID,FOLLOW_KW_VOID_in_methodDef1328); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_methodDef1331);
            id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parL_in_methodDef1333);
            parL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_params_in_methodDef1335);
            params();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parR_in_methodDef1337);
            parR();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_methodBody_in_methodDef1339);
            methodBody();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:276:1: methodFlags : ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL );
    public final void methodFlags() throws RecognitionException {
        int methodFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:276:13: ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:15: protection
                    {
                    pushFollow(FOLLOW_protection_in_methodFlags1346);
                    protection();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:28: KW_VIRTUAL
                    {
                    match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_methodFlags1350); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:41: KW_OVERRIDE
                    {
                    match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_methodFlags1354); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:55: KW_ABSTRACT
                    {
                    match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_methodFlags1358); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:69: KW_STATIC
                    {
                    match(input,KW_STATIC,FOLLOW_KW_STATIC_in_methodFlags1362); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:81: KW_ONCE
                    {
                    match(input,KW_ONCE,FOLLOW_KW_ONCE_in_methodFlags1366); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:277:5: KW_NATIVE
                    {
                    match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_methodFlags1374); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:277:17: KW_FINAL
                    {
                    match(input,KW_FINAL,FOLLOW_KW_FINAL_in_methodFlags1378); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:278:1: params : ( param ( SP_COMMA param )* )? ;
    public final void params() throws RecognitionException {
        int params_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:9: ( ( param ( SP_COMMA param )* )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:11: ( param ( SP_COMMA param )* )?
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:11: ( param ( SP_COMMA param )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==SP_PIPE||LA60_0==ID||LA60_0==BRACKET_R) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:278:12: param ( SP_COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_params1387);
                    param();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:278:18: ( SP_COMMA param )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==SP_COMMA) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:278:19: SP_COMMA param
                    	    {
                    	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_params1390); if (state.failed) return ;
                    	    pushFollow(FOLLOW_param_in_params1392);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:279:1: param : type id ( AS_INIT_VAL expr )? ;
    public final void param() throws RecognitionException {
        int param_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:9: ( type id ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:11: type id ( AS_INIT_VAL expr )?
            {
            pushFollow(FOLLOW_type_in_param1405);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_param1407);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:19: ( AS_INIT_VAL expr )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==AS_INIT_VAL) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:279:20: AS_INIT_VAL expr
                    {
                    match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_param1410); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_param1412);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:280:1: methodBody : ( ( '{' ( stmt )* bracketR ) | eos );
    public final void methodBody() throws RecognitionException {
        int methodBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:12: ( ( '{' ( stmt )* bracketR ) | eos )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==BRACKET_L) ) {
                alt63=1;
            }
            else if ( (LA63_0==EOF||(LA63_0>=KW_RD_ONLY && LA63_0<=KW_VOID)||(LA63_0>=KW_ABSTRACT && LA63_0<=KW_ONCE)||LA63_0==SP_PIPE||LA63_0==SP_SEMI||(LA63_0>=AT && LA63_0<=ID)||LA63_0==DOC||LA63_0==BRACKET_R) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:280:14: ( '{' ( stmt )* bracketR )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:280:14: ( '{' ( stmt )* bracketR )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:280:15: '{' ( stmt )* bracketR
                    {
                    match(input,BRACKET_L,FOLLOW_BRACKET_L_in_methodBody1422); if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:280:19: ( stmt )*
                    loop62:
                    do {
                        int alt62=2;
                        alt62 = dfa62.predict(input);
                        switch (alt62) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_methodBody1424);
                    	    stmt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    pushFollow(FOLLOW_bracketR_in_methodBody1427);
                    bracketR();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:280:37: eos
                    {
                    pushFollow(FOLLOW_eos_in_methodBody1432);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:281:1: ctorDef : docs ( facet )* ( ctorFlags )* KW_NEW id parL params parR ( ( SP_COLON )=> ctorChain )? methodBody ;
    public final void ctorDef() throws RecognitionException {
        int ctorDef_StartIndex = input.index();
        paraphrase.push("Constructor definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:3: ( docs ( facet )* ( ctorFlags )* KW_NEW id parL params parR ( ( SP_COLON )=> ctorChain )? methodBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:5: docs ( facet )* ( ctorFlags )* KW_NEW id parL params parR ( ( SP_COLON )=> ctorChain )? methodBody
            {
            pushFollow(FOLLOW_docs_in_ctorDef1451);
            docs();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:10: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_ctorDef1453);
            	    facet();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:282:17: ( ctorFlags )*
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
            	    pushFollow(FOLLOW_ctorFlags_in_ctorDef1456);
            	    ctorFlags();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            match(input,KW_NEW,FOLLOW_KW_NEW_in_ctorDef1459); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_ctorDef1461);
            id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parL_in_ctorDef1463);
            parL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_params_in_ctorDef1465);
            params();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parR_in_ctorDef1467);
            parR();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:55: ( ( SP_COLON )=> ctorChain )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==SP_COLON) && (synpred100_Fan())) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:282:56: ( SP_COLON )=> ctorChain
                    {
                    pushFollow(FOLLOW_ctorChain_in_ctorDef1474);
                    ctorChain();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_ctorDef1478);
            methodBody();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:283:1: ctorFlags : protection ;
    public final void ctorFlags() throws RecognitionException {
        int ctorFlags_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:11: ( protection )
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:13: protection
            {
            pushFollow(FOLLOW_protection_in_ctorFlags1485);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:284:1: ctorChain : SP_COLON ( ctorChainThis | ctorChainSuper ) ;
    public final void ctorChain() throws RecognitionException {
        int ctorChain_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:11: ( SP_COLON ( ctorChainThis | ctorChainSuper ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:13: SP_COLON ( ctorChainThis | ctorChainSuper )
            {
            match(input,SP_COLON,FOLLOW_SP_COLON_in_ctorChain1492); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:22: ( ctorChainThis | ctorChainSuper )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:284:23: ctorChainThis
                    {
                    pushFollow(FOLLOW_ctorChainThis_in_ctorChain1495);
                    ctorChainThis();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:284:39: ctorChainSuper
                    {
                    pushFollow(FOLLOW_ctorChainSuper_in_ctorChain1499);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:286:1: ctorChainThis : KW_THIS DOT id parL ( args )? parR ;
    public final void ctorChainThis() throws RecognitionException {
        int ctorChainThis_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:15: ( KW_THIS DOT id parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:17: KW_THIS DOT id parL ( args )? parR
            {
            match(input,KW_THIS,FOLLOW_KW_THIS_in_ctorChainThis1508); if (state.failed) return ;
            match(input,DOT,FOLLOW_DOT_in_ctorChainThis1510); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_ctorChainThis1512);
            id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parL_in_ctorChainThis1514);
            parL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:37: ( args )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainThis1516);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainThis1519);
            parR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:287:1: ctorChainSuper : KW_SUPER ( DOT id )? parL ( args )? parR ;
    public final void ctorChainSuper() throws RecognitionException {
        int ctorChainSuper_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:16: ( KW_SUPER ( DOT id )? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:18: KW_SUPER ( DOT id )? parL ( args )? parR
            {
            match(input,KW_SUPER,FOLLOW_KW_SUPER_in_ctorChainSuper1526); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:27: ( DOT id )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==DOT) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:287:28: DOT id
                    {
                    match(input,DOT,FOLLOW_DOT_in_ctorChainSuper1529); if (state.failed) return ;
                    pushFollow(FOLLOW_id_in_ctorChainSuper1531);
                    id();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_parL_in_ctorChainSuper1535);
            parL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:42: ( args )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainSuper1537);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainSuper1540);
            parR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:289:1: staticBlock : KW_STATIC block ;
    public final void staticBlock() throws RecognitionException {
        int staticBlock_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:13: ( KW_STATIC block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:15: KW_STATIC block
            {
            match(input,KW_STATIC,FOLLOW_KW_STATIC_in_staticBlock1548); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_staticBlock1550);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:290:1: block : ( ( bracketL )=> multiStmt | stmt ) ;
    public final void block() throws RecognitionException {
        int block_StartIndex = input.index();
        paraphrase.push("Block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:3: ( ( ( bracketL )=> multiStmt | stmt ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:5: ( ( bracketL )=> multiStmt | stmt )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:5: ( ( bracketL )=> multiStmt | stmt )
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:291:6: ( bracketL )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_block1575);
                    multiStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:291:30: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_block1579);
                    stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:292:1: multiStmt : bracketL ( stmt )* bracketR ;
    public final void multiStmt() throws RecognitionException {
        int multiStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:292:11: ( bracketL ( stmt )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:292:13: bracketL ( stmt )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_multiStmt1587);
            bracketL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:292:23: ( stmt )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==BRACKET_R) ) {
                    int LA72_1 = input.LA(2);

                    if ( (synpred106_Fan()) ) {
                        alt72=1;
                    }


                }
                else if ( ((LA72_0>=KW_BREAK && LA72_0<=KW_TRY)||(LA72_0>=KW_THIS && LA72_0<=KW_SUPER)||(LA72_0>=KW_NULL && LA72_0<=KW_FALSE)||LA72_0==SP_PIPE||LA72_0==OP_CURRY||(LA72_0>=OP_PLUS && LA72_0<=OP_MINUS)||(LA72_0>=OP_BANG && LA72_0<=OP_TILDA)||(LA72_0>=AT && LA72_0<=OP_POUND)||(LA72_0>=NUMBER && LA72_0<=BRACKET_L)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_multiStmt1590);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_multiStmt1593);
            bracketR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:293:1: stmt : ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) ;
    public final void stmt() throws RecognitionException {
        int stmt_StartIndex = input.index();
        paraphrase.push("Statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:295:3: ( ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:295:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:295:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            int alt73=11;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:295:6: g_if
                    {
                    pushFollow(FOLLOW_g_if_in_stmt1612);
                    g_if();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:295:13: g_for
                    {
                    pushFollow(FOLLOW_g_for_in_stmt1616);
                    g_for();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:295:21: g_while
                    {
                    pushFollow(FOLLOW_g_while_in_stmt1620);
                    g_while();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:295:31: g_break
                    {
                    pushFollow(FOLLOW_g_break_in_stmt1624);
                    g_break();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:296:4: g_continue
                    {
                    pushFollow(FOLLOW_g_continue_in_stmt1631);
                    g_continue();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:296:17: g_return
                    {
                    pushFollow(FOLLOW_g_return_in_stmt1635);
                    g_return();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:296:28: g_switch
                    {
                    pushFollow(FOLLOW_g_switch_in_stmt1639);
                    g_switch();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:297:4: g_throw
                    {
                    pushFollow(FOLLOW_g_throw_in_stmt1646);
                    g_throw();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:297:14: g_try
                    {
                    pushFollow(FOLLOW_g_try_in_stmt1650);
                    g_try();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:297:22: exprStmt
                    {
                    pushFollow(FOLLOW_exprStmt_in_stmt1654);
                    exprStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:297:33: localDef
                    {
                    pushFollow(FOLLOW_localDef_in_stmt1658);
                    localDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:304:1: g_break : KW_BREAK eos ;
    public final void g_break() throws RecognitionException {
        int g_break_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:10: ( KW_BREAK eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:12: KW_BREAK eos
            {
            match(input,KW_BREAK,FOLLOW_KW_BREAK_in_g_break1671); if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_g_break1673);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:305:1: g_continue : KW_CONTINUE eos ;
    public final void g_continue() throws RecognitionException {
        int g_continue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:12: ( KW_CONTINUE eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:14: KW_CONTINUE eos
            {
            match(input,KW_CONTINUE,FOLLOW_KW_CONTINUE_in_g_continue1680); if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_g_continue1682);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:306:1: g_for : KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ;
    public final void g_for() throws RecognitionException {
        int g_for_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:306:8: ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:306:10: KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block
            {
            match(input,KW_FOR,FOLLOW_KW_FOR_in_g_for1690); if (state.failed) return ;
            pushFollow(FOLLOW_parL_in_g_for1692);
            parL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:306:22: ( forInit )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=KW_THIS && LA74_0<=KW_SUPER)||(LA74_0>=KW_NULL && LA74_0<=KW_FALSE)||LA74_0==SP_PIPE||LA74_0==OP_CURRY||(LA74_0>=OP_PLUS && LA74_0<=OP_MINUS)||(LA74_0>=OP_BANG && LA74_0<=OP_TILDA)||(LA74_0>=AT && LA74_0<=OP_POUND)||(LA74_0>=NUMBER && LA74_0<=BRACKET_R)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_g_for1694);
                    forInit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for1697); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:306:39: ( expr )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=KW_THIS && LA75_0<=KW_SUPER)||(LA75_0>=KW_NULL && LA75_0<=KW_FALSE)||LA75_0==SP_PIPE||LA75_0==OP_CURRY||(LA75_0>=OP_PLUS && LA75_0<=OP_MINUS)||(LA75_0>=OP_BANG && LA75_0<=OP_TILDA)||(LA75_0>=AT && LA75_0<=OP_POUND)||(LA75_0>=NUMBER && LA75_0<=BRACKET_R)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for1699);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for1702); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:306:53: ( expr )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for1704);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_g_for1707);
            parR();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_block_in_g_for1710);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:307:1: g_if : KW_IF parL expr parR block ( KW_ELSE block )? ;
    public final void g_if() throws RecognitionException {
        int g_if_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:7: ( KW_IF parL expr parR block ( KW_ELSE block )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:9: KW_IF parL expr parR block ( KW_ELSE block )?
            {
            match(input,KW_IF,FOLLOW_KW_IF_in_g_if1718); if (state.failed) return ;
            pushFollow(FOLLOW_parL_in_g_if1720);
            parL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_if1722);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parR_in_g_if1724);
            parR();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_block_in_g_if1726);
            block();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:308:5: ( KW_ELSE block )?
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:6: KW_ELSE block
                    {
                    match(input,KW_ELSE,FOLLOW_KW_ELSE_in_g_if1733); if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_g_if1735);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:309:1: g_return : KW_RETURN ( eos | expr eos ) ;
    public final void g_return() throws RecognitionException {
        int g_return_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:10: ( KW_RETURN ( eos | expr eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:12: KW_RETURN ( eos | expr eos )
            {
            match(input,KW_RETURN,FOLLOW_KW_RETURN_in_g_return1744); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:22: ( eos | expr eos )
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:309:23: eos
                    {
                    pushFollow(FOLLOW_eos_in_g_return1747);
                    eos();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:309:29: expr eos
                    {
                    pushFollow(FOLLOW_expr_in_g_return1751);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_eos_in_g_return1753);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:310:1: g_switch : KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR ;
    public final void g_switch() throws RecognitionException {
        int g_switch_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:10: ( KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:12: KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR
            {
            match(input,KW_SWITCH,FOLLOW_KW_SWITCH_in_g_switch1761); if (state.failed) return ;
            pushFollow(FOLLOW_parL_in_g_switch1763);
            parL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_switch1765);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parR_in_g_switch1767);
            parR();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_bracketL_in_g_switch1769);
            bracketL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:46: ( g_case )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==KW_CASE) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:310:47: g_case
            	    {
            	    pushFollow(FOLLOW_g_case_in_g_switch1772);
            	    g_case();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:310:56: ( g_default )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==KW_DEFAULT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:310:57: g_default
                    {
                    pushFollow(FOLLOW_g_default_in_g_switch1777);
                    g_default();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_bracketR_in_g_switch1781);
            bracketR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:311:1: g_throw : KW_THROW expr eos ;
    public final void g_throw() throws RecognitionException {
        int g_throw_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:311:10: ( KW_THROW expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:311:12: KW_THROW expr eos
            {
            match(input,KW_THROW,FOLLOW_KW_THROW_in_g_throw1789); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_throw1791);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_g_throw1793);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:312:1: g_while : KW_WHILE parL expr parR block ;
    public final void g_while() throws RecognitionException {
        int g_while_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:312:10: ( KW_WHILE parL expr parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:312:12: KW_WHILE parL expr parR block
            {
            match(input,KW_WHILE,FOLLOW_KW_WHILE_in_g_while1801); if (state.failed) return ;
            pushFollow(FOLLOW_parL_in_g_while1803);
            parL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_while1805);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parR_in_g_while1807);
            parR();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_block_in_g_while1809);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:313:1: g_try : KW_TRY ( ( bracketL )=> try_long | ( stmt )* ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? ;
    public final void g_try() throws RecognitionException {
        int g_try_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:8: ( KW_TRY ( ( bracketL )=> try_long | ( stmt )* ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:10: KW_TRY ( ( bracketL )=> try_long | ( stmt )* ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )?
            {
            match(input,KW_TRY,FOLLOW_KW_TRY_in_g_try1817); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:17: ( ( bracketL )=> try_long | ( stmt )* )
            int alt82=2;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:18: ( bracketL )=> try_long
                    {
                    pushFollow(FOLLOW_try_long_in_g_try1824);
                    try_long();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:41: ( stmt )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:41: ( stmt )*
                    loop81:
                    do {
                        int alt81=2;
                        alt81 = dfa81.predict(input);
                        switch (alt81) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_try1828);
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

            // src/net/colar/netbeans/fan/antlr/Fan.g:313:48: ( ( KW_CATCH )=> g_catch )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:313:49: ( KW_CATCH )=> g_catch
            	    {
            	    pushFollow(FOLLOW_g_catch_in_g_try1837);
            	    g_catch();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:313:71: ( ( KW_FINALLY )=> g_finally )?
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:72: ( KW_FINALLY )=> g_finally
                    {
                    pushFollow(FOLLOW_g_finally_in_g_try1846);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:314:1: try_long : bracketL ( stmt )* bracketR ;
    public final void try_long() throws RecognitionException {
        int try_long_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:10: ( bracketL ( stmt )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:12: bracketL ( stmt )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_try_long1855);
            bracketL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:21: ( stmt )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==BRACKET_R) ) {
                    int LA85_1 = input.LA(2);

                    if ( (synpred128_Fan()) ) {
                        alt85=1;
                    }


                }
                else if ( ((LA85_0>=KW_BREAK && LA85_0<=KW_TRY)||(LA85_0>=KW_THIS && LA85_0<=KW_SUPER)||(LA85_0>=KW_NULL && LA85_0<=KW_FALSE)||LA85_0==SP_PIPE||LA85_0==OP_CURRY||(LA85_0>=OP_PLUS && LA85_0<=OP_MINUS)||(LA85_0>=OP_BANG && LA85_0<=OP_TILDA)||(LA85_0>=AT && LA85_0<=OP_POUND)||(LA85_0>=NUMBER && LA85_0<=BRACKET_L)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_try_long1857);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_try_long1860);
            bracketR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:315:1: exprStmt : expr eos ;
    public final void exprStmt() throws RecognitionException {
        int exprStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:315:10: ( expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:315:12: expr eos
            {
            pushFollow(FOLLOW_expr_in_exprStmt1867);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_eos_in_exprStmt1869);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:316:1: localDef : typeId ( AS_INIT_VAL expr )? eos ;
    public final void localDef() throws RecognitionException {
        int localDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:10: ( typeId ( AS_INIT_VAL expr )? eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:12: typeId ( AS_INIT_VAL expr )? eos
            {
            pushFollow(FOLLOW_typeId_in_localDef1876);
            typeId();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:19: ( AS_INIT_VAL expr )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==AS_INIT_VAL) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:20: AS_INIT_VAL expr
                    {
                    match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_localDef1879); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_localDef1881);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_eos_in_localDef1885);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:317:1: forInit : ( forInitDef | expr );
    public final void forInit() throws RecognitionException {
        int forInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:10: ( forInitDef | expr )
            int alt87=2;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:317:12: forInitDef
                    {
                    pushFollow(FOLLOW_forInitDef_in_forInit1893);
                    forInitDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:317:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_forInit1897);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:318:1: forInitDef : typeId ( AS_INIT_VAL expr )? ;
    public final void forInitDef() throws RecognitionException {
        int forInitDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:318:12: ( typeId ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:318:14: typeId ( AS_INIT_VAL expr )?
            {
            pushFollow(FOLLOW_typeId_in_forInitDef1904);
            typeId();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:318:21: ( AS_INIT_VAL expr )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==AS_INIT_VAL) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:318:22: AS_INIT_VAL expr
                    {
                    match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_forInitDef1907); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_forInitDef1909);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:320:1: g_catch : KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | ( stmt )* ) ;
    public final void g_catch() throws RecognitionException {
        int g_catch_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:320:10: ( KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | ( stmt )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:320:12: KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | ( stmt )* )
            {
            match(input,KW_CATCH,FOLLOW_KW_CATCH_in_g_catch1920); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:320:21: ( catchDef )?
            int alt89=2;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: catchDef
                    {
                    pushFollow(FOLLOW_catchDef_in_g_catch1922);
                    catchDef();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:320:31: ( ( bracketL )=> catch_long | ( stmt )* )
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:320:32: ( bracketL )=> catch_long
                    {
                    pushFollow(FOLLOW_catch_long_in_g_catch1930);
                    catch_long();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:320:57: ( stmt )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:320:57: ( stmt )*
                    loop90:
                    do {
                        int alt90=2;
                        alt90 = dfa90.predict(input);
                        switch (alt90) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_catch1934);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:321:1: catch_long : bracketL ( stmt )* bracketR ;
    public final void catch_long() throws RecognitionException {
        int catch_long_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:12: ( bracketL ( stmt )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:14: bracketL ( stmt )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_catch_long1943);
            bracketL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:23: ( stmt )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==BRACKET_R) ) {
                    int LA92_1 = input.LA(2);

                    if ( (synpred135_Fan()) ) {
                        alt92=1;
                    }


                }
                else if ( ((LA92_0>=KW_BREAK && LA92_0<=KW_TRY)||(LA92_0>=KW_THIS && LA92_0<=KW_SUPER)||(LA92_0>=KW_NULL && LA92_0<=KW_FALSE)||LA92_0==SP_PIPE||LA92_0==OP_CURRY||(LA92_0>=OP_PLUS && LA92_0<=OP_MINUS)||(LA92_0>=OP_BANG && LA92_0<=OP_TILDA)||(LA92_0>=AT && LA92_0<=OP_POUND)||(LA92_0>=NUMBER && LA92_0<=BRACKET_L)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_catch_long1945);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_catch_long1948);
            bracketR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:322:1: catchDef : parL type id parR ;
    public final void catchDef() throws RecognitionException {
        int catchDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:322:11: ( parL type id parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:322:13: parL type id parR
            {
            pushFollow(FOLLOW_parL_in_catchDef1956);
            parL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_type_in_catchDef1958);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_id_in_catchDef1960);
            id();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parR_in_catchDef1962);
            parR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:324:1: g_finally : KW_FINALLY ( ( bracketL )=> finally_long | ( stmt )* ) ;
    public final void g_finally() throws RecognitionException {
        int g_finally_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:324:11: ( KW_FINALLY ( ( bracketL )=> finally_long | ( stmt )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:324:13: KW_FINALLY ( ( bracketL )=> finally_long | ( stmt )* )
            {
            match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_g_finally1970); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:324:24: ( ( bracketL )=> finally_long | ( stmt )* )
            int alt94=2;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:324:25: ( bracketL )=> finally_long
                    {
                    pushFollow(FOLLOW_finally_long_in_g_finally1977);
                    finally_long();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:324:52: ( stmt )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:324:52: ( stmt )*
                    loop93:
                    do {
                        int alt93=2;
                        alt93 = dfa93.predict(input);
                        switch (alt93) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_finally1981);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:325:1: finally_long : bracketL ( stmt )* bracketR ;
    public final void finally_long() throws RecognitionException {
        int finally_long_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:14: ( bracketL ( stmt )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:16: bracketL ( stmt )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_finally_long1990);
            bracketL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:25: ( stmt )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==BRACKET_R) ) {
                    int LA95_1 = input.LA(2);

                    if ( (synpred138_Fan()) ) {
                        alt95=1;
                    }


                }
                else if ( ((LA95_0>=KW_BREAK && LA95_0<=KW_TRY)||(LA95_0>=KW_THIS && LA95_0<=KW_SUPER)||(LA95_0>=KW_NULL && LA95_0<=KW_FALSE)||LA95_0==SP_PIPE||LA95_0==OP_CURRY||(LA95_0>=OP_PLUS && LA95_0<=OP_MINUS)||(LA95_0>=OP_BANG && LA95_0<=OP_TILDA)||(LA95_0>=AT && LA95_0<=OP_POUND)||(LA95_0>=NUMBER && LA95_0<=BRACKET_L)) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_finally_long1992);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_finally_long1995);
            bracketR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:326:1: g_case : KW_CASE expr SP_COLON ( stmt )* ;
    public final void g_case() throws RecognitionException {
        int g_case_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:326:9: ( KW_CASE expr SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:326:11: KW_CASE expr SP_COLON ( stmt )*
            {
            match(input,KW_CASE,FOLLOW_KW_CASE_in_g_case2003); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_g_case2005);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLON,FOLLOW_SP_COLON_in_g_case2007); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:326:33: ( stmt )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==BRACKET_R) ) {
                    int LA96_2 = input.LA(2);

                    if ( (synpred139_Fan()) ) {
                        alt96=1;
                    }


                }
                else if ( ((LA96_0>=KW_BREAK && LA96_0<=KW_TRY)||(LA96_0>=KW_THIS && LA96_0<=KW_SUPER)||(LA96_0>=KW_NULL && LA96_0<=KW_FALSE)||LA96_0==SP_PIPE||LA96_0==OP_CURRY||(LA96_0>=OP_PLUS && LA96_0<=OP_MINUS)||(LA96_0>=OP_BANG && LA96_0<=OP_TILDA)||(LA96_0>=AT && LA96_0<=OP_POUND)||(LA96_0>=NUMBER && LA96_0<=BRACKET_L)) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_case2009);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:327:1: g_default : KW_DEFAULT SP_COLON ( stmt )* ;
    public final void g_default() throws RecognitionException {
        int g_default_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:11: ( KW_DEFAULT SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:13: KW_DEFAULT SP_COLON ( stmt )*
            {
            match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_g_default2017); if (state.failed) return ;
            match(input,SP_COLON,FOLLOW_SP_COLON_in_g_default2019); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:33: ( stmt )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==BRACKET_R) ) {
                    int LA97_1 = input.LA(2);

                    if ( (synpred140_Fan()) ) {
                        alt97=1;
                    }


                }
                else if ( ((LA97_0>=KW_BREAK && LA97_0<=KW_TRY)||(LA97_0>=KW_THIS && LA97_0<=KW_SUPER)||(LA97_0>=KW_NULL && LA97_0<=KW_FALSE)||LA97_0==SP_PIPE||LA97_0==OP_CURRY||(LA97_0>=OP_PLUS && LA97_0<=OP_MINUS)||(LA97_0>=OP_BANG && LA97_0<=OP_TILDA)||(LA97_0>=AT && LA97_0<=OP_POUND)||(LA97_0>=NUMBER && LA97_0<=BRACKET_L)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_default2021);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:330:1: expr : assignExpr ;
    public final void expr() throws RecognitionException {
        int expr_StartIndex = input.index();
        paraphrase.push("Expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:3: ( assignExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:5: assignExpr
            {
            pushFollow(FOLLOW_assignExpr_in_expr2042);
            assignExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:333:1: assignExpr : ternaryExpr ( assignOp assignExpr )? ;
    public final void assignExpr() throws RecognitionException {
        int assignExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:12: ( ternaryExpr ( assignOp assignExpr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:14: ternaryExpr ( assignOp assignExpr )?
            {
            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2049);
            ternaryExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:26: ( assignOp assignExpr )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=AS_EQUAL && LA98_0<=AS_ASSIGN_OP)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:333:27: assignOp assignExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2052);
                    assignOp();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_assignExpr_in_assignExpr2054);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:334:1: ternaryExpr : condOrExpr ( ternaryTail )? ;
    public final void ternaryExpr() throws RecognitionException {
        int ternaryExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:13: ( condOrExpr ( ternaryTail )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:15: condOrExpr ( ternaryTail )?
            {
            pushFollow(FOLLOW_condOrExpr_in_ternaryExpr2063);
            condOrExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:26: ( ternaryTail )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==SP_QMARK) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:334:27: ternaryTail
                    {
                    pushFollow(FOLLOW_ternaryTail_in_ternaryExpr2066);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:336:1: ternaryTail : SP_QMARK condOrExpr SP_COLON condOrExpr ;
    public final void ternaryTail() throws RecognitionException {
        int ternaryTail_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:336:13: ( SP_QMARK condOrExpr SP_COLON condOrExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:336:15: SP_QMARK condOrExpr SP_COLON condOrExpr
            {
            match(input,SP_QMARK,FOLLOW_SP_QMARK_in_ternaryTail2076); if (state.failed) return ;
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail2078);
            condOrExpr();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLON,FOLLOW_SP_COLON_in_ternaryTail2080); if (state.failed) return ;
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail2082);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:337:1: assignOp : ( AS_EQUAL | AS_ASSIGN_OP );
    public final void assignOp() throws RecognitionException {
        int assignOp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:10: ( AS_EQUAL | AS_ASSIGN_OP )
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:338:1: condOrExpr : condAndExpr ( OP_OR condAndExpr )* ;
    public final void condOrExpr() throws RecognitionException {
        int condOrExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:338:13: ( condAndExpr ( OP_OR condAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:338:15: condAndExpr ( OP_OR condAndExpr )*
            {
            pushFollow(FOLLOW_condAndExpr_in_condOrExpr2101);
            condAndExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:338:28: ( OP_OR condAndExpr )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==OP_OR) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:338:29: OP_OR condAndExpr
            	    {
            	    match(input,OP_OR,FOLLOW_OP_OR_in_condOrExpr2105); if (state.failed) return ;
            	    pushFollow(FOLLOW_condAndExpr_in_condOrExpr2108);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:339:1: condAndExpr : equalityExpr ( OP_AND equalityExpr )* ;
    public final void condAndExpr() throws RecognitionException {
        int condAndExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:339:14: ( equalityExpr ( OP_AND equalityExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:339:16: equalityExpr ( OP_AND equalityExpr )*
            {
            pushFollow(FOLLOW_equalityExpr_in_condAndExpr2118);
            equalityExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:339:29: ( OP_AND equalityExpr )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==OP_AND) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:339:30: OP_AND equalityExpr
            	    {
            	    match(input,OP_AND,FOLLOW_OP_AND_in_condAndExpr2121); if (state.failed) return ;
            	    pushFollow(FOLLOW_equalityExpr_in_condAndExpr2124);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:340:1: equalityExpr : relationalExpr ( CP_EQUALITY relationalExpr )* ;
    public final void equalityExpr() throws RecognitionException {
        int equalityExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:14: ( relationalExpr ( CP_EQUALITY relationalExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:16: relationalExpr ( CP_EQUALITY relationalExpr )*
            {
            pushFollow(FOLLOW_relationalExpr_in_equalityExpr2134);
            relationalExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:31: ( CP_EQUALITY relationalExpr )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==CP_EQUALITY) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:340:32: CP_EQUALITY relationalExpr
            	    {
            	    match(input,CP_EQUALITY,FOLLOW_CP_EQUALITY_in_equalityExpr2137); if (state.failed) return ;
            	    pushFollow(FOLLOW_relationalExpr_in_equalityExpr2139);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:342:1: relationalExpr : elvisExpr ( typeCheck | compare ) ;
    public final void relationalExpr() throws RecognitionException {
        int relationalExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:16: ( elvisExpr ( typeCheck | compare ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:20: elvisExpr ( typeCheck | compare )
            {
            pushFollow(FOLLOW_elvisExpr_in_relationalExpr2152);
            elvisExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:30: ( typeCheck | compare )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==KW_AS||(LA103_0>=KW_IS && LA103_0<=KW_ISNOT)) ) {
                alt103=1;
            }
            else if ( (LA103_0==EOF||(LA103_0>=KW_BREAK && LA103_0<=KW_USING)||(LA103_0>=KW_RD_ONLY && LA103_0<=KW_ELSE)||(LA103_0>=KW_NULL && LA103_0<=KW_FALSE)||(LA103_0>=SP_COLON && LA103_0<=SP_QMARK)||LA103_0==SP_PIPE||(LA103_0>=SP_SEMI && LA103_0<=CP_COMPARATORS)||LA103_0==OP_CURRY||(LA103_0>=OP_PLUS && LA103_0<=OP_MINUS)||(LA103_0>=OP_BANG && LA103_0<=OP_TILDA)||(LA103_0>=AT && LA103_0<=BRACKET_R)) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:342:31: typeCheck
                    {
                    pushFollow(FOLLOW_typeCheck_in_relationalExpr2155);
                    typeCheck();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:342:43: compare
                    {
                    pushFollow(FOLLOW_compare_in_relationalExpr2159);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:344:1: typeCheck : ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* ;
    public final void typeCheck() throws RecognitionException {
        int typeCheck_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:344:11: ( ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:344:15: ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )*
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

            pushFollow(FOLLOW_typeRoot_in_typeCheck2182);
            typeRoot();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:344:51: ( ( SP_QMARK )? {...}? '[]' )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:344:52: ( SP_QMARK )? {...}? '[]'
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:344:52: ( SP_QMARK )?
            	    int alt104=2;
            	    int LA104_0 = input.LA(1);

            	    if ( (LA104_0==SP_QMARK) ) {
            	        alt104=1;
            	    }
            	    switch (alt104) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            match(input,SP_QMARK,FOLLOW_SP_QMARK_in_typeCheck2185); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "typeCheck", "notAfterEol()");
            	    }
            	    match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_typeCheck2190); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:345:1: compare : ( CP_COMPARATORS elvisExpr )* ;
    public final void compare() throws RecognitionException {
        int compare_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:10: ( ( CP_COMPARATORS elvisExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:14: ( CP_COMPARATORS elvisExpr )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:14: ( CP_COMPARATORS elvisExpr )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==CP_COMPARATORS) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:345:15: CP_COMPARATORS elvisExpr
            	    {
            	    match(input,CP_COMPARATORS,FOLLOW_CP_COMPARATORS_in_compare2203); if (state.failed) return ;
            	    pushFollow(FOLLOW_elvisExpr_in_compare2205);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:347:1: elvisExpr : rangeExpr ( OP_ELVIS rangeExpr )* ;
    public final void elvisExpr() throws RecognitionException {
        int elvisExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:347:12: ( rangeExpr ( OP_ELVIS rangeExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:347:14: rangeExpr ( OP_ELVIS rangeExpr )*
            {
            pushFollow(FOLLOW_rangeExpr_in_elvisExpr2216);
            rangeExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:347:24: ( OP_ELVIS rangeExpr )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==OP_ELVIS) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:347:25: OP_ELVIS rangeExpr
            	    {
            	    match(input,OP_ELVIS,FOLLOW_OP_ELVIS_in_elvisExpr2219); if (state.failed) return ;
            	    pushFollow(FOLLOW_rangeExpr_in_elvisExpr2221);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:348:1: rangeExpr : bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* ;
    public final void rangeExpr() throws RecognitionException {
        int rangeExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:12: ( bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:14: bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            {
            pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2232);
            bitOrExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:24: ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( ((LA108_0>=OP_RANG_EXCL_OLD && LA108_0<=OP_RANGE)) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:348:25: ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr
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

            	    pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2249);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:349:1: bitOrExpr : bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* ;
    public final void bitOrExpr() throws RecognitionException {
        int bitOrExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:12: ( bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:14: bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            {
            pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2260);
            bitAndExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            loop109:
            do {
                int alt109=2;
                alt109 = dfa109.predict(input);
                switch (alt109) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:349:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
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

            	    pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2271);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:350:1: bitAndExpr : shiftExpr ( OP_CURRY shiftExpr )* ;
    public final void bitAndExpr() throws RecognitionException {
        int bitAndExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:350:13: ( shiftExpr ( OP_CURRY shiftExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:350:15: shiftExpr ( OP_CURRY shiftExpr )*
            {
            pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2282);
            shiftExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:350:25: ( OP_CURRY shiftExpr )*
            loop110:
            do {
                int alt110=2;
                alt110 = dfa110.predict(input);
                switch (alt110) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:350:26: OP_CURRY shiftExpr
            	    {
            	    match(input,OP_CURRY,FOLLOW_OP_CURRY_in_bitAndExpr2285); if (state.failed) return ;
            	    pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2287);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:351:1: shiftExpr : addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* ;
    public final void shiftExpr() throws RecognitionException {
        int shiftExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:12: ( addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:14: addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2299);
            addExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:22: ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( ((LA111_0>=OP_LSHIFT && LA111_0<=OP_RSHIFT)) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:351:23: ( OP_LSHIFT | OP_RSHIFT ) addExpr
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

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2310);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:352:1: addExpr : multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* ;
    public final void addExpr() throws RecognitionException {
        int addExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:352:10: ( multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:352:12: multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2321);
            multExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:352:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*
            loop112:
            do {
                int alt112=2;
                alt112 = dfa112.predict(input);
                switch (alt112) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:352:22: ( OP_PLUS | OP_MINUS ) multExpr
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

            	    pushFollow(FOLLOW_multExpr_in_addExpr2332);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:353:1: addAppend : ( OP_PLUS | OP_MINUS ) parenExpr ;
    public final void addAppend() throws RecognitionException {
        int addAppend_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:11: ( ( OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:13: ( OP_PLUS | OP_MINUS ) parenExpr
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

            pushFollow(FOLLOW_parenExpr_in_addAppend2350);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:354:1: multExpr : parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* ;
    public final void multExpr() throws RecognitionException {
        int multExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:11: ( parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:13: parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            {
            pushFollow(FOLLOW_parenExpr_in_multExpr2358);
            parenExpr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:23: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( ((LA113_0>=OP_MULTI && LA113_0<=OP_MOD)) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:354:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
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

            	    pushFollow(FOLLOW_parenExpr_in_multExpr2373);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:355:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );
    public final void parenExpr() throws RecognitionException {
        int parenExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:12: ( castExpr | groupedExpr | unaryExpr )
            int alt114=3;
            alt114 = dfa114.predict(input);
            switch (alt114) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:355:14: castExpr
                    {
                    pushFollow(FOLLOW_castExpr_in_parenExpr2384);
                    castExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:355:25: groupedExpr
                    {
                    pushFollow(FOLLOW_groupedExpr_in_parenExpr2388);
                    groupedExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:355:39: unaryExpr
                    {
                    pushFollow(FOLLOW_unaryExpr_in_parenExpr2392);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:357:1: castExpr : {...}? parL type parR parenExpr ;
    public final void castExpr() throws RecognitionException {
        int castExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:357:11: ({...}? parL type parR parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:357:13: {...}? parL type parR parenExpr
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "castExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_castExpr2403);
            parL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_type_in_castExpr2405);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parR_in_castExpr2407);
            parR();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parenExpr_in_castExpr2409);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:359:1: groupedExpr : parL expr parR ( termChain )* ;
    public final void groupedExpr() throws RecognitionException {
        int groupedExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:14: ( parL expr parR ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:16: parL expr parR ( termChain )*
            {
            pushFollow(FOLLOW_parL_in_groupedExpr2418);
            parL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_groupedExpr2420);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parR_in_groupedExpr2422);
            parR();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:31: ( termChain )*
            loop115:
            do {
                int alt115=2;
                alt115 = dfa115.predict(input);
                switch (alt115) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_groupedExpr2424);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:360:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );
    public final void unaryExpr() throws RecognitionException {
        int unaryExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:360:12: ( prefixExpr | postfixExpr | termExpr )
            int alt116=3;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:14: prefixExpr
                    {
                    pushFollow(FOLLOW_prefixExpr_in_unaryExpr2433);
                    prefixExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:27: postfixExpr
                    {
                    pushFollow(FOLLOW_postfixExpr_in_unaryExpr2437);
                    postfixExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:41: termExpr
                    {
                    pushFollow(FOLLOW_termExpr_in_unaryExpr2441);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:361:1: prefixExpr : ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr ;
    public final void prefixExpr() throws RecognitionException {
        int prefixExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:13: ( ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:15: ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr
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

            pushFollow(FOLLOW_parenExpr_in_prefixExpr2477);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:362:1: postfixExpr : termExpr ( OP_2PLUS | OP_2MINUS ) ;
    public final void postfixExpr() throws RecognitionException {
        int postfixExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:362:14: ( termExpr ( OP_2PLUS | OP_2MINUS ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:362:16: termExpr ( OP_2PLUS | OP_2MINUS )
            {
            pushFollow(FOLLOW_termExpr_in_postfixExpr2486);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:363:1: termExpr : termBase ( termChain )* ;
    public final void termExpr() throws RecognitionException {
        int termExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:11: ( termBase ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:13: termBase ( termChain )*
            {
            pushFollow(FOLLOW_termBase_in_termExpr2503);
            termBase();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:22: ( termChain )*
            loop117:
            do {
                int alt117=2;
                alt117 = dfa117.predict(input);
                switch (alt117) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_termExpr2505);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:365:1: termBase : ( idExprReq | literal | typeBase | id );
    public final void termBase() throws RecognitionException {
        int termBase_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:365:11: ( idExprReq | literal | typeBase | id )
            int alt118=4;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:365:13: idExprReq
                    {
                    pushFollow(FOLLOW_idExprReq_in_termBase2515);
                    idExprReq();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:365:25: literal
                    {
                    pushFollow(FOLLOW_literal_in_termBase2519);
                    literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:365:35: typeBase
                    {
                    pushFollow(FOLLOW_typeBase_in_termBase2523);
                    typeBase();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:365:46: id
                    {
                    pushFollow(FOLLOW_id_in_termBase2527);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:366:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );
    public final void typeBase() throws RecognitionException {
        int typeBase_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:10: ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock )
            int alt119=8;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:366:12: typeLiteral
                    {
                    pushFollow(FOLLOW_typeLiteral_in_typeBase2534);
                    typeLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:366:26: slotLiteral
                    {
                    pushFollow(FOLLOW_slotLiteral_in_typeBase2538);
                    slotLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:366:40: namedSuper
                    {
                    pushFollow(FOLLOW_namedSuper_in_typeBase2542);
                    namedSuper();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:366:53: staticCall
                    {
                    pushFollow(FOLLOW_staticCall_in_typeBase2546);
                    staticCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:367:19: dsl
                    {
                    pushFollow(FOLLOW_dsl_in_typeBase2568);
                    dsl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:367:25: closure
                    {
                    pushFollow(FOLLOW_closure_in_typeBase2572);
                    closure();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:367:35: simple
                    {
                    pushFollow(FOLLOW_simple_in_typeBase2576);
                    simple();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:367:44: ctorBlock
                    {
                    pushFollow(FOLLOW_ctorBlock_in_typeBase2580);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:368:1: ctorBlock : type itBlock ;
    public final void ctorBlock() throws RecognitionException {
        int ctorBlock_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:368:11: ( type itBlock )
            // src/net/colar/netbeans/fan/antlr/Fan.g:368:13: type itBlock
            {
            pushFollow(FOLLOW_type_in_ctorBlock2587);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_itBlock_in_ctorBlock2589);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:369:1: staticCall : type DOT idExpr ;
    public final void staticCall() throws RecognitionException {
        int staticCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:12: ( type DOT idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:14: type DOT idExpr
            {
            pushFollow(FOLLOW_type_in_staticCall2596);
            type();

            state._fsp--;
            if (state.failed) return ;
            match(input,DOT,FOLLOW_DOT_in_staticCall2598); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_staticCall2600);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:371:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock );
    public final void termChain() throws RecognitionException {
        int termChain_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:12: ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock )
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
            case BRACKET_R:
                {
                alt120=5;
                }
                break;
            case BRACKET_L:
                {
                int LA120_6 = input.LA(2);

                if ( ((synpred196_Fan()&&(notAfterEol()))) ) {
                    alt120=6;
                }
                else if ( (true) ) {
                    alt120=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 120, 6, input);

                    throw nvae;
                }
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:371:14: dotCall
                    {
                    pushFollow(FOLLOW_dotCall_in_termChain2609);
                    dotCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:371:24: dynCall
                    {
                    pushFollow(FOLLOW_dynCall_in_termChain2613);
                    dynCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:371:34: safeDotCall
                    {
                    pushFollow(FOLLOW_safeDotCall_in_termChain2617);
                    safeDotCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:371:48: safeDynCall
                    {
                    pushFollow(FOLLOW_safeDynCall_in_termChain2621);
                    safeDynCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:372:4: indexExpr
                    {
                    pushFollow(FOLLOW_indexExpr_in_termChain2628);
                    indexExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:372:16: callOp
                    {
                    pushFollow(FOLLOW_callOp_in_termChain2632);
                    callOp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:372:25: itBlock
                    {
                    pushFollow(FOLLOW_itBlock_in_termChain2636);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:373:1: dsl : simpleType DSL ;
    public final void dsl() throws RecognitionException {
        int dsl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:13: ( simpleType DSL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:15: simpleType DSL
            {
            pushFollow(FOLLOW_simpleType_in_dsl2651);
            simpleType();

            state._fsp--;
            if (state.failed) return ;
            match(input,DSL,FOLLOW_DSL_in_dsl2653); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:376:1: itBlock : bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR ;
    public final void itBlock() throws RecognitionException {
        int itBlock_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:10: ( bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:12: bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_itBlock2663);
            bracketL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:21: ( stmt ( SP_COMMA )? ( SP_SEMI )? )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==BRACKET_R) ) {
                    int LA123_1 = input.LA(2);

                    if ( (synpred199_Fan()) ) {
                        alt123=1;
                    }


                }
                else if ( ((LA123_0>=KW_BREAK && LA123_0<=KW_TRY)||(LA123_0>=KW_THIS && LA123_0<=KW_SUPER)||(LA123_0>=KW_NULL && LA123_0<=KW_FALSE)||LA123_0==SP_PIPE||LA123_0==OP_CURRY||(LA123_0>=OP_PLUS && LA123_0<=OP_MINUS)||(LA123_0>=OP_BANG && LA123_0<=OP_TILDA)||(LA123_0>=AT && LA123_0<=OP_POUND)||(LA123_0>=NUMBER && LA123_0<=BRACKET_L)) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:376:22: stmt ( SP_COMMA )? ( SP_SEMI )?
            	    {
            	    pushFollow(FOLLOW_stmt_in_itBlock2666);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:376:27: ( SP_COMMA )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==SP_COMMA) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
            	            {
            	            match(input,SP_COMMA,FOLLOW_SP_COMMA_in_itBlock2668); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    // src/net/colar/netbeans/fan/antlr/Fan.g:376:37: ( SP_SEMI )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==SP_SEMI) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
            	            {
            	            match(input,SP_SEMI,FOLLOW_SP_SEMI_in_itBlock2671); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_itBlock2676);
            bracketR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:377:1: dotCall : DOT idExpr ;
    public final void dotCall() throws RecognitionException {
        int dotCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:10: ( DOT idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:12: DOT idExpr
            {
            match(input,DOT,FOLLOW_DOT_in_dotCall2684); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_dotCall2686);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:378:1: dynCall : OP_ARROW idExpr ;
    public final void dynCall() throws RecognitionException {
        int dynCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:10: ( OP_ARROW idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:12: OP_ARROW idExpr
            {
            match(input,OP_ARROW,FOLLOW_OP_ARROW_in_dynCall2694); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_dynCall2696);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:379:1: safeDotCall : OP_SAFE_CALL idExpr ;
    public final void safeDotCall() throws RecognitionException {
        int safeDotCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:14: ( OP_SAFE_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:16: OP_SAFE_CALL idExpr
            {
            match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_safeDotCall2704); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_safeDotCall2706);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:380:1: safeDynCall : OP_SAFEDYN_CALL idExpr ;
    public final void safeDynCall() throws RecognitionException {
        int safeDynCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:380:13: ( OP_SAFEDYN_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:380:15: OP_SAFEDYN_CALL idExpr
            {
            match(input,OP_SAFEDYN_CALL,FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall2713); if (state.failed) return ;
            pushFollow(FOLLOW_idExpr_in_safeDynCall2715);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:381:1: indexExpr : {...}? sq_bracketL expr sq_bracketR ;
    public final void indexExpr() throws RecognitionException {
        int indexExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:12: ({...}? sq_bracketL expr sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:14: {...}? sq_bracketL expr sq_bracketR
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "indexExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_sq_bracketL_in_indexExpr2725);
            sq_bracketL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_indexExpr2727);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_sq_bracketR_in_indexExpr2729);
            sq_bracketR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:383:1: callOp : {...}? parL ( args )? parR ( closure )* ;
    public final void callOp() throws RecognitionException {
        int callOp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:9: ({...}? parL ( args )? parR ( closure )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:11: {...}? parL ( args )? parR ( closure )*
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "callOp", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callOp2740);
            parL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:33: ( args )?
            int alt124=2;
            alt124 = dfa124.predict(input);
            switch (alt124) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callOp2742);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callOp2746);
            parR();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:45: ( closure )*
            loop125:
            do {
                int alt125=2;
                alt125 = dfa125.predict(input);
                switch (alt125) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: closure
            	    {
            	    pushFollow(FOLLOW_closure_in_callOp2748);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:384:1: closure : funcType bracketL ( stmt )* bracketR ;
    public final void closure() throws RecognitionException {
        int closure_StartIndex = input.index();
        paraphrase.push("Closure");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:3: ( funcType bracketL ( stmt )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:7: funcType bracketL ( stmt )* bracketR
            {
            pushFollow(FOLLOW_funcType_in_closure2770);
            funcType();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_bracketL_in_closure2772);
            bracketL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:25: ( stmt )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==BRACKET_R) ) {
                    int LA126_1 = input.LA(2);

                    if ( (synpred202_Fan()) ) {
                        alt126=1;
                    }


                }
                else if ( ((LA126_0>=KW_BREAK && LA126_0<=KW_TRY)||(LA126_0>=KW_THIS && LA126_0<=KW_SUPER)||(LA126_0>=KW_NULL && LA126_0<=KW_FALSE)||LA126_0==SP_PIPE||LA126_0==OP_CURRY||(LA126_0>=OP_PLUS && LA126_0<=OP_MINUS)||(LA126_0>=OP_BANG && LA126_0<=OP_TILDA)||(LA126_0>=AT && LA126_0<=OP_POUND)||(LA126_0>=NUMBER && LA126_0<=BRACKET_L)) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_closure2774);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_closure2777);
            bracketR();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:387:1: idExpr : ( idExprReq | id );
    public final void idExpr() throws RecognitionException {
        int idExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:10: ( idExprReq | id )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:387:12: idExprReq
                    {
                    pushFollow(FOLLOW_idExprReq_in_idExpr2787);
                    idExprReq();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:387:24: id
                    {
                    pushFollow(FOLLOW_id_in_idExpr2791);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:389:1: idExprReq : ( field | call );
    public final void idExprReq() throws RecognitionException {
        int idExprReq_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:389:11: ( field | call )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:389:13: field
                    {
                    pushFollow(FOLLOW_field_in_idExprReq2799);
                    field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:389:21: call
                    {
                    pushFollow(FOLLOW_call_in_idExprReq2803);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:391:1: field : AT ID ;
    public final void field() throws RecognitionException {
        int field_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:8: ( AT ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:10: AT ID
            {
            match(input,AT,FOLLOW_AT_in_field2812); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_field2814); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:393:1: call : id ( ( callParams closure ) | callParams | closure ) ;
    public final void call() throws RecognitionException {
        int call_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:7: ( id ( ( callParams closure ) | callParams | closure ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:9: id ( ( callParams closure ) | callParams | closure )
            {
            pushFollow(FOLLOW_id_in_call2824);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:12: ( ( callParams closure ) | callParams | closure )
            int alt129=3;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==BRACKET_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:393:13: ( callParams closure )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:393:13: ( callParams closure )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:393:14: callParams closure
                    {
                    pushFollow(FOLLOW_callParams_in_call2828);
                    callParams();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_closure_in_call2830);
                    closure();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:393:36: callParams
                    {
                    pushFollow(FOLLOW_callParams_in_call2835);
                    callParams();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:393:49: closure
                    {
                    pushFollow(FOLLOW_closure_in_call2839);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:395:1: callParams : {...}? parL ( args )? parR ;
    public final void callParams() throws RecognitionException {
        int callParams_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:12: ({...}? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:14: {...}? parL ( args )? parR
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "callParams", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callParams2850);
            parL();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:36: ( args )?
            int alt130=2;
            alt130 = dfa130.predict(input);
            switch (alt130) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callParams2852);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callParams2855);
            parR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:396:1: args : expr ( SP_COMMA expr )* ;
    public final void args() throws RecognitionException {
        int args_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:8: ( expr ( SP_COMMA expr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:10: expr ( SP_COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_args2864);
            expr();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:15: ( SP_COMMA expr )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==SP_COMMA) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:396:16: SP_COMMA expr
            	    {
            	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_args2867); if (state.failed) return ;
            	    pushFollow(FOLLOW_expr_in_args2870);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:398:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple );
    public final void literal() throws RecognitionException {
        int literal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:10: ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple )
            int alt132=17;
            alt132 = dfa132.predict(input);
            switch (alt132) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:12: KW_NULL
                    {
                    match(input,KW_NULL,FOLLOW_KW_NULL_in_literal2881); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:22: KW_THIS
                    {
                    match(input,KW_THIS,FOLLOW_KW_THIS_in_literal2885); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:32: KW_SUPER
                    {
                    match(input,KW_SUPER,FOLLOW_KW_SUPER_in_literal2889); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:43: KW_IT
                    {
                    match(input,KW_IT,FOLLOW_KW_IT_in_literal2893); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:51: KW_TRUE
                    {
                    match(input,KW_TRUE,FOLLOW_KW_TRUE_in_literal2897); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:61: KW_FALSE
                    {
                    match(input,KW_FALSE,FOLLOW_KW_FALSE_in_literal2901); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:72: QUOTSTR
                    {
                    match(input,QUOTSTR,FOLLOW_QUOTSTR_in_literal2905); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:82: STR
                    {
                    match(input,STR,FOLLOW_STR_in_literal2909); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:88: URI
                    {
                    match(input,URI,FOLLOW_URI_in_literal2913); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:4: number
                    {
                    pushFollow(FOLLOW_number_in_literal2920);
                    number();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:13: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_literal2924); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:20: namedSuper
                    {
                    pushFollow(FOLLOW_namedSuper_in_literal2928);
                    namedSuper();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:400:4: slotLiteral
                    {
                    pushFollow(FOLLOW_slotLiteral_in_literal2935);
                    slotLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:400:18: typeLiteral
                    {
                    pushFollow(FOLLOW_typeLiteral_in_literal2939);
                    typeLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:400:32: list
                    {
                    pushFollow(FOLLOW_list_in_literal2943);
                    list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 16 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:400:39: map
                    {
                    pushFollow(FOLLOW_map_in_literal2947);
                    map();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:400:45: simple
                    {
                    pushFollow(FOLLOW_simple_in_literal2951);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:401:1: typeLiteral : type {...}? OP_POUND ;
    public final void typeLiteral() throws RecognitionException {
        int typeLiteral_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:13: ( type {...}? OP_POUND )
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:17: type {...}? OP_POUND
            {
            pushFollow(FOLLOW_type_in_typeLiteral2960);
            type();

            state._fsp--;
            if (state.failed) return ;
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "typeLiteral", "notAfterEol()");
            }
            match(input,OP_POUND,FOLLOW_OP_POUND_in_typeLiteral2964); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:402:1: slotLiteral : ( type )? OP_POUND {...}? id ;
    public final void slotLiteral() throws RecognitionException {
        int slotLiteral_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:13: ( ( type )? OP_POUND {...}? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:17: ( type )? OP_POUND {...}? id
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:17: ( type )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==SP_PIPE||LA133_0==ID||LA133_0==BRACKET_R) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_slotLiteral2973);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,OP_POUND,FOLLOW_OP_POUND_in_slotLiteral2976); if (state.failed) return ;
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "slotLiteral", "notAfterEol()");
            }
            pushFollow(FOLLOW_id_in_slotLiteral2980);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:403:1: namedSuper : simpleType DOT KW_SUPER ;
    public final void namedSuper() throws RecognitionException {
        int namedSuper_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:403:13: ( simpleType DOT KW_SUPER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:403:15: simpleType DOT KW_SUPER
            {
            pushFollow(FOLLOW_simpleType_in_namedSuper2988);
            simpleType();

            state._fsp--;
            if (state.failed) return ;
            match(input,DOT,FOLLOW_DOT_in_namedSuper2990); if (state.failed) return ;
            match(input,KW_SUPER,FOLLOW_KW_SUPER_in_namedSuper2992); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:404:1: list : ( type {...}?)? sq_bracketL listItems sq_bracketR ;
    public final void list() throws RecognitionException {
        int list_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:8: ( ( type {...}?)? sq_bracketL listItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:10: ( type {...}?)? sq_bracketL listItems sq_bracketR
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:10: ( type {...}?)?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==BRACKET_R) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:11: type {...}?
                    {
                    pushFollow(FOLLOW_type_in_list3002);
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

            pushFollow(FOLLOW_sq_bracketL_in_list3008);
            sq_bracketL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_listItems_in_list3010);
            listItems();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_sq_bracketR_in_list3012);
            sq_bracketR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:405:1: listItems : ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA );
    public final void listItems() throws RecognitionException {
        int listItems_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:12: ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( ((LA137_0>=KW_THIS && LA137_0<=KW_SUPER)||(LA137_0>=KW_NULL && LA137_0<=KW_FALSE)||LA137_0==SP_PIPE||LA137_0==OP_CURRY||(LA137_0>=OP_PLUS && LA137_0<=OP_MINUS)||(LA137_0>=OP_BANG && LA137_0<=OP_TILDA)||(LA137_0>=AT && LA137_0<=OP_POUND)||(LA137_0>=NUMBER && LA137_0<=BRACKET_R)) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:15: expr ( SP_COMMA expr )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_listItems3021);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:20: ( SP_COMMA expr )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==SP_COMMA) ) {
                            int LA135_1 = input.LA(2);

                            if ( (synpred227_Fan()) ) {
                                alt135=1;
                            }


                        }


                        switch (alt135) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:405:21: SP_COMMA expr
                    	    {
                    	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3024); if (state.failed) return ;
                    	    pushFollow(FOLLOW_expr_in_listItems3026);
                    	    expr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:38: ( SP_COMMA )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==SP_COMMA) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3031); if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:51: SP_COMMA
                    {
                    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3037); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:406:1: map : ( mapType {...}?)? sq_bracketL mapItems sq_bracketR ;
    public final void map() throws RecognitionException {
        int map_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:7: ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:9: ( mapType {...}?)? sq_bracketL mapItems sq_bracketR
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:9: ( mapType {...}?)?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==BRACKET_R) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:10: mapType {...}?
                    {
                    pushFollow(FOLLOW_mapType_in_map3047);
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

            pushFollow(FOLLOW_sq_bracketL_in_map3053);
            sq_bracketL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_mapItems_in_map3055);
            mapItems();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_sq_bracketR_in_map3057);
            sq_bracketR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:407:1: mapItems : ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON );
    public final void mapItems() throws RecognitionException {
        int mapItems_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:11: ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( ((LA141_0>=KW_THIS && LA141_0<=KW_SUPER)||(LA141_0>=KW_NULL && LA141_0<=KW_FALSE)||LA141_0==SP_PIPE||LA141_0==OP_CURRY||(LA141_0>=OP_PLUS && LA141_0<=OP_MINUS)||(LA141_0>=OP_BANG && LA141_0<=OP_TILDA)||(LA141_0>=AT && LA141_0<=OP_POUND)||(LA141_0>=NUMBER && LA141_0<=BRACKET_R)) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:14: mapPair ( SP_COMMA mapPair )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_mapPair_in_mapItems3066);
                    mapPair();

                    state._fsp--;
                    if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:22: ( SP_COMMA mapPair )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==SP_COMMA) ) {
                            int LA139_1 = input.LA(2);

                            if ( (synpred231_Fan()) ) {
                                alt139=1;
                            }


                        }


                        switch (alt139) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:407:23: SP_COMMA mapPair
                    	    {
                    	    match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems3069); if (state.failed) return ;
                    	    pushFollow(FOLLOW_mapPair_in_mapItems3071);
                    	    mapPair();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:42: ( SP_COMMA )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==SP_COMMA) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems3075); if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:55: SP_COLON
                    {
                    match(input,SP_COLON,FOLLOW_SP_COLON_in_mapItems3081); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:408:1: mapPair : expr SP_COLON expr ;
    public final void mapPair() throws RecognitionException {
        int mapPair_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:10: ( expr SP_COLON expr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:12: expr SP_COLON expr
            {
            pushFollow(FOLLOW_expr_in_mapPair3089);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,SP_COLON,FOLLOW_SP_COLON_in_mapPair3091); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_mapPair3093);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:409:1: simple : type parL expr parR ;
    public final void simple() throws RecognitionException {
        int simple_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:9: ( type parL expr parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:11: type parL expr parR
            {
            pushFollow(FOLLOW_type_in_simple3101);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parL_in_simple3103);
            parL();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_simple3105);
            expr();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_parR_in_simple3107);
            parR();

            state._fsp--;
            if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:411:1: docs : ( DOC )* ;
    public final void docs() throws RecognitionException {
        int docs_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:411:7: ( ( DOC )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:411:9: ( DOC )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:411:9: ( DOC )*
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
            	    match(input,DOC,FOLLOW_DOC_in_docs3116); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:413:1: number : ( OP_MINUS )? NUMBER ;
    public final void number() throws RecognitionException {
        int number_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:9: ( ( OP_MINUS )? NUMBER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:12: ( OP_MINUS )? NUMBER
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:12: ( OP_MINUS )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==OP_MINUS) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: OP_MINUS
                    {
                    match(input,OP_MINUS,FOLLOW_OP_MINUS_in_number3127); if (state.failed) return ;

                    }
                    break;

            }

            match(input,NUMBER,FOLLOW_NUMBER_in_number3130); if (state.failed) return ;

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:414:1: facet : AT id ( AS_EQUAL expr )? ;
    public final void facet() throws RecognitionException {
        int facet_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:8: ( AT id ( AS_EQUAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:10: AT id ( AS_EQUAL expr )?
            {
            match(input,AT,FOLLOW_AT_in_facet3138); if (state.failed) return ;
            pushFollow(FOLLOW_id_in_facet3140);
            id();

            state._fsp--;
            if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:16: ( AS_EQUAL expr )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==AS_EQUAL) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:17: AS_EQUAL expr
                    {
                    match(input,AS_EQUAL,FOLLOW_AS_EQUAL_in_facet3143); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_facet3145);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:417:1: eos : ( SP_SEMI | {...}?);
    public final void eos() throws RecognitionException {
        int eos_StartIndex = input.index();
        paraphrase.push("Semicolumn or LineBreak");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:419:3: ( SP_SEMI | {...}?)
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
            else if ( (LA145_0==EOF||(LA145_0>=KW_BREAK && LA145_0<=KW_USING)||(LA145_0>=KW_RD_ONLY && LA145_0<=KW_ELSE)||(LA145_0>=KW_NULL && LA145_0<=KW_FALSE)||LA145_0==SP_COMMA||LA145_0==SP_PIPE||LA145_0==OP_CURRY||(LA145_0>=OP_PLUS && LA145_0<=OP_MINUS)||(LA145_0>=OP_BANG && LA145_0<=OP_TILDA)||(LA145_0>=AT && LA145_0<=BRACKET_R)) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:419:5: SP_SEMI
                    {
                    match(input,SP_SEMI,FOLLOW_SP_SEMI_in_eos3167); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:419:15: {...}?
                    {
                    if ( !((lookupNL())) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "eos", "lookupNL()");
                    }

                    }
                    break;

            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:421:1: id : ID ;
    public final void id() throws RecognitionException {
        int id_StartIndex = input.index();
        paraphrase.push("Identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:3: ( ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:6: ID
            {
            match(input,ID,FOLLOW_ID_in_id3191); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:429:1: getter : t= ID {...}?;
    public final void getter() throws RecognitionException {
        int getter_StartIndex = input.index();
        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:12: t= ID {...}?
            {
            t=(Token)match(input,ID,FOLLOW_ID_in_getter3204); if (state.failed) return ;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:430:1: setter : t= ID {...}?;
    public final void setter() throws RecognitionException {
        int setter_StartIndex = input.index();
        Token t=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:12: t= ID {...}?
            {
            t=(Token)match(input,ID,FOLLOW_ID_in_setter3217); if (state.failed) return ;
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


    // $ANTLR start "bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:433:1: bracketL : BRACKET_L ;
    public final void bracketL() throws RecognitionException {
        int bracketL_StartIndex = input.index();
        paraphrase.push("{");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:3: ( BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:5: BRACKET_L
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_bracketL3239); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 140, bracketL_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bracketL"


    // $ANTLR start "bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:436:1: bracketR : BRACKET_R ;
    public final void bracketR() throws RecognitionException {
        int bracketR_StartIndex = input.index();
        paraphrase.push("}");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:438:3: ( BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:438:5: BRACKET_R
            {
            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_bracketR3257); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 141, bracketR_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bracketR"


    // $ANTLR start "sq_bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:439:1: sq_bracketL : BRACKET_R ;
    public final void sq_bracketL() throws RecognitionException {
        int sq_bracketL_StartIndex = input.index();
        paraphrase.push("[");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:3: ( BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:5: BRACKET_R
            {
            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_sq_bracketL3275); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 142, sq_bracketL_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "sq_bracketL"


    // $ANTLR start "sq_bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:442:1: sq_bracketR : BRACKET_R ;
    public final void sq_bracketR() throws RecognitionException {
        int sq_bracketR_StartIndex = input.index();
        paraphrase.push("]");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:3: ( BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:5: BRACKET_R
            {
            match(input,BRACKET_R,FOLLOW_BRACKET_R_in_sq_bracketR3293); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 143, sq_bracketR_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "sq_bracketR"


    // $ANTLR start "parL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:445:1: parL : BRACKET_L ;
    public final void parL() throws RecognitionException {
        int parL_StartIndex = input.index();
        paraphrase.push("(");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:447:3: ( BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:447:5: BRACKET_L
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_parL3311); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 144, parL_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "parL"


    // $ANTLR start "parR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:448:1: parR : BRACKET_L ;
    public final void parR() throws RecognitionException {
        int parR_StartIndex = input.index();
        paraphrase.push(")");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return ; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:3: ( BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:5: BRACKET_L
            {
            match(input,BRACKET_L,FOLLOW_BRACKET_L_in_parR3329); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 145, parR_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "parR"

    // $ANTLR start synpred7_Fan
    public final void synpred7_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:220:17: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:220:17: facet
        {
        pushFollow(FOLLOW_facet_in_synpred7_Fan487);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_Fan

    // $ANTLR start synpred9_Fan
    public final void synpred9_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:220:25: ( ( classFlags )* KW_CLASS )
        // src/net/colar/netbeans/fan/antlr/Fan.g:220:26: ( classFlags )* KW_CLASS
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:220:26: ( classFlags )*
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
        	    pushFollow(FOLLOW_classFlags_in_synpred9_Fan492);
        	    classFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop146;
            }
        } while (true);

        match(input,KW_CLASS,FOLLOW_KW_CLASS_in_synpred9_Fan495); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Fan

    // $ANTLR start synpred11_Fan
    public final void synpred11_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:221:4: ( ( protection )? KW_ENUM )
        // src/net/colar/netbeans/fan/antlr/Fan.g:221:5: ( protection )? KW_ENUM
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:221:5: ( protection )?
        int alt147=2;
        int LA147_0 = input.LA(1);

        if ( ((LA147_0>=KW_PRIVATE && LA147_0<=KW_INTERNAL)) ) {
            alt147=1;
        }
        switch (alt147) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                {
                pushFollow(FOLLOW_protection_in_synpred11_Fan506);
                protection();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,KW_ENUM,FOLLOW_KW_ENUM_in_synpred11_Fan509); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_Fan

    // $ANTLR start synpred35_Fan
    public final void synpred35_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:239:29: ( args )
        // src/net/colar/netbeans/fan/antlr/Fan.g:239:29: args
        {
        pushFollow(FOLLOW_args_in_synpred35_Fan789);
        args();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_Fan

    // $ANTLR start synpred38_Fan
    public final void synpred38_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:242:28: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:242:28: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred38_Fan831); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_Fan

    // $ANTLR start synpred39_Fan
    public final void synpred39_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:242:49: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:242:49: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred39_Fan837); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_Fan

    // $ANTLR start synpred40_Fan
    public final void synpred40_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:242:39: ( LIST_TYPE ( SP_QMARK )? )
        // src/net/colar/netbeans/fan/antlr/Fan.g:242:39: LIST_TYPE ( SP_QMARK )?
        {
        match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_synpred40_Fan835); if (state.failed) return ;
        // src/net/colar/netbeans/fan/antlr/Fan.g:242:49: ( SP_QMARK )?
        int alt149=2;
        int LA149_0 = input.LA(1);

        if ( (LA149_0==SP_QMARK) ) {
            alt149=1;
        }
        switch (alt149) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                {
                match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred40_Fan837); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred40_Fan

    // $ANTLR start synpred42_Fan
    public final void synpred42_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:244:12: ( mapType )
        // src/net/colar/netbeans/fan/antlr/Fan.g:244:12: mapType
        {
        pushFollow(FOLLOW_mapType_in_synpred42_Fan859);
        mapType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_Fan

    // $ANTLR start synpred48_Fan
    public final void synpred48_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:248:6: ({...}? SP_COLON {...}? type )
        // src/net/colar/netbeans/fan/antlr/Fan.g:248:6: {...}? SP_COLON {...}? type
        {
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_Fan", "notAfterEol()");
        }
        match(input,SP_COLON,FOLLOW_SP_COLON_in_synpred48_Fan916); if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_Fan", "notAfterEol()");
        }
        pushFollow(FOLLOW_type_in_synpred48_Fan920);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Fan

    // $ANTLR start synpred49_Fan
    public final void synpred49_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:248:56: ( sq_bracketR )
        // src/net/colar/netbeans/fan/antlr/Fan.g:248:56: sq_bracketR
        {
        pushFollow(FOLLOW_sq_bracketR_in_synpred49_Fan924);
        sq_bracketR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_Fan

    // $ANTLR start synpred51_Fan
    public final void synpred51_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:249:43: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:249:44: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred51_Fan945); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_Fan

    // $ANTLR start synpred53_Fan
    public final void synpred53_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:249:74: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:249:75: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred53_Fan957); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_Fan

    // $ANTLR start synpred55_Fan
    public final void synpred55_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:252:11: ( formalFull )
        // src/net/colar/netbeans/fan/antlr/Fan.g:252:11: formalFull
        {
        pushFollow(FOLLOW_formalFull_in_synpred55_Fan998);
        formalFull();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_Fan

    // $ANTLR start synpred56_Fan
    public final void synpred56_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:252:24: ( formalTypeOnly )
        // src/net/colar/netbeans/fan/antlr/Fan.g:252:24: formalTypeOnly
        {
        pushFollow(FOLLOW_formalTypeOnly_in_synpred56_Fan1002);
        formalTypeOnly();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_Fan

    // $ANTLR start synpred57_Fan
    public final void synpred57_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:256:13: ( KW_STATIC bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:256:14: KW_STATIC bracketL
        {
        match(input,KW_STATIC,FOLLOW_KW_STATIC_in_synpred57_Fan1050); if (state.failed) return ;
        pushFollow(FOLLOW_bracketL_in_synpred57_Fan1052);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_Fan

    // $ANTLR start synpred58_Fan
    public final void synpred58_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:257:11: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:257:11: facet
        {
        pushFollow(FOLLOW_facet_in_synpred58_Fan1066);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_Fan

    // $ANTLR start synpred60_Fan
    public final void synpred60_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:259:7: ( ( ctorFlags )* KW_NEW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:259:8: ( ctorFlags )* KW_NEW
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:259:8: ( ctorFlags )*
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
        	    pushFollow(FOLLOW_ctorFlags_in_synpred60_Fan1083);
        	    ctorFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop152;
            }
        } while (true);

        match(input,KW_NEW,FOLLOW_KW_NEW_in_synpred60_Fan1086); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_Fan

    // $ANTLR start synpred63_Fan
    public final void synpred63_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:260:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:260:8: ( methodFlags )* ( type | KW_VOID ) id parL
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:260:8: ( methodFlags )*
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
        	    pushFollow(FOLLOW_methodFlags_in_synpred63_Fan1100);
        	    methodFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop153;
            }
        } while (true);

        // src/net/colar/netbeans/fan/antlr/Fan.g:260:21: ( type | KW_VOID )
        int alt154=2;
        int LA154_0 = input.LA(1);

        if ( (LA154_0==SP_PIPE||LA154_0==ID||LA154_0==BRACKET_R) ) {
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
                // src/net/colar/netbeans/fan/antlr/Fan.g:260:22: type
                {
                pushFollow(FOLLOW_type_in_synpred63_Fan1104);
                type();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:260:29: KW_VOID
                {
                match(input,KW_VOID,FOLLOW_KW_VOID_in_synpred63_Fan1108); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_id_in_synpred63_Fan1111);
        id();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_parL_in_synpred63_Fan1113);
        parL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_Fan

    // $ANTLR start synpred67_Fan
    public final void synpred67_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:268:29: ( getter )
        // src/net/colar/netbeans/fan/antlr/Fan.g:268:29: getter
        {
        pushFollow(FOLLOW_getter_in_synpred67_Fan1196);
        getter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_Fan

    // $ANTLR start synpred69_Fan
    public final void synpred69_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:268:55: ( block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:268:55: block
        {
        pushFollow(FOLLOW_block_in_synpred69_Fan1206);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Fan

    // $ANTLR start synpred72_Fan
    public final void synpred72_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:271:12: ( type id )
        // src/net/colar/netbeans/fan/antlr/Fan.g:271:13: type id
        {
        pushFollow(FOLLOW_type_in_synpred72_Fan1232);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_id_in_synpred72_Fan1234);
        id();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_Fan

    // $ANTLR start synpred96_Fan
    public final void synpred96_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:280:19: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:280:19: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred96_Fan1424);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_Fan

    // $ANTLR start synpred100_Fan
    public final void synpred100_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:282:56: ( SP_COLON )
        // src/net/colar/netbeans/fan/antlr/Fan.g:282:57: SP_COLON
        {
        match(input,SP_COLON,FOLLOW_SP_COLON_in_synpred100_Fan1471); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_Fan

    // $ANTLR start synpred102_Fan
    public final void synpred102_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:286:37: ( args )
        // src/net/colar/netbeans/fan/antlr/Fan.g:286:37: args
        {
        pushFollow(FOLLOW_args_in_synpred102_Fan1516);
        args();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred102_Fan

    // $ANTLR start synpred104_Fan
    public final void synpred104_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:287:42: ( args )
        // src/net/colar/netbeans/fan/antlr/Fan.g:287:42: args
        {
        pushFollow(FOLLOW_args_in_synpred104_Fan1537);
        args();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_Fan

    // $ANTLR start synpred105_Fan
    public final void synpred105_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:291:6: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:291:7: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred105_Fan1572);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_Fan

    // $ANTLR start synpred106_Fan
    public final void synpred106_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:292:23: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:292:23: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred106_Fan1590);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_Fan

    // $ANTLR start synpred116_Fan
    public final void synpred116_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:297:22: ( exprStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:297:22: exprStmt
        {
        pushFollow(FOLLOW_exprStmt_in_synpred116_Fan1654);
        exprStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred116_Fan

    // $ANTLR start synpred119_Fan
    public final void synpred119_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:53: ( expr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:53: expr
        {
        pushFollow(FOLLOW_expr_in_synpred119_Fan1704);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_Fan

    // $ANTLR start synpred120_Fan
    public final void synpred120_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:308:6: ( KW_ELSE block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:308:6: KW_ELSE block
        {
        match(input,KW_ELSE,FOLLOW_KW_ELSE_in_synpred120_Fan1733); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred120_Fan1735);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_Fan

    // $ANTLR start synpred121_Fan
    public final void synpred121_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:309:23: ( eos )
        // src/net/colar/netbeans/fan/antlr/Fan.g:309:23: eos
        {
        pushFollow(FOLLOW_eos_in_synpred121_Fan1747);
        eos();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred121_Fan

    // $ANTLR start synpred124_Fan
    public final void synpred124_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:18: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:19: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred124_Fan1821);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_Fan

    // $ANTLR start synpred125_Fan
    public final void synpred125_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:41: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:41: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred125_Fan1828);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_Fan

    // $ANTLR start synpred126_Fan
    public final void synpred126_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:49: ( KW_CATCH )
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:50: KW_CATCH
        {
        match(input,KW_CATCH,FOLLOW_KW_CATCH_in_synpred126_Fan1834); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred126_Fan

    // $ANTLR start synpred127_Fan
    public final void synpred127_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:72: ( KW_FINALLY )
        // src/net/colar/netbeans/fan/antlr/Fan.g:313:73: KW_FINALLY
        {
        match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_synpred127_Fan1843); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred127_Fan

    // $ANTLR start synpred128_Fan
    public final void synpred128_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:314:21: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:314:21: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred128_Fan1857);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred128_Fan

    // $ANTLR start synpred130_Fan
    public final void synpred130_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:12: ( forInitDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:12: forInitDef
        {
        pushFollow(FOLLOW_forInitDef_in_synpred130_Fan1893);
        forInitDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_Fan

    // $ANTLR start synpred132_Fan
    public final void synpred132_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:320:21: ( catchDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:320:21: catchDef
        {
        pushFollow(FOLLOW_catchDef_in_synpred132_Fan1922);
        catchDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred132_Fan

    // $ANTLR start synpred133_Fan
    public final void synpred133_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:320:32: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:320:33: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred133_Fan1927);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_Fan

    // $ANTLR start synpred134_Fan
    public final void synpred134_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:320:57: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:320:57: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred134_Fan1934);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred134_Fan

    // $ANTLR start synpred135_Fan
    public final void synpred135_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:321:23: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:321:23: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred135_Fan1945);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred135_Fan

    // $ANTLR start synpred136_Fan
    public final void synpred136_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:324:25: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:324:26: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred136_Fan1974);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_Fan

    // $ANTLR start synpred137_Fan
    public final void synpred137_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:324:52: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:324:52: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred137_Fan1981);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_Fan

    // $ANTLR start synpred138_Fan
    public final void synpred138_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:325:25: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:325:25: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred138_Fan1992);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred138_Fan

    // $ANTLR start synpred139_Fan
    public final void synpred139_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:326:33: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:326:33: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred139_Fan2009);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred139_Fan

    // $ANTLR start synpred140_Fan
    public final void synpred140_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:327:33: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:327:33: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred140_Fan2021);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred140_Fan

    // $ANTLR start synpred158_Fan
    public final void synpred158_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:349:26: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:349:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
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

        pushFollow(FOLLOW_bitAndExpr_in_synpred158_Fan2271);
        bitAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred158_Fan

    // $ANTLR start synpred159_Fan
    public final void synpred159_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:26: ( OP_CURRY shiftExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:26: OP_CURRY shiftExpr
        {
        match(input,OP_CURRY,FOLLOW_OP_CURRY_in_synpred159_Fan2285); if (state.failed) return ;
        pushFollow(FOLLOW_shiftExpr_in_synpred159_Fan2287);
        shiftExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred159_Fan

    // $ANTLR start synpred163_Fan
    public final void synpred163_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:352:22: ( ( OP_PLUS | OP_MINUS ) multExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:352:22: ( OP_PLUS | OP_MINUS ) multExpr
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

        pushFollow(FOLLOW_multExpr_in_synpred163_Fan2332);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred163_Fan

    // $ANTLR start synpred168_Fan
    public final void synpred168_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:355:14: ( castExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:355:14: castExpr
        {
        pushFollow(FOLLOW_castExpr_in_synpred168_Fan2384);
        castExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred168_Fan

    // $ANTLR start synpred169_Fan
    public final void synpred169_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:355:25: ( groupedExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:355:25: groupedExpr
        {
        pushFollow(FOLLOW_groupedExpr_in_synpred169_Fan2388);
        groupedExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred169_Fan

    // $ANTLR start synpred170_Fan
    public final void synpred170_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:31: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:31: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred170_Fan2424);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred170_Fan

    // $ANTLR start synpred171_Fan
    public final void synpred171_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:360:14: ( prefixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:360:14: prefixExpr
        {
        pushFollow(FOLLOW_prefixExpr_in_synpred171_Fan2433);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred171_Fan

    // $ANTLR start synpred172_Fan
    public final void synpred172_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:360:27: ( postfixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:360:27: postfixExpr
        {
        pushFollow(FOLLOW_postfixExpr_in_synpred172_Fan2437);
        postfixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred172_Fan

    // $ANTLR start synpred180_Fan
    public final void synpred180_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:363:22: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:363:22: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred180_Fan2505);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred180_Fan

    // $ANTLR start synpred181_Fan
    public final void synpred181_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:365:13: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:365:13: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred181_Fan2515);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred181_Fan

    // $ANTLR start synpred182_Fan
    public final void synpred182_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:365:25: ( literal )
        // src/net/colar/netbeans/fan/antlr/Fan.g:365:25: literal
        {
        pushFollow(FOLLOW_literal_in_synpred182_Fan2519);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred182_Fan

    // $ANTLR start synpred183_Fan
    public final void synpred183_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:365:35: ( typeBase )
        // src/net/colar/netbeans/fan/antlr/Fan.g:365:35: typeBase
        {
        pushFollow(FOLLOW_typeBase_in_synpred183_Fan2523);
        typeBase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred183_Fan

    // $ANTLR start synpred184_Fan
    public final void synpred184_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:366:12: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:366:12: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred184_Fan2534);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred184_Fan

    // $ANTLR start synpred185_Fan
    public final void synpred185_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:366:26: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:366:26: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred185_Fan2538);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred185_Fan

    // $ANTLR start synpred186_Fan
    public final void synpred186_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:366:40: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:366:40: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred186_Fan2542);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred186_Fan

    // $ANTLR start synpred187_Fan
    public final void synpred187_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:366:53: ( staticCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:366:53: staticCall
        {
        pushFollow(FOLLOW_staticCall_in_synpred187_Fan2546);
        staticCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred187_Fan

    // $ANTLR start synpred188_Fan
    public final void synpred188_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:367:19: ( dsl )
        // src/net/colar/netbeans/fan/antlr/Fan.g:367:19: dsl
        {
        pushFollow(FOLLOW_dsl_in_synpred188_Fan2568);
        dsl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred188_Fan

    // $ANTLR start synpred189_Fan
    public final void synpred189_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:367:25: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:367:25: closure
        {
        pushFollow(FOLLOW_closure_in_synpred189_Fan2572);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred189_Fan

    // $ANTLR start synpred190_Fan
    public final void synpred190_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:367:35: ( simple )
        // src/net/colar/netbeans/fan/antlr/Fan.g:367:35: simple
        {
        pushFollow(FOLLOW_simple_in_synpred190_Fan2576);
        simple();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred190_Fan

    // $ANTLR start synpred196_Fan
    public final void synpred196_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:372:16: ( callOp )
        // src/net/colar/netbeans/fan/antlr/Fan.g:372:16: callOp
        {
        pushFollow(FOLLOW_callOp_in_synpred196_Fan2632);
        callOp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred196_Fan

    // $ANTLR start synpred199_Fan
    public final void synpred199_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:376:22: ( stmt ( SP_COMMA )? ( SP_SEMI )? )
        // src/net/colar/netbeans/fan/antlr/Fan.g:376:22: stmt ( SP_COMMA )? ( SP_SEMI )?
        {
        pushFollow(FOLLOW_stmt_in_synpred199_Fan2666);
        stmt();

        state._fsp--;
        if (state.failed) return ;
        // src/net/colar/netbeans/fan/antlr/Fan.g:376:27: ( SP_COMMA )?
        int alt167=2;
        int LA167_0 = input.LA(1);

        if ( (LA167_0==SP_COMMA) ) {
            alt167=1;
        }
        switch (alt167) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                {
                match(input,SP_COMMA,FOLLOW_SP_COMMA_in_synpred199_Fan2668); if (state.failed) return ;

                }
                break;

        }

        // src/net/colar/netbeans/fan/antlr/Fan.g:376:37: ( SP_SEMI )?
        int alt168=2;
        int LA168_0 = input.LA(1);

        if ( (LA168_0==SP_SEMI) ) {
            alt168=1;
        }
        switch (alt168) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
                {
                match(input,SP_SEMI,FOLLOW_SP_SEMI_in_synpred199_Fan2671); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred199_Fan

    // $ANTLR start synpred200_Fan
    public final void synpred200_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:383:33: ( args )
        // src/net/colar/netbeans/fan/antlr/Fan.g:383:33: args
        {
        pushFollow(FOLLOW_args_in_synpred200_Fan2742);
        args();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred200_Fan

    // $ANTLR start synpred201_Fan
    public final void synpred201_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:383:45: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:383:45: closure
        {
        pushFollow(FOLLOW_closure_in_synpred201_Fan2748);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred201_Fan

    // $ANTLR start synpred202_Fan
    public final void synpred202_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:385:25: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:385:25: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred202_Fan2774);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred202_Fan

    // $ANTLR start synpred203_Fan
    public final void synpred203_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:387:12: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:387:12: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred203_Fan2787);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred203_Fan

    // $ANTLR start synpred205_Fan
    public final void synpred205_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:393:13: ( ( callParams closure ) )
        // src/net/colar/netbeans/fan/antlr/Fan.g:393:13: ( callParams closure )
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:393:13: ( callParams closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:393:14: callParams closure
        {
        pushFollow(FOLLOW_callParams_in_synpred205_Fan2828);
        callParams();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_closure_in_synpred205_Fan2830);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred205_Fan

    // $ANTLR start synpred206_Fan
    public final void synpred206_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:393:36: ( callParams )
        // src/net/colar/netbeans/fan/antlr/Fan.g:393:36: callParams
        {
        pushFollow(FOLLOW_callParams_in_synpred206_Fan2835);
        callParams();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred206_Fan

    // $ANTLR start synpred207_Fan
    public final void synpred207_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:395:36: ( args )
        // src/net/colar/netbeans/fan/antlr/Fan.g:395:36: args
        {
        pushFollow(FOLLOW_args_in_synpred207_Fan2852);
        args();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred207_Fan

    // $ANTLR start synpred220_Fan
    public final void synpred220_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:399:20: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:399:20: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred220_Fan2928);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred220_Fan

    // $ANTLR start synpred221_Fan
    public final void synpred221_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:400:4: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:400:4: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred221_Fan2935);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred221_Fan

    // $ANTLR start synpred222_Fan
    public final void synpred222_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:400:18: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:400:18: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred222_Fan2939);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred222_Fan

    // $ANTLR start synpred223_Fan
    public final void synpred223_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:400:32: ( list )
        // src/net/colar/netbeans/fan/antlr/Fan.g:400:32: list
        {
        pushFollow(FOLLOW_list_in_synpred223_Fan2943);
        list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred223_Fan

    // $ANTLR start synpred224_Fan
    public final void synpred224_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:400:39: ( map )
        // src/net/colar/netbeans/fan/antlr/Fan.g:400:39: map
        {
        pushFollow(FOLLOW_map_in_synpred224_Fan2947);
        map();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred224_Fan

    // $ANTLR start synpred226_Fan
    public final void synpred226_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:11: ( type {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:11: type {...}?
        {
        pushFollow(FOLLOW_type_in_synpred226_Fan3002);
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

    // $ANTLR start synpred227_Fan
    public final void synpred227_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:405:21: ( SP_COMMA expr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:405:21: SP_COMMA expr
        {
        match(input,SP_COMMA,FOLLOW_SP_COMMA_in_synpred227_Fan3024); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred227_Fan3026);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred227_Fan

    // $ANTLR start synpred230_Fan
    public final void synpred230_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:406:10: ( mapType {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:406:10: mapType {...}?
        {
        pushFollow(FOLLOW_mapType_in_synpred230_Fan3047);
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

    // $ANTLR start synpred231_Fan
    public final void synpred231_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:407:23: ( SP_COMMA mapPair )
        // src/net/colar/netbeans/fan/antlr/Fan.g:407:23: SP_COMMA mapPair
        {
        match(input,SP_COMMA,FOLLOW_SP_COMMA_in_synpred231_Fan3069); if (state.failed) return ;
        pushFollow(FOLLOW_mapPair_in_synpred231_Fan3071);
        mapPair();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred231_Fan

    // $ANTLR start synpred234_Fan
    public final void synpred234_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:411:9: ( DOC )
        // src/net/colar/netbeans/fan/antlr/Fan.g:411:9: DOC
        {
        match(input,DOC,FOLLOW_DOC_in_synpred234_Fan3116); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred234_Fan

    // $ANTLR start synpred237_Fan
    public final void synpred237_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:419:5: ( SP_SEMI )
        // src/net/colar/netbeans/fan/antlr/Fan.g:419:5: SP_SEMI
        {
        match(input,SP_SEMI,FOLLOW_SP_SEMI_in_synpred237_Fan3167); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred237_Fan

    // Delegated rules

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
    public final boolean synpred138_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred227_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred227_Fan_fragment(); // can never throw exception
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
    public final boolean synpred135_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred231_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred231_Fan_fragment(); // can never throw exception
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
    public final boolean synpred207_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred207_Fan_fragment(); // can never throw exception
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
    public final boolean synpred35_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_Fan_fragment(); // can never throw exception
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
    public final boolean synpred119_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_Fan_fragment(); // can never throw exception
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
    public final boolean synpred140_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred140_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred139_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred139_Fan_fragment(); // can never throw exception
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
    public final boolean synpred128_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred128_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_Fan_fragment(); // can never throw exception
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
    public final boolean synpred102_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_Fan_fragment(); // can never throw exception
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
    public final boolean synpred104_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_Fan_fragment(); // can never throw exception
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
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA94 dfa94 = new DFA94(this);
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
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA125 dfa125 = new DFA125(this);
    protected DFA130 dfa130 = new DFA130(this);
    protected DFA132 dfa132 = new DFA132(this);
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\2\2\2\uffff";
    static final String DFA2_minS =
        "\2\24\2\uffff";
    static final String DFA2_maxS =
        "\2\136\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\3\4\uffff\1\3\1\uffff\10\3\63\uffff\1\3\6\uffff\1\1",
            "\2\3\4\uffff\1\3\1\uffff\10\3\63\uffff\1\3\6\uffff\1\1",
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
            return "()* loopback of 209:18: ( typeDef )*";
        }
    }
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\3\uffff\1\7\5\uffff\1\7\1\13\2\uffff";
    static final String DFA3_minS =
        "\1\21\2\130\1\21\1\141\2\130\1\uffff\1\130\2\21\2\uffff";
    static final String DFA3_maxS =
        "\1\21\1\141\1\130\1\136\1\141\2\130\1\uffff\1\130\2\136\2\uffff";
    static final String DFA3_acceptS =
        "\7\uffff\1\1\3\uffff\1\2\1\3";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\3\10\uffff\1\2",
            "\1\4",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\17\uffff\1\6\1\5"+
            "\7\uffff\1\7\32\uffff\1\7\6\uffff\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            "\1\3",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\17\uffff\1\6\1\5"+
            "\7\uffff\1\7\32\uffff\1\7\6\uffff\1\7",
            "\1\13\1\14\1\uffff\2\13\4\uffff\1\13\1\uffff\10\13\30\uffff"+
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
            return "211:5: ( usingPod | usingType | usingAs )";
        }
    }
    static final String DFA7_eotS =
        "\13\uffff";
    static final String DFA7_eofS =
        "\13\uffff";
    static final String DFA7_minS =
        "\1\24\3\0\1\uffff\3\0\3\uffff";
    static final String DFA7_maxS =
        "\1\136\3\0\1\uffff\3\0\3\uffff";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\3\uffff\1\1\1\2\1\3";
    static final String DFA7_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\3\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\6\1\7\4\uffff\1\5\1\uffff\1\10\1\11\1\12\1\4\4\3\63\uffff"+
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
            return "220:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )";
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
    static final String DFA23_eotS =
        "\25\uffff";
    static final String DFA23_eofS =
        "\25\uffff";
    static final String DFA23_minS =
        "\1\46\1\0\23\uffff";
    static final String DFA23_maxS =
        "\1\141\1\0\23\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\1\21\uffff\1\2";
    static final String DFA23_specialS =
        "\1\uffff\1\0\23\uffff}>";
    static final String[] DFA23_transitionS = {
            "\2\2\3\uffff\4\2\12\uffff\1\2\16\uffff\1\2\2\uffff\2\2\3\uffff"+
            "\4\2\3\uffff\7\2\1\uffff\1\2\1\1\1\2",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "239:29: ( args )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred35_Fan()||(synpred35_Fan()&&(notAfterEol())))) ) {s = 2;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
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
        "\1\141\1\0\22\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA44_specialS =
        "\1\uffff\1\0\22\uffff}>";
    static final String[] DFA44_transitionS = {
            "\2\2\1\1\6\2\3\uffff\7\2\23\uffff\1\2\35\uffff\2\2\5\uffff\1"+
            "\2\2\uffff\1\2",
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
            return "256:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )";
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
        "\1\141\3\0\1\uffff\4\0\1\uffff\5\0\4\uffff";
    static final String DFA43_acceptS =
        "\4\uffff\1\1\4\uffff\1\2\5\uffff\1\2\1\3\2\uffff";
    static final String DFA43_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12"+
        "\1\13\1\14\4\uffff}>";
    static final String[] DFA43_transitionS = {
            "\2\20\1\10\1\12\1\20\1\6\1\5\1\13\1\17\3\uffff\1\7\4\3\1\4\1"+
            "\11\23\uffff\1\15\35\uffff\1\2\1\16\5\uffff\1\1\2\uffff\1\14",
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
            return "258:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )";
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

                        else if ( (LA43_0==BRACKET_R) ) {s = 12;}

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
    static final String DFA50_eotS =
        "\36\uffff";
    static final String DFA50_eofS =
        "\36\uffff";
    static final String DFA50_minS =
        "\1\4\14\uffff\1\0\14\uffff\1\0\3\uffff";
    static final String DFA50_maxS =
        "\1\141\14\uffff\1\0\14\uffff\1\0\3\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\33\uffff\1\2";
    static final String DFA50_specialS =
        "\15\uffff\1\0\14\uffff\1\1\3\uffff}>";
    static final String[] DFA50_transitionS = {
            "\11\1\23\uffff\4\35\2\uffff\2\1\3\uffff\4\1\12\uffff\1\1\16"+
            "\uffff\1\1\2\uffff\2\1\3\uffff\4\1\3\uffff\1\1\1\15\5\1\1\uffff"+
            "\2\1\1\32",
            "",
            "",
            "",
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
            "",
            "",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "268:55: ( block )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_13 = input.LA(1);

                         
                        int index50_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Fan()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index50_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_26 = input.LA(1);

                         
                        int index50_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Fan()) ) {s = 1;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index50_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\12\uffff";
    static final String DFA53_eofS =
        "\3\uffff\1\4\6\uffff";
    static final String DFA53_minS =
        "\1\71\2\uffff\1\4\1\uffff\1\0\4\uffff";
    static final String DFA53_maxS =
        "\1\141\2\uffff\1\141\1\uffff\1\0\4\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\2\1\1\uffff\1\2\1\uffff\4\1";
    static final String DFA53_specialS =
        "\1\1\2\uffff\1\0\1\uffff\1\2\4\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\2\36\uffff\1\3\10\uffff\1\1",
            "",
            "",
            "\15\4\2\uffff\11\4\3\uffff\12\4\2\uffff\4\4\4\uffff\1\6\1\uffff"+
            "\1\11\1\4\1\7\1\10\1\4\1\uffff\2\4\13\uffff\1\4\2\uffff\2\4"+
            "\3\uffff\4\4\3\uffff\1\4\1\5\11\4",
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
            return "271:11: ( ( type id )=> typeAndId | id )";
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
                        if ( (LA53_3==EOF||(LA53_3>=KW_BREAK && LA53_3<=KW_FINALLY)||(LA53_3>=KW_RD_ONLY && LA53_3<=KW_VOID)||(LA53_3>=KW_ABSTRACT && LA53_3<=KW_ELSE)||(LA53_3>=KW_NULL && LA53_3<=KW_FALSE)||LA53_3==SP_COMMA||LA53_3==SP_PIPE||(LA53_3>=AS_INIT_VAL && LA53_3<=SP_SEMI)||LA53_3==OP_CURRY||(LA53_3>=OP_PLUS && LA53_3<=OP_MINUS)||(LA53_3>=OP_BANG && LA53_3<=OP_TILDA)||LA53_3==AT||(LA53_3>=QUOTSTR && LA53_3<=BRACKET_R)) ) {s = 4;}

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
                        if ( (LA53_0==BRACKET_R) && (synpred72_Fan())) {s = 1;}

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
    static final String DFA62_eotS =
        "\36\uffff";
    static final String DFA62_eofS =
        "\36\uffff";
    static final String DFA62_minS =
        "\1\4\1\0\34\uffff";
    static final String DFA62_maxS =
        "\1\141\1\0\34\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\1\32\uffff\1\2";
    static final String DFA62_specialS =
        "\1\uffff\1\0\34\uffff}>";
    static final String[] DFA62_transitionS = {
            "\11\2\31\uffff\2\2\3\uffff\4\2\12\uffff\1\2\16\uffff\1\2\2\uffff"+
            "\2\2\3\uffff\4\2\3\uffff\7\2\1\uffff\2\2\1\1",
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

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "()* loopback of 280:19: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_Fan()) ) {s = 2;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\25\uffff";
    static final String DFA68_eofS =
        "\25\uffff";
    static final String DFA68_minS =
        "\1\46\1\0\23\uffff";
    static final String DFA68_maxS =
        "\1\141\1\0\23\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\1\21\uffff\1\2";
    static final String DFA68_specialS =
        "\1\uffff\1\0\23\uffff}>";
    static final String[] DFA68_transitionS = {
            "\2\2\3\uffff\4\2\12\uffff\1\2\16\uffff\1\2\2\uffff\2\2\3\uffff"+
            "\4\2\3\uffff\7\2\1\uffff\1\2\1\1\1\2",
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

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "286:37: ( args )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred102_Fan()||(synpred102_Fan()&&(notAfterEol())))) ) {s = 2;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\25\uffff";
    static final String DFA70_eofS =
        "\25\uffff";
    static final String DFA70_minS =
        "\1\46\1\0\23\uffff";
    static final String DFA70_maxS =
        "\1\141\1\0\23\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\1\21\uffff\1\2";
    static final String DFA70_specialS =
        "\1\uffff\1\0\23\uffff}>";
    static final String[] DFA70_transitionS = {
            "\2\2\3\uffff\4\2\12\uffff\1\2\16\uffff\1\2\2\uffff\2\2\3\uffff"+
            "\4\2\3\uffff\7\2\1\uffff\1\2\1\1\1\2",
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

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "287:42: ( args )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred104_Fan()&&(notAfterEol()))||synpred104_Fan())) ) {s = 2;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\36\uffff";
    static final String DFA71_eofS =
        "\36\uffff";
    static final String DFA71_minS =
        "\1\4\1\0\34\uffff";
    static final String DFA71_maxS =
        "\1\141\1\0\34\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\32\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\34\uffff}>";
    static final String[] DFA71_transitionS = {
            "\11\2\31\uffff\2\2\3\uffff\4\2\12\uffff\1\2\16\uffff\1\2\2\uffff"+
            "\2\2\3\uffff\4\2\3\uffff\7\2\1\uffff\1\2\1\1\1\2",
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

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "291:5: ( ( bracketL )=> multiStmt | stmt )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_Fan()) ) {s = 29;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
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
            "\4\12\12\uffff\1\33\16\uffff\1\12\2\uffff\2\12\3\uffff\4\12"+
            "\3\uffff\1\12\1\15\5\12\1\uffff\2\12\1\32",
            "",
            "",
            "",
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
            return "295:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )";
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
    static final String DFA76_eotS =
        "\25\uffff";
    static final String DFA76_eofS =
        "\25\uffff";
    static final String DFA76_minS =
        "\1\46\1\0\23\uffff";
    static final String DFA76_maxS =
        "\1\141\1\0\23\uffff";
    static final String DFA76_acceptS =
        "\2\uffff\1\1\21\uffff\1\2";
    static final String DFA76_specialS =
        "\1\uffff\1\0\23\uffff}>";
    static final String[] DFA76_transitionS = {
            "\2\2\3\uffff\4\2\12\uffff\1\2\16\uffff\1\2\2\uffff\2\2\3\uffff"+
            "\4\2\3\uffff\7\2\1\uffff\1\2\1\1\1\2",
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

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "306:53: ( expr )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred119_Fan()||(synpred119_Fan()&&(notAfterEol())))) ) {s = 2;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\64\uffff";
    static final String DFA78_eofS =
        "\1\1\63\uffff";
    static final String DFA78_minS =
        "\1\4\1\uffff\1\0\11\uffff\22\0\26\uffff";
    static final String DFA78_maxS =
        "\1\141\1\uffff\1\0\11\uffff\22\0\26\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\61\uffff\1\2";
    static final String DFA78_specialS =
        "\2\uffff\1\0\11\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
        "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\26\uffff}>";
    static final String[] DFA78_transitionS = {
            "\15\1\2\uffff\11\1\3\uffff\7\1\1\21\1\22\1\1\2\uffff\1\20\1"+
            "\23\1\24\1\25\7\uffff\1\1\2\uffff\1\34\2\uffff\1\1\13\uffff"+
            "\1\31\2\uffff\1\31\1\15\3\uffff\4\31\3\uffff\1\16\1\17\1\26"+
            "\1\27\1\30\1\33\1\35\1\1\1\32\1\14\1\2",
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
            return "309:22: ( eos | expr eos )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_2 = input.LA(1);

                         
                        int index78_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_12 = input.LA(1);

                         
                        int index78_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||(synpred121_Fan()&&(lookupNL()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred121_Fan()&&(lookupNL()))&&(notAfterEol())))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA78_13 = input.LA(1);

                         
                        int index78_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA78_14 = input.LA(1);

                         
                        int index78_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA78_15 = input.LA(1);

                         
                        int index78_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA78_16 = input.LA(1);

                         
                        int index78_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA78_17 = input.LA(1);

                         
                        int index78_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_17);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA78_18 = input.LA(1);

                         
                        int index78_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA78_19 = input.LA(1);

                         
                        int index78_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_19);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA78_20 = input.LA(1);

                         
                        int index78_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_20);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA78_21 = input.LA(1);

                         
                        int index78_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_21);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA78_22 = input.LA(1);

                         
                        int index78_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_22);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA78_23 = input.LA(1);

                         
                        int index78_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_23);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA78_24 = input.LA(1);

                         
                        int index78_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_24);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA78_25 = input.LA(1);

                         
                        int index78_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_25);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA78_26 = input.LA(1);

                         
                        int index78_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_26);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA78_27 = input.LA(1);

                         
                        int index78_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_27);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA78_28 = input.LA(1);

                         
                        int index78_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred121_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index78_28);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
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
    static final String DFA82_eotS =
        "\64\uffff";
    static final String DFA82_eofS =
        "\1\2\63\uffff";
    static final String DFA82_minS =
        "\1\4\1\0\62\uffff";
    static final String DFA82_maxS =
        "\1\141\1\0\62\uffff";
    static final String DFA82_acceptS =
        "\2\uffff\1\2\60\uffff\1\1";
    static final String DFA82_specialS =
        "\1\uffff\1\0\62\uffff}>";
    static final String[] DFA82_transitionS = {
            "\15\2\2\uffff\11\2\3\uffff\12\2\2\uffff\4\2\7\uffff\1\2\2\uffff"+
            "\1\2\2\uffff\1\2\13\uffff\1\2\2\uffff\2\2\3\uffff\4\2\3\uffff"+
            "\11\2\1\1\1\2",
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
            ""
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "313:17: ( ( bracketL )=> try_long | ( stmt )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_1 = input.LA(1);

                         
                        int index82_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index82_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\64\uffff";
    static final String DFA81_eofS =
        "\1\1\63\uffff";
    static final String DFA81_minS =
        "\1\4\2\uffff\34\0\25\uffff";
    static final String DFA81_maxS =
        "\1\141\2\uffff\34\0\25\uffff";
    static final String DFA81_acceptS =
        "\1\uffff\1\2\61\uffff\1\1";
    static final String DFA81_specialS =
        "\3\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\25\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\7\1\10\1\5\1\4\1\11\1\12\1\13\1\6\1\14\4\1\2\uffff\11\1\3"+
            "\uffff\7\1\1\22\1\23\1\1\2\uffff\1\21\1\24\1\25\1\26\7\uffff"+
            "\1\1\2\uffff\1\35\2\uffff\1\1\13\uffff\1\32\2\uffff\1\32\1\16"+
            "\3\uffff\4\32\3\uffff\1\17\1\20\1\27\1\30\1\31\1\34\1\36\1\1"+
            "\1\33\1\15\1\3",
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
            return "()* loopback of 313:41: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_3 = input.LA(1);

                         
                        int index81_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_4 = input.LA(1);

                         
                        int index81_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_5 = input.LA(1);

                         
                        int index81_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_6 = input.LA(1);

                         
                        int index81_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_7 = input.LA(1);

                         
                        int index81_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA81_8 = input.LA(1);

                         
                        int index81_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA81_9 = input.LA(1);

                         
                        int index81_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA81_10 = input.LA(1);

                         
                        int index81_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA81_11 = input.LA(1);

                         
                        int index81_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA81_12 = input.LA(1);

                         
                        int index81_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA81_13 = input.LA(1);

                         
                        int index81_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred125_Fan()&&(notAfterEol()))||synpred125_Fan())) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA81_14 = input.LA(1);

                         
                        int index81_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_14);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA81_15 = input.LA(1);

                         
                        int index81_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_15);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA81_16 = input.LA(1);

                         
                        int index81_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_16);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA81_17 = input.LA(1);

                         
                        int index81_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_17);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA81_18 = input.LA(1);

                         
                        int index81_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_18);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA81_19 = input.LA(1);

                         
                        int index81_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_19);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA81_20 = input.LA(1);

                         
                        int index81_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_20);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA81_21 = input.LA(1);

                         
                        int index81_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_21);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA81_22 = input.LA(1);

                         
                        int index81_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_22);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA81_23 = input.LA(1);

                         
                        int index81_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_23);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA81_24 = input.LA(1);

                         
                        int index81_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_24);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA81_25 = input.LA(1);

                         
                        int index81_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_25);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA81_26 = input.LA(1);

                         
                        int index81_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_26);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA81_27 = input.LA(1);

                         
                        int index81_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_27);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA81_28 = input.LA(1);

                         
                        int index81_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_28);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA81_29 = input.LA(1);

                         
                        int index81_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_29);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
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
            "\2\4\3\uffff\4\4\12\uffff\1\2\16\uffff\1\4\2\uffff\2\4\3\uffff"+
            "\4\4\3\uffff\1\4\1\3\5\4\1\uffff\2\4\1\1",
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
            return "317:1: forInit : ( forInitDef | expr );";
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
        "\64\uffff";
    static final String DFA89_eofS =
        "\1\2\63\uffff";
    static final String DFA89_minS =
        "\1\4\1\0\62\uffff";
    static final String DFA89_maxS =
        "\1\141\1\0\62\uffff";
    static final String DFA89_acceptS =
        "\2\uffff\1\2\60\uffff\1\1";
    static final String DFA89_specialS =
        "\1\uffff\1\0\62\uffff}>";
    static final String[] DFA89_transitionS = {
            "\15\2\2\uffff\11\2\3\uffff\12\2\2\uffff\4\2\7\uffff\1\2\2\uffff"+
            "\1\2\2\uffff\1\2\13\uffff\1\2\2\uffff\2\2\3\uffff\4\2\3\uffff"+
            "\11\2\1\1\1\2",
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
            return "320:21: ( catchDef )?";
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
                        if ( (synpred132_Fan()) ) {s = 51;}

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
    static final String DFA91_eotS =
        "\64\uffff";
    static final String DFA91_eofS =
        "\1\2\63\uffff";
    static final String DFA91_minS =
        "\1\4\1\0\62\uffff";
    static final String DFA91_maxS =
        "\1\141\1\0\62\uffff";
    static final String DFA91_acceptS =
        "\2\uffff\1\2\60\uffff\1\1";
    static final String DFA91_specialS =
        "\1\uffff\1\0\62\uffff}>";
    static final String[] DFA91_transitionS = {
            "\15\2\2\uffff\11\2\3\uffff\12\2\2\uffff\4\2\7\uffff\1\2\2\uffff"+
            "\1\2\2\uffff\1\2\13\uffff\1\2\2\uffff\2\2\3\uffff\4\2\3\uffff"+
            "\11\2\1\1\1\2",
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
            ""
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "320:31: ( ( bracketL )=> catch_long | ( stmt )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_1 = input.LA(1);

                         
                        int index91_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA90_eotS =
        "\64\uffff";
    static final String DFA90_eofS =
        "\1\1\63\uffff";
    static final String DFA90_minS =
        "\1\4\1\uffff\34\0\26\uffff";
    static final String DFA90_maxS =
        "\1\141\1\uffff\34\0\26\uffff";
    static final String DFA90_acceptS =
        "\1\uffff\1\2\61\uffff\1\1";
    static final String DFA90_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\26\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\6\1\7\1\4\1\3\1\10\1\11\1\12\1\5\1\13\4\1\2\uffff\11\1\3"+
            "\uffff\7\1\1\21\1\22\1\1\2\uffff\1\20\1\23\1\24\1\25\7\uffff"+
            "\1\1\2\uffff\1\34\2\uffff\1\1\13\uffff\1\31\2\uffff\1\31\1\15"+
            "\3\uffff\4\31\3\uffff\1\16\1\17\1\26\1\27\1\30\1\33\1\35\1\1"+
            "\1\32\1\14\1\2",
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
            return "()* loopback of 320:57: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA90_2 = input.LA(1);

                         
                        int index90_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA90_3 = input.LA(1);

                         
                        int index90_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA90_4 = input.LA(1);

                         
                        int index90_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA90_5 = input.LA(1);

                         
                        int index90_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA90_6 = input.LA(1);

                         
                        int index90_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA90_7 = input.LA(1);

                         
                        int index90_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA90_8 = input.LA(1);

                         
                        int index90_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA90_9 = input.LA(1);

                         
                        int index90_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA90_10 = input.LA(1);

                         
                        int index90_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA90_11 = input.LA(1);

                         
                        int index90_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA90_12 = input.LA(1);

                         
                        int index90_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred134_Fan()||(synpred134_Fan()&&(notAfterEol())))) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA90_13 = input.LA(1);

                         
                        int index90_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA90_14 = input.LA(1);

                         
                        int index90_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA90_15 = input.LA(1);

                         
                        int index90_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA90_16 = input.LA(1);

                         
                        int index90_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA90_17 = input.LA(1);

                         
                        int index90_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA90_18 = input.LA(1);

                         
                        int index90_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA90_19 = input.LA(1);

                         
                        int index90_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA90_20 = input.LA(1);

                         
                        int index90_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_20);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA90_21 = input.LA(1);

                         
                        int index90_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_21);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA90_22 = input.LA(1);

                         
                        int index90_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_22);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA90_23 = input.LA(1);

                         
                        int index90_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_23);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA90_24 = input.LA(1);

                         
                        int index90_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_24);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA90_25 = input.LA(1);

                         
                        int index90_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_25);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA90_26 = input.LA(1);

                         
                        int index90_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_26);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA90_27 = input.LA(1);

                         
                        int index90_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_27);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA90_28 = input.LA(1);

                         
                        int index90_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index90_28);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
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
    static final String DFA94_eotS =
        "\64\uffff";
    static final String DFA94_eofS =
        "\1\2\63\uffff";
    static final String DFA94_minS =
        "\1\4\1\0\62\uffff";
    static final String DFA94_maxS =
        "\1\141\1\0\62\uffff";
    static final String DFA94_acceptS =
        "\2\uffff\1\2\60\uffff\1\1";
    static final String DFA94_specialS =
        "\1\uffff\1\0\62\uffff}>";
    static final String[] DFA94_transitionS = {
            "\15\2\2\uffff\11\2\3\uffff\12\2\2\uffff\4\2\7\uffff\1\2\2\uffff"+
            "\1\2\2\uffff\1\2\13\uffff\1\2\2\uffff\2\2\3\uffff\4\2\3\uffff"+
            "\11\2\1\1\1\2",
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
            ""
    };

    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }
        public String getDescription() {
            return "324:24: ( ( bracketL )=> finally_long | ( stmt )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA94_1 = input.LA(1);

                         
                        int index94_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index94_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 94, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA93_eotS =
        "\64\uffff";
    static final String DFA93_eofS =
        "\1\35\63\uffff";
    static final String DFA93_minS =
        "\1\4\34\0\27\uffff";
    static final String DFA93_maxS =
        "\1\141\34\0\27\uffff";
    static final String DFA93_acceptS =
        "\35\uffff\1\2\25\uffff\1\1";
    static final String DFA93_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\27\uffff}>";
    static final String[] DFA93_transitionS = {
            "\1\5\1\6\1\3\1\2\1\7\1\10\1\11\1\4\1\12\4\35\2\uffff\11\35\3"+
            "\uffff\7\35\1\20\1\21\1\35\2\uffff\1\17\1\22\1\23\1\24\7\uffff"+
            "\1\35\2\uffff\1\33\2\uffff\1\35\13\uffff\1\30\2\uffff\1\30\1"+
            "\14\3\uffff\4\30\3\uffff\1\15\1\16\1\25\1\26\1\27\1\32\1\34"+
            "\1\35\1\31\1\13\1\1",
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
            return "()* loopback of 324:52: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA93_1 = input.LA(1);

                         
                        int index93_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA93_2 = input.LA(1);

                         
                        int index93_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA93_3 = input.LA(1);

                         
                        int index93_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA93_4 = input.LA(1);

                         
                        int index93_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA93_5 = input.LA(1);

                         
                        int index93_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA93_6 = input.LA(1);

                         
                        int index93_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA93_7 = input.LA(1);

                         
                        int index93_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA93_8 = input.LA(1);

                         
                        int index93_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA93_9 = input.LA(1);

                         
                        int index93_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA93_10 = input.LA(1);

                         
                        int index93_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA93_11 = input.LA(1);

                         
                        int index93_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred137_Fan()&&(notAfterEol()))||synpred137_Fan())) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA93_12 = input.LA(1);

                         
                        int index93_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA93_13 = input.LA(1);

                         
                        int index93_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA93_14 = input.LA(1);

                         
                        int index93_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA93_15 = input.LA(1);

                         
                        int index93_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA93_16 = input.LA(1);

                         
                        int index93_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA93_17 = input.LA(1);

                         
                        int index93_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA93_18 = input.LA(1);

                         
                        int index93_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA93_19 = input.LA(1);

                         
                        int index93_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA93_20 = input.LA(1);

                         
                        int index93_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA93_21 = input.LA(1);

                         
                        int index93_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA93_22 = input.LA(1);

                         
                        int index93_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA93_23 = input.LA(1);

                         
                        int index93_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA93_24 = input.LA(1);

                         
                        int index93_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA93_25 = input.LA(1);

                         
                        int index93_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA93_26 = input.LA(1);

                         
                        int index93_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA93_27 = input.LA(1);

                         
                        int index93_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index93_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA93_28 = input.LA(1);

                         
                        int index93_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 29;}

                         
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
        "\101\uffff";
    static final String DFA109_eofS =
        "\1\1\100\uffff";
    static final String DFA109_minS =
        "\1\4\27\uffff\1\0\50\uffff";
    static final String DFA109_maxS =
        "\1\141\27\uffff\1\0\50\uffff";
    static final String DFA109_acceptS =
        "\1\uffff\1\2\76\uffff\1\1";
    static final String DFA109_specialS =
        "\30\uffff\1\0\50\uffff}>";
    static final String[] DFA109_transitionS = {
            "\15\1\1\uffff\35\1\6\uffff\3\1\1\uffff\1\30\2\uffff\13\1\1\100"+
            "\1\1\2\uffff\2\1\3\uffff\4\1\3\uffff\13\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 349:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_24 = input.LA(1);

                         
                        int index109_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred158_Fan()) ) {s = 64;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index109_24);
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
        "\103\uffff";
    static final String DFA110_eofS =
        "\1\1\102\uffff";
    static final String DFA110_minS =
        "\1\4\63\uffff\1\0\16\uffff";
    static final String DFA110_maxS =
        "\1\141\63\uffff\1\0\16\uffff";
    static final String DFA110_acceptS =
        "\1\uffff\1\2\100\uffff\1\1";
    static final String DFA110_specialS =
        "\64\uffff\1\0\16\uffff}>";
    static final String[] DFA110_transitionS = {
            "\15\1\1\uffff\35\1\6\uffff\3\1\1\uffff\1\1\2\uffff\14\1\1\64"+
            "\2\uffff\2\1\3\uffff\4\1\3\uffff\13\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 350:25: ( OP_CURRY shiftExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_52 = input.LA(1);

                         
                        int index110_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred159_Fan()) ) {s = 66;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index110_52);
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
        "\105\uffff";
    static final String DFA112_eofS =
        "\1\1\104\uffff";
    static final String DFA112_minS =
        "\1\4\53\uffff\1\0\11\uffff\1\0\16\uffff";
    static final String DFA112_maxS =
        "\1\141\53\uffff\1\0\11\uffff\1\0\16\uffff";
    static final String DFA112_acceptS =
        "\1\uffff\1\2\102\uffff\1\1";
    static final String DFA112_specialS =
        "\54\uffff\1\0\11\uffff\1\1\16\uffff}>";
    static final String[] DFA112_transitionS = {
            "\15\1\1\uffff\35\1\6\uffff\3\1\1\uffff\1\1\2\uffff\17\1\1\66"+
            "\1\54\3\uffff\4\1\3\uffff\13\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 352:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA112_44 = input.LA(1);

                         
                        int index112_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred163_Fan()) ) {s = 68;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index112_44);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA112_54 = input.LA(1);

                         
                        int index112_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred163_Fan()) ) {s = 68;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index112_54);
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
            "\2\2\3\uffff\4\2\12\uffff\1\2\16\uffff\1\2\2\uffff\2\2\3\uffff"+
            "\4\2\3\uffff\7\2\1\uffff\1\2\1\1\1\2",
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
            return "355:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );";
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
        "\111\uffff";
    static final String DFA115_eofS =
        "\1\1\110\uffff";
    static final String DFA115_minS =
        "\1\4\17\uffff\1\0\1\uffff\1\0\66\uffff";
    static final String DFA115_maxS =
        "\1\141\17\uffff\1\0\1\uffff\1\0\66\uffff";
    static final String DFA115_acceptS =
        "\1\uffff\1\2\103\uffff\1\1\3\uffff";
    static final String DFA115_specialS =
        "\20\uffff\1\0\1\uffff\1\1\66\uffff}>";
    static final String[] DFA115_transitionS = {
            "\15\1\1\uffff\35\1\5\uffff\1\105\3\1\1\uffff\1\1\1\105\1\uffff"+
            "\30\1\1\uffff\2\105\11\1\1\20\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 359:31: ( termChain )*";
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
                        if ( (((synpred170_Fan()&&(notAfterEol()))||synpred170_Fan())) ) {s = 69;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index115_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA115_18 = input.LA(1);

                         
                        int index115_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred170_Fan()&&(notAfterEol()))) ) {s = 69;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index115_18);
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
            "\1\5\1\6\3\uffff\1\4\1\7\1\10\1\11\12\uffff\1\21\16\uffff\1"+
            "\15\2\uffff\1\15\1\1\3\uffff\4\15\3\uffff\1\2\1\3\1\12\1\13"+
            "\1\14\1\17\1\22\1\uffff\1\16\1\uffff\1\20",
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
            return "360:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );";
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
        "\112\uffff";
    static final String DFA117_eofS =
        "\1\1\111\uffff";
    static final String DFA117_minS =
        "\1\4\17\uffff\1\0\1\uffff\1\0\67\uffff";
    static final String DFA117_maxS =
        "\1\141\17\uffff\1\0\1\uffff\1\0\67\uffff";
    static final String DFA117_acceptS =
        "\1\uffff\1\2\104\uffff\1\1\3\uffff";
    static final String DFA117_specialS =
        "\20\uffff\1\0\1\uffff\1\1\67\uffff}>";
    static final String[] DFA117_transitionS = {
            "\15\1\1\uffff\35\1\5\uffff\1\106\3\1\1\uffff\1\1\1\106\1\uffff"+
            "\30\1\1\uffff\2\106\11\1\1\20\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 363:22: ( termChain )*";
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
                        if ( ((synpred180_Fan()||(synpred180_Fan()&&(notAfterEol())))) ) {s = 70;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index117_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA117_18 = input.LA(1);

                         
                        int index117_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred180_Fan()&&(notAfterEol()))) ) {s = 70;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index117_18);
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
            "\2\3\3\uffff\4\3\12\uffff\1\20\22\uffff\1\3\12\uffff\1\1\1\2"+
            "\4\3\1\21\1\uffff\1\3\1\uffff\1\17",
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
            return "365:1: termBase : ( idExprReq | literal | typeBase | id );";
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
        "\1\71\3\0\10\uffff";
    static final String DFA119_maxS =
        "\1\141\3\0\10\uffff";
    static final String DFA119_acceptS =
        "\4\uffff\1\2\1\1\1\4\1\7\1\10\1\6\1\3\1\5";
    static final String DFA119_specialS =
        "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] DFA119_transitionS = {
            "\1\2\36\uffff\1\3\4\uffff\1\4\3\uffff\1\1",
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
            return "366:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );";
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
    static final String DFA124_eotS =
        "\25\uffff";
    static final String DFA124_eofS =
        "\25\uffff";
    static final String DFA124_minS =
        "\1\46\1\0\23\uffff";
    static final String DFA124_maxS =
        "\1\141\1\0\23\uffff";
    static final String DFA124_acceptS =
        "\2\uffff\1\1\21\uffff\1\2";
    static final String DFA124_specialS =
        "\1\uffff\1\0\23\uffff}>";
    static final String[] DFA124_transitionS = {
            "\2\2\3\uffff\4\2\12\uffff\1\2\16\uffff\1\2\2\uffff\2\2\3\uffff"+
            "\4\2\3\uffff\7\2\1\uffff\1\2\1\1\1\2",
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

    static final short[] DFA124_eot = DFA.unpackEncodedString(DFA124_eotS);
    static final short[] DFA124_eof = DFA.unpackEncodedString(DFA124_eofS);
    static final char[] DFA124_min = DFA.unpackEncodedStringToUnsignedChars(DFA124_minS);
    static final char[] DFA124_max = DFA.unpackEncodedStringToUnsignedChars(DFA124_maxS);
    static final short[] DFA124_accept = DFA.unpackEncodedString(DFA124_acceptS);
    static final short[] DFA124_special = DFA.unpackEncodedString(DFA124_specialS);
    static final short[][] DFA124_transition;

    static {
        int numStates = DFA124_transitionS.length;
        DFA124_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA124_transition[i] = DFA.unpackEncodedString(DFA124_transitionS[i]);
        }
    }

    class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = DFA124_eot;
            this.eof = DFA124_eof;
            this.min = DFA124_min;
            this.max = DFA124_max;
            this.accept = DFA124_accept;
            this.special = DFA124_special;
            this.transition = DFA124_transition;
        }
        public String getDescription() {
            return "383:33: ( args )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA124_1 = input.LA(1);

                         
                        int index124_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred200_Fan()||(synpred200_Fan()&&(notAfterEol())))) ) {s = 2;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index124_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 124, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA125_eotS =
        "\113\uffff";
    static final String DFA125_eofS =
        "\1\1\112\uffff";
    static final String DFA125_minS =
        "\1\4\5\uffff\1\0\104\uffff";
    static final String DFA125_maxS =
        "\1\141\5\uffff\1\0\104\uffff";
    static final String DFA125_acceptS =
        "\1\uffff\1\2\110\uffff\1\1";
    static final String DFA125_specialS =
        "\6\uffff\1\0\104\uffff}>";
    static final String[] DFA125_transitionS = {
            "\15\1\1\uffff\35\1\5\uffff\4\1\1\uffff\1\6\1\1\1\uffff\30\1"+
            "\1\uffff\15\1",
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
            return "()* loopback of 383:45: ( closure )*";
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
                        if ( (synpred201_Fan()) ) {s = 74;}

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
    static final String DFA130_eotS =
        "\25\uffff";
    static final String DFA130_eofS =
        "\25\uffff";
    static final String DFA130_minS =
        "\1\46\1\0\23\uffff";
    static final String DFA130_maxS =
        "\1\141\1\0\23\uffff";
    static final String DFA130_acceptS =
        "\2\uffff\1\1\21\uffff\1\2";
    static final String DFA130_specialS =
        "\1\uffff\1\0\23\uffff}>";
    static final String[] DFA130_transitionS = {
            "\2\2\3\uffff\4\2\12\uffff\1\2\16\uffff\1\2\2\uffff\2\2\3\uffff"+
            "\4\2\3\uffff\7\2\1\uffff\1\2\1\1\1\2",
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

    static final short[] DFA130_eot = DFA.unpackEncodedString(DFA130_eotS);
    static final short[] DFA130_eof = DFA.unpackEncodedString(DFA130_eofS);
    static final char[] DFA130_min = DFA.unpackEncodedStringToUnsignedChars(DFA130_minS);
    static final char[] DFA130_max = DFA.unpackEncodedStringToUnsignedChars(DFA130_maxS);
    static final short[] DFA130_accept = DFA.unpackEncodedString(DFA130_acceptS);
    static final short[] DFA130_special = DFA.unpackEncodedString(DFA130_specialS);
    static final short[][] DFA130_transition;

    static {
        int numStates = DFA130_transitionS.length;
        DFA130_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA130_transition[i] = DFA.unpackEncodedString(DFA130_transitionS[i]);
        }
    }

    class DFA130 extends DFA {

        public DFA130(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 130;
            this.eot = DFA130_eot;
            this.eof = DFA130_eof;
            this.min = DFA130_min;
            this.max = DFA130_max;
            this.accept = DFA130_accept;
            this.special = DFA130_special;
            this.transition = DFA130_transition;
        }
        public String getDescription() {
            return "395:36: ( args )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA130_1 = input.LA(1);

                         
                        int index130_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred207_Fan()||(synpred207_Fan()&&(notAfterEol())))) ) {s = 2;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index130_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 130, _s, input);
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
            "\1\2\1\3\3\uffff\1\1\1\4\1\5\1\6\12\uffff\1\17\22\uffff\1\12"+
            "\13\uffff\1\15\1\7\1\10\1\11\1\14\1\20\1\uffff\1\12\1\uffff"+
            "\1\16",
            "",
            "",
            "",
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
            return "398:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple );";
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
 

    public static final BitSet FOLLOW_using_in_prog357 = new BitSet(new long[]{0x0000000FF4320000L,0x0000000040800000L});
    public static final BitSet FOLLOW_typeDef_in_prog360 = new BitSet(new long[]{0x0000000FF4300000L,0x0000000040800000L});
    public static final BitSet FOLLOW_docs_in_prog363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingPod_in_using385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingType_in_using389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingAs_in_using393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingPod403 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_podSpec_in_usingPod405 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_eos_in_usingPod407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingType417 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_podSpec_in_usingType419 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingType421 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_usingType423 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_eos_in_usingType425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingAs433 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_podSpec_in_usingAs435 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingAs437 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_usingAs439 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KW_AS_in_usingAs441 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_usingAs443 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_eos_in_usingAs445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ffi_in_podSpec453 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_podSpec456 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_DOT_in_podSpec459 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_podSpec461 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_ffi472 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_ffi474 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_ffi476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_typeDef485 = new BitSet(new long[]{0x0000000FF4300000L,0x0000000040800000L});
    public static final BitSet FOLLOW_facet_in_typeDef487 = new BitSet(new long[]{0x0000000FF4300000L,0x0000000040800000L});
    public static final BitSet FOLLOW_classDef_in_typeDef498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDef_in_typeDef512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinDef_in_typeDef516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classHeader_in_classDef538 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_classBody_in_classDef540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_classHeader547 = new BitSet(new long[]{0x0000000F94300000L,0x0000000000800000L});
    public static final BitSet FOLLOW_facet_in_classHeader549 = new BitSet(new long[]{0x0000000F94300000L,0x0000000000800000L});
    public static final BitSet FOLLOW_classFlags_in_classHeader552 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_classHeader555 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_classHeader557 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_inheritance_in_classHeader559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_classFlags568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_classFlags572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_classFlags576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_classFlags580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_classFlags584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_classBody592 = new BitSet(new long[]{0x0200003F8FF80000L,0x0000000241800000L});
    public static final BitSet FOLLOW_slotDef_in_classBody594 = new BitSet(new long[]{0x0200003F8FF80000L,0x0000000241800000L});
    public static final BitSet FOLLOW_bracketR_in_classBody597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_protection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinHeader_in_mixinDef634 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_mixinBody_in_mixinDef636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_mixinHeader643 = new BitSet(new long[]{0x0000000F44300000L,0x0000000000800000L});
    public static final BitSet FOLLOW_facet_in_mixinHeader645 = new BitSet(new long[]{0x0000000F44300000L,0x0000000000800000L});
    public static final BitSet FOLLOW_mixinFlags_in_mixinHeader648 = new BitSet(new long[]{0x0000000F44300000L});
    public static final BitSet FOLLOW_KW_MIXIN_in_mixinHeader651 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_mixinHeader653 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_inheritance_in_mixinHeader655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_mixinFlags663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_mixinFlags667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_mixinFlags671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_mixinFlags675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_mixinBody682 = new BitSet(new long[]{0x0200003F8FF80000L,0x0000000241800000L});
    public static final BitSet FOLLOW_slotDef_in_mixinBody684 = new BitSet(new long[]{0x0200003F8FF80000L,0x0000000241800000L});
    public static final BitSet FOLLOW_bracketR_in_mixinBody687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumHeader_in_enumDef706 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_enumBody_in_enumDef708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumHeader718 = new BitSet(new long[]{0x0000000F20000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_facet_in_enumHeader720 = new BitSet(new long[]{0x0000000F20000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_protection_in_enumHeader723 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_enumHeader726 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_enumHeader728 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_inheritance_in_enumHeader730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_enumBody738 = new BitSet(new long[]{0x0000000000000000L,0x0000000241000000L});
    public static final BitSet FOLLOW_enumValDefs_in_enumBody740 = new BitSet(new long[]{0x0200003F8FF80000L,0x0000000241800000L});
    public static final BitSet FOLLOW_slotDef_in_enumBody742 = new BitSet(new long[]{0x0200003F8FF80000L,0x0000000241800000L});
    public static final BitSet FOLLOW_bracketR_in_enumBody745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_inheritance754 = new BitSet(new long[]{0x0200000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_typeList_in_inheritance756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs764 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_enumValDefs767 = new BitSet(new long[]{0x0000000000000000L,0x0000000241000000L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs770 = new BitSet(new long[]{0x1040000000000000L});
    public static final BitSet FOLLOW_eos_in_enumValDefs774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumValDef782 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_enumValDef784 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_parL_in_enumValDef787 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_args_in_enumValDef789 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_enumValDef792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList803 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_typeList806 = new BitSet(new long[]{0x0200000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_type_in_typeList808 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_typeRoot_in_type828 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_type831 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_type835 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_type837 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_funcType_in_nonMapType848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_nonMapType852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_typeRoot859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonMapType_in_typeRoot863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_simpleType877 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_SP_COLCOL_in_simpleType880 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_simpleType882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_mapType893 = new BitSet(new long[]{0x0200000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_nonMapType_in_mapType896 = new BitSet(new long[]{0x01A0000000000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType898 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_mapType902 = new BitSet(new long[]{0x01A0000000000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType904 = new BitSet(new long[]{0x0120000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapType916 = new BitSet(new long[]{0x0200000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_type_in_mapType920 = new BitSet(new long[]{0x0020000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_mapType924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType933 = new BitSet(new long[]{0x0640000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_funcType936 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_formals_in_funcType941 = new BitSet(new long[]{0x0640000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_assignedType_in_funcType948 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_assignedType_in_funcType960 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_assignedType971 = new BitSet(new long[]{0x0200000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_type_in_assignedType973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_in_formals983 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_formals986 = new BitSet(new long[]{0x0200000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_formal_in_formals988 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_formalFull_in_formal998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_formal1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalInferred_in_formal1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalFull1018 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_formalFull1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalTypeOnly1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_formalInferred1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticBlock_in_slotDef1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_slotDef1064 = new BitSet(new long[]{0x0200003F8FF80000L,0x0000000241800000L});
    public static final BitSet FOLLOW_facet_in_slotDef1066 = new BitSet(new long[]{0x0200003F8FF80000L,0x0000000241800000L});
    public static final BitSet FOLLOW_ctorDef_in_slotDef1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDef_in_slotDef1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDef_in_slotDef1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_fieldDef1162 = new BitSet(new long[]{0x0200003F8FF80000L,0x0000000241800000L});
    public static final BitSet FOLLOW_facet_in_fieldDef1164 = new BitSet(new long[]{0x0200003F8FF80000L,0x0000000241800000L});
    public static final BitSet FOLLOW_fieldFlags_in_fieldDef1167 = new BitSet(new long[]{0x0200003F8FF80000L,0x0000000241800000L});
    public static final BitSet FOLLOW_typeId_in_fieldDef1169 = new BitSet(new long[]{0x1800000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_fieldDef1172 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_fieldDef1174 = new BitSet(new long[]{0x1000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_bracketL_in_fieldDef1189 = new BitSet(new long[]{0x0000000F00000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_protection_in_fieldDef1192 = new BitSet(new long[]{0x0000000F00000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_getter_in_fieldDef1196 = new BitSet(new long[]{0x120078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_setter_in_fieldDef1200 = new BitSet(new long[]{0x120078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_SP_SEMI_in_fieldDef1203 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_block_in_fieldDef1206 = new BitSet(new long[]{0x0200003F8FF80000L,0x0000000241800000L});
    public static final BitSet FOLLOW_bracketR_in_fieldDef1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_fieldDef1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeAndId_in_typeId1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_typeId1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeAndId1249 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_typeAndId1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_fieldFlags1259 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_RD_ONLY_in_fieldFlags1263 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_CONST_in_fieldFlags1267 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_STATIC_in_fieldFlags1271 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_fieldFlags1275 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VOLATILE_in_fieldFlags1279 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_fieldFlags1283 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_fieldFlags1287 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_FINAL_in_fieldFlags1291 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_protection_in_fieldFlags1295 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_docs_in_methodDef1315 = new BitSet(new long[]{0x0200002F8F600000L,0x0000000201800000L});
    public static final BitSet FOLLOW_facet_in_methodDef1317 = new BitSet(new long[]{0x0200002F8F600000L,0x0000000201800000L});
    public static final BitSet FOLLOW_methodFlags_in_methodDef1320 = new BitSet(new long[]{0x0200002F8F600000L,0x0000000201000000L});
    public static final BitSet FOLLOW_type_in_methodDef1324 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_KW_VOID_in_methodDef1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_methodDef1331 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_parL_in_methodDef1333 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_params_in_methodDef1335 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_methodDef1337 = new BitSet(new long[]{0x1000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_methodBody_in_methodDef1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_methodFlags1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_methodFlags1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_methodFlags1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_methodFlags1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_methodFlags1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ONCE_in_methodFlags1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_methodFlags1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_methodFlags1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params1387 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_params1390 = new BitSet(new long[]{0x0200000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_param_in_params1392 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_type_in_param1405 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_param1407 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_param1410 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_param1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_methodBody1422 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_stmt_in_methodBody1424 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_bracketR_in_methodBody1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_methodBody1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_ctorDef1451 = new BitSet(new long[]{0x0000001F00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_facet_in_ctorDef1453 = new BitSet(new long[]{0x0000001F00000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ctorFlags_in_ctorDef1456 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_ctorDef1459 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_ctorDef1461 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_parL_in_ctorDef1463 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_params_in_ctorDef1465 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_ctorDef1467 = new BitSet(new long[]{0x1020000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ctorChain_in_ctorDef1474 = new BitSet(new long[]{0x1000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_methodBody_in_ctorDef1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_ctorFlags1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_ctorChain1492 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ctorChainThis_in_ctorChain1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorChainSuper_in_ctorChain1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_ctorChainThis1508 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainThis1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_ctorChainThis1512 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_parL_in_ctorChainThis1514 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_args_in_ctorChainThis1516 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_ctorChainThis1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_ctorChainSuper1526 = new BitSet(new long[]{0x0010000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainSuper1529 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_ctorChainSuper1531 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_parL_in_ctorChainSuper1535 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_args_in_ctorChainSuper1537 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_ctorChainSuper1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_staticBlock1548 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_block_in_staticBlock1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_block1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_multiStmt1587 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_stmt_in_multiStmt1590 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_bracketR_in_multiStmt1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_if_in_stmt1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_for_in_stmt1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_while_in_stmt1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_break_in_stmt1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_continue_in_stmt1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_return_in_stmt1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switch_in_stmt1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_throw_in_stmt1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_try_in_stmt1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_stmt1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localDef_in_stmt1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_BREAK_in_g_break1671 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_eos_in_g_break1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONTINUE_in_g_continue1680 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_eos_in_g_continue1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_g_for1690 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_parL_in_g_for1692 = new BitSet(new long[]{0x120078FF8FF80000L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_forInit_in_g_for1694 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for1697 = new BitSet(new long[]{0x120078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_g_for1699 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for1702 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_g_for1704 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_g_for1707 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_block_in_g_for1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_g_if1718 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_parL_in_g_if1720 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_g_if1722 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_g_if1724 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_block_in_g_if1726 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_g_if1733 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_block_in_g_if1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_g_return1744 = new BitSet(new long[]{0x120078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_eos_in_g_return1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_g_return1751 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_eos_in_g_return1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SWITCH_in_g_switch1761 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_parL_in_g_switch1763 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_g_switch1765 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_g_switch1767 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_bracketL_in_g_switch1769 = new BitSet(new long[]{0x0200003F8FF86000L,0x0000000241800000L});
    public static final BitSet FOLLOW_g_case_in_g_switch1772 = new BitSet(new long[]{0x0200003F8FF86000L,0x0000000241800000L});
    public static final BitSet FOLLOW_g_default_in_g_switch1777 = new BitSet(new long[]{0x0200003F8FF80000L,0x0000000241800000L});
    public static final BitSet FOLLOW_bracketR_in_g_switch1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_g_throw1789 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_g_throw1791 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_eos_in_g_throw1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHILE_in_g_while1801 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_parL_in_g_while1803 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_g_while1805 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_g_while1807 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_block_in_g_while1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_g_try1817 = new BitSet(new long[]{0x020078FF8FF99FF2L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_try_long_in_g_try1824 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_stmt_in_g_try1828 = new BitSet(new long[]{0x020078FF8FF99FF2L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_g_catch_in_g_try1837 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_finally_in_g_try1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_try_long1855 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_stmt_in_try_long1857 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_bracketR_in_try_long1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprStmt1867 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_eos_in_exprStmt1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_localDef1876 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_localDef1879 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_localDef1881 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_eos_in_localDef1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_forInit1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forInit1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_forInitDef1904 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_forInitDef1907 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_forInitDef1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_g_catch1920 = new BitSet(new long[]{0x020078FF8FF81FF2L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_catchDef_in_g_catch1922 = new BitSet(new long[]{0x020078FF8FF81FF2L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_catch_long_in_g_catch1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_g_catch1934 = new BitSet(new long[]{0x020078FF8FF81FF2L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_bracketL_in_catch_long1943 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_stmt_in_catch_long1945 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_bracketR_in_catch_long1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_catchDef1956 = new BitSet(new long[]{0x0200000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_type_in_catchDef1958 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_catchDef1960 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_catchDef1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_g_finally1970 = new BitSet(new long[]{0x020078FF8FF81FF2L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_finally_long_in_g_finally1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_g_finally1981 = new BitSet(new long[]{0x020078FF8FF81FF2L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_bracketL_in_finally_long1990 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_stmt_in_finally_long1992 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_bracketR_in_finally_long1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_g_case2003 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_g_case2005 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_case2007 = new BitSet(new long[]{0x020078FF8FF81FF2L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_stmt_in_g_case2009 = new BitSet(new long[]{0x020078FF8FF81FF2L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_KW_DEFAULT_in_g_default2017 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_default2019 = new BitSet(new long[]{0x020078FF8FF81FF2L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_stmt_in_g_default2021 = new BitSet(new long[]{0x020078FF8FF81FF2L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_assignExpr_in_expr2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2049 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2052 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_assignExpr_in_assignExpr2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryExpr2063 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ternaryTail_in_ternaryExpr2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_ternaryTail2076 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail2078 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_ternaryTail2080 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2101 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_OP_OR_in_condOrExpr2105 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2108 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2118 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_OP_AND_in_condAndExpr2121 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2124 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_CP_EQUALITY_in_equalityExpr2137 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2139 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_elvisExpr_in_relationalExpr2152 = new BitSet(new long[]{0x0000060000040000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeCheck_in_relationalExpr2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_relationalExpr2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCheck2170 = new BitSet(new long[]{0x0200000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_typeRoot_in_typeCheck2182 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_typeCheck2185 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_typeCheck2190 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_CP_COMPARATORS_in_compare2203 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_elvisExpr_in_compare2205 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2216 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_OP_ELVIS_in_elvisExpr2219 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2221 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2232 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000070L});
    public static final BitSet FOLLOW_set_in_rangeExpr2235 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2249 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000070L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2260 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_set_in_bitOrExpr2263 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2271 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_OP_CURRY_in_bitAndExpr2285 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2287 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2299 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_set_in_shiftExpr2302 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2310 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2321 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_addExpr2324 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2332 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_addAppend2342 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parenExpr_in_addAppend2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2358 = new BitSet(new long[]{0x0000000000000002L,0x000000000000E000L});
    public static final BitSet FOLLOW_set_in_multExpr2361 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2373 = new BitSet(new long[]{0x0000000000000002L,0x000000000000E000L});
    public static final BitSet FOLLOW_castExpr_in_parenExpr2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_parenExpr2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_parenExpr2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_castExpr2403 = new BitSet(new long[]{0x0200000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_type_in_castExpr2405 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_castExpr2407 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parenExpr_in_castExpr2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_groupedExpr2418 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_groupedExpr2420 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_groupedExpr2422 = new BitSet(new long[]{0x0410000000000002L,0x0000000300600000L});
    public static final BitSet FOLLOW_termChain_in_groupedExpr2424 = new BitSet(new long[]{0x0410000000000002L,0x0000000300600000L});
    public static final BitSet FOLLOW_prefixExpr_in_unaryExpr2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_unaryExpr2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_unaryExpr2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr2449 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parenExpr_in_prefixExpr2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_postfixExpr2486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_set_in_postfixExpr2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termBase_in_termExpr2503 = new BitSet(new long[]{0x0410000000000002L,0x0000000300600000L});
    public static final BitSet FOLLOW_termChain_in_termExpr2505 = new BitSet(new long[]{0x0410000000000002L,0x0000000300600000L});
    public static final BitSet FOLLOW_idExprReq_in_termBase2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_termBase2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_termBase2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_termBase2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_typeBase2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_typeBase2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_typeBase2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_typeBase2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_typeBase2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_typeBase2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_typeBase2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorBlock_in_typeBase2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_ctorBlock2587 = new BitSet(new long[]{0x0410000000000000L,0x0000000300600000L});
    public static final BitSet FOLLOW_itBlock_in_ctorBlock2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_staticCall2596 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_DOT_in_staticCall2598 = new BitSet(new long[]{0x0000000000000000L,0x0000000201800000L});
    public static final BitSet FOLLOW_idExpr_in_staticCall2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_termChain2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynCall_in_termChain2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_termChain2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDynCall_in_termChain2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpr_in_termChain2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callOp_in_termChain2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itBlock_in_termChain2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_dsl2651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DSL_in_dsl2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_itBlock2663 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_stmt_in_itBlock2666 = new BitSet(new long[]{0x124078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_SP_COMMA_in_itBlock2668 = new BitSet(new long[]{0x120078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_SP_SEMI_in_itBlock2671 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_bracketR_in_itBlock2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotCall2684 = new BitSet(new long[]{0x0000000000000000L,0x0000000201800000L});
    public static final BitSet FOLLOW_idExpr_in_dotCall2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_dynCall2694 = new BitSet(new long[]{0x0000000000000000L,0x0000000201800000L});
    public static final BitSet FOLLOW_idExpr_in_dynCall2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_safeDotCall2704 = new BitSet(new long[]{0x0000000000000000L,0x0000000201800000L});
    public static final BitSet FOLLOW_idExpr_in_safeDotCall2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall2713 = new BitSet(new long[]{0x0000000000000000L,0x0000000201800000L});
    public static final BitSet FOLLOW_idExpr_in_safeDynCall2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_indexExpr2725 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_indexExpr2727 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_indexExpr2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callOp2740 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_args_in_callOp2742 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_callOp2746 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_closure_in_callOp2748 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_funcType_in_closure2770 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_bracketL_in_closure2772 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_stmt_in_closure2774 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_bracketR_in_closure2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_idExpr2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idExpr2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_idExprReq2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_idExprReq2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_field2812 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_field2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call2824 = new BitSet(new long[]{0x0200000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_callParams_in_call2828 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_closure_in_call2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_call2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_call2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callParams2850 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_args_in_callParams2852 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_callParams2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args2864 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_args2867 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_args2870 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_KW_NULL_in_literal2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_literal2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_literal2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IT_in_literal2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_literal2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_literal2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTSTR_in_literal2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_literal2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_literal2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_literal2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_literal2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_literal2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_literal2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_literal2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_literal2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_literal2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_literal2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeLiteral2960 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_OP_POUND_in_typeLiteral2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_slotLiteral2973 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_OP_POUND_in_slotLiteral2976 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_slotLiteral2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_namedSuper2988 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_DOT_in_namedSuper2990 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_SUPER_in_namedSuper2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_list3002 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_sq_bracketL_in_list3008 = new BitSet(new long[]{0x024078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_listItems_in_list3010 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_list3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_listItems3021 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3024 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_listItems3026 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_map3047 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_sq_bracketL_in_map3053 = new BitSet(new long[]{0x022078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_mapItems_in_map3055 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_map3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapPair_in_mapItems3066 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems3069 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_mapPair_in_mapItems3071 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_mapItems3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_mapPair3089 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapPair3091 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_mapPair3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_simple3101 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_parL_in_simple3103 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_simple3105 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_parR_in_simple3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_docs3116 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_OP_MINUS_in_number3127 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_NUMBER_in_number3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_facet3138 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_facet3140 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_AS_EQUAL_in_facet3143 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_facet3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_eos3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getter3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setter3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_bracketL3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_R_in_bracketR3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_R_in_sq_bracketL3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_R_in_sq_bracketR3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_parL3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_parR3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred7_Fan487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classFlags_in_synpred9_Fan492 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_synpred9_Fan495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_synpred11_Fan506 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_synpred11_Fan509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred35_Fan789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred38_Fan831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred39_Fan837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_synpred40_Fan835 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred40_Fan837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred42_Fan859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_synpred48_Fan916 = new BitSet(new long[]{0x0200000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_type_in_synpred48_Fan920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketR_in_synpred49_Fan924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred51_Fan945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred53_Fan957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_synpred55_Fan998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_synpred56_Fan1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_synpred57_Fan1050 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_bracketL_in_synpred57_Fan1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred58_Fan1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorFlags_in_synpred60_Fan1083 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_synpred60_Fan1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodFlags_in_synpred63_Fan1100 = new BitSet(new long[]{0x0200002F8F600000L,0x0000000201000000L});
    public static final BitSet FOLLOW_type_in_synpred63_Fan1104 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_KW_VOID_in_synpred63_Fan1108 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_synpred63_Fan1111 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_parL_in_synpred63_Fan1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getter_in_synpred67_Fan1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred69_Fan1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred72_Fan1232 = new BitSet(new long[]{0x0000000000000000L,0x0000000201000000L});
    public static final BitSet FOLLOW_id_in_synpred72_Fan1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred96_Fan1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_synpred100_Fan1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred102_Fan1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred104_Fan1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred105_Fan1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred106_Fan1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_synpred116_Fan1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred119_Fan1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_synpred120_Fan1733 = new BitSet(new long[]{0x020078FF8FF81FF0L,0x00000003FF8F1900L});
    public static final BitSet FOLLOW_block_in_synpred120_Fan1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_synpred121_Fan1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred124_Fan1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred125_Fan1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_synpred126_Fan1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_synpred127_Fan1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred128_Fan1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_synpred130_Fan1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchDef_in_synpred132_Fan1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred133_Fan1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred134_Fan1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred135_Fan1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred136_Fan1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred137_Fan1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred138_Fan1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred139_Fan2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred140_Fan2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred158_Fan2263 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_bitAndExpr_in_synpred158_Fan2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_CURRY_in_synpred159_Fan2285 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_shiftExpr_in_synpred159_Fan2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred163_Fan2324 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_multExpr_in_synpred163_Fan2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_synpred168_Fan2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_synpred169_Fan2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred170_Fan2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred171_Fan2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_synpred172_Fan2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred180_Fan2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred181_Fan2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred182_Fan2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_synpred183_Fan2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred184_Fan2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred185_Fan2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred186_Fan2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_synpred187_Fan2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_synpred188_Fan2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred189_Fan2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_synpred190_Fan2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callOp_in_synpred196_Fan2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred199_Fan2666 = new BitSet(new long[]{0x1040000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_synpred199_Fan2668 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_synpred199_Fan2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred200_Fan2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred201_Fan2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred202_Fan2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred203_Fan2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred205_Fan2828 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_closure_in_synpred205_Fan2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred206_Fan2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred207_Fan2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred220_Fan2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred221_Fan2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred222_Fan2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_synpred223_Fan2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_synpred224_Fan2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred226_Fan3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_synpred227_Fan3024 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_expr_in_synpred227_Fan3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred230_Fan3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_synpred231_Fan3069 = new BitSet(new long[]{0x020078C000000000L,0x00000003BF8F1900L});
    public static final BitSet FOLLOW_mapPair_in_synpred231_Fan3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_synpred234_Fan3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_synpred237_Fan3167 = new BitSet(new long[]{0x0000000000000002L});

}