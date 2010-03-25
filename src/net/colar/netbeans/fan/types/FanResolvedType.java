/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.types;

import java.lang.reflect.Member;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.indexer.FanIndexer;
import net.colar.netbeans.fan.indexer.FanIndexerFactory;
import net.colar.netbeans.fan.indexer.model.FanSlot;
import net.colar.netbeans.fan.indexer.model.FanType;
import net.colar.netbeans.fan.indexer.model.FanTypeInheritance;
import net.colar.netbeans.fan.parboiled.AstKind;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.parboiled.pred.NodeKindPredicate;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase.VarKind;
import net.colar.netbeans.fan.scope.FanTypeScopeVar;

/**
 * Resolved type
 * Store infos of a resolved type
 * Also contains the factory methods / logic to resolve a type expr.
 * @author tcolar
 */
public class FanResolvedType
{

	private final String asTypedType;
	private final FanType dbType;
	// whether it's used in a  nullable context : ex: Str? vs Str
	private boolean nullableContext = false;
	// whether it's used in a static context: ex Str. vs str.
	private boolean staticContext = false;
	private final String shortAsTypedType;
	private final AstNode scopeNode;

	protected FanResolvedType(AstNode scopeNode, String enteredType, FanType type)
	{
		this.scopeNode = scopeNode;
		this.asTypedType = enteredType;
		shortAsTypedType = asTypedType.indexOf("::") != -1 ? asTypedType.substring(asTypedType.indexOf("::") + 2) : asTypedType;
		dbType = type;
	}

	/**
	 * Wether it was resolved correctly or not
	 * @return
	 */
	public boolean isResolved()
	{
		return dbType != null;
	}

	/**
	 * Shortcut for dbType.getQName()
	 * @return
	 */
	public String getQualifiedType()
	{
		return dbType==null?null:dbType.getQualifiedName();
	}

	/**
	 * Return the backend Type object, this type was resolved to
	 * @return
	 */
	public FanType getDbType()
	{
		return dbType;
	}

	/**
	 * The original text we resolved this type from
	 * @return
	 */
	public String getAsTypedType()
	{
		return asTypedType;
	}

	/**
	 * The short name of the type (ie: no pod/package)
	 * @return
	 */
	public String getShortAsTypedType()
	{
		return shortAsTypedType;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(dbType == null ? "null" : toTypeSig(true)).append(" r:").append(isResolved()).append(" s:").append(isStaticContext()).append(" n:").append(isNullable());
		return sb.toString();
	}

	/**
	 * Create an unresolved type (no dbType)
	 * @param node
	 * @return
	 */
	public static FanResolvedType makeUnresolved(AstNode node)
	{
		return new FanResolvedType(node, FanIndexer.UNRESOLVED_TYPE, null);
	}

	/**
	 * Make a type from a signature (@see fromTypeSig())
	 * Add an error message to the parsertask if unresolved
	 * @param node
	 * @return
	 */
	public static FanResolvedType makeFromTypeSigWithWarning(AstNode node)
	{
		FanResolvedType result = fromTypeSig(node, node.getNodeText(true));
		if (!result.isResolved())
		{
			String type = node.getNodeText(true);
			//TODO: Propose to auto-add using statements (Hints)
			node.getRoot().getParserTask().addError("Unresolved type: " + type, node);
			FanUtilities.GENERIC_LOGGER.info("Could not resolve type: " + (node == null ? "null" : node.toString()));
		}
		return result;
	}

	/**
	 * Resolve the type of a slot of the baseType, using the DB
	 * @param baseType
	 * @param slotName
	 * @return
	 */
	public static FanResolvedType resolveSlotType(FanResolvedType baseType, String slotName)
	{
		if (baseType == null || !baseType.isResolved()
			|| baseType.dbType.getQualifiedName().equals("sys::Void")) // Void extends from object ... but not callable
		{
			return FanResolvedType.makeUnresolved(null);
		}
		if (baseType.getDbType().isJava())
		{
			// java slots
			List<Member> members = FanIndexerFactory.getJavaIndexer().findTypeSlots(baseType.getDbType().getQualifiedName());
			boolean found = false;
			// Returning the first match .. because java has overloading this could be wrong
			// However i assume overloaded methods return the same type (If it doesn't too bad, it's ugly code anyway :) )
			for (Member member : members)
			{
				if (member.getName().equalsIgnoreCase(slotName))
				{
					baseType = makeFromLocalID(baseType.scopeNode, FanIndexerFactory.getJavaIndexer().getReturnType(member));
					found = true;
					break;
				}
			}
			if (!found)
			{
				baseType = makeUnresolved(baseType.scopeNode);
			}

		} else
		{
			// Fan slots
			for (FanSlot slot : FanSlot.getAllSlotsForType(baseType.getDbType().getQualifiedName(), true))
			{
				if (slot.getName().equals(slotName))
				{
					return fromTypeSig(baseType.scopeNode, slot.returnedType);
				}
			}
			baseType = makeUnresolved(baseType.scopeNode);
		}
		return baseType;
	}

	/**
	 * Wether this is a staitc variable or an instance
	 * Example : "Str" -> 'Str' is of type Str and is a static type
	 * 'Str s' -> s is an Str too, but is not static (an instance)
	 * @return
	 */
	public boolean isStaticContext()
	{
		return staticContext;
	}

	public void setNullableContext(boolean nullable)
	{
		nullableContext = nullable;
	}

	/**
	 * Wether it's a nullable type, such as Obj?
	 * @return
	 */
	public boolean isNullable()
	{
		return nullableContext;
	}

	public void setStaticContext(boolean b)
	{
		staticContext = b;
	}

	/**
	 * Resolve the type of "this" for a specific node (within the type definition).
	 * @param node
	 * @return
	 */
	public static FanResolvedType resolveThisType(AstNode node)
	{
		AstNode typeNode = FanLexAstUtils.findParentNode(node, AstKind.AST_TYPE_DEF);
		if (typeNode != null)
		{
			return typeNode.getType();
		}
		return makeUnresolved(node);
	}

	/**
	 * Resolve the type of "super" for a given node (within type def.)
	 * ie: the superclass of the type whe are in
	 * @param node
	 * @return
	 */
	public static FanResolvedType resolveSuper(AstNode node)
	{
		AstNode typeNode = FanLexAstUtils.findParentNode(node, AstKind.AST_TYPE_DEF);
		if (typeNode != null)
		{
			String name = FanLexAstUtils.getFirstChildText(typeNode, new NodeKindPredicate(AstKind.AST_ID));
			if (name != null)
			{
				FanAstScopeVarBase var = node.getRoot().getLocalScopeVars().get(name);
				if (var != null && var instanceof FanTypeScopeVar)
				{
					if (var.getKind() == VarKind.TYPE_MIXIN || var.getKind() == VarKind.TYPE_ENUM)
					{
						node.getRoot().getParserTask().addError("Cannot use 'super' within a mixin or enum.", node);
					} else
					{
						return getParentType(var.getType());
					}
				}
			}
		}

		return makeFromDbType(node, "sys::Obj");
	}

	/**
	 * "Serialize" the type into a db signature
	 * TODO: too basic
	 * @param fullyQualified
	 * @return
	 */
	public String toTypeSig(boolean fullyQualified)
	{
		if (isResolved())
		{
			if (fullyQualified)
			{
				return dbType.getQualifiedName();
			} else
			{
				return dbType.getSimpleName();
			}
		}
		if (fullyQualified)
		{
			return getAsTypedType();
		} else
		{
			return getShortAsTypedType();
		}
	}

	/**
	 * Create type from the "Serialized" dbType
	 * ie: sys::Str   or sys::Str? or sys::Str[]?
	 * @param sig
	 * @return
	 */
	public static FanResolvedType fromTypeSig(AstNode scopeNode, String sig)
	{
		FanResolvedType type = makeUnresolved(scopeNode);
		boolean nullable = false;
		boolean list = false;
		boolean nullableList = false;
		if (sig.endsWith("?"))
		{
			sig = sig.substring(0, sig.length() - 1);
			nullable = true;
		}
		if (sig.endsWith("[]"))
		{
			sig = sig.substring(0, sig.length() - 2);
			list = true;
			if (sig.endsWith("?"))
			{
				sig = sig.substring(0, sig.length() - 1);
				nullableList = true;
			}
		}
		if (sig.startsWith("[") && sig.endsWith("]"))
		{// Full map
			sig = sig.substring(1, sig.length() - 1);
			int index = findMapSeparatorIndex(sig);
			if (index != -1 && index < sig.length() - 1)
			{
				FanResolvedType keyType = fromTypeSig(scopeNode, sig.substring(0, index).trim());
				FanResolvedType valType = fromTypeSig(scopeNode, sig.substring(index + 1).trim());
				type = new FanResolvedMapType(scopeNode, keyType, valType);
			}
		} else if (sig.startsWith("|") && sig.endsWith("|"))
		{
			Vector<FanResolvedType> types = new Vector<FanResolvedType>();
			sig = sig.substring(1, sig.length() - 1);
			// Without -1 it will drop empty strings, causing |->| to have a zero length result array.
			String[] parts = sig.split("->", -1);
			String[] typeParts = parts[0].split(",");
			for (int i = 0; i != typeParts.length; i++)
			{
				String formal = typeParts[i].trim();
				String formalType = formal;
				String formalName = "";
				int idx = formal.indexOf(" ");
				if (idx != -1)
				{
					formalType = formal.substring(0, idx).trim();
					formalName = formal.substring(idx).trim();
				}
				// TODO: types can have names like Int a, Intb -> Int
				// TODO: Make use of formalName -> will need them for scoping/completion etc...
				types.add(fromTypeSig(scopeNode, formalType));
			}
			String returnType = "Void"; // Default if not specified
			if (parts.length == 2)
			{
				returnType = parts[1].trim();
			}
			type = new FanResolvedFuncType(scopeNode, types, fromTypeSig(scopeNode, returnType));
		} else
		{	// check for simple map type like Sys:Int
			int index = findMapSeparatorIndex(sig);
			if (index != -1 && index < sig.length() - 1)
			{
				FanResolvedType keyType = fromTypeSig(scopeNode, sig.substring(0, index).trim());
				FanResolvedType valType = fromTypeSig(scopeNode, sig.substring(index + 1).trim());
				type = new FanResolvedMapType(scopeNode, keyType, valType);
			} else
			{
				// true simple type like Int or Sys::Int
				type = makeFromLocalID(scopeNode, sig);
			}
		}

		type.setStaticContext(list);
		if (nullable)
		{
			type.setNullableContext(true);
		}
		if (list)
		{
			type = new FanResolvedListType(scopeNode, type);
			if (nullableList)
			{
				type.setNullableContext(true);
			}
		}
		return type;
	}

	/**
	 * Resolve a local variable
	 * - Try a fully resolved type (from db)
	 * - Try to find in the current scope
	 * - Try to find from implicit imported types other types in same pod, sys pod
	 * - Try to resolve Genric types (L, V etc...)
	 * - Fallbnack to unresolved if failed resolving
	 * @param scopeNode
	 * @param enteredType
	 * @return
	 */
	public static FanResolvedType makeFromLocalID(AstNode scopeNode, String enteredType)
	{
		//System.out.println("Make from local type: "+enteredType);
		FanType type = null;
		boolean isStatic = true;
		if (enteredType.indexOf("::") != -1)
		{	// Qualified type
			type = FanType.findByQualifiedName(enteredType);
		} else
		{
			Hashtable<String, FanAstScopeVarBase> types = scopeNode.getAllScopeVars();
			if (types.containsKey(enteredType))
			{
				return types.get(enteredType).getType();
			}
			// If not found in scope, try "implicit" imports
			if (type == null)
			{
				// first, other types in this pod
				type = FanType.findByQualifiedName(scopeNode.getRoot().getPod() + "::" + enteredType);

			}
			// if still not found try in "sys" pod
			if (type == null)
			{
				type = FanType.findByQualifiedName("sys::" + enteredType);
			}
			// try Generic types
			if (type == null && enteredType.length() == 1 && enteredType.toUpperCase().equals(enteredType))
			{
				FanResolvedType objType = new FanResolvedType(scopeNode, enteredType, FanType.findByQualifiedName("sys::Obj"));
				if (enteredType.equals("V") || enteredType.equals("K") || enteredType.equals("A") || enteredType.equals("B")
					|| enteredType.equals("C") || enteredType.equals("D") || enteredType.equals("E") || enteredType.equals("F")
					|| enteredType.equals("G") || enteredType.equals("H"))
				{	// K, V: List/Map key and item types
					// A-H : Function types
					type = FanType.findByQualifiedName("sys::Obj");
				} else if (enteredType.equals("L"))
				{ // List
					return new FanResolvedListType(scopeNode, objType);
				} else if (enteredType.equals("M"))
				{ // Map
					return new FanResolvedMapType(scopeNode, objType, objType);
				} else if (enteredType.equals("R"))
				{ // Function
					return new FanResolvedFuncType(scopeNode, new Vector<FanResolvedType>(), objType);
				}
			}
			if (type == null)
			{
				if (type == null)
				{
					return makeUnresolved(scopeNode);
				}
			}
		}
		FanResolvedType result = new FanResolvedType(scopeNode, enteredType, type);
		result.setStaticContext(isStatic);
		return result;
	}

	/**
	 * Make a type from the type database (doesn't look at the local scope)
	 * (external type, like a 'using')
	 * @param node
	 * @param qualifiedType
	 * @return
	 */
	public static FanResolvedType makeFromDbType(AstNode node, String qualifiedType)
	{
		FanType type = FanType.findByQualifiedName(qualifiedType);
		return new FanResolvedType(node, qualifiedType, type);
	}

	/**
	 * Lookup where the separator of a map pair is (":")
	 * @param sig
	 * @return
	 */
	private static int findMapSeparatorIndex(String sig)
	{
		int index = 0;
		while (index != -1 && index < sig.length())
		{
			index = sig.indexOf(":", index);
			if (index == -1)
			{
				break; // not found
			}				// looking for ":" but NOT "::"
			if (index > 1 && index < sig.length() - 1 && sig.charAt(index - 1) != ':' && sig.charAt(index + 1) != ':')
			{
				break; // found
			}
			// try next one
			index++;
		}
		return index;
	}

	/**
	 * Check wether type is compatible with baseType
	 * In other words, wether type is of the same type as baseType or inherits from it
	 * @param Type
	 * @param baseType
	 */
	public static boolean isTypeCompatible(FanResolvedType type, FanResolvedType baseType)
	{
		if(type instanceof FanResolvedNullType)
			return baseType.isNullable();
		if(type==null || type.getDbType()==null)
			return false;
		if(type instanceof FanUnknownType || baseType instanceof FanUnknownType)
			return true;
		if(type.getDbType().getQualifiedName().equals(baseType.getDbType().getQualifiedName()))
			return true;
		return isTypeCompatible(getParentType(type), baseType);
	}

	/**
	 * Gte the parent type of type (class it inherits from)
	 * @param type
	 * @return
	 */
	public static FanResolvedType getParentType(FanResolvedType type)
	{
		if(type==null)
			return null;
		if(type instanceof FanUnknownType)
			return null;
		if(type instanceof FanResolvedNullType)
			return fromTypeSig(null, "sys::Obj?");
		if(type.getDbType().isEnum())
			return fromTypeSig(null, "sys::Enum");
		if(type.getDbType().isMixin())
			return null;
		return FanTypeInheritance.findParentType(null, type);
	}

	/**
	 * Creates a type with the most "generic" type common to all the items
	 * For example {Int, Float} would give Num
	 * @param itemsNode
	 * @param items
	 * @return
	 */
	public static FanResolvedType makeFromItemList(AstNode itemsNode, List<FanResolvedType> items/*, int n*/)
	{
		if (items.size() == 0)
		{
			return fromTypeSig(itemsNode, "sys::Obj?");
		}
		boolean nullable = false;
		FanResolvedType best = null;
		for (FanResolvedType item : items)
		{
			if (item == null)
			{
				nullable = true;
				continue;
			}
			FanResolvedType t = item;
			if (best == null)
			{
				best = t;
				continue;
			}
			while (!isTypeCompatible(t, best)) // exetnds
			{
				best = getParentType(best); // get parent
				if (best == null)
				{
					return nullable ? fromTypeSig(itemsNode, "sys::Obj?") : fromTypeSig(itemsNode, "sys::Obj");
				}
			}
		}
		if (best == null)
		{
			best = fromTypeSig(itemsNode, "sys::Obj");
		}
		if(nullable)
			best.setNullableContext(true);
		return best;
	}
}
