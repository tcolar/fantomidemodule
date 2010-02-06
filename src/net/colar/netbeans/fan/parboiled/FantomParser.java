/*
 * Thibaut Colar Feb 5, 2010
 */
package net.colar.netbeans.fan.parboiled;

import net.colar.netbeans.fan.antlr.FanParser.nonMapType_return;
import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.support.Leaf;

/**
 *
 * @author thibautc
 */
@SuppressWarnings(
{
	"InfiniteRecursion"
})
public class FantomParser extends BaseParser<Object>
{
	//final FantomParserActions actions = new FantomParserActions();

	public int skipCpt = 0;
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
			//optional(facets()),
			optional(protection()), optional(KW_ABSTRACT), optional(KW_FINAL), optional(KW_CONST),
			KW_CLASS,
			id(),
			optional(inheritance()),
			tempBlock() //skipBlock()
			//zeroOrMore(slotDef()),
			//BRACKET_R);
			);
	}

	public Rule tempBlock()
	{
		return enforcedSequence(
			BRACKET_L,
			zeroOrMore(
			sequence(type(), id(), OPT_SP)),
			BRACKET_R);

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

	// ------------ Misc -------------------------------------------------------
	public Rule id()
	{
		return sequence(
			firstOf(charRange('A', 'Z'), charRange('a', 'z'), "_"),
			zeroOrMore(firstOf(charRange('A', 'Z'), charRange('a', 'z'), "_", charRange('0', '9'))),
			OPT_SP);
	}

	public Rule eos()
	{
		// also eat whatever spacing.
		return sequence(OPT_SP, charSet(";\n}"));
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
	public final Rule OP_ARROW = terminal("->");
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

	/*public boolean recurseCheck(String key)
	{
	Integer val = recurseMap.get(key);
	if(val==null)
	val=0;
	val++;
	System.out.println(key +" -> " + val);
	recurseMap.put(key, val);
	return val<5;
	}*/
	public Rule skipBlock()
	{
		skipCpt = 0;
		return zeroOrMore(sequence(any(), doSkip(LAST_TEXT())));
	}

	public boolean doSkip(String text)
	{
		System.out.println("text: '" + text + "'");
		if (text.equalsIgnoreCase("{"))
		{
			// consume
			skipCpt++;
		} else if (LAST_TEXT().equalsIgnoreCase("}"))
		{
			skipCpt--;
			if (skipCpt == 0)
			{
				return false;
			}
		}
		return true;
	}
}
