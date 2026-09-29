


abstract class Base
{
    
    public int i,j;

    public int Addition(int no1, int no2)                  //1000      //rent house
     {
        return no1 + no2;
     }

    public abstract int Substract(int no1, int no2);    //----          //javabdari  aapla ghar banava c aahe
}


class Derived extends Base
{
    
     public int x;
                                                                        //rent wala automatic mula la bhetla
     public int Substract(int no1, int no2)              //2000         //mula ne ghar banavla 
     {
        return no1 - no2;
     }

     public int Multplicat(int no1, int no2)           //3000
     {
        return no1 * no2;
     }

}

class pureVirtualX{
      public static void main(String[] args) {
         

      {
         Derived dobj = new Derived();
         int Ret = 0;

        

         Ret = dobj.Addition(11,12);
         System.out.println("Add is : " + Ret);

         Ret = dobj.Substract(11,12);
         System.out.println("sub is : " + Ret);

         Ret = dobj.Multplicat(11,12);
         System.out.println("mult is : " + Ret);
        
      
   }
      }
}