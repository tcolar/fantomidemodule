/*
 * Thibaut Colar Feb 5, 2010
 */
package net.colar.netbeans.fan.parboiled;

import net.colar.netbeans.fan.FanParserTask;
import org.parboiled.BaseActions;
import org.parboiled.Node;

/**
 * Utility actions for creating Parser AST nodes.
 * @author thibautc
 */
public class FantomParserAstActions extends BaseActions<AstNode>
{

  int id = 1;

  /**
   * Store temp. orphaned(no parent) node while the AST is being built (bottom-up)
   */
  //public List<AstNode> orphanNodes = new ArrayList<AstNode>();
  /**
   * Utility to create a new AST Node from the last parsed Node (LAT_NODE())
   * The new ASTNode gets set as the Value() of the parseNode (set())
   * The new Node gets properly linked with it's parent/children Nodes automatically
   * @param name
   * @return
   */
  public boolean newNode(AstKind kind)
  {
    Node<AstNode> parseNode = lastNode();
    //System.out.println("New node:"+id+" "+kind);
    AstNode node = new AstNode(id++, kind, getPath(), parseNode, lastText());
    set(node);
    //System.out.println(node+" : "+lastText());
    return true;
  }

  /**
   * Create a node that defines a scope (holds scope vars)
   * @param kind
   * @return
   */
  public boolean newScopeNode(AstKind kind)
  {
    Node<AstNode> parseNode = lastNode();
    //System.out.println("New scope node:"+id+" "+kind);
    AstNode node = new AstNode(id++, kind, getPath(), parseNode, lastText());
    node.setIsScopeNode();
    set(node);
    return true;
  }

  /**
   * Create the root node
   * @param kind
   * @return
   */
  public boolean newRootNode(AstKind kind, FanParserTask task)
  {
    Node<AstNode> parseNode = lastNode();
    RootNode node = new RootNode(kind, getPath(), parseNode, task);
    node.setIsScopeNode();
    set(node);
    return true;
  }

  public static void linkNodes(Node<AstNode> rootNode, AstNode astRoot)
  {
    if (rootNode == null || astRoot == null)
    {
      return;
    }
    for (Node<AstNode> sub : rootNode.getChildren())
    {
      AstNode astNode = sub.getValue();
      //System.out.println("nd: "+astNode);
      if (astNode != null)
      {
        // In parboiled getValue 'bubbles up' the value from teh children, we want to connect the 'actual' value node
        boolean skip = false;
        int id = astNode.getId();
        for(Node<AstNode> baby : sub.getChildren())
        {
          if(baby.getValue()!=null && baby.getValue().getId() == id)
            skip = true;
        }
        // If this is a bubbled up value, just keep going down the tree
        if ( skip )
        {
          linkNodes(sub, astRoot);
        }
        else
        {
          // Otherwise link the AST child & parent together
          astRoot.addChild(astNode);
          astNode.setParent(astRoot);
          linkNodes(sub, astNode);
        }
      }
    }
  }

  public String getPath()
  {
    return getContext().getPath().toString() + "/" + lastNode().getLabel();
  }
}
