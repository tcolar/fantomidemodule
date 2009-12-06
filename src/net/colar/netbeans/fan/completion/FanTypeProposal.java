/*
 * Thibaut Colar Nov 18, 2009
 */
package net.colar.netbeans.fan.completion;

import fan.sys.Type;
import java.util.Collections;
import net.colar.netbeans.fan.indexer.FanPodIndexer;
import net.colar.netbeans.fan.structure.FanBasicElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.openide.util.ImageUtilities;

/**
 *
 * @author thibautc
 */
public class FanTypeProposal extends FanCompletionProposal
{
	private final String pod;

	public FanTypeProposal(Type type, int anchor)
	{
		this.pod=type.pod().name();
		this.name = type.name();
		this.anchor = anchor;
		this.modifiers = Collections.EMPTY_SET;
		this.kind = ElementKind.CLASS;
		icon = ImageUtilities.loadImageIcon("net/colar/netbeans/fan/fan.png", false);
		FanBasicElementHandle handle = new FanBasicElementHandle(name, kind);
		handle.setDoc(FanPodIndexer.fanDocToHtml(type.doc()));
		element=handle;
	}

	@Override
	public String getInsertPrefix()
	{
		return name;
	}

	@Override
	public String getName()
	{
		return name+" ["+(pod==null?"??":pod)+"]";
	}

}
