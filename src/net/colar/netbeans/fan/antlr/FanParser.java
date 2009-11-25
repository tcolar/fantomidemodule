// $ANTLR 3.1.2 src/net/colar/netbeans/fan/antlr/Fan.g 2009-11-24 12:35:54
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KW_BREAK", "KW_CONTINUE", "KW_FOR", "KW_IF", "KW_RETURN", "KW_SWITCH", "KW_THROW", "KW_WHILE", "KW_TRY", "KW_CASE", "KW_DEFAULT", "KW_CATCH", "KW_FINALLY", "KW_USING", "KW_AS", "KW_RD_ONLY", "KW_CONST", "KW_STATIC", "KW_NATIVE", "KW_VOLATILE", "KW_OVERRIDE", "KW_VIRTUAL", "KW_FINAL", "KW_VOID", "KW_CLASS", "KW_ENUM", "KW_MIXIN", "KW_ABSTRACT", "KW_PRIVATE", "KW_PROTECTED", "KW_PUBLIC", "KW_INTERNAL", "KW_NEW", "KW_ONCE", "KW_THIS", "KW_SUPER", "KW_ELSE", "KW_IS", "KW_ISNOT", "KW_NULL", "KW_IT", "KW_TRUE", "KW_FALSE", "INC_STR", "INC_URI", "INC_COMMENT", "INC_DSL", "INC_CALL", "AST_CLASS", "AST_ENUM", "AST_MIXIN", "AST_METHOD", "AST_CONSTRUCTOR", "AST_FIELD", "AST_CONSTRUCTOR_CHAIN", "AST_CODE_BLOCK", "AST_DOCS", "AST_STR", "AST_CALL", "AST_TERM_EXPR", "AST_DOT_CALL", "AST_SAFE_DOT_CALL", "AST_STATIC_CALL", "AST_USING_POD", "AST_INC_DOTCALL", "AST_INC_SAFEDOTCALL", "AST_ID", "AST_MODIFIER", "AST_INHERITANCE", "AST_PARAMS", "AST_TYPE", "SP_COLCOL", "DOT", "BRACKET_L", "BRACKET_R", "AS_INIT_VAL", "SP_COLON", "SP_COMMA", "SP_QMARK", "LIST_TYPE", "SP_PIPE", "OP_ARROW", "SP_SEMI", "AS_EQUAL", "AS_ASSIGN_OP", "OP_OR", "OP_AND", "CP_EQUALITY", "CP_COMPARATORS", "OP_ELVIS", "OP_RANG_EXCL_OLD", "OP_RANGE_EXCL", "OP_RANGE", "OP_BITOR", "OP_CURRY", "OP_LSHIFT", "OP_RSHIFT", "OP_PLUS", "OP_MINUS", "OP_MULTI", "OP_DIV", "OP_MOD", "OP_BANG", "OP_2PLUS", "OP_2MINUS", "OP_TILDA", "DSL", "OP_SAFE_CALL", "OP_SAFEDYN_CALL", "ID", "URI", "CHAR", "QUOTSTR", "STR", "OP_POUND", "AT", "DOC", "NUMBER", "SQ_BRACKET_L", "SQ_BRACKET_R", "PAR_L", "PAR_R", "LB", "WS", "LINE_COMMENT", "EXEC_COMMENT", "COMPL_ML_COMMENT", "MULTI_COMMENT", "COMPL_DSL", "DIGIT", "HEXLETTER", "COMPL_QSTR", "COMPL_STR", "COMPL_URI", "KEYWORD", "UNDERSCORE", "HEX_HEADER", "HEXNB", "DECIMAL", "FRACTIONAL", "HEXHEADER", "FRACTION", "EXPONENT", "NBTYPE", "LETTER", "INC_UNKNOWN_ITEM", "'$'"
    };
    public static final int EXPONENT=146;
    public static final int DSL=110;
    public static final int KW_NATIVE=22;
    public static final int OP_AND=90;
    public static final int AST_PARAMS=73;
    public static final int LETTER=148;
    public static final int HEXNB=141;
    public static final int CHAR=115;
    public static final int OP_2PLUS=107;
    public static final int KW_DEFAULT=14;
    public static final int KW_ONCE=37;
    public static final int SP_SEMI=86;
    public static final int INC_UNKNOWN_ITEM=149;
    public static final int AST_MIXIN=54;
    public static final int EOF=-1;
    public static final int KW_PUBLIC=34;
    public static final int KW_ISNOT=42;
    public static final int OP_MOD=105;
    public static final int PAR_R=125;
    public static final int OP_MINUS=102;
    public static final int KW_NEW=36;
    public static final int KW_BREAK=4;
    public static final int KW_SWITCH=9;
    public static final int AST_INC_DOTCALL=68;
    public static final int OP_RANG_EXCL_OLD=94;
    public static final int AST_CLASS=52;
    public static final int OP_BITOR=97;
    public static final int QUOTSTR=116;
    public static final int AST_TYPE=74;
    public static final int OP_BANG=106;
    public static final int AST_DOT_CALL=64;
    public static final int T__150=150;
    public static final int PAR_L=124;
    public static final int OP_MULTI=103;
    public static final int AST_USING_POD=67;
    public static final int KEYWORD=138;
    public static final int KW_PROTECTED=33;
    public static final int AST_STR=61;
    public static final int LINE_COMMENT=128;
    public static final int CP_COMPARATORS=92;
    public static final int NUMBER=121;
    public static final int KW_CATCH=15;
    public static final int AS_EQUAL=87;
    public static final int UNDERSCORE=139;
    public static final int INC_CALL=51;
    public static final int OP_DIV=104;
    public static final int SP_COMMA=81;
    public static final int URI=114;
    public static final int KW_FINALLY=16;
    public static final int WS=127;
    public static final int KW_THROW=10;
    public static final int OP_POUND=118;
    public static final int KW_STATIC=21;
    public static final int INC_COMMENT=49;
    public static final int AST_METHOD=55;
    public static final int AST_ENUM=53;
    public static final int AST_CALL=62;
    public static final int SP_QMARK=82;
    public static final int AST_ID=70;
    public static final int HEXHEADER=144;
    public static final int AS_INIT_VAL=79;
    public static final int COMPL_DSL=132;
    public static final int NBTYPE=147;
    public static final int KW_SUPER=39;
    public static final int OP_2MINUS=108;
    public static final int OP_RSHIFT=100;
    public static final int KW_ELSE=40;
    public static final int OP_OR=89;
    public static final int AST_MODIFIER=71;
    public static final int DOC=120;
    public static final int KW_OVERRIDE=24;
    public static final int AST_FIELD=57;
    public static final int AST_CODE_BLOCK=59;
    public static final int KW_ABSTRACT=31;
    public static final int MULTI_COMMENT=131;
    public static final int KW_CONST=20;
    public static final int AST_DOCS=60;
    public static final int COMPL_ML_COMMENT=130;
    public static final int OP_ELVIS=93;
    public static final int BRACKET_R=78;
    public static final int KW_TRUE=45;
    public static final int ID=113;
    public static final int SP_COLON=80;
    public static final int AST_CONSTRUCTOR_CHAIN=58;
    public static final int AST_TERM_EXPR=63;
    public static final int BRACKET_L=77;
    public static final int AT=119;
    public static final int STR=117;
    public static final int OP_RANGE_EXCL=95;
    public static final int SP_PIPE=84;
    public static final int COMPL_QSTR=135;
    public static final int OP_TILDA=109;
    public static final int KW_VIRTUAL=25;
    public static final int CP_EQUALITY=91;
    public static final int AST_SAFE_DOT_CALL=65;
    public static final int KW_FOR=6;
    public static final int KW_WHILE=11;
    public static final int COMPL_URI=137;
    public static final int OP_RANGE=96;
    public static final int KW_RETURN=8;
    public static final int INC_DSL=50;
    public static final int SQ_BRACKET_R=123;
    public static final int KW_IS=41;
    public static final int DIGIT=133;
    public static final int KW_TRY=12;
    public static final int KW_IT=44;
    public static final int DOT=76;
    public static final int KW_THIS=38;
    public static final int KW_IF=7;
    public static final int OP_CURRY=98;
    public static final int SQ_BRACKET_L=122;
    public static final int AST_INC_SAFEDOTCALL=69;
    public static final int OP_PLUS=101;
    public static final int KW_FALSE=46;
    public static final int KW_INTERNAL=35;
    public static final int KW_FINAL=26;
    public static final int HEXLETTER=134;
    public static final int KW_CONTINUE=5;
    public static final int KW_PRIVATE=32;
    public static final int KW_ENUM=29;
    public static final int HEX_HEADER=140;
    public static final int OP_SAFEDYN_CALL=112;
    public static final int KW_VOLATILE=23;
    public static final int KW_CASE=13;
    public static final int LIST_TYPE=83;
    public static final int FRACTIONAL=143;
    public static final int OP_LSHIFT=99;
    public static final int EXEC_COMMENT=129;
    public static final int KW_MIXIN=30;
    public static final int OP_ARROW=85;
    public static final int KW_VOID=27;
    public static final int DECIMAL=142;
    public static final int INC_URI=48;
    public static final int KW_CLASS=28;
    public static final int AS_ASSIGN_OP=88;
    public static final int AST_CONSTRUCTOR=56;
    public static final int KW_RD_ONLY=19;
    public static final int INC_STR=47;
    public static final int AST_STATIC_CALL=66;
    public static final int OP_SAFE_CALL=111;
    public static final int KW_AS=18;
    public static final int COMPL_STR=136;
    public static final int LB=126;
    public static final int KW_USING=17;
    public static final int KW_NULL=43;
    public static final int FRACTION=145;
    public static final int AST_INHERITANCE=72;
    public static final int SP_COLCOL=75;

    // delegates
    // delegators


        public FanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[396+1];
             
             
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:243:1: prog : ( using )* ( podDef | ( typeDef )* ) docs EOF ;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:243:7: ( ( using )* ( podDef | ( typeDef )* ) docs EOF )
            // src/net/colar/netbeans/fan/antlr/Fan.g:243:11: ( using )* ( podDef | ( typeDef )* ) docs EOF
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:243:11: ( using )*
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
            	    pushFollow(FOLLOW_using_in_prog437);
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

            // src/net/colar/netbeans/fan/antlr/Fan.g:243:18: ( podDef | ( typeDef )* )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:243:19: podDef
                    {
                    pushFollow(FOLLOW_podDef_in_prog441);
                    podDef2=podDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, podDef2.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:243:28: ( typeDef )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:243:28: ( typeDef )*
                    loop2:
                    do {
                        int alt2=2;
                        alt2 = dfa2.predict(input);
                        switch (alt2) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: typeDef
                    	    {
                    	    pushFollow(FOLLOW_typeDef_in_prog445);
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

            pushFollow(FOLLOW_docs_in_prog449);
            docs4=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs4.getTree());
            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_prog451); if (state.failed) return retval;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:244:1: using : ( usingPod | usingType | usingAs ) ;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:245:3: ( ( usingPod | usingType | usingAs ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:245:5: ( usingPod | usingType | usingAs )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:245:5: ( usingPod | usingType | usingAs )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:245:6: usingPod
                    {
                    pushFollow(FOLLOW_usingPod_in_using471);
                    usingPod6=usingPod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingPod6.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:245:17: usingType
                    {
                    pushFollow(FOLLOW_usingType_in_using475);
                    usingType7=usingType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingType7.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:245:29: usingAs
                    {
                    pushFollow(FOLLOW_usingAs_in_using479);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:246:1: usingPod : KW_USING podSpec eos -> ^( AST_USING_POD podSpec ) ;
    public final FanParser.usingPod_return usingPod() throws RecognitionException {
        FanParser.usingPod_return retval = new FanParser.usingPod_return();
        retval.start = input.LT(1);
        int usingPod_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING9=null;
        FanParser.podSpec_return podSpec10 = null;

        FanParser.eos_return eos11 = null;


        Object KW_USING9_tree=null;
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_podSpec=new RewriteRuleSubtreeStream(adaptor,"rule podSpec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:3: ( KW_USING podSpec eos -> ^( AST_USING_POD podSpec ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:5: KW_USING podSpec eos
            {
            KW_USING9=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingPod489); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING9);

            pushFollow(FOLLOW_podSpec_in_usingPod491);
            podSpec10=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podSpec.add(podSpec10.getTree());
            pushFollow(FOLLOW_eos_in_usingPod493);
            eos11=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos11.getTree());


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
            // 248:4: -> ^( AST_USING_POD podSpec )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:248:7: ^( AST_USING_POD podSpec )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_USING_POD, "AST_USING_POD"), root_1);

                adaptor.addChild(root_1, stream_podSpec.nextTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:249:1: usingType : KW_USING podSpec SP_COLCOL id eos -> ^( AST_USING_POD podSpec id ) ;
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
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_SP_COLCOL=new RewriteRuleTokenStream(adaptor,"token SP_COLCOL");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_podSpec=new RewriteRuleSubtreeStream(adaptor,"rule podSpec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:250:3: ( KW_USING podSpec SP_COLCOL id eos -> ^( AST_USING_POD podSpec id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:250:5: KW_USING podSpec SP_COLCOL id eos
            {
            KW_USING12=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingType513); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING12);

            pushFollow(FOLLOW_podSpec_in_usingType515);
            podSpec13=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podSpec.add(podSpec13.getTree());
            SP_COLCOL14=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingType517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_COLCOL.add(SP_COLCOL14);

            pushFollow(FOLLOW_id_in_usingType519);
            id15=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id15.getTree());
            pushFollow(FOLLOW_eos_in_usingType521);
            eos16=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos16.getTree());


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
            // 251:4: -> ^( AST_USING_POD podSpec id )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:251:7: ^( AST_USING_POD podSpec id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_USING_POD, "AST_USING_POD"), root_1);

                adaptor.addChild(root_1, stream_podSpec.nextTree());
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:253:1: usingAs : KW_USING podSpec SP_COLCOL pod= ( id ( '$' id )* ) KW_AS as= id eos -> ^( AST_USING_POD podSpec $pod $as) ;
    public final FanParser.usingAs_return usingAs() throws RecognitionException {
        FanParser.usingAs_return retval = new FanParser.usingAs_return();
        retval.start = input.LT(1);
        int usingAs_StartIndex = input.index();
        Object root_0 = null;

        Token pod=null;
        Token KW_USING17=null;
        Token SP_COLCOL19=null;
        Token char_literal21=null;
        Token KW_AS23=null;
        FanParser.id_return as = null;

        FanParser.podSpec_return podSpec18 = null;

        FanParser.id_return id20 = null;

        FanParser.id_return id22 = null;

        FanParser.eos_return eos24 = null;


        Object pod_tree=null;
        Object KW_USING17_tree=null;
        Object SP_COLCOL19_tree=null;
        Object char_literal21_tree=null;
        Object KW_AS23_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_SP_COLCOL=new RewriteRuleTokenStream(adaptor,"token SP_COLCOL");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_eos=new RewriteRuleSubtreeStream(adaptor,"rule eos");
        RewriteRuleSubtreeStream stream_podSpec=new RewriteRuleSubtreeStream(adaptor,"rule podSpec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:10: ( KW_USING podSpec SP_COLCOL pod= ( id ( '$' id )* ) KW_AS as= id eos -> ^( AST_USING_POD podSpec $pod $as) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:12: KW_USING podSpec SP_COLCOL pod= ( id ( '$' id )* ) KW_AS as= id eos
            {
            KW_USING17=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingAs543); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING17);

            pushFollow(FOLLOW_podSpec_in_usingAs545);
            podSpec18=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_podSpec.add(podSpec18.getTree());
            SP_COLCOL19=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingAs547); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SP_COLCOL.add(SP_COLCOL19);

            // src/net/colar/netbeans/fan/antlr/Fan.g:253:43: ( id ( '$' id )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:44: id ( '$' id )*
            {
            pushFollow(FOLLOW_id_in_usingAs552);
            id20=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id20.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:47: ( '$' id )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==150) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:253:48: '$' id
            	    {
            	    char_literal21=(Token)match(input,150,FOLLOW_150_in_usingAs555); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_150.add(char_literal21);

            	    pushFollow(FOLLOW_id_in_usingAs557);
            	    id22=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id.add(id22.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            KW_AS23=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_usingAs562); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS23);

            pushFollow(FOLLOW_id_in_usingAs566);
            as=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(as.getTree());
            pushFollow(FOLLOW_eos_in_usingAs568);
            eos24=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eos.add(eos24.getTree());


            // AST REWRITE
            // elements: podSpec, pod, as
            // token labels: pod
            // rule labels: retval, as
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_pod=new RewriteRuleTokenStream(adaptor,"token pod",pod);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_as=new RewriteRuleSubtreeStream(adaptor,"rule as",as!=null?as.tree:null);

            root_0 = (Object)adaptor.nil();
            // 254:4: -> ^( AST_USING_POD podSpec $pod $as)
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:254:7: ^( AST_USING_POD podSpec $pod $as)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_USING_POD, "AST_USING_POD"), root_1);

                adaptor.addChild(root_1, stream_podSpec.nextTree());
                adaptor.addChild(root_1, stream_pod.nextNode());
                adaptor.addChild(root_1, stream_as.nextTree());

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

    public static class podSpec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "podSpec"
    // src/net/colar/netbeans/fan/antlr/Fan.g:255:1: podSpec : ( ffi )? id ( DOT id )* ;
    public final FanParser.podSpec_return podSpec() throws RecognitionException {
        FanParser.podSpec_return retval = new FanParser.podSpec_return();
        retval.start = input.LT(1);
        int podSpec_StartIndex = input.index();
        Object root_0 = null;

        Token DOT27=null;
        FanParser.ffi_return ffi25 = null;

        FanParser.id_return id26 = null;

        FanParser.id_return id28 = null;


        Object DOT27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:255:10: ( ( ffi )? id ( DOT id )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:255:12: ( ffi )? id ( DOT id )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:255:12: ( ffi )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==SQ_BRACKET_L) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ffi
                    {
                    pushFollow(FOLLOW_ffi_in_podSpec593);
                    ffi25=ffi();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ffi25.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_podSpec596);
            id26=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id26.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:255:20: ( DOT id )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==DOT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:255:21: DOT id
            	    {
            	    DOT27=(Token)match(input,DOT,FOLLOW_DOT_in_podSpec599); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT27_tree = (Object)adaptor.create(DOT27);
            	    adaptor.addChild(root_0, DOT27_tree);
            	    }
            	    pushFollow(FOLLOW_id_in_podSpec601);
            	    id28=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, id28.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:256:1: ffi : sq_bracketL id sq_bracketR ;
    public final FanParser.ffi_return ffi() throws RecognitionException {
        FanParser.ffi_return retval = new FanParser.ffi_return();
        retval.start = input.LT(1);
        int ffi_StartIndex = input.index();
        Object root_0 = null;

        FanParser.sq_bracketL_return sq_bracketL29 = null;

        FanParser.id_return id30 = null;

        FanParser.sq_bracketR_return sq_bracketR31 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:256:7: ( sq_bracketL id sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:256:9: sq_bracketL id sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sq_bracketL_in_ffi612);
            sq_bracketL29=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL29.getTree());
            pushFollow(FOLLOW_id_in_ffi614);
            id30=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id30.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_ffi616);
            sq_bracketR31=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR31.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:258:1: podDef : podHeader BRACKET_L ( symbolDef )* BRACKET_R ;
    public final FanParser.podDef_return podDef() throws RecognitionException {
        FanParser.podDef_return retval = new FanParser.podDef_return();
        retval.start = input.LT(1);
        int podDef_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_L33=null;
        Token BRACKET_R35=null;
        FanParser.podHeader_return podHeader32 = null;

        FanParser.symbolDef_return symbolDef34 = null;


        Object BRACKET_L33_tree=null;
        Object BRACKET_R35_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:258:9: ( podHeader BRACKET_L ( symbolDef )* BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:258:11: podHeader BRACKET_L ( symbolDef )* BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_podHeader_in_podDef625);
            podHeader32=podHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, podHeader32.getTree());
            BRACKET_L33=(Token)match(input,BRACKET_L,FOLLOW_BRACKET_L_in_podDef627); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_L33_tree = (Object)adaptor.create(BRACKET_L33);
            adaptor.addChild(root_0, BRACKET_L33_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:258:31: ( symbolDef )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==EOF||(LA8_0>=KW_RD_ONLY && LA8_0<=KW_FINAL)||(LA8_0>=KW_CLASS && LA8_0<=KW_ONCE)||LA8_0==SP_PIPE||LA8_0==ID||(LA8_0>=AT && LA8_0<=DOC)||LA8_0==SQ_BRACKET_L) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: symbolDef
            	    {
            	    pushFollow(FOLLOW_symbolDef_in_podDef629);
            	    symbolDef34=symbolDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbolDef34.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            BRACKET_R35=(Token)match(input,BRACKET_R,FOLLOW_BRACKET_R_in_podDef632); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_R35_tree = (Object)adaptor.create(BRACKET_R35);
            adaptor.addChild(root_0, BRACKET_R35_tree);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:259:1: podHeader : docs ( facet )* pod id ;
    public final FanParser.podHeader_return podHeader() throws RecognitionException {
        FanParser.podHeader_return retval = new FanParser.podHeader_return();
        retval.start = input.LT(1);
        int podHeader_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs36 = null;

        FanParser.facet_return facet37 = null;

        FanParser.pod_return pod38 = null;

        FanParser.id_return id39 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:11: ( docs ( facet )* pod id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:13: docs ( facet )* pod id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_podHeader639);
            docs36=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs36.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:18: ( facet )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==AT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_podHeader641);
            	    facet37=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet37.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            pushFollow(FOLLOW_pod_in_podHeader644);
            pod38=pod();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pod38.getTree());
            pushFollow(FOLLOW_id_in_podHeader646);
            id39=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id39.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:260:1: symbolDef : docs ( facet )* ( symbolFlag )* typeId AS_INIT_VAL expr eos ;
    public final FanParser.symbolDef_return symbolDef() throws RecognitionException {
        FanParser.symbolDef_return retval = new FanParser.symbolDef_return();
        retval.start = input.LT(1);
        int symbolDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL44=null;
        FanParser.docs_return docs40 = null;

        FanParser.facet_return facet41 = null;

        FanParser.symbolFlag_return symbolFlag42 = null;

        FanParser.typeId_return typeId43 = null;

        FanParser.expr_return expr45 = null;

        FanParser.eos_return eos46 = null;


        Object AS_INIT_VAL44_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:260:11: ( docs ( facet )* ( symbolFlag )* typeId AS_INIT_VAL expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:260:13: docs ( facet )* ( symbolFlag )* typeId AS_INIT_VAL expr eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_symbolDef653);
            docs40=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs40.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:260:18: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_symbolDef655);
            	    facet41=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet41.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:260:25: ( symbolFlag )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==KW_VIRTUAL) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: symbolFlag
            	    {
            	    pushFollow(FOLLOW_symbolFlag_in_symbolDef658);
            	    symbolFlag42=symbolFlag();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbolFlag42.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            pushFollow(FOLLOW_typeId_in_symbolDef661);
            typeId43=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId43.getTree());
            AS_INIT_VAL44=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_symbolDef663); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AS_INIT_VAL44_tree = (Object)adaptor.create(AS_INIT_VAL44);
            adaptor.addChild(root_0, AS_INIT_VAL44_tree);
            }
            pushFollow(FOLLOW_expr_in_symbolDef665);
            expr45=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr45.getTree());
            pushFollow(FOLLOW_eos_in_symbolDef667);
            eos46=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos46.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:261:1: symbolFlag : 'virtual' ;
    public final FanParser.symbolFlag_return symbolFlag() throws RecognitionException {
        FanParser.symbolFlag_return retval = new FanParser.symbolFlag_return();
        retval.start = input.LT(1);
        int symbolFlag_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal47=null;

        Object string_literal47_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:261:12: ( 'virtual' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:261:14: 'virtual'
            {
            root_0 = (Object)adaptor.nil();

            string_literal47=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_symbolFlag674); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal47_tree = (Object)adaptor.create(string_literal47);
            adaptor.addChild(root_0, string_literal47_tree);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:264:1: typeDef : docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) ;
    public final FanParser.typeDef_return typeDef() throws RecognitionException {
        FanParser.typeDef_return retval = new FanParser.typeDef_return();
        retval.start = input.LT(1);
        int typeDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs48 = null;

        FanParser.facet_return facet49 = null;

        FanParser.classDef_return classDef50 = null;

        FanParser.enumDef_return enumDef51 = null;

        FanParser.mixinDef_return mixinDef52 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:264:10: ( docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:264:12: docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_typeDef684);
            docs48=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs48.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:264:17: ( facet )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AT) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==ID) ) {
                        int LA12_3 = input.LA(3);

                        if ( (synpred13_Fan()) ) {
                            alt12=1;
                        }


                    }


                }


                switch (alt12) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_typeDef686);
            	    facet49=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet49.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:264:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:264:25: ( ( classFlags )* KW_CLASS )=> classDef
                    {
                    pushFollow(FOLLOW_classDef_in_typeDef697);
                    classDef50=classDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDef50.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:265:4: ( ( protection )? KW_ENUM )=> enumDef
                    {
                    pushFollow(FOLLOW_enumDef_in_typeDef711);
                    enumDef51=enumDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDef51.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:265:37: mixinDef
                    {
                    pushFollow(FOLLOW_mixinDef_in_typeDef715);
                    mixinDef52=mixinDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mixinDef52.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:266:1: classDef : classHeader classBody -> ^( AST_CLASS classHeader classBody ) ;
    public final FanParser.classDef_return classDef() throws RecognitionException {
        FanParser.classDef_return retval = new FanParser.classDef_return();
        retval.start = input.LT(1);
        int classDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.classHeader_return classHeader53 = null;

        FanParser.classBody_return classBody54 = null;


        RewriteRuleSubtreeStream stream_classHeader=new RewriteRuleSubtreeStream(adaptor,"rule classHeader");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        paraphrase.push("Class definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:3: ( classHeader classBody -> ^( AST_CLASS classHeader classBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:7: classHeader classBody
            {
            pushFollow(FOLLOW_classHeader_in_classDef737);
            classHeader53=classHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classHeader.add(classHeader53.getTree());
            pushFollow(FOLLOW_classBody_in_classDef739);
            classBody54=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBody.add(classBody54.getTree());


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
            // 268:7: -> ^( AST_CLASS classHeader classBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:268:10: ^( AST_CLASS classHeader classBody )
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:269:1: classHeader : docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )? -> ^( AST_ID $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* ;
    public final FanParser.classHeader_return classHeader() throws RecognitionException {
        FanParser.classHeader_return retval = new FanParser.classHeader_return();
        retval.start = input.LT(1);
        int classHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CLASS57=null;
        FanParser.classFlags_return m = null;

        FanParser.id_return cname = null;

        FanParser.docs_return docs55 = null;

        FanParser.facet_return facet56 = null;

        FanParser.inheritance_return inheritance58 = null;


        Object KW_CLASS57_tree=null;
        RewriteRuleTokenStream stream_KW_CLASS=new RewriteRuleTokenStream(adaptor,"token KW_CLASS");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_classFlags=new RewriteRuleSubtreeStream(adaptor,"rule classFlags");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:13: ( docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )? -> ^( AST_ID $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:15: docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_classHeader762);
            docs55=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs55.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:20: ( facet )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==AT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_classHeader764);
            	    facet56=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet56.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:269:28: (m= classFlags )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=KW_CONST && LA15_0<=KW_STATIC)||LA15_0==KW_FINAL||(LA15_0>=KW_ABSTRACT && LA15_0<=KW_INTERNAL)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= classFlags
            	    {
            	    pushFollow(FOLLOW_classFlags_in_classHeader769);
            	    m=classFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            KW_CLASS57=(Token)match(input,KW_CLASS,FOLLOW_KW_CLASS_in_classHeader772); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CLASS.add(KW_CLASS57);

            pushFollow(FOLLOW_id_in_classHeader776);
            cname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(cname.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:59: ( inheritance )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==SP_COLON) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_classHeader778);
                    inheritance58=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance58.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: inheritance, m, cname
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
            // 270:4: -> ^( AST_ID $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )*
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:270:7: ^( AST_ID $cname)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_1);

                adaptor.addChild(root_1, stream_cname.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:270:24: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:270:24: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:270:56: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:270:56: ^( AST_MODIFIER $m)
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:271:1: classFlags : ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC );
    public final FanParser.classFlags_return classFlags() throws RecognitionException {
        FanParser.classFlags_return retval = new FanParser.classFlags_return();
        retval.start = input.LT(1);
        int classFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ABSTRACT60=null;
        Token KW_FINAL61=null;
        Token KW_CONST62=null;
        Token KW_STATIC63=null;
        FanParser.protection_return protection59 = null;


        Object KW_ABSTRACT60_tree=null;
        Object KW_FINAL61_tree=null;
        Object KW_CONST62_tree=null;
        Object KW_STATIC63_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:271:13: ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC )
            int alt17=5;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt17=1;
                }
                break;
            case KW_ABSTRACT:
                {
                alt17=2;
                }
                break;
            case KW_FINAL:
                {
                alt17=3;
                }
                break;
            case KW_CONST:
                {
                alt17=4;
                }
                break;
            case KW_STATIC:
                {
                alt17=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:15: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_classFlags814);
                    protection59=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection59.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:28: KW_ABSTRACT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ABSTRACT60=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_classFlags818); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ABSTRACT60_tree = (Object)adaptor.create(KW_ABSTRACT60);
                    adaptor.addChild(root_0, KW_ABSTRACT60_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:42: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL61=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_classFlags822); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL61_tree = (Object)adaptor.create(KW_FINAL61);
                    adaptor.addChild(root_0, KW_FINAL61_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:53: KW_CONST
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_CONST62=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_classFlags826); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_CONST62_tree = (Object)adaptor.create(KW_CONST62);
                    adaptor.addChild(root_0, KW_CONST62_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:64: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC63=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_classFlags830); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC63_tree = (Object)adaptor.create(KW_STATIC63);
                    adaptor.addChild(root_0, KW_STATIC63_tree);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:272:1: classBody : ( bracketL ( slotDef )* bracketR ) -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) ;
    public final FanParser.classBody_return classBody() throws RecognitionException {
        FanParser.classBody_return retval = new FanParser.classBody_return();
        retval.start = input.LT(1);
        int classBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL64 = null;

        FanParser.slotDef_return slotDef65 = null;

        FanParser.bracketR_return bracketR66 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:12: ( ( bracketL ( slotDef )* bracketR ) -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:14: ( bracketL ( slotDef )* bracketR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:14: ( bracketL ( slotDef )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:15: bracketL ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_classBody839);
            bracketL64=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL64.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:272:24: ( slotDef )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=KW_RD_ONLY && LA18_0<=KW_FINAL)||(LA18_0>=KW_ABSTRACT && LA18_0<=KW_ONCE)||LA18_0==SP_PIPE||LA18_0==ID||(LA18_0>=AT && LA18_0<=DOC)||LA18_0==SQ_BRACKET_L) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_classBody841);
            	    slotDef65=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef65.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_classBody844);
            bracketR66=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR66.getTree());

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
            // 272:44: -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:272:47: ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:272:73: ( slotDef )*
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:273:1: protection : ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL );
    public final FanParser.protection_return protection() throws RecognitionException {
        FanParser.protection_return retval = new FanParser.protection_return();
        retval.start = input.LT(1);
        int protection_StartIndex = input.index();
        Object root_0 = null;

        Token set67=null;

        Object set67_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:273:12: ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            root_0 = (Object)adaptor.nil();

            set67=(Token)input.LT(1);
            if ( (input.LA(1)>=KW_PRIVATE && input.LA(1)<=KW_INTERNAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set67));
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:274:1: mixinDef : mixinHeader mixinBody -> ^( AST_MIXIN mixinHeader mixinBody ) ;
    public final FanParser.mixinDef_return mixinDef() throws RecognitionException {
        FanParser.mixinDef_return retval = new FanParser.mixinDef_return();
        retval.start = input.LT(1);
        int mixinDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mixinHeader_return mixinHeader68 = null;

        FanParser.mixinBody_return mixinBody69 = null;


        RewriteRuleSubtreeStream stream_mixinBody=new RewriteRuleSubtreeStream(adaptor,"rule mixinBody");
        RewriteRuleSubtreeStream stream_mixinHeader=new RewriteRuleSubtreeStream(adaptor,"rule mixinHeader");
        paraphrase.push("Mixin definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:3: ( mixinHeader mixinBody -> ^( AST_MIXIN mixinHeader mixinBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:275:5: mixinHeader mixinBody
            {
            pushFollow(FOLLOW_mixinHeader_in_mixinDef896);
            mixinHeader68=mixinHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mixinHeader.add(mixinHeader68.getTree());
            pushFollow(FOLLOW_mixinBody_in_mixinDef898);
            mixinBody69=mixinBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_mixinBody.add(mixinBody69.getTree());


            // AST REWRITE
            // elements: mixinBody, mixinHeader
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 276:7: -> ^( AST_MIXIN mixinHeader mixinBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:276:10: ^( AST_MIXIN mixinHeader mixinBody )
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:277:1: mixinHeader : docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )? -> ^( AST_ID $mname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* ;
    public final FanParser.mixinHeader_return mixinHeader() throws RecognitionException {
        FanParser.mixinHeader_return retval = new FanParser.mixinHeader_return();
        retval.start = input.LT(1);
        int mixinHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_MIXIN72=null;
        FanParser.mixinFlags_return m = null;

        FanParser.id_return mname = null;

        FanParser.docs_return docs70 = null;

        FanParser.facet_return facet71 = null;

        FanParser.inheritance_return inheritance73 = null;


        Object KW_MIXIN72_tree=null;
        RewriteRuleTokenStream stream_KW_MIXIN=new RewriteRuleTokenStream(adaptor,"token KW_MIXIN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_mixinFlags=new RewriteRuleSubtreeStream(adaptor,"rule mixinFlags");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:277:13: ( docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )? -> ^( AST_ID $mname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:277:15: docs ( facet )* (m= mixinFlags )* KW_MIXIN mname= id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_mixinHeader921);
            docs70=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs70.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:277:20: ( facet )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==AT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_mixinHeader923);
            	    facet71=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet71.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:277:28: (m= mixinFlags )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=KW_CONST && LA20_0<=KW_STATIC)||LA20_0==KW_FINAL||(LA20_0>=KW_PRIVATE && LA20_0<=KW_INTERNAL)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= mixinFlags
            	    {
            	    pushFollow(FOLLOW_mixinFlags_in_mixinHeader928);
            	    m=mixinFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_mixinFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            KW_MIXIN72=(Token)match(input,KW_MIXIN,FOLLOW_KW_MIXIN_in_mixinHeader931); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_MIXIN.add(KW_MIXIN72);

            pushFollow(FOLLOW_id_in_mixinHeader935);
            mname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(mname.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:277:59: ( inheritance )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==SP_COLON) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_mixinHeader937);
                    inheritance73=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance73.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: inheritance, mname, m
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
            // 278:4: -> ^( AST_ID $mname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )*
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:278:7: ^( AST_ID $mname)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_1);

                adaptor.addChild(root_1, stream_mname.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:278:24: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:278:24: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:278:56: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:278:56: ^( AST_MODIFIER $m)
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:279:1: mixinFlags : ( protection | KW_CONST | KW_STATIC | KW_FINAL );
    public final FanParser.mixinFlags_return mixinFlags() throws RecognitionException {
        FanParser.mixinFlags_return retval = new FanParser.mixinFlags_return();
        retval.start = input.LT(1);
        int mixinFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CONST75=null;
        Token KW_STATIC76=null;
        Token KW_FINAL77=null;
        FanParser.protection_return protection74 = null;


        Object KW_CONST75_tree=null;
        Object KW_STATIC76_tree=null;
        Object KW_FINAL77_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:279:12: ( protection | KW_CONST | KW_STATIC | KW_FINAL )
            int alt22=4;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt22=1;
                }
                break;
            case KW_CONST:
                {
                alt22=2;
                }
                break;
            case KW_STATIC:
                {
                alt22=3;
                }
                break;
            case KW_FINAL:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:279:14: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_mixinFlags972);
                    protection74=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection74.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:279:27: KW_CONST
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_CONST75=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_mixinFlags976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_CONST75_tree = (Object)adaptor.create(KW_CONST75);
                    adaptor.addChild(root_0, KW_CONST75_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:279:38: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC76=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_mixinFlags980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC76_tree = (Object)adaptor.create(KW_STATIC76);
                    adaptor.addChild(root_0, KW_STATIC76_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:279:50: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL77=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_mixinFlags984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL77_tree = (Object)adaptor.create(KW_FINAL77);
                    adaptor.addChild(root_0, KW_FINAL77_tree);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:280:1: mixinBody : bracketL ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) ;
    public final FanParser.mixinBody_return mixinBody() throws RecognitionException {
        FanParser.mixinBody_return retval = new FanParser.mixinBody_return();
        retval.start = input.LT(1);
        int mixinBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL78 = null;

        FanParser.slotDef_return slotDef79 = null;

        FanParser.bracketR_return bracketR80 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:11: ( bracketL ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:13: bracketL ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_mixinBody991);
            bracketL78=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL78.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:22: ( slotDef )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=KW_RD_ONLY && LA23_0<=KW_FINAL)||(LA23_0>=KW_ABSTRACT && LA23_0<=KW_ONCE)||LA23_0==SP_PIPE||LA23_0==ID||(LA23_0>=AT && LA23_0<=DOC)||LA23_0==SQ_BRACKET_L) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_mixinBody993);
            	    slotDef79=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef79.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_mixinBody996);
            bracketR80=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR80.getTree());


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
            // 280:41: -> ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:280:44: ^( AST_CODE_BLOCK bracketL ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:280:70: ( slotDef )*
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:281:1: enumDef : enumHeader enumBody -> ^( AST_ENUM enumHeader enumBody ) ;
    public final FanParser.enumDef_return enumDef() throws RecognitionException {
        FanParser.enumDef_return retval = new FanParser.enumDef_return();
        retval.start = input.LT(1);
        int enumDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.enumHeader_return enumHeader81 = null;

        FanParser.enumBody_return enumBody82 = null;


        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_enumHeader=new RewriteRuleSubtreeStream(adaptor,"rule enumHeader");
        paraphrase.push("Enumeration definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:3: ( enumHeader enumBody -> ^( AST_ENUM enumHeader enumBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:282:5: enumHeader enumBody
            {
            pushFollow(FOLLOW_enumHeader_in_enumDef1029);
            enumHeader81=enumHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumHeader.add(enumHeader81.getTree());
            pushFollow(FOLLOW_enumBody_in_enumDef1031);
            enumBody82=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody82.getTree());


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
            // 283:7: -> ^( AST_ENUM enumHeader enumBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:283:10: ^( AST_ENUM enumHeader enumBody )
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:284:1: enumHeader : docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )? -> ^( AST_ID $ename) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* ;
    public final FanParser.enumHeader_return enumHeader() throws RecognitionException {
        FanParser.enumHeader_return retval = new FanParser.enumHeader_return();
        retval.start = input.LT(1);
        int enumHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ENUM85=null;
        FanParser.protection_return m = null;

        FanParser.id_return ename = null;

        FanParser.docs_return docs83 = null;

        FanParser.facet_return facet84 = null;

        FanParser.inheritance_return inheritance86 = null;


        Object KW_ENUM85_tree=null;
        RewriteRuleTokenStream stream_KW_ENUM=new RewriteRuleTokenStream(adaptor,"token KW_ENUM");
        RewriteRuleSubtreeStream stream_protection=new RewriteRuleSubtreeStream(adaptor,"rule protection");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:12: ( docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )? -> ^( AST_ID $ename) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:17: docs ( facet )* (m= protection )? KW_ENUM ename= id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_enumHeader1057);
            docs83=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs83.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:22: ( facet )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_enumHeader1059);
            	    facet84=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet84.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:284:30: (m= protection )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=KW_PRIVATE && LA25_0<=KW_INTERNAL)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= protection
                    {
                    pushFollow(FOLLOW_protection_in_enumHeader1064);
                    m=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protection.add(m.getTree());

                    }
                    break;

            }

            KW_ENUM85=(Token)match(input,KW_ENUM,FOLLOW_KW_ENUM_in_enumHeader1067); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_ENUM.add(KW_ENUM85);

            pushFollow(FOLLOW_id_in_enumHeader1071);
            ename=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(ename.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:284:60: ( inheritance )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==SP_COLON) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_enumHeader1073);
                    inheritance86=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance86.getTree());

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
            // 285:4: -> ^( AST_ID $ename) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )*
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:285:7: ^( AST_ID $ename)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_1);

                adaptor.addChild(root_1, stream_ename.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:285:24: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:24: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:285:56: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:56: ^( AST_MODIFIER $m)
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:286:1: enumBody : bracketL enumValDefs ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR ) ;
    public final FanParser.enumBody_return enumBody() throws RecognitionException {
        FanParser.enumBody_return retval = new FanParser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL87 = null;

        FanParser.enumValDefs_return enumValDefs88 = null;

        FanParser.slotDef_return slotDef89 = null;

        FanParser.bracketR_return bracketR90 = null;


        RewriteRuleSubtreeStream stream_slotDef=new RewriteRuleSubtreeStream(adaptor,"rule slotDef");
        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        RewriteRuleSubtreeStream stream_enumValDefs=new RewriteRuleSubtreeStream(adaptor,"rule enumValDefs");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:10: ( bracketL enumValDefs ( slotDef )* bracketR -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:12: bracketL enumValDefs ( slotDef )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_enumBody1108);
            bracketL87=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL87.getTree());
            pushFollow(FOLLOW_enumValDefs_in_enumBody1110);
            enumValDefs88=enumValDefs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumValDefs.add(enumValDefs88.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:33: ( slotDef )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=KW_RD_ONLY && LA27_0<=KW_FINAL)||(LA27_0>=KW_ABSTRACT && LA27_0<=KW_ONCE)||LA27_0==SP_PIPE||LA27_0==ID||(LA27_0>=AT && LA27_0<=DOC)||LA27_0==SQ_BRACKET_L) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_enumBody1112);
            	    slotDef89=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slotDef.add(slotDef89.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_enumBody1115);
            bracketR90=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR90.getTree());


            // AST REWRITE
            // elements: bracketR, slotDef, bracketL, enumValDefs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 286:53: -> ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:286:56: ^( AST_CODE_BLOCK bracketL enumValDefs ( slotDef )* bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                adaptor.addChild(root_1, stream_enumValDefs.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:286:94: ( slotDef )*
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:287:1: inheritance : SP_COLON typeList ;
    public final FanParser.inheritance_return inheritance() throws RecognitionException {
        FanParser.inheritance_return retval = new FanParser.inheritance_return();
        retval.start = input.LT(1);
        int inheritance_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON91=null;
        FanParser.typeList_return typeList92 = null;


        Object SP_COLON91_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:14: ( SP_COLON typeList )
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:16: SP_COLON typeList
            {
            root_0 = (Object)adaptor.nil();

            SP_COLON91=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_inheritance1140); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON91_tree = (Object)adaptor.create(SP_COLON91);
            adaptor.addChild(root_0, SP_COLON91_tree);
            }
            pushFollow(FOLLOW_typeList_in_inheritance1142);
            typeList92=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList92.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:289:1: enumValDefs : enumValDef ( SP_COMMA enumValDef )* eos ;
    public final FanParser.enumValDefs_return enumValDefs() throws RecognitionException {
        FanParser.enumValDefs_return retval = new FanParser.enumValDefs_return();
        retval.start = input.LT(1);
        int enumValDefs_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA94=null;
        FanParser.enumValDef_return enumValDef93 = null;

        FanParser.enumValDef_return enumValDef95 = null;

        FanParser.eos_return eos96 = null;


        Object SP_COMMA94_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:14: ( enumValDef ( SP_COMMA enumValDef )* eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:16: enumValDef ( SP_COMMA enumValDef )* eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_enumValDef_in_enumValDefs1152);
            enumValDef93=enumValDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValDef93.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:27: ( SP_COMMA enumValDef )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==SP_COMMA) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:289:28: SP_COMMA enumValDef
            	    {
            	    SP_COMMA94=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_enumValDefs1155); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA94_tree = (Object)adaptor.create(SP_COMMA94);
            	    adaptor.addChild(root_0, SP_COMMA94_tree);
            	    }
            	    pushFollow(FOLLOW_enumValDef_in_enumValDefs1158);
            	    enumValDef95=enumValDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValDef95.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            pushFollow(FOLLOW_eos_in_enumValDefs1162);
            eos96=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos96.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:290:1: enumValDef : docs id ( parL ( args )? parR )? ;
    public final FanParser.enumValDef_return enumValDef() throws RecognitionException {
        FanParser.enumValDef_return retval = new FanParser.enumValDef_return();
        retval.start = input.LT(1);
        int enumValDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs97 = null;

        FanParser.id_return id98 = null;

        FanParser.parL_return parL99 = null;

        FanParser.args_return args100 = null;

        FanParser.parR_return parR101 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:290:13: ( docs id ( parL ( args )? parR )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:290:15: docs id ( parL ( args )? parR )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_enumValDef1170);
            docs97=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs97.getTree());
            pushFollow(FOLLOW_id_in_enumValDef1172);
            id98=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id98.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:290:23: ( parL ( args )? parR )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==PAR_L) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:290:24: parL ( args )? parR
                    {
                    pushFollow(FOLLOW_parL_in_enumValDef1175);
                    parL99=parL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parL99.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:290:29: ( args )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=KW_THIS && LA29_0<=KW_SUPER)||(LA29_0>=KW_NULL && LA29_0<=KW_FALSE)||LA29_0==SP_PIPE||LA29_0==OP_CURRY||(LA29_0>=OP_PLUS && LA29_0<=OP_MULTI)||(LA29_0>=OP_BANG && LA29_0<=OP_TILDA)||(LA29_0>=ID && LA29_0<=AT)||(LA29_0>=NUMBER && LA29_0<=SQ_BRACKET_L)||LA29_0==PAR_L) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                            {
                            pushFollow(FOLLOW_args_in_enumValDef1177);
                            args100=args();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, args100.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_parR_in_enumValDef1180);
                    parR101=parR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parR101.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:291:1: typeList : type ( SP_COMMA type )* ;
    public final FanParser.typeList_return typeList() throws RecognitionException {
        FanParser.typeList_return retval = new FanParser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA103=null;
        FanParser.type_return type102 = null;

        FanParser.type_return type104 = null;


        Object SP_COMMA103_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:10: ( type ( SP_COMMA type )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:14: type ( SP_COMMA type )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_typeList1191);
            type102=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type102.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:19: ( SP_COMMA type )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==SP_COMMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:291:20: SP_COMMA type
            	    {
            	    SP_COMMA103=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_typeList1194); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA103_tree = (Object)adaptor.create(SP_COMMA103);
            	    adaptor.addChild(root_0, SP_COMMA103_tree);
            	    }
            	    pushFollow(FOLLOW_type_in_typeList1196);
            	    type104=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type104.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:293:1: type : typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ;
    public final FanParser.type_return type() throws RecognitionException {
        FanParser.type_return retval = new FanParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK106=null;
        Token LIST_TYPE107=null;
        Token SP_QMARK108=null;
        FanParser.typeRoot_return typeRoot105 = null;


        Object SP_QMARK106_tree=null;
        Object LIST_TYPE107_tree=null;
        Object SP_QMARK108_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:293:14: ( typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:293:18: typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeRoot_in_type1216);
            typeRoot105=typeRoot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeRoot105.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:293:28: ( SP_QMARK )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==SP_QMARK) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred44_Fan()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    SP_QMARK106=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type1219); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_QMARK106_tree = (Object)adaptor.create(SP_QMARK106);
                    adaptor.addChild(root_0, SP_QMARK106_tree);
                    }

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:293:38: ( LIST_TYPE ( SP_QMARK )? )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==LIST_TYPE) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred46_Fan()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:293:39: LIST_TYPE ( SP_QMARK )?
            	    {
            	    LIST_TYPE107=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_type1223); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LIST_TYPE107_tree = (Object)adaptor.create(LIST_TYPE107);
            	    adaptor.addChild(root_0, LIST_TYPE107_tree);
            	    }
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:293:49: ( SP_QMARK )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==SP_QMARK) ) {
            	        int LA33_1 = input.LA(2);

            	        if ( (synpred45_Fan()) ) {
            	            alt33=1;
            	        }
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK108=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type1225); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK108_tree = (Object)adaptor.create(SP_QMARK108);
            	            adaptor.addChild(root_0, SP_QMARK108_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:294:1: nonMapType : ( funcType | simpleType );
    public final FanParser.nonMapType_return nonMapType() throws RecognitionException {
        FanParser.nonMapType_return retval = new FanParser.nonMapType_return();
        retval.start = input.LT(1);
        int nonMapType_StartIndex = input.index();
        Object root_0 = null;

        FanParser.funcType_return funcType109 = null;

        FanParser.simpleType_return simpleType110 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:294:12: ( funcType | simpleType )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==SP_PIPE) ) {
                alt35=1;
            }
            else if ( (LA35_0==ID) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:294:14: funcType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_nonMapType1236);
                    funcType109=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType109.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:294:25: simpleType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simpleType_in_nonMapType1240);
                    simpleType110=simpleType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType110.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:295:1: typeRoot : ( mapType | nonMapType );
    public final FanParser.typeRoot_return typeRoot() throws RecognitionException {
        FanParser.typeRoot_return retval = new FanParser.typeRoot_return();
        retval.start = input.LT(1);
        int typeRoot_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mapType_return mapType111 = null;

        FanParser.nonMapType_return nonMapType112 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:295:10: ( mapType | nonMapType )
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

                if ( (synpred48_Fan()) ) {
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

                if ( (synpred48_Fan()) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:295:12: mapType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_mapType_in_typeRoot1247);
                    mapType111=mapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapType111.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:295:22: nonMapType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nonMapType_in_typeRoot1251);
                    nonMapType112=nonMapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonMapType112.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:296:1: simpleType : id ( SP_COLCOL id )? ;
    public final FanParser.simpleType_return simpleType() throws RecognitionException {
        FanParser.simpleType_return retval = new FanParser.simpleType_return();
        retval.start = input.LT(1);
        int simpleType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLCOL114=null;
        FanParser.id_return id113 = null;

        FanParser.id_return id115 = null;


        Object SP_COLCOL114_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:17: ( id ( SP_COLCOL id )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:21: id ( SP_COLCOL id )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_simpleType1265);
            id113=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id113.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:296:24: ( SP_COLCOL id )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==SP_COLCOL) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:296:25: SP_COLCOL id
                    {
                    SP_COLCOL114=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_simpleType1268); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLCOL114_tree = (Object)adaptor.create(SP_COLCOL114);
                    adaptor.addChild(root_0, SP_COLCOL114_tree);
                    }
                    pushFollow(FOLLOW_id_in_simpleType1270);
                    id115=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id115.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:298:1: mapType : ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? ;
    public final FanParser.mapType_return mapType() throws RecognitionException {
        FanParser.mapType_return retval = new FanParser.mapType_return();
        retval.start = input.LT(1);
        int mapType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK118=null;
        Token LIST_TYPE119=null;
        Token SP_QMARK120=null;
        Token SP_COLON121=null;
        FanParser.sq_bracketL_return sq_bracketL116 = null;

        FanParser.nonMapType_return nonMapType117 = null;

        FanParser.type_return type122 = null;

        FanParser.sq_bracketR_return sq_bracketR123 = null;


        Object SP_QMARK118_tree=null;
        Object LIST_TYPE119_tree=null;
        Object SP_QMARK120_tree=null;
        Object SP_COLON121_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:10: ( ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:12: ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )?
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:298:12: ( sq_bracketL )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==SQ_BRACKET_L) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: sq_bracketL
                    {
                    pushFollow(FOLLOW_sq_bracketL_in_mapType1281);
                    sq_bracketL116=sq_bracketL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL116.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_nonMapType_in_mapType1284);
            nonMapType117=nonMapType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, nonMapType117.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:36: ( SP_QMARK )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==SP_QMARK) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    SP_QMARK118=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType1286); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_QMARK118_tree = (Object)adaptor.create(SP_QMARK118);
                    adaptor.addChild(root_0, SP_QMARK118_tree);
                    }

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:298:46: ( LIST_TYPE ( SP_QMARK )? )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LIST_TYPE) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:298:47: LIST_TYPE ( SP_QMARK )?
            	    {
            	    LIST_TYPE119=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_mapType1290); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LIST_TYPE119_tree = (Object)adaptor.create(LIST_TYPE119);
            	    adaptor.addChild(root_0, LIST_TYPE119_tree);
            	    }
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:298:57: ( SP_QMARK )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==SP_QMARK) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK120=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType1292); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK120_tree = (Object)adaptor.create(SP_QMARK120);
            	            adaptor.addChild(root_0, SP_QMARK120_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:299:5: ({...}? SP_COLON {...}? type )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==SP_COLON) ) {
                    int LA42_2 = input.LA(2);

                    if ( ((synpred54_Fan()&&(notAfterEol()))) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:299:6: {...}? SP_COLON {...}? type
            	    {
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    SP_COLON121=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapType1304); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COLON121_tree = (Object)adaptor.create(SP_COLON121);
            	    adaptor.addChild(root_0, SP_COLON121_tree);
            	    }
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    pushFollow(FOLLOW_type_in_mapType1308);
            	    type122=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type122.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:299:56: ( sq_bracketR )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==SQ_BRACKET_R) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred55_Fan()) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: sq_bracketR
                    {
                    pushFollow(FOLLOW_sq_bracketR_in_mapType1312);
                    sq_bracketR123=sq_bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR123.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:300:1: funcType : SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE ;
    public final FanParser.funcType_return funcType() throws RecognitionException {
        FanParser.funcType_return retval = new FanParser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_PIPE124=null;
        Token SP_COMMA125=null;
        Token SP_PIPE129=null;
        FanParser.formals_return formals126 = null;

        FanParser.assignedType_return assignedType127 = null;

        FanParser.assignedType_return assignedType128 = null;


        Object SP_PIPE124_tree=null;
        Object SP_COMMA125_tree=null;
        Object SP_PIPE129_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:11: ( SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE )
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:13: SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE
            {
            root_0 = (Object)adaptor.nil();

            SP_PIPE124=(Token)match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType1321); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_PIPE124_tree = (Object)adaptor.create(SP_PIPE124);
            adaptor.addChild(root_0, SP_PIPE124_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:300:21: ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) )
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==SP_COMMA) ) {
                alt45=1;
            }
            else if ( (LA45_0==SP_PIPE||LA45_0==ID||LA45_0==SQ_BRACKET_L) ) {
                alt45=2;
            }
            else if ( (LA45_0==OP_ARROW) && (synpred59_Fan())) {
                alt45=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:300:22: SP_COMMA
                    {
                    SP_COMMA125=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_funcType1324); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COMMA125_tree = (Object)adaptor.create(SP_COMMA125);
                    adaptor.addChild(root_0, SP_COMMA125_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:300:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:300:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:300:34: formals ( ( OP_ARROW )=> assignedType )?
                    {
                    pushFollow(FOLLOW_formals_in_funcType1329);
                    formals126=formals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formals126.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:300:42: ( ( OP_ARROW )=> assignedType )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==OP_ARROW) && (synpred57_Fan())) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:300:43: ( OP_ARROW )=> assignedType
                            {
                            pushFollow(FOLLOW_assignedType_in_funcType1336);
                            assignedType127=assignedType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType127.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:300:73: ( ( OP_ARROW )=> assignedType )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:300:73: ( ( OP_ARROW )=> assignedType )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:300:74: ( OP_ARROW )=> assignedType
                    {
                    pushFollow(FOLLOW_assignedType_in_funcType1348);
                    assignedType128=assignedType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType128.getTree());

                    }


                    }
                    break;

            }

            SP_PIPE129=(Token)match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType1352); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_PIPE129_tree = (Object)adaptor.create(SP_PIPE129);
            adaptor.addChild(root_0, SP_PIPE129_tree);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:301:1: assignedType : OP_ARROW type ;
    public final FanParser.assignedType_return assignedType() throws RecognitionException {
        FanParser.assignedType_return retval = new FanParser.assignedType_return();
        retval.start = input.LT(1);
        int assignedType_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW130=null;
        FanParser.type_return type131 = null;


        Object OP_ARROW130_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:301:14: ( OP_ARROW type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:301:16: OP_ARROW type
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW130=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_assignedType1359); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW130_tree = (Object)adaptor.create(OP_ARROW130);
            adaptor.addChild(root_0, OP_ARROW130_tree);
            }
            pushFollow(FOLLOW_type_in_assignedType1361);
            type131=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type131.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:302:1: formals : formal ( SP_COMMA formal )* ;
    public final FanParser.formals_return formals() throws RecognitionException {
        FanParser.formals_return retval = new FanParser.formals_return();
        retval.start = input.LT(1);
        int formals_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA133=null;
        FanParser.formal_return formal132 = null;

        FanParser.formal_return formal134 = null;


        Object SP_COMMA133_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:10: ( formal ( SP_COMMA formal )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:14: formal ( SP_COMMA formal )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_formal_in_formals1371);
            formal132=formal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formal132.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:21: ( SP_COMMA formal )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==SP_COMMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:302:22: SP_COMMA formal
            	    {
            	    SP_COMMA133=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_formals1374); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA133_tree = (Object)adaptor.create(SP_COMMA133);
            	    adaptor.addChild(root_0, SP_COMMA133_tree);
            	    }
            	    pushFollow(FOLLOW_formal_in_formals1376);
            	    formal134=formal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal134.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:303:1: formal : ( formalFull | formalTypeOnly | formalInferred );
    public final FanParser.formal_return formal() throws RecognitionException {
        FanParser.formal_return retval = new FanParser.formal_return();
        retval.start = input.LT(1);
        int formal_StartIndex = input.index();
        Object root_0 = null;

        FanParser.formalFull_return formalFull135 = null;

        FanParser.formalTypeOnly_return formalTypeOnly136 = null;

        FanParser.formalInferred_return formalInferred137 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:303:9: ( formalFull | formalTypeOnly | formalInferred )
            int alt47=3;
            switch ( input.LA(1) ) {
            case SQ_BRACKET_L:
                {
                int LA47_1 = input.LA(2);

                if ( (synpred61_Fan()) ) {
                    alt47=1;
                }
                else if ( (synpred62_Fan()) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case SP_PIPE:
                {
                int LA47_2 = input.LA(2);

                if ( (synpred61_Fan()) ) {
                    alt47=1;
                }
                else if ( (synpred62_Fan()) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA47_3 = input.LA(2);

                if ( (synpred61_Fan()) ) {
                    alt47=1;
                }
                else if ( (synpred62_Fan()) ) {
                    alt47=2;
                }
                else if ( (true) ) {
                    alt47=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:303:11: formalFull
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalFull_in_formal1386);
                    formalFull135=formalFull();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalFull135.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:303:24: formalTypeOnly
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalTypeOnly_in_formal1390);
                    formalTypeOnly136=formalTypeOnly();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalTypeOnly136.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:303:41: formalInferred
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalInferred_in_formal1394);
                    formalInferred137=formalInferred();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalInferred137.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:304:1: formalFull : type id ;
    public final FanParser.formalFull_return formalFull() throws RecognitionException {
        FanParser.formalFull_return retval = new FanParser.formalFull_return();
        retval.start = input.LT(1);
        int formalFull_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type138 = null;

        FanParser.id_return id139 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:17: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:19: type id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalFull1406);
            type138=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type138.getTree());
            pushFollow(FOLLOW_id_in_formalFull1408);
            id139=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id139.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:305:1: formalTypeOnly : type ;
    public final FanParser.formalTypeOnly_return formalTypeOnly() throws RecognitionException {
        FanParser.formalTypeOnly_return retval = new FanParser.formalTypeOnly_return();
        retval.start = input.LT(1);
        int formalTypeOnly_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type140 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:17: ( type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:305:21: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalTypeOnly1418);
            type140=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type140.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:306:1: formalInferred : id ;
    public final FanParser.formalInferred_return formalInferred() throws RecognitionException {
        FanParser.formalInferred_return retval = new FanParser.formalInferred_return();
        retval.start = input.LT(1);
        int formalInferred_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id141 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:306:17: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:306:21: id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_formalInferred1428);
            id141=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id141.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:307:1: slotDef : ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) ;
    public final FanParser.slotDef_return slotDef() throws RecognitionException {
        FanParser.slotDef_return retval = new FanParser.slotDef_return();
        retval.start = input.LT(1);
        int slotDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.staticBlock_return staticBlock142 = null;

        FanParser.docs_return docs143 = null;

        FanParser.facet_return facet144 = null;

        FanParser.ctorDef_return ctorDef145 = null;

        FanParser.methodDef_return methodDef146 = null;

        FanParser.fieldDef_return fieldDef147 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:10: ( ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:307:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:307:13: ( KW_STATIC bracketL )=> staticBlock
                    {
                    pushFollow(FOLLOW_staticBlock_in_slotDef1444);
                    staticBlock142=staticBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticBlock142.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:6: docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    {
                    pushFollow(FOLLOW_docs_in_slotDef1452);
                    docs143=docs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, docs143.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:308:11: ( facet )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==AT) ) {
                            int LA48_2 = input.LA(2);

                            if ( (LA48_2==ID) ) {
                                int LA48_3 = input.LA(3);

                                if ( (synpred64_Fan()) ) {
                                    alt48=1;
                                }


                            }


                        }


                        switch (alt48) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
                    	    {
                    	    pushFollow(FOLLOW_facet_in_slotDef1454);
                    	    facet144=facet();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet144.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:309:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    int alt49=3;
                    alt49 = dfa49.predict(input);
                    switch (alt49) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:310:7: ( ( ctorFlags )* KW_NEW )=> ctorDef
                            {
                            pushFollow(FOLLOW_ctorDef_in_slotDef1477);
                            ctorDef145=ctorDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorDef145.getTree());

                            }
                            break;
                        case 2 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:311:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef
                            {
                            pushFollow(FOLLOW_methodDef_in_slotDef1504);
                            methodDef146=methodDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDef146.getTree());

                            }
                            break;
                        case 3 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:312:7: fieldDef
                            {
                            pushFollow(FOLLOW_fieldDef_in_slotDef1514);
                            fieldDef147=fieldDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDef147.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:316:1: fieldDef : docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? ) ;
    public final FanParser.fieldDef_return fieldDef() throws RecognitionException {
        FanParser.fieldDef_return retval = new FanParser.fieldDef_return();
        retval.start = input.LT(1);
        int fieldDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL151=null;
        Token SP_SEMI157=null;
        FanParser.fieldFlags_return m = null;

        FanParser.docs_return docs148 = null;

        FanParser.facet_return facet149 = null;

        FanParser.typeId_return typeId150 = null;

        FanParser.expr_return expr152 = null;

        FanParser.bracketL_return bracketL153 = null;

        FanParser.protection_return protection154 = null;

        FanParser.getter_return getter155 = null;

        FanParser.setter_return setter156 = null;

        FanParser.block_return block158 = null;

        FanParser.bracketR_return bracketR159 = null;

        FanParser.eos_return eos160 = null;


        Object AS_INIT_VAL151_tree=null;
        Object SP_SEMI157_tree=null;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:3: ( docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:5: docs ( facet )* m= fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            {
            pushFollow(FOLLOW_docs_in_fieldDef1550);
            docs148=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs148.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:10: ( facet )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==AT) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_fieldDef1552);
            	    facet149=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet149.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            pushFollow(FOLLOW_fieldFlags_in_fieldDef1557);
            m=fieldFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldFlags.add(m.getTree());
            pushFollow(FOLLOW_typeId_in_fieldDef1559);
            typeId150=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeId.add(typeId150.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:317:37: ( AS_INIT_VAL expr )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==AS_INIT_VAL) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:317:38: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL151=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_fieldDef1562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_INIT_VAL.add(AS_INIT_VAL151);

                    pushFollow(FOLLOW_expr_in_fieldDef1564);
                    expr152=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr152.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:318:5: ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==BRACKET_L) ) {
                alt58=1;
            }
            else if ( (LA58_0==EOF||(LA58_0>=KW_RD_ONLY && LA58_0<=KW_FINAL)||(LA58_0>=KW_ABSTRACT && LA58_0<=KW_ONCE)||LA58_0==BRACKET_R||LA58_0==SP_PIPE||LA58_0==SP_SEMI||LA58_0==ID||(LA58_0>=AT && LA58_0<=DOC)||LA58_0==SQ_BRACKET_L) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:319:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:319:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:319:6: bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR
                    {
                    pushFollow(FOLLOW_bracketL_in_fieldDef1579);
                    bracketL153=bracketL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketL.add(bracketL153.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:319:15: ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( ((LA57_0>=KW_PRIVATE && LA57_0<=KW_INTERNAL)||LA57_0==ID) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:319:16: ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )?
                    	    {
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:319:16: ( protection )?
                    	    int alt53=2;
                    	    int LA53_0 = input.LA(1);

                    	    if ( ((LA53_0>=KW_PRIVATE && LA53_0<=KW_INTERNAL)) ) {
                    	        alt53=1;
                    	    }
                    	    switch (alt53) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    	            {
                    	            pushFollow(FOLLOW_protection_in_fieldDef1582);
                    	            protection154=protection();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_protection.add(protection154.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:319:28: ( getter | setter )
                    	    int alt54=2;
                    	    int LA54_0 = input.LA(1);

                    	    if ( (LA54_0==ID) ) {
                    	        int LA54_1 = input.LA(2);

                    	        if ( (synpred73_Fan()) ) {
                    	            alt54=1;
                    	        }
                    	        else if ( (true) ) {
                    	            alt54=2;
                    	        }
                    	        else {
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 54, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 54, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt54) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:319:29: getter
                    	            {
                    	            pushFollow(FOLLOW_getter_in_fieldDef1586);
                    	            getter155=getter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_getter.add(getter155.getTree());

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:319:38: setter
                    	            {
                    	            pushFollow(FOLLOW_setter_in_fieldDef1590);
                    	            setter156=setter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_setter.add(setter156.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:319:46: ( SP_SEMI )?
                    	    int alt55=2;
                    	    int LA55_0 = input.LA(1);

                    	    if ( (LA55_0==SP_SEMI) ) {
                    	        alt55=1;
                    	    }
                    	    switch (alt55) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
                    	            {
                    	            SP_SEMI157=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_fieldDef1593); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_SP_SEMI.add(SP_SEMI157);


                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:319:55: ( block )?
                    	    int alt56=2;
                    	    int LA56_0 = input.LA(1);

                    	    if ( ((LA56_0>=KW_BREAK && LA56_0<=KW_TRY)||(LA56_0>=KW_THIS && LA56_0<=KW_SUPER)||(LA56_0>=KW_NULL && LA56_0<=KW_FALSE)||LA56_0==BRACKET_L||LA56_0==SP_PIPE||LA56_0==OP_CURRY||(LA56_0>=OP_PLUS && LA56_0<=OP_MULTI)||(LA56_0>=OP_BANG && LA56_0<=OP_TILDA)||(LA56_0>=URI && LA56_0<=AT)||(LA56_0>=NUMBER && LA56_0<=SQ_BRACKET_L)||LA56_0==PAR_L) ) {
                    	        alt56=1;
                    	    }
                    	    else if ( (LA56_0==ID) ) {
                    	        int LA56_2 = input.LA(2);

                    	        if ( (synpred75_Fan()) ) {
                    	            alt56=1;
                    	        }
                    	    }
                    	    switch (alt56) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: block
                    	            {
                    	            pushFollow(FOLLOW_block_in_fieldDef1596);
                    	            block158=block();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_block.add(block158.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);

                    pushFollow(FOLLOW_bracketR_in_fieldDef1601);
                    bracketR159=bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracketR.add(bracketR159.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:320:7: eos
                    {
                    pushFollow(FOLLOW_eos_in_fieldDef1610);
                    eos160=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_eos.add(eos160.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: typeId, expr, m
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
            // 321:4: -> ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:321:7: ^( AST_FIELD typeId ( ^( AST_MODIFIER $m) )* ( expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_FIELD, "AST_FIELD"), root_1);

                adaptor.addChild(root_1, stream_typeId.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:321:26: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:321:26: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:321:46: ( expr )?
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:322:1: typeId : ( ( type id )=> typeAndId | fieldId ) ;
    public final FanParser.typeId_return typeId() throws RecognitionException {
        FanParser.typeId_return retval = new FanParser.typeId_return();
        retval.start = input.LT(1);
        int typeId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeAndId_return typeAndId161 = null;

        FanParser.fieldId_return fieldId162 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:322:9: ( ( ( type id )=> typeAndId | fieldId ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:322:11: ( ( type id )=> typeAndId | fieldId )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:322:11: ( ( type id )=> typeAndId | fieldId )
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:322:12: ( type id )=> typeAndId
                    {
                    pushFollow(FOLLOW_typeAndId_in_typeId1648);
                    typeAndId161=typeAndId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeAndId161.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:322:35: fieldId
                    {
                    pushFollow(FOLLOW_fieldId_in_typeId1652);
                    fieldId162=fieldId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldId162.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:323:1: fieldId : id -> ^( AST_ID id ) ;
    public final FanParser.fieldId_return fieldId() throws RecognitionException {
        FanParser.fieldId_return retval = new FanParser.fieldId_return();
        retval.start = input.LT(1);
        int fieldId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id163 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:323:10: ( id -> ^( AST_ID id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:323:12: id
            {
            pushFollow(FOLLOW_id_in_fieldId1661);
            id163=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id163.getTree());


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
            // 324:7: -> ^( AST_ID id )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:324:10: ^( AST_ID id )
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:325:1: typeAndId : type id -> ^( AST_ID id ) ^( AST_TYPE type ) ;
    public final FanParser.typeAndId_return typeAndId() throws RecognitionException {
        FanParser.typeAndId_return retval = new FanParser.typeAndId_return();
        retval.start = input.LT(1);
        int typeAndId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type164 = null;

        FanParser.id_return id165 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:11: ( type id -> ^( AST_ID id ) ^( AST_TYPE type ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:13: type id
            {
            pushFollow(FOLLOW_type_in_typeAndId1682);
            type164=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type164.getTree());
            pushFollow(FOLLOW_id_in_typeAndId1684);
            id165=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id165.getTree());


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
            // 326:7: -> ^( AST_ID id ) ^( AST_TYPE type )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:326:10: ^( AST_ID id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:326:23: ^( AST_TYPE type )
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:327:1: fieldFlags : ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* ;
    public final FanParser.fieldFlags_return fieldFlags() throws RecognitionException {
        FanParser.fieldFlags_return retval = new FanParser.fieldFlags_return();
        retval.start = input.LT(1);
        int fieldFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ABSTRACT166=null;
        Token KW_RD_ONLY167=null;
        Token KW_CONST168=null;
        Token KW_STATIC169=null;
        Token KW_NATIVE170=null;
        Token KW_VOLATILE171=null;
        Token KW_OVERRIDE172=null;
        Token KW_VIRTUAL173=null;
        Token KW_FINAL174=null;
        FanParser.protection_return protection175 = null;


        Object KW_ABSTRACT166_tree=null;
        Object KW_RD_ONLY167_tree=null;
        Object KW_CONST168_tree=null;
        Object KW_STATIC169_tree=null;
        Object KW_NATIVE170_tree=null;
        Object KW_VOLATILE171_tree=null;
        Object KW_OVERRIDE172_tree=null;
        Object KW_VIRTUAL173_tree=null;
        Object KW_FINAL174_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:12: ( ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:327:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            loop60:
            do {
                int alt60=11;
                switch ( input.LA(1) ) {
                case KW_ABSTRACT:
                    {
                    alt60=1;
                    }
                    break;
                case KW_RD_ONLY:
                    {
                    alt60=2;
                    }
                    break;
                case KW_CONST:
                    {
                    alt60=3;
                    }
                    break;
                case KW_STATIC:
                    {
                    alt60=4;
                    }
                    break;
                case KW_NATIVE:
                    {
                    alt60=5;
                    }
                    break;
                case KW_VOLATILE:
                    {
                    alt60=6;
                    }
                    break;
                case KW_OVERRIDE:
                    {
                    alt60=7;
                    }
                    break;
                case KW_VIRTUAL:
                    {
                    alt60=8;
                    }
                    break;
                case KW_FINAL:
                    {
                    alt60=9;
                    }
                    break;
                case KW_PRIVATE:
                case KW_PROTECTED:
                case KW_PUBLIC:
                case KW_INTERNAL:
                    {
                    alt60=10;
                    }
                    break;

                }

                switch (alt60) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:15: KW_ABSTRACT
            	    {
            	    KW_ABSTRACT166=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_fieldFlags1712); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_ABSTRACT166_tree = (Object)adaptor.create(KW_ABSTRACT166);
            	    adaptor.addChild(root_0, KW_ABSTRACT166_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:29: KW_RD_ONLY
            	    {
            	    KW_RD_ONLY167=(Token)match(input,KW_RD_ONLY,FOLLOW_KW_RD_ONLY_in_fieldFlags1716); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_RD_ONLY167_tree = (Object)adaptor.create(KW_RD_ONLY167);
            	    adaptor.addChild(root_0, KW_RD_ONLY167_tree);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:42: KW_CONST
            	    {
            	    KW_CONST168=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_fieldFlags1720); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_CONST168_tree = (Object)adaptor.create(KW_CONST168);
            	    adaptor.addChild(root_0, KW_CONST168_tree);
            	    }

            	    }
            	    break;
            	case 4 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:53: KW_STATIC
            	    {
            	    KW_STATIC169=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_fieldFlags1724); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_STATIC169_tree = (Object)adaptor.create(KW_STATIC169);
            	    adaptor.addChild(root_0, KW_STATIC169_tree);
            	    }

            	    }
            	    break;
            	case 5 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:65: KW_NATIVE
            	    {
            	    KW_NATIVE170=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_fieldFlags1728); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_NATIVE170_tree = (Object)adaptor.create(KW_NATIVE170);
            	    adaptor.addChild(root_0, KW_NATIVE170_tree);
            	    }

            	    }
            	    break;
            	case 6 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:77: KW_VOLATILE
            	    {
            	    KW_VOLATILE171=(Token)match(input,KW_VOLATILE,FOLLOW_KW_VOLATILE_in_fieldFlags1732); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VOLATILE171_tree = (Object)adaptor.create(KW_VOLATILE171);
            	    adaptor.addChild(root_0, KW_VOLATILE171_tree);
            	    }

            	    }
            	    break;
            	case 7 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:91: KW_OVERRIDE
            	    {
            	    KW_OVERRIDE172=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_fieldFlags1736); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_OVERRIDE172_tree = (Object)adaptor.create(KW_OVERRIDE172);
            	    adaptor.addChild(root_0, KW_OVERRIDE172_tree);
            	    }

            	    }
            	    break;
            	case 8 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:105: KW_VIRTUAL
            	    {
            	    KW_VIRTUAL173=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_fieldFlags1740); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VIRTUAL173_tree = (Object)adaptor.create(KW_VIRTUAL173);
            	    adaptor.addChild(root_0, KW_VIRTUAL173_tree);
            	    }

            	    }
            	    break;
            	case 9 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:118: KW_FINAL
            	    {
            	    KW_FINAL174=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_fieldFlags1744); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_FINAL174_tree = (Object)adaptor.create(KW_FINAL174);
            	    adaptor.addChild(root_0, KW_FINAL174_tree);
            	    }

            	    }
            	    break;
            	case 10 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:327:129: protection
            	    {
            	    pushFollow(FOLLOW_protection_in_fieldFlags1748);
            	    protection175=protection();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection175.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:328:1: methodDef : docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody -> ^( AST_METHOD ( methodBody )? ^( AST_ID $mname) ^( AST_TYPE $returnType) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ) ;
    public final FanParser.methodDef_return methodDef() throws RecognitionException {
        FanParser.methodDef_return retval = new FanParser.methodDef_return();
        retval.start = input.LT(1);
        int methodDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.methodFlags_return m = null;

        FanParser.type_return returnType = null;

        FanParser.id_return mname = null;

        FanParser.docs_return docs176 = null;

        FanParser.facet_return facet177 = null;

        FanParser.parL_return parL178 = null;

        FanParser.params_return params179 = null;

        FanParser.parR_return parR180 = null;

        FanParser.methodBody_return methodBody181 = null;


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
            // src/net/colar/netbeans/fan/antlr/Fan.g:329:3: ( docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody -> ^( AST_METHOD ( methodBody )? ^( AST_ID $mname) ^( AST_TYPE $returnType) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:329:5: docs ( facet )* (m= methodFlags )* returnType= type mname= id parL params parR methodBody
            {
            pushFollow(FOLLOW_docs_in_methodDef1768);
            docs176=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs176.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:329:10: ( facet )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==AT) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_methodDef1770);
            	    facet177=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet177.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:329:18: (m= methodFlags )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=KW_STATIC && LA62_0<=KW_NATIVE)||(LA62_0>=KW_OVERRIDE && LA62_0<=KW_FINAL)||(LA62_0>=KW_ABSTRACT && LA62_0<=KW_INTERNAL)||LA62_0==KW_ONCE) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= methodFlags
            	    {
            	    pushFollow(FOLLOW_methodFlags_in_methodDef1775);
            	    m=methodFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_methodFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            pushFollow(FOLLOW_type_in_methodDef1780);
            returnType=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(returnType.getTree());
            pushFollow(FOLLOW_id_in_methodDef1786);
            mname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(mname.getTree());
            pushFollow(FOLLOW_parL_in_methodDef1788);
            parL178=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL178.getTree());
            pushFollow(FOLLOW_params_in_methodDef1790);
            params179=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_params.add(params179.getTree());
            pushFollow(FOLLOW_parR_in_methodDef1792);
            parR180=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR180.getTree());
            pushFollow(FOLLOW_methodBody_in_methodDef1794);
            methodBody181=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodBody.add(methodBody181.getTree());


            // AST REWRITE
            // elements: methodBody, returnType, m, params, mname
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
            // 330:7: -> ^( AST_METHOD ( methodBody )? ^( AST_ID $mname) ^( AST_TYPE $returnType) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:330:10: ^( AST_METHOD ( methodBody )? ^( AST_ID $mname) ^( AST_TYPE $returnType) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_METHOD, "AST_METHOD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:330:23: ( methodBody )?
                if ( stream_methodBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_methodBody.nextTree());

                }
                stream_methodBody.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:330:35: ^( AST_ID $mname)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_2);

                adaptor.addChild(root_2, stream_mname.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:330:52: ^( AST_TYPE $returnType)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE, "AST_TYPE"), root_2);

                adaptor.addChild(root_2, stream_returnType.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:330:76: ( ^( AST_PARAMS params ) )?
                if ( stream_params.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:76: ^( AST_PARAMS params )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_PARAMS, "AST_PARAMS"), root_2);

                    adaptor.addChild(root_2, stream_params.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_params.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:330:98: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:330:98: ^( AST_MODIFIER $m)
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:331:1: methodFlags : ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL );
    public final FanParser.methodFlags_return methodFlags() throws RecognitionException {
        FanParser.methodFlags_return retval = new FanParser.methodFlags_return();
        retval.start = input.LT(1);
        int methodFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_VIRTUAL183=null;
        Token KW_OVERRIDE184=null;
        Token KW_ABSTRACT185=null;
        Token KW_STATIC186=null;
        Token KW_ONCE187=null;
        Token KW_NATIVE188=null;
        Token KW_FINAL189=null;
        FanParser.protection_return protection182 = null;


        Object KW_VIRTUAL183_tree=null;
        Object KW_OVERRIDE184_tree=null;
        Object KW_ABSTRACT185_tree=null;
        Object KW_STATIC186_tree=null;
        Object KW_ONCE187_tree=null;
        Object KW_NATIVE188_tree=null;
        Object KW_FINAL189_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:13: ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL )
            int alt63=8;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt63=1;
                }
                break;
            case KW_VIRTUAL:
                {
                alt63=2;
                }
                break;
            case KW_OVERRIDE:
                {
                alt63=3;
                }
                break;
            case KW_ABSTRACT:
                {
                alt63=4;
                }
                break;
            case KW_STATIC:
                {
                alt63=5;
                }
                break;
            case KW_ONCE:
                {
                alt63=6;
                }
                break;
            case KW_NATIVE:
                {
                alt63=7;
                }
                break;
            case KW_FINAL:
                {
                alt63=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:331:15: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_methodFlags1845);
                    protection182=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection182.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:331:28: KW_VIRTUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_VIRTUAL183=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_methodFlags1849); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_VIRTUAL183_tree = (Object)adaptor.create(KW_VIRTUAL183);
                    adaptor.addChild(root_0, KW_VIRTUAL183_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:331:41: KW_OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_OVERRIDE184=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_methodFlags1853); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_OVERRIDE184_tree = (Object)adaptor.create(KW_OVERRIDE184);
                    adaptor.addChild(root_0, KW_OVERRIDE184_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:331:55: KW_ABSTRACT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ABSTRACT185=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_methodFlags1857); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ABSTRACT185_tree = (Object)adaptor.create(KW_ABSTRACT185);
                    adaptor.addChild(root_0, KW_ABSTRACT185_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:331:69: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC186=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_methodFlags1861); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC186_tree = (Object)adaptor.create(KW_STATIC186);
                    adaptor.addChild(root_0, KW_STATIC186_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:331:81: KW_ONCE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ONCE187=(Token)match(input,KW_ONCE,FOLLOW_KW_ONCE_in_methodFlags1865); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ONCE187_tree = (Object)adaptor.create(KW_ONCE187);
                    adaptor.addChild(root_0, KW_ONCE187_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:332:5: KW_NATIVE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NATIVE188=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_methodFlags1873); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NATIVE188_tree = (Object)adaptor.create(KW_NATIVE188);
                    adaptor.addChild(root_0, KW_NATIVE188_tree);
                    }

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:332:17: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL189=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_methodFlags1877); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL189_tree = (Object)adaptor.create(KW_FINAL189);
                    adaptor.addChild(root_0, KW_FINAL189_tree);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:333:1: params : ( param ( SP_COMMA param )* )? ;
    public final FanParser.params_return params() throws RecognitionException {
        FanParser.params_return retval = new FanParser.params_return();
        retval.start = input.LT(1);
        int params_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA191=null;
        FanParser.param_return param190 = null;

        FanParser.param_return param192 = null;


        Object SP_COMMA191_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:9: ( ( param ( SP_COMMA param )* )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:11: ( param ( SP_COMMA param )* )?
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:333:11: ( param ( SP_COMMA param )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==SP_PIPE||LA65_0==ID||LA65_0==SQ_BRACKET_L) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:333:12: param ( SP_COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_params1886);
                    param190=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, param190.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:333:18: ( SP_COMMA param )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==SP_COMMA) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:333:19: SP_COMMA param
                    	    {
                    	    SP_COMMA191=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_params1889); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA191_tree = (Object)adaptor.create(SP_COMMA191);
                    	    adaptor.addChild(root_0, SP_COMMA191_tree);
                    	    }
                    	    pushFollow(FOLLOW_param_in_params1891);
                    	    param192=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, param192.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:334:1: param : type id ( AS_INIT_VAL expr )? ;
    public final FanParser.param_return param() throws RecognitionException {
        FanParser.param_return retval = new FanParser.param_return();
        retval.start = input.LT(1);
        int param_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL195=null;
        FanParser.type_return type193 = null;

        FanParser.id_return id194 = null;

        FanParser.expr_return expr196 = null;


        Object AS_INIT_VAL195_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:9: ( type id ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:11: type id ( AS_INIT_VAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_param1904);
            type193=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type193.getTree());
            pushFollow(FOLLOW_id_in_param1906);
            id194=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id194.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:334:19: ( AS_INIT_VAL expr )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==AS_INIT_VAL) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:334:20: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL195=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_param1909); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_INIT_VAL195_tree = (Object)adaptor.create(AS_INIT_VAL195);
                    adaptor.addChild(root_0, AS_INIT_VAL195_tree);
                    }
                    pushFollow(FOLLOW_expr_in_param1911);
                    expr196=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr196.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:335:1: methodBody : ( ( multiStmt )=> multiStmt | eos ) ;
    public final FanParser.methodBody_return methodBody() throws RecognitionException {
        FanParser.methodBody_return retval = new FanParser.methodBody_return();
        retval.start = input.LT(1);
        int methodBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt197 = null;

        FanParser.eos_return eos198 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:12: ( ( ( multiStmt )=> multiStmt | eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:14: ( ( multiStmt )=> multiStmt | eos )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:335:14: ( ( multiStmt )=> multiStmt | eos )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==BRACKET_L) && (synpred101_Fan())) {
                alt67=1;
            }
            else if ( (LA67_0==EOF||(LA67_0>=KW_RD_ONLY && LA67_0<=KW_FINAL)||(LA67_0>=KW_ABSTRACT && LA67_0<=KW_ONCE)||LA67_0==BRACKET_R||LA67_0==SP_PIPE||LA67_0==SP_SEMI||LA67_0==ID||(LA67_0>=AT && LA67_0<=DOC)||LA67_0==SQ_BRACKET_L) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:15: ( multiStmt )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_methodBody1925);
                    multiStmt197=multiStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt197.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:40: eos
                    {
                    pushFollow(FOLLOW_eos_in_methodBody1929);
                    eos198=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos198.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:336:1: ctorDef : docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody -> ^( AST_CONSTRUCTOR ( methodBody )? ^( AST_ID $cname) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ) ;
    public final FanParser.ctorDef_return ctorDef() throws RecognitionException {
        FanParser.ctorDef_return retval = new FanParser.ctorDef_return();
        retval.start = input.LT(1);
        int ctorDef_StartIndex = input.index();
        Object root_0 = null;

        Token cchain=null;
        Token KW_NEW201=null;
        FanParser.ctorFlags_return m = null;

        FanParser.id_return cname = null;

        FanParser.docs_return docs199 = null;

        FanParser.facet_return facet200 = null;

        FanParser.parL_return parL202 = null;

        FanParser.params_return params203 = null;

        FanParser.parR_return parR204 = null;

        FanParser.ctorChain_return ctorChain205 = null;

        FanParser.methodBody_return methodBody206 = null;


        Object cchain_tree=null;
        Object KW_NEW201_tree=null;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:3: ( docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody -> ^( AST_CONSTRUCTOR ( methodBody )? ^( AST_ID $cname) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:5: docs ( facet )* (m= ctorFlags )* KW_NEW cname= id parL params parR (cchain= ( ( SP_COLON )=> ctorChain ) )? methodBody
            {
            pushFollow(FOLLOW_docs_in_ctorDef1949);
            docs199=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs199.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:10: ( facet )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==AT) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: facet
            	    {
            	    pushFollow(FOLLOW_facet_in_ctorDef1951);
            	    facet200=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet200.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:337:18: (m= ctorFlags )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=KW_PRIVATE && LA69_0<=KW_INTERNAL)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= ctorFlags
            	    {
            	    pushFollow(FOLLOW_ctorFlags_in_ctorDef1956);
            	    m=ctorFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ctorFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            KW_NEW201=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_ctorDef1959); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_NEW.add(KW_NEW201);

            pushFollow(FOLLOW_id_in_ctorDef1963);
            cname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(cname.getTree());
            pushFollow(FOLLOW_parL_in_ctorDef1965);
            parL202=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL202.getTree());
            pushFollow(FOLLOW_params_in_ctorDef1967);
            params203=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_params.add(params203.getTree());
            pushFollow(FOLLOW_parR_in_ctorDef1969);
            parR204=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR204.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:69: (cchain= ( ( SP_COLON )=> ctorChain ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==SP_COLON) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: cchain= ( ( SP_COLON )=> ctorChain )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:337:70: ( ( SP_COLON )=> ctorChain )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:337:71: ( SP_COLON )=> ctorChain
                    {
                    pushFollow(FOLLOW_ctorChain_in_ctorDef1978);
                    ctorChain205=ctorChain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ctorChain.add(ctorChain205.getTree());

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_ctorDef1982);
            methodBody206=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodBody.add(methodBody206.getTree());


            // AST REWRITE
            // elements: m, cname, methodBody, cchain, params
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
            // 338:7: -> ^( AST_CONSTRUCTOR ( methodBody )? ^( AST_ID $cname) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:338:10: ^( AST_CONSTRUCTOR ( methodBody )? ^( AST_ID $cname) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CONSTRUCTOR, "AST_CONSTRUCTOR"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:338:28: ( methodBody )?
                if ( stream_methodBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_methodBody.nextTree());

                }
                stream_methodBody.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:338:40: ^( AST_ID $cname)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_2);

                adaptor.addChild(root_2, stream_cname.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:338:57: ( ^( AST_PARAMS params ) )?
                if ( stream_params.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:338:57: ^( AST_PARAMS params )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_PARAMS, "AST_PARAMS"), root_2);

                    adaptor.addChild(root_2, stream_params.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_params.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:338:79: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:338:79: ^( AST_MODIFIER $m)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_MODIFIER, "AST_MODIFIER"), root_2);

                    adaptor.addChild(root_2, stream_m.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_m.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:338:99: ( ^( AST_CONSTRUCTOR_CHAIN $cchain) )*
                while ( stream_cchain.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:338:99: ^( AST_CONSTRUCTOR_CHAIN $cchain)
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:339:1: ctorFlags : protection ;
    public final FanParser.ctorFlags_return ctorFlags() throws RecognitionException {
        FanParser.ctorFlags_return retval = new FanParser.ctorFlags_return();
        retval.start = input.LT(1);
        int ctorFlags_StartIndex = input.index();
        Object root_0 = null;

        FanParser.protection_return protection207 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:339:11: ( protection )
            // src/net/colar/netbeans/fan/antlr/Fan.g:339:13: protection
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_protection_in_ctorFlags2035);
            protection207=protection();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protection207.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:340:1: ctorChain : SP_COLON ( ctorChainThis | ctorChainSuper ) ;
    public final FanParser.ctorChain_return ctorChain() throws RecognitionException {
        FanParser.ctorChain_return retval = new FanParser.ctorChain_return();
        retval.start = input.LT(1);
        int ctorChain_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON208=null;
        FanParser.ctorChainThis_return ctorChainThis209 = null;

        FanParser.ctorChainSuper_return ctorChainSuper210 = null;


        Object SP_COLON208_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:11: ( SP_COLON ( ctorChainThis | ctorChainSuper ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:13: SP_COLON ( ctorChainThis | ctorChainSuper )
            {
            root_0 = (Object)adaptor.nil();

            SP_COLON208=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ctorChain2042); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON208_tree = (Object)adaptor.create(SP_COLON208);
            adaptor.addChild(root_0, SP_COLON208_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:22: ( ctorChainThis | ctorChainSuper )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==KW_THIS) ) {
                alt71=1;
            }
            else if ( (LA71_0==KW_SUPER) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:340:23: ctorChainThis
                    {
                    pushFollow(FOLLOW_ctorChainThis_in_ctorChain2045);
                    ctorChainThis209=ctorChainThis();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainThis209.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:340:39: ctorChainSuper
                    {
                    pushFollow(FOLLOW_ctorChainSuper_in_ctorChain2049);
                    ctorChainSuper210=ctorChainSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainSuper210.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:342:1: ctorChainThis : KW_THIS DOT id parL ( args )? parR ;
    public final FanParser.ctorChainThis_return ctorChainThis() throws RecognitionException {
        FanParser.ctorChainThis_return retval = new FanParser.ctorChainThis_return();
        retval.start = input.LT(1);
        int ctorChainThis_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THIS211=null;
        Token DOT212=null;
        FanParser.id_return id213 = null;

        FanParser.parL_return parL214 = null;

        FanParser.args_return args215 = null;

        FanParser.parR_return parR216 = null;


        Object KW_THIS211_tree=null;
        Object DOT212_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:15: ( KW_THIS DOT id parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:17: KW_THIS DOT id parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_THIS211=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_ctorChainThis2058); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THIS211_tree = (Object)adaptor.create(KW_THIS211);
            adaptor.addChild(root_0, KW_THIS211_tree);
            }
            DOT212=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainThis2060); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT212_tree = (Object)adaptor.create(DOT212);
            adaptor.addChild(root_0, DOT212_tree);
            }
            pushFollow(FOLLOW_id_in_ctorChainThis2062);
            id213=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id213.getTree());
            pushFollow(FOLLOW_parL_in_ctorChainThis2064);
            parL214=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL214.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:37: ( args )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=KW_THIS && LA72_0<=KW_SUPER)||(LA72_0>=KW_NULL && LA72_0<=KW_FALSE)||LA72_0==SP_PIPE||LA72_0==OP_CURRY||(LA72_0>=OP_PLUS && LA72_0<=OP_MULTI)||(LA72_0>=OP_BANG && LA72_0<=OP_TILDA)||(LA72_0>=ID && LA72_0<=AT)||(LA72_0>=NUMBER && LA72_0<=SQ_BRACKET_L)||LA72_0==PAR_L) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainThis2066);
                    args215=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args215.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainThis2069);
            parR216=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR216.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:343:1: ctorChainSuper : KW_SUPER ( DOT id )? parL ( args )? parR ;
    public final FanParser.ctorChainSuper_return ctorChainSuper() throws RecognitionException {
        FanParser.ctorChainSuper_return retval = new FanParser.ctorChainSuper_return();
        retval.start = input.LT(1);
        int ctorChainSuper_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SUPER217=null;
        Token DOT218=null;
        FanParser.id_return id219 = null;

        FanParser.parL_return parL220 = null;

        FanParser.args_return args221 = null;

        FanParser.parR_return parR222 = null;


        Object KW_SUPER217_tree=null;
        Object DOT218_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:16: ( KW_SUPER ( DOT id )? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:18: KW_SUPER ( DOT id )? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_SUPER217=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_ctorChainSuper2076); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SUPER217_tree = (Object)adaptor.create(KW_SUPER217);
            adaptor.addChild(root_0, KW_SUPER217_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:27: ( DOT id )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==DOT) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:343:28: DOT id
                    {
                    DOT218=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainSuper2079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT218_tree = (Object)adaptor.create(DOT218);
                    adaptor.addChild(root_0, DOT218_tree);
                    }
                    pushFollow(FOLLOW_id_in_ctorChainSuper2081);
                    id219=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id219.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parL_in_ctorChainSuper2085);
            parL220=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL220.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:343:42: ( args )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=KW_THIS && LA74_0<=KW_SUPER)||(LA74_0>=KW_NULL && LA74_0<=KW_FALSE)||LA74_0==SP_PIPE||LA74_0==OP_CURRY||(LA74_0>=OP_PLUS && LA74_0<=OP_MULTI)||(LA74_0>=OP_BANG && LA74_0<=OP_TILDA)||(LA74_0>=ID && LA74_0<=AT)||(LA74_0>=NUMBER && LA74_0<=SQ_BRACKET_L)||LA74_0==PAR_L) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainSuper2087);
                    args221=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args221.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainSuper2090);
            parR222=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR222.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:345:1: staticBlock : KW_STATIC block ;
    public final FanParser.staticBlock_return staticBlock() throws RecognitionException {
        FanParser.staticBlock_return retval = new FanParser.staticBlock_return();
        retval.start = input.LT(1);
        int staticBlock_StartIndex = input.index();
        Object root_0 = null;

        Token KW_STATIC223=null;
        FanParser.block_return block224 = null;


        Object KW_STATIC223_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:13: ( KW_STATIC block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:345:15: KW_STATIC block
            {
            root_0 = (Object)adaptor.nil();

            KW_STATIC223=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_staticBlock2098); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_STATIC223_tree = (Object)adaptor.create(KW_STATIC223);
            adaptor.addChild(root_0, KW_STATIC223_tree);
            }
            pushFollow(FOLLOW_block_in_staticBlock2100);
            block224=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block224.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:346:1: block : ( ( bracketL )=> multiStmt | stmt ) ;
    public final FanParser.block_return block() throws RecognitionException {
        FanParser.block_return retval = new FanParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt225 = null;

        FanParser.stmt_return stmt226 = null;



        paraphrase.push("Block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:347:3: ( ( ( bracketL )=> multiStmt | stmt ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:347:5: ( ( bracketL )=> multiStmt | stmt )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:347:5: ( ( bracketL )=> multiStmt | stmt )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==BRACKET_L) && (synpred110_Fan())) {
                alt75=1;
            }
            else if ( ((LA75_0>=KW_BREAK && LA75_0<=KW_TRY)||(LA75_0>=KW_THIS && LA75_0<=KW_SUPER)||(LA75_0>=KW_NULL && LA75_0<=KW_FALSE)||LA75_0==SP_PIPE||LA75_0==OP_CURRY||(LA75_0>=OP_PLUS && LA75_0<=OP_MULTI)||(LA75_0>=OP_BANG && LA75_0<=OP_TILDA)||(LA75_0>=ID && LA75_0<=AT)||(LA75_0>=NUMBER && LA75_0<=SQ_BRACKET_L)||LA75_0==PAR_L) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:347:6: ( bracketL )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_block2125);
                    multiStmt225=multiStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt225.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:347:30: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_block2129);
                    stmt226=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt226.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:348:1: multiStmt : bracketL ( stmt )* bracketR -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR ) ;
    public final FanParser.multiStmt_return multiStmt() throws RecognitionException {
        FanParser.multiStmt_return retval = new FanParser.multiStmt_return();
        retval.start = input.LT(1);
        int multiStmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL227 = null;

        FanParser.stmt_return stmt228 = null;

        FanParser.bracketR_return bracketR229 = null;


        RewriteRuleSubtreeStream stream_bracketL=new RewriteRuleSubtreeStream(adaptor,"rule bracketL");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        RewriteRuleSubtreeStream stream_bracketR=new RewriteRuleSubtreeStream(adaptor,"rule bracketR");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:11: ( bracketL ( stmt )* bracketR -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:13: bracketL ( stmt )* bracketR
            {
            pushFollow(FOLLOW_bracketL_in_multiStmt2137);
            bracketL227=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketL.add(bracketL227.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:22: ( stmt )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=KW_BREAK && LA76_0<=KW_TRY)||(LA76_0>=KW_THIS && LA76_0<=KW_SUPER)||(LA76_0>=KW_NULL && LA76_0<=KW_FALSE)||LA76_0==SP_PIPE||LA76_0==OP_CURRY||(LA76_0>=OP_PLUS && LA76_0<=OP_MULTI)||(LA76_0>=OP_BANG && LA76_0<=OP_TILDA)||(LA76_0>=ID && LA76_0<=AT)||(LA76_0>=NUMBER && LA76_0<=SQ_BRACKET_L)||LA76_0==PAR_L) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_multiStmt2139);
            	    stmt228=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt228.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_multiStmt2142);
            bracketR229=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketR.add(bracketR229.getTree());


            // AST REWRITE
            // elements: bracketR, bracketL, stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 348:37: -> ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:348:40: ^( AST_CODE_BLOCK bracketL ( ( stmt )* )? bracketR )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_bracketL.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:348:66: ( ( stmt )* )?
                if ( stream_stmt.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:67: ( stmt )*
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:349:1: stmt : ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) ;
    public final FanParser.stmt_return stmt() throws RecognitionException {
        FanParser.stmt_return retval = new FanParser.stmt_return();
        retval.start = input.LT(1);
        int stmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.g_if_return g_if230 = null;

        FanParser.g_for_return g_for231 = null;

        FanParser.g_while_return g_while232 = null;

        FanParser.g_break_return g_break233 = null;

        FanParser.g_continue_return g_continue234 = null;

        FanParser.g_return_return g_return235 = null;

        FanParser.g_switch_return g_switch236 = null;

        FanParser.g_throw_return g_throw237 = null;

        FanParser.g_try_return g_try238 = null;

        FanParser.exprStmt_return exprStmt239 = null;

        FanParser.localDef_return localDef240 = null;



        paraphrase.push("Statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:3: ( ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:351:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            int alt77=11;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:351:6: g_if
                    {
                    pushFollow(FOLLOW_g_if_in_stmt2177);
                    g_if230=g_if();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_if230.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:351:13: g_for
                    {
                    pushFollow(FOLLOW_g_for_in_stmt2181);
                    g_for231=g_for();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_for231.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:351:21: g_while
                    {
                    pushFollow(FOLLOW_g_while_in_stmt2185);
                    g_while232=g_while();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_while232.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:351:31: g_break
                    {
                    pushFollow(FOLLOW_g_break_in_stmt2189);
                    g_break233=g_break();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_break233.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:352:4: g_continue
                    {
                    pushFollow(FOLLOW_g_continue_in_stmt2196);
                    g_continue234=g_continue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_continue234.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:352:17: g_return
                    {
                    pushFollow(FOLLOW_g_return_in_stmt2200);
                    g_return235=g_return();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_return235.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:352:28: g_switch
                    {
                    pushFollow(FOLLOW_g_switch_in_stmt2204);
                    g_switch236=g_switch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_switch236.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:353:4: g_throw
                    {
                    pushFollow(FOLLOW_g_throw_in_stmt2211);
                    g_throw237=g_throw();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_throw237.getTree());

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:353:14: g_try
                    {
                    pushFollow(FOLLOW_g_try_in_stmt2215);
                    g_try238=g_try();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_try238.getTree());

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:353:22: exprStmt
                    {
                    pushFollow(FOLLOW_exprStmt_in_stmt2219);
                    exprStmt239=exprStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprStmt239.getTree());

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:353:33: localDef
                    {
                    pushFollow(FOLLOW_localDef_in_stmt2223);
                    localDef240=localDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localDef240.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:355:1: stmtList : s= ( ( stmt )* ) -> ^( AST_CODE_BLOCK ( $s)? ) ;
    public final FanParser.stmtList_return stmtList() throws RecognitionException {
        FanParser.stmtList_return retval = new FanParser.stmtList_return();
        retval.start = input.LT(1);
        int stmtList_StartIndex = input.index();
        Object root_0 = null;

        Token s=null;
        FanParser.stmt_return stmt241 = null;


        Object s_tree=null;
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:10: (s= ( ( stmt )* ) -> ^( AST_CODE_BLOCK ( $s)? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:12: s= ( ( stmt )* )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:14: ( ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:15: ( stmt )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:15: ( stmt )*
            loop78:
            do {
                int alt78=2;
                alt78 = dfa78.predict(input);
                switch (alt78) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmtList2236);
            	    stmt241=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt241.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
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
            // 355:22: -> ^( AST_CODE_BLOCK ( $s)? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:355:25: ^( AST_CODE_BLOCK ( $s)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CODE_BLOCK, "AST_CODE_BLOCK"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:355:42: ( $s)?
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:361:1: g_break : KW_BREAK eos ;
    public final FanParser.g_break_return g_break() throws RecognitionException {
        FanParser.g_break_return retval = new FanParser.g_break_return();
        retval.start = input.LT(1);
        int g_break_StartIndex = input.index();
        Object root_0 = null;

        Token KW_BREAK242=null;
        FanParser.eos_return eos243 = null;


        Object KW_BREAK242_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:10: ( KW_BREAK eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:361:12: KW_BREAK eos
            {
            root_0 = (Object)adaptor.nil();

            KW_BREAK242=(Token)match(input,KW_BREAK,FOLLOW_KW_BREAK_in_g_break2258); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_BREAK242_tree = (Object)adaptor.create(KW_BREAK242);
            adaptor.addChild(root_0, KW_BREAK242_tree);
            }
            pushFollow(FOLLOW_eos_in_g_break2260);
            eos243=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos243.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:362:1: g_continue : KW_CONTINUE eos ;
    public final FanParser.g_continue_return g_continue() throws RecognitionException {
        FanParser.g_continue_return retval = new FanParser.g_continue_return();
        retval.start = input.LT(1);
        int g_continue_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CONTINUE244=null;
        FanParser.eos_return eos245 = null;


        Object KW_CONTINUE244_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:362:12: ( KW_CONTINUE eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:362:14: KW_CONTINUE eos
            {
            root_0 = (Object)adaptor.nil();

            KW_CONTINUE244=(Token)match(input,KW_CONTINUE,FOLLOW_KW_CONTINUE_in_g_continue2267); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CONTINUE244_tree = (Object)adaptor.create(KW_CONTINUE244);
            adaptor.addChild(root_0, KW_CONTINUE244_tree);
            }
            pushFollow(FOLLOW_eos_in_g_continue2269);
            eos245=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos245.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:363:1: g_for : KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ;
    public final FanParser.g_for_return g_for() throws RecognitionException {
        FanParser.g_for_return retval = new FanParser.g_for_return();
        retval.start = input.LT(1);
        int g_for_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FOR246=null;
        Token SP_SEMI249=null;
        Token SP_SEMI251=null;
        FanParser.parL_return parL247 = null;

        FanParser.forInit_return forInit248 = null;

        FanParser.expr_return expr250 = null;

        FanParser.expr_return expr252 = null;

        FanParser.parR_return parR253 = null;

        FanParser.block_return block254 = null;


        Object KW_FOR246_tree=null;
        Object SP_SEMI249_tree=null;
        Object SP_SEMI251_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:8: ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:10: KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block
            {
            root_0 = (Object)adaptor.nil();

            KW_FOR246=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_g_for2277); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_FOR246_tree = (Object)adaptor.create(KW_FOR246);
            adaptor.addChild(root_0, KW_FOR246_tree);
            }
            pushFollow(FOLLOW_parL_in_g_for2279);
            parL247=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL247.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:22: ( forInit )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=KW_THIS && LA79_0<=KW_SUPER)||(LA79_0>=KW_NULL && LA79_0<=KW_FALSE)||LA79_0==SP_PIPE||LA79_0==OP_CURRY||(LA79_0>=OP_PLUS && LA79_0<=OP_MULTI)||(LA79_0>=OP_BANG && LA79_0<=OP_TILDA)||(LA79_0>=ID && LA79_0<=AT)||(LA79_0>=NUMBER && LA79_0<=SQ_BRACKET_L)||LA79_0==PAR_L) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_g_for2281);
                    forInit248=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit248.getTree());

                    }
                    break;

            }

            SP_SEMI249=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for2284); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_SEMI249_tree = (Object)adaptor.create(SP_SEMI249);
            adaptor.addChild(root_0, SP_SEMI249_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:39: ( expr )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=KW_THIS && LA80_0<=KW_SUPER)||(LA80_0>=KW_NULL && LA80_0<=KW_FALSE)||LA80_0==SP_PIPE||LA80_0==OP_CURRY||(LA80_0>=OP_PLUS && LA80_0<=OP_MULTI)||(LA80_0>=OP_BANG && LA80_0<=OP_TILDA)||(LA80_0>=ID && LA80_0<=AT)||(LA80_0>=NUMBER && LA80_0<=SQ_BRACKET_L)||LA80_0==PAR_L) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for2286);
                    expr250=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr250.getTree());

                    }
                    break;

            }

            SP_SEMI251=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for2289); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_SEMI251_tree = (Object)adaptor.create(SP_SEMI251);
            adaptor.addChild(root_0, SP_SEMI251_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:53: ( expr )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=KW_THIS && LA81_0<=KW_SUPER)||(LA81_0>=KW_NULL && LA81_0<=KW_FALSE)||LA81_0==SP_PIPE||LA81_0==OP_CURRY||(LA81_0>=OP_PLUS && LA81_0<=OP_MULTI)||(LA81_0>=OP_BANG && LA81_0<=OP_TILDA)||(LA81_0>=ID && LA81_0<=AT)||(LA81_0>=NUMBER && LA81_0<=SQ_BRACKET_L)||LA81_0==PAR_L) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for2291);
                    expr252=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr252.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_g_for2294);
            parR253=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR253.getTree());
            pushFollow(FOLLOW_block_in_g_for2297);
            block254=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block254.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:364:1: g_if : KW_IF parL expr parR block ( KW_ELSE block )? ;
    public final FanParser.g_if_return g_if() throws RecognitionException {
        FanParser.g_if_return retval = new FanParser.g_if_return();
        retval.start = input.LT(1);
        int g_if_StartIndex = input.index();
        Object root_0 = null;

        Token KW_IF255=null;
        Token KW_ELSE260=null;
        FanParser.parL_return parL256 = null;

        FanParser.expr_return expr257 = null;

        FanParser.parR_return parR258 = null;

        FanParser.block_return block259 = null;

        FanParser.block_return block261 = null;


        Object KW_IF255_tree=null;
        Object KW_ELSE260_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:7: ( KW_IF parL expr parR block ( KW_ELSE block )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:9: KW_IF parL expr parR block ( KW_ELSE block )?
            {
            root_0 = (Object)adaptor.nil();

            KW_IF255=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_g_if2305); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_IF255_tree = (Object)adaptor.create(KW_IF255);
            adaptor.addChild(root_0, KW_IF255_tree);
            }
            pushFollow(FOLLOW_parL_in_g_if2307);
            parL256=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL256.getTree());
            pushFollow(FOLLOW_expr_in_g_if2309);
            expr257=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr257.getTree());
            pushFollow(FOLLOW_parR_in_g_if2311);
            parR258=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR258.getTree());
            pushFollow(FOLLOW_block_in_g_if2313);
            block259=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block259.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:365:5: ( KW_ELSE block )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==KW_ELSE) ) {
                int LA82_1 = input.LA(2);

                if ( (synpred126_Fan()) ) {
                    alt82=1;
                }
            }
            switch (alt82) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:365:6: KW_ELSE block
                    {
                    KW_ELSE260=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_g_if2320); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ELSE260_tree = (Object)adaptor.create(KW_ELSE260);
                    adaptor.addChild(root_0, KW_ELSE260_tree);
                    }
                    pushFollow(FOLLOW_block_in_g_if2322);
                    block261=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block261.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:366:1: g_return : KW_RETURN ( eos | expr eos ) ;
    public final FanParser.g_return_return g_return() throws RecognitionException {
        FanParser.g_return_return retval = new FanParser.g_return_return();
        retval.start = input.LT(1);
        int g_return_StartIndex = input.index();
        Object root_0 = null;

        Token KW_RETURN262=null;
        FanParser.eos_return eos263 = null;

        FanParser.expr_return expr264 = null;

        FanParser.eos_return eos265 = null;


        Object KW_RETURN262_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:10: ( KW_RETURN ( eos | expr eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:12: KW_RETURN ( eos | expr eos )
            {
            root_0 = (Object)adaptor.nil();

            KW_RETURN262=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_g_return2331); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_RETURN262_tree = (Object)adaptor.create(KW_RETURN262);
            adaptor.addChild(root_0, KW_RETURN262_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:22: ( eos | expr eos )
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:366:23: eos
                    {
                    pushFollow(FOLLOW_eos_in_g_return2334);
                    eos263=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos263.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:366:29: expr eos
                    {
                    pushFollow(FOLLOW_expr_in_g_return2338);
                    expr264=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr264.getTree());
                    pushFollow(FOLLOW_eos_in_g_return2340);
                    eos265=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos265.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:367:1: g_switch : KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR ;
    public final FanParser.g_switch_return g_switch() throws RecognitionException {
        FanParser.g_switch_return retval = new FanParser.g_switch_return();
        retval.start = input.LT(1);
        int g_switch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SWITCH266=null;
        FanParser.parL_return parL267 = null;

        FanParser.expr_return expr268 = null;

        FanParser.parR_return parR269 = null;

        FanParser.bracketL_return bracketL270 = null;

        FanParser.g_case_return g_case271 = null;

        FanParser.g_default_return g_default272 = null;

        FanParser.bracketR_return bracketR273 = null;


        Object KW_SWITCH266_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:367:10: ( KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:367:12: KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR
            {
            root_0 = (Object)adaptor.nil();

            KW_SWITCH266=(Token)match(input,KW_SWITCH,FOLLOW_KW_SWITCH_in_g_switch2348); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SWITCH266_tree = (Object)adaptor.create(KW_SWITCH266);
            adaptor.addChild(root_0, KW_SWITCH266_tree);
            }
            pushFollow(FOLLOW_parL_in_g_switch2350);
            parL267=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL267.getTree());
            pushFollow(FOLLOW_expr_in_g_switch2352);
            expr268=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr268.getTree());
            pushFollow(FOLLOW_parR_in_g_switch2354);
            parR269=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR269.getTree());
            pushFollow(FOLLOW_bracketL_in_g_switch2356);
            bracketL270=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL270.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:367:46: ( g_case )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==KW_CASE) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:367:47: g_case
            	    {
            	    pushFollow(FOLLOW_g_case_in_g_switch2359);
            	    g_case271=g_case();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_case271.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:367:56: ( g_default )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==KW_DEFAULT) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:367:57: g_default
                    {
                    pushFollow(FOLLOW_g_default_in_g_switch2364);
                    g_default272=g_default();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_default272.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_bracketR_in_g_switch2368);
            bracketR273=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR273.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:368:1: g_throw : KW_THROW expr eos ;
    public final FanParser.g_throw_return g_throw() throws RecognitionException {
        FanParser.g_throw_return retval = new FanParser.g_throw_return();
        retval.start = input.LT(1);
        int g_throw_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THROW274=null;
        FanParser.expr_return expr275 = null;

        FanParser.eos_return eos276 = null;


        Object KW_THROW274_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:368:10: ( KW_THROW expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:368:12: KW_THROW expr eos
            {
            root_0 = (Object)adaptor.nil();

            KW_THROW274=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_g_throw2376); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THROW274_tree = (Object)adaptor.create(KW_THROW274);
            adaptor.addChild(root_0, KW_THROW274_tree);
            }
            pushFollow(FOLLOW_expr_in_g_throw2378);
            expr275=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr275.getTree());
            pushFollow(FOLLOW_eos_in_g_throw2380);
            eos276=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos276.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:369:1: g_while : KW_WHILE parL expr parR block ;
    public final FanParser.g_while_return g_while() throws RecognitionException {
        FanParser.g_while_return retval = new FanParser.g_while_return();
        retval.start = input.LT(1);
        int g_while_StartIndex = input.index();
        Object root_0 = null;

        Token KW_WHILE277=null;
        FanParser.parL_return parL278 = null;

        FanParser.expr_return expr279 = null;

        FanParser.parR_return parR280 = null;

        FanParser.block_return block281 = null;


        Object KW_WHILE277_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:10: ( KW_WHILE parL expr parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:12: KW_WHILE parL expr parR block
            {
            root_0 = (Object)adaptor.nil();

            KW_WHILE277=(Token)match(input,KW_WHILE,FOLLOW_KW_WHILE_in_g_while2388); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_WHILE277_tree = (Object)adaptor.create(KW_WHILE277);
            adaptor.addChild(root_0, KW_WHILE277_tree);
            }
            pushFollow(FOLLOW_parL_in_g_while2390);
            parL278=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL278.getTree());
            pushFollow(FOLLOW_expr_in_g_while2392);
            expr279=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr279.getTree());
            pushFollow(FOLLOW_parR_in_g_while2394);
            parR280=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR280.getTree());
            pushFollow(FOLLOW_block_in_g_while2396);
            block281=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block281.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:370:1: g_try : KW_TRY ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? ;
    public final FanParser.g_try_return g_try() throws RecognitionException {
        FanParser.g_try_return retval = new FanParser.g_try_return();
        retval.start = input.LT(1);
        int g_try_StartIndex = input.index();
        Object root_0 = null;

        Token KW_TRY282=null;
        FanParser.try_long_return try_long283 = null;

        FanParser.stmtList_return stmtList284 = null;

        FanParser.g_catch_return g_catch285 = null;

        FanParser.g_finally_return g_finally286 = null;


        Object KW_TRY282_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:370:8: ( KW_TRY ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:370:10: KW_TRY ( ( bracketL )=> try_long | stmtList ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )?
            {
            root_0 = (Object)adaptor.nil();

            KW_TRY282=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_g_try2404); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_TRY282_tree = (Object)adaptor.create(KW_TRY282);
            adaptor.addChild(root_0, KW_TRY282_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:370:17: ( ( bracketL )=> try_long | stmtList )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==BRACKET_L) && (synpred130_Fan())) {
                alt86=1;
            }
            else if ( (LA86_0==EOF||(LA86_0>=KW_BREAK && LA86_0<=KW_FINALLY)||(LA86_0>=KW_RD_ONLY && LA86_0<=KW_FINAL)||(LA86_0>=KW_ABSTRACT && LA86_0<=KW_ELSE)||(LA86_0>=KW_NULL && LA86_0<=KW_FALSE)||LA86_0==BRACKET_R||LA86_0==SP_COMMA||LA86_0==SP_PIPE||LA86_0==SP_SEMI||LA86_0==OP_CURRY||(LA86_0>=OP_PLUS && LA86_0<=OP_MULTI)||(LA86_0>=OP_BANG && LA86_0<=OP_TILDA)||(LA86_0>=ID && LA86_0<=SQ_BRACKET_L)||LA86_0==PAR_L) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:370:18: ( bracketL )=> try_long
                    {
                    pushFollow(FOLLOW_try_long_in_g_try2411);
                    try_long283=try_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_long283.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:370:41: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_try2415);
                    stmtList284=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList284.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:370:51: ( ( KW_CATCH )=> g_catch )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==KW_CATCH) ) {
                    int LA87_2 = input.LA(2);

                    if ( (synpred131_Fan()) ) {
                        alt87=1;
                    }


                }


                switch (alt87) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:370:52: ( KW_CATCH )=> g_catch
            	    {
            	    pushFollow(FOLLOW_g_catch_in_g_try2423);
            	    g_catch285=g_catch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_catch285.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:370:74: ( ( KW_FINALLY )=> g_finally )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==KW_FINALLY) ) {
                int LA88_1 = input.LA(2);

                if ( (synpred132_Fan()) ) {
                    alt88=1;
                }
            }
            switch (alt88) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:370:75: ( KW_FINALLY )=> g_finally
                    {
                    pushFollow(FOLLOW_g_finally_in_g_try2432);
                    g_finally286=g_finally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_finally286.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:371:1: try_long : multiStmt ;
    public final FanParser.try_long_return try_long() throws RecognitionException {
        FanParser.try_long_return retval = new FanParser.try_long_return();
        retval.start = input.LT(1);
        int try_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt287 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:10: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:371:12: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_try_long2441);
            multiStmt287=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt287.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:372:1: exprStmt : expr eos ;
    public final FanParser.exprStmt_return exprStmt() throws RecognitionException {
        FanParser.exprStmt_return retval = new FanParser.exprStmt_return();
        retval.start = input.LT(1);
        int exprStmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.expr_return expr288 = null;

        FanParser.eos_return eos289 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:10: ( expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:12: expr eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprStmt2448);
            expr288=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr288.getTree());
            pushFollow(FOLLOW_eos_in_exprStmt2450);
            eos289=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos289.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:373:1: localDef : typeId ( AS_INIT_VAL expr )? eos ;
    public final FanParser.localDef_return localDef() throws RecognitionException {
        FanParser.localDef_return retval = new FanParser.localDef_return();
        retval.start = input.LT(1);
        int localDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL291=null;
        FanParser.typeId_return typeId290 = null;

        FanParser.expr_return expr292 = null;

        FanParser.eos_return eos293 = null;


        Object AS_INIT_VAL291_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:10: ( typeId ( AS_INIT_VAL expr )? eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:12: typeId ( AS_INIT_VAL expr )? eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeId_in_localDef2457);
            typeId290=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId290.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:373:19: ( AS_INIT_VAL expr )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==AS_INIT_VAL) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:373:20: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL291=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_localDef2460); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_INIT_VAL291_tree = (Object)adaptor.create(AS_INIT_VAL291);
                    adaptor.addChild(root_0, AS_INIT_VAL291_tree);
                    }
                    pushFollow(FOLLOW_expr_in_localDef2462);
                    expr292=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr292.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_eos_in_localDef2466);
            eos293=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos293.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:374:1: forInit : ( forInitDef | expr );
    public final FanParser.forInit_return forInit() throws RecognitionException {
        FanParser.forInit_return retval = new FanParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        Object root_0 = null;

        FanParser.forInitDef_return forInitDef294 = null;

        FanParser.expr_return expr295 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:374:10: ( forInitDef | expr )
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:374:12: forInitDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forInitDef_in_forInit2474);
                    forInitDef294=forInitDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInitDef294.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:374:25: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_forInit2478);
                    expr295=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr295.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:375:1: forInitDef : typeId ( AS_INIT_VAL expr )? ;
    public final FanParser.forInitDef_return forInitDef() throws RecognitionException {
        FanParser.forInitDef_return retval = new FanParser.forInitDef_return();
        retval.start = input.LT(1);
        int forInitDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL297=null;
        FanParser.typeId_return typeId296 = null;

        FanParser.expr_return expr298 = null;


        Object AS_INIT_VAL297_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:375:12: ( typeId ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:375:14: typeId ( AS_INIT_VAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeId_in_forInitDef2485);
            typeId296=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId296.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:375:21: ( AS_INIT_VAL expr )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==AS_INIT_VAL) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:375:22: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL297=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_forInitDef2488); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_INIT_VAL297_tree = (Object)adaptor.create(AS_INIT_VAL297);
                    adaptor.addChild(root_0, AS_INIT_VAL297_tree);
                    }
                    pushFollow(FOLLOW_expr_in_forInitDef2490);
                    expr298=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr298.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:377:1: g_catch : KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | stmtList ) ;
    public final FanParser.g_catch_return g_catch() throws RecognitionException {
        FanParser.g_catch_return retval = new FanParser.g_catch_return();
        retval.start = input.LT(1);
        int g_catch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CATCH299=null;
        FanParser.catchDef_return catchDef300 = null;

        FanParser.catch_long_return catch_long301 = null;

        FanParser.stmtList_return stmtList302 = null;


        Object KW_CATCH299_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:10: ( KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | stmtList ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:12: KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | stmtList )
            {
            root_0 = (Object)adaptor.nil();

            KW_CATCH299=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_g_catch2501); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CATCH299_tree = (Object)adaptor.create(KW_CATCH299);
            adaptor.addChild(root_0, KW_CATCH299_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:21: ( catchDef )?
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: catchDef
                    {
                    pushFollow(FOLLOW_catchDef_in_g_catch2503);
                    catchDef300=catchDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchDef300.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:377:31: ( ( bracketL )=> catch_long | stmtList )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==BRACKET_L) && (synpred137_Fan())) {
                alt93=1;
            }
            else if ( (LA93_0==EOF||(LA93_0>=KW_BREAK && LA93_0<=KW_FINALLY)||(LA93_0>=KW_RD_ONLY && LA93_0<=KW_FINAL)||(LA93_0>=KW_ABSTRACT && LA93_0<=KW_ELSE)||(LA93_0>=KW_NULL && LA93_0<=KW_FALSE)||LA93_0==BRACKET_R||LA93_0==SP_COMMA||LA93_0==SP_PIPE||LA93_0==SP_SEMI||LA93_0==OP_CURRY||(LA93_0>=OP_PLUS && LA93_0<=OP_MULTI)||(LA93_0>=OP_BANG && LA93_0<=OP_TILDA)||(LA93_0>=ID && LA93_0<=SQ_BRACKET_L)||LA93_0==PAR_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:377:32: ( bracketL )=> catch_long
                    {
                    pushFollow(FOLLOW_catch_long_in_g_catch2511);
                    catch_long301=catch_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catch_long301.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:377:57: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_catch2515);
                    stmtList302=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList302.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:378:1: catch_long : multiStmt ;
    public final FanParser.catch_long_return catch_long() throws RecognitionException {
        FanParser.catch_long_return retval = new FanParser.catch_long_return();
        retval.start = input.LT(1);
        int catch_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt303 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:12: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:14: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_catch_long2523);
            multiStmt303=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt303.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:379:1: catchDef : parL type id parR ;
    public final FanParser.catchDef_return catchDef() throws RecognitionException {
        FanParser.catchDef_return retval = new FanParser.catchDef_return();
        retval.start = input.LT(1);
        int catchDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL304 = null;

        FanParser.type_return type305 = null;

        FanParser.id_return id306 = null;

        FanParser.parR_return parR307 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:11: ( parL type id parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:379:13: parL type id parR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parL_in_catchDef2531);
            parL304=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL304.getTree());
            pushFollow(FOLLOW_type_in_catchDef2533);
            type305=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type305.getTree());
            pushFollow(FOLLOW_id_in_catchDef2535);
            id306=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id306.getTree());
            pushFollow(FOLLOW_parR_in_catchDef2537);
            parR307=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR307.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:381:1: g_finally : KW_FINALLY ( ( bracketL )=> finally_long | stmtList ) ;
    public final FanParser.g_finally_return g_finally() throws RecognitionException {
        FanParser.g_finally_return retval = new FanParser.g_finally_return();
        retval.start = input.LT(1);
        int g_finally_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FINALLY308=null;
        FanParser.finally_long_return finally_long309 = null;

        FanParser.stmtList_return stmtList310 = null;


        Object KW_FINALLY308_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:11: ( KW_FINALLY ( ( bracketL )=> finally_long | stmtList ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:13: KW_FINALLY ( ( bracketL )=> finally_long | stmtList )
            {
            root_0 = (Object)adaptor.nil();

            KW_FINALLY308=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_g_finally2545); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_FINALLY308_tree = (Object)adaptor.create(KW_FINALLY308);
            adaptor.addChild(root_0, KW_FINALLY308_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:24: ( ( bracketL )=> finally_long | stmtList )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==BRACKET_L) && (synpred138_Fan())) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:25: ( bracketL )=> finally_long
                    {
                    pushFollow(FOLLOW_finally_long_in_g_finally2552);
                    finally_long309=finally_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, finally_long309.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:52: stmtList
                    {
                    pushFollow(FOLLOW_stmtList_in_g_finally2556);
                    stmtList310=stmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtList310.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:382:1: finally_long : multiStmt ;
    public final FanParser.finally_long_return finally_long() throws RecognitionException {
        FanParser.finally_long_return retval = new FanParser.finally_long_return();
        retval.start = input.LT(1);
        int finally_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt311 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:382:14: ( multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:382:16: multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiStmt_in_finally_long2564);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:383:1: g_case : KW_CASE expr SP_COLON ( stmt )* ;
    public final FanParser.g_case_return g_case() throws RecognitionException {
        FanParser.g_case_return retval = new FanParser.g_case_return();
        retval.start = input.LT(1);
        int g_case_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CASE312=null;
        Token SP_COLON314=null;
        FanParser.expr_return expr313 = null;

        FanParser.stmt_return stmt315 = null;


        Object KW_CASE312_tree=null;
        Object SP_COLON314_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:9: ( KW_CASE expr SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:11: KW_CASE expr SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_CASE312=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_g_case2572); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CASE312_tree = (Object)adaptor.create(KW_CASE312);
            adaptor.addChild(root_0, KW_CASE312_tree);
            }
            pushFollow(FOLLOW_expr_in_g_case2574);
            expr313=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr313.getTree());
            SP_COLON314=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_case2576); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON314_tree = (Object)adaptor.create(SP_COLON314);
            adaptor.addChild(root_0, SP_COLON314_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:33: ( stmt )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( ((LA95_0>=KW_BREAK && LA95_0<=KW_TRY)||(LA95_0>=KW_THIS && LA95_0<=KW_SUPER)||(LA95_0>=KW_NULL && LA95_0<=KW_FALSE)||LA95_0==SP_PIPE||LA95_0==OP_CURRY||(LA95_0>=OP_PLUS && LA95_0<=OP_MULTI)||(LA95_0>=OP_BANG && LA95_0<=OP_TILDA)||(LA95_0>=ID && LA95_0<=AT)||(LA95_0>=NUMBER && LA95_0<=SQ_BRACKET_L)||LA95_0==PAR_L) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_case2578);
            	    stmt315=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt315.getTree());

            	    }
            	    break;

            	default :
            	    break loop95;
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:384:1: g_default : KW_DEFAULT SP_COLON ( stmt )* ;
    public final FanParser.g_default_return g_default() throws RecognitionException {
        FanParser.g_default_return retval = new FanParser.g_default_return();
        retval.start = input.LT(1);
        int g_default_StartIndex = input.index();
        Object root_0 = null;

        Token KW_DEFAULT316=null;
        Token SP_COLON317=null;
        FanParser.stmt_return stmt318 = null;


        Object KW_DEFAULT316_tree=null;
        Object SP_COLON317_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:11: ( KW_DEFAULT SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:13: KW_DEFAULT SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_DEFAULT316=(Token)match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_g_default2586); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_DEFAULT316_tree = (Object)adaptor.create(KW_DEFAULT316);
            adaptor.addChild(root_0, KW_DEFAULT316_tree);
            }
            SP_COLON317=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_default2588); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON317_tree = (Object)adaptor.create(SP_COLON317);
            adaptor.addChild(root_0, SP_COLON317_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:33: ( stmt )*
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
            	    pushFollow(FOLLOW_stmt_in_g_default2590);
            	    stmt318=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt318.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:387:1: expr : assignExpr ;
    public final FanParser.expr_return expr() throws RecognitionException {
        FanParser.expr_return retval = new FanParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.assignExpr_return assignExpr319 = null;



        paraphrase.push("Expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:389:3: ( assignExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:389:5: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr2611);
            assignExpr319=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr319.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:390:1: assignExpr : ternaryExpr ( assignOp assignExpr )? ;
    public final FanParser.assignExpr_return assignExpr() throws RecognitionException {
        FanParser.assignExpr_return retval = new FanParser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.ternaryExpr_return ternaryExpr320 = null;

        FanParser.assignOp_return assignOp321 = null;

        FanParser.assignExpr_return assignExpr322 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:390:12: ( ternaryExpr ( assignOp assignExpr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:390:14: ternaryExpr ( assignOp assignExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2618);
            ternaryExpr320=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr320.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:390:26: ( assignOp assignExpr )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=AS_EQUAL && LA97_0<=AS_ASSIGN_OP)) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:27: assignOp assignExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2621);
                    assignOp321=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp321.getTree());
                    pushFollow(FOLLOW_assignExpr_in_assignExpr2623);
                    assignExpr322=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr322.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:391:1: ternaryExpr : condOrExpr ( ternaryTail )? ;
    public final FanParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        FanParser.ternaryExpr_return retval = new FanParser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.condOrExpr_return condOrExpr323 = null;

        FanParser.ternaryTail_return ternaryTail324 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:13: ( condOrExpr ( ternaryTail )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:15: condOrExpr ( ternaryTail )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condOrExpr_in_ternaryExpr2632);
            condOrExpr323=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr323.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:26: ( ternaryTail )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==SP_QMARK) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:391:27: ternaryTail
                    {
                    pushFollow(FOLLOW_ternaryTail_in_ternaryExpr2635);
                    ternaryTail324=ternaryTail();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryTail324.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:393:1: ternaryTail : SP_QMARK condOrExpr SP_COLON condOrExpr ;
    public final FanParser.ternaryTail_return ternaryTail() throws RecognitionException {
        FanParser.ternaryTail_return retval = new FanParser.ternaryTail_return();
        retval.start = input.LT(1);
        int ternaryTail_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK325=null;
        Token SP_COLON327=null;
        FanParser.condOrExpr_return condOrExpr326 = null;

        FanParser.condOrExpr_return condOrExpr328 = null;


        Object SP_QMARK325_tree=null;
        Object SP_COLON327_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:13: ( SP_QMARK condOrExpr SP_COLON condOrExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:15: SP_QMARK condOrExpr SP_COLON condOrExpr
            {
            root_0 = (Object)adaptor.nil();

            SP_QMARK325=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_ternaryTail2645); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_QMARK325_tree = (Object)adaptor.create(SP_QMARK325);
            adaptor.addChild(root_0, SP_QMARK325_tree);
            }
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail2647);
            condOrExpr326=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr326.getTree());
            SP_COLON327=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ternaryTail2649); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON327_tree = (Object)adaptor.create(SP_COLON327);
            adaptor.addChild(root_0, SP_COLON327_tree);
            }
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail2651);
            condOrExpr328=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr328.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:394:1: assignOp : ( AS_EQUAL | AS_ASSIGN_OP );
    public final FanParser.assignOp_return assignOp() throws RecognitionException {
        FanParser.assignOp_return retval = new FanParser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token set329=null;

        Object set329_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:10: ( AS_EQUAL | AS_ASSIGN_OP )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            root_0 = (Object)adaptor.nil();

            set329=(Token)input.LT(1);
            if ( (input.LA(1)>=AS_EQUAL && input.LA(1)<=AS_ASSIGN_OP) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set329));
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:395:1: condOrExpr : condAndExpr ( OP_OR condAndExpr )* ;
    public final FanParser.condOrExpr_return condOrExpr() throws RecognitionException {
        FanParser.condOrExpr_return retval = new FanParser.condOrExpr_return();
        retval.start = input.LT(1);
        int condOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_OR331=null;
        FanParser.condAndExpr_return condAndExpr330 = null;

        FanParser.condAndExpr_return condAndExpr332 = null;


        Object OP_OR331_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:13: ( condAndExpr ( OP_OR condAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:15: condAndExpr ( OP_OR condAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condAndExpr_in_condOrExpr2670);
            condAndExpr330=condAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr330.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:28: ( OP_OR condAndExpr )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==OP_OR) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:395:29: OP_OR condAndExpr
            	    {
            	    OP_OR331=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_condOrExpr2674); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_OR331_tree = (Object)adaptor.create(OP_OR331);
            	    adaptor.addChild(root_0, OP_OR331_tree);
            	    }
            	    pushFollow(FOLLOW_condAndExpr_in_condOrExpr2677);
            	    condAndExpr332=condAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr332.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:396:1: condAndExpr : equalityExpr ( OP_AND equalityExpr )* ;
    public final FanParser.condAndExpr_return condAndExpr() throws RecognitionException {
        FanParser.condAndExpr_return retval = new FanParser.condAndExpr_return();
        retval.start = input.LT(1);
        int condAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_AND334=null;
        FanParser.equalityExpr_return equalityExpr333 = null;

        FanParser.equalityExpr_return equalityExpr335 = null;


        Object OP_AND334_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:14: ( equalityExpr ( OP_AND equalityExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:16: equalityExpr ( OP_AND equalityExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpr_in_condAndExpr2687);
            equalityExpr333=equalityExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr333.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:29: ( OP_AND equalityExpr )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==OP_AND) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:396:30: OP_AND equalityExpr
            	    {
            	    OP_AND334=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_condAndExpr2690); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_AND334_tree = (Object)adaptor.create(OP_AND334);
            	    adaptor.addChild(root_0, OP_AND334_tree);
            	    }
            	    pushFollow(FOLLOW_equalityExpr_in_condAndExpr2693);
            	    equalityExpr335=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr335.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:397:1: equalityExpr : relationalExpr ( CP_EQUALITY relationalExpr )* ;
    public final FanParser.equalityExpr_return equalityExpr() throws RecognitionException {
        FanParser.equalityExpr_return retval = new FanParser.equalityExpr_return();
        retval.start = input.LT(1);
        int equalityExpr_StartIndex = input.index();
        Object root_0 = null;

        Token CP_EQUALITY337=null;
        FanParser.relationalExpr_return relationalExpr336 = null;

        FanParser.relationalExpr_return relationalExpr338 = null;


        Object CP_EQUALITY337_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:397:14: ( relationalExpr ( CP_EQUALITY relationalExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:397:16: relationalExpr ( CP_EQUALITY relationalExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpr_in_equalityExpr2703);
            relationalExpr336=relationalExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr336.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:397:31: ( CP_EQUALITY relationalExpr )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==CP_EQUALITY) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:397:32: CP_EQUALITY relationalExpr
            	    {
            	    CP_EQUALITY337=(Token)match(input,CP_EQUALITY,FOLLOW_CP_EQUALITY_in_equalityExpr2706); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_EQUALITY337_tree = (Object)adaptor.create(CP_EQUALITY337);
            	    adaptor.addChild(root_0, CP_EQUALITY337_tree);
            	    }
            	    pushFollow(FOLLOW_relationalExpr_in_equalityExpr2708);
            	    relationalExpr338=relationalExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr338.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:399:1: relationalExpr : elvisExpr ( typeCheck | compare ) ;
    public final FanParser.relationalExpr_return relationalExpr() throws RecognitionException {
        FanParser.relationalExpr_return retval = new FanParser.relationalExpr_return();
        retval.start = input.LT(1);
        int relationalExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.elvisExpr_return elvisExpr339 = null;

        FanParser.typeCheck_return typeCheck340 = null;

        FanParser.compare_return compare341 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:16: ( elvisExpr ( typeCheck | compare ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:20: elvisExpr ( typeCheck | compare )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_elvisExpr_in_relationalExpr2721);
            elvisExpr339=elvisExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr339.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:30: ( typeCheck | compare )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==KW_AS||(LA102_0>=KW_IS && LA102_0<=KW_ISNOT)) ) {
                alt102=1;
            }
            else if ( (LA102_0==EOF||(LA102_0>=KW_BREAK && LA102_0<=KW_USING)||(LA102_0>=KW_RD_ONLY && LA102_0<=KW_FINAL)||(LA102_0>=KW_CLASS && LA102_0<=KW_ELSE)||(LA102_0>=KW_NULL && LA102_0<=KW_FALSE)||(LA102_0>=BRACKET_L && LA102_0<=BRACKET_R)||(LA102_0>=SP_COLON && LA102_0<=SP_QMARK)||LA102_0==SP_PIPE||(LA102_0>=SP_SEMI && LA102_0<=CP_COMPARATORS)||LA102_0==OP_CURRY||(LA102_0>=OP_PLUS && LA102_0<=OP_MULTI)||(LA102_0>=OP_BANG && LA102_0<=OP_TILDA)||(LA102_0>=ID && LA102_0<=PAR_R)) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:31: typeCheck
                    {
                    pushFollow(FOLLOW_typeCheck_in_relationalExpr2724);
                    typeCheck340=typeCheck();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeCheck340.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:399:43: compare
                    {
                    pushFollow(FOLLOW_compare_in_relationalExpr2728);
                    compare341=compare();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compare341.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:401:1: typeCheck : ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* ;
    public final FanParser.typeCheck_return typeCheck() throws RecognitionException {
        FanParser.typeCheck_return retval = new FanParser.typeCheck_return();
        retval.start = input.LT(1);
        int typeCheck_StartIndex = input.index();
        Object root_0 = null;

        Token set342=null;
        Token SP_QMARK344=null;
        Token string_literal345=null;
        FanParser.typeRoot_return typeRoot343 = null;


        Object set342_tree=null;
        Object SP_QMARK344_tree=null;
        Object string_literal345_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:11: ( ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:15: ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )*
            {
            root_0 = (Object)adaptor.nil();

            set342=(Token)input.LT(1);
            if ( input.LA(1)==KW_AS||(input.LA(1)>=KW_IS && input.LA(1)<=KW_ISNOT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set342));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_typeRoot_in_typeCheck2751);
            typeRoot343=typeRoot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeRoot343.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:401:51: ( ( SP_QMARK )? {...}? '[]' )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==SP_QMARK) ) {
                    int LA104_2 = input.LA(2);

                    if ( (LA104_2==LIST_TYPE) ) {
                        alt104=1;
                    }


                }
                else if ( (LA104_0==LIST_TYPE) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:401:52: ( SP_QMARK )? {...}? '[]'
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:401:52: ( SP_QMARK )?
            	    int alt103=2;
            	    int LA103_0 = input.LA(1);

            	    if ( (LA103_0==SP_QMARK) ) {
            	        alt103=1;
            	    }
            	    switch (alt103) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK344=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_typeCheck2754); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK344_tree = (Object)adaptor.create(SP_QMARK344);
            	            adaptor.addChild(root_0, SP_QMARK344_tree);
            	            }

            	            }
            	            break;

            	    }

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "typeCheck", "notAfterEol()");
            	    }
            	    string_literal345=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_typeCheck2759); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal345_tree = (Object)adaptor.create(string_literal345);
            	    adaptor.addChild(root_0, string_literal345_tree);
            	    }

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:402:1: compare : ( CP_COMPARATORS elvisExpr )* ;
    public final FanParser.compare_return compare() throws RecognitionException {
        FanParser.compare_return retval = new FanParser.compare_return();
        retval.start = input.LT(1);
        int compare_StartIndex = input.index();
        Object root_0 = null;

        Token CP_COMPARATORS346=null;
        FanParser.elvisExpr_return elvisExpr347 = null;


        Object CP_COMPARATORS346_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:10: ( ( CP_COMPARATORS elvisExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:14: ( CP_COMPARATORS elvisExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:402:14: ( CP_COMPARATORS elvisExpr )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==CP_COMPARATORS) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:402:15: CP_COMPARATORS elvisExpr
            	    {
            	    CP_COMPARATORS346=(Token)match(input,CP_COMPARATORS,FOLLOW_CP_COMPARATORS_in_compare2772); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_COMPARATORS346_tree = (Object)adaptor.create(CP_COMPARATORS346);
            	    adaptor.addChild(root_0, CP_COMPARATORS346_tree);
            	    }
            	    pushFollow(FOLLOW_elvisExpr_in_compare2774);
            	    elvisExpr347=elvisExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr347.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:404:1: elvisExpr : rangeExpr ( OP_ELVIS rangeExpr )* ;
    public final FanParser.elvisExpr_return elvisExpr() throws RecognitionException {
        FanParser.elvisExpr_return retval = new FanParser.elvisExpr_return();
        retval.start = input.LT(1);
        int elvisExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ELVIS349=null;
        FanParser.rangeExpr_return rangeExpr348 = null;

        FanParser.rangeExpr_return rangeExpr350 = null;


        Object OP_ELVIS349_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:12: ( rangeExpr ( OP_ELVIS rangeExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:14: rangeExpr ( OP_ELVIS rangeExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpr_in_elvisExpr2785);
            rangeExpr348=rangeExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rangeExpr348.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:24: ( OP_ELVIS rangeExpr )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==OP_ELVIS) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:404:25: OP_ELVIS rangeExpr
            	    {
            	    OP_ELVIS349=(Token)match(input,OP_ELVIS,FOLLOW_OP_ELVIS_in_elvisExpr2788); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_ELVIS349_tree = (Object)adaptor.create(OP_ELVIS349);
            	    adaptor.addChild(root_0, OP_ELVIS349_tree);
            	    }
            	    pushFollow(FOLLOW_rangeExpr_in_elvisExpr2790);
            	    rangeExpr350=rangeExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rangeExpr350.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:405:1: rangeExpr : bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* ;
    public final FanParser.rangeExpr_return rangeExpr() throws RecognitionException {
        FanParser.rangeExpr_return retval = new FanParser.rangeExpr_return();
        retval.start = input.LT(1);
        int rangeExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set352=null;
        FanParser.bitOrExpr_return bitOrExpr351 = null;

        FanParser.bitOrExpr_return bitOrExpr353 = null;


        Object set352_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:12: ( bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:14: bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2801);
            bitOrExpr351=bitOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitOrExpr351.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:24: ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( ((LA107_0>=OP_RANG_EXCL_OLD && LA107_0<=OP_RANGE)) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:405:25: ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr
            	    {
            	    set352=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_RANG_EXCL_OLD && input.LA(1)<=OP_RANGE) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set352));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2818);
            	    bitOrExpr353=bitOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitOrExpr353.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:406:1: bitOrExpr : bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* ;
    public final FanParser.bitOrExpr_return bitOrExpr() throws RecognitionException {
        FanParser.bitOrExpr_return retval = new FanParser.bitOrExpr_return();
        retval.start = input.LT(1);
        int bitOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set355=null;
        FanParser.bitAndExpr_return bitAndExpr354 = null;

        FanParser.bitAndExpr_return bitAndExpr356 = null;


        Object set355_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:12: ( bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:14: bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2829);
            bitAndExpr354=bitAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitAndExpr354.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            loop108:
            do {
                int alt108=2;
                alt108 = dfa108.predict(input);
                switch (alt108) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:406:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
            	    {
            	    set355=(Token)input.LT(1);
            	    if ( input.LA(1)==SP_PIPE||input.LA(1)==OP_BITOR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set355));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2840);
            	    bitAndExpr356=bitAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitAndExpr356.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:407:1: bitAndExpr : shiftExpr ( OP_CURRY shiftExpr )* ;
    public final FanParser.bitAndExpr_return bitAndExpr() throws RecognitionException {
        FanParser.bitAndExpr_return retval = new FanParser.bitAndExpr_return();
        retval.start = input.LT(1);
        int bitAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_CURRY358=null;
        FanParser.shiftExpr_return shiftExpr357 = null;

        FanParser.shiftExpr_return shiftExpr359 = null;


        Object OP_CURRY358_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:13: ( shiftExpr ( OP_CURRY shiftExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:15: shiftExpr ( OP_CURRY shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2851);
            shiftExpr357=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr357.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:407:25: ( OP_CURRY shiftExpr )*
            loop109:
            do {
                int alt109=2;
                alt109 = dfa109.predict(input);
                switch (alt109) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:407:26: OP_CURRY shiftExpr
            	    {
            	    OP_CURRY358=(Token)match(input,OP_CURRY,FOLLOW_OP_CURRY_in_bitAndExpr2854); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_CURRY358_tree = (Object)adaptor.create(OP_CURRY358);
            	    adaptor.addChild(root_0, OP_CURRY358_tree);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2856);
            	    shiftExpr359=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr359.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:408:1: shiftExpr : addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* ;
    public final FanParser.shiftExpr_return shiftExpr() throws RecognitionException {
        FanParser.shiftExpr_return retval = new FanParser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set361=null;
        FanParser.addExpr_return addExpr360 = null;

        FanParser.addExpr_return addExpr362 = null;


        Object set361_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:12: ( addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:14: addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_shiftExpr2868);
            addExpr360=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr360.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:22: ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( ((LA110_0>=OP_LSHIFT && LA110_0<=OP_RSHIFT)) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:408:23: ( OP_LSHIFT | OP_RSHIFT ) addExpr
            	    {
            	    set361=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_LSHIFT && input.LA(1)<=OP_RSHIFT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set361));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2879);
            	    addExpr362=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr362.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:409:1: addExpr : multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* ;
    public final FanParser.addExpr_return addExpr() throws RecognitionException {
        FanParser.addExpr_return retval = new FanParser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set364=null;
        FanParser.multExpr_return multExpr363 = null;

        FanParser.multExpr_return multExpr365 = null;


        Object set364_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:10: ( multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:12: multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_addExpr2890);
            multExpr363=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr363.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*
            loop111:
            do {
                int alt111=2;
                alt111 = dfa111.predict(input);
                switch (alt111) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:409:22: ( OP_PLUS | OP_MINUS ) multExpr
            	    {
            	    set364=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set364));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2901);
            	    multExpr365=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr365.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:410:1: addAppend : ( OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.addAppend_return addAppend() throws RecognitionException {
        FanParser.addAppend_return retval = new FanParser.addAppend_return();
        retval.start = input.LT(1);
        int addAppend_StartIndex = input.index();
        Object root_0 = null;

        Token set366=null;
        FanParser.parenExpr_return parenExpr367 = null;


        Object set366_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:11: ( ( OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:13: ( OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set366=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set366));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_addAppend2919);
            parenExpr367=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr367.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:411:1: multExpr : parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* ;
    public final FanParser.multExpr_return multExpr() throws RecognitionException {
        FanParser.multExpr_return retval = new FanParser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set369=null;
        FanParser.parenExpr_return parenExpr368 = null;

        FanParser.parenExpr_return parenExpr370 = null;


        Object set369_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:411:11: ( parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:411:13: parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parenExpr_in_multExpr2927);
            parenExpr368=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr368.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:411:23: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==OP_MULTI) ) {
                    int LA112_2 = input.LA(2);

                    if ( (LA112_2==ID) ) {
                        int LA112_4 = input.LA(3);

                        if ( (synpred167_Fan()) ) {
                            alt112=1;
                        }


                    }
                    else if ( ((LA112_2>=KW_THIS && LA112_2<=KW_SUPER)||(LA112_2>=KW_NULL && LA112_2<=KW_FALSE)||LA112_2==SP_PIPE||LA112_2==OP_CURRY||(LA112_2>=OP_PLUS && LA112_2<=OP_MULTI)||(LA112_2>=OP_BANG && LA112_2<=OP_TILDA)||(LA112_2>=URI && LA112_2<=AT)||(LA112_2>=NUMBER && LA112_2<=SQ_BRACKET_L)||LA112_2==PAR_L) ) {
                        alt112=1;
                    }


                }
                else if ( ((LA112_0>=OP_DIV && LA112_0<=OP_MOD)) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:411:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
            	    {
            	    set369=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_MULTI && input.LA(1)<=OP_MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set369));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_parenExpr_in_multExpr2942);
            	    parenExpr370=parenExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr370.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:412:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );
    public final FanParser.parenExpr_return parenExpr() throws RecognitionException {
        FanParser.parenExpr_return retval = new FanParser.parenExpr_return();
        retval.start = input.LT(1);
        int parenExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.castExpr_return castExpr371 = null;

        FanParser.groupedExpr_return groupedExpr372 = null;

        FanParser.unaryExpr_return unaryExpr373 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:412:12: ( castExpr | groupedExpr | unaryExpr )
            int alt113=3;
            alt113 = dfa113.predict(input);
            switch (alt113) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:412:14: castExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_castExpr_in_parenExpr2953);
                    castExpr371=castExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpr371.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:412:25: groupedExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_groupedExpr_in_parenExpr2957);
                    groupedExpr372=groupedExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, groupedExpr372.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:412:39: unaryExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpr_in_parenExpr2961);
                    unaryExpr373=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr373.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:414:1: castExpr : {...}? parL type parR parenExpr ;
    public final FanParser.castExpr_return castExpr() throws RecognitionException {
        FanParser.castExpr_return retval = new FanParser.castExpr_return();
        retval.start = input.LT(1);
        int castExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL374 = null;

        FanParser.type_return type375 = null;

        FanParser.parR_return parR376 = null;

        FanParser.parenExpr_return parenExpr377 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:11: ({...}? parL type parR parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:13: {...}? parL type parR parenExpr
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "castExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_castExpr2972);
            parL374=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL374.getTree());
            pushFollow(FOLLOW_type_in_castExpr2974);
            type375=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type375.getTree());
            pushFollow(FOLLOW_parR_in_castExpr2976);
            parR376=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR376.getTree());
            pushFollow(FOLLOW_parenExpr_in_castExpr2978);
            parenExpr377=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr377.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:416:1: groupedExpr : parL expr parR ( termChain )* ;
    public final FanParser.groupedExpr_return groupedExpr() throws RecognitionException {
        FanParser.groupedExpr_return retval = new FanParser.groupedExpr_return();
        retval.start = input.LT(1);
        int groupedExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL378 = null;

        FanParser.expr_return expr379 = null;

        FanParser.parR_return parR380 = null;

        FanParser.termChain_return termChain381 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:14: ( parL expr parR ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:16: parL expr parR ( termChain )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parL_in_groupedExpr2987);
            parL378=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL378.getTree());
            pushFollow(FOLLOW_expr_in_groupedExpr2989);
            expr379=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr379.getTree());
            pushFollow(FOLLOW_parR_in_groupedExpr2991);
            parR380=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR380.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:31: ( termChain )*
            loop114:
            do {
                int alt114=2;
                alt114 = dfa114.predict(input);
                switch (alt114) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_groupedExpr2993);
            	    termChain381=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, termChain381.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:417:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );
    public final FanParser.unaryExpr_return unaryExpr() throws RecognitionException {
        FanParser.unaryExpr_return retval = new FanParser.unaryExpr_return();
        retval.start = input.LT(1);
        int unaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.prefixExpr_return prefixExpr382 = null;

        FanParser.postfixExpr_return postfixExpr383 = null;

        FanParser.termExpr_return termExpr384 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:12: ( prefixExpr | postfixExpr | termExpr )
            int alt115=3;
            alt115 = dfa115.predict(input);
            switch (alt115) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:417:14: prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prefixExpr_in_unaryExpr3002);
                    prefixExpr382=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr382.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:417:27: postfixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpr_in_unaryExpr3006);
                    postfixExpr383=postfixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpr383.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:417:41: termExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_termExpr_in_unaryExpr3010);
                    termExpr384=termExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr384.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:418:1: prefixExpr : ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.prefixExpr_return prefixExpr() throws RecognitionException {
        FanParser.prefixExpr_return retval = new FanParser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set385=null;
        FanParser.parenExpr_return parenExpr386 = null;


        Object set385_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:13: ( ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:15: ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set385=(Token)input.LT(1);
            if ( input.LA(1)==OP_CURRY||(input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS)||(input.LA(1)>=OP_BANG && input.LA(1)<=OP_TILDA) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set385));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_prefixExpr3046);
            parenExpr386=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr386.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:419:1: postfixExpr : termExpr ( OP_2PLUS | OP_2MINUS ) ;
    public final FanParser.postfixExpr_return postfixExpr() throws RecognitionException {
        FanParser.postfixExpr_return retval = new FanParser.postfixExpr_return();
        retval.start = input.LT(1);
        int postfixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set388=null;
        FanParser.termExpr_return termExpr387 = null;


        Object set388_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:419:14: ( termExpr ( OP_2PLUS | OP_2MINUS ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:419:16: termExpr ( OP_2PLUS | OP_2MINUS )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_termExpr_in_postfixExpr3055);
            termExpr387=termExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr387.getTree());
            set388=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_2PLUS && input.LA(1)<=OP_2MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set388));
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:420:1: termExpr : termBase ( termChain )* -> ^( AST_TERM_EXPR termBase ( termChain )* ) ;
    public final FanParser.termExpr_return termExpr() throws RecognitionException {
        FanParser.termExpr_return retval = new FanParser.termExpr_return();
        retval.start = input.LT(1);
        int termExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.termBase_return termBase389 = null;

        FanParser.termChain_return termChain390 = null;


        RewriteRuleSubtreeStream stream_termBase=new RewriteRuleSubtreeStream(adaptor,"rule termBase");
        RewriteRuleSubtreeStream stream_termChain=new RewriteRuleSubtreeStream(adaptor,"rule termChain");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:11: ( termBase ( termChain )* -> ^( AST_TERM_EXPR termBase ( termChain )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:13: termBase ( termChain )*
            {
            pushFollow(FOLLOW_termBase_in_termExpr3072);
            termBase389=termBase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_termBase.add(termBase389.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:22: ( termChain )*
            loop116:
            do {
                int alt116=2;
                alt116 = dfa116.predict(input);
                switch (alt116) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_termExpr3074);
            	    termChain390=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_termChain.add(termChain390.getTree());

            	    }
            	    break;

            	default :
            	    break loop116;
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
            // 421:4: -> ^( AST_TERM_EXPR termBase ( termChain )* )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:421:7: ^( AST_TERM_EXPR termBase ( termChain )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TERM_EXPR, "AST_TERM_EXPR"), root_1);

                adaptor.addChild(root_1, stream_termBase.nextTree());
                // src/net/colar/netbeans/fan/antlr/Fan.g:421:32: ( termChain )*
                while ( stream_termChain.hasNext() ) {
                    adaptor.addChild(root_1, stream_termChain.nextTree());

                }
                stream_termChain.reset();

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:423:1: termBase : ( idExprReq | literal | typeBase | id );
    public final FanParser.termBase_return termBase() throws RecognitionException {
        FanParser.termBase_return retval = new FanParser.termBase_return();
        retval.start = input.LT(1);
        int termBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq391 = null;

        FanParser.literal_return literal392 = null;

        FanParser.typeBase_return typeBase393 = null;

        FanParser.id_return id394 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:11: ( idExprReq | literal | typeBase | id )
            int alt117=4;
            alt117 = dfa117.predict(input);
            switch (alt117) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:423:13: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_termBase3098);
                    idExprReq391=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq391.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:423:25: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_termBase3102);
                    literal392=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal392.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:423:35: typeBase
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeBase_in_termBase3106);
                    typeBase393=typeBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeBase393.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:423:46: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_termBase3110);
                    id394=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id394.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:424:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );
    public final FanParser.typeBase_return typeBase() throws RecognitionException {
        FanParser.typeBase_return retval = new FanParser.typeBase_return();
        retval.start = input.LT(1);
        int typeBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeLiteral_return typeLiteral395 = null;

        FanParser.slotLiteral_return slotLiteral396 = null;

        FanParser.namedSuper_return namedSuper397 = null;

        FanParser.staticCall_return staticCall398 = null;

        FanParser.dsl_return dsl399 = null;

        FanParser.closure_return closure400 = null;

        FanParser.simple_return simple401 = null;

        FanParser.ctorBlock_return ctorBlock402 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:424:10: ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock )
            int alt118=8;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:424:12: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_typeBase3117);
                    typeLiteral395=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral395.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:424:26: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_typeBase3121);
                    slotLiteral396=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral396.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:424:40: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_typeBase3125);
                    namedSuper397=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper397.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:424:53: staticCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_staticCall_in_typeBase3129);
                    staticCall398=staticCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticCall398.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:425:19: dsl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dsl_in_typeBase3151);
                    dsl399=dsl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dsl399.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:425:25: closure
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_closure_in_typeBase3155);
                    closure400=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure400.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:425:35: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_typeBase3159);
                    simple401=simple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple401.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:425:44: ctorBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctorBlock_in_typeBase3163);
                    ctorBlock402=ctorBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorBlock402.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:426:1: ctorBlock : type itBlock ;
    public final FanParser.ctorBlock_return ctorBlock() throws RecognitionException {
        FanParser.ctorBlock_return retval = new FanParser.ctorBlock_return();
        retval.start = input.LT(1);
        int ctorBlock_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type403 = null;

        FanParser.itBlock_return itBlock404 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:426:11: ( type itBlock )
            // src/net/colar/netbeans/fan/antlr/Fan.g:426:13: type itBlock
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_ctorBlock3170);
            type403=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type403.getTree());
            pushFollow(FOLLOW_itBlock_in_ctorBlock3172);
            itBlock404=itBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, itBlock404.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:427:1: staticCall : type DOT idExpr -> ^( AST_STATIC_CALL ^( AST_TYPE type ) idExpr ) ;
    public final FanParser.staticCall_return staticCall() throws RecognitionException {
        FanParser.staticCall_return retval = new FanParser.staticCall_return();
        retval.start = input.LT(1);
        int staticCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT406=null;
        FanParser.type_return type405 = null;

        FanParser.idExpr_return idExpr407 = null;


        Object DOT406_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_idExpr=new RewriteRuleSubtreeStream(adaptor,"rule idExpr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:427:12: ( type DOT idExpr -> ^( AST_STATIC_CALL ^( AST_TYPE type ) idExpr ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:427:14: type DOT idExpr
            {
            pushFollow(FOLLOW_type_in_staticCall3179);
            type405=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type405.getTree());
            DOT406=(Token)match(input,DOT,FOLLOW_DOT_in_staticCall3181); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT406);

            pushFollow(FOLLOW_idExpr_in_staticCall3183);
            idExpr407=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idExpr.add(idExpr407.getTree());


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
            // 428:5: -> ^( AST_STATIC_CALL ^( AST_TYPE type ) idExpr )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:428:8: ^( AST_STATIC_CALL ^( AST_TYPE type ) idExpr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_STATIC_CALL, "AST_STATIC_CALL"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:428:26: ^( AST_TYPE type )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_TYPE, "AST_TYPE"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:430:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall );
    public final FanParser.termChain_return termChain() throws RecognitionException {
        FanParser.termChain_return retval = new FanParser.termChain_return();
        retval.start = input.LT(1);
        int termChain_StartIndex = input.index();
        Object root_0 = null;

        FanParser.dotCall_return dotCall408 = null;

        FanParser.dynCall_return dynCall409 = null;

        FanParser.safeDotCall_return safeDotCall410 = null;

        FanParser.safeDynCall_return safeDynCall411 = null;

        FanParser.indexExpr_return indexExpr412 = null;

        FanParser.callOp_return callOp413 = null;

        FanParser.itBlock_return itBlock414 = null;

        FanParser.incDotCall_return incDotCall415 = null;

        FanParser.incSafeDotCall_return incSafeDotCall416 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:12: ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall )
            int alt119=9;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:430:14: dotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotCall_in_termChain3210);
                    dotCall408=dotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotCall408.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:430:24: dynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dynCall_in_termChain3214);
                    dynCall409=dynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dynCall409.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:430:34: safeDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDotCall_in_termChain3218);
                    safeDotCall410=safeDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDotCall410.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:430:48: safeDynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDynCall_in_termChain3222);
                    safeDynCall411=safeDynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDynCall411.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:431:4: indexExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_indexExpr_in_termChain3229);
                    indexExpr412=indexExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpr412.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:431:16: callOp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_callOp_in_termChain3233);
                    callOp413=callOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callOp413.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:431:25: itBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_itBlock_in_termChain3237);
                    itBlock414=itBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itBlock414.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:431:35: incDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_incDotCall_in_termChain3241);
                    incDotCall415=incDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incDotCall415.getTree());

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:431:48: incSafeDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_incSafeDotCall_in_termChain3245);
                    incSafeDotCall416=incSafeDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incSafeDotCall416.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:432:1: dsl : simpleType DSL ;
    public final FanParser.dsl_return dsl() throws RecognitionException {
        FanParser.dsl_return retval = new FanParser.dsl_return();
        retval.start = input.LT(1);
        int dsl_StartIndex = input.index();
        Object root_0 = null;

        Token DSL418=null;
        FanParser.simpleType_return simpleType417 = null;


        Object DSL418_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:432:13: ( simpleType DSL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:432:15: simpleType DSL
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleType_in_dsl3260);
            simpleType417=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType417.getTree());
            DSL418=(Token)match(input,DSL,FOLLOW_DSL_in_dsl3262); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DSL418_tree = (Object)adaptor.create(DSL418);
            adaptor.addChild(root_0, DSL418_tree);
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

    public static class incDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:434:1: incDotCall : DOT -> ^( AST_INC_DOTCALL ) ;
    public final FanParser.incDotCall_return incDotCall() throws RecognitionException {
        FanParser.incDotCall_return retval = new FanParser.incDotCall_return();
        retval.start = input.LT(1);
        int incDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT419=null;

        Object DOT419_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:12: ( DOT -> ^( AST_INC_DOTCALL ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:14: DOT
            {
            DOT419=(Token)match(input,DOT,FOLLOW_DOT_in_incDotCall3270); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT419);



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
            // 435:5: -> ^( AST_INC_DOTCALL )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:435:8: ^( AST_INC_DOTCALL )
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
            if ( state.backtracking>0 ) { memoize(input, 115, incDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "incDotCall"

    public static class incSafeDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incSafeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:436:1: incSafeDotCall : OP_SAFE_CALL -> ^( AST_INC_SAFEDOTCALL ) ;
    public final FanParser.incSafeDotCall_return incSafeDotCall() throws RecognitionException {
        FanParser.incSafeDotCall_return retval = new FanParser.incSafeDotCall_return();
        retval.start = input.LT(1);
        int incSafeDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFE_CALL420=null;

        Object OP_SAFE_CALL420_tree=null;
        RewriteRuleTokenStream stream_OP_SAFE_CALL=new RewriteRuleTokenStream(adaptor,"token OP_SAFE_CALL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:436:15: ( OP_SAFE_CALL -> ^( AST_INC_SAFEDOTCALL ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:436:17: OP_SAFE_CALL
            {
            OP_SAFE_CALL420=(Token)match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_incSafeDotCall3286); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_SAFE_CALL.add(OP_SAFE_CALL420);



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
            // 437:5: -> ^( AST_INC_SAFEDOTCALL )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:437:8: ^( AST_INC_SAFEDOTCALL )
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
            if ( state.backtracking>0 ) { memoize(input, 116, incSafeDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "incSafeDotCall"

    public static class itBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "itBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:440:1: itBlock : bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR ;
    public final FanParser.itBlock_return itBlock() throws RecognitionException {
        FanParser.itBlock_return retval = new FanParser.itBlock_return();
        retval.start = input.LT(1);
        int itBlock_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA423=null;
        Token SP_SEMI424=null;
        FanParser.bracketL_return bracketL421 = null;

        FanParser.stmt_return stmt422 = null;

        FanParser.bracketR_return bracketR425 = null;


        Object SP_COMMA423_tree=null;
        Object SP_SEMI424_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:10: ( bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:12: bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bracketL_in_itBlock3306);
            bracketL421=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL421.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:21: ( stmt ( SP_COMMA )? ( SP_SEMI )? )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( ((LA122_0>=KW_BREAK && LA122_0<=KW_TRY)||(LA122_0>=KW_THIS && LA122_0<=KW_SUPER)||(LA122_0>=KW_NULL && LA122_0<=KW_FALSE)||LA122_0==SP_PIPE||LA122_0==OP_CURRY||(LA122_0>=OP_PLUS && LA122_0<=OP_MULTI)||(LA122_0>=OP_BANG && LA122_0<=OP_TILDA)||(LA122_0>=ID && LA122_0<=AT)||(LA122_0>=NUMBER && LA122_0<=SQ_BRACKET_L)||LA122_0==PAR_L) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:440:22: stmt ( SP_COMMA )? ( SP_SEMI )?
            	    {
            	    pushFollow(FOLLOW_stmt_in_itBlock3309);
            	    stmt422=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt422.getTree());
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:440:27: ( SP_COMMA )?
            	    int alt120=2;
            	    int LA120_0 = input.LA(1);

            	    if ( (LA120_0==SP_COMMA) ) {
            	        alt120=1;
            	    }
            	    switch (alt120) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
            	            {
            	            SP_COMMA423=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_itBlock3311); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_COMMA423_tree = (Object)adaptor.create(SP_COMMA423);
            	            adaptor.addChild(root_0, SP_COMMA423_tree);
            	            }

            	            }
            	            break;

            	    }

            	    // src/net/colar/netbeans/fan/antlr/Fan.g:440:37: ( SP_SEMI )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==SP_SEMI) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
            	            {
            	            SP_SEMI424=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_itBlock3314); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_SEMI424_tree = (Object)adaptor.create(SP_SEMI424);
            	            adaptor.addChild(root_0, SP_SEMI424_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop122;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_itBlock3319);
            bracketR425=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR425.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 117, itBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "itBlock"

    public static class dotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:441:1: dotCall : DOT idExpr -> ^( AST_DOT_CALL idExpr ) ;
    public final FanParser.dotCall_return dotCall() throws RecognitionException {
        FanParser.dotCall_return retval = new FanParser.dotCall_return();
        retval.start = input.LT(1);
        int dotCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT426=null;
        FanParser.idExpr_return idExpr427 = null;


        Object DOT426_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_idExpr=new RewriteRuleSubtreeStream(adaptor,"rule idExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:10: ( DOT idExpr -> ^( AST_DOT_CALL idExpr ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:12: DOT idExpr
            {
            DOT426=(Token)match(input,DOT,FOLLOW_DOT_in_dotCall3327); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT426);

            pushFollow(FOLLOW_idExpr_in_dotCall3329);
            idExpr427=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idExpr.add(idExpr427.getTree());


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
            // 442:5: -> ^( AST_DOT_CALL idExpr )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:442:8: ^( AST_DOT_CALL idExpr )
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
            if ( state.backtracking>0 ) { memoize(input, 118, dotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotCall"

    public static class dynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:443:1: dynCall : OP_ARROW idExpr ;
    public final FanParser.dynCall_return dynCall() throws RecognitionException {
        FanParser.dynCall_return retval = new FanParser.dynCall_return();
        retval.start = input.LT(1);
        int dynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW428=null;
        FanParser.idExpr_return idExpr429 = null;


        Object OP_ARROW428_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:10: ( OP_ARROW idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:12: OP_ARROW idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW428=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_dynCall3349); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW428_tree = (Object)adaptor.create(OP_ARROW428);
            adaptor.addChild(root_0, OP_ARROW428_tree);
            }
            pushFollow(FOLLOW_idExpr_in_dynCall3351);
            idExpr429=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr429.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 119, dynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dynCall"

    public static class safeDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:444:1: safeDotCall : OP_SAFE_CALL idExpr -> ^( AST_SAFE_DOT_CALL idExpr ) ;
    public final FanParser.safeDotCall_return safeDotCall() throws RecognitionException {
        FanParser.safeDotCall_return retval = new FanParser.safeDotCall_return();
        retval.start = input.LT(1);
        int safeDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFE_CALL430=null;
        FanParser.idExpr_return idExpr431 = null;


        Object OP_SAFE_CALL430_tree=null;
        RewriteRuleTokenStream stream_OP_SAFE_CALL=new RewriteRuleTokenStream(adaptor,"token OP_SAFE_CALL");
        RewriteRuleSubtreeStream stream_idExpr=new RewriteRuleSubtreeStream(adaptor,"rule idExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:14: ( OP_SAFE_CALL idExpr -> ^( AST_SAFE_DOT_CALL idExpr ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:16: OP_SAFE_CALL idExpr
            {
            OP_SAFE_CALL430=(Token)match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_safeDotCall3359); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OP_SAFE_CALL.add(OP_SAFE_CALL430);

            pushFollow(FOLLOW_idExpr_in_safeDotCall3361);
            idExpr431=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idExpr.add(idExpr431.getTree());


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
            // 445:5: -> ^( AST_SAFE_DOT_CALL idExpr )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:445:8: ^( AST_SAFE_DOT_CALL idExpr )
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
            if ( state.backtracking>0 ) { memoize(input, 120, safeDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDotCall"

    public static class safeDynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:446:1: safeDynCall : OP_SAFEDYN_CALL idExpr ;
    public final FanParser.safeDynCall_return safeDynCall() throws RecognitionException {
        FanParser.safeDynCall_return retval = new FanParser.safeDynCall_return();
        retval.start = input.LT(1);
        int safeDynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFEDYN_CALL432=null;
        FanParser.idExpr_return idExpr433 = null;


        Object OP_SAFEDYN_CALL432_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:446:13: ( OP_SAFEDYN_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:446:15: OP_SAFEDYN_CALL idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_SAFEDYN_CALL432=(Token)match(input,OP_SAFEDYN_CALL,FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall3380); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_SAFEDYN_CALL432_tree = (Object)adaptor.create(OP_SAFEDYN_CALL432);
            adaptor.addChild(root_0, OP_SAFEDYN_CALL432_tree);
            }
            pushFollow(FOLLOW_idExpr_in_safeDynCall3382);
            idExpr433=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr433.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 121, safeDynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDynCall"

    public static class indexExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:447:1: indexExpr : {...}? sq_bracketL expr sq_bracketR ;
    public final FanParser.indexExpr_return indexExpr() throws RecognitionException {
        FanParser.indexExpr_return retval = new FanParser.indexExpr_return();
        retval.start = input.LT(1);
        int indexExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.sq_bracketL_return sq_bracketL434 = null;

        FanParser.expr_return expr435 = null;

        FanParser.sq_bracketR_return sq_bracketR436 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:447:12: ({...}? sq_bracketL expr sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:447:14: {...}? sq_bracketL expr sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "indexExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_sq_bracketL_in_indexExpr3392);
            sq_bracketL434=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL434.getTree());
            pushFollow(FOLLOW_expr_in_indexExpr3394);
            expr435=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr435.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_indexExpr3396);
            sq_bracketR436=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR436.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 122, indexExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "indexExpr"

    public static class callOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:449:1: callOp : {...}? parL ( args )? parR ( closure )* ;
    public final FanParser.callOp_return callOp() throws RecognitionException {
        FanParser.callOp_return retval = new FanParser.callOp_return();
        retval.start = input.LT(1);
        int callOp_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL437 = null;

        FanParser.args_return args438 = null;

        FanParser.parR_return parR439 = null;

        FanParser.closure_return closure440 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:9: ({...}? parL ( args )? parR ( closure )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:11: {...}? parL ( args )? parR ( closure )*
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callOp", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callOp3407);
            parL437=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL437.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:33: ( args )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( ((LA123_0>=KW_THIS && LA123_0<=KW_SUPER)||(LA123_0>=KW_NULL && LA123_0<=KW_FALSE)||LA123_0==SP_PIPE||LA123_0==OP_CURRY||(LA123_0>=OP_PLUS && LA123_0<=OP_MULTI)||(LA123_0>=OP_BANG && LA123_0<=OP_TILDA)||(LA123_0>=ID && LA123_0<=AT)||(LA123_0>=NUMBER && LA123_0<=SQ_BRACKET_L)||LA123_0==PAR_L) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callOp3409);
                    args438=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args438.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callOp3413);
            parR439=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR439.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:45: ( closure )*
            loop124:
            do {
                int alt124=2;
                alt124 = dfa124.predict(input);
                switch (alt124) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: closure
            	    {
            	    pushFollow(FOLLOW_closure_in_callOp3415);
            	    closure440=closure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure440.getTree());

            	    }
            	    break;

            	default :
            	    break loop124;
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
            if ( state.backtracking>0 ) { memoize(input, 123, callOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callOp"

    public static class closure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "closure"
    // src/net/colar/netbeans/fan/antlr/Fan.g:450:1: closure : funcType multiStmt ;
    public final FanParser.closure_return closure() throws RecognitionException {
        FanParser.closure_return retval = new FanParser.closure_return();
        retval.start = input.LT(1);
        int closure_StartIndex = input.index();
        Object root_0 = null;

        FanParser.funcType_return funcType441 = null;

        FanParser.multiStmt_return multiStmt442 = null;



        paraphrase.push("Closure");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:451:3: ( funcType multiStmt )
            // src/net/colar/netbeans/fan/antlr/Fan.g:451:7: funcType multiStmt
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_funcType_in_closure3437);
            funcType441=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType441.getTree());
            pushFollow(FOLLOW_multiStmt_in_closure3439);
            multiStmt442=multiStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt442.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 124, closure_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "closure"

    public static class idExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:453:1: idExpr : ( idExprReq | id );
    public final FanParser.idExpr_return idExpr() throws RecognitionException {
        FanParser.idExpr_return retval = new FanParser.idExpr_return();
        retval.start = input.LT(1);
        int idExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq443 = null;

        FanParser.id_return id444 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:453:10: ( idExprReq | id )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==OP_MULTI) ) {
                alt125=1;
            }
            else if ( (LA125_0==ID) ) {
                int LA125_2 = input.LA(2);

                if ( (synpred204_Fan()) ) {
                    alt125=1;
                }
                else if ( (true) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:453:12: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_idExpr3449);
                    idExprReq443=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq443.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:453:24: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_idExpr3453);
                    id444=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id444.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 125, idExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExpr"

    public static class idExprReq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExprReq"
    // src/net/colar/netbeans/fan/antlr/Fan.g:455:1: idExprReq : ( field | call );
    public final FanParser.idExprReq_return idExprReq() throws RecognitionException {
        FanParser.idExprReq_return retval = new FanParser.idExprReq_return();
        retval.start = input.LT(1);
        int idExprReq_StartIndex = input.index();
        Object root_0 = null;

        FanParser.field_return field445 = null;

        FanParser.call_return call446 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:455:11: ( field | call )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==OP_MULTI) ) {
                alt126=1;
            }
            else if ( (LA126_0==ID) ) {
                alt126=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:455:13: field
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_field_in_idExprReq3461);
                    field445=field();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field445.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:455:21: call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_idExprReq3465);
                    call446=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call446.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 126, idExprReq_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExprReq"

    public static class field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field"
    // src/net/colar/netbeans/fan/antlr/Fan.g:457:1: field : OP_MULTI ID ;
    public final FanParser.field_return field() throws RecognitionException {
        FanParser.field_return retval = new FanParser.field_return();
        retval.start = input.LT(1);
        int field_StartIndex = input.index();
        Object root_0 = null;

        Token OP_MULTI447=null;
        Token ID448=null;

        Object OP_MULTI447_tree=null;
        Object ID448_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:457:8: ( OP_MULTI ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:457:10: OP_MULTI ID
            {
            root_0 = (Object)adaptor.nil();

            OP_MULTI447=(Token)match(input,OP_MULTI,FOLLOW_OP_MULTI_in_field3474); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_MULTI447_tree = (Object)adaptor.create(OP_MULTI447);
            adaptor.addChild(root_0, OP_MULTI447_tree);
            }
            ID448=(Token)match(input,ID,FOLLOW_ID_in_field3476); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID448_tree = (Object)adaptor.create(ID448);
            adaptor.addChild(root_0, ID448_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 127, field_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "field"

    public static class call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // src/net/colar/netbeans/fan/antlr/Fan.g:459:1: call : id ( ( callParams closure ) | callParams | closure ) -> ^( AST_CALL id ) ;
    public final FanParser.call_return call() throws RecognitionException {
        FanParser.call_return retval = new FanParser.call_return();
        retval.start = input.LT(1);
        int call_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id449 = null;

        FanParser.callParams_return callParams450 = null;

        FanParser.closure_return closure451 = null;

        FanParser.callParams_return callParams452 = null;

        FanParser.closure_return closure453 = null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_closure=new RewriteRuleSubtreeStream(adaptor,"rule closure");
        RewriteRuleSubtreeStream stream_callParams=new RewriteRuleSubtreeStream(adaptor,"rule callParams");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:459:7: ( id ( ( callParams closure ) | callParams | closure ) -> ^( AST_CALL id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:459:9: id ( ( callParams closure ) | callParams | closure )
            {
            pushFollow(FOLLOW_id_in_call3487);
            id449=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id449.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:459:12: ( ( callParams closure ) | callParams | closure )
            int alt127=3;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==PAR_L) ) {
                int LA127_1 = input.LA(2);

                if ( ((synpred206_Fan()&&(notAfterEol()))) ) {
                    alt127=1;
                }
                else if ( ((synpred207_Fan()&&(notAfterEol()))) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA127_0==SP_PIPE) ) {
                alt127=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:459:13: ( callParams closure )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:459:13: ( callParams closure )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:459:14: callParams closure
                    {
                    pushFollow(FOLLOW_callParams_in_call3491);
                    callParams450=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callParams.add(callParams450.getTree());
                    pushFollow(FOLLOW_closure_in_call3493);
                    closure451=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_closure.add(closure451.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:459:36: callParams
                    {
                    pushFollow(FOLLOW_callParams_in_call3498);
                    callParams452=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callParams.add(callParams452.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:459:49: closure
                    {
                    pushFollow(FOLLOW_closure_in_call3502);
                    closure453=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_closure.add(closure453.getTree());

                    }
                    break;

            }



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
            // 460:4: -> ^( AST_CALL id )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:460:7: ^( AST_CALL id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_CALL, "AST_CALL"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 128, call_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class callParams_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callParams"
    // src/net/colar/netbeans/fan/antlr/Fan.g:462:1: callParams : {...}? parL ( args )? parR ;
    public final FanParser.callParams_return callParams() throws RecognitionException {
        FanParser.callParams_return retval = new FanParser.callParams_return();
        retval.start = input.LT(1);
        int callParams_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL454 = null;

        FanParser.args_return args455 = null;

        FanParser.parR_return parR456 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:12: ({...}? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:14: {...}? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callParams", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callParams3524);
            parL454=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL454.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:36: ( args )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( ((LA128_0>=KW_THIS && LA128_0<=KW_SUPER)||(LA128_0>=KW_NULL && LA128_0<=KW_FALSE)||LA128_0==SP_PIPE||LA128_0==OP_CURRY||(LA128_0>=OP_PLUS && LA128_0<=OP_MULTI)||(LA128_0>=OP_BANG && LA128_0<=OP_TILDA)||(LA128_0>=ID && LA128_0<=AT)||(LA128_0>=NUMBER && LA128_0<=SQ_BRACKET_L)||LA128_0==PAR_L) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callParams3526);
                    args455=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args455.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callParams3529);
            parR456=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR456.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 129, callParams_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callParams"

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // src/net/colar/netbeans/fan/antlr/Fan.g:463:1: args : expr ( SP_COMMA expr )* ;
    public final FanParser.args_return args() throws RecognitionException {
        FanParser.args_return retval = new FanParser.args_return();
        retval.start = input.LT(1);
        int args_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA458=null;
        FanParser.expr_return expr457 = null;

        FanParser.expr_return expr459 = null;


        Object SP_COMMA458_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:463:8: ( expr ( SP_COMMA expr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:463:10: expr ( SP_COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_args3538);
            expr457=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr457.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:463:15: ( SP_COMMA expr )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==SP_COMMA) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:463:16: SP_COMMA expr
            	    {
            	    SP_COMMA458=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_args3541); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA458_tree = (Object)adaptor.create(SP_COMMA458);
            	    adaptor.addChild(root_0, SP_COMMA458_tree);
            	    }
            	    pushFollow(FOLLOW_expr_in_args3544);
            	    expr459=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr459.getTree());

            	    }
            	    break;

            	default :
            	    break loop129;
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
            if ( state.backtracking>0 ) { memoize(input, 130, args_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:465:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple );
    public final FanParser.literal_return literal() throws RecognitionException {
        FanParser.literal_return retval = new FanParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        Object root_0 = null;

        Token KW_NULL460=null;
        Token KW_THIS461=null;
        Token KW_SUPER462=null;
        Token KW_IT463=null;
        Token KW_TRUE464=null;
        Token KW_FALSE465=null;
        Token URI467=null;
        Token CHAR469=null;
        FanParser.strs_return strs466 = null;

        FanParser.number_return number468 = null;

        FanParser.namedSuper_return namedSuper470 = null;

        FanParser.slotLiteral_return slotLiteral471 = null;

        FanParser.typeLiteral_return typeLiteral472 = null;

        FanParser.list_return list473 = null;

        FanParser.map_return map474 = null;

        FanParser.symbLiteral_return symbLiteral475 = null;

        FanParser.simple_return simple476 = null;


        Object KW_NULL460_tree=null;
        Object KW_THIS461_tree=null;
        Object KW_SUPER462_tree=null;
        Object KW_IT463_tree=null;
        Object KW_TRUE464_tree=null;
        Object KW_FALSE465_tree=null;
        Object URI467_tree=null;
        Object CHAR469_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:465:10: ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple )
            int alt130=17;
            alt130 = dfa130.predict(input);
            switch (alt130) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:12: KW_NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NULL460=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_literal3555); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NULL460_tree = (Object)adaptor.create(KW_NULL460);
                    adaptor.addChild(root_0, KW_NULL460_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:22: KW_THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_THIS461=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_literal3559); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_THIS461_tree = (Object)adaptor.create(KW_THIS461);
                    adaptor.addChild(root_0, KW_THIS461_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:32: KW_SUPER
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_SUPER462=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_literal3563); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_SUPER462_tree = (Object)adaptor.create(KW_SUPER462);
                    adaptor.addChild(root_0, KW_SUPER462_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:43: KW_IT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_IT463=(Token)match(input,KW_IT,FOLLOW_KW_IT_in_literal3567); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_IT463_tree = (Object)adaptor.create(KW_IT463);
                    adaptor.addChild(root_0, KW_IT463_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:51: KW_TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_TRUE464=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_literal3571); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_TRUE464_tree = (Object)adaptor.create(KW_TRUE464);
                    adaptor.addChild(root_0, KW_TRUE464_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:61: KW_FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FALSE465=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_literal3575); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FALSE465_tree = (Object)adaptor.create(KW_FALSE465);
                    adaptor.addChild(root_0, KW_FALSE465_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:72: strs
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_strs_in_literal3579);
                    strs466=strs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, strs466.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:79: URI
                    {
                    root_0 = (Object)adaptor.nil();

                    URI467=(Token)match(input,URI,FOLLOW_URI_in_literal3583); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI467_tree = (Object)adaptor.create(URI467);
                    adaptor.addChild(root_0, URI467_tree);
                    }

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:466:4: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_literal3590);
                    number468=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number468.getTree());

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:466:13: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR469=(Token)match(input,CHAR,FOLLOW_CHAR_in_literal3594); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR469_tree = (Object)adaptor.create(CHAR469);
                    adaptor.addChild(root_0, CHAR469_tree);
                    }

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:466:20: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_literal3598);
                    namedSuper470=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper470.getTree());

                    }
                    break;
                case 12 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:467:4: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_literal3605);
                    slotLiteral471=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral471.getTree());

                    }
                    break;
                case 13 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:467:18: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_literal3609);
                    typeLiteral472=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral472.getTree());

                    }
                    break;
                case 14 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:467:32: list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_in_literal3613);
                    list473=list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list473.getTree());

                    }
                    break;
                case 15 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:467:39: map
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_in_literal3617);
                    map474=map();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map474.getTree());

                    }
                    break;
                case 16 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:467:45: symbLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_symbLiteral_in_literal3621);
                    symbLiteral475=symbLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbLiteral475.getTree());

                    }
                    break;
                case 17 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:467:59: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_literal3625);
                    simple476=simple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple476.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 131, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class strs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "strs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:468:1: strs : (qs= QUOTSTR | s= STR ) -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:7: ( (qs= QUOTSTR | s= STR ) -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:9: (qs= QUOTSTR | s= STR )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:9: (qs= QUOTSTR | s= STR )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==QUOTSTR) ) {
                alt131=1;
            }
            else if ( (LA131_0==STR) ) {
                alt131=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }
            switch (alt131) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:468:10: qs= QUOTSTR
                    {
                    qs=(Token)match(input,QUOTSTR,FOLLOW_QUOTSTR_in_strs3636); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUOTSTR.add(qs);


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:468:23: s= STR
                    {
                    s=(Token)match(input,STR,FOLLOW_STR_in_strs3642); if (state.failed) return retval; 
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
            // 469:5: -> ( ^( AST_STR $s) )? ( ^( AST_STR $qs) )?
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:469:8: ( ^( AST_STR $s) )?
                if ( stream_s.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:469:8: ^( AST_STR $s)
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_STR, "AST_STR"), root_1);

                    adaptor.addChild(root_1, stream_s.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_s.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:469:23: ( ^( AST_STR $qs) )?
                if ( stream_qs.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:469:23: ^( AST_STR $qs)
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
            if ( state.backtracking>0 ) { memoize(input, 132, strs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "strs"

    public static class typeLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:470:1: typeLiteral : type {...}? OP_POUND ;
    public final FanParser.typeLiteral_return typeLiteral() throws RecognitionException {
        FanParser.typeLiteral_return retval = new FanParser.typeLiteral_return();
        retval.start = input.LT(1);
        int typeLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND478=null;
        FanParser.type_return type477 = null;


        Object OP_POUND478_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:470:13: ( type {...}? OP_POUND )
            // src/net/colar/netbeans/fan/antlr/Fan.g:470:17: type {...}? OP_POUND
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_typeLiteral3674);
            type477=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type477.getTree());
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "typeLiteral", "notAfterEol()");
            }
            OP_POUND478=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_typeLiteral3678); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_POUND478_tree = (Object)adaptor.create(OP_POUND478);
            adaptor.addChild(root_0, OP_POUND478_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 133, typeLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeLiteral"

    public static class slotLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slotLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:471:1: slotLiteral : ( type )? OP_POUND {...}? id ;
    public final FanParser.slotLiteral_return slotLiteral() throws RecognitionException {
        FanParser.slotLiteral_return retval = new FanParser.slotLiteral_return();
        retval.start = input.LT(1);
        int slotLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND480=null;
        FanParser.type_return type479 = null;

        FanParser.id_return id481 = null;


        Object OP_POUND480_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:471:13: ( ( type )? OP_POUND {...}? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:471:17: ( type )? OP_POUND {...}? id
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:471:17: ( type )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==SP_PIPE||LA132_0==ID||LA132_0==SQ_BRACKET_L) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_slotLiteral3687);
                    type479=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type479.getTree());

                    }
                    break;

            }

            OP_POUND480=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_slotLiteral3690); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_POUND480_tree = (Object)adaptor.create(OP_POUND480);
            adaptor.addChild(root_0, OP_POUND480_tree);
            }
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "slotLiteral", "notAfterEol()");
            }
            pushFollow(FOLLOW_id_in_slotLiteral3694);
            id481=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id481.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 134, slotLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slotLiteral"

    public static class symbLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:472:1: symbLiteral : AT ( id SP_COLON SP_COLON )? id ;
    public final FanParser.symbLiteral_return symbLiteral() throws RecognitionException {
        FanParser.symbLiteral_return retval = new FanParser.symbLiteral_return();
        retval.start = input.LT(1);
        int symbLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token AT482=null;
        Token SP_COLON484=null;
        Token SP_COLON485=null;
        FanParser.id_return id483 = null;

        FanParser.id_return id486 = null;


        Object AT482_tree=null;
        Object SP_COLON484_tree=null;
        Object SP_COLON485_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:472:13: ( AT ( id SP_COLON SP_COLON )? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:472:17: AT ( id SP_COLON SP_COLON )? id
            {
            root_0 = (Object)adaptor.nil();

            AT482=(Token)match(input,AT,FOLLOW_AT_in_symbLiteral3703); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT482_tree = (Object)adaptor.create(AT482);
            adaptor.addChild(root_0, AT482_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:472:20: ( id SP_COLON SP_COLON )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==ID) ) {
                int LA133_1 = input.LA(2);

                if ( (LA133_1==SP_COLON) ) {
                    int LA133_3 = input.LA(3);

                    if ( (LA133_3==SP_COLON) ) {
                        alt133=1;
                    }
                }
            }
            switch (alt133) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:472:21: id SP_COLON SP_COLON
                    {
                    pushFollow(FOLLOW_id_in_symbLiteral3706);
                    id483=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id483.getTree());
                    SP_COLON484=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_symbLiteral3708); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLON484_tree = (Object)adaptor.create(SP_COLON484);
                    adaptor.addChild(root_0, SP_COLON484_tree);
                    }
                    SP_COLON485=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_symbLiteral3710); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLON485_tree = (Object)adaptor.create(SP_COLON485);
                    adaptor.addChild(root_0, SP_COLON485_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_symbLiteral3714);
            id486=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id486.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 135, symbLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "symbLiteral"

    public static class namedSuper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namedSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:473:1: namedSuper : simpleType DOT KW_SUPER ;
    public final FanParser.namedSuper_return namedSuper() throws RecognitionException {
        FanParser.namedSuper_return retval = new FanParser.namedSuper_return();
        retval.start = input.LT(1);
        int namedSuper_StartIndex = input.index();
        Object root_0 = null;

        Token DOT488=null;
        Token KW_SUPER489=null;
        FanParser.simpleType_return simpleType487 = null;


        Object DOT488_tree=null;
        Object KW_SUPER489_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:473:13: ( simpleType DOT KW_SUPER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:473:15: simpleType DOT KW_SUPER
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleType_in_namedSuper3722);
            simpleType487=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType487.getTree());
            DOT488=(Token)match(input,DOT,FOLLOW_DOT_in_namedSuper3724); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT488_tree = (Object)adaptor.create(DOT488);
            adaptor.addChild(root_0, DOT488_tree);
            }
            KW_SUPER489=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_namedSuper3726); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SUPER489_tree = (Object)adaptor.create(KW_SUPER489);
            adaptor.addChild(root_0, KW_SUPER489_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 136, namedSuper_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "namedSuper"

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // src/net/colar/netbeans/fan/antlr/Fan.g:474:1: list : ( type {...}?)? sq_bracketL listItems sq_bracketR ;
    public final FanParser.list_return list() throws RecognitionException {
        FanParser.list_return retval = new FanParser.list_return();
        retval.start = input.LT(1);
        int list_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type490 = null;

        FanParser.sq_bracketL_return sq_bracketL491 = null;

        FanParser.listItems_return listItems492 = null;

        FanParser.sq_bracketR_return sq_bracketR493 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:474:8: ( ( type {...}?)? sq_bracketL listItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:474:10: ( type {...}?)? sq_bracketL listItems sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:474:10: ( type {...}?)?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==SQ_BRACKET_L) ) {
                int LA134_1 = input.LA(2);

                if ( (synpred229_Fan()) ) {
                    alt134=1;
                }
            }
            else if ( (LA134_0==SP_PIPE||LA134_0==ID) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:474:11: type {...}?
                    {
                    pushFollow(FOLLOW_type_in_list3736);
                    type490=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type490.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "list", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_list3742);
            sq_bracketL491=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL491.getTree());
            pushFollow(FOLLOW_listItems_in_list3744);
            listItems492=listItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, listItems492.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_list3746);
            sq_bracketR493=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR493.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 137, list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class listItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:475:1: listItems : ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA );
    public final FanParser.listItems_return listItems() throws RecognitionException {
        FanParser.listItems_return retval = new FanParser.listItems_return();
        retval.start = input.LT(1);
        int listItems_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA495=null;
        Token SP_COMMA497=null;
        Token SP_COMMA498=null;
        FanParser.expr_return expr494 = null;

        FanParser.expr_return expr496 = null;


        Object SP_COMMA495_tree=null;
        Object SP_COMMA497_tree=null;
        Object SP_COMMA498_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:475:12: ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( ((LA137_0>=KW_THIS && LA137_0<=KW_SUPER)||(LA137_0>=KW_NULL && LA137_0<=KW_FALSE)||LA137_0==SP_PIPE||LA137_0==OP_CURRY||(LA137_0>=OP_PLUS && LA137_0<=OP_MULTI)||(LA137_0>=OP_BANG && LA137_0<=OP_TILDA)||(LA137_0>=ID && LA137_0<=AT)||(LA137_0>=NUMBER && LA137_0<=SQ_BRACKET_L)||LA137_0==PAR_L) ) {
                alt137=1;
            }
            else if ( (LA137_0==SP_COMMA) ) {
                alt137=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:15: expr ( SP_COMMA expr )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_listItems3755);
                    expr494=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr494.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:20: ( SP_COMMA expr )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==SP_COMMA) ) {
                            int LA135_1 = input.LA(2);

                            if ( ((LA135_1>=KW_THIS && LA135_1<=KW_SUPER)||(LA135_1>=KW_NULL && LA135_1<=KW_FALSE)||LA135_1==SP_PIPE||LA135_1==OP_CURRY||(LA135_1>=OP_PLUS && LA135_1<=OP_MULTI)||(LA135_1>=OP_BANG && LA135_1<=OP_TILDA)||(LA135_1>=ID && LA135_1<=AT)||(LA135_1>=NUMBER && LA135_1<=SQ_BRACKET_L)||LA135_1==PAR_L) ) {
                                alt135=1;
                            }


                        }


                        switch (alt135) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:475:21: SP_COMMA expr
                    	    {
                    	    SP_COMMA495=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3758); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA495_tree = (Object)adaptor.create(SP_COMMA495);
                    	    adaptor.addChild(root_0, SP_COMMA495_tree);
                    	    }
                    	    pushFollow(FOLLOW_expr_in_listItems3760);
                    	    expr496=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr496.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:38: ( SP_COMMA )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==SP_COMMA) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA497=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3765); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SP_COMMA497_tree = (Object)adaptor.create(SP_COMMA497);
                            adaptor.addChild(root_0, SP_COMMA497_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:51: SP_COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COMMA498=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3771); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COMMA498_tree = (Object)adaptor.create(SP_COMMA498);
                    adaptor.addChild(root_0, SP_COMMA498_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 138, listItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listItems"

    public static class map_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map"
    // src/net/colar/netbeans/fan/antlr/Fan.g:476:1: map : ( mapType {...}?)? sq_bracketL mapItems sq_bracketR ;
    public final FanParser.map_return map() throws RecognitionException {
        FanParser.map_return retval = new FanParser.map_return();
        retval.start = input.LT(1);
        int map_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mapType_return mapType499 = null;

        FanParser.sq_bracketL_return sq_bracketL500 = null;

        FanParser.mapItems_return mapItems501 = null;

        FanParser.sq_bracketR_return sq_bracketR502 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:7: ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:9: ( mapType {...}?)? sq_bracketL mapItems sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:476:9: ( mapType {...}?)?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==SQ_BRACKET_L) ) {
                int LA138_1 = input.LA(2);

                if ( (synpred233_Fan()) ) {
                    alt138=1;
                }
            }
            else if ( (LA138_0==SP_PIPE||LA138_0==ID) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:476:10: mapType {...}?
                    {
                    pushFollow(FOLLOW_mapType_in_map3781);
                    mapType499=mapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapType499.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "map", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_map3787);
            sq_bracketL500=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL500.getTree());
            pushFollow(FOLLOW_mapItems_in_map3789);
            mapItems501=mapItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mapItems501.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_map3791);
            sq_bracketR502=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR502.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 139, map_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "map"

    public static class mapItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:477:1: mapItems : ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON );
    public final FanParser.mapItems_return mapItems() throws RecognitionException {
        FanParser.mapItems_return retval = new FanParser.mapItems_return();
        retval.start = input.LT(1);
        int mapItems_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA504=null;
        Token SP_COMMA506=null;
        Token SP_COLON507=null;
        FanParser.mapPair_return mapPair503 = null;

        FanParser.mapPair_return mapPair505 = null;


        Object SP_COMMA504_tree=null;
        Object SP_COMMA506_tree=null;
        Object SP_COLON507_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:477:11: ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( ((LA141_0>=KW_THIS && LA141_0<=KW_SUPER)||(LA141_0>=KW_NULL && LA141_0<=KW_FALSE)||LA141_0==SP_PIPE||LA141_0==OP_CURRY||(LA141_0>=OP_PLUS && LA141_0<=OP_MULTI)||(LA141_0>=OP_BANG && LA141_0<=OP_TILDA)||(LA141_0>=ID && LA141_0<=AT)||(LA141_0>=NUMBER && LA141_0<=SQ_BRACKET_L)||LA141_0==PAR_L) ) {
                alt141=1;
            }
            else if ( (LA141_0==SP_COLON) ) {
                alt141=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:477:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:477:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:477:14: mapPair ( SP_COMMA mapPair )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_mapPair_in_mapItems3800);
                    mapPair503=mapPair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair503.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:477:22: ( SP_COMMA mapPair )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==SP_COMMA) ) {
                            int LA139_1 = input.LA(2);

                            if ( ((LA139_1>=KW_THIS && LA139_1<=KW_SUPER)||(LA139_1>=KW_NULL && LA139_1<=KW_FALSE)||LA139_1==SP_PIPE||LA139_1==OP_CURRY||(LA139_1>=OP_PLUS && LA139_1<=OP_MULTI)||(LA139_1>=OP_BANG && LA139_1<=OP_TILDA)||(LA139_1>=ID && LA139_1<=AT)||(LA139_1>=NUMBER && LA139_1<=SQ_BRACKET_L)||LA139_1==PAR_L) ) {
                                alt139=1;
                            }


                        }


                        switch (alt139) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:477:23: SP_COMMA mapPair
                    	    {
                    	    SP_COMMA504=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems3803); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA504_tree = (Object)adaptor.create(SP_COMMA504);
                    	    adaptor.addChild(root_0, SP_COMMA504_tree);
                    	    }
                    	    pushFollow(FOLLOW_mapPair_in_mapItems3805);
                    	    mapPair505=mapPair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair505.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:477:42: ( SP_COMMA )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==SP_COMMA) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA506=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems3809); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SP_COMMA506_tree = (Object)adaptor.create(SP_COMMA506);
                            adaptor.addChild(root_0, SP_COMMA506_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:477:55: SP_COLON
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COLON507=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapItems3815); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLON507_tree = (Object)adaptor.create(SP_COLON507);
                    adaptor.addChild(root_0, SP_COLON507_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 140, mapItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapItems"

    public static class mapPair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapPair"
    // src/net/colar/netbeans/fan/antlr/Fan.g:478:1: mapPair : expr SP_COLON expr ;
    public final FanParser.mapPair_return mapPair() throws RecognitionException {
        FanParser.mapPair_return retval = new FanParser.mapPair_return();
        retval.start = input.LT(1);
        int mapPair_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON509=null;
        FanParser.expr_return expr508 = null;

        FanParser.expr_return expr510 = null;


        Object SP_COLON509_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:478:10: ( expr SP_COLON expr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:478:12: expr SP_COLON expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_mapPair3823);
            expr508=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr508.getTree());
            SP_COLON509=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapPair3825); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON509_tree = (Object)adaptor.create(SP_COLON509);
            adaptor.addChild(root_0, SP_COLON509_tree);
            }
            pushFollow(FOLLOW_expr_in_mapPair3827);
            expr510=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr510.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 141, mapPair_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapPair"

    public static class simple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple"
    // src/net/colar/netbeans/fan/antlr/Fan.g:479:1: simple : type parL expr parR ;
    public final FanParser.simple_return simple() throws RecognitionException {
        FanParser.simple_return retval = new FanParser.simple_return();
        retval.start = input.LT(1);
        int simple_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type511 = null;

        FanParser.parL_return parL512 = null;

        FanParser.expr_return expr513 = null;

        FanParser.parR_return parR514 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:9: ( type parL expr parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:11: type parL expr parR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_simple3835);
            type511=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type511.getTree());
            pushFollow(FOLLOW_parL_in_simple3837);
            parL512=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL512.getTree());
            pushFollow(FOLLOW_expr_in_simple3839);
            expr513=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr513.getTree());
            pushFollow(FOLLOW_parR_in_simple3841);
            parR514=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR514.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 142, simple_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simple"

    public static class docs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "docs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:481:1: docs : d= ( ( DOC )* ) -> ^( AST_DOCS ( $d)? ) ;
    public final FanParser.docs_return docs() throws RecognitionException {
        FanParser.docs_return retval = new FanParser.docs_return();
        retval.start = input.LT(1);
        int docs_StartIndex = input.index();
        Object root_0 = null;

        Token d=null;
        Token DOC515=null;

        Object d_tree=null;
        Object DOC515_tree=null;
        RewriteRuleTokenStream stream_DOC=new RewriteRuleTokenStream(adaptor,"token DOC");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:481:7: (d= ( ( DOC )* ) -> ^( AST_DOCS ( $d)? ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:481:9: d= ( ( DOC )* )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:481:11: ( ( DOC )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:481:12: ( DOC )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:481:12: ( DOC )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==DOC) ) {
                    int LA142_2 = input.LA(2);

                    if ( (synpred237_Fan()) ) {
                        alt142=1;
                    }


                }


                switch (alt142) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: DOC
            	    {
            	    DOC515=(Token)match(input,DOC,FOLLOW_DOC_in_docs3853); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOC.add(DOC515);


            	    }
            	    break;

            	default :
            	    break loop142;
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
            // 481:18: -> ^( AST_DOCS ( $d)? )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:481:21: ^( AST_DOCS ( $d)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_DOCS, "AST_DOCS"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:481:32: ( $d)?
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
            if ( state.backtracking>0 ) { memoize(input, 143, docs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "docs"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // src/net/colar/netbeans/fan/antlr/Fan.g:483:1: number : ( OP_MINUS )? NUMBER ;
    public final FanParser.number_return number() throws RecognitionException {
        FanParser.number_return retval = new FanParser.number_return();
        retval.start = input.LT(1);
        int number_StartIndex = input.index();
        Object root_0 = null;

        Token OP_MINUS516=null;
        Token NUMBER517=null;

        Object OP_MINUS516_tree=null;
        Object NUMBER517_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:483:9: ( ( OP_MINUS )? NUMBER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:483:12: ( OP_MINUS )? NUMBER
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:483:12: ( OP_MINUS )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==OP_MINUS) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: OP_MINUS
                    {
                    OP_MINUS516=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_number3875); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_MINUS516_tree = (Object)adaptor.create(OP_MINUS516);
                    adaptor.addChild(root_0, OP_MINUS516_tree);
                    }

                    }
                    break;

            }

            NUMBER517=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_number3878); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER517_tree = (Object)adaptor.create(NUMBER517);
            adaptor.addChild(root_0, NUMBER517_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 144, number_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class facet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "facet"
    // src/net/colar/netbeans/fan/antlr/Fan.g:484:1: facet : AT id ( AS_EQUAL expr )? ;
    public final FanParser.facet_return facet() throws RecognitionException {
        FanParser.facet_return retval = new FanParser.facet_return();
        retval.start = input.LT(1);
        int facet_StartIndex = input.index();
        Object root_0 = null;

        Token AT518=null;
        Token AS_EQUAL520=null;
        FanParser.id_return id519 = null;

        FanParser.expr_return expr521 = null;


        Object AT518_tree=null;
        Object AS_EQUAL520_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:484:8: ( AT id ( AS_EQUAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:484:10: AT id ( AS_EQUAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            AT518=(Token)match(input,AT,FOLLOW_AT_in_facet3886); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT518_tree = (Object)adaptor.create(AT518);
            adaptor.addChild(root_0, AT518_tree);
            }
            pushFollow(FOLLOW_id_in_facet3888);
            id519=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id519.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:484:16: ( AS_EQUAL expr )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==AS_EQUAL) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:484:17: AS_EQUAL expr
                    {
                    AS_EQUAL520=(Token)match(input,AS_EQUAL,FOLLOW_AS_EQUAL_in_facet3891); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_EQUAL520_tree = (Object)adaptor.create(AS_EQUAL520);
                    adaptor.addChild(root_0, AS_EQUAL520_tree);
                    }
                    pushFollow(FOLLOW_expr_in_facet3893);
                    expr521=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr521.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 145, facet_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "facet"

    public static class eos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eos"
    // src/net/colar/netbeans/fan/antlr/Fan.g:487:1: eos : ( SP_SEMI | {...}?);
    public final FanParser.eos_return eos() throws RecognitionException {
        FanParser.eos_return retval = new FanParser.eos_return();
        retval.start = input.LT(1);
        int eos_StartIndex = input.index();
        Object root_0 = null;

        Token SP_SEMI522=null;

        Object SP_SEMI522_tree=null;

        paraphrase.push("Semicolumn or LineBreak");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:489:3: ( SP_SEMI | {...}?)
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==SP_SEMI) ) {
                int LA145_1 = input.LA(2);

                if ( (synpred240_Fan()) ) {
                    alt145=1;
                }
                else if ( ((lookupNL())) ) {
                    alt145=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA145_0==EOF||(LA145_0>=KW_BREAK && LA145_0<=KW_USING)||(LA145_0>=KW_RD_ONLY && LA145_0<=KW_FINAL)||(LA145_0>=KW_CLASS && LA145_0<=KW_ELSE)||(LA145_0>=KW_NULL && LA145_0<=KW_FALSE)||LA145_0==BRACKET_R||LA145_0==SP_COMMA||LA145_0==SP_PIPE||LA145_0==OP_CURRY||(LA145_0>=OP_PLUS && LA145_0<=OP_MULTI)||(LA145_0>=OP_BANG && LA145_0<=OP_TILDA)||(LA145_0>=ID && LA145_0<=SQ_BRACKET_L)||LA145_0==PAR_L) ) {
                alt145=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:489:5: SP_SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_SEMI522=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_eos3915); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_SEMI522_tree = (Object)adaptor.create(SP_SEMI522);
                    adaptor.addChild(root_0, SP_SEMI522_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:489:15: {...}?
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
            if ( state.backtracking>0 ) { memoize(input, 146, eos_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "eos"

    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // src/net/colar/netbeans/fan/antlr/Fan.g:491:1: id : ID ;
    public final FanParser.id_return id() throws RecognitionException {
        FanParser.id_return retval = new FanParser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token ID523=null;

        Object ID523_tree=null;

        paraphrase.push("Identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:493:3: ( ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:493:6: ID
            {
            root_0 = (Object)adaptor.nil();

            ID523=(Token)match(input,ID,FOLLOW_ID_in_id3939); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID523_tree = (Object)adaptor.create(ID523);
            adaptor.addChild(root_0, ID523_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 147, id_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "id"

    public static class getter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:499:1: getter : t= ID {...}?;
    public final FanParser.getter_return getter() throws RecognitionException {
        FanParser.getter_return retval = new FanParser.getter_return();
        retval.start = input.LT(1);
        int getter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:499:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:499:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_getter3952); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 148, getter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "getter"

    public static class setter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:500:1: setter : t= ID {...}?;
    public final FanParser.setter_return setter() throws RecognitionException {
        FanParser.setter_return retval = new FanParser.setter_return();
        retval.start = input.LT(1);
        int setter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:500:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:500:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_setter3965); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 149, setter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "setter"

    public static class pod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pod"
    // src/net/colar/netbeans/fan/antlr/Fan.g:501:1: pod : t= ID {...}?;
    public final FanParser.pod_return pod() throws RecognitionException {
        FanParser.pod_return retval = new FanParser.pod_return();
        retval.start = input.LT(1);
        int pod_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:501:8: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:501:10: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_pod3979); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 150, pod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pod"

    public static class bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:504:1: bracketL : BRACKET_L ;
    public final FanParser.bracketL_return bracketL() throws RecognitionException {
        FanParser.bracketL_return retval = new FanParser.bracketL_return();
        retval.start = input.LT(1);
        int bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_L524=null;

        Object BRACKET_L524_tree=null;

        paraphrase.push("{");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 151) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:506:3: ( BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:506:5: BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_L524=(Token)match(input,BRACKET_L,FOLLOW_BRACKET_L_in_bracketL4001); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_L524_tree = (Object)adaptor.create(BRACKET_L524);
            adaptor.addChild(root_0, BRACKET_L524_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 151, bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketL"

    public static class bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:507:1: bracketR : BRACKET_R ;
    public final FanParser.bracketR_return bracketR() throws RecognitionException {
        FanParser.bracketR_return retval = new FanParser.bracketR_return();
        retval.start = input.LT(1);
        int bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_R525=null;

        Object BRACKET_R525_tree=null;

        paraphrase.push("}");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 152) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:509:3: ( BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:509:5: BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_R525=(Token)match(input,BRACKET_R,FOLLOW_BRACKET_R_in_bracketR4019); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_R525_tree = (Object)adaptor.create(BRACKET_R525);
            adaptor.addChild(root_0, BRACKET_R525_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 152, bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketR"

    public static class sq_bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:510:1: sq_bracketL : SQ_BRACKET_L ;
    public final FanParser.sq_bracketL_return sq_bracketL() throws RecognitionException {
        FanParser.sq_bracketL_return retval = new FanParser.sq_bracketL_return();
        retval.start = input.LT(1);
        int sq_bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_L526=null;

        Object SQ_BRACKET_L526_tree=null;

        paraphrase.push("[");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 153) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:512:3: ( SQ_BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:512:5: SQ_BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_L526=(Token)match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_sq_bracketL4037); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQ_BRACKET_L526_tree = (Object)adaptor.create(SQ_BRACKET_L526);
            adaptor.addChild(root_0, SQ_BRACKET_L526_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 153, sq_bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketL"

    public static class sq_bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:513:1: sq_bracketR : SQ_BRACKET_R ;
    public final FanParser.sq_bracketR_return sq_bracketR() throws RecognitionException {
        FanParser.sq_bracketR_return retval = new FanParser.sq_bracketR_return();
        retval.start = input.LT(1);
        int sq_bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_R527=null;

        Object SQ_BRACKET_R527_tree=null;

        paraphrase.push("]");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 154) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:515:3: ( SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:515:5: SQ_BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_R527=(Token)match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_sq_bracketR4055); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQ_BRACKET_R527_tree = (Object)adaptor.create(SQ_BRACKET_R527);
            adaptor.addChild(root_0, SQ_BRACKET_R527_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 154, sq_bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketR"

    public static class parL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:516:1: parL : PAR_L ;
    public final FanParser.parL_return parL() throws RecognitionException {
        FanParser.parL_return retval = new FanParser.parL_return();
        retval.start = input.LT(1);
        int parL_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_L528=null;

        Object PAR_L528_tree=null;

        paraphrase.push("(");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 155) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:518:3: ( PAR_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:518:5: PAR_L
            {
            root_0 = (Object)adaptor.nil();

            PAR_L528=(Token)match(input,PAR_L,FOLLOW_PAR_L_in_parL4073); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAR_L528_tree = (Object)adaptor.create(PAR_L528);
            adaptor.addChild(root_0, PAR_L528_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 155, parL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parL"

    public static class parR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:519:1: parR : PAR_R ;
    public final FanParser.parR_return parR() throws RecognitionException {
        FanParser.parR_return retval = new FanParser.parR_return();
        retval.start = input.LT(1);
        int parR_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_R529=null;

        Object PAR_R529_tree=null;

        paraphrase.push(")");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 156) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:521:3: ( PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:521:5: PAR_R
            {
            root_0 = (Object)adaptor.nil();

            PAR_R529=(Token)match(input,PAR_R,FOLLOW_PAR_R_in_parR4091); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAR_R529_tree = (Object)adaptor.create(PAR_R529);
            adaptor.addChild(root_0, PAR_R529_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 156, parR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parR"

    // $ANTLR start synpred2_Fan
    public final void synpred2_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:243:19: ( podDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:243:19: podDef
        {
        pushFollow(FOLLOW_podDef_in_synpred2_Fan441);
        podDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Fan

    // $ANTLR start synpred13_Fan
    public final void synpred13_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:264:17: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:264:17: facet
        {
        pushFollow(FOLLOW_facet_in_synpred13_Fan686);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_Fan

    // $ANTLR start synpred15_Fan
    public final void synpred15_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:264:25: ( ( classFlags )* KW_CLASS )
        // src/net/colar/netbeans/fan/antlr/Fan.g:264:26: ( classFlags )* KW_CLASS
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:264:26: ( classFlags )*
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
        	    pushFollow(FOLLOW_classFlags_in_synpred15_Fan691);
        	    classFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop146;
            }
        } while (true);

        match(input,KW_CLASS,FOLLOW_KW_CLASS_in_synpred15_Fan694); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Fan

    // $ANTLR start synpred17_Fan
    public final void synpred17_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:265:4: ( ( protection )? KW_ENUM )
        // src/net/colar/netbeans/fan/antlr/Fan.g:265:5: ( protection )? KW_ENUM
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:265:5: ( protection )?
        int alt147=2;
        int LA147_0 = input.LA(1);

        if ( ((LA147_0>=KW_PRIVATE && LA147_0<=KW_INTERNAL)) ) {
            alt147=1;
        }
        switch (alt147) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                {
                pushFollow(FOLLOW_protection_in_synpred17_Fan705);
                protection();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,KW_ENUM,FOLLOW_KW_ENUM_in_synpred17_Fan708); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_Fan

    // $ANTLR start synpred44_Fan
    public final void synpred44_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:293:28: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:293:28: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred44_Fan1219); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_Fan

    // $ANTLR start synpred45_Fan
    public final void synpred45_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:293:49: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:293:49: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred45_Fan1225); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_Fan

    // $ANTLR start synpred46_Fan
    public final void synpred46_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:293:39: ( LIST_TYPE ( SP_QMARK )? )
        // src/net/colar/netbeans/fan/antlr/Fan.g:293:39: LIST_TYPE ( SP_QMARK )?
        {
        match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_synpred46_Fan1223); if (state.failed) return ;
        // src/net/colar/netbeans/fan/antlr/Fan.g:293:49: ( SP_QMARK )?
        int alt149=2;
        int LA149_0 = input.LA(1);

        if ( (LA149_0==SP_QMARK) ) {
            alt149=1;
        }
        switch (alt149) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                {
                match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred46_Fan1225); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred46_Fan

    // $ANTLR start synpred48_Fan
    public final void synpred48_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:295:12: ( mapType )
        // src/net/colar/netbeans/fan/antlr/Fan.g:295:12: mapType
        {
        pushFollow(FOLLOW_mapType_in_synpred48_Fan1247);
        mapType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Fan

    // $ANTLR start synpred54_Fan
    public final void synpred54_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:299:6: ({...}? SP_COLON {...}? type )
        // src/net/colar/netbeans/fan/antlr/Fan.g:299:6: {...}? SP_COLON {...}? type
        {
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred54_Fan", "notAfterEol()");
        }
        match(input,SP_COLON,FOLLOW_SP_COLON_in_synpred54_Fan1304); if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred54_Fan", "notAfterEol()");
        }
        pushFollow(FOLLOW_type_in_synpred54_Fan1308);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_Fan

    // $ANTLR start synpred55_Fan
    public final void synpred55_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:299:56: ( sq_bracketR )
        // src/net/colar/netbeans/fan/antlr/Fan.g:299:56: sq_bracketR
        {
        pushFollow(FOLLOW_sq_bracketR_in_synpred55_Fan1312);
        sq_bracketR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_Fan

    // $ANTLR start synpred57_Fan
    public final void synpred57_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:300:43: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:300:44: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred57_Fan1333); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_Fan

    // $ANTLR start synpred59_Fan
    public final void synpred59_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:300:74: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:300:75: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred59_Fan1345); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_Fan

    // $ANTLR start synpred61_Fan
    public final void synpred61_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:303:11: ( formalFull )
        // src/net/colar/netbeans/fan/antlr/Fan.g:303:11: formalFull
        {
        pushFollow(FOLLOW_formalFull_in_synpred61_Fan1386);
        formalFull();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_Fan

    // $ANTLR start synpred62_Fan
    public final void synpred62_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:303:24: ( formalTypeOnly )
        // src/net/colar/netbeans/fan/antlr/Fan.g:303:24: formalTypeOnly
        {
        pushFollow(FOLLOW_formalTypeOnly_in_synpred62_Fan1390);
        formalTypeOnly();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_Fan

    // $ANTLR start synpred63_Fan
    public final void synpred63_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:307:13: ( KW_STATIC bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:307:14: KW_STATIC bracketL
        {
        match(input,KW_STATIC,FOLLOW_KW_STATIC_in_synpred63_Fan1438); if (state.failed) return ;
        pushFollow(FOLLOW_bracketL_in_synpred63_Fan1440);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_Fan

    // $ANTLR start synpred64_Fan
    public final void synpred64_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:308:11: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:308:11: facet
        {
        pushFollow(FOLLOW_facet_in_synpred64_Fan1454);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_Fan

    // $ANTLR start synpred66_Fan
    public final void synpred66_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:310:7: ( ( ctorFlags )* KW_NEW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:310:8: ( ctorFlags )* KW_NEW
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:310:8: ( ctorFlags )*
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
        	    pushFollow(FOLLOW_ctorFlags_in_synpred66_Fan1471);
        	    ctorFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop152;
            }
        } while (true);

        match(input,KW_NEW,FOLLOW_KW_NEW_in_synpred66_Fan1474); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_Fan

    // $ANTLR start synpred69_Fan
    public final void synpred69_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:311:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:311:8: ( methodFlags )* ( type | KW_VOID ) id parL
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:311:8: ( methodFlags )*
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
        	    pushFollow(FOLLOW_methodFlags_in_synpred69_Fan1488);
        	    methodFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop153;
            }
        } while (true);

        // src/net/colar/netbeans/fan/antlr/Fan.g:311:21: ( type | KW_VOID )
        int alt154=2;
        int LA154_0 = input.LA(1);

        if ( (LA154_0==SP_PIPE||LA154_0==ID||LA154_0==SQ_BRACKET_L) ) {
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
                // src/net/colar/netbeans/fan/antlr/Fan.g:311:22: type
                {
                pushFollow(FOLLOW_type_in_synpred69_Fan1492);
                type();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:311:29: KW_VOID
                {
                match(input,KW_VOID,FOLLOW_KW_VOID_in_synpred69_Fan1496); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_id_in_synpred69_Fan1499);
        id();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_parL_in_synpred69_Fan1501);
        parL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Fan

    // $ANTLR start synpred73_Fan
    public final void synpred73_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:319:29: ( getter )
        // src/net/colar/netbeans/fan/antlr/Fan.g:319:29: getter
        {
        pushFollow(FOLLOW_getter_in_synpred73_Fan1586);
        getter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_Fan

    // $ANTLR start synpred75_Fan
    public final void synpred75_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:319:55: ( block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:319:55: block
        {
        pushFollow(FOLLOW_block_in_synpred75_Fan1596);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_Fan

    // $ANTLR start synpred78_Fan
    public final void synpred78_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:322:12: ( type id )
        // src/net/colar/netbeans/fan/antlr/Fan.g:322:13: type id
        {
        pushFollow(FOLLOW_type_in_synpred78_Fan1643);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_id_in_synpred78_Fan1645);
        id();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred78_Fan

    // $ANTLR start synpred101_Fan
    public final void synpred101_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:15: ( multiStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:16: multiStmt
        {
        pushFollow(FOLLOW_multiStmt_in_synpred101_Fan1922);
        multiStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_Fan

    // $ANTLR start synpred110_Fan
    public final void synpred110_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:347:6: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:347:7: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred110_Fan2122);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_Fan

    // $ANTLR start synpred121_Fan
    public final void synpred121_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:353:22: ( exprStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:353:22: exprStmt
        {
        pushFollow(FOLLOW_exprStmt_in_synpred121_Fan2219);
        exprStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred121_Fan

    // $ANTLR start synpred122_Fan
    public final void synpred122_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:355:15: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:355:15: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred122_Fan2236);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred122_Fan

    // $ANTLR start synpred126_Fan
    public final void synpred126_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:365:6: ( KW_ELSE block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:365:6: KW_ELSE block
        {
        match(input,KW_ELSE,FOLLOW_KW_ELSE_in_synpred126_Fan2320); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred126_Fan2322);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred126_Fan

    // $ANTLR start synpred127_Fan
    public final void synpred127_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:366:23: ( eos )
        // src/net/colar/netbeans/fan/antlr/Fan.g:366:23: eos
        {
        pushFollow(FOLLOW_eos_in_synpred127_Fan2334);
        eos();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred127_Fan

    // $ANTLR start synpred130_Fan
    public final void synpred130_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:370:18: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:370:19: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred130_Fan2408);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_Fan

    // $ANTLR start synpred131_Fan
    public final void synpred131_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:370:52: ( KW_CATCH )
        // src/net/colar/netbeans/fan/antlr/Fan.g:370:53: KW_CATCH
        {
        match(input,KW_CATCH,FOLLOW_KW_CATCH_in_synpred131_Fan2420); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred131_Fan

    // $ANTLR start synpred132_Fan
    public final void synpred132_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:370:75: ( KW_FINALLY )
        // src/net/colar/netbeans/fan/antlr/Fan.g:370:76: KW_FINALLY
        {
        match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_synpred132_Fan2429); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred132_Fan

    // $ANTLR start synpred134_Fan
    public final void synpred134_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:374:12: ( forInitDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:374:12: forInitDef
        {
        pushFollow(FOLLOW_forInitDef_in_synpred134_Fan2474);
        forInitDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred134_Fan

    // $ANTLR start synpred136_Fan
    public final void synpred136_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:377:21: ( catchDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:377:21: catchDef
        {
        pushFollow(FOLLOW_catchDef_in_synpred136_Fan2503);
        catchDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_Fan

    // $ANTLR start synpred137_Fan
    public final void synpred137_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:377:32: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:377:33: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred137_Fan2508);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_Fan

    // $ANTLR start synpred138_Fan
    public final void synpred138_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:381:25: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:381:26: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred138_Fan2549);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred138_Fan

    // $ANTLR start synpred158_Fan
    public final void synpred158_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:406:26: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:406:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
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

        pushFollow(FOLLOW_bitAndExpr_in_synpred158_Fan2840);
        bitAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred158_Fan

    // $ANTLR start synpred159_Fan
    public final void synpred159_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:407:26: ( OP_CURRY shiftExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:407:26: OP_CURRY shiftExpr
        {
        match(input,OP_CURRY,FOLLOW_OP_CURRY_in_synpred159_Fan2854); if (state.failed) return ;
        pushFollow(FOLLOW_shiftExpr_in_synpred159_Fan2856);
        shiftExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred159_Fan

    // $ANTLR start synpred163_Fan
    public final void synpred163_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:409:22: ( ( OP_PLUS | OP_MINUS ) multExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:409:22: ( OP_PLUS | OP_MINUS ) multExpr
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

        pushFollow(FOLLOW_multExpr_in_synpred163_Fan2901);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred163_Fan

    // $ANTLR start synpred167_Fan
    public final void synpred167_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:411:24: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:411:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
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

        pushFollow(FOLLOW_parenExpr_in_synpred167_Fan2942);
        parenExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred167_Fan

    // $ANTLR start synpred168_Fan
    public final void synpred168_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:412:14: ( castExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:412:14: castExpr
        {
        pushFollow(FOLLOW_castExpr_in_synpred168_Fan2953);
        castExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred168_Fan

    // $ANTLR start synpred169_Fan
    public final void synpred169_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:412:25: ( groupedExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:412:25: groupedExpr
        {
        pushFollow(FOLLOW_groupedExpr_in_synpred169_Fan2957);
        groupedExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred169_Fan

    // $ANTLR start synpred170_Fan
    public final void synpred170_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:416:31: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:416:31: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred170_Fan2993);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred170_Fan

    // $ANTLR start synpred171_Fan
    public final void synpred171_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:417:14: ( prefixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:417:14: prefixExpr
        {
        pushFollow(FOLLOW_prefixExpr_in_synpred171_Fan3002);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred171_Fan

    // $ANTLR start synpred172_Fan
    public final void synpred172_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:417:27: ( postfixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:417:27: postfixExpr
        {
        pushFollow(FOLLOW_postfixExpr_in_synpred172_Fan3006);
        postfixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred172_Fan

    // $ANTLR start synpred180_Fan
    public final void synpred180_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:420:22: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:420:22: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred180_Fan3074);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred180_Fan

    // $ANTLR start synpred181_Fan
    public final void synpred181_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:423:13: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:423:13: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred181_Fan3098);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred181_Fan

    // $ANTLR start synpred182_Fan
    public final void synpred182_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:423:25: ( literal )
        // src/net/colar/netbeans/fan/antlr/Fan.g:423:25: literal
        {
        pushFollow(FOLLOW_literal_in_synpred182_Fan3102);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred182_Fan

    // $ANTLR start synpred183_Fan
    public final void synpred183_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:423:35: ( typeBase )
        // src/net/colar/netbeans/fan/antlr/Fan.g:423:35: typeBase
        {
        pushFollow(FOLLOW_typeBase_in_synpred183_Fan3106);
        typeBase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred183_Fan

    // $ANTLR start synpred184_Fan
    public final void synpred184_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:424:12: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:424:12: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred184_Fan3117);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred184_Fan

    // $ANTLR start synpred185_Fan
    public final void synpred185_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:424:26: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:424:26: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred185_Fan3121);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred185_Fan

    // $ANTLR start synpred186_Fan
    public final void synpred186_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:424:40: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:424:40: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred186_Fan3125);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred186_Fan

    // $ANTLR start synpred187_Fan
    public final void synpred187_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:424:53: ( staticCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:424:53: staticCall
        {
        pushFollow(FOLLOW_staticCall_in_synpred187_Fan3129);
        staticCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred187_Fan

    // $ANTLR start synpred188_Fan
    public final void synpred188_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:425:19: ( dsl )
        // src/net/colar/netbeans/fan/antlr/Fan.g:425:19: dsl
        {
        pushFollow(FOLLOW_dsl_in_synpred188_Fan3151);
        dsl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred188_Fan

    // $ANTLR start synpred189_Fan
    public final void synpred189_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:425:25: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:425:25: closure
        {
        pushFollow(FOLLOW_closure_in_synpred189_Fan3155);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred189_Fan

    // $ANTLR start synpred190_Fan
    public final void synpred190_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:425:35: ( simple )
        // src/net/colar/netbeans/fan/antlr/Fan.g:425:35: simple
        {
        pushFollow(FOLLOW_simple_in_synpred190_Fan3159);
        simple();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred190_Fan

    // $ANTLR start synpred191_Fan
    public final void synpred191_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:430:14: ( dotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:430:14: dotCall
        {
        pushFollow(FOLLOW_dotCall_in_synpred191_Fan3210);
        dotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred191_Fan

    // $ANTLR start synpred193_Fan
    public final void synpred193_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:430:34: ( safeDotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:430:34: safeDotCall
        {
        pushFollow(FOLLOW_safeDotCall_in_synpred193_Fan3218);
        safeDotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred193_Fan

    // $ANTLR start synpred198_Fan
    public final void synpred198_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:431:35: ( incDotCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:431:35: incDotCall
        {
        pushFollow(FOLLOW_incDotCall_in_synpred198_Fan3241);
        incDotCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred198_Fan

    // $ANTLR start synpred203_Fan
    public final void synpred203_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:449:45: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:449:45: closure
        {
        pushFollow(FOLLOW_closure_in_synpred203_Fan3415);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred203_Fan

    // $ANTLR start synpred204_Fan
    public final void synpred204_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:453:12: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:453:12: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred204_Fan3449);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred204_Fan

    // $ANTLR start synpred206_Fan
    public final void synpred206_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:459:13: ( ( callParams closure ) )
        // src/net/colar/netbeans/fan/antlr/Fan.g:459:13: ( callParams closure )
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:459:13: ( callParams closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:459:14: callParams closure
        {
        pushFollow(FOLLOW_callParams_in_synpred206_Fan3491);
        callParams();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_closure_in_synpred206_Fan3493);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred206_Fan

    // $ANTLR start synpred207_Fan
    public final void synpred207_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:459:36: ( callParams )
        // src/net/colar/netbeans/fan/antlr/Fan.g:459:36: callParams
        {
        pushFollow(FOLLOW_callParams_in_synpred207_Fan3498);
        callParams();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred207_Fan

    // $ANTLR start synpred220_Fan
    public final void synpred220_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:20: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:466:20: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred220_Fan3598);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred220_Fan

    // $ANTLR start synpred221_Fan
    public final void synpred221_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:4: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:4: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred221_Fan3605);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred221_Fan

    // $ANTLR start synpred222_Fan
    public final void synpred222_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:18: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:18: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred222_Fan3609);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred222_Fan

    // $ANTLR start synpred223_Fan
    public final void synpred223_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:32: ( list )
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:32: list
        {
        pushFollow(FOLLOW_list_in_synpred223_Fan3613);
        list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred223_Fan

    // $ANTLR start synpred224_Fan
    public final void synpred224_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:39: ( map )
        // src/net/colar/netbeans/fan/antlr/Fan.g:467:39: map
        {
        pushFollow(FOLLOW_map_in_synpred224_Fan3617);
        map();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred224_Fan

    // $ANTLR start synpred229_Fan
    public final void synpred229_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:474:11: ( type {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:474:11: type {...}?
        {
        pushFollow(FOLLOW_type_in_synpred229_Fan3736);
        type();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred229_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred229_Fan

    // $ANTLR start synpred233_Fan
    public final void synpred233_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:10: ( mapType {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:476:10: mapType {...}?
        {
        pushFollow(FOLLOW_mapType_in_synpred233_Fan3781);
        mapType();

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
        // src/net/colar/netbeans/fan/antlr/Fan.g:481:12: ( DOC )
        // src/net/colar/netbeans/fan/antlr/Fan.g:481:12: DOC
        {
        match(input,DOC,FOLLOW_DOC_in_synpred237_Fan3853); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred237_Fan

    // $ANTLR start synpred240_Fan
    public final void synpred240_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:489:5: ( SP_SEMI )
        // src/net/colar/netbeans/fan/antlr/Fan.g:489:5: SP_SEMI
        {
        match(input,SP_SEMI,FOLLOW_SP_SEMI_in_synpred240_Fan3915); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred240_Fan

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
    public final boolean synpred110_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_Fan_fragment(); // can never throw exception
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
    public final boolean synpred122_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred122_Fan_fragment(); // can never throw exception
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
    public final boolean synpred229_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred229_Fan_fragment(); // can never throw exception
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
    public final boolean synpred101_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_Fan_fragment(); // can never throw exception
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
    public final boolean synpred240_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred240_Fan_fragment(); // can never throw exception
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
    public final boolean synpred45_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_Fan_fragment(); // can never throw exception
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
    public final boolean synpred78_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_Fan_fragment(); // can never throw exception
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
    public final boolean synpred54_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_Fan_fragment(); // can never throw exception
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
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA108 dfa108 = new DFA108(this);
    protected DFA109 dfa109 = new DFA109(this);
    protected DFA111 dfa111 = new DFA111(this);
    protected DFA113 dfa113 = new DFA113(this);
    protected DFA114 dfa114 = new DFA114(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA117 dfa117 = new DFA117(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA130 dfa130 = new DFA130(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\1\4\14\uffff";
    static final String DFA3_minS =
        "\1\24\2\0\12\uffff";
    static final String DFA3_maxS =
        "\1\170\2\0\12\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2\10\uffff";
    static final String DFA3_specialS =
        "\1\uffff\1\0\1\1\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\4\4\uffff\1\4\1\uffff\10\4\115\uffff\1\3\5\uffff\1\2\1\1",
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
            return "243:18: ( podDef | ( typeDef )* )";
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
        "\2\170\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\3\4\uffff\1\3\1\uffff\10\3\123\uffff\1\3\1\1",
            "\2\3\4\uffff\1\3\1\uffff\10\3\123\uffff\1\3\1\1",
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
            return "()* loopback of 243:28: ( typeDef )*";
        }
    }
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\3\uffff\1\7\5\uffff\1\7\1\13\2\uffff";
    static final String DFA4_minS =
        "\1\21\2\161\1\21\1\173\2\161\1\uffff\1\161\2\21\2\uffff";
    static final String DFA4_maxS =
        "\1\21\1\172\1\161\1\170\1\173\2\161\1\uffff\1\161\1\170\1\u0096"+
        "\2\uffff";
    static final String DFA4_acceptS =
        "\7\uffff\1\1\3\uffff\1\2\1\3";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\3\10\uffff\1\2",
            "\1\4",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\47\uffff\1\6\1\5"+
            "\11\uffff\1\7\32\uffff\1\7\5\uffff\2\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            "\1\3",
            "\1\7\2\uffff\2\7\4\uffff\1\7\1\uffff\10\7\47\uffff\1\6\1\5"+
            "\11\uffff\1\7\32\uffff\1\7\5\uffff\2\7",
            "\1\13\1\14\1\uffff\2\13\4\uffff\1\13\1\uffff\10\13\62\uffff"+
            "\1\13\32\uffff\1\13\5\uffff\2\13\35\uffff\1\14",
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
            return "245:5: ( usingPod | usingType | usingAs )";
        }
    }
    static final String DFA13_eotS =
        "\13\uffff";
    static final String DFA13_eofS =
        "\13\uffff";
    static final String DFA13_minS =
        "\1\24\3\0\1\uffff\3\0\3\uffff";
    static final String DFA13_maxS =
        "\1\170\3\0\1\uffff\3\0\3\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\1\3\uffff\1\1\1\2\1\3";
    static final String DFA13_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\3\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\6\1\7\4\uffff\1\5\1\uffff\1\10\1\11\1\12\1\4\4\3\123\uffff"+
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

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "264:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                         
                        int index13_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_0==DOC) ) {s = 1;}

                        else if ( (LA13_0==AT) ) {s = 2;}

                        else if ( ((LA13_0>=KW_PRIVATE && LA13_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA13_0==KW_ABSTRACT) && (synpred15_Fan())) {s = 4;}

                        else if ( (LA13_0==KW_FINAL) ) {s = 5;}

                        else if ( (LA13_0==KW_CONST) ) {s = 6;}

                        else if ( (LA13_0==KW_STATIC) ) {s = 7;}

                        else if ( (LA13_0==KW_CLASS) && (synpred15_Fan())) {s = 8;}

                        else if ( (LA13_0==KW_ENUM) && (synpred17_Fan())) {s = 9;}

                        else if ( (LA13_0==KW_MIXIN) ) {s = 10;}

                         
                        input.seek(index13_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_1 = input.LA(1);

                         
                        int index13_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Fan()) ) {s = 8;}

                        else if ( (synpred17_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index13_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Fan()) ) {s = 8;}

                        else if ( (synpred17_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Fan()) ) {s = 8;}

                        else if ( (synpred17_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Fan()) ) {s = 8;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA50_eotS =
        "\23\uffff";
    static final String DFA50_eofS =
        "\23\uffff";
    static final String DFA50_minS =
        "\1\23\1\0\21\uffff";
    static final String DFA50_maxS =
        "\1\172\1\0\21\uffff";
    static final String DFA50_acceptS =
        "\2\uffff\1\2\17\uffff\1\1";
    static final String DFA50_specialS =
        "\1\uffff\1\0\21\uffff}>";
    static final String[] DFA50_transitionS = {
            "\2\2\1\1\5\2\4\uffff\7\2\56\uffff\1\2\34\uffff\1\2\5\uffff\2"+
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
            return "307:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_1 = input.LA(1);

                         
                        int index50_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_1);
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
    static final String DFA49_eotS =
        "\22\uffff";
    static final String DFA49_eofS =
        "\22\uffff";
    static final String DFA49_minS =
        "\1\23\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA49_maxS =
        "\1\172\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA49_acceptS =
        "\4\uffff\1\1\4\uffff\1\2\5\uffff\1\3\2\uffff";
    static final String DFA49_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12"+
        "\1\13\1\14\3\uffff}>";
    static final String[] DFA49_transitionS = {
            "\2\17\1\10\1\12\1\17\1\6\1\5\1\13\4\uffff\1\7\4\3\1\4\1\11\56"+
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

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "309:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_0 = input.LA(1);

                         
                        int index49_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_0==DOC) ) {s = 1;}

                        else if ( (LA49_0==AT) ) {s = 2;}

                        else if ( ((LA49_0>=KW_PRIVATE && LA49_0<=KW_INTERNAL)) ) {s = 3;}

                        else if ( (LA49_0==KW_NEW) && (synpred66_Fan())) {s = 4;}

                        else if ( (LA49_0==KW_VIRTUAL) ) {s = 5;}

                        else if ( (LA49_0==KW_OVERRIDE) ) {s = 6;}

                        else if ( (LA49_0==KW_ABSTRACT) ) {s = 7;}

                        else if ( (LA49_0==KW_STATIC) ) {s = 8;}

                        else if ( (LA49_0==KW_ONCE) && (synpred69_Fan())) {s = 9;}

                        else if ( (LA49_0==KW_NATIVE) ) {s = 10;}

                        else if ( (LA49_0==KW_FINAL) ) {s = 11;}

                        else if ( (LA49_0==SQ_BRACKET_L) ) {s = 12;}

                        else if ( (LA49_0==SP_PIPE) ) {s = 13;}

                        else if ( (LA49_0==ID) ) {s = 14;}

                        else if ( ((LA49_0>=KW_RD_ONLY && LA49_0<=KW_CONST)||LA49_0==KW_VOLATILE) ) {s = 15;}

                         
                        input.seek(index49_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_1 = input.LA(1);

                         
                        int index49_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_Fan()) ) {s = 4;}

                        else if ( (synpred69_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_2 = input.LA(1);

                         
                        int index49_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_Fan()) ) {s = 4;}

                        else if ( (synpred69_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA49_3 = input.LA(1);

                         
                        int index49_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_Fan()) ) {s = 4;}

                        else if ( (synpred69_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA49_5 = input.LA(1);

                         
                        int index49_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA49_6 = input.LA(1);

                         
                        int index49_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA49_7 = input.LA(1);

                         
                        int index49_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA49_8 = input.LA(1);

                         
                        int index49_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA49_10 = input.LA(1);

                         
                        int index49_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA49_11 = input.LA(1);

                         
                        int index49_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA49_12 = input.LA(1);

                         
                        int index49_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA49_13 = input.LA(1);

                         
                        int index49_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA49_14 = input.LA(1);

                         
                        int index49_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index49_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\12\uffff";
    static final String DFA59_eofS =
        "\3\uffff\1\10\6\uffff";
    static final String DFA59_minS =
        "\1\124\2\uffff\1\4\3\uffff\1\0\2\uffff";
    static final String DFA59_maxS =
        "\1\172\2\uffff\1\174\3\uffff\1\0\2\uffff";
    static final String DFA59_acceptS =
        "\1\uffff\2\1\1\uffff\3\1\1\uffff\1\2\1\1";
    static final String DFA59_specialS =
        "\1\0\2\uffff\1\2\3\uffff\1\1\2\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\2\34\uffff\1\3\10\uffff\1\1",
            "",
            "",
            "\15\10\2\uffff\10\10\4\uffff\12\10\2\uffff\4\10\34\uffff\1"+
            "\4\1\uffff\3\10\1\11\1\10\1\5\1\6\1\10\1\uffff\1\10\13\uffff"+
            "\1\10\2\uffff\3\10\2\uffff\4\10\3\uffff\1\7\11\10\1\uffff\1"+
            "\10",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "322:11: ( ( type id )=> typeAndId | fieldId )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_0 = input.LA(1);

                         
                        int index59_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA59_0==SQ_BRACKET_L) && (synpred78_Fan())) {s = 1;}

                        else if ( (LA59_0==SP_PIPE) && (synpred78_Fan())) {s = 2;}

                        else if ( (LA59_0==ID) ) {s = 3;}

                         
                        input.seek(index59_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_7 = input.LA(1);

                         
                        int index59_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index59_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_3 = input.LA(1);

                         
                        int index59_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA59_3==SP_COLCOL) && (synpred78_Fan())) {s = 4;}

                        else if ( (LA59_3==SP_QMARK) && (synpred78_Fan())) {s = 5;}

                        else if ( (LA59_3==LIST_TYPE) && (synpred78_Fan())) {s = 6;}

                        else if ( (LA59_3==ID) ) {s = 7;}

                        else if ( (LA59_3==EOF||(LA59_3>=KW_BREAK && LA59_3<=KW_FINALLY)||(LA59_3>=KW_RD_ONLY && LA59_3<=KW_FINAL)||(LA59_3>=KW_ABSTRACT && LA59_3<=KW_ELSE)||(LA59_3>=KW_NULL && LA59_3<=KW_FALSE)||(LA59_3>=BRACKET_L && LA59_3<=AS_INIT_VAL)||LA59_3==SP_COMMA||LA59_3==SP_PIPE||LA59_3==SP_SEMI||LA59_3==OP_CURRY||(LA59_3>=OP_PLUS && LA59_3<=OP_MULTI)||(LA59_3>=OP_BANG && LA59_3<=OP_TILDA)||(LA59_3>=URI && LA59_3<=SQ_BRACKET_L)||LA59_3==PAR_L) ) {s = 8;}

                        else if ( (LA59_3==SP_COLON) && (synpred78_Fan())) {s = 9;}

                         
                        input.seek(index59_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\37\uffff";
    static final String DFA77_eofS =
        "\37\uffff";
    static final String DFA77_minS =
        "\1\4\14\uffff\1\0\14\uffff\2\0\3\uffff";
    static final String DFA77_maxS =
        "\1\174\14\uffff\1\0\14\uffff\2\0\3\uffff";
    static final String DFA77_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\23\uffff\1\13";
    static final String DFA77_specialS =
        "\15\uffff\1\0\14\uffff\1\1\1\2\3\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\4\1\5\1\2\1\1\1\6\1\7\1\10\1\3\1\11\31\uffff\2\12\3\uffff"+
            "\4\12\45\uffff\1\33\15\uffff\1\12\2\uffff\3\12\2\uffff\4\12"+
            "\3\uffff\1\15\6\12\1\uffff\1\12\1\32\1\uffff\1\12",
            "",
            "",
            "",
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

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "351:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_13 = input.LA(1);

                         
                        int index77_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index77_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_26 = input.LA(1);

                         
                        int index77_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index77_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA77_27 = input.LA(1);

                         
                        int index77_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred121_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index77_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\65\uffff";
    static final String DFA78_eofS =
        "\1\1\64\uffff";
    static final String DFA78_minS =
        "\1\4\4\uffff\1\0\2\uffff\1\0\7\uffff\2\0\5\uffff\31\0\5\uffff";
    static final String DFA78_maxS =
        "\1\174\4\uffff\1\0\2\uffff\1\0\7\uffff\2\0\5\uffff\31\0\5\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\2\62\uffff\1\1";
    static final String DFA78_specialS =
        "\5\uffff\1\0\2\uffff\1\1\7\uffff\1\2\1\3\5\uffff\1\4\1\5\1\6\1\7"+
        "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
        "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\5\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\32\1\33\1\30\1\27\1\34\1\35\1\36\1\31\1\37\4\1\2\uffff\10"+
            "\1\4\uffff\7\1\1\44\1\45\1\1\2\uffff\1\43\1\46\1\47\1\50\37"+
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
            return "()* loopback of 355:15: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_5 = input.LA(1);

                         
                        int index78_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_8 = input.LA(1);

                         
                        int index78_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA78_16 = input.LA(1);

                         
                        int index78_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA78_17 = input.LA(1);

                         
                        int index78_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_17);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA78_23 = input.LA(1);

                         
                        int index78_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA78_24 = input.LA(1);

                         
                        int index78_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_24);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA78_25 = input.LA(1);

                         
                        int index78_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_25);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA78_26 = input.LA(1);

                         
                        int index78_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_26);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA78_27 = input.LA(1);

                         
                        int index78_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_27);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA78_28 = input.LA(1);

                         
                        int index78_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_28);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA78_29 = input.LA(1);

                         
                        int index78_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_29);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA78_30 = input.LA(1);

                         
                        int index78_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_30);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA78_31 = input.LA(1);

                         
                        int index78_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_31);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA78_32 = input.LA(1);

                         
                        int index78_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred122_Fan()||(synpred122_Fan()&&(notAfterEol())))) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_32);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA78_33 = input.LA(1);

                         
                        int index78_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_33);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA78_34 = input.LA(1);

                         
                        int index78_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_34);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA78_35 = input.LA(1);

                         
                        int index78_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_35);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA78_36 = input.LA(1);

                         
                        int index78_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_36);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA78_37 = input.LA(1);

                         
                        int index78_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_37);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA78_38 = input.LA(1);

                         
                        int index78_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_38);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA78_39 = input.LA(1);

                         
                        int index78_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_39);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA78_40 = input.LA(1);

                         
                        int index78_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_40);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA78_41 = input.LA(1);

                         
                        int index78_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_41);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA78_42 = input.LA(1);

                         
                        int index78_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_42);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA78_43 = input.LA(1);

                         
                        int index78_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_43);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA78_44 = input.LA(1);

                         
                        int index78_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_44);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA78_45 = input.LA(1);

                         
                        int index78_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_45);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA78_46 = input.LA(1);

                         
                        int index78_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_46);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA78_47 = input.LA(1);

                         
                        int index78_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred122_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index78_47);
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
    static final String DFA83_eotS =
        "\65\uffff";
    static final String DFA83_eofS =
        "\1\1\64\uffff";
    static final String DFA83_minS =
        "\1\4\3\uffff\1\0\2\uffff\1\0\7\uffff\2\0\16\uffff\20\0\6\uffff";
    static final String DFA83_maxS =
        "\1\174\3\uffff\1\0\2\uffff\1\0\7\uffff\2\0\16\uffff\20\0\6\uffff";
    static final String DFA83_acceptS =
        "\1\uffff\1\1\62\uffff\1\2";
    static final String DFA83_specialS =
        "\4\uffff\1\0\2\uffff\1\1\7\uffff\1\2\1\3\16\uffff\1\4\1\5\1\6\1"+
        "\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\6"+
        "\uffff}>";
    static final String[] DFA83_transitionS = {
            "\15\1\2\uffff\10\1\4\uffff\7\1\1\43\1\44\1\1\2\uffff\1\42\1"+
            "\45\1\46\1\47\37\uffff\1\1\2\uffff\1\1\2\uffff\1\20\1\uffff"+
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

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "366:22: ( eos | expr eos )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_4 = input.LA(1);

                         
                        int index83_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA83_7 = input.LA(1);

                         
                        int index83_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA83_15 = input.LA(1);

                         
                        int index83_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA83_16 = input.LA(1);

                         
                        int index83_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA83_31 = input.LA(1);

                         
                        int index83_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((((synpred127_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred127_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred127_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred127_Fan()&&(lookupNL()))&&(notAfterEol()))||(synpred127_Fan()&&(lookupNL()))||((synpred127_Fan()&&(lookupNL()))&&(notAfterEol())))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_31);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA83_32 = input.LA(1);

                         
                        int index83_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_32);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA83_33 = input.LA(1);

                         
                        int index83_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_33);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA83_34 = input.LA(1);

                         
                        int index83_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_34);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA83_35 = input.LA(1);

                         
                        int index83_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_35);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA83_36 = input.LA(1);

                         
                        int index83_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_36);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA83_37 = input.LA(1);

                         
                        int index83_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_37);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA83_38 = input.LA(1);

                         
                        int index83_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_38);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA83_39 = input.LA(1);

                         
                        int index83_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_39);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA83_40 = input.LA(1);

                         
                        int index83_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_40);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA83_41 = input.LA(1);

                         
                        int index83_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_41);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA83_42 = input.LA(1);

                         
                        int index83_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_42);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA83_43 = input.LA(1);

                         
                        int index83_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_43);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA83_44 = input.LA(1);

                         
                        int index83_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_44);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA83_45 = input.LA(1);

                         
                        int index83_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_45);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA83_46 = input.LA(1);

                         
                        int index83_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred127_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 52;}

                         
                        input.seek(index83_46);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA90_eotS =
        "\26\uffff";
    static final String DFA90_eofS =
        "\26\uffff";
    static final String DFA90_minS =
        "\1\46\3\0\22\uffff";
    static final String DFA90_maxS =
        "\1\174\3\0\22\uffff";
    static final String DFA90_acceptS =
        "\4\uffff\1\2\20\uffff\1\1";
    static final String DFA90_specialS =
        "\1\uffff\1\0\1\1\1\2\22\uffff}>";
    static final String[] DFA90_transitionS = {
            "\2\4\3\uffff\4\4\45\uffff\1\2\15\uffff\1\4\2\uffff\3\4\2\uffff"+
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
            return "374:1: forInit : ( forInitDef | expr );";
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
                        if ( (synpred134_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index90_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA90_2 = input.LA(1);

                         
                        int index90_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index90_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA90_3 = input.LA(1);

                         
                        int index90_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index90_3);
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
    static final String DFA92_eotS =
        "\66\uffff";
    static final String DFA92_eofS =
        "\1\2\65\uffff";
    static final String DFA92_minS =
        "\1\4\1\0\64\uffff";
    static final String DFA92_maxS =
        "\1\174\1\0\64\uffff";
    static final String DFA92_acceptS =
        "\2\uffff\1\2\62\uffff\1\1";
    static final String DFA92_specialS =
        "\1\uffff\1\0\64\uffff}>";
    static final String[] DFA92_transitionS = {
            "\15\2\2\uffff\10\2\4\uffff\12\2\2\uffff\4\2\36\uffff\2\2\2\uffff"+
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
            return "377:21: ( catchDef )?";
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
                        if ( (synpred136_Fan()) ) {s = 53;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index92_1);
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
    static final String DFA108_eotS =
        "\105\uffff";
    static final String DFA108_eofS =
        "\1\1\104\uffff";
    static final String DFA108_minS =
        "\1\4\17\uffff\1\0\64\uffff";
    static final String DFA108_maxS =
        "\1\175\17\uffff\1\0\64\uffff";
    static final String DFA108_acceptS =
        "\1\uffff\1\2\102\uffff\1\1";
    static final String DFA108_specialS =
        "\20\uffff\1\0\64\uffff}>";
    static final String[] DFA108_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\36\uffff\2\1\1\uffff\3\1\1\uffff"+
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

    static final short[] DFA108_eot = DFA.unpackEncodedString(DFA108_eotS);
    static final short[] DFA108_eof = DFA.unpackEncodedString(DFA108_eofS);
    static final char[] DFA108_min = DFA.unpackEncodedStringToUnsignedChars(DFA108_minS);
    static final char[] DFA108_max = DFA.unpackEncodedStringToUnsignedChars(DFA108_maxS);
    static final short[] DFA108_accept = DFA.unpackEncodedString(DFA108_acceptS);
    static final short[] DFA108_special = DFA.unpackEncodedString(DFA108_specialS);
    static final short[][] DFA108_transition;

    static {
        int numStates = DFA108_transitionS.length;
        DFA108_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA108_transition[i] = DFA.unpackEncodedString(DFA108_transitionS[i]);
        }
    }

    class DFA108 extends DFA {

        public DFA108(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 108;
            this.eot = DFA108_eot;
            this.eof = DFA108_eof;
            this.min = DFA108_min;
            this.max = DFA108_max;
            this.accept = DFA108_accept;
            this.special = DFA108_special;
            this.transition = DFA108_transition;
        }
        public String getDescription() {
            return "()* loopback of 406:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA108_16 = input.LA(1);

                         
                        int index108_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred158_Fan()) ) {s = 68;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index108_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 108, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA109_eotS =
        "\107\uffff";
    static final String DFA109_eofS =
        "\1\1\106\uffff";
    static final String DFA109_minS =
        "\1\4\67\uffff\1\0\16\uffff";
    static final String DFA109_maxS =
        "\1\175\67\uffff\1\0\16\uffff";
    static final String DFA109_acceptS =
        "\1\uffff\1\2\104\uffff\1\1";
    static final String DFA109_specialS =
        "\70\uffff\1\0\16\uffff}>";
    static final String[] DFA109_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\36\uffff\2\1\1\uffff\3\1\1\uffff"+
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
            return "()* loopback of 407:25: ( OP_CURRY shiftExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_56 = input.LA(1);

                         
                        int index109_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred159_Fan()) ) {s = 70;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index109_56);
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
        "\111\uffff";
    static final String DFA111_eofS =
        "\1\1\110\uffff";
    static final String DFA111_minS =
        "\1\4\56\uffff\1\0\12\uffff\1\0\16\uffff";
    static final String DFA111_maxS =
        "\1\175\56\uffff\1\0\12\uffff\1\0\16\uffff";
    static final String DFA111_acceptS =
        "\1\uffff\1\2\106\uffff\1\1";
    static final String DFA111_specialS =
        "\57\uffff\1\0\12\uffff\1\1\16\uffff}>";
    static final String[] DFA111_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\36\uffff\2\1\1\uffff\3\1\1\uffff"+
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
            return "()* loopback of 409:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA111_47 = input.LA(1);

                         
                        int index111_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred163_Fan()) ) {s = 72;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index111_47);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA111_58 = input.LA(1);

                         
                        int index111_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred163_Fan()) ) {s = 72;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index111_58);
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
    static final String DFA113_eotS =
        "\27\uffff";
    static final String DFA113_eofS =
        "\27\uffff";
    static final String DFA113_minS =
        "\1\46\1\0\25\uffff";
    static final String DFA113_maxS =
        "\1\174\1\0\25\uffff";
    static final String DFA113_acceptS =
        "\2\uffff\1\3\22\uffff\1\1\1\2";
    static final String DFA113_specialS =
        "\1\uffff\1\0\25\uffff}>";
    static final String[] DFA113_transitionS = {
            "\2\2\3\uffff\4\2\45\uffff\1\2\15\uffff\1\2\2\uffff\3\2\2\uffff"+
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
            return "412:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );";
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
                        if ( ((synpred168_Fan()&&(notAfterEol()))) ) {s = 21;}

                        else if ( (synpred169_Fan()) ) {s = 22;}

                         
                        input.seek(index113_1);
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
        "\115\uffff";
    static final String DFA114_eofS =
        "\1\1\114\uffff";
    static final String DFA114_minS =
        "\1\4\24\uffff\1\0\2\uffff\1\0\27\uffff\1\0\34\uffff";
    static final String DFA114_maxS =
        "\1\175\24\uffff\1\0\2\uffff\1\0\27\uffff\1\0\34\uffff";
    static final String DFA114_acceptS =
        "\1\uffff\1\2\107\uffff\1\1\3\uffff";
    static final String DFA114_specialS =
        "\25\uffff\1\0\2\uffff\1\1\27\uffff\1\2\34\uffff}>";
    static final String[] DFA114_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\35\uffff\1\111\1\30\1\1\1\uffff"+
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
            return "()* loopback of 416:31: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA114_21 = input.LA(1);

                         
                        int index114_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred170_Fan()&&(notAfterEol()))) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index114_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA114_24 = input.LA(1);

                         
                        int index114_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred170_Fan()) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index114_24);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA114_48 = input.LA(1);

                         
                        int index114_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred170_Fan()&&(notAfterEol()))) ) {s = 73;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL())||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol())))) ) {s = 1;}

                         
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
        "\26\uffff";
    static final String DFA115_eofS =
        "\26\uffff";
    static final String DFA115_minS =
        "\1\46\14\0\1\uffff\6\0\2\uffff";
    static final String DFA115_maxS =
        "\1\172\14\0\1\uffff\6\0\2\uffff";
    static final String DFA115_acceptS =
        "\15\uffff\1\1\6\uffff\1\2\1\3";
    static final String DFA115_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\14\1\15\1\16\1\17\1\20\1\21\2\uffff}>";
    static final String[] DFA115_transitionS = {
            "\1\5\1\6\3\uffff\1\4\1\7\1\10\1\11\45\uffff\1\21\15\uffff\1"+
            "\15\2\uffff\1\15\1\1\1\2\2\uffff\4\15\3\uffff\1\3\1\14\1\17"+
            "\1\12\1\13\1\22\1\23\1\uffff\1\16\1\20",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "417:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA115_1 = input.LA(1);

                         
                        int index115_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 13;}

                        else if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA115_2 = input.LA(1);

                         
                        int index115_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA115_3 = input.LA(1);

                         
                        int index115_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA115_4 = input.LA(1);

                         
                        int index115_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA115_5 = input.LA(1);

                         
                        int index115_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA115_6 = input.LA(1);

                         
                        int index115_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA115_7 = input.LA(1);

                         
                        int index115_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA115_8 = input.LA(1);

                         
                        int index115_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA115_9 = input.LA(1);

                         
                        int index115_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA115_10 = input.LA(1);

                         
                        int index115_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA115_11 = input.LA(1);

                         
                        int index115_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA115_12 = input.LA(1);

                         
                        int index115_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA115_14 = input.LA(1);

                         
                        int index115_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA115_15 = input.LA(1);

                         
                        int index115_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA115_16 = input.LA(1);

                         
                        int index115_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA115_17 = input.LA(1);

                         
                        int index115_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA115_18 = input.LA(1);

                         
                        int index115_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA115_19 = input.LA(1);

                         
                        int index115_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred172_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index115_19);
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
        "\116\uffff";
    static final String DFA116_eofS =
        "\1\1\115\uffff";
    static final String DFA116_minS =
        "\1\4\24\uffff\1\0\2\uffff\1\0\27\uffff\1\0\35\uffff";
    static final String DFA116_maxS =
        "\1\175\24\uffff\1\0\2\uffff\1\0\27\uffff\1\0\35\uffff";
    static final String DFA116_acceptS =
        "\1\uffff\1\2\110\uffff\1\1\3\uffff";
    static final String DFA116_specialS =
        "\25\uffff\1\0\2\uffff\1\1\27\uffff\1\2\35\uffff}>";
    static final String[] DFA116_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\35\uffff\1\112\1\30\1\1\1\uffff"+
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
            return "()* loopback of 420:22: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA116_21 = input.LA(1);

                         
                        int index116_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred180_Fan()&&(notAfterEol()))) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index116_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA116_24 = input.LA(1);

                         
                        int index116_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_Fan()) ) {s = 74;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index116_24);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA116_48 = input.LA(1);

                         
                        int index116_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred180_Fan()&&(notAfterEol()))) ) {s = 74;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL())||((lookupNL())&&(notAfterEol())))) ) {s = 1;}

                         
                        input.seek(index116_48);
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
        "\25\uffff";
    static final String DFA117_eofS =
        "\25\uffff";
    static final String DFA117_minS =
        "\1\46\1\uffff\1\0\14\uffff\3\0\3\uffff";
    static final String DFA117_maxS =
        "\1\172\1\uffff\1\0\14\uffff\3\0\3\uffff";
    static final String DFA117_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\17\uffff\1\3\1\4";
    static final String DFA117_specialS =
        "\2\uffff\1\0\14\uffff\1\1\1\2\1\3\3\uffff}>";
    static final String[] DFA117_transitionS = {
            "\2\3\3\uffff\4\3\45\uffff\1\20\21\uffff\1\3\1\1\11\uffff\1\2"+
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
            return "423:1: termBase : ( idExprReq | literal | typeBase | id );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA117_2 = input.LA(1);

                         
                        int index117_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred181_Fan()) ) {s = 1;}

                        else if ( (synpred182_Fan()) ) {s = 3;}

                        else if ( (synpred183_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index117_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA117_15 = input.LA(1);

                         
                        int index117_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 3;}

                        else if ( (synpred183_Fan()) ) {s = 19;}

                         
                        input.seek(index117_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA117_16 = input.LA(1);

                         
                        int index117_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 3;}

                        else if ( (synpred183_Fan()) ) {s = 19;}

                         
                        input.seek(index117_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA117_17 = input.LA(1);

                         
                        int index117_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred182_Fan()) ) {s = 3;}

                        else if ( (synpred183_Fan()) ) {s = 19;}

                         
                        input.seek(index117_17);
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
        "\14\uffff";
    static final String DFA118_eofS =
        "\14\uffff";
    static final String DFA118_minS =
        "\1\124\3\0\10\uffff";
    static final String DFA118_maxS =
        "\1\172\3\0\10\uffff";
    static final String DFA118_acceptS =
        "\4\uffff\1\2\1\1\1\4\1\7\1\10\1\6\1\3\1\5";
    static final String DFA118_specialS =
        "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] DFA118_transitionS = {
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
            return "424:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA118_1 = input.LA(1);

                         
                        int index118_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred184_Fan()) ) {s = 5;}

                        else if ( (synpred185_Fan()) ) {s = 4;}

                        else if ( (synpred187_Fan()) ) {s = 6;}

                        else if ( (synpred190_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index118_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA118_2 = input.LA(1);

                         
                        int index118_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred184_Fan()) ) {s = 5;}

                        else if ( (synpred185_Fan()) ) {s = 4;}

                        else if ( (synpred187_Fan()) ) {s = 6;}

                        else if ( (synpred189_Fan()) ) {s = 9;}

                        else if ( (synpred190_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index118_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA118_3 = input.LA(1);

                         
                        int index118_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred184_Fan()) ) {s = 5;}

                        else if ( (synpred185_Fan()) ) {s = 4;}

                        else if ( (synpred186_Fan()) ) {s = 10;}

                        else if ( (synpred187_Fan()) ) {s = 6;}

                        else if ( (synpred188_Fan()) ) {s = 11;}

                        else if ( (synpred190_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index118_3);
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
        "\22\uffff";
    static final String DFA119_eofS =
        "\1\uffff\1\10\1\uffff\1\15\16\uffff";
    static final String DFA119_minS =
        "\1\114\1\4\1\uffff\1\4\5\uffff\1\46\1\0\1\46\1\0\1\uffff\1\0\1\uffff"+
        "\1\0\1\uffff";
    static final String DFA119_maxS =
        "\1\174\1\175\1\uffff\1\175\5\uffff\1\174\1\0\1\174\1\0\1\uffff\1"+
        "\0\1\uffff\1\0\1\uffff";
    static final String DFA119_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\4\uffff\1\11\1\uffff\1"+
        "\1\1\uffff\1\3";
    static final String DFA119_specialS =
        "\12\uffff\1\3\1\uffff\1\2\1\uffff\1\0\1\uffff\1\1\1\uffff}>";
    static final String[] DFA119_transitionS = {
            "\1\1\1\7\7\uffff\1\2\31\uffff\1\3\1\4\11\uffff\1\5\1\uffff\1"+
            "\6",
            "\15\10\1\uffff\11\10\1\uffff\23\10\35\uffff\3\10\1\uffff\3"+
            "\10\1\uffff\23\10\1\11\6\10\1\uffff\2\10\1\12\14\10",
            "",
            "\15\15\1\uffff\11\15\1\uffff\23\15\35\uffff\3\15\1\uffff\3"+
            "\15\1\uffff\23\15\1\13\6\15\1\uffff\2\15\1\14\14\15",
            "",
            "",
            "",
            "",
            "",
            "\2\10\3\uffff\4\10\45\uffff\1\10\15\uffff\1\10\2\uffff\3\10"+
            "\2\uffff\4\10\3\uffff\1\16\6\10\1\uffff\2\10\1\uffff\1\10",
            "\1\uffff",
            "\2\15\3\uffff\4\15\45\uffff\1\15\15\uffff\1\15\2\uffff\3\15"+
            "\2\uffff\4\15\3\uffff\1\20\6\15\1\uffff\2\15\1\uffff\1\15",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
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
            return "430:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock | incDotCall | incSafeDotCall );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA119_14 = input.LA(1);

                         
                        int index119_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred191_Fan()) ) {s = 15;}

                        else if ( (synpred198_Fan()) ) {s = 8;}

                         
                        input.seek(index119_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA119_16 = input.LA(1);

                         
                        int index119_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred193_Fan()) ) {s = 17;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index119_16);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA119_12 = input.LA(1);

                         
                        int index119_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred193_Fan()) ) {s = 17;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index119_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA119_10 = input.LA(1);

                         
                        int index119_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred191_Fan()) ) {s = 15;}

                        else if ( (synpred198_Fan()) ) {s = 8;}

                         
                        input.seek(index119_10);
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
        "\117\uffff";
    static final String DFA124_eofS =
        "\1\1\116\uffff";
    static final String DFA124_minS =
        "\1\4\5\uffff\1\0\110\uffff";
    static final String DFA124_maxS =
        "\1\175\5\uffff\1\0\110\uffff";
    static final String DFA124_acceptS =
        "\1\uffff\1\2\114\uffff\1\1";
    static final String DFA124_specialS =
        "\6\uffff\1\0\110\uffff}>";
    static final String[] DFA124_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\35\uffff\3\1\1\uffff\3\1\1\uffff"+
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
            return "()* loopback of 449:45: ( closure )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA124_6 = input.LA(1);

                         
                        int index124_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred203_Fan()) ) {s = 78;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index124_6);
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
    static final String DFA130_eotS =
        "\27\uffff";
    static final String DFA130_eofS =
        "\27\uffff";
    static final String DFA130_minS =
        "\1\46\14\uffff\3\0\7\uffff";
    static final String DFA130_maxS =
        "\1\172\14\uffff\3\0\7\uffff";
    static final String DFA130_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\uffff\1"+
        "\12\3\uffff\1\14\1\20\1\13\1\15\1\16\1\17\1\21";
    static final String DFA130_specialS =
        "\15\uffff\1\0\1\1\1\2\7\uffff}>";
    static final String[] DFA130_transitionS = {
            "\1\2\1\3\3\uffff\1\1\1\4\1\5\1\6\45\uffff\1\17\21\uffff\1\12"+
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
            return "465:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | symbLiteral | simple );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA130_13 = input.LA(1);

                         
                        int index130_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred220_Fan()) ) {s = 18;}

                        else if ( (synpred221_Fan()) ) {s = 16;}

                        else if ( (synpred222_Fan()) ) {s = 19;}

                        else if ( (synpred223_Fan()) ) {s = 20;}

                        else if ( (synpred224_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index130_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA130_14 = input.LA(1);

                         
                        int index130_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred221_Fan()) ) {s = 16;}

                        else if ( (synpred222_Fan()) ) {s = 19;}

                        else if ( (synpred223_Fan()) ) {s = 20;}

                        else if ( (synpred224_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index130_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA130_15 = input.LA(1);

                         
                        int index130_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred221_Fan()) ) {s = 16;}

                        else if ( (synpred222_Fan()) ) {s = 19;}

                        else if ( (synpred223_Fan()) ) {s = 20;}

                        else if ( (synpred224_Fan()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index130_15);
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
 

    public static final BitSet FOLLOW_using_in_prog437 = new BitSet(new long[]{0x0000000FF4320000L,0x0182000000000000L});
    public static final BitSet FOLLOW_podDef_in_prog441 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_typeDef_in_prog445 = new BitSet(new long[]{0x0000000FF4300000L,0x0180000000000000L});
    public static final BitSet FOLLOW_docs_in_prog449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingPod_in_using471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingType_in_using475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingAs_in_using479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingPod489 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_podSpec_in_usingPod491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_eos_in_usingPod493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingType513 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_podSpec_in_usingType515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingType517 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_usingType519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_eos_in_usingType521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingAs543 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_podSpec_in_usingAs545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingAs547 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_usingAs552 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_usingAs555 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_usingAs557 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KW_AS_in_usingAs562 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_usingAs566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_eos_in_usingAs568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ffi_in_podSpec593 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_podSpec596 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_podSpec599 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_podSpec601 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_sq_bracketL_in_ffi612 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_ffi614 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_ffi616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_podHeader_in_podDef625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_BRACKET_L_in_podDef627 = new BitSet(new long[]{0x0000000002000000L,0x0582000000104000L});
    public static final BitSet FOLLOW_symbolDef_in_podDef629 = new BitSet(new long[]{0x0000000002000000L,0x0582000000104000L});
    public static final BitSet FOLLOW_BRACKET_R_in_podDef632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_podHeader639 = new BitSet(new long[]{0x0000000000000000L,0x0182000000000000L});
    public static final BitSet FOLLOW_facet_in_podHeader641 = new BitSet(new long[]{0x0000000000000000L,0x0182000000000000L});
    public static final BitSet FOLLOW_pod_in_podHeader644 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_podHeader646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_symbolDef653 = new BitSet(new long[]{0x0000000002000000L,0x0582000000100000L});
    public static final BitSet FOLLOW_facet_in_symbolDef655 = new BitSet(new long[]{0x0000000002000000L,0x0582000000100000L});
    public static final BitSet FOLLOW_symbolFlag_in_symbolDef658 = new BitSet(new long[]{0x0000000002000000L,0x0582000000100000L});
    public static final BitSet FOLLOW_typeId_in_symbolDef661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_symbolDef663 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_symbolDef665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_eos_in_symbolDef667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_symbolFlag674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_typeDef684 = new BitSet(new long[]{0x0000000FF4300000L,0x0180000000000000L});
    public static final BitSet FOLLOW_facet_in_typeDef686 = new BitSet(new long[]{0x0000000FF4300000L,0x0180000000000000L});
    public static final BitSet FOLLOW_classDef_in_typeDef697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDef_in_typeDef711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinDef_in_typeDef715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classHeader_in_classDef737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_classBody_in_classDef739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_classHeader762 = new BitSet(new long[]{0x0000000F94300000L,0x0080000000000000L});
    public static final BitSet FOLLOW_facet_in_classHeader764 = new BitSet(new long[]{0x0000000F94300000L,0x0080000000000000L});
    public static final BitSet FOLLOW_classFlags_in_classHeader769 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_classHeader772 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_classHeader776 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_inheritance_in_classHeader778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_classFlags814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_classFlags818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_classFlags822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_classFlags826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_classFlags830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_classBody839 = new BitSet(new long[]{0x0000003F87F80000L,0x0582000000104000L});
    public static final BitSet FOLLOW_slotDef_in_classBody841 = new BitSet(new long[]{0x0000003F87F80000L,0x0582000000104000L});
    public static final BitSet FOLLOW_bracketR_in_classBody844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_protection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinHeader_in_mixinDef896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_mixinBody_in_mixinDef898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_mixinHeader921 = new BitSet(new long[]{0x0000000F44300000L,0x0080000000000000L});
    public static final BitSet FOLLOW_facet_in_mixinHeader923 = new BitSet(new long[]{0x0000000F44300000L,0x0080000000000000L});
    public static final BitSet FOLLOW_mixinFlags_in_mixinHeader928 = new BitSet(new long[]{0x0000000F44300000L});
    public static final BitSet FOLLOW_KW_MIXIN_in_mixinHeader931 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_mixinHeader935 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_inheritance_in_mixinHeader937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_mixinFlags972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_mixinFlags976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_mixinFlags980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_mixinFlags984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_mixinBody991 = new BitSet(new long[]{0x0000003F87F80000L,0x0582000000104000L});
    public static final BitSet FOLLOW_slotDef_in_mixinBody993 = new BitSet(new long[]{0x0000003F87F80000L,0x0582000000104000L});
    public static final BitSet FOLLOW_bracketR_in_mixinBody996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumHeader_in_enumDef1029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_enumBody_in_enumDef1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumHeader1057 = new BitSet(new long[]{0x0000000F20000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_facet_in_enumHeader1059 = new BitSet(new long[]{0x0000000F20000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_protection_in_enumHeader1064 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_enumHeader1067 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_enumHeader1071 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_inheritance_in_enumHeader1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_enumBody1108 = new BitSet(new long[]{0x0000000000000000L,0x0502000000000000L});
    public static final BitSet FOLLOW_enumValDefs_in_enumBody1110 = new BitSet(new long[]{0x0000003F87F80000L,0x0582000000104000L});
    public static final BitSet FOLLOW_slotDef_in_enumBody1112 = new BitSet(new long[]{0x0000003F87F80000L,0x0582000000104000L});
    public static final BitSet FOLLOW_bracketR_in_enumBody1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_inheritance1140 = new BitSet(new long[]{0x0000000000000000L,0x0402000000100000L});
    public static final BitSet FOLLOW_typeList_in_inheritance1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs1152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000420000L});
    public static final BitSet FOLLOW_SP_COMMA_in_enumValDefs1155 = new BitSet(new long[]{0x0000000000000000L,0x0502000000000000L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs1158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000420000L});
    public static final BitSet FOLLOW_eos_in_enumValDefs1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumValDef1170 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_enumValDef1172 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_parL_in_enumValDef1175 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_args_in_enumValDef1177 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_enumValDef1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList1191 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_SP_COMMA_in_typeList1194 = new BitSet(new long[]{0x0000000000000000L,0x0402000000100000L});
    public static final BitSet FOLLOW_type_in_typeList1196 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_typeRoot_in_type1216 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_SP_QMARK_in_type1219 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_type1223 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_SP_QMARK_in_type1225 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_funcType_in_nonMapType1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_nonMapType1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_typeRoot1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonMapType_in_typeRoot1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_simpleType1265 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_SP_COLCOL_in_simpleType1268 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_simpleType1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_mapType1281 = new BitSet(new long[]{0x0000000000000000L,0x0402000000100000L});
    public static final BitSet FOLLOW_nonMapType_in_mapType1284 = new BitSet(new long[]{0x0000000000000000L,0x00000000000D0000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType1286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000090000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_mapType1290 = new BitSet(new long[]{0x0000000000000000L,0x00000000000D0000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType1292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000090000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapType1304 = new BitSet(new long[]{0x0000000000000000L,0x0402000000100000L});
    public static final BitSet FOLLOW_type_in_mapType1308 = new BitSet(new long[]{0x0000000000000002L,0x0800000000010000L});
    public static final BitSet FOLLOW_sq_bracketR_in_mapType1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1321 = new BitSet(new long[]{0x0000000000000000L,0x0402000000320000L});
    public static final BitSet FOLLOW_SP_COMMA_in_funcType1324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_formals_in_funcType1329 = new BitSet(new long[]{0x0000000000000000L,0x0402000000320000L});
    public static final BitSet FOLLOW_assignedType_in_funcType1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_assignedType_in_funcType1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_assignedType1359 = new BitSet(new long[]{0x0000000000000000L,0x0402000000100000L});
    public static final BitSet FOLLOW_type_in_assignedType1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_in_formals1371 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_SP_COMMA_in_formals1374 = new BitSet(new long[]{0x0000000000000000L,0x0402000000100000L});
    public static final BitSet FOLLOW_formal_in_formals1376 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_formalFull_in_formal1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_formal1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalInferred_in_formal1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalFull1406 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_formalFull1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalTypeOnly1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_formalInferred1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticBlock_in_slotDef1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_slotDef1452 = new BitSet(new long[]{0x0000003F87F80000L,0x0582000000100000L});
    public static final BitSet FOLLOW_facet_in_slotDef1454 = new BitSet(new long[]{0x0000003F87F80000L,0x0582000000100000L});
    public static final BitSet FOLLOW_ctorDef_in_slotDef1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDef_in_slotDef1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDef_in_slotDef1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_fieldDef1550 = new BitSet(new long[]{0x0000000F87F80000L,0x0582000000100000L});
    public static final BitSet FOLLOW_facet_in_fieldDef1552 = new BitSet(new long[]{0x0000000F87F80000L,0x0582000000100000L});
    public static final BitSet FOLLOW_fieldFlags_in_fieldDef1557 = new BitSet(new long[]{0x0000000002000000L,0x0582000000100000L});
    public static final BitSet FOLLOW_typeId_in_fieldDef1559 = new BitSet(new long[]{0x0000000000000000L,0x000000000040A000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_fieldDef1562 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_fieldDef1564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000402000L});
    public static final BitSet FOLLOW_bracketL_in_fieldDef1579 = new BitSet(new long[]{0x0000000F00000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_protection_in_fieldDef1582 = new BitSet(new long[]{0x0000000F00000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_getter_in_fieldDef1586 = new BitSet(new long[]{0x000078FF87F81FF0L,0x17FE3CE400506000L});
    public static final BitSet FOLLOW_setter_in_fieldDef1590 = new BitSet(new long[]{0x000078FF87F81FF0L,0x17FE3CE400506000L});
    public static final BitSet FOLLOW_SP_SEMI_in_fieldDef1593 = new BitSet(new long[]{0x000078FF87F81FF0L,0x17FE3CE400106000L});
    public static final BitSet FOLLOW_block_in_fieldDef1596 = new BitSet(new long[]{0x0000003F87F80000L,0x0582000000104000L});
    public static final BitSet FOLLOW_bracketR_in_fieldDef1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_fieldDef1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeAndId_in_typeId1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldId_in_typeId1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_fieldId1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeAndId1682 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_typeAndId1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_fieldFlags1712 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_RD_ONLY_in_fieldFlags1716 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_CONST_in_fieldFlags1720 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_STATIC_in_fieldFlags1724 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_fieldFlags1728 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VOLATILE_in_fieldFlags1732 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_fieldFlags1736 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_fieldFlags1740 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_FINAL_in_fieldFlags1744 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_protection_in_fieldFlags1748 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_docs_in_methodDef1768 = new BitSet(new long[]{0x0000002F87600000L,0x0482000000100000L});
    public static final BitSet FOLLOW_facet_in_methodDef1770 = new BitSet(new long[]{0x0000002F87600000L,0x0482000000100000L});
    public static final BitSet FOLLOW_methodFlags_in_methodDef1775 = new BitSet(new long[]{0x0000002F87600000L,0x0402000000100000L});
    public static final BitSet FOLLOW_type_in_methodDef1780 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_methodDef1786 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_parL_in_methodDef1788 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_params_in_methodDef1790 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_methodDef1792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000402000L});
    public static final BitSet FOLLOW_methodBody_in_methodDef1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_methodFlags1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_methodFlags1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_methodFlags1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_methodFlags1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_methodFlags1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ONCE_in_methodFlags1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_methodFlags1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_methodFlags1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params1886 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_SP_COMMA_in_params1889 = new BitSet(new long[]{0x0000000000000000L,0x0402000000100000L});
    public static final BitSet FOLLOW_param_in_params1891 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_type_in_param1904 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_param1906 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_param1909 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_param1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_methodBody1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_methodBody1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_ctorDef1949 = new BitSet(new long[]{0x0000001F00000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_facet_in_ctorDef1951 = new BitSet(new long[]{0x0000001F00000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_ctorFlags_in_ctorDef1956 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_ctorDef1959 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_ctorDef1963 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_parL_in_ctorDef1965 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_params_in_ctorDef1967 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_ctorDef1969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000412000L});
    public static final BitSet FOLLOW_ctorChain_in_ctorDef1978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000402000L});
    public static final BitSet FOLLOW_methodBody_in_ctorDef1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_ctorFlags2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_ctorChain2042 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ctorChainThis_in_ctorChain2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorChainSuper_in_ctorChain2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_ctorChainThis2058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainThis2060 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_ctorChainThis2062 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_parL_in_ctorChainThis2064 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_args_in_ctorChainThis2066 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_ctorChainThis2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_ctorChainSuper2076 = new BitSet(new long[]{0x0000000000000000L,0x1000000000001000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainSuper2079 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_ctorChainSuper2081 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_parL_in_ctorChainSuper2085 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_args_in_ctorChainSuper2087 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_ctorChainSuper2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_staticBlock2098 = new BitSet(new long[]{0x000078C002001FF0L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_block_in_staticBlock2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_block2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_multiStmt2137 = new BitSet(new long[]{0x000078FF87F81FF0L,0x17FE3CE400106000L});
    public static final BitSet FOLLOW_stmt_in_multiStmt2139 = new BitSet(new long[]{0x000078FF87F81FF0L,0x17FE3CE400106000L});
    public static final BitSet FOLLOW_bracketR_in_multiStmt2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_if_in_stmt2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_for_in_stmt2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_while_in_stmt2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_break_in_stmt2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_continue_in_stmt2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_return_in_stmt2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switch_in_stmt2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_throw_in_stmt2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_try_in_stmt2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_stmt2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localDef_in_stmt2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmtList2236 = new BitSet(new long[]{0x000078C002001FF2L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_KW_BREAK_in_g_break2258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_eos_in_g_break2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONTINUE_in_g_continue2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_eos_in_g_continue2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_g_for2277 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_parL_in_g_for2279 = new BitSet(new long[]{0x000078C002000000L,0x17FE3CE400500000L});
    public static final BitSet FOLLOW_forInit_in_g_for2281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for2284 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400500000L});
    public static final BitSet FOLLOW_expr_in_g_for2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for2289 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_g_for2291 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_g_for2294 = new BitSet(new long[]{0x000078C002001FF0L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_block_in_g_for2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_g_if2305 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_parL_in_g_if2307 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_g_if2309 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_g_if2311 = new BitSet(new long[]{0x000078C002001FF0L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_block_in_g_if2313 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_g_if2320 = new BitSet(new long[]{0x000078C002001FF0L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_block_in_g_if2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_g_return2331 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400500000L});
    public static final BitSet FOLLOW_eos_in_g_return2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_g_return2338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_eos_in_g_return2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SWITCH_in_g_switch2348 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_parL_in_g_switch2350 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_g_switch2352 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_g_switch2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_bracketL_in_g_switch2356 = new BitSet(new long[]{0x0000003F87F86000L,0x0582000000104000L});
    public static final BitSet FOLLOW_g_case_in_g_switch2359 = new BitSet(new long[]{0x0000003F87F86000L,0x0582000000104000L});
    public static final BitSet FOLLOW_g_default_in_g_switch2364 = new BitSet(new long[]{0x0000003F87F80000L,0x0582000000104000L});
    public static final BitSet FOLLOW_bracketR_in_g_switch2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_g_throw2376 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_g_throw2378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_eos_in_g_throw2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHILE_in_g_while2388 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_parL_in_g_while2390 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_g_while2392 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_g_while2394 = new BitSet(new long[]{0x000078C002001FF0L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_block_in_g_while2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_g_try2404 = new BitSet(new long[]{0x000078C002019FF0L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_try_long_in_g_try2411 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_stmtList_in_g_try2415 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_catch_in_g_try2423 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_finally_in_g_try2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_try_long2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprStmt2448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_eos_in_exprStmt2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_localDef2457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000408000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_localDef2460 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_localDef2462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_eos_in_localDef2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_forInit2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forInit2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_forInitDef2485 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_forInitDef2488 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_forInitDef2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_g_catch2501 = new BitSet(new long[]{0x000078C002001FF0L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_catchDef_in_g_catch2503 = new BitSet(new long[]{0x000078C002001FF0L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_catch_long_in_g_catch2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtList_in_g_catch2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_catch_long2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_catchDef2531 = new BitSet(new long[]{0x0000000000000000L,0x0402000000100000L});
    public static final BitSet FOLLOW_type_in_catchDef2533 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_catchDef2535 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_catchDef2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_g_finally2545 = new BitSet(new long[]{0x000078C002001FF0L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_finally_long_in_g_finally2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtList_in_g_finally2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_finally_long2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_g_case2572 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_g_case2574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_case2576 = new BitSet(new long[]{0x000078C002001FF2L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_stmt_in_g_case2578 = new BitSet(new long[]{0x000078C002001FF2L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_KW_DEFAULT_in_g_default2586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_default2588 = new BitSet(new long[]{0x000078C002001FF2L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_stmt_in_g_default2590 = new BitSet(new long[]{0x000078C002001FF2L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_assignExpr_in_expr2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2618 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2621 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_assignExpr_in_assignExpr2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryExpr2632 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_ternaryTail_in_ternaryExpr2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_ternaryTail2645 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail2647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SP_COLON_in_ternaryTail2649 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2670 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_OP_OR_in_condOrExpr2674 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2677 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2687 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_OP_AND_in_condAndExpr2690 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2693 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2703 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_CP_EQUALITY_in_equalityExpr2706 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2708 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_elvisExpr_in_relationalExpr2721 = new BitSet(new long[]{0x0000060000040000L,0x0000000010000000L});
    public static final BitSet FOLLOW_typeCheck_in_relationalExpr2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_relationalExpr2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCheck2739 = new BitSet(new long[]{0x0000000000000000L,0x0402000000100000L});
    public static final BitSet FOLLOW_typeRoot_in_typeCheck2751 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_SP_QMARK_in_typeCheck2754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_typeCheck2759 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_CP_COMPARATORS_in_compare2772 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_elvisExpr_in_compare2774 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2785 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_OP_ELVIS_in_elvisExpr2788 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2790 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2801 = new BitSet(new long[]{0x0000000000000002L,0x00000001C0000000L});
    public static final BitSet FOLLOW_set_in_rangeExpr2804 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2818 = new BitSet(new long[]{0x0000000000000002L,0x00000001C0000000L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2829 = new BitSet(new long[]{0x0000000000000002L,0x0000000200100000L});
    public static final BitSet FOLLOW_set_in_bitOrExpr2832 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2840 = new BitSet(new long[]{0x0000000000000002L,0x0000000200100000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2851 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_OP_CURRY_in_bitAndExpr2854 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2856 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2868 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_set_in_shiftExpr2871 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2879 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2890 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_set_in_addExpr2893 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2901 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_set_in_addAppend2911 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_parenExpr_in_addAppend2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2927 = new BitSet(new long[]{0x0000000000000002L,0x0000038000000000L});
    public static final BitSet FOLLOW_set_in_multExpr2930 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2942 = new BitSet(new long[]{0x0000000000000002L,0x0000038000000000L});
    public static final BitSet FOLLOW_castExpr_in_parenExpr2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_parenExpr2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_parenExpr2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_castExpr2972 = new BitSet(new long[]{0x0000000000000000L,0x0402000000100000L});
    public static final BitSet FOLLOW_type_in_castExpr2974 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_castExpr2976 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_parenExpr_in_castExpr2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_groupedExpr2987 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_groupedExpr2989 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_groupedExpr2991 = new BitSet(new long[]{0x0000000000000002L,0x1401800000203000L});
    public static final BitSet FOLLOW_termChain_in_groupedExpr2993 = new BitSet(new long[]{0x0000000000000002L,0x1401800000203000L});
    public static final BitSet FOLLOW_prefixExpr_in_unaryExpr3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_unaryExpr3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_unaryExpr3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr3018 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_parenExpr_in_prefixExpr3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_postfixExpr3055 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_set_in_postfixExpr3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termBase_in_termExpr3072 = new BitSet(new long[]{0x0000000000000002L,0x1401800000203000L});
    public static final BitSet FOLLOW_termChain_in_termExpr3074 = new BitSet(new long[]{0x0000000000000002L,0x1401800000203000L});
    public static final BitSet FOLLOW_idExprReq_in_termBase3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_termBase3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_termBase3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_termBase3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_typeBase3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_typeBase3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_typeBase3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_typeBase3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_typeBase3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_typeBase3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_typeBase3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorBlock_in_typeBase3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_ctorBlock3170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_itBlock_in_ctorBlock3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_staticCall3179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_staticCall3181 = new BitSet(new long[]{0x0000000000000000L,0x0402008000000000L});
    public static final BitSet FOLLOW_idExpr_in_staticCall3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_termChain3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynCall_in_termChain3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_termChain3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDynCall_in_termChain3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpr_in_termChain3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callOp_in_termChain3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itBlock_in_termChain3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDotCall_in_termChain3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incSafeDotCall_in_termChain3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_dsl3260 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_DSL_in_dsl3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_incDotCall3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_incSafeDotCall3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_itBlock3306 = new BitSet(new long[]{0x000078FF87F81FF0L,0x17FE3CE400106000L});
    public static final BitSet FOLLOW_stmt_in_itBlock3309 = new BitSet(new long[]{0x000078FF87F81FF0L,0x17FE3CE400526000L});
    public static final BitSet FOLLOW_SP_COMMA_in_itBlock3311 = new BitSet(new long[]{0x000078FF87F81FF0L,0x17FE3CE400506000L});
    public static final BitSet FOLLOW_SP_SEMI_in_itBlock3314 = new BitSet(new long[]{0x000078FF87F81FF0L,0x17FE3CE400106000L});
    public static final BitSet FOLLOW_bracketR_in_itBlock3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotCall3327 = new BitSet(new long[]{0x0000000000000000L,0x0402008000000000L});
    public static final BitSet FOLLOW_idExpr_in_dotCall3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_dynCall3349 = new BitSet(new long[]{0x0000000000000000L,0x0402008000000000L});
    public static final BitSet FOLLOW_idExpr_in_dynCall3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_safeDotCall3359 = new BitSet(new long[]{0x0000000000000000L,0x0402008000000000L});
    public static final BitSet FOLLOW_idExpr_in_safeDotCall3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall3380 = new BitSet(new long[]{0x0000000000000000L,0x0402008000000000L});
    public static final BitSet FOLLOW_idExpr_in_safeDynCall3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_indexExpr3392 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_indexExpr3394 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_indexExpr3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callOp3407 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_args_in_callOp3409 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_callOp3413 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_closure_in_callOp3415 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_funcType_in_closure3437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_multiStmt_in_closure3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_idExpr3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idExpr3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_idExprReq3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_idExprReq3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MULTI_in_field3474 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_field3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call3487 = new BitSet(new long[]{0x0000000000000000L,0x1000000000100000L});
    public static final BitSet FOLLOW_callParams_in_call3491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_closure_in_call3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_call3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_call3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callParams3524 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_args_in_callParams3526 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_callParams3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args3538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_SP_COMMA_in_args3541 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_args3544 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_KW_NULL_in_literal3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_literal3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_literal3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IT_in_literal3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_literal3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_literal3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strs_in_literal3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_literal3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_literal3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_literal3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_literal3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_literal3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_literal3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_literal3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_literal3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbLiteral_in_literal3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_literal3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTSTR_in_strs3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_strs3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeLiteral3674 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OP_POUND_in_typeLiteral3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_slotLiteral3687 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OP_POUND_in_slotLiteral3690 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_slotLiteral3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_symbLiteral3703 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_symbLiteral3706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SP_COLON_in_symbLiteral3708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SP_COLON_in_symbLiteral3710 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_symbLiteral3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_namedSuper3722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_namedSuper3724 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_SUPER_in_namedSuper3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_list3736 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_sq_bracketL_in_list3742 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400120000L});
    public static final BitSet FOLLOW_listItems_in_list3744 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_list3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_listItems3755 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3758 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_listItems3760 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_map3781 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_sq_bracketL_in_map3787 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400110000L});
    public static final BitSet FOLLOW_mapItems_in_map3789 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_map3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapPair_in_mapItems3800 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems3803 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_mapPair_in_mapItems3805 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_mapItems3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_mapPair3823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapPair3825 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_mapPair3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_simple3835 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_parL_in_simple3837 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_simple3839 = new BitSet(new long[]{0x000078C000000000L,0x36FE3CE400100000L});
    public static final BitSet FOLLOW_parR_in_simple3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_docs3853 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_OP_MINUS_in_number3875 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_NUMBER_in_number3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_facet3886 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_facet3888 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_AS_EQUAL_in_facet3891 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_expr_in_facet3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_eos3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getter3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setter3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pod3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_bracketL4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_R_in_bracketR4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_sq_bracketL4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_sq_bracketR4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_parL4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_R_in_parR4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_podDef_in_synpred2_Fan441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred13_Fan686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classFlags_in_synpred15_Fan691 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_synpred15_Fan694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_synpred17_Fan705 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_synpred17_Fan708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred44_Fan1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred45_Fan1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_synpred46_Fan1223 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred46_Fan1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred48_Fan1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_synpred54_Fan1304 = new BitSet(new long[]{0x0000000000000000L,0x0402000000100000L});
    public static final BitSet FOLLOW_type_in_synpred54_Fan1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketR_in_synpred55_Fan1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred57_Fan1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred59_Fan1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_synpred61_Fan1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_synpred62_Fan1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_synpred63_Fan1438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_bracketL_in_synpred63_Fan1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred64_Fan1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorFlags_in_synpred66_Fan1471 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_synpred66_Fan1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodFlags_in_synpred69_Fan1488 = new BitSet(new long[]{0x0000002F8F600000L,0x0402000000100000L});
    public static final BitSet FOLLOW_type_in_synpred69_Fan1492 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_KW_VOID_in_synpred69_Fan1496 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_synpred69_Fan1499 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_parL_in_synpred69_Fan1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getter_in_synpred73_Fan1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred75_Fan1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred78_Fan1643 = new BitSet(new long[]{0x0000000000000000L,0x0402000000000000L});
    public static final BitSet FOLLOW_id_in_synpred78_Fan1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_synpred101_Fan1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred110_Fan2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_synpred121_Fan2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred122_Fan2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_synpred126_Fan2320 = new BitSet(new long[]{0x000078C002001FF0L,0x17FE3CE400102000L});
    public static final BitSet FOLLOW_block_in_synpred126_Fan2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_synpred127_Fan2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred130_Fan2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_synpred131_Fan2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_synpred132_Fan2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_synpred134_Fan2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchDef_in_synpred136_Fan2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred137_Fan2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred138_Fan2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred158_Fan2832 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_bitAndExpr_in_synpred158_Fan2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_CURRY_in_synpred159_Fan2854 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_shiftExpr_in_synpred159_Fan2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred163_Fan2893 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_multExpr_in_synpred163_Fan2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred167_Fan2930 = new BitSet(new long[]{0x000078C000000000L,0x16FE3CE400100000L});
    public static final BitSet FOLLOW_parenExpr_in_synpred167_Fan2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_synpred168_Fan2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_synpred169_Fan2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred170_Fan2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred171_Fan3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_synpred172_Fan3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred180_Fan3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred181_Fan3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred182_Fan3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_synpred183_Fan3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred184_Fan3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred185_Fan3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred186_Fan3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_synpred187_Fan3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_synpred188_Fan3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred189_Fan3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_synpred190_Fan3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_synpred191_Fan3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_synpred193_Fan3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDotCall_in_synpred198_Fan3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred203_Fan3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred204_Fan3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred206_Fan3491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_closure_in_synpred206_Fan3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred207_Fan3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred220_Fan3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred221_Fan3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred222_Fan3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_synpred223_Fan3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_synpred224_Fan3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred229_Fan3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred233_Fan3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_synpred237_Fan3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_synpred240_Fan3915 = new BitSet(new long[]{0x0000000000000002L});

}