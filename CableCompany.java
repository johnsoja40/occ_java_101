/*
   name:       Jamie Johnson
   Assignment: Lab #2
   Problem:
*/

import java.util.Scanner;

public class CableCompany
{
   public static void main(String args[])
   {

     int account_num = 0;
     String account_type_input;
     char account_type;
     int premium_channels;
     int service_connections;
     double total = 0;
     double bus_serv_fee_total;
     final double res_proc_fee = 4.50;
     final double res_serv_fee = 20.50;
     final double res_prem_fee = 7.50;
     final double bus_proc_fee = 15.00;
     final double bus_serv_fee = 75.00;
     final double bus_prem_fee = 50.00;

     Scanner keyboard = new Scanner(System.in);

     System.out.println("Please enter the cable account type (R for residential or B for Business): ");
     account_type_input = keyboard.nextLine();

     if ( account_type_input.length() == 1 )
     {
       account_type = account_type_input.charAt(0);
       if ( account_type == 'r' )
       {
         System.out.println("This program requires you pass in an upper case R for Residential Accounts.");
         System.out.println("The application will now close.");
         System.exit(0);
       }
       if ( account_type == 'b' )
       {
         System.out.println("This program requires you pass in an upper case B for Business Accounts.");
         System.out.println("The application will now close.");
         System.exit(0);
       }

       System.out.println("Please enter the current cable account number: ");
       account_num = keyboard.nextInt();

       System.out.println("Please enter the number of premium channels : ");
       premium_channels = keyboard.nextInt();

       switch (account_type)
       {
         case 'R':
           total = res_proc_fee + res_serv_fee + res_prem_fee;
           break;
         case 'B':
           System.out.println("Please enter the amount of Basic Service Connections: ");
           service_connections = keyboard.nextInt();
           if ( service_connections > 10 )
           {
             bus_serv_fee_total = ((service_connections - 10) * 5) + bus_serv_fee;
           }
           else
           {
             bus_serv_fee_total = bus_serv_fee;
           }
           total = bus_proc_fee + bus_serv_fee_total + bus_prem_fee;
           break;
         default:
           System.out.println("account_type should be either Residential or Business.");
        }
     }
     else
     {
       System.out.println("You entered more than one character for the Account Type.");
       System.out.println("This application can only handle Residential (R) or Business (B).");
       System.exit(0);
     }

     System.out.printf("\n%20s %10s\n","Account Number", account_num);
     System.out.printf("\n%16s        $%6.2f\n\n", "Amount Due", total);
     keyboard.close();
   }
}
