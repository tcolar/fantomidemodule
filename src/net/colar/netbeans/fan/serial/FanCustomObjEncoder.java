/*
 * Thibaut Colar Dec 16, 2009
 */
package net.colar.netbeans.fan.serial;

import fan.sys.FanDecimal;
import fan.sys.FanFloat;
import fan.sys.FanObj;
import fan.sys.Field;
import fan.sys.Func;
import fan.sys.FuncType;
import fan.sys.IOErr;
import fan.sys.List;
import fan.sys.Map;
import fan.sys.MapType;
import fan.sys.Method;
import fan.sys.OutStream;
import fan.sys.StrBufOutStream;
import fan.sys.Symbol;
import fan.sys.Sys;
import fan.sys.Type;
import fanx.serial.Literal;
import fanx.serial.ObjEncoder;
import fanx.util.OpUtil;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Copy of objectEncoder with special code in _wType to support java types
 * Transform "[java]" into "__java__"
 * See small changes in writeObj and _wType
 * TODO: remove this ugly stuff once Fantom support java object serialization builtin
 * @author thibautc
 */
public class FanCustomObjEncoder extends ObjEncoder

{

	public FanCustomObjEncoder(OutStream out, Map map)
	{
		super(out, map);
		this.out=out;
		if (map != null) initOptions(map);
	}

	public static String encode(Object obj)
	{
		StrBufOutStream out = new StrBufOutStream();
		new FanCustomObjEncoder(out, null).writeObj(obj);
		return out.string();
	}

	public void writeSymbols(Map symbols)
	{
		indent = 2;
		Iterator it = symbols.pairsIterator();
		while (it.hasNext())
		{
			Entry entry = (Entry) it.next();
			String key = (String) entry.getKey();
			Object val = entry.getValue();
			_w(key)._w("=").writeObj(val);
			_w("\n");
		}
	}

	public void writeObj(Object obj)
	{
		if (obj == null)
		{
			_w("null");
			return;
		}

		if (obj.getClass().getName().charAt(0) == 'j')
		{
			if (obj instanceof Boolean)
			{
				_w(obj.toString());
				return;
			}
			if (obj instanceof String)
			{
				_wStrLiteral(obj.toString(), '"');
				return;
			}
			if (obj instanceof Long)
			{
				_w(obj.toString());
				return;
			}
			if (obj instanceof Double)
			{
				FanFloat.encode((Double) obj, this);
				return;
			}
			if (obj instanceof BigDecimal)
			{
				FanDecimal.encode((BigDecimal) obj, this);
				return;
			}
		}

		if (obj instanceof Literal)
		{
			((Literal) obj).encode(this);
			return;
		}

		Type type = FanObj.type(obj);

		// Thib
		if (type.isJava())
		{
			writeComplex(type, obj);
		}// end thib
		else if (type.facet(symSimple, null, true) == Boolean.TRUE)
		{
			writeSimple(type, obj);
		} else if (type.facet(symSerializable, null, true) == Boolean.TRUE)
		{
			writeComplex(type, obj);
		} else
		{
			if (skipErrors)
			{
				_w("null /* Not serializable: ")._w(type.qname())._w(" */");
			} else
			{
				throw IOErr.make("Not serializable: " + type).val;
			}
		}
	}

//////////////////////////////////////////////////////////////////////////
// Simple
//////////////////////////////////////////////////////////////////////////
	private void writeSimple(Type type, Object obj)
	{
		_wType(type)._w('(')._wStrLiteral(FanObj.toStr(obj), '"')._w(')');
	}

//////////////////////////////////////////////////////////////////////////
// Complex
//////////////////////////////////////////////////////////////////////////
	private void writeComplex(Type type, Object obj)
	{
		_wType(type);

		boolean first = true;
		Object defObj = null;
		if (skipDefaults)
		{
			defObj = FanObj.type(obj).make();
		}

		List fields = type.fields();
		for (int i = 0; i < fields.sz(); ++i)
		{
			Field f = (Field) fields.get(i);

			// skip static, transient, and synthetic (once) fields
			if (f.isStatic() || f.isSynthetic() ||
				f.facet(symTransient, false) == Boolean.TRUE)
			{
				continue;
			}

			// get the value
			Object val = f.get(obj);

			// if skipping defaults
			if (defObj != null)
			{
				Object defVal = f.get(defObj);
				if (OpUtil.compareEQ(val, defVal))
				{
					continue;
				}
			}

			// if first then open braces
			if (first)
			{
				_w('\n')._wIndent()._w('{')._w('\n');
				level++;
				first = false;
			}

			// field name =
			_wIndent()._w(f.name())._w('=');

			// field value
			curFieldType = f.of().toNonNullable();
			writeObj(val);
			curFieldType = null;

			_w('\n');
		}

		// if collection
		if (type.facet(symCollection, null, true) == Boolean.TRUE)
		{
			first = writeCollectionItems(type, obj, first);
		}

		// if we output fields, then close braces
		if (!first)
		{
			level--;
			_wIndent()._w('}');
		}
	}

//////////////////////////////////////////////////////////////////////////
// Collection (@collection)
//////////////////////////////////////////////////////////////////////////
	private boolean writeCollectionItems(Type type, Object obj, boolean first)
	{
		// lookup each method
		Method m = type.method("each", false);
		if (m == null)
		{
			throw IOErr.make("Missing " + type.qname() + ".each").val;
		}

		// call each(it)
		EachIterator it = new EachIterator(first);
		m.invoke(obj, new Object[]
			{
				it
			});
		return it.first;
	}
	static final FuncType eachIteratorType = new FuncType(new Type[]
		{
			Sys.ObjType
		}, Sys.VoidType);

	class EachIterator extends Func.Indirect1
	{

		EachIterator(boolean first)
		{
			super(eachIteratorType);
			this.first = first;
		}

		public Object call(Object obj)
		{
			if (first)
			{
				_w('\n')._wIndent()._w('{')._w('\n');
				level++;
				first = false;
			}
			_wIndent();
			writeObj(obj);
			_w(',')._w('\n');
			return null;
		}
		boolean first;
	}

//////////////////////////////////////////////////////////////////////////
// List
//////////////////////////////////////////////////////////////////////////
	public void writeList(List list)
	{
		// get of type
		Type of = list.of();

		// decide if we're going output as single or multi-line format
		boolean nl = isMultiLine(of);

		// figure out if we can use an inferred type
		boolean inferred = false;
		if (list.type() == curFieldType)
		{
			inferred = true;
		}

		// clear field type, so it doesn't get used for inference again
		curFieldType = null;

		// if we don't have an inferred type, then prefix of type
		if (!inferred)
		{
			_wType(of);
		}

		// handle empty list
		int size = list.sz();
		if (size == 0)
		{
			_w("[,]");
			return;
		}

		// items
		if (nl)
		{
			_w('\n')._wIndent();
		}
		_w('[');
		level++;
		for (int i = 0; i < size; ++i)
		{
			if (i > 0)
			{
				_w(',');
			}
			if (nl)
			{
				_w('\n')._wIndent();
			}
			writeObj(list.get(i));
		}
		level--;
		if (nl)
		{
			_w('\n')._wIndent();
		}
		_w(']');
	}

//////////////////////////////////////////////////////////////////////////
// Map
//////////////////////////////////////////////////////////////////////////
	public void writeMap(Map map)
	{
		// get k,v type
		MapType t = (MapType) map.type();

		// decide if we're going output as single or multi-line format
		boolean nl = isMultiLine(t.k) || isMultiLine(t.v);

		// figure out if we can use an inferred type
		boolean inferred = false;
		if (t.equals(curFieldType))
		{
			inferred = true;
		}

		// clear field type, so it doesn't get used for inference again
		curFieldType = null;

		// if we don't have an inferred type, then prefix of type
		if (!inferred)
		{
			_wType(t);
		}

		// handle empty map
		if (map.isEmpty())
		{
			_w("[:]");
			return;
		}

		// items
		level++;
		_w('[');
		boolean first = true;
		Iterator it = map.pairsIterator();
		while (it.hasNext())
		{
			Entry e = (Entry) it.next();
			if (first)
			{
				first = false;
			} else
			{
				_w(',');
			}
			if (nl)
			{
				_w('\n')._wIndent();
			}
			Object key = e.getKey();
			Object val = e.getValue();
			writeObj(key);
			_w(':');
			writeObj(val);
		}
		_w(']');
		level--;
	}

	private boolean isMultiLine(Type t)
	{
		return t.pod() != Sys.SysPod;
	}

//////////////////////////////////////////////////////////////////////////
// Output
//////////////////////////////////////////////////////////////////////////
	public final FanCustomObjEncoder _wType(Type t)
	{
		// Thib: shameful hack to support java types
		String sig = t.signature();
		if(sig.startsWith("[java]"))
			sig=sig.replaceFirst("\\[java\\]","__java__");
		return _w(sig);
	}

	public final FanCustomObjEncoder _wStrLiteral(String s, char quote)
	{
		int len = s.length();
		_w(quote);
		// NOTE: these escape sequences are duplicated in FanStr.toCode()
		for (int i = 0; i < len; ++i)
		{
			char c = s.charAt(i);
			switch (c)
			{
				case '\n':
					_w('\\')._w('n');
					break;
				case '\r':
					_w('\\')._w('r');
					break;
				case '\f':
					_w('\\')._w('f');
					break;
				case '\t':
					_w('\\')._w('t');
					break;
				case '\\':
					_w('\\')._w('\\');
					break;
				case '"':
					if (quote == '"')
					{
						_w('\\')._w('"');
					} else
					{
						_w(c);
					}
					break;
				case '`':
					if (quote == '`')
					{
						_w('\\')._w('`');
					} else
					{
						_w(c);
					}
					break;
				case '$':
					_w('\\')._w('$');
					break;
				default:
					_w(c);
			}
		}
		return _w(quote);
	}

	public final FanCustomObjEncoder _wIndent()
	{
		int num = level * indent;
		for (int i = 0; i < num; ++i)
		{
			_w(' ');
		}
		return this;
	}

	public final FanCustomObjEncoder _w(String s)
	{
		int len = s.length();
		for (int i = 0; i < len; ++i)
		{
			out.writeChar(s.charAt(i));
		}
		return this;
	}

	public final FanCustomObjEncoder _w(char ch)
	{
		out.writeChar(ch);
		return this;
	}

//////////////////////////////////////////////////////////////////////////
// Options
//////////////////////////////////////////////////////////////////////////
	private void initOptions(Map options)
	{
		indent = option(options, "indent", indent);
		skipDefaults = option(options, "skipDefaults", skipDefaults);
		skipErrors = option(options, "skipErrors", skipErrors);
	}

	private static int option(Map options, String name, int def)
	{
		Long val = (Long) options.get(name);
		if (val == null)
		{
			return def;
		}
		return val.intValue();
	}

	private static boolean option(Map options, String name, boolean def)
	{
		Boolean val = (Boolean) options.get(name);
		if (val == null)
		{
			return def;
		}
		return val;
	}
//////////////////////////////////////////////////////////////////////////
// Fields
//////////////////////////////////////////////////////////////////////////
	static final Symbol symSimple = Sys.SysPod.symbol("simple");
	static final Symbol symSerializable = Sys.SysPod.symbol("serializable");
	static final Symbol symCollection = Sys.SysPod.symbol("collection");
	static final Symbol symTransient = Sys.SysPod.symbol("transient");
	OutStream out;
	int level = 0;
	int indent = 0;
	boolean skipDefaults = false;
	boolean skipErrors = false;
	Type curFieldType;
}
