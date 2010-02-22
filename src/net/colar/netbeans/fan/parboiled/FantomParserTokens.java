/*
 * Thibaut Colar Feb 19, 2010
 */
package net.colar.netbeans.fan.parboiled;

import java.util.Hashtable;
import net.colar.netbeans.fan.FanTokenID;

/**
 * Parboiled parser does not really provide a lexer, so we simulate one using the parser.
 * This is creates the tokens important to the lexer (syntax highlighting)
 * @author thibautc
 */
public class FantomParserTokens
{
	// lazy inited
	private static Hashtable<Integer, FanTokenID> tokens = new Hashtable<Integer, FanTokenID>();
	private static Hashtable<String, Integer> tokenIdByName = new Hashtable<String, Integer>();

	// Lexer label names
	private static final String[] lexerItems = {"comment","unixLine","doc","lexerOps","lexerSeps","lexerAssign",
									"lexerInit", "lexerComps", "strs", "uri", "char", "dsl", "keyword", "id", "number",
									"whiteSpace", "ANY", "error"};

	private static Hashtable<String, String> getColorIds()
	{
		Hashtable<String, String> cats = new Hashtable<String, String>();
		cats.put("comment", "comment");
		cats.put("doc", "DOC");
		cats.put("unixLine", "DOC");
		cats.put("dsl", "DSL");
		cats.put("number", "number");
		cats.put("char", "character");
		cats.put("keyword", "keyword");
		cats.put("lexerOps", "operator");
		cats.put("lexerSeps", "separator");
		cats.put("lexerComps", "comparator");
		cats.put("lexerAssign", "assignment");
		cats.put("lexerInit", "initialization");
		cats.put("strs", "string");
		cats.put("uri", "string");
		cats.put("error", "error"); //error token in case of problem with lexer
		return cats;
	}

	public static FanTokenID getTokenByName(String name)
	{
		Integer id = tokenIdByName.get(name);
		if(id==null)
			return null;
		return tokens.get(id);
	}

	public static Hashtable<Integer, FanTokenID> getTokens()
	{
		if (tokens.isEmpty())
		{
			synchronized(FantomParser.class)
			{
				if (tokens.isEmpty())
				{
					tokens = new Hashtable<Integer, FanTokenID>();
					Hashtable<String, String> colorIds = getColorIds();

					int id = 0;
					for(String name : lexerItems)
					{
						id++;
						FanTokenID token;
						String cat = "";
						if (colorIds.containsKey(name))
						{
							cat = (String) colorIds.get(name);
						}
						//System.out.println("New token: " + name + "(" + id + ") : " + cat);
						token = new FanTokenID(name, id, cat);
						tokens.put(id, token);
						tokenIdByName.put(name, id);
					}
				}
			}
		}
		return tokens;
	}
}
