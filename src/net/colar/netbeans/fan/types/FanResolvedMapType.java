/*
 * Thibaut Colar Jan 8, 2010
 */

package net.colar.netbeans.fan.types;

/**
 *
 * @author thibautc
 */
public class FanResolvedMapType extends FanResolvedType
{
	FanResolvedType keyType;
	FanResolvedType valType;

	public FanResolvedMapType(FanResolvedType keyType, FanResolvedType valType)
	{
		super("sys::Map");
		this.keyType = keyType;
		this.valType = valType;
	}

	public FanResolvedType getKeyType()
	{
		return keyType;
	}

	public FanResolvedType getValType()
	{
		return valType;
	}

	@Override
	public String getSignature(boolean fullyQualified)
	{
		return "["+keyType.getSignature(fullyQualified)+" : "+valType.getSignature(fullyQualified)+"]";
	}

}
