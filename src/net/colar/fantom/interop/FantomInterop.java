package net.colar.fantom.interop;

import fan.sys.Err;
import fan.sys.FanObj;
import fan.sys.Type;

/*
 * Thibaut Colar Feb 15, 2010
 */

/**
 *
 * @author thibautc
 */
public class FantomInterop
{
	// Todo: constriutor calls (make)

	public static FanObj createObj(String qualifiedType) throws NoSuchFantomItemException
	{
		return (FanObj) resolveType(qualifiedType).make();
	}

	public static FanObj callMethod(FanObj type, String method, Object... params)
	{
		return (FanObj) type.typeof().method("parseStr").call(params);
	}

	public static FanObj callMethod(String qualifiedType, String staticMethod)
	{
		return callMethod(createObj(qualifiedType), staticMethod);
	}

	public static Type resolveType(String qualifiedType) throws NoSuchFantomItemException
	{
		// TODO: cache in hash ?
		try
		{
			return Type.find(qualifiedType);
		}
		catch(Throwable e)
		{
			throw new NoSuchFantomItemException(qualifiedType, e);
		}
	}

	/*
	 * FanObj parser = (FanObj) Type.find("fandoc::FandocParser").make();
			FanObj doc = (FanObj) parser.typeof().method("parseStr").call(parser, fandoc);
			Buf buf = Buf.make();
			FanObj writer = (FanObj) Type.find("fandoc::HtmlDocWriter").method("make").call(buf.out());
			doc.typeof().method("write").call(doc, writer);
			html = buf.flip().readAllStr();
	 */
}
