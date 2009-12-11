/*
 * Thibaut Colar Nov 18, 2009
 */
package net.colar.netbeans.fan.completion;

import fan.sys.JavaType;
import fan.sys.Type;
import java.util.Collections;
import net.colar.netbeans.fan.indexer.FanPodIndexer;
import net.colar.netbeans.fan.structure.FanBasicElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.openide.util.ImageUtilities;

/**
 * Propose a Type such as Str or Int
 * ForcedNam is used for using with a "As" clause, if null just use type.name()
 * @author thibautc
 */
public class FanTypeProposal extends FanCompletionProposal
{

	private final String pod;

	public FanTypeProposal(Type type, int anchor, String forcedName)
	{
		if (type.isJava())
		{
			String qname = type.qname();
			this.pod = qname.substring(0, qname.lastIndexOf("::"));
		} else
		{
			// for java type pod() return null;
			this.pod = type.pod().name();
		}
		this.name = type.name();
		if (forcedName != null)
		{
			this.name = forcedName;
		}
		this.anchor = anchor;
		this.modifiers = Collections.EMPTY_SET;
		this.kind = ElementKind.CLASS;
		icon = ImageUtilities.loadImageIcon("net/colar/netbeans/fan/fan.png", false);
		if (type.isJava())
		{
			icon = ImageUtilities.loadImageIcon("net/colar/netbeans/fan/project/resources/java.png", false);
		}
		FanBasicElementHandle handle = new FanBasicElementHandle(name, kind);
		handle.setDoc(FanPodIndexer.fanDocToHtml(type.doc()));
		element = handle;
	}

	@Override
	public String getInsertPrefix()
	{
		return name;
	}

	@Override
	public String getRhsHtml(HtmlFormatter formater)
	{
		return "[" + (pod == null ? "??" : pod) + "]";
	}
}
