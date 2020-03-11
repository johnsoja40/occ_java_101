/*
   name:       Jamie Johnson
   Assignment: Programming Challenges
   Problem:    Methods are new to me
*/

import java.util.Scanner;

public class Mileage2
{
   public static void main(String args[])
   {
      int ending_miles;
      int beginning_miles;
      double gals_pumped;
      double mpg;
      
      Scanner keyboard = new Scanner(System.in);
      
      beginning_miles = b_miles(keyboard);
      ending_miles = e_miles(keyboard);
      gals_pumped = gallons(keyboard);
      mpg = calc_mpg(beginning_miles, ending_miles, gals_pumped);
      prt_rpt(mpg);
      
   }
      
   public static int e_miles(Scanner keyboard)
   {
      int x;
      System.out.println("What is the ending milage ? ");
      x = keyboard.nextInt();
      return x;
   }
   
   public static int b_miles(Scanner keyboard)
   {
      int x;
      System.out.println("What was the beginning milage ? ");
      x = keyboard.nextInt();
      return x;
   }
   
   public static double gallons(Scanner keyboard)
   {
      double x;
      System.out.println("How many gallons pumped ? ");
      x = keyboard.nextInt();
      return x;
   }
   
   public static double calc_mpg(int x, int y, double z)
   {
      double m;
      m = (y - x)/z;
      return m;
   }
   
   public static void prt_rpt(double m)
   {
      System.out.println("\n\nMiles per gallon " + m );
   }
       
}