lexer grammar Fan;

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

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 382
LB		: (('\r\n') | '\n')+ {$channel=HIDDEN;};
// Other ignored data: whitespaces, comments
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 384
WS  		:  (' '|'\t') {$channel=HIDDEN;}; // whitespace
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 385
LINE_COMMENT	: '//' (~('\n'))* {$channel=HIDDEN;};
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 386
EXEC_COMMENT	: '#!' (~('\n'))* {$channel=HIDDEN;};
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 387
MULTI_COMMENT	: ( '/*' ( options {greedy=false;} : . )* '*/'){$channel=HIDDEN;};

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 389
DSL		:'<|' ( options {greedy=false;} : . )* '|>';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 390
CHAR		:'\'' (('\\' .) | ('\\u' (DIGIT | HEXLETTER) (DIGIT | HEXLETTER)
			(DIGIT | HEXLETTER) (DIGIT | HEXLETTER)) | .)? '\''; //Letter possibly bacquoted or unicode char
//RAWSTR		: 'r"' ~('"')* '"'; // obsolteted
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 393
QUOTSTR		: '"""' ( options {greedy=false;} : . )* '"""';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 394
STR		: ( '"' ( ('\\\\') | ('\\"') | ~('"') )* '"');// accept strings incl. \"
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 395
URI		: ( '`' ( ('\\\\') | ('\\`') | ~('`') )* '`');

// ######## Start NOT Hidden items ####
// TODO: probably should use \r?\n  ... but that seem to cause issues when testing in antlrworks -> why ?
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 399
DOC	 	:   '**' ( options {greedy=false;} : . )* '\n' ; // ~ javadoc (fandoc)

// Fan language keywords
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 402
KEYWORD		: ('abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' |
		'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' |
 		'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' |
 		'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' |
 		'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' |
		'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' |
		'while');


// Symbols
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 412
CP_EQUALITY	:'===' | '!==' | '==' | '!=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 413
CP_COMPARATORS	:'<=>' | '<=' | '<' | '>=' | '>';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 414
AS_ASSIGN_OP	:'*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 415
LIST_TYPE	:'[]';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 416
OP_SAFEDYN_CALL	:'?->';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 417
OP_ARROW	:'->';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 418
OP_SAFE_CALL	:'?.';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 419
OP_RANG_EXCL_OLD:'...';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 420
OP_RANGE_EXCL	:'..<';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 421
OP_RANGE	:'..';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 422
OP_ELVIS	:'?:';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 423
SP_COLCOL	:'::';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 424
BRACKET_L	:'{';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 425
BRACKET_R	:'}';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 426
SQ_BRACKET_L	:'[';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 427
SQ_BRACKET_R	:']';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 428
PAR_L		:'(';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 429
PAR_R		:')';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 430
SP_COLON	:':';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 431
SP_SEMI		:';';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 432
SP_COMMA	:',';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 433
SP_PIPE		:'|';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 434
AS_INIT_VAL	:':=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 435
SP_QMARK	:'?';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 436
AT		:'@';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 437
OP_POUND	:'#';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 438
OP_CURRY	:'&';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 439
AS_EQUAL	:'=';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 440
OP_BITOR	:'^';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 441
UNDERSCORE	:'_';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 442
OP_AND		:'&&';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 443
OP_OR		:'||';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 444
DOT		:'.';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 445
OP_2PLUS	:'++';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 446
OP_2MINUS	:'--';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 447
OP_MINUS	:'-';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 448
OP_PLUS		:'+';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 449
OP_LSHIFT	:'<<';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 450
OP_RSHIFT	:'>>';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 451
OP_MULTI	:'*';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 452
OP_DIV		:'/';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 453
OP_MOD		:'%';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 454
OP_BANG		:'!';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 455
OP_TILDA	:'~';

// Numbers / Letters matching
// Apparently fan allows syntax like var=var-1 so we can't 'eat' the - as part as the number (lexer) since it could be a minus operand

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 460
fragment HEX_HEADER	: 	'0x' | '0X';

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 462
NUMBER			: 	((HEXNB)=>HEXNB | (DECIMAL)=>DECIMAL | FRACTIONAL);
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 463
fragment HEXNB		:	HEXHEADER (UNDERSCORE* (DIGIT | HEXLETTER))+;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 464
fragment DECIMAL	:	DIGIT (UNDERSCORE* DIGIT)* ((FRACTION)=>FRACTION)? 
					((EXPONENT)=>EXPONENT)? NBTYPE?;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 466
fragment FRACTIONAL	:	FRACTION EXPONENT? NBTYPE?;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 467
fragment FRACTION	:	DOT DIGIT (UNDERSCORE* DIGIT)*;
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 468
fragment EXPONENT	:	('e'|'E') ('+' | OP_MINUS)? DIGIT (UNDERSCORE* DIGIT)*;
// d,f are for float or decimal
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 470
fragment NBTYPE		:	'F' | 'f' | 'D' | ('d' 'ay'?) | 'ms' | 'ns' | 
					'sec' | 'min' | 'hr';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 472
fragment HEXLETTER	: 	'a'|'b'|'c'|'d'|'e'|'f'|'A'|'B'|'C'|'D'|'E'|'F';
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 473
fragment HEXHEADER	: 	'0x' | '0X';

// any other "word" is an "ID"
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 476
ID			: (UNDERSCORE* LETTER) ( LETTER | DIGIT | UNDERSCORE )*;

// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 478
fragment LETTER		: ('a'..'z' | 'A'..'Z');
// $ANTLR src "src/net/colar/netbeans/fan/antlr/Fan.g" 479
fragment DIGIT		: '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9';



// ################################### end ##############################

