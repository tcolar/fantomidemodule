/*
 * Thibaut Colar Mar 22, 2010
 */

package net.colar.netbeans.fan.types;

import net.colar.netbeans.fan.indexer.model.FanType;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.jot.persistance.JOTTransaction;

/**
 *
 * @author thibautc
 */
public class FanResolvedNullType extends FanResolvedType
{
	public FanResolvedNullType(AstNode node)
	{
		super(node, "null", new FanNullType());
	}

	/**
	 * Dummy Fan type to carry "null"
	 */
	static class FanNullType extends FanType
	{
		public FanNullType()
		{
			super.id=-2;
			super.isAbstract=false;
			super.isConst=false;
			super.isFinal=false;
			super.pod="null";
			super.protection=0;
			super.qualifiedName="null:null";
			super.simpleName="null";
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
}
