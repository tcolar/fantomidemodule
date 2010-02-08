using netColarJco::JcoConData

class Jco3Con
{
	Int i1
	Str:Int m1; [Str:Int] m2
	[Str:Int]:Str m3
	[Str:Int]:[Int:Str] m4
	[Str:Int]?[]?:[Int:Str]? m5
	[Str:Int][]:[Int:Str]?[] m6
	[Str:Int][]:[Int:Str]?[] m7
}

**
** Impl of destination provider
**
class DestinationDataProviderImpl : DestinationDataProvider
{}
