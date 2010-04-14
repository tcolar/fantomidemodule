/*
 * Thibaut Colar Apr 1, 2010
 */
package net.colar.netbeans.fan.parboiled;

import org.parboiled.Rule;

/**
 * @author thibautc
 */
public class FantomLexer extends FantomParser
{

	public FantomLexer()
	{
		super(null);
	}

	/**
	 * Note: We don't allow extra spacing trailing items as in the parser here
	 * @return
	 */
	@Override
	public Rule spacing()
	{
		return ToRule(false);
	}

}
