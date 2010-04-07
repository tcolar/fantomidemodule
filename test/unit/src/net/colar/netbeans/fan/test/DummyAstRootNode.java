/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.test;

import net.colar.netbeans.fan.FanParserTask;
import net.colar.netbeans.fan.parboiled.AstKind;
import net.colar.netbeans.fan.parboiled.RootNode;

/**
 *
 * @author tcolar
 */
class DummyAstRootNode extends RootNode
{
	public DummyAstRootNode(FanParserTask task)
	{
		super(AstKind.DUMMY_NODE, "dummy", null, task);
		setIsScopeNode();
	}

	@Override
	public RootNode getRoot()
	{
		return this;
	}

}
