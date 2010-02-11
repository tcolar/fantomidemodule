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
 * Regular Test does not allow a test that consumes no data
 * This one soecifically does not consume anything (peek)
 * @author thibautc
 */
public class PeekTestMatcher<V> extends TestMatcher<V> 
{
	public PeekTestMatcher(@NotNull Rule subRule, boolean inverted) {
        super(subRule, inverted);
    }

	@Override
	public boolean match(@NotNull MatcherContext<V> context) {
        InputLocation lastLocation = context.getCurrentLocation();
        boolean matched = context.runMatcher(getChildren().get(0), false);
        context.setCurrentLocation(lastLocation); // reset location, test matchers never advance

        return matched;
    }
}
