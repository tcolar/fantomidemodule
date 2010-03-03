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
public class NodeKindPredicate<AstKind> implements Predicate<AstNode>
{

	private final AstKind kind;

	public NodeKindPredicate(AstKind kind)
	{
		this.kind = kind;
	}

	public boolean apply(AstNode t)
	{
		return t.getKind() == kind;
	}
}

