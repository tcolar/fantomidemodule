/*
 * Thibaut Colar Feb 5, 2010
 */
package net.colar.netbeans.fan.parboiled;

import java.util.ArrayList;
import java.util.List;
import org.parboiled.BaseActions;

/**
 *
 * @author thibautc
 */
public class FantomParserActions extends BaseActions<AstNode>
{

	public AstNode rootNode = new AstNode("AST_ROOT", "/", null);
	/*public boolean newNode(String name, Node<AstNode> parserNode) {
	new AstNode(name, parserNode);
	return true;
	}*/

	public boolean newNode(String name)
	{
		AstNode node = new AstNode(name, getContext().getPath(), LAST_NODE());
		addNodeToTree(node);
		//System.out.println("==== Ast Tree >");
		//AstNode.printNodeTree(rootNode, "");
		//System.out.println("==== Ast Tree <");
		return true;
	}

	/**
	 * TODO, not efficient
	 * @param node
	 */
	private void addNodeToTree(AstNode node)
	{
		// this is being built bottom - up
		String path = node.getPath();
		List<AstNode> toBeMoved = new ArrayList<AstNode>();
		for (AstNode nd : rootNode.getChildren())
		{
			if (nd.getPath().length()>  path.length() && nd.getPath().startsWith(path))
			{
				//System.out.println("Will move: "+nd.getPath()+" into "+path);
				toBeMoved.add(nd);
			}
		}
		for (AstNode nd : toBeMoved)
		{
			node.addChild(nd);
			rootNode.removeChild(nd);
		}
		// whatever left in rootNode should be a sibling
		rootNode.addChild(node);
	}
}
