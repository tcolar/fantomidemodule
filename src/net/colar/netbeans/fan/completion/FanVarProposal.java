/*
 * Thibaut Colar Nov 18, 2009
 */
package net.colar.netbeans.fan.completion;

import java.util.HashSet;
import net.colar.netbeans.fan.ast.FanAstScopeVar;
import net.colar.netbeans.fan.structure.FanBasicElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;

/**
 * Propose a variable
 * @author thibautc
 */
public class FanVarProposal extends FanCompletionProposal
{
	private final FanAstScopeVar var;

	public FanVarProposal(FanAstScopeVar var, int anchor)
	{
		this.var=var;
		this.name = var.getName();
		this.anchor = anchor;
		this.kind = ElementKind.VARIABLE;
		FanBasicElementHandle handle = new FanBasicElementHandle(name, kind);
		handle.setDoc(null);
		element=handle;
		this.modifiers = new HashSet<Modifier>();
		if(var.hasModifier(FanAstScopeVar.modifs.PRIVATE))
			modifiers.add(Modifier.PRIVATE);
		else if(var.hasModifier(FanAstScopeVar.modifs.PROTECTED) || var.hasModifier(FanAstScopeVar.modifs.INTERNAL))
			modifiers.add(Modifier.PROTECTED);
		else if(var.hasModifier(FanAstScopeVar.modifs.PUBLIC))
			modifiers.add(Modifier.PUBLIC);
		if(var.hasModifier(FanAstScopeVar.modifs.STATIC))
			modifiers.add(Modifier.STATIC);
	}

	@Override
	public String getInsertPrefix()
	{
		return name;
	}

	@Override
	public String getRhsHtml(HtmlFormatter formater)
	{
		if(var.getType().isUnresolved())
			return "N/A";
		return var.getType().getType().name();
	}
}
