/*
 * Thibaut Colar Dec 18, 2009
 */

package net.colar.netbeans.fan.indexer.model;

import java.util.Vector;
import net.jot.logger.JOTLogger;
import net.jot.persistance.JOTModel;
import net.jot.persistance.JOTModelMapping;
import net.jot.persistance.JOTSQLCondition;
import net.jot.persistance.JOTTransaction;
import net.jot.persistance.builders.JOTQueryBuilder;

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
	// wether defined ina  source or  a binary/lib
	public Boolean fromSource = true;

	// modifiers / protection
	public Integer protection = -1; // private, public(default), internal, protected
	public Boolean isConst = false;
	// flags / modifiers
	public Boolean isAbstract = false;
	public Boolean isFinal = false;

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

	public Boolean isFinal()
	{
		return isFinal;
	}

	public void setIsFinal(Boolean isFinal)
	{
		this.isFinal = isFinal;
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

	/**
	 * All types for a document
	 * @param transaction
	 * @param doc
	 * @return
	 * @throws Exception
	 */
	public static Vector<FanType> findAllForDoc(JOTTransaction transaction, long doc) throws Exception
	{
		JOTSQLCondition cond = new JOTSQLCondition("documentId", JOTSQLCondition.IS_EQUAL, doc);
		return (Vector<FanType>)JOTQueryBuilder.selectQuery(transaction, FanType.class).where(cond).find().getAllResults();
	}

	public Boolean isFromSource()
	{
		return fromSource;
	}

	public void setIsFromSource(Boolean fromSource)
	{
		this.fromSource = fromSource;
	}

	/**
	 * Get the list of unique sorted types for a document
	 * @param transaction
	 * @param doc
	 * @return
	 * @throws Exception
	 */
	/*public static Vector<FanType> findTypeList(JOTTransaction transaction, long doc) throws Exception
	{
		JOTSQLCondition cond = new JOTSQLCondition("documentId", JOTSQLCondition.IS_EQUAL, doc);
		return (Vector<FanType>)JOTQueryBuilder.selectQuery(transaction, FanType.class).where(cond).
			orderBy("fromSource",false).find().filterDistinct("qualifiedName").getAllResults();
	}*/

	public static void deleteForDoc(JOTTransaction trans, long id) throws Exception
	{
		try
		{
		Vector<FanType> types = findAllForDoc(trans, id);
		for(FanType type : types)
			type.delete(trans);
		}
		catch(Exception e)
		{
			JOTLogger.logException(FanDocument.class, "Failed deleting type: " + id, e);
		}
	}

	@Override
	public void delete(JOTTransaction trans) throws Exception
	{
		// TODO: delete slots
		Vector<FanTypeInheritance> inhs = FanTypeInheritance.findAllForMainType(null, qualifiedName);
		for(FanTypeInheritance inh : inhs)
			inh.delete(trans);
		super.delete(trans);
	}

}
