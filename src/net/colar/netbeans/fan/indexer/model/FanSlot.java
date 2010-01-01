/*
 * Thibaut Colar Dec 22, 2009
 */
package net.colar.netbeans.fan.indexer.model;

import java.util.Vector;
import net.colar.netbeans.fan.ast.FanAstScopeVarBase.ModifEnum;
import net.colar.netbeans.fan.indexer.FanIndexer;
import net.jot.persistance.JOTModel;
import net.jot.persistance.JOTModelMapping;
import net.jot.persistance.JOTSQLCondition;
import net.jot.persistance.JOTTransaction;
import net.jot.persistance.builders.JOTQueryBuilder;

/**
 * DB Model for a slot
 * Prameters (if any) are in FanMethodParam
 * @author thibautc
 */
public class FanSlot extends JOTModel
{

	public Long typeId = -1L; // which type it's part of
	public String name = ""; // name of the slot
	public Integer slotKind = -1; // field, method, constructor
	// qualified type of a field or returntype for method/ctor
	public String returnedType = FanIndexer.UNRESOLVED_TYPE;
	public boolean isNullable = false;
	// protection
	public Integer protection = -1; // private, public(default), internal, protected
	// flags / modifiers
	public Boolean isStatic = false;
	public Boolean isVirtual = false;
	public Boolean isAbstract = false;
	public Boolean isConst = false;
	public Boolean isNative = false;
	public Boolean isOverride = false;

	// Those two are not real attributes (syntaxic sugar)
	// Maybe store privateSetter instead -> any use ??
	//public Boolean isOnce = false;
	//public Boolean isReadonly = false;
	@Override
	protected void customize(JOTModelMapping mapping)
	{
		mapping.defineFieldSize("name", 80);
		mapping.defineFieldSize("returnedType", 255);
	}

	public void setReturnedType(String type)
	{
		returnedType = type;
	}

	public String getReturnedType()
	{
		return returnedType;
	}

	public boolean isAbstract()
	{
		return isAbstract;
	}

	public void setIsAbstract(boolean isAbstract)
	{
		this.isAbstract = isAbstract;
	}

	public boolean isNative()
	{
		return isNative;
	}

	public void setIsNative(boolean isNative)
	{
		this.isNative = isNative;
	}

	public boolean isOverride()
	{
		return isOverride;
	}

	public void setIsOverride(boolean isOverride)
	{
		this.isOverride = isOverride;
	}

	public boolean isStatic()
	{
		return isStatic;
	}

	public void setIsStatic(boolean isStatic)
	{
		this.isStatic = isStatic;
	}

	public boolean isVirtual()
	{
		return isVirtual;
	}

	public void setIsVirtual(boolean isVirtual)
	{
		this.isVirtual = isVirtual;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getProtection()
	{
		return protection;
	}

	public void setProtection(int protection)
	{
		this.protection = protection;
	}

	public int getSlotKind()
	{
		return slotKind;
	}

	public void setSlotKind(int slotKind)
	{
		this.slotKind = slotKind;
	}

	public Long getTypeId()
	{
		return typeId;
	}

	public void setTypeId(Long typeId)
	{
		this.typeId = typeId;
	}

	public Boolean isConst()
	{
		return isConst;
	}

	public void setIsConst(Boolean isConst)
	{
		this.isConst = isConst;
	}

	public void setIsNullable(boolean nullable)
	{
		this.isNullable = nullable;
	}

	public Boolean isNullable()
	{
		return isNullable;
	}

	public static Vector<FanSlot> findAllForType(long type)
	{
		try
		{
			JOTSQLCondition cond = new JOTSQLCondition("typeId", JOTSQLCondition.IS_EQUAL, type);
			return (Vector<FanSlot>) JOTQueryBuilder.selectQuery(null, FanSlot.class).where(cond).find().getAllResults();
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
		//return null;
	}

	public static FanSlot findByTypeAndName(String qualifiedType, String slotName)
	{
		try
		{
			FanType type = FanType.findByQualifiedName(qualifiedType);
			if (type != null)
			{
				JOTSQLCondition cond = new JOTSQLCondition("typeId", JOTSQLCondition.IS_EQUAL, type.getId());
				JOTSQLCondition cond2 = new JOTSQLCondition("name", JOTSQLCondition.IS_EQUAL, slotName);
				return (FanSlot) JOTQueryBuilder.selectQuery(null, FanSlot.class).where(cond).where(cond2).findOne();
			}
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
		return null;
	}

	@Override
	public void delete(JOTTransaction trans) throws Exception
	{
		Vector<FanMethodParam> params = FanMethodParam.findAllForSlot(getId());
		for (FanMethodParam param : params)
		{
			param.delete(trans);
		}
		super.delete(trans);
	}

	public boolean isCtor()
	{
		return slotKind == FanModelConstants.SlotKind.CTOR.value();
	}
	public boolean isMethod()
	{
		return slotKind == FanModelConstants.SlotKind.METHOD.value();
	}
	public boolean isField()
	{
		return slotKind == FanModelConstants.SlotKind.FIELD.value();
	}

	public boolean isPrivate()
	{
		return protection == ModifEnum.PRIVATE.value();
	}
	public boolean isPublic()
	{
		return protection == ModifEnum.PUBLIC.value();
	}
	public boolean isProtected()
	{
		return protection == ModifEnum.PROTECTED.value();
	}
	public boolean isInternal()
	{
		return protection == ModifEnum.INTERNAL.value();
	}

	@Override
	public void save(JOTTransaction transaction) throws Exception
	{
		super.save(transaction);
	}


}