/*
   name:       Jamie Johnson
   Assignment: CIS1500Test2 File I/O
   Problem:    1
*/

import java.util.Scanner;
import java.io.*;

public class Test2_1
{
  public static void main(String[] args) throws IOException
  {
    int x;
    File file = new File("numbers.txt");
    Scanner inputFile = new Scanner(file);

    int amount = 0;
    for (int i = 1; i <=8; i++)
    {
      x = inputFile.nextInt();
      if (( x % 4) == 0)
        amount++;
      else
        amount += 0;
    }
    System.out.println("amount is: " + amount);
  }
}
