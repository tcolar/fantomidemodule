/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.parboiled;

import java.util.List;
import org.parboiled.Context;
import org.parboiled.Node;
import org.parboiled.support.InputBuffer;
import org.parboiled.support.ParseTreeUtils;

/**
 * Static Parboiled Utilities
 * Tree scanning etc...
 * @author tcolar
 */
public class ParboiledUtils
{
	private ParboiledUtils(){}

	/**
	 * Find the "last"(most recent) non-empty node found in this context
	 * @param ctx
	 * @param buffer
	 * @return
	 */
	public static Node getLastNonEmptyNode(Context ctx, InputBuffer buffer)
	{
		// scan up the context tree until we find one that contains a non empty node
		while (ctx != null)
		{
			List<Node> nodes = ctx.getSubNodes();
			// we start with most recent nodes first (right to left)
			for (int i = nodes.size() - 1; i >= 0; i--)
			{
				Node node = nodes.get(i);
				String text = ParseTreeUtils.getNodeText(node, buffer);
				if (text != null && text.length() > 0)
				{
					// we found a node with content, no find the narrowest piece of the node
					return getLastNonEmptyNode(node, buffer);
				}
			}
			ctx = ctx.getParent();
		}
		return null;
	}

	/*
	 * Find the smallest(leaf) and most recent non-empty sunode of this node
	 */
	public static Node getLastNonEmptyNode(Node node, InputBuffer buffer)
	{
		String t = ParseTreeUtils.getNodeText(node, buffer);
		if (t == null || t.length() == 0)
		{
			return null;
		}

		List<Node> nodes = node.getChildren();
		// find most recent node with content(left to right)
		for (int i = nodes.size() - 1; i >= 0; i--)
		{
			Node nd = nodes.get(i);
			String text = ParseTreeUtils.getNodeText(node, buffer);
			if (text != null && text.length() > 0)
			{
				// recurse until we find smallest entity
				return getLastNonEmptyNode(nd, buffer);
			}
		}
		return node;
	}
}