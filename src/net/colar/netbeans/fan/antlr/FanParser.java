// @Deprecated //  Deprecated (2/22/10)- using parboiled parser now
// $ANTLR 3.1.2 src/net/colar/netbeans/fan/antlr/Fan.g 2010-02-04 13:59:11
package net.colar.netbeans.fan.antlr;
import net.colar.netbeans.fan.FanParserResult;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

@Deprecated //  Deprecated (2/22/10)- using parboiled parser now
public class FanParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KW_BREAK", "KW_CONTINUE", "KW_FOR", "KW_IF", "KW_RETURN", "KW_SWITCH", "KW_THROW", "KW_WHILE", "KW_TRY", "KW_CASE", "KW_DEFAULT", "KW_CATCH", "KW_FINALLY", "KW_USING", "KW_AS", "KW_RD_ONLY", "KW_CONST", "KW_STATIC", "KW_NATIVE", "KW_VOLATILE", "KW_OVERRIDE", "KW_VIRTUAL", "KW_FINAL", "KW_VOID", "KW_CLASS", "KW_ENUM", "KW_MIXIN", "KW_ABSTRACT", "KW_PRIVATE", "KW_PROTECTED", "KW_PUBLIC", "KW_INTERNAL", "KW_NEW", "KW_ONCE", "KW_THIS", "KW_SUPER", "KW_ELSE", "KW_IS", "KW_ISNOT", "KW_NULL", "KW_IT", "KW_TRUE", "KW_FALSE", "INC_STR", "INC_URI", "INC_COMMENT", "INC_DSL", "AST_CLASS", "AST_ENUM", "AST_MIXIN", "AST_METHOD", "AST_CONSTRUCTOR", "AST_FIELD", "AST_CONSTRUCTOR_CHAIN", "AST_CODE_BLOCK", "AST_DOCS", "AST_STR", "AST_CALL", "AST_TERM_EXPR", "AST_DOT_CALL", "AST_SAFE_DOT_CALL", "AST_STATIC_CALL", "AST_USING_POD", "AST_MAP", "AST_LOCAL_DEF", "AST_TYPE_LIT", "AST_SLOT_LIT", "AST_SYMBOL", "AST_NAMED_SUPER", "AST_LIST", "AST_IT_BLOCK", "AST_CTOR_BLOCK", "AST_FOR_INIT", "AST_CATCH_DEF", "AST_FORMAL", "AST_CAST", "AST_FUNC_TYPE", "AST_INDEX_EXPR", "AST_INC_USING", "AST_INC_DOTCALL", "AST_INC_SAFEDOTCALL", "AST_SCOPE", "AST_ID", "AST_MODIFIER", "AST_INHERITANCE", "AST_PARAM", "AST_TYPE", "AST_CHILD", "SP_COLCOL", "DOT", "BRACKET_L", "BRACKET_R", "AS_INIT_VAL", "SP_COLON", "SP_COMMA", "SP_QMARK", "LIST_TYPE", "SP_PIPE", "OP_SAFEDYN_CALL", "OP_ARROW", "SP_SEMI", "OP_ELVIS", "AS_EQUAL", "AS_ASSIGN_OP", "OP_OR", "OP_AND", "CP_EQUALITY", "CP_COMPARATORS", "OP_RANG_EXCL_OLD", "OP_RANGE_EXCL", "OP_RANGE", "OP_PLUS", "OP_MINUS", "OP_MULTI", "OP_DIV", "OP_MOD", "OP_CURRY", "OP_BANG", "OP_2PLUS", "OP_2MINUS", "DSL", "OP_SAFE_CALL", "ID", "URI", "CHAR", "QUOTSTR", "STR", "OP_POUND", "AT", "DOC", "NUMBER", "SQ_BRACKET_L", "SQ_BRACKET_R", "PAR_L", "PAR_R", "LB", "WS", "LINE_COMMENT", "EXEC_COMMENT", "COMPL_ML_COMMENT", "MULTI_COMMENT", "COMPL_DSL", "DIGIT", "HEXLETTER", "COMPL_QSTR", "COMPL_STR", "COMPL_URI", "KEYWORD", "OP_BITOR", "UNDERSCORE", "OP_LSHIFT", "OP_RSHIFT", "OP_TILDA", "HEX_HEADER", "HEXNB", "DECIMAL", "FRACTIONAL", "HEXHEADER", "FRACTION", "EXPONENT", "NBTYPE", "LETTER", "INC_UNKNOWN_ITEM", "'$'"
    };
    public static final int EXPONENT=163;
    public static final int AST_INDEX_EXPR=81;
    public static final int DSL=124;
    public static final int OP_AND=109;
    public static final int KW_NATIVE=22;
    public static final int AST_CATCH_DEF=77;
    public static final int LETTER=165;
    public static final int HEXNB=158;
    public static final int CHAR=128;
    public static final int OP_2PLUS=122;
    public static final int KW_DEFAULT=14;
    public static final int KW_ONCE=37;
    public static final int SP_SEMI=104;
    public static final int INC_UNKNOWN_ITEM=166;
    public static final int AST_MIXIN=53;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int KW_PUBLIC=34;
    public static final int KW_ISNOT=42;
    public static final int OP_MOD=119;
    public static final int PAR_R=138;
    public static final int OP_MINUS=116;
    public static final int KW_NEW=36;
    public static final int KW_BREAK=4;
    public static final int KW_SWITCH=9;
    public static final int AST_INC_DOTCALL=83;
    public static final int OP_RANG_EXCL_OLD=112;
    public static final int AST_CLASS=51;
    public static final int OP_BITOR=152;
    public static final int QUOTSTR=129;
    public static final int AST_TYPE=90;
    public static final int OP_BANG=121;
    public static final int AST_DOT_CALL=63;
    public static final int AST_TYPE_LIT=69;
    public static final int PAR_L=137;
    public static final int OP_MULTI=117;
    public static final int AST_USING_POD=66;
    public static final int KEYWORD=151;
    public static final int KW_PROTECTED=33;
    public static final int AST_STR=60;
    public static final int LINE_COMMENT=141;
    public static final int CP_COMPARATORS=111;
    public static final int NUMBER=134;
    public static final int AS_EQUAL=106;
    public static final int KW_CATCH=15;
    public static final int UNDERSCORE=153;
    public static final int OP_DIV=118;
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
    public static final int OP_2MINUS=123;
    public static final int AST_SCOPE=85;
    public static final int OP_RSHIFT=155;
    public static final int KW_ELSE=40;
    public static final int AST_FUNC_TYPE=80;
    public static final int OP_OR=108;
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
    public static final int OP_ELVIS=105;
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
    public static final int OP_RANGE_EXCL=113;
    public static final int SP_PIPE=101;
    public static final int OP_TILDA=156;
    public static final int COMPL_QSTR=148;
    public static final int KW_VIRTUAL=25;
    public static final int CP_EQUALITY=110;
    public static final int AST_SAFE_DOT_CALL=64;
    public static final int KW_FOR=6;
    public static final int KW_WHILE=11;
    public static final int COMPL_URI=150;
    public static final int AST_LOCAL_DEF=68;
    public static final int AST_SLOT_LIT=70;
    public static final int OP_RANGE=114;
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
    public static final int OP_CURRY=120;
    public static final int SQ_BRACKET_L=135;
    public static final int AST_INC_SAFEDOTCALL=84;
    public static final int OP_PLUS=115;
    public static final int KW_FALSE=46;
    public static final int KW_INTERNAL=35;
    public static final int KW_FINAL=26;
    public static final int HEXLETTER=147;
    public static final int KW_CONTINUE=5;
    public static final int KW_PRIVATE=32;
    public static final int KW_ENUM=29;
    public static final int HEX_HEADER=157;
    public static final int OP_SAFEDYN_CALL=102;
    public static final int LIST_TYPE=100;
    public static final int KW_VOLATILE=23;
    public static final int KW_CASE=13;
    public static final int FRACTIONAL=160;
    public static final int OP_LSHIFT=154;
    public static final int EXEC_COMMENT=142;
    public static final int KW_MIXIN=30;
    public static final int AST_IT_BLOCK=74;
    public static final int AST_CHILD=91;
    public static final int OP_ARROW=103;
    public static final int KW_VOID=27;
    public static final int DECIMAL=159;
    public static final int INC_URI=48;
    public static final int KW_CLASS=28;
    public static final int AS_ASSIGN_OP=107;
    public static final int AST_MAP=67;
    public static final int AST_CONSTRUCTOR=55;
    public static final int KW_RD_ONLY=19;
    public static final int INC_STR=47;
    public static final int AST_STATIC_CALL=65;
    public static final int OP_SAFE_CALL=125;
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
            this.state.ruleMemo = new HashMap[406+1];
             
             
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
            // elements: eos, podSpec
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
            // elements: podSpec, ffi, SP_COLCOL, DOT, KW_USING
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
            // elements: m, id, KW_CLASS, inheritance
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
            // elements: bracketR, slotDef, bracketL
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
            // elements: inheritance, id, m, KW_MIXIN
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
            // elements: m, KW_ENUM, inheritance, id
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
            // elements: bracketR, bracketL, slotDef, enumValDefs
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

                    if ( (LA30_0==OP_ELVIS) ) {
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
            // elements: typeTail, typeRoot, SP_QMARK
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
            // elements: nonMapType, type
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:330:1: funcTypeContent : ( ( formals OP_SAFEDYN_CALL ( type )? ) | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) );
    public final FanParser.funcTypeContent_return funcTypeContent() throws RecognitionException {
        FanParser.funcTypeContent_return retval = new FanParser.funcTypeContent_return();
        retval.start = input.LT(1);
        int funcTypeContent_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFEDYN_CALL147=null;
        FanParser.formals_return formals146 = null;

        FanParser.type_return type148 = null;

        FanParser.formals_return formals149 = null;

        FanParser.assignedType_return assignedType150 = null;

        FanParser.assignedType_return assignedType151 = null;


        Object OP_SAFEDYN_CALL147_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:17: ( ( formals OP_SAFEDYN_CALL ( type )? ) | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) )
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==SQ_BRACKET_L) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred61_Fan()) ) {
                    alt47=1;
                }
                else if ( (synpred63_Fan()) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA47_0==SP_PIPE) ) {
                int LA47_2 = input.LA(2);

                if ( (synpred61_Fan()) ) {
                    alt47=1;
                }
                else if ( (synpred63_Fan()) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA47_0==ID) ) {
                int LA47_3 = input.LA(2);

                if ( (synpred61_Fan()) ) {
                    alt47=1;
                }
                else if ( (synpred63_Fan()) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA47_0==OP_ARROW) && (synpred64_Fan())) {
                alt47=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:19: ( formals OP_SAFEDYN_CALL ( type )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:19: ( formals OP_SAFEDYN_CALL ( type )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:20: formals OP_SAFEDYN_CALL ( type )?
                    {
                    pushFollow(FOLLOW_formals_in_funcTypeContent1575);
                    formals146=formals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formals146.getTree());
                    OP_SAFEDYN_CALL147=(Token)match(input,OP_SAFEDYN_CALL,FOLLOW_OP_SAFEDYN_CALL_in_funcTypeContent1577); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_SAFEDYN_CALL147_tree = (Object)adaptor.create(OP_SAFEDYN_CALL147);
                    adaptor.addChild(root_0, OP_SAFEDYN_CALL147_tree);
                    }
                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:44: ( type )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==ID||LA45_0==SQ_BRACKET_L) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==SP_PIPE) ) {
                        int LA45_2 = input.LA(2);

                        if ( (synpred60_Fan()) ) {
                            alt45=1;
                        }
                    }
                    switch (alt45) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                            {
                            pushFollow(FOLLOW_type_in_funcTypeContent1579);
                            type148=type();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, type148.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:53: ( formals ( ( OP_ARROW )=> assignedType )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:53: ( formals ( ( OP_ARROW )=> assignedType )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:54: formals ( ( OP_ARROW )=> assignedType )?
                    {
                    pushFollow(FOLLOW_formals_in_funcTypeContent1586);
                    formals149=formals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formals149.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:62: ( ( OP_ARROW )=> assignedType )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==OP_ARROW) && (synpred62_Fan())) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:330:63: ( OP_ARROW )=> assignedType
                            {
                            pushFollow(FOLLOW_assignedType_in_funcTypeContent1593);
                            assignedType150=assignedType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType150.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:93: ( ( OP_ARROW )=> assignedType )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:93: ( ( OP_ARROW )=> assignedType )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:94: ( OP_ARROW )=> assignedType
                    {
                    pushFollow(FOLLOW_assignedType_in_funcTypeContent1605);
                    assignedType151=assignedType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType151.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:331:1: assignedType : OP_ARROW ( type )? ;
    public final FanParser.assignedType_return assignedType() throws RecognitionException {
        FanParser.assignedType_return retval = new FanParser.assignedType_return();
        retval.start = input.LT(1);
        int assignedType_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW152=null;
        FanParser.type_return type153 = null;


        Object OP_ARROW152_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:14: ( OP_ARROW ( type )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:16: OP_ARROW ( type )?
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW152=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_assignedType1613); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW152_tree = (Object)adaptor.create(OP_ARROW152);
            adaptor.addChild(root_0, OP_ARROW152_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:25: ( type )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ID||LA48_0==SQ_BRACKET_L) ) {
                alt48=1;
            }
            else if ( (LA48_0==SP_PIPE) ) {
                int LA48_2 = input.LA(2);

                if ( (synpred65_Fan()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_assignedType1615);
                    type153=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type153.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:332:1: formals : formal ( SP_COMMA formal )* ;
    public final FanParser.formals_return formals() throws RecognitionException {
        FanParser.formals_return retval = new FanParser.formals_return();
        retval.start = input.LT(1);
        int formals_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA155=null;
        FanParser.formal_return formal154 = null;

        FanParser.formal_return formal156 = null;


        Object SP_COMMA155_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:10: ( formal ( SP_COMMA formal )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:14: formal ( SP_COMMA formal )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_formal_in_formals1626);
            formal154=formal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formal154.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:21: ( SP_COMMA formal )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==SP_COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:332:22: SP_COMMA formal
            	    {
            	    SP_COMMA155=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_formals1629); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA155_tree = (Object)adaptor.create(SP_COMMA155);
            	    adaptor.addChild(root_0, SP_COMMA155_tree);
            	    }
            	    pushFollow(FOLLOW_formal_in_formals1631);
            	    formal156=formal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal156.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:333:1: formal : ( formal_content ) -> ^( AST_FORMAL formal_content ) ;
    public final FanParser.formal_return formal() throws RecognitionException {
        FanParser.formal_return retval = new FanParser.formal_return();
        retval.start = input.LT(1);
        int formal_StartIndex = input.index();
        Object root_0 = null;

        FanParser.formal_content_return formal_content157 = null;


        RewriteRuleSubtreeStream stream_formal_content=new RewriteRuleSubtreeStream(adaptor,"rule formal_content");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:9: ( ( formal_content ) -> ^( AST_FORMAL formal_content ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:11: ( formal_content )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:11: ( formal_content )
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:12: formal_content
            {
            pushFollow(FOLLOW_formal_content_in_formal1642);
            formal_content157=formal_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formal_content.add(formal_content157.getTree());

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
            // 334:6: -> ^( AST_FORMAL formal_content )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:334:9: ^( AST_FORMAL formal_content )
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:335:1: formal_content : ( formalFull | formalTypeOnly | formalInferred ) ;
    public final FanParser.formal_content_return formal_content() throws RecognitionException {
        FanParser.formal_content_return retval = new FanParser.formal_content_return();
        retval.start = input.LT(1);
        int formal_content_StartIndex = input.index();
        Object root_0 = null;

        FanParser.formalFull_return formalFull158 = null;

        FanParser.formalTypeOnly_return formalTypeOnly159 = null;

        FanParser.formalInferred_return formalInferred160 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:16: ( ( formalFull | formalTypeOnly | formalInferred ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:18: ( formalFull | formalTypeOnly | formalInferred )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:335:18: ( formalFull | formalTypeOnly | formalInferred )
            int alt50=3;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                int LA50_1 = input.LA(2);

                if ( (synpred67_Fan()) ) {
                    alt50=1;
                }
                else if ( (synpred68_Fan()) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
                }
                break;
            case SP_PIPE:
                {
                int LA50_2 = input.LA(2);

                if ( (synpred67_Fan()) ) {
                    alt50=1;
                }
                else if ( (synpred68_Fan()) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA50_3 = input.LA(2);

                if ( (synpred67_Fan()) ) {
                    alt50=1;
                }
                else if ( (synpred68_Fan()) ) {
                    alt50=2;
                }
                else if ( (true) ) {
                    alt50=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:19: formalFull
                    {
                    pushFollow(FOLLOW_formalFull_in_formal_content1664);
                    formalFull158=formalFull();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalFull158.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:32: formalTypeOnly
                    {
                    pushFollow(FOLLOW_formalTypeOnly_in_formal_content1668);
                    formalTypeOnly159=formalTypeOnly();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalTypeOnly159.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:49: formalInferred
                    {
                    pushFollow(FOLLOW_formalInferred_in_formal_content1672);
                    formalInferred160=formalInferred();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalInferred160.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:336:1: formalFull : type id ;
    public final FanParser.formalFull_return formalFull() throws RecognitionException {
        FanParser.formalFull_return retval = new FanParser.formalFull_return();
        retval.start = input.LT(1);
        int formalFull_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type161 = null;

        FanParser.id_return id162 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:336:17: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:336:19: type id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalFull1685);
            type161=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type161.getTree());
            pushFollow(FOLLOW_id_in_formalFull1687);
            id162=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id162.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:337:1: formalTypeOnly : type ;
    public final FanParser.formalTypeOnly_return formalTypeOnly() throws RecognitionException {
        FanParser.formalTypeOnly_return retval = new FanParser.formalTypeOnly_return();
        retval.start = input.LT(1);
        int formalTypeOnly_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type163 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:17: ( type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:21: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalTypeOnly1697);
            type163=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type163.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:338:1: formalInferred : id ;
    public final FanParser.formalInferred_return formalInferred() throws RecognitionException {
        FanParser.formalInferred_return retval = new FanParser.formalInferred_return();
        retval.start = input.LT(1);
        int formalInferred_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id164 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:338:17: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:338:21: id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_formalInferred1707);
            id164=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id164.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:339:1: slotDef : ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) ;
    public final FanParser.slotDef_return slotDef() throws RecognitionException {
        FanParser.slotDef_return retval = new FanParser.slotDef_return();
        retval.start = input.LT(1);
        int slotDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.staticBlock_return staticBlock165 = null;

        FanParser.docs_return docs166 = null;

        FanParser.facet_return facet167 = null;

        FanParser.ctorDef_return ctorDef168 = null;

        FanParser.methodDef_return methodDef169 = null;

        FanParser.fieldDef_return fieldDef170 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:339:10: ( ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:339:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:339:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:339:13: ( KW_STATIC bracketL )=> staticBlock
                    {
                    pushFollow(FOLLOW_staticBlock_in_slotDef1723);
                    staticBlock165=staticBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticBlock165.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:340:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:340:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:340:6: docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    {
                    pushFollow(FOLLOW_docs_in_slotDef1731);
                    docs166=docs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, docs166.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:340:11: ( facet )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==AT) ) {
                            int LA51_2 = input.LA(2);

                            if ( (LA51_2==ID) ) {
                                int LA51_3 = input.LA(3);

                                if ( (synpred70_Fan()) ) {
                                    alt51=1;
                                }


                            }


                        }


                        switch (alt51) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
                    	    {
                    	    pushFollow(FOLLOW_facet_in_slotDef1733);
                    	    facet167=facet();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet167.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:341:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    int alt52=3;
                    alt52 = dfa52.predict(input);
                    switch (alt52) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:342:7: ( ( ctorFlags )* KW_NEW )=> ctorDef
                            {
                            pushFollow(FOLLOW_ctorDef_in_slotDef1756);
                            ctorDef168=ctorDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorDef168.getTree());

                            }
                            break;
                        case 2 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:343:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef
                            {
                            pushFollow(FOLLOW_methodDef_in_slotDef1783);
                            methodDef169=methodDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDef169.getTree());

                            }
                            break;
                        case 3 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:344:7: fieldDef
                            {
                            pushFollow(FOLLOW_fieldDef_in_slotDef1793);
                            fieldDef170=fieldDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDef170.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:348:1: fieldDef : docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? ) ;
    public final FanParser.fieldDef_return fieldDef() throws RecognitionException {
        FanParser.fieldDef_return retval = new FanParser.fieldDef_return();
        retval.start = input.LT(1);
        int fieldDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL174=null;
        Token SP_SEMI180=null;
        FanParser.fieldFlags_return m = null;

        FanParser.docs_return docs171 = null;

        FanParser.facet_return facet172 = null;

        FanParser.typeId_return typeId173 = null;

        FanParser.expr_return expr175 = null;

        FanParser.bracketL_return bracketL176 = null;

        FanParser.protection_return protection177 = null;

        FanParser.getter_return getter178 = null;

        FanParser.setter_return setter179 = null;

        FanParser.block_return block181 = null;

        FanParser.bracketR_return bracketR182 = null;

        FanParser.eos_return eos183 = null;


        Object AS_INIT_VAL174_tree=null;
        Object SP_SEMI180_tree=null;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:3: ( docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:5: docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            {
            pushFollow(FOLLOW_docs_in_fieldDef1829);
            docs171=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs171.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:10: ( facet )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==AT) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_fieldDef1831);
            	    facet172=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet172.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            pushFollow(FOLLOW_fieldFlags_in_fieldDef1836);
            m=fieldFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldFlags.add(m.getTree());
            pushFollow(FOLLOW_typeId_in_fieldDef1838);
            typeId173=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeId.add(typeId173.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:37: ( AS_INIT_VAL expr )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==AS_INIT_VAL) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:349:38: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL174=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_fieldDef1841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL174);

                    pushFollow(FOLLOW_expr_in_fieldDef1843);
                    expr175=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr175.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:350:5: ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==BRACKET_L) ) {
                alt61=1;
            }
            else if ( (LA61_0==EOF||(LA61_0>=KW_RD_ONLY && LA61_0<=KW_FINAL)||(LA61_0>=KW_ABSTRACT && LA61_0<=KW_ONCE)||LA61_0==BRACKET_R||LA61_0==SP_PIPE||LA61_0==SP_SEMI||LA61_0==ID||(LA61_0>=AT && LA61_0<=DOC)||LA61_0==SQ_BRACKET_L) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:351:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:351:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:351:6: bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR
                    {
                    pushFollow(FOLLOW_bracketL_in_fieldDef1858);
                    bracketL176=bracketL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketL.add(bracketL176.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:351:15: ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=KW_PRIVATE && LA60_0<=KW_INTERNAL)||LA60_0==ID) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:351:16: ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )?
                    	    {
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:351:16: ( protection )?
                    	    int alt56=2;
                    	    int LA56_0 = input.LA(1);

                    	    if ( ((LA56_0>=KW_PRIVATE && LA56_0<=KW_INTERNAL)) ) {
                    	        alt56=1;
                    	    }
                    	    switch (alt56) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    	            {
                    	            pushFollow(FOLLOW_protection_in_fieldDef1861);
                    	            protection177=protection();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_protection.add(protection177.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:351:28: ( getter | setter )
                    	    int alt57=2;
                    	    int LA57_0 = input.LA(1);

                    	    if ( (LA57_0==ID) ) {
                    	        int LA57_1 = input.LA(2);

                    	        if ( (synpred79_Fan()) ) {
                    	            alt57=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt57=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 57, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 57, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt57) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:351:29: getter
                    	            {
                    	            pushFollow(FOLLOW_getter_in_fieldDef1865);
                    	            getter178=getter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_getter.add(getter178.getTree());

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:351:38: setter
                    	            {
                    	            pushFollow(FOLLOW_setter_in_fieldDef1869);
                    	            setter179=setter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_setter.add(setter179.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:351:46: ( SP_SEMI )?
                    	    int alt58=2;
                    	    int LA58_0 = input.LA(1);

                    	    if ( (LA58_0==SP_SEMI) ) {
                    	        alt58=1;
                    	    }
                    	    switch (alt58) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
                    	            {
                    	            SP_SEMI180=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_fieldDef1872); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_SP_SEMI.add(SP_SEMI180);


                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:351:55: ( block )?
                    	    int alt59=2;
                    	    int LA59_0 = input.LA(1);

                    	    if ( ((LA59_0>=KW_BREAK && LA59_0<=KW_TRY)||LA59_0==BRACKET_L||LA59_0==SP_PIPE||LA59_0==OP_ELVIS||LA59_0==SQ_BRACKET_L) ) {
                    	        alt59=1;
                    	    }
                    	    else if ( (LA59_0==ID) ) {
                    	        int LA59_2 = input.LA(2);

                    	        if ( (synpred81_Fan()) ) {
                    	            alt59=1;
                    	        }
                    	    }
                    	    switch (alt59) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: block
                    	            {
                    	            pushFollow(FOLLOW_block_in_fieldDef1875);
                    	            block181=block();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_block.add(block181.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
                    } while (true);

                    pushFollow(FOLLOW_bracketR_in_fieldDef1880);
                    bracketR182=bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketR.add(bracketR182.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:352:7: eos
                    {
                    pushFollow(FOLLOW_eos_in_fieldDef1889);
                    eos183=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos183.getTree());

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
            // 353:4: -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:353:7: ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_FIELD, "AST_FIELD"), root_1);

                adaptor.addChild(root_1, stream_typeId.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:353:26: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:353:26: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:353:46: ( expr )?
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:354:1: typeId : ( ( type id )=> typeAndId | fieldId ) ;
    public final FanParser.typeId_return typeId() throws RecognitionException {
        FanParser.typeId_return retval = new FanParser.typeId_return();
        retval.start = input.LT(1);
        int typeId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeAndId_return typeAndId184 = null;

        FanParser.fieldId_return fieldId185 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:9: ( ( ( type id )=> typeAndId | fieldId ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:11: ( ( type id )=> typeAndId | fieldId )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:354:11: ( ( type id )=> typeAndId | fieldId )
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:354:12: ( type id )=> typeAndId
                    {
                    pushFollow(FOLLOW_typeAndId_in_typeId1927);
                    typeAndId184=typeAndId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeAndId184.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:354:35: fieldId
                    {
                    pushFollow(FOLLOW_fieldId_in_typeId1931);
                    fieldId185=fieldId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldId185.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:355:1: fieldId : id ;
    public final FanParser.fieldId_return fieldId() throws RecognitionException {
        FanParser.fieldId_return retval = new FanParser.fieldId_return();
        retval.start = input.LT(1);
        int fieldId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id186 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:10: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:12: id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_fieldId1940);
            id186=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id186.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:356:1: typeAndId : ( type id ) ;
    public final FanParser.typeAndId_return typeAndId() throws RecognitionException {
        FanParser.typeAndId_return retval = new FanParser.typeAndId_return();
        retval.start = input.LT(1);
        int typeAndId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type187 = null;

        FanParser.id_return id188 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:11: ( ( type id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:13: ( type id )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:356:13: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:14: type id
            {
            pushFollow(FOLLOW_type_in_typeAndId1948);
            type187=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type187.getTree());
            pushFollow(FOLLOW_id_in_typeAndId1950);
            id188=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id188.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:357:1: fieldFlags : ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* ;
    public final FanParser.fieldFlags_return fieldFlags() throws RecognitionException {
        FanParser.fieldFlags_return retval = new FanParser.fieldFlags_return();
        retval.start = input.LT(1);
        int fieldFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ABSTRACT189=null;
        Token KW_RD_ONLY190=null;
        Token KW_CONST191=null;
        Token KW_STATIC192=null;
        Token KW_NATIVE193=null;
        Token KW_VOLATILE194=null;
        Token KW_OVERRIDE195=null;
        Token KW_VIRTUAL196=null;
        Token KW_FINAL197=null;
        FanParser.protection_return protection198 = null;


        Object KW_ABSTRACT189_tree=null;
        Object KW_RD_ONLY190_tree=null;
        Object KW_CONST191_tree=null;
        Object KW_STATIC192_tree=null;
        Object KW_NATIVE193_tree=null;
        Object KW_VOLATILE194_tree=null;
        Object KW_OVERRIDE195_tree=null;
        Object KW_VIRTUAL196_tree=null;
        Object KW_FINAL197_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:357:12: ( ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:357:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:357:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            loop63:
            do {
                int alt63=11;
                switch ( input.LA(1) ) {
                case KW_ABSTRACT:
                    {
                    alt63=1;
                    }
                    break;
                case KW_RD_ONLY:
                    {
                    alt63=2;
                    }
                    break;
                case KW_CONST:
                    {
                    alt63=3;
                    }
                    break;
                case KW_STATIC:
                    {
                    alt63=4;
                    }
                    break;
                case KW_NATIVE:
                    {
                    alt63=5;
                    }
                    break;
                case KW_VOLATILE:
                    {
                    alt63=6;
                    }
                    break;
                case KW_OVERRIDE:
                    {
                    alt63=7;
                    }
                    break;
                case KW_VIRTUAL:
                    {
                    alt63=8;
                    }
                    break;
                case KW_FINAL:
                    {
                    alt63=9;
                    }
                    break;
                case KW_PRIVATE:
                case KW_PROTECTED:
                case KW_PUBLIC:
                case KW_INTERNAL:
                    {
                    alt63=10;
                    }
                    break;

                }

                switch (alt63) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:357:15: KW_ABSTRACT
            	    {
            	    KW_ABSTRACT189=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_fieldFlags1959); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_ABSTRACT189_tree = (Object)adaptor.create(KW_ABSTRACT189);
            	    adaptor.addChild(root_0, KW_ABSTRACT189_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:357:29: KW_RD_ONLY
            	    {
            	    KW_RD_ONLY190=(Token)match(input,KW_RD_ONLY,FOLLOW_KW_RD_ONLY_in_fieldFlags1963); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_RD_ONLY190_tree = (Object)adaptor.create(KW_RD_ONLY190);
            	    adaptor.addChild(root_0, KW_RD_ONLY190_tree);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:357:42: KW_CONST
            	    {
            	    KW_CONST191=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_fieldFlags1967); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_CONST191_tree = (Object)adaptor.create(KW_CONST191);
            	    adaptor.addChild(root_0, KW_CONST191_tree);
            	    }

            	    }
            	    break;
            	case 4 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:357:53: KW_STATIC
            	    {
            	    KW_STATIC192=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_fieldFlags1971); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_STATIC192_tree = (Object)adaptor.create(KW_STATIC192);
            	    adaptor.addChild(root_0, KW_STATIC192_tree);
            	    }

            	    }
            	    break;
            	case 5 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:357:65: KW_NATIVE
            	    {
            	    KW_NATIVE193=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_fieldFlags1975); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_NATIVE193_tree = (Object)adaptor.create(KW_NATIVE193);
            	    adaptor.addChild(root_0, KW_NATIVE193_tree);
            	    }

            	    }
            	    break;
            	case 6 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:357:77: KW_VOLATILE
            	    {
            	    KW_VOLATILE194=(Token)match(input,KW_VOLATILE,FOLLOW_KW_VOLATILE_in_fieldFlags1979); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VOLATILE194_tree = (Object)adaptor.create(KW_VOLATILE194);
            	    adaptor.addChild(root_0, KW_VOLATILE194_tree);
            	    }

            	    }
            	    break;
            	case 7 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:357:91: KW_OVERRIDE
            	    {
            	    KW_OVERRIDE195=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_fieldFlags1983); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_OVERRIDE195_tree = (Object)adaptor.create(KW_OVERRIDE195);
            	    adaptor.addChild(root_0, KW_OVERRIDE195_tree);
            	    }

            	    }
            	    break;
            	case 8 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:357:105: KW_VIRTUAL
            	    {
            	    KW_VIRTUAL196=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_fieldFlags1987); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VIRTUAL196_tree = (Object)adaptor.create(KW_VIRTUAL196);
            	    adaptor.addChild(root_0, KW_VIRTUAL196_tree);
            	    }

            	    }
            	    break;
            	case 9 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:357:118: KW_FINAL
            	    {
            	    KW_FINAL197=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_fieldFlags1991); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_FINAL197_tree = (Object)adaptor.create(KW_FINAL197);
            	    adaptor.addChild(root_0, KW_FINAL197_tree);
            	    }

            	    }
            	    break;
            	case 10 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:357:129: protection
            	    {
            	    pushFollow(FOLLOW_protection_in_fieldFlags1995);
            	    protection198=protection();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection198.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:358:1: methodDef : docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody -> ^( AST_METHOD ^( $mname) $returnType ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? ) ;
    public final FanParser.methodDef_return methodDef() throws RecognitionException {
        FanParser.methodDef_return retval = new FanParser.methodDef_return();
        retval.start = input.LT(1);
        int methodDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.methodFlags_return m = null;

        FanParser.type_return returnType = null;

        FanParser.id_return mname = null;

        FanParser.docs_return docs199 = null;

        FanParser.facet_return facet200 = null;

        FanParser.parL_return parL201 = null;

        FanParser.params_return params202 = null;

        FanParser.parR_return parR203 = null;

        FanParser.methodBody_return methodBody204 = null;


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
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:3: ( docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody -> ^( AST_METHOD ^( $mname) $returnType ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:5: docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody
            {
            pushFollow(FOLLOW_docs_in_methodDef2015);
            docs199=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs199.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:10: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_methodDef2017);
            	    facet200=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet200.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:359:18: (m= methodFlags )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=KW_STATIC && LA65_0<=KW_NATIVE)||(LA65_0>=KW_OVERRIDE && LA65_0<=KW_FINAL)||(LA65_0>=KW_ABSTRACT && LA65_0<=KW_INTERNAL)||LA65_0==KW_ONCE) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= methodFlags
            	    {
            	    pushFollow(FOLLOW_methodFlags_in_methodDef2022);
            	    m=methodFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_methodFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            pushFollow(FOLLOW_type_in_methodDef2027);
            returnType=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(returnType.getTree());
            pushFollow(FOLLOW_id_in_methodDef2033);
            mname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(mname.getTree());
            pushFollow(FOLLOW_parL_in_methodDef2035);
            parL201=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL201.getTree());
            pushFollow(FOLLOW_params_in_methodDef2037);
            params202=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_params.add(params202.getTree());
            pushFollow(FOLLOW_parR_in_methodDef2039);
            parR203=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR203.getTree());
            pushFollow(FOLLOW_methodBody_in_methodDef2041);
            methodBody204=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodBody.add(methodBody204.getTree());


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
            // 360:7: -> ^( AST_METHOD ^( $mname) $returnType ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:360:10: ^( AST_METHOD ^( $mname) $returnType ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_METHOD, "AST_METHOD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:360:23: ^( $mname)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_mname.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_returnType.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:360:45: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:360:53: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:53: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:360:73: ( methodBody )?
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:361:1: methodFlags : ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL );
    public final FanParser.methodFlags_return methodFlags() throws RecognitionException {
        FanParser.methodFlags_return retval = new FanParser.methodFlags_return();
        retval.start = input.LT(1);
        int methodFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_VIRTUAL206=null;
        Token KW_OVERRIDE207=null;
        Token KW_ABSTRACT208=null;
        Token KW_STATIC209=null;
        Token KW_ONCE210=null;
        Token KW_NATIVE211=null;
        Token KW_FINAL212=null;
        FanParser.protection_return protection205 = null;


        Object KW_VIRTUAL206_tree=null;
        Object KW_OVERRIDE207_tree=null;
        Object KW_ABSTRACT208_tree=null;
        Object KW_STATIC209_tree=null;
        Object KW_ONCE210_tree=null;
        Object KW_NATIVE211_tree=null;
        Object KW_FINAL212_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:13: ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL )
            int alt66=8;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt66=1;
                }
                break;
            case KW_VIRTUAL:
                {
                alt66=2;
                }
                break;
            case KW_OVERRIDE:
                {
                alt66=3;
                }
                break;
            case KW_ABSTRACT:
                {
                alt66=4;
                }
                break;
            case KW_STATIC:
                {
                alt66=5;
                }
                break;
            case KW_ONCE:
                {
                alt66=6;
                }
                break;
            case KW_NATIVE:
                {
                alt66=7;
                }
                break;
            case KW_FINAL:
                {
                alt66=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:361:15: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_methodFlags2083);
                    protection205=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection205.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:361:28: KW_VIRTUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_VIRTUAL206=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_methodFlags2087); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_VIRTUAL206_tree = (Object)adaptor.create(KW_VIRTUAL206);
                    adaptor.addChild(root_0, KW_VIRTUAL206_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:361:41: KW_OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_OVERRIDE207=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_methodFlags2091); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_OVERRIDE207_tree = (Object)adaptor.create(KW_OVERRIDE207);
                    adaptor.addChild(root_0, KW_OVERRIDE207_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:361:55: KW_ABSTRACT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ABSTRACT208=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_methodFlags2095); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ABSTRACT208_tree = (Object)adaptor.create(KW_ABSTRACT208);
                    adaptor.addChild(root_0, KW_ABSTRACT208_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:361:69: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC209=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_methodFlags2099); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC209_tree = (Object)adaptor.create(KW_STATIC209);
                    adaptor.addChild(root_0, KW_STATIC209_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:361:81: KW_ONCE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ONCE210=(Token)match(input,KW_ONCE,FOLLOW_KW_ONCE_in_methodFlags2103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ONCE210_tree = (Object)adaptor.create(KW_ONCE210);
                    adaptor.addChild(root_0, KW_ONCE210_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:362:5: KW_NATIVE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NATIVE211=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_methodFlags2111); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NATIVE211_tree = (Object)adaptor.create(KW_NATIVE211);
                    adaptor.addChild(root_0, KW_NATIVE211_tree);
                    }

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:362:17: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL212=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_methodFlags2115); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL212_tree = (Object)adaptor.create(KW_FINAL212);
                    adaptor.addChild(root_0, KW_FINAL212_tree);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:363:1: params : ( param ( SP_COMMA param )* )? ;
    public final FanParser.params_return params() throws RecognitionException {
        FanParser.params_return retval = new FanParser.params_return();
        retval.start = input.LT(1);
        int params_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA214=null;
        FanParser.param_return param213 = null;

        FanParser.param_return param215 = null;


        Object SP_COMMA214_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:9: ( ( param ( SP_COMMA param )* )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:11: ( param ( SP_COMMA param )* )?
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:363:11: ( param ( SP_COMMA param )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==SP_PIPE||LA68_0==ID||LA68_0==SQ_BRACKET_L) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:363:12: param ( SP_COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_params2124);
                    param213=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, param213.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:363:18: ( SP_COMMA param )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==SP_COMMA) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:363:19: SP_COMMA param
                    	    {
                    	    SP_COMMA214=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_params2127); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA214_tree = (Object)adaptor.create(SP_COMMA214);
                    	    adaptor.addChild(root_0, SP_COMMA214_tree);
                    	    }
                    	    pushFollow(FOLLOW_param_in_params2129);
                    	    param215=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, param215.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:364:1: param : ( type id ( AS_INIT_VAL expr )? ) -> ^( AST_PARAM type id ( AS_INIT_VAL expr )? ) ;
    public final FanParser.param_return param() throws RecognitionException {
        FanParser.param_return retval = new FanParser.param_return();
        retval.start = input.LT(1);
        int param_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL218=null;
        FanParser.type_return type216 = null;

        FanParser.id_return id217 = null;

        FanParser.expr_return expr219 = null;


        Object AS_INIT_VAL218_tree=null;
        RewriteRuleTokenStream stream_AS_INIT_VAL=new RewriteRuleTokenStream(adaptor,"token AS_INIT_VAL");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:9: ( ( type id ( AS_INIT_VAL expr )? ) -> ^( AST_PARAM type id ( AS_INIT_VAL expr )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:11: ( type id ( AS_INIT_VAL expr )? )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:11: ( type id ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:12: type id ( AS_INIT_VAL expr )?
            {
            pushFollow(FOLLOW_type_in_param2143);
            type216=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type216.getTree());
            pushFollow(FOLLOW_id_in_param2145);
            id217=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id217.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:20: ( AS_INIT_VAL expr )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==AS_INIT_VAL) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:364:21: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL218=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_param2148); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL218);

                    pushFollow(FOLLOW_expr_in_param2150);
                    expr219=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr219.getTree());

                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: expr, AS_INIT_VAL, type, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 365:4: -> ^( AST_PARAM type id ( AS_INIT_VAL expr )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:365:7: ^( AST_PARAM type id ( AS_INIT_VAL expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_PARAM, "AST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_id.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:365:27: ( AS_INIT_VAL expr )?
                if ( stream_expr.hasNext()||stream_AS_INIT_VAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_AS_INIT_VAL.nextNode());
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                stream_AS_INIT_VAL.reset();

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:366:1: methodBody : ( ( multiStmt )=> multiStmt | eos ) ;
    public final FanParser.methodBody_return methodBody() throws RecognitionException {
        FanParser.methodBody_return retval = new FanParser.methodBody_return();
        retval.start = input.LT(1);
        int methodBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt220 = null;

        FanParser.eos_return eos221 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:12: ( ( ( multiStmt )=> multiStmt | eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:14: ( ( multiStmt )=> multiStmt | eos )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:366:14: ( ( multiStmt )=> multiStmt | eos )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==BRACKET_L) && (synpred107_Fan())) {
                alt70=1;
            }
            else if ( (LA70_0==EOF||(LA70_0>=KW_RD_ONLY && LA70_0<=KW_FINAL)||(LA70_0>=KW_ABSTRACT && LA70_0<=KW_ONCE)||LA70_0==BRACKET_R||LA70_0==SP_PIPE||LA70_0==SP_SEMI||LA70_0==ID||(LA70_0>=AT && LA70_0<=DOC)||LA70_0==SQ_BRACKET_L) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:366:15: ( multiStmt )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_methodBody2185);
                    multiStmt220=multiStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt220.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:366:40: eos
                    {
                    pushFollow(FOLLOW_eos_in_methodBody2189);
                    eos221=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos221.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:367:1: ctorDef : docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody -> ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? ) ;
    public final FanParser.ctorDef_return ctorDef() throws RecognitionException {
        FanParser.ctorDef_return retval = new FanParser.ctorDef_return();
        retval.start = input.LT(1);
        int ctorDef_StartIndex = input.index();
        Object root_0 = null;

        Token cchain=null;
        Token KW_NEW224=null;
        FanParser.ctorFlags_return m = null;

        FanParser.id_return cname = null;

        FanParser.docs_return docs222 = null;

        FanParser.facet_return facet223 = null;

        FanParser.parL_return parL225 = null;

        FanParser.params_return params226 = null;

        FanParser.parR_return parR227 = null;

        FanParser.ctorChain_return ctorChain228 = null;

        FanParser.methodBody_return methodBody229 = null;


        Object cchain_tree=null;
        Object KW_NEW224_tree=null;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:368:3: ( docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody -> ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:368:5: docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody
            {
            pushFollow(FOLLOW_docs_in_ctorDef2209);
            docs222=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs222.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:368:10: ( facet )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==AT) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_ctorDef2211);
            	    facet223=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet223.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:368:18: (m= ctorFlags )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=KW_PRIVATE && LA72_0<=KW_INTERNAL)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= ctorFlags
            	    {
            	    pushFollow(FOLLOW_ctorFlags_in_ctorDef2216);
            	    m=ctorFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ctorFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            KW_NEW224=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_ctorDef2219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_NEW.add(KW_NEW224);

            pushFollow(FOLLOW_id_in_ctorDef2223);
            cname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(cname.getTree());
            pushFollow(FOLLOW_parL_in_ctorDef2225);
            parL225=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL225.getTree());
            pushFollow(FOLLOW_params_in_ctorDef2227);
            params226=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_params.add(params226.getTree());
            pushFollow(FOLLOW_parR_in_ctorDef2229);
            parR227=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR227.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:368:69: (cchain= ( ( SP_COLON )=> ctorChain ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==SP_COLON) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: cchain= ( ( SP_COLON )=> ctorChain )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:368:70: ( ( SP_COLON )=> ctorChain )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:368:71: ( SP_COLON )=> ctorChain
                    {
                    pushFollow(FOLLOW_ctorChain_in_ctorDef2238);
                    ctorChain228=ctorChain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ctorChain.add(ctorChain228.getTree());

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_ctorDef2242);
            methodBody229=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodBody.add(methodBody229.getTree());


            // AST REWRITE
            // elements: cname, cchain, params, methodBody, m
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
            // 369:7: -> ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:369:10: ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CONSTRUCTOR, "AST_CONSTRUCTOR"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:369:28: ^( $cname)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_cname.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:369:38: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:369:46: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:369:46: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:369:66: ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )*
                while ( stream_cchain.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:369:66: ^( AST_CONSTRUCTOR_CHAIN $cchain)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CONSTRUCTOR_CHAIN, "AST_CONSTRUCTOR_CHAIN"), root_2);

                    adaptor.addChild(root_2, stream_cchain.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_cchain.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:369:100: ( methodBody )?
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:370:1: ctorFlags : protection ;
    public final FanParser.ctorFlags_return ctorFlags() throws RecognitionException {
        FanParser.ctorFlags_return retval = new FanParser.ctorFlags_return();
        retval.start = input.LT(1);
        int ctorFlags_StartIndex = input.index();
        Object root_0 = null;

        FanParser.protection_return protection230 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:370:11: ( protection )
            // src/net/colar/netbeans/fan/antlr/Fan.g:370:13: protection
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_protection_in_ctorFlags2289);
            protection230=protection();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protection230.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:371:1: ctorChain : SP_COLON ( ctorChainThis | ctorChainSuper ) ;
    public final FanParser.ctorChain_return ctorChain() throws RecognitionException {
        FanParser.ctorChain_return retval = new FanParser.ctorChain_return();
        retval.start = input.LT(1);
        int ctorChain_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON231=null;
        FanParser.ctorChainThis_return ctorChainThis232 = null;

        FanParser.ctorChainSuper_return ctorChainSuper233 = null;


        Object SP_COLON231_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:11: ( SP_COLON ( ctorChainThis | ctorChainSuper ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:13: SP_COLON ( ctorChainThis | ctorChainSuper )
            {
            root_0 = (Object)adaptor.nil();

            SP_COLON231=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ctorChain2296); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON231_tree = (Object)adaptor.create(SP_COLON231);
            adaptor.addChild(root_0, SP_COLON231_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:22: ( ctorChainThis | ctorChainSuper )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==KW_THIS) ) {
                alt74=1;
            }
            else if ( (LA74_0==KW_SUPER) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:371:23: ctorChainThis
                    {
                    pushFollow(FOLLOW_ctorChainThis_in_ctorChain2299);
                    ctorChainThis232=ctorChainThis();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainThis232.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:371:39: ctorChainSuper
                    {
                    pushFollow(FOLLOW_ctorChainSuper_in_ctorChain2303);
                    ctorChainSuper233=ctorChainSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainSuper233.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:373:1: ctorChainThis : KW_THIS DOT id parL ( args )? parR ;
    public final FanParser.ctorChainThis_return ctorChainThis() throws RecognitionException {
        FanParser.ctorChainThis_return retval = new FanParser.ctorChainThis_return();
        retval.start = input.LT(1);
        int ctorChainThis_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THIS234=null;
        Token DOT235=null;
        FanParser.id_return id236 = null;

        FanParser.parL_return parL237 = null;

        FanParser.args_return args238 = null;

        FanParser.parR_return parR239 = null;


        Object KW_THIS234_tree=null;
        Object DOT235_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:15: ( KW_THIS DOT id parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:17: KW_THIS DOT id parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_THIS234=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_ctorChainThis2312); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THIS234_tree = (Object)adaptor.create(KW_THIS234);
            adaptor.addChild(root_0, KW_THIS234_tree);
            }
            DOT235=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainThis2314); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT235_tree = (Object)adaptor.create(DOT235);
            adaptor.addChild(root_0, DOT235_tree);
            }
            pushFollow(FOLLOW_id_in_ctorChainThis2316);
            id236=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id236.getTree());
            pushFollow(FOLLOW_parL_in_ctorChainThis2318);
            parL237=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL237.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:37: ( args )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==OP_ELVIS) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainThis2320);
                    args238=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args238.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainThis2323);
            parR239=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR239.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:374:1: ctorChainSuper : KW_SUPER ( DOT id )? parL ( args )? parR ;
    public final FanParser.ctorChainSuper_return ctorChainSuper() throws RecognitionException {
        FanParser.ctorChainSuper_return retval = new FanParser.ctorChainSuper_return();
        retval.start = input.LT(1);
        int ctorChainSuper_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SUPER240=null;
        Token DOT241=null;
        FanParser.id_return id242 = null;

        FanParser.parL_return parL243 = null;

        FanParser.args_return args244 = null;

        FanParser.parR_return parR245 = null;


        Object KW_SUPER240_tree=null;
        Object DOT241_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:374:16: ( KW_SUPER ( DOT id )? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:374:18: KW_SUPER ( DOT id )? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_SUPER240=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_ctorChainSuper2330); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SUPER240_tree = (Object)adaptor.create(KW_SUPER240);
            adaptor.addChild(root_0, KW_SUPER240_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:374:27: ( DOT id )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==DOT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:374:28: DOT id
                    {
                    DOT241=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainSuper2333); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT241_tree = (Object)adaptor.create(DOT241);
                    adaptor.addChild(root_0, DOT241_tree);
                    }
                    pushFollow(FOLLOW_id_in_ctorChainSuper2335);
                    id242=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id242.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parL_in_ctorChainSuper2339);
            parL243=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL243.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:374:42: ( args )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==OP_ELVIS) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainSuper2341);
                    args244=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args244.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainSuper2344);
            parR245=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR245.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:376:1: staticBlock : KW_STATIC block ;
    public final FanParser.staticBlock_return staticBlock() throws RecognitionException {
        FanParser.staticBlock_return retval = new FanParser.staticBlock_return();
        retval.start = input.LT(1);
        int staticBlock_StartIndex = input.index();
        Object root_0 = null;

        Token KW_STATIC246=null;
        FanParser.block_return block247 = null;


        Object KW_STATIC246_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:13: ( KW_STATIC block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:15: KW_STATIC block
            {
            root_0 = (Object)adaptor.nil();

            KW_STATIC246=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_staticBlock2352); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_STATIC246_tree = (Object)adaptor.create(KW_STATIC246);
            adaptor.addChild(root_0, KW_STATIC246_tree);
            }
            pushFollow(FOLLOW_block_in_staticBlock2354);
            block247=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block247.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:377:1: block : ( ( bracketL )=> multiStmt | stmt ) ;
    public final FanParser.block_return block() throws RecognitionException {
        FanParser.block_return retval = new FanParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt248 = null;

        FanParser.stmt_return stmt249 = null;



        paraphrase.push("Block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:3: ( ( ( bracketL )=> multiStmt | stmt ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:5: ( ( bracketL )=> multiStmt | stmt )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:378:5: ( ( bracketL )=> multiStmt | stmt )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==BRACKET_L) && (synpred116_Fan())) {
                alt78=1;
            }
            else if ( ((LA78_0>=KW_BREAK && LA78_0<=KW_TRY)||LA78_0==SP_PIPE||LA78_0==OP_ELVIS||LA78_0==ID||LA78_0==SQ_BRACKET_L) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:378:6: ( bracketL )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_block2379);
                    multiStmt248=multiStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt248.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:378:30: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_block2383);
                    stmt249=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt249.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:379:1: multiStmt : bracketL ( stmt )* bracketR -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR ) ;
    public final FanParser.multiStmt_return multiStmt() throws RecognitionException {
        FanParser.multiStmt_return retval = new FanParser.multiStmt_return();
        retval.start = input.LT(1);
        int multiStmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL250 = null;

        FanParser.stmt_return stmt251 = null;

        FanParser.bracketR_return bracketR252 = null;


        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:11: ( bracketL ( stmt )* bracketR -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:13: bracketL ( stmt )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_multiStmt2391);
            bracketL250=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL250.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:22: ( stmt )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=KW_BREAK && LA79_0<=KW_TRY)||LA79_0==SP_PIPE||LA79_0==OP_ELVIS||LA79_0==ID||LA79_0==SQ_BRACKET_L) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_multiStmt2393);
            	    stmt251=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt251.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_multiStmt2396);
            bracketR252=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR252.getTree());


            // AST REWRITE
            // elements: bracketL, stmt, bracketR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 379:37: -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:379:40: ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:379:66: ( ( stmt )* )?
                if ( stream_stmt.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:379:67: ( stmt )*
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:380:1: stmt : ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) ;
    public final FanParser.stmt_return stmt() throws RecognitionException {
        FanParser.stmt_return retval = new FanParser.stmt_return();
        retval.start = input.LT(1);
        int stmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.g_if_return g_if253 = null;

        FanParser.g_for_return g_for254 = null;

        FanParser.g_while_return g_while255 = null;

        FanParser.g_break_return g_break256 = null;

        FanParser.g_continue_return g_continue257 = null;

        FanParser.g_return_return g_return258 = null;

        FanParser.g_switch_return g_switch259 = null;

        FanParser.g_throw_return g_throw260 = null;

        FanParser.g_try_return g_try261 = null;

        FanParser.exprStmt_return exprStmt262 = null;

        FanParser.localDef_return localDef263 = null;



        paraphrase.push("Statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:382:3: ( ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:382:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:382:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            int alt80=11;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:382:6: g_if
                    {
                    pushFollow(FOLLOW_g_if_in_stmt2431);
                    g_if253=g_if();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_if253.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:382:13: g_for
                    {
                    pushFollow(FOLLOW_g_for_in_stmt2435);
                    g_for254=g_for();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_for254.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:382:21: g_while
                    {
                    pushFollow(FOLLOW_g_while_in_stmt2439);
                    g_while255=g_while();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_while255.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:382:31: g_break
                    {
                    pushFollow(FOLLOW_g_break_in_stmt2443);
                    g_break256=g_break();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_break256.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:383:4: g_continue
                    {
                    pushFollow(FOLLOW_g_continue_in_stmt2450);
                    g_continue257=g_continue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_continue257.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:383:17: g_return
                    {
                    pushFollow(FOLLOW_g_return_in_stmt2454);
                    g_return258=g_return();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_return258.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:383:28: g_switch
                    {
                    pushFollow(FOLLOW_g_switch_in_stmt2458);
                    g_switch259=g_switch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_switch259.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:384:4: g_throw
                    {
                    pushFollow(FOLLOW_g_throw_in_stmt2465);
                    g_throw260=g_throw();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_throw260.getTree());

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:384:14: g_try
                    {
                    pushFollow(FOLLOW_g_try_in_stmt2469);
                    g_try261=g_try();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_try261.getTree());

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:384:22: exprStmt
                    {
                    pushFollow(FOLLOW_exprStmt_in_stmt2473);
                    exprStmt262=exprStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprStmt262.getTree());

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:384:33: localDef
                    {
                    pushFollow(FOLLOW_localDef_in_stmt2477);
                    localDef263=localDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localDef263.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:386:1: stmtList : s= ( ( stmt )* ) -> ^( AST_CODE_BLOCK ( $s)? ) ;
    public final FanParser.stmtList_return stmtList() throws RecognitionException {
        FanParser.stmtList_return retval = new FanParser.stmtList_return();
        retval.start = input.LT(1);
        int stmtList_StartIndex = input.index();
        Object root_0 = null;

        Token s=null;
        FanParser.stmt_return stmt264 = null;


        Object s_tree=null;
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:10: (s= ( ( stmt )* ) -> ^( AST_CODE_BLOCK ( $s)? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:12: s= ( ( stmt )* )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:14: ( ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:15: ( stmt )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:15: ( stmt )*
            loop81:
            do {
                int alt81=2;
                alt81 = dfa81.predict(input);
                switch (alt81) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmtList2490);
            	    stmt264=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt264.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
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
            // 386:22: -> ^( AST_CODE_BLOCK ( $s)? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:386:25: ^( AST_CODE_BLOCK ( $s)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:386:42: ( $s)?
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:392:1: g_break : KW_BREAK eos ;
    public final FanParser.g_break_return g_break() throws RecognitionException {
        FanParser.g_break_return retval = new FanParser.g_break_return();
        retval.start = input.LT(1);
        int g_break_StartIndex = input.index();
        Object root_0 = null;

        Token KW_BREAK265=null;
        FanParser.eos_return eos266 = null;


        Object KW_BREAK265_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:10: ( KW_BREAK eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:12: KW_BREAK eos
            {
            root_0 = (Object)adaptor.nil();

            KW_BREAK265=(Token)match(input,KW_BREAK,FOLLOW_KW_BREAK_in_g_break2512); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_BREAK265_tree = (Object)adaptor.create(KW_BREAK265);
            adaptor.addChild(root_0, KW_BREAK265_tree);
            }
            pushFollow(FOLLOW_eos_in_g_break2514);
            eos266=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos266.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:393:1: g_continue : KW_CONTINUE eos ;
    public final FanParser.g_continue_return g_continue() throws RecognitionException {
        FanParser.g_continue_return retval = new FanParser.g_continue_return();
        retval.start = input.LT(1);
        int g_continue_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CONTINUE267=null;
        FanParser.eos_return eos268 = null;


        Object KW_CONTINUE267_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:12: ( KW_CONTINUE eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:14: KW_CONTINUE eos
            {
            root_0 = (Object)adaptor.nil();

            KW_CONTINUE267=(Token)match(input,KW_CONTINUE,FOLLOW_KW_CONTINUE_in_g_continue2521); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CONTINUE267_tree = (Object)adaptor.create(KW_CONTINUE267);
            adaptor.addChild(root_0, KW_CONTINUE267_tree);
            }
            pushFollow(FOLLOW_eos_in_g_continue2523);
            eos268=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos268.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:394:1: g_for : ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ) -> ^( AST_SCOPE KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ) ;
    public final FanParser.g_for_return g_for() throws RecognitionException {
        FanParser.g_for_return retval = new FanParser.g_for_return();
        retval.start = input.LT(1);
        int g_for_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FOR269=null;
        Token SP_SEMI272=null;
        Token SP_SEMI274=null;
        FanParser.parL_return parL270 = null;

        FanParser.forInit_return forInit271 = null;

        FanParser.expr_return expr273 = null;

        FanParser.expr_return expr275 = null;

        FanParser.parR_return parR276 = null;

        FanParser.block_return block277 = null;


        Object KW_FOR269_tree=null;
        Object SP_SEMI272_tree=null;
        Object SP_SEMI274_tree=null;
        RewriteRuleTokenStream stream_SP_SEMI=new RewriteRuleTokenStream(adaptor,"token SP_SEMI");
        RewriteRuleTokenStream stream_KW_FOR=new RewriteRuleTokenStream(adaptor,"token KW_FOR");
        RewriteRuleSubtreeStream stream_parL=new RewriteRuleSubtreeStream(adaptor,"rule parL");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
        RewriteRuleSubtreeStream stream_parR=new RewriteRuleSubtreeStream(adaptor,"rule parR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:8: ( ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ) -> ^( AST_SCOPE KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:10: ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:10: ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:11: KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block
            {
            KW_FOR269=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_g_for2532); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR269);

            pushFollow(FOLLOW_parL_in_g_for2534);
            parL270=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL270.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:23: ( forInit )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==SP_PIPE||LA82_0==OP_ELVIS||LA82_0==ID||LA82_0==SQ_BRACKET_L) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_g_for2536);
                    forInit271=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forInit.add(forInit271.getTree());

                    }
                    break;

            }

            SP_SEMI272=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for2539); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_SEMI.add(SP_SEMI272);

            // src/net/colar/netbeans/fan/antlr/Fan.g:394:40: ( expr )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==OP_ELVIS) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for2541);
                    expr273=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr273.getTree());

                    }
                    break;

            }

            SP_SEMI274=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for2544); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_SEMI.add(SP_SEMI274);

            // src/net/colar/netbeans/fan/antlr/Fan.g:394:54: ( expr )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==OP_ELVIS) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for2546);
                    expr275=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr275.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_g_for2549);
            parR276=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR276.getTree());
            pushFollow(FOLLOW_block_in_g_for2552);
            block277=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block277.getTree());

            }



            // AST REWRITE
            // elements: KW_FOR, SP_SEMI, block, expr, parL, forInit, parR, expr, SP_SEMI
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 395:5: -> ^( AST_SCOPE KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:395:8: ^( AST_SCOPE KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SCOPE, "AST_SCOPE"), root_1);

                adaptor.addChild(root_1, stream_KW_FOR.nextNode());
                adaptor.addChild(root_1, stream_parL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:395:32: ( forInit )?
                if ( stream_forInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_forInit.nextTree());

                }
                stream_forInit.reset();
                adaptor.addChild(root_1, stream_SP_SEMI.nextNode());
                // src/net/colar/netbeans/fan/antlr/Fan.g:395:49: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                adaptor.addChild(root_1, stream_SP_SEMI.nextNode());
                // src/net/colar/netbeans/fan/antlr/Fan.g:395:63: ( expr )?
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:396:1: g_if : KW_IF parL expr parR block ( KW_ELSE block )? ;
    public final FanParser.g_if_return g_if() throws RecognitionException {
        FanParser.g_if_return retval = new FanParser.g_if_return();
        retval.start = input.LT(1);
        int g_if_StartIndex = input.index();
        Object root_0 = null;

        Token KW_IF278=null;
        Token KW_ELSE283=null;
        FanParser.parL_return parL279 = null;

        FanParser.expr_return expr280 = null;

        FanParser.parR_return parR281 = null;

        FanParser.block_return block282 = null;

        FanParser.block_return block284 = null;


        Object KW_IF278_tree=null;
        Object KW_ELSE283_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:7: ( KW_IF parL expr parR block ( KW_ELSE block )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:9: KW_IF parL expr parR block ( KW_ELSE block )?
            {
            root_0 = (Object)adaptor.nil();

            KW_IF278=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_g_if2593); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_IF278_tree = (Object)adaptor.create(KW_IF278);
            adaptor.addChild(root_0, KW_IF278_tree);
            }
            pushFollow(FOLLOW_parL_in_g_if2595);
            parL279=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL279.getTree());
            pushFollow(FOLLOW_expr_in_g_if2597);
            expr280=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr280.getTree());
            pushFollow(FOLLOW_parR_in_g_if2599);
            parR281=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR281.getTree());
            pushFollow(FOLLOW_block_in_g_if2601);
            block282=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block282.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:397:5: ( KW_ELSE block )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==KW_ELSE) ) {
                int LA85_1 = input.LA(2);

                if ( (synpred132_Fan()) ) {
                    alt85=1;
                }
            }
            switch (alt85) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:397:6: KW_ELSE block
                    {
                    KW_ELSE283=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_g_if2608); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ELSE283_tree = (Object)adaptor.create(KW_ELSE283);
                    adaptor.addChild(root_0, KW_ELSE283_tree);
                    }
                    pushFollow(FOLLOW_block_in_g_if2610);
                    block284=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block284.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:398:1: g_return : KW_RETURN ( eos | expr eos ) ;
    public final FanParser.g_return_return g_return() throws RecognitionException {
        FanParser.g_return_return retval = new FanParser.g_return_return();
        retval.start = input.LT(1);
        int g_return_StartIndex = input.index();
        Object root_0 = null;

        Token KW_RETURN285=null;
        FanParser.eos_return eos286 = null;

        FanParser.expr_return expr287 = null;

        FanParser.eos_return eos288 = null;


        Object KW_RETURN285_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:10: ( KW_RETURN ( eos | expr eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:12: KW_RETURN ( eos | expr eos )
            {
            root_0 = (Object)adaptor.nil();

            KW_RETURN285=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_g_return2619); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_RETURN285_tree = (Object)adaptor.create(KW_RETURN285);
            adaptor.addChild(root_0, KW_RETURN285_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:22: ( eos | expr eos )
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:23: eos
                    {
                    pushFollow(FOLLOW_eos_in_g_return2622);
                    eos286=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos286.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:398:29: expr eos
                    {
                    pushFollow(FOLLOW_expr_in_g_return2626);
                    expr287=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr287.getTree());
                    pushFollow(FOLLOW_eos_in_g_return2628);
                    eos288=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos288.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:399:1: g_switch : KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR ;
    public final FanParser.g_switch_return g_switch() throws RecognitionException {
        FanParser.g_switch_return retval = new FanParser.g_switch_return();
        retval.start = input.LT(1);
        int g_switch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SWITCH289=null;
        FanParser.parL_return parL290 = null;

        FanParser.expr_return expr291 = null;

        FanParser.parR_return parR292 = null;

        FanParser.bracketL_return bracketL293 = null;

        FanParser.g_case_return g_case294 = null;

        FanParser.g_default_return g_default295 = null;

        FanParser.bracketR_return bracketR296 = null;


        Object KW_SWITCH289_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:10: ( KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:12: KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR
            {
            root_0 = (Object)adaptor.nil();

            KW_SWITCH289=(Token)match(input,KW_SWITCH,FOLLOW_KW_SWITCH_in_g_switch2636); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SWITCH289_tree = (Object)adaptor.create(KW_SWITCH289);
            adaptor.addChild(root_0, KW_SWITCH289_tree);
            }
            pushFollow(FOLLOW_parL_in_g_switch2638);
            parL290=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL290.getTree());
            pushFollow(FOLLOW_expr_in_g_switch2640);
            expr291=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr291.getTree());
            pushFollow(FOLLOW_parR_in_g_switch2642);
            parR292=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR292.getTree());
            pushFollow(FOLLOW_bracketL_in_g_switch2644);
            bracketL293=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL293.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:46: ( g_case )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==KW_CASE) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:399:47: g_case
            	    {
            	    pushFollow(FOLLOW_g_case_in_g_switch2647);
            	    g_case294=g_case();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_case294.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:399:56: ( g_default )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==KW_DEFAULT) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:57: g_default
                    {
                    pushFollow(FOLLOW_g_default_in_g_switch2652);
                    g_default295=g_default();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_default295.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_bracketR_in_g_switch2656);
            bracketR296=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR296.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:400:1: g_throw : KW_THROW expr eos ;
    public final FanParser.g_throw_return g_throw() throws RecognitionException {
        FanParser.g_throw_return retval = new FanParser.g_throw_return();
        retval.start = input.LT(1);
        int g_throw_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THROW297=null;
        FanParser.expr_return expr298 = null;

        FanParser.eos_return eos299 = null;


        Object KW_THROW297_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:10: ( KW_THROW expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:12: KW_THROW expr eos
            {
            root_0 = (Object)adaptor.nil();

            KW_THROW297=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_g_throw2664); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THROW297_tree = (Object)adaptor.create(KW_THROW297);
            adaptor.addChild(root_0, KW_THROW297_tree);
            }
            pushFollow(FOLLOW_expr_in_g_throw2666);
            expr298=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr298.getTree());
            pushFollow(FOLLOW_eos_in_g_throw2668);
            eos299=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos299.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:401:1: g_while : KW_WHILE parL expr parR block ;
    public final FanParser.g_while_return g_while() throws RecognitionException {
        FanParser.g_while_return retval = new FanParser.g_while_return();
        retval.start = input.LT(1);
        int g_while_StartIndex = input.index();
        Object root_0 = null;

        Token KW_WHILE300=null;
        FanParser.parL_return parL301 = null;

        FanParser.expr_return expr302 = null;

        FanParser.parR_return parR303 = null;

        FanParser.block_return block304 = null;


        Object KW_WHILE300_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:10: ( KW_WHILE parL expr parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:12: KW_WHILE parL expr parR block
            {
            root_0 = (Object)adaptor.nil();

            KW_WHILE300=(Token)match(input,KW_WHILE,FOLLOW_KW_WHILE_in_g_while2676); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_WHILE300_tree = (Object)adaptor.create(KW_WHILE300);
            adaptor.addChild(root_0, KW_WHILE300_tree);
            }
            pushFollow(FOLLOW_parL_in_g_while2678);
            parL301=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL301.getTree());
            pushFollow(FOLLOW_expr_in_g_while2680);
            expr302=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr302.getTree());
            pushFollow(FOLLOW_parR_in_g_while2682);
            parR303=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR303.getTree());
            pushFollow(FOLLOW_block_in_g_while2684);
            block304=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block304.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:402:1: g_try : ( KW_TRY g_try_content ) -> ^( AST_SCOPE KW_TRY g_try_content ) ;
    public final FanParser.g_try_return g_try() throws RecognitionException {
        FanParser.g_try_return retval = new FanParser.g_try_return();
        retval.start = input.LT(1);
        int g_try_StartIndex = input.index();
        Object root_0 = null;

        Token KW_TRY305=null;
        FanParser.g_try_content_return g_try_content306 = null;


        Object KW_TRY305_tree=null;
        RewriteRuleTokenStream stream_KW_TRY=new RewriteRuleTokenStream(adaptor,"token KW_TRY");
        RewriteRuleSubtreeStream stream_g_try_content=new RewriteRuleSubtreeStream(adaptor,"rule g_try_content");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:8: ( ( KW_TRY g_try_content ) -> ^( AST_SCOPE KW_TRY g_try_content ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:10: ( KW_TRY g_try_content )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:10: ( KW_TRY g_try_content )
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:11: KW_TRY g_try_content
            {
            KW_TRY305=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_g_try2693); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TRY.add(KW_TRY305);

            pushFollow(FOLLOW_g_try_content_in_g_try2695);
            g_try_content306=g_try_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_g_try_content.add(g_try_content306.getTree());

            }



            // AST REWRITE
            // elements: KW_TRY, g_try_content
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 403:5: -> ^( AST_SCOPE KW_TRY g_try_content )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:403:8: ^( AST_SCOPE KW_TRY g_try_content )
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:404:1: g_try_content : ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? ;
    public final FanParser.g_try_content_return g_try_content() throws RecognitionException {
        FanParser.g_try_content_return retval = new FanParser.g_try_content_return();
        retval.start = input.LT(1);
        int g_try_content_StartIndex = input.index();
        Object root_0 = null;

        FanParser.try_long_return try_long307 = null;

        FanParser.stmtList_return stmtList308 = null;

        FanParser.g_catch_return g_catch309 = null;

        FanParser.g_finally_return g_finally310 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:14: ( ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:16: ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )?
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:404:16: ( ( bracketL )=> try_long | stmtList )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==BRACKET_L) && (synpred136_Fan())) {
                alt89=1;
            }
            else if ( (LA89_0==EOF||(LA89_0>=KW_BREAK && LA89_0<=KW_FINALLY)||(LA89_0>=KW_RD_ONLY && LA89_0<=KW_FINAL)||(LA89_0>=KW_ABSTRACT && LA89_0<=KW_ONCE)||LA89_0==KW_ELSE||LA89_0==BRACKET_R||LA89_0==SP_COMMA||LA89_0==SP_PIPE||(LA89_0>=SP_SEMI && LA89_0<=OP_ELVIS)||LA89_0==ID||(LA89_0>=AT && LA89_0<=DOC)||LA89_0==SQ_BRACKET_L) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:17: ( bracketL )=> try_long
                    {
                    pushFollow(FOLLOW_try_long_in_g_try_content2721);
                    try_long307=try_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_long307.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:40: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_try_content2725);
                    stmtList308=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList308.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:404:50: ( ( KW_CATCH )=> g_catch )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==KW_CATCH) ) {
                    int LA90_2 = input.LA(2);

                    if ( (synpred137_Fan()) ) {
                        alt90=1;
                    }


                }


                switch (alt90) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:404:51: ( KW_CATCH )=> g_catch
            	    {
            	    pushFollow(FOLLOW_g_catch_in_g_try_content2733);
            	    g_catch309=g_catch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_catch309.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:404:73: ( ( KW_FINALLY )=> g_finally )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==KW_FINALLY) ) {
                int LA91_1 = input.LA(2);

                if ( (synpred138_Fan()) ) {
                    alt91=1;
                }
            }
            switch (alt91) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:74: ( KW_FINALLY )=> g_finally
                    {
                    pushFollow(FOLLOW_g_finally_in_g_try_content2742);
                    g_finally310=g_finally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_finally310.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:405:1: try_long : multiStmt ;
    public final FanParser.try_long_return try_long() throws RecognitionException {
        FanParser.try_long_return retval = new FanParser.try_long_return();
        retval.start = input.LT(1);
        int try_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt311 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:10: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:12: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_try_long2751);
            multiStmt311=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt311.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:406:1: exprStmt : expr eos ;
    public final FanParser.exprStmt_return exprStmt() throws RecognitionException {
        FanParser.exprStmt_return retval = new FanParser.exprStmt_return();
        retval.start = input.LT(1);
        int exprStmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.expr_return expr312 = null;

        FanParser.eos_return eos313 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:10: ( expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:12: expr eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprStmt2758);
            expr312=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr312.getTree());
            pushFollow(FOLLOW_eos_in_exprStmt2760);
            eos313=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos313.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:407:1: localDef : ( typeId ( AS_INIT_VAL expr )? eos ) -> ^( AST_LOCAL_DEF typeId ( expr )? ( eos )? ) ;
    public final FanParser.localDef_return localDef() throws RecognitionException {
        FanParser.localDef_return retval = new FanParser.localDef_return();
        retval.start = input.LT(1);
        int localDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL315=null;
        FanParser.typeId_return typeId314 = null;

        FanParser.expr_return expr316 = null;

        FanParser.eos_return eos317 = null;


        Object AS_INIT_VAL315_tree=null;
        RewriteRuleTokenStream stream_AS_INIT_VAL=new RewriteRuleTokenStream(adaptor,"token AS_INIT_VAL");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:10: ( ( typeId ( AS_INIT_VAL expr )? eos ) -> ^( AST_LOCAL_DEF typeId ( expr )? ( eos )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:12: ( typeId ( AS_INIT_VAL expr )? eos )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:12: ( typeId ( AS_INIT_VAL expr )? eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:13: typeId ( AS_INIT_VAL expr )? eos
            {
            pushFollow(FOLLOW_typeId_in_localDef2768);
            typeId314=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeId.add(typeId314.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:20: ( AS_INIT_VAL expr )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==AS_INIT_VAL) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:21: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL315=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_localDef2771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL315);

                    pushFollow(FOLLOW_expr_in_localDef2773);
                    expr316=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr316.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_eos_in_localDef2777);
            eos317=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos317.getTree());

            }



            // AST REWRITE
            // elements: eos, typeId, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 408:5: -> ^( AST_LOCAL_DEF typeId ( expr )? ( eos )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:408:8: ^( AST_LOCAL_DEF typeId ( expr )? ( eos )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_LOCAL_DEF, "AST_LOCAL_DEF"), root_1);

                adaptor.addChild(root_1, stream_typeId.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:408:31: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:408:37: ( eos )?
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:409:1: forInit : ( forInitDef | expr );
    public final FanParser.forInit_return forInit() throws RecognitionException {
        FanParser.forInit_return retval = new FanParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        Object root_0 = null;

        FanParser.forInitDef_return forInitDef318 = null;

        FanParser.expr_return expr319 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:10: ( forInitDef | expr )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==SP_PIPE||LA93_0==ID||LA93_0==SQ_BRACKET_L) ) {
                alt93=1;
            }
            else if ( (LA93_0==OP_ELVIS) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:409:12: forInitDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forInitDef_in_forInit2804);
                    forInitDef318=forInitDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInitDef318.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:409:25: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_forInit2808);
                    expr319=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr319.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:410:1: forInitDef : typeId ( AS_INIT_VAL expr )? -> ^( AST_FOR_INIT typeId ( AS_INIT_VAL expr )? ) ;
    public final FanParser.forInitDef_return forInitDef() throws RecognitionException {
        FanParser.forInitDef_return retval = new FanParser.forInitDef_return();
        retval.start = input.LT(1);
        int forInitDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL321=null;
        FanParser.typeId_return typeId320 = null;

        FanParser.expr_return expr322 = null;


        Object AS_INIT_VAL321_tree=null;
        RewriteRuleTokenStream stream_AS_INIT_VAL=new RewriteRuleTokenStream(adaptor,"token AS_INIT_VAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:12: ( typeId ( AS_INIT_VAL expr )? -> ^( AST_FOR_INIT typeId ( AS_INIT_VAL expr )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:14: typeId ( AS_INIT_VAL expr )?
            {
            pushFollow(FOLLOW_typeId_in_forInitDef2815);
            typeId320=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeId.add(typeId320.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:21: ( AS_INIT_VAL expr )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==AS_INIT_VAL) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:410:22: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL321=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_forInitDef2818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL321);

                    pushFollow(FOLLOW_expr_in_forInitDef2820);
                    expr322=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr322.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: typeId, expr, AS_INIT_VAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 411:5: -> ^( AST_FOR_INIT typeId ( AS_INIT_VAL expr )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:411:8: ^( AST_FOR_INIT typeId ( AS_INIT_VAL expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_FOR_INIT, "AST_FOR_INIT"), root_1);

                adaptor.addChild(root_1, stream_typeId.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:411:30: ( AS_INIT_VAL expr )?
                if ( stream_expr.hasNext()||stream_AS_INIT_VAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_AS_INIT_VAL.nextNode());
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                stream_AS_INIT_VAL.reset();

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:414:1: g_catch : ( KW_CATCH g_catch_ct ) -> ^( AST_SCOPE g_catch_ct ) ;
    public final FanParser.g_catch_return g_catch() throws RecognitionException {
        FanParser.g_catch_return retval = new FanParser.g_catch_return();
        retval.start = input.LT(1);
        int g_catch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CATCH323=null;
        FanParser.g_catch_ct_return g_catch_ct324 = null;


        Object KW_CATCH323_tree=null;
        RewriteRuleTokenStream stream_KW_CATCH=new RewriteRuleTokenStream(adaptor,"token KW_CATCH");
        RewriteRuleSubtreeStream stream_g_catch_ct=new RewriteRuleSubtreeStream(adaptor,"rule g_catch_ct");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:10: ( ( KW_CATCH g_catch_ct ) -> ^( AST_SCOPE g_catch_ct ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:12: ( KW_CATCH g_catch_ct )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:12: ( KW_CATCH g_catch_ct )
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:13: KW_CATCH g_catch_ct
            {
            KW_CATCH323=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_g_catch2852); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CATCH.add(KW_CATCH323);

            pushFollow(FOLLOW_g_catch_ct_in_g_catch2854);
            g_catch_ct324=g_catch_ct();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_g_catch_ct.add(g_catch_ct324.getTree());

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
            // 415:5: -> ^( AST_SCOPE g_catch_ct )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:415:8: ^( AST_SCOPE g_catch_ct )
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:416:1: g_catch_ct : ( catchDef )? ( ( bracketL )=> catch_long | stmtList ) ;
    public final FanParser.g_catch_ct_return g_catch_ct() throws RecognitionException {
        FanParser.g_catch_ct_return retval = new FanParser.g_catch_ct_return();
        retval.start = input.LT(1);
        int g_catch_ct_StartIndex = input.index();
        Object root_0 = null;

        FanParser.catchDef_return catchDef325 = null;

        FanParser.catch_long_return catch_long326 = null;

        FanParser.stmtList_return stmtList327 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:12: ( ( catchDef )? ( ( bracketL )=> catch_long | stmtList ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:14: ( catchDef )? ( ( bracketL )=> catch_long | stmtList )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:416:14: ( catchDef )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==PAR_L) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: catchDef
                    {
                    pushFollow(FOLLOW_catchDef_in_g_catch_ct2874);
                    catchDef325=catchDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchDef325.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:416:24: ( ( bracketL )=> catch_long | stmtList )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==BRACKET_L) && (synpred143_Fan())) {
                alt96=1;
            }
            else if ( (LA96_0==EOF||(LA96_0>=KW_BREAK && LA96_0<=KW_FINALLY)||(LA96_0>=KW_RD_ONLY && LA96_0<=KW_FINAL)||(LA96_0>=KW_ABSTRACT && LA96_0<=KW_ONCE)||LA96_0==KW_ELSE||LA96_0==BRACKET_R||LA96_0==SP_COMMA||LA96_0==SP_PIPE||(LA96_0>=SP_SEMI && LA96_0<=OP_ELVIS)||LA96_0==ID||(LA96_0>=AT && LA96_0<=DOC)||LA96_0==SQ_BRACKET_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:416:25: ( bracketL )=> catch_long
                    {
                    pushFollow(FOLLOW_catch_long_in_g_catch_ct2882);
                    catch_long326=catch_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catch_long326.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:416:50: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_catch_ct2886);
                    stmtList327=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList327.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:417:1: catch_long : multiStmt ;
    public final FanParser.catch_long_return catch_long() throws RecognitionException {
        FanParser.catch_long_return retval = new FanParser.catch_long_return();
        retval.start = input.LT(1);
        int catch_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt328 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:12: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:14: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_catch_long2894);
            multiStmt328=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt328.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:418:1: catchDef : parL type id parR -> ^( AST_CATCH_DEF parL type id parR ) ;
    public final FanParser.catchDef_return catchDef() throws RecognitionException {
        FanParser.catchDef_return retval = new FanParser.catchDef_return();
        retval.start = input.LT(1);
        int catchDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL329 = null;

        FanParser.type_return type330 = null;

        FanParser.id_return id331 = null;

        FanParser.parR_return parR332 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_parL=new RewriteRuleSubtreeStream(adaptor,"rule parL");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_parR=new RewriteRuleSubtreeStream(adaptor,"rule parR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:11: ( parL type id parR -> ^( AST_CATCH_DEF parL type id parR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:13: parL type id parR
            {
            pushFollow(FOLLOW_parL_in_catchDef2902);
            parL329=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL329.getTree());
            pushFollow(FOLLOW_type_in_catchDef2904);
            type330=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type330.getTree());
            pushFollow(FOLLOW_id_in_catchDef2906);
            id331=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id331.getTree());
            pushFollow(FOLLOW_parR_in_catchDef2908);
            parR332=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR332.getTree());


            // AST REWRITE
            // elements: type, id, parR, parL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 419:5: -> ^( AST_CATCH_DEF parL type id parR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:419:8: ^( AST_CATCH_DEF parL type id parR )
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:421:1: g_finally : KW_FINALLY ( ( bracketL )=> finally_long | stmtList ) ;
    public final FanParser.g_finally_return g_finally() throws RecognitionException {
        FanParser.g_finally_return retval = new FanParser.g_finally_return();
        retval.start = input.LT(1);
        int g_finally_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FINALLY333=null;
        FanParser.finally_long_return finally_long334 = null;

        FanParser.stmtList_return stmtList335 = null;


        Object KW_FINALLY333_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:11: ( KW_FINALLY ( ( bracketL )=> finally_long | stmtList ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:13: KW_FINALLY ( ( bracketL )=> finally_long | stmtList )
            {
            root_0 = (Object)adaptor.nil();

            KW_FINALLY333=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_g_finally2934); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_FINALLY333_tree = (Object)adaptor.create(KW_FINALLY333);
            adaptor.addChild(root_0, KW_FINALLY333_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:24: ( ( bracketL )=> finally_long | stmtList )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==BRACKET_L) && (synpred144_Fan())) {
                alt97=1;
            }
            else if ( (LA97_0==EOF||(LA97_0>=KW_BREAK && LA97_0<=KW_FINALLY)||(LA97_0>=KW_RD_ONLY && LA97_0<=KW_FINAL)||(LA97_0>=KW_ABSTRACT && LA97_0<=KW_ONCE)||LA97_0==KW_ELSE||LA97_0==BRACKET_R||LA97_0==SP_COMMA||LA97_0==SP_PIPE||(LA97_0>=SP_SEMI && LA97_0<=OP_ELVIS)||LA97_0==ID||(LA97_0>=AT && LA97_0<=DOC)||LA97_0==SQ_BRACKET_L) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:421:25: ( bracketL )=> finally_long
                    {
                    pushFollow(FOLLOW_finally_long_in_g_finally2941);
                    finally_long334=finally_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, finally_long334.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:421:52: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_finally2945);
                    stmtList335=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList335.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:422:1: finally_long : multiStmt ;
    public final FanParser.finally_long_return finally_long() throws RecognitionException {
        FanParser.finally_long_return retval = new FanParser.finally_long_return();
        retval.start = input.LT(1);
        int finally_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt336 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:14: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:16: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_finally_long2953);
            multiStmt336=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt336.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:423:1: g_case : KW_CASE expr SP_COLON ( stmt )* ;
    public final FanParser.g_case_return g_case() throws RecognitionException {
        FanParser.g_case_return retval = new FanParser.g_case_return();
        retval.start = input.LT(1);
        int g_case_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CASE337=null;
        Token SP_COLON339=null;
        FanParser.expr_return expr338 = null;

        FanParser.stmt_return stmt340 = null;


        Object KW_CASE337_tree=null;
        Object SP_COLON339_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:9: ( KW_CASE expr SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:11: KW_CASE expr SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_CASE337=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_g_case2961); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CASE337_tree = (Object)adaptor.create(KW_CASE337);
            adaptor.addChild(root_0, KW_CASE337_tree);
            }
            pushFollow(FOLLOW_expr_in_g_case2963);
            expr338=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr338.getTree());
            SP_COLON339=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_case2965); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON339_tree = (Object)adaptor.create(SP_COLON339);
            adaptor.addChild(root_0, SP_COLON339_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:33: ( stmt )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( ((LA98_0>=KW_BREAK && LA98_0<=KW_TRY)||LA98_0==SP_PIPE||LA98_0==OP_ELVIS||LA98_0==ID||LA98_0==SQ_BRACKET_L) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_case2967);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:424:1: g_default : KW_DEFAULT SP_COLON ( stmt )* ;
    public final FanParser.g_default_return g_default() throws RecognitionException {
        FanParser.g_default_return retval = new FanParser.g_default_return();
        retval.start = input.LT(1);
        int g_default_StartIndex = input.index();
        Object root_0 = null;

        Token KW_DEFAULT341=null;
        Token SP_COLON342=null;
        FanParser.stmt_return stmt343 = null;


        Object KW_DEFAULT341_tree=null;
        Object SP_COLON342_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:424:11: ( KW_DEFAULT SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:424:13: KW_DEFAULT SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_DEFAULT341=(Token)match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_g_default2975); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_DEFAULT341_tree = (Object)adaptor.create(KW_DEFAULT341);
            adaptor.addChild(root_0, KW_DEFAULT341_tree);
            }
            SP_COLON342=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_default2977); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON342_tree = (Object)adaptor.create(SP_COLON342);
            adaptor.addChild(root_0, SP_COLON342_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:424:33: ( stmt )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( ((LA99_0>=KW_BREAK && LA99_0<=KW_TRY)||LA99_0==SP_PIPE||LA99_0==OP_ELVIS||LA99_0==ID||LA99_0==SQ_BRACKET_L) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_default2979);
            	    stmt343=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt343.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:427:1: expr : assignExpr ;
    public final FanParser.expr_return expr() throws RecognitionException {
        FanParser.expr_return retval = new FanParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.assignExpr_return assignExpr344 = null;



        paraphrase.push("Expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:3: ( assignExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:5: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr3000);
            assignExpr344=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr344.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:430:1: assignExpr : ifExpr ( assignOp assignExpr )? ;
    public final FanParser.assignExpr_return assignExpr() throws RecognitionException {
        FanParser.assignExpr_return retval = new FanParser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.ifExpr_return ifExpr345 = null;

        FanParser.assignOp_return assignOp346 = null;

        FanParser.assignExpr_return assignExpr347 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:12: ( ifExpr ( assignOp assignExpr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:14: ifExpr ( assignOp assignExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ifExpr_in_assignExpr3007);
            ifExpr345=ifExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExpr345.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:21: ( assignOp assignExpr )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=AS_EQUAL && LA100_0<=AS_ASSIGN_OP)) ) {
                int LA100_1 = input.LA(2);

                if ( (synpred147_Fan()) ) {
                    alt100=1;
                }
            }
            switch (alt100) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:430:22: assignOp assignExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr3010);
                    assignOp346=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp346.getTree());
                    pushFollow(FOLLOW_assignExpr_in_assignExpr3012);
                    assignExpr347=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr347.getTree());

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

    public static class ifExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:432:1: ifExpr : ( ternaryExpr | elvisExpr );
    public final FanParser.ifExpr_return ifExpr() throws RecognitionException {
        FanParser.ifExpr_return retval = new FanParser.ifExpr_return();
        retval.start = input.LT(1);
        int ifExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.ternaryExpr_return ternaryExpr348 = null;

        FanParser.elvisExpr_return elvisExpr349 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:432:13: ( ternaryExpr | elvisExpr )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==OP_ELVIS) ) {
                int LA101_1 = input.LA(2);

                if ( (synpred148_Fan()) ) {
                    alt101=1;
                }
                else if ( (true) ) {
                    alt101=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:432:15: ternaryExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ternaryExpr_in_ifExpr3027);
                    ternaryExpr348=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr348.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:432:29: elvisExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elvisExpr_in_ifExpr3031);
                    elvisExpr349=elvisExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr349.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 92, ifExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifExpr"

    public static class ifExprBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifExprBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:433:1: ifExprBody : ( condOrExpr | ifExprThrow );
    public final FanParser.ifExprBody_return ifExprBody() throws RecognitionException {
        FanParser.ifExprBody_return retval = new FanParser.ifExprBody_return();
        retval.start = input.LT(1);
        int ifExprBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.condOrExpr_return condOrExpr350 = null;

        FanParser.ifExprThrow_return ifExprThrow351 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:433:13: ( condOrExpr | ifExprThrow )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==OP_ELVIS) ) {
                alt102=1;
            }
            else if ( (LA102_0==KW_THROW) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:433:17: condOrExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_condOrExpr_in_ifExprBody3041);
                    condOrExpr350=condOrExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr350.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:433:30: ifExprThrow
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifExprThrow_in_ifExprBody3045);
                    ifExprThrow351=ifExprThrow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExprThrow351.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 93, ifExprBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifExprBody"

    public static class ifExprThrow_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifExprThrow"
    // src/net/colar/netbeans/fan/antlr/Fan.g:434:1: ifExprThrow : KW_THROW expr ;
    public final FanParser.ifExprThrow_return ifExprThrow() throws RecognitionException {
        FanParser.ifExprThrow_return retval = new FanParser.ifExprThrow_return();
        retval.start = input.LT(1);
        int ifExprThrow_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THROW352=null;
        FanParser.expr_return expr353 = null;


        Object KW_THROW352_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:13: ( KW_THROW expr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:17: KW_THROW expr
            {
            root_0 = (Object)adaptor.nil();

            KW_THROW352=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_ifExprThrow3054); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THROW352_tree = (Object)adaptor.create(KW_THROW352);
            adaptor.addChild(root_0, KW_THROW352_tree);
            }
            pushFollow(FOLLOW_expr_in_ifExprThrow3056);
            expr353=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr353.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, ifExprThrow_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifExprThrow"

    public static class elvisExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elvisExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:435:1: elvisExpr : OP_ELVIS ifExprBody ;
    public final FanParser.elvisExpr_return elvisExpr() throws RecognitionException {
        FanParser.elvisExpr_return retval = new FanParser.elvisExpr_return();
        retval.start = input.LT(1);
        int elvisExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ELVIS354=null;
        FanParser.ifExprBody_return ifExprBody355 = null;


        Object OP_ELVIS354_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:12: ( OP_ELVIS ifExprBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:29: OP_ELVIS ifExprBody
            {
            root_0 = (Object)adaptor.nil();

            OP_ELVIS354=(Token)match(input,OP_ELVIS,FOLLOW_OP_ELVIS_in_elvisExpr3066); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ELVIS354_tree = (Object)adaptor.create(OP_ELVIS354);
            adaptor.addChild(root_0, OP_ELVIS354_tree);
            }
            pushFollow(FOLLOW_ifExprBody_in_elvisExpr3068);
            ifExprBody355=ifExprBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExprBody355.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, elvisExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elvisExpr"

    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:437:1: ternaryExpr : condOrExpr ( ternaryTail )? ;
    public final FanParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        FanParser.ternaryExpr_return retval = new FanParser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.condOrExpr_return condOrExpr356 = null;

        FanParser.ternaryTail_return ternaryTail357 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:437:13: ( condOrExpr ( ternaryTail )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:437:15: condOrExpr ( ternaryTail )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condOrExpr_in_ternaryExpr3077);
            condOrExpr356=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr356.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:437:26: ( ternaryTail )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==SP_QMARK) ) {
                int LA103_1 = input.LA(2);

                if ( (synpred150_Fan()) ) {
                    alt103=1;
                }
            }
            switch (alt103) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:437:27: ternaryTail
                    {
                    pushFollow(FOLLOW_ternaryTail_in_ternaryExpr3080);
                    ternaryTail357=ternaryTail();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryTail357.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 96, ternaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"

    public static class ternaryTail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryTail"
    // src/net/colar/netbeans/fan/antlr/Fan.g:439:1: ternaryTail : SP_QMARK ifExprBody SP_COLON ifExprBody ;
    public final FanParser.ternaryTail_return ternaryTail() throws RecognitionException {
        FanParser.ternaryTail_return retval = new FanParser.ternaryTail_return();
        retval.start = input.LT(1);
        int ternaryTail_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK358=null;
        Token SP_COLON360=null;
        FanParser.ifExprBody_return ifExprBody359 = null;

        FanParser.ifExprBody_return ifExprBody361 = null;


        Object SP_QMARK358_tree=null;
        Object SP_COLON360_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:439:13: ( SP_QMARK ifExprBody SP_COLON ifExprBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:439:15: SP_QMARK ifExprBody SP_COLON ifExprBody
            {
            root_0 = (Object)adaptor.nil();

            SP_QMARK358=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_ternaryTail3090); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_QMARK358_tree = (Object)adaptor.create(SP_QMARK358);
            adaptor.addChild(root_0, SP_QMARK358_tree);
            }
            pushFollow(FOLLOW_ifExprBody_in_ternaryTail3092);
            ifExprBody359=ifExprBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExprBody359.getTree());
            SP_COLON360=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ternaryTail3094); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON360_tree = (Object)adaptor.create(SP_COLON360);
            adaptor.addChild(root_0, SP_COLON360_tree);
            }
            pushFollow(FOLLOW_ifExprBody_in_ternaryTail3096);
            ifExprBody361=ifExprBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ifExprBody361.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, ternaryTail_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryTail"

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:441:1: assignOp : ( AS_EQUAL | AS_ASSIGN_OP );
    public final FanParser.assignOp_return assignOp() throws RecognitionException {
        FanParser.assignOp_return retval = new FanParser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token set362=null;

        Object set362_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:10: ( AS_EQUAL | AS_ASSIGN_OP )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            root_0 = (Object)adaptor.nil();

            set362=(Token)input.LT(1);
            if ( (input.LA(1)>=AS_EQUAL && input.LA(1)<=AS_ASSIGN_OP) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set362));
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
            if ( state.backtracking>0 ) { memoize(input, 98, assignOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignOp"

    public static class condOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:442:1: condOrExpr : condAndExpr ( OP_OR condAndExpr )* ;
    public final FanParser.condOrExpr_return condOrExpr() throws RecognitionException {
        FanParser.condOrExpr_return retval = new FanParser.condOrExpr_return();
        retval.start = input.LT(1);
        int condOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_OR364=null;
        FanParser.condAndExpr_return condAndExpr363 = null;

        FanParser.condAndExpr_return condAndExpr365 = null;


        Object OP_OR364_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:442:13: ( condAndExpr ( OP_OR condAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:442:15: condAndExpr ( OP_OR condAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condAndExpr_in_condOrExpr3116);
            condAndExpr363=condAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr363.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:442:28: ( OP_OR condAndExpr )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==OP_OR) ) {
                    int LA104_2 = input.LA(2);

                    if ( (synpred152_Fan()) ) {
                        alt104=1;
                    }


                }


                switch (alt104) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:442:29: OP_OR condAndExpr
            	    {
            	    OP_OR364=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_condOrExpr3120); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_OR364_tree = (Object)adaptor.create(OP_OR364);
            	    adaptor.addChild(root_0, OP_OR364_tree);
            	    }
            	    pushFollow(FOLLOW_condAndExpr_in_condOrExpr3123);
            	    condAndExpr365=condAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr365.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 99, condOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condOrExpr"

    public static class condAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:443:1: condAndExpr : equalityExpr ( OP_AND equalityExpr )* ;
    public final FanParser.condAndExpr_return condAndExpr() throws RecognitionException {
        FanParser.condAndExpr_return retval = new FanParser.condAndExpr_return();
        retval.start = input.LT(1);
        int condAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_AND367=null;
        FanParser.equalityExpr_return equalityExpr366 = null;

        FanParser.equalityExpr_return equalityExpr368 = null;


        Object OP_AND367_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:14: ( equalityExpr ( OP_AND equalityExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:16: equalityExpr ( OP_AND equalityExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpr_in_condAndExpr3133);
            equalityExpr366=equalityExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr366.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:29: ( OP_AND equalityExpr )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==OP_AND) ) {
                    int LA105_2 = input.LA(2);

                    if ( (synpred153_Fan()) ) {
                        alt105=1;
                    }


                }


                switch (alt105) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:443:30: OP_AND equalityExpr
            	    {
            	    OP_AND367=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_condAndExpr3136); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_AND367_tree = (Object)adaptor.create(OP_AND367);
            	    adaptor.addChild(root_0, OP_AND367_tree);
            	    }
            	    pushFollow(FOLLOW_equalityExpr_in_condAndExpr3139);
            	    equalityExpr368=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr368.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 100, condAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condAndExpr"

    public static class equalityExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:444:1: equalityExpr : relationalExpr ( CP_EQUALITY relationalExpr )* ;
    public final FanParser.equalityExpr_return equalityExpr() throws RecognitionException {
        FanParser.equalityExpr_return retval = new FanParser.equalityExpr_return();
        retval.start = input.LT(1);
        int equalityExpr_StartIndex = input.index();
        Object root_0 = null;

        Token CP_EQUALITY370=null;
        FanParser.relationalExpr_return relationalExpr369 = null;

        FanParser.relationalExpr_return relationalExpr371 = null;


        Object CP_EQUALITY370_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:14: ( relationalExpr ( CP_EQUALITY relationalExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:16: relationalExpr ( CP_EQUALITY relationalExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpr_in_equalityExpr3149);
            relationalExpr369=relationalExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr369.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:31: ( CP_EQUALITY relationalExpr )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==CP_EQUALITY) ) {
                    int LA106_2 = input.LA(2);

                    if ( (synpred154_Fan()) ) {
                        alt106=1;
                    }


                }


                switch (alt106) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:444:32: CP_EQUALITY relationalExpr
            	    {
            	    CP_EQUALITY370=(Token)match(input,CP_EQUALITY,FOLLOW_CP_EQUALITY_in_equalityExpr3152); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_EQUALITY370_tree = (Object)adaptor.create(CP_EQUALITY370);
            	    adaptor.addChild(root_0, CP_EQUALITY370_tree);
            	    }
            	    pushFollow(FOLLOW_relationalExpr_in_equalityExpr3154);
            	    relationalExpr371=relationalExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr371.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 101, equalityExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpr"

    public static class relationalExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:446:1: relationalExpr : elvisExpr ( typeCheck | compare ) ;
    public final FanParser.relationalExpr_return relationalExpr() throws RecognitionException {
        FanParser.relationalExpr_return retval = new FanParser.relationalExpr_return();
        retval.start = input.LT(1);
        int relationalExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.elvisExpr_return elvisExpr372 = null;

        FanParser.typeCheck_return typeCheck373 = null;

        FanParser.compare_return compare374 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:446:16: ( elvisExpr ( typeCheck | compare ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:446:20: elvisExpr ( typeCheck | compare )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_elvisExpr_in_relationalExpr3167);
            elvisExpr372=elvisExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr372.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:446:30: ( typeCheck | compare )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==KW_AS||(LA107_0>=KW_IS && LA107_0<=KW_ISNOT)) ) {
                int LA107_1 = input.LA(2);

                if ( (synpred155_Fan()) ) {
                    alt107=1;
                }
                else if ( (true) ) {
                    alt107=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 107, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA107_0==EOF||(LA107_0>=KW_BREAK && LA107_0<=KW_FINALLY)||(LA107_0>=KW_RD_ONLY && LA107_0<=KW_FINAL)||(LA107_0>=KW_CLASS && LA107_0<=KW_ONCE)||LA107_0==KW_ELSE||(LA107_0>=BRACKET_L && LA107_0<=BRACKET_R)||(LA107_0>=SP_COLON && LA107_0<=SP_QMARK)||LA107_0==SP_PIPE||(LA107_0>=SP_SEMI && LA107_0<=CP_COMPARATORS)||LA107_0==ID||(LA107_0>=AT && LA107_0<=DOC)||(LA107_0>=SQ_BRACKET_L && LA107_0<=SQ_BRACKET_R)||LA107_0==PAR_R) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:446:31: typeCheck
                    {
                    pushFollow(FOLLOW_typeCheck_in_relationalExpr3170);
                    typeCheck373=typeCheck();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeCheck373.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:446:43: compare
                    {
                    pushFollow(FOLLOW_compare_in_relationalExpr3174);
                    compare374=compare();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compare374.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 102, relationalExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpr"

    public static class typeCheck_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeCheck"
    // src/net/colar/netbeans/fan/antlr/Fan.g:448:1: typeCheck : ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* ;
    public final FanParser.typeCheck_return typeCheck() throws RecognitionException {
        FanParser.typeCheck_return retval = new FanParser.typeCheck_return();
        retval.start = input.LT(1);
        int typeCheck_StartIndex = input.index();
        Object root_0 = null;

        Token set375=null;
        Token SP_QMARK377=null;
        Token string_literal378=null;
        FanParser.typeRoot_return typeRoot376 = null;


        Object set375_tree=null;
        Object SP_QMARK377_tree=null;
        Object string_literal378_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:448:11: ( ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:448:15: ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )*
            {
            root_0 = (Object)adaptor.nil();

            set375=(Token)input.LT(1);
            if ( input.LA(1)==KW_AS||(input.LA(1)>=KW_IS && input.LA(1)<=KW_ISNOT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set375));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_typeRoot_in_typeCheck3197);
            typeRoot376=typeRoot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeRoot376.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:448:51: ( ( SP_QMARK )? {...}? '[]' )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==SP_QMARK) ) {
                    int LA109_2 = input.LA(2);

                    if ( (LA109_2==LIST_TYPE) ) {
                        alt109=1;
                    }


                }
                else if ( (LA109_0==LIST_TYPE) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:448:52: ( SP_QMARK )? {...}? '[]'
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:448:52: ( SP_QMARK )?
            	    int alt108=2;
            	    int LA108_0 = input.LA(1);

            	    if ( (LA108_0==SP_QMARK) ) {
            	        alt108=1;
            	    }
            	    switch (alt108) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK377=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_typeCheck3200); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK377_tree = (Object)adaptor.create(SP_QMARK377);
            	            adaptor.addChild(root_0, SP_QMARK377_tree);
            	            }

            	            }
            	            break;

            	    }

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "typeCheck", "notAfterEol()");
            	    }
            	    string_literal378=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_typeCheck3205); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal378_tree = (Object)adaptor.create(string_literal378);
            	    adaptor.addChild(root_0, string_literal378_tree);
            	    }

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
            if ( state.backtracking>0 ) { memoize(input, 103, typeCheck_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeCheck"

    public static class compare_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare"
    // src/net/colar/netbeans/fan/antlr/Fan.g:449:1: compare : ( CP_COMPARATORS elvisExpr )* ;
    public final FanParser.compare_return compare() throws RecognitionException {
        FanParser.compare_return retval = new FanParser.compare_return();
        retval.start = input.LT(1);
        int compare_StartIndex = input.index();
        Object root_0 = null;

        Token CP_COMPARATORS379=null;
        FanParser.elvisExpr_return elvisExpr380 = null;


        Object CP_COMPARATORS379_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:10: ( ( CP_COMPARATORS elvisExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:14: ( CP_COMPARATORS elvisExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:449:14: ( CP_COMPARATORS elvisExpr )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==CP_COMPARATORS) ) {
                    int LA110_2 = input.LA(2);

                    if ( (synpred160_Fan()) ) {
                        alt110=1;
                    }


                }


                switch (alt110) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:449:15: CP_COMPARATORS elvisExpr
            	    {
            	    CP_COMPARATORS379=(Token)match(input,CP_COMPARATORS,FOLLOW_CP_COMPARATORS_in_compare3218); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_COMPARATORS379_tree = (Object)adaptor.create(CP_COMPARATORS379);
            	    adaptor.addChild(root_0, CP_COMPARATORS379_tree);
            	    }
            	    pushFollow(FOLLOW_elvisExpr_in_compare3220);
            	    elvisExpr380=elvisExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr380.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 104, compare_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "compare"

    public static class rangeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rangeExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:452:1: rangeExpr : addExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) addExpr )* ;
    public final FanParser.rangeExpr_return rangeExpr() throws RecognitionException {
        FanParser.rangeExpr_return retval = new FanParser.rangeExpr_return();
        retval.start = input.LT(1);
        int rangeExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set382=null;
        FanParser.addExpr_return addExpr381 = null;

        FanParser.addExpr_return addExpr383 = null;


        Object set382_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:12: ( addExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) addExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:14: addExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_rangeExpr3232);
            addExpr381=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr381.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:22: ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) addExpr )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( ((LA111_0>=OP_RANG_EXCL_OLD && LA111_0<=OP_RANGE)) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:452:23: ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) addExpr
            	    {
            	    set382=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_RANG_EXCL_OLD && input.LA(1)<=OP_RANGE) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set382));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_rangeExpr3249);
            	    addExpr383=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr383.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 105, rangeExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "rangeExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:457:1: addExpr : multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* ;
    public final FanParser.addExpr_return addExpr() throws RecognitionException {
        FanParser.addExpr_return retval = new FanParser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set385=null;
        FanParser.multExpr_return multExpr384 = null;

        FanParser.multExpr_return multExpr386 = null;


        Object set385_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:457:10: ( multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:457:12: multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_addExpr3264);
            multExpr384=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr384.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:457:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( ((LA112_0>=OP_PLUS && LA112_0<=OP_MINUS)) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:457:22: ( OP_PLUS | OP_MINUS ) multExpr
            	    {
            	    set385=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set385));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr3275);
            	    multExpr386=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr386.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 106, addExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class addAppend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addAppend"
    // src/net/colar/netbeans/fan/antlr/Fan.g:458:1: addAppend : ( OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.addAppend_return addAppend() throws RecognitionException {
        FanParser.addAppend_return retval = new FanParser.addAppend_return();
        retval.start = input.LT(1);
        int addAppend_StartIndex = input.index();
        Object root_0 = null;

        Token set387=null;
        FanParser.parenExpr_return parenExpr388 = null;


        Object set387_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:458:11: ( ( OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:458:13: ( OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set387=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set387));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_addAppend3293);
            parenExpr388=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr388.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, addAppend_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addAppend"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:459:1: multExpr : parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* ;
    public final FanParser.multExpr_return multExpr() throws RecognitionException {
        FanParser.multExpr_return retval = new FanParser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set390=null;
        FanParser.parenExpr_return parenExpr389 = null;

        FanParser.parenExpr_return parenExpr391 = null;


        Object set390_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:459:11: ( parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:459:13: parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parenExpr_in_multExpr3301);
            parenExpr389=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr389.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:459:23: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( ((LA113_0>=OP_MULTI && LA113_0<=OP_MOD)) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:459:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
            	    {
            	    set390=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_MULTI && input.LA(1)<=OP_MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set390));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_parenExpr_in_multExpr3316);
            	    parenExpr391=parenExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr391.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 108, multExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class parenExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parenExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:460:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );
    public final FanParser.parenExpr_return parenExpr() throws RecognitionException {
        FanParser.parenExpr_return retval = new FanParser.parenExpr_return();
        retval.start = input.LT(1);
        int parenExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.castExpr_return castExpr392 = null;

        FanParser.groupedExpr_return groupedExpr393 = null;

        FanParser.unaryExpr_return unaryExpr394 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:460:12: ( castExpr | groupedExpr | unaryExpr )
            int alt114=3;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==PAR_L) ) {
                int LA114_1 = input.LA(2);

                if ( (LA114_1==OP_ELVIS) ) {
                    alt114=2;
                }
                else if ( (LA114_1==SP_PIPE||LA114_1==ID||LA114_1==SQ_BRACKET_L) ) {
                    alt114=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 114, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA114_0>=KW_THIS && LA114_0<=KW_SUPER)||(LA114_0>=KW_NULL && LA114_0<=KW_FALSE)||LA114_0==SP_PIPE||(LA114_0>=OP_PLUS && LA114_0<=OP_MULTI)||(LA114_0>=OP_CURRY && LA114_0<=OP_2MINUS)||(LA114_0>=ID && LA114_0<=AT)||(LA114_0>=NUMBER && LA114_0<=SQ_BRACKET_L)) ) {
                alt114=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:460:14: castExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_castExpr_in_parenExpr3327);
                    castExpr392=castExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpr392.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:460:25: groupedExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_groupedExpr_in_parenExpr3331);
                    groupedExpr393=groupedExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, groupedExpr393.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:460:39: unaryExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpr_in_parenExpr3335);
                    unaryExpr394=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr394.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 109, parenExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parenExpr"

    public static class castExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "castExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:462:1: castExpr : {...}? parL type parR parenExpr -> ^( AST_CAST parL type parR parenExpr ) ;
    public final FanParser.castExpr_return castExpr() throws RecognitionException {
        FanParser.castExpr_return retval = new FanParser.castExpr_return();
        retval.start = input.LT(1);
        int castExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL395 = null;

        FanParser.type_return type396 = null;

        FanParser.parR_return parR397 = null;

        FanParser.parenExpr_return parenExpr398 = null;


        RewriteRuleSubtreeStream stream_parL=new RewriteRuleSubtreeStream(adaptor,"rule parL");
        RewriteRuleSubtreeStream stream_parenExpr=new RewriteRuleSubtreeStream(adaptor,"rule parenExpr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_parR=new RewriteRuleSubtreeStream(adaptor,"rule parR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:11: ({...}? parL type parR parenExpr -> ^( AST_CAST parL type parR parenExpr ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:13: {...}? parL type parR parenExpr
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "castExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_castExpr3346);
            parL395=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL395.getTree());
            pushFollow(FOLLOW_type_in_castExpr3348);
            type396=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type396.getTree());
            pushFollow(FOLLOW_parR_in_castExpr3350);
            parR397=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR397.getTree());
            pushFollow(FOLLOW_parenExpr_in_castExpr3352);
            parenExpr398=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parenExpr.add(parenExpr398.getTree());


            // AST REWRITE
            // elements: type, parenExpr, parR, parL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 463:6: -> ^( AST_CAST parL type parR parenExpr )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:463:9: ^( AST_CAST parL type parR parenExpr )
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
            if ( state.backtracking>0 ) { memoize(input, 110, castExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "castExpr"

    public static class groupedExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupedExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:465:1: groupedExpr : parL expr parR ( termChain )* ;
    public final FanParser.groupedExpr_return groupedExpr() throws RecognitionException {
        FanParser.groupedExpr_return retval = new FanParser.groupedExpr_return();
        retval.start = input.LT(1);
        int groupedExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL399 = null;

        FanParser.expr_return expr400 = null;

        FanParser.parR_return parR401 = null;

        FanParser.termChain_return termChain402 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:465:14: ( parL expr parR ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:465:16: parL expr parR ( termChain )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parL_in_groupedExpr3380);
            parL399=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL399.getTree());
            pushFollow(FOLLOW_expr_in_groupedExpr3382);
            expr400=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr400.getTree());
            pushFollow(FOLLOW_parR_in_groupedExpr3384);
            parR401=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR401.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:465:31: ( termChain )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( ((LA115_0>=DOT && LA115_0<=BRACKET_L)||(LA115_0>=OP_SAFEDYN_CALL && LA115_0<=OP_ARROW)||LA115_0==OP_SAFE_CALL||LA115_0==SQ_BRACKET_L||LA115_0==PAR_L) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_groupedExpr3386);
            	    termChain402=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, termChain402.getTree());

            	    }
            	    break;

            	default :
            	    break loop115;
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
            if ( state.backtracking>0 ) { memoize(input, 111, groupedExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "groupedExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:466:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );
    public final FanParser.unaryExpr_return unaryExpr() throws RecognitionException {
        FanParser.unaryExpr_return retval = new FanParser.unaryExpr_return();
        retval.start = input.LT(1);
        int unaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.prefixExpr_return prefixExpr403 = null;

        FanParser.postfixExpr_return postfixExpr404 = null;

        FanParser.termExpr_return termExpr405 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:466:12: ( prefixExpr | postfixExpr | termExpr )
            int alt116=3;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:466:14: prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prefixExpr_in_unaryExpr3395);
                    prefixExpr403=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr403.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:466:27: postfixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpr_in_unaryExpr3399);
                    postfixExpr404=postfixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpr404.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:466:41: termExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_termExpr_in_unaryExpr3403);
                    termExpr405=termExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr405.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 112, unaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExpr"

    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:468:1: prefixExpr : ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.prefixExpr_return prefixExpr() throws RecognitionException {
        FanParser.prefixExpr_return retval = new FanParser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set406=null;
        FanParser.parenExpr_return parenExpr407 = null;


        Object set406_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:13: ( ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:15: ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set406=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS)||(input.LA(1)>=OP_CURRY && input.LA(1)<=OP_2MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set406));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_prefixExpr3438);
            parenExpr407=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr407.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 113, prefixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixExpr"

    public static class postfixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:469:1: postfixExpr : termExpr ( OP_2PLUS | OP_2MINUS ) ;
    public final FanParser.postfixExpr_return postfixExpr() throws RecognitionException {
        FanParser.postfixExpr_return retval = new FanParser.postfixExpr_return();
        retval.start = input.LT(1);
        int postfixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set409=null;
        FanParser.termExpr_return termExpr408 = null;


        Object set409_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:469:14: ( termExpr ( OP_2PLUS | OP_2MINUS ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:469:16: termExpr ( OP_2PLUS | OP_2MINUS )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_termExpr_in_postfixExpr3447);
            termExpr408=termExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr408.getTree());
            set409=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_2PLUS && input.LA(1)<=OP_2MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set409));
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
            if ( state.backtracking>0 ) { memoize(input, 114, postfixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "postfixExpr"

    public static class termExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:470:1: termExpr : termBase ( termChain )* -> ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) ) ;
    public final FanParser.termExpr_return termExpr() throws RecognitionException {
        FanParser.termExpr_return retval = new FanParser.termExpr_return();
        retval.start = input.LT(1);
        int termExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.termBase_return termBase410 = null;

        FanParser.termChain_return termChain411 = null;


        RewriteRuleSubtreeStream stream_termBase=new RewriteRuleSubtreeStream(adaptor,"rule termBase");
        RewriteRuleSubtreeStream stream_termChain=new RewriteRuleSubtreeStream(adaptor,"rule termChain");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:470:11: ( termBase ( termChain )* -> ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:470:13: termBase ( termChain )*
            {
            pushFollow(FOLLOW_termBase_in_termExpr3464);
            termBase410=termBase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_termBase.add(termBase410.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:470:22: ( termChain )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( ((LA117_0>=DOT && LA117_0<=BRACKET_L)||(LA117_0>=OP_SAFEDYN_CALL && LA117_0<=OP_ARROW)||LA117_0==OP_SAFE_CALL||LA117_0==SQ_BRACKET_L||LA117_0==PAR_L) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_termExpr3466);
            	    termChain411=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_termChain.add(termChain411.getTree());

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);



            // AST REWRITE
            // elements: termBase, termChain
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 471:4: -> ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:471:7: ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TERM_EXPR, "AST_TERM_EXPR"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:471:23: ^( AST_CHILD termBase )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_termBase.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:471:45: ^( AST_CHILD ( termChain )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                // src/net/colar/netbeans/fan/antlr/Fan.g:471:57: ( termChain )*
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
            if ( state.backtracking>0 ) { memoize(input, 115, termExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termExpr"

    public static class termBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:473:1: termBase : ( idExprReq | literal | typeBase | id );
    public final FanParser.termBase_return termBase() throws RecognitionException {
        FanParser.termBase_return retval = new FanParser.termBase_return();
        retval.start = input.LT(1);
        int termBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq412 = null;

        FanParser.literal_return literal413 = null;

        FanParser.typeBase_return typeBase414 = null;

        FanParser.id_return id415 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:473:11: ( idExprReq | literal | typeBase | id )
            int alt118=4;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:473:13: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_termBase3498);
                    idExprReq412=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq412.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:473:25: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_termBase3502);
                    literal413=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal413.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:473:35: typeBase
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeBase_in_termBase3506);
                    typeBase414=typeBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeBase414.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:473:46: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_termBase3510);
                    id415=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id415.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 116, termBase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termBase"

    public static class typeBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:474:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );
    public final FanParser.typeBase_return typeBase() throws RecognitionException {
        FanParser.typeBase_return retval = new FanParser.typeBase_return();
        retval.start = input.LT(1);
        int typeBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeLiteral_return typeLiteral416 = null;

        FanParser.slotLiteral_return slotLiteral417 = null;

        FanParser.namedSuper_return namedSuper418 = null;

        FanParser.staticCall_return staticCall419 = null;

        FanParser.dsl_return dsl420 = null;

        FanParser.closure_return closure421 = null;

        FanParser.simple_return simple422 = null;

        FanParser.ctorBlock_return ctorBlock423 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:474:10: ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock )
            int alt119=8;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:12: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_typeBase3517);
                    typeLiteral416=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral416.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:26: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_typeBase3521);
                    slotLiteral417=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral417.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:40: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_typeBase3525);
                    namedSuper418=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper418.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:53: staticCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_staticCall_in_typeBase3529);
                    staticCall419=staticCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticCall419.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:19: dsl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dsl_in_typeBase3551);
                    dsl420=dsl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dsl420.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:25: closure
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_closure_in_typeBase3555);
                    closure421=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure421.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:35: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_typeBase3559);
                    simple422=simple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple422.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:44: ctorBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctorBlock_in_typeBase3563);
                    ctorBlock423=ctorBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorBlock423.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 117, typeBase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeBase"

    public static class ctorBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:476:1: ctorBlock : type itBlock -> ^( AST_CTOR_BLOCK type itBlock ) ;
    public final FanParser.ctorBlock_return ctorBlock() throws RecognitionException {
        FanParser.ctorBlock_return retval = new FanParser.ctorBlock_return();
        retval.start = input.LT(1);
        int ctorBlock_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type424 = null;

        FanParser.itBlock_return itBlock425 = null;


        RewriteRuleSubtreeStream stream_itBlock=new RewriteRuleSubtreeStream(adaptor,"rule itBlock");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:11: ( type itBlock -> ^( AST_CTOR_BLOCK type itBlock ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:13: type itBlock
            {
            pushFollow(FOLLOW_type_in_ctorBlock3570);
            type424=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type424.getTree());
            pushFollow(FOLLOW_itBlock_in_ctorBlock3572);
            itBlock425=itBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_itBlock.add(itBlock425.getTree());


            // AST REWRITE
            // elements: itBlock, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 477:5: -> ^( AST_CTOR_BLOCK type itBlock )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:477:8: ^( AST_CTOR_BLOCK type itBlock )
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
            if ( state.backtracking>0 ) { memoize(input, 118, ctorBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorBlock"

    public static class staticCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:478:1: staticCall : type DOT idExpr -> ^( AST_STATIC_CALL type ^( AST_CHILD idExpr ) ) ;
    public final FanParser.staticCall_return staticCall() throws RecognitionException {
        FanParser.staticCall_return retval = new FanParser.staticCall_return();
        retval.start = input.LT(1);
        int staticCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT427=null;
        FanParser.type_return type426 = null;

        FanParser.idExpr_return idExpr428 = null;


        Object DOT427_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_idExpr=new RewriteRuleSubtreeStream(adaptor,"rule idExpr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:478:12: ( type DOT idExpr -> ^( AST_STATIC_CALL type ^( AST_CHILD idExpr ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:478:14: type DOT idExpr
            {
            pushFollow(FOLLOW_type_in_staticCall3593);
            type426=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type426.getTree());
            DOT427=(Token)match(input,DOT,FOLLOW_DOT_in_staticCall3595); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT427);

            pushFollow(FOLLOW_idExpr_in_staticCall3597);
            idExpr428=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idExpr.add(idExpr428.getTree());


            // AST REWRITE
            // elements: idExpr, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 479:5: -> ^( AST_STATIC_CALL type ^( AST_CHILD idExpr ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:479:8: ^( AST_STATIC_CALL type ^( AST_CHILD idExpr ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_STATIC_CALL, "AST_STATIC_CALL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:479:31: ^( AST_CHILD idExpr )
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
            if ( state.backtracking>0 ) { memoize(input, 119, staticCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticCall"

    public static class termChain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:481:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall );
    public final FanParser.termChain_return termChain() throws RecognitionException {
        FanParser.termChain_return retval = new FanParser.termChain_return();
        retval.start = input.LT(1);
        int termChain_StartIndex = input.index();
        Object root_0 = null;

        FanParser.dotCall_return dotCall429 = null;

        FanParser.dynCall_return dynCall430 = null;

        FanParser.safeDotCall_return safeDotCall431 = null;

        FanParser.safeDynCall_return safeDynCall432 = null;

        FanParser.indexExpr_return indexExpr433 = null;

        FanParser.callOp_return callOp434 = null;

        FanParser.itBlock_return itBlock435 = null;

        FanParser.incDotCall_return incDotCall436 = null;

        FanParser.incSafeDotCall_return incSafeDotCall437 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:481:12: ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall )
            int alt120=9;
            alt120 = dfa120.predict(input);
            switch (alt120) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:481:14: dotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotCall_in_termChain3624);
                    dotCall429=dotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotCall429.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:481:24: dynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dynCall_in_termChain3628);
                    dynCall430=dynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dynCall430.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:481:34: safeDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDotCall_in_termChain3632);
                    safeDotCall431=safeDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDotCall431.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:481:48: safeDynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDynCall_in_termChain3636);
                    safeDynCall432=safeDynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDynCall432.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:482:4: indexExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_indexExpr_in_termChain3643);
                    indexExpr433=indexExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpr433.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:482:16: callOp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_callOp_in_termChain3647);
                    callOp434=callOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callOp434.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:482:25: itBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_itBlock_in_termChain3651);
                    itBlock435=itBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itBlock435.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:482:35: incDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_incDotCall_in_termChain3655);
                    incDotCall436=incDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incDotCall436.getTree());

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:482:48: incSafeDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_incSafeDotCall_in_termChain3659);
                    incSafeDotCall437=incSafeDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incSafeDotCall437.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 120, termChain_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termChain"

    public static class dsl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dsl"
    // src/net/colar/netbeans/fan/antlr/Fan.g:483:1: dsl : simpleType DSL ;
    public final FanParser.dsl_return dsl() throws RecognitionException {
        FanParser.dsl_return retval = new FanParser.dsl_return();
        retval.start = input.LT(1);
        int dsl_StartIndex = input.index();
        Object root_0 = null;

        Token DSL439=null;
        FanParser.simpleType_return simpleType438 = null;


        Object DSL439_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:483:13: ( simpleType DSL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:483:15: simpleType DSL
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleType_in_dsl3674);
            simpleType438=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType438.getTree());
            DSL439=(Token)match(input,DSL,FOLLOW_DSL_in_dsl3676); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DSL439_tree = (Object)adaptor.create(DSL439);
            adaptor.addChild(root_0, DSL439_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 121, dsl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dsl"

    public static class incDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:485:1: incDotCall : DOT -> ^( AST_INC_DOTCALL ) ;
    public final FanParser.incDotCall_return incDotCall() throws RecognitionException {
        FanParser.incDotCall_return retval = new FanParser.incDotCall_return();
        retval.start = input.LT(1);
        int incDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT440=null;

        Object DOT440_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:485:12: ( DOT -> ^( AST_INC_DOTCALL ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:485:14: DOT
            {
            DOT440=(Token)match(input,DOT,FOLLOW_DOT_in_incDotCall3684); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT440);



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
            // 486:5: -> ^( AST_INC_DOTCALL )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:486:8: ^( AST_INC_DOTCALL )
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
            if ( state.backtracking>0 ) { memoize(input, 122, incDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "incDotCall"

    public static class incSafeDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incSafeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:487:1: incSafeDotCall : OP_SAFE_CALL -> ^( AST_INC_SAFEDOTCALL ) ;
    public final FanParser.incSafeDotCall_return incSafeDotCall() throws RecognitionException {
        FanParser.incSafeDotCall_return retval = new FanParser.incSafeDotCall_return();
        retval.start = input.LT(1);
        int incSafeDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFE_CALL441=null;

        Object OP_SAFE_CALL441_tree=null;
        RewriteRuleTokenStream stream_OP_SAFE_CALL=new RewriteRuleTokenStream(adaptor,"token OP_SAFE_CALL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:487:15: ( OP_SAFE_CALL -> ^( AST_INC_SAFEDOTCALL ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:487:17: OP_SAFE_CALL
            {
            OP_SAFE_CALL441=(Token)match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_incSafeDotCall3700); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_SAFE_CALL.add(OP_SAFE_CALL441);



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
            // 488:5: -> ^( AST_INC_SAFEDOTCALL )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:488:8: ^( AST_INC_SAFEDOTCALL )
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
            if ( state.backtracking>0 ) { memoize(input, 123, incSafeDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "incSafeDotCall"

    public static class itBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "itBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:491:1: itBlock : ( bracketL itBlockContent bracketR ) -> ^( AST_IT_BLOCK bracketL ( itBlockContent )? bracketR ) ;
    public final FanParser.itBlock_return itBlock() throws RecognitionException {
        FanParser.itBlock_return retval = new FanParser.itBlock_return();
        retval.start = input.LT(1);
        int itBlock_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL442 = null;

        FanParser.itBlockContent_return itBlockContent443 = null;

        FanParser.bracketR_return bracketR444 = null;


        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_itBlockContent=new RewriteRuleSubtreeStream(adaptor,"rule itBlockContent");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:10: ( ( bracketL itBlockContent bracketR ) -> ^( AST_IT_BLOCK bracketL ( itBlockContent )? bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:12: ( bracketL itBlockContent bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:12: ( bracketL itBlockContent bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:13: bracketL itBlockContent bracketR
            {
            pushFollow(FOLLOW_bracketL_in_itBlock3721);
            bracketL442=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL442.getTree());
            pushFollow(FOLLOW_itBlockContent_in_itBlock3723);
            itBlockContent443=itBlockContent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_itBlockContent.add(itBlockContent443.getTree());
            pushFollow(FOLLOW_bracketR_in_itBlock3725);
            bracketR444=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR444.getTree());

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
            // 492:5: -> ^( AST_IT_BLOCK bracketL ( itBlockContent )? bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:492:8: ^( AST_IT_BLOCK bracketL ( itBlockContent )? bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_IT_BLOCK, "AST_IT_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:492:32: ( itBlockContent )?
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
            if ( state.backtracking>0 ) { memoize(input, 124, itBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "itBlock"

    public static class itBlockContent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "itBlockContent"
    // src/net/colar/netbeans/fan/antlr/Fan.g:493:1: itBlockContent : ( stmt ( SP_COMMA )? ( SP_SEMI )? )* ;
    public final FanParser.itBlockContent_return itBlockContent() throws RecognitionException {
        FanParser.itBlockContent_return retval = new FanParser.itBlockContent_return();
        retval.start = input.LT(1);
        int itBlockContent_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA446=null;
        Token SP_SEMI447=null;
        FanParser.stmt_return stmt445 = null;


        Object SP_COMMA446_tree=null;
        Object SP_SEMI447_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:493:16: ( ( stmt ( SP_COMMA )? ( SP_SEMI )? )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:493:18: ( stmt ( SP_COMMA )? ( SP_SEMI )? )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:493:18: ( stmt ( SP_COMMA )? ( SP_SEMI )? )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( ((LA123_0>=KW_BREAK && LA123_0<=KW_TRY)||LA123_0==SP_PIPE||LA123_0==OP_ELVIS||LA123_0==ID||LA123_0==SQ_BRACKET_L) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:493:19: stmt ( SP_COMMA )? ( SP_SEMI )?
            	    {
            	    pushFollow(FOLLOW_stmt_in_itBlockContent3751);
            	    stmt445=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt445.getTree());
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:493:24: ( SP_COMMA )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==SP_COMMA) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
            	            {
            	            SP_COMMA446=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_itBlockContent3753); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_COMMA446_tree = (Object)adaptor.create(SP_COMMA446);
            	            adaptor.addChild(root_0, SP_COMMA446_tree);
            	            }

            	            }
            	            break;

            	    }

            	    // src/net/colar/netbeans/fan/antlr/Fan.g:493:34: ( SP_SEMI )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==SP_SEMI) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
            	            {
            	            SP_SEMI447=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_itBlockContent3756); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_SEMI447_tree = (Object)adaptor.create(SP_SEMI447);
            	            adaptor.addChild(root_0, SP_SEMI447_tree);
            	            }

            	            }
            	            break;

            	    }


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
            if ( state.backtracking>0 ) { memoize(input, 125, itBlockContent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "itBlockContent"

    public static class dotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:494:1: dotCall : DOT idExpr -> ^( AST_DOT_CALL idExpr ) ;
    public final FanParser.dotCall_return dotCall() throws RecognitionException {
        FanParser.dotCall_return retval = new FanParser.dotCall_return();
        retval.start = input.LT(1);
        int dotCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT448=null;
        FanParser.idExpr_return idExpr449 = null;


        Object DOT448_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_idExpr=new RewriteRuleSubtreeStream(adaptor,"rule idExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:494:10: ( DOT idExpr -> ^( AST_DOT_CALL idExpr ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:494:12: DOT idExpr
            {
            DOT448=(Token)match(input,DOT,FOLLOW_DOT_in_dotCall3767); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT448);

            pushFollow(FOLLOW_idExpr_in_dotCall3769);
            idExpr449=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idExpr.add(idExpr449.getTree());


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
            // 495:5: -> ^( AST_DOT_CALL idExpr )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:495:8: ^( AST_DOT_CALL idExpr )
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
            if ( state.backtracking>0 ) { memoize(input, 126, dotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotCall"

    public static class dynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:496:1: dynCall : OP_ARROW idExpr ;
    public final FanParser.dynCall_return dynCall() throws RecognitionException {
        FanParser.dynCall_return retval = new FanParser.dynCall_return();
        retval.start = input.LT(1);
        int dynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW450=null;
        FanParser.idExpr_return idExpr451 = null;


        Object OP_ARROW450_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:496:10: ( OP_ARROW idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:496:12: OP_ARROW idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW450=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_dynCall3789); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW450_tree = (Object)adaptor.create(OP_ARROW450);
            adaptor.addChild(root_0, OP_ARROW450_tree);
            }
            pushFollow(FOLLOW_idExpr_in_dynCall3791);
            idExpr451=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr451.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 127, dynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dynCall"

    public static class safeDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:497:1: safeDotCall : OP_SAFE_CALL idExpr -> ^( AST_SAFE_DOT_CALL idExpr ) ;
    public final FanParser.safeDotCall_return safeDotCall() throws RecognitionException {
        FanParser.safeDotCall_return retval = new FanParser.safeDotCall_return();
        retval.start = input.LT(1);
        int safeDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFE_CALL452=null;
        FanParser.idExpr_return idExpr453 = null;


        Object OP_SAFE_CALL452_tree=null;
        RewriteRuleTokenStream stream_OP_SAFE_CALL=new RewriteRuleTokenStream(adaptor,"token OP_SAFE_CALL");
        RewriteRuleSubtreeStream stream_idExpr=new RewriteRuleSubtreeStream(adaptor,"rule idExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:497:14: ( OP_SAFE_CALL idExpr -> ^( AST_SAFE_DOT_CALL idExpr ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:497:16: OP_SAFE_CALL idExpr
            {
            OP_SAFE_CALL452=(Token)match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_safeDotCall3799); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_SAFE_CALL.add(OP_SAFE_CALL452);

            pushFollow(FOLLOW_idExpr_in_safeDotCall3801);
            idExpr453=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idExpr.add(idExpr453.getTree());


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
            // 498:5: -> ^( AST_SAFE_DOT_CALL idExpr )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:498:8: ^( AST_SAFE_DOT_CALL idExpr )
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
            if ( state.backtracking>0 ) { memoize(input, 128, safeDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDotCall"

    public static class safeDynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:499:1: safeDynCall : OP_SAFEDYN_CALL idExpr ;
    public final FanParser.safeDynCall_return safeDynCall() throws RecognitionException {
        FanParser.safeDynCall_return retval = new FanParser.safeDynCall_return();
        retval.start = input.LT(1);
        int safeDynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFEDYN_CALL454=null;
        FanParser.idExpr_return idExpr455 = null;


        Object OP_SAFEDYN_CALL454_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:499:13: ( OP_SAFEDYN_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:499:15: OP_SAFEDYN_CALL idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_SAFEDYN_CALL454=(Token)match(input,OP_SAFEDYN_CALL,FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall3820); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_SAFEDYN_CALL454_tree = (Object)adaptor.create(OP_SAFEDYN_CALL454);
            adaptor.addChild(root_0, OP_SAFEDYN_CALL454_tree);
            }
            pushFollow(FOLLOW_idExpr_in_safeDynCall3822);
            idExpr455=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr455.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 129, safeDynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDynCall"

    public static class indexExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:504:1: indexExpr : ({...}? sq_bracketL expr sq_bracketR ) -> ^( AST_INDEX_EXPR sq_bracketL expr sq_bracketR ) ;
    public final FanParser.indexExpr_return indexExpr() throws RecognitionException {
        FanParser.indexExpr_return retval = new FanParser.indexExpr_return();
        retval.start = input.LT(1);
        int indexExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.sq_bracketL_return sq_bracketL456 = null;

        FanParser.expr_return expr457 = null;

        FanParser.sq_bracketR_return sq_bracketR458 = null;


        RewriteRuleSubtreeStream stream_sq_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketR");
        RewriteRuleSubtreeStream stream_sq_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:504:12: ( ({...}? sq_bracketL expr sq_bracketR ) -> ^( AST_INDEX_EXPR sq_bracketL expr sq_bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:504:14: ({...}? sq_bracketL expr sq_bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:504:14: ({...}? sq_bracketL expr sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:504:15: {...}? sq_bracketL expr sq_bracketR
            {
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "indexExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_sq_bracketL_in_indexExpr3837);
            sq_bracketL456=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketL.add(sq_bracketL456.getTree());
            pushFollow(FOLLOW_expr_in_indexExpr3839);
            expr457=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr457.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_indexExpr3841);
            sq_bracketR458=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketR.add(sq_bracketR458.getTree());

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
            // 505:5: -> ^( AST_INDEX_EXPR sq_bracketL expr sq_bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:505:8: ^( AST_INDEX_EXPR sq_bracketL expr sq_bracketR )
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
            if ( state.backtracking>0 ) { memoize(input, 130, indexExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "indexExpr"

    public static class callOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:507:1: callOp : {...}? parL ( args )? parR ( closure )* ;
    public final FanParser.callOp_return callOp() throws RecognitionException {
        FanParser.callOp_return retval = new FanParser.callOp_return();
        retval.start = input.LT(1);
        int callOp_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL459 = null;

        FanParser.args_return args460 = null;

        FanParser.parR_return parR461 = null;

        FanParser.closure_return closure462 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:507:9: ({...}? parL ( args )? parR ( closure )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:507:11: {...}? parL ( args )? parR ( closure )*
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callOp", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callOp3869);
            parL459=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL459.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:507:33: ( args )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==OP_ELVIS) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callOp3871);
                    args460=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args460.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callOp3875);
            parR461=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR461.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:507:45: ( closure )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==SP_PIPE) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: closure
            	    {
            	    pushFollow(FOLLOW_closure_in_callOp3877);
            	    closure462=closure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure462.getTree());

            	    }
            	    break;

            	default :
            	    break loop125;
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
            if ( state.backtracking>0 ) { memoize(input, 131, callOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callOp"

    public static class closure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "closure"
    // src/net/colar/netbeans/fan/antlr/Fan.g:508:1: closure : ( funcType multiStmt ) -> ^( AST_SCOPE funcType multiStmt ) ;
    public final FanParser.closure_return closure() throws RecognitionException {
        FanParser.closure_return retval = new FanParser.closure_return();
        retval.start = input.LT(1);
        int closure_StartIndex = input.index();
        Object root_0 = null;

        FanParser.funcType_return funcType463 = null;

        FanParser.multiStmt_return multiStmt464 = null;


        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        RewriteRuleSubtreeStream stream_multiStmt=new RewriteRuleSubtreeStream(adaptor,"rule multiStmt");
        paraphrase.push("Closure");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:509:3: ( ( funcType multiStmt ) -> ^( AST_SCOPE funcType multiStmt ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:509:7: ( funcType multiStmt )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:509:7: ( funcType multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:509:8: funcType multiStmt
            {
            pushFollow(FOLLOW_funcType_in_closure3900);
            funcType463=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_funcType.add(funcType463.getTree());
            pushFollow(FOLLOW_multiStmt_in_closure3902);
            multiStmt464=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multiStmt.add(multiStmt464.getTree());

            }



            // AST REWRITE
            // elements: funcType, multiStmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 510:5: -> ^( AST_SCOPE funcType multiStmt )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:510:7: ^( AST_SCOPE funcType multiStmt )
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
            if ( state.backtracking>0 ) { memoize(input, 132, closure_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "closure"

    public static class idExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:512:1: idExpr : ( idExprReq | id );
    public final FanParser.idExpr_return idExpr() throws RecognitionException {
        FanParser.idExpr_return retval = new FanParser.idExpr_return();
        retval.start = input.LT(1);
        int idExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq465 = null;

        FanParser.id_return id466 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:512:10: ( idExprReq | id )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==OP_MULTI) ) {
                alt126=1;
            }
            else if ( (LA126_0==ID) ) {
                int LA126_2 = input.LA(2);

                if ( (synpred205_Fan()) ) {
                    alt126=1;
                }
                else if ( (true) ) {
                    alt126=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 126, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:512:12: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_idExpr3926);
                    idExprReq465=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq465.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:512:24: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_idExpr3930);
                    id466=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id466.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 133, idExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExpr"

    public static class idExprReq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExprReq"
    // src/net/colar/netbeans/fan/antlr/Fan.g:514:1: idExprReq : ( field | call );
    public final FanParser.idExprReq_return idExprReq() throws RecognitionException {
        FanParser.idExprReq_return retval = new FanParser.idExprReq_return();
        retval.start = input.LT(1);
        int idExprReq_StartIndex = input.index();
        Object root_0 = null;

        FanParser.field_return field467 = null;

        FanParser.call_return call468 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:514:11: ( field | call )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==OP_MULTI) ) {
                alt127=1;
            }
            else if ( (LA127_0==ID) ) {
                alt127=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:514:13: field
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_field_in_idExprReq3938);
                    field467=field();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field467.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:514:21: call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_idExprReq3942);
                    call468=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call468.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 134, idExprReq_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExprReq"

    public static class field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field"
    // src/net/colar/netbeans/fan/antlr/Fan.g:516:1: field : OP_MULTI ID ;
    public final FanParser.field_return field() throws RecognitionException {
        FanParser.field_return retval = new FanParser.field_return();
        retval.start = input.LT(1);
        int field_StartIndex = input.index();
        Object root_0 = null;

        Token OP_MULTI469=null;
        Token ID470=null;

        Object OP_MULTI469_tree=null;
        Object ID470_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:516:8: ( OP_MULTI ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:516:10: OP_MULTI ID
            {
            root_0 = (Object)adaptor.nil();

            OP_MULTI469=(Token)match(input,OP_MULTI,FOLLOW_OP_MULTI_in_field3951); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_MULTI469_tree = (Object)adaptor.create(OP_MULTI469);
            adaptor.addChild(root_0, OP_MULTI469_tree);
            }
            ID470=(Token)match(input,ID,FOLLOW_ID_in_field3953); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID470_tree = (Object)adaptor.create(ID470);
            adaptor.addChild(root_0, ID470_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 135, field_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "field"

    public static class call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // src/net/colar/netbeans/fan/antlr/Fan.g:518:1: call : ( id ( (p= callParams c= closure ) | p= callParams | c= closure ) ) -> ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) ) ;
    public final FanParser.call_return call() throws RecognitionException {
        FanParser.call_return retval = new FanParser.call_return();
        retval.start = input.LT(1);
        int call_StartIndex = input.index();
        Object root_0 = null;

        FanParser.callParams_return p = null;

        FanParser.closure_return c = null;

        FanParser.id_return id471 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_closure=new RewriteRuleSubtreeStream(adaptor,"rule closure");
        RewriteRuleSubtreeStream stream_callParams=new RewriteRuleSubtreeStream(adaptor,"rule callParams");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:518:7: ( ( id ( (p= callParams c= closure ) | p= callParams | c= closure ) ) -> ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:518:9: ( id ( (p= callParams c= closure ) | p= callParams | c= closure ) )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:518:9: ( id ( (p= callParams c= closure ) | p= callParams | c= closure ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:518:10: id ( (p= callParams c= closure ) | p= callParams | c= closure )
            {
            pushFollow(FOLLOW_id_in_call3965);
            id471=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id471.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:518:13: ( (p= callParams c= closure ) | p= callParams | c= closure )
            int alt128=3;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==PAR_L) ) {
                int LA128_1 = input.LA(2);

                if ( ((synpred207_Fan()&&(notAfterEol()))) ) {
                    alt128=1;
                }
                else if ( ((synpred208_Fan()&&(notAfterEol()))) ) {
                    alt128=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 128, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA128_0==SP_PIPE) ) {
                alt128=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:518:14: (p= callParams c= closure )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:518:14: (p= callParams c= closure )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:518:15: p= callParams c= closure
                    {
                    pushFollow(FOLLOW_callParams_in_call3971);
                    p=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callParams.add(p.getTree());
                    pushFollow(FOLLOW_closure_in_call3975);
                    c=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_closure.add(c.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:518:41: p= callParams
                    {
                    pushFollow(FOLLOW_callParams_in_call3982);
                    p=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callParams.add(p.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:518:56: c= closure
                    {
                    pushFollow(FOLLOW_closure_in_call3988);
                    c=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_closure.add(c.getTree());

                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: c, p, id
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
            // 519:4: -> ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:519:7: ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CALL, "AST_CALL"), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:519:21: ^( AST_CHILD ( $p)? ( $c)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                // src/net/colar/netbeans/fan/antlr/Fan.g:519:33: ( $p)?
                if ( stream_p.hasNext() ) {
                    adaptor.addChild(root_2, stream_p.nextTree());

                }
                stream_p.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:519:37: ( $c)?
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
            if ( state.backtracking>0 ) { memoize(input, 136, call_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class callParams_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callParams"
    // src/net/colar/netbeans/fan/antlr/Fan.g:521:1: callParams : {...}? parL ( args )? parR ;
    public final FanParser.callParams_return callParams() throws RecognitionException {
        FanParser.callParams_return retval = new FanParser.callParams_return();
        retval.start = input.LT(1);
        int callParams_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL472 = null;

        FanParser.args_return args473 = null;

        FanParser.parR_return parR474 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:521:12: ({...}? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:521:14: {...}? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callParams", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callParams4023);
            parL472=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL472.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:521:36: ( args )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==OP_ELVIS) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callParams4025);
                    args473=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args473.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callParams4028);
            parR474=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR474.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 137, callParams_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callParams"

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // src/net/colar/netbeans/fan/antlr/Fan.g:522:1: args : expr ( SP_COMMA expr )* ;
    public final FanParser.args_return args() throws RecognitionException {
        FanParser.args_return retval = new FanParser.args_return();
        retval.start = input.LT(1);
        int args_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA476=null;
        FanParser.expr_return expr475 = null;

        FanParser.expr_return expr477 = null;


        Object SP_COMMA476_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:522:8: ( expr ( SP_COMMA expr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:522:10: expr ( SP_COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_args4037);
            expr475=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr475.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:522:15: ( SP_COMMA expr )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==SP_COMMA) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:522:16: SP_COMMA expr
            	    {
            	    SP_COMMA476=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_args4040); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA476_tree = (Object)adaptor.create(SP_COMMA476);
            	    adaptor.addChild(root_0, SP_COMMA476_tree);
            	    }
            	    pushFollow(FOLLOW_expr_in_args4043);
            	    expr477=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr477.getTree());

            	    }
            	    break;

            	default :
            	    break loop130;
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
            if ( state.backtracking>0 ) { memoize(input, 138, args_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:524:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple );
    public final FanParser.literal_return literal() throws RecognitionException {
        FanParser.literal_return retval = new FanParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        Object root_0 = null;

        Token KW_NULL478=null;
        Token KW_THIS479=null;
        Token KW_SUPER480=null;
        Token KW_IT481=null;
        Token KW_TRUE482=null;
        Token KW_FALSE483=null;
        Token URI485=null;
        Token CHAR487=null;
        FanParser.strs_return strs484 = null;

        FanParser.number_return number486 = null;

        FanParser.namedSuper_return namedSuper488 = null;

        FanParser.slotLiteral_return slotLiteral489 = null;

        FanParser.typeLiteral_return typeLiteral490 = null;

        FanParser.list_return list491 = null;

        FanParser.map_return map492 = null;

        FanParser.symbLiteral_return symbLiteral493 = null;

        FanParser.simple_return simple494 = null;


        Object KW_NULL478_tree=null;
        Object KW_THIS479_tree=null;
        Object KW_SUPER480_tree=null;
        Object KW_IT481_tree=null;
        Object KW_TRUE482_tree=null;
        Object KW_FALSE483_tree=null;
        Object URI485_tree=null;
        Object CHAR487_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:524:10: ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple )
            int alt131=17;
            alt131 = dfa131.predict(input);
            switch (alt131) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:524:12: KW_NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NULL478=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_literal4054); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NULL478_tree = (Object)adaptor.create(KW_NULL478);
                    adaptor.addChild(root_0, KW_NULL478_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:524:22: KW_THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_THIS479=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_literal4058); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_THIS479_tree = (Object)adaptor.create(KW_THIS479);
                    adaptor.addChild(root_0, KW_THIS479_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:524:32: KW_SUPER
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_SUPER480=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_literal4062); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_SUPER480_tree = (Object)adaptor.create(KW_SUPER480);
                    adaptor.addChild(root_0, KW_SUPER480_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:524:43: KW_IT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_IT481=(Token)match(input,KW_IT,FOLLOW_KW_IT_in_literal4066); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_IT481_tree = (Object)adaptor.create(KW_IT481);
                    adaptor.addChild(root_0, KW_IT481_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:524:51: KW_TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_TRUE482=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_literal4070); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_TRUE482_tree = (Object)adaptor.create(KW_TRUE482);
                    adaptor.addChild(root_0, KW_TRUE482_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:524:61: KW_FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FALSE483=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_literal4074); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FALSE483_tree = (Object)adaptor.create(KW_FALSE483);
                    adaptor.addChild(root_0, KW_FALSE483_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:524:72: strs
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_strs_in_literal4078);
                    strs484=strs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, strs484.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:524:79: URI
                    {
                    root_0 = (Object)adaptor.nil();

                    URI485=(Token)match(input,URI,FOLLOW_URI_in_literal4082); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI485_tree = (Object)adaptor.create(URI485);
                    adaptor.addChild(root_0, URI485_tree);
                    }

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:525:4: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_literal4089);
                    number486=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number486.getTree());

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:525:13: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR487=(Token)match(input,CHAR,FOLLOW_CHAR_in_literal4093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR487_tree = (Object)adaptor.create(CHAR487);
                    adaptor.addChild(root_0, CHAR487_tree);
                    }

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:525:20: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_literal4097);
                    namedSuper488=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper488.getTree());

                    }
                    break;
                case 12 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:526:4: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_literal4104);
                    slotLiteral489=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral489.getTree());

                    }
                    break;
                case 13 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:526:18: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_literal4108);
                    typeLiteral490=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral490.getTree());

                    }
                    break;
                case 14 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:526:32: list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_in_literal4112);
                    list491=list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list491.getTree());

                    }
                    break;
                case 15 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:526:39: map
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_in_literal4116);
                    map492=map();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map492.getTree());

                    }
                    break;
                case 16 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:526:45: symbLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_symbLiteral_in_literal4120);
                    symbLiteral493=symbLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbLiteral493.getTree());

                    }
                    break;
                case 17 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:526:59: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_literal4124);
                    simple494=simple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple494.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 139, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class strs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "strs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:527:1: strs : (qs= QUOTSTR | s= STR ) -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:527:7: ( (qs= QUOTSTR | s= STR ) -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:527:9: (qs= QUOTSTR | s= STR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:527:9: (qs= QUOTSTR | s= STR )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==QUOTSTR) ) {
                alt132=1;
            }
            else if ( (LA132_0==STR) ) {
                alt132=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:527:10: qs= QUOTSTR
                    {
                    qs=(Token)match(input,QUOTSTR,FOLLOW_QUOTSTR_in_strs4135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUOTSTR.add(qs);


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:527:23: s= STR
                    {
                    s=(Token)match(input,STR,FOLLOW_STR_in_strs4141); if (state.failed) return retval; 
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
            // 528:5: -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )?
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:528:8: ( ^( AST_STR $s) )?
                if ( stream_s.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:528:8: ^( AST_STR $s)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_STR, "AST_STR"), root_1);

                    adaptor.addChild(root_1, stream_s.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_s.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:528:23: ( ^( AST_STR $qs) )?
                if ( stream_qs.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:528:23: ^( AST_STR $qs)
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
            if ( state.backtracking>0 ) { memoize(input, 140, strs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "strs"

    public static class typeLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:530:1: typeLiteral : ( type {...}? OP_POUND ) -> ^( AST_SCOPE ^( AST_TYPE_LIT type OP_POUND ) ) ;
    public final FanParser.typeLiteral_return typeLiteral() throws RecognitionException {
        FanParser.typeLiteral_return retval = new FanParser.typeLiteral_return();
        retval.start = input.LT(1);
        int typeLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND496=null;
        FanParser.type_return type495 = null;


        Object OP_POUND496_tree=null;
        RewriteRuleTokenStream stream_OP_POUND=new RewriteRuleTokenStream(adaptor,"token OP_POUND");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:530:13: ( ( type {...}? OP_POUND ) -> ^( AST_SCOPE ^( AST_TYPE_LIT type OP_POUND ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:530:17: ( type {...}? OP_POUND )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:530:17: ( type {...}? OP_POUND )
            // src/net/colar/netbeans/fan/antlr/Fan.g:530:18: type {...}? OP_POUND
            {
            pushFollow(FOLLOW_type_in_typeLiteral4175);
            type495=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type495.getTree());
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "typeLiteral", "notAfterEol()");
            }
            OP_POUND496=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_typeLiteral4179); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_POUND.add(OP_POUND496);


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
            // 531:5: -> ^( AST_SCOPE ^( AST_TYPE_LIT type OP_POUND ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:531:8: ^( AST_SCOPE ^( AST_TYPE_LIT type OP_POUND ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SCOPE, "AST_SCOPE"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:531:20: ^( AST_TYPE_LIT type OP_POUND )
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
            if ( state.backtracking>0 ) { memoize(input, 141, typeLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeLiteral"

    public static class slotLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slotLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:532:1: slotLiteral : ( ( type )? OP_POUND {...}? id ) -> ^( AST_SLOT_LIT ( type )? OP_POUND id ) ;
    public final FanParser.slotLiteral_return slotLiteral() throws RecognitionException {
        FanParser.slotLiteral_return retval = new FanParser.slotLiteral_return();
        retval.start = input.LT(1);
        int slotLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND498=null;
        FanParser.type_return type497 = null;

        FanParser.id_return id499 = null;


        Object OP_POUND498_tree=null;
        RewriteRuleTokenStream stream_OP_POUND=new RewriteRuleTokenStream(adaptor,"token OP_POUND");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:532:13: ( ( ( type )? OP_POUND {...}? id ) -> ^( AST_SLOT_LIT ( type )? OP_POUND id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:532:17: ( ( type )? OP_POUND {...}? id )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:532:17: ( ( type )? OP_POUND {...}? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:532:18: ( type )? OP_POUND {...}? id
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:532:18: ( type )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==SP_PIPE||LA133_0==ID||LA133_0==SQ_BRACKET_L) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_slotLiteral4208);
                    type497=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type497.getTree());

                    }
                    break;

            }

            OP_POUND498=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_slotLiteral4211); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_POUND.add(OP_POUND498);

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "slotLiteral", "notAfterEol()");
            }
            pushFollow(FOLLOW_id_in_slotLiteral4215);
            id499=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id499.getTree());

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
            // 533:5: -> ^( AST_SLOT_LIT ( type )? OP_POUND id )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:533:8: ^( AST_SLOT_LIT ( type )? OP_POUND id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SLOT_LIT, "AST_SLOT_LIT"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:533:23: ( type )?
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
            if ( state.backtracking>0 ) { memoize(input, 142, slotLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slotLiteral"

    public static class symbLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:534:1: symbLiteral : ( AT (id1= ( id SP_COLON SP_COLON ) )? id ) -> ^( AST_SYMBOL AT ( $id1)? id ) ;
    public final FanParser.symbLiteral_return symbLiteral() throws RecognitionException {
        FanParser.symbLiteral_return retval = new FanParser.symbLiteral_return();
        retval.start = input.LT(1);
        int symbLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token id1=null;
        Token AT500=null;
        Token SP_COLON502=null;
        Token SP_COLON503=null;
        FanParser.id_return id501 = null;

        FanParser.id_return id504 = null;


        Object id1_tree=null;
        Object AT500_tree=null;
        Object SP_COLON502_tree=null;
        Object SP_COLON503_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_SP_COLON=new RewriteRuleTokenStream(adaptor,"token SP_COLON");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:534:13: ( ( AT (id1= ( id SP_COLON SP_COLON ) )? id ) -> ^( AST_SYMBOL AT ( $id1)? id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:534:17: ( AT (id1= ( id SP_COLON SP_COLON ) )? id )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:534:17: ( AT (id1= ( id SP_COLON SP_COLON ) )? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:534:18: AT (id1= ( id SP_COLON SP_COLON ) )? id
            {
            AT500=(Token)match(input,AT,FOLLOW_AT_in_symbLiteral4243); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AT.add(AT500);

            // src/net/colar/netbeans/fan/antlr/Fan.g:534:24: (id1= ( id SP_COLON SP_COLON ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==ID) ) {
                int LA134_1 = input.LA(2);

                if ( (LA134_1==SP_COLON) ) {
                    alt134=1;
                }
            }
            switch (alt134) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: id1= ( id SP_COLON SP_COLON )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:534:25: ( id SP_COLON SP_COLON )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:534:26: id SP_COLON SP_COLON
                    {
                    pushFollow(FOLLOW_id_in_symbLiteral4248);
                    id501=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id501.getTree());
                    SP_COLON502=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_symbLiteral4250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SP_COLON.add(SP_COLON502);

                    SP_COLON503=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_symbLiteral4252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SP_COLON.add(SP_COLON503);


                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_symbLiteral4256);
            id504=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id504.getTree());

            }



            // AST REWRITE
            // elements: id, AT, id1
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
            // 535:5: -> ^( AST_SYMBOL AT ( $id1)? id )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:535:8: ^( AST_SYMBOL AT ( $id1)? id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_SYMBOL, "AST_SYMBOL"), root_1);

                adaptor.addChild(root_1, stream_AT.nextNode());
                // src/net/colar/netbeans/fan/antlr/Fan.g:535:24: ( $id1)?
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
            if ( state.backtracking>0 ) { memoize(input, 143, symbLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "symbLiteral"

    public static class namedSuper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namedSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:536:1: namedSuper : ( simpleType DOT KW_SUPER ) -> ^( AST_NAMED_SUPER simpleType DOT KW_SUPER ) ;
    public final FanParser.namedSuper_return namedSuper() throws RecognitionException {
        FanParser.namedSuper_return retval = new FanParser.namedSuper_return();
        retval.start = input.LT(1);
        int namedSuper_StartIndex = input.index();
        Object root_0 = null;

        Token DOT506=null;
        Token KW_SUPER507=null;
        FanParser.simpleType_return simpleType505 = null;


        Object DOT506_tree=null;
        Object KW_SUPER507_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_KW_SUPER=new RewriteRuleTokenStream(adaptor,"token KW_SUPER");
        RewriteRuleSubtreeStream stream_simpleType=new RewriteRuleSubtreeStream(adaptor,"rule simpleType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:536:13: ( ( simpleType DOT KW_SUPER ) -> ^( AST_NAMED_SUPER simpleType DOT KW_SUPER ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:536:15: ( simpleType DOT KW_SUPER )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:536:15: ( simpleType DOT KW_SUPER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:536:16: simpleType DOT KW_SUPER
            {
            pushFollow(FOLLOW_simpleType_in_namedSuper4284);
            simpleType505=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleType.add(simpleType505.getTree());
            DOT506=(Token)match(input,DOT,FOLLOW_DOT_in_namedSuper4286); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT506);

            KW_SUPER507=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_namedSuper4288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SUPER.add(KW_SUPER507);


            }



            // AST REWRITE
            // elements: DOT, simpleType, KW_SUPER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 537:5: -> ^( AST_NAMED_SUPER simpleType DOT KW_SUPER )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:537:8: ^( AST_NAMED_SUPER simpleType DOT KW_SUPER )
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
            if ( state.backtracking>0 ) { memoize(input, 144, namedSuper_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "namedSuper"

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // src/net/colar/netbeans/fan/antlr/Fan.g:538:1: list : ( ( type {...}?)? sq_bracketL listItems sq_bracketR ) -> ^( AST_LIST ( type )? sq_bracketL listItems sq_bracketR ) ;
    public final FanParser.list_return list() throws RecognitionException {
        FanParser.list_return retval = new FanParser.list_return();
        retval.start = input.LT(1);
        int list_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type508 = null;

        FanParser.sq_bracketL_return sq_bracketL509 = null;

        FanParser.listItems_return listItems510 = null;

        FanParser.sq_bracketR_return sq_bracketR511 = null;


        RewriteRuleSubtreeStream stream_listItems=new RewriteRuleSubtreeStream(adaptor,"rule listItems");
        RewriteRuleSubtreeStream stream_sq_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketR");
        RewriteRuleSubtreeStream stream_sq_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketL");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:538:8: ( ( ( type {...}?)? sq_bracketL listItems sq_bracketR ) -> ^( AST_LIST ( type )? sq_bracketL listItems sq_bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:538:10: ( ( type {...}?)? sq_bracketL listItems sq_bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:538:10: ( ( type {...}?)? sq_bracketL listItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:538:11: ( type {...}?)? sq_bracketL listItems sq_bracketR
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:538:11: ( type {...}?)?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==SQ_BRACKET_L) ) {
                int LA135_1 = input.LA(2);

                if ( (LA135_1==SP_PIPE||LA135_1==ID) ) {
                    alt135=1;
                }
            }
            else if ( (LA135_0==SP_PIPE||LA135_0==ID) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:538:12: type {...}?
                    {
                    pushFollow(FOLLOW_type_in_list4316);
                    type508=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type508.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "list", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_list4322);
            sq_bracketL509=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketL.add(sq_bracketL509.getTree());
            pushFollow(FOLLOW_listItems_in_list4324);
            listItems510=listItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_listItems.add(listItems510.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_list4326);
            sq_bracketR511=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketR.add(sq_bracketR511.getTree());

            }



            // AST REWRITE
            // elements: sq_bracketR, sq_bracketL, type, listItems
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 539:5: -> ^( AST_LIST ( type )? sq_bracketL listItems sq_bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:539:8: ^( AST_LIST ( type )? sq_bracketL listItems sq_bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_LIST, "AST_LIST"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:539:19: ( type )?
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
            if ( state.backtracking>0 ) { memoize(input, 145, list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class listItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:540:1: listItems : ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA );
    public final FanParser.listItems_return listItems() throws RecognitionException {
        FanParser.listItems_return retval = new FanParser.listItems_return();
        retval.start = input.LT(1);
        int listItems_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA513=null;
        Token SP_COMMA515=null;
        Token SP_COMMA516=null;
        FanParser.expr_return expr512 = null;

        FanParser.expr_return expr514 = null;


        Object SP_COMMA513_tree=null;
        Object SP_COMMA515_tree=null;
        Object SP_COMMA516_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:540:12: ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==OP_ELVIS) ) {
                alt138=1;
            }
            else if ( (LA138_0==SP_COMMA) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:540:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:540:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:540:15: expr ( SP_COMMA expr )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_listItems4355);
                    expr512=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr512.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:540:20: ( SP_COMMA expr )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==SP_COMMA) ) {
                            int LA136_1 = input.LA(2);

                            if ( (LA136_1==OP_ELVIS) ) {
                                alt136=1;
                            }


                        }


                        switch (alt136) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:540:21: SP_COMMA expr
                    	    {
                    	    SP_COMMA513=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems4358); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA513_tree = (Object)adaptor.create(SP_COMMA513);
                    	    adaptor.addChild(root_0, SP_COMMA513_tree);
                    	    }
                    	    pushFollow(FOLLOW_expr_in_listItems4360);
                    	    expr514=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr514.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:540:38: ( SP_COMMA )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==SP_COMMA) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA515=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems4365); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SP_COMMA515_tree = (Object)adaptor.create(SP_COMMA515);
                            adaptor.addChild(root_0, SP_COMMA515_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:540:51: SP_COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COMMA516=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems4371); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COMMA516_tree = (Object)adaptor.create(SP_COMMA516);
                    adaptor.addChild(root_0, SP_COMMA516_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 146, listItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listItems"

    public static class map_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map"
    // src/net/colar/netbeans/fan/antlr/Fan.g:541:1: map : ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR ) -> ^( AST_MAP ( mapType )? sq_bracketL mapItems sq_bracketR ) ;
    public final FanParser.map_return map() throws RecognitionException {
        FanParser.map_return retval = new FanParser.map_return();
        retval.start = input.LT(1);
        int map_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mapType_return mapType517 = null;

        FanParser.sq_bracketL_return sq_bracketL518 = null;

        FanParser.mapItems_return mapItems519 = null;

        FanParser.sq_bracketR_return sq_bracketR520 = null;


        RewriteRuleSubtreeStream stream_sq_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketR");
        RewriteRuleSubtreeStream stream_sq_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketL");
        RewriteRuleSubtreeStream stream_mapItems=new RewriteRuleSubtreeStream(adaptor,"rule mapItems");
        RewriteRuleSubtreeStream stream_mapType=new RewriteRuleSubtreeStream(adaptor,"rule mapType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:541:7: ( ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR ) -> ^( AST_MAP ( mapType )? sq_bracketL mapItems sq_bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:541:9: ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:541:9: ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:541:10: ( mapType {...}?)? sq_bracketL mapItems sq_bracketR
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:541:10: ( mapType {...}?)?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==SQ_BRACKET_L) ) {
                int LA139_1 = input.LA(2);

                if ( (LA139_1==SP_PIPE||LA139_1==ID) ) {
                    alt139=1;
                }
            }
            else if ( (LA139_0==SP_PIPE||LA139_0==ID) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:541:11: mapType {...}?
                    {
                    pushFollow(FOLLOW_mapType_in_map4382);
                    mapType517=mapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_mapType.add(mapType517.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "map", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_map4388);
            sq_bracketL518=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketL.add(sq_bracketL518.getTree());
            pushFollow(FOLLOW_mapItems_in_map4390);
            mapItems519=mapItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mapItems.add(mapItems519.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_map4392);
            sq_bracketR520=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sq_bracketR.add(sq_bracketR520.getTree());

            }



            // AST REWRITE
            // elements: sq_bracketL, mapType, mapItems, sq_bracketR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 542:5: -> ^( AST_MAP ( mapType )? sq_bracketL mapItems sq_bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:542:8: ^( AST_MAP ( mapType )? sq_bracketL mapItems sq_bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MAP, "AST_MAP"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:542:18: ( mapType )?
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
            if ( state.backtracking>0 ) { memoize(input, 147, map_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "map"

    public static class mapItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:543:1: mapItems : ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON );
    public final FanParser.mapItems_return mapItems() throws RecognitionException {
        FanParser.mapItems_return retval = new FanParser.mapItems_return();
        retval.start = input.LT(1);
        int mapItems_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA522=null;
        Token SP_COMMA524=null;
        Token SP_COLON525=null;
        FanParser.mapPair_return mapPair521 = null;

        FanParser.mapPair_return mapPair523 = null;


        Object SP_COMMA522_tree=null;
        Object SP_COMMA524_tree=null;
        Object SP_COLON525_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:543:11: ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==OP_ELVIS) ) {
                alt142=1;
            }
            else if ( (LA142_0==SP_COLON) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:543:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:543:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:543:14: mapPair ( SP_COMMA mapPair )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_mapPair_in_mapItems4421);
                    mapPair521=mapPair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair521.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:543:22: ( SP_COMMA mapPair )*
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==SP_COMMA) ) {
                            int LA140_1 = input.LA(2);

                            if ( (LA140_1==OP_ELVIS) ) {
                                alt140=1;
                            }


                        }


                        switch (alt140) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:543:23: SP_COMMA mapPair
                    	    {
                    	    SP_COMMA522=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems4424); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA522_tree = (Object)adaptor.create(SP_COMMA522);
                    	    adaptor.addChild(root_0, SP_COMMA522_tree);
                    	    }
                    	    pushFollow(FOLLOW_mapPair_in_mapItems4426);
                    	    mapPair523=mapPair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair523.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop140;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:543:42: ( SP_COMMA )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==SP_COMMA) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA524=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems4430); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SP_COMMA524_tree = (Object)adaptor.create(SP_COMMA524);
                            adaptor.addChild(root_0, SP_COMMA524_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:543:55: SP_COLON
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COLON525=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapItems4436); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLON525_tree = (Object)adaptor.create(SP_COLON525);
                    adaptor.addChild(root_0, SP_COLON525_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 148, mapItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapItems"

    public static class mapPair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapPair"
    // src/net/colar/netbeans/fan/antlr/Fan.g:544:1: mapPair : expr SP_COLON expr ;
    public final FanParser.mapPair_return mapPair() throws RecognitionException {
        FanParser.mapPair_return retval = new FanParser.mapPair_return();
        retval.start = input.LT(1);
        int mapPair_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON527=null;
        FanParser.expr_return expr526 = null;

        FanParser.expr_return expr528 = null;


        Object SP_COLON527_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:544:10: ( expr SP_COLON expr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:544:12: expr SP_COLON expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_mapPair4444);
            expr526=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr526.getTree());
            SP_COLON527=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapPair4446); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON527_tree = (Object)adaptor.create(SP_COLON527);
            adaptor.addChild(root_0, SP_COLON527_tree);
            }
            pushFollow(FOLLOW_expr_in_mapPair4448);
            expr528=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr528.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 149, mapPair_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapPair"

    public static class simple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple"
    // src/net/colar/netbeans/fan/antlr/Fan.g:545:1: simple : type parL expr parR ;
    public final FanParser.simple_return simple() throws RecognitionException {
        FanParser.simple_return retval = new FanParser.simple_return();
        retval.start = input.LT(1);
        int simple_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type529 = null;

        FanParser.parL_return parL530 = null;

        FanParser.expr_return expr531 = null;

        FanParser.parR_return parR532 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:545:9: ( type parL expr parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:545:11: type parL expr parR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_simple4456);
            type529=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type529.getTree());
            pushFollow(FOLLOW_parL_in_simple4458);
            parL530=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL530.getTree());
            pushFollow(FOLLOW_expr_in_simple4460);
            expr531=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr531.getTree());
            pushFollow(FOLLOW_parR_in_simple4462);
            parR532=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR532.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 150, simple_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simple"

    public static class docs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "docs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:547:1: docs : d= ( ( DOC )* ) -> ^( AST_DOCS ( $d)? ) ;
    public final FanParser.docs_return docs() throws RecognitionException {
        FanParser.docs_return retval = new FanParser.docs_return();
        retval.start = input.LT(1);
        int docs_StartIndex = input.index();
        Object root_0 = null;

        Token d=null;
        Token DOC533=null;

        Object d_tree=null;
        Object DOC533_tree=null;
        RewriteRuleTokenStream stream_DOC=new RewriteRuleTokenStream(adaptor,"token DOC");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 151) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:547:7: (d= ( ( DOC )* ) -> ^( AST_DOCS ( $d)? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:547:9: d= ( ( DOC )* )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:547:11: ( ( DOC )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:547:12: ( DOC )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:547:12: ( DOC )*
            loop143:
            do {
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==DOC) ) {
                    int LA143_2 = input.LA(2);

                    if ( (synpred239_Fan()) ) {
                        alt143=1;
                    }


                }


                switch (alt143) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: DOC
            	    {
            	    DOC533=(Token)match(input,DOC,FOLLOW_DOC_in_docs4474); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOC.add(DOC533);


            	    }
            	    break;

            	default :
            	    break loop143;
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
            // 547:18: -> ^( AST_DOCS ( $d)? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:547:21: ^( AST_DOCS ( $d)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_DOCS, "AST_DOCS"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:547:32: ( $d)?
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
            if ( state.backtracking>0 ) { memoize(input, 151, docs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "docs"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // src/net/colar/netbeans/fan/antlr/Fan.g:549:1: number : ( OP_MINUS )? NUMBER ;
    public final FanParser.number_return number() throws RecognitionException {
        FanParser.number_return retval = new FanParser.number_return();
        retval.start = input.LT(1);
        int number_StartIndex = input.index();
        Object root_0 = null;

        Token OP_MINUS534=null;
        Token NUMBER535=null;

        Object OP_MINUS534_tree=null;
        Object NUMBER535_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 152) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:549:9: ( ( OP_MINUS )? NUMBER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:549:12: ( OP_MINUS )? NUMBER
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:549:12: ( OP_MINUS )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==OP_MINUS) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: OP_MINUS
                    {
                    OP_MINUS534=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_number4496); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_MINUS534_tree = (Object)adaptor.create(OP_MINUS534);
                    adaptor.addChild(root_0, OP_MINUS534_tree);
                    }

                    }
                    break;

            }

            NUMBER535=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_number4499); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER535_tree = (Object)adaptor.create(NUMBER535);
            adaptor.addChild(root_0, NUMBER535_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 152, number_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class facet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "facet"
    // src/net/colar/netbeans/fan/antlr/Fan.g:550:1: facet : AT id ( AS_EQUAL expr )? ;
    public final FanParser.facet_return facet() throws RecognitionException {
        FanParser.facet_return retval = new FanParser.facet_return();
        retval.start = input.LT(1);
        int facet_StartIndex = input.index();
        Object root_0 = null;

        Token AT536=null;
        Token AS_EQUAL538=null;
        FanParser.id_return id537 = null;

        FanParser.expr_return expr539 = null;


        Object AT536_tree=null;
        Object AS_EQUAL538_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 153) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:550:8: ( AT id ( AS_EQUAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:550:10: AT id ( AS_EQUAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            AT536=(Token)match(input,AT,FOLLOW_AT_in_facet4507); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT536_tree = (Object)adaptor.create(AT536);
            adaptor.addChild(root_0, AT536_tree);
            }
            pushFollow(FOLLOW_id_in_facet4509);
            id537=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id537.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:550:16: ( AS_EQUAL expr )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==AS_EQUAL) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:550:17: AS_EQUAL expr
                    {
                    AS_EQUAL538=(Token)match(input,AS_EQUAL,FOLLOW_AS_EQUAL_in_facet4512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_EQUAL538_tree = (Object)adaptor.create(AS_EQUAL538);
                    adaptor.addChild(root_0, AS_EQUAL538_tree);
                    }
                    pushFollow(FOLLOW_expr_in_facet4514);
                    expr539=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr539.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 153, facet_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "facet"

    public static class eos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eos"
    // src/net/colar/netbeans/fan/antlr/Fan.g:553:1: eos : ( SP_SEMI | {...}?);
    public final FanParser.eos_return eos() throws RecognitionException {
        FanParser.eos_return retval = new FanParser.eos_return();
        retval.start = input.LT(1);
        int eos_StartIndex = input.index();
        Object root_0 = null;

        Token SP_SEMI540=null;

        Object SP_SEMI540_tree=null;

        paraphrase.push("Semicolumn or LineBreak");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 154) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:555:3: ( SP_SEMI | {...}?)
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==SP_SEMI) ) {
                int LA146_1 = input.LA(2);

                if ( (synpred242_Fan()) ) {
                    alt146=1;
                }
                else if ( ((lookupNL())) ) {
                    alt146=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 146, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA146_0==EOF||(LA146_0>=KW_BREAK && LA146_0<=KW_USING)||(LA146_0>=KW_RD_ONLY && LA146_0<=KW_FINAL)||(LA146_0>=KW_CLASS && LA146_0<=KW_ONCE)||LA146_0==KW_ELSE||LA146_0==BRACKET_R||LA146_0==SP_COMMA||LA146_0==SP_PIPE||LA146_0==OP_ELVIS||LA146_0==ID||(LA146_0>=AT && LA146_0<=DOC)||LA146_0==SQ_BRACKET_L) ) {
                alt146=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:555:5: SP_SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_SEMI540=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_eos4536); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_SEMI540_tree = (Object)adaptor.create(SP_SEMI540);
                    adaptor.addChild(root_0, SP_SEMI540_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:555:15: {...}?
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
            if ( state.backtracking>0 ) { memoize(input, 154, eos_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "eos"

    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // src/net/colar/netbeans/fan/antlr/Fan.g:557:1: id : ID -> ^( AST_ID ID ) ;
    public final FanParser.id_return id() throws RecognitionException {
        FanParser.id_return retval = new FanParser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token ID541=null;

        Object ID541_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        paraphrase.push("Identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 155) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:559:3: ( ID -> ^( AST_ID ID ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:559:6: ID
            {
            ID541=(Token)match(input,ID,FOLLOW_ID_in_id4560); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID541);



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
            // 559:9: -> ^( AST_ID ID )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:559:12: ^( AST_ID ID )
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
            if ( state.backtracking>0 ) { memoize(input, 155, id_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "id"

    public static class getter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:565:1: getter : t= ID {...}?;
    public final FanParser.getter_return getter() throws RecognitionException {
        FanParser.getter_return retval = new FanParser.getter_return();
        retval.start = input.LT(1);
        int getter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 156) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:565:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:565:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_getter4581); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 156, getter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "getter"

    public static class setter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:566:1: setter : t= ID {...}?;
    public final FanParser.setter_return setter() throws RecognitionException {
        FanParser.setter_return retval = new FanParser.setter_return();
        retval.start = input.LT(1);
        int setter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 157) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:566:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:566:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_setter4594); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 157, setter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "setter"

    public static class pod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pod"
    // src/net/colar/netbeans/fan/antlr/Fan.g:567:1: pod : t= ID {...}?;
    public final FanParser.pod_return pod() throws RecognitionException {
        FanParser.pod_return retval = new FanParser.pod_return();
        retval.start = input.LT(1);
        int pod_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 158) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:567:8: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:567:10: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_pod4608); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 158, pod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pod"

    public static class bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:570:1: bracketL : BRACKET_L ;
    public final FanParser.bracketL_return bracketL() throws RecognitionException {
        FanParser.bracketL_return retval = new FanParser.bracketL_return();
        retval.start = input.LT(1);
        int bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_L542=null;

        Object BRACKET_L542_tree=null;

        paraphrase.push("{");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 159) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:572:3: ( BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:572:5: BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_L542=(Token)match(input,BRACKET_L,FOLLOW_BRACKET_L_in_bracketL4630); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_L542_tree = (Object)adaptor.create(BRACKET_L542);
            adaptor.addChild(root_0, BRACKET_L542_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 159, bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketL"

    public static class bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:573:1: bracketR : BRACKET_R ;
    public final FanParser.bracketR_return bracketR() throws RecognitionException {
        FanParser.bracketR_return retval = new FanParser.bracketR_return();
        retval.start = input.LT(1);
        int bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_R543=null;

        Object BRACKET_R543_tree=null;

        paraphrase.push("}");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 160) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:575:3: ( BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:575:5: BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_R543=(Token)match(input,BRACKET_R,FOLLOW_BRACKET_R_in_bracketR4648); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_R543_tree = (Object)adaptor.create(BRACKET_R543);
            adaptor.addChild(root_0, BRACKET_R543_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 160, bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketR"

    public static class sq_bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:576:1: sq_bracketL : SQ_BRACKET_L ;
    public final FanParser.sq_bracketL_return sq_bracketL() throws RecognitionException {
        FanParser.sq_bracketL_return retval = new FanParser.sq_bracketL_return();
        retval.start = input.LT(1);
        int sq_bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_L544=null;

        Object SQ_BRACKET_L544_tree=null;

        paraphrase.push("[");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 161) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:578:3: ( SQ_BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:578:5: SQ_BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_L544=(Token)match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_sq_bracketL4666); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQ_BRACKET_L544_tree = (Object)adaptor.create(SQ_BRACKET_L544);
            adaptor.addChild(root_0, SQ_BRACKET_L544_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 161, sq_bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketL"

    public static class sq_bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:579:1: sq_bracketR : SQ_BRACKET_R ;
    public final FanParser.sq_bracketR_return sq_bracketR() throws RecognitionException {
        FanParser.sq_bracketR_return retval = new FanParser.sq_bracketR_return();
        retval.start = input.LT(1);
        int sq_bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_R545=null;

        Object SQ_BRACKET_R545_tree=null;

        paraphrase.push("]");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 162) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:581:3: ( SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:581:5: SQ_BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_R545=(Token)match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_sq_bracketR4684); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQ_BRACKET_R545_tree = (Object)adaptor.create(SQ_BRACKET_R545);
            adaptor.addChild(root_0, SQ_BRACKET_R545_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 162, sq_bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketR"

    public static class parL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:582:1: parL : PAR_L ;
    public final FanParser.parL_return parL() throws RecognitionException {
        FanParser.parL_return retval = new FanParser.parL_return();
        retval.start = input.LT(1);
        int parL_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_L546=null;

        Object PAR_L546_tree=null;

        paraphrase.push("(");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 163) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:584:3: ( PAR_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:584:5: PAR_L
            {
            root_0 = (Object)adaptor.nil();

            PAR_L546=(Token)match(input,PAR_L,FOLLOW_PAR_L_in_parL4702); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAR_L546_tree = (Object)adaptor.create(PAR_L546);
            adaptor.addChild(root_0, PAR_L546_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 163, parL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parL"

    public static class parR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:585:1: parR : PAR_R ;
    public final FanParser.parR_return parR() throws RecognitionException {
        FanParser.parR_return retval = new FanParser.parR_return();
        retval.start = input.LT(1);
        int parR_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_R547=null;

        Object PAR_R547_tree=null;

        paraphrase.push(")");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 164) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:587:3: ( PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:587:5: PAR_R
            {
            root_0 = (Object)adaptor.nil();

            PAR_R547=(Token)match(input,PAR_R,FOLLOW_PAR_R_in_parR4720); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAR_R547_tree = (Object)adaptor.create(PAR_R547);
            adaptor.addChild(root_0, PAR_R547_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 164, parR_StartIndex); }
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
        loop147:
        do {
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( ((LA147_0>=KW_CONST && LA147_0<=KW_STATIC)||LA147_0==KW_FINAL||(LA147_0>=KW_ABSTRACT && LA147_0<=KW_INTERNAL)) ) {
                alt147=1;
            }


            switch (alt147) {
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
        	    break loop147;
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
        int alt148=2;
        int LA148_0 = input.LA(1);

        if ( ((LA148_0>=KW_PRIVATE && LA148_0<=KW_INTERNAL)) ) {
            alt148=1;
        }
        switch (alt148) {
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
        int alt150=2;
        int LA150_0 = input.LA(1);

        if ( (LA150_0==SP_QMARK) ) {
            alt150=1;
        }
        switch (alt150) {
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
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:44: ( type )
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:44: type
        {
        pushFollow(FOLLOW_type_in_synpred60_Fan1579);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_Fan

    // $ANTLR start synpred61_Fan
    public final void synpred61_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:19: ( ( formals OP_SAFEDYN_CALL ( type )? ) )
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:19: ( formals OP_SAFEDYN_CALL ( type )? )
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:19: ( formals OP_SAFEDYN_CALL ( type )? )
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:20: formals OP_SAFEDYN_CALL ( type )?
        {
        pushFollow(FOLLOW_formals_in_synpred61_Fan1575);
        formals();

        state._fsp--;
        if (state.failed) return ;
        match(input,OP_SAFEDYN_CALL,FOLLOW_OP_SAFEDYN_CALL_in_synpred61_Fan1577); if (state.failed) return ;
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:44: ( type )?
        int alt152=2;
        int LA152_0 = input.LA(1);

        if ( (LA152_0==SP_PIPE||LA152_0==ID||LA152_0==SQ_BRACKET_L) ) {
            alt152=1;
        }
        switch (alt152) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                {
                pushFollow(FOLLOW_type_in_synpred61_Fan1579);
                type();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred61_Fan

    // $ANTLR start synpred62_Fan
    public final void synpred62_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:63: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:64: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred62_Fan1590); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_Fan

    // $ANTLR start synpred63_Fan
    public final void synpred63_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:53: ( ( formals ( ( OP_ARROW )=> assignedType )? ) )
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:53: ( formals ( ( OP_ARROW )=> assignedType )? )
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:53: ( formals ( ( OP_ARROW )=> assignedType )? )
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:54: formals ( ( OP_ARROW )=> assignedType )?
        {
        pushFollow(FOLLOW_formals_in_synpred63_Fan1586);
        formals();

        state._fsp--;
        if (state.failed) return ;
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:62: ( ( OP_ARROW )=> assignedType )?
        int alt153=2;
        int LA153_0 = input.LA(1);

        if ( (LA153_0==OP_ARROW) && (synpred62_Fan())) {
            alt153=1;
        }
        switch (alt153) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:330:63: ( OP_ARROW )=> assignedType
                {
                pushFollow(FOLLOW_assignedType_in_synpred63_Fan1593);
                assignedType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred63_Fan

    // $ANTLR start synpred64_Fan
    public final void synpred64_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:94: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:95: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred64_Fan1602); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_Fan

    // $ANTLR start synpred65_Fan
    public final void synpred65_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:331:25: ( type )
        // src/net/colar/netbeans/fan/antlr/Fan.g:331:25: type
        {
        pushFollow(FOLLOW_type_in_synpred65_Fan1615);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_Fan

    // $ANTLR start synpred67_Fan
    public final void synpred67_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:19: ( formalFull )
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:19: formalFull
        {
        pushFollow(FOLLOW_formalFull_in_synpred67_Fan1664);
        formalFull();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_Fan

    // $ANTLR start synpred68_Fan
    public final void synpred68_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:32: ( formalTypeOnly )
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:32: formalTypeOnly
        {
        pushFollow(FOLLOW_formalTypeOnly_in_synpred68_Fan1668);
        formalTypeOnly();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_Fan

    // $ANTLR start synpred69_Fan
    public final void synpred69_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:339:13: ( KW_STATIC bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:339:14: KW_STATIC bracketL
        {
        match(input,KW_STATIC,FOLLOW_KW_STATIC_in_synpred69_Fan1717); if (state.failed) return ;
        pushFollow(FOLLOW_bracketL_in_synpred69_Fan1719);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Fan

    // $ANTLR start synpred70_Fan
    public final void synpred70_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:340:11: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:340:11: facet
        {
        pushFollow(FOLLOW_facet_in_synpred70_Fan1733);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Fan

    // $ANTLR start synpred72_Fan
    public final void synpred72_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:342:7: ( ( ctorFlags )* KW_NEW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:342:8: ( ctorFlags )* KW_NEW
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:342:8: ( ctorFlags )*
        loop154:
        do {
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( ((LA154_0>=KW_PRIVATE && LA154_0<=KW_INTERNAL)) ) {
                alt154=1;
            }


            switch (alt154) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ctorFlags
        	    {
        	    pushFollow(FOLLOW_ctorFlags_in_synpred72_Fan1750);
        	    ctorFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop154;
            }
        } while (true);

        match(input,KW_NEW,FOLLOW_KW_NEW_in_synpred72_Fan1753); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_Fan

    // $ANTLR start synpred75_Fan
    public final void synpred75_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:343:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:343:8: ( methodFlags )* ( type | KW_VOID ) id parL
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:343:8: ( methodFlags )*
        loop155:
        do {
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( ((LA155_0>=KW_STATIC && LA155_0<=KW_NATIVE)||(LA155_0>=KW_OVERRIDE && LA155_0<=KW_FINAL)||(LA155_0>=KW_ABSTRACT && LA155_0<=KW_INTERNAL)||LA155_0==KW_ONCE) ) {
                alt155=1;
            }


            switch (alt155) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: methodFlags
        	    {
        	    pushFollow(FOLLOW_methodFlags_in_synpred75_Fan1767);
        	    methodFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop155;
            }
        } while (true);

        // src/net/colar/netbeans/fan/antlr/Fan.g:343:21: ( type | KW_VOID )
        int alt156=2;
        int LA156_0 = input.LA(1);

        if ( (LA156_0==SP_PIPE||LA156_0==ID||LA156_0==SQ_BRACKET_L) ) {
            alt156=1;
        }
        else if ( (LA156_0==KW_VOID) ) {
            alt156=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 156, 0, input);

            throw nvae;
        }
        switch (alt156) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:343:22: type
                {
                pushFollow(FOLLOW_type_in_synpred75_Fan1771);
                type();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:343:29: KW_VOID
                {
                match(input,KW_VOID,FOLLOW_KW_VOID_in_synpred75_Fan1775); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_id_in_synpred75_Fan1778);
        id();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_parL_in_synpred75_Fan1780);
        parL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_Fan

    // $ANTLR start synpred79_Fan
    public final void synpred79_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:351:29: ( getter )
        // src/net/colar/netbeans/fan/antlr/Fan.g:351:29: getter
        {
        pushFollow(FOLLOW_getter_in_synpred79_Fan1865);
        getter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_Fan

    // $ANTLR start synpred81_Fan
    public final void synpred81_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:351:55: ( block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:351:55: block
        {
        pushFollow(FOLLOW_block_in_synpred81_Fan1875);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred81_Fan

    // $ANTLR start synpred84_Fan
    public final void synpred84_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:354:12: ( type id )
        // src/net/colar/netbeans/fan/antlr/Fan.g:354:13: type id
        {
        pushFollow(FOLLOW_type_in_synpred84_Fan1922);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_id_in_synpred84_Fan1924);
        id();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred84_Fan

    // $ANTLR start synpred107_Fan
    public final void synpred107_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:366:15: ( multiStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:366:16: multiStmt
        {
        pushFollow(FOLLOW_multiStmt_in_synpred107_Fan2182);
        multiStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred107_Fan

    // $ANTLR start synpred116_Fan
    public final void synpred116_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:378:6: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:378:7: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred116_Fan2376);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred116_Fan

    // $ANTLR start synpred128_Fan
    public final void synpred128_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:386:15: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:386:15: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred128_Fan2490);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred128_Fan

    // $ANTLR start synpred132_Fan
    public final void synpred132_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:397:6: ( KW_ELSE block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:397:6: KW_ELSE block
        {
        match(input,KW_ELSE,FOLLOW_KW_ELSE_in_synpred132_Fan2608); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred132_Fan2610);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred132_Fan

    // $ANTLR start synpred133_Fan
    public final void synpred133_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:398:23: ( eos )
        // src/net/colar/netbeans/fan/antlr/Fan.g:398:23: eos
        {
        pushFollow(FOLLOW_eos_in_synpred133_Fan2622);
        eos();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_Fan

    // $ANTLR start synpred136_Fan
    public final void synpred136_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:17: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:18: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred136_Fan2718);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_Fan

    // $ANTLR start synpred137_Fan
    public final void synpred137_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:51: ( KW_CATCH )
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:52: KW_CATCH
        {
        match(input,KW_CATCH,FOLLOW_KW_CATCH_in_synpred137_Fan2730); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_Fan

    // $ANTLR start synpred138_Fan
    public final void synpred138_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:74: ( KW_FINALLY )
        // src/net/colar/netbeans/fan/antlr/Fan.g:404:75: KW_FINALLY
        {
        match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_synpred138_Fan2739); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred138_Fan

    // $ANTLR start synpred143_Fan
    public final void synpred143_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:416:25: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:416:26: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred143_Fan2879);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred143_Fan

    // $ANTLR start synpred144_Fan
    public final void synpred144_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:421:25: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:421:26: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred144_Fan2938);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred144_Fan

    // $ANTLR start synpred147_Fan
    public final void synpred147_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:430:22: ( assignOp assignExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:430:22: assignOp assignExpr
        {
        pushFollow(FOLLOW_assignOp_in_synpred147_Fan3010);
        assignOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_assignExpr_in_synpred147_Fan3012);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred147_Fan

    // $ANTLR start synpred148_Fan
    public final void synpred148_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:15: ( ternaryExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:15: ternaryExpr
        {
        pushFollow(FOLLOW_ternaryExpr_in_synpred148_Fan3027);
        ternaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred148_Fan

    // $ANTLR start synpred150_Fan
    public final void synpred150_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:437:27: ( ternaryTail )
        // src/net/colar/netbeans/fan/antlr/Fan.g:437:27: ternaryTail
        {
        pushFollow(FOLLOW_ternaryTail_in_synpred150_Fan3080);
        ternaryTail();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred150_Fan

    // $ANTLR start synpred152_Fan
    public final void synpred152_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:442:29: ( OP_OR condAndExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:442:29: OP_OR condAndExpr
        {
        match(input,OP_OR,FOLLOW_OP_OR_in_synpred152_Fan3120); if (state.failed) return ;
        pushFollow(FOLLOW_condAndExpr_in_synpred152_Fan3123);
        condAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred152_Fan

    // $ANTLR start synpred153_Fan
    public final void synpred153_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:443:30: ( OP_AND equalityExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:443:30: OP_AND equalityExpr
        {
        match(input,OP_AND,FOLLOW_OP_AND_in_synpred153_Fan3136); if (state.failed) return ;
        pushFollow(FOLLOW_equalityExpr_in_synpred153_Fan3139);
        equalityExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred153_Fan

    // $ANTLR start synpred154_Fan
    public final void synpred154_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:444:32: ( CP_EQUALITY relationalExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:444:32: CP_EQUALITY relationalExpr
        {
        match(input,CP_EQUALITY,FOLLOW_CP_EQUALITY_in_synpred154_Fan3152); if (state.failed) return ;
        pushFollow(FOLLOW_relationalExpr_in_synpred154_Fan3154);
        relationalExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred154_Fan

    // $ANTLR start synpred155_Fan
    public final void synpred155_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:446:31: ( typeCheck )
        // src/net/colar/netbeans/fan/antlr/Fan.g:446:31: typeCheck
        {
        pushFollow(FOLLOW_typeCheck_in_synpred155_Fan3170);
        typeCheck();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred155_Fan

    // $ANTLR start synpred160_Fan
    public final void synpred160_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:449:15: ( CP_COMPARATORS elvisExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:449:15: CP_COMPARATORS elvisExpr
        {
        match(input,CP_COMPARATORS,FOLLOW_CP_COMPARATORS_in_synpred160_Fan3218); if (state.failed) return ;
        pushFollow(FOLLOW_elvisExpr_in_synpred160_Fan3220);
        elvisExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred160_Fan

    // $ANTLR start synpred173_Fan
    public final void synpred173_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:14: ( prefixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:14: prefixExpr
        {
        pushFollow(FOLLOW_prefixExpr_in_synpred173_Fan3395);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred173_Fan

    // $ANTLR start synpred174_Fan
    public final void synpred174_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:27: ( postfixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:27: postfixExpr
        {
        pushFollow(FOLLOW_postfixExpr_in_synpred174_Fan3399);
        postfixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred174_Fan

    // $ANTLR start synpred182_Fan
    public final void synpred182_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:473:13: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:473:13: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred182_Fan3498);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred182_Fan

    // $ANTLR start synpred183_Fan
    public final void synpred183_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:473:25: ( literal )
        // src/net/colar/netbeans/fan/antlr/Fan.g:473:25: literal
        {
        pushFollow(FOLLOW_literal_in_synpred183_Fan3502);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred183_Fan

    // $ANTLR start synpred184_Fan
    public final void synpred184_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:473:35: ( typeBase )
        // src/net/colar/netbeans/fan/antlr/Fan.g:473:35: typeBase
        {
        pushFollow(FOLLOW_typeBase_in_synpred184_Fan3506);
        typeBase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred184_Fan

    // $ANTLR start synpred185_Fan
    public final void synpred185_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:474:12: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:474:12: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred185_Fan3517);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred185_Fan

    // $ANTLR start synpred186_Fan
    public final void synpred186_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:474:26: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:474:26: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred186_Fan3521);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred186_Fan

    // $ANTLR start synpred187_Fan
    public final void synpred187_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:474:40: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:474:40: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred187_Fan3525);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred187_Fan

    // $ANTLR start synpred188_Fan
    public final void synpred188_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:474:53: ( staticCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:474:53: staticCall
        {
        pushFollow(FOLLOW_staticCall_in_synpred188_Fan3529);
        staticCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred188_Fan

    // $ANTLR start synpred189_Fan
    public final void synpred189_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:475:19: ( dsl )
        // src/net/colar/netbeans/fan/antlr/Fan.g:475:19: dsl
        {
        pushFollow(FOLLOW_dsl_in_synpred189_Fan3551);
        dsl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred189_Fan

    // $ANTLR start synpred190_Fan
    public final void synpred190_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:475:25: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:475:25: closure
        {
        pushFollow(FOLLOW_closure_in_synpred190_Fan3555);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred190_Fan

    // $ANTLR start synpred191_Fan
    public final void synpred191_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:475:35: ( simple )
        // src/net/colar/netbeans/fan/antlr/Fan.g:475:35: simple
        {
        pushFollow(FOLLOW_simple_in_synpred191_Fan3559);
        simple();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred191_Fan

    // $ANTLR start synpred192_Fan
    public final void synpred192_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:481:14: ( dotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:481:14: dotCall
        {
        pushFollow(FOLLOW_dotCall_in_synpred192_Fan3624);
        dotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred192_Fan

    // $ANTLR start synpred194_Fan
    public final void synpred194_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:481:34: ( safeDotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:481:34: safeDotCall
        {
        pushFollow(FOLLOW_safeDotCall_in_synpred194_Fan3632);
        safeDotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred194_Fan

    // $ANTLR start synpred199_Fan
    public final void synpred199_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:482:35: ( incDotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:482:35: incDotCall
        {
        pushFollow(FOLLOW_incDotCall_in_synpred199_Fan3655);
        incDotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred199_Fan

    // $ANTLR start synpred205_Fan
    public final void synpred205_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:512:12: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:512:12: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred205_Fan3926);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred205_Fan

    // $ANTLR start synpred207_Fan
    public final void synpred207_Fan_fragment() throws RecognitionException {   
        FanParser.callParams_return p = null;

        FanParser.closure_return c = null;


        // src/net/colar/netbeans/fan/antlr/Fan.g:518:14: ( (p= callParams c= closure ) )
        // src/net/colar/netbeans/fan/antlr/Fan.g:518:14: (p= callParams c= closure )
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:518:14: (p= callParams c= closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:518:15: p= callParams c= closure
        {
        pushFollow(FOLLOW_callParams_in_synpred207_Fan3971);
        p=callParams();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_closure_in_synpred207_Fan3975);
        c=closure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred207_Fan

    // $ANTLR start synpred208_Fan
    public final void synpred208_Fan_fragment() throws RecognitionException {   
        FanParser.callParams_return p = null;


        // src/net/colar/netbeans/fan/antlr/Fan.g:518:41: (p= callParams )
        // src/net/colar/netbeans/fan/antlr/Fan.g:518:41: p= callParams
        {
        pushFollow(FOLLOW_callParams_in_synpred208_Fan3982);
        p=callParams();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred208_Fan

    // $ANTLR start synpred221_Fan
    public final void synpred221_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:525:20: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:525:20: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred221_Fan4097);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred221_Fan

    // $ANTLR start synpred222_Fan
    public final void synpred222_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:526:4: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:526:4: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred222_Fan4104);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred222_Fan

    // $ANTLR start synpred223_Fan
    public final void synpred223_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:526:18: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:526:18: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred223_Fan4108);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred223_Fan

    // $ANTLR start synpred224_Fan
    public final void synpred224_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:526:32: ( list )
        // src/net/colar/netbeans/fan/antlr/Fan.g:526:32: list
        {
        pushFollow(FOLLOW_list_in_synpred224_Fan4112);
        list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred224_Fan

    // $ANTLR start synpred225_Fan
    public final void synpred225_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:526:39: ( map )
        // src/net/colar/netbeans/fan/antlr/Fan.g:526:39: map
        {
        pushFollow(FOLLOW_map_in_synpred225_Fan4116);
        map();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred225_Fan

    // $ANTLR start synpred239_Fan
    public final void synpred239_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:547:12: ( DOC )
        // src/net/colar/netbeans/fan/antlr/Fan.g:547:12: DOC
        {
        match(input,DOC,FOLLOW_DOC_in_synpred239_Fan4474); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred239_Fan

    // $ANTLR start synpred242_Fan
    public final void synpred242_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:555:5: ( SP_SEMI )
        // src/net/colar/netbeans/fan/antlr/Fan.g:555:5: SP_SEMI
        {
        match(input,SP_SEMI,FOLLOW_SP_SEMI_in_synpred242_Fan4536); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred242_Fan

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
    public final boolean synpred208_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred208_Fan_fragment(); // can never throw exception
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
    public final boolean synpred81_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_Fan_fragment(); // can never throw exception
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
    public final boolean synpred150_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred150_Fan_fragment(); // can never throw exception
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
    public final boolean synpred160_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred160_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred148_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred148_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred194_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred194_Fan_fragment(); // can never throw exception
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
    public final boolean synpred144_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred144_Fan_fragment(); // can never throw exception
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
    public final boolean synpred84_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred192_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred192_Fan_fragment(); // can never throw exception
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
    public final boolean synpred107_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred107_Fan_fragment(); // can never throw exception
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
    public final boolean synpred154_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_Fan_fragment(); // can never throw exception
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
    public final boolean synpred225_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred225_Fan_fragment(); // can never throw exception
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
    public final boolean synpred153_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred153_Fan_fragment(); // can never throw exception
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
    public final boolean synpred152_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred152_Fan_fragment(); // can never throw exception
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
    public final boolean synpred242_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred242_Fan_fragment(); // can never throw exception
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
    public final boolean synpred143_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred143_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred173_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred173_Fan_fragment(); // can never throw exception
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
    public final boolean synpred147_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred147_Fan_fragment(); // can never throw exception
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
    public final boolean synpred155_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred155_Fan_fragment(); // can never throw exception
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
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA120 dfa120 = new DFA120(this);
    protected DFA131 dfa131 = new DFA131(this);
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
        "\1\uffff\1\4\1\uffff\1\11\2\uffff\2\4\2\uffff\1\4\1\11\1\17\3\uffff";
    static final String DFA4_minS =
        "\2\21\1\176\1\21\1\uffff\1\u0088\2\21\1\136\1\uffff\3\21\1\136\2"+
        "\uffff";
    static final String DFA4_maxS =
        "\1\21\1\u0087\1\176\1\u0085\1\uffff\1\u0088\2\u0085\1\176\1\uffff"+
        "\2\u0085\1\u00a7\1\176\2\uffff";
    static final String DFA4_acceptS =
        "\4\uffff\1\4\4\uffff\1\1\4\uffff\1\3\1\2";
    static final String DFA4_specialS =
        "\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\104\uffff\1\4\25"+
            "\uffff\1\3\5\uffff\2\4\1\uffff\1\2",
            "\1\5",
            "\1\11\2\uffff\2\11\4\uffff\1\11\1\uffff\10\11\70\uffff\1\7"+
            "\1\6\12\uffff\1\11\25\uffff\1\10\5\uffff\2\11",
            "",
            "\1\12",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\104\uffff\1\4\25"+
            "\uffff\1\13\5\uffff\2\4",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\104\uffff\1\4\25"+
            "\uffff\1\14\5\uffff\2\4",
            "\1\4\37\uffff\1\11",
            "",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\104\uffff\1\4\25"+
            "\uffff\1\3\5\uffff\2\4",
            "\1\11\2\uffff\2\11\4\uffff\1\11\1\uffff\10\11\70\uffff\1\7"+
            "\1\6\12\uffff\1\11\25\uffff\1\10\5\uffff\2\11",
            "\1\17\1\16\1\uffff\2\17\4\uffff\1\17\1\uffff\10\17\104\uffff"+
            "\1\17\25\uffff\1\15\5\uffff\2\17\41\uffff\1\16",
            "\1\4\37\uffff\1\17",
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
            return "264:5: ( usingPod | usingType | usingAs | incUsing )";
        }
    }
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\1\uffff\1\4\4\uffff\1\12\1\uffff\1\13\4\uffff";
    static final String DFA6_minS =
        "\2\21\1\176\1\134\1\uffff\1\u0088\1\21\1\uffff\1\21\1\134\2\uffff"+
        "\1\134";
    static final String DFA6_maxS =
        "\1\21\1\u0087\2\176\1\uffff\1\u0088\1\u0085\1\uffff\1\u0085\1\176"+
        "\2\uffff\1\176";
    static final String DFA6_acceptS =
        "\4\uffff\1\1\2\uffff\1\4\2\uffff\1\3\1\2\1\uffff";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\104\uffff\1\4\25"+
            "\uffff\1\3\5\uffff\2\4\1\uffff\1\2",
            "\1\5",
            "\1\7\1\6\40\uffff\1\4",
            "",
            "\1\10",
            "\1\12\2\uffff\2\12\4\uffff\1\12\1\uffff\10\12\104\uffff\1\12"+
            "\25\uffff\1\11\5\uffff\2\12",
            "",
            "\1\13\2\uffff\2\13\4\uffff\1\13\1\uffff\10\13\104\uffff\1\13"+
            "\25\uffff\1\14\5\uffff\2\13",
            "\1\7\1\6\40\uffff\1\12",
            "",
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
    static final String DFA53_eotS =
        "\23\uffff";
    static final String DFA53_eofS =
        "\23\uffff";
    static final String DFA53_minS =
        "\1\23\1\0\21\uffff";
    static final String DFA53_maxS =
        "\1\u0087\1\0\21\uffff";
    static final String DFA53_acceptS =
        "\2\uffff\1\2\17\uffff\1\1";
    static final String DFA53_specialS =
        "\1\uffff\1\0\21\uffff}>";
    static final String[] DFA53_transitionS = {
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
            return "339:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index53_1);
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
    static final String DFA52_eotS =
        "\22\uffff";
    static final String DFA52_eofS =
        "\22\uffff";
    static final String DFA52_minS =
        "\1\23\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA52_maxS =
        "\1\u0087\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA52_acceptS =
        "\4\uffff\1\1\4\uffff\1\2\5\uffff\1\3\2\uffff";
    static final String DFA52_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12"+
        "\1\13\1\14\3\uffff}>";
    static final String[] DFA52_transitionS = {
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
            return "341:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_0 = input.LA(1);

                         
                        int index52_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA52_0==DOC) ) {s = 1;}

                        else if ( (LA52_0==AT) ) {s = 2;}

                        else if ( ((LA52_0>=KW_PRIVATE && LA52_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA52_0==KW_NEW) && (synpred72_Fan())) {s = 4;}

                        else if ( (LA52_0==KW_VIRTUAL) ) {s = 5;}

                        else if ( (LA52_0==KW_OVERRIDE) ) {s = 6;}

                        else if ( (LA52_0==KW_ABSTRACT) ) {s = 7;}

                        else if ( (LA52_0==KW_STATIC) ) {s = 8;}

                        else if ( (LA52_0==KW_ONCE) && (synpred75_Fan())) {s = 9;}

                        else if ( (LA52_0==KW_NATIVE) ) {s = 10;}

                        else if ( (LA52_0==KW_FINAL) ) {s = 11;}

                        else if ( (LA52_0==SQ_BRACKET_L) ) {s = 12;}

                        else if ( (LA52_0==SP_PIPE) ) {s = 13;}

                        else if ( (LA52_0==ID) ) {s = 14;}

                        else if ( ((LA52_0>=KW_RD_ONLY && LA52_0<=KW_CONST)||LA52_0==KW_VOLATILE) ) {s = 15;}

                         
                        input.seek(index52_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_1 = input.LA(1);

                         
                        int index52_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Fan()) ) {s = 4;}

                        else if ( (synpred75_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index52_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA52_2 = input.LA(1);

                         
                        int index52_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Fan()) ) {s = 4;}

                        else if ( (synpred75_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index52_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA52_3 = input.LA(1);

                         
                        int index52_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Fan()) ) {s = 4;}

                        else if ( (synpred75_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index52_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA52_5 = input.LA(1);

                         
                        int index52_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index52_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA52_6 = input.LA(1);

                         
                        int index52_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index52_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA52_7 = input.LA(1);

                         
                        int index52_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index52_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA52_8 = input.LA(1);

                         
                        int index52_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index52_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA52_10 = input.LA(1);

                         
                        int index52_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index52_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA52_11 = input.LA(1);

                         
                        int index52_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index52_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA52_12 = input.LA(1);

                         
                        int index52_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index52_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA52_13 = input.LA(1);

                         
                        int index52_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index52_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA52_14 = input.LA(1);

                         
                        int index52_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index52_14);
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
    static final String DFA62_eotS =
        "\12\uffff";
    static final String DFA62_eofS =
        "\3\uffff\1\10\6\uffff";
    static final String DFA62_minS =
        "\1\145\2\uffff\1\4\5\uffff\1\0";
    static final String DFA62_maxS =
        "\1\u0087\2\uffff\1\u0087\5\uffff\1\0";
    static final String DFA62_acceptS =
        "\1\uffff\2\1\1\uffff\4\1\1\2\1\uffff";
    static final String DFA62_specialS =
        "\1\1\2\uffff\1\0\5\uffff\1\2}>";
    static final String[] DFA62_transitionS = {
            "\1\2\30\uffff\1\3\10\uffff\1\1",
            "",
            "",
            "\15\10\2\uffff\10\10\4\uffff\7\10\2\uffff\1\10\63\uffff\1\4"+
            "\1\uffff\3\10\1\7\1\10\1\5\1\6\1\10\2\uffff\2\10\24\uffff\1"+
            "\11\5\uffff\2\10\1\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff"
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
            return "354:11: ( ( type id )=> typeAndId | fieldId )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_3 = input.LA(1);

                         
                        int index62_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA62_3==SP_COLCOL) && (synpred84_Fan())) {s = 4;}

                        else if ( (LA62_3==SP_QMARK) && (synpred84_Fan())) {s = 5;}

                        else if ( (LA62_3==LIST_TYPE) && (synpred84_Fan())) {s = 6;}

                        else if ( (LA62_3==SP_COLON) && (synpred84_Fan())) {s = 7;}

                        else if ( (LA62_3==EOF||(LA62_3>=KW_BREAK && LA62_3<=KW_FINALLY)||(LA62_3>=KW_RD_ONLY && LA62_3<=KW_FINAL)||(LA62_3>=KW_ABSTRACT && LA62_3<=KW_ONCE)||LA62_3==KW_ELSE||(LA62_3>=BRACKET_L && LA62_3<=AS_INIT_VAL)||LA62_3==SP_COMMA||LA62_3==SP_PIPE||(LA62_3>=SP_SEMI && LA62_3<=OP_ELVIS)||(LA62_3>=AT && LA62_3<=DOC)||LA62_3==SQ_BRACKET_L) ) {s = 8;}

                        else if ( (LA62_3==ID) ) {s = 9;}

                         
                        input.seek(index62_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_0 = input.LA(1);

                         
                        int index62_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA62_0==SQ_BRACKET_L) && (synpred84_Fan())) {s = 1;}

                        else if ( (LA62_0==SP_PIPE) && (synpred84_Fan())) {s = 2;}

                        else if ( (LA62_0==ID) ) {s = 3;}

                         
                        input.seek(index62_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_9 = input.LA(1);

                         
                        int index62_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index62_9);
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
    static final String DFA80_eotS =
        "\14\uffff";
    static final String DFA80_eofS =
        "\14\uffff";
    static final String DFA80_minS =
        "\1\4\13\uffff";
    static final String DFA80_maxS =
        "\1\u0087\13\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA80_specialS =
        "\14\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\4\1\5\1\2\1\1\1\6\1\7\1\10\1\3\1\11\130\uffff\1\13\3\uffff"+
            "\1\12\24\uffff\1\13\10\uffff\1\13",
            "",
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
            return "382:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )";
        }
    }
    static final String DFA81_eotS =
        "\46\uffff";
    static final String DFA81_eofS =
        "\1\1\45\uffff";
    static final String DFA81_minS =
        "\1\4\4\uffff\1\0\12\uffff\2\0\5\uffff\12\0\5\uffff";
    static final String DFA81_maxS =
        "\1\u0087\4\uffff\1\0\12\uffff\2\0\5\uffff\12\0\5\uffff";
    static final String DFA81_acceptS =
        "\1\uffff\1\2\43\uffff\1\1";
    static final String DFA81_specialS =
        "\5\uffff\1\0\12\uffff\1\1\1\2\5\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1"+
        "\11\1\12\1\13\1\14\5\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\32\1\33\1\30\1\27\1\34\1\35\1\36\1\31\1\37\4\1\2\uffff\10"+
            "\1\4\uffff\7\1\2\uffff\1\1\66\uffff\1\1\2\uffff\1\1\2\uffff"+
            "\1\21\2\uffff\1\1\1\40\24\uffff\1\5\5\uffff\2\1\1\uffff\1\20",
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
            return "()* loopback of 386:15: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_5 = input.LA(1);

                         
                        int index81_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_Fan()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA81_16 = input.LA(1);

                         
                        int index81_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_Fan()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_16);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA81_17 = input.LA(1);

                         
                        int index81_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_Fan()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_17);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA81_23 = input.LA(1);

                         
                        int index81_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_Fan()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_23);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA81_24 = input.LA(1);

                         
                        int index81_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_Fan()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_24);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA81_25 = input.LA(1);

                         
                        int index81_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_Fan()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_25);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA81_26 = input.LA(1);

                         
                        int index81_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_Fan()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_26);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA81_27 = input.LA(1);

                         
                        int index81_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_Fan()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_27);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA81_28 = input.LA(1);

                         
                        int index81_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_Fan()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_28);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA81_29 = input.LA(1);

                         
                        int index81_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_Fan()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_29);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA81_30 = input.LA(1);

                         
                        int index81_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_Fan()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_30);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA81_31 = input.LA(1);

                         
                        int index81_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_Fan()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_31);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA81_32 = input.LA(1);

                         
                        int index81_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred128_Fan()) ) {s = 37;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index81_32);
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
    static final String DFA86_eotS =
        "\46\uffff";
    static final String DFA86_eofS =
        "\1\1\45\uffff";
    static final String DFA86_minS =
        "\1\4\36\uffff\1\0\6\uffff";
    static final String DFA86_maxS =
        "\1\u0087\36\uffff\1\0\6\uffff";
    static final String DFA86_acceptS =
        "\1\uffff\1\1\43\uffff\1\2";
    static final String DFA86_specialS =
        "\37\uffff\1\0\6\uffff}>";
    static final String[] DFA86_transitionS = {
            "\15\1\2\uffff\10\1\4\uffff\7\1\2\uffff\1\1\66\uffff\1\1\2\uffff"+
            "\1\1\2\uffff\1\1\2\uffff\1\1\1\37\24\uffff\1\1\5\uffff\2\1\1"+
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
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "398:22: ( eos | expr eos )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_31 = input.LA(1);

                         
                        int index86_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred133_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index86_31);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA116_eotS =
        "\26\uffff";
    static final String DFA116_eofS =
        "\26\uffff";
    static final String DFA116_minS =
        "\1\46\14\0\1\uffff\6\0\2\uffff";
    static final String DFA116_maxS =
        "\1\u0087\14\0\1\uffff\6\0\2\uffff";
    static final String DFA116_acceptS =
        "\15\uffff\1\1\6\uffff\1\2\1\3";
    static final String DFA116_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\14\1\15\1\16\1\17\1\20\1\21\2\uffff}>";
    static final String[] DFA116_transitionS = {
            "\1\5\1\6\3\uffff\1\4\1\7\1\10\1\11\66\uffff\1\21\15\uffff\1"+
            "\15\1\1\1\2\2\uffff\4\15\2\uffff\1\3\1\14\1\17\1\12\1\13\1\22"+
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
            return "466:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );";
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
                        if ( (synpred173_Fan()) ) {s = 13;}

                        else if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA116_2 = input.LA(1);

                         
                        int index116_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA116_3 = input.LA(1);

                         
                        int index116_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA116_4 = input.LA(1);

                         
                        int index116_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA116_5 = input.LA(1);

                         
                        int index116_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA116_6 = input.LA(1);

                         
                        int index116_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA116_7 = input.LA(1);

                         
                        int index116_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA116_8 = input.LA(1);

                         
                        int index116_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA116_9 = input.LA(1);

                         
                        int index116_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA116_10 = input.LA(1);

                         
                        int index116_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA116_11 = input.LA(1);

                         
                        int index116_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA116_12 = input.LA(1);

                         
                        int index116_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA116_14 = input.LA(1);

                         
                        int index116_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA116_15 = input.LA(1);

                         
                        int index116_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA116_16 = input.LA(1);

                         
                        int index116_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA116_17 = input.LA(1);

                         
                        int index116_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA116_18 = input.LA(1);

                         
                        int index116_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA116_19 = input.LA(1);

                         
                        int index116_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index116_19);
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
    static final String DFA118_eotS =
        "\25\uffff";
    static final String DFA118_eofS =
        "\25\uffff";
    static final String DFA118_minS =
        "\1\46\1\uffff\1\0\14\uffff\3\0\3\uffff";
    static final String DFA118_maxS =
        "\1\u0087\1\uffff\1\0\14\uffff\3\0\3\uffff";
    static final String DFA118_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\17\uffff\1\3\1\4";
    static final String DFA118_specialS =
        "\2\uffff\1\0\14\uffff\1\1\1\2\1\3\3\uffff}>";
    static final String[] DFA118_transitionS = {
            "\2\3\3\uffff\4\3\66\uffff\1\20\16\uffff\1\3\1\1\10\uffff\1\2"+
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
            return "473:1: termBase : ( idExprReq | literal | typeBase | id );";
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
                        if ( (synpred182_Fan()) ) {s = 1;}

                        else if ( (synpred183_Fan()) ) {s = 3;}

                        else if ( (synpred184_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index118_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA118_15 = input.LA(1);

                         
                        int index118_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_Fan()) ) {s = 3;}

                        else if ( (synpred184_Fan()) ) {s = 19;}

                         
                        input.seek(index118_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA118_16 = input.LA(1);

                         
                        int index118_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_Fan()) ) {s = 3;}

                        else if ( (synpred184_Fan()) ) {s = 19;}

                         
                        input.seek(index118_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA118_17 = input.LA(1);

                         
                        int index118_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_Fan()) ) {s = 3;}

                        else if ( (synpred184_Fan()) ) {s = 19;}

                         
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
        "\1\145\3\0\10\uffff";
    static final String DFA119_maxS =
        "\1\u0087\3\0\10\uffff";
    static final String DFA119_acceptS =
        "\4\uffff\1\2\1\1\1\4\1\7\1\10\1\6\1\3\1\5";
    static final String DFA119_specialS =
        "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] DFA119_transitionS = {
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
            return "474:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );";
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
                        if ( (synpred185_Fan()) ) {s = 5;}

                        else if ( (synpred186_Fan()) ) {s = 4;}

                        else if ( (synpred188_Fan()) ) {s = 6;}

                        else if ( (synpred191_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index119_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA119_2 = input.LA(1);

                         
                        int index119_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred185_Fan()) ) {s = 5;}

                        else if ( (synpred186_Fan()) ) {s = 4;}

                        else if ( (synpred188_Fan()) ) {s = 6;}

                        else if ( (synpred190_Fan()) ) {s = 9;}

                        else if ( (synpred191_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index119_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA119_3 = input.LA(1);

                         
                        int index119_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred185_Fan()) ) {s = 5;}

                        else if ( (synpred186_Fan()) ) {s = 4;}

                        else if ( (synpred187_Fan()) ) {s = 10;}

                        else if ( (synpred188_Fan()) ) {s = 6;}

                        else if ( (synpred189_Fan()) ) {s = 11;}

                        else if ( (synpred191_Fan()) ) {s = 7;}

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
    static final String DFA120_eotS =
        "\20\uffff";
    static final String DFA120_eofS =
        "\1\uffff\1\10\1\uffff\1\13\14\uffff";
    static final String DFA120_minS =
        "\2\135\1\uffff\1\135\5\uffff\1\46\2\uffff\1\46\1\uffff\2\0";
    static final String DFA120_maxS =
        "\2\u0089\1\uffff\1\u0089\5\uffff\1\u0089\2\uffff\1\u0089\1\uffff"+
        "\2\0";
    static final String DFA120_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\1\1\11\1\uffff"+
        "\1\3\2\uffff";
    static final String DFA120_specialS =
        "\16\uffff\1\1\1\0}>";
    static final String[] DFA120_transitionS = {
            "\1\1\1\7\7\uffff\1\4\1\2\25\uffff\1\3\11\uffff\1\5\1\uffff\1"+
            "\6",
            "\2\10\7\uffff\2\10\10\uffff\5\10\1\11\2\10\2\uffff\2\10\1\uffff"+
            "\1\10\1\12\10\uffff\1\10\1\uffff\1\10",
            "",
            "\2\13\7\uffff\2\13\10\uffff\5\13\1\14\2\13\2\uffff\2\13\1\uffff"+
            "\1\13\1\15\10\uffff\1\13\1\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "\2\10\3\uffff\4\10\66\uffff\1\10\15\uffff\3\10\2\uffff\4\10"+
            "\2\uffff\1\16\6\10\1\uffff\2\10\1\uffff\1\10",
            "",
            "",
            "\2\13\3\uffff\4\13\66\uffff\1\13\15\uffff\3\13\2\uffff\4\13"+
            "\2\uffff\1\17\6\13\1\uffff\2\13\1\uffff\1\13",
            "",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA120_eot = DFA.unpackEncodedString(DFA120_eotS);
    static final short[] DFA120_eof = DFA.unpackEncodedString(DFA120_eofS);
    static final char[] DFA120_min = DFA.unpackEncodedStringToUnsignedChars(DFA120_minS);
    static final char[] DFA120_max = DFA.unpackEncodedStringToUnsignedChars(DFA120_maxS);
    static final short[] DFA120_accept = DFA.unpackEncodedString(DFA120_acceptS);
    static final short[] DFA120_special = DFA.unpackEncodedString(DFA120_specialS);
    static final short[][] DFA120_transition;

    static {
        int numStates = DFA120_transitionS.length;
        DFA120_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA120_transition[i] = DFA.unpackEncodedString(DFA120_transitionS[i]);
        }
    }

    class DFA120 extends DFA {

        public DFA120(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 120;
            this.eot = DFA120_eot;
            this.eof = DFA120_eof;
            this.min = DFA120_min;
            this.max = DFA120_max;
            this.accept = DFA120_accept;
            this.special = DFA120_special;
            this.transition = DFA120_transition;
        }
        public String getDescription() {
            return "481:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA120_15 = input.LA(1);

                         
                        int index120_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_Fan()) ) {s = 13;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index120_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA120_14 = input.LA(1);

                         
                        int index120_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred192_Fan()) ) {s = 10;}

                        else if ( (synpred199_Fan()) ) {s = 8;}

                         
                        input.seek(index120_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 120, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA131_eotS =
        "\27\uffff";
    static final String DFA131_eofS =
        "\27\uffff";
    static final String DFA131_minS =
        "\1\46\14\uffff\3\0\7\uffff";
    static final String DFA131_maxS =
        "\1\u0087\14\uffff\3\0\7\uffff";
    static final String DFA131_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\uffff\1"+
        "\12\3\uffff\1\14\1\20\1\13\1\15\1\16\1\17\1\21";
    static final String DFA131_specialS =
        "\15\uffff\1\0\1\1\1\2\7\uffff}>";
    static final String[] DFA131_transitionS = {
            "\1\2\1\3\3\uffff\1\1\1\4\1\5\1\6\66\uffff\1\17\16\uffff\1\12"+
            "\11\uffff\1\15\1\11\1\14\2\7\1\20\1\21\1\uffff\1\12\1\16",
            "",
            "",
            "",
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

    static final short[] DFA131_eot = DFA.unpackEncodedString(DFA131_eotS);
    static final short[] DFA131_eof = DFA.unpackEncodedString(DFA131_eofS);
    static final char[] DFA131_min = DFA.unpackEncodedStringToUnsignedChars(DFA131_minS);
    static final char[] DFA131_max = DFA.unpackEncodedStringToUnsignedChars(DFA131_maxS);
    static final short[] DFA131_accept = DFA.unpackEncodedString(DFA131_acceptS);
    static final short[] DFA131_special = DFA.unpackEncodedString(DFA131_specialS);
    static final short[][] DFA131_transition;

    static {
        int numStates = DFA131_transitionS.length;
        DFA131_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA131_transition[i] = DFA.unpackEncodedString(DFA131_transitionS[i]);
        }
    }

    class DFA131 extends DFA {

        public DFA131(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 131;
            this.eot = DFA131_eot;
            this.eof = DFA131_eof;
            this.min = DFA131_min;
            this.max = DFA131_max;
            this.accept = DFA131_accept;
            this.special = DFA131_special;
            this.transition = DFA131_transition;
        }
        public String getDescription() {
            return "524:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA131_13 = input.LA(1);

                         
                        int index131_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred221_Fan()) ) {s = 18;}

                        else if ( (synpred222_Fan()) ) {s = 16;}

                        else if ( (synpred223_Fan()) ) {s = 19;}

                        else if ( (synpred224_Fan()) ) {s = 20;}

                        else if ( (synpred225_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index131_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA131_14 = input.LA(1);

                         
                        int index131_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred222_Fan()) ) {s = 16;}

                        else if ( (synpred223_Fan()) ) {s = 19;}

                        else if ( (synpred224_Fan()) ) {s = 20;}

                        else if ( (synpred225_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index131_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA131_15 = input.LA(1);

                         
                        int index131_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred222_Fan()) ) {s = 16;}

                        else if ( (synpred223_Fan()) ) {s = 19;}

                        else if ( (synpred224_Fan()) ) {s = 20;}

                        else if ( (synpred225_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index131_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 131, _s, input);
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
    public static final BitSet FOLLOW_podSpec_in_usingPod552 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_eos_in_usingPod554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingType583 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_podSpec_in_usingType585 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingType587 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_usingType589 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_eos_in_usingType591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingAs623 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_podSpec_in_usingAs625 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingAs627 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_podId_in_usingAs629 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KW_AS_in_usingAs631 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_usingAs635 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_eos_in_usingAs637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_podId675 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_167_in_podId678 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_podId680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing693 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_eos_in_incUsing695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ffi_in_incUsing703 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_eos_in_incUsing705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing711 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_podSpec_in_incUsing713 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_incUsing715 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_eos_in_incUsing717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing723 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_podSpec_in_incUsing725 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_incUsing727 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
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
    public static final BitSet FOLLOW_AS_INIT_VAL_in_symbolDef840 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_symbolDef842 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
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
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs1329 = new BitSet(new long[]{0x0000000000000000L,0x0000010400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_enumValDefs1332 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs1335 = new BitSet(new long[]{0x0000000000000000L,0x0000010400000000L});
    public static final BitSet FOLLOW_eos_in_enumValDefs1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumValDef1347 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_enumValDef1349 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_enumValDef1352 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_args_in_enumValDef1354 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
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
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1549 = new BitSet(new long[]{0x0000000000000000L,0x400000A000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_funcTypeContent_in_funcType1551 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formals_in_funcTypeContent1575 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_OP_SAFEDYN_CALL_in_funcTypeContent1577 = new BitSet(new long[]{0x0000000000000002L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_funcTypeContent1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formals_in_funcTypeContent1586 = new BitSet(new long[]{0x0000000000000002L,0x400000A000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_assignedType_in_funcTypeContent1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignedType_in_funcTypeContent1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_assignedType1613 = new BitSet(new long[]{0x0000000000000002L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_assignedType1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_in_formals1626 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_formals1629 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formal_in_formals1631 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_formal_content_in_formal1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_formal_content1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_formal_content1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalInferred_in_formal_content1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalFull1685 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_formalFull1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalTypeOnly1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_formalInferred1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticBlock_in_slotDef1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_slotDef1731 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_facet_in_slotDef1733 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_ctorDef_in_slotDef1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDef_in_slotDef1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDef_in_slotDef1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_fieldDef1829 = new BitSet(new long[]{0x0000000F87F80000L,0x4000002000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_facet_in_fieldDef1831 = new BitSet(new long[]{0x0000000F87F80000L,0x4000002000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_fieldFlags_in_fieldDef1836 = new BitSet(new long[]{0x0000000002000000L,0x4000002000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_typeId_in_fieldDef1838 = new BitSet(new long[]{0x0000000000000000L,0x0000010140000000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_fieldDef1841 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_fieldDef1843 = new BitSet(new long[]{0x0000000000000000L,0x0000010040000000L});
    public static final BitSet FOLLOW_bracketL_in_fieldDef1858 = new BitSet(new long[]{0x0000000F00000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_protection_in_fieldDef1861 = new BitSet(new long[]{0x0000000F00000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_getter_in_fieldDef1865 = new BitSet(new long[]{0x0000003F87F81FF0L,0x40000320C0000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_setter_in_fieldDef1869 = new BitSet(new long[]{0x0000003F87F81FF0L,0x40000320C0000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_SP_SEMI_in_fieldDef1872 = new BitSet(new long[]{0x0000003F87F81FF0L,0x40000220C0000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_block_in_fieldDef1875 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_bracketR_in_fieldDef1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_fieldDef1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeAndId_in_typeId1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldId_in_typeId1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_fieldId1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeAndId1948 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_typeAndId1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_fieldFlags1959 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_RD_ONLY_in_fieldFlags1963 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_CONST_in_fieldFlags1967 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_STATIC_in_fieldFlags1971 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_fieldFlags1975 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VOLATILE_in_fieldFlags1979 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_fieldFlags1983 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_fieldFlags1987 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_FINAL_in_fieldFlags1991 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_protection_in_fieldFlags1995 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_docs_in_methodDef2015 = new BitSet(new long[]{0x0000002F87600000L,0x4000002000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_facet_in_methodDef2017 = new BitSet(new long[]{0x0000002F87600000L,0x4000002000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_methodFlags_in_methodDef2022 = new BitSet(new long[]{0x0000002F87600000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_methodDef2027 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_methodDef2033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_methodDef2035 = new BitSet(new long[]{0x0000000000000000L,0x4000022000000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_params_in_methodDef2037 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_methodDef2039 = new BitSet(new long[]{0x0000000000000000L,0x0000010040000000L});
    public static final BitSet FOLLOW_methodBody_in_methodDef2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_methodFlags2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_methodFlags2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_methodFlags2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_methodFlags2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_methodFlags2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ONCE_in_methodFlags2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_methodFlags2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_methodFlags2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params2124 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_params2127 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_param_in_params2129 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_type_in_param2143 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_param2145 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_param2148 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_param2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_methodBody2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_methodBody2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_ctorDef2209 = new BitSet(new long[]{0x0000001F00000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_facet_in_ctorDef2211 = new BitSet(new long[]{0x0000001F00000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ctorFlags_in_ctorDef2216 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_ctorDef2219 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_ctorDef2223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_ctorDef2225 = new BitSet(new long[]{0x0000000000000000L,0x4000022000000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_params_in_ctorDef2227 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_ctorDef2229 = new BitSet(new long[]{0x0000000000000000L,0x0000010240000000L});
    public static final BitSet FOLLOW_ctorChain_in_ctorDef2238 = new BitSet(new long[]{0x0000000000000000L,0x0000010040000000L});
    public static final BitSet FOLLOW_methodBody_in_ctorDef2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_ctorFlags2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_ctorChain2296 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ctorChainThis_in_ctorChain2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorChainSuper_in_ctorChain2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_ctorChainThis2312 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainThis2314 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_ctorChainThis2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_ctorChainThis2318 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_args_in_ctorChainThis2320 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_ctorChainThis2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_ctorChainSuper2330 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DOT_in_ctorChainSuper2333 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_ctorChainSuper2335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_ctorChainSuper2339 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_args_in_ctorChainSuper2341 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_ctorChainSuper2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_staticBlock2352 = new BitSet(new long[]{0x0000000002001FF0L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_block_in_staticBlock2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_block2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_multiStmt2391 = new BitSet(new long[]{0x0000003F87F81FF0L,0x40000220C0000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_stmt_in_multiStmt2393 = new BitSet(new long[]{0x0000003F87F81FF0L,0x40000220C0000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_bracketR_in_multiStmt2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_if_in_stmt2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_for_in_stmt2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_while_in_stmt2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_break_in_stmt2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_continue_in_stmt2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_return_in_stmt2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switch_in_stmt2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_throw_in_stmt2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_try_in_stmt2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_stmt2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localDef_in_stmt2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmtList2490 = new BitSet(new long[]{0x0000000002001FF2L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_KW_BREAK_in_g_break2512 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_eos_in_g_break2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONTINUE_in_g_continue2521 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_eos_in_g_continue2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_g_for2532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_g_for2534 = new BitSet(new long[]{0x0000000002000000L,0x4000032000000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_forInit_in_g_for2536 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for2539 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_expr_in_g_for2541 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for2544 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_expr_in_g_for2546 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_g_for2549 = new BitSet(new long[]{0x0000000002001FF0L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_block_in_g_for2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_g_if2593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_g_if2595 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_g_if2597 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_g_if2599 = new BitSet(new long[]{0x0000000002001FF0L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_block_in_g_if2601 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_g_if2608 = new BitSet(new long[]{0x0000000002001FF0L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_block_in_g_if2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_g_return2619 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_eos_in_g_return2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_g_return2626 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_eos_in_g_return2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SWITCH_in_g_switch2636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_g_switch2638 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_g_switch2640 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_g_switch2642 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_bracketL_in_g_switch2644 = new BitSet(new long[]{0x0000003F87F86000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_g_case_in_g_switch2647 = new BitSet(new long[]{0x0000003F87F86000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_g_default_in_g_switch2652 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_bracketR_in_g_switch2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_g_throw2664 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_g_throw2666 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_eos_in_g_throw2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHILE_in_g_while2676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_g_while2678 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_g_while2680 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_g_while2682 = new BitSet(new long[]{0x0000000002001FF0L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_block_in_g_while2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_g_try2693 = new BitSet(new long[]{0x0000000002019FF0L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_g_try_content_in_g_try2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_long_in_g_try_content2721 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_stmtList_in_g_try_content2725 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_catch_in_g_try_content2733 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_finally_in_g_try_content2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_try_long2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprStmt2758 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_eos_in_exprStmt2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_localDef2768 = new BitSet(new long[]{0x0000000000000000L,0x0000010100000000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_localDef2771 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_localDef2773 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_eos_in_localDef2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_forInit2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forInit2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_forInitDef2815 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_forInitDef2818 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_forInitDef2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_g_catch2852 = new BitSet(new long[]{0x0000000002001FF0L,0x4000022040000000L,0x00000000000002B0L});
    public static final BitSet FOLLOW_g_catch_ct_in_g_catch2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchDef_in_g_catch_ct2874 = new BitSet(new long[]{0x0000000002001FF0L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_catch_long_in_g_catch_ct2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtList_in_g_catch_ct2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_catch_long2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_catchDef2902 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_catchDef2904 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_catchDef2906 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_catchDef2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_g_finally2934 = new BitSet(new long[]{0x0000000002001FF0L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_finally_long_in_g_finally2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtList_in_g_finally2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_finally_long2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_g_case2961 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_g_case2963 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_case2965 = new BitSet(new long[]{0x0000000002001FF2L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_stmt_in_g_case2967 = new BitSet(new long[]{0x0000000002001FF2L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_KW_DEFAULT_in_g_default2975 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_default2977 = new BitSet(new long[]{0x0000000002001FF2L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_stmt_in_g_default2979 = new BitSet(new long[]{0x0000000002001FF2L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_assignExpr_in_expr3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_assignExpr3007 = new BitSet(new long[]{0x0000000000000002L,0x00000C0000000000L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr3010 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_assignExpr_in_assignExpr3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_ifExpr3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elvisExpr_in_ifExpr3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condOrExpr_in_ifExprBody3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExprThrow_in_ifExprBody3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_ifExprThrow3054 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_ifExprThrow3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ELVIS_in_elvisExpr3066 = new BitSet(new long[]{0x0000000000000400L,0x0000020000000000L});
    public static final BitSet FOLLOW_ifExprBody_in_elvisExpr3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryExpr3077 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ternaryTail_in_ternaryExpr3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_ternaryTail3090 = new BitSet(new long[]{0x0000000000000400L,0x0000020000000000L});
    public static final BitSet FOLLOW_ifExprBody_in_ternaryTail3092 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SP_COLON_in_ternaryTail3094 = new BitSet(new long[]{0x0000000000000400L,0x0000020000000000L});
    public static final BitSet FOLLOW_ifExprBody_in_ternaryTail3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr3116 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_OP_OR_in_condOrExpr3120 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr3123 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr3133 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_OP_AND_in_condAndExpr3136 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr3139 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr3149 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_CP_EQUALITY_in_equalityExpr3152 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr3154 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_elvisExpr_in_relationalExpr3167 = new BitSet(new long[]{0x0000060000040000L,0x0000800000000000L});
    public static final BitSet FOLLOW_typeCheck_in_relationalExpr3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_relationalExpr3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCheck3185 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeRoot_in_typeCheck3197 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_typeCheck3200 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_typeCheck3205 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_CP_COMPARATORS_in_compare3218 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_elvisExpr_in_compare3220 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_addExpr_in_rangeExpr3232 = new BitSet(new long[]{0x0000000000000002L,0x0007000000000000L});
    public static final BitSet FOLLOW_set_in_rangeExpr3235 = new BitSet(new long[]{0x000078C000000000L,0xCF38002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_addExpr_in_rangeExpr3249 = new BitSet(new long[]{0x0000000000000002L,0x0007000000000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3264 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L});
    public static final BitSet FOLLOW_set_in_addExpr3267 = new BitSet(new long[]{0x000078C000000000L,0xCF38002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_multExpr_in_addExpr3275 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L});
    public static final BitSet FOLLOW_set_in_addAppend3285 = new BitSet(new long[]{0x000078C000000000L,0xCF38002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_parenExpr_in_addAppend3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr3301 = new BitSet(new long[]{0x0000000000000002L,0x00E0000000000000L});
    public static final BitSet FOLLOW_set_in_multExpr3304 = new BitSet(new long[]{0x000078C000000000L,0xCF38002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_parenExpr_in_multExpr3316 = new BitSet(new long[]{0x0000000000000002L,0x00E0000000000000L});
    public static final BitSet FOLLOW_castExpr_in_parenExpr3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_parenExpr3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_parenExpr3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_castExpr3346 = new BitSet(new long[]{0x0000000000000000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_castExpr3348 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_castExpr3350 = new BitSet(new long[]{0x000078C000000000L,0xCF38002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_parenExpr_in_castExpr3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_groupedExpr3380 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_groupedExpr3382 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_groupedExpr3384 = new BitSet(new long[]{0x0000000000000002L,0x200000C060000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_termChain_in_groupedExpr3386 = new BitSet(new long[]{0x0000000000000002L,0x200000C060000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_prefixExpr_in_unaryExpr3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_unaryExpr3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_unaryExpr3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr3412 = new BitSet(new long[]{0x000078C000000000L,0xCF38002000000000L,0x00000000000002DFL});
    public static final BitSet FOLLOW_parenExpr_in_prefixExpr3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_postfixExpr3447 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_set_in_postfixExpr3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termBase_in_termExpr3464 = new BitSet(new long[]{0x0000000000000002L,0x200000C060000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_termChain_in_termExpr3466 = new BitSet(new long[]{0x0000000000000002L,0x200000C060000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_idExprReq_in_termBase3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_termBase3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_termBase3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_termBase3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_typeBase3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_typeBase3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_typeBase3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_typeBase3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_typeBase3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_typeBase3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_typeBase3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorBlock_in_typeBase3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_ctorBlock3570 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_itBlock_in_ctorBlock3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_staticCall3593 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_staticCall3595 = new BitSet(new long[]{0x0000000000000000L,0x4020000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_idExpr_in_staticCall3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_termChain3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynCall_in_termChain3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_termChain3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDynCall_in_termChain3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpr_in_termChain3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callOp_in_termChain3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itBlock_in_termChain3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDotCall_in_termChain3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incSafeDotCall_in_termChain3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_dsl3674 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_DSL_in_dsl3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_incDotCall3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_incSafeDotCall3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_itBlock3721 = new BitSet(new long[]{0x0000003F87F81FF0L,0x40000220C0000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_itBlockContent_in_itBlock3723 = new BitSet(new long[]{0x0000003F87F80000L,0x4000002080000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_bracketR_in_itBlock3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_itBlockContent3751 = new BitSet(new long[]{0x0000000002001FF2L,0x4000032440000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_SP_COMMA_in_itBlockContent3753 = new BitSet(new long[]{0x0000000002001FF2L,0x4000032040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_SP_SEMI_in_itBlockContent3756 = new BitSet(new long[]{0x0000000002001FF2L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_DOT_in_dotCall3767 = new BitSet(new long[]{0x0000000000000000L,0x4020000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_idExpr_in_dotCall3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_dynCall3789 = new BitSet(new long[]{0x0000000000000000L,0x4020000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_idExpr_in_dynCall3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_safeDotCall3799 = new BitSet(new long[]{0x0000000000000000L,0x4020000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_idExpr_in_safeDotCall3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall3820 = new BitSet(new long[]{0x0000000000000000L,0x4020000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_idExpr_in_safeDynCall3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_indexExpr3837 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_indexExpr3839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_sq_bracketR_in_indexExpr3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callOp3869 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_args_in_callOp3871 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_callOp3875 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_closure_in_callOp3877 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_funcType_in_closure3900 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_multiStmt_in_closure3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_idExpr3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idExpr3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_idExprReq3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_idExprReq3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MULTI_in_field3951 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_ID_in_field3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call3965 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_callParams_in_call3971 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_closure_in_call3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_call3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_call3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callParams4023 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_args_in_callParams4025 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_callParams4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args4037 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_args4040 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_args4043 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_KW_NULL_in_literal4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_literal4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_literal4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IT_in_literal4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_literal4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_literal4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strs_in_literal4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_literal4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_literal4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_literal4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_literal4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_literal4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_literal4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_literal4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_literal4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbLiteral_in_literal4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_literal4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTSTR_in_strs4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_strs4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeLiteral4175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_OP_POUND_in_typeLiteral4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_slotLiteral4208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_OP_POUND_in_slotLiteral4211 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_slotLiteral4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_symbLiteral4243 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_symbLiteral4248 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SP_COLON_in_symbLiteral4250 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SP_COLON_in_symbLiteral4252 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_symbLiteral4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_namedSuper4284 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DOT_in_namedSuper4286 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_SUPER_in_namedSuper4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_list4316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_sq_bracketL_in_list4322 = new BitSet(new long[]{0x0000000000000000L,0x0000020400000000L});
    public static final BitSet FOLLOW_listItems_in_list4324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_sq_bracketR_in_list4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_listItems4355 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems4358 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_listItems4360 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_map4382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_sq_bracketL_in_map4388 = new BitSet(new long[]{0x0000000000000000L,0x0000020200000000L});
    public static final BitSet FOLLOW_mapItems_in_map4390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_sq_bracketR_in_map4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapPair_in_mapItems4421 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems4424 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_mapPair_in_mapItems4426 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_mapItems4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_mapPair4444 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapPair4446 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_mapPair4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_simple4456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_simple4458 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_simple4460 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_parR_in_simple4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_docs4474 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OP_MINUS_in_number4496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_number4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_facet4507 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_facet4509 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_AS_EQUAL_in_facet4512 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_expr_in_facet4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_eos4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getter4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setter4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pod4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_bracketL4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_R_in_bracketR4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_sq_bracketL4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_sq_bracketR4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_parL4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_R_in_parR4720 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_type_in_synpred60_Fan1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formals_in_synpred61_Fan1575 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_OP_SAFEDYN_CALL_in_synpred61_Fan1577 = new BitSet(new long[]{0x0000000000000002L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_synpred61_Fan1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred62_Fan1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formals_in_synpred63_Fan1586 = new BitSet(new long[]{0x0000000000000002L,0x400000A000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_assignedType_in_synpred63_Fan1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred64_Fan1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred65_Fan1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_synpred67_Fan1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_synpred68_Fan1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_synpred69_Fan1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_bracketL_in_synpred69_Fan1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred70_Fan1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorFlags_in_synpred72_Fan1750 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_synpred72_Fan1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodFlags_in_synpred75_Fan1767 = new BitSet(new long[]{0x0000002F8F600000L,0x4000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_type_in_synpred75_Fan1771 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KW_VOID_in_synpred75_Fan1775 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_synpred75_Fan1778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_parL_in_synpred75_Fan1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getter_in_synpred79_Fan1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred81_Fan1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred84_Fan1922 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_id_in_synpred84_Fan1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_synpred107_Fan2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred116_Fan2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred128_Fan2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_synpred132_Fan2608 = new BitSet(new long[]{0x0000000002001FF0L,0x4000022040000000L,0x00000000000000B0L});
    public static final BitSet FOLLOW_block_in_synpred132_Fan2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_synpred133_Fan2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred136_Fan2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_synpred137_Fan2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_synpred138_Fan2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred143_Fan2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred144_Fan2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignOp_in_synpred147_Fan3010 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_assignExpr_in_synpred147_Fan3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_synpred148_Fan3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryTail_in_synpred150_Fan3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OR_in_synpred152_Fan3120 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_condAndExpr_in_synpred152_Fan3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_AND_in_synpred153_Fan3136 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_equalityExpr_in_synpred153_Fan3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CP_EQUALITY_in_synpred154_Fan3152 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_relationalExpr_in_synpred154_Fan3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeCheck_in_synpred155_Fan3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CP_COMPARATORS_in_synpred160_Fan3218 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_elvisExpr_in_synpred160_Fan3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred173_Fan3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_synpred174_Fan3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred182_Fan3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred183_Fan3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_synpred184_Fan3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred185_Fan3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred186_Fan3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred187_Fan3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_synpred188_Fan3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_synpred189_Fan3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred190_Fan3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_synpred191_Fan3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_synpred192_Fan3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_synpred194_Fan3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDotCall_in_synpred199_Fan3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred205_Fan3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred207_Fan3971 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_closure_in_synpred207_Fan3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred208_Fan3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred221_Fan4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred222_Fan4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred223_Fan4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_synpred224_Fan4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_synpred225_Fan4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_synpred239_Fan4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_synpred242_Fan4536 = new BitSet(new long[]{0x0000000000000002L});

}