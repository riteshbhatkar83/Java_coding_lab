//Q) Ask age if age is less than 18 you are not allowed to watch movie

import java.util.*;   
class Selection3
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);                
        int age = 0;                //initalize variable to  0 good pratcic

        System.out.println("Enter your Age :");

        age = sobj.nextInt();

        if (age < 18)
        {
            System.out.println("Not Allowed");
        }
        else
        {
            System.out.println("Allowed 😘");    // 18 is allowed ok
        }
    }
}

//include trick 
//for to while 




















