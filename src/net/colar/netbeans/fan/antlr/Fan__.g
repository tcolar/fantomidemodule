lexer grammar Fan;

@members {
	//typeOverride
	int too=-1;
	public int getTypeOverride() {return too;}
	public void clearTypeOverride() {too=-1;}
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

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 485
LB		: (('\r\n') | '\n')+ {$channel=HIDDEN;};
// Other ignored data: whitespaces, comments
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 487
WS  		:  (' '|'\t') {$channel=HIDDEN;}; // whitespace
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 488
LINE_COMMENT	: '//' (~('\n'))* {$channel=HIDDEN;};
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 489
EXEC_COMMENT	: '#!' (~('\n'))* {$channel=HIDDEN;};

// need to use a predicate for incomplete item detection to work right.
// backtracking in lexer wiithout predicate doesn't seem to happen right, with greedy=false.
// if incomplete we match till end of line since most likely just started new comment
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 494
MULTI_COMMENT	: '/*' ((COMPL_ML_COMMENT)=>COMPL_ML_COMMENT | ~'\n'* {too=INC_COMMENT;}){$channel=HIDDEN;};
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 495
fragment
COMPL_ML_COMMENT: (options{greedy=false;}:.)* '*/';

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 498
DSL		:'<|' ((COMPL_DSL)=>COMPL_DSL | ~'\n'* {too=INC_DSL;});
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 499
fragment
COMPL_DSL	: (options{greedy=false;}:.)* '|>';

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 502
CHAR		:'\'' (('\\' .) | ('\\u' (DIGIT | HEXLETTER) (DIGIT | HEXLETTER)
			(DIGIT | HEXLETTER) (DIGIT | HEXLETTER)) | .)? '\''; //Letter possibly bacquoted or unicode char
//RAWSTR		: 'r"' ~('"')* '"'; // obsoteted
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 505
QUOTSTR		: '"""' ((COMPL_QSTR)=>COMPL_QSTR | ~'\n'* {too=INC_STR;});
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 506
fragment
COMPL_QSTR	: (options{greedy=false;}:.)* '"""';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 508
STR		: '"' ((COMPL_STR)=>COMPL_STR | ~'\n'* {too=INC_STR;});// accept strings incl. \"
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 509
fragment
COMPL_STR	: ('\\\\' | '\\"' | ~'"')* '"';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 511
URI		: '`'  ((COMPL_URI)=>COMPL_URI | ~'\n'* {too=INC_URI;});
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 512
fragment
COMPL_URI	: (('\\\\') | ('\\`') | ~('`') )* '`';

// ######## Start NOT Hidden items ####
// TODO: probably should use \r?\n  ... but that seem to cause issues when testing in antlrworks -> why ?
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 517
DOC	 	:   '**' ( options {greedy=false;} : . )* '\n' ; // ~ javadoc (fandoc)

// Fan language keywords
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 520
KEYWORD		: ('abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' |
		'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' |
 		'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' |
 		'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' |
 		'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' |
		'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' |
		'while');


// Symbols
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 530
CP_EQUALITY	:'===' | '!==' | '==' | '!=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 531
CP_COMPARATORS  :'<=' | '>=' | '<=>' | '<' | '>';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 532
AS_ASSIGN_OP	:'*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 533
LIST_TYPE	:'[]';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 534
OP_SAFEDYN_CALL	:'?->';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 535
OP_ARROW	:'->';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 536
OP_SAFE_CALL	:'?.';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 537
OP_RANG_EXCL_OLD:'...';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 538
OP_RANGE_EXCL	:'..<';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 539
OP_RANGE	:'..';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 540
OP_ELVIS	:'?:';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 541
SP_COLCOL	:'::';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 542
BRACKET_L	:'{';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 543
BRACKET_R	:'}';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 544
SQ_BRACKET_L	:'[';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 545
SQ_BRACKET_R	:']';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 546
PAR_L		:'(';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 547
PAR_R		:')';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 548
SP_COLON	:':';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 549
SP_SEMI		:';';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 550
SP_COMMA	:',';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 551
SP_PIPE		:'|';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 552
AS_INIT_VAL	:':=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 553
SP_QMARK	:'?';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 554
AT		:'@';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 555
OP_POUND	:'#';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 556
OP_CURRY	:'&';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 557
AS_EQUAL	:'=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 558
OP_BITOR	:'^';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 559
UNDERSCORE	:'_';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 560
OP_AND		:'&&';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 561
OP_OR		:'||';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 562
DOT		:'.';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 563
OP_2PLUS	:'++';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 564
OP_2MINUS	:'--';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 565
OP_MINUS	:'-';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 566
OP_PLUS		:'+';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 567
OP_LSHIFT	:'<<';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 568
OP_RSHIFT	:'>>';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 569
OP_MULTI	:'*';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 570
OP_DIV		:'/';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 571
OP_MOD		:'%';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 572
OP_BANG		:'!';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 573
OP_TILDA	:'~';

// Numbers / Letters matching
// Apparently fan allows syntax like var=var-1 so we can't 'eat' the - as part as the number (lexer) since it could be a minus operand

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 578
fragment HEX_HEADER	: 	'0x' | '0X';

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 580
NUMBER			: 	((HEXNB)=>HEXNB | (DECIMAL)=>DECIMAL | FRACTIONAL);
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 581
fragment HEXNB		:	HEXHEADER (UNDERSCORE* (DIGIT | HEXLETTER))+;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 582
fragment DECIMAL	:	DIGIT (UNDERSCORE* DIGIT)* ((FRACTION)=>FRACTION)? 
					((EXPONENT)=>EXPONENT)? NBTYPE?;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 584
fragment FRACTIONAL	:	FRACTION EXPONENT? NBTYPE?;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 585
fragment FRACTION	:	DOT DIGIT (UNDERSCORE* DIGIT)*;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 586
fragment EXPONENT	:	('e'|'E') ('+' | OP_MINUS)? DIGIT (UNDERSCORE* DIGIT)*;
// d,f are for float or decimal
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 588
fragment NBTYPE		:	'F' | 'f' | 'D' | ('d' 'ay'?) | 'ms' | 'ns' | 
					'sec' | 'min' | 'hr';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 590
fragment HEXLETTER	: 	'a'|'b'|'c'|'d'|'e'|'f'|'A'|'B'|'C'|'D'|'E'|'F';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 591
fragment HEXHEADER	: 	'0x' | '0X';

// any other "word" is an "ID"
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 594
ID			: (UNDERSCORE* LETTER) ( LETTER | DIGIT | UNDERSCORE )*;

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 596
fragment LETTER		: ('a'..'z' | 'A'..'Z');
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 597
fragment DIGIT		: '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9';

// catch all
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 600
INC_UNKNOWN_ITEM	: .;

// ################################### end ##############################
