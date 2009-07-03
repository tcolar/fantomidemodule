lexer grammar Fan;

@members {
	//typeOverride
	int too=-1;
	public int getTypeOverride() {return too;}
	public void clearTypeOverride() {too=-1;}
}
@header {package net.colar.netbeans.fan.antlr;}

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

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 398
LB		: (('\r\n') | '\n')+ {$channel=HIDDEN;};
// Other ignored data: whitespaces, comments
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 400
WS  		:  (' '|'\t') {$channel=HIDDEN;}; // whitespace
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 401
LINE_COMMENT	: '//' (~('\n'))* {$channel=HIDDEN;};
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 402
EXEC_COMMENT	: '#!' (~('\n'))* {$channel=HIDDEN;};

// need to use a predicate for incomplete item detection to work right.
// backtracking in lexer wiithout predicate doesn't seem to happen right, with greedy=false.
// if incomplete we match till end of line since most likely just started new comment
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 407
MULTI_COMMENT	: '/*' ((COMPL_ML_COMMENT)=>COMPL_ML_COMMENT | ~'\n'* {too=INC_COMMENT;}){$channel=HIDDEN;};
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 408
fragment
COMPL_ML_COMMENT: (options{greedy=false;}:.)* '*/';

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 411
DSL		:'<|' ((COMPL_DSL)=>COMPL_DSL | ~'\n'* {too=INC_DSL;});
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 412
fragment
COMPL_DSL	: (options{greedy=false;}:.)* '|>';

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 415
CHAR		:'\'' (('\\' .) | ('\\u' (DIGIT | HEXLETTER) (DIGIT | HEXLETTER)
			(DIGIT | HEXLETTER) (DIGIT | HEXLETTER)) | .)? '\''; //Letter possibly bacquoted or unicode char
//RAWSTR		: 'r"' ~('"')* '"'; // obsoteted
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 418
QUOTSTR		: '"""' ((COMPL_QSTR)=>COMPL_QSTR | ~'\n'* {too=INC_STR;});
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 419
fragment
COMPL_QSTR	: (options{greedy=false;}:.)* '"""';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 421
STR		: '"' ((COMPL_STR)=>COMPL_STR | ~'\n'* {too=INC_STR;});// accept strings incl. \"
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 422
fragment
COMPL_STR	: ('\\\\' | '\\"' | ~'"')* '"';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 424
URI		: '`'  ((COMPL_URI)=>COMPL_URI | ~'\n'* {too=INC_URI;});
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 425
fragment
COMPL_URI	: (('\\\\') | ('\\`') | ~('`') )* '`';

// ######## Start NOT Hidden items ####
// TODO: probably should use \r?\n  ... but that seem to cause issues when testing in antlrworks -> why ?
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 430
DOC	 	:   '**' ( options {greedy=false;} : . )* '\n' ; // ~ javadoc (fandoc)

// Fan language keywords
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 433
KEYWORD		: ('abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' |
		'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' |
 		'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' |
 		'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' |
 		'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' |
		'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' |
		'while');


// Symbols
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 443
CP_EQUALITY	:'===' | '!==' | '==' | '!=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 444
CP_COMPARATORS	:'<=>' | '<=' | '<' | '>=' | '>';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 445
AS_ASSIGN_OP	:'*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 446
LIST_TYPE	:'[]';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 447
OP_SAFEDYN_CALL	:'?->';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 448
OP_ARROW	:'->';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 449
OP_SAFE_CALL	:'?.';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 450
OP_RANG_EXCL_OLD:'...';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 451
OP_RANGE_EXCL	:'..<';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 452
OP_RANGE	:'..';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 453
OP_ELVIS	:'?:';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 454
SP_COLCOL	:'::';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 455
BRACKET_L	:'{';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 456
BRACKET_R	:'}';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 457
SQ_BRACKET_L	:'[';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 458
SQ_BRACKET_R	:']';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 459
PAR_L		:'(';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 460
PAR_R		:')';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 461
SP_COLON	:':';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 462
SP_SEMI		:';';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 463
SP_COMMA	:',';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 464
SP_PIPE		:'|';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 465
AS_INIT_VAL	:':=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 466
SP_QMARK	:'?';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 467
AT		:'@';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 468
OP_POUND	:'#';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 469
OP_CURRY	:'&';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 470
AS_EQUAL	:'=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 471
OP_BITOR	:'^';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 472
UNDERSCORE	:'_';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 473
OP_AND		:'&&';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 474
OP_OR		:'||';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 475
DOT		:'.';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 476
OP_2PLUS	:'++';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 477
OP_2MINUS	:'--';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 478
OP_MINUS	:'-';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 479
OP_PLUS		:'+';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 480
OP_LSHIFT	:'<<';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 481
OP_RSHIFT	:'>>';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 482
OP_MULTI	:'*';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 483
OP_DIV		:'/';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 484
OP_MOD		:'%';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 485
OP_BANG		:'!';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 486
OP_TILDA	:'~';

// Numbers / Letters matching
// Apparently fan allows syntax like var=var-1 so we can't 'eat' the - as part as the number (lexer) since it could be a minus operand

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 491
fragment HEX_HEADER	: 	'0x' | '0X';

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 493
NUMBER			: 	((HEXNB)=>HEXNB | (DECIMAL)=>DECIMAL | FRACTIONAL);
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 494
fragment HEXNB		:	HEXHEADER (UNDERSCORE* (DIGIT | HEXLETTER))+;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 495
fragment DECIMAL	:	DIGIT (UNDERSCORE* DIGIT)* ((FRACTION)=>FRACTION)? 
					((EXPONENT)=>EXPONENT)? NBTYPE?;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 497
fragment FRACTIONAL	:	FRACTION EXPONENT? NBTYPE?;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 498
fragment FRACTION	:	DOT DIGIT (UNDERSCORE* DIGIT)*;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 499
fragment EXPONENT	:	('e'|'E') ('+' | OP_MINUS)? DIGIT (UNDERSCORE* DIGIT)*;
// d,f are for float or decimal
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 501
fragment NBTYPE		:	'F' | 'f' | 'D' | ('d' 'ay'?) | 'ms' | 'ns' | 
					'sec' | 'min' | 'hr';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 503
fragment HEXLETTER	: 	'a'|'b'|'c'|'d'|'e'|'f'|'A'|'B'|'C'|'D'|'E'|'F';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 504
fragment HEXHEADER	: 	'0x' | '0X';

// any other "word" is an "ID"
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 507
ID			: (UNDERSCORE* LETTER) ( LETTER | DIGIT | UNDERSCORE )*;

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 509
fragment LETTER		: ('a'..'z' | 'A'..'Z');
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 510
fragment DIGIT		: '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9';

// catch all
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 513
INC_UNKNOWN_ITEM	: .;

// ################################### end ##############################
