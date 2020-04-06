/*
   name:       Jamie Johnson
   Assignment: CIS1500Test2 Loops
   Problem:    4
*/

public class Test2_4
{
  public static void main(String[] args)
  {
    int m;
    int j;
    int k;
    for ( m = 1; m <= 5; m++ )
    {
      for (j = 1; j <= 3; j++)
      {
        for (k=1; k<= 4; k++)
          System.out.print('*');
        System.out.println();
        }
      System.out.println();
    }
  }
}
