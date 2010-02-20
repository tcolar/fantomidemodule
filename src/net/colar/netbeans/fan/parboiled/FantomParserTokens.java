/*
 * Thibaut Colar Feb 19, 2010
 */
package net.colar.netbeans.fan.parboiled;

import java.lang.reflect.Field;
import java.util.Hashtable;
import net.colar.netbeans.fan.FanTokenID;

/**
 * Parboiled parser does not really provide a lexer, so this class takes the final rules(fields)
 * and consider them lexer ID's
 * It's also create the token with categories, which are in turn used for syntax highlighting
 * @author thibautc
 */
public class FantomParserTokens
{

	private static Hashtable<String, String> getCategories()
	{
		Hashtable<String, String> cats = new Hashtable<String, String>();
		cats.put("LINE_COMMENT", "comment");
		cats.put("EXEC_COMMENT", "comment");
		cats.put("MULTI_COMMENT", "comment");
		cats.put("NUMBER", "number");
		cats.put("CHAR", "character");
		cats.put("INC_", "error"); //incomplete
		cats.put("KW_", "keyword");
		cats.put("OP_", "operator");
		cats.put("SP_", "separator");
		cats.put("CP_", "comparator");
		cats.put("AS_", "assignment");
		cats.put("STR", "string");
		cats.put("QUOTSTR", "string");
		cats.put("URI", "string");
		return cats;
	}

	public static Hashtable<Integer, FanTokenID> buildTokenList()
	{
		Hashtable<Integer, FanTokenID> tokens = new Hashtable<Integer, FanTokenID>();
		Hashtable<String, String> categories= getCategories();

		Class clazz = FantomParser.class;
		Field[] fields = clazz.getFields();
		int id = 0;
		for (Field field : fields)
		{
			id++;
			FanTokenID token;
			String name = field.getName();
			String cat = "";
			if (categories.containsKey(name))
			{
			    cat = (String)categories.get(name);
			} else
			{    // generic categories like KW_xyz
			    if (name.indexOf("_") > 0)
			    {
				String nm = name.substring(0, name.indexOf("_")+1);

				if (categories.containsKey(nm))
				{
				    cat = (String)categories.get(nm);
				}
			    }
			}
			System.out.println("New token: "+name+"("+id+") : "+cat);
			token = new FanTokenID(name, id, cat);
			tokens.put(id, token);
		}

		return tokens;
	}
}
