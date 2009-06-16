lexer grammar Fan;

T_BREAK : 'break' ;
T_CONTINUE : 'continue' ;
T_FOR : 'for' ;
T_IF : 'if' ;
T_RETURN : 'return' ;
T_SWITCH : 'switch' ;
T_THROW : 'throw ' ;
T_WHILE : 'while' ;
T_TRY : 'try' ;
T_CASE : 'case' ;
T_DEFAULT : 'default' ;
T_CATCH : 'catch' ;
T_FINALLY : 'finally' ;
T_USING : 'using' ;
T_AS : 'as' ;
T_RD_ONLY : 'readonly' ;
T_CONST : 'const' ;
T_STATIC : 'static' ;
T_NATIVE : 'native' ;
T_VOLATILE : 'volatile' ;
T_OVERRIDE : 'override' ;
T_VIRTUAL : 'virtual' ;
T_FINAL : 'final' ;
T_VOID : 'void' ;
T_CLASS : 'class' ;
T_ENUM : 'enum' ;
T_MIXIN : 'mixin' ;
T_ABSTRACT : 'abstract' ;
T_PRIVATE : 'private' ;
T_PROTECTED : 'protected' ;
T_PUBLIC : 'public' ;
T_INTERNAL : 'internal' ;
T_NEW : 'new' ;
T_ONCE : 'once' ;
T_THIS : 'this' ;
T_SUPER : 'super' ;
T_ELSE : 'else' ;
T_IS : 'is' ;
T_ISNOT : 'isnot' ;
T_NULL : 'null' ;
T_IT : 'it' ;
T__97 : '[]' ;
T__98 : '*=' ;
T__99 : '/=' ;
T__100 : '%=' ;
T__101 : '+=' ;
T__102 : '-=' ;
T__103 : '<<=' ;
T__104 : '>>=' ;
T__105 : '&=' ;
T__106 : '^=' ;
T__107 : '|=' ;
T__108 : '||' ;
T__109 : '&&' ;
T__110 : '===' ;
T__111 : '!==' ;
T__112 : '==' ;
T__113 : '!=' ;
T__114 : '<=>' ;
T__115 : '<=' ;
T__116 : '<' ;
T__117 : '>=' ;
T__118 : '>' ;
T__119 : '<<' ;
T__120 : '>>' ;
T__121 : '+' ;
T__122 : '*' ;
T__123 : '/' ;
T__124 : '%' ;
T__125 : '!' ;
T__126 : '++' ;
T__127 : '--' ;
T__128 : '~' ;
T__129 : '?.' ;
T__130 : '?->' ;

// $ANTLR src "antlr/Fan.g" 364
LB		: (('\r\n') | '\n')+ {$channel=HIDDEN;};
// Other ignored data: whitespaces, comments
// $ANTLR src "antlr/Fan.g" 366
WS  		:  (' '|'\t') {$channel=HIDDEN;}; // whitespace
// $ANTLR src "antlr/Fan.g" 367
LINE_COMMENT	: '//' (~('\n'))* {$channel=HIDDEN;};
// $ANTLR src "antlr/Fan.g" 368
EXEC_COMMENT	: '#!' (~('\n'))* {$channel=HIDDEN;};
// $ANTLR src "antlr/Fan.g" 369
MULTI_COMMENT	: ( '/*' ( options {greedy=false;} : . )* '*/'){$channel=HIDDEN;};

// $ANTLR src "antlr/Fan.g" 371
DSL		:'<|' ( options {greedy=false;} : . )* '|>';
// $ANTLR src "antlr/Fan.g" 372
CHAR		:'\'' (('\\' .) | ('\\u' (DIGIT | HEXLETTER) (DIGIT | HEXLETTER)
			(DIGIT | HEXLETTER) (DIGIT | HEXLETTER)) | .)? '\''; //Letter possibly bacquoted or unicode char
//RAWSTR		: 'r"' ~('"')* '"'; // obsolteted
// $ANTLR src "antlr/Fan.g" 375
QUOTSTR		: '"""' ( options {greedy=false;} : . )* '"""';
// $ANTLR src "antlr/Fan.g" 376
STR		: ( '"' ( ('\\\\') | ('\\"') | ~('"') )* '"');// accept strings incl. \"
// $ANTLR src "antlr/Fan.g" 377
URI		: ( '`' ( ('\\\\') | ('\\`') | ~('`') )* '`');

// ######## Start NOT Hidden items ####
// TODO: probably should use \r?\n  ... but that seem to cause issues when testing in antlrworks -> why ?
// $ANTLR src "antlr/Fan.g" 381
DOC	 	:   '**' ( options {greedy=false;} : . )* '\n' ; // ~ javadoc (fandoc)

// Fan language keywords
// $ANTLR src "antlr/Fan.g" 384
BOOL_VAL	: 'true' | 'false';
// $ANTLR src "antlr/Fan.g" 385
KEYWORD		: ('abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' |
		'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' |
 		'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' |
 		'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' |
 		'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' |
		'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' |
		'while');


// Symbols
// $ANTLR src "antlr/Fan.g" 395
RANG_EXCL_OLD	:'...';
// $ANTLR src "antlr/Fan.g" 396
RANGE_EXCL	:'..<';
// $ANTLR src "antlr/Fan.g" 397
RANGE		:'..';
// $ANTLR src "antlr/Fan.g" 398
DOT		:'.';
// $ANTLR src "antlr/Fan.g" 399
MINUS		:'-';
// $ANTLR src "antlr/Fan.g" 400
ELVIS		:'?:';
// $ANTLR src "antlr/Fan.g" 401
COLCOL		:'::';
// $ANTLR src "antlr/Fan.g" 402
BRACKET_L	:'{';
// $ANTLR src "antlr/Fan.g" 403
BRACKET_R	:'}';
// $ANTLR src "antlr/Fan.g" 404
SQ_BRACKET_L	:'[';
// $ANTLR src "antlr/Fan.g" 405
SQ_BRACKET_R	:']';
// $ANTLR src "antlr/Fan.g" 406
PAR_L		:'(';
// $ANTLR src "antlr/Fan.g" 407
PAR_R		:')';
// $ANTLR src "antlr/Fan.g" 408
COLON		:':';
// $ANTLR src "antlr/Fan.g" 409
SEMI		:';';
// $ANTLR src "antlr/Fan.g" 410
COMMA		:',';
// $ANTLR src "antlr/Fan.g" 411
PIPE		:'|';
// $ANTLR src "antlr/Fan.g" 412
ARROW		:'->';
// $ANTLR src "antlr/Fan.g" 413
INIT_VAL	:':=';
// $ANTLR src "antlr/Fan.g" 414
QMARK		:'?';
// $ANTLR src "antlr/Fan.g" 415
AT		:'@';
// $ANTLR src "antlr/Fan.g" 416
POUND		:'#';
// $ANTLR src "antlr/Fan.g" 417
CURRY		:'&';
// $ANTLR src "antlr/Fan.g" 418
EQUAL		:'=';
// $ANTLR src "antlr/Fan.g" 419
BITOR		:'^';
// $ANTLR src "antlr/Fan.g" 420
UNDERSCORE	:'_';
// Numbers / Letters matching
// Apparently fan allows syntax like var=var-1 so we can't 'eat' the - as part as the number (lexer) since it could be a minus operand

// $ANTLR src "antlr/Fan.g" 424
fragment HEX_HEADER	: 	'0x' | '0X';

// $ANTLR src "antlr/Fan.g" 426
NUMBER			: 	((HEXNB)=>HEXNB | (DECIMAL)=>DECIMAL | FRACTIONAL);
// $ANTLR src "antlr/Fan.g" 427
fragment HEXNB		:	HEXHEADER (UNDERSCORE* (DIGIT | HEXLETTER))+;
// $ANTLR src "antlr/Fan.g" 428
fragment DECIMAL	:	DIGIT (UNDERSCORE* DIGIT)* ((FRACTION)=>FRACTION)? 
					((EXPONENT)=>EXPONENT)? NBTYPE?;
// $ANTLR src "antlr/Fan.g" 430
fragment FRACTIONAL	:	FRACTION EXPONENT? NBTYPE?;
// $ANTLR src "antlr/Fan.g" 431
fragment FRACTION	:	DOT DIGIT (UNDERSCORE* DIGIT)*;
// $ANTLR src "antlr/Fan.g" 432
fragment EXPONENT	:	('e'|'E') ('+' | MINUS)? DIGIT (UNDERSCORE* DIGIT)*;
// d,f are for float or decimal
// $ANTLR src "antlr/Fan.g" 434
fragment NBTYPE		:	'F' | 'f' | 'D' | ('d' 'ay'?) | 'ms' | 'ns' | 
					'sec' | 'min' | 'hr';
// $ANTLR src "antlr/Fan.g" 436
fragment HEXLETTER	: 	'a'|'b'|'c'|'d'|'e'|'f'|'A'|'B'|'C'|'D'|'E'|'F';
// $ANTLR src "antlr/Fan.g" 437
fragment HEXHEADER	: 	'0x' | '0X';

// any other "word" is an "ID"
// $ANTLR src "antlr/Fan.g" 440
ID			: (UNDERSCORE* LETTER) ( LETTER | DIGIT | UNDERSCORE )*;

// $ANTLR src "antlr/Fan.g" 442
fragment LETTER		: ('a'..'z' | 'A'..'Z');
// $ANTLR src "antlr/Fan.g" 443
fragment DIGIT		: '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9';



// ################################### end ##############################

