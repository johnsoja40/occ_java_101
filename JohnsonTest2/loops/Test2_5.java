/*
   name:       Jamie Johnson
   Assignment: CIS1500Test2 Loops
   Problem:    5
*/
import java.util.Scanner;

public class Test2_5
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    int x = 1;
    do {
        System.out.print ("Please enter a whole number, enter 0 to stop:  ");
        x = keyboard.nextInt();
    } while ( x > 0 );
  }
}
