import Marvellous.PPA;
import Marvellous.LB;
import Marvellous.Infosystem.Python;

class packageDemo
{
    public static void main(String A[])
    {
        PPA pobj = new PPA();
        LB lobj = new LB();
        Python pyobj = new Python();

        pobj.PPA_fun();
        lobj.LB_fun();
        pyobj.Python_fun();
    }
}


//import Marvellous.*;  we only get PPA and LB .class file not Python.class file
//import Marvellous.Infosystem.*; we only get Python.class file