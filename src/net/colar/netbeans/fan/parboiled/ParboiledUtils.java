/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.parboiled;

import org.parboiled.Node;
import org.parboiled.support.LabelPrefixPredicate;
import org.parboiled.support.ParseTreeUtils;

/**
 * Static Parboiled Utilities
 * Tree scanning etc...
 * @author tcolar
 */
public class ParboiledUtils
{
	private ParboiledUtils(){}



	public static Node findFirstChildByLabel(Node parent, String label)
	{
		//return ParseTreeUtils.findNode(parent, new FindFirstByLabelPredicate(label));
		return ParseTreeUtils.findNode(parent, new LabelPrefixPredicate(label));
	}

}
