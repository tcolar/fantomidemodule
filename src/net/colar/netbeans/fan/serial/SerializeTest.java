/*
 * Thibaut Colar Dec 16, 2009
 */
package net.colar.netbeans.fan.serial;

import fan.sys.StrBufOutStream;

/**
 * Test Serialization of java object using Fantom
 * @author thibautc
 */
public class SerializeTest
{

	public int num1 = 27;
	public String str1 = "blah";
	public transient String str2 = "blup";
	public String[] strArray = {"str1", "str2", "str3"};

	public static void main(String[] args)
	{
		SerializeTest test = new SerializeTest();
		String text = encode(test);
		System.out.println(text);
		System.out.println("---");
		Object obj = FanCustomObjDecoder.decode(text);
		System.out.println(encode(obj));
	}

	public static String encode(Object obj)
	{
		StrBufOutStream out = new StrBufOutStream();
		new FanCustomObjEncoder(out, null).writeObj(obj);
		return out.string();
	}
}
