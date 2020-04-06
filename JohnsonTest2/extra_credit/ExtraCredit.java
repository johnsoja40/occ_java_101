/*
   name:       Jamie Johnson
   Assignment: CIS1500Test2 ExtraCredit
   Problem:    ExtraCrdit
*/

public class ExtraCredit
{
  public static void main(String[] args)
  {
    int q, k, m, x, t;
    x = 6;
    for (q = 0, k = 3, m = 7; k < m; k *= 2, m +=2)
    {
      t = 5;
      System.out.println("q = " + q + " k = " + k + " m = " + m + " x = " + x + " t = " + t );
      while (x ++ % --t > 0)
        q --;
      System.out.println("t = " + t);
    }
    System.out.println("q =" + q);
    System.out.println("k = " + k);
    System.out.println("m = " + m);
    System.out.println("x = " + x);
  }
}
