// $ANTLR 3.1.2 src/net/colar/netbeans/fan/antlr/Fan.g 2010-02-01 12:36:49
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KW_BREAK", "KW_CONTINUE", "KW_FOR", "KW_IF", "KW_RETURN", "KW_SWITCH", "KW_THROW", "KW_WHILE", "KW_TRY", "KW_CASE", "KW_DEFAULT", "KW_CATCH", "KW_FINALLY", "KW_USING", "KW_AS", "KW_RD_ONLY", "KW_CONST", "KW_STATIC", "KW_NATIVE", "KW_VOLATILE", "KW_OVERRIDE", "KW_VIRTUAL", "KW_FINAL", "KW_VOID", "KW_CLASS", "KW_ENUM", "KW_MIXIN", "KW_ABSTRACT", "KW_PRIVATE", "KW_PROTECTED", "KW_PUBLIC", "KW_INTERNAL", "KW_NEW", "KW_ONCE", "KW_THIS", "KW_SUPER", "KW_ELSE", "KW_IS", "KW_ISNOT", "KW_NULL", "KW_IT", "KW_TRUE", "KW_FALSE", "INC_STR", "INC_URI", "INC_COMMENT", "INC_DSL", "AST_CLASS", "AST_ENUM", "AST_MIXIN", "AST_METHOD", "AST_CONSTRUCTOR", "AST_FIELD", "AST_CONSTRUCTOR_CHAIN", "AST_CODE_BLOCK", "AST_DOCS", "AST_STR", "AST_CALL", "AST_TERM_EXPR", "AST_DOT_CALL", "AST_SAFE_DOT_CALL", "AST_STATIC_CALL", "AST_USING_POD", "AST_MAP", "AST_LOCAL_DEF", "AST_TYPE_LIT", "AST_SLOT_LIT", "AST_SYMBOL", "AST_NAMED_SUPER", "AST_LIST", "AST_IT_BLOCK", "AST_CTOR_BLOCK", "AST_FOR_INIT", "AST_CATCH_DEF", "AST_FORMAL", "AST_CAST", "AST_FUNC_TYPE", "AST_INDEX_EXPR", "AST_INC_USING", "AST_INC_DOTCALL", "AST_INC_SAFEDOTCALL", "AST_SCOPE", "AST_ID", "AST_MODIFIER", "AST_INHERITANCE", "AST_PARAM", "AST_TYPE", "AST_CHILD", "SP_COLCOL", "DOT", "BRACKET_L", "BRACKET_R", "AS_INIT_VAL", "SP_COLON", "SP_COMMA", "SP_QMARK", "LIST_TYPE", "SP_PIPE", "OP_ARROW", "SP_SEMI", "AS_EQUAL", "AS_ASSIGN_OP", "OP_OR", "OP_AND", "CP_EQUALITY", "CP_COMPARATORS", "OP_ELVIS", "OP_RANG_EXCL_OLD", "OP_RANGE_EXCL", "OP_RANGE", "OP_PLUS", "OP_MINUS", "OP_MULTI", "OP_DIV", "OP_MOD", "OP_CURRY", "OP_BANG", "OP_2PLUS", "OP_2MINUS", "DSL", "OP_SAFE_CALL", "OP_SAFEDYN_CALL", "ID", "URI", "CHAR", "QUOTSTR", "STR", "OP_POUND", "AT", "DOC", "NUMBER", "SQ_BRACKET_L", "SQ_BRACKET_R", "PAR_L", "PAR_R", "LB", "WS", "LINE_COMMENT", "EXEC_COMMENT", "COMPL_ML_COMMENT", "MULTI_COMMENT", "COMPL_DSL", "DIGIT", "HEXLETTER", "COMPL_QSTR", "COMPL_STR", "COMPL_URI", "KEYWORD", "OP_BITOR", "UNDERSCORE", "OP_LSHIFT", "OP_RSHIFT", "OP_TILDA", "HEX_HEADER", "HEXNB", "DECIMAL", "FRACTIONAL", "HEXHEADER", "FRACTION", "EXPONENT", "NBTYPE", "LETTER", "INC_UNKNOWN_ITEM", "'$'"
    };
    public static final int EXPONENT=163;
    public static final int AST_INDEX_EXPR=81;
    public static final int DSL=123;
    public static final int OP_AND=107;
    public static final int KW_NATIVE=22;
    public static final int AST_CATCH_DEF=77;
    public static final int LETTER=165;
    public static final int HEXNB=158;
    public static final int CHAR=128;
    public static final int OP_2PLUS=121;
    public static final int KW_DEFAULT=14;
    public static final int KW_ONCE=37;
    public static final int SP_SEMI=103;
    public static final int INC_UNKNOWN_ITEM=166;
    public static final int AST_MIXIN=53;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int KW_PUBLIC=34;
    public static final int KW_ISNOT=42;
    public static final int OP_MOD=118;
    public static final int PAR_R=138;
    public static final int OP_MINUS=115;
    public static final int KW_NEW=36;
    public static final int KW_BREAK=4;
    public static final int KW_SWITCH=9;
    public static final int AST_INC_DOTCALL=83;
    public static final int OP_RANG_EXCL_OLD=111;
    public static final int AST_CLASS=51;
    public static final int OP_BITOR=152;
    public static final int QUOTSTR=129;
    public static final int AST_TYPE=90;
    public static final int OP_BANG=120;
    public static final int AST_DOT_CALL=63;
    public static final int AST_TYPE_LIT=69;
    public static final int PAR_L=137;
    public static final int OP_MULTI=116;
    public static final int AST_USING_POD=66;
    public static final int KEYWORD=151;
    public static final int KW_PROTECTED=33;
    public static final int AST_STR=60;
    public static final int LINE_COMMENT=141;
    public static final int CP_COMPARATORS=109;
    public static final int NUMBER=134;
    public static final int AS_EQUAL=104;
    public static final int KW_CATCH=15;
    public static final int UNDERSCORE=153;
    public static final int OP_DIV=117;
    public static final int SP_COMMA=98;
    public static final int AST_SYMBOL=71;
    public static final int AST_LIST=73;
    public static final int URI=127;
    public static final int KW_FINALLY=16;
    public static final int WS=140;
    public static final int KW_THROW=10;
    public static final int OP_POUND=131;
    public static final int KW_STATIC=21;
    public static final int INC_COMMENT=49;
    public static final int AST_METHOD=54;
    public static final int AST_ENUM=52;
    public static final int AST_CALL=61;
    public static final int AST_CTOR_BLOCK=75;
    public static final int SP_QMARK=99;
    public static final int AST_ID=86;
    public static final int HEXHEADER=161;
    public static final int AS_INIT_VAL=96;
    public static final int COMPL_DSL=145;
    public static final int NBTYPE=164;
    public static final int KW_SUPER=39;
    public static final int OP_2MINUS=122;
    public static final int AST_SCOPE=85;
    public static final int OP_RSHIFT=155;
    public static final int KW_ELSE=40;
    public static final int AST_FUNC_TYPE=80;
    public static final int OP_OR=106;
    public static final int AST_MODIFIER=87;
    public static final int DOC=133;
    public static final int KW_OVERRIDE=24;
    public static final int AST_FIELD=56;
    public static final int AST_CODE_BLOCK=58;
    public static final int KW_ABSTRACT=31;
    public static final int MULTI_COMMENT=144;
    public static final int KW_CONST=20;
    public static final int AST_DOCS=59;
    public static final int COMPL_ML_COMMENT=143;
    public static final int OP_ELVIS=110;
    public static final int BRACKET_R=95;
    public static final int KW_TRUE=45;
    public static final int ID=126;
    public static final int SP_COLON=97;
    public static final int AST_CAST=79;
    public static final int AST_CONSTRUCTOR_CHAIN=57;
    public static final int AST_TERM_EXPR=62;
    public static final int BRACKET_L=94;
    public static final int AT=132;
    public static final int STR=130;
    public static final int OP_RANGE_EXCL=112;
    public static final int SP_PIPE=101;
    public static final int OP_TILDA=156;
    public static final int COMPL_QSTR=148;
    public static final int KW_VIRTUAL=25;
    public static final int CP_EQUALITY=108;
    public static final int AST_SAFE_DOT_CALL=64;
    public static final int KW_FOR=6;
    public static final int KW_WHILE=11;
    public static final int COMPL_URI=150;
    public static final int AST_LOCAL_DEF=68;
    public static final int AST_SLOT_LIT=70;
    public static final int OP_RANGE=113;
    public static final int KW_RETURN=8;
    public static final int INC_DSL=50;
    public static final int SQ_BRACKET_R=136;
    public static final int AST_NAMED_SUPER=72;
    public static final int KW_IS=41;
    public static final int DIGIT=146;
    public static final int KW_TRY=12;
    public static final int KW_IT=44;
    public static final int DOT=93;
    public static final int KW_THIS=38;
    public static final int KW_IF=7;
    public static final int OP_CURRY=119;
    public static final int SQ_BRACKET_L=135;
    public static final int AST_INC_SAFEDOTCALL=84;
    public static final int OP_PLUS=114;
    public static final int KW_FALSE=46;
    public static final int KW_INTERNAL=35;
    public static final int KW_FINAL=26;
    public static final int HEXLETTER=147;
    public static final int KW_CONTINUE=5;
    public static final int KW_PRIVATE=32;
    public static final int KW_ENUM=29;
    public static final int HEX_HEADER=157;
    public static final int OP_SAFEDYN_CALL=125;
    public static final int LIST_TYPE=100;
    public static final int KW_VOLATILE=23;
    public static final int KW_CASE=13;
    public static final int FRACTIONAL=160;
    public static final int OP_LSHIFT=154;
    public static final int EXEC_COMMENT=142;
    public static final int KW_MIXIN=30;
    public static final int AST_IT_BLOCK=74;
    public static final int AST_CHILD=91;
    public static final int OP_ARROW=102;
    public static final int KW_VOID=27;
    public static final int DECIMAL=159;
    public static final int INC_URI=48;
    public static final int KW_CLASS=28;
    public static final int AS_ASSIGN_OP=105;
    public static final int AST_MAP=67;
    public static final int AST_CONSTRUCTOR=55;
    public static final int KW_RD_ONLY=19;
    public static final int INC_STR=47;
    public static final int AST_STATIC_CALL=65;
    public static final int OP_SAFE_CALL=124;
    public static final int KW_AS=18;
    public static final int COMPL_STR=149;
    public static final int LB=139;
    public static final int AST_FORMAL=78;
    public static final int KW_USING=17;
    public static final int KW_NULL=43;
    public static final int AST_FOR_INIT=76;
    public static final int AST_PARAM=89;
    public static final int FRACTION=162;
    public static final int AST_INHERITANCE=88;
    public static final int AST_INC_USING=82;
    public static final int SP_COLCOL=92;

    // delegates
    // delegators


        public FanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[400+1];
             
             
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


    		public boolean nbErrors=false;
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
    		if(! nbErrors)
    			throw(new RuntimeException("Parser Exception",e));
    		else
    			parsingResult.addAntlrError(e,paraphrase);
        }

        Stack<String> paraphrase = new Stack<String>();



    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // src/net/colar/netbeans/fan/antlr/Fan.g:262:1: prog : ( using )* ( podDef | ( typeDef )* ) docs EOF ;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:7: ( ( using )* ( podDef | ( typeDef )* ) docs EOF )
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:11: ( using )* ( podDef | ( typeDef )* ) docs EOF
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:262:11: ( using )*
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
            	    pushFollow(FOLLOW_using_in_prog493);
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

            // src/net/colar/netbeans/fan/antlr/Fan.g:262:18: ( podDef | ( typeDef )* )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:262:19: podDef
                    {
                    pushFollow(FOLLOW_podDef_in_prog497);
                    podDef2=podDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, podDef2.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:262:28: ( typeDef )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:262:28: ( typeDef )*
                    loop2:
                    do {
                        int alt2=2;
                        alt2 = dfa2.predict(input);
                        switch (alt2) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: typeDef
                    	    {
                    	    pushFollow(FOLLOW_typeDef_in_prog501);
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

            pushFollow(FOLLOW_docs_in_prog505);
            docs4=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs4.getTree());
            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_prog507); if (state.failed) return retval;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:263:1: using : ( usingPod | usingType | usingAs | incUsing ) ;
    public final FanParser.using_return using() throws RecognitionException {
        FanParser.using_return retval = new FanParser.using_return();
        retval.start = input.LT(1);
        int using_StartIndex = input.index();
        Object root_0 = null;

        FanParser.usingPod_return usingPod6 = null;

        FanParser.usingType_return usingType7 = null;

        FanParser.usingAs_return usingAs8 = null;

        FanParser.incUsing_return incUsing9 = null;



        paraphrase.push("Using statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:264:3: ( ( usingPod | usingType | usingAs | incUsing ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:264:5: ( usingPod | usingType | usingAs | incUsing )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:264:5: ( usingPod | usingType | usingAs | incUsing )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:264:6: usingPod
                    {
                    pushFollow(FOLLOW_usingPod_in_using527);
                    usingPod6=usingPod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingPod6.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:264:17: usingType
                    {
                    pushFollow(FOLLOW_usingType_in_using531);
                    usingType7=usingType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingType7.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:264:29: usingAs
                    {
                    pushFollow(FOLLOW_usingAs_in_using535);
                    usingAs8=usingAs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingAs8.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:264:39: incUsing
                    {
                    pushFollow(FOLLOW_incUsing_in_using539);
                    incUsing9=incUsing();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incUsing9.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:265:1: usingPod : ( KW_USING podSpec eos ) -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ( eos )? ) ;
    public final FanParser.usingPod_return usingPod() throws RecognitionException {
        FanParser.usingPod_return retval = new FanParser.usingPod_return();
        retval.start = input.LT(1);
        int usingPod_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING10=null;
        FanParser.podSpec_return podSpec11 = null;

        FanParser.eos_return eos12 = null;


        Object KW_USING10_tree=null;
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_podSpec=new RewriteRuleSubtreeStream(adaptor,"rule podSpec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:3: ( ( KW_USING podSpec eos ) -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ( eos )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:5: ( KW_USING podSpec eos )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:5: ( KW_USING podSpec eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:6: KW_USING podSpec eos
            {
            KW_USING10=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingPod550); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING10);

            pushFollow(FOLLOW_podSpec_in_usingPod552);
            podSpec11=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podSpec.add(podSpec11.getTree());
            pushFollow(FOLLOW_eos_in_usingPod554);
            eos12=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos12.getTree());

            }



            // AST REWRITE
            // elements: podSpec, eos
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 267:4: -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ( eos )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:267:7: ^( AST_USING_POD ^( AST_CHILD podSpec ) ( eos )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_USING_POD, "AST_USING_POD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:267:23: ^( AST_CHILD podSpec )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_podSpec.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:267:44: ( eos )?
                if ( stream_eos.hasNext() ) {
                    adaptor.addChild(root_1, stream_eos.nextTree());

                }
                stream_eos.reset();

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:268:1: usingType : ( KW_USING podSpec SP_COLCOL id eos ) -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD id ) ) ;
    public final FanParser.usingType_return usingType() throws RecognitionException {
        FanParser.usingType_return retval = new FanParser.usingType_return();
        retval.start = input.LT(1);
        int usingType_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING13=null;
        Token SP_COLCOL15=null;
        FanParser.podSpec_return podSpec14 = null;

        FanParser.id_return id16 = null;

        FanParser.eos_return eos17 = null;


        Object KW_USING13_tree=null;
        Object SP_COLCOL15_tree=null;
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_SP_COLCOL=new RewriteRuleTokenStream(adaptor,"token SP_COLCOL");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_podSpec=new RewriteRuleSubtreeStream(adaptor,"rule podSpec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:3: ( ( KW_USING podSpec SP_COLCOL id eos ) -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD id ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:5: ( KW_USING podSpec SP_COLCOL id eos )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:5: ( KW_USING podSpec SP_COLCOL id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:6: KW_USING podSpec SP_COLCOL id eos
            {
            KW_USING13=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingType583); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING13);

            pushFollow(FOLLOW_podSpec_in_usingType585);
            podSpec14=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podSpec.add(podSpec14.getTree());
            SP_COLCOL15=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingType587); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_COLCOL.add(SP_COLCOL15);

            pushFollow(FOLLOW_id_in_usingType589);
            id16=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id16.getTree());
            pushFollow(FOLLOW_eos_in_usingType591);
            eos17=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos17.getTree());

            }



            // AST REWRITE
            // elements: podSpec, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 270:4: -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD id ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:270:7: ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD id ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_USING_POD, "AST_USING_POD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:270:23: ^( AST_CHILD podSpec )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_podSpec.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:270:44: ^( AST_CHILD id )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_id.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:272:1: usingAs : ( KW_USING podSpec SP_COLCOL podId KW_AS as= id eos ) -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD podId ) ^( AST_CHILD $as) ) ;
    public final FanParser.usingAs_return usingAs() throws RecognitionException {
        FanParser.usingAs_return retval = new FanParser.usingAs_return();
        retval.start = input.LT(1);
        int usingAs_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING18=null;
        Token SP_COLCOL20=null;
        Token KW_AS22=null;
        FanParser.id_return as = null;

        FanParser.podSpec_return podSpec19 = null;

        FanParser.podId_return podId21 = null;

        FanParser.eos_return eos23 = null;


        Object KW_USING18_tree=null;
        Object SP_COLCOL20_tree=null;
        Object KW_AS22_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_SP_COLCOL=new RewriteRuleTokenStream(adaptor,"token SP_COLCOL");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_podSpec=new RewriteRuleSubtreeStream(adaptor,"rule podSpec");
        RewriteRuleSubtreeStream stream_podId=new RewriteRuleSubtreeStream(adaptor,"rule podId");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:10: ( ( KW_USING podSpec SP_COLCOL podId KW_AS as= id eos ) -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD podId ) ^( AST_CHILD $as) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:12: ( KW_USING podSpec SP_COLCOL podId KW_AS as= id eos )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:12: ( KW_USING podSpec SP_COLCOL podId KW_AS as= id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:13: KW_USING podSpec SP_COLCOL podId KW_AS as= id eos
            {
            KW_USING18=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingAs623); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING18);

            pushFollow(FOLLOW_podSpec_in_usingAs625);
            podSpec19=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podSpec.add(podSpec19.getTree());
            SP_COLCOL20=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingAs627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_COLCOL.add(SP_COLCOL20);

            pushFollow(FOLLOW_podId_in_usingAs629);
            podId21=podId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podId.add(podId21.getTree());
            KW_AS22=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_usingAs631); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS22);

            pushFollow(FOLLOW_id_in_usingAs635);
            as=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(as.getTree());
            pushFollow(FOLLOW_eos_in_usingAs637);
            eos23=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos23.getTree());

            }



            // AST REWRITE
            // elements: as, podSpec, podId
            // token labels: 
            // rule labels: retval, as
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_as=new RewriteRuleSubtreeStream(adaptor,"rule as",as!=null?as.tree:null);

            root_0 = (Object)adaptor.nil();
            // 273:4: -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD podId ) ^( AST_CHILD $as) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:273:7: ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD podId ) ^( AST_CHILD $as) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_USING_POD, "AST_USING_POD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:273:23: ^( AST_CHILD podSpec )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_podSpec.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:273:44: ^( AST_CHILD podId )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_podId.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:273:63: ^( AST_CHILD $as)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_as.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
            if ( state.backtracking>0 ) { memoize(input, 5, usingAs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "usingAs"

    public static class podId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:275:1: podId : id ( '$' id )* ;
    public final FanParser.podId_return podId() throws RecognitionException {
        FanParser.podId_return retval = new FanParser.podId_return();
        retval.start = input.LT(1);
        int podId_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal25=null;
        FanParser.id_return id24 = null;

        FanParser.id_return id26 = null;


        Object char_literal25_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:8: ( id ( '$' id )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:10: id ( '$' id )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_podId675);
            id24=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id24.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:13: ( '$' id )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==167) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:275:14: '$' id
            	    {
            	    char_literal25=(Token)match(input,167,FOLLOW_167_in_podId678); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal25_tree = (Object)adaptor.create(char_literal25);
            	    adaptor.addChild(root_0, char_literal25_tree);
            	    }
            	    pushFollow(FOLLOW_id_in_podId680);
            	    id26=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, id26.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
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
            if ( state.backtracking>0 ) { memoize(input, 6, podId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podId"

    public static class incUsing_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incUsing"
    // src/net/colar/netbeans/fan/antlr/Fan.g:276:1: incUsing : ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) ) -> ^( AST_INC_USING ^( AST_CHILD KW_USING ) ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? ) ) ;
    public final FanParser.incUsing_return incUsing() throws RecognitionException {
        FanParser.incUsing_return retval = new FanParser.incUsing_return();
        retval.start = input.LT(1);
        int incUsing_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING27=null;
        Token KW_USING29=null;
        Token KW_USING32=null;
        Token DOT34=null;
        Token KW_USING36=null;
        Token SP_COLCOL38=null;
        FanParser.eos_return eos28 = null;

        FanParser.ffi_return ffi30 = null;

        FanParser.eos_return eos31 = null;

        FanParser.podSpec_return podSpec33 = null;

        FanParser.eos_return eos35 = null;

        FanParser.podSpec_return podSpec37 = null;

        FanParser.eos_return eos39 = null;


        Object KW_USING27_tree=null;
        Object KW_USING29_tree=null;
        Object KW_USING32_tree=null;
        Object DOT34_tree=null;
        Object KW_USING36_tree=null;
        Object SP_COLCOL38_tree=null;
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_SP_COLCOL=new RewriteRuleTokenStream(adaptor,"token SP_COLCOL");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_podSpec=new RewriteRuleSubtreeStream(adaptor,"rule podSpec");
        RewriteRuleSubtreeStream stream_ffi=new RewriteRuleSubtreeStream(adaptor,"rule ffi");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:276:10: ( ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) ) -> ^( AST_INC_USING ^( AST_CHILD KW_USING ) ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:276:14: ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:276:14: ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:15: ( KW_USING eos )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:15: ( KW_USING eos )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:16: KW_USING eos
                    {
                    KW_USING27=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_incUsing693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING27);

                    pushFollow(FOLLOW_eos_in_incUsing695);
                    eos28=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos28.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:32: ( KW_USING ffi eos )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:32: ( KW_USING ffi eos )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:33: KW_USING ffi eos
                    {
                    KW_USING29=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_incUsing701); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING29);

                    pushFollow(FOLLOW_ffi_in_incUsing703);
                    ffi30=ffi();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ffi.add(ffi30.getTree());
                    pushFollow(FOLLOW_eos_in_incUsing705);
                    eos31=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos31.getTree());

                    }


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:53: ( KW_USING podSpec DOT eos )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:53: ( KW_USING podSpec DOT eos )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:54: KW_USING podSpec DOT eos
                    {
                    KW_USING32=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_incUsing711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING32);

                    pushFollow(FOLLOW_podSpec_in_incUsing713);
                    podSpec33=podSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_podSpec.add(podSpec33.getTree());
                    DOT34=(Token)match(input,DOT,FOLLOW_DOT_in_incUsing715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT34);

                    pushFollow(FOLLOW_eos_in_incUsing717);
                    eos35=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos35.getTree());

                    }


                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:82: ( KW_USING podSpec SP_COLCOL eos )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:82: ( KW_USING podSpec SP_COLCOL eos )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:276:83: KW_USING podSpec SP_COLCOL eos
                    {
                    KW_USING36=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_incUsing723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING36);

                    pushFollow(FOLLOW_podSpec_in_incUsing725);
                    podSpec37=podSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_podSpec.add(podSpec37.getTree());
                    SP_COLCOL38=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_incUsing727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SP_COLCOL.add(SP_COLCOL38);

                    pushFollow(FOLLOW_eos_in_incUsing729);
                    eos39=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos39.getTree());

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: DOT, KW_USING, podSpec, SP_COLCOL, ffi
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 277:4: -> ^( AST_INC_USING ^( AST_CHILD KW_USING ) ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:277:7: ^( AST_INC_USING ^( AST_CHILD KW_USING ) ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INC_USING, "AST_INC_USING"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:277:23: ^( AST_CHILD KW_USING )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_KW_USING.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:277:45: ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                // src/net/colar/netbeans/fan/antlr/Fan.g:277:57: ( ffi )?
                if ( stream_ffi.hasNext() ) {
                    adaptor.addChild(root_2, stream_ffi.nextTree());

                }
                stream_ffi.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:277:62: ( podSpec )?
                if ( stream_podSpec.hasNext() ) {
                    adaptor.addChild(root_2, stream_podSpec.nextTree());

                }
                stream_podSpec.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:277:71: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_2, stream_DOT.nextNode());

                }
                stream_DOT.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:277:76: ( SP_COLCOL )?
                if ( stream_SP_COLCOL.hasNext() ) {
                    adaptor.addChild(root_2, stream_SP_COLCOL.nextNode());

                }
                stream_SP_COLCOL.reset();

                adaptor.addChild(root_1, root_2);
                }

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
            if ( state.backtracking>0 ) { memoize(input, 7, incUsing_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "incUsing"

    public static class podSpec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podSpec"
    // src/net/colar/netbeans/fan/antlr/Fan.g:278:1: podSpec : ( ffi )? id ( DOT id )* ;
    public final FanParser.podSpec_return podSpec() throws RecognitionException {
        FanParser.podSpec_return retval = new FanParser.podSpec_return();
        retval.start = input.LT(1);
        int podSpec_StartIndex = input.index();
        Object root_0 = null;

        Token DOT42=null;
        FanParser.ffi_return ffi40 = null;

        FanParser.id_return id41 = null;

        FanParser.id_return id43 = null;


        Object DOT42_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:10: ( ( ffi )? id ( DOT id )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:12: ( ffi )? id ( DOT id )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:278:12: ( ffi )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SQ_BRACKET_L) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ffi
                    {
                    pushFollow(FOLLOW_ffi_in_podSpec770);
                    ffi40=ffi();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ffi40.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_podSpec773);
            id41=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id41.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:20: ( DOT id )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DOT) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==ID) ) {
                        int LA8_3 = input.LA(3);

                        if ( (LA8_3==EOF||LA8_3==KW_USING||(LA8_3>=KW_CONST && LA8_3<=KW_STATIC)||LA8_3==KW_FINAL||(LA8_3>=KW_CLASS && LA8_3<=KW_INTERNAL)||(LA8_3>=SP_COLCOL && LA8_3<=DOT)||LA8_3==SP_SEMI||(LA8_3>=AT && LA8_3<=DOC)) ) {
                            alt8=1;
                        }
                        else if ( (LA8_3==ID) ) {
                            int LA8_5 = input.LA(4);

                            if ( (LA8_5==ID) ) {
                                alt8=1;
                            }


                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:278:21: DOT id
            	    {
            	    DOT42=(Token)match(input,DOT,FOLLOW_DOT_in_podSpec776); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT42_tree = (Object)adaptor.create(DOT42);
            	    adaptor.addChild(root_0, DOT42_tree);
            	    }
            	    pushFollow(FOLLOW_id_in_podSpec778);
            	    id43=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, id43.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
            if ( state.backtracking>0 ) { memoize(input, 8, podSpec_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podSpec"

    public static class ffi_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ffi"
    // src/net/colar/netbeans/fan/antlr/Fan.g:279:1: ffi : sq_bracketL id sq_bracketR ;
    public final FanParser.ffi_return ffi() throws RecognitionException {
        FanParser.ffi_return retval = new FanParser.ffi_return();
        retval.start = input.LT(1);
        int ffi_StartIndex = input.index();
        Object root_0 = null;

        FanParser.sq_bracketL_return sq_bracketL44 = null;

        FanParser.id_return id45 = null;

        FanParser.sq_bracketR_return sq_bracketR46 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:7: ( sq_bracketL id sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:9: sq_bracketL id sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sq_bracketL_in_ffi789);
            sq_bracketL44=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL44.getTree());
            pushFollow(FOLLOW_id_in_ffi791);
            id45=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id45.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_ffi793);
            sq_bracketR46=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR46.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 9, ffi_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ffi"

    public static class podDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:281:1: podDef : podHeader BRACKET_L ( symbolDef )* BRACKET_R ;
    public final FanParser.podDef_return podDef() throws RecognitionException {
        FanParser.podDef_return retval = new FanParser.podDef_return();
        retval.start = input.LT(1);
        int podDef_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_L48=null;
        Token BRACKET_R50=null;
        FanParser.podHeader_return podHeader47 = null;

        FanParser.symbolDef_return symbolDef49 = null;


        Object BRACKET_L48_tree=null;
        Object BRACKET_R50_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:281:9: ( podHeader BRACKET_L ( symbolDef )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:281:11: podHeader BRACKET_L ( symbolDef )* BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_podHeader_in_podDef802);
            podHeader47=podHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, podHeader47.getTree());
            BRACKET_L48=(Token)match(input,BRACKET_L,FOLLOW_BRACKET_L_in_podDef804); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_L48_tree = (Object)adaptor.create(BRACKET_L48);
            adaptor.addChild(root_0, BRACKET_L48_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:281:31: ( symbolDef )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==EOF||(LA9_0>=KW_RD_ONLY && LA9_0<=KW_FINAL)||(LA9_0>=KW_CLASS && LA9_0<=KW_ONCE)||LA9_0==SP_PIPE||LA9_0==ID||(LA9_0>=AT && LA9_0<=DOC)||LA9_0==SQ_BRACKET_L) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: symbolDef
            	    {
            	    pushFollow(FOLLOW_symbolDef_in_podDef806);
            	    symbolDef49=symbolDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbolDef49.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            BRACKET_R50=(Token)match(input,BRACKET_R,FOLLOW_BRACKET_R_in_podDef809); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_R50_tree = (Object)adaptor.create(BRACKET_R50);
            adaptor.addChild(root_0, BRACKET_R50_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 10, podDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podDef"

    public static class podHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:282:1: podHeader : docs ( facet )* pod id ;
    public final FanParser.podHeader_return podHeader() throws RecognitionException {
        FanParser.podHeader_return retval = new FanParser.podHeader_return();
        retval.start = input.LT(1);
        int podHeader_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs51 = null;

        FanParser.facet_return facet52 = null;

        FanParser.pod_return pod53 = null;

        FanParser.id_return id54 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:11: ( docs ( facet )* pod id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:13: docs ( facet )* pod id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_podHeader816);
            docs51=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs51.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:18: ( facet )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_podHeader818);
            	    facet52=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet52.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            pushFollow(FOLLOW_pod_in_podHeader821);
            pod53=pod();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pod53.getTree());
            pushFollow(FOLLOW_id_in_podHeader823);
            id54=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id54.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 11, podHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podHeader"

    public static class symbolDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbolDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:283:1: symbolDef : docs ( facet )* ( symbolFlag )* typeId AS_INIT_VAL expr eos ;
    public final FanParser.symbolDef_return symbolDef() throws RecognitionException {
        FanParser.symbolDef_return retval = new FanParser.symbolDef_return();
        retval.start = input.LT(1);
        int symbolDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL59=null;
        FanParser.docs_return docs55 = null;

        FanParser.facet_return facet56 = null;

        FanParser.symbolFlag_return symbolFlag57 = null;

        FanParser.typeId_return typeId58 = null;

        FanParser.expr_return expr60 = null;

        FanParser.eos_return eos61 = null;


        Object AS_INIT_VAL59_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:11: ( docs ( facet )* ( symbolFlag )* typeId AS_INIT_VAL expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:13: docs ( facet )* ( symbolFlag )* typeId AS_INIT_VAL expr eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_symbolDef830);
            docs55=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs55.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:283:18: ( facet )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_symbolDef832);
            	    facet56=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet56.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:283:25: ( symbolFlag )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==KW_VIRTUAL) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: symbolFlag
            	    {
            	    pushFollow(FOLLOW_symbolFlag_in_symbolDef835);
            	    symbolFlag57=symbolFlag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbolFlag57.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            pushFollow(FOLLOW_typeId_in_symbolDef838);
            typeId58=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId58.getTree());
            AS_INIT_VAL59=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_symbolDef840); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AS_INIT_VAL59_tree = (Object)adaptor.create(AS_INIT_VAL59);
            adaptor.addChild(root_0, AS_INIT_VAL59_tree);
            }
            pushFollow(FOLLOW_expr_in_symbolDef842);
            expr60=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr60.getTree());
            pushFollow(FOLLOW_eos_in_symbolDef844);
            eos61=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos61.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 12, symbolDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "symbolDef"

    public static class symbolFlag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbolFlag"
    // src/net/colar/netbeans/fan/antlr/Fan.g:284:1: symbolFlag : 'virtual' ;
    public final FanParser.symbolFlag_return symbolFlag() throws RecognitionException {
        FanParser.symbolFlag_return retval = new FanParser.symbolFlag_return();
        retval.start = input.LT(1);
        int symbolFlag_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal62=null;

        Object string_literal62_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:12: ( 'virtual' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:14: 'virtual'
            {
            root_0 = (Object)adaptor.nil();

            string_literal62=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_symbolFlag851); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal62_tree = (Object)adaptor.create(string_literal62);
            adaptor.addChild(root_0, string_literal62_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 13, symbolFlag_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "symbolFlag"

    public static class typeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:287:1: typeDef : docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) ;
    public final FanParser.typeDef_return typeDef() throws RecognitionException {
        FanParser.typeDef_return retval = new FanParser.typeDef_return();
        retval.start = input.LT(1);
        int typeDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs63 = null;

        FanParser.facet_return facet64 = null;

        FanParser.classDef_return classDef65 = null;

        FanParser.enumDef_return enumDef66 = null;

        FanParser.mixinDef_return mixinDef67 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:10: ( docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:12: docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_typeDef861);
            docs63=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs63.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:17: ( facet )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AT) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==ID) ) {
                        int LA13_3 = input.LA(3);

                        if ( (synpred17_Fan()) ) {
                            alt13=1;
                        }


                    }


                }


                switch (alt13) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_typeDef863);
            	    facet64=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet64.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:287:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:287:25: ( ( classFlags )* KW_CLASS )=> classDef
                    {
                    pushFollow(FOLLOW_classDef_in_typeDef874);
                    classDef65=classDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDef65.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:288:4: ( ( protection )? KW_ENUM )=> enumDef
                    {
                    pushFollow(FOLLOW_enumDef_in_typeDef888);
                    enumDef66=enumDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDef66.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:288:37: mixinDef
                    {
                    pushFollow(FOLLOW_mixinDef_in_typeDef892);
                    mixinDef67=mixinDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mixinDef67.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 14, typeDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeDef"

    public static class classDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:289:1: classDef : ( classHeader classBody ) -> ^( AST_CLASS classHeader classBody ) ;
    public final FanParser.classDef_return classDef() throws RecognitionException {
        FanParser.classDef_return retval = new FanParser.classDef_return();
        retval.start = input.LT(1);
        int classDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.classHeader_return classHeader68 = null;

        FanParser.classBody_return classBody69 = null;


        RewriteRuleSubtreeStream stream_classHeader=new RewriteRuleSubtreeStream(adaptor,"rule classHeader");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        paraphrase.push("Class definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:290:3: ( ( classHeader classBody ) -> ^( AST_CLASS classHeader classBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:290:7: ( classHeader classBody )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:290:7: ( classHeader classBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:290:8: classHeader classBody
            {
            pushFollow(FOLLOW_classHeader_in_classDef915);
            classHeader68=classHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classHeader.add(classHeader68.getTree());
            pushFollow(FOLLOW_classBody_in_classDef917);
            classBody69=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBody.add(classBody69.getTree());

            }



            // AST REWRITE
            // elements: classBody, classHeader
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 291:7: -> ^( AST_CLASS classHeader classBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:291:10: ^( AST_CLASS classHeader classBody )
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
            if ( state.backtracking>0 ) { memoize(input, 15, classDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDef"

    public static class classHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:292:1: classHeader : ( docs ( facet )* (m= classFlags )* KW_CLASS id ( inheritance )? ) -> ( ^( AST_MODIFIER $m) )* KW_CLASS id ( ^( AST_INHERITANCE inheritance ) )? ;
    public final FanParser.classHeader_return classHeader() throws RecognitionException {
        FanParser.classHeader_return retval = new FanParser.classHeader_return();
        retval.start = input.LT(1);
        int classHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CLASS72=null;
        FanParser.classFlags_return m = null;

        FanParser.docs_return docs70 = null;

        FanParser.facet_return facet71 = null;

        FanParser.id_return id73 = null;

        FanParser.inheritance_return inheritance74 = null;


        Object KW_CLASS72_tree=null;
        RewriteRuleTokenStream stream_KW_CLASS=new RewriteRuleTokenStream(adaptor,"token KW_CLASS");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_classFlags=new RewriteRuleSubtreeStream(adaptor,"rule classFlags");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:292:13: ( ( docs ( facet )* (m= classFlags )* KW_CLASS id ( inheritance )? ) -> ( ^( AST_MODIFIER $m) )* KW_CLASS id ( ^( AST_INHERITANCE inheritance ) )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:292:15: ( docs ( facet )* (m= classFlags )* KW_CLASS id ( inheritance )? )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:292:15: ( docs ( facet )* (m= classFlags )* KW_CLASS id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:292:16: docs ( facet )* (m= classFlags )* KW_CLASS id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_classHeader942);
            docs70=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs70.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:292:21: ( facet )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==AT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_classHeader944);
            	    facet71=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet71.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:292:29: (m= classFlags )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=KW_CONST && LA16_0<=KW_STATIC)||LA16_0==KW_FINAL||(LA16_0>=KW_ABSTRACT && LA16_0<=KW_INTERNAL)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= classFlags
            	    {
            	    pushFollow(FOLLOW_classFlags_in_classHeader949);
            	    m=classFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            KW_CLASS72=(Token)match(input,KW_CLASS,FOLLOW_KW_CLASS_in_classHeader952); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CLASS.add(KW_CLASS72);

            pushFollow(FOLLOW_id_in_classHeader954);
            id73=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id73.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:292:54: ( inheritance )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==SP_COLON) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_classHeader956);
                    inheritance74=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance74.getTree());

                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: m, id, inheritance, KW_CLASS
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
            // 293:4: -> ( ^( AST_MODIFIER $m) )* KW_CLASS id ( ^( AST_INHERITANCE inheritance ) )?
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:293:7: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:293:7: ^( AST_MODIFIER $m)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_1);

                    adaptor.addChild(root_1, stream_m.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_m.reset();
                adaptor.addChild(root_0, stream_KW_CLASS.nextNode());
                adaptor.addChild(root_0, stream_id.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:293:40: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:293:40: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 16, classHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classHeader"

    public static class classFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:294:1: classFlags : ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC );
    public final FanParser.classFlags_return classFlags() throws RecognitionException {
        FanParser.classFlags_return retval = new FanParser.classFlags_return();
        retval.start = input.LT(1);
        int classFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ABSTRACT76=null;
        Token KW_FINAL77=null;
        Token KW_CONST78=null;
        Token KW_STATIC79=null;
        FanParser.protection_return protection75 = null;


        Object KW_ABSTRACT76_tree=null;
        Object KW_FINAL77_tree=null;
        Object KW_CONST78_tree=null;
        Object KW_STATIC79_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:294:13: ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC )
            int alt18=5;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt18=1;
                }
                break;
            case KW_ABSTRACT:
                {
                alt18=2;
                }
                break;
            case KW_FINAL:
                {
                alt18=3;
                }
                break;
            case KW_CONST:
                {
                alt18=4;
                }
                break;
            case KW_STATIC:
                {
                alt18=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:294:15: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_classFlags991);
                    protection75=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection75.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:294:28: KW_ABSTRACT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ABSTRACT76=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_classFlags995); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ABSTRACT76_tree = (Object)adaptor.create(KW_ABSTRACT76);
                    adaptor.addChild(root_0, KW_ABSTRACT76_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:294:42: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL77=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_classFlags999); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL77_tree = (Object)adaptor.create(KW_FINAL77);
                    adaptor.addChild(root_0, KW_FINAL77_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:294:53: KW_CONST
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_CONST78=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_classFlags1003); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_CONST78_tree = (Object)adaptor.create(KW_CONST78);
                    adaptor.addChild(root_0, KW_CONST78_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:294:64: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC79=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_classFlags1007); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC79_tree = (Object)adaptor.create(KW_STATIC79);
                    adaptor.addChild(root_0, KW_STATIC79_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 17, classFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classFlags"

    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:295:1: classBody : ( bracketL ( slotDef )* bracketR ) -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) ;
    public final FanParser.classBody_return classBody() throws RecognitionException {
        FanParser.classBody_return retval = new FanParser.classBody_return();
        retval.start = input.LT(1);
        int classBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL80 = null;

        FanParser.slotDef_return slotDef81 = null;

        FanParser.bracketR_return bracketR82 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:295:12: ( ( bracketL ( slotDef )* bracketR ) -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:295:14: ( bracketL ( slotDef )* bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:295:14: ( bracketL ( slotDef )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:295:15: bracketL ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_classBody1016);
            bracketL80=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL80.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:295:24: ( slotDef )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=KW_RD_ONLY && LA19_0<=KW_FINAL)||(LA19_0>=KW_ABSTRACT && LA19_0<=KW_ONCE)||LA19_0==SP_PIPE||LA19_0==ID||(LA19_0>=AT && LA19_0<=DOC)||LA19_0==SQ_BRACKET_L) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_classBody1018);
            	    slotDef81=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef81.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_classBody1021);
            bracketR82=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR82.getTree());

            }



            // AST REWRITE
            // elements: bracketL, bracketR, slotDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 295:44: -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:295:47: ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:295:73: ( slotDef )*
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
            if ( state.backtracking>0 ) { memoize(input, 18, classBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBody"

    public static class protection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protection"
    // src/net/colar/netbeans/fan/antlr/Fan.g:296:1: protection : ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL );
    public final FanParser.protection_return protection() throws RecognitionException {
        FanParser.protection_return retval = new FanParser.protection_return();
        retval.start = input.LT(1);
        int protection_StartIndex = input.index();
        Object root_0 = null;

        Token set83=null;

        Object set83_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:12: ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            root_0 = (Object)adaptor.nil();

            set83=(Token)input.LT(1);
            if ( (input.LA(1)>=KW_PRIVATE && input.LA(1)<=KW_INTERNAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set83));
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
            if ( state.backtracking>0 ) { memoize(input, 19, protection_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "protection"

    public static class mixinDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:297:1: mixinDef : ( mixinHeader mixinBody ) -> ^( AST_MIXIN mixinHeader mixinBody ) ;
    public final FanParser.mixinDef_return mixinDef() throws RecognitionException {
        FanParser.mixinDef_return retval = new FanParser.mixinDef_return();
        retval.start = input.LT(1);
        int mixinDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mixinHeader_return mixinHeader84 = null;

        FanParser.mixinBody_return mixinBody85 = null;


        RewriteRuleSubtreeStream stream_mixinBody=new RewriteRuleSubtreeStream(adaptor,"rule mixinBody");
        RewriteRuleSubtreeStream stream_mixinHeader=new RewriteRuleSubtreeStream(adaptor,"rule mixinHeader");
        paraphrase.push("Mixin definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:3: ( ( mixinHeader mixinBody ) -> ^( AST_MIXIN mixinHeader mixinBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:5: ( mixinHeader mixinBody )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:5: ( mixinHeader mixinBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:6: mixinHeader mixinBody
            {
            pushFollow(FOLLOW_mixinHeader_in_mixinDef1074);
            mixinHeader84=mixinHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mixinHeader.add(mixinHeader84.getTree());
            pushFollow(FOLLOW_mixinBody_in_mixinDef1076);
            mixinBody85=mixinBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mixinBody.add(mixinBody85.getTree());

            }



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
            // 299:7: -> ^( AST_MIXIN mixinHeader mixinBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:299:10: ^( AST_MIXIN mixinHeader mixinBody )
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
            if ( state.backtracking>0 ) { memoize(input, 20, mixinDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinDef"

    public static class mixinHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:300:1: mixinHeader : ( docs ( facet )* (m= mixinFlags )* KW_MIXIN id ( inheritance )? ) -> ( ^( AST_MODIFIER $m) )* KW_MIXIN id ( ^( AST_INHERITANCE inheritance ) )? ;
    public final FanParser.mixinHeader_return mixinHeader() throws RecognitionException {
        FanParser.mixinHeader_return retval = new FanParser.mixinHeader_return();
        retval.start = input.LT(1);
        int mixinHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_MIXIN88=null;
        FanParser.mixinFlags_return m = null;

        FanParser.docs_return docs86 = null;

        FanParser.facet_return facet87 = null;

        FanParser.id_return id89 = null;

        FanParser.inheritance_return inheritance90 = null;


        Object KW_MIXIN88_tree=null;
        RewriteRuleTokenStream stream_KW_MIXIN=new RewriteRuleTokenStream(adaptor,"token KW_MIXIN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_mixinFlags=new RewriteRuleSubtreeStream(adaptor,"rule mixinFlags");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:13: ( ( docs ( facet )* (m= mixinFlags )* KW_MIXIN id ( inheritance )? ) -> ( ^( AST_MODIFIER $m) )* KW_MIXIN id ( ^( AST_INHERITANCE inheritance ) )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:15: ( docs ( facet )* (m= mixinFlags )* KW_MIXIN id ( inheritance )? )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:15: ( docs ( facet )* (m= mixinFlags )* KW_MIXIN id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:16: docs ( facet )* (m= mixinFlags )* KW_MIXIN id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_mixinHeader1101);
            docs86=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs86.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:21: ( facet )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==AT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_mixinHeader1103);
            	    facet87=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet87.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:300:29: (m= mixinFlags )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=KW_CONST && LA21_0<=KW_STATIC)||LA21_0==KW_FINAL||(LA21_0>=KW_PRIVATE && LA21_0<=KW_INTERNAL)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= mixinFlags
            	    {
            	    pushFollow(FOLLOW_mixinFlags_in_mixinHeader1108);
            	    m=mixinFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_mixinFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            KW_MIXIN88=(Token)match(input,KW_MIXIN,FOLLOW_KW_MIXIN_in_mixinHeader1111); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_MIXIN.add(KW_MIXIN88);

            pushFollow(FOLLOW_id_in_mixinHeader1113);
            id89=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id89.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:54: ( inheritance )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==SP_COLON) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_mixinHeader1115);
                    inheritance90=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance90.getTree());

                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: id, m, inheritance, KW_MIXIN
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
            // 301:4: -> ( ^( AST_MODIFIER $m) )* KW_MIXIN id ( ^( AST_INHERITANCE inheritance ) )?
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:301:8: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:301:8: ^( AST_MODIFIER $m)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_1);

                    adaptor.addChild(root_1, stream_m.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_m.reset();
                adaptor.addChild(root_0, stream_KW_MIXIN.nextNode());
                adaptor.addChild(root_0, stream_id.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:301:40: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:301:40: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 21, mixinHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinHeader"

    public static class mixinFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:302:1: mixinFlags : ( protection | KW_CONST | KW_STATIC | KW_FINAL );
    public final FanParser.mixinFlags_return mixinFlags() throws RecognitionException {
        FanParser.mixinFlags_return retval = new FanParser.mixinFlags_return();
        retval.start = input.LT(1);
        int mixinFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CONST92=null;
        Token KW_STATIC93=null;
        Token KW_FINAL94=null;
        FanParser.protection_return protection91 = null;


        Object KW_CONST92_tree=null;
        Object KW_STATIC93_tree=null;
        Object KW_FINAL94_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:12: ( protection | KW_CONST | KW_STATIC | KW_FINAL )
            int alt23=4;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt23=1;
                }
                break;
            case KW_CONST:
                {
                alt23=2;
                }
                break;
            case KW_STATIC:
                {
                alt23=3;
                }
                break;
            case KW_FINAL:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:302:14: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_mixinFlags1149);
                    protection91=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection91.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:302:27: KW_CONST
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_CONST92=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_mixinFlags1153); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_CONST92_tree = (Object)adaptor.create(KW_CONST92);
                    adaptor.addChild(root_0, KW_CONST92_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:302:38: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC93=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_mixinFlags1157); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC93_tree = (Object)adaptor.create(KW_STATIC93);
                    adaptor.addChild(root_0, KW_STATIC93_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:302:50: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL94=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_mixinFlags1161); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL94_tree = (Object)adaptor.create(KW_FINAL94);
                    adaptor.addChild(root_0, KW_FINAL94_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 22, mixinFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinFlags"

    public static class mixinBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:303:1: mixinBody : bracketL ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) ;
    public final FanParser.mixinBody_return mixinBody() throws RecognitionException {
        FanParser.mixinBody_return retval = new FanParser.mixinBody_return();
        retval.start = input.LT(1);
        int mixinBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL95 = null;

        FanParser.slotDef_return slotDef96 = null;

        FanParser.bracketR_return bracketR97 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:11: ( bracketL ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:13: bracketL ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_mixinBody1168);
            bracketL95=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL95.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:22: ( slotDef )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=KW_RD_ONLY && LA24_0<=KW_FINAL)||(LA24_0>=KW_ABSTRACT && LA24_0<=KW_ONCE)||LA24_0==SP_PIPE||LA24_0==ID||(LA24_0>=AT && LA24_0<=DOC)||LA24_0==SQ_BRACKET_L) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_mixinBody1170);
            	    slotDef96=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef96.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_mixinBody1173);
            bracketR97=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR97.getTree());


            // AST REWRITE
            // elements: bracketL, bracketR, slotDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 303:41: -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:303:44: ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:303:70: ( slotDef )*
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
            if ( state.backtracking>0 ) { memoize(input, 23, mixinBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinBody"

    public static class enumDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:304:1: enumDef : ( enumHeader enumBody ) -> ^( AST_ENUM enumHeader enumBody ) ;
    public final FanParser.enumDef_return enumDef() throws RecognitionException {
        FanParser.enumDef_return retval = new FanParser.enumDef_return();
        retval.start = input.LT(1);
        int enumDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.enumHeader_return enumHeader98 = null;

        FanParser.enumBody_return enumBody99 = null;


        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_enumHeader=new RewriteRuleSubtreeStream(adaptor,"rule enumHeader");
        paraphrase.push("Enumeration definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:3: ( ( enumHeader enumBody ) -> ^( AST_ENUM enumHeader enumBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:5: ( enumHeader enumBody )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:5: ( enumHeader enumBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:6: enumHeader enumBody
            {
            pushFollow(FOLLOW_enumHeader_in_enumDef1207);
            enumHeader98=enumHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumHeader.add(enumHeader98.getTree());
            pushFollow(FOLLOW_enumBody_in_enumDef1209);
            enumBody99=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody99.getTree());

            }



            // AST REWRITE
            // elements: enumBody, enumHeader
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 306:7: -> ^( AST_ENUM enumHeader enumBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:306:10: ^( AST_ENUM enumHeader enumBody )
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
            if ( state.backtracking>0 ) { memoize(input, 24, enumDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumDef"

    public static class enumHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:307:1: enumHeader : ( docs ( facet )* (m= protection )? KW_ENUM id ( inheritance )? ) -> ( ^( AST_MODIFIER $m) )* KW_ENUM id ( ^( AST_INHERITANCE inheritance ) )? ;
    public final FanParser.enumHeader_return enumHeader() throws RecognitionException {
        FanParser.enumHeader_return retval = new FanParser.enumHeader_return();
        retval.start = input.LT(1);
        int enumHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ENUM102=null;
        FanParser.protection_return m = null;

        FanParser.docs_return docs100 = null;

        FanParser.facet_return facet101 = null;

        FanParser.id_return id103 = null;

        FanParser.inheritance_return inheritance104 = null;


        Object KW_ENUM102_tree=null;
        RewriteRuleTokenStream stream_KW_ENUM=new RewriteRuleTokenStream(adaptor,"token KW_ENUM");
        RewriteRuleSubtreeStream stream_protection=new RewriteRuleSubtreeStream(adaptor,"rule protection");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:12: ( ( docs ( facet )* (m= protection )? KW_ENUM id ( inheritance )? ) -> ( ^( AST_MODIFIER $m) )* KW_ENUM id ( ^( AST_INHERITANCE inheritance ) )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:17: ( docs ( facet )* (m= protection )? KW_ENUM id ( inheritance )? )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:17: ( docs ( facet )* (m= protection )? KW_ENUM id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:18: docs ( facet )* (m= protection )? KW_ENUM id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_enumHeader1237);
            docs100=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs100.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:23: ( facet )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==AT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_enumHeader1239);
            	    facet101=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet101.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:307:31: (m= protection )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=KW_PRIVATE && LA26_0<=KW_INTERNAL)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= protection
                    {
                    pushFollow(FOLLOW_protection_in_enumHeader1244);
                    m=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protection.add(m.getTree());

                    }
                    break;

            }

            KW_ENUM102=(Token)match(input,KW_ENUM,FOLLOW_KW_ENUM_in_enumHeader1247); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_ENUM.add(KW_ENUM102);

            pushFollow(FOLLOW_id_in_enumHeader1249);
            id103=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id103.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:55: ( inheritance )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==SP_COLON) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_enumHeader1251);
                    inheritance104=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance104.getTree());

                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: inheritance, m, KW_ENUM, id
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
            // 308:4: -> ( ^( AST_MODIFIER $m) )* KW_ENUM id ( ^( AST_INHERITANCE inheritance ) )?
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:308:8: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:8: ^( AST_MODIFIER $m)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_1);

                    adaptor.addChild(root_1, stream_m.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_m.reset();
                adaptor.addChild(root_0, stream_KW_ENUM.nextNode());
                adaptor.addChild(root_0, stream_id.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:308:39: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:39: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 25, enumHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumHeader"

    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:309:1: enumBody : bracketL enumValDefs ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR ) ;
    public final FanParser.enumBody_return enumBody() throws RecognitionException {
        FanParser.enumBody_return retval = new FanParser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL105 = null;

        FanParser.enumValDefs_return enumValDefs106 = null;

        FanParser.slotDef_return slotDef107 = null;

        FanParser.bracketR_return bracketR108 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        RewriteRuleSubtreeStream stream_enumValDefs=new RewriteRuleSubtreeStream(adaptor,"rule enumValDefs");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:10: ( bracketL enumValDefs ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:12: bracketL enumValDefs ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_enumBody1285);
            bracketL105=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL105.getTree());
            pushFollow(FOLLOW_enumValDefs_in_enumBody1287);
            enumValDefs106=enumValDefs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumValDefs.add(enumValDefs106.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:33: ( slotDef )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=KW_RD_ONLY && LA28_0<=KW_FINAL)||(LA28_0>=KW_ABSTRACT && LA28_0<=KW_ONCE)||LA28_0==SP_PIPE||LA28_0==ID||(LA28_0>=AT && LA28_0<=DOC)||LA28_0==SQ_BRACKET_L) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_enumBody1289);
            	    slotDef107=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef107.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_enumBody1292);
            bracketR108=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR108.getTree());


            // AST REWRITE
            // elements: bracketR, slotDef, enumValDefs, bracketL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 309:53: -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:309:56: ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                adaptor.addChild(root_1, stream_enumValDefs.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:309:94: ( slotDef )*
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
            if ( state.backtracking>0 ) { memoize(input, 26, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBody"

    public static class inheritance_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritance"
    // src/net/colar/netbeans/fan/antlr/Fan.g:310:1: inheritance : SP_COLON typeList ;
    public final FanParser.inheritance_return inheritance() throws RecognitionException {
        FanParser.inheritance_return retval = new FanParser.inheritance_return();
        retval.start = input.LT(1);
        int inheritance_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON109=null;
        FanParser.typeList_return typeList110 = null;


        Object SP_COLON109_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:14: ( SP_COLON typeList )
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:16: SP_COLON typeList
            {
            root_0 = (Object)adaptor.nil();

            SP_COLON109=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_inheritance1317); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON109_tree = (Object)adaptor.create(SP_COLON109);
            adaptor.addChild(root_0, SP_COLON109_tree);
            }
            pushFollow(FOLLOW_typeList_in_inheritance1319);
            typeList110=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList110.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 27, inheritance_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritance"

    public static class enumValDefs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValDefs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:312:1: enumValDefs : enumValDef ( SP_COMMA enumValDef )* eos ;
    public final FanParser.enumValDefs_return enumValDefs() throws RecognitionException {
        FanParser.enumValDefs_return retval = new FanParser.enumValDefs_return();
        retval.start = input.LT(1);
        int enumValDefs_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA112=null;
        FanParser.enumValDef_return enumValDef111 = null;

        FanParser.enumValDef_return enumValDef113 = null;

        FanParser.eos_return eos114 = null;


        Object SP_COMMA112_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:312:14: ( enumValDef ( SP_COMMA enumValDef )* eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:312:16: enumValDef ( SP_COMMA enumValDef )* eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_enumValDef_in_enumValDefs1329);
            enumValDef111=enumValDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValDef111.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:312:27: ( SP_COMMA enumValDef )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==SP_COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:312:28: SP_COMMA enumValDef
            	    {
            	    SP_COMMA112=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_enumValDefs1332); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA112_tree = (Object)adaptor.create(SP_COMMA112);
            	    adaptor.addChild(root_0, SP_COMMA112_tree);
            	    }
            	    pushFollow(FOLLOW_enumValDef_in_enumValDefs1335);
            	    enumValDef113=enumValDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValDef113.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            pushFollow(FOLLOW_eos_in_enumValDefs1339);
            eos114=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos114.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 28, enumValDefs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValDefs"

    public static class enumValDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:313:1: enumValDef : docs id ( parL ( args )? parR )? ;
    public final FanParser.enumValDef_return enumValDef() throws RecognitionException {
        FanParser.enumValDef_return retval = new FanParser.enumValDef_return();
        retval.start = input.LT(1);
        int enumValDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs115 = null;

        FanParser.id_return id116 = null;

        FanParser.parL_return parL117 = null;

        FanParser.args_return args118 = null;

        FanParser.parR_return parR119 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:13: ( docs id ( parL ( args )? parR )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:15: docs id ( parL ( args )? parR )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_enumValDef1347);
            docs115=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs115.getTree());
            pushFollow(FOLLOW_id_in_enumValDef1349);
            id116=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id116.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:23: ( parL ( args )? parR )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==PAR_L) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:24: parL ( args )? parR
                    {
                    pushFollow(FOLLOW_parL_in_enumValDef1352);
                    parL117=parL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parL117.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:313:29: ( args )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=KW_THIS && LA30_0<=KW_SUPER)||(LA30_0>=KW_NULL && LA30_0<=KW_FALSE)||LA30_0==SP_PIPE||(LA30_0>=OP_PLUS && LA30_0<=OP_MULTI)||(LA30_0>=OP_CURRY && LA30_0<=OP_2MINUS)||(LA30_0>=ID && LA30_0<=AT)||(LA30_0>=NUMBER && LA30_0<=SQ_BRACKET_L)||LA30_0==PAR_L) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                            {
                            pushFollow(FOLLOW_args_in_enumValDef1354);
                            args118=args();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, args118.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_parR_in_enumValDef1357);
                    parR119=parR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parR119.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 29, enumValDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValDef"

    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeList"
    // src/net/colar/netbeans/fan/antlr/Fan.g:314:1: typeList : type ( SP_COMMA type )* ;
    public final FanParser.typeList_return typeList() throws RecognitionException {
        FanParser.typeList_return retval = new FanParser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA121=null;
        FanParser.type_return type120 = null;

        FanParser.type_return type122 = null;


        Object SP_COMMA121_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:10: ( type ( SP_COMMA type )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:14: type ( SP_COMMA type )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_typeList1368);
            type120=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type120.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:19: ( SP_COMMA type )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==SP_COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:314:20: SP_COMMA type
            	    {
            	    SP_COMMA121=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_typeList1371); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA121_tree = (Object)adaptor.create(SP_COMMA121);
            	    adaptor.addChild(root_0, SP_COMMA121_tree);
            	    }
            	    pushFollow(FOLLOW_type_in_typeList1373);
            	    type122=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type122.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 30, typeList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeList"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // src/net/colar/netbeans/fan/antlr/Fan.g:316:1: type : ( typeRoot ( SP_QMARK )? typeTail ) -> ^( AST_TYPE typeRoot ( SP_QMARK )? ( typeTail )? ) ;
    public final FanParser.type_return type() throws RecognitionException {
        FanParser.type_return retval = new FanParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK124=null;
        FanParser.typeRoot_return typeRoot123 = null;

        FanParser.typeTail_return typeTail125 = null;


        Object SP_QMARK124_tree=null;
        RewriteRuleTokenStream stream_SP_QMARK=new RewriteRuleTokenStream(adaptor,"token SP_QMARK");
        RewriteRuleSubtreeStream stream_typeTail=new RewriteRuleSubtreeStream(adaptor,"rule typeTail");
        RewriteRuleSubtreeStream stream_typeRoot=new RewriteRuleSubtreeStream(adaptor,"rule typeRoot");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:14: ( ( typeRoot ( SP_QMARK )? typeTail ) -> ^( AST_TYPE typeRoot ( SP_QMARK )? ( typeTail )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:18: ( typeRoot ( SP_QMARK )? typeTail )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:18: ( typeRoot ( SP_QMARK )? typeTail )
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:19: typeRoot ( SP_QMARK )? typeTail
            {
            pushFollow(FOLLOW_typeRoot_in_type1394);
            typeRoot123=typeRoot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeRoot.add(typeRoot123.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:316:28: ( SP_QMARK )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==SP_QMARK) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred48_Fan()) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    SP_QMARK124=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type1396); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SP_QMARK.add(SP_QMARK124);


                    }
                    break;

            }

            pushFollow(FOLLOW_typeTail_in_type1399);
            typeTail125=typeTail();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTail.add(typeTail125.getTree());

            }



            // AST REWRITE
            // elements: SP_QMARK, typeTail, typeRoot
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 317:6: -> ^( AST_TYPE typeRoot ( SP_QMARK )? ( typeTail )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:317:9: ^( AST_TYPE typeRoot ( SP_QMARK )? ( typeTail )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE, "AST_TYPE"), root_1);

                adaptor.addChild(root_1, stream_typeRoot.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:317:29: ( SP_QMARK )?
                if ( stream_SP_QMARK.hasNext() ) {
                    adaptor.addChild(root_1, stream_SP_QMARK.nextNode());

                }
                stream_SP_QMARK.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:317:39: ( typeTail )?
                if ( stream_typeTail.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTail.nextTree());

                }
                stream_typeTail.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 31, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class typeTail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeTail"
    // src/net/colar/netbeans/fan/antlr/Fan.g:318:1: typeTail : ( LIST_TYPE ( SP_QMARK )? )* ;
    public final FanParser.typeTail_return typeTail() throws RecognitionException {
        FanParser.typeTail_return retval = new FanParser.typeTail_return();
        retval.start = input.LT(1);
        int typeTail_StartIndex = input.index();
        Object root_0 = null;

        Token LIST_TYPE126=null;
        Token SP_QMARK127=null;

        Object LIST_TYPE126_tree=null;
        Object SP_QMARK127_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:318:10: ( ( LIST_TYPE ( SP_QMARK )? )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:318:14: ( LIST_TYPE ( SP_QMARK )? )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:318:14: ( LIST_TYPE ( SP_QMARK )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LIST_TYPE) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred50_Fan()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:318:15: LIST_TYPE ( SP_QMARK )?
            	    {
            	    LIST_TYPE126=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_typeTail1429); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LIST_TYPE126_tree = (Object)adaptor.create(LIST_TYPE126);
            	    adaptor.addChild(root_0, LIST_TYPE126_tree);
            	    }
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:318:25: ( SP_QMARK )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==SP_QMARK) ) {
            	        int LA34_1 = input.LA(2);

            	        if ( (synpred49_Fan()) ) {
            	            alt34=1;
            	        }
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK127=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_typeTail1431); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK127_tree = (Object)adaptor.create(SP_QMARK127);
            	            adaptor.addChild(root_0, SP_QMARK127_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
            if ( state.backtracking>0 ) { memoize(input, 32, typeTail_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeTail"

    public static class typeRoot_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeRoot"
    // src/net/colar/netbeans/fan/antlr/Fan.g:319:1: typeRoot : ( mapType | nonMapType );
    public final FanParser.typeRoot_return typeRoot() throws RecognitionException {
        FanParser.typeRoot_return retval = new FanParser.typeRoot_return();
        retval.start = input.LT(1);
        int typeRoot_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mapType_return mapType128 = null;

        FanParser.nonMapType_return nonMapType129 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:319:10: ( mapType | nonMapType )
            int alt36=2;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                alt36=1;
                }
                break;
            case SP_PIPE:
                {
                int LA36_2 = input.LA(2);

                if ( (synpred51_Fan()) ) {
                    alt36=1;
                }
                else if ( (true) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA36_3 = input.LA(2);

                if ( (synpred51_Fan()) ) {
                    alt36=1;
                }
                else if ( (true) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:319:12: mapType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_mapType_in_typeRoot1441);
                    mapType128=mapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapType128.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:319:22: nonMapType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nonMapType_in_typeRoot1445);
                    nonMapType129=nonMapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonMapType129.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 33, typeRoot_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeRoot"

    public static class nonMapType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonMapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:320:1: nonMapType : ( funcType | simpleType );
    public final FanParser.nonMapType_return nonMapType() throws RecognitionException {
        FanParser.nonMapType_return retval = new FanParser.nonMapType_return();
        retval.start = input.LT(1);
        int nonMapType_StartIndex = input.index();
        Object root_0 = null;

        FanParser.funcType_return funcType130 = null;

        FanParser.simpleType_return simpleType131 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:320:12: ( funcType | simpleType )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==SP_PIPE) ) {
                alt37=1;
            }
            else if ( (LA37_0==ID) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:320:14: funcType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_nonMapType1452);
                    funcType130=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType130.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:320:25: simpleType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simpleType_in_nonMapType1456);
                    simpleType131=simpleType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType131.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 34, nonMapType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nonMapType"

    public static class simpleType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:321:1: simpleType : id ( SP_COLCOL id )? ;
    public final FanParser.simpleType_return simpleType() throws RecognitionException {
        FanParser.simpleType_return retval = new FanParser.simpleType_return();
        retval.start = input.LT(1);
        int simpleType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLCOL133=null;
        FanParser.id_return id132 = null;

        FanParser.id_return id134 = null;


        Object SP_COLCOL133_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:17: ( id ( SP_COLCOL id )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:21: id ( SP_COLCOL id )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_simpleType1470);
            id132=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id132.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:24: ( SP_COLCOL id )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==SP_COLCOL) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:321:25: SP_COLCOL id
                    {
                    SP_COLCOL133=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_simpleType1473); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLCOL133_tree = (Object)adaptor.create(SP_COLCOL133);
                    adaptor.addChild(root_0, SP_COLCOL133_tree);
                    }
                    pushFollow(FOLLOW_id_in_simpleType1475);
                    id134=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id134.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 35, simpleType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleType"

    public static class mapType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:323:1: mapType : ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? -> ^( AST_MAP ^( AST_CHILD nonMapType ) ^( AST_CHILD type ) ) ;
    public final FanParser.mapType_return mapType() throws RecognitionException {
        FanParser.mapType_return retval = new FanParser.mapType_return();
        retval.start = input.LT(1);
        int mapType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK137=null;
        Token LIST_TYPE138=null;
        Token SP_QMARK139=null;
        Token SP_COLON140=null;
        FanParser.sq_bracketL_return sq_bracketL135 = null;

        FanParser.nonMapType_return nonMapType136 = null;

        FanParser.type_return type141 = null;

        FanParser.sq_bracketR_return sq_bracketR142 = null;


        Object SP_QMARK137_tree=null;
        Object LIST_TYPE138_tree=null;
        Object SP_QMARK139_tree=null;
        Object SP_COLON140_tree=null;
        RewriteRuleTokenStream stream_SP_QMARK=new RewriteRuleTokenStream(adaptor,"token SP_QMARK");
        RewriteRuleTokenStream stream_SP_COLON=new RewriteRuleTokenStream(adaptor,"token SP_COLON");
        RewriteRuleTokenStream stream_LIST_TYPE=new RewriteRuleTokenStream(adaptor,"token LIST_TYPE");
        RewriteRuleSubtreeStream stream_nonMapType=new RewriteRuleSubtreeStream(adaptor,"rule nonMapType");
        RewriteRuleSubtreeStream stream_sq_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketR");
        RewriteRuleSubtreeStream stream_sq_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketL");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:323:10: ( ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? -> ^( AST_MAP ^( AST_CHILD nonMapType ) ^( AST_CHILD type ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:323:12: ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )?
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:323:12: ( sq_bracketL )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==SQ_BRACKET_L) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: sq_bracketL
                    {
                    pushFollow(FOLLOW_sq_bracketL_in_mapType1486);
                    sq_bracketL135=sq_bracketL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sq_bracketL.add(sq_bracketL135.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_nonMapType_in_mapType1489);
            nonMapType136=nonMapType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nonMapType.add(nonMapType136.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:323:36: ( SP_QMARK )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==SP_QMARK) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    SP_QMARK137=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType1491); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SP_QMARK.add(SP_QMARK137);


                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:323:46: ( LIST_TYPE ( SP_QMARK )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LIST_TYPE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:323:47: LIST_TYPE ( SP_QMARK )?
            	    {
            	    LIST_TYPE138=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_mapType1495); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LIST_TYPE.add(LIST_TYPE138);

            	    // src/net/colar/netbeans/fan/antlr/Fan.g:323:57: ( SP_QMARK )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==SP_QMARK) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK139=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType1497); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_SP_QMARK.add(SP_QMARK139);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:324:5: ({...}? SP_COLON {...}? type )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==SP_COLON) ) {
                    int LA43_2 = input.LA(2);

                    if ( ((synpred58_Fan()&&(notAfterEol()))) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:324:6: {...}? SP_COLON {...}? type
            	    {
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    SP_COLON140=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapType1509); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SP_COLON.add(SP_COLON140);

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    pushFollow(FOLLOW_type_in_mapType1513);
            	    type141=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type141.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:324:56: ( sq_bracketR )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==SQ_BRACKET_R) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred59_Fan()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: sq_bracketR
                    {
                    pushFollow(FOLLOW_sq_bracketR_in_mapType1517);
                    sq_bracketR142=sq_bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sq_bracketR.add(sq_bracketR142.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: type, nonMapType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 325:4: -> ^( AST_MAP ^( AST_CHILD nonMapType ) ^( AST_CHILD type ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:325:7: ^( AST_MAP ^( AST_CHILD nonMapType ) ^( AST_CHILD type ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MAP, "AST_MAP"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:325:17: ^( AST_CHILD nonMapType )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_nonMapType.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:325:41: ^( AST_CHILD type )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
            if ( state.backtracking>0 ) { memoize(input, 36, mapType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapType"

    public static class funcType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:327:1: funcType : ( SP_PIPE funcTypeContent SP_PIPE ) -> ^( AST_FUNC_TYPE funcTypeContent ) ;
    public final FanParser.funcType_return funcType() throws RecognitionException {
        FanParser.funcType_return retval = new FanParser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_PIPE143=null;
        Token SP_PIPE145=null;
        FanParser.funcTypeContent_return funcTypeContent144 = null;


        Object SP_PIPE143_tree=null;
        Object SP_PIPE145_tree=null;
        RewriteRuleTokenStream stream_SP_PIPE=new RewriteRuleTokenStream(adaptor,"token SP_PIPE");
        RewriteRuleSubtreeStream stream_funcTypeContent=new RewriteRuleSubtreeStream(adaptor,"rule funcTypeContent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:11: ( ( SP_PIPE funcTypeContent SP_PIPE ) -> ^( AST_FUNC_TYPE funcTypeContent ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:13: ( SP_PIPE funcTypeContent SP_PIPE )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:13: ( SP_PIPE funcTypeContent SP_PIPE )
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:14: SP_PIPE funcTypeContent SP_PIPE
            {
            SP_PIPE143=(Token)match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType1549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_PIPE.add(SP_PIPE143);

            pushFollow(FOLLOW_funcTypeContent_in_funcType1551);
            funcTypeContent144=funcTypeContent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_funcTypeContent.add(funcTypeContent144.getTree());
            SP_PIPE145=(Token)match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType1553); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_PIPE.add(SP_PIPE145);


            }



            // AST REWRITE
            // elements: funcTypeContent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 328:5: -> ^( AST_FUNC_TYPE funcTypeContent )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:328:8: ^( AST_FUNC_TYPE funcTypeContent )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_FUNC_TYPE, "AST_FUNC_TYPE"), root_1);

                adaptor.addChild(root_1, stream_funcTypeContent.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 37, funcType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcType"

    public static class funcTypeContent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcTypeContent"
    // src/net/colar/netbeans/fan/antlr/Fan.g:329:1: funcTypeContent : ( ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) );
    public final FanParser.funcTypeContent_return funcTypeContent() throws RecognitionException {
        FanParser.funcTypeContent_return retval = new FanParser.funcTypeContent_return();
        retval.start = input.LT(1);
        int funcTypeContent_StartIndex = input.index();
        Object root_0 = null;

        FanParser.formals_return formals146 = null;

        FanParser.assignedType_return assignedType147 = null;

        FanParser.assignedType_return assignedType148 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:329:17: ( ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==SP_PIPE||LA46_0==ID||LA46_0==SQ_BRACKET_L) ) {
                alt46=1;
            }
            else if ( (LA46_0==OP_ARROW) && (synpred62_Fan())) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:329:19: ( formals ( ( OP_ARROW )=> assignedType )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:329:19: ( formals ( ( OP_ARROW )=> assignedType )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:329:20: formals ( ( OP_ARROW )=> assignedType )?
                    {
                    pushFollow(FOLLOW_formals_in_funcTypeContent1574);
                    formals146=formals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formals146.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:329:28: ( ( OP_ARROW )=> assignedType )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==OP_ARROW) && (synpred60_Fan())) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:329:29: ( OP_ARROW )=> assignedType
                            {
                            pushFollow(FOLLOW_assignedType_in_funcTypeContent1581);
                            assignedType147=assignedType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType147.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:329:59: ( ( OP_ARROW )=> assignedType )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:329:59: ( ( OP_ARROW )=> assignedType )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:329:60: ( OP_ARROW )=> assignedType
                    {
                    pushFollow(FOLLOW_assignedType_in_funcTypeContent1593);
                    assignedType148=assignedType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType148.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 38, funcTypeContent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcTypeContent"

    public static class assignedType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignedType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:330:1: assignedType : OP_ARROW ( type )? ;
    public final FanParser.assignedType_return assignedType() throws RecognitionException {
        FanParser.assignedType_return retval = new FanParser.assignedType_return();
        retval.start = input.LT(1);
        int assignedType_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW149=null;
        FanParser.type_return type150 = null;


        Object OP_ARROW149_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:14: ( OP_ARROW ( type )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:16: OP_ARROW ( type )?
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW149=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_assignedType1601); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW149_tree = (Object)adaptor.create(OP_ARROW149);
            adaptor.addChild(root_0, OP_ARROW149_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:25: ( type )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ID||LA47_0==SQ_BRACKET_L) ) {
                alt47=1;
            }
            else if ( (LA47_0==SP_PIPE) ) {
                int LA47_2 = input.LA(2);

                if ( (synpred63_Fan()) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_assignedType1603);
                    type150=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type150.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 39, assignedType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignedType"

    public static class formals_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formals"
    // src/net/colar/netbeans/fan/antlr/Fan.g:331:1: formals : formal ( SP_COMMA formal )* ;
    public final FanParser.formals_return formals() throws RecognitionException {
        FanParser.formals_return retval = new FanParser.formals_return();
        retval.start = input.LT(1);
        int formals_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA152=null;
        FanParser.formal_return formal151 = null;

        FanParser.formal_return formal153 = null;


        Object SP_COMMA152_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:10: ( formal ( SP_COMMA formal )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:14: formal ( SP_COMMA formal )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_formal_in_formals1614);
            formal151=formal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formal151.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:21: ( SP_COMMA formal )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==SP_COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:331:22: SP_COMMA formal
            	    {
            	    SP_COMMA152=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_formals1617); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA152_tree = (Object)adaptor.create(SP_COMMA152);
            	    adaptor.addChild(root_0, SP_COMMA152_tree);
            	    }
            	    pushFollow(FOLLOW_formal_in_formals1619);
            	    formal153=formal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal153.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
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
            if ( state.backtracking>0 ) { memoize(input, 40, formals_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formals"

    public static class formal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:332:1: formal : ( formal_content ) -> ^( AST_FORMAL formal_content ) ;
    public final FanParser.formal_return formal() throws RecognitionException {
        FanParser.formal_return retval = new FanParser.formal_return();
        retval.start = input.LT(1);
        int formal_StartIndex = input.index();
        Object root_0 = null;

        FanParser.formal_content_return formal_content154 = null;


        RewriteRuleSubtreeStream stream_formal_content=new RewriteRuleSubtreeStream(adaptor,"rule formal_content");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:9: ( ( formal_content ) -> ^( AST_FORMAL formal_content ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:11: ( formal_content )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:11: ( formal_content )
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:12: formal_content
            {
            pushFollow(FOLLOW_formal_content_in_formal1630);
            formal_content154=formal_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formal_content.add(formal_content154.getTree());

            }



            // AST REWRITE
            // elements: formal_content
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 333:6: -> ^( AST_FORMAL formal_content )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:333:9: ^( AST_FORMAL formal_content )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_FORMAL, "AST_FORMAL"), root_1);

                adaptor.addChild(root_1, stream_formal_content.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 41, formal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formal"

    public static class formal_content_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_content"
    // src/net/colar/netbeans/fan/antlr/Fan.g:334:1: formal_content : ( formalFull | formalTypeOnly | formalInferred ) ;
    public final FanParser.formal_content_return formal_content() throws RecognitionException {
        FanParser.formal_content_return retval = new FanParser.formal_content_return();
        retval.start = input.LT(1);
        int formal_content_StartIndex = input.index();
        Object root_0 = null;

        FanParser.formalFull_return formalFull155 = null;

        FanParser.formalTypeOnly_return formalTypeOnly156 = null;

        FanParser.formalInferred_return formalInferred157 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:16: ( ( formalFull | formalTypeOnly | formalInferred ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:18: ( formalFull | formalTypeOnly | formalInferred )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:334:18: ( formalFull | formalTypeOnly | formalInferred )
            int alt49=3;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                int LA49_1 = input.LA(2);

                if ( (synpred65_Fan()) ) {
                    alt49=1;
                }
                else if ( (synpred66_Fan()) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
                }
                break;
            case SP_PIPE:
                {
                int LA49_2 = input.LA(2);

                if ( (synpred65_Fan()) ) {
                    alt49=1;
                }
                else if ( (synpred66_Fan()) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA49_3 = input.LA(2);

                if ( (synpred65_Fan()) ) {
                    alt49=1;
                }
                else if ( (synpred66_Fan()) ) {
                    alt49=2;
                }
                else if ( (true) ) {
                    alt49=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:334:19: formalFull
                    {
                    pushFollow(FOLLOW_formalFull_in_formal_content1652);
                    formalFull155=formalFull();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalFull155.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:334:32: formalTypeOnly
                    {
                    pushFollow(FOLLOW_formalTypeOnly_in_formal_content1656);
                    formalTypeOnly156=formalTypeOnly();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalTypeOnly156.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:334:49: formalInferred
                    {
                    pushFollow(FOLLOW_formalInferred_in_formal_content1660);
                    formalInferred157=formalInferred();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalInferred157.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 42, formal_content_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formal_content"

    public static class formalFull_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalFull"
    // src/net/colar/netbeans/fan/antlr/Fan.g:335:1: formalFull : type id ;
    public final FanParser.formalFull_return formalFull() throws RecognitionException {
        FanParser.formalFull_return retval = new FanParser.formalFull_return();
        retval.start = input.LT(1);
        int formalFull_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type158 = null;

        FanParser.id_return id159 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:17: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:19: type id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalFull1673);
            type158=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type158.getTree());
            pushFollow(FOLLOW_id_in_formalFull1675);
            id159=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id159.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 43, formalFull_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalFull"

    public static class formalTypeOnly_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalTypeOnly"
    // src/net/colar/netbeans/fan/antlr/Fan.g:336:1: formalTypeOnly : type ;
    public final FanParser.formalTypeOnly_return formalTypeOnly() throws RecognitionException {
        FanParser.formalTypeOnly_return retval = new FanParser.formalTypeOnly_return();
        retval.start = input.LT(1);
        int formalTypeOnly_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type160 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:336:17: ( type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:336:21: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalTypeOnly1685);
            type160=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type160.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 44, formalTypeOnly_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalTypeOnly"

    public static class formalInferred_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalInferred"
    // src/net/colar/netbeans/fan/antlr/Fan.g:337:1: formalInferred : id ;
    public final FanParser.formalInferred_return formalInferred() throws RecognitionException {
        FanParser.formalInferred_return retval = new FanParser.formalInferred_return();
        retval.start = input.LT(1);
        int formalInferred_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id161 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:17: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:21: id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_formalInferred1695);
            id161=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id161.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 45, formalInferred_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalInferred"

    public static class slotDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slotDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:338:1: slotDef : ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) ;
    public final FanParser.slotDef_return slotDef() throws RecognitionException {
        FanParser.slotDef_return retval = new FanParser.slotDef_return();
        retval.start = input.LT(1);
        int slotDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.staticBlock_return staticBlock162 = null;

        FanParser.docs_return docs163 = null;

        FanParser.facet_return facet164 = null;

        FanParser.ctorDef_return ctorDef165 = null;

        FanParser.methodDef_return methodDef166 = null;

        FanParser.fieldDef_return fieldDef167 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:338:10: ( ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:338:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:338:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:338:13: ( KW_STATIC bracketL )=> staticBlock
                    {
                    pushFollow(FOLLOW_staticBlock_in_slotDef1711);
                    staticBlock162=staticBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticBlock162.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:339:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:339:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:339:6: docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    {
                    pushFollow(FOLLOW_docs_in_slotDef1719);
                    docs163=docs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, docs163.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:339:11: ( facet )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==AT) ) {
                            int LA50_2 = input.LA(2);

                            if ( (LA50_2==ID) ) {
                                int LA50_3 = input.LA(3);

                                if ( (synpred68_Fan()) ) {
                                    alt50=1;
                                }


                            }


                        }


                        switch (alt50) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
                    	    {
                    	    pushFollow(FOLLOW_facet_in_slotDef1721);
                    	    facet164=facet();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet164.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:340:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    int alt51=3;
                    alt51 = dfa51.predict(input);
                    switch (alt51) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:341:7: ( ( ctorFlags )* KW_NEW )=> ctorDef
                            {
                            pushFollow(FOLLOW_ctorDef_in_slotDef1744);
                            ctorDef165=ctorDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorDef165.getTree());

                            }
                            break;
                        case 2 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:342:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef
                            {
                            pushFollow(FOLLOW_methodDef_in_slotDef1771);
                            methodDef166=methodDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDef166.getTree());

                            }
                            break;
                        case 3 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:343:7: fieldDef
                            {
                            pushFollow(FOLLOW_fieldDef_in_slotDef1781);
                            fieldDef167=fieldDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDef167.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 46, slotDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slotDef"

    public static class fieldDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:347:1: fieldDef : docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? ) ;
    public final FanParser.fieldDef_return fieldDef() throws RecognitionException {
        FanParser.fieldDef_return retval = new FanParser.fieldDef_return();
        retval.start = input.LT(1);
        int fieldDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL171=null;
        Token SP_SEMI177=null;
        FanParser.fieldFlags_return m = null;

        FanParser.docs_return docs168 = null;

        FanParser.facet_return facet169 = null;

        FanParser.typeId_return typeId170 = null;

        FanParser.expr_return expr172 = null;

        FanParser.bracketL_return bracketL173 = null;

        FanParser.protection_return protection174 = null;

        FanParser.getter_return getter175 = null;

        FanParser.setter_return setter176 = null;

        FanParser.block_return block178 = null;

        FanParser.bracketR_return bracketR179 = null;

        FanParser.eos_return eos180 = null;


        Object AS_INIT_VAL171_tree=null;
        Object SP_SEMI177_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:3: ( docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:5: docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            {
            pushFollow(FOLLOW_docs_in_fieldDef1817);
            docs168=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs168.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:10: ( facet )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==AT) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_fieldDef1819);
            	    facet169=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet169.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            pushFollow(FOLLOW_fieldFlags_in_fieldDef1824);
            m=fieldFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldFlags.add(m.getTree());
            pushFollow(FOLLOW_typeId_in_fieldDef1826);
            typeId170=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeId.add(typeId170.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:37: ( AS_INIT_VAL expr )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==AS_INIT_VAL) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:38: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL171=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_fieldDef1829); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL171);

                    pushFollow(FOLLOW_expr_in_fieldDef1831);
                    expr172=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr172.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:349:5: ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==BRACKET_L) ) {
                alt60=1;
            }
            else if ( (LA60_0==EOF||(LA60_0>=KW_RD_ONLY && LA60_0<=KW_FINAL)||(LA60_0>=KW_ABSTRACT && LA60_0<=KW_ONCE)||LA60_0==BRACKET_R||LA60_0==SP_PIPE||LA60_0==SP_SEMI||LA60_0==ID||(LA60_0>=AT && LA60_0<=DOC)||LA60_0==SQ_BRACKET_L) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:350:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:350:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:350:6: bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR
                    {
                    pushFollow(FOLLOW_bracketL_in_fieldDef1846);
                    bracketL173=bracketL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketL.add(bracketL173.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:350:15: ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( ((LA59_0>=KW_PRIVATE && LA59_0<=KW_INTERNAL)||LA59_0==ID) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:350:16: ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )?
                    	    {
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:350:16: ( protection )?
                    	    int alt55=2;
                    	    int LA55_0 = input.LA(1);

                    	    if ( ((LA55_0>=KW_PRIVATE && LA55_0<=KW_INTERNAL)) ) {
                    	        alt55=1;
                    	    }
                    	    switch (alt55) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    	            {
                    	            pushFollow(FOLLOW_protection_in_fieldDef1849);
                    	            protection174=protection();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_protection.add(protection174.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:350:28: ( getter | setter )
                    	    int alt56=2;
                    	    int LA56_0 = input.LA(1);

                    	    if ( (LA56_0==ID) ) {
                    	        int LA56_1 = input.LA(2);

                    	        if ( (synpred77_Fan()) ) {
                    	            alt56=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt56=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 56, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 56, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt56) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:350:29: getter
                    	            {
                    	            pushFollow(FOLLOW_getter_in_fieldDef1853);
                    	            getter175=getter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_getter.add(getter175.getTree());

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:350:38: setter
                    	            {
                    	            pushFollow(FOLLOW_setter_in_fieldDef1857);
                    	            setter176=setter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_setter.add(setter176.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:350:46: ( SP_SEMI )?
                    	    int alt57=2;
                    	    int LA57_0 = input.LA(1);

                    	    if ( (LA57_0==SP_SEMI) ) {
                    	        alt57=1;
                    	    }
                    	    switch (alt57) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
                    	            {
                    	            SP_SEMI177=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_fieldDef1860); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_SP_SEMI.add(SP_SEMI177);


                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:350:55: ( block )?
                    	    int alt58=2;
                    	    int LA58_0 = input.LA(1);

                    	    if ( ((LA58_0>=KW_BREAK && LA58_0<=KW_TRY)||(LA58_0>=KW_THIS && LA58_0<=KW_SUPER)||(LA58_0>=KW_NULL && LA58_0<=KW_FALSE)||LA58_0==BRACKET_L||LA58_0==SP_PIPE||(LA58_0>=OP_PLUS && LA58_0<=OP_MULTI)||(LA58_0>=OP_CURRY && LA58_0<=OP_2MINUS)||(LA58_0>=URI && LA58_0<=AT)||(LA58_0>=NUMBER && LA58_0<=SQ_BRACKET_L)||LA58_0==PAR_L) ) {
                    	        alt58=1;
                    	    }
                    	    else if ( (LA58_0==ID) ) {
                    	        int LA58_2 = input.LA(2);

                    	        if ( (synpred79_Fan()) ) {
                    	            alt58=1;
                    	        }
                    	    }
                    	    switch (alt58) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: block
                    	            {
                    	            pushFollow(FOLLOW_block_in_fieldDef1863);
                    	            block178=block();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_block.add(block178.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);

                    pushFollow(FOLLOW_bracketR_in_fieldDef1868);
                    bracketR179=bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketR.add(bracketR179.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:351:7: eos
                    {
                    pushFollow(FOLLOW_eos_in_fieldDef1877);
                    eos180=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos180.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: expr, typeId, m
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
            // 352:4: -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:352:7: ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_FIELD, "AST_FIELD"), root_1);

                adaptor.addChild(root_1, stream_typeId.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:352:26: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:352:26: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:352:46: ( expr )?
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
            if ( state.backtracking>0 ) { memoize(input, 47, fieldDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldDef"

    public static class typeId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:353:1: typeId : ( ( type id )=> typeAndId | fieldId ) ;
    public final FanParser.typeId_return typeId() throws RecognitionException {
        FanParser.typeId_return retval = new FanParser.typeId_return();
        retval.start = input.LT(1);
        int typeId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeAndId_return typeAndId181 = null;

        FanParser.fieldId_return fieldId182 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:9: ( ( ( type id )=> typeAndId | fieldId ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:11: ( ( type id )=> typeAndId | fieldId )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:353:11: ( ( type id )=> typeAndId | fieldId )
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:353:12: ( type id )=> typeAndId
                    {
                    pushFollow(FOLLOW_typeAndId_in_typeId1915);
                    typeAndId181=typeAndId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeAndId181.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:353:35: fieldId
                    {
                    pushFollow(FOLLOW_fieldId_in_typeId1919);
                    fieldId182=fieldId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldId182.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 48, typeId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeId"

    public static class fieldId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:354:1: fieldId : id ;
    public final FanParser.fieldId_return fieldId() throws RecognitionException {
        FanParser.fieldId_return retval = new FanParser.fieldId_return();
        retval.start = input.LT(1);
        int fieldId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id183 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:10: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:12: id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_fieldId1928);
            id183=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id183.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 49, fieldId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldId"

    public static class typeAndId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeAndId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:355:1: typeAndId : ( type id ) ;
    public final FanParser.typeAndId_return typeAndId() throws RecognitionException {
        FanParser.typeAndId_return retval = new FanParser.typeAndId_return();
        retval.start = input.LT(1);
        int typeAndId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type184 = null;

        FanParser.id_return id185 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:11: ( ( type id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:13: ( type id )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:355:13: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:14: type id
            {
            pushFollow(FOLLOW_type_in_typeAndId1936);
            type184=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type184.getTree());
            pushFollow(FOLLOW_id_in_typeAndId1938);
            id185=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id185.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 50, typeAndId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeAndId"

    public static class fieldFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:356:1: fieldFlags : ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* ;
    public final FanParser.fieldFlags_return fieldFlags() throws RecognitionException {
        FanParser.fieldFlags_return retval = new FanParser.fieldFlags_return();
        retval.start = input.LT(1);
        int fieldFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ABSTRACT186=null;
        Token KW_RD_ONLY187=null;
        Token KW_CONST188=null;
        Token KW_STATIC189=null;
        Token KW_NATIVE190=null;
        Token KW_VOLATILE191=null;
        Token KW_OVERRIDE192=null;
        Token KW_VIRTUAL193=null;
        Token KW_FINAL194=null;
        FanParser.protection_return protection195 = null;


        Object KW_ABSTRACT186_tree=null;
        Object KW_RD_ONLY187_tree=null;
        Object KW_CONST188_tree=null;
        Object KW_STATIC189_tree=null;
        Object KW_NATIVE190_tree=null;
        Object KW_VOLATILE191_tree=null;
        Object KW_OVERRIDE192_tree=null;
        Object KW_VIRTUAL193_tree=null;
        Object KW_FINAL194_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:12: ( ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:356:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            loop62:
            do {
                int alt62=11;
                switch ( input.LA(1) ) {
                case KW_ABSTRACT:
                    {
                    alt62=1;
                    }
                    break;
                case KW_RD_ONLY:
                    {
                    alt62=2;
                    }
                    break;
                case KW_CONST:
                    {
                    alt62=3;
                    }
                    break;
                case KW_STATIC:
                    {
                    alt62=4;
                    }
                    break;
                case KW_NATIVE:
                    {
                    alt62=5;
                    }
                    break;
                case KW_VOLATILE:
                    {
                    alt62=6;
                    }
                    break;
                case KW_OVERRIDE:
                    {
                    alt62=7;
                    }
                    break;
                case KW_VIRTUAL:
                    {
                    alt62=8;
                    }
                    break;
                case KW_FINAL:
                    {
                    alt62=9;
                    }
                    break;
                case KW_PRIVATE:
                case KW_PROTECTED:
                case KW_PUBLIC:
                case KW_INTERNAL:
                    {
                    alt62=10;
                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:356:15: KW_ABSTRACT
            	    {
            	    KW_ABSTRACT186=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_fieldFlags1947); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_ABSTRACT186_tree = (Object)adaptor.create(KW_ABSTRACT186);
            	    adaptor.addChild(root_0, KW_ABSTRACT186_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:356:29: KW_RD_ONLY
            	    {
            	    KW_RD_ONLY187=(Token)match(input,KW_RD_ONLY,FOLLOW_KW_RD_ONLY_in_fieldFlags1951); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_RD_ONLY187_tree = (Object)adaptor.create(KW_RD_ONLY187);
            	    adaptor.addChild(root_0, KW_RD_ONLY187_tree);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:356:42: KW_CONST
            	    {
            	    KW_CONST188=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_fieldFlags1955); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_CONST188_tree = (Object)adaptor.create(KW_CONST188);
            	    adaptor.addChild(root_0, KW_CONST188_tree);
            	    }

            	    }
            	    break;
            	case 4 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:356:53: KW_STATIC
            	    {
            	    KW_STATIC189=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_fieldFlags1959); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_STATIC189_tree = (Object)adaptor.create(KW_STATIC189);
            	    adaptor.addChild(root_0, KW_STATIC189_tree);
            	    }

            	    }
            	    break;
            	case 5 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:356:65: KW_NATIVE
            	    {
            	    KW_NATIVE190=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_fieldFlags1963); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_NATIVE190_tree = (Object)adaptor.create(KW_NATIVE190);
            	    adaptor.addChild(root_0, KW_NATIVE190_tree);
            	    }

            	    }
            	    break;
            	case 6 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:356:77: KW_VOLATILE
            	    {
            	    KW_VOLATILE191=(Token)match(input,KW_VOLATILE,FOLLOW_KW_VOLATILE_in_fieldFlags1967); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VOLATILE191_tree = (Object)adaptor.create(KW_VOLATILE191);
            	    adaptor.addChild(root_0, KW_VOLATILE191_tree);
            	    }

            	    }
            	    break;
            	case 7 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:356:91: KW_OVERRIDE
            	    {
            	    KW_OVERRIDE192=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_fieldFlags1971); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_OVERRIDE192_tree = (Object)adaptor.create(KW_OVERRIDE192);
            	    adaptor.addChild(root_0, KW_OVERRIDE192_tree);
            	    }

            	    }
            	    break;
            	case 8 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:356:105: KW_VIRTUAL
            	    {
            	    KW_VIRTUAL193=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_fieldFlags1975); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VIRTUAL193_tree = (Object)adaptor.create(KW_VIRTUAL193);
            	    adaptor.addChild(root_0, KW_VIRTUAL193_tree);
            	    }

            	    }
            	    break;
            	case 9 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:356:118: KW_FINAL
            	    {
            	    KW_FINAL194=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_fieldFlags1979); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_FINAL194_tree = (Object)adaptor.create(KW_FINAL194);
            	    adaptor.addChild(root_0, KW_FINAL194_tree);
            	    }

            	    }
            	    break;
            	case 10 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:356:129: protection
            	    {
            	    pushFollow(FOLLOW_protection_in_fieldFlags1983);
            	    protection195=protection();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection195.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
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
            if ( state.backtracking>0 ) { memoize(input, 51, fieldFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldFlags"

    public static class methodDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:357:1: methodDef : docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody -> ^( AST_METHOD ^( $mname) $returnType ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? ) ;
    public final FanParser.methodDef_return methodDef() throws RecognitionException {
        FanParser.methodDef_return retval = new FanParser.methodDef_return();
        retval.start = input.LT(1);
        int methodDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.methodFlags_return m = null;

        FanParser.type_return returnType = null;

        FanParser.id_return mname = null;

        FanParser.docs_return docs196 = null;

        FanParser.facet_return facet197 = null;

        FanParser.parL_return parL198 = null;

        FanParser.params_return params199 = null;

        FanParser.parR_return parR200 = null;

        FanParser.methodBody_return methodBody201 = null;


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
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:358:3: ( docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody -> ^( AST_METHOD ^( $mname) $returnType ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:358:5: docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody
            {
            pushFollow(FOLLOW_docs_in_methodDef2003);
            docs196=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs196.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:358:10: ( facet )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==AT) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_methodDef2005);
            	    facet197=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet197.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:358:18: (m= methodFlags )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=KW_STATIC && LA64_0<=KW_NATIVE)||(LA64_0>=KW_OVERRIDE && LA64_0<=KW_FINAL)||(LA64_0>=KW_ABSTRACT && LA64_0<=KW_INTERNAL)||LA64_0==KW_ONCE) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= methodFlags
            	    {
            	    pushFollow(FOLLOW_methodFlags_in_methodDef2010);
            	    m=methodFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_methodFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            pushFollow(FOLLOW_type_in_methodDef2015);
            returnType=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(returnType.getTree());
            pushFollow(FOLLOW_id_in_methodDef2021);
            mname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(mname.getTree());
            pushFollow(FOLLOW_parL_in_methodDef2023);
            parL198=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL198.getTree());
            pushFollow(FOLLOW_params_in_methodDef2025);
            params199=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_params.add(params199.getTree());
            pushFollow(FOLLOW_parR_in_methodDef2027);
            parR200=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR200.getTree());
            pushFollow(FOLLOW_methodBody_in_methodDef2029);
            methodBody201=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodBody.add(methodBody201.getTree());


            // AST REWRITE
            // elements: m, methodBody, mname, params, returnType
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
            // 359:7: -> ^( AST_METHOD ^( $mname) $returnType ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:359:10: ^( AST_METHOD ^( $mname) $returnType ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_METHOD, "AST_METHOD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:359:23: ^( $mname)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_mname.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_returnType.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:359:45: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:359:53: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:359:53: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:359:73: ( methodBody )?
                if ( stream_methodBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_methodBody.nextTree());

                }
                stream_methodBody.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 52, methodDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodDef"

    public static class methodFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:360:1: methodFlags : ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL );
    public final FanParser.methodFlags_return methodFlags() throws RecognitionException {
        FanParser.methodFlags_return retval = new FanParser.methodFlags_return();
        retval.start = input.LT(1);
        int methodFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_VIRTUAL203=null;
        Token KW_OVERRIDE204=null;
        Token KW_ABSTRACT205=null;
        Token KW_STATIC206=null;
        Token KW_ONCE207=null;
        Token KW_NATIVE208=null;
        Token KW_FINAL209=null;
        FanParser.protection_return protection202 = null;


        Object KW_VIRTUAL203_tree=null;
        Object KW_OVERRIDE204_tree=null;
        Object KW_ABSTRACT205_tree=null;
        Object KW_STATIC206_tree=null;
        Object KW_ONCE207_tree=null;
        Object KW_NATIVE208_tree=null;
        Object KW_FINAL209_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:360:13: ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL )
            int alt65=8;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt65=1;
                }
                break;
            case KW_VIRTUAL:
                {
                alt65=2;
                }
                break;
            case KW_OVERRIDE:
                {
                alt65=3;
                }
                break;
            case KW_ABSTRACT:
                {
                alt65=4;
                }
                break;
            case KW_STATIC:
                {
                alt65=5;
                }
                break;
            case KW_ONCE:
                {
                alt65=6;
                }
                break;
            case KW_NATIVE:
                {
                alt65=7;
                }
                break;
            case KW_FINAL:
                {
                alt65=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:15: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_methodFlags2071);
                    protection202=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection202.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:28: KW_VIRTUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_VIRTUAL203=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_methodFlags2075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_VIRTUAL203_tree = (Object)adaptor.create(KW_VIRTUAL203);
                    adaptor.addChild(root_0, KW_VIRTUAL203_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:41: KW_OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_OVERRIDE204=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_methodFlags2079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_OVERRIDE204_tree = (Object)adaptor.create(KW_OVERRIDE204);
                    adaptor.addChild(root_0, KW_OVERRIDE204_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:55: KW_ABSTRACT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ABSTRACT205=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_methodFlags2083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ABSTRACT205_tree = (Object)adaptor.create(KW_ABSTRACT205);
                    adaptor.addChild(root_0, KW_ABSTRACT205_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:69: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC206=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_methodFlags2087); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC206_tree = (Object)adaptor.create(KW_STATIC206);
                    adaptor.addChild(root_0, KW_STATIC206_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:81: KW_ONCE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ONCE207=(Token)match(input,KW_ONCE,FOLLOW_KW_ONCE_in_methodFlags2091); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ONCE207_tree = (Object)adaptor.create(KW_ONCE207);
                    adaptor.addChild(root_0, KW_ONCE207_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:361:5: KW_NATIVE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NATIVE208=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_methodFlags2099); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NATIVE208_tree = (Object)adaptor.create(KW_NATIVE208);
                    adaptor.addChild(root_0, KW_NATIVE208_tree);
                    }

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:361:17: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL209=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_methodFlags2103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL209_tree = (Object)adaptor.create(KW_FINAL209);
                    adaptor.addChild(root_0, KW_FINAL209_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 53, methodFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodFlags"

    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "params"
    // src/net/colar/netbeans/fan/antlr/Fan.g:362:1: params : ( param ( SP_COMMA param )* )? ;
    public final FanParser.params_return params() throws RecognitionException {
        FanParser.params_return retval = new FanParser.params_return();
        retval.start = input.LT(1);
        int params_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA211=null;
        FanParser.param_return param210 = null;

        FanParser.param_return param212 = null;


        Object SP_COMMA211_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:362:9: ( ( param ( SP_COMMA param )* )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:362:11: ( param ( SP_COMMA param )* )?
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:362:11: ( param ( SP_COMMA param )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==SP_PIPE||LA67_0==ID||LA67_0==SQ_BRACKET_L) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:362:12: param ( SP_COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_params2112);
                    param210=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, param210.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:362:18: ( SP_COMMA param )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==SP_COMMA) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:362:19: SP_COMMA param
                    	    {
                    	    SP_COMMA211=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_params2115); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA211_tree = (Object)adaptor.create(SP_COMMA211);
                    	    adaptor.addChild(root_0, SP_COMMA211_tree);
                    	    }
                    	    pushFollow(FOLLOW_param_in_params2117);
                    	    param212=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, param212.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
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
            if ( state.backtracking>0 ) { memoize(input, 54, params_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "params"

    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // src/net/colar/netbeans/fan/antlr/Fan.g:363:1: param : ( type id ( AS_INIT_VAL expr )? ) -> ^( AST_PARAM type id ( AS_INIT_VAL expr )? ) ;
    public final FanParser.param_return param() throws RecognitionException {
        FanParser.param_return retval = new FanParser.param_return();
        retval.start = input.LT(1);
        int param_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL215=null;
        FanParser.type_return type213 = null;

        FanParser.id_return id214 = null;

        FanParser.expr_return expr216 = null;


        Object AS_INIT_VAL215_tree=null;
        RewriteRuleTokenStream stream_AS_INIT_VAL=new RewriteRuleTokenStream(adaptor,"token AS_INIT_VAL");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:9: ( ( type id ( AS_INIT_VAL expr )? ) -> ^( AST_PARAM type id ( AS_INIT_VAL expr )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:11: ( type id ( AS_INIT_VAL expr )? )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:11: ( type id ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:12: type id ( AS_INIT_VAL expr )?
            {
            pushFollow(FOLLOW_type_in_param2131);
            type213=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type213.getTree());
            pushFollow(FOLLOW_id_in_param2133);
            id214=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id214.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:20: ( AS_INIT_VAL expr )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==AS_INIT_VAL) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:363:21: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL215=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_param2136); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL215);

                    pushFollow(FOLLOW_expr_in_param2138);
                    expr216=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr216.getTree());

                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: type, id, AS_INIT_VAL, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 364:4: -> ^( AST_PARAM type id ( AS_INIT_VAL expr )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:364:7: ^( AST_PARAM type id ( AS_INIT_VAL expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_PARAM, "AST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_id.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:364:27: ( AS_INIT_VAL expr )?
                if ( stream_AS_INIT_VAL.hasNext()||stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_AS_INIT_VAL.nextNode());
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_AS_INIT_VAL.reset();
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
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, param_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "param"

    public static class methodBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:365:1: methodBody : ( ( multiStmt )=> multiStmt | eos ) ;
    public final FanParser.methodBody_return methodBody() throws RecognitionException {
        FanParser.methodBody_return retval = new FanParser.methodBody_return();
        retval.start = input.LT(1);
        int methodBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt217 = null;

        FanParser.eos_return eos218 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:365:12: ( ( ( multiStmt )=> multiStmt | eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:365:14: ( ( multiStmt )=> multiStmt | eos )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:365:14: ( ( multiStmt )=> multiStmt | eos )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==BRACKET_L) && (synpred105_Fan())) {
                alt69=1;
            }
            else if ( (LA69_0==EOF||(LA69_0>=KW_RD_ONLY && LA69_0<=KW_FINAL)||(LA69_0>=KW_ABSTRACT && LA69_0<=KW_ONCE)||LA69_0==BRACKET_R||LA69_0==SP_PIPE||LA69_0==SP_SEMI||LA69_0==ID||(LA69_0>=AT && LA69_0<=DOC)||LA69_0==SQ_BRACKET_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:365:15: ( multiStmt )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_methodBody2173);
                    multiStmt217=multiStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt217.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:365:40: eos
                    {
                    pushFollow(FOLLOW_eos_in_methodBody2177);
                    eos218=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos218.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 56, methodBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodBody"

    public static class ctorDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:366:1: ctorDef : docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody -> ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? ) ;
    public final FanParser.ctorDef_return ctorDef() throws RecognitionException {
        FanParser.ctorDef_return retval = new FanParser.ctorDef_return();
        retval.start = input.LT(1);
        int ctorDef_StartIndex = input.index();
        Object root_0 = null;

        Token cchain=null;
        Token KW_NEW221=null;
        FanParser.ctorFlags_return m = null;

        FanParser.id_return cname = null;

        FanParser.docs_return docs219 = null;

        FanParser.facet_return facet220 = null;

        FanParser.parL_return parL222 = null;

        FanParser.params_return params223 = null;

        FanParser.parR_return parR224 = null;

        FanParser.ctorChain_return ctorChain225 = null;

        FanParser.methodBody_return methodBody226 = null;


        Object cchain_tree=null;
        Object KW_NEW221_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:367:3: ( docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody -> ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:367:5: docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody
            {
            pushFollow(FOLLOW_docs_in_ctorDef2197);
            docs219=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs219.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:367:10: ( facet )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==AT) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_ctorDef2199);
            	    facet220=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet220.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:367:18: (m= ctorFlags )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=KW_PRIVATE && LA71_0<=KW_INTERNAL)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= ctorFlags
            	    {
            	    pushFollow(FOLLOW_ctorFlags_in_ctorDef2204);
            	    m=ctorFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ctorFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            KW_NEW221=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_ctorDef2207); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_NEW.add(KW_NEW221);

            pushFollow(FOLLOW_id_in_ctorDef2211);
            cname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(cname.getTree());
            pushFollow(FOLLOW_parL_in_ctorDef2213);
            parL222=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL222.getTree());
            pushFollow(FOLLOW_params_in_ctorDef2215);
            params223=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_params.add(params223.getTree());
            pushFollow(FOLLOW_parR_in_ctorDef2217);
            parR224=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR224.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:367:69: (cchain= ( ( SP_COLON )=> ctorChain ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==SP_COLON) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: cchain= ( ( SP_COLON )=> ctorChain )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:367:70: ( ( SP_COLON )=> ctorChain )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:367:71: ( SP_COLON )=> ctorChain
                    {
                    pushFollow(FOLLOW_ctorChain_in_ctorDef2226);
                    ctorChain225=ctorChain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ctorChain.add(ctorChain225.getTree());

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_ctorDef2230);
            methodBody226=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodBody.add(methodBody226.getTree());


            // AST REWRITE
            // elements: methodBody, m, cchain, cname, params
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
            // 368:7: -> ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:368:10: ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CONSTRUCTOR, "AST_CONSTRUCTOR"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:368:28: ^( $cname)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_cname.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:368:38: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:368:46: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:368:46: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:368:66: ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )*
                while ( stream_cchain.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:368:66: ^( AST_CONSTRUCTOR_CHAIN $cchain)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CONSTRUCTOR_CHAIN, "AST_CONSTRUCTOR_CHAIN"), root_2);

                    adaptor.addChild(root_2, stream_cchain.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_cchain.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:368:100: ( methodBody )?
                if ( stream_methodBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_methodBody.nextTree());

                }
                stream_methodBody.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 57, ctorDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorDef"

    public static class ctorFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:369:1: ctorFlags : protection ;
    public final FanParser.ctorFlags_return ctorFlags() throws RecognitionException {
        FanParser.ctorFlags_return retval = new FanParser.ctorFlags_return();
        retval.start = input.LT(1);
        int ctorFlags_StartIndex = input.index();
        Object root_0 = null;

        FanParser.protection_return protection227 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:11: ( protection )
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:13: protection
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_protection_in_ctorFlags2277);
            protection227=protection();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protection227.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 58, ctorFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorFlags"

    public static class ctorChain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:370:1: ctorChain : SP_COLON ( ctorChainThis | ctorChainSuper ) ;
    public final FanParser.ctorChain_return ctorChain() throws RecognitionException {
        FanParser.ctorChain_return retval = new FanParser.ctorChain_return();
        retval.start = input.LT(1);
        int ctorChain_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON228=null;
        FanParser.ctorChainThis_return ctorChainThis229 = null;

        FanParser.ctorChainSuper_return ctorChainSuper230 = null;


        Object SP_COLON228_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:370:11: ( SP_COLON ( ctorChainThis | ctorChainSuper ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:370:13: SP_COLON ( ctorChainThis | ctorChainSuper )
            {
            root_0 = (Object)adaptor.nil();

            SP_COLON228=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ctorChain2284); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON228_tree = (Object)adaptor.create(SP_COLON228);
            adaptor.addChild(root_0, SP_COLON228_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:370:22: ( ctorChainThis | ctorChainSuper )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==KW_THIS) ) {
                alt73=1;
            }
            else if ( (LA73_0==KW_SUPER) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:370:23: ctorChainThis
                    {
                    pushFollow(FOLLOW_ctorChainThis_in_ctorChain2287);
                    ctorChainThis229=ctorChainThis();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainThis229.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:370:39: ctorChainSuper
                    {
                    pushFollow(FOLLOW_ctorChainSuper_in_ctorChain2291);
                    ctorChainSuper230=ctorChainSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainSuper230.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 59, ctorChain_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChain"

    public static class ctorChainThis_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChainThis"
    // src/net/colar/netbeans/fan/antlr/Fan.g:372:1: ctorChainThis : KW_THIS DOT id parL ( args )? parR ;
    public final FanParser.ctorChainThis_return ctorChainThis() throws RecognitionException {
        FanParser.ctorChainThis_return retval = new FanParser.ctorChainThis_return();
        retval.start = input.LT(1);
        int ctorChainThis_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THIS231=null;
        Token DOT232=null;
        FanParser.id_return id233 = null;

        FanParser.parL_return parL234 = null;

        FanParser.args_return args235 = null;

        FanParser.parR_return parR236 = null;


        Object KW_THIS231_tree=null;
        Object DOT232_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:15: ( KW_THIS DOT id parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:17: KW_THIS DOT id parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_THIS231=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_ctorChainThis2300); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THIS231_tree = (Object)adaptor.create(KW_THIS231);
            adaptor.addChild(root_0, KW_THIS231_tree);
            }
            DOT232=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainThis2302); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT232_tree = (Object)adaptor.create(DOT232);
            adaptor.addChild(root_0, DOT232_tree);
            }
            pushFollow(FOLLOW_id_in_ctorChainThis2304);
            id233=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id233.getTree());
            pushFollow(FOLLOW_parL_in_ctorChainThis2306);
            parL234=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL234.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:37: ( args )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=KW_THIS && LA74_0<=KW_SUPER)||(LA74_0>=KW_NULL && LA74_0<=KW_FALSE)||LA74_0==SP_PIPE||(LA74_0>=OP_PLUS && LA74_0<=OP_MULTI)||(LA74_0>=OP_CURRY && LA74_0<=OP_2MINUS)||(LA74_0>=ID && LA74_0<=AT)||(LA74_0>=NUMBER && LA74_0<=SQ_BRACKET_L)||LA74_0==PAR_L) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainThis2308);
                    args235=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args235.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainThis2311);
            parR236=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR236.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 60, ctorChainThis_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChainThis"

    public static class ctorChainSuper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChainSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:373:1: ctorChainSuper : KW_SUPER ( DOT id )? parL ( args )? parR ;
    public final FanParser.ctorChainSuper_return ctorChainSuper() throws RecognitionException {
        FanParser.ctorChainSuper_return retval = new FanParser.ctorChainSuper_return();
        retval.start = input.LT(1);
        int ctorChainSuper_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SUPER237=null;
        Token DOT238=null;
        FanParser.id_return id239 = null;

        FanParser.parL_return parL240 = null;

        FanParser.args_return args241 = null;

        FanParser.parR_return parR242 = null;


        Object KW_SUPER237_tree=null;
        Object DOT238_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:16: ( KW_SUPER ( DOT id )? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:18: KW_SUPER ( DOT id )? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_SUPER237=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_ctorChainSuper2318); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SUPER237_tree = (Object)adaptor.create(KW_SUPER237);
            adaptor.addChild(root_0, KW_SUPER237_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:27: ( DOT id )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==DOT) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:373:28: DOT id
                    {
                    DOT238=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainSuper2321); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT238_tree = (Object)adaptor.create(DOT238);
                    adaptor.addChild(root_0, DOT238_tree);
                    }
                    pushFollow(FOLLOW_id_in_ctorChainSuper2323);
                    id239=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id239.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parL_in_ctorChainSuper2327);
            parL240=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL240.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:42: ( args )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=KW_THIS && LA76_0<=KW_SUPER)||(LA76_0>=KW_NULL && LA76_0<=KW_FALSE)||LA76_0==SP_PIPE||(LA76_0>=OP_PLUS && LA76_0<=OP_MULTI)||(LA76_0>=OP_CURRY && LA76_0<=OP_2MINUS)||(LA76_0>=ID && LA76_0<=AT)||(LA76_0>=NUMBER && LA76_0<=SQ_BRACKET_L)||LA76_0==PAR_L) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainSuper2329);
                    args241=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args241.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainSuper2332);
            parR242=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR242.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 61, ctorChainSuper_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChainSuper"

    public static class staticBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:375:1: staticBlock : KW_STATIC block ;
    public final FanParser.staticBlock_return staticBlock() throws RecognitionException {
        FanParser.staticBlock_return retval = new FanParser.staticBlock_return();
        retval.start = input.LT(1);
        int staticBlock_StartIndex = input.index();
        Object root_0 = null;

        Token KW_STATIC243=null;
        FanParser.block_return block244 = null;


        Object KW_STATIC243_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:375:13: ( KW_STATIC block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:375:15: KW_STATIC block
            {
            root_0 = (Object)adaptor.nil();

            KW_STATIC243=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_staticBlock2340); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_STATIC243_tree = (Object)adaptor.create(KW_STATIC243);
            adaptor.addChild(root_0, KW_STATIC243_tree);
            }
            pushFollow(FOLLOW_block_in_staticBlock2342);
            block244=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block244.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 62, staticBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticBlock"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // src/net/colar/netbeans/fan/antlr/Fan.g:376:1: block : ( ( bracketL )=> multiStmt | stmt ) ;
    public final FanParser.block_return block() throws RecognitionException {
        FanParser.block_return retval = new FanParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt245 = null;

        FanParser.stmt_return stmt246 = null;



        paraphrase.push("Block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:3: ( ( ( bracketL )=> multiStmt | stmt ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:5: ( ( bracketL )=> multiStmt | stmt )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:377:5: ( ( bracketL )=> multiStmt | stmt )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==BRACKET_L) && (synpred114_Fan())) {
                alt77=1;
            }
            else if ( ((LA77_0>=KW_BREAK && LA77_0<=KW_TRY)||(LA77_0>=KW_THIS && LA77_0<=KW_SUPER)||(LA77_0>=KW_NULL && LA77_0<=KW_FALSE)||LA77_0==SP_PIPE||(LA77_0>=OP_PLUS && LA77_0<=OP_MULTI)||(LA77_0>=OP_CURRY && LA77_0<=OP_2MINUS)||(LA77_0>=ID && LA77_0<=AT)||(LA77_0>=NUMBER && LA77_0<=SQ_BRACKET_L)||LA77_0==PAR_L) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:377:6: ( bracketL )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_block2367);
                    multiStmt245=multiStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt245.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:377:30: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_block2371);
                    stmt246=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt246.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 63, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class multiStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:378:1: multiStmt : bracketL ( stmt )* bracketR -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR ) ;
    public final FanParser.multiStmt_return multiStmt() throws RecognitionException {
        FanParser.multiStmt_return retval = new FanParser.multiStmt_return();
        retval.start = input.LT(1);
        int multiStmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL247 = null;

        FanParser.stmt_return stmt248 = null;

        FanParser.bracketR_return bracketR249 = null;


        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:11: ( bracketL ( stmt )* bracketR -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:13: bracketL ( stmt )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_multiStmt2379);
            bracketL247=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL247.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:22: ( stmt )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=KW_BREAK && LA78_0<=KW_TRY)||(LA78_0>=KW_THIS && LA78_0<=KW_SUPER)||(LA78_0>=KW_NULL && LA78_0<=KW_FALSE)||LA78_0==SP_PIPE||(LA78_0>=OP_PLUS && LA78_0<=OP_MULTI)||(LA78_0>=OP_CURRY && LA78_0<=OP_2MINUS)||(LA78_0>=ID && LA78_0<=AT)||(LA78_0>=NUMBER && LA78_0<=SQ_BRACKET_L)||LA78_0==PAR_L) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_multiStmt2381);
            	    stmt248=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt248.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_multiStmt2384);
            bracketR249=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR249.getTree());


            // AST REWRITE
            // elements: stmt, bracketL, bracketR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 378:37: -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:378:40: ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:378:66: ( ( stmt )* )?
                if ( stream_stmt.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:378:67: ( stmt )*
                    while ( stream_stmt.hasNext() ) {
                        adaptor.addChild(root_1, stream_stmt.nextTree());

                    }
                    stream_stmt.reset();

                }
                stream_stmt.reset();
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
            if ( state.backtracking>0 ) { memoize(input, 64, multiStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiStmt"

    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:379:1: stmt : ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) ;
    public final FanParser.stmt_return stmt() throws RecognitionException {
        FanParser.stmt_return retval = new FanParser.stmt_return();
        retval.start = input.LT(1);
        int stmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.g_if_return g_if250 = null;

        FanParser.g_for_return g_for251 = null;

        FanParser.g_while_return g_while252 = null;

        FanParser.g_break_return g_break253 = null;

        FanParser.g_continue_return g_continue254 = null;

        FanParser.g_return_return g_return255 = null;

        FanParser.g_switch_return g_switch256 = null;

        FanParser.g_throw_return g_throw257 = null;

        FanParser.g_try_return g_try258 = null;

        FanParser.exprStmt_return exprStmt259 = null;

        FanParser.localDef_return localDef260 = null;



        paraphrase.push("Statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:3: ( ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:381:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            int alt79=11;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:6: g_if
                    {
                    pushFollow(FOLLOW_g_if_in_stmt2419);
                    g_if250=g_if();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_if250.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:13: g_for
                    {
                    pushFollow(FOLLOW_g_for_in_stmt2423);
                    g_for251=g_for();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_for251.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:21: g_while
                    {
                    pushFollow(FOLLOW_g_while_in_stmt2427);
                    g_while252=g_while();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_while252.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:31: g_break
                    {
                    pushFollow(FOLLOW_g_break_in_stmt2431);
                    g_break253=g_break();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_break253.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:382:4: g_continue
                    {
                    pushFollow(FOLLOW_g_continue_in_stmt2438);
                    g_continue254=g_continue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_continue254.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:382:17: g_return
                    {
                    pushFollow(FOLLOW_g_return_in_stmt2442);
                    g_return255=g_return();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_return255.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:382:28: g_switch
                    {
                    pushFollow(FOLLOW_g_switch_in_stmt2446);
                    g_switch256=g_switch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_switch256.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:383:4: g_throw
                    {
                    pushFollow(FOLLOW_g_throw_in_stmt2453);
                    g_throw257=g_throw();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_throw257.getTree());

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:383:14: g_try
                    {
                    pushFollow(FOLLOW_g_try_in_stmt2457);
                    g_try258=g_try();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_try258.getTree());

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:383:22: exprStmt
                    {
                    pushFollow(FOLLOW_exprStmt_in_stmt2461);
                    exprStmt259=exprStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprStmt259.getTree());

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:383:33: localDef
                    {
                    pushFollow(FOLLOW_localDef_in_stmt2465);
                    localDef260=localDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localDef260.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 65, stmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmt"

    public static class stmtList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtList"
    // src/net/colar/netbeans/fan/antlr/Fan.g:385:1: stmtList : s= ( ( stmt )* ) -> ^( AST_CODE_BLOCK ( $s)? ) ;
    public final FanParser.stmtList_return stmtList() throws RecognitionException {
        FanParser.stmtList_return retval = new FanParser.stmtList_return();
        retval.start = input.LT(1);
        int stmtList_StartIndex = input.index();
        Object root_0 = null;

        Token s=null;
        FanParser.stmt_return stmt261 = null;


        Object s_tree=null;
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:10: (s= ( ( stmt )* ) -> ^( AST_CODE_BLOCK ( $s)? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:12: s= ( ( stmt )* )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:14: ( ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:15: ( stmt )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:15: ( stmt )*
            loop80:
            do {
                int alt80=2;
                alt80 = dfa80.predict(input);
                switch (alt80) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmtList2478);
            	    stmt261=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt261.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
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
            // 385:22: -> ^( AST_CODE_BLOCK ( $s)? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:385:25: ^( AST_CODE_BLOCK ( $s)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:385:42: ( $s)?
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
            if ( state.backtracking>0 ) { memoize(input, 66, stmtList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtList"

    public static class g_break_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_break"
    // src/net/colar/netbeans/fan/antlr/Fan.g:391:1: g_break : KW_BREAK eos ;
    public final FanParser.g_break_return g_break() throws RecognitionException {
        FanParser.g_break_return retval = new FanParser.g_break_return();
        retval.start = input.LT(1);
        int g_break_StartIndex = input.index();
        Object root_0 = null;

        Token KW_BREAK262=null;
        FanParser.eos_return eos263 = null;


        Object KW_BREAK262_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:10: ( KW_BREAK eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:12: KW_BREAK eos
            {
            root_0 = (Object)adaptor.nil();

            KW_BREAK262=(Token)match(input,KW_BREAK,FOLLOW_KW_BREAK_in_g_break2500); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_BREAK262_tree = (Object)adaptor.create(KW_BREAK262);
            adaptor.addChild(root_0, KW_BREAK262_tree);
            }
            pushFollow(FOLLOW_eos_in_g_break2502);
            eos263=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos263.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 67, g_break_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_break"

    public static class g_continue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_continue"
    // src/net/colar/netbeans/fan/antlr/Fan.g:392:1: g_continue : KW_CONTINUE eos ;
    public final FanParser.g_continue_return g_continue() throws RecognitionException {
        FanParser.g_continue_return retval = new FanParser.g_continue_return();
        retval.start = input.LT(1);
        int g_continue_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CONTINUE264=null;
        FanParser.eos_return eos265 = null;


        Object KW_CONTINUE264_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:12: ( KW_CONTINUE eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:14: KW_CONTINUE eos
            {
            root_0 = (Object)adaptor.nil();

            KW_CONTINUE264=(Token)match(input,KW_CONTINUE,FOLLOW_KW_CONTINUE_in_g_continue2509); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CONTINUE264_tree = (Object)adaptor.create(KW_CONTINUE264);
            adaptor.addChild(root_0, KW_CONTINUE264_tree);
            }
            pushFollow(FOLLOW_eos_in_g_continue2511);
            eos265=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos265.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 68, g_continue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_continue"

    public static class g_for_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_for"
    // src/net/colar/netbeans/fan/antlr/Fan.g:393:1: g_for : ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ) -> ^( AST_SCOPE KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ) ;
    public final FanParser.g_for_return g_for() throws RecognitionException {
        FanParser.g_for_return retval = new FanParser.g_for_return();
        retval.start = input.LT(1);
        int g_for_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FOR266=null;
        Token SP_SEMI269=null;
        Token SP_SEMI271=null;
        FanParser.parL_return parL267 = null;

        FanParser.forInit_return forInit268 = null;

        FanParser.expr_return expr270 = null;

        FanParser.expr_return expr272 = null;

        FanParser.parR_return parR273 = null;

        FanParser.block_return block274 = null;


        Object KW_FOR266_tree=null;
        Object SP_SEMI269_tree=null;
        Object SP_SEMI271_tree=null;
        RewriteRuleTokenStream stream_SP_SEMI=new RewriteRuleTokenStream(adaptor,"token SP_SEMI");
        RewriteRuleTokenStream stream_KW_FOR=new RewriteRuleTokenStream(adaptor,"token KW_FOR");
        RewriteRuleSubtreeStream stream_parL=new RewriteRuleSubtreeStream(adaptor,"rule parL");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
        RewriteRuleSubtreeStream stream_parR=new RewriteRuleSubtreeStream(adaptor,"rule parR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:8: ( ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ) -> ^( AST_SCOPE KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:10: ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:10: ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:11: KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block
            {
            KW_FOR266=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_g_for2520); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR266);

            pushFollow(FOLLOW_parL_in_g_for2522);
            parL267=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL267.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:23: ( forInit )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=KW_THIS && LA81_0<=KW_SUPER)||(LA81_0>=KW_NULL && LA81_0<=KW_FALSE)||LA81_0==SP_PIPE||(LA81_0>=OP_PLUS && LA81_0<=OP_MULTI)||(LA81_0>=OP_CURRY && LA81_0<=OP_2MINUS)||(LA81_0>=ID && LA81_0<=AT)||(LA81_0>=NUMBER && LA81_0<=SQ_BRACKET_L)||LA81_0==PAR_L) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_g_for2524);
                    forInit268=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forInit.add(forInit268.getTree());

                    }
                    break;

            }

            SP_SEMI269=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for2527); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_SEMI.add(SP_SEMI269);

            // src/net/colar/netbeans/fan/antlr/Fan.g:393:40: ( expr )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=KW_THIS && LA82_0<=KW_SUPER)||(LA82_0>=KW_NULL && LA82_0<=KW_FALSE)||LA82_0==SP_PIPE||(LA82_0>=OP_PLUS && LA82_0<=OP_MULTI)||(LA82_0>=OP_CURRY && LA82_0<=OP_2MINUS)||(LA82_0>=ID && LA82_0<=AT)||(LA82_0>=NUMBER && LA82_0<=SQ_BRACKET_L)||LA82_0==PAR_L) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for2529);
                    expr270=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr270.getTree());

                    }
                    break;

            }

            SP_SEMI271=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for2532); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_SEMI.add(SP_SEMI271);

            // src/net/colar/netbeans/fan/antlr/Fan.g:393:54: ( expr )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=KW_THIS && LA83_0<=KW_SUPER)||(LA83_0>=KW_NULL && LA83_0<=KW_FALSE)||LA83_0==SP_PIPE||(LA83_0>=OP_PLUS && LA83_0<=OP_MULTI)||(LA83_0>=OP_CURRY && LA83_0<=OP_2MINUS)||(LA83_0>=ID && LA83_0<=AT)||(LA83_0>=NUMBER && LA83_0<=SQ_BRACKET_L)||LA83_0==PAR_L) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for2534);
                    expr272=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr272.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_g_for2537);
            parR273=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR273.getTree());
            pushFollow(FOLLOW_block_in_g_for2540);
            block274=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block274.getTree());

            }



            // AST REWRITE
            // elements: expr, expr, forInit, parR, block, SP_SEMI, KW_FOR, SP_SEMI, parL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 394:5: -> ^( AST_SCOPE KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:394:8: ^( AST_SCOPE KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SCOPE, "AST_SCOPE"), root_1);

                adaptor.addChild(root_1, stream_KW_FOR.nextNode());
                adaptor.addChild(root_1, stream_parL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:394:32: ( forInit )?
                if ( stream_forInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_forInit.nextTree());

                }
                stream_forInit.reset();
                adaptor.addChild(root_1, stream_SP_SEMI.nextNode());
                // src/net/colar/netbeans/fan/antlr/Fan.g:394:49: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                adaptor.addChild(root_1, stream_SP_SEMI.nextNode());
                // src/net/colar/netbeans/fan/antlr/Fan.g:394:63: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                adaptor.addChild(root_1, stream_parR.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 69, g_for_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_for"

    public static class g_if_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_if"
    // src/net/colar/netbeans/fan/antlr/Fan.g:395:1: g_if : KW_IF parL expr parR block ( KW_ELSE block )? ;
    public final FanParser.g_if_return g_if() throws RecognitionException {
        FanParser.g_if_return retval = new FanParser.g_if_return();
        retval.start = input.LT(1);
        int g_if_StartIndex = input.index();
        Object root_0 = null;

        Token KW_IF275=null;
        Token KW_ELSE280=null;
        FanParser.parL_return parL276 = null;

        FanParser.expr_return expr277 = null;

        FanParser.parR_return parR278 = null;

        FanParser.block_return block279 = null;

        FanParser.block_return block281 = null;


        Object KW_IF275_tree=null;
        Object KW_ELSE280_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:7: ( KW_IF parL expr parR block ( KW_ELSE block )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:9: KW_IF parL expr parR block ( KW_ELSE block )?
            {
            root_0 = (Object)adaptor.nil();

            KW_IF275=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_g_if2581); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_IF275_tree = (Object)adaptor.create(KW_IF275);
            adaptor.addChild(root_0, KW_IF275_tree);
            }
            pushFollow(FOLLOW_parL_in_g_if2583);
            parL276=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL276.getTree());
            pushFollow(FOLLOW_expr_in_g_if2585);
            expr277=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr277.getTree());
            pushFollow(FOLLOW_parR_in_g_if2587);
            parR278=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR278.getTree());
            pushFollow(FOLLOW_block_in_g_if2589);
            block279=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block279.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:5: ( KW_ELSE block )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==KW_ELSE) ) {
                int LA84_1 = input.LA(2);

                if ( (synpred130_Fan()) ) {
                    alt84=1;
                }
            }
            switch (alt84) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:396:6: KW_ELSE block
                    {
                    KW_ELSE280=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_g_if2596); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ELSE280_tree = (Object)adaptor.create(KW_ELSE280);
                    adaptor.addChild(root_0, KW_ELSE280_tree);
                    }
                    pushFollow(FOLLOW_block_in_g_if2598);
                    block281=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block281.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 70, g_if_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_if"

    public static class g_return_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_return"
    // src/net/colar/netbeans/fan/antlr/Fan.g:397:1: g_return : KW_RETURN ( eos | expr eos ) ;
    public final FanParser.g_return_return g_return() throws RecognitionException {
        FanParser.g_return_return retval = new FanParser.g_return_return();
        retval.start = input.LT(1);
        int g_return_StartIndex = input.index();
        Object root_0 = null;

        Token KW_RETURN282=null;
        FanParser.eos_return eos283 = null;

        FanParser.expr_return expr284 = null;

        FanParser.eos_return eos285 = null;


        Object KW_RETURN282_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:397:10: ( KW_RETURN ( eos | expr eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:397:12: KW_RETURN ( eos | expr eos )
            {
            root_0 = (Object)adaptor.nil();

            KW_RETURN282=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_g_return2607); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_RETURN282_tree = (Object)adaptor.create(KW_RETURN282);
            adaptor.addChild(root_0, KW_RETURN282_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:397:22: ( eos | expr eos )
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:397:23: eos
                    {
                    pushFollow(FOLLOW_eos_in_g_return2610);
                    eos283=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos283.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:397:29: expr eos
                    {
                    pushFollow(FOLLOW_expr_in_g_return2614);
                    expr284=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr284.getTree());
                    pushFollow(FOLLOW_eos_in_g_return2616);
                    eos285=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos285.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 71, g_return_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_return"

    public static class g_switch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_switch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:398:1: g_switch : KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR ;
    public final FanParser.g_switch_return g_switch() throws RecognitionException {
        FanParser.g_switch_return retval = new FanParser.g_switch_return();
        retval.start = input.LT(1);
        int g_switch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SWITCH286=null;
        FanParser.parL_return parL287 = null;

        FanParser.expr_return expr288 = null;

        FanParser.parR_return parR289 = null;

        FanParser.bracketL_return bracketL290 = null;

        FanParser.g_case_return g_case291 = null;

        FanParser.g_default_return g_default292 = null;

        FanParser.bracketR_return bracketR293 = null;


        Object KW_SWITCH286_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:10: ( KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:12: KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR
            {
            root_0 = (Object)adaptor.nil();

            KW_SWITCH286=(Token)match(input,KW_SWITCH,FOLLOW_KW_SWITCH_in_g_switch2624); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SWITCH286_tree = (Object)adaptor.create(KW_SWITCH286);
            adaptor.addChild(root_0, KW_SWITCH286_tree);
            }
            pushFollow(FOLLOW_parL_in_g_switch2626);
            parL287=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL287.getTree());
            pushFollow(FOLLOW_expr_in_g_switch2628);
            expr288=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr288.getTree());
            pushFollow(FOLLOW_parR_in_g_switch2630);
            parR289=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR289.getTree());
            pushFollow(FOLLOW_bracketL_in_g_switch2632);
            bracketL290=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL290.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:46: ( g_case )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==KW_CASE) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:398:47: g_case
            	    {
            	    pushFollow(FOLLOW_g_case_in_g_switch2635);
            	    g_case291=g_case();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_case291.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:398:56: ( g_default )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==KW_DEFAULT) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:57: g_default
                    {
                    pushFollow(FOLLOW_g_default_in_g_switch2640);
                    g_default292=g_default();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_default292.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_bracketR_in_g_switch2644);
            bracketR293=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR293.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 72, g_switch_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_switch"

    public static class g_throw_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_throw"
    // src/net/colar/netbeans/fan/antlr/Fan.g:399:1: g_throw : KW_THROW expr eos ;
    public final FanParser.g_throw_return g_throw() throws RecognitionException {
        FanParser.g_throw_return retval = new FanParser.g_throw_return();
        retval.start = input.LT(1);
        int g_throw_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THROW294=null;
        FanParser.expr_return expr295 = null;

        FanParser.eos_return eos296 = null;


        Object KW_THROW294_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:10: ( KW_THROW expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:12: KW_THROW expr eos
            {
            root_0 = (Object)adaptor.nil();

            KW_THROW294=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_g_throw2652); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THROW294_tree = (Object)adaptor.create(KW_THROW294);
            adaptor.addChild(root_0, KW_THROW294_tree);
            }
            pushFollow(FOLLOW_expr_in_g_throw2654);
            expr295=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr295.getTree());
            pushFollow(FOLLOW_eos_in_g_throw2656);
            eos296=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos296.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 73, g_throw_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_throw"

    public static class g_while_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_while"
    // src/net/colar/netbeans/fan/antlr/Fan.g:400:1: g_while : KW_WHILE parL expr parR block ;
    public final FanParser.g_while_return g_while() throws RecognitionException {
        FanParser.g_while_return retval = new FanParser.g_while_return();
        retval.start = input.LT(1);
        int g_while_StartIndex = input.index();
        Object root_0 = null;

        Token KW_WHILE297=null;
        FanParser.parL_return parL298 = null;

        FanParser.expr_return expr299 = null;

        FanParser.parR_return parR300 = null;

        FanParser.block_return block301 = null;


        Object KW_WHILE297_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:10: ( KW_WHILE parL expr parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:12: KW_WHILE parL expr parR block
            {
            root_0 = (Object)adaptor.nil();

            KW_WHILE297=(Token)match(input,KW_WHILE,FOLLOW_KW_WHILE_in_g_while2664); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_WHILE297_tree = (Object)adaptor.create(KW_WHILE297);
            adaptor.addChild(root_0, KW_WHILE297_tree);
            }
            pushFollow(FOLLOW_parL_in_g_while2666);
            parL298=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL298.getTree());
            pushFollow(FOLLOW_expr_in_g_while2668);
            expr299=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr299.getTree());
            pushFollow(FOLLOW_parR_in_g_while2670);
            parR300=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR300.getTree());
            pushFollow(FOLLOW_block_in_g_while2672);
            block301=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block301.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 74, g_while_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_while"

    public static class g_try_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_try"
    // src/net/colar/netbeans/fan/antlr/Fan.g:401:1: g_try : ( KW_TRY g_try_content ) -> ^( AST_SCOPE KW_TRY g_try_content ) ;
    public final FanParser.g_try_return g_try() throws RecognitionException {
        FanParser.g_try_return retval = new FanParser.g_try_return();
        retval.start = input.LT(1);
        int g_try_StartIndex = input.index();
        Object root_0 = null;

        Token KW_TRY302=null;
        FanParser.g_try_content_return g_try_content303 = null;


        Object KW_TRY302_tree=null;
        RewriteRuleTokenStream stream_KW_TRY=new RewriteRuleTokenStream(adaptor,"token KW_TRY");
        RewriteRuleSubtreeStream stream_g_try_content=new RewriteRuleSubtreeStream(adaptor,"rule g_try_content");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:8: ( ( KW_TRY g_try_content ) -> ^( AST_SCOPE KW_TRY g_try_content ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:10: ( KW_TRY g_try_content )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:10: ( KW_TRY g_try_content )
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:11: KW_TRY g_try_content
            {
            KW_TRY302=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_g_try2681); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY302);

            pushFollow(FOLLOW_g_try_content_in_g_try2683);
            g_try_content303=g_try_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_g_try_content.add(g_try_content303.getTree());

            }



            // AST REWRITE
            // elements: g_try_content, KW_TRY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 402:5: -> ^( AST_SCOPE KW_TRY g_try_content )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:402:8: ^( AST_SCOPE KW_TRY g_try_content )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SCOPE, "AST_SCOPE"), root_1);

                adaptor.addChild(root_1, stream_KW_TRY.nextNode());
                adaptor.addChild(root_1, stream_g_try_content.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 75, g_try_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_try"

    public static class g_try_content_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_try_content"
    // src/net/colar/netbeans/fan/antlr/Fan.g:403:1: g_try_content : ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? ;
    public final FanParser.g_try_content_return g_try_content() throws RecognitionException {
        FanParser.g_try_content_return retval = new FanParser.g_try_content_return();
        retval.start = input.LT(1);
        int g_try_content_StartIndex = input.index();
        Object root_0 = null;

        FanParser.try_long_return try_long304 = null;

        FanParser.stmtList_return stmtList305 = null;

        FanParser.g_catch_return g_catch306 = null;

        FanParser.g_finally_return g_finally307 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:403:14: ( ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:403:16: ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )?
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:403:16: ( ( bracketL )=> try_long | stmtList )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==BRACKET_L) && (synpred134_Fan())) {
                alt88=1;
            }
            else if ( (LA88_0==EOF||(LA88_0>=KW_BREAK && LA88_0<=KW_FINALLY)||(LA88_0>=KW_RD_ONLY && LA88_0<=KW_FINAL)||(LA88_0>=KW_ABSTRACT && LA88_0<=KW_ELSE)||(LA88_0>=KW_NULL && LA88_0<=KW_FALSE)||LA88_0==BRACKET_R||LA88_0==SP_COMMA||LA88_0==SP_PIPE||LA88_0==SP_SEMI||(LA88_0>=OP_PLUS && LA88_0<=OP_MULTI)||(LA88_0>=OP_CURRY && LA88_0<=OP_2MINUS)||(LA88_0>=ID && LA88_0<=SQ_BRACKET_L)||LA88_0==PAR_L) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:403:17: ( bracketL )=> try_long
                    {
                    pushFollow(FOLLOW_try_long_in_g_try_content2709);
                    try_long304=try_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_long304.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:403:40: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_try_content2713);
                    stmtList305=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList305.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:403:50: ( ( KW_CATCH )=> g_catch )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==KW_CATCH) ) {
                    int LA89_2 = input.LA(2);

                    if ( (synpred135_Fan()) ) {
                        alt89=1;
                    }


                }


                switch (alt89) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:403:51: ( KW_CATCH )=> g_catch
            	    {
            	    pushFollow(FOLLOW_g_catch_in_g_try_content2721);
            	    g_catch306=g_catch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_catch306.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:403:73: ( ( KW_FINALLY )=> g_finally )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==KW_FINALLY) ) {
                int LA90_1 = input.LA(2);

                if ( (synpred136_Fan()) ) {
                    alt90=1;
                }
            }
            switch (alt90) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:403:74: ( KW_FINALLY )=> g_finally
                    {
                    pushFollow(FOLLOW_g_finally_in_g_try_content2730);
                    g_finally307=g_finally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_finally307.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 76, g_try_content_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_try_content"

    public static class try_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "try_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:404:1: try_long : multiStmt ;
    public final FanParser.try_long_return try_long() throws RecognitionException {
        FanParser.try_long_return retval = new FanParser.try_long_return();
        retval.start = input.LT(1);
        int try_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt308 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:10: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:12: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_try_long2739);
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
            if ( state.backtracking>0 ) { memoize(input, 77, try_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "try_long"

    public static class exprStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:405:1: exprStmt : expr eos ;
    public final FanParser.exprStmt_return exprStmt() throws RecognitionException {
        FanParser.exprStmt_return retval = new FanParser.exprStmt_return();
        retval.start = input.LT(1);
        int exprStmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.expr_return expr309 = null;

        FanParser.eos_return eos310 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:10: ( expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:12: expr eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprStmt2746);
            expr309=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr309.getTree());
            pushFollow(FOLLOW_eos_in_exprStmt2748);
            eos310=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos310.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 78, exprStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprStmt"

    public static class localDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:406:1: localDef : ( typeId ( AS_INIT_VAL expr )? eos ) -> ^( AST_LOCAL_DEF typeId ( expr )? ( eos )? ) ;
    public final FanParser.localDef_return localDef() throws RecognitionException {
        FanParser.localDef_return retval = new FanParser.localDef_return();
        retval.start = input.LT(1);
        int localDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL312=null;
        FanParser.typeId_return typeId311 = null;

        FanParser.expr_return expr313 = null;

        FanParser.eos_return eos314 = null;


        Object AS_INIT_VAL312_tree=null;
        RewriteRuleTokenStream stream_AS_INIT_VAL=new RewriteRuleTokenStream(adaptor,"token AS_INIT_VAL");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:10: ( ( typeId ( AS_INIT_VAL expr )? eos ) -> ^( AST_LOCAL_DEF typeId ( expr )? ( eos )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:12: ( typeId ( AS_INIT_VAL expr )? eos )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:12: ( typeId ( AS_INIT_VAL expr )? eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:13: typeId ( AS_INIT_VAL expr )? eos
            {
            pushFollow(FOLLOW_typeId_in_localDef2756);
            typeId311=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeId.add(typeId311.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:20: ( AS_INIT_VAL expr )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==AS_INIT_VAL) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:21: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL312=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_localDef2759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL312);

                    pushFollow(FOLLOW_expr_in_localDef2761);
                    expr313=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr313.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_eos_in_localDef2765);
            eos314=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos314.getTree());

            }



            // AST REWRITE
            // elements: expr, typeId, eos
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 407:5: -> ^( AST_LOCAL_DEF typeId ( expr )? ( eos )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:407:8: ^( AST_LOCAL_DEF typeId ( expr )? ( eos )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_LOCAL_DEF, "AST_LOCAL_DEF"), root_1);

                adaptor.addChild(root_1, stream_typeId.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:407:31: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:407:37: ( eos )?
                if ( stream_eos.hasNext() ) {
                    adaptor.addChild(root_1, stream_eos.nextTree());

                }
                stream_eos.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 79, localDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localDef"

    public static class forInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInit"
    // src/net/colar/netbeans/fan/antlr/Fan.g:408:1: forInit : ( forInitDef | expr );
    public final FanParser.forInit_return forInit() throws RecognitionException {
        FanParser.forInit_return retval = new FanParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        Object root_0 = null;

        FanParser.forInitDef_return forInitDef315 = null;

        FanParser.expr_return expr316 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:10: ( forInitDef | expr )
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:408:12: forInitDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forInitDef_in_forInit2792);
                    forInitDef315=forInitDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInitDef315.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:408:25: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_forInit2796);
                    expr316=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr316.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 80, forInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class forInitDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInitDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:409:1: forInitDef : typeId ( AS_INIT_VAL expr )? -> ^( AST_FOR_INIT typeId ( AS_INIT_VAL expr )? ) ;
    public final FanParser.forInitDef_return forInitDef() throws RecognitionException {
        FanParser.forInitDef_return retval = new FanParser.forInitDef_return();
        retval.start = input.LT(1);
        int forInitDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL318=null;
        FanParser.typeId_return typeId317 = null;

        FanParser.expr_return expr319 = null;


        Object AS_INIT_VAL318_tree=null;
        RewriteRuleTokenStream stream_AS_INIT_VAL=new RewriteRuleTokenStream(adaptor,"token AS_INIT_VAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:12: ( typeId ( AS_INIT_VAL expr )? -> ^( AST_FOR_INIT typeId ( AS_INIT_VAL expr )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:14: typeId ( AS_INIT_VAL expr )?
            {
            pushFollow(FOLLOW_typeId_in_forInitDef2803);
            typeId317=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeId.add(typeId317.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:21: ( AS_INIT_VAL expr )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==AS_INIT_VAL) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:409:22: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL318=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_forInitDef2806); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL318);

                    pushFollow(FOLLOW_expr_in_forInitDef2808);
                    expr319=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr319.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: AS_INIT_VAL, typeId, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 410:5: -> ^( AST_FOR_INIT typeId ( AS_INIT_VAL expr )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:410:8: ^( AST_FOR_INIT typeId ( AS_INIT_VAL expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_FOR_INIT, "AST_FOR_INIT"), root_1);

                adaptor.addChild(root_1, stream_typeId.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:410:30: ( AS_INIT_VAL expr )?
                if ( stream_AS_INIT_VAL.hasNext()||stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_AS_INIT_VAL.nextNode());
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_AS_INIT_VAL.reset();
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
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, forInitDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInitDef"

    public static class g_catch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_catch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:413:1: g_catch : ( KW_CATCH g_catch_ct ) -> ^( AST_SCOPE g_catch_ct ) ;
    public final FanParser.g_catch_return g_catch() throws RecognitionException {
        FanParser.g_catch_return retval = new FanParser.g_catch_return();
        retval.start = input.LT(1);
        int g_catch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CATCH320=null;
        FanParser.g_catch_ct_return g_catch_ct321 = null;


        Object KW_CATCH320_tree=null;
        RewriteRuleTokenStream stream_KW_CATCH=new RewriteRuleTokenStream(adaptor,"token KW_CATCH");
        RewriteRuleSubtreeStream stream_g_catch_ct=new RewriteRuleSubtreeStream(adaptor,"rule g_catch_ct");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:10: ( ( KW_CATCH g_catch_ct ) -> ^( AST_SCOPE g_catch_ct ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:12: ( KW_CATCH g_catch_ct )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:12: ( KW_CATCH g_catch_ct )
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:13: KW_CATCH g_catch_ct
            {
            KW_CATCH320=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_g_catch2840); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH320);

            pushFollow(FOLLOW_g_catch_ct_in_g_catch2842);
            g_catch_ct321=g_catch_ct();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_g_catch_ct.add(g_catch_ct321.getTree());

            }



            // AST REWRITE
            // elements: g_catch_ct
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 414:5: -> ^( AST_SCOPE g_catch_ct )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:414:8: ^( AST_SCOPE g_catch_ct )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SCOPE, "AST_SCOPE"), root_1);

                adaptor.addChild(root_1, stream_g_catch_ct.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 82, g_catch_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_catch"

    public static class g_catch_ct_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_catch_ct"
    // src/net/colar/netbeans/fan/antlr/Fan.g:415:1: g_catch_ct : ( catchDef )? ( ( bracketL )=> catch_long | stmtList ) ;
    public final FanParser.g_catch_ct_return g_catch_ct() throws RecognitionException {
        FanParser.g_catch_ct_return retval = new FanParser.g_catch_ct_return();
        retval.start = input.LT(1);
        int g_catch_ct_StartIndex = input.index();
        Object root_0 = null;

        FanParser.catchDef_return catchDef322 = null;

        FanParser.catch_long_return catch_long323 = null;

        FanParser.stmtList_return stmtList324 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:415:12: ( ( catchDef )? ( ( bracketL )=> catch_long | stmtList ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:415:14: ( catchDef )? ( ( bracketL )=> catch_long | stmtList )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:415:14: ( catchDef )?
            int alt94=2;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: catchDef
                    {
                    pushFollow(FOLLOW_catchDef_in_g_catch_ct2862);
                    catchDef322=catchDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchDef322.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:415:24: ( ( bracketL )=> catch_long | stmtList )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==BRACKET_L) && (synpred141_Fan())) {
                alt95=1;
            }
            else if ( (LA95_0==EOF||(LA95_0>=KW_BREAK && LA95_0<=KW_FINALLY)||(LA95_0>=KW_RD_ONLY && LA95_0<=KW_FINAL)||(LA95_0>=KW_ABSTRACT && LA95_0<=KW_ELSE)||(LA95_0>=KW_NULL && LA95_0<=KW_FALSE)||LA95_0==BRACKET_R||LA95_0==SP_COMMA||LA95_0==SP_PIPE||LA95_0==SP_SEMI||(LA95_0>=OP_PLUS && LA95_0<=OP_MULTI)||(LA95_0>=OP_CURRY && LA95_0<=OP_2MINUS)||(LA95_0>=ID && LA95_0<=SQ_BRACKET_L)||LA95_0==PAR_L) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:415:25: ( bracketL )=> catch_long
                    {
                    pushFollow(FOLLOW_catch_long_in_g_catch_ct2870);
                    catch_long323=catch_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catch_long323.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:415:50: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_catch_ct2874);
                    stmtList324=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList324.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 83, g_catch_ct_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_catch_ct"

    public static class catch_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catch_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:416:1: catch_long : multiStmt ;
    public final FanParser.catch_long_return catch_long() throws RecognitionException {
        FanParser.catch_long_return retval = new FanParser.catch_long_return();
        retval.start = input.LT(1);
        int catch_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt325 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:12: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:14: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_catch_long2882);
            multiStmt325=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt325.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 84, catch_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catch_long"

    public static class catchDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:417:1: catchDef : parL type id parR -> ^( AST_CATCH_DEF parL type id parR ) ;
    public final FanParser.catchDef_return catchDef() throws RecognitionException {
        FanParser.catchDef_return retval = new FanParser.catchDef_return();
        retval.start = input.LT(1);
        int catchDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL326 = null;

        FanParser.type_return type327 = null;

        FanParser.id_return id328 = null;

        FanParser.parR_return parR329 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_parL=new RewriteRuleSubtreeStream(adaptor,"rule parL");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_parR=new RewriteRuleSubtreeStream(adaptor,"rule parR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:11: ( parL type id parR -> ^( AST_CATCH_DEF parL type id parR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:13: parL type id parR
            {
            pushFollow(FOLLOW_parL_in_catchDef2890);
            parL326=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL326.getTree());
            pushFollow(FOLLOW_type_in_catchDef2892);
            type327=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type327.getTree());
            pushFollow(FOLLOW_id_in_catchDef2894);
            id328=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id328.getTree());
            pushFollow(FOLLOW_parR_in_catchDef2896);
            parR329=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR329.getTree());


            // AST REWRITE
            // elements: parL, type, parR, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 418:5: -> ^( AST_CATCH_DEF parL type id parR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:418:8: ^( AST_CATCH_DEF parL type id parR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CATCH_DEF, "AST_CATCH_DEF"), root_1);

                adaptor.addChild(root_1, stream_parL.nextTree());
                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_id.nextTree());
                adaptor.addChild(root_1, stream_parR.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 85, catchDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchDef"

    public static class g_finally_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_finally"
    // src/net/colar/netbeans/fan/antlr/Fan.g:420:1: g_finally : KW_FINALLY ( ( bracketL )=> finally_long | stmtList ) ;
    public final FanParser.g_finally_return g_finally() throws RecognitionException {
        FanParser.g_finally_return retval = new FanParser.g_finally_return();
        retval.start = input.LT(1);
        int g_finally_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FINALLY330=null;
        FanParser.finally_long_return finally_long331 = null;

        FanParser.stmtList_return stmtList332 = null;


        Object KW_FINALLY330_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:11: ( KW_FINALLY ( ( bracketL )=> finally_long | stmtList ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:13: KW_FINALLY ( ( bracketL )=> finally_long | stmtList )
            {
            root_0 = (Object)adaptor.nil();

            KW_FINALLY330=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_g_finally2922); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_FINALLY330_tree = (Object)adaptor.create(KW_FINALLY330);
            adaptor.addChild(root_0, KW_FINALLY330_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:24: ( ( bracketL )=> finally_long | stmtList )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==BRACKET_L) && (synpred142_Fan())) {
                alt96=1;
            }
            else if ( (LA96_0==EOF||(LA96_0>=KW_BREAK && LA96_0<=KW_FINALLY)||(LA96_0>=KW_RD_ONLY && LA96_0<=KW_FINAL)||(LA96_0>=KW_ABSTRACT && LA96_0<=KW_ELSE)||(LA96_0>=KW_NULL && LA96_0<=KW_FALSE)||LA96_0==BRACKET_R||LA96_0==SP_COMMA||LA96_0==SP_PIPE||LA96_0==SP_SEMI||(LA96_0>=OP_PLUS && LA96_0<=OP_MULTI)||(LA96_0>=OP_CURRY && LA96_0<=OP_2MINUS)||(LA96_0>=ID && LA96_0<=SQ_BRACKET_L)||LA96_0==PAR_L) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:25: ( bracketL )=> finally_long
                    {
                    pushFollow(FOLLOW_finally_long_in_g_finally2929);
                    finally_long331=finally_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, finally_long331.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:52: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_finally2933);
                    stmtList332=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList332.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 86, g_finally_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_finally"

    public static class finally_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "finally_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:421:1: finally_long : multiStmt ;
    public final FanParser.finally_long_return finally_long() throws RecognitionException {
        FanParser.finally_long_return retval = new FanParser.finally_long_return();
        retval.start = input.LT(1);
        int finally_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt333 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:14: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:16: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_finally_long2941);
            multiStmt333=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt333.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 87, finally_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "finally_long"

    public static class g_case_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_case"
    // src/net/colar/netbeans/fan/antlr/Fan.g:422:1: g_case : KW_CASE expr SP_COLON ( stmt )* ;
    public final FanParser.g_case_return g_case() throws RecognitionException {
        FanParser.g_case_return retval = new FanParser.g_case_return();
        retval.start = input.LT(1);
        int g_case_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CASE334=null;
        Token SP_COLON336=null;
        FanParser.expr_return expr335 = null;

        FanParser.stmt_return stmt337 = null;


        Object KW_CASE334_tree=null;
        Object SP_COLON336_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:9: ( KW_CASE expr SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:11: KW_CASE expr SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_CASE334=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_g_case2949); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CASE334_tree = (Object)adaptor.create(KW_CASE334);
            adaptor.addChild(root_0, KW_CASE334_tree);
            }
            pushFollow(FOLLOW_expr_in_g_case2951);
            expr335=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr335.getTree());
            SP_COLON336=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_case2953); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON336_tree = (Object)adaptor.create(SP_COLON336);
            adaptor.addChild(root_0, SP_COLON336_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:33: ( stmt )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=KW_BREAK && LA97_0<=KW_TRY)||(LA97_0>=KW_THIS && LA97_0<=KW_SUPER)||(LA97_0>=KW_NULL && LA97_0<=KW_FALSE)||LA97_0==SP_PIPE||(LA97_0>=OP_PLUS && LA97_0<=OP_MULTI)||(LA97_0>=OP_CURRY && LA97_0<=OP_2MINUS)||(LA97_0>=ID && LA97_0<=AT)||(LA97_0>=NUMBER && LA97_0<=SQ_BRACKET_L)||LA97_0==PAR_L) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_case2955);
            	    stmt337=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt337.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 88, g_case_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_case"

    public static class g_default_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_default"
    // src/net/colar/netbeans/fan/antlr/Fan.g:423:1: g_default : KW_DEFAULT SP_COLON ( stmt )* ;
    public final FanParser.g_default_return g_default() throws RecognitionException {
        FanParser.g_default_return retval = new FanParser.g_default_return();
        retval.start = input.LT(1);
        int g_default_StartIndex = input.index();
        Object root_0 = null;

        Token KW_DEFAULT338=null;
        Token SP_COLON339=null;
        FanParser.stmt_return stmt340 = null;


        Object KW_DEFAULT338_tree=null;
        Object SP_COLON339_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:11: ( KW_DEFAULT SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:13: KW_DEFAULT SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_DEFAULT338=(Token)match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_g_default2963); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_DEFAULT338_tree = (Object)adaptor.create(KW_DEFAULT338);
            adaptor.addChild(root_0, KW_DEFAULT338_tree);
            }
            SP_COLON339=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_default2965); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON339_tree = (Object)adaptor.create(SP_COLON339);
            adaptor.addChild(root_0, SP_COLON339_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:33: ( stmt )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( ((LA98_0>=KW_BREAK && LA98_0<=KW_TRY)||(LA98_0>=KW_THIS && LA98_0<=KW_SUPER)||(LA98_0>=KW_NULL && LA98_0<=KW_FALSE)||LA98_0==SP_PIPE||(LA98_0>=OP_PLUS && LA98_0<=OP_MULTI)||(LA98_0>=OP_CURRY && LA98_0<=OP_2MINUS)||(LA98_0>=ID && LA98_0<=AT)||(LA98_0>=NUMBER && LA98_0<=SQ_BRACKET_L)||LA98_0==PAR_L) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_default2967);
            	    stmt340=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt340.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 89, g_default_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_default"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:426:1: expr : assignExpr ;
    public final FanParser.expr_return expr() throws RecognitionException {
        FanParser.expr_return retval = new FanParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.assignExpr_return assignExpr341 = null;



        paraphrase.push("Expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:428:3: ( assignExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:428:5: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr2988);
            assignExpr341=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr341.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 90, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class assignExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:429:1: assignExpr : ternaryExpr ( assignOp assignExpr )? ;
    public final FanParser.assignExpr_return assignExpr() throws RecognitionException {
        FanParser.assignExpr_return retval = new FanParser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.ternaryExpr_return ternaryExpr342 = null;

        FanParser.assignOp_return assignOp343 = null;

        FanParser.assignExpr_return assignExpr344 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:12: ( ternaryExpr ( assignOp assignExpr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:14: ternaryExpr ( assignOp assignExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2995);
            ternaryExpr342=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr342.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:26: ( assignOp assignExpr )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( ((LA99_0>=AS_EQUAL && LA99_0<=AS_ASSIGN_OP)) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:27: assignOp assignExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2998);
                    assignOp343=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp343.getTree());
                    pushFollow(FOLLOW_assignExpr_in_assignExpr3000);
                    assignExpr344=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr344.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 91, assignExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExpr"

    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:430:1: ternaryExpr : condOrExpr ( ternaryTail )? ;
    public final FanParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        FanParser.ternaryExpr_return retval = new FanParser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.condOrExpr_return condOrExpr345 = null;

        FanParser.ternaryTail_return ternaryTail346 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:13: ( condOrExpr ( ternaryTail )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:15: condOrExpr ( ternaryTail )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condOrExpr_in_ternaryExpr3009);
            condOrExpr345=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr345.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:26: ( ternaryTail )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==SP_QMARK) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:430:27: ternaryTail
                    {
                    pushFollow(FOLLOW_ternaryTail_in_ternaryExpr3012);
                    ternaryTail346=ternaryTail();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryTail346.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 92, ternaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"

    public static class ternaryTail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryTail"
    // src/net/colar/netbeans/fan/antlr/Fan.g:432:1: ternaryTail : SP_QMARK condOrExpr SP_COLON condOrExpr ;
    public final FanParser.ternaryTail_return ternaryTail() throws RecognitionException {
        FanParser.ternaryTail_return retval = new FanParser.ternaryTail_return();
        retval.start = input.LT(1);
        int ternaryTail_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK347=null;
        Token SP_COLON349=null;
        FanParser.condOrExpr_return condOrExpr348 = null;

        FanParser.condOrExpr_return condOrExpr350 = null;


        Object SP_QMARK347_tree=null;
        Object SP_COLON349_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:432:13: ( SP_QMARK condOrExpr SP_COLON condOrExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:432:15: SP_QMARK condOrExpr SP_COLON condOrExpr
            {
            root_0 = (Object)adaptor.nil();

            SP_QMARK347=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_ternaryTail3022); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_QMARK347_tree = (Object)adaptor.create(SP_QMARK347);
            adaptor.addChild(root_0, SP_QMARK347_tree);
            }
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail3024);
            condOrExpr348=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr348.getTree());
            SP_COLON349=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ternaryTail3026); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON349_tree = (Object)adaptor.create(SP_COLON349);
            adaptor.addChild(root_0, SP_COLON349_tree);
            }
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail3028);
            condOrExpr350=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr350.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 93, ternaryTail_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryTail"

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:433:1: assignOp : ( AS_EQUAL | AS_ASSIGN_OP );
    public final FanParser.assignOp_return assignOp() throws RecognitionException {
        FanParser.assignOp_return retval = new FanParser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token set351=null;

        Object set351_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:433:10: ( AS_EQUAL | AS_ASSIGN_OP )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            root_0 = (Object)adaptor.nil();

            set351=(Token)input.LT(1);
            if ( (input.LA(1)>=AS_EQUAL && input.LA(1)<=AS_ASSIGN_OP) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set351));
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
            if ( state.backtracking>0 ) { memoize(input, 94, assignOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignOp"

    public static class condOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:434:1: condOrExpr : condAndExpr ( OP_OR condAndExpr )* ;
    public final FanParser.condOrExpr_return condOrExpr() throws RecognitionException {
        FanParser.condOrExpr_return retval = new FanParser.condOrExpr_return();
        retval.start = input.LT(1);
        int condOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_OR353=null;
        FanParser.condAndExpr_return condAndExpr352 = null;

        FanParser.condAndExpr_return condAndExpr354 = null;


        Object OP_OR353_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:13: ( condAndExpr ( OP_OR condAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:15: condAndExpr ( OP_OR condAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condAndExpr_in_condOrExpr3047);
            condAndExpr352=condAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr352.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:28: ( OP_OR condAndExpr )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==OP_OR) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:434:29: OP_OR condAndExpr
            	    {
            	    OP_OR353=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_condOrExpr3051); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_OR353_tree = (Object)adaptor.create(OP_OR353);
            	    adaptor.addChild(root_0, OP_OR353_tree);
            	    }
            	    pushFollow(FOLLOW_condAndExpr_in_condOrExpr3054);
            	    condAndExpr354=condAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr354.getTree());

            	    }
            	    break;

            	default :
            	    break loop101;
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
            if ( state.backtracking>0 ) { memoize(input, 95, condOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condOrExpr"

    public static class condAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:435:1: condAndExpr : equalityExpr ( OP_AND equalityExpr )* ;
    public final FanParser.condAndExpr_return condAndExpr() throws RecognitionException {
        FanParser.condAndExpr_return retval = new FanParser.condAndExpr_return();
        retval.start = input.LT(1);
        int condAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_AND356=null;
        FanParser.equalityExpr_return equalityExpr355 = null;

        FanParser.equalityExpr_return equalityExpr357 = null;


        Object OP_AND356_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:14: ( equalityExpr ( OP_AND equalityExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:16: equalityExpr ( OP_AND equalityExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpr_in_condAndExpr3064);
            equalityExpr355=equalityExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr355.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:29: ( OP_AND equalityExpr )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==OP_AND) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:435:30: OP_AND equalityExpr
            	    {
            	    OP_AND356=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_condAndExpr3067); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_AND356_tree = (Object)adaptor.create(OP_AND356);
            	    adaptor.addChild(root_0, OP_AND356_tree);
            	    }
            	    pushFollow(FOLLOW_equalityExpr_in_condAndExpr3070);
            	    equalityExpr357=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr357.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 96, condAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condAndExpr"

    public static class equalityExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:436:1: equalityExpr : relationalExpr ( CP_EQUALITY relationalExpr )* ;
    public final FanParser.equalityExpr_return equalityExpr() throws RecognitionException {
        FanParser.equalityExpr_return retval = new FanParser.equalityExpr_return();
        retval.start = input.LT(1);
        int equalityExpr_StartIndex = input.index();
        Object root_0 = null;

        Token CP_EQUALITY359=null;
        FanParser.relationalExpr_return relationalExpr358 = null;

        FanParser.relationalExpr_return relationalExpr360 = null;


        Object CP_EQUALITY359_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:436:14: ( relationalExpr ( CP_EQUALITY relationalExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:436:16: relationalExpr ( CP_EQUALITY relationalExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpr_in_equalityExpr3080);
            relationalExpr358=relationalExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr358.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:436:31: ( CP_EQUALITY relationalExpr )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==CP_EQUALITY) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:436:32: CP_EQUALITY relationalExpr
            	    {
            	    CP_EQUALITY359=(Token)match(input,CP_EQUALITY,FOLLOW_CP_EQUALITY_in_equalityExpr3083); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_EQUALITY359_tree = (Object)adaptor.create(CP_EQUALITY359);
            	    adaptor.addChild(root_0, CP_EQUALITY359_tree);
            	    }
            	    pushFollow(FOLLOW_relationalExpr_in_equalityExpr3085);
            	    relationalExpr360=relationalExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr360.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 97, equalityExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpr"

    public static class relationalExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:438:1: relationalExpr : elvisExpr ( typeCheck | compare ) ;
    public final FanParser.relationalExpr_return relationalExpr() throws RecognitionException {
        FanParser.relationalExpr_return retval = new FanParser.relationalExpr_return();
        retval.start = input.LT(1);
        int relationalExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.elvisExpr_return elvisExpr361 = null;

        FanParser.typeCheck_return typeCheck362 = null;

        FanParser.compare_return compare363 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:438:16: ( elvisExpr ( typeCheck | compare ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:438:20: elvisExpr ( typeCheck | compare )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_elvisExpr_in_relationalExpr3098);
            elvisExpr361=elvisExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr361.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:438:30: ( typeCheck | compare )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==KW_AS||(LA104_0>=KW_IS && LA104_0<=KW_ISNOT)) ) {
                alt104=1;
            }
            else if ( (LA104_0==EOF||(LA104_0>=KW_BREAK && LA104_0<=KW_USING)||(LA104_0>=KW_RD_ONLY && LA104_0<=KW_FINAL)||(LA104_0>=KW_CLASS && LA104_0<=KW_ELSE)||(LA104_0>=KW_NULL && LA104_0<=KW_FALSE)||(LA104_0>=BRACKET_L && LA104_0<=BRACKET_R)||(LA104_0>=SP_COLON && LA104_0<=SP_QMARK)||LA104_0==SP_PIPE||(LA104_0>=SP_SEMI && LA104_0<=CP_COMPARATORS)||(LA104_0>=OP_PLUS && LA104_0<=OP_MULTI)||(LA104_0>=OP_CURRY && LA104_0<=OP_2MINUS)||(LA104_0>=ID && LA104_0<=PAR_R)) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:438:31: typeCheck
                    {
                    pushFollow(FOLLOW_typeCheck_in_relationalExpr3101);
                    typeCheck362=typeCheck();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeCheck362.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:438:43: compare
                    {
                    pushFollow(FOLLOW_compare_in_relationalExpr3105);
                    compare363=compare();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compare363.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 98, relationalExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpr"

    public static class typeCheck_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeCheck"
    // src/net/colar/netbeans/fan/antlr/Fan.g:440:1: typeCheck : ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* ;
    public final FanParser.typeCheck_return typeCheck() throws RecognitionException {
        FanParser.typeCheck_return retval = new FanParser.typeCheck_return();
        retval.start = input.LT(1);
        int typeCheck_StartIndex = input.index();
        Object root_0 = null;

        Token set364=null;
        Token SP_QMARK366=null;
        Token string_literal367=null;
        FanParser.typeRoot_return typeRoot365 = null;


        Object set364_tree=null;
        Object SP_QMARK366_tree=null;
        Object string_literal367_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:11: ( ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:15: ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )*
            {
            root_0 = (Object)adaptor.nil();

            set364=(Token)input.LT(1);
            if ( input.LA(1)==KW_AS||(input.LA(1)>=KW_IS && input.LA(1)<=KW_ISNOT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set364));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_typeRoot_in_typeCheck3128);
            typeRoot365=typeRoot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeRoot365.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:51: ( ( SP_QMARK )? {...}? '[]' )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==SP_QMARK) ) {
                    int LA106_2 = input.LA(2);

                    if ( (LA106_2==LIST_TYPE) ) {
                        alt106=1;
                    }


                }
                else if ( (LA106_0==LIST_TYPE) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:440:52: ( SP_QMARK )? {...}? '[]'
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:440:52: ( SP_QMARK )?
            	    int alt105=2;
            	    int LA105_0 = input.LA(1);

            	    if ( (LA105_0==SP_QMARK) ) {
            	        alt105=1;
            	    }
            	    switch (alt105) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK366=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_typeCheck3131); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK366_tree = (Object)adaptor.create(SP_QMARK366);
            	            adaptor.addChild(root_0, SP_QMARK366_tree);
            	            }

            	            }
            	            break;

            	    }

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "typeCheck", "notAfterEol()");
            	    }
            	    string_literal367=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_typeCheck3136); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal367_tree = (Object)adaptor.create(string_literal367);
            	    adaptor.addChild(root_0, string_literal367_tree);
            	    }

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
            if ( state.backtracking>0 ) { memoize(input, 99, typeCheck_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeCheck"

    public static class compare_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare"
    // src/net/colar/netbeans/fan/antlr/Fan.g:441:1: compare : ( CP_COMPARATORS elvisExpr )* ;
    public final FanParser.compare_return compare() throws RecognitionException {
        FanParser.compare_return retval = new FanParser.compare_return();
        retval.start = input.LT(1);
        int compare_StartIndex = input.index();
        Object root_0 = null;

        Token CP_COMPARATORS368=null;
        FanParser.elvisExpr_return elvisExpr369 = null;


        Object CP_COMPARATORS368_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:10: ( ( CP_COMPARATORS elvisExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:14: ( CP_COMPARATORS elvisExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:441:14: ( CP_COMPARATORS elvisExpr )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==CP_COMPARATORS) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:441:15: CP_COMPARATORS elvisExpr
            	    {
            	    CP_COMPARATORS368=(Token)match(input,CP_COMPARATORS,FOLLOW_CP_COMPARATORS_in_compare3149); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_COMPARATORS368_tree = (Object)adaptor.create(CP_COMPARATORS368);
            	    adaptor.addChild(root_0, CP_COMPARATORS368_tree);
            	    }
            	    pushFollow(FOLLOW_elvisExpr_in_compare3151);
            	    elvisExpr369=elvisExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr369.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 100, compare_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "compare"

    public static class elvisExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elvisExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:443:1: elvisExpr : rangeExpr ( OP_ELVIS rangeExpr )* ;
    public final FanParser.elvisExpr_return elvisExpr() throws RecognitionException {
        FanParser.elvisExpr_return retval = new FanParser.elvisExpr_return();
        retval.start = input.LT(1);
        int elvisExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ELVIS371=null;
        FanParser.rangeExpr_return rangeExpr370 = null;

        FanParser.rangeExpr_return rangeExpr372 = null;


        Object OP_ELVIS371_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:12: ( rangeExpr ( OP_ELVIS rangeExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:14: rangeExpr ( OP_ELVIS rangeExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpr_in_elvisExpr3162);
            rangeExpr370=rangeExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rangeExpr370.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:24: ( OP_ELVIS rangeExpr )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==OP_ELVIS) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:443:25: OP_ELVIS rangeExpr
            	    {
            	    OP_ELVIS371=(Token)match(input,OP_ELVIS,FOLLOW_OP_ELVIS_in_elvisExpr3165); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_ELVIS371_tree = (Object)adaptor.create(OP_ELVIS371);
            	    adaptor.addChild(root_0, OP_ELVIS371_tree);
            	    }
            	    pushFollow(FOLLOW_rangeExpr_in_elvisExpr3167);
            	    rangeExpr372=rangeExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rangeExpr372.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 101, elvisExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elvisExpr"

    public static class rangeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rangeExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:444:1: rangeExpr : addExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) addExpr )* ;
    public final FanParser.rangeExpr_return rangeExpr() throws RecognitionException {
        FanParser.rangeExpr_return retval = new FanParser.rangeExpr_return();
        retval.start = input.LT(1);
        int rangeExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set374=null;
        FanParser.addExpr_return addExpr373 = null;

        FanParser.addExpr_return addExpr375 = null;


        Object set374_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:12: ( addExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) addExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:14: addExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_rangeExpr3178);
            addExpr373=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr373.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:22: ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) addExpr )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( ((LA109_0>=OP_RANG_EXCL_OLD && LA109_0<=OP_RANGE)) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:444:23: ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) addExpr
            	    {
            	    set374=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_RANG_EXCL_OLD && input.LA(1)<=OP_RANGE) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set374));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_rangeExpr3195);
            	    addExpr375=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr375.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 102, rangeExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "rangeExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:449:1: addExpr : multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* ;
    public final FanParser.addExpr_return addExpr() throws RecognitionException {
        FanParser.addExpr_return retval = new FanParser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set377=null;
        FanParser.multExpr_return multExpr376 = null;

        FanParser.multExpr_return multExpr378 = null;


        Object set377_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:10: ( multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:12: multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_addExpr3210);
            multExpr376=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr376.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*
            loop110:
            do {
                int alt110=2;
                alt110 = dfa110.predict(input);
                switch (alt110) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:449:22: ( OP_PLUS | OP_MINUS ) multExpr
            	    {
            	    set377=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set377));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr3221);
            	    multExpr378=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr378.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 103, addExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class addAppend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addAppend"
    // src/net/colar/netbeans/fan/antlr/Fan.g:450:1: addAppend : ( OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.addAppend_return addAppend() throws RecognitionException {
        FanParser.addAppend_return retval = new FanParser.addAppend_return();
        retval.start = input.LT(1);
        int addAppend_StartIndex = input.index();
        Object root_0 = null;

        Token set379=null;
        FanParser.parenExpr_return parenExpr380 = null;


        Object set379_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:11: ( ( OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:13: ( OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set379=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set379));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_addAppend3239);
            parenExpr380=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr380.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 104, addAppend_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addAppend"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:451:1: multExpr : parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* ;
    public final FanParser.multExpr_return multExpr() throws RecognitionException {
        FanParser.multExpr_return retval = new FanParser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set382=null;
        FanParser.parenExpr_return parenExpr381 = null;

        FanParser.parenExpr_return parenExpr383 = null;


        Object set382_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:451:11: ( parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:451:13: parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parenExpr_in_multExpr3247);
            parenExpr381=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr381.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:451:23: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==OP_MULTI) ) {
                    int LA111_2 = input.LA(2);

                    if ( (LA111_2==ID) ) {
                        int LA111_4 = input.LA(3);

                        if ( (synpred166_Fan()) ) {
                            alt111=1;
                        }


                    }
                    else if ( ((LA111_2>=KW_THIS && LA111_2<=KW_SUPER)||(LA111_2>=KW_NULL && LA111_2<=KW_FALSE)||LA111_2==SP_PIPE||(LA111_2>=OP_PLUS && LA111_2<=OP_MULTI)||(LA111_2>=OP_CURRY && LA111_2<=OP_2MINUS)||(LA111_2>=URI && LA111_2<=AT)||(LA111_2>=NUMBER && LA111_2<=SQ_BRACKET_L)||LA111_2==PAR_L) ) {
                        alt111=1;
                    }


                }
                else if ( ((LA111_0>=OP_DIV && LA111_0<=OP_MOD)) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:451:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
            	    {
            	    set382=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_MULTI && input.LA(1)<=OP_MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set382));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_parenExpr_in_multExpr3262);
            	    parenExpr383=parenExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr383.getTree());

            	    }
            	    break;

            	default :
            	    break loop111;
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
            if ( state.backtracking>0 ) { memoize(input, 105, multExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class parenExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parenExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:452:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );
    public final FanParser.parenExpr_return parenExpr() throws RecognitionException {
        FanParser.parenExpr_return retval = new FanParser.parenExpr_return();
        retval.start = input.LT(1);
        int parenExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.castExpr_return castExpr384 = null;

        FanParser.groupedExpr_return groupedExpr385 = null;

        FanParser.unaryExpr_return unaryExpr386 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:12: ( castExpr | groupedExpr | unaryExpr )
            int alt112=3;
            alt112 = dfa112.predict(input);
            switch (alt112) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:452:14: castExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_castExpr_in_parenExpr3273);
                    castExpr384=castExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpr384.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:452:25: groupedExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_groupedExpr_in_parenExpr3277);
                    groupedExpr385=groupedExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, groupedExpr385.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:452:39: unaryExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpr_in_parenExpr3281);
                    unaryExpr386=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr386.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 106, parenExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parenExpr"

    public static class castExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "castExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:454:1: castExpr : {...}? parL type parR parenExpr -> ^( AST_CAST parL type parR parenExpr ) ;
    public final FanParser.castExpr_return castExpr() throws RecognitionException {
        FanParser.castExpr_return retval = new FanParser.castExpr_return();
        retval.start = input.LT(1);
        int castExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL387 = null;

        FanParser.type_return type388 = null;

        FanParser.parR_return parR389 = null;

        FanParser.parenExpr_return parenExpr390 = null;


        RewriteRuleSubtreeStream stream_parL=new RewriteRuleSubtreeStream(adaptor,"rule parL");
        RewriteRuleSubtreeStream stream_parenExpr=new RewriteRuleSubtreeStream(adaptor,"rule parenExpr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_parR=new RewriteRuleSubtreeStream(adaptor,"rule parR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:454:11: ({...}? parL type parR parenExpr -> ^( AST_CAST parL type parR parenExpr ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:454:13: {...}? parL type parR parenExpr
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "castExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_castExpr3292);
            parL387=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL387.getTree());
            pushFollow(FOLLOW_type_in_castExpr3294);
            type388=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type388.getTree());
            pushFollow(FOLLOW_parR_in_castExpr3296);
            parR389=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR389.getTree());
            pushFollow(FOLLOW_parenExpr_in_castExpr3298);
            parenExpr390=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpr.add(parenExpr390.getTree());


            // AST REWRITE
            // elements: parR, parenExpr, type, parL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 455:6: -> ^( AST_CAST parL type parR parenExpr )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:455:9: ^( AST_CAST parL type parR parenExpr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CAST, "AST_CAST"), root_1);

                adaptor.addChild(root_1, stream_parL.nextTree());
                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_parR.nextTree());
                adaptor.addChild(root_1, stream_parenExpr.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 107, castExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "castExpr"

    public static class groupedExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupedExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:457:1: groupedExpr : parL expr parR ( termChain )* ;
    public final FanParser.groupedExpr_return groupedExpr() throws RecognitionException {
        FanParser.groupedExpr_return retval = new FanParser.groupedExpr_return();
        retval.start = input.LT(1);
        int groupedExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL391 = null;

        FanParser.expr_return expr392 = null;

        FanParser.parR_return parR393 = null;

        FanParser.termChain_return termChain394 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:457:14: ( parL expr parR ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:457:16: parL expr parR ( termChain )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parL_in_groupedExpr3326);
            parL391=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL391.getTree());
            pushFollow(FOLLOW_expr_in_groupedExpr3328);
            expr392=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr392.getTree());
            pushFollow(FOLLOW_parR_in_groupedExpr3330);
            parR393=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR393.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:457:31: ( termChain )*
            loop113:
            do {
                int alt113=2;
                alt113 = dfa113.predict(input);
                switch (alt113) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_groupedExpr3332);
            	    termChain394=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, termChain394.getTree());

            	    }
            	    break;

            	default :
            	    break loop113;
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
            if ( state.backtracking>0 ) { memoize(input, 108, groupedExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "groupedExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:458:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );
    public final FanParser.unaryExpr_return unaryExpr() throws RecognitionException {
        FanParser.unaryExpr_return retval = new FanParser.unaryExpr_return();
        retval.start = input.LT(1);
        int unaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.prefixExpr_return prefixExpr395 = null;

        FanParser.postfixExpr_return postfixExpr396 = null;

        FanParser.termExpr_return termExpr397 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:458:12: ( prefixExpr | postfixExpr | termExpr )
            int alt114=3;
            alt114 = dfa114.predict(input);
            switch (alt114) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:458:14: prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prefixExpr_in_unaryExpr3341);
                    prefixExpr395=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr395.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:458:27: postfixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpr_in_unaryExpr3345);
                    postfixExpr396=postfixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpr396.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:458:41: termExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_termExpr_in_unaryExpr3349);
                    termExpr397=termExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr397.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 109, unaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExpr"

    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:460:1: prefixExpr : ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.prefixExpr_return prefixExpr() throws RecognitionException {
        FanParser.prefixExpr_return retval = new FanParser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set398=null;
        FanParser.parenExpr_return parenExpr399 = null;


        Object set398_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:460:13: ( ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:460:15: ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set398=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS)||(input.LA(1)>=OP_CURRY && input.LA(1)<=OP_2MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set398));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_prefixExpr3384);
            parenExpr399=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr399.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 110, prefixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixExpr"

    public static class postfixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:461:1: postfixExpr : termExpr ( OP_2PLUS | OP_2MINUS ) ;
    public final FanParser.postfixExpr_return postfixExpr() throws RecognitionException {
        FanParser.postfixExpr_return retval = new FanParser.postfixExpr_return();
        retval.start = input.LT(1);
        int postfixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set401=null;
        FanParser.termExpr_return termExpr400 = null;


        Object set401_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:461:14: ( termExpr ( OP_2PLUS | OP_2MINUS ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:461:16: termExpr ( OP_2PLUS | OP_2MINUS )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_termExpr_in_postfixExpr3393);
            termExpr400=termExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr400.getTree());
            set401=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_2PLUS && input.LA(1)<=OP_2MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set401));
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
            if ( state.backtracking>0 ) { memoize(input, 111, postfixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "postfixExpr"

    public static class termExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:462:1: termExpr : termBase ( termChain )* -> ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) ) ;
    public final FanParser.termExpr_return termExpr() throws RecognitionException {
        FanParser.termExpr_return retval = new FanParser.termExpr_return();
        retval.start = input.LT(1);
        int termExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.termBase_return termBase402 = null;

        FanParser.termChain_return termChain403 = null;


        RewriteRuleSubtreeStream stream_termBase=new RewriteRuleSubtreeStream(adaptor,"rule termBase");
        RewriteRuleSubtreeStream stream_termChain=new RewriteRuleSubtreeStream(adaptor,"rule termChain");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:11: ( termBase ( termChain )* -> ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:13: termBase ( termChain )*
            {
            pushFollow(FOLLOW_termBase_in_termExpr3410);
            termBase402=termBase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_termBase.add(termBase402.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:22: ( termChain )*
            loop115:
            do {
                int alt115=2;
                alt115 = dfa115.predict(input);
                switch (alt115) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_termExpr3412);
            	    termChain403=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_termChain.add(termChain403.getTree());

            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);



            // AST REWRITE
            // elements: termChain, termBase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 463:4: -> ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:463:7: ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TERM_EXPR, "AST_TERM_EXPR"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:463:23: ^( AST_CHILD termBase )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_termBase.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:463:45: ^( AST_CHILD ( termChain )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                // src/net/colar/netbeans/fan/antlr/Fan.g:463:57: ( termChain )*
                while ( stream_termChain.hasNext() ) {
                    adaptor.addChild(root_2, stream_termChain.nextTree());

                }
                stream_termChain.reset();

                adaptor.addChild(root_1, root_2);
                }

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
            if ( state.backtracking>0 ) { memoize(input, 112, termExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termExpr"

    public static class termBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:465:1: termBase : ( idExprReq | literal | typeBase | id );
    public final FanParser.termBase_return termBase() throws RecognitionException {
        FanParser.termBase_return retval = new FanParser.termBase_return();
        retval.start = input.LT(1);
        int termBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq404 = null;

        FanParser.literal_return literal405 = null;

        FanParser.typeBase_return typeBase406 = null;

        FanParser.id_return id407 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:465:11: ( idExprReq | literal | typeBase | id )
            int alt116=4;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:13: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_termBase3444);
                    idExprReq404=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq404.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:25: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_termBase3448);
                    literal405=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal405.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:35: typeBase
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeBase_in_termBase3452);
                    typeBase406=typeBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeBase406.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:46: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_termBase3456);
                    id407=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id407.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 113, termBase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termBase"

    public static class typeBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:466:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );
    public final FanParser.typeBase_return typeBase() throws RecognitionException {
        FanParser.typeBase_return retval = new FanParser.typeBase_return();
        retval.start = input.LT(1);
        int typeBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeLiteral_return typeLiteral408 = null;

        FanParser.slotLiteral_return slotLiteral409 = null;

        FanParser.namedSuper_return namedSuper410 = null;

        FanParser.staticCall_return staticCall411 = null;

        FanParser.dsl_return dsl412 = null;

        FanParser.closure_return closure413 = null;

        FanParser.simple_return simple414 = null;

        FanParser.ctorBlock_return ctorBlock415 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:466:10: ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock )
            int alt117=8;
            alt117 = dfa117.predict(input);
            switch (alt117) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:466:12: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_typeBase3463);
                    typeLiteral408=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral408.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:466:26: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_typeBase3467);
                    slotLiteral409=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral409.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:466:40: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_typeBase3471);
                    namedSuper410=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper410.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:466:53: staticCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_staticCall_in_typeBase3475);
                    staticCall411=staticCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticCall411.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:467:19: dsl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dsl_in_typeBase3497);
                    dsl412=dsl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dsl412.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:467:25: closure
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_closure_in_typeBase3501);
                    closure413=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure413.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:467:35: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_typeBase3505);
                    simple414=simple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple414.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:467:44: ctorBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctorBlock_in_typeBase3509);
                    ctorBlock415=ctorBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorBlock415.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 114, typeBase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeBase"

    public static class ctorBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:468:1: ctorBlock : type itBlock -> ^( AST_CTOR_BLOCK type itBlock ) ;
    public final FanParser.ctorBlock_return ctorBlock() throws RecognitionException {
        FanParser.ctorBlock_return retval = new FanParser.ctorBlock_return();
        retval.start = input.LT(1);
        int ctorBlock_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type416 = null;

        FanParser.itBlock_return itBlock417 = null;


        RewriteRuleSubtreeStream stream_itBlock=new RewriteRuleSubtreeStream(adaptor,"rule itBlock");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:11: ( type itBlock -> ^( AST_CTOR_BLOCK type itBlock ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:13: type itBlock
            {
            pushFollow(FOLLOW_type_in_ctorBlock3516);
            type416=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type416.getTree());
            pushFollow(FOLLOW_itBlock_in_ctorBlock3518);
            itBlock417=itBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_itBlock.add(itBlock417.getTree());


            // AST REWRITE
            // elements: type, itBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 469:5: -> ^( AST_CTOR_BLOCK type itBlock )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:469:8: ^( AST_CTOR_BLOCK type itBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CTOR_BLOCK, "AST_CTOR_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_itBlock.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 115, ctorBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorBlock"

    public static class staticCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:470:1: staticCall : type DOT idExpr -> ^( AST_STATIC_CALL type ^( AST_CHILD idExpr ) ) ;
    public final FanParser.staticCall_return staticCall() throws RecognitionException {
        FanParser.staticCall_return retval = new FanParser.staticCall_return();
        retval.start = input.LT(1);
        int staticCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT419=null;
        FanParser.type_return type418 = null;

        FanParser.idExpr_return idExpr420 = null;


        Object DOT419_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_idExpr=new RewriteRuleSubtreeStream(adaptor,"rule idExpr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:470:12: ( type DOT idExpr -> ^( AST_STATIC_CALL type ^( AST_CHILD idExpr ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:470:14: type DOT idExpr
            {
            pushFollow(FOLLOW_type_in_staticCall3539);
            type418=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type418.getTree());
            DOT419=(Token)match(input,DOT,FOLLOW_DOT_in_staticCall3541); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT419);

            pushFollow(FOLLOW_idExpr_in_staticCall3543);
            idExpr420=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idExpr.add(idExpr420.getTree());


            // AST REWRITE
            // elements: type, idExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 471:5: -> ^( AST_STATIC_CALL type ^( AST_CHILD idExpr ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:471:8: ^( AST_STATIC_CALL type ^( AST_CHILD idExpr ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_STATIC_CALL, "AST_STATIC_CALL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:471:31: ^( AST_CHILD idExpr )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_idExpr.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
            if ( state.backtracking>0 ) { memoize(input, 116, staticCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticCall"

    public static class termChain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:473:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall );
    public final FanParser.termChain_return termChain() throws RecognitionException {
        FanParser.termChain_return retval = new FanParser.termChain_return();
        retval.start = input.LT(1);
        int termChain_StartIndex = input.index();
        Object root_0 = null;

        FanParser.dotCall_return dotCall421 = null;

        FanParser.dynCall_return dynCall422 = null;

        FanParser.safeDotCall_return safeDotCall423 = null;

        FanParser.safeDynCall_return safeDynCall424 = null;

        FanParser.indexExpr_return indexExpr425 = null;

        FanParser.callOp_return callOp426 = null;

        FanParser.itBlock_return itBlock427 = null;

        FanParser.incDotCall_return incDotCall428 = null;

        FanParser.incSafeDotCall_return incSafeDotCall429 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:473:12: ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall )
            int alt118=9;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:473:14: dotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotCall_in_termChain3570);
                    dotCall421=dotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotCall421.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:473:24: dynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dynCall_in_termChain3574);
                    dynCall422=dynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dynCall422.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:473:34: safeDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDotCall_in_termChain3578);
                    safeDotCall423=safeDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDotCall423.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:473:48: safeDynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDynCall_in_termChain3582);
                    safeDynCall424=safeDynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDynCall424.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:4: indexExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_indexExpr_in_termChain3589);
                    indexExpr425=indexExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpr425.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:16: callOp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_callOp_in_termChain3593);
                    callOp426=callOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callOp426.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:25: itBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_itBlock_in_termChain3597);
                    itBlock427=itBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itBlock427.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:35: incDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_incDotCall_in_termChain3601);
                    incDotCall428=incDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incDotCall428.getTree());

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:48: incSafeDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_incSafeDotCall_in_termChain3605);
                    incSafeDotCall429=incSafeDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incSafeDotCall429.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 117, termChain_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termChain"

    public static class dsl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dsl"
    // src/net/colar/netbeans/fan/antlr/Fan.g:475:1: dsl : simpleType DSL ;
    public final FanParser.dsl_return dsl() throws RecognitionException {
        FanParser.dsl_return retval = new FanParser.dsl_return();
        retval.start = input.LT(1);
        int dsl_StartIndex = input.index();
        Object root_0 = null;

        Token DSL431=null;
        FanParser.simpleType_return simpleType430 = null;


        Object DSL431_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:475:13: ( simpleType DSL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:475:15: simpleType DSL
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleType_in_dsl3620);
            simpleType430=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType430.getTree());
            DSL431=(Token)match(input,DSL,FOLLOW_DSL_in_dsl3622); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DSL431_tree = (Object)adaptor.create(DSL431);
            adaptor.addChild(root_0, DSL431_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 118, dsl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dsl"

    public static class incDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:477:1: incDotCall : DOT -> ^( AST_INC_DOTCALL ) ;
    public final FanParser.incDotCall_return incDotCall() throws RecognitionException {
        FanParser.incDotCall_return retval = new FanParser.incDotCall_return();
        retval.start = input.LT(1);
        int incDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT432=null;

        Object DOT432_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:477:12: ( DOT -> ^( AST_INC_DOTCALL ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:477:14: DOT
            {
            DOT432=(Token)match(input,DOT,FOLLOW_DOT_in_incDotCall3630); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT432);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 478:5: -> ^( AST_INC_DOTCALL )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:478:8: ^( AST_INC_DOTCALL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INC_DOTCALL, "AST_INC_DOTCALL"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 119, incDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "incDotCall"

    public static class incSafeDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incSafeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:479:1: incSafeDotCall : OP_SAFE_CALL -> ^( AST_INC_SAFEDOTCALL ) ;
    public final FanParser.incSafeDotCall_return incSafeDotCall() throws RecognitionException {
        FanParser.incSafeDotCall_return retval = new FanParser.incSafeDotCall_return();
        retval.start = input.LT(1);
        int incSafeDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFE_CALL433=null;

        Object OP_SAFE_CALL433_tree=null;
        RewriteRuleTokenStream stream_OP_SAFE_CALL=new RewriteRuleTokenStream(adaptor,"token OP_SAFE_CALL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:15: ( OP_SAFE_CALL -> ^( AST_INC_SAFEDOTCALL ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:17: OP_SAFE_CALL
            {
            OP_SAFE_CALL433=(Token)match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_incSafeDotCall3646); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_SAFE_CALL.add(OP_SAFE_CALL433);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 480:5: -> ^( AST_INC_SAFEDOTCALL )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:480:8: ^( AST_INC_SAFEDOTCALL )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INC_SAFEDOTCALL, "AST_INC_SAFEDOTCALL"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 120, incSafeDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "incSafeDotCall"

    public static class itBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "itBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:483:1: itBlock : ( bracketL itBlockContent bracketR ) -> ^( AST_IT_BLOCK bracketL ( itBlockContent )? bracketR ) ;
    public final FanParser.itBlock_return itBlock() throws RecognitionException {
        FanParser.itBlock_return retval = new FanParser.itBlock_return();
        retval.start = input.LT(1);
        int itBlock_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL434 = null;

        FanParser.itBlockContent_return itBlockContent435 = null;

        FanParser.bracketR_return bracketR436 = null;


        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_itBlockContent=new RewriteRuleSubtreeStream(adaptor,"rule itBlockContent");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:483:10: ( ( bracketL itBlockContent bracketR ) -> ^( AST_IT_BLOCK bracketL ( itBlockContent )? bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:483:12: ( bracketL itBlockContent bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:483:12: ( bracketL itBlockContent bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:483:13: bracketL itBlockContent bracketR
            {
            pushFollow(FOLLOW_bracketL_in_itBlock3667);
            bracketL434=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL434.getTree());
            pushFollow(FOLLOW_itBlockContent_in_itBlock3669);
            itBlockContent435=itBlockContent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_itBlockContent.add(itBlockContent435.getTree());
            pushFollow(FOLLOW_bracketR_in_itBlock3671);
            bracketR436=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR436.getTree());

            }



            // AST REWRITE
            // elements: bracketL, itBlockContent, bracketR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 484:5: -> ^( AST_IT_BLOCK bracketL ( itBlockContent )? bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:484:8: ^( AST_IT_BLOCK bracketL ( itBlockContent )? bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_IT_BLOCK, "AST_IT_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:484:32: ( itBlockContent )?
                if ( stream_itBlockContent.hasNext() ) {
                    adaptor.addChild(root_1, stream_itBlockContent.nextTree());

                }
                stream_itBlockContent.reset();
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
            if ( state.backtracking>0 ) { memoize(input, 121, itBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "itBlock"

    public static class itBlockContent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "itBlockContent"
    // src/net/colar/netbeans/fan/antlr/Fan.g:485:1: itBlockContent : ( stmt ( SP_COMMA )? ( SP_SEMI )? )* ;
    public final FanParser.itBlockContent_return itBlockContent() throws RecognitionException {
        FanParser.itBlockContent_return retval = new FanParser.itBlockContent_return();
        retval.start = input.LT(1);
        int itBlockContent_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA438=null;
        Token SP_SEMI439=null;
        FanParser.stmt_return stmt437 = null;


        Object SP_COMMA438_tree=null;
        Object SP_SEMI439_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:485:16: ( ( stmt ( SP_COMMA )? ( SP_SEMI )? )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:485:18: ( stmt ( SP_COMMA )? ( SP_SEMI )? )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:485:18: ( stmt ( SP_COMMA )? ( SP_SEMI )? )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( ((LA121_0>=KW_BREAK && LA121_0<=KW_TRY)||(LA121_0>=KW_THIS && LA121_0<=KW_SUPER)||(LA121_0>=KW_NULL && LA121_0<=KW_FALSE)||LA121_0==SP_PIPE||(LA121_0>=OP_PLUS && LA121_0<=OP_MULTI)||(LA121_0>=OP_CURRY && LA121_0<=OP_2MINUS)||(LA121_0>=ID && LA121_0<=AT)||(LA121_0>=NUMBER && LA121_0<=SQ_BRACKET_L)||LA121_0==PAR_L) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:485:19: stmt ( SP_COMMA )? ( SP_SEMI )?
            	    {
            	    pushFollow(FOLLOW_stmt_in_itBlockContent3697);
            	    stmt437=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt437.getTree());
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:485:24: ( SP_COMMA )?
            	    int alt119=2;
            	    int LA119_0 = input.LA(1);

            	    if ( (LA119_0==SP_COMMA) ) {
            	        alt119=1;
            	    }
            	    switch (alt119) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
            	            {
            	            SP_COMMA438=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_itBlockContent3699); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_COMMA438_tree = (Object)adaptor.create(SP_COMMA438);
            	            adaptor.addChild(root_0, SP_COMMA438_tree);
            	            }

            	            }
            	            break;

            	    }

            	    // src/net/colar/netbeans/fan/antlr/Fan.g:485:34: ( SP_SEMI )?
            	    int alt120=2;
            	    int LA120_0 = input.LA(1);

            	    if ( (LA120_0==SP_SEMI) ) {
            	        alt120=1;
            	    }
            	    switch (alt120) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
            	            {
            	            SP_SEMI439=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_itBlockContent3702); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_SEMI439_tree = (Object)adaptor.create(SP_SEMI439);
            	            adaptor.addChild(root_0, SP_SEMI439_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop121;
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
            if ( state.backtracking>0 ) { memoize(input, 122, itBlockContent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "itBlockContent"

    public static class dotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:486:1: dotCall : DOT idExpr -> ^( AST_DOT_CALL idExpr ) ;
    public final FanParser.dotCall_return dotCall() throws RecognitionException {
        FanParser.dotCall_return retval = new FanParser.dotCall_return();
        retval.start = input.LT(1);
        int dotCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT440=null;
        FanParser.idExpr_return idExpr441 = null;


        Object DOT440_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_idExpr=new RewriteRuleSubtreeStream(adaptor,"rule idExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:486:10: ( DOT idExpr -> ^( AST_DOT_CALL idExpr ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:486:12: DOT idExpr
            {
            DOT440=(Token)match(input,DOT,FOLLOW_DOT_in_dotCall3713); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT440);

            pushFollow(FOLLOW_idExpr_in_dotCall3715);
            idExpr441=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idExpr.add(idExpr441.getTree());


            // AST REWRITE
            // elements: idExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 487:5: -> ^( AST_DOT_CALL idExpr )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:487:8: ^( AST_DOT_CALL idExpr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_DOT_CALL, "AST_DOT_CALL"), root_1);

                adaptor.addChild(root_1, stream_idExpr.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 123, dotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotCall"

    public static class dynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:488:1: dynCall : OP_ARROW idExpr ;
    public final FanParser.dynCall_return dynCall() throws RecognitionException {
        FanParser.dynCall_return retval = new FanParser.dynCall_return();
        retval.start = input.LT(1);
        int dynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW442=null;
        FanParser.idExpr_return idExpr443 = null;


        Object OP_ARROW442_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:488:10: ( OP_ARROW idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:488:12: OP_ARROW idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW442=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_dynCall3735); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW442_tree = (Object)adaptor.create(OP_ARROW442);
            adaptor.addChild(root_0, OP_ARROW442_tree);
            }
            pushFollow(FOLLOW_idExpr_in_dynCall3737);
            idExpr443=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr443.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 124, dynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dynCall"

    public static class safeDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:489:1: safeDotCall : OP_SAFE_CALL idExpr -> ^( AST_SAFE_DOT_CALL idExpr ) ;
    public final FanParser.safeDotCall_return safeDotCall() throws RecognitionException {
        FanParser.safeDotCall_return retval = new FanParser.safeDotCall_return();
        retval.start = input.LT(1);
        int safeDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFE_CALL444=null;
        FanParser.idExpr_return idExpr445 = null;


        Object OP_SAFE_CALL444_tree=null;
        RewriteRuleTokenStream stream_OP_SAFE_CALL=new RewriteRuleTokenStream(adaptor,"token OP_SAFE_CALL");
        RewriteRuleSubtreeStream stream_idExpr=new RewriteRuleSubtreeStream(adaptor,"rule idExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:489:14: ( OP_SAFE_CALL idExpr -> ^( AST_SAFE_DOT_CALL idExpr ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:489:16: OP_SAFE_CALL idExpr
            {
            OP_SAFE_CALL444=(Token)match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_safeDotCall3745); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_SAFE_CALL.add(OP_SAFE_CALL444);

            pushFollow(FOLLOW_idExpr_in_safeDotCall3747);
            idExpr445=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idExpr.add(idExpr445.getTree());


            // AST REWRITE
            // elements: idExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 490:5: -> ^( AST_SAFE_DOT_CALL idExpr )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:490:8: ^( AST_SAFE_DOT_CALL idExpr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SAFE_DOT_CALL, "AST_SAFE_DOT_CALL"), root_1);

                adaptor.addChild(root_1, stream_idExpr.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 125, safeDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDotCall"

    public static class safeDynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:491:1: safeDynCall : OP_SAFEDYN_CALL idExpr ;
    public final FanParser.safeDynCall_return safeDynCall() throws RecognitionException {
        FanParser.safeDynCall_return retval = new FanParser.safeDynCall_return();
        retval.start = input.LT(1);
        int safeDynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFEDYN_CALL446=null;
        FanParser.idExpr_return idExpr447 = null;


        Object OP_SAFEDYN_CALL446_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:13: ( OP_SAFEDYN_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:15: OP_SAFEDYN_CALL idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_SAFEDYN_CALL446=(Token)match(input,OP_SAFEDYN_CALL,FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall3766); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_SAFEDYN_CALL446_tree = (Object)adaptor.create(OP_SAFEDYN_CALL446);
            adaptor.addChild(root_0, OP_SAFEDYN_CALL446_tree);
            }
            pushFollow(FOLLOW_idExpr_in_safeDynCall3768);
            idExpr447=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr447.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 126, safeDynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDynCall"

    public static class indexExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:496:1: indexExpr : ({...}? sq_bracketL expr sq_bracketR ) -> ^( AST_INDEX_EXPR sq_bracketL expr sq_bracketR ) ;
    public final FanParser.indexExpr_return indexExpr() throws RecognitionException {
        FanParser.indexExpr_return retval = new FanParser.indexExpr_return();
        retval.start = input.LT(1);
        int indexExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.sq_bracketL_return sq_bracketL448 = null;

        FanParser.expr_return expr449 = null;

        FanParser.sq_bracketR_return sq_bracketR450 = null;


        RewriteRuleSubtreeStream stream_sq_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketR");
        RewriteRuleSubtreeStream stream_sq_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:496:12: ( ({...}? sq_bracketL expr sq_bracketR ) -> ^( AST_INDEX_EXPR sq_bracketL expr sq_bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:496:14: ({...}? sq_bracketL expr sq_bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:496:14: ({...}? sq_bracketL expr sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:496:15: {...}? sq_bracketL expr sq_bracketR
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "indexExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_sq_bracketL_in_indexExpr3783);
            sq_bracketL448=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketL.add(sq_bracketL448.getTree());
            pushFollow(FOLLOW_expr_in_indexExpr3785);
            expr449=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr449.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_indexExpr3787);
            sq_bracketR450=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketR.add(sq_bracketR450.getTree());

            }



            // AST REWRITE
            // elements: expr, sq_bracketR, sq_bracketL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 497:5: -> ^( AST_INDEX_EXPR sq_bracketL expr sq_bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:497:8: ^( AST_INDEX_EXPR sq_bracketL expr sq_bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INDEX_EXPR, "AST_INDEX_EXPR"), root_1);

                adaptor.addChild(root_1, stream_sq_bracketL.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_sq_bracketR.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 127, indexExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "indexExpr"

    public static class callOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:499:1: callOp : {...}? parL ( args )? parR ( closure )* ;
    public final FanParser.callOp_return callOp() throws RecognitionException {
        FanParser.callOp_return retval = new FanParser.callOp_return();
        retval.start = input.LT(1);
        int callOp_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL451 = null;

        FanParser.args_return args452 = null;

        FanParser.parR_return parR453 = null;

        FanParser.closure_return closure454 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:499:9: ({...}? parL ( args )? parR ( closure )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:499:11: {...}? parL ( args )? parR ( closure )*
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callOp", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callOp3815);
            parL451=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL451.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:499:33: ( args )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( ((LA122_0>=KW_THIS && LA122_0<=KW_SUPER)||(LA122_0>=KW_NULL && LA122_0<=KW_FALSE)||LA122_0==SP_PIPE||(LA122_0>=OP_PLUS && LA122_0<=OP_MULTI)||(LA122_0>=OP_CURRY && LA122_0<=OP_2MINUS)||(LA122_0>=ID && LA122_0<=AT)||(LA122_0>=NUMBER && LA122_0<=SQ_BRACKET_L)||LA122_0==PAR_L) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callOp3817);
                    args452=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args452.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callOp3821);
            parR453=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR453.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:499:45: ( closure )*
            loop123:
            do {
                int alt123=2;
                alt123 = dfa123.predict(input);
                switch (alt123) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: closure
            	    {
            	    pushFollow(FOLLOW_closure_in_callOp3823);
            	    closure454=closure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure454.getTree());

            	    }
            	    break;

            	default :
            	    break loop123;
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
            if ( state.backtracking>0 ) { memoize(input, 128, callOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callOp"

    public static class closure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "closure"
    // src/net/colar/netbeans/fan/antlr/Fan.g:500:1: closure : ( funcType multiStmt ) -> ^( AST_SCOPE funcType multiStmt ) ;
    public final FanParser.closure_return closure() throws RecognitionException {
        FanParser.closure_return retval = new FanParser.closure_return();
        retval.start = input.LT(1);
        int closure_StartIndex = input.index();
        Object root_0 = null;

        FanParser.funcType_return funcType455 = null;

        FanParser.multiStmt_return multiStmt456 = null;


        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        RewriteRuleSubtreeStream stream_multiStmt=new RewriteRuleSubtreeStream(adaptor,"rule multiStmt");
        paraphrase.push("Closure");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:501:3: ( ( funcType multiStmt ) -> ^( AST_SCOPE funcType multiStmt ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:501:7: ( funcType multiStmt )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:501:7: ( funcType multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:501:8: funcType multiStmt
            {
            pushFollow(FOLLOW_funcType_in_closure3846);
            funcType455=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_funcType.add(funcType455.getTree());
            pushFollow(FOLLOW_multiStmt_in_closure3848);
            multiStmt456=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multiStmt.add(multiStmt456.getTree());

            }



            // AST REWRITE
            // elements: multiStmt, funcType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 502:5: -> ^( AST_SCOPE funcType multiStmt )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:502:7: ^( AST_SCOPE funcType multiStmt )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SCOPE, "AST_SCOPE"), root_1);

                adaptor.addChild(root_1, stream_funcType.nextTree());
                adaptor.addChild(root_1, stream_multiStmt.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 129, closure_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "closure"

    public static class idExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:504:1: idExpr : ( idExprReq | id );
    public final FanParser.idExpr_return idExpr() throws RecognitionException {
        FanParser.idExpr_return retval = new FanParser.idExpr_return();
        retval.start = input.LT(1);
        int idExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq457 = null;

        FanParser.id_return id458 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:504:10: ( idExprReq | id )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==OP_MULTI) ) {
                alt124=1;
            }
            else if ( (LA124_0==ID) ) {
                int LA124_2 = input.LA(2);

                if ( (synpred202_Fan()) ) {
                    alt124=1;
                }
                else if ( (true) ) {
                    alt124=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 124, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:504:12: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_idExpr3872);
                    idExprReq457=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq457.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:504:24: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_idExpr3876);
                    id458=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id458.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 130, idExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExpr"

    public static class idExprReq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExprReq"
    // src/net/colar/netbeans/fan/antlr/Fan.g:506:1: idExprReq : ( field | call );
    public final FanParser.idExprReq_return idExprReq() throws RecognitionException {
        FanParser.idExprReq_return retval = new FanParser.idExprReq_return();
        retval.start = input.LT(1);
        int idExprReq_StartIndex = input.index();
        Object root_0 = null;

        FanParser.field_return field459 = null;

        FanParser.call_return call460 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:506:11: ( field | call )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==OP_MULTI) ) {
                alt125=1;
            }
            else if ( (LA125_0==ID) ) {
                alt125=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:506:13: field
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_field_in_idExprReq3884);
                    field459=field();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field459.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:506:21: call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_idExprReq3888);
                    call460=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call460.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 131, idExprReq_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExprReq"

    public static class field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field"
    // src/net/colar/netbeans/fan/antlr/Fan.g:508:1: field : OP_MULTI ID ;
    public final FanParser.field_return field() throws RecognitionException {
        FanParser.field_return retval = new FanParser.field_return();
        retval.start = input.LT(1);
        int field_StartIndex = input.index();
        Object root_0 = null;

        Token OP_MULTI461=null;
        Token ID462=null;

        Object OP_MULTI461_tree=null;
        Object ID462_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:508:8: ( OP_MULTI ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:508:10: OP_MULTI ID
            {
            root_0 = (Object)adaptor.nil();

            OP_MULTI461=(Token)match(input,OP_MULTI,FOLLOW_OP_MULTI_in_field3897); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_MULTI461_tree = (Object)adaptor.create(OP_MULTI461);
            adaptor.addChild(root_0, OP_MULTI461_tree);
            }
            ID462=(Token)match(input,ID,FOLLOW_ID_in_field3899); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID462_tree = (Object)adaptor.create(ID462);
            adaptor.addChild(root_0, ID462_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 132, field_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "field"

    public static class call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // src/net/colar/netbeans/fan/antlr/Fan.g:510:1: call : ( id ( (p= callParams c= closure ) | p= callParams | c= closure ) ) -> ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) ) ;
    public final FanParser.call_return call() throws RecognitionException {
        FanParser.call_return retval = new FanParser.call_return();
        retval.start = input.LT(1);
        int call_StartIndex = input.index();
        Object root_0 = null;

        FanParser.callParams_return p = null;

        FanParser.closure_return c = null;

        FanParser.id_return id463 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_closure=new RewriteRuleSubtreeStream(adaptor,"rule closure");
        RewriteRuleSubtreeStream stream_callParams=new RewriteRuleSubtreeStream(adaptor,"rule callParams");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:510:7: ( ( id ( (p= callParams c= closure ) | p= callParams | c= closure ) ) -> ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:510:9: ( id ( (p= callParams c= closure ) | p= callParams | c= closure ) )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:510:9: ( id ( (p= callParams c= closure ) | p= callParams | c= closure ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:510:10: id ( (p= callParams c= closure ) | p= callParams | c= closure )
            {
            pushFollow(FOLLOW_id_in_call3911);
            id463=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id463.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:510:13: ( (p= callParams c= closure ) | p= callParams | c= closure )
            int alt126=3;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==PAR_L) ) {
                int LA126_1 = input.LA(2);

                if ( ((synpred204_Fan()&&(notAfterEol()))) ) {
                    alt126=1;
                }
                else if ( ((synpred205_Fan()&&(notAfterEol()))) ) {
                    alt126=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 126, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA126_0==SP_PIPE) ) {
                alt126=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:510:14: (p= callParams c= closure )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:510:14: (p= callParams c= closure )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:510:15: p= callParams c= closure
                    {
                    pushFollow(FOLLOW_callParams_in_call3917);
                    p=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callParams.add(p.getTree());
                    pushFollow(FOLLOW_closure_in_call3921);
                    c=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_closure.add(c.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:510:41: p= callParams
                    {
                    pushFollow(FOLLOW_callParams_in_call3928);
                    p=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callParams.add(p.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:510:56: c= closure
                    {
                    pushFollow(FOLLOW_closure_in_call3934);
                    c=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_closure.add(c.getTree());

                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: id, p, c
            // token labels: 
            // rule labels: retval, c, p
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"rule p",p!=null?p.tree:null);

            root_0 = (Object)adaptor.nil();
            // 511:4: -> ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:511:7: ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CALL, "AST_CALL"), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:511:21: ^( AST_CHILD ( $p)? ( $c)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                // src/net/colar/netbeans/fan/antlr/Fan.g:511:33: ( $p)?
                if ( stream_p.hasNext() ) {
                    adaptor.addChild(root_2, stream_p.nextTree());

                }
                stream_p.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:511:37: ( $c)?
                if ( stream_c.hasNext() ) {
                    adaptor.addChild(root_2, stream_c.nextTree());

                }
                stream_c.reset();

                adaptor.addChild(root_1, root_2);
                }

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
            if ( state.backtracking>0 ) { memoize(input, 133, call_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class callParams_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callParams"
    // src/net/colar/netbeans/fan/antlr/Fan.g:513:1: callParams : {...}? parL ( args )? parR ;
    public final FanParser.callParams_return callParams() throws RecognitionException {
        FanParser.callParams_return retval = new FanParser.callParams_return();
        retval.start = input.LT(1);
        int callParams_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL464 = null;

        FanParser.args_return args465 = null;

        FanParser.parR_return parR466 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:513:12: ({...}? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:513:14: {...}? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callParams", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callParams3969);
            parL464=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL464.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:513:36: ( args )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( ((LA127_0>=KW_THIS && LA127_0<=KW_SUPER)||(LA127_0>=KW_NULL && LA127_0<=KW_FALSE)||LA127_0==SP_PIPE||(LA127_0>=OP_PLUS && LA127_0<=OP_MULTI)||(LA127_0>=OP_CURRY && LA127_0<=OP_2MINUS)||(LA127_0>=ID && LA127_0<=AT)||(LA127_0>=NUMBER && LA127_0<=SQ_BRACKET_L)||LA127_0==PAR_L) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callParams3971);
                    args465=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args465.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callParams3974);
            parR466=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR466.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 134, callParams_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callParams"

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // src/net/colar/netbeans/fan/antlr/Fan.g:514:1: args : expr ( SP_COMMA expr )* ;
    public final FanParser.args_return args() throws RecognitionException {
        FanParser.args_return retval = new FanParser.args_return();
        retval.start = input.LT(1);
        int args_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA468=null;
        FanParser.expr_return expr467 = null;

        FanParser.expr_return expr469 = null;


        Object SP_COMMA468_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:514:8: ( expr ( SP_COMMA expr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:514:10: expr ( SP_COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_args3983);
            expr467=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr467.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:514:15: ( SP_COMMA expr )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==SP_COMMA) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:514:16: SP_COMMA expr
            	    {
            	    SP_COMMA468=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_args3986); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA468_tree = (Object)adaptor.create(SP_COMMA468);
            	    adaptor.addChild(root_0, SP_COMMA468_tree);
            	    }
            	    pushFollow(FOLLOW_expr_in_args3989);
            	    expr469=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr469.getTree());

            	    }
            	    break;

            	default :
            	    break loop128;
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
            if ( state.backtracking>0 ) { memoize(input, 135, args_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:516:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple );
    public final FanParser.literal_return literal() throws RecognitionException {
        FanParser.literal_return retval = new FanParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        Object root_0 = null;

        Token KW_NULL470=null;
        Token KW_THIS471=null;
        Token KW_SUPER472=null;
        Token KW_IT473=null;
        Token KW_TRUE474=null;
        Token KW_FALSE475=null;
        Token URI477=null;
        Token CHAR479=null;
        FanParser.strs_return strs476 = null;

        FanParser.number_return number478 = null;

        FanParser.namedSuper_return namedSuper480 = null;

        FanParser.slotLiteral_return slotLiteral481 = null;

        FanParser.typeLiteral_return typeLiteral482 = null;

        FanParser.list_return list483 = null;

        FanParser.map_return map484 = null;

        FanParser.symbLiteral_return symbLiteral485 = null;

        FanParser.simple_return simple486 = null;


        Object KW_NULL470_tree=null;
        Object KW_THIS471_tree=null;
        Object KW_SUPER472_tree=null;
        Object KW_IT473_tree=null;
        Object KW_TRUE474_tree=null;
        Object KW_FALSE475_tree=null;
        Object URI477_tree=null;
        Object CHAR479_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:516:10: ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple )
            int alt129=17;
            alt129 = dfa129.predict(input);
            switch (alt129) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:516:12: KW_NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NULL470=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_literal4000); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NULL470_tree = (Object)adaptor.create(KW_NULL470);
                    adaptor.addChild(root_0, KW_NULL470_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:516:22: KW_THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_THIS471=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_literal4004); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_THIS471_tree = (Object)adaptor.create(KW_THIS471);
                    adaptor.addChild(root_0, KW_THIS471_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:516:32: KW_SUPER
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_SUPER472=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_literal4008); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_SUPER472_tree = (Object)adaptor.create(KW_SUPER472);
                    adaptor.addChild(root_0, KW_SUPER472_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:516:43: KW_IT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_IT473=(Token)match(input,KW_IT,FOLLOW_KW_IT_in_literal4012); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_IT473_tree = (Object)adaptor.create(KW_IT473);
                    adaptor.addChild(root_0, KW_IT473_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:516:51: KW_TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_TRUE474=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_literal4016); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_TRUE474_tree = (Object)adaptor.create(KW_TRUE474);
                    adaptor.addChild(root_0, KW_TRUE474_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:516:61: KW_FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FALSE475=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_literal4020); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FALSE475_tree = (Object)adaptor.create(KW_FALSE475);
                    adaptor.addChild(root_0, KW_FALSE475_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:516:72: strs
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_strs_in_literal4024);
                    strs476=strs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, strs476.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:516:79: URI
                    {
                    root_0 = (Object)adaptor.nil();

                    URI477=(Token)match(input,URI,FOLLOW_URI_in_literal4028); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI477_tree = (Object)adaptor.create(URI477);
                    adaptor.addChild(root_0, URI477_tree);
                    }

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:517:4: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_literal4035);
                    number478=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number478.getTree());

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:517:13: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR479=(Token)match(input,CHAR,FOLLOW_CHAR_in_literal4039); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR479_tree = (Object)adaptor.create(CHAR479);
                    adaptor.addChild(root_0, CHAR479_tree);
                    }

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:517:20: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_literal4043);
                    namedSuper480=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper480.getTree());

                    }
                    break;
                case 12 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:518:4: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_literal4050);
                    slotLiteral481=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral481.getTree());

                    }
                    break;
                case 13 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:518:18: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_literal4054);
                    typeLiteral482=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral482.getTree());

                    }
                    break;
                case 14 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:518:32: list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_in_literal4058);
                    list483=list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list483.getTree());

                    }
                    break;
                case 15 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:518:39: map
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_in_literal4062);
                    map484=map();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map484.getTree());

                    }
                    break;
                case 16 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:518:45: symbLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_symbLiteral_in_literal4066);
                    symbLiteral485=symbLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbLiteral485.getTree());

                    }
                    break;
                case 17 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:518:59: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_literal4070);
                    simple486=simple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple486.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 136, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class strs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "strs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:519:1: strs : (qs= QUOTSTR | s= STR ) -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:519:7: ( (qs= QUOTSTR | s= STR ) -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:519:9: (qs= QUOTSTR | s= STR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:519:9: (qs= QUOTSTR | s= STR )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==QUOTSTR) ) {
                alt130=1;
            }
            else if ( (LA130_0==STR) ) {
                alt130=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:519:10: qs= QUOTSTR
                    {
                    qs=(Token)match(input,QUOTSTR,FOLLOW_QUOTSTR_in_strs4081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUOTSTR.add(qs);


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:519:23: s= STR
                    {
                    s=(Token)match(input,STR,FOLLOW_STR_in_strs4087); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STR.add(s);


                    }
                    break;

            }



            // AST REWRITE
            // elements: qs, s
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
            // 520:5: -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )?
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:520:8: ( ^( AST_STR $s) )?
                if ( stream_s.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:520:8: ^( AST_STR $s)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_STR, "AST_STR"), root_1);

                    adaptor.addChild(root_1, stream_s.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_s.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:520:23: ( ^( AST_STR $qs) )?
                if ( stream_qs.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:520:23: ^( AST_STR $qs)
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
            if ( state.backtracking>0 ) { memoize(input, 137, strs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "strs"

    public static class typeLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:522:1: typeLiteral : ( type {...}? OP_POUND ) -> ^( AST_SCOPE ^( AST_TYPE_LIT type OP_POUND ) ) ;
    public final FanParser.typeLiteral_return typeLiteral() throws RecognitionException {
        FanParser.typeLiteral_return retval = new FanParser.typeLiteral_return();
        retval.start = input.LT(1);
        int typeLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND488=null;
        FanParser.type_return type487 = null;


        Object OP_POUND488_tree=null;
        RewriteRuleTokenStream stream_OP_POUND=new RewriteRuleTokenStream(adaptor,"token OP_POUND");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:522:13: ( ( type {...}? OP_POUND ) -> ^( AST_SCOPE ^( AST_TYPE_LIT type OP_POUND ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:522:17: ( type {...}? OP_POUND )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:522:17: ( type {...}? OP_POUND )
            // src/net/colar/netbeans/fan/antlr/Fan.g:522:18: type {...}? OP_POUND
            {
            pushFollow(FOLLOW_type_in_typeLiteral4121);
            type487=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type487.getTree());
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "typeLiteral", "notAfterEol()");
            }
            OP_POUND488=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_typeLiteral4125); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_POUND.add(OP_POUND488);


            }



            // AST REWRITE
            // elements: type, OP_POUND
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 523:5: -> ^( AST_SCOPE ^( AST_TYPE_LIT type OP_POUND ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:523:8: ^( AST_SCOPE ^( AST_TYPE_LIT type OP_POUND ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SCOPE, "AST_SCOPE"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:523:20: ^( AST_TYPE_LIT type OP_POUND )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE_LIT, "AST_TYPE_LIT"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());
                adaptor.addChild(root_2, stream_OP_POUND.nextNode());

                adaptor.addChild(root_1, root_2);
                }

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
            if ( state.backtracking>0 ) { memoize(input, 138, typeLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeLiteral"

    public static class slotLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slotLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:524:1: slotLiteral : ( ( type )? OP_POUND {...}? id ) -> ^( AST_SLOT_LIT ( type )? OP_POUND id ) ;
    public final FanParser.slotLiteral_return slotLiteral() throws RecognitionException {
        FanParser.slotLiteral_return retval = new FanParser.slotLiteral_return();
        retval.start = input.LT(1);
        int slotLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND490=null;
        FanParser.type_return type489 = null;

        FanParser.id_return id491 = null;


        Object OP_POUND490_tree=null;
        RewriteRuleTokenStream stream_OP_POUND=new RewriteRuleTokenStream(adaptor,"token OP_POUND");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:524:13: ( ( ( type )? OP_POUND {...}? id ) -> ^( AST_SLOT_LIT ( type )? OP_POUND id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:524:17: ( ( type )? OP_POUND {...}? id )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:524:17: ( ( type )? OP_POUND {...}? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:524:18: ( type )? OP_POUND {...}? id
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:524:18: ( type )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==SP_PIPE||LA131_0==ID||LA131_0==SQ_BRACKET_L) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_slotLiteral4154);
                    type489=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type489.getTree());

                    }
                    break;

            }

            OP_POUND490=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_slotLiteral4157); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_POUND.add(OP_POUND490);

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "slotLiteral", "notAfterEol()");
            }
            pushFollow(FOLLOW_id_in_slotLiteral4161);
            id491=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id491.getTree());

            }



            // AST REWRITE
            // elements: id, type, OP_POUND
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 525:5: -> ^( AST_SLOT_LIT ( type )? OP_POUND id )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:525:8: ^( AST_SLOT_LIT ( type )? OP_POUND id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SLOT_LIT, "AST_SLOT_LIT"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:525:23: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                adaptor.addChild(root_1, stream_OP_POUND.nextNode());
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
            if ( state.backtracking>0 ) { memoize(input, 139, slotLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slotLiteral"

    public static class symbLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:526:1: symbLiteral : ( AT (id1= ( id SP_COLON SP_COLON ) )? id ) -> ^( AST_SYMBOL AT ( $id1)? id ) ;
    public final FanParser.symbLiteral_return symbLiteral() throws RecognitionException {
        FanParser.symbLiteral_return retval = new FanParser.symbLiteral_return();
        retval.start = input.LT(1);
        int symbLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token id1=null;
        Token AT492=null;
        Token SP_COLON494=null;
        Token SP_COLON495=null;
        FanParser.id_return id493 = null;

        FanParser.id_return id496 = null;


        Object id1_tree=null;
        Object AT492_tree=null;
        Object SP_COLON494_tree=null;
        Object SP_COLON495_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_SP_COLON=new RewriteRuleTokenStream(adaptor,"token SP_COLON");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:526:13: ( ( AT (id1= ( id SP_COLON SP_COLON ) )? id ) -> ^( AST_SYMBOL AT ( $id1)? id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:526:17: ( AT (id1= ( id SP_COLON SP_COLON ) )? id )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:526:17: ( AT (id1= ( id SP_COLON SP_COLON ) )? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:526:18: AT (id1= ( id SP_COLON SP_COLON ) )? id
            {
            AT492=(Token)match(input,AT,FOLLOW_AT_in_symbLiteral4189); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AT.add(AT492);

            // src/net/colar/netbeans/fan/antlr/Fan.g:526:24: (id1= ( id SP_COLON SP_COLON ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==ID) ) {
                int LA132_1 = input.LA(2);

                if ( (LA132_1==SP_COLON) ) {
                    int LA132_3 = input.LA(3);

                    if ( (LA132_3==SP_COLON) ) {
                        alt132=1;
                    }
                }
            }
            switch (alt132) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: id1= ( id SP_COLON SP_COLON )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:526:25: ( id SP_COLON SP_COLON )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:526:26: id SP_COLON SP_COLON
                    {
                    pushFollow(FOLLOW_id_in_symbLiteral4194);
                    id493=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id493.getTree());
                    SP_COLON494=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_symbLiteral4196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SP_COLON.add(SP_COLON494);

                    SP_COLON495=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_symbLiteral4198); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SP_COLON.add(SP_COLON495);


                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_symbLiteral4202);
            id496=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id496.getTree());

            }



            // AST REWRITE
            // elements: id1, id, AT
            // token labels: id1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 527:5: -> ^( AST_SYMBOL AT ( $id1)? id )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:527:8: ^( AST_SYMBOL AT ( $id1)? id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SYMBOL, "AST_SYMBOL"), root_1);

                adaptor.addChild(root_1, stream_AT.nextNode());
                // src/net/colar/netbeans/fan/antlr/Fan.g:527:24: ( $id1)?
                if ( stream_id1.hasNext() ) {
                    adaptor.addChild(root_1, stream_id1.nextNode());

                }
                stream_id1.reset();
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
            if ( state.backtracking>0 ) { memoize(input, 140, symbLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "symbLiteral"

    public static class namedSuper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namedSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:528:1: namedSuper : ( simpleType DOT KW_SUPER ) -> ^( AST_NAMED_SUPER simpleType DOT KW_SUPER ) ;
    public final FanParser.namedSuper_return namedSuper() throws RecognitionException {
        FanParser.namedSuper_return retval = new FanParser.namedSuper_return();
        retval.start = input.LT(1);
        int namedSuper_StartIndex = input.index();
        Object root_0 = null;

        Token DOT498=null;
        Token KW_SUPER499=null;
        FanParser.simpleType_return simpleType497 = null;


        Object DOT498_tree=null;
        Object KW_SUPER499_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_KW_SUPER=new RewriteRuleTokenStream(adaptor,"token KW_SUPER");
        RewriteRuleSubtreeStream stream_simpleType=new RewriteRuleSubtreeStream(adaptor,"rule simpleType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:528:13: ( ( simpleType DOT KW_SUPER ) -> ^( AST_NAMED_SUPER simpleType DOT KW_SUPER ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:528:15: ( simpleType DOT KW_SUPER )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:528:15: ( simpleType DOT KW_SUPER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:528:16: simpleType DOT KW_SUPER
            {
            pushFollow(FOLLOW_simpleType_in_namedSuper4230);
            simpleType497=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleType.add(simpleType497.getTree());
            DOT498=(Token)match(input,DOT,FOLLOW_DOT_in_namedSuper4232); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT498);

            KW_SUPER499=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_namedSuper4234); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SUPER.add(KW_SUPER499);


            }



            // AST REWRITE
            // elements: KW_SUPER, simpleType, DOT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 529:5: -> ^( AST_NAMED_SUPER simpleType DOT KW_SUPER )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:529:8: ^( AST_NAMED_SUPER simpleType DOT KW_SUPER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_NAMED_SUPER, "AST_NAMED_SUPER"), root_1);

                adaptor.addChild(root_1, stream_simpleType.nextTree());
                adaptor.addChild(root_1, stream_DOT.nextNode());
                adaptor.addChild(root_1, stream_KW_SUPER.nextNode());

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
            if ( state.backtracking>0 ) { memoize(input, 141, namedSuper_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "namedSuper"

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // src/net/colar/netbeans/fan/antlr/Fan.g:530:1: list : ( ( type {...}?)? sq_bracketL listItems sq_bracketR ) -> ^( AST_LIST ( type )? sq_bracketL listItems sq_bracketR ) ;
    public final FanParser.list_return list() throws RecognitionException {
        FanParser.list_return retval = new FanParser.list_return();
        retval.start = input.LT(1);
        int list_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type500 = null;

        FanParser.sq_bracketL_return sq_bracketL501 = null;

        FanParser.listItems_return listItems502 = null;

        FanParser.sq_bracketR_return sq_bracketR503 = null;


        RewriteRuleSubtreeStream stream_listItems=new RewriteRuleSubtreeStream(adaptor,"rule listItems");
        RewriteRuleSubtreeStream stream_sq_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketR");
        RewriteRuleSubtreeStream stream_sq_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketL");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:530:8: ( ( ( type {...}?)? sq_bracketL listItems sq_bracketR ) -> ^( AST_LIST ( type )? sq_bracketL listItems sq_bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:530:10: ( ( type {...}?)? sq_bracketL listItems sq_bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:530:10: ( ( type {...}?)? sq_bracketL listItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:530:11: ( type {...}?)? sq_bracketL listItems sq_bracketR
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:530:11: ( type {...}?)?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==SQ_BRACKET_L) ) {
                int LA133_1 = input.LA(2);

                if ( (synpred228_Fan()) ) {
                    alt133=1;
                }
            }
            else if ( (LA133_0==SP_PIPE||LA133_0==ID) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:530:12: type {...}?
                    {
                    pushFollow(FOLLOW_type_in_list4262);
                    type500=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type500.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "list", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_list4268);
            sq_bracketL501=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketL.add(sq_bracketL501.getTree());
            pushFollow(FOLLOW_listItems_in_list4270);
            listItems502=listItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_listItems.add(listItems502.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_list4272);
            sq_bracketR503=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketR.add(sq_bracketR503.getTree());

            }



            // AST REWRITE
            // elements: type, sq_bracketR, sq_bracketL, listItems
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 531:5: -> ^( AST_LIST ( type )? sq_bracketL listItems sq_bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:531:8: ^( AST_LIST ( type )? sq_bracketL listItems sq_bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_LIST, "AST_LIST"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:531:19: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                adaptor.addChild(root_1, stream_sq_bracketL.nextTree());
                adaptor.addChild(root_1, stream_listItems.nextTree());
                adaptor.addChild(root_1, stream_sq_bracketR.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 142, list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class listItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:532:1: listItems : ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA );
    public final FanParser.listItems_return listItems() throws RecognitionException {
        FanParser.listItems_return retval = new FanParser.listItems_return();
        retval.start = input.LT(1);
        int listItems_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA505=null;
        Token SP_COMMA507=null;
        Token SP_COMMA508=null;
        FanParser.expr_return expr504 = null;

        FanParser.expr_return expr506 = null;


        Object SP_COMMA505_tree=null;
        Object SP_COMMA507_tree=null;
        Object SP_COMMA508_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:532:12: ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA )
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( ((LA136_0>=KW_THIS && LA136_0<=KW_SUPER)||(LA136_0>=KW_NULL && LA136_0<=KW_FALSE)||LA136_0==SP_PIPE||(LA136_0>=OP_PLUS && LA136_0<=OP_MULTI)||(LA136_0>=OP_CURRY && LA136_0<=OP_2MINUS)||(LA136_0>=ID && LA136_0<=AT)||(LA136_0>=NUMBER && LA136_0<=SQ_BRACKET_L)||LA136_0==PAR_L) ) {
                alt136=1;
            }
            else if ( (LA136_0==SP_COMMA) ) {
                alt136=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }
            switch (alt136) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:532:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:532:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:532:15: expr ( SP_COMMA expr )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_listItems4301);
                    expr504=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr504.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:532:20: ( SP_COMMA expr )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==SP_COMMA) ) {
                            int LA134_1 = input.LA(2);

                            if ( ((LA134_1>=KW_THIS && LA134_1<=KW_SUPER)||(LA134_1>=KW_NULL && LA134_1<=KW_FALSE)||LA134_1==SP_PIPE||(LA134_1>=OP_PLUS && LA134_1<=OP_MULTI)||(LA134_1>=OP_CURRY && LA134_1<=OP_2MINUS)||(LA134_1>=ID && LA134_1<=AT)||(LA134_1>=NUMBER && LA134_1<=SQ_BRACKET_L)||LA134_1==PAR_L) ) {
                                alt134=1;
                            }


                        }


                        switch (alt134) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:532:21: SP_COMMA expr
                    	    {
                    	    SP_COMMA505=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems4304); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA505_tree = (Object)adaptor.create(SP_COMMA505);
                    	    adaptor.addChild(root_0, SP_COMMA505_tree);
                    	    }
                    	    pushFollow(FOLLOW_expr_in_listItems4306);
                    	    expr506=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr506.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:532:38: ( SP_COMMA )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==SP_COMMA) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA507=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems4311); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SP_COMMA507_tree = (Object)adaptor.create(SP_COMMA507);
                            adaptor.addChild(root_0, SP_COMMA507_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:532:51: SP_COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COMMA508=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems4317); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COMMA508_tree = (Object)adaptor.create(SP_COMMA508);
                    adaptor.addChild(root_0, SP_COMMA508_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 143, listItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listItems"

    public static class map_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map"
    // src/net/colar/netbeans/fan/antlr/Fan.g:533:1: map : ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR ) -> ^( AST_MAP ( mapType )? sq_bracketL mapItems sq_bracketR ) ;
    public final FanParser.map_return map() throws RecognitionException {
        FanParser.map_return retval = new FanParser.map_return();
        retval.start = input.LT(1);
        int map_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mapType_return mapType509 = null;

        FanParser.sq_bracketL_return sq_bracketL510 = null;

        FanParser.mapItems_return mapItems511 = null;

        FanParser.sq_bracketR_return sq_bracketR512 = null;


        RewriteRuleSubtreeStream stream_sq_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketR");
        RewriteRuleSubtreeStream stream_sq_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketL");
        RewriteRuleSubtreeStream stream_mapItems=new RewriteRuleSubtreeStream(adaptor,"rule mapItems");
        RewriteRuleSubtreeStream stream_mapType=new RewriteRuleSubtreeStream(adaptor,"rule mapType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:533:7: ( ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR ) -> ^( AST_MAP ( mapType )? sq_bracketL mapItems sq_bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:533:9: ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:533:9: ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:533:10: ( mapType {...}?)? sq_bracketL mapItems sq_bracketR
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:533:10: ( mapType {...}?)?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==SQ_BRACKET_L) ) {
                int LA137_1 = input.LA(2);

                if ( (synpred232_Fan()) ) {
                    alt137=1;
                }
            }
            else if ( (LA137_0==SP_PIPE||LA137_0==ID) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:533:11: mapType {...}?
                    {
                    pushFollow(FOLLOW_mapType_in_map4328);
                    mapType509=mapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_mapType.add(mapType509.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "map", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_map4334);
            sq_bracketL510=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketL.add(sq_bracketL510.getTree());
            pushFollow(FOLLOW_mapItems_in_map4336);
            mapItems511=mapItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mapItems.add(mapItems511.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_map4338);
            sq_bracketR512=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketR.add(sq_bracketR512.getTree());

            }



            // AST REWRITE
            // elements: mapItems, sq_bracketL, sq_bracketR, mapType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 534:5: -> ^( AST_MAP ( mapType )? sq_bracketL mapItems sq_bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:534:8: ^( AST_MAP ( mapType )? sq_bracketL mapItems sq_bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MAP, "AST_MAP"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:534:18: ( mapType )?
                if ( stream_mapType.hasNext() ) {
                    adaptor.addChild(root_1, stream_mapType.nextTree());

                }
                stream_mapType.reset();
                adaptor.addChild(root_1, stream_sq_bracketL.nextTree());
                adaptor.addChild(root_1, stream_mapItems.nextTree());
                adaptor.addChild(root_1, stream_sq_bracketR.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 144, map_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "map"

    public static class mapItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:535:1: mapItems : ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON );
    public final FanParser.mapItems_return mapItems() throws RecognitionException {
        FanParser.mapItems_return retval = new FanParser.mapItems_return();
        retval.start = input.LT(1);
        int mapItems_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA514=null;
        Token SP_COMMA516=null;
        Token SP_COLON517=null;
        FanParser.mapPair_return mapPair513 = null;

        FanParser.mapPair_return mapPair515 = null;


        Object SP_COMMA514_tree=null;
        Object SP_COMMA516_tree=null;
        Object SP_COLON517_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:535:11: ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( ((LA140_0>=KW_THIS && LA140_0<=KW_SUPER)||(LA140_0>=KW_NULL && LA140_0<=KW_FALSE)||LA140_0==SP_PIPE||(LA140_0>=OP_PLUS && LA140_0<=OP_MULTI)||(LA140_0>=OP_CURRY && LA140_0<=OP_2MINUS)||(LA140_0>=ID && LA140_0<=AT)||(LA140_0>=NUMBER && LA140_0<=SQ_BRACKET_L)||LA140_0==PAR_L) ) {
                alt140=1;
            }
            else if ( (LA140_0==SP_COLON) ) {
                alt140=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:535:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:535:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:535:14: mapPair ( SP_COMMA mapPair )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_mapPair_in_mapItems4367);
                    mapPair513=mapPair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair513.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:535:22: ( SP_COMMA mapPair )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==SP_COMMA) ) {
                            int LA138_1 = input.LA(2);

                            if ( ((LA138_1>=KW_THIS && LA138_1<=KW_SUPER)||(LA138_1>=KW_NULL && LA138_1<=KW_FALSE)||LA138_1==SP_PIPE||(LA138_1>=OP_PLUS && LA138_1<=OP_MULTI)||(LA138_1>=OP_CURRY && LA138_1<=OP_2MINUS)||(LA138_1>=ID && LA138_1<=AT)||(LA138_1>=NUMBER && LA138_1<=SQ_BRACKET_L)||LA138_1==PAR_L) ) {
                                alt138=1;
                            }


                        }


                        switch (alt138) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:535:23: SP_COMMA mapPair
                    	    {
                    	    SP_COMMA514=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems4370); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA514_tree = (Object)adaptor.create(SP_COMMA514);
                    	    adaptor.addChild(root_0, SP_COMMA514_tree);
                    	    }
                    	    pushFollow(FOLLOW_mapPair_in_mapItems4372);
                    	    mapPair515=mapPair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair515.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:535:42: ( SP_COMMA )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==SP_COMMA) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA516=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems4376); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SP_COMMA516_tree = (Object)adaptor.create(SP_COMMA516);
                            adaptor.addChild(root_0, SP_COMMA516_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:535:55: SP_COLON
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COLON517=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapItems4382); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLON517_tree = (Object)adaptor.create(SP_COLON517);
                    adaptor.addChild(root_0, SP_COLON517_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 145, mapItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapItems"

    public static class mapPair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapPair"
    // src/net/colar/netbeans/fan/antlr/Fan.g:536:1: mapPair : expr SP_COLON expr ;
    public final FanParser.mapPair_return mapPair() throws RecognitionException {
        FanParser.mapPair_return retval = new FanParser.mapPair_return();
        retval.start = input.LT(1);
        int mapPair_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON519=null;
        FanParser.expr_return expr518 = null;

        FanParser.expr_return expr520 = null;


        Object SP_COLON519_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:536:10: ( expr SP_COLON expr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:536:12: expr SP_COLON expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_mapPair4390);
            expr518=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr518.getTree());
            SP_COLON519=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapPair4392); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON519_tree = (Object)adaptor.create(SP_COLON519);
            adaptor.addChild(root_0, SP_COLON519_tree);
            }
            pushFollow(FOLLOW_expr_in_mapPair4394);
            expr520=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr520.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 146, mapPair_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapPair"

    public static class simple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple"
    // src/net/colar/netbeans/fan/antlr/Fan.g:537:1: simple : type parL expr parR ;
    public final FanParser.simple_return simple() throws RecognitionException {
        FanParser.simple_return retval = new FanParser.simple_return();
        retval.start = input.LT(1);
        int simple_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type521 = null;

        FanParser.parL_return parL522 = null;

        FanParser.expr_return expr523 = null;

        FanParser.parR_return parR524 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:537:9: ( type parL expr parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:537:11: type parL expr parR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_simple4402);
            type521=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type521.getTree());
            pushFollow(FOLLOW_parL_in_simple4404);
            parL522=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL522.getTree());
            pushFollow(FOLLOW_expr_in_simple4406);
            expr523=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr523.getTree());
            pushFollow(FOLLOW_parR_in_simple4408);
            parR524=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR524.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 147, simple_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simple"

    public static class docs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "docs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:539:1: docs : d= ( ( DOC )* ) -> ^( AST_DOCS ( $d)? ) ;
    public final FanParser.docs_return docs() throws RecognitionException {
        FanParser.docs_return retval = new FanParser.docs_return();
        retval.start = input.LT(1);
        int docs_StartIndex = input.index();
        Object root_0 = null;

        Token d=null;
        Token DOC525=null;

        Object d_tree=null;
        Object DOC525_tree=null;
        RewriteRuleTokenStream stream_DOC=new RewriteRuleTokenStream(adaptor,"token DOC");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:539:7: (d= ( ( DOC )* ) -> ^( AST_DOCS ( $d)? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:539:9: d= ( ( DOC )* )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:539:11: ( ( DOC )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:539:12: ( DOC )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:539:12: ( DOC )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==DOC) ) {
                    int LA141_2 = input.LA(2);

                    if ( (synpred236_Fan()) ) {
                        alt141=1;
                    }


                }


                switch (alt141) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: DOC
            	    {
            	    DOC525=(Token)match(input,DOC,FOLLOW_DOC_in_docs4420); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOC.add(DOC525);


            	    }
            	    break;

            	default :
            	    break loop141;
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
            // 539:18: -> ^( AST_DOCS ( $d)? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:539:21: ^( AST_DOCS ( $d)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_DOCS, "AST_DOCS"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:539:32: ( $d)?
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
            if ( state.backtracking>0 ) { memoize(input, 148, docs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "docs"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // src/net/colar/netbeans/fan/antlr/Fan.g:541:1: number : ( OP_MINUS )? NUMBER ;
    public final FanParser.number_return number() throws RecognitionException {
        FanParser.number_return retval = new FanParser.number_return();
        retval.start = input.LT(1);
        int number_StartIndex = input.index();
        Object root_0 = null;

        Token OP_MINUS526=null;
        Token NUMBER527=null;

        Object OP_MINUS526_tree=null;
        Object NUMBER527_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:541:9: ( ( OP_MINUS )? NUMBER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:541:12: ( OP_MINUS )? NUMBER
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:541:12: ( OP_MINUS )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==OP_MINUS) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: OP_MINUS
                    {
                    OP_MINUS526=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_number4442); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_MINUS526_tree = (Object)adaptor.create(OP_MINUS526);
                    adaptor.addChild(root_0, OP_MINUS526_tree);
                    }

                    }
                    break;

            }

            NUMBER527=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_number4445); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER527_tree = (Object)adaptor.create(NUMBER527);
            adaptor.addChild(root_0, NUMBER527_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 149, number_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class facet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "facet"
    // src/net/colar/netbeans/fan/antlr/Fan.g:542:1: facet : AT id ( AS_EQUAL expr )? ;
    public final FanParser.facet_return facet() throws RecognitionException {
        FanParser.facet_return retval = new FanParser.facet_return();
        retval.start = input.LT(1);
        int facet_StartIndex = input.index();
        Object root_0 = null;

        Token AT528=null;
        Token AS_EQUAL530=null;
        FanParser.id_return id529 = null;

        FanParser.expr_return expr531 = null;


        Object AT528_tree=null;
        Object AS_EQUAL530_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:542:8: ( AT id ( AS_EQUAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:542:10: AT id ( AS_EQUAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            AT528=(Token)match(input,AT,FOLLOW_AT_in_facet4453); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT528_tree = (Object)adaptor.create(AT528);
            adaptor.addChild(root_0, AT528_tree);
            }
            pushFollow(FOLLOW_id_in_facet4455);
            id529=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id529.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:542:16: ( AS_EQUAL expr )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==AS_EQUAL) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:542:17: AS_EQUAL expr
                    {
                    AS_EQUAL530=(Token)match(input,AS_EQUAL,FOLLOW_AS_EQUAL_in_facet4458); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_EQUAL530_tree = (Object)adaptor.create(AS_EQUAL530);
                    adaptor.addChild(root_0, AS_EQUAL530_tree);
                    }
                    pushFollow(FOLLOW_expr_in_facet4460);
                    expr531=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr531.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 150, facet_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "facet"

    public static class eos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eos"
    // src/net/colar/netbeans/fan/antlr/Fan.g:545:1: eos : ( SP_SEMI | {...}?);
    public final FanParser.eos_return eos() throws RecognitionException {
        FanParser.eos_return retval = new FanParser.eos_return();
        retval.start = input.LT(1);
        int eos_StartIndex = input.index();
        Object root_0 = null;

        Token SP_SEMI532=null;

        Object SP_SEMI532_tree=null;

        paraphrase.push("Semicolumn or LineBreak");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 151) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:547:3: ( SP_SEMI | {...}?)
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==SP_SEMI) ) {
                int LA144_1 = input.LA(2);

                if ( (synpred239_Fan()) ) {
                    alt144=1;
                }
                else if ( ((lookupNL())) ) {
                    alt144=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 144, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA144_0==EOF||(LA144_0>=KW_BREAK && LA144_0<=KW_USING)||(LA144_0>=KW_RD_ONLY && LA144_0<=KW_FINAL)||(LA144_0>=KW_CLASS && LA144_0<=KW_ELSE)||(LA144_0>=KW_NULL && LA144_0<=KW_FALSE)||LA144_0==BRACKET_R||LA144_0==SP_COMMA||LA144_0==SP_PIPE||(LA144_0>=OP_PLUS && LA144_0<=OP_MULTI)||(LA144_0>=OP_CURRY && LA144_0<=OP_2MINUS)||(LA144_0>=ID && LA144_0<=SQ_BRACKET_L)||LA144_0==PAR_L) ) {
                alt144=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;
            }
            switch (alt144) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:547:5: SP_SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_SEMI532=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_eos4482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_SEMI532_tree = (Object)adaptor.create(SP_SEMI532);
                    adaptor.addChild(root_0, SP_SEMI532_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:547:15: {...}?
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
            if ( state.backtracking>0 ) { memoize(input, 151, eos_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "eos"

    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // src/net/colar/netbeans/fan/antlr/Fan.g:549:1: id : ID -> ^( AST_ID ID ) ;
    public final FanParser.id_return id() throws RecognitionException {
        FanParser.id_return retval = new FanParser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token ID533=null;

        Object ID533_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        paraphrase.push("Identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 152) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:551:3: ( ID -> ^( AST_ID ID ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:551:6: ID
            {
            ID533=(Token)match(input,ID,FOLLOW_ID_in_id4506); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID533);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 551:9: -> ^( AST_ID ID )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:551:12: ^( AST_ID ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

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
            if ( state.backtracking>0 ) { memoize(input, 152, id_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "id"

    public static class getter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:557:1: getter : t= ID {...}?;
    public final FanParser.getter_return getter() throws RecognitionException {
        FanParser.getter_return retval = new FanParser.getter_return();
        retval.start = input.LT(1);
        int getter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 153) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:557:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:557:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_getter4527); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 153, getter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "getter"

    public static class setter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:558:1: setter : t= ID {...}?;
    public final FanParser.setter_return setter() throws RecognitionException {
        FanParser.setter_return retval = new FanParser.setter_return();
        retval.start = input.LT(1);
        int setter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 154) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:558:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:558:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_setter4540); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 154, setter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "setter"

    public static class pod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pod"
    // src/net/colar/netbeans/fan/antlr/Fan.g:559:1: pod : t= ID {...}?;
    public final FanParser.pod_return pod() throws RecognitionException {
        FanParser.pod_return retval = new FanParser.pod_return();
        retval.start = input.LT(1);
        int pod_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 155) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:559:8: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:559:10: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_pod4554); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            t_tree = (Object)adaptor.create(t);
            adaptor.addChild(root_0, t_tree);
            }
            if ( !((t.getText().equals("pod"))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "pod", "t.getText().equals(\"pod\")");
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
            if ( state.backtracking>0 ) { memoize(input, 155, pod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pod"

    public static class bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:562:1: bracketL : BRACKET_L ;
    public final FanParser.bracketL_return bracketL() throws RecognitionException {
        FanParser.bracketL_return retval = new FanParser.bracketL_return();
        retval.start = input.LT(1);
        int bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_L534=null;

        Object BRACKET_L534_tree=null;

        paraphrase.push("{");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 156) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:564:3: ( BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:564:5: BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_L534=(Token)match(input,BRACKET_L,FOLLOW_BRACKET_L_in_bracketL4576); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_L534_tree = (Object)adaptor.create(BRACKET_L534);
            adaptor.addChild(root_0, BRACKET_L534_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 156, bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketL"

    public static class bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:565:1: bracketR : BRACKET_R ;
    public final FanParser.bracketR_return bracketR() throws RecognitionException {
        FanParser.bracketR_return retval = new FanParser.bracketR_return();
        retval.start = input.LT(1);
        int bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_R535=null;

        Object BRACKET_R535_tree=null;

        paraphrase.push("}");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 157) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:567:3: ( BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:567:5: BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_R535=(Token)match(input,BRACKET_R,FOLLOW_BRACKET_R_in_bracketR4594); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_R535_tree = (Object)adaptor.create(BRACKET_R535);
            adaptor.addChild(root_0, BRACKET_R535_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 157, bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketR"

    public static class sq_bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:568:1: sq_bracketL : SQ_BRACKET_L ;
    public final FanParser.sq_bracketL_return sq_bracketL() throws RecognitionException {
        FanParser.sq_bracketL_return retval = new FanParser.sq_bracketL_return();
        retval.start = input.LT(1);
        int sq_bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_L536=null;

        Object SQ_BRACKET_L536_tree=null;

        paraphrase.push("[");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 158) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:570:3: ( SQ_BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:570:5: SQ_BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_L536=(Token)match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_sq_bracketL4612); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQ_BRACKET_L536_tree = (Object)adaptor.create(SQ_BRACKET_L536);
            adaptor.addChild(root_0, SQ_BRACKET_L536_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 158, sq_bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketL"

    public static class sq_bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:571:1: sq_bracketR : SQ_BRACKET_R ;
    public final FanParser.sq_bracketR_return sq_bracketR() throws RecognitionException {
        FanParser.sq_bracketR_return retval = new FanParser.sq_bracketR_return();
        retval.start = input.LT(1);
        int sq_bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_R537=null;

        Object SQ_BRACKET_R537_tree=null;

        paraphrase.push("]");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 159) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:573:3: ( SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:573:5: SQ_BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_R537=(Token)match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_sq_bracketR4630); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQ_BRACKET_R537_tree = (Object)adaptor.create(SQ_BRACKET_R537);
            adaptor.addChild(root_0, SQ_BRACKET_R537_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 159, sq_bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketR"

    public static class parL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:574:1: parL : PAR_L ;
    public final FanParser.parL_return parL() throws RecognitionException {
        FanParser.parL_return retval = new FanParser.parL_return();
        retval.start = input.LT(1);
        int parL_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_L538=null;

        Object PAR_L538_tree=null;

        paraphrase.push("(");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 160) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:576:3: ( PAR_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:576:5: PAR_L
            {
            root_0 = (Object)adaptor.nil();

            PAR_L538=(Token)match(input,PAR_L,FOLLOW_PAR_L_in_parL4648); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAR_L538_tree = (Object)adaptor.create(PAR_L538);
            adaptor.addChild(root_0, PAR_L538_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 160, parL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parL"

    public static class parR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:577:1: parR : PAR_R ;
    public final FanParser.parR_return parR() throws RecognitionException {
        FanParser.parR_return retval = new FanParser.parR_return();
        retval.start = input.LT(1);
        int parR_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_R539=null;

        Object PAR_R539_tree=null;

        paraphrase.push(")");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 161) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:579:3: ( PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:579:5: PAR_R
            {
            root_0 = (Object)adaptor.nil();

            PAR_R539=(Token)match(input,PAR_R,FOLLOW_PAR_R_in_parR4666); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAR_R539_tree = (Object)adaptor.create(PAR_R539);
            adaptor.addChild(root_0, PAR_R539_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 161, parR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parR"

    // $ANTLR start synpred2_Fan
    public final void synpred2_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:262:19: ( podDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:262:19: podDef
        {
        pushFollow(FOLLOW_podDef_in_synpred2_Fan497);
        podDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Fan

    // $ANTLR start synpred17_Fan
    public final void synpred17_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:287:17: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:287:17: facet
        {
        pushFollow(FOLLOW_facet_in_synpred17_Fan863);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_Fan

    // $ANTLR start synpred19_Fan
    public final void synpred19_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:287:25: ( ( classFlags )* KW_CLASS )
        // src/net/colar/netbeans/fan/antlr/Fan.g:287:26: ( classFlags )* KW_CLASS
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:287:26: ( classFlags )*
        loop145:
        do {
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( ((LA145_0>=KW_CONST && LA145_0<=KW_STATIC)||LA145_0==KW_FINAL||(LA145_0>=KW_ABSTRACT && LA145_0<=KW_INTERNAL)) ) {
                alt145=1;
            }


            switch (alt145) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: classFlags
        	    {
        	    pushFollow(FOLLOW_classFlags_in_synpred19_Fan868);
        	    classFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop145;
            }
        } while (true);

        match(input,KW_CLASS,FOLLOW_KW_CLASS_in_synpred19_Fan871); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_Fan

    // $ANTLR start synpred21_Fan
    public final void synpred21_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:288:4: ( ( protection )? KW_ENUM )
        // src/net/colar/netbeans/fan/antlr/Fan.g:288:5: ( protection )? KW_ENUM
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:288:5: ( protection )?
        int alt146=2;
        int LA146_0 = input.LA(1);

        if ( ((LA146_0>=KW_PRIVATE && LA146_0<=KW_INTERNAL)) ) {
            alt146=1;
        }
        switch (alt146) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                {
                pushFollow(FOLLOW_protection_in_synpred21_Fan882);
                protection();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,KW_ENUM,FOLLOW_KW_ENUM_in_synpred21_Fan885); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_Fan

    // $ANTLR start synpred48_Fan
    public final void synpred48_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:28: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:28: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred48_Fan1396); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Fan

    // $ANTLR start synpred49_Fan
    public final void synpred49_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:25: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:25: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred49_Fan1431); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_Fan

    // $ANTLR start synpred50_Fan
    public final void synpred50_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:15: ( LIST_TYPE ( SP_QMARK )? )
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:15: LIST_TYPE ( SP_QMARK )?
        {
        match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_synpred50_Fan1429); if (state.failed) return ;
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:25: ( SP_QMARK )?
        int alt148=2;
        int LA148_0 = input.LA(1);

        if ( (LA148_0==SP_QMARK) ) {
            alt148=1;
        }
        switch (alt148) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                {
                match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred50_Fan1431); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred50_Fan

    // $ANTLR start synpred51_Fan
    public final void synpred51_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:319:12: ( mapType )
        // src/net/colar/netbeans/fan/antlr/Fan.g:319:12: mapType
        {
        pushFollow(FOLLOW_mapType_in_synpred51_Fan1441);
        mapType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_Fan

    // $ANTLR start synpred58_Fan
    public final void synpred58_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:324:6: ({...}? SP_COLON {...}? type )
        // src/net/colar/netbeans/fan/antlr/Fan.g:324:6: {...}? SP_COLON {...}? type
        {
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred58_Fan", "notAfterEol()");
        }
        match(input,SP_COLON,FOLLOW_SP_COLON_in_synpred58_Fan1509); if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred58_Fan", "notAfterEol()");
        }
        pushFollow(FOLLOW_type_in_synpred58_Fan1513);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_Fan

    // $ANTLR start synpred59_Fan
    public final void synpred59_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:324:56: ( sq_bracketR )
        // src/net/colar/netbeans/fan/antlr/Fan.g:324:56: sq_bracketR
        {
        pushFollow(FOLLOW_sq_bracketR_in_synpred59_Fan1517);
        sq_bracketR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_Fan

    // $ANTLR start synpred60_Fan
    public final void synpred60_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:329:29: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:329:30: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred60_Fan1578); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_Fan

    // $ANTLR start synpred62_Fan
    public final void synpred62_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:329:60: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:329:61: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred62_Fan1590); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_Fan

    // $ANTLR start synpred63_Fan
    public final void synpred63_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:25: ( type )
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:25: type
        {
        pushFollow(FOLLOW_type_in_synpred63_Fan1603);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_Fan

    // $ANTLR start synpred65_Fan
    public final void synpred65_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:334:19: ( formalFull )
        // src/net/colar/netbeans/fan/antlr/Fan.g:334:19: formalFull
        {
        pushFollow(FOLLOW_formalFull_in_synpred65_Fan1652);
        formalFull();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_Fan

    // $ANTLR start synpred66_Fan
    public final void synpred66_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:334:32: ( formalTypeOnly )
        // src/net/colar/netbeans/fan/antlr/Fan.g:334:32: formalTypeOnly
        {
        pushFollow(FOLLOW_formalTypeOnly_in_synpred66_Fan1656);
        formalTypeOnly();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_Fan

    // $ANTLR start synpred67_Fan
    public final void synpred67_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:338:13: ( KW_STATIC bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:338:14: KW_STATIC bracketL
        {
        match(input,KW_STATIC,FOLLOW_KW_STATIC_in_synpred67_Fan1705); if (state.failed) return ;
        pushFollow(FOLLOW_bracketL_in_synpred67_Fan1707);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_Fan

    // $ANTLR start synpred68_Fan
    public final void synpred68_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:339:11: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:339:11: facet
        {
        pushFollow(FOLLOW_facet_in_synpred68_Fan1721);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_Fan

    // $ANTLR start synpred70_Fan
    public final void synpred70_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:341:7: ( ( ctorFlags )* KW_NEW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:341:8: ( ctorFlags )* KW_NEW
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:341:8: ( ctorFlags )*
        loop151:
        do {
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( ((LA151_0>=KW_PRIVATE && LA151_0<=KW_INTERNAL)) ) {
                alt151=1;
            }


            switch (alt151) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ctorFlags
        	    {
        	    pushFollow(FOLLOW_ctorFlags_in_synpred70_Fan1738);
        	    ctorFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop151;
            }
        } while (true);

        match(input,KW_NEW,FOLLOW_KW_NEW_in_synpred70_Fan1741); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Fan

    // $ANTLR start synpred73_Fan
    public final void synpred73_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:342:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:342:8: ( methodFlags )* ( type | KW_VOID ) id parL
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:342:8: ( methodFlags )*
        loop152:
        do {
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( ((LA152_0>=KW_STATIC && LA152_0<=KW_NATIVE)||(LA152_0>=KW_OVERRIDE && LA152_0<=KW_FINAL)||(LA152_0>=KW_ABSTRACT && LA152_0<=KW_INTERNAL)||LA152_0==KW_ONCE) ) {
                alt152=1;
            }


            switch (alt152) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: methodFlags
        	    {
        	    pushFollow(FOLLOW_methodFlags_in_synpred73_Fan1755);
        	    methodFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop152;
            }
        } while (true);

        // src/net/colar/netbeans/fan/antlr/Fan.g:342:21: ( type | KW_VOID )
        int alt153=2;
        int LA153_0 = input.LA(1);

        if ( (LA153_0==SP_PIPE||LA153_0==ID||LA153_0==SQ_BRACKET_L) ) {
            alt153=1;
        }
        else if ( (LA153_0==KW_VOID) ) {
            alt153=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 153, 0, input);

            throw nvae;
        }
        switch (alt153) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:342:22: type
                {
                pushFollow(FOLLOW_type_in_synpred73_Fan1759);
                type();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:342:29: KW_VOID
                {
                match(input,KW_VOID,FOLLOW_KW_VOID_in_synpred73_Fan1763); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_id_in_synpred73_Fan1766);
        id();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_parL_in_synpred73_Fan1768);
        parL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_Fan

    // $ANTLR start synpred77_Fan
    public final void synpred77_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:29: ( getter )
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:29: getter
        {
        pushFollow(FOLLOW_getter_in_synpred77_Fan1853);
        getter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_Fan

    // $ANTLR start synpred79_Fan
    public final void synpred79_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:55: ( block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:350:55: block
        {
        pushFollow(FOLLOW_block_in_synpred79_Fan1863);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_Fan

    // $ANTLR start synpred82_Fan
    public final void synpred82_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:353:12: ( type id )
        // src/net/colar/netbeans/fan/antlr/Fan.g:353:13: type id
        {
        pushFollow(FOLLOW_type_in_synpred82_Fan1910);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_id_in_synpred82_Fan1912);
        id();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred82_Fan

    // $ANTLR start synpred105_Fan
    public final void synpred105_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:365:15: ( multiStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:365:16: multiStmt
        {
        pushFollow(FOLLOW_multiStmt_in_synpred105_Fan2170);
        multiStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_Fan

    // $ANTLR start synpred114_Fan
    public final void synpred114_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:377:6: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:377:7: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred114_Fan2364);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred114_Fan

    // $ANTLR start synpred125_Fan
    public final void synpred125_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:383:22: ( exprStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:383:22: exprStmt
        {
        pushFollow(FOLLOW_exprStmt_in_synpred125_Fan2461);
        exprStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_Fan

    // $ANTLR start synpred126_Fan
    public final void synpred126_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:385:15: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:385:15: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred126_Fan2478);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred126_Fan

    // $ANTLR start synpred130_Fan
    public final void synpred130_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:396:6: ( KW_ELSE block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:396:6: KW_ELSE block
        {
        match(input,KW_ELSE,FOLLOW_KW_ELSE_in_synpred130_Fan2596); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred130_Fan2598);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_Fan

    // $ANTLR start synpred131_Fan
    public final void synpred131_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:397:23: ( eos )
        // src/net/colar/netbeans/fan/antlr/Fan.g:397:23: eos
        {
        pushFollow(FOLLOW_eos_in_synpred131_Fan2610);
        eos();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred131_Fan

    // $ANTLR start synpred134_Fan
    public final void synpred134_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:403:17: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:403:18: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred134_Fan2706);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred134_Fan

    // $ANTLR start synpred135_Fan
    public final void synpred135_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:403:51: ( KW_CATCH )
        // src/net/colar/netbeans/fan/antlr/Fan.g:403:52: KW_CATCH
        {
        match(input,KW_CATCH,FOLLOW_KW_CATCH_in_synpred135_Fan2718); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred135_Fan

    // $ANTLR start synpred136_Fan
    public final void synpred136_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:403:74: ( KW_FINALLY )
        // src/net/colar/netbeans/fan/antlr/Fan.g:403:75: KW_FINALLY
        {
        match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_synpred136_Fan2727); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_Fan

    // $ANTLR start synpred138_Fan
    public final void synpred138_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:408:12: ( forInitDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:408:12: forInitDef
        {
        pushFollow(FOLLOW_forInitDef_in_synpred138_Fan2792);
        forInitDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred138_Fan

    // $ANTLR start synpred140_Fan
    public final void synpred140_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:14: ( catchDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:14: catchDef
        {
        pushFollow(FOLLOW_catchDef_in_synpred140_Fan2862);
        catchDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred140_Fan

    // $ANTLR start synpred141_Fan
    public final void synpred141_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:25: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:26: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred141_Fan2867);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred141_Fan

    // $ANTLR start synpred142_Fan
    public final void synpred142_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:420:25: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:420:26: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred142_Fan2926);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred142_Fan

    // $ANTLR start synpred162_Fan
    public final void synpred162_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:449:22: ( ( OP_PLUS | OP_MINUS ) multExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:449:22: ( OP_PLUS | OP_MINUS ) multExpr
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

        pushFollow(FOLLOW_multExpr_in_synpred162_Fan3221);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred162_Fan

    // $ANTLR start synpred166_Fan
    public final void synpred166_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:451:24: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:451:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
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

        pushFollow(FOLLOW_parenExpr_in_synpred166_Fan3262);
        parenExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred166_Fan

    // $ANTLR start synpred167_Fan
    public final void synpred167_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:452:14: ( castExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:452:14: castExpr
        {
        pushFollow(FOLLOW_castExpr_in_synpred167_Fan3273);
        castExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred167_Fan

    // $ANTLR start synpred168_Fan
    public final void synpred168_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:452:25: ( groupedExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:452:25: groupedExpr
        {
        pushFollow(FOLLOW_groupedExpr_in_synpred168_Fan3277);
        groupedExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred168_Fan

    // $ANTLR start synpred169_Fan
    public final void synpred169_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:457:31: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:457:31: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred169_Fan3332);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred169_Fan

    // $ANTLR start synpred170_Fan
    public final void synpred170_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:458:14: ( prefixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:458:14: prefixExpr
        {
        pushFollow(FOLLOW_prefixExpr_in_synpred170_Fan3341);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred170_Fan

    // $ANTLR start synpred171_Fan
    public final void synpred171_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:458:27: ( postfixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:458:27: postfixExpr
        {
        pushFollow(FOLLOW_postfixExpr_in_synpred171_Fan3345);
        postfixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred171_Fan

    // $ANTLR start synpred178_Fan
    public final void synpred178_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:462:22: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:462:22: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred178_Fan3412);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred178_Fan

    // $ANTLR start synpred179_Fan
    public final void synpred179_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:465:13: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:465:13: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred179_Fan3444);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred179_Fan

    // $ANTLR start synpred180_Fan
    public final void synpred180_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:465:25: ( literal )
        // src/net/colar/netbeans/fan/antlr/Fan.g:465:25: literal
        {
        pushFollow(FOLLOW_literal_in_synpred180_Fan3448);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred180_Fan

    // $ANTLR start synpred181_Fan
    public final void synpred181_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:465:35: ( typeBase )
        // src/net/colar/netbeans/fan/antlr/Fan.g:465:35: typeBase
        {
        pushFollow(FOLLOW_typeBase_in_synpred181_Fan3452);
        typeBase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred181_Fan

    // $ANTLR start synpred182_Fan
    public final void synpred182_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:12: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:12: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred182_Fan3463);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred182_Fan

    // $ANTLR start synpred183_Fan
    public final void synpred183_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:26: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:26: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred183_Fan3467);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred183_Fan

    // $ANTLR start synpred184_Fan
    public final void synpred184_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:40: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:40: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred184_Fan3471);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred184_Fan

    // $ANTLR start synpred185_Fan
    public final void synpred185_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:53: ( staticCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:53: staticCall
        {
        pushFollow(FOLLOW_staticCall_in_synpred185_Fan3475);
        staticCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred185_Fan

    // $ANTLR start synpred186_Fan
    public final void synpred186_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:19: ( dsl )
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:19: dsl
        {
        pushFollow(FOLLOW_dsl_in_synpred186_Fan3497);
        dsl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred186_Fan

    // $ANTLR start synpred187_Fan
    public final void synpred187_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:25: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:25: closure
        {
        pushFollow(FOLLOW_closure_in_synpred187_Fan3501);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred187_Fan

    // $ANTLR start synpred188_Fan
    public final void synpred188_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:35: ( simple )
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:35: simple
        {
        pushFollow(FOLLOW_simple_in_synpred188_Fan3505);
        simple();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred188_Fan

    // $ANTLR start synpred189_Fan
    public final void synpred189_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:473:14: ( dotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:473:14: dotCall
        {
        pushFollow(FOLLOW_dotCall_in_synpred189_Fan3570);
        dotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred189_Fan

    // $ANTLR start synpred191_Fan
    public final void synpred191_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:473:34: ( safeDotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:473:34: safeDotCall
        {
        pushFollow(FOLLOW_safeDotCall_in_synpred191_Fan3578);
        safeDotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred191_Fan

    // $ANTLR start synpred196_Fan
    public final void synpred196_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:474:35: ( incDotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:474:35: incDotCall
        {
        pushFollow(FOLLOW_incDotCall_in_synpred196_Fan3601);
        incDotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred196_Fan

    // $ANTLR start synpred201_Fan
    public final void synpred201_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:499:45: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:499:45: closure
        {
        pushFollow(FOLLOW_closure_in_synpred201_Fan3823);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred201_Fan

    // $ANTLR start synpred202_Fan
    public final void synpred202_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:504:12: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:504:12: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred202_Fan3872);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred202_Fan

    // $ANTLR start synpred204_Fan
    public final void synpred204_Fan_fragment() throws RecognitionException {   
        FanParser.callParams_return p = null;

        FanParser.closure_return c = null;


        // src/net/colar/netbeans/fan/antlr/Fan.g:510:14: ( (p= callParams c= closure ) )
        // src/net/colar/netbeans/fan/antlr/Fan.g:510:14: (p= callParams c= closure )
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:510:14: (p= callParams c= closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:510:15: p= callParams c= closure
        {
        pushFollow(FOLLOW_callParams_in_synpred204_Fan3917);
        p=callParams();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_closure_in_synpred204_Fan3921);
        c=closure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred204_Fan

    // $ANTLR start synpred205_Fan
    public final void synpred205_Fan_fragment() throws RecognitionException {   
        FanParser.callParams_return p = null;


        // src/net/colar/netbeans/fan/antlr/Fan.g:510:41: (p= callParams )
        // src/net/colar/netbeans/fan/antlr/Fan.g:510:41: p= callParams
        {
        pushFollow(FOLLOW_callParams_in_synpred205_Fan3928);
        p=callParams();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred205_Fan

    // $ANTLR start synpred218_Fan
    public final void synpred218_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:517:20: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:517:20: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred218_Fan4043);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred218_Fan

    // $ANTLR start synpred219_Fan
    public final void synpred219_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:518:4: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:518:4: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred219_Fan4050);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred219_Fan

    // $ANTLR start synpred220_Fan
    public final void synpred220_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:518:18: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:518:18: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred220_Fan4054);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred220_Fan

    // $ANTLR start synpred221_Fan
    public final void synpred221_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:518:32: ( list )
        // src/net/colar/netbeans/fan/antlr/Fan.g:518:32: list
        {
        pushFollow(FOLLOW_list_in_synpred221_Fan4058);
        list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred221_Fan

    // $ANTLR start synpred222_Fan
    public final void synpred222_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:518:39: ( map )
        // src/net/colar/netbeans/fan/antlr/Fan.g:518:39: map
        {
        pushFollow(FOLLOW_map_in_synpred222_Fan4062);
        map();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred222_Fan

    // $ANTLR start synpred228_Fan
    public final void synpred228_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:530:12: ( type {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:530:12: type {...}?
        {
        pushFollow(FOLLOW_type_in_synpred228_Fan4262);
        type();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred228_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred228_Fan

    // $ANTLR start synpred232_Fan
    public final void synpred232_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:533:11: ( mapType {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:533:11: mapType {...}?
        {
        pushFollow(FOLLOW_mapType_in_synpred232_Fan4328);
        mapType();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred232_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred232_Fan

    // $ANTLR start synpred236_Fan
    public final void synpred236_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:539:12: ( DOC )
        // src/net/colar/netbeans/fan/antlr/Fan.g:539:12: DOC
        {
        match(input,DOC,FOLLOW_DOC_in_synpred236_Fan4420); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred236_Fan

    // $ANTLR start synpred239_Fan
    public final void synpred239_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:547:5: ( SP_SEMI )
        // src/net/colar/netbeans/fan/antlr/Fan.g:547:5: SP_SEMI
        {
        match(input,SP_SEMI,FOLLOW_SP_SEMI_in_synpred239_Fan4482); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred239_Fan

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
    public final boolean synpred228_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred228_Fan_fragment(); // can never throw exception
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
    public final boolean synpred191_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred191_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred232_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred232_Fan_fragment(); // can never throw exception
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
    public final boolean synpred19_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_Fan_fragment(); // can never throw exception
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
    public final boolean synpred114_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_Fan_fragment(); // can never throw exception
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
    public final boolean synpred66_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_Fan_fragment(); // can never throw exception
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
    public final boolean synpred17_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_Fan_fragment(); // can never throw exception
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
    public final boolean synpred131_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred131_Fan_fragment(); // can never throw exception
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
    public final boolean synpred79_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_Fan_fragment(); // can never throw exception
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
    public final boolean synpred68_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_Fan_fragment(); // can never throw exception
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
    public final boolean synpred70_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred141_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred162_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred162_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred142_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred142_Fan_fragment(); // can never throw exception
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
    public final boolean synpred21_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Fan_fragment(); // can never throw exception
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
    public final boolean synpred65_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_Fan_fragment(); // can never throw exception
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
    public final boolean synpred82_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_Fan_fragment(); // can never throw exception
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
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA110 dfa110 = new DFA110(this);
    protected DFA112 dfa112 = new DFA112(this);
    protected DFA113 dfa113 = new DFA113(this);
    protected DFA114 dfa114 = new DFA114(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA117 dfa117 = new DFA117(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA123 dfa123 = new DFA123(this);
    protected DFA129 dfa129 = new DFA129(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\1\4\14\uffff";
    static final String DFA3_minS =
        "\1\24\2\0\12\uffff";
    static final String DFA3_maxS =
        "\1\u0085\2\0\12\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2\10\uffff";
    static final String DFA3_specialS =
        "\1\uffff\1\0\1\1\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\4\4\uffff\1\4\1\uffff\10\4\132\uffff\1\3\5\uffff\1\2\1\1",
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
            return "262:18: ( podDef | ( typeDef )* )";
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
        "\2\u0085\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\3\4\uffff\1\3\1\uffff\10\3\140\uffff\1\3\1\1",
            "\2\3\4\uffff\1\3\1\uffff\10\3\140\uffff\1\3\1\1",
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
            return "()* loopback of 262:28: ( typeDef )*";
        }
    }
    static final String DFA4_eotS =
        "\20\uffff";
    static final String DFA4_eofS =
        "\1\uffff\1\4\1\uffff\1\10\2\uffff\2\4\2\uffff\1\4\1\10\1\15\3\uffff";
    static final String DFA4_minS =
        "\2\21\1\176\1\21\1\uffff\1\u0088\2\21\1\uffff\1\136\3\21\1\uffff"+
        "\1\136\1\uffff";
    static final String DFA4_maxS =
        "\1\21\1\u0087\1\176\1\u0085\1\uffff\1\u0088\2\u0085\1\uffff\1\176"+
        "\2\u0085\1\u00a7\1\uffff\1\176\1\uffff";
    static final String DFA4_acceptS =
        "\4\uffff\1\4\3\uffff\1\1\4\uffff\1\2\1\uffff\1\3";
    static final String DFA4_specialS =
        "\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\103\uffff\1\4\26"+
            "\uffff\1\3\5\uffff\2\4\1\uffff\1\2",
            "\1\5",
            "\1\10\2\uffff\2\10\4\uffff\1\10\1\uffff\10\10\70\uffff\1\7"+
            "\1\6\11\uffff\1\10\26\uffff\1\11\5\uffff\2\10",
            "",
            "\1\12",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\103\uffff\1\4\26"+
            "\uffff\1\13\5\uffff\2\4",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\103\uffff\1\4\26"+
            "\uffff\1\14\5\uffff\2\4",
            "",
            "\1\4\37\uffff\1\10",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\103\uffff\1\4\26"+
            "\uffff\1\3\5\uffff\2\4",
            "\1\10\2\uffff\2\10\4\uffff\1\10\1\uffff\10\10\70\uffff\1\7"+
            "\1\6\11\uffff\1\10\26\uffff\1\11\5\uffff\2\10",
            "\1\15\1\17\1\uffff\2\15\4\uffff\1\15\1\uffff\10\15\103\uffff"+
            "\1\15\26\uffff\1\16\5\uffff\2\15\41\uffff\1\17",
            "",
            "\1\4\37\uffff\1\15",
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
            return "264:5: ( usingPod | usingType | usingAs | incUsing )";
        }
    }
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\1\uffff\1\4\4\uffff\1\11\1\uffff\1\13\4\uffff";
    static final String DFA6_minS =
        "\2\21\1\176\1\134\1\uffff\1\u0088\1\21\1\uffff\1\21\1\uffff\1\134"+
        "\1\uffff\1\134";
    static final String DFA6_maxS =
        "\1\21\1\u0087\2\176\1\uffff\1\u0088\1\u0085\1\uffff\1\u0085\1\uffff"+
        "\1\176\1\uffff\1\176";
    static final String DFA6_acceptS =
        "\4\uffff\1\1\2\uffff\1\4\1\uffff\1\3\1\uffff\1\2\1\uffff";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\103\uffff\1\4\26"+
            "\uffff\1\3\5\uffff\2\4\1\uffff\1\2",
            "\1\5",
            "\1\7\1\6\40\uffff\1\4",
            "",
            "\1\10",
            "\1\11\2\uffff\2\11\4\uffff\1\11\1\uffff\10\11\103\uffff\1\11"+
            "\26\uffff\1\12\5\uffff\2\11",
            "",
            "\1\13\2\uffff\2\13\4\uffff\1\13\1\uffff\10\13\103\uffff\1\13"+
            "\26\uffff\1\14\5\uffff\2\13",
            "",
            "\1\7\1\6\40\uffff\1\11",
            "",
            "\1\7\1\6\40\uffff\1\13"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "276:14: ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) )";
        }
    }
    static final String DFA14_eotS =
        "\13\uffff";
    static final String DFA14_eofS =
        "\13\uffff";
    static final String DFA14_minS =
        "\1\24\3\0\1\uffff\3\0\3\uffff";
    static final String DFA14_maxS =
        "\1\u0085\3\0\1\uffff\3\0\3\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\1\3\uffff\1\1\1\2\1\3";
    static final String DFA14_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\3\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\6\1\7\4\uffff\1\5\1\uffff\1\10\1\11\1\12\1\4\4\3\140\uffff"+
            "\1\2\1\1",
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "287:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                         
                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_0==DOC) ) {s = 1;}

                        else if ( (LA14_0==AT) ) {s = 2;}

                        else if ( ((LA14_0>=KW_PRIVATE && LA14_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA14_0==KW_ABSTRACT) && (synpred19_Fan())) {s = 4;}

                        else if ( (LA14_0==KW_FINAL) ) {s = 5;}

                        else if ( (LA14_0==KW_CONST) ) {s = 6;}

                        else if ( (LA14_0==KW_STATIC) ) {s = 7;}

                        else if ( (LA14_0==KW_CLASS) && (synpred19_Fan())) {s = 8;}

                        else if ( (LA14_0==KW_ENUM) && (synpred21_Fan())) {s = 9;}

                        else if ( (LA14_0==KW_MIXIN) ) {s = 10;}

                         
                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Fan()) ) {s = 8;}

                        else if ( (synpred21_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Fan()) ) {s = 8;}

                        else if ( (synpred21_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Fan()) ) {s = 8;}

                        else if ( (synpred21_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\23\uffff";
    static final String DFA52_eofS =
        "\23\uffff";
    static final String DFA52_minS =
        "\1\23\1\0\21\uffff";
    static final String DFA52_maxS =
        "\1\u0087\1\0\21\uffff";
    static final String DFA52_acceptS =
        "\2\uffff\1\2\17\uffff\1\1";
    static final String DFA52_specialS =
        "\1\uffff\1\0\21\uffff}>";
    static final String[] DFA52_transitionS = {
            "\2\2\1\1\5\2\4\uffff\7\2\77\uffff\1\2\30\uffff\1\2\5\uffff\2"+
            "\2\1\uffff\1\2",
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

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "338:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_1 = input.LA(1);

                         
                        int index52_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index52_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\22\uffff";
    static final String DFA51_eofS =
        "\22\uffff";
    static final String DFA51_minS =
        "\1\23\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA51_maxS =
        "\1\u0087\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA51_acceptS =
        "\4\uffff\1\1\4\uffff\1\2\5\uffff\1\3\2\uffff";
    static final String DFA51_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12"+
        "\1\13\1\14\3\uffff}>";
    static final String[] DFA51_transitionS = {
            "\2\17\1\10\1\12\1\17\1\6\1\5\1\13\4\uffff\1\7\4\3\1\4\1\11\77"+
            "\uffff\1\15\30\uffff\1\16\5\uffff\1\2\1\1\1\uffff\1\14",
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

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "340:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_0 = input.LA(1);

                         
                        int index51_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA51_0==DOC) ) {s = 1;}

                        else if ( (LA51_0==AT) ) {s = 2;}

                        else if ( ((LA51_0>=KW_PRIVATE && LA51_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA51_0==KW_NEW) && (synpred70_Fan())) {s = 4;}

                        else if ( (LA51_0==KW_VIRTUAL) ) {s = 5;}

                        else if ( (LA51_0==KW_OVERRIDE) ) {s = 6;}

                        else if ( (LA51_0==KW_ABSTRACT) ) {s = 7;}

                        else if ( (LA51_0==KW_STATIC) ) {s = 8;}

                        else if ( (LA51_0==KW_ONCE) && (synpred73_Fan())) {s = 9;}

                        else if ( (LA51_0==KW_NATIVE) ) {s = 10;}

                        else if ( (LA51_0==KW_FINAL) ) {s = 11;}

                        else if ( (LA51_0==SQ_BRACKET_L) ) {s = 12;}

                        else if ( (LA51_0==SP_PIPE) ) {s = 13;}

                        else if ( (LA51_0==ID) ) {s = 14;}

                        else if ( ((LA51_0>=KW_RD_ONLY && LA51_0<=KW_CONST)||LA51_0==KW_VOLATILE) ) {s = 15;}

                         
                        input.seek(index51_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_1 = input.LA(1);

                         
                        int index51_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Fan()) ) {s = 4;}

                        else if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_2 = input.LA(1);

                         
                        int index51_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Fan()) ) {s = 4;}

                        else if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA51_3 = input.LA(1);

                         
                        int index51_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Fan()) ) {s = 4;}

                        else if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA51_5 = input.LA(1);

                         
                        int index51_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA51_6 = input.LA(1);

                         
                        int index51_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA51_7 = input.LA(1);

                         
                        int index51_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA51_8 = input.LA(1);

                         
                        int index51_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA51_10 = input.LA(1);

                         
                        int index51_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA51_11 = input.LA(1);

                         
                        int index51_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA51_12 = input.LA(1);

                         
                        int index51_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA51_13 = input.LA(1);

                         
                        int index51_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA51_14 = input.LA(1);

                         
                        int index51_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index51_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\12\uffff";
    static final String DFA61_eofS =
        "\3\uffff\1\4\6\uffff";
    static final String DFA61_minS =
        "\1\145\2\uffff\1\4\1\uffff\1\0\4\uffff";
    static final String DFA61_maxS =
        "\1\u0087\2\uffff\1\u0089\1\uffff\1\0\4\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\2\1\1\uffff\1\2\1\uffff\4\1";
    static final String DFA61_specialS =
        "\1\2\2\uffff\1\0\1\uffff\1\1\4\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\2\30\uffff\1\3\10\uffff\1\1",
            "",
            "",
            "\15\4\2\uffff\10\4\4\uffff\12\4\2\uffff\4\4\55\uffff\1\6\1"+
            "\uffff\3\4\1\11\1\4\1\7\1\10\1\4\1\uffff\1\4\12\uffff\3\4\2"+
            "\uffff\4\4\3\uffff\1\5\11\4\1\uffff\1\4",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "353:11: ( ( type id )=> typeAndId | fieldId )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_3 = input.LA(1);

                         
                        int index61_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_3==EOF||(LA61_3>=KW_BREAK && LA61_3<=KW_FINALLY)||(LA61_3>=KW_RD_ONLY && LA61_3<=KW_FINAL)||(LA61_3>=KW_ABSTRACT && LA61_3<=KW_ELSE)||(LA61_3>=KW_NULL && LA61_3<=KW_FALSE)||(LA61_3>=BRACKET_L && LA61_3<=AS_INIT_VAL)||LA61_3==SP_COMMA||LA61_3==SP_PIPE||LA61_3==SP_SEMI||(LA61_3>=OP_PLUS && LA61_3<=OP_MULTI)||(LA61_3>=OP_CURRY && LA61_3<=OP_2MINUS)||(LA61_3>=URI && LA61_3<=SQ_BRACKET_L)||LA61_3==PAR_L) ) {s = 4;}

                        else if ( (LA61_3==ID) ) {s = 5;}

                        else if ( (LA61_3==SP_COLCOL) && (synpred82_Fan())) {s = 6;}

                        else if ( (LA61_3==SP_QMARK) && (synpred82_Fan())) {s = 7;}

                        else if ( (LA61_3==LIST_TYPE) && (synpred82_Fan())) {s = 8;}

                        else if ( (LA61_3==SP_COLON) && (synpred82_Fan())) {s = 9;}

                         
                        input.seek(index61_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_5 = input.LA(1);

                         
                        int index61_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index61_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==SQ_BRACKET_L) && (synpred82_Fan())) {s = 1;}

                        else if ( (LA61_0==SP_PIPE) && (synpred82_Fan())) {s = 2;}

                        else if ( (LA61_0==ID) ) {s = 3;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\37\uffff";
    static final String DFA79_eofS =
        "\37\uffff";
    static final String DFA79_minS =
        "\1\4\14\uffff\1\0\14\uffff\2\0\3\uffff";
    static final String DFA79_maxS =
        "\1\u0089\14\uffff\1\0\14\uffff\2\0\3\uffff";
    static final String DFA79_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\23\uffff\1\13";
    static final String DFA79_specialS =
        "\15\uffff\1\0\14\uffff\1\1\1\2\3\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\4\1\5\1\2\1\1\1\6\1\7\1\10\1\3\1\11\31\uffff\2\12\3\uffff"+
            "\4\12\66\uffff\1\33\14\uffff\3\12\2\uffff\4\12\3\uffff\1\15"+
            "\6\12\1\uffff\1\12\1\32\1\uffff\1\12",
            "",
            "",
            "",
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
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "381:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_13 = input.LA(1);

                         
                        int index79_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index79_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_26 = input.LA(1);

                         
                        int index79_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index79_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_27 = input.LA(1);

                         
                        int index79_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index79_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA80_eotS =
        "\65\uffff";
    static final String DFA80_eofS =
        "\1\1\64\uffff";
    static final String DFA80_minS =
        "\1\4\4\uffff\1\0\2\uffff\1\0\7\uffff\2\0\5\uffff\31\0\5\uffff";
    static final String DFA80_maxS =
        "\1\u0089\4\uffff\1\0\2\uffff\1\0\7\uffff\2\0\5\uffff\31\0\5\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\2\62\uffff\1\1";
    static final String DFA80_specialS =
        "\5\uffff\1\0\2\uffff\1\1\7\uffff\1\2\1\3\5\uffff\1\4\1\5\1\6\1\7"+
        "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
        "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\5\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\32\1\33\1\30\1\27\1\34\1\35\1\36\1\31\1\37\4\1\2\uffff\10"+
            "\1\4\uffff\7\1\1\44\1\45\1\1\2\uffff\1\43\1\46\1\47\1\50\60"+
            "\uffff\1\1\2\uffff\1\1\2\uffff\1\21\1\uffff\1\1\12\uffff\1\54"+
            "\1\41\1\42\2\uffff\4\54\3\uffff\1\5\1\53\1\56\1\51\1\52\1\57"+
            "\1\10\1\1\1\55\1\20\1\uffff\1\40",
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

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "()* loopback of 385:15: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_5 = input.LA(1);

                         
                        int index80_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_8 = input.LA(1);

                         
                        int index80_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA80_16 = input.LA(1);

                         
                        int index80_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA80_17 = input.LA(1);

                         
                        int index80_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_17);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA80_23 = input.LA(1);

                         
                        int index80_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA80_24 = input.LA(1);

                         
                        int index80_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_24);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA80_25 = input.LA(1);

                         
                        int index80_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_25);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA80_26 = input.LA(1);

                         
                        int index80_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_26);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA80_27 = input.LA(1);

                         
                        int index80_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_27);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA80_28 = input.LA(1);

                         
                        int index80_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_28);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA80_29 = input.LA(1);

                         
                        int index80_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_29);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA80_30 = input.LA(1);

                         
                        int index80_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_30);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA80_31 = input.LA(1);

                         
                        int index80_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_31);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA80_32 = input.LA(1);

                         
                        int index80_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred126_Fan()&&(notAfterEol()))||synpred126_Fan())) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_32);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA80_33 = input.LA(1);

                         
                        int index80_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_33);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA80_34 = input.LA(1);

                         
                        int index80_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_34);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA80_35 = input.LA(1);

                         
                        int index80_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_35);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA80_36 = input.LA(1);

                         
                        int index80_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_36);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA80_37 = input.LA(1);

                         
                        int index80_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_37);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA80_38 = input.LA(1);

                         
                        int index80_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_38);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA80_39 = input.LA(1);

                         
                        int index80_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_39);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA80_40 = input.LA(1);

                         
                        int index80_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_40);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA80_41 = input.LA(1);

                         
                        int index80_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_41);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA80_42 = input.LA(1);

                         
                        int index80_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_42);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA80_43 = input.LA(1);

                         
                        int index80_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_43);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA80_44 = input.LA(1);

                         
                        int index80_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_44);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA80_45 = input.LA(1);

                         
                        int index80_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_45);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA80_46 = input.LA(1);

                         
                        int index80_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_46);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA80_47 = input.LA(1);

                         
                        int index80_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_47);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\65\uffff";
    static final String DFA85_eofS =
        "\1\1\64\uffff";
    static final String DFA85_minS =
        "\1\4\3\uffff\1\0\2\uffff\1\0\7\uffff\2\0\16\uffff\20\0\6\uffff";
    static final String DFA85_maxS =
        "\1\u0089\3\uffff\1\0\2\uffff\1\0\7\uffff\2\0\16\uffff\20\0\6\uffff";
    static final String DFA85_acceptS =
        "\1\uffff\1\1\62\uffff\1\2";
    static final String DFA85_specialS =
        "\4\uffff\1\0\2\uffff\1\1\7\uffff\1\2\1\3\16\uffff\1\4\1\5\1\6\1"+
        "\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\6"+
        "\uffff}>";
    static final String[] DFA85_transitionS = {
            "\15\1\2\uffff\10\1\4\uffff\7\1\1\43\1\44\1\1\2\uffff\1\42\1"+
            "\45\1\46\1\47\60\uffff\1\1\2\uffff\1\1\2\uffff\1\20\1\uffff"+
            "\1\1\12\uffff\1\53\1\40\1\41\2\uffff\4\53\3\uffff\1\4\1\52\1"+
            "\55\1\50\1\51\1\56\1\7\1\1\1\54\1\17\1\uffff\1\37",
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

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "397:22: ( eos | expr eos )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_4 = input.LA(1);

                         
                        int index85_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA85_7 = input.LA(1);

                         
                        int index85_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA85_15 = input.LA(1);

                         
                        int index85_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA85_16 = input.LA(1);

                         
                        int index85_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA85_31 = input.LA(1);

                         
                        int index85_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred131_Fan()&&(lookupNL()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol())))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_31);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA85_32 = input.LA(1);

                         
                        int index85_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_32);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA85_33 = input.LA(1);

                         
                        int index85_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_33);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA85_34 = input.LA(1);

                         
                        int index85_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_34);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA85_35 = input.LA(1);

                         
                        int index85_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_35);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA85_36 = input.LA(1);

                         
                        int index85_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_36);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA85_37 = input.LA(1);

                         
                        int index85_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_37);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA85_38 = input.LA(1);

                         
                        int index85_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_38);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA85_39 = input.LA(1);

                         
                        int index85_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_39);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA85_40 = input.LA(1);

                         
                        int index85_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_40);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA85_41 = input.LA(1);

                         
                        int index85_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_41);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA85_42 = input.LA(1);

                         
                        int index85_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_42);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA85_43 = input.LA(1);

                         
                        int index85_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_43);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA85_44 = input.LA(1);

                         
                        int index85_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_44);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA85_45 = input.LA(1);

                         
                        int index85_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_45);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA85_46 = input.LA(1);

                         
                        int index85_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index85_46);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA92_eotS =
        "\26\uffff";
    static final String DFA92_eofS =
        "\26\uffff";
    static final String DFA92_minS =
        "\1\46\3\0\22\uffff";
    static final String DFA92_maxS =
        "\1\u0089\3\0\22\uffff";
    static final String DFA92_acceptS =
        "\4\uffff\1\2\20\uffff\1\1";
    static final String DFA92_specialS =
        "\1\uffff\1\0\1\1\1\2\22\uffff}>";
    static final String[] DFA92_transitionS = {
            "\2\4\3\uffff\4\4\66\uffff\1\2\14\uffff\3\4\2\uffff\4\4\3\uffff"+
            "\1\3\6\4\1\uffff\1\4\1\1\1\uffff\1\4",
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
            ""
    };

    static final short[] DFA92_eot = DFA.unpackEncodedString(DFA92_eotS);
    static final short[] DFA92_eof = DFA.unpackEncodedString(DFA92_eofS);
    static final char[] DFA92_min = DFA.unpackEncodedStringToUnsignedChars(DFA92_minS);
    static final char[] DFA92_max = DFA.unpackEncodedStringToUnsignedChars(DFA92_maxS);
    static final short[] DFA92_accept = DFA.unpackEncodedString(DFA92_acceptS);
    static final short[] DFA92_special = DFA.unpackEncodedString(DFA92_specialS);
    static final short[][] DFA92_transition;

    static {
        int numStates = DFA92_transitionS.length;
        DFA92_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA92_transition[i] = DFA.unpackEncodedString(DFA92_transitionS[i]);
        }
    }

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = DFA92_eot;
            this.eof = DFA92_eof;
            this.min = DFA92_min;
            this.max = DFA92_max;
            this.accept = DFA92_accept;
            this.special = DFA92_special;
            this.transition = DFA92_transition;
        }
        public String getDescription() {
            return "408:1: forInit : ( forInitDef | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA92_1 = input.LA(1);

                         
                        int index92_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index92_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA92_2 = input.LA(1);

                         
                        int index92_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index92_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA92_3 = input.LA(1);

                         
                        int index92_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index92_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 92, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA94_eotS =
        "\66\uffff";
    static final String DFA94_eofS =
        "\1\2\65\uffff";
    static final String DFA94_minS =
        "\1\4\1\0\64\uffff";
    static final String DFA94_maxS =
        "\1\u0089\1\0\64\uffff";
    static final String DFA94_acceptS =
        "\2\uffff\1\2\62\uffff\1\1";
    static final String DFA94_specialS =
        "\1\uffff\1\0\64\uffff}>";
    static final String[] DFA94_transitionS = {
            "\15\2\2\uffff\10\2\4\uffff\12\2\2\uffff\4\2\57\uffff\2\2\2\uffff"+
            "\1\2\2\uffff\1\2\1\uffff\1\2\12\uffff\3\2\2\uffff\4\2\3\uffff"+
            "\12\2\1\uffff\1\1",
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
            return "415:14: ( catchDef )?";
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
                        if ( (synpred140_Fan()) ) {s = 53;}

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
    static final String DFA110_eotS =
        "\106\uffff";
    static final String DFA110_eofS =
        "\1\1\105\uffff";
    static final String DFA110_minS =
        "\1\4\53\uffff\1\0\12\uffff\1\0\16\uffff";
    static final String DFA110_maxS =
        "\1\u008a\53\uffff\1\0\12\uffff\1\0\16\uffff";
    static final String DFA110_acceptS =
        "\1\uffff\1\2\103\uffff\1\1";
    static final String DFA110_specialS =
        "\54\uffff\1\0\12\uffff\1\1\16\uffff}>";
    static final String[] DFA110_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\57\uffff\2\1\1\uffff\3\1\1\uffff"+
            "\1\1\1\uffff\13\1\1\67\1\54\1\1\2\uffff\4\1\3\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 449:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_44 = input.LA(1);

                         
                        int index110_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Fan()) ) {s = 69;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index110_44);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA110_55 = input.LA(1);

                         
                        int index110_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Fan()) ) {s = 69;}

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
        "\27\uffff";
    static final String DFA112_eofS =
        "\27\uffff";
    static final String DFA112_minS =
        "\1\46\1\0\25\uffff";
    static final String DFA112_maxS =
        "\1\u0089\1\0\25\uffff";
    static final String DFA112_acceptS =
        "\2\uffff\1\3\22\uffff\1\1\1\2";
    static final String DFA112_specialS =
        "\1\uffff\1\0\25\uffff}>";
    static final String[] DFA112_transitionS = {
            "\2\2\3\uffff\4\2\66\uffff\1\2\14\uffff\3\2\2\uffff\4\2\3\uffff"+
            "\7\2\1\uffff\2\2\1\uffff\1\1",
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
            return "452:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA112_1 = input.LA(1);

                         
                        int index112_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred167_Fan()&&(notAfterEol()))) ) {s = 21;}

                        else if ( (synpred168_Fan()) ) {s = 22;}

                         
                        input.seek(index112_1);
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
        "\112\uffff";
    static final String DFA113_eofS =
        "\1\1\111\uffff";
    static final String DFA113_minS =
        "\1\4\21\uffff\1\0\2\uffff\1\0\27\uffff\1\0\34\uffff";
    static final String DFA113_maxS =
        "\1\u008a\21\uffff\1\0\2\uffff\1\0\27\uffff\1\0\34\uffff";
    static final String DFA113_acceptS =
        "\1\uffff\1\2\104\uffff\1\1\3\uffff";
    static final String DFA113_specialS =
        "\22\uffff\1\0\2\uffff\1\1\27\uffff\1\2\34\uffff}>";
    static final String[] DFA113_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\56\uffff\1\106\1\25\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\106\24\1\1\uffff\2\106\11\1\1\22\1\1\1\55"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 457:31: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA113_18 = input.LA(1);

                         
                        int index113_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred169_Fan()&&(notAfterEol()))) ) {s = 70;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA113_21 = input.LA(1);

                         
                        int index113_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred169_Fan()) ) {s = 70;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index113_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA113_45 = input.LA(1);

                         
                        int index113_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred169_Fan()&&(notAfterEol()))) ) {s = 70;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL()))) ) {s = 1;}

                         
                        input.seek(index113_45);
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
        "\26\uffff";
    static final String DFA114_eofS =
        "\26\uffff";
    static final String DFA114_minS =
        "\1\46\14\0\1\uffff\6\0\2\uffff";
    static final String DFA114_maxS =
        "\1\u0087\14\0\1\uffff\6\0\2\uffff";
    static final String DFA114_acceptS =
        "\15\uffff\1\1\6\uffff\1\2\1\3";
    static final String DFA114_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\14\1\15\1\16\1\17\1\20\1\21\2\uffff}>";
    static final String[] DFA114_transitionS = {
            "\1\5\1\6\3\uffff\1\4\1\7\1\10\1\11\66\uffff\1\21\14\uffff\1"+
            "\15\1\1\1\2\2\uffff\4\15\3\uffff\1\3\1\14\1\17\1\12\1\13\1\22"+
            "\1\23\1\uffff\1\16\1\20",
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
            "\1\uffff",
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
            return "458:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );";
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
                        if ( (synpred170_Fan()) ) {s = 13;}

                        else if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA114_2 = input.LA(1);

                         
                        int index114_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA114_3 = input.LA(1);

                         
                        int index114_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA114_4 = input.LA(1);

                         
                        int index114_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA114_5 = input.LA(1);

                         
                        int index114_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA114_6 = input.LA(1);

                         
                        int index114_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA114_7 = input.LA(1);

                         
                        int index114_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA114_8 = input.LA(1);

                         
                        int index114_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA114_9 = input.LA(1);

                         
                        int index114_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA114_10 = input.LA(1);

                         
                        int index114_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA114_11 = input.LA(1);

                         
                        int index114_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA114_12 = input.LA(1);

                         
                        int index114_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA114_14 = input.LA(1);

                         
                        int index114_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA114_15 = input.LA(1);

                         
                        int index114_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA114_16 = input.LA(1);

                         
                        int index114_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA114_17 = input.LA(1);

                         
                        int index114_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA114_18 = input.LA(1);

                         
                        int index114_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA114_19 = input.LA(1);

                         
                        int index114_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index114_19);
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
        "\113\uffff";
    static final String DFA115_eofS =
        "\1\1\112\uffff";
    static final String DFA115_minS =
        "\1\4\21\uffff\1\0\2\uffff\1\0\27\uffff\1\0\35\uffff";
    static final String DFA115_maxS =
        "\1\u008a\21\uffff\1\0\2\uffff\1\0\27\uffff\1\0\35\uffff";
    static final String DFA115_acceptS =
        "\1\uffff\1\2\105\uffff\1\1\3\uffff";
    static final String DFA115_specialS =
        "\22\uffff\1\0\2\uffff\1\1\27\uffff\1\2\35\uffff}>";
    static final String[] DFA115_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\56\uffff\1\107\1\25\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\107\24\1\1\uffff\2\107\11\1\1\22\1\1\1\55"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 462:22: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA115_18 = input.LA(1);

                         
                        int index115_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred178_Fan()&&(notAfterEol()))) ) {s = 71;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index115_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA115_21 = input.LA(1);

                         
                        int index115_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred178_Fan()) ) {s = 71;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index115_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA115_45 = input.LA(1);

                         
                        int index115_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred178_Fan()&&(notAfterEol()))) ) {s = 71;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL())||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol())))) ) {s = 1;}

                         
                        input.seek(index115_45);
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
        "\1\46\1\uffff\1\0\14\uffff\3\0\3\uffff";
    static final String DFA116_maxS =
        "\1\u0087\1\uffff\1\0\14\uffff\3\0\3\uffff";
    static final String DFA116_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\17\uffff\1\3\1\4";
    static final String DFA116_specialS =
        "\2\uffff\1\0\14\uffff\1\1\1\2\1\3\3\uffff}>";
    static final String[] DFA116_transitionS = {
            "\2\3\3\uffff\4\3\66\uffff\1\20\15\uffff\1\3\1\1\11\uffff\1\2"+
            "\4\3\1\21\1\3\1\uffff\1\3\1\17",
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
            return "465:1: termBase : ( idExprReq | literal | typeBase | id );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA116_2 = input.LA(1);

                         
                        int index116_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred179_Fan()) ) {s = 1;}

                        else if ( (synpred180_Fan()) ) {s = 3;}

                        else if ( (synpred181_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index116_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA116_15 = input.LA(1);

                         
                        int index116_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_Fan()) ) {s = 3;}

                        else if ( (synpred181_Fan()) ) {s = 19;}

                         
                        input.seek(index116_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA116_16 = input.LA(1);

                         
                        int index116_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_Fan()) ) {s = 3;}

                        else if ( (synpred181_Fan()) ) {s = 19;}

                         
                        input.seek(index116_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA116_17 = input.LA(1);

                         
                        int index116_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_Fan()) ) {s = 3;}

                        else if ( (synpred181_Fan()) ) {s = 19;}

                         
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
        "\14\uffff";
    static final String DFA117_eofS =
        "\14\uffff";
    static final String DFA117_minS =
        "\1\145\3\0\10\uffff";
    static final String DFA117_maxS =
        "\1\u0087\3\0\10\uffff";
    static final String DFA117_acceptS =
        "\4\uffff\1\2\1\1\1\4\1\7\1\10\1\6\1\3\1\5";
    static final String DFA117_specialS =
        "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] DFA117_transitionS = {
            "\1\2\30\uffff\1\3\4\uffff\1\4\3\uffff\1\1",
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
            return "466:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA117_1 = input.LA(1);

                         
                        int index117_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 5;}

                        else if ( (synpred183_Fan()) ) {s = 4;}

                        else if ( (synpred185_Fan()) ) {s = 6;}

                        else if ( (synpred188_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index117_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA117_2 = input.LA(1);

                         
                        int index117_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 5;}

                        else if ( (synpred183_Fan()) ) {s = 4;}

                        else if ( (synpred185_Fan()) ) {s = 6;}

                        else if ( (synpred187_Fan()) ) {s = 9;}

                        else if ( (synpred188_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index117_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA117_3 = input.LA(1);

                         
                        int index117_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 5;}

                        else if ( (synpred183_Fan()) ) {s = 4;}

                        else if ( (synpred184_Fan()) ) {s = 10;}

                        else if ( (synpred185_Fan()) ) {s = 6;}

                        else if ( (synpred186_Fan()) ) {s = 11;}

                        else if ( (synpred188_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index117_3);
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
        "\22\uffff";
    static final String DFA118_eofS =
        "\1\uffff\1\12\1\uffff\1\13\16\uffff";
    static final String DFA118_minS =
        "\1\135\1\4\1\uffff\1\4\4\uffff\1\46\1\0\2\uffff\1\46\2\0\1\uffff"+
        "\1\0\1\uffff";
    static final String DFA118_maxS =
        "\1\u0089\1\u008a\1\uffff\1\u008a\4\uffff\1\u0089\1\0\2\uffff\1\u0089"+
        "\2\0\1\uffff\1\0\1\uffff";
    static final String DFA118_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\7\2\uffff\1\10\1\11\3\uffff\1"+
        "\1\1\uffff\1\3";
    static final String DFA118_specialS =
        "\11\uffff\1\2\3\uffff\1\3\1\1\1\uffff\1\0\1\uffff}>";
    static final String[] DFA118_transitionS = {
            "\1\1\1\7\7\uffff\1\2\25\uffff\1\3\1\4\11\uffff\1\5\1\uffff\1"+
            "\6",
            "\15\12\1\uffff\11\12\1\uffff\23\12\56\uffff\3\12\1\uffff\3"+
            "\12\1\uffff\17\12\1\10\6\12\1\uffff\2\12\1\11\14\12",
            "",
            "\15\13\1\uffff\11\13\1\uffff\23\13\56\uffff\3\13\1\uffff\3"+
            "\13\1\uffff\17\13\1\14\6\13\1\uffff\2\13\1\15\14\13",
            "",
            "",
            "",
            "",
            "\2\12\3\uffff\4\12\66\uffff\1\12\14\uffff\3\12\2\uffff\4\12"+
            "\3\uffff\1\16\6\12\1\uffff\2\12\1\uffff\1\12",
            "\1\uffff",
            "",
            "",
            "\2\13\3\uffff\4\13\66\uffff\1\13\14\uffff\3\13\2\uffff\4\13"+
            "\3\uffff\1\20\6\13\1\uffff\2\13\1\uffff\1\13",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
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
            return "473:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA118_16 = input.LA(1);

                         
                        int index118_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred191_Fan()) ) {s = 17;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index118_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA118_14 = input.LA(1);

                         
                        int index118_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred189_Fan()) ) {s = 15;}

                        else if ( (synpred196_Fan()) ) {s = 10;}

                         
                        input.seek(index118_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA118_9 = input.LA(1);

                         
                        int index118_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred189_Fan()) ) {s = 15;}

                        else if ( (synpred196_Fan()) ) {s = 10;}

                         
                        input.seek(index118_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA118_13 = input.LA(1);

                         
                        int index118_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred191_Fan()) ) {s = 17;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index118_13);
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
    static final String DFA123_eotS =
        "\114\uffff";
    static final String DFA123_eofS =
        "\1\1\113\uffff";
    static final String DFA123_minS =
        "\1\4\22\uffff\1\0\70\uffff";
    static final String DFA123_maxS =
        "\1\u008a\22\uffff\1\0\70\uffff";
    static final String DFA123_acceptS =
        "\1\uffff\1\2\111\uffff\1\1";
    static final String DFA123_specialS =
        "\23\uffff\1\0\70\uffff}>";
    static final String[] DFA123_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\56\uffff\3\1\1\uffff\3\1\1\uffff"+
            "\1\23\25\1\1\uffff\17\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "",
            ""
    };

    static final short[] DFA123_eot = DFA.unpackEncodedString(DFA123_eotS);
    static final short[] DFA123_eof = DFA.unpackEncodedString(DFA123_eofS);
    static final char[] DFA123_min = DFA.unpackEncodedStringToUnsignedChars(DFA123_minS);
    static final char[] DFA123_max = DFA.unpackEncodedStringToUnsignedChars(DFA123_maxS);
    static final short[] DFA123_accept = DFA.unpackEncodedString(DFA123_acceptS);
    static final short[] DFA123_special = DFA.unpackEncodedString(DFA123_specialS);
    static final short[][] DFA123_transition;

    static {
        int numStates = DFA123_transitionS.length;
        DFA123_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA123_transition[i] = DFA.unpackEncodedString(DFA123_transitionS[i]);
        }
    }

    class DFA123 extends DFA {

        public DFA123(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 123;
            this.eot = DFA123_eot;
            this.eof = DFA123_eof;
            this.min = DFA123_min;
            this.max = DFA123_max;
            this.accept = DFA123_accept;
            this.special = DFA123_special;
            this.transition = DFA123_transition;
        }
        public String getDescription() {
            return "()* loopback of 499:45: ( closure )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA123_19 = input.LA(1);

                         
                        int index123_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred201_Fan()) ) {s = 75;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index123_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 123, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA129_eotS =
        "\27\uffff";
    static final String DFA129_eofS =
        "\27\uffff";
    static final String DFA129_minS =
        "\1\46\14\uffff\3\0\7\uffff";
    static final String DFA129_maxS =
        "\1\u0087\14\uffff\3\0\7\uffff";
    static final String DFA129_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\uffff\1"+
        "\12\3\uffff\1\14\1\20\1\13\1\15\1\16\1\17\1\21";
    static final String DFA129_specialS =
        "\15\uffff\1\0\1\1\1\2\7\uffff}>";
    static final String[] DFA129_transitionS = {
            "\1\2\1\3\3\uffff\1\1\1\4\1\5\1\6\66\uffff\1\17\15\uffff\1\12"+
            "\12\uffff\1\15\1\11\1\14\2\7\1\20\1\21\1\uffff\1\12\1\16",
            "",
            "",
            "",
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
            "",
            ""
    };

    static final short[] DFA129_eot = DFA.unpackEncodedString(DFA129_eotS);
    static final short[] DFA129_eof = DFA.unpackEncodedString(DFA129_eofS);
    static final char[] DFA129_min = DFA.unpackEncodedStringToUnsignedChars(DFA129_minS);
    static final char[] DFA129_max = DFA.unpackEncodedStringToUnsignedChars(DFA129_maxS);
    static final short[] DFA129_accept = DFA.unpackEncodedString(DFA129_acceptS);
    static final short[] DFA129_special = DFA.unpackEncodedString(DFA129_specialS);
    static final short[][] DFA129_transition;

    static {
        int numStates = DFA129_transitionS.length;
        DFA129_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA129_transition[i] = DFA.unpackEncodedString(DFA129_transitionS[i]);
        }
    }

    class DFA129 extends DFA {

        public DFA129(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 129;
            this.eot = DFA129_eot;
            this.eof = DFA129_eof;
            this.min = DFA129_min;
            this.max = DFA129_max;
            this.accept = DFA129_accept;
            this.special = DFA129_special;
            this.transition = DFA129_transition;
        }
        public String getDescription() {
            return "516:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA129_13 = input.LA(1);

                         
                        int index129_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred218_Fan()) ) {s = 18;}

                        else if ( (synpred219_Fan()) ) {s = 16;}

                        else if ( (synpred220_Fan()) ) {s = 19;}

                        else if ( (synpred221_Fan()) ) {s = 20;}

                        else if ( (synpred222_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index129_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA129_14 = input.LA(1);

                         
                        int index129_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred219_Fan()) ) {s = 16;}

                        else if ( (synpred220_Fan()) ) {s = 19;}

                        else if ( (synpred221_Fan()) ) {s = 20;}

                        else if ( (synpred222_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index129_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA129_15 = input.LA(1);

                         
                        int index129_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred219_Fan()) ) {s = 16;}

                        else if ( (synpred220_Fan()) ) {s = 19;}

                        else if ( (synpred221_Fan()) ) {s = 20;}

                        else if ( (synpred222_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index129_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 129, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_using_in_prog493 = new BitSet(new long[]{0x0000000FF4320000L,0x4000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_podDef_in_prog497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_typeDef_in_prog501 = new BitSet(new long[]{0x0000000FF4300000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_docs_in_prog505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingPod_in_using527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingType_in_using531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingAs_in_using535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incUsing_in_using539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingPod550 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_podSpec_in_usingPod552 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_usingPod554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingType583 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_podSpec_in_usingType585 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingType587 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_usingType589 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_usingType591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingAs623 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_podSpec_in_usingAs625 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingAs627 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_podId_in_usingAs629 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KW_AS_in_usingAs631 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_usingAs635 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_usingAs637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_podId675 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_167_in_podId678 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_podId680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing693 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_incUsing695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ffi_in_incUsing703 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_incUsing705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing711 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_podSpec_in_incUsing713 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_incUsing715 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_incUsing717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing723 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_podSpec_in_incUsing725 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_incUsing727 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_incUsing729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ffi_in_podSpec770 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_podSpec773 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_podSpec776 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_podSpec778 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_sq_bracketL_in_ffi789 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_ffi791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_sq_bracketR_in_ffi793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_podHeader_in_podDef802 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_BRACKET_L_in_podDef804 = new BitSet(new long[]{0x0000000002000000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_symbolDef_in_podDef806 = new BitSet(new long[]{0x0000000002000000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_BRACKET_R_in_podDef809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_podHeader816 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_facet_in_podHeader818 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_pod_in_podHeader821 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_podHeader823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_symbolDef830 = new BitSet(new long[]{0x0000000002000000L,0x4000002000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_facet_in_symbolDef832 = new BitSet(new long[]{0x0000000002000000L,0x4000002000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_symbolFlag_in_symbolDef835 = new BitSet(new long[]{0x0000000002000000L,0x4000002000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_typeId_in_symbolDef838 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_symbolDef840 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_symbolDef842 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_symbolDef844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_symbolFlag851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_typeDef861 = new BitSet(new long[]{0x0000000FF4300000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_facet_in_typeDef863 = new BitSet(new long[]{0x0000000FF4300000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_classDef_in_typeDef874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDef_in_typeDef888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinDef_in_typeDef892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classHeader_in_classDef915 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_classBody_in_classDef917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_classHeader942 = new BitSet(new long[]{0x0000000F94300000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_facet_in_classHeader944 = new BitSet(new long[]{0x0000000F94300000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_classFlags_in_classHeader949 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_classHeader952 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_classHeader954 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_inheritance_in_classHeader956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_classFlags991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_classFlags995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_classFlags999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_classFlags1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_classFlags1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_classBody1016 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_slotDef_in_classBody1018 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_bracketR_in_classBody1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_protection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinHeader_in_mixinDef1074 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_mixinBody_in_mixinDef1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_mixinHeader1101 = new BitSet(new long[]{0x0000000F44300000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_facet_in_mixinHeader1103 = new BitSet(new long[]{0x0000000F44300000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_mixinFlags_in_mixinHeader1108 = new BitSet(new long[]{0x0000000F44300000L});
    public static final BitSet FOLLOW_KW_MIXIN_in_mixinHeader1111 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_mixinHeader1113 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_inheritance_in_mixinHeader1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_mixinFlags1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_mixinFlags1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_mixinFlags1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_mixinFlags1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_mixinBody1168 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_slotDef_in_mixinBody1170 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_bracketR_in_mixinBody1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumHeader_in_enumDef1207 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_enumBody_in_enumDef1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumHeader1237 = new BitSet(new long[]{0x0000000F20000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_facet_in_enumHeader1239 = new BitSet(new long[]{0x0000000F20000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_protection_in_enumHeader1244 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_enumHeader1247 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_enumHeader1249 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_inheritance_in_enumHeader1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_enumBody1285 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_enumValDefs_in_enumBody1287 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_slotDef_in_enumBody1289 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_bracketR_in_enumBody1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_inheritance1317 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeList_in_inheritance1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs1329 = new BitSet(new long[]{0x0000000000000000L,0x0000008400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_enumValDefs1332 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs1335 = new BitSet(new long[]{0x0000000000000000L,0x0000008400000000L});
    public static final BitSet FOLLOW_eos_in_enumValDefs1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumValDef1347 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_enumValDef1349 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_enumValDef1352 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_args_in_enumValDef1354 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_enumValDef1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList1368 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_typeList1371 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_typeList1373 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_typeRoot_in_type1394 = new BitSet(new long[]{0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_type1396 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_typeTail_in_type1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_typeTail1429 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_typeTail1431 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_mapType_in_typeRoot1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonMapType_in_typeRoot1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_nonMapType1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_nonMapType1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_simpleType1470 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_simpleType1473 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_simpleType1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_mapType1486 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_nonMapType_in_mapType1489 = new BitSet(new long[]{0x0000000000000000L,0x0000001A00000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType1491 = new BitSet(new long[]{0x0000000000000000L,0x0000001200000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_mapType1495 = new BitSet(new long[]{0x0000000000000000L,0x0000001A00000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType1497 = new BitSet(new long[]{0x0000000000000000L,0x0000001200000000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapType1509 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_mapType1513 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_sq_bracketR_in_mapType1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1549 = new BitSet(new long[]{0x0000000000000000L,0x4000006000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_funcTypeContent_in_funcType1551 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formals_in_funcTypeContent1574 = new BitSet(new long[]{0x0000000000000002L,0x4000006000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_assignedType_in_funcTypeContent1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignedType_in_funcTypeContent1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_assignedType1601 = new BitSet(new long[]{0x0000000000000002L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_assignedType1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_in_formals1614 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_formals1617 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formal_in_formals1619 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_formal_content_in_formal1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_formal_content1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_formal_content1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalInferred_in_formal_content1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalFull1673 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_formalFull1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalTypeOnly1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_formalInferred1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticBlock_in_slotDef1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_slotDef1719 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_facet_in_slotDef1721 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_ctorDef_in_slotDef1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDef_in_slotDef1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDef_in_slotDef1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_fieldDef1817 = new BitSet(new long[]{0x0000000F87F80000L,0x4000002000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_facet_in_fieldDef1819 = new BitSet(new long[]{0x0000000F87F80000L,0x4000002000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_fieldFlags_in_fieldDef1824 = new BitSet(new long[]{0x0000000002000000L,0x4000002000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_typeId_in_fieldDef1826 = new BitSet(new long[]{0x0000000000000000L,0x0000008140000000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_fieldDef1829 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_fieldDef1831 = new BitSet(new long[]{0x0000000000000000L,0x0000008040000000L});
    public static final BitSet FOLLOW_bracketL_in_fieldDef1846 = new BitSet(new long[]{0x0000000F00000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_protection_in_fieldDef1849 = new BitSet(new long[]{0x0000000F00000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_getter_in_fieldDef1853 = new BitSet(new long[]{0x000078FF87F81FF0L,0xC79C00A0C0000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_setter_in_fieldDef1857 = new BitSet(new long[]{0x000078FF87F81FF0L,0xC79C00A0C0000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_SP_SEMI_in_fieldDef1860 = new BitSet(new long[]{0x000078FF87F81FF0L,0xC79C0020C0000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_block_in_fieldDef1863 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_bracketR_in_fieldDef1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_fieldDef1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeAndId_in_typeId1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldId_in_typeId1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_fieldId1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeAndId1936 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_typeAndId1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_fieldFlags1947 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_RD_ONLY_in_fieldFlags1951 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_CONST_in_fieldFlags1955 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_STATIC_in_fieldFlags1959 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_fieldFlags1963 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VOLATILE_in_fieldFlags1967 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_fieldFlags1971 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_fieldFlags1975 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_FINAL_in_fieldFlags1979 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_protection_in_fieldFlags1983 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_docs_in_methodDef2003 = new BitSet(new long[]{0x0000002F87600000L,0x4000002000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_facet_in_methodDef2005 = new BitSet(new long[]{0x0000002F87600000L,0x4000002000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_methodFlags_in_methodDef2010 = new BitSet(new long[]{0x0000002F87600000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_methodDef2015 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_methodDef2021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_methodDef2023 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_params_in_methodDef2025 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_methodDef2027 = new BitSet(new long[]{0x0000000000000000L,0x0000008040000000L});
    public static final BitSet FOLLOW_methodBody_in_methodDef2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_methodFlags2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_methodFlags2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_methodFlags2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_methodFlags2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_methodFlags2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ONCE_in_methodFlags2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_methodFlags2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_methodFlags2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params2112 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_params2115 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_param_in_params2117 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_type_in_param2131 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_param2133 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_param2136 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_param2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_methodBody2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_methodBody2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_ctorDef2197 = new BitSet(new long[]{0x0000001F00000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_facet_in_ctorDef2199 = new BitSet(new long[]{0x0000001F00000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ctorFlags_in_ctorDef2204 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_ctorDef2207 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_ctorDef2211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_ctorDef2213 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_params_in_ctorDef2215 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_ctorDef2217 = new BitSet(new long[]{0x0000000000000000L,0x0000008240000000L});
    public static final BitSet FOLLOW_ctorChain_in_ctorDef2226 = new BitSet(new long[]{0x0000000000000000L,0x0000008040000000L});
    public static final BitSet FOLLOW_methodBody_in_ctorDef2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_ctorFlags2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_ctorChain2284 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ctorChainThis_in_ctorChain2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorChainSuper_in_ctorChain2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_ctorChainThis2300 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainThis2302 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_ctorChainThis2304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_ctorChainThis2306 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_args_in_ctorChainThis2308 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_ctorChainThis2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_ctorChainSuper2318 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DOT_in_ctorChainSuper2321 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_ctorChainSuper2323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_ctorChainSuper2327 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_args_in_ctorChainSuper2329 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_ctorChainSuper2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_staticBlock2340 = new BitSet(new long[]{0x000078C002001FF0L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_block_in_staticBlock2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_block2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_multiStmt2379 = new BitSet(new long[]{0x000078FF87F81FF0L,0xC79C0020C0000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_stmt_in_multiStmt2381 = new BitSet(new long[]{0x000078FF87F81FF0L,0xC79C0020C0000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_bracketR_in_multiStmt2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_if_in_stmt2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_for_in_stmt2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_while_in_stmt2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_break_in_stmt2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_continue_in_stmt2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_return_in_stmt2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switch_in_stmt2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_throw_in_stmt2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_try_in_stmt2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_stmt2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localDef_in_stmt2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmtList2478 = new BitSet(new long[]{0x000078C002001FF2L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_KW_BREAK_in_g_break2500 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_g_break2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONTINUE_in_g_continue2509 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_g_continue2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_g_for2520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_g_for2522 = new BitSet(new long[]{0x000078C002000000L,0xC79C00A000000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_forInit_in_g_for2524 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for2527 = new BitSet(new long[]{0x000078C000000000L,0xC79C00A000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_g_for2529 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for2532 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_expr_in_g_for2534 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_g_for2537 = new BitSet(new long[]{0x000078C002001FF0L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_block_in_g_for2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_g_if2581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_g_if2583 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_g_if2585 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_g_if2587 = new BitSet(new long[]{0x000078C002001FF0L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_block_in_g_if2589 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_g_if2596 = new BitSet(new long[]{0x000078C002001FF0L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_block_in_g_if2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_g_return2607 = new BitSet(new long[]{0x000078C000000000L,0xC79C00A000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_eos_in_g_return2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_g_return2614 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_g_return2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SWITCH_in_g_switch2624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_g_switch2626 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_g_switch2628 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_g_switch2630 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_bracketL_in_g_switch2632 = new BitSet(new long[]{0x0000003F87F86000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_g_case_in_g_switch2635 = new BitSet(new long[]{0x0000003F87F86000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_g_default_in_g_switch2640 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_bracketR_in_g_switch2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_g_throw2652 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_g_throw2654 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_g_throw2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHILE_in_g_while2664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_g_while2666 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_g_while2668 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_g_while2670 = new BitSet(new long[]{0x000078C002001FF0L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_block_in_g_while2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_g_try2681 = new BitSet(new long[]{0x000078C002019FF0L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_g_try_content_in_g_try2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_long_in_g_try_content2709 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_stmtList_in_g_try_content2713 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_catch_in_g_try_content2721 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_finally_in_g_try_content2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_try_long2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprStmt2746 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_exprStmt2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_localDef2756 = new BitSet(new long[]{0x0000000000000000L,0x0000008100000000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_localDef2759 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_localDef2761 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_eos_in_localDef2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_forInit2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forInit2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_forInitDef2803 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_forInitDef2806 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_forInitDef2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_g_catch2840 = new BitSet(new long[]{0x000078C002001FF0L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_g_catch_ct_in_g_catch2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchDef_in_g_catch_ct2862 = new BitSet(new long[]{0x000078C002001FF0L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_catch_long_in_g_catch_ct2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtList_in_g_catch_ct2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_catch_long2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_catchDef2890 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_catchDef2892 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_catchDef2894 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_catchDef2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_g_finally2922 = new BitSet(new long[]{0x000078C002001FF0L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_finally_long_in_g_finally2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtList_in_g_finally2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_finally_long2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_g_case2949 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_g_case2951 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_case2953 = new BitSet(new long[]{0x000078C002001FF2L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_stmt_in_g_case2955 = new BitSet(new long[]{0x000078C002001FF2L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_KW_DEFAULT_in_g_default2963 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_default2965 = new BitSet(new long[]{0x000078C002001FF2L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_stmt_in_g_default2967 = new BitSet(new long[]{0x000078C002001FF2L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_assignExpr_in_expr2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2995 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2998 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_assignExpr_in_assignExpr3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryExpr3009 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ternaryTail_in_ternaryExpr3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_ternaryTail3022 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail3024 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SP_COLON_in_ternaryTail3026 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr3047 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_OP_OR_in_condOrExpr3051 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr3054 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr3064 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_OP_AND_in_condAndExpr3067 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr3070 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr3080 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_CP_EQUALITY_in_equalityExpr3083 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr3085 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_elvisExpr_in_relationalExpr3098 = new BitSet(new long[]{0x0000060000040000L,0x0000200000000000L});
    public static final BitSet FOLLOW_typeCheck_in_relationalExpr3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_relationalExpr3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCheck3116 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeRoot_in_typeCheck3128 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_typeCheck3131 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_typeCheck3136 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_CP_COMPARATORS_in_compare3149 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_elvisExpr_in_compare3151 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr3162 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_OP_ELVIS_in_elvisExpr3165 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr3167 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_addExpr_in_rangeExpr3178 = new BitSet(new long[]{0x0000000000000002L,0x0003800000000000L});
    public static final BitSet FOLLOW_set_in_rangeExpr3181 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_addExpr_in_rangeExpr3195 = new BitSet(new long[]{0x0000000000000002L,0x0003800000000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3210 = new BitSet(new long[]{0x0000000000000002L,0x000C000000000000L});
    public static final BitSet FOLLOW_set_in_addExpr3213 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_multExpr_in_addExpr3221 = new BitSet(new long[]{0x0000000000000002L,0x000C000000000000L});
    public static final BitSet FOLLOW_set_in_addAppend3231 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_parenExpr_in_addAppend3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr3247 = new BitSet(new long[]{0x0000000000000002L,0x0070000000000000L});
    public static final BitSet FOLLOW_set_in_multExpr3250 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_parenExpr_in_multExpr3262 = new BitSet(new long[]{0x0000000000000002L,0x0070000000000000L});
    public static final BitSet FOLLOW_castExpr_in_parenExpr3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_parenExpr3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_parenExpr3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_castExpr3292 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_castExpr3294 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_castExpr3296 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_parenExpr_in_castExpr3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_groupedExpr3326 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_groupedExpr3328 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_groupedExpr3330 = new BitSet(new long[]{0x0000000000000002L,0x3000004060000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_termChain_in_groupedExpr3332 = new BitSet(new long[]{0x0000000000000002L,0x3000004060000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_prefixExpr_in_unaryExpr3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_unaryExpr3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_unaryExpr3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr3358 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_parenExpr_in_prefixExpr3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_postfixExpr3393 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_set_in_postfixExpr3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termBase_in_termExpr3410 = new BitSet(new long[]{0x0000000000000002L,0x3000004060000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_termChain_in_termExpr3412 = new BitSet(new long[]{0x0000000000000002L,0x3000004060000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_idExprReq_in_termBase3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_termBase3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_termBase3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_termBase3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_typeBase3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_typeBase3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_typeBase3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_typeBase3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_typeBase3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_typeBase3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_typeBase3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorBlock_in_typeBase3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_ctorBlock3516 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_itBlock_in_ctorBlock3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_staticCall3539 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_staticCall3541 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_idExpr_in_staticCall3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_termChain3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynCall_in_termChain3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_termChain3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDynCall_in_termChain3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpr_in_termChain3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callOp_in_termChain3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itBlock_in_termChain3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDotCall_in_termChain3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incSafeDotCall_in_termChain3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_dsl3620 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_DSL_in_dsl3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_incDotCall3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_incSafeDotCall3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_itBlock3667 = new BitSet(new long[]{0x000078FF87F81FF0L,0xC79C0020C0000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_itBlockContent_in_itBlock3669 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_bracketR_in_itBlock3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_itBlockContent3697 = new BitSet(new long[]{0x000078C002001FF2L,0xC79C00A440000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_SP_COMMA_in_itBlockContent3699 = new BitSet(new long[]{0x000078C002001FF2L,0xC79C00A040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_SP_SEMI_in_itBlockContent3702 = new BitSet(new long[]{0x000078C002001FF2L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_DOT_in_dotCall3713 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_idExpr_in_dotCall3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_dynCall3735 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_idExpr_in_dynCall3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_safeDotCall3745 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_idExpr_in_safeDotCall3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall3766 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_idExpr_in_safeDynCall3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_indexExpr3783 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_indexExpr3785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_sq_bracketR_in_indexExpr3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callOp3815 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_args_in_callOp3817 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_callOp3821 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_closure_in_callOp3823 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_funcType_in_closure3846 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_multiStmt_in_closure3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_idExpr3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idExpr3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_idExprReq3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_idExprReq3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MULTI_in_field3897 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_ID_in_field3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call3911 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_callParams_in_call3917 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_closure_in_call3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_call3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_call3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callParams3969 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_args_in_callParams3971 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_callParams3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args3983 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_args3986 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_args3989 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_KW_NULL_in_literal4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_literal4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_literal4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IT_in_literal4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_literal4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_literal4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strs_in_literal4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_literal4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_literal4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_literal4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_literal4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_literal4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_literal4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_literal4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_literal4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbLiteral_in_literal4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_literal4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTSTR_in_strs4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_strs4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeLiteral4121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_OP_POUND_in_typeLiteral4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_slotLiteral4154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_OP_POUND_in_slotLiteral4157 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_slotLiteral4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_symbLiteral4189 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_symbLiteral4194 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SP_COLON_in_symbLiteral4196 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SP_COLON_in_symbLiteral4198 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_symbLiteral4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_namedSuper4230 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_namedSuper4232 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_SUPER_in_namedSuper4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_list4262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_sq_bracketL_in_list4268 = new BitSet(new long[]{0x000078C000000000L,0xC79C002400000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_listItems_in_list4270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_sq_bracketR_in_list4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_listItems4301 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems4304 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_listItems4306 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_map4328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_sq_bracketL_in_map4334 = new BitSet(new long[]{0x000078C000000000L,0xC79C002200000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_mapItems_in_map4336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_sq_bracketR_in_map4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapPair_in_mapItems4367 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems4370 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_mapPair_in_mapItems4372 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_mapItems4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_mapPair4390 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapPair4392 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_mapPair4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_simple4402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_simple4404 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_simple4406 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000006DFL});
    public static final BitSet FOLLOW_parR_in_simple4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_docs4420 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OP_MINUS_in_number4442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_number4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_facet4453 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_facet4455 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_AS_EQUAL_in_facet4458 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_expr_in_facet4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_eos4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getter4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setter4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pod4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_bracketL4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_R_in_bracketR4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_sq_bracketL4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_sq_bracketR4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_parL4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_R_in_parR4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_podDef_in_synpred2_Fan497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred17_Fan863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classFlags_in_synpred19_Fan868 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_synpred19_Fan871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_synpred21_Fan882 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_synpred21_Fan885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred48_Fan1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred49_Fan1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_synpred50_Fan1429 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred50_Fan1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred51_Fan1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_synpred58_Fan1509 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_synpred58_Fan1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketR_in_synpred59_Fan1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred60_Fan1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred62_Fan1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred63_Fan1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_synpred65_Fan1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_synpred66_Fan1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_synpred67_Fan1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_bracketL_in_synpred67_Fan1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred68_Fan1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorFlags_in_synpred70_Fan1738 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_synpred70_Fan1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodFlags_in_synpred73_Fan1755 = new BitSet(new long[]{0x0000002F8F600000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_synpred73_Fan1759 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KW_VOID_in_synpred73_Fan1763 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_synpred73_Fan1766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_synpred73_Fan1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getter_in_synpred77_Fan1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred79_Fan1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred82_Fan1910 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_synpred82_Fan1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_synpred105_Fan2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred114_Fan2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_synpred125_Fan2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred126_Fan2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_synpred130_Fan2596 = new BitSet(new long[]{0x000078C002001FF0L,0xC79C002040000000L,0x00000000000002FFL});
    public static final BitSet FOLLOW_block_in_synpred130_Fan2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_synpred131_Fan2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred134_Fan2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_synpred135_Fan2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_synpred136_Fan2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_synpred138_Fan2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchDef_in_synpred140_Fan2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred141_Fan2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred142_Fan2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred162_Fan3213 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_multExpr_in_synpred162_Fan3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred166_Fan3250 = new BitSet(new long[]{0x000078C000000000L,0xC79C002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_parenExpr_in_synpred166_Fan3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_synpred167_Fan3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_synpred168_Fan3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred169_Fan3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred170_Fan3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_synpred171_Fan3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred178_Fan3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred179_Fan3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred180_Fan3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_synpred181_Fan3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred182_Fan3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred183_Fan3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred184_Fan3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_synpred185_Fan3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_synpred186_Fan3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred187_Fan3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_synpred188_Fan3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_synpred189_Fan3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_synpred191_Fan3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDotCall_in_synpred196_Fan3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred201_Fan3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred202_Fan3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred204_Fan3917 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_closure_in_synpred204_Fan3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred205_Fan3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred218_Fan4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred219_Fan4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred220_Fan4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_synpred221_Fan4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_synpred222_Fan4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred228_Fan4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred232_Fan4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_synpred236_Fan4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_synpred239_Fan4482 = new BitSet(new long[]{0x0000000000000002L});

}