public class LengthDemo
  {
  
    public static void main (String []args)//application program
       {
         Rectangle box = new Rectangle();//creates an instance of a rectangle
         double myArea;
         
         box.setLength(10.0);  //mutator method
         box.setWidth(5.0);
         myArea =box.getArea();  //access method
         
         System.out.println(myArea);
       }  
  }       