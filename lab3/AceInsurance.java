/*
   name:       Jamie Johnson
   Assignment: Lab #3
   Problem:    Ace Insurance Company
*/

import java.util.Scanner;
import java.io.*;

public class AceInsurance
{
   public static void main(String args[]) throws IOException
   {
     String input_f = "ins_data";
     String output_f = "Ace_Insurance_Premium_Quote";
     int d_num;
     int d_age;
     double rate;
     double init_prem;
     double new_prem = 0;

     File file_in = new File(input_f);
     if(!file_in.exists())
     {
       System.out.println("File Not Found");
       System.exit(1);
     }

     File file_out = new File(output_f);
     if(file_out.exists())
     {
       System.out.println("The " + output_f + " File already exists");
       System.exit(1);
     }

     Scanner input_file = new Scanner(file_in); //ins_data

     while(input_file.hasNext())
     {
       d_num = input_file.nextInt();
       d_age = input_file.nextInt();
       init_prem = input_file.nextDouble();

       switch (d_age) {
         case 16:
         case 17:
          rate = 0.20;
          new_prem = (init_prem * rate) + init_prem;
          break;
         case 18:
          rate = 0.19;
          new_prem = (init_prem * rate) + init_prem;
          break;
        case 19:
        case 20:
          rate = 0.17;
          new_prem = (init_prem * rate) + init_prem;
          break;
        case 21:
          rate = 0.15;
          new_prem = (init_prem * rate) + init_prem;
          break;
        case 22:
          rate = 0.13;
          new_prem = (init_prem * rate) + init_prem;
          break;
        default:
          System.out.print("Driver age not supported.");
      }

      FileWriter fwriter = new FileWriter(output_f, true); //Ace_Insurance_Premium_Quote
      PrintWriter output_file = new PrintWriter(fwriter);
      output_file.printf("%-5d   %-3d %-6.2f  %-6.2f\n", d_num, d_age, init_prem, new_prem);
      output_file.close();
     }

     input_file.close();
   }
}
