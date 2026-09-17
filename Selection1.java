//Q) Accept no from user check even or odd

import java.util.*;   //package is folder contain <realted> .class file in it  //in bag (bag is package)seperated box 1box-rumal, 2box-tshirt, 3box-pants, 4box-util

class Selection1
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);                
        int No = 0;

        System.out.println("Enter your Number :");

        No = sobj.nextInt();

        if ((No % 2) == 0)       // take bracket
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}


//operater - 
// 1)(Arthamatic) /  , %                
//2)(comparison) == (aamhi dogha sarkah aahe) , (Assignment) = (tarnsfer data)

//buffered
//jar tar cha visay


// 🔹 Step 1: What you said (slightly corrected)
// “We create object of Scanner class and call function nextInt()”

// ✔️ Correct 👍

// Scanner sobj = new Scanner(System.in);
// int No = sobj.nextInt();

// sobj → object of Scanner
// nextInt() → method (function) that reads an integer


// 🔹 Step 2: So where is the buffer? 
// 👉 Important point:
// You are NOT creating the buffer.

// 👉 The buffer is already created by the system (inside Java / OS).

// 🔹 Step 3: Flow (very important)

// When you type input:

// Keyboard → Input Buffer → Scanner → Your variable (No)
// Explanation:
// You type 5 ⌨️
// It goes into input buffer (temporary memory)
// Scanner.nextInt() reads from that buffer

// Value stored in:

// int No = 5;


















