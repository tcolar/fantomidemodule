/*
 * Thibaut Colar Feb 23, 2010
 */
package net.colar.netbeans.fan.parboiled;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import net.colar.netbeans.fan.scope.FanAstScopeVar;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase.VarKind;
import net.colar.netbeans.fan.types.FanResolvedType;
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
	/** Node text */
	private final String text;
	/** Children AST nodes */
	private List<AstNode> children = new ArrayList<AstNode>();
	/** Parent AST Node*/
	private AstNode parent;
	/**scope variables table (hash) - Null if not a scoping Node*/
	private Hashtable<String, FanAstScopeVarBase> scopeVars = null;
	/**Type of this node (say 'Str' or 'Bool') - used for completion, etc...*/
	private FanResolvedType type;

	public AstNode(AstKind kind, String path, Node<AstNode> parseNode, String nodeText)
	{
		this.parseNode = parseNode;
		this.kind = kind;
		this.parsePath = path;
		this.text = nodeText;
		// start unresolved, but ParserTask will fill it in.
		this.type=FanResolvedType.makeUnresolved(this);
	}

	@Override
	public String toString()
	{
		//ParseTreeUtils.getNodeText(parseNode, null)
		String txt = text;
		if (txt.indexOf("\n") > 0)
		{
			txt = txt.substring(0, txt.indexOf("\n")) + "...";
		}
		String scope = "";
		if (isScopeNode())
		{
			scope = "\n\tSCOPE{";
			for (FanAstScopeVarBase var : getLocalScopeVars().values())
			{
				scope += var.toString() + "; ";
			}
			scope += "}";
		}
		String t = (type==null || !type.isResolved())?"":type.getShortAsTypedType();
		return kind + "("+t+")[" + parsePath + "] : '" + txt + "'" + scope;
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
			System.out.println(inc + nd.toString() /*+ " "+ParseTreeUtils.getNodeText(nd.getParseNode(), buffer)*/);
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
		scopeVars = new Hashtable<String, FanAstScopeVarBase>();
	}

	public boolean isScopeNode()
	{
		return scopeVars != null;
	}

	/**
	 * Return the scope vars of THIS node only.
	 */
	public Hashtable<String, FanAstScopeVarBase> getLocalScopeVars()
	{
		return scopeVars;
	}

	public Hashtable<String, FanAstScopeVarBase> getAllScopeVars()
	{
		Hashtable<String, FanAstScopeVarBase> vars = new Hashtable<String, FanAstScopeVarBase>();
		AstNode scope = FanLexAstUtils.getScopeNode(this);
		while (scope != null)
		{
			if (scope.isScopeNode())
			{
				for (FanAstScopeVarBase var : scope.getLocalScopeVars().values())
				{
					if (!vars.containsKey(var.getName()))
					{
						vars.put(var.getName(), var);
					}
				}
				// TODO: add inherited slots
			/*if (scope instanceof FanTypeScope)
				{
				Hashtable<String, FanSlot> inhSlots = ((FanTypeScope) scope).getInheritedSlots();
				for (FanSlot slot : inhSlots.values())
				{
				if (!vars.containsKey(slot.getName()))
				{
				FanResolvedType type = FanResolvedType.fromTypeSig(slot.getReturnedType());
				FanAstScopeVarBase var= null; //new FanAstScopeVar(scope, astNode, slot.getName(), type);
				vars.put(slot.getName(), var);
				}
				}
				}*/
			}
			scope = scope.getParent();
		}
		return vars;
	}

	/**
	 * Add a scope var to the closest scope.
	 * @param name
	 * @param varKind
	 * @param type
	 */
	public void addScopeVar(String name, VarKind varKind, FanResolvedType type, boolean allowDuplicates)
	{
		FanAstScopeVar var = new FanAstScopeVar(this, varKind, name, type);
		addScopeVar(var, allowDuplicates);
	}

	/**
	 * Add a scope var to the closest scope.
	 * @param name
	 * @param varKind
	 * @param type
	 */
	public void addScopeVar(FanAstScopeVarBase var, boolean allowDuplicates)
	{
		AstNode scopeNode = FanLexAstUtils.getScopeNode(this);
		if (scopeNode == null)
		{
			return;
		}
		if ( !allowDuplicates && scopeNode.getLocalScopeVars().containsKey(var.getName()))
		{
			getRoot().getParserTask().addError("Duplicated variable in scope: " + var.getName(), this);
		}
		scopeNode.getLocalScopeVars().put(var.getName(), var);
	}

	public RootNode getRoot()
	{
		AstNode nd = this;
		while (nd != null)
		{
			if (nd instanceof RootNode)
			{
				return (RootNode) nd;
			}
			nd = nd.getParent();
		}
		return null;
	}

	/**
	 * Get the text content of the node
	 * @param node
	 * @return
	 */
	public String getNodeText(boolean strip)
	{
		//TODO: work on stripping comments and son on
		return strip ? text.trim() : text;
	}

	public void setType(FanResolvedType type)
	{
		this.type=type;
	}

	public FanResolvedType getType()
	{
		return type;
	}
}
