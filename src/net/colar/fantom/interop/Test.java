/*
 * Thibaut Colar Feb 15, 2010
 */
package net.colar.fantom.interop;

import fan.sys.FanObj;
import fan.sys.File;
import fan.sys.Uri;

/**
 *
 * @author thibautc
 */
public class Test
{

	public static void main(String[] args)
	{
		File f = File.make(Uri.fromStr("/home/thibautc/test.fan"));
		FanObj tokenizer = FantomInterop.createObj("Compiler::Tokenizer");
		FantomInterop.callMethod(tokenizer, "make", "");
		
	}
}
