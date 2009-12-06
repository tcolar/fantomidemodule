/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.completion;

import fan.sys.Field;
import fan.sys.Method;
import fan.sys.Param;
import fan.sys.Slot;
import java.util.Collections;
import net.colar.netbeans.fan.indexer.FanPodIndexer;
import net.colar.netbeans.fan.structure.FanBasicElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;

/**
 * Completion for slots
 * @author tcolar
 */
public class FanSlotProposal extends FanCompletionProposal
{

	private final Slot slot;
	private String html="";
	private String rHtml="";

	public FanSlotProposal(Slot slot, int anchor)
	{
		this.kind = ElementKind.OTHER;
		this.name=slot.name();
		this.anchor=anchor;
		this.slot = slot;
		this.modifiers = Collections.EMPTY_SET;
		if (slot.isField())
		{
			this.kind = ElementKind.FIELD;
			html = slot.name();
			rHtml += "<font color='#aaaaaa'>" + ((Field)slot).type().name() + "</font>";
		} else if(slot.isMethod() || slot.isCtor())
		{
			this.kind = ElementKind.METHOD;
			if(slot.isCtor())
				this.kind=ElementKind.CONSTRUCTOR;
			String args = "";
			Method m = (Method) slot;
			html=m.name()+"(";
			Param[] params = (Param[]) m.params().asArray(Param.class);
			for (Param p : params)
			{
				if (args.length() > 0)
				{
					args += " ,";
				}
				String nm=p.name();
				if(p.hasDefault())
				{
					nm="<font color='#662222'><i>" + p.name()+"</i></font>";
				}
				else
				{
					nm="<font color='#AA2222'>" + p.name()+"</font>";
				}
				args += p.type().name() + "" +nm;
			}
			html+=args+")";
			rHtml = "<font color='#aaaaaa'>"+m.returns().name()+"</font>";

		}
		FanBasicElementHandle handle = new FanBasicElementHandle(name, kind);
		handle.setDoc(FanPodIndexer.fanDocToHtml(slot.doc()));
		element=handle;
	}

	/**
	 * left side html
	 * @param formater
	 * @return
	 */
	@Override
	public String getLhsHtml(HtmlFormatter formater)
	{
		return html;
	}

	/**
	 * right side html
	 * @param formater
	 * @return
	 */
	@Override
	public String getRhsHtml(HtmlFormatter formater)
	{
		return rHtml;
	}

}
