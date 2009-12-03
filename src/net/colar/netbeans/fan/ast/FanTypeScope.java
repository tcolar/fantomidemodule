/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.ast;

import java.lang.reflect.Type;
import java.util.Hashtable;
import java.util.Vector;

/**
 * Scope for a type, maybe contains fields and other scopes -> slots
 * @author tcolar
 */
public class FanTypeScope extends FanAstScope
{
	private Vector<FanAstScope> slots = new Vector<FanAstScope>();

	public FanTypeScope(FanRootScope parent)
	{
		super(parent);
	}
}