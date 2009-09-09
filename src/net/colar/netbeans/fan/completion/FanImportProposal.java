/*
 * Thibaut Colar Aug 18, 2009
 */

package net.colar.netbeans.fan.completion;

import java.util.Collections;
import net.colar.netbeans.fan.structure.FanDummyElementHandle;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.openide.util.ImageUtilities;

/**
 * Import / using completion proposal
 * @author thibautc
 */
public class FanImportProposal extends FanCompletionProposal
{
	public FanImportProposal(String kw, int anchor, boolean isJava)
	{
		this.name=kw;
		this.anchor=anchor;
		this.modifiers=Collections.EMPTY_SET;
		this.kind=ElementKind.KEYWORD;
		if( ! isJava)
			icon = ImageUtilities.loadImageIcon("net/colar/netbeans/fan/fan.png", false);
		else
			icon = ImageUtilities.loadImageIcon("net/colar/netbeans/fan/project/resources/java.png", false);
	}

	@Override
	public ElementHandle getElement()
	{
		return new FanDummyElementHandle(name, kind);
	}

}
