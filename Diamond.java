/*
   name:       Jamie Johnson
   Assignment: Extra Credit
   Problem:    Diamond Design
*/

import java.util.Scanner;

public class Diamond
{
  public static void main(String[] args)
  {
    int size;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("What size diamond would you like? ");
    size = keyboard.nextInt();

    for ( int r = 0; r < size; r++)
    {
      // System.out.print("row is: " + r + "\n");
      for ( int c = 0; c < size; c++)
      {
        // System.out.print("column is: " + c + "\n");
        System.out.print("column is: " + c + "\n");
      }
    }
  }
}
