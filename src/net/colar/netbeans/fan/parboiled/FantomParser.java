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
			zeroOrMore(using()),
			/*firstOf(podDef, */ zeroOrMore(typeDef())/*)*/,
			OPT_SP,
			eoi());
	}

	public Rule using()
	{
		return enforcedSequence(
			KW_USING,
			optional(ffi()),
			optional(id()), // Not optional, but we want a valid ast for completion if missing
			zeroOrMore(sequence(DOT, id())),// not enforced to allow completion
			optional(sequence(SP_COLCOL, id())),// not enforced to allow completion
			optional(usingAs()),
			optional(eos())); // optional because if last item in file then we get eoi
	}

	public Rule ffi()
	{
		return enforcedSequence(SQ_BRACKET_L, id(), SQ_BRACKET_R);
	}

	public Rule usingAs()
	{
		return enforcedSequence(KW_AS, id());
	}

// ------------ pod Def ----------------------------------------------------

	/*public Rule podDef()
	{
	return sequence(podHeader(), BRACKET_L, symbolDefs(), BRACKET_R);
	}

	public Rule podHeader()
	{
	return sequence(optional(doc()), facets(), KW_POD, id());
	}*/
	// ------------- Type def --------------------------------------------------
	public Rule typeDef()
	{
		return /*firstOf(*/ classDef()/*, mixinDef(), enumDef())*/;
	}

	public Rule classDef()
	{
		return sequence(
			OPT_SP,
			optional(doc()),
			//zeroOrMore(facet()),
			optional(protection()),
			zeroOrMore(firstOf(KW_ABSTRACT, KW_FINAL, KW_CONST)),
			KW_CLASS,
			id(),
			optional(inheritance()),
			BRACKET_L,
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
	// ------------ Type -------------------------------------------------------
	public Rule type()
	{
		return firstOf(simpleMapType(), otherTypes());
	}

	public Rule simpleMapType()
	{
		// It has to be other types, otherwise it's left recursive (loops forever)
		return sequence(otherTypes(), SP_COL, otherTypes(),
		optional(
			sequence(optional(SP_QMARK), enforcedSequence(
			SQ_BRACKET_L, SQ_BRACKET_R))), // list of '?[]'
			optional(SP_QMARK)); // nullable
	}

	public Rule otherTypes()
	{
		return sequence(
			firstOf(funcType(), mapType(), simpleType()),
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
		// We use otherTypes here as well, because [Str:Int:Str] would be confusing too
		return enforcedSequence(SQ_BRACKET_L, otherTypes(), SP_COL, otherTypes(), SQ_BRACKET_R);
	}

	public Rule funcType()
	{
		return enforcedSequence(SP_PIPE, optional(formals()), OP_ARROW, optional(type()), SP_PIPE);
	}

	public Rule formals()
	{
		return sequence(formal(), zeroOrMore(enforcedSequence(SP_COMMA, formal())));
	}

	public Rule formal()
	{
		return firstOf(
			sequence(type(), id()), // type & id
			type(), // type only
			id() // inferred
			);
	}

	public Rule typeList()
	{
		return sequence(type(), zeroOrMore(sequence(SP_COMMA, type())));
	}

	//------------------- Slot Def ---------------------------------------------
	public Rule slotDef()
	{
		return /*firstOf(ctorDef(), methodDef(),*/ fieldDef()/*)*/;
	}

	public Rule fieldDef()
	{
			return sequence(
					//zeroOrMore(facet()),
					optional(protection()),
					zeroOrMore(firstOf(KW_ABSTRACT, KW_CONST, KW_FINAL, KW_STATIC,
						KW_NATIVE, KW_OVERRIDE, KW_READONLY, KW_VIRTUAL)),
					typeAndId(),
					optional(sequence(OP_ASSIGN, expr())),
					optional(fieldAccessor()),
					eos()
					);
	}

	public Rule typeAndId()
	{
		// Note it can be "type id", "type" or "id"
		// but parser can't know if it's "type" or "id" so always recognize as type
		// should never actually hit id()
		return firstOf(sequence(type(),id()), type()/*, id()*/);
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

	public Rule expr()
	{
		//TODO: dummy
		return oneOrMore("XXX");
	}
	public Rule block()
	{
		//TODO: dummy
		return oneOrMore("YYY");
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
	// -------------- Terminal items -------------------------------------------
	//public final Rule BRACKET_L = terminal("{");
	//public final Rule BRACKET_R = terminal("}");
	public final Rule SQ_BRACKET_L = terminal("[");
	public final Rule SQ_BRACKET_R = terminal("]");
	public final Rule BRACKET_L = terminal("{");
	public final Rule BRACKET_R = terminal("}");
	public final Rule KW_USING = terminal("using");
	public final Rule KW_AS = terminal("as");
	public final Rule KW_POD = terminal("pod");
	public final Rule KW_CLASS = terminal("class");
	public final Rule KW_ABSTRACT = terminal("abstract");
	public final Rule KW_FINAL = terminal("final");
	public final Rule KW_CONST = terminal("const");
	public final Rule KW_PUBLIC = terminal("public");
	public final Rule KW_PRIVATE = terminal("private");
	public final Rule KW_INTERNAL = terminal("internal");
	public final Rule KW_PROTECTED = terminal("protected");
	public final Rule KW_STATIC = terminal("static");
	public final Rule KW_NATIVE = terminal("native");
	public final Rule KW_OVERRIDE = terminal("override");
	public final Rule KW_VIRTUAL = terminal("virtual");
	public final Rule KW_READONLY = terminal("readonly");
	public final Rule OP_ARROW = terminal("->");
	public final Rule OP_ASSIGN = terminal(":=");
	public final Rule SP_PIPE = terminal("|");
	public final Rule SP_QMARK = terminal("?");
	public final Rule SP_COLCOL = terminal("::");
	public final Rule SP_COL = terminal(":");
	public final Rule SP_COMMA = terminal(",");
	public final Rule DOT = terminal(".");
	public final Rule OPT_SP = optional(spacing()); // optional spacing shortcut

	// Leafs
	@Leaf
	public Rule spacing()
	{
		return oneOrMore(firstOf(
			// whitespace
			oneOrMore(charSet(" \t\r\n\u000c")),
			// traditional comment
			sequence("/*", zeroOrMore(sequence(testNot("*/"), any())), "*/"), // normal comment
			// if incomplete comment, then end at end of line
			//sequence(zeroOrMore(sequence(testNot("\n"), any())), "\n"))),
			// end of line comment
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

	// ----------- Custom action rules -----------------------------------------

	/**
	 * Look for end of statement
	 * @return
	 */
	public boolean eos()
	{
		// First check if we just passed a '\n' (ignored spacing)
		InputBuffer buffer = getContext().getInputBuffer();
		Node nen = ParboiledUtils.getLastNonEmptyNode(getContext(), buffer);
		if(nen!=null)
		{
			String text = ParseTreeUtils.getNodeText(nen, buffer);
			if(nen.getLabel().equals("spacing") && text.indexOf("\n")!=-1)
				return true; // we just passed a line break
		}
		// Otherwise look for upcoming statement ending chars: ';' '\n' or '}'
		SequenceMatcher seq = (SequenceMatcher)sequence(OPT_SP,charSet(";\n}"),OPT_SP);
		return seq.match((MatcherContext)getContext());
	}

}
