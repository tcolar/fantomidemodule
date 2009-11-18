// To change this License template, choose Tools / Templates
// and edit Licenses / FanDefaultLicense.txt
//
// History:
//   Aug 24, 2009  thibautc  Creation
//
using sys::toto as tata
using [java] java.lang.Blah
using sys::Buf

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
        Main().doStuff
    }
    
    Void doStuff()
    {
        echo("Debug: "+Sys.env["fan.debug"])
                Actor.sleep(10sec)
                Pod.list.each |Pod p|
                {
                    echo(p)
                }
                other := Other()
                Actor.sleep(20sec)
                echo("done")
    }
}


