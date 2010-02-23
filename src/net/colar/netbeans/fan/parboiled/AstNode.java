/*
 * Thibaut Colar Feb 23, 2010
 */

package net.colar.netbeans.fan.parboiled;

import java.util.Arrays;
import java.util.List;
import org.parboiled.trees.ImmutableTreeNode;

/**
 *
 * @author thibautc
 */
public class AstNode extends ImmutableTreeNode<AstNode>
{
	private String value = null;
	private final String name;

	public AstNode(String name, List<AstNode> children)
	{
		super(children);
		this.name=name;
	}

	public AstNode(String name, AstNode... children)
	{
		this(name, Arrays.asList(children));
	}

	public AstNode(String name, String value)
	{
		this(name, (List)null);
		this.value=value;
	}

	@Override
	public String toString()
	{
		return value==null?
			  ("{"+name+"}")
			: ("["+name+"] : \""+value+"\"");
	}

}
