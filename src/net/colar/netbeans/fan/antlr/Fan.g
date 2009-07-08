/*
Thibaut Colar http://www.colar.net/	       2009
ANTLR3 Grammar for the Fan programming language
http://fandev.org/doc/docLang/Grammar.html

This actually took a LOT of work !
Probably cause i'm new to both Fan and Antlr, and Fan as pretty adavanced features
and a fairly tricky syntax.

On my machine the default timeout is too short -> use -Xconversiontimeout 30000
in antlrWorks add "-Xconversiontimeout 30000" in file/prefs : antlr options
Also it needs >600M to generate the code in antlWorks (-Xmx600M). ~900M to debug.

## List of special Token types, that will be used for syntax highlighting
KW_* -> Keyword
AS_* -> assignment
OP_* -> Operation
SP_* -> separator
CP_* -> comparator
NUMBER
STR
QUOTSTR
DSL
URI
CHAR
LINE_COMMENT
EXEC_COMMENT
MULTI_COMMENT
*/

grammar Fan;
options {memoize=true;backtrack=true;}

// ########################## TOKENS
// Define tokens for keywords used in the grammar, so they can be referenced.
tokens
{
KW_BREAK	='break';
KW_CONTINUE	='continue';
KW_FOR		='for';
KW_IF		='if';
KW_RETURN	='return';
KW_SWITCH	='switch';
KW_THROW	='throw ';
KW_WHILE	='while';
KW_TRY		='try';
KW_CASE		='case';
KW_DEFAULT	='default';
KW_CATCH	='catch';
KW_FINALLY	='finally';
KW_USING	='using';
KW_AS		='as';
KW_RD_ONLY	='readonly';
KW_CONST	='const';
KW_STATIC	='static';
KW_NATIVE	='native';
KW_VOLATILE	='volatile';
KW_OVERRIDE	='override';
KW_VIRTUAL	='virtual';
KW_FINAL	='final';
KW_VOID		='void';
KW_CLASS	='class';
KW_ENUM		='enum';
KW_MIXIN	='mixin';
KW_ABSTRACT	='abstract';
KW_PRIVATE	='private';
KW_PROTECTED	='protected';
KW_PUBLIC	='public';
KW_INTERNAL	='internal';
KW_NEW		='new';
KW_ONCE		='once';
KW_THIS		='this';
KW_SUPER	='super';
KW_ELSE		='else';
KW_IS		='is';
KW_ISNOT	='isnot';
KW_NULL		='null';
KW_IT		='it';
KW_TRUE		='true';
KW_FALSE	='false';

// "Fake" token types used for incomplete lexer items (like unclosed string)
INC_STR;
INC_URI;
INC_COMMENT;
INC_DSL;
}

// ########################## code.

@header		{package net.colar.netbeans.fan.antlr;
import net.colar.netbeans.fan.FanParserResult;
}
@lexer::header	{package net.colar.netbeans.fan.antlr;
import net.colar.netbeans.fan.FanParserResult;
}

@lexer::members{
	//typeOverride
	int too=-1;
	public int getTypeOverride() {return too;}
	public void clearTypeOverride() {too=-1;}
        Stack<String> paraphrase = new Stack<String>();
}

// A little bit of code necessary to deal with the Linebreaks which are usually neaningless but not always
// They can mean "end of statement" for some statements.
@members{
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
	prog();
	return this.parsingResult;
    }
    @Override
    public void reportError(RecognitionException e)
    {
	    parsingResult.addAntlrError(e,paraphrase);
    }
    
    Stack<String> paraphrase = new Stack<String>();

}

//###################### GRAMMAR RULES ##########################################################
// "Prog" Is the grammar starting point

// allow extra "docs" at the end of file, as seen in some files (last slot commented out)
prog		: 	 using* typeDef* docs EOF;
using		@init {paraphrase.push("Using statements");} @after{paraphrase.pop();}
		:	(usingPod | usingType | usingAs);
usingPod
		:	KW_USING podSpec eos ;
usingType
		:	KW_USING podSpec SP_COLCOL id eos;
usingAs		:	KW_USING podSpec SP_COLCOL id KW_AS id eos;
podSpec		:	ffi? id (DOT id)*;
ffi 		:	SQ_BRACKET_L id SQ_BRACKET_R;
// refactored
typeDef 	:	docs facet* ((classFlags* KW_CLASS)=>classDef |
			(protection? KW_ENUM)=>enumDef | mixinDef);
classDef 	@init {paraphrase.push("Class definition");} @after{paraphrase.pop();}
		:  	classHeader classBody;
classHeader	:	docs facet* classFlags* KW_CLASS id inheritance?;
classFlags 	:	protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC;
classBody 	:	BRACKET_L slotDef* bracketR;
protection	:	KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL;
mixinDef	@init {paraphrase.push("Mixin definition");} @after{paraphrase.pop();}
		:	mixinHeader mixinBody;
mixinHeader	:	docs facet* mixinFlags* KW_MIXIN id inheritance?;
mixinFlags	:	protection | KW_CONST | KW_STATIC | KW_FINAL;
mixinBody	:	BRACKET_L slotDef* bracketR;
enumDef		@init {paraphrase.push("Enumeration definition");} @after{paraphrase.pop();}
		:	enumHeader enumBody;
enumHeader	:   	docs facet* protection? KW_ENUM id inheritance?;
enumBody	:	BRACKET_L enumValDefs slotDef* bracketR ;
inheritance 	:	SP_COLON typeList;
enumValDefs 	:	enumValDef (SP_COMMA  enumValDef)* eos;
enumValDef 	:	docs id (PAR_L args? PAR_R)?;
typeList	:  	type (SP_COMMA type)*;

type	        :  	typeRoot  SP_QMARK? (LIST_TYPE SP_QMARK?)* ;
nonMapType	:	funcType | simpleType;
typeRoot	:	mapType | nonMapType;
simpleType     	:  	id (SP_COLCOL id)?;
// this was left recursive -> changed into tail recursive
mapType		:	SQ_BRACKET_L? nonMapType SP_QMARK? (LIST_TYPE SP_QMARK?)*
				({notAfterEol()}? SP_COLON {notAfterEol()}? type)+ SQ_BRACKET_R?;
funcType 	:	SP_PIPE (SP_COMMA | (formals ((OP_ARROW)=>assignedType)?) | ((OP_ARROW)=>assignedType)) SP_PIPE;
assignedType	:	OP_ARROW type;
formals 	:  	formal (SP_COMMA formal)*;
formal		:	formalFull | formalTypeOnly | formalInferred;
formalFull      :	type id;
formalTypeOnly  :  	type;
formalInferred  :  	id;
slotDef 	:	((KW_STATIC BRACKET_L)=> staticBlock|
				(docs facet*
					(
						(ctorFlags* KW_NEW)=>ctorDef |
						(methodFlags* (type | KW_VOID) id PAR_L)=>methodDef |
						fieldDef
					)
				)
			);
fieldDef	@init {paraphrase.push("Field definition");} @after{paraphrase.pop();}
		:	docs facet* fieldFlags typeId (AS_INIT_VAL expr)?
				(
				(BRACKET_L (protection? (getter | setter) SP_SEMI? block?)+ bracketR)
				| eos);

typeId		:	((type id)=>typeAndId | id);
typeAndId	:	type id;
fieldFlags	:	(KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection)*;
methodDef	@init {paraphrase.push("Method definition");} @after{paraphrase.pop();}
		:	docs facet* methodFlags* (type | KW_VOID) id PAR_L params PAR_R methodBody;
methodFlags	:	protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE |
			 KW_NATIVE | KW_FINAL;
params		:	(param (SP_COMMA param)*)?;
param 		:	type id (AS_INIT_VAL expr)?;
methodBody	:	('{' stmt* bracketR) | eos;
ctorDef		@init {paraphrase.push("Constructor definition");} @after{paraphrase.pop();}
		:	docs facet* ctorFlags* KW_NEW id PAR_L params PAR_R ((SP_COLON)=>ctorChain)? methodBody;
ctorFlags	:	protection;
ctorChain	:	SP_COLON (ctorChainThis | ctorChainSuper);

ctorChainThis	:	KW_THIS DOT id PAR_L args? PAR_R;
ctorChainSuper	:	KW_SUPER (DOT id)? PAR_L args? PAR_R;

staticBlock	:	KW_STATIC block;
block 		@init {paraphrase.push("Block");} @after{paraphrase.pop();}
		:	((BRACKET_L)=>multiStmt | stmt);
multiStmt	:	BRACKET_L  stmt* bracketR;
stmt
@init {paraphrase.push("Statement");} @after{paraphrase.pop();}
		:	(g_if | g_for | g_while | g_break |
			g_continue | g_return | g_switch |
			g_throw | g_try | exprStmt | localDef );

/* NOTE: Can't use java keywords as grammar ID's
Because the name (ex: break) will be used as a function name in the generated java code
which if it's a java keyword is gonna be invalid java code.
so I prepand "g_" to those if needed.
*/
g_break		:	KW_BREAK eos;
g_continue	:	KW_CONTINUE eos;
g_for		:	KW_FOR PAR_L forInit? SP_SEMI expr? SP_SEMI expr? PAR_R  block;
g_if		:	KW_IF PAR_L expr PAR_R block
				(KW_ELSE block)?;
g_return	:	KW_RETURN (eos | expr eos);
g_switch	:	KW_SWITCH PAR_L expr PAR_R BRACKET_L (g_case)* (g_default)? bracketR;
g_throw		:	KW_THROW expr eos;
g_while		:	KW_WHILE PAR_L expr PAR_R block;
g_try		:	KW_TRY ((BRACKET_L)=>try_long | stmt*) ((KW_CATCH)=>g_catch)* ((KW_FINALLY)=>g_finally)?;
try_long	:	BRACKET_L stmt* bracketR;
exprStmt	:	expr eos;
localDef	:	typeId (AS_INIT_VAL expr)? eos;
forInit 	:	forInitDef | expr;
forInitDef	:	typeId (AS_INIT_VAL expr)?;
// catch is a reserved antlr keyword
g_catch		:	KW_CATCH catchDef? ((BRACKET_L)=>catch_long | stmt*);
catch_long	:	BRACKET_L stmt* bracketR;
catchDef 	:	PAR_L type id PAR_R;
// finally is a reserved antlr keyword
g_finally	:	KW_FINALLY ((BRACKET_L)=>finally_long | stmt*);
finally_long	:	BRACKET_L stmt* bracketR;
g_case		:	KW_CASE expr SP_COLON stmt*;
g_default	:	KW_DEFAULT SP_COLON stmt*;

// ########### Expressions
expr
@init {paraphrase.push("Expression");} @after{paraphrase.pop();}
		:	assignExpr;
assignExpr	:	ternaryExpr (assignOp assignExpr)?;
ternaryExpr	:	condOrExpr (ternaryTail)?;
// Problem: It will confuse the ':' of the ternary expr and then it fails.
ternaryTail	:	SP_QMARK condOrExpr SP_COLON condOrExpr;
assignOp	:	AS_EQUAL | AS_ASSIGN_OP;
condOrExpr 	:	condAndExpr  (OP_OR  condAndExpr)*;
condAndExpr 	:	equalityExpr (OP_AND  equalityExpr)* ;
equalityExpr	:	relationalExpr (CP_EQUALITY relationalExpr)* ;

relationalExpr	:  	elvisExpr (typeCheck | compare);
// NOTE: we compare to typeRoot instead of type, because type would eat the trailing ?, breaking ternary expressions
typeCheck	:  	(KW_ISNOT | KW_IS | KW_AS) typeRoot (SP_QMARK? {notAfterEol()}? '[]')*;
compare		:  	(CP_COMPARATORS elvisExpr)*;

elvisExpr 	:	rangeExpr (OP_ELVIS rangeExpr)* ;
rangeExpr 	:	bitOrExpr (( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) bitOrExpr)* ;
bitOrExpr 	:	bitAndExpr ((OP_BITOR | SP_PIPE) bitAndExpr)* ;
bitAndExpr 	:	shiftExpr (OP_CURRY shiftExpr)*  ;
shiftExpr 	:	addExpr ((OP_LSHIFT | OP_RSHIFT) addExpr)* ;
addExpr 	:	multExpr ((OP_PLUS | OP_MINUS) multExpr)* ;
addAppend	:	(OP_PLUS | OP_MINUS) parenExpr;
multExpr 	:	parenExpr ((OP_MULTI | OP_DIV | OP_MOD) parenExpr)* ;
parenExpr 	:	castExpr | groupedExpr | unaryExpr;
// par_l on newline = end of expression
castExpr 	:	{notAfterEol()}? PAR_L type PAR_R parenExpr;
// if PAR_l starts after newLine, this is a different exression
groupedExpr 	:	PAR_L expr PAR_R termChain*;
unaryExpr 	:	prefixExpr | postfixExpr | termExpr;
prefixExpr 	:	(OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | OP_TILDA | OP_PLUS | OP_MINUS) parenExpr ;
postfixExpr 	:	termExpr (OP_2PLUS | OP_2MINUS) ;
termExpr 	:	termBase termChain*;
// check for ID alone last (and not as part of idExpr) otherwise it would never check literals !
termBase 	:	idExprReq | literal | typeBase | id;
typeBase	:	typeLiteral | slotLiteral | namedSuper | staticCall |
 	                dsl | closure | simple | ctorBlock;
ctorBlock	:	type itBlock;
staticCall	:	type DOT idExpr;

termChain 	:	dotCall | dynCall | safeDotCall | safeDynCall |
			indexExpr | callOp | itBlock;
dsl	        :	simpleType DSL;

// itBlocks can have a COMMA after statements, which means to call it.add(expr).
itBlock 	:	BRACKET_L (stmt SP_COMMA? SP_SEMI?)* bracketR;
dotCall 	:	DOT idExpr;
dynCall 	:	OP_ARROW idExpr;
safeDotCall 	:	OP_SAFE_CALL idExpr;
safeDynCall	:	OP_SAFEDYN_CALL idExpr;
indexExpr 	:	{notAfterEol()}? SQ_BRACKET_L expr SQ_BRACKET_R;
// eos = end of expression
callOp		:	{notAfterEol()}? PAR_L args?  PAR_R closure*;
closure 	@init {paraphrase.push("Closure");} @after{paraphrase.pop();}
		:  	funcType BRACKET_L stmt* bracketR;
// this can be either a local def(toto.value) or a call(toto.getValue or toto.getValue(<params>)) + opt. closure
idExpr 		:	idExprReq | id;
// Same but without matching ID by itself (this would prevent termbase from checking literals).
idExprReq	:	field | call;
// require 'AT' otherwise it's just and ID (this would prevent termbase from checking literals)
field		:	AT ID;
 // require params or/and closure, otherwise it's just and ID (this would prevent termbase from checking literals)
call		:	id ((callParams closure) | callParams | closure);

callParams	:	{notAfterEol()}? PAR_L args? PAR_R;
args 		:	expr (SP_COMMA  expr)*;

literal 	:	KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | QUOTSTR | STR | URI |
			number | CHAR | namedSuper |
			slotLiteral | typeLiteral | list | map | simple;
typeLiteral	:  	type {notAfterEol()}? OP_POUND;
slotLiteral	:  	type? OP_POUND {notAfterEol()}? id;
namedSuper 	:	simpleType DOT KW_SUPER;
list 		:	(type {notAfterEol()}?)? SQ_BRACKET_L listItems SQ_BRACKET_R;
listItems 	:	(expr (SP_COMMA expr )* SP_COMMA?) | SP_COMMA;
map 		:	(mapType {notAfterEol()}?)? SQ_BRACKET_L mapItems SQ_BRACKET_R;
mapItems 	:	(mapPair (SP_COMMA mapPair)* SP_COMMA?) | SP_COLON;
mapPair		:	expr SP_COLON expr;
simple		:	type PAR_L expr PAR_R;

docs		:	DOC*;

number		: 	OP_MINUS? NUMBER;
facet		:	AT id (AS_EQUAL expr)?;

bracketR
@init {paraphrase.push("}");} @after{paraphrase.pop();}
		:	BRACKET_R;
// endOfLine: semicolumn, or look for newLine
eos
@init {paraphrase.push("Semicolumn or LineBreak");} @after{paraphrase.pop();}
		:	SP_SEMI | {lookupNL()}?;

id
@init {paraphrase.push("Identifier");} @after{paraphrase.pop();}
		: 	ID;
/*Those are a bit special, they can't be a lexer rule, because they can be a valid ID as well 
(or part of one) and they can't be just parsed as 'get' or 'set' because they are Tokens of type ID
 so I check them as ID's an look if the content matches. 
Not sure that's the best way to o this, but it's the best i could come up with that works.
 */
getter			: t=ID {t.getText().equals("get")}?;
setter			: t=ID {t.getText().equals("set")}?;

// ####################### LEXER items ################################################################

// linebreaks go into hidden channel which means they are usually ignored
// but we can still programmatically access them as done in the lookupNL() method.
LB		: (('\r\n') | '\n')+ {$channel=HIDDEN;};
// Other ignored data: whitespaces, comments
WS  		:  (' '|'\t') {$channel=HIDDEN;}; // whitespace
LINE_COMMENT	: '//' (~('\n'))* {$channel=HIDDEN;};
EXEC_COMMENT	: '#!' (~('\n'))* {$channel=HIDDEN;};

// need to use a predicate for incomplete item detection to work right.
// backtracking in lexer wiithout predicate doesn't seem to happen right, with greedy=false.
// if incomplete we match till end of line since most likely just started new comment
MULTI_COMMENT	: '/*' ((COMPL_ML_COMMENT)=>COMPL_ML_COMMENT | ~'\n'* {too=INC_COMMENT;}){$channel=HIDDEN;};
fragment
COMPL_ML_COMMENT: (options{greedy=false;}:.)* '*/';

DSL		:'<|' ((COMPL_DSL)=>COMPL_DSL | ~'\n'* {too=INC_DSL;});
fragment
COMPL_DSL	: (options{greedy=false;}:.)* '|>';

CHAR		:'\'' (('\\' .) | ('\\u' (DIGIT | HEXLETTER) (DIGIT | HEXLETTER)
			(DIGIT | HEXLETTER) (DIGIT | HEXLETTER)) | .)? '\''; //Letter possibly bacquoted or unicode char
//RAWSTR		: 'r"' ~('"')* '"'; // obsoteted
QUOTSTR		: '"""' ((COMPL_QSTR)=>COMPL_QSTR | ~'\n'* {too=INC_STR;});
fragment
COMPL_QSTR	: (options{greedy=false;}:.)* '"""';
STR		: '"' ((COMPL_STR)=>COMPL_STR | ~'\n'* {too=INC_STR;});// accept strings incl. \"
fragment
COMPL_STR	: ('\\\\' | '\\"' | ~'"')* '"';
URI		: '`'  ((COMPL_URI)=>COMPL_URI | ~'\n'* {too=INC_URI;});
fragment
COMPL_URI	: (('\\\\') | ('\\`') | ~('`') )* '`';

// ######## Start NOT Hidden items ####
// TODO: probably should use \r?\n  ... but that seem to cause issues when testing in antlrworks -> why ?
DOC	 	:   '**' ( options {greedy=false;} : . )* '\n' ; // ~ javadoc (fandoc)

// Fan language keywords
KEYWORD		: ('abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' |
		'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' |
 		'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' |
 		'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' |
 		'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' |
		'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' |
		'while');


// Symbols
CP_EQUALITY	:'===' | '!==' | '==' | '!=';
CP_COMPARATORS  :'<=' | '>=' | '<=>' | '<' | '>';
AS_ASSIGN_OP	:'*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=';
LIST_TYPE	:'[]';
OP_SAFEDYN_CALL	:'?->';
OP_ARROW	:'->';
OP_SAFE_CALL	:'?.';
OP_RANG_EXCL_OLD:'...';
OP_RANGE_EXCL	:'..<';
OP_RANGE	:'..';
OP_ELVIS	:'?:';
SP_COLCOL	:'::';
BRACKET_L	:'{';
BRACKET_R	:'}';
SQ_BRACKET_L	:'[';
SQ_BRACKET_R	:']';
PAR_L		:'(';
PAR_R		:')';
SP_COLON	:':';
SP_SEMI		:';';
SP_COMMA	:',';
SP_PIPE		:'|';
AS_INIT_VAL	:':=';
SP_QMARK	:'?';
AT		:'@';
OP_POUND	:'#';
OP_CURRY	:'&';
AS_EQUAL	:'=';
OP_BITOR	:'^';
UNDERSCORE	:'_';
OP_AND		:'&&';
OP_OR		:'||';
DOT		:'.';
OP_2PLUS	:'++';
OP_2MINUS	:'--';
OP_MINUS	:'-';
OP_PLUS		:'+';
OP_LSHIFT	:'<<';
OP_RSHIFT	:'>>';
OP_MULTI	:'*';
OP_DIV		:'/';
OP_MOD		:'%';
OP_BANG		:'!';
OP_TILDA	:'~';

// Numbers / Letters matching
// Apparently fan allows syntax like var=var-1 so we can't 'eat' the - as part as the number (lexer) since it could be a minus operand

fragment HEX_HEADER	: 	'0x' | '0X';

NUMBER			: 	((HEXNB)=>HEXNB | (DECIMAL)=>DECIMAL | FRACTIONAL);
fragment HEXNB		:	HEXHEADER (UNDERSCORE* (DIGIT | HEXLETTER))+;
fragment DECIMAL	:	DIGIT (UNDERSCORE* DIGIT)* ((FRACTION)=>FRACTION)? 
					((EXPONENT)=>EXPONENT)? NBTYPE?;
fragment FRACTIONAL	:	FRACTION EXPONENT? NBTYPE?;
fragment FRACTION	:	DOT DIGIT (UNDERSCORE* DIGIT)*;
fragment EXPONENT	:	('e'|'E') ('+' | OP_MINUS)? DIGIT (UNDERSCORE* DIGIT)*;
// d,f are for float or decimal
fragment NBTYPE		:	'F' | 'f' | 'D' | ('d' 'ay'?) | 'ms' | 'ns' | 
					'sec' | 'min' | 'hr';
fragment HEXLETTER	: 	'a'|'b'|'c'|'d'|'e'|'f'|'A'|'B'|'C'|'D'|'E'|'F';
fragment HEXHEADER	: 	'0x' | '0X';

// any other "word" is an "ID"
ID			: (UNDERSCORE* LETTER) ( LETTER | DIGIT | UNDERSCORE )*;

fragment LETTER		: ('a'..'z' | 'A'..'Z');
fragment DIGIT		: '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9';

// catch all
INC_UNKNOWN_ITEM	: .;

// ################################### end ##############################
