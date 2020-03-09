/*
   name:       Jamie Johnson
   Assignment: Lab #1
   Problem:
*/

import java.util.Scanner;

public class CableCompany
{
   public static void main(String args[])
   {

     int account_num;
     String account_type_input;
     char account_type;
     int premium_channels;
     int service_connections;

     Scanner keyboard = new Scanner(System.in);

     System.out.println("Please enter the current cable account number: ");
     account_num = keyboard.nextInt();
     System.out.println("account_num is: " + account_num);

     System.out.println("Please enter the number of premium channels : ");
     premium_channels = keyboard.nextInt();
     System.out.println("premium_channels is: " + premium_channels);

     keyboard.nextLine();

     System.out.println("Please enter the cable account type (R for residential or B for Business): ");
     account_type_input = keyboard.nextLine();
     // int account_type_input_len = Integer.toString(account_type_input).length();
     // System.out.println("account_type_input_len is: " + account_type_input_len);
     if ( account_type_input.length() > 1 )
     {
        account_type = account_type_input.charAt(0);
        switch (account_type)
        {
          case 'r':
          case 'R':
            System.out.println("account_type is: " + account_type);
            break;
          case 'b':
          case 'B':
            System.out.println("Please enter the amount of Basic Service Connections: ");
            service_connections = keyboard.nextInt();
            System.out.println("service_connections are: " + service_connections);
            break;
          default:
            System.out.println("account_type should be eith Residential or Business.");
        }
     }
     else
     {
       System.out.println("You entered more than one character for the Account Type.");
       System.out.println("Please enter either R or B.");
       System.exit(1);
     }

     // System.out.printf("\n%23s\n\n", header);
     // System.out.printf("%21s%12d\n", quarter_str, num_quarters);
     // System.out.printf("%18s%15d\n", dime_str, num_dimes);
     // System.out.printf("%20s%13d\n", nickel_str, num_nickels);
     // System.out.printf("%20s%13d\n", remainder_str, input_pennies);
     //
     keyboard.close();

   }
}
