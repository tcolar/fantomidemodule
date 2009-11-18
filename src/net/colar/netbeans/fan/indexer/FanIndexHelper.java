/*
 * Thibaut Colar Sep 2, 2009
 */
package net.colar.netbeans.fan.indexer;

import java.util.Collection;
import java.util.Collections;
import org.netbeans.modules.parsing.spi.indexing.support.QuerySupport;
import org.netbeans.modules.parsing.spi.indexing.support.QuerySupport.Kind;
import org.openide.filesystems.FileObject;

/**
 *
 * @author thibautc
 */
public class FanIndexHelper
{
	private static  QuerySupport getQuerySupport(FileObject fo)
	{
		QuerySupport qs=null;
		Collection<FileObject> roots = QuerySupport.findRoots(fo, null, null, null);
		try
		{
			qs = QuerySupport.forRoots(FanIndexerFactory.NAME, FanIndexerFactory.VERSION, roots.toArray(new FileObject[roots.size()]));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return qs;
	}
	public static Collection findRootTypes(FileObject fo, String prefix)
	{
		QuerySupport qs = getQuerySupport(fo);
		if(qs!=null)
			return query(qs, FanIndexer.INDEX_CLASS, prefix, QuerySupport.Kind.CASE_INSENSITIVE_PREFIX, (String[])null);
		return Collections.EMPTY_SET;
		// enums ?? - yes
		//mixins ?? - no ?
	}

	public static Collection query(QuerySupport qs, String fieldName, String fieldValue, Kind kind, final String[] fieldsToLoad)
	{
		try
		{
			Collection c = qs.query(FanIndexer.INDEX_CLASS, "A", Kind.CASE_INSENSITIVE_PREFIX, fieldsToLoad);
			return c;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return Collections.EMPTY_SET;
		}
	}
	// Types that can be inherited from
	// public void findInheritTypes()
	//public void findClasses()
	//public void findMixins()
	//public void findEnums()
	//public void findEnumValues()


}
