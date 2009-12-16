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
    string.capitalize.contains(s2.abs).hash
    Actor.sleep(i.inverse)
    JFile.listRoots
    number.div(i.decrement)
    Int s := 23
    s.abs
  }
}


