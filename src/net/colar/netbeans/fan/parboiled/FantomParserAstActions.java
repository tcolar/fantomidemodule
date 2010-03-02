/*
 * Thibaut Colar Feb 5, 2010
 */
package net.colar.netbeans.fan.parboiled;

import java.util.ArrayList;
import java.util.List;
import net.colar.netbeans.fan.FanParserTask;
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
		linkNode(node);
		SET(node);
		return true;
	}

		/**
	 * Create a node that defines a scope (holds scope vars)
	 * @param kind
	 * @return
	 */
	public boolean newScopeNode(AstKind kind)
	{
		Node<AstNode> parseNode = LAST_NODE();
		AstNode node = new AstNode(kind, getContext().getPath(), parseNode);
		node.setIsScopeNode();
		linkNode(node);
		SET(node);
		return true;
	}

	/**
	 * Create the root node
	 * @param kind
	 * @return
	 */
	public boolean newRootNode(AstKind kind, FanParserTask task)
	{
		Node<AstNode> parseNode = LAST_NODE();
		RootNode node = new RootNode(kind, getContext().getPath(), parseNode, task);
		node.setIsScopeNode();
		linkNode(node);
		SET(node);
		return true;
	}

	/**
	 * Maintain node links (to parents / children / parsenode)
	 * @param node
	 */
	private void linkNode(AstNode node)
	{
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
	}

}
