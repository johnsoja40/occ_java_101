public class Rectangle //class to create a rectangle object
{
  private double length; //instance variable also called fields  
  private double width;  //declared outside the methods of the class
                         //only available to the class methods for use
                         //access is provate
  public Rectangle()                            //default constructor method length and width initialized to zero
    {                                           //primitives are initialized to zero, boolean to false, reference types to null
      length = 0;                               //good idea to write the default constructor
      width= 0;
    }
  public Rectangle(double l, double w)// constructor overload
   {
      length = l;
      width =w;
   }                                                          
  public void setLength( double len)//the two "set" methods store the passed data into the private
  {                                 //length and width instance variables mutators--not needed if you have a constructor method 
    length = len;                   //may be called to later change the values 
  }
  
  public void setWidth(double w)    //access is public.  keyword static not used
  {
    width = w;
  }
  
  public double getLength()        //the three  "get" methods return the data to the application--accessors
  {
    return length;             //length is known to the object
    
  }
  public double getWidth()
  {
    return width;
  }
  public double getArea()         //Calculates the area 
  {
    return length * width;
  }
  
 }