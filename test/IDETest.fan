
class IDETest
{
  Void doit(Str s, Int i)
  {
    bool := true
    string := "dfdff"
    uri := `fdsdfdsf`
    int := '\u1234'
    int2 := '\n'
    float := 25.3f
    decimal := 4.0
    decimal2 := 4.53d
    duration := 32ms
    type1 := Str# // FIXME
    type2 := sys::Str# // FIXME
    symbol := @serializable //FIXME
    range := 0..5 //FIXME -> Int
    range2 := 0..<5 //FIXME -> Int
    list := [,]//FIXME
    list2 := [5,6]//FIXME
    list3 := ["gg","xx"]//FIXME
    map := [:]//FIXME
    map2 := ["toto":25]//FIXME
    this_ := this//FIXME
    super_ := super//FIXME
    super2_ := Obj.super

    File f := File(``)
    {
        it_ := it//FIXME
    }
    //TODO: list, map

  }
}


