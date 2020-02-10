/*
   name:       Jamie Johnson
   Assignment: Programming Challenges
   Problem:    9
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Mileage
{
   public static void main(String args[])
   {
      int ending_miles;
      int beginning_miles;
      double gals_pumped;
      double mpg;
      String beg = "BEGGINING MILEAGE";
      String end = "ENDING MILEAGE";
      String gal = "GALLONS PUMPED";
      String mpg_str = "MPG";
      
      ending_miles = Integer.parseInt(JOptionPane.showInputDialog("What is the ending milage ? "));
      beginning_miles = Integer.parseInt(JOptionPane.showInputDialog("What was the beginning milage ? "));
      gals_pumped = Double.parseDouble(JOptionPane.showInputDialog("How many gallons pumped ? "));
      
      mpg = (ending_miles - beginning_miles) / gals_pumped;
      
      System.out.printf("%-17s%7d\n",beg,beginning_miles);
      System.out.printf("%-17s%7d\n",end,ending_miles);
      System.out.printf("%-17s%7.1f\n\n",gal,gals_pumped);
      System.out.printf("%12s%12.1f\n",mpg_str,mpg);
      
      System.exit(0);
      
   }   
}