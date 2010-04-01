/*
 * Thibaut Colar Apr 1, 2010
 */

package net.colar.netbeans.fan.parboiled;

import org.parboiled.BaseParser;
import org.parboiled.Rule;

/**
 * Dummy test lexer
 * @author thibautc
 */
public class FantomLexer extends BaseParser<AstNode>
{
	public Rule lexer()
	{
		return sequence(zeroOrMore(any()), eoi());
	}
}
