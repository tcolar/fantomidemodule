/*
 * Thibaut Colar Aug 18, 2009
 */

package net.colar.netbeans.fan.structure;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Set;
import net.colar.netbeans.fan.FanLanguage;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.spi.ParserResult;
import org.openide.filesystems.FileObject;

/**
 * "Dummy" ElementHandle (used for Not-ast items such as keywords).
 * @author thibautc
 */
public class FanDummyElementHandle implements ElementHandle
{
	// custom param ID's
	public enum params{POD}

	private final String name;
	private final ElementKind kind;
	private FileObject fo;
	// Stores custom data
	private Hashtable<params, String> customParams=new Hashtable<params, String>();

	public FanDummyElementHandle(String name, ElementKind kind)
	{
		this.name=name;
		this.kind=kind;
	}


	public String getMimeType()
	{
		return FanLanguage.FAN_MIME_TYPE;
	}

	public ElementKind getKind()
	{
		return kind;
	}

	public String getName()
	{
		return name;
	}

	public FileObject getFileObject()
	{
		return fo;
	}

	public String getIn()
	{
		return null;
	}

	public Set<Modifier> getModifiers()
	{
		return Collections.EMPTY_SET;
	}

	public boolean signatureEquals(ElementHandle arg0)
	{
		return false;
	}

	public OffsetRange getOffsetRange(ParserResult arg0)
	{
		return OffsetRange.NONE;
	}

	public Hashtable<params, String> getCustomParams()
	{
		return customParams;
	}

	public void setCustomParams(Hashtable customParams)
	{
		this.customParams = customParams;
	}

	public void setFo(FileObject fo)
	{
		this.fo = fo;
	}



}
