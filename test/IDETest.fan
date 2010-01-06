using docLang
using fwt
using flux::JumpNextCommand
using [java] java.io::File as JFile

class IDETest : File, TableModel, TreeModel, JFile
{
  Str string := "blah"
  Int number := 25


  Void doit(Str s, Int i, Int s2)
  {
     bool := true
    string := "dfdff"
    uri := `fdsdfdsf`
    int := '\u1234'
    int2 := '\n'
    float := 25.3f // f or F
    decimal := 4.0 // anyhting with . but not a float
    decimal2 := 4d // (D or d))
    duration := 32ms // end with ns,ms,sec,min,hr,day
    type1 := Str#
    type2 := sys::Str#
    symbol := @symbol
    range := 0..5
    range2 := 0..<5
    //TODO: list, map


string.capitalize.contains(s2.abs).hash
    Actor.sleep(i.inverse)
    JFile.listRoots
    number.div(i.decrement)
    Int s := 23
    s.abs
  }
}


