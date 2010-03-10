/*
 * Thibaut Colar Mar 2, 2010
 */
package net.colar.netbeans.fan.scope;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.indexer.model.FanSlot;
import net.colar.netbeans.fan.indexer.model.FanType;
import net.colar.netbeans.fan.parboiled.AstKind;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.parboiled.pred.NodeKindPredicate;
import net.colar.netbeans.fan.types.FanResolvedType;

/**
 *
 * @author thibautc
 */
public class FanTypeScopeVar extends FanAstScopeVarBase
{
	// qualified Name

	String qName = "";
	List<FanResolvedType> inheritedItems = new ArrayList<FanResolvedType>();
	// To make it faster to lokup vars
	Hashtable<String, FanSlot> inheritedSlots = new Hashtable<String, FanSlot>();

	public FanTypeScopeVar(AstNode typeDefNode, String name)
	{
		super(typeDefNode, name);
	}

	public void parse()
	{
		if (node == null)
		{
			return;
		}
		if (FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_CLASS)) != null)
		{
			kind = VarKind.TYPE_CLASS;

		} else if (FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_ENUM)) != null)
		{ //TODO: Deal with enum val defs ?
			kind = VarKind.TYPE_ENUM;

		} else if (FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_FACET)) != null)
		{
			kind = VarKind.TYPE_FACET;

		} else if (FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_MIXIN)) != null)
		{
			kind = VarKind.TYPE_MIXIN;
		}
		AstNode nameNode = FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_ID));
		AstNode inheritance = FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_INHERITANCE));

		if (nameNode != null)
		{
			name = nameNode.getNodeText(true);
		}
		qName = node.getRoot().getPod() + "::" + name;

		List<AstNode> modifs = FanLexAstUtils.getChildren(node, new NodeKindPredicate(AstKind.AST_MODIFIER));
		for (AstNode m : modifs)
		{
			String[] mStrs = m.getNodeText(true).split(" ");
			for (String mStr : mStrs)
			{
				FanAstScopeVarBase.ModifEnum modif = FanAstScopeVarBase.parseModifier(mStr.trim());
				if (modif != null)
				{
					modifiers.add(modif);
				}
			}
		}

		// Deal with ineritance
		parseInheritance(inheritance);
		// "cache" inherited slots, for faster var lookup later
		List<FanSlot> slots = FanSlot.getAllSlotsForType(qName, true);
		for (FanSlot slot : slots)
		{
			inheritedSlots.put(slot.getName(), slot);
		}

		// Deal with children - slots		
		AstNode blockNode = FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_BLOCK));
		if(blockNode==null)
			return;
		for (AstNode slot : blockNode.getChildren())
		{
			switch (slot.getKind())
			{
				case AST_SLOT_DEF:
					List<String> slotModifs = new ArrayList<String>();
					FanFieldScopeVar slotVar = null;
					for (AstNode child : slot.getChildren())
					{
						String slotName = FanLexAstUtils.getFirstChildText(child, new NodeKindPredicate(AstKind.AST_ID));
						switch (child.getKind())
						{
							// could be multiple modifiers, but only one of either field, ctor, method
							case AST_MODIFIER:
								//Protection is "outside" of field_def/method_def
								slotModifs.add(child.getNodeText(true));
								break;
							case AST_FIELD_DEF:
								slotVar = new FanFieldScopeVar(child, slotName);
								break;
							case AST_METHOD_DEF:
							case AST_CTOR_DEF:
								slotVar = new FanMethodScopeVar(child, slotName, child.getKind() == AstKind.AST_CTOR_DEF);
								break;
						}
					}
					// Add the "outer" modifiers(protection) to the slotVar and save it in scope.
					for (String modif : slotModifs)
					{
						if (slotVar != null)
						{
							slotVar.addModifiers(modif);
						} else
						{
							node.getRoot().getParserTask().addError("Orphaned modifier in slot.", slot);
						}
					}
					if (slotVar != null) //shouldn't be
					{
						node.addScopeVar(slotVar);
					}
			}
		}
	}

	private boolean hasInheritedClass()
	{
		for (FanResolvedType type : inheritedItems)
		{
			if (!type.isResolved() && type.getDbType().isClass())
			{
				return true;
			}
		}
		return false;
	}

	private boolean hasInheritedItem(String qualifiedName)
	{
		for (FanResolvedType type : inheritedItems)
		{
			if (type.getAsTypedType().equals(qualifiedName))
			{
				return true;
			}
		}
		return false;
	}

	private void parseInheritance(AstNode inheritance)
	{
		if (inheritance != null)
		{
			List<AstNode> children = FanLexAstUtils.getChildren(inheritance, new NodeKindPredicate(AstKind.AST_TYPE));
			for (AstNode child : children)
			{
				FanResolvedType inhType = FanResolvedType.fromTypeSig(child, child.getNodeText(true));
				String text = node.getNodeText(true);
				if (!inhType.isResolved())
				{
					node.getRoot().getParserTask().addError("Unresolved inherited item : "+child.getNodeText(true), child);
				} else
				{
					FanType fanType = inhType.getDbType();
					if (fanType.isFinal())
					{
						// this covers enums too
						node.getRoot().getParserTask().addError("Can't inherit from a final class : "+child.getNodeText(true), child);
					} else if (fanType.isClass())
					{
						if (hasInheritedClass())
						{
							node.getRoot().getParserTask().addError("Can only inherit from one class !", inheritance);
						}
					}
				}
				if (!hasInheritedItem(text))
				{
					inheritedItems.add(inhType);
				}
			}
		}
	}

	public List<FanResolvedType> getInheritedItems()
	{
		return inheritedItems;
	}

	public Hashtable<String, FanSlot> getInheritedSlots()
	{
		return inheritedSlots;
	}
}
