/*
   name:       Jamie Johnson
   Assignment: 
   Problem:
*/

import java.util.Scanner;

public class Loops
{
   public static void main(String args[])
   {
     
//      for ( int n = 4; n <= 14; n += 2)            
//       System.out.println("n is: " + n);

//         for ( int n = 100; n <= 350; n += 50)
//          System.out.println("n is: " + n);

//      int x;
//      int count = 0;
//      
//      Scanner keyboard = new Scanner(System.in);
// 
//      System.out.println("Please enter a number");
//      x = keyboard.nextInt();
//    
//      while( x != -1 )
//      {
//         if ( x % 2 != 0 )
//         {
//             count ++;
//         }
//         System.out.println("Please enter another number ");
//         x = keyboard.nextInt();
//      }
//      System.out.println("There were " + count + " odd numbers");

     int q;
     final int quarter = 4;
     
     Scanner keyboard = new Scanner(System.in);

     System.out.println("Please enter the number of quarters you have... ");
     q = keyboard.nextInt();
     
     q %= quarter;
     
     System.out.println("You have " + q + " quarters.");

   }
}
