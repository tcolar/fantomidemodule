/*
 * Thibaut Colar Feb 12, 2010
 */

package net.colar.netbeans.fan.parboiled;

import com.sun.istack.internal.NotNull;
import java.util.List;
import org.parboiled.MatcherContext;
import org.parboiled.Rule;
import org.parboiled.matchers.FirstOfMatcher;
import org.parboiled.matchers.Matcher;
import org.parboiled.support.Characters;
import org.parboiled.support.InputLocation;

/**
 * Same as standard but allows matching no chars
 * @author thibautc
 */
/*public class PeekFirstOfMatcher<V> extends FirstOfMatcher<V>
{
	public PeekFirstOfMatcher(@NotNull Rule[] subRules) {
        super(subRules);
    }

	@Override
	public boolean match(@NotNull MatcherContext<V> context) {
        List<Matcher<V>> children = getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            Matcher<V> matcher = children.get(i);

            InputLocation lastLocation = context.getCurrentLocation();
            boolean matched = context.runMatcher(matcher, false);
            if (matched) {
                //if (context.getCurrentLocation() == lastLocation) {
                //    Checks.fail("The inner rule of FirstOf rule '%s' must not allow empty matches", context.getPath());
                //}
                context.createNode();
                return true;
            }
        }
        return false;
    }

	@Override
    public Characters getStarterChars() {
        Characters chars = Characters.NONE;
        for (Matcher matcher : getChildren()) {
            chars = chars.add(matcher.getStarterChars());
            //Checks.ensure(!chars.contains(Chars.EMPTY),
            //        "Rule '%s' allows empty matches, unlikely to be correct as a sub rule of a FirstOf-Rule", matcher);
        }
        return chars;
    }
}*/
