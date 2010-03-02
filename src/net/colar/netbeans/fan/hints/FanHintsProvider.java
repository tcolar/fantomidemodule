/*
 * Thibaut Colar Nov 25, 2009
 */

package net.colar.netbeans.fan.hints;

import java.util.Collections;
import java.util.List;
import net.colar.netbeans.fan.FanParserTask;
import net.colar.netbeans.fan.ast.FanRootScope;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.api.Hint;
import org.netbeans.modules.csl.api.HintsProvider;
import org.netbeans.modules.csl.api.Rule;
import org.netbeans.modules.csl.api.RuleContext;

/**
 * Provide hints to user
 * @author thibautc
 */
public class FanHintsProvider implements HintsProvider
{
	public void computeErrors(HintsManager manager, RuleContext ctx, List<Hint> hints, List<Error> errors)
	{
		FanParserTask result=(FanParserTask)ctx.parserResult;
		FanRootScope root = null;//result.getRootScope();
		if(root!=null)
		{
			errors.addAll(result.getErrors());
		}
	}


	public void computeHints(HintsManager arg0, RuleContext arg1, List<Hint> arg2)
	{
		return;
	}

	public void computeSuggestions(HintsManager arg0, RuleContext arg1, List<Hint> arg2, int arg3)
	{
		return;
	}

	public void computeSelectionHints(HintsManager arg0, RuleContext arg1, List<Hint> arg2, int arg3, int arg4)
	{
		return;
	}

	public void cancel()
	{
	}

	public List<Rule> getBuiltinRules()
	{
		return Collections.<Rule>emptyList();
	}

	public RuleContext createRuleContext()
	{
		return new FanHintsRuleContext();
	}

}
