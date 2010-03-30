// To change this License template, choose Tools / Templates
// and edit Licenses / FanDefaultLicense.txt
//
// History:
//   30-Jan-2010  tcolar  Creation

**
** Main
**
class Main
{

  **
  ** Main method
  **
  static Void main()
  {
    Int counter := 0
    //ok
    list := ["one", "two", "three"]
    //ok
    f := |->| { echo("hi there") }
    //ok
    g := |->Int| { return ++counter }
    //ok
    list.each |Str val| { echo(val.decapitalize) }
    // Failed infference
    list.each |val| { val.upper }
    // Failed infference
    list.each |v, i| { v.upper }
    // ok
    ["a", "b", "c"].each |Str s| { echo(s.upper) }
    // Failed infference
    ["a", "b", "c"].each |s| { echo(s.upper) }
    //ok
    stuff := this.typeof.inheritance.findAll |Type type, Type type2 -> Bool|
        {type2.doc ;return type.isAbstract}
    stuff[0].base
    // Failed infference - it
    ["a", "b", "c"].each { echo(it.upper) }
  }


}


