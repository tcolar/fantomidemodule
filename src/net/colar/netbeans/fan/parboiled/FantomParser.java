/*
 * Thibaut Colar Feb 5, 2010
 */
package net.colar.netbeans.fan.parboiled;

import org.parboiled.BaseParser;
import org.parboiled.MatcherContext;
import org.parboiled.Rule;
import org.parboiled.matchers.Matcher;
import org.parboiled.support.Leaf;

/**
 * Parboiled parser for the Fantom Language
 * Started with Fantom Grammar 1.0.50
 * Grammar spec:
 * http://fantom.org/doc/docLang/Grammar.html
 *
 * Test Suite: net.colar.netbeans.fan.test.FantomParserTest
 *
 * @author thibautc
 */
@SuppressWarnings(
{
	"InfiniteRecursion"
})
public class FantomParser extends BaseParser<Object>
{
	// ------------ Comp Unit --------------------------------------------------
	//TODO: funcType: // op_safe_dyn_call lexer confusion between |Str?->| (formal) and Str?->  (dyn call)

	public Rule compilationUnit()
	{
		return sequence(
			OPT_LF(),
			// Missing from grammar: Optional unix env line
			optional(sequence("#!",zeroOrMore(sequence(testNot("\n"), any())), "\n")),
			zeroOrMore(firstOf(using(), incUsing())),
			zeroOrMore(typeDef()),
			OPT_LF(),
			zeroOrMore(doc()), // allow for extra docs at end of file (if last type commented out)
			OPT_LF(),
			eoi());
	}

	public Rule using()
	{
		return sequence(OPT_LF(),enforcedSequence(
			KW_USING,
			optional(ffi()),
			id(),
			zeroOrMore(enforcedSequence(DOT, id())),
			optional(enforcedSequence(SP_COLCOL, id())),// not enforced to allow completion
			optional(usingAs()),
			eos()), OPT_LF());
	}

	// Inconplete using - to allow completion
	public Rule incUsing()
	{
		return enforcedSequence(
			KW_USING,
			optional(ffi()),
			optional(id()), // Not optional, but we want a valid ast for completion if missing
			zeroOrMore(sequence(DOT, id())),// not enforced to allow completion
			optional(sequence(SP_COLCOL, id())),// not enforced to allow completion
			optional(usingAs()),
			optional(eos()), OPT_LF());
	}

	public Rule ffi()
	{
		return enforcedSequence(SQ_BRACKET_L, id(), SQ_BRACKET_R);
	}

	public Rule usingAs()
	{
		return enforcedSequence(KW_AS, id());
	}

	// ------------- Type def --------------------------------------------------
	public Rule typeDef()
	{
		// regrouped together classdef, enumDef, mixinDef & facetDef as they are grammatically very similar
		return sequence(
			OPT_LF(),
			optional(doc()),
			zeroOrMore(facet()),
			optional(protection()),
			firstOf(
			sequence(zeroOrMore(firstOf(KW_ABSTRACT, KW_FINAL, KW_CONST)), KW_CLASS), // standard class
			enforcedSequence(ENUM, KW_CLASS), // enum class
			enforcedSequence(FACET, KW_CLASS), // facet class
			KW_MIXIN // mixin
			),
			id(),
			optional(inheritance()),
			OPT_LF(),
			BRACKET_L,
			OPT_LF(),
			//TODO: conflicts with slotDef : optional(enumValDefs()), // only valid for enums, but simplifying
			zeroOrMore(slotDef()),
			BRACKET_R, OPT_LF());
	}

	public Rule protection()
	{
		return firstOf(KW_PUBLIC, KW_PROTECTED, KW_INTERNAL, KW_PRIVATE);
	}

	public Rule inheritance()
	{
		return enforcedSequence(SP_COL, typeList());
	}

	// ------------- Facets ----------------------------------------------------
	public Rule facet()
	{
		return enforcedSequence(AT, simpleType(), optional(facetVals()), OPT_LF());
	}

	public Rule facetVals()
	{
		return enforcedSequence(
			BRACKET_L,
			facetVal(),
			zeroOrMore(sequence(eos(), facetVal())),
			BRACKET_R);
	}

	public Rule facetVal()
	{
		return enforcedSequence(id(), AS_EQUAL, expr());
	}

	//------------------- Slot Def ---------------------------------------------
	public Rule enumValDefs()
	{
		return sequence(enumValDef(), zeroOrMore(sequence(SP_COMMA, enumValDef())), eos());
	}

	public Rule enumValDef()
	{
		return sequence(id(), optional(enforcedSequence(PAR_L, optional(args()), PAR_R)),OPT_LF());
	}

	public Rule slotDef()
	{
		return sequence(firstOf(ctorDef(), methodDef(), fieldDef()),OPT_LF());
	}

	public Rule fieldDef()
	{
		return sequence(
			zeroOrMore(facet()),
			optional(protection()),
			zeroOrMore(firstOf(KW_ABSTRACT, KW_CONST, KW_FINAL, KW_STATIC,
			KW_NATIVE, KW_OVERRIDE, KW_READONLY, KW_VIRTUAL)),
			/*typeAndOrId(),*/ type(), id(), // Type required for fields (Grammar does not say so)
			//TODO: when there is an OP_ASSIGN AND a fieldAccesor, parser takes forever !!
			// probably confused with an itBlock
			optional(enforcedSequence(OP_ASSIGN, expr())),
			optional(fieldAccessor()),
			eos());
	}

	public Rule methodDef()
	{
		return sequence(
			zeroOrMore(facet()),
			optional(protection()),
			zeroOrMore(firstOf(KW_ABSTRACT, KW_NATIVE, KW_ONCE, KW_STATIC,
			KW_OVERRIDE, KW_VIRTUAL)),
			type(),
			id(),
			enforcedSequence(PAR_L, optional(params()),	PAR_R),
			methodBody());
	}

	public Rule ctorDef()
	{
		return sequence(
			zeroOrMore(facet()),
			optional(protection()),
			type(),
			enforcedSequence(KW_NEW,
			id(),
			enforcedSequence(PAR_L,	optional(params()),	PAR_R),
			optional( // ctorChain
				// Fantom  Grammar page is missing SP_COL
				enforcedSequence(SP_COL,
					firstOf(
					enforcedSequence(KW_THIS, DOT, id(), PAR_L, optional(args()), PAR_R),
					enforcedSequence(KW_SUPER, optional(sequence(DOT, id())), PAR_L, optional(args()), PAR_R)))),
			methodBody()));
	}

	public Rule methodBody()
	{
		return sequence(OPT_LF(), firstOf(
			enforcedSequence(BRACKET_L, zeroOrMore(stmt()), BRACKET_R),
			eos()),OPT_LF()); // method with no body
	}

	public Rule params()
	{
		return sequence(param(), zeroOrMore(enforcedSequence(SP_COMMA, params())));
	}

	public Rule param()
	{
		return sequence(OPT_LF(), type(), id(), optional(enforcedSequence(OP_ASSIGN, expr())),OPT_LF());
	}

	public Rule fieldAccessor()
	{
		return sequence(OPT_LF(),enforcedSequence(
			BRACKET_L,
			optional(sequence(OPT_LF(),"get", firstOf(block(), eos()))),
			optional(sequence(OPT_LF(),optional(protection()), "set", firstOf(block(), eos()))),
			BRACKET_R),OPT_LF());
	}

	public Rule args()
	{
		return sequence(expr(), zeroOrMore(sequence(OPT_LF(),enforcedSequence(SP_COMMA, expr()))),OPT_LF());
	}

	// ------------ Statements -------------------------------------------------
	public Rule block()
	{
		return sequence(firstOf(
			itBlock(), // it block is normal block
			stmt() // single statement
			),OPT_LF());
	}

	public Rule stmt()
	{
		return sequence(testNot(BRACKET_R), OPT_LF(),
			firstOf(sequence(KW_BREAK, eos()), sequence(KW_CONTINUE, eos()), for_(),
			if_(), sequence(KW_RETURN, optional(expr()), eos()), switch_(),
			sequence(KW_THROW, expr(), eos()), while_(), try_(),
			localDef(), itAdd(), sequence(expr(), eos())),
			OPT_LF());
	}

	public Rule for_()
	{
		return enforcedSequence(KW_FOR, PAR_L,
			optional(firstOf(localDef(), expr())),
			SP_SEMI, optional(expr()), SP_SEMI, optional(expr()), PAR_R,
			block());
	}

	public Rule if_()
	{
		return enforcedSequence(KW_IF, PAR_L, expr(), PAR_R, block(),
			optional(enforcedSequence(KW_ELSE, block())));
	}

	public Rule while_()
	{
		return enforcedSequence(KW_WHILE, PAR_L, expr(), PAR_R, block());
	}

	public Rule localDef()
	{
		// this is changed to matched either:
		// 'Int j', 'j:=27', 'Int j:=27'
		// 'a' is technically a localDef but will be matched as an expression
		// we can't differentiate 'a'(localdef) from 'a'(method call)
		return sequence(
			firstOf(
			sequence(typeAndOrId(), enforcedSequence(OP_ASSIGN, expr())),
			sequence(type(), id())),
			eos());
	}

	public Rule itAdd()
	{
		// Changed to oneOrMore, otherwise it will match normal expressions
		// Also since it's called from statemnt, why need to match multiples ??
		return sequence(expr(), SP_COMMA/*oneOrMore(sequence(SP_COMMA, expr())), optional(SP_COMMA), eos()*/);
	}

	public Rule try_()
	{
		return enforcedSequence(KW_TRY, block(), zeroOrMore(catch_()),
			optional(sequence(KW_FINALLY, block())));
	}

	public Rule catch_()
	{
		return enforcedSequence(KW_CATCH, PAR_L, type(), id(), PAR_R, block());
	}

	public Rule switch_()
	{
		return enforcedSequence(KW_SWITCH, PAR_L, expr(), PAR_R,
			OPT_LF(),BRACKET_L,OPT_LF(),
			zeroOrMore(enforcedSequence(KW_CASE, expr(), SP_COL, zeroOrMore(stmt()))),
			optional(enforcedSequence(KW_DEFAULT, SP_COL, zeroOrMore(stmt()))),
			OPT_LF(),BRACKET_R);
	}

	// ----------- Expressions -------------------------------------------------
	public Rule expr()
	{
		return assignExpr();
	}

	public Rule assignExpr()
	{
		return sequence(ifExpr(), optional(enforcedSequence(firstOf(AS_ASSIGN_OPS, AS_EQUAL), OPT_LF(), assignExpr())));
	}

	public Rule ifExpr()
	{
		return firstOf(elvisExpr(), ternaryExpr());
	}

	public Rule ternaryExpr()
	{
		return sequence(condOrExpr(),
			optional(enforcedSequence(SP_QMARK, ifExprBody(), SP_COL, ifExprBody())));
	}

	public Rule elvisExpr()
	{
		return sequence(condOrExpr(), OP_ELVIS, ifExprBody());
	}

	public Rule ifExprBody()
	{
		return firstOf(condOrExpr(), sequence(OPT_LF(), enforcedSequence(KW_THROW, OPT_LF(), expr())));
	}

	public Rule condOrExpr()
	{
		return sequence(condAndExpr(), zeroOrMore(enforcedSequence(OP_OR, OPT_LF(), condAndExpr())));
	}

	public Rule condAndExpr()
	{
		return sequence(equalityExpr(), zeroOrMore(enforcedSequence(OP_AND, OPT_LF(), equalityExpr())));
	}

	public Rule equalityExpr()
	{
		return sequence(relationalExpr(), zeroOrMore(enforcedSequence(CP_EQUALITY, OPT_LF(), relationalExpr())));
	}

	public Rule relationalExpr()
	{
		// chg to add ramgeexp as last option
		return firstOf(typeCheckExpr(), compareExpr());
	}

	public Rule typeCheckExpr()
	{
		// changed to required, otherwise eats all rangeExpr and compare never gets evaled
		return sequence(rangeExpr(),
			enforcedSequence(firstOf(KW_IS, KW_ISNOT, KW_AS), type()));
	}

	public Rule compareExpr()
	{
		return sequence(rangeExpr(), zeroOrMore(enforcedSequence(CP_COMPARATORS, OPT_LF(), rangeExpr())));
	}

	public Rule rangeExpr()
	{
		return sequence(addExpr(),
			zeroOrMore(enforcedSequence(firstOf(OP_RANGE_EXCL, OP_RANGE), OPT_LF(), addExpr())));
	}

	public Rule addExpr()
	{
		return sequence(multExpr(),
			// not enforced so that += assignexpr can happen
			zeroOrMore(sequence(firstOf(OP_PLUS, OP_MINUS), OPT_LF(), multExpr())));
	}

	public Rule multExpr()
	{
		return sequence(parExpr(),
			// not enforced so that *= assignexpr can happen
			zeroOrMore(sequence(firstOf(OP_MULT, OP_DIV), OPT_LF(),parExpr())));
	}

	public Rule parExpr()
	{
		return firstOf(castExpr(), groupedExpr(), unaryExpr());
	}

	public Rule castExpr()
	{
		return sequence(PAR_L, type(), PAR_R, parExpr());
	}

	public Rule groupedExpr()
	{
		return sequence(PAR_L, OPT_LF(), expr(), OPT_LF(), PAR_R, zeroOrMore(termChain()));
	}

	public Rule unaryExpr()
	{
		return firstOf(prefixExpr(), postfixExpr(), termExpr());
	}

	public Rule prefixExpr()
	{
		return sequence(
			firstOf(OP_CURRY, OP_BANG, OP_2PLUS, OP_2MINUS, OP_PLUS, OP_MINUS),
			parExpr());
	}

	public Rule postfixExpr()
	{
		return sequence(termExpr(), firstOf(OP_2MINUS, OP_2PLUS));
	}

	public Rule termExpr()
	{
		return sequence(termBase(), zeroOrMore(termChain()));
	}

	public Rule termBase()
	{
		// check for ID alone last (and not as part of idExpr) otherwise it would never check literal & typebase !
		return firstOf(idExprReq(), litteral(), typeBase(), id());
	}

	public Rule typeBase()
	{
		return firstOf(typeLitteral(), slotLitteral(), namedSuper(), staticCall(),
			dsl(), closure(), simple(), ctorBlock());
	}

	public Rule typeLitteral()
	{
		return sequence(type(), OP_POUND);
	}

	public Rule slotLitteral()
	{
		return sequence(optional(type()), OP_POUND, id());
	}

	public Rule namedSuper()
	{
		return sequence(type(), DOT, KW_SUPER);
	}

	public Rule staticCall()
	{
		// TODO: allow LF ?
		return sequence(type(), DOT, /*OPT_LF(),*/ idExpr());
	}

	public Rule dsl()
	{
		//TODO: unclosed DSL ?
		return sequence(simpleType(),
			sequence(DSL_OPEN, OPT_LF(), zeroOrMore(sequence(testNot(DSL_CLOSE), any())), OPT_LF(), DSL_CLOSE));
	}

	public Rule closure()
	{
		return sequence(funcType(), OPT_LF(), BRACKET_L, zeroOrMore(stmt()), BRACKET_R);
	}

	public Rule simple()
	{
		return sequence(type(), PAR_L, expr(), PAR_R);
	}

	public Rule ctorBlock()
	{
		return sequence(type(), itBlock());
	}

	public Rule itBlock()
	{
		// Do not enforce because it prevents fieldAccesor to work.
		return sequence(OPT_LF(), BRACKET_L, zeroOrMore(stmt()), BRACKET_R);
	}

	public Rule termChain()
	{
		return firstOf(safeDotCall(), safeDynCall(), dotCall(), dynCall(), indexExpr(),
			callOp(), itBlock(), incDotCall());
	}

	public Rule dotCall()
	{
		return enforcedSequence(DOT, idExpr());
	}

	public Rule dynCall()
	{
		return enforcedSequence(OP_ARROW, idExpr());
	}

	public Rule safeDotCall()
	{
		return enforcedSequence(OP_SAFE_CALL, idExpr());
	}

	public Rule safeDynCall()
	{
		return enforcedSequence(OP_SAFE_DYN_CALL, idExpr());
	}

	// incomplete dot call, make valid to allow for completion
	public Rule incDotCall()
	{
		return DOT;
	}

	public Rule idExpr()
	{
		// this can be either a local def(toto.value) or a call(toto.getValue or toto.getValue(<params>)) + opt. closure
		return firstOf(idExprReq(), id());
	}

	public Rule idExprReq()
	{
		// Same but without matching ID by itself (this would prevent termbase from checking literals).
		return firstOf(field(), call());
	}

	// require '*' otherwise it's just and ID (this would prevent termbase from checking literals)
	public Rule field()
	{
		return sequence(OP_MULT, id());
	}

	// require params or/and closure, otherwise it's just and ID (this would prevent termbase from checking literals)
	public Rule call()
	{
		return sequence(id(),
			firstOf(
			sequence(enforcedSequence(PAR_L, optional(args()), PAR_R), optional(closure())), //params & opt. closure
			closure())); // closure only
	}

	/*
	 *  TODO: does not always  work, will be parsed as a "list" Type because the grammar is confusing
	 *	it's context sensitive - need to review.
	 *  Can't cleanly differentiate Int[3] (List of Int with val '3') and var[3] : int.get[3]
	 *  So for now I'm gonna get a List in the ast and deal with it there
	 *  indexExpr 	:	({notAfterEol()}? sq_bracketL expr sq_bracketR)
	 * 	-> ^(AST_INDEX_EXPR sq_bracketL expr sq_bracketR);
	 */
	public Rule indexExpr()
	{
		return sequence(SQ_BRACKET_L, expr(), SQ_BRACKET_R);
	}

	public Rule callOp()
	{
		return enforcedSequence(PAR_L, optional(args()), PAR_R, optional(closure()));
	}

	public Rule litteral()
	{
		return firstOf(litteralBase(), list(), map());
	}

	public Rule litteralBase()
	{
		return firstOf(KW_NULL, KW_THIS, KW_SUPER, KW_IT, KW_TRUE, KW_FALSE,
			strs(), uri(), number(), char_(), namedSuper());
	}

	public Rule list()
	{
		return sequence(
			optional(type()),
			SQ_BRACKET_L, listItems(), SQ_BRACKET_R);
	}

	public Rule listItems()
	{
		return firstOf(
			SP_COMMA,
			sequence(expr(), zeroOrMore(enforcedSequence(SP_COMMA, expr()))));
	}

	public Rule map()
	{
		return sequence(
			optional(firstOf(mapType(), simpleMapType())),
			// Not enforced to allow resolving list of maps [Str:Int][]
			sequence(SQ_BRACKET_L, mapItems(), SQ_BRACKET_R));
	}

	public Rule mapItems()
	{
		return firstOf(SP_COL,
			sequence(mapPair(), zeroOrMore(enforcedSequence(SP_COMMA, mapPair()))));
	}

	public Rule mapPair()
	{
		return sequence(mapItem(), enforcedSequence(SP_COL, mapItem()));
	}

	// It theory any expr() is accepted, but this kills the parser(super slow)
	// so allowing only select items
	public Rule mapItem()
	{
		return sequence(firstOf(litteralBase(), id()), zeroOrMore(termChain()));
	}

	// ------------ Litteral items ---------------------------------------------
	public Rule strs()
	{
		return firstOf(
			enforcedSequence(QUOTES3, // triple quoted string
			zeroOrMore(firstOf(
			unicodeChar(),
			escapedChar(),
			sequence(testNot(QUOTES3), any()))), QUOTES3),
			enforcedSequence(QUOTE, // simple string
			zeroOrMore(firstOf(
			unicodeChar(),
			escapedChar(),
			sequence(testNot(QUOTE), any()))), QUOTE));
	}

	public Rule uri()
	{
		return enforcedSequence(TICK,
			zeroOrMore(firstOf(
			unicodeChar(),
			escapedChar(),
			sequence(testNot(TICK), any()))),
			TICK);
	}

	public Rule char_()
	{
		return enforcedSequence(SINGLE_Q,
			firstOf(
			unicodeChar(),
			escapedChar(),
			any()), //all else
			SINGLE_Q);
	}

	public Rule escapedChar()
	{
		return enforcedSequence("\\", firstOf('b', 'f', 'n', 'r', 't', '"', '\'', '`', '$', '\\'));
	}

	public Rule unicodeChar()
	{
		return enforcedSequence("\\u", hexDigit(), hexDigit(), hexDigit(), hexDigit());
	}

	public Rule hexDigit()
	{
		return firstOf(digit(),
			charRange('a', 'f'),
			charRange('A', 'F'));
	}

	public Rule digit()
	{
		return charRange('0', '9');
	}

	public Rule number()
	{
		return sequence(
			optional(OP_MINUS),
			firstOf(
				// hex number
				enforcedSequence(firstOf("0x", "0X"), oneOrMore(firstOf("_", hexDigit()))),
				// decimal
				// fractional
				enforcedSequence(fraction(), optional(exponent())),
				enforcedSequence(digit(),
					zeroOrMore(sequence(zeroOrMore("_"), digit())),
					optional(fraction()),
					optional(exponent()))),
			optional(nbType()));
	}

	public Rule fraction()
	{
		return enforcedSequence(DOT, digit(), zeroOrMore(sequence(zeroOrMore("_"), digit())));
	}

	public Rule exponent()
	{
		return enforcedSequence(charSet("eE"),
			optional(firstOf(OP_PLUS, OP_MINUS)),
			digit(),
			zeroOrMore(sequence(zeroOrMore("_"), digit())));
	}

	public Rule nbType()
	{
		return firstOf(
			"day", "hr", "min", "sec", "ms", "ns", //durations
			"f", "F", "D", "d" // float / decimal
			);
	}

	// ------------ Type -------------------------------------------------------
	// Types use noNl() a lot to avoid gramar confusion
	public Rule type()
	{
		return firstOf(simpleMapType(), nonSimpleMapTypes());
	}

	public Rule simpleMapType()
	{
		// It has to be other nonSimpleMapTypes, otherwise it's left recursive (loops forever)
		return sequence(nonSimpleMapTypes(), SP_COL, nonSimpleMapTypes(),
			optional(
			// Not enforcing [] because of problems with maps like this Str:int["":5]
			sequence(optional(SP_QMARK), SQ_BRACKET_L, SQ_BRACKET_R)), // list of '?[]'
			optional(SP_QMARK)); // nullable
	}

	// all types except simple map
	public Rule nonSimpleMapTypes()
	{
		return sequence(
			firstOf(funcType(), mapType(), simpleType()),
			optional(
			// Not enforcing [] because of problems with maps like this Str:int["":5]
			sequence(optional(SP_QMARK), SQ_BRACKET_L, SQ_BRACKET_R)), // list of '?[]'
			optional(SP_QMARK)); // nullable
	}

	// all types except function
	public Rule nonFunctionType()
	{
		return sequence(
			// Don't allow simpleMap starting with '|' as this conflict with closing Function.
			firstOf(sequence(testNot(SP_PIPE), simpleMapType()), mapType(), simpleType()),
			optional(
			sequence(optional(SP_QMARK), enforcedSequence(
			SQ_BRACKET_L, SQ_BRACKET_R))), // list of '?[]'
			optional(SP_QMARK)); // nullable
	}

	public Rule simpleType()
	{
		return sequence(
			id(),
			optional(enforcedSequence(SP_COLCOL, id())));
	}

	public Rule mapType()
	{
		// We use nonSimpleMapTypes here as well, because [Str:Int:Str] would be confusing
		// not enforced to allow map rule to work ([Int:Str][5,""])
		return sequence(SQ_BRACKET_L, nonSimpleMapTypes(), SP_COL, nonSimpleMapTypes(), SQ_BRACKET_R);
	}

	public Rule funcType()
	{
		return enforcedSequence(SP_PIPE,
				firstOf(
				// Fantom grammar is not correct for this.
				// type() stating with '|' would cause issues because it would get confused with the closing "|"
				// so not allowing types starting with PIPE (testNot), such as an inner function Type (or simpleMap of).
				// We check in an order that's faster
				// First we check for one with no formals |->| or |->Str|
				enforcedSequence(OP_ARROW, optional(nonFunctionType())),
				// Then we check for one with formals only |Int i| or maybe full: |Int i -> Str|
				sequence(formals(), optional(enforcedSequence(OP_ARROW, optional(nonFunctionType()))))),
				SP_PIPE);
	}

	public Rule formals()
	{
		// Formal type of function type would cause issues because it will get confused whether it's
		// the closing "|" or opening of an inner one. -> not allowing nested functions def (using nonFunctionTypes())
		return sequence(
					testNot(SP_PIPE), typeAndOrId(),
					zeroOrMore(enforcedSequence(SP_COMMA, testNot(SP_PIPE), typeAndOrId()))); // typeAnrOrId - funtional types
	}

	public Rule typeList()
	{
		return sequence(type(), zeroOrMore(enforcedSequence(SP_COMMA, type())));
	}

	public Rule typeAndOrId()
	{
		// Note it can be "type id", "type" or "id"
		// but parser can't know if it's "type" or "id" so always recognize as type
		// so would never actually hit id()
		return firstOf(sequence(type(), id()), type()/*, id()*/);
	}
	// ------------ Misc -------------------------------------------------------

	public Rule id()
	{
		return sequence(
			firstOf(charRange('A', 'Z'), charRange('a', 'z'), "_"),
			zeroOrMore(firstOf(charRange('A', 'Z'), charRange('a', 'z'), "_", charRange('0', '9'))),
			OPT_SP);
	}

	public Rule doc()
	{
		return oneOrMore(sequence("**", zeroOrMore(sequence(testNot("\n"), any())), "\n"));
	}

	@Leaf
	public Rule spacing()
	{
		return oneOrMore(firstOf(
			// whitespace (Do NOT eat \n since it can be meaningful)
			oneOrMore(charSet(" \t\u000c")),
			// multiline comment
			sequence("/*", zeroOrMore(sequence(testNot("*/"), any())), "*/"), // normal comment
			// if incomplete multiline comment, then end at end of line
			sequence("/*", zeroOrMore(sequence(testNot(charSet("\r\n")), any())), charSet("\r\n")),
			// single line comment
			sequence("//", zeroOrMore(sequence(testNot(charSet("\r\n")), any())), charSet("\r\n"))));
	}

	public Rule LF()
	{
		return oneOrMore(sequence(OPT_SP, oneOrMore(charSet("\r\n")),OPT_SP));
	}

	public Rule OPT_LF()
	{
		return optional(LF());
	}

	@Leaf
	public Rule terminal(String string)
	{
		return sequence(string, optional(spacing())).label(string);
	}

	@Leaf
	public Rule terminal(String string, Rule mustNotFollow)
	{
		return sequence(string, testNot(mustNotFollow), optional(spacing())).label(string);
	}
	// -------------- Terminal items -------------------------------------------
	// -- Keywords --
	public final Rule KW_USING = terminal("using");
	public final Rule KW_ABSTRACT = terminal("abstract");
	public final Rule KW_AS = terminal("as");
	public final Rule KW_ASSERT = terminal("assert"); // not a grammar kw
	public final Rule KW_BREAK = terminal("break");
	public final Rule KW_CATCH = terminal("catch");
	public final Rule KW_CASE = terminal("case");
	public final Rule KW_CLASS = terminal("class");
	public final Rule KW_CONST = terminal("const");
	public final Rule KW_CONTINUE = terminal("continue");
	public final Rule KW_DEFAULT = terminal("default");
	public final Rule KW_DO = terminal("do"); // unused, reserved
	public final Rule KW_ELSE = terminal("else");
	public final Rule KW_FALSE = terminal("false");
	public final Rule KW_FINAL = terminal("final");
	public final Rule KW_FINALLY = terminal("finally");
	public final Rule KW_FOR = terminal("for");
	public final Rule KW_FOREACH = terminal("foreach"); // unused, reserved
	public final Rule KW_IF = terminal("if");
	public final Rule KW_INTERNAL = terminal("internal");
	public final Rule KW_IS = terminal("is");
	public final Rule KW_IT = terminal("ii");
	public final Rule KW_ISNOT = terminal("isnot");
	public final Rule KW_MIXIN = terminal("mixin");
	public final Rule KW_NATIVE = terminal("native");
	public final Rule KW_NEW = terminal("new");
	public final Rule KW_NULL = terminal("null");
	public final Rule KW_ONCE = terminal("once");
	public final Rule KW_OVERRIDE = terminal("override");
	public final Rule KW_PRIVATE = terminal("private");
	public final Rule KW_PUBLIC = terminal("public");
	public final Rule KW_PROTECTED = terminal("protected");
	public final Rule KW_READONLY = terminal("readonly");
	public final Rule KW_RETURN = terminal("return");
	public final Rule KW_STATIC = terminal("static");
	public final Rule KW_SUPER = terminal("super");
	public final Rule KW_SWITCH = terminal("switch");
	public final Rule KW_THIS = terminal("this");
	public final Rule KW_THROW = terminal("throw");
	public final Rule KW_TRUE = terminal("true");
	public final Rule KW_TRY = terminal("tty");
	public final Rule KW_VIRTUAL = terminal("virtual");
	public final Rule KW_VOID = terminal("void"); // unused, reserved
	public final Rule KW_VOLATILE = terminal("volatile"); // unused, reserved
	public final Rule KW_WHILE = terminal("while");
	// Non keyword meningful items
	public final Rule ENUM = terminal("enum");
	public final Rule FACET = terminal("facet");
	// operators
	public final Rule OP_SAFE_CALL = terminal("?.");
	public final Rule OP_SAFE_DYN_CALL = terminal("?->");
	public final Rule OP_ARROW = terminal("->");
	public final Rule OP_ASSIGN = terminal(":=");
	public final Rule OP_ELVIS = terminal("?:");
	public final Rule OP_OR = terminal("||");
	public final Rule OP_AND = terminal("&&");
	public final Rule OP_RANGE = terminal("..");
	public final Rule OP_RANGE_EXCL = terminal("..<");
	public final Rule OP_CURRY = terminal("&");
	public final Rule OP_BANG = terminal("!");
	public final Rule OP_2PLUS = terminal("++");
	public final Rule OP_2MINUS = terminal("--");
	public final Rule OP_PLUS = terminal("+");
	public final Rule OP_MINUS = terminal("-");
	public final Rule OP_MULT = terminal("*");
	public final Rule OP_DIV = terminal("/");
	public final Rule OP_POUND = terminal("#");
	// comparators
	public final Rule CP_EQUALITY = firstOf(terminal("==="), terminal("!=="),
		terminal("=="), terminal("!="));
	public final Rule CP_COMPARATORS = firstOf(terminal("<="), terminal(">="),
		terminal("<=>"), terminal("<"), terminal(">"));
	// separators
	public final Rule SP_PIPE = terminal("|");
	public final Rule SP_QMARK = terminal("?");
	public final Rule SP_COLCOL = terminal("::");
	public final Rule SP_COL = terminal(":");
	public final Rule SP_COMMA = terminal(",");
	public final Rule SP_SEMI = terminal(";");
	// assignment
	public final Rule AS_EQUAL = terminal("=");
	public final Rule AS_ASSIGN_OPS = firstOf(terminal("*="), terminal("/="),
		terminal("%="), terminal("+="), terminal("-="));
	// others
	public final Rule QUOTES3 = terminal("\"\"\"");
	public final Rule QUOTE = terminal("\"");
	public final Rule TICK = terminal("`");
	public final Rule SINGLE_Q = terminal("'");
	public final Rule DOT = terminal(".");
	public final Rule AT = terminal("@");
	public final Rule DSL_OPEN = terminal("<|");
	public final Rule DSL_CLOSE = terminal("|>");
	public final Rule SQ_BRACKET_L = terminal("[");
	public final Rule SQ_BRACKET_R = terminal("]");
	public final Rule BRACKET_L = terminal("{");
	public final Rule BRACKET_R = terminal("}");
	public final Rule PAR_L = terminal("(");
	public final Rule PAR_R = terminal(")");
	// shortcut for optional spacing
	public final Rule OPT_SP = optional(spacing());

	// ----------- Custom action rules -----------------------------------------
	/**
	 * Special action that looks for end of statement
	 * @return
	 */
	public boolean eos()
	{
		MatcherContext ctx = (MatcherContext) getContext();
		if (ctx == null)
		{
			return false;
		}
		// ';' is an end of statement (consume it)
		Matcher m = (Matcher) sequence(OPT_SP, SP_SEMI);
		if (ctx.runMatcher(m, false))
		{
			return true;
		}
		// '\n' is an end of statement (consume it)
		m = (Matcher) LF();
		if (ctx.runMatcher(m, false))
		{
			return true;
		}
		// '}' is an end of statement (BUT DO NOT CONSUME IT !)
		m = new PeekTestMatcher(sequence(OPT_SP, BRACKET_R), false);
		if (ctx.runMatcher(m, false))
		{
			return true;
		}
		// EOI(endOfInput) is an end of statement (BUT DO NOT CONSUME IT !)
		m = new PeekTestMatcher(sequence(OPT_SP, eoi()), false);
		if (ctx.runMatcher(m, false))
		{
			return true;
		}
		return false;
	}
}
