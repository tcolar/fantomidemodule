package net.colar.netbeans.fan.antlr;

// $ANTLR 3.1.2 antlr/Fan.g 2009-06-15 12:51:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FanLexer extends Lexer {
    public static final int COMMA=52;
    public static final int T_VOID=27;
    public static final int MINUS=77;
    public static final int HEX_HEADER=88;
    public static final int T_ISNOT=42;
    public static final int NUMBER=78;
    public static final int QUOTSTR=71;
    public static final int T__122=122;
    public static final int T__109=109;
    public static final int T__115=115;
    public static final int FRACTION=93;
    public static final int T__123=123;
    public static final int T_PROTECTED=33;
    public static final int PIPE=56;
    public static final int DOT=46;
    public static final int PAR_R=54;
    public static final int T_IT=44;
    public static final int T__128=128;
    public static final int T_PUBLIC=34;
    public static final int T_ELSE=40;
    public static final int T_MIXIN=30;
    public static final int T__119=119;
    public static final int EXEC_COMMENT=82;
    public static final int T__112=112;
    public static final int T__108=108;
    public static final int HEXNB=89;
    public static final int T_IS=41;
    public static final int T__118=118;
    public static final int T__113=113;
    public static final int AT=68;
    public static final int RANGE=64;
    public static final int T_CONST=20;
    public static final int T_THROW=10;
    public static final int DSL=67;
    public static final int WS=80;
    public static final int CHAR=74;
    public static final int T_CONTINUE=5;
    public static final int BOOL_VAL=70;
    public static final int T__130=130;
    public static final int RANGE_EXCL=63;
    public static final int LINE_COMMENT=81;
    public static final int T_ENUM=29;
    public static final int HEXLETTER=85;
    public static final int SEMI=59;
    public static final int T_SUPER=39;
    public static final int T_USING=17;
    public static final int EQUAL=60;
    public static final int T__114=114;
    public static final int T__125=125;
    public static final int T__110=110;
    public static final int T_FOR=6;
    public static final int T_OVERRIDE=24;
    public static final int T_CATCH=15;
    public static final int QMARK=55;
    public static final int LB=79;
    public static final int COLCOL=45;
    public static final int COLON=51;
    public static final int T_VOLATILE=23;
    public static final int T__124=124;
    public static final int FRACTIONAL=91;
    public static final int T_CASE=13;
    public static final int POUND=75;
    public static final int T_AS=18;
    public static final int HEXHEADER=92;
    public static final int UNDERSCORE=87;
    public static final int T_VIRTUAL=25;
    public static final int T_ABSTRACT=31;
    public static final int T_FINAL=26;
    public static final int NBTYPE=95;
    public static final int T__100=100;
    public static final int T_TRY=12;
    public static final int ARROW=57;
    public static final int T_RETURN=8;
    public static final int T__126=126;
    public static final int SQ_BRACKET_L=47;
    public static final int T_FINALLY=16;
    public static final int T_SWITCH=9;
    public static final int DOC=76;
    public static final int T__101=101;
    public static final int CURRY=66;
    public static final int T__104=104;
    public static final int DECIMAL=90;
    public static final int T_NATIVE=22;
    public static final int URI=73;
    public static final int T__107=107;
    public static final int T_ONCE=37;
    public static final int T__106=106;
    public static final int T_THIS=38;
    public static final int PAR_L=53;
    public static final int T_DEFAULT=14;
    public static final int BRACKET_L=49;
    public static final int BITOR=65;
    public static final int T_IF=7;
    public static final int T__127=127;
    public static final int T_PRIVATE=32;
    public static final int DIGIT=84;
    public static final int T__120=120;
    public static final int T__98=98;
    public static final int ID=69;
    public static final int T_RD_ONLY=19;
    public static final int LETTER=96;
    public static final int T__117=117;
    public static final int T_NEW=36;
    public static final int KEYWORD=86;
    public static final int ELVIS=61;
    public static final int T__99=99;
    public static final int T_STATIC=21;
    public static final int BRACKET_R=50;
    public static final int STR=72;
    public static final int MULTI_COMMENT=83;
    public static final int T_CLASS=28;
    public static final int T__129=129;
    public static final int T__103=103;
    public static final int T__121=121;
    public static final int T_INTERNAL=35;
    public static final int T__97=97;
    public static final int T__111=111;
    public static final int T__105=105;
    public static final int EXPONENT=94;
    public static final int T__116=116;
    public static final int INIT_VAL=58;
    public static final int EOF=-1;
    public static final int T_BREAK=4;
    public static final int T_WHILE=11;
    public static final int SQ_BRACKET_R=48;
    public static final int T_NULL=43;
    public static final int RANG_EXCL_OLD=62;
    public static final int T__102=102;

    // delegates
    // delegators

    public FanLexer() {;} 
    public FanLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FanLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "antlr/Fan.g"; }

    // $ANTLR start "T_BREAK"
    public final void mT_BREAK() throws RecognitionException {
        try {
            int _type = T_BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:3:9: ( 'break' )
            // antlr/Fan.g:3:11: 'break'
            {
            match("break"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_BREAK"

    // $ANTLR start "T_CONTINUE"
    public final void mT_CONTINUE() throws RecognitionException {
        try {
            int _type = T_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:4:12: ( 'continue' )
            // antlr/Fan.g:4:14: 'continue'
            {
            match("continue"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_CONTINUE"

    // $ANTLR start "T_FOR"
    public final void mT_FOR() throws RecognitionException {
        try {
            int _type = T_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:5:7: ( 'for' )
            // antlr/Fan.g:5:9: 'for'
            {
            match("for"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_FOR"

    // $ANTLR start "T_IF"
    public final void mT_IF() throws RecognitionException {
        try {
            int _type = T_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:6:6: ( 'if' )
            // antlr/Fan.g:6:8: 'if'
            {
            match("if"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_IF"

    // $ANTLR start "T_RETURN"
    public final void mT_RETURN() throws RecognitionException {
        try {
            int _type = T_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:7:10: ( 'return' )
            // antlr/Fan.g:7:12: 'return'
            {
            match("return"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_RETURN"

    // $ANTLR start "T_SWITCH"
    public final void mT_SWITCH() throws RecognitionException {
        try {
            int _type = T_SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:8:10: ( 'switch' )
            // antlr/Fan.g:8:12: 'switch'
            {
            match("switch"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_SWITCH"

    // $ANTLR start "T_THROW"
    public final void mT_THROW() throws RecognitionException {
        try {
            int _type = T_THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:9:9: ( 'throw ' )
            // antlr/Fan.g:9:11: 'throw '
            {
            match("throw "); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_THROW"

    // $ANTLR start "T_WHILE"
    public final void mT_WHILE() throws RecognitionException {
        try {
            int _type = T_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:10:9: ( 'while' )
            // antlr/Fan.g:10:11: 'while'
            {
            match("while"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_WHILE"

    // $ANTLR start "T_TRY"
    public final void mT_TRY() throws RecognitionException {
        try {
            int _type = T_TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:11:7: ( 'try' )
            // antlr/Fan.g:11:9: 'try'
            {
            match("try"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_TRY"

    // $ANTLR start "T_CASE"
    public final void mT_CASE() throws RecognitionException {
        try {
            int _type = T_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:12:8: ( 'case' )
            // antlr/Fan.g:12:10: 'case'
            {
            match("case"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_CASE"

    // $ANTLR start "T_DEFAULT"
    public final void mT_DEFAULT() throws RecognitionException {
        try {
            int _type = T_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:13:11: ( 'default' )
            // antlr/Fan.g:13:13: 'default'
            {
            match("default"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_DEFAULT"

    // $ANTLR start "T_CATCH"
    public final void mT_CATCH() throws RecognitionException {
        try {
            int _type = T_CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:14:9: ( 'catch' )
            // antlr/Fan.g:14:11: 'catch'
            {
            match("catch"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_CATCH"

    // $ANTLR start "T_FINALLY"
    public final void mT_FINALLY() throws RecognitionException {
        try {
            int _type = T_FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:15:11: ( 'finally' )
            // antlr/Fan.g:15:13: 'finally'
            {
            match("finally"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_FINALLY"

    // $ANTLR start "T_USING"
    public final void mT_USING() throws RecognitionException {
        try {
            int _type = T_USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:16:9: ( 'using' )
            // antlr/Fan.g:16:11: 'using'
            {
            match("using"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_USING"

    // $ANTLR start "T_AS"
    public final void mT_AS() throws RecognitionException {
        try {
            int _type = T_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:17:6: ( 'as' )
            // antlr/Fan.g:17:8: 'as'
            {
            match("as"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_AS"

    // $ANTLR start "T_RD_ONLY"
    public final void mT_RD_ONLY() throws RecognitionException {
        try {
            int _type = T_RD_ONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:18:11: ( 'readonly' )
            // antlr/Fan.g:18:13: 'readonly'
            {
            match("readonly"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_RD_ONLY"

    // $ANTLR start "T_CONST"
    public final void mT_CONST() throws RecognitionException {
        try {
            int _type = T_CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:19:9: ( 'const' )
            // antlr/Fan.g:19:11: 'const'
            {
            match("const"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_CONST"

    // $ANTLR start "T_STATIC"
    public final void mT_STATIC() throws RecognitionException {
        try {
            int _type = T_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:20:10: ( 'static' )
            // antlr/Fan.g:20:12: 'static'
            {
            match("static"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_STATIC"

    // $ANTLR start "T_NATIVE"
    public final void mT_NATIVE() throws RecognitionException {
        try {
            int _type = T_NATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:21:10: ( 'native' )
            // antlr/Fan.g:21:12: 'native'
            {
            match("native"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_NATIVE"

    // $ANTLR start "T_VOLATILE"
    public final void mT_VOLATILE() throws RecognitionException {
        try {
            int _type = T_VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:22:12: ( 'volatile' )
            // antlr/Fan.g:22:14: 'volatile'
            {
            match("volatile"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_VOLATILE"

    // $ANTLR start "T_OVERRIDE"
    public final void mT_OVERRIDE() throws RecognitionException {
        try {
            int _type = T_OVERRIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:23:12: ( 'override' )
            // antlr/Fan.g:23:14: 'override'
            {
            match("override"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_OVERRIDE"

    // $ANTLR start "T_VIRTUAL"
    public final void mT_VIRTUAL() throws RecognitionException {
        try {
            int _type = T_VIRTUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:24:11: ( 'virtual' )
            // antlr/Fan.g:24:13: 'virtual'
            {
            match("virtual"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_VIRTUAL"

    // $ANTLR start "T_FINAL"
    public final void mT_FINAL() throws RecognitionException {
        try {
            int _type = T_FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:25:9: ( 'final' )
            // antlr/Fan.g:25:11: 'final'
            {
            match("final"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_FINAL"

    // $ANTLR start "T_VOID"
    public final void mT_VOID() throws RecognitionException {
        try {
            int _type = T_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:26:8: ( 'void' )
            // antlr/Fan.g:26:10: 'void'
            {
            match("void"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_VOID"

    // $ANTLR start "T_CLASS"
    public final void mT_CLASS() throws RecognitionException {
        try {
            int _type = T_CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:27:9: ( 'class' )
            // antlr/Fan.g:27:11: 'class'
            {
            match("class"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_CLASS"

    // $ANTLR start "T_ENUM"
    public final void mT_ENUM() throws RecognitionException {
        try {
            int _type = T_ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:28:8: ( 'enum' )
            // antlr/Fan.g:28:10: 'enum'
            {
            match("enum"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_ENUM"

    // $ANTLR start "T_MIXIN"
    public final void mT_MIXIN() throws RecognitionException {
        try {
            int _type = T_MIXIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:29:9: ( 'mixin' )
            // antlr/Fan.g:29:11: 'mixin'
            {
            match("mixin"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_MIXIN"

    // $ANTLR start "T_ABSTRACT"
    public final void mT_ABSTRACT() throws RecognitionException {
        try {
            int _type = T_ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:30:12: ( 'abstract' )
            // antlr/Fan.g:30:14: 'abstract'
            {
            match("abstract"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_ABSTRACT"

    // $ANTLR start "T_PRIVATE"
    public final void mT_PRIVATE() throws RecognitionException {
        try {
            int _type = T_PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:31:11: ( 'private' )
            // antlr/Fan.g:31:13: 'private'
            {
            match("private"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_PRIVATE"

    // $ANTLR start "T_PROTECTED"
    public final void mT_PROTECTED() throws RecognitionException {
        try {
            int _type = T_PROTECTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:32:13: ( 'protected' )
            // antlr/Fan.g:32:15: 'protected'
            {
            match("protected"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_PROTECTED"

    // $ANTLR start "T_PUBLIC"
    public final void mT_PUBLIC() throws RecognitionException {
        try {
            int _type = T_PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:33:10: ( 'public' )
            // antlr/Fan.g:33:12: 'public'
            {
            match("public"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_PUBLIC"

    // $ANTLR start "T_INTERNAL"
    public final void mT_INTERNAL() throws RecognitionException {
        try {
            int _type = T_INTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:34:12: ( 'internal' )
            // antlr/Fan.g:34:14: 'internal'
            {
            match("internal"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_INTERNAL"

    // $ANTLR start "T_NEW"
    public final void mT_NEW() throws RecognitionException {
        try {
            int _type = T_NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:35:7: ( 'new' )
            // antlr/Fan.g:35:9: 'new'
            {
            match("new"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_NEW"

    // $ANTLR start "T_ONCE"
    public final void mT_ONCE() throws RecognitionException {
        try {
            int _type = T_ONCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:36:8: ( 'once' )
            // antlr/Fan.g:36:10: 'once'
            {
            match("once"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_ONCE"

    // $ANTLR start "T_THIS"
    public final void mT_THIS() throws RecognitionException {
        try {
            int _type = T_THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:37:8: ( 'this' )
            // antlr/Fan.g:37:10: 'this'
            {
            match("this"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_THIS"

    // $ANTLR start "T_SUPER"
    public final void mT_SUPER() throws RecognitionException {
        try {
            int _type = T_SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:38:9: ( 'super' )
            // antlr/Fan.g:38:11: 'super'
            {
            match("super"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_SUPER"

    // $ANTLR start "T_ELSE"
    public final void mT_ELSE() throws RecognitionException {
        try {
            int _type = T_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:39:8: ( 'else' )
            // antlr/Fan.g:39:10: 'else'
            {
            match("else"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_ELSE"

    // $ANTLR start "T_IS"
    public final void mT_IS() throws RecognitionException {
        try {
            int _type = T_IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:40:6: ( 'is' )
            // antlr/Fan.g:40:8: 'is'
            {
            match("is"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_IS"

    // $ANTLR start "T_ISNOT"
    public final void mT_ISNOT() throws RecognitionException {
        try {
            int _type = T_ISNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:41:9: ( 'isnot' )
            // antlr/Fan.g:41:11: 'isnot'
            {
            match("isnot"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_ISNOT"

    // $ANTLR start "T_NULL"
    public final void mT_NULL() throws RecognitionException {
        try {
            int _type = T_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:42:8: ( 'null' )
            // antlr/Fan.g:42:10: 'null'
            {
            match("null"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_NULL"

    // $ANTLR start "T_IT"
    public final void mT_IT() throws RecognitionException {
        try {
            int _type = T_IT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:43:6: ( 'it' )
            // antlr/Fan.g:43:8: 'it'
            {
            match("it"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_IT"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:44:7: ( '[]' )
            // antlr/Fan.g:44:9: '[]'
            {
            match("[]"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:45:7: ( '*=' )
            // antlr/Fan.g:45:9: '*='
            {
            match("*="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:46:7: ( '/=' )
            // antlr/Fan.g:46:9: '/='
            {
            match("/="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:47:8: ( '%=' )
            // antlr/Fan.g:47:10: '%='
            {
            match("%="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:48:8: ( '+=' )
            // antlr/Fan.g:48:10: '+='
            {
            match("+="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:49:8: ( '-=' )
            // antlr/Fan.g:49:10: '-='
            {
            match("-="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:50:8: ( '<<=' )
            // antlr/Fan.g:50:10: '<<='
            {
            match("<<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:51:8: ( '>>=' )
            // antlr/Fan.g:51:10: '>>='
            {
            match(">>="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:52:8: ( '&=' )
            // antlr/Fan.g:52:10: '&='
            {
            match("&="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:53:8: ( '^=' )
            // antlr/Fan.g:53:10: '^='
            {
            match("^="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:54:8: ( '|=' )
            // antlr/Fan.g:54:10: '|='
            {
            match("|="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:55:8: ( '||' )
            // antlr/Fan.g:55:10: '||'
            {
            match("||"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:56:8: ( '&&' )
            // antlr/Fan.g:56:10: '&&'
            {
            match("&&"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:57:8: ( '===' )
            // antlr/Fan.g:57:10: '==='
            {
            match("==="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:58:8: ( '!==' )
            // antlr/Fan.g:58:10: '!=='
            {
            match("!=="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:59:8: ( '==' )
            // antlr/Fan.g:59:10: '=='
            {
            match("=="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:60:8: ( '!=' )
            // antlr/Fan.g:60:10: '!='
            {
            match("!="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:61:8: ( '<=>' )
            // antlr/Fan.g:61:10: '<=>'
            {
            match("<=>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:62:8: ( '<=' )
            // antlr/Fan.g:62:10: '<='
            {
            match("<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:63:8: ( '<' )
            // antlr/Fan.g:63:10: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:64:8: ( '>=' )
            // antlr/Fan.g:64:10: '>='
            {
            match(">="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:65:8: ( '>' )
            // antlr/Fan.g:65:10: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:66:8: ( '<<' )
            // antlr/Fan.g:66:10: '<<'
            {
            match("<<"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:67:8: ( '>>' )
            // antlr/Fan.g:67:10: '>>'
            {
            match(">>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:68:8: ( '+' )
            // antlr/Fan.g:68:10: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:69:8: ( '*' )
            // antlr/Fan.g:69:10: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:70:8: ( '/' )
            // antlr/Fan.g:70:10: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:71:8: ( '%' )
            // antlr/Fan.g:71:10: '%'
            {
            match('%'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:72:8: ( '!' )
            // antlr/Fan.g:72:10: '!'
            {
            match('!'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:73:8: ( '++' )
            // antlr/Fan.g:73:10: '++'
            {
            match("++"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:74:8: ( '--' )
            // antlr/Fan.g:74:10: '--'
            {
            match("--"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:75:8: ( '~' )
            // antlr/Fan.g:75:10: '~'
            {
            match('~'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:76:8: ( '?.' )
            // antlr/Fan.g:76:10: '?.'
            {
            match("?."); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:77:8: ( '?->' )
            // antlr/Fan.g:77:10: '?->'
            {
            match("?->"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "LB"
    public final void mLB() throws RecognitionException {
        try {
            int _type = LB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:364:5: ( ( ( '\\r\\n' ) | '\\n' )+ )
            // antlr/Fan.g:364:7: ( ( '\\r\\n' ) | '\\n' )+
            {
            // antlr/Fan.g:364:7: ( ( '\\r\\n' ) | '\\n' )+
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
            	    // antlr/Fan.g:364:8: ( '\\r\\n' )
            	    {
            	    // antlr/Fan.g:364:8: ( '\\r\\n' )
            	    // antlr/Fan.g:364:9: '\\r\\n'
            	    {
            	    match("\r\n"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 2 :
            	    // antlr/Fan.g:364:19: '\\n'
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
            // antlr/Fan.g:366:7: ( ( ' ' | '\\t' ) )
            // antlr/Fan.g:366:10: ( ' ' | '\\t' )
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
            // antlr/Fan.g:367:14: ( '//' (~ ( '\\n' ) )* )
            // antlr/Fan.g:367:16: '//' (~ ( '\\n' ) )*
            {
            match("//"); if (state.failed) return ;

            // antlr/Fan.g:367:21: (~ ( '\\n' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // antlr/Fan.g:367:22: ~ ( '\\n' )
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
            // antlr/Fan.g:368:14: ( '#!' (~ ( '\\n' ) )* )
            // antlr/Fan.g:368:16: '#!' (~ ( '\\n' ) )*
            {
            match("#!"); if (state.failed) return ;

            // antlr/Fan.g:368:21: (~ ( '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // antlr/Fan.g:368:22: ~ ( '\\n' )
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
            // antlr/Fan.g:369:15: ( ( '/*' ( options {greedy=false; } : . )* '*/' ) )
            // antlr/Fan.g:369:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            {
            // antlr/Fan.g:369:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // antlr/Fan.g:369:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // antlr/Fan.g:369:24: ( options {greedy=false; } : . )*
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
            	    // antlr/Fan.g:369:52: .
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
            // antlr/Fan.g:371:6: ( '<|' ( options {greedy=false; } : . )* '|>' )
            // antlr/Fan.g:371:7: '<|' ( options {greedy=false; } : . )* '|>'
            {
            match("<|"); if (state.failed) return ;

            // antlr/Fan.g:371:12: ( options {greedy=false; } : . )*
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
            	    // antlr/Fan.g:371:40: .
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
            // antlr/Fan.g:372:7: ( '\\'' ( ( '\\\\' . ) | ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ) | . )? '\\'' )
            // antlr/Fan.g:372:8: '\\'' ( ( '\\\\' . ) | ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ) | . )? '\\''
            {
            match('\''); if (state.failed) return ;
            // antlr/Fan.g:372:13: ( ( '\\\\' . ) | ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ) | . )?
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
                    // antlr/Fan.g:372:14: ( '\\\\' . )
                    {
                    // antlr/Fan.g:372:14: ( '\\\\' . )
                    // antlr/Fan.g:372:15: '\\\\' .
                    {
                    match('\\'); if (state.failed) return ;
                    matchAny(); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // antlr/Fan.g:372:25: ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) )
                    {
                    // antlr/Fan.g:372:25: ( '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) )
                    // antlr/Fan.g:372:26: '\\\\u' ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER ) ( DIGIT | HEXLETTER )
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
                    // antlr/Fan.g:373:47: .
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
            // antlr/Fan.g:375:10: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            // antlr/Fan.g:375:12: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
            {
            match("\"\"\""); if (state.failed) return ;

            // antlr/Fan.g:375:18: ( options {greedy=false; } : . )*
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
            	    // antlr/Fan.g:375:46: .
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
            // antlr/Fan.g:376:6: ( ( '\"' ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )* '\"' ) )
            // antlr/Fan.g:376:8: ( '\"' ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )* '\"' )
            {
            // antlr/Fan.g:376:8: ( '\"' ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )* '\"' )
            // antlr/Fan.g:376:10: '\"' ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;
            // antlr/Fan.g:376:14: ( ( '\\\\\\\\' ) | ( '\\\\\"' ) | ~ ( '\"' ) )*
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
            	    // antlr/Fan.g:376:16: ( '\\\\\\\\' )
            	    {
            	    // antlr/Fan.g:376:16: ( '\\\\\\\\' )
            	    // antlr/Fan.g:376:17: '\\\\\\\\'
            	    {
            	    match("\\\\"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 2 :
            	    // antlr/Fan.g:376:27: ( '\\\\\"' )
            	    {
            	    // antlr/Fan.g:376:27: ( '\\\\\"' )
            	    // antlr/Fan.g:376:28: '\\\\\"'
            	    {
            	    match("\\\""); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 3 :
            	    // antlr/Fan.g:376:37: ~ ( '\"' )
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
            // antlr/Fan.g:377:6: ( ( '`' ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`' ) )
            // antlr/Fan.g:377:8: ( '`' ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`' )
            {
            // antlr/Fan.g:377:8: ( '`' ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`' )
            // antlr/Fan.g:377:10: '`' ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )* '`'
            {
            match('`'); if (state.failed) return ;
            // antlr/Fan.g:377:14: ( ( '\\\\\\\\' ) | ( '\\\\`' ) | ~ ( '`' ) )*
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
            	    // antlr/Fan.g:377:16: ( '\\\\\\\\' )
            	    {
            	    // antlr/Fan.g:377:16: ( '\\\\\\\\' )
            	    // antlr/Fan.g:377:17: '\\\\\\\\'
            	    {
            	    match("\\\\"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 2 :
            	    // antlr/Fan.g:377:27: ( '\\\\`' )
            	    {
            	    // antlr/Fan.g:377:27: ( '\\\\`' )
            	    // antlr/Fan.g:377:28: '\\\\`'
            	    {
            	    match("\\`"); if (state.failed) return ;


            	    }


            	    }
            	    break;
            	case 3 :
            	    // antlr/Fan.g:377:37: ~ ( '`' )
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
            // antlr/Fan.g:381:7: ( '**' ( options {greedy=false; } : . )* '\\n' )
            // antlr/Fan.g:381:11: '**' ( options {greedy=false; } : . )* '\\n'
            {
            match("**"); if (state.failed) return ;

            // antlr/Fan.g:381:16: ( options {greedy=false; } : . )*
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
            	    // antlr/Fan.g:381:44: .
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

    // $ANTLR start "BOOL_VAL"
    public final void mBOOL_VAL() throws RecognitionException {
        try {
            int _type = BOOL_VAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:384:10: ( 'true' | 'false' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='t') ) {
                alt11=1;
            }
            else if ( (LA11_0=='f') ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // antlr/Fan.g:384:12: 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // antlr/Fan.g:384:21: 'false'
                    {
                    match("false"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOL_VAL"

    // $ANTLR start "KEYWORD"
    public final void mKEYWORD() throws RecognitionException {
        try {
            int _type = KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:385:10: ( ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' ) )
            // antlr/Fan.g:385:12: ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' )
            {
            // antlr/Fan.g:385:12: ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' )
            int alt12=45;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // antlr/Fan.g:385:13: 'abstract'
                    {
                    match("abstract"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // antlr/Fan.g:385:26: 'as'
                    {
                    match("as"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // antlr/Fan.g:385:33: 'assert'
                    {
                    match("assert"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // antlr/Fan.g:385:44: 'break'
                    {
                    match("break"); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // antlr/Fan.g:385:54: 'case'
                    {
                    match("case"); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // antlr/Fan.g:385:63: 'catch'
                    {
                    match("catch"); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // antlr/Fan.g:386:3: 'class'
                    {
                    match("class"); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // antlr/Fan.g:386:13: 'const'
                    {
                    match("const"); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // antlr/Fan.g:386:23: 'continue'
                    {
                    match("continue"); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // antlr/Fan.g:386:36: 'default'
                    {
                    match("default"); if (state.failed) return ;


                    }
                    break;
                case 11 :
                    // antlr/Fan.g:386:48: 'do'
                    {
                    match("do"); if (state.failed) return ;


                    }
                    break;
                case 12 :
                    // antlr/Fan.g:386:55: 'else'
                    {
                    match("else"); if (state.failed) return ;


                    }
                    break;
                case 13 :
                    // antlr/Fan.g:386:64: 'enum'
                    {
                    match("enum"); if (state.failed) return ;


                    }
                    break;
                case 14 :
                    // antlr/Fan.g:386:73: 'false'
                    {
                    match("false"); if (state.failed) return ;


                    }
                    break;
                case 15 :
                    // antlr/Fan.g:387:4: 'final'
                    {
                    match("final"); if (state.failed) return ;


                    }
                    break;
                case 16 :
                    // antlr/Fan.g:387:14: 'finally'
                    {
                    match("finally"); if (state.failed) return ;


                    }
                    break;
                case 17 :
                    // antlr/Fan.g:387:26: 'for'
                    {
                    match("for"); if (state.failed) return ;


                    }
                    break;
                case 18 :
                    // antlr/Fan.g:387:34: 'foreach'
                    {
                    match("foreach"); if (state.failed) return ;


                    }
                    break;
                case 19 :
                    // antlr/Fan.g:387:46: 'if'
                    {
                    match("if"); if (state.failed) return ;


                    }
                    break;
                case 20 :
                    // antlr/Fan.g:387:53: 'internal'
                    {
                    match("internal"); if (state.failed) return ;


                    }
                    break;
                case 21 :
                    // antlr/Fan.g:387:66: 'is'
                    {
                    match("is"); if (state.failed) return ;


                    }
                    break;
                case 22 :
                    // antlr/Fan.g:387:73: 'isnot'
                    {
                    match("isnot"); if (state.failed) return ;


                    }
                    break;
                case 23 :
                    // antlr/Fan.g:388:4: 'mixin'
                    {
                    match("mixin"); if (state.failed) return ;


                    }
                    break;
                case 24 :
                    // antlr/Fan.g:388:14: 'native'
                    {
                    match("native"); if (state.failed) return ;


                    }
                    break;
                case 25 :
                    // antlr/Fan.g:388:25: 'new'
                    {
                    match("new"); if (state.failed) return ;


                    }
                    break;
                case 26 :
                    // antlr/Fan.g:388:33: 'null'
                    {
                    match("null"); if (state.failed) return ;


                    }
                    break;
                case 27 :
                    // antlr/Fan.g:388:42: 'once'
                    {
                    match("once"); if (state.failed) return ;


                    }
                    break;
                case 28 :
                    // antlr/Fan.g:388:51: 'override'
                    {
                    match("override"); if (state.failed) return ;


                    }
                    break;
                case 29 :
                    // antlr/Fan.g:388:64: 'private'
                    {
                    match("private"); if (state.failed) return ;


                    }
                    break;
                case 30 :
                    // antlr/Fan.g:389:4: 'protected'
                    {
                    match("protected"); if (state.failed) return ;


                    }
                    break;
                case 31 :
                    // antlr/Fan.g:389:18: 'public'
                    {
                    match("public"); if (state.failed) return ;


                    }
                    break;
                case 32 :
                    // antlr/Fan.g:389:29: 'readonly'
                    {
                    match("readonly"); if (state.failed) return ;


                    }
                    break;
                case 33 :
                    // antlr/Fan.g:389:42: 'return'
                    {
                    match("return"); if (state.failed) return ;


                    }
                    break;
                case 34 :
                    // antlr/Fan.g:389:53: 'static'
                    {
                    match("static"); if (state.failed) return ;


                    }
                    break;
                case 35 :
                    // antlr/Fan.g:389:64: 'super'
                    {
                    match("super"); if (state.failed) return ;


                    }
                    break;
                case 36 :
                    // antlr/Fan.g:389:74: 'switch'
                    {
                    match("switch"); if (state.failed) return ;


                    }
                    break;
                case 37 :
                    // antlr/Fan.g:390:3: 'this'
                    {
                    match("this"); if (state.failed) return ;


                    }
                    break;
                case 38 :
                    // antlr/Fan.g:390:12: 'throw'
                    {
                    match("throw"); if (state.failed) return ;


                    }
                    break;
                case 39 :
                    // antlr/Fan.g:390:22: 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 40 :
                    // antlr/Fan.g:390:31: 'try'
                    {
                    match("try"); if (state.failed) return ;


                    }
                    break;
                case 41 :
                    // antlr/Fan.g:390:39: 'using'
                    {
                    match("using"); if (state.failed) return ;


                    }
                    break;
                case 42 :
                    // antlr/Fan.g:390:49: 'virtual'
                    {
                    match("virtual"); if (state.failed) return ;


                    }
                    break;
                case 43 :
                    // antlr/Fan.g:390:61: 'volatile'
                    {
                    match("volatile"); if (state.failed) return ;


                    }
                    break;
                case 44 :
                    // antlr/Fan.g:390:74: 'void'
                    {
                    match("void"); if (state.failed) return ;


                    }
                    break;
                case 45 :
                    // antlr/Fan.g:391:3: 'while'
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

    // $ANTLR start "RANG_EXCL_OLD"
    public final void mRANG_EXCL_OLD() throws RecognitionException {
        try {
            int _type = RANG_EXCL_OLD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:395:15: ( '...' )
            // antlr/Fan.g:395:16: '...'
            {
            match("..."); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANG_EXCL_OLD"

    // $ANTLR start "RANGE_EXCL"
    public final void mRANGE_EXCL() throws RecognitionException {
        try {
            int _type = RANGE_EXCL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:396:12: ( '..<' )
            // antlr/Fan.g:396:13: '..<'
            {
            match("..<"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANGE_EXCL"

    // $ANTLR start "RANGE"
    public final void mRANGE() throws RecognitionException {
        try {
            int _type = RANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:397:8: ( '..' )
            // antlr/Fan.g:397:9: '..'
            {
            match(".."); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANGE"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:398:6: ( '.' )
            // antlr/Fan.g:398:7: '.'
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

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:399:8: ( '-' )
            // antlr/Fan.g:399:9: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "ELVIS"
    public final void mELVIS() throws RecognitionException {
        try {
            int _type = ELVIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:400:8: ( '?:' )
            // antlr/Fan.g:400:9: '?:'
            {
            match("?:"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELVIS"

    // $ANTLR start "COLCOL"
    public final void mCOLCOL() throws RecognitionException {
        try {
            int _type = COLCOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:401:9: ( '::' )
            // antlr/Fan.g:401:10: '::'
            {
            match("::"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLCOL"

    // $ANTLR start "BRACKET_L"
    public final void mBRACKET_L() throws RecognitionException {
        try {
            int _type = BRACKET_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:402:11: ( '{' )
            // antlr/Fan.g:402:12: '{'
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
            // antlr/Fan.g:403:11: ( '}' )
            // antlr/Fan.g:403:12: '}'
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
            // antlr/Fan.g:404:14: ( '[' )
            // antlr/Fan.g:404:15: '['
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
            // antlr/Fan.g:405:14: ( ']' )
            // antlr/Fan.g:405:15: ']'
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
            // antlr/Fan.g:406:8: ( '(' )
            // antlr/Fan.g:406:9: '('
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
            // antlr/Fan.g:407:8: ( ')' )
            // antlr/Fan.g:407:9: ')'
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

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:408:8: ( ':' )
            // antlr/Fan.g:408:9: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:409:7: ( ';' )
            // antlr/Fan.g:409:8: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:410:8: ( ',' )
            // antlr/Fan.g:410:9: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:411:7: ( '|' )
            // antlr/Fan.g:411:8: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:412:8: ( '->' )
            // antlr/Fan.g:412:9: '->'
            {
            match("->"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "INIT_VAL"
    public final void mINIT_VAL() throws RecognitionException {
        try {
            int _type = INIT_VAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:413:10: ( ':=' )
            // antlr/Fan.g:413:11: ':='
            {
            match(":="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INIT_VAL"

    // $ANTLR start "QMARK"
    public final void mQMARK() throws RecognitionException {
        try {
            int _type = QMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:414:8: ( '?' )
            // antlr/Fan.g:414:9: '?'
            {
            match('?'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QMARK"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:415:5: ( '@' )
            // antlr/Fan.g:415:6: '@'
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

    // $ANTLR start "POUND"
    public final void mPOUND() throws RecognitionException {
        try {
            int _type = POUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:416:8: ( '#' )
            // antlr/Fan.g:416:9: '#'
            {
            match('#'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POUND"

    // $ANTLR start "CURRY"
    public final void mCURRY() throws RecognitionException {
        try {
            int _type = CURRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:417:8: ( '&' )
            // antlr/Fan.g:417:9: '&'
            {
            match('&'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRY"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:418:8: ( '=' )
            // antlr/Fan.g:418:9: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "BITOR"
    public final void mBITOR() throws RecognitionException {
        try {
            int _type = BITOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:419:8: ( '^' )
            // antlr/Fan.g:419:9: '^'
            {
            match('^'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BITOR"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // antlr/Fan.g:420:12: ( '_' )
            // antlr/Fan.g:420:13: '_'
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

    // $ANTLR start "HEX_HEADER"
    public final void mHEX_HEADER() throws RecognitionException {
        try {
            // antlr/Fan.g:424:21: ( '0x' | '0X' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='0') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='x') ) {
                    alt13=1;
                }
                else if ( (LA13_1=='X') ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // antlr/Fan.g:424:24: '0x'
                    {
                    match("0x"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // antlr/Fan.g:424:31: '0X'
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
            // antlr/Fan.g:426:10: ( ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL ) )
            // antlr/Fan.g:426:13: ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL )
            {
            // antlr/Fan.g:426:13: ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // antlr/Fan.g:426:14: ( HEXNB )=> HEXNB
                    {
                    mHEXNB(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:426:31: ( DECIMAL )=> DECIMAL
                    {
                    mDECIMAL(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:426:52: FRACTIONAL
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
            // antlr/Fan.g:427:17: ( HEXHEADER ( ( UNDERSCORE )* ( DIGIT | HEXLETTER ) )+ )
            // antlr/Fan.g:427:19: HEXHEADER ( ( UNDERSCORE )* ( DIGIT | HEXLETTER ) )+
            {
            mHEXHEADER(); if (state.failed) return ;
            // antlr/Fan.g:427:29: ( ( UNDERSCORE )* ( DIGIT | HEXLETTER ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='F')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='f')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // antlr/Fan.g:427:30: ( UNDERSCORE )* ( DIGIT | HEXLETTER )
            	    {
            	    // antlr/Fan.g:427:30: ( UNDERSCORE )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0=='_') ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // antlr/Fan.g:427:30: UNDERSCORE
            	    	    {
            	    	    mUNDERSCORE(); if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
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
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // antlr/Fan.g:428:18: ( DIGIT ( ( UNDERSCORE )* DIGIT )* ( ( FRACTION )=> FRACTION )? ( ( EXPONENT )=> EXPONENT )? ( NBTYPE )? )
            // antlr/Fan.g:428:20: DIGIT ( ( UNDERSCORE )* DIGIT )* ( ( FRACTION )=> FRACTION )? ( ( EXPONENT )=> EXPONENT )? ( NBTYPE )?
            {
            mDIGIT(); if (state.failed) return ;
            // antlr/Fan.g:428:26: ( ( UNDERSCORE )* DIGIT )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||LA18_0=='_') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // antlr/Fan.g:428:27: ( UNDERSCORE )* DIGIT
            	    {
            	    // antlr/Fan.g:428:27: ( UNDERSCORE )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0=='_') ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // antlr/Fan.g:428:27: UNDERSCORE
            	    	    {
            	    	    mUNDERSCORE(); if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // antlr/Fan.g:428:47: ( ( FRACTION )=> FRACTION )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='.') && (synpred3_Fan())) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // antlr/Fan.g:428:48: ( FRACTION )=> FRACTION
                    {
                    mFRACTION(); if (state.failed) return ;

                    }
                    break;

            }

            // antlr/Fan.g:429:6: ( ( EXPONENT )=> EXPONENT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='E'||LA20_0=='e') && (synpred4_Fan())) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // antlr/Fan.g:429:7: ( EXPONENT )=> EXPONENT
                    {
                    mEXPONENT(); if (state.failed) return ;

                    }
                    break;

            }

            // antlr/Fan.g:429:30: ( NBTYPE )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='D'||LA21_0=='F'||LA21_0=='d'||LA21_0=='f'||LA21_0=='h'||(LA21_0>='m' && LA21_0<='n')||LA21_0=='s') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // antlr/Fan.g:429:30: NBTYPE
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
            // antlr/Fan.g:430:21: ( FRACTION ( EXPONENT )? ( NBTYPE )? )
            // antlr/Fan.g:430:23: FRACTION ( EXPONENT )? ( NBTYPE )?
            {
            mFRACTION(); if (state.failed) return ;
            // antlr/Fan.g:430:32: ( EXPONENT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='E'||LA22_0=='e') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // antlr/Fan.g:430:32: EXPONENT
                    {
                    mEXPONENT(); if (state.failed) return ;

                    }
                    break;

            }

            // antlr/Fan.g:430:42: ( NBTYPE )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='D'||LA23_0=='F'||LA23_0=='d'||LA23_0=='f'||LA23_0=='h'||(LA23_0>='m' && LA23_0<='n')||LA23_0=='s') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // antlr/Fan.g:430:42: NBTYPE
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
            // antlr/Fan.g:431:19: ( DOT DIGIT ( ( UNDERSCORE )* DIGIT )* )
            // antlr/Fan.g:431:21: DOT DIGIT ( ( UNDERSCORE )* DIGIT )*
            {
            mDOT(); if (state.failed) return ;
            mDIGIT(); if (state.failed) return ;
            // antlr/Fan.g:431:31: ( ( UNDERSCORE )* DIGIT )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')||LA25_0=='_') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // antlr/Fan.g:431:32: ( UNDERSCORE )* DIGIT
            	    {
            	    // antlr/Fan.g:431:32: ( UNDERSCORE )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0=='_') ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // antlr/Fan.g:431:32: UNDERSCORE
            	    	    {
            	    	    mUNDERSCORE(); if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop24;
            	        }
            	    } while (true);

            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
            // antlr/Fan.g:432:19: ( ( 'e' | 'E' ) ( '+' | MINUS )? DIGIT ( ( UNDERSCORE )* DIGIT )* )
            // antlr/Fan.g:432:21: ( 'e' | 'E' ) ( '+' | MINUS )? DIGIT ( ( UNDERSCORE )* DIGIT )*
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

            // antlr/Fan.g:432:31: ( '+' | MINUS )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='+'||LA26_0=='-') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // antlr/Fan.g:
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
            // antlr/Fan.g:432:52: ( ( UNDERSCORE )* DIGIT )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='0' && LA28_0<='9')||LA28_0=='_') ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // antlr/Fan.g:432:53: ( UNDERSCORE )* DIGIT
            	    {
            	    // antlr/Fan.g:432:53: ( UNDERSCORE )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0=='_') ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // antlr/Fan.g:432:53: UNDERSCORE
            	    	    {
            	    	    mUNDERSCORE(); if (state.failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);

            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
            // antlr/Fan.g:434:18: ( 'F' | 'f' | 'D' | ( 'd' ( 'ay' )? ) | 'ms' | 'ns' | 'sec' | 'min' | 'hr' )
            int alt30=9;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // antlr/Fan.g:434:20: 'F'
                    {
                    match('F'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // antlr/Fan.g:434:26: 'f'
                    {
                    match('f'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // antlr/Fan.g:434:32: 'D'
                    {
                    match('D'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // antlr/Fan.g:434:38: ( 'd' ( 'ay' )? )
                    {
                    // antlr/Fan.g:434:38: ( 'd' ( 'ay' )? )
                    // antlr/Fan.g:434:39: 'd' ( 'ay' )?
                    {
                    match('d'); if (state.failed) return ;
                    // antlr/Fan.g:434:43: ( 'ay' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='a') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // antlr/Fan.g:434:43: 'ay'
                            {
                            match("ay"); if (state.failed) return ;


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // antlr/Fan.g:434:52: 'ms'
                    {
                    match("ms"); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // antlr/Fan.g:434:59: 'ns'
                    {
                    match("ns"); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // antlr/Fan.g:435:6: 'sec'
                    {
                    match("sec"); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // antlr/Fan.g:435:14: 'min'
                    {
                    match("min"); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // antlr/Fan.g:435:22: 'hr'
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
            // antlr/Fan.g:436:20: ( 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )
            // antlr/Fan.g:
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
            // antlr/Fan.g:437:20: ( '0x' | '0X' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='0') ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1=='x') ) {
                    alt31=1;
                }
                else if ( (LA31_1=='X') ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // antlr/Fan.g:437:23: '0x'
                    {
                    match("0x"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // antlr/Fan.g:437:30: '0X'
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
            // antlr/Fan.g:440:6: ( ( ( UNDERSCORE )* LETTER ) ( LETTER | DIGIT | UNDERSCORE )* )
            // antlr/Fan.g:440:8: ( ( UNDERSCORE )* LETTER ) ( LETTER | DIGIT | UNDERSCORE )*
            {
            // antlr/Fan.g:440:8: ( ( UNDERSCORE )* LETTER )
            // antlr/Fan.g:440:9: ( UNDERSCORE )* LETTER
            {
            // antlr/Fan.g:440:9: ( UNDERSCORE )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0=='_') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // antlr/Fan.g:440:9: UNDERSCORE
            	    {
            	    mUNDERSCORE(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            mLETTER(); if (state.failed) return ;

            }

            // antlr/Fan.g:440:29: ( LETTER | DIGIT | UNDERSCORE )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='0' && LA33_0<='9')||(LA33_0>='A' && LA33_0<='Z')||LA33_0=='_'||(LA33_0>='a' && LA33_0<='z')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // antlr/Fan.g:
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
            	    break loop33;
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
            // antlr/Fan.g:442:18: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // antlr/Fan.g:442:20: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // antlr/Fan.g:443:17: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )
            // antlr/Fan.g:
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
        // antlr/Fan.g:1:8: ( T_BREAK | T_CONTINUE | T_FOR | T_IF | T_RETURN | T_SWITCH | T_THROW | T_WHILE | T_TRY | T_CASE | T_DEFAULT | T_CATCH | T_FINALLY | T_USING | T_AS | T_RD_ONLY | T_CONST | T_STATIC | T_NATIVE | T_VOLATILE | T_OVERRIDE | T_VIRTUAL | T_FINAL | T_VOID | T_CLASS | T_ENUM | T_MIXIN | T_ABSTRACT | T_PRIVATE | T_PROTECTED | T_PUBLIC | T_INTERNAL | T_NEW | T_ONCE | T_THIS | T_SUPER | T_ELSE | T_IS | T_ISNOT | T_NULL | T_IT | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | LB | WS | LINE_COMMENT | EXEC_COMMENT | MULTI_COMMENT | DSL | CHAR | QUOTSTR | STR | URI | DOC | BOOL_VAL | KEYWORD | RANG_EXCL_OLD | RANGE_EXCL | RANGE | DOT | MINUS | ELVIS | COLCOL | BRACKET_L | BRACKET_R | SQ_BRACKET_L | SQ_BRACKET_R | PAR_L | PAR_R | COLON | SEMI | COMMA | PIPE | ARROW | INIT_VAL | QMARK | AT | POUND | CURRY | EQUAL | BITOR | UNDERSCORE | NUMBER | ID )
        int alt34=116;
        alt34 = dfa34.predict(input);
        switch (alt34) {
            case 1 :
                // antlr/Fan.g:1:10: T_BREAK
                {
                mT_BREAK(); if (state.failed) return ;

                }
                break;
            case 2 :
                // antlr/Fan.g:1:18: T_CONTINUE
                {
                mT_CONTINUE(); if (state.failed) return ;

                }
                break;
            case 3 :
                // antlr/Fan.g:1:29: T_FOR
                {
                mT_FOR(); if (state.failed) return ;

                }
                break;
            case 4 :
                // antlr/Fan.g:1:35: T_IF
                {
                mT_IF(); if (state.failed) return ;

                }
                break;
            case 5 :
                // antlr/Fan.g:1:40: T_RETURN
                {
                mT_RETURN(); if (state.failed) return ;

                }
                break;
            case 6 :
                // antlr/Fan.g:1:49: T_SWITCH
                {
                mT_SWITCH(); if (state.failed) return ;

                }
                break;
            case 7 :
                // antlr/Fan.g:1:58: T_THROW
                {
                mT_THROW(); if (state.failed) return ;

                }
                break;
            case 8 :
                // antlr/Fan.g:1:66: T_WHILE
                {
                mT_WHILE(); if (state.failed) return ;

                }
                break;
            case 9 :
                // antlr/Fan.g:1:74: T_TRY
                {
                mT_TRY(); if (state.failed) return ;

                }
                break;
            case 10 :
                // antlr/Fan.g:1:80: T_CASE
                {
                mT_CASE(); if (state.failed) return ;

                }
                break;
            case 11 :
                // antlr/Fan.g:1:87: T_DEFAULT
                {
                mT_DEFAULT(); if (state.failed) return ;

                }
                break;
            case 12 :
                // antlr/Fan.g:1:97: T_CATCH
                {
                mT_CATCH(); if (state.failed) return ;

                }
                break;
            case 13 :
                // antlr/Fan.g:1:105: T_FINALLY
                {
                mT_FINALLY(); if (state.failed) return ;

                }
                break;
            case 14 :
                // antlr/Fan.g:1:115: T_USING
                {
                mT_USING(); if (state.failed) return ;

                }
                break;
            case 15 :
                // antlr/Fan.g:1:123: T_AS
                {
                mT_AS(); if (state.failed) return ;

                }
                break;
            case 16 :
                // antlr/Fan.g:1:128: T_RD_ONLY
                {
                mT_RD_ONLY(); if (state.failed) return ;

                }
                break;
            case 17 :
                // antlr/Fan.g:1:138: T_CONST
                {
                mT_CONST(); if (state.failed) return ;

                }
                break;
            case 18 :
                // antlr/Fan.g:1:146: T_STATIC
                {
                mT_STATIC(); if (state.failed) return ;

                }
                break;
            case 19 :
                // antlr/Fan.g:1:155: T_NATIVE
                {
                mT_NATIVE(); if (state.failed) return ;

                }
                break;
            case 20 :
                // antlr/Fan.g:1:164: T_VOLATILE
                {
                mT_VOLATILE(); if (state.failed) return ;

                }
                break;
            case 21 :
                // antlr/Fan.g:1:175: T_OVERRIDE
                {
                mT_OVERRIDE(); if (state.failed) return ;

                }
                break;
            case 22 :
                // antlr/Fan.g:1:186: T_VIRTUAL
                {
                mT_VIRTUAL(); if (state.failed) return ;

                }
                break;
            case 23 :
                // antlr/Fan.g:1:196: T_FINAL
                {
                mT_FINAL(); if (state.failed) return ;

                }
                break;
            case 24 :
                // antlr/Fan.g:1:204: T_VOID
                {
                mT_VOID(); if (state.failed) return ;

                }
                break;
            case 25 :
                // antlr/Fan.g:1:211: T_CLASS
                {
                mT_CLASS(); if (state.failed) return ;

                }
                break;
            case 26 :
                // antlr/Fan.g:1:219: T_ENUM
                {
                mT_ENUM(); if (state.failed) return ;

                }
                break;
            case 27 :
                // antlr/Fan.g:1:226: T_MIXIN
                {
                mT_MIXIN(); if (state.failed) return ;

                }
                break;
            case 28 :
                // antlr/Fan.g:1:234: T_ABSTRACT
                {
                mT_ABSTRACT(); if (state.failed) return ;

                }
                break;
            case 29 :
                // antlr/Fan.g:1:245: T_PRIVATE
                {
                mT_PRIVATE(); if (state.failed) return ;

                }
                break;
            case 30 :
                // antlr/Fan.g:1:255: T_PROTECTED
                {
                mT_PROTECTED(); if (state.failed) return ;

                }
                break;
            case 31 :
                // antlr/Fan.g:1:267: T_PUBLIC
                {
                mT_PUBLIC(); if (state.failed) return ;

                }
                break;
            case 32 :
                // antlr/Fan.g:1:276: T_INTERNAL
                {
                mT_INTERNAL(); if (state.failed) return ;

                }
                break;
            case 33 :
                // antlr/Fan.g:1:287: T_NEW
                {
                mT_NEW(); if (state.failed) return ;

                }
                break;
            case 34 :
                // antlr/Fan.g:1:293: T_ONCE
                {
                mT_ONCE(); if (state.failed) return ;

                }
                break;
            case 35 :
                // antlr/Fan.g:1:300: T_THIS
                {
                mT_THIS(); if (state.failed) return ;

                }
                break;
            case 36 :
                // antlr/Fan.g:1:307: T_SUPER
                {
                mT_SUPER(); if (state.failed) return ;

                }
                break;
            case 37 :
                // antlr/Fan.g:1:315: T_ELSE
                {
                mT_ELSE(); if (state.failed) return ;

                }
                break;
            case 38 :
                // antlr/Fan.g:1:322: T_IS
                {
                mT_IS(); if (state.failed) return ;

                }
                break;
            case 39 :
                // antlr/Fan.g:1:327: T_ISNOT
                {
                mT_ISNOT(); if (state.failed) return ;

                }
                break;
            case 40 :
                // antlr/Fan.g:1:335: T_NULL
                {
                mT_NULL(); if (state.failed) return ;

                }
                break;
            case 41 :
                // antlr/Fan.g:1:342: T_IT
                {
                mT_IT(); if (state.failed) return ;

                }
                break;
            case 42 :
                // antlr/Fan.g:1:347: T__97
                {
                mT__97(); if (state.failed) return ;

                }
                break;
            case 43 :
                // antlr/Fan.g:1:353: T__98
                {
                mT__98(); if (state.failed) return ;

                }
                break;
            case 44 :
                // antlr/Fan.g:1:359: T__99
                {
                mT__99(); if (state.failed) return ;

                }
                break;
            case 45 :
                // antlr/Fan.g:1:365: T__100
                {
                mT__100(); if (state.failed) return ;

                }
                break;
            case 46 :
                // antlr/Fan.g:1:372: T__101
                {
                mT__101(); if (state.failed) return ;

                }
                break;
            case 47 :
                // antlr/Fan.g:1:379: T__102
                {
                mT__102(); if (state.failed) return ;

                }
                break;
            case 48 :
                // antlr/Fan.g:1:386: T__103
                {
                mT__103(); if (state.failed) return ;

                }
                break;
            case 49 :
                // antlr/Fan.g:1:393: T__104
                {
                mT__104(); if (state.failed) return ;

                }
                break;
            case 50 :
                // antlr/Fan.g:1:400: T__105
                {
                mT__105(); if (state.failed) return ;

                }
                break;
            case 51 :
                // antlr/Fan.g:1:407: T__106
                {
                mT__106(); if (state.failed) return ;

                }
                break;
            case 52 :
                // antlr/Fan.g:1:414: T__107
                {
                mT__107(); if (state.failed) return ;

                }
                break;
            case 53 :
                // antlr/Fan.g:1:421: T__108
                {
                mT__108(); if (state.failed) return ;

                }
                break;
            case 54 :
                // antlr/Fan.g:1:428: T__109
                {
                mT__109(); if (state.failed) return ;

                }
                break;
            case 55 :
                // antlr/Fan.g:1:435: T__110
                {
                mT__110(); if (state.failed) return ;

                }
                break;
            case 56 :
                // antlr/Fan.g:1:442: T__111
                {
                mT__111(); if (state.failed) return ;

                }
                break;
            case 57 :
                // antlr/Fan.g:1:449: T__112
                {
                mT__112(); if (state.failed) return ;

                }
                break;
            case 58 :
                // antlr/Fan.g:1:456: T__113
                {
                mT__113(); if (state.failed) return ;

                }
                break;
            case 59 :
                // antlr/Fan.g:1:463: T__114
                {
                mT__114(); if (state.failed) return ;

                }
                break;
            case 60 :
                // antlr/Fan.g:1:470: T__115
                {
                mT__115(); if (state.failed) return ;

                }
                break;
            case 61 :
                // antlr/Fan.g:1:477: T__116
                {
                mT__116(); if (state.failed) return ;

                }
                break;
            case 62 :
                // antlr/Fan.g:1:484: T__117
                {
                mT__117(); if (state.failed) return ;

                }
                break;
            case 63 :
                // antlr/Fan.g:1:491: T__118
                {
                mT__118(); if (state.failed) return ;

                }
                break;
            case 64 :
                // antlr/Fan.g:1:498: T__119
                {
                mT__119(); if (state.failed) return ;

                }
                break;
            case 65 :
                // antlr/Fan.g:1:505: T__120
                {
                mT__120(); if (state.failed) return ;

                }
                break;
            case 66 :
                // antlr/Fan.g:1:512: T__121
                {
                mT__121(); if (state.failed) return ;

                }
                break;
            case 67 :
                // antlr/Fan.g:1:519: T__122
                {
                mT__122(); if (state.failed) return ;

                }
                break;
            case 68 :
                // antlr/Fan.g:1:526: T__123
                {
                mT__123(); if (state.failed) return ;

                }
                break;
            case 69 :
                // antlr/Fan.g:1:533: T__124
                {
                mT__124(); if (state.failed) return ;

                }
                break;
            case 70 :
                // antlr/Fan.g:1:540: T__125
                {
                mT__125(); if (state.failed) return ;

                }
                break;
            case 71 :
                // antlr/Fan.g:1:547: T__126
                {
                mT__126(); if (state.failed) return ;

                }
                break;
            case 72 :
                // antlr/Fan.g:1:554: T__127
                {
                mT__127(); if (state.failed) return ;

                }
                break;
            case 73 :
                // antlr/Fan.g:1:561: T__128
                {
                mT__128(); if (state.failed) return ;

                }
                break;
            case 74 :
                // antlr/Fan.g:1:568: T__129
                {
                mT__129(); if (state.failed) return ;

                }
                break;
            case 75 :
                // antlr/Fan.g:1:575: T__130
                {
                mT__130(); if (state.failed) return ;

                }
                break;
            case 76 :
                // antlr/Fan.g:1:582: LB
                {
                mLB(); if (state.failed) return ;

                }
                break;
            case 77 :
                // antlr/Fan.g:1:585: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 78 :
                // antlr/Fan.g:1:588: LINE_COMMENT
                {
                mLINE_COMMENT(); if (state.failed) return ;

                }
                break;
            case 79 :
                // antlr/Fan.g:1:601: EXEC_COMMENT
                {
                mEXEC_COMMENT(); if (state.failed) return ;

                }
                break;
            case 80 :
                // antlr/Fan.g:1:614: MULTI_COMMENT
                {
                mMULTI_COMMENT(); if (state.failed) return ;

                }
                break;
            case 81 :
                // antlr/Fan.g:1:628: DSL
                {
                mDSL(); if (state.failed) return ;

                }
                break;
            case 82 :
                // antlr/Fan.g:1:632: CHAR
                {
                mCHAR(); if (state.failed) return ;

                }
                break;
            case 83 :
                // antlr/Fan.g:1:637: QUOTSTR
                {
                mQUOTSTR(); if (state.failed) return ;

                }
                break;
            case 84 :
                // antlr/Fan.g:1:645: STR
                {
                mSTR(); if (state.failed) return ;

                }
                break;
            case 85 :
                // antlr/Fan.g:1:649: URI
                {
                mURI(); if (state.failed) return ;

                }
                break;
            case 86 :
                // antlr/Fan.g:1:653: DOC
                {
                mDOC(); if (state.failed) return ;

                }
                break;
            case 87 :
                // antlr/Fan.g:1:657: BOOL_VAL
                {
                mBOOL_VAL(); if (state.failed) return ;

                }
                break;
            case 88 :
                // antlr/Fan.g:1:666: KEYWORD
                {
                mKEYWORD(); if (state.failed) return ;

                }
                break;
            case 89 :
                // antlr/Fan.g:1:674: RANG_EXCL_OLD
                {
                mRANG_EXCL_OLD(); if (state.failed) return ;

                }
                break;
            case 90 :
                // antlr/Fan.g:1:688: RANGE_EXCL
                {
                mRANGE_EXCL(); if (state.failed) return ;

                }
                break;
            case 91 :
                // antlr/Fan.g:1:699: RANGE
                {
                mRANGE(); if (state.failed) return ;

                }
                break;
            case 92 :
                // antlr/Fan.g:1:705: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 93 :
                // antlr/Fan.g:1:709: MINUS
                {
                mMINUS(); if (state.failed) return ;

                }
                break;
            case 94 :
                // antlr/Fan.g:1:715: ELVIS
                {
                mELVIS(); if (state.failed) return ;

                }
                break;
            case 95 :
                // antlr/Fan.g:1:721: COLCOL
                {
                mCOLCOL(); if (state.failed) return ;

                }
                break;
            case 96 :
                // antlr/Fan.g:1:728: BRACKET_L
                {
                mBRACKET_L(); if (state.failed) return ;

                }
                break;
            case 97 :
                // antlr/Fan.g:1:738: BRACKET_R
                {
                mBRACKET_R(); if (state.failed) return ;

                }
                break;
            case 98 :
                // antlr/Fan.g:1:748: SQ_BRACKET_L
                {
                mSQ_BRACKET_L(); if (state.failed) return ;

                }
                break;
            case 99 :
                // antlr/Fan.g:1:761: SQ_BRACKET_R
                {
                mSQ_BRACKET_R(); if (state.failed) return ;

                }
                break;
            case 100 :
                // antlr/Fan.g:1:774: PAR_L
                {
                mPAR_L(); if (state.failed) return ;

                }
                break;
            case 101 :
                // antlr/Fan.g:1:780: PAR_R
                {
                mPAR_R(); if (state.failed) return ;

                }
                break;
            case 102 :
                // antlr/Fan.g:1:786: COLON
                {
                mCOLON(); if (state.failed) return ;

                }
                break;
            case 103 :
                // antlr/Fan.g:1:792: SEMI
                {
                mSEMI(); if (state.failed) return ;

                }
                break;
            case 104 :
                // antlr/Fan.g:1:797: COMMA
                {
                mCOMMA(); if (state.failed) return ;

                }
                break;
            case 105 :
                // antlr/Fan.g:1:803: PIPE
                {
                mPIPE(); if (state.failed) return ;

                }
                break;
            case 106 :
                // antlr/Fan.g:1:808: ARROW
                {
                mARROW(); if (state.failed) return ;

                }
                break;
            case 107 :
                // antlr/Fan.g:1:814: INIT_VAL
                {
                mINIT_VAL(); if (state.failed) return ;

                }
                break;
            case 108 :
                // antlr/Fan.g:1:823: QMARK
                {
                mQMARK(); if (state.failed) return ;

                }
                break;
            case 109 :
                // antlr/Fan.g:1:829: AT
                {
                mAT(); if (state.failed) return ;

                }
                break;
            case 110 :
                // antlr/Fan.g:1:832: POUND
                {
                mPOUND(); if (state.failed) return ;

                }
                break;
            case 111 :
                // antlr/Fan.g:1:838: CURRY
                {
                mCURRY(); if (state.failed) return ;

                }
                break;
            case 112 :
                // antlr/Fan.g:1:844: EQUAL
                {
                mEQUAL(); if (state.failed) return ;

                }
                break;
            case 113 :
                // antlr/Fan.g:1:850: BITOR
                {
                mBITOR(); if (state.failed) return ;

                }
                break;
            case 114 :
                // antlr/Fan.g:1:856: UNDERSCORE
                {
                mUNDERSCORE(); if (state.failed) return ;

                }
                break;
            case 115 :
                // antlr/Fan.g:1:867: NUMBER
                {
                mNUMBER(); if (state.failed) return ;

                }
                break;
            case 116 :
                // antlr/Fan.g:1:874: ID
                {
                mID(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Fan
    public final void synpred1_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:426:14: ( HEXNB )
        // antlr/Fan.g:426:15: HEXNB
        {
        mHEXNB(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Fan

    // $ANTLR start synpred2_Fan
    public final void synpred2_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:426:31: ( DECIMAL )
        // antlr/Fan.g:426:32: DECIMAL
        {
        mDECIMAL(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Fan

    // $ANTLR start synpred3_Fan
    public final void synpred3_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:428:48: ( FRACTION )
        // antlr/Fan.g:428:49: FRACTION
        {
        mFRACTION(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Fan

    // $ANTLR start synpred4_Fan
    public final void synpred4_Fan_fragment() throws RecognitionException {   
        // antlr/Fan.g:429:7: ( EXPONENT )
        // antlr/Fan.g:429:8: EXPONENT
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


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA12_eotS =
        "\23\uffff\1\61\14\uffff\1\70\25\uffff\1\107\21\uffff\1\112\2\uffff";
    static final String DFA12_eofS =
        "\113\uffff";
    static final String DFA12_minS =
        "\1\141\1\142\1\uffff\1\141\1\145\1\154\1\141\1\146\1\uffff\1\141"+
        "\1\156\1\162\1\145\1\164\1\150\1\uffff\1\151\2\uffff\2\163\1\uffff"+
        "\1\156\5\uffff\1\156\1\162\2\uffff\1\156\5\uffff\1\151\1\uffff\1"+
        "\141\3\uffff\1\151\1\165\1\uffff\1\151\4\uffff\1\163\1\141\1\145"+
        "\16\uffff\1\154\2\uffff\1\154\2\uffff";
    static final String DFA12_maxS =
        "\1\167\1\163\1\uffff\2\157\1\156\1\157\1\163\1\uffff\1\165\1\166"+
        "\1\165\1\145\1\167\1\162\1\uffff\1\157\2\uffff\1\163\1\164\1\uffff"+
        "\1\156\5\uffff\1\156\1\162\2\uffff\1\156\5\uffff\1\157\1\uffff\1"+
        "\164\3\uffff\1\162\1\171\1\uffff\1\154\4\uffff\1\164\1\141\1\145"+
        "\16\uffff\1\154\2\uffff\1\154\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\4\5\uffff\1\27\6\uffff\1\51\1\uffff\1\55\1\1\2\uffff"+
        "\1\7\1\uffff\1\12\1\13\1\14\1\15\1\16\2\uffff\1\23\1\24\1\uffff"+
        "\1\30\1\31\1\32\1\33\1\34\1\uffff\1\37\1\uffff\1\42\1\43\1\44\2"+
        "\uffff\1\52\1\uffff\1\3\1\2\1\5\1\6\3\uffff\1\26\1\25\1\35\1\36"+
        "\1\40\1\41\1\45\1\46\1\47\1\50\1\53\1\54\1\10\1\11\1\uffff\1\22"+
        "\1\21\1\uffff\1\20\1\17";
    static final String DFA12_specialS =
        "\113\uffff}>";
    static final String[] DFA12_transitionS = {
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
            return "385:12: ( 'abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' | 'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' | 'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' | 'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' | 'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' | 'while' )";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\1\6\21\uffff";
    static final String DFA14_eofS =
        "\23\uffff";
    static final String DFA14_minS =
        "\2\56\21\uffff";
    static final String DFA14_maxS =
        "\1\71\1\170\21\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\2\1\15\2";
    static final String DFA14_specialS =
        "\1\0\1\1\21\uffff}>";
    static final String[] DFA14_transitionS = {
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
            return "426:13: ( ( HEXNB )=> HEXNB | ( DECIMAL )=> DECIMAL | FRACTIONAL )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                         
                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_0=='0') ) {s = 1;}

                        else if ( ((LA14_0>='1' && LA14_0<='9')) && (synpred2_Fan())) {s = 2;}

                        else if ( (LA14_0=='.') ) {s = 3;}

                         
                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_1=='x') && (synpred1_Fan())) {s = 4;}

                        else if ( (LA14_1=='X') && (synpred1_Fan())) {s = 5;}

                        else if ( (LA14_1=='_') && (synpred2_Fan())) {s = 7;}

                        else if ( ((LA14_1>='0' && LA14_1<='9')) && (synpred2_Fan())) {s = 8;}

                        else if ( (LA14_1=='.') && (synpred2_Fan())) {s = 9;}

                        else if ( (LA14_1=='E'||LA14_1=='e') && (synpred2_Fan())) {s = 10;}

                        else if ( (LA14_1=='F') && (synpred2_Fan())) {s = 11;}

                        else if ( (LA14_1=='f') && (synpred2_Fan())) {s = 12;}

                        else if ( (LA14_1=='D') && (synpred2_Fan())) {s = 13;}

                        else if ( (LA14_1=='d') && (synpred2_Fan())) {s = 14;}

                        else if ( (LA14_1=='m') && (synpred2_Fan())) {s = 15;}

                        else if ( (LA14_1=='n') && (synpred2_Fan())) {s = 16;}

                        else if ( (LA14_1=='s') && (synpred2_Fan())) {s = 17;}

                        else if ( (LA14_1=='h') && (synpred2_Fan())) {s = 18;}

                        else s = 6;

                         
                        input.seek(index14_1);
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
    static final String DFA30_eotS =
        "\13\uffff";
    static final String DFA30_eofS =
        "\13\uffff";
    static final String DFA30_minS =
        "\1\104\4\uffff\1\151\5\uffff";
    static final String DFA30_maxS =
        "\1\163\4\uffff\1\163\5\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\11\1\5\1\10";
    static final String DFA30_specialS =
        "\13\uffff}>";
    static final String[] DFA30_transitionS = {
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "434:10: fragment NBTYPE : ( 'F' | 'f' | 'D' | ( 'd' ( 'ay' )? ) | 'ms' | 'ns' | 'sec' | 'min' | 'hr' );";
        }
    }
    static final String DFA34_eotS =
        "\1\uffff\21\63\1\130\1\133\1\137\1\141\1\144\1\150\1\154\1\157\1"+
        "\162\1\164\1\167\1\171\1\173\1\uffff\1\177\2\uffff\1\u0081\3\uffff"+
        "\1\u0085\1\u0088\10\uffff\1\u0089\2\uffff\7\63\1\u0092\1\63\1\u0095"+
        "\1\u0096\10\63\1\u00a2\1\63\1\u00a5\15\63\22\uffff\1\u00b6\1\u00b8"+
        "\2\uffff\1\u00ba\12\uffff\1\u00bc\1\uffff\1\u00be\7\uffff\1\u0083"+
        "\1\uffff\1\u00c2\5\uffff\5\63\1\u00ca\2\63\1\uffff\2\63\2\uffff"+
        "\7\63\1\u00d6\3\63\1\uffff\2\63\1\uffff\2\63\1\u00de\14\63\16\uffff"+
        "\3\63\1\u00ee\3\63\1\uffff\12\63\1\u00fc\1\uffff\1\u00fd\6\63\1"+
        "\uffff\1\u0104\1\63\1\u0106\2\63\1\u0109\1\u010a\1\u010b\4\63\1"+
        "\u0110\1\63\1\u0112\1\uffff\1\u0113\1\u0114\1\63\1\u0117\1\u00fd"+
        "\1\63\1\u0119\4\63\1\u011e\1\u00a2\2\uffff\1\u0120\1\63\1\u0122"+
        "\3\63\1\uffff\1\63\1\uffff\2\63\3\uffff\1\u0129\3\63\1\uffff\1\63"+
        "\3\uffff\2\63\1\uffff\1\63\1\uffff\1\u0131\1\63\1\u0133\1\u0134"+
        "\3\uffff\1\63\1\uffff\1\u00a2\1\63\1\u0137\3\63\1\uffff\2\63\1\u013d"+
        "\1\63\1\u00a2\1\u013f\1\63\1\uffff\1\63\2\uffff\1\u0142\1\63\1\uffff"+
        "\1\63\1\u0145\1\63\1\u0147\1\63\1\uffff\1\u0149\1\uffff\1\u014a"+
        "\1\u014b\1\uffff\1\u014c\1\u014d\1\uffff\1\u014e\1\uffff\1\63\6"+
        "\uffff\1\u0150\1\uffff";
    static final String DFA34_eofS =
        "\u0151\uffff";
    static final String DFA34_minS =
        "\1\11\1\162\2\141\1\146\1\145\1\164\2\150\1\145\1\163\1\142\1\141"+
        "\1\151\1\156\1\154\1\151\1\162\1\135\2\52\1\75\1\53\1\55\1\74\1"+
        "\75\1\46\4\75\1\uffff\1\55\2\uffff\1\41\1\uffff\1\0\1\uffff\1\56"+
        "\1\72\10\uffff\1\101\2\uffff\1\145\1\156\1\163\1\141\1\162\1\156"+
        "\1\154\1\60\1\164\2\60\1\141\1\151\1\141\1\160\1\151\1\165\1\151"+
        "\1\146\1\60\1\151\1\60\1\163\1\164\1\167\1\154\1\151\1\162\1\145"+
        "\1\143\1\165\1\163\1\170\1\151\1\142\22\uffff\1\75\1\76\2\uffff"+
        "\1\75\12\uffff\1\75\1\uffff\1\75\7\uffff\1\42\1\uffff\1\56\5\uffff"+
        "\1\141\1\163\1\145\1\143\1\163\1\60\1\141\1\163\1\uffff\1\145\1"+
        "\157\2\uffff\1\165\1\144\2\164\1\145\1\157\1\163\1\60\1\145\1\154"+
        "\1\141\1\uffff\1\156\1\145\1\uffff\1\164\1\151\1\60\1\154\1\141"+
        "\1\144\1\164\1\162\1\145\1\155\1\145\1\151\1\166\1\164\1\154\16"+
        "\uffff\1\153\1\151\1\164\1\60\1\150\1\163\1\141\1\uffff\1\154\1"+
        "\145\1\162\1\164\1\162\1\157\1\143\1\151\1\162\1\167\1\60\1\uffff"+
        "\1\60\1\145\1\165\1\147\2\162\1\166\1\uffff\1\60\1\164\1\60\1\165"+
        "\1\162\3\60\1\156\1\141\1\145\1\151\1\60\1\156\1\60\1\uffff\2\60"+
        "\1\143\2\60\1\156\1\60\2\156\1\150\1\143\1\60\1\40\2\uffff\1\60"+
        "\1\154\1\60\1\164\1\141\1\145\1\uffff\1\151\1\uffff\1\141\1\151"+
        "\3\uffff\1\60\1\164\2\143\1\uffff\1\165\3\uffff\1\150\1\171\1\uffff"+
        "\1\141\1\uffff\1\60\1\154\2\60\3\uffff\1\164\1\uffff\1\60\1\143"+
        "\1\60\2\154\1\144\1\uffff\1\145\1\164\1\60\1\145\2\60\1\154\1\uffff"+
        "\1\171\2\uffff\1\60\1\164\1\uffff\1\145\1\60\1\145\1\60\1\145\1"+
        "\uffff\1\60\1\uffff\2\60\1\uffff\2\60\1\uffff\1\60\1\uffff\1\144"+
        "\6\uffff\1\60\1\uffff";
    static final String DFA34_maxS =
        "\1\176\1\162\2\157\1\164\1\145\1\167\1\162\1\150\1\157\2\163\1\165"+
        "\1\157\1\166\1\156\1\151\1\165\1\135\4\75\1\76\1\174\1\76\2\75\1"+
        "\174\2\75\1\uffff\1\72\2\uffff\1\41\1\uffff\1\uffff\1\uffff\1\71"+
        "\1\75\10\uffff\1\172\2\uffff\1\145\1\156\1\164\1\141\1\162\1\156"+
        "\1\154\1\172\1\164\2\172\1\164\1\151\1\141\1\160\1\162\1\171\1\151"+
        "\1\146\1\172\1\151\1\172\1\163\1\164\1\167\2\154\1\162\1\145\1\143"+
        "\1\165\1\163\1\170\1\157\1\142\22\uffff\1\75\1\76\2\uffff\1\75\12"+
        "\uffff\1\75\1\uffff\1\75\7\uffff\1\42\1\uffff\1\74\5\uffff\1\141"+
        "\1\164\1\145\1\143\1\163\1\172\1\141\1\163\1\uffff\1\145\1\157\2"+
        "\uffff\1\165\1\144\2\164\1\145\1\157\1\163\1\172\1\145\1\154\1\141"+
        "\1\uffff\1\156\1\145\1\uffff\1\164\1\151\1\172\1\154\1\141\1\144"+
        "\1\164\1\162\1\145\1\155\1\145\1\151\1\166\1\164\1\154\16\uffff"+
        "\1\153\1\151\1\164\1\172\1\150\1\163\1\141\1\uffff\1\154\1\145\1"+
        "\162\1\164\1\162\1\157\1\143\1\151\1\162\1\167\1\172\1\uffff\1\172"+
        "\1\145\1\165\1\147\2\162\1\166\1\uffff\1\172\1\164\1\172\1\165\1"+
        "\162\3\172\1\156\1\141\1\145\1\151\1\172\1\156\1\172\1\uffff\2\172"+
        "\1\143\2\172\1\156\1\172\2\156\1\150\1\143\2\172\2\uffff\1\172\1"+
        "\154\1\172\1\164\1\141\1\145\1\uffff\1\151\1\uffff\1\141\1\151\3"+
        "\uffff\1\172\1\164\2\143\1\uffff\1\165\3\uffff\1\150\1\171\1\uffff"+
        "\1\141\1\uffff\1\172\1\154\2\172\3\uffff\1\164\1\uffff\1\172\1\143"+
        "\1\172\2\154\1\144\1\uffff\1\145\1\164\1\172\1\145\2\172\1\154\1"+
        "\uffff\1\171\2\uffff\1\172\1\164\1\uffff\1\145\1\172\1\145\1\172"+
        "\1\145\1\uffff\1\172\1\uffff\2\172\1\uffff\2\172\1\uffff\1\172\1"+
        "\uffff\1\144\6\uffff\1\172\1\uffff";
    static final String DFA34_acceptS =
        "\37\uffff\1\111\1\uffff\1\114\1\115\1\uffff\1\122\1\uffff\1\125"+
        "\2\uffff\1\140\1\141\1\143\1\144\1\145\1\147\1\150\1\155\1\uffff"+
        "\1\163\1\164\43\uffff\1\52\1\142\1\53\1\126\1\103\1\54\1\116\1\120"+
        "\1\104\1\55\1\105\1\56\1\107\1\102\1\57\1\110\1\152\1\135\2\uffff"+
        "\1\121\1\75\1\uffff\1\76\1\77\1\62\1\66\1\157\1\63\1\161\1\64\1"+
        "\65\1\151\1\uffff\1\160\1\uffff\1\106\1\112\1\113\1\136\1\154\1"+
        "\117\1\156\1\uffff\1\124\1\uffff\1\134\1\137\1\153\1\146\1\162\10"+
        "\uffff\1\4\2\uffff\1\46\1\51\13\uffff\1\130\2\uffff\1\17\17\uffff"+
        "\1\60\1\100\1\73\1\74\1\61\1\101\1\67\1\71\1\70\1\72\1\123\1\131"+
        "\1\132\1\133\7\uffff\1\3\13\uffff\1\11\7\uffff\1\41\17\uffff\1\12"+
        "\15\uffff\1\43\1\127\6\uffff\1\50\1\uffff\1\30\2\uffff\1\42\1\32"+
        "\1\45\4\uffff\1\1\1\uffff\1\21\1\14\1\31\2\uffff\1\27\1\uffff\1"+
        "\47\4\uffff\1\44\1\7\1\10\1\uffff\1\16\6\uffff\1\33\7\uffff\1\5"+
        "\1\uffff\1\6\1\22\2\uffff\1\23\5\uffff\1\37\1\uffff\1\15\2\uffff"+
        "\1\13\2\uffff\1\26\1\uffff\1\35\1\uffff\1\2\1\40\1\20\1\34\1\24"+
        "\1\25\1\uffff\1\36";
    static final String DFA34_specialS =
        "\45\uffff\1\0\u012b\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\42\1\41\2\uffff\1\41\22\uffff\1\42\1\36\1\45\1\43\1\uffff"+
            "\1\25\1\32\1\44\1\54\1\55\1\23\1\26\1\57\1\27\1\47\1\24\12\62"+
            "\1\50\1\56\1\30\1\35\1\31\1\40\1\60\32\63\1\22\1\uffff\1\53"+
            "\1\33\1\61\1\46\1\13\1\1\1\2\1\11\1\17\1\3\2\63\1\4\3\63\1\20"+
            "\1\14\1\16\1\21\1\63\1\5\1\6\1\7\1\12\1\15\1\10\3\63\1\51\1"+
            "\34\1\52\1\37",
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
            "\1\127",
            "\1\132\22\uffff\1\131",
            "\1\136\4\uffff\1\135\15\uffff\1\134",
            "\1\140",
            "\1\143\21\uffff\1\142",
            "\1\146\17\uffff\1\145\1\147",
            "\1\151\1\152\76\uffff\1\153",
            "\1\156\1\155",
            "\1\161\26\uffff\1\160",
            "\1\163",
            "\1\165\76\uffff\1\166",
            "\1\170",
            "\1\172",
            "",
            "\1\175\1\174\13\uffff\1\176",
            "",
            "",
            "\1\u0080",
            "",
            "\42\u0083\1\u0082\uffdd\u0083",
            "",
            "\1\u0084\1\uffff\12\62",
            "\1\u0086\2\uffff\1\u0087",
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
            "\1\u008a",
            "\1\u008b",
            "\1\u008c\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0093",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\15\63\1\u0094\14"+
            "\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0098\22\uffff\1\u0097",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009d\10\uffff\1\u009c",
            "\1\u009f\3\uffff\1\u009e",
            "\1\u00a0",
            "\1\u00a1",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u00a4\7\63",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00ab\2\uffff\1\u00aa",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2\5\uffff\1\u00b3",
            "\1\u00b4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b5",
            "\1\u00b7",
            "",
            "",
            "\1\u00b9",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb",
            "",
            "\1\u00bd",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bf",
            "",
            "\1\u00c0\15\uffff\1\u00c1",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c3",
            "\1\u00c5\1\u00c4",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\4\63\1\u00c9\25\63",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
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
            "\1\u00ea",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0105",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0107",
            "\1\u0108",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0111",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0115",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u0116\16"+
            "\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0118",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u011f\17\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff"+
            "\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0121",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
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
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
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
            "\1\u0130",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0132",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "\1\u0135",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0136",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\u013b",
            "\1\u013c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u013e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0140",
            "",
            "\1\u0141",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0143",
            "",
            "\1\u0144",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0146",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0148",
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
            "\1\u014f",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T_BREAK | T_CONTINUE | T_FOR | T_IF | T_RETURN | T_SWITCH | T_THROW | T_WHILE | T_TRY | T_CASE | T_DEFAULT | T_CATCH | T_FINALLY | T_USING | T_AS | T_RD_ONLY | T_CONST | T_STATIC | T_NATIVE | T_VOLATILE | T_OVERRIDE | T_VIRTUAL | T_FINAL | T_VOID | T_CLASS | T_ENUM | T_MIXIN | T_ABSTRACT | T_PRIVATE | T_PROTECTED | T_PUBLIC | T_INTERNAL | T_NEW | T_ONCE | T_THIS | T_SUPER | T_ELSE | T_IS | T_ISNOT | T_NULL | T_IT | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | LB | WS | LINE_COMMENT | EXEC_COMMENT | MULTI_COMMENT | DSL | CHAR | QUOTSTR | STR | URI | DOC | BOOL_VAL | KEYWORD | RANG_EXCL_OLD | RANGE_EXCL | RANGE | DOT | MINUS | ELVIS | COLCOL | BRACKET_L | BRACKET_R | SQ_BRACKET_L | SQ_BRACKET_R | PAR_L | PAR_R | COLON | SEMI | COMMA | PIPE | ARROW | INIT_VAL | QMARK | AT | POUND | CURRY | EQUAL | BITOR | UNDERSCORE | NUMBER | ID );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_37 = input.LA(1);

                        s = -1;
                        if ( (LA34_37=='\"') ) {s = 130;}

                        else if ( ((LA34_37>='\u0000' && LA34_37<='!')||(LA34_37>='#' && LA34_37<='\uFFFF')) ) {s = 131;}

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}