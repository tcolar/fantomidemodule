/*
 * Thibaut Colar Mar 1, 2010
 */
package net.colar.netbeans.fan.parboiled.pred;

import net.colar.netbeans.fan.parboiled.AstNode;
import org.parboiled.google.base.Predicate;

/**
 *
 * @author thibautc
 */
public class NodeLabelPredicate<AstKind> implements Predicate<AstNode>
{

	private final String label;

	public NodeLabelPredicate(String label)
	{
		this.label = label;
	}

	public boolean apply(AstNode t)
	{
		return t.getLabel().equalsIgnoreCase(label);
	}
}

