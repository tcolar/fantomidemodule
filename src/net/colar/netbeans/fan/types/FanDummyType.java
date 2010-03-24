package net.colar.netbeans.fan.types;

import net.colar.netbeans.fan.indexer.model.FanType;
import net.jot.persistance.JOTTransaction;

/**
 * Dummy type to carry virtual type such as "null"
 * and unknown types.
 * @author tcolar
 */
public class FanDummyType extends FanType
{

	public FanDummyType()
	{
		super.id = -2;
		super.isAbstract = false;
		super.isConst = false;
		super.isFinal = false;
		super.pod = "n/a";
		super.protection = 0;
		super.qualifiedName = "n/a:n/a";
		super.simpleName = "n/a";
	}

	@Override
	public void delete() throws Exception
	{
		throw new RuntimeException("Dummy FanType!");
	}

	@Override
	public void delete(JOTTransaction trans) throws Exception
	{
		throw new RuntimeException("Dummy FanType!");
	}

	@Override
	public void save() throws Exception
	{
		throw new RuntimeException("Dummy FanType!");
	}

	@Override
	public void save(JOTTransaction transaction) throws Exception
	{
		throw new RuntimeException("Dummy FanType!");
	}
}
