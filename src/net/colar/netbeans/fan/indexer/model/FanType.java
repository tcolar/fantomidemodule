/*
 * Thibaut Colar Dec 18, 2009
 */

package net.colar.netbeans.fan.indexer.model;

import net.jot.persistance.JOTModel;
import net.jot.persistance.JOTModelMapping;

/**
 * DB Model for a "Type" (class, enum, mixin)
 * @author thibautc
 */
public class FanType extends JOTModel
{
	// Primary key
	public String qualifiedName=""; // net.colar.jco -> Unique !
	
	public String simpleName="";
	public String pod=""; // name of the pod it's in (or package for java ffi)
	public Integer kind = -1; // class, enum, mixin
	public Long documentId = -1L; // id of the document(source) it's found in - can be null;

	// modifiers / protection
	public Integer protection = -1; // private, public(default), internal, protected
	public Boolean isConst = false;
	public Boolean isReadonly = false;
	// flags / modifiers
	public Boolean isStatic = false;
	public Boolean isVirtual = false;
	public Boolean isAbstract = false;
	public Boolean isNative = false;
	public Boolean isOverride = false;

	@Override
	protected void customize(JOTModelMapping mapping)
	{
		mapping.requestIndex("qualifiedName");
		mapping.defineFieldSize("qualifiedName", 255);
		mapping.defineFieldSize("superClass", 255);
		mapping.defineFieldSize("simpleName", 80);
		mapping.defineFieldSize("pod", 80);
	}

	public long getDocumentId()
	{
		return documentId;
	}

	public void setDocumentId(long documentId)
	{
		this.documentId = documentId;
	}

	public boolean isIsAbstract()
	{
		return isAbstract;
	}

	public void setIsAbstract(boolean isAbstract)
	{
		this.isAbstract = isAbstract;
	}

	public boolean isIsConst()
	{
		return isConst;
	}

	public void setIsConst(boolean isConst)
	{
		this.isConst = isConst;
	}

	public boolean isIsNative()
	{
		return isNative;
	}

	public void setIsNative(boolean isNative)
	{
		this.isNative = isNative;
	}

	public boolean isIsOverride()
	{
		return isOverride;
	}

	public void setIsOverride(boolean isOverride)
	{
		this.isOverride = isOverride;
	}

	public boolean isIsReadonly()
	{
		return isReadonly;
	}

	public void setIsReadonly(boolean isReadonly)
	{
		this.isReadonly = isReadonly;
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

	public int getKind()
	{
		return kind;
	}

	public void setKind(int kind)
	{
		this.kind = kind;
	}

	public String getPod()
	{
		return pod;
	}

	public void setPod(String pod)
	{
		this.pod = pod;
	}

	public int getProtection()
	{
		return protection;
	}

	public void setProtection(int protection)
	{
		this.protection = protection;
	}

	public String getQualifiedName()
	{
		return qualifiedName;
	}

	public void setQualifiedName(String qualifiedName)
	{
		this.qualifiedName = qualifiedName;
	}

	public String getSimpleName()
	{
		return simpleName;
	}

	public void setSimpleName(String simpleName)
	{
		this.simpleName = simpleName;
	}

}
