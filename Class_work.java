/*
   name:       Jamie Johnson
   Assignment: Lab #1
   Problem:
*/

import java.util.Scanner;

public class Class_work
{
   public static void main(String args[])
   {

     int num1;
     int num2;
     int num3;
     int largest;

     Scanner keyboard = new Scanner(System.in);

     System.out.println(" ");
     num1 = keyboard.nextInt();
     
     System.out.println(" ");
     num2 = keyboard.nextInt();
     
     System.out.println(" ");
     num3 = keyboard.nextInt();
              
     if ( num1 > num2 )
      if (num1 > num3 )
       largest = num1;
      else
       largest = num3;
     else
      if ( num2 > num3 )
       largest = num2;
      else 
       largest = num3;
       
      System.out.println("The largest number is " + largest );
      
     System.exit(0);      

   }
}
