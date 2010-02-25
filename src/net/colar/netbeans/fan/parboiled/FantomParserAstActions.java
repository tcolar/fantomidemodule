/*
 * Thibaut Colar Feb 5, 2010
 */
package net.colar.netbeans.fan.parboiled;

import java.util.ArrayList;
import java.util.List;
import org.parboiled.BaseActions;
import org.parboiled.Node;

/**
 * Utility actions for creating Parser AST nodes.
 * @author thibautc
 */
public class FantomParserAstActions extends BaseActions<AstNode>
{
	/**
	 * Store temporarely orphaned(no parent) node while the AST is being built (bottom-up)
	 */
	private List<AstNode> orphanNodes = new ArrayList<AstNode>();

	/**
	 * Utility to create a new AST Node form the last parsed Node (LAT_NODE())
	 * The new ASTNode gets set as the Value() of the parseNode (SET())
	 * The new Node gets properly linked with it's parent/children Nodes automatically
	 * @param name
	 * @return
	 */
	public boolean newNode(AstKind kind)
	{
		Node<AstNode> parseNode = LAST_NODE();
		AstNode node = new AstNode(kind, getContext().getPath(), parseNode);
		//System.out.println("New node: "+node);
		// Add the node into the tree
		// Note: The AST tree is built bootom - up.
		List<AstNode> newOrphans = new ArrayList<AstNode>();
		for(AstNode nd : orphanNodes)
		{
			if (nd.getParsePath().length() > node.getParsePath().length() && nd.getParsePath().startsWith(node.getParsePath()))
			{
				//System.out.println("Linking node: "+nd+ " to "+node);
				nd.setParent(node);
				node.addChild(nd);
			}
			else
			{
				//System.out.println("Keeping sibbling node: "+nd);
				newOrphans.add(nd);
			}
		}
		newOrphans.add(node);
		orphanNodes = newOrphans;
		// Reference ast node from parseNode(LAST_NODE) - using setValue()
		SET(node);
		return true;
	}
}
