/*
 * Thibaut Colar Jan 8, 2010
 */

package net.colar.netbeans.fan.types;

/**
 *
 * @author thibautc
 */
public class FanResolvedListType extends FanResolvedType
{
	FanResolvedType itemType;

	public FanResolvedListType(FanResolvedType itemType)
	{
		super("sys::List");
		this.itemType = itemType;
	}

	public FanResolvedType getItemType()
	{
		return itemType;
	}

	@Override
	public String toTypeSig(boolean fullyQualified)
	{
		return itemType.toTypeSig(fullyQualified)+"[]";
	}
}
