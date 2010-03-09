/*
 * Thibaut Colar Feb 19, 2010
 */
package net.colar.netbeans.fan.parboiled;

import java.util.Hashtable;
import net.colar.netbeans.fan.FanTokenID;

/**
 * Parboiled parser does not really provide a lexer, so we simulate one using the parser.
 * This creates the tokens important to the lexer (syntax highlighting)
 * @author thibautc
 */
public class FantomParserTokens
{
	// Lexer label names ... we want all tokens provided by the lexer() rule of the parser to be listed here
	public enum TokenName{
		COMMENT, UNIXLINE, DOC, LEXEROPS, LEXERSEPS, LEXERASSIGN, LEXERINIT, LEXERCOMPS, LEXERITEMS,
		STRS, URI, CHAR, KEYWORD, ID, NUMBER, WHITESPACE, SPACING, LF, LEXERBRACKETS, DSL, ANY, ERROR
	}

	// lazy inited
	private static Hashtable<Integer, FanTokenID> tokens = new Hashtable<Integer, FanTokenID>();
	private static Hashtable<String, Integer> tokenIdByName = new Hashtable<String, Integer>();

	// Map Token lables with Netbeans color entries (textColors.xml)
	private static Hashtable<TokenName, String> getColorIds()
	{
		Hashtable<TokenName, String> cats = new Hashtable<TokenName, String>();
		cats.put(TokenName.COMMENT, "comment");
		cats.put(TokenName.DOC, "DOC");
		cats.put(TokenName.UNIXLINE, "DOC");
		cats.put(TokenName.DSL, "DSL");
		cats.put(TokenName.NUMBER, "number");
		cats.put(TokenName.CHAR, "character");
		cats.put(TokenName.KEYWORD, "keyword");
		cats.put(TokenName.LEXEROPS, "operator");
		cats.put(TokenName.LEXERSEPS, "separator");
		cats.put(TokenName.LEXERCOMPS, "comparator");
		cats.put(TokenName.LEXERASSIGN, "assignment");
		cats.put(TokenName.LEXERASSIGN, "initialization");
		cats.put(TokenName.STRS, "string");
		cats.put(TokenName.URI, "string");
		cats.put(TokenName.ERROR, "error"); //error token in case of problem with lexer
		return cats;
	}

	/**
	 * Get a token object by it's label/name
	 * @param name
	 * @return
	 */
	public static FanTokenID getTokenByName(String name)
	{
		Integer id = tokenIdByName.get(name);
		if(id==null)
			return null;
		return tokens.get(id);
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
							cat = (String) colorIds.get(name);
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
