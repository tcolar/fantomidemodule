/*
 * Thibaut Colar Feb 23, 2010
 */
package net.colar.netbeans.fan.parboiled;

import java.util.ArrayList;
import java.util.List;
import org.parboiled.Node;
import org.parboiled.support.InputLocation;
import org.parboiled.support.ParseTreeUtils;
import org.parboiled.trees.GraphUtils;
import org.parboiled.trees.TreeUtils;

/**
 *
 * @author thibautc
 */
public class AstNode
{

	private final Node<AstNode> parseNode;
	private final String name;
	private final String path;
	private List<AstNode> children = new ArrayList<AstNode>();
	private AstNode parent;

	public AstNode(String name, String path, Node<AstNode> parseNode)
	{
		this.parseNode = parseNode;
		this.name = name;
		this.path=path;
	}

	@Override
	public String toString()
	{
		//ParseTreeUtils.getNodeText(parseNode, null)
		return name + (parseNode==null?"":"[" +  parseNode.getLabel() + "] - ") + path;
	}

	public String getPath()
	{
		return path;
	}

	public String getLabel()
	{
		return parseNode.getLabel();
	}

	public InputLocation getStartLocation()
	{
		return parseNode.getStartLocation();
	}

	public InputLocation getEndLocation()
	{
		return parseNode.getEndLocation();
	}

	public AstNode getValue()
	{
		return parseNode.getValue();
	}

	public AstNode getParent()
	{
		return parent;
	}

	public List<AstNode> getChildren()
	{
		return children;
	}

	void addChild(AstNode nd)
	{
		children.add(nd);
	}

	void removeChild(AstNode nd)
	{
		children.remove(nd);
	}

	public static void printNodeTree(AstNode nd, String inc)
	{
		if (nd != null)
		{
			System.out.println(inc+nd.toString());
			for (AstNode subNode : nd.getChildren())
			{
				printNodeTree(subNode, inc + "  ");
			}
		}
	}
}
