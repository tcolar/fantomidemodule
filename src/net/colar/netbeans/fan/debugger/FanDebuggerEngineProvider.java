/*
 * Thibaut Colar Aug 20, 2009
 */

package net.colar.netbeans.fan.debugger;

import org.netbeans.api.debugger.DebuggerEngine.Destructor;
import org.netbeans.spi.debugger.DebuggerEngineProvider;

/**
 * Debugger engine impl.
 * Gets registered with Annotation
 * @author thibautc
 */
@DebuggerEngineProvider.Registration // register as debugger engine provider
public class FanDebuggerEngineProvider extends DebuggerEngineProvider 
{
	static{System.err.println("### Registering: "+FanDebuggerEngineProvider.class.getName());}

	public static final String ID="FanDebuggerEngine";
	public static final String[] langs = new String[] {"fan"};
	private Destructor destructor;

	@Override
	public String[] getLanguages()
	{
		return langs;
	}

	@Override
	public String getEngineTypeID()
	{
		return ID;
	}

	@Override
	public Object[] getServices()
	{
		return new Object[] {};
	}

	@Override
	public void setDestructor(Destructor destructor)
	{
		this.destructor=destructor;
	}

	public Destructor getDestructor()
	{
		return destructor;
	}

}
