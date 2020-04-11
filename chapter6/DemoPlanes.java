public class DemoPlanes
{
   public static void main(String [] args)
   {
      Plane delta401 = new Plane();
      Plane united701 = new Plane();
      
      delta401.setPass(3);
      delta401.oneMoreAboard();
      united701.setPass(10);
      delta401.setPass(-2000000);
      System.out.println(delta401.getPass());
   }
}


class Plane
{
   private final int MAX = 50; //constant defined outide the methods
   
   private int pass;          //object field defined outside the methods
                              //no constructor so pass is set to 0
   public int getPass()       //method
   {
      return pass;
   }
   
   public void oneMoreAboard() //method
   {
      if (pass < MAX)          //simple error checking 
         pass++;
   }
   
   public void setPass(int numPass)
   {
      if (numPass >= 0 && numPass <= MAX)
      {
         pass = numPass;
      }
   }
}