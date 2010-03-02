/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.ast;

import net.colar.netbeans.fan.parboiled.FanLexAstUtils;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase.ModifEnum;
import net.colar.netbeans.fan.indexer.model.FanSlot;
import net.colar.netbeans.fan.types.FanResolvedType;
import net.colar.netbeans.fan.indexer.model.FanType;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase;
import org.antlr.runtime.tree.CommonTree;

/**
 * Scope for a Type (class, enum, mixin)
 * @author tcolar
 */
@Deprecated
public class FanTypeScope extends FanAstScope
{

	public enum TypeKind
	{

		CLASS(1), MIXIN(2), ENUM(3),
		JAVA_CLASS(21), JAVA_INTERFACE(22), JAVA_ANNOTATION(23), JAVA_ENUM(24);
		int val;

		private TypeKind(int i)
		{
			val = i;
		}

		public int value()
		{
			return val;
		}
	}
	String name = "";
	// qualified Name
	String qName = "";
	List<FanResolvedType> inheritedItems = new ArrayList<FanResolvedType>();
	// kind of type
	TypeKind kind = TypeKind.CLASS;
	// modifiers
	protected ArrayList<FanAstScopeVarBase.ModifEnum> modifiers = new ArrayList<FanAstScopeVarBase.ModifEnum>();
	// To make it faster to lokup vars
	Hashtable<String, FanSlot> inheritedSlots = new Hashtable<String, FanSlot>();

	public FanTypeScope(FanRootScope parent, CommonTree ast)
	{
		super(parent/*, ast*/);
	}

	protected void parse()
	{
		CommonTree ast = getAstNode();
		if (ast == null)
		{
			return;
		}
		if (ast.getType() == FanParser.AST_MIXIN)
		{
			kind = TypeKind.MIXIN;
		} else if (ast.getType() == FanParser.AST_ENUM)
		{
			kind = TypeKind.ENUM;
		}

		//FanUtilities.GENERIC_LOGGER.info("Type node: " + ast.toStringTree());

		CommonTree nameNode = (CommonTree) ast.getFirstChildWithType(FanParser.AST_ID);
		CommonTree inheritance = (CommonTree) ast.getFirstChildWithType(FanParser.AST_INHERITANCE);
		// fields are within the code_block of the type
		CommonTree content = (CommonTree) ast.getFirstChildWithType(FanParser.AST_CODE_BLOCK);

		if (nameNode != null)
		{
			name = FanLexAstUtils.getNodeContent(getRoot().getParserResult(), nameNode);
		}
		qName = getPod() + "::" + name;

		List<CommonTree> modifs = FanLexAstUtils.getAllChildrenWithType(ast, FanParser.AST_MODIFIER);
		for (CommonTree m : modifs)
		{
			String[] mStrs = FanLexAstUtils.getNodeContent(getRoot().getParserResult(), m).split(" ");
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
		for(FanSlot slot : slots)
		{
			inheritedSlots.put(slot.getName(), slot);
		}


		// Deal with children - slots
		List<CommonTree> children = (List<CommonTree>) content.getChildren();
		if (children == null)
		{
			return;
		}
		for (CommonTree child : children)
		{
			switch (child.getType())
			{
				case FanParser.AST_FIELD:
					FanAstField field = new FanAstField(this, child);
					if (!field.getType().isResolved())
					{
						//TODO: Propose to auto-add using statements (Hints)
						getRoot().addError("Unresolved field type", child);
					}
					addScopeVar(field, false);
					break;
				case FanParser.AST_METHOD:
				case FanParser.AST_CONSTRUCTOR:
					FanAstMethod method = new FanAstMethod(this, child, child.getType() == FanParser.AST_CONSTRUCTOR);
					addScopeVar(method, false);
					break;
			}
		}

		//serialize();
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

	private void parseInheritance(CommonTree inheritance)
	{
		/*if (inheritance != null && inheritance.getChildCount() > 0)
		{
			List<CommonTree> children = (List<CommonTree>) inheritance.getChildren();
			for (CommonTree child : children)
			{
				if (child != null && child.getType() == FanParser.AST_TYPE)
				{
					FanResolvedType inhType = FanResolvedType.makeFromTypeSig(this, child);
					String text = FanLexAstUtils.getNodeContent(getRoot().getParserResult(), child);
					// WATCHME inhType.setTypeText(text);
					if (!inhType.isResolved())
					{
						getRoot().addError("Unresolved inherited item!", child);
					} else
					{
						FanType fanType = inhType.getDbType();
						if (fanType.isFinal())
						{
							// this covers enums too
							getRoot().addError("Can't inherit from a final class!", child);
						} else if (fanType.isClass())
						{
							if (hasInheritedClass())
							{
								getRoot().addError("Can only inherit from one class!", inheritance);
							}
						}
					}
					if (!hasInheritedItem(text))
					{
						inheritedItems.add(inhType);
					}
				}
			}
		}*/
	}

	public String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("Type : ").append(name);
		return sb.toString();
	}

	public TypeKind getKind()
	{
		return kind;
	}

	public void serialize()
	{
		//System.out.println("Encoded: "+FanCustomObjEncoder.encode(this));
	}

	public List<FanResolvedType> getInheritedItems()
	{
		return inheritedItems;
	}

	public ArrayList<ModifEnum> getModifiers()
	{
		return modifiers;
	}

	/**
	 * Qualified name
	 * @return
	 */
	public String getQName()
	{
		return qName;
	}

	public boolean hasModifier(ModifEnum modifier)
	{
		return modifiers.contains(modifier);
	}

	public String getPod()
	{
		return getRoot().getPod();
	}

	public int getProtection()
	{
		if (hasModifier(ModifEnum.PRIVATE))
		{
			return ModifEnum.PRIVATE.value();
		}
		if (hasModifier(ModifEnum.PROTECTED))
		{
			return ModifEnum.PROTECTED.value();
		}
		if (hasModifier(ModifEnum.INTERNAL))
		{
			return ModifEnum.INTERNAL.value();
		}
		// default is public
		return ModifEnum.PUBLIC.value();
	}

	public FanResolvedType getSuperClass()
	{
		for (FanResolvedType item : inheritedItems)
		{
			if (item.getDbType().isClass())
			{
				return item;
			}
		}
		// default is Object
		return new FanResolvedType("sys::Obj");
	}

	public Hashtable<String, FanSlot> getInheritedSlots()
	{
		return inheritedSlots;
	}

	
}
