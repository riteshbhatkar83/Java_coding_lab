
class Marvellous
{
    public int No1;    // 2 characterstic 
    public int No2;

    public void fun()    //if Marvellous we write that goes like constructor
    {
        System.out.println("Inside Fun 😘");    //1 beheviour
    }

}

class Encapsulation 
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        mobj.fun();

        System.out.println(mobj.No1);
        System.out.println(mobj.No2);

    }
}


//>javac Encapsulation.java -- 2 class create for different 2 classes