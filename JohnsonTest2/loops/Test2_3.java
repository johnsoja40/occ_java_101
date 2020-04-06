/*
   name:       Jamie Johnson
   Assignment: CIS1500Test2 Loops
   Problem:    3
*/

public class Test2_3
{
  public static void main(String[] args)
  {
    int d = 15;
    int a = 10;
    int c = 3;
    int x = 4;

    while (x > 0 )
    {
      switch (x)
      {
        case 1:
          a +=c;
          break;
        case 2:
        case 3:
          d *= 2;
          break;
        case 4:
          c += d;
          break;
        default:
          a++;
          d--;
          c--;
        }
      System.out.println("d is: " + d);
      System.out.println("a is: " + a);
      System.out.println("c is: " + c);
      x--;
    }
  }
}
