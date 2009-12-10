/*
 * Thibaut Colar Dec 9, 2009
 */

package net.colar.netbeans.fan.ast;

import org.antlr.runtime.tree.CommonTree;

/**
 * Generic scope
 * Usually delimited by a code block (brackets etc...)
 * // TODO: What else limits scope - research fantom doc
 * @author thibautc
 */
public class FanBlockScope extends FanAstScope
{
	public FanBlockScope(FanAstScope parent, CommonTree codeBlock)
	{
		super(parent, codeBlock);
	}

	/**
	 * Parse the code block recursively and create apropriate subscopes
	 * @param codeBlock
	 */
	protected void parse()
	{
		throw new UnsupportedOperationException("Not yet implemented");
	}

}
