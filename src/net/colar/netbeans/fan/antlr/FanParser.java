// $ANTLR 3.1.2 src/net/colar/netbeans/fan/antlr/Fan.g 2009-08-08 20:55:14
package net.colar.netbeans.fan.antlr;
import net.colar.netbeans.fan.FanParserResult;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class FanParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KW_BREAK", "KW_CONTINUE", "KW_FOR", "KW_IF", "KW_RETURN", "KW_SWITCH", "KW_THROW", "KW_WHILE", "KW_TRY", "KW_CASE", "KW_DEFAULT", "KW_CATCH", "KW_FINALLY", "KW_USING", "KW_AS", "KW_RD_ONLY", "KW_CONST", "KW_STATIC", "KW_NATIVE", "KW_VOLATILE", "KW_OVERRIDE", "KW_VIRTUAL", "KW_FINAL", "KW_VOID", "KW_CLASS", "KW_ENUM", "KW_MIXIN", "KW_ABSTRACT", "KW_PRIVATE", "KW_PROTECTED", "KW_PUBLIC", "KW_INTERNAL", "KW_NEW", "KW_ONCE", "KW_THIS", "KW_SUPER", "KW_ELSE", "KW_IS", "KW_ISNOT", "KW_NULL", "KW_IT", "KW_TRUE", "KW_FALSE", "INC_STR", "INC_URI", "INC_COMMENT", "INC_DSL", "AST_CLASS", "AST_ENUM", "AST_MIXIN", "AST_METHOD", "AST_CONSTRUCTOR", "AST_FIELD", "AST_CONSTRUCTOR_CHAIN", "AST_CODE_BLOCK", "AST_DOCS", "AST_STR", "AST_ID", "AST_MODIFIER", "AST_INHERITANCE", "AST_PARAMS", "AST_TYPE", "SP_COLCOL", "DOT", "BRACKET_L", "BRACKET_R", "AS_INIT_VAL", "SP_COLON", "SP_COMMA", "SP_QMARK", "LIST_TYPE", "SP_PIPE", "OP_ARROW", "SP_SEMI", "AS_EQUAL", "AS_ASSIGN_OP", "OP_OR", "OP_AND", "CP_EQUALITY", "CP_COMPARATORS", "OP_ELVIS", "OP_RANG_EXCL_OLD", "OP_RANGE_EXCL", "OP_RANGE", "OP_BITOR", "OP_CURRY", "OP_LSHIFT", "OP_RSHIFT", "OP_PLUS", "OP_MINUS", "OP_MULTI", "OP_DIV", "OP_MOD", "OP_BANG", "OP_2PLUS", "OP_2MINUS", "OP_TILDA", "DSL", "OP_SAFE_CALL", "OP_SAFEDYN_CALL", "ID", "URI", "CHAR", "QUOTSTR", "STR", "OP_POUND", "DOC", "NUMBER", "AT", "SQ_BRACKET_L", "SQ_BRACKET_R", "PAR_L", "PAR_R", "LB", "WS", "LINE_COMMENT", "EXEC_COMMENT", "COMPL_ML_COMMENT", "MULTI_COMMENT", "COMPL_DSL", "DIGIT", "HEXLETTER", "COMPL_QSTR", "COMPL_STR", "COMPL_URI", "KEYWORD", "UNDERSCORE", "HEX_HEADER", "HEXNB", "DECIMAL", "FRACTIONAL", "HEXHEADER", "FRACTION", "EXPONENT", "NBTYPE", "LETTER", "INC_UNKNOWN_ITEM", "'pod'"
    };
    public static final int EXPONENT=137;
    public static final int DSL=101;
    public static final int KW_NATIVE=22;
    public static final int OP_AND=81;
    public static final int AST_PARAMS=64;
    public static final int LETTER=139;
    public static final int HEXNB=132;
    public static final int CHAR=106;
    public static final int OP_2PLUS=98;
    public static final int KW_DEFAULT=14;
    public static final int KW_ONCE=37;
    public static final int SP_SEMI=77;
    public static final int INC_UNKNOWN_ITEM=140;
    public static final int AST_MIXIN=53;
    public static final int EOF=-1;
    public static final int KW_PUBLIC=34;
    public static final int KW_ISNOT=42;
    public static final int OP_MOD=96;
    public static final int PAR_R=116;
    public static final int OP_MINUS=93;
    public static final int KW_NEW=36;
    public static final int KW_BREAK=4;
    public static final int KW_SWITCH=9;
    public static final int OP_RANG_EXCL_OLD=85;
    public static final int AST_CLASS=51;
    public static final int OP_BITOR=88;
    public static final int QUOTSTR=107;
    public static final int AST_TYPE=65;
    public static final int OP_BANG=97;
    public static final int PAR_L=115;
    public static final int OP_MULTI=94;
    public static final int KEYWORD=129;
    public static final int KW_PROTECTED=33;
    public static final int AST_STR=60;
    public static final int LINE_COMMENT=119;
    public static final int CP_COMPARATORS=83;
    public static final int NUMBER=111;
    public static final int KW_CATCH=15;
    public static final int AS_EQUAL=78;
    public static final int UNDERSCORE=130;
    public static final int OP_DIV=95;
    public static final int SP_COMMA=72;
    public static final int T__141=141;
    public static final int URI=105;
    public static final int KW_FINALLY=16;
    public static final int WS=118;
    public static final int KW_THROW=10;
    public static final int OP_POUND=109;
    public static final int KW_STATIC=21;
    public static final int INC_COMMENT=49;
    public static final int AST_METHOD=54;
    public static final int AST_ENUM=52;
    public static final int SP_QMARK=73;
    public static final int AST_ID=61;
    public static final int HEXHEADER=135;
    public static final int AS_INIT_VAL=70;
    public static final int COMPL_DSL=123;
    public static final int NBTYPE=138;
    public static final int KW_SUPER=39;
    public static final int OP_2MINUS=99;
    public static final int OP_RSHIFT=91;
    public static final int KW_ELSE=40;
    public static final int OP_OR=80;
    public static final int AST_MODIFIER=62;
    public static final int DOC=110;
    public static final int KW_OVERRIDE=24;
    public static final int AST_FIELD=56;
    public static final int AST_CODE_BLOCK=58;
    public static final int KW_ABSTRACT=31;
    public static final int MULTI_COMMENT=122;
    public static final int KW_CONST=20;
    public static final int AST_DOCS=59;
    public static final int COMPL_ML_COMMENT=121;
    public static final int OP_ELVIS=84;
    public static final int BRACKET_R=69;
    public static final int KW_TRUE=45;
    public static final int ID=104;
    public static final int SP_COLON=71;
    public static final int AST_CONSTRUCTOR_CHAIN=57;
    public static final int BRACKET_L=68;
    public static final int AT=112;
    public static final int STR=108;
    public static final int SP_PIPE=75;
    public static final int OP_RANGE_EXCL=86;
    public static final int COMPL_QSTR=126;
    public static final int OP_TILDA=100;
    public static final int KW_VIRTUAL=25;
    public static final int CP_EQUALITY=82;
    public static final int KW_FOR=6;
    public static final int KW_WHILE=11;
    public static final int COMPL_URI=128;
    public static final int OP_RANGE=87;
    public static final int KW_RETURN=8;
    public static final int INC_DSL=50;
    public static final int SQ_BRACKET_R=114;
    public static final int KW_IS=41;
    public static final int DIGIT=124;
    public static final int KW_TRY=12;
    public static final int KW_IT=44;
    public static final int DOT=67;
    public static final int KW_THIS=38;
    public static final int KW_IF=7;
    public static final int OP_CURRY=89;
    public static final int SQ_BRACKET_L=113;
    public static final int OP_PLUS=92;
    public static final int KW_FALSE=46;
    public static final int KW_INTERNAL=35;
    public static final int KW_FINAL=26;
    public static final int HEXLETTER=125;
    public static final int KW_CONTINUE=5;
    public static final int KW_PRIVATE=32;
    public static final int KW_ENUM=29;
    public static final int HEX_HEADER=131;
    public static final int OP_SAFEDYN_CALL=103;
    public static final int KW_VOLATILE=23;
    public static final int KW_CASE=13;
    public static final int LIST_TYPE=74;
    public static final int FRACTIONAL=134;
    public static final int OP_LSHIFT=90;
    public static final int EXEC_COMMENT=120;
    public static final int KW_MIXIN=30;
    public static final int OP_ARROW=76;
    public static final int KW_VOID=27;
    public static final int DECIMAL=133;
    public static final int INC_URI=48;
    public static final int KW_CLASS=28;
    public static final int AS_ASSIGN_OP=79;
    public static final int AST_CONSTRUCTOR=55;
    public static final int KW_RD_ONLY=19;
    public static final int INC_STR=47;
    public static final int OP_SAFE_CALL=102;
    public static final int KW_AS=18;
    public static final int COMPL_STR=127;
    public static final int LB=117;
    public static final int KW_USING=17;
    public static final int KW_NULL=43;
    public static final int FRACTION=136;
    public static final int AST_INHERITANCE=63;
    public static final int SP_COLCOL=66;

    // delegates
    // delegators


        public FanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[386+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
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
    	// Parse from grammar root and save the result
    	ParserRuleReturnScope result=prog();
    	this.parsingResult.setAntlrScope(result);
    	return this.parsingResult;
        }
        @Override
        public void reportError(RecognitionException e)
        {
    	    parsingResult.addAntlrError(e,paraphrase);
        }
        
        Stack<String> paraphrase = new Stack<String>();



    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // src/net/colar/netbeans/fan/antlr/Fan.g:229:1: prog : ( using )* ( podDef | ( typeDef )* ) docs EOF ;
    public final FanParser.prog_return prog() throws RecognitionException {
        FanParser.prog_return retval = new FanParser.prog_return();
        retval.start = input.LT(1);
        int prog_StartIndex = input.index();
        Object root_0 = null;

        Token EOF5=null;
        FanParser.using_return using1 = null;

        FanParser.podDef_return podDef2 = null;

        FanParser.typeDef_return typeDef3 = null;

        FanParser.docs_return docs4 = null;


        Object EOF5_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:229:7: ( ( using )* ( podDef | ( typeDef )* ) docs EOF )
            // src/net/colar/netbeans/fan/antlr/Fan.g:229:11: ( using )* ( podDef | ( typeDef )* ) docs EOF
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:229:11: ( using )*
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
            	    pushFollow(FOLLOW_using_in_prog409);
            	    using1=using();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, using1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:229:18: ( podDef | ( typeDef )* )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:229:19: podDef
                    {
                    pushFollow(FOLLOW_podDef_in_prog413);
                    podDef2=podDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, podDef2.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:229:28: ( typeDef )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:229:28: ( typeDef )*
                    loop2:
                    do {
                        int alt2=2;
                        alt2 = dfa2.predict(input);
                        switch (alt2) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: typeDef
                    	    {
                    	    pushFollow(FOLLOW_typeDef_in_prog417);
                    	    typeDef3=typeDef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDef3.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            pushFollow(FOLLOW_docs_in_prog421);
            docs4=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs4.getTree());
            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_prog423); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF5_tree = (Object)adaptor.create(EOF5);
            adaptor.addChild(root_0, EOF5_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class using_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "using"
    // src/net/colar/netbeans/fan/antlr/Fan.g:230:1: using : ( usingPod | usingType | usingAs ) ;
    public final FanParser.using_return using() throws RecognitionException {
        FanParser.using_return retval = new FanParser.using_return();
        retval.start = input.LT(1);
        int using_StartIndex = input.index();
        Object root_0 = null;

        FanParser.usingPod_return usingPod6 = null;

        FanParser.usingType_return usingType7 = null;

        FanParser.usingAs_return usingAs8 = null;



        paraphrase.push("Using statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:231:3: ( ( usingPod | usingType | usingAs ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:231:5: ( usingPod | usingType | usingAs )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:231:5: ( usingPod | usingType | usingAs )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:231:6: usingPod
                    {
                    pushFollow(FOLLOW_usingPod_in_using443);
                    usingPod6=usingPod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingPod6.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:231:17: usingType
                    {
                    pushFollow(FOLLOW_usingType_in_using447);
                    usingType7=usingType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingType7.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:231:29: usingAs
                    {
                    pushFollow(FOLLOW_usingAs_in_using451);
                    usingAs8=usingAs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingAs8.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, using_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "using"

    public static class usingPod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "usingPod"
    // src/net/colar/netbeans/fan/antlr/Fan.g:232:1: usingPod : KW_USING podSpec eos ;
    public final FanParser.usingPod_return usingPod() throws RecognitionException {
        FanParser.usingPod_return retval = new FanParser.usingPod_return();
        retval.start = input.LT(1);
        int usingPod_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING9=null;
        FanParser.podSpec_return podSpec10 = null;

        FanParser.eos_return eos11 = null;


        Object KW_USING9_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:233:3: ( KW_USING podSpec eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:233:5: KW_USING podSpec eos
            {
            root_0 = (Object)adaptor.nil();

            KW_USING9=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingPod461); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_USING9_tree = (Object)adaptor.create(KW_USING9);
            adaptor.addChild(root_0, KW_USING9_tree);
            }
            pushFollow(FOLLOW_podSpec_in_usingPod463);
            podSpec10=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, podSpec10.getTree());
            pushFollow(FOLLOW_eos_in_usingPod465);
            eos11=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos11.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, usingPod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "usingPod"

    public static class usingType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "usingType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:234:1: usingType : KW_USING podSpec SP_COLCOL id eos ;
    public final FanParser.usingType_return usingType() throws RecognitionException {
        FanParser.usingType_return retval = new FanParser.usingType_return();
        retval.start = input.LT(1);
        int usingType_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING12=null;
        Token SP_COLCOL14=null;
        FanParser.podSpec_return podSpec13 = null;

        FanParser.id_return id15 = null;

        FanParser.eos_return eos16 = null;


        Object KW_USING12_tree=null;
        Object SP_COLCOL14_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:235:3: ( KW_USING podSpec SP_COLCOL id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:235:5: KW_USING podSpec SP_COLCOL id eos
            {
            root_0 = (Object)adaptor.nil();

            KW_USING12=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingType475); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_USING12_tree = (Object)adaptor.create(KW_USING12);
            adaptor.addChild(root_0, KW_USING12_tree);
            }
            pushFollow(FOLLOW_podSpec_in_usingType477);
            podSpec13=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, podSpec13.getTree());
            SP_COLCOL14=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingType479); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLCOL14_tree = (Object)adaptor.create(SP_COLCOL14);
            adaptor.addChild(root_0, SP_COLCOL14_tree);
            }
            pushFollow(FOLLOW_id_in_usingType481);
            id15=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id15.getTree());
            pushFollow(FOLLOW_eos_in_usingType483);
            eos16=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos16.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, usingType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "usingType"

    public static class usingAs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "usingAs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:236:1: usingAs : KW_USING podSpec SP_COLCOL id KW_AS id eos ;
    public final FanParser.usingAs_return usingAs() throws RecognitionException {
        FanParser.usingAs_return retval = new FanParser.usingAs_return();
        retval.start = input.LT(1);
        int usingAs_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING17=null;
        Token SP_COLCOL19=null;
        Token KW_AS21=null;
        FanParser.podSpec_return podSpec18 = null;

        FanParser.id_return id20 = null;

        FanParser.id_return id22 = null;

        FanParser.eos_return eos23 = null;


        Object KW_USING17_tree=null;
        Object SP_COLCOL19_tree=null;
        Object KW_AS21_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:10: ( KW_USING podSpec SP_COLCOL id KW_AS id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:12: KW_USING podSpec SP_COLCOL id KW_AS id eos
            {
            root_0 = (Object)adaptor.nil();

            KW_USING17=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingAs491); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_USING17_tree = (Object)adaptor.create(KW_USING17);
            adaptor.addChild(root_0, KW_USING17_tree);
            }
            pushFollow(FOLLOW_podSpec_in_usingAs493);
            podSpec18=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, podSpec18.getTree());
            SP_COLCOL19=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingAs495); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLCOL19_tree = (Object)adaptor.create(SP_COLCOL19);
            adaptor.addChild(root_0, SP_COLCOL19_tree);
            }
            pushFollow(FOLLOW_id_in_usingAs497);
            id20=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id20.getTree());
            KW_AS21=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_usingAs499); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_AS21_tree = (Object)adaptor.create(KW_AS21);
            adaptor.addChild(root_0, KW_AS21_tree);
            }
            pushFollow(FOLLOW_id_in_usingAs501);
            id22=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id22.getTree());
            pushFollow(FOLLOW_eos_in_usingAs503);
            eos23=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos23.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, usingAs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "usingAs"

    public static class podSpec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podSpec"
    // src/net/colar/netbeans/fan/antlr/Fan.g:237:1: podSpec : ( ffi )? id ( DOT id )* ;
    public final FanParser.podSpec_return podSpec() throws RecognitionException {
        FanParser.podSpec_return retval = new FanParser.podSpec_return();
        retval.start = input.LT(1);
        int podSpec_StartIndex = input.index();
        Object root_0 = null;

        Token DOT26=null;
        FanParser.ffi_return ffi24 = null;

        FanParser.id_return id25 = null;

        FanParser.id_return id27 = null;


        Object DOT26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:237:10: ( ( ffi )? id ( DOT id )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:237:12: ( ffi )? id ( DOT id )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:237:12: ( ffi )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==SQ_BRACKET_L) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ffi
                    {
                    pushFollow(FOLLOW_ffi_in_podSpec511);
                    ffi24=ffi();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ffi24.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_podSpec514);
            id25=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id25.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:237:20: ( DOT id )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DOT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:237:21: DOT id
            	    {
            	    DOT26=(Token)match(input,DOT,FOLLOW_DOT_in_podSpec517); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT26_tree = (Object)adaptor.create(DOT26);
            	    adaptor.addChild(root_0, DOT26_tree);
            	    }
            	    pushFollow(FOLLOW_id_in_podSpec519);
            	    id27=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, id27.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, podSpec_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podSpec"

    public static class ffi_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ffi"
    // src/net/colar/netbeans/fan/antlr/Fan.g:238:1: ffi : sq_bracketL id sq_bracketR ;
    public final FanParser.ffi_return ffi() throws RecognitionException {
        FanParser.ffi_return retval = new FanParser.ffi_return();
        retval.start = input.LT(1);
        int ffi_StartIndex = input.index();
        Object root_0 = null;

        FanParser.sq_bracketL_return sq_bracketL28 = null;

        FanParser.id_return id29 = null;

        FanParser.sq_bracketR_return sq_bracketR30 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:238:7: ( sq_bracketL id sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:238:9: sq_bracketL id sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sq_bracketL_in_ffi530);
            sq_bracketL28=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL28.getTree());
            pushFollow(FOLLOW_id_in_ffi532);
            id29=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id29.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_ffi534);
            sq_bracketR30=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR30.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, ffi_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ffi"

    public static class podDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:240:1: podDef : podHeader BRACKET_L ( symbolDef )* BRACKET_R ;
    public final FanParser.podDef_return podDef() throws RecognitionException {
        FanParser.podDef_return retval = new FanParser.podDef_return();
        retval.start = input.LT(1);
        int podDef_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_L32=null;
        Token BRACKET_R34=null;
        FanParser.podHeader_return podHeader31 = null;

        FanParser.symbolDef_return symbolDef33 = null;


        Object BRACKET_L32_tree=null;
        Object BRACKET_R34_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:240:9: ( podHeader BRACKET_L ( symbolDef )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:240:11: podHeader BRACKET_L ( symbolDef )* BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_podHeader_in_podDef543);
            podHeader31=podHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, podHeader31.getTree());
            BRACKET_L32=(Token)match(input,BRACKET_L,FOLLOW_BRACKET_L_in_podDef545); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_L32_tree = (Object)adaptor.create(BRACKET_L32);
            adaptor.addChild(root_0, BRACKET_L32_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:240:31: ( symbolDef )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==KW_VIRTUAL||LA7_0==SP_PIPE||LA7_0==ID||LA7_0==SQ_BRACKET_L) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: symbolDef
            	    {
            	    pushFollow(FOLLOW_symbolDef_in_podDef547);
            	    symbolDef33=symbolDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbolDef33.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            BRACKET_R34=(Token)match(input,BRACKET_R,FOLLOW_BRACKET_R_in_podDef550); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_R34_tree = (Object)adaptor.create(BRACKET_R34);
            adaptor.addChild(root_0, BRACKET_R34_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, podDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podDef"

    public static class podHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:241:1: podHeader : docs ( facet )* 'pod' id ;
    public final FanParser.podHeader_return podHeader() throws RecognitionException {
        FanParser.podHeader_return retval = new FanParser.podHeader_return();
        retval.start = input.LT(1);
        int podHeader_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal37=null;
        FanParser.docs_return docs35 = null;

        FanParser.facet_return facet36 = null;

        FanParser.id_return id38 = null;


        Object string_literal37_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:241:11: ( docs ( facet )* 'pod' id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:241:13: docs ( facet )* 'pod' id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_podHeader557);
            docs35=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs35.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:241:18: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_podHeader559);
            	    facet36=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet36.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            string_literal37=(Token)match(input,141,FOLLOW_141_in_podHeader562); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal37_tree = (Object)adaptor.create(string_literal37);
            adaptor.addChild(root_0, string_literal37_tree);
            }
            pushFollow(FOLLOW_id_in_podHeader564);
            id38=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id38.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, podHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podHeader"

    public static class symbolDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbolDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:242:1: symbolDef : ( symbolFlag )* typeId AS_INIT_VAL expr eos ;
    public final FanParser.symbolDef_return symbolDef() throws RecognitionException {
        FanParser.symbolDef_return retval = new FanParser.symbolDef_return();
        retval.start = input.LT(1);
        int symbolDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL41=null;
        FanParser.symbolFlag_return symbolFlag39 = null;

        FanParser.typeId_return typeId40 = null;

        FanParser.expr_return expr42 = null;

        FanParser.eos_return eos43 = null;


        Object AS_INIT_VAL41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:242:11: ( ( symbolFlag )* typeId AS_INIT_VAL expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:242:13: ( symbolFlag )* typeId AS_INIT_VAL expr eos
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:242:13: ( symbolFlag )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==KW_VIRTUAL) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: symbolFlag
            	    {
            	    pushFollow(FOLLOW_symbolFlag_in_symbolDef571);
            	    symbolFlag39=symbolFlag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbolFlag39.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            pushFollow(FOLLOW_typeId_in_symbolDef574);
            typeId40=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId40.getTree());
            AS_INIT_VAL41=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_symbolDef576); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AS_INIT_VAL41_tree = (Object)adaptor.create(AS_INIT_VAL41);
            adaptor.addChild(root_0, AS_INIT_VAL41_tree);
            }
            pushFollow(FOLLOW_expr_in_symbolDef578);
            expr42=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr42.getTree());
            pushFollow(FOLLOW_eos_in_symbolDef580);
            eos43=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos43.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, symbolDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "symbolDef"

    public static class symbolFlag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbolFlag"
    // src/net/colar/netbeans/fan/antlr/Fan.g:243:1: symbolFlag : 'virtual' ;
    public final FanParser.symbolFlag_return symbolFlag() throws RecognitionException {
        FanParser.symbolFlag_return retval = new FanParser.symbolFlag_return();
        retval.start = input.LT(1);
        int symbolFlag_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal44=null;

        Object string_literal44_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:243:12: ( 'virtual' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:243:14: 'virtual'
            {
            root_0 = (Object)adaptor.nil();

            string_literal44=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_symbolFlag587); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal44_tree = (Object)adaptor.create(string_literal44);
            adaptor.addChild(root_0, string_literal44_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, symbolFlag_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "symbolFlag"

    public static class typeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:246:1: typeDef : docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) ;
    public final FanParser.typeDef_return typeDef() throws RecognitionException {
        FanParser.typeDef_return retval = new FanParser.typeDef_return();
        retval.start = input.LT(1);
        int typeDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs45 = null;

        FanParser.facet_return facet46 = null;

        FanParser.classDef_return classDef47 = null;

        FanParser.enumDef_return enumDef48 = null;

        FanParser.mixinDef_return mixinDef49 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:246:10: ( docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:246:12: docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_typeDef597);
            docs45=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs45.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:246:17: ( facet )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AT) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==ID) ) {
                        int LA10_3 = input.LA(3);

                        if ( (synpred11_Fan()) ) {
                            alt10=1;
                        }


                    }


                }


                switch (alt10) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_typeDef599);
            	    facet46=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet46.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:246:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:246:25: ( ( classFlags )* KW_CLASS )=> classDef
                    {
                    pushFollow(FOLLOW_classDef_in_typeDef610);
                    classDef47=classDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDef47.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:247:4: ( ( protection )? KW_ENUM )=> enumDef
                    {
                    pushFollow(FOLLOW_enumDef_in_typeDef624);
                    enumDef48=enumDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDef48.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:247:37: mixinDef
                    {
                    pushFollow(FOLLOW_mixinDef_in_typeDef628);
                    mixinDef49=mixinDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mixinDef49.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, typeDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeDef"

    public static class classDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:248:1: classDef : classHeader classBody -> ^( AST_CLASS classHeader classBody ) ;
    public final FanParser.classDef_return classDef() throws RecognitionException {
        FanParser.classDef_return retval = new FanParser.classDef_return();
        retval.start = input.LT(1);
        int classDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.classHeader_return classHeader50 = null;

        FanParser.classBody_return classBody51 = null;


        RewriteRuleSubtreeStream stream_classHeader=new RewriteRuleSubtreeStream(adaptor,"rule classHeader");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        paraphrase.push("Class definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:249:3: ( classHeader classBody -> ^( AST_CLASS classHeader classBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:249:7: classHeader classBody
            {
            pushFollow(FOLLOW_classHeader_in_classDef650);
            classHeader50=classHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classHeader.add(classHeader50.getTree());
            pushFollow(FOLLOW_classBody_in_classDef652);
            classBody51=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBody.add(classBody51.getTree());


            // AST REWRITE
            // elements: classHeader, classBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 250:7: -> ^( AST_CLASS classHeader classBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:250:10: ^( AST_CLASS classHeader classBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CLASS, "AST_CLASS"), root_1);

                adaptor.addChild(root_1, stream_classHeader.nextTree());
                adaptor.addChild(root_1, stream_classBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, classDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDef"

    public static class classHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:251:1: classHeader : docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )? -> ^( AST_ID $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* ;
    public final FanParser.classHeader_return classHeader() throws RecognitionException {
        FanParser.classHeader_return retval = new FanParser.classHeader_return();
        retval.start = input.LT(1);
        int classHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CLASS54=null;
        FanParser.classFlags_return m = null;

        FanParser.id_return cname = null;

        FanParser.docs_return docs52 = null;

        FanParser.facet_return facet53 = null;

        FanParser.inheritance_return inheritance55 = null;


        Object KW_CLASS54_tree=null;
        RewriteRuleTokenStream stream_KW_CLASS=new RewriteRuleTokenStream(adaptor,"token KW_CLASS");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_classFlags=new RewriteRuleSubtreeStream(adaptor,"rule classFlags");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:251:13: ( docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )? -> ^( AST_ID $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:251:15: docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_classHeader675);
            docs52=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs52.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:251:20: ( facet )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_classHeader677);
            	    facet53=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet53.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:251:28: (m= classFlags )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=KW_CONST && LA13_0<=KW_STATIC)||LA13_0==KW_FINAL||(LA13_0>=KW_ABSTRACT && LA13_0<=KW_INTERNAL)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= classFlags
            	    {
            	    pushFollow(FOLLOW_classFlags_in_classHeader682);
            	    m=classFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            KW_CLASS54=(Token)match(input,KW_CLASS,FOLLOW_KW_CLASS_in_classHeader685); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CLASS.add(KW_CLASS54);

            pushFollow(FOLLOW_id_in_classHeader689);
            cname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(cname.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:251:59: ( inheritance )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==SP_COLON) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_classHeader691);
                    inheritance55=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance55.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: m, inheritance, cname
            // token labels: 
            // rule labels: retval, m, cname
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);
            RewriteRuleSubtreeStream stream_cname=new RewriteRuleSubtreeStream(adaptor,"rule cname",cname!=null?cname.tree:null);

            root_0 = (Object)adaptor.nil();
            // 252:4: -> ^( AST_ID $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )*
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:252:7: ^( AST_ID $cname)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_1);

                adaptor.addChild(root_1, stream_cname.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:252:24: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:252:24: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:252:56: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:252:56: ^( AST_MODIFIER $m)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_1);

                    adaptor.addChild(root_1, stream_m.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_m.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, classHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classHeader"

    public static class classFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:253:1: classFlags : ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC );
    public final FanParser.classFlags_return classFlags() throws RecognitionException {
        FanParser.classFlags_return retval = new FanParser.classFlags_return();
        retval.start = input.LT(1);
        int classFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ABSTRACT57=null;
        Token KW_FINAL58=null;
        Token KW_CONST59=null;
        Token KW_STATIC60=null;
        FanParser.protection_return protection56 = null;


        Object KW_ABSTRACT57_tree=null;
        Object KW_FINAL58_tree=null;
        Object KW_CONST59_tree=null;
        Object KW_STATIC60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:13: ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC )
            int alt15=5;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt15=1;
                }
                break;
            case KW_ABSTRACT:
                {
                alt15=2;
                }
                break;
            case KW_FINAL:
                {
                alt15=3;
                }
                break;
            case KW_CONST:
                {
                alt15=4;
                }
                break;
            case KW_STATIC:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:253:15: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_classFlags727);
                    protection56=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection56.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:253:28: KW_ABSTRACT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ABSTRACT57=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_classFlags731); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ABSTRACT57_tree = (Object)adaptor.create(KW_ABSTRACT57);
                    adaptor.addChild(root_0, KW_ABSTRACT57_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:253:42: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL58=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_classFlags735); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL58_tree = (Object)adaptor.create(KW_FINAL58);
                    adaptor.addChild(root_0, KW_FINAL58_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:253:53: KW_CONST
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_CONST59=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_classFlags739); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_CONST59_tree = (Object)adaptor.create(KW_CONST59);
                    adaptor.addChild(root_0, KW_CONST59_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:253:64: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC60=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_classFlags743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC60_tree = (Object)adaptor.create(KW_STATIC60);
                    adaptor.addChild(root_0, KW_STATIC60_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, classFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classFlags"

    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:254:1: classBody : ( bracketL ( slotDef )* bracketR ) -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) ;
    public final FanParser.classBody_return classBody() throws RecognitionException {
        FanParser.classBody_return retval = new FanParser.classBody_return();
        retval.start = input.LT(1);
        int classBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL61 = null;

        FanParser.slotDef_return slotDef62 = null;

        FanParser.bracketR_return bracketR63 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:254:12: ( ( bracketL ( slotDef )* bracketR ) -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:254:14: ( bracketL ( slotDef )* bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:254:14: ( bracketL ( slotDef )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:254:15: bracketL ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_classBody752);
            bracketL61=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL61.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:254:24: ( slotDef )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=KW_RD_ONLY && LA16_0<=KW_FINAL)||(LA16_0>=KW_ABSTRACT && LA16_0<=KW_ONCE)||LA16_0==SP_PIPE||LA16_0==ID||LA16_0==DOC||(LA16_0>=AT && LA16_0<=SQ_BRACKET_L)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_classBody754);
            	    slotDef62=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef62.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_classBody757);
            bracketR63=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR63.getTree());

            }



            // AST REWRITE
            // elements: slotDef, bracketL, bracketR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 254:44: -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:254:47: ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:254:73: ( slotDef )*
                while ( stream_slotDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_slotDef.nextTree());

                }
                stream_slotDef.reset();
                adaptor.addChild(root_1, stream_bracketR.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, classBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBody"

    public static class protection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protection"
    // src/net/colar/netbeans/fan/antlr/Fan.g:255:1: protection : ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL );
    public final FanParser.protection_return protection() throws RecognitionException {
        FanParser.protection_return retval = new FanParser.protection_return();
        retval.start = input.LT(1);
        int protection_StartIndex = input.index();
        Object root_0 = null;

        Token set64=null;

        Object set64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:255:12: ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            root_0 = (Object)adaptor.nil();

            set64=(Token)input.LT(1);
            if ( (input.LA(1)>=KW_PRIVATE && input.LA(1)<=KW_INTERNAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set64));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, protection_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "protection"

    public static class mixinDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:256:1: mixinDef : mixinHeader mixinBody -> ^( AST_MIXIN mixinHeader mixinBody ) ;
    public final FanParser.mixinDef_return mixinDef() throws RecognitionException {
        FanParser.mixinDef_return retval = new FanParser.mixinDef_return();
        retval.start = input.LT(1);
        int mixinDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mixinHeader_return mixinHeader65 = null;

        FanParser.mixinBody_return mixinBody66 = null;


        RewriteRuleSubtreeStream stream_mixinBody=new RewriteRuleSubtreeStream(adaptor,"rule mixinBody");
        RewriteRuleSubtreeStream stream_mixinHeader=new RewriteRuleSubtreeStream(adaptor,"rule mixinHeader");
        paraphrase.push("Mixin definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:257:3: ( mixinHeader mixinBody -> ^( AST_MIXIN mixinHeader mixinBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:257:5: mixinHeader mixinBody
            {
            pushFollow(FOLLOW_mixinHeader_in_mixinDef809);
            mixinHeader65=mixinHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mixinHeader.add(mixinHeader65.getTree());
            pushFollow(FOLLOW_mixinBody_in_mixinDef811);
            mixinBody66=mixinBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mixinBody.add(mixinBody66.getTree());


            // AST REWRITE
            // elements: mixinHeader, mixinBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 258:7: -> ^( AST_MIXIN mixinHeader mixinBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:258:10: ^( AST_MIXIN mixinHeader mixinBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MIXIN, "AST_MIXIN"), root_1);

                adaptor.addChild(root_1, stream_mixinHeader.nextTree());
                adaptor.addChild(root_1, stream_mixinBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, mixinDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinDef"

    public static class mixinHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:259:1: mixinHeader : docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )? -> ^( AST_ID $mname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* ;
    public final FanParser.mixinHeader_return mixinHeader() throws RecognitionException {
        FanParser.mixinHeader_return retval = new FanParser.mixinHeader_return();
        retval.start = input.LT(1);
        int mixinHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_MIXIN69=null;
        FanParser.mixinFlags_return m = null;

        FanParser.id_return mname = null;

        FanParser.docs_return docs67 = null;

        FanParser.facet_return facet68 = null;

        FanParser.inheritance_return inheritance70 = null;


        Object KW_MIXIN69_tree=null;
        RewriteRuleTokenStream stream_KW_MIXIN=new RewriteRuleTokenStream(adaptor,"token KW_MIXIN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_mixinFlags=new RewriteRuleSubtreeStream(adaptor,"rule mixinFlags");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:13: ( docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )? -> ^( AST_ID $mname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:15: docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_mixinHeader834);
            docs67=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs67.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:20: ( facet )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==AT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_mixinHeader836);
            	    facet68=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet68.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:259:28: (m= mixinFlags )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=KW_CONST && LA18_0<=KW_STATIC)||LA18_0==KW_FINAL||(LA18_0>=KW_PRIVATE && LA18_0<=KW_INTERNAL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= mixinFlags
            	    {
            	    pushFollow(FOLLOW_mixinFlags_in_mixinHeader841);
            	    m=mixinFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_mixinFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            KW_MIXIN69=(Token)match(input,KW_MIXIN,FOLLOW_KW_MIXIN_in_mixinHeader844); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_MIXIN.add(KW_MIXIN69);

            pushFollow(FOLLOW_id_in_mixinHeader848);
            mname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(mname.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:59: ( inheritance )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==SP_COLON) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_mixinHeader850);
                    inheritance70=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance70.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: m, mname, inheritance
            // token labels: 
            // rule labels: mname, retval, m
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_mname=new RewriteRuleSubtreeStream(adaptor,"rule mname",mname!=null?mname.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);

            root_0 = (Object)adaptor.nil();
            // 260:4: -> ^( AST_ID $mname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )*
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:260:7: ^( AST_ID $mname)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_1);

                adaptor.addChild(root_1, stream_mname.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:260:24: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:24: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:260:56: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:56: ^( AST_MODIFIER $m)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_1);

                    adaptor.addChild(root_1, stream_m.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_m.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, mixinHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinHeader"

    public static class mixinFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:261:1: mixinFlags : ( protection | KW_CONST | KW_STATIC | KW_FINAL );
    public final FanParser.mixinFlags_return mixinFlags() throws RecognitionException {
        FanParser.mixinFlags_return retval = new FanParser.mixinFlags_return();
        retval.start = input.LT(1);
        int mixinFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CONST72=null;
        Token KW_STATIC73=null;
        Token KW_FINAL74=null;
        FanParser.protection_return protection71 = null;


        Object KW_CONST72_tree=null;
        Object KW_STATIC73_tree=null;
        Object KW_FINAL74_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:261:12: ( protection | KW_CONST | KW_STATIC | KW_FINAL )
            int alt20=4;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt20=1;
                }
                break;
            case KW_CONST:
                {
                alt20=2;
                }
                break;
            case KW_STATIC:
                {
                alt20=3;
                }
                break;
            case KW_FINAL:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:261:14: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_mixinFlags885);
                    protection71=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection71.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:261:27: KW_CONST
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_CONST72=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_mixinFlags889); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_CONST72_tree = (Object)adaptor.create(KW_CONST72);
                    adaptor.addChild(root_0, KW_CONST72_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:261:38: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC73=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_mixinFlags893); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC73_tree = (Object)adaptor.create(KW_STATIC73);
                    adaptor.addChild(root_0, KW_STATIC73_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:261:50: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL74=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_mixinFlags897); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL74_tree = (Object)adaptor.create(KW_FINAL74);
                    adaptor.addChild(root_0, KW_FINAL74_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, mixinFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinFlags"

    public static class mixinBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:262:1: mixinBody : bracketL ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) ;
    public final FanParser.mixinBody_return mixinBody() throws RecognitionException {
        FanParser.mixinBody_return retval = new FanParser.mixinBody_return();
        retval.start = input.LT(1);
        int mixinBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL75 = null;

        FanParser.slotDef_return slotDef76 = null;

        FanParser.bracketR_return bracketR77 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:11: ( bracketL ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:13: bracketL ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_mixinBody904);
            bracketL75=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL75.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:22: ( slotDef )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=KW_RD_ONLY && LA21_0<=KW_FINAL)||(LA21_0>=KW_ABSTRACT && LA21_0<=KW_ONCE)||LA21_0==SP_PIPE||LA21_0==ID||LA21_0==DOC||(LA21_0>=AT && LA21_0<=SQ_BRACKET_L)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_mixinBody906);
            	    slotDef76=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef76.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_mixinBody909);
            bracketR77=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR77.getTree());


            // AST REWRITE
            // elements: slotDef, bracketL, bracketR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 262:41: -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:262:44: ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:262:70: ( slotDef )*
                while ( stream_slotDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_slotDef.nextTree());

                }
                stream_slotDef.reset();
                adaptor.addChild(root_1, stream_bracketR.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, mixinBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinBody"

    public static class enumDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:263:1: enumDef : enumHeader enumBody -> ^( AST_ENUM enumHeader enumBody ) ;
    public final FanParser.enumDef_return enumDef() throws RecognitionException {
        FanParser.enumDef_return retval = new FanParser.enumDef_return();
        retval.start = input.LT(1);
        int enumDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.enumHeader_return enumHeader78 = null;

        FanParser.enumBody_return enumBody79 = null;


        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_enumHeader=new RewriteRuleSubtreeStream(adaptor,"rule enumHeader");
        paraphrase.push("Enumeration definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:264:3: ( enumHeader enumBody -> ^( AST_ENUM enumHeader enumBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:264:5: enumHeader enumBody
            {
            pushFollow(FOLLOW_enumHeader_in_enumDef942);
            enumHeader78=enumHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumHeader.add(enumHeader78.getTree());
            pushFollow(FOLLOW_enumBody_in_enumDef944);
            enumBody79=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody79.getTree());


            // AST REWRITE
            // elements: enumHeader, enumBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 265:7: -> ^( AST_ENUM enumHeader enumBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:265:10: ^( AST_ENUM enumHeader enumBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ENUM, "AST_ENUM"), root_1);

                adaptor.addChild(root_1, stream_enumHeader.nextTree());
                adaptor.addChild(root_1, stream_enumBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, enumDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumDef"

    public static class enumHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:266:1: enumHeader : docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )? -> ^( AST_ID $ename) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* ;
    public final FanParser.enumHeader_return enumHeader() throws RecognitionException {
        FanParser.enumHeader_return retval = new FanParser.enumHeader_return();
        retval.start = input.LT(1);
        int enumHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ENUM82=null;
        FanParser.protection_return m = null;

        FanParser.id_return ename = null;

        FanParser.docs_return docs80 = null;

        FanParser.facet_return facet81 = null;

        FanParser.inheritance_return inheritance83 = null;


        Object KW_ENUM82_tree=null;
        RewriteRuleTokenStream stream_KW_ENUM=new RewriteRuleTokenStream(adaptor,"token KW_ENUM");
        RewriteRuleSubtreeStream stream_protection=new RewriteRuleSubtreeStream(adaptor,"rule protection");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:12: ( docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )? -> ^( AST_ID $ename) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:17: docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_enumHeader970);
            docs80=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs80.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:22: ( facet )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==AT) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_enumHeader972);
            	    facet81=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet81.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:266:30: (m= protection )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=KW_PRIVATE && LA23_0<=KW_INTERNAL)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= protection
                    {
                    pushFollow(FOLLOW_protection_in_enumHeader977);
                    m=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protection.add(m.getTree());

                    }
                    break;

            }

            KW_ENUM82=(Token)match(input,KW_ENUM,FOLLOW_KW_ENUM_in_enumHeader980); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_ENUM.add(KW_ENUM82);

            pushFollow(FOLLOW_id_in_enumHeader984);
            ename=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(ename.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:60: ( inheritance )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==SP_COLON) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_enumHeader986);
                    inheritance83=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance83.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: m, inheritance, ename
            // token labels: 
            // rule labels: retval, ename, m
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ename=new RewriteRuleSubtreeStream(adaptor,"rule ename",ename!=null?ename.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);

            root_0 = (Object)adaptor.nil();
            // 267:4: -> ^( AST_ID $ename) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )*
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:267:7: ^( AST_ID $ename)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_1);

                adaptor.addChild(root_1, stream_ename.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:267:24: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:24: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:267:56: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:267:56: ^( AST_MODIFIER $m)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_1);

                    adaptor.addChild(root_1, stream_m.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_m.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, enumHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumHeader"

    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:268:1: enumBody : bracketL enumValDefs ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR ) ;
    public final FanParser.enumBody_return enumBody() throws RecognitionException {
        FanParser.enumBody_return retval = new FanParser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL84 = null;

        FanParser.enumValDefs_return enumValDefs85 = null;

        FanParser.slotDef_return slotDef86 = null;

        FanParser.bracketR_return bracketR87 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        RewriteRuleSubtreeStream stream_enumValDefs=new RewriteRuleSubtreeStream(adaptor,"rule enumValDefs");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:268:10: ( bracketL enumValDefs ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:268:12: bracketL enumValDefs ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_enumBody1021);
            bracketL84=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL84.getTree());
            pushFollow(FOLLOW_enumValDefs_in_enumBody1023);
            enumValDefs85=enumValDefs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumValDefs.add(enumValDefs85.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:268:33: ( slotDef )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=KW_RD_ONLY && LA25_0<=KW_FINAL)||(LA25_0>=KW_ABSTRACT && LA25_0<=KW_ONCE)||LA25_0==SP_PIPE||LA25_0==ID||LA25_0==DOC||(LA25_0>=AT && LA25_0<=SQ_BRACKET_L)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_enumBody1025);
            	    slotDef86=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef86.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_enumBody1028);
            bracketR87=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR87.getTree());


            // AST REWRITE
            // elements: slotDef, enumValDefs, bracketL, bracketR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 268:53: -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:268:56: ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                adaptor.addChild(root_1, stream_enumValDefs.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:268:94: ( slotDef )*
                while ( stream_slotDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_slotDef.nextTree());

                }
                stream_slotDef.reset();
                adaptor.addChild(root_1, stream_bracketR.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBody"

    public static class inheritance_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritance"
    // src/net/colar/netbeans/fan/antlr/Fan.g:269:1: inheritance : SP_COLON typeList ;
    public final FanParser.inheritance_return inheritance() throws RecognitionException {
        FanParser.inheritance_return retval = new FanParser.inheritance_return();
        retval.start = input.LT(1);
        int inheritance_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON88=null;
        FanParser.typeList_return typeList89 = null;


        Object SP_COLON88_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:14: ( SP_COLON typeList )
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:16: SP_COLON typeList
            {
            root_0 = (Object)adaptor.nil();

            SP_COLON88=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_inheritance1053); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON88_tree = (Object)adaptor.create(SP_COLON88);
            adaptor.addChild(root_0, SP_COLON88_tree);
            }
            pushFollow(FOLLOW_typeList_in_inheritance1055);
            typeList89=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList89.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, inheritance_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritance"

    public static class enumValDefs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValDefs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:271:1: enumValDefs : enumValDef ( SP_COMMA enumValDef )* eos ;
    public final FanParser.enumValDefs_return enumValDefs() throws RecognitionException {
        FanParser.enumValDefs_return retval = new FanParser.enumValDefs_return();
        retval.start = input.LT(1);
        int enumValDefs_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA91=null;
        FanParser.enumValDef_return enumValDef90 = null;

        FanParser.enumValDef_return enumValDef92 = null;

        FanParser.eos_return eos93 = null;


        Object SP_COMMA91_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:14: ( enumValDef ( SP_COMMA enumValDef )* eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:16: enumValDef ( SP_COMMA enumValDef )* eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_enumValDef_in_enumValDefs1065);
            enumValDef90=enumValDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValDef90.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:27: ( SP_COMMA enumValDef )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==SP_COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:271:28: SP_COMMA enumValDef
            	    {
            	    SP_COMMA91=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_enumValDefs1068); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA91_tree = (Object)adaptor.create(SP_COMMA91);
            	    adaptor.addChild(root_0, SP_COMMA91_tree);
            	    }
            	    pushFollow(FOLLOW_enumValDef_in_enumValDefs1071);
            	    enumValDef92=enumValDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValDef92.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            pushFollow(FOLLOW_eos_in_enumValDefs1075);
            eos93=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos93.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, enumValDefs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValDefs"

    public static class enumValDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:272:1: enumValDef : docs id ( parL ( args )? parR )? ;
    public final FanParser.enumValDef_return enumValDef() throws RecognitionException {
        FanParser.enumValDef_return retval = new FanParser.enumValDef_return();
        retval.start = input.LT(1);
        int enumValDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs94 = null;

        FanParser.id_return id95 = null;

        FanParser.parL_return parL96 = null;

        FanParser.args_return args97 = null;

        FanParser.parR_return parR98 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:13: ( docs id ( parL ( args )? parR )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:15: docs id ( parL ( args )? parR )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_enumValDef1083);
            docs94=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs94.getTree());
            pushFollow(FOLLOW_id_in_enumValDef1085);
            id95=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id95.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:23: ( parL ( args )? parR )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==PAR_L) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:272:24: parL ( args )? parR
                    {
                    pushFollow(FOLLOW_parL_in_enumValDef1088);
                    parL96=parL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parL96.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:272:29: ( args )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=KW_THIS && LA27_0<=KW_SUPER)||(LA27_0>=KW_NULL && LA27_0<=KW_FALSE)||LA27_0==SP_PIPE||LA27_0==OP_CURRY||(LA27_0>=OP_PLUS && LA27_0<=OP_MULTI)||(LA27_0>=OP_BANG && LA27_0<=OP_TILDA)||(LA27_0>=ID && LA27_0<=OP_POUND)||LA27_0==NUMBER||LA27_0==SQ_BRACKET_L||LA27_0==PAR_L) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                            {
                            pushFollow(FOLLOW_args_in_enumValDef1090);
                            args97=args();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, args97.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_parR_in_enumValDef1093);
                    parR98=parR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parR98.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, enumValDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValDef"

    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeList"
    // src/net/colar/netbeans/fan/antlr/Fan.g:273:1: typeList : type ( SP_COMMA type )* ;
    public final FanParser.typeList_return typeList() throws RecognitionException {
        FanParser.typeList_return retval = new FanParser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA100=null;
        FanParser.type_return type99 = null;

        FanParser.type_return type101 = null;


        Object SP_COMMA100_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:10: ( type ( SP_COMMA type )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:14: type ( SP_COMMA type )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_typeList1104);
            type99=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type99.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:19: ( SP_COMMA type )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==SP_COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:273:20: SP_COMMA type
            	    {
            	    SP_COMMA100=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_typeList1107); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA100_tree = (Object)adaptor.create(SP_COMMA100);
            	    adaptor.addChild(root_0, SP_COMMA100_tree);
            	    }
            	    pushFollow(FOLLOW_type_in_typeList1109);
            	    type101=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type101.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, typeList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeList"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // src/net/colar/netbeans/fan/antlr/Fan.g:275:1: type : typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ;
    public final FanParser.type_return type() throws RecognitionException {
        FanParser.type_return retval = new FanParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK103=null;
        Token LIST_TYPE104=null;
        Token SP_QMARK105=null;
        FanParser.typeRoot_return typeRoot102 = null;


        Object SP_QMARK103_tree=null;
        Object LIST_TYPE104_tree=null;
        Object SP_QMARK105_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:14: ( typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:18: typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeRoot_in_type1129);
            typeRoot102=typeRoot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeRoot102.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:28: ( SP_QMARK )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==SP_QMARK) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred42_Fan()) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    SP_QMARK103=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type1132); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_QMARK103_tree = (Object)adaptor.create(SP_QMARK103);
                    adaptor.addChild(root_0, SP_QMARK103_tree);
                    }

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:275:38: ( LIST_TYPE ( SP_QMARK )? )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==LIST_TYPE) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred44_Fan()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:275:39: LIST_TYPE ( SP_QMARK )?
            	    {
            	    LIST_TYPE104=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_type1136); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LIST_TYPE104_tree = (Object)adaptor.create(LIST_TYPE104);
            	    adaptor.addChild(root_0, LIST_TYPE104_tree);
            	    }
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:275:49: ( SP_QMARK )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==SP_QMARK) ) {
            	        int LA31_1 = input.LA(2);

            	        if ( (synpred43_Fan()) ) {
            	            alt31=1;
            	        }
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK105=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type1138); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK105_tree = (Object)adaptor.create(SP_QMARK105);
            	            adaptor.addChild(root_0, SP_QMARK105_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class nonMapType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonMapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:276:1: nonMapType : ( funcType | simpleType );
    public final FanParser.nonMapType_return nonMapType() throws RecognitionException {
        FanParser.nonMapType_return retval = new FanParser.nonMapType_return();
        retval.start = input.LT(1);
        int nonMapType_StartIndex = input.index();
        Object root_0 = null;

        FanParser.funcType_return funcType106 = null;

        FanParser.simpleType_return simpleType107 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:276:12: ( funcType | simpleType )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==SP_PIPE) ) {
                alt33=1;
            }
            else if ( (LA33_0==ID) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:14: funcType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_nonMapType1149);
                    funcType106=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType106.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:25: simpleType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simpleType_in_nonMapType1153);
                    simpleType107=simpleType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType107.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, nonMapType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nonMapType"

    public static class typeRoot_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeRoot"
    // src/net/colar/netbeans/fan/antlr/Fan.g:277:1: typeRoot : ( mapType | nonMapType );
    public final FanParser.typeRoot_return typeRoot() throws RecognitionException {
        FanParser.typeRoot_return retval = new FanParser.typeRoot_return();
        retval.start = input.LT(1);
        int typeRoot_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mapType_return mapType108 = null;

        FanParser.nonMapType_return nonMapType109 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:277:10: ( mapType | nonMapType )
            int alt34=2;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                alt34=1;
                }
                break;
            case SP_PIPE:
                {
                int LA34_2 = input.LA(2);

                if ( (synpred46_Fan()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA34_3 = input.LA(2);

                if ( (synpred46_Fan()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:277:12: mapType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_mapType_in_typeRoot1160);
                    mapType108=mapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapType108.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:277:22: nonMapType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nonMapType_in_typeRoot1164);
                    nonMapType109=nonMapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonMapType109.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, typeRoot_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeRoot"

    public static class simpleType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:278:1: simpleType : id ( SP_COLCOL id )? ;
    public final FanParser.simpleType_return simpleType() throws RecognitionException {
        FanParser.simpleType_return retval = new FanParser.simpleType_return();
        retval.start = input.LT(1);
        int simpleType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLCOL111=null;
        FanParser.id_return id110 = null;

        FanParser.id_return id112 = null;


        Object SP_COLCOL111_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:17: ( id ( SP_COLCOL id )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:21: id ( SP_COLCOL id )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_simpleType1178);
            id110=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id110.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:24: ( SP_COLCOL id )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==SP_COLCOL) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:278:25: SP_COLCOL id
                    {
                    SP_COLCOL111=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_simpleType1181); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLCOL111_tree = (Object)adaptor.create(SP_COLCOL111);
                    adaptor.addChild(root_0, SP_COLCOL111_tree);
                    }
                    pushFollow(FOLLOW_id_in_simpleType1183);
                    id112=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id112.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, simpleType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleType"

    public static class mapType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:280:1: mapType : ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? ;
    public final FanParser.mapType_return mapType() throws RecognitionException {
        FanParser.mapType_return retval = new FanParser.mapType_return();
        retval.start = input.LT(1);
        int mapType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK115=null;
        Token LIST_TYPE116=null;
        Token SP_QMARK117=null;
        Token SP_COLON118=null;
        FanParser.sq_bracketL_return sq_bracketL113 = null;

        FanParser.nonMapType_return nonMapType114 = null;

        FanParser.type_return type119 = null;

        FanParser.sq_bracketR_return sq_bracketR120 = null;


        Object SP_QMARK115_tree=null;
        Object LIST_TYPE116_tree=null;
        Object SP_QMARK117_tree=null;
        Object SP_COLON118_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:10: ( ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:12: ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )?
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:280:12: ( sq_bracketL )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==SQ_BRACKET_L) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: sq_bracketL
                    {
                    pushFollow(FOLLOW_sq_bracketL_in_mapType1194);
                    sq_bracketL113=sq_bracketL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL113.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_nonMapType_in_mapType1197);
            nonMapType114=nonMapType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, nonMapType114.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:36: ( SP_QMARK )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==SP_QMARK) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    SP_QMARK115=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType1199); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_QMARK115_tree = (Object)adaptor.create(SP_QMARK115);
                    adaptor.addChild(root_0, SP_QMARK115_tree);
                    }

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:280:46: ( LIST_TYPE ( SP_QMARK )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==LIST_TYPE) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:280:47: LIST_TYPE ( SP_QMARK )?
            	    {
            	    LIST_TYPE116=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_mapType1203); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LIST_TYPE116_tree = (Object)adaptor.create(LIST_TYPE116);
            	    adaptor.addChild(root_0, LIST_TYPE116_tree);
            	    }
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:280:57: ( SP_QMARK )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==SP_QMARK) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK117=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType1205); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK117_tree = (Object)adaptor.create(SP_QMARK117);
            	            adaptor.addChild(root_0, SP_QMARK117_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:281:5: ({...}? SP_COLON {...}? type )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==SP_COLON) ) {
                    int LA40_2 = input.LA(2);

                    if ( ((synpred52_Fan()&&(notAfterEol()))) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:281:6: {...}? SP_COLON {...}? type
            	    {
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    SP_COLON118=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapType1217); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COLON118_tree = (Object)adaptor.create(SP_COLON118);
            	    adaptor.addChild(root_0, SP_COLON118_tree);
            	    }
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    pushFollow(FOLLOW_type_in_mapType1221);
            	    type119=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type119.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:281:56: ( sq_bracketR )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==SQ_BRACKET_R) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred53_Fan()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: sq_bracketR
                    {
                    pushFollow(FOLLOW_sq_bracketR_in_mapType1225);
                    sq_bracketR120=sq_bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR120.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, mapType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapType"

    public static class funcType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:282:1: funcType : SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE ;
    public final FanParser.funcType_return funcType() throws RecognitionException {
        FanParser.funcType_return retval = new FanParser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_PIPE121=null;
        Token SP_COMMA122=null;
        Token SP_PIPE126=null;
        FanParser.formals_return formals123 = null;

        FanParser.assignedType_return assignedType124 = null;

        FanParser.assignedType_return assignedType125 = null;


        Object SP_PIPE121_tree=null;
        Object SP_COMMA122_tree=null;
        Object SP_PIPE126_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:11: ( SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE )
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:13: SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE
            {
            root_0 = (Object)adaptor.nil();

            SP_PIPE121=(Token)match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType1234); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_PIPE121_tree = (Object)adaptor.create(SP_PIPE121);
            adaptor.addChild(root_0, SP_PIPE121_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:21: ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==SP_COMMA) ) {
                alt43=1;
            }
            else if ( (LA43_0==SP_PIPE||LA43_0==ID||LA43_0==SQ_BRACKET_L) ) {
                alt43=2;
            }
            else if ( (LA43_0==OP_ARROW) && (synpred57_Fan())) {
                alt43=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:282:22: SP_COMMA
                    {
                    SP_COMMA122=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_funcType1237); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COMMA122_tree = (Object)adaptor.create(SP_COMMA122);
                    adaptor.addChild(root_0, SP_COMMA122_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:282:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:282:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:282:34: formals ( ( OP_ARROW )=> assignedType )?
                    {
                    pushFollow(FOLLOW_formals_in_funcType1242);
                    formals123=formals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formals123.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:282:42: ( ( OP_ARROW )=> assignedType )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==OP_ARROW) && (synpred55_Fan())) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:282:43: ( OP_ARROW )=> assignedType
                            {
                            pushFollow(FOLLOW_assignedType_in_funcType1249);
                            assignedType124=assignedType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType124.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:282:73: ( ( OP_ARROW )=> assignedType )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:282:73: ( ( OP_ARROW )=> assignedType )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:282:74: ( OP_ARROW )=> assignedType
                    {
                    pushFollow(FOLLOW_assignedType_in_funcType1261);
                    assignedType125=assignedType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType125.getTree());

                    }


                    }
                    break;

            }

            SP_PIPE126=(Token)match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType1265); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_PIPE126_tree = (Object)adaptor.create(SP_PIPE126);
            adaptor.addChild(root_0, SP_PIPE126_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, funcType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcType"

    public static class assignedType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignedType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:283:1: assignedType : OP_ARROW type ;
    public final FanParser.assignedType_return assignedType() throws RecognitionException {
        FanParser.assignedType_return retval = new FanParser.assignedType_return();
        retval.start = input.LT(1);
        int assignedType_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW127=null;
        FanParser.type_return type128 = null;


        Object OP_ARROW127_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:14: ( OP_ARROW type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:16: OP_ARROW type
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW127=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_assignedType1272); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW127_tree = (Object)adaptor.create(OP_ARROW127);
            adaptor.addChild(root_0, OP_ARROW127_tree);
            }
            pushFollow(FOLLOW_type_in_assignedType1274);
            type128=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type128.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, assignedType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignedType"

    public static class formals_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formals"
    // src/net/colar/netbeans/fan/antlr/Fan.g:284:1: formals : formal ( SP_COMMA formal )* ;
    public final FanParser.formals_return formals() throws RecognitionException {
        FanParser.formals_return retval = new FanParser.formals_return();
        retval.start = input.LT(1);
        int formals_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA130=null;
        FanParser.formal_return formal129 = null;

        FanParser.formal_return formal131 = null;


        Object SP_COMMA130_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:10: ( formal ( SP_COMMA formal )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:14: formal ( SP_COMMA formal )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_formal_in_formals1284);
            formal129=formal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formal129.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:21: ( SP_COMMA formal )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==SP_COMMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:284:22: SP_COMMA formal
            	    {
            	    SP_COMMA130=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_formals1287); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA130_tree = (Object)adaptor.create(SP_COMMA130);
            	    adaptor.addChild(root_0, SP_COMMA130_tree);
            	    }
            	    pushFollow(FOLLOW_formal_in_formals1289);
            	    formal131=formal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal131.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, formals_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formals"

    public static class formal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:285:1: formal : ( formalFull | formalTypeOnly | formalInferred );
    public final FanParser.formal_return formal() throws RecognitionException {
        FanParser.formal_return retval = new FanParser.formal_return();
        retval.start = input.LT(1);
        int formal_StartIndex = input.index();
        Object root_0 = null;

        FanParser.formalFull_return formalFull132 = null;

        FanParser.formalTypeOnly_return formalTypeOnly133 = null;

        FanParser.formalInferred_return formalInferred134 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:285:9: ( formalFull | formalTypeOnly | formalInferred )
            int alt45=3;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                int LA45_1 = input.LA(2);

                if ( (synpred59_Fan()) ) {
                    alt45=1;
                }
                else if ( (synpred60_Fan()) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
                }
                break;
            case SP_PIPE:
                {
                int LA45_2 = input.LA(2);

                if ( (synpred59_Fan()) ) {
                    alt45=1;
                }
                else if ( (synpred60_Fan()) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA45_3 = input.LA(2);

                if ( (synpred59_Fan()) ) {
                    alt45=1;
                }
                else if ( (synpred60_Fan()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:11: formalFull
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalFull_in_formal1299);
                    formalFull132=formalFull();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalFull132.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:24: formalTypeOnly
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalTypeOnly_in_formal1303);
                    formalTypeOnly133=formalTypeOnly();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalTypeOnly133.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:41: formalInferred
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalInferred_in_formal1307);
                    formalInferred134=formalInferred();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalInferred134.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, formal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formal"

    public static class formalFull_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalFull"
    // src/net/colar/netbeans/fan/antlr/Fan.g:286:1: formalFull : type id ;
    public final FanParser.formalFull_return formalFull() throws RecognitionException {
        FanParser.formalFull_return retval = new FanParser.formalFull_return();
        retval.start = input.LT(1);
        int formalFull_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type135 = null;

        FanParser.id_return id136 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:17: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:19: type id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalFull1319);
            type135=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type135.getTree());
            pushFollow(FOLLOW_id_in_formalFull1321);
            id136=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id136.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, formalFull_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalFull"

    public static class formalTypeOnly_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalTypeOnly"
    // src/net/colar/netbeans/fan/antlr/Fan.g:287:1: formalTypeOnly : type ;
    public final FanParser.formalTypeOnly_return formalTypeOnly() throws RecognitionException {
        FanParser.formalTypeOnly_return retval = new FanParser.formalTypeOnly_return();
        retval.start = input.LT(1);
        int formalTypeOnly_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type137 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:17: ( type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:21: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalTypeOnly1331);
            type137=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type137.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, formalTypeOnly_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalTypeOnly"

    public static class formalInferred_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalInferred"
    // src/net/colar/netbeans/fan/antlr/Fan.g:288:1: formalInferred : id ;
    public final FanParser.formalInferred_return formalInferred() throws RecognitionException {
        FanParser.formalInferred_return retval = new FanParser.formalInferred_return();
        retval.start = input.LT(1);
        int formalInferred_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id138 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:288:17: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:288:21: id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_formalInferred1341);
            id138=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id138.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, formalInferred_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalInferred"

    public static class slotDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slotDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:289:1: slotDef : ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) ;
    public final FanParser.slotDef_return slotDef() throws RecognitionException {
        FanParser.slotDef_return retval = new FanParser.slotDef_return();
        retval.start = input.LT(1);
        int slotDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.staticBlock_return staticBlock139 = null;

        FanParser.docs_return docs140 = null;

        FanParser.facet_return facet141 = null;

        FanParser.ctorDef_return ctorDef142 = null;

        FanParser.methodDef_return methodDef143 = null;

        FanParser.fieldDef_return fieldDef144 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:10: ( ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:289:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:289:13: ( KW_STATIC bracketL )=> staticBlock
                    {
                    pushFollow(FOLLOW_staticBlock_in_slotDef1357);
                    staticBlock139=staticBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticBlock139.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:290:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:290:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:290:6: docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    {
                    pushFollow(FOLLOW_docs_in_slotDef1365);
                    docs140=docs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, docs140.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:290:11: ( facet )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==AT) ) {
                            int LA46_2 = input.LA(2);

                            if ( (LA46_2==ID) ) {
                                int LA46_3 = input.LA(3);

                                if ( (synpred62_Fan()) ) {
                                    alt46=1;
                                }


                            }


                        }


                        switch (alt46) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
                    	    {
                    	    pushFollow(FOLLOW_facet_in_slotDef1367);
                    	    facet141=facet();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet141.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:291:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    int alt47=3;
                    alt47 = dfa47.predict(input);
                    switch (alt47) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:292:7: ( ( ctorFlags )* KW_NEW )=> ctorDef
                            {
                            pushFollow(FOLLOW_ctorDef_in_slotDef1390);
                            ctorDef142=ctorDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorDef142.getTree());

                            }
                            break;
                        case 2 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:293:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef
                            {
                            pushFollow(FOLLOW_methodDef_in_slotDef1417);
                            methodDef143=methodDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDef143.getTree());

                            }
                            break;
                        case 3 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:294:7: fieldDef
                            {
                            pushFollow(FOLLOW_fieldDef_in_slotDef1427);
                            fieldDef144=fieldDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDef144.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, slotDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slotDef"

    public static class fieldDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:298:1: fieldDef : docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? ) ;
    public final FanParser.fieldDef_return fieldDef() throws RecognitionException {
        FanParser.fieldDef_return retval = new FanParser.fieldDef_return();
        retval.start = input.LT(1);
        int fieldDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL148=null;
        Token SP_SEMI154=null;
        FanParser.fieldFlags_return m = null;

        FanParser.docs_return docs145 = null;

        FanParser.facet_return facet146 = null;

        FanParser.typeId_return typeId147 = null;

        FanParser.expr_return expr149 = null;

        FanParser.bracketL_return bracketL150 = null;

        FanParser.protection_return protection151 = null;

        FanParser.getter_return getter152 = null;

        FanParser.setter_return setter153 = null;

        FanParser.block_return block155 = null;

        FanParser.bracketR_return bracketR156 = null;

        FanParser.eos_return eos157 = null;


        Object AS_INIT_VAL148_tree=null;
        Object SP_SEMI154_tree=null;
        RewriteRuleTokenStream stream_SP_SEMI=new RewriteRuleTokenStream(adaptor,"token SP_SEMI");
        RewriteRuleTokenStream stream_AS_INIT_VAL=new RewriteRuleTokenStream(adaptor,"token AS_INIT_VAL");
        RewriteRuleSubtreeStream stream_protection=new RewriteRuleSubtreeStream(adaptor,"rule protection");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_fieldFlags=new RewriteRuleSubtreeStream(adaptor,"rule fieldFlags");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_getter=new RewriteRuleSubtreeStream(adaptor,"rule getter");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_setter=new RewriteRuleSubtreeStream(adaptor,"rule setter");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        paraphrase.push("Field definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:3: ( docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:5: docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            {
            pushFollow(FOLLOW_docs_in_fieldDef1463);
            docs145=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs145.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:10: ( facet )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==AT) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_fieldDef1465);
            	    facet146=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet146.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            pushFollow(FOLLOW_fieldFlags_in_fieldDef1470);
            m=fieldFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldFlags.add(m.getTree());
            pushFollow(FOLLOW_typeId_in_fieldDef1472);
            typeId147=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeId.add(typeId147.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:37: ( AS_INIT_VAL expr )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==AS_INIT_VAL) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:299:38: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL148=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_fieldDef1475); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL148);

                    pushFollow(FOLLOW_expr_in_fieldDef1477);
                    expr149=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr149.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:300:5: ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==BRACKET_L) ) {
                alt56=1;
            }
            else if ( (LA56_0==EOF||(LA56_0>=KW_RD_ONLY && LA56_0<=KW_FINAL)||(LA56_0>=KW_ABSTRACT && LA56_0<=KW_ONCE)||LA56_0==BRACKET_R||LA56_0==SP_PIPE||LA56_0==SP_SEMI||LA56_0==ID||LA56_0==DOC||(LA56_0>=AT && LA56_0<=SQ_BRACKET_L)) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:301:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:301:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:301:6: bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR
                    {
                    pushFollow(FOLLOW_bracketL_in_fieldDef1492);
                    bracketL150=bracketL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketL.add(bracketL150.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:301:15: ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>=KW_PRIVATE && LA55_0<=KW_INTERNAL)||LA55_0==ID) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:301:16: ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )?
                    	    {
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:301:16: ( protection )?
                    	    int alt51=2;
                    	    int LA51_0 = input.LA(1);

                    	    if ( ((LA51_0>=KW_PRIVATE && LA51_0<=KW_INTERNAL)) ) {
                    	        alt51=1;
                    	    }
                    	    switch (alt51) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    	            {
                    	            pushFollow(FOLLOW_protection_in_fieldDef1495);
                    	            protection151=protection();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_protection.add(protection151.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:301:28: ( getter | setter )
                    	    int alt52=2;
                    	    int LA52_0 = input.LA(1);

                    	    if ( (LA52_0==ID) ) {
                    	        int LA52_1 = input.LA(2);

                    	        if ( (synpred71_Fan()) ) {
                    	            alt52=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt52=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 52, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 52, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt52) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:301:29: getter
                    	            {
                    	            pushFollow(FOLLOW_getter_in_fieldDef1499);
                    	            getter152=getter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_getter.add(getter152.getTree());

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:301:38: setter
                    	            {
                    	            pushFollow(FOLLOW_setter_in_fieldDef1503);
                    	            setter153=setter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_setter.add(setter153.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:301:46: ( SP_SEMI )?
                    	    int alt53=2;
                    	    int LA53_0 = input.LA(1);

                    	    if ( (LA53_0==SP_SEMI) ) {
                    	        alt53=1;
                    	    }
                    	    switch (alt53) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
                    	            {
                    	            SP_SEMI154=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_fieldDef1506); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_SP_SEMI.add(SP_SEMI154);


                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:301:55: ( block )?
                    	    int alt54=2;
                    	    int LA54_0 = input.LA(1);

                    	    if ( ((LA54_0>=KW_BREAK && LA54_0<=KW_TRY)||(LA54_0>=KW_THIS && LA54_0<=KW_SUPER)||(LA54_0>=KW_NULL && LA54_0<=KW_FALSE)||LA54_0==BRACKET_L||LA54_0==SP_PIPE||LA54_0==OP_CURRY||(LA54_0>=OP_PLUS && LA54_0<=OP_MULTI)||(LA54_0>=OP_BANG && LA54_0<=OP_TILDA)||(LA54_0>=URI && LA54_0<=OP_POUND)||LA54_0==NUMBER||LA54_0==SQ_BRACKET_L||LA54_0==PAR_L) ) {
                    	        alt54=1;
                    	    }
                    	    else if ( (LA54_0==ID) ) {
                    	        int LA54_2 = input.LA(2);

                    	        if ( (synpred73_Fan()) ) {
                    	            alt54=1;
                    	        }
                    	    }
                    	    switch (alt54) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: block
                    	            {
                    	            pushFollow(FOLLOW_block_in_fieldDef1509);
                    	            block155=block();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_block.add(block155.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt55 >= 1 ) break loop55;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
                    } while (true);

                    pushFollow(FOLLOW_bracketR_in_fieldDef1514);
                    bracketR156=bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketR.add(bracketR156.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:302:7: eos
                    {
                    pushFollow(FOLLOW_eos_in_fieldDef1523);
                    eos157=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos157.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: m, typeId, expr
            // token labels: 
            // rule labels: retval, m
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);

            root_0 = (Object)adaptor.nil();
            // 303:4: -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:303:7: ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_FIELD, "AST_FIELD"), root_1);

                adaptor.addChild(root_1, stream_typeId.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:303:26: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:303:26: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:303:46: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, fieldDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldDef"

    public static class typeId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:304:1: typeId : ( ( type id )=> typeAndId | fieldId ) ;
    public final FanParser.typeId_return typeId() throws RecognitionException {
        FanParser.typeId_return retval = new FanParser.typeId_return();
        retval.start = input.LT(1);
        int typeId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeAndId_return typeAndId158 = null;

        FanParser.fieldId_return fieldId159 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:9: ( ( ( type id )=> typeAndId | fieldId ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:11: ( ( type id )=> typeAndId | fieldId )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:304:11: ( ( type id )=> typeAndId | fieldId )
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:304:12: ( type id )=> typeAndId
                    {
                    pushFollow(FOLLOW_typeAndId_in_typeId1561);
                    typeAndId158=typeAndId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeAndId158.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:304:35: fieldId
                    {
                    pushFollow(FOLLOW_fieldId_in_typeId1565);
                    fieldId159=fieldId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldId159.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, typeId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeId"

    public static class fieldId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:305:1: fieldId : id -> ^( AST_ID id ) ;
    public final FanParser.fieldId_return fieldId() throws RecognitionException {
        FanParser.fieldId_return retval = new FanParser.fieldId_return();
        retval.start = input.LT(1);
        int fieldId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id160 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:10: ( id -> ^( AST_ID id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:12: id
            {
            pushFollow(FOLLOW_id_in_fieldId1574);
            id160=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id160.getTree());


            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 306:4: -> ^( AST_ID id )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:306:7: ^( AST_ID id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, fieldId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldId"

    public static class typeAndId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeAndId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:307:1: typeAndId : type id -> ^( AST_ID id ) ^( AST_TYPE type ) ;
    public final FanParser.typeAndId_return typeAndId() throws RecognitionException {
        FanParser.typeAndId_return retval = new FanParser.typeAndId_return();
        retval.start = input.LT(1);
        int typeAndId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type161 = null;

        FanParser.id_return id162 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:11: ( type id -> ^( AST_ID id ) ^( AST_TYPE type ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:13: type id
            {
            pushFollow(FOLLOW_type_in_typeAndId1592);
            type161=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type161.getTree());
            pushFollow(FOLLOW_id_in_typeAndId1594);
            id162=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id162.getTree());


            // AST REWRITE
            // elements: type, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 308:4: -> ^( AST_ID id ) ^( AST_TYPE type )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:308:7: ^( AST_ID id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:308:20: ^( AST_TYPE type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE, "AST_TYPE"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, typeAndId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeAndId"

    public static class fieldFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:309:1: fieldFlags : ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* ;
    public final FanParser.fieldFlags_return fieldFlags() throws RecognitionException {
        FanParser.fieldFlags_return retval = new FanParser.fieldFlags_return();
        retval.start = input.LT(1);
        int fieldFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ABSTRACT163=null;
        Token KW_RD_ONLY164=null;
        Token KW_CONST165=null;
        Token KW_STATIC166=null;
        Token KW_NATIVE167=null;
        Token KW_VOLATILE168=null;
        Token KW_OVERRIDE169=null;
        Token KW_VIRTUAL170=null;
        Token KW_FINAL171=null;
        FanParser.protection_return protection172 = null;


        Object KW_ABSTRACT163_tree=null;
        Object KW_RD_ONLY164_tree=null;
        Object KW_CONST165_tree=null;
        Object KW_STATIC166_tree=null;
        Object KW_NATIVE167_tree=null;
        Object KW_VOLATILE168_tree=null;
        Object KW_OVERRIDE169_tree=null;
        Object KW_VIRTUAL170_tree=null;
        Object KW_FINAL171_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:12: ( ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:309:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            loop58:
            do {
                int alt58=11;
                switch ( input.LA(1) ) {
                case KW_ABSTRACT:
                    {
                    alt58=1;
                    }
                    break;
                case KW_RD_ONLY:
                    {
                    alt58=2;
                    }
                    break;
                case KW_CONST:
                    {
                    alt58=3;
                    }
                    break;
                case KW_STATIC:
                    {
                    alt58=4;
                    }
                    break;
                case KW_NATIVE:
                    {
                    alt58=5;
                    }
                    break;
                case KW_VOLATILE:
                    {
                    alt58=6;
                    }
                    break;
                case KW_OVERRIDE:
                    {
                    alt58=7;
                    }
                    break;
                case KW_VIRTUAL:
                    {
                    alt58=8;
                    }
                    break;
                case KW_FINAL:
                    {
                    alt58=9;
                    }
                    break;
                case KW_PRIVATE:
                case KW_PROTECTED:
                case KW_PUBLIC:
                case KW_INTERNAL:
                    {
                    alt58=10;
                    }
                    break;

                }

                switch (alt58) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:309:15: KW_ABSTRACT
            	    {
            	    KW_ABSTRACT163=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_fieldFlags1619); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_ABSTRACT163_tree = (Object)adaptor.create(KW_ABSTRACT163);
            	    adaptor.addChild(root_0, KW_ABSTRACT163_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:309:29: KW_RD_ONLY
            	    {
            	    KW_RD_ONLY164=(Token)match(input,KW_RD_ONLY,FOLLOW_KW_RD_ONLY_in_fieldFlags1623); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_RD_ONLY164_tree = (Object)adaptor.create(KW_RD_ONLY164);
            	    adaptor.addChild(root_0, KW_RD_ONLY164_tree);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:309:42: KW_CONST
            	    {
            	    KW_CONST165=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_fieldFlags1627); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_CONST165_tree = (Object)adaptor.create(KW_CONST165);
            	    adaptor.addChild(root_0, KW_CONST165_tree);
            	    }

            	    }
            	    break;
            	case 4 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:309:53: KW_STATIC
            	    {
            	    KW_STATIC166=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_fieldFlags1631); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_STATIC166_tree = (Object)adaptor.create(KW_STATIC166);
            	    adaptor.addChild(root_0, KW_STATIC166_tree);
            	    }

            	    }
            	    break;
            	case 5 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:309:65: KW_NATIVE
            	    {
            	    KW_NATIVE167=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_fieldFlags1635); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_NATIVE167_tree = (Object)adaptor.create(KW_NATIVE167);
            	    adaptor.addChild(root_0, KW_NATIVE167_tree);
            	    }

            	    }
            	    break;
            	case 6 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:309:77: KW_VOLATILE
            	    {
            	    KW_VOLATILE168=(Token)match(input,KW_VOLATILE,FOLLOW_KW_VOLATILE_in_fieldFlags1639); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VOLATILE168_tree = (Object)adaptor.create(KW_VOLATILE168);
            	    adaptor.addChild(root_0, KW_VOLATILE168_tree);
            	    }

            	    }
            	    break;
            	case 7 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:309:91: KW_OVERRIDE
            	    {
            	    KW_OVERRIDE169=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_fieldFlags1643); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_OVERRIDE169_tree = (Object)adaptor.create(KW_OVERRIDE169);
            	    adaptor.addChild(root_0, KW_OVERRIDE169_tree);
            	    }

            	    }
            	    break;
            	case 8 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:309:105: KW_VIRTUAL
            	    {
            	    KW_VIRTUAL170=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_fieldFlags1647); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VIRTUAL170_tree = (Object)adaptor.create(KW_VIRTUAL170);
            	    adaptor.addChild(root_0, KW_VIRTUAL170_tree);
            	    }

            	    }
            	    break;
            	case 9 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:309:118: KW_FINAL
            	    {
            	    KW_FINAL171=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_fieldFlags1651); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_FINAL171_tree = (Object)adaptor.create(KW_FINAL171);
            	    adaptor.addChild(root_0, KW_FINAL171_tree);
            	    }

            	    }
            	    break;
            	case 10 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:309:129: protection
            	    {
            	    pushFollow(FOLLOW_protection_in_fieldFlags1655);
            	    protection172=protection();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection172.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, fieldFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldFlags"

    public static class methodDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:310:1: methodDef : docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody -> ^( AST_METHOD ( methodBody )? ^( AST_ID $mname) ^( AST_TYPE $returnType) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ) ;
    public final FanParser.methodDef_return methodDef() throws RecognitionException {
        FanParser.methodDef_return retval = new FanParser.methodDef_return();
        retval.start = input.LT(1);
        int methodDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.methodFlags_return m = null;

        FanParser.type_return returnType = null;

        FanParser.id_return mname = null;

        FanParser.docs_return docs173 = null;

        FanParser.facet_return facet174 = null;

        FanParser.parL_return parL175 = null;

        FanParser.params_return params176 = null;

        FanParser.parR_return parR177 = null;

        FanParser.methodBody_return methodBody178 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_methodFlags=new RewriteRuleSubtreeStream(adaptor,"rule methodFlags");
        RewriteRuleSubtreeStream stream_methodBody=new RewriteRuleSubtreeStream(adaptor,"rule methodBody");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_parL=new RewriteRuleSubtreeStream(adaptor,"rule parL");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_parR=new RewriteRuleSubtreeStream(adaptor,"rule parR");
        paraphrase.push("Method definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:311:3: ( docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody -> ^( AST_METHOD ( methodBody )? ^( AST_ID $mname) ^( AST_TYPE $returnType) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:311:5: docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody
            {
            pushFollow(FOLLOW_docs_in_methodDef1675);
            docs173=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs173.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:311:10: ( facet )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==AT) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_methodDef1677);
            	    facet174=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet174.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:311:18: (m= methodFlags )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=KW_STATIC && LA60_0<=KW_NATIVE)||(LA60_0>=KW_OVERRIDE && LA60_0<=KW_FINAL)||(LA60_0>=KW_ABSTRACT && LA60_0<=KW_INTERNAL)||LA60_0==KW_ONCE) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= methodFlags
            	    {
            	    pushFollow(FOLLOW_methodFlags_in_methodDef1682);
            	    m=methodFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_methodFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            pushFollow(FOLLOW_type_in_methodDef1687);
            returnType=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(returnType.getTree());
            pushFollow(FOLLOW_id_in_methodDef1693);
            mname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(mname.getTree());
            pushFollow(FOLLOW_parL_in_methodDef1695);
            parL175=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL175.getTree());
            pushFollow(FOLLOW_params_in_methodDef1697);
            params176=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_params.add(params176.getTree());
            pushFollow(FOLLOW_parR_in_methodDef1699);
            parR177=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR177.getTree());
            pushFollow(FOLLOW_methodBody_in_methodDef1701);
            methodBody178=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodBody.add(methodBody178.getTree());


            // AST REWRITE
            // elements: params, mname, m, methodBody, returnType
            // token labels: 
            // rule labels: mname, retval, m, returnType
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_mname=new RewriteRuleSubtreeStream(adaptor,"rule mname",mname!=null?mname.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);
            RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType",returnType!=null?returnType.tree:null);

            root_0 = (Object)adaptor.nil();
            // 312:7: -> ^( AST_METHOD ( methodBody )? ^( AST_ID $mname) ^( AST_TYPE $returnType) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:312:10: ^( AST_METHOD ( methodBody )? ^( AST_ID $mname) ^( AST_TYPE $returnType) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_METHOD, "AST_METHOD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:312:23: ( methodBody )?
                if ( stream_methodBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_methodBody.nextTree());

                }
                stream_methodBody.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:312:35: ^( AST_ID $mname)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_2);

                adaptor.addChild(root_2, stream_mname.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:312:52: ^( AST_TYPE $returnType)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE, "AST_TYPE"), root_2);

                adaptor.addChild(root_2, stream_returnType.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:312:76: ( ^( AST_PARAMS params ) )?
                if ( stream_params.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:312:76: ^( AST_PARAMS params )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_PARAMS, "AST_PARAMS"), root_2);

                    adaptor.addChild(root_2, stream_params.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_params.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:312:98: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:312:98: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, methodDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodDef"

    public static class methodFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:313:1: methodFlags : ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL );
    public final FanParser.methodFlags_return methodFlags() throws RecognitionException {
        FanParser.methodFlags_return retval = new FanParser.methodFlags_return();
        retval.start = input.LT(1);
        int methodFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_VIRTUAL180=null;
        Token KW_OVERRIDE181=null;
        Token KW_ABSTRACT182=null;
        Token KW_STATIC183=null;
        Token KW_ONCE184=null;
        Token KW_NATIVE185=null;
        Token KW_FINAL186=null;
        FanParser.protection_return protection179 = null;


        Object KW_VIRTUAL180_tree=null;
        Object KW_OVERRIDE181_tree=null;
        Object KW_ABSTRACT182_tree=null;
        Object KW_STATIC183_tree=null;
        Object KW_ONCE184_tree=null;
        Object KW_NATIVE185_tree=null;
        Object KW_FINAL186_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:13: ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL )
            int alt61=8;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt61=1;
                }
                break;
            case KW_VIRTUAL:
                {
                alt61=2;
                }
                break;
            case KW_OVERRIDE:
                {
                alt61=3;
                }
                break;
            case KW_ABSTRACT:
                {
                alt61=4;
                }
                break;
            case KW_STATIC:
                {
                alt61=5;
                }
                break;
            case KW_ONCE:
                {
                alt61=6;
                }
                break;
            case KW_NATIVE:
                {
                alt61=7;
                }
                break;
            case KW_FINAL:
                {
                alt61=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:15: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_methodFlags1752);
                    protection179=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection179.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:28: KW_VIRTUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_VIRTUAL180=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_methodFlags1756); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_VIRTUAL180_tree = (Object)adaptor.create(KW_VIRTUAL180);
                    adaptor.addChild(root_0, KW_VIRTUAL180_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:41: KW_OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_OVERRIDE181=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_methodFlags1760); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_OVERRIDE181_tree = (Object)adaptor.create(KW_OVERRIDE181);
                    adaptor.addChild(root_0, KW_OVERRIDE181_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:55: KW_ABSTRACT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ABSTRACT182=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_methodFlags1764); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ABSTRACT182_tree = (Object)adaptor.create(KW_ABSTRACT182);
                    adaptor.addChild(root_0, KW_ABSTRACT182_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:69: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC183=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_methodFlags1768); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC183_tree = (Object)adaptor.create(KW_STATIC183);
                    adaptor.addChild(root_0, KW_STATIC183_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:81: KW_ONCE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ONCE184=(Token)match(input,KW_ONCE,FOLLOW_KW_ONCE_in_methodFlags1772); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ONCE184_tree = (Object)adaptor.create(KW_ONCE184);
                    adaptor.addChild(root_0, KW_ONCE184_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:314:5: KW_NATIVE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NATIVE185=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_methodFlags1780); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NATIVE185_tree = (Object)adaptor.create(KW_NATIVE185);
                    adaptor.addChild(root_0, KW_NATIVE185_tree);
                    }

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:314:17: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL186=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_methodFlags1784); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL186_tree = (Object)adaptor.create(KW_FINAL186);
                    adaptor.addChild(root_0, KW_FINAL186_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, methodFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodFlags"

    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "params"
    // src/net/colar/netbeans/fan/antlr/Fan.g:315:1: params : ( param ( SP_COMMA param )* )? ;
    public final FanParser.params_return params() throws RecognitionException {
        FanParser.params_return retval = new FanParser.params_return();
        retval.start = input.LT(1);
        int params_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA188=null;
        FanParser.param_return param187 = null;

        FanParser.param_return param189 = null;


        Object SP_COMMA188_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:315:9: ( ( param ( SP_COMMA param )* )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:315:11: ( param ( SP_COMMA param )* )?
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:315:11: ( param ( SP_COMMA param )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==SP_PIPE||LA63_0==ID||LA63_0==SQ_BRACKET_L) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:315:12: param ( SP_COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_params1793);
                    param187=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, param187.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:315:18: ( SP_COMMA param )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==SP_COMMA) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:315:19: SP_COMMA param
                    	    {
                    	    SP_COMMA188=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_params1796); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA188_tree = (Object)adaptor.create(SP_COMMA188);
                    	    adaptor.addChild(root_0, SP_COMMA188_tree);
                    	    }
                    	    pushFollow(FOLLOW_param_in_params1798);
                    	    param189=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, param189.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, params_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "params"

    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // src/net/colar/netbeans/fan/antlr/Fan.g:316:1: param : type id ( AS_INIT_VAL expr )? ;
    public final FanParser.param_return param() throws RecognitionException {
        FanParser.param_return retval = new FanParser.param_return();
        retval.start = input.LT(1);
        int param_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL192=null;
        FanParser.type_return type190 = null;

        FanParser.id_return id191 = null;

        FanParser.expr_return expr193 = null;


        Object AS_INIT_VAL192_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:9: ( type id ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:11: type id ( AS_INIT_VAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_param1811);
            type190=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type190.getTree());
            pushFollow(FOLLOW_id_in_param1813);
            id191=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id191.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:19: ( AS_INIT_VAL expr )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==AS_INIT_VAL) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:20: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL192=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_param1816); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_INIT_VAL192_tree = (Object)adaptor.create(AS_INIT_VAL192);
                    adaptor.addChild(root_0, AS_INIT_VAL192_tree);
                    }
                    pushFollow(FOLLOW_expr_in_param1818);
                    expr193=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr193.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, param_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "param"

    public static class methodBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:317:1: methodBody : ( ( multiStmt )=> multiStmt | eos ) ;
    public final FanParser.methodBody_return methodBody() throws RecognitionException {
        FanParser.methodBody_return retval = new FanParser.methodBody_return();
        retval.start = input.LT(1);
        int methodBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt194 = null;

        FanParser.eos_return eos195 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:12: ( ( ( multiStmt )=> multiStmt | eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:14: ( ( multiStmt )=> multiStmt | eos )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:317:14: ( ( multiStmt )=> multiStmt | eos )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==BRACKET_L) && (synpred99_Fan())) {
                alt65=1;
            }
            else if ( (LA65_0==EOF||(LA65_0>=KW_RD_ONLY && LA65_0<=KW_FINAL)||(LA65_0>=KW_ABSTRACT && LA65_0<=KW_ONCE)||LA65_0==BRACKET_R||LA65_0==SP_PIPE||LA65_0==SP_SEMI||LA65_0==ID||LA65_0==DOC||(LA65_0>=AT && LA65_0<=SQ_BRACKET_L)) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:317:15: ( multiStmt )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_methodBody1832);
                    multiStmt194=multiStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt194.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:317:40: eos
                    {
                    pushFollow(FOLLOW_eos_in_methodBody1836);
                    eos195=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos195.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, methodBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodBody"

    public static class ctorDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:318:1: ctorDef : docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody -> ^( AST_CONSTRUCTOR ( methodBody )? ^( AST_ID $cname) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ) ;
    public final FanParser.ctorDef_return ctorDef() throws RecognitionException {
        FanParser.ctorDef_return retval = new FanParser.ctorDef_return();
        retval.start = input.LT(1);
        int ctorDef_StartIndex = input.index();
        Object root_0 = null;

        Token cchain=null;
        Token KW_NEW198=null;
        FanParser.ctorFlags_return m = null;

        FanParser.id_return cname = null;

        FanParser.docs_return docs196 = null;

        FanParser.facet_return facet197 = null;

        FanParser.parL_return parL199 = null;

        FanParser.params_return params200 = null;

        FanParser.parR_return parR201 = null;

        FanParser.ctorChain_return ctorChain202 = null;

        FanParser.methodBody_return methodBody203 = null;


        Object cchain_tree=null;
        Object KW_NEW198_tree=null;
        RewriteRuleTokenStream stream_KW_NEW=new RewriteRuleTokenStream(adaptor,"token KW_NEW");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_methodBody=new RewriteRuleSubtreeStream(adaptor,"rule methodBody");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_parL=new RewriteRuleSubtreeStream(adaptor,"rule parL");
        RewriteRuleSubtreeStream stream_ctorChain=new RewriteRuleSubtreeStream(adaptor,"rule ctorChain");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        RewriteRuleSubtreeStream stream_parR=new RewriteRuleSubtreeStream(adaptor,"rule parR");
        RewriteRuleSubtreeStream stream_ctorFlags=new RewriteRuleSubtreeStream(adaptor,"rule ctorFlags");
        paraphrase.push("Constructor definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:319:3: ( docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody -> ^( AST_CONSTRUCTOR ( methodBody )? ^( AST_ID $cname) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:319:5: docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody
            {
            pushFollow(FOLLOW_docs_in_ctorDef1856);
            docs196=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs196.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:319:10: ( facet )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==AT) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_ctorDef1858);
            	    facet197=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet197.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:319:18: (m= ctorFlags )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=KW_PRIVATE && LA67_0<=KW_INTERNAL)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= ctorFlags
            	    {
            	    pushFollow(FOLLOW_ctorFlags_in_ctorDef1863);
            	    m=ctorFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ctorFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            KW_NEW198=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_ctorDef1866); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_NEW.add(KW_NEW198);

            pushFollow(FOLLOW_id_in_ctorDef1870);
            cname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(cname.getTree());
            pushFollow(FOLLOW_parL_in_ctorDef1872);
            parL199=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL199.getTree());
            pushFollow(FOLLOW_params_in_ctorDef1874);
            params200=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_params.add(params200.getTree());
            pushFollow(FOLLOW_parR_in_ctorDef1876);
            parR201=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR201.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:319:69: (cchain= ( ( SP_COLON )=> ctorChain ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==SP_COLON) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: cchain= ( ( SP_COLON )=> ctorChain )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:319:70: ( ( SP_COLON )=> ctorChain )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:319:71: ( SP_COLON )=> ctorChain
                    {
                    pushFollow(FOLLOW_ctorChain_in_ctorDef1885);
                    ctorChain202=ctorChain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ctorChain.add(ctorChain202.getTree());

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_ctorDef1889);
            methodBody203=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodBody.add(methodBody203.getTree());


            // AST REWRITE
            // elements: m, params, methodBody, cchain, cname
            // token labels: cchain
            // rule labels: retval, m, cname
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_cchain=new RewriteRuleTokenStream(adaptor,"token cchain",cchain);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_m=new RewriteRuleSubtreeStream(adaptor,"rule m",m!=null?m.tree:null);
            RewriteRuleSubtreeStream stream_cname=new RewriteRuleSubtreeStream(adaptor,"rule cname",cname!=null?cname.tree:null);

            root_0 = (Object)adaptor.nil();
            // 320:7: -> ^( AST_CONSTRUCTOR ( methodBody )? ^( AST_ID $cname) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:320:10: ^( AST_CONSTRUCTOR ( methodBody )? ^( AST_ID $cname) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CONSTRUCTOR, "AST_CONSTRUCTOR"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:320:28: ( methodBody )?
                if ( stream_methodBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_methodBody.nextTree());

                }
                stream_methodBody.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:320:40: ^( AST_ID $cname)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_2);

                adaptor.addChild(root_2, stream_cname.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:320:57: ( ^( AST_PARAMS params ) )?
                if ( stream_params.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:320:57: ^( AST_PARAMS params )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_PARAMS, "AST_PARAMS"), root_2);

                    adaptor.addChild(root_2, stream_params.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_params.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:320:79: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:320:79: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:320:99: ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )*
                while ( stream_cchain.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:320:99: ^( AST_CONSTRUCTOR_CHAIN $cchain)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CONSTRUCTOR_CHAIN, "AST_CONSTRUCTOR_CHAIN"), root_2);

                    adaptor.addChild(root_2, stream_cchain.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_cchain.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, ctorDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorDef"

    public static class ctorFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:321:1: ctorFlags : protection ;
    public final FanParser.ctorFlags_return ctorFlags() throws RecognitionException {
        FanParser.ctorFlags_return retval = new FanParser.ctorFlags_return();
        retval.start = input.LT(1);
        int ctorFlags_StartIndex = input.index();
        Object root_0 = null;

        FanParser.protection_return protection204 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:11: ( protection )
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:13: protection
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_protection_in_ctorFlags1942);
            protection204=protection();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protection204.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, ctorFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorFlags"

    public static class ctorChain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:322:1: ctorChain : SP_COLON ( ctorChainThis | ctorChainSuper ) ;
    public final FanParser.ctorChain_return ctorChain() throws RecognitionException {
        FanParser.ctorChain_return retval = new FanParser.ctorChain_return();
        retval.start = input.LT(1);
        int ctorChain_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON205=null;
        FanParser.ctorChainThis_return ctorChainThis206 = null;

        FanParser.ctorChainSuper_return ctorChainSuper207 = null;


        Object SP_COLON205_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:322:11: ( SP_COLON ( ctorChainThis | ctorChainSuper ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:322:13: SP_COLON ( ctorChainThis | ctorChainSuper )
            {
            root_0 = (Object)adaptor.nil();

            SP_COLON205=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ctorChain1949); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON205_tree = (Object)adaptor.create(SP_COLON205);
            adaptor.addChild(root_0, SP_COLON205_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:322:22: ( ctorChainThis | ctorChainSuper )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==KW_THIS) ) {
                alt69=1;
            }
            else if ( (LA69_0==KW_SUPER) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:322:23: ctorChainThis
                    {
                    pushFollow(FOLLOW_ctorChainThis_in_ctorChain1952);
                    ctorChainThis206=ctorChainThis();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainThis206.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:322:39: ctorChainSuper
                    {
                    pushFollow(FOLLOW_ctorChainSuper_in_ctorChain1956);
                    ctorChainSuper207=ctorChainSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainSuper207.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, ctorChain_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChain"

    public static class ctorChainThis_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChainThis"
    // src/net/colar/netbeans/fan/antlr/Fan.g:324:1: ctorChainThis : KW_THIS DOT id parL ( args )? parR ;
    public final FanParser.ctorChainThis_return ctorChainThis() throws RecognitionException {
        FanParser.ctorChainThis_return retval = new FanParser.ctorChainThis_return();
        retval.start = input.LT(1);
        int ctorChainThis_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THIS208=null;
        Token DOT209=null;
        FanParser.id_return id210 = null;

        FanParser.parL_return parL211 = null;

        FanParser.args_return args212 = null;

        FanParser.parR_return parR213 = null;


        Object KW_THIS208_tree=null;
        Object DOT209_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:324:15: ( KW_THIS DOT id parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:324:17: KW_THIS DOT id parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_THIS208=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_ctorChainThis1965); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THIS208_tree = (Object)adaptor.create(KW_THIS208);
            adaptor.addChild(root_0, KW_THIS208_tree);
            }
            DOT209=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainThis1967); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT209_tree = (Object)adaptor.create(DOT209);
            adaptor.addChild(root_0, DOT209_tree);
            }
            pushFollow(FOLLOW_id_in_ctorChainThis1969);
            id210=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id210.getTree());
            pushFollow(FOLLOW_parL_in_ctorChainThis1971);
            parL211=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL211.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:324:37: ( args )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=KW_THIS && LA70_0<=KW_SUPER)||(LA70_0>=KW_NULL && LA70_0<=KW_FALSE)||LA70_0==SP_PIPE||LA70_0==OP_CURRY||(LA70_0>=OP_PLUS && LA70_0<=OP_MULTI)||(LA70_0>=OP_BANG && LA70_0<=OP_TILDA)||(LA70_0>=ID && LA70_0<=OP_POUND)||LA70_0==NUMBER||LA70_0==SQ_BRACKET_L||LA70_0==PAR_L) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainThis1973);
                    args212=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args212.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainThis1976);
            parR213=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR213.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, ctorChainThis_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChainThis"

    public static class ctorChainSuper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChainSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:325:1: ctorChainSuper : KW_SUPER ( DOT id )? parL ( args )? parR ;
    public final FanParser.ctorChainSuper_return ctorChainSuper() throws RecognitionException {
        FanParser.ctorChainSuper_return retval = new FanParser.ctorChainSuper_return();
        retval.start = input.LT(1);
        int ctorChainSuper_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SUPER214=null;
        Token DOT215=null;
        FanParser.id_return id216 = null;

        FanParser.parL_return parL217 = null;

        FanParser.args_return args218 = null;

        FanParser.parR_return parR219 = null;


        Object KW_SUPER214_tree=null;
        Object DOT215_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:16: ( KW_SUPER ( DOT id )? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:18: KW_SUPER ( DOT id )? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_SUPER214=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_ctorChainSuper1983); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SUPER214_tree = (Object)adaptor.create(KW_SUPER214);
            adaptor.addChild(root_0, KW_SUPER214_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:27: ( DOT id )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==DOT) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:325:28: DOT id
                    {
                    DOT215=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainSuper1986); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT215_tree = (Object)adaptor.create(DOT215);
                    adaptor.addChild(root_0, DOT215_tree);
                    }
                    pushFollow(FOLLOW_id_in_ctorChainSuper1988);
                    id216=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id216.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parL_in_ctorChainSuper1992);
            parL217=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL217.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:42: ( args )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=KW_THIS && LA72_0<=KW_SUPER)||(LA72_0>=KW_NULL && LA72_0<=KW_FALSE)||LA72_0==SP_PIPE||LA72_0==OP_CURRY||(LA72_0>=OP_PLUS && LA72_0<=OP_MULTI)||(LA72_0>=OP_BANG && LA72_0<=OP_TILDA)||(LA72_0>=ID && LA72_0<=OP_POUND)||LA72_0==NUMBER||LA72_0==SQ_BRACKET_L||LA72_0==PAR_L) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainSuper1994);
                    args218=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args218.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainSuper1997);
            parR219=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR219.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, ctorChainSuper_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChainSuper"

    public static class staticBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:327:1: staticBlock : KW_STATIC block ;
    public final FanParser.staticBlock_return staticBlock() throws RecognitionException {
        FanParser.staticBlock_return retval = new FanParser.staticBlock_return();
        retval.start = input.LT(1);
        int staticBlock_StartIndex = input.index();
        Object root_0 = null;

        Token KW_STATIC220=null;
        FanParser.block_return block221 = null;


        Object KW_STATIC220_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:13: ( KW_STATIC block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:15: KW_STATIC block
            {
            root_0 = (Object)adaptor.nil();

            KW_STATIC220=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_staticBlock2005); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_STATIC220_tree = (Object)adaptor.create(KW_STATIC220);
            adaptor.addChild(root_0, KW_STATIC220_tree);
            }
            pushFollow(FOLLOW_block_in_staticBlock2007);
            block221=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block221.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, staticBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticBlock"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // src/net/colar/netbeans/fan/antlr/Fan.g:328:1: block : ( ( bracketL )=> multiStmt | stmt ) ;
    public final FanParser.block_return block() throws RecognitionException {
        FanParser.block_return retval = new FanParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt222 = null;

        FanParser.stmt_return stmt223 = null;



        paraphrase.push("Block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:329:3: ( ( ( bracketL )=> multiStmt | stmt ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:329:5: ( ( bracketL )=> multiStmt | stmt )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:329:5: ( ( bracketL )=> multiStmt | stmt )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==BRACKET_L) && (synpred108_Fan())) {
                alt73=1;
            }
            else if ( ((LA73_0>=KW_BREAK && LA73_0<=KW_TRY)||(LA73_0>=KW_THIS && LA73_0<=KW_SUPER)||(LA73_0>=KW_NULL && LA73_0<=KW_FALSE)||LA73_0==SP_PIPE||LA73_0==OP_CURRY||(LA73_0>=OP_PLUS && LA73_0<=OP_MULTI)||(LA73_0>=OP_BANG && LA73_0<=OP_TILDA)||(LA73_0>=ID && LA73_0<=OP_POUND)||LA73_0==NUMBER||LA73_0==SQ_BRACKET_L||LA73_0==PAR_L) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:329:6: ( bracketL )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_block2032);
                    multiStmt222=multiStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt222.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:329:30: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_block2036);
                    stmt223=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt223.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class multiStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:330:1: multiStmt : bracketL s= ( ( stmt )* ) bracketR -> ^( AST_CODE_BLOCK bracketL ( $s)? bracketR ) ;
    public final FanParser.multiStmt_return multiStmt() throws RecognitionException {
        FanParser.multiStmt_return retval = new FanParser.multiStmt_return();
        retval.start = input.LT(1);
        int multiStmt_StartIndex = input.index();
        Object root_0 = null;

        Token s=null;
        FanParser.bracketL_return bracketL224 = null;

        FanParser.stmt_return stmt225 = null;

        FanParser.bracketR_return bracketR226 = null;


        Object s_tree=null;
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:11: ( bracketL s= ( ( stmt )* ) bracketR -> ^( AST_CODE_BLOCK bracketL ( $s)? bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:13: bracketL s= ( ( stmt )* ) bracketR
            {
            pushFollow(FOLLOW_bracketL_in_multiStmt2044);
            bracketL224=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL224.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:24: ( ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:25: ( stmt )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:25: ( stmt )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=KW_BREAK && LA74_0<=KW_TRY)||(LA74_0>=KW_THIS && LA74_0<=KW_SUPER)||(LA74_0>=KW_NULL && LA74_0<=KW_FALSE)||LA74_0==SP_PIPE||LA74_0==OP_CURRY||(LA74_0>=OP_PLUS && LA74_0<=OP_MULTI)||(LA74_0>=OP_BANG && LA74_0<=OP_TILDA)||(LA74_0>=ID && LA74_0<=OP_POUND)||LA74_0==NUMBER||LA74_0==SQ_BRACKET_L||LA74_0==PAR_L) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_multiStmt2049);
            	    stmt225=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt225.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }

            pushFollow(FOLLOW_bracketR_in_multiStmt2053);
            bracketR226=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR226.getTree());


            // AST REWRITE
            // elements: bracketR, bracketL, s
            // token labels: s
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 330:41: -> ^( AST_CODE_BLOCK bracketL ( $s)? bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:330:44: ^( AST_CODE_BLOCK bracketL ( $s)? bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:330:70: ( $s)?
                if ( stream_s.hasNext() ) {
                    adaptor.addChild(root_1, stream_s.nextNode());

                }
                stream_s.reset();
                adaptor.addChild(root_1, stream_bracketR.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, multiStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiStmt"

    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:331:1: stmt : ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) ;
    public final FanParser.stmt_return stmt() throws RecognitionException {
        FanParser.stmt_return retval = new FanParser.stmt_return();
        retval.start = input.LT(1);
        int stmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.g_if_return g_if227 = null;

        FanParser.g_for_return g_for228 = null;

        FanParser.g_while_return g_while229 = null;

        FanParser.g_break_return g_break230 = null;

        FanParser.g_continue_return g_continue231 = null;

        FanParser.g_return_return g_return232 = null;

        FanParser.g_switch_return g_switch233 = null;

        FanParser.g_throw_return g_throw234 = null;

        FanParser.g_try_return g_try235 = null;

        FanParser.exprStmt_return exprStmt236 = null;

        FanParser.localDef_return localDef237 = null;



        paraphrase.push("Statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:3: ( ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:333:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            int alt75=11;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:333:6: g_if
                    {
                    pushFollow(FOLLOW_g_if_in_stmt2086);
                    g_if227=g_if();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_if227.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:333:13: g_for
                    {
                    pushFollow(FOLLOW_g_for_in_stmt2090);
                    g_for228=g_for();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_for228.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:333:21: g_while
                    {
                    pushFollow(FOLLOW_g_while_in_stmt2094);
                    g_while229=g_while();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_while229.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:333:31: g_break
                    {
                    pushFollow(FOLLOW_g_break_in_stmt2098);
                    g_break230=g_break();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_break230.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:334:4: g_continue
                    {
                    pushFollow(FOLLOW_g_continue_in_stmt2105);
                    g_continue231=g_continue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_continue231.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:334:17: g_return
                    {
                    pushFollow(FOLLOW_g_return_in_stmt2109);
                    g_return232=g_return();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_return232.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:334:28: g_switch
                    {
                    pushFollow(FOLLOW_g_switch_in_stmt2113);
                    g_switch233=g_switch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_switch233.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:4: g_throw
                    {
                    pushFollow(FOLLOW_g_throw_in_stmt2120);
                    g_throw234=g_throw();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_throw234.getTree());

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:14: g_try
                    {
                    pushFollow(FOLLOW_g_try_in_stmt2124);
                    g_try235=g_try();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_try235.getTree());

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:22: exprStmt
                    {
                    pushFollow(FOLLOW_exprStmt_in_stmt2128);
                    exprStmt236=exprStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprStmt236.getTree());

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:33: localDef
                    {
                    pushFollow(FOLLOW_localDef_in_stmt2132);
                    localDef237=localDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localDef237.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, stmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmt"

    public static class stmtList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtList"
    // src/net/colar/netbeans/fan/antlr/Fan.g:337:1: stmtList : s= ( ( stmt )* ) -> ^( AST_CODE_BLOCK ( $s)? ) ;
    public final FanParser.stmtList_return stmtList() throws RecognitionException {
        FanParser.stmtList_return retval = new FanParser.stmtList_return();
        retval.start = input.LT(1);
        int stmtList_StartIndex = input.index();
        Object root_0 = null;

        Token s=null;
        FanParser.stmt_return stmt238 = null;


        Object s_tree=null;
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:10: (s= ( ( stmt )* ) -> ^( AST_CODE_BLOCK ( $s)? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:12: s= ( ( stmt )* )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:14: ( ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:15: ( stmt )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:15: ( stmt )*
            loop76:
            do {
                int alt76=2;
                alt76 = dfa76.predict(input);
                switch (alt76) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmtList2145);
            	    stmt238=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt238.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: s
            // token labels: s
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 337:22: -> ^( AST_CODE_BLOCK ( $s)? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:337:25: ^( AST_CODE_BLOCK ( $s)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:337:42: ( $s)?
                if ( stream_s.hasNext() ) {
                    adaptor.addChild(root_1, stream_s.nextNode());

                }
                stream_s.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, stmtList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtList"

    public static class g_break_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_break"
    // src/net/colar/netbeans/fan/antlr/Fan.g:343:1: g_break : KW_BREAK eos ;
    public final FanParser.g_break_return g_break() throws RecognitionException {
        FanParser.g_break_return retval = new FanParser.g_break_return();
        retval.start = input.LT(1);
        int g_break_StartIndex = input.index();
        Object root_0 = null;

        Token KW_BREAK239=null;
        FanParser.eos_return eos240 = null;


        Object KW_BREAK239_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:10: ( KW_BREAK eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:12: KW_BREAK eos
            {
            root_0 = (Object)adaptor.nil();

            KW_BREAK239=(Token)match(input,KW_BREAK,FOLLOW_KW_BREAK_in_g_break2167); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_BREAK239_tree = (Object)adaptor.create(KW_BREAK239);
            adaptor.addChild(root_0, KW_BREAK239_tree);
            }
            pushFollow(FOLLOW_eos_in_g_break2169);
            eos240=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos240.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, g_break_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_break"

    public static class g_continue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_continue"
    // src/net/colar/netbeans/fan/antlr/Fan.g:344:1: g_continue : KW_CONTINUE eos ;
    public final FanParser.g_continue_return g_continue() throws RecognitionException {
        FanParser.g_continue_return retval = new FanParser.g_continue_return();
        retval.start = input.LT(1);
        int g_continue_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CONTINUE241=null;
        FanParser.eos_return eos242 = null;


        Object KW_CONTINUE241_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:344:12: ( KW_CONTINUE eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:344:14: KW_CONTINUE eos
            {
            root_0 = (Object)adaptor.nil();

            KW_CONTINUE241=(Token)match(input,KW_CONTINUE,FOLLOW_KW_CONTINUE_in_g_continue2176); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CONTINUE241_tree = (Object)adaptor.create(KW_CONTINUE241);
            adaptor.addChild(root_0, KW_CONTINUE241_tree);
            }
            pushFollow(FOLLOW_eos_in_g_continue2178);
            eos242=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos242.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, g_continue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_continue"

    public static class g_for_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_for"
    // src/net/colar/netbeans/fan/antlr/Fan.g:345:1: g_for : KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ;
    public final FanParser.g_for_return g_for() throws RecognitionException {
        FanParser.g_for_return retval = new FanParser.g_for_return();
        retval.start = input.LT(1);
        int g_for_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FOR243=null;
        Token SP_SEMI246=null;
        Token SP_SEMI248=null;
        FanParser.parL_return parL244 = null;

        FanParser.forInit_return forInit245 = null;

        FanParser.expr_return expr247 = null;

        FanParser.expr_return expr249 = null;

        FanParser.parR_return parR250 = null;

        FanParser.block_return block251 = null;


        Object KW_FOR243_tree=null;
        Object SP_SEMI246_tree=null;
        Object SP_SEMI248_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:8: ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:10: KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block
            {
            root_0 = (Object)adaptor.nil();

            KW_FOR243=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_g_for2186); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_FOR243_tree = (Object)adaptor.create(KW_FOR243);
            adaptor.addChild(root_0, KW_FOR243_tree);
            }
            pushFollow(FOLLOW_parL_in_g_for2188);
            parL244=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL244.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:22: ( forInit )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=KW_THIS && LA77_0<=KW_SUPER)||(LA77_0>=KW_NULL && LA77_0<=KW_FALSE)||LA77_0==SP_PIPE||LA77_0==OP_CURRY||(LA77_0>=OP_PLUS && LA77_0<=OP_MULTI)||(LA77_0>=OP_BANG && LA77_0<=OP_TILDA)||(LA77_0>=ID && LA77_0<=OP_POUND)||LA77_0==NUMBER||LA77_0==SQ_BRACKET_L||LA77_0==PAR_L) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_g_for2190);
                    forInit245=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit245.getTree());

                    }
                    break;

            }

            SP_SEMI246=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for2193); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_SEMI246_tree = (Object)adaptor.create(SP_SEMI246);
            adaptor.addChild(root_0, SP_SEMI246_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:39: ( expr )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=KW_THIS && LA78_0<=KW_SUPER)||(LA78_0>=KW_NULL && LA78_0<=KW_FALSE)||LA78_0==SP_PIPE||LA78_0==OP_CURRY||(LA78_0>=OP_PLUS && LA78_0<=OP_MULTI)||(LA78_0>=OP_BANG && LA78_0<=OP_TILDA)||(LA78_0>=ID && LA78_0<=OP_POUND)||LA78_0==NUMBER||LA78_0==SQ_BRACKET_L||LA78_0==PAR_L) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for2195);
                    expr247=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr247.getTree());

                    }
                    break;

            }

            SP_SEMI248=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for2198); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_SEMI248_tree = (Object)adaptor.create(SP_SEMI248);
            adaptor.addChild(root_0, SP_SEMI248_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:53: ( expr )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=KW_THIS && LA79_0<=KW_SUPER)||(LA79_0>=KW_NULL && LA79_0<=KW_FALSE)||LA79_0==SP_PIPE||LA79_0==OP_CURRY||(LA79_0>=OP_PLUS && LA79_0<=OP_MULTI)||(LA79_0>=OP_BANG && LA79_0<=OP_TILDA)||(LA79_0>=ID && LA79_0<=OP_POUND)||LA79_0==NUMBER||LA79_0==SQ_BRACKET_L||LA79_0==PAR_L) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for2200);
                    expr249=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr249.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_g_for2203);
            parR250=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR250.getTree());
            pushFollow(FOLLOW_block_in_g_for2206);
            block251=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block251.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, g_for_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_for"

    public static class g_if_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_if"
    // src/net/colar/netbeans/fan/antlr/Fan.g:346:1: g_if : KW_IF parL expr parR block ( KW_ELSE block )? ;
    public final FanParser.g_if_return g_if() throws RecognitionException {
        FanParser.g_if_return retval = new FanParser.g_if_return();
        retval.start = input.LT(1);
        int g_if_StartIndex = input.index();
        Object root_0 = null;

        Token KW_IF252=null;
        Token KW_ELSE257=null;
        FanParser.parL_return parL253 = null;

        FanParser.expr_return expr254 = null;

        FanParser.parR_return parR255 = null;

        FanParser.block_return block256 = null;

        FanParser.block_return block258 = null;


        Object KW_IF252_tree=null;
        Object KW_ELSE257_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:346:7: ( KW_IF parL expr parR block ( KW_ELSE block )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:346:9: KW_IF parL expr parR block ( KW_ELSE block )?
            {
            root_0 = (Object)adaptor.nil();

            KW_IF252=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_g_if2214); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_IF252_tree = (Object)adaptor.create(KW_IF252);
            adaptor.addChild(root_0, KW_IF252_tree);
            }
            pushFollow(FOLLOW_parL_in_g_if2216);
            parL253=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL253.getTree());
            pushFollow(FOLLOW_expr_in_g_if2218);
            expr254=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr254.getTree());
            pushFollow(FOLLOW_parR_in_g_if2220);
            parR255=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR255.getTree());
            pushFollow(FOLLOW_block_in_g_if2222);
            block256=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block256.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:347:5: ( KW_ELSE block )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==KW_ELSE) ) {
                int LA80_1 = input.LA(2);

                if ( (synpred124_Fan()) ) {
                    alt80=1;
                }
            }
            switch (alt80) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:347:6: KW_ELSE block
                    {
                    KW_ELSE257=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_g_if2229); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ELSE257_tree = (Object)adaptor.create(KW_ELSE257);
                    adaptor.addChild(root_0, KW_ELSE257_tree);
                    }
                    pushFollow(FOLLOW_block_in_g_if2231);
                    block258=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block258.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, g_if_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_if"

    public static class g_return_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_return"
    // src/net/colar/netbeans/fan/antlr/Fan.g:348:1: g_return : KW_RETURN ( eos | expr eos ) ;
    public final FanParser.g_return_return g_return() throws RecognitionException {
        FanParser.g_return_return retval = new FanParser.g_return_return();
        retval.start = input.LT(1);
        int g_return_StartIndex = input.index();
        Object root_0 = null;

        Token KW_RETURN259=null;
        FanParser.eos_return eos260 = null;

        FanParser.expr_return expr261 = null;

        FanParser.eos_return eos262 = null;


        Object KW_RETURN259_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:10: ( KW_RETURN ( eos | expr eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:12: KW_RETURN ( eos | expr eos )
            {
            root_0 = (Object)adaptor.nil();

            KW_RETURN259=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_g_return2240); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_RETURN259_tree = (Object)adaptor.create(KW_RETURN259);
            adaptor.addChild(root_0, KW_RETURN259_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:22: ( eos | expr eos )
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:23: eos
                    {
                    pushFollow(FOLLOW_eos_in_g_return2243);
                    eos260=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos260.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:29: expr eos
                    {
                    pushFollow(FOLLOW_expr_in_g_return2247);
                    expr261=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr261.getTree());
                    pushFollow(FOLLOW_eos_in_g_return2249);
                    eos262=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos262.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, g_return_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_return"

    public static class g_switch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_switch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:349:1: g_switch : KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR ;
    public final FanParser.g_switch_return g_switch() throws RecognitionException {
        FanParser.g_switch_return retval = new FanParser.g_switch_return();
        retval.start = input.LT(1);
        int g_switch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SWITCH263=null;
        FanParser.parL_return parL264 = null;

        FanParser.expr_return expr265 = null;

        FanParser.parR_return parR266 = null;

        FanParser.bracketL_return bracketL267 = null;

        FanParser.g_case_return g_case268 = null;

        FanParser.g_default_return g_default269 = null;

        FanParser.bracketR_return bracketR270 = null;


        Object KW_SWITCH263_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:10: ( KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:12: KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR
            {
            root_0 = (Object)adaptor.nil();

            KW_SWITCH263=(Token)match(input,KW_SWITCH,FOLLOW_KW_SWITCH_in_g_switch2257); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SWITCH263_tree = (Object)adaptor.create(KW_SWITCH263);
            adaptor.addChild(root_0, KW_SWITCH263_tree);
            }
            pushFollow(FOLLOW_parL_in_g_switch2259);
            parL264=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL264.getTree());
            pushFollow(FOLLOW_expr_in_g_switch2261);
            expr265=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr265.getTree());
            pushFollow(FOLLOW_parR_in_g_switch2263);
            parR266=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR266.getTree());
            pushFollow(FOLLOW_bracketL_in_g_switch2265);
            bracketL267=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL267.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:46: ( g_case )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==KW_CASE) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:349:47: g_case
            	    {
            	    pushFollow(FOLLOW_g_case_in_g_switch2268);
            	    g_case268=g_case();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_case268.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:349:56: ( g_default )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==KW_DEFAULT) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:349:57: g_default
                    {
                    pushFollow(FOLLOW_g_default_in_g_switch2273);
                    g_default269=g_default();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_default269.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_bracketR_in_g_switch2277);
            bracketR270=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR270.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, g_switch_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_switch"

    public static class g_throw_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_throw"
    // src/net/colar/netbeans/fan/antlr/Fan.g:350:1: g_throw : KW_THROW expr eos ;
    public final FanParser.g_throw_return g_throw() throws RecognitionException {
        FanParser.g_throw_return retval = new FanParser.g_throw_return();
        retval.start = input.LT(1);
        int g_throw_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THROW271=null;
        FanParser.expr_return expr272 = null;

        FanParser.eos_return eos273 = null;


        Object KW_THROW271_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:350:10: ( KW_THROW expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:350:12: KW_THROW expr eos
            {
            root_0 = (Object)adaptor.nil();

            KW_THROW271=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_g_throw2285); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THROW271_tree = (Object)adaptor.create(KW_THROW271);
            adaptor.addChild(root_0, KW_THROW271_tree);
            }
            pushFollow(FOLLOW_expr_in_g_throw2287);
            expr272=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr272.getTree());
            pushFollow(FOLLOW_eos_in_g_throw2289);
            eos273=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos273.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, g_throw_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_throw"

    public static class g_while_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_while"
    // src/net/colar/netbeans/fan/antlr/Fan.g:351:1: g_while : KW_WHILE parL expr parR block ;
    public final FanParser.g_while_return g_while() throws RecognitionException {
        FanParser.g_while_return retval = new FanParser.g_while_return();
        retval.start = input.LT(1);
        int g_while_StartIndex = input.index();
        Object root_0 = null;

        Token KW_WHILE274=null;
        FanParser.parL_return parL275 = null;

        FanParser.expr_return expr276 = null;

        FanParser.parR_return parR277 = null;

        FanParser.block_return block278 = null;


        Object KW_WHILE274_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:10: ( KW_WHILE parL expr parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:12: KW_WHILE parL expr parR block
            {
            root_0 = (Object)adaptor.nil();

            KW_WHILE274=(Token)match(input,KW_WHILE,FOLLOW_KW_WHILE_in_g_while2297); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_WHILE274_tree = (Object)adaptor.create(KW_WHILE274);
            adaptor.addChild(root_0, KW_WHILE274_tree);
            }
            pushFollow(FOLLOW_parL_in_g_while2299);
            parL275=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL275.getTree());
            pushFollow(FOLLOW_expr_in_g_while2301);
            expr276=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr276.getTree());
            pushFollow(FOLLOW_parR_in_g_while2303);
            parR277=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR277.getTree());
            pushFollow(FOLLOW_block_in_g_while2305);
            block278=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block278.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, g_while_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_while"

    public static class g_try_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_try"
    // src/net/colar/netbeans/fan/antlr/Fan.g:352:1: g_try : KW_TRY ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? ;
    public final FanParser.g_try_return g_try() throws RecognitionException {
        FanParser.g_try_return retval = new FanParser.g_try_return();
        retval.start = input.LT(1);
        int g_try_StartIndex = input.index();
        Object root_0 = null;

        Token KW_TRY279=null;
        FanParser.try_long_return try_long280 = null;

        FanParser.stmtList_return stmtList281 = null;

        FanParser.g_catch_return g_catch282 = null;

        FanParser.g_finally_return g_finally283 = null;


        Object KW_TRY279_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:352:8: ( KW_TRY ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:352:10: KW_TRY ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )?
            {
            root_0 = (Object)adaptor.nil();

            KW_TRY279=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_g_try2313); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_TRY279_tree = (Object)adaptor.create(KW_TRY279);
            adaptor.addChild(root_0, KW_TRY279_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:352:17: ( ( bracketL )=> try_long | stmtList )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==BRACKET_L) && (synpred128_Fan())) {
                alt84=1;
            }
            else if ( (LA84_0==EOF||(LA84_0>=KW_BREAK && LA84_0<=KW_FINALLY)||(LA84_0>=KW_RD_ONLY && LA84_0<=KW_FINAL)||(LA84_0>=KW_ABSTRACT && LA84_0<=KW_ELSE)||(LA84_0>=KW_NULL && LA84_0<=KW_FALSE)||LA84_0==BRACKET_R||LA84_0==SP_COMMA||LA84_0==SP_PIPE||LA84_0==SP_SEMI||LA84_0==OP_CURRY||(LA84_0>=OP_PLUS && LA84_0<=OP_MULTI)||(LA84_0>=OP_BANG && LA84_0<=OP_TILDA)||(LA84_0>=ID && LA84_0<=SQ_BRACKET_L)||LA84_0==PAR_L) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:352:18: ( bracketL )=> try_long
                    {
                    pushFollow(FOLLOW_try_long_in_g_try2320);
                    try_long280=try_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_long280.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:352:41: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_try2324);
                    stmtList281=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList281.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:352:51: ( ( KW_CATCH )=> g_catch )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==KW_CATCH) ) {
                    int LA85_2 = input.LA(2);

                    if ( (synpred129_Fan()) ) {
                        alt85=1;
                    }


                }


                switch (alt85) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:352:52: ( KW_CATCH )=> g_catch
            	    {
            	    pushFollow(FOLLOW_g_catch_in_g_try2332);
            	    g_catch282=g_catch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_catch282.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:352:74: ( ( KW_FINALLY )=> g_finally )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==KW_FINALLY) ) {
                int LA86_1 = input.LA(2);

                if ( (synpred130_Fan()) ) {
                    alt86=1;
                }
            }
            switch (alt86) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:352:75: ( KW_FINALLY )=> g_finally
                    {
                    pushFollow(FOLLOW_g_finally_in_g_try2341);
                    g_finally283=g_finally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_finally283.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, g_try_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_try"

    public static class try_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "try_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:353:1: try_long : multiStmt ;
    public final FanParser.try_long_return try_long() throws RecognitionException {
        FanParser.try_long_return retval = new FanParser.try_long_return();
        retval.start = input.LT(1);
        int try_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt284 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:10: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:12: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_try_long2350);
            multiStmt284=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt284.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, try_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "try_long"

    public static class exprStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:354:1: exprStmt : expr eos ;
    public final FanParser.exprStmt_return exprStmt() throws RecognitionException {
        FanParser.exprStmt_return retval = new FanParser.exprStmt_return();
        retval.start = input.LT(1);
        int exprStmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.expr_return expr285 = null;

        FanParser.eos_return eos286 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:10: ( expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:12: expr eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprStmt2357);
            expr285=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr285.getTree());
            pushFollow(FOLLOW_eos_in_exprStmt2359);
            eos286=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos286.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, exprStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprStmt"

    public static class localDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:355:1: localDef : typeId ( AS_INIT_VAL expr )? eos ;
    public final FanParser.localDef_return localDef() throws RecognitionException {
        FanParser.localDef_return retval = new FanParser.localDef_return();
        retval.start = input.LT(1);
        int localDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL288=null;
        FanParser.typeId_return typeId287 = null;

        FanParser.expr_return expr289 = null;

        FanParser.eos_return eos290 = null;


        Object AS_INIT_VAL288_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:10: ( typeId ( AS_INIT_VAL expr )? eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:12: typeId ( AS_INIT_VAL expr )? eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeId_in_localDef2366);
            typeId287=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId287.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:19: ( AS_INIT_VAL expr )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==AS_INIT_VAL) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:355:20: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL288=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_localDef2369); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_INIT_VAL288_tree = (Object)adaptor.create(AS_INIT_VAL288);
                    adaptor.addChild(root_0, AS_INIT_VAL288_tree);
                    }
                    pushFollow(FOLLOW_expr_in_localDef2371);
                    expr289=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr289.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_eos_in_localDef2375);
            eos290=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos290.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, localDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localDef"

    public static class forInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInit"
    // src/net/colar/netbeans/fan/antlr/Fan.g:356:1: forInit : ( forInitDef | expr );
    public final FanParser.forInit_return forInit() throws RecognitionException {
        FanParser.forInit_return retval = new FanParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        Object root_0 = null;

        FanParser.forInitDef_return forInitDef291 = null;

        FanParser.expr_return expr292 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:10: ( forInitDef | expr )
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:356:12: forInitDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forInitDef_in_forInit2383);
                    forInitDef291=forInitDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInitDef291.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:356:25: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_forInit2387);
                    expr292=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr292.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, forInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class forInitDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInitDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:357:1: forInitDef : typeId ( AS_INIT_VAL expr )? ;
    public final FanParser.forInitDef_return forInitDef() throws RecognitionException {
        FanParser.forInitDef_return retval = new FanParser.forInitDef_return();
        retval.start = input.LT(1);
        int forInitDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL294=null;
        FanParser.typeId_return typeId293 = null;

        FanParser.expr_return expr295 = null;


        Object AS_INIT_VAL294_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:357:12: ( typeId ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:357:14: typeId ( AS_INIT_VAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeId_in_forInitDef2394);
            typeId293=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId293.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:357:21: ( AS_INIT_VAL expr )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==AS_INIT_VAL) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:357:22: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL294=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_forInitDef2397); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_INIT_VAL294_tree = (Object)adaptor.create(AS_INIT_VAL294);
                    adaptor.addChild(root_0, AS_INIT_VAL294_tree);
                    }
                    pushFollow(FOLLOW_expr_in_forInitDef2399);
                    expr295=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr295.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, forInitDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInitDef"

    public static class g_catch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_catch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:359:1: g_catch : KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | stmtList ) ;
    public final FanParser.g_catch_return g_catch() throws RecognitionException {
        FanParser.g_catch_return retval = new FanParser.g_catch_return();
        retval.start = input.LT(1);
        int g_catch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CATCH296=null;
        FanParser.catchDef_return catchDef297 = null;

        FanParser.catch_long_return catch_long298 = null;

        FanParser.stmtList_return stmtList299 = null;


        Object KW_CATCH296_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:10: ( KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | stmtList ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:12: KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | stmtList )
            {
            root_0 = (Object)adaptor.nil();

            KW_CATCH296=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_g_catch2410); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CATCH296_tree = (Object)adaptor.create(KW_CATCH296);
            adaptor.addChild(root_0, KW_CATCH296_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:21: ( catchDef )?
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: catchDef
                    {
                    pushFollow(FOLLOW_catchDef_in_g_catch2412);
                    catchDef297=catchDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchDef297.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:359:31: ( ( bracketL )=> catch_long | stmtList )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==BRACKET_L) && (synpred135_Fan())) {
                alt91=1;
            }
            else if ( (LA91_0==EOF||(LA91_0>=KW_BREAK && LA91_0<=KW_FINALLY)||(LA91_0>=KW_RD_ONLY && LA91_0<=KW_FINAL)||(LA91_0>=KW_ABSTRACT && LA91_0<=KW_ELSE)||(LA91_0>=KW_NULL && LA91_0<=KW_FALSE)||LA91_0==BRACKET_R||LA91_0==SP_COMMA||LA91_0==SP_PIPE||LA91_0==SP_SEMI||LA91_0==OP_CURRY||(LA91_0>=OP_PLUS && LA91_0<=OP_MULTI)||(LA91_0>=OP_BANG && LA91_0<=OP_TILDA)||(LA91_0>=ID && LA91_0<=SQ_BRACKET_L)||LA91_0==PAR_L) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:359:32: ( bracketL )=> catch_long
                    {
                    pushFollow(FOLLOW_catch_long_in_g_catch2420);
                    catch_long298=catch_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catch_long298.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:359:57: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_catch2424);
                    stmtList299=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList299.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, g_catch_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_catch"

    public static class catch_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catch_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:360:1: catch_long : multiStmt ;
    public final FanParser.catch_long_return catch_long() throws RecognitionException {
        FanParser.catch_long_return retval = new FanParser.catch_long_return();
        retval.start = input.LT(1);
        int catch_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt300 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:360:12: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:360:14: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_catch_long2432);
            multiStmt300=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt300.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, catch_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catch_long"

    public static class catchDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:361:1: catchDef : parL type id parR ;
    public final FanParser.catchDef_return catchDef() throws RecognitionException {
        FanParser.catchDef_return retval = new FanParser.catchDef_return();
        retval.start = input.LT(1);
        int catchDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL301 = null;

        FanParser.type_return type302 = null;

        FanParser.id_return id303 = null;

        FanParser.parR_return parR304 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:11: ( parL type id parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:13: parL type id parR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parL_in_catchDef2440);
            parL301=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL301.getTree());
            pushFollow(FOLLOW_type_in_catchDef2442);
            type302=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type302.getTree());
            pushFollow(FOLLOW_id_in_catchDef2444);
            id303=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id303.getTree());
            pushFollow(FOLLOW_parR_in_catchDef2446);
            parR304=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR304.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, catchDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchDef"

    public static class g_finally_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_finally"
    // src/net/colar/netbeans/fan/antlr/Fan.g:363:1: g_finally : KW_FINALLY ( ( bracketL )=> finally_long | stmtList ) ;
    public final FanParser.g_finally_return g_finally() throws RecognitionException {
        FanParser.g_finally_return retval = new FanParser.g_finally_return();
        retval.start = input.LT(1);
        int g_finally_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FINALLY305=null;
        FanParser.finally_long_return finally_long306 = null;

        FanParser.stmtList_return stmtList307 = null;


        Object KW_FINALLY305_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:11: ( KW_FINALLY ( ( bracketL )=> finally_long | stmtList ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:13: KW_FINALLY ( ( bracketL )=> finally_long | stmtList )
            {
            root_0 = (Object)adaptor.nil();

            KW_FINALLY305=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_g_finally2454); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_FINALLY305_tree = (Object)adaptor.create(KW_FINALLY305);
            adaptor.addChild(root_0, KW_FINALLY305_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:24: ( ( bracketL )=> finally_long | stmtList )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==BRACKET_L) && (synpred136_Fan())) {
                alt92=1;
            }
            else if ( (LA92_0==EOF||(LA92_0>=KW_BREAK && LA92_0<=KW_FINALLY)||(LA92_0>=KW_RD_ONLY && LA92_0<=KW_FINAL)||(LA92_0>=KW_ABSTRACT && LA92_0<=KW_ELSE)||(LA92_0>=KW_NULL && LA92_0<=KW_FALSE)||LA92_0==BRACKET_R||LA92_0==SP_COMMA||LA92_0==SP_PIPE||LA92_0==SP_SEMI||LA92_0==OP_CURRY||(LA92_0>=OP_PLUS && LA92_0<=OP_MULTI)||(LA92_0>=OP_BANG && LA92_0<=OP_TILDA)||(LA92_0>=ID && LA92_0<=SQ_BRACKET_L)||LA92_0==PAR_L) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:363:25: ( bracketL )=> finally_long
                    {
                    pushFollow(FOLLOW_finally_long_in_g_finally2461);
                    finally_long306=finally_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, finally_long306.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:363:52: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_finally2465);
                    stmtList307=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList307.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, g_finally_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_finally"

    public static class finally_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "finally_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:364:1: finally_long : multiStmt ;
    public final FanParser.finally_long_return finally_long() throws RecognitionException {
        FanParser.finally_long_return retval = new FanParser.finally_long_return();
        retval.start = input.LT(1);
        int finally_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt308 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:14: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:16: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_finally_long2473);
            multiStmt308=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt308.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, finally_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "finally_long"

    public static class g_case_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_case"
    // src/net/colar/netbeans/fan/antlr/Fan.g:365:1: g_case : KW_CASE expr SP_COLON ( stmt )* ;
    public final FanParser.g_case_return g_case() throws RecognitionException {
        FanParser.g_case_return retval = new FanParser.g_case_return();
        retval.start = input.LT(1);
        int g_case_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CASE309=null;
        Token SP_COLON311=null;
        FanParser.expr_return expr310 = null;

        FanParser.stmt_return stmt312 = null;


        Object KW_CASE309_tree=null;
        Object SP_COLON311_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:365:9: ( KW_CASE expr SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:365:11: KW_CASE expr SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_CASE309=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_g_case2481); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CASE309_tree = (Object)adaptor.create(KW_CASE309);
            adaptor.addChild(root_0, KW_CASE309_tree);
            }
            pushFollow(FOLLOW_expr_in_g_case2483);
            expr310=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr310.getTree());
            SP_COLON311=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_case2485); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON311_tree = (Object)adaptor.create(SP_COLON311);
            adaptor.addChild(root_0, SP_COLON311_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:365:33: ( stmt )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( ((LA93_0>=KW_BREAK && LA93_0<=KW_TRY)||(LA93_0>=KW_THIS && LA93_0<=KW_SUPER)||(LA93_0>=KW_NULL && LA93_0<=KW_FALSE)||LA93_0==SP_PIPE||LA93_0==OP_CURRY||(LA93_0>=OP_PLUS && LA93_0<=OP_MULTI)||(LA93_0>=OP_BANG && LA93_0<=OP_TILDA)||(LA93_0>=ID && LA93_0<=OP_POUND)||LA93_0==NUMBER||LA93_0==SQ_BRACKET_L||LA93_0==PAR_L) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_case2487);
            	    stmt312=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt312.getTree());

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, g_case_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_case"

    public static class g_default_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_default"
    // src/net/colar/netbeans/fan/antlr/Fan.g:366:1: g_default : KW_DEFAULT SP_COLON ( stmt )* ;
    public final FanParser.g_default_return g_default() throws RecognitionException {
        FanParser.g_default_return retval = new FanParser.g_default_return();
        retval.start = input.LT(1);
        int g_default_StartIndex = input.index();
        Object root_0 = null;

        Token KW_DEFAULT313=null;
        Token SP_COLON314=null;
        FanParser.stmt_return stmt315 = null;


        Object KW_DEFAULT313_tree=null;
        Object SP_COLON314_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:11: ( KW_DEFAULT SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:13: KW_DEFAULT SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_DEFAULT313=(Token)match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_g_default2495); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_DEFAULT313_tree = (Object)adaptor.create(KW_DEFAULT313);
            adaptor.addChild(root_0, KW_DEFAULT313_tree);
            }
            SP_COLON314=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_default2497); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON314_tree = (Object)adaptor.create(SP_COLON314);
            adaptor.addChild(root_0, SP_COLON314_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:33: ( stmt )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( ((LA94_0>=KW_BREAK && LA94_0<=KW_TRY)||(LA94_0>=KW_THIS && LA94_0<=KW_SUPER)||(LA94_0>=KW_NULL && LA94_0<=KW_FALSE)||LA94_0==SP_PIPE||LA94_0==OP_CURRY||(LA94_0>=OP_PLUS && LA94_0<=OP_MULTI)||(LA94_0>=OP_BANG && LA94_0<=OP_TILDA)||(LA94_0>=ID && LA94_0<=OP_POUND)||LA94_0==NUMBER||LA94_0==SQ_BRACKET_L||LA94_0==PAR_L) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_default2499);
            	    stmt315=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt315.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, g_default_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_default"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:369:1: expr : assignExpr ;
    public final FanParser.expr_return expr() throws RecognitionException {
        FanParser.expr_return retval = new FanParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.assignExpr_return assignExpr316 = null;



        paraphrase.push("Expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:3: ( assignExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:5: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr2520);
            assignExpr316=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr316.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class assignExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:372:1: assignExpr : ternaryExpr ( assignOp assignExpr )? ;
    public final FanParser.assignExpr_return assignExpr() throws RecognitionException {
        FanParser.assignExpr_return retval = new FanParser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.ternaryExpr_return ternaryExpr317 = null;

        FanParser.assignOp_return assignOp318 = null;

        FanParser.assignExpr_return assignExpr319 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:12: ( ternaryExpr ( assignOp assignExpr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:14: ternaryExpr ( assignOp assignExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2527);
            ternaryExpr317=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr317.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:26: ( assignOp assignExpr )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( ((LA95_0>=AS_EQUAL && LA95_0<=AS_ASSIGN_OP)) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:372:27: assignOp assignExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2530);
                    assignOp318=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp318.getTree());
                    pushFollow(FOLLOW_assignExpr_in_assignExpr2532);
                    assignExpr319=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr319.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, assignExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExpr"

    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:373:1: ternaryExpr : condOrExpr ( ternaryTail )? ;
    public final FanParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        FanParser.ternaryExpr_return retval = new FanParser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.condOrExpr_return condOrExpr320 = null;

        FanParser.ternaryTail_return ternaryTail321 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:13: ( condOrExpr ( ternaryTail )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:15: condOrExpr ( ternaryTail )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condOrExpr_in_ternaryExpr2541);
            condOrExpr320=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr320.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:26: ( ternaryTail )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==SP_QMARK) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:373:27: ternaryTail
                    {
                    pushFollow(FOLLOW_ternaryTail_in_ternaryExpr2544);
                    ternaryTail321=ternaryTail();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryTail321.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, ternaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"

    public static class ternaryTail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryTail"
    // src/net/colar/netbeans/fan/antlr/Fan.g:375:1: ternaryTail : SP_QMARK condOrExpr SP_COLON condOrExpr ;
    public final FanParser.ternaryTail_return ternaryTail() throws RecognitionException {
        FanParser.ternaryTail_return retval = new FanParser.ternaryTail_return();
        retval.start = input.LT(1);
        int ternaryTail_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK322=null;
        Token SP_COLON324=null;
        FanParser.condOrExpr_return condOrExpr323 = null;

        FanParser.condOrExpr_return condOrExpr325 = null;


        Object SP_QMARK322_tree=null;
        Object SP_COLON324_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:375:13: ( SP_QMARK condOrExpr SP_COLON condOrExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:375:15: SP_QMARK condOrExpr SP_COLON condOrExpr
            {
            root_0 = (Object)adaptor.nil();

            SP_QMARK322=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_ternaryTail2554); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_QMARK322_tree = (Object)adaptor.create(SP_QMARK322);
            adaptor.addChild(root_0, SP_QMARK322_tree);
            }
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail2556);
            condOrExpr323=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr323.getTree());
            SP_COLON324=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ternaryTail2558); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON324_tree = (Object)adaptor.create(SP_COLON324);
            adaptor.addChild(root_0, SP_COLON324_tree);
            }
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail2560);
            condOrExpr325=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr325.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, ternaryTail_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryTail"

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:376:1: assignOp : ( AS_EQUAL | AS_ASSIGN_OP );
    public final FanParser.assignOp_return assignOp() throws RecognitionException {
        FanParser.assignOp_return retval = new FanParser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token set326=null;

        Object set326_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:10: ( AS_EQUAL | AS_ASSIGN_OP )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            root_0 = (Object)adaptor.nil();

            set326=(Token)input.LT(1);
            if ( (input.LA(1)>=AS_EQUAL && input.LA(1)<=AS_ASSIGN_OP) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set326));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, assignOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignOp"

    public static class condOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:377:1: condOrExpr : condAndExpr ( OP_OR condAndExpr )* ;
    public final FanParser.condOrExpr_return condOrExpr() throws RecognitionException {
        FanParser.condOrExpr_return retval = new FanParser.condOrExpr_return();
        retval.start = input.LT(1);
        int condOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_OR328=null;
        FanParser.condAndExpr_return condAndExpr327 = null;

        FanParser.condAndExpr_return condAndExpr329 = null;


        Object OP_OR328_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:13: ( condAndExpr ( OP_OR condAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:15: condAndExpr ( OP_OR condAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condAndExpr_in_condOrExpr2579);
            condAndExpr327=condAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr327.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:28: ( OP_OR condAndExpr )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==OP_OR) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:377:29: OP_OR condAndExpr
            	    {
            	    OP_OR328=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_condOrExpr2583); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_OR328_tree = (Object)adaptor.create(OP_OR328);
            	    adaptor.addChild(root_0, OP_OR328_tree);
            	    }
            	    pushFollow(FOLLOW_condAndExpr_in_condOrExpr2586);
            	    condAndExpr329=condAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr329.getTree());

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, condOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condOrExpr"

    public static class condAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:378:1: condAndExpr : equalityExpr ( OP_AND equalityExpr )* ;
    public final FanParser.condAndExpr_return condAndExpr() throws RecognitionException {
        FanParser.condAndExpr_return retval = new FanParser.condAndExpr_return();
        retval.start = input.LT(1);
        int condAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_AND331=null;
        FanParser.equalityExpr_return equalityExpr330 = null;

        FanParser.equalityExpr_return equalityExpr332 = null;


        Object OP_AND331_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:14: ( equalityExpr ( OP_AND equalityExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:16: equalityExpr ( OP_AND equalityExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpr_in_condAndExpr2596);
            equalityExpr330=equalityExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr330.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:29: ( OP_AND equalityExpr )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==OP_AND) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:378:30: OP_AND equalityExpr
            	    {
            	    OP_AND331=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_condAndExpr2599); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_AND331_tree = (Object)adaptor.create(OP_AND331);
            	    adaptor.addChild(root_0, OP_AND331_tree);
            	    }
            	    pushFollow(FOLLOW_equalityExpr_in_condAndExpr2602);
            	    equalityExpr332=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr332.getTree());

            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, condAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condAndExpr"

    public static class equalityExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:379:1: equalityExpr : relationalExpr ( CP_EQUALITY relationalExpr )* ;
    public final FanParser.equalityExpr_return equalityExpr() throws RecognitionException {
        FanParser.equalityExpr_return retval = new FanParser.equalityExpr_return();
        retval.start = input.LT(1);
        int equalityExpr_StartIndex = input.index();
        Object root_0 = null;

        Token CP_EQUALITY334=null;
        FanParser.relationalExpr_return relationalExpr333 = null;

        FanParser.relationalExpr_return relationalExpr335 = null;


        Object CP_EQUALITY334_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:14: ( relationalExpr ( CP_EQUALITY relationalExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:16: relationalExpr ( CP_EQUALITY relationalExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpr_in_equalityExpr2612);
            relationalExpr333=relationalExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr333.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:31: ( CP_EQUALITY relationalExpr )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==CP_EQUALITY) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:379:32: CP_EQUALITY relationalExpr
            	    {
            	    CP_EQUALITY334=(Token)match(input,CP_EQUALITY,FOLLOW_CP_EQUALITY_in_equalityExpr2615); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_EQUALITY334_tree = (Object)adaptor.create(CP_EQUALITY334);
            	    adaptor.addChild(root_0, CP_EQUALITY334_tree);
            	    }
            	    pushFollow(FOLLOW_relationalExpr_in_equalityExpr2617);
            	    relationalExpr335=relationalExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr335.getTree());

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, equalityExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpr"

    public static class relationalExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:381:1: relationalExpr : elvisExpr ( typeCheck | compare ) ;
    public final FanParser.relationalExpr_return relationalExpr() throws RecognitionException {
        FanParser.relationalExpr_return retval = new FanParser.relationalExpr_return();
        retval.start = input.LT(1);
        int relationalExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.elvisExpr_return elvisExpr336 = null;

        FanParser.typeCheck_return typeCheck337 = null;

        FanParser.compare_return compare338 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:16: ( elvisExpr ( typeCheck | compare ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:20: elvisExpr ( typeCheck | compare )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_elvisExpr_in_relationalExpr2630);
            elvisExpr336=elvisExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr336.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:30: ( typeCheck | compare )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==KW_AS||(LA100_0>=KW_IS && LA100_0<=KW_ISNOT)) ) {
                alt100=1;
            }
            else if ( (LA100_0==EOF||(LA100_0>=KW_BREAK && LA100_0<=KW_USING)||(LA100_0>=KW_RD_ONLY && LA100_0<=KW_FINAL)||(LA100_0>=KW_CLASS && LA100_0<=KW_ELSE)||(LA100_0>=KW_NULL && LA100_0<=KW_FALSE)||(LA100_0>=BRACKET_L && LA100_0<=BRACKET_R)||(LA100_0>=SP_COLON && LA100_0<=SP_QMARK)||LA100_0==SP_PIPE||(LA100_0>=SP_SEMI && LA100_0<=CP_COMPARATORS)||LA100_0==OP_CURRY||(LA100_0>=OP_PLUS && LA100_0<=OP_MULTI)||(LA100_0>=OP_BANG && LA100_0<=OP_TILDA)||(LA100_0>=ID && LA100_0<=PAR_R)||LA100_0==141) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:31: typeCheck
                    {
                    pushFollow(FOLLOW_typeCheck_in_relationalExpr2633);
                    typeCheck337=typeCheck();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeCheck337.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:43: compare
                    {
                    pushFollow(FOLLOW_compare_in_relationalExpr2637);
                    compare338=compare();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compare338.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, relationalExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpr"

    public static class typeCheck_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeCheck"
    // src/net/colar/netbeans/fan/antlr/Fan.g:383:1: typeCheck : ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* ;
    public final FanParser.typeCheck_return typeCheck() throws RecognitionException {
        FanParser.typeCheck_return retval = new FanParser.typeCheck_return();
        retval.start = input.LT(1);
        int typeCheck_StartIndex = input.index();
        Object root_0 = null;

        Token set339=null;
        Token SP_QMARK341=null;
        Token string_literal342=null;
        FanParser.typeRoot_return typeRoot340 = null;


        Object set339_tree=null;
        Object SP_QMARK341_tree=null;
        Object string_literal342_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:11: ( ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:15: ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )*
            {
            root_0 = (Object)adaptor.nil();

            set339=(Token)input.LT(1);
            if ( input.LA(1)==KW_AS||(input.LA(1)>=KW_IS && input.LA(1)<=KW_ISNOT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set339));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_typeRoot_in_typeCheck2660);
            typeRoot340=typeRoot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeRoot340.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:51: ( ( SP_QMARK )? {...}? '[]' )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==SP_QMARK) ) {
                    int LA102_2 = input.LA(2);

                    if ( (LA102_2==LIST_TYPE) ) {
                        alt102=1;
                    }


                }
                else if ( (LA102_0==LIST_TYPE) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:383:52: ( SP_QMARK )? {...}? '[]'
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:383:52: ( SP_QMARK )?
            	    int alt101=2;
            	    int LA101_0 = input.LA(1);

            	    if ( (LA101_0==SP_QMARK) ) {
            	        alt101=1;
            	    }
            	    switch (alt101) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK341=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_typeCheck2663); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK341_tree = (Object)adaptor.create(SP_QMARK341);
            	            adaptor.addChild(root_0, SP_QMARK341_tree);
            	            }

            	            }
            	            break;

            	    }

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "typeCheck", "notAfterEol()");
            	    }
            	    string_literal342=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_typeCheck2668); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal342_tree = (Object)adaptor.create(string_literal342);
            	    adaptor.addChild(root_0, string_literal342_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, typeCheck_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeCheck"

    public static class compare_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare"
    // src/net/colar/netbeans/fan/antlr/Fan.g:384:1: compare : ( CP_COMPARATORS elvisExpr )* ;
    public final FanParser.compare_return compare() throws RecognitionException {
        FanParser.compare_return retval = new FanParser.compare_return();
        retval.start = input.LT(1);
        int compare_StartIndex = input.index();
        Object root_0 = null;

        Token CP_COMPARATORS343=null;
        FanParser.elvisExpr_return elvisExpr344 = null;


        Object CP_COMPARATORS343_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:10: ( ( CP_COMPARATORS elvisExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:14: ( CP_COMPARATORS elvisExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:384:14: ( CP_COMPARATORS elvisExpr )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==CP_COMPARATORS) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:384:15: CP_COMPARATORS elvisExpr
            	    {
            	    CP_COMPARATORS343=(Token)match(input,CP_COMPARATORS,FOLLOW_CP_COMPARATORS_in_compare2681); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_COMPARATORS343_tree = (Object)adaptor.create(CP_COMPARATORS343);
            	    adaptor.addChild(root_0, CP_COMPARATORS343_tree);
            	    }
            	    pushFollow(FOLLOW_elvisExpr_in_compare2683);
            	    elvisExpr344=elvisExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr344.getTree());

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, compare_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "compare"

    public static class elvisExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elvisExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:386:1: elvisExpr : rangeExpr ( OP_ELVIS rangeExpr )* ;
    public final FanParser.elvisExpr_return elvisExpr() throws RecognitionException {
        FanParser.elvisExpr_return retval = new FanParser.elvisExpr_return();
        retval.start = input.LT(1);
        int elvisExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ELVIS346=null;
        FanParser.rangeExpr_return rangeExpr345 = null;

        FanParser.rangeExpr_return rangeExpr347 = null;


        Object OP_ELVIS346_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:12: ( rangeExpr ( OP_ELVIS rangeExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:14: rangeExpr ( OP_ELVIS rangeExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpr_in_elvisExpr2694);
            rangeExpr345=rangeExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rangeExpr345.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:24: ( OP_ELVIS rangeExpr )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==OP_ELVIS) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:386:25: OP_ELVIS rangeExpr
            	    {
            	    OP_ELVIS346=(Token)match(input,OP_ELVIS,FOLLOW_OP_ELVIS_in_elvisExpr2697); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_ELVIS346_tree = (Object)adaptor.create(OP_ELVIS346);
            	    adaptor.addChild(root_0, OP_ELVIS346_tree);
            	    }
            	    pushFollow(FOLLOW_rangeExpr_in_elvisExpr2699);
            	    rangeExpr347=rangeExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rangeExpr347.getTree());

            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, elvisExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elvisExpr"

    public static class rangeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rangeExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:387:1: rangeExpr : bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* ;
    public final FanParser.rangeExpr_return rangeExpr() throws RecognitionException {
        FanParser.rangeExpr_return retval = new FanParser.rangeExpr_return();
        retval.start = input.LT(1);
        int rangeExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set349=null;
        FanParser.bitOrExpr_return bitOrExpr348 = null;

        FanParser.bitOrExpr_return bitOrExpr350 = null;


        Object set349_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:12: ( bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:14: bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2710);
            bitOrExpr348=bitOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitOrExpr348.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:24: ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( ((LA105_0>=OP_RANG_EXCL_OLD && LA105_0<=OP_RANGE)) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:387:25: ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr
            	    {
            	    set349=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_RANG_EXCL_OLD && input.LA(1)<=OP_RANGE) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set349));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2727);
            	    bitOrExpr350=bitOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitOrExpr350.getTree());

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, rangeExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "rangeExpr"

    public static class bitOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:388:1: bitOrExpr : bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* ;
    public final FanParser.bitOrExpr_return bitOrExpr() throws RecognitionException {
        FanParser.bitOrExpr_return retval = new FanParser.bitOrExpr_return();
        retval.start = input.LT(1);
        int bitOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set352=null;
        FanParser.bitAndExpr_return bitAndExpr351 = null;

        FanParser.bitAndExpr_return bitAndExpr353 = null;


        Object set352_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:388:12: ( bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:388:14: bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2738);
            bitAndExpr351=bitAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitAndExpr351.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:388:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            loop106:
            do {
                int alt106=2;
                alt106 = dfa106.predict(input);
                switch (alt106) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:388:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
            	    {
            	    set352=(Token)input.LT(1);
            	    if ( input.LA(1)==SP_PIPE||input.LA(1)==OP_BITOR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set352));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2749);
            	    bitAndExpr353=bitAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitAndExpr353.getTree());

            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, bitOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitOrExpr"

    public static class bitAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:389:1: bitAndExpr : shiftExpr ( OP_CURRY shiftExpr )* ;
    public final FanParser.bitAndExpr_return bitAndExpr() throws RecognitionException {
        FanParser.bitAndExpr_return retval = new FanParser.bitAndExpr_return();
        retval.start = input.LT(1);
        int bitAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_CURRY355=null;
        FanParser.shiftExpr_return shiftExpr354 = null;

        FanParser.shiftExpr_return shiftExpr356 = null;


        Object OP_CURRY355_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:389:13: ( shiftExpr ( OP_CURRY shiftExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:389:15: shiftExpr ( OP_CURRY shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2760);
            shiftExpr354=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr354.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:389:25: ( OP_CURRY shiftExpr )*
            loop107:
            do {
                int alt107=2;
                alt107 = dfa107.predict(input);
                switch (alt107) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:389:26: OP_CURRY shiftExpr
            	    {
            	    OP_CURRY355=(Token)match(input,OP_CURRY,FOLLOW_OP_CURRY_in_bitAndExpr2763); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_CURRY355_tree = (Object)adaptor.create(OP_CURRY355);
            	    adaptor.addChild(root_0, OP_CURRY355_tree);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2765);
            	    shiftExpr356=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr356.getTree());

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, bitAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitAndExpr"

    public static class shiftExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:390:1: shiftExpr : addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* ;
    public final FanParser.shiftExpr_return shiftExpr() throws RecognitionException {
        FanParser.shiftExpr_return retval = new FanParser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set358=null;
        FanParser.addExpr_return addExpr357 = null;

        FanParser.addExpr_return addExpr359 = null;


        Object set358_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:390:12: ( addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:390:14: addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_shiftExpr2777);
            addExpr357=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr357.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:390:22: ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( ((LA108_0>=OP_LSHIFT && LA108_0<=OP_RSHIFT)) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:390:23: ( OP_LSHIFT | OP_RSHIFT ) addExpr
            	    {
            	    set358=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_LSHIFT && input.LA(1)<=OP_RSHIFT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set358));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2788);
            	    addExpr359=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr359.getTree());

            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 98, shiftExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:391:1: addExpr : multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* ;
    public final FanParser.addExpr_return addExpr() throws RecognitionException {
        FanParser.addExpr_return retval = new FanParser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set361=null;
        FanParser.multExpr_return multExpr360 = null;

        FanParser.multExpr_return multExpr362 = null;


        Object set361_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:10: ( multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:12: multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_addExpr2799);
            multExpr360=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr360.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*
            loop109:
            do {
                int alt109=2;
                alt109 = dfa109.predict(input);
                switch (alt109) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:391:22: ( OP_PLUS | OP_MINUS ) multExpr
            	    {
            	    set361=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set361));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2810);
            	    multExpr362=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr362.getTree());

            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, addExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class addAppend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addAppend"
    // src/net/colar/netbeans/fan/antlr/Fan.g:392:1: addAppend : ( OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.addAppend_return addAppend() throws RecognitionException {
        FanParser.addAppend_return retval = new FanParser.addAppend_return();
        retval.start = input.LT(1);
        int addAppend_StartIndex = input.index();
        Object root_0 = null;

        Token set363=null;
        FanParser.parenExpr_return parenExpr364 = null;


        Object set363_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:11: ( ( OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:13: ( OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set363=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set363));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_addAppend2828);
            parenExpr364=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr364.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, addAppend_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addAppend"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:393:1: multExpr : parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* ;
    public final FanParser.multExpr_return multExpr() throws RecognitionException {
        FanParser.multExpr_return retval = new FanParser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set366=null;
        FanParser.parenExpr_return parenExpr365 = null;

        FanParser.parenExpr_return parenExpr367 = null;


        Object set366_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:11: ( parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:13: parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parenExpr_in_multExpr2836);
            parenExpr365=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr365.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:23: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==OP_MULTI) ) {
                    int LA110_2 = input.LA(2);

                    if ( (LA110_2==ID) ) {
                        int LA110_4 = input.LA(3);

                        if ( (synpred165_Fan()) ) {
                            alt110=1;
                        }


                    }
                    else if ( ((LA110_2>=KW_THIS && LA110_2<=KW_SUPER)||(LA110_2>=KW_NULL && LA110_2<=KW_FALSE)||LA110_2==SP_PIPE||LA110_2==OP_CURRY||(LA110_2>=OP_PLUS && LA110_2<=OP_MULTI)||(LA110_2>=OP_BANG && LA110_2<=OP_TILDA)||(LA110_2>=URI && LA110_2<=OP_POUND)||LA110_2==NUMBER||LA110_2==SQ_BRACKET_L||LA110_2==PAR_L) ) {
                        alt110=1;
                    }


                }
                else if ( ((LA110_0>=OP_DIV && LA110_0<=OP_MOD)) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:393:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
            	    {
            	    set366=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_MULTI && input.LA(1)<=OP_MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set366));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_parenExpr_in_multExpr2851);
            	    parenExpr367=parenExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr367.getTree());

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, multExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class parenExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parenExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:394:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );
    public final FanParser.parenExpr_return parenExpr() throws RecognitionException {
        FanParser.parenExpr_return retval = new FanParser.parenExpr_return();
        retval.start = input.LT(1);
        int parenExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.castExpr_return castExpr368 = null;

        FanParser.groupedExpr_return groupedExpr369 = null;

        FanParser.unaryExpr_return unaryExpr370 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:12: ( castExpr | groupedExpr | unaryExpr )
            int alt111=3;
            alt111 = dfa111.predict(input);
            switch (alt111) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:394:14: castExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_castExpr_in_parenExpr2862);
                    castExpr368=castExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpr368.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:394:25: groupedExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_groupedExpr_in_parenExpr2866);
                    groupedExpr369=groupedExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, groupedExpr369.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:394:39: unaryExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpr_in_parenExpr2870);
                    unaryExpr370=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr370.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 102, parenExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parenExpr"

    public static class castExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "castExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:396:1: castExpr : {...}? parL type parR parenExpr ;
    public final FanParser.castExpr_return castExpr() throws RecognitionException {
        FanParser.castExpr_return retval = new FanParser.castExpr_return();
        retval.start = input.LT(1);
        int castExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL371 = null;

        FanParser.type_return type372 = null;

        FanParser.parR_return parR373 = null;

        FanParser.parenExpr_return parenExpr374 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:11: ({...}? parL type parR parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:13: {...}? parL type parR parenExpr
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "castExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_castExpr2881);
            parL371=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL371.getTree());
            pushFollow(FOLLOW_type_in_castExpr2883);
            type372=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type372.getTree());
            pushFollow(FOLLOW_parR_in_castExpr2885);
            parR373=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR373.getTree());
            pushFollow(FOLLOW_parenExpr_in_castExpr2887);
            parenExpr374=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr374.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, castExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "castExpr"

    public static class groupedExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupedExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:398:1: groupedExpr : parL expr parR ( termChain )* ;
    public final FanParser.groupedExpr_return groupedExpr() throws RecognitionException {
        FanParser.groupedExpr_return retval = new FanParser.groupedExpr_return();
        retval.start = input.LT(1);
        int groupedExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL375 = null;

        FanParser.expr_return expr376 = null;

        FanParser.parR_return parR377 = null;

        FanParser.termChain_return termChain378 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:14: ( parL expr parR ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:16: parL expr parR ( termChain )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parL_in_groupedExpr2896);
            parL375=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL375.getTree());
            pushFollow(FOLLOW_expr_in_groupedExpr2898);
            expr376=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr376.getTree());
            pushFollow(FOLLOW_parR_in_groupedExpr2900);
            parR377=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR377.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:31: ( termChain )*
            loop112:
            do {
                int alt112=2;
                alt112 = dfa112.predict(input);
                switch (alt112) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_groupedExpr2902);
            	    termChain378=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, termChain378.getTree());

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 104, groupedExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "groupedExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:399:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );
    public final FanParser.unaryExpr_return unaryExpr() throws RecognitionException {
        FanParser.unaryExpr_return retval = new FanParser.unaryExpr_return();
        retval.start = input.LT(1);
        int unaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.prefixExpr_return prefixExpr379 = null;

        FanParser.postfixExpr_return postfixExpr380 = null;

        FanParser.termExpr_return termExpr381 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:12: ( prefixExpr | postfixExpr | termExpr )
            int alt113=3;
            alt113 = dfa113.predict(input);
            switch (alt113) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:14: prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prefixExpr_in_unaryExpr2911);
                    prefixExpr379=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr379.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:27: postfixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpr_in_unaryExpr2915);
                    postfixExpr380=postfixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpr380.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:41: termExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_termExpr_in_unaryExpr2919);
                    termExpr381=termExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr381.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, unaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExpr"

    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:400:1: prefixExpr : ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.prefixExpr_return prefixExpr() throws RecognitionException {
        FanParser.prefixExpr_return retval = new FanParser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set382=null;
        FanParser.parenExpr_return parenExpr383 = null;


        Object set382_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:13: ( ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:15: ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set382=(Token)input.LT(1);
            if ( input.LA(1)==OP_CURRY||(input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS)||(input.LA(1)>=OP_BANG && input.LA(1)<=OP_TILDA) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set382));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_prefixExpr2955);
            parenExpr383=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr383.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 106, prefixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixExpr"

    public static class postfixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:401:1: postfixExpr : termExpr ( OP_2PLUS | OP_2MINUS ) ;
    public final FanParser.postfixExpr_return postfixExpr() throws RecognitionException {
        FanParser.postfixExpr_return retval = new FanParser.postfixExpr_return();
        retval.start = input.LT(1);
        int postfixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set385=null;
        FanParser.termExpr_return termExpr384 = null;


        Object set385_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:14: ( termExpr ( OP_2PLUS | OP_2MINUS ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:16: termExpr ( OP_2PLUS | OP_2MINUS )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_termExpr_in_postfixExpr2964);
            termExpr384=termExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr384.getTree());
            set385=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_2PLUS && input.LA(1)<=OP_2MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set385));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, postfixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "postfixExpr"

    public static class termExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:402:1: termExpr : termBase ( termChain )* ;
    public final FanParser.termExpr_return termExpr() throws RecognitionException {
        FanParser.termExpr_return retval = new FanParser.termExpr_return();
        retval.start = input.LT(1);
        int termExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.termBase_return termBase386 = null;

        FanParser.termChain_return termChain387 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:11: ( termBase ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:13: termBase ( termChain )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_termBase_in_termExpr2981);
            termBase386=termBase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, termBase386.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:22: ( termChain )*
            loop114:
            do {
                int alt114=2;
                alt114 = dfa114.predict(input);
                switch (alt114) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_termExpr2983);
            	    termChain387=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, termChain387.getTree());

            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 108, termExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termExpr"

    public static class termBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:404:1: termBase : ( idExprReq | literal | typeBase | id );
    public final FanParser.termBase_return termBase() throws RecognitionException {
        FanParser.termBase_return retval = new FanParser.termBase_return();
        retval.start = input.LT(1);
        int termBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq388 = null;

        FanParser.literal_return literal389 = null;

        FanParser.typeBase_return typeBase390 = null;

        FanParser.id_return id391 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:11: ( idExprReq | literal | typeBase | id )
            int alt115=4;
            alt115 = dfa115.predict(input);
            switch (alt115) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:13: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_termBase2993);
                    idExprReq388=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq388.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:25: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_termBase2997);
                    literal389=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal389.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:35: typeBase
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeBase_in_termBase3001);
                    typeBase390=typeBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeBase390.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:46: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_termBase3005);
                    id391=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id391.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 109, termBase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termBase"

    public static class typeBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:405:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );
    public final FanParser.typeBase_return typeBase() throws RecognitionException {
        FanParser.typeBase_return retval = new FanParser.typeBase_return();
        retval.start = input.LT(1);
        int typeBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeLiteral_return typeLiteral392 = null;

        FanParser.slotLiteral_return slotLiteral393 = null;

        FanParser.namedSuper_return namedSuper394 = null;

        FanParser.staticCall_return staticCall395 = null;

        FanParser.dsl_return dsl396 = null;

        FanParser.closure_return closure397 = null;

        FanParser.simple_return simple398 = null;

        FanParser.ctorBlock_return ctorBlock399 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:10: ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock )
            int alt116=8;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:12: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_typeBase3012);
                    typeLiteral392=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral392.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:26: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_typeBase3016);
                    slotLiteral393=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral393.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:40: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_typeBase3020);
                    namedSuper394=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper394.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:53: staticCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_staticCall_in_typeBase3024);
                    staticCall395=staticCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticCall395.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:19: dsl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dsl_in_typeBase3046);
                    dsl396=dsl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dsl396.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:25: closure
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_closure_in_typeBase3050);
                    closure397=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure397.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:35: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_typeBase3054);
                    simple398=simple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple398.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:44: ctorBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctorBlock_in_typeBase3058);
                    ctorBlock399=ctorBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorBlock399.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 110, typeBase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeBase"

    public static class ctorBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:407:1: ctorBlock : type itBlock ;
    public final FanParser.ctorBlock_return ctorBlock() throws RecognitionException {
        FanParser.ctorBlock_return retval = new FanParser.ctorBlock_return();
        retval.start = input.LT(1);
        int ctorBlock_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type400 = null;

        FanParser.itBlock_return itBlock401 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:11: ( type itBlock )
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:13: type itBlock
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_ctorBlock3065);
            type400=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type400.getTree());
            pushFollow(FOLLOW_itBlock_in_ctorBlock3067);
            itBlock401=itBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, itBlock401.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 111, ctorBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorBlock"

    public static class staticCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:408:1: staticCall : type DOT idExpr ;
    public final FanParser.staticCall_return staticCall() throws RecognitionException {
        FanParser.staticCall_return retval = new FanParser.staticCall_return();
        retval.start = input.LT(1);
        int staticCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT403=null;
        FanParser.type_return type402 = null;

        FanParser.idExpr_return idExpr404 = null;


        Object DOT403_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:12: ( type DOT idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:14: type DOT idExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_staticCall3074);
            type402=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type402.getTree());
            DOT403=(Token)match(input,DOT,FOLLOW_DOT_in_staticCall3076); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT403_tree = (Object)adaptor.create(DOT403);
            adaptor.addChild(root_0, DOT403_tree);
            }
            pushFollow(FOLLOW_idExpr_in_staticCall3078);
            idExpr404=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr404.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 112, staticCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticCall"

    public static class termChain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:410:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock );
    public final FanParser.termChain_return termChain() throws RecognitionException {
        FanParser.termChain_return retval = new FanParser.termChain_return();
        retval.start = input.LT(1);
        int termChain_StartIndex = input.index();
        Object root_0 = null;

        FanParser.dotCall_return dotCall405 = null;

        FanParser.dynCall_return dynCall406 = null;

        FanParser.safeDotCall_return safeDotCall407 = null;

        FanParser.safeDynCall_return safeDynCall408 = null;

        FanParser.indexExpr_return indexExpr409 = null;

        FanParser.callOp_return callOp410 = null;

        FanParser.itBlock_return itBlock411 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:12: ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock )
            int alt117=7;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt117=1;
                }
                break;
            case OP_ARROW:
                {
                alt117=2;
                }
                break;
            case OP_SAFE_CALL:
                {
                alt117=3;
                }
                break;
            case OP_SAFEDYN_CALL:
                {
                alt117=4;
                }
                break;
            case SQ_BRACKET_L:
                {
                alt117=5;
                }
                break;
            case PAR_L:
                {
                alt117=6;
                }
                break;
            case BRACKET_L:
                {
                alt117=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:410:14: dotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotCall_in_termChain3087);
                    dotCall405=dotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotCall405.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:410:24: dynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dynCall_in_termChain3091);
                    dynCall406=dynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dynCall406.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:410:34: safeDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDotCall_in_termChain3095);
                    safeDotCall407=safeDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDotCall407.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:410:48: safeDynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDynCall_in_termChain3099);
                    safeDynCall408=safeDynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDynCall408.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:411:4: indexExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_indexExpr_in_termChain3106);
                    indexExpr409=indexExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpr409.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:411:16: callOp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_callOp_in_termChain3110);
                    callOp410=callOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callOp410.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:411:25: itBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_itBlock_in_termChain3114);
                    itBlock411=itBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itBlock411.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 113, termChain_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termChain"

    public static class dsl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dsl"
    // src/net/colar/netbeans/fan/antlr/Fan.g:412:1: dsl : simpleType DSL ;
    public final FanParser.dsl_return dsl() throws RecognitionException {
        FanParser.dsl_return retval = new FanParser.dsl_return();
        retval.start = input.LT(1);
        int dsl_StartIndex = input.index();
        Object root_0 = null;

        Token DSL413=null;
        FanParser.simpleType_return simpleType412 = null;


        Object DSL413_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:412:13: ( simpleType DSL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:412:15: simpleType DSL
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleType_in_dsl3129);
            simpleType412=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType412.getTree());
            DSL413=(Token)match(input,DSL,FOLLOW_DSL_in_dsl3131); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DSL413_tree = (Object)adaptor.create(DSL413);
            adaptor.addChild(root_0, DSL413_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 114, dsl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dsl"

    public static class itBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "itBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:415:1: itBlock : bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR ;
    public final FanParser.itBlock_return itBlock() throws RecognitionException {
        FanParser.itBlock_return retval = new FanParser.itBlock_return();
        retval.start = input.LT(1);
        int itBlock_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA416=null;
        Token SP_SEMI417=null;
        FanParser.bracketL_return bracketL414 = null;

        FanParser.stmt_return stmt415 = null;

        FanParser.bracketR_return bracketR418 = null;


        Object SP_COMMA416_tree=null;
        Object SP_SEMI417_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:415:10: ( bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:415:12: bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bracketL_in_itBlock3141);
            bracketL414=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL414.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:415:21: ( stmt ( SP_COMMA )? ( SP_SEMI )? )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( ((LA120_0>=KW_BREAK && LA120_0<=KW_TRY)||(LA120_0>=KW_THIS && LA120_0<=KW_SUPER)||(LA120_0>=KW_NULL && LA120_0<=KW_FALSE)||LA120_0==SP_PIPE||LA120_0==OP_CURRY||(LA120_0>=OP_PLUS && LA120_0<=OP_MULTI)||(LA120_0>=OP_BANG && LA120_0<=OP_TILDA)||(LA120_0>=ID && LA120_0<=OP_POUND)||LA120_0==NUMBER||LA120_0==SQ_BRACKET_L||LA120_0==PAR_L) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:415:22: stmt ( SP_COMMA )? ( SP_SEMI )?
            	    {
            	    pushFollow(FOLLOW_stmt_in_itBlock3144);
            	    stmt415=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt415.getTree());
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:415:27: ( SP_COMMA )?
            	    int alt118=2;
            	    int LA118_0 = input.LA(1);

            	    if ( (LA118_0==SP_COMMA) ) {
            	        alt118=1;
            	    }
            	    switch (alt118) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
            	            {
            	            SP_COMMA416=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_itBlock3146); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_COMMA416_tree = (Object)adaptor.create(SP_COMMA416);
            	            adaptor.addChild(root_0, SP_COMMA416_tree);
            	            }

            	            }
            	            break;

            	    }

            	    // src/net/colar/netbeans/fan/antlr/Fan.g:415:37: ( SP_SEMI )?
            	    int alt119=2;
            	    int LA119_0 = input.LA(1);

            	    if ( (LA119_0==SP_SEMI) ) {
            	        alt119=1;
            	    }
            	    switch (alt119) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
            	            {
            	            SP_SEMI417=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_itBlock3149); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_SEMI417_tree = (Object)adaptor.create(SP_SEMI417);
            	            adaptor.addChild(root_0, SP_SEMI417_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_itBlock3154);
            bracketR418=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR418.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 115, itBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "itBlock"

    public static class dotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:416:1: dotCall : DOT idExpr ;
    public final FanParser.dotCall_return dotCall() throws RecognitionException {
        FanParser.dotCall_return retval = new FanParser.dotCall_return();
        retval.start = input.LT(1);
        int dotCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT419=null;
        FanParser.idExpr_return idExpr420 = null;


        Object DOT419_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:10: ( DOT idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:12: DOT idExpr
            {
            root_0 = (Object)adaptor.nil();

            DOT419=(Token)match(input,DOT,FOLLOW_DOT_in_dotCall3162); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT419_tree = (Object)adaptor.create(DOT419);
            adaptor.addChild(root_0, DOT419_tree);
            }
            pushFollow(FOLLOW_idExpr_in_dotCall3164);
            idExpr420=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr420.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 116, dotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotCall"

    public static class dynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:417:1: dynCall : OP_ARROW idExpr ;
    public final FanParser.dynCall_return dynCall() throws RecognitionException {
        FanParser.dynCall_return retval = new FanParser.dynCall_return();
        retval.start = input.LT(1);
        int dynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW421=null;
        FanParser.idExpr_return idExpr422 = null;


        Object OP_ARROW421_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:10: ( OP_ARROW idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:12: OP_ARROW idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW421=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_dynCall3172); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW421_tree = (Object)adaptor.create(OP_ARROW421);
            adaptor.addChild(root_0, OP_ARROW421_tree);
            }
            pushFollow(FOLLOW_idExpr_in_dynCall3174);
            idExpr422=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr422.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 117, dynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dynCall"

    public static class safeDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:418:1: safeDotCall : OP_SAFE_CALL idExpr ;
    public final FanParser.safeDotCall_return safeDotCall() throws RecognitionException {
        FanParser.safeDotCall_return retval = new FanParser.safeDotCall_return();
        retval.start = input.LT(1);
        int safeDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFE_CALL423=null;
        FanParser.idExpr_return idExpr424 = null;


        Object OP_SAFE_CALL423_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:14: ( OP_SAFE_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:16: OP_SAFE_CALL idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_SAFE_CALL423=(Token)match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_safeDotCall3182); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_SAFE_CALL423_tree = (Object)adaptor.create(OP_SAFE_CALL423);
            adaptor.addChild(root_0, OP_SAFE_CALL423_tree);
            }
            pushFollow(FOLLOW_idExpr_in_safeDotCall3184);
            idExpr424=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr424.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 118, safeDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDotCall"

    public static class safeDynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:419:1: safeDynCall : OP_SAFEDYN_CALL idExpr ;
    public final FanParser.safeDynCall_return safeDynCall() throws RecognitionException {
        FanParser.safeDynCall_return retval = new FanParser.safeDynCall_return();
        retval.start = input.LT(1);
        int safeDynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFEDYN_CALL425=null;
        FanParser.idExpr_return idExpr426 = null;


        Object OP_SAFEDYN_CALL425_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:419:13: ( OP_SAFEDYN_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:419:15: OP_SAFEDYN_CALL idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_SAFEDYN_CALL425=(Token)match(input,OP_SAFEDYN_CALL,FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall3191); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_SAFEDYN_CALL425_tree = (Object)adaptor.create(OP_SAFEDYN_CALL425);
            adaptor.addChild(root_0, OP_SAFEDYN_CALL425_tree);
            }
            pushFollow(FOLLOW_idExpr_in_safeDynCall3193);
            idExpr426=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr426.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 119, safeDynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDynCall"

    public static class indexExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:420:1: indexExpr : {...}? sq_bracketL expr sq_bracketR ;
    public final FanParser.indexExpr_return indexExpr() throws RecognitionException {
        FanParser.indexExpr_return retval = new FanParser.indexExpr_return();
        retval.start = input.LT(1);
        int indexExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.sq_bracketL_return sq_bracketL427 = null;

        FanParser.expr_return expr428 = null;

        FanParser.sq_bracketR_return sq_bracketR429 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:12: ({...}? sq_bracketL expr sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:14: {...}? sq_bracketL expr sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "indexExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_sq_bracketL_in_indexExpr3203);
            sq_bracketL427=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL427.getTree());
            pushFollow(FOLLOW_expr_in_indexExpr3205);
            expr428=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr428.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_indexExpr3207);
            sq_bracketR429=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR429.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 120, indexExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "indexExpr"

    public static class callOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:422:1: callOp : {...}? parL ( args )? parR ( closure )* ;
    public final FanParser.callOp_return callOp() throws RecognitionException {
        FanParser.callOp_return retval = new FanParser.callOp_return();
        retval.start = input.LT(1);
        int callOp_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL430 = null;

        FanParser.args_return args431 = null;

        FanParser.parR_return parR432 = null;

        FanParser.closure_return closure433 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:9: ({...}? parL ( args )? parR ( closure )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:11: {...}? parL ( args )? parR ( closure )*
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callOp", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callOp3218);
            parL430=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL430.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:33: ( args )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=KW_THIS && LA121_0<=KW_SUPER)||(LA121_0>=KW_NULL && LA121_0<=KW_FALSE)||LA121_0==SP_PIPE||LA121_0==OP_CURRY||(LA121_0>=OP_PLUS && LA121_0<=OP_MULTI)||(LA121_0>=OP_BANG && LA121_0<=OP_TILDA)||(LA121_0>=ID && LA121_0<=OP_POUND)||LA121_0==NUMBER||LA121_0==SQ_BRACKET_L||LA121_0==PAR_L) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callOp3220);
                    args431=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args431.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callOp3224);
            parR432=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR432.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:45: ( closure )*
            loop122:
            do {
                int alt122=2;
                alt122 = dfa122.predict(input);
                switch (alt122) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: closure
            	    {
            	    pushFollow(FOLLOW_closure_in_callOp3226);
            	    closure433=closure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure433.getTree());

            	    }
            	    break;

            	default :
            	    break loop122;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 121, callOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callOp"

    public static class closure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "closure"
    // src/net/colar/netbeans/fan/antlr/Fan.g:423:1: closure : funcType multiStmt ;
    public final FanParser.closure_return closure() throws RecognitionException {
        FanParser.closure_return retval = new FanParser.closure_return();
        retval.start = input.LT(1);
        int closure_StartIndex = input.index();
        Object root_0 = null;

        FanParser.funcType_return funcType434 = null;

        FanParser.multiStmt_return multiStmt435 = null;



        paraphrase.push("Closure");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:424:3: ( funcType multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:424:7: funcType multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_funcType_in_closure3248);
            funcType434=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType434.getTree());
            pushFollow(FOLLOW_multiStmt_in_closure3250);
            multiStmt435=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt435.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 122, closure_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "closure"

    public static class idExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:426:1: idExpr : ( idExprReq | id );
    public final FanParser.idExpr_return idExpr() throws RecognitionException {
        FanParser.idExpr_return retval = new FanParser.idExpr_return();
        retval.start = input.LT(1);
        int idExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq436 = null;

        FanParser.id_return id437 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:426:10: ( idExprReq | id )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==OP_MULTI) ) {
                alt123=1;
            }
            else if ( (LA123_0==ID) ) {
                int LA123_2 = input.LA(2);

                if ( (synpred200_Fan()) ) {
                    alt123=1;
                }
                else if ( (true) ) {
                    alt123=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 123, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:426:12: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_idExpr3260);
                    idExprReq436=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq436.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:426:24: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_idExpr3264);
                    id437=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id437.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 123, idExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExpr"

    public static class idExprReq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExprReq"
    // src/net/colar/netbeans/fan/antlr/Fan.g:428:1: idExprReq : ( field | call );
    public final FanParser.idExprReq_return idExprReq() throws RecognitionException {
        FanParser.idExprReq_return retval = new FanParser.idExprReq_return();
        retval.start = input.LT(1);
        int idExprReq_StartIndex = input.index();
        Object root_0 = null;

        FanParser.field_return field438 = null;

        FanParser.call_return call439 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:428:11: ( field | call )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==OP_MULTI) ) {
                alt124=1;
            }
            else if ( (LA124_0==ID) ) {
                alt124=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:428:13: field
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_field_in_idExprReq3272);
                    field438=field();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field438.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:428:21: call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_idExprReq3276);
                    call439=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call439.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 124, idExprReq_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExprReq"

    public static class field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field"
    // src/net/colar/netbeans/fan/antlr/Fan.g:430:1: field : OP_MULTI ID ;
    public final FanParser.field_return field() throws RecognitionException {
        FanParser.field_return retval = new FanParser.field_return();
        retval.start = input.LT(1);
        int field_StartIndex = input.index();
        Object root_0 = null;

        Token OP_MULTI440=null;
        Token ID441=null;

        Object OP_MULTI440_tree=null;
        Object ID441_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:8: ( OP_MULTI ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:10: OP_MULTI ID
            {
            root_0 = (Object)adaptor.nil();

            OP_MULTI440=(Token)match(input,OP_MULTI,FOLLOW_OP_MULTI_in_field3285); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_MULTI440_tree = (Object)adaptor.create(OP_MULTI440);
            adaptor.addChild(root_0, OP_MULTI440_tree);
            }
            ID441=(Token)match(input,ID,FOLLOW_ID_in_field3287); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID441_tree = (Object)adaptor.create(ID441);
            adaptor.addChild(root_0, ID441_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 125, field_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "field"

    public static class call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // src/net/colar/netbeans/fan/antlr/Fan.g:432:1: call : id ( ( callParams closure ) | callParams | closure ) ;
    public final FanParser.call_return call() throws RecognitionException {
        FanParser.call_return retval = new FanParser.call_return();
        retval.start = input.LT(1);
        int call_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id442 = null;

        FanParser.callParams_return callParams443 = null;

        FanParser.closure_return closure444 = null;

        FanParser.callParams_return callParams445 = null;

        FanParser.closure_return closure446 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:432:7: ( id ( ( callParams closure ) | callParams | closure ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:432:9: id ( ( callParams closure ) | callParams | closure )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_call3298);
            id442=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id442.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:432:12: ( ( callParams closure ) | callParams | closure )
            int alt125=3;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==PAR_L) ) {
                int LA125_1 = input.LA(2);

                if ( ((synpred202_Fan()&&(notAfterEol()))) ) {
                    alt125=1;
                }
                else if ( ((synpred203_Fan()&&(notAfterEol()))) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA125_0==SP_PIPE) ) {
                alt125=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:432:13: ( callParams closure )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:432:13: ( callParams closure )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:432:14: callParams closure
                    {
                    pushFollow(FOLLOW_callParams_in_call3302);
                    callParams443=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callParams443.getTree());
                    pushFollow(FOLLOW_closure_in_call3304);
                    closure444=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure444.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:432:36: callParams
                    {
                    pushFollow(FOLLOW_callParams_in_call3309);
                    callParams445=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callParams445.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:432:49: closure
                    {
                    pushFollow(FOLLOW_closure_in_call3313);
                    closure446=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure446.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 126, call_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class callParams_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callParams"
    // src/net/colar/netbeans/fan/antlr/Fan.g:434:1: callParams : {...}? parL ( args )? parR ;
    public final FanParser.callParams_return callParams() throws RecognitionException {
        FanParser.callParams_return retval = new FanParser.callParams_return();
        retval.start = input.LT(1);
        int callParams_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL447 = null;

        FanParser.args_return args448 = null;

        FanParser.parR_return parR449 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:12: ({...}? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:14: {...}? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callParams", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callParams3324);
            parL447=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL447.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:36: ( args )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( ((LA126_0>=KW_THIS && LA126_0<=KW_SUPER)||(LA126_0>=KW_NULL && LA126_0<=KW_FALSE)||LA126_0==SP_PIPE||LA126_0==OP_CURRY||(LA126_0>=OP_PLUS && LA126_0<=OP_MULTI)||(LA126_0>=OP_BANG && LA126_0<=OP_TILDA)||(LA126_0>=ID && LA126_0<=OP_POUND)||LA126_0==NUMBER||LA126_0==SQ_BRACKET_L||LA126_0==PAR_L) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callParams3326);
                    args448=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args448.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callParams3329);
            parR449=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR449.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 127, callParams_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callParams"

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // src/net/colar/netbeans/fan/antlr/Fan.g:435:1: args : expr ( SP_COMMA expr )* ;
    public final FanParser.args_return args() throws RecognitionException {
        FanParser.args_return retval = new FanParser.args_return();
        retval.start = input.LT(1);
        int args_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA451=null;
        FanParser.expr_return expr450 = null;

        FanParser.expr_return expr452 = null;


        Object SP_COMMA451_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:8: ( expr ( SP_COMMA expr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:10: expr ( SP_COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_args3338);
            expr450=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr450.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:15: ( SP_COMMA expr )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==SP_COMMA) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:435:16: SP_COMMA expr
            	    {
            	    SP_COMMA451=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_args3341); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA451_tree = (Object)adaptor.create(SP_COMMA451);
            	    adaptor.addChild(root_0, SP_COMMA451_tree);
            	    }
            	    pushFollow(FOLLOW_expr_in_args3344);
            	    expr452=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr452.getTree());

            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 128, args_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:437:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple );
    public final FanParser.literal_return literal() throws RecognitionException {
        FanParser.literal_return retval = new FanParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        Object root_0 = null;

        Token KW_NULL453=null;
        Token KW_THIS454=null;
        Token KW_SUPER455=null;
        Token KW_IT456=null;
        Token KW_TRUE457=null;
        Token KW_FALSE458=null;
        Token URI460=null;
        Token CHAR462=null;
        FanParser.strs_return strs459 = null;

        FanParser.number_return number461 = null;

        FanParser.namedSuper_return namedSuper463 = null;

        FanParser.slotLiteral_return slotLiteral464 = null;

        FanParser.typeLiteral_return typeLiteral465 = null;

        FanParser.list_return list466 = null;

        FanParser.map_return map467 = null;

        FanParser.simple_return simple468 = null;


        Object KW_NULL453_tree=null;
        Object KW_THIS454_tree=null;
        Object KW_SUPER455_tree=null;
        Object KW_IT456_tree=null;
        Object KW_TRUE457_tree=null;
        Object KW_FALSE458_tree=null;
        Object URI460_tree=null;
        Object CHAR462_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:437:10: ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple )
            int alt128=16;
            alt128 = dfa128.predict(input);
            switch (alt128) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:437:12: KW_NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NULL453=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_literal3355); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NULL453_tree = (Object)adaptor.create(KW_NULL453);
                    adaptor.addChild(root_0, KW_NULL453_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:437:22: KW_THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_THIS454=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_literal3359); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_THIS454_tree = (Object)adaptor.create(KW_THIS454);
                    adaptor.addChild(root_0, KW_THIS454_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:437:32: KW_SUPER
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_SUPER455=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_literal3363); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_SUPER455_tree = (Object)adaptor.create(KW_SUPER455);
                    adaptor.addChild(root_0, KW_SUPER455_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:437:43: KW_IT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_IT456=(Token)match(input,KW_IT,FOLLOW_KW_IT_in_literal3367); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_IT456_tree = (Object)adaptor.create(KW_IT456);
                    adaptor.addChild(root_0, KW_IT456_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:437:51: KW_TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_TRUE457=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_literal3371); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_TRUE457_tree = (Object)adaptor.create(KW_TRUE457);
                    adaptor.addChild(root_0, KW_TRUE457_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:437:61: KW_FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FALSE458=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_literal3375); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FALSE458_tree = (Object)adaptor.create(KW_FALSE458);
                    adaptor.addChild(root_0, KW_FALSE458_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:437:72: strs
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_strs_in_literal3379);
                    strs459=strs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, strs459.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:437:79: URI
                    {
                    root_0 = (Object)adaptor.nil();

                    URI460=(Token)match(input,URI,FOLLOW_URI_in_literal3383); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI460_tree = (Object)adaptor.create(URI460);
                    adaptor.addChild(root_0, URI460_tree);
                    }

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:438:4: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_literal3390);
                    number461=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number461.getTree());

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:438:13: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR462=(Token)match(input,CHAR,FOLLOW_CHAR_in_literal3394); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR462_tree = (Object)adaptor.create(CHAR462);
                    adaptor.addChild(root_0, CHAR462_tree);
                    }

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:438:20: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_literal3398);
                    namedSuper463=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper463.getTree());

                    }
                    break;
                case 12 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:439:4: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_literal3405);
                    slotLiteral464=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral464.getTree());

                    }
                    break;
                case 13 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:439:18: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_literal3409);
                    typeLiteral465=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral465.getTree());

                    }
                    break;
                case 14 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:439:32: list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_in_literal3413);
                    list466=list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list466.getTree());

                    }
                    break;
                case 15 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:439:39: map
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_in_literal3417);
                    map467=map();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map467.getTree());

                    }
                    break;
                case 16 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:439:45: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_literal3421);
                    simple468=simple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple468.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 129, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class strs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "strs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:440:1: strs : (qs= QUOTSTR | s= STR ) -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )? ;
    public final FanParser.strs_return strs() throws RecognitionException {
        FanParser.strs_return retval = new FanParser.strs_return();
        retval.start = input.LT(1);
        int strs_StartIndex = input.index();
        Object root_0 = null;

        Token qs=null;
        Token s=null;

        Object qs_tree=null;
        Object s_tree=null;
        RewriteRuleTokenStream stream_QUOTSTR=new RewriteRuleTokenStream(adaptor,"token QUOTSTR");
        RewriteRuleTokenStream stream_STR=new RewriteRuleTokenStream(adaptor,"token STR");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:7: ( (qs= QUOTSTR | s= STR ) -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:9: (qs= QUOTSTR | s= STR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:9: (qs= QUOTSTR | s= STR )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==QUOTSTR) ) {
                alt129=1;
            }
            else if ( (LA129_0==STR) ) {
                alt129=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:440:10: qs= QUOTSTR
                    {
                    qs=(Token)match(input,QUOTSTR,FOLLOW_QUOTSTR_in_strs3432); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUOTSTR.add(qs);


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:440:23: s= STR
                    {
                    s=(Token)match(input,STR,FOLLOW_STR_in_strs3438); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR.add(s);


                    }
                    break;

            }



            // AST REWRITE
            // elements: s, qs
            // token labels: s, qs
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
            RewriteRuleTokenStream stream_qs=new RewriteRuleTokenStream(adaptor,"token qs",qs);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 441:5: -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )?
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:441:8: ( ^( AST_STR $s) )?
                if ( stream_s.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:441:8: ^( AST_STR $s)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_STR, "AST_STR"), root_1);

                    adaptor.addChild(root_1, stream_s.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_s.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:441:23: ( ^( AST_STR $qs) )?
                if ( stream_qs.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:441:23: ^( AST_STR $qs)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_STR, "AST_STR"), root_1);

                    adaptor.addChild(root_1, stream_qs.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_qs.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 130, strs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "strs"

    public static class typeLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:442:1: typeLiteral : type {...}? OP_POUND ;
    public final FanParser.typeLiteral_return typeLiteral() throws RecognitionException {
        FanParser.typeLiteral_return retval = new FanParser.typeLiteral_return();
        retval.start = input.LT(1);
        int typeLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND470=null;
        FanParser.type_return type469 = null;


        Object OP_POUND470_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:442:13: ( type {...}? OP_POUND )
            // src/net/colar/netbeans/fan/antlr/Fan.g:442:17: type {...}? OP_POUND
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_typeLiteral3470);
            type469=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type469.getTree());
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "typeLiteral", "notAfterEol()");
            }
            OP_POUND470=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_typeLiteral3474); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_POUND470_tree = (Object)adaptor.create(OP_POUND470);
            adaptor.addChild(root_0, OP_POUND470_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 131, typeLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeLiteral"

    public static class slotLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slotLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:443:1: slotLiteral : ( type )? OP_POUND {...}? id ;
    public final FanParser.slotLiteral_return slotLiteral() throws RecognitionException {
        FanParser.slotLiteral_return retval = new FanParser.slotLiteral_return();
        retval.start = input.LT(1);
        int slotLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND472=null;
        FanParser.type_return type471 = null;

        FanParser.id_return id473 = null;


        Object OP_POUND472_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:13: ( ( type )? OP_POUND {...}? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:17: ( type )? OP_POUND {...}? id
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:443:17: ( type )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==SP_PIPE||LA130_0==ID||LA130_0==SQ_BRACKET_L) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_slotLiteral3483);
                    type471=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type471.getTree());

                    }
                    break;

            }

            OP_POUND472=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_slotLiteral3486); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_POUND472_tree = (Object)adaptor.create(OP_POUND472);
            adaptor.addChild(root_0, OP_POUND472_tree);
            }
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "slotLiteral", "notAfterEol()");
            }
            pushFollow(FOLLOW_id_in_slotLiteral3490);
            id473=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id473.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 132, slotLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slotLiteral"

    public static class namedSuper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namedSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:444:1: namedSuper : simpleType DOT KW_SUPER ;
    public final FanParser.namedSuper_return namedSuper() throws RecognitionException {
        FanParser.namedSuper_return retval = new FanParser.namedSuper_return();
        retval.start = input.LT(1);
        int namedSuper_StartIndex = input.index();
        Object root_0 = null;

        Token DOT475=null;
        Token KW_SUPER476=null;
        FanParser.simpleType_return simpleType474 = null;


        Object DOT475_tree=null;
        Object KW_SUPER476_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:13: ( simpleType DOT KW_SUPER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:15: simpleType DOT KW_SUPER
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleType_in_namedSuper3498);
            simpleType474=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType474.getTree());
            DOT475=(Token)match(input,DOT,FOLLOW_DOT_in_namedSuper3500); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT475_tree = (Object)adaptor.create(DOT475);
            adaptor.addChild(root_0, DOT475_tree);
            }
            KW_SUPER476=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_namedSuper3502); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SUPER476_tree = (Object)adaptor.create(KW_SUPER476);
            adaptor.addChild(root_0, KW_SUPER476_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 133, namedSuper_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "namedSuper"

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // src/net/colar/netbeans/fan/antlr/Fan.g:445:1: list : ( type {...}?)? sq_bracketL listItems sq_bracketR ;
    public final FanParser.list_return list() throws RecognitionException {
        FanParser.list_return retval = new FanParser.list_return();
        retval.start = input.LT(1);
        int list_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type477 = null;

        FanParser.sq_bracketL_return sq_bracketL478 = null;

        FanParser.listItems_return listItems479 = null;

        FanParser.sq_bracketR_return sq_bracketR480 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:445:8: ( ( type {...}?)? sq_bracketL listItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:445:10: ( type {...}?)? sq_bracketL listItems sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:445:10: ( type {...}?)?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==SQ_BRACKET_L) ) {
                int LA131_1 = input.LA(2);

                if ( (synpred223_Fan()) ) {
                    alt131=1;
                }
            }
            else if ( (LA131_0==SP_PIPE||LA131_0==ID) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:445:11: type {...}?
                    {
                    pushFollow(FOLLOW_type_in_list3512);
                    type477=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type477.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "list", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_list3518);
            sq_bracketL478=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL478.getTree());
            pushFollow(FOLLOW_listItems_in_list3520);
            listItems479=listItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, listItems479.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_list3522);
            sq_bracketR480=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR480.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 134, list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class listItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:446:1: listItems : ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA );
    public final FanParser.listItems_return listItems() throws RecognitionException {
        FanParser.listItems_return retval = new FanParser.listItems_return();
        retval.start = input.LT(1);
        int listItems_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA482=null;
        Token SP_COMMA484=null;
        Token SP_COMMA485=null;
        FanParser.expr_return expr481 = null;

        FanParser.expr_return expr483 = null;


        Object SP_COMMA482_tree=null;
        Object SP_COMMA484_tree=null;
        Object SP_COMMA485_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:446:12: ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( ((LA134_0>=KW_THIS && LA134_0<=KW_SUPER)||(LA134_0>=KW_NULL && LA134_0<=KW_FALSE)||LA134_0==SP_PIPE||LA134_0==OP_CURRY||(LA134_0>=OP_PLUS && LA134_0<=OP_MULTI)||(LA134_0>=OP_BANG && LA134_0<=OP_TILDA)||(LA134_0>=ID && LA134_0<=OP_POUND)||LA134_0==NUMBER||LA134_0==SQ_BRACKET_L||LA134_0==PAR_L) ) {
                alt134=1;
            }
            else if ( (LA134_0==SP_COMMA) ) {
                alt134=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:446:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:446:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:446:15: expr ( SP_COMMA expr )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_listItems3531);
                    expr481=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr481.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:446:20: ( SP_COMMA expr )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==SP_COMMA) ) {
                            int LA132_1 = input.LA(2);

                            if ( ((LA132_1>=KW_THIS && LA132_1<=KW_SUPER)||(LA132_1>=KW_NULL && LA132_1<=KW_FALSE)||LA132_1==SP_PIPE||LA132_1==OP_CURRY||(LA132_1>=OP_PLUS && LA132_1<=OP_MULTI)||(LA132_1>=OP_BANG && LA132_1<=OP_TILDA)||(LA132_1>=ID && LA132_1<=OP_POUND)||LA132_1==NUMBER||LA132_1==SQ_BRACKET_L||LA132_1==PAR_L) ) {
                                alt132=1;
                            }


                        }


                        switch (alt132) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:446:21: SP_COMMA expr
                    	    {
                    	    SP_COMMA482=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3534); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA482_tree = (Object)adaptor.create(SP_COMMA482);
                    	    adaptor.addChild(root_0, SP_COMMA482_tree);
                    	    }
                    	    pushFollow(FOLLOW_expr_in_listItems3536);
                    	    expr483=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr483.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:446:38: ( SP_COMMA )?
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==SP_COMMA) ) {
                        alt133=1;
                    }
                    switch (alt133) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA484=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3541); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SP_COMMA484_tree = (Object)adaptor.create(SP_COMMA484);
                            adaptor.addChild(root_0, SP_COMMA484_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:446:51: SP_COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COMMA485=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3547); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COMMA485_tree = (Object)adaptor.create(SP_COMMA485);
                    adaptor.addChild(root_0, SP_COMMA485_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 135, listItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listItems"

    public static class map_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map"
    // src/net/colar/netbeans/fan/antlr/Fan.g:447:1: map : ( mapType {...}?)? sq_bracketL mapItems sq_bracketR ;
    public final FanParser.map_return map() throws RecognitionException {
        FanParser.map_return retval = new FanParser.map_return();
        retval.start = input.LT(1);
        int map_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mapType_return mapType486 = null;

        FanParser.sq_bracketL_return sq_bracketL487 = null;

        FanParser.mapItems_return mapItems488 = null;

        FanParser.sq_bracketR_return sq_bracketR489 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:447:7: ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:447:9: ( mapType {...}?)? sq_bracketL mapItems sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:447:9: ( mapType {...}?)?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==SQ_BRACKET_L) ) {
                int LA135_1 = input.LA(2);

                if ( (synpred227_Fan()) ) {
                    alt135=1;
                }
            }
            else if ( (LA135_0==SP_PIPE||LA135_0==ID) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:447:10: mapType {...}?
                    {
                    pushFollow(FOLLOW_mapType_in_map3557);
                    mapType486=mapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapType486.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "map", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_map3563);
            sq_bracketL487=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL487.getTree());
            pushFollow(FOLLOW_mapItems_in_map3565);
            mapItems488=mapItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mapItems488.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_map3567);
            sq_bracketR489=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR489.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 136, map_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "map"

    public static class mapItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:448:1: mapItems : ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON );
    public final FanParser.mapItems_return mapItems() throws RecognitionException {
        FanParser.mapItems_return retval = new FanParser.mapItems_return();
        retval.start = input.LT(1);
        int mapItems_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA491=null;
        Token SP_COMMA493=null;
        Token SP_COLON494=null;
        FanParser.mapPair_return mapPair490 = null;

        FanParser.mapPair_return mapPair492 = null;


        Object SP_COMMA491_tree=null;
        Object SP_COMMA493_tree=null;
        Object SP_COLON494_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:448:11: ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( ((LA138_0>=KW_THIS && LA138_0<=KW_SUPER)||(LA138_0>=KW_NULL && LA138_0<=KW_FALSE)||LA138_0==SP_PIPE||LA138_0==OP_CURRY||(LA138_0>=OP_PLUS && LA138_0<=OP_MULTI)||(LA138_0>=OP_BANG && LA138_0<=OP_TILDA)||(LA138_0>=ID && LA138_0<=OP_POUND)||LA138_0==NUMBER||LA138_0==SQ_BRACKET_L||LA138_0==PAR_L) ) {
                alt138=1;
            }
            else if ( (LA138_0==SP_COLON) ) {
                alt138=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }
            switch (alt138) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:448:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:448:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:448:14: mapPair ( SP_COMMA mapPair )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_mapPair_in_mapItems3576);
                    mapPair490=mapPair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair490.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:448:22: ( SP_COMMA mapPair )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==SP_COMMA) ) {
                            int LA136_1 = input.LA(2);

                            if ( ((LA136_1>=KW_THIS && LA136_1<=KW_SUPER)||(LA136_1>=KW_NULL && LA136_1<=KW_FALSE)||LA136_1==SP_PIPE||LA136_1==OP_CURRY||(LA136_1>=OP_PLUS && LA136_1<=OP_MULTI)||(LA136_1>=OP_BANG && LA136_1<=OP_TILDA)||(LA136_1>=ID && LA136_1<=OP_POUND)||LA136_1==NUMBER||LA136_1==SQ_BRACKET_L||LA136_1==PAR_L) ) {
                                alt136=1;
                            }


                        }


                        switch (alt136) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:448:23: SP_COMMA mapPair
                    	    {
                    	    SP_COMMA491=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems3579); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA491_tree = (Object)adaptor.create(SP_COMMA491);
                    	    adaptor.addChild(root_0, SP_COMMA491_tree);
                    	    }
                    	    pushFollow(FOLLOW_mapPair_in_mapItems3581);
                    	    mapPair492=mapPair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair492.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:448:42: ( SP_COMMA )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==SP_COMMA) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA493=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems3585); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SP_COMMA493_tree = (Object)adaptor.create(SP_COMMA493);
                            adaptor.addChild(root_0, SP_COMMA493_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:448:55: SP_COLON
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COLON494=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapItems3591); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLON494_tree = (Object)adaptor.create(SP_COLON494);
                    adaptor.addChild(root_0, SP_COLON494_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 137, mapItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapItems"

    public static class mapPair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapPair"
    // src/net/colar/netbeans/fan/antlr/Fan.g:449:1: mapPair : expr SP_COLON expr ;
    public final FanParser.mapPair_return mapPair() throws RecognitionException {
        FanParser.mapPair_return retval = new FanParser.mapPair_return();
        retval.start = input.LT(1);
        int mapPair_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON496=null;
        FanParser.expr_return expr495 = null;

        FanParser.expr_return expr497 = null;


        Object SP_COLON496_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:10: ( expr SP_COLON expr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:12: expr SP_COLON expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_mapPair3599);
            expr495=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr495.getTree());
            SP_COLON496=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapPair3601); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON496_tree = (Object)adaptor.create(SP_COLON496);
            adaptor.addChild(root_0, SP_COLON496_tree);
            }
            pushFollow(FOLLOW_expr_in_mapPair3603);
            expr497=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr497.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 138, mapPair_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapPair"

    public static class simple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple"
    // src/net/colar/netbeans/fan/antlr/Fan.g:450:1: simple : type parL expr parR ;
    public final FanParser.simple_return simple() throws RecognitionException {
        FanParser.simple_return retval = new FanParser.simple_return();
        retval.start = input.LT(1);
        int simple_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type498 = null;

        FanParser.parL_return parL499 = null;

        FanParser.expr_return expr500 = null;

        FanParser.parR_return parR501 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:9: ( type parL expr parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:11: type parL expr parR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_simple3611);
            type498=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type498.getTree());
            pushFollow(FOLLOW_parL_in_simple3613);
            parL499=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL499.getTree());
            pushFollow(FOLLOW_expr_in_simple3615);
            expr500=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr500.getTree());
            pushFollow(FOLLOW_parR_in_simple3617);
            parR501=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR501.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 139, simple_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simple"

    public static class docs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "docs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:452:1: docs : d= ( ( DOC )* ) -> ^( AST_DOCS ( $d)? ) ;
    public final FanParser.docs_return docs() throws RecognitionException {
        FanParser.docs_return retval = new FanParser.docs_return();
        retval.start = input.LT(1);
        int docs_StartIndex = input.index();
        Object root_0 = null;

        Token d=null;
        Token DOC502=null;

        Object d_tree=null;
        Object DOC502_tree=null;
        RewriteRuleTokenStream stream_DOC=new RewriteRuleTokenStream(adaptor,"token DOC");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:7: (d= ( ( DOC )* ) -> ^( AST_DOCS ( $d)? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:9: d= ( ( DOC )* )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:11: ( ( DOC )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:12: ( DOC )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:12: ( DOC )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==DOC) ) {
                    int LA139_2 = input.LA(2);

                    if ( (synpred231_Fan()) ) {
                        alt139=1;
                    }


                }


                switch (alt139) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: DOC
            	    {
            	    DOC502=(Token)match(input,DOC,FOLLOW_DOC_in_docs3629); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOC.add(DOC502);


            	    }
            	    break;

            	default :
            	    break loop139;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: d
            // token labels: d
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 452:18: -> ^( AST_DOCS ( $d)? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:452:21: ^( AST_DOCS ( $d)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_DOCS, "AST_DOCS"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:452:32: ( $d)?
                if ( stream_d.hasNext() ) {
                    adaptor.addChild(root_1, stream_d.nextNode());

                }
                stream_d.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 140, docs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "docs"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // src/net/colar/netbeans/fan/antlr/Fan.g:454:1: number : ( OP_MINUS )? NUMBER ;
    public final FanParser.number_return number() throws RecognitionException {
        FanParser.number_return retval = new FanParser.number_return();
        retval.start = input.LT(1);
        int number_StartIndex = input.index();
        Object root_0 = null;

        Token OP_MINUS503=null;
        Token NUMBER504=null;

        Object OP_MINUS503_tree=null;
        Object NUMBER504_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:454:9: ( ( OP_MINUS )? NUMBER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:454:12: ( OP_MINUS )? NUMBER
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:454:12: ( OP_MINUS )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==OP_MINUS) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: OP_MINUS
                    {
                    OP_MINUS503=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_number3651); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_MINUS503_tree = (Object)adaptor.create(OP_MINUS503);
                    adaptor.addChild(root_0, OP_MINUS503_tree);
                    }

                    }
                    break;

            }

            NUMBER504=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_number3654); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER504_tree = (Object)adaptor.create(NUMBER504);
            adaptor.addChild(root_0, NUMBER504_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 141, number_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class facet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "facet"
    // src/net/colar/netbeans/fan/antlr/Fan.g:455:1: facet : AT id ( AS_EQUAL expr )? ;
    public final FanParser.facet_return facet() throws RecognitionException {
        FanParser.facet_return retval = new FanParser.facet_return();
        retval.start = input.LT(1);
        int facet_StartIndex = input.index();
        Object root_0 = null;

        Token AT505=null;
        Token AS_EQUAL507=null;
        FanParser.id_return id506 = null;

        FanParser.expr_return expr508 = null;


        Object AT505_tree=null;
        Object AS_EQUAL507_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:455:8: ( AT id ( AS_EQUAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:455:10: AT id ( AS_EQUAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            AT505=(Token)match(input,AT,FOLLOW_AT_in_facet3662); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT505_tree = (Object)adaptor.create(AT505);
            adaptor.addChild(root_0, AT505_tree);
            }
            pushFollow(FOLLOW_id_in_facet3664);
            id506=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id506.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:455:16: ( AS_EQUAL expr )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==AS_EQUAL) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:455:17: AS_EQUAL expr
                    {
                    AS_EQUAL507=(Token)match(input,AS_EQUAL,FOLLOW_AS_EQUAL_in_facet3667); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_EQUAL507_tree = (Object)adaptor.create(AS_EQUAL507);
                    adaptor.addChild(root_0, AS_EQUAL507_tree);
                    }
                    pushFollow(FOLLOW_expr_in_facet3669);
                    expr508=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr508.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 142, facet_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "facet"

    public static class eos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eos"
    // src/net/colar/netbeans/fan/antlr/Fan.g:458:1: eos : ( SP_SEMI | {...}?);
    public final FanParser.eos_return eos() throws RecognitionException {
        FanParser.eos_return retval = new FanParser.eos_return();
        retval.start = input.LT(1);
        int eos_StartIndex = input.index();
        Object root_0 = null;

        Token SP_SEMI509=null;

        Object SP_SEMI509_tree=null;

        paraphrase.push("Semicolumn or LineBreak");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:460:3: ( SP_SEMI | {...}?)
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==SP_SEMI) ) {
                int LA142_1 = input.LA(2);

                if ( (synpred234_Fan()) ) {
                    alt142=1;
                }
                else if ( ((lookupNL())) ) {
                    alt142=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 142, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA142_0==EOF||(LA142_0>=KW_BREAK && LA142_0<=KW_USING)||(LA142_0>=KW_RD_ONLY && LA142_0<=KW_FINAL)||(LA142_0>=KW_CLASS && LA142_0<=KW_ELSE)||(LA142_0>=KW_NULL && LA142_0<=KW_FALSE)||LA142_0==BRACKET_R||LA142_0==SP_COMMA||LA142_0==SP_PIPE||LA142_0==OP_CURRY||(LA142_0>=OP_PLUS && LA142_0<=OP_MULTI)||(LA142_0>=OP_BANG && LA142_0<=OP_TILDA)||(LA142_0>=ID && LA142_0<=SQ_BRACKET_L)||LA142_0==PAR_L||LA142_0==141) ) {
                alt142=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }
            switch (alt142) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:460:5: SP_SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_SEMI509=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_eos3691); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_SEMI509_tree = (Object)adaptor.create(SP_SEMI509);
                    adaptor.addChild(root_0, SP_SEMI509_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:460:15: {...}?
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !((lookupNL())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "eos", "lookupNL()");
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 143, eos_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "eos"

    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // src/net/colar/netbeans/fan/antlr/Fan.g:462:1: id : ID ;
    public final FanParser.id_return id() throws RecognitionException {
        FanParser.id_return retval = new FanParser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token ID510=null;

        Object ID510_tree=null;

        paraphrase.push("Identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:464:3: ( ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:464:6: ID
            {
            root_0 = (Object)adaptor.nil();

            ID510=(Token)match(input,ID,FOLLOW_ID_in_id3715); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID510_tree = (Object)adaptor.create(ID510);
            adaptor.addChild(root_0, ID510_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 144, id_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "id"

    public static class getter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:470:1: getter : t= ID {...}?;
    public final FanParser.getter_return getter() throws RecognitionException {
        FanParser.getter_return retval = new FanParser.getter_return();
        retval.start = input.LT(1);
        int getter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:470:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:470:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_getter3728); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            t_tree = (Object)adaptor.create(t);
            adaptor.addChild(root_0, t_tree);
            }
            if ( !((t.getText().equals("get"))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "getter", "t.getText().equals(\"get\")");
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 145, getter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "getter"

    public static class setter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:471:1: setter : t= ID {...}?;
    public final FanParser.setter_return setter() throws RecognitionException {
        FanParser.setter_return retval = new FanParser.setter_return();
        retval.start = input.LT(1);
        int setter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:471:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:471:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_setter3741); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            t_tree = (Object)adaptor.create(t);
            adaptor.addChild(root_0, t_tree);
            }
            if ( !((t.getText().equals("set"))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "setter", "t.getText().equals(\"set\")");
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 146, setter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "setter"

    public static class bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:474:1: bracketL : BRACKET_L ;
    public final FanParser.bracketL_return bracketL() throws RecognitionException {
        FanParser.bracketL_return retval = new FanParser.bracketL_return();
        retval.start = input.LT(1);
        int bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_L511=null;

        Object BRACKET_L511_tree=null;

        paraphrase.push("{");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:3: ( BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:5: BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_L511=(Token)match(input,BRACKET_L,FOLLOW_BRACKET_L_in_bracketL3763); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_L511_tree = (Object)adaptor.create(BRACKET_L511);
            adaptor.addChild(root_0, BRACKET_L511_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 147, bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketL"

    public static class bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:477:1: bracketR : BRACKET_R ;
    public final FanParser.bracketR_return bracketR() throws RecognitionException {
        FanParser.bracketR_return retval = new FanParser.bracketR_return();
        retval.start = input.LT(1);
        int bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_R512=null;

        Object BRACKET_R512_tree=null;

        paraphrase.push("}");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:3: ( BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:5: BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_R512=(Token)match(input,BRACKET_R,FOLLOW_BRACKET_R_in_bracketR3781); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_R512_tree = (Object)adaptor.create(BRACKET_R512);
            adaptor.addChild(root_0, BRACKET_R512_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 148, bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketR"

    public static class sq_bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:480:1: sq_bracketL : SQ_BRACKET_L ;
    public final FanParser.sq_bracketL_return sq_bracketL() throws RecognitionException {
        FanParser.sq_bracketL_return retval = new FanParser.sq_bracketL_return();
        retval.start = input.LT(1);
        int sq_bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_L513=null;

        Object SQ_BRACKET_L513_tree=null;

        paraphrase.push("[");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:482:3: ( SQ_BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:482:5: SQ_BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_L513=(Token)match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_sq_bracketL3799); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQ_BRACKET_L513_tree = (Object)adaptor.create(SQ_BRACKET_L513);
            adaptor.addChild(root_0, SQ_BRACKET_L513_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 149, sq_bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketL"

    public static class sq_bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:483:1: sq_bracketR : SQ_BRACKET_R ;
    public final FanParser.sq_bracketR_return sq_bracketR() throws RecognitionException {
        FanParser.sq_bracketR_return retval = new FanParser.sq_bracketR_return();
        retval.start = input.LT(1);
        int sq_bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_R514=null;

        Object SQ_BRACKET_R514_tree=null;

        paraphrase.push("]");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:485:3: ( SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:485:5: SQ_BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_R514=(Token)match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_sq_bracketR3817); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQ_BRACKET_R514_tree = (Object)adaptor.create(SQ_BRACKET_R514);
            adaptor.addChild(root_0, SQ_BRACKET_R514_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 150, sq_bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketR"

    public static class parL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:486:1: parL : PAR_L ;
    public final FanParser.parL_return parL() throws RecognitionException {
        FanParser.parL_return retval = new FanParser.parL_return();
        retval.start = input.LT(1);
        int parL_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_L515=null;

        Object PAR_L515_tree=null;

        paraphrase.push("(");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 151) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:488:3: ( PAR_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:488:5: PAR_L
            {
            root_0 = (Object)adaptor.nil();

            PAR_L515=(Token)match(input,PAR_L,FOLLOW_PAR_L_in_parL3835); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAR_L515_tree = (Object)adaptor.create(PAR_L515);
            adaptor.addChild(root_0, PAR_L515_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 151, parL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parL"

    public static class parR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:489:1: parR : PAR_R ;
    public final FanParser.parR_return parR() throws RecognitionException {
        FanParser.parR_return retval = new FanParser.parR_return();
        retval.start = input.LT(1);
        int parR_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_R516=null;

        Object PAR_R516_tree=null;

        paraphrase.push(")");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 152) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:3: ( PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:5: PAR_R
            {
            root_0 = (Object)adaptor.nil();

            PAR_R516=(Token)match(input,PAR_R,FOLLOW_PAR_R_in_parR3853); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAR_R516_tree = (Object)adaptor.create(PAR_R516);
            adaptor.addChild(root_0, PAR_R516_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 152, parR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parR"

    // $ANTLR start synpred2_Fan
    public final void synpred2_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:229:19: ( podDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:229:19: podDef
        {
        pushFollow(FOLLOW_podDef_in_synpred2_Fan413);
        podDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Fan

    // $ANTLR start synpred11_Fan
    public final void synpred11_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:246:17: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:246:17: facet
        {
        pushFollow(FOLLOW_facet_in_synpred11_Fan599);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_Fan

    // $ANTLR start synpred13_Fan
    public final void synpred13_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:246:25: ( ( classFlags )* KW_CLASS )
        // src/net/colar/netbeans/fan/antlr/Fan.g:246:26: ( classFlags )* KW_CLASS
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:246:26: ( classFlags )*
        loop143:
        do {
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( ((LA143_0>=KW_CONST && LA143_0<=KW_STATIC)||LA143_0==KW_FINAL||(LA143_0>=KW_ABSTRACT && LA143_0<=KW_INTERNAL)) ) {
                alt143=1;
            }


            switch (alt143) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: classFlags
        	    {
        	    pushFollow(FOLLOW_classFlags_in_synpred13_Fan604);
        	    classFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop143;
            }
        } while (true);

        match(input,KW_CLASS,FOLLOW_KW_CLASS_in_synpred13_Fan607); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_Fan

    // $ANTLR start synpred15_Fan
    public final void synpred15_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:247:4: ( ( protection )? KW_ENUM )
        // src/net/colar/netbeans/fan/antlr/Fan.g:247:5: ( protection )? KW_ENUM
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:247:5: ( protection )?
        int alt144=2;
        int LA144_0 = input.LA(1);

        if ( ((LA144_0>=KW_PRIVATE && LA144_0<=KW_INTERNAL)) ) {
            alt144=1;
        }
        switch (alt144) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                {
                pushFollow(FOLLOW_protection_in_synpred15_Fan618);
                protection();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,KW_ENUM,FOLLOW_KW_ENUM_in_synpred15_Fan621); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Fan

    // $ANTLR start synpred42_Fan
    public final void synpred42_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:275:28: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:275:28: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred42_Fan1132); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_Fan

    // $ANTLR start synpred43_Fan
    public final void synpred43_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:275:49: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:275:49: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred43_Fan1138); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_Fan

    // $ANTLR start synpred44_Fan
    public final void synpred44_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:275:39: ( LIST_TYPE ( SP_QMARK )? )
        // src/net/colar/netbeans/fan/antlr/Fan.g:275:39: LIST_TYPE ( SP_QMARK )?
        {
        match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_synpred44_Fan1136); if (state.failed) return ;
        // src/net/colar/netbeans/fan/antlr/Fan.g:275:49: ( SP_QMARK )?
        int alt146=2;
        int LA146_0 = input.LA(1);

        if ( (LA146_0==SP_QMARK) ) {
            alt146=1;
        }
        switch (alt146) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                {
                match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred44_Fan1138); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred44_Fan

    // $ANTLR start synpred46_Fan
    public final void synpred46_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:277:12: ( mapType )
        // src/net/colar/netbeans/fan/antlr/Fan.g:277:12: mapType
        {
        pushFollow(FOLLOW_mapType_in_synpred46_Fan1160);
        mapType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_Fan

    // $ANTLR start synpred52_Fan
    public final void synpred52_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:281:6: ({...}? SP_COLON {...}? type )
        // src/net/colar/netbeans/fan/antlr/Fan.g:281:6: {...}? SP_COLON {...}? type
        {
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred52_Fan", "notAfterEol()");
        }
        match(input,SP_COLON,FOLLOW_SP_COLON_in_synpred52_Fan1217); if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred52_Fan", "notAfterEol()");
        }
        pushFollow(FOLLOW_type_in_synpred52_Fan1221);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_Fan

    // $ANTLR start synpred53_Fan
    public final void synpred53_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:281:56: ( sq_bracketR )
        // src/net/colar/netbeans/fan/antlr/Fan.g:281:56: sq_bracketR
        {
        pushFollow(FOLLOW_sq_bracketR_in_synpred53_Fan1225);
        sq_bracketR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_Fan

    // $ANTLR start synpred55_Fan
    public final void synpred55_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:282:43: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:282:44: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred55_Fan1246); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_Fan

    // $ANTLR start synpred57_Fan
    public final void synpred57_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:282:74: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:282:75: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred57_Fan1258); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_Fan

    // $ANTLR start synpred59_Fan
    public final void synpred59_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:285:11: ( formalFull )
        // src/net/colar/netbeans/fan/antlr/Fan.g:285:11: formalFull
        {
        pushFollow(FOLLOW_formalFull_in_synpred59_Fan1299);
        formalFull();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_Fan

    // $ANTLR start synpred60_Fan
    public final void synpred60_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:285:24: ( formalTypeOnly )
        // src/net/colar/netbeans/fan/antlr/Fan.g:285:24: formalTypeOnly
        {
        pushFollow(FOLLOW_formalTypeOnly_in_synpred60_Fan1303);
        formalTypeOnly();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_Fan

    // $ANTLR start synpred61_Fan
    public final void synpred61_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:289:13: ( KW_STATIC bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:289:14: KW_STATIC bracketL
        {
        match(input,KW_STATIC,FOLLOW_KW_STATIC_in_synpred61_Fan1351); if (state.failed) return ;
        pushFollow(FOLLOW_bracketL_in_synpred61_Fan1353);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_Fan

    // $ANTLR start synpred62_Fan
    public final void synpred62_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:290:11: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:290:11: facet
        {
        pushFollow(FOLLOW_facet_in_synpred62_Fan1367);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_Fan

    // $ANTLR start synpred64_Fan
    public final void synpred64_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:292:7: ( ( ctorFlags )* KW_NEW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:292:8: ( ctorFlags )* KW_NEW
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:292:8: ( ctorFlags )*
        loop149:
        do {
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( ((LA149_0>=KW_PRIVATE && LA149_0<=KW_INTERNAL)) ) {
                alt149=1;
            }


            switch (alt149) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ctorFlags
        	    {
        	    pushFollow(FOLLOW_ctorFlags_in_synpred64_Fan1384);
        	    ctorFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop149;
            }
        } while (true);

        match(input,KW_NEW,FOLLOW_KW_NEW_in_synpred64_Fan1387); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_Fan

    // $ANTLR start synpred67_Fan
    public final void synpred67_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:293:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:293:8: ( methodFlags )* ( type | KW_VOID ) id parL
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:293:8: ( methodFlags )*
        loop150:
        do {
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( ((LA150_0>=KW_STATIC && LA150_0<=KW_NATIVE)||(LA150_0>=KW_OVERRIDE && LA150_0<=KW_FINAL)||(LA150_0>=KW_ABSTRACT && LA150_0<=KW_INTERNAL)||LA150_0==KW_ONCE) ) {
                alt150=1;
            }


            switch (alt150) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: methodFlags
        	    {
        	    pushFollow(FOLLOW_methodFlags_in_synpred67_Fan1401);
        	    methodFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop150;
            }
        } while (true);

        // src/net/colar/netbeans/fan/antlr/Fan.g:293:21: ( type | KW_VOID )
        int alt151=2;
        int LA151_0 = input.LA(1);

        if ( (LA151_0==SP_PIPE||LA151_0==ID||LA151_0==SQ_BRACKET_L) ) {
            alt151=1;
        }
        else if ( (LA151_0==KW_VOID) ) {
            alt151=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 151, 0, input);

            throw nvae;
        }
        switch (alt151) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:293:22: type
                {
                pushFollow(FOLLOW_type_in_synpred67_Fan1405);
                type();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:293:29: KW_VOID
                {
                match(input,KW_VOID,FOLLOW_KW_VOID_in_synpred67_Fan1409); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_id_in_synpred67_Fan1412);
        id();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_parL_in_synpred67_Fan1414);
        parL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_Fan

    // $ANTLR start synpred71_Fan
    public final void synpred71_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:301:29: ( getter )
        // src/net/colar/netbeans/fan/antlr/Fan.g:301:29: getter
        {
        pushFollow(FOLLOW_getter_in_synpred71_Fan1499);
        getter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_Fan

    // $ANTLR start synpred73_Fan
    public final void synpred73_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:301:55: ( block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:301:55: block
        {
        pushFollow(FOLLOW_block_in_synpred73_Fan1509);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_Fan

    // $ANTLR start synpred76_Fan
    public final void synpred76_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:304:12: ( type id )
        // src/net/colar/netbeans/fan/antlr/Fan.g:304:13: type id
        {
        pushFollow(FOLLOW_type_in_synpred76_Fan1556);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_id_in_synpred76_Fan1558);
        id();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_Fan

    // $ANTLR start synpred99_Fan
    public final void synpred99_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:15: ( multiStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:317:16: multiStmt
        {
        pushFollow(FOLLOW_multiStmt_in_synpred99_Fan1829);
        multiStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_Fan

    // $ANTLR start synpred108_Fan
    public final void synpred108_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:329:6: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:329:7: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred108_Fan2029);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_Fan

    // $ANTLR start synpred119_Fan
    public final void synpred119_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:22: ( exprStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:22: exprStmt
        {
        pushFollow(FOLLOW_exprStmt_in_synpred119_Fan2128);
        exprStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_Fan

    // $ANTLR start synpred120_Fan
    public final void synpred120_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:337:15: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:337:15: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred120_Fan2145);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_Fan

    // $ANTLR start synpred124_Fan
    public final void synpred124_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:347:6: ( KW_ELSE block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:347:6: KW_ELSE block
        {
        match(input,KW_ELSE,FOLLOW_KW_ELSE_in_synpred124_Fan2229); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred124_Fan2231);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_Fan

    // $ANTLR start synpred125_Fan
    public final void synpred125_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:348:23: ( eos )
        // src/net/colar/netbeans/fan/antlr/Fan.g:348:23: eos
        {
        pushFollow(FOLLOW_eos_in_synpred125_Fan2243);
        eos();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_Fan

    // $ANTLR start synpred128_Fan
    public final void synpred128_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:352:18: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:352:19: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred128_Fan2317);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred128_Fan

    // $ANTLR start synpred129_Fan
    public final void synpred129_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:352:52: ( KW_CATCH )
        // src/net/colar/netbeans/fan/antlr/Fan.g:352:53: KW_CATCH
        {
        match(input,KW_CATCH,FOLLOW_KW_CATCH_in_synpred129_Fan2329); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred129_Fan

    // $ANTLR start synpred130_Fan
    public final void synpred130_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:352:75: ( KW_FINALLY )
        // src/net/colar/netbeans/fan/antlr/Fan.g:352:76: KW_FINALLY
        {
        match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_synpred130_Fan2338); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_Fan

    // $ANTLR start synpred132_Fan
    public final void synpred132_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:356:12: ( forInitDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:356:12: forInitDef
        {
        pushFollow(FOLLOW_forInitDef_in_synpred132_Fan2383);
        forInitDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred132_Fan

    // $ANTLR start synpred134_Fan
    public final void synpred134_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:21: ( catchDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:21: catchDef
        {
        pushFollow(FOLLOW_catchDef_in_synpred134_Fan2412);
        catchDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred134_Fan

    // $ANTLR start synpred135_Fan
    public final void synpred135_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:32: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:359:33: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred135_Fan2417);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred135_Fan

    // $ANTLR start synpred136_Fan
    public final void synpred136_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:363:25: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:363:26: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred136_Fan2458);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_Fan

    // $ANTLR start synpred156_Fan
    public final void synpred156_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:388:26: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:388:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
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

        pushFollow(FOLLOW_bitAndExpr_in_synpred156_Fan2749);
        bitAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred156_Fan

    // $ANTLR start synpred157_Fan
    public final void synpred157_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:389:26: ( OP_CURRY shiftExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:389:26: OP_CURRY shiftExpr
        {
        match(input,OP_CURRY,FOLLOW_OP_CURRY_in_synpred157_Fan2763); if (state.failed) return ;
        pushFollow(FOLLOW_shiftExpr_in_synpred157_Fan2765);
        shiftExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred157_Fan

    // $ANTLR start synpred161_Fan
    public final void synpred161_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:391:22: ( ( OP_PLUS | OP_MINUS ) multExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:391:22: ( OP_PLUS | OP_MINUS ) multExpr
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

        pushFollow(FOLLOW_multExpr_in_synpred161_Fan2810);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred161_Fan

    // $ANTLR start synpred165_Fan
    public final void synpred165_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:393:24: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:393:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
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

        pushFollow(FOLLOW_parenExpr_in_synpred165_Fan2851);
        parenExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred165_Fan

    // $ANTLR start synpred166_Fan
    public final void synpred166_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:394:14: ( castExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:394:14: castExpr
        {
        pushFollow(FOLLOW_castExpr_in_synpred166_Fan2862);
        castExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred166_Fan

    // $ANTLR start synpred167_Fan
    public final void synpred167_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:394:25: ( groupedExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:394:25: groupedExpr
        {
        pushFollow(FOLLOW_groupedExpr_in_synpred167_Fan2866);
        groupedExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred167_Fan

    // $ANTLR start synpred168_Fan
    public final void synpred168_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:398:31: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:398:31: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred168_Fan2902);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred168_Fan

    // $ANTLR start synpred169_Fan
    public final void synpred169_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:399:14: ( prefixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:399:14: prefixExpr
        {
        pushFollow(FOLLOW_prefixExpr_in_synpred169_Fan2911);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred169_Fan

    // $ANTLR start synpred170_Fan
    public final void synpred170_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:399:27: ( postfixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:399:27: postfixExpr
        {
        pushFollow(FOLLOW_postfixExpr_in_synpred170_Fan2915);
        postfixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred170_Fan

    // $ANTLR start synpred178_Fan
    public final void synpred178_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:402:22: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:402:22: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred178_Fan2983);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred178_Fan

    // $ANTLR start synpred179_Fan
    public final void synpred179_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:13: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:13: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred179_Fan2993);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred179_Fan

    // $ANTLR start synpred180_Fan
    public final void synpred180_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:25: ( literal )
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:25: literal
        {
        pushFollow(FOLLOW_literal_in_synpred180_Fan2997);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred180_Fan

    // $ANTLR start synpred181_Fan
    public final void synpred181_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:35: ( typeBase )
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:35: typeBase
        {
        pushFollow(FOLLOW_typeBase_in_synpred181_Fan3001);
        typeBase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred181_Fan

    // $ANTLR start synpred182_Fan
    public final void synpred182_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:405:12: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:405:12: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred182_Fan3012);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred182_Fan

    // $ANTLR start synpred183_Fan
    public final void synpred183_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:405:26: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:405:26: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred183_Fan3016);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred183_Fan

    // $ANTLR start synpred184_Fan
    public final void synpred184_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:405:40: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:405:40: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred184_Fan3020);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred184_Fan

    // $ANTLR start synpred185_Fan
    public final void synpred185_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:405:53: ( staticCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:405:53: staticCall
        {
        pushFollow(FOLLOW_staticCall_in_synpred185_Fan3024);
        staticCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred185_Fan

    // $ANTLR start synpred186_Fan
    public final void synpred186_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:406:19: ( dsl )
        // src/net/colar/netbeans/fan/antlr/Fan.g:406:19: dsl
        {
        pushFollow(FOLLOW_dsl_in_synpred186_Fan3046);
        dsl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred186_Fan

    // $ANTLR start synpred187_Fan
    public final void synpred187_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:406:25: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:406:25: closure
        {
        pushFollow(FOLLOW_closure_in_synpred187_Fan3050);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred187_Fan

    // $ANTLR start synpred188_Fan
    public final void synpred188_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:406:35: ( simple )
        // src/net/colar/netbeans/fan/antlr/Fan.g:406:35: simple
        {
        pushFollow(FOLLOW_simple_in_synpred188_Fan3054);
        simple();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred188_Fan

    // $ANTLR start synpred199_Fan
    public final void synpred199_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:422:45: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:422:45: closure
        {
        pushFollow(FOLLOW_closure_in_synpred199_Fan3226);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred199_Fan

    // $ANTLR start synpred200_Fan
    public final void synpred200_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:426:12: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:426:12: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred200_Fan3260);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred200_Fan

    // $ANTLR start synpred202_Fan
    public final void synpred202_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:13: ( ( callParams closure ) )
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:13: ( callParams closure )
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:13: ( callParams closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:14: callParams closure
        {
        pushFollow(FOLLOW_callParams_in_synpred202_Fan3302);
        callParams();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_closure_in_synpred202_Fan3304);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred202_Fan

    // $ANTLR start synpred203_Fan
    public final void synpred203_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:36: ( callParams )
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:36: callParams
        {
        pushFollow(FOLLOW_callParams_in_synpred203_Fan3309);
        callParams();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred203_Fan

    // $ANTLR start synpred216_Fan
    public final void synpred216_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:438:20: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:438:20: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred216_Fan3398);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred216_Fan

    // $ANTLR start synpred217_Fan
    public final void synpred217_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:439:4: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:439:4: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred217_Fan3405);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred217_Fan

    // $ANTLR start synpred218_Fan
    public final void synpred218_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:439:18: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:439:18: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred218_Fan3409);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred218_Fan

    // $ANTLR start synpred219_Fan
    public final void synpred219_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:439:32: ( list )
        // src/net/colar/netbeans/fan/antlr/Fan.g:439:32: list
        {
        pushFollow(FOLLOW_list_in_synpred219_Fan3413);
        list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred219_Fan

    // $ANTLR start synpred220_Fan
    public final void synpred220_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:439:39: ( map )
        // src/net/colar/netbeans/fan/antlr/Fan.g:439:39: map
        {
        pushFollow(FOLLOW_map_in_synpred220_Fan3417);
        map();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred220_Fan

    // $ANTLR start synpred223_Fan
    public final void synpred223_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:445:11: ( type {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:445:11: type {...}?
        {
        pushFollow(FOLLOW_type_in_synpred223_Fan3512);
        type();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred223_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred223_Fan

    // $ANTLR start synpred227_Fan
    public final void synpred227_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:447:10: ( mapType {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:447:10: mapType {...}?
        {
        pushFollow(FOLLOW_mapType_in_synpred227_Fan3557);
        mapType();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred227_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred227_Fan

    // $ANTLR start synpred231_Fan
    public final void synpred231_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:452:12: ( DOC )
        // src/net/colar/netbeans/fan/antlr/Fan.g:452:12: DOC
        {
        match(input,DOC,FOLLOW_DOC_in_synpred231_Fan3629); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred231_Fan

    // $ANTLR start synpred234_Fan
    public final void synpred234_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:460:5: ( SP_SEMI )
        // src/net/colar/netbeans/fan/antlr/Fan.g:460:5: SP_SEMI
        {
        match(input,SP_SEMI,FOLLOW_SP_SEMI_in_synpred234_Fan3691); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred234_Fan

    // Delegated rules

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
    public final boolean synpred129_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_Fan_fragment(); // can never throw exception
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
    public final boolean synpred108_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_Fan_fragment(); // can never throw exception
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
    public final boolean synpred157_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred157_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_Fan_fragment(); // can never throw exception
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
    public final boolean synpred46_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred218_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred218_Fan_fragment(); // can never throw exception
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
    public final boolean synpred44_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_Fan_fragment(); // can never throw exception
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
    public final boolean synpred73_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_Fan_fragment(); // can never throw exception
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
    public final boolean synpred99_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_Fan_fragment(); // can never throw exception
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
    public final boolean synpred15_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred161_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred161_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_Fan_fragment(); // can never throw exception
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
    public final boolean synpred165_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred165_Fan_fragment(); // can never throw exception
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
    public final boolean synpred59_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred166_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred166_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred216_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred216_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_Fan_fragment(); // can never throw exception
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
    public final boolean synpred156_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred156_Fan_fragment(); // can never throw exception
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
    public final boolean synpred178_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred178_Fan_fragment(); // can never throw exception
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
    public final boolean synpred167_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred167_Fan_fragment(); // can never throw exception
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA107 dfa107 = new DFA107(this);
    protected DFA109 dfa109 = new DFA109(this);
    protected DFA111 dfa111 = new DFA111(this);
    protected DFA112 dfa112 = new DFA112(this);
    protected DFA113 dfa113 = new DFA113(this);
    protected DFA114 dfa114 = new DFA114(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA128 dfa128 = new DFA128(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\1\4\14\uffff";
    static final String DFA3_minS =
        "\1\24\2\0\12\uffff";
    static final String DFA3_maxS =
        "\1\u008d\2\0\12\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2\10\uffff";
    static final String DFA3_specialS =
        "\1\uffff\1\0\1\1\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\4\4\uffff\1\4\1\uffff\10\4\112\uffff\1\1\1\uffff\1\2\34\uffff"+
            "\1\3",
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
            return "229:18: ( podDef | ( typeDef )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Fan()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Fan()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\2\2\2\uffff";
    static final String DFA2_minS =
        "\2\24\2\uffff";
    static final String DFA2_maxS =
        "\2\160\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\3\4\uffff\1\3\1\uffff\10\3\112\uffff\1\1\1\uffff\1\3",
            "\2\3\4\uffff\1\3\1\uffff\10\3\112\uffff\1\1\1\uffff\1\3",
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
            return "()* loopback of 229:28: ( typeDef )*";
        }
    }
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\3\uffff\1\7\5\uffff\1\7\1\14\2\uffff";
    static final String DFA4_minS =
        "\1\21\2\150\1\21\1\162\2\150\1\uffff\1\150\2\21\2\uffff";
    static final String DFA4_maxS =
        "\1\21\1\161\1\150\1\u008d\1\162\2\150\1\uffff\1\150\2\u008d\2\uffff";
    static final String DFA4_acceptS =
        "\7\uffff\1\1\3\uffff\1\3\1\2";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\3\10\uffff\1\2",
            "\1\4",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\36\uffff\1\6\1\5"+
            "\11\uffff\1\7\40\uffff\1\7\1\uffff\1\7\34\uffff\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            "\1\3",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\36\uffff\1\6\1\5"+
            "\11\uffff\1\7\40\uffff\1\7\1\uffff\1\7\34\uffff\1\7",
            "\1\14\1\13\1\uffff\2\14\4\uffff\1\14\1\uffff\10\14\51\uffff"+
            "\1\14\40\uffff\1\14\1\uffff\1\14\34\uffff\1\14",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "231:5: ( usingPod | usingType | usingAs )";
        }
    }
    static final String DFA11_eotS =
        "\13\uffff";
    static final String DFA11_eofS =
        "\13\uffff";
    static final String DFA11_minS =
        "\1\24\3\0\1\uffff\3\0\3\uffff";
    static final String DFA11_maxS =
        "\1\160\3\0\1\uffff\3\0\3\uffff";
    static final String DFA11_acceptS =
        "\4\uffff\1\1\3\uffff\1\1\1\2\1\3";
    static final String DFA11_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\3\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\6\1\7\4\uffff\1\5\1\uffff\1\10\1\11\1\12\1\4\4\3\112\uffff"+
            "\1\1\1\uffff\1\2",
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "246:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                         
                        int index11_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_0==DOC) ) {s = 1;}

                        else if ( (LA11_0==AT) ) {s = 2;}

                        else if ( ((LA11_0>=KW_PRIVATE && LA11_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA11_0==KW_ABSTRACT) && (synpred13_Fan())) {s = 4;}

                        else if ( (LA11_0==KW_FINAL) ) {s = 5;}

                        else if ( (LA11_0==KW_CONST) ) {s = 6;}

                        else if ( (LA11_0==KW_STATIC) ) {s = 7;}

                        else if ( (LA11_0==KW_CLASS) && (synpred13_Fan())) {s = 8;}

                        else if ( (LA11_0==KW_ENUM) && (synpred15_Fan())) {s = 9;}

                        else if ( (LA11_0==KW_MIXIN) ) {s = 10;}

                         
                        input.seek(index11_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Fan()) ) {s = 8;}

                        else if ( (synpred15_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Fan()) ) {s = 8;}

                        else if ( (synpred15_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Fan()) ) {s = 8;}

                        else if ( (synpred15_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA48_eotS =
        "\23\uffff";
    static final String DFA48_eofS =
        "\23\uffff";
    static final String DFA48_minS =
        "\1\23\1\0\21\uffff";
    static final String DFA48_maxS =
        "\1\161\1\0\21\uffff";
    static final String DFA48_acceptS =
        "\2\uffff\1\2\17\uffff\1\1";
    static final String DFA48_specialS =
        "\1\uffff\1\0\21\uffff}>";
    static final String[] DFA48_transitionS = {
            "\2\2\1\1\5\2\4\uffff\7\2\45\uffff\1\2\34\uffff\1\2\5\uffff\1"+
            "\2\1\uffff\2\2",
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

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "289:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_1 = input.LA(1);

                         
                        int index48_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index48_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\22\uffff";
    static final String DFA47_eofS =
        "\22\uffff";
    static final String DFA47_minS =
        "\1\23\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA47_maxS =
        "\1\161\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA47_acceptS =
        "\4\uffff\1\1\4\uffff\1\2\5\uffff\1\3\2\uffff";
    static final String DFA47_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12"+
        "\1\13\1\14\3\uffff}>";
    static final String[] DFA47_transitionS = {
            "\2\17\1\10\1\12\1\17\1\6\1\5\1\13\4\uffff\1\7\4\3\1\4\1\11\45"+
            "\uffff\1\15\34\uffff\1\16\5\uffff\1\1\1\uffff\1\2\1\14",
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
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "291:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_0 = input.LA(1);

                         
                        int index47_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA47_0==DOC) ) {s = 1;}

                        else if ( (LA47_0==AT) ) {s = 2;}

                        else if ( ((LA47_0>=KW_PRIVATE && LA47_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA47_0==KW_NEW) && (synpred64_Fan())) {s = 4;}

                        else if ( (LA47_0==KW_VIRTUAL) ) {s = 5;}

                        else if ( (LA47_0==KW_OVERRIDE) ) {s = 6;}

                        else if ( (LA47_0==KW_ABSTRACT) ) {s = 7;}

                        else if ( (LA47_0==KW_STATIC) ) {s = 8;}

                        else if ( (LA47_0==KW_ONCE) && (synpred67_Fan())) {s = 9;}

                        else if ( (LA47_0==KW_NATIVE) ) {s = 10;}

                        else if ( (LA47_0==KW_FINAL) ) {s = 11;}

                        else if ( (LA47_0==SQ_BRACKET_L) ) {s = 12;}

                        else if ( (LA47_0==SP_PIPE) ) {s = 13;}

                        else if ( (LA47_0==ID) ) {s = 14;}

                        else if ( ((LA47_0>=KW_RD_ONLY && LA47_0<=KW_CONST)||LA47_0==KW_VOLATILE) ) {s = 15;}

                         
                        input.seek(index47_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_1 = input.LA(1);

                         
                        int index47_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_Fan()) ) {s = 4;}

                        else if ( (synpred67_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index47_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA47_2 = input.LA(1);

                         
                        int index47_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_Fan()) ) {s = 4;}

                        else if ( (synpred67_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index47_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA47_3 = input.LA(1);

                         
                        int index47_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_Fan()) ) {s = 4;}

                        else if ( (synpred67_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index47_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA47_5 = input.LA(1);

                         
                        int index47_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index47_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA47_6 = input.LA(1);

                         
                        int index47_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index47_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA47_7 = input.LA(1);

                         
                        int index47_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index47_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA47_8 = input.LA(1);

                         
                        int index47_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index47_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA47_10 = input.LA(1);

                         
                        int index47_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index47_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA47_11 = input.LA(1);

                         
                        int index47_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index47_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA47_12 = input.LA(1);

                         
                        int index47_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index47_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA47_13 = input.LA(1);

                         
                        int index47_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index47_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA47_14 = input.LA(1);

                         
                        int index47_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index47_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\12\uffff";
    static final String DFA57_eofS =
        "\3\uffff\1\11\6\uffff";
    static final String DFA57_minS =
        "\1\113\2\uffff\1\4\3\uffff\1\0\2\uffff";
    static final String DFA57_maxS =
        "\1\161\2\uffff\1\163\3\uffff\1\0\2\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\2\1\1\uffff\3\1\1\uffff\1\1\1\2";
    static final String DFA57_specialS =
        "\1\1\2\uffff\1\0\3\uffff\1\2\2\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\2\34\uffff\1\3\10\uffff\1\1",
            "",
            "",
            "\15\11\2\uffff\10\11\4\uffff\12\11\2\uffff\4\11\23\uffff\1"+
            "\4\1\uffff\3\11\1\10\1\11\1\5\1\6\1\11\1\uffff\1\11\13\uffff"+
            "\1\11\2\uffff\3\11\2\uffff\4\11\3\uffff\1\7\11\11\1\uffff\1"+
            "\11",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "304:11: ( ( type id )=> typeAndId | fieldId )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_3 = input.LA(1);

                         
                        int index57_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_3==SP_COLCOL) && (synpred76_Fan())) {s = 4;}

                        else if ( (LA57_3==SP_QMARK) && (synpred76_Fan())) {s = 5;}

                        else if ( (LA57_3==LIST_TYPE) && (synpred76_Fan())) {s = 6;}

                        else if ( (LA57_3==ID) ) {s = 7;}

                        else if ( (LA57_3==SP_COLON) && (synpred76_Fan())) {s = 8;}

                        else if ( (LA57_3==EOF||(LA57_3>=KW_BREAK && LA57_3<=KW_FINALLY)||(LA57_3>=KW_RD_ONLY && LA57_3<=KW_FINAL)||(LA57_3>=KW_ABSTRACT && LA57_3<=KW_ELSE)||(LA57_3>=KW_NULL && LA57_3<=KW_FALSE)||(LA57_3>=BRACKET_L && LA57_3<=AS_INIT_VAL)||LA57_3==SP_COMMA||LA57_3==SP_PIPE||LA57_3==SP_SEMI||LA57_3==OP_CURRY||(LA57_3>=OP_PLUS && LA57_3<=OP_MULTI)||(LA57_3>=OP_BANG && LA57_3<=OP_TILDA)||(LA57_3>=URI && LA57_3<=SQ_BRACKET_L)||LA57_3==PAR_L) ) {s = 9;}

                         
                        input.seek(index57_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_0==SQ_BRACKET_L) && (synpred76_Fan())) {s = 1;}

                        else if ( (LA57_0==SP_PIPE) && (synpred76_Fan())) {s = 2;}

                        else if ( (LA57_0==ID) ) {s = 3;}

                         
                        input.seek(index57_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_7 = input.LA(1);

                         
                        int index57_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index57_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA75_eotS =
        "\36\uffff";
    static final String DFA75_eofS =
        "\36\uffff";
    static final String DFA75_minS =
        "\1\4\14\uffff\1\0\14\uffff\2\0\2\uffff";
    static final String DFA75_maxS =
        "\1\163\14\uffff\1\0\14\uffff\2\0\2\uffff";
    static final String DFA75_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\22\uffff\1\13";
    static final String DFA75_specialS =
        "\15\uffff\1\0\14\uffff\1\1\1\2\2\uffff}>";
    static final String[] DFA75_transitionS = {
            "\1\4\1\5\1\2\1\1\1\6\1\7\1\10\1\3\1\11\31\uffff\2\12\3\uffff"+
            "\4\12\34\uffff\1\33\15\uffff\1\12\2\uffff\3\12\2\uffff\4\12"+
            "\3\uffff\1\15\5\12\1\uffff\1\12\1\uffff\1\32\1\uffff\1\12",
            "",
            "",
            "",
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

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "333:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_13 = input.LA(1);

                         
                        int index75_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index75_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA75_26 = input.LA(1);

                         
                        int index75_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index75_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA75_27 = input.LA(1);

                         
                        int index75_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index75_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\65\uffff";
    static final String DFA76_eofS =
        "\1\1\64\uffff";
    static final String DFA76_minS =
        "\1\4\4\uffff\1\0\12\uffff\2\0\5\uffff\31\0\5\uffff";
    static final String DFA76_maxS =
        "\1\163\4\uffff\1\0\12\uffff\2\0\5\uffff\31\0\5\uffff";
    static final String DFA76_acceptS =
        "\1\uffff\1\2\62\uffff\1\1";
    static final String DFA76_specialS =
        "\5\uffff\1\0\12\uffff\1\1\1\2\5\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1"+
        "\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
        "\1\26\1\27\1\30\1\31\1\32\1\33\5\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\32\1\33\1\30\1\27\1\34\1\35\1\36\1\31\1\37\4\1\2\uffff\10"+
            "\1\4\uffff\7\1\1\44\1\45\1\1\2\uffff\1\43\1\46\1\47\1\50\26"+
            "\uffff\1\1\2\uffff\1\1\2\uffff\1\21\1\uffff\1\1\13\uffff\1\54"+
            "\2\uffff\1\54\1\41\1\42\2\uffff\4\54\3\uffff\1\5\1\53\1\56\1"+
            "\51\1\52\1\57\1\1\1\55\1\1\1\20\1\uffff\1\40",
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
            "\1\uffff",
            "\1\uffff",
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
            return "()* loopback of 337:15: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_5 = input.LA(1);

                         
                        int index76_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_16 = input.LA(1);

                         
                        int index76_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_16);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_17 = input.LA(1);

                         
                        int index76_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_17);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_23 = input.LA(1);

                         
                        int index76_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_23);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA76_24 = input.LA(1);

                         
                        int index76_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_24);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA76_25 = input.LA(1);

                         
                        int index76_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_25);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA76_26 = input.LA(1);

                         
                        int index76_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_26);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA76_27 = input.LA(1);

                         
                        int index76_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_27);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA76_28 = input.LA(1);

                         
                        int index76_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_28);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA76_29 = input.LA(1);

                         
                        int index76_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_29);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA76_30 = input.LA(1);

                         
                        int index76_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_30);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA76_31 = input.LA(1);

                         
                        int index76_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_31);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA76_32 = input.LA(1);

                         
                        int index76_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred120_Fan()&&(notAfterEol()))||synpred120_Fan())) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_32);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA76_33 = input.LA(1);

                         
                        int index76_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_33);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA76_34 = input.LA(1);

                         
                        int index76_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_34);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA76_35 = input.LA(1);

                         
                        int index76_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_35);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA76_36 = input.LA(1);

                         
                        int index76_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_36);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA76_37 = input.LA(1);

                         
                        int index76_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_37);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA76_38 = input.LA(1);

                         
                        int index76_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_38);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA76_39 = input.LA(1);

                         
                        int index76_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_39);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA76_40 = input.LA(1);

                         
                        int index76_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_40);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA76_41 = input.LA(1);

                         
                        int index76_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_41);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA76_42 = input.LA(1);

                         
                        int index76_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_42);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA76_43 = input.LA(1);

                         
                        int index76_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_43);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA76_44 = input.LA(1);

                         
                        int index76_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_44);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA76_45 = input.LA(1);

                         
                        int index76_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_45);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA76_46 = input.LA(1);

                         
                        int index76_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_46);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA76_47 = input.LA(1);

                         
                        int index76_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred120_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_47);
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
    static final String DFA81_eotS =
        "\65\uffff";
    static final String DFA81_eofS =
        "\1\1\64\uffff";
    static final String DFA81_minS =
        "\1\4\3\uffff\1\0\12\uffff\2\0\16\uffff\20\0\6\uffff";
    static final String DFA81_maxS =
        "\1\163\3\uffff\1\0\12\uffff\2\0\16\uffff\20\0\6\uffff";
    static final String DFA81_acceptS =
        "\1\uffff\1\1\62\uffff\1\2";
    static final String DFA81_specialS =
        "\4\uffff\1\0\12\uffff\1\1\1\2\16\uffff\1\3\1\4\1\5\1\6\1\7\1\10"+
        "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\6\uffff}>";
    static final String[] DFA81_transitionS = {
            "\15\1\2\uffff\10\1\4\uffff\7\1\1\43\1\44\1\1\2\uffff\1\42\1"+
            "\45\1\46\1\47\26\uffff\1\1\2\uffff\1\1\2\uffff\1\20\1\uffff"+
            "\1\1\13\uffff\1\53\2\uffff\1\53\1\40\1\41\2\uffff\4\53\3\uffff"+
            "\1\4\1\52\1\55\1\50\1\51\1\56\1\1\1\54\1\1\1\17\1\uffff\1\37",
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
            return "348:22: ( eos | expr eos )";
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
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_15 = input.LA(1);

                         
                        int index81_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_16 = input.LA(1);

                         
                        int index81_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_31 = input.LA(1);

                         
                        int index81_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred125_Fan()&&(lookupNL()))||((synpred125_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred125_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred125_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred125_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred125_Fan()&&(lookupNL()))&&(notAfterEol())))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_31);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_32 = input.LA(1);

                         
                        int index81_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_32);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA81_33 = input.LA(1);

                         
                        int index81_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_33);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA81_34 = input.LA(1);

                         
                        int index81_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_34);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA81_35 = input.LA(1);

                         
                        int index81_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_35);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA81_36 = input.LA(1);

                         
                        int index81_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_36);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA81_37 = input.LA(1);

                         
                        int index81_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_37);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA81_38 = input.LA(1);

                         
                        int index81_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_38);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA81_39 = input.LA(1);

                         
                        int index81_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_39);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA81_40 = input.LA(1);

                         
                        int index81_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_40);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA81_41 = input.LA(1);

                         
                        int index81_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_41);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA81_42 = input.LA(1);

                         
                        int index81_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_42);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA81_43 = input.LA(1);

                         
                        int index81_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_43);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA81_44 = input.LA(1);

                         
                        int index81_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_44);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA81_45 = input.LA(1);

                         
                        int index81_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_45);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA81_46 = input.LA(1);

                         
                        int index81_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred125_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index81_46);
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
    static final String DFA88_eotS =
        "\25\uffff";
    static final String DFA88_eofS =
        "\25\uffff";
    static final String DFA88_minS =
        "\1\46\3\0\21\uffff";
    static final String DFA88_maxS =
        "\1\163\3\0\21\uffff";
    static final String DFA88_acceptS =
        "\4\uffff\1\2\17\uffff\1\1";
    static final String DFA88_specialS =
        "\1\uffff\1\0\1\1\1\2\21\uffff}>";
    static final String[] DFA88_transitionS = {
            "\2\4\3\uffff\4\4\34\uffff\1\2\15\uffff\1\4\2\uffff\3\4\2\uffff"+
            "\4\4\3\uffff\1\3\5\4\1\uffff\1\4\1\uffff\1\1\1\uffff\1\4",
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

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "356:1: forInit : ( forInitDef | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA88_1 = input.LA(1);

                         
                        int index88_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index88_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA88_2 = input.LA(1);

                         
                        int index88_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index88_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA88_3 = input.LA(1);

                         
                        int index88_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index88_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 88, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA90_eotS =
        "\66\uffff";
    static final String DFA90_eofS =
        "\1\2\65\uffff";
    static final String DFA90_minS =
        "\1\4\1\0\64\uffff";
    static final String DFA90_maxS =
        "\1\163\1\0\64\uffff";
    static final String DFA90_acceptS =
        "\2\uffff\1\2\62\uffff\1\1";
    static final String DFA90_specialS =
        "\1\uffff\1\0\64\uffff}>";
    static final String[] DFA90_transitionS = {
            "\15\2\2\uffff\10\2\4\uffff\12\2\2\uffff\4\2\25\uffff\2\2\2\uffff"+
            "\1\2\2\uffff\1\2\1\uffff\1\2\13\uffff\1\2\2\uffff\3\2\2\uffff"+
            "\4\2\3\uffff\12\2\1\uffff\1\1",
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
            return "359:21: ( catchDef )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA90_1 = input.LA(1);

                         
                        int index90_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 53;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index90_1);
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
    static final String DFA106_eotS =
        "\106\uffff";
    static final String DFA106_eofS =
        "\1\1\105\uffff";
    static final String DFA106_minS =
        "\1\4\15\uffff\1\0\67\uffff";
    static final String DFA106_maxS =
        "\1\u008d\15\uffff\1\0\67\uffff";
    static final String DFA106_acceptS =
        "\1\uffff\1\2\103\uffff\1\1";
    static final String DFA106_specialS =
        "\16\uffff\1\0\67\uffff}>";
    static final String[] DFA106_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\25\uffff\2\1\1\uffff\3\1\1\uffff"+
            "\1\16\1\uffff\13\1\1\105\1\1\2\uffff\3\1\2\uffff\4\1\3\uffff"+
            "\15\1\30\uffff\1\1",
            "",
            "",
            "",
            "",
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
            "",
            "",
            "",
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

    static final short[] DFA106_eot = DFA.unpackEncodedString(DFA106_eotS);
    static final short[] DFA106_eof = DFA.unpackEncodedString(DFA106_eofS);
    static final char[] DFA106_min = DFA.unpackEncodedStringToUnsignedChars(DFA106_minS);
    static final char[] DFA106_max = DFA.unpackEncodedStringToUnsignedChars(DFA106_maxS);
    static final short[] DFA106_accept = DFA.unpackEncodedString(DFA106_acceptS);
    static final short[] DFA106_special = DFA.unpackEncodedString(DFA106_specialS);
    static final short[][] DFA106_transition;

    static {
        int numStates = DFA106_transitionS.length;
        DFA106_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA106_transition[i] = DFA.unpackEncodedString(DFA106_transitionS[i]);
        }
    }

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = DFA106_eot;
            this.eof = DFA106_eof;
            this.min = DFA106_min;
            this.max = DFA106_max;
            this.accept = DFA106_accept;
            this.special = DFA106_special;
            this.transition = DFA106_transition;
        }
        public String getDescription() {
            return "()* loopback of 388:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA106_14 = input.LA(1);

                         
                        int index106_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred156_Fan()) ) {s = 69;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index106_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 106, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA107_eotS =
        "\110\uffff";
    static final String DFA107_eofS =
        "\1\1\107\uffff";
    static final String DFA107_minS =
        "\1\4\67\uffff\1\0\17\uffff";
    static final String DFA107_maxS =
        "\1\u008d\67\uffff\1\0\17\uffff";
    static final String DFA107_acceptS =
        "\1\uffff\1\2\105\uffff\1\1";
    static final String DFA107_specialS =
        "\70\uffff\1\0\17\uffff}>";
    static final String[] DFA107_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\25\uffff\2\1\1\uffff\3\1\1\uffff"+
            "\1\1\1\uffff\14\1\1\70\2\uffff\3\1\2\uffff\4\1\3\uffff\15\1"+
            "\30\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA107_eot = DFA.unpackEncodedString(DFA107_eotS);
    static final short[] DFA107_eof = DFA.unpackEncodedString(DFA107_eofS);
    static final char[] DFA107_min = DFA.unpackEncodedStringToUnsignedChars(DFA107_minS);
    static final char[] DFA107_max = DFA.unpackEncodedStringToUnsignedChars(DFA107_maxS);
    static final short[] DFA107_accept = DFA.unpackEncodedString(DFA107_acceptS);
    static final short[] DFA107_special = DFA.unpackEncodedString(DFA107_specialS);
    static final short[][] DFA107_transition;

    static {
        int numStates = DFA107_transitionS.length;
        DFA107_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA107_transition[i] = DFA.unpackEncodedString(DFA107_transitionS[i]);
        }
    }

    class DFA107 extends DFA {

        public DFA107(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 107;
            this.eot = DFA107_eot;
            this.eof = DFA107_eof;
            this.min = DFA107_min;
            this.max = DFA107_max;
            this.accept = DFA107_accept;
            this.special = DFA107_special;
            this.transition = DFA107_transition;
        }
        public String getDescription() {
            return "()* loopback of 389:25: ( OP_CURRY shiftExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA107_56 = input.LA(1);

                         
                        int index107_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred157_Fan()) ) {s = 71;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index107_56);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 107, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA109_eotS =
        "\112\uffff";
    static final String DFA109_eofS =
        "\1\1\111\uffff";
    static final String DFA109_minS =
        "\1\4\56\uffff\1\0\12\uffff\1\0\17\uffff";
    static final String DFA109_maxS =
        "\1\u008d\56\uffff\1\0\12\uffff\1\0\17\uffff";
    static final String DFA109_acceptS =
        "\1\uffff\1\2\107\uffff\1\1";
    static final String DFA109_specialS =
        "\57\uffff\1\0\12\uffff\1\1\17\uffff}>";
    static final String[] DFA109_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\25\uffff\2\1\1\uffff\3\1\1\uffff"+
            "\1\1\1\uffff\17\1\1\72\1\57\1\1\2\uffff\4\1\3\uffff\15\1\30"+
            "\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 391:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_47 = input.LA(1);

                         
                        int index109_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred161_Fan()) ) {s = 73;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index109_47);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA109_58 = input.LA(1);

                         
                        int index109_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred161_Fan()) ) {s = 73;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index109_58);
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
    static final String DFA111_eotS =
        "\26\uffff";
    static final String DFA111_eofS =
        "\26\uffff";
    static final String DFA111_minS =
        "\1\46\1\0\24\uffff";
    static final String DFA111_maxS =
        "\1\163\1\0\24\uffff";
    static final String DFA111_acceptS =
        "\2\uffff\1\3\21\uffff\1\1\1\2";
    static final String DFA111_specialS =
        "\1\uffff\1\0\24\uffff}>";
    static final String[] DFA111_transitionS = {
            "\2\2\3\uffff\4\2\34\uffff\1\2\15\uffff\1\2\2\uffff\3\2\2\uffff"+
            "\4\2\3\uffff\6\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\1",
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

    static final short[] DFA111_eot = DFA.unpackEncodedString(DFA111_eotS);
    static final short[] DFA111_eof = DFA.unpackEncodedString(DFA111_eofS);
    static final char[] DFA111_min = DFA.unpackEncodedStringToUnsignedChars(DFA111_minS);
    static final char[] DFA111_max = DFA.unpackEncodedStringToUnsignedChars(DFA111_maxS);
    static final short[] DFA111_accept = DFA.unpackEncodedString(DFA111_acceptS);
    static final short[] DFA111_special = DFA.unpackEncodedString(DFA111_specialS);
    static final short[][] DFA111_transition;

    static {
        int numStates = DFA111_transitionS.length;
        DFA111_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA111_transition[i] = DFA.unpackEncodedString(DFA111_transitionS[i]);
        }
    }

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = DFA111_eot;
            this.eof = DFA111_eof;
            this.min = DFA111_min;
            this.max = DFA111_max;
            this.accept = DFA111_accept;
            this.special = DFA111_special;
            this.transition = DFA111_transition;
        }
        public String getDescription() {
            return "394:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA111_1 = input.LA(1);

                         
                        int index111_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred166_Fan()&&(notAfterEol()))) ) {s = 20;}

                        else if ( (synpred167_Fan()) ) {s = 21;}

                         
                        input.seek(index111_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 111, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA112_eotS =
        "\116\uffff";
    static final String DFA112_eofS =
        "\1\1\115\uffff";
    static final String DFA112_minS =
        "\1\4\22\uffff\1\0\2\uffff\1\0\31\uffff\1\0\35\uffff";
    static final String DFA112_maxS =
        "\1\u008d\22\uffff\1\0\2\uffff\1\0\31\uffff\1\0\35\uffff";
    static final String DFA112_acceptS =
        "\1\uffff\1\2\110\uffff\1\1\3\uffff";
    static final String DFA112_specialS =
        "\23\uffff\1\0\2\uffff\1\1\31\uffff\1\2\35\uffff}>";
    static final String[] DFA112_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\24\uffff\1\112\1\26\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\112\30\1\1\uffff\2\112\11\1\1\23\1\1\1\60"+
            "\1\1\30\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 398:31: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA112_19 = input.LA(1);

                         
                        int index112_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred168_Fan()&&(notAfterEol()))) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index112_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA112_22 = input.LA(1);

                         
                        int index112_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred168_Fan()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index112_22);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA112_48 = input.LA(1);

                         
                        int index112_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred168_Fan()&&(notAfterEol()))) ) {s = 74;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL())||((lookupNL())&&(notAfterEol())))) ) {s = 1;}

                         
                        input.seek(index112_48);
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
    static final String DFA113_eotS =
        "\25\uffff";
    static final String DFA113_eofS =
        "\25\uffff";
    static final String DFA113_minS =
        "\1\46\14\0\1\uffff\5\0\2\uffff";
    static final String DFA113_maxS =
        "\1\161\14\0\1\uffff\5\0\2\uffff";
    static final String DFA113_acceptS =
        "\15\uffff\1\1\5\uffff\1\2\1\3";
    static final String DFA113_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\14\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] DFA113_transitionS = {
            "\1\5\1\6\3\uffff\1\4\1\7\1\10\1\11\34\uffff\1\21\15\uffff\1"+
            "\15\2\uffff\1\15\1\1\1\2\2\uffff\4\15\3\uffff\1\3\1\14\1\17"+
            "\1\12\1\13\1\22\1\uffff\1\16\1\uffff\1\20",
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

    static final short[] DFA113_eot = DFA.unpackEncodedString(DFA113_eotS);
    static final short[] DFA113_eof = DFA.unpackEncodedString(DFA113_eofS);
    static final char[] DFA113_min = DFA.unpackEncodedStringToUnsignedChars(DFA113_minS);
    static final char[] DFA113_max = DFA.unpackEncodedStringToUnsignedChars(DFA113_maxS);
    static final short[] DFA113_accept = DFA.unpackEncodedString(DFA113_acceptS);
    static final short[] DFA113_special = DFA.unpackEncodedString(DFA113_specialS);
    static final short[][] DFA113_transition;

    static {
        int numStates = DFA113_transitionS.length;
        DFA113_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA113_transition[i] = DFA.unpackEncodedString(DFA113_transitionS[i]);
        }
    }

    class DFA113 extends DFA {

        public DFA113(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 113;
            this.eot = DFA113_eot;
            this.eof = DFA113_eof;
            this.min = DFA113_min;
            this.max = DFA113_max;
            this.accept = DFA113_accept;
            this.special = DFA113_special;
            this.transition = DFA113_transition;
        }
        public String getDescription() {
            return "399:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA113_1 = input.LA(1);

                         
                        int index113_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred169_Fan()) ) {s = 13;}

                        else if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA113_2 = input.LA(1);

                         
                        int index113_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA113_3 = input.LA(1);

                         
                        int index113_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA113_4 = input.LA(1);

                         
                        int index113_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA113_5 = input.LA(1);

                         
                        int index113_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA113_6 = input.LA(1);

                         
                        int index113_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA113_7 = input.LA(1);

                         
                        int index113_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA113_8 = input.LA(1);

                         
                        int index113_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA113_9 = input.LA(1);

                         
                        int index113_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA113_10 = input.LA(1);

                         
                        int index113_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA113_11 = input.LA(1);

                         
                        int index113_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA113_12 = input.LA(1);

                         
                        int index113_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA113_14 = input.LA(1);

                         
                        int index113_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA113_15 = input.LA(1);

                         
                        int index113_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA113_16 = input.LA(1);

                         
                        int index113_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA113_17 = input.LA(1);

                         
                        int index113_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA113_18 = input.LA(1);

                         
                        int index113_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index113_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 113, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA114_eotS =
        "\117\uffff";
    static final String DFA114_eofS =
        "\1\1\116\uffff";
    static final String DFA114_minS =
        "\1\4\22\uffff\1\0\2\uffff\1\0\31\uffff\1\0\36\uffff";
    static final String DFA114_maxS =
        "\1\u008d\22\uffff\1\0\2\uffff\1\0\31\uffff\1\0\36\uffff";
    static final String DFA114_acceptS =
        "\1\uffff\1\2\111\uffff\1\1\3\uffff";
    static final String DFA114_specialS =
        "\23\uffff\1\0\2\uffff\1\1\31\uffff\1\2\36\uffff}>";
    static final String[] DFA114_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\24\uffff\1\113\1\26\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\113\30\1\1\uffff\2\113\11\1\1\23\1\1\1\60"+
            "\1\1\30\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 402:22: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA114_19 = input.LA(1);

                         
                        int index114_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred178_Fan()&&(notAfterEol()))) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index114_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA114_22 = input.LA(1);

                         
                        int index114_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_Fan()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index114_22);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA114_48 = input.LA(1);

                         
                        int index114_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred178_Fan()&&(notAfterEol()))) ) {s = 75;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL()))) ) {s = 1;}

                         
                        input.seek(index114_48);
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
        "\24\uffff";
    static final String DFA115_eofS =
        "\24\uffff";
    static final String DFA115_minS =
        "\1\46\1\uffff\1\0\14\uffff\3\0\2\uffff";
    static final String DFA115_maxS =
        "\1\161\1\uffff\1\0\14\uffff\3\0\2\uffff";
    static final String DFA115_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\16\uffff\1\3\1\4";
    static final String DFA115_specialS =
        "\2\uffff\1\0\14\uffff\1\1\1\2\1\3\2\uffff}>";
    static final String[] DFA115_transitionS = {
            "\2\3\3\uffff\4\3\34\uffff\1\20\21\uffff\1\3\1\1\11\uffff\1\2"+
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
            return "404:1: termBase : ( idExprReq | literal | typeBase | id );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA115_2 = input.LA(1);

                         
                        int index115_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred179_Fan()) ) {s = 1;}

                        else if ( (synpred180_Fan()) ) {s = 3;}

                        else if ( (synpred181_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index115_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA115_15 = input.LA(1);

                         
                        int index115_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_Fan()) ) {s = 3;}

                        else if ( (synpred181_Fan()) ) {s = 18;}

                         
                        input.seek(index115_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA115_16 = input.LA(1);

                         
                        int index115_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_Fan()) ) {s = 3;}

                        else if ( (synpred181_Fan()) ) {s = 18;}

                         
                        input.seek(index115_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA115_17 = input.LA(1);

                         
                        int index115_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_Fan()) ) {s = 3;}

                        else if ( (synpred181_Fan()) ) {s = 18;}

                         
                        input.seek(index115_17);
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
        "\14\uffff";
    static final String DFA116_eofS =
        "\14\uffff";
    static final String DFA116_minS =
        "\1\113\3\0\10\uffff";
    static final String DFA116_maxS =
        "\1\161\3\0\10\uffff";
    static final String DFA116_acceptS =
        "\4\uffff\1\2\1\1\1\4\1\7\1\10\1\6\1\3\1\5";
    static final String DFA116_specialS =
        "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] DFA116_transitionS = {
            "\1\2\34\uffff\1\3\4\uffff\1\4\3\uffff\1\1",
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
            return "405:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );";
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
                        if ( (synpred182_Fan()) ) {s = 5;}

                        else if ( (synpred183_Fan()) ) {s = 4;}

                        else if ( (synpred185_Fan()) ) {s = 6;}

                        else if ( (synpred188_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index116_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA116_2 = input.LA(1);

                         
                        int index116_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 5;}

                        else if ( (synpred183_Fan()) ) {s = 4;}

                        else if ( (synpred185_Fan()) ) {s = 6;}

                        else if ( (synpred187_Fan()) ) {s = 9;}

                        else if ( (synpred188_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index116_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA116_3 = input.LA(1);

                         
                        int index116_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 5;}

                        else if ( (synpred183_Fan()) ) {s = 4;}

                        else if ( (synpred184_Fan()) ) {s = 10;}

                        else if ( (synpred185_Fan()) ) {s = 6;}

                        else if ( (synpred186_Fan()) ) {s = 11;}

                        else if ( (synpred188_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index116_3);
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
    static final String DFA122_eotS =
        "\120\uffff";
    static final String DFA122_eofS =
        "\1\1\117\uffff";
    static final String DFA122_minS =
        "\1\4\5\uffff\1\0\111\uffff";
    static final String DFA122_maxS =
        "\1\u008d\5\uffff\1\0\111\uffff";
    static final String DFA122_acceptS =
        "\1\uffff\1\2\115\uffff\1\1";
    static final String DFA122_specialS =
        "\6\uffff\1\0\111\uffff}>";
    static final String[] DFA122_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\24\uffff\3\1\1\uffff\3\1\1\uffff"+
            "\1\6\31\1\1\uffff\17\1\30\uffff\1\1",
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
            "",
            ""
    };

    static final short[] DFA122_eot = DFA.unpackEncodedString(DFA122_eotS);
    static final short[] DFA122_eof = DFA.unpackEncodedString(DFA122_eofS);
    static final char[] DFA122_min = DFA.unpackEncodedStringToUnsignedChars(DFA122_minS);
    static final char[] DFA122_max = DFA.unpackEncodedStringToUnsignedChars(DFA122_maxS);
    static final short[] DFA122_accept = DFA.unpackEncodedString(DFA122_acceptS);
    static final short[] DFA122_special = DFA.unpackEncodedString(DFA122_specialS);
    static final short[][] DFA122_transition;

    static {
        int numStates = DFA122_transitionS.length;
        DFA122_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA122_transition[i] = DFA.unpackEncodedString(DFA122_transitionS[i]);
        }
    }

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = DFA122_eot;
            this.eof = DFA122_eof;
            this.min = DFA122_min;
            this.max = DFA122_max;
            this.accept = DFA122_accept;
            this.special = DFA122_special;
            this.transition = DFA122_transition;
        }
        public String getDescription() {
            return "()* loopback of 422:45: ( closure )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA122_6 = input.LA(1);

                         
                        int index122_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred199_Fan()) ) {s = 79;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index122_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 122, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA128_eotS =
        "\26\uffff";
    static final String DFA128_eofS =
        "\26\uffff";
    static final String DFA128_minS =
        "\1\46\14\uffff\3\0\6\uffff";
    static final String DFA128_maxS =
        "\1\161\14\uffff\3\0\6\uffff";
    static final String DFA128_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\uffff\1"+
        "\12\3\uffff\1\14\1\13\1\15\1\16\1\17\1\20";
    static final String DFA128_specialS =
        "\15\uffff\1\0\1\1\1\2\6\uffff}>";
    static final String[] DFA128_transitionS = {
            "\1\2\1\3\3\uffff\1\1\1\4\1\5\1\6\34\uffff\1\17\21\uffff\1\12"+
            "\12\uffff\1\15\1\11\1\14\2\7\1\20\1\uffff\1\12\1\uffff\1\16",
            "",
            "",
            "",
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

    static final short[] DFA128_eot = DFA.unpackEncodedString(DFA128_eotS);
    static final short[] DFA128_eof = DFA.unpackEncodedString(DFA128_eofS);
    static final char[] DFA128_min = DFA.unpackEncodedStringToUnsignedChars(DFA128_minS);
    static final char[] DFA128_max = DFA.unpackEncodedStringToUnsignedChars(DFA128_maxS);
    static final short[] DFA128_accept = DFA.unpackEncodedString(DFA128_acceptS);
    static final short[] DFA128_special = DFA.unpackEncodedString(DFA128_specialS);
    static final short[][] DFA128_transition;

    static {
        int numStates = DFA128_transitionS.length;
        DFA128_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA128_transition[i] = DFA.unpackEncodedString(DFA128_transitionS[i]);
        }
    }

    class DFA128 extends DFA {

        public DFA128(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 128;
            this.eot = DFA128_eot;
            this.eof = DFA128_eof;
            this.min = DFA128_min;
            this.max = DFA128_max;
            this.accept = DFA128_accept;
            this.special = DFA128_special;
            this.transition = DFA128_transition;
        }
        public String getDescription() {
            return "437:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA128_13 = input.LA(1);

                         
                        int index128_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred216_Fan()) ) {s = 17;}

                        else if ( (synpred217_Fan()) ) {s = 16;}

                        else if ( (synpred218_Fan()) ) {s = 18;}

                        else if ( (synpred219_Fan()) ) {s = 19;}

                        else if ( (synpred220_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index128_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA128_14 = input.LA(1);

                         
                        int index128_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred217_Fan()) ) {s = 16;}

                        else if ( (synpred218_Fan()) ) {s = 18;}

                        else if ( (synpred219_Fan()) ) {s = 19;}

                        else if ( (synpred220_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index128_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA128_15 = input.LA(1);

                         
                        int index128_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred217_Fan()) ) {s = 16;}

                        else if ( (synpred218_Fan()) ) {s = 18;}

                        else if ( (synpred219_Fan()) ) {s = 19;}

                        else if ( (synpred220_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index128_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 128, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_using_in_prog409 = new BitSet(new long[]{0x0000000FF4320000L,0x0001400000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_podDef_in_prog413 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_typeDef_in_prog417 = new BitSet(new long[]{0x0000000FF4300000L,0x0001400000000000L});
    public static final BitSet FOLLOW_docs_in_prog421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingPod_in_using443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingType_in_using447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingAs_in_using451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingPod461 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_podSpec_in_usingPod463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_eos_in_usingPod465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingType475 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_podSpec_in_usingType477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingType479 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_usingType481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_eos_in_usingType483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingAs491 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_podSpec_in_usingAs493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingAs495 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_usingAs497 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KW_AS_in_usingAs499 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_usingAs501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_eos_in_usingAs503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ffi_in_podSpec511 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_podSpec514 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_podSpec517 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_podSpec519 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_sq_bracketL_in_ffi530 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_ffi532 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_ffi534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_podHeader_in_podDef543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_BRACKET_L_in_podDef545 = new BitSet(new long[]{0x0000000002000000L,0x0002010000000820L});
    public static final BitSet FOLLOW_symbolDef_in_podDef547 = new BitSet(new long[]{0x0000000002000000L,0x0002010000000820L});
    public static final BitSet FOLLOW_BRACKET_R_in_podDef550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_podHeader557 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_facet_in_podHeader559 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_podHeader562 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_podHeader564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbolFlag_in_symbolDef571 = new BitSet(new long[]{0x0000000002000000L,0x0002010000000800L});
    public static final BitSet FOLLOW_typeId_in_symbolDef574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_symbolDef576 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_symbolDef578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_eos_in_symbolDef580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_symbolFlag587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_typeDef597 = new BitSet(new long[]{0x0000000FF4300000L,0x0001400000000000L});
    public static final BitSet FOLLOW_facet_in_typeDef599 = new BitSet(new long[]{0x0000000FF4300000L,0x0001400000000000L});
    public static final BitSet FOLLOW_classDef_in_typeDef610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDef_in_typeDef624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinDef_in_typeDef628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classHeader_in_classDef650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_classBody_in_classDef652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_classHeader675 = new BitSet(new long[]{0x0000000F94300000L,0x0001000000000000L});
    public static final BitSet FOLLOW_facet_in_classHeader677 = new BitSet(new long[]{0x0000000F94300000L,0x0001000000000000L});
    public static final BitSet FOLLOW_classFlags_in_classHeader682 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_classHeader685 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_classHeader689 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_inheritance_in_classHeader691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_classFlags727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_classFlags731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_classFlags735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_classFlags739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_classFlags743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_classBody752 = new BitSet(new long[]{0x0000003F87F80000L,0x0003410000000820L});
    public static final BitSet FOLLOW_slotDef_in_classBody754 = new BitSet(new long[]{0x0000003F87F80000L,0x0003410000000820L});
    public static final BitSet FOLLOW_bracketR_in_classBody757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_protection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinHeader_in_mixinDef809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_mixinBody_in_mixinDef811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_mixinHeader834 = new BitSet(new long[]{0x0000000F44300000L,0x0001000000000000L});
    public static final BitSet FOLLOW_facet_in_mixinHeader836 = new BitSet(new long[]{0x0000000F44300000L,0x0001000000000000L});
    public static final BitSet FOLLOW_mixinFlags_in_mixinHeader841 = new BitSet(new long[]{0x0000000F44300000L});
    public static final BitSet FOLLOW_KW_MIXIN_in_mixinHeader844 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_mixinHeader848 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_inheritance_in_mixinHeader850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_mixinFlags885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_mixinFlags889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_mixinFlags893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_mixinFlags897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_mixinBody904 = new BitSet(new long[]{0x0000003F87F80000L,0x0003410000000820L});
    public static final BitSet FOLLOW_slotDef_in_mixinBody906 = new BitSet(new long[]{0x0000003F87F80000L,0x0003410000000820L});
    public static final BitSet FOLLOW_bracketR_in_mixinBody909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumHeader_in_enumDef942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_enumBody_in_enumDef944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumHeader970 = new BitSet(new long[]{0x0000000F20000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_facet_in_enumHeader972 = new BitSet(new long[]{0x0000000F20000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_protection_in_enumHeader977 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_enumHeader980 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_enumHeader984 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_inheritance_in_enumHeader986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_enumBody1021 = new BitSet(new long[]{0x0000000000000000L,0x0002410000000000L});
    public static final BitSet FOLLOW_enumValDefs_in_enumBody1023 = new BitSet(new long[]{0x0000003F87F80000L,0x0003410000000820L});
    public static final BitSet FOLLOW_slotDef_in_enumBody1025 = new BitSet(new long[]{0x0000003F87F80000L,0x0003410000000820L});
    public static final BitSet FOLLOW_bracketR_in_enumBody1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_inheritance1053 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000800L});
    public static final BitSet FOLLOW_typeList_in_inheritance1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs1065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_SP_COMMA_in_enumValDefs1068 = new BitSet(new long[]{0x0000000000000000L,0x0002410000000000L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs1071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_eos_in_enumValDefs1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumValDef1083 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_enumValDef1085 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_parL_in_enumValDef1088 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_args_in_enumValDef1090 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_enumValDef1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList1104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_SP_COMMA_in_typeList1107 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000800L});
    public static final BitSet FOLLOW_type_in_typeList1109 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_typeRoot_in_type1129 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_SP_QMARK_in_type1132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_LIST_TYPE_in_type1136 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_SP_QMARK_in_type1138 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_funcType_in_nonMapType1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_nonMapType1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_typeRoot1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonMapType_in_typeRoot1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_simpleType1178 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_SP_COLCOL_in_simpleType1181 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_simpleType1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_mapType1194 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000800L});
    public static final BitSet FOLLOW_nonMapType_in_mapType1197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000680L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType1199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_LIST_TYPE_in_mapType1203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000680L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType1205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_SP_COLON_in_mapType1217 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000800L});
    public static final BitSet FOLLOW_type_in_mapType1221 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000080L});
    public static final BitSet FOLLOW_sq_bracketR_in_mapType1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1234 = new BitSet(new long[]{0x0000000000000000L,0x0002010000001900L});
    public static final BitSet FOLLOW_SP_COMMA_in_funcType1237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_formals_in_funcType1242 = new BitSet(new long[]{0x0000000000000000L,0x0002010000001900L});
    public static final BitSet FOLLOW_assignedType_in_funcType1249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_assignedType_in_funcType1261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_assignedType1272 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000800L});
    public static final BitSet FOLLOW_type_in_assignedType1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_in_formals1284 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_SP_COMMA_in_formals1287 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000800L});
    public static final BitSet FOLLOW_formal_in_formals1289 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_formalFull_in_formal1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_formal1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalInferred_in_formal1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalFull1319 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_formalFull1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalTypeOnly1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_formalInferred1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticBlock_in_slotDef1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_slotDef1365 = new BitSet(new long[]{0x0000003F87F80000L,0x0003410000000800L});
    public static final BitSet FOLLOW_facet_in_slotDef1367 = new BitSet(new long[]{0x0000003F87F80000L,0x0003410000000800L});
    public static final BitSet FOLLOW_ctorDef_in_slotDef1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDef_in_slotDef1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDef_in_slotDef1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_fieldDef1463 = new BitSet(new long[]{0x0000000F87F80000L,0x0003010000000800L});
    public static final BitSet FOLLOW_facet_in_fieldDef1465 = new BitSet(new long[]{0x0000000F87F80000L,0x0003010000000800L});
    public static final BitSet FOLLOW_fieldFlags_in_fieldDef1470 = new BitSet(new long[]{0x0000000002000000L,0x0002010000000800L});
    public static final BitSet FOLLOW_typeId_in_fieldDef1472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002050L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_fieldDef1475 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_fieldDef1477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002010L});
    public static final BitSet FOLLOW_bracketL_in_fieldDef1492 = new BitSet(new long[]{0x0000000F00000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_protection_in_fieldDef1495 = new BitSet(new long[]{0x0000000F00000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_getter_in_fieldDef1499 = new BitSet(new long[]{0x000078FF87F81FF0L,0x000BFF1E72002830L});
    public static final BitSet FOLLOW_setter_in_fieldDef1503 = new BitSet(new long[]{0x000078FF87F81FF0L,0x000BFF1E72002830L});
    public static final BitSet FOLLOW_SP_SEMI_in_fieldDef1506 = new BitSet(new long[]{0x000078FF87F81FF0L,0x000BFF1E72000830L});
    public static final BitSet FOLLOW_block_in_fieldDef1509 = new BitSet(new long[]{0x0000003F87F80000L,0x0003410000000820L});
    public static final BitSet FOLLOW_bracketR_in_fieldDef1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_fieldDef1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeAndId_in_typeId1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldId_in_typeId1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_fieldId1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeAndId1592 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_typeAndId1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_fieldFlags1619 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_RD_ONLY_in_fieldFlags1623 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_CONST_in_fieldFlags1627 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_STATIC_in_fieldFlags1631 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_fieldFlags1635 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VOLATILE_in_fieldFlags1639 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_fieldFlags1643 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_fieldFlags1647 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_FINAL_in_fieldFlags1651 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_protection_in_fieldFlags1655 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_docs_in_methodDef1675 = new BitSet(new long[]{0x0000002F87600000L,0x0003010000000800L});
    public static final BitSet FOLLOW_facet_in_methodDef1677 = new BitSet(new long[]{0x0000002F87600000L,0x0003010000000800L});
    public static final BitSet FOLLOW_methodFlags_in_methodDef1682 = new BitSet(new long[]{0x0000002F87600000L,0x0002010000000800L});
    public static final BitSet FOLLOW_type_in_methodDef1687 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_methodDef1693 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_parL_in_methodDef1695 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_params_in_methodDef1697 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_methodDef1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002010L});
    public static final BitSet FOLLOW_methodBody_in_methodDef1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_methodFlags1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_methodFlags1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_methodFlags1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_methodFlags1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_methodFlags1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ONCE_in_methodFlags1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_methodFlags1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_methodFlags1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params1793 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_SP_COMMA_in_params1796 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000800L});
    public static final BitSet FOLLOW_param_in_params1798 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_type_in_param1811 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_param1813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_param1816 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_param1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_methodBody1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_methodBody1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_ctorDef1856 = new BitSet(new long[]{0x0000001F00000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_facet_in_ctorDef1858 = new BitSet(new long[]{0x0000001F00000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_ctorFlags_in_ctorDef1863 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_ctorDef1866 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_ctorDef1870 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_parL_in_ctorDef1872 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_params_in_ctorDef1874 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_ctorDef1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002090L});
    public static final BitSet FOLLOW_ctorChain_in_ctorDef1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002010L});
    public static final BitSet FOLLOW_methodBody_in_ctorDef1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_ctorFlags1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_ctorChain1949 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ctorChainThis_in_ctorChain1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorChainSuper_in_ctorChain1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_ctorChainThis1965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_ctorChainThis1967 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_ctorChainThis1969 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_parL_in_ctorChainThis1971 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_args_in_ctorChainThis1973 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_ctorChainThis1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_ctorChainSuper1983 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000008L});
    public static final BitSet FOLLOW_DOT_in_ctorChainSuper1986 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_ctorChainSuper1988 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_parL_in_ctorChainSuper1992 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_args_in_ctorChainSuper1994 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_ctorChainSuper1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_staticBlock2005 = new BitSet(new long[]{0x000078C002001FF0L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_block_in_staticBlock2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_block2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_multiStmt2044 = new BitSet(new long[]{0x000078FF87F81FF0L,0x000BFF1E72000830L});
    public static final BitSet FOLLOW_stmt_in_multiStmt2049 = new BitSet(new long[]{0x000078FF87F81FF0L,0x000BFF1E72000830L});
    public static final BitSet FOLLOW_bracketR_in_multiStmt2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_if_in_stmt2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_for_in_stmt2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_while_in_stmt2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_break_in_stmt2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_continue_in_stmt2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_return_in_stmt2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switch_in_stmt2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_throw_in_stmt2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_try_in_stmt2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_stmt2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localDef_in_stmt2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmtList2145 = new BitSet(new long[]{0x000078C002001FF2L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_KW_BREAK_in_g_break2167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_eos_in_g_break2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONTINUE_in_g_continue2176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_eos_in_g_continue2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_g_for2186 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_parL_in_g_for2188 = new BitSet(new long[]{0x000078C002000000L,0x000ABF1E72002800L});
    public static final BitSet FOLLOW_forInit_in_g_for2190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for2193 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72002800L});
    public static final BitSet FOLLOW_expr_in_g_for2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for2198 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_g_for2200 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_g_for2203 = new BitSet(new long[]{0x000078C002001FF0L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_block_in_g_for2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_g_if2214 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_parL_in_g_if2216 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_g_if2218 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_g_if2220 = new BitSet(new long[]{0x000078C002001FF0L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_block_in_g_if2222 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_g_if2229 = new BitSet(new long[]{0x000078C002001FF0L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_block_in_g_if2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_g_return2240 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72002800L});
    public static final BitSet FOLLOW_eos_in_g_return2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_g_return2247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_eos_in_g_return2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SWITCH_in_g_switch2257 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_parL_in_g_switch2259 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_g_switch2261 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_g_switch2263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_bracketL_in_g_switch2265 = new BitSet(new long[]{0x0000003F87F86000L,0x0003410000000820L});
    public static final BitSet FOLLOW_g_case_in_g_switch2268 = new BitSet(new long[]{0x0000003F87F86000L,0x0003410000000820L});
    public static final BitSet FOLLOW_g_default_in_g_switch2273 = new BitSet(new long[]{0x0000003F87F80000L,0x0003410000000820L});
    public static final BitSet FOLLOW_bracketR_in_g_switch2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_g_throw2285 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_g_throw2287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_eos_in_g_throw2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHILE_in_g_while2297 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_parL_in_g_while2299 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_g_while2301 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_g_while2303 = new BitSet(new long[]{0x000078C002001FF0L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_block_in_g_while2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_g_try2313 = new BitSet(new long[]{0x000078C002019FF0L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_try_long_in_g_try2320 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_stmtList_in_g_try2324 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_catch_in_g_try2332 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_finally_in_g_try2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_try_long2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprStmt2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_eos_in_exprStmt2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_localDef2366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_localDef2369 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_localDef2371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_eos_in_localDef2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_forInit2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forInit2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_forInitDef2394 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_forInitDef2397 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_forInitDef2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_g_catch2410 = new BitSet(new long[]{0x000078C002001FF0L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_catchDef_in_g_catch2412 = new BitSet(new long[]{0x000078C002001FF0L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_catch_long_in_g_catch2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtList_in_g_catch2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_catch_long2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_catchDef2440 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000800L});
    public static final BitSet FOLLOW_type_in_catchDef2442 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_catchDef2444 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_catchDef2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_g_finally2454 = new BitSet(new long[]{0x000078C002001FF0L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_finally_long_in_g_finally2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtList_in_g_finally2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_finally_long2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_g_case2481 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_g_case2483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SP_COLON_in_g_case2485 = new BitSet(new long[]{0x000078C002001FF2L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_stmt_in_g_case2487 = new BitSet(new long[]{0x000078C002001FF2L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_KW_DEFAULT_in_g_default2495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SP_COLON_in_g_default2497 = new BitSet(new long[]{0x000078C002001FF2L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_stmt_in_g_default2499 = new BitSet(new long[]{0x000078C002001FF2L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_assignExpr_in_expr2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2527 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2530 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_assignExpr_in_assignExpr2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryExpr2541 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ternaryTail_in_ternaryExpr2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_ternaryTail2554 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail2556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SP_COLON_in_ternaryTail2558 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_OP_OR_in_condOrExpr2583 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2586 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2596 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_OP_AND_in_condAndExpr2599 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2602 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2612 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_CP_EQUALITY_in_equalityExpr2615 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2617 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_elvisExpr_in_relationalExpr2630 = new BitSet(new long[]{0x0000060000040000L,0x0000000000080000L});
    public static final BitSet FOLLOW_typeCheck_in_relationalExpr2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_relationalExpr2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCheck2648 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000800L});
    public static final BitSet FOLLOW_typeRoot_in_typeCheck2660 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_SP_QMARK_in_typeCheck2663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LIST_TYPE_in_typeCheck2668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_CP_COMPARATORS_in_compare2681 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_elvisExpr_in_compare2683 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2694 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_OP_ELVIS_in_elvisExpr2697 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2699 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2710 = new BitSet(new long[]{0x0000000000000002L,0x0000000000E00000L});
    public static final BitSet FOLLOW_set_in_rangeExpr2713 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2727 = new BitSet(new long[]{0x0000000000000002L,0x0000000000E00000L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2738 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000800L});
    public static final BitSet FOLLOW_set_in_bitOrExpr2741 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2749 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000800L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2760 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_OP_CURRY_in_bitAndExpr2763 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2765 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2777 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_set_in_shiftExpr2780 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2788 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2799 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_set_in_addExpr2802 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2810 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_set_in_addAppend2820 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_parenExpr_in_addAppend2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2836 = new BitSet(new long[]{0x0000000000000002L,0x00000001C0000000L});
    public static final BitSet FOLLOW_set_in_multExpr2839 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2851 = new BitSet(new long[]{0x0000000000000002L,0x00000001C0000000L});
    public static final BitSet FOLLOW_castExpr_in_parenExpr2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_parenExpr2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_parenExpr2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_castExpr2881 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000800L});
    public static final BitSet FOLLOW_type_in_castExpr2883 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_castExpr2885 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_parenExpr_in_castExpr2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_groupedExpr2896 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_groupedExpr2898 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_groupedExpr2900 = new BitSet(new long[]{0x0000000000000002L,0x000A00C000001018L});
    public static final BitSet FOLLOW_termChain_in_groupedExpr2902 = new BitSet(new long[]{0x0000000000000002L,0x000A00C000001018L});
    public static final BitSet FOLLOW_prefixExpr_in_unaryExpr2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_unaryExpr2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_unaryExpr2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr2927 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_parenExpr_in_prefixExpr2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_postfixExpr2964 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_set_in_postfixExpr2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termBase_in_termExpr2981 = new BitSet(new long[]{0x0000000000000002L,0x000A00C000001018L});
    public static final BitSet FOLLOW_termChain_in_termExpr2983 = new BitSet(new long[]{0x0000000000000002L,0x000A00C000001018L});
    public static final BitSet FOLLOW_idExprReq_in_termBase2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_termBase2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_termBase3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_termBase3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_typeBase3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_typeBase3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_typeBase3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_typeBase3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_typeBase3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_typeBase3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_typeBase3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorBlock_in_typeBase3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_ctorBlock3065 = new BitSet(new long[]{0x0000000000000000L,0x000A00C000001018L});
    public static final BitSet FOLLOW_itBlock_in_ctorBlock3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_staticCall3074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_staticCall3076 = new BitSet(new long[]{0x0000000000000000L,0x0002010040000000L});
    public static final BitSet FOLLOW_idExpr_in_staticCall3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_termChain3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynCall_in_termChain3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_termChain3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDynCall_in_termChain3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpr_in_termChain3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callOp_in_termChain3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itBlock_in_termChain3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_dsl3129 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_DSL_in_dsl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_itBlock3141 = new BitSet(new long[]{0x000078FF87F81FF0L,0x000BFF1E72000830L});
    public static final BitSet FOLLOW_stmt_in_itBlock3144 = new BitSet(new long[]{0x000078FF87F81FF0L,0x000BFF1E72002930L});
    public static final BitSet FOLLOW_SP_COMMA_in_itBlock3146 = new BitSet(new long[]{0x000078FF87F81FF0L,0x000BFF1E72002830L});
    public static final BitSet FOLLOW_SP_SEMI_in_itBlock3149 = new BitSet(new long[]{0x000078FF87F81FF0L,0x000BFF1E72000830L});
    public static final BitSet FOLLOW_bracketR_in_itBlock3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotCall3162 = new BitSet(new long[]{0x0000000000000000L,0x0002010040000000L});
    public static final BitSet FOLLOW_idExpr_in_dotCall3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_dynCall3172 = new BitSet(new long[]{0x0000000000000000L,0x0002010040000000L});
    public static final BitSet FOLLOW_idExpr_in_dynCall3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_safeDotCall3182 = new BitSet(new long[]{0x0000000000000000L,0x0002010040000000L});
    public static final BitSet FOLLOW_idExpr_in_safeDotCall3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall3191 = new BitSet(new long[]{0x0000000000000000L,0x0002010040000000L});
    public static final BitSet FOLLOW_idExpr_in_safeDynCall3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_indexExpr3203 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_indexExpr3205 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_indexExpr3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callOp3218 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_args_in_callOp3220 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_callOp3224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_closure_in_callOp3226 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_funcType_in_closure3248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_multiStmt_in_closure3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_idExpr3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idExpr3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_idExprReq3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_idExprReq3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MULTI_in_field3285 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_field3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call3298 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000800L});
    public static final BitSet FOLLOW_callParams_in_call3302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_closure_in_call3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_call3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_call3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callParams3324 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_args_in_callParams3326 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_callParams3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args3338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_SP_COMMA_in_args3341 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_args3344 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_KW_NULL_in_literal3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_literal3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_literal3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IT_in_literal3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_literal3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_literal3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strs_in_literal3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_literal3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_literal3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_literal3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_literal3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_literal3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_literal3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_literal3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_literal3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_literal3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTSTR_in_strs3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_strs3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeLiteral3470 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_OP_POUND_in_typeLiteral3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_slotLiteral3483 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_OP_POUND_in_slotLiteral3486 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_slotLiteral3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_namedSuper3498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_namedSuper3500 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_SUPER_in_namedSuper3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_list3512 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_sq_bracketL_in_list3518 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000900L});
    public static final BitSet FOLLOW_listItems_in_list3520 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_list3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_listItems3531 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3534 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_listItems3536 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_map3557 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_sq_bracketL_in_map3563 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000880L});
    public static final BitSet FOLLOW_mapItems_in_map3565 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_map3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapPair_in_mapItems3576 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems3579 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_mapPair_in_mapItems3581 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_mapItems3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_mapPair3599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SP_COLON_in_mapPair3601 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_mapPair3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_simple3611 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_parL_in_simple3613 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_simple3615 = new BitSet(new long[]{0x000078C000000000L,0x001ABF1E72000800L});
    public static final BitSet FOLLOW_parR_in_simple3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_docs3629 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_OP_MINUS_in_number3651 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_NUMBER_in_number3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_facet3662 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_facet3664 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_AS_EQUAL_in_facet3667 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_expr_in_facet3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_eos3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getter3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setter3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_bracketL3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_R_in_bracketR3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_sq_bracketL3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_sq_bracketR3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_parL3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_R_in_parR3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_podDef_in_synpred2_Fan413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred11_Fan599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classFlags_in_synpred13_Fan604 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_synpred13_Fan607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_synpred15_Fan618 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_synpred15_Fan621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred42_Fan1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred43_Fan1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_synpred44_Fan1136 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred44_Fan1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred46_Fan1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_synpred52_Fan1217 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000800L});
    public static final BitSet FOLLOW_type_in_synpred52_Fan1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketR_in_synpred53_Fan1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred55_Fan1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred57_Fan1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_synpred59_Fan1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_synpred60_Fan1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_synpred61_Fan1351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_bracketL_in_synpred61_Fan1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred62_Fan1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorFlags_in_synpred64_Fan1384 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_synpred64_Fan1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodFlags_in_synpred67_Fan1401 = new BitSet(new long[]{0x0000002F8F600000L,0x0002010000000800L});
    public static final BitSet FOLLOW_type_in_synpred67_Fan1405 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_KW_VOID_in_synpred67_Fan1409 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_synpred67_Fan1412 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_parL_in_synpred67_Fan1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getter_in_synpred71_Fan1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred73_Fan1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred76_Fan1556 = new BitSet(new long[]{0x0000000000000000L,0x0002010000000000L});
    public static final BitSet FOLLOW_id_in_synpred76_Fan1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_synpred99_Fan1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred108_Fan2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_synpred119_Fan2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred120_Fan2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_synpred124_Fan2229 = new BitSet(new long[]{0x000078C002001FF0L,0x000ABF1E72000810L});
    public static final BitSet FOLLOW_block_in_synpred124_Fan2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_synpred125_Fan2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred128_Fan2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_synpred129_Fan2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_synpred130_Fan2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_synpred132_Fan2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchDef_in_synpred134_Fan2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred135_Fan2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred136_Fan2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred156_Fan2741 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_bitAndExpr_in_synpred156_Fan2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_CURRY_in_synpred157_Fan2763 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_shiftExpr_in_synpred157_Fan2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred161_Fan2802 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_multExpr_in_synpred161_Fan2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred165_Fan2839 = new BitSet(new long[]{0x000078C000000000L,0x000ABF1E72000800L});
    public static final BitSet FOLLOW_parenExpr_in_synpred165_Fan2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_synpred166_Fan2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_synpred167_Fan2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred168_Fan2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred169_Fan2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_synpred170_Fan2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred178_Fan2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred179_Fan2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred180_Fan2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_synpred181_Fan3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred182_Fan3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred183_Fan3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred184_Fan3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_synpred185_Fan3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_synpred186_Fan3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred187_Fan3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_synpred188_Fan3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred199_Fan3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred200_Fan3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred202_Fan3302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_closure_in_synpred202_Fan3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred203_Fan3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred216_Fan3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred217_Fan3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred218_Fan3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_synpred219_Fan3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_synpred220_Fan3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred223_Fan3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred227_Fan3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_synpred231_Fan3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_synpred234_Fan3691 = new BitSet(new long[]{0x0000000000000002L});

}