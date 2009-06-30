// $ANTLR 3.1.2 src/net/colar/netbeans/fan/antlr/Fan.g 2009-06-30 16:18:57
package net.colar.netbeans.fan.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FanLexer extends Lexer {
    public static final int EXPONENT=115;
    public static final int DSL=88;
    public static final int OP_AND=68;
    public static final int KW_NATIVE=22;
    public static final int LETTER=117;
    public static final int HEXNB=110;
    public static final int CHAR=96;
    public static final int KW_DEFAULT=14;
    public static final int OP_2PLUS=85;
    public static final int KW_ONCE=37;
    public static final int SP_SEMI=64;
    public static final int EOF=-1;
    public static final int KW_PUBLIC=34;
    public static final int KW_ISNOT=42;
    public static final int OP_MOD=83;
    public static final int PAR_R=58;
    public static final int OP_MINUS=80;
    public static final int KW_NEW=36;
    public static final int KW_BREAK=4;
    public static final int KW_SWITCH=9;
    public static final int OP_RANG_EXCL_OLD=72;
    public static final int OP_BITOR=75;
    public static final int QUOTSTR=93;
    public static final int OP_BANG=84;
    public static final int PAR_L=57;
    public static final int OP_MULTI=81;
    public static final int KW_PROTECTED=33;
    public static final int KEYWORD=107;
    public static final int LINE_COMMENT=102;
    public static final int CP_COMPARATORS=70;
    public static final int AS_EQUAL=65;
    public static final int KW_CATCH=15;
    public static final int NUMBER=99;
    public static final int UNDERSCORE=108;
    public static final int OP_DIV=82;
    public static final int INCOMPLETE=118;
    public static final int SP_COMMA=56;
    public static final int URI=95;
    public static final int KW_FINALLY=16;
    public static final int KW_THROW=10;
    public static final int WS=101;
    public static final int OP_POUND=97;
    public static final int KW_STATIC=21;
    public static final int SP_QMARK=59;
    public static final int HEXHEADER=113;
    public static final int AS_INIT_VAL=63;
    public static final int NBTYPE=116;
    public static final int KW_SUPER=39;
    public static final int OP_2MINUS=86;
    public static final int KW_ELSE=40;
    public static final int OP_RSHIFT=78;
    public static final int INCOMPLETE_DSL=47;
    public static final int OP_OR=67;
    public static final int DOC=98;
    public static final int KW_OVERRIDE=24;
    public static final int KW_ABSTRACT=31;
    public static final int MULTI_COMMENT=104;
    public static final int KW_CONST=20;
    public static final int OP_ELVIS=71;
    public static final int BRACKET_R=54;
    public static final int KW_TRUE=45;
    public static final int ID=92;
    public static final int SP_COLON=55;
    public static final int BRACKET_L=53;
    public static final int AT=91;
    public static final int STR=94;
    public static final int SP_PIPE=61;
    public static final int OP_RANGE_EXCL=73;
    public static final int KW_VIRTUAL=25;
    public static final int OP_TILDA=87;
    public static final int CP_EQUALITY=69;
    public static final int KW_FOR=6;
    public static final int KW_WHILE=11;
    public static final int OP_RANGE=74;
    public static final int KW_RETURN=8;
    public static final int SQ_BRACKET_R=52;
    public static final int KW_IS=41;
    public static final int DIGIT=105;
    public static final int KW_TRY=12;
    public static final int KW_IT=44;
    public static final int DOT=50;
    public static final int KW_THIS=38;
    public static final int KW_IF=7;
    public static final int OP_CURRY=76;
    public static final int SQ_BRACKET_L=51;
    public static final int OP_PLUS=79;
    public static final int KW_FALSE=46;
    public static final int KW_INTERNAL=35;
    public static final int KW_FINAL=26;
    public static final int KW_CONTINUE=5;
    public static final int HEXLETTER=106;
    public static final int KW_PRIVATE=32;
    public static final int KW_ENUM=29;
    public static final int HEX_HEADER=109;
    public static final int OP_SAFEDYN_CALL=90;
    public static final int LIST_TYPE=60;
    public static final int KW_CASE=13;
    public static final int KW_VOLATILE=23;
    public static final int OP_LSHIFT=77;
    public static final int FRACTIONAL=112;
    public static final int EXEC_COMMENT=103;
    public static final int KW_MIXIN=30;
    public static final int OP_ARROW=62;
    public static final int KW_VOID=27;
    public static final int DECIMAL=111;
    public static final int KW_CLASS=28;
    public static final int AS_ASSIGN_OP=66;
    public static final int KW_RD_ONLY=19;
    public static final int OP_SAFE_CALL=89;
    public static final int KW_AS=18;
    public static final int LB=100;
    public static final int KW_USING=17;
    public static final int KW_NULL=43;
    public static final int INCOMPLETE_STRING=48;
    public static final int FRACTION=114;
    public static final int SP_COLCOL=49;

    	    private int mystate=FanStates.NORMAL;

    	    public int getState(){return mystate;}
    	    public void clearState(){mystate=FanStates.NORMAL;}


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
            // src/net/colar/netbeans/fan/antlr/Fan.g:11:10: ( 'break' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:11:12: 'break'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:12:13: ( 'continue' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:12:15: 'continue'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:13:8: ( 'for' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:13:10: 'for'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:14:7: ( 'if' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:14:9: 'if'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:15:11: ( 'return' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:15:13: 'return'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:16:11: ( 'switch' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:16:13: 'switch'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:17:10: ( 'throw ' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:17:12: 'throw '
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:18:10: ( 'while' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:18:12: 'while'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:19:8: ( 'try' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:19:10: 'try'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:20:9: ( 'case' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:20:11: 'case'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:21:12: ( 'default' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:21:14: 'default'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:22:10: ( 'catch' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:22:12: 'catch'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:23:12: ( 'finally' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:23:14: 'finally'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:24:10: ( 'using' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:24:12: 'using'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:25:7: ( 'as' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:25:9: 'as'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:26:12: ( 'readonly' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:26:14: 'readonly'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:27:10: ( 'const' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:27:12: 'const'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:28:11: ( 'static' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:28:13: 'static'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:29:11: ( 'native' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:29:13: 'native'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:30:13: ( 'volatile' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:30:15: 'volatile'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:31:13: ( 'override' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:31:15: 'override'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:32:12: ( 'virtual' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:32:14: 'virtual'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:33:10: ( 'final' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:33:12: 'final'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:34:9: ( 'void' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:34:11: 'void'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:35:10: ( 'class' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:35:12: 'class'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:36:9: ( 'enum' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:36:11: 'enum'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:37:10: ( 'mixin' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:37:12: 'mixin'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:38:13: ( 'abstract' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:38:15: 'abstract'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:39:12: ( 'private' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:39:14: 'private'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:40:14: ( 'protected' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:40:16: 'protected'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:41:11: ( 'public' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:41:13: 'public'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:42:13: ( 'internal' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:42:15: 'internal'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:43:8: ( 'new' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:43:10: 'new'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:44:9: ( 'once' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:44:11: 'once'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:45:9: ( 'this' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:45:11: 'this'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:46:10: ( 'super' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:46:12: 'super'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:47:9: ( 'else' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:47:11: 'else'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:48:7: ( 'is' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:48:9: 'is'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:49:10: ( 'isnot' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:49:12: 'isnot'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:50:9: ( 'null' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:50:11: 'null'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:51:7: ( 'it' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:51:9: 'it'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:52:9: ( 'true' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:52:11: 'true'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:53:10: ( 'false' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:53:12: 'false'
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

    // $ANTLR start "LB"
    public final void mLB() throws RecognitionException {
        try {
            int _type = LB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:5: ( ( ( '\\r\\n' ) | '\\n' )+ )
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:7: ( ( '\\r\\n' ) | '\\n' )+
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:7: ( ( '\\r\\n' ) | '\\n' )+
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:395:8: ( '\\r\\n' )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:395:8: ( '\\r\\n' )
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:395:9: '\\r\\n'
            	    {
            	    match("\r\n"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:395:19: '\\n'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:397:7: ( ( ' ' | '\\t' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:397:10: ( ' ' | '\\t' )
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:14: ( '//' (~ ( '\\n' ) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:398:16: '//' (~ ( '\\n' ) )*
            {
            match("//"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:398:21: (~ ( '\\n' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:398:22: ~ ( '\\n' )
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:14: ( '#!' (~ ( '\\n' ) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:16: '#!' (~ ( '\\n' ) )*
            {
            match("#!"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:399:21: (~ ( '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:399:22: ~ ( '\\n' )
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:15: ( ( '/*' ( options {greedy=false; } : . )* '*/' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:400:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:400:24: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:400:52: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("*/"); if (state.failed) return ;


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

    // $ANTLR start "DSL"
    public final void mDSL() throws RecognitionException {
        try {
            int _type = DSL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:6: ( '<|' ( options {greedy=false; } : . )* '|>' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:7: '<|' ( options {greedy=false; } : . )* '|>'
            {
            match("<|"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:402:12: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='|') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='>') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='=')||(LA5_1>='?' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='{')||(LA5_0>='}' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:402:40: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("|>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DSL"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:7: ( '\\'' ( ( '\\\\' . ) | ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ) | . )? '\\'' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:8: '\\'' ( ( '\\\\' . ) | ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ) | . )? '\\''
            {
            match('\''); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:405:13: ( ( '\\\\' . ) | ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ) | . )?
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\\') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='u') ) {
                    int LA6_4 = input.LA(3);

                    if ( ((LA6_4>='0' && LA6_4<='9')||(LA6_4>='A' && LA6_4<='F')||(LA6_4>='a' && LA6_4<='f')) ) {
                        alt6=2;
                    }
                    else if ( (LA6_4=='\'') ) {
                        alt6=1;
                    }
                }
                else if ( (LA6_1=='\'') ) {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5=='\'') ) {
                        alt6=1;
                    }
                }
                else if ( ((LA6_1>='\u0000' && LA6_1<='&')||(LA6_1>='(' && LA6_1<='t')||(LA6_1>='v' && LA6_1<='\uFFFF')) ) {
                    alt6=1;
                }
            }
            else if ( (LA6_0=='\'') ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='\'') ) {
                    alt6=3;
                }
            }
            else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                alt6=3;
            }
            switch (alt6) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:14: ( '\\\\' . )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:14: ( '\\\\' . )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:15: '\\\\' .
                    {
                    match('\\'); if (state.failed) return ;
                    matchAny(); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:25: ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:25: ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:26: '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:47: .
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:10: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:408:12: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
            {
            match("\"\"\""); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:408:18: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\"') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='\"') ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3=='\"') ) {
                            alt7=2;
                        }
                        else if ( ((LA7_3>='\u0000' && LA7_3<='!')||(LA7_3>='#' && LA7_3<='\uFFFF')) ) {
                            alt7=1;
                        }


                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='!')||(LA7_1>='#' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:408:46: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("\"\"\""); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTSTR"

    // $ANTLR start "STR"
    public final void mSTR() throws RecognitionException {
        try {
            int _type = STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:6: ( ( '\"' ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )* '\"' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:8: ( '\"' ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )* '\"' )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:8: ( '\"' ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )* '\"' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:10: '\"' ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:409:14: ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )*
            loop8:
            do {
                int alt8=4;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2=='\\') ) {
                        alt8=1;
                    }
                    else if ( (LA8_2=='\"') ) {
                        int LA8_5 = input.LA(3);

                        if ( ((LA8_5>='\u0000' && LA8_5<='\uFFFF')) ) {
                            alt8=2;
                        }

                        else {
                            alt8=3;
                        }

                    }
                    else if ( ((LA8_2>='\u0000' && LA8_2<='!')||(LA8_2>='#' && LA8_2<='[')||(LA8_2>=']' && LA8_2<='\uFFFF')) ) {
                        alt8=3;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=3;
                }


                switch (alt8) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:409:16: ( '\\\\\\\\' )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:409:16: ( '\\\\\\\\' )
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:409:17: '\\\\\\\\'
            	    {
            	    match("\\\\"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:409:27: ( '\\\\\"' )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:409:27: ( '\\\\\"' )
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:409:28: '\\\\\"'
            	    {
            	    match("\\\""); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:409:37: ~ ( '\"' )
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
            	    break loop8;
                }
            } while (true);

            match('\"'); if (state.failed) return ;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STR"

    // $ANTLR start "URI"
    public final void mURI() throws RecognitionException {
        try {
            int _type = URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:6: ( ( '`' ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:8: ( '`' ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`' )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:8: ( '`' ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:10: '`' ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`'
            {
            match('`'); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:410:14: ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )*
            loop9:
            do {
                int alt9=4;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2=='\\') ) {
                        alt9=1;
                    }
                    else if ( (LA9_2=='`') ) {
                        int LA9_5 = input.LA(3);

                        if ( ((LA9_5>='\u0000' && LA9_5<='\uFFFF')) ) {
                            alt9=2;
                        }

                        else {
                            alt9=3;
                        }

                    }
                    else if ( ((LA9_2>='\u0000' && LA9_2<='[')||(LA9_2>=']' && LA9_2<='_')||(LA9_2>='a' && LA9_2<='\uFFFF')) ) {
                        alt9=3;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='_')||(LA9_0>='a' && LA9_0<='\uFFFF')) ) {
                    alt9=3;
                }


                switch (alt9) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:410:16: ( '\\\\\\\\' )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:410:16: ( '\\\\\\\\' )
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:410:17: '\\\\\\\\'
            	    {
            	    match("\\\\"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:410:27: ( '\\\\`' )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:410:27: ( '\\\\`' )
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:410:28: '\\\\`'
            	    {
            	    match("\\`"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:410:37: ~ ( '`' )
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
            	    break loop9;
                }
            } while (true);

            match('`'); if (state.failed) return ;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "URI"

    // $ANTLR start "DOC"
    public final void mDOC() throws RecognitionException {
        try {
            int _type = DOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:7: ( '**' ( options {greedy=false; } : . )* '\\n' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:11: '**' ( options {greedy=false; } : . )* '\\n'
            {
            match("**"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:414:16: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n') ) {
                    alt10=2;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:414:44: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:10: ( ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:12: ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:12: ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' )
            int alt11=45;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:417:13: 'abstract'
                    {
                    match("abstract"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:417:26: 'as'
                    {
                    match("as"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:417:33: 'assert'
                    {
                    match("assert"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:417:44: 'break'
                    {
                    match("break"); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:417:54: 'case'
                    {
                    match("case"); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:417:63: 'catch'
                    {
                    match("catch"); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:418:3: 'class'
                    {
                    match("class"); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:418:13: 'const'
                    {
                    match("const"); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:418:23: 'continue'
                    {
                    match("continue"); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:418:36: 'default'
                    {
                    match("default"); if (state.failed) return ;


                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:418:48: 'do'
                    {
                    match("do"); if (state.failed) return ;


                    }
                    break;
                case 12 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:418:55: 'else'
                    {
                    match("else"); if (state.failed) return ;


                    }
                    break;
                case 13 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:418:64: 'enum'
                    {
                    match("enum"); if (state.failed) return ;


                    }
                    break;
                case 14 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:418:73: 'false'
                    {
                    match("false"); if (state.failed) return ;


                    }
                    break;
                case 15 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:419:4: 'final'
                    {
                    match("final"); if (state.failed) return ;


                    }
                    break;
                case 16 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:419:14: 'finally'
                    {
                    match("finally"); if (state.failed) return ;


                    }
                    break;
                case 17 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:419:26: 'for'
                    {
                    match("for"); if (state.failed) return ;


                    }
                    break;
                case 18 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:419:34: 'foreach'
                    {
                    match("foreach"); if (state.failed) return ;


                    }
                    break;
                case 19 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:419:46: 'if'
                    {
                    match("if"); if (state.failed) return ;


                    }
                    break;
                case 20 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:419:53: 'internal'
                    {
                    match("internal"); if (state.failed) return ;


                    }
                    break;
                case 21 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:419:66: 'is'
                    {
                    match("is"); if (state.failed) return ;


                    }
                    break;
                case 22 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:419:73: 'isnot'
                    {
                    match("isnot"); if (state.failed) return ;


                    }
                    break;
                case 23 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:4: 'mixin'
                    {
                    match("mixin"); if (state.failed) return ;


                    }
                    break;
                case 24 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:14: 'native'
                    {
                    match("native"); if (state.failed) return ;


                    }
                    break;
                case 25 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:25: 'new'
                    {
                    match("new"); if (state.failed) return ;


                    }
                    break;
                case 26 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:33: 'null'
                    {
                    match("null"); if (state.failed) return ;


                    }
                    break;
                case 27 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:42: 'once'
                    {
                    match("once"); if (state.failed) return ;


                    }
                    break;
                case 28 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:51: 'override'
                    {
                    match("override"); if (state.failed) return ;


                    }
                    break;
                case 29 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:420:64: 'private'
                    {
                    match("private"); if (state.failed) return ;


                    }
                    break;
                case 30 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:421:4: 'protected'
                    {
                    match("protected"); if (state.failed) return ;


                    }
                    break;
                case 31 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:421:18: 'public'
                    {
                    match("public"); if (state.failed) return ;


                    }
                    break;
                case 32 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:421:29: 'readonly'
                    {
                    match("readonly"); if (state.failed) return ;


                    }
                    break;
                case 33 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:421:42: 'return'
                    {
                    match("return"); if (state.failed) return ;


                    }
                    break;
                case 34 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:421:53: 'static'
                    {
                    match("static"); if (state.failed) return ;


                    }
                    break;
                case 35 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:421:64: 'super'
                    {
                    match("super"); if (state.failed) return ;


                    }
                    break;
                case 36 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:421:74: 'switch'
                    {
                    match("switch"); if (state.failed) return ;


                    }
                    break;
                case 37 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:3: 'this'
                    {
                    match("this"); if (state.failed) return ;


                    }
                    break;
                case 38 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:12: 'throw'
                    {
                    match("throw"); if (state.failed) return ;


                    }
                    break;
                case 39 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:22: 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 40 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:31: 'try'
                    {
                    match("try"); if (state.failed) return ;


                    }
                    break;
                case 41 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:39: 'using'
                    {
                    match("using"); if (state.failed) return ;


                    }
                    break;
                case 42 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:49: 'virtual'
                    {
                    match("virtual"); if (state.failed) return ;


                    }
                    break;
                case 43 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:61: 'volatile'
                    {
                    match("volatile"); if (state.failed) return ;


                    }
                    break;
                case 44 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:422:74: 'void'
                    {
                    match("void"); if (state.failed) return ;


                    }
                    break;
                case 45 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:423:3: 'while'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:427:13: ( '===' | '!==' | '==' | '!=' )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='=') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='=') ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3=='=') ) {
                        alt12=1;
                    }
                    else {
                        alt12=3;}
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0=='!') ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2=='=') ) {
                    int LA12_4 = input.LA(3);

                    if ( (LA12_4=='=') ) {
                        alt12=2;
                    }
                    else {
                        alt12=4;}
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:427:14: '==='
                    {
                    match("==="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:427:22: '!=='
                    {
                    match("!=="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:427:30: '=='
                    {
                    match("=="); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:427:37: '!='
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:428:16: ( '<=>' | '<=' | '<' | '>=' | '>' )
            int alt13=5;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='<') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='=') ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3=='>') ) {
                        alt13=1;
                    }
                    else {
                        alt13=2;}
                }
                else {
                    alt13=3;}
            }
            else if ( (LA13_0=='>') ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2=='=') ) {
                    alt13=4;
                }
                else {
                    alt13=5;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:428:17: '<=>'
                    {
                    match("<=>"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:428:25: '<='
                    {
                    match("<="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:428:32: '<'
                    {
                    match('<'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:428:38: '>='
                    {
                    match(">="); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:428:45: '>'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:14: ( '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
            int alt14=10;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt14=1;
                }
                break;
            case '/':
                {
                alt14=2;
                }
                break;
            case '%':
                {
                alt14=3;
                }
                break;
            case '+':
                {
                alt14=4;
                }
                break;
            case '-':
                {
                alt14=5;
                }
                break;
            case '<':
                {
                alt14=6;
                }
                break;
            case '>':
                {
                alt14=7;
                }
                break;
            case '&':
                {
                alt14=8;
                }
                break;
            case '^':
                {
                alt14=9;
                }
                break;
            case '|':
                {
                alt14=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:15: '*='
                    {
                    match("*="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:22: '/='
                    {
                    match("/="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:29: '%='
                    {
                    match("%="); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:36: '+='
                    {
                    match("+="); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:43: '-='
                    {
                    match("-="); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:50: '<<='
                    {
                    match("<<="); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:58: '>>='
                    {
                    match(">>="); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:66: '&='
                    {
                    match("&="); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:73: '^='
                    {
                    match("^="); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:429:80: '|='
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:11: ( '[]' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:12: '[]'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:431:17: ( '?->' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:431:18: '?->'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:432:10: ( '->' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:432:11: '->'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:433:14: ( '?.' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:433:15: '?.'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:17: ( '...' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:18: '...'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:15: ( '..<' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:16: '..<'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:436:10: ( '..' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:436:11: '..'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:437:10: ( '?:' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:437:11: '?:'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:438:11: ( '::' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:438:12: '::'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:439:11: ( '{' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:439:12: '{'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:11: ( '}' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:12: '}'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:14: ( '[' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:15: '['
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:442:14: ( ']' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:442:15: ']'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:8: ( '(' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:9: '('
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:8: ( ')' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:9: ')'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:445:10: ( ':' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:445:11: ':'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:446:10: ( ';' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:446:11: ';'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:447:10: ( ',' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:447:11: ','
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:448:10: ( '|' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:448:11: '|'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:13: ( ':=' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:14: ':='
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:10: ( '?' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:11: '?'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:451:5: ( '@' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:451:6: '@'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:10: ( '#' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:11: '#'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:453:10: ( '&' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:453:11: '&'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:454:10: ( '=' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:454:11: '='
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:455:10: ( '^' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:455:11: '^'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:456:12: ( '_' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:456:13: '_'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:457:9: ( '&&' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:457:10: '&&'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:458:8: ( '||' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:458:9: '||'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:459:6: ( '.' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:459:7: '.'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:460:10: ( '++' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:460:11: '++'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:461:11: ( '--' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:461:12: '--'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:10: ( '-' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:11: '-'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:463:10: ( '+' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:463:11: '+'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:464:11: ( '<<' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:464:12: '<<'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:465:11: ( '>>' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:465:12: '>>'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:466:10: ( '*' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:466:11: '*'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:467:9: ( '/' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:467:10: '/'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:9: ( '%' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:10: '%'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:469:10: ( '!' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:469:11: '!'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:470:10: ( '~' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:470:11: '~'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:475:21: ( '0x' | '0X' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='0') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='x') ) {
                    alt15=1;
                }
                else if ( (LA15_1=='X') ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:24: '0x'
                    {
                    match("0x"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:475:31: '0X'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:477:10: ( ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:477:13: ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:477:13: ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:477:14: ( HEXNB )=> HEXNB
                    {
                    mHEXNB(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:477:31: ( DECIMAL )=> DECIMAL
                    {
                    mDECIMAL(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:477:52: FRACTIONAL
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:478:17: ( HEXHEADER ( ( UNDERSCORE )* ( DIGIT | HEXLETTER ) )+ )
            // src/net/colar/netbeans/fan/antlr/Fan.g:478:19: HEXHEADER ( ( UNDERSCORE )* ( DIGIT | HEXLETTER ) )+
            {
            mHEXHEADER(); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:478:29: ( ( UNDERSCORE )* ( DIGIT | HEXLETTER ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='F')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='f')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:478:30: ( UNDERSCORE )* ( DIGIT | HEXLETTER )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:478:30: ( UNDERSCORE )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0=='_') ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // src/net/colar/netbeans/fan/antlr/Fan.g:478:30: UNDERSCORE
            	    	    {
            	    	    mUNDERSCORE(); if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
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
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:18: ( DIGIT ( ( UNDERSCORE )* DIGIT )* ( ( FRACTION )=> FRACTION )? ( ( EXPONENT )=> EXPONENT )? ( NBTYPE )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:20: DIGIT ( ( UNDERSCORE )* DIGIT )* ( ( FRACTION )=> FRACTION )? ( ( EXPONENT )=> EXPONENT )? ( NBTYPE )?
            {
            mDIGIT(); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:26: ( ( UNDERSCORE )* DIGIT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')||LA20_0=='_') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:479:27: ( UNDERSCORE )* DIGIT
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:479:27: ( UNDERSCORE )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0=='_') ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // src/net/colar/netbeans/fan/antlr/Fan.g:479:27: UNDERSCORE
            	    	    {
            	    	    mUNDERSCORE(); if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);

            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // src/net/colar/netbeans/fan/antlr/Fan.g:479:47: ( ( FRACTION )=> FRACTION )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='.') && (synpred3_Fan())) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:479:48: ( FRACTION )=> FRACTION
                    {
                    mFRACTION(); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:480:6: ( ( EXPONENT )=> EXPONENT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='E'||LA22_0=='e') && (synpred4_Fan())) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:480:7: ( EXPONENT )=> EXPONENT
                    {
                    mEXPONENT(); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:480:30: ( NBTYPE )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='D'||LA23_0=='F'||LA23_0=='d'||LA23_0=='f'||LA23_0=='h'||(LA23_0>='m' && LA23_0<='n')||LA23_0=='s') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:480:30: NBTYPE
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:481:21: ( FRACTION ( EXPONENT )? ( NBTYPE )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:481:23: FRACTION ( EXPONENT )? ( NBTYPE )?
            {
            mFRACTION(); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:481:32: ( EXPONENT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='E'||LA24_0=='e') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:481:32: EXPONENT
                    {
                    mEXPONENT(); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:481:42: ( NBTYPE )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='D'||LA25_0=='F'||LA25_0=='d'||LA25_0=='f'||LA25_0=='h'||(LA25_0>='m' && LA25_0<='n')||LA25_0=='s') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:481:42: NBTYPE
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:482:19: ( DOT DIGIT ( ( UNDERSCORE )* DIGIT )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:482:21: DOT DIGIT ( ( UNDERSCORE )* DIGIT )*
            {
            mDOT(); if (state.failed) return ;
            mDIGIT(); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:482:31: ( ( UNDERSCORE )* DIGIT )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='0' && LA27_0<='9')||LA27_0=='_') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:482:32: ( UNDERSCORE )* DIGIT
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:482:32: ( UNDERSCORE )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0=='_') ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // src/net/colar/netbeans/fan/antlr/Fan.g:482:32: UNDERSCORE
            	    	    {
            	    	    mUNDERSCORE(); if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop26;
            	        }
            	    } while (true);

            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:483:19: ( ( 'e' | 'E' ) ( '+' | OP_MINUS )? DIGIT ( ( UNDERSCORE )* DIGIT )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:483:21: ( 'e' | 'E' ) ( '+' | OP_MINUS )? DIGIT ( ( UNDERSCORE )* DIGIT )*
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

            // src/net/colar/netbeans/fan/antlr/Fan.g:483:31: ( '+' | OP_MINUS )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='+'||LA28_0=='-') ) {
                alt28=1;
            }
            switch (alt28) {
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:483:55: ( ( UNDERSCORE )* DIGIT )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='0' && LA30_0<='9')||LA30_0=='_') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:483:56: ( UNDERSCORE )* DIGIT
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:483:56: ( UNDERSCORE )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0=='_') ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // src/net/colar/netbeans/fan/antlr/Fan.g:483:56: UNDERSCORE
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


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "NBTYPE"
    public final void mNBTYPE() throws RecognitionException {
        try {
            // src/net/colar/netbeans/fan/antlr/Fan.g:485:18: ( 'F' | 'f' | 'D' | ( 'd' ( 'ay' )? ) | 'ms' | 'ns' | 'sec' | 'min' | 'hr' )
            int alt32=9;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:485:20: 'F'
                    {
                    match('F'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:485:26: 'f'
                    {
                    match('f'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:485:32: 'D'
                    {
                    match('D'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:485:38: ( 'd' ( 'ay' )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:485:38: ( 'd' ( 'ay' )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:485:39: 'd' ( 'ay' )?
                    {
                    match('d'); if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:485:43: ( 'ay' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='a') ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:485:43: 'ay'
                            {
                            match("ay"); if (state.failed) return ;


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:485:52: 'ms'
                    {
                    match("ms"); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:485:59: 'ns'
                    {
                    match("ns"); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:486:6: 'sec'
                    {
                    match("sec"); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:486:14: 'min'
                    {
                    match("min"); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:486:22: 'hr'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:487:20: ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:488:20: ( '0x' | '0X' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='0') ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1=='x') ) {
                    alt33=1;
                }
                else if ( (LA33_1=='X') ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:488:23: '0x'
                    {
                    match("0x"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:488:30: '0X'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:6: ( ( ( UNDERSCORE )* LETTER ) ( LETTER | DIGIT | UNDERSCORE )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:8: ( ( UNDERSCORE )* LETTER ) ( LETTER | DIGIT | UNDERSCORE )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:8: ( ( UNDERSCORE )* LETTER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:9: ( UNDERSCORE )* LETTER
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:491:9: ( UNDERSCORE )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0=='_') ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:491:9: UNDERSCORE
            	    {
            	    mUNDERSCORE(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            mLETTER(); if (state.failed) return ;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:491:29: ( LETTER | DIGIT | UNDERSCORE )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>='0' && LA35_0<='9')||(LA35_0>='A' && LA35_0<='Z')||LA35_0=='_'||(LA35_0>='a' && LA35_0<='z')) ) {
                    alt35=1;
                }


                switch (alt35) {
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
            	    break loop35;
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:493:18: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:493:20: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:494:17: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )
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

    // $ANTLR start "INCOMPLETE"
    public final void mINCOMPLETE() throws RecognitionException {
        try {
            int _type = INCOMPLETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/net/colar/netbeans/fan/antlr/Fan.g:497:13: ( . )
            // src/net/colar/netbeans/fan/antlr/Fan.g:497:15: .
            {
            matchAny(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCOMPLETE"

    public void mTokens() throws RecognitionException {
        // src/net/colar/netbeans/fan/antlr/Fan.g:1:8: ( KW_BREAK | KW_CONTINUE | KW_FOR | KW_IF | KW_RETURN | KW_SWITCH | KW_THROW | KW_WHILE | KW_TRY | KW_CASE | KW_DEFAULT | KW_CATCH | KW_FINALLY | KW_USING | KW_AS | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | KW_VOID | KW_CLASS | KW_ENUM | KW_MIXIN | KW_ABSTRACT | KW_PRIVATE | KW_PROTECTED | KW_PUBLIC | KW_INTERNAL | KW_NEW | KW_ONCE | KW_THIS | KW_SUPER | KW_ELSE | KW_IS | KW_ISNOT | KW_NULL | KW_IT | KW_TRUE | KW_FALSE | LB | WS | LINE_COMMENT | EXEC_COMMENT | MULTI_COMMENT | DSL | CHAR | QUOTSTR | STR | URI | DOC | KEYWORD | CP_EQUALITY | CP_COMPARATORS | AS_ASSIGN_OP | LIST_TYPE | OP_SAFEDYN_CALL | OP_ARROW | OP_SAFE_CALL | OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE | OP_ELVIS | SP_COLCOL | BRACKET_L | BRACKET_R | SQ_BRACKET_L | SQ_BRACKET_R | PAR_L | PAR_R | SP_COLON | SP_SEMI | SP_COMMA | SP_PIPE | AS_INIT_VAL | SP_QMARK | AT | OP_POUND | OP_CURRY | AS_EQUAL | OP_BITOR | UNDERSCORE | OP_AND | OP_OR | DOT | OP_2PLUS | OP_2MINUS | OP_MINUS | OP_PLUS | OP_LSHIFT | OP_RSHIFT | OP_MULTI | OP_DIV | OP_MOD | OP_BANG | OP_TILDA | NUMBER | ID | INCOMPLETE )
        int alt36=102;
        alt36 = dfa36.predict(input);
        switch (alt36) {
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
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:405: LB
                {
                mLB(); if (state.failed) return ;

                }
                break;
            case 45 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:408: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 46 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:411: LINE_COMMENT
                {
                mLINE_COMMENT(); if (state.failed) return ;

                }
                break;
            case 47 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:424: EXEC_COMMENT
                {
                mEXEC_COMMENT(); if (state.failed) return ;

                }
                break;
            case 48 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:437: MULTI_COMMENT
                {
                mMULTI_COMMENT(); if (state.failed) return ;

                }
                break;
            case 49 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:451: DSL
                {
                mDSL(); if (state.failed) return ;

                }
                break;
            case 50 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:455: CHAR
                {
                mCHAR(); if (state.failed) return ;

                }
                break;
            case 51 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:460: QUOTSTR
                {
                mQUOTSTR(); if (state.failed) return ;

                }
                break;
            case 52 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:468: STR
                {
                mSTR(); if (state.failed) return ;

                }
                break;
            case 53 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:472: URI
                {
                mURI(); if (state.failed) return ;

                }
                break;
            case 54 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:476: DOC
                {
                mDOC(); if (state.failed) return ;

                }
                break;
            case 55 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:480: KEYWORD
                {
                mKEYWORD(); if (state.failed) return ;

                }
                break;
            case 56 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:488: CP_EQUALITY
                {
                mCP_EQUALITY(); if (state.failed) return ;

                }
                break;
            case 57 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:500: CP_COMPARATORS
                {
                mCP_COMPARATORS(); if (state.failed) return ;

                }
                break;
            case 58 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:515: AS_ASSIGN_OP
                {
                mAS_ASSIGN_OP(); if (state.failed) return ;

                }
                break;
            case 59 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:528: LIST_TYPE
                {
                mLIST_TYPE(); if (state.failed) return ;

                }
                break;
            case 60 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:538: OP_SAFEDYN_CALL
                {
                mOP_SAFEDYN_CALL(); if (state.failed) return ;

                }
                break;
            case 61 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:554: OP_ARROW
                {
                mOP_ARROW(); if (state.failed) return ;

                }
                break;
            case 62 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:563: OP_SAFE_CALL
                {
                mOP_SAFE_CALL(); if (state.failed) return ;

                }
                break;
            case 63 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:576: OP_RANG_EXCL_OLD
                {
                mOP_RANG_EXCL_OLD(); if (state.failed) return ;

                }
                break;
            case 64 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:593: OP_RANGE_EXCL
                {
                mOP_RANGE_EXCL(); if (state.failed) return ;

                }
                break;
            case 65 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:607: OP_RANGE
                {
                mOP_RANGE(); if (state.failed) return ;

                }
                break;
            case 66 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:616: OP_ELVIS
                {
                mOP_ELVIS(); if (state.failed) return ;

                }
                break;
            case 67 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:625: SP_COLCOL
                {
                mSP_COLCOL(); if (state.failed) return ;

                }
                break;
            case 68 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:635: BRACKET_L
                {
                mBRACKET_L(); if (state.failed) return ;

                }
                break;
            case 69 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:645: BRACKET_R
                {
                mBRACKET_R(); if (state.failed) return ;

                }
                break;
            case 70 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:655: SQ_BRACKET_L
                {
                mSQ_BRACKET_L(); if (state.failed) return ;

                }
                break;
            case 71 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:668: SQ_BRACKET_R
                {
                mSQ_BRACKET_R(); if (state.failed) return ;

                }
                break;
            case 72 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:681: PAR_L
                {
                mPAR_L(); if (state.failed) return ;

                }
                break;
            case 73 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:687: PAR_R
                {
                mPAR_R(); if (state.failed) return ;

                }
                break;
            case 74 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:693: SP_COLON
                {
                mSP_COLON(); if (state.failed) return ;

                }
                break;
            case 75 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:702: SP_SEMI
                {
                mSP_SEMI(); if (state.failed) return ;

                }
                break;
            case 76 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:710: SP_COMMA
                {
                mSP_COMMA(); if (state.failed) return ;

                }
                break;
            case 77 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:719: SP_PIPE
                {
                mSP_PIPE(); if (state.failed) return ;

                }
                break;
            case 78 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:727: AS_INIT_VAL
                {
                mAS_INIT_VAL(); if (state.failed) return ;

                }
                break;
            case 79 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:739: SP_QMARK
                {
                mSP_QMARK(); if (state.failed) return ;

                }
                break;
            case 80 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:748: AT
                {
                mAT(); if (state.failed) return ;

                }
                break;
            case 81 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:751: OP_POUND
                {
                mOP_POUND(); if (state.failed) return ;

                }
                break;
            case 82 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:760: OP_CURRY
                {
                mOP_CURRY(); if (state.failed) return ;

                }
                break;
            case 83 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:769: AS_EQUAL
                {
                mAS_EQUAL(); if (state.failed) return ;

                }
                break;
            case 84 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:778: OP_BITOR
                {
                mOP_BITOR(); if (state.failed) return ;

                }
                break;
            case 85 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:787: UNDERSCORE
                {
                mUNDERSCORE(); if (state.failed) return ;

                }
                break;
            case 86 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:798: OP_AND
                {
                mOP_AND(); if (state.failed) return ;

                }
                break;
            case 87 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:805: OP_OR
                {
                mOP_OR(); if (state.failed) return ;

                }
                break;
            case 88 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:811: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 89 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:815: OP_2PLUS
                {
                mOP_2PLUS(); if (state.failed) return ;

                }
                break;
            case 90 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:824: OP_2MINUS
                {
                mOP_2MINUS(); if (state.failed) return ;

                }
                break;
            case 91 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:834: OP_MINUS
                {
                mOP_MINUS(); if (state.failed) return ;

                }
                break;
            case 92 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:843: OP_PLUS
                {
                mOP_PLUS(); if (state.failed) return ;

                }
                break;
            case 93 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:851: OP_LSHIFT
                {
                mOP_LSHIFT(); if (state.failed) return ;

                }
                break;
            case 94 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:861: OP_RSHIFT
                {
                mOP_RSHIFT(); if (state.failed) return ;

                }
                break;
            case 95 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:871: OP_MULTI
                {
                mOP_MULTI(); if (state.failed) return ;

                }
                break;
            case 96 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:880: OP_DIV
                {
                mOP_DIV(); if (state.failed) return ;

                }
                break;
            case 97 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:887: OP_MOD
                {
                mOP_MOD(); if (state.failed) return ;

                }
                break;
            case 98 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:894: OP_BANG
                {
                mOP_BANG(); if (state.failed) return ;

                }
                break;
            case 99 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:902: OP_TILDA
                {
                mOP_TILDA(); if (state.failed) return ;

                }
                break;
            case 100 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:911: NUMBER
                {
                mNUMBER(); if (state.failed) return ;

                }
                break;
            case 101 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:918: ID
                {
                mID(); if (state.failed) return ;

                }
                break;
            case 102 :
                // src/net/colar/netbeans/fan/antlr/Fan.g:1:921: INCOMPLETE
                {
                mINCOMPLETE(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Fan
    public final void synpred1_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:477:14: ( HEXNB )
        // src/net/colar/netbeans/fan/antlr/Fan.g:477:15: HEXNB
        {
        mHEXNB(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Fan

    // $ANTLR start synpred2_Fan
    public final void synpred2_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:477:31: ( DECIMAL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:477:32: DECIMAL
        {
        mDECIMAL(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Fan

    // $ANTLR start synpred3_Fan
    public final void synpred3_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:479:48: ( FRACTION )
        // src/net/colar/netbeans/fan/antlr/Fan.g:479:49: FRACTION
        {
        mFRACTION(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Fan

    // $ANTLR start synpred4_Fan
    public final void synpred4_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:480:7: ( EXPONENT )
        // src/net/colar/netbeans/fan/antlr/Fan.g:480:8: EXPONENT
        {
        mEXPONENT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Fan

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


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA11_eotS =
        "\23\uffff\1\61\14\uffff\1\70\25\uffff\1\107\21\uffff\1\112\2\uffff";
    static final String DFA11_eofS =
        "\113\uffff";
    static final String DFA11_minS =
        "\1\141\1\142\1\uffff\1\141\1\145\1\154\1\141\1\146\1\uffff\1\141"+
        "\1\156\1\162\1\145\1\164\1\150\1\uffff\1\151\2\uffff\2\163\1\uffff"+
        "\1\156\5\uffff\1\156\1\162\2\uffff\1\156\5\uffff\1\151\1\uffff\1"+
        "\141\3\uffff\1\151\1\165\1\uffff\1\151\4\uffff\1\163\1\141\1\145"+
        "\16\uffff\1\154\2\uffff\1\154\2\uffff";
    static final String DFA11_maxS =
        "\1\167\1\163\1\uffff\2\157\1\156\1\157\1\163\1\uffff\1\165\1\166"+
        "\1\165\1\145\1\167\1\162\1\uffff\1\157\2\uffff\1\163\1\164\1\uffff"+
        "\1\156\5\uffff\1\156\1\162\2\uffff\1\156\5\uffff\1\157\1\uffff\1"+
        "\164\3\uffff\1\162\1\171\1\uffff\1\154\4\uffff\1\164\1\141\1\145"+
        "\16\uffff\1\154\2\uffff\1\154\2\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\4\5\uffff\1\27\6\uffff\1\51\1\uffff\1\55\1\1\2\uffff"+
        "\1\7\1\uffff\1\12\1\13\1\14\1\15\1\16\2\uffff\1\23\1\24\1\uffff"+
        "\1\30\1\31\1\32\1\33\1\34\1\uffff\1\37\1\uffff\1\42\1\43\1\44\2"+
        "\uffff\1\52\1\uffff\1\3\1\2\1\5\1\6\3\uffff\1\26\1\25\1\35\1\36"+
        "\1\40\1\41\1\45\1\46\1\47\1\50\1\53\1\54\1\10\1\11\1\uffff\1\22"+
        "\1\21\1\uffff\1\20\1\17";
    static final String DFA11_specialS =
        "\113\uffff}>";
    static final String[] DFA11_transitionS = {
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
            return "417:12: ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' )";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\1\6\21\uffff";
    static final String DFA16_eofS =
        "\23\uffff";
    static final String DFA16_minS =
        "\2\56\21\uffff";
    static final String DFA16_maxS =
        "\1\71\1\170\21\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\2\1\15\2";
    static final String DFA16_specialS =
        "\1\1\1\0\21\uffff}>";
    static final String[] DFA16_transitionS = {
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "477:13: ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_1=='x') && (synpred1_Fan())) {s = 4;}

                        else if ( (LA16_1=='X') && (synpred1_Fan())) {s = 5;}

                        else if ( (LA16_1=='_') && (synpred2_Fan())) {s = 7;}

                        else if ( ((LA16_1>='0' && LA16_1<='9')) && (synpred2_Fan())) {s = 8;}

                        else if ( (LA16_1=='.') && (synpred2_Fan())) {s = 9;}

                        else if ( (LA16_1=='E'||LA16_1=='e') && (synpred2_Fan())) {s = 10;}

                        else if ( (LA16_1=='F') && (synpred2_Fan())) {s = 11;}

                        else if ( (LA16_1=='f') && (synpred2_Fan())) {s = 12;}

                        else if ( (LA16_1=='D') && (synpred2_Fan())) {s = 13;}

                        else if ( (LA16_1=='d') && (synpred2_Fan())) {s = 14;}

                        else if ( (LA16_1=='m') && (synpred2_Fan())) {s = 15;}

                        else if ( (LA16_1=='n') && (synpred2_Fan())) {s = 16;}

                        else if ( (LA16_1=='s') && (synpred2_Fan())) {s = 17;}

                        else if ( (LA16_1=='h') && (synpred2_Fan())) {s = 18;}

                        else s = 6;

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                         
                        int index16_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_0=='0') ) {s = 1;}

                        else if ( ((LA16_0>='1' && LA16_0<='9')) && (synpred2_Fan())) {s = 2;}

                        else if ( (LA16_0=='.') ) {s = 3;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\13\uffff";
    static final String DFA32_eofS =
        "\13\uffff";
    static final String DFA32_minS =
        "\1\104\4\uffff\1\151\5\uffff";
    static final String DFA32_maxS =
        "\1\163\4\uffff\1\163\5\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\11\1\5\1\10";
    static final String DFA32_specialS =
        "\13\uffff}>";
    static final String[] DFA32_transitionS = {
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "485:10: fragment NBTYPE : ( 'F' | 'f' | 'D' | ( 'd' ( 'ay' )? ) | 'ms' | 'ns' | 'sec' | 'min' | 'hr' );";
        }
    }
    static final String DFA36_eotS =
        "\1\uffff\21\70\1\66\2\uffff\1\140\1\142\1\144\3\66\1\153\1\155\1"+
        "\156\1\144\1\160\1\162\1\165\1\167\1\170\1\172\1\174\1\u0080\1\u0082"+
        "\1\u0086\10\uffff\1\u008f\5\uffff\1\70\1\uffff\6\70\1\u0099\1\70"+
        "\1\u009c\1\u009d\10\70\1\u00a9\1\70\1\u00ac\15\70\12\uffff\1\u00bc"+
        "\1\uffff\1\150\7\uffff\1\u00be\21\uffff\1\u00c1\17\uffff\5\70\1"+
        "\u00c9\2\70\1\uffff\2\70\2\uffff\7\70\1\u00d5\3\70\1\uffff\2\70"+
        "\1\uffff\2\70\1\u00dd\14\70\6\uffff\3\70\1\u00ed\3\70\1\uffff\12"+
        "\70\1\u00fb\1\uffff\1\u00fc\6\70\1\uffff\1\u0103\1\70\1\u0105\2"+
        "\70\1\u0108\1\u0109\1\u010a\4\70\1\u010f\1\70\1\u0111\1\uffff\1"+
        "\u0112\1\u0113\1\70\1\u0116\1\u0117\1\70\1\u0119\4\70\1\u011e\1"+
        "\u00a9\2\uffff\1\u0120\1\70\1\u0122\3\70\1\uffff\1\70\1\uffff\2"+
        "\70\3\uffff\1\u0129\3\70\1\uffff\1\70\3\uffff\2\70\2\uffff\1\70"+
        "\1\uffff\1\u0131\1\70\1\u0133\1\u0134\3\uffff\1\70\1\uffff\1\u00a9"+
        "\1\70\1\u0137\3\70\1\uffff\2\70\1\u013d\1\70\1\u00a9\1\u013f\1\70"+
        "\1\uffff\1\70\2\uffff\1\u0142\1\70\1\uffff\1\70\1\u0145\1\70\1\u0147"+
        "\1\70\1\uffff\1\u0149\1\uffff\1\u014a\1\u014b\1\uffff\1\u014c\1"+
        "\u014d\1\uffff\1\u014e\1\uffff\1\70\6\uffff\1\u0150\1\uffff";
    static final String DFA36_eofS =
        "\u0151\uffff";
    static final String DFA36_minS =
        "\1\0\1\162\2\141\1\146\1\145\1\164\2\150\1\145\1\163\1\142\1\141"+
        "\1\151\1\156\1\154\1\151\1\162\1\12\2\uffff\1\52\1\41\1\74\3\0\1"+
        "\52\2\75\1\76\1\75\1\53\1\55\1\46\2\75\1\135\1\55\1\56\1\72\10\uffff"+
        "\1\101\5\uffff\1\145\1\uffff\1\156\1\163\1\141\1\162\1\156\1\154"+
        "\1\60\1\164\2\60\1\141\1\151\1\141\1\160\1\151\1\165\1\151\1\146"+
        "\1\60\1\151\1\60\1\163\1\164\1\167\1\154\1\151\1\162\1\145\1\143"+
        "\1\165\1\163\1\170\1\151\1\142\12\uffff\1\75\1\uffff\1\42\7\uffff"+
        "\1\75\21\uffff\1\56\17\uffff\1\141\1\163\1\145\1\143\1\163\1\60"+
        "\1\141\1\163\1\uffff\1\145\1\157\2\uffff\1\165\1\144\2\164\1\145"+
        "\1\157\1\163\1\60\1\145\1\154\1\141\1\uffff\1\156\1\145\1\uffff"+
        "\1\164\1\151\1\60\1\154\1\141\1\144\1\164\1\162\1\145\1\155\1\145"+
        "\1\151\1\166\1\164\1\154\6\uffff\1\153\1\151\1\164\1\60\1\150\1"+
        "\163\1\141\1\uffff\1\154\1\145\1\162\1\164\1\162\1\157\1\143\1\151"+
        "\1\162\1\167\1\60\1\uffff\1\60\1\145\1\165\1\147\2\162\1\166\1\uffff"+
        "\1\60\1\164\1\60\1\165\1\162\3\60\1\156\1\141\1\145\1\151\1\60\1"+
        "\156\1\60\1\uffff\2\60\1\143\2\60\1\156\1\60\2\156\1\150\1\143\1"+
        "\60\1\40\2\uffff\1\60\1\154\1\60\1\164\1\141\1\145\1\uffff\1\151"+
        "\1\uffff\1\141\1\151\3\uffff\1\60\1\164\2\143\1\uffff\1\165\3\uffff"+
        "\1\150\1\171\2\uffff\1\141\1\uffff\1\60\1\154\2\60\3\uffff\1\164"+
        "\1\uffff\1\60\1\143\1\60\2\154\1\144\1\uffff\1\145\1\164\1\60\1"+
        "\145\2\60\1\154\1\uffff\1\171\2\uffff\1\60\1\164\1\uffff\1\145\1"+
        "\60\1\145\1\60\1\145\1\uffff\1\60\1\uffff\2\60\1\uffff\2\60\1\uffff"+
        "\1\60\1\uffff\1\144\6\uffff\1\60\1\uffff";
    static final String DFA36_maxS =
        "\1\uffff\1\162\2\157\1\164\1\145\1\167\1\162\1\150\1\157\2\163\1"+
        "\165\1\157\1\166\1\156\1\151\1\165\1\12\2\uffff\1\75\1\41\1\174"+
        "\3\uffff\3\75\1\76\2\75\1\76\2\75\1\174\1\135\1\72\1\71\1\75\10"+
        "\uffff\1\172\5\uffff\1\145\1\uffff\1\156\1\164\1\141\1\162\1\156"+
        "\1\154\1\172\1\164\2\172\1\164\1\151\1\141\1\160\1\162\1\171\1\151"+
        "\1\146\1\172\1\151\1\172\1\163\1\164\1\167\2\154\1\162\1\145\1\143"+
        "\1\165\1\163\1\170\1\157\1\142\12\uffff\1\75\1\uffff\1\42\7\uffff"+
        "\1\75\21\uffff\1\74\17\uffff\1\141\1\164\1\145\1\143\1\163\1\172"+
        "\1\141\1\163\1\uffff\1\145\1\157\2\uffff\1\165\1\144\2\164\1\145"+
        "\1\157\1\163\1\172\1\145\1\154\1\141\1\uffff\1\156\1\145\1\uffff"+
        "\1\164\1\151\1\172\1\154\1\141\1\144\1\164\1\162\1\145\1\155\1\145"+
        "\1\151\1\166\1\164\1\154\6\uffff\1\153\1\151\1\164\1\172\1\150\1"+
        "\163\1\141\1\uffff\1\154\1\145\1\162\1\164\1\162\1\157\1\143\1\151"+
        "\1\162\1\167\1\172\1\uffff\1\172\1\145\1\165\1\147\2\162\1\166\1"+
        "\uffff\1\172\1\164\1\172\1\165\1\162\3\172\1\156\1\141\1\145\1\151"+
        "\1\172\1\156\1\172\1\uffff\2\172\1\143\2\172\1\156\1\172\2\156\1"+
        "\150\1\143\2\172\2\uffff\1\172\1\154\1\172\1\164\1\141\1\145\1\uffff"+
        "\1\151\1\uffff\1\141\1\151\3\uffff\1\172\1\164\2\143\1\uffff\1\165"+
        "\3\uffff\1\150\1\171\2\uffff\1\141\1\uffff\1\172\1\154\2\172\3\uffff"+
        "\1\164\1\uffff\1\172\1\143\1\172\2\154\1\144\1\uffff\1\145\1\164"+
        "\1\172\1\145\2\172\1\154\1\uffff\1\171\2\uffff\1\172\1\164\1\uffff"+
        "\1\145\1\172\1\145\1\172\1\145\1\uffff\1\172\1\uffff\2\172\1\uffff"+
        "\2\172\1\uffff\1\172\1\uffff\1\144\6\uffff\1\172\1\uffff";
    static final String DFA36_acceptS =
        "\23\uffff\1\54\1\55\24\uffff\1\104\1\105\1\107\1\110\1\111\1\113"+
        "\1\114\1\120\1\uffff\1\143\2\144\1\145\1\146\1\uffff\1\145\42\uffff"+
        "\1\54\1\55\1\56\1\60\1\72\1\140\1\57\1\121\1\61\1\71\1\uffff\1\62"+
        "\1\uffff\1\64\1\65\1\66\1\137\1\70\1\123\1\142\1\uffff\1\141\1\131"+
        "\1\134\1\75\1\132\1\133\1\126\1\122\1\124\1\127\1\115\1\73\1\106"+
        "\1\74\1\76\1\102\1\117\1\uffff\1\130\1\144\1\103\1\116\1\112\1\104"+
        "\1\105\1\107\1\110\1\111\1\113\1\114\1\120\1\125\1\143\10\uffff"+
        "\1\4\2\uffff\1\46\1\51\13\uffff\1\67\2\uffff\1\17\17\uffff\1\135"+
        "\1\63\1\136\1\77\1\100\1\101\7\uffff\1\3\13\uffff\1\11\7\uffff\1"+
        "\41\17\uffff\1\12\15\uffff\1\43\1\52\6\uffff\1\50\1\uffff\1\30\2"+
        "\uffff\1\42\1\32\1\45\4\uffff\1\1\1\uffff\1\21\1\14\1\31\2\uffff"+
        "\1\27\1\53\1\uffff\1\47\4\uffff\1\44\1\7\1\10\1\uffff\1\16\6\uffff"+
        "\1\33\7\uffff\1\5\1\uffff\1\6\1\22\2\uffff\1\23\5\uffff\1\37\1\uffff"+
        "\1\15\2\uffff\1\13\2\uffff\1\26\1\uffff\1\35\1\uffff\1\2\1\40\1"+
        "\20\1\34\1\24\1\25\1\uffff\1\36";
    static final String DFA36_specialS =
        "\1\1\27\uffff\1\3\1\0\1\2\u0136\uffff}>";
    static final String[] DFA36_transitionS = {
            "\11\66\1\24\1\23\2\66\1\22\22\66\1\24\1\35\1\31\1\26\1\66\1"+
            "\37\1\42\1\30\1\54\1\55\1\33\1\40\1\57\1\41\1\47\1\25\1\63\11"+
            "\64\1\50\1\56\1\27\1\34\1\36\1\46\1\60\32\65\1\45\1\66\1\53"+
            "\1\43\1\61\1\32\1\13\1\1\1\2\1\11\1\17\1\3\2\65\1\4\3\65\1\20"+
            "\1\14\1\16\1\21\1\65\1\5\1\6\1\7\1\12\1\15\1\10\3\65\1\51\1"+
            "\44\1\52\1\62\uff81\66",
            "\1\67",
            "\1\72\12\uffff\1\73\2\uffff\1\71",
            "\1\76\7\uffff\1\75\5\uffff\1\74",
            "\1\77\7\uffff\1\100\4\uffff\1\101\1\102",
            "\1\103",
            "\1\105\1\106\1\uffff\1\104",
            "\1\107\11\uffff\1\110",
            "\1\111",
            "\1\112\11\uffff\1\113",
            "\1\114",
            "\1\116\20\uffff\1\115",
            "\1\117\3\uffff\1\120\17\uffff\1\121",
            "\1\123\5\uffff\1\122",
            "\1\125\7\uffff\1\124",
            "\1\127\1\uffff\1\126",
            "\1\130",
            "\1\131\2\uffff\1\132",
            "\1\133",
            "",
            "",
            "\1\136\4\uffff\1\135\15\uffff\1\137",
            "\1\141",
            "\1\145\77\uffff\1\143",
            "\0\146",
            "\42\150\1\147\uffdd\150",
            "\0\151",
            "\1\152\22\uffff\1\137",
            "\1\154",
            "\1\154",
            "\1\157",
            "\1\137",
            "\1\161\21\uffff\1\137",
            "\1\164\17\uffff\1\137\1\163",
            "\1\166\26\uffff\1\137",
            "\1\137",
            "\1\137\76\uffff\1\171",
            "\1\173",
            "\1\175\1\176\13\uffff\1\177",
            "\1\u0081\1\uffff\12\u0083",
            "\1\u0084\2\uffff\1\u0085",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u009a",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u009b\14"+
            "\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u009f\22\uffff\1\u009e",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a4\10\uffff\1\u00a3",
            "\1\u00a6\3\uffff\1\u00a5",
            "\1\u00a7",
            "\1\u00a8",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00aa",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u00ab\7\70",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b2\2\uffff\1\u00b1",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9\5\uffff\1\u00ba",
            "\1\u00bb",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\137",
            "",
            "\1\u00bd",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\137",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bf\15\uffff\1\u00c0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c2",
            "\1\u00c4\1\u00c3",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00c8\25\70",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00de",
            "\1\u00df",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0104",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0106",
            "\1\u0107",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0110",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0114",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u0115\16"+
            "\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0118",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u011f\17\uffff\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff"+
            "\32\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0121",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "",
            "\1\u012d",
            "",
            "",
            "",
            "\1\u012e",
            "\1\u012f",
            "",
            "",
            "\1\u0130",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0132",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "\1\u0135",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0136",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\u013b",
            "\1\u013c",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u013e",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0140",
            "",
            "\1\u0141",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0143",
            "",
            "\1\u0144",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0146",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0148",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u014f",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KW_BREAK | KW_CONTINUE | KW_FOR | KW_IF | KW_RETURN | KW_SWITCH | KW_THROW | KW_WHILE | KW_TRY | KW_CASE | KW_DEFAULT | KW_CATCH | KW_FINALLY | KW_USING | KW_AS | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | KW_VOID | KW_CLASS | KW_ENUM | KW_MIXIN | KW_ABSTRACT | KW_PRIVATE | KW_PROTECTED | KW_PUBLIC | KW_INTERNAL | KW_NEW | KW_ONCE | KW_THIS | KW_SUPER | KW_ELSE | KW_IS | KW_ISNOT | KW_NULL | KW_IT | KW_TRUE | KW_FALSE | LB | WS | LINE_COMMENT | EXEC_COMMENT | MULTI_COMMENT | DSL | CHAR | QUOTSTR | STR | URI | DOC | KEYWORD | CP_EQUALITY | CP_COMPARATORS | AS_ASSIGN_OP | LIST_TYPE | OP_SAFEDYN_CALL | OP_ARROW | OP_SAFE_CALL | OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE | OP_ELVIS | SP_COLCOL | BRACKET_L | BRACKET_R | SQ_BRACKET_L | SQ_BRACKET_R | PAR_L | PAR_R | SP_COLON | SP_SEMI | SP_COMMA | SP_PIPE | AS_INIT_VAL | SP_QMARK | AT | OP_POUND | OP_CURRY | AS_EQUAL | OP_BITOR | UNDERSCORE | OP_AND | OP_OR | DOT | OP_2PLUS | OP_2MINUS | OP_MINUS | OP_PLUS | OP_LSHIFT | OP_RSHIFT | OP_MULTI | OP_DIV | OP_MOD | OP_BANG | OP_TILDA | NUMBER | ID | INCOMPLETE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_25 = input.LA(1);

                        s = -1;
                        if ( (LA36_25=='\"') ) {s = 103;}

                        else if ( ((LA36_25>='\u0000' && LA36_25<='!')||(LA36_25>='#' && LA36_25<='\uFFFF')) ) {s = 104;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_0 = input.LA(1);

                        s = -1;
                        if ( (LA36_0=='b') ) {s = 1;}

                        else if ( (LA36_0=='c') ) {s = 2;}

                        else if ( (LA36_0=='f') ) {s = 3;}

                        else if ( (LA36_0=='i') ) {s = 4;}

                        else if ( (LA36_0=='r') ) {s = 5;}

                        else if ( (LA36_0=='s') ) {s = 6;}

                        else if ( (LA36_0=='t') ) {s = 7;}

                        else if ( (LA36_0=='w') ) {s = 8;}

                        else if ( (LA36_0=='d') ) {s = 9;}

                        else if ( (LA36_0=='u') ) {s = 10;}

                        else if ( (LA36_0=='a') ) {s = 11;}

                        else if ( (LA36_0=='n') ) {s = 12;}

                        else if ( (LA36_0=='v') ) {s = 13;}

                        else if ( (LA36_0=='o') ) {s = 14;}

                        else if ( (LA36_0=='e') ) {s = 15;}

                        else if ( (LA36_0=='m') ) {s = 16;}

                        else if ( (LA36_0=='p') ) {s = 17;}

                        else if ( (LA36_0=='\r') ) {s = 18;}

                        else if ( (LA36_0=='\n') ) {s = 19;}

                        else if ( (LA36_0=='\t'||LA36_0==' ') ) {s = 20;}

                        else if ( (LA36_0=='/') ) {s = 21;}

                        else if ( (LA36_0=='#') ) {s = 22;}

                        else if ( (LA36_0=='<') ) {s = 23;}

                        else if ( (LA36_0=='\'') ) {s = 24;}

                        else if ( (LA36_0=='\"') ) {s = 25;}

                        else if ( (LA36_0=='`') ) {s = 26;}

                        else if ( (LA36_0=='*') ) {s = 27;}

                        else if ( (LA36_0=='=') ) {s = 28;}

                        else if ( (LA36_0=='!') ) {s = 29;}

                        else if ( (LA36_0=='>') ) {s = 30;}

                        else if ( (LA36_0=='%') ) {s = 31;}

                        else if ( (LA36_0=='+') ) {s = 32;}

                        else if ( (LA36_0=='-') ) {s = 33;}

                        else if ( (LA36_0=='&') ) {s = 34;}

                        else if ( (LA36_0=='^') ) {s = 35;}

                        else if ( (LA36_0=='|') ) {s = 36;}

                        else if ( (LA36_0=='[') ) {s = 37;}

                        else if ( (LA36_0=='?') ) {s = 38;}

                        else if ( (LA36_0=='.') ) {s = 39;}

                        else if ( (LA36_0==':') ) {s = 40;}

                        else if ( (LA36_0=='{') ) {s = 41;}

                        else if ( (LA36_0=='}') ) {s = 42;}

                        else if ( (LA36_0==']') ) {s = 43;}

                        else if ( (LA36_0=='(') ) {s = 44;}

                        else if ( (LA36_0==')') ) {s = 45;}

                        else if ( (LA36_0==';') ) {s = 46;}

                        else if ( (LA36_0==',') ) {s = 47;}

                        else if ( (LA36_0=='@') ) {s = 48;}

                        else if ( (LA36_0=='_') ) {s = 49;}

                        else if ( (LA36_0=='~') ) {s = 50;}

                        else if ( (LA36_0=='0') ) {s = 51;}

                        else if ( ((LA36_0>='1' && LA36_0<='9')) ) {s = 52;}

                        else if ( ((LA36_0>='A' && LA36_0<='Z')||(LA36_0>='g' && LA36_0<='h')||(LA36_0>='j' && LA36_0<='l')||LA36_0=='q'||(LA36_0>='x' && LA36_0<='z')) ) {s = 53;}

                        else if ( ((LA36_0>='\u0000' && LA36_0<='\b')||(LA36_0>='\u000B' && LA36_0<='\f')||(LA36_0>='\u000E' && LA36_0<='\u001F')||LA36_0=='$'||LA36_0=='\\'||(LA36_0>='\u007F' && LA36_0<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_26 = input.LA(1);

                        s = -1;
                        if ( ((LA36_26>='\u0000' && LA36_26<='\uFFFF')) ) {s = 105;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_24 = input.LA(1);

                        s = -1;
                        if ( ((LA36_24>='\u0000' && LA36_24<='\uFFFF')) ) {s = 102;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}