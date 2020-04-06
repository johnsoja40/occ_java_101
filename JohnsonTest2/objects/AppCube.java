/*
   name:       Jamie Johnson
   Assignment: CIS1500Test2 Methods
   Problem:    2
*/

public class AppCube
{
  public static void main(String[] args)
  {
    Cube red = new Cube();
    red.setLength(13);
    red.setWidth(11);
    red.setHeight(8);

    System.out.println("The Cube's length is: " + red.getLength());
    System.out.println("The Cube's width is: " + red.getWidth());
    System.out.println("The Cube's height is: " + red.getHeight());
  }
}
