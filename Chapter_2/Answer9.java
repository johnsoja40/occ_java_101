/*
   name:       Jamie Johnson
   Assignment: Programming Challenges
   Problem:    9
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Answer9
{
   public static void main(String args[])
   {
      int ending_miles;
      int beginning_miles;
      double gals_pumped;
      
      /*
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the ending miles... ");
      ending_miles = keyboard.nextInt();
      
      System.out.print("Please enter the beginning miles... ");
      beginning_miles = keyboard.nextInt();
      
      System.out.print("Please enter the number of gallons used... ");
      gals_pumped = keyboard.nextDouble();
            
      double mpg = (ending_miles - beginning_miles) / gals_pumped;
      
      System.out.println("Your MPG are " + mpg);
      */
      
      ending_miles = Integer.parseInt(JOptionPane.showInputDialog("What is the ending milage ? "));
      beginning_miles = Integer.parseInt(JOptionPane.showInputDialog("What was the beginning milage ? "));
      gals_pumped = Integer.parseInt(JOptionPane.showInputDialog("How many gallons pumped ? "));
      
      double mpg = (ending_miles - beginning_miles) / gals_pumped;
      
      //JOptionPane.showMessageDialog(null, "Your MPG is " + mpg);
      System.out.printf("BEGGINING MILEAGE
      
      System.exit(0);
      
   }   
}