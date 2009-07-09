// $ANTLR 3.1.2 src/net/colar/netbeans/fan/antlr/Fan.g 2009-07-09 16:15:15
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KW_BREAK", "KW_CONTINUE", "KW_FOR", "KW_IF", "KW_RETURN", "KW_SWITCH", "KW_THROW", "KW_WHILE", "KW_TRY", "KW_CASE", "KW_DEFAULT", "KW_CATCH", "KW_FINALLY", "KW_USING", "KW_AS", "KW_RD_ONLY", "KW_CONST", "KW_STATIC", "KW_NATIVE", "KW_VOLATILE", "KW_OVERRIDE", "KW_VIRTUAL", "KW_FINAL", "KW_VOID", "KW_CLASS", "KW_ENUM", "KW_MIXIN", "KW_ABSTRACT", "KW_PRIVATE", "KW_PROTECTED", "KW_PUBLIC", "KW_INTERNAL", "KW_NEW", "KW_ONCE", "KW_THIS", "KW_SUPER", "KW_ELSE", "KW_IS", "KW_ISNOT", "KW_NULL", "KW_IT", "KW_TRUE", "KW_FALSE", "INC_STR", "INC_URI", "INC_COMMENT", "INC_DSL", "AST_CLASS", "AST_ID", "AST_MODIFIER", "AST_METHOD", "AST_INHERITANCE", "AST_RETURN", "AST_PARAMS", "SP_COLCOL", "DOT", "SP_COLON", "SP_COMMA", "SP_QMARK", "LIST_TYPE", "SP_PIPE", "OP_ARROW", "AS_INIT_VAL", "SP_SEMI", "AS_EQUAL", "AS_ASSIGN_OP", "OP_OR", "OP_AND", "CP_EQUALITY", "CP_COMPARATORS", "OP_ELVIS", "OP_RANG_EXCL_OLD", "OP_RANGE_EXCL", "OP_RANGE", "OP_BITOR", "OP_CURRY", "OP_LSHIFT", "OP_RSHIFT", "OP_PLUS", "OP_MINUS", "OP_MULTI", "OP_DIV", "OP_MOD", "OP_BANG", "OP_2PLUS", "OP_2MINUS", "OP_TILDA", "DSL", "OP_SAFE_CALL", "OP_SAFEDYN_CALL", "AT", "ID", "QUOTSTR", "STR", "URI", "CHAR", "OP_POUND", "DOC", "NUMBER", "BRACKET_L", "BRACKET_R", "SQ_BRACKET_L", "SQ_BRACKET_R", "PAR_L", "PAR_R", "LB", "WS", "LINE_COMMENT", "EXEC_COMMENT", "COMPL_ML_COMMENT", "MULTI_COMMENT", "COMPL_DSL", "DIGIT", "HEXLETTER", "COMPL_QSTR", "COMPL_STR", "COMPL_URI", "KEYWORD", "UNDERSCORE", "HEX_HEADER", "HEXNB", "DECIMAL", "FRACTIONAL", "HEXHEADER", "FRACTION", "EXPONENT", "NBTYPE", "LETTER", "INC_UNKNOWN_ITEM"
    };
    public static final int EXPONENT=129;
    public static final int DSL=91;
    public static final int KW_NATIVE=22;
    public static final int OP_AND=71;
    public static final int AST_PARAMS=57;
    public static final int LETTER=131;
    public static final int HEXNB=124;
    public static final int CHAR=99;
    public static final int KW_DEFAULT=14;
    public static final int OP_2PLUS=88;
    public static final int KW_ONCE=37;
    public static final int SP_SEMI=67;
    public static final int INC_UNKNOWN_ITEM=132;
    public static final int EOF=-1;
    public static final int KW_PUBLIC=34;
    public static final int KW_ISNOT=42;
    public static final int OP_MOD=86;
    public static final int PAR_R=108;
    public static final int OP_MINUS=83;
    public static final int KW_NEW=36;
    public static final int KW_BREAK=4;
    public static final int KW_SWITCH=9;
    public static final int OP_RANG_EXCL_OLD=75;
    public static final int AST_CLASS=51;
    public static final int OP_BITOR=78;
    public static final int QUOTSTR=96;
    public static final int OP_BANG=87;
    public static final int PAR_L=107;
    public static final int OP_MULTI=84;
    public static final int KEYWORD=121;
    public static final int KW_PROTECTED=33;
    public static final int LINE_COMMENT=111;
    public static final int CP_COMPARATORS=73;
    public static final int NUMBER=102;
    public static final int KW_CATCH=15;
    public static final int AS_EQUAL=68;
    public static final int UNDERSCORE=122;
    public static final int OP_DIV=85;
    public static final int SP_COMMA=61;
    public static final int URI=98;
    public static final int KW_FINALLY=16;
    public static final int WS=110;
    public static final int KW_THROW=10;
    public static final int OP_POUND=100;
    public static final int KW_STATIC=21;
    public static final int INC_COMMENT=49;
    public static final int AST_METHOD=54;
    public static final int SP_QMARK=62;
    public static final int AST_ID=52;
    public static final int HEXHEADER=127;
    public static final int AS_INIT_VAL=66;
    public static final int COMPL_DSL=115;
    public static final int NBTYPE=130;
    public static final int KW_SUPER=39;
    public static final int OP_2MINUS=89;
    public static final int KW_ELSE=40;
    public static final int OP_RSHIFT=81;
    public static final int OP_OR=70;
    public static final int AST_MODIFIER=53;
    public static final int DOC=101;
    public static final int KW_OVERRIDE=24;
    public static final int KW_ABSTRACT=31;
    public static final int MULTI_COMMENT=114;
    public static final int KW_CONST=20;
    public static final int COMPL_ML_COMMENT=113;
    public static final int OP_ELVIS=74;
    public static final int BRACKET_R=104;
    public static final int KW_TRUE=45;
    public static final int ID=95;
    public static final int SP_COLON=60;
    public static final int BRACKET_L=103;
    public static final int AT=94;
    public static final int STR=97;
    public static final int SP_PIPE=64;
    public static final int OP_RANGE_EXCL=76;
    public static final int COMPL_QSTR=118;
    public static final int KW_VIRTUAL=25;
    public static final int OP_TILDA=90;
    public static final int CP_EQUALITY=72;
    public static final int KW_FOR=6;
    public static final int KW_WHILE=11;
    public static final int COMPL_URI=120;
    public static final int OP_RANGE=77;
    public static final int KW_RETURN=8;
    public static final int INC_DSL=50;
    public static final int SQ_BRACKET_R=106;
    public static final int AST_RETURN=56;
    public static final int KW_IS=41;
    public static final int DIGIT=116;
    public static final int KW_TRY=12;
    public static final int KW_IT=44;
    public static final int DOT=59;
    public static final int KW_THIS=38;
    public static final int KW_IF=7;
    public static final int OP_CURRY=79;
    public static final int SQ_BRACKET_L=105;
    public static final int OP_PLUS=82;
    public static final int KW_FALSE=46;
    public static final int KW_INTERNAL=35;
    public static final int KW_FINAL=26;
    public static final int HEXLETTER=117;
    public static final int KW_CONTINUE=5;
    public static final int KW_PRIVATE=32;
    public static final int KW_ENUM=29;
    public static final int HEX_HEADER=123;
    public static final int OP_SAFEDYN_CALL=93;
    public static final int KW_VOLATILE=23;
    public static final int KW_CASE=13;
    public static final int LIST_TYPE=63;
    public static final int FRACTIONAL=126;
    public static final int OP_LSHIFT=80;
    public static final int EXEC_COMMENT=112;
    public static final int KW_MIXIN=30;
    public static final int OP_ARROW=65;
    public static final int KW_VOID=27;
    public static final int DECIMAL=125;
    public static final int INC_URI=48;
    public static final int KW_CLASS=28;
    public static final int AS_ASSIGN_OP=69;
    public static final int KW_RD_ONLY=19;
    public static final int INC_STR=47;
    public static final int OP_SAFE_CALL=92;
    public static final int KW_AS=18;
    public static final int COMPL_STR=119;
    public static final int LB=109;
    public static final int KW_USING=17;
    public static final int KW_NULL=43;
    public static final int FRACTION=128;
    public static final int AST_INHERITANCE=55;
    public static final int SP_COLCOL=58;

    // delegates
    // delegators


        public FanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[381+1];
             
             
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:220:1: prog : ( using )* ( typeDef )* docs EOF ;
    public final FanParser.prog_return prog() throws RecognitionException {
        FanParser.prog_return retval = new FanParser.prog_return();
        retval.start = input.LT(1);
        int prog_StartIndex = input.index();
        Object root_0 = null;

        Token EOF4=null;
        FanParser.using_return using1 = null;

        FanParser.typeDef_return typeDef2 = null;

        FanParser.docs_return docs3 = null;


        Object EOF4_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:220:7: ( ( using )* ( typeDef )* docs EOF )
            // src/net/colar/netbeans/fan/antlr/Fan.g:220:11: ( using )* ( typeDef )* docs EOF
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:220:11: ( using )*
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
            	    pushFollow(FOLLOW_using_in_prog384);
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

            // src/net/colar/netbeans/fan/antlr/Fan.g:220:18: ( typeDef )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: typeDef
            	    {
            	    pushFollow(FOLLOW_typeDef_in_prog387);
            	    typeDef2=typeDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeDef2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_docs_in_prog390);
            docs3=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs3.getTree());
            EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_prog392); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF4_tree = (Object)adaptor.create(EOF4);
            adaptor.addChild(root_0, EOF4_tree);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:221:1: using : ( usingPod | usingType | usingAs ) ;
    public final FanParser.using_return using() throws RecognitionException {
        FanParser.using_return retval = new FanParser.using_return();
        retval.start = input.LT(1);
        int using_StartIndex = input.index();
        Object root_0 = null;

        FanParser.usingPod_return usingPod5 = null;

        FanParser.usingType_return usingType6 = null;

        FanParser.usingAs_return usingAs7 = null;



        paraphrase.push("Using statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:222:3: ( ( usingPod | usingType | usingAs ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:222:5: ( usingPod | usingType | usingAs )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:222:5: ( usingPod | usingType | usingAs )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:222:6: usingPod
                    {
                    pushFollow(FOLLOW_usingPod_in_using412);
                    usingPod5=usingPod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingPod5.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:222:17: usingType
                    {
                    pushFollow(FOLLOW_usingType_in_using416);
                    usingType6=usingType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingType6.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:222:29: usingAs
                    {
                    pushFollow(FOLLOW_usingAs_in_using420);
                    usingAs7=usingAs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usingAs7.getTree());

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
    // src/net/colar/netbeans/fan/antlr/Fan.g:223:1: usingPod : KW_USING podSpec eos ;
    public final FanParser.usingPod_return usingPod() throws RecognitionException {
        FanParser.usingPod_return retval = new FanParser.usingPod_return();
        retval.start = input.LT(1);
        int usingPod_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING8=null;
        FanParser.podSpec_return podSpec9 = null;

        FanParser.eos_return eos10 = null;


        Object KW_USING8_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:224:3: ( KW_USING podSpec eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:224:5: KW_USING podSpec eos
            {
            root_0 = (Object)adaptor.nil();

            KW_USING8=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingPod430); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_USING8_tree = (Object)adaptor.create(KW_USING8);
            adaptor.addChild(root_0, KW_USING8_tree);
            }
            pushFollow(FOLLOW_podSpec_in_usingPod432);
            podSpec9=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, podSpec9.getTree());
            pushFollow(FOLLOW_eos_in_usingPod434);
            eos10=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos10.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:225:1: usingType : KW_USING podSpec SP_COLCOL id eos ;
    public final FanParser.usingType_return usingType() throws RecognitionException {
        FanParser.usingType_return retval = new FanParser.usingType_return();
        retval.start = input.LT(1);
        int usingType_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING11=null;
        Token SP_COLCOL13=null;
        FanParser.podSpec_return podSpec12 = null;

        FanParser.id_return id14 = null;

        FanParser.eos_return eos15 = null;


        Object KW_USING11_tree=null;
        Object SP_COLCOL13_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:226:3: ( KW_USING podSpec SP_COLCOL id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:226:5: KW_USING podSpec SP_COLCOL id eos
            {
            root_0 = (Object)adaptor.nil();

            KW_USING11=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingType444); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_USING11_tree = (Object)adaptor.create(KW_USING11);
            adaptor.addChild(root_0, KW_USING11_tree);
            }
            pushFollow(FOLLOW_podSpec_in_usingType446);
            podSpec12=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, podSpec12.getTree());
            SP_COLCOL13=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingType448); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLCOL13_tree = (Object)adaptor.create(SP_COLCOL13);
            adaptor.addChild(root_0, SP_COLCOL13_tree);
            }
            pushFollow(FOLLOW_id_in_usingType450);
            id14=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id14.getTree());
            pushFollow(FOLLOW_eos_in_usingType452);
            eos15=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos15.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:227:1: usingAs : KW_USING podSpec SP_COLCOL id KW_AS id eos ;
    public final FanParser.usingAs_return usingAs() throws RecognitionException {
        FanParser.usingAs_return retval = new FanParser.usingAs_return();
        retval.start = input.LT(1);
        int usingAs_StartIndex = input.index();
        Object root_0 = null;

        Token KW_USING16=null;
        Token SP_COLCOL18=null;
        Token KW_AS20=null;
        FanParser.podSpec_return podSpec17 = null;

        FanParser.id_return id19 = null;

        FanParser.id_return id21 = null;

        FanParser.eos_return eos22 = null;


        Object KW_USING16_tree=null;
        Object SP_COLCOL18_tree=null;
        Object KW_AS20_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:227:10: ( KW_USING podSpec SP_COLCOL id KW_AS id eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:227:12: KW_USING podSpec SP_COLCOL id KW_AS id eos
            {
            root_0 = (Object)adaptor.nil();

            KW_USING16=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_usingAs460); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_USING16_tree = (Object)adaptor.create(KW_USING16);
            adaptor.addChild(root_0, KW_USING16_tree);
            }
            pushFollow(FOLLOW_podSpec_in_usingAs462);
            podSpec17=podSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, podSpec17.getTree());
            SP_COLCOL18=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_usingAs464); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLCOL18_tree = (Object)adaptor.create(SP_COLCOL18);
            adaptor.addChild(root_0, SP_COLCOL18_tree);
            }
            pushFollow(FOLLOW_id_in_usingAs466);
            id19=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id19.getTree());
            KW_AS20=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_usingAs468); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_AS20_tree = (Object)adaptor.create(KW_AS20);
            adaptor.addChild(root_0, KW_AS20_tree);
            }
            pushFollow(FOLLOW_id_in_usingAs470);
            id21=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id21.getTree());
            pushFollow(FOLLOW_eos_in_usingAs472);
            eos22=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos22.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:228:1: podSpec : ( ffi )? id ( DOT id )* ;
    public final FanParser.podSpec_return podSpec() throws RecognitionException {
        FanParser.podSpec_return retval = new FanParser.podSpec_return();
        retval.start = input.LT(1);
        int podSpec_StartIndex = input.index();
        Object root_0 = null;

        Token DOT25=null;
        FanParser.ffi_return ffi23 = null;

        FanParser.id_return id24 = null;

        FanParser.id_return id26 = null;


        Object DOT25_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:228:10: ( ( ffi )? id ( DOT id )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:228:12: ( ffi )? id ( DOT id )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:228:12: ( ffi )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SQ_BRACKET_L) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ffi
                    {
                    pushFollow(FOLLOW_ffi_in_podSpec480);
                    ffi23=ffi();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ffi23.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_podSpec483);
            id24=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id24.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:228:20: ( DOT id )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DOT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:228:21: DOT id
            	    {
            	    DOT25=(Token)match(input,DOT,FOLLOW_DOT_in_podSpec486); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT25_tree = (Object)adaptor.create(DOT25);
            	    adaptor.addChild(root_0, DOT25_tree);
            	    }
            	    pushFollow(FOLLOW_id_in_podSpec488);
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
    // src/net/colar/netbeans/fan/antlr/Fan.g:229:1: ffi : sq_bracketL id sq_bracketR ;
    public final FanParser.ffi_return ffi() throws RecognitionException {
        FanParser.ffi_return retval = new FanParser.ffi_return();
        retval.start = input.LT(1);
        int ffi_StartIndex = input.index();
        Object root_0 = null;

        FanParser.sq_bracketL_return sq_bracketL27 = null;

        FanParser.id_return id28 = null;

        FanParser.sq_bracketR_return sq_bracketR29 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:229:7: ( sq_bracketL id sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:229:9: sq_bracketL id sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sq_bracketL_in_ffi499);
            sq_bracketL27=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL27.getTree());
            pushFollow(FOLLOW_id_in_ffi501);
            id28=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id28.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_ffi503);
            sq_bracketR29=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR29.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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

    public static class typeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:231:1: typeDef : docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) ;
    public final FanParser.typeDef_return typeDef() throws RecognitionException {
        FanParser.typeDef_return retval = new FanParser.typeDef_return();
        retval.start = input.LT(1);
        int typeDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs30 = null;

        FanParser.facet_return facet31 = null;

        FanParser.classDef_return classDef32 = null;

        FanParser.enumDef_return enumDef33 = null;

        FanParser.mixinDef_return mixinDef34 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:231:10: ( docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:231:12: docs ( facet )* ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_typeDef512);
            docs30=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs30.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:231:17: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_typeDef514);
            	    facet31=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet31.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:231:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:231:25: ( ( classFlags )* KW_CLASS )=> classDef
                    {
                    pushFollow(FOLLOW_classDef_in_typeDef525);
                    classDef32=classDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDef32.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:232:4: ( ( protection )? KW_ENUM )=> enumDef
                    {
                    pushFollow(FOLLOW_enumDef_in_typeDef539);
                    enumDef33=enumDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDef33.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:232:37: mixinDef
                    {
                    pushFollow(FOLLOW_mixinDef_in_typeDef543);
                    mixinDef34=mixinDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mixinDef34.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 8, typeDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeDef"

    public static class classDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:233:1: classDef : classHeader classBody -> ^( AST_CLASS classHeader classBody ) ;
    public final FanParser.classDef_return classDef() throws RecognitionException {
        FanParser.classDef_return retval = new FanParser.classDef_return();
        retval.start = input.LT(1);
        int classDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.classHeader_return classHeader35 = null;

        FanParser.classBody_return classBody36 = null;


        RewriteRuleSubtreeStream stream_classHeader=new RewriteRuleSubtreeStream(adaptor,"rule classHeader");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        paraphrase.push("Class definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:234:3: ( classHeader classBody -> ^( AST_CLASS classHeader classBody ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:234:7: classHeader classBody
            {
            pushFollow(FOLLOW_classHeader_in_classDef565);
            classHeader35=classHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classHeader.add(classHeader35.getTree());
            pushFollow(FOLLOW_classBody_in_classDef567);
            classBody36=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBody.add(classBody36.getTree());


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
            // 235:7: -> ^( AST_CLASS classHeader classBody )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:235:10: ^( AST_CLASS classHeader classBody )
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
            if ( state.backtracking>0 ) { memoize(input, 9, classDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDef"

    public static class classHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:236:1: classHeader : docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )? -> ^( AST_ID $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* ;
    public final FanParser.classHeader_return classHeader() throws RecognitionException {
        FanParser.classHeader_return retval = new FanParser.classHeader_return();
        retval.start = input.LT(1);
        int classHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CLASS39=null;
        FanParser.classFlags_return m = null;

        FanParser.id_return cname = null;

        FanParser.docs_return docs37 = null;

        FanParser.facet_return facet38 = null;

        FanParser.inheritance_return inheritance40 = null;


        Object KW_CLASS39_tree=null;
        RewriteRuleTokenStream stream_KW_CLASS=new RewriteRuleTokenStream(adaptor,"token KW_CLASS");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_facet=new RewriteRuleSubtreeStream(adaptor,"rule facet");
        RewriteRuleSubtreeStream stream_docs=new RewriteRuleSubtreeStream(adaptor,"rule docs");
        RewriteRuleSubtreeStream stream_classFlags=new RewriteRuleSubtreeStream(adaptor,"rule classFlags");
        RewriteRuleSubtreeStream stream_inheritance=new RewriteRuleSubtreeStream(adaptor,"rule inheritance");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:13: ( docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )? -> ^( AST_ID $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:15: docs ( facet )* (m= classFlags )* KW_CLASS cname= id ( inheritance )?
            {
            pushFollow(FOLLOW_docs_in_classHeader590);
            docs37=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs37.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:20: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_classHeader592);
            	    facet38=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet38.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:236:28: (m= classFlags )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=KW_CONST && LA9_0<=KW_STATIC)||LA9_0==KW_FINAL||(LA9_0>=KW_ABSTRACT && LA9_0<=KW_INTERNAL)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= classFlags
            	    {
            	    pushFollow(FOLLOW_classFlags_in_classHeader597);
            	    m=classFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            KW_CLASS39=(Token)match(input,KW_CLASS,FOLLOW_KW_CLASS_in_classHeader600); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CLASS.add(KW_CLASS39);

            pushFollow(FOLLOW_id_in_classHeader604);
            cname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(cname.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:236:59: ( inheritance )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SP_COLON) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_classHeader606);
                    inheritance40=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritance.add(inheritance40.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: inheritance, cname, m
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
            // 237:4: -> ^( AST_ID $cname) ( ^( AST_INHERITANCE inheritance ) )? ( ^( AST_MODIFIER $m) )*
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:237:7: ^( AST_ID $cname)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_1);

                adaptor.addChild(root_1, stream_cname.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:237:24: ( ^( AST_INHERITANCE inheritance ) )?
                if ( stream_inheritance.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:237:24: ^( AST_INHERITANCE inheritance )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_INHERITANCE, "AST_INHERITANCE"), root_1);

                    adaptor.addChild(root_1, stream_inheritance.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_inheritance.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:237:56: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:237:56: ^( AST_MODIFIER $m)
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
            if ( state.backtracking>0 ) { memoize(input, 10, classHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classHeader"

    public static class classFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:238:1: classFlags : ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC );
    public final FanParser.classFlags_return classFlags() throws RecognitionException {
        FanParser.classFlags_return retval = new FanParser.classFlags_return();
        retval.start = input.LT(1);
        int classFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ABSTRACT42=null;
        Token KW_FINAL43=null;
        Token KW_CONST44=null;
        Token KW_STATIC45=null;
        FanParser.protection_return protection41 = null;


        Object KW_ABSTRACT42_tree=null;
        Object KW_FINAL43_tree=null;
        Object KW_CONST44_tree=null;
        Object KW_STATIC45_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:238:13: ( protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC )
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:238:15: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_classFlags642);
                    protection41=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection41.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:238:28: KW_ABSTRACT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ABSTRACT42=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_classFlags646); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ABSTRACT42_tree = (Object)adaptor.create(KW_ABSTRACT42);
                    adaptor.addChild(root_0, KW_ABSTRACT42_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:238:42: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL43=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_classFlags650); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL43_tree = (Object)adaptor.create(KW_FINAL43);
                    adaptor.addChild(root_0, KW_FINAL43_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:238:53: KW_CONST
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_CONST44=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_classFlags654); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_CONST44_tree = (Object)adaptor.create(KW_CONST44);
                    adaptor.addChild(root_0, KW_CONST44_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:238:64: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC45=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_classFlags658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC45_tree = (Object)adaptor.create(KW_STATIC45);
                    adaptor.addChild(root_0, KW_STATIC45_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 11, classFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classFlags"

    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:239:1: classBody : bracketL ( slotDef )* bracketR ;
    public final FanParser.classBody_return classBody() throws RecognitionException {
        FanParser.classBody_return retval = new FanParser.classBody_return();
        retval.start = input.LT(1);
        int classBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL46 = null;

        FanParser.slotDef_return slotDef47 = null;

        FanParser.bracketR_return bracketR48 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:239:12: ( bracketL ( slotDef )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:239:14: bracketL ( slotDef )* bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bracketL_in_classBody666);
            bracketL46=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL46.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:239:23: ( slotDef )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=KW_RD_ONLY && LA12_0<=KW_FINAL)||(LA12_0>=KW_ABSTRACT && LA12_0<=KW_ONCE)||LA12_0==SP_PIPE||(LA12_0>=AT && LA12_0<=ID)||LA12_0==DOC||LA12_0==SQ_BRACKET_L) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_classBody668);
            	    slotDef47=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotDef47.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_classBody671);
            bracketR48=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR48.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, classBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBody"

    public static class protection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "protection"
    // src/net/colar/netbeans/fan/antlr/Fan.g:240:1: protection : ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL );
    public final FanParser.protection_return protection() throws RecognitionException {
        FanParser.protection_return retval = new FanParser.protection_return();
        retval.start = input.LT(1);
        int protection_StartIndex = input.index();
        Object root_0 = null;

        Token set49=null;

        Object set49_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:240:12: ( KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            root_0 = (Object)adaptor.nil();

            set49=(Token)input.LT(1);
            if ( (input.LA(1)>=KW_PRIVATE && input.LA(1)<=KW_INTERNAL) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set49));
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
            if ( state.backtracking>0 ) { memoize(input, 13, protection_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "protection"

    public static class mixinDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:241:1: mixinDef : mixinHeader mixinBody ;
    public final FanParser.mixinDef_return mixinDef() throws RecognitionException {
        FanParser.mixinDef_return retval = new FanParser.mixinDef_return();
        retval.start = input.LT(1);
        int mixinDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mixinHeader_return mixinHeader50 = null;

        FanParser.mixinBody_return mixinBody51 = null;



        paraphrase.push("Mixin definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:242:3: ( mixinHeader mixinBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:242:5: mixinHeader mixinBody
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mixinHeader_in_mixinDef708);
            mixinHeader50=mixinHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mixinHeader50.getTree());
            pushFollow(FOLLOW_mixinBody_in_mixinDef710);
            mixinBody51=mixinBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mixinBody51.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 14, mixinDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinDef"

    public static class mixinHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:243:1: mixinHeader : docs ( facet )* ( mixinFlags )* KW_MIXIN id ( inheritance )? ;
    public final FanParser.mixinHeader_return mixinHeader() throws RecognitionException {
        FanParser.mixinHeader_return retval = new FanParser.mixinHeader_return();
        retval.start = input.LT(1);
        int mixinHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_MIXIN55=null;
        FanParser.docs_return docs52 = null;

        FanParser.facet_return facet53 = null;

        FanParser.mixinFlags_return mixinFlags54 = null;

        FanParser.id_return id56 = null;

        FanParser.inheritance_return inheritance57 = null;


        Object KW_MIXIN55_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:243:13: ( docs ( facet )* ( mixinFlags )* KW_MIXIN id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:243:15: docs ( facet )* ( mixinFlags )* KW_MIXIN id ( inheritance )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_mixinHeader717);
            docs52=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs52.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:243:20: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_mixinHeader719);
            	    facet53=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet53.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:243:27: ( mixinFlags )*
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
            	    pushFollow(FOLLOW_mixinFlags_in_mixinHeader722);
            	    mixinFlags54=mixinFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mixinFlags54.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            KW_MIXIN55=(Token)match(input,KW_MIXIN,FOLLOW_KW_MIXIN_in_mixinHeader725); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_MIXIN55_tree = (Object)adaptor.create(KW_MIXIN55);
            adaptor.addChild(root_0, KW_MIXIN55_tree);
            }
            pushFollow(FOLLOW_id_in_mixinHeader727);
            id56=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id56.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:243:51: ( inheritance )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==SP_COLON) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_mixinHeader729);
                    inheritance57=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritance57.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 15, mixinHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinHeader"

    public static class mixinFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:244:1: mixinFlags : ( protection | KW_CONST | KW_STATIC | KW_FINAL );
    public final FanParser.mixinFlags_return mixinFlags() throws RecognitionException {
        FanParser.mixinFlags_return retval = new FanParser.mixinFlags_return();
        retval.start = input.LT(1);
        int mixinFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CONST59=null;
        Token KW_STATIC60=null;
        Token KW_FINAL61=null;
        FanParser.protection_return protection58 = null;


        Object KW_CONST59_tree=null;
        Object KW_STATIC60_tree=null;
        Object KW_FINAL61_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:244:12: ( protection | KW_CONST | KW_STATIC | KW_FINAL )
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:244:14: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_mixinFlags737);
                    protection58=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection58.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:244:27: KW_CONST
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_CONST59=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_mixinFlags741); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_CONST59_tree = (Object)adaptor.create(KW_CONST59);
                    adaptor.addChild(root_0, KW_CONST59_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:244:38: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC60=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_mixinFlags745); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC60_tree = (Object)adaptor.create(KW_STATIC60);
                    adaptor.addChild(root_0, KW_STATIC60_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:244:50: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL61=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_mixinFlags749); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL61_tree = (Object)adaptor.create(KW_FINAL61);
                    adaptor.addChild(root_0, KW_FINAL61_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 16, mixinFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinFlags"

    public static class mixinBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mixinBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:245:1: mixinBody : bracketL ( slotDef )* bracketR ;
    public final FanParser.mixinBody_return mixinBody() throws RecognitionException {
        FanParser.mixinBody_return retval = new FanParser.mixinBody_return();
        retval.start = input.LT(1);
        int mixinBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL62 = null;

        FanParser.slotDef_return slotDef63 = null;

        FanParser.bracketR_return bracketR64 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:245:11: ( bracketL ( slotDef )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:245:13: bracketL ( slotDef )* bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bracketL_in_mixinBody756);
            bracketL62=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL62.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:245:22: ( slotDef )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=KW_RD_ONLY && LA17_0<=KW_FINAL)||(LA17_0>=KW_ABSTRACT && LA17_0<=KW_ONCE)||LA17_0==SP_PIPE||(LA17_0>=AT && LA17_0<=ID)||LA17_0==DOC||LA17_0==SQ_BRACKET_L) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_mixinBody758);
            	    slotDef63=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotDef63.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_mixinBody761);
            bracketR64=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR64.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, mixinBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mixinBody"

    public static class enumDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:246:1: enumDef : enumHeader enumBody ;
    public final FanParser.enumDef_return enumDef() throws RecognitionException {
        FanParser.enumDef_return retval = new FanParser.enumDef_return();
        retval.start = input.LT(1);
        int enumDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.enumHeader_return enumHeader65 = null;

        FanParser.enumBody_return enumBody66 = null;



        paraphrase.push("Enumeration definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:3: ( enumHeader enumBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:247:5: enumHeader enumBody
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_enumHeader_in_enumDef780);
            enumHeader65=enumHeader();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumHeader65.getTree());
            pushFollow(FOLLOW_enumBody_in_enumDef782);
            enumBody66=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumBody66.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 18, enumDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumDef"

    public static class enumHeader_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumHeader"
    // src/net/colar/netbeans/fan/antlr/Fan.g:248:1: enumHeader : docs ( facet )* ( protection )? KW_ENUM id ( inheritance )? ;
    public final FanParser.enumHeader_return enumHeader() throws RecognitionException {
        FanParser.enumHeader_return retval = new FanParser.enumHeader_return();
        retval.start = input.LT(1);
        int enumHeader_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ENUM70=null;
        FanParser.docs_return docs67 = null;

        FanParser.facet_return facet68 = null;

        FanParser.protection_return protection69 = null;

        FanParser.id_return id71 = null;

        FanParser.inheritance_return inheritance72 = null;


        Object KW_ENUM70_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:248:12: ( docs ( facet )* ( protection )? KW_ENUM id ( inheritance )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:248:17: docs ( facet )* ( protection )? KW_ENUM id ( inheritance )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_enumHeader792);
            docs67=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs67.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:248:22: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_enumHeader794);
            	    facet68=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet68.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:248:29: ( protection )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=KW_PRIVATE && LA19_0<=KW_INTERNAL)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    {
                    pushFollow(FOLLOW_protection_in_enumHeader797);
                    protection69=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection69.getTree());

                    }
                    break;

            }

            KW_ENUM70=(Token)match(input,KW_ENUM,FOLLOW_KW_ENUM_in_enumHeader800); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_ENUM70_tree = (Object)adaptor.create(KW_ENUM70);
            adaptor.addChild(root_0, KW_ENUM70_tree);
            }
            pushFollow(FOLLOW_id_in_enumHeader802);
            id71=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id71.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:248:52: ( inheritance )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==SP_COLON) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: inheritance
                    {
                    pushFollow(FOLLOW_inheritance_in_enumHeader804);
                    inheritance72=inheritance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritance72.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 19, enumHeader_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumHeader"

    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:249:1: enumBody : bracketL enumValDefs ( slotDef )* bracketR ;
    public final FanParser.enumBody_return enumBody() throws RecognitionException {
        FanParser.enumBody_return retval = new FanParser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL73 = null;

        FanParser.enumValDefs_return enumValDefs74 = null;

        FanParser.slotDef_return slotDef75 = null;

        FanParser.bracketR_return bracketR76 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:249:10: ( bracketL enumValDefs ( slotDef )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:249:12: bracketL enumValDefs ( slotDef )* bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bracketL_in_enumBody812);
            bracketL73=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL73.getTree());
            pushFollow(FOLLOW_enumValDefs_in_enumBody814);
            enumValDefs74=enumValDefs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValDefs74.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:249:33: ( slotDef )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=KW_RD_ONLY && LA21_0<=KW_FINAL)||(LA21_0>=KW_ABSTRACT && LA21_0<=KW_ONCE)||LA21_0==SP_PIPE||(LA21_0>=AT && LA21_0<=ID)||LA21_0==DOC||LA21_0==SQ_BRACKET_L) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: slotDef
            	    {
            	    pushFollow(FOLLOW_slotDef_in_enumBody816);
            	    slotDef75=slotDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotDef75.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_enumBody819);
            bracketR76=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR76.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBody"

    public static class inheritance_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritance"
    // src/net/colar/netbeans/fan/antlr/Fan.g:250:1: inheritance : SP_COLON typeList ;
    public final FanParser.inheritance_return inheritance() throws RecognitionException {
        FanParser.inheritance_return retval = new FanParser.inheritance_return();
        retval.start = input.LT(1);
        int inheritance_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON77=null;
        FanParser.typeList_return typeList78 = null;


        Object SP_COLON77_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:250:14: ( SP_COLON typeList )
            // src/net/colar/netbeans/fan/antlr/Fan.g:250:16: SP_COLON typeList
            {
            root_0 = (Object)adaptor.nil();

            SP_COLON77=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_inheritance828); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON77_tree = (Object)adaptor.create(SP_COLON77);
            adaptor.addChild(root_0, SP_COLON77_tree);
            }
            pushFollow(FOLLOW_typeList_in_inheritance830);
            typeList78=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList78.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, inheritance_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritance"

    public static class enumValDefs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValDefs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:252:1: enumValDefs : enumValDef ( SP_COMMA enumValDef )* eos ;
    public final FanParser.enumValDefs_return enumValDefs() throws RecognitionException {
        FanParser.enumValDefs_return retval = new FanParser.enumValDefs_return();
        retval.start = input.LT(1);
        int enumValDefs_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA80=null;
        FanParser.enumValDef_return enumValDef79 = null;

        FanParser.enumValDef_return enumValDef81 = null;

        FanParser.eos_return eos82 = null;


        Object SP_COMMA80_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:252:14: ( enumValDef ( SP_COMMA enumValDef )* eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:252:16: enumValDef ( SP_COMMA enumValDef )* eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_enumValDef_in_enumValDefs840);
            enumValDef79=enumValDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValDef79.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:252:27: ( SP_COMMA enumValDef )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==SP_COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:252:28: SP_COMMA enumValDef
            	    {
            	    SP_COMMA80=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_enumValDefs843); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA80_tree = (Object)adaptor.create(SP_COMMA80);
            	    adaptor.addChild(root_0, SP_COMMA80_tree);
            	    }
            	    pushFollow(FOLLOW_enumValDef_in_enumValDefs846);
            	    enumValDef81=enumValDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValDef81.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            pushFollow(FOLLOW_eos_in_enumValDefs850);
            eos82=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos82.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, enumValDefs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValDefs"

    public static class enumValDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:253:1: enumValDef : docs id ( parL ( args )? parR )? ;
    public final FanParser.enumValDef_return enumValDef() throws RecognitionException {
        FanParser.enumValDef_return retval = new FanParser.enumValDef_return();
        retval.start = input.LT(1);
        int enumValDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.docs_return docs83 = null;

        FanParser.id_return id84 = null;

        FanParser.parL_return parL85 = null;

        FanParser.args_return args86 = null;

        FanParser.parR_return parR87 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:13: ( docs id ( parL ( args )? parR )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:15: docs id ( parL ( args )? parR )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_enumValDef858);
            docs83=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs83.getTree());
            pushFollow(FOLLOW_id_in_enumValDef860);
            id84=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id84.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:253:23: ( parL ( args )? parR )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==PAR_L) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:253:24: parL ( args )? parR
                    {
                    pushFollow(FOLLOW_parL_in_enumValDef863);
                    parL85=parL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parL85.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:253:29: ( args )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=KW_THIS && LA23_0<=KW_SUPER)||(LA23_0>=KW_NULL && LA23_0<=KW_FALSE)||LA23_0==SP_PIPE||LA23_0==OP_CURRY||(LA23_0>=OP_PLUS && LA23_0<=OP_MINUS)||(LA23_0>=OP_BANG && LA23_0<=OP_TILDA)||(LA23_0>=AT && LA23_0<=OP_POUND)||LA23_0==NUMBER||LA23_0==SQ_BRACKET_L||LA23_0==PAR_L) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                            {
                            pushFollow(FOLLOW_args_in_enumValDef865);
                            args86=args();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, args86.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_parR_in_enumValDef868);
                    parR87=parR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parR87.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 23, enumValDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValDef"

    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeList"
    // src/net/colar/netbeans/fan/antlr/Fan.g:254:1: typeList : type ( SP_COMMA type )* ;
    public final FanParser.typeList_return typeList() throws RecognitionException {
        FanParser.typeList_return retval = new FanParser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA89=null;
        FanParser.type_return type88 = null;

        FanParser.type_return type90 = null;


        Object SP_COMMA89_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:254:10: ( type ( SP_COMMA type )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:254:14: type ( SP_COMMA type )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_typeList879);
            type88=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type88.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:254:19: ( SP_COMMA type )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==SP_COMMA) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:254:20: SP_COMMA type
            	    {
            	    SP_COMMA89=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_typeList882); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA89_tree = (Object)adaptor.create(SP_COMMA89);
            	    adaptor.addChild(root_0, SP_COMMA89_tree);
            	    }
            	    pushFollow(FOLLOW_type_in_typeList884);
            	    type90=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type90.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
            if ( state.backtracking>0 ) { memoize(input, 24, typeList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeList"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // src/net/colar/netbeans/fan/antlr/Fan.g:256:1: type : typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ;
    public final FanParser.type_return type() throws RecognitionException {
        FanParser.type_return retval = new FanParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK92=null;
        Token LIST_TYPE93=null;
        Token SP_QMARK94=null;
        FanParser.typeRoot_return typeRoot91 = null;


        Object SP_QMARK92_tree=null;
        Object LIST_TYPE93_tree=null;
        Object SP_QMARK94_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:256:14: ( typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:256:18: typeRoot ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeRoot_in_type904);
            typeRoot91=typeRoot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeRoot91.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:256:28: ( SP_QMARK )?
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
                    SP_QMARK92=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type907); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_QMARK92_tree = (Object)adaptor.create(SP_QMARK92);
                    adaptor.addChild(root_0, SP_QMARK92_tree);
                    }

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:256:38: ( LIST_TYPE ( SP_QMARK )? )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:256:39: LIST_TYPE ( SP_QMARK )?
            	    {
            	    LIST_TYPE93=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_type911); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LIST_TYPE93_tree = (Object)adaptor.create(LIST_TYPE93);
            	    adaptor.addChild(root_0, LIST_TYPE93_tree);
            	    }
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:256:49: ( SP_QMARK )?
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
            	            SP_QMARK94=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_type913); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK94_tree = (Object)adaptor.create(SP_QMARK94);
            	            adaptor.addChild(root_0, SP_QMARK94_tree);
            	            }

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

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class nonMapType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonMapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:257:1: nonMapType : ( funcType | simpleType );
    public final FanParser.nonMapType_return nonMapType() throws RecognitionException {
        FanParser.nonMapType_return retval = new FanParser.nonMapType_return();
        retval.start = input.LT(1);
        int nonMapType_StartIndex = input.index();
        Object root_0 = null;

        FanParser.funcType_return funcType95 = null;

        FanParser.simpleType_return simpleType96 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:257:12: ( funcType | simpleType )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==SP_PIPE) ) {
                alt29=1;
            }
            else if ( (LA29_0==ID) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:257:14: funcType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_nonMapType924);
                    funcType95=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType95.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:257:25: simpleType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simpleType_in_nonMapType928);
                    simpleType96=simpleType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType96.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 26, nonMapType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nonMapType"

    public static class typeRoot_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeRoot"
    // src/net/colar/netbeans/fan/antlr/Fan.g:258:1: typeRoot : ( mapType | nonMapType );
    public final FanParser.typeRoot_return typeRoot() throws RecognitionException {
        FanParser.typeRoot_return retval = new FanParser.typeRoot_return();
        retval.start = input.LT(1);
        int typeRoot_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mapType_return mapType97 = null;

        FanParser.nonMapType_return nonMapType98 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:258:10: ( mapType | nonMapType )
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:258:12: mapType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_mapType_in_typeRoot935);
                    mapType97=mapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapType97.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:258:22: nonMapType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nonMapType_in_typeRoot939);
                    nonMapType98=nonMapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonMapType98.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 27, typeRoot_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeRoot"

    public static class simpleType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:259:1: simpleType : id ( SP_COLCOL id )? ;
    public final FanParser.simpleType_return simpleType() throws RecognitionException {
        FanParser.simpleType_return retval = new FanParser.simpleType_return();
        retval.start = input.LT(1);
        int simpleType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLCOL100=null;
        FanParser.id_return id99 = null;

        FanParser.id_return id101 = null;


        Object SP_COLCOL100_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:17: ( id ( SP_COLCOL id )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:21: id ( SP_COLCOL id )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_simpleType953);
            id99=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id99.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:259:24: ( SP_COLCOL id )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SP_COLCOL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:259:25: SP_COLCOL id
                    {
                    SP_COLCOL100=(Token)match(input,SP_COLCOL,FOLLOW_SP_COLCOL_in_simpleType956); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLCOL100_tree = (Object)adaptor.create(SP_COLCOL100);
                    adaptor.addChild(root_0, SP_COLCOL100_tree);
                    }
                    pushFollow(FOLLOW_id_in_simpleType958);
                    id101=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id101.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 28, simpleType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleType"

    public static class mapType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:261:1: mapType : ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? ;
    public final FanParser.mapType_return mapType() throws RecognitionException {
        FanParser.mapType_return retval = new FanParser.mapType_return();
        retval.start = input.LT(1);
        int mapType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK104=null;
        Token LIST_TYPE105=null;
        Token SP_QMARK106=null;
        Token SP_COLON107=null;
        FanParser.sq_bracketL_return sq_bracketL102 = null;

        FanParser.nonMapType_return nonMapType103 = null;

        FanParser.type_return type108 = null;

        FanParser.sq_bracketR_return sq_bracketR109 = null;


        Object SP_QMARK104_tree=null;
        Object LIST_TYPE105_tree=null;
        Object SP_QMARK106_tree=null;
        Object SP_COLON107_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:261:10: ( ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:261:12: ( sq_bracketL )? nonMapType ( SP_QMARK )? ( LIST_TYPE ( SP_QMARK )? )* ({...}? SP_COLON {...}? type )+ ( sq_bracketR )?
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:261:12: ( sq_bracketL )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==SQ_BRACKET_L) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: sq_bracketL
                    {
                    pushFollow(FOLLOW_sq_bracketL_in_mapType969);
                    sq_bracketL102=sq_bracketL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL102.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_nonMapType_in_mapType972);
            nonMapType103=nonMapType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, nonMapType103.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:261:36: ( SP_QMARK )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==SP_QMARK) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                    {
                    SP_QMARK104=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType974); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_QMARK104_tree = (Object)adaptor.create(SP_QMARK104);
                    adaptor.addChild(root_0, SP_QMARK104_tree);
                    }

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:261:46: ( LIST_TYPE ( SP_QMARK )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LIST_TYPE) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:261:47: LIST_TYPE ( SP_QMARK )?
            	    {
            	    LIST_TYPE105=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_mapType978); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LIST_TYPE105_tree = (Object)adaptor.create(LIST_TYPE105);
            	    adaptor.addChild(root_0, LIST_TYPE105_tree);
            	    }
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:261:57: ( SP_QMARK )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==SP_QMARK) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK106=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_mapType980); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK106_tree = (Object)adaptor.create(SP_QMARK106);
            	            adaptor.addChild(root_0, SP_QMARK106_tree);
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

            // src/net/colar/netbeans/fan/antlr/Fan.g:262:5: ({...}? SP_COLON {...}? type )+
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:262:6: {...}? SP_COLON {...}? type
            	    {
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    SP_COLON107=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapType992); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COLON107_tree = (Object)adaptor.create(SP_COLON107);
            	    adaptor.addChild(root_0, SP_COLON107_tree);
            	    }
            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "mapType", "notAfterEol()");
            	    }
            	    pushFollow(FOLLOW_type_in_mapType996);
            	    type108=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type108.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:262:56: ( sq_bracketR )?
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: sq_bracketR
                    {
                    pushFollow(FOLLOW_sq_bracketR_in_mapType1000);
                    sq_bracketR109=sq_bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR109.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 29, mapType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapType"

    public static class funcType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:263:1: funcType : SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE ;
    public final FanParser.funcType_return funcType() throws RecognitionException {
        FanParser.funcType_return retval = new FanParser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token SP_PIPE110=null;
        Token SP_COMMA111=null;
        Token SP_PIPE115=null;
        FanParser.formals_return formals112 = null;

        FanParser.assignedType_return assignedType113 = null;

        FanParser.assignedType_return assignedType114 = null;


        Object SP_PIPE110_tree=null;
        Object SP_COMMA111_tree=null;
        Object SP_PIPE115_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:263:11: ( SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE )
            // src/net/colar/netbeans/fan/antlr/Fan.g:263:13: SP_PIPE ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) ) SP_PIPE
            {
            root_0 = (Object)adaptor.nil();

            SP_PIPE110=(Token)match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType1009); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_PIPE110_tree = (Object)adaptor.create(SP_PIPE110);
            adaptor.addChild(root_0, SP_PIPE110_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:263:21: ( SP_COMMA | ( formals ( ( OP_ARROW )=> assignedType )? ) | ( ( OP_ARROW )=> assignedType ) )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==SP_COMMA) ) {
                alt39=1;
            }
            else if ( (LA39_0==SP_PIPE||LA39_0==ID||LA39_0==SQ_BRACKET_L) ) {
                alt39=2;
            }
            else if ( (LA39_0==OP_ARROW) && (synpred53_Fan())) {
                alt39=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:263:22: SP_COMMA
                    {
                    SP_COMMA111=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_funcType1012); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COMMA111_tree = (Object)adaptor.create(SP_COMMA111);
                    adaptor.addChild(root_0, SP_COMMA111_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:263:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:263:33: ( formals ( ( OP_ARROW )=> assignedType )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:263:34: formals ( ( OP_ARROW )=> assignedType )?
                    {
                    pushFollow(FOLLOW_formals_in_funcType1017);
                    formals112=formals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formals112.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:263:42: ( ( OP_ARROW )=> assignedType )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==OP_ARROW) && (synpred51_Fan())) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:263:43: ( OP_ARROW )=> assignedType
                            {
                            pushFollow(FOLLOW_assignedType_in_funcType1024);
                            assignedType113=assignedType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType113.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:263:73: ( ( OP_ARROW )=> assignedType )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:263:73: ( ( OP_ARROW )=> assignedType )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:263:74: ( OP_ARROW )=> assignedType
                    {
                    pushFollow(FOLLOW_assignedType_in_funcType1036);
                    assignedType114=assignedType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignedType114.getTree());

                    }


                    }
                    break;

            }

            SP_PIPE115=(Token)match(input,SP_PIPE,FOLLOW_SP_PIPE_in_funcType1040); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_PIPE115_tree = (Object)adaptor.create(SP_PIPE115);
            adaptor.addChild(root_0, SP_PIPE115_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 30, funcType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcType"

    public static class assignedType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignedType"
    // src/net/colar/netbeans/fan/antlr/Fan.g:264:1: assignedType : OP_ARROW type ;
    public final FanParser.assignedType_return assignedType() throws RecognitionException {
        FanParser.assignedType_return retval = new FanParser.assignedType_return();
        retval.start = input.LT(1);
        int assignedType_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW116=null;
        FanParser.type_return type117 = null;


        Object OP_ARROW116_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:264:14: ( OP_ARROW type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:264:16: OP_ARROW type
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW116=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_assignedType1047); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW116_tree = (Object)adaptor.create(OP_ARROW116);
            adaptor.addChild(root_0, OP_ARROW116_tree);
            }
            pushFollow(FOLLOW_type_in_assignedType1049);
            type117=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type117.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, assignedType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignedType"

    public static class formals_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formals"
    // src/net/colar/netbeans/fan/antlr/Fan.g:265:1: formals : formal ( SP_COMMA formal )* ;
    public final FanParser.formals_return formals() throws RecognitionException {
        FanParser.formals_return retval = new FanParser.formals_return();
        retval.start = input.LT(1);
        int formals_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA119=null;
        FanParser.formal_return formal118 = null;

        FanParser.formal_return formal120 = null;


        Object SP_COMMA119_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:265:10: ( formal ( SP_COMMA formal )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:265:14: formal ( SP_COMMA formal )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_formal_in_formals1059);
            formal118=formal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formal118.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:265:21: ( SP_COMMA formal )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==SP_COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:265:22: SP_COMMA formal
            	    {
            	    SP_COMMA119=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_formals1062); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA119_tree = (Object)adaptor.create(SP_COMMA119);
            	    adaptor.addChild(root_0, SP_COMMA119_tree);
            	    }
            	    pushFollow(FOLLOW_formal_in_formals1064);
            	    formal120=formal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal120.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
            if ( state.backtracking>0 ) { memoize(input, 32, formals_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formals"

    public static class formal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:266:1: formal : ( formalFull | formalTypeOnly | formalInferred );
    public final FanParser.formal_return formal() throws RecognitionException {
        FanParser.formal_return retval = new FanParser.formal_return();
        retval.start = input.LT(1);
        int formal_StartIndex = input.index();
        Object root_0 = null;

        FanParser.formalFull_return formalFull121 = null;

        FanParser.formalTypeOnly_return formalTypeOnly122 = null;

        FanParser.formalInferred_return formalInferred123 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:266:9: ( formalFull | formalTypeOnly | formalInferred )
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:266:11: formalFull
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalFull_in_formal1074);
                    formalFull121=formalFull();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalFull121.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:266:24: formalTypeOnly
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalTypeOnly_in_formal1078);
                    formalTypeOnly122=formalTypeOnly();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalTypeOnly122.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:266:41: formalInferred
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formalInferred_in_formal1082);
                    formalInferred123=formalInferred();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formalInferred123.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 33, formal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formal"

    public static class formalFull_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalFull"
    // src/net/colar/netbeans/fan/antlr/Fan.g:267:1: formalFull : type id ;
    public final FanParser.formalFull_return formalFull() throws RecognitionException {
        FanParser.formalFull_return retval = new FanParser.formalFull_return();
        retval.start = input.LT(1);
        int formalFull_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type124 = null;

        FanParser.id_return id125 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:17: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:267:19: type id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalFull1094);
            type124=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type124.getTree());
            pushFollow(FOLLOW_id_in_formalFull1096);
            id125=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id125.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, formalFull_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalFull"

    public static class formalTypeOnly_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalTypeOnly"
    // src/net/colar/netbeans/fan/antlr/Fan.g:268:1: formalTypeOnly : type ;
    public final FanParser.formalTypeOnly_return formalTypeOnly() throws RecognitionException {
        FanParser.formalTypeOnly_return retval = new FanParser.formalTypeOnly_return();
        retval.start = input.LT(1);
        int formalTypeOnly_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type126 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:268:17: ( type )
            // src/net/colar/netbeans/fan/antlr/Fan.g:268:21: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_formalTypeOnly1106);
            type126=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type126.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, formalTypeOnly_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalTypeOnly"

    public static class formalInferred_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalInferred"
    // src/net/colar/netbeans/fan/antlr/Fan.g:269:1: formalInferred : id ;
    public final FanParser.formalInferred_return formalInferred() throws RecognitionException {
        FanParser.formalInferred_return retval = new FanParser.formalInferred_return();
        retval.start = input.LT(1);
        int formalInferred_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id127 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:17: ( id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:269:21: id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_formalInferred1116);
            id127=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id127.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, formalInferred_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalInferred"

    public static class slotDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slotDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:270:1: slotDef : ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) ;
    public final FanParser.slotDef_return slotDef() throws RecognitionException {
        FanParser.slotDef_return retval = new FanParser.slotDef_return();
        retval.start = input.LT(1);
        int slotDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.staticBlock_return staticBlock128 = null;

        FanParser.docs_return docs129 = null;

        FanParser.facet_return facet130 = null;

        FanParser.ctorDef_return ctorDef131 = null;

        FanParser.methodDef_return methodDef132 = null;

        FanParser.fieldDef_return fieldDef133 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:270:10: ( ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:270:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:270:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:270:13: ( KW_STATIC bracketL )=> staticBlock
                    {
                    pushFollow(FOLLOW_staticBlock_in_slotDef1132);
                    staticBlock128=staticBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticBlock128.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:5: ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:6: docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    {
                    pushFollow(FOLLOW_docs_in_slotDef1140);
                    docs129=docs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, docs129.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:271:11: ( facet )*
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
                    	    pushFollow(FOLLOW_facet_in_slotDef1142);
                    	    facet130=facet();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet130.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:272:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )
                    int alt43=3;
                    alt43 = dfa43.predict(input);
                    switch (alt43) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:273:7: ( ( ctorFlags )* KW_NEW )=> ctorDef
                            {
                            pushFollow(FOLLOW_ctorDef_in_slotDef1165);
                            ctorDef131=ctorDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorDef131.getTree());

                            }
                            break;
                        case 2 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:274:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef
                            {
                            pushFollow(FOLLOW_methodDef_in_slotDef1192);
                            methodDef132=methodDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDef132.getTree());

                            }
                            break;
                        case 3 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:275:7: fieldDef
                            {
                            pushFollow(FOLLOW_fieldDef_in_slotDef1202);
                            fieldDef133=fieldDef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDef133.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 37, slotDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slotDef"

    public static class fieldDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:279:1: fieldDef : docs ( facet )* fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) ;
    public final FanParser.fieldDef_return fieldDef() throws RecognitionException {
        FanParser.fieldDef_return retval = new FanParser.fieldDef_return();
        retval.start = input.LT(1);
        int fieldDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL138=null;
        Token SP_SEMI144=null;
        FanParser.docs_return docs134 = null;

        FanParser.facet_return facet135 = null;

        FanParser.fieldFlags_return fieldFlags136 = null;

        FanParser.typeId_return typeId137 = null;

        FanParser.expr_return expr139 = null;

        FanParser.bracketL_return bracketL140 = null;

        FanParser.protection_return protection141 = null;

        FanParser.getter_return getter142 = null;

        FanParser.setter_return setter143 = null;

        FanParser.block_return block145 = null;

        FanParser.bracketR_return bracketR146 = null;

        FanParser.eos_return eos147 = null;


        Object AS_INIT_VAL138_tree=null;
        Object SP_SEMI144_tree=null;

        paraphrase.push("Field definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:3: ( docs ( facet )* fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:5: docs ( facet )* fieldFlags typeId ( AS_INIT_VAL expr )? ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_fieldDef1238);
            docs134=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs134.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:10: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_fieldDef1240);
            	    facet135=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet135.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            pushFollow(FOLLOW_fieldFlags_in_fieldDef1243);
            fieldFlags136=fieldFlags();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldFlags136.getTree());
            pushFollow(FOLLOW_typeId_in_fieldDef1245);
            typeId137=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId137.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:280:35: ( AS_INIT_VAL expr )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==AS_INIT_VAL) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:280:36: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL138=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_fieldDef1248); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_INIT_VAL138_tree = (Object)adaptor.create(AS_INIT_VAL138);
                    adaptor.addChild(root_0, AS_INIT_VAL138_tree);
                    }
                    pushFollow(FOLLOW_expr_in_fieldDef1250);
                    expr139=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr139.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:281:5: ( ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR ) | eos )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==BRACKET_L) ) {
                alt52=1;
            }
            else if ( (LA52_0==EOF||(LA52_0>=KW_RD_ONLY && LA52_0<=KW_FINAL)||(LA52_0>=KW_ABSTRACT && LA52_0<=KW_ONCE)||LA52_0==SP_PIPE||LA52_0==SP_SEMI||(LA52_0>=AT && LA52_0<=ID)||LA52_0==DOC||(LA52_0>=BRACKET_R && LA52_0<=SQ_BRACKET_L)) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:282:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:282:5: ( bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:282:6: bracketL ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+ bracketR
                    {
                    pushFollow(FOLLOW_bracketL_in_fieldDef1265);
                    bracketL140=bracketL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL140.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:282:15: ( ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )? )+
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
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:282:16: ( protection )? ( getter | setter ) ( SP_SEMI )? ( block )?
                    	    {
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:282:16: ( protection )?
                    	    int alt47=2;
                    	    int LA47_0 = input.LA(1);

                    	    if ( ((LA47_0>=KW_PRIVATE && LA47_0<=KW_INTERNAL)) ) {
                    	        alt47=1;
                    	    }
                    	    switch (alt47) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                    	            {
                    	            pushFollow(FOLLOW_protection_in_fieldDef1268);
                    	            protection141=protection();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, protection141.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:282:28: ( getter | setter )
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
                    	            if (state.backtracking>0) {state.failed=true; return retval;}
                    	            NoViableAltException nvae =
                    	                new NoViableAltException("", 48, 1, input);

                    	            throw nvae;
                    	        }
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 48, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt48) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:282:29: getter
                    	            {
                    	            pushFollow(FOLLOW_getter_in_fieldDef1272);
                    	            getter142=getter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, getter142.getTree());

                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:282:38: setter
                    	            {
                    	            pushFollow(FOLLOW_setter_in_fieldDef1276);
                    	            setter143=setter();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, setter143.getTree());

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:282:46: ( SP_SEMI )?
                    	    int alt49=2;
                    	    int LA49_0 = input.LA(1);

                    	    if ( (LA49_0==SP_SEMI) ) {
                    	        alt49=1;
                    	    }
                    	    switch (alt49) {
                    	        case 1 :
                    	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
                    	            {
                    	            SP_SEMI144=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_fieldDef1279); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            SP_SEMI144_tree = (Object)adaptor.create(SP_SEMI144);
                    	            adaptor.addChild(root_0, SP_SEMI144_tree);
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:282:55: ( block )?
                    	    int alt50=2;
                    	    int LA50_0 = input.LA(1);

                    	    if ( ((LA50_0>=KW_BREAK && LA50_0<=KW_TRY)||(LA50_0>=KW_THIS && LA50_0<=KW_SUPER)||(LA50_0>=KW_NULL && LA50_0<=KW_FALSE)||LA50_0==SP_PIPE||LA50_0==OP_CURRY||(LA50_0>=OP_PLUS && LA50_0<=OP_MINUS)||(LA50_0>=OP_BANG && LA50_0<=OP_TILDA)||LA50_0==AT||(LA50_0>=QUOTSTR && LA50_0<=OP_POUND)||(LA50_0>=NUMBER && LA50_0<=BRACKET_L)||LA50_0==SQ_BRACKET_L||LA50_0==PAR_L) ) {
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
                    	            pushFollow(FOLLOW_block_in_fieldDef1282);
                    	            block145=block();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, block145.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);

                    pushFollow(FOLLOW_bracketR_in_fieldDef1287);
                    bracketR146=bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR146.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:283:7: eos
                    {
                    pushFollow(FOLLOW_eos_in_fieldDef1296);
                    eos147=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos147.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 38, fieldDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldDef"

    public static class typeId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:285:1: typeId : ( ( type id )=> typeAndId | id ) ;
    public final FanParser.typeId_return typeId() throws RecognitionException {
        FanParser.typeId_return retval = new FanParser.typeId_return();
        retval.start = input.LT(1);
        int typeId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeAndId_return typeAndId148 = null;

        FanParser.id_return id149 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:285:9: ( ( ( type id )=> typeAndId | id ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:285:11: ( ( type id )=> typeAndId | id )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:285:11: ( ( type id )=> typeAndId | id )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:12: ( type id )=> typeAndId
                    {
                    pushFollow(FOLLOW_typeAndId_in_typeId1313);
                    typeAndId148=typeAndId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeAndId148.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:285:35: id
                    {
                    pushFollow(FOLLOW_id_in_typeId1317);
                    id149=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id149.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 39, typeId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeId"

    public static class typeAndId_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeAndId"
    // src/net/colar/netbeans/fan/antlr/Fan.g:286:1: typeAndId : type id ;
    public final FanParser.typeAndId_return typeAndId() throws RecognitionException {
        FanParser.typeAndId_return retval = new FanParser.typeAndId_return();
        retval.start = input.LT(1);
        int typeAndId_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type150 = null;

        FanParser.id_return id151 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:11: ( type id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:286:13: type id
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_typeAndId1325);
            type150=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type150.getTree());
            pushFollow(FOLLOW_id_in_typeAndId1327);
            id151=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id151.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, typeAndId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeAndId"

    public static class fieldFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:287:1: fieldFlags : ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* ;
    public final FanParser.fieldFlags_return fieldFlags() throws RecognitionException {
        FanParser.fieldFlags_return retval = new FanParser.fieldFlags_return();
        retval.start = input.LT(1);
        int fieldFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_ABSTRACT152=null;
        Token KW_RD_ONLY153=null;
        Token KW_CONST154=null;
        Token KW_STATIC155=null;
        Token KW_NATIVE156=null;
        Token KW_VOLATILE157=null;
        Token KW_OVERRIDE158=null;
        Token KW_VIRTUAL159=null;
        Token KW_FINAL160=null;
        FanParser.protection_return protection161 = null;


        Object KW_ABSTRACT152_tree=null;
        Object KW_RD_ONLY153_tree=null;
        Object KW_CONST154_tree=null;
        Object KW_STATIC155_tree=null;
        Object KW_NATIVE156_tree=null;
        Object KW_VOLATILE157_tree=null;
        Object KW_OVERRIDE158_tree=null;
        Object KW_VIRTUAL159_tree=null;
        Object KW_FINAL160_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:12: ( ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:287:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:287:14: ( KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:287:15: KW_ABSTRACT
            	    {
            	    KW_ABSTRACT152=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_fieldFlags1335); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_ABSTRACT152_tree = (Object)adaptor.create(KW_ABSTRACT152);
            	    adaptor.addChild(root_0, KW_ABSTRACT152_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:287:29: KW_RD_ONLY
            	    {
            	    KW_RD_ONLY153=(Token)match(input,KW_RD_ONLY,FOLLOW_KW_RD_ONLY_in_fieldFlags1339); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_RD_ONLY153_tree = (Object)adaptor.create(KW_RD_ONLY153);
            	    adaptor.addChild(root_0, KW_RD_ONLY153_tree);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:287:42: KW_CONST
            	    {
            	    KW_CONST154=(Token)match(input,KW_CONST,FOLLOW_KW_CONST_in_fieldFlags1343); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_CONST154_tree = (Object)adaptor.create(KW_CONST154);
            	    adaptor.addChild(root_0, KW_CONST154_tree);
            	    }

            	    }
            	    break;
            	case 4 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:287:53: KW_STATIC
            	    {
            	    KW_STATIC155=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_fieldFlags1347); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_STATIC155_tree = (Object)adaptor.create(KW_STATIC155);
            	    adaptor.addChild(root_0, KW_STATIC155_tree);
            	    }

            	    }
            	    break;
            	case 5 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:287:65: KW_NATIVE
            	    {
            	    KW_NATIVE156=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_fieldFlags1351); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_NATIVE156_tree = (Object)adaptor.create(KW_NATIVE156);
            	    adaptor.addChild(root_0, KW_NATIVE156_tree);
            	    }

            	    }
            	    break;
            	case 6 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:287:77: KW_VOLATILE
            	    {
            	    KW_VOLATILE157=(Token)match(input,KW_VOLATILE,FOLLOW_KW_VOLATILE_in_fieldFlags1355); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VOLATILE157_tree = (Object)adaptor.create(KW_VOLATILE157);
            	    adaptor.addChild(root_0, KW_VOLATILE157_tree);
            	    }

            	    }
            	    break;
            	case 7 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:287:91: KW_OVERRIDE
            	    {
            	    KW_OVERRIDE158=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_fieldFlags1359); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_OVERRIDE158_tree = (Object)adaptor.create(KW_OVERRIDE158);
            	    adaptor.addChild(root_0, KW_OVERRIDE158_tree);
            	    }

            	    }
            	    break;
            	case 8 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:287:105: KW_VIRTUAL
            	    {
            	    KW_VIRTUAL159=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_fieldFlags1363); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_VIRTUAL159_tree = (Object)adaptor.create(KW_VIRTUAL159);
            	    adaptor.addChild(root_0, KW_VIRTUAL159_tree);
            	    }

            	    }
            	    break;
            	case 9 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:287:118: KW_FINAL
            	    {
            	    KW_FINAL160=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_fieldFlags1367); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    KW_FINAL160_tree = (Object)adaptor.create(KW_FINAL160);
            	    adaptor.addChild(root_0, KW_FINAL160_tree);
            	    }

            	    }
            	    break;
            	case 10 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:287:129: protection
            	    {
            	    pushFollow(FOLLOW_protection_in_fieldFlags1371);
            	    protection161=protection();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection161.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
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
            if ( state.backtracking>0 ) { memoize(input, 41, fieldFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldFlags"

    public static class methodDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:288:1: methodDef : docs ( facet )* (m= methodFlags )* type mname= id parL params parR methodBody -> ^( AST_METHOD ^( AST_ID $mname) ^( AST_RETURN type ) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ) ;
    public final FanParser.methodDef_return methodDef() throws RecognitionException {
        FanParser.methodDef_return retval = new FanParser.methodDef_return();
        retval.start = input.LT(1);
        int methodDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.methodFlags_return m = null;

        FanParser.id_return mname = null;

        FanParser.docs_return docs162 = null;

        FanParser.facet_return facet163 = null;

        FanParser.type_return type164 = null;

        FanParser.parL_return parL165 = null;

        FanParser.params_return params166 = null;

        FanParser.parR_return parR167 = null;

        FanParser.methodBody_return methodBody168 = null;


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
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:3: ( docs ( facet )* (m= methodFlags )* type mname= id parL params parR methodBody -> ^( AST_METHOD ^( AST_ID $mname) ^( AST_RETURN type ) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:5: docs ( facet )* (m= methodFlags )* type mname= id parL params parR methodBody
            {
            pushFollow(FOLLOW_docs_in_methodDef1391);
            docs162=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_docs.add(docs162.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:289:10: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_methodDef1393);
            	    facet163=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_facet.add(facet163.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:289:18: (m= methodFlags )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=KW_STATIC && LA56_0<=KW_NATIVE)||(LA56_0>=KW_OVERRIDE && LA56_0<=KW_FINAL)||(LA56_0>=KW_ABSTRACT && LA56_0<=KW_INTERNAL)||LA56_0==KW_ONCE) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: m= methodFlags
            	    {
            	    pushFollow(FOLLOW_methodFlags_in_methodDef1398);
            	    m=methodFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_methodFlags.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            pushFollow(FOLLOW_type_in_methodDef1401);
            type164=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type164.getTree());
            pushFollow(FOLLOW_id_in_methodDef1407);
            mname=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(mname.getTree());
            pushFollow(FOLLOW_parL_in_methodDef1409);
            parL165=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parL.add(parL165.getTree());
            pushFollow(FOLLOW_params_in_methodDef1411);
            params166=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_params.add(params166.getTree());
            pushFollow(FOLLOW_parR_in_methodDef1413);
            parR167=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parR.add(parR167.getTree());
            pushFollow(FOLLOW_methodBody_in_methodDef1415);
            methodBody168=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_methodBody.add(methodBody168.getTree());


            // AST REWRITE
            // elements: params, mname, m, type
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
            // 290:7: -> ^( AST_METHOD ^( AST_ID $mname) ^( AST_RETURN type ) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* )
            {
                // src/net/colar/netbeans/fan/antlr/Fan.g:290:10: ^( AST_METHOD ^( AST_ID $mname) ^( AST_RETURN type ) ( ^( AST_PARAMS params ) )? ( ^( AST_MODIFIER $m) )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_METHOD, "AST_METHOD"), root_1);

                // src/net/colar/netbeans/fan/antlr/Fan.g:290:23: ^( AST_ID $mname)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_ID, "AST_ID"), root_2);

                adaptor.addChild(root_2, stream_mname.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:290:40: ^( AST_RETURN type )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_RETURN, "AST_RETURN"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // src/net/colar/netbeans/fan/antlr/Fan.g:290:59: ( ^( AST_PARAMS params ) )?
                if ( stream_params.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:290:59: ^( AST_PARAMS params )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(AST_PARAMS, "AST_PARAMS"), root_2);

                    adaptor.addChild(root_2, stream_params.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_params.reset();
                // src/net/colar/netbeans/fan/antlr/Fan.g:290:81: ( ^( AST_MODIFIER $m) )*
                while ( stream_m.hasNext() ) {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:290:81: ^( AST_MODIFIER $m)
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
            if ( state.backtracking>0 ) { memoize(input, 42, methodDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodDef"

    public static class methodFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:291:1: methodFlags : ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL );
    public final FanParser.methodFlags_return methodFlags() throws RecognitionException {
        FanParser.methodFlags_return retval = new FanParser.methodFlags_return();
        retval.start = input.LT(1);
        int methodFlags_StartIndex = input.index();
        Object root_0 = null;

        Token KW_VIRTUAL170=null;
        Token KW_OVERRIDE171=null;
        Token KW_ABSTRACT172=null;
        Token KW_STATIC173=null;
        Token KW_ONCE174=null;
        Token KW_NATIVE175=null;
        Token KW_FINAL176=null;
        FanParser.protection_return protection169 = null;


        Object KW_VIRTUAL170_tree=null;
        Object KW_OVERRIDE171_tree=null;
        Object KW_ABSTRACT172_tree=null;
        Object KW_STATIC173_tree=null;
        Object KW_ONCE174_tree=null;
        Object KW_NATIVE175_tree=null;
        Object KW_FINAL176_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:291:13: ( protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE | KW_NATIVE | KW_FINAL )
            int alt57=8;
            switch ( input.LA(1) ) {
            case KW_PRIVATE:
            case KW_PROTECTED:
            case KW_PUBLIC:
            case KW_INTERNAL:
                {
                alt57=1;
                }
                break;
            case KW_VIRTUAL:
                {
                alt57=2;
                }
                break;
            case KW_OVERRIDE:
                {
                alt57=3;
                }
                break;
            case KW_ABSTRACT:
                {
                alt57=4;
                }
                break;
            case KW_STATIC:
                {
                alt57=5;
                }
                break;
            case KW_ONCE:
                {
                alt57=6;
                }
                break;
            case KW_NATIVE:
                {
                alt57=7;
                }
                break;
            case KW_FINAL:
                {
                alt57=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:291:15: protection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_protection_in_methodFlags1462);
                    protection169=protection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protection169.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:291:28: KW_VIRTUAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_VIRTUAL170=(Token)match(input,KW_VIRTUAL,FOLLOW_KW_VIRTUAL_in_methodFlags1466); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_VIRTUAL170_tree = (Object)adaptor.create(KW_VIRTUAL170);
                    adaptor.addChild(root_0, KW_VIRTUAL170_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:291:41: KW_OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_OVERRIDE171=(Token)match(input,KW_OVERRIDE,FOLLOW_KW_OVERRIDE_in_methodFlags1470); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_OVERRIDE171_tree = (Object)adaptor.create(KW_OVERRIDE171);
                    adaptor.addChild(root_0, KW_OVERRIDE171_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:291:55: KW_ABSTRACT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ABSTRACT172=(Token)match(input,KW_ABSTRACT,FOLLOW_KW_ABSTRACT_in_methodFlags1474); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ABSTRACT172_tree = (Object)adaptor.create(KW_ABSTRACT172);
                    adaptor.addChild(root_0, KW_ABSTRACT172_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:291:69: KW_STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_STATIC173=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_methodFlags1478); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_STATIC173_tree = (Object)adaptor.create(KW_STATIC173);
                    adaptor.addChild(root_0, KW_STATIC173_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:291:81: KW_ONCE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_ONCE174=(Token)match(input,KW_ONCE,FOLLOW_KW_ONCE_in_methodFlags1482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ONCE174_tree = (Object)adaptor.create(KW_ONCE174);
                    adaptor.addChild(root_0, KW_ONCE174_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:292:5: KW_NATIVE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NATIVE175=(Token)match(input,KW_NATIVE,FOLLOW_KW_NATIVE_in_methodFlags1490); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NATIVE175_tree = (Object)adaptor.create(KW_NATIVE175);
                    adaptor.addChild(root_0, KW_NATIVE175_tree);
                    }

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:292:17: KW_FINAL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FINAL176=(Token)match(input,KW_FINAL,FOLLOW_KW_FINAL_in_methodFlags1494); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FINAL176_tree = (Object)adaptor.create(KW_FINAL176);
                    adaptor.addChild(root_0, KW_FINAL176_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 43, methodFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodFlags"

    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "params"
    // src/net/colar/netbeans/fan/antlr/Fan.g:293:1: params : ( param ( SP_COMMA param )* )? ;
    public final FanParser.params_return params() throws RecognitionException {
        FanParser.params_return retval = new FanParser.params_return();
        retval.start = input.LT(1);
        int params_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA178=null;
        FanParser.param_return param177 = null;

        FanParser.param_return param179 = null;


        Object SP_COMMA178_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:293:9: ( ( param ( SP_COMMA param )* )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:293:11: ( param ( SP_COMMA param )* )?
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:293:11: ( param ( SP_COMMA param )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==SP_PIPE||LA59_0==ID||LA59_0==SQ_BRACKET_L) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:293:12: param ( SP_COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_params1503);
                    param177=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, param177.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:293:18: ( SP_COMMA param )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==SP_COMMA) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:293:19: SP_COMMA param
                    	    {
                    	    SP_COMMA178=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_params1506); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA178_tree = (Object)adaptor.create(SP_COMMA178);
                    	    adaptor.addChild(root_0, SP_COMMA178_tree);
                    	    }
                    	    pushFollow(FOLLOW_param_in_params1508);
                    	    param179=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, param179.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
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
            if ( state.backtracking>0 ) { memoize(input, 44, params_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "params"

    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // src/net/colar/netbeans/fan/antlr/Fan.g:294:1: param : type id ( AS_INIT_VAL expr )? ;
    public final FanParser.param_return param() throws RecognitionException {
        FanParser.param_return retval = new FanParser.param_return();
        retval.start = input.LT(1);
        int param_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL182=null;
        FanParser.type_return type180 = null;

        FanParser.id_return id181 = null;

        FanParser.expr_return expr183 = null;


        Object AS_INIT_VAL182_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:294:9: ( type id ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:294:11: type id ( AS_INIT_VAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_param1521);
            type180=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type180.getTree());
            pushFollow(FOLLOW_id_in_param1523);
            id181=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id181.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:294:19: ( AS_INIT_VAL expr )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==AS_INIT_VAL) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:294:20: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL182=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_param1526); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_INIT_VAL182_tree = (Object)adaptor.create(AS_INIT_VAL182);
                    adaptor.addChild(root_0, AS_INIT_VAL182_tree);
                    }
                    pushFollow(FOLLOW_expr_in_param1528);
                    expr183=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr183.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 45, param_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "param"

    public static class methodBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodBody"
    // src/net/colar/netbeans/fan/antlr/Fan.g:295:1: methodBody : ( ( '{' ( stmt )* bracketR ) | eos );
    public final FanParser.methodBody_return methodBody() throws RecognitionException {
        FanParser.methodBody_return retval = new FanParser.methodBody_return();
        retval.start = input.LT(1);
        int methodBody_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal184=null;
        FanParser.stmt_return stmt185 = null;

        FanParser.bracketR_return bracketR186 = null;

        FanParser.eos_return eos187 = null;


        Object char_literal184_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:295:12: ( ( '{' ( stmt )* bracketR ) | eos )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==BRACKET_L) ) {
                alt62=1;
            }
            else if ( (LA62_0==EOF||(LA62_0>=KW_RD_ONLY && LA62_0<=KW_FINAL)||(LA62_0>=KW_ABSTRACT && LA62_0<=KW_ONCE)||LA62_0==SP_PIPE||LA62_0==SP_SEMI||(LA62_0>=AT && LA62_0<=ID)||LA62_0==DOC||(LA62_0>=BRACKET_R && LA62_0<=SQ_BRACKET_L)) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:295:14: ( '{' ( stmt )* bracketR )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:295:14: ( '{' ( stmt )* bracketR )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:295:15: '{' ( stmt )* bracketR
                    {
                    char_literal184=(Token)match(input,BRACKET_L,FOLLOW_BRACKET_L_in_methodBody1538); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal184_tree = (Object)adaptor.create(char_literal184);
                    adaptor.addChild(root_0, char_literal184_tree);
                    }
                    // src/net/colar/netbeans/fan/antlr/Fan.g:295:19: ( stmt )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( ((LA61_0>=KW_BREAK && LA61_0<=KW_TRY)||(LA61_0>=KW_THIS && LA61_0<=KW_SUPER)||(LA61_0>=KW_NULL && LA61_0<=KW_FALSE)||LA61_0==SP_PIPE||LA61_0==OP_CURRY||(LA61_0>=OP_PLUS && LA61_0<=OP_MINUS)||(LA61_0>=OP_BANG && LA61_0<=OP_TILDA)||(LA61_0>=AT && LA61_0<=OP_POUND)||LA61_0==NUMBER||LA61_0==SQ_BRACKET_L||LA61_0==PAR_L) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_methodBody1540);
                    	    stmt185=stmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt185.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    pushFollow(FOLLOW_bracketR_in_methodBody1543);
                    bracketR186=bracketR();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR186.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:295:37: eos
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_eos_in_methodBody1548);
                    eos187=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos187.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 46, methodBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodBody"

    public static class ctorDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:296:1: ctorDef : docs ( facet )* ( ctorFlags )* KW_NEW id parL params parR ( ( SP_COLON )=> ctorChain )? methodBody ;
    public final FanParser.ctorDef_return ctorDef() throws RecognitionException {
        FanParser.ctorDef_return retval = new FanParser.ctorDef_return();
        retval.start = input.LT(1);
        int ctorDef_StartIndex = input.index();
        Object root_0 = null;

        Token KW_NEW191=null;
        FanParser.docs_return docs188 = null;

        FanParser.facet_return facet189 = null;

        FanParser.ctorFlags_return ctorFlags190 = null;

        FanParser.id_return id192 = null;

        FanParser.parL_return parL193 = null;

        FanParser.params_return params194 = null;

        FanParser.parR_return parR195 = null;

        FanParser.ctorChain_return ctorChain196 = null;

        FanParser.methodBody_return methodBody197 = null;


        Object KW_NEW191_tree=null;

        paraphrase.push("Constructor definition");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:297:3: ( docs ( facet )* ( ctorFlags )* KW_NEW id parL params parR ( ( SP_COLON )=> ctorChain )? methodBody )
            // src/net/colar/netbeans/fan/antlr/Fan.g:297:5: docs ( facet )* ( ctorFlags )* KW_NEW id parL params parR ( ( SP_COLON )=> ctorChain )? methodBody
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_docs_in_ctorDef1567);
            docs188=docs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, docs188.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:297:10: ( facet )*
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
            	    pushFollow(FOLLOW_facet_in_ctorDef1569);
            	    facet189=facet();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, facet189.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:297:17: ( ctorFlags )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=KW_PRIVATE && LA64_0<=KW_INTERNAL)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: ctorFlags
            	    {
            	    pushFollow(FOLLOW_ctorFlags_in_ctorDef1572);
            	    ctorFlags190=ctorFlags();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorFlags190.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            KW_NEW191=(Token)match(input,KW_NEW,FOLLOW_KW_NEW_in_ctorDef1575); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_NEW191_tree = (Object)adaptor.create(KW_NEW191);
            adaptor.addChild(root_0, KW_NEW191_tree);
            }
            pushFollow(FOLLOW_id_in_ctorDef1577);
            id192=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id192.getTree());
            pushFollow(FOLLOW_parL_in_ctorDef1579);
            parL193=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL193.getTree());
            pushFollow(FOLLOW_params_in_ctorDef1581);
            params194=params();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, params194.getTree());
            pushFollow(FOLLOW_parR_in_ctorDef1583);
            parR195=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR195.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:297:55: ( ( SP_COLON )=> ctorChain )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==SP_COLON) && (synpred99_Fan())) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:297:56: ( SP_COLON )=> ctorChain
                    {
                    pushFollow(FOLLOW_ctorChain_in_ctorDef1590);
                    ctorChain196=ctorChain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChain196.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_methodBody_in_ctorDef1594);
            methodBody197=methodBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodBody197.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 47, ctorDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorDef"

    public static class ctorFlags_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorFlags"
    // src/net/colar/netbeans/fan/antlr/Fan.g:298:1: ctorFlags : protection ;
    public final FanParser.ctorFlags_return ctorFlags() throws RecognitionException {
        FanParser.ctorFlags_return retval = new FanParser.ctorFlags_return();
        retval.start = input.LT(1);
        int ctorFlags_StartIndex = input.index();
        Object root_0 = null;

        FanParser.protection_return protection198 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:11: ( protection )
            // src/net/colar/netbeans/fan/antlr/Fan.g:298:13: protection
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_protection_in_ctorFlags1601);
            protection198=protection();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protection198.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, ctorFlags_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorFlags"

    public static class ctorChain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:299:1: ctorChain : SP_COLON ( ctorChainThis | ctorChainSuper ) ;
    public final FanParser.ctorChain_return ctorChain() throws RecognitionException {
        FanParser.ctorChain_return retval = new FanParser.ctorChain_return();
        retval.start = input.LT(1);
        int ctorChain_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON199=null;
        FanParser.ctorChainThis_return ctorChainThis200 = null;

        FanParser.ctorChainSuper_return ctorChainSuper201 = null;


        Object SP_COLON199_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:11: ( SP_COLON ( ctorChainThis | ctorChainSuper ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:13: SP_COLON ( ctorChainThis | ctorChainSuper )
            {
            root_0 = (Object)adaptor.nil();

            SP_COLON199=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ctorChain1608); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON199_tree = (Object)adaptor.create(SP_COLON199);
            adaptor.addChild(root_0, SP_COLON199_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:299:22: ( ctorChainThis | ctorChainSuper )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==KW_THIS) ) {
                alt66=1;
            }
            else if ( (LA66_0==KW_SUPER) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:299:23: ctorChainThis
                    {
                    pushFollow(FOLLOW_ctorChainThis_in_ctorChain1611);
                    ctorChainThis200=ctorChainThis();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainThis200.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:299:39: ctorChainSuper
                    {
                    pushFollow(FOLLOW_ctorChainSuper_in_ctorChain1615);
                    ctorChainSuper201=ctorChainSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorChainSuper201.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 49, ctorChain_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChain"

    public static class ctorChainThis_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChainThis"
    // src/net/colar/netbeans/fan/antlr/Fan.g:301:1: ctorChainThis : KW_THIS DOT id parL ( args )? parR ;
    public final FanParser.ctorChainThis_return ctorChainThis() throws RecognitionException {
        FanParser.ctorChainThis_return retval = new FanParser.ctorChainThis_return();
        retval.start = input.LT(1);
        int ctorChainThis_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THIS202=null;
        Token DOT203=null;
        FanParser.id_return id204 = null;

        FanParser.parL_return parL205 = null;

        FanParser.args_return args206 = null;

        FanParser.parR_return parR207 = null;


        Object KW_THIS202_tree=null;
        Object DOT203_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:301:15: ( KW_THIS DOT id parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:301:17: KW_THIS DOT id parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_THIS202=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_ctorChainThis1624); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THIS202_tree = (Object)adaptor.create(KW_THIS202);
            adaptor.addChild(root_0, KW_THIS202_tree);
            }
            DOT203=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainThis1626); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT203_tree = (Object)adaptor.create(DOT203);
            adaptor.addChild(root_0, DOT203_tree);
            }
            pushFollow(FOLLOW_id_in_ctorChainThis1628);
            id204=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id204.getTree());
            pushFollow(FOLLOW_parL_in_ctorChainThis1630);
            parL205=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL205.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:301:37: ( args )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=KW_THIS && LA67_0<=KW_SUPER)||(LA67_0>=KW_NULL && LA67_0<=KW_FALSE)||LA67_0==SP_PIPE||LA67_0==OP_CURRY||(LA67_0>=OP_PLUS && LA67_0<=OP_MINUS)||(LA67_0>=OP_BANG && LA67_0<=OP_TILDA)||(LA67_0>=AT && LA67_0<=OP_POUND)||LA67_0==NUMBER||LA67_0==SQ_BRACKET_L||LA67_0==PAR_L) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainThis1632);
                    args206=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args206.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainThis1635);
            parR207=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR207.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, ctorChainThis_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChainThis"

    public static class ctorChainSuper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorChainSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:302:1: ctorChainSuper : KW_SUPER ( DOT id )? parL ( args )? parR ;
    public final FanParser.ctorChainSuper_return ctorChainSuper() throws RecognitionException {
        FanParser.ctorChainSuper_return retval = new FanParser.ctorChainSuper_return();
        retval.start = input.LT(1);
        int ctorChainSuper_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SUPER208=null;
        Token DOT209=null;
        FanParser.id_return id210 = null;

        FanParser.parL_return parL211 = null;

        FanParser.args_return args212 = null;

        FanParser.parR_return parR213 = null;


        Object KW_SUPER208_tree=null;
        Object DOT209_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:16: ( KW_SUPER ( DOT id )? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:18: KW_SUPER ( DOT id )? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            KW_SUPER208=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_ctorChainSuper1642); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SUPER208_tree = (Object)adaptor.create(KW_SUPER208);
            adaptor.addChild(root_0, KW_SUPER208_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:27: ( DOT id )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==DOT) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:302:28: DOT id
                    {
                    DOT209=(Token)match(input,DOT,FOLLOW_DOT_in_ctorChainSuper1645); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT209_tree = (Object)adaptor.create(DOT209);
                    adaptor.addChild(root_0, DOT209_tree);
                    }
                    pushFollow(FOLLOW_id_in_ctorChainSuper1647);
                    id210=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id210.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parL_in_ctorChainSuper1651);
            parL211=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL211.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:302:42: ( args )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=KW_THIS && LA69_0<=KW_SUPER)||(LA69_0>=KW_NULL && LA69_0<=KW_FALSE)||LA69_0==SP_PIPE||LA69_0==OP_CURRY||(LA69_0>=OP_PLUS && LA69_0<=OP_MINUS)||(LA69_0>=OP_BANG && LA69_0<=OP_TILDA)||(LA69_0>=AT && LA69_0<=OP_POUND)||LA69_0==NUMBER||LA69_0==SQ_BRACKET_L||LA69_0==PAR_L) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_ctorChainSuper1653);
                    args212=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args212.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_ctorChainSuper1656);
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
            if ( state.backtracking>0 ) { memoize(input, 51, ctorChainSuper_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorChainSuper"

    public static class staticBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:304:1: staticBlock : KW_STATIC block ;
    public final FanParser.staticBlock_return staticBlock() throws RecognitionException {
        FanParser.staticBlock_return retval = new FanParser.staticBlock_return();
        retval.start = input.LT(1);
        int staticBlock_StartIndex = input.index();
        Object root_0 = null;

        Token KW_STATIC214=null;
        FanParser.block_return block215 = null;


        Object KW_STATIC214_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:13: ( KW_STATIC block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:304:15: KW_STATIC block
            {
            root_0 = (Object)adaptor.nil();

            KW_STATIC214=(Token)match(input,KW_STATIC,FOLLOW_KW_STATIC_in_staticBlock1664); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_STATIC214_tree = (Object)adaptor.create(KW_STATIC214);
            adaptor.addChild(root_0, KW_STATIC214_tree);
            }
            pushFollow(FOLLOW_block_in_staticBlock1666);
            block215=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block215.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, staticBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticBlock"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // src/net/colar/netbeans/fan/antlr/Fan.g:305:1: block : ( ( bracketL )=> multiStmt | stmt ) ;
    public final FanParser.block_return block() throws RecognitionException {
        FanParser.block_return retval = new FanParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        FanParser.multiStmt_return multiStmt216 = null;

        FanParser.stmt_return stmt217 = null;



        paraphrase.push("Block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:306:3: ( ( ( bracketL )=> multiStmt | stmt ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:306:5: ( ( bracketL )=> multiStmt | stmt )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:306:5: ( ( bracketL )=> multiStmt | stmt )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==BRACKET_L) && (synpred104_Fan())) {
                alt70=1;
            }
            else if ( ((LA70_0>=KW_BREAK && LA70_0<=KW_TRY)||(LA70_0>=KW_THIS && LA70_0<=KW_SUPER)||(LA70_0>=KW_NULL && LA70_0<=KW_FALSE)||LA70_0==SP_PIPE||LA70_0==OP_CURRY||(LA70_0>=OP_PLUS && LA70_0<=OP_MINUS)||(LA70_0>=OP_BANG && LA70_0<=OP_TILDA)||(LA70_0>=AT && LA70_0<=OP_POUND)||LA70_0==NUMBER||LA70_0==SQ_BRACKET_L||LA70_0==PAR_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:306:6: ( bracketL )=> multiStmt
                    {
                    pushFollow(FOLLOW_multiStmt_in_block1691);
                    multiStmt216=multiStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiStmt216.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:306:30: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_block1695);
                    stmt217=stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt217.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 53, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class multiStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:307:1: multiStmt : bracketL ( stmt )* bracketR ;
    public final FanParser.multiStmt_return multiStmt() throws RecognitionException {
        FanParser.multiStmt_return retval = new FanParser.multiStmt_return();
        retval.start = input.LT(1);
        int multiStmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL218 = null;

        FanParser.stmt_return stmt219 = null;

        FanParser.bracketR_return bracketR220 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:11: ( bracketL ( stmt )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:13: bracketL ( stmt )* bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bracketL_in_multiStmt1703);
            bracketL218=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL218.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:307:23: ( stmt )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=KW_BREAK && LA71_0<=KW_TRY)||(LA71_0>=KW_THIS && LA71_0<=KW_SUPER)||(LA71_0>=KW_NULL && LA71_0<=KW_FALSE)||LA71_0==SP_PIPE||LA71_0==OP_CURRY||(LA71_0>=OP_PLUS && LA71_0<=OP_MINUS)||(LA71_0>=OP_BANG && LA71_0<=OP_TILDA)||(LA71_0>=AT && LA71_0<=OP_POUND)||LA71_0==NUMBER||LA71_0==SQ_BRACKET_L||LA71_0==PAR_L) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_multiStmt1706);
            	    stmt219=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt219.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_multiStmt1709);
            bracketR220=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR220.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, multiStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiStmt"

    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:308:1: stmt : ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) ;
    public final FanParser.stmt_return stmt() throws RecognitionException {
        FanParser.stmt_return retval = new FanParser.stmt_return();
        retval.start = input.LT(1);
        int stmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.g_if_return g_if221 = null;

        FanParser.g_for_return g_for222 = null;

        FanParser.g_while_return g_while223 = null;

        FanParser.g_break_return g_break224 = null;

        FanParser.g_continue_return g_continue225 = null;

        FanParser.g_return_return g_return226 = null;

        FanParser.g_switch_return g_switch227 = null;

        FanParser.g_throw_return g_throw228 = null;

        FanParser.g_try_return g_try229 = null;

        FanParser.exprStmt_return exprStmt230 = null;

        FanParser.localDef_return localDef231 = null;



        paraphrase.push("Statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:3: ( ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:310:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:310:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )
            int alt72=11;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:310:6: g_if
                    {
                    pushFollow(FOLLOW_g_if_in_stmt1728);
                    g_if221=g_if();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_if221.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:310:13: g_for
                    {
                    pushFollow(FOLLOW_g_for_in_stmt1732);
                    g_for222=g_for();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_for222.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:310:21: g_while
                    {
                    pushFollow(FOLLOW_g_while_in_stmt1736);
                    g_while223=g_while();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_while223.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:310:31: g_break
                    {
                    pushFollow(FOLLOW_g_break_in_stmt1740);
                    g_break224=g_break();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_break224.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:311:4: g_continue
                    {
                    pushFollow(FOLLOW_g_continue_in_stmt1747);
                    g_continue225=g_continue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_continue225.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:311:17: g_return
                    {
                    pushFollow(FOLLOW_g_return_in_stmt1751);
                    g_return226=g_return();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_return226.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:311:28: g_switch
                    {
                    pushFollow(FOLLOW_g_switch_in_stmt1755);
                    g_switch227=g_switch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_switch227.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:312:4: g_throw
                    {
                    pushFollow(FOLLOW_g_throw_in_stmt1762);
                    g_throw228=g_throw();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_throw228.getTree());

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:312:14: g_try
                    {
                    pushFollow(FOLLOW_g_try_in_stmt1766);
                    g_try229=g_try();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_try229.getTree());

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:312:22: exprStmt
                    {
                    pushFollow(FOLLOW_exprStmt_in_stmt1770);
                    exprStmt230=exprStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprStmt230.getTree());

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:312:33: localDef
                    {
                    pushFollow(FOLLOW_localDef_in_stmt1774);
                    localDef231=localDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localDef231.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 55, stmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmt"

    public static class g_break_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_break"
    // src/net/colar/netbeans/fan/antlr/Fan.g:319:1: g_break : KW_BREAK eos ;
    public final FanParser.g_break_return g_break() throws RecognitionException {
        FanParser.g_break_return retval = new FanParser.g_break_return();
        retval.start = input.LT(1);
        int g_break_StartIndex = input.index();
        Object root_0 = null;

        Token KW_BREAK232=null;
        FanParser.eos_return eos233 = null;


        Object KW_BREAK232_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:319:10: ( KW_BREAK eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:319:12: KW_BREAK eos
            {
            root_0 = (Object)adaptor.nil();

            KW_BREAK232=(Token)match(input,KW_BREAK,FOLLOW_KW_BREAK_in_g_break1787); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_BREAK232_tree = (Object)adaptor.create(KW_BREAK232);
            adaptor.addChild(root_0, KW_BREAK232_tree);
            }
            pushFollow(FOLLOW_eos_in_g_break1789);
            eos233=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos233.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, g_break_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_break"

    public static class g_continue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_continue"
    // src/net/colar/netbeans/fan/antlr/Fan.g:320:1: g_continue : KW_CONTINUE eos ;
    public final FanParser.g_continue_return g_continue() throws RecognitionException {
        FanParser.g_continue_return retval = new FanParser.g_continue_return();
        retval.start = input.LT(1);
        int g_continue_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CONTINUE234=null;
        FanParser.eos_return eos235 = null;


        Object KW_CONTINUE234_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:320:12: ( KW_CONTINUE eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:320:14: KW_CONTINUE eos
            {
            root_0 = (Object)adaptor.nil();

            KW_CONTINUE234=(Token)match(input,KW_CONTINUE,FOLLOW_KW_CONTINUE_in_g_continue1796); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CONTINUE234_tree = (Object)adaptor.create(KW_CONTINUE234);
            adaptor.addChild(root_0, KW_CONTINUE234_tree);
            }
            pushFollow(FOLLOW_eos_in_g_continue1798);
            eos235=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos235.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, g_continue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_continue"

    public static class g_for_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_for"
    // src/net/colar/netbeans/fan/antlr/Fan.g:321:1: g_for : KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block ;
    public final FanParser.g_for_return g_for() throws RecognitionException {
        FanParser.g_for_return retval = new FanParser.g_for_return();
        retval.start = input.LT(1);
        int g_for_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FOR236=null;
        Token SP_SEMI239=null;
        Token SP_SEMI241=null;
        FanParser.parL_return parL237 = null;

        FanParser.forInit_return forInit238 = null;

        FanParser.expr_return expr240 = null;

        FanParser.expr_return expr242 = null;

        FanParser.parR_return parR243 = null;

        FanParser.block_return block244 = null;


        Object KW_FOR236_tree=null;
        Object SP_SEMI239_tree=null;
        Object SP_SEMI241_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:8: ( KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:10: KW_FOR parL ( forInit )? SP_SEMI ( expr )? SP_SEMI ( expr )? parR block
            {
            root_0 = (Object)adaptor.nil();

            KW_FOR236=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_g_for1806); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_FOR236_tree = (Object)adaptor.create(KW_FOR236);
            adaptor.addChild(root_0, KW_FOR236_tree);
            }
            pushFollow(FOLLOW_parL_in_g_for1808);
            parL237=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL237.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:22: ( forInit )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=KW_THIS && LA73_0<=KW_SUPER)||(LA73_0>=KW_NULL && LA73_0<=KW_FALSE)||LA73_0==SP_PIPE||LA73_0==OP_CURRY||(LA73_0>=OP_PLUS && LA73_0<=OP_MINUS)||(LA73_0>=OP_BANG && LA73_0<=OP_TILDA)||(LA73_0>=AT && LA73_0<=OP_POUND)||LA73_0==NUMBER||LA73_0==SQ_BRACKET_L||LA73_0==PAR_L) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_g_for1810);
                    forInit238=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInit238.getTree());

                    }
                    break;

            }

            SP_SEMI239=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for1813); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_SEMI239_tree = (Object)adaptor.create(SP_SEMI239);
            adaptor.addChild(root_0, SP_SEMI239_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:39: ( expr )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=KW_THIS && LA74_0<=KW_SUPER)||(LA74_0>=KW_NULL && LA74_0<=KW_FALSE)||LA74_0==SP_PIPE||LA74_0==OP_CURRY||(LA74_0>=OP_PLUS && LA74_0<=OP_MINUS)||(LA74_0>=OP_BANG && LA74_0<=OP_TILDA)||(LA74_0>=AT && LA74_0<=OP_POUND)||LA74_0==NUMBER||LA74_0==SQ_BRACKET_L||LA74_0==PAR_L) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for1815);
                    expr240=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr240.getTree());

                    }
                    break;

            }

            SP_SEMI241=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_g_for1818); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_SEMI241_tree = (Object)adaptor.create(SP_SEMI241);
            adaptor.addChild(root_0, SP_SEMI241_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:321:53: ( expr )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=KW_THIS && LA75_0<=KW_SUPER)||(LA75_0>=KW_NULL && LA75_0<=KW_FALSE)||LA75_0==SP_PIPE||LA75_0==OP_CURRY||(LA75_0>=OP_PLUS && LA75_0<=OP_MINUS)||(LA75_0>=OP_BANG && LA75_0<=OP_TILDA)||(LA75_0>=AT && LA75_0<=OP_POUND)||LA75_0==NUMBER||LA75_0==SQ_BRACKET_L||LA75_0==PAR_L) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_g_for1820);
                    expr242=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr242.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_g_for1823);
            parR243=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR243.getTree());
            pushFollow(FOLLOW_block_in_g_for1826);
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
            if ( state.backtracking>0 ) { memoize(input, 58, g_for_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_for"

    public static class g_if_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_if"
    // src/net/colar/netbeans/fan/antlr/Fan.g:322:1: g_if : KW_IF parL expr parR block ( KW_ELSE block )? ;
    public final FanParser.g_if_return g_if() throws RecognitionException {
        FanParser.g_if_return retval = new FanParser.g_if_return();
        retval.start = input.LT(1);
        int g_if_StartIndex = input.index();
        Object root_0 = null;

        Token KW_IF245=null;
        Token KW_ELSE250=null;
        FanParser.parL_return parL246 = null;

        FanParser.expr_return expr247 = null;

        FanParser.parR_return parR248 = null;

        FanParser.block_return block249 = null;

        FanParser.block_return block251 = null;


        Object KW_IF245_tree=null;
        Object KW_ELSE250_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:322:7: ( KW_IF parL expr parR block ( KW_ELSE block )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:322:9: KW_IF parL expr parR block ( KW_ELSE block )?
            {
            root_0 = (Object)adaptor.nil();

            KW_IF245=(Token)match(input,KW_IF,FOLLOW_KW_IF_in_g_if1834); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_IF245_tree = (Object)adaptor.create(KW_IF245);
            adaptor.addChild(root_0, KW_IF245_tree);
            }
            pushFollow(FOLLOW_parL_in_g_if1836);
            parL246=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL246.getTree());
            pushFollow(FOLLOW_expr_in_g_if1838);
            expr247=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr247.getTree());
            pushFollow(FOLLOW_parR_in_g_if1840);
            parR248=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR248.getTree());
            pushFollow(FOLLOW_block_in_g_if1842);
            block249=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block249.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:323:5: ( KW_ELSE block )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==KW_ELSE) ) {
                int LA76_1 = input.LA(2);

                if ( (synpred119_Fan()) ) {
                    alt76=1;
                }
            }
            switch (alt76) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:323:6: KW_ELSE block
                    {
                    KW_ELSE250=(Token)match(input,KW_ELSE,FOLLOW_KW_ELSE_in_g_if1849); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_ELSE250_tree = (Object)adaptor.create(KW_ELSE250);
                    adaptor.addChild(root_0, KW_ELSE250_tree);
                    }
                    pushFollow(FOLLOW_block_in_g_if1851);
                    block251=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block251.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 59, g_if_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_if"

    public static class g_return_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_return"
    // src/net/colar/netbeans/fan/antlr/Fan.g:324:1: g_return : KW_RETURN ( eos | expr eos ) ;
    public final FanParser.g_return_return g_return() throws RecognitionException {
        FanParser.g_return_return retval = new FanParser.g_return_return();
        retval.start = input.LT(1);
        int g_return_StartIndex = input.index();
        Object root_0 = null;

        Token KW_RETURN252=null;
        FanParser.eos_return eos253 = null;

        FanParser.expr_return expr254 = null;

        FanParser.eos_return eos255 = null;


        Object KW_RETURN252_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:324:10: ( KW_RETURN ( eos | expr eos ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:324:12: KW_RETURN ( eos | expr eos )
            {
            root_0 = (Object)adaptor.nil();

            KW_RETURN252=(Token)match(input,KW_RETURN,FOLLOW_KW_RETURN_in_g_return1860); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_RETURN252_tree = (Object)adaptor.create(KW_RETURN252);
            adaptor.addChild(root_0, KW_RETURN252_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:324:22: ( eos | expr eos )
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:324:23: eos
                    {
                    pushFollow(FOLLOW_eos_in_g_return1863);
                    eos253=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos253.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:324:29: expr eos
                    {
                    pushFollow(FOLLOW_expr_in_g_return1867);
                    expr254=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr254.getTree());
                    pushFollow(FOLLOW_eos_in_g_return1869);
                    eos255=eos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, eos255.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 60, g_return_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_return"

    public static class g_switch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_switch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:325:1: g_switch : KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR ;
    public final FanParser.g_switch_return g_switch() throws RecognitionException {
        FanParser.g_switch_return retval = new FanParser.g_switch_return();
        retval.start = input.LT(1);
        int g_switch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_SWITCH256=null;
        FanParser.parL_return parL257 = null;

        FanParser.expr_return expr258 = null;

        FanParser.parR_return parR259 = null;

        FanParser.bracketL_return bracketL260 = null;

        FanParser.g_case_return g_case261 = null;

        FanParser.g_default_return g_default262 = null;

        FanParser.bracketR_return bracketR263 = null;


        Object KW_SWITCH256_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:10: ( KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:12: KW_SWITCH parL expr parR bracketL ( g_case )* ( g_default )? bracketR
            {
            root_0 = (Object)adaptor.nil();

            KW_SWITCH256=(Token)match(input,KW_SWITCH,FOLLOW_KW_SWITCH_in_g_switch1877); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SWITCH256_tree = (Object)adaptor.create(KW_SWITCH256);
            adaptor.addChild(root_0, KW_SWITCH256_tree);
            }
            pushFollow(FOLLOW_parL_in_g_switch1879);
            parL257=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL257.getTree());
            pushFollow(FOLLOW_expr_in_g_switch1881);
            expr258=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr258.getTree());
            pushFollow(FOLLOW_parR_in_g_switch1883);
            parR259=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR259.getTree());
            pushFollow(FOLLOW_bracketL_in_g_switch1885);
            bracketL260=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL260.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:325:46: ( g_case )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==KW_CASE) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:325:47: g_case
            	    {
            	    pushFollow(FOLLOW_g_case_in_g_switch1888);
            	    g_case261=g_case();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_case261.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:325:56: ( g_default )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==KW_DEFAULT) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:325:57: g_default
                    {
                    pushFollow(FOLLOW_g_default_in_g_switch1893);
                    g_default262=g_default();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_default262.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_bracketR_in_g_switch1897);
            bracketR263=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR263.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, g_switch_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_switch"

    public static class g_throw_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_throw"
    // src/net/colar/netbeans/fan/antlr/Fan.g:326:1: g_throw : KW_THROW expr eos ;
    public final FanParser.g_throw_return g_throw() throws RecognitionException {
        FanParser.g_throw_return retval = new FanParser.g_throw_return();
        retval.start = input.LT(1);
        int g_throw_StartIndex = input.index();
        Object root_0 = null;

        Token KW_THROW264=null;
        FanParser.expr_return expr265 = null;

        FanParser.eos_return eos266 = null;


        Object KW_THROW264_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:326:10: ( KW_THROW expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:326:12: KW_THROW expr eos
            {
            root_0 = (Object)adaptor.nil();

            KW_THROW264=(Token)match(input,KW_THROW,FOLLOW_KW_THROW_in_g_throw1905); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_THROW264_tree = (Object)adaptor.create(KW_THROW264);
            adaptor.addChild(root_0, KW_THROW264_tree);
            }
            pushFollow(FOLLOW_expr_in_g_throw1907);
            expr265=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr265.getTree());
            pushFollow(FOLLOW_eos_in_g_throw1909);
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
            if ( state.backtracking>0 ) { memoize(input, 62, g_throw_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_throw"

    public static class g_while_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_while"
    // src/net/colar/netbeans/fan/antlr/Fan.g:327:1: g_while : KW_WHILE parL expr parR block ;
    public final FanParser.g_while_return g_while() throws RecognitionException {
        FanParser.g_while_return retval = new FanParser.g_while_return();
        retval.start = input.LT(1);
        int g_while_StartIndex = input.index();
        Object root_0 = null;

        Token KW_WHILE267=null;
        FanParser.parL_return parL268 = null;

        FanParser.expr_return expr269 = null;

        FanParser.parR_return parR270 = null;

        FanParser.block_return block271 = null;


        Object KW_WHILE267_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:10: ( KW_WHILE parL expr parR block )
            // src/net/colar/netbeans/fan/antlr/Fan.g:327:12: KW_WHILE parL expr parR block
            {
            root_0 = (Object)adaptor.nil();

            KW_WHILE267=(Token)match(input,KW_WHILE,FOLLOW_KW_WHILE_in_g_while1917); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_WHILE267_tree = (Object)adaptor.create(KW_WHILE267);
            adaptor.addChild(root_0, KW_WHILE267_tree);
            }
            pushFollow(FOLLOW_parL_in_g_while1919);
            parL268=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL268.getTree());
            pushFollow(FOLLOW_expr_in_g_while1921);
            expr269=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr269.getTree());
            pushFollow(FOLLOW_parR_in_g_while1923);
            parR270=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR270.getTree());
            pushFollow(FOLLOW_block_in_g_while1925);
            block271=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block271.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, g_while_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_while"

    public static class g_try_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_try"
    // src/net/colar/netbeans/fan/antlr/Fan.g:328:1: g_try : KW_TRY ( ( bracketL )=> try_long | ( stmt )* ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? ;
    public final FanParser.g_try_return g_try() throws RecognitionException {
        FanParser.g_try_return retval = new FanParser.g_try_return();
        retval.start = input.LT(1);
        int g_try_StartIndex = input.index();
        Object root_0 = null;

        Token KW_TRY272=null;
        FanParser.try_long_return try_long273 = null;

        FanParser.stmt_return stmt274 = null;

        FanParser.g_catch_return g_catch275 = null;

        FanParser.g_finally_return g_finally276 = null;


        Object KW_TRY272_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:328:8: ( KW_TRY ( ( bracketL )=> try_long | ( stmt )* ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:328:10: KW_TRY ( ( bracketL )=> try_long | ( stmt )* ) ( ( KW_CATCH )=> g_catch )* ( ( KW_FINALLY )=> g_finally )?
            {
            root_0 = (Object)adaptor.nil();

            KW_TRY272=(Token)match(input,KW_TRY,FOLLOW_KW_TRY_in_g_try1933); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_TRY272_tree = (Object)adaptor.create(KW_TRY272);
            adaptor.addChild(root_0, KW_TRY272_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:328:17: ( ( bracketL )=> try_long | ( stmt )* )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==BRACKET_L) && (synpred123_Fan())) {
                alt81=1;
            }
            else if ( (LA81_0==EOF||(LA81_0>=KW_BREAK && LA81_0<=KW_FINALLY)||(LA81_0>=KW_RD_ONLY && LA81_0<=KW_FINAL)||(LA81_0>=KW_ABSTRACT && LA81_0<=KW_ELSE)||(LA81_0>=KW_NULL && LA81_0<=KW_FALSE)||LA81_0==SP_COMMA||LA81_0==SP_PIPE||LA81_0==SP_SEMI||LA81_0==OP_CURRY||(LA81_0>=OP_PLUS && LA81_0<=OP_MINUS)||(LA81_0>=OP_BANG && LA81_0<=OP_TILDA)||(LA81_0>=AT && LA81_0<=NUMBER)||(LA81_0>=BRACKET_R && LA81_0<=SQ_BRACKET_L)||LA81_0==PAR_L) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:328:18: ( bracketL )=> try_long
                    {
                    pushFollow(FOLLOW_try_long_in_g_try1940);
                    try_long273=try_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_long273.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:328:41: ( stmt )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:328:41: ( stmt )*
                    loop80:
                    do {
                        int alt80=2;
                        alt80 = dfa80.predict(input);
                        switch (alt80) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_try1944);
                    	    stmt274=stmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt274.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:328:48: ( ( KW_CATCH )=> g_catch )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==KW_CATCH) ) {
                    int LA82_2 = input.LA(2);

                    if ( (synpred125_Fan()) ) {
                        alt82=1;
                    }


                }


                switch (alt82) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:328:49: ( KW_CATCH )=> g_catch
            	    {
            	    pushFollow(FOLLOW_g_catch_in_g_try1953);
            	    g_catch275=g_catch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_catch275.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:328:71: ( ( KW_FINALLY )=> g_finally )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==KW_FINALLY) ) {
                int LA83_1 = input.LA(2);

                if ( (synpred126_Fan()) ) {
                    alt83=1;
                }
            }
            switch (alt83) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:328:72: ( KW_FINALLY )=> g_finally
                    {
                    pushFollow(FOLLOW_g_finally_in_g_try1962);
                    g_finally276=g_finally();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_finally276.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 64, g_try_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_try"

    public static class try_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "try_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:329:1: try_long : bracketL ( stmt )* bracketR ;
    public final FanParser.try_long_return try_long() throws RecognitionException {
        FanParser.try_long_return retval = new FanParser.try_long_return();
        retval.start = input.LT(1);
        int try_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL277 = null;

        FanParser.stmt_return stmt278 = null;

        FanParser.bracketR_return bracketR279 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:329:10: ( bracketL ( stmt )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:329:12: bracketL ( stmt )* bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bracketL_in_try_long1971);
            bracketL277=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL277.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:329:21: ( stmt )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( ((LA84_0>=KW_BREAK && LA84_0<=KW_TRY)||(LA84_0>=KW_THIS && LA84_0<=KW_SUPER)||(LA84_0>=KW_NULL && LA84_0<=KW_FALSE)||LA84_0==SP_PIPE||LA84_0==OP_CURRY||(LA84_0>=OP_PLUS && LA84_0<=OP_MINUS)||(LA84_0>=OP_BANG && LA84_0<=OP_TILDA)||(LA84_0>=AT && LA84_0<=OP_POUND)||LA84_0==NUMBER||LA84_0==SQ_BRACKET_L||LA84_0==PAR_L) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_try_long1973);
            	    stmt278=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt278.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_try_long1976);
            bracketR279=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR279.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, try_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "try_long"

    public static class exprStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprStmt"
    // src/net/colar/netbeans/fan/antlr/Fan.g:330:1: exprStmt : expr eos ;
    public final FanParser.exprStmt_return exprStmt() throws RecognitionException {
        FanParser.exprStmt_return retval = new FanParser.exprStmt_return();
        retval.start = input.LT(1);
        int exprStmt_StartIndex = input.index();
        Object root_0 = null;

        FanParser.expr_return expr280 = null;

        FanParser.eos_return eos281 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:10: ( expr eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:330:12: expr eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprStmt1983);
            expr280=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr280.getTree());
            pushFollow(FOLLOW_eos_in_exprStmt1985);
            eos281=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos281.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, exprStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprStmt"

    public static class localDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:331:1: localDef : typeId ( AS_INIT_VAL expr )? eos ;
    public final FanParser.localDef_return localDef() throws RecognitionException {
        FanParser.localDef_return retval = new FanParser.localDef_return();
        retval.start = input.LT(1);
        int localDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL283=null;
        FanParser.typeId_return typeId282 = null;

        FanParser.expr_return expr284 = null;

        FanParser.eos_return eos285 = null;


        Object AS_INIT_VAL283_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:10: ( typeId ( AS_INIT_VAL expr )? eos )
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:12: typeId ( AS_INIT_VAL expr )? eos
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeId_in_localDef1992);
            typeId282=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId282.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:331:19: ( AS_INIT_VAL expr )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==AS_INIT_VAL) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:331:20: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL283=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_localDef1995); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_INIT_VAL283_tree = (Object)adaptor.create(AS_INIT_VAL283);
                    adaptor.addChild(root_0, AS_INIT_VAL283_tree);
                    }
                    pushFollow(FOLLOW_expr_in_localDef1997);
                    expr284=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr284.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_eos_in_localDef2001);
            eos285=eos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eos285.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, localDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localDef"

    public static class forInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInit"
    // src/net/colar/netbeans/fan/antlr/Fan.g:332:1: forInit : ( forInitDef | expr );
    public final FanParser.forInit_return forInit() throws RecognitionException {
        FanParser.forInit_return retval = new FanParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        Object root_0 = null;

        FanParser.forInitDef_return forInitDef286 = null;

        FanParser.expr_return expr287 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:332:10: ( forInitDef | expr )
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:332:12: forInitDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forInitDef_in_forInit2009);
                    forInitDef286=forInitDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInitDef286.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:332:25: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_forInit2013);
                    expr287=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr287.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 68, forInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class forInitDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInitDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:333:1: forInitDef : typeId ( AS_INIT_VAL expr )? ;
    public final FanParser.forInitDef_return forInitDef() throws RecognitionException {
        FanParser.forInitDef_return retval = new FanParser.forInitDef_return();
        retval.start = input.LT(1);
        int forInitDef_StartIndex = input.index();
        Object root_0 = null;

        Token AS_INIT_VAL289=null;
        FanParser.typeId_return typeId288 = null;

        FanParser.expr_return expr290 = null;


        Object AS_INIT_VAL289_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:12: ( typeId ( AS_INIT_VAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:14: typeId ( AS_INIT_VAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeId_in_forInitDef2020);
            typeId288=typeId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeId288.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:333:21: ( AS_INIT_VAL expr )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==AS_INIT_VAL) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:333:22: AS_INIT_VAL expr
                    {
                    AS_INIT_VAL289=(Token)match(input,AS_INIT_VAL,FOLLOW_AS_INIT_VAL_in_forInitDef2023); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_INIT_VAL289_tree = (Object)adaptor.create(AS_INIT_VAL289);
                    adaptor.addChild(root_0, AS_INIT_VAL289_tree);
                    }
                    pushFollow(FOLLOW_expr_in_forInitDef2025);
                    expr290=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr290.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 69, forInitDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInitDef"

    public static class g_catch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_catch"
    // src/net/colar/netbeans/fan/antlr/Fan.g:335:1: g_catch : KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | ( stmt )* ) ;
    public final FanParser.g_catch_return g_catch() throws RecognitionException {
        FanParser.g_catch_return retval = new FanParser.g_catch_return();
        retval.start = input.LT(1);
        int g_catch_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CATCH291=null;
        FanParser.catchDef_return catchDef292 = null;

        FanParser.catch_long_return catch_long293 = null;

        FanParser.stmt_return stmt294 = null;


        Object KW_CATCH291_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:10: ( KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | ( stmt )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:12: KW_CATCH ( catchDef )? ( ( bracketL )=> catch_long | ( stmt )* )
            {
            root_0 = (Object)adaptor.nil();

            KW_CATCH291=(Token)match(input,KW_CATCH,FOLLOW_KW_CATCH_in_g_catch2036); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CATCH291_tree = (Object)adaptor.create(KW_CATCH291);
            adaptor.addChild(root_0, KW_CATCH291_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:335:21: ( catchDef )?
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: catchDef
                    {
                    pushFollow(FOLLOW_catchDef_in_g_catch2038);
                    catchDef292=catchDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchDef292.getTree());

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:335:31: ( ( bracketL )=> catch_long | ( stmt )* )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==BRACKET_L) && (synpred132_Fan())) {
                alt90=1;
            }
            else if ( (LA90_0==EOF||(LA90_0>=KW_BREAK && LA90_0<=KW_FINALLY)||(LA90_0>=KW_RD_ONLY && LA90_0<=KW_FINAL)||(LA90_0>=KW_ABSTRACT && LA90_0<=KW_ELSE)||(LA90_0>=KW_NULL && LA90_0<=KW_FALSE)||LA90_0==SP_COMMA||LA90_0==SP_PIPE||LA90_0==SP_SEMI||LA90_0==OP_CURRY||(LA90_0>=OP_PLUS && LA90_0<=OP_MINUS)||(LA90_0>=OP_BANG && LA90_0<=OP_TILDA)||(LA90_0>=AT && LA90_0<=NUMBER)||(LA90_0>=BRACKET_R && LA90_0<=SQ_BRACKET_L)||LA90_0==PAR_L) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:32: ( bracketL )=> catch_long
                    {
                    pushFollow(FOLLOW_catch_long_in_g_catch2046);
                    catch_long293=catch_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catch_long293.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:57: ( stmt )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:335:57: ( stmt )*
                    loop89:
                    do {
                        int alt89=2;
                        alt89 = dfa89.predict(input);
                        switch (alt89) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_catch2050);
                    	    stmt294=stmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt294.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop89;
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
            if ( state.backtracking>0 ) { memoize(input, 70, g_catch_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_catch"

    public static class catch_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catch_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:336:1: catch_long : bracketL ( stmt )* bracketR ;
    public final FanParser.catch_long_return catch_long() throws RecognitionException {
        FanParser.catch_long_return retval = new FanParser.catch_long_return();
        retval.start = input.LT(1);
        int catch_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL295 = null;

        FanParser.stmt_return stmt296 = null;

        FanParser.bracketR_return bracketR297 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:336:12: ( bracketL ( stmt )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:336:14: bracketL ( stmt )* bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bracketL_in_catch_long2059);
            bracketL295=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL295.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:336:23: ( stmt )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0>=KW_BREAK && LA91_0<=KW_TRY)||(LA91_0>=KW_THIS && LA91_0<=KW_SUPER)||(LA91_0>=KW_NULL && LA91_0<=KW_FALSE)||LA91_0==SP_PIPE||LA91_0==OP_CURRY||(LA91_0>=OP_PLUS && LA91_0<=OP_MINUS)||(LA91_0>=OP_BANG && LA91_0<=OP_TILDA)||(LA91_0>=AT && LA91_0<=OP_POUND)||LA91_0==NUMBER||LA91_0==SQ_BRACKET_L||LA91_0==PAR_L) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_catch_long2061);
            	    stmt296=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt296.getTree());

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_catch_long2064);
            bracketR297=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR297.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, catch_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catch_long"

    public static class catchDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchDef"
    // src/net/colar/netbeans/fan/antlr/Fan.g:337:1: catchDef : parL type id parR ;
    public final FanParser.catchDef_return catchDef() throws RecognitionException {
        FanParser.catchDef_return retval = new FanParser.catchDef_return();
        retval.start = input.LT(1);
        int catchDef_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL298 = null;

        FanParser.type_return type299 = null;

        FanParser.id_return id300 = null;

        FanParser.parR_return parR301 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:11: ( parL type id parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:337:13: parL type id parR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parL_in_catchDef2072);
            parL298=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL298.getTree());
            pushFollow(FOLLOW_type_in_catchDef2074);
            type299=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type299.getTree());
            pushFollow(FOLLOW_id_in_catchDef2076);
            id300=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id300.getTree());
            pushFollow(FOLLOW_parR_in_catchDef2078);
            parR301=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR301.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, catchDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchDef"

    public static class g_finally_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_finally"
    // src/net/colar/netbeans/fan/antlr/Fan.g:339:1: g_finally : KW_FINALLY ( ( bracketL )=> finally_long | ( stmt )* ) ;
    public final FanParser.g_finally_return g_finally() throws RecognitionException {
        FanParser.g_finally_return retval = new FanParser.g_finally_return();
        retval.start = input.LT(1);
        int g_finally_StartIndex = input.index();
        Object root_0 = null;

        Token KW_FINALLY302=null;
        FanParser.finally_long_return finally_long303 = null;

        FanParser.stmt_return stmt304 = null;


        Object KW_FINALLY302_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:339:11: ( KW_FINALLY ( ( bracketL )=> finally_long | ( stmt )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:339:13: KW_FINALLY ( ( bracketL )=> finally_long | ( stmt )* )
            {
            root_0 = (Object)adaptor.nil();

            KW_FINALLY302=(Token)match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_g_finally2086); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_FINALLY302_tree = (Object)adaptor.create(KW_FINALLY302);
            adaptor.addChild(root_0, KW_FINALLY302_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:339:24: ( ( bracketL )=> finally_long | ( stmt )* )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==BRACKET_L) && (synpred135_Fan())) {
                alt93=1;
            }
            else if ( (LA93_0==EOF||(LA93_0>=KW_BREAK && LA93_0<=KW_FINALLY)||(LA93_0>=KW_RD_ONLY && LA93_0<=KW_FINAL)||(LA93_0>=KW_ABSTRACT && LA93_0<=KW_ELSE)||(LA93_0>=KW_NULL && LA93_0<=KW_FALSE)||LA93_0==SP_COMMA||LA93_0==SP_PIPE||LA93_0==SP_SEMI||LA93_0==OP_CURRY||(LA93_0>=OP_PLUS && LA93_0<=OP_MINUS)||(LA93_0>=OP_BANG && LA93_0<=OP_TILDA)||(LA93_0>=AT && LA93_0<=NUMBER)||(LA93_0>=BRACKET_R && LA93_0<=SQ_BRACKET_L)||LA93_0==PAR_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:339:25: ( bracketL )=> finally_long
                    {
                    pushFollow(FOLLOW_finally_long_in_g_finally2093);
                    finally_long303=finally_long();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, finally_long303.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:339:52: ( stmt )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:339:52: ( stmt )*
                    loop92:
                    do {
                        int alt92=2;
                        alt92 = dfa92.predict(input);
                        switch (alt92) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_g_finally2097);
                    	    stmt304=stmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt304.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop92;
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
            if ( state.backtracking>0 ) { memoize(input, 73, g_finally_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_finally"

    public static class finally_long_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "finally_long"
    // src/net/colar/netbeans/fan/antlr/Fan.g:340:1: finally_long : bracketL ( stmt )* bracketR ;
    public final FanParser.finally_long_return finally_long() throws RecognitionException {
        FanParser.finally_long_return retval = new FanParser.finally_long_return();
        retval.start = input.LT(1);
        int finally_long_StartIndex = input.index();
        Object root_0 = null;

        FanParser.bracketL_return bracketL305 = null;

        FanParser.stmt_return stmt306 = null;

        FanParser.bracketR_return bracketR307 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:14: ( bracketL ( stmt )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:16: bracketL ( stmt )* bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bracketL_in_finally_long2106);
            bracketL305=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL305.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:340:25: ( stmt )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( ((LA94_0>=KW_BREAK && LA94_0<=KW_TRY)||(LA94_0>=KW_THIS && LA94_0<=KW_SUPER)||(LA94_0>=KW_NULL && LA94_0<=KW_FALSE)||LA94_0==SP_PIPE||LA94_0==OP_CURRY||(LA94_0>=OP_PLUS && LA94_0<=OP_MINUS)||(LA94_0>=OP_BANG && LA94_0<=OP_TILDA)||(LA94_0>=AT && LA94_0<=OP_POUND)||LA94_0==NUMBER||LA94_0==SQ_BRACKET_L||LA94_0==PAR_L) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_finally_long2108);
            	    stmt306=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt306.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_finally_long2111);
            bracketR307=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR307.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, finally_long_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "finally_long"

    public static class g_case_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_case"
    // src/net/colar/netbeans/fan/antlr/Fan.g:341:1: g_case : KW_CASE expr SP_COLON ( stmt )* ;
    public final FanParser.g_case_return g_case() throws RecognitionException {
        FanParser.g_case_return retval = new FanParser.g_case_return();
        retval.start = input.LT(1);
        int g_case_StartIndex = input.index();
        Object root_0 = null;

        Token KW_CASE308=null;
        Token SP_COLON310=null;
        FanParser.expr_return expr309 = null;

        FanParser.stmt_return stmt311 = null;


        Object KW_CASE308_tree=null;
        Object SP_COLON310_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:341:9: ( KW_CASE expr SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:341:11: KW_CASE expr SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_CASE308=(Token)match(input,KW_CASE,FOLLOW_KW_CASE_in_g_case2119); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_CASE308_tree = (Object)adaptor.create(KW_CASE308);
            adaptor.addChild(root_0, KW_CASE308_tree);
            }
            pushFollow(FOLLOW_expr_in_g_case2121);
            expr309=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr309.getTree());
            SP_COLON310=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_case2123); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON310_tree = (Object)adaptor.create(SP_COLON310);
            adaptor.addChild(root_0, SP_COLON310_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:341:33: ( stmt )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( ((LA95_0>=KW_BREAK && LA95_0<=KW_TRY)||(LA95_0>=KW_THIS && LA95_0<=KW_SUPER)||(LA95_0>=KW_NULL && LA95_0<=KW_FALSE)||LA95_0==SP_PIPE||LA95_0==OP_CURRY||(LA95_0>=OP_PLUS && LA95_0<=OP_MINUS)||(LA95_0>=OP_BANG && LA95_0<=OP_TILDA)||(LA95_0>=AT && LA95_0<=OP_POUND)||LA95_0==NUMBER||LA95_0==SQ_BRACKET_L||LA95_0==PAR_L) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_case2125);
            	    stmt311=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt311.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 75, g_case_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_case"

    public static class g_default_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_default"
    // src/net/colar/netbeans/fan/antlr/Fan.g:342:1: g_default : KW_DEFAULT SP_COLON ( stmt )* ;
    public final FanParser.g_default_return g_default() throws RecognitionException {
        FanParser.g_default_return retval = new FanParser.g_default_return();
        retval.start = input.LT(1);
        int g_default_StartIndex = input.index();
        Object root_0 = null;

        Token KW_DEFAULT312=null;
        Token SP_COLON313=null;
        FanParser.stmt_return stmt314 = null;


        Object KW_DEFAULT312_tree=null;
        Object SP_COLON313_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:11: ( KW_DEFAULT SP_COLON ( stmt )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:13: KW_DEFAULT SP_COLON ( stmt )*
            {
            root_0 = (Object)adaptor.nil();

            KW_DEFAULT312=(Token)match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_g_default2133); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_DEFAULT312_tree = (Object)adaptor.create(KW_DEFAULT312);
            adaptor.addChild(root_0, KW_DEFAULT312_tree);
            }
            SP_COLON313=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_g_default2135); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON313_tree = (Object)adaptor.create(SP_COLON313);
            adaptor.addChild(root_0, SP_COLON313_tree);
            }
            // src/net/colar/netbeans/fan/antlr/Fan.g:342:33: ( stmt )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( ((LA96_0>=KW_BREAK && LA96_0<=KW_TRY)||(LA96_0>=KW_THIS && LA96_0<=KW_SUPER)||(LA96_0>=KW_NULL && LA96_0<=KW_FALSE)||LA96_0==SP_PIPE||LA96_0==OP_CURRY||(LA96_0>=OP_PLUS && LA96_0<=OP_MINUS)||(LA96_0>=OP_BANG && LA96_0<=OP_TILDA)||(LA96_0>=AT && LA96_0<=OP_POUND)||LA96_0==NUMBER||LA96_0==SQ_BRACKET_L||LA96_0==PAR_L) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_g_default2137);
            	    stmt314=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt314.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 76, g_default_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_default"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:345:1: expr : assignExpr ;
    public final FanParser.expr_return expr() throws RecognitionException {
        FanParser.expr_return retval = new FanParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.assignExpr_return assignExpr315 = null;



        paraphrase.push("Expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:347:3: ( assignExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:347:5: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr2158);
            assignExpr315=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr315.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 77, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class assignExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:348:1: assignExpr : ternaryExpr ( assignOp assignExpr )? ;
    public final FanParser.assignExpr_return assignExpr() throws RecognitionException {
        FanParser.assignExpr_return retval = new FanParser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.ternaryExpr_return ternaryExpr316 = null;

        FanParser.assignOp_return assignOp317 = null;

        FanParser.assignExpr_return assignExpr318 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:12: ( ternaryExpr ( assignOp assignExpr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:14: ternaryExpr ( assignOp assignExpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2165);
            ternaryExpr316=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr316.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:348:26: ( assignOp assignExpr )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( ((LA97_0>=AS_EQUAL && LA97_0<=AS_ASSIGN_OP)) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:348:27: assignOp assignExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2168);
                    assignOp317=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp317.getTree());
                    pushFollow(FOLLOW_assignExpr_in_assignExpr2170);
                    assignExpr318=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr318.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 78, assignExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExpr"

    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:349:1: ternaryExpr : condOrExpr ( ternaryTail )? ;
    public final FanParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        FanParser.ternaryExpr_return retval = new FanParser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.condOrExpr_return condOrExpr319 = null;

        FanParser.ternaryTail_return ternaryTail320 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:13: ( condOrExpr ( ternaryTail )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:15: condOrExpr ( ternaryTail )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condOrExpr_in_ternaryExpr2179);
            condOrExpr319=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr319.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:349:26: ( ternaryTail )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==SP_QMARK) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:349:27: ternaryTail
                    {
                    pushFollow(FOLLOW_ternaryTail_in_ternaryExpr2182);
                    ternaryTail320=ternaryTail();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryTail320.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 79, ternaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"

    public static class ternaryTail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryTail"
    // src/net/colar/netbeans/fan/antlr/Fan.g:351:1: ternaryTail : SP_QMARK condOrExpr SP_COLON condOrExpr ;
    public final FanParser.ternaryTail_return ternaryTail() throws RecognitionException {
        FanParser.ternaryTail_return retval = new FanParser.ternaryTail_return();
        retval.start = input.LT(1);
        int ternaryTail_StartIndex = input.index();
        Object root_0 = null;

        Token SP_QMARK321=null;
        Token SP_COLON323=null;
        FanParser.condOrExpr_return condOrExpr322 = null;

        FanParser.condOrExpr_return condOrExpr324 = null;


        Object SP_QMARK321_tree=null;
        Object SP_COLON323_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:13: ( SP_QMARK condOrExpr SP_COLON condOrExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:351:15: SP_QMARK condOrExpr SP_COLON condOrExpr
            {
            root_0 = (Object)adaptor.nil();

            SP_QMARK321=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_ternaryTail2192); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_QMARK321_tree = (Object)adaptor.create(SP_QMARK321);
            adaptor.addChild(root_0, SP_QMARK321_tree);
            }
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail2194);
            condOrExpr322=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr322.getTree());
            SP_COLON323=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_ternaryTail2196); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON323_tree = (Object)adaptor.create(SP_COLON323);
            adaptor.addChild(root_0, SP_COLON323_tree);
            }
            pushFollow(FOLLOW_condOrExpr_in_ternaryTail2198);
            condOrExpr324=condOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condOrExpr324.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, ternaryTail_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryTail"

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:352:1: assignOp : ( AS_EQUAL | AS_ASSIGN_OP );
    public final FanParser.assignOp_return assignOp() throws RecognitionException {
        FanParser.assignOp_return retval = new FanParser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token set325=null;

        Object set325_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:352:10: ( AS_EQUAL | AS_ASSIGN_OP )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            root_0 = (Object)adaptor.nil();

            set325=(Token)input.LT(1);
            if ( (input.LA(1)>=AS_EQUAL && input.LA(1)<=AS_ASSIGN_OP) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set325));
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
            if ( state.backtracking>0 ) { memoize(input, 81, assignOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignOp"

    public static class condOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:353:1: condOrExpr : condAndExpr ( OP_OR condAndExpr )* ;
    public final FanParser.condOrExpr_return condOrExpr() throws RecognitionException {
        FanParser.condOrExpr_return retval = new FanParser.condOrExpr_return();
        retval.start = input.LT(1);
        int condOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_OR327=null;
        FanParser.condAndExpr_return condAndExpr326 = null;

        FanParser.condAndExpr_return condAndExpr328 = null;


        Object OP_OR327_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:13: ( condAndExpr ( OP_OR condAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:15: condAndExpr ( OP_OR condAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condAndExpr_in_condOrExpr2217);
            condAndExpr326=condAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr326.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:353:28: ( OP_OR condAndExpr )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==OP_OR) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:353:29: OP_OR condAndExpr
            	    {
            	    OP_OR327=(Token)match(input,OP_OR,FOLLOW_OP_OR_in_condOrExpr2221); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_OR327_tree = (Object)adaptor.create(OP_OR327);
            	    adaptor.addChild(root_0, OP_OR327_tree);
            	    }
            	    pushFollow(FOLLOW_condAndExpr_in_condOrExpr2224);
            	    condAndExpr328=condAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condAndExpr328.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 82, condOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condOrExpr"

    public static class condAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:354:1: condAndExpr : equalityExpr ( OP_AND equalityExpr )* ;
    public final FanParser.condAndExpr_return condAndExpr() throws RecognitionException {
        FanParser.condAndExpr_return retval = new FanParser.condAndExpr_return();
        retval.start = input.LT(1);
        int condAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_AND330=null;
        FanParser.equalityExpr_return equalityExpr329 = null;

        FanParser.equalityExpr_return equalityExpr331 = null;


        Object OP_AND330_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:14: ( equalityExpr ( OP_AND equalityExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:16: equalityExpr ( OP_AND equalityExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpr_in_condAndExpr2234);
            equalityExpr329=equalityExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr329.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:354:29: ( OP_AND equalityExpr )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==OP_AND) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:354:30: OP_AND equalityExpr
            	    {
            	    OP_AND330=(Token)match(input,OP_AND,FOLLOW_OP_AND_in_condAndExpr2237); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_AND330_tree = (Object)adaptor.create(OP_AND330);
            	    adaptor.addChild(root_0, OP_AND330_tree);
            	    }
            	    pushFollow(FOLLOW_equalityExpr_in_condAndExpr2240);
            	    equalityExpr331=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr331.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 83, condAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condAndExpr"

    public static class equalityExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:355:1: equalityExpr : relationalExpr ( CP_EQUALITY relationalExpr )* ;
    public final FanParser.equalityExpr_return equalityExpr() throws RecognitionException {
        FanParser.equalityExpr_return retval = new FanParser.equalityExpr_return();
        retval.start = input.LT(1);
        int equalityExpr_StartIndex = input.index();
        Object root_0 = null;

        Token CP_EQUALITY333=null;
        FanParser.relationalExpr_return relationalExpr332 = null;

        FanParser.relationalExpr_return relationalExpr334 = null;


        Object CP_EQUALITY333_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:14: ( relationalExpr ( CP_EQUALITY relationalExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:16: relationalExpr ( CP_EQUALITY relationalExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpr_in_equalityExpr2250);
            relationalExpr332=relationalExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr332.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:355:31: ( CP_EQUALITY relationalExpr )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==CP_EQUALITY) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:355:32: CP_EQUALITY relationalExpr
            	    {
            	    CP_EQUALITY333=(Token)match(input,CP_EQUALITY,FOLLOW_CP_EQUALITY_in_equalityExpr2253); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_EQUALITY333_tree = (Object)adaptor.create(CP_EQUALITY333);
            	    adaptor.addChild(root_0, CP_EQUALITY333_tree);
            	    }
            	    pushFollow(FOLLOW_relationalExpr_in_equalityExpr2255);
            	    relationalExpr334=relationalExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr334.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 84, equalityExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpr"

    public static class relationalExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:357:1: relationalExpr : elvisExpr ( typeCheck | compare ) ;
    public final FanParser.relationalExpr_return relationalExpr() throws RecognitionException {
        FanParser.relationalExpr_return retval = new FanParser.relationalExpr_return();
        retval.start = input.LT(1);
        int relationalExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.elvisExpr_return elvisExpr335 = null;

        FanParser.typeCheck_return typeCheck336 = null;

        FanParser.compare_return compare337 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:357:16: ( elvisExpr ( typeCheck | compare ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:357:20: elvisExpr ( typeCheck | compare )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_elvisExpr_in_relationalExpr2268);
            elvisExpr335=elvisExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr335.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:357:30: ( typeCheck | compare )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==KW_AS||(LA102_0>=KW_IS && LA102_0<=KW_ISNOT)) ) {
                alt102=1;
            }
            else if ( (LA102_0==EOF||(LA102_0>=KW_BREAK && LA102_0<=KW_USING)||(LA102_0>=KW_RD_ONLY && LA102_0<=KW_FINAL)||(LA102_0>=KW_CLASS && LA102_0<=KW_ELSE)||(LA102_0>=KW_NULL && LA102_0<=KW_FALSE)||(LA102_0>=SP_COLON && LA102_0<=SP_QMARK)||LA102_0==SP_PIPE||(LA102_0>=SP_SEMI && LA102_0<=CP_COMPARATORS)||LA102_0==OP_CURRY||(LA102_0>=OP_PLUS && LA102_0<=OP_MINUS)||(LA102_0>=OP_BANG && LA102_0<=OP_TILDA)||(LA102_0>=AT && LA102_0<=PAR_R)) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:357:31: typeCheck
                    {
                    pushFollow(FOLLOW_typeCheck_in_relationalExpr2271);
                    typeCheck336=typeCheck();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeCheck336.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:357:43: compare
                    {
                    pushFollow(FOLLOW_compare_in_relationalExpr2275);
                    compare337=compare();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compare337.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 85, relationalExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpr"

    public static class typeCheck_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeCheck"
    // src/net/colar/netbeans/fan/antlr/Fan.g:359:1: typeCheck : ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* ;
    public final FanParser.typeCheck_return typeCheck() throws RecognitionException {
        FanParser.typeCheck_return retval = new FanParser.typeCheck_return();
        retval.start = input.LT(1);
        int typeCheck_StartIndex = input.index();
        Object root_0 = null;

        Token set338=null;
        Token SP_QMARK340=null;
        Token string_literal341=null;
        FanParser.typeRoot_return typeRoot339 = null;


        Object set338_tree=null;
        Object SP_QMARK340_tree=null;
        Object string_literal341_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:11: ( ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:15: ( KW_ISNOT | KW_IS | KW_AS ) typeRoot ( ( SP_QMARK )? {...}? '[]' )*
            {
            root_0 = (Object)adaptor.nil();

            set338=(Token)input.LT(1);
            if ( input.LA(1)==KW_AS||(input.LA(1)>=KW_IS && input.LA(1)<=KW_ISNOT) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set338));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_typeRoot_in_typeCheck2298);
            typeRoot339=typeRoot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeRoot339.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:359:51: ( ( SP_QMARK )? {...}? '[]' )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:359:52: ( SP_QMARK )? {...}? '[]'
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:359:52: ( SP_QMARK )?
            	    int alt103=2;
            	    int LA103_0 = input.LA(1);

            	    if ( (LA103_0==SP_QMARK) ) {
            	        alt103=1;
            	    }
            	    switch (alt103) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
            	            {
            	            SP_QMARK340=(Token)match(input,SP_QMARK,FOLLOW_SP_QMARK_in_typeCheck2301); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_QMARK340_tree = (Object)adaptor.create(SP_QMARK340);
            	            adaptor.addChild(root_0, SP_QMARK340_tree);
            	            }

            	            }
            	            break;

            	    }

            	    if ( !((notAfterEol())) ) {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        throw new FailedPredicateException(input, "typeCheck", "notAfterEol()");
            	    }
            	    string_literal341=(Token)match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_typeCheck2306); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal341_tree = (Object)adaptor.create(string_literal341);
            	    adaptor.addChild(root_0, string_literal341_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 86, typeCheck_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeCheck"

    public static class compare_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare"
    // src/net/colar/netbeans/fan/antlr/Fan.g:360:1: compare : ( CP_COMPARATORS elvisExpr )* ;
    public final FanParser.compare_return compare() throws RecognitionException {
        FanParser.compare_return retval = new FanParser.compare_return();
        retval.start = input.LT(1);
        int compare_StartIndex = input.index();
        Object root_0 = null;

        Token CP_COMPARATORS342=null;
        FanParser.elvisExpr_return elvisExpr343 = null;


        Object CP_COMPARATORS342_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:360:10: ( ( CP_COMPARATORS elvisExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:360:14: ( CP_COMPARATORS elvisExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:360:14: ( CP_COMPARATORS elvisExpr )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==CP_COMPARATORS) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:360:15: CP_COMPARATORS elvisExpr
            	    {
            	    CP_COMPARATORS342=(Token)match(input,CP_COMPARATORS,FOLLOW_CP_COMPARATORS_in_compare2319); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CP_COMPARATORS342_tree = (Object)adaptor.create(CP_COMPARATORS342);
            	    adaptor.addChild(root_0, CP_COMPARATORS342_tree);
            	    }
            	    pushFollow(FOLLOW_elvisExpr_in_compare2321);
            	    elvisExpr343=elvisExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, elvisExpr343.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 87, compare_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "compare"

    public static class elvisExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elvisExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:362:1: elvisExpr : rangeExpr ( OP_ELVIS rangeExpr )* ;
    public final FanParser.elvisExpr_return elvisExpr() throws RecognitionException {
        FanParser.elvisExpr_return retval = new FanParser.elvisExpr_return();
        retval.start = input.LT(1);
        int elvisExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ELVIS345=null;
        FanParser.rangeExpr_return rangeExpr344 = null;

        FanParser.rangeExpr_return rangeExpr346 = null;


        Object OP_ELVIS345_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:362:12: ( rangeExpr ( OP_ELVIS rangeExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:362:14: rangeExpr ( OP_ELVIS rangeExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rangeExpr_in_elvisExpr2332);
            rangeExpr344=rangeExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rangeExpr344.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:362:24: ( OP_ELVIS rangeExpr )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==OP_ELVIS) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:362:25: OP_ELVIS rangeExpr
            	    {
            	    OP_ELVIS345=(Token)match(input,OP_ELVIS,FOLLOW_OP_ELVIS_in_elvisExpr2335); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_ELVIS345_tree = (Object)adaptor.create(OP_ELVIS345);
            	    adaptor.addChild(root_0, OP_ELVIS345_tree);
            	    }
            	    pushFollow(FOLLOW_rangeExpr_in_elvisExpr2337);
            	    rangeExpr346=rangeExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rangeExpr346.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 88, elvisExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elvisExpr"

    public static class rangeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rangeExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:363:1: rangeExpr : bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* ;
    public final FanParser.rangeExpr_return rangeExpr() throws RecognitionException {
        FanParser.rangeExpr_return retval = new FanParser.rangeExpr_return();
        retval.start = input.LT(1);
        int rangeExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set348=null;
        FanParser.bitOrExpr_return bitOrExpr347 = null;

        FanParser.bitOrExpr_return bitOrExpr349 = null;


        Object set348_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:12: ( bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:14: bitOrExpr ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2348);
            bitOrExpr347=bitOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitOrExpr347.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:363:24: ( ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( ((LA107_0>=OP_RANG_EXCL_OLD && LA107_0<=OP_RANGE)) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:363:25: ( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr
            	    {
            	    set348=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_RANG_EXCL_OLD && input.LA(1)<=OP_RANGE) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set348));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitOrExpr_in_rangeExpr2365);
            	    bitOrExpr349=bitOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitOrExpr349.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 89, rangeExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "rangeExpr"

    public static class bitOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitOrExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:364:1: bitOrExpr : bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* ;
    public final FanParser.bitOrExpr_return bitOrExpr() throws RecognitionException {
        FanParser.bitOrExpr_return retval = new FanParser.bitOrExpr_return();
        retval.start = input.LT(1);
        int bitOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set351=null;
        FanParser.bitAndExpr_return bitAndExpr350 = null;

        FanParser.bitAndExpr_return bitAndExpr352 = null;


        Object set351_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:12: ( bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:14: bitAndExpr ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2376);
            bitAndExpr350=bitAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitAndExpr350.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:364:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*
            loop108:
            do {
                int alt108=2;
                alt108 = dfa108.predict(input);
                switch (alt108) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:364:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
            	    {
            	    set351=(Token)input.LT(1);
            	    if ( input.LA(1)==SP_PIPE||input.LA(1)==OP_BITOR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set351));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bitAndExpr_in_bitOrExpr2387);
            	    bitAndExpr352=bitAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitAndExpr352.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 90, bitOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitOrExpr"

    public static class bitAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitAndExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:365:1: bitAndExpr : shiftExpr ( OP_CURRY shiftExpr )* ;
    public final FanParser.bitAndExpr_return bitAndExpr() throws RecognitionException {
        FanParser.bitAndExpr_return retval = new FanParser.bitAndExpr_return();
        retval.start = input.LT(1);
        int bitAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token OP_CURRY354=null;
        FanParser.shiftExpr_return shiftExpr353 = null;

        FanParser.shiftExpr_return shiftExpr355 = null;


        Object OP_CURRY354_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:365:13: ( shiftExpr ( OP_CURRY shiftExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:365:15: shiftExpr ( OP_CURRY shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2398);
            shiftExpr353=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr353.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:365:25: ( OP_CURRY shiftExpr )*
            loop109:
            do {
                int alt109=2;
                alt109 = dfa109.predict(input);
                switch (alt109) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:365:26: OP_CURRY shiftExpr
            	    {
            	    OP_CURRY354=(Token)match(input,OP_CURRY,FOLLOW_OP_CURRY_in_bitAndExpr2401); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OP_CURRY354_tree = (Object)adaptor.create(OP_CURRY354);
            	    adaptor.addChild(root_0, OP_CURRY354_tree);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitAndExpr2403);
            	    shiftExpr355=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr355.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 91, bitAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitAndExpr"

    public static class shiftExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:366:1: shiftExpr : addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* ;
    public final FanParser.shiftExpr_return shiftExpr() throws RecognitionException {
        FanParser.shiftExpr_return retval = new FanParser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set357=null;
        FanParser.addExpr_return addExpr356 = null;

        FanParser.addExpr_return addExpr358 = null;


        Object set357_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:12: ( addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:14: addExpr ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_shiftExpr2415);
            addExpr356=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr356.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:366:22: ( ( OP_LSHIFT | OP_RSHIFT ) addExpr )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( ((LA110_0>=OP_LSHIFT && LA110_0<=OP_RSHIFT)) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:366:23: ( OP_LSHIFT | OP_RSHIFT ) addExpr
            	    {
            	    set357=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_LSHIFT && input.LA(1)<=OP_RSHIFT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set357));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2426);
            	    addExpr358=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr358.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 92, shiftExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:367:1: addExpr : multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* ;
    public final FanParser.addExpr_return addExpr() throws RecognitionException {
        FanParser.addExpr_return retval = new FanParser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set360=null;
        FanParser.multExpr_return multExpr359 = null;

        FanParser.multExpr_return multExpr361 = null;


        Object set360_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:367:10: ( multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:367:12: multExpr ( ( OP_PLUS | OP_MINUS ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_addExpr2437);
            multExpr359=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr359.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:367:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*
            loop111:
            do {
                int alt111=2;
                alt111 = dfa111.predict(input);
                switch (alt111) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:367:22: ( OP_PLUS | OP_MINUS ) multExpr
            	    {
            	    set360=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set360));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2448);
            	    multExpr361=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr361.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 93, addExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class addAppend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addAppend"
    // src/net/colar/netbeans/fan/antlr/Fan.g:368:1: addAppend : ( OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.addAppend_return addAppend() throws RecognitionException {
        FanParser.addAppend_return retval = new FanParser.addAppend_return();
        retval.start = input.LT(1);
        int addAppend_StartIndex = input.index();
        Object root_0 = null;

        Token set362=null;
        FanParser.parenExpr_return parenExpr363 = null;


        Object set362_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:368:11: ( ( OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:368:13: ( OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set362=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set362));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_addAppend2466);
            parenExpr363=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr363.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, addAppend_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addAppend"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:369:1: multExpr : parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* ;
    public final FanParser.multExpr_return multExpr() throws RecognitionException {
        FanParser.multExpr_return retval = new FanParser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set365=null;
        FanParser.parenExpr_return parenExpr364 = null;

        FanParser.parenExpr_return parenExpr366 = null;


        Object set365_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:11: ( parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:13: parenExpr ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parenExpr_in_multExpr2474);
            parenExpr364=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr364.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:369:23: ( ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( ((LA112_0>=OP_MULTI && LA112_0<=OP_MOD)) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:369:24: ( OP_MULTI | OP_DIV | OP_MOD ) parenExpr
            	    {
            	    set365=(Token)input.LT(1);
            	    if ( (input.LA(1)>=OP_MULTI && input.LA(1)<=OP_MOD) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set365));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_parenExpr_in_multExpr2489);
            	    parenExpr366=parenExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr366.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 95, multExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class parenExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parenExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:370:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );
    public final FanParser.parenExpr_return parenExpr() throws RecognitionException {
        FanParser.parenExpr_return retval = new FanParser.parenExpr_return();
        retval.start = input.LT(1);
        int parenExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.castExpr_return castExpr367 = null;

        FanParser.groupedExpr_return groupedExpr368 = null;

        FanParser.unaryExpr_return unaryExpr369 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:370:12: ( castExpr | groupedExpr | unaryExpr )
            int alt113=3;
            alt113 = dfa113.predict(input);
            switch (alt113) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:370:14: castExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_castExpr_in_parenExpr2500);
                    castExpr367=castExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpr367.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:370:25: groupedExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_groupedExpr_in_parenExpr2504);
                    groupedExpr368=groupedExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, groupedExpr368.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:370:39: unaryExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpr_in_parenExpr2508);
                    unaryExpr369=unaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpr369.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 96, parenExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parenExpr"

    public static class castExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "castExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:372:1: castExpr : {...}? parL type parR parenExpr ;
    public final FanParser.castExpr_return castExpr() throws RecognitionException {
        FanParser.castExpr_return retval = new FanParser.castExpr_return();
        retval.start = input.LT(1);
        int castExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL370 = null;

        FanParser.type_return type371 = null;

        FanParser.parR_return parR372 = null;

        FanParser.parenExpr_return parenExpr373 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:11: ({...}? parL type parR parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:372:13: {...}? parL type parR parenExpr
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "castExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_castExpr2519);
            parL370=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL370.getTree());
            pushFollow(FOLLOW_type_in_castExpr2521);
            type371=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type371.getTree());
            pushFollow(FOLLOW_parR_in_castExpr2523);
            parR372=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR372.getTree());
            pushFollow(FOLLOW_parenExpr_in_castExpr2525);
            parenExpr373=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr373.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, castExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "castExpr"

    public static class groupedExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupedExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:374:1: groupedExpr : parL expr parR ( termChain )* ;
    public final FanParser.groupedExpr_return groupedExpr() throws RecognitionException {
        FanParser.groupedExpr_return retval = new FanParser.groupedExpr_return();
        retval.start = input.LT(1);
        int groupedExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL374 = null;

        FanParser.expr_return expr375 = null;

        FanParser.parR_return parR376 = null;

        FanParser.termChain_return termChain377 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:374:14: ( parL expr parR ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:374:16: parL expr parR ( termChain )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parL_in_groupedExpr2534);
            parL374=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL374.getTree());
            pushFollow(FOLLOW_expr_in_groupedExpr2536);
            expr375=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr375.getTree());
            pushFollow(FOLLOW_parR_in_groupedExpr2538);
            parR376=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR376.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:374:31: ( termChain )*
            loop114:
            do {
                int alt114=2;
                alt114 = dfa114.predict(input);
                switch (alt114) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_groupedExpr2540);
            	    termChain377=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, termChain377.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 98, groupedExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "groupedExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:375:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );
    public final FanParser.unaryExpr_return unaryExpr() throws RecognitionException {
        FanParser.unaryExpr_return retval = new FanParser.unaryExpr_return();
        retval.start = input.LT(1);
        int unaryExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.prefixExpr_return prefixExpr378 = null;

        FanParser.postfixExpr_return postfixExpr379 = null;

        FanParser.termExpr_return termExpr380 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:375:12: ( prefixExpr | postfixExpr | termExpr )
            int alt115=3;
            alt115 = dfa115.predict(input);
            switch (alt115) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:375:14: prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prefixExpr_in_unaryExpr2549);
                    prefixExpr378=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr378.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:375:27: postfixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpr_in_unaryExpr2553);
                    postfixExpr379=postfixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpr379.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:375:41: termExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_termExpr_in_unaryExpr2557);
                    termExpr380=termExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr380.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 99, unaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExpr"

    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:376:1: prefixExpr : ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr ;
    public final FanParser.prefixExpr_return prefixExpr() throws RecognitionException {
        FanParser.prefixExpr_return retval = new FanParser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set381=null;
        FanParser.parenExpr_return parenExpr382 = null;


        Object set381_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:13: ( ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:376:15: ( OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS ) parenExpr
            {
            root_0 = (Object)adaptor.nil();

            set381=(Token)input.LT(1);
            if ( input.LA(1)==OP_CURRY||(input.LA(1)>=OP_PLUS && input.LA(1)<=OP_MINUS)||(input.LA(1)>=OP_BANG && input.LA(1)<=OP_TILDA) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set381));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_parenExpr_in_prefixExpr2593);
            parenExpr382=parenExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parenExpr382.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, prefixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixExpr"

    public static class postfixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:377:1: postfixExpr : termExpr ( OP_2PLUS | OP_2MINUS ) ;
    public final FanParser.postfixExpr_return postfixExpr() throws RecognitionException {
        FanParser.postfixExpr_return retval = new FanParser.postfixExpr_return();
        retval.start = input.LT(1);
        int postfixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set384=null;
        FanParser.termExpr_return termExpr383 = null;


        Object set384_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:14: ( termExpr ( OP_2PLUS | OP_2MINUS ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:377:16: termExpr ( OP_2PLUS | OP_2MINUS )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_termExpr_in_postfixExpr2602);
            termExpr383=termExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, termExpr383.getTree());
            set384=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_2PLUS && input.LA(1)<=OP_2MINUS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set384));
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
            if ( state.backtracking>0 ) { memoize(input, 101, postfixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "postfixExpr"

    public static class termExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:378:1: termExpr : termBase ( termChain )* ;
    public final FanParser.termExpr_return termExpr() throws RecognitionException {
        FanParser.termExpr_return retval = new FanParser.termExpr_return();
        retval.start = input.LT(1);
        int termExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.termBase_return termBase385 = null;

        FanParser.termChain_return termChain386 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:11: ( termBase ( termChain )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:13: termBase ( termChain )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_termBase_in_termExpr2619);
            termBase385=termBase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, termBase385.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:378:22: ( termChain )*
            loop116:
            do {
                int alt116=2;
                alt116 = dfa116.predict(input);
                switch (alt116) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: termChain
            	    {
            	    pushFollow(FOLLOW_termChain_in_termExpr2621);
            	    termChain386=termChain();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, termChain386.getTree());

            	    }
            	    break;

            	default :
            	    break loop116;
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
            if ( state.backtracking>0 ) { memoize(input, 102, termExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termExpr"

    public static class termBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:380:1: termBase : ( idExprReq | literal | typeBase | id );
    public final FanParser.termBase_return termBase() throws RecognitionException {
        FanParser.termBase_return retval = new FanParser.termBase_return();
        retval.start = input.LT(1);
        int termBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq387 = null;

        FanParser.literal_return literal388 = null;

        FanParser.typeBase_return typeBase389 = null;

        FanParser.id_return id390 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:380:11: ( idExprReq | literal | typeBase | id )
            int alt117=4;
            alt117 = dfa117.predict(input);
            switch (alt117) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:380:13: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_termBase2631);
                    idExprReq387=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq387.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:380:25: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_termBase2635);
                    literal388=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal388.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:380:35: typeBase
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeBase_in_termBase2639);
                    typeBase389=typeBase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeBase389.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:380:46: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_termBase2643);
                    id390=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id390.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 103, termBase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termBase"

    public static class typeBase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeBase"
    // src/net/colar/netbeans/fan/antlr/Fan.g:381:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );
    public final FanParser.typeBase_return typeBase() throws RecognitionException {
        FanParser.typeBase_return retval = new FanParser.typeBase_return();
        retval.start = input.LT(1);
        int typeBase_StartIndex = input.index();
        Object root_0 = null;

        FanParser.typeLiteral_return typeLiteral391 = null;

        FanParser.slotLiteral_return slotLiteral392 = null;

        FanParser.namedSuper_return namedSuper393 = null;

        FanParser.staticCall_return staticCall394 = null;

        FanParser.dsl_return dsl395 = null;

        FanParser.closure_return closure396 = null;

        FanParser.simple_return simple397 = null;

        FanParser.ctorBlock_return ctorBlock398 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:381:10: ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock )
            int alt118=8;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:12: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_typeBase2650);
                    typeLiteral391=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral391.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:26: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_typeBase2654);
                    slotLiteral392=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral392.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:40: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_typeBase2658);
                    namedSuper393=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper393.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:381:53: staticCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_staticCall_in_typeBase2662);
                    staticCall394=staticCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticCall394.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:382:19: dsl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dsl_in_typeBase2684);
                    dsl395=dsl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dsl395.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:382:25: closure
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_closure_in_typeBase2688);
                    closure396=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure396.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:382:35: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_typeBase2692);
                    simple397=simple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple397.getTree());

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:382:44: ctorBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ctorBlock_in_typeBase2696);
                    ctorBlock398=ctorBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorBlock398.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 104, typeBase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeBase"

    public static class ctorBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctorBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:383:1: ctorBlock : type itBlock ;
    public final FanParser.ctorBlock_return ctorBlock() throws RecognitionException {
        FanParser.ctorBlock_return retval = new FanParser.ctorBlock_return();
        retval.start = input.LT(1);
        int ctorBlock_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type399 = null;

        FanParser.itBlock_return itBlock400 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:11: ( type itBlock )
            // src/net/colar/netbeans/fan/antlr/Fan.g:383:13: type itBlock
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_ctorBlock2703);
            type399=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type399.getTree());
            pushFollow(FOLLOW_itBlock_in_ctorBlock2705);
            itBlock400=itBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, itBlock400.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, ctorBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ctorBlock"

    public static class staticCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:384:1: staticCall : type DOT idExpr ;
    public final FanParser.staticCall_return staticCall() throws RecognitionException {
        FanParser.staticCall_return retval = new FanParser.staticCall_return();
        retval.start = input.LT(1);
        int staticCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT402=null;
        FanParser.type_return type401 = null;

        FanParser.idExpr_return idExpr403 = null;


        Object DOT402_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:12: ( type DOT idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:14: type DOT idExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_staticCall2712);
            type401=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type401.getTree());
            DOT402=(Token)match(input,DOT,FOLLOW_DOT_in_staticCall2714); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT402_tree = (Object)adaptor.create(DOT402);
            adaptor.addChild(root_0, DOT402_tree);
            }
            pushFollow(FOLLOW_idExpr_in_staticCall2716);
            idExpr403=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr403.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 106, staticCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticCall"

    public static class termChain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termChain"
    // src/net/colar/netbeans/fan/antlr/Fan.g:386:1: termChain : ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock );
    public final FanParser.termChain_return termChain() throws RecognitionException {
        FanParser.termChain_return retval = new FanParser.termChain_return();
        retval.start = input.LT(1);
        int termChain_StartIndex = input.index();
        Object root_0 = null;

        FanParser.dotCall_return dotCall404 = null;

        FanParser.dynCall_return dynCall405 = null;

        FanParser.safeDotCall_return safeDotCall406 = null;

        FanParser.safeDynCall_return safeDynCall407 = null;

        FanParser.indexExpr_return indexExpr408 = null;

        FanParser.callOp_return callOp409 = null;

        FanParser.itBlock_return itBlock410 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:12: ( dotCall | dynCall | safeDotCall | safeDynCall | indexExpr | callOp | itBlock )
            int alt119=7;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt119=1;
                }
                break;
            case OP_ARROW:
                {
                alt119=2;
                }
                break;
            case OP_SAFE_CALL:
                {
                alt119=3;
                }
                break;
            case OP_SAFEDYN_CALL:
                {
                alt119=4;
                }
                break;
            case SQ_BRACKET_L:
                {
                alt119=5;
                }
                break;
            case PAR_L:
                {
                alt119=6;
                }
                break;
            case BRACKET_L:
                {
                alt119=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:386:14: dotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotCall_in_termChain2725);
                    dotCall404=dotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotCall404.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:386:24: dynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dynCall_in_termChain2729);
                    dynCall405=dynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dynCall405.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:386:34: safeDotCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDotCall_in_termChain2733);
                    safeDotCall406=safeDotCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDotCall406.getTree());

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:386:48: safeDynCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_safeDynCall_in_termChain2737);
                    safeDynCall407=safeDynCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, safeDynCall407.getTree());

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:387:4: indexExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_indexExpr_in_termChain2744);
                    indexExpr408=indexExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpr408.getTree());

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:387:16: callOp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_callOp_in_termChain2748);
                    callOp409=callOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callOp409.getTree());

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:387:25: itBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_itBlock_in_termChain2752);
                    itBlock410=itBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, itBlock410.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 107, termChain_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termChain"

    public static class dsl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dsl"
    // src/net/colar/netbeans/fan/antlr/Fan.g:388:1: dsl : simpleType DSL ;
    public final FanParser.dsl_return dsl() throws RecognitionException {
        FanParser.dsl_return retval = new FanParser.dsl_return();
        retval.start = input.LT(1);
        int dsl_StartIndex = input.index();
        Object root_0 = null;

        Token DSL412=null;
        FanParser.simpleType_return simpleType411 = null;


        Object DSL412_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:388:13: ( simpleType DSL )
            // src/net/colar/netbeans/fan/antlr/Fan.g:388:15: simpleType DSL
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleType_in_dsl2767);
            simpleType411=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType411.getTree());
            DSL412=(Token)match(input,DSL,FOLLOW_DSL_in_dsl2769); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DSL412_tree = (Object)adaptor.create(DSL412);
            adaptor.addChild(root_0, DSL412_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 108, dsl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dsl"

    public static class itBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "itBlock"
    // src/net/colar/netbeans/fan/antlr/Fan.g:391:1: itBlock : bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR ;
    public final FanParser.itBlock_return itBlock() throws RecognitionException {
        FanParser.itBlock_return retval = new FanParser.itBlock_return();
        retval.start = input.LT(1);
        int itBlock_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA415=null;
        Token SP_SEMI416=null;
        FanParser.bracketL_return bracketL413 = null;

        FanParser.stmt_return stmt414 = null;

        FanParser.bracketR_return bracketR417 = null;


        Object SP_COMMA415_tree=null;
        Object SP_SEMI416_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:10: ( bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:12: bracketL ( stmt ( SP_COMMA )? ( SP_SEMI )? )* bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bracketL_in_itBlock2779);
            bracketL413=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL413.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:391:21: ( stmt ( SP_COMMA )? ( SP_SEMI )? )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( ((LA122_0>=KW_BREAK && LA122_0<=KW_TRY)||(LA122_0>=KW_THIS && LA122_0<=KW_SUPER)||(LA122_0>=KW_NULL && LA122_0<=KW_FALSE)||LA122_0==SP_PIPE||LA122_0==OP_CURRY||(LA122_0>=OP_PLUS && LA122_0<=OP_MINUS)||(LA122_0>=OP_BANG && LA122_0<=OP_TILDA)||(LA122_0>=AT && LA122_0<=OP_POUND)||LA122_0==NUMBER||LA122_0==SQ_BRACKET_L||LA122_0==PAR_L) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:391:22: stmt ( SP_COMMA )? ( SP_SEMI )?
            	    {
            	    pushFollow(FOLLOW_stmt_in_itBlock2782);
            	    stmt414=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt414.getTree());
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:391:27: ( SP_COMMA )?
            	    int alt120=2;
            	    int LA120_0 = input.LA(1);

            	    if ( (LA120_0==SP_COMMA) ) {
            	        alt120=1;
            	    }
            	    switch (alt120) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
            	            {
            	            SP_COMMA415=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_itBlock2784); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_COMMA415_tree = (Object)adaptor.create(SP_COMMA415);
            	            adaptor.addChild(root_0, SP_COMMA415_tree);
            	            }

            	            }
            	            break;

            	    }

            	    // src/net/colar/netbeans/fan/antlr/Fan.g:391:37: ( SP_SEMI )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==SP_SEMI) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_SEMI
            	            {
            	            SP_SEMI416=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_itBlock2787); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SP_SEMI416_tree = (Object)adaptor.create(SP_SEMI416);
            	            adaptor.addChild(root_0, SP_SEMI416_tree);
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

            pushFollow(FOLLOW_bracketR_in_itBlock2792);
            bracketR417=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR417.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 109, itBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "itBlock"

    public static class dotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:392:1: dotCall : DOT idExpr ;
    public final FanParser.dotCall_return dotCall() throws RecognitionException {
        FanParser.dotCall_return retval = new FanParser.dotCall_return();
        retval.start = input.LT(1);
        int dotCall_StartIndex = input.index();
        Object root_0 = null;

        Token DOT418=null;
        FanParser.idExpr_return idExpr419 = null;


        Object DOT418_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:10: ( DOT idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:392:12: DOT idExpr
            {
            root_0 = (Object)adaptor.nil();

            DOT418=(Token)match(input,DOT,FOLLOW_DOT_in_dotCall2800); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT418_tree = (Object)adaptor.create(DOT418);
            adaptor.addChild(root_0, DOT418_tree);
            }
            pushFollow(FOLLOW_idExpr_in_dotCall2802);
            idExpr419=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr419.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 110, dotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotCall"

    public static class dynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:393:1: dynCall : OP_ARROW idExpr ;
    public final FanParser.dynCall_return dynCall() throws RecognitionException {
        FanParser.dynCall_return retval = new FanParser.dynCall_return();
        retval.start = input.LT(1);
        int dynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_ARROW420=null;
        FanParser.idExpr_return idExpr421 = null;


        Object OP_ARROW420_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:10: ( OP_ARROW idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:12: OP_ARROW idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_ARROW420=(Token)match(input,OP_ARROW,FOLLOW_OP_ARROW_in_dynCall2810); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_ARROW420_tree = (Object)adaptor.create(OP_ARROW420);
            adaptor.addChild(root_0, OP_ARROW420_tree);
            }
            pushFollow(FOLLOW_idExpr_in_dynCall2812);
            idExpr421=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr421.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 111, dynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dynCall"

    public static class safeDotCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDotCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:394:1: safeDotCall : OP_SAFE_CALL idExpr ;
    public final FanParser.safeDotCall_return safeDotCall() throws RecognitionException {
        FanParser.safeDotCall_return retval = new FanParser.safeDotCall_return();
        retval.start = input.LT(1);
        int safeDotCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFE_CALL422=null;
        FanParser.idExpr_return idExpr423 = null;


        Object OP_SAFE_CALL422_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:14: ( OP_SAFE_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:16: OP_SAFE_CALL idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_SAFE_CALL422=(Token)match(input,OP_SAFE_CALL,FOLLOW_OP_SAFE_CALL_in_safeDotCall2820); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_SAFE_CALL422_tree = (Object)adaptor.create(OP_SAFE_CALL422);
            adaptor.addChild(root_0, OP_SAFE_CALL422_tree);
            }
            pushFollow(FOLLOW_idExpr_in_safeDotCall2822);
            idExpr423=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr423.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 112, safeDotCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDotCall"

    public static class safeDynCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeDynCall"
    // src/net/colar/netbeans/fan/antlr/Fan.g:395:1: safeDynCall : OP_SAFEDYN_CALL idExpr ;
    public final FanParser.safeDynCall_return safeDynCall() throws RecognitionException {
        FanParser.safeDynCall_return retval = new FanParser.safeDynCall_return();
        retval.start = input.LT(1);
        int safeDynCall_StartIndex = input.index();
        Object root_0 = null;

        Token OP_SAFEDYN_CALL424=null;
        FanParser.idExpr_return idExpr425 = null;


        Object OP_SAFEDYN_CALL424_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:13: ( OP_SAFEDYN_CALL idExpr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:15: OP_SAFEDYN_CALL idExpr
            {
            root_0 = (Object)adaptor.nil();

            OP_SAFEDYN_CALL424=(Token)match(input,OP_SAFEDYN_CALL,FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall2829); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_SAFEDYN_CALL424_tree = (Object)adaptor.create(OP_SAFEDYN_CALL424);
            adaptor.addChild(root_0, OP_SAFEDYN_CALL424_tree);
            }
            pushFollow(FOLLOW_idExpr_in_safeDynCall2831);
            idExpr425=idExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idExpr425.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 113, safeDynCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeDynCall"

    public static class indexExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:396:1: indexExpr : {...}? sq_bracketL expr sq_bracketR ;
    public final FanParser.indexExpr_return indexExpr() throws RecognitionException {
        FanParser.indexExpr_return retval = new FanParser.indexExpr_return();
        retval.start = input.LT(1);
        int indexExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.sq_bracketL_return sq_bracketL426 = null;

        FanParser.expr_return expr427 = null;

        FanParser.sq_bracketR_return sq_bracketR428 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:12: ({...}? sq_bracketL expr sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:396:14: {...}? sq_bracketL expr sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "indexExpr", "notAfterEol()");
            }
            pushFollow(FOLLOW_sq_bracketL_in_indexExpr2841);
            sq_bracketL426=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL426.getTree());
            pushFollow(FOLLOW_expr_in_indexExpr2843);
            expr427=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr427.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_indexExpr2845);
            sq_bracketR428=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR428.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 114, indexExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "indexExpr"

    public static class callOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callOp"
    // src/net/colar/netbeans/fan/antlr/Fan.g:398:1: callOp : {...}? parL ( args )? parR ( closure )* ;
    public final FanParser.callOp_return callOp() throws RecognitionException {
        FanParser.callOp_return retval = new FanParser.callOp_return();
        retval.start = input.LT(1);
        int callOp_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL429 = null;

        FanParser.args_return args430 = null;

        FanParser.parR_return parR431 = null;

        FanParser.closure_return closure432 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:9: ({...}? parL ( args )? parR ( closure )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:11: {...}? parL ( args )? parR ( closure )*
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callOp", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callOp2856);
            parL429=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL429.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:33: ( args )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( ((LA123_0>=KW_THIS && LA123_0<=KW_SUPER)||(LA123_0>=KW_NULL && LA123_0<=KW_FALSE)||LA123_0==SP_PIPE||LA123_0==OP_CURRY||(LA123_0>=OP_PLUS && LA123_0<=OP_MINUS)||(LA123_0>=OP_BANG && LA123_0<=OP_TILDA)||(LA123_0>=AT && LA123_0<=OP_POUND)||LA123_0==NUMBER||LA123_0==SQ_BRACKET_L||LA123_0==PAR_L) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callOp2858);
                    args430=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args430.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callOp2862);
            parR431=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR431.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:45: ( closure )*
            loop124:
            do {
                int alt124=2;
                alt124 = dfa124.predict(input);
                switch (alt124) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: closure
            	    {
            	    pushFollow(FOLLOW_closure_in_callOp2864);
            	    closure432=closure();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure432.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 115, callOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callOp"

    public static class closure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "closure"
    // src/net/colar/netbeans/fan/antlr/Fan.g:399:1: closure : funcType bracketL ( stmt )* bracketR ;
    public final FanParser.closure_return closure() throws RecognitionException {
        FanParser.closure_return retval = new FanParser.closure_return();
        retval.start = input.LT(1);
        int closure_StartIndex = input.index();
        Object root_0 = null;

        FanParser.funcType_return funcType433 = null;

        FanParser.bracketL_return bracketL434 = null;

        FanParser.stmt_return stmt435 = null;

        FanParser.bracketR_return bracketR436 = null;



        paraphrase.push("Closure");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:3: ( funcType bracketL ( stmt )* bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:7: funcType bracketL ( stmt )* bracketR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_funcType_in_closure2886);
            funcType433=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType433.getTree());
            pushFollow(FOLLOW_bracketL_in_closure2888);
            bracketL434=bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketL434.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:25: ( stmt )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( ((LA125_0>=KW_BREAK && LA125_0<=KW_TRY)||(LA125_0>=KW_THIS && LA125_0<=KW_SUPER)||(LA125_0>=KW_NULL && LA125_0<=KW_FALSE)||LA125_0==SP_PIPE||LA125_0==OP_CURRY||(LA125_0>=OP_PLUS && LA125_0<=OP_MINUS)||(LA125_0>=OP_BANG && LA125_0<=OP_TILDA)||(LA125_0>=AT && LA125_0<=OP_POUND)||LA125_0==NUMBER||LA125_0==SQ_BRACKET_L||LA125_0==PAR_L) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_closure2890);
            	    stmt435=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt435.getTree());

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);

            pushFollow(FOLLOW_bracketR_in_closure2893);
            bracketR436=bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketR436.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 116, closure_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "closure"

    public static class idExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExpr"
    // src/net/colar/netbeans/fan/antlr/Fan.g:402:1: idExpr : ( idExprReq | id );
    public final FanParser.idExpr_return idExpr() throws RecognitionException {
        FanParser.idExpr_return retval = new FanParser.idExpr_return();
        retval.start = input.LT(1);
        int idExpr_StartIndex = input.index();
        Object root_0 = null;

        FanParser.idExprReq_return idExprReq437 = null;

        FanParser.id_return id438 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:10: ( idExprReq | id )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==AT) ) {
                alt126=1;
            }
            else if ( (LA126_0==ID) ) {
                int LA126_2 = input.LA(2);

                if ( (synpred202_Fan()) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:402:12: idExprReq
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_idExprReq_in_idExpr2903);
                    idExprReq437=idExprReq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, idExprReq437.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:402:24: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_idExpr2907);
                    id438=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id438.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 117, idExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExpr"

    public static class idExprReq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idExprReq"
    // src/net/colar/netbeans/fan/antlr/Fan.g:404:1: idExprReq : ( field | call );
    public final FanParser.idExprReq_return idExprReq() throws RecognitionException {
        FanParser.idExprReq_return retval = new FanParser.idExprReq_return();
        retval.start = input.LT(1);
        int idExprReq_StartIndex = input.index();
        Object root_0 = null;

        FanParser.field_return field439 = null;

        FanParser.call_return call440 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:404:11: ( field | call )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==AT) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:13: field
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_field_in_idExprReq2915);
                    field439=field();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field439.getTree());

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:21: call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_idExprReq2919);
                    call440=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call440.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 118, idExprReq_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "idExprReq"

    public static class field_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field"
    // src/net/colar/netbeans/fan/antlr/Fan.g:406:1: field : AT ID ;
    public final FanParser.field_return field() throws RecognitionException {
        FanParser.field_return retval = new FanParser.field_return();
        retval.start = input.LT(1);
        int field_StartIndex = input.index();
        Object root_0 = null;

        Token AT441=null;
        Token ID442=null;

        Object AT441_tree=null;
        Object ID442_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:8: ( AT ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:406:10: AT ID
            {
            root_0 = (Object)adaptor.nil();

            AT441=(Token)match(input,AT,FOLLOW_AT_in_field2928); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT441_tree = (Object)adaptor.create(AT441);
            adaptor.addChild(root_0, AT441_tree);
            }
            ID442=(Token)match(input,ID,FOLLOW_ID_in_field2930); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID442_tree = (Object)adaptor.create(ID442);
            adaptor.addChild(root_0, ID442_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 119, field_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "field"

    public static class call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // src/net/colar/netbeans/fan/antlr/Fan.g:408:1: call : id ( ( callParams closure ) | callParams | closure ) ;
    public final FanParser.call_return call() throws RecognitionException {
        FanParser.call_return retval = new FanParser.call_return();
        retval.start = input.LT(1);
        int call_StartIndex = input.index();
        Object root_0 = null;

        FanParser.id_return id443 = null;

        FanParser.callParams_return callParams444 = null;

        FanParser.closure_return closure445 = null;

        FanParser.callParams_return callParams446 = null;

        FanParser.closure_return closure447 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:7: ( id ( ( callParams closure ) | callParams | closure ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:9: id ( ( callParams closure ) | callParams | closure )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_call2940);
            id443=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id443.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:12: ( ( callParams closure ) | callParams | closure )
            int alt128=3;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==PAR_L) ) {
                int LA128_1 = input.LA(2);

                if ( ((synpred204_Fan()&&(notAfterEol()))) ) {
                    alt128=1;
                }
                else if ( ((synpred205_Fan()&&(notAfterEol()))) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:408:13: ( callParams closure )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:408:13: ( callParams closure )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:408:14: callParams closure
                    {
                    pushFollow(FOLLOW_callParams_in_call2944);
                    callParams444=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callParams444.getTree());
                    pushFollow(FOLLOW_closure_in_call2946);
                    closure445=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure445.getTree());

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:408:36: callParams
                    {
                    pushFollow(FOLLOW_callParams_in_call2951);
                    callParams446=callParams();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callParams446.getTree());

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:408:49: closure
                    {
                    pushFollow(FOLLOW_closure_in_call2955);
                    closure447=closure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, closure447.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 120, call_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class callParams_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callParams"
    // src/net/colar/netbeans/fan/antlr/Fan.g:410:1: callParams : {...}? parL ( args )? parR ;
    public final FanParser.callParams_return callParams() throws RecognitionException {
        FanParser.callParams_return retval = new FanParser.callParams_return();
        retval.start = input.LT(1);
        int callParams_StartIndex = input.index();
        Object root_0 = null;

        FanParser.parL_return parL448 = null;

        FanParser.args_return args449 = null;

        FanParser.parR_return parR450 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:12: ({...}? parL ( args )? parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:14: {...}? parL ( args )? parR
            {
            root_0 = (Object)adaptor.nil();

            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "callParams", "notAfterEol()");
            }
            pushFollow(FOLLOW_parL_in_callParams2966);
            parL448=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL448.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:36: ( args )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( ((LA129_0>=KW_THIS && LA129_0<=KW_SUPER)||(LA129_0>=KW_NULL && LA129_0<=KW_FALSE)||LA129_0==SP_PIPE||LA129_0==OP_CURRY||(LA129_0>=OP_PLUS && LA129_0<=OP_MINUS)||(LA129_0>=OP_BANG && LA129_0<=OP_TILDA)||(LA129_0>=AT && LA129_0<=OP_POUND)||LA129_0==NUMBER||LA129_0==SQ_BRACKET_L||LA129_0==PAR_L) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_callParams2968);
                    args449=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args449.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_parR_in_callParams2971);
            parR450=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR450.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 121, callParams_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "callParams"

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // src/net/colar/netbeans/fan/antlr/Fan.g:411:1: args : expr ( SP_COMMA expr )* ;
    public final FanParser.args_return args() throws RecognitionException {
        FanParser.args_return retval = new FanParser.args_return();
        retval.start = input.LT(1);
        int args_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA452=null;
        FanParser.expr_return expr451 = null;

        FanParser.expr_return expr453 = null;


        Object SP_COMMA452_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:411:8: ( expr ( SP_COMMA expr )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:411:10: expr ( SP_COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_args2980);
            expr451=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr451.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:411:15: ( SP_COMMA expr )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==SP_COMMA) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:411:16: SP_COMMA expr
            	    {
            	    SP_COMMA452=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_args2983); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    SP_COMMA452_tree = (Object)adaptor.create(SP_COMMA452);
            	    adaptor.addChild(root_0, SP_COMMA452_tree);
            	    }
            	    pushFollow(FOLLOW_expr_in_args2986);
            	    expr453=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr453.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 122, args_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // src/net/colar/netbeans/fan/antlr/Fan.g:413:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple );
    public final FanParser.literal_return literal() throws RecognitionException {
        FanParser.literal_return retval = new FanParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        Object root_0 = null;

        Token KW_NULL454=null;
        Token KW_THIS455=null;
        Token KW_SUPER456=null;
        Token KW_IT457=null;
        Token KW_TRUE458=null;
        Token KW_FALSE459=null;
        Token QUOTSTR460=null;
        Token STR461=null;
        Token URI462=null;
        Token CHAR464=null;
        FanParser.number_return number463 = null;

        FanParser.namedSuper_return namedSuper465 = null;

        FanParser.slotLiteral_return slotLiteral466 = null;

        FanParser.typeLiteral_return typeLiteral467 = null;

        FanParser.list_return list468 = null;

        FanParser.map_return map469 = null;

        FanParser.simple_return simple470 = null;


        Object KW_NULL454_tree=null;
        Object KW_THIS455_tree=null;
        Object KW_SUPER456_tree=null;
        Object KW_IT457_tree=null;
        Object KW_TRUE458_tree=null;
        Object KW_FALSE459_tree=null;
        Object QUOTSTR460_tree=null;
        Object STR461_tree=null;
        Object URI462_tree=null;
        Object CHAR464_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:10: ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple )
            int alt131=17;
            alt131 = dfa131.predict(input);
            switch (alt131) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:12: KW_NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_NULL454=(Token)match(input,KW_NULL,FOLLOW_KW_NULL_in_literal2997); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_NULL454_tree = (Object)adaptor.create(KW_NULL454);
                    adaptor.addChild(root_0, KW_NULL454_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:22: KW_THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_THIS455=(Token)match(input,KW_THIS,FOLLOW_KW_THIS_in_literal3001); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_THIS455_tree = (Object)adaptor.create(KW_THIS455);
                    adaptor.addChild(root_0, KW_THIS455_tree);
                    }

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:32: KW_SUPER
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_SUPER456=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_literal3005); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_SUPER456_tree = (Object)adaptor.create(KW_SUPER456);
                    adaptor.addChild(root_0, KW_SUPER456_tree);
                    }

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:43: KW_IT
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_IT457=(Token)match(input,KW_IT,FOLLOW_KW_IT_in_literal3009); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_IT457_tree = (Object)adaptor.create(KW_IT457);
                    adaptor.addChild(root_0, KW_IT457_tree);
                    }

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:51: KW_TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_TRUE458=(Token)match(input,KW_TRUE,FOLLOW_KW_TRUE_in_literal3013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_TRUE458_tree = (Object)adaptor.create(KW_TRUE458);
                    adaptor.addChild(root_0, KW_TRUE458_tree);
                    }

                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:61: KW_FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    KW_FALSE459=(Token)match(input,KW_FALSE,FOLLOW_KW_FALSE_in_literal3017); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FALSE459_tree = (Object)adaptor.create(KW_FALSE459);
                    adaptor.addChild(root_0, KW_FALSE459_tree);
                    }

                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:72: QUOTSTR
                    {
                    root_0 = (Object)adaptor.nil();

                    QUOTSTR460=(Token)match(input,QUOTSTR,FOLLOW_QUOTSTR_in_literal3021); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUOTSTR460_tree = (Object)adaptor.create(QUOTSTR460);
                    adaptor.addChild(root_0, QUOTSTR460_tree);
                    }

                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:82: STR
                    {
                    root_0 = (Object)adaptor.nil();

                    STR461=(Token)match(input,STR,FOLLOW_STR_in_literal3025); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STR461_tree = (Object)adaptor.create(STR461);
                    adaptor.addChild(root_0, STR461_tree);
                    }

                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:88: URI
                    {
                    root_0 = (Object)adaptor.nil();

                    URI462=(Token)match(input,URI,FOLLOW_URI_in_literal3029); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    URI462_tree = (Object)adaptor.create(URI462);
                    adaptor.addChild(root_0, URI462_tree);
                    }

                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:4: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_literal3036);
                    number463=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number463.getTree());

                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:13: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR464=(Token)match(input,CHAR,FOLLOW_CHAR_in_literal3040); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR464_tree = (Object)adaptor.create(CHAR464);
                    adaptor.addChild(root_0, CHAR464_tree);
                    }

                    }
                    break;
                case 12 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:20: namedSuper
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedSuper_in_literal3044);
                    namedSuper465=namedSuper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedSuper465.getTree());

                    }
                    break;
                case 13 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:415:4: slotLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_slotLiteral_in_literal3051);
                    slotLiteral466=slotLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slotLiteral466.getTree());

                    }
                    break;
                case 14 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:415:18: typeLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeLiteral_in_literal3055);
                    typeLiteral467=typeLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeLiteral467.getTree());

                    }
                    break;
                case 15 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:415:32: list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_in_literal3059);
                    list468=list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list468.getTree());

                    }
                    break;
                case 16 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:415:39: map
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_map_in_literal3063);
                    map469=map();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map469.getTree());

                    }
                    break;
                case 17 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:415:45: simple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simple_in_literal3067);
                    simple470=simple();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple470.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 123, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class typeLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:416:1: typeLiteral : type {...}? OP_POUND ;
    public final FanParser.typeLiteral_return typeLiteral() throws RecognitionException {
        FanParser.typeLiteral_return retval = new FanParser.typeLiteral_return();
        retval.start = input.LT(1);
        int typeLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND472=null;
        FanParser.type_return type471 = null;


        Object OP_POUND472_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:13: ( type {...}? OP_POUND )
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:17: type {...}? OP_POUND
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_typeLiteral3076);
            type471=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type471.getTree());
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "typeLiteral", "notAfterEol()");
            }
            OP_POUND472=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_typeLiteral3080); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_POUND472_tree = (Object)adaptor.create(OP_POUND472);
            adaptor.addChild(root_0, OP_POUND472_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 124, typeLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeLiteral"

    public static class slotLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slotLiteral"
    // src/net/colar/netbeans/fan/antlr/Fan.g:417:1: slotLiteral : ( type )? OP_POUND {...}? id ;
    public final FanParser.slotLiteral_return slotLiteral() throws RecognitionException {
        FanParser.slotLiteral_return retval = new FanParser.slotLiteral_return();
        retval.start = input.LT(1);
        int slotLiteral_StartIndex = input.index();
        Object root_0 = null;

        Token OP_POUND474=null;
        FanParser.type_return type473 = null;

        FanParser.id_return id475 = null;


        Object OP_POUND474_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:13: ( ( type )? OP_POUND {...}? id )
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:17: ( type )? OP_POUND {...}? id
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:417:17: ( type )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==SP_PIPE||LA132_0==ID||LA132_0==SQ_BRACKET_L) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_slotLiteral3089);
                    type473=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type473.getTree());

                    }
                    break;

            }

            OP_POUND474=(Token)match(input,OP_POUND,FOLLOW_OP_POUND_in_slotLiteral3092); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OP_POUND474_tree = (Object)adaptor.create(OP_POUND474);
            adaptor.addChild(root_0, OP_POUND474_tree);
            }
            if ( !((notAfterEol())) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "slotLiteral", "notAfterEol()");
            }
            pushFollow(FOLLOW_id_in_slotLiteral3096);
            id475=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id475.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 125, slotLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "slotLiteral"

    public static class namedSuper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namedSuper"
    // src/net/colar/netbeans/fan/antlr/Fan.g:418:1: namedSuper : simpleType DOT KW_SUPER ;
    public final FanParser.namedSuper_return namedSuper() throws RecognitionException {
        FanParser.namedSuper_return retval = new FanParser.namedSuper_return();
        retval.start = input.LT(1);
        int namedSuper_StartIndex = input.index();
        Object root_0 = null;

        Token DOT477=null;
        Token KW_SUPER478=null;
        FanParser.simpleType_return simpleType476 = null;


        Object DOT477_tree=null;
        Object KW_SUPER478_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:13: ( simpleType DOT KW_SUPER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:15: simpleType DOT KW_SUPER
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleType_in_namedSuper3104);
            simpleType476=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType476.getTree());
            DOT477=(Token)match(input,DOT,FOLLOW_DOT_in_namedSuper3106); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT477_tree = (Object)adaptor.create(DOT477);
            adaptor.addChild(root_0, DOT477_tree);
            }
            KW_SUPER478=(Token)match(input,KW_SUPER,FOLLOW_KW_SUPER_in_namedSuper3108); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            KW_SUPER478_tree = (Object)adaptor.create(KW_SUPER478);
            adaptor.addChild(root_0, KW_SUPER478_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 126, namedSuper_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "namedSuper"

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // src/net/colar/netbeans/fan/antlr/Fan.g:419:1: list : ( type {...}?)? sq_bracketL listItems sq_bracketR ;
    public final FanParser.list_return list() throws RecognitionException {
        FanParser.list_return retval = new FanParser.list_return();
        retval.start = input.LT(1);
        int list_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type479 = null;

        FanParser.sq_bracketL_return sq_bracketL480 = null;

        FanParser.listItems_return listItems481 = null;

        FanParser.sq_bracketR_return sq_bracketR482 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:419:8: ( ( type {...}?)? sq_bracketL listItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:419:10: ( type {...}?)? sq_bracketL listItems sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:419:10: ( type {...}?)?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==SQ_BRACKET_L) ) {
                int LA133_1 = input.LA(2);

                if ( (synpred225_Fan()) ) {
                    alt133=1;
                }
            }
            else if ( (LA133_0==SP_PIPE||LA133_0==ID) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:419:11: type {...}?
                    {
                    pushFollow(FOLLOW_type_in_list3118);
                    type479=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type479.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "list", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_list3124);
            sq_bracketL480=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL480.getTree());
            pushFollow(FOLLOW_listItems_in_list3126);
            listItems481=listItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, listItems481.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_list3128);
            sq_bracketR482=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR482.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 127, list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class listItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:420:1: listItems : ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA );
    public final FanParser.listItems_return listItems() throws RecognitionException {
        FanParser.listItems_return retval = new FanParser.listItems_return();
        retval.start = input.LT(1);
        int listItems_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA484=null;
        Token SP_COMMA486=null;
        Token SP_COMMA487=null;
        FanParser.expr_return expr483 = null;

        FanParser.expr_return expr485 = null;


        Object SP_COMMA484_tree=null;
        Object SP_COMMA486_tree=null;
        Object SP_COMMA487_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:12: ( ( expr ( SP_COMMA expr )* ( SP_COMMA )? ) | SP_COMMA )
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( ((LA136_0>=KW_THIS && LA136_0<=KW_SUPER)||(LA136_0>=KW_NULL && LA136_0<=KW_FALSE)||LA136_0==SP_PIPE||LA136_0==OP_CURRY||(LA136_0>=OP_PLUS && LA136_0<=OP_MINUS)||(LA136_0>=OP_BANG && LA136_0<=OP_TILDA)||(LA136_0>=AT && LA136_0<=OP_POUND)||LA136_0==NUMBER||LA136_0==SQ_BRACKET_L||LA136_0==PAR_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:14: ( expr ( SP_COMMA expr )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:15: expr ( SP_COMMA expr )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_expr_in_listItems3137);
                    expr483=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr483.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:20: ( SP_COMMA expr )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==SP_COMMA) ) {
                            int LA134_1 = input.LA(2);

                            if ( ((LA134_1>=KW_THIS && LA134_1<=KW_SUPER)||(LA134_1>=KW_NULL && LA134_1<=KW_FALSE)||LA134_1==SP_PIPE||LA134_1==OP_CURRY||(LA134_1>=OP_PLUS && LA134_1<=OP_MINUS)||(LA134_1>=OP_BANG && LA134_1<=OP_TILDA)||(LA134_1>=AT && LA134_1<=OP_POUND)||LA134_1==NUMBER||LA134_1==SQ_BRACKET_L||LA134_1==PAR_L) ) {
                                alt134=1;
                            }


                        }


                        switch (alt134) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:420:21: SP_COMMA expr
                    	    {
                    	    SP_COMMA484=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3140); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA484_tree = (Object)adaptor.create(SP_COMMA484);
                    	    adaptor.addChild(root_0, SP_COMMA484_tree);
                    	    }
                    	    pushFollow(FOLLOW_expr_in_listItems3142);
                    	    expr485=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr485.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:38: ( SP_COMMA )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==SP_COMMA) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA486=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3147); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SP_COMMA486_tree = (Object)adaptor.create(SP_COMMA486);
                            adaptor.addChild(root_0, SP_COMMA486_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:51: SP_COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COMMA487=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_listItems3153); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COMMA487_tree = (Object)adaptor.create(SP_COMMA487);
                    adaptor.addChild(root_0, SP_COMMA487_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 128, listItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listItems"

    public static class map_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "map"
    // src/net/colar/netbeans/fan/antlr/Fan.g:421:1: map : ( mapType {...}?)? sq_bracketL mapItems sq_bracketR ;
    public final FanParser.map_return map() throws RecognitionException {
        FanParser.map_return retval = new FanParser.map_return();
        retval.start = input.LT(1);
        int map_StartIndex = input.index();
        Object root_0 = null;

        FanParser.mapType_return mapType488 = null;

        FanParser.sq_bracketL_return sq_bracketL489 = null;

        FanParser.mapItems_return mapItems490 = null;

        FanParser.sq_bracketR_return sq_bracketR491 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:7: ( ( mapType {...}?)? sq_bracketL mapItems sq_bracketR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:9: ( mapType {...}?)? sq_bracketL mapItems sq_bracketR
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:421:9: ( mapType {...}?)?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==SQ_BRACKET_L) ) {
                int LA137_1 = input.LA(2);

                if ( (synpred229_Fan()) ) {
                    alt137=1;
                }
            }
            else if ( (LA137_0==SP_PIPE||LA137_0==ID) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:421:10: mapType {...}?
                    {
                    pushFollow(FOLLOW_mapType_in_map3163);
                    mapType488=mapType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapType488.getTree());
                    if ( !((notAfterEol())) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "map", "notAfterEol()");
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_sq_bracketL_in_map3169);
            sq_bracketL489=sq_bracketL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketL489.getTree());
            pushFollow(FOLLOW_mapItems_in_map3171);
            mapItems490=mapItems();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mapItems490.getTree());
            pushFollow(FOLLOW_sq_bracketR_in_map3173);
            sq_bracketR491=sq_bracketR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sq_bracketR491.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 129, map_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "map"

    public static class mapItems_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapItems"
    // src/net/colar/netbeans/fan/antlr/Fan.g:422:1: mapItems : ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON );
    public final FanParser.mapItems_return mapItems() throws RecognitionException {
        FanParser.mapItems_return retval = new FanParser.mapItems_return();
        retval.start = input.LT(1);
        int mapItems_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COMMA493=null;
        Token SP_COMMA495=null;
        Token SP_COLON496=null;
        FanParser.mapPair_return mapPair492 = null;

        FanParser.mapPair_return mapPair494 = null;


        Object SP_COMMA493_tree=null;
        Object SP_COMMA495_tree=null;
        Object SP_COLON496_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:11: ( ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? ) | SP_COLON )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( ((LA140_0>=KW_THIS && LA140_0<=KW_SUPER)||(LA140_0>=KW_NULL && LA140_0<=KW_FALSE)||LA140_0==SP_PIPE||LA140_0==OP_CURRY||(LA140_0>=OP_PLUS && LA140_0<=OP_MINUS)||(LA140_0>=OP_BANG && LA140_0<=OP_TILDA)||(LA140_0>=AT && LA140_0<=OP_POUND)||LA140_0==NUMBER||LA140_0==SQ_BRACKET_L||LA140_0==PAR_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    {
                    root_0 = (Object)adaptor.nil();

                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:13: ( mapPair ( SP_COMMA mapPair )* ( SP_COMMA )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:14: mapPair ( SP_COMMA mapPair )* ( SP_COMMA )?
                    {
                    pushFollow(FOLLOW_mapPair_in_mapItems3182);
                    mapPair492=mapPair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair492.getTree());
                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:22: ( SP_COMMA mapPair )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==SP_COMMA) ) {
                            int LA138_1 = input.LA(2);

                            if ( ((LA138_1>=KW_THIS && LA138_1<=KW_SUPER)||(LA138_1>=KW_NULL && LA138_1<=KW_FALSE)||LA138_1==SP_PIPE||LA138_1==OP_CURRY||(LA138_1>=OP_PLUS && LA138_1<=OP_MINUS)||(LA138_1>=OP_BANG && LA138_1<=OP_TILDA)||(LA138_1>=AT && LA138_1<=OP_POUND)||LA138_1==NUMBER||LA138_1==SQ_BRACKET_L||LA138_1==PAR_L) ) {
                                alt138=1;
                            }


                        }


                        switch (alt138) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:422:23: SP_COMMA mapPair
                    	    {
                    	    SP_COMMA493=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems3185); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    SP_COMMA493_tree = (Object)adaptor.create(SP_COMMA493);
                    	    adaptor.addChild(root_0, SP_COMMA493_tree);
                    	    }
                    	    pushFollow(FOLLOW_mapPair_in_mapItems3187);
                    	    mapPair494=mapPair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mapPair494.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);

                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:42: ( SP_COMMA )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==SP_COMMA) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_COMMA
                            {
                            SP_COMMA495=(Token)match(input,SP_COMMA,FOLLOW_SP_COMMA_in_mapItems3191); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SP_COMMA495_tree = (Object)adaptor.create(SP_COMMA495);
                            adaptor.addChild(root_0, SP_COMMA495_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:55: SP_COLON
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_COLON496=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapItems3197); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_COLON496_tree = (Object)adaptor.create(SP_COLON496);
                    adaptor.addChild(root_0, SP_COLON496_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 130, mapItems_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapItems"

    public static class mapPair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapPair"
    // src/net/colar/netbeans/fan/antlr/Fan.g:423:1: mapPair : expr SP_COLON expr ;
    public final FanParser.mapPair_return mapPair() throws RecognitionException {
        FanParser.mapPair_return retval = new FanParser.mapPair_return();
        retval.start = input.LT(1);
        int mapPair_StartIndex = input.index();
        Object root_0 = null;

        Token SP_COLON498=null;
        FanParser.expr_return expr497 = null;

        FanParser.expr_return expr499 = null;


        Object SP_COLON498_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:10: ( expr SP_COLON expr )
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:12: expr SP_COLON expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_mapPair3205);
            expr497=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr497.getTree());
            SP_COLON498=(Token)match(input,SP_COLON,FOLLOW_SP_COLON_in_mapPair3207); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SP_COLON498_tree = (Object)adaptor.create(SP_COLON498);
            adaptor.addChild(root_0, SP_COLON498_tree);
            }
            pushFollow(FOLLOW_expr_in_mapPair3209);
            expr499=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr499.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 131, mapPair_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mapPair"

    public static class simple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple"
    // src/net/colar/netbeans/fan/antlr/Fan.g:424:1: simple : type parL expr parR ;
    public final FanParser.simple_return simple() throws RecognitionException {
        FanParser.simple_return retval = new FanParser.simple_return();
        retval.start = input.LT(1);
        int simple_StartIndex = input.index();
        Object root_0 = null;

        FanParser.type_return type500 = null;

        FanParser.parL_return parL501 = null;

        FanParser.expr_return expr502 = null;

        FanParser.parR_return parR503 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:424:9: ( type parL expr parR )
            // src/net/colar/netbeans/fan/antlr/Fan.g:424:11: type parL expr parR
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_simple3217);
            type500=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type500.getTree());
            pushFollow(FOLLOW_parL_in_simple3219);
            parL501=parL();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parL501.getTree());
            pushFollow(FOLLOW_expr_in_simple3221);
            expr502=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr502.getTree());
            pushFollow(FOLLOW_parR_in_simple3223);
            parR503=parR();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parR503.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 132, simple_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simple"

    public static class docs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "docs"
    // src/net/colar/netbeans/fan/antlr/Fan.g:426:1: docs : ( DOC )* ;
    public final FanParser.docs_return docs() throws RecognitionException {
        FanParser.docs_return retval = new FanParser.docs_return();
        retval.start = input.LT(1);
        int docs_StartIndex = input.index();
        Object root_0 = null;

        Token DOC504=null;

        Object DOC504_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:426:7: ( ( DOC )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:426:9: ( DOC )*
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:426:9: ( DOC )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==DOC) ) {
                    int LA141_2 = input.LA(2);

                    if ( (synpred233_Fan()) ) {
                        alt141=1;
                    }


                }


                switch (alt141) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: DOC
            	    {
            	    DOC504=(Token)match(input,DOC,FOLLOW_DOC_in_docs3232); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOC504_tree = (Object)adaptor.create(DOC504);
            	    adaptor.addChild(root_0, DOC504_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop141;
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
            if ( state.backtracking>0 ) { memoize(input, 133, docs_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "docs"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // src/net/colar/netbeans/fan/antlr/Fan.g:428:1: number : ( OP_MINUS )? NUMBER ;
    public final FanParser.number_return number() throws RecognitionException {
        FanParser.number_return retval = new FanParser.number_return();
        retval.start = input.LT(1);
        int number_StartIndex = input.index();
        Object root_0 = null;

        Token OP_MINUS505=null;
        Token NUMBER506=null;

        Object OP_MINUS505_tree=null;
        Object NUMBER506_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:428:9: ( ( OP_MINUS )? NUMBER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:428:12: ( OP_MINUS )? NUMBER
            {
            root_0 = (Object)adaptor.nil();

            // src/net/colar/netbeans/fan/antlr/Fan.g:428:12: ( OP_MINUS )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==OP_MINUS) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: OP_MINUS
                    {
                    OP_MINUS505=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_number3243); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_MINUS505_tree = (Object)adaptor.create(OP_MINUS505);
                    adaptor.addChild(root_0, OP_MINUS505_tree);
                    }

                    }
                    break;

            }

            NUMBER506=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_number3246); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER506_tree = (Object)adaptor.create(NUMBER506);
            adaptor.addChild(root_0, NUMBER506_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 134, number_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class facet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "facet"
    // src/net/colar/netbeans/fan/antlr/Fan.g:429:1: facet : AT id ( AS_EQUAL expr )? ;
    public final FanParser.facet_return facet() throws RecognitionException {
        FanParser.facet_return retval = new FanParser.facet_return();
        retval.start = input.LT(1);
        int facet_StartIndex = input.index();
        Object root_0 = null;

        Token AT507=null;
        Token AS_EQUAL509=null;
        FanParser.id_return id508 = null;

        FanParser.expr_return expr510 = null;


        Object AT507_tree=null;
        Object AS_EQUAL509_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:8: ( AT id ( AS_EQUAL expr )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:10: AT id ( AS_EQUAL expr )?
            {
            root_0 = (Object)adaptor.nil();

            AT507=(Token)match(input,AT,FOLLOW_AT_in_facet3254); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT507_tree = (Object)adaptor.create(AT507);
            adaptor.addChild(root_0, AT507_tree);
            }
            pushFollow(FOLLOW_id_in_facet3256);
            id508=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id508.getTree());
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:16: ( AS_EQUAL expr )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==AS_EQUAL) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:17: AS_EQUAL expr
                    {
                    AS_EQUAL509=(Token)match(input,AS_EQUAL,FOLLOW_AS_EQUAL_in_facet3259); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AS_EQUAL509_tree = (Object)adaptor.create(AS_EQUAL509);
                    adaptor.addChild(root_0, AS_EQUAL509_tree);
                    }
                    pushFollow(FOLLOW_expr_in_facet3261);
                    expr510=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr510.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 135, facet_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "facet"

    public static class eos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eos"
    // src/net/colar/netbeans/fan/antlr/Fan.g:432:1: eos : ( SP_SEMI | {...}?);
    public final FanParser.eos_return eos() throws RecognitionException {
        FanParser.eos_return retval = new FanParser.eos_return();
        retval.start = input.LT(1);
        int eos_StartIndex = input.index();
        Object root_0 = null;

        Token SP_SEMI511=null;

        Object SP_SEMI511_tree=null;

        paraphrase.push("Semicolumn or LineBreak");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:3: ( SP_SEMI | {...}?)
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==SP_SEMI) ) {
                int LA144_1 = input.LA(2);

                if ( (synpred236_Fan()) ) {
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
            else if ( (LA144_0==EOF||(LA144_0>=KW_BREAK && LA144_0<=KW_USING)||(LA144_0>=KW_RD_ONLY && LA144_0<=KW_FINAL)||(LA144_0>=KW_CLASS && LA144_0<=KW_ELSE)||(LA144_0>=KW_NULL && LA144_0<=KW_FALSE)||LA144_0==SP_COMMA||LA144_0==SP_PIPE||LA144_0==OP_CURRY||(LA144_0>=OP_PLUS && LA144_0<=OP_MINUS)||(LA144_0>=OP_BANG && LA144_0<=OP_TILDA)||(LA144_0>=AT && LA144_0<=NUMBER)||(LA144_0>=BRACKET_R && LA144_0<=SQ_BRACKET_L)||LA144_0==PAR_L) ) {
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:434:5: SP_SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SP_SEMI511=(Token)match(input,SP_SEMI,FOLLOW_SP_SEMI_in_eos3283); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SP_SEMI511_tree = (Object)adaptor.create(SP_SEMI511);
                    adaptor.addChild(root_0, SP_SEMI511_tree);
                    }

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:434:15: {...}?
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
            if ( state.backtracking>0 ) { memoize(input, 136, eos_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "eos"

    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // src/net/colar/netbeans/fan/antlr/Fan.g:436:1: id : ID ;
    public final FanParser.id_return id() throws RecognitionException {
        FanParser.id_return retval = new FanParser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token ID512=null;

        Object ID512_tree=null;

        paraphrase.push("Identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:438:3: ( ID )
            // src/net/colar/netbeans/fan/antlr/Fan.g:438:6: ID
            {
            root_0 = (Object)adaptor.nil();

            ID512=(Token)match(input,ID,FOLLOW_ID_in_id3307); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID512_tree = (Object)adaptor.create(ID512);
            adaptor.addChild(root_0, ID512_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 137, id_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "id"

    public static class getter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:444:1: getter : t= ID {...}?;
    public final FanParser.getter_return getter() throws RecognitionException {
        FanParser.getter_return retval = new FanParser.getter_return();
        retval.start = input.LT(1);
        int getter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_getter3320); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 138, getter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "getter"

    public static class setter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setter"
    // src/net/colar/netbeans/fan/antlr/Fan.g:445:1: setter : t= ID {...}?;
    public final FanParser.setter_return setter() throws RecognitionException {
        FanParser.setter_return retval = new FanParser.setter_return();
        retval.start = input.LT(1);
        int setter_StartIndex = input.index();
        Object root_0 = null;

        Token t=null;

        Object t_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:445:10: (t= ID {...}?)
            // src/net/colar/netbeans/fan/antlr/Fan.g:445:12: t= ID {...}?
            {
            root_0 = (Object)adaptor.nil();

            t=(Token)match(input,ID,FOLLOW_ID_in_setter3333); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 139, setter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "setter"

    public static class bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:448:1: bracketL : BRACKET_L ;
    public final FanParser.bracketL_return bracketL() throws RecognitionException {
        FanParser.bracketL_return retval = new FanParser.bracketL_return();
        retval.start = input.LT(1);
        int bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_L513=null;

        Object BRACKET_L513_tree=null;

        paraphrase.push("{");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:3: ( BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:5: BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_L513=(Token)match(input,BRACKET_L,FOLLOW_BRACKET_L_in_bracketL3355); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_L513_tree = (Object)adaptor.create(BRACKET_L513);
            adaptor.addChild(root_0, BRACKET_L513_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 140, bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketL"

    public static class bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:451:1: bracketR : BRACKET_R ;
    public final FanParser.bracketR_return bracketR() throws RecognitionException {
        FanParser.bracketR_return retval = new FanParser.bracketR_return();
        retval.start = input.LT(1);
        int bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token BRACKET_R514=null;

        Object BRACKET_R514_tree=null;

        paraphrase.push("}");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:453:3: ( BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:453:5: BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            BRACKET_R514=(Token)match(input,BRACKET_R,FOLLOW_BRACKET_R_in_bracketR3373); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BRACKET_R514_tree = (Object)adaptor.create(BRACKET_R514);
            adaptor.addChild(root_0, BRACKET_R514_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 141, bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketR"

    public static class sq_bracketL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:454:1: sq_bracketL : SQ_BRACKET_L ;
    public final FanParser.sq_bracketL_return sq_bracketL() throws RecognitionException {
        FanParser.sq_bracketL_return retval = new FanParser.sq_bracketL_return();
        retval.start = input.LT(1);
        int sq_bracketL_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_L515=null;

        Object SQ_BRACKET_L515_tree=null;

        paraphrase.push("[");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:456:3: ( SQ_BRACKET_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:456:5: SQ_BRACKET_L
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_L515=(Token)match(input,SQ_BRACKET_L,FOLLOW_SQ_BRACKET_L_in_sq_bracketL3391); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQ_BRACKET_L515_tree = (Object)adaptor.create(SQ_BRACKET_L515);
            adaptor.addChild(root_0, SQ_BRACKET_L515_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 142, sq_bracketL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketL"

    public static class sq_bracketR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sq_bracketR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:457:1: sq_bracketR : SQ_BRACKET_R ;
    public final FanParser.sq_bracketR_return sq_bracketR() throws RecognitionException {
        FanParser.sq_bracketR_return retval = new FanParser.sq_bracketR_return();
        retval.start = input.LT(1);
        int sq_bracketR_StartIndex = input.index();
        Object root_0 = null;

        Token SQ_BRACKET_R516=null;

        Object SQ_BRACKET_R516_tree=null;

        paraphrase.push("]");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:459:3: ( SQ_BRACKET_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:459:5: SQ_BRACKET_R
            {
            root_0 = (Object)adaptor.nil();

            SQ_BRACKET_R516=(Token)match(input,SQ_BRACKET_R,FOLLOW_SQ_BRACKET_R_in_sq_bracketR3409); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQ_BRACKET_R516_tree = (Object)adaptor.create(SQ_BRACKET_R516);
            adaptor.addChild(root_0, SQ_BRACKET_R516_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 143, sq_bracketR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sq_bracketR"

    public static class parL_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parL"
    // src/net/colar/netbeans/fan/antlr/Fan.g:460:1: parL : PAR_L ;
    public final FanParser.parL_return parL() throws RecognitionException {
        FanParser.parL_return retval = new FanParser.parL_return();
        retval.start = input.LT(1);
        int parL_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_L517=null;

        Object PAR_L517_tree=null;

        paraphrase.push("(");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:3: ( PAR_L )
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:5: PAR_L
            {
            root_0 = (Object)adaptor.nil();

            PAR_L517=(Token)match(input,PAR_L,FOLLOW_PAR_L_in_parL3427); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAR_L517_tree = (Object)adaptor.create(PAR_L517);
            adaptor.addChild(root_0, PAR_L517_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 144, parL_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parL"

    public static class parR_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parR"
    // src/net/colar/netbeans/fan/antlr/Fan.g:463:1: parR : PAR_R ;
    public final FanParser.parR_return parR() throws RecognitionException {
        FanParser.parR_return retval = new FanParser.parR_return();
        retval.start = input.LT(1);
        int parR_StartIndex = input.index();
        Object root_0 = null;

        Token PAR_R518=null;

        Object PAR_R518_tree=null;

        paraphrase.push(")");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return retval; }
            // src/net/colar/netbeans/fan/antlr/Fan.g:465:3: ( PAR_R )
            // src/net/colar/netbeans/fan/antlr/Fan.g:465:5: PAR_R
            {
            root_0 = (Object)adaptor.nil();

            PAR_R518=(Token)match(input,PAR_R,FOLLOW_PAR_R_in_parR3445); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PAR_R518_tree = (Object)adaptor.create(PAR_R518);
            adaptor.addChild(root_0, PAR_R518_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 145, parR_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parR"

    // $ANTLR start synpred7_Fan
    public final void synpred7_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:231:17: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:231:17: facet
        {
        pushFollow(FOLLOW_facet_in_synpred7_Fan514);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_Fan

    // $ANTLR start synpred9_Fan
    public final void synpred9_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:231:25: ( ( classFlags )* KW_CLASS )
        // src/net/colar/netbeans/fan/antlr/Fan.g:231:26: ( classFlags )* KW_CLASS
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:231:26: ( classFlags )*
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
        	    pushFollow(FOLLOW_classFlags_in_synpred9_Fan519);
        	    classFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop145;
            }
        } while (true);

        match(input,KW_CLASS,FOLLOW_KW_CLASS_in_synpred9_Fan522); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Fan

    // $ANTLR start synpred11_Fan
    public final void synpred11_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:232:4: ( ( protection )? KW_ENUM )
        // src/net/colar/netbeans/fan/antlr/Fan.g:232:5: ( protection )? KW_ENUM
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:232:5: ( protection )?
        int alt146=2;
        int LA146_0 = input.LA(1);

        if ( ((LA146_0>=KW_PRIVATE && LA146_0<=KW_INTERNAL)) ) {
            alt146=1;
        }
        switch (alt146) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: protection
                {
                pushFollow(FOLLOW_protection_in_synpred11_Fan533);
                protection();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,KW_ENUM,FOLLOW_KW_ENUM_in_synpred11_Fan536); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_Fan

    // $ANTLR start synpred38_Fan
    public final void synpred38_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:256:28: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:256:28: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred38_Fan907); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_Fan

    // $ANTLR start synpred39_Fan
    public final void synpred39_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:256:49: ( SP_QMARK )
        // src/net/colar/netbeans/fan/antlr/Fan.g:256:49: SP_QMARK
        {
        match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred39_Fan913); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_Fan

    // $ANTLR start synpred40_Fan
    public final void synpred40_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:256:39: ( LIST_TYPE ( SP_QMARK )? )
        // src/net/colar/netbeans/fan/antlr/Fan.g:256:39: LIST_TYPE ( SP_QMARK )?
        {
        match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_synpred40_Fan911); if (state.failed) return ;
        // src/net/colar/netbeans/fan/antlr/Fan.g:256:49: ( SP_QMARK )?
        int alt148=2;
        int LA148_0 = input.LA(1);

        if ( (LA148_0==SP_QMARK) ) {
            alt148=1;
        }
        switch (alt148) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:0:0: SP_QMARK
                {
                match(input,SP_QMARK,FOLLOW_SP_QMARK_in_synpred40_Fan913); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred40_Fan

    // $ANTLR start synpred42_Fan
    public final void synpred42_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:258:12: ( mapType )
        // src/net/colar/netbeans/fan/antlr/Fan.g:258:12: mapType
        {
        pushFollow(FOLLOW_mapType_in_synpred42_Fan935);
        mapType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_Fan

    // $ANTLR start synpred48_Fan
    public final void synpred48_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:262:6: ({...}? SP_COLON {...}? type )
        // src/net/colar/netbeans/fan/antlr/Fan.g:262:6: {...}? SP_COLON {...}? type
        {
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_Fan", "notAfterEol()");
        }
        match(input,SP_COLON,FOLLOW_SP_COLON_in_synpred48_Fan992); if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred48_Fan", "notAfterEol()");
        }
        pushFollow(FOLLOW_type_in_synpred48_Fan996);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_Fan

    // $ANTLR start synpred49_Fan
    public final void synpred49_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:262:56: ( sq_bracketR )
        // src/net/colar/netbeans/fan/antlr/Fan.g:262:56: sq_bracketR
        {
        pushFollow(FOLLOW_sq_bracketR_in_synpred49_Fan1000);
        sq_bracketR();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_Fan

    // $ANTLR start synpred51_Fan
    public final void synpred51_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:263:43: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:263:44: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred51_Fan1021); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_Fan

    // $ANTLR start synpred53_Fan
    public final void synpred53_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:263:74: ( OP_ARROW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:263:75: OP_ARROW
        {
        match(input,OP_ARROW,FOLLOW_OP_ARROW_in_synpred53_Fan1033); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_Fan

    // $ANTLR start synpred55_Fan
    public final void synpred55_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:266:11: ( formalFull )
        // src/net/colar/netbeans/fan/antlr/Fan.g:266:11: formalFull
        {
        pushFollow(FOLLOW_formalFull_in_synpred55_Fan1074);
        formalFull();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_Fan

    // $ANTLR start synpred56_Fan
    public final void synpred56_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:266:24: ( formalTypeOnly )
        // src/net/colar/netbeans/fan/antlr/Fan.g:266:24: formalTypeOnly
        {
        pushFollow(FOLLOW_formalTypeOnly_in_synpred56_Fan1078);
        formalTypeOnly();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_Fan

    // $ANTLR start synpred57_Fan
    public final void synpred57_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:270:13: ( KW_STATIC bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:270:14: KW_STATIC bracketL
        {
        match(input,KW_STATIC,FOLLOW_KW_STATIC_in_synpred57_Fan1126); if (state.failed) return ;
        pushFollow(FOLLOW_bracketL_in_synpred57_Fan1128);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_Fan

    // $ANTLR start synpred58_Fan
    public final void synpred58_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:271:11: ( facet )
        // src/net/colar/netbeans/fan/antlr/Fan.g:271:11: facet
        {
        pushFollow(FOLLOW_facet_in_synpred58_Fan1142);
        facet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_Fan

    // $ANTLR start synpred60_Fan
    public final void synpred60_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:273:7: ( ( ctorFlags )* KW_NEW )
        // src/net/colar/netbeans/fan/antlr/Fan.g:273:8: ( ctorFlags )* KW_NEW
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:273:8: ( ctorFlags )*
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
        	    pushFollow(FOLLOW_ctorFlags_in_synpred60_Fan1159);
        	    ctorFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop151;
            }
        } while (true);

        match(input,KW_NEW,FOLLOW_KW_NEW_in_synpred60_Fan1162); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_Fan

    // $ANTLR start synpred63_Fan
    public final void synpred63_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:274:7: ( ( methodFlags )* ( type | KW_VOID ) id parL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:274:8: ( methodFlags )* ( type | KW_VOID ) id parL
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:274:8: ( methodFlags )*
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
        	    pushFollow(FOLLOW_methodFlags_in_synpred63_Fan1176);
        	    methodFlags();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop152;
            }
        } while (true);

        // src/net/colar/netbeans/fan/antlr/Fan.g:274:21: ( type | KW_VOID )
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
                // src/net/colar/netbeans/fan/antlr/Fan.g:274:22: type
                {
                pushFollow(FOLLOW_type_in_synpred63_Fan1180);
                type();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:274:29: KW_VOID
                {
                match(input,KW_VOID,FOLLOW_KW_VOID_in_synpred63_Fan1184); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_id_in_synpred63_Fan1187);
        id();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_parL_in_synpred63_Fan1189);
        parL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_Fan

    // $ANTLR start synpred67_Fan
    public final void synpred67_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:282:29: ( getter )
        // src/net/colar/netbeans/fan/antlr/Fan.g:282:29: getter
        {
        pushFollow(FOLLOW_getter_in_synpred67_Fan1272);
        getter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_Fan

    // $ANTLR start synpred69_Fan
    public final void synpred69_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:282:55: ( block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:282:55: block
        {
        pushFollow(FOLLOW_block_in_synpred69_Fan1282);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Fan

    // $ANTLR start synpred72_Fan
    public final void synpred72_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:285:12: ( type id )
        // src/net/colar/netbeans/fan/antlr/Fan.g:285:13: type id
        {
        pushFollow(FOLLOW_type_in_synpred72_Fan1308);
        type();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_id_in_synpred72_Fan1310);
        id();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_Fan

    // $ANTLR start synpred99_Fan
    public final void synpred99_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:297:56: ( SP_COLON )
        // src/net/colar/netbeans/fan/antlr/Fan.g:297:57: SP_COLON
        {
        match(input,SP_COLON,FOLLOW_SP_COLON_in_synpred99_Fan1587); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_Fan

    // $ANTLR start synpred104_Fan
    public final void synpred104_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:6: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:306:7: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred104_Fan1688);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_Fan

    // $ANTLR start synpred115_Fan
    public final void synpred115_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:312:22: ( exprStmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:312:22: exprStmt
        {
        pushFollow(FOLLOW_exprStmt_in_synpred115_Fan1770);
        exprStmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_Fan

    // $ANTLR start synpred119_Fan
    public final void synpred119_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:323:6: ( KW_ELSE block )
        // src/net/colar/netbeans/fan/antlr/Fan.g:323:6: KW_ELSE block
        {
        match(input,KW_ELSE,FOLLOW_KW_ELSE_in_synpred119_Fan1849); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred119_Fan1851);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_Fan

    // $ANTLR start synpred120_Fan
    public final void synpred120_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:324:23: ( eos )
        // src/net/colar/netbeans/fan/antlr/Fan.g:324:23: eos
        {
        pushFollow(FOLLOW_eos_in_synpred120_Fan1863);
        eos();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_Fan

    // $ANTLR start synpred123_Fan
    public final void synpred123_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:328:18: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:328:19: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred123_Fan1937);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred123_Fan

    // $ANTLR start synpred124_Fan
    public final void synpred124_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:328:41: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:328:41: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred124_Fan1944);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_Fan

    // $ANTLR start synpred125_Fan
    public final void synpred125_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:328:49: ( KW_CATCH )
        // src/net/colar/netbeans/fan/antlr/Fan.g:328:50: KW_CATCH
        {
        match(input,KW_CATCH,FOLLOW_KW_CATCH_in_synpred125_Fan1950); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_Fan

    // $ANTLR start synpred126_Fan
    public final void synpred126_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:328:72: ( KW_FINALLY )
        // src/net/colar/netbeans/fan/antlr/Fan.g:328:73: KW_FINALLY
        {
        match(input,KW_FINALLY,FOLLOW_KW_FINALLY_in_synpred126_Fan1959); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred126_Fan

    // $ANTLR start synpred129_Fan
    public final void synpred129_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:332:12: ( forInitDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:332:12: forInitDef
        {
        pushFollow(FOLLOW_forInitDef_in_synpred129_Fan2009);
        forInitDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred129_Fan

    // $ANTLR start synpred131_Fan
    public final void synpred131_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:21: ( catchDef )
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:21: catchDef
        {
        pushFollow(FOLLOW_catchDef_in_synpred131_Fan2038);
        catchDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred131_Fan

    // $ANTLR start synpred132_Fan
    public final void synpred132_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:32: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:33: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred132_Fan2043);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred132_Fan

    // $ANTLR start synpred133_Fan
    public final void synpred133_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:57: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:335:57: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred133_Fan2050);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_Fan

    // $ANTLR start synpred135_Fan
    public final void synpred135_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:339:25: ( bracketL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:339:26: bracketL
        {
        pushFollow(FOLLOW_bracketL_in_synpred135_Fan2090);
        bracketL();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred135_Fan

    // $ANTLR start synpred136_Fan
    public final void synpred136_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:339:52: ( stmt )
        // src/net/colar/netbeans/fan/antlr/Fan.g:339:52: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred136_Fan2097);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_Fan

    // $ANTLR start synpred157_Fan
    public final void synpred157_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:364:26: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:364:26: ( OP_BITOR | SP_PIPE ) bitAndExpr
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

        pushFollow(FOLLOW_bitAndExpr_in_synpred157_Fan2387);
        bitAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred157_Fan

    // $ANTLR start synpred158_Fan
    public final void synpred158_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:365:26: ( OP_CURRY shiftExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:365:26: OP_CURRY shiftExpr
        {
        match(input,OP_CURRY,FOLLOW_OP_CURRY_in_synpred158_Fan2401); if (state.failed) return ;
        pushFollow(FOLLOW_shiftExpr_in_synpred158_Fan2403);
        shiftExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred158_Fan

    // $ANTLR start synpred162_Fan
    public final void synpred162_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:367:22: ( ( OP_PLUS | OP_MINUS ) multExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:367:22: ( OP_PLUS | OP_MINUS ) multExpr
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

        pushFollow(FOLLOW_multExpr_in_synpred162_Fan2448);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred162_Fan

    // $ANTLR start synpred167_Fan
    public final void synpred167_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:370:14: ( castExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:370:14: castExpr
        {
        pushFollow(FOLLOW_castExpr_in_synpred167_Fan2500);
        castExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred167_Fan

    // $ANTLR start synpred168_Fan
    public final void synpred168_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:370:25: ( groupedExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:370:25: groupedExpr
        {
        pushFollow(FOLLOW_groupedExpr_in_synpred168_Fan2504);
        groupedExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred168_Fan

    // $ANTLR start synpred169_Fan
    public final void synpred169_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:374:31: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:374:31: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred169_Fan2540);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred169_Fan

    // $ANTLR start synpred170_Fan
    public final void synpred170_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:375:14: ( prefixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:375:14: prefixExpr
        {
        pushFollow(FOLLOW_prefixExpr_in_synpred170_Fan2549);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred170_Fan

    // $ANTLR start synpred171_Fan
    public final void synpred171_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:375:27: ( postfixExpr )
        // src/net/colar/netbeans/fan/antlr/Fan.g:375:27: postfixExpr
        {
        pushFollow(FOLLOW_postfixExpr_in_synpred171_Fan2553);
        postfixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred171_Fan

    // $ANTLR start synpred179_Fan
    public final void synpred179_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:378:22: ( termChain )
        // src/net/colar/netbeans/fan/antlr/Fan.g:378:22: termChain
        {
        pushFollow(FOLLOW_termChain_in_synpred179_Fan2621);
        termChain();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred179_Fan

    // $ANTLR start synpred180_Fan
    public final void synpred180_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:380:13: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:380:13: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred180_Fan2631);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred180_Fan

    // $ANTLR start synpred181_Fan
    public final void synpred181_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:380:25: ( literal )
        // src/net/colar/netbeans/fan/antlr/Fan.g:380:25: literal
        {
        pushFollow(FOLLOW_literal_in_synpred181_Fan2635);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred181_Fan

    // $ANTLR start synpred182_Fan
    public final void synpred182_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:380:35: ( typeBase )
        // src/net/colar/netbeans/fan/antlr/Fan.g:380:35: typeBase
        {
        pushFollow(FOLLOW_typeBase_in_synpred182_Fan2639);
        typeBase();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred182_Fan

    // $ANTLR start synpred183_Fan
    public final void synpred183_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:381:12: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:381:12: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred183_Fan2650);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred183_Fan

    // $ANTLR start synpred184_Fan
    public final void synpred184_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:381:26: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:381:26: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred184_Fan2654);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred184_Fan

    // $ANTLR start synpred185_Fan
    public final void synpred185_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:381:40: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:381:40: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred185_Fan2658);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred185_Fan

    // $ANTLR start synpred186_Fan
    public final void synpred186_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:381:53: ( staticCall )
        // src/net/colar/netbeans/fan/antlr/Fan.g:381:53: staticCall
        {
        pushFollow(FOLLOW_staticCall_in_synpred186_Fan2662);
        staticCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred186_Fan

    // $ANTLR start synpred187_Fan
    public final void synpred187_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:382:19: ( dsl )
        // src/net/colar/netbeans/fan/antlr/Fan.g:382:19: dsl
        {
        pushFollow(FOLLOW_dsl_in_synpred187_Fan2684);
        dsl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred187_Fan

    // $ANTLR start synpred188_Fan
    public final void synpred188_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:382:25: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:382:25: closure
        {
        pushFollow(FOLLOW_closure_in_synpred188_Fan2688);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred188_Fan

    // $ANTLR start synpred189_Fan
    public final void synpred189_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:382:35: ( simple )
        // src/net/colar/netbeans/fan/antlr/Fan.g:382:35: simple
        {
        pushFollow(FOLLOW_simple_in_synpred189_Fan2692);
        simple();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred189_Fan

    // $ANTLR start synpred200_Fan
    public final void synpred200_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:398:45: ( closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:398:45: closure
        {
        pushFollow(FOLLOW_closure_in_synpred200_Fan2864);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred200_Fan

    // $ANTLR start synpred202_Fan
    public final void synpred202_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:402:12: ( idExprReq )
        // src/net/colar/netbeans/fan/antlr/Fan.g:402:12: idExprReq
        {
        pushFollow(FOLLOW_idExprReq_in_synpred202_Fan2903);
        idExprReq();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred202_Fan

    // $ANTLR start synpred204_Fan
    public final void synpred204_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:408:13: ( ( callParams closure ) )
        // src/net/colar/netbeans/fan/antlr/Fan.g:408:13: ( callParams closure )
        {
        // src/net/colar/netbeans/fan/antlr/Fan.g:408:13: ( callParams closure )
        // src/net/colar/netbeans/fan/antlr/Fan.g:408:14: callParams closure
        {
        pushFollow(FOLLOW_callParams_in_synpred204_Fan2944);
        callParams();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_closure_in_synpred204_Fan2946);
        closure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred204_Fan

    // $ANTLR start synpred205_Fan
    public final void synpred205_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:408:36: ( callParams )
        // src/net/colar/netbeans/fan/antlr/Fan.g:408:36: callParams
        {
        pushFollow(FOLLOW_callParams_in_synpred205_Fan2951);
        callParams();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred205_Fan

    // $ANTLR start synpred219_Fan
    public final void synpred219_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:414:20: ( namedSuper )
        // src/net/colar/netbeans/fan/antlr/Fan.g:414:20: namedSuper
        {
        pushFollow(FOLLOW_namedSuper_in_synpred219_Fan3044);
        namedSuper();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred219_Fan

    // $ANTLR start synpred220_Fan
    public final void synpred220_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:4: ( slotLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:4: slotLiteral
        {
        pushFollow(FOLLOW_slotLiteral_in_synpred220_Fan3051);
        slotLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred220_Fan

    // $ANTLR start synpred221_Fan
    public final void synpred221_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:18: ( typeLiteral )
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:18: typeLiteral
        {
        pushFollow(FOLLOW_typeLiteral_in_synpred221_Fan3055);
        typeLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred221_Fan

    // $ANTLR start synpred222_Fan
    public final void synpred222_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:32: ( list )
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:32: list
        {
        pushFollow(FOLLOW_list_in_synpred222_Fan3059);
        list();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred222_Fan

    // $ANTLR start synpred223_Fan
    public final void synpred223_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:39: ( map )
        // src/net/colar/netbeans/fan/antlr/Fan.g:415:39: map
        {
        pushFollow(FOLLOW_map_in_synpred223_Fan3063);
        map();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred223_Fan

    // $ANTLR start synpred225_Fan
    public final void synpred225_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:419:11: ( type {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:419:11: type {...}?
        {
        pushFollow(FOLLOW_type_in_synpred225_Fan3118);
        type();

        state._fsp--;
        if (state.failed) return ;
        if ( !((notAfterEol())) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred225_Fan", "notAfterEol()");
        }

        }
    }
    // $ANTLR end synpred225_Fan

    // $ANTLR start synpred229_Fan
    public final void synpred229_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:421:10: ( mapType {...}?)
        // src/net/colar/netbeans/fan/antlr/Fan.g:421:10: mapType {...}?
        {
        pushFollow(FOLLOW_mapType_in_synpred229_Fan3163);
        mapType();

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
        // src/net/colar/netbeans/fan/antlr/Fan.g:426:9: ( DOC )
        // src/net/colar/netbeans/fan/antlr/Fan.g:426:9: DOC
        {
        match(input,DOC,FOLLOW_DOC_in_synpred233_Fan3232); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred233_Fan

    // $ANTLR start synpred236_Fan
    public final void synpred236_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:434:5: ( SP_SEMI )
        // src/net/colar/netbeans/fan/antlr/Fan.g:434:5: SP_SEMI
        {
        match(input,SP_SEMI,FOLLOW_SP_SEMI_in_synpred236_Fan3283); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred236_Fan

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
    public final boolean synpred123_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred123_Fan_fragment(); // can never throw exception
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
    public final boolean synpred115_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_Fan_fragment(); // can never throw exception
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA89 dfa89 = new DFA89(this);
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
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA131 dfa131 = new DFA131(this);
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\2\2\2\uffff";
    static final String DFA2_minS =
        "\2\24\2\uffff";
    static final String DFA2_maxS =
        "\2\145\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\3\4\uffff\1\3\1\uffff\10\3\72\uffff\1\3\6\uffff\1\1",
            "\2\3\4\uffff\1\3\1\uffff\10\3\72\uffff\1\3\6\uffff\1\1",
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
            return "()* loopback of 220:18: ( typeDef )*";
        }
    }
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\3\uffff\1\6\5\uffff\1\6\1\14\2\uffff";
    static final String DFA3_minS =
        "\1\21\2\137\1\21\1\152\1\137\1\uffff\2\137\2\21\2\uffff";
    static final String DFA3_maxS =
        "\1\21\1\151\1\137\1\145\1\152\1\137\1\uffff\2\137\2\145\2\uffff";
    static final String DFA3_acceptS =
        "\6\uffff\1\1\4\uffff\1\3\1\2";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\3\11\uffff\1\2",
            "\1\4",
            "\1\6\2\uffff\2\6\4\uffff\1\6\1\uffff\10\6\26\uffff\1\7\1\5"+
            "\7\uffff\1\6\32\uffff\1\6\6\uffff\1\6",
            "\1\10",
            "\1\11",
            "",
            "\1\12",
            "\1\3",
            "\1\6\2\uffff\2\6\4\uffff\1\6\1\uffff\10\6\26\uffff\1\7\1\5"+
            "\7\uffff\1\6\32\uffff\1\6\6\uffff\1\6",
            "\1\14\1\13\1\uffff\2\14\4\uffff\1\14\1\uffff\10\14\37\uffff"+
            "\1\14\32\uffff\1\14\6\uffff\1\14",
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
            return "222:5: ( usingPod | usingType | usingAs )";
        }
    }
    static final String DFA7_eotS =
        "\13\uffff";
    static final String DFA7_eofS =
        "\13\uffff";
    static final String DFA7_minS =
        "\1\24\3\0\1\uffff\3\0\3\uffff";
    static final String DFA7_maxS =
        "\1\145\3\0\1\uffff\3\0\3\uffff";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\3\uffff\1\1\1\2\1\3";
    static final String DFA7_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\3\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\6\1\7\4\uffff\1\5\1\uffff\1\10\1\11\1\12\1\4\4\3\72\uffff"+
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
            return "231:24: ( ( ( classFlags )* KW_CLASS )=> classDef | ( ( protection )? KW_ENUM )=> enumDef | mixinDef )";
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
        "\23\uffff";
    static final String DFA44_eofS =
        "\23\uffff";
    static final String DFA44_minS =
        "\1\23\1\0\21\uffff";
    static final String DFA44_maxS =
        "\1\151\1\0\21\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\17\uffff\1\1";
    static final String DFA44_specialS =
        "\1\uffff\1\0\21\uffff}>";
    static final String[] DFA44_transitionS = {
            "\2\2\1\1\5\2\4\uffff\7\2\32\uffff\1\2\35\uffff\2\2\5\uffff\1"+
            "\2\3\uffff\1\2",
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
            return "270:12: ( ( KW_STATIC bracketL )=> staticBlock | ( docs ( facet )* ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef ) ) )";
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
                        if ( (synpred57_Fan()) ) {s = 18;}

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
        "\22\uffff";
    static final String DFA43_eofS =
        "\22\uffff";
    static final String DFA43_minS =
        "\1\23\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA43_maxS =
        "\1\151\3\0\1\uffff\4\0\1\uffff\5\0\3\uffff";
    static final String DFA43_acceptS =
        "\4\uffff\1\1\4\uffff\1\2\5\uffff\1\3\2\uffff";
    static final String DFA43_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\1\12"+
        "\1\13\1\14\3\uffff}>";
    static final String[] DFA43_transitionS = {
            "\2\17\1\10\1\12\1\17\1\6\1\5\1\13\4\uffff\1\7\4\3\1\4\1\11\32"+
            "\uffff\1\15\35\uffff\1\2\1\16\5\uffff\1\1\3\uffff\1\14",
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
            return "272:6: ( ( ( ctorFlags )* KW_NEW )=> ctorDef | ( ( methodFlags )* ( type | KW_VOID ) id parL )=> methodDef | fieldDef )";
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

                        else if ( ((LA43_0>=KW_RD_ONLY && LA43_0<=KW_CONST)||LA43_0==KW_VOLATILE) ) {s = 15;}

                         
                        input.seek(index43_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_1 = input.LA(1);

                         
                        int index43_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_Fan()) ) {s = 4;}

                        else if ( (synpred63_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index43_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_Fan()) ) {s = 4;}

                        else if ( (synpred63_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index43_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_3 = input.LA(1);

                         
                        int index43_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_Fan()) ) {s = 4;}

                        else if ( (synpred63_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index43_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA43_5 = input.LA(1);

                         
                        int index43_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index43_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA43_6 = input.LA(1);

                         
                        int index43_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index43_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA43_7 = input.LA(1);

                         
                        int index43_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index43_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA43_8 = input.LA(1);

                         
                        int index43_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index43_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA43_10 = input.LA(1);

                         
                        int index43_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index43_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA43_11 = input.LA(1);

                         
                        int index43_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index43_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA43_12 = input.LA(1);

                         
                        int index43_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index43_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA43_13 = input.LA(1);

                         
                        int index43_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index43_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA43_14 = input.LA(1);

                         
                        int index43_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 15;}

                         
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
        "\1\100\2\uffff\1\4\1\uffff\1\0\4\uffff";
    static final String DFA53_maxS =
        "\1\151\2\uffff\1\153\1\uffff\1\0\4\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\2\1\1\uffff\1\2\1\uffff\4\1";
    static final String DFA53_specialS =
        "\1\2\2\uffff\1\1\1\uffff\1\0\4\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\2\36\uffff\1\3\11\uffff\1\1",
            "",
            "",
            "\15\4\2\uffff\10\4\4\uffff\12\4\2\uffff\4\4\13\uffff\1\6\1"+
            "\uffff\1\11\1\4\1\7\1\10\1\4\1\uffff\2\4\13\uffff\1\4\2\uffff"+
            "\2\4\3\uffff\4\4\3\uffff\1\4\1\5\12\4\1\uffff\1\4",
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
            return "285:11: ( ( type id )=> typeAndId | id )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_5 = input.LA(1);

                         
                        int index53_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Fan()) ) {s = 9;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index53_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_3 = input.LA(1);

                         
                        int index53_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_3==EOF||(LA53_3>=KW_BREAK && LA53_3<=KW_FINALLY)||(LA53_3>=KW_RD_ONLY && LA53_3<=KW_FINAL)||(LA53_3>=KW_ABSTRACT && LA53_3<=KW_ELSE)||(LA53_3>=KW_NULL && LA53_3<=KW_FALSE)||LA53_3==SP_COMMA||LA53_3==SP_PIPE||(LA53_3>=AS_INIT_VAL && LA53_3<=SP_SEMI)||LA53_3==OP_CURRY||(LA53_3>=OP_PLUS && LA53_3<=OP_MINUS)||(LA53_3>=OP_BANG && LA53_3<=OP_TILDA)||LA53_3==AT||(LA53_3>=QUOTSTR && LA53_3<=SQ_BRACKET_L)||LA53_3==PAR_L) ) {s = 4;}

                        else if ( (LA53_3==ID) ) {s = 5;}

                        else if ( (LA53_3==SP_COLCOL) && (synpred72_Fan())) {s = 6;}

                        else if ( (LA53_3==SP_QMARK) && (synpred72_Fan())) {s = 7;}

                        else if ( (LA53_3==LIST_TYPE) && (synpred72_Fan())) {s = 8;}

                        else if ( (LA53_3==SP_COLON) && (synpred72_Fan())) {s = 9;}

                         
                        input.seek(index53_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
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
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\36\uffff";
    static final String DFA72_eofS =
        "\36\uffff";
    static final String DFA72_minS =
        "\1\4\14\uffff\1\0\14\uffff\2\0\2\uffff";
    static final String DFA72_maxS =
        "\1\153\14\uffff\1\0\14\uffff\2\0\2\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\22\uffff\1\13";
    static final String DFA72_specialS =
        "\15\uffff\1\0\14\uffff\1\1\1\2\2\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\4\1\5\1\2\1\1\1\6\1\7\1\10\1\3\1\11\31\uffff\2\12\3\uffff"+
            "\4\12\21\uffff\1\33\16\uffff\1\12\2\uffff\2\12\3\uffff\4\12"+
            "\3\uffff\1\12\1\15\5\12\1\uffff\1\12\2\uffff\1\32\1\uffff\1"+
            "\12",
            "",
            "",
            "",
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

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "310:5: ( g_if | g_for | g_while | g_break | g_continue | g_return | g_switch | g_throw | g_try | exprStmt | localDef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_13 = input.LA(1);

                         
                        int index72_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index72_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_26 = input.LA(1);

                         
                        int index72_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index72_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_27 = input.LA(1);

                         
                        int index72_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Fan()) ) {s = 10;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index72_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\64\uffff";
    static final String DFA77_eofS =
        "\1\1\63\uffff";
    static final String DFA77_minS =
        "\1\4\13\uffff\23\0\25\uffff";
    static final String DFA77_maxS =
        "\1\153\13\uffff\23\0\25\uffff";
    static final String DFA77_acceptS =
        "\1\uffff\1\1\61\uffff\1\2";
    static final String DFA77_specialS =
        "\14\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\25\uffff}>";
    static final String[] DFA77_transitionS = {
            "\15\1\2\uffff\10\1\4\uffff\7\1\1\21\1\22\1\1\2\uffff\1\20\1"+
            "\23\1\24\1\25\16\uffff\1\1\2\uffff\1\35\2\uffff\1\1\13\uffff"+
            "\1\31\2\uffff\1\31\1\15\3\uffff\4\31\3\uffff\1\16\1\17\1\26"+
            "\1\27\1\30\1\33\1\36\1\1\1\32\1\uffff\1\1\1\34\1\uffff\1\14",
            "",
            "",
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
            return "324:22: ( eos | expr eos )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_12 = input.LA(1);

                         
                        int index77_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((((synpred120_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred120_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred120_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred120_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred120_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred120_Fan()&&(lookupNL()))&&(notAfterEol()))||(synpred120_Fan()&&(lookupNL()))||((synpred120_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred120_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred120_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred120_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred120_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred120_Fan()&&(lookupNL()))&&(notAfterEol()))||((synpred120_Fan()&&(lookupNL()))&&(notAfterEol())))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_13 = input.LA(1);

                         
                        int index77_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA77_14 = input.LA(1);

                         
                        int index77_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA77_15 = input.LA(1);

                         
                        int index77_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA77_16 = input.LA(1);

                         
                        int index77_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_16);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA77_17 = input.LA(1);

                         
                        int index77_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA77_18 = input.LA(1);

                         
                        int index77_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_18);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA77_19 = input.LA(1);

                         
                        int index77_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_19);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA77_20 = input.LA(1);

                         
                        int index77_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_20);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA77_21 = input.LA(1);

                         
                        int index77_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_21);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA77_22 = input.LA(1);

                         
                        int index77_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_22);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA77_23 = input.LA(1);

                         
                        int index77_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_23);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA77_24 = input.LA(1);

                         
                        int index77_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_24);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA77_25 = input.LA(1);

                         
                        int index77_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_25);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA77_26 = input.LA(1);

                         
                        int index77_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_26);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA77_27 = input.LA(1);

                         
                        int index77_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_27);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA77_28 = input.LA(1);

                         
                        int index77_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_28);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA77_29 = input.LA(1);

                         
                        int index77_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_29);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA77_30 = input.LA(1);

                         
                        int index77_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred120_Fan()&&(lookupNL()))) ) {s = 1;}

                        else if ( (true) ) {s = 51;}

                         
                        input.seek(index77_30);
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
    static final String DFA80_eotS =
        "\64\uffff";
    static final String DFA80_eofS =
        "\1\1\63\uffff";
    static final String DFA80_minS =
        "\1\4\3\uffff\34\0\24\uffff";
    static final String DFA80_maxS =
        "\1\153\3\uffff\34\0\24\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\2\61\uffff\1\1";
    static final String DFA80_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\24\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\7\1\10\1\5\1\4\1\11\1\12\1\13\1\6\1\14\4\1\2\uffff\10\1\4"+
            "\uffff\7\1\1\22\1\23\1\1\2\uffff\1\21\1\24\1\25\1\26\16\uffff"+
            "\1\1\2\uffff\1\36\2\uffff\1\1\13\uffff\1\32\2\uffff\1\32\1\16"+
            "\3\uffff\4\32\3\uffff\1\17\1\20\1\27\1\30\1\31\1\34\1\37\1\1"+
            "\1\33\1\uffff\1\1\1\35\1\uffff\1\15",
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
            return "()* loopback of 328:41: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_4 = input.LA(1);

                         
                        int index80_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_5 = input.LA(1);

                         
                        int index80_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA80_6 = input.LA(1);

                         
                        int index80_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA80_7 = input.LA(1);

                         
                        int index80_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA80_8 = input.LA(1);

                         
                        int index80_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA80_9 = input.LA(1);

                         
                        int index80_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA80_10 = input.LA(1);

                         
                        int index80_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA80_11 = input.LA(1);

                         
                        int index80_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA80_12 = input.LA(1);

                         
                        int index80_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_12);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA80_13 = input.LA(1);

                         
                        int index80_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred124_Fan()&&(notAfterEol()))||synpred124_Fan())) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_13);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA80_14 = input.LA(1);

                         
                        int index80_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_14);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA80_15 = input.LA(1);

                         
                        int index80_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_15);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA80_16 = input.LA(1);

                         
                        int index80_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_16);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA80_17 = input.LA(1);

                         
                        int index80_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_17);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA80_18 = input.LA(1);

                         
                        int index80_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_18);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA80_19 = input.LA(1);

                         
                        int index80_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_19);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA80_20 = input.LA(1);

                         
                        int index80_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_20);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA80_21 = input.LA(1);

                         
                        int index80_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_21);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA80_22 = input.LA(1);

                         
                        int index80_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_22);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA80_23 = input.LA(1);

                         
                        int index80_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_23);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA80_24 = input.LA(1);

                         
                        int index80_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_24);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA80_25 = input.LA(1);

                         
                        int index80_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_25);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA80_26 = input.LA(1);

                         
                        int index80_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_26);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA80_27 = input.LA(1);

                         
                        int index80_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_27);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA80_28 = input.LA(1);

                         
                        int index80_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_28);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA80_29 = input.LA(1);

                         
                        int index80_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_29);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA80_30 = input.LA(1);

                         
                        int index80_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_30);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA80_31 = input.LA(1);

                         
                        int index80_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred124_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_31);
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
    static final String DFA86_eotS =
        "\25\uffff";
    static final String DFA86_eofS =
        "\25\uffff";
    static final String DFA86_minS =
        "\1\46\3\0\21\uffff";
    static final String DFA86_maxS =
        "\1\153\3\0\21\uffff";
    static final String DFA86_acceptS =
        "\4\uffff\1\2\17\uffff\1\1";
    static final String DFA86_specialS =
        "\1\uffff\1\0\1\1\1\2\21\uffff}>";
    static final String[] DFA86_transitionS = {
            "\2\4\3\uffff\4\4\21\uffff\1\2\16\uffff\1\4\2\uffff\2\4\3\uffff"+
            "\4\4\3\uffff\1\4\1\3\5\4\1\uffff\1\4\2\uffff\1\1\1\uffff\1\4",
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
            return "332:1: forInit : ( forInitDef | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index86_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA86_2 = input.LA(1);

                         
                        int index86_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index86_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA86_3 = input.LA(1);

                         
                        int index86_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred129_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index86_3);
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
    static final String DFA88_eotS =
        "\65\uffff";
    static final String DFA88_eofS =
        "\1\2\64\uffff";
    static final String DFA88_minS =
        "\1\4\1\0\63\uffff";
    static final String DFA88_maxS =
        "\1\153\1\0\63\uffff";
    static final String DFA88_acceptS =
        "\2\uffff\1\2\61\uffff\1\1";
    static final String DFA88_specialS =
        "\1\uffff\1\0\63\uffff}>";
    static final String[] DFA88_transitionS = {
            "\15\2\2\uffff\10\2\4\uffff\12\2\2\uffff\4\2\16\uffff\1\2\2\uffff"+
            "\1\2\2\uffff\1\2\13\uffff\1\2\2\uffff\2\2\3\uffff\4\2\3\uffff"+
            "\14\2\1\uffff\1\1",
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
            return "335:21: ( catchDef )?";
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
                        if ( (synpred131_Fan()) ) {s = 52;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index88_1);
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
    static final String DFA89_eotS =
        "\64\uffff";
    static final String DFA89_eofS =
        "\1\1\63\uffff";
    static final String DFA89_minS =
        "\1\4\2\uffff\34\0\25\uffff";
    static final String DFA89_maxS =
        "\1\153\2\uffff\34\0\25\uffff";
    static final String DFA89_acceptS =
        "\1\uffff\1\2\61\uffff\1\1";
    static final String DFA89_specialS =
        "\3\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\25\uffff}>";
    static final String[] DFA89_transitionS = {
            "\1\6\1\7\1\4\1\3\1\10\1\11\1\12\1\5\1\13\4\1\2\uffff\10\1\4"+
            "\uffff\7\1\1\21\1\22\1\1\2\uffff\1\20\1\23\1\24\1\25\16\uffff"+
            "\1\1\2\uffff\1\35\2\uffff\1\1\13\uffff\1\31\2\uffff\1\31\1\15"+
            "\3\uffff\4\31\3\uffff\1\16\1\17\1\26\1\27\1\30\1\33\1\36\1\1"+
            "\1\32\1\uffff\1\1\1\34\1\uffff\1\14",
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
            return "()* loopback of 335:57: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA89_3 = input.LA(1);

                         
                        int index89_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA89_4 = input.LA(1);

                         
                        int index89_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA89_5 = input.LA(1);

                         
                        int index89_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA89_6 = input.LA(1);

                         
                        int index89_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA89_7 = input.LA(1);

                         
                        int index89_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA89_8 = input.LA(1);

                         
                        int index89_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA89_9 = input.LA(1);

                         
                        int index89_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA89_10 = input.LA(1);

                         
                        int index89_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA89_11 = input.LA(1);

                         
                        int index89_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA89_12 = input.LA(1);

                         
                        int index89_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred133_Fan()&&(notAfterEol()))||synpred133_Fan())) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA89_13 = input.LA(1);

                         
                        int index89_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA89_14 = input.LA(1);

                         
                        int index89_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_14);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA89_15 = input.LA(1);

                         
                        int index89_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_15);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA89_16 = input.LA(1);

                         
                        int index89_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_16);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA89_17 = input.LA(1);

                         
                        int index89_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_17);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA89_18 = input.LA(1);

                         
                        int index89_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_18);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA89_19 = input.LA(1);

                         
                        int index89_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_19);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA89_20 = input.LA(1);

                         
                        int index89_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_20);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA89_21 = input.LA(1);

                         
                        int index89_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_21);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA89_22 = input.LA(1);

                         
                        int index89_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_22);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA89_23 = input.LA(1);

                         
                        int index89_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_23);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA89_24 = input.LA(1);

                         
                        int index89_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_24);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA89_25 = input.LA(1);

                         
                        int index89_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_25);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA89_26 = input.LA(1);

                         
                        int index89_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_26);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA89_27 = input.LA(1);

                         
                        int index89_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_27);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA89_28 = input.LA(1);

                         
                        int index89_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_28);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA89_29 = input.LA(1);

                         
                        int index89_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_29);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA89_30 = input.LA(1);

                         
                        int index89_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index89_30);
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
    static final String DFA92_eotS =
        "\64\uffff";
    static final String DFA92_eofS =
        "\1\1\63\uffff";
    static final String DFA92_minS =
        "\1\4\1\uffff\34\0\26\uffff";
    static final String DFA92_maxS =
        "\1\153\1\uffff\34\0\26\uffff";
    static final String DFA92_acceptS =
        "\1\uffff\1\2\61\uffff\1\1";
    static final String DFA92_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\26\uffff}>";
    static final String[] DFA92_transitionS = {
            "\1\5\1\6\1\3\1\2\1\7\1\10\1\11\1\4\1\12\4\1\2\uffff\10\1\4\uffff"+
            "\7\1\1\20\1\21\1\1\2\uffff\1\17\1\22\1\23\1\24\16\uffff\1\1"+
            "\2\uffff\1\34\2\uffff\1\1\13\uffff\1\30\2\uffff\1\30\1\14\3"+
            "\uffff\4\30\3\uffff\1\15\1\16\1\25\1\26\1\27\1\32\1\35\1\1\1"+
            "\31\1\uffff\1\1\1\33\1\uffff\1\13",
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
            return "()* loopback of 339:52: ( stmt )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA92_2 = input.LA(1);

                         
                        int index92_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA92_3 = input.LA(1);

                         
                        int index92_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA92_4 = input.LA(1);

                         
                        int index92_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA92_5 = input.LA(1);

                         
                        int index92_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA92_6 = input.LA(1);

                         
                        int index92_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA92_7 = input.LA(1);

                         
                        int index92_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA92_8 = input.LA(1);

                         
                        int index92_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA92_9 = input.LA(1);

                         
                        int index92_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA92_10 = input.LA(1);

                         
                        int index92_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA92_11 = input.LA(1);

                         
                        int index92_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred136_Fan()||(synpred136_Fan()&&(notAfterEol())))) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA92_12 = input.LA(1);

                         
                        int index92_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA92_13 = input.LA(1);

                         
                        int index92_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA92_14 = input.LA(1);

                         
                        int index92_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA92_15 = input.LA(1);

                         
                        int index92_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA92_16 = input.LA(1);

                         
                        int index92_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA92_17 = input.LA(1);

                         
                        int index92_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA92_18 = input.LA(1);

                         
                        int index92_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA92_19 = input.LA(1);

                         
                        int index92_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA92_20 = input.LA(1);

                         
                        int index92_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_20);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA92_21 = input.LA(1);

                         
                        int index92_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_21);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA92_22 = input.LA(1);

                         
                        int index92_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_22);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA92_23 = input.LA(1);

                         
                        int index92_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_23);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA92_24 = input.LA(1);

                         
                        int index92_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_24);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA92_25 = input.LA(1);

                         
                        int index92_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_25);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA92_26 = input.LA(1);

                         
                        int index92_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_26);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA92_27 = input.LA(1);

                         
                        int index92_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_27);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA92_28 = input.LA(1);

                         
                        int index92_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_28);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA92_29 = input.LA(1);

                         
                        int index92_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_Fan()) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index92_29);
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
        "\104\uffff";
    static final String DFA108_eofS =
        "\1\1\103\uffff";
    static final String DFA108_minS =
        "\1\4\30\uffff\1\0\52\uffff";
    static final String DFA108_maxS =
        "\1\154\30\uffff\1\0\52\uffff";
    static final String DFA108_acceptS =
        "\1\uffff\1\2\101\uffff\1\1";
    static final String DFA108_specialS =
        "\31\uffff\1\0\52\uffff}>";
    static final String[] DFA108_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\15\uffff\3\1\1\uffff\1\31\2"+
            "\uffff\13\1\1\103\1\1\2\uffff\2\1\3\uffff\4\1\3\uffff\17\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 364:25: ( ( OP_BITOR | SP_PIPE ) bitAndExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA108_25 = input.LA(1);

                         
                        int index108_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred157_Fan()) ) {s = 67;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index108_25);
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
        "\106\uffff";
    static final String DFA109_eofS =
        "\1\1\105\uffff";
    static final String DFA109_minS =
        "\1\4\65\uffff\1\0\17\uffff";
    static final String DFA109_maxS =
        "\1\154\65\uffff\1\0\17\uffff";
    static final String DFA109_acceptS =
        "\1\uffff\1\2\103\uffff\1\1";
    static final String DFA109_specialS =
        "\66\uffff\1\0\17\uffff}>";
    static final String[] DFA109_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\15\uffff\3\1\1\uffff\1\1\2\uffff"+
            "\14\1\1\66\2\uffff\2\1\3\uffff\4\1\3\uffff\17\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 365:25: ( OP_CURRY shiftExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_54 = input.LA(1);

                         
                        int index109_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred158_Fan()) ) {s = 69;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index109_54);
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
        "\110\uffff";
    static final String DFA111_eofS =
        "\1\1\107\uffff";
    static final String DFA111_minS =
        "\1\4\55\uffff\1\0\11\uffff\1\0\17\uffff";
    static final String DFA111_maxS =
        "\1\154\55\uffff\1\0\11\uffff\1\0\17\uffff";
    static final String DFA111_acceptS =
        "\1\uffff\1\2\105\uffff\1\1";
    static final String DFA111_specialS =
        "\56\uffff\1\0\11\uffff\1\1\17\uffff}>";
    static final String[] DFA111_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\15\uffff\3\1\1\uffff\1\1\2\uffff"+
            "\17\1\1\70\1\56\3\uffff\4\1\3\uffff\17\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 367:21: ( ( OP_PLUS | OP_MINUS ) multExpr )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA111_46 = input.LA(1);

                         
                        int index111_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Fan()) ) {s = 71;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index111_46);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA111_56 = input.LA(1);

                         
                        int index111_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred162_Fan()) ) {s = 71;}

                        else if ( ((lookupNL())) ) {s = 1;}

                         
                        input.seek(index111_56);
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
        "\26\uffff";
    static final String DFA113_eofS =
        "\26\uffff";
    static final String DFA113_minS =
        "\1\46\1\0\24\uffff";
    static final String DFA113_maxS =
        "\1\153\1\0\24\uffff";
    static final String DFA113_acceptS =
        "\2\uffff\1\3\21\uffff\1\1\1\2";
    static final String DFA113_specialS =
        "\1\uffff\1\0\24\uffff}>";
    static final String[] DFA113_transitionS = {
            "\2\2\3\uffff\4\2\21\uffff\1\2\16\uffff\1\2\2\uffff\2\2\3\uffff"+
            "\4\2\3\uffff\7\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\1",
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
            return "370:1: parenExpr : ( castExpr | groupedExpr | unaryExpr );";
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
                        if ( ((synpred167_Fan()&&(notAfterEol()))) ) {s = 20;}

                        else if ( (synpred168_Fan()) ) {s = 21;}

                         
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
        "\114\uffff";
    static final String DFA114_eofS =
        "\1\1\113\uffff";
    static final String DFA114_minS =
        "\1\4\17\uffff\1\0\15\uffff\1\0\20\uffff\1\0\34\uffff";
    static final String DFA114_maxS =
        "\1\154\17\uffff\1\0\15\uffff\1\0\20\uffff\1\0\34\uffff";
    static final String DFA114_acceptS =
        "\1\uffff\1\2\106\uffff\1\1\3\uffff";
    static final String DFA114_specialS =
        "\20\uffff\1\0\15\uffff\1\1\20\uffff\1\2\34\uffff}>";
    static final String[] DFA114_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\14\uffff\1\110\3\1\1\uffff\1"+
            "\1\1\110\1\uffff\30\1\1\uffff\2\110\11\1\1\20\1\1\1\36\1\1\1"+
            "\57\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 374:31: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA114_16 = input.LA(1);

                         
                        int index114_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred169_Fan()) ) {s = 72;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index114_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA114_30 = input.LA(1);

                         
                        int index114_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred169_Fan()&&(notAfterEol()))) ) {s = 72;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index114_30);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA114_47 = input.LA(1);

                         
                        int index114_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred169_Fan()&&(notAfterEol()))) ) {s = 72;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL())||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol())))) ) {s = 1;}

                         
                        input.seek(index114_47);
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
        "\25\uffff";
    static final String DFA115_eofS =
        "\25\uffff";
    static final String DFA115_minS =
        "\1\46\14\0\1\uffff\5\0\2\uffff";
    static final String DFA115_maxS =
        "\1\151\14\0\1\uffff\5\0\2\uffff";
    static final String DFA115_acceptS =
        "\15\uffff\1\1\5\uffff\1\2\1\3";
    static final String DFA115_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\14\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] DFA115_transitionS = {
            "\1\5\1\6\3\uffff\1\4\1\7\1\10\1\11\21\uffff\1\21\16\uffff\1"+
            "\15\2\uffff\1\15\1\1\3\uffff\4\15\3\uffff\1\2\1\3\1\12\1\13"+
            "\1\14\1\17\1\22\1\uffff\1\16\2\uffff\1\20",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "375:1: unaryExpr : ( prefixExpr | postfixExpr | termExpr );";
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
                        if ( (synpred170_Fan()) ) {s = 13;}

                        else if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA115_2 = input.LA(1);

                         
                        int index115_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA115_3 = input.LA(1);

                         
                        int index115_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA115_4 = input.LA(1);

                         
                        int index115_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA115_5 = input.LA(1);

                         
                        int index115_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA115_6 = input.LA(1);

                         
                        int index115_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA115_7 = input.LA(1);

                         
                        int index115_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA115_8 = input.LA(1);

                         
                        int index115_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA115_9 = input.LA(1);

                         
                        int index115_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA115_10 = input.LA(1);

                         
                        int index115_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA115_11 = input.LA(1);

                         
                        int index115_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA115_12 = input.LA(1);

                         
                        int index115_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA115_14 = input.LA(1);

                         
                        int index115_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA115_15 = input.LA(1);

                         
                        int index115_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA115_16 = input.LA(1);

                         
                        int index115_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA115_17 = input.LA(1);

                         
                        int index115_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index115_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA115_18 = input.LA(1);

                         
                        int index115_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred171_Fan()) ) {s = 19;}

                        else if ( (true) ) {s = 20;}

                         
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
        "\115\uffff";
    static final String DFA116_eofS =
        "\1\1\114\uffff";
    static final String DFA116_minS =
        "\1\4\17\uffff\1\0\15\uffff\1\0\20\uffff\1\0\35\uffff";
    static final String DFA116_maxS =
        "\1\154\17\uffff\1\0\15\uffff\1\0\20\uffff\1\0\35\uffff";
    static final String DFA116_acceptS =
        "\1\uffff\1\2\107\uffff\1\1\3\uffff";
    static final String DFA116_specialS =
        "\20\uffff\1\0\15\uffff\1\1\20\uffff\1\2\35\uffff}>";
    static final String[] DFA116_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\14\uffff\1\111\3\1\1\uffff\1"+
            "\1\1\111\1\uffff\30\1\1\uffff\2\111\11\1\1\20\1\1\1\36\1\1\1"+
            "\57\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 378:22: ( termChain )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA116_16 = input.LA(1);

                         
                        int index116_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred179_Fan()) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index116_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA116_30 = input.LA(1);

                         
                        int index116_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred179_Fan()&&(notAfterEol()))) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index116_30);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA116_47 = input.LA(1);

                         
                        int index116_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred179_Fan()&&(notAfterEol()))) ) {s = 73;}

                        else if ( ((((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||(lookupNL())||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol()))||((lookupNL())&&(notAfterEol())))) ) {s = 1;}

                         
                        input.seek(index116_47);
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
        "\24\uffff";
    static final String DFA117_eofS =
        "\24\uffff";
    static final String DFA117_minS =
        "\1\46\1\uffff\1\0\14\uffff\3\0\2\uffff";
    static final String DFA117_maxS =
        "\1\151\1\uffff\1\0\14\uffff\3\0\2\uffff";
    static final String DFA117_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\16\uffff\1\3\1\4";
    static final String DFA117_specialS =
        "\2\uffff\1\0\14\uffff\1\1\1\2\1\3\2\uffff}>";
    static final String[] DFA117_transitionS = {
            "\2\3\3\uffff\4\3\21\uffff\1\20\22\uffff\1\3\12\uffff\1\1\1\2"+
            "\4\3\1\21\1\uffff\1\3\2\uffff\1\17",
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
            return "380:1: termBase : ( idExprReq | literal | typeBase | id );";
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
                        if ( (synpred180_Fan()) ) {s = 1;}

                        else if ( (synpred181_Fan()) ) {s = 3;}

                        else if ( (synpred182_Fan()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index117_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA117_15 = input.LA(1);

                         
                        int index117_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred181_Fan()) ) {s = 3;}

                        else if ( (synpred182_Fan()) ) {s = 18;}

                         
                        input.seek(index117_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA117_16 = input.LA(1);

                         
                        int index117_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred181_Fan()) ) {s = 3;}

                        else if ( (synpred182_Fan()) ) {s = 18;}

                         
                        input.seek(index117_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA117_17 = input.LA(1);

                         
                        int index117_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred181_Fan()) ) {s = 3;}

                        else if ( (synpred182_Fan()) ) {s = 18;}

                         
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
        "\1\100\3\0\10\uffff";
    static final String DFA118_maxS =
        "\1\151\3\0\10\uffff";
    static final String DFA118_acceptS =
        "\4\uffff\1\2\1\1\1\4\1\7\1\10\1\6\1\3\1\5";
    static final String DFA118_specialS =
        "\1\uffff\1\0\1\1\1\2\10\uffff}>";
    static final String[] DFA118_transitionS = {
            "\1\2\36\uffff\1\3\4\uffff\1\4\4\uffff\1\1",
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
            return "381:1: typeBase : ( typeLiteral | slotLiteral | namedSuper | staticCall | dsl | closure | simple | ctorBlock );";
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
                        if ( (synpred183_Fan()) ) {s = 5;}

                        else if ( (synpred184_Fan()) ) {s = 4;}

                        else if ( (synpred186_Fan()) ) {s = 6;}

                        else if ( (synpred189_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index118_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA118_2 = input.LA(1);

                         
                        int index118_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_Fan()) ) {s = 5;}

                        else if ( (synpred184_Fan()) ) {s = 4;}

                        else if ( (synpred186_Fan()) ) {s = 6;}

                        else if ( (synpred188_Fan()) ) {s = 9;}

                        else if ( (synpred189_Fan()) ) {s = 7;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index118_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA118_3 = input.LA(1);

                         
                        int index118_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_Fan()) ) {s = 5;}

                        else if ( (synpred184_Fan()) ) {s = 4;}

                        else if ( (synpred185_Fan()) ) {s = 10;}

                        else if ( (synpred186_Fan()) ) {s = 6;}

                        else if ( (synpred187_Fan()) ) {s = 11;}

                        else if ( (synpred189_Fan()) ) {s = 7;}

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
    static final String DFA124_eotS =
        "\116\uffff";
    static final String DFA124_eofS =
        "\1\1\115\uffff";
    static final String DFA124_minS =
        "\1\4\5\uffff\1\0\107\uffff";
    static final String DFA124_maxS =
        "\1\154\5\uffff\1\0\107\uffff";
    static final String DFA124_acceptS =
        "\1\uffff\1\2\113\uffff\1\1";
    static final String DFA124_specialS =
        "\6\uffff\1\0\107\uffff}>";
    static final String[] DFA124_transitionS = {
            "\15\1\1\uffff\11\1\1\uffff\23\1\14\uffff\4\1\1\uffff\1\6\1\1"+
            "\1\uffff\30\1\1\uffff\21\1",
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
            return "()* loopback of 398:45: ( closure )*";
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
                        if ( (synpred200_Fan()) ) {s = 77;}

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
    static final String DFA131_eotS =
        "\26\uffff";
    static final String DFA131_eofS =
        "\26\uffff";
    static final String DFA131_minS =
        "\1\46\14\uffff\3\0\6\uffff";
    static final String DFA131_maxS =
        "\1\151\14\uffff\3\0\6\uffff";
    static final String DFA131_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\13"+
        "\3\uffff\1\15\1\14\1\16\1\17\1\20\1\21";
    static final String DFA131_specialS =
        "\15\uffff\1\0\1\1\1\2\6\uffff}>";
    static final String[] DFA131_transitionS = {
            "\1\2\1\3\3\uffff\1\1\1\4\1\5\1\6\21\uffff\1\17\22\uffff\1\12"+
            "\13\uffff\1\15\1\7\1\10\1\11\1\14\1\20\1\uffff\1\12\2\uffff"+
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
            return "413:1: literal : ( KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | QUOTSTR | STR | URI | number | CHAR | namedSuper | slotLiteral | typeLiteral | list | map | simple );";
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
                        if ( (synpred219_Fan()) ) {s = 17;}

                        else if ( (synpred220_Fan()) ) {s = 16;}

                        else if ( (synpred221_Fan()) ) {s = 18;}

                        else if ( (synpred222_Fan()) ) {s = 19;}

                        else if ( (synpred223_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index131_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA131_14 = input.LA(1);

                         
                        int index131_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred220_Fan()) ) {s = 16;}

                        else if ( (synpred221_Fan()) ) {s = 18;}

                        else if ( (synpred222_Fan()) ) {s = 19;}

                        else if ( (synpred223_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index131_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA131_15 = input.LA(1);

                         
                        int index131_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred220_Fan()) ) {s = 16;}

                        else if ( (synpred221_Fan()) ) {s = 18;}

                        else if ( (synpred222_Fan()) ) {s = 19;}

                        else if ( (synpred223_Fan()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
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
 

    public static final BitSet FOLLOW_using_in_prog384 = new BitSet(new long[]{0x0000000FF4320000L,0x0000002040000000L});
    public static final BitSet FOLLOW_typeDef_in_prog387 = new BitSet(new long[]{0x0000000FF4300000L,0x0000002040000000L});
    public static final BitSet FOLLOW_docs_in_prog390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingPod_in_using412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingType_in_using416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingAs_in_using420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingPod430 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_podSpec_in_usingPod432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_eos_in_usingPod434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingType444 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_podSpec_in_usingType446 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingType448 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_usingType450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_eos_in_usingType452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_USING_in_usingAs460 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_podSpec_in_usingAs462 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_SP_COLCOL_in_usingAs464 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_usingAs466 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KW_AS_in_usingAs468 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_usingAs470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_eos_in_usingAs472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ffi_in_podSpec480 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_podSpec483 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_DOT_in_podSpec486 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_podSpec488 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_ffi499 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_ffi501 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_ffi503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_typeDef512 = new BitSet(new long[]{0x0000000FF4300000L,0x0000002040000000L});
    public static final BitSet FOLLOW_facet_in_typeDef514 = new BitSet(new long[]{0x0000000FF4300000L,0x0000002040000000L});
    public static final BitSet FOLLOW_classDef_in_typeDef525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDef_in_typeDef539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinDef_in_typeDef543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classHeader_in_classDef565 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_classBody_in_classDef567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_classHeader590 = new BitSet(new long[]{0x0000000F94300000L,0x0000000040000000L});
    public static final BitSet FOLLOW_facet_in_classHeader592 = new BitSet(new long[]{0x0000000F94300000L,0x0000000040000000L});
    public static final BitSet FOLLOW_classFlags_in_classHeader597 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_classHeader600 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_classHeader604 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_inheritance_in_classHeader606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_classFlags642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_classFlags646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_classFlags650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_classFlags654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_classFlags658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_classBody666 = new BitSet(new long[]{0x0000003F87F80000L,0x00000320C0000001L});
    public static final BitSet FOLLOW_slotDef_in_classBody668 = new BitSet(new long[]{0x0000003F87F80000L,0x00000320C0000001L});
    public static final BitSet FOLLOW_bracketR_in_classBody671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_protection0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mixinHeader_in_mixinDef708 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_mixinBody_in_mixinDef710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_mixinHeader717 = new BitSet(new long[]{0x0000000F44300000L,0x0000000040000000L});
    public static final BitSet FOLLOW_facet_in_mixinHeader719 = new BitSet(new long[]{0x0000000F44300000L,0x0000000040000000L});
    public static final BitSet FOLLOW_mixinFlags_in_mixinHeader722 = new BitSet(new long[]{0x0000000F44300000L});
    public static final BitSet FOLLOW_KW_MIXIN_in_mixinHeader725 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_mixinHeader727 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_inheritance_in_mixinHeader729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_mixinFlags737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONST_in_mixinFlags741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_mixinFlags745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_mixinFlags749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_mixinBody756 = new BitSet(new long[]{0x0000003F87F80000L,0x00000320C0000001L});
    public static final BitSet FOLLOW_slotDef_in_mixinBody758 = new BitSet(new long[]{0x0000003F87F80000L,0x00000320C0000001L});
    public static final BitSet FOLLOW_bracketR_in_mixinBody761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumHeader_in_enumDef780 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_enumBody_in_enumDef782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumHeader792 = new BitSet(new long[]{0x0000000F20000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_facet_in_enumHeader794 = new BitSet(new long[]{0x0000000F20000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_protection_in_enumHeader797 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_enumHeader800 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_enumHeader802 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_inheritance_in_enumHeader804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_enumBody812 = new BitSet(new long[]{0x0000000000000000L,0x0000022080000000L});
    public static final BitSet FOLLOW_enumValDefs_in_enumBody814 = new BitSet(new long[]{0x0000003F87F80000L,0x00000320C0000001L});
    public static final BitSet FOLLOW_slotDef_in_enumBody816 = new BitSet(new long[]{0x0000003F87F80000L,0x00000320C0000001L});
    public static final BitSet FOLLOW_bracketR_in_enumBody819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_inheritance828 = new BitSet(new long[]{0x0000002F87600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_typeList_in_inheritance830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs840 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SP_COMMA_in_enumValDefs843 = new BitSet(new long[]{0x0000000000000000L,0x0000022080000000L});
    public static final BitSet FOLLOW_enumValDef_in_enumValDefs846 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_eos_in_enumValDefs850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_enumValDef858 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_enumValDef860 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_parL_in_enumValDef863 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_args_in_enumValDef865 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_enumValDef868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList879 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_typeList882 = new BitSet(new long[]{0x0000002F87600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_type_in_typeList884 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_typeRoot_in_type904 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_type907 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_type911 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_type913 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_funcType_in_nonMapType924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_nonMapType928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_typeRoot935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonMapType_in_typeRoot939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_simpleType953 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_SP_COLCOL_in_simpleType956 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_simpleType958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_mapType969 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000001L});
    public static final BitSet FOLLOW_nonMapType_in_mapType972 = new BitSet(new long[]{0xD000000000000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType974 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_mapType978 = new BitSet(new long[]{0xD000000000000000L});
    public static final BitSet FOLLOW_SP_QMARK_in_mapType980 = new BitSet(new long[]{0x9000000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapType992 = new BitSet(new long[]{0x0000002F87600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_type_in_mapType996 = new BitSet(new long[]{0x1000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_mapType1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1009 = new BitSet(new long[]{0x2000002F87600000L,0x00000220C0000003L});
    public static final BitSet FOLLOW_SP_COMMA_in_funcType1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_formals_in_funcType1017 = new BitSet(new long[]{0x2000002F87600000L,0x00000220C0000003L});
    public static final BitSet FOLLOW_assignedType_in_funcType1024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignedType_in_funcType1036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SP_PIPE_in_funcType1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_assignedType1047 = new BitSet(new long[]{0x0000002F87600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_type_in_assignedType1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_in_formals1059 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_formals1062 = new BitSet(new long[]{0x0000002F87600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_formal_in_formals1064 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_formal1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_formal1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalInferred_in_formal1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalFull1094 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_formalFull1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalTypeOnly1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_formalInferred1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticBlock_in_slotDef1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_slotDef1140 = new BitSet(new long[]{0x0000003F87F80000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_facet_in_slotDef1142 = new BitSet(new long[]{0x0000003F87F80000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_ctorDef_in_slotDef1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDef_in_slotDef1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDef_in_slotDef1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_fieldDef1238 = new BitSet(new long[]{0x0000003F87F80000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_facet_in_fieldDef1240 = new BitSet(new long[]{0x0000003F87F80000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_fieldFlags_in_fieldDef1243 = new BitSet(new long[]{0x0000003F87F80000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_typeId_in_fieldDef1245 = new BitSet(new long[]{0x0000000000000000L,0x000000800000000CL});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_fieldDef1248 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_fieldDef1250 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000008L});
    public static final BitSet FOLLOW_bracketL_in_fieldDef1265 = new BitSet(new long[]{0x0000000F00000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_protection_in_fieldDef1268 = new BitSet(new long[]{0x0000000F00000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_getter_in_fieldDef1272 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8009L});
    public static final BitSet FOLLOW_setter_in_fieldDef1276 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8009L});
    public static final BitSet FOLLOW_SP_SEMI_in_fieldDef1279 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_block_in_fieldDef1282 = new BitSet(new long[]{0x0000003F87F80000L,0x00000320C0000001L});
    public static final BitSet FOLLOW_bracketR_in_fieldDef1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_fieldDef1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeAndId_in_typeId1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_typeId1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeAndId1325 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_typeAndId1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_fieldFlags1335 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_RD_ONLY_in_fieldFlags1339 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_CONST_in_fieldFlags1343 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_STATIC_in_fieldFlags1347 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_fieldFlags1351 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VOLATILE_in_fieldFlags1355 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_fieldFlags1359 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_fieldFlags1363 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_KW_FINAL_in_fieldFlags1367 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_protection_in_fieldFlags1371 = new BitSet(new long[]{0x0000000F87F80002L});
    public static final BitSet FOLLOW_docs_in_methodDef1391 = new BitSet(new long[]{0x0000002F87600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_facet_in_methodDef1393 = new BitSet(new long[]{0x0000002F87600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_methodFlags_in_methodDef1398 = new BitSet(new long[]{0x0000002F87600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_type_in_methodDef1401 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_methodDef1407 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_parL_in_methodDef1409 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_params_in_methodDef1411 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_methodDef1413 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000008L});
    public static final BitSet FOLLOW_methodBody_in_methodDef1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_methodFlags1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VIRTUAL_in_methodFlags1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_OVERRIDE_in_methodFlags1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ABSTRACT_in_methodFlags1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_methodFlags1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ONCE_in_methodFlags1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NATIVE_in_methodFlags1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINAL_in_methodFlags1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params1503 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_params1506 = new BitSet(new long[]{0x0000002F87600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_param_in_params1508 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_type_in_param1521 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_param1523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_param1526 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_param1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_methodBody1538 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_stmt_in_methodBody1540 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_bracketR_in_methodBody1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_methodBody1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_docs_in_ctorDef1567 = new BitSet(new long[]{0x0000001F00000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_facet_in_ctorDef1569 = new BitSet(new long[]{0x0000001F00000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ctorFlags_in_ctorDef1572 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_ctorDef1575 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_ctorDef1577 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_parL_in_ctorDef1579 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_params_in_ctorDef1581 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_ctorDef1583 = new BitSet(new long[]{0x1000000000000000L,0x0000008000000008L});
    public static final BitSet FOLLOW_ctorChain_in_ctorDef1590 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000008L});
    public static final BitSet FOLLOW_methodBody_in_ctorDef1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_ctorFlags1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_ctorChain1608 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ctorChainThis_in_ctorChain1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorChainSuper_in_ctorChain1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_ctorChainThis1624 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainThis1626 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_ctorChainThis1628 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_parL_in_ctorChainThis1630 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_args_in_ctorChainThis1632 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_ctorChainThis1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_ctorChainSuper1642 = new BitSet(new long[]{0x0800000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_DOT_in_ctorChainSuper1645 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_ctorChainSuper1647 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_parL_in_ctorChainSuper1651 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_args_in_ctorChainSuper1653 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_ctorChainSuper1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_staticBlock1664 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_block_in_staticBlock1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiStmt_in_block1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_multiStmt1703 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_stmt_in_multiStmt1706 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_bracketR_in_multiStmt1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_if_in_stmt1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_for_in_stmt1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_while_in_stmt1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_break_in_stmt1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_continue_in_stmt1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_return_in_stmt1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switch_in_stmt1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_throw_in_stmt1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_try_in_stmt1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_stmt1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localDef_in_stmt1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_BREAK_in_g_break1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_eos_in_g_break1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONTINUE_in_g_continue1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_eos_in_g_continue1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_g_for1806 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_parL_in_g_for1808 = new BitSet(new long[]{0x000078FF87F80000L,0x00000A7FC78C8009L});
    public static final BitSet FOLLOW_forInit_in_g_for1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for1813 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8009L});
    public static final BitSet FOLLOW_expr_in_g_for1815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SP_SEMI_in_g_for1818 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_g_for1820 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_g_for1823 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_block_in_g_for1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IF_in_g_if1834 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_parL_in_g_if1836 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_g_if1838 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_g_if1840 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_block_in_g_if1842 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_g_if1849 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_block_in_g_if1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETURN_in_g_return1860 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8009L});
    public static final BitSet FOLLOW_eos_in_g_return1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_g_return1867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_eos_in_g_return1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SWITCH_in_g_switch1877 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_parL_in_g_switch1879 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_g_switch1881 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_g_switch1883 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_bracketL_in_g_switch1885 = new BitSet(new long[]{0x0000003F87F86000L,0x00000320C0000001L});
    public static final BitSet FOLLOW_g_case_in_g_switch1888 = new BitSet(new long[]{0x0000003F87F86000L,0x00000320C0000001L});
    public static final BitSet FOLLOW_g_default_in_g_switch1893 = new BitSet(new long[]{0x0000003F87F80000L,0x00000320C0000001L});
    public static final BitSet FOLLOW_bracketR_in_g_switch1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THROW_in_g_throw1905 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_g_throw1907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_eos_in_g_throw1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHILE_in_g_while1917 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_parL_in_g_while1919 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_g_while1921 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_g_while1923 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_block_in_g_while1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRY_in_g_try1933 = new BitSet(new long[]{0x000078FF87F99FF2L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_try_long_in_g_try1940 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_stmt_in_g_try1944 = new BitSet(new long[]{0x000078FF87F99FF2L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_g_catch_in_g_try1953 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_g_finally_in_g_try1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_try_long1971 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_stmt_in_try_long1973 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_bracketR_in_try_long1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprStmt1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_eos_in_exprStmt1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_localDef1992 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_localDef1995 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_localDef1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_eos_in_localDef2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_forInit2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forInit2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeId_in_forInitDef2020 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_AS_INIT_VAL_in_forInitDef2023 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_forInitDef2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_g_catch2036 = new BitSet(new long[]{0x000078FF87F81FF2L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_catchDef_in_g_catch2038 = new BitSet(new long[]{0x000078FF87F81FF2L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_catch_long_in_g_catch2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_g_catch2050 = new BitSet(new long[]{0x000078FF87F81FF2L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_bracketL_in_catch_long2059 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_stmt_in_catch_long2061 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_bracketR_in_catch_long2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_catchDef2072 = new BitSet(new long[]{0x0000002F87600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_type_in_catchDef2074 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_catchDef2076 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_catchDef2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_g_finally2086 = new BitSet(new long[]{0x000078FF87F81FF2L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_finally_long_in_g_finally2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_g_finally2097 = new BitSet(new long[]{0x000078FF87F81FF2L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_bracketL_in_finally_long2106 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_stmt_in_finally_long2108 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_bracketR_in_finally_long2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CASE_in_g_case2119 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_g_case2121 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_case2123 = new BitSet(new long[]{0x000078FF87F81FF2L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_stmt_in_g_case2125 = new BitSet(new long[]{0x000078FF87F81FF2L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_KW_DEFAULT_in_g_default2133 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_g_default2135 = new BitSet(new long[]{0x000078FF87F81FF2L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_stmt_in_g_default2137 = new BitSet(new long[]{0x000078FF87F81FF2L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_assignExpr_in_expr2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2165 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2168 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_assignExpr_in_assignExpr2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryExpr2179 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ternaryTail_in_ternaryExpr2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_ternaryTail2192 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail2194 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_ternaryTail2196 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_condOrExpr_in_ternaryTail2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2217 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_OP_OR_in_condOrExpr2221 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_condAndExpr_in_condOrExpr2224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2234 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_OP_AND_in_condAndExpr2237 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_equalityExpr_in_condAndExpr2240 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_CP_EQUALITY_in_equalityExpr2253 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_relationalExpr_in_equalityExpr2255 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_elvisExpr_in_relationalExpr2268 = new BitSet(new long[]{0x0000060000040000L,0x0000000000000200L});
    public static final BitSet FOLLOW_typeCheck_in_relationalExpr2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_relationalExpr2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeCheck2286 = new BitSet(new long[]{0x0000002F87600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_typeRoot_in_typeCheck2298 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_typeCheck2301 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_LIST_TYPE_in_typeCheck2306 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_CP_COMPARATORS_in_compare2319 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_elvisExpr_in_compare2321 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2332 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_OP_ELVIS_in_elvisExpr2335 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_rangeExpr_in_elvisExpr2337 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2348 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_set_in_rangeExpr2351 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_bitOrExpr_in_rangeExpr2365 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2376 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004001L});
    public static final BitSet FOLLOW_set_in_bitOrExpr2379 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_bitAndExpr_in_bitOrExpr2387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004001L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2398 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_OP_CURRY_in_bitAndExpr2401 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_shiftExpr_in_bitAndExpr2403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2415 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_shiftExpr2418 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2437 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_set_in_addExpr2440 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2448 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_set_in_addAppend2458 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_parenExpr_in_addAppend2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2474 = new BitSet(new long[]{0x0000000000000002L,0x0000000000700000L});
    public static final BitSet FOLLOW_set_in_multExpr2477 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_parenExpr_in_multExpr2489 = new BitSet(new long[]{0x0000000000000002L,0x0000000000700000L});
    public static final BitSet FOLLOW_castExpr_in_parenExpr2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_parenExpr2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_parenExpr2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_castExpr2519 = new BitSet(new long[]{0x0000002F87600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_type_in_castExpr2521 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_castExpr2523 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_parenExpr_in_castExpr2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_groupedExpr2534 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_groupedExpr2536 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_groupedExpr2538 = new BitSet(new long[]{0x0800000000000002L,0x00000A8030000002L});
    public static final BitSet FOLLOW_termChain_in_groupedExpr2540 = new BitSet(new long[]{0x0800000000000002L,0x00000A8030000002L});
    public static final BitSet FOLLOW_prefixExpr_in_unaryExpr2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_unaryExpr2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_unaryExpr2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixExpr2565 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_parenExpr_in_prefixExpr2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termExpr_in_postfixExpr2602 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_set_in_postfixExpr2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termBase_in_termExpr2619 = new BitSet(new long[]{0x0800000000000002L,0x00000A8030000002L});
    public static final BitSet FOLLOW_termChain_in_termExpr2621 = new BitSet(new long[]{0x0800000000000002L,0x00000A8030000002L});
    public static final BitSet FOLLOW_idExprReq_in_termBase2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_termBase2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_termBase2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_termBase2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_typeBase2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_typeBase2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_typeBase2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_typeBase2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_typeBase2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_typeBase2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_typeBase2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorBlock_in_typeBase2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_ctorBlock2703 = new BitSet(new long[]{0x0800000000000000L,0x00000A8030000002L});
    public static final BitSet FOLLOW_itBlock_in_ctorBlock2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_staticCall2712 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_DOT_in_staticCall2714 = new BitSet(new long[]{0x0000000000000000L,0x00000200C0000000L});
    public static final BitSet FOLLOW_idExpr_in_staticCall2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotCall_in_termChain2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynCall_in_termChain2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDotCall_in_termChain2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_safeDynCall_in_termChain2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexExpr_in_termChain2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callOp_in_termChain2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itBlock_in_termChain2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_dsl2767 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_DSL_in_dsl2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_itBlock2779 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_stmt_in_itBlock2782 = new BitSet(new long[]{0x200078FF87F81FF0L,0x00000BFFC78C8009L});
    public static final BitSet FOLLOW_SP_COMMA_in_itBlock2784 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8009L});
    public static final BitSet FOLLOW_SP_SEMI_in_itBlock2787 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_bracketR_in_itBlock2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotCall2800 = new BitSet(new long[]{0x0000000000000000L,0x00000200C0000000L});
    public static final BitSet FOLLOW_idExpr_in_dotCall2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_dynCall2810 = new BitSet(new long[]{0x0000000000000000L,0x00000200C0000000L});
    public static final BitSet FOLLOW_idExpr_in_dynCall2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFE_CALL_in_safeDotCall2820 = new BitSet(new long[]{0x0000000000000000L,0x00000200C0000000L});
    public static final BitSet FOLLOW_idExpr_in_safeDotCall2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SAFEDYN_CALL_in_safeDynCall2829 = new BitSet(new long[]{0x0000000000000000L,0x00000200C0000000L});
    public static final BitSet FOLLOW_idExpr_in_safeDynCall2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketL_in_indexExpr2841 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_indexExpr2843 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_indexExpr2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callOp2856 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_args_in_callOp2858 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_callOp2862 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_closure_in_callOp2864 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_funcType_in_closure2886 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_bracketL_in_closure2888 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_stmt_in_closure2890 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000BFFC78C8001L});
    public static final BitSet FOLLOW_bracketR_in_closure2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_idExpr2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idExpr2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_idExprReq2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_idExprReq2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_field2928 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_field2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call2940 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000001L});
    public static final BitSet FOLLOW_callParams_in_call2944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_closure_in_call2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_call2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_call2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parL_in_callParams2966 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_args_in_callParams2968 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_callParams2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args2980 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_args2983 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_args2986 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_KW_NULL_in_literal2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_THIS_in_literal3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SUPER_in_literal3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_IT_in_literal3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TRUE_in_literal3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FALSE_in_literal3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTSTR_in_literal3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_literal3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_literal3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_literal3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_literal3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_literal3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_literal3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_literal3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_literal3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_literal3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_literal3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeLiteral3076 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_OP_POUND_in_typeLiteral3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_slotLiteral3089 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_OP_POUND_in_slotLiteral3092 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_slotLiteral3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_namedSuper3104 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_DOT_in_namedSuper3106 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_KW_SUPER_in_namedSuper3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_list3118 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_sq_bracketL_in_list3124 = new BitSet(new long[]{0x200078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_listItems_in_list3126 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_list3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_listItems3137 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3140 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_listItems3142 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_listItems3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_map3163 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_sq_bracketL_in_map3169 = new BitSet(new long[]{0x100078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_mapItems_in_map3171 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_sq_bracketR_in_map3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapPair_in_mapItems3182 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems3185 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_mapPair_in_mapItems3187 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_SP_COMMA_in_mapItems3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_mapItems3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_mapPair3205 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_SP_COLON_in_mapPair3207 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_mapPair3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_simple3217 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_parL_in_simple3219 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_simple3221 = new BitSet(new long[]{0x000078EF87600000L,0x00001A7FC78C8001L});
    public static final BitSet FOLLOW_parR_in_simple3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_docs3232 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_OP_MINUS_in_number3243 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_NUMBER_in_number3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_facet3254 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_facet3256 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_AS_EQUAL_in_facet3259 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_expr_in_facet3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_eos3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getter3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_setter3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_L_in_bracketL3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKET_R_in_bracketR3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_L_in_sq_bracketL3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQ_BRACKET_R_in_sq_bracketR3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_L_in_parL3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_R_in_parR3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred7_Fan514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classFlags_in_synpred9_Fan519 = new BitSet(new long[]{0x0000000F94300000L});
    public static final BitSet FOLLOW_KW_CLASS_in_synpred9_Fan522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protection_in_synpred11_Fan533 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KW_ENUM_in_synpred11_Fan536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred38_Fan907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred39_Fan913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_TYPE_in_synpred40_Fan911 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_SP_QMARK_in_synpred40_Fan913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred42_Fan935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_synpred48_Fan992 = new BitSet(new long[]{0x0000002F87600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_type_in_synpred48_Fan996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sq_bracketR_in_synpred49_Fan1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred51_Fan1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ARROW_in_synpred53_Fan1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalFull_in_synpred55_Fan1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formalTypeOnly_in_synpred56_Fan1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STATIC_in_synpred57_Fan1126 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_bracketL_in_synpred57_Fan1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_facet_in_synpred58_Fan1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorFlags_in_synpred60_Fan1159 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_KW_NEW_in_synpred60_Fan1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodFlags_in_synpred63_Fan1176 = new BitSet(new long[]{0x0000002F8F600000L,0x00000220C0000001L});
    public static final BitSet FOLLOW_type_in_synpred63_Fan1180 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_KW_VOID_in_synpred63_Fan1184 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_synpred63_Fan1187 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_parL_in_synpred63_Fan1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getter_in_synpred67_Fan1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred69_Fan1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred72_Fan1308 = new BitSet(new long[]{0x0000000000000000L,0x0000020080000000L});
    public static final BitSet FOLLOW_id_in_synpred72_Fan1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_COLON_in_synpred99_Fan1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred104_Fan1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprStmt_in_synpred115_Fan1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ELSE_in_synpred119_Fan1849 = new BitSet(new long[]{0x000078FF87F81FF0L,0x00000AFFC78C8001L});
    public static final BitSet FOLLOW_block_in_synpred119_Fan1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eos_in_synpred120_Fan1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred123_Fan1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred124_Fan1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CATCH_in_synpred125_Fan1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FINALLY_in_synpred126_Fan1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInitDef_in_synpred129_Fan2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchDef_in_synpred131_Fan2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred132_Fan2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred133_Fan2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketL_in_synpred135_Fan2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred136_Fan2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred157_Fan2379 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_bitAndExpr_in_synpred157_Fan2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_CURRY_in_synpred158_Fan2401 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_shiftExpr_in_synpred158_Fan2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred162_Fan2440 = new BitSet(new long[]{0x000078EF87600000L,0x00000A7FC78C8001L});
    public static final BitSet FOLLOW_multExpr_in_synpred162_Fan2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_synpred167_Fan2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupedExpr_in_synpred168_Fan2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred169_Fan2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred170_Fan2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpr_in_synpred171_Fan2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termChain_in_synpred179_Fan2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred180_Fan2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred181_Fan2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeBase_in_synpred182_Fan2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred183_Fan2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred184_Fan2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred185_Fan2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCall_in_synpred186_Fan2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsl_in_synpred187_Fan2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred188_Fan2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_in_synpred189_Fan2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closure_in_synpred200_Fan2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idExprReq_in_synpred202_Fan2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred204_Fan2944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_closure_in_synpred204_Fan2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callParams_in_synpred205_Fan2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedSuper_in_synpred219_Fan3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_slotLiteral_in_synpred220_Fan3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeLiteral_in_synpred221_Fan3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_synpred222_Fan3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_in_synpred223_Fan3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred225_Fan3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapType_in_synpred229_Fan3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_in_synpred233_Fan3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SP_SEMI_in_synpred236_Fan3283 = new BitSet(new long[]{0x0000000000000002L});

}