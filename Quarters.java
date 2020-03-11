/*
   name:       Jamie Johnson
   Assignment: Programming Challenges
   Problem:    Methods are new to me
*/

import java.util.Scanner;

public class Quarters
{
   public static void main(String args[])
   {
      double amt_quarters;
      double dollars;
      
      Scanner keyboard = new Scanner(System.in);
      
      amt_quarters = get_quarters(keyboard);
      dollars = quarters_2_dollars(amt_quarters);
      
   }
   
   public static double get_quarters(Scanner keyboard)
   {
      double x;
      System.out.println("How many quarters ? ");
      x = keyboard.nextInt();
      return x;
   }
   
   public static void quarters_2_dollars(amt_quarters)
   {
     double x;
     x /= 4;
     System.out.println("The dollar amount is: " + x );
   }
       
}