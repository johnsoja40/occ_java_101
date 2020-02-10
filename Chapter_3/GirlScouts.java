/*
   name:       Jamie Johnson
   Assignment: Programming Challenges
   Problem:    
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GirlScouts
{
   public static void main(String args[])
   {

      int boxes;
      
      boxes = Integer.parseInt(JOptionPane.showInputDialog("How many boxes of cookies did you sell ? "));
         
      if ( boxes >= 250 )
         System.out.println("You win a laptop.");
      else if ( boxes >= 100 )
         System.out.println("You win a portable DVD player.");
      else if ( boxes >= 50 )
         System.out.println("You win an iPod.");
      else
         System.out.println("You suck at life.");           
      
      System.exit(0);
      
   }   
}