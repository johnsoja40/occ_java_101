/*
   name:       Jamie Johnson
   Assignment: CIS1500Test2 Loops
   Problem:    2
*/

public class Test2_2
{
  public static void main(String[] args)
  {
    int j;
    int ct = 20;
    for (int x = 1; x < 3; x ++)
    {
      for(int y = 8; y >4; y-=2)
        ct *= 2;
        j  =  ct /4;
        System.out.println("ct is: " + ct);
        System.out.println("j is: " + j);
    }
  }
}
