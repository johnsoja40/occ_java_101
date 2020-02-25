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
      for ( int c = 0; c < ; c++)
      {
        System.out.println("*");
      }
    }
  }
}
