/*
 * Thibaut Colar Feb 19, 2010
 */
package net.colar.netbeans.fan.parboiled;

import java.util.Hashtable;
import net.colar.netbeans.fan.FanTokenID;
import net.colar.netbeans.fan.FanUtilities;

/**
 * Parboiled parser does not really provide a lexer, so we simulate one using the parser.
 * This creates the tokens important to the lexer (syntax highlighting)
 * @author thibautc
 */
public class FantomLexerTokens
{
	// Lexer label names ... we want all tokens provided by the lexer() rule of the parser to be listed here
	public enum TokenName{
		COMMENT, UNIXLINE, DOC, LEXEROPS, LEXERSEPS, LEXERASSIGN, LEXERINIT, LEXERCOMPS, LEXERITEMS,
		STRS, URI, CHAR_, KEYWORD, ID, LEXERID, NUMBER, WHITESPACE, SPACING, LF, DSL, ANY, ERROR, UNEXPECTED,
		//Items we use a lot in the lexer
		SQ_BRACKET_L, SQ_BRACKET_R, BRACKET_L, BRACKET_R, PAR_L, PAR_R, DOT, AT, DSL_OPEN, DSL_CLOSE
	}

	// lazy inited
	private static Hashtable<Integer, FanTokenID> tokens = new Hashtable<Integer, FanTokenID>();
	private static Hashtable<String, Integer> tokenIdByName = new Hashtable<String, Integer>();

	// Map Token lables with Netbeans color entries (textColors.xml)
	private static Hashtable<TokenName, String> getColorIds()
	{
		Hashtable<TokenName, String> cats = new Hashtable<TokenName, String>();
		cats.put(TokenName.COMMENT, "Fantom-comment");
		cats.put(TokenName.DOC, "Fantom-doc");
		cats.put(TokenName.UNIXLINE, "Fantom-doc");
		cats.put(TokenName.DSL, "Fantom-dsl");
		cats.put(TokenName.NUMBER, "Fantom-number");
		cats.put(TokenName.CHAR_, "Fantom-character");
		cats.put(TokenName.KEYWORD, "Fantom-keyword");
		cats.put(TokenName.LEXEROPS, "Fantom-operator");
		cats.put(TokenName.LEXERSEPS, "Fantom-separator");
		cats.put(TokenName.LEXERCOMPS, "Fantom-comparator");
		cats.put(TokenName.LEXERASSIGN, "Fantom-assignment");
		cats.put(TokenName.LEXERASSIGN, "Fantom-initialization");
		cats.put(TokenName.STRS, "Fantom-string");
		cats.put(TokenName.URI, "Fantom-string");
		cats.put(TokenName.ERROR, "Fantom-error"); //error token in case of problem with lexer
		cats.put(TokenName.UNEXPECTED, "Fantom-error"); //should NOT happen
		return cats;
	}

	/**
	 * Get a token object by it's label/name
	 * @param name
	 * @return
	 */
	public static FanTokenID getTokenByName(String name)
	{
		if(name==null)
		{
			FanUtilities.GENERIC_LOGGER.info("FantomparserToken: Null token passed");
			return getTokenByName(TokenName.ERROR);
		}
		Integer id = tokenIdByName.get(name.toUpperCase());
		if(id==null)
		{
			FanUtilities.GENERIC_LOGGER.info("FantomparserToken: No such token: "+name);
			return getTokenByName(TokenName.ERROR);
		}
		return tokens.get(id);
	}

	public static FanTokenID getTokenByName(TokenName name)
	{
		return getTokenByName(name.name().toUpperCase());
	}

	/**
	 * Get all the defined token (lazilly cached)
	 * @return
	 */
	public static Hashtable<Integer, FanTokenID> getTokens()
	{
		if (tokens.isEmpty())
		{
			synchronized(FantomParser.class)
			{
				if (tokens.isEmpty())
				{
					tokens = new Hashtable<Integer, FanTokenID>();
					Hashtable<TokenName, String> colorIds = getColorIds();

					int id = 0;
					for(TokenName name : TokenName.values())
					{
						id++;
						FanTokenID token;
						String cat = "";
						if (colorIds.containsKey(name))
						{
							cat = colorIds.get(name);
						}
						//System.out.println("New token: " + name + "(" + id + ") : " + cat);
						token = new FanTokenID(name.name(), id, cat);
						tokens.put(id, token);
						tokenIdByName.put(name.name(), id);
					}
				}
			}
		}
		return tokens;
	}
}
