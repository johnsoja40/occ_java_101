/*
   name:       Jamie Johnson
   Assignment: Lab #1
   Problem:
*/

import java.util.Scanner;

public class Pennies
{
   public static void main(String args[])
   {

     int input_pennies;
     int num_quarters;
     int num_dimes;
     int num_nickels;
     final int quarter = 25;
     final int dime = 10;
     final int nickel = 5;
     final String header = "Coin Conversion";
     final String quarter_str = "Number of Quarters";
     final String dime_str = "Number of Dimes";
     final String nickel_str = "Number of Nickels";
     final String remainder_str = "Remaining Pennies";

     Scanner keyboard = new Scanner(System.in);

     System.out.println(" ");
     input_pennies = keyboard.nextInt();

     int input_pennies_len = Integer.toString(input_pennies).length();

     if (input_pennies_len > 4 )
     {
       System.out.println("This program is only able to handle 9999 pennies.");
       System.out.println("The application will now exit.");
       System.exit(1);
     }

     num_quarters = input_pennies / quarter;
     input_pennies -= (num_quarters * quarter);
     num_dimes = input_pennies / dime;
     input_pennies -= (num_dimes * dime);
     num_nickels = input_pennies / nickel;
     input_pennies -= (num_nickels * nickel);

     System.out.printf("\n%23s\n\n", header);
     System.out.printf("%21s%12d\n", quarter_str, num_quarters);
     System.out.printf("%18s%15d\n", dime_str, num_dimes);
     System.out.printf("%20s%13d\n", nickel_str, num_nickels);
     System.out.printf("%20s%13d\n", remainder_str, input_pennies);

   }
}
