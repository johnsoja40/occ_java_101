/*
   name:       Jamie Johnson
   Assignment: Lab #1
   Problem:
*/

import java.util.Scanner;

public class ANS
{
   public static void main(String args[])
   {

     int x = 50;
     int y = 55;
     int ans = 35;

     if ( x >= y )
      {
        ans  = y + 10;
        x -= y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("ans = " + ans);
      }
      else
      {
        ans  = y + 10;
        y += x;
        y = y + x
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("ans = " + ans);
      }
   }
}
