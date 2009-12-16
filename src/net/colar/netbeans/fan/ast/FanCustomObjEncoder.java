/*
 * Thibaut Colar Dec 16, 2009
 */
package net.colar.netbeans.fan.ast;

import fan.sys.Err;
import fan.sys.FanObj;
import fan.sys.IOErr;
import fan.sys.Map;
import fan.sys.OutStream;
import fan.sys.Type;
import fanx.interop.Interop;
import fanx.serial.ObjEncoder;

/**
 *
 * @author thibautc
 */
public class FanCustomObjEncoder extends ObjEncoder
{

	public FanCustomObjEncoder(OutStream out, Map map)
	{
		super(out, map);
	}

	@Override
	public void writeObj(Object obj)
	{
		try
		{
			super.writeObj(obj);
		} catch (RuntimeException e)
		{
					System.out.println("re");
			Err err = Interop.toFan(e);
			//if (err instanceof IOErr)
			{
				Type type = FanObj.type(obj);
				if (type.isJava())
				{
					System.out.println("simple");
					writeSimple(type, obj);
				}
			}
		}
	}

	private void writeSimple(Type type, Object obj)
	{
		wType(type).w('(').wStrLiteral(FanObj.toStr(obj), '"').w(')');
	}
}
