/*
 * Thibaut Colar Nov 6, 2009
 */
package net.colar.netbeans.fan.indexer;

import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author thibautc
 */
public class FanIndexItem
{
	private Hashtable<TYPE, Vector<String>> store = new Hashtable();
	public enum TYPE {ID, MODIFIERS, INHERITANCE, TYPE};

	public void addItem(TYPE type, String value)
	{
		Vector<String> v = new Vector();
		if (store.containsKey(type))
		{
			v = store.get(type);
		}
		v.add(value);
		store.put(type, v);
	}

	public List<String> getItems(TYPE type)
	{
		if( ! store.containsKey(type))
			return Collections.EMPTY_LIST;
		return store.get(type);
	}

	public String toString(TYPE type, String separator)
	{
		StringBuilder sb=new StringBuilder();
		for(String str : getItems(type))
		{
			sb=sb.append(str).append(separator);
		}
		return sb.toString();
	}

	public String toString(TYPE type)
	{
		return toString(type, " ");
	}
}
