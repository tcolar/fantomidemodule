/*
 * Thibaut Colar Nov 18, 2009
 */
package net.colar.netbeans.fan.completion;

import java.util.HashSet;
import net.colar.netbeans.fan.ast.FanAstScopeVarBase;
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
	private final FanAstScopeVarBase var;

	public FanVarProposal(FanAstScopeVarBase var, int anchor)
	{
		this.var=var;
		this.name = var.getName();
		this.anchor = anchor;
		this.kind = ElementKind.VARIABLE;
		FanBasicElementHandle handle = new FanBasicElementHandle(name, kind);
		handle.setDoc(null);
		element=handle;
		this.modifiers = new HashSet<Modifier>();
		if(var.hasModifier(FanAstScopeVarBase.ModifEnum.PRIVATE))
			modifiers.add(Modifier.PRIVATE);
		else if(var.hasModifier(FanAstScopeVarBase.ModifEnum.PROTECTED) || var.hasModifier(FanAstScopeVarBase.ModifEnum.INTERNAL))
			modifiers.add(Modifier.PROTECTED);
		else if(var.hasModifier(FanAstScopeVarBase.ModifEnum.PUBLIC))
			modifiers.add(Modifier.PUBLIC);
		if(var.hasModifier(FanAstScopeVarBase.ModifEnum.STATIC))
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
		if( ! var.getType().isResolved())
			return "N/A";
		return var.getType().getDbType().getSimpleName();
	}
}
