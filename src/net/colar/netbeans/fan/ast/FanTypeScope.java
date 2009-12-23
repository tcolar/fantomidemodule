/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.ast;

import fan.sys.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.ast.FanAstScopeVarBase.ModifEnum;
import org.antlr.runtime.tree.CommonTree;

/**
 * Scope for a Type (class, enum, mixin)
 * @author tcolar
 */
public class FanTypeScope extends FanAstScope
{

	public enum TypeKind
	{

		CLASS(1), MIXIN(2), ENUM(3);
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
	List<FanAstResolvedType> inheritedMixins = new ArrayList<FanAstResolvedType>();
	// TODO: inherited superclass if any (there can be only one)
	FanAstResolvedType superClass = null;
	// kind of type
	TypeKind kind = TypeKind.CLASS;
	// modifiers
	protected ArrayList<FanAstScopeVarBase.ModifEnum> modifiers = new ArrayList<FanAstScopeVarBase.ModifEnum>();

	public FanTypeScope(FanRootScope parent, CommonTree ast)
	{
		super(parent, ast);
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

		System.out.println("Type node: " + ast.toStringTree());
		CommonTree nameNode = (CommonTree) ast.getFirstChildWithType(FanParser.AST_ID);
		CommonTree inheritance = (CommonTree) ast.getFirstChildWithType(FanParser.AST_INHERITANCE);
		// fields are within the code_block of the type
		CommonTree content = (CommonTree) ast.getFirstChildWithType(FanParser.AST_CODE_BLOCK);

		if (nameNode != null)
		{
			name = FanLexAstUtils.getNodeContent(getRoot().getParserResult(), nameNode);
		}

		List<CommonTree> modifs = FanLexAstUtils.getAllChildrenWithType(ast, FanParser.AST_MODIFIER);
		for (CommonTree m : modifs)
		{
			FanAstScopeVarBase.ModifEnum modif = FanAstScopeVarBase.parseModifier(FanLexAstUtils.getNodeContent(getRoot().getParserResult(), m).trim());
			if (modif != null)
			{
				modifiers.add(modif);
			}
		}

		// Deal with ineritance
		parseInheritance(inheritance);

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
					if (field.getResolvedType().isUnresolved())
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

		qName = getPod() + "::" + name;
		//serialize();
	}

	private void parseInheritance(CommonTree inheritance)
	{
		if (inheritance != null && inheritance.getChildCount() > 0)
		{
			List<CommonTree> children = (List<CommonTree>) inheritance.getChildren();
			for (CommonTree child : children)
			{
				if (child != null && child.getType() == FanParser.AST_ID)
				{
					FanAstResolvedType inhType = FanAstResolvResult.makeFromSimpleType(this, child).getType();
					inhType.setTypeText(child.getText());
					if (!inhType.isUnresolved())
					{
						Type fanType = inhType.getType();
						if (fanType.isFinal())
						{
							// this covers enums too
							getRoot().addError("Can't inherit from a final class!", child);
						} else if (fanType.isClass())
						{
							if (superClass == null)
							{
								superClass = inhType;
							} else
							{
								getRoot().addError("Can only inherit from one class!", inheritance);
							}
						} else
						{
							// must be a mixin
							inheritedMixins.add(inhType);
						}
					} else
					{
						getRoot().addError("Unresolved inherited item!", child);
					}
				}
			}
		}
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

	public List<FanAstResolvedType> getInheritedMixins()
	{
		return inheritedMixins;
	}

	public ArrayList<ModifEnum> getModifiers()
	{
		return modifiers;
	}

	public FanAstResolvedType getSuperClass()
	{
		return superClass;
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
		if(hasModifier(ModifEnum.PRIVATE))
			return ModifEnum.PRIVATE.value();
		if(hasModifier(ModifEnum.PROTECTED))
			return ModifEnum.PROTECTED.value();
		if(hasModifier(ModifEnum.INTERNAL))
			return ModifEnum.INTERNAL.value();
		// default is public
		return ModifEnum.PUBLIC.value();
	}

	public Iterable<FanAstResolvedType> getAllInheritedItems()
	{
		// TODO: lazy cache ?
		List items = new ArrayList(getInheritedMixins());
		if(superClass!=null)
			items.add(superClass);
		return items;
	}


}
