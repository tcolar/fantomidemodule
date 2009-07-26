/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.wizard;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.prefs.Preferences;
import org.netbeans.spi.options.AdvancedOption;
import org.netbeans.spi.options.OptionsPanelController;
import org.openide.util.NbPreferences;

/**
 *
 * @author tcolar
 */
public class FanGlobalSettings extends AdvancedOption
{
 public static final String GROOVY_OPTIONS_CATEGORY = "Advanced/org-netbeans-modules-groovy-support-api-GroovySettings"; // NOI18N

    public static final String GROOVY_DOC_PROPERTY  = "groovy.doc"; // NOI18N

    private static final String GROOVY_DOC  = "groovyDoc"; // NOI18N

    private static FanGlobalSettings instance;

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    private FanGlobalSettings() {
        super();
    }

    public static synchronized FanGlobalSettings getInstance() {
        if (instance == null) {
            instance = new FanGlobalSettings();
        }
        return instance;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public String getGroovyDoc() {
        synchronized (this) {
            return getPreferences().get(GROOVY_DOC, null); // NOI18N
        }
    }

    public void setGroovyDoc(String groovyDoc) {
        assert groovyDoc != null;

        String oldValue;
        synchronized (this) {
            oldValue = getGroovyDoc();
            getPreferences().put(GROOVY_DOC, groovyDoc);
        }
        propertyChangeSupport.firePropertyChange(GROOVY_DOC_PROPERTY, oldValue, groovyDoc);
    }

    public String getDisplayName() {
        return "Fan options";
    }

    public String getTooltip() {
        return "Fan options";
    }

    public OptionsPanelController create() {
	//TODO
        return null;//new SupportOptionsPanelController();
    }

    private Preferences getPreferences() {
        return NbPreferences.forModule(FanGlobalSettings.class);
    }
}

