/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.completion;

import fan.sys.Field;
import fan.sys.Method;
import fan.sys.Param;
import fan.sys.Slot;
import java.util.HashSet;
import net.colar.netbeans.fan.indexer.FanPodIndexer;
import net.colar.netbeans.fan.structure.FanBasicElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;

/**
 * Completion for slots
 * @author tcolar
 */
public class FanSlotProposal extends FanCompletionProposal
{
//TODO : != icon for static slots
	private final Slot slot;
	private String html="";
	private String rHtml="";
	private String prefix="";

	public FanSlotProposal(Slot slot, int anchor)
	{
		this.kind = ElementKind.OTHER;
		this.name=slot.name();
		this.anchor=anchor;
		this.slot = slot;
		this.modifiers = new HashSet<Modifier>();
		if (slot.isField())
		{
			this.kind = ElementKind.FIELD;
			html = slot.name();
			prefix=slot.name();
			rHtml += ((Field)slot).of().name();
		} else if(slot.isMethod() || slot.isCtor())
		{
			Method m = (Method) slot;
			this.kind = ElementKind.METHOD;
			rHtml = m.returns().name();
			if(slot.isCtor())
			{
				this.kind=ElementKind.CONSTRUCTOR;
				// m.returns says Void
				rHtml = slot.parent().type().name();
			}
			String args = "";
			html=m.name()+"(";
			prefix=slot.name()+"(";
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
					// only list non-defaulted parameters by default
					if(!prefix.endsWith("("))
						prefix+=", ";
					prefix+=p.name();
				}
				args += p.type().name() + " " +nm;
			}

			// remove optional parenthesis when no parameters
			if(prefix.endsWith("("))
				prefix=prefix.substring(0,prefix.length() - 1);
			else
				prefix+=")";
			html+=args+")";
		}
		FanBasicElementHandle handle = new FanBasicElementHandle(name, kind);
		handle.setDoc(FanPodIndexer.fanDocToHtml(slot.doc()));
		element=handle;

		if(slot.isPrivate())
			modifiers.add(Modifier.PRIVATE);
		else if(slot.isProtected() || slot.isInternal())
			modifiers.add(Modifier.PROTECTED);
		else if(slot.isPublic())
			modifiers.add(Modifier.PUBLIC);
		if(slot.isStatic())
			modifiers.add(Modifier.STATIC);

	}

	@Override
	public String getInsertPrefix()
	{
		return prefix;
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
