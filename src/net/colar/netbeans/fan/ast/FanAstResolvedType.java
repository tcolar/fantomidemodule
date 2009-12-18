/*
 * Thibaut Colar Dec 3, 2009
 */
package net.colar.netbeans.fan.ast;

/**
 * Value of a resolved type (Fan or Java)
 * Maybe use an interface/abstract class later.
 * @author thibautc
 */
public class FanAstResolvedType
{
	fan.sys.Type typeObj;
	types kind = types.FAN;

	public enum types
	{

		UNRESOLVED, FAN
	}

	/**
	 * @param obj
	 */
	private FanAstResolvedType(fan.sys.Type obj)
	{
		typeObj = obj;
		if (obj == null)
		{
			kind = kind.UNRESOLVED;
		}
	}

	static FanAstResolvedType makeUnresolved()
	{
		return new FanAstResolvedType(null);
	}

	public static FanAstResolvedType makeFromFanType(fan.sys.Type fanType)
	{
		return  new FanAstResolvedType(fanType);
	}

	public fan.sys.Type getType()
	{
		return typeObj;
	}

	public types getKind()
	{
		return kind;
	}


	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(kind.toString());
		if (typeObj != null)
		{
			sb = sb.append(" [").append(typeObj.toString()).append("]");
		}
		return sb.toString();
	}

	public boolean isNullable()
	{
		if(isUnresolved())
			return false;
		return typeObj.isNullable();
	}

	public boolean isUnresolved()
	{
		return kind == types.UNRESOLVED;
	}
}
