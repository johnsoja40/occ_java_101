 class Shape 
{
  private double length; //instance variable also called fields  
  private double width;  //declared outside the methods of the class
  private double PII = 3.14;
  private double radius;        //only available to the class methods for use
  private double height;
  private double side1,side2,side3;
  
  //overloaded constructor methods
  public Shape()
  {
  }                                                
  public Shape (double s)      
    {
      side1 = s;           //creates a square
    }
 public Shape (double l,double w)
    {
      length = l;         //creates a rectangle
      width = w;
    }
public Shape (double s1,double s2,double s3,double h)
    {
      side1 = s1;
      side2 = s2;         //creates a triangle
      side3 = s3;
     height = h;
    }
public Shape (char x,double r)
    {
      radius = r; 
    } 
 public double perimeter (int x)      
    {
    
      double p=0;
      switch (x)
       {
         case 1:
                p = 4*side1;   //perimeter of a square

                break;
         case 2: 
                p = 2 * (length + width);   //perimeter of a rectangle
                break;
         case 3:
                p = side1 + side2 + side3;  //perimeter of a triangle
                break;
         case 4:
                p = 2 * PII * radius;       //circumference of a circle
                break;
       }                
         return p;              
    }
}
 