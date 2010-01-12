// $ANTLR 3.1.2 src/net/colar/netbeans/fan/antlr/Fan.g 2010-01-11 23:18:07
package net.colar.netbeans.fan.antlr;
import net.colar.netbeans.fan.FanParserResult;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FanLexer extends Lexer {
    public static final int AST_INDEX_EXPR=81;
    public static final int EXPONENT=163;
    public static final int DSL=127;
    public static final int OP_AND=107;
    public static final int KW_NATIVE=22;
    public static final int AST_CATCH_DEF=77;
    public static final int LETTER=165;
    public static final int HEXNB=158;
    public static final int CHAR=132;
    public static final int OP_2PLUS=124;
    public static final int KW_DEFAULT=14;
    public static final int KW_ONCE=37;
    public static final int SP_SEMI=103;
    public static final int INC_UNKNOWN_ITEM=166;
    public static final int AST_MIXIN=53;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int KW_PUBLIC=34;
    public static final int KW_ISNOT=42;
    public static final int OP_MOD=122;
    public static final int OP_MINUS=119;
    public static final int PAR_R=142;
    public static final int KW_NEW=36;
    public static final int KW_BREAK=4;
    public static final int KW_SWITCH=9;
    public static final int AST_INC_DOTCALL=83;
    public static final int OP_RANG_EXCL_OLD=111;
    public static final int AST_CLASS=51;
    public static final int OP_BITOR=114;
    public static final int AST_TYPE=90;
    public static final int QUOTSTR=133;
    public static final int OP_BANG=123;
    public static final int AST_DOT_CALL=63;
    public static final int AST_TYPE_LIT=69;
    public static final int PAR_L=141;
    public static final int OP_MULTI=120;
    public static final int AST_USING_POD=66;
    public static final int AST_STR=60;
    public static final int KW_PROTECTED=33;
    public static final int KEYWORD=155;
    public static final int LINE_COMMENT=145;
    public static final int CP_COMPARATORS=109;
    public static final int NUMBER=138;
    public static final int AS_EQUAL=104;
    public static final int KW_CATCH=15;
    public static final int UNDERSCORE=156;
    public static final int OP_DIV=121;
    public static final int SP_COMMA=98;
    public static final int AST_SYMBOL=71;
    public static final int AST_LIST=73;
    public static final int URI=131;
    public static final int KW_FINALLY=16;
    public static final int WS=144;
    public static final int KW_THROW=10;
    public static final int OP_POUND=135;
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
    public static final int COMPL_DSL=149;
    public static final int NBTYPE=164;
    public static final int KW_SUPER=39;
    public static final int OP_2MINUS=125;
    public static final int AST_SCOPE=85;
    public static final int OP_RSHIFT=117;
    public static final int KW_ELSE=40;
    public static final int AST_FUNC_TYPE=80;
    public static final int OP_OR=106;
    public static final int AST_MODIFIER=87;
    public static final int DOC=137;
    public static final int KW_OVERRIDE=24;
    public static final int AST_FIELD=56;
    public static final int AST_CODE_BLOCK=58;
    public static final int KW_ABSTRACT=31;
    public static final int MULTI_COMMENT=148;
    public static final int KW_CONST=20;
    public static final int AST_DOCS=59;
    public static final int COMPL_ML_COMMENT=147;
    public static final int OP_ELVIS=110;
    public static final int BRACKET_R=95;
    public static final int KW_TRUE=45;
    public static final int ID=130;
    public static final int SP_COLON=97;
    public static final int AST_CAST=79;
    public static final int AST_CONSTRUCTOR_CHAIN=57;
    public static final int AST_TERM_EXPR=62;
    public static final int BRACKET_L=94;
    public static final int AT=136;
    public static final int STR=134;
    public static final int SP_PIPE=101;
    public static final int OP_RANGE_EXCL=112;
    public static final int KW_VIRTUAL=25;
    public static final int OP_TILDA=126;
    public static final int COMPL_QSTR=152;
    public static final int CP_EQUALITY=108;
    public static final int AST_SAFE_DOT_CALL=64;
    public static final int KW_WHILE=11;
    public static final int KW_FOR=6;
    public static final int COMPL_URI=154;
    public static final int AST_SLOT_LIT=70;
    public static final int AST_LOCAL_DEF=68;
    public static final int OP_RANGE=113;
    public static final int KW_RETURN=8;
    public static final int INC_DSL=50;
    public static final int SQ_BRACKET_R=140;
    public static final int AST_NAMED_SUPER=72;
    public static final int KW_IS=41;
    public static final int KW_TRY=12;
    public static final int DIGIT=150;
    public static final int KW_IT=44;
    public static final int DOT=93;
    public static final int KW_IF=7;
    public static final int KW_THIS=38;
    public static final int OP_CURRY=115;
    public static final int SQ_BRACKET_L=139;
    public static final int AST_INC_SAFEDOTCALL=84;
    public static final int OP_PLUS=118;
    public static final int KW_FALSE=46;
    public static final int KW_FINAL=26;
    public static final int KW_INTERNAL=35;
    public static final int KW_CONTINUE=5;
    public static final int HEXLETTER=151;
    public static final int KW_PRIVATE=32;
    public static final int KW_ENUM=29;
    public static final int HEX_HEADER=157;
    public static final int OP_SAFEDYN_CALL=129;
    public static final int KW_CASE=13;
    public static final int KW_VOLATILE=23;
    public static final int LIST_TYPE=100;
    public static final int OP_LSHIFT=116;
    public static final int FRACTIONAL=160;
    public static final int EXEC_COMMENT=146;
    public static final int AST_IT_BLOCK=74;
    public static final int KW_MIXIN=30;
    public static final int AST_CHILD=91;
    public static final int OP_ARROW=102;
    public static final int KW_VOID=27;
    public static final int INC_URI=48;
    public static final int DECIMAL=159;
    public static final int KW_CLASS=28;
    public static final int AS_ASSIGN_OP=105;
    public static final int AST_MAP=67;
    public static final int AST_CONSTRUCTOR=55;
    public static final int AST_STATIC_CALL=65;
    public static final int INC_STR=47;
    public static final int KW_RD_ONLY=19;
    public static final int KW_AS=18;
    public static final int OP_SAFE_CALL=128;
    public static final int AST_FORMAL=78;
    public static final int LB=143;
    public static final int COMPL_STR=153;
    public static final int KW_USING=17;
    public static final int KW_NULL=43;
    public static final int AST_PARAM=89;
    public static final int AST_FOR_INIT=76;
    public static final int FRACTION=162;
    public static final int AST_INHERITANCE=88;
    public static final int AST_INC_USING=82;
    public static final int SP_COLCOL=92;

    	//typeOverride
    	int too=-1;
    	public int getTypeOverride() {return too;}
    	public void clearTypeOverride() {too=-1;}


    // delegates
    // delegators

    public FanLexer() {;} 
    public FanLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FanLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "src/net/colar/netbeans/fan/antlr/Fan.g"; }

    // $ANTLR start "KW_BREAK"
    public final void mKW_BREAK() throws RecognitionException {
        try {
            int _type = KW_BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:13:10: ( 'break' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:13:12: 'break'
            {
            match("break"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_BREAK"

    // $ANTLR start "KW_CONTINUE"
    public final void mKW_CONTINUE() throws RecognitionException {
        try {
            int _type = KW_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:14:13: ( 'continue' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:14:15: 'continue'
            {
            match("continue"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_CONTINUE"

    // $ANTLR start "KW_FOR"
    public final void mKW_FOR() throws RecognitionException {
        try {
            int _type = KW_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:15:8: ( 'for' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:15:10: 'for'
            {
            match("for"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_FOR"

    // $ANTLR start "KW_IF"
    public final void mKW_IF() throws RecognitionException {
        try {
            int _type = KW_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:16:7: ( 'if' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:16:9: 'if'
            {
            match("if"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_IF"

    // $ANTLR start "KW_RETURN"
    public final void mKW_RETURN() throws RecognitionException {
        try {
            int _type = KW_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:17:11: ( 'return' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:17:13: 'return'
            {
            match("return"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_RETURN"

    // $ANTLR start "KW_SWITCH"
    public final void mKW_SWITCH() throws RecognitionException {
        try {
            int _type = KW_SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:18:11: ( 'switch' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:18:13: 'switch'
            {
            match("switch"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_SWITCH"

    // $ANTLR start "KW_THROW"
    public final void mKW_THROW() throws RecognitionException {
        try {
            int _type = KW_THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:19:10: ( 'throw ' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:19:12: 'throw '
            {
            match("throw "); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_THROW"

    // $ANTLR start "KW_WHILE"
    public final void mKW_WHILE() throws RecognitionException {
        try {
            int _type = KW_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:20:10: ( 'while' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:20:12: 'while'
            {
            match("while"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_WHILE"

    // $ANTLR start "KW_TRY"
    public final void mKW_TRY() throws RecognitionException {
        try {
            int _type = KW_TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:21:8: ( 'try' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:21:10: 'try'
            {
            match("try"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_TRY"

    // $ANTLR start "KW_CASE"
    public final void mKW_CASE() throws RecognitionException {
        try {
            int _type = KW_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:22:9: ( 'case' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:22:11: 'case'
            {
            match("case"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_CASE"

    // $ANTLR start "KW_DEFAULT"
    public final void mKW_DEFAULT() throws RecognitionException {
        try {
            int _type = KW_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:23:12: ( 'default' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:23:14: 'default'
            {
            match("default"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_DEFAULT"

    // $ANTLR start "KW_CATCH"
    public final void mKW_CATCH() throws RecognitionException {
        try {
            int _type = KW_CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:24:10: ( 'catch' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:24:12: 'catch'
            {
            match("catch"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_CATCH"

    // $ANTLR start "KW_FINALLY"
    public final void mKW_FINALLY() throws RecognitionException {
        try {
            int _type = KW_FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:25:12: ( 'finally' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:25:14: 'finally'
            {
            match("finally"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_FINALLY"

    // $ANTLR start "KW_USING"
    public final void mKW_USING() throws RecognitionException {
        try {
            int _type = KW_USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:26:10: ( 'using' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:26:12: 'using'
            {
            match("using"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_USING"

    // $ANTLR start "KW_AS"
    public final void mKW_AS() throws RecognitionException {
        try {
            int _type = KW_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:27:7: ( 'as' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:27:9: 'as'
            {
            match("as"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_AS"

    // $ANTLR start "KW_RD_ONLY"
    public final void mKW_RD_ONLY() throws RecognitionException {
        try {
            int _type = KW_RD_ONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:28:12: ( 'readonly' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:28:14: 'readonly'
            {
            match("readonly"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_RD_ONLY"

    // $ANTLR start "KW_CONST"
    public final void mKW_CONST() throws RecognitionException {
        try {
            int _type = KW_CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:29:10: ( 'const' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:29:12: 'const'
            {
            match("const"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_CONST"

    // $ANTLR start "KW_STATIC"
    public final void mKW_STATIC() throws RecognitionException {
        try {
            int _type = KW_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:30:11: ( 'static' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:30:13: 'static'
            {
            match("static"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_STATIC"

    // $ANTLR start "KW_NATIVE"
    public final void mKW_NATIVE() throws RecognitionException {
        try {
            int _type = KW_NATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:31:11: ( 'native' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:31:13: 'native'
            {
            match("native"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_NATIVE"

    // $ANTLR start "KW_VOLATILE"
    public final void mKW_VOLATILE() throws RecognitionException {
        try {
            int _type = KW_VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:32:13: ( 'volatile' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:32:15: 'volatile'
            {
            match("volatile"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_VOLATILE"

    // $ANTLR start "KW_OVERRIDE"
    public final void mKW_OVERRIDE() throws RecognitionException {
        try {
            int _type = KW_OVERRIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:33:13: ( 'override' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:33:15: 'override'
            {
            match("override"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_OVERRIDE"

    // $ANTLR start "KW_VIRTUAL"
    public final void mKW_VIRTUAL() throws RecognitionException {
        try {
            int _type = KW_VIRTUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:34:12: ( 'virtual' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:34:14: 'virtual'
            {
            match("virtual"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_VIRTUAL"

    // $ANTLR start "KW_FINAL"
    public final void mKW_FINAL() throws RecognitionException {
        try {
            int _type = KW_FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:35:10: ( 'final' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:35:12: 'final'
            {
            match("final"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_FINAL"

    // $ANTLR start "KW_VOID"
    public final void mKW_VOID() throws RecognitionException {
        try {
            int _type = KW_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:36:9: ( 'void' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:36:11: 'void'
            {
            match("void"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_VOID"

    // $ANTLR start "KW_CLASS"
    public final void mKW_CLASS() throws RecognitionException {
        try {
            int _type = KW_CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:37:10: ( 'class' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:37:12: 'class'
            {
            match("class"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_CLASS"

    // $ANTLR start "KW_ENUM"
    public final void mKW_ENUM() throws RecognitionException {
        try {
            int _type = KW_ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:38:9: ( 'enum' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:38:11: 'enum'
            {
            match("enum"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_ENUM"

    // $ANTLR start "KW_MIXIN"
    public final void mKW_MIXIN() throws RecognitionException {
        try {
            int _type = KW_MIXIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:39:10: ( 'mixin' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:39:12: 'mixin'
            {
            match("mixin"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_MIXIN"

    // $ANTLR start "KW_ABSTRACT"
    public final void mKW_ABSTRACT() throws RecognitionException {
        try {
            int _type = KW_ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:40:13: ( 'abstract' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:40:15: 'abstract'
            {
            match("abstract"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_ABSTRACT"

    // $ANTLR start "KW_PRIVATE"
    public final void mKW_PRIVATE() throws RecognitionException {
        try {
            int _type = KW_PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:41:12: ( 'private' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:41:14: 'private'
            {
            match("private"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_PRIVATE"

    // $ANTLR start "KW_PROTECTED"
    public final void mKW_PROTECTED() throws RecognitionException {
        try {
            int _type = KW_PROTECTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:42:14: ( 'protected' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:42:16: 'protected'
            {
            match("protected"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_PROTECTED"

    // $ANTLR start "KW_PUBLIC"
    public final void mKW_PUBLIC() throws RecognitionException {
        try {
            int _type = KW_PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:43:11: ( 'public' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:43:13: 'public'
            {
            match("public"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_PUBLIC"

    // $ANTLR start "KW_INTERNAL"
    public final void mKW_INTERNAL() throws RecognitionException {
        try {
            int _type = KW_INTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:44:13: ( 'internal' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:44:15: 'internal'
            {
            match("internal"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_INTERNAL"

    // $ANTLR start "KW_NEW"
    public final void mKW_NEW() throws RecognitionException {
        try {
            int _type = KW_NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:45:8: ( 'new' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:45:10: 'new'
            {
            match("new"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_NEW"

    // $ANTLR start "KW_ONCE"
    public final void mKW_ONCE() throws RecognitionException {
        try {
            int _type = KW_ONCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:46:9: ( 'once' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:46:11: 'once'
            {
            match("once"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_ONCE"

    // $ANTLR start "KW_THIS"
    public final void mKW_THIS() throws RecognitionException {
        try {
            int _type = KW_THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:47:9: ( 'this' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:47:11: 'this'
            {
            match("this"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_THIS"

    // $ANTLR start "KW_SUPER"
    public final void mKW_SUPER() throws RecognitionException {
        try {
            int _type = KW_SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:48:10: ( 'super' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:48:12: 'super'
            {
            match("super"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_SUPER"

    // $ANTLR start "KW_ELSE"
    public final void mKW_ELSE() throws RecognitionException {
        try {
            int _type = KW_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:49:9: ( 'else' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:49:11: 'else'
            {
            match("else"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_ELSE"

    // $ANTLR start "KW_IS"
    public final void mKW_IS() throws RecognitionException {
        try {
            int _type = KW_IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:50:7: ( 'is' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:50:9: 'is'
            {
            match("is"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_IS"

    // $ANTLR start "KW_ISNOT"
    public final void mKW_ISNOT() throws RecognitionException {
        try {
            int _type = KW_ISNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:51:10: ( 'isnot' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:51:12: 'isnot'
            {
            match("isnot"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_ISNOT"

    // $ANTLR start "KW_NULL"
    public final void mKW_NULL() throws RecognitionException {
        try {
            int _type = KW_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:52:9: ( 'null' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:52:11: 'null'
            {
            match("null"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_NULL"

    // $ANTLR start "KW_IT"
    public final void mKW_IT() throws RecognitionException {
        try {
            int _type = KW_IT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:53:7: ( 'it' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:53:9: 'it'
            {
            match("it"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_IT"

    // $ANTLR start "KW_TRUE"
    public final void mKW_TRUE() throws RecognitionException {
        try {
            int _type = KW_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:54:9: ( 'true' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:54:11: 'true'
            {
            match("true"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_TRUE"

    // $ANTLR start "KW_FALSE"
    public final void mKW_FALSE() throws RecognitionException {
        try {
            int _type = KW_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:55:10: ( 'false' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:55:12: 'false'
            {
            match("false"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_FALSE"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:56:8: ( '$' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:56:10: '$'
            {
            match('$'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "LB"
    public final void mLB() throws RecognitionException {
        try {
            int _type = LB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:583:5: ( ( ( '\\r\\n' ) | '\\n' )+ )
            // src/net/colar/netbeans/fan/antlr/Fan.g:583:7: ( ( '\\r\\n' ) | '\\n' )+
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:583:7: ( ( '\\r\\n' ) | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\r') ) {
                    alt1=1;
                }
                else if ( (LA1_0=='\n') ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:583:8: ( '\\r\\n' )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:583:8: ( '\\r\\n' )
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:583:9: '\\r\\n'
            	    {
            	    match("\r\n"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:583:19: '\\n'
            	    {
            	    match('\n'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LB"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:585:7: ( ( ' ' | '\\t' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:585:10: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:586:14: ( '//' (~ ( '\\n' ) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:586:16: '//' (~ ( '\\n' ) )*
            {
            match("//"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:586:21: (~ ( '\\n' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:586:22: ~ ( '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "EXEC_COMMENT"
    public final void mEXEC_COMMENT() throws RecognitionException {
        try {
            int _type = EXEC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:587:14: ( '#!' (~ ( '\\n' ) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:587:16: '#!' (~ ( '\\n' ) )*
            {
            match("#!"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:587:21: (~ ( '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:587:22: ~ ( '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXEC_COMMENT"

    // $ANTLR start "MULTI_COMMENT"
    public final void mMULTI_COMMENT() throws RecognitionException {
        try {
            int _type = MULTI_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:592:15: ( '/*' ( ( COMPL_ML_COMMENT )=> COMPL_ML_COMMENT | (~ '\\n' )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:592:17: '/*' ( ( COMPL_ML_COMMENT )=> COMPL_ML_COMMENT | (~ '\\n' )* )
            {
            match("/*"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:592:22: ( ( COMPL_ML_COMMENT )=> COMPL_ML_COMMENT | (~ '\\n' )* )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:592:23: ( COMPL_ML_COMMENT )=> COMPL_ML_COMMENT
                    {
                    mCOMPL_ML_COMMENT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:592:62: (~ '\\n' )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:592:62: (~ '\\n' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:592:62: ~ '\\n'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                      too=INC_COMMENT;
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTI_COMMENT"

    // $ANTLR start "COMPL_ML_COMMENT"
    public final void mCOMPL_ML_COMMENT() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:594:17: ( ( options {greedy=false; } : . )* '*/' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:594:19: ( options {greedy=false; } : . )* '*/'
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:594:19: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:594:43: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); if (state.failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end "COMPL_ML_COMMENT"

    // $ANTLR start "DSL"
    public final void mDSL() throws RecognitionException {
        try {
            int _type = DSL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:596:6: ( '<|' ( ( COMPL_DSL )=> COMPL_DSL | (~ '\\n' )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:596:7: '<|' ( ( COMPL_DSL )=> COMPL_DSL | (~ '\\n' )* )
            {
            match("<|"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:596:12: ( ( COMPL_DSL )=> COMPL_DSL | (~ '\\n' )* )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:596:13: ( COMPL_DSL )=> COMPL_DSL
                    {
                    mCOMPL_DSL(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:596:38: (~ '\\n' )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:596:38: (~ '\\n' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:596:38: ~ '\\n'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                      too=INC_DSL;
                    }

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DSL"

    // $ANTLR start "COMPL_DSL"
    public final void mCOMPL_DSL() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:598:11: ( ( options {greedy=false; } : . )* '|>' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:598:13: ( options {greedy=false; } : . )* '|>'
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:598:13: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='|') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='>') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='=')||(LA9_1>='?' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='{')||(LA9_0>='}' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:598:37: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("|>"); if (state.failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end "COMPL_DSL"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:600:7: ( '\\'' ( ( '\\\\' . ) | ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ) | . )? '\\'' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:600:8: '\\'' ( ( '\\\\' . ) | ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ) | . )? '\\''
            {
            match('\''); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:600:13: ( ( '\\\\' . ) | ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ) | . )?
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\\') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='u') ) {
                    int LA10_4 = input.LA(3);

                    if ( ((LA10_4>='0' && LA10_4<='9')||(LA10_4>='A' && LA10_4<='F')||(LA10_4>='a' && LA10_4<='f')) ) {
                        alt10=2;
                    }
                    else if ( (LA10_4=='\'') ) {
                        alt10=1;
                    }
                }
                else if ( (LA10_1=='\'') ) {
                    int LA10_5 = input.LA(3);

                    if ( (LA10_5=='\'') ) {
                        alt10=1;
                    }
                }
                else if ( ((LA10_1>='\u0000' && LA10_1<='&')||(LA10_1>='(' && LA10_1<='t')||(LA10_1>='v' && LA10_1<='\uFFFF')) ) {
                    alt10=1;
                }
            }
            else if ( (LA10_0=='\'') ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2=='\'') ) {
                    alt10=3;
                }
            }
            else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                alt10=3;
            }
            switch (alt10) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:600:14: ( '\\\\' . )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:600:14: ( '\\\\' . )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:600:15: '\\\\' .
                    {
                    match('\\'); if (state.failed) return ;
                    matchAny(); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:600:25: ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:600:25: ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:600:26: '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER )
                    {
                    match("\\u"); if (state.failed) return ;

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:601:47: .
                    {
                    matchAny(); if (state.failed) return ;

                    }
                    break;

            }

            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "QUOTSTR"
    public final void mQUOTSTR() throws RecognitionException {
        try {
            int _type = QUOTSTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:603:10: ( '\"\"\"' ( ( COMPL_QSTR )=> COMPL_QSTR | (~ '\\n' )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:603:12: '\"\"\"' ( ( COMPL_QSTR )=> COMPL_QSTR | (~ '\\n' )* )
            {
            match("\"\"\""); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:603:18: ( ( COMPL_QSTR )=> COMPL_QSTR | (~ '\\n' )* )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:603:19: ( COMPL_QSTR )=> COMPL_QSTR
                    {
                    mCOMPL_QSTR(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:603:46: (~ '\\n' )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:603:46: (~ '\\n' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:603:46: ~ '\\n'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                      too=INC_STR;
                    }

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTSTR"

    // $ANTLR start "COMPL_QSTR"
    public final void mCOMPL_QSTR() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:605:12: ( ( options {greedy=false; } : . )* '\"\"\"' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:605:14: ( options {greedy=false; } : . )* '\"\"\"'
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:605:14: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\"') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='\"') ) {
                        int LA13_3 = input.LA(3);

                        if ( (LA13_3=='\"') ) {
                            alt13=2;
                        }
                        else if ( ((LA13_3>='\u0000' && LA13_3<='!')||(LA13_3>='#' && LA13_3<='\uFFFF')) ) {
                            alt13=1;
                        }


                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='!')||(LA13_1>='#' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:605:38: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("\"\"\""); if (state.failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end "COMPL_QSTR"

    // $ANTLR start "STR"
    public final void mSTR() throws RecognitionException {
        try {
            int _type = STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:606:6: ( '\"' ( ( COMPL_STR )=> COMPL_STR | (~ '\\n' )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:606:8: '\"' ( ( COMPL_STR )=> COMPL_STR | (~ '\\n' )* )
            {
            match('\"'); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:606:12: ( ( COMPL_STR )=> COMPL_STR | (~ '\\n' )* )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:606:13: ( COMPL_STR )=> COMPL_STR
                    {
                    mCOMPL_STR(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:606:38: (~ '\\n' )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:606:38: (~ '\\n' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\uFFFF')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:606:38: ~ '\\n'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                      too=INC_STR;
                    }

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STR"

    // $ANTLR start "COMPL_STR"
    public final void mCOMPL_STR() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:608:11: ( ( '\\\\\\\\' | '\\\\\"' | ~ '\"' )* '\"' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:608:13: ( '\\\\\\\\' | '\\\\\"' | ~ '\"' )* '\"'
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:608:13: ( '\\\\\\\\' | '\\\\\"' | ~ '\"' )*
            loop16:
            do {
                int alt16=4;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\\') ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2=='\\') ) {
                        alt16=1;
                    }
                    else if ( (LA16_2=='\"') ) {
                        int LA16_5 = input.LA(3);

                        if ( ((LA16_5>='\u0000' && LA16_5<='\uFFFF')) ) {
                            alt16=2;
                        }

                        else {
                            alt16=3;
                        }

                    }
                    else if ( ((LA16_2>='\u0000' && LA16_2<='!')||(LA16_2>='#' && LA16_2<='[')||(LA16_2>=']' && LA16_2<='\uFFFF')) ) {
                        alt16=3;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                    alt16=3;
                }


                switch (alt16) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:608:14: '\\\\\\\\'
            	    {
            	    match("\\\\"); if (state.failed) return ;


            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:608:23: '\\\\\"'
            	    {
            	    match("\\\""); if (state.failed) return ;


            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:608:31: ~ '\"'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match('\"'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "COMPL_STR"

    // $ANTLR start "URI"
    public final void mURI() throws RecognitionException {
        try {
            int _type = URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:609:6: ( '`' ( ( COMPL_URI )=> COMPL_URI | (~ '\\n' )* ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:609:8: '`' ( ( COMPL_URI )=> COMPL_URI | (~ '\\n' )* )
            {
            match('`'); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:609:13: ( ( COMPL_URI )=> COMPL_URI | (~ '\\n' )* )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:609:14: ( COMPL_URI )=> COMPL_URI
                    {
                    mCOMPL_URI(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:609:39: (~ '\\n' )*
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:609:39: (~ '\\n' )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\uFFFF')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // src/net/colar/netbeans/fan/antlr/Fan.g:609:39: ~ '\\n'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                      too=INC_URI;
                    }

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "URI"

    // $ANTLR start "COMPL_URI"
    public final void mCOMPL_URI() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:611:11: ( ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:611:13: ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`'
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:611:13: ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )*
            loop19:
            do {
                int alt19=4;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\\') ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2=='\\') ) {
                        alt19=1;
                    }
                    else if ( (LA19_2=='`') ) {
                        int LA19_5 = input.LA(3);

                        if ( ((LA19_5>='\u0000' && LA19_5<='\uFFFF')) ) {
                            alt19=2;
                        }

                        else {
                            alt19=3;
                        }

                    }
                    else if ( ((LA19_2>='\u0000' && LA19_2<='[')||(LA19_2>=']' && LA19_2<='_')||(LA19_2>='a' && LA19_2<='\uFFFF')) ) {
                        alt19=3;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='_')||(LA19_0>='a' && LA19_0<='\uFFFF')) ) {
                    alt19=3;
                }


                switch (alt19) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:611:14: ( '\\\\\\\\' )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:611:14: ( '\\\\\\\\' )
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:611:15: '\\\\\\\\'
            	    {
            	    match("\\\\"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:611:25: ( '\\\\`' )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:611:25: ( '\\\\`' )
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:611:26: '\\\\`'
            	    {
            	    match("\\`"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:611:35: ~ ( '`' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match('`'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "COMPL_URI"

    // $ANTLR start "DOC"
    public final void mDOC() throws RecognitionException {
        try {
            int _type = DOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:615:7: ( '**' ( options {greedy=false; } : . )* '\\n' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:615:11: '**' ( options {greedy=false; } : . )* '\\n'
            {
            match("**"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:615:16: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\n') ) {
                    alt20=2;
                }
                else if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:615:44: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match('\n'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOC"

    // $ANTLR start "KEYWORD"
    public final void mKEYWORD() throws RecognitionException {
        try {
            int _type = KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:618:10: ( ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:618:12: ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:618:12: ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' )
            int alt21=45;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:618:13: 'abstract'
                    {
                    match("abstract"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:618:26: 'as'
                    {
                    match("as"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:618:33: 'assert'
                    {
                    match("assert"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:618:44: 'break'
                    {
                    match("break"); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:618:54: 'case'
                    {
                    match("case"); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:618:63: 'catch'
                    {
                    match("catch"); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:619:3: 'class'
                    {
                    match("class"); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:619:13: 'const'
                    {
                    match("const"); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:619:23: 'continue'
                    {
                    match("continue"); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:619:36: 'default'
                    {
                    match("default"); if (state.failed) return ;


                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:619:48: 'do'
                    {
                    match("do"); if (state.failed) return ;


                    }
                    break;
                case 12 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:619:55: 'else'
                    {
                    match("else"); if (state.failed) return ;


                    }
                    break;
                case 13 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:619:64: 'enum'
                    {
                    match("enum"); if (state.failed) return ;


                    }
                    break;
                case 14 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:619:73: 'false'
                    {
                    match("false"); if (state.failed) return ;


                    }
                    break;
                case 15 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:620:4: 'final'
                    {
                    match("final"); if (state.failed) return ;


                    }
                    break;
                case 16 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:620:14: 'finally'
                    {
                    match("finally"); if (state.failed) return ;


                    }
                    break;
                case 17 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:620:26: 'for'
                    {
                    match("for"); if (state.failed) return ;


                    }
                    break;
                case 18 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:620:34: 'foreach'
                    {
                    match("foreach"); if (state.failed) return ;


                    }
                    break;
                case 19 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:620:46: 'if'
                    {
                    match("if"); if (state.failed) return ;


                    }
                    break;
                case 20 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:620:53: 'internal'
                    {
                    match("internal"); if (state.failed) return ;


                    }
                    break;
                case 21 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:620:66: 'is'
                    {
                    match("is"); if (state.failed) return ;


                    }
                    break;
                case 22 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:620:73: 'isnot'
                    {
                    match("isnot"); if (state.failed) return ;


                    }
                    break;
                case 23 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:621:4: 'mixin'
                    {
                    match("mixin"); if (state.failed) return ;


                    }
                    break;
                case 24 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:621:14: 'native'
                    {
                    match("native"); if (state.failed) return ;


                    }
                    break;
                case 25 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:621:25: 'new'
                    {
                    match("new"); if (state.failed) return ;


                    }
                    break;
                case 26 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:621:33: 'null'
                    {
                    match("null"); if (state.failed) return ;


                    }
                    break;
                case 27 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:621:42: 'once'
                    {
                    match("once"); if (state.failed) return ;


                    }
                    break;
                case 28 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:621:51: 'override'
                    {
                    match("override"); if (state.failed) return ;


                    }
                    break;
                case 29 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:621:64: 'private'
                    {
                    match("private"); if (state.failed) return ;


                    }
                    break;
                case 30 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:622:4: 'protected'
                    {
                    match("protected"); if (state.failed) return ;


                    }
                    break;
                case 31 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:622:18: 'public'
                    {
                    match("public"); if (state.failed) return ;


                    }
                    break;
                case 32 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:622:29: 'readonly'
                    {
                    match("readonly"); if (state.failed) return ;


                    }
                    break;
                case 33 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:622:42: 'return'
                    {
                    match("return"); if (state.failed) return ;


                    }
                    break;
                case 34 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:622:53: 'static'
                    {
                    match("static"); if (state.failed) return ;


                    }
                    break;
                case 35 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:622:64: 'super'
                    {
                    match("super"); if (state.failed) return ;


                    }
                    break;
                case 36 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:622:74: 'switch'
                    {
                    match("switch"); if (state.failed) return ;


                    }
                    break;
                case 37 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:623:3: 'this'
                    {
                    match("this"); if (state.failed) return ;


                    }
                    break;
                case 38 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:623:12: 'throw'
                    {
                    match("throw"); if (state.failed) return ;


                    }
                    break;
                case 39 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:623:22: 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 40 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:623:31: 'try'
                    {
                    match("try"); if (state.failed) return ;


                    }
                    break;
                case 41 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:623:39: 'using'
                    {
                    match("using"); if (state.failed) return ;


                    }
                    break;
                case 42 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:623:49: 'virtual'
                    {
                    match("virtual"); if (state.failed) return ;


                    }
                    break;
                case 43 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:623:61: 'volatile'
                    {
                    match("volatile"); if (state.failed) return ;


                    }
                    break;
                case 44 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:623:74: 'void'
                    {
                    match("void"); if (state.failed) return ;


                    }
                    break;
                case 45 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:624:3: 'while'
                    {
                    match("while"); if (state.failed) return ;


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD"

    // $ANTLR start "CP_EQUALITY"
    public final void mCP_EQUALITY() throws RecognitionException {
        try {
            int _type = CP_EQUALITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:628:13: ( '===' | '!==' | '==' | '!=' )
            int alt22=4;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='=') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='=') ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3=='=') ) {
                        alt22=1;
                    }
                    else {
                        alt22=3;}
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA22_0=='!') ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2=='=') ) {
                    int LA22_4 = input.LA(3);

                    if ( (LA22_4=='=') ) {
                        alt22=2;
                    }
                    else {
                        alt22=4;}
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:628:14: '==='
                    {
                    match("==="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:628:22: '!=='
                    {
                    match("!=="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:628:30: '=='
                    {
                    match("=="); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:628:37: '!='
                    {
                    match("!="); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CP_EQUALITY"

    // $ANTLR start "CP_COMPARATORS"
    public final void mCP_COMPARATORS() throws RecognitionException {
        try {
            int _type = CP_COMPARATORS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:629:17: ( '<=' | '>=' | '<=>' | '<' | '>' )
            int alt23=5;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='<') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='=') ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3=='>') ) {
                        alt23=3;
                    }
                    else {
                        alt23=1;}
                }
                else {
                    alt23=4;}
            }
            else if ( (LA23_0=='>') ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2=='=') ) {
                    alt23=2;
                }
                else {
                    alt23=5;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:629:18: '<='
                    {
                    match("<="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:629:25: '>='
                    {
                    match(">="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:629:32: '<=>'
                    {
                    match("<=>"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:629:40: '<'
                    {
                    match('<'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:629:46: '>'
                    {
                    match('>'); if (state.failed) return ;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CP_COMPARATORS"

    // $ANTLR start "AS_ASSIGN_OP"
    public final void mAS_ASSIGN_OP() throws RecognitionException {
        try {
            int _type = AS_ASSIGN_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:630:14: ( '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
            int alt24=10;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt24=1;
                }
                break;
            case '/':
                {
                alt24=2;
                }
                break;
            case '%':
                {
                alt24=3;
                }
                break;
            case '+':
                {
                alt24=4;
                }
                break;
            case '-':
                {
                alt24=5;
                }
                break;
            case '<':
                {
                alt24=6;
                }
                break;
            case '>':
                {
                alt24=7;
                }
                break;
            case '&':
                {
                alt24=8;
                }
                break;
            case '^':
                {
                alt24=9;
                }
                break;
            case '|':
                {
                alt24=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:630:15: '*='
                    {
                    match("*="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:630:22: '/='
                    {
                    match("/="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:630:29: '%='
                    {
                    match("%="); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:630:36: '+='
                    {
                    match("+="); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:630:43: '-='
                    {
                    match("-="); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:630:50: '<<='
                    {
                    match("<<="); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:630:58: '>>='
                    {
                    match(">>="); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:630:66: '&='
                    {
                    match("&="); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:630:73: '^='
                    {
                    match("^="); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:630:80: '|='
                    {
                    match("|="); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS_ASSIGN_OP"

    // $ANTLR start "LIST_TYPE"
    public final void mLIST_TYPE() throws RecognitionException {
        try {
            int _type = LIST_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:631:11: ( '[]' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:631:12: '[]'
            {
            match("[]"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIST_TYPE"

    // $ANTLR start "OP_SAFEDYN_CALL"
    public final void mOP_SAFEDYN_CALL() throws RecognitionException {
        try {
            int _type = OP_SAFEDYN_CALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:632:17: ( '?->' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:632:18: '?->'
            {
            match("?->"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_SAFEDYN_CALL"

    // $ANTLR start "OP_ARROW"
    public final void mOP_ARROW() throws RecognitionException {
        try {
            int _type = OP_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:633:10: ( '->' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:633:11: '->'
            {
            match("->"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_ARROW"

    // $ANTLR start "OP_SAFE_CALL"
    public final void mOP_SAFE_CALL() throws RecognitionException {
        try {
            int _type = OP_SAFE_CALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:634:14: ( '?.' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:634:15: '?.'
            {
            match("?."); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_SAFE_CALL"

    // $ANTLR start "OP_RANG_EXCL_OLD"
    public final void mOP_RANG_EXCL_OLD() throws RecognitionException {
        try {
            int _type = OP_RANG_EXCL_OLD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:635:17: ( '...' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:635:18: '...'
            {
            match("..."); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_RANG_EXCL_OLD"

    // $ANTLR start "OP_RANGE_EXCL"
    public final void mOP_RANGE_EXCL() throws RecognitionException {
        try {
            int _type = OP_RANGE_EXCL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:636:15: ( '..<' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:636:16: '..<'
            {
            match("..<"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_RANGE_EXCL"

    // $ANTLR start "OP_RANGE"
    public final void mOP_RANGE() throws RecognitionException {
        try {
            int _type = OP_RANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:637:10: ( '..' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:637:11: '..'
            {
            match(".."); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_RANGE"

    // $ANTLR start "OP_ELVIS"
    public final void mOP_ELVIS() throws RecognitionException {
        try {
            int _type = OP_ELVIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:638:10: ( '?:' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:638:11: '?:'
            {
            match("?:"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_ELVIS"

    // $ANTLR start "SP_COLCOL"
    public final void mSP_COLCOL() throws RecognitionException {
        try {
            int _type = SP_COLCOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:639:11: ( '::' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:639:12: '::'
            {
            match("::"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SP_COLCOL"

    // $ANTLR start "BRACKET_L"
    public final void mBRACKET_L() throws RecognitionException {
        try {
            int _type = BRACKET_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:640:11: ( '{' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:640:12: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BRACKET_L"

    // $ANTLR start "BRACKET_R"
    public final void mBRACKET_R() throws RecognitionException {
        try {
            int _type = BRACKET_R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:641:11: ( '}' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:641:12: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BRACKET_R"

    // $ANTLR start "SQ_BRACKET_L"
    public final void mSQ_BRACKET_L() throws RecognitionException {
        try {
            int _type = SQ_BRACKET_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:642:14: ( '[' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:642:15: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQ_BRACKET_L"

    // $ANTLR start "SQ_BRACKET_R"
    public final void mSQ_BRACKET_R() throws RecognitionException {
        try {
            int _type = SQ_BRACKET_R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:643:14: ( ']' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:643:15: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQ_BRACKET_R"

    // $ANTLR start "PAR_L"
    public final void mPAR_L() throws RecognitionException {
        try {
            int _type = PAR_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:644:8: ( '(' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:644:9: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAR_L"

    // $ANTLR start "PAR_R"
    public final void mPAR_R() throws RecognitionException {
        try {
            int _type = PAR_R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:645:8: ( ')' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:645:9: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAR_R"

    // $ANTLR start "SP_COLON"
    public final void mSP_COLON() throws RecognitionException {
        try {
            int _type = SP_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:646:10: ( ':' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:646:11: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SP_COLON"

    // $ANTLR start "SP_SEMI"
    public final void mSP_SEMI() throws RecognitionException {
        try {
            int _type = SP_SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:647:10: ( ';' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:647:11: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SP_SEMI"

    // $ANTLR start "SP_COMMA"
    public final void mSP_COMMA() throws RecognitionException {
        try {
            int _type = SP_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:648:10: ( ',' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:648:11: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SP_COMMA"

    // $ANTLR start "SP_PIPE"
    public final void mSP_PIPE() throws RecognitionException {
        try {
            int _type = SP_PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:649:10: ( '|' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:649:11: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SP_PIPE"

    // $ANTLR start "AS_INIT_VAL"
    public final void mAS_INIT_VAL() throws RecognitionException {
        try {
            int _type = AS_INIT_VAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:650:13: ( ':=' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:650:14: ':='
            {
            match(":="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS_INIT_VAL"

    // $ANTLR start "SP_QMARK"
    public final void mSP_QMARK() throws RecognitionException {
        try {
            int _type = SP_QMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:651:10: ( '?' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:651:11: '?'
            {
            match('?'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SP_QMARK"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:652:5: ( '@' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:652:6: '@'
            {
            match('@'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "OP_POUND"
    public final void mOP_POUND() throws RecognitionException {
        try {
            int _type = OP_POUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:653:10: ( '#' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:653:11: '#'
            {
            match('#'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_POUND"

    // $ANTLR start "OP_CURRY"
    public final void mOP_CURRY() throws RecognitionException {
        try {
            int _type = OP_CURRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:654:10: ( '&' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:654:11: '&'
            {
            match('&'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_CURRY"

    // $ANTLR start "AS_EQUAL"
    public final void mAS_EQUAL() throws RecognitionException {
        try {
            int _type = AS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:655:10: ( '=' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:655:11: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS_EQUAL"

    // $ANTLR start "OP_BITOR"
    public final void mOP_BITOR() throws RecognitionException {
        try {
            int _type = OP_BITOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:656:10: ( '^' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:656:11: '^'
            {
            match('^'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_BITOR"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:657:12: ( '_' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:657:13: '_'
            {
            match('_'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "OP_AND"
    public final void mOP_AND() throws RecognitionException {
        try {
            int _type = OP_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:658:9: ( '&&' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:658:10: '&&'
            {
            match("&&"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_AND"

    // $ANTLR start "OP_OR"
    public final void mOP_OR() throws RecognitionException {
        try {
            int _type = OP_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:659:8: ( '||' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:659:9: '||'
            {
            match("||"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_OR"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:660:6: ( '.' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:660:7: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "OP_2PLUS"
    public final void mOP_2PLUS() throws RecognitionException {
        try {
            int _type = OP_2PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:661:10: ( '++' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:661:11: '++'
            {
            match("++"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_2PLUS"

    // $ANTLR start "OP_2MINUS"
    public final void mOP_2MINUS() throws RecognitionException {
        try {
            int _type = OP_2MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:662:11: ( '--' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:662:12: '--'
            {
            match("--"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_2MINUS"

    // $ANTLR start "OP_MINUS"
    public final void mOP_MINUS() throws RecognitionException {
        try {
            int _type = OP_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:663:10: ( '-' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:663:11: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_MINUS"

    // $ANTLR start "OP_PLUS"
    public final void mOP_PLUS() throws RecognitionException {
        try {
            int _type = OP_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:664:10: ( '+' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:664:11: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_PLUS"

    // $ANTLR start "OP_LSHIFT"
    public final void mOP_LSHIFT() throws RecognitionException {
        try {
            int _type = OP_LSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:665:11: ( '<<' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:665:12: '<<'
            {
            match("<<"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_LSHIFT"

    // $ANTLR start "OP_RSHIFT"
    public final void mOP_RSHIFT() throws RecognitionException {
        try {
            int _type = OP_RSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:666:11: ( '>>' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:666:12: '>>'
            {
            match(">>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_RSHIFT"

    // $ANTLR start "OP_MULTI"
    public final void mOP_MULTI() throws RecognitionException {
        try {
            int _type = OP_MULTI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:667:10: ( '*' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:667:11: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_MULTI"

    // $ANTLR start "OP_DIV"
    public final void mOP_DIV() throws RecognitionException {
        try {
            int _type = OP_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:668:9: ( '/' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:668:10: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_DIV"

    // $ANTLR start "OP_MOD"
    public final void mOP_MOD() throws RecognitionException {
        try {
            int _type = OP_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:669:9: ( '%' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:669:10: '%'
            {
            match('%'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_MOD"

    // $ANTLR start "OP_BANG"
    public final void mOP_BANG() throws RecognitionException {
        try {
            int _type = OP_BANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:670:10: ( '!' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:670:11: '!'
            {
            match('!'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_BANG"

    // $ANTLR start "OP_TILDA"
    public final void mOP_TILDA() throws RecognitionException {
        try {
            int _type = OP_TILDA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:671:10: ( '~' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:671:11: '~'
            {
            match('~'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP_TILDA"

    // $ANTLR start "HEX_HEADER"
    public final void mHEX_HEADER() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:676:21: ( '0x' | '0X' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='0') ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1=='x') ) {
                    alt25=1;
                }
                else if ( (LA25_1=='X') ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:676:24: '0x'
                    {
                    match("0x"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:676:31: '0X'
                    {
                    match("0X"); if (state.failed) return ;


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "HEX_HEADER"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:678:10: ( ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:678:13: ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:678:13: ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL )
            int alt26=3;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:678:14: ( HEXNB )=> HEXNB
                    {
                    mHEXNB(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:678:31: ( DECIMAL )=> DECIMAL
                    {
                    mDECIMAL(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:678:52: FRACTIONAL
                    {
                    mFRACTIONAL(); if (state.failed) return ;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "HEXNB"
    public final void mHEXNB() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:679:17: ( HEXHEADER ( ( UNDERSCORE )* ( DIGIT | HEXLETTER ) )+ )
            // src/net/colar/netbeans/fan/antlr/Fan.g:679:19: HEXHEADER ( ( UNDERSCORE )* ( DIGIT | HEXLETTER ) )+
            {
            mHEXHEADER(); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:679:29: ( ( UNDERSCORE )* ( DIGIT | HEXLETTER ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='0' && LA28_0<='9')||(LA28_0>='A' && LA28_0<='F')||LA28_0=='_'||(LA28_0>='a' && LA28_0<='f')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:679:30: ( UNDERSCORE )* ( DIGIT | HEXLETTER )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:679:30: ( UNDERSCORE )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0=='_') ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // src/net/colar/netbeans/fan/antlr/Fan.g:679:30: UNDERSCORE
            	    	    {
            	    	    mUNDERSCORE(); if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);

            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEXNB"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:680:18: ( DIGIT ( ( UNDERSCORE )* DIGIT )* ( ( FRACTION )=> FRACTION )? ( ( EXPONENT )=> EXPONENT )? ( NBTYPE )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:680:20: DIGIT ( ( UNDERSCORE )* DIGIT )* ( ( FRACTION )=> FRACTION )? ( ( EXPONENT )=> EXPONENT )? ( NBTYPE )?
            {
            mDIGIT(); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:680:26: ( ( UNDERSCORE )* DIGIT )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='0' && LA30_0<='9')||LA30_0=='_') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:680:27: ( UNDERSCORE )* DIGIT
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:680:27: ( UNDERSCORE )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0=='_') ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // src/net/colar/netbeans/fan/antlr/Fan.g:680:27: UNDERSCORE
            	    	    {
            	    	    mUNDERSCORE(); if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);

            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:680:47: ( ( FRACTION )=> FRACTION )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='.') && (synpred8_Fan())) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:680:48: ( FRACTION )=> FRACTION
                    {
                    mFRACTION(); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:681:6: ( ( EXPONENT )=> EXPONENT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='E'||LA32_0=='e') && (synpred9_Fan())) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:681:7: ( EXPONENT )=> EXPONENT
                    {
                    mEXPONENT(); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:681:30: ( NBTYPE )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='D'||LA33_0=='F'||LA33_0=='d'||LA33_0=='f'||LA33_0=='h'||(LA33_0>='m' && LA33_0<='n')||LA33_0=='s') ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:681:30: NBTYPE
                    {
                    mNBTYPE(); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "FRACTIONAL"
    public final void mFRACTIONAL() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:682:21: ( FRACTION ( EXPONENT )? ( NBTYPE )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:682:23: FRACTION ( EXPONENT )? ( NBTYPE )?
            {
            mFRACTION(); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:682:32: ( EXPONENT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='E'||LA34_0=='e') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:682:32: EXPONENT
                    {
                    mEXPONENT(); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:682:42: ( NBTYPE )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='D'||LA35_0=='F'||LA35_0=='d'||LA35_0=='f'||LA35_0=='h'||(LA35_0>='m' && LA35_0<='n')||LA35_0=='s') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:682:42: NBTYPE
                    {
                    mNBTYPE(); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "FRACTIONAL"

    // $ANTLR start "FRACTION"
    public final void mFRACTION() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:683:19: ( DOT DIGIT ( ( UNDERSCORE )* DIGIT )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:683:21: DOT DIGIT ( ( UNDERSCORE )* DIGIT )*
            {
            mDOT(); if (state.failed) return ;
            mDIGIT(); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:683:31: ( ( UNDERSCORE )* DIGIT )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='0' && LA37_0<='9')||LA37_0=='_') ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:683:32: ( UNDERSCORE )* DIGIT
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:683:32: ( UNDERSCORE )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0=='_') ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // src/net/colar/netbeans/fan/antlr/Fan.g:683:32: UNDERSCORE
            	    	    {
            	    	    mUNDERSCORE(); if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop36;
            	        }
            	    } while (true);

            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "FRACTION"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:684:19: ( ( 'e' | 'E' ) ( '+' | OP_MINUS )? DIGIT ( ( UNDERSCORE )* DIGIT )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:684:21: ( 'e' | 'E' ) ( '+' | OP_MINUS )? DIGIT ( ( UNDERSCORE )* DIGIT )*
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // src/net/colar/netbeans/fan/antlr/Fan.g:684:31: ( '+' | OP_MINUS )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='+'||LA38_0=='-') ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mDIGIT(); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:684:55: ( ( UNDERSCORE )* DIGIT )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>='0' && LA40_0<='9')||LA40_0=='_') ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:684:56: ( UNDERSCORE )* DIGIT
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:684:56: ( UNDERSCORE )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0=='_') ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // src/net/colar/netbeans/fan/antlr/Fan.g:684:56: UNDERSCORE
            	    	    {
            	    	    mUNDERSCORE(); if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop39;
            	        }
            	    } while (true);

            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "NBTYPE"
    public final void mNBTYPE() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:686:18: ( 'F' | 'f' | 'D' | ( 'd' ( 'ay' )? ) | 'ms' | 'ns' | 'sec' | 'min' | 'hr' )
            int alt42=9;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:686:20: 'F'
                    {
                    match('F'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:686:26: 'f'
                    {
                    match('f'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:686:32: 'D'
                    {
                    match('D'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:686:38: ( 'd' ( 'ay' )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:686:38: ( 'd' ( 'ay' )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:686:39: 'd' ( 'ay' )?
                    {
                    match('d'); if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:686:43: ( 'ay' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0=='a') ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:686:43: 'ay'
                            {
                            match("ay"); if (state.failed) return ;


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:686:52: 'ms'
                    {
                    match("ms"); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:686:59: 'ns'
                    {
                    match("ns"); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:687:6: 'sec'
                    {
                    match("sec"); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:687:14: 'min'
                    {
                    match("min"); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:687:22: 'hr'
                    {
                    match("hr"); if (state.failed) return ;


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "NBTYPE"

    // $ANTLR start "HEXLETTER"
    public final void mHEXLETTER() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:688:20: ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEXLETTER"

    // $ANTLR start "HEXHEADER"
    public final void mHEXHEADER() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:689:20: ( '0x' | '0X' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0=='0') ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1=='x') ) {
                    alt43=1;
                }
                else if ( (LA43_1=='X') ) {
                    alt43=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:689:23: '0x'
                    {
                    match("0x"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:689:30: '0X'
                    {
                    match("0X"); if (state.failed) return ;


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "HEXHEADER"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:692:6: ( ( ( UNDERSCORE )* LETTER ) ( LETTER | DIGIT | UNDERSCORE )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:692:8: ( ( UNDERSCORE )* LETTER ) ( LETTER | DIGIT | UNDERSCORE )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:692:8: ( ( UNDERSCORE )* LETTER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:692:9: ( UNDERSCORE )* LETTER
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:692:9: ( UNDERSCORE )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0=='_') ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:692:9: UNDERSCORE
            	    {
            	    mUNDERSCORE(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            mLETTER(); if (state.failed) return ;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:692:29: ( LETTER | DIGIT | UNDERSCORE )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>='0' && LA45_0<='9')||(LA45_0>='A' && LA45_0<='Z')||LA45_0=='_'||(LA45_0>='a' && LA45_0<='z')) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:694:18: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:694:20: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:695:17: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "INC_UNKNOWN_ITEM"
    public final void mINC_UNKNOWN_ITEM() throws RecognitionException {
        try {
            int _type = INC_UNKNOWN_ITEM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:698:18: ( . )
            // src/net/colar/netbeans/fan/antlr/Fan.g:698:20: .
            {
            matchAny(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INC_UNKNOWN_ITEM"

    public void mTokens() throws RecognitionException {
        // src/net/colar/netbeans/fan/antlr/Fan.g:1:8: ( KW_BREAK | KW_CONTINUE | KW_FOR | KW_IF | KW_RETURN | KW_SWITCH | KW_THROW | KW_WHILE | KW_TRY | KW_CASE | KW_DEFAULT | KW_CATCH | KW_FINALLY | KW_USING | KW_AS | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | KW_VOID | KW_CLASS | KW_ENUM | KW_MIXIN | KW_ABSTRACT | KW_PRIVATE | KW_PROTECTED | KW_PUBLIC | KW_INTERNAL | KW_NEW | KW_ONCE | KW_THIS | KW_SUPER | KW_ELSE | KW_IS | KW_ISNOT | KW_NULL | KW_IT | KW_TRUE | KW_FALSE | T__167 | LB | WS | LINE_COMMENT | EXEC_COMMENT | MULTI_COMMENT | DSL | CHAR | QUOTSTR | STR | URI | DOC | KEYWORD | CP_EQUALITY | CP_COMPARATORS | AS_ASSIGN_OP | LIST_TYPE | OP_SAFEDYN_CALL | OP_ARROW | OP_SAFE_CALL | OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE | OP_ELVIS | SP_COLCOL | BRACKET_L | BRACKET_R | SQ_BRACKET_L | SQ_BRACKET_R | PAR_L | PAR_R | SP_COLON | SP_SEMI | SP_COMMA | SP_PIPE | AS_INIT_VAL | SP_QMARK | AT | OP_POUND | OP_CURRY | AS_EQUAL | OP_BITOR | UNDERSCORE | OP_AND | OP_OR | DOT | OP_2PLUS | OP_2MINUS | OP_MINUS | OP_PLUS | OP_LSHIFT | OP_RSHIFT | OP_MULTI | OP_DIV | OP_MOD | OP_BANG | OP_TILDA | NUMBER | ID | INC_UNKNOWN_ITEM )
        int alt46=103;
        alt46 = dfa46.predict(input);
        switch (alt46) {
            case 1 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:10: KW_BREAK
                {
                mKW_BREAK(); if (state.failed) return ;

                }
                break;
            case 2 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:19: KW_CONTINUE
                {
                mKW_CONTINUE(); if (state.failed) return ;

                }
                break;
            case 3 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:31: KW_FOR
                {
                mKW_FOR(); if (state.failed) return ;

                }
                break;
            case 4 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:38: KW_IF
                {
                mKW_IF(); if (state.failed) return ;

                }
                break;
            case 5 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:44: KW_RETURN
                {
                mKW_RETURN(); if (state.failed) return ;

                }
                break;
            case 6 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:54: KW_SWITCH
                {
                mKW_SWITCH(); if (state.failed) return ;

                }
                break;
            case 7 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:64: KW_THROW
                {
                mKW_THROW(); if (state.failed) return ;

                }
                break;
            case 8 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:73: KW_WHILE
                {
                mKW_WHILE(); if (state.failed) return ;

                }
                break;
            case 9 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:82: KW_TRY
                {
                mKW_TRY(); if (state.failed) return ;

                }
                break;
            case 10 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:89: KW_CASE
                {
                mKW_CASE(); if (state.failed) return ;

                }
                break;
            case 11 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:97: KW_DEFAULT
                {
                mKW_DEFAULT(); if (state.failed) return ;

                }
                break;
            case 12 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:108: KW_CATCH
                {
                mKW_CATCH(); if (state.failed) return ;

                }
                break;
            case 13 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:117: KW_FINALLY
                {
                mKW_FINALLY(); if (state.failed) return ;

                }
                break;
            case 14 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:128: KW_USING
                {
                mKW_USING(); if (state.failed) return ;

                }
                break;
            case 15 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:137: KW_AS
                {
                mKW_AS(); if (state.failed) return ;

                }
                break;
            case 16 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:143: KW_RD_ONLY
                {
                mKW_RD_ONLY(); if (state.failed) return ;

                }
                break;
            case 17 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:154: KW_CONST
                {
                mKW_CONST(); if (state.failed) return ;

                }
                break;
            case 18 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:163: KW_STATIC
                {
                mKW_STATIC(); if (state.failed) return ;

                }
                break;
            case 19 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:173: KW_NATIVE
                {
                mKW_NATIVE(); if (state.failed) return ;

                }
                break;
            case 20 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:183: KW_VOLATILE
                {
                mKW_VOLATILE(); if (state.failed) return ;

                }
                break;
            case 21 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:195: KW_OVERRIDE
                {
                mKW_OVERRIDE(); if (state.failed) return ;

                }
                break;
            case 22 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:207: KW_VIRTUAL
                {
                mKW_VIRTUAL(); if (state.failed) return ;

                }
                break;
            case 23 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:218: KW_FINAL
                {
                mKW_FINAL(); if (state.failed) return ;

                }
                break;
            case 24 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:227: KW_VOID
                {
                mKW_VOID(); if (state.failed) return ;

                }
                break;
            case 25 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:235: KW_CLASS
                {
                mKW_CLASS(); if (state.failed) return ;

                }
                break;
            case 26 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:244: KW_ENUM
                {
                mKW_ENUM(); if (state.failed) return ;

                }
                break;
            case 27 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:252: KW_MIXIN
                {
                mKW_MIXIN(); if (state.failed) return ;

                }
                break;
            case 28 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:261: KW_ABSTRACT
                {
                mKW_ABSTRACT(); if (state.failed) return ;

                }
                break;
            case 29 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:273: KW_PRIVATE
                {
                mKW_PRIVATE(); if (state.failed) return ;

                }
                break;
            case 30 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:284: KW_PROTECTED
                {
                mKW_PROTECTED(); if (state.failed) return ;

                }
                break;
            case 31 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:297: KW_PUBLIC
                {
                mKW_PUBLIC(); if (state.failed) return ;

                }
                break;
            case 32 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:307: KW_INTERNAL
                {
                mKW_INTERNAL(); if (state.failed) return ;

                }
                break;
            case 33 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:319: KW_NEW
                {
                mKW_NEW(); if (state.failed) return ;

                }
                break;
            case 34 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:326: KW_ONCE
                {
                mKW_ONCE(); if (state.failed) return ;

                }
                break;
            case 35 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:334: KW_THIS
                {
                mKW_THIS(); if (state.failed) return ;

                }
                break;
            case 36 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:342: KW_SUPER
                {
                mKW_SUPER(); if (state.failed) return ;

                }
                break;
            case 37 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:351: KW_ELSE
                {
                mKW_ELSE(); if (state.failed) return ;

                }
                break;
            case 38 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:359: KW_IS
                {
                mKW_IS(); if (state.failed) return ;

                }
                break;
            case 39 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:365: KW_ISNOT
                {
                mKW_ISNOT(); if (state.failed) return ;

                }
                break;
            case 40 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:374: KW_NULL
                {
                mKW_NULL(); if (state.failed) return ;

                }
                break;
            case 41 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:382: KW_IT
                {
                mKW_IT(); if (state.failed) return ;

                }
                break;
            case 42 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:388: KW_TRUE
                {
                mKW_TRUE(); if (state.failed) return ;

                }
                break;
            case 43 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:396: KW_FALSE
                {
                mKW_FALSE(); if (state.failed) return ;

                }
                break;
            case 44 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:405: T__167
                {
                mT__167(); if (state.failed) return ;

                }
                break;
            case 45 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:412: LB
                {
                mLB(); if (state.failed) return ;

                }
                break;
            case 46 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:415: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 47 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:418: LINE_COMMENT
                {
                mLINE_COMMENT(); if (state.failed) return ;

                }
                break;
            case 48 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:431: EXEC_COMMENT
                {
                mEXEC_COMMENT(); if (state.failed) return ;

                }
                break;
            case 49 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:444: MULTI_COMMENT
                {
                mMULTI_COMMENT(); if (state.failed) return ;

                }
                break;
            case 50 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:458: DSL
                {
                mDSL(); if (state.failed) return ;

                }
                break;
            case 51 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:462: CHAR
                {
                mCHAR(); if (state.failed) return ;

                }
                break;
            case 52 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:467: QUOTSTR
                {
                mQUOTSTR(); if (state.failed) return ;

                }
                break;
            case 53 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:475: STR
                {
                mSTR(); if (state.failed) return ;

                }
                break;
            case 54 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:479: URI
                {
                mURI(); if (state.failed) return ;

                }
                break;
            case 55 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:483: DOC
                {
                mDOC(); if (state.failed) return ;

                }
                break;
            case 56 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:487: KEYWORD
                {
                mKEYWORD(); if (state.failed) return ;

                }
                break;
            case 57 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:495: CP_EQUALITY
                {
                mCP_EQUALITY(); if (state.failed) return ;

                }
                break;
            case 58 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:507: CP_COMPARATORS
                {
                mCP_COMPARATORS(); if (state.failed) return ;

                }
                break;
            case 59 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:522: AS_ASSIGN_OP
                {
                mAS_ASSIGN_OP(); if (state.failed) return ;

                }
                break;
            case 60 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:535: LIST_TYPE
                {
                mLIST_TYPE(); if (state.failed) return ;

                }
                break;
            case 61 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:545: OP_SAFEDYN_CALL
                {
                mOP_SAFEDYN_CALL(); if (state.failed) return ;

                }
                break;
            case 62 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:561: OP_ARROW
                {
                mOP_ARROW(); if (state.failed) return ;

                }
                break;
            case 63 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:570: OP_SAFE_CALL
                {
                mOP_SAFE_CALL(); if (state.failed) return ;

                }
                break;
            case 64 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:583: OP_RANG_EXCL_OLD
                {
                mOP_RANG_EXCL_OLD(); if (state.failed) return ;

                }
                break;
            case 65 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:600: OP_RANGE_EXCL
                {
                mOP_RANGE_EXCL(); if (state.failed) return ;

                }
                break;
            case 66 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:614: OP_RANGE
                {
                mOP_RANGE(); if (state.failed) return ;

                }
                break;
            case 67 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:623: OP_ELVIS
                {
                mOP_ELVIS(); if (state.failed) return ;

                }
                break;
            case 68 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:632: SP_COLCOL
                {
                mSP_COLCOL(); if (state.failed) return ;

                }
                break;
            case 69 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:642: BRACKET_L
                {
                mBRACKET_L(); if (state.failed) return ;

                }
                break;
            case 70 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:652: BRACKET_R
                {
                mBRACKET_R(); if (state.failed) return ;

                }
                break;
            case 71 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:662: SQ_BRACKET_L
                {
                mSQ_BRACKET_L(); if (state.failed) return ;

                }
                break;
            case 72 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:675: SQ_BRACKET_R
                {
                mSQ_BRACKET_R(); if (state.failed) return ;

                }
                break;
            case 73 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:688: PAR_L
                {
                mPAR_L(); if (state.failed) return ;

                }
                break;
            case 74 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:694: PAR_R
                {
                mPAR_R(); if (state.failed) return ;

                }
                break;
            case 75 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:700: SP_COLON
                {
                mSP_COLON(); if (state.failed) return ;

                }
                break;
            case 76 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:709: SP_SEMI
                {
                mSP_SEMI(); if (state.failed) return ;

                }
                break;
            case 77 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:717: SP_COMMA
                {
                mSP_COMMA(); if (state.failed) return ;

                }
                break;
            case 78 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:726: SP_PIPE
                {
                mSP_PIPE(); if (state.failed) return ;

                }
                break;
            case 79 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:734: AS_INIT_VAL
                {
                mAS_INIT_VAL(); if (state.failed) return ;

                }
                break;
            case 80 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:746: SP_QMARK
                {
                mSP_QMARK(); if (state.failed) return ;

                }
                break;
            case 81 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:755: AT
                {
                mAT(); if (state.failed) return ;

                }
                break;
            case 82 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:758: OP_POUND
                {
                mOP_POUND(); if (state.failed) return ;

                }
                break;
            case 83 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:767: OP_CURRY
                {
                mOP_CURRY(); if (state.failed) return ;

                }
                break;
            case 84 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:776: AS_EQUAL
                {
                mAS_EQUAL(); if (state.failed) return ;

                }
                break;
            case 85 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:785: OP_BITOR
                {
                mOP_BITOR(); if (state.failed) return ;

                }
                break;
            case 86 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:794: UNDERSCORE
                {
                mUNDERSCORE(); if (state.failed) return ;

                }
                break;
            case 87 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:805: OP_AND
                {
                mOP_AND(); if (state.failed) return ;

                }
                break;
            case 88 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:812: OP_OR
                {
                mOP_OR(); if (state.failed) return ;

                }
                break;
            case 89 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:818: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 90 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:822: OP_2PLUS
                {
                mOP_2PLUS(); if (state.failed) return ;

                }
                break;
            case 91 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:831: OP_2MINUS
                {
                mOP_2MINUS(); if (state.failed) return ;

                }
                break;
            case 92 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:841: OP_MINUS
                {
                mOP_MINUS(); if (state.failed) return ;

                }
                break;
            case 93 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:850: OP_PLUS
                {
                mOP_PLUS(); if (state.failed) return ;

                }
                break;
            case 94 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:858: OP_LSHIFT
                {
                mOP_LSHIFT(); if (state.failed) return ;

                }
                break;
            case 95 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:868: OP_RSHIFT
                {
                mOP_RSHIFT(); if (state.failed) return ;

                }
                break;
            case 96 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:878: OP_MULTI
                {
                mOP_MULTI(); if (state.failed) return ;

                }
                break;
            case 97 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:887: OP_DIV
                {
                mOP_DIV(); if (state.failed) return ;

                }
                break;
            case 98 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:894: OP_MOD
                {
                mOP_MOD(); if (state.failed) return ;

                }
                break;
            case 99 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:901: OP_BANG
                {
                mOP_BANG(); if (state.failed) return ;

                }
                break;
            case 100 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:909: OP_TILDA
                {
                mOP_TILDA(); if (state.failed) return ;

                }
                break;
            case 101 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:918: NUMBER
                {
                mNUMBER(); if (state.failed) return ;

                }
                break;
            case 102 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:925: ID
                {
                mID(); if (state.failed) return ;

                }
                break;
            case 103 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:928: INC_UNKNOWN_ITEM
                {
                mINC_UNKNOWN_ITEM(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Fan
    public final void synpred1_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:592:23: ( COMPL_ML_COMMENT )
        // src/net/colar/netbeans/fan/antlr/Fan.g:592:24: COMPL_ML_COMMENT
        {
        mCOMPL_ML_COMMENT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Fan

    // $ANTLR start synpred2_Fan
    public final void synpred2_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:596:13: ( COMPL_DSL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:596:14: COMPL_DSL
        {
        mCOMPL_DSL(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Fan

    // $ANTLR start synpred3_Fan
    public final void synpred3_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:603:19: ( COMPL_QSTR )
        // src/net/colar/netbeans/fan/antlr/Fan.g:603:20: COMPL_QSTR
        {
        mCOMPL_QSTR(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Fan

    // $ANTLR start synpred4_Fan
    public final void synpred4_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:606:13: ( COMPL_STR )
        // src/net/colar/netbeans/fan/antlr/Fan.g:606:14: COMPL_STR
        {
        mCOMPL_STR(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Fan

    // $ANTLR start synpred5_Fan
    public final void synpred5_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:609:14: ( COMPL_URI )
        // src/net/colar/netbeans/fan/antlr/Fan.g:609:15: COMPL_URI
        {
        mCOMPL_URI(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Fan

    // $ANTLR start synpred6_Fan
    public final void synpred6_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:678:14: ( HEXNB )
        // src/net/colar/netbeans/fan/antlr/Fan.g:678:15: HEXNB
        {
        mHEXNB(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Fan

    // $ANTLR start synpred7_Fan
    public final void synpred7_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:678:31: ( DECIMAL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:678:32: DECIMAL
        {
        mDECIMAL(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_Fan

    // $ANTLR start synpred8_Fan
    public final void synpred8_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:680:48: ( FRACTION )
        // src/net/colar/netbeans/fan/antlr/Fan.g:680:49: FRACTION
        {
        mFRACTION(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_Fan

    // $ANTLR start synpred9_Fan
    public final void synpred9_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:681:7: ( EXPONENT )
        // src/net/colar/netbeans/fan/antlr/Fan.g:681:8: EXPONENT
        {
        mEXPONENT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Fan

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
    public final boolean synpred4_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Fan_fragment(); // can never throw exception
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
    public final boolean synpred3_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Fan_fragment(); // can never throw exception
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
    public final boolean synpred5_Fan() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Fan_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA5_eotS =
        "\3\4\3\uffff";
    static final String DFA5_eofS =
        "\6\uffff";
    static final String DFA5_minS =
        "\3\0\2\uffff\1\0";
    static final String DFA5_maxS =
        "\3\uffff\2\uffff\1\0";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA5_specialS =
        "\1\1\1\3\1\2\2\uffff\1\0}>";
    static final String[] DFA5_transitionS = {
            "\12\2\1\3\37\2\1\1\uffd5\2",
            "\12\2\1\3\37\2\1\1\4\2\1\5\uffd0\2",
            "\12\2\1\3\37\2\1\1\uffd5\2",
            "",
            "",
            "\1\uffff"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "592:22: ( ( COMPL_ML_COMMENT )=> COMPL_ML_COMMENT | (~ '\\n' )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_5 = input.LA(1);

                         
                        int index5_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Fan()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index5_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_0 = input.LA(1);

                         
                        int index5_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_0=='*') ) {s = 1;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {s = 2;}

                        else if ( (LA5_0=='\n') && (synpred1_Fan())) {s = 3;}

                        else s = 4;

                         
                        input.seek(index5_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_2 = input.LA(1);

                         
                        int index5_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_2=='*') ) {s = 1;}

                        else if ( ((LA5_2>='\u0000' && LA5_2<='\t')||(LA5_2>='\u000B' && LA5_2<=')')||(LA5_2>='+' && LA5_2<='\uFFFF')) ) {s = 2;}

                        else if ( (LA5_2=='\n') && (synpred1_Fan())) {s = 3;}

                        else s = 4;

                         
                        input.seek(index5_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_1 = input.LA(1);

                         
                        int index5_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_1=='/') ) {s = 5;}

                        else if ( (LA5_1=='*') ) {s = 1;}

                        else if ( ((LA5_1>='\u0000' && LA5_1<='\t')||(LA5_1>='\u000B' && LA5_1<=')')||(LA5_1>='+' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {s = 2;}

                        else if ( (LA5_1=='\n') && (synpred1_Fan())) {s = 3;}

                        else s = 4;

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA8_eotS =
        "\3\4\3\uffff";
    static final String DFA8_eofS =
        "\6\uffff";
    static final String DFA8_minS =
        "\3\0\2\uffff\1\0";
    static final String DFA8_maxS =
        "\3\uffff\2\uffff\1\0";
    static final String DFA8_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA8_specialS =
        "\1\1\1\3\1\0\2\uffff\1\2}>";
    static final String[] DFA8_transitionS = {
            "\12\2\1\3\161\2\1\1\uff83\2",
            "\12\2\1\3\63\2\1\5\75\2\1\1\uff83\2",
            "\12\2\1\3\161\2\1\1\uff83\2",
            "",
            "",
            "\1\uffff"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "596:12: ( ( COMPL_DSL )=> COMPL_DSL | (~ '\\n' )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_2=='|') ) {s = 1;}

                        else if ( ((LA8_2>='\u0000' && LA8_2<='\t')||(LA8_2>='\u000B' && LA8_2<='{')||(LA8_2>='}' && LA8_2<='\uFFFF')) ) {s = 2;}

                        else if ( (LA8_2=='\n') && (synpred2_Fan())) {s = 3;}

                        else s = 4;

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_0 = input.LA(1);

                         
                        int index8_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_0=='|') ) {s = 1;}

                        else if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='{')||(LA8_0>='}' && LA8_0<='\uFFFF')) ) {s = 2;}

                        else if ( (LA8_0=='\n') && (synpred2_Fan())) {s = 3;}

                        else s = 4;

                         
                        input.seek(index8_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Fan()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_1=='>') ) {s = 5;}

                        else if ( (LA8_1=='|') ) {s = 1;}

                        else if ( ((LA8_1>='\u0000' && LA8_1<='\t')||(LA8_1>='\u000B' && LA8_1<='=')||(LA8_1>='?' && LA8_1<='{')||(LA8_1>='}' && LA8_1<='\uFFFF')) ) {s = 2;}

                        else if ( (LA8_1=='\n') && (synpred2_Fan())) {s = 3;}

                        else s = 4;

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\3\4\2\uffff\1\4\1\uffff";
    static final String DFA12_eofS =
        "\7\uffff";
    static final String DFA12_minS =
        "\3\0\2\uffff\2\0";
    static final String DFA12_maxS =
        "\3\uffff\2\uffff\1\uffff\1\0";
    static final String DFA12_acceptS =
        "\3\uffff\1\1\1\2\2\uffff";
    static final String DFA12_specialS =
        "\1\4\1\1\1\0\2\uffff\1\3\1\2}>";
    static final String[] DFA12_transitionS = {
            "\12\2\1\3\27\2\1\1\uffdd\2",
            "\12\2\1\3\27\2\1\5\uffdd\2",
            "\12\2\1\3\27\2\1\1\uffdd\2",
            "",
            "",
            "\12\2\1\3\27\2\1\6\uffdd\2",
            "\1\uffff"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "603:18: ( ( COMPL_QSTR )=> COMPL_QSTR | (~ '\\n' )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_2=='\"') ) {s = 1;}

                        else if ( ((LA12_2>='\u0000' && LA12_2<='\t')||(LA12_2>='\u000B' && LA12_2<='!')||(LA12_2>='#' && LA12_2<='\uFFFF')) ) {s = 2;}

                        else if ( (LA12_2=='\n') && (synpred3_Fan())) {s = 3;}

                        else s = 4;

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_1=='\"') ) {s = 5;}

                        else if ( ((LA12_1>='\u0000' && LA12_1<='\t')||(LA12_1>='\u000B' && LA12_1<='!')||(LA12_1>='#' && LA12_1<='\uFFFF')) ) {s = 2;}

                        else if ( (LA12_1=='\n') && (synpred3_Fan())) {s = 3;}

                        else s = 4;

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Fan()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_5=='\"') ) {s = 6;}

                        else if ( ((LA12_5>='\u0000' && LA12_5<='\t')||(LA12_5>='\u000B' && LA12_5<='!')||(LA12_5>='#' && LA12_5<='\uFFFF')) ) {s = 2;}

                        else if ( (LA12_5=='\n') && (synpred3_Fan())) {s = 3;}

                        else s = 4;

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_0 = input.LA(1);

                         
                        int index12_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_0=='\"') ) {s = 1;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='\uFFFF')) ) {s = 2;}

                        else if ( (LA12_0=='\n') && (synpred3_Fan())) {s = 3;}

                        else s = 4;

                         
                        input.seek(index12_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\3\5\3\uffff\1\5\1\uffff";
    static final String DFA15_eofS =
        "\10\uffff";
    static final String DFA15_minS =
        "\4\0\2\uffff\2\0";
    static final String DFA15_maxS =
        "\3\uffff\1\0\2\uffff\1\uffff\1\0";
    static final String DFA15_acceptS =
        "\4\uffff\1\1\1\2\2\uffff";
    static final String DFA15_specialS =
        "\1\2\1\5\1\1\1\3\2\uffff\1\4\1\0}>";
    static final String[] DFA15_transitionS = {
            "\12\2\1\4\27\2\1\3\71\2\1\1\uffa3\2",
            "\12\2\1\4\27\2\1\7\71\2\1\6\uffa3\2",
            "\12\2\1\4\27\2\1\3\71\2\1\1\uffa3\2",
            "\1\uffff",
            "",
            "",
            "\12\2\1\4\27\2\1\7\71\2\1\6\uffa3\2",
            "\1\uffff"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "606:12: ( ( COMPL_STR )=> COMPL_STR | (~ '\\n' )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Fan()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_2=='\"') ) {s = 3;}

                        else if ( (LA15_2=='\\') ) {s = 1;}

                        else if ( ((LA15_2>='\u0000' && LA15_2<='\t')||(LA15_2>='\u000B' && LA15_2<='!')||(LA15_2>='#' && LA15_2<='[')||(LA15_2>=']' && LA15_2<='\uFFFF')) ) {s = 2;}

                        else if ( (LA15_2=='\n') && (synpred4_Fan())) {s = 4;}

                        else s = 5;

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                         
                        int index15_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_0=='\\') ) {s = 1;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {s = 2;}

                        else if ( (LA15_0=='\"') ) {s = 3;}

                        else if ( (LA15_0=='\n') && (synpred4_Fan())) {s = 4;}

                        else s = 5;

                         
                        input.seek(index15_0);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Fan()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_6=='\\') ) {s = 6;}

                        else if ( (LA15_6=='\"') ) {s = 7;}

                        else if ( ((LA15_6>='\u0000' && LA15_6<='\t')||(LA15_6>='\u000B' && LA15_6<='!')||(LA15_6>='#' && LA15_6<='[')||(LA15_6>=']' && LA15_6<='\uFFFF')) ) {s = 2;}

                        else if ( (LA15_6=='\n') && (synpred4_Fan())) {s = 4;}

                        else s = 5;

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_1=='\\') ) {s = 6;}

                        else if ( (LA15_1=='\"') ) {s = 7;}

                        else if ( ((LA15_1>='\u0000' && LA15_1<='\t')||(LA15_1>='\u000B' && LA15_1<='!')||(LA15_1>='#' && LA15_1<='[')||(LA15_1>=']' && LA15_1<='\uFFFF')) ) {s = 2;}

                        else if ( (LA15_1=='\n') && (synpred4_Fan())) {s = 4;}

                        else s = 5;

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\3\5\3\uffff\1\5\1\uffff";
    static final String DFA18_eofS =
        "\10\uffff";
    static final String DFA18_minS =
        "\4\0\2\uffff\2\0";
    static final String DFA18_maxS =
        "\3\uffff\1\0\2\uffff\1\uffff\1\0";
    static final String DFA18_acceptS =
        "\4\uffff\1\1\1\2\2\uffff";
    static final String DFA18_specialS =
        "\1\0\1\5\1\3\1\2\2\uffff\1\1\1\4}>";
    static final String[] DFA18_transitionS = {
            "\12\2\1\4\121\2\1\1\3\2\1\3\uff9f\2",
            "\12\2\1\4\121\2\1\6\3\2\1\7\uff9f\2",
            "\12\2\1\4\121\2\1\1\3\2\1\3\uff9f\2",
            "\1\uffff",
            "",
            "",
            "\12\2\1\4\121\2\1\6\3\2\1\7\uff9f\2",
            "\1\uffff"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "609:13: ( ( COMPL_URI )=> COMPL_URI | (~ '\\n' )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_0=='\\') ) {s = 1;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='_')||(LA18_0>='a' && LA18_0<='\uFFFF')) ) {s = 2;}

                        else if ( (LA18_0=='`') ) {s = 3;}

                        else if ( (LA18_0=='\n') && (synpred5_Fan())) {s = 4;}

                        else s = 5;

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_6=='\\') ) {s = 6;}

                        else if ( (LA18_6=='`') ) {s = 7;}

                        else if ( ((LA18_6>='\u0000' && LA18_6<='\t')||(LA18_6>='\u000B' && LA18_6<='[')||(LA18_6>=']' && LA18_6<='_')||(LA18_6>='a' && LA18_6<='\uFFFF')) ) {s = 2;}

                        else if ( (LA18_6=='\n') && (synpred5_Fan())) {s = 4;}

                        else s = 5;

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Fan()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_2=='`') ) {s = 3;}

                        else if ( (LA18_2=='\\') ) {s = 1;}

                        else if ( ((LA18_2>='\u0000' && LA18_2<='\t')||(LA18_2>='\u000B' && LA18_2<='[')||(LA18_2>=']' && LA18_2<='_')||(LA18_2>='a' && LA18_2<='\uFFFF')) ) {s = 2;}

                        else if ( (LA18_2=='\n') && (synpred5_Fan())) {s = 4;}

                        else s = 5;

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Fan()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_1=='\\') ) {s = 6;}

                        else if ( (LA18_1=='`') ) {s = 7;}

                        else if ( ((LA18_1>='\u0000' && LA18_1<='\t')||(LA18_1>='\u000B' && LA18_1<='[')||(LA18_1>=']' && LA18_1<='_')||(LA18_1>='a' && LA18_1<='\uFFFF')) ) {s = 2;}

                        else if ( (LA18_1=='\n') && (synpred5_Fan())) {s = 4;}

                        else s = 5;

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\23\uffff\1\61\14\uffff\1\70\25\uffff\1\107\21\uffff\1\112\2\uffff";
    static final String DFA21_eofS =
        "\113\uffff";
    static final String DFA21_minS =
        "\1\141\1\142\1\uffff\1\141\1\145\1\154\1\141\1\146\1\uffff\1\141"+
        "\1\156\1\162\1\145\1\164\1\150\1\uffff\1\151\2\uffff\2\163\1\uffff"+
        "\1\156\5\uffff\1\156\1\162\2\uffff\1\156\5\uffff\1\151\1\uffff\1"+
        "\141\3\uffff\1\151\1\165\1\uffff\1\151\4\uffff\1\163\1\141\1\145"+
        "\16\uffff\1\154\2\uffff\1\154\2\uffff";
    static final String DFA21_maxS =
        "\1\167\1\163\1\uffff\2\157\1\156\1\157\1\163\1\uffff\1\165\1\166"+
        "\1\165\1\145\1\167\1\162\1\uffff\1\157\2\uffff\1\163\1\164\1\uffff"+
        "\1\156\5\uffff\1\156\1\162\2\uffff\1\156\5\uffff\1\157\1\uffff\1"+
        "\164\3\uffff\1\162\1\171\1\uffff\1\154\4\uffff\1\164\1\141\1\145"+
        "\16\uffff\1\154\2\uffff\1\154\2\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\4\5\uffff\1\27\6\uffff\1\51\1\uffff\1\55\1\1\2\uffff"+
        "\1\7\1\uffff\1\12\1\13\1\14\1\15\1\16\2\uffff\1\23\1\24\1\uffff"+
        "\1\30\1\31\1\32\1\33\1\34\1\uffff\1\37\1\uffff\1\42\1\43\1\44\2"+
        "\uffff\1\52\1\uffff\1\3\1\2\1\5\1\6\3\uffff\1\26\1\25\1\35\1\36"+
        "\1\40\1\41\1\45\1\46\1\47\1\50\1\53\1\54\1\10\1\11\1\uffff\1\22"+
        "\1\21\1\uffff\1\20\1\17";
    static final String DFA21_specialS =
        "\113\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\7\3\uffff\1\10\1\11\1\12"+
            "\1\13\1\uffff\1\14\1\15\1\16\1\17\1\20\1\21",
            "\1\22\20\uffff\1\23",
            "",
            "\1\24\12\uffff\1\25\2\uffff\1\26",
            "\1\27\11\uffff\1\30",
            "\1\31\1\uffff\1\32",
            "\1\33\7\uffff\1\34\5\uffff\1\35",
            "\1\36\7\uffff\1\37\4\uffff\1\40",
            "",
            "\1\41\3\uffff\1\42\17\uffff\1\43",
            "\1\44\7\uffff\1\45",
            "\1\46\2\uffff\1\47",
            "\1\50",
            "\1\51\1\52\1\uffff\1\53",
            "\1\54\11\uffff\1\55",
            "",
            "\1\56\5\uffff\1\57",
            "",
            "",
            "\1\60",
            "\1\62\1\63",
            "",
            "\1\64",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "",
            "",
            "\1\67",
            "",
            "",
            "",
            "",
            "",
            "\1\71\5\uffff\1\72",
            "",
            "\1\73\22\uffff\1\74",
            "",
            "",
            "",
            "\1\75\10\uffff\1\76",
            "\1\77\3\uffff\1\100",
            "",
            "\1\102\2\uffff\1\101",
            "",
            "",
            "",
            "",
            "\1\103\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "",
            "",
            "\1\111",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "618:12: ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' )";
        }
    }
    static final String DFA26_eotS =
        "\1\uffff\1\6\21\uffff";
    static final String DFA26_eofS =
        "\23\uffff";
    static final String DFA26_minS =
        "\2\56\21\uffff";
    static final String DFA26_maxS =
        "\1\71\1\170\21\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\1\3\2\1\15\2";
    static final String DFA26_specialS =
        "\1\1\1\0\21\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\3\1\uffff\1\1\11\2",
            "\1\11\1\uffff\12\10\12\uffff\1\15\1\12\1\13\21\uffff\1\5\6"+
            "\uffff\1\7\4\uffff\1\16\1\12\1\14\1\uffff\1\22\4\uffff\1\17"+
            "\1\20\4\uffff\1\21\4\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "678:13: ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_1=='x') && (synpred6_Fan())) {s = 4;}

                        else if ( (LA26_1=='X') && (synpred6_Fan())) {s = 5;}

                        else if ( (LA26_1=='_') && (synpred7_Fan())) {s = 7;}

                        else if ( ((LA26_1>='0' && LA26_1<='9')) && (synpred7_Fan())) {s = 8;}

                        else if ( (LA26_1=='.') && (synpred7_Fan())) {s = 9;}

                        else if ( (LA26_1=='E'||LA26_1=='e') && (synpred7_Fan())) {s = 10;}

                        else if ( (LA26_1=='F') && (synpred7_Fan())) {s = 11;}

                        else if ( (LA26_1=='f') && (synpred7_Fan())) {s = 12;}

                        else if ( (LA26_1=='D') && (synpred7_Fan())) {s = 13;}

                        else if ( (LA26_1=='d') && (synpred7_Fan())) {s = 14;}

                        else if ( (LA26_1=='m') && (synpred7_Fan())) {s = 15;}

                        else if ( (LA26_1=='n') && (synpred7_Fan())) {s = 16;}

                        else if ( (LA26_1=='s') && (synpred7_Fan())) {s = 17;}

                        else if ( (LA26_1=='h') && (synpred7_Fan())) {s = 18;}

                        else s = 6;

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0=='0') ) {s = 1;}

                        else if ( ((LA26_0>='1' && LA26_0<='9')) && (synpred7_Fan())) {s = 2;}

                        else if ( (LA26_0=='.') ) {s = 3;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\13\uffff";
    static final String DFA42_eofS =
        "\13\uffff";
    static final String DFA42_minS =
        "\1\104\4\uffff\1\151\5\uffff";
    static final String DFA42_maxS =
        "\1\163\4\uffff\1\163\5\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\11\1\5\1\10";
    static final String DFA42_specialS =
        "\13\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\3\1\uffff\1\1\35\uffff\1\4\1\uffff\1\2\1\uffff\1\10\4\uffff"+
            "\1\5\1\6\4\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\12\11\uffff\1\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "686:10: fragment NBTYPE : ( 'F' | 'f' | 'D' | ( 'd' ( 'ay' )? ) | 'ms' | 'ns' | 'sec' | 'min' | 'hr' );";
        }
    }
    static final String DFA46_eotS =
        "\1\uffff\21\71\1\uffff\1\67\2\uffff\1\142\1\144\1\146\1\67\1\152"+
        "\1\uffff\1\155\1\157\1\160\1\146\1\162\1\164\1\167\1\171\1\172\1"+
        "\174\1\176\1\u0082\1\u0084\1\u0088\10\uffff\1\u0091\5\uffff\1\71"+
        "\1\uffff\6\71\1\u009b\1\71\1\u009e\1\u009f\10\71\1\u00ab\1\71\1"+
        "\u00ae\15\71\13\uffff\1\u00be\1\uffff\1\152\7\uffff\1\u00c0\21\uffff"+
        "\1\u00c3\17\uffff\5\71\1\u00cb\2\71\1\uffff\2\71\2\uffff\7\71\1"+
        "\u00d7\3\71\1\uffff\2\71\1\uffff\2\71\1\u00df\14\71\1\uffff\1\u00ec"+
        "\4\uffff\3\71\1\u00f2\3\71\1\uffff\12\71\1\u0100\1\uffff\1\u0101"+
        "\6\71\1\uffff\1\u0108\1\71\1\u010a\2\71\1\u010d\1\u010e\1\u010f"+
        "\4\71\1\uffff\2\u00ec\1\u0115\1\71\1\u0117\1\uffff\1\u0118\1\u0119"+
        "\1\71\1\u011c\1\u011d\1\71\1\u011f\4\71\1\u0124\1\u00ab\2\uffff"+
        "\1\u0126\1\71\1\u0128\3\71\1\uffff\1\71\1\uffff\2\71\3\uffff\1\u012f"+
        "\3\71\1\u00ec\1\uffff\1\71\3\uffff\2\71\2\uffff\1\71\1\uffff\1\u0138"+
        "\1\71\1\u013a\1\u013b\3\uffff\1\71\1\uffff\1\u00ab\1\71\1\u013e"+
        "\3\71\1\uffff\2\71\1\u0144\1\u00ec\1\71\1\u00ab\1\u0146\1\71\1\uffff"+
        "\1\71\2\uffff\1\u0149\1\71\1\uffff\1\71\1\u014c\1\71\1\u014e\1\71"+
        "\1\uffff\1\u0150\1\uffff\1\u0151\1\u0152\1\uffff\1\u0153\1\u0154"+
        "\1\uffff\1\u0155\1\uffff\1\71\6\uffff\1\u0157\1\uffff";
    static final String DFA46_eofS =
        "\u0158\uffff";
    static final String DFA46_minS =
        "\1\0\1\162\2\141\1\146\1\145\1\164\2\150\1\145\1\163\1\142\1\141"+
        "\1\151\1\156\1\154\1\151\1\162\1\uffff\1\12\2\uffff\1\52\1\41\1"+
        "\74\1\0\1\42\1\uffff\1\52\2\75\1\76\1\75\1\53\1\55\1\46\2\75\1\135"+
        "\1\55\1\56\1\72\10\uffff\1\101\5\uffff\1\145\1\uffff\1\156\1\163"+
        "\1\141\1\162\1\156\1\154\1\60\1\164\2\60\1\141\1\151\1\141\1\160"+
        "\1\151\1\165\1\151\1\146\1\60\1\151\1\60\1\163\1\164\1\167\1\154"+
        "\1\151\1\162\1\145\1\143\1\165\1\163\1\170\1\151\1\142\13\uffff"+
        "\1\75\1\uffff\1\42\7\uffff\1\75\21\uffff\1\56\17\uffff\1\141\1\163"+
        "\1\145\1\143\1\163\1\60\1\141\1\163\1\uffff\1\145\1\157\2\uffff"+
        "\1\165\1\144\2\164\1\145\1\157\1\163\1\60\1\145\1\154\1\141\1\uffff"+
        "\1\156\1\145\1\uffff\1\164\1\151\1\60\1\154\1\141\1\144\1\164\1"+
        "\162\1\145\1\155\1\145\1\151\1\166\1\164\1\154\1\uffff\1\0\4\uffff"+
        "\1\153\1\151\1\164\1\60\1\150\1\163\1\141\1\uffff\1\154\1\145\1"+
        "\162\1\164\1\162\1\157\1\143\1\151\1\162\1\167\1\60\1\uffff\1\60"+
        "\1\145\1\165\1\147\2\162\1\166\1\uffff\1\60\1\164\1\60\1\165\1\162"+
        "\3\60\1\156\1\141\1\145\1\151\1\uffff\2\0\1\60\1\156\1\60\1\uffff"+
        "\2\60\1\143\2\60\1\156\1\60\2\156\1\150\1\143\1\60\1\40\2\uffff"+
        "\1\60\1\154\1\60\1\164\1\141\1\145\1\uffff\1\151\1\uffff\1\141\1"+
        "\151\3\uffff\1\60\1\164\2\143\1\0\1\uffff\1\165\3\uffff\1\150\1"+
        "\171\2\uffff\1\141\1\uffff\1\60\1\154\2\60\3\uffff\1\164\1\uffff"+
        "\1\60\1\143\1\60\2\154\1\144\1\uffff\1\145\1\164\1\60\1\0\1\145"+
        "\2\60\1\154\1\uffff\1\171\2\uffff\1\60\1\164\1\uffff\1\145\1\60"+
        "\1\145\1\60\1\145\1\uffff\1\60\1\uffff\2\60\1\uffff\2\60\1\uffff"+
        "\1\60\1\uffff\1\144\6\uffff\1\60\1\uffff";
    static final String DFA46_maxS =
        "\1\uffff\1\162\2\157\1\164\1\145\1\167\1\162\1\150\1\157\2\163\1"+
        "\165\1\157\1\166\1\156\1\151\1\165\1\uffff\1\12\2\uffff\1\75\1\41"+
        "\1\174\1\uffff\1\42\1\uffff\3\75\1\76\2\75\1\76\2\75\1\174\1\135"+
        "\1\72\1\71\1\75\10\uffff\1\172\5\uffff\1\145\1\uffff\1\156\1\164"+
        "\1\141\1\162\1\156\1\154\1\172\1\164\2\172\1\164\1\151\1\141\1\160"+
        "\1\162\1\171\1\151\1\146\1\172\1\151\1\172\1\163\1\164\1\167\2\154"+
        "\1\162\1\145\1\143\1\165\1\163\1\170\1\157\1\142\13\uffff\1\75\1"+
        "\uffff\1\42\7\uffff\1\75\21\uffff\1\74\17\uffff\1\141\1\164\1\145"+
        "\1\143\1\163\1\172\1\141\1\163\1\uffff\1\145\1\157\2\uffff\1\165"+
        "\1\144\2\164\1\145\1\157\1\163\1\172\1\145\1\154\1\141\1\uffff\1"+
        "\156\1\145\1\uffff\1\164\1\151\1\172\1\154\1\141\1\144\1\164\1\162"+
        "\1\145\1\155\1\145\1\151\1\166\1\164\1\154\1\uffff\1\uffff\4\uffff"+
        "\1\153\1\151\1\164\1\172\1\150\1\163\1\141\1\uffff\1\154\1\145\1"+
        "\162\1\164\1\162\1\157\1\143\1\151\1\162\1\167\1\172\1\uffff\1\172"+
        "\1\145\1\165\1\147\2\162\1\166\1\uffff\1\172\1\164\1\172\1\165\1"+
        "\162\3\172\1\156\1\141\1\145\1\151\1\uffff\2\uffff\1\172\1\156\1"+
        "\172\1\uffff\2\172\1\143\2\172\1\156\1\172\2\156\1\150\1\143\2\172"+
        "\2\uffff\1\172\1\154\1\172\1\164\1\141\1\145\1\uffff\1\151\1\uffff"+
        "\1\141\1\151\3\uffff\1\172\1\164\2\143\1\uffff\1\uffff\1\165\3\uffff"+
        "\1\150\1\171\2\uffff\1\141\1\uffff\1\172\1\154\2\172\3\uffff\1\164"+
        "\1\uffff\1\172\1\143\1\172\2\154\1\144\1\uffff\1\145\1\164\1\172"+
        "\1\uffff\1\145\2\172\1\154\1\uffff\1\171\2\uffff\1\172\1\164\1\uffff"+
        "\1\145\1\172\1\145\1\172\1\145\1\uffff\1\172\1\uffff\2\172\1\uffff"+
        "\2\172\1\uffff\1\172\1\uffff\1\144\6\uffff\1\172\1\uffff";
    static final String DFA46_acceptS =
        "\22\uffff\1\54\1\uffff\1\55\1\56\5\uffff\1\66\16\uffff\1\105\1\106"+
        "\1\110\1\111\1\112\1\114\1\115\1\121\1\uffff\1\144\2\145\1\146\1"+
        "\147\1\uffff\1\146\42\uffff\1\54\1\55\1\56\1\57\1\61\1\73\1\141"+
        "\1\60\1\122\1\62\1\72\1\uffff\1\63\1\uffff\1\65\1\66\1\67\1\140"+
        "\1\71\1\124\1\143\1\uffff\1\142\1\132\1\135\1\76\1\133\1\134\1\127"+
        "\1\123\1\125\1\130\1\116\1\74\1\107\1\75\1\77\1\103\1\120\1\uffff"+
        "\1\131\1\145\1\104\1\117\1\113\1\105\1\106\1\110\1\111\1\112\1\114"+
        "\1\115\1\121\1\126\1\144\10\uffff\1\4\2\uffff\1\46\1\51\13\uffff"+
        "\1\70\2\uffff\1\17\17\uffff\1\136\1\uffff\1\137\1\100\1\101\1\102"+
        "\7\uffff\1\3\13\uffff\1\11\7\uffff\1\41\14\uffff\1\64\5\uffff\1"+
        "\12\15\uffff\1\43\1\52\6\uffff\1\50\1\uffff\1\30\2\uffff\1\42\1"+
        "\32\1\45\5\uffff\1\1\1\uffff\1\21\1\14\1\31\2\uffff\1\27\1\53\1"+
        "\uffff\1\47\4\uffff\1\44\1\7\1\10\1\uffff\1\16\6\uffff\1\33\10\uffff"+
        "\1\5\1\uffff\1\6\1\22\2\uffff\1\23\5\uffff\1\37\1\uffff\1\15\2\uffff"+
        "\1\13\2\uffff\1\26\1\uffff\1\35\1\uffff\1\2\1\40\1\20\1\34\1\24"+
        "\1\25\1\uffff\1\36";
    static final String DFA46_specialS =
        "\1\1\30\uffff\1\5\u00a5\uffff\1\6\55\uffff\1\0\1\3\45\uffff\1\4"+
        "\36\uffff\1\2\44\uffff}>";
    static final String[] DFA46_transitionS = {
            "\11\67\1\25\1\24\2\67\1\23\22\67\1\25\1\36\1\32\1\27\1\22\1"+
            "\40\1\43\1\31\1\55\1\56\1\34\1\41\1\60\1\42\1\50\1\26\1\64\11"+
            "\65\1\51\1\57\1\30\1\35\1\37\1\47\1\61\32\66\1\46\1\67\1\54"+
            "\1\44\1\62\1\33\1\13\1\1\1\2\1\11\1\17\1\3\2\66\1\4\3\66\1\20"+
            "\1\14\1\16\1\21\1\66\1\5\1\6\1\7\1\12\1\15\1\10\3\66\1\52\1"+
            "\45\1\53\1\63\uff81\67",
            "\1\70",
            "\1\73\12\uffff\1\74\2\uffff\1\72",
            "\1\77\7\uffff\1\76\5\uffff\1\75",
            "\1\100\7\uffff\1\101\4\uffff\1\102\1\103",
            "\1\104",
            "\1\106\1\107\1\uffff\1\105",
            "\1\110\11\uffff\1\111",
            "\1\112",
            "\1\113\11\uffff\1\114",
            "\1\115",
            "\1\117\20\uffff\1\116",
            "\1\120\3\uffff\1\121\17\uffff\1\122",
            "\1\124\5\uffff\1\123",
            "\1\126\7\uffff\1\125",
            "\1\130\1\uffff\1\127",
            "\1\131",
            "\1\132\2\uffff\1\133",
            "",
            "\1\135",
            "",
            "",
            "\1\140\4\uffff\1\137\15\uffff\1\141",
            "\1\143",
            "\1\147\77\uffff\1\145",
            "\0\150",
            "\1\151",
            "",
            "\1\154\22\uffff\1\141",
            "\1\156",
            "\1\156",
            "\1\161",
            "\1\141",
            "\1\163\21\uffff\1\141",
            "\1\166\17\uffff\1\141\1\165",
            "\1\170\26\uffff\1\141",
            "\1\141",
            "\1\141\76\uffff\1\173",
            "\1\175",
            "\1\177\1\u0080\13\uffff\1\u0081",
            "\1\u0083\1\uffff\12\u0085",
            "\1\u0086\2\uffff\1\u0087",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "",
            "",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u009c",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\15\71\1\u009d\14"+
            "\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00a1\22\uffff\1\u00a0",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a6\10\uffff\1\u00a5",
            "\1\u00a8\3\uffff\1\u00a7",
            "\1\u00a9",
            "\1\u00aa",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ac",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\22\71\1\u00ad\7\71",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b4\2\uffff\1\u00b3",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb\5\uffff\1\u00bc",
            "\1\u00bd",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "",
            "\1\u00bf",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c1\15\uffff\1\u00c2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c4",
            "\1\u00c6\1\u00c5",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\4\71\1\u00ca\25\71",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\12\u00ee\1\uffff\27\u00ee\1\u00ed\uffdd\u00ee",
            "",
            "",
            "",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0109",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u010b",
            "\1\u010c",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "",
            "\12\u00ee\1\uffff\27\u00ee\1\u0114\uffdd\u00ee",
            "\12\u00ee\1\uffff\27\u00ee\1\u00ed\uffdd\u00ee",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0116",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u011a",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\13\71\1\u011b\16"+
            "\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u011e",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0125\17\uffff\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff"+
            "\32\71",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0127",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "\1\u012c",
            "",
            "\1\u012d",
            "\1\u012e",
            "",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\12\u00ee\1\uffff\27\u00ee\1\u0133\uffdd\u00ee",
            "",
            "\1\u0134",
            "",
            "",
            "",
            "\1\u0135",
            "\1\u0136",
            "",
            "",
            "\1\u0137",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0139",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "",
            "\1\u013c",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u013d",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "",
            "\1\u0142",
            "\1\u0143",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\u00ee\1\uffff\27\u00ee\1\u0133\uffdd\u00ee",
            "\1\u0145",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0147",
            "",
            "\1\u0148",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u014a",
            "",
            "\1\u014b",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u014d",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u014f",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u0156",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KW_BREAK | KW_CONTINUE | KW_FOR | KW_IF | KW_RETURN | KW_SWITCH | KW_THROW | KW_WHILE | KW_TRY | KW_CASE | KW_DEFAULT | KW_CATCH | KW_FINALLY | KW_USING | KW_AS | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | KW_VOID | KW_CLASS | KW_ENUM | KW_MIXIN | KW_ABSTRACT | KW_PRIVATE | KW_PROTECTED | KW_PUBLIC | KW_INTERNAL | KW_NEW | KW_ONCE | KW_THIS | KW_SUPER | KW_ELSE | KW_IS | KW_ISNOT | KW_NULL | KW_IT | KW_TRUE | KW_FALSE | T__167 | LB | WS | LINE_COMMENT | EXEC_COMMENT | MULTI_COMMENT | DSL | CHAR | QUOTSTR | STR | URI | DOC | KEYWORD | CP_EQUALITY | CP_COMPARATORS | AS_ASSIGN_OP | LIST_TYPE | OP_SAFEDYN_CALL | OP_ARROW | OP_SAFE_CALL | OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE | OP_ELVIS | SP_COLCOL | BRACKET_L | BRACKET_R | SQ_BRACKET_L | SQ_BRACKET_R | PAR_L | PAR_R | SP_COLON | SP_SEMI | SP_COMMA | SP_PIPE | AS_INIT_VAL | SP_QMARK | AT | OP_POUND | OP_CURRY | AS_EQUAL | OP_BITOR | UNDERSCORE | OP_AND | OP_OR | DOT | OP_2PLUS | OP_2MINUS | OP_MINUS | OP_PLUS | OP_LSHIFT | OP_RSHIFT | OP_MULTI | OP_DIV | OP_MOD | OP_BANG | OP_TILDA | NUMBER | ID | INC_UNKNOWN_ITEM );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_237 = input.LA(1);

                        s = -1;
                        if ( (LA46_237=='\"') ) {s = 276;}

                        else if ( ((LA46_237>='\u0000' && LA46_237<='\t')||(LA46_237>='\u000B' && LA46_237<='!')||(LA46_237>='#' && LA46_237<='\uFFFF')) ) {s = 238;}

                        else s = 236;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_0 = input.LA(1);

                        s = -1;
                        if ( (LA46_0=='b') ) {s = 1;}

                        else if ( (LA46_0=='c') ) {s = 2;}

                        else if ( (LA46_0=='f') ) {s = 3;}

                        else if ( (LA46_0=='i') ) {s = 4;}

                        else if ( (LA46_0=='r') ) {s = 5;}

                        else if ( (LA46_0=='s') ) {s = 6;}

                        else if ( (LA46_0=='t') ) {s = 7;}

                        else if ( (LA46_0=='w') ) {s = 8;}

                        else if ( (LA46_0=='d') ) {s = 9;}

                        else if ( (LA46_0=='u') ) {s = 10;}

                        else if ( (LA46_0=='a') ) {s = 11;}

                        else if ( (LA46_0=='n') ) {s = 12;}

                        else if ( (LA46_0=='v') ) {s = 13;}

                        else if ( (LA46_0=='o') ) {s = 14;}

                        else if ( (LA46_0=='e') ) {s = 15;}

                        else if ( (LA46_0=='m') ) {s = 16;}

                        else if ( (LA46_0=='p') ) {s = 17;}

                        else if ( (LA46_0=='$') ) {s = 18;}

                        else if ( (LA46_0=='\r') ) {s = 19;}

                        else if ( (LA46_0=='\n') ) {s = 20;}

                        else if ( (LA46_0=='\t'||LA46_0==' ') ) {s = 21;}

                        else if ( (LA46_0=='/') ) {s = 22;}

                        else if ( (LA46_0=='#') ) {s = 23;}

                        else if ( (LA46_0=='<') ) {s = 24;}

                        else if ( (LA46_0=='\'') ) {s = 25;}

                        else if ( (LA46_0=='\"') ) {s = 26;}

                        else if ( (LA46_0=='`') ) {s = 27;}

                        else if ( (LA46_0=='*') ) {s = 28;}

                        else if ( (LA46_0=='=') ) {s = 29;}

                        else if ( (LA46_0=='!') ) {s = 30;}

                        else if ( (LA46_0=='>') ) {s = 31;}

                        else if ( (LA46_0=='%') ) {s = 32;}

                        else if ( (LA46_0=='+') ) {s = 33;}

                        else if ( (LA46_0=='-') ) {s = 34;}

                        else if ( (LA46_0=='&') ) {s = 35;}

                        else if ( (LA46_0=='^') ) {s = 36;}

                        else if ( (LA46_0=='|') ) {s = 37;}

                        else if ( (LA46_0=='[') ) {s = 38;}

                        else if ( (LA46_0=='?') ) {s = 39;}

                        else if ( (LA46_0=='.') ) {s = 40;}

                        else if ( (LA46_0==':') ) {s = 41;}

                        else if ( (LA46_0=='{') ) {s = 42;}

                        else if ( (LA46_0=='}') ) {s = 43;}

                        else if ( (LA46_0==']') ) {s = 44;}

                        else if ( (LA46_0=='(') ) {s = 45;}

                        else if ( (LA46_0==')') ) {s = 46;}

                        else if ( (LA46_0==';') ) {s = 47;}

                        else if ( (LA46_0==',') ) {s = 48;}

                        else if ( (LA46_0=='@') ) {s = 49;}

                        else if ( (LA46_0=='_') ) {s = 50;}

                        else if ( (LA46_0=='~') ) {s = 51;}

                        else if ( (LA46_0=='0') ) {s = 52;}

                        else if ( ((LA46_0>='1' && LA46_0<='9')) ) {s = 53;}

                        else if ( ((LA46_0>='A' && LA46_0<='Z')||(LA46_0>='g' && LA46_0<='h')||(LA46_0>='j' && LA46_0<='l')||LA46_0=='q'||(LA46_0>='x' && LA46_0<='z')) ) {s = 54;}

                        else if ( ((LA46_0>='\u0000' && LA46_0<='\b')||(LA46_0>='\u000B' && LA46_0<='\f')||(LA46_0>='\u000E' && LA46_0<='\u001F')||LA46_0=='\\'||(LA46_0>='\u007F' && LA46_0<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_307 = input.LA(1);

                        s = -1;
                        if ( (LA46_307=='\"') ) {s = 307;}

                        else if ( ((LA46_307>='\u0000' && LA46_307<='\t')||(LA46_307>='\u000B' && LA46_307<='!')||(LA46_307>='#' && LA46_307<='\uFFFF')) ) {s = 238;}

                        else s = 236;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA46_238 = input.LA(1);

                        s = -1;
                        if ( (LA46_238=='\"') ) {s = 237;}

                        else if ( ((LA46_238>='\u0000' && LA46_238<='\t')||(LA46_238>='\u000B' && LA46_238<='!')||(LA46_238>='#' && LA46_238<='\uFFFF')) ) {s = 238;}

                        else s = 236;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA46_276 = input.LA(1);

                        s = -1;
                        if ( (LA46_276=='\"') ) {s = 307;}

                        else if ( ((LA46_276>='\u0000' && LA46_276<='\t')||(LA46_276>='\u000B' && LA46_276<='!')||(LA46_276>='#' && LA46_276<='\uFFFF')) ) {s = 238;}

                        else s = 236;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA46_25 = input.LA(1);

                        s = -1;
                        if ( ((LA46_25>='\u0000' && LA46_25<='\uFFFF')) ) {s = 104;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA46_191 = input.LA(1);

                        s = -1;
                        if ( (LA46_191=='\"') ) {s = 237;}

                        else if ( ((LA46_191>='\u0000' && LA46_191<='\t')||(LA46_191>='\u000B' && LA46_191<='!')||(LA46_191>='#' && LA46_191<='\uFFFF')) ) {s = 238;}

                        else s = 236;

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}