/*
 * Thibaut Colar Feb 5, 2010
 */
package net.colar.netbeans.fan.test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Date;
import net.colar.netbeans.fan.parboiled.FantomParser;
import net.jot.testing.JOTTestable;
import net.jot.testing.JOTTester;
import org.parboiled.Parboiled;
import org.parboiled.Rule;
import org.parboiled.common.StringUtils;
import org.parboiled.support.ParseTreeUtils;
import org.parboiled.support.ParsingResult;

/**
 * Test new parboiled based parser
 * @author thibautc
 */
public class FantomParserTest implements JOTTestable
{

	public void jotTest() throws Throwable
	{
		FantomParser parser = Parboiled.createParser(FantomParser.class);
		ParsingResult<Object> result = null;

		boolean singleTest = false; // just this one quick test
		if (singleTest)
		{ //TODO: with ifExpr it takes 9ms, whereas with condOrExpr  it takes <5
			//result = parser.parse(parser.condOrExpr(), "[wisp]");//caching run
			result = parse(parser, parser.fieldDef(), "Int a:=toto{}");
			testNodeName("FirstTest", result, "fieldDef","Int a:=toto{}");
			//System.out.println(ParseTreeUtils.printNodeTree(result));
			return;
		}
		// --- Full test Suite -------------
		//spacing
		result = parse(parser, parser.spacing(), "  \r \n\r\t	\n \u000c ");
		testNodeName("Spacing", result, "spacing");
		result = parse(parser, parser.spacing(), "   \n//fdsfdsfs\n	\t");
		testNodeName("Spacing2", result, "spacing");
		result = parse(parser, parser.spacing(), "   \n/*fdsfdsfs*/	\t");
		testNodeName("Spacing3", result, "spacing");
		result = parse(parser, parser.spacing(), "/* blah\nblu"); // unterminated ml comment
		testNodeName("Spacing4", result, "spacing", "/* blah\n"); // should match until \n
		// litterals
		result = parse(parser, parser.char_(), "'a'");
		testNodeName("Char", result, "char_", "'a'");
		result = parse(parser, parser.char_(), "'\\n'");
		testNodeName("Char2", result, "char_");
		result = parse(parser, parser.char_(), "'\\u5F9a'");
		testNodeName("Char3", result, "char_");
		result = parse(parser, parser.uri(), "`http://www.google.com/`");
		testNodeName("Uri", result, "uri");
		result = parse(parser, parser.strs(), "\"aa\"");
		testNodeName("String", result, "strs");
		result = parse(parser, parser.strs(), "\"aa\\r\\nbb\"");
		testNodeName("String 2", result, "strs", "\"aa\\r\\nbb\"");
		result = parse(parser, parser.strs(), "\"a \\n $toto \\$thingy \\t \\u5F39\"");
		testNodeName("String 3", result, "strs");
		result = parse(parser, parser.strs(), "\"gggfdgdfgfdgdfgkkjdlkewd erfreggreg gtrgtrtrgtrg trgtrgtrrtg rgrgtrgrtgrtg\"");
		testNodeName("String 4", result, "strs");
		result = parse(parser, parser.strs(), "\"\"\"a\"\"\"");
		testNodeName("3Quotes Str 1", result, "strs", "\"\"\"a\"\"\"");
		result = parse(parser, parser.strs(), "\"\"\"\"hello\" \"\"\"");
		testNodeName("3Quotes Str 2", result, "strs", "\"\"\"\"hello\" \"\"\"");
		result = parse(parser, parser.strs(), "\"\"\"\"hello\"\\n\"\" \"\"\"");
		testNodeName("3Quotes Str 3", result, "strs", "\"\"\"\"hello\"\\n\"\" \"\"\"");
		result = parse(parser, parser.dsl(), "Str<| dfdsfsd \\ \\n |  > dsfsd |>");
		testNodeName("DSL", result, "dsl", "Str<| dfdsfsd \\ \\n |  > dsfsd |>");
		// numbers
		result = parse(parser, parser.digit(), "7");
		testNodeName("Digit", result, "digit");
		result = parse(parser, parser.hexDigit(), "7");
		testNodeName("HexDigit", result, "hexDigit");
		result = parse(parser, parser.hexDigit(), "D");
		testNodeName("HexDigit2", result, "hexDigit");
		result = parse(parser, parser.hexDigit(), "d");
		testNodeName("HexDigit3", result, "hexDigit");
		result = parse(parser, parser.number(), "0X_5__A6_F");
		testNodeName("Number 1", result, "number");
		result = parse(parser, parser.number(), "0xCAFE_BABE");
		testNodeName("Number 2", result, "number");
		result = parse(parser, parser.number(), "1_000_000");
		testNodeName("Number 3", result, "number");
		result = parse(parser, parser.number(), "-89_039");
		testNodeName("Number 4", result, "number");
		result = parse(parser, parser.number(), "-.25");
		testNodeName("Number f 1", result, "number");
		result = parse(parser, parser.number(), "3.0f");
		testNodeName("Number f 2", result, "number");
		result = parse(parser, parser.number(), "3f");
		testNodeName("Number f 3", result, "number");
		result = parse(parser, parser.number(), "123_456.0f");
		testNodeName("Number f 4", result, "number");
		result = parse(parser, parser.number(), "3e6f");
		testNodeName("Number f 5", result, "number");
		result = parse(parser, parser.number(), "0.2e+6f");
		testNodeName("Number f 6", result, "number");
		result = parse(parser, parser.number(), "1_2.3_7e-5_6f");
		testNodeName("Number f 7", result, "number");
		result = parse(parser, parser.number(), "5f");
		testNodeName("Number f 8", result, "number");
		result = parse(parser, parser.number(), "4d");
		testNodeName("Number d 1", result, "number");
		result = parse(parser, parser.number(), "4.00");
		testNodeName("Number d 2", result, "number");
		result = parse(parser, parser.number(), "123_456d");
		testNodeName("Number d 3", result, "number");
		result = parse(parser, parser.number(), "0.2e+6D");
		testNodeName("Number d 4", result, "number");
		result = parse(parser, parser.number(), "1_2.3_7e-5_6");
		testNodeName("Number d 5", result, "number");
		// base items
		result = parse(parser, parser.doc(), "**\n");
		testNodeName("Doc", result, "doc");
		result = parse(parser, parser.doc(), "**\n** some doc\n");
		testNodeName("Multi Doc", result, "doc");
		result = parse(parser, parser.id(), "ab_FG09__");
		testNodeName("ID", result, "id");
		// types
		result = parse(parser, parser.typeAndOrId(), "ab_FG09__");
		testNodeName("TypeAndOrId", result, "typeAndOrId");
		result = parse(parser, parser.typeAndOrId(), "ab_FG09__ ab_FG09__");
		testNodeName("TypeAndOrId 2", result, "typeAndOrId", "ab_FG09__ ab_FG09__");
		result = parse(parser, parser.simpleType(), "myThingy");
		testNodeName("SimpleType", result, "simpleType");
		result = parse(parser, parser.simpleType(), "Email::email");
		testNodeName("SimpleType2", result, "simpleType");
		result = parse(parser, parser.mapType(), "[Sys::Str:Int]");
		testNodeName("MapType2", result, "mapType");
		result = parse(parser, parser.simpleMapType(), "Str:Int");
		testNodeName("MapType3", result, "simpleMapType");
		result = parse(parser, parser.simpleMapType(), "[Str:Int]:Str");
		testNodeName("MapType4", result, "simpleMapType");
		result = parse(parser, parser.mapType(), "[Str?[]?:Int?]");
		testNodeName("MapType5", result, "mapType");
		result = parse(parser, parser.mapType(), "[|Str->Int|:Int?]");
		testNodeName("MapType6", result, "mapType");
		result = parse(parser, parser.mapType(), "[Sys::Str:Sys::Int]");
		testNodeName("MapType7", result, "mapType");
		result = parse(parser, parser.formals(), "myThingy, Str myOtherThingy, [Str:Int] one5More");
		testNodeName("Formals", result, "formals");
		result = parse(parser, parser.funcType(), "|->|");
		testNodeName("FuncType1", result, "funcType");
		result = parse(parser, parser.funcType(), "|Sys::Str->|");
		testNodeName("FuncType2", result, "funcType");
		result = parse(parser, parser.funcType(), "|->Int|");
		testNodeName("FuncType3", result, "funcType");
		result = parse(parser, parser.funcType(), "|Str?[]? s, Int[]? i->[Str:Int?]?|");
		testNodeName("FuncType4", result, "funcType");
		result = parse(parser, parser.type(), "toto");
		testNodeName("Type", result, "type");
		result = parse(parser, parser.type(), "toto?");
		testNodeName("Type2", result, "type");
		result = parse(parser, parser.type(), "toto[]?");
		testNodeName("Type3", result, "type");
		result = parse(parser, parser.type(), "Str:email");
		testNodeName("Type4", result, "type");
		result = parse(parser, parser.type(), "[Str?[]?:Int]");
		testNodeName("Type5", result, "type");
		result = parse(parser, parser.type(), "|Str s, Int->Int|");
		testNodeName("Type6", result, "type");
		result = parse(parser, parser.type(), "Sys::Str?[]?");
		testNodeName("Type7", result, "type");

		// expressions
		result = parse(parser, parser.mapPair(), "doThis:doThat");
		testNodeName("Map pair", result, "mapPair", "doThis:doThat");
		result = parse(parser, parser.mapItems(), "doThis:doThat, a:b, c:d");
		testNodeName("Map items", result, "mapItems", "doThis:doThat, a:b, c:d");
		result = parse(parser, parser.map(), "[:]");
		testNodeName("Map 1", result, "map", "[:]");
		result = parse(parser, parser.map(), "[5:9]");
		testNodeName("Map 2", result, "map", "[5:9]");
		result = parse(parser, parser.map(), "[5:9,7:12]");
		testNodeName("Map 3", result, "map", "[5:9,7:12]");
		result = parse(parser, parser.map(), "Int:Str[5:9,7:12]");
		testNodeName("Map 4", result, "map", "Int:Str[5:9,7:12]");
		result = parse(parser, parser.map(), "[Int:Str][5:9,7:12]");
		testNodeName("Map 5", result, "map", "[Int:Str][5:9,7:12]");
		result = parse(parser, parser.map(), "[4:\"four\", 5f:\"five\"]");
		testNodeName("Map 6", result, "map", "[4:\"four\", 5f:\"five\"]");
		result = parse(parser, parser.closure(), "|->|{}");
		testNodeName("Closure 1", result, "closure", "|->|{}");
		result = parse(parser, parser.closure(), "|->|{i=5}");
		testNodeName("Closure 2", result, "closure", "|->|{i=5}");
		result = parse(parser, parser.closure(), "|val| {r += \"$val \"}");
		testNodeName("Closure 3", result, "closure", "|val| {r += \"$val \"}");
		result = parse(parser, parser.call(), "toto()");
		testNodeName("Call1", result, "call", "toto()");
		result = parse(parser, parser.call(), "toto(a, b)");
		testNodeName("Call2", result, "call", "toto(a, b)");
		result = parse(parser, parser.call(), "toto|->|{i=5}");
		testNodeName("Call3", result, "call", "toto|->|{i=5}");
		result = parse(parser, parser.call(), "toto(a, b)|->|{i=5}");
		testNodeName("Call4", result, "call", "toto(a, b)|->|{i=5}");
		result = parse(parser, parser.idExpr(), "toto");
		testNodeName("IdExpr1", result, "idExpr", "toto");//id
		result = parse(parser, parser.idExpr(), "*toto");
		testNodeName("IdExpr2", result, "idExpr", "*toto");//field
		result = parse(parser, parser.idExpr(), "blah()");
		testNodeName("IdExpr3", result, "idExpr", "blah()");//call
		result = parse(parser, parser.staticCall(), "toto.blah()");
		testNodeName("StaticCall1", result, "staticCall", "toto.blah()");
		result = parse(parser, parser.staticCall(), "toto.toto");
		testNodeName("StaticCall2", result, "staticCall", "toto.toto");
		result = parse(parser, parser.localDef(), "a:=23");
		testNodeName("localDef1", result, "localDef", "a:=23");
		result = parse(parser, parser.localDef(), "Int a:=23");
		testNodeName("localDef2", result, "localDef", "Int a:=23");
		result = parse(parser, parser.localDef(), "Int var");
		testNodeName("localDef5", result, "localDef", "Int var");
		result = parse(parser, parser.litteral(), "[4:\"four\", 5f:\"five\"]");
		testNodeName("litteral1", result, "litteral", "[4:\"four\", 5f:\"five\"]");
		result = parse(parser, parser.termExpr(), "[4:\"four\", 5f:\"five\"]");
		testNodeName("termExpr1", result, "termExpr", "[4:\"four\", 5f:\"five\"]");
		result = parse(parser, parser.parExpr(), "[4:\"four\", 5f:\"five\"]");
		testNodeName("parExpr1", result, "parExpr", "[4:\"four\", 5f:\"five\"]");
		result = parse(parser, parser.equalityExpr(), "[4:\"four\", 5f:\"five\"]");
		testNodeName("equalityExpr1", result, "equalityExpr", "[4:\"four\", 5f:\"five\"]");
		result = parse(parser, parser.condOrExpr(), "[4:\"four\", 5f:\"five\"]");
		testNodeName("condOrExpr1", result, "condOrExpr", "[4:\"four\", 5f:\"five\"]");
		result = parse(parser, parser.expr(), "toto.doit");
		testNodeName("expr1", result, "expr", "toto.doit");
		result = parse(parser, parser.expr(), "i=5");
		testNodeName("expr2", result, "expr", "i=5");
		result = parse(parser, parser.expr(), "[4:\"four\", 5f:\"five\"]");
		testNodeName("expr3", result, "expr", "[4:\"four\", 5f:\"five\"]");
		result = parse(parser, parser.expr(), "r += 4");
		testNodeName("expr4", result, "expr", "r += 4");
		result = parse(parser, parser.expr(), "5>3");
		testNodeName("expr5", result, "expr", "5>3");
		result = parse(parser, parser.if_(), "if(5>3)doit()");
		testNodeName("if1", result, "if_", "if(5>3)doit()");
		result = parse(parser, parser.if_(), "if(5>3)doit();else doThat();");
		testNodeName("if2", result, "if_", "if(5>3)doit();else doThat();");
		result = parse(parser, parser.if_(), "if(5>3+2){doThis();doThat()}");
		testNodeName("if3", result, "if_", "if(5>3+2){doThis();doThat()}");
		result = parse(parser, parser.if_(), "if(5>3+2){doThis();doThat()}else{doThat}");
		testNodeName("if4", result, "if_", "if(5>3+2){doThis();doThat()}else{doThat}");
		// TODO: many more expr

		// facets
		result = parse(parser, parser.facet(), "@Str");
		testNodeName("facet1", result, "facet", "@Str");
		result = parse(parser, parser.facet(), "@Sys::Str");
		testNodeName("facet2", result, "facet", "@Sys::Str");
		result = parse(parser, parser.facet(), "@Str{id=toto.doit}");
		testNodeName("facet3", result, "facet", "@Str{id=toto.doit}");
		result = parse(parser, parser.facet(), "@Str{id=toto.doit;name='c'\nstatus=25}");
		testNodeName("facet4", result, "facet", "@Str{id=toto.doit;name='c'\nstatus=25}");

		// stmt
		result = parse(parser, parser.stmt(), "toto.doit");
		testNodeName("stmt1", result, "stmt", "toto.doit");
		result = parse(parser, parser.stmt(), "i=5");
		testNodeName("Stmt2", result, "stmt", "i=5");
		result = parse(parser, parser.stmt(), "Int i:=5");
		testNodeName("Stmt3", result, "stmt", "Int i:=5");
		result = parse(parser, parser.stmt(), "Int i:=5+3");
		testNodeName("Stmt4", result, "stmt", "Int i:=5+3");
		result = parse(parser, parser.stmt(), "show([4:\"four\", 5f:\"five\"],\"same as above with type inference\")");
		testNodeName("Stmt5", result, "stmt", "show([4:\"four\", 5f:\"five\"],\"same as above with type inference\")");
		result = parse(parser, parser.block(), "i=5");
		testNodeName("Block", result, "block", "i=5");
		result = parse(parser, parser.block(), "{i=5}");
		testNodeName("Block2", result, "block", "{i=5}");
		result = parse(parser, parser.block(), "{i=5;k=7\n\nj=6}");
		testNodeName("Block3", result, "block", "{i=5;k=7\n\nj=6}");

		// Slot Def
		result = parse(parser, parser.fieldAccessor(), "{get{i=23}}");
		testNodeName("FieldAccesor1", result, "fieldAccessor", "{get{i=23}}");
		result = parse(parser, parser.fieldAccessor(), "{get{i=23}\nprivate set{}\n}");
		testNodeName("FieldAccesor2", result, "fieldAccessor", "{get{i=23}\nprivate set{}\n}");
		result = parse(parser, parser.fieldDef(), "Int a");
		testNodeName("FieldDef1", result, "fieldDef", "Int a");
		result = parse(parser, parser.fieldDef(), "private const Int a");
		testNodeName("FieldDef2", result, "fieldDef", "private const Int a");
		result = parse(parser, parser.fieldDef(), "static override readonly Int a:=23");
		testNodeName("FieldDef3", result, "fieldDef", "static override readonly Int a:=23");
		result = parse(parser, parser.fieldDef(), "Int a{get{i=23}\nprivate set{}\n}");
		testNodeName("FieldDef4", result, "fieldDef", "Int a{get{i=23}\nprivate set{}\n}");
		result = parse(parser, parser.fieldDef(), "Int a:=23{get{i=23}\nprivate set{}\n}");
		testNodeName("FieldDef5", result, "fieldDef", "Int a:=23{get{i=23}\nprivate set{}\n}");
		result = parse(parser, parser.methodDef(), "private static Void doit(Str a, Int b){}");
		testNodeName("MethodDef1", result, "methodDef", "private static Void doit(Str a, Int b){}");
		result = parse(parser, parser.methodDef(), "Void doit(Str s){i:=5}");
		testNodeName("MethodDef2", result, "methodDef", "Void doit(Str s){i:=5}");
		result = parse(parser, parser.methodDef(), "Void doit(Str s){Int i:=5\n\n\tj:=7}");
		testNodeName("MethodDef3", result, "methodDef", "Void doit(Str s){Int i:=5\n\n\tj:=7}");
		result = parse(parser, parser.ctorDef(), "Void new doIt(Str s){Int i:=5\n\n\tj:=7}");
		testNodeName("Ctor1", result, "ctorDef", "Void new doIt(Str s){Int i:=5\n\n\tj:=7}");
		result = parse(parser, parser.ctorDef(), "Void new doIt(Str s):this.make(null, last){Int i:=5\n\n\tj:=7}");
		testNodeName("Ctor2", result, "ctorDef", "Void new doIt(Str s):this.make(null, last){Int i:=5\n\n\tj:=7}");
		result = parse(parser, parser.ctorDef(), "Void new doIt(Str s):super(){Int i:=5\n\n\tj:=7}");
		testNodeName("Ctor3", result, "ctorDef", "Void new doIt(Str s):super(){Int i:=5\n\n\tj:=7}");

		// Type Def
		result = parse(parser, parser.typeDef(), "internal final class Dummy\n{Int var}");
		testNodeName("TypeDef - class", result, "typeDef", "internal final class Dummy\n{Int var}");
		result = parse(parser, parser.typeDef(), "internal final class Dummy:Toto, Tata, Tutu\n{Int var}");
		testNodeName("TypeDef - class2", result, "typeDef", "internal final class Dummy:Toto, Tata, Tutu\n{Int var}");
		result = parse(parser, parser.typeDef(), "internal mixin Dummy\n{Int var}");
		testNodeName("TypeDef - mixin", result, "typeDef", "internal mixin Dummy\n{Int var}");
		//TODO: enum class, inheritance, facet class
		//TODO: deal with enum val defs

		// Test real files   TODO: relative paths
		testFile("/home/thibautc/NetBeansProjects/Fan/test/parser_test/test.fan");
		testFile("/home/thibautc/NetBeansProjects/Fan/test/parser_test/hello.fan");
		testFile("/home/thibautc/NetBeansProjects/Fan/test/parser_test/files.fan");
		testFile("/home/thibautc/NetBeansProjects/Fan/test/parser_test/maps.fan");
		//testFile("/home/thibautc/NetBeansProjects/Fan/test/parser_test/sending.fan");
	}

	public ParsingResult<Object> parse(FantomParser parser, Rule rule, String input)
	{
		long start = new Date().getTime();
		ParsingResult<Object> result = parser.parse(rule, input);
		long time = new Date().getTime() - start;
		//System.err.println("Parsing in " + (new Date().getTime() - start) + "ms");
		if (time > 5)
		{
			System.err.println("Long parsing : "+(new Date().getTime() - start) + "ms, for:\n"+input);
			//System.err.println(ParseTreeUtils.printNodeTree(result));
		}
		return result;
	}

	public void testFile(String filePath) throws Exception
	{
		long start = new Date().getTime();
		FantomParser parser = Parboiled.createParser(FantomParser.class);

		DataInputStream dis = new DataInputStream(new FileInputStream(filePath));
		byte[] buffer = new byte[dis.available()];
		dis.readFully(buffer);
		dis.close();//TODO: finally
		String testInput = new String(buffer);

		ParsingResult<Object> result = parser.parse(parser.compilationUnit(), testInput);

		if (result.hasErrors())
		{
			System.err.println(StringUtils.join(result.parseErrors, "---\n"));
			System.err.println("Parse Tree:\n" + ParseTreeUtils.printNodeTree(result) + '\n');
		}
		JOTTester.checkIf("Parsing " + filePath, !result.hasErrors());
		System.out.println("Parsed " + filePath + " in " + (new Date().getTime() - start) + "ms");
	}

	public void testNodeName(String label, ParsingResult<Object> result, String nodeName) throws Exception
	{
		testNodeName(label, result, nodeName, null);
	}

	public void testNodeName(String label, ParsingResult<Object> result, String nodeName, String value) throws Exception
	{
		if (result.hasErrors())
		{
			System.err.println(label + " -> " + StringUtils.join(result.parseErrors, "---\n"));
			System.err.println(label + " -> " + ParseTreeUtils.printNodeTree(result));
		}
		JOTTester.checkIf(label + " - parsing success", !result.hasErrors());
		JOTTester.checkIf(label + " - root not null", result.parseTreeRoot != null);
		JOTTester.checkIf(label + " - check name(" + nodeName + ")", result.parseTreeRoot.getLabel().equals(nodeName), result.parseTreeRoot.getLabel());
		if (value != null)
		{
			String txt = ParseTreeUtils.getNodeText(result.parseTreeRoot, result.inputBuffer);
			JOTTester.checkIf(label + " - check value", txt.equals(value), "'" + value + "' VS '" + txt + "'");
		}
	}

	public static void main(String[] args)
	{
		try
		{
			JOTTester.singleTest(new FantomParserTest(), false);
		} catch (Throwable t)
		{
			t.printStackTrace();
		}
	}
}
