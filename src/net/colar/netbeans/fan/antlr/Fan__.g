lexer grammar Fan;

@members {
	//typeOverride
	int too=-1;
	public int getTypeOverride() {return too;}
	public void clearTypeOverride() {too=-1;}
        Stack<String> paraphrase = new Stack<String>();
}
@header {package net.colar.netbeans.fan.antlr;
import net.colar.netbeans.fan.FanParserResult;
}

KW_BREAK : 'break' ;
KW_CONTINUE : 'continue' ;
KW_FOR : 'for' ;
KW_IF : 'if' ;
KW_RETURN : 'return' ;
KW_SWITCH : 'switch' ;
KW_THROW : 'throw ' ;
KW_WHILE : 'while' ;
KW_TRY : 'try' ;
KW_CASE : 'case' ;
KW_DEFAULT : 'default' ;
KW_CATCH : 'catch' ;
KW_FINALLY : 'finally' ;
KW_USING : 'using' ;
KW_AS : 'as' ;
KW_RD_ONLY : 'readonly' ;
KW_CONST : 'const' ;
KW_STATIC : 'static' ;
KW_NATIVE : 'native' ;
KW_VOLATILE : 'volatile' ;
KW_OVERRIDE : 'override' ;
KW_VIRTUAL : 'virtual' ;
KW_FINAL : 'final' ;
KW_VOID : 'void' ;
KW_CLASS : 'class' ;
KW_ENUM : 'enum' ;
KW_MIXIN : 'mixin' ;
KW_ABSTRACT : 'abstract' ;
KW_PRIVATE : 'private' ;
KW_PROTECTED : 'protected' ;
KW_PUBLIC : 'public' ;
KW_INTERNAL : 'internal' ;
KW_NEW : 'new' ;
KW_ONCE : 'once' ;
KW_THIS : 'this' ;
KW_SUPER : 'super' ;
KW_ELSE : 'else' ;
KW_IS : 'is' ;
KW_ISNOT : 'isnot' ;
KW_NULL : 'null' ;
KW_IT : 'it' ;
KW_TRUE : 'true' ;
KW_FALSE : 'false' ;

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 428
LB		: (('\r\n') | '\n')+ {$channel=HIDDEN;};
// Other ignored data: whitespaces, comments
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 430
WS  		:  (' '|'\t') {$channel=HIDDEN;}; // whitespace
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 431
LINE_COMMENT	: '//' (~('\n'))* {$channel=HIDDEN;};
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 432
EXEC_COMMENT	: '#!' (~('\n'))* {$channel=HIDDEN;};

// need to use a predicate for incomplete item detection to work right.
// backtracking in lexer wiithout predicate doesn't seem to happen right, with greedy=false.
// if incomplete we match till end of line since most likely just started new comment
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 437
MULTI_COMMENT	: '/*' ((COMPL_ML_COMMENT)=>COMPL_ML_COMMENT | ~'\n'* {too=INC_COMMENT;}){$channel=HIDDEN;};
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 438
fragment
COMPL_ML_COMMENT: (options{greedy=false;}:.)* '*/';

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 441
DSL		:'<|' ((COMPL_DSL)=>COMPL_DSL | ~'\n'* {too=INC_DSL;});
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 442
fragment
COMPL_DSL	: (options{greedy=false;}:.)* '|>';

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 445
CHAR		:'\'' (('\\' .) | ('\\u' (DIGIT | HEXLETTER) (DIGIT | HEXLETTER)
			(DIGIT | HEXLETTER) (DIGIT | HEXLETTER)) | .)? '\''; //Letter possibly bacquoted or unicode char
//RAWSTR		: 'r"' ~('"')* '"'; // obsoteted
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 448
QUOTSTR		: '"""' ((COMPL_QSTR)=>COMPL_QSTR | ~'\n'* {too=INC_STR;});
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 449
fragment
COMPL_QSTR	: (options{greedy=false;}:.)* '"""';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 451
STR		: '"' ((COMPL_STR)=>COMPL_STR | ~'\n'* {too=INC_STR;});// accept strings incl. \"
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 452
fragment
COMPL_STR	: ('\\\\' | '\\"' | ~'"')* '"';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 454
URI		: '`'  ((COMPL_URI)=>COMPL_URI | ~'\n'* {too=INC_URI;});
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 455
fragment
COMPL_URI	: (('\\\\') | ('\\`') | ~('`') )* '`';

// ######## Start NOT Hidden items ####
// TODO: probably should use \r?\n  ... but that seem to cause issues when testing in antlrworks -> why ?
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 460
DOC	 	:   '**' ( options {greedy=false;} : . )* '\n' ; // ~ javadoc (fandoc)

// Fan language keywords
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 463
KEYWORD		: ('abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' |
		'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' |
 		'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' |
 		'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' |
 		'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' |
		'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' |
		'while');


// Symbols
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 473
CP_EQUALITY
@init {paraphrase.push("Equality Comparator");} @after{paraphrase.pop();}
		:'===' | '!==' | '==' | '!=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 476
CP_COMPARATORS
@init {paraphrase.push("Comparator");} @after{paraphrase.pop();}		:'<=>' | '<=' | '<' | '>=' | '>';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 478
AS_ASSIGN_OP
@init {paraphrase.push("Assigmnet Operator");} @after{paraphrase.pop();}
		:'*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 481
LIST_TYPE
@init {paraphrase.push("[]");} @after{paraphrase.pop();}
		:'[]';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 484
OP_SAFEDYN_CALL
@init {paraphrase.push("?->");} @after{paraphrase.pop();}
		:'?->';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 487
OP_ARROW
@init {paraphrase.push("->");} @after{paraphrase.pop();}
		:'->';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 490
OP_SAFE_CALL
@init {paraphrase.push("?.");} @after{paraphrase.pop();}
		:'?.';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 493
OP_RANG_EXCL_OLD
@init {paraphrase.push("...");} @after{paraphrase.pop();}
		:'...';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 496
OP_RANGE_EXCL
@init {paraphrase.push("..<");} @after{paraphrase.pop();}
		:'..<';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 499
OP_RANGE
@init {paraphrase.push("..");} @after{paraphrase.pop();}
		:'..';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 502
OP_ELVIS
@init {paraphrase.push("?:");} @after{paraphrase.pop();}
		:'?:';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 505
SP_COLCOL
@init {paraphrase.push("::");} @after{paraphrase.pop();}
		:'::';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 508
BRACKET_L
@init {paraphrase.push("{");} @after{paraphrase.pop();}
		:'{';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 511
BRACKET_R
@init {paraphrase.push("}");} @after{paraphrase.pop();}
		:'}';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 514
SQ_BRACKET_L
@init {paraphrase.push("[");} @after{paraphrase.pop();}
		:'[';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 517
SQ_BRACKET_R
@init {paraphrase.push("]");} @after{paraphrase.pop();}
		:']';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 520
PAR_L
@init {paraphrase.push("(");} @after{paraphrase.pop();}
		:'(';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 523
PAR_R
@init {paraphrase.push(")");} @after{paraphrase.pop();}
		:')';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 526
SP_COLON
@init {paraphrase.push(":");} @after{paraphrase.pop();}
		:':';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 529
SP_SEMI
@init {paraphrase.push(";");} @after{paraphrase.pop();}
		:';';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 532
SP_COMMA
@init {paraphrase.push(",");} @after{paraphrase.pop();}
		:',';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 535
SP_PIPE
@init {paraphrase.push("|");} @after{paraphrase.pop();}
		:'|';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 538
AS_INIT_VAL
@init {paraphrase.push(":=");} @after{paraphrase.pop();}
		:':=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 541
SP_QMARK
@init {paraphrase.push("?");} @after{paraphrase.pop();}
		:'?';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 544
AT
@init {paraphrase.push("@");} @after{paraphrase.pop();}
		:'@';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 547
OP_POUND
@init {paraphrase.push("#");} @after{paraphrase.pop();}
		:'#';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 550
OP_CURRY
@init {paraphrase.push("&");} @after{paraphrase.pop();}
		:'&';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 553
AS_EQUAL
@init {paraphrase.push("=");} @after{paraphrase.pop();}
		:'=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 556
OP_BITOR
@init {paraphrase.push("^");} @after{paraphrase.pop();}
		:'^';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 559
UNDERSCORE
@init {paraphrase.push("_");} @after{paraphrase.pop();}
		:'_';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 562
OP_AND
@init {paraphrase.push("&&");} @after{paraphrase.pop();}
		:'&&';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 565
OP_OR
@init {paraphrase.push("||");} @after{paraphrase.pop();}
		:'||';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 568
DOT
@init {paraphrase.push(".");} @after{paraphrase.pop();}
		:'.';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 571
OP_2PLUS
@init {paraphrase.push("++");} @after{paraphrase.pop();}
		:'++';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 574
OP_2MINUS
@init {paraphrase.push("--");} @after{paraphrase.pop();}
		:'--';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 577
OP_MINUS
@init {paraphrase.push("-");} @after{paraphrase.pop();}
		:'-';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 580
OP_PLUS
@init {paraphrase.push("+");} @after{paraphrase.pop();}
		:'+';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 583
OP_LSHIFT
@init {paraphrase.push("<<");} @after{paraphrase.pop();}
		:'<<';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 586
OP_RSHIFT
@init {paraphrase.push(">>");} @after{paraphrase.pop();}
		:'>>';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 589
OP_MULTI
@init {paraphrase.push("*");} @after{paraphrase.pop();}
		:'*';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 592
OP_DIV
@init {paraphrase.push("/");} @after{paraphrase.pop();}
		:'/';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 595
OP_MOD
@init {paraphrase.push("\%");} @after{paraphrase.pop();}
		:'%';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 598
OP_BANG
@init {paraphrase.push("!");} @after{paraphrase.pop();}
		:'!';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 601
OP_TILDA
@init {paraphrase.push("~");} @after{paraphrase.pop();}
		:'~';

// Numbers / Letters matching
// Apparently fan allows syntax like var=var-1 so we can't 'eat' the - as part as the number (lexer) since it could be a minus operand

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 608
fragment HEX_HEADER	: 	'0x' | '0X';

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 610
NUMBER			: 	((HEXNB)=>HEXNB | (DECIMAL)=>DECIMAL | FRACTIONAL);
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 611
fragment HEXNB		:	HEXHEADER (UNDERSCORE* (DIGIT | HEXLETTER))+;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 612
fragment DECIMAL	:	DIGIT (UNDERSCORE* DIGIT)* ((FRACTION)=>FRACTION)? 
					((EXPONENT)=>EXPONENT)? NBTYPE?;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 614
fragment FRACTIONAL	:	FRACTION EXPONENT? NBTYPE?;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 615
fragment FRACTION	:	DOT DIGIT (UNDERSCORE* DIGIT)*;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 616
fragment EXPONENT	:	('e'|'E') ('+' | OP_MINUS)? DIGIT (UNDERSCORE* DIGIT)*;
// d,f are for float or decimal
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 618
fragment NBTYPE		:	'F' | 'f' | 'D' | ('d' 'ay'?) | 'ms' | 'ns' | 
					'sec' | 'min' | 'hr';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 620
fragment HEXLETTER	: 	'a'|'b'|'c'|'d'|'e'|'f'|'A'|'B'|'C'|'D'|'E'|'F';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 621
fragment HEXHEADER	: 	'0x' | '0X';

// any other "word" is an "ID"
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 624
ID
@init {paraphrase.push("Identifier");} @after{paraphrase.pop();}
			: (UNDERSCORE* LETTER) ( LETTER | DIGIT | UNDERSCORE )*;

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 628
fragment LETTER		: ('a'..'z' | 'A'..'Z');
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 629
fragment DIGIT		: '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9';

// catch all
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 632
INC_UNKNOWN_ITEM
@init {paraphrase.push("Unknown Item");} @after{paraphrase.pop();}
			: .;

// ################################### end ##############################
