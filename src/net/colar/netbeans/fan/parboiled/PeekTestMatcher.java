/*
 * Thibaut Colar Feb 11, 2010
 */
package net.colar.netbeans.fan.parboiled;

import com.sun.istack.internal.NotNull;
import org.parboiled.MatcherContext;
import org.parboiled.Rule;
import org.parboiled.matchers.TestMatcher;
import org.parboiled.support.InputLocation;

/**
 * Same as standard but allows matching no chars
 * @author thibautc
 */
public class PeekTestMatcher<V> extends TestMatcher<V>
{
	private final boolean invert;

	public PeekTestMatcher(@NotNull Rule subRule, boolean inverted)
	{
		super(subRule, inverted);
		this.invert = inverted;
	}

	@Override
	public boolean match(@NotNull MatcherContext<V> context) {
        InputLocation lastLocation = context.getCurrentLocation();
        boolean matched = context.runMatcher(getChildren().get(0), context.isEnforced() && !invert);
        //if (matched && context.getCurrentLocation() == lastLocation && lastLocation.currentChar != Chars.EOI) {
        //    Checks.fail("The inner rule of Test/TestNot rule '%s' must not allow empty matches", context.getPath());
        //}
        context.setCurrentLocation(lastLocation); // reset location, test matchers never advance

        return invert ? !matched : matched;
    }
}
