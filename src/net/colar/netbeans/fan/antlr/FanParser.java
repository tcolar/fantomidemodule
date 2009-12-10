// $ANTLR 3.1.2 src/net/colar/netbeans/fan/antlr/Fan.g 2009-12-09 19:05:06
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KW_BREAK", "KW_CONTINUE", "KW_FOR", "KW_IF", "KW_RETURN", "KW_SWITCH", "KW_THROW", "KW_WHILE", "KW_TRY", "KW_CASE", "KW_DEFAULT", "KW_CATCH", "KW_FINALLY", "KW_USING", "KW_AS", "KW_RD_ONLY", "KW_CONST", "KW_STATIC", "KW_NATIVE", "KW_VOLATILE", "KW_OVERRIDE", "KW_VIRTUAL", "KW_FINAL", "KW_VOID", "KW_CLASS", "KW_ENUM", "KW_MIXIN", "KW_ABSTRACT", "KW_PRIVATE", "KW_PROTECTED", "KW_PUBLIC", "KW_INTERNAL", "KW_NEW", "KW_ONCE", "KW_THIS", "KW_SUPER", "KW_ELSE", "KW_IS", "KW_ISNOT", "KW_NULL", "KW_IT", "KW_TRUE", "KW_FALSE", "INC_STR", "INC_URI", "INC_COMMENT", "INC_DSL", "AST_CLASS", "AST_ENUM", "AST_MIXIN", "AST_METHOD", "AST_CONSTRUCTOR", "AST_FIELD", "AST_CONSTRUCTOR_CHAIN", "AST_CODE_BLOCK", "AST_DOCS", "AST_STR", "AST_CALL", "AST_TERM_EXPR", "AST_DOT_CALL", "AST_SAFE_DOT_CALL", "AST_STATIC_CALL", "AST_USING_POD", "AST_MAP", "AST_LOCAL_DEF", "AST_INC_USING", "AST_INC_DOTCALL", "AST_INC_SAFEDOTCALL", "AST_ID", "AST_MODIFIER", "AST_INHERITANCE", "AST_PARAM", "AST_TYPE", "AST_CHILD", "SP_COLCOL", "DOT", "BRACKET_L", "BRACKET_R", "AS_INIT_VAL", "SP_COLON", "SP_COMMA", "SP_QMARK", "LIST_TYPE", "SP_PIPE", "OP_ARROW", "SP_SEMI", "AS_EQUAL", "AS_ASSIGN_OP", "OP_OR", "OP_AND", "CP_EQUALITY", "CP_COMPARATORS", "OP_ELVIS", "OP_RANG_EXCL_OLD", "OP_RANGE_EXCL", "OP_RANGE", "OP_BITOR", "OP_CURRY", "OP_LSHIFT", "OP_RSHIFT", "OP_PLUS", "OP_MINUS", "OP_MULTI", "OP_DIV", "OP_MOD", "OP_BANG", "OP_2PLUS", "OP_2MINUS", "OP_TILDA", "DSL", "OP_SAFE_CALL", "OP_SAFEDYN_CALL", "ID", "URI", "CHAR", "QUOTSTR", "STR", "OP_POUND", "AT", "DOC", "NUMBER", "SQ_BRACKET_L", "SQ_BRACKET_R", "PAR_L", "PAR_R", "LB", "WS", "LINE_COMMENT", "EXEC_COMMENT", "COMPL_ML_COMMENT", "MULTI_COMMENT", "COMPL_DSL", "DIGIT", "HEXLETTER", "COMPL_QSTR", "COMPL_STR", "COMPL_URI", "KEYWORD", "UNDERSCORE", "HEX_HEADER", "HEXNB", "DECIMAL", "FRACTIONAL", "HEXHEADER", "FRACTION", "EXPONENT", "NBTYPE", "LETTER", "INC_UNKNOWN_ITEM", "'$'"
    };
    public static final int EXPONENT=149;
    public static final int DSL=113;
    public static final int OP_AND=93;
    public static final int KW_NATIVE=22;
    public static final int LETTER=151;
    public static final int HEXNB=144;
    public static final int CHAR=118;
    public static final int OP_2PLUS=110;
    public static final int KW_DEFAULT=14;
    public static final int KW_ONCE=37;
    public static final int SP_SEMI=89;
    public static final int INC_UNKNOWN_ITEM=152;
    public static final int AST_MIXIN=53;
    public static final int EOF=-1;
    public static final int KW_PUBLIC=34;
    public static final int KW_ISNOT=42;
    public static final int OP_MOD=108;
    public static final int PAR_R=128;
    public static final int OP_MINUS=105;
    public static final int KW_NEW=36;
    public static final int KW_BREAK=4;
    public static final int KW_SWITCH=9;
    public static final int AST_INC_DOTCALL=70;
    public static final int OP_RANG_EXCL_OLD=97;
    public static final int AST_CLASS=51;
    public static final int OP_BITOR=100;
    public static final int QUOTSTR=119;
    public static final int AST_TYPE=76;
    public static final int OP_BANG=109;
    public static final int AST_DOT_CALL=63;
    public static final int PAR_L=127;
    public static final int T__153=153;
    public static final int OP_MULTI=106;
    public static final int AST_USING_POD=66;
    public static final int KEYWORD=141;
    public static final int KW_PROTECTED=33;
    public static final int AST_STR=60;
    public static final int LINE_COMMENT=131;
    public static final int CP_COMPARATORS=95;
    public static final int NUMBER=124;
    public static final int KW_CATCH=15;
    public static final int AS_EQUAL=90;
    public static final int UNDERSCORE=142;
    public static final int OP_DIV=107;
    public static final int SP_COMMA=84;
    public static final int URI=117;
    public static final int KW_FINALLY=16;
    public static final int WS=130;
    public static final int KW_THROW=10;
    public static final int OP_POUND=121;
    public static final int KW_STATIC=21;
    public static final int INC_COMMENT=49;
    public static final int AST_METHOD=54;
    public static final int AST_ENUM=52;
    public static final int AST_CALL=61;
    public static final int SP_QMARK=85;
    public static final int AST_ID=72;
    public static final int HEXHEADER=147;
    public static final int AS_INIT_VAL=82;
    public static final int COMPL_DSL=135;
    public static final int NBTYPE=150;
    public static final int KW_SUPER=39;
    public static final int OP_2MINUS=111;
    public static final int OP_RSHIFT=103;
    public static final int KW_ELSE=40;
    public static final int OP_OR=92;
    public static final int AST_MODIFIER=73;
    public static final int DOC=123;
    public static final int KW_OVERRIDE=24;
    public static final int AST_FIELD=56;
    public static final int AST_CODE_BLOCK=58;
    public static final int KW_ABSTRACT=31;
    public static final int MULTI_COMMENT=134;
    public static final int KW_CONST=20;
    public static final int AST_DOCS=59;
    public static final int COMPL_ML_COMMENT=133;
    public static final int OP_ELVIS=96;
    public static final int BRACKET_R=81;
    public static final int KW_TRUE=45;
    public static final int ID=116;
    public static final int SP_COLON=83;
    public static final int AST_CONSTRUCTOR_CHAIN=57;
    public static final int AST_TERM_EXPR=62;
    public static final int BRACKET_L=80;
    public static final int AT=122;
    public static final int STR=120;
    public static final int OP_RANGE_EXCL=98;
    public static final int SP_PIPE=87;
    public static final int COMPL_QSTR=138;
    public static final int OP_TILDA=112;
    public static final int KW_VIRTUAL=25;
    public static final int CP_EQUALITY=94;
    public static final int AST_SAFE_DOT_CALL=64;
    public static final int KW_FOR=6;
    public static final int KW_WHILE=11;
    public static final int COMPL_URI=140;
    public static final int AST_LOCAL_DEF=68;
    public static final int OP_RANGE=99;
    public static final int KW_RETURN=8;
    public static final int INC_DSL=50;
    public static final int SQ_BRACKET_R=126;
    public static final int KW_IS=41;
    public static final int DIGIT=136;
    public static final int KW_TRY=12;
    public static final int KW_IT=44;
    public static final int DOT=79;
    public static final int KW_THIS=38;
    public static final int KW_IF=7;
    public static final int OP_CURRY=101;
    public static final int SQ_BRACKET_L=125;
    public static final int AST_INC_SAFEDOTCALL=71;
    public static final int OP_PLUS=104;
    public static final int KW_FALSE=46;
    public static final int KW_INTERNAL=35;
    public static final int KW_FINAL=26;
    public static final int HEXLETTER=137;
    public static final int KW_CONTINUE=5;
    public static final int KW_PRIVATE=32;
    public static final int KW_ENUM=29;
    public static final int HEX_HEADER=143;
    public static final int OP_SAFEDYN_CALL=115;
    public static final int KW_VOLATILE=23;
    public static final int KW_CASE=13;
    public static final int LIST_TYPE=86;
    public static final int FRACTIONAL=146;
    public static final int OP_LSHIFT=102;
    public static final int EXEC_COMMENT=132;
    public static final int KW_MIXIN=30;
    public static final int AST_CHILD=77;
    public static final int OP_ARROW=88;
    public static final int KW_VOID=27;
    public static final int DECIMAL=145;
    public static final int INC_URI=48;
    public static final int KW_CLASS=28;
    public static final int AS_ASSIGN_OP=91;
    public static final int AST_MAP=67;
    public static final int AST_CONSTRUCTOR=55;
    public static final int KW_RD_ONLY=19;
    public static final int INC_STR=47;
    public static final int AST_STATIC_CALL=65;
    public static final int OP_SAFE_CALL=114;
    public static final int KW_AS=18;
    public static final int COMPL_STR=139;
    public static final int LB=129;
    public static final int KW_USING=17;
    public static final int KW_NULL=43;
    public static final int AST_PARAM=75;
    public static final int FRACTION=148;
    public static final int AST_INHERITANCE=74;
    public static final int AST_INC_USING=69;
    public static final int SP_COLCOL=78;

    // delegates
    // delegators


        public FanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[401+1];
             
             
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:247:1: prog : ( using )* ( podDef | ( typeDef )* ) docs EOF ;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:7: ( ( using )* ( podDef | ( typeDef )* ) docs EOF )
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:11: ( using )* ( podDef | ( typeDef )* ) docs EOF
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:247:11: ( using )*
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
            	    pushFollow(FOLLOW_using_in_prog447);
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

            // src/net/colar/netbeans/fan/antlr/Fan.g:247:18: ( podDef | ( typeDef )* )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:247:19: podDef
                    {
                    pushFollow(FOLLOW_podDef_in_prog451);
                    podDef2=podDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, podDef2.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:247:28: ( typeDef )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:247:28: ( typeDef )*
                    loop2:
                    do {
                        int alt2=2;
                        alt2 = dfa2.predict(input);
                        switch (alt2) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: typeDef
                    	    {
                    	    pushFollow(FOLLOW_typeDef_in_prog455);
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

            pushFollow(FOLLOW_docs_in_prog459);
            docs4=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs4.getTree());
            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_prog461); if (state.failed) return retval;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:248:1: using : ( usingPod | usingType | usingAs | incUsing ) ;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:249:3: ( ( usingPod | usingType | usingAs | incUsing ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:249:5: ( usingPod | usingType | usingAs | incUsing )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:249:5: ( usingPod | usingType | usingAs | incUsing )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:6: usingPod
                    {
                    pushFollow(FOLLOW_usingPod_in_using481);
                    usingPod6=usingPod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingPod6.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:17: usingType
                    {
                    pushFollow(FOLLOW_usingType_in_using485);
                    usingType7=usingType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingType7.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:29: usingAs
                    {
                    pushFollow(FOLLOW_usingAs_in_using489);
                    usingAs8=usingAs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingAs8.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:249:39: incUsing
                    {
                    pushFollow(FOLLOW_incUsing_in_using493);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:250:1: usingPod : KW_USING podSpec eos -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ) ;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:251:3: ( KW_USING podSpec eos -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:251:5: KW_USING podSpec eos
            {
            KW_USING10=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingPod503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING10);

            pushFollow(FOLLOW_podSpec_in_usingPod505);
            podSpec11=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podSpec.add(podSpec11.getTree());
            pushFollow(FOLLOW_eos_in_usingPod507);
            eos12=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos12.getTree());


            // AST REWRITE
            // elements: podSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 252:4: -> ^( AST_USING_POD ^( AST_CHILD podSpec ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:252:7: ^( AST_USING_POD ^( AST_CHILD podSpec ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_USING_POD, "AST_USING_POD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:252:23: ^( AST_CHILD podSpec )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_podSpec.nextTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:253:1: usingType : KW_USING podSpec SP_COLCOL id eos -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD id ) ) ;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:254:3: ( KW_USING podSpec SP_COLCOL id eos -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD id ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:254:5: KW_USING podSpec SP_COLCOL id eos
            {
            KW_USING13=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingType531); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING13);

            pushFollow(FOLLOW_podSpec_in_usingType533);
            podSpec14=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podSpec.add(podSpec14.getTree());
            SP_COLCOL15=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingType535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_COLCOL.add(SP_COLCOL15);

            pushFollow(FOLLOW_id_in_usingType537);
            id16=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id16.getTree());
            pushFollow(FOLLOW_eos_in_usingType539);
            eos17=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos17.getTree());


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
            // 255:4: -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD id ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:255:7: ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD id ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_USING_POD, "AST_USING_POD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:255:23: ^( AST_CHILD podSpec )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_podSpec.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:255:44: ^( AST_CHILD id )
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:257:1: usingAs : KW_USING podSpec SP_COLCOL podid= ( id ( '$' id )* ) KW_AS as= id eos -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD ( $podid)? ) ^( AST_CHILD ( $as)? ) ) ;
    public final FanParser.usingAs_return usingAs() throws RecognitionException {
        FanParser.usingAs_return retval = new FanParser.usingAs_return();
        retval.start = input.LT(1);
        int usingAs_StartIndex = input.index();
        Object root_0 = null;

        Token podid=null;
        Token KW_USING18=null;
        Token SP_COLCOL20=null;
        Token char_literal22=null;
        Token KW_AS24=null;
        FanParser.id_return as = null;

        FanParser.podSpec_return podSpec19 = null;

        FanParser.id_return id21 = null;

        FanParser.id_return id23 = null;

        FanParser.eos_return eos25 = null;


        Object podid_tree=null;
        Object KW_USING18_tree=null;
        Object SP_COLCOL20_tree=null;
        Object char_literal22_tree=null;
        Object KW_AS24_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_SP_COLCOL=new RewriteRuleTokenStream(adaptor,"token SP_COLCOL");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_podSpec=new RewriteRuleSubtreeStream(adaptor,"rule podSpec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:257:10: ( KW_USING podSpec SP_COLCOL podid= ( id ( '$' id )* ) KW_AS as= id eos -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD ( $podid)? ) ^( AST_CHILD ( $as)? ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:257:12: KW_USING podSpec SP_COLCOL podid= ( id ( '$' id )* ) KW_AS as= id eos
            {
            KW_USING18=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingAs569); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING18);

            pushFollow(FOLLOW_podSpec_in_usingAs571);
            podSpec19=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podSpec.add(podSpec19.getTree());
            SP_COLCOL20=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingAs573); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_COLCOL.add(SP_COLCOL20);

            // src/net/colar/netbeans/fan/antlr/Fan.g:257:45: ( id ( '$' id )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:257:46: id ( '$' id )*
            {
            pushFollow(FOLLOW_id_in_usingAs578);
            id21=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id21.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:257:49: ( '$' id )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==153) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:257:50: '$' id
            	    {
            	    char_literal22=(Token)match(input,153,FOLLOW_153_in_usingAs581); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_153.add(char_literal22);

            	    pushFollow(FOLLOW_id_in_usingAs583);
            	    id23=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id.add(id23.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            KW_AS24=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_usingAs588); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS24);

            pushFollow(FOLLOW_id_in_usingAs592);
            as=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(as.getTree());
            pushFollow(FOLLOW_eos_in_usingAs594);
            eos25=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos25.getTree());


            // AST REWRITE
            // elements: podSpec, podid, as
            // token labels: podid
            // rule labels: retval, as
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_podid=new RewriteRuleTokenStream(adaptor,"token podid",podid);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_as=new RewriteRuleSubtreeStream(adaptor,"rule as",as!=null?as.tree:null);

            root_0 = (Object)adaptor.nil();
            // 258:4: -> ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD ( $podid)? ) ^( AST_CHILD ( $as)? ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:258:7: ^( AST_USING_POD ^( AST_CHILD podSpec ) ^( AST_CHILD ( $podid)? ) ^( AST_CHILD ( $as)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_USING_POD, "AST_USING_POD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:258:23: ^( AST_CHILD podSpec )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_podSpec.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:258:44: ^( AST_CHILD ( $podid)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                // src/net/colar/netbeans/fan/antlr/Fan.g:258:56: ( $podid)?
                if ( stream_podid.hasNext() ) {
                    adaptor.addChild(root_2, stream_podid.nextNode());

                }
                stream_podid.reset();

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:258:65: ^( AST_CHILD ( $as)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                // src/net/colar/netbeans/fan/antlr/Fan.g:258:77: ( $as)?
                if ( stream_as.hasNext() ) {
                    adaptor.addChild(root_2, stream_as.nextTree());

                }
                stream_as.reset();

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

    public static class incUsing_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incUsing"
    // src/net/colar/netbeans/fan/antlr/Fan.g:260:1: incUsing : ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) ) -> ^( AST_INC_USING ^( AST_CHILD KW_USING ) ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? ) ) ;
    public final FanParser.incUsing_return incUsing() throws RecognitionException {
        FanParser.incUsing_return retval = new FanParser.incUsing_return();
        retval.start = input.LT(1);
        int incUsing_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING26=null;
        Token KW_USING28=null;
        Token KW_USING31=null;
        Token DOT33=null;
        Token KW_USING35=null;
        Token SP_COLCOL37=null;
        FanParser.eos_return eos27 = null;

        FanParser.ffi_return ffi29 = null;

        FanParser.eos_return eos30 = null;

        FanParser.podSpec_return podSpec32 = null;

        FanParser.eos_return eos34 = null;

        FanParser.podSpec_return podSpec36 = null;

        FanParser.eos_return eos38 = null;


        Object KW_USING26_tree=null;
        Object KW_USING28_tree=null;
        Object KW_USING31_tree=null;
        Object DOT33_tree=null;
        Object KW_USING35_tree=null;
        Object SP_COLCOL37_tree=null;
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_SP_COLCOL=new RewriteRuleTokenStream(adaptor,"token SP_COLCOL");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_podSpec=new RewriteRuleSubtreeStream(adaptor,"rule podSpec");
        RewriteRuleSubtreeStream stream_ffi=new RewriteRuleSubtreeStream(adaptor,"rule ffi");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:260:10: ( ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) ) -> ^( AST_INC_USING ^( AST_CHILD KW_USING ) ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:260:14: ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:260:14: ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:15: ( KW_USING eos )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:15: ( KW_USING eos )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:16: KW_USING eos
                    {
                    KW_USING26=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_incUsing637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING26);

                    pushFollow(FOLLOW_eos_in_incUsing639);
                    eos27=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos27.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:32: ( KW_USING ffi eos )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:32: ( KW_USING ffi eos )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:33: KW_USING ffi eos
                    {
                    KW_USING28=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_incUsing645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING28);

                    pushFollow(FOLLOW_ffi_in_incUsing647);
                    ffi29=ffi();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ffi.add(ffi29.getTree());
                    pushFollow(FOLLOW_eos_in_incUsing649);
                    eos30=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos30.getTree());

                    }


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:53: ( KW_USING podSpec DOT eos )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:53: ( KW_USING podSpec DOT eos )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:54: KW_USING podSpec DOT eos
                    {
                    KW_USING31=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_incUsing655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING31);

                    pushFollow(FOLLOW_podSpec_in_incUsing657);
                    podSpec32=podSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_podSpec.add(podSpec32.getTree());
                    DOT33=(Token)match(input,DOT,FOLLOW_DOT_in_incUsing659); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT33);

                    pushFollow(FOLLOW_eos_in_incUsing661);
                    eos34=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos34.getTree());

                    }


                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:82: ( KW_USING podSpec SP_COLCOL eos )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:82: ( KW_USING podSpec SP_COLCOL eos )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:260:83: KW_USING podSpec SP_COLCOL eos
                    {
                    KW_USING35=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_incUsing667); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING35);

                    pushFollow(FOLLOW_podSpec_in_incUsing669);
                    podSpec36=podSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_podSpec.add(podSpec36.getTree());
                    SP_COLCOL37=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_incUsing671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SP_COLCOL.add(SP_COLCOL37);

                    pushFollow(FOLLOW_eos_in_incUsing673);
                    eos38=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos38.getTree());

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: DOT, KW_USING, ffi, SP_COLCOL, podSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 261:4: -> ^( AST_INC_USING ^( AST_CHILD KW_USING ) ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:261:7: ^( AST_INC_USING ^( AST_CHILD KW_USING ) ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INC_USING, "AST_INC_USING"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:261:23: ^( AST_CHILD KW_USING )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_KW_USING.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:261:45: ^( AST_CHILD ( ffi )? ( podSpec )? ( DOT )? ( SP_COLCOL )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                // src/net/colar/netbeans/fan/antlr/Fan.g:261:57: ( ffi )?
                if ( stream_ffi.hasNext() ) {
                    adaptor.addChild(root_2, stream_ffi.nextTree());

                }
                stream_ffi.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:261:62: ( podSpec )?
                if ( stream_podSpec.hasNext() ) {
                    adaptor.addChild(root_2, stream_podSpec.nextTree());

                }
                stream_podSpec.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:261:71: ( DOT )?
                if ( stream_DOT.hasNext() ) {
                    adaptor.addChild(root_2, stream_DOT.nextNode());

                }
                stream_DOT.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:261:76: ( SP_COLCOL )?
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
            if ( state.backtracking>0 ) { memoize(input, 6, incUsing_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "incUsing"

    public static class podSpec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podSpec"
    // src/net/colar/netbeans/fan/antlr/Fan.g:262:1: podSpec : ( ffi )? id ( DOT id )* ;
    public final FanParser.podSpec_return podSpec() throws RecognitionException {
        FanParser.podSpec_return retval = new FanParser.podSpec_return();
        retval.start = input.LT(1);
        int podSpec_StartIndex = input.index();
        Object root_0 = null;

        Token DOT41=null;
        FanParser.ffi_return ffi39 = null;

        FanParser.id_return id40 = null;

        FanParser.id_return id42 = null;


        Object DOT41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:10: ( ( ffi )? id ( DOT id )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:12: ( ffi )? id ( DOT id )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:262:12: ( ffi )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SQ_BRACKET_L) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ffi
                    {
                    pushFollow(FOLLOW_ffi_in_podSpec714);
                    ffi39=ffi();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ffi39.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_podSpec717);
            id40=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id40.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:262:20: ( DOT id )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DOT) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==ID) ) {
                        int LA8_3 = input.LA(3);

                        if ( (LA8_3==ID) ) {
                            int LA8_4 = input.LA(4);

                            if ( (LA8_4==ID) ) {
                                alt8=1;
                            }


                        }
                        else if ( (LA8_3==EOF||LA8_3==KW_USING||(LA8_3>=KW_CONST && LA8_3<=KW_STATIC)||LA8_3==KW_FINAL||(LA8_3>=KW_CLASS && LA8_3<=KW_INTERNAL)||(LA8_3>=SP_COLCOL && LA8_3<=DOT)||LA8_3==SP_SEMI||(LA8_3>=AT && LA8_3<=DOC)) ) {
                            alt8=1;
                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:262:21: DOT id
            	    {
            	    DOT41=(Token)match(input,DOT,FOLLOW_DOT_in_podSpec720); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT41_tree = (Object)adaptor.create(DOT41);
            	    adaptor.addChild(root_0, DOT41_tree);
            	    }
            	    pushFollow(FOLLOW_id_in_podSpec722);
            	    id42=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, id42.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 7, podSpec_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podSpec"

    public static class ffi_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ffi"
    // src/net/colar/netbeans/fan/antlr/Fan.g:263:1: ffi : sq_bracketL id sq_bracketR ;
    public final FanParser.ffi_return ffi() throws RecognitionException {
        FanParser.ffi_return retval = new FanParser.ffi_return();
        retval.start = input.LT(1);
        int ffi_StartIndex = input.index();
        Object root_0 = null;

        FanParser.sq_bracketL_return sq_bracketL43 = null;

        FanParser.id_return id44 = null;

        FanParser.sq_bracketR_return sq_bracketR45 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:263:7: ( sq_bracketL id sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:263:9: sq_bracketL id sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sq_bracketL_in_ffi733);
            sq_bracketL43=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL43.getTree());
            pushFollow(FOLLOW_id_in_ffi735);
            id44=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id44.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_ffi737);
            sq_bracketR45=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR45.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, ffi_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ffi"

    public static class podDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:265:1: podDef : podHeader BRACKET_L ( symbolDef )* BRACKET_R ;
    public final FanParser.podDef_return podDef() throws RecognitionException {
        FanParser.podDef_return retval = new FanParser.podDef_return();
        retval.start = input.LT(1);
        int podDef_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_L47=null;
        Token BRACKET_R49=null;
        FanParser.podHeader_return podHeader46 = null;

        FanParser.symbolDef_return symbolDef48 = null;


        Object BRACKET_L47_tree=null;
        Object BRACKET_R49_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:265:9: ( podHeader BRACKET_L ( symbolDef )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:265:11: podHeader BRACKET_L ( symbolDef )* BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_podHeader_in_podDef746);
            podHeader46=podHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, podHeader46.getTree());
            BRACKET_L47=(Token)match(input,BRACKET_L,FOLLOW_BRACKET_L_in_podDef748); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_L47_tree = (Object)adaptor.create(BRACKET_L47);
            adaptor.addChild(root_0, BRACKET_L47_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:265:31: ( symbolDef )*
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
            	    pushFollow(FOLLOW_symbolDef_in_podDef750);
            	    symbolDef48=symbolDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbolDef48.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            BRACKET_R49=(Token)match(input,BRACKET_R,FOLLOW_BRACKET_R_in_podDef753); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_R49_tree = (Object)adaptor.create(BRACKET_R49);
            adaptor.addChild(root_0, BRACKET_R49_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 9, podDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podDef"

    public static class podHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:266:1: podHeader : docs ( facet )* pod id ;
    public final FanParser.podHeader_return podHeader() throws RecognitionException {
        FanParser.podHeader_return retval = new FanParser.podHeader_return();
        retval.start = input.LT(1);
        int podHeader_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs50 = null;

        FanParser.facet_return facet51 = null;

        FanParser.pod_return pod52 = null;

        FanParser.id_return id53 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:11: ( docs ( facet )* pod id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:13: docs ( facet )* pod id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_podHeader760);
            docs50=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs50.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:18: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_podHeader762);
            	    facet51=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet51.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            pushFollow(FOLLOW_pod_in_podHeader765);
            pod52=pod();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pod52.getTree());
            pushFollow(FOLLOW_id_in_podHeader767);
            id53=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id53.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, podHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "podHeader"

    public static class symbolDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbolDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:267:1: symbolDef : docs ( facet )* ( symbolFlag )* typeId AS_INIT_VAL expr eos ;
    public final FanParser.symbolDef_return symbolDef() throws RecognitionException {
        FanParser.symbolDef_return retval = new FanParser.symbolDef_return();
        retval.start = input.LT(1);
        int symbolDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL58=null;
        FanParser.docs_return docs54 = null;

        FanParser.facet_return facet55 = null;

        FanParser.symbolFlag_return symbolFlag56 = null;

        FanParser.typeId_return typeId57 = null;

        FanParser.expr_return expr59 = null;

        FanParser.eos_return eos60 = null;


        Object AS_INIT_VAL58_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:11: ( docs ( facet )* ( symbolFlag )* typeId AS_INIT_VAL expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:13: docs ( facet )* ( symbolFlag )* typeId AS_INIT_VAL expr eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_symbolDef774);
            docs54=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs54.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:18: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_symbolDef776);
            	    facet55=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet55.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:267:25: ( symbolFlag )*
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
            	    pushFollow(FOLLOW_symbolFlag_in_symbolDef779);
            	    symbolFlag56=symbolFlag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbolFlag56.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            pushFollow(FOLLOW_typeId_in_symbolDef782);
            typeId57=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId57.getTree());
            AS_INIT_VAL58=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_symbolDef784); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AS_INIT_VAL58_tree = (Object)adaptor.create(AS_INIT_VAL58);
            adaptor.addChild(root_0, AS_INIT_VAL58_tree);
            }
            pushFollow(FOLLOW_expr_in_symbolDef786);
            expr59=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr59.getTree());
            pushFollow(FOLLOW_eos_in_symbolDef788);
            eos60=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos60.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, symbolDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "symbolDef"

    public static class symbolFlag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbolFlag"
    // src/net/colar/netbeans/fan/antlr/Fan.g:268:1: symbolFlag : 'virtual' ;
    public final FanParser.symbolFlag_return symbolFlag() throws RecognitionException {
        FanParser.symbolFlag_return retval = new FanParser.symbolFlag_return();
        retval.start = input.LT(1);
        int symbolFlag_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal61=null;

        Object string_literal61_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:268:12: ( 'virtual' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:268:14: 'virtual'
            {
            root_0 = (Object)adaptor.nil();

            string_literal61=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_symbolFlag795); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal61_tree = (Object)adaptor.create(string_literal61);
            adaptor.addChild(root_0, string_literal61_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 12, symbolFlag_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "symbolFlag"

    public static class typeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:271:1: typeDef : docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) ;
    public final FanParser.typeDef_return typeDef() throws RecognitionException {
        FanParser.typeDef_return retval = new FanParser.typeDef_return();
        retval.start = input.LT(1);
        int typeDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs62 = null;

        FanParser.facet_return facet63 = null;

        FanParser.classDef_return classDef64 = null;

        FanParser.enumDef_return enumDef65 = null;

        FanParser.mixinDef_return mixinDef66 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:10: ( docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:12: docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_typeDef805);
            docs62=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs62.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:17: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_typeDef807);
            	    facet63=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet63.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:271:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:25: ( ( classFlags )* KW_CLASS )=> classDef
                    {
                    pushFollow(FOLLOW_classDef_in_typeDef818);
                    classDef64=classDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDef64.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:272:4: ( ( protection )? KW_ENUM )=> enumDef
                    {
                    pushFollow(FOLLOW_enumDef_in_typeDef832);
                    enumDef65=enumDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDef65.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:272:37: mixinDef
                    {
                    pushFollow(FOLLOW_mixinDef_in_typeDef836);
                    mixinDef66=mixinDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mixinDef66.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 13, typeDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeDef"

    public static class classDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:273:1: classDef : classHeader classBody -> ^( AST_CLASS classHeader classBody ) ;
    public final FanParser.classDef_return classDef() throws RecognitionException {
        FanParser.classDef_return retval = new FanParser.classDef_return();
        retval.start = input.LT(1);
        int classDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.classHeader_return classHeader67 = null;

        FanParser.classBody_return classBody68 = null;


        RewriteRuleSubtreeStream stream_classHeader=new RewriteRuleSubtreeStream(adaptor,"rule classHeader");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        paraphrase.push("Class definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:274:3: ( classHeader classBody -> ^( AST_CLASS classHeader classBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:274:7: classHeader classBody
            {
            pushFollow(FOLLOW_classHeader_in_classDef858);
            classHeader67=classHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classHeader.add(classHeader67.getTree());
            pushFollow(FOLLOW_classBody_in_classDef860);
            classBody68=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBody.add(classBody68.getTree());


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
            // 275:7: -> ^( AST_CLASS classHeader classBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:275:10: ^( AST_CLASS classHeader classBody )
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
            if ( state.backtracking>0 ) { memoize(input, 14, classDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDef"

    public static class classHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:276:1: classHeader : docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )? -> ^( $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* ;
    public final FanParser.classHeader_return classHeader() throws RecognitionException {
        FanParser.classHeader_return retval = new FanParser.classHeader_return();
        retval.start = input.LT(1);
        int classHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CLASS71=null;
        FanParser.classFlags_return m = null;

        FanParser.id_return cname = null;

        FanParser.docs_return docs69 = null;

        FanParser.facet_return facet70 = null;

        FanParser.inheritance_return inheritance72 = null;


        Object KW_CLASS71_tree=null;
        RewriteRuleTokenStream stream_KW_CLASS=new RewriteRuleTokenStream(adaptor,"token KW_CLASS");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_classFlags=new RewriteRuleSubtreeStream(adaptor,"rule classFlags");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:276:13: ( docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )? -> ^( $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:276:15: docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_classHeader883);
            docs69=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs69.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:276:20: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_classHeader885);
            	    facet70=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet70.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:276:28: (m= classFlags )*
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
            	    pushFollow(FOLLOW_classFlags_in_classHeader890);
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

            KW_CLASS71=(Token)match(input,KW_CLASS,FOLLOW_KW_CLASS_in_classHeader893); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CLASS.add(KW_CLASS71);

            pushFollow(FOLLOW_id_in_classHeader897);
            cname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(cname.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:276:59: ( inheritance )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==SP_COLON) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_classHeader899);
                    inheritance72=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance72.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: m, cname, inheritance
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
            // 277:4: -> ^( $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )*
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:277:7: ^( $cname)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_cname.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:277:17: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:277:17: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:277:49: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:277:49: ^( AST_MODIFIER $m)
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
            if ( state.backtracking>0 ) { memoize(input, 15, classHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classHeader"

    public static class classFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:278:1: classFlags : ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC );
    public final FanParser.classFlags_return classFlags() throws RecognitionException {
        FanParser.classFlags_return retval = new FanParser.classFlags_return();
        retval.start = input.LT(1);
        int classFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ABSTRACT74=null;
        Token KW_FINAL75=null;
        Token KW_CONST76=null;
        Token KW_STATIC77=null;
        FanParser.protection_return protection73 = null;


        Object KW_ABSTRACT74_tree=null;
        Object KW_FINAL75_tree=null;
        Object KW_CONST76_tree=null;
        Object KW_STATIC77_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:278:13: ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:278:15: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_classFlags933);
                    protection73=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection73.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:278:28: KW_ABSTRACT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ABSTRACT74=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_classFlags937); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ABSTRACT74_tree = (Object)adaptor.create(KW_ABSTRACT74);
                    adaptor.addChild(root_0, KW_ABSTRACT74_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:278:42: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL75=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_classFlags941); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL75_tree = (Object)adaptor.create(KW_FINAL75);
                    adaptor.addChild(root_0, KW_FINAL75_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:278:53: KW_CONST
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_CONST76=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_classFlags945); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_CONST76_tree = (Object)adaptor.create(KW_CONST76);
                    adaptor.addChild(root_0, KW_CONST76_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:278:64: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC77=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_classFlags949); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC77_tree = (Object)adaptor.create(KW_STATIC77);
                    adaptor.addChild(root_0, KW_STATIC77_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 16, classFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classFlags"

    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:279:1: classBody : ( bracketL ( slotDef )* bracketR ) -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) ;
    public final FanParser.classBody_return classBody() throws RecognitionException {
        FanParser.classBody_return retval = new FanParser.classBody_return();
        retval.start = input.LT(1);
        int classBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL78 = null;

        FanParser.slotDef_return slotDef79 = null;

        FanParser.bracketR_return bracketR80 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:12: ( ( bracketL ( slotDef )* bracketR ) -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:14: ( bracketL ( slotDef )* bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:14: ( bracketL ( slotDef )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:15: bracketL ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_classBody958);
            bracketL78=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL78.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:24: ( slotDef )*
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
            	    pushFollow(FOLLOW_slotDef_in_classBody960);
            	    slotDef79=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef79.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_classBody963);
            bracketR80=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR80.getTree());

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
            // 279:44: -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:279:47: ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:279:73: ( slotDef )*
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
            if ( state.backtracking>0 ) { memoize(input, 17, classBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBody"

    public static class protection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protection"
    // src/net/colar/netbeans/fan/antlr/Fan.g:280:1: protection : ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL );
    public final FanParser.protection_return protection() throws RecognitionException {
        FanParser.protection_return retval = new FanParser.protection_return();
        retval.start = input.LT(1);
        int protection_StartIndex = input.index();
        Object root_0 = null;

        Token set81=null;

        Object set81_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:12: ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            root_0 = (Object)adaptor.nil();

            set81=(Token)input.LT(1);
            if ( (input.LA(1)>=KW_PRIVATE && input.LA(1)<=KW_INTERNAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set81));
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
            if ( state.backtracking>0 ) { memoize(input, 18, protection_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "protection"

    public static class mixinDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:281:1: mixinDef : mixinHeader mixinBody -> ^( AST_MIXIN mixinHeader mixinBody ) ;
    public final FanParser.mixinDef_return mixinDef() throws RecognitionException {
        FanParser.mixinDef_return retval = new FanParser.mixinDef_return();
        retval.start = input.LT(1);
        int mixinDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mixinHeader_return mixinHeader82 = null;

        FanParser.mixinBody_return mixinBody83 = null;


        RewriteRuleSubtreeStream stream_mixinBody=new RewriteRuleSubtreeStream(adaptor,"rule mixinBody");
        RewriteRuleSubtreeStream stream_mixinHeader=new RewriteRuleSubtreeStream(adaptor,"rule mixinHeader");
        paraphrase.push("Mixin definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:3: ( mixinHeader mixinBody -> ^( AST_MIXIN mixinHeader mixinBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:5: mixinHeader mixinBody
            {
            pushFollow(FOLLOW_mixinHeader_in_mixinDef1015);
            mixinHeader82=mixinHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mixinHeader.add(mixinHeader82.getTree());
            pushFollow(FOLLOW_mixinBody_in_mixinDef1017);
            mixinBody83=mixinBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mixinBody.add(mixinBody83.getTree());


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
            // 283:7: -> ^( AST_MIXIN mixinHeader mixinBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:283:10: ^( AST_MIXIN mixinHeader mixinBody )
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
            if ( state.backtracking>0 ) { memoize(input, 19, mixinDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinDef"

    public static class mixinHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:284:1: mixinHeader : docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )? -> ^( $mname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* ;
    public final FanParser.mixinHeader_return mixinHeader() throws RecognitionException {
        FanParser.mixinHeader_return retval = new FanParser.mixinHeader_return();
        retval.start = input.LT(1);
        int mixinHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_MIXIN86=null;
        FanParser.mixinFlags_return m = null;

        FanParser.id_return mname = null;

        FanParser.docs_return docs84 = null;

        FanParser.facet_return facet85 = null;

        FanParser.inheritance_return inheritance87 = null;


        Object KW_MIXIN86_tree=null;
        RewriteRuleTokenStream stream_KW_MIXIN=new RewriteRuleTokenStream(adaptor,"token KW_MIXIN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_mixinFlags=new RewriteRuleSubtreeStream(adaptor,"rule mixinFlags");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:13: ( docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )? -> ^( $mname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:15: docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_mixinHeader1040);
            docs84=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs84.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:20: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_mixinHeader1042);
            	    facet85=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet85.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:284:28: (m= mixinFlags )*
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
            	    pushFollow(FOLLOW_mixinFlags_in_mixinHeader1047);
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

            KW_MIXIN86=(Token)match(input,KW_MIXIN,FOLLOW_KW_MIXIN_in_mixinHeader1050); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_MIXIN.add(KW_MIXIN86);

            pushFollow(FOLLOW_id_in_mixinHeader1054);
            mname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(mname.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:59: ( inheritance )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==SP_COLON) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_mixinHeader1056);
                    inheritance87=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance87.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: mname, inheritance, m
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
            // 285:4: -> ^( $mname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )*
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:285:7: ^( $mname)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_mname.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:285:17: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:17: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:285:49: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:49: ^( AST_MODIFIER $m)
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
            if ( state.backtracking>0 ) { memoize(input, 20, mixinHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinHeader"

    public static class mixinFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:286:1: mixinFlags : ( protection | KW_CONST | KW_STATIC | KW_FINAL );
    public final FanParser.mixinFlags_return mixinFlags() throws RecognitionException {
        FanParser.mixinFlags_return retval = new FanParser.mixinFlags_return();
        retval.start = input.LT(1);
        int mixinFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CONST89=null;
        Token KW_STATIC90=null;
        Token KW_FINAL91=null;
        FanParser.protection_return protection88 = null;


        Object KW_CONST89_tree=null;
        Object KW_STATIC90_tree=null;
        Object KW_FINAL91_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:12: ( protection | KW_CONST | KW_STATIC | KW_FINAL )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:286:14: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_mixinFlags1089);
                    protection88=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection88.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:286:27: KW_CONST
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_CONST89=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_mixinFlags1093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_CONST89_tree = (Object)adaptor.create(KW_CONST89);
                    adaptor.addChild(root_0, KW_CONST89_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:286:38: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC90=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_mixinFlags1097); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC90_tree = (Object)adaptor.create(KW_STATIC90);
                    adaptor.addChild(root_0, KW_STATIC90_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:286:50: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL91=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_mixinFlags1101); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL91_tree = (Object)adaptor.create(KW_FINAL91);
                    adaptor.addChild(root_0, KW_FINAL91_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 21, mixinFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinFlags"

    public static class mixinBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:287:1: mixinBody : bracketL ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) ;
    public final FanParser.mixinBody_return mixinBody() throws RecognitionException {
        FanParser.mixinBody_return retval = new FanParser.mixinBody_return();
        retval.start = input.LT(1);
        int mixinBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL92 = null;

        FanParser.slotDef_return slotDef93 = null;

        FanParser.bracketR_return bracketR94 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:11: ( bracketL ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:13: bracketL ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_mixinBody1108);
            bracketL92=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL92.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:22: ( slotDef )*
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
            	    pushFollow(FOLLOW_slotDef_in_mixinBody1110);
            	    slotDef93=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef93.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_mixinBody1113);
            bracketR94=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR94.getTree());


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
            // 287:41: -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:287:44: ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:287:70: ( slotDef )*
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
            if ( state.backtracking>0 ) { memoize(input, 22, mixinBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinBody"

    public static class enumDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:288:1: enumDef : enumHeader enumBody -> ^( AST_ENUM enumHeader enumBody ) ;
    public final FanParser.enumDef_return enumDef() throws RecognitionException {
        FanParser.enumDef_return retval = new FanParser.enumDef_return();
        retval.start = input.LT(1);
        int enumDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.enumHeader_return enumHeader95 = null;

        FanParser.enumBody_return enumBody96 = null;


        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_enumHeader=new RewriteRuleSubtreeStream(adaptor,"rule enumHeader");
        paraphrase.push("Enumeration definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:3: ( enumHeader enumBody -> ^( AST_ENUM enumHeader enumBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:5: enumHeader enumBody
            {
            pushFollow(FOLLOW_enumHeader_in_enumDef1146);
            enumHeader95=enumHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumHeader.add(enumHeader95.getTree());
            pushFollow(FOLLOW_enumBody_in_enumDef1148);
            enumBody96=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody96.getTree());


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
            // 290:7: -> ^( AST_ENUM enumHeader enumBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:290:10: ^( AST_ENUM enumHeader enumBody )
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
            if ( state.backtracking>0 ) { memoize(input, 23, enumDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumDef"

    public static class enumHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:291:1: enumHeader : docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )? -> ^( $ename) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* ;
    public final FanParser.enumHeader_return enumHeader() throws RecognitionException {
        FanParser.enumHeader_return retval = new FanParser.enumHeader_return();
        retval.start = input.LT(1);
        int enumHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ENUM99=null;
        FanParser.protection_return m = null;

        FanParser.id_return ename = null;

        FanParser.docs_return docs97 = null;

        FanParser.facet_return facet98 = null;

        FanParser.inheritance_return inheritance100 = null;


        Object KW_ENUM99_tree=null;
        RewriteRuleTokenStream stream_KW_ENUM=new RewriteRuleTokenStream(adaptor,"token KW_ENUM");
        RewriteRuleSubtreeStream stream_protection=new RewriteRuleSubtreeStream(adaptor,"rule protection");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:12: ( docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )? -> ^( $ename) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:17: docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_enumHeader1174);
            docs97=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs97.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:22: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_enumHeader1176);
            	    facet98=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet98.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:291:30: (m= protection )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=KW_PRIVATE && LA26_0<=KW_INTERNAL)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= protection
                    {
                    pushFollow(FOLLOW_protection_in_enumHeader1181);
                    m=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protection.add(m.getTree());

                    }
                    break;

            }

            KW_ENUM99=(Token)match(input,KW_ENUM,FOLLOW_KW_ENUM_in_enumHeader1184); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_ENUM.add(KW_ENUM99);

            pushFollow(FOLLOW_id_in_enumHeader1188);
            ename=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(ename.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:60: ( inheritance )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==SP_COLON) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_enumHeader1190);
                    inheritance100=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance100.getTree());

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
            // 292:4: -> ^( $ename) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )*
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:292:7: ^( $ename)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ename.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:292:17: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:292:17: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:292:49: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:292:49: ^( AST_MODIFIER $m)
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
            if ( state.backtracking>0 ) { memoize(input, 24, enumHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumHeader"

    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:293:1: enumBody : bracketL enumValDefs ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR ) ;
    public final FanParser.enumBody_return enumBody() throws RecognitionException {
        FanParser.enumBody_return retval = new FanParser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL101 = null;

        FanParser.enumValDefs_return enumValDefs102 = null;

        FanParser.slotDef_return slotDef103 = null;

        FanParser.bracketR_return bracketR104 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        RewriteRuleSubtreeStream stream_enumValDefs=new RewriteRuleSubtreeStream(adaptor,"rule enumValDefs");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:293:10: ( bracketL enumValDefs ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:293:12: bracketL enumValDefs ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_enumBody1223);
            bracketL101=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL101.getTree());
            pushFollow(FOLLOW_enumValDefs_in_enumBody1225);
            enumValDefs102=enumValDefs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumValDefs.add(enumValDefs102.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:293:33: ( slotDef )*
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
            	    pushFollow(FOLLOW_slotDef_in_enumBody1227);
            	    slotDef103=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef103.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_enumBody1230);
            bracketR104=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR104.getTree());


            // AST REWRITE
            // elements: slotDef, enumValDefs, bracketR, bracketL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 293:53: -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:293:56: ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                adaptor.addChild(root_1, stream_enumValDefs.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:293:94: ( slotDef )*
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
            if ( state.backtracking>0 ) { memoize(input, 25, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBody"

    public static class inheritance_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritance"
    // src/net/colar/netbeans/fan/antlr/Fan.g:294:1: inheritance : SP_COLON typeList ;
    public final FanParser.inheritance_return inheritance() throws RecognitionException {
        FanParser.inheritance_return retval = new FanParser.inheritance_return();
        retval.start = input.LT(1);
        int inheritance_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON105=null;
        FanParser.typeList_return typeList106 = null;


        Object SP_COLON105_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:294:14: ( SP_COLON typeList )
            // src/net/colar/netbeans/fan/antlr/Fan.g:294:16: SP_COLON typeList
            {
            root_0 = (Object)adaptor.nil();

            SP_COLON105=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_inheritance1255); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON105_tree = (Object)adaptor.create(SP_COLON105);
            adaptor.addChild(root_0, SP_COLON105_tree);
            }
            pushFollow(FOLLOW_typeList_in_inheritance1257);
            typeList106=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList106.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, inheritance_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritance"

    public static class enumValDefs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValDefs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:296:1: enumValDefs : enumValDef ( SP_COMMA enumValDef )* eos ;
    public final FanParser.enumValDefs_return enumValDefs() throws RecognitionException {
        FanParser.enumValDefs_return retval = new FanParser.enumValDefs_return();
        retval.start = input.LT(1);
        int enumValDefs_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA108=null;
        FanParser.enumValDef_return enumValDef107 = null;

        FanParser.enumValDef_return enumValDef109 = null;

        FanParser.eos_return eos110 = null;


        Object SP_COMMA108_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:14: ( enumValDef ( SP_COMMA enumValDef )* eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:16: enumValDef ( SP_COMMA enumValDef )* eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_enumValDef_in_enumValDefs1267);
            enumValDef107=enumValDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValDef107.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:27: ( SP_COMMA enumValDef )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==SP_COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:296:28: SP_COMMA enumValDef
            	    {
            	    SP_COMMA108=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_enumValDefs1270); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA108_tree = (Object)adaptor.create(SP_COMMA108);
            	    adaptor.addChild(root_0, SP_COMMA108_tree);
            	    }
            	    pushFollow(FOLLOW_enumValDef_in_enumValDefs1273);
            	    enumValDef109=enumValDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValDef109.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            pushFollow(FOLLOW_eos_in_enumValDefs1277);
            eos110=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos110.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, enumValDefs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValDefs"

    public static class enumValDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:297:1: enumValDef : docs id ( parL ( args )? parR )? ;
    public final FanParser.enumValDef_return enumValDef() throws RecognitionException {
        FanParser.enumValDef_return retval = new FanParser.enumValDef_return();
        retval.start = input.LT(1);
        int enumValDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs111 = null;

        FanParser.id_return id112 = null;

        FanParser.parL_return parL113 = null;

        FanParser.args_return args114 = null;

        FanParser.parR_return parR115 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:297:13: ( docs id ( parL ( args )? parR )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:297:15: docs id ( parL ( args )? parR )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_enumValDef1285);
            docs111=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs111.getTree());
            pushFollow(FOLLOW_id_in_enumValDef1287);
            id112=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id112.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:297:23: ( parL ( args )? parR )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==PAR_L) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:297:24: parL ( args )? parR
                    {
                    pushFollow(FOLLOW_parL_in_enumValDef1290);
                    parL113=parL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parL113.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:297:29: ( args )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=KW_THIS && LA30_0<=KW_SUPER)||(LA30_0>=KW_NULL && LA30_0<=KW_FALSE)||LA30_0==SP_PIPE||LA30_0==OP_CURRY||(LA30_0>=OP_PLUS && LA30_0<=OP_MULTI)||(LA30_0>=OP_BANG && LA30_0<=OP_TILDA)||(LA30_0>=ID && LA30_0<=AT)||(LA30_0>=NUMBER && LA30_0<=SQ_BRACKET_L)||LA30_0==PAR_L) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                            {
                            pushFollow(FOLLOW_args_in_enumValDef1292);
                            args114=args();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, args114.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_parR_in_enumValDef1295);
                    parR115=parR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parR115.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 28, enumValDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValDef"

    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeList"
    // src/net/colar/netbeans/fan/antlr/Fan.g:298:1: typeList : type ( SP_COMMA type )* ;
    public final FanParser.typeList_return typeList() throws RecognitionException {
        FanParser.typeList_return retval = new FanParser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA117=null;
        FanParser.type_return type116 = null;

        FanParser.type_return type118 = null;


        Object SP_COMMA117_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:10: ( type ( SP_COMMA type )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:14: type ( SP_COMMA type )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_typeList1306);
            type116=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type116.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:19: ( SP_COMMA type )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==SP_COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:298:20: SP_COMMA type
            	    {
            	    SP_COMMA117=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_typeList1309); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA117_tree = (Object)adaptor.create(SP_COMMA117);
            	    adaptor.addChild(root_0, SP_COMMA117_tree);
            	    }
            	    pushFollow(FOLLOW_type_in_typeList1311);
            	    type118=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type118.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 29, typeList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeList"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // src/net/colar/netbeans/fan/antlr/Fan.g:300:1: type : typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ;
    public final FanParser.type_return type() throws RecognitionException {
        FanParser.type_return retval = new FanParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK120=null;
        Token LIST_TYPE121=null;
        Token SP_QMARK122=null;
        FanParser.typeRoot_return typeRoot119 = null;


        Object SP_QMARK120_tree=null;
        Object LIST_TYPE121_tree=null;
        Object SP_QMARK122_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:14: ( typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:18: typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeRoot_in_type1331);
            typeRoot119=typeRoot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeRoot119.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:28: ( SP_QMARK )?
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
                    SP_QMARK120=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type1334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_QMARK120_tree = (Object)adaptor.create(SP_QMARK120);
                    adaptor.addChild(root_0, SP_QMARK120_tree);
                    }

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:300:38: ( LIST_TYPE ( SP_QMARK )? )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:300:39: LIST_TYPE ( SP_QMARK )?
            	    {
            	    LIST_TYPE121=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_type1338); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LIST_TYPE121_tree = (Object)adaptor.create(LIST_TYPE121);
            	    adaptor.addChild(root_0, LIST_TYPE121_tree);
            	    }
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:300:49: ( SP_QMARK )?
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
            	            SP_QMARK122=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type1340); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK122_tree = (Object)adaptor.create(SP_QMARK122);
            	            adaptor.addChild(root_0, SP_QMARK122_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 30, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class typeRoot_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeRoot"
    // src/net/colar/netbeans/fan/antlr/Fan.g:301:1: typeRoot : ( mapType | nonMapType );
    public final FanParser.typeRoot_return typeRoot() throws RecognitionException {
        FanParser.typeRoot_return retval = new FanParser.typeRoot_return();
        retval.start = input.LT(1);
        int typeRoot_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mapType_return mapType123 = null;

        FanParser.nonMapType_return nonMapType124 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:301:10: ( mapType | nonMapType )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:301:12: mapType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_mapType_in_typeRoot1351);
                    mapType123=mapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapType123.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:301:22: nonMapType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nonMapType_in_typeRoot1355);
                    nonMapType124=nonMapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonMapType124.getTree());

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

    public static class nonMapType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonMapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:302:1: nonMapType : ( funcType | simpleType );
    public final FanParser.nonMapType_return nonMapType() throws RecognitionException {
        FanParser.nonMapType_return retval = new FanParser.nonMapType_return();
        retval.start = input.LT(1);
        int nonMapType_StartIndex = input.index();
        Object root_0 = null;

        FanParser.funcType_return funcType125 = null;

        FanParser.simpleType_return simpleType126 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:12: ( funcType | simpleType )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:302:14: funcType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_nonMapType1362);
                    funcType125=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType125.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:302:25: simpleType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simpleType_in_nonMapType1366);
                    simpleType126=simpleType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType126.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 32, nonMapType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nonMapType"

    public static class simpleType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:303:1: simpleType : id ( SP_COLCOL id )? ;
    public final FanParser.simpleType_return simpleType() throws RecognitionException {
        FanParser.simpleType_return retval = new FanParser.simpleType_return();
        retval.start = input.LT(1);
        int simpleType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLCOL128=null;
        FanParser.id_return id127 = null;

        FanParser.id_return id129 = null;


        Object SP_COLCOL128_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:17: ( id ( SP_COLCOL id )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:21: id ( SP_COLCOL id )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_simpleType1380);
            id127=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id127.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:24: ( SP_COLCOL id )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==SP_COLCOL) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:303:25: SP_COLCOL id
                    {
                    SP_COLCOL128=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_simpleType1383); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLCOL128_tree = (Object)adaptor.create(SP_COLCOL128);
                    adaptor.addChild(root_0, SP_COLCOL128_tree);
                    }
                    pushFollow(FOLLOW_id_in_simpleType1385);
                    id129=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id129.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 33, simpleType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleType"

    public static class mapType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:305:1: mapType : ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? -> ^( AST_MAP ^( AST_CHILD nonMapType ) ^( AST_CHILD type ) ) ;
    public final FanParser.mapType_return mapType() throws RecognitionException {
        FanParser.mapType_return retval = new FanParser.mapType_return();
        retval.start = input.LT(1);
        int mapType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK132=null;
        Token LIST_TYPE133=null;
        Token SP_QMARK134=null;
        Token SP_COLON135=null;
        FanParser.sq_bracketL_return sq_bracketL130 = null;

        FanParser.nonMapType_return nonMapType131 = null;

        FanParser.type_return type136 = null;

        FanParser.sq_bracketR_return sq_bracketR137 = null;


        Object SP_QMARK132_tree=null;
        Object LIST_TYPE133_tree=null;
        Object SP_QMARK134_tree=null;
        Object SP_COLON135_tree=null;
        RewriteRuleTokenStream stream_SP_QMARK=new RewriteRuleTokenStream(adaptor,"token SP_QMARK");
        RewriteRuleTokenStream stream_SP_COLON=new RewriteRuleTokenStream(adaptor,"token SP_COLON");
        RewriteRuleTokenStream stream_LIST_TYPE=new RewriteRuleTokenStream(adaptor,"token LIST_TYPE");
        RewriteRuleSubtreeStream stream_nonMapType=new RewriteRuleSubtreeStream(adaptor,"rule nonMapType");
        RewriteRuleSubtreeStream stream_sq_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketR");
        RewriteRuleSubtreeStream stream_sq_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule sq_bracketL");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:10: ( ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? -> ^( AST_MAP ^( AST_CHILD nonMapType ) ^( AST_CHILD type ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:12: ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )?
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:12: ( sq_bracketL )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==SQ_BRACKET_L) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: sq_bracketL
                    {
                    pushFollow(FOLLOW_sq_bracketL_in_mapType1396);
                    sq_bracketL130=sq_bracketL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sq_bracketL.add(sq_bracketL130.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_nonMapType_in_mapType1399);
            nonMapType131=nonMapType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nonMapType.add(nonMapType131.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:36: ( SP_QMARK )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==SP_QMARK) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    SP_QMARK132=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType1401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SP_QMARK.add(SP_QMARK132);


                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:305:46: ( LIST_TYPE ( SP_QMARK )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LIST_TYPE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:305:47: LIST_TYPE ( SP_QMARK )?
            	    {
            	    LIST_TYPE133=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_mapType1405); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LIST_TYPE.add(LIST_TYPE133);

            	    // src/net/colar/netbeans/fan/antlr/Fan.g:305:57: ( SP_QMARK )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==SP_QMARK) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK134=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType1407); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_SP_QMARK.add(SP_QMARK134);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:306:5: ({...}? SP_COLON {...}? type )+
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:306:6: {...}? SP_COLON {...}? type
            	    {
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    SP_COLON135=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapType1419); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SP_COLON.add(SP_COLON135);

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    pushFollow(FOLLOW_type_in_mapType1423);
            	    type136=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type136.getTree());

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

            // src/net/colar/netbeans/fan/antlr/Fan.g:306:56: ( sq_bracketR )?
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
                    pushFollow(FOLLOW_sq_bracketR_in_mapType1427);
                    sq_bracketR137=sq_bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sq_bracketR.add(sq_bracketR137.getTree());

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
            // 307:4: -> ^( AST_MAP ^( AST_CHILD nonMapType ) ^( AST_CHILD type ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:307:7: ^( AST_MAP ^( AST_CHILD nonMapType ) ^( AST_CHILD type ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MAP, "AST_MAP"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:307:17: ^( AST_CHILD nonMapType )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_nonMapType.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:307:41: ^( AST_CHILD type )
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
            if ( state.backtracking>0 ) { memoize(input, 34, mapType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapType"

    public static class funcType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:308:1: funcType : SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE ;
    public final FanParser.funcType_return funcType() throws RecognitionException {
        FanParser.funcType_return retval = new FanParser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_PIPE138=null;
        Token SP_COMMA139=null;
        Token SP_PIPE143=null;
        FanParser.formals_return formals140 = null;

        FanParser.assignedType_return assignedType141 = null;

        FanParser.assignedType_return assignedType142 = null;


        Object SP_PIPE138_tree=null;
        Object SP_COMMA139_tree=null;
        Object SP_PIPE143_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:308:11: ( SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE )
            // src/net/colar/netbeans/fan/antlr/Fan.g:308:13: SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE
            {
            root_0 = (Object)adaptor.nil();

            SP_PIPE138=(Token)match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType1457); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_PIPE138_tree = (Object)adaptor.create(SP_PIPE138);
            adaptor.addChild(root_0, SP_PIPE138_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:308:21: ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) )
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==SP_COMMA) ) {
                alt46=1;
            }
            else if ( (LA46_0==SP_PIPE||LA46_0==ID||LA46_0==SQ_BRACKET_L) ) {
                alt46=2;
            }
            else if ( (LA46_0==OP_ARROW) && (synpred63_Fan())) {
                alt46=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:22: SP_COMMA
                    {
                    SP_COMMA139=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_funcType1460); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COMMA139_tree = (Object)adaptor.create(SP_COMMA139);
                    adaptor.addChild(root_0, SP_COMMA139_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:34: formals ( ( OP_ARROW )=> assignedType )?
                    {
                    pushFollow(FOLLOW_formals_in_funcType1465);
                    formals140=formals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formals140.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:42: ( ( OP_ARROW )=> assignedType )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==OP_ARROW) && (synpred61_Fan())) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:308:43: ( OP_ARROW )=> assignedType
                            {
                            pushFollow(FOLLOW_assignedType_in_funcType1472);
                            assignedType141=assignedType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType141.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:73: ( ( OP_ARROW )=> assignedType )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:73: ( ( OP_ARROW )=> assignedType )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:74: ( OP_ARROW )=> assignedType
                    {
                    pushFollow(FOLLOW_assignedType_in_funcType1484);
                    assignedType142=assignedType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType142.getTree());

                    }


                    }
                    break;

            }

            SP_PIPE143=(Token)match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType1488); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_PIPE143_tree = (Object)adaptor.create(SP_PIPE143);
            adaptor.addChild(root_0, SP_PIPE143_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 35, funcType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcType"

    public static class assignedType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignedType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:309:1: assignedType : OP_ARROW type ;
    public final FanParser.assignedType_return assignedType() throws RecognitionException {
        FanParser.assignedType_return retval = new FanParser.assignedType_return();
        retval.start = input.LT(1);
        int assignedType_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW144=null;
        FanParser.type_return type145 = null;


        Object OP_ARROW144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:14: ( OP_ARROW type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:309:16: OP_ARROW type
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW144=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_assignedType1495); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW144_tree = (Object)adaptor.create(OP_ARROW144);
            adaptor.addChild(root_0, OP_ARROW144_tree);
            }
            pushFollow(FOLLOW_type_in_assignedType1497);
            type145=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type145.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, assignedType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignedType"

    public static class formals_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formals"
    // src/net/colar/netbeans/fan/antlr/Fan.g:310:1: formals : formal ( SP_COMMA formal )* ;
    public final FanParser.formals_return formals() throws RecognitionException {
        FanParser.formals_return retval = new FanParser.formals_return();
        retval.start = input.LT(1);
        int formals_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA147=null;
        FanParser.formal_return formal146 = null;

        FanParser.formal_return formal148 = null;


        Object SP_COMMA147_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:10: ( formal ( SP_COMMA formal )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:14: formal ( SP_COMMA formal )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_formal_in_formals1507);
            formal146=formal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formal146.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:21: ( SP_COMMA formal )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==SP_COMMA) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:310:22: SP_COMMA formal
            	    {
            	    SP_COMMA147=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_formals1510); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA147_tree = (Object)adaptor.create(SP_COMMA147);
            	    adaptor.addChild(root_0, SP_COMMA147_tree);
            	    }
            	    pushFollow(FOLLOW_formal_in_formals1512);
            	    formal148=formal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal148.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
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
            if ( state.backtracking>0 ) { memoize(input, 37, formals_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formals"

    public static class formal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:311:1: formal : ( formalFull | formalTypeOnly | formalInferred );
    public final FanParser.formal_return formal() throws RecognitionException {
        FanParser.formal_return retval = new FanParser.formal_return();
        retval.start = input.LT(1);
        int formal_StartIndex = input.index();
        Object root_0 = null;

        FanParser.formalFull_return formalFull149 = null;

        FanParser.formalTypeOnly_return formalTypeOnly150 = null;

        FanParser.formalInferred_return formalInferred151 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:311:9: ( formalFull | formalTypeOnly | formalInferred )
            int alt48=3;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                int LA48_1 = input.LA(2);

                if ( (synpred65_Fan()) ) {
                    alt48=1;
                }
                else if ( (synpred66_Fan()) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
                }
                break;
            case SP_PIPE:
                {
                int LA48_2 = input.LA(2);

                if ( (synpred65_Fan()) ) {
                    alt48=1;
                }
                else if ( (synpred66_Fan()) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA48_3 = input.LA(2);

                if ( (synpred65_Fan()) ) {
                    alt48=1;
                }
                else if ( (synpred66_Fan()) ) {
                    alt48=2;
                }
                else if ( (true) ) {
                    alt48=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:311:11: formalFull
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalFull_in_formal1522);
                    formalFull149=formalFull();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalFull149.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:311:24: formalTypeOnly
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalTypeOnly_in_formal1526);
                    formalTypeOnly150=formalTypeOnly();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalTypeOnly150.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:311:41: formalInferred
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalInferred_in_formal1530);
                    formalInferred151=formalInferred();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalInferred151.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 38, formal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formal"

    public static class formalFull_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalFull"
    // src/net/colar/netbeans/fan/antlr/Fan.g:312:1: formalFull : type id ;
    public final FanParser.formalFull_return formalFull() throws RecognitionException {
        FanParser.formalFull_return retval = new FanParser.formalFull_return();
        retval.start = input.LT(1);
        int formalFull_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type152 = null;

        FanParser.id_return id153 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:312:17: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:312:19: type id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalFull1542);
            type152=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type152.getTree());
            pushFollow(FOLLOW_id_in_formalFull1544);
            id153=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id153.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, formalFull_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalFull"

    public static class formalTypeOnly_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalTypeOnly"
    // src/net/colar/netbeans/fan/antlr/Fan.g:313:1: formalTypeOnly : type ;
    public final FanParser.formalTypeOnly_return formalTypeOnly() throws RecognitionException {
        FanParser.formalTypeOnly_return retval = new FanParser.formalTypeOnly_return();
        retval.start = input.LT(1);
        int formalTypeOnly_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type154 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:17: ( type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:313:21: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalTypeOnly1554);
            type154=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type154.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, formalTypeOnly_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalTypeOnly"

    public static class formalInferred_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalInferred"
    // src/net/colar/netbeans/fan/antlr/Fan.g:314:1: formalInferred : id ;
    public final FanParser.formalInferred_return formalInferred() throws RecognitionException {
        FanParser.formalInferred_return retval = new FanParser.formalInferred_return();
        retval.start = input.LT(1);
        int formalInferred_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id155 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:17: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:314:21: id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_formalInferred1564);
            id155=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id155.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, formalInferred_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalInferred"

    public static class slotDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slotDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:315:1: slotDef : ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) ;
    public final FanParser.slotDef_return slotDef() throws RecognitionException {
        FanParser.slotDef_return retval = new FanParser.slotDef_return();
        retval.start = input.LT(1);
        int slotDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.staticBlock_return staticBlock156 = null;

        FanParser.docs_return docs157 = null;

        FanParser.facet_return facet158 = null;

        FanParser.ctorDef_return ctorDef159 = null;

        FanParser.methodDef_return methodDef160 = null;

        FanParser.fieldDef_return fieldDef161 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:315:10: ( ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:315:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:315:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:315:13: ( KW_STATIC bracketL )=> staticBlock
                    {
                    pushFollow(FOLLOW_staticBlock_in_slotDef1580);
                    staticBlock156=staticBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticBlock156.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:6: docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    {
                    pushFollow(FOLLOW_docs_in_slotDef1588);
                    docs157=docs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, docs157.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:316:11: ( facet )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==AT) ) {
                            int LA49_2 = input.LA(2);

                            if ( (LA49_2==ID) ) {
                                int LA49_3 = input.LA(3);

                                if ( (synpred68_Fan()) ) {
                                    alt49=1;
                                }


                            }


                        }


                        switch (alt49) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
                    	    {
                    	    pushFollow(FOLLOW_facet_in_slotDef1590);
                    	    facet158=facet();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet158.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:317:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    int alt50=3;
                    alt50 = dfa50.predict(input);
                    switch (alt50) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:318:7: ( ( ctorFlags )* KW_NEW )=> ctorDef
                            {
                            pushFollow(FOLLOW_ctorDef_in_slotDef1613);
                            ctorDef159=ctorDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorDef159.getTree());

                            }
                            break;
                        case 2 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:319:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef
                            {
                            pushFollow(FOLLOW_methodDef_in_slotDef1640);
                            methodDef160=methodDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDef160.getTree());

                            }
                            break;
                        case 3 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:320:7: fieldDef
                            {
                            pushFollow(FOLLOW_fieldDef_in_slotDef1650);
                            fieldDef161=fieldDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDef161.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 42, slotDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slotDef"

    public static class fieldDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:324:1: fieldDef : docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? ) ;
    public final FanParser.fieldDef_return fieldDef() throws RecognitionException {
        FanParser.fieldDef_return retval = new FanParser.fieldDef_return();
        retval.start = input.LT(1);
        int fieldDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL165=null;
        Token SP_SEMI171=null;
        FanParser.fieldFlags_return m = null;

        FanParser.docs_return docs162 = null;

        FanParser.facet_return facet163 = null;

        FanParser.typeId_return typeId164 = null;

        FanParser.expr_return expr166 = null;

        FanParser.bracketL_return bracketL167 = null;

        FanParser.protection_return protection168 = null;

        FanParser.getter_return getter169 = null;

        FanParser.setter_return setter170 = null;

        FanParser.block_return block172 = null;

        FanParser.bracketR_return bracketR173 = null;

        FanParser.eos_return eos174 = null;


        Object AS_INIT_VAL165_tree=null;
        Object SP_SEMI171_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:3: ( docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:5: docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            {
            pushFollow(FOLLOW_docs_in_fieldDef1686);
            docs162=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs162.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:10: ( facet )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==AT) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_fieldDef1688);
            	    facet163=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet163.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            pushFollow(FOLLOW_fieldFlags_in_fieldDef1693);
            m=fieldFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldFlags.add(m.getTree());
            pushFollow(FOLLOW_typeId_in_fieldDef1695);
            typeId164=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeId.add(typeId164.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:37: ( AS_INIT_VAL expr )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==AS_INIT_VAL) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:325:38: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL165=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_fieldDef1698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL165);

                    pushFollow(FOLLOW_expr_in_fieldDef1700);
                    expr166=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr166.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:326:5: ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==BRACKET_L) ) {
                alt59=1;
            }
            else if ( (LA59_0==EOF||(LA59_0>=KW_RD_ONLY && LA59_0<=KW_FINAL)||(LA59_0>=KW_ABSTRACT && LA59_0<=KW_ONCE)||LA59_0==BRACKET_R||LA59_0==SP_PIPE||LA59_0==SP_SEMI||LA59_0==ID||(LA59_0>=AT && LA59_0<=DOC)||LA59_0==SQ_BRACKET_L) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:327:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:327:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:327:6: bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR
                    {
                    pushFollow(FOLLOW_bracketL_in_fieldDef1715);
                    bracketL167=bracketL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketL.add(bracketL167.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:327:15: ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( ((LA58_0>=KW_PRIVATE && LA58_0<=KW_INTERNAL)||LA58_0==ID) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:16: ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )?
                    	    {
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:16: ( protection )?
                    	    int alt54=2;
                    	    int LA54_0 = input.LA(1);

                    	    if ( ((LA54_0>=KW_PRIVATE && LA54_0<=KW_INTERNAL)) ) {
                    	        alt54=1;
                    	    }
                    	    switch (alt54) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    	            {
                    	            pushFollow(FOLLOW_protection_in_fieldDef1718);
                    	            protection168=protection();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_protection.add(protection168.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:28: ( getter | setter )
                    	    int alt55=2;
                    	    int LA55_0 = input.LA(1);

                    	    if ( (LA55_0==ID) ) {
                    	        int LA55_1 = input.LA(2);

                    	        if ( (synpred77_Fan()) ) {
                    	            alt55=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt55=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 55, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 55, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt55) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:327:29: getter
                    	            {
                    	            pushFollow(FOLLOW_getter_in_fieldDef1722);
                    	            getter169=getter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_getter.add(getter169.getTree());

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:327:38: setter
                    	            {
                    	            pushFollow(FOLLOW_setter_in_fieldDef1726);
                    	            setter170=setter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_setter.add(setter170.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:46: ( SP_SEMI )?
                    	    int alt56=2;
                    	    int LA56_0 = input.LA(1);

                    	    if ( (LA56_0==SP_SEMI) ) {
                    	        alt56=1;
                    	    }
                    	    switch (alt56) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
                    	            {
                    	            SP_SEMI171=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_fieldDef1729); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_SP_SEMI.add(SP_SEMI171);


                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:55: ( block )?
                    	    int alt57=2;
                    	    int LA57_0 = input.LA(1);

                    	    if ( ((LA57_0>=KW_BREAK && LA57_0<=KW_TRY)||(LA57_0>=KW_THIS && LA57_0<=KW_SUPER)||(LA57_0>=KW_NULL && LA57_0<=KW_FALSE)||LA57_0==BRACKET_L||LA57_0==SP_PIPE||LA57_0==OP_CURRY||(LA57_0>=OP_PLUS && LA57_0<=OP_MULTI)||(LA57_0>=OP_BANG && LA57_0<=OP_TILDA)||(LA57_0>=URI && LA57_0<=AT)||(LA57_0>=NUMBER && LA57_0<=SQ_BRACKET_L)||LA57_0==PAR_L) ) {
                    	        alt57=1;
                    	    }
                    	    else if ( (LA57_0==ID) ) {
                    	        int LA57_2 = input.LA(2);

                    	        if ( (synpred79_Fan()) ) {
                    	            alt57=1;
                    	        }
                    	    }
                    	    switch (alt57) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: block
                    	            {
                    	            pushFollow(FOLLOW_block_in_fieldDef1732);
                    	            block172=block();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_block.add(block172.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
                    } while (true);

                    pushFollow(FOLLOW_bracketR_in_fieldDef1737);
                    bracketR173=bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketR.add(bracketR173.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:328:7: eos
                    {
                    pushFollow(FOLLOW_eos_in_fieldDef1746);
                    eos174=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos174.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: m, expr, typeId
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
            // 329:4: -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:329:7: ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_FIELD, "AST_FIELD"), root_1);

                adaptor.addChild(root_1, stream_typeId.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:329:26: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:329:26: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:329:46: ( expr )?
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
            if ( state.backtracking>0 ) { memoize(input, 43, fieldDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldDef"

    public static class typeId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:330:1: typeId : ( ( type id )=> typeAndId | fieldId ) ;
    public final FanParser.typeId_return typeId() throws RecognitionException {
        FanParser.typeId_return retval = new FanParser.typeId_return();
        retval.start = input.LT(1);
        int typeId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeAndId_return typeAndId175 = null;

        FanParser.fieldId_return fieldId176 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:9: ( ( ( type id )=> typeAndId | fieldId ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:11: ( ( type id )=> typeAndId | fieldId )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:330:11: ( ( type id )=> typeAndId | fieldId )
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:12: ( type id )=> typeAndId
                    {
                    pushFollow(FOLLOW_typeAndId_in_typeId1784);
                    typeAndId175=typeAndId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeAndId175.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:35: fieldId
                    {
                    pushFollow(FOLLOW_fieldId_in_typeId1788);
                    fieldId176=fieldId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldId176.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 44, typeId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeId"

    public static class fieldId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:331:1: fieldId : id ;
    public final FanParser.fieldId_return fieldId() throws RecognitionException {
        FanParser.fieldId_return retval = new FanParser.fieldId_return();
        retval.start = input.LT(1);
        int fieldId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id177 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:10: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:12: id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_fieldId1797);
            id177=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id177.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, fieldId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldId"

    public static class typeAndId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeAndId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:332:1: typeAndId : type id -> ^( id ) ^( AST_TYPE type ) ;
    public final FanParser.typeAndId_return typeAndId() throws RecognitionException {
        FanParser.typeAndId_return retval = new FanParser.typeAndId_return();
        retval.start = input.LT(1);
        int typeAndId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type178 = null;

        FanParser.id_return id179 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:11: ( type id -> ^( id ) ^( AST_TYPE type ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:13: type id
            {
            pushFollow(FOLLOW_type_in_typeAndId1804);
            type178=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type178.getTree());
            pushFollow(FOLLOW_id_in_typeAndId1806);
            id179=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id179.getTree());


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
            // 333:7: -> ^( id ) ^( AST_TYPE type )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:333:10: ^( id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_id.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:333:16: ^( AST_TYPE type )
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
            if ( state.backtracking>0 ) { memoize(input, 46, typeAndId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeAndId"

    public static class fieldFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:334:1: fieldFlags : ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* ;
    public final FanParser.fieldFlags_return fieldFlags() throws RecognitionException {
        FanParser.fieldFlags_return retval = new FanParser.fieldFlags_return();
        retval.start = input.LT(1);
        int fieldFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ABSTRACT180=null;
        Token KW_RD_ONLY181=null;
        Token KW_CONST182=null;
        Token KW_STATIC183=null;
        Token KW_NATIVE184=null;
        Token KW_VOLATILE185=null;
        Token KW_OVERRIDE186=null;
        Token KW_VIRTUAL187=null;
        Token KW_FINAL188=null;
        FanParser.protection_return protection189 = null;


        Object KW_ABSTRACT180_tree=null;
        Object KW_RD_ONLY181_tree=null;
        Object KW_CONST182_tree=null;
        Object KW_STATIC183_tree=null;
        Object KW_NATIVE184_tree=null;
        Object KW_VOLATILE185_tree=null;
        Object KW_OVERRIDE186_tree=null;
        Object KW_VIRTUAL187_tree=null;
        Object KW_FINAL188_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:12: ( ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:334:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            loop61:
            do {
                int alt61=11;
                switch ( input.LA(1) ) {
                case KW_ABSTRACT:
                    {
                    alt61=1;
                    }
                    break;
                case KW_RD_ONLY:
                    {
                    alt61=2;
                    }
                    break;
                case KW_CONST:
                    {
                    alt61=3;
                    }
                    break;
                case KW_STATIC:
                    {
                    alt61=4;
                    }
                    break;
                case KW_NATIVE:
                    {
                    alt61=5;
                    }
                    break;
                case KW_VOLATILE:
                    {
                    alt61=6;
                    }
                    break;
                case KW_OVERRIDE:
                    {
                    alt61=7;
                    }
                    break;
                case KW_VIRTUAL:
                    {
                    alt61=8;
                    }
                    break;
                case KW_FINAL:
                    {
                    alt61=9;
                    }
                    break;
                case KW_PRIVATE:
                case KW_PROTECTED:
                case KW_PUBLIC:
                case KW_INTERNAL:
                    {
                    alt61=10;
                    }
                    break;

                }

                switch (alt61) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:334:15: KW_ABSTRACT
            	    {
            	    KW_ABSTRACT180=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_fieldFlags1832); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_ABSTRACT180_tree = (Object)adaptor.create(KW_ABSTRACT180);
            	    adaptor.addChild(root_0, KW_ABSTRACT180_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:334:29: KW_RD_ONLY
            	    {
            	    KW_RD_ONLY181=(Token)match(input,KW_RD_ONLY,FOLLOW_KW_RD_ONLY_in_fieldFlags1836); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_RD_ONLY181_tree = (Object)adaptor.create(KW_RD_ONLY181);
            	    adaptor.addChild(root_0, KW_RD_ONLY181_tree);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:334:42: KW_CONST
            	    {
            	    KW_CONST182=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_fieldFlags1840); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_CONST182_tree = (Object)adaptor.create(KW_CONST182);
            	    adaptor.addChild(root_0, KW_CONST182_tree);
            	    }

            	    }
            	    break;
            	case 4 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:334:53: KW_STATIC
            	    {
            	    KW_STATIC183=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_fieldFlags1844); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_STATIC183_tree = (Object)adaptor.create(KW_STATIC183);
            	    adaptor.addChild(root_0, KW_STATIC183_tree);
            	    }

            	    }
            	    break;
            	case 5 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:334:65: KW_NATIVE
            	    {
            	    KW_NATIVE184=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_fieldFlags1848); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_NATIVE184_tree = (Object)adaptor.create(KW_NATIVE184);
            	    adaptor.addChild(root_0, KW_NATIVE184_tree);
            	    }

            	    }
            	    break;
            	case 6 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:334:77: KW_VOLATILE
            	    {
            	    KW_VOLATILE185=(Token)match(input,KW_VOLATILE,FOLLOW_KW_VOLATILE_in_fieldFlags1852); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VOLATILE185_tree = (Object)adaptor.create(KW_VOLATILE185);
            	    adaptor.addChild(root_0, KW_VOLATILE185_tree);
            	    }

            	    }
            	    break;
            	case 7 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:334:91: KW_OVERRIDE
            	    {
            	    KW_OVERRIDE186=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_fieldFlags1856); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_OVERRIDE186_tree = (Object)adaptor.create(KW_OVERRIDE186);
            	    adaptor.addChild(root_0, KW_OVERRIDE186_tree);
            	    }

            	    }
            	    break;
            	case 8 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:334:105: KW_VIRTUAL
            	    {
            	    KW_VIRTUAL187=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_fieldFlags1860); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VIRTUAL187_tree = (Object)adaptor.create(KW_VIRTUAL187);
            	    adaptor.addChild(root_0, KW_VIRTUAL187_tree);
            	    }

            	    }
            	    break;
            	case 9 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:334:118: KW_FINAL
            	    {
            	    KW_FINAL188=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_fieldFlags1864); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_FINAL188_tree = (Object)adaptor.create(KW_FINAL188);
            	    adaptor.addChild(root_0, KW_FINAL188_tree);
            	    }

            	    }
            	    break;
            	case 10 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:334:129: protection
            	    {
            	    pushFollow(FOLLOW_protection_in_fieldFlags1868);
            	    protection189=protection();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection189.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
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
            if ( state.backtracking>0 ) { memoize(input, 47, fieldFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldFlags"

    public static class methodDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:335:1: methodDef : docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody -> ^( AST_METHOD ^( $mname) ^( AST_TYPE $returnType) ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? ) ;
    public final FanParser.methodDef_return methodDef() throws RecognitionException {
        FanParser.methodDef_return retval = new FanParser.methodDef_return();
        retval.start = input.LT(1);
        int methodDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.methodFlags_return m = null;

        FanParser.type_return returnType = null;

        FanParser.id_return mname = null;

        FanParser.docs_return docs190 = null;

        FanParser.facet_return facet191 = null;

        FanParser.parL_return parL192 = null;

        FanParser.params_return params193 = null;

        FanParser.parR_return parR194 = null;

        FanParser.methodBody_return methodBody195 = null;


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
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:336:3: ( docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody -> ^( AST_METHOD ^( $mname) ^( AST_TYPE $returnType) ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:336:5: docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody
            {
            pushFollow(FOLLOW_docs_in_methodDef1888);
            docs190=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs190.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:336:10: ( facet )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==AT) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_methodDef1890);
            	    facet191=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet191.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:336:18: (m= methodFlags )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=KW_STATIC && LA63_0<=KW_NATIVE)||(LA63_0>=KW_OVERRIDE && LA63_0<=KW_FINAL)||(LA63_0>=KW_ABSTRACT && LA63_0<=KW_INTERNAL)||LA63_0==KW_ONCE) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= methodFlags
            	    {
            	    pushFollow(FOLLOW_methodFlags_in_methodDef1895);
            	    m=methodFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_methodFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            pushFollow(FOLLOW_type_in_methodDef1900);
            returnType=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(returnType.getTree());
            pushFollow(FOLLOW_id_in_methodDef1906);
            mname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(mname.getTree());
            pushFollow(FOLLOW_parL_in_methodDef1908);
            parL192=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL192.getTree());
            pushFollow(FOLLOW_params_in_methodDef1910);
            params193=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_params.add(params193.getTree());
            pushFollow(FOLLOW_parR_in_methodDef1912);
            parR194=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR194.getTree());
            pushFollow(FOLLOW_methodBody_in_methodDef1914);
            methodBody195=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodBody.add(methodBody195.getTree());


            // AST REWRITE
            // elements: params, mname, returnType, m, methodBody
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
            // 337:7: -> ^( AST_METHOD ^( $mname) ^( AST_TYPE $returnType) ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:337:10: ^( AST_METHOD ^( $mname) ^( AST_TYPE $returnType) ( params )? ( ^( AST_MODIFIER $m) )* ( methodBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_METHOD, "AST_METHOD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:337:23: ^( $mname)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_mname.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:337:33: ^( AST_TYPE $returnType)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE, "AST_TYPE"), root_2);

                adaptor.addChild(root_2, stream_returnType.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:337:57: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:337:65: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:337:65: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:337:85: ( methodBody )?
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
            if ( state.backtracking>0 ) { memoize(input, 48, methodDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodDef"

    public static class methodFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:338:1: methodFlags : ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL );
    public final FanParser.methodFlags_return methodFlags() throws RecognitionException {
        FanParser.methodFlags_return retval = new FanParser.methodFlags_return();
        retval.start = input.LT(1);
        int methodFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_VIRTUAL197=null;
        Token KW_OVERRIDE198=null;
        Token KW_ABSTRACT199=null;
        Token KW_STATIC200=null;
        Token KW_ONCE201=null;
        Token KW_NATIVE202=null;
        Token KW_FINAL203=null;
        FanParser.protection_return protection196 = null;


        Object KW_VIRTUAL197_tree=null;
        Object KW_OVERRIDE198_tree=null;
        Object KW_ABSTRACT199_tree=null;
        Object KW_STATIC200_tree=null;
        Object KW_ONCE201_tree=null;
        Object KW_NATIVE202_tree=null;
        Object KW_FINAL203_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:338:13: ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL )
            int alt64=8;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt64=1;
                }
                break;
            case KW_VIRTUAL:
                {
                alt64=2;
                }
                break;
            case KW_OVERRIDE:
                {
                alt64=3;
                }
                break;
            case KW_ABSTRACT:
                {
                alt64=4;
                }
                break;
            case KW_STATIC:
                {
                alt64=5;
                }
                break;
            case KW_ONCE:
                {
                alt64=6;
                }
                break;
            case KW_NATIVE:
                {
                alt64=7;
                }
                break;
            case KW_FINAL:
                {
                alt64=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:338:15: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_methodFlags1960);
                    protection196=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection196.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:338:28: KW_VIRTUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_VIRTUAL197=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_methodFlags1964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_VIRTUAL197_tree = (Object)adaptor.create(KW_VIRTUAL197);
                    adaptor.addChild(root_0, KW_VIRTUAL197_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:338:41: KW_OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_OVERRIDE198=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_methodFlags1968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_OVERRIDE198_tree = (Object)adaptor.create(KW_OVERRIDE198);
                    adaptor.addChild(root_0, KW_OVERRIDE198_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:338:55: KW_ABSTRACT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ABSTRACT199=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_methodFlags1972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ABSTRACT199_tree = (Object)adaptor.create(KW_ABSTRACT199);
                    adaptor.addChild(root_0, KW_ABSTRACT199_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:338:69: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC200=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_methodFlags1976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC200_tree = (Object)adaptor.create(KW_STATIC200);
                    adaptor.addChild(root_0, KW_STATIC200_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:338:81: KW_ONCE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ONCE201=(Token)match(input,KW_ONCE,FOLLOW_KW_ONCE_in_methodFlags1980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ONCE201_tree = (Object)adaptor.create(KW_ONCE201);
                    adaptor.addChild(root_0, KW_ONCE201_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:339:5: KW_NATIVE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NATIVE202=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_methodFlags1988); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NATIVE202_tree = (Object)adaptor.create(KW_NATIVE202);
                    adaptor.addChild(root_0, KW_NATIVE202_tree);
                    }

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:339:17: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL203=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_methodFlags1992); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL203_tree = (Object)adaptor.create(KW_FINAL203);
                    adaptor.addChild(root_0, KW_FINAL203_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 49, methodFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodFlags"

    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "params"
    // src/net/colar/netbeans/fan/antlr/Fan.g:340:1: params : ( param ( SP_COMMA param )* )? ;
    public final FanParser.params_return params() throws RecognitionException {
        FanParser.params_return retval = new FanParser.params_return();
        retval.start = input.LT(1);
        int params_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA205=null;
        FanParser.param_return param204 = null;

        FanParser.param_return param206 = null;


        Object SP_COMMA205_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:9: ( ( param ( SP_COMMA param )* )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:11: ( param ( SP_COMMA param )* )?
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:340:11: ( param ( SP_COMMA param )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==SP_PIPE||LA66_0==ID||LA66_0==SQ_BRACKET_L) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:340:12: param ( SP_COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_params2001);
                    param204=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, param204.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:340:18: ( SP_COMMA param )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==SP_COMMA) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:340:19: SP_COMMA param
                    	    {
                    	    SP_COMMA205=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_params2004); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA205_tree = (Object)adaptor.create(SP_COMMA205);
                    	    adaptor.addChild(root_0, SP_COMMA205_tree);
                    	    }
                    	    pushFollow(FOLLOW_param_in_params2006);
                    	    param206=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, param206.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
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
            if ( state.backtracking>0 ) { memoize(input, 50, params_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "params"

    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // src/net/colar/netbeans/fan/antlr/Fan.g:341:1: param : ( type id ( AS_INIT_VAL expr )? ) -> ^( AST_PARAM ^( AST_TYPE type ) id ( AS_INIT_VAL expr )? ) ;
    public final FanParser.param_return param() throws RecognitionException {
        FanParser.param_return retval = new FanParser.param_return();
        retval.start = input.LT(1);
        int param_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL209=null;
        FanParser.type_return type207 = null;

        FanParser.id_return id208 = null;

        FanParser.expr_return expr210 = null;


        Object AS_INIT_VAL209_tree=null;
        RewriteRuleTokenStream stream_AS_INIT_VAL=new RewriteRuleTokenStream(adaptor,"token AS_INIT_VAL");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:341:9: ( ( type id ( AS_INIT_VAL expr )? ) -> ^( AST_PARAM ^( AST_TYPE type ) id ( AS_INIT_VAL expr )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:341:11: ( type id ( AS_INIT_VAL expr )? )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:341:11: ( type id ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:341:12: type id ( AS_INIT_VAL expr )?
            {
            pushFollow(FOLLOW_type_in_param2020);
            type207=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type207.getTree());
            pushFollow(FOLLOW_id_in_param2022);
            id208=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id208.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:341:20: ( AS_INIT_VAL expr )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==AS_INIT_VAL) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:341:21: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL209=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_param2025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL209);

                    pushFollow(FOLLOW_expr_in_param2027);
                    expr210=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr210.getTree());

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
            // 342:4: -> ^( AST_PARAM ^( AST_TYPE type ) id ( AS_INIT_VAL expr )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:342:7: ^( AST_PARAM ^( AST_TYPE type ) id ( AS_INIT_VAL expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_PARAM, "AST_PARAM"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:342:19: ^( AST_TYPE type )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE, "AST_TYPE"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_id.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:342:39: ( AS_INIT_VAL expr )?
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
            if ( state.backtracking>0 ) { memoize(input, 51, param_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "param"

    public static class methodBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:343:1: methodBody : ( ( multiStmt )=> multiStmt | eos ) ;
    public final FanParser.methodBody_return methodBody() throws RecognitionException {
        FanParser.methodBody_return retval = new FanParser.methodBody_return();
        retval.start = input.LT(1);
        int methodBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt211 = null;

        FanParser.eos_return eos212 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:12: ( ( ( multiStmt )=> multiStmt | eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:14: ( ( multiStmt )=> multiStmt | eos )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:343:14: ( ( multiStmt )=> multiStmt | eos )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==BRACKET_L) && (synpred105_Fan())) {
                alt68=1;
            }
            else if ( (LA68_0==EOF||(LA68_0>=KW_RD_ONLY && LA68_0<=KW_FINAL)||(LA68_0>=KW_ABSTRACT && LA68_0<=KW_ONCE)||LA68_0==BRACKET_R||LA68_0==SP_PIPE||LA68_0==SP_SEMI||LA68_0==ID||(LA68_0>=AT && LA68_0<=DOC)||LA68_0==SQ_BRACKET_L) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:343:15: ( multiStmt )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_methodBody2066);
                    multiStmt211=multiStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt211.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:343:40: eos
                    {
                    pushFollow(FOLLOW_eos_in_methodBody2070);
                    eos212=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos212.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 52, methodBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodBody"

    public static class ctorDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:344:1: ctorDef : docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody -> ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? ) ;
    public final FanParser.ctorDef_return ctorDef() throws RecognitionException {
        FanParser.ctorDef_return retval = new FanParser.ctorDef_return();
        retval.start = input.LT(1);
        int ctorDef_StartIndex = input.index();
        Object root_0 = null;

        Token cchain=null;
        Token KW_NEW215=null;
        FanParser.ctorFlags_return m = null;

        FanParser.id_return cname = null;

        FanParser.docs_return docs213 = null;

        FanParser.facet_return facet214 = null;

        FanParser.parL_return parL216 = null;

        FanParser.params_return params217 = null;

        FanParser.parR_return parR218 = null;

        FanParser.ctorChain_return ctorChain219 = null;

        FanParser.methodBody_return methodBody220 = null;


        Object cchain_tree=null;
        Object KW_NEW215_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:3: ( docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody -> ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:5: docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody
            {
            pushFollow(FOLLOW_docs_in_ctorDef2090);
            docs213=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs213.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:10: ( facet )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==AT) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_ctorDef2092);
            	    facet214=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet214.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:345:18: (m= ctorFlags )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( ((LA70_0>=KW_PRIVATE && LA70_0<=KW_INTERNAL)) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= ctorFlags
            	    {
            	    pushFollow(FOLLOW_ctorFlags_in_ctorDef2097);
            	    m=ctorFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ctorFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            KW_NEW215=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_ctorDef2100); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_NEW.add(KW_NEW215);

            pushFollow(FOLLOW_id_in_ctorDef2104);
            cname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(cname.getTree());
            pushFollow(FOLLOW_parL_in_ctorDef2106);
            parL216=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL216.getTree());
            pushFollow(FOLLOW_params_in_ctorDef2108);
            params217=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_params.add(params217.getTree());
            pushFollow(FOLLOW_parR_in_ctorDef2110);
            parR218=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR218.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:69: (cchain= ( ( SP_COLON )=> ctorChain ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==SP_COLON) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: cchain= ( ( SP_COLON )=> ctorChain )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:345:70: ( ( SP_COLON )=> ctorChain )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:345:71: ( SP_COLON )=> ctorChain
                    {
                    pushFollow(FOLLOW_ctorChain_in_ctorDef2119);
                    ctorChain219=ctorChain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ctorChain.add(ctorChain219.getTree());

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_ctorDef2123);
            methodBody220=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodBody.add(methodBody220.getTree());


            // AST REWRITE
            // elements: params, methodBody, cname, m, cchain
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
            // 346:7: -> ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:346:10: ^( AST_CONSTRUCTOR ^( $cname) ( params )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ( methodBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CONSTRUCTOR, "AST_CONSTRUCTOR"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:346:28: ^( $cname)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_cname.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:346:38: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:346:46: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:346:46: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:346:66: ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )*
                while ( stream_cchain.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:346:66: ^( AST_CONSTRUCTOR_CHAIN $cchain)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CONSTRUCTOR_CHAIN, "AST_CONSTRUCTOR_CHAIN"), root_2);

                    adaptor.addChild(root_2, stream_cchain.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_cchain.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:346:100: ( methodBody )?
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
            if ( state.backtracking>0 ) { memoize(input, 53, ctorDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorDef"

    public static class ctorFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:347:1: ctorFlags : protection ;
    public final FanParser.ctorFlags_return ctorFlags() throws RecognitionException {
        FanParser.ctorFlags_return retval = new FanParser.ctorFlags_return();
        retval.start = input.LT(1);
        int ctorFlags_StartIndex = input.index();
        Object root_0 = null;

        FanParser.protection_return protection221 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:347:11: ( protection )
            // src/net/colar/netbeans/fan/antlr/Fan.g:347:13: protection
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_protection_in_ctorFlags2170);
            protection221=protection();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protection221.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, ctorFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorFlags"

    public static class ctorChain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:348:1: ctorChain : SP_COLON ( ctorChainThis | ctorChainSuper ) ;
    public final FanParser.ctorChain_return ctorChain() throws RecognitionException {
        FanParser.ctorChain_return retval = new FanParser.ctorChain_return();
        retval.start = input.LT(1);
        int ctorChain_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON222=null;
        FanParser.ctorChainThis_return ctorChainThis223 = null;

        FanParser.ctorChainSuper_return ctorChainSuper224 = null;


        Object SP_COLON222_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:11: ( SP_COLON ( ctorChainThis | ctorChainSuper ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:13: SP_COLON ( ctorChainThis | ctorChainSuper )
            {
            root_0 = (Object)adaptor.nil();

            SP_COLON222=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ctorChain2177); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON222_tree = (Object)adaptor.create(SP_COLON222);
            adaptor.addChild(root_0, SP_COLON222_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:22: ( ctorChainThis | ctorChainSuper )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==KW_THIS) ) {
                alt72=1;
            }
            else if ( (LA72_0==KW_SUPER) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:23: ctorChainThis
                    {
                    pushFollow(FOLLOW_ctorChainThis_in_ctorChain2180);
                    ctorChainThis223=ctorChainThis();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainThis223.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:39: ctorChainSuper
                    {
                    pushFollow(FOLLOW_ctorChainSuper_in_ctorChain2184);
                    ctorChainSuper224=ctorChainSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainSuper224.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 55, ctorChain_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChain"

    public static class ctorChainThis_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChainThis"
    // src/net/colar/netbeans/fan/antlr/Fan.g:350:1: ctorChainThis : KW_THIS DOT id parL ( args )? parR ;
    public final FanParser.ctorChainThis_return ctorChainThis() throws RecognitionException {
        FanParser.ctorChainThis_return retval = new FanParser.ctorChainThis_return();
        retval.start = input.LT(1);
        int ctorChainThis_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THIS225=null;
        Token DOT226=null;
        FanParser.id_return id227 = null;

        FanParser.parL_return parL228 = null;

        FanParser.args_return args229 = null;

        FanParser.parR_return parR230 = null;


        Object KW_THIS225_tree=null;
        Object DOT226_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:350:15: ( KW_THIS DOT id parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:350:17: KW_THIS DOT id parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_THIS225=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_ctorChainThis2193); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THIS225_tree = (Object)adaptor.create(KW_THIS225);
            adaptor.addChild(root_0, KW_THIS225_tree);
            }
            DOT226=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainThis2195); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT226_tree = (Object)adaptor.create(DOT226);
            adaptor.addChild(root_0, DOT226_tree);
            }
            pushFollow(FOLLOW_id_in_ctorChainThis2197);
            id227=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id227.getTree());
            pushFollow(FOLLOW_parL_in_ctorChainThis2199);
            parL228=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL228.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:350:37: ( args )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=KW_THIS && LA73_0<=KW_SUPER)||(LA73_0>=KW_NULL && LA73_0<=KW_FALSE)||LA73_0==SP_PIPE||LA73_0==OP_CURRY||(LA73_0>=OP_PLUS && LA73_0<=OP_MULTI)||(LA73_0>=OP_BANG && LA73_0<=OP_TILDA)||(LA73_0>=ID && LA73_0<=AT)||(LA73_0>=NUMBER && LA73_0<=SQ_BRACKET_L)||LA73_0==PAR_L) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainThis2201);
                    args229=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args229.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainThis2204);
            parR230=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR230.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, ctorChainThis_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChainThis"

    public static class ctorChainSuper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChainSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:351:1: ctorChainSuper : KW_SUPER ( DOT id )? parL ( args )? parR ;
    public final FanParser.ctorChainSuper_return ctorChainSuper() throws RecognitionException {
        FanParser.ctorChainSuper_return retval = new FanParser.ctorChainSuper_return();
        retval.start = input.LT(1);
        int ctorChainSuper_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SUPER231=null;
        Token DOT232=null;
        FanParser.id_return id233 = null;

        FanParser.parL_return parL234 = null;

        FanParser.args_return args235 = null;

        FanParser.parR_return parR236 = null;


        Object KW_SUPER231_tree=null;
        Object DOT232_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:16: ( KW_SUPER ( DOT id )? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:18: KW_SUPER ( DOT id )? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_SUPER231=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_ctorChainSuper2211); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SUPER231_tree = (Object)adaptor.create(KW_SUPER231);
            adaptor.addChild(root_0, KW_SUPER231_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:27: ( DOT id )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==DOT) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:351:28: DOT id
                    {
                    DOT232=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainSuper2214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT232_tree = (Object)adaptor.create(DOT232);
                    adaptor.addChild(root_0, DOT232_tree);
                    }
                    pushFollow(FOLLOW_id_in_ctorChainSuper2216);
                    id233=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id233.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parL_in_ctorChainSuper2220);
            parL234=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL234.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:42: ( args )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=KW_THIS && LA75_0<=KW_SUPER)||(LA75_0>=KW_NULL && LA75_0<=KW_FALSE)||LA75_0==SP_PIPE||LA75_0==OP_CURRY||(LA75_0>=OP_PLUS && LA75_0<=OP_MULTI)||(LA75_0>=OP_BANG && LA75_0<=OP_TILDA)||(LA75_0>=ID && LA75_0<=AT)||(LA75_0>=NUMBER && LA75_0<=SQ_BRACKET_L)||LA75_0==PAR_L) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainSuper2222);
                    args235=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args235.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainSuper2225);
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
            if ( state.backtracking>0 ) { memoize(input, 57, ctorChainSuper_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChainSuper"

    public static class staticBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:353:1: staticBlock : KW_STATIC block ;
    public final FanParser.staticBlock_return staticBlock() throws RecognitionException {
        FanParser.staticBlock_return retval = new FanParser.staticBlock_return();
        retval.start = input.LT(1);
        int staticBlock_StartIndex = input.index();
        Object root_0 = null;

        Token KW_STATIC237=null;
        FanParser.block_return block238 = null;


        Object KW_STATIC237_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:13: ( KW_STATIC block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:15: KW_STATIC block
            {
            root_0 = (Object)adaptor.nil();

            KW_STATIC237=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_staticBlock2233); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_STATIC237_tree = (Object)adaptor.create(KW_STATIC237);
            adaptor.addChild(root_0, KW_STATIC237_tree);
            }
            pushFollow(FOLLOW_block_in_staticBlock2235);
            block238=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block238.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, staticBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticBlock"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // src/net/colar/netbeans/fan/antlr/Fan.g:354:1: block : ( ( bracketL )=> multiStmt | stmt ) ;
    public final FanParser.block_return block() throws RecognitionException {
        FanParser.block_return retval = new FanParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt239 = null;

        FanParser.stmt_return stmt240 = null;



        paraphrase.push("Block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:3: ( ( ( bracketL )=> multiStmt | stmt ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:5: ( ( bracketL )=> multiStmt | stmt )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:355:5: ( ( bracketL )=> multiStmt | stmt )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==BRACKET_L) && (synpred114_Fan())) {
                alt76=1;
            }
            else if ( ((LA76_0>=KW_BREAK && LA76_0<=KW_TRY)||(LA76_0>=KW_THIS && LA76_0<=KW_SUPER)||(LA76_0>=KW_NULL && LA76_0<=KW_FALSE)||LA76_0==SP_PIPE||LA76_0==OP_CURRY||(LA76_0>=OP_PLUS && LA76_0<=OP_MULTI)||(LA76_0>=OP_BANG && LA76_0<=OP_TILDA)||(LA76_0>=ID && LA76_0<=AT)||(LA76_0>=NUMBER && LA76_0<=SQ_BRACKET_L)||LA76_0==PAR_L) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:355:6: ( bracketL )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_block2260);
                    multiStmt239=multiStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt239.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:355:30: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_block2264);
                    stmt240=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt240.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 59, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class multiStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:356:1: multiStmt : bracketL ( stmt )* bracketR -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR ) ;
    public final FanParser.multiStmt_return multiStmt() throws RecognitionException {
        FanParser.multiStmt_return retval = new FanParser.multiStmt_return();
        retval.start = input.LT(1);
        int multiStmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL241 = null;

        FanParser.stmt_return stmt242 = null;

        FanParser.bracketR_return bracketR243 = null;


        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:11: ( bracketL ( stmt )* bracketR -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:13: bracketL ( stmt )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_multiStmt2272);
            bracketL241=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL241.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:356:22: ( stmt )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=KW_BREAK && LA77_0<=KW_TRY)||(LA77_0>=KW_THIS && LA77_0<=KW_SUPER)||(LA77_0>=KW_NULL && LA77_0<=KW_FALSE)||LA77_0==SP_PIPE||LA77_0==OP_CURRY||(LA77_0>=OP_PLUS && LA77_0<=OP_MULTI)||(LA77_0>=OP_BANG && LA77_0<=OP_TILDA)||(LA77_0>=ID && LA77_0<=AT)||(LA77_0>=NUMBER && LA77_0<=SQ_BRACKET_L)||LA77_0==PAR_L) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_multiStmt2274);
            	    stmt242=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt242.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_multiStmt2277);
            bracketR243=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR243.getTree());


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
            // 356:37: -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:356:40: ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:356:66: ( ( stmt )* )?
                if ( stream_stmt.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:356:67: ( stmt )*
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
            if ( state.backtracking>0 ) { memoize(input, 60, multiStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiStmt"

    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:357:1: stmt : ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) ;
    public final FanParser.stmt_return stmt() throws RecognitionException {
        FanParser.stmt_return retval = new FanParser.stmt_return();
        retval.start = input.LT(1);
        int stmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.g_if_return g_if244 = null;

        FanParser.g_for_return g_for245 = null;

        FanParser.g_while_return g_while246 = null;

        FanParser.g_break_return g_break247 = null;

        FanParser.g_continue_return g_continue248 = null;

        FanParser.g_return_return g_return249 = null;

        FanParser.g_switch_return g_switch250 = null;

        FanParser.g_throw_return g_throw251 = null;

        FanParser.g_try_return g_try252 = null;

        FanParser.exprStmt_return exprStmt253 = null;

        FanParser.localDef_return localDef254 = null;



        paraphrase.push("Statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:3: ( ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:359:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            int alt78=11;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:359:6: g_if
                    {
                    pushFollow(FOLLOW_g_if_in_stmt2312);
                    g_if244=g_if();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_if244.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:359:13: g_for
                    {
                    pushFollow(FOLLOW_g_for_in_stmt2316);
                    g_for245=g_for();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_for245.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:359:21: g_while
                    {
                    pushFollow(FOLLOW_g_while_in_stmt2320);
                    g_while246=g_while();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_while246.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:359:31: g_break
                    {
                    pushFollow(FOLLOW_g_break_in_stmt2324);
                    g_break247=g_break();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_break247.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:4: g_continue
                    {
                    pushFollow(FOLLOW_g_continue_in_stmt2331);
                    g_continue248=g_continue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_continue248.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:17: g_return
                    {
                    pushFollow(FOLLOW_g_return_in_stmt2335);
                    g_return249=g_return();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_return249.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:360:28: g_switch
                    {
                    pushFollow(FOLLOW_g_switch_in_stmt2339);
                    g_switch250=g_switch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_switch250.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:361:4: g_throw
                    {
                    pushFollow(FOLLOW_g_throw_in_stmt2346);
                    g_throw251=g_throw();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_throw251.getTree());

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:361:14: g_try
                    {
                    pushFollow(FOLLOW_g_try_in_stmt2350);
                    g_try252=g_try();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_try252.getTree());

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:361:22: exprStmt
                    {
                    pushFollow(FOLLOW_exprStmt_in_stmt2354);
                    exprStmt253=exprStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprStmt253.getTree());

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:361:33: localDef
                    {
                    pushFollow(FOLLOW_localDef_in_stmt2358);
                    localDef254=localDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localDef254.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 61, stmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmt"

    public static class stmtList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtList"
    // src/net/colar/netbeans/fan/antlr/Fan.g:363:1: stmtList : s= ( ( stmt )* ) -> ^( AST_CODE_BLOCK ( $s)? ) ;
    public final FanParser.stmtList_return stmtList() throws RecognitionException {
        FanParser.stmtList_return retval = new FanParser.stmtList_return();
        retval.start = input.LT(1);
        int stmtList_StartIndex = input.index();
        Object root_0 = null;

        Token s=null;
        FanParser.stmt_return stmt255 = null;


        Object s_tree=null;
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:10: (s= ( ( stmt )* ) -> ^( AST_CODE_BLOCK ( $s)? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:12: s= ( ( stmt )* )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:14: ( ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:15: ( stmt )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:15: ( stmt )*
            loop79:
            do {
                int alt79=2;
                alt79 = dfa79.predict(input);
                switch (alt79) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmtList2371);
            	    stmt255=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt255.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
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
            // 363:22: -> ^( AST_CODE_BLOCK ( $s)? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:363:25: ^( AST_CODE_BLOCK ( $s)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:363:42: ( $s)?
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
            if ( state.backtracking>0 ) { memoize(input, 62, stmtList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtList"

    public static class g_break_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_break"
    // src/net/colar/netbeans/fan/antlr/Fan.g:369:1: g_break : KW_BREAK eos ;
    public final FanParser.g_break_return g_break() throws RecognitionException {
        FanParser.g_break_return retval = new FanParser.g_break_return();
        retval.start = input.LT(1);
        int g_break_StartIndex = input.index();
        Object root_0 = null;

        Token KW_BREAK256=null;
        FanParser.eos_return eos257 = null;


        Object KW_BREAK256_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:10: ( KW_BREAK eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:12: KW_BREAK eos
            {
            root_0 = (Object)adaptor.nil();

            KW_BREAK256=(Token)match(input,KW_BREAK,FOLLOW_KW_BREAK_in_g_break2393); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_BREAK256_tree = (Object)adaptor.create(KW_BREAK256);
            adaptor.addChild(root_0, KW_BREAK256_tree);
            }
            pushFollow(FOLLOW_eos_in_g_break2395);
            eos257=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos257.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, g_break_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_break"

    public static class g_continue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_continue"
    // src/net/colar/netbeans/fan/antlr/Fan.g:370:1: g_continue : KW_CONTINUE eos ;
    public final FanParser.g_continue_return g_continue() throws RecognitionException {
        FanParser.g_continue_return retval = new FanParser.g_continue_return();
        retval.start = input.LT(1);
        int g_continue_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CONTINUE258=null;
        FanParser.eos_return eos259 = null;


        Object KW_CONTINUE258_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:370:12: ( KW_CONTINUE eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:370:14: KW_CONTINUE eos
            {
            root_0 = (Object)adaptor.nil();

            KW_CONTINUE258=(Token)match(input,KW_CONTINUE,FOLLOW_KW_CONTINUE_in_g_continue2402); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CONTINUE258_tree = (Object)adaptor.create(KW_CONTINUE258);
            adaptor.addChild(root_0, KW_CONTINUE258_tree);
            }
            pushFollow(FOLLOW_eos_in_g_continue2404);
            eos259=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos259.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, g_continue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_continue"

    public static class g_for_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_for"
    // src/net/colar/netbeans/fan/antlr/Fan.g:371:1: g_for : KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ;
    public final FanParser.g_for_return g_for() throws RecognitionException {
        FanParser.g_for_return retval = new FanParser.g_for_return();
        retval.start = input.LT(1);
        int g_for_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FOR260=null;
        Token SP_SEMI263=null;
        Token SP_SEMI265=null;
        FanParser.parL_return parL261 = null;

        FanParser.forInit_return forInit262 = null;

        FanParser.expr_return expr264 = null;

        FanParser.expr_return expr266 = null;

        FanParser.parR_return parR267 = null;

        FanParser.block_return block268 = null;


        Object KW_FOR260_tree=null;
        Object SP_SEMI263_tree=null;
        Object SP_SEMI265_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:8: ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:10: KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block
            {
            root_0 = (Object)adaptor.nil();

            KW_FOR260=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_g_for2412); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_FOR260_tree = (Object)adaptor.create(KW_FOR260);
            adaptor.addChild(root_0, KW_FOR260_tree);
            }
            pushFollow(FOLLOW_parL_in_g_for2414);
            parL261=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL261.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:22: ( forInit )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=KW_THIS && LA80_0<=KW_SUPER)||(LA80_0>=KW_NULL && LA80_0<=KW_FALSE)||LA80_0==SP_PIPE||LA80_0==OP_CURRY||(LA80_0>=OP_PLUS && LA80_0<=OP_MULTI)||(LA80_0>=OP_BANG && LA80_0<=OP_TILDA)||(LA80_0>=ID && LA80_0<=AT)||(LA80_0>=NUMBER && LA80_0<=SQ_BRACKET_L)||LA80_0==PAR_L) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_g_for2416);
                    forInit262=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit262.getTree());

                    }
                    break;

            }

            SP_SEMI263=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for2419); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_SEMI263_tree = (Object)adaptor.create(SP_SEMI263);
            adaptor.addChild(root_0, SP_SEMI263_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:39: ( expr )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=KW_THIS && LA81_0<=KW_SUPER)||(LA81_0>=KW_NULL && LA81_0<=KW_FALSE)||LA81_0==SP_PIPE||LA81_0==OP_CURRY||(LA81_0>=OP_PLUS && LA81_0<=OP_MULTI)||(LA81_0>=OP_BANG && LA81_0<=OP_TILDA)||(LA81_0>=ID && LA81_0<=AT)||(LA81_0>=NUMBER && LA81_0<=SQ_BRACKET_L)||LA81_0==PAR_L) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for2421);
                    expr264=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr264.getTree());

                    }
                    break;

            }

            SP_SEMI265=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for2424); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_SEMI265_tree = (Object)adaptor.create(SP_SEMI265);
            adaptor.addChild(root_0, SP_SEMI265_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:53: ( expr )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=KW_THIS && LA82_0<=KW_SUPER)||(LA82_0>=KW_NULL && LA82_0<=KW_FALSE)||LA82_0==SP_PIPE||LA82_0==OP_CURRY||(LA82_0>=OP_PLUS && LA82_0<=OP_MULTI)||(LA82_0>=OP_BANG && LA82_0<=OP_TILDA)||(LA82_0>=ID && LA82_0<=AT)||(LA82_0>=NUMBER && LA82_0<=SQ_BRACKET_L)||LA82_0==PAR_L) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for2426);
                    expr266=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr266.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_g_for2429);
            parR267=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR267.getTree());
            pushFollow(FOLLOW_block_in_g_for2432);
            block268=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block268.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, g_for_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_for"

    public static class g_if_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_if"
    // src/net/colar/netbeans/fan/antlr/Fan.g:372:1: g_if : KW_IF parL expr parR block ( KW_ELSE block )? ;
    public final FanParser.g_if_return g_if() throws RecognitionException {
        FanParser.g_if_return retval = new FanParser.g_if_return();
        retval.start = input.LT(1);
        int g_if_StartIndex = input.index();
        Object root_0 = null;

        Token KW_IF269=null;
        Token KW_ELSE274=null;
        FanParser.parL_return parL270 = null;

        FanParser.expr_return expr271 = null;

        FanParser.parR_return parR272 = null;

        FanParser.block_return block273 = null;

        FanParser.block_return block275 = null;


        Object KW_IF269_tree=null;
        Object KW_ELSE274_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:7: ( KW_IF parL expr parR block ( KW_ELSE block )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:9: KW_IF parL expr parR block ( KW_ELSE block )?
            {
            root_0 = (Object)adaptor.nil();

            KW_IF269=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_g_if2440); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_IF269_tree = (Object)adaptor.create(KW_IF269);
            adaptor.addChild(root_0, KW_IF269_tree);
            }
            pushFollow(FOLLOW_parL_in_g_if2442);
            parL270=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL270.getTree());
            pushFollow(FOLLOW_expr_in_g_if2444);
            expr271=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr271.getTree());
            pushFollow(FOLLOW_parR_in_g_if2446);
            parR272=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR272.getTree());
            pushFollow(FOLLOW_block_in_g_if2448);
            block273=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block273.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:5: ( KW_ELSE block )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==KW_ELSE) ) {
                int LA83_1 = input.LA(2);

                if ( (synpred130_Fan()) ) {
                    alt83=1;
                }
            }
            switch (alt83) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:373:6: KW_ELSE block
                    {
                    KW_ELSE274=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_g_if2455); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ELSE274_tree = (Object)adaptor.create(KW_ELSE274);
                    adaptor.addChild(root_0, KW_ELSE274_tree);
                    }
                    pushFollow(FOLLOW_block_in_g_if2457);
                    block275=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block275.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 66, g_if_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_if"

    public static class g_return_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_return"
    // src/net/colar/netbeans/fan/antlr/Fan.g:374:1: g_return : KW_RETURN ( eos | expr eos ) ;
    public final FanParser.g_return_return g_return() throws RecognitionException {
        FanParser.g_return_return retval = new FanParser.g_return_return();
        retval.start = input.LT(1);
        int g_return_StartIndex = input.index();
        Object root_0 = null;

        Token KW_RETURN276=null;
        FanParser.eos_return eos277 = null;

        FanParser.expr_return expr278 = null;

        FanParser.eos_return eos279 = null;


        Object KW_RETURN276_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:374:10: ( KW_RETURN ( eos | expr eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:374:12: KW_RETURN ( eos | expr eos )
            {
            root_0 = (Object)adaptor.nil();

            KW_RETURN276=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_g_return2466); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_RETURN276_tree = (Object)adaptor.create(KW_RETURN276);
            adaptor.addChild(root_0, KW_RETURN276_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:374:22: ( eos | expr eos )
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:374:23: eos
                    {
                    pushFollow(FOLLOW_eos_in_g_return2469);
                    eos277=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos277.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:374:29: expr eos
                    {
                    pushFollow(FOLLOW_expr_in_g_return2473);
                    expr278=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr278.getTree());
                    pushFollow(FOLLOW_eos_in_g_return2475);
                    eos279=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos279.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 67, g_return_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_return"

    public static class g_switch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_switch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:375:1: g_switch : KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR ;
    public final FanParser.g_switch_return g_switch() throws RecognitionException {
        FanParser.g_switch_return retval = new FanParser.g_switch_return();
        retval.start = input.LT(1);
        int g_switch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SWITCH280=null;
        FanParser.parL_return parL281 = null;

        FanParser.expr_return expr282 = null;

        FanParser.parR_return parR283 = null;

        FanParser.bracketL_return bracketL284 = null;

        FanParser.g_case_return g_case285 = null;

        FanParser.g_default_return g_default286 = null;

        FanParser.bracketR_return bracketR287 = null;


        Object KW_SWITCH280_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:375:10: ( KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:375:12: KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR
            {
            root_0 = (Object)adaptor.nil();

            KW_SWITCH280=(Token)match(input,KW_SWITCH,FOLLOW_KW_SWITCH_in_g_switch2483); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SWITCH280_tree = (Object)adaptor.create(KW_SWITCH280);
            adaptor.addChild(root_0, KW_SWITCH280_tree);
            }
            pushFollow(FOLLOW_parL_in_g_switch2485);
            parL281=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL281.getTree());
            pushFollow(FOLLOW_expr_in_g_switch2487);
            expr282=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr282.getTree());
            pushFollow(FOLLOW_parR_in_g_switch2489);
            parR283=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR283.getTree());
            pushFollow(FOLLOW_bracketL_in_g_switch2491);
            bracketL284=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL284.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:375:46: ( g_case )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==KW_CASE) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:375:47: g_case
            	    {
            	    pushFollow(FOLLOW_g_case_in_g_switch2494);
            	    g_case285=g_case();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_case285.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:375:56: ( g_default )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==KW_DEFAULT) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:375:57: g_default
                    {
                    pushFollow(FOLLOW_g_default_in_g_switch2499);
                    g_default286=g_default();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_default286.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_bracketR_in_g_switch2503);
            bracketR287=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR287.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, g_switch_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_switch"

    public static class g_throw_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_throw"
    // src/net/colar/netbeans/fan/antlr/Fan.g:376:1: g_throw : KW_THROW expr eos ;
    public final FanParser.g_throw_return g_throw() throws RecognitionException {
        FanParser.g_throw_return retval = new FanParser.g_throw_return();
        retval.start = input.LT(1);
        int g_throw_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THROW288=null;
        FanParser.expr_return expr289 = null;

        FanParser.eos_return eos290 = null;


        Object KW_THROW288_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:10: ( KW_THROW expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:12: KW_THROW expr eos
            {
            root_0 = (Object)adaptor.nil();

            KW_THROW288=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_g_throw2511); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THROW288_tree = (Object)adaptor.create(KW_THROW288);
            adaptor.addChild(root_0, KW_THROW288_tree);
            }
            pushFollow(FOLLOW_expr_in_g_throw2513);
            expr289=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr289.getTree());
            pushFollow(FOLLOW_eos_in_g_throw2515);
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
            if ( state.backtracking>0 ) { memoize(input, 69, g_throw_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_throw"

    public static class g_while_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_while"
    // src/net/colar/netbeans/fan/antlr/Fan.g:377:1: g_while : KW_WHILE parL expr parR block ;
    public final FanParser.g_while_return g_while() throws RecognitionException {
        FanParser.g_while_return retval = new FanParser.g_while_return();
        retval.start = input.LT(1);
        int g_while_StartIndex = input.index();
        Object root_0 = null;

        Token KW_WHILE291=null;
        FanParser.parL_return parL292 = null;

        FanParser.expr_return expr293 = null;

        FanParser.parR_return parR294 = null;

        FanParser.block_return block295 = null;


        Object KW_WHILE291_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:10: ( KW_WHILE parL expr parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:12: KW_WHILE parL expr parR block
            {
            root_0 = (Object)adaptor.nil();

            KW_WHILE291=(Token)match(input,KW_WHILE,FOLLOW_KW_WHILE_in_g_while2523); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_WHILE291_tree = (Object)adaptor.create(KW_WHILE291);
            adaptor.addChild(root_0, KW_WHILE291_tree);
            }
            pushFollow(FOLLOW_parL_in_g_while2525);
            parL292=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL292.getTree());
            pushFollow(FOLLOW_expr_in_g_while2527);
            expr293=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr293.getTree());
            pushFollow(FOLLOW_parR_in_g_while2529);
            parR294=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR294.getTree());
            pushFollow(FOLLOW_block_in_g_while2531);
            block295=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block295.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, g_while_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_while"

    public static class g_try_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_try"
    // src/net/colar/netbeans/fan/antlr/Fan.g:378:1: g_try : KW_TRY ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? ;
    public final FanParser.g_try_return g_try() throws RecognitionException {
        FanParser.g_try_return retval = new FanParser.g_try_return();
        retval.start = input.LT(1);
        int g_try_StartIndex = input.index();
        Object root_0 = null;

        Token KW_TRY296=null;
        FanParser.try_long_return try_long297 = null;

        FanParser.stmtList_return stmtList298 = null;

        FanParser.g_catch_return g_catch299 = null;

        FanParser.g_finally_return g_finally300 = null;


        Object KW_TRY296_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:8: ( KW_TRY ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:10: KW_TRY ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )?
            {
            root_0 = (Object)adaptor.nil();

            KW_TRY296=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_g_try2539); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_TRY296_tree = (Object)adaptor.create(KW_TRY296);
            adaptor.addChild(root_0, KW_TRY296_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:17: ( ( bracketL )=> try_long | stmtList )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==BRACKET_L) && (synpred134_Fan())) {
                alt87=1;
            }
            else if ( (LA87_0==EOF||(LA87_0>=KW_BREAK && LA87_0<=KW_FINALLY)||(LA87_0>=KW_RD_ONLY && LA87_0<=KW_FINAL)||(LA87_0>=KW_ABSTRACT && LA87_0<=KW_ELSE)||(LA87_0>=KW_NULL && LA87_0<=KW_FALSE)||LA87_0==BRACKET_R||LA87_0==SP_COMMA||LA87_0==SP_PIPE||LA87_0==SP_SEMI||LA87_0==OP_CURRY||(LA87_0>=OP_PLUS && LA87_0<=OP_MULTI)||(LA87_0>=OP_BANG && LA87_0<=OP_TILDA)||(LA87_0>=ID && LA87_0<=SQ_BRACKET_L)||LA87_0==PAR_L) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:378:18: ( bracketL )=> try_long
                    {
                    pushFollow(FOLLOW_try_long_in_g_try2546);
                    try_long297=try_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_long297.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:378:41: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_try2550);
                    stmtList298=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList298.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:378:51: ( ( KW_CATCH )=> g_catch )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==KW_CATCH) ) {
                    int LA88_2 = input.LA(2);

                    if ( (synpred135_Fan()) ) {
                        alt88=1;
                    }


                }


                switch (alt88) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:378:52: ( KW_CATCH )=> g_catch
            	    {
            	    pushFollow(FOLLOW_g_catch_in_g_try2558);
            	    g_catch299=g_catch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_catch299.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:378:74: ( ( KW_FINALLY )=> g_finally )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==KW_FINALLY) ) {
                int LA89_1 = input.LA(2);

                if ( (synpred136_Fan()) ) {
                    alt89=1;
                }
            }
            switch (alt89) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:378:75: ( KW_FINALLY )=> g_finally
                    {
                    pushFollow(FOLLOW_g_finally_in_g_try2567);
                    g_finally300=g_finally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_finally300.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 71, g_try_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_try"

    public static class try_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "try_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:379:1: try_long : multiStmt ;
    public final FanParser.try_long_return try_long() throws RecognitionException {
        FanParser.try_long_return retval = new FanParser.try_long_return();
        retval.start = input.LT(1);
        int try_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt301 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:10: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:12: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_try_long2576);
            multiStmt301=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt301.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, try_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "try_long"

    public static class exprStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:380:1: exprStmt : expr eos ;
    public final FanParser.exprStmt_return exprStmt() throws RecognitionException {
        FanParser.exprStmt_return retval = new FanParser.exprStmt_return();
        retval.start = input.LT(1);
        int exprStmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.expr_return expr302 = null;

        FanParser.eos_return eos303 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:380:10: ( expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:380:12: expr eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprStmt2583);
            expr302=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr302.getTree());
            pushFollow(FOLLOW_eos_in_exprStmt2585);
            eos303=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos303.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, exprStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprStmt"

    public static class localDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:381:1: localDef : ( typeId ( AS_INIT_VAL expr )? eos ) -> ^( AST_LOCAL_DEF typeId ( AS_INIT_VAL expr )? ) ;
    public final FanParser.localDef_return localDef() throws RecognitionException {
        FanParser.localDef_return retval = new FanParser.localDef_return();
        retval.start = input.LT(1);
        int localDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL305=null;
        FanParser.typeId_return typeId304 = null;

        FanParser.expr_return expr306 = null;

        FanParser.eos_return eos307 = null;


        Object AS_INIT_VAL305_tree=null;
        RewriteRuleTokenStream stream_AS_INIT_VAL=new RewriteRuleTokenStream(adaptor,"token AS_INIT_VAL");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_typeId=new RewriteRuleSubtreeStream(adaptor,"rule typeId");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:10: ( ( typeId ( AS_INIT_VAL expr )? eos ) -> ^( AST_LOCAL_DEF typeId ( AS_INIT_VAL expr )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:12: ( typeId ( AS_INIT_VAL expr )? eos )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:12: ( typeId ( AS_INIT_VAL expr )? eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:13: typeId ( AS_INIT_VAL expr )? eos
            {
            pushFollow(FOLLOW_typeId_in_localDef2593);
            typeId304=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeId.add(typeId304.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:20: ( AS_INIT_VAL expr )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==AS_INIT_VAL) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:21: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL305=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_localDef2596); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL305);

                    pushFollow(FOLLOW_expr_in_localDef2598);
                    expr306=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr306.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_eos_in_localDef2602);
            eos307=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos307.getTree());

            }



            // AST REWRITE
            // elements: AS_INIT_VAL, expr, typeId
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 382:5: -> ^( AST_LOCAL_DEF typeId ( AS_INIT_VAL expr )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:382:8: ^( AST_LOCAL_DEF typeId ( AS_INIT_VAL expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_LOCAL_DEF, "AST_LOCAL_DEF"), root_1);

                adaptor.addChild(root_1, stream_typeId.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:382:31: ( AS_INIT_VAL expr )?
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
            if ( state.backtracking>0 ) { memoize(input, 74, localDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localDef"

    public static class forInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInit"
    // src/net/colar/netbeans/fan/antlr/Fan.g:383:1: forInit : ( forInitDef | expr );
    public final FanParser.forInit_return forInit() throws RecognitionException {
        FanParser.forInit_return retval = new FanParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        Object root_0 = null;

        FanParser.forInitDef_return forInitDef308 = null;

        FanParser.expr_return expr309 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:10: ( forInitDef | expr )
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:383:12: forInitDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forInitDef_in_forInit2630);
                    forInitDef308=forInitDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInitDef308.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:383:25: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_forInit2634);
                    expr309=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr309.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 75, forInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class forInitDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInitDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:384:1: forInitDef : typeId ( AS_INIT_VAL expr )? ;
    public final FanParser.forInitDef_return forInitDef() throws RecognitionException {
        FanParser.forInitDef_return retval = new FanParser.forInitDef_return();
        retval.start = input.LT(1);
        int forInitDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL311=null;
        FanParser.typeId_return typeId310 = null;

        FanParser.expr_return expr312 = null;


        Object AS_INIT_VAL311_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:12: ( typeId ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:14: typeId ( AS_INIT_VAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeId_in_forInitDef2641);
            typeId310=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId310.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:21: ( AS_INIT_VAL expr )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==AS_INIT_VAL) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:384:22: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL311=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_forInitDef2644); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_INIT_VAL311_tree = (Object)adaptor.create(AS_INIT_VAL311);
                    adaptor.addChild(root_0, AS_INIT_VAL311_tree);
                    }
                    pushFollow(FOLLOW_expr_in_forInitDef2646);
                    expr312=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr312.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 76, forInitDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInitDef"

    public static class g_catch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_catch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:386:1: g_catch : KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | stmtList ) ;
    public final FanParser.g_catch_return g_catch() throws RecognitionException {
        FanParser.g_catch_return retval = new FanParser.g_catch_return();
        retval.start = input.LT(1);
        int g_catch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CATCH313=null;
        FanParser.catchDef_return catchDef314 = null;

        FanParser.catch_long_return catch_long315 = null;

        FanParser.stmtList_return stmtList316 = null;


        Object KW_CATCH313_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:10: ( KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | stmtList ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:12: KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | stmtList )
            {
            root_0 = (Object)adaptor.nil();

            KW_CATCH313=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_g_catch2657); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CATCH313_tree = (Object)adaptor.create(KW_CATCH313);
            adaptor.addChild(root_0, KW_CATCH313_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:21: ( catchDef )?
            int alt93=2;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: catchDef
                    {
                    pushFollow(FOLLOW_catchDef_in_g_catch2659);
                    catchDef314=catchDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchDef314.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:386:31: ( ( bracketL )=> catch_long | stmtList )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==BRACKET_L) && (synpred141_Fan())) {
                alt94=1;
            }
            else if ( (LA94_0==EOF||(LA94_0>=KW_BREAK && LA94_0<=KW_FINALLY)||(LA94_0>=KW_RD_ONLY && LA94_0<=KW_FINAL)||(LA94_0>=KW_ABSTRACT && LA94_0<=KW_ELSE)||(LA94_0>=KW_NULL && LA94_0<=KW_FALSE)||LA94_0==BRACKET_R||LA94_0==SP_COMMA||LA94_0==SP_PIPE||LA94_0==SP_SEMI||LA94_0==OP_CURRY||(LA94_0>=OP_PLUS && LA94_0<=OP_MULTI)||(LA94_0>=OP_BANG && LA94_0<=OP_TILDA)||(LA94_0>=ID && LA94_0<=SQ_BRACKET_L)||LA94_0==PAR_L) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:386:32: ( bracketL )=> catch_long
                    {
                    pushFollow(FOLLOW_catch_long_in_g_catch2667);
                    catch_long315=catch_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catch_long315.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:386:57: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_catch2671);
                    stmtList316=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList316.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 77, g_catch_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_catch"

    public static class catch_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catch_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:387:1: catch_long : multiStmt ;
    public final FanParser.catch_long_return catch_long() throws RecognitionException {
        FanParser.catch_long_return retval = new FanParser.catch_long_return();
        retval.start = input.LT(1);
        int catch_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt317 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:12: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:14: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_catch_long2679);
            multiStmt317=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt317.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, catch_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catch_long"

    public static class catchDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:388:1: catchDef : parL type id parR ;
    public final FanParser.catchDef_return catchDef() throws RecognitionException {
        FanParser.catchDef_return retval = new FanParser.catchDef_return();
        retval.start = input.LT(1);
        int catchDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL318 = null;

        FanParser.type_return type319 = null;

        FanParser.id_return id320 = null;

        FanParser.parR_return parR321 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:388:11: ( parL type id parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:388:13: parL type id parR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parL_in_catchDef2687);
            parL318=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL318.getTree());
            pushFollow(FOLLOW_type_in_catchDef2689);
            type319=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type319.getTree());
            pushFollow(FOLLOW_id_in_catchDef2691);
            id320=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id320.getTree());
            pushFollow(FOLLOW_parR_in_catchDef2693);
            parR321=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR321.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, catchDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchDef"

    public static class g_finally_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_finally"
    // src/net/colar/netbeans/fan/antlr/Fan.g:390:1: g_finally : KW_FINALLY ( ( bracketL )=> finally_long | stmtList ) ;
    public final FanParser.g_finally_return g_finally() throws RecognitionException {
        FanParser.g_finally_return retval = new FanParser.g_finally_return();
        retval.start = input.LT(1);
        int g_finally_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FINALLY322=null;
        FanParser.finally_long_return finally_long323 = null;

        FanParser.stmtList_return stmtList324 = null;


        Object KW_FINALLY322_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:390:11: ( KW_FINALLY ( ( bracketL )=> finally_long | stmtList ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:390:13: KW_FINALLY ( ( bracketL )=> finally_long | stmtList )
            {
            root_0 = (Object)adaptor.nil();

            KW_FINALLY322=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_g_finally2701); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_FINALLY322_tree = (Object)adaptor.create(KW_FINALLY322);
            adaptor.addChild(root_0, KW_FINALLY322_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:390:24: ( ( bracketL )=> finally_long | stmtList )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==BRACKET_L) && (synpred142_Fan())) {
                alt95=1;
            }
            else if ( (LA95_0==EOF||(LA95_0>=KW_BREAK && LA95_0<=KW_FINALLY)||(LA95_0>=KW_RD_ONLY && LA95_0<=KW_FINAL)||(LA95_0>=KW_ABSTRACT && LA95_0<=KW_ELSE)||(LA95_0>=KW_NULL && LA95_0<=KW_FALSE)||LA95_0==BRACKET_R||LA95_0==SP_COMMA||LA95_0==SP_PIPE||LA95_0==SP_SEMI||LA95_0==OP_CURRY||(LA95_0>=OP_PLUS && LA95_0<=OP_MULTI)||(LA95_0>=OP_BANG && LA95_0<=OP_TILDA)||(LA95_0>=ID && LA95_0<=SQ_BRACKET_L)||LA95_0==PAR_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:25: ( bracketL )=> finally_long
                    {
                    pushFollow(FOLLOW_finally_long_in_g_finally2708);
                    finally_long323=finally_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, finally_long323.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:52: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_finally2712);
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
            if ( state.backtracking>0 ) { memoize(input, 80, g_finally_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_finally"

    public static class finally_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "finally_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:391:1: finally_long : multiStmt ;
    public final FanParser.finally_long_return finally_long() throws RecognitionException {
        FanParser.finally_long_return retval = new FanParser.finally_long_return();
        retval.start = input.LT(1);
        int finally_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt325 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:14: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:16: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_finally_long2720);
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
            if ( state.backtracking>0 ) { memoize(input, 81, finally_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "finally_long"

    public static class g_case_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_case"
    // src/net/colar/netbeans/fan/antlr/Fan.g:392:1: g_case : KW_CASE expr SP_COLON ( stmt )* ;
    public final FanParser.g_case_return g_case() throws RecognitionException {
        FanParser.g_case_return retval = new FanParser.g_case_return();
        retval.start = input.LT(1);
        int g_case_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CASE326=null;
        Token SP_COLON328=null;
        FanParser.expr_return expr327 = null;

        FanParser.stmt_return stmt329 = null;


        Object KW_CASE326_tree=null;
        Object SP_COLON328_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:9: ( KW_CASE expr SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:11: KW_CASE expr SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_CASE326=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_g_case2728); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CASE326_tree = (Object)adaptor.create(KW_CASE326);
            adaptor.addChild(root_0, KW_CASE326_tree);
            }
            pushFollow(FOLLOW_expr_in_g_case2730);
            expr327=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr327.getTree());
            SP_COLON328=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_case2732); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON328_tree = (Object)adaptor.create(SP_COLON328);
            adaptor.addChild(root_0, SP_COLON328_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:33: ( stmt )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( ((LA96_0>=KW_BREAK && LA96_0<=KW_TRY)||(LA96_0>=KW_THIS && LA96_0<=KW_SUPER)||(LA96_0>=KW_NULL && LA96_0<=KW_FALSE)||LA96_0==SP_PIPE||LA96_0==OP_CURRY||(LA96_0>=OP_PLUS && LA96_0<=OP_MULTI)||(LA96_0>=OP_BANG && LA96_0<=OP_TILDA)||(LA96_0>=ID && LA96_0<=AT)||(LA96_0>=NUMBER && LA96_0<=SQ_BRACKET_L)||LA96_0==PAR_L) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_case2734);
            	    stmt329=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt329.getTree());

            	    }
            	    break;

            	default :
            	    break loop96;
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
            if ( state.backtracking>0 ) { memoize(input, 82, g_case_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_case"

    public static class g_default_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_default"
    // src/net/colar/netbeans/fan/antlr/Fan.g:393:1: g_default : KW_DEFAULT SP_COLON ( stmt )* ;
    public final FanParser.g_default_return g_default() throws RecognitionException {
        FanParser.g_default_return retval = new FanParser.g_default_return();
        retval.start = input.LT(1);
        int g_default_StartIndex = input.index();
        Object root_0 = null;

        Token KW_DEFAULT330=null;
        Token SP_COLON331=null;
        FanParser.stmt_return stmt332 = null;


        Object KW_DEFAULT330_tree=null;
        Object SP_COLON331_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:11: ( KW_DEFAULT SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:13: KW_DEFAULT SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_DEFAULT330=(Token)match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_g_default2742); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_DEFAULT330_tree = (Object)adaptor.create(KW_DEFAULT330);
            adaptor.addChild(root_0, KW_DEFAULT330_tree);
            }
            SP_COLON331=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_default2744); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON331_tree = (Object)adaptor.create(SP_COLON331);
            adaptor.addChild(root_0, SP_COLON331_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:33: ( stmt )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=KW_BREAK && LA97_0<=KW_TRY)||(LA97_0>=KW_THIS && LA97_0<=KW_SUPER)||(LA97_0>=KW_NULL && LA97_0<=KW_FALSE)||LA97_0==SP_PIPE||LA97_0==OP_CURRY||(LA97_0>=OP_PLUS && LA97_0<=OP_MULTI)||(LA97_0>=OP_BANG && LA97_0<=OP_TILDA)||(LA97_0>=ID && LA97_0<=AT)||(LA97_0>=NUMBER && LA97_0<=SQ_BRACKET_L)||LA97_0==PAR_L) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_default2746);
            	    stmt332=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt332.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 83, g_default_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_default"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:396:1: expr : assignExpr ;
    public final FanParser.expr_return expr() throws RecognitionException {
        FanParser.expr_return retval = new FanParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.assignExpr_return assignExpr333 = null;



        paraphrase.push("Expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:3: ( assignExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:5: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr2767);
            assignExpr333=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr333.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 84, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class assignExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:399:1: assignExpr : ternaryExpr ( assignOp assignExpr )? ;
    public final FanParser.assignExpr_return assignExpr() throws RecognitionException {
        FanParser.assignExpr_return retval = new FanParser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.ternaryExpr_return ternaryExpr334 = null;

        FanParser.assignOp_return assignOp335 = null;

        FanParser.assignExpr_return assignExpr336 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:12: ( ternaryExpr ( assignOp assignExpr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:14: ternaryExpr ( assignOp assignExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2774);
            ternaryExpr334=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr334.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:26: ( assignOp assignExpr )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=AS_EQUAL && LA98_0<=AS_ASSIGN_OP)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:27: assignOp assignExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2777);
                    assignOp335=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp335.getTree());
                    pushFollow(FOLLOW_assignExpr_in_assignExpr2779);
                    assignExpr336=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr336.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 85, assignExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExpr"

    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:400:1: ternaryExpr : condOrExpr ( ternaryTail )? ;
    public final FanParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        FanParser.ternaryExpr_return retval = new FanParser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.condOrExpr_return condOrExpr337 = null;

        FanParser.ternaryTail_return ternaryTail338 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:13: ( condOrExpr ( ternaryTail )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:15: condOrExpr ( ternaryTail )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condOrExpr_in_ternaryExpr2788);
            condOrExpr337=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr337.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:26: ( ternaryTail )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==SP_QMARK) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:400:27: ternaryTail
                    {
                    pushFollow(FOLLOW_ternaryTail_in_ternaryExpr2791);
                    ternaryTail338=ternaryTail();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryTail338.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 86, ternaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"

    public static class ternaryTail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryTail"
    // src/net/colar/netbeans/fan/antlr/Fan.g:402:1: ternaryTail : SP_QMARK condOrExpr SP_COLON condOrExpr ;
    public final FanParser.ternaryTail_return ternaryTail() throws RecognitionException {
        FanParser.ternaryTail_return retval = new FanParser.ternaryTail_return();
        retval.start = input.LT(1);
        int ternaryTail_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK339=null;
        Token SP_COLON341=null;
        FanParser.condOrExpr_return condOrExpr340 = null;

        FanParser.condOrExpr_return condOrExpr342 = null;


        Object SP_QMARK339_tree=null;
        Object SP_COLON341_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:13: ( SP_QMARK condOrExpr SP_COLON condOrExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:15: SP_QMARK condOrExpr SP_COLON condOrExpr
            {
            root_0 = (Object)adaptor.nil();

            SP_QMARK339=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_ternaryTail2801); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_QMARK339_tree = (Object)adaptor.create(SP_QMARK339);
            adaptor.addChild(root_0, SP_QMARK339_tree);
            }
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail2803);
            condOrExpr340=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr340.getTree());
            SP_COLON341=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ternaryTail2805); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON341_tree = (Object)adaptor.create(SP_COLON341);
            adaptor.addChild(root_0, SP_COLON341_tree);
            }
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail2807);
            condOrExpr342=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr342.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, ternaryTail_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryTail"

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:403:1: assignOp : ( AS_EQUAL | AS_ASSIGN_OP );
    public final FanParser.assignOp_return assignOp() throws RecognitionException {
        FanParser.assignOp_return retval = new FanParser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token set343=null;

        Object set343_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:403:10: ( AS_EQUAL | AS_ASSIGN_OP )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            root_0 = (Object)adaptor.nil();

            set343=(Token)input.LT(1);
            if ( (input.LA(1)>=AS_EQUAL && input.LA(1)<=AS_ASSIGN_OP) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set343));
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
            if ( state.backtracking>0 ) { memoize(input, 88, assignOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignOp"

    public static class condOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:404:1: condOrExpr : condAndExpr ( OP_OR condAndExpr )* ;
    public final FanParser.condOrExpr_return condOrExpr() throws RecognitionException {
        FanParser.condOrExpr_return retval = new FanParser.condOrExpr_return();
        retval.start = input.LT(1);
        int condOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_OR345=null;
        FanParser.condAndExpr_return condAndExpr344 = null;

        FanParser.condAndExpr_return condAndExpr346 = null;


        Object OP_OR345_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:13: ( condAndExpr ( OP_OR condAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:15: condAndExpr ( OP_OR condAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condAndExpr_in_condOrExpr2826);
            condAndExpr344=condAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr344.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:28: ( OP_OR condAndExpr )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==OP_OR) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:404:29: OP_OR condAndExpr
            	    {
            	    OP_OR345=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_condOrExpr2830); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_OR345_tree = (Object)adaptor.create(OP_OR345);
            	    adaptor.addChild(root_0, OP_OR345_tree);
            	    }
            	    pushFollow(FOLLOW_condAndExpr_in_condOrExpr2833);
            	    condAndExpr346=condAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr346.getTree());

            	    }
            	    break;

            	default :
            	    break loop100;
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
            if ( state.backtracking>0 ) { memoize(input, 89, condOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condOrExpr"

    public static class condAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:405:1: condAndExpr : equalityExpr ( OP_AND equalityExpr )* ;
    public final FanParser.condAndExpr_return condAndExpr() throws RecognitionException {
        FanParser.condAndExpr_return retval = new FanParser.condAndExpr_return();
        retval.start = input.LT(1);
        int condAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_AND348=null;
        FanParser.equalityExpr_return equalityExpr347 = null;

        FanParser.equalityExpr_return equalityExpr349 = null;


        Object OP_AND348_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:14: ( equalityExpr ( OP_AND equalityExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:16: equalityExpr ( OP_AND equalityExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpr_in_condAndExpr2843);
            equalityExpr347=equalityExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr347.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:29: ( OP_AND equalityExpr )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==OP_AND) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:405:30: OP_AND equalityExpr
            	    {
            	    OP_AND348=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_condAndExpr2846); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_AND348_tree = (Object)adaptor.create(OP_AND348);
            	    adaptor.addChild(root_0, OP_AND348_tree);
            	    }
            	    pushFollow(FOLLOW_equalityExpr_in_condAndExpr2849);
            	    equalityExpr349=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr349.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 90, condAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condAndExpr"

    public static class equalityExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:406:1: equalityExpr : relationalExpr ( CP_EQUALITY relationalExpr )* ;
    public final FanParser.equalityExpr_return equalityExpr() throws RecognitionException {
        FanParser.equalityExpr_return retval = new FanParser.equalityExpr_return();
        retval.start = input.LT(1);
        int equalityExpr_StartIndex = input.index();
        Object root_0 = null;

        Token CP_EQUALITY351=null;
        FanParser.relationalExpr_return relationalExpr350 = null;

        FanParser.relationalExpr_return relationalExpr352 = null;


        Object CP_EQUALITY351_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:14: ( relationalExpr ( CP_EQUALITY relationalExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:16: relationalExpr ( CP_EQUALITY relationalExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpr_in_equalityExpr2859);
            relationalExpr350=relationalExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr350.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:31: ( CP_EQUALITY relationalExpr )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==CP_EQUALITY) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:406:32: CP_EQUALITY relationalExpr
            	    {
            	    CP_EQUALITY351=(Token)match(input,CP_EQUALITY,FOLLOW_CP_EQUALITY_in_equalityExpr2862); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_EQUALITY351_tree = (Object)adaptor.create(CP_EQUALITY351);
            	    adaptor.addChild(root_0, CP_EQUALITY351_tree);
            	    }
            	    pushFollow(FOLLOW_relationalExpr_in_equalityExpr2864);
            	    relationalExpr352=relationalExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr352.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 91, equalityExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpr"

    public static class relationalExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:408:1: relationalExpr : elvisExpr ( typeCheck | compare ) ;
    public final FanParser.relationalExpr_return relationalExpr() throws RecognitionException {
        FanParser.relationalExpr_return retval = new FanParser.relationalExpr_return();
        retval.start = input.LT(1);
        int relationalExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.elvisExpr_return elvisExpr353 = null;

        FanParser.typeCheck_return typeCheck354 = null;

        FanParser.compare_return compare355 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:16: ( elvisExpr ( typeCheck | compare ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:20: elvisExpr ( typeCheck | compare )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_elvisExpr_in_relationalExpr2877);
            elvisExpr353=elvisExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr353.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:30: ( typeCheck | compare )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==KW_AS||(LA103_0>=KW_IS && LA103_0<=KW_ISNOT)) ) {
                alt103=1;
            }
            else if ( (LA103_0==EOF||(LA103_0>=KW_BREAK && LA103_0<=KW_USING)||(LA103_0>=KW_RD_ONLY && LA103_0<=KW_FINAL)||(LA103_0>=KW_CLASS && LA103_0<=KW_ELSE)||(LA103_0>=KW_NULL && LA103_0<=KW_FALSE)||(LA103_0>=BRACKET_L && LA103_0<=BRACKET_R)||(LA103_0>=SP_COLON && LA103_0<=SP_QMARK)||LA103_0==SP_PIPE||(LA103_0>=SP_SEMI && LA103_0<=CP_COMPARATORS)||LA103_0==OP_CURRY||(LA103_0>=OP_PLUS && LA103_0<=OP_MULTI)||(LA103_0>=OP_BANG && LA103_0<=OP_TILDA)||(LA103_0>=ID && LA103_0<=PAR_R)) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:408:31: typeCheck
                    {
                    pushFollow(FOLLOW_typeCheck_in_relationalExpr2880);
                    typeCheck354=typeCheck();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeCheck354.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:408:43: compare
                    {
                    pushFollow(FOLLOW_compare_in_relationalExpr2884);
                    compare355=compare();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compare355.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 92, relationalExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpr"

    public static class typeCheck_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeCheck"
    // src/net/colar/netbeans/fan/antlr/Fan.g:410:1: typeCheck : ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* ;
    public final FanParser.typeCheck_return typeCheck() throws RecognitionException {
        FanParser.typeCheck_return retval = new FanParser.typeCheck_return();
        retval.start = input.LT(1);
        int typeCheck_StartIndex = input.index();
        Object root_0 = null;

        Token set356=null;
        Token SP_QMARK358=null;
        Token string_literal359=null;
        FanParser.typeRoot_return typeRoot357 = null;


        Object set356_tree=null;
        Object SP_QMARK358_tree=null;
        Object string_literal359_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:11: ( ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:15: ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )*
            {
            root_0 = (Object)adaptor.nil();

            set356=(Token)input.LT(1);
            if ( input.LA(1)==KW_AS||(input.LA(1)>=KW_IS && input.LA(1)<=KW_ISNOT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set356));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_typeRoot_in_typeCheck2907);
            typeRoot357=typeRoot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeRoot357.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:51: ( ( SP_QMARK )? {...}? '[]' )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:410:52: ( SP_QMARK )? {...}? '[]'
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:410:52: ( SP_QMARK )?
            	    int alt104=2;
            	    int LA104_0 = input.LA(1);

            	    if ( (LA104_0==SP_QMARK) ) {
            	        alt104=1;
            	    }
            	    switch (alt104) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK358=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_typeCheck2910); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK358_tree = (Object)adaptor.create(SP_QMARK358);
            	            adaptor.addChild(root_0, SP_QMARK358_tree);
            	            }

            	            }
            	            break;

            	    }

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "typeCheck", "notAfterEol()");
            	    }
            	    string_literal359=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_typeCheck2915); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal359_tree = (Object)adaptor.create(string_literal359);
            	    adaptor.addChild(root_0, string_literal359_tree);
            	    }

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
            if ( state.backtracking>0 ) { memoize(input, 93, typeCheck_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeCheck"

    public static class compare_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare"
    // src/net/colar/netbeans/fan/antlr/Fan.g:411:1: compare : ( CP_COMPARATORS elvisExpr )* ;
    public final FanParser.compare_return compare() throws RecognitionException {
        FanParser.compare_return retval = new FanParser.compare_return();
        retval.start = input.LT(1);
        int compare_StartIndex = input.index();
        Object root_0 = null;

        Token CP_COMPARATORS360=null;
        FanParser.elvisExpr_return elvisExpr361 = null;


        Object CP_COMPARATORS360_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:411:10: ( ( CP_COMPARATORS elvisExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:411:14: ( CP_COMPARATORS elvisExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:411:14: ( CP_COMPARATORS elvisExpr )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==CP_COMPARATORS) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:411:15: CP_COMPARATORS elvisExpr
            	    {
            	    CP_COMPARATORS360=(Token)match(input,CP_COMPARATORS,FOLLOW_CP_COMPARATORS_in_compare2928); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_COMPARATORS360_tree = (Object)adaptor.create(CP_COMPARATORS360);
            	    adaptor.addChild(root_0, CP_COMPARATORS360_tree);
            	    }
            	    pushFollow(FOLLOW_elvisExpr_in_compare2930);
            	    elvisExpr361=elvisExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr361.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 94, compare_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "compare"

    public static class elvisExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elvisExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:413:1: elvisExpr : rangeExpr ( OP_ELVIS rangeExpr )* ;
    public final FanParser.elvisExpr_return elvisExpr() throws RecognitionException {
        FanParser.elvisExpr_return retval = new FanParser.elvisExpr_return();
        retval.start = input.LT(1);
        int elvisExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ELVIS363=null;
        FanParser.rangeExpr_return rangeExpr362 = null;

        FanParser.rangeExpr_return rangeExpr364 = null;


        Object OP_ELVIS363_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:12: ( rangeExpr ( OP_ELVIS rangeExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:14: rangeExpr ( OP_ELVIS rangeExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpr_in_elvisExpr2941);
            rangeExpr362=rangeExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rangeExpr362.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:24: ( OP_ELVIS rangeExpr )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==OP_ELVIS) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:413:25: OP_ELVIS rangeExpr
            	    {
            	    OP_ELVIS363=(Token)match(input,OP_ELVIS,FOLLOW_OP_ELVIS_in_elvisExpr2944); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_ELVIS363_tree = (Object)adaptor.create(OP_ELVIS363);
            	    adaptor.addChild(root_0, OP_ELVIS363_tree);
            	    }
            	    pushFollow(FOLLOW_rangeExpr_in_elvisExpr2946);
            	    rangeExpr364=rangeExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rangeExpr364.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 95, elvisExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elvisExpr"

    public static class rangeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rangeExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:414:1: rangeExpr : bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* ;
    public final FanParser.rangeExpr_return rangeExpr() throws RecognitionException {
        FanParser.rangeExpr_return retval = new FanParser.rangeExpr_return();
        retval.start = input.LT(1);
        int rangeExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set366=null;
        FanParser.bitOrExpr_return bitOrExpr365 = null;

        FanParser.bitOrExpr_return bitOrExpr367 = null;


        Object set366_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:12: ( bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:14: bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2957);
            bitOrExpr365=bitOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitOrExpr365.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:24: ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( ((LA108_0>=OP_RANG_EXCL_OLD && LA108_0<=OP_RANGE)) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:414:25: ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr
            	    {
            	    set366=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_RANG_EXCL_OLD && input.LA(1)<=OP_RANGE) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set366));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2974);
            	    bitOrExpr367=bitOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitOrExpr367.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 96, rangeExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "rangeExpr"

    public static class bitOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:415:1: bitOrExpr : bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* ;
    public final FanParser.bitOrExpr_return bitOrExpr() throws RecognitionException {
        FanParser.bitOrExpr_return retval = new FanParser.bitOrExpr_return();
        retval.start = input.LT(1);
        int bitOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set369=null;
        FanParser.bitAndExpr_return bitAndExpr368 = null;

        FanParser.bitAndExpr_return bitAndExpr370 = null;


        Object set369_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:415:12: ( bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:415:14: bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2985);
            bitAndExpr368=bitAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitAndExpr368.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:415:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            loop109:
            do {
                int alt109=2;
                alt109 = dfa109.predict(input);
                switch (alt109) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:415:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
            	    {
            	    set369=(Token)input.LT(1);
            	    if ( input.LA(1)==SP_PIPE||input.LA(1)==OP_BITOR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set369));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2996);
            	    bitAndExpr370=bitAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitAndExpr370.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 97, bitOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitOrExpr"

    public static class bitAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:416:1: bitAndExpr : shiftExpr ( OP_CURRY shiftExpr )* ;
    public final FanParser.bitAndExpr_return bitAndExpr() throws RecognitionException {
        FanParser.bitAndExpr_return retval = new FanParser.bitAndExpr_return();
        retval.start = input.LT(1);
        int bitAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_CURRY372=null;
        FanParser.shiftExpr_return shiftExpr371 = null;

        FanParser.shiftExpr_return shiftExpr373 = null;


        Object OP_CURRY372_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:13: ( shiftExpr ( OP_CURRY shiftExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:15: shiftExpr ( OP_CURRY shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpr_in_bitAndExpr3007);
            shiftExpr371=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr371.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:25: ( OP_CURRY shiftExpr )*
            loop110:
            do {
                int alt110=2;
                alt110 = dfa110.predict(input);
                switch (alt110) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:416:26: OP_CURRY shiftExpr
            	    {
            	    OP_CURRY372=(Token)match(input,OP_CURRY,FOLLOW_OP_CURRY_in_bitAndExpr3010); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_CURRY372_tree = (Object)adaptor.create(OP_CURRY372);
            	    adaptor.addChild(root_0, OP_CURRY372_tree);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitAndExpr3012);
            	    shiftExpr373=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr373.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 98, bitAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitAndExpr"

    public static class shiftExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:417:1: shiftExpr : addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* ;
    public final FanParser.shiftExpr_return shiftExpr() throws RecognitionException {
        FanParser.shiftExpr_return retval = new FanParser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set375=null;
        FanParser.addExpr_return addExpr374 = null;

        FanParser.addExpr_return addExpr376 = null;


        Object set375_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:12: ( addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:14: addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_shiftExpr3024);
            addExpr374=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr374.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:22: ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( ((LA111_0>=OP_LSHIFT && LA111_0<=OP_RSHIFT)) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:417:23: ( OP_LSHIFT | OP_RSHIFT ) addExpr
            	    {
            	    set375=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_LSHIFT && input.LA(1)<=OP_RSHIFT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set375));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3035);
            	    addExpr376=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr376.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 99, shiftExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:418:1: addExpr : multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* ;
    public final FanParser.addExpr_return addExpr() throws RecognitionException {
        FanParser.addExpr_return retval = new FanParser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set378=null;
        FanParser.multExpr_return multExpr377 = null;

        FanParser.multExpr_return multExpr379 = null;


        Object set378_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:10: ( multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:12: multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_addExpr3046);
            multExpr377=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr377.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*
            loop112:
            do {
                int alt112=2;
                alt112 = dfa112.predict(input);
                switch (alt112) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:418:22: ( OP_PLUS | OP_MINUS ) multExpr
            	    {
            	    set378=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set378));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr3057);
            	    multExpr379=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr379.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 100, addExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class addAppend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addAppend"
    // src/net/colar/netbeans/fan/antlr/Fan.g:419:1: addAppend : ( OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.addAppend_return addAppend() throws RecognitionException {
        FanParser.addAppend_return retval = new FanParser.addAppend_return();
        retval.start = input.LT(1);
        int addAppend_StartIndex = input.index();
        Object root_0 = null;

        Token set380=null;
        FanParser.parenExpr_return parenExpr381 = null;


        Object set380_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:419:11: ( ( OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:419:13: ( OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set380=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set380));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_addAppend3075);
            parenExpr381=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr381.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, addAppend_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addAppend"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:420:1: multExpr : parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* ;
    public final FanParser.multExpr_return multExpr() throws RecognitionException {
        FanParser.multExpr_return retval = new FanParser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set383=null;
        FanParser.parenExpr_return parenExpr382 = null;

        FanParser.parenExpr_return parenExpr384 = null;


        Object set383_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:11: ( parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:13: parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parenExpr_in_multExpr3083);
            parenExpr382=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr382.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:23: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==OP_MULTI) ) {
                    int LA113_2 = input.LA(2);

                    if ( (LA113_2==ID) ) {
                        int LA113_4 = input.LA(3);

                        if ( (synpred171_Fan()) ) {
                            alt113=1;
                        }


                    }
                    else if ( ((LA113_2>=KW_THIS && LA113_2<=KW_SUPER)||(LA113_2>=KW_NULL && LA113_2<=KW_FALSE)||LA113_2==SP_PIPE||LA113_2==OP_CURRY||(LA113_2>=OP_PLUS && LA113_2<=OP_MULTI)||(LA113_2>=OP_BANG && LA113_2<=OP_TILDA)||(LA113_2>=URI && LA113_2<=AT)||(LA113_2>=NUMBER && LA113_2<=SQ_BRACKET_L)||LA113_2==PAR_L) ) {
                        alt113=1;
                    }


                }
                else if ( ((LA113_0>=OP_DIV && LA113_0<=OP_MOD)) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:420:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
            	    {
            	    set383=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_MULTI && input.LA(1)<=OP_MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set383));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_parenExpr_in_multExpr3098);
            	    parenExpr384=parenExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr384.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 102, multExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class parenExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parenExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:421:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );
    public final FanParser.parenExpr_return parenExpr() throws RecognitionException {
        FanParser.parenExpr_return retval = new FanParser.parenExpr_return();
        retval.start = input.LT(1);
        int parenExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.castExpr_return castExpr385 = null;

        FanParser.groupedExpr_return groupedExpr386 = null;

        FanParser.unaryExpr_return unaryExpr387 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:12: ( castExpr | groupedExpr | unaryExpr )
            int alt114=3;
            alt114 = dfa114.predict(input);
            switch (alt114) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:421:14: castExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_castExpr_in_parenExpr3109);
                    castExpr385=castExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpr385.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:421:25: groupedExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_groupedExpr_in_parenExpr3113);
                    groupedExpr386=groupedExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, groupedExpr386.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:421:39: unaryExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpr_in_parenExpr3117);
                    unaryExpr387=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr387.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 103, parenExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parenExpr"

    public static class castExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "castExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:423:1: castExpr : {...}? parL type parR parenExpr ;
    public final FanParser.castExpr_return castExpr() throws RecognitionException {
        FanParser.castExpr_return retval = new FanParser.castExpr_return();
        retval.start = input.LT(1);
        int castExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL388 = null;

        FanParser.type_return type389 = null;

        FanParser.parR_return parR390 = null;

        FanParser.parenExpr_return parenExpr391 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:11: ({...}? parL type parR parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:13: {...}? parL type parR parenExpr
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "castExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_castExpr3128);
            parL388=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL388.getTree());
            pushFollow(FOLLOW_type_in_castExpr3130);
            type389=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type389.getTree());
            pushFollow(FOLLOW_parR_in_castExpr3132);
            parR390=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR390.getTree());
            pushFollow(FOLLOW_parenExpr_in_castExpr3134);
            parenExpr391=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr391.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 104, castExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "castExpr"

    public static class groupedExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupedExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:425:1: groupedExpr : parL expr parR ( termChain )* ;
    public final FanParser.groupedExpr_return groupedExpr() throws RecognitionException {
        FanParser.groupedExpr_return retval = new FanParser.groupedExpr_return();
        retval.start = input.LT(1);
        int groupedExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL392 = null;

        FanParser.expr_return expr393 = null;

        FanParser.parR_return parR394 = null;

        FanParser.termChain_return termChain395 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:425:14: ( parL expr parR ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:425:16: parL expr parR ( termChain )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parL_in_groupedExpr3143);
            parL392=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL392.getTree());
            pushFollow(FOLLOW_expr_in_groupedExpr3145);
            expr393=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr393.getTree());
            pushFollow(FOLLOW_parR_in_groupedExpr3147);
            parR394=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR394.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:425:31: ( termChain )*
            loop115:
            do {
                int alt115=2;
                alt115 = dfa115.predict(input);
                switch (alt115) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_groupedExpr3149);
            	    termChain395=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, termChain395.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 105, groupedExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "groupedExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:426:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );
    public final FanParser.unaryExpr_return unaryExpr() throws RecognitionException {
        FanParser.unaryExpr_return retval = new FanParser.unaryExpr_return();
        retval.start = input.LT(1);
        int unaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.prefixExpr_return prefixExpr396 = null;

        FanParser.postfixExpr_return postfixExpr397 = null;

        FanParser.termExpr_return termExpr398 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:426:12: ( prefixExpr | postfixExpr | termExpr )
            int alt116=3;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:426:14: prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prefixExpr_in_unaryExpr3158);
                    prefixExpr396=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr396.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:426:27: postfixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpr_in_unaryExpr3162);
                    postfixExpr397=postfixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpr397.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:426:41: termExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_termExpr_in_unaryExpr3166);
                    termExpr398=termExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr398.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 106, unaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExpr"

    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:427:1: prefixExpr : ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.prefixExpr_return prefixExpr() throws RecognitionException {
        FanParser.prefixExpr_return retval = new FanParser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set399=null;
        FanParser.parenExpr_return parenExpr400 = null;


        Object set399_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:427:13: ( ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:427:15: ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set399=(Token)input.LT(1);
            if ( input.LA(1)==OP_CURRY||(input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS)||(input.LA(1)>=OP_BANG && input.LA(1)<=OP_TILDA) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set399));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_prefixExpr3202);
            parenExpr400=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr400.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, prefixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixExpr"

    public static class postfixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:428:1: postfixExpr : termExpr ( OP_2PLUS | OP_2MINUS ) ;
    public final FanParser.postfixExpr_return postfixExpr() throws RecognitionException {
        FanParser.postfixExpr_return retval = new FanParser.postfixExpr_return();
        retval.start = input.LT(1);
        int postfixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set402=null;
        FanParser.termExpr_return termExpr401 = null;


        Object set402_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:428:14: ( termExpr ( OP_2PLUS | OP_2MINUS ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:428:16: termExpr ( OP_2PLUS | OP_2MINUS )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_termExpr_in_postfixExpr3211);
            termExpr401=termExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr401.getTree());
            set402=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_2PLUS && input.LA(1)<=OP_2MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set402));
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
            if ( state.backtracking>0 ) { memoize(input, 108, postfixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "postfixExpr"

    public static class termExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:429:1: termExpr : termBase ( termChain )* -> ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) ) ;
    public final FanParser.termExpr_return termExpr() throws RecognitionException {
        FanParser.termExpr_return retval = new FanParser.termExpr_return();
        retval.start = input.LT(1);
        int termExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.termBase_return termBase403 = null;

        FanParser.termChain_return termChain404 = null;


        RewriteRuleSubtreeStream stream_termBase=new RewriteRuleSubtreeStream(adaptor,"rule termBase");
        RewriteRuleSubtreeStream stream_termChain=new RewriteRuleSubtreeStream(adaptor,"rule termChain");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:11: ( termBase ( termChain )* -> ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:13: termBase ( termChain )*
            {
            pushFollow(FOLLOW_termBase_in_termExpr3228);
            termBase403=termBase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_termBase.add(termBase403.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:22: ( termChain )*
            loop117:
            do {
                int alt117=2;
                alt117 = dfa117.predict(input);
                switch (alt117) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_termExpr3230);
            	    termChain404=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_termChain.add(termChain404.getTree());

            	    }
            	    break;

            	default :
            	    break loop117;
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
            // 430:4: -> ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:430:7: ^( AST_TERM_EXPR ^( AST_CHILD termBase ) ^( AST_CHILD ( termChain )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TERM_EXPR, "AST_TERM_EXPR"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:430:23: ^( AST_CHILD termBase )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                adaptor.addChild(root_2, stream_termBase.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:430:45: ^( AST_CHILD ( termChain )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                // src/net/colar/netbeans/fan/antlr/Fan.g:430:57: ( termChain )*
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
            if ( state.backtracking>0 ) { memoize(input, 109, termExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termExpr"

    public static class termBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:432:1: termBase : ( idExprReq | literal | typeBase | id );
    public final FanParser.termBase_return termBase() throws RecognitionException {
        FanParser.termBase_return retval = new FanParser.termBase_return();
        retval.start = input.LT(1);
        int termBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq405 = null;

        FanParser.literal_return literal406 = null;

        FanParser.typeBase_return typeBase407 = null;

        FanParser.id_return id408 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:432:11: ( idExprReq | literal | typeBase | id )
            int alt118=4;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:432:13: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_termBase3262);
                    idExprReq405=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq405.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:432:25: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_termBase3266);
                    literal406=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal406.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:432:35: typeBase
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeBase_in_termBase3270);
                    typeBase407=typeBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeBase407.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:432:46: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_termBase3274);
                    id408=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id408.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 110, termBase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termBase"

    public static class typeBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:433:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );
    public final FanParser.typeBase_return typeBase() throws RecognitionException {
        FanParser.typeBase_return retval = new FanParser.typeBase_return();
        retval.start = input.LT(1);
        int typeBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeLiteral_return typeLiteral409 = null;

        FanParser.slotLiteral_return slotLiteral410 = null;

        FanParser.namedSuper_return namedSuper411 = null;

        FanParser.staticCall_return staticCall412 = null;

        FanParser.dsl_return dsl413 = null;

        FanParser.closure_return closure414 = null;

        FanParser.simple_return simple415 = null;

        FanParser.ctorBlock_return ctorBlock416 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:433:10: ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock )
            int alt119=8;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:433:12: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_typeBase3281);
                    typeLiteral409=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral409.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:433:26: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_typeBase3285);
                    slotLiteral410=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral410.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:433:40: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_typeBase3289);
                    namedSuper411=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper411.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:433:53: staticCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_staticCall_in_typeBase3293);
                    staticCall412=staticCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticCall412.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:434:19: dsl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dsl_in_typeBase3315);
                    dsl413=dsl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dsl413.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:434:25: closure
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_closure_in_typeBase3319);
                    closure414=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure414.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:434:35: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_typeBase3323);
                    simple415=simple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple415.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:434:44: ctorBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctorBlock_in_typeBase3327);
                    ctorBlock416=ctorBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorBlock416.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 111, typeBase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeBase"

    public static class ctorBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:435:1: ctorBlock : type itBlock ;
    public final FanParser.ctorBlock_return ctorBlock() throws RecognitionException {
        FanParser.ctorBlock_return retval = new FanParser.ctorBlock_return();
        retval.start = input.LT(1);
        int ctorBlock_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type417 = null;

        FanParser.itBlock_return itBlock418 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:11: ( type itBlock )
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:13: type itBlock
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_ctorBlock3334);
            type417=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type417.getTree());
            pushFollow(FOLLOW_itBlock_in_ctorBlock3336);
            itBlock418=itBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, itBlock418.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 112, ctorBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorBlock"

    public static class staticCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:436:1: staticCall : type DOT idExpr -> ^( AST_STATIC_CALL ^( AST_TYPE type ) ^( AST_CHILD idExpr ) ) ;
    public final FanParser.staticCall_return staticCall() throws RecognitionException {
        FanParser.staticCall_return retval = new FanParser.staticCall_return();
        retval.start = input.LT(1);
        int staticCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT420=null;
        FanParser.type_return type419 = null;

        FanParser.idExpr_return idExpr421 = null;


        Object DOT420_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_idExpr=new RewriteRuleSubtreeStream(adaptor,"rule idExpr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:436:12: ( type DOT idExpr -> ^( AST_STATIC_CALL ^( AST_TYPE type ) ^( AST_CHILD idExpr ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:436:14: type DOT idExpr
            {
            pushFollow(FOLLOW_type_in_staticCall3343);
            type419=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type419.getTree());
            DOT420=(Token)match(input,DOT,FOLLOW_DOT_in_staticCall3345); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT420);

            pushFollow(FOLLOW_idExpr_in_staticCall3347);
            idExpr421=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idExpr.add(idExpr421.getTree());


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
            // 437:5: -> ^( AST_STATIC_CALL ^( AST_TYPE type ) ^( AST_CHILD idExpr ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:437:8: ^( AST_STATIC_CALL ^( AST_TYPE type ) ^( AST_CHILD idExpr ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_STATIC_CALL, "AST_STATIC_CALL"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:437:26: ^( AST_TYPE type )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE, "AST_TYPE"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:437:43: ^( AST_CHILD idExpr )
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
            if ( state.backtracking>0 ) { memoize(input, 113, staticCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticCall"

    public static class termChain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:439:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall );
    public final FanParser.termChain_return termChain() throws RecognitionException {
        FanParser.termChain_return retval = new FanParser.termChain_return();
        retval.start = input.LT(1);
        int termChain_StartIndex = input.index();
        Object root_0 = null;

        FanParser.dotCall_return dotCall422 = null;

        FanParser.dynCall_return dynCall423 = null;

        FanParser.safeDotCall_return safeDotCall424 = null;

        FanParser.safeDynCall_return safeDynCall425 = null;

        FanParser.indexExpr_return indexExpr426 = null;

        FanParser.callOp_return callOp427 = null;

        FanParser.itBlock_return itBlock428 = null;

        FanParser.incDotCall_return incDotCall429 = null;

        FanParser.incSafeDotCall_return incSafeDotCall430 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:439:12: ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall )
            int alt120=9;
            alt120 = dfa120.predict(input);
            switch (alt120) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:439:14: dotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotCall_in_termChain3378);
                    dotCall422=dotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotCall422.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:439:24: dynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dynCall_in_termChain3382);
                    dynCall423=dynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dynCall423.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:439:34: safeDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDotCall_in_termChain3386);
                    safeDotCall424=safeDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDotCall424.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:439:48: safeDynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDynCall_in_termChain3390);
                    safeDynCall425=safeDynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDynCall425.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:440:4: indexExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_indexExpr_in_termChain3397);
                    indexExpr426=indexExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpr426.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:440:16: callOp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_callOp_in_termChain3401);
                    callOp427=callOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callOp427.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:440:25: itBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_itBlock_in_termChain3405);
                    itBlock428=itBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itBlock428.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:440:35: incDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_incDotCall_in_termChain3409);
                    incDotCall429=incDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incDotCall429.getTree());

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:440:48: incSafeDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_incSafeDotCall_in_termChain3413);
                    incSafeDotCall430=incSafeDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incSafeDotCall430.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 114, termChain_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termChain"

    public static class dsl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dsl"
    // src/net/colar/netbeans/fan/antlr/Fan.g:441:1: dsl : simpleType DSL ;
    public final FanParser.dsl_return dsl() throws RecognitionException {
        FanParser.dsl_return retval = new FanParser.dsl_return();
        retval.start = input.LT(1);
        int dsl_StartIndex = input.index();
        Object root_0 = null;

        Token DSL432=null;
        FanParser.simpleType_return simpleType431 = null;


        Object DSL432_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:13: ( simpleType DSL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:15: simpleType DSL
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleType_in_dsl3428);
            simpleType431=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType431.getTree());
            DSL432=(Token)match(input,DSL,FOLLOW_DSL_in_dsl3430); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DSL432_tree = (Object)adaptor.create(DSL432);
            adaptor.addChild(root_0, DSL432_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 115, dsl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dsl"

    public static class incDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:443:1: incDotCall : DOT -> ^( AST_INC_DOTCALL ) ;
    public final FanParser.incDotCall_return incDotCall() throws RecognitionException {
        FanParser.incDotCall_return retval = new FanParser.incDotCall_return();
        retval.start = input.LT(1);
        int incDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT433=null;

        Object DOT433_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:12: ( DOT -> ^( AST_INC_DOTCALL ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:14: DOT
            {
            DOT433=(Token)match(input,DOT,FOLLOW_DOT_in_incDotCall3438); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT433);



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
            // 444:5: -> ^( AST_INC_DOTCALL )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:444:8: ^( AST_INC_DOTCALL )
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
            if ( state.backtracking>0 ) { memoize(input, 116, incDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "incDotCall"

    public static class incSafeDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incSafeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:445:1: incSafeDotCall : OP_SAFE_CALL -> ^( AST_INC_SAFEDOTCALL ) ;
    public final FanParser.incSafeDotCall_return incSafeDotCall() throws RecognitionException {
        FanParser.incSafeDotCall_return retval = new FanParser.incSafeDotCall_return();
        retval.start = input.LT(1);
        int incSafeDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFE_CALL434=null;

        Object OP_SAFE_CALL434_tree=null;
        RewriteRuleTokenStream stream_OP_SAFE_CALL=new RewriteRuleTokenStream(adaptor,"token OP_SAFE_CALL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:445:15: ( OP_SAFE_CALL -> ^( AST_INC_SAFEDOTCALL ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:445:17: OP_SAFE_CALL
            {
            OP_SAFE_CALL434=(Token)match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_incSafeDotCall3454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_SAFE_CALL.add(OP_SAFE_CALL434);



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
            // 446:5: -> ^( AST_INC_SAFEDOTCALL )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:446:8: ^( AST_INC_SAFEDOTCALL )
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
            if ( state.backtracking>0 ) { memoize(input, 117, incSafeDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "incSafeDotCall"

    public static class itBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "itBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:449:1: itBlock : bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR ;
    public final FanParser.itBlock_return itBlock() throws RecognitionException {
        FanParser.itBlock_return retval = new FanParser.itBlock_return();
        retval.start = input.LT(1);
        int itBlock_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA437=null;
        Token SP_SEMI438=null;
        FanParser.bracketL_return bracketL435 = null;

        FanParser.stmt_return stmt436 = null;

        FanParser.bracketR_return bracketR439 = null;


        Object SP_COMMA437_tree=null;
        Object SP_SEMI438_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:10: ( bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:12: bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bracketL_in_itBlock3474);
            bracketL435=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL435.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:21: ( stmt ( SP_COMMA )? ( SP_SEMI )? )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( ((LA123_0>=KW_BREAK && LA123_0<=KW_TRY)||(LA123_0>=KW_THIS && LA123_0<=KW_SUPER)||(LA123_0>=KW_NULL && LA123_0<=KW_FALSE)||LA123_0==SP_PIPE||LA123_0==OP_CURRY||(LA123_0>=OP_PLUS && LA123_0<=OP_MULTI)||(LA123_0>=OP_BANG && LA123_0<=OP_TILDA)||(LA123_0>=ID && LA123_0<=AT)||(LA123_0>=NUMBER && LA123_0<=SQ_BRACKET_L)||LA123_0==PAR_L) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:449:22: stmt ( SP_COMMA )? ( SP_SEMI )?
            	    {
            	    pushFollow(FOLLOW_stmt_in_itBlock3477);
            	    stmt436=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt436.getTree());
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:449:27: ( SP_COMMA )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==SP_COMMA) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
            	            {
            	            SP_COMMA437=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_itBlock3479); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_COMMA437_tree = (Object)adaptor.create(SP_COMMA437);
            	            adaptor.addChild(root_0, SP_COMMA437_tree);
            	            }

            	            }
            	            break;

            	    }

            	    // src/net/colar/netbeans/fan/antlr/Fan.g:449:37: ( SP_SEMI )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==SP_SEMI) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
            	            {
            	            SP_SEMI438=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_itBlock3482); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_SEMI438_tree = (Object)adaptor.create(SP_SEMI438);
            	            adaptor.addChild(root_0, SP_SEMI438_tree);
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

            pushFollow(FOLLOW_bracketR_in_itBlock3487);
            bracketR439=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR439.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 118, itBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "itBlock"

    public static class dotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:450:1: dotCall : DOT idExpr -> ^( AST_DOT_CALL idExpr ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:10: ( DOT idExpr -> ^( AST_DOT_CALL idExpr ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:12: DOT idExpr
            {
            DOT440=(Token)match(input,DOT,FOLLOW_DOT_in_dotCall3495); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT440);

            pushFollow(FOLLOW_idExpr_in_dotCall3497);
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
            // 451:5: -> ^( AST_DOT_CALL idExpr )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:451:8: ^( AST_DOT_CALL idExpr )
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
            if ( state.backtracking>0 ) { memoize(input, 119, dotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotCall"

    public static class dynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:452:1: dynCall : OP_ARROW idExpr ;
    public final FanParser.dynCall_return dynCall() throws RecognitionException {
        FanParser.dynCall_return retval = new FanParser.dynCall_return();
        retval.start = input.LT(1);
        int dynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW442=null;
        FanParser.idExpr_return idExpr443 = null;


        Object OP_ARROW442_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:10: ( OP_ARROW idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:12: OP_ARROW idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW442=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_dynCall3517); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW442_tree = (Object)adaptor.create(OP_ARROW442);
            adaptor.addChild(root_0, OP_ARROW442_tree);
            }
            pushFollow(FOLLOW_idExpr_in_dynCall3519);
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
            if ( state.backtracking>0 ) { memoize(input, 120, dynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dynCall"

    public static class safeDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:453:1: safeDotCall : OP_SAFE_CALL idExpr -> ^( AST_SAFE_DOT_CALL idExpr ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:453:14: ( OP_SAFE_CALL idExpr -> ^( AST_SAFE_DOT_CALL idExpr ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:453:16: OP_SAFE_CALL idExpr
            {
            OP_SAFE_CALL444=(Token)match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_safeDotCall3527); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_SAFE_CALL.add(OP_SAFE_CALL444);

            pushFollow(FOLLOW_idExpr_in_safeDotCall3529);
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
            // 454:5: -> ^( AST_SAFE_DOT_CALL idExpr )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:454:8: ^( AST_SAFE_DOT_CALL idExpr )
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
            if ( state.backtracking>0 ) { memoize(input, 121, safeDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDotCall"

    public static class safeDynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:455:1: safeDynCall : OP_SAFEDYN_CALL idExpr ;
    public final FanParser.safeDynCall_return safeDynCall() throws RecognitionException {
        FanParser.safeDynCall_return retval = new FanParser.safeDynCall_return();
        retval.start = input.LT(1);
        int safeDynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFEDYN_CALL446=null;
        FanParser.idExpr_return idExpr447 = null;


        Object OP_SAFEDYN_CALL446_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:455:13: ( OP_SAFEDYN_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:455:15: OP_SAFEDYN_CALL idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_SAFEDYN_CALL446=(Token)match(input,OP_SAFEDYN_CALL,FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall3548); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_SAFEDYN_CALL446_tree = (Object)adaptor.create(OP_SAFEDYN_CALL446);
            adaptor.addChild(root_0, OP_SAFEDYN_CALL446_tree);
            }
            pushFollow(FOLLOW_idExpr_in_safeDynCall3550);
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
            if ( state.backtracking>0 ) { memoize(input, 122, safeDynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDynCall"

    public static class indexExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:456:1: indexExpr : {...}? sq_bracketL expr sq_bracketR ;
    public final FanParser.indexExpr_return indexExpr() throws RecognitionException {
        FanParser.indexExpr_return retval = new FanParser.indexExpr_return();
        retval.start = input.LT(1);
        int indexExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.sq_bracketL_return sq_bracketL448 = null;

        FanParser.expr_return expr449 = null;

        FanParser.sq_bracketR_return sq_bracketR450 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:456:12: ({...}? sq_bracketL expr sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:456:14: {...}? sq_bracketL expr sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "indexExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_sq_bracketL_in_indexExpr3560);
            sq_bracketL448=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL448.getTree());
            pushFollow(FOLLOW_expr_in_indexExpr3562);
            expr449=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr449.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_indexExpr3564);
            sq_bracketR450=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR450.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 123, indexExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "indexExpr"

    public static class callOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:458:1: callOp : {...}? parL ( args )? parR ( closure )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:458:9: ({...}? parL ( args )? parR ( closure )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:458:11: {...}? parL ( args )? parR ( closure )*
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callOp", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callOp3575);
            parL451=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL451.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:458:33: ( args )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( ((LA124_0>=KW_THIS && LA124_0<=KW_SUPER)||(LA124_0>=KW_NULL && LA124_0<=KW_FALSE)||LA124_0==SP_PIPE||LA124_0==OP_CURRY||(LA124_0>=OP_PLUS && LA124_0<=OP_MULTI)||(LA124_0>=OP_BANG && LA124_0<=OP_TILDA)||(LA124_0>=ID && LA124_0<=AT)||(LA124_0>=NUMBER && LA124_0<=SQ_BRACKET_L)||LA124_0==PAR_L) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callOp3577);
                    args452=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args452.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callOp3581);
            parR453=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR453.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:458:45: ( closure )*
            loop125:
            do {
                int alt125=2;
                alt125 = dfa125.predict(input);
                switch (alt125) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: closure
            	    {
            	    pushFollow(FOLLOW_closure_in_callOp3583);
            	    closure454=closure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure454.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 124, callOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callOp"

    public static class closure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "closure"
    // src/net/colar/netbeans/fan/antlr/Fan.g:459:1: closure : funcType multiStmt ;
    public final FanParser.closure_return closure() throws RecognitionException {
        FanParser.closure_return retval = new FanParser.closure_return();
        retval.start = input.LT(1);
        int closure_StartIndex = input.index();
        Object root_0 = null;

        FanParser.funcType_return funcType455 = null;

        FanParser.multiStmt_return multiStmt456 = null;



        paraphrase.push("Closure");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:460:3: ( funcType multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:460:7: funcType multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_funcType_in_closure3605);
            funcType455=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType455.getTree());
            pushFollow(FOLLOW_multiStmt_in_closure3607);
            multiStmt456=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt456.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 125, closure_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "closure"

    public static class idExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:462:1: idExpr : ( idExprReq | id );
    public final FanParser.idExpr_return idExpr() throws RecognitionException {
        FanParser.idExpr_return retval = new FanParser.idExpr_return();
        retval.start = input.LT(1);
        int idExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq457 = null;

        FanParser.id_return id458 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:10: ( idExprReq | id )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==SP_PIPE||LA126_0==OP_MULTI||LA126_0==PAR_L) ) {
                alt126=1;
            }
            else if ( (LA126_0==ID) ) {
                int LA126_2 = input.LA(2);

                if ( (synpred208_Fan()) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:462:12: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_idExpr3617);
                    idExprReq457=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq457.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:462:24: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_idExpr3621);
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
            if ( state.backtracking>0 ) { memoize(input, 126, idExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExpr"

    public static class idExprReq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExprReq"
    // src/net/colar/netbeans/fan/antlr/Fan.g:464:1: idExprReq : ( field | call );
    public final FanParser.idExprReq_return idExprReq() throws RecognitionException {
        FanParser.idExprReq_return retval = new FanParser.idExprReq_return();
        retval.start = input.LT(1);
        int idExprReq_StartIndex = input.index();
        Object root_0 = null;

        FanParser.field_return field459 = null;

        FanParser.call_return call460 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:464:11: ( field | call )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==OP_MULTI) ) {
                alt127=1;
            }
            else if ( (LA127_0==SP_PIPE||LA127_0==ID||LA127_0==PAR_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:464:13: field
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_field_in_idExprReq3629);
                    field459=field();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field459.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:464:21: call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_idExprReq3633);
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
            if ( state.backtracking>0 ) { memoize(input, 127, idExprReq_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExprReq"

    public static class field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field"
    // src/net/colar/netbeans/fan/antlr/Fan.g:466:1: field : OP_MULTI ID ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:466:8: ( OP_MULTI ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:466:10: OP_MULTI ID
            {
            root_0 = (Object)adaptor.nil();

            OP_MULTI461=(Token)match(input,OP_MULTI,FOLLOW_OP_MULTI_in_field3642); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_MULTI461_tree = (Object)adaptor.create(OP_MULTI461);
            adaptor.addChild(root_0, OP_MULTI461_tree);
            }
            ID462=(Token)match(input,ID,FOLLOW_ID_in_field3644); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 128, field_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "field"

    public static class call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // src/net/colar/netbeans/fan/antlr/Fan.g:468:1: call : ( id (p= callParams c= closure ) | p= callParams | c= closure ) -> ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:7: ( ( id (p= callParams c= closure ) | p= callParams | c= closure ) -> ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:9: ( id (p= callParams c= closure ) | p= callParams | c= closure )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:9: ( id (p= callParams c= closure ) | p= callParams | c= closure )
            int alt128=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt128=1;
                }
                break;
            case PAR_L:
                {
                alt128=2;
                }
                break;
            case SP_PIPE:
                {
                alt128=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:468:10: id (p= callParams c= closure )
                    {
                    pushFollow(FOLLOW_id_in_call3656);
                    id463=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id463.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:468:13: (p= callParams c= closure )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:468:14: p= callParams c= closure
                    {
                    pushFollow(FOLLOW_callParams_in_call3661);
                    p=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callParams.add(p.getTree());
                    pushFollow(FOLLOW_closure_in_call3665);
                    c=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_closure.add(c.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:468:40: p= callParams
                    {
                    pushFollow(FOLLOW_callParams_in_call3672);
                    p=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callParams.add(p.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:468:55: c= closure
                    {
                    pushFollow(FOLLOW_closure_in_call3678);
                    c=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_closure.add(c.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: id, c, p
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
            // 469:4: -> ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:469:7: ^( AST_CALL id ^( AST_CHILD ( $p)? ( $c)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CALL, "AST_CALL"), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:469:21: ^( AST_CHILD ( $p)? ( $c)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CHILD, "AST_CHILD"), root_2);

                // src/net/colar/netbeans/fan/antlr/Fan.g:469:33: ( $p)?
                if ( stream_p.hasNext() ) {
                    adaptor.addChild(root_2, stream_p.nextTree());

                }
                stream_p.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:469:37: ( $c)?
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
            if ( state.backtracking>0 ) { memoize(input, 129, call_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class callParams_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callParams"
    // src/net/colar/netbeans/fan/antlr/Fan.g:471:1: callParams : {...}? parL ( args )? parR ;
    public final FanParser.callParams_return callParams() throws RecognitionException {
        FanParser.callParams_return retval = new FanParser.callParams_return();
        retval.start = input.LT(1);
        int callParams_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL464 = null;

        FanParser.args_return args465 = null;

        FanParser.parR_return parR466 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:471:12: ({...}? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:471:14: {...}? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callParams", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callParams3712);
            parL464=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL464.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:471:36: ( args )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( ((LA129_0>=KW_THIS && LA129_0<=KW_SUPER)||(LA129_0>=KW_NULL && LA129_0<=KW_FALSE)||LA129_0==SP_PIPE||LA129_0==OP_CURRY||(LA129_0>=OP_PLUS && LA129_0<=OP_MULTI)||(LA129_0>=OP_BANG && LA129_0<=OP_TILDA)||(LA129_0>=ID && LA129_0<=AT)||(LA129_0>=NUMBER && LA129_0<=SQ_BRACKET_L)||LA129_0==PAR_L) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callParams3714);
                    args465=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args465.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callParams3717);
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
            if ( state.backtracking>0 ) { memoize(input, 130, callParams_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callParams"

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // src/net/colar/netbeans/fan/antlr/Fan.g:472:1: args : expr ( SP_COMMA expr )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:472:8: ( expr ( SP_COMMA expr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:472:10: expr ( SP_COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_args3726);
            expr467=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr467.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:472:15: ( SP_COMMA expr )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==SP_COMMA) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:472:16: SP_COMMA expr
            	    {
            	    SP_COMMA468=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_args3729); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA468_tree = (Object)adaptor.create(SP_COMMA468);
            	    adaptor.addChild(root_0, SP_COMMA468_tree);
            	    }
            	    pushFollow(FOLLOW_expr_in_args3732);
            	    expr469=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr469.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 131, args_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:474:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:474:10: ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple )
            int alt131=17;
            alt131 = dfa131.predict(input);
            switch (alt131) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:12: KW_NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NULL470=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_literal3743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NULL470_tree = (Object)adaptor.create(KW_NULL470);
                    adaptor.addChild(root_0, KW_NULL470_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:22: KW_THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_THIS471=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_literal3747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_THIS471_tree = (Object)adaptor.create(KW_THIS471);
                    adaptor.addChild(root_0, KW_THIS471_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:32: KW_SUPER
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_SUPER472=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_literal3751); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_SUPER472_tree = (Object)adaptor.create(KW_SUPER472);
                    adaptor.addChild(root_0, KW_SUPER472_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:43: KW_IT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_IT473=(Token)match(input,KW_IT,FOLLOW_KW_IT_in_literal3755); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_IT473_tree = (Object)adaptor.create(KW_IT473);
                    adaptor.addChild(root_0, KW_IT473_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:51: KW_TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_TRUE474=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_literal3759); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_TRUE474_tree = (Object)adaptor.create(KW_TRUE474);
                    adaptor.addChild(root_0, KW_TRUE474_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:61: KW_FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FALSE475=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_literal3763); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FALSE475_tree = (Object)adaptor.create(KW_FALSE475);
                    adaptor.addChild(root_0, KW_FALSE475_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:72: strs
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_strs_in_literal3767);
                    strs476=strs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, strs476.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:79: URI
                    {
                    root_0 = (Object)adaptor.nil();

                    URI477=(Token)match(input,URI,FOLLOW_URI_in_literal3771); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI477_tree = (Object)adaptor.create(URI477);
                    adaptor.addChild(root_0, URI477_tree);
                    }

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:4: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_literal3778);
                    number478=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number478.getTree());

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:13: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR479=(Token)match(input,CHAR,FOLLOW_CHAR_in_literal3782); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR479_tree = (Object)adaptor.create(CHAR479);
                    adaptor.addChild(root_0, CHAR479_tree);
                    }

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:20: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_literal3786);
                    namedSuper480=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper480.getTree());

                    }
                    break;
                case 12 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:476:4: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_literal3793);
                    slotLiteral481=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral481.getTree());

                    }
                    break;
                case 13 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:476:18: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_literal3797);
                    typeLiteral482=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral482.getTree());

                    }
                    break;
                case 14 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:476:32: list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_in_literal3801);
                    list483=list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list483.getTree());

                    }
                    break;
                case 15 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:476:39: map
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_in_literal3805);
                    map484=map();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map484.getTree());

                    }
                    break;
                case 16 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:476:45: symbLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_symbLiteral_in_literal3809);
                    symbLiteral485=symbLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbLiteral485.getTree());

                    }
                    break;
                case 17 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:476:59: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_literal3813);
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
            if ( state.backtracking>0 ) { memoize(input, 132, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class strs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "strs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:477:1: strs : (qs= QUOTSTR | s= STR ) -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:477:7: ( (qs= QUOTSTR | s= STR ) -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:477:9: (qs= QUOTSTR | s= STR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:477:9: (qs= QUOTSTR | s= STR )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:477:10: qs= QUOTSTR
                    {
                    qs=(Token)match(input,QUOTSTR,FOLLOW_QUOTSTR_in_strs3824); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUOTSTR.add(qs);


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:477:23: s= STR
                    {
                    s=(Token)match(input,STR,FOLLOW_STR_in_strs3830); if (state.failed) return retval; 
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
            // 478:5: -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )?
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:478:8: ( ^( AST_STR $s) )?
                if ( stream_s.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:478:8: ^( AST_STR $s)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_STR, "AST_STR"), root_1);

                    adaptor.addChild(root_1, stream_s.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_s.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:478:23: ( ^( AST_STR $qs) )?
                if ( stream_qs.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:478:23: ^( AST_STR $qs)
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
            if ( state.backtracking>0 ) { memoize(input, 133, strs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "strs"

    public static class typeLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:479:1: typeLiteral : type {...}? OP_POUND ;
    public final FanParser.typeLiteral_return typeLiteral() throws RecognitionException {
        FanParser.typeLiteral_return retval = new FanParser.typeLiteral_return();
        retval.start = input.LT(1);
        int typeLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND488=null;
        FanParser.type_return type487 = null;


        Object OP_POUND488_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:13: ( type {...}? OP_POUND )
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:17: type {...}? OP_POUND
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_typeLiteral3862);
            type487=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type487.getTree());
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "typeLiteral", "notAfterEol()");
            }
            OP_POUND488=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_typeLiteral3866); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_POUND488_tree = (Object)adaptor.create(OP_POUND488);
            adaptor.addChild(root_0, OP_POUND488_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 134, typeLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeLiteral"

    public static class slotLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slotLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:480:1: slotLiteral : ( type )? OP_POUND {...}? id ;
    public final FanParser.slotLiteral_return slotLiteral() throws RecognitionException {
        FanParser.slotLiteral_return retval = new FanParser.slotLiteral_return();
        retval.start = input.LT(1);
        int slotLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND490=null;
        FanParser.type_return type489 = null;

        FanParser.id_return id491 = null;


        Object OP_POUND490_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:480:13: ( ( type )? OP_POUND {...}? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:480:17: ( type )? OP_POUND {...}? id
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:480:17: ( type )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==SP_PIPE||LA133_0==ID||LA133_0==SQ_BRACKET_L) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_slotLiteral3875);
                    type489=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type489.getTree());

                    }
                    break;

            }

            OP_POUND490=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_slotLiteral3878); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_POUND490_tree = (Object)adaptor.create(OP_POUND490);
            adaptor.addChild(root_0, OP_POUND490_tree);
            }
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "slotLiteral", "notAfterEol()");
            }
            pushFollow(FOLLOW_id_in_slotLiteral3882);
            id491=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id491.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 135, slotLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slotLiteral"

    public static class symbLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:481:1: symbLiteral : AT ( id SP_COLON SP_COLON )? id ;
    public final FanParser.symbLiteral_return symbLiteral() throws RecognitionException {
        FanParser.symbLiteral_return retval = new FanParser.symbLiteral_return();
        retval.start = input.LT(1);
        int symbLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token AT492=null;
        Token SP_COLON494=null;
        Token SP_COLON495=null;
        FanParser.id_return id493 = null;

        FanParser.id_return id496 = null;


        Object AT492_tree=null;
        Object SP_COLON494_tree=null;
        Object SP_COLON495_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:481:13: ( AT ( id SP_COLON SP_COLON )? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:481:17: AT ( id SP_COLON SP_COLON )? id
            {
            root_0 = (Object)adaptor.nil();

            AT492=(Token)match(input,AT,FOLLOW_AT_in_symbLiteral3891); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT492_tree = (Object)adaptor.create(AT492);
            adaptor.addChild(root_0, AT492_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:481:20: ( id SP_COLON SP_COLON )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==ID) ) {
                int LA134_1 = input.LA(2);

                if ( (LA134_1==SP_COLON) ) {
                    int LA134_3 = input.LA(3);

                    if ( (LA134_3==SP_COLON) ) {
                        alt134=1;
                    }
                }
            }
            switch (alt134) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:481:21: id SP_COLON SP_COLON
                    {
                    pushFollow(FOLLOW_id_in_symbLiteral3894);
                    id493=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id493.getTree());
                    SP_COLON494=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_symbLiteral3896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLON494_tree = (Object)adaptor.create(SP_COLON494);
                    adaptor.addChild(root_0, SP_COLON494_tree);
                    }
                    SP_COLON495=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_symbLiteral3898); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLON495_tree = (Object)adaptor.create(SP_COLON495);
                    adaptor.addChild(root_0, SP_COLON495_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_symbLiteral3902);
            id496=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id496.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 136, symbLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "symbLiteral"

    public static class namedSuper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namedSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:482:1: namedSuper : simpleType DOT KW_SUPER ;
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

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:482:13: ( simpleType DOT KW_SUPER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:482:15: simpleType DOT KW_SUPER
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleType_in_namedSuper3910);
            simpleType497=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType497.getTree());
            DOT498=(Token)match(input,DOT,FOLLOW_DOT_in_namedSuper3912); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT498_tree = (Object)adaptor.create(DOT498);
            adaptor.addChild(root_0, DOT498_tree);
            }
            KW_SUPER499=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_namedSuper3914); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SUPER499_tree = (Object)adaptor.create(KW_SUPER499);
            adaptor.addChild(root_0, KW_SUPER499_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 137, namedSuper_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "namedSuper"

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // src/net/colar/netbeans/fan/antlr/Fan.g:483:1: list : ( type {...}?)? sq_bracketL listItems sq_bracketR ;
    public final FanParser.list_return list() throws RecognitionException {
        FanParser.list_return retval = new FanParser.list_return();
        retval.start = input.LT(1);
        int list_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type500 = null;

        FanParser.sq_bracketL_return sq_bracketL501 = null;

        FanParser.listItems_return listItems502 = null;

        FanParser.sq_bracketR_return sq_bracketR503 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:483:8: ( ( type {...}?)? sq_bracketL listItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:483:10: ( type {...}?)? sq_bracketL listItems sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:483:10: ( type {...}?)?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==SQ_BRACKET_L) ) {
                int LA135_1 = input.LA(2);

                if ( (synpred233_Fan()) ) {
                    alt135=1;
                }
            }
            else if ( (LA135_0==SP_PIPE||LA135_0==ID) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:483:11: type {...}?
                    {
                    pushFollow(FOLLOW_type_in_list3924);
                    type500=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type500.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "list", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_list3930);
            sq_bracketL501=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL501.getTree());
            pushFollow(FOLLOW_listItems_in_list3932);
            listItems502=listItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, listItems502.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_list3934);
            sq_bracketR503=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR503.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 138, list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class listItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:484:1: listItems : ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:484:12: ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( ((LA138_0>=KW_THIS && LA138_0<=KW_SUPER)||(LA138_0>=KW_NULL && LA138_0<=KW_FALSE)||LA138_0==SP_PIPE||LA138_0==OP_CURRY||(LA138_0>=OP_PLUS && LA138_0<=OP_MULTI)||(LA138_0>=OP_BANG && LA138_0<=OP_TILDA)||(LA138_0>=ID && LA138_0<=AT)||(LA138_0>=NUMBER && LA138_0<=SQ_BRACKET_L)||LA138_0==PAR_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:484:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:484:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:484:15: expr ( SP_COMMA expr )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_listItems3943);
                    expr504=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr504.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:484:20: ( SP_COMMA expr )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==SP_COMMA) ) {
                            int LA136_1 = input.LA(2);

                            if ( ((LA136_1>=KW_THIS && LA136_1<=KW_SUPER)||(LA136_1>=KW_NULL && LA136_1<=KW_FALSE)||LA136_1==SP_PIPE||LA136_1==OP_CURRY||(LA136_1>=OP_PLUS && LA136_1<=OP_MULTI)||(LA136_1>=OP_BANG && LA136_1<=OP_TILDA)||(LA136_1>=ID && LA136_1<=AT)||(LA136_1>=NUMBER && LA136_1<=SQ_BRACKET_L)||LA136_1==PAR_L) ) {
                                alt136=1;
                            }


                        }


                        switch (alt136) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:484:21: SP_COMMA expr
                    	    {
                    	    SP_COMMA505=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3946); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA505_tree = (Object)adaptor.create(SP_COMMA505);
                    	    adaptor.addChild(root_0, SP_COMMA505_tree);
                    	    }
                    	    pushFollow(FOLLOW_expr_in_listItems3948);
                    	    expr506=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr506.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:484:38: ( SP_COMMA )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==SP_COMMA) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA507=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3953); if (state.failed) return retval;
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:484:51: SP_COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COMMA508=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3959); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 139, listItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listItems"

    public static class map_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map"
    // src/net/colar/netbeans/fan/antlr/Fan.g:485:1: map : ( mapType {...}?)? sq_bracketL mapItems sq_bracketR ;
    public final FanParser.map_return map() throws RecognitionException {
        FanParser.map_return retval = new FanParser.map_return();
        retval.start = input.LT(1);
        int map_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mapType_return mapType509 = null;

        FanParser.sq_bracketL_return sq_bracketL510 = null;

        FanParser.mapItems_return mapItems511 = null;

        FanParser.sq_bracketR_return sq_bracketR512 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:485:7: ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:485:9: ( mapType {...}?)? sq_bracketL mapItems sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:485:9: ( mapType {...}?)?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==SQ_BRACKET_L) ) {
                int LA139_1 = input.LA(2);

                if ( (synpred237_Fan()) ) {
                    alt139=1;
                }
            }
            else if ( (LA139_0==SP_PIPE||LA139_0==ID) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:485:10: mapType {...}?
                    {
                    pushFollow(FOLLOW_mapType_in_map3969);
                    mapType509=mapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapType509.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "map", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_map3975);
            sq_bracketL510=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL510.getTree());
            pushFollow(FOLLOW_mapItems_in_map3977);
            mapItems511=mapItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mapItems511.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_map3979);
            sq_bracketR512=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR512.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 140, map_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "map"

    public static class mapItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:486:1: mapItems : ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:486:11: ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( ((LA142_0>=KW_THIS && LA142_0<=KW_SUPER)||(LA142_0>=KW_NULL && LA142_0<=KW_FALSE)||LA142_0==SP_PIPE||LA142_0==OP_CURRY||(LA142_0>=OP_PLUS && LA142_0<=OP_MULTI)||(LA142_0>=OP_BANG && LA142_0<=OP_TILDA)||(LA142_0>=ID && LA142_0<=AT)||(LA142_0>=NUMBER && LA142_0<=SQ_BRACKET_L)||LA142_0==PAR_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:486:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:486:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:486:14: mapPair ( SP_COMMA mapPair )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_mapPair_in_mapItems3988);
                    mapPair513=mapPair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair513.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:486:22: ( SP_COMMA mapPair )*
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==SP_COMMA) ) {
                            int LA140_1 = input.LA(2);

                            if ( ((LA140_1>=KW_THIS && LA140_1<=KW_SUPER)||(LA140_1>=KW_NULL && LA140_1<=KW_FALSE)||LA140_1==SP_PIPE||LA140_1==OP_CURRY||(LA140_1>=OP_PLUS && LA140_1<=OP_MULTI)||(LA140_1>=OP_BANG && LA140_1<=OP_TILDA)||(LA140_1>=ID && LA140_1<=AT)||(LA140_1>=NUMBER && LA140_1<=SQ_BRACKET_L)||LA140_1==PAR_L) ) {
                                alt140=1;
                            }


                        }


                        switch (alt140) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:486:23: SP_COMMA mapPair
                    	    {
                    	    SP_COMMA514=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems3991); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA514_tree = (Object)adaptor.create(SP_COMMA514);
                    	    adaptor.addChild(root_0, SP_COMMA514_tree);
                    	    }
                    	    pushFollow(FOLLOW_mapPair_in_mapItems3993);
                    	    mapPair515=mapPair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair515.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop140;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:486:42: ( SP_COMMA )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==SP_COMMA) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA516=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems3997); if (state.failed) return retval;
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:486:55: SP_COLON
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COLON517=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapItems4003); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 141, mapItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapItems"

    public static class mapPair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapPair"
    // src/net/colar/netbeans/fan/antlr/Fan.g:487:1: mapPair : expr SP_COLON expr ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:487:10: ( expr SP_COLON expr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:487:12: expr SP_COLON expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_mapPair4011);
            expr518=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr518.getTree());
            SP_COLON519=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapPair4013); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON519_tree = (Object)adaptor.create(SP_COLON519);
            adaptor.addChild(root_0, SP_COLON519_tree);
            }
            pushFollow(FOLLOW_expr_in_mapPair4015);
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
            if ( state.backtracking>0 ) { memoize(input, 142, mapPair_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapPair"

    public static class simple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple"
    // src/net/colar/netbeans/fan/antlr/Fan.g:488:1: simple : type parL expr parR ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:488:9: ( type parL expr parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:488:11: type parL expr parR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_simple4023);
            type521=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type521.getTree());
            pushFollow(FOLLOW_parL_in_simple4025);
            parL522=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL522.getTree());
            pushFollow(FOLLOW_expr_in_simple4027);
            expr523=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr523.getTree());
            pushFollow(FOLLOW_parR_in_simple4029);
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
            if ( state.backtracking>0 ) { memoize(input, 143, simple_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simple"

    public static class docs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "docs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:490:1: docs : d= ( ( DOC )* ) -> ^( AST_DOCS ( $d)? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:490:7: (d= ( ( DOC )* ) -> ^( AST_DOCS ( $d)? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:490:9: d= ( ( DOC )* )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:490:11: ( ( DOC )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:490:12: ( DOC )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:490:12: ( DOC )*
            loop143:
            do {
                int alt143=2;
                int LA143_0 = input.LA(1);

                if ( (LA143_0==DOC) ) {
                    int LA143_2 = input.LA(2);

                    if ( (synpred241_Fan()) ) {
                        alt143=1;
                    }


                }


                switch (alt143) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: DOC
            	    {
            	    DOC525=(Token)match(input,DOC,FOLLOW_DOC_in_docs4041); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOC.add(DOC525);


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
            // 490:18: -> ^( AST_DOCS ( $d)? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:490:21: ^( AST_DOCS ( $d)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_DOCS, "AST_DOCS"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:490:32: ( $d)?
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
            if ( state.backtracking>0 ) { memoize(input, 144, docs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "docs"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // src/net/colar/netbeans/fan/antlr/Fan.g:492:1: number : ( OP_MINUS )? NUMBER ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:492:9: ( ( OP_MINUS )? NUMBER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:492:12: ( OP_MINUS )? NUMBER
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:492:12: ( OP_MINUS )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==OP_MINUS) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: OP_MINUS
                    {
                    OP_MINUS526=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_number4063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_MINUS526_tree = (Object)adaptor.create(OP_MINUS526);
                    adaptor.addChild(root_0, OP_MINUS526_tree);
                    }

                    }
                    break;

            }

            NUMBER527=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_number4066); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 145, number_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class facet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "facet"
    // src/net/colar/netbeans/fan/antlr/Fan.g:493:1: facet : AT id ( AS_EQUAL expr )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:493:8: ( AT id ( AS_EQUAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:493:10: AT id ( AS_EQUAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            AT528=(Token)match(input,AT,FOLLOW_AT_in_facet4074); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT528_tree = (Object)adaptor.create(AT528);
            adaptor.addChild(root_0, AT528_tree);
            }
            pushFollow(FOLLOW_id_in_facet4076);
            id529=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id529.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:493:16: ( AS_EQUAL expr )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==AS_EQUAL) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:493:17: AS_EQUAL expr
                    {
                    AS_EQUAL530=(Token)match(input,AS_EQUAL,FOLLOW_AS_EQUAL_in_facet4079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_EQUAL530_tree = (Object)adaptor.create(AS_EQUAL530);
                    adaptor.addChild(root_0, AS_EQUAL530_tree);
                    }
                    pushFollow(FOLLOW_expr_in_facet4081);
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
            if ( state.backtracking>0 ) { memoize(input, 146, facet_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "facet"

    public static class eos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eos"
    // src/net/colar/netbeans/fan/antlr/Fan.g:496:1: eos : ( SP_SEMI | {...}?);
    public final FanParser.eos_return eos() throws RecognitionException {
        FanParser.eos_return retval = new FanParser.eos_return();
        retval.start = input.LT(1);
        int eos_StartIndex = input.index();
        Object root_0 = null;

        Token SP_SEMI532=null;

        Object SP_SEMI532_tree=null;

        paraphrase.push("Semicolumn or LineBreak");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:498:3: ( SP_SEMI | {...}?)
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==SP_SEMI) ) {
                int LA146_1 = input.LA(2);

                if ( (synpred244_Fan()) ) {
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
            else if ( (LA146_0==EOF||(LA146_0>=KW_BREAK && LA146_0<=KW_USING)||(LA146_0>=KW_RD_ONLY && LA146_0<=KW_FINAL)||(LA146_0>=KW_CLASS && LA146_0<=KW_ELSE)||(LA146_0>=KW_NULL && LA146_0<=KW_FALSE)||LA146_0==BRACKET_R||LA146_0==SP_COMMA||LA146_0==SP_PIPE||LA146_0==OP_CURRY||(LA146_0>=OP_PLUS && LA146_0<=OP_MULTI)||(LA146_0>=OP_BANG && LA146_0<=OP_TILDA)||(LA146_0>=ID && LA146_0<=SQ_BRACKET_L)||LA146_0==PAR_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:498:5: SP_SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_SEMI532=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_eos4103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_SEMI532_tree = (Object)adaptor.create(SP_SEMI532);
                    adaptor.addChild(root_0, SP_SEMI532_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:498:15: {...}?
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
            if ( state.backtracking>0 ) { memoize(input, 147, eos_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "eos"

    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // src/net/colar/netbeans/fan/antlr/Fan.g:500:1: id : ID -> ^( AST_ID ID ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:502:3: ( ID -> ^( AST_ID ID ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:502:6: ID
            {
            ID533=(Token)match(input,ID,FOLLOW_ID_in_id4127); if (state.failed) return retval; 
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
            // 502:9: -> ^( AST_ID ID )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:502:12: ^( AST_ID ID )
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
            if ( state.backtracking>0 ) { memoize(input, 148, id_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "id"

    public static class getter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:508:1: getter : t= ID {...}?;
    public final FanParser.getter_return getter() throws RecognitionException {
        FanParser.getter_return retval = new FanParser.getter_return();
        retval.start = input.LT(1);
        int getter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:508:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:508:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_getter4148); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 149, getter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "getter"

    public static class setter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:509:1: setter : t= ID {...}?;
    public final FanParser.setter_return setter() throws RecognitionException {
        FanParser.setter_return retval = new FanParser.setter_return();
        retval.start = input.LT(1);
        int setter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:509:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:509:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_setter4161); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 150, setter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "setter"

    public static class pod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pod"
    // src/net/colar/netbeans/fan/antlr/Fan.g:510:1: pod : t= ID {...}?;
    public final FanParser.pod_return pod() throws RecognitionException {
        FanParser.pod_return retval = new FanParser.pod_return();
        retval.start = input.LT(1);
        int pod_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 151) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:510:8: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:510:10: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_pod4175); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 151, pod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pod"

    public static class bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:513:1: bracketL : BRACKET_L ;
    public final FanParser.bracketL_return bracketL() throws RecognitionException {
        FanParser.bracketL_return retval = new FanParser.bracketL_return();
        retval.start = input.LT(1);
        int bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_L534=null;

        Object BRACKET_L534_tree=null;

        paraphrase.push("{");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 152) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:515:3: ( BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:515:5: BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_L534=(Token)match(input,BRACKET_L,FOLLOW_BRACKET_L_in_bracketL4197); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 152, bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketL"

    public static class bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:516:1: bracketR : BRACKET_R ;
    public final FanParser.bracketR_return bracketR() throws RecognitionException {
        FanParser.bracketR_return retval = new FanParser.bracketR_return();
        retval.start = input.LT(1);
        int bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_R535=null;

        Object BRACKET_R535_tree=null;

        paraphrase.push("}");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 153) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:518:3: ( BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:518:5: BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_R535=(Token)match(input,BRACKET_R,FOLLOW_BRACKET_R_in_bracketR4215); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 153, bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketR"

    public static class sq_bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:519:1: sq_bracketL : SQ_BRACKET_L ;
    public final FanParser.sq_bracketL_return sq_bracketL() throws RecognitionException {
        FanParser.sq_bracketL_return retval = new FanParser.sq_bracketL_return();
        retval.start = input.LT(1);
        int sq_bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_L536=null;

        Object SQ_BRACKET_L536_tree=null;

        paraphrase.push("[");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 154) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:521:3: ( SQ_BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:521:5: SQ_BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_L536=(Token)match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_sq_bracketL4233); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 154, sq_bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketL"

    public static class sq_bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:522:1: sq_bracketR : SQ_BRACKET_R ;
    public final FanParser.sq_bracketR_return sq_bracketR() throws RecognitionException {
        FanParser.sq_bracketR_return retval = new FanParser.sq_bracketR_return();
        retval.start = input.LT(1);
        int sq_bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_R537=null;

        Object SQ_BRACKET_R537_tree=null;

        paraphrase.push("]");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 155) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:524:3: ( SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:524:5: SQ_BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_R537=(Token)match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_sq_bracketR4251); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 155, sq_bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketR"

    public static class parL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:525:1: parL : PAR_L ;
    public final FanParser.parL_return parL() throws RecognitionException {
        FanParser.parL_return retval = new FanParser.parL_return();
        retval.start = input.LT(1);
        int parL_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_L538=null;

        Object PAR_L538_tree=null;

        paraphrase.push("(");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 156) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:527:3: ( PAR_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:527:5: PAR_L
            {
            root_0 = (Object)adaptor.nil();

            PAR_L538=(Token)match(input,PAR_L,FOLLOW_PAR_L_in_parL4269); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 156, parL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parL"

    public static class parR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:528:1: parR : PAR_R ;
    public final FanParser.parR_return parR() throws RecognitionException {
        FanParser.parR_return retval = new FanParser.parR_return();
        retval.start = input.LT(1);
        int parR_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_R539=null;

        Object PAR_R539_tree=null;

        paraphrase.push(")");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 157) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:530:3: ( PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:530:5: PAR_R
            {
            root_0 = (Object)adaptor.nil();

            PAR_R539=(Token)match(input,PAR_R,FOLLOW_PAR_R_in_parR4287); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 157, parR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parR"

    // $ANTLR start synpred2_Fan
    public final void synpred2_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:247:19: ( podDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:247:19: podDef
        {
        pushFollow(FOLLOW_podDef_in_synpred2_Fan451);
        podDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Fan

    // $ANTLR start synpred17_Fan
    public final void synpred17_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:271:17: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:271:17: facet
        {
        pushFollow(FOLLOW_facet_in_synpred17_Fan807);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_Fan

    // $ANTLR start synpred19_Fan
    public final void synpred19_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:271:25: ( ( classFlags )* KW_CLASS )
        // src/net/colar/netbeans/fan/antlr/Fan.g:271:26: ( classFlags )* KW_CLASS
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:271:26: ( classFlags )*
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
        	    pushFollow(FOLLOW_classFlags_in_synpred19_Fan812);
        	    classFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop147;
            }
        } while (true);

        match(input,KW_CLASS,FOLLOW_KW_CLASS_in_synpred19_Fan815); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_Fan

    // $ANTLR start synpred21_Fan
    public final void synpred21_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:272:4: ( ( protection )? KW_ENUM )
        // src/net/colar/netbeans/fan/antlr/Fan.g:272:5: ( protection )? KW_ENUM
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:272:5: ( protection )?
        int alt148=2;
        int LA148_0 = input.LA(1);

        if ( ((LA148_0>=KW_PRIVATE && LA148_0<=KW_INTERNAL)) ) {
            alt148=1;
        }
        switch (alt148) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                {
                pushFollow(FOLLOW_protection_in_synpred21_Fan826);
                protection();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,KW_ENUM,FOLLOW_KW_ENUM_in_synpred21_Fan829); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_Fan

    // $ANTLR start synpred48_Fan
    public final void synpred48_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:300:28: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:300:28: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred48_Fan1334); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Fan

    // $ANTLR start synpred49_Fan
    public final void synpred49_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:300:49: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:300:49: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred49_Fan1340); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_Fan

    // $ANTLR start synpred50_Fan
    public final void synpred50_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:300:39: ( LIST_TYPE ( SP_QMARK )? )
        // src/net/colar/netbeans/fan/antlr/Fan.g:300:39: LIST_TYPE ( SP_QMARK )?
        {
        match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_synpred50_Fan1338); if (state.failed) return ;
        // src/net/colar/netbeans/fan/antlr/Fan.g:300:49: ( SP_QMARK )?
        int alt150=2;
        int LA150_0 = input.LA(1);

        if ( (LA150_0==SP_QMARK) ) {
            alt150=1;
        }
        switch (alt150) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                {
                match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred50_Fan1340); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred50_Fan

    // $ANTLR start synpred51_Fan
    public final void synpred51_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:301:12: ( mapType )
        // src/net/colar/netbeans/fan/antlr/Fan.g:301:12: mapType
        {
        pushFollow(FOLLOW_mapType_in_synpred51_Fan1351);
        mapType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_Fan

    // $ANTLR start synpred58_Fan
    public final void synpred58_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:6: ({...}? SP_COLON {...}? type )
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:6: {...}? SP_COLON {...}? type
        {
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred58_Fan", "notAfterEol()");
        }
        match(input,SP_COLON,FOLLOW_SP_COLON_in_synpred58_Fan1419); if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred58_Fan", "notAfterEol()");
        }
        pushFollow(FOLLOW_type_in_synpred58_Fan1423);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_Fan

    // $ANTLR start synpred59_Fan
    public final void synpred59_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:56: ( sq_bracketR )
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:56: sq_bracketR
        {
        pushFollow(FOLLOW_sq_bracketR_in_synpred59_Fan1427);
        sq_bracketR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_Fan

    // $ANTLR start synpred61_Fan
    public final void synpred61_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:308:43: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:308:44: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred61_Fan1469); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_Fan

    // $ANTLR start synpred63_Fan
    public final void synpred63_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:308:74: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:308:75: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred63_Fan1481); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_Fan

    // $ANTLR start synpred65_Fan
    public final void synpred65_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:311:11: ( formalFull )
        // src/net/colar/netbeans/fan/antlr/Fan.g:311:11: formalFull
        {
        pushFollow(FOLLOW_formalFull_in_synpred65_Fan1522);
        formalFull();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_Fan

    // $ANTLR start synpred66_Fan
    public final void synpred66_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:311:24: ( formalTypeOnly )
        // src/net/colar/netbeans/fan/antlr/Fan.g:311:24: formalTypeOnly
        {
        pushFollow(FOLLOW_formalTypeOnly_in_synpred66_Fan1526);
        formalTypeOnly();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_Fan

    // $ANTLR start synpred67_Fan
    public final void synpred67_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:315:13: ( KW_STATIC bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:315:14: KW_STATIC bracketL
        {
        match(input,KW_STATIC,FOLLOW_KW_STATIC_in_synpred67_Fan1574); if (state.failed) return ;
        pushFollow(FOLLOW_bracketL_in_synpred67_Fan1576);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_Fan

    // $ANTLR start synpred68_Fan
    public final void synpred68_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:11: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:316:11: facet
        {
        pushFollow(FOLLOW_facet_in_synpred68_Fan1590);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_Fan

    // $ANTLR start synpred70_Fan
    public final void synpred70_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:7: ( ( ctorFlags )* KW_NEW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:8: ( ctorFlags )* KW_NEW
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:318:8: ( ctorFlags )*
        loop153:
        do {
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( ((LA153_0>=KW_PRIVATE && LA153_0<=KW_INTERNAL)) ) {
                alt153=1;
            }


            switch (alt153) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ctorFlags
        	    {
        	    pushFollow(FOLLOW_ctorFlags_in_synpred70_Fan1607);
        	    ctorFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop153;
            }
        } while (true);

        match(input,KW_NEW,FOLLOW_KW_NEW_in_synpred70_Fan1610); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Fan

    // $ANTLR start synpred73_Fan
    public final void synpred73_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:319:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:319:8: ( methodFlags )* ( type | KW_VOID ) id parL
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:319:8: ( methodFlags )*
        loop154:
        do {
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( ((LA154_0>=KW_STATIC && LA154_0<=KW_NATIVE)||(LA154_0>=KW_OVERRIDE && LA154_0<=KW_FINAL)||(LA154_0>=KW_ABSTRACT && LA154_0<=KW_INTERNAL)||LA154_0==KW_ONCE) ) {
                alt154=1;
            }


            switch (alt154) {
        	case 1 :
        	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: methodFlags
        	    {
        	    pushFollow(FOLLOW_methodFlags_in_synpred73_Fan1624);
        	    methodFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop154;
            }
        } while (true);

        // src/net/colar/netbeans/fan/antlr/Fan.g:319:21: ( type | KW_VOID )
        int alt155=2;
        int LA155_0 = input.LA(1);

        if ( (LA155_0==SP_PIPE||LA155_0==ID||LA155_0==SQ_BRACKET_L) ) {
            alt155=1;
        }
        else if ( (LA155_0==KW_VOID) ) {
            alt155=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 155, 0, input);

            throw nvae;
        }
        switch (alt155) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:319:22: type
                {
                pushFollow(FOLLOW_type_in_synpred73_Fan1628);
                type();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:319:29: KW_VOID
                {
                match(input,KW_VOID,FOLLOW_KW_VOID_in_synpred73_Fan1632); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_id_in_synpred73_Fan1635);
        id();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_parL_in_synpred73_Fan1637);
        parL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_Fan

    // $ANTLR start synpred77_Fan
    public final void synpred77_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:327:29: ( getter )
        // src/net/colar/netbeans/fan/antlr/Fan.g:327:29: getter
        {
        pushFollow(FOLLOW_getter_in_synpred77_Fan1722);
        getter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred77_Fan

    // $ANTLR start synpred79_Fan
    public final void synpred79_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:327:55: ( block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:327:55: block
        {
        pushFollow(FOLLOW_block_in_synpred79_Fan1732);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_Fan

    // $ANTLR start synpred82_Fan
    public final void synpred82_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:12: ( type id )
        // src/net/colar/netbeans/fan/antlr/Fan.g:330:13: type id
        {
        pushFollow(FOLLOW_type_in_synpred82_Fan1779);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_id_in_synpred82_Fan1781);
        id();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred82_Fan

    // $ANTLR start synpred105_Fan
    public final void synpred105_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:343:15: ( multiStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:343:16: multiStmt
        {
        pushFollow(FOLLOW_multiStmt_in_synpred105_Fan2063);
        multiStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_Fan

    // $ANTLR start synpred114_Fan
    public final void synpred114_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:355:6: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:355:7: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred114_Fan2257);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred114_Fan

    // $ANTLR start synpred125_Fan
    public final void synpred125_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:361:22: ( exprStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:361:22: exprStmt
        {
        pushFollow(FOLLOW_exprStmt_in_synpred125_Fan2354);
        exprStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_Fan

    // $ANTLR start synpred126_Fan
    public final void synpred126_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:363:15: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:363:15: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred126_Fan2371);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred126_Fan

    // $ANTLR start synpred130_Fan
    public final void synpred130_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:373:6: ( KW_ELSE block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:373:6: KW_ELSE block
        {
        match(input,KW_ELSE,FOLLOW_KW_ELSE_in_synpred130_Fan2455); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred130_Fan2457);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_Fan

    // $ANTLR start synpred131_Fan
    public final void synpred131_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:374:23: ( eos )
        // src/net/colar/netbeans/fan/antlr/Fan.g:374:23: eos
        {
        pushFollow(FOLLOW_eos_in_synpred131_Fan2469);
        eos();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred131_Fan

    // $ANTLR start synpred134_Fan
    public final void synpred134_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:378:18: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:378:19: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred134_Fan2543);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred134_Fan

    // $ANTLR start synpred135_Fan
    public final void synpred135_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:378:52: ( KW_CATCH )
        // src/net/colar/netbeans/fan/antlr/Fan.g:378:53: KW_CATCH
        {
        match(input,KW_CATCH,FOLLOW_KW_CATCH_in_synpred135_Fan2555); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred135_Fan

    // $ANTLR start synpred136_Fan
    public final void synpred136_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:378:75: ( KW_FINALLY )
        // src/net/colar/netbeans/fan/antlr/Fan.g:378:76: KW_FINALLY
        {
        match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_synpred136_Fan2564); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_Fan

    // $ANTLR start synpred138_Fan
    public final void synpred138_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:383:12: ( forInitDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:383:12: forInitDef
        {
        pushFollow(FOLLOW_forInitDef_in_synpred138_Fan2630);
        forInitDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred138_Fan

    // $ANTLR start synpred140_Fan
    public final void synpred140_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:386:21: ( catchDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:386:21: catchDef
        {
        pushFollow(FOLLOW_catchDef_in_synpred140_Fan2659);
        catchDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred140_Fan

    // $ANTLR start synpred141_Fan
    public final void synpred141_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:386:32: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:386:33: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred141_Fan2664);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred141_Fan

    // $ANTLR start synpred142_Fan
    public final void synpred142_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:390:25: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:390:26: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred142_Fan2705);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred142_Fan

    // $ANTLR start synpred162_Fan
    public final void synpred162_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:26: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
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

        pushFollow(FOLLOW_bitAndExpr_in_synpred162_Fan2996);
        bitAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred162_Fan

    // $ANTLR start synpred163_Fan
    public final void synpred163_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:416:26: ( OP_CURRY shiftExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:416:26: OP_CURRY shiftExpr
        {
        match(input,OP_CURRY,FOLLOW_OP_CURRY_in_synpred163_Fan3010); if (state.failed) return ;
        pushFollow(FOLLOW_shiftExpr_in_synpred163_Fan3012);
        shiftExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred163_Fan

    // $ANTLR start synpred167_Fan
    public final void synpred167_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:418:22: ( ( OP_PLUS | OP_MINUS ) multExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:418:22: ( OP_PLUS | OP_MINUS ) multExpr
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

        pushFollow(FOLLOW_multExpr_in_synpred167_Fan3057);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred167_Fan

    // $ANTLR start synpred171_Fan
    public final void synpred171_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:420:24: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:420:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
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

        pushFollow(FOLLOW_parenExpr_in_synpred171_Fan3098);
        parenExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred171_Fan

    // $ANTLR start synpred172_Fan
    public final void synpred172_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:421:14: ( castExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:421:14: castExpr
        {
        pushFollow(FOLLOW_castExpr_in_synpred172_Fan3109);
        castExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred172_Fan

    // $ANTLR start synpred173_Fan
    public final void synpred173_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:421:25: ( groupedExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:421:25: groupedExpr
        {
        pushFollow(FOLLOW_groupedExpr_in_synpred173_Fan3113);
        groupedExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred173_Fan

    // $ANTLR start synpred174_Fan
    public final void synpred174_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:425:31: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:425:31: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred174_Fan3149);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred174_Fan

    // $ANTLR start synpred175_Fan
    public final void synpred175_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:426:14: ( prefixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:426:14: prefixExpr
        {
        pushFollow(FOLLOW_prefixExpr_in_synpred175_Fan3158);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred175_Fan

    // $ANTLR start synpred176_Fan
    public final void synpred176_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:426:27: ( postfixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:426:27: postfixExpr
        {
        pushFollow(FOLLOW_postfixExpr_in_synpred176_Fan3162);
        postfixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred176_Fan

    // $ANTLR start synpred184_Fan
    public final void synpred184_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:429:22: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:429:22: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred184_Fan3230);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred184_Fan

    // $ANTLR start synpred185_Fan
    public final void synpred185_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:13: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:13: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred185_Fan3262);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred185_Fan

    // $ANTLR start synpred186_Fan
    public final void synpred186_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:25: ( literal )
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:25: literal
        {
        pushFollow(FOLLOW_literal_in_synpred186_Fan3266);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred186_Fan

    // $ANTLR start synpred187_Fan
    public final void synpred187_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:35: ( typeBase )
        // src/net/colar/netbeans/fan/antlr/Fan.g:432:35: typeBase
        {
        pushFollow(FOLLOW_typeBase_in_synpred187_Fan3270);
        typeBase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred187_Fan

    // $ANTLR start synpred188_Fan
    public final void synpred188_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:433:12: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:433:12: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred188_Fan3281);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred188_Fan

    // $ANTLR start synpred189_Fan
    public final void synpred189_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:433:26: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:433:26: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred189_Fan3285);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred189_Fan

    // $ANTLR start synpred190_Fan
    public final void synpred190_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:433:40: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:433:40: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred190_Fan3289);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred190_Fan

    // $ANTLR start synpred191_Fan
    public final void synpred191_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:433:53: ( staticCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:433:53: staticCall
        {
        pushFollow(FOLLOW_staticCall_in_synpred191_Fan3293);
        staticCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred191_Fan

    // $ANTLR start synpred192_Fan
    public final void synpred192_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:434:19: ( dsl )
        // src/net/colar/netbeans/fan/antlr/Fan.g:434:19: dsl
        {
        pushFollow(FOLLOW_dsl_in_synpred192_Fan3315);
        dsl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred192_Fan

    // $ANTLR start synpred193_Fan
    public final void synpred193_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:434:25: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:434:25: closure
        {
        pushFollow(FOLLOW_closure_in_synpred193_Fan3319);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred193_Fan

    // $ANTLR start synpred194_Fan
    public final void synpred194_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:434:35: ( simple )
        // src/net/colar/netbeans/fan/antlr/Fan.g:434:35: simple
        {
        pushFollow(FOLLOW_simple_in_synpred194_Fan3323);
        simple();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred194_Fan

    // $ANTLR start synpred195_Fan
    public final void synpred195_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:439:14: ( dotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:439:14: dotCall
        {
        pushFollow(FOLLOW_dotCall_in_synpred195_Fan3378);
        dotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred195_Fan

    // $ANTLR start synpred197_Fan
    public final void synpred197_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:439:34: ( safeDotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:439:34: safeDotCall
        {
        pushFollow(FOLLOW_safeDotCall_in_synpred197_Fan3386);
        safeDotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred197_Fan

    // $ANTLR start synpred202_Fan
    public final void synpred202_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:440:35: ( incDotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:440:35: incDotCall
        {
        pushFollow(FOLLOW_incDotCall_in_synpred202_Fan3409);
        incDotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred202_Fan

    // $ANTLR start synpred207_Fan
    public final void synpred207_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:458:45: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:458:45: closure
        {
        pushFollow(FOLLOW_closure_in_synpred207_Fan3583);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred207_Fan

    // $ANTLR start synpred208_Fan
    public final void synpred208_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:462:12: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:462:12: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred208_Fan3617);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred208_Fan

    // $ANTLR start synpred224_Fan
    public final void synpred224_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:475:20: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:475:20: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred224_Fan3786);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred224_Fan

    // $ANTLR start synpred225_Fan
    public final void synpred225_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:4: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:4: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred225_Fan3793);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred225_Fan

    // $ANTLR start synpred226_Fan
    public final void synpred226_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:18: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:18: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred226_Fan3797);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred226_Fan

    // $ANTLR start synpred227_Fan
    public final void synpred227_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:32: ( list )
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:32: list
        {
        pushFollow(FOLLOW_list_in_synpred227_Fan3801);
        list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred227_Fan

    // $ANTLR start synpred228_Fan
    public final void synpred228_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:39: ( map )
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:39: map
        {
        pushFollow(FOLLOW_map_in_synpred228_Fan3805);
        map();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred228_Fan

    // $ANTLR start synpred233_Fan
    public final void synpred233_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:483:11: ( type {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:483:11: type {...}?
        {
        pushFollow(FOLLOW_type_in_synpred233_Fan3924);
        type();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred233_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred233_Fan

    // $ANTLR start synpred237_Fan
    public final void synpred237_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:485:10: ( mapType {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:485:10: mapType {...}?
        {
        pushFollow(FOLLOW_mapType_in_synpred237_Fan3969);
        mapType();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred237_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred237_Fan

    // $ANTLR start synpred241_Fan
    public final void synpred241_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:490:12: ( DOC )
        // src/net/colar/netbeans/fan/antlr/Fan.g:490:12: DOC
        {
        match(input,DOC,FOLLOW_DOC_in_synpred241_Fan4041); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred241_Fan

    // $ANTLR start synpred244_Fan
    public final void synpred244_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:498:5: ( SP_SEMI )
        // src/net/colar/netbeans/fan/antlr/Fan.g:498:5: SP_SEMI
        {
        match(input,SP_SEMI,FOLLOW_SP_SEMI_in_synpred244_Fan4103); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred244_Fan

    // Delegated rules

    public final boolean synpred233_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred233_Fan_fragment(); // can never throw exception
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
    public final boolean synpred193_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred193_Fan_fragment(); // can never throw exception
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
    public final boolean synpred195_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred195_Fan_fragment(); // can never throw exception
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
    public final boolean synpred244_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred244_Fan_fragment(); // can never throw exception
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
    public final boolean synpred176_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred176_Fan_fragment(); // can never throw exception
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA91 dfa91 = new DFA91(this);
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
    protected DFA120 dfa120 = new DFA120(this);
    protected DFA125 dfa125 = new DFA125(this);
    protected DFA131 dfa131 = new DFA131(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\1\4\14\uffff";
    static final String DFA3_minS =
        "\1\24\2\0\12\uffff";
    static final String DFA3_maxS =
        "\1\173\2\0\12\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2\10\uffff";
    static final String DFA3_specialS =
        "\1\uffff\1\0\1\1\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\4\4\uffff\1\4\1\uffff\10\4\120\uffff\1\3\5\uffff\1\2\1\1",
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
            return "247:18: ( podDef | ( typeDef )* )";
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
        "\2\173\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\3\4\uffff\1\3\1\uffff\10\3\126\uffff\1\3\1\1",
            "\2\3\4\uffff\1\3\1\uffff\10\3\126\uffff\1\3\1\1",
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
            return "()* loopback of 247:28: ( typeDef )*";
        }
    }
    static final String DFA4_eotS =
        "\20\uffff";
    static final String DFA4_eofS =
        "\1\uffff\1\4\1\uffff\1\7\2\uffff\1\4\2\uffff\2\4\1\7\1\15\3\uffff";
    static final String DFA4_minS =
        "\2\21\1\164\1\21\1\uffff\1\176\1\21\1\uffff\1\120\4\21\1\uffff\1"+
        "\120\1\uffff";
    static final String DFA4_maxS =
        "\1\21\1\175\1\164\1\173\1\uffff\1\176\1\173\1\uffff\1\164\3\173"+
        "\1\u0099\1\uffff\1\164\1\uffff";
    static final String DFA4_acceptS =
        "\4\uffff\1\4\2\uffff\1\1\5\uffff\1\2\1\uffff\1\3";
    static final String DFA4_specialS =
        "\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\65\uffff\1\4\32\uffff"+
            "\1\3\5\uffff\2\4\1\uffff\1\2",
            "\1\5",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\52\uffff\1\11\1\6"+
            "\11\uffff\1\7\32\uffff\1\10\5\uffff\2\7",
            "",
            "\1\12",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\65\uffff\1\4\32\uffff"+
            "\1\13\5\uffff\2\4",
            "",
            "\1\4\43\uffff\1\7",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\65\uffff\1\4\32\uffff"+
            "\1\14\5\uffff\2\4",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\65\uffff\1\4\32\uffff"+
            "\1\3\5\uffff\2\4",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\52\uffff\1\11\1\6"+
            "\11\uffff\1\7\32\uffff\1\10\5\uffff\2\7",
            "\1\15\1\17\1\uffff\2\15\4\uffff\1\15\1\uffff\10\15\65\uffff"+
            "\1\15\32\uffff\1\16\5\uffff\2\15\35\uffff\1\17",
            "",
            "\1\4\43\uffff\1\15",
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
            return "249:5: ( usingPod | usingType | usingAs | incUsing )";
        }
    }
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\1\uffff\1\4\4\uffff\1\12\1\uffff\1\14\4\uffff";
    static final String DFA6_minS =
        "\2\21\1\164\1\116\1\uffff\1\176\1\21\1\uffff\1\21\1\116\1\uffff"+
        "\1\116\1\uffff";
    static final String DFA6_maxS =
        "\1\21\1\175\2\164\1\uffff\1\176\1\173\1\uffff\1\173\1\164\1\uffff"+
        "\1\164\1\uffff";
    static final String DFA6_acceptS =
        "\4\uffff\1\1\2\uffff\1\4\2\uffff\1\3\1\uffff\1\2";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\4\2\uffff\2\4\4\uffff\1\4\1\uffff\10\4\65\uffff\1\4\32\uffff"+
            "\1\3\5\uffff\2\4\1\uffff\1\2",
            "\1\5",
            "\1\7\1\6\44\uffff\1\4",
            "",
            "\1\10",
            "\1\12\2\uffff\2\12\4\uffff\1\12\1\uffff\10\12\65\uffff\1\12"+
            "\32\uffff\1\11\5\uffff\2\12",
            "",
            "\1\14\2\uffff\2\14\4\uffff\1\14\1\uffff\10\14\65\uffff\1\14"+
            "\32\uffff\1\13\5\uffff\2\14",
            "\1\7\1\6\44\uffff\1\12",
            "",
            "\1\7\1\6\44\uffff\1\14",
            ""
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
            return "260:14: ( ( KW_USING eos ) | ( KW_USING ffi eos ) | ( KW_USING podSpec DOT eos ) | ( KW_USING podSpec SP_COLCOL eos ) )";
        }
    }
    static final String DFA14_eotS =
        "\13\uffff";
    static final String DFA14_eofS =
        "\13\uffff";
    static final String DFA14_minS =
        "\1\24\3\0\1\uffff\3\0\3\uffff";
    static final String DFA14_maxS =
        "\1\173\3\0\1\uffff\3\0\3\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\1\3\uffff\1\1\1\2\1\3";
    static final String DFA14_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\3\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\6\1\7\4\uffff\1\5\1\uffff\1\10\1\11\1\12\1\4\4\3\126\uffff"+
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
            return "271:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )";
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
    static final String DFA51_eotS =
        "\23\uffff";
    static final String DFA51_eofS =
        "\23\uffff";
    static final String DFA51_minS =
        "\1\23\1\0\21\uffff";
    static final String DFA51_maxS =
        "\1\175\1\0\21\uffff";
    static final String DFA51_acceptS =
        "\2\uffff\1\2\17\uffff\1\1";
    static final String DFA51_specialS =
        "\1\uffff\1\0\21\uffff}>";
    static final String[] DFA51_transitionS = {
            "\2\2\1\1\5\2\4\uffff\7\2\61\uffff\1\2\34\uffff\1\2\5\uffff\2"+
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
            return "315:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_1 = input.LA(1);

                         
                        int index51_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index51_1);
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
    static final String DFA50_eotS =
        "\22\uffff";
    static final String DFA50_eofS =
        "\22\uffff";
    static final String DFA50_minS =
        "\1\23\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA50_maxS =
        "\1\175\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA50_acceptS =
        "\4\uffff\1\1\4\uffff\1\2\5\uffff\1\3\2\uffff";
    static final String DFA50_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12"+
        "\1\13\1\14\3\uffff}>";
    static final String[] DFA50_transitionS = {
            "\2\17\1\10\1\12\1\17\1\6\1\5\1\13\4\uffff\1\7\4\3\1\4\1\11\61"+
            "\uffff\1\15\34\uffff\1\16\5\uffff\1\2\1\1\1\uffff\1\14",
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
            return "317:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_0 = input.LA(1);

                         
                        int index50_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_0==DOC) ) {s = 1;}

                        else if ( (LA50_0==AT) ) {s = 2;}

                        else if ( ((LA50_0>=KW_PRIVATE && LA50_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA50_0==KW_NEW) && (synpred70_Fan())) {s = 4;}

                        else if ( (LA50_0==KW_VIRTUAL) ) {s = 5;}

                        else if ( (LA50_0==KW_OVERRIDE) ) {s = 6;}

                        else if ( (LA50_0==KW_ABSTRACT) ) {s = 7;}

                        else if ( (LA50_0==KW_STATIC) ) {s = 8;}

                        else if ( (LA50_0==KW_ONCE) && (synpred73_Fan())) {s = 9;}

                        else if ( (LA50_0==KW_NATIVE) ) {s = 10;}

                        else if ( (LA50_0==KW_FINAL) ) {s = 11;}

                        else if ( (LA50_0==SQ_BRACKET_L) ) {s = 12;}

                        else if ( (LA50_0==SP_PIPE) ) {s = 13;}

                        else if ( (LA50_0==ID) ) {s = 14;}

                        else if ( ((LA50_0>=KW_RD_ONLY && LA50_0<=KW_CONST)||LA50_0==KW_VOLATILE) ) {s = 15;}

                         
                        input.seek(index50_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_1 = input.LA(1);

                         
                        int index50_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Fan()) ) {s = 4;}

                        else if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index50_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_2 = input.LA(1);

                         
                        int index50_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Fan()) ) {s = 4;}

                        else if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index50_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_3 = input.LA(1);

                         
                        int index50_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Fan()) ) {s = 4;}

                        else if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index50_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_5 = input.LA(1);

                         
                        int index50_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index50_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA50_6 = input.LA(1);

                         
                        int index50_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index50_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA50_7 = input.LA(1);

                         
                        int index50_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index50_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA50_8 = input.LA(1);

                         
                        int index50_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index50_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA50_10 = input.LA(1);

                         
                        int index50_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index50_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA50_11 = input.LA(1);

                         
                        int index50_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index50_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA50_12 = input.LA(1);

                         
                        int index50_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index50_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA50_13 = input.LA(1);

                         
                        int index50_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index50_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA50_14 = input.LA(1);

                         
                        int index50_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index50_14);
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
    static final String DFA60_eotS =
        "\12\uffff";
    static final String DFA60_eofS =
        "\3\uffff\1\11\6\uffff";
    static final String DFA60_minS =
        "\1\127\2\uffff\1\4\4\uffff\1\0\1\uffff";
    static final String DFA60_maxS =
        "\1\175\2\uffff\1\177\4\uffff\1\0\1\uffff";
    static final String DFA60_acceptS =
        "\1\uffff\2\1\1\uffff\4\1\1\uffff\1\2";
    static final String DFA60_specialS =
        "\1\2\2\uffff\1\0\4\uffff\1\1\1\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\2\34\uffff\1\3\10\uffff\1\1",
            "",
            "",
            "\15\11\2\uffff\10\11\4\uffff\12\11\2\uffff\4\11\37\uffff\1"+
            "\4\1\uffff\3\11\1\7\1\11\1\5\1\6\1\11\1\uffff\1\11\13\uffff"+
            "\1\11\2\uffff\3\11\2\uffff\4\11\3\uffff\1\10\11\11\1\uffff\1"+
            "\11",
            "",
            "",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "330:11: ( ( type id )=> typeAndId | fieldId )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_3 = input.LA(1);

                         
                        int index60_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_3==SP_COLCOL) && (synpred82_Fan())) {s = 4;}

                        else if ( (LA60_3==SP_QMARK) && (synpred82_Fan())) {s = 5;}

                        else if ( (LA60_3==LIST_TYPE) && (synpred82_Fan())) {s = 6;}

                        else if ( (LA60_3==SP_COLON) && (synpred82_Fan())) {s = 7;}

                        else if ( (LA60_3==ID) ) {s = 8;}

                        else if ( (LA60_3==EOF||(LA60_3>=KW_BREAK && LA60_3<=KW_FINALLY)||(LA60_3>=KW_RD_ONLY && LA60_3<=KW_FINAL)||(LA60_3>=KW_ABSTRACT && LA60_3<=KW_ELSE)||(LA60_3>=KW_NULL && LA60_3<=KW_FALSE)||(LA60_3>=BRACKET_L && LA60_3<=AS_INIT_VAL)||LA60_3==SP_COMMA||LA60_3==SP_PIPE||LA60_3==SP_SEMI||LA60_3==OP_CURRY||(LA60_3>=OP_PLUS && LA60_3<=OP_MULTI)||(LA60_3>=OP_BANG && LA60_3<=OP_TILDA)||(LA60_3>=URI && LA60_3<=SQ_BRACKET_L)||LA60_3==PAR_L) ) {s = 9;}

                         
                        input.seek(index60_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_8 = input.LA(1);

                         
                        int index60_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index60_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_0 = input.LA(1);

                         
                        int index60_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_0==SQ_BRACKET_L) && (synpred82_Fan())) {s = 1;}

                        else if ( (LA60_0==SP_PIPE) && (synpred82_Fan())) {s = 2;}

                        else if ( (LA60_0==ID) ) {s = 3;}

                         
                        input.seek(index60_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\37\uffff";
    static final String DFA78_eofS =
        "\37\uffff";
    static final String DFA78_minS =
        "\1\4\14\uffff\2\0\14\uffff\1\0\3\uffff";
    static final String DFA78_maxS =
        "\1\177\14\uffff\2\0\14\uffff\1\0\3\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\23\uffff\1\13";
    static final String DFA78_specialS =
        "\15\uffff\1\0\1\1\14\uffff\1\2\3\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\4\1\5\1\2\1\1\1\6\1\7\1\10\1\3\1\11\31\uffff\2\12\3\uffff"+
            "\4\12\50\uffff\1\16\15\uffff\1\12\2\uffff\3\12\2\uffff\4\12"+
            "\3\uffff\1\15\6\12\1\uffff\1\12\1\33\1\uffff\1\12",
            "",
            "",
            "",
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
            "\1\uffff",
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
            return "359:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_13 = input.LA(1);

                         
                        int index78_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index78_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_14 = input.LA(1);

                         
                        int index78_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index78_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA78_27 = input.LA(1);

                         
                        int index78_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred125_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index78_27);
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
    static final String DFA79_eotS =
        "\65\uffff";
    static final String DFA79_eofS =
        "\1\1\64\uffff";
    static final String DFA79_minS =
        "\1\4\4\uffff\1\0\2\uffff\1\0\7\uffff\2\0\5\uffff\31\0\5\uffff";
    static final String DFA79_maxS =
        "\1\177\4\uffff\1\0\2\uffff\1\0\7\uffff\2\0\5\uffff\31\0\5\uffff";
    static final String DFA79_acceptS =
        "\1\uffff\1\2\62\uffff\1\1";
    static final String DFA79_specialS =
        "\5\uffff\1\0\2\uffff\1\1\7\uffff\1\2\1\3\5\uffff\1\4\1\5\1\6\1\7"+
        "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
        "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\5\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\32\1\33\1\30\1\27\1\34\1\35\1\36\1\31\1\37\4\1\2\uffff\10"+
            "\1\4\uffff\7\1\1\44\1\45\1\1\2\uffff\1\43\1\46\1\47\1\50\42"+
            "\uffff\1\1\2\uffff\1\1\2\uffff\1\21\1\uffff\1\1\13\uffff\1\54"+
            "\2\uffff\1\54\1\41\1\42\2\uffff\4\54\3\uffff\1\5\1\53\1\56\1"+
            "\51\1\52\1\57\1\10\1\1\1\55\1\20\1\uffff\1\40",
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
            return "()* loopback of 363:15: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_5 = input.LA(1);

                         
                        int index79_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_8 = input.LA(1);

                         
                        int index79_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_16 = input.LA(1);

                         
                        int index79_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA79_17 = input.LA(1);

                         
                        int index79_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_17);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA79_23 = input.LA(1);

                         
                        int index79_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA79_24 = input.LA(1);

                         
                        int index79_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_24);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA79_25 = input.LA(1);

                         
                        int index79_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_25);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA79_26 = input.LA(1);

                         
                        int index79_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_26);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA79_27 = input.LA(1);

                         
                        int index79_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_27);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA79_28 = input.LA(1);

                         
                        int index79_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_28);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA79_29 = input.LA(1);

                         
                        int index79_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_29);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA79_30 = input.LA(1);

                         
                        int index79_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_30);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA79_31 = input.LA(1);

                         
                        int index79_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_31);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA79_32 = input.LA(1);

                         
                        int index79_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred126_Fan()&&(notAfterEol()))||synpred126_Fan()||(synpred126_Fan()&&(notAfterEol()))||(synpred126_Fan()&&(notAfterEol())))) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_32);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA79_33 = input.LA(1);

                         
                        int index79_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_33);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA79_34 = input.LA(1);

                         
                        int index79_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_34);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA79_35 = input.LA(1);

                         
                        int index79_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_35);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA79_36 = input.LA(1);

                         
                        int index79_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_36);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA79_37 = input.LA(1);

                         
                        int index79_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_37);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA79_38 = input.LA(1);

                         
                        int index79_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_38);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA79_39 = input.LA(1);

                         
                        int index79_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_39);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA79_40 = input.LA(1);

                         
                        int index79_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_40);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA79_41 = input.LA(1);

                         
                        int index79_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_41);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA79_42 = input.LA(1);

                         
                        int index79_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_42);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA79_43 = input.LA(1);

                         
                        int index79_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_43);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA79_44 = input.LA(1);

                         
                        int index79_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_44);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA79_45 = input.LA(1);

                         
                        int index79_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_45);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA79_46 = input.LA(1);

                         
                        int index79_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_46);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA79_47 = input.LA(1);

                         
                        int index79_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred126_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index79_47);
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
    static final String DFA84_eotS =
        "\65\uffff";
    static final String DFA84_eofS =
        "\1\1\64\uffff";
    static final String DFA84_minS =
        "\1\4\3\uffff\1\0\2\uffff\1\0\7\uffff\2\0\16\uffff\20\0\6\uffff";
    static final String DFA84_maxS =
        "\1\177\3\uffff\1\0\2\uffff\1\0\7\uffff\2\0\16\uffff\20\0\6\uffff";
    static final String DFA84_acceptS =
        "\1\uffff\1\1\62\uffff\1\2";
    static final String DFA84_specialS =
        "\4\uffff\1\0\2\uffff\1\1\7\uffff\1\2\1\3\16\uffff\1\4\1\5\1\6\1"+
        "\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\6"+
        "\uffff}>";
    static final String[] DFA84_transitionS = {
            "\15\1\2\uffff\10\1\4\uffff\7\1\1\43\1\44\1\1\2\uffff\1\42\1"+
            "\45\1\46\1\47\42\uffff\1\1\2\uffff\1\1\2\uffff\1\20\1\uffff"+
            "\1\1\13\uffff\1\53\2\uffff\1\53\1\40\1\41\2\uffff\4\53\3\uffff"+
            "\1\4\1\52\1\55\1\50\1\51\1\56\1\7\1\1\1\54\1\17\1\uffff\1\37",
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

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "374:22: ( eos | expr eos )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_4 = input.LA(1);

                         
                        int index84_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA84_7 = input.LA(1);

                         
                        int index84_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA84_15 = input.LA(1);

                         
                        int index84_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA84_16 = input.LA(1);

                         
                        int index84_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA84_31 = input.LA(1);

                         
                        int index84_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||(synpred131_Fan()&&(lookupNL()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred131_Fan()&&(lookupNL()))&&(notAfterEol())))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_31);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA84_32 = input.LA(1);

                         
                        int index84_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_32);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA84_33 = input.LA(1);

                         
                        int index84_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_33);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA84_34 = input.LA(1);

                         
                        int index84_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_34);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA84_35 = input.LA(1);

                         
                        int index84_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_35);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA84_36 = input.LA(1);

                         
                        int index84_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_36);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA84_37 = input.LA(1);

                         
                        int index84_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_37);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA84_38 = input.LA(1);

                         
                        int index84_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_38);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA84_39 = input.LA(1);

                         
                        int index84_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_39);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA84_40 = input.LA(1);

                         
                        int index84_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_40);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA84_41 = input.LA(1);

                         
                        int index84_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_41);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA84_42 = input.LA(1);

                         
                        int index84_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_42);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA84_43 = input.LA(1);

                         
                        int index84_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_43);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA84_44 = input.LA(1);

                         
                        int index84_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_44);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA84_45 = input.LA(1);

                         
                        int index84_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_45);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA84_46 = input.LA(1);

                         
                        int index84_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred131_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index84_46);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA91_eotS =
        "\26\uffff";
    static final String DFA91_eofS =
        "\26\uffff";
    static final String DFA91_minS =
        "\1\46\3\0\22\uffff";
    static final String DFA91_maxS =
        "\1\177\3\0\22\uffff";
    static final String DFA91_acceptS =
        "\4\uffff\1\2\20\uffff\1\1";
    static final String DFA91_specialS =
        "\1\uffff\1\0\1\1\1\2\22\uffff}>";
    static final String[] DFA91_transitionS = {
            "\2\4\3\uffff\4\4\50\uffff\1\2\15\uffff\1\4\2\uffff\3\4\2\uffff"+
            "\4\4\3\uffff\1\3\6\4\1\uffff\1\4\1\1\1\uffff\1\4",
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
            return "383:1: forInit : ( forInitDef | expr );";
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
                        if ( (synpred138_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA91_2 = input.LA(1);

                         
                        int index91_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index91_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA91_3 = input.LA(1);

                         
                        int index91_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index91_3);
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
    static final String DFA93_eotS =
        "\66\uffff";
    static final String DFA93_eofS =
        "\1\2\65\uffff";
    static final String DFA93_minS =
        "\1\4\1\0\64\uffff";
    static final String DFA93_maxS =
        "\1\177\1\0\64\uffff";
    static final String DFA93_acceptS =
        "\2\uffff\1\2\62\uffff\1\1";
    static final String DFA93_specialS =
        "\1\uffff\1\0\64\uffff}>";
    static final String[] DFA93_transitionS = {
            "\15\2\2\uffff\10\2\4\uffff\12\2\2\uffff\4\2\41\uffff\2\2\2\uffff"+
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
            return "386:21: ( catchDef )?";
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
                        if ( (synpred140_Fan()) ) {s = 53;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index93_1);
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
        "\1\4\17\uffff\1\0\64\uffff";
    static final String DFA109_maxS =
        "\1\u0080\17\uffff\1\0\64\uffff";
    static final String DFA109_acceptS =
        "\1\uffff\1\2\102\uffff\1\1";
    static final String DFA109_specialS =
        "\20\uffff\1\0\64\uffff}>";
    static final String[] DFA109_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\41\uffff\2\1\1\uffff\3\1\1\uffff"+
            "\1\20\1\uffff\13\1\1\104\1\1\2\uffff\3\1\2\uffff\4\1\3\uffff"+
            "\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 415:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_16 = input.LA(1);

                         
                        int index109_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Fan()) ) {s = 68;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index109_16);
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
        "\1\4\67\uffff\1\0\16\uffff";
    static final String DFA110_maxS =
        "\1\u0080\67\uffff\1\0\16\uffff";
    static final String DFA110_acceptS =
        "\1\uffff\1\2\104\uffff\1\1";
    static final String DFA110_specialS =
        "\70\uffff\1\0\16\uffff}>";
    static final String[] DFA110_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\41\uffff\2\1\1\uffff\3\1\1\uffff"+
            "\1\1\1\uffff\14\1\1\70\2\uffff\3\1\2\uffff\4\1\3\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 416:25: ( OP_CURRY shiftExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_56 = input.LA(1);

                         
                        int index110_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred163_Fan()) ) {s = 70;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index110_56);
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
        "\1\4\56\uffff\1\0\12\uffff\1\0\16\uffff";
    static final String DFA112_maxS =
        "\1\u0080\56\uffff\1\0\12\uffff\1\0\16\uffff";
    static final String DFA112_acceptS =
        "\1\uffff\1\2\106\uffff\1\1";
    static final String DFA112_specialS =
        "\57\uffff\1\0\12\uffff\1\1\16\uffff}>";
    static final String[] DFA112_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\41\uffff\2\1\1\uffff\3\1\1\uffff"+
            "\1\1\1\uffff\17\1\1\72\1\57\1\1\2\uffff\4\1\3\uffff\15\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 418:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*";
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
                        if ( (synpred167_Fan()) ) {s = 72;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index112_47);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA112_58 = input.LA(1);

                         
                        int index112_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred167_Fan()) ) {s = 72;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index112_58);
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
        "\27\uffff";
    static final String DFA114_eofS =
        "\27\uffff";
    static final String DFA114_minS =
        "\1\46\1\0\25\uffff";
    static final String DFA114_maxS =
        "\1\177\1\0\25\uffff";
    static final String DFA114_acceptS =
        "\2\uffff\1\3\22\uffff\1\1\1\2";
    static final String DFA114_specialS =
        "\1\uffff\1\0\25\uffff}>";
    static final String[] DFA114_transitionS = {
            "\2\2\3\uffff\4\2\50\uffff\1\2\15\uffff\1\2\2\uffff\3\2\2\uffff"+
            "\4\2\3\uffff\7\2\1\uffff\2\2\1\uffff\1\1",
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
            return "421:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );";
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
                        if ( ((synpred172_Fan()&&(notAfterEol()))) ) {s = 21;}

                        else if ( (synpred173_Fan()) ) {s = 22;}

                        else if ( ((notAfterEol())) ) {s = 2;}

                         
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
        "\1\4\24\uffff\1\0\2\uffff\1\0\27\uffff\1\0\34\uffff";
    static final String DFA115_maxS =
        "\1\u0080\24\uffff\1\0\2\uffff\1\0\27\uffff\1\0\34\uffff";
    static final String DFA115_acceptS =
        "\1\uffff\1\2\107\uffff\1\1\3\uffff";
    static final String DFA115_specialS =
        "\25\uffff\1\0\2\uffff\1\1\27\uffff\1\2\34\uffff}>";
    static final String[] DFA115_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\40\uffff\1\111\1\30\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\111\30\1\1\uffff\2\111\11\1\1\25\1\1\1\60"+
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
            return "()* loopback of 425:31: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA115_21 = input.LA(1);

                         
                        int index115_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred174_Fan()&&(notAfterEol()))) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index115_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA115_24 = input.LA(1);

                         
                        int index115_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred174_Fan()) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index115_24);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA115_48 = input.LA(1);

                         
                        int index115_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred174_Fan()&&(notAfterEol()))) ) {s = 73;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL())||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol())))) ) {s = 1;}

                         
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
        "\27\uffff";
    static final String DFA116_eofS =
        "\27\uffff";
    static final String DFA116_minS =
        "\1\46\16\0\1\uffff\5\0\2\uffff";
    static final String DFA116_maxS =
        "\1\177\16\0\1\uffff\5\0\2\uffff";
    static final String DFA116_acceptS =
        "\17\uffff\1\1\5\uffff\1\2\1\3";
    static final String DFA116_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\uffff\1\16\1\17\1\20\1\21\1\22\2\uffff}>";
    static final String[] DFA116_transitionS = {
            "\1\7\1\10\3\uffff\1\6\1\11\1\12\1\13\50\uffff\1\5\15\uffff\1"+
            "\17\2\uffff\1\17\1\1\1\2\2\uffff\4\17\3\uffff\1\3\1\16\1\21"+
            "\1\14\1\15\1\23\1\24\1\uffff\1\20\1\22\1\uffff\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "426:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );";
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
                        if ( (synpred175_Fan()) ) {s = 15;}

                        else if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA116_2 = input.LA(1);

                         
                        int index116_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA116_3 = input.LA(1);

                         
                        int index116_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA116_4 = input.LA(1);

                         
                        int index116_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred176_Fan()&&(notAfterEol()))) ) {s = 21;}

                        else if ( ((notAfterEol())) ) {s = 22;}

                         
                        input.seek(index116_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA116_5 = input.LA(1);

                         
                        int index116_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA116_6 = input.LA(1);

                         
                        int index116_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA116_7 = input.LA(1);

                         
                        int index116_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA116_8 = input.LA(1);

                         
                        int index116_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA116_9 = input.LA(1);

                         
                        int index116_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA116_10 = input.LA(1);

                         
                        int index116_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA116_11 = input.LA(1);

                         
                        int index116_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA116_12 = input.LA(1);

                         
                        int index116_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA116_13 = input.LA(1);

                         
                        int index116_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA116_14 = input.LA(1);

                         
                        int index116_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA116_16 = input.LA(1);

                         
                        int index116_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA116_17 = input.LA(1);

                         
                        int index116_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA116_18 = input.LA(1);

                         
                        int index116_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA116_19 = input.LA(1);

                         
                        int index116_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA116_20 = input.LA(1);

                         
                        int index116_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred176_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index116_20);
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
        "\1\4\24\uffff\1\0\2\uffff\1\0\27\uffff\1\0\35\uffff";
    static final String DFA117_maxS =
        "\1\u0080\24\uffff\1\0\2\uffff\1\0\27\uffff\1\0\35\uffff";
    static final String DFA117_acceptS =
        "\1\uffff\1\2\110\uffff\1\1\3\uffff";
    static final String DFA117_specialS =
        "\25\uffff\1\0\2\uffff\1\1\27\uffff\1\2\35\uffff}>";
    static final String[] DFA117_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\40\uffff\1\112\1\30\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\1\112\30\1\1\uffff\2\112\11\1\1\25\1\1\1\60"+
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
            return "()* loopback of 429:22: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA117_21 = input.LA(1);

                         
                        int index117_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred184_Fan()&&(notAfterEol()))) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index117_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA117_24 = input.LA(1);

                         
                        int index117_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred184_Fan()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index117_24);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA117_48 = input.LA(1);

                         
                        int index117_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred184_Fan()&&(notAfterEol()))) ) {s = 74;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL())||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol())))) ) {s = 1;}

                         
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
        "\26\uffff";
    static final String DFA118_eofS =
        "\26\uffff";
    static final String DFA118_minS =
        "\1\46\1\uffff\1\0\1\uffff\1\0\14\uffff\2\0\3\uffff";
    static final String DFA118_maxS =
        "\1\177\1\uffff\1\0\1\uffff\1\0\14\uffff\2\0\3\uffff";
    static final String DFA118_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\16\uffff\1\3\1\4";
    static final String DFA118_specialS =
        "\2\uffff\1\0\1\uffff\1\1\14\uffff\1\2\1\3\3\uffff}>";
    static final String[] DFA118_transitionS = {
            "\2\5\3\uffff\4\5\50\uffff\1\4\21\uffff\1\5\1\1\11\uffff\1\2"+
            "\4\5\1\22\1\5\1\uffff\1\5\1\21\1\uffff\1\1",
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
            return "432:1: termBase : ( idExprReq | literal | typeBase | id );";
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
                        if ( (synpred185_Fan()) ) {s = 1;}

                        else if ( (synpred186_Fan()) ) {s = 5;}

                        else if ( (synpred187_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index118_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA118_4 = input.LA(1);

                         
                        int index118_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred185_Fan()) ) {s = 1;}

                        else if ( (synpred186_Fan()) ) {s = 5;}

                        else if ( (synpred187_Fan()) ) {s = 20;}

                         
                        input.seek(index118_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA118_17 = input.LA(1);

                         
                        int index118_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred186_Fan()) ) {s = 5;}

                        else if ( (synpred187_Fan()) ) {s = 20;}

                         
                        input.seek(index118_17);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA118_18 = input.LA(1);

                         
                        int index118_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred186_Fan()) ) {s = 5;}

                        else if ( (synpred187_Fan()) ) {s = 20;}

                         
                        input.seek(index118_18);
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
        "\1\127\3\0\10\uffff";
    static final String DFA119_maxS =
        "\1\175\3\0\10\uffff";
    static final String DFA119_acceptS =
        "\4\uffff\1\2\1\1\1\4\1\7\1\10\1\6\1\3\1\5";
    static final String DFA119_specialS =
        "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] DFA119_transitionS = {
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
            return "433:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );";
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
                        if ( (synpred188_Fan()) ) {s = 5;}

                        else if ( (synpred189_Fan()) ) {s = 4;}

                        else if ( (synpred191_Fan()) ) {s = 6;}

                        else if ( (synpred194_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index119_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA119_2 = input.LA(1);

                         
                        int index119_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 5;}

                        else if ( (synpred189_Fan()) ) {s = 4;}

                        else if ( (synpred191_Fan()) ) {s = 6;}

                        else if ( (synpred193_Fan()) ) {s = 9;}

                        else if ( (synpred194_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index119_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA119_3 = input.LA(1);

                         
                        int index119_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_Fan()) ) {s = 5;}

                        else if ( (synpred189_Fan()) ) {s = 4;}

                        else if ( (synpred190_Fan()) ) {s = 10;}

                        else if ( (synpred191_Fan()) ) {s = 6;}

                        else if ( (synpred192_Fan()) ) {s = 11;}

                        else if ( (synpred194_Fan()) ) {s = 7;}

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
        "\14\uffff";
    static final String DFA120_eofS =
        "\14\uffff";
    static final String DFA120_minS =
        "\1\117\1\0\1\uffff\1\0\10\uffff";
    static final String DFA120_maxS =
        "\1\177\1\0\1\uffff\1\0\10\uffff";
    static final String DFA120_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\7\1\1\1\10\1\3\1\11";
    static final String DFA120_specialS =
        "\1\uffff\1\0\1\uffff\1\1\10\uffff}>";
    static final String[] DFA120_transitionS = {
            "\1\1\1\7\7\uffff\1\2\31\uffff\1\3\1\4\11\uffff\1\5\1\uffff\1"+
            "\6",
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
            ""
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
            return "439:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA120_1 = input.LA(1);

                         
                        int index120_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred195_Fan()) ) {s = 8;}

                        else if ( (synpred202_Fan()) ) {s = 9;}

                         
                        input.seek(index120_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA120_3 = input.LA(1);

                         
                        int index120_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred197_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index120_3);
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
    static final String DFA125_eotS =
        "\117\uffff";
    static final String DFA125_eofS =
        "\1\1\116\uffff";
    static final String DFA125_minS =
        "\1\4\5\uffff\1\0\110\uffff";
    static final String DFA125_maxS =
        "\1\u0080\5\uffff\1\0\110\uffff";
    static final String DFA125_acceptS =
        "\1\uffff\1\2\114\uffff\1\1";
    static final String DFA125_specialS =
        "\6\uffff\1\0\110\uffff}>";
    static final String[] DFA125_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\40\uffff\3\1\1\uffff\3\1\1\uffff"+
            "\1\6\31\1\1\uffff\17\1",
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
            return "()* loopback of 458:45: ( closure )*";
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
                        if ( (synpred207_Fan()) ) {s = 78;}

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
    static final String DFA131_eotS =
        "\27\uffff";
    static final String DFA131_eofS =
        "\27\uffff";
    static final String DFA131_minS =
        "\1\46\14\uffff\3\0\7\uffff";
    static final String DFA131_maxS =
        "\1\175\14\uffff\3\0\7\uffff";
    static final String DFA131_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\uffff\1"+
        "\12\3\uffff\1\14\1\20\1\13\1\15\1\16\1\17\1\21";
    static final String DFA131_specialS =
        "\15\uffff\1\0\1\1\1\2\7\uffff}>";
    static final String[] DFA131_transitionS = {
            "\1\2\1\3\3\uffff\1\1\1\4\1\5\1\6\50\uffff\1\17\21\uffff\1\12"+
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
            return "474:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple );";
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
                        if ( (synpred224_Fan()) ) {s = 18;}

                        else if ( (synpred225_Fan()) ) {s = 16;}

                        else if ( (synpred226_Fan()) ) {s = 19;}

                        else if ( (synpred227_Fan()) ) {s = 20;}

                        else if ( (synpred228_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index131_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA131_14 = input.LA(1);

                         
                        int index131_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred225_Fan()) ) {s = 16;}

                        else if ( (synpred226_Fan()) ) {s = 19;}

                        else if ( (synpred227_Fan()) ) {s = 20;}

                        else if ( (synpred228_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index131_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA131_15 = input.LA(1);

                         
                        int index131_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred225_Fan()) ) {s = 16;}

                        else if ( (synpred226_Fan()) ) {s = 19;}

                        else if ( (synpred227_Fan()) ) {s = 20;}

                        else if ( (synpred228_Fan()) ) {s = 21;}

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
 

    public static final BitSet FOLLOW_using_in_prog447 = new BitSet(new long[]{0x0000000FF4320000L,0x0C10000000000000L});
    public static final BitSet FOLLOW_podDef_in_prog451 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_typeDef_in_prog455 = new BitSet(new long[]{0x0000000FF4300000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_docs_in_prog459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingPod_in_using481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingType_in_using485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingAs_in_using489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incUsing_in_using493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingPod503 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_podSpec_in_usingPod505 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_usingPod507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingType531 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_podSpec_in_usingType533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingType535 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_usingType537 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_usingType539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingAs569 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_podSpec_in_usingAs571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingAs573 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_usingAs578 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_usingAs581 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_usingAs583 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_AS_in_usingAs588 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_usingAs592 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_usingAs594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing637 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_incUsing639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing645 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_ffi_in_incUsing647 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_incUsing649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing655 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_podSpec_in_incUsing657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_incUsing659 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_incUsing661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_incUsing667 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_podSpec_in_incUsing669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_incUsing671 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_incUsing673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ffi_in_podSpec714 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_podSpec717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_podSpec720 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_podSpec722 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_sq_bracketL_in_ffi733 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_ffi735 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_ffi737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_podHeader_in_podDef746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_BRACKET_L_in_podDef748 = new BitSet(new long[]{0x0000000002000000L,0x2C10000000820000L});
    public static final BitSet FOLLOW_symbolDef_in_podDef750 = new BitSet(new long[]{0x0000000002000000L,0x2C10000000820000L});
    public static final BitSet FOLLOW_BRACKET_R_in_podDef753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_podHeader760 = new BitSet(new long[]{0x0000000000000000L,0x0C10000000000000L});
    public static final BitSet FOLLOW_facet_in_podHeader762 = new BitSet(new long[]{0x0000000000000000L,0x0C10000000000000L});
    public static final BitSet FOLLOW_pod_in_podHeader765 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_podHeader767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_symbolDef774 = new BitSet(new long[]{0x0000000002000000L,0x2C10000000800000L});
    public static final BitSet FOLLOW_facet_in_symbolDef776 = new BitSet(new long[]{0x0000000002000000L,0x2C10000000800000L});
    public static final BitSet FOLLOW_symbolFlag_in_symbolDef779 = new BitSet(new long[]{0x0000000002000000L,0x2C10000000800000L});
    public static final BitSet FOLLOW_typeId_in_symbolDef782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_symbolDef784 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_symbolDef786 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_symbolDef788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_symbolFlag795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_typeDef805 = new BitSet(new long[]{0x0000000FF4300000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_facet_in_typeDef807 = new BitSet(new long[]{0x0000000FF4300000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_classDef_in_typeDef818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDef_in_typeDef832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinDef_in_typeDef836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classHeader_in_classDef858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_classBody_in_classDef860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_classHeader883 = new BitSet(new long[]{0x0000000F94300000L,0x0400000000000000L});
    public static final BitSet FOLLOW_facet_in_classHeader885 = new BitSet(new long[]{0x0000000F94300000L,0x0400000000000000L});
    public static final BitSet FOLLOW_classFlags_in_classHeader890 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_classHeader893 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_classHeader897 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_inheritance_in_classHeader899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_classFlags933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_classFlags937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_classFlags941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_classFlags945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_classFlags949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_classBody958 = new BitSet(new long[]{0x0000003F87F80000L,0x2C10000000820000L});
    public static final BitSet FOLLOW_slotDef_in_classBody960 = new BitSet(new long[]{0x0000003F87F80000L,0x2C10000000820000L});
    public static final BitSet FOLLOW_bracketR_in_classBody963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_protection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinHeader_in_mixinDef1015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_mixinBody_in_mixinDef1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_mixinHeader1040 = new BitSet(new long[]{0x0000000F44300000L,0x0400000000000000L});
    public static final BitSet FOLLOW_facet_in_mixinHeader1042 = new BitSet(new long[]{0x0000000F44300000L,0x0400000000000000L});
    public static final BitSet FOLLOW_mixinFlags_in_mixinHeader1047 = new BitSet(new long[]{0x0000000F44300000L});
    public static final BitSet FOLLOW_KW_MIXIN_in_mixinHeader1050 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_mixinHeader1054 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_inheritance_in_mixinHeader1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_mixinFlags1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_mixinFlags1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_mixinFlags1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_mixinFlags1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_mixinBody1108 = new BitSet(new long[]{0x0000003F87F80000L,0x2C10000000820000L});
    public static final BitSet FOLLOW_slotDef_in_mixinBody1110 = new BitSet(new long[]{0x0000003F87F80000L,0x2C10000000820000L});
    public static final BitSet FOLLOW_bracketR_in_mixinBody1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumHeader_in_enumDef1146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_enumBody_in_enumDef1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumHeader1174 = new BitSet(new long[]{0x0000000F20000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_facet_in_enumHeader1176 = new BitSet(new long[]{0x0000000F20000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_protection_in_enumHeader1181 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_enumHeader1184 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_enumHeader1188 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_inheritance_in_enumHeader1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_enumBody1223 = new BitSet(new long[]{0x0000000000000000L,0x2810000000000000L});
    public static final BitSet FOLLOW_enumValDefs_in_enumBody1225 = new BitSet(new long[]{0x0000003F87F80000L,0x2C10000000820000L});
    public static final BitSet FOLLOW_slotDef_in_enumBody1227 = new BitSet(new long[]{0x0000003F87F80000L,0x2C10000000820000L});
    public static final BitSet FOLLOW_bracketR_in_enumBody1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_inheritance1255 = new BitSet(new long[]{0x0000000000000000L,0x2010000000800000L});
    public static final BitSet FOLLOW_typeList_in_inheritance1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs1267 = new BitSet(new long[]{0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_SP_COMMA_in_enumValDefs1270 = new BitSet(new long[]{0x0000000000000000L,0x2810000000000000L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs1273 = new BitSet(new long[]{0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_eos_in_enumValDefs1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumValDef1285 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_enumValDef1287 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_parL_in_enumValDef1290 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_enumValDef1292 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_enumValDef1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList1306 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SP_COMMA_in_typeList1309 = new BitSet(new long[]{0x0000000000000000L,0x2010000000800000L});
    public static final BitSet FOLLOW_type_in_typeList1311 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_typeRoot_in_type1331 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_SP_QMARK_in_type1334 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_type1338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_SP_QMARK_in_type1340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_mapType_in_typeRoot1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonMapType_in_typeRoot1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_nonMapType1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_nonMapType1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_simpleType1380 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_simpleType1383 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_simpleType1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_mapType1396 = new BitSet(new long[]{0x0000000000000000L,0x2010000000800000L});
    public static final BitSet FOLLOW_nonMapType_in_mapType1399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000680000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType1401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000480000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_mapType1405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000680000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType1407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000480000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapType1419 = new BitSet(new long[]{0x0000000000000000L,0x2010000000800000L});
    public static final BitSet FOLLOW_type_in_mapType1423 = new BitSet(new long[]{0x0000000000000002L,0x4000000000080000L});
    public static final BitSet FOLLOW_sq_bracketR_in_mapType1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1457 = new BitSet(new long[]{0x0000000000000000L,0x2010000001900000L});
    public static final BitSet FOLLOW_SP_COMMA_in_funcType1460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_formals_in_funcType1465 = new BitSet(new long[]{0x0000000000000000L,0x2010000001900000L});
    public static final BitSet FOLLOW_assignedType_in_funcType1472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_assignedType_in_funcType1484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_assignedType1495 = new BitSet(new long[]{0x0000000000000000L,0x2010000000800000L});
    public static final BitSet FOLLOW_type_in_assignedType1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_in_formals1507 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SP_COMMA_in_formals1510 = new BitSet(new long[]{0x0000000000000000L,0x2010000000800000L});
    public static final BitSet FOLLOW_formal_in_formals1512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_formalFull_in_formal1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_formal1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalInferred_in_formal1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalFull1542 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_formalFull1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalTypeOnly1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_formalInferred1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticBlock_in_slotDef1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_slotDef1588 = new BitSet(new long[]{0x0000003F87F80000L,0x2C10000000800000L});
    public static final BitSet FOLLOW_facet_in_slotDef1590 = new BitSet(new long[]{0x0000003F87F80000L,0x2C10000000800000L});
    public static final BitSet FOLLOW_ctorDef_in_slotDef1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDef_in_slotDef1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDef_in_slotDef1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_fieldDef1686 = new BitSet(new long[]{0x0000000F87F80000L,0x2C10000000800000L});
    public static final BitSet FOLLOW_facet_in_fieldDef1688 = new BitSet(new long[]{0x0000000F87F80000L,0x2C10000000800000L});
    public static final BitSet FOLLOW_fieldFlags_in_fieldDef1693 = new BitSet(new long[]{0x0000000002000000L,0x2C10000000800000L});
    public static final BitSet FOLLOW_typeId_in_fieldDef1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000002050000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_fieldDef1698 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_fieldDef1700 = new BitSet(new long[]{0x0000000000000000L,0x0000000002010000L});
    public static final BitSet FOLLOW_bracketL_in_fieldDef1715 = new BitSet(new long[]{0x0000000F00000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_protection_in_fieldDef1718 = new BitSet(new long[]{0x0000000F00000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_getter_in_fieldDef1722 = new BitSet(new long[]{0x000078FF87F81FF0L,0xBFF1E72002830000L});
    public static final BitSet FOLLOW_setter_in_fieldDef1726 = new BitSet(new long[]{0x000078FF87F81FF0L,0xBFF1E72002830000L});
    public static final BitSet FOLLOW_SP_SEMI_in_fieldDef1729 = new BitSet(new long[]{0x000078FF87F81FF0L,0xBFF1E72000830000L});
    public static final BitSet FOLLOW_block_in_fieldDef1732 = new BitSet(new long[]{0x0000003F87F80000L,0x2C10000000820000L});
    public static final BitSet FOLLOW_bracketR_in_fieldDef1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_fieldDef1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeAndId_in_typeId1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldId_in_typeId1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_fieldId1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeAndId1804 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_typeAndId1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_fieldFlags1832 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_RD_ONLY_in_fieldFlags1836 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_CONST_in_fieldFlags1840 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_STATIC_in_fieldFlags1844 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_fieldFlags1848 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VOLATILE_in_fieldFlags1852 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_fieldFlags1856 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_fieldFlags1860 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_FINAL_in_fieldFlags1864 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_protection_in_fieldFlags1868 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_docs_in_methodDef1888 = new BitSet(new long[]{0x0000002F87600000L,0x2410000000800000L});
    public static final BitSet FOLLOW_facet_in_methodDef1890 = new BitSet(new long[]{0x0000002F87600000L,0x2410000000800000L});
    public static final BitSet FOLLOW_methodFlags_in_methodDef1895 = new BitSet(new long[]{0x0000002F87600000L,0x2010000000800000L});
    public static final BitSet FOLLOW_type_in_methodDef1900 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_methodDef1906 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_parL_in_methodDef1908 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_params_in_methodDef1910 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_methodDef1912 = new BitSet(new long[]{0x0000000000000000L,0x0000000002010000L});
    public static final BitSet FOLLOW_methodBody_in_methodDef1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_methodFlags1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_methodFlags1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_methodFlags1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_methodFlags1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_methodFlags1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ONCE_in_methodFlags1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_methodFlags1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_methodFlags1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params2001 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SP_COMMA_in_params2004 = new BitSet(new long[]{0x0000000000000000L,0x2010000000800000L});
    public static final BitSet FOLLOW_param_in_params2006 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_type_in_param2020 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_param2022 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_param2025 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_param2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_methodBody2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_methodBody2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_ctorDef2090 = new BitSet(new long[]{0x0000001F00000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_facet_in_ctorDef2092 = new BitSet(new long[]{0x0000001F00000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_ctorFlags_in_ctorDef2097 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_ctorDef2100 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_ctorDef2104 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_parL_in_ctorDef2106 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_params_in_ctorDef2108 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_ctorDef2110 = new BitSet(new long[]{0x0000000000000000L,0x0000000002090000L});
    public static final BitSet FOLLOW_ctorChain_in_ctorDef2119 = new BitSet(new long[]{0x0000000000000000L,0x0000000002010000L});
    public static final BitSet FOLLOW_methodBody_in_ctorDef2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_ctorFlags2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_ctorChain2177 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ctorChainThis_in_ctorChain2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorChainSuper_in_ctorChain2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_ctorChainThis2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainThis2195 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_ctorChainThis2197 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_parL_in_ctorChainThis2199 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_ctorChainThis2201 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_ctorChainThis2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_ctorChainSuper2211 = new BitSet(new long[]{0x0000000000000000L,0x8000000000008000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainSuper2214 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_ctorChainSuper2216 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_parL_in_ctorChainSuper2220 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_ctorChainSuper2222 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_ctorChainSuper2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_staticBlock2233 = new BitSet(new long[]{0x000078C002001FF0L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_block_in_staticBlock2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_block2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_multiStmt2272 = new BitSet(new long[]{0x000078FF87F81FF0L,0xBFF1E72000830000L});
    public static final BitSet FOLLOW_stmt_in_multiStmt2274 = new BitSet(new long[]{0x000078FF87F81FF0L,0xBFF1E72000830000L});
    public static final BitSet FOLLOW_bracketR_in_multiStmt2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_if_in_stmt2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_for_in_stmt2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_while_in_stmt2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_break_in_stmt2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_continue_in_stmt2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_return_in_stmt2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switch_in_stmt2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_throw_in_stmt2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_try_in_stmt2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_stmt2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localDef_in_stmt2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmtList2371 = new BitSet(new long[]{0x000078C002001FF2L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_KW_BREAK_in_g_break2393 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_g_break2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONTINUE_in_g_continue2402 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_g_continue2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_g_for2412 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_parL_in_g_for2414 = new BitSet(new long[]{0x000078C002000000L,0xBFF1E72002800000L});
    public static final BitSet FOLLOW_forInit_in_g_for2416 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for2419 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72002800000L});
    public static final BitSet FOLLOW_expr_in_g_for2421 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for2424 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_g_for2426 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_g_for2429 = new BitSet(new long[]{0x000078C002001FF0L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_block_in_g_for2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_g_if2440 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_parL_in_g_if2442 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_g_if2444 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_g_if2446 = new BitSet(new long[]{0x000078C002001FF0L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_block_in_g_if2448 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_g_if2455 = new BitSet(new long[]{0x000078C002001FF0L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_block_in_g_if2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_g_return2466 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72002800000L});
    public static final BitSet FOLLOW_eos_in_g_return2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_g_return2473 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_g_return2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SWITCH_in_g_switch2483 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_parL_in_g_switch2485 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_g_switch2487 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_g_switch2489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_bracketL_in_g_switch2491 = new BitSet(new long[]{0x0000003F87F86000L,0x2C10000000820000L});
    public static final BitSet FOLLOW_g_case_in_g_switch2494 = new BitSet(new long[]{0x0000003F87F86000L,0x2C10000000820000L});
    public static final BitSet FOLLOW_g_default_in_g_switch2499 = new BitSet(new long[]{0x0000003F87F80000L,0x2C10000000820000L});
    public static final BitSet FOLLOW_bracketR_in_g_switch2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_g_throw2511 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_g_throw2513 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_g_throw2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHILE_in_g_while2523 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_parL_in_g_while2525 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_g_while2527 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_g_while2529 = new BitSet(new long[]{0x000078C002001FF0L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_block_in_g_while2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_g_try2539 = new BitSet(new long[]{0x000078C002019FF0L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_try_long_in_g_try2546 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_stmtList_in_g_try2550 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_catch_in_g_try2558 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_finally_in_g_try2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_try_long2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprStmt2583 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_exprStmt2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_localDef2593 = new BitSet(new long[]{0x0000000000000000L,0x0000000002040000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_localDef2596 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_localDef2598 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_eos_in_localDef2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_forInit2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forInit2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_forInitDef2641 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_forInitDef2644 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_forInitDef2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_g_catch2657 = new BitSet(new long[]{0x000078C002001FF0L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_catchDef_in_g_catch2659 = new BitSet(new long[]{0x000078C002001FF0L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_catch_long_in_g_catch2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtList_in_g_catch2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_catch_long2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_catchDef2687 = new BitSet(new long[]{0x0000000000000000L,0x2010000000800000L});
    public static final BitSet FOLLOW_type_in_catchDef2689 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_catchDef2691 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_catchDef2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_g_finally2701 = new BitSet(new long[]{0x000078C002001FF0L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_finally_long_in_g_finally2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtList_in_g_finally2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_finally_long2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_g_case2728 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_g_case2730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_case2732 = new BitSet(new long[]{0x000078C002001FF2L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_stmt_in_g_case2734 = new BitSet(new long[]{0x000078C002001FF2L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_KW_DEFAULT_in_g_default2742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_default2744 = new BitSet(new long[]{0x000078C002001FF2L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_stmt_in_g_default2746 = new BitSet(new long[]{0x000078C002001FF2L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_assignExpr_in_expr2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2774 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2777 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_assignExpr_in_assignExpr2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryExpr2788 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_ternaryTail_in_ternaryExpr2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_ternaryTail2801 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail2803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SP_COLON_in_ternaryTail2805 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2826 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_OP_OR_in_condOrExpr2830 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2833 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2843 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_OP_AND_in_condAndExpr2846 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2849 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2859 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_CP_EQUALITY_in_equalityExpr2862 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2864 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_elvisExpr_in_relationalExpr2877 = new BitSet(new long[]{0x0000060000040000L,0x0000000080000000L});
    public static final BitSet FOLLOW_typeCheck_in_relationalExpr2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_relationalExpr2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCheck2895 = new BitSet(new long[]{0x0000000000000000L,0x2010000000800000L});
    public static final BitSet FOLLOW_typeRoot_in_typeCheck2907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_SP_QMARK_in_typeCheck2910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_typeCheck2915 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_CP_COMPARATORS_in_compare2928 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_elvisExpr_in_compare2930 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2941 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_OP_ELVIS_in_elvisExpr2944 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2946 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2957 = new BitSet(new long[]{0x0000000000000002L,0x0000000E00000000L});
    public static final BitSet FOLLOW_set_in_rangeExpr2960 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2974 = new BitSet(new long[]{0x0000000000000002L,0x0000000E00000000L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2985 = new BitSet(new long[]{0x0000000000000002L,0x0000001000800000L});
    public static final BitSet FOLLOW_set_in_bitOrExpr2988 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2996 = new BitSet(new long[]{0x0000000000000002L,0x0000001000800000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr3007 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_OP_CURRY_in_bitAndExpr3010 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr3012 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3024 = new BitSet(new long[]{0x0000000000000002L,0x000000C000000000L});
    public static final BitSet FOLLOW_set_in_shiftExpr3027 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3035 = new BitSet(new long[]{0x0000000000000002L,0x000000C000000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3046 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_set_in_addExpr3049 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3057 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
    public static final BitSet FOLLOW_set_in_addAppend3067 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_parenExpr_in_addAppend3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr3083 = new BitSet(new long[]{0x0000000000000002L,0x00001C0000000000L});
    public static final BitSet FOLLOW_set_in_multExpr3086 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr3098 = new BitSet(new long[]{0x0000000000000002L,0x00001C0000000000L});
    public static final BitSet FOLLOW_castExpr_in_parenExpr3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_parenExpr3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_parenExpr3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_castExpr3128 = new BitSet(new long[]{0x0000000000000000L,0x2010000000800000L});
    public static final BitSet FOLLOW_type_in_castExpr3130 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_castExpr3132 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_parenExpr_in_castExpr3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_groupedExpr3143 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_groupedExpr3145 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_groupedExpr3147 = new BitSet(new long[]{0x0000000000000002L,0xA00C000001018000L});
    public static final BitSet FOLLOW_termChain_in_groupedExpr3149 = new BitSet(new long[]{0x0000000000000002L,0xA00C000001018000L});
    public static final BitSet FOLLOW_prefixExpr_in_unaryExpr3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_unaryExpr3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_unaryExpr3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr3174 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_parenExpr_in_prefixExpr3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_postfixExpr3211 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_set_in_postfixExpr3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termBase_in_termExpr3228 = new BitSet(new long[]{0x0000000000000002L,0xA00C000001018000L});
    public static final BitSet FOLLOW_termChain_in_termExpr3230 = new BitSet(new long[]{0x0000000000000002L,0xA00C000001018000L});
    public static final BitSet FOLLOW_idExprReq_in_termBase3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_termBase3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_termBase3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_termBase3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_typeBase3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_typeBase3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_typeBase3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_typeBase3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_typeBase3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_typeBase3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_typeBase3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorBlock_in_typeBase3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_ctorBlock3334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_itBlock_in_ctorBlock3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_staticCall3343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_staticCall3345 = new BitSet(new long[]{0x0000000000000000L,0xA010040000800000L});
    public static final BitSet FOLLOW_idExpr_in_staticCall3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_termChain3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynCall_in_termChain3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_termChain3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDynCall_in_termChain3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpr_in_termChain3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callOp_in_termChain3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itBlock_in_termChain3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDotCall_in_termChain3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incSafeDotCall_in_termChain3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_dsl3428 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_DSL_in_dsl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_incDotCall3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_incSafeDotCall3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_itBlock3474 = new BitSet(new long[]{0x000078FF87F81FF0L,0xBFF1E72000830000L});
    public static final BitSet FOLLOW_stmt_in_itBlock3477 = new BitSet(new long[]{0x000078FF87F81FF0L,0xBFF1E72002930000L});
    public static final BitSet FOLLOW_SP_COMMA_in_itBlock3479 = new BitSet(new long[]{0x000078FF87F81FF0L,0xBFF1E72002830000L});
    public static final BitSet FOLLOW_SP_SEMI_in_itBlock3482 = new BitSet(new long[]{0x000078FF87F81FF0L,0xBFF1E72000830000L});
    public static final BitSet FOLLOW_bracketR_in_itBlock3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotCall3495 = new BitSet(new long[]{0x0000000000000000L,0xA010040000800000L});
    public static final BitSet FOLLOW_idExpr_in_dotCall3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_dynCall3517 = new BitSet(new long[]{0x0000000000000000L,0xA010040000800000L});
    public static final BitSet FOLLOW_idExpr_in_dynCall3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_safeDotCall3527 = new BitSet(new long[]{0x0000000000000000L,0xA010040000800000L});
    public static final BitSet FOLLOW_idExpr_in_safeDotCall3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall3548 = new BitSet(new long[]{0x0000000000000000L,0xA010040000800000L});
    public static final BitSet FOLLOW_idExpr_in_safeDynCall3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_indexExpr3560 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_indexExpr3562 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_indexExpr3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callOp3575 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_callOp3577 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_callOp3581 = new BitSet(new long[]{0x0000000000000002L,0xA010040000800000L});
    public static final BitSet FOLLOW_closure_in_callOp3583 = new BitSet(new long[]{0x0000000000000002L,0xA010040000800000L});
    public static final BitSet FOLLOW_funcType_in_closure3605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_multiStmt_in_closure3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_idExpr3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idExpr3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_idExprReq3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_idExprReq3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MULTI_in_field3642 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_field3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call3656 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_callParams_in_call3661 = new BitSet(new long[]{0x0000000000000000L,0xA010040000800000L});
    public static final BitSet FOLLOW_closure_in_call3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_call3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_call3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callParams3712 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_args_in_callParams3714 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_callParams3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args3726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SP_COMMA_in_args3729 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_args3732 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_KW_NULL_in_literal3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_literal3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_literal3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IT_in_literal3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_literal3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_literal3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strs_in_literal3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_literal3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_literal3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_literal3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_literal3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_literal3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_literal3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_literal3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_literal3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbLiteral_in_literal3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_literal3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTSTR_in_strs3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_strs3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeLiteral3862 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_OP_POUND_in_typeLiteral3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_slotLiteral3875 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_OP_POUND_in_slotLiteral3878 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_slotLiteral3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_symbLiteral3891 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_symbLiteral3894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SP_COLON_in_symbLiteral3896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SP_COLON_in_symbLiteral3898 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_symbLiteral3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_namedSuper3910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_DOT_in_namedSuper3912 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_SUPER_in_namedSuper3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_list3924 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_sq_bracketL_in_list3930 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000900000L});
    public static final BitSet FOLLOW_listItems_in_list3932 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_list3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_listItems3943 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3946 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_listItems3948 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_map3969 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_sq_bracketL_in_map3975 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000880000L});
    public static final BitSet FOLLOW_mapItems_in_map3977 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_map3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapPair_in_mapItems3988 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems3991 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_mapPair_in_mapItems3993 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_mapItems4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_mapPair4011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapPair4013 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_mapPair4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_simple4023 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_parL_in_simple4025 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_simple4027 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_parR_in_simple4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_docs4041 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_OP_MINUS_in_number4063 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_NUMBER_in_number4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_facet4074 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_facet4076 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_AS_EQUAL_in_facet4079 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_expr_in_facet4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_eos4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getter4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setter4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pod4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_bracketL4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_R_in_bracketR4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_sq_bracketL4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_sq_bracketR4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_parL4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_R_in_parR4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_podDef_in_synpred2_Fan451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred17_Fan807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classFlags_in_synpred19_Fan812 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_synpred19_Fan815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_synpred21_Fan826 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_synpred21_Fan829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred48_Fan1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred49_Fan1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_synpred50_Fan1338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred50_Fan1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred51_Fan1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_synpred58_Fan1419 = new BitSet(new long[]{0x0000000000000000L,0x2010000000800000L});
    public static final BitSet FOLLOW_type_in_synpred58_Fan1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketR_in_synpred59_Fan1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred61_Fan1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred63_Fan1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_synpred65_Fan1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_synpred66_Fan1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_synpred67_Fan1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_bracketL_in_synpred67_Fan1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred68_Fan1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorFlags_in_synpred70_Fan1607 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_synpred70_Fan1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodFlags_in_synpred73_Fan1624 = new BitSet(new long[]{0x0000002F8F600000L,0x2010000000800000L});
    public static final BitSet FOLLOW_type_in_synpred73_Fan1628 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_KW_VOID_in_synpred73_Fan1632 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_synpred73_Fan1635 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_parL_in_synpred73_Fan1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getter_in_synpred77_Fan1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred79_Fan1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred82_Fan1779 = new BitSet(new long[]{0x0000000000000000L,0x2010000000000000L});
    public static final BitSet FOLLOW_id_in_synpred82_Fan1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_synpred105_Fan2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred114_Fan2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_synpred125_Fan2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred126_Fan2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_synpred130_Fan2455 = new BitSet(new long[]{0x000078C002001FF0L,0xBFF1E72000810000L});
    public static final BitSet FOLLOW_block_in_synpred130_Fan2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_synpred131_Fan2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred134_Fan2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_synpred135_Fan2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_synpred136_Fan2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_synpred138_Fan2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchDef_in_synpred140_Fan2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred141_Fan2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred142_Fan2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred162_Fan2988 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_bitAndExpr_in_synpred162_Fan2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_CURRY_in_synpred163_Fan3010 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_shiftExpr_in_synpred163_Fan3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred167_Fan3049 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_multExpr_in_synpred167_Fan3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred171_Fan3086 = new BitSet(new long[]{0x000078C000000000L,0xB7F1E72000800000L});
    public static final BitSet FOLLOW_parenExpr_in_synpred171_Fan3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_synpred172_Fan3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_synpred173_Fan3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred174_Fan3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred175_Fan3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_synpred176_Fan3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred184_Fan3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred185_Fan3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred186_Fan3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_synpred187_Fan3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred188_Fan3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred189_Fan3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred190_Fan3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_synpred191_Fan3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_synpred192_Fan3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred193_Fan3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_synpred194_Fan3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_synpred195_Fan3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_synpred197_Fan3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDotCall_in_synpred202_Fan3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred207_Fan3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred208_Fan3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred224_Fan3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred225_Fan3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred226_Fan3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_synpred227_Fan3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_synpred228_Fan3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred233_Fan3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred237_Fan3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_synpred241_Fan4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_synpred244_Fan4103 = new BitSet(new long[]{0x0000000000000002L});

}