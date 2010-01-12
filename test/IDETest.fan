using fwt::Window

public class IDETest : Class2
{
  Void doit(Str s, Int i)
  {
    f := |->Obj| { list }
    g := f.toImmutable

    verifyEq(|Int a, Float b->Bool|#.params, ["A":Int#, "B":Float#, "R":Bool#])
    verifyEq(|Int a, Float b->Bool|#.params.isRO, true)

    t := Str#
      m := t.method("toInt")

    proc := makeProc { mergeErr=false }

  }
  Process makeProc(Str[] args := Str[,])
  {
    cmd := (Repo.boot.home + (isWindows ? `bin/fan.exe` : `bin/fan`)).osPath
    return Process([cmd, Type.of(this).qname].addAll(args))
  }

  Void verifyJoin(Int:Str map, Int sep, Str[] expected, |Str,Int->Str|? f)
  {
    actual := map.join(sep.toChar, f).split(sep)
    verifyEq(actual.sort, expected.sort)
    verifyEq(map.join(sep.toChar), map.join(sep.toChar, null))
  }

}

public class Class2
{
  Str toto:=""
}


