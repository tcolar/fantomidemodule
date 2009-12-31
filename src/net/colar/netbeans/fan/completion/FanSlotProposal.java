/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.completion;

import java.util.HashSet;
import java.util.Vector;
import net.colar.netbeans.fan.indexer.FanIndexer;
import net.colar.netbeans.fan.indexer.model.FanMethodParam;
import net.colar.netbeans.fan.indexer.model.FanSlot;
import net.colar.netbeans.fan.structure.FanBasicElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;
import net.colar.netbeans.fan.indexer.model.FanType;

/**
 * Completion for slots
 * @author tcolar
 */
public class FanSlotProposal extends FanCompletionProposal
{
//TODO : != icon for static slots

	private final FanSlot slot;
	private String html = "";
	private String rHtml = "";
	private String prefix = "";

	public FanSlotProposal(FanSlot slot, int anchor)
	{
		this.kind = ElementKind.OTHER;
		this.name = slot.getName();
		this.anchor = anchor;
		this.slot = slot;
		this.modifiers = new HashSet<Modifier>();
		if (slot.isField())
		{
			this.kind = ElementKind.FIELD;
			if (slot.isConst())
			{
				this.kind = ElementKind.CONSTANT;
			}
			html = name;
			prefix = name;
			rHtml += slot.getReturnedType();
		} else if (slot.isMethod() || slot.isCtor())
		{
			this.kind = ElementKind.METHOD;
			if (slot.isCtor())
			{
				this.kind = ElementKind.CONSTRUCTOR;
			}
			String args = "";
			html = name + "(";
			prefix = name + "(";
			Vector<FanMethodParam> params = FanMethodParam.findAllForSlot(slot.getId());
			//Param[] params = (Param[]) slot.m.params().asArray(Param.class);
			for (FanMethodParam p : params)
			{
				if (args.length() > 0)
				{
					args += " ,";
				}
				String nm = p.getName();
				if (p.hasDefault())
				{
					nm = "<font color='#662222'><i>" + p.getName() + "</i></font>";
				} else
				{
					nm = "<font color='#AA2222'>" + p.getName() + "</font>";
					// only list non-defaulted parameters by default
					if (!prefix.endsWith("("))
					{
						prefix += ", ";
					}
					prefix += p.getName();
				}
				String typeName = FanType.getShortName(p.getQualifiedType());
				args += typeName + " " + nm;
			}

			// remove optional parenthesis when no parameters
			if (prefix.endsWith("("))
			{
				prefix = prefix.substring(0, prefix.length() - 1);
			} else
			{
				prefix += ")";
			}
			html += args + ")";
		}
		FanBasicElementHandle handle = new FanBasicElementHandle(name, kind);
		handle.setDoc(FanIndexer.getSlotDoc(slot));
		element = handle;

		if (slot.isPrivate())
		{
			modifiers.add(Modifier.PRIVATE);
		} else if (slot.isProtected() || slot.isInternal())
		{
			modifiers.add(Modifier.PROTECTED);
		} else if (slot.isPublic())
		{
			modifiers.add(Modifier.PUBLIC);
		}
		if (slot.isStatic())
		{
			modifiers.add(Modifier.STATIC);
		}

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
