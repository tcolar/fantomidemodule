// $ANTLR 3.1.2 src/net/colar/netbeans/fan/antlr/Fan.g 2009-06-16 15:21:39
package net.colar.netbeans.fan.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FanLexer extends Lexer {
    public static final int AS_INIT_VAL=61;
    public static final int HEX_HEADER=107;
    public static final int OP_MULTI=79;
    public static final int NUMBER=97;
    public static final int QUOTSTR=91;
    public static final int KW_DEFAULT=14;
    public static final int OP_ELVIS=69;
    public static final int OP_2MINUS=84;
    public static final int FRACTION=112;
    public static final int OP_MOD=81;
    public static final int KW_NULL=43;
    public static final int KW_ISNOT=42;
    public static final int KW_BREAK=4;
    public static final int OP_LSHIFT=75;
    public static final int DOT=48;
    public static final int CP_COMPARATORS=68;
    public static final int PAR_R=56;
    public static final int OP_BITOR=73;
    public static final int KW_ENUM=29;
    public static final int OP_ARROW=60;
    public static final int OP_TILDA=85;
    public static final int EXEC_COMMENT=101;
    public static final int KW_CONST=20;
    public static final int HEXNB=108;
    public static final int AT=89;
    public static final int OP_BANG=82;
    public static final int LIST_TYPE=58;
    public static final int OP_SAFE_CALL=87;
    public static final int OP_DIV=80;
    public static final int KW_VOLATILE=23;
    public static final int DSL=86;
    public static final int WS=99;
    public static final int CHAR=94;
    public static final int KW_RETURN=8;
    public static final int OP_RANGE=72;
    public static final int OP_SAFEDYN_CALL=88;
    public static final int SP_SEMI=62;
    public static final int SP_COLON=53;
    public static final int SP_COMMA=54;
    public static final int KW_PRIVATE=32;
    public static final int OP_POUND=95;
    public static final int LINE_COMMENT=100;
    public static final int KW_OVERRIDE=24;
    public static final int KW_IS=41;
    public static final int HEXLETTER=104;
    public static final int KW_THROW=10;
    public static final int KW_PUBLIC=34;
    public static final int KW_ABSTRACT=31;
    public static final int OP_RANGE_EXCL=71;
    public static final int KW_INTERNAL=35;
    public static final int OP_MINUS=78;
    public static final int LB=98;
    public static final int OP_CURRY=74;
    public static final int KW_TRY=12;
    public static final int FRACTIONAL=110;
    public static final int KW_CLASS=28;
    public static final int HEXHEADER=111;
    public static final int UNDERSCORE=106;
    public static final int KW_SWITCH=9;
    public static final int KW_VOID=27;
    public static final int SP_QMARK=57;
    public static final int SP_PIPE=59;
    public static final int NBTYPE=114;
    public static final int KW_USING=17;
    public static final int KW_FALSE=46;
    public static final int KW_FOR=6;
    public static final int SQ_BRACKET_L=49;
    public static final int KW_IT=44;
    public static final int KW_FINAL=26;
    public static final int DOC=96;
    public static final int KW_VIRTUAL=25;
    public static final int KW_TRUE=45;
    public static final int DECIMAL=109;
    public static final int URI=93;
    public static final int KW_THIS=38;
    public static final int PAR_L=55;
    public static final int OP_OR=65;
    public static final int OP_PLUS=77;
    public static final int KW_CASE=13;
    public static final int KW_ELSE=40;
    public static final int BRACKET_L=51;
    public static final int KW_CONTINUE=5;
    public static final int OP_RSHIFT=76;
    public static final int DIGIT=103;
    public static final int KW_MIXIN=30;
    public static final int KW_FINALLY=16;
    public static final int ID=90;
    public static final int LETTER=115;
    public static final int AS_EQUAL=63;
    public static final int KW_RD_ONLY=19;
    public static final int KW_STATIC=21;
    public static final int KW_NEW=36;
    public static final int KEYWORD=105;
    public static final int AS_ASSIGN_OP=64;
    public static final int KW_AS=18;
    public static final int BRACKET_R=52;
    public static final int STR=92;
    public static final int MULTI_COMMENT=102;
    public static final int KW_SUPER=39;
    public static final int OP_AND=66;
    public static final int KW_CATCH=15;
    public static final int KW_WHILE=11;
    public static final int KW_ONCE=37;
    public static final int KW_PROTECTED=33;
    public static final int EXPONENT=113;
    public static final int EOF=-1;
    public static final int OP_2PLUS=83;
    public static final int SP_COLCOL=47;
    public static final int SQ_BRACKET_R=50;
    public static final int CP_EQUALITY=67;
    public static final int OP_RANG_EXCL_OLD=70;
    public static final int KW_IF=7;
    public static final int KW_NATIVE=22;

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
            // src/net/colar/netbeans/fan/antlr/Fan.g:3:10: ( 'break' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:3:12: 'break'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:4:13: ( 'continue' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:4:15: 'continue'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:5:8: ( 'for' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:5:10: 'for'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:6:7: ( 'if' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:6:9: 'if'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:7:11: ( 'return' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:7:13: 'return'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:8:11: ( 'switch' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:8:13: 'switch'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:9:10: ( 'throw ' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:9:12: 'throw '
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:10:10: ( 'while' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:10:12: 'while'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:11:8: ( 'try' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:11:10: 'try'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:12:9: ( 'case' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:12:11: 'case'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:13:12: ( 'default' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:13:14: 'default'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:14:10: ( 'catch' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:14:12: 'catch'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:15:12: ( 'finally' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:15:14: 'finally'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:16:10: ( 'using' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:16:12: 'using'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:17:7: ( 'as' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:17:9: 'as'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:18:12: ( 'readonly' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:18:14: 'readonly'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:19:10: ( 'const' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:19:12: 'const'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:20:11: ( 'static' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:20:13: 'static'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:21:11: ( 'native' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:21:13: 'native'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:22:13: ( 'volatile' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:22:15: 'volatile'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:23:13: ( 'override' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:23:15: 'override'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:24:12: ( 'virtual' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:24:14: 'virtual'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:25:10: ( 'final' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:25:12: 'final'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:26:9: ( 'void' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:26:11: 'void'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:27:10: ( 'class' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:27:12: 'class'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:28:9: ( 'enum' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:28:11: 'enum'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:29:10: ( 'mixin' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:29:12: 'mixin'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:30:13: ( 'abstract' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:30:15: 'abstract'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:31:12: ( 'private' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:31:14: 'private'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:32:14: ( 'protected' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:32:16: 'protected'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:33:11: ( 'public' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:33:13: 'public'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:34:13: ( 'internal' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:34:15: 'internal'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:35:8: ( 'new' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:35:10: 'new'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:36:9: ( 'once' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:36:11: 'once'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:37:9: ( 'this' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:37:11: 'this'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:38:10: ( 'super' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:38:12: 'super'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:39:9: ( 'else' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:39:11: 'else'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:40:7: ( 'is' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:40:9: 'is'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:41:10: ( 'isnot' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:41:12: 'isnot'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:42:9: ( 'null' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:42:11: 'null'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:43:7: ( 'it' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:43:9: 'it'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:44:9: ( 'true' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:44:11: 'true'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:45:10: ( 'false' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:45:12: 'false'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:382:5: ( ( ( '\\r\\n' ) | '\\n' )+ )
            // src/net/colar/netbeans/fan/antlr/Fan.g:382:7: ( ( '\\r\\n' ) | '\\n' )+
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:382:7: ( ( '\\r\\n' ) | '\\n' )+
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:382:8: ( '\\r\\n' )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:382:8: ( '\\r\\n' )
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:382:9: '\\r\\n'
            	    {
            	    match("\r\n"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:382:19: '\\n'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:7: ( ( ' ' | '\\t' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:384:10: ( ' ' | '\\t' )
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:14: ( '//' (~ ( '\\n' ) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:385:16: '//' (~ ( '\\n' ) )*
            {
            match("//"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:385:21: (~ ( '\\n' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:385:22: ~ ( '\\n' )
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:14: ( '#!' (~ ( '\\n' ) )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:386:16: '#!' (~ ( '\\n' ) )*
            {
            match("#!"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:386:21: (~ ( '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:386:22: ~ ( '\\n' )
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:15: ( ( '/*' ( options {greedy=false; } : . )* '*/' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:387:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:387:24: ( options {greedy=false; } : . )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:387:52: .
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:389:6: ( '<|' ( options {greedy=false; } : . )* '|>' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:389:7: '<|' ( options {greedy=false; } : . )* '|>'
            {
            match("<|"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:389:12: ( options {greedy=false; } : . )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:389:40: .
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:390:7: ( '\\'' ( ( '\\\\' . ) | ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ) | . )? '\\'' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:390:8: '\\'' ( ( '\\\\' . ) | ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ) | . )? '\\''
            {
            match('\''); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:390:13: ( ( '\\\\' . ) | ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ) | . )?
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:14: ( '\\\\' . )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:14: ( '\\\\' . )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:15: '\\\\' .
                    {
                    match('\\'); if (state.failed) return ;
                    matchAny(); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:25: ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:25: ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:390:26: '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:391:47: .
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:10: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:393:12: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
            {
            match("\"\"\""); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:393:18: ( options {greedy=false; } : . )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:393:46: .
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:6: ( ( '\"' ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )* '\"' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:8: ( '\"' ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )* '\"' )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:8: ( '\"' ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )* '\"' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:10: '\"' ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:394:14: ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:394:16: ( '\\\\\\\\' )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:394:16: ( '\\\\\\\\' )
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:394:17: '\\\\\\\\'
            	    {
            	    match("\\\\"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:394:27: ( '\\\\\"' )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:394:27: ( '\\\\\"' )
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:394:28: '\\\\\"'
            	    {
            	    match("\\\""); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:394:37: ~ ( '\"' )
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:6: ( ( '`' ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:8: ( '`' ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`' )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:8: ( '`' ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:10: '`' ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`'
            {
            match('`'); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:395:14: ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:395:16: ( '\\\\\\\\' )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:395:16: ( '\\\\\\\\' )
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:395:17: '\\\\\\\\'
            	    {
            	    match("\\\\"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 2 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:395:27: ( '\\\\`' )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:395:27: ( '\\\\`' )
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:395:28: '\\\\`'
            	    {
            	    match("\\`"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 3 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:395:37: ~ ( '`' )
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:7: ( '**' ( options {greedy=false; } : . )* '\\n' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:399:11: '**' ( options {greedy=false; } : . )* '\\n'
            {
            match("**"); if (state.failed) return ;

            // src/net/colar/netbeans/fan/antlr/Fan.g:399:16: ( options {greedy=false; } : . )*
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:399:44: .
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:10: ( ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:12: ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:402:12: ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' )
            int alt11=45;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:402:13: 'abstract'
                    {
                    match("abstract"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:402:26: 'as'
                    {
                    match("as"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:402:33: 'assert'
                    {
                    match("assert"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:402:44: 'break'
                    {
                    match("break"); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:402:54: 'case'
                    {
                    match("case"); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:402:63: 'catch'
                    {
                    match("catch"); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:403:3: 'class'
                    {
                    match("class"); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:403:13: 'const'
                    {
                    match("const"); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:403:23: 'continue'
                    {
                    match("continue"); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:403:36: 'default'
                    {
                    match("default"); if (state.failed) return ;


                    }
                    break;
                case 11 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:403:48: 'do'
                    {
                    match("do"); if (state.failed) return ;


                    }
                    break;
                case 12 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:403:55: 'else'
                    {
                    match("else"); if (state.failed) return ;


                    }
                    break;
                case 13 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:403:64: 'enum'
                    {
                    match("enum"); if (state.failed) return ;


                    }
                    break;
                case 14 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:403:73: 'false'
                    {
                    match("false"); if (state.failed) return ;


                    }
                    break;
                case 15 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:4: 'final'
                    {
                    match("final"); if (state.failed) return ;


                    }
                    break;
                case 16 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:14: 'finally'
                    {
                    match("finally"); if (state.failed) return ;


                    }
                    break;
                case 17 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:26: 'for'
                    {
                    match("for"); if (state.failed) return ;


                    }
                    break;
                case 18 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:34: 'foreach'
                    {
                    match("foreach"); if (state.failed) return ;


                    }
                    break;
                case 19 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:46: 'if'
                    {
                    match("if"); if (state.failed) return ;


                    }
                    break;
                case 20 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:53: 'internal'
                    {
                    match("internal"); if (state.failed) return ;


                    }
                    break;
                case 21 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:66: 'is'
                    {
                    match("is"); if (state.failed) return ;


                    }
                    break;
                case 22 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:404:73: 'isnot'
                    {
                    match("isnot"); if (state.failed) return ;


                    }
                    break;
                case 23 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:4: 'mixin'
                    {
                    match("mixin"); if (state.failed) return ;


                    }
                    break;
                case 24 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:14: 'native'
                    {
                    match("native"); if (state.failed) return ;


                    }
                    break;
                case 25 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:25: 'new'
                    {
                    match("new"); if (state.failed) return ;


                    }
                    break;
                case 26 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:33: 'null'
                    {
                    match("null"); if (state.failed) return ;


                    }
                    break;
                case 27 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:42: 'once'
                    {
                    match("once"); if (state.failed) return ;


                    }
                    break;
                case 28 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:51: 'override'
                    {
                    match("override"); if (state.failed) return ;


                    }
                    break;
                case 29 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:405:64: 'private'
                    {
                    match("private"); if (state.failed) return ;


                    }
                    break;
                case 30 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:4: 'protected'
                    {
                    match("protected"); if (state.failed) return ;


                    }
                    break;
                case 31 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:18: 'public'
                    {
                    match("public"); if (state.failed) return ;


                    }
                    break;
                case 32 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:29: 'readonly'
                    {
                    match("readonly"); if (state.failed) return ;


                    }
                    break;
                case 33 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:42: 'return'
                    {
                    match("return"); if (state.failed) return ;


                    }
                    break;
                case 34 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:53: 'static'
                    {
                    match("static"); if (state.failed) return ;


                    }
                    break;
                case 35 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:64: 'super'
                    {
                    match("super"); if (state.failed) return ;


                    }
                    break;
                case 36 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:406:74: 'switch'
                    {
                    match("switch"); if (state.failed) return ;


                    }
                    break;
                case 37 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:3: 'this'
                    {
                    match("this"); if (state.failed) return ;


                    }
                    break;
                case 38 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:12: 'throw'
                    {
                    match("throw"); if (state.failed) return ;


                    }
                    break;
                case 39 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:22: 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 40 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:31: 'try'
                    {
                    match("try"); if (state.failed) return ;


                    }
                    break;
                case 41 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:39: 'using'
                    {
                    match("using"); if (state.failed) return ;


                    }
                    break;
                case 42 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:49: 'virtual'
                    {
                    match("virtual"); if (state.failed) return ;


                    }
                    break;
                case 43 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:61: 'volatile'
                    {
                    match("volatile"); if (state.failed) return ;


                    }
                    break;
                case 44 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:407:74: 'void'
                    {
                    match("void"); if (state.failed) return ;


                    }
                    break;
                case 45 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:408:3: 'while'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:412:13: ( '===' | '!==' | '==' | '!=' )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:412:14: '==='
                    {
                    match("==="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:412:22: '!=='
                    {
                    match("!=="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:412:30: '=='
                    {
                    match("=="); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:412:37: '!='
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:413:16: ( '<=>' | '<=' | '<' | '>=' | '>' )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:17: '<=>'
                    {
                    match("<=>"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:25: '<='
                    {
                    match("<="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:32: '<'
                    {
                    match('<'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:38: '>='
                    {
                    match(">="); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:413:45: '>'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:414:14: ( '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:15: '*='
                    {
                    match("*="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:22: '/='
                    {
                    match("/="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:29: '%='
                    {
                    match("%="); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:36: '+='
                    {
                    match("+="); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:43: '-='
                    {
                    match("-="); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:50: '<<='
                    {
                    match("<<="); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:58: '>>='
                    {
                    match(">>="); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:66: '&='
                    {
                    match("&="); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:73: '^='
                    {
                    match("^="); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:414:80: '|='
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:415:11: ( '[]' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:415:12: '[]'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:17: ( '?->' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:416:18: '?->'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:10: ( '->' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:417:11: '->'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:14: ( '?.' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:418:15: '?.'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:419:17: ( '...' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:419:18: '...'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:15: ( '..<' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:420:16: '..<'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:10: ( '..' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:421:11: '..'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:10: ( '?:' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:422:11: '?:'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:11: ( '::' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:423:12: '::'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:424:11: ( '{' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:424:12: '{'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:425:11: ( '}' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:425:12: '}'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:426:14: ( '[' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:426:15: '['
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:427:14: ( ']' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:427:15: ']'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:428:8: ( '(' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:428:9: '('
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:8: ( ')' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:429:9: ')'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:10: ( ':' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:430:11: ':'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:431:10: ( ';' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:431:11: ';'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:432:10: ( ',' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:432:11: ','
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:433:10: ( '|' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:433:11: '|'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:13: ( ':=' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:434:14: ':='
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:10: ( '?' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:435:11: '?'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:436:5: ( '@' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:436:6: '@'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:437:10: ( '#' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:437:11: '#'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:438:10: ( '&' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:438:11: '&'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:439:10: ( '=' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:439:11: '='
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:10: ( '^' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:440:11: '^'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:12: ( '_' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:441:13: '_'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:442:9: ( '&&' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:442:10: '&&'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:8: ( '||' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:443:9: '||'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:6: ( '.' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:444:7: '.'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:445:10: ( '++' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:445:11: '++'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:446:11: ( '--' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:446:12: '--'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:447:10: ( '-' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:447:11: '-'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:448:10: ( '+' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:448:11: '+'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:11: ( '<<' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:449:12: '<<'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:11: ( '>>' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:450:12: '>>'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:451:10: ( '*' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:451:11: '*'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:9: ( '/' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:452:10: '/'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:453:9: ( '%' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:453:10: '%'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:454:10: ( '!' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:454:11: '!'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:455:10: ( '~' )
            // src/net/colar/netbeans/fan/antlr/Fan.g:455:11: '~'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:460:21: ( '0x' | '0X' )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:460:24: '0x'
                    {
                    match("0x"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:460:31: '0X'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:10: ( ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:13: ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL )
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:462:13: ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:462:14: ( HEXNB )=> HEXNB
                    {
                    mHEXNB(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:462:31: ( DECIMAL )=> DECIMAL
                    {
                    mDECIMAL(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:462:52: FRACTIONAL
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:463:17: ( HEXHEADER ( ( UNDERSCORE )* ( DIGIT | HEXLETTER ) )+ )
            // src/net/colar/netbeans/fan/antlr/Fan.g:463:19: HEXHEADER ( ( UNDERSCORE )* ( DIGIT | HEXLETTER ) )+
            {
            mHEXHEADER(); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:463:29: ( ( UNDERSCORE )* ( DIGIT | HEXLETTER ) )+
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
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:463:30: ( UNDERSCORE )* ( DIGIT | HEXLETTER )
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:463:30: ( UNDERSCORE )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0=='_') ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // src/net/colar/netbeans/fan/antlr/Fan.g:463:30: UNDERSCORE
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:464:18: ( DIGIT ( ( UNDERSCORE )* DIGIT )* ( ( FRACTION )=> FRACTION )? ( ( EXPONENT )=> EXPONENT )? ( NBTYPE )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:464:20: DIGIT ( ( UNDERSCORE )* DIGIT )* ( ( FRACTION )=> FRACTION )? ( ( EXPONENT )=> EXPONENT )? ( NBTYPE )?
            {
            mDIGIT(); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:464:26: ( ( UNDERSCORE )* DIGIT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')||LA20_0=='_') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:464:27: ( UNDERSCORE )* DIGIT
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:464:27: ( UNDERSCORE )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0=='_') ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // src/net/colar/netbeans/fan/antlr/Fan.g:464:27: UNDERSCORE
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

            // src/net/colar/netbeans/fan/antlr/Fan.g:464:47: ( ( FRACTION )=> FRACTION )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='.') && (synpred3_Fan())) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:464:48: ( FRACTION )=> FRACTION
                    {
                    mFRACTION(); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:465:6: ( ( EXPONENT )=> EXPONENT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='E'||LA22_0=='e') && (synpred4_Fan())) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:7: ( EXPONENT )=> EXPONENT
                    {
                    mEXPONENT(); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:465:30: ( NBTYPE )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='D'||LA23_0=='F'||LA23_0=='d'||LA23_0=='f'||LA23_0=='h'||(LA23_0>='m' && LA23_0<='n')||LA23_0=='s') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:465:30: NBTYPE
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:466:21: ( FRACTION ( EXPONENT )? ( NBTYPE )? )
            // src/net/colar/netbeans/fan/antlr/Fan.g:466:23: FRACTION ( EXPONENT )? ( NBTYPE )?
            {
            mFRACTION(); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:466:32: ( EXPONENT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='E'||LA24_0=='e') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:466:32: EXPONENT
                    {
                    mEXPONENT(); if (state.failed) return ;

                    }
                    break;

            }

            // src/net/colar/netbeans/fan/antlr/Fan.g:466:42: ( NBTYPE )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='D'||LA25_0=='F'||LA25_0=='d'||LA25_0=='f'||LA25_0=='h'||(LA25_0>='m' && LA25_0<='n')||LA25_0=='s') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:466:42: NBTYPE
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:467:19: ( DOT DIGIT ( ( UNDERSCORE )* DIGIT )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:467:21: DOT DIGIT ( ( UNDERSCORE )* DIGIT )*
            {
            mDOT(); if (state.failed) return ;
            mDIGIT(); if (state.failed) return ;
            // src/net/colar/netbeans/fan/antlr/Fan.g:467:31: ( ( UNDERSCORE )* DIGIT )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='0' && LA27_0<='9')||LA27_0=='_') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:467:32: ( UNDERSCORE )* DIGIT
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:467:32: ( UNDERSCORE )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0=='_') ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // src/net/colar/netbeans/fan/antlr/Fan.g:467:32: UNDERSCORE
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:19: ( ( 'e' | 'E' ) ( '+' | OP_MINUS )? DIGIT ( ( UNDERSCORE )* DIGIT )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:21: ( 'e' | 'E' ) ( '+' | OP_MINUS )? DIGIT ( ( UNDERSCORE )* DIGIT )*
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

            // src/net/colar/netbeans/fan/antlr/Fan.g:468:31: ( '+' | OP_MINUS )?
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:468:55: ( ( UNDERSCORE )* DIGIT )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='0' && LA30_0<='9')||LA30_0=='_') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:468:56: ( UNDERSCORE )* DIGIT
            	    {
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:468:56: ( UNDERSCORE )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0=='_') ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // src/net/colar/netbeans/fan/antlr/Fan.g:468:56: UNDERSCORE
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:470:18: ( 'F' | 'f' | 'D' | ( 'd' ( 'ay' )? ) | 'ms' | 'ns' | 'sec' | 'min' | 'hr' )
            int alt32=9;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:470:20: 'F'
                    {
                    match('F'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:470:26: 'f'
                    {
                    match('f'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:470:32: 'D'
                    {
                    match('D'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:470:38: ( 'd' ( 'ay' )? )
                    {
                    // src/net/colar/netbeans/fan/antlr/Fan.g:470:38: ( 'd' ( 'ay' )? )
                    // src/net/colar/netbeans/fan/antlr/Fan.g:470:39: 'd' ( 'ay' )?
                    {
                    match('d'); if (state.failed) return ;
                    // src/net/colar/netbeans/fan/antlr/Fan.g:470:43: ( 'ay' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='a') ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // src/net/colar/netbeans/fan/antlr/Fan.g:470:43: 'ay'
                            {
                            match("ay"); if (state.failed) return ;


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:470:52: 'ms'
                    {
                    match("ms"); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:470:59: 'ns'
                    {
                    match("ns"); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:471:6: 'sec'
                    {
                    match("sec"); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:471:14: 'min'
                    {
                    match("min"); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:471:22: 'hr'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:472:20: ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:473:20: ( '0x' | '0X' )
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
                    // src/net/colar/netbeans/fan/antlr/Fan.g:473:23: '0x'
                    {
                    match("0x"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // src/net/colar/netbeans/fan/antlr/Fan.g:473:30: '0X'
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:6: ( ( ( UNDERSCORE )* LETTER ) ( LETTER | DIGIT | UNDERSCORE )* )
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:8: ( ( UNDERSCORE )* LETTER ) ( LETTER | DIGIT | UNDERSCORE )*
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:8: ( ( UNDERSCORE )* LETTER )
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:9: ( UNDERSCORE )* LETTER
            {
            // src/net/colar/netbeans/fan/antlr/Fan.g:476:9: ( UNDERSCORE )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0=='_') ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // src/net/colar/netbeans/fan/antlr/Fan.g:476:9: UNDERSCORE
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

            // src/net/colar/netbeans/fan/antlr/Fan.g:476:29: ( LETTER | DIGIT | UNDERSCORE )*
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:478:18: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // src/net/colar/netbeans/fan/antlr/Fan.g:478:20: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // src/net/colar/netbeans/fan/antlr/Fan.g:479:17: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )
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

    public void mTokens() throws RecognitionException {
        // src/net/colar/netbeans/fan/antlr/Fan.g:1:8: ( KW_BREAK | KW_CONTINUE | KW_FOR | KW_IF | KW_RETURN | KW_SWITCH | KW_THROW | KW_WHILE | KW_TRY | KW_CASE | KW_DEFAULT | KW_CATCH | KW_FINALLY | KW_USING | KW_AS | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | KW_VOID | KW_CLASS | KW_ENUM | KW_MIXIN | KW_ABSTRACT | KW_PRIVATE | KW_PROTECTED | KW_PUBLIC | KW_INTERNAL | KW_NEW | KW_ONCE | KW_THIS | KW_SUPER | KW_ELSE | KW_IS | KW_ISNOT | KW_NULL | KW_IT | KW_TRUE | KW_FALSE | LB | WS | LINE_COMMENT | EXEC_COMMENT | MULTI_COMMENT | DSL | CHAR | QUOTSTR | STR | URI | DOC | KEYWORD | CP_EQUALITY | CP_COMPARATORS | AS_ASSIGN_OP | LIST_TYPE | OP_SAFEDYN_CALL | OP_ARROW | OP_SAFE_CALL | OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE | OP_ELVIS | SP_COLCOL | BRACKET_L | BRACKET_R | SQ_BRACKET_L | SQ_BRACKET_R | PAR_L | PAR_R | SP_COLON | SP_SEMI | SP_COMMA | SP_PIPE | AS_INIT_VAL | SP_QMARK | AT | OP_POUND | OP_CURRY | AS_EQUAL | OP_BITOR | UNDERSCORE | OP_AND | OP_OR | DOT | OP_2PLUS | OP_2MINUS | OP_MINUS | OP_PLUS | OP_LSHIFT | OP_RSHIFT | OP_MULTI | OP_DIV | OP_MOD | OP_BANG | OP_TILDA | NUMBER | ID )
        int alt36=101;
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

        }

    }

    // $ANTLR start synpred1_Fan
    public final void synpred1_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:462:14: ( HEXNB )
        // src/net/colar/netbeans/fan/antlr/Fan.g:462:15: HEXNB
        {
        mHEXNB(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Fan

    // $ANTLR start synpred2_Fan
    public final void synpred2_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:462:31: ( DECIMAL )
        // src/net/colar/netbeans/fan/antlr/Fan.g:462:32: DECIMAL
        {
        mDECIMAL(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Fan

    // $ANTLR start synpred3_Fan
    public final void synpred3_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:464:48: ( FRACTION )
        // src/net/colar/netbeans/fan/antlr/Fan.g:464:49: FRACTION
        {
        mFRACTION(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Fan

    // $ANTLR start synpred4_Fan
    public final void synpred4_Fan_fragment() throws RecognitionException {   
        // src/net/colar/netbeans/fan/antlr/Fan.g:465:7: ( EXPONENT )
        // src/net/colar/netbeans/fan/antlr/Fan.g:465:8: EXPONENT
        {
        mEXPONENT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Fan

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
            return "402:12: ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' )";
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
            return "462:13: ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL )";
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
            return "470:10: fragment NBTYPE : ( 'F' | 'f' | 'D' | ( 'd' ( 'ay' )? ) | 'ms' | 'ns' | 'sec' | 'min' | 'hr' );";
        }
    }
    static final String DFA36_eotS =
        "\1\uffff\21\63\2\uffff\1\132\1\134\1\136\3\uffff\1\143\1\145\1\146"+
        "\1\136\1\150\1\152\1\155\1\157\1\160\1\162\1\164\1\170\1\172\1\175"+
        "\10\uffff\1\176\3\uffff\7\63\1\u0087\1\63\1\u008a\1\u008b\10\63"+
        "\1\u0097\1\63\1\u009a\15\63\10\uffff\1\u00aa\1\141\6\uffff\1\u00ac"+
        "\21\uffff\1\u00af\5\uffff\5\63\1\u00b7\2\63\1\uffff\2\63\2\uffff"+
        "\7\63\1\u00c3\3\63\1\uffff\2\63\1\uffff\2\63\1\u00cb\14\63\6\uffff"+
        "\3\63\1\u00db\3\63\1\uffff\12\63\1\u00e9\1\uffff\1\u00ea\6\63\1"+
        "\uffff\1\u00f1\1\63\1\u00f3\2\63\1\u00f6\1\u00f7\1\u00f8\4\63\1"+
        "\u00fd\1\63\1\u00ff\1\uffff\1\u0100\1\u0101\1\63\1\u0104\1\u0105"+
        "\1\63\1\u0107\4\63\1\u010c\1\u0097\2\uffff\1\u010e\1\63\1\u0110"+
        "\3\63\1\uffff\1\63\1\uffff\2\63\3\uffff\1\u0117\3\63\1\uffff\1\63"+
        "\3\uffff\2\63\2\uffff\1\63\1\uffff\1\u011f\1\63\1\u0121\1\u0122"+
        "\3\uffff\1\63\1\uffff\1\u0097\1\63\1\u0125\3\63\1\uffff\2\63\1\u012b"+
        "\1\63\1\u0097\1\u012d\1\63\1\uffff\1\63\2\uffff\1\u0130\1\63\1\uffff"+
        "\1\63\1\u0133\1\63\1\u0135\1\63\1\uffff\1\u0137\1\uffff\1\u0138"+
        "\1\u0139\1\uffff\1\u013a\1\u013b\1\uffff\1\u013c\1\uffff\1\63\6"+
        "\uffff\1\u013e\1\uffff";
    static final String DFA36_eofS =
        "\u013f\uffff";
    static final String DFA36_minS =
        "\1\11\1\162\2\141\1\146\1\145\1\164\2\150\1\145\1\163\1\142\1\141"+
        "\1\151\1\156\1\154\1\151\1\162\2\uffff\1\52\1\41\1\74\1\uffff\1"+
        "\0\1\uffff\1\52\2\75\1\76\1\75\1\53\1\55\1\46\2\75\1\135\1\55\1"+
        "\56\1\72\10\uffff\1\101\3\uffff\1\145\1\156\1\163\1\141\1\162\1"+
        "\156\1\154\1\60\1\164\2\60\1\141\1\151\1\141\1\160\1\151\1\165\1"+
        "\151\1\146\1\60\1\151\1\60\1\163\1\164\1\167\1\154\1\151\1\162\1"+
        "\145\1\143\1\165\1\163\1\170\1\151\1\142\10\uffff\1\75\1\42\6\uffff"+
        "\1\75\21\uffff\1\56\5\uffff\1\141\1\163\1\145\1\143\1\163\1\60\1"+
        "\141\1\163\1\uffff\1\145\1\157\2\uffff\1\165\1\144\2\164\1\145\1"+
        "\157\1\163\1\60\1\145\1\154\1\141\1\uffff\1\156\1\145\1\uffff\1"+
        "\164\1\151\1\60\1\154\1\141\1\144\1\164\1\162\1\145\1\155\1\145"+
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
        "\1\176\1\162\2\157\1\164\1\145\1\167\1\162\1\150\1\157\2\163\1\165"+
        "\1\157\1\166\1\156\1\151\1\165\2\uffff\1\75\1\41\1\174\1\uffff\1"+
        "\uffff\1\uffff\3\75\1\76\2\75\1\76\2\75\1\174\1\135\1\72\1\71\1"+
        "\75\10\uffff\1\172\3\uffff\1\145\1\156\1\164\1\141\1\162\1\156\1"+
        "\154\1\172\1\164\2\172\1\164\1\151\1\141\1\160\1\162\1\171\1\151"+
        "\1\146\1\172\1\151\1\172\1\163\1\164\1\167\2\154\1\162\1\145\1\143"+
        "\1\165\1\163\1\170\1\157\1\142\10\uffff\1\75\1\42\6\uffff\1\75\21"+
        "\uffff\1\74\5\uffff\1\141\1\164\1\145\1\143\1\163\1\172\1\141\1"+
        "\163\1\uffff\1\145\1\157\2\uffff\1\165\1\144\2\164\1\145\1\157\1"+
        "\163\1\172\1\145\1\154\1\141\1\uffff\1\156\1\145\1\uffff\1\164\1"+
        "\151\1\172\1\154\1\141\1\144\1\164\1\162\1\145\1\155\1\145\1\151"+
        "\1\166\1\164\1\154\6\uffff\1\153\1\151\1\164\1\172\1\150\1\163\1"+
        "\141\1\uffff\1\154\1\145\1\162\1\164\1\162\1\157\1\143\1\151\1\162"+
        "\1\167\1\172\1\uffff\1\172\1\145\1\165\1\147\2\162\1\166\1\uffff"+
        "\1\172\1\164\1\172\1\165\1\162\3\172\1\156\1\141\1\145\1\151\1\172"+
        "\1\156\1\172\1\uffff\2\172\1\143\2\172\1\156\1\172\2\156\1\150\1"+
        "\143\2\172\2\uffff\1\172\1\154\1\172\1\164\1\141\1\145\1\uffff\1"+
        "\151\1\uffff\1\141\1\151\3\uffff\1\172\1\164\2\143\1\uffff\1\165"+
        "\3\uffff\1\150\1\171\2\uffff\1\141\1\uffff\1\172\1\154\2\172\3\uffff"+
        "\1\164\1\uffff\1\172\1\143\1\172\2\154\1\144\1\uffff\1\145\1\164"+
        "\1\172\1\145\2\172\1\154\1\uffff\1\171\2\uffff\1\172\1\164\1\uffff"+
        "\1\145\1\172\1\145\1\172\1\145\1\uffff\1\172\1\uffff\2\172\1\uffff"+
        "\2\172\1\uffff\1\172\1\uffff\1\144\6\uffff\1\172\1\uffff";
    static final String DFA36_acceptS =
        "\22\uffff\1\54\1\55\3\uffff\1\62\1\uffff\1\65\16\uffff\1\104\1\105"+
        "\1\107\1\110\1\111\1\113\1\114\1\120\1\uffff\1\143\1\144\1\145\43"+
        "\uffff\1\56\1\60\1\72\1\140\1\57\1\121\1\61\1\71\2\uffff\1\64\1"+
        "\66\1\137\1\70\1\123\1\142\1\uffff\1\141\1\131\1\134\1\75\1\132"+
        "\1\133\1\126\1\122\1\124\1\127\1\115\1\73\1\106\1\74\1\76\1\102"+
        "\1\117\1\uffff\1\130\1\103\1\116\1\112\1\125\10\uffff\1\4\2\uffff"+
        "\1\46\1\51\13\uffff\1\67\2\uffff\1\17\17\uffff\1\135\1\63\1\136"+
        "\1\77\1\100\1\101\7\uffff\1\3\13\uffff\1\11\7\uffff\1\41\17\uffff"+
        "\1\12\15\uffff\1\43\1\52\6\uffff\1\50\1\uffff\1\30\2\uffff\1\42"+
        "\1\32\1\45\4\uffff\1\1\1\uffff\1\21\1\14\1\31\2\uffff\1\27\1\53"+
        "\1\uffff\1\47\4\uffff\1\44\1\7\1\10\1\uffff\1\16\6\uffff\1\33\7"+
        "\uffff\1\5\1\uffff\1\6\1\22\2\uffff\1\23\5\uffff\1\37\1\uffff\1"+
        "\15\2\uffff\1\13\2\uffff\1\26\1\uffff\1\35\1\uffff\1\2\1\40\1\20"+
        "\1\34\1\24\1\25\1\uffff\1\36";
    static final String DFA36_specialS =
        "\30\uffff\1\0\u0126\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\23\1\22\2\uffff\1\22\22\uffff\1\23\1\34\1\30\1\25\1\uffff"+
            "\1\36\1\41\1\27\1\53\1\54\1\32\1\37\1\56\1\40\1\46\1\24\12\62"+
            "\1\47\1\55\1\26\1\33\1\35\1\45\1\57\32\63\1\44\1\uffff\1\52"+
            "\1\42\1\60\1\31\1\13\1\1\1\2\1\11\1\17\1\3\2\63\1\4\3\63\1\20"+
            "\1\14\1\16\1\21\1\63\1\5\1\6\1\7\1\12\1\15\1\10\3\63\1\50\1"+
            "\43\1\51\1\61",
            "\1\64",
            "\1\66\12\uffff\1\67\2\uffff\1\65",
            "\1\72\7\uffff\1\71\5\uffff\1\70",
            "\1\73\7\uffff\1\74\4\uffff\1\75\1\76",
            "\1\77",
            "\1\101\1\102\1\uffff\1\100",
            "\1\103\11\uffff\1\104",
            "\1\105",
            "\1\106\11\uffff\1\107",
            "\1\110",
            "\1\112\20\uffff\1\111",
            "\1\113\3\uffff\1\114\17\uffff\1\115",
            "\1\117\5\uffff\1\116",
            "\1\121\7\uffff\1\120",
            "\1\123\1\uffff\1\122",
            "\1\124",
            "\1\125\2\uffff\1\126",
            "",
            "",
            "\1\130\4\uffff\1\127\15\uffff\1\131",
            "\1\133",
            "\1\137\77\uffff\1\135",
            "",
            "\42\141\1\140\uffdd\141",
            "",
            "\1\142\22\uffff\1\131",
            "\1\144",
            "\1\144",
            "\1\147",
            "\1\131",
            "\1\151\21\uffff\1\131",
            "\1\154\17\uffff\1\131\1\153",
            "\1\156\26\uffff\1\131",
            "\1\131",
            "\1\131\76\uffff\1\161",
            "\1\163",
            "\1\165\1\166\13\uffff\1\167",
            "\1\171\1\uffff\12\62",
            "\1\173\2\uffff\1\174",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0088",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u0089\14"+
            "\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u008d\22\uffff\1\u008c",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0092\10\uffff\1\u0091",
            "\1\u0094\3\uffff\1\u0093",
            "\1\u0095",
            "\1\u0096",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0098",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u0099\7\63",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u00a0\2\uffff\1\u009f",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7\5\uffff\1\u00a8",
            "\1\u00a9",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\131",
            "\1\u00ab",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ad\15\uffff\1\u00ae",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b0",
            "\1\u00b2\1\u00b1",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00b6\25\63",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "",
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
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f2",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f4",
            "\1\u00f5",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00fe",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0102",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u0103\16"+
            "\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0106",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u010d\17\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
            "\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u010f",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "\1\u011b",
            "",
            "",
            "",
            "\1\u011c",
            "\1\u011d",
            "",
            "",
            "\1\u011e",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0120",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "\1\u0123",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0124",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u012c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u012e",
            "",
            "\1\u012f",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0131",
            "",
            "\1\u0132",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0134",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0136",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u013d",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
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
            return "1:1: Tokens : ( KW_BREAK | KW_CONTINUE | KW_FOR | KW_IF | KW_RETURN | KW_SWITCH | KW_THROW | KW_WHILE | KW_TRY | KW_CASE | KW_DEFAULT | KW_CATCH | KW_FINALLY | KW_USING | KW_AS | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | KW_VOID | KW_CLASS | KW_ENUM | KW_MIXIN | KW_ABSTRACT | KW_PRIVATE | KW_PROTECTED | KW_PUBLIC | KW_INTERNAL | KW_NEW | KW_ONCE | KW_THIS | KW_SUPER | KW_ELSE | KW_IS | KW_ISNOT | KW_NULL | KW_IT | KW_TRUE | KW_FALSE | LB | WS | LINE_COMMENT | EXEC_COMMENT | MULTI_COMMENT | DSL | CHAR | QUOTSTR | STR | URI | DOC | KEYWORD | CP_EQUALITY | CP_COMPARATORS | AS_ASSIGN_OP | LIST_TYPE | OP_SAFEDYN_CALL | OP_ARROW | OP_SAFE_CALL | OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE | OP_ELVIS | SP_COLCOL | BRACKET_L | BRACKET_R | SQ_BRACKET_L | SQ_BRACKET_R | PAR_L | PAR_R | SP_COLON | SP_SEMI | SP_COMMA | SP_PIPE | AS_INIT_VAL | SP_QMARK | AT | OP_POUND | OP_CURRY | AS_EQUAL | OP_BITOR | UNDERSCORE | OP_AND | OP_OR | DOT | OP_2PLUS | OP_2MINUS | OP_MINUS | OP_PLUS | OP_LSHIFT | OP_RSHIFT | OP_MULTI | OP_DIV | OP_MOD | OP_BANG | OP_TILDA | NUMBER | ID );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_24 = input.LA(1);

                        s = -1;
                        if ( (LA36_24=='\"') ) {s = 96;}

                        else if ( ((LA36_24>='\u0000' && LA36_24<='!')||(LA36_24>='#' && LA36_24<='\uFFFF')) ) {s = 97;}

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