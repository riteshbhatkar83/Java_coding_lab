//Q) Ask age if age is less than 18 you are not allowed to watch movie

import java.util.*;   
class Selection2
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);                
        int age = 0;

        System.out.println("Enter your Age :");

        age = sobj.nextInt();

        if (age >= 18)
        {
            System.out.println("Allowed");
        }
        else
        {
            System.out.println("Not Allowed");
        }
    }
}





















