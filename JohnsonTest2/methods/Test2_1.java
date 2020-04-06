/*
   name:       Jamie Johnson
   Assignment: CIS1500Test2 Methods
   Problem:    1
*/

import java.util.Scanner;
import java.io.*;

public class Test2_1
{
  public static void main(String[] args) throws IOException
  {
    int result,num1,num2,num3;

    File data_file = new File("data");
    Scanner inputFile = new Scanner(data_file);

    num1 = inputFile.nextInt();
    num2 = inputFile.nextInt();
    num3 = inputFile.nextInt();

    result = maximum(num1,num2,num3);
    System.out.println("Maximum is " + result);
  }
  public static int maximum(int x, int y, int z)
  {
    int maxValue = x;
    if (y > maxValue)
      maxValue = y;
    if(z > maxValue)
      maxValue = z;
    return maxValue;
  }
}
