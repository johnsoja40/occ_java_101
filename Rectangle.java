/*
   name:       Jamie Johnson
   Assignment: Extra Credit
   Problem:    Rectangle Design
*/

import java.util.Scanner;

public class Rectangle
{
  public static void main(String[] args)
  {
    int r;
    int c;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("How many columns would you like your rectangle to have? ");
    c = keyboard.nextInt();

    System.out.print("How many rows would you like your rectangle to have? ");
    r = keyboard.nextInt();

    for ( int x = 0; x < r; x++)
    {
      for ( int y = 0; y < c ; y++)
      {
        System.out.print("#");
      }
      System.out.println(" #");
    }
  }
}
