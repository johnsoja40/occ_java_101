/*
   name:       Jamie Johnson
   Assignment: CIS1500Test2 Objects
   Problem:    1
*/

public class Cube
{
  private int length;
  private int width;
  private int height;

  public void setLength(int len)
  {
    length = len;
  }

  public void setWidth(int w)
  {
      width = w;
  }

  public void setHeight(int h)
  {
    height = h;
  }

  public int getLength()
  {
    return length;
  }

  public int getWidth()
  {
    return width;
  }

  public int getHeight()
  {
    return height;
  }

  public int totVolume()
  {
    return length * width * height;
  }
}
