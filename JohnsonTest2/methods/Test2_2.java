/*
   name:       Jamie Johnson
   Assignment: CIS1500Test2 Methods
   Problem:    2
*/

public class Test2_2
{
  public static void main(String[] args)
  {
    int num1_int = 25;
    double num1_dub = 4;
    double result_int;
    double result_dub;

    result_int = DoubleIt(num1_int);
    System.out.println("int result is " + result_int);
    result_dub = DoubleIt(num1_dub);
    System.out.println("dub result is " + result_dub);
  }

  public static double DoubleIt(int x)
  {
    double num_s = x;
    double result = Math.sqrt(num_s);
    return result;
  }

  public static double DoubleIt(double x)
  {
    double result = Math.sqrt(x);
    return result;
  }
}
