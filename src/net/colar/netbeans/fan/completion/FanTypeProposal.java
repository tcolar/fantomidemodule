/*
 * Thibaut Colar Nov 18, 2009
 */
package net.colar.netbeans.fan.completion;

import java.util.Collections;
import net.colar.netbeans.fan.structure.FanDummyElementHandle;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.openide.util.ImageUtilities;

/**
 *
 * @author thibautc
 */
public class FanTypeProposal extends FanCompletionProposal
{
	private final String pod;

	public FanTypeProposal(String type, int anchor, String pod)
	{
		this.pod = pod;
		this.name = type;
		this.anchor = anchor;
		this.modifiers = Collections.EMPTY_SET;
		this.kind = ElementKind.CLASS;
		icon = ImageUtilities.loadImageIcon("net/colar/netbeans/fan/fan.png", false);
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

	@Override
	public ElementHandle getElement()
	{
		FanDummyElementHandle handle = new FanDummyElementHandle(name, kind);
		handle.getCustomParams().put(FanDummyElementHandle.params.POD, pod);
		return handle;
	}
}
