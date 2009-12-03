/*
 * Thibaut Colar Nov 24, 2009
 */

package net.colar.netbeans.fan.ast;

/**
 *
 * @author thibautc
 */
public class FanAstScope
{
	private FanAstScope parent=null;

	public FanAstScope(FanAstScope parent)
	{
		this.parent=parent;
	}

	public void dump()
	{
		System.out.println("Ast Scope Node: "+toString());
	}

	public FanAstScope getParent()
	{
		return parent;
	}
}
