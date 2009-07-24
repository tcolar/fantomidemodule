/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.netbeans.api.extexecution.ExecutionDescriptor.LineConvertorFactory;
import org.netbeans.api.extexecution.print.LineConvertor;
import org.netbeans.api.extexecution.print.LineConvertors;
import org.netbeans.api.extexecution.print.LineConvertors.FileLocator;

/**
 * Python LineConvertorFactory - based on the Ruby one by Erno Mononen
 *
 * @author Erno Mononen
 */
public final class FanLineFactory implements LineConvertorFactory {
    // See the traceback module for details
    static final Pattern PYTHON_STACKTRACE_PATTERN = Pattern.compile("^  File \"(.+\\.py)\", line (\\d+).*");
    /** Regexp. for extensions. */
    public static final Pattern EXT_RE = Pattern.compile(".*\\.(py|pyw)"); // NOI18N

    private final FileLocator locator;
    private final LineConvertor[] convertors;
    private final boolean stdConvertors;


    /**
     * Creates a new convertor factory.
     *
     * @param locator the locator to use.
     * @param convertors the convertors to use (if more than one is passed, they will
     *  be chained in the given order, i.e. the first given convertor will get to handle
     *  lines first).
     * @return
     */
    public static FanLineFactory create(FileLocator locator, LineConvertor... convertors) {
        return new FanLineFactory(locator, false, convertors);
    }

    /**
     * Creates a new convertor factory with the standard Ruby line convertors. The
     * standard convertors will be chained after the given (if any) convertors.
     *
     * @param locator the locator to use.
     * @param convertors the convertors to use (if more than one is passed, they will
     *  be chained in the given order, i.e. the first given convertor will get to handle
     *  lines first).
     * @return
     */
    public static FanLineFactory withStandardConvertors(FileLocator locator, LineConvertor... convertors) {
        return new FanLineFactory(locator, true, convertors);
    }

    private FanLineFactory(FileLocator locator, boolean stdConvertors, LineConvertor... convertors) {
        this.locator = locator;
        this.convertors = convertors;
        this.stdConvertors = stdConvertors;
    }

    /**
     * Gets the standard convertors.
     *
     * @param locator the locator for the convertors to use.
     * @return
     */
    public static List<LineConvertor> getStandardConvertors(FileLocator locator) {
        List<LineConvertor> result = new ArrayList<LineConvertor>(4);
        result.add(LineConvertors.filePattern(locator, PYTHON_STACKTRACE_PATTERN, EXT_RE, 1, 2));
        return result;
    }

    public LineConvertor newLineConvertor() {
        final List<LineConvertor> convertorList = new ArrayList<LineConvertor>();

        if (convertors != null) {
            for (LineConvertor each : convertors) {
                if (each != null) {
                    convertorList.add(each);
                }
            }
        }

        if (stdConvertors) {
            convertorList.addAll(getStandardConvertors(locator));
        }
        return LineConvertors.proxy(convertorList.toArray(new LineConvertor[convertorList.size()]));
    }
}