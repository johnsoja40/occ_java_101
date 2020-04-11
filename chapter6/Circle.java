 class Circle
{

   private double PII =3.14;//fields
   private double area;
   private double radius;
   
  public Circle (double x)//constructor 
     {
       radius = x;
     }
  public double area()//methods that interact with other classes
    {
      
       area = PII*radius * radius;
       return area;
    }
}         