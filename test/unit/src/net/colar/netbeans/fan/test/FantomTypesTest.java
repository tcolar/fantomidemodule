/*
 * Thibaut Colar Mar 24, 2010
 */

package net.colar.netbeans.fan.test;

import net.colar.netbeans.fan.types.FanResolvedType;
import net.jot.testing.JOTTester;

/**
 * Test type resolution
 * @author thibautc
 */
public class FantomTypesTest extends FantomCSLTest
{

	@Override
	public void cslTest() throws Throwable
	{
		// Testing isCompatible()
		JOTTester.checkIf("Compatibility of Enum vs Obj", FanResolvedType.isTypeCompatible(mkt("sys::Enum"), mkt("sys::Obj")));
		JOTTester.checkIf("Compatibility of Obj vs Obj", FanResolvedType.isTypeCompatible(mkt("sys::Obj"), mkt("sys::Obj")));
		JOTTester.checkIf("Compatibility of mixin vs Obj", ! FanResolvedType.isTypeCompatible(mkt("web::Weblet"), mkt("sys::Obj")));
		JOTTester.checkIf("Compatibility of Button vs Obj", FanResolvedType.isTypeCompatible(mkt("fwt::Button"), mkt("sys::Obj")));
		JOTTester.checkIf("Compatibility of Button vs widget", FanResolvedType.isTypeCompatible(mkt("fwt::Button"), mkt("fwt::Widget")));
		// Testing getParent()
		FanResolvedType t = mkt("sys::Actor");
		FanResolvedType p = FanResolvedType.getParentType(t);
		JOTTester.checkIf("Actor parent is Obj", p.getDbType().getQualifiedName().equals("sys::Obj"), p.toString());
		t = mkt("sys::Weekday");
		p = FanResolvedType.getParentType(t);
		JOTTester.checkIf("Weekday parent is Enum", p.getDbType().getQualifiedName().equals("sys::Enum"), p.toString());
		t = mkt("sys::Enum");
		p = FanResolvedType.getParentType(t);
		JOTTester.checkIf("Enum parent is Obj", p.getDbType().getQualifiedName().equals("sys::Obj"), p.toString());
		t = mkt("web::Weblet");
		p = FanResolvedType.getParentType(t);
		JOTTester.checkIf("Mixin parent is null", p==null, p==null?"null":p.toString());
	}

	private FanResolvedType mkt(String qType)
	{
		return FanResolvedType.makeFromDbType(null, qType);
	}

	public static void main(String[] args)
	{
		try
		{
			JOTTester.singleTest(new FantomTypesTest(), false);
		} catch (Throwable t)
		{
			t.printStackTrace();
		}
	}
}
