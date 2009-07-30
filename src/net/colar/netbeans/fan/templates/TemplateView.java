package net.colar.netbeans.fan.templates;

import java.text.DateFormat;
import java.util.Date;
import net.jot.web.views.JOTLightweightView;

/**
 *
 * @author thibautc
 */
public class TemplateView extends JOTLightweightView
{
    public TemplateView(String name)
    {
	Date d=new Date();
	addVariable("name",name);
	addVariable("date", DateFormat.getDateInstance().format(d));
	addVariable("time", DateFormat.getTimeInstance().format(d));
	addVariable("user", System.getProperty("user.name"));
    }
}
