/*
 * Thibaut Colar Feb 15, 2010
 */

package net.colar.fantom.interop;

/**
 *
 * @author thibautc
 */
public class NoSuchFantomItemException extends RuntimeException
{
	public NoSuchFantomItemException(String type)
	{
		this(type, (Throwable)null);
	}

	public NoSuchFantomItemException(String type, String slot)
	{
		this(type, slot, (Throwable)null);
	}

	public NoSuchFantomItemException(String type, Throwable cause)
	{
		super("No such Fantom Type: "+type, cause);
	}

	public NoSuchFantomItemException(String type, String slot, Throwable cause)
	{
		super("No such Fantom Slot: "+type+"."+slot, cause);
	}
}
