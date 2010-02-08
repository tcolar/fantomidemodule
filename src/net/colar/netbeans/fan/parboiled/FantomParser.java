/*
 * Thibaut Colar Feb 5, 2010
 */
package net.colar.netbeans.fan.parboiled;

import org.parboiled.BaseParser;
import org.parboiled.MatcherContext;
import org.parboiled.Node;
import org.parboiled.Rule;
import org.parboiled.matchers.SequenceMatcher;
import org.parboiled.support.InputBuffer;
import org.parboiled.support.Leaf;
import org.parboiled.support.ParseTreeUtils;

/**
 * Parboiled parser for the Fantom Language
 * Started with Fantom Grammar 1.0.50
 * Grammar spec:
 * http://fantom.org/doc/docLang/Grammar.html
 * @author thibautc
 */
@SuppressWarnings(
{
	"InfiniteRecursion"
})
public class FantomParser extends BaseParser<Object>
{
	// ------------ Comp Unit --------------------------------------------------

	public Rule compilationUnit()
	{
		return sequence(
			OPT_SP,
			zeroOrMore(firstOf(using(),incUsing())),
			zeroOrMore(typeDef()),
			OPT_SP,
			eoi());
	}

	public Rule using()
	{
		return enforcedSequence(
			KW_USING,
			optional(ffi()),
			id(), 
			zeroOrMore(enforcedSequence(DOT, id())),
			optional(enforcedSequence(SP_COLCOL, id())),// not enforced to allow completion
			optional(usingAs()),
			eos());
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
			optional(eos())); 		
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
			OPT_SP,
			optional(doc()),
			zeroOrMore(facet()),
			optional(protection()),
			firstOf(
				sequence(zeroOrMore(firstOf(KW_ABSTRACT, KW_FINAL, KW_CONST)),	KW_CLASS), // standard class
				enforcedSequence(ENUM, KW_CLASS), // enum class
				enforcedSequence(FACET, KW_CLASS), // facet class
				KW_MIXIN // mixin
			),
			id(),
			optional(inheritance()),
			BRACKET_L,
			optional(enumValDefs()), // only valid for enums, but simplifying
			zeroOrMore(slotDef()),
			BRACKET_R
			);
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
		return enforcedSequence(AT, simpleType(), optional(facetVals()));
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
		return sequence(id(), optional(enforcedSequence(PAR_L, args() ,PAR_R)));
	}

	public Rule slotDef()
	{
		return firstOf(ctorDef(), methodDef(), fieldDef());
	}

	public Rule fieldDef()
	{
			return sequence(
					zeroOrMore(facet()),
					optional(protection()),
					zeroOrMore(firstOf(KW_ABSTRACT, KW_CONST, KW_FINAL, KW_STATIC,
						KW_NATIVE, KW_OVERRIDE, KW_READONLY, KW_VIRTUAL)),
					typeAndOrId(),
					optional(sequence(OP_ASSIGN, expr())),
					optional(fieldAccessor()),
					eos()
					);
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
					PAR_L,
					optional(params()),
					PAR_R,
					methodBody());
	}

	public Rule ctorDef()
	{
			return sequence(
					zeroOrMore(facet()),
					optional(protection()),
					type(),
					KW_NEW,
					id(),
					optional(
						firstOf(	// ctor chain
						enforcedSequence(KW_THIS, DOT, id(), PAR_L, args(), PAR_R),
						enforcedSequence(KW_SUPER, optional(enforcedSequence(DOT, id())), PAR_L, args(), PAR_R)
						)
					),
					PAR_L,
					optional(params()),
					PAR_R,
					methodBody());
	}

	public Rule methodBody()
	{
		return	firstOf(
				 enforcedSequence(BRACKET_L, zeroOrMore(stmt()), BRACKET_R),
				 eos()); // method with no body
	}

	public Rule params()
	{
		return sequence(param(), zeroOrMore(enforcedSequence(SP_COMMA, params())));
	}

	public Rule param()
	{
		return sequence(type(), id(), optional(enforcedSequence(OP_ASSIGN, expr())));
	}

	public Rule fieldAccessor()
	{
		return enforcedSequence(
				BRACKET_L,
				optional(sequence("get", firstOf(eos(), block()))),
				optional(sequence(optional(protection()),"set", firstOf(eos(), block()))),
				BRACKET_R
				);
	}

	public Rule args()
	{
		return sequence(expr(), zeroOrMore(enforcedSequence(SP_COMMA, expr())));
	}

	// ------------ Statements -------------------------------------------------
	public Rule block()
	{
		return firstOf(
				enforcedSequence(BRACKET_L, zeroOrMore(stmt()), BRACKET_R),
				stmt() // singlr statement
			);
	}

	public Rule stmt()
	{
		return firstOf(sequence(KW_BREAK, eos()), sequence(KW_CONTINUE, eos()), for_(),
						if_(), sequence(KW_RETURN, optional(expr()), eos()), switch_(),
						sequence(KW_THROW, expr(), eos()), while_(), try_(),
						localDef(), itAdd(), sequence(expr(), eos()));
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
		return sequence(typeAndOrId(),
						optional(enforcedSequence(OP_ASSIGN, expr())),
						eos());
	}

	public Rule itAdd()
	{
		return sequence(expr(), zeroOrMore(sequence(SP_COMMA, expr())), eos());
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
			BRACKET_L,
			zeroOrMore(enforcedSequence(KW_CASE, expr(), SP_COL, zeroOrMore(stmt()))),
			optional(enforcedSequence(KW_DEFAULT, SP_COL, zeroOrMore(stmt()))),
			BRACKET_R);
	}

	// ----------- Expressions -------------------------------------------------
	public Rule expr()
	{
		//TODO: dummy
		return oneOrMore("XXX");
	}

	// ------------ Type -------------------------------------------------------
	// Types use noNl() a lot to avoid gramar confusion
	public Rule type()
	{
		return firstOf(simpleMapType(), otherTypes());
	}

	public Rule simpleMapType()
	{
		// It has to be other types, otherwise it's left recursive (loops forever)
		return sequence(otherTypes(), noNl(), SP_COL, noNl(), otherTypes(),
		optional(
			sequence(noNl(), optional(SP_QMARK), noNl(), enforcedSequence(
			SQ_BRACKET_L, SQ_BRACKET_R))), // list of '?[]'
			optional(sequence(noNl(), SP_QMARK))); // nullable
	}

	public Rule otherTypes()
	{
		return sequence(
			firstOf(funcType(), mapType(), simpleType()),
			optional(
			sequence(noNl(),optional(SP_QMARK), noNl(), enforcedSequence(
			SQ_BRACKET_L, SQ_BRACKET_R))), // list of '?[]'
			optional(sequence(noNl(), SP_QMARK))); // nullable
	}

	public Rule simpleType()
	{
		return sequence(
			id(),
			optional(sequence(noNl(), enforcedSequence(SP_COLCOL, noNl(), id()))));
	}

	public Rule mapType()
	{
		// We use otherTypes here as well, because [Str:Int:Str] would be confusing too
		return enforcedSequence(SQ_BRACKET_L, noNl(), otherTypes(), noNl(), SP_COL, noNl(), otherTypes(), noNl(), SQ_BRACKET_R);
	}

	public Rule funcType()
	{
		return enforcedSequence(SP_PIPE, noNl(), optional(formals()), noNl(), OP_ARROW, noNl(), optional(type()), noNl(), SP_PIPE);
	}

	public Rule formals()
	{
		return sequence(typeAndOrId(), zeroOrMore(enforcedSequence(noNl(), SP_COMMA, typeAndOrId())));
	}

	public Rule typeList()
	{
		return sequence(type(), zeroOrMore(sequence(noNl(), SP_COMMA, type())));
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
			// whitespace
			oneOrMore(charSet(" \t\r\n\u000c")),
			// multiline comment
			sequence("/*", zeroOrMore(sequence(testNot("*/"), any())), "*/"), // normal comment
			// if incomplete multiline comment, then end at end of line
			sequence("/*", zeroOrMore(sequence(testNot("\n"), any())), "\n"),
			// single line comment
			sequence("//", zeroOrMore(sequence(testNot(charSet("\r\n")), any())), charSet("\r\n"))));
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
	public final Rule KW_BREAK = terminal("break");
	public final Rule KW_CATCH = terminal("catch");
	public final Rule KW_CASE = terminal("case");
	public final Rule KW_CLASS = terminal("class");
	public final Rule KW_CONST = terminal("const");
	public final Rule KW_CONTINUE = terminal("continue");
	public final Rule KW_DEFAULT = terminal("default");
	public final Rule KW_ELSE = terminal("else");
	public final Rule KW_FINAL = terminal("final");
	public final Rule KW_FINALLY = terminal("finally");
	public final Rule KW_FOR = terminal("for");
	public final Rule KW_IF = terminal("if");
	public final Rule KW_INTERNAL = terminal("internal");
	public final Rule KW_MIXIN = terminal("mixin");
	public final Rule KW_NATIVE = terminal("native");
	public final Rule KW_NEW = terminal("new");
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
	public final Rule KW_TRY = terminal("tty");
	public final Rule KW_VIRTUAL = terminal("virtual");
	public final Rule KW_WHILE = terminal("while");
	// Non keyword meningful items
	public final Rule ENUM = terminal("enum");
	public final Rule FACET = terminal("facet");
	// operators
	public final Rule OP_ARROW = terminal("->");
	public final Rule OP_ASSIGN = terminal(":=");
	// separators
	public final Rule SP_PIPE = terminal("|");
	public final Rule SP_QMARK = terminal("?");
	public final Rule SP_COLCOL = terminal("::");
	public final Rule SP_COL = terminal(":");
	public final Rule SP_COMMA = terminal(",");
	public final Rule SP_SEMI = terminal(";");
	// assignment
	public final Rule AS_EQUAL = terminal("=");
	// others
	public final Rule DOT = terminal(".");
	public final Rule AT = terminal("@");
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
	 * Look for end of statement
	 * @return
	 */
	public boolean eos()
	{
		// First check if we just passed a '\n' (ignored spacing)
		if(isAfterNL())
			return true;
		// Otherwise look for upcoming statement ending chars: ';' '\n' or '}'
		SequenceMatcher seq = (SequenceMatcher)sequence(OPT_SP,charSet(";\n}"),OPT_SP);
		return seq.match((MatcherContext)getContext());
	}

	/**
	 * Checks if we just passed a '\n' (ignored spacing)
	 * Usually we ignore newline (meaningless to grammar), but sometimes they
	 * do are mening ful ex:
	 * Str[Int]  != Str\n[Int]
	 * @return
	 */
	public boolean isAfterNL()
	{
		if(getContext()==null)
			return false;
		InputBuffer buffer = getContext().getInputBuffer();
		Node nen = ParboiledUtils.getLastNonEmptyNode(getContext(), buffer);
		if(nen!=null)
		{
			String text = ParseTreeUtils.getNodeText(nen, buffer);
			if(nen.getLabel().equals("spacing") && text.indexOf("\n")!=-1)
				return true; // we just passed a line break
		}
		return false;
	}

	// shortcut for ! isAfterNL();
	public boolean noNl()
	{
		return ! isAfterNL();
	}
}
