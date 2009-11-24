/*
 * Thibaut Colar Nov 24, 2009
 */

package net.colar.netbeans.fan.ast;

import fan.sys.Type;
import java.util.Hashtable;
import java.util.Vector;

/**
 * RootScope for a Fan file
 * @author thibautc
 */
public class FanRootScope extends FanAstScope
{
	// using statements. type=null means unresolvable
	private Hashtable<String, Type> usedPods;
	// types
	private Vector<FanAstScope> types;

	public FanRootScope()
	{
		super(null);
	}

	public void addUsedPod(String name, Type type)
	{
		usedPods.put(name, type);
	}

	public void addType(FanAstScope type)
	{
		types.add(type);
	}

	public Hashtable<String, Type> getUsedPods()
	{
		return usedPods;
	}

	public void dump()
	{
		System.out.println("---Root Scope---");
		for(String key : usedPods.keySet())
		{
			System.out.println("Using: "+key+" ("+usedPods.get(key)+")");
		}
		for(FanAstScope node : types)
		{
			node.dump();
		}
	}
}
