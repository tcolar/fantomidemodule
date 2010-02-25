/*
 * Thibaut Colar Feb 23, 2010
 */
package net.colar.netbeans.fan.parboiled;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import org.parboiled.Node;
import org.parboiled.support.InputBuffer;
import org.parboiled.support.InputLocation;

/**
 * This is the AST node, it's linked to it's parent and children AST Node
 * It also has a reference to the ParseNode it was created from
 * The parseNode has a cross reference to it's AstNode through (getValue)
 * So we can go back and force between parseNode and AstNode easily.
 * @author thibautc
 */
public class AstNode
{
	/** Reference to the parse Node, this AST node was created from*/
	private final Node<AstNode> parseNode;
	/** ParseNode path*/
	private final String parsePath;
	/** kind of this AST Node*/
	private final AstKind kind;
	/** Children AST nodes */
	private List<AstNode> children = new ArrayList<AstNode>();
	/** Parent AST Node*/
	private AstNode parent;
	/**scope var table (hash) - Null if not a scoping Node*/
	private Hashtable scopeVars = null;

	public AstNode(AstKind kind, String path, Node<AstNode> parseNode)
	{
		this.parseNode = parseNode;
		this.kind = kind;
		this.parsePath=path;
	}

	@Override
	public String toString()
	{
		//ParseTreeUtils.getNodeText(parseNode, null)
		return kind +(scopeVars!=null?"(Scope)":"") + (parseNode==null?"":"[" +  parseNode.getLabel() + "] - ") + parsePath;
	}

	public String getParsePath()
	{
		return parsePath;
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

	public static void printNodeTree(AstNode nd, String inc, InputBuffer buffer)
	{
		if (nd != null)
		{
			System.out.println(inc+nd.toString() /*+ " "+ParseTreeUtils.getNodeText(nd.getParseNode(), buffer)*/);
			for (AstNode subNode : nd.getChildren())
			{
				printNodeTree(subNode, inc + "  ", buffer);
			}
		}
	}

	void setParent(AstNode node)
	{
		this.parent = node;
	}

	public AstKind getKind()
	{
		return kind;
	}

	public Node<AstNode> getParseNode()
	{
		return parseNode;
	}

	public void setIsScopeNode()
	{
		scopeVars = new Hashtable();
	}

}
