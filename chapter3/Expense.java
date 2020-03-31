/*
   name:       Jamie Johnson
   Assignment: Programming Challenges
   Problem:    9
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Expense
{
   public static void main(String args[])
   {

      double l_x;
      double d_x;
      
      l_x = Double.parseDouble(JOptionPane.showInputDialog("What was the amount you spent for lunch ? "));
      d_x = Double.parseDouble(JOptionPane.showInputDialog("What was the amount you spend on dinner ? "));
      
      /*    
      if ( l_x > 20 )
         System.out.println("You'll need to fill out form 2031.");
      else
         System.out.println("No form required lunch.");
         
      if ( d_x > 50 )
         System.out.println("You'll need to fill out form 2032.");
      else
         System.out.println("No form required for dinner.");
      */
         
      if ( l_x > 20 && d_x > 50 )
         System.out.println("You'll need to fill out form 2031 for lunch and form 2032 for dinner.");
      else if ( l_x > 20 )
         System.out.println("You'll need to fill out form 2031 for lunch.");
      else if ( d_x > 50 )
         System.out.println("You'll need to fill out form 2032 for dinner.");
      else
         System.out.println("No forms required.");         
      
      System.exit(0);
      
   }   
}