using netColarJco::JcoConData

class Jco3Con
{
/*
ml comment
*/
	Int i1
	Str:Int m1; [Str:Int] m2 //eol comment
	[Str:Int]:Str m3
// line comment
	[Str:Int]:[Int:Str] m4
	[Str:Int]?[]?:[Int:Str]? m5
	[Str:Int][]:[Int:Str]?[] m6
	[Str:Int][]:[Int:Str]?[] m7

}

/* incomplete ml comment <- parser should stop here at end of line

**
** Impl of destination provider
**
class DestinationDataProviderImpl : DestinationDataProvider
{
	static void myMethod(Str toto)
	{
		toto := "Thibaut"
		echo("hello $toto")
	}
}
