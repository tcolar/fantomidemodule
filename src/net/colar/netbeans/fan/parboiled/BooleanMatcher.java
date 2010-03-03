/*
 * Thibaut Colar Mar 3, 2010
 */

package net.colar.netbeans.fan.parboiled;

import org.parboiled.MatcherContext;
import org.parboiled.matchers.EmptyMatcher;
import org.parboiled.matchers.MatcherVisitor;

/**
 *
 * @author thibautc
 */
public class BooleanMatcher<V> extends EmptyMatcher<V>
{
	private final boolean b;
	public BooleanMatcher(boolean b)
	{
		this.b=b;
	}

	@Override
	public boolean match(MatcherContext<V> mc)
	{
		return b;
	}

	@Override
	public <R> R accept(MatcherVisitor<V, R> visitor)
	{
		return visitor.visit(this);
	}

}
