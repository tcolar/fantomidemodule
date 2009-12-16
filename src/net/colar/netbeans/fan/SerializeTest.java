/*
 * Thibaut Colar Dec 16, 2009
 */
package net.colar.netbeans.fan;

import fan.sys.StrBufOutStream;
import net.colar.netbeans.fan.ast.FanCustomObjEncoder;

/**
 *
 * @author thibautc
 */
public class SerializeTest
{

	public int num1 = 27;
	public String str1 = "blah";

	public void serialize()
	{
		System.out.println("Encoded: " + FanCustomObjEncoder.encode(this));
	}

	public static void main(String[] args)
	{
		SerializeTest test = new SerializeTest();
		System.out.println(encode(test.num1));
	}

	public static String encode(Object obj)
	{
		StrBufOutStream out = new StrBufOutStream();
		new FanCustomObjEncoder(out, null).writeObj(obj);
		return out.string();
	}
}
