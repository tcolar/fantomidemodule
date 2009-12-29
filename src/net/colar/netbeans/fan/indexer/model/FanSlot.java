/*
 * Thibaut Colar Dec 22, 2009
 */
package net.colar.netbeans.fan.indexer.model;

import net.jot.persistance.JOTModel;
import net.jot.persistance.JOTModelMapping;

/**
 * DB Model for a slot
 * Prameters (if any) are in FanMethodParam
 * @author thibautc
 */
public class FanSlot extends JOTModel
{

	public String typeId = ""; // which type it's part of
	public String name = ""; // name of the slot
	public Integer slotKind = -1; // field, method, constructor
	// protection
	public Integer protection = -1; // private, public(default), internal, protected
	// flags / modifiers
	public Boolean isStatic = false;
	public Boolean isReadonly = false;
	public Boolean isVirtual = false;
	public Boolean isAbstract = false;
	public Boolean isConst = false;
	public Boolean isNative = false;
	public Boolean isOverride = false;
	public Boolean isOnce = false;


	@Override
	protected void customize(JOTModelMapping mapping)
	{
		mapping.defineFieldSize("typeId", 255);
		mapping.defineFieldSize("name", 80);
	}

	public boolean isIsAbstract()
	{
		return isAbstract;
	}

	public void setIsAbstract(boolean isAbstract)
	{
		this.isAbstract = isAbstract;
	}

	public boolean isIsNative()
	{
		return isNative;
	}

	public void setIsNative(boolean isNative)
	{
		this.isNative = isNative;
	}

	public boolean isIsOnce()
	{
		return isOnce;
	}

	public void setIsOnce(boolean isOnce)
	{
		this.isOnce = isOnce;
	}

	public boolean isIsOverride()
	{
		return isOverride;
	}

	public void setIsOverride(boolean isOverride)
	{
		this.isOverride = isOverride;
	}

	public boolean isIsStatic()
	{
		return isStatic;
	}

	public void setIsStatic(boolean isStatic)
	{
		this.isStatic = isStatic;
	}

	public boolean isIsVirtual()
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

	public String getTypeId()
	{
		return typeId;
	}

	public void setTypeId(String typeId)
	{
		this.typeId = typeId;
	}

	public Boolean issReadonly()
	{
		return isReadonly;
	}

	public void setIsReadonly(Boolean isReadonly)
	{
		this.isReadonly = isReadonly;
	}


}
