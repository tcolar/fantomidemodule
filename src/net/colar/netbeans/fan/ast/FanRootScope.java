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
	private Hashtable<String, Type> usedTypes = new Hashtable<String, Type>();
	// types (classes/enums/mixins)
	private Vector<FanAstScope> types = new Vector<FanAstScope>();

	public FanRootScope()
	{
		super(null);
	}

	public void addUsedType(String name, Type type)
	{
		usedTypes.put(name, type);
	}

	public void addType(FanAstScope type)
	{
		if(type!=null)
			types.add(type);
	}

	public Hashtable<String, Type> getUsedTypes()
	{
		return usedTypes;
	}

	public void dump()
	{
		System.out.println("---Root Scope---");
		for(String key : usedTypes.keySet())
		{
			System.out.println("Using: "+key+" ("+usedTypes.get(key)+")");
		}
		for(FanAstScope node : types)
		{
			node.dump();
		}
	}
}
