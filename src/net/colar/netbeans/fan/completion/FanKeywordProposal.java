/*
 * Thibaut Colar Aug 18, 2009
 */

package net.colar.netbeans.fan.completion;

import java.util.Collections;
import net.colar.netbeans.fan.structure.FanDummyElementHandle;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;

/**
 * Keyword completion proposal
 * @author thibautc
 */
public class FanKeywordProposal extends FanCompletionProposal
{
	public FanKeywordProposal(String kw, int anchor)
	{
		this.name=kw;
		this.anchor=anchor;
		this.modifiers=Collections.EMPTY_SET;
		this.kind=ElementKind.KEYWORD;
	}

	@Override
	public ElementHandle getElement()
	{
		return new FanDummyElementHandle(name, kind);
	}
}
