/*
   name:       Jamie Johnson
   Assignment: 
   Problem:
   Page:       129
*/

import java.util.Scanner;

public class Switch
{
   public static void main(String args[])
   {

     int num_checks;
     double fee = 10.00;
     int checks;

     Scanner keyboard = new Scanner(System.in);

     System.out.println("How many checks were used this month? ");
     num_checks = keyboard.nextInt();
 
     checks = num_checks/10;
 
     switch (checks)
     {
       case 0:     
       case 1: fee += num_checks*.10;
               break;
       case 2:
       case 3: fee += num_checks*.08;
               break;
       case 4:
       case 5: fee += num_checks*.06;
               break;
       default: fee += num_checks*.04;
     }
      
      System.out.println("The base fee for the month is: " + fee );  
      
     System.exit(0);      

   }
}
