// To change this License template, choose Tools / Templates
// and edit Licenses / FanDefaultLicense.txt
//
// History:
//   Aug 24, 2009  thibautc  Creation
//

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
                Actor.sleep(10sec)
                Pod.list.each |Pod p|	{echo(p)}
                Actor.sleep(20sec)
                echo("done")
    }
}


