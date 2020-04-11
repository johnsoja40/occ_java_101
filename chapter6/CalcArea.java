import javax.swing.JOptionPane;
public class CalcArea  //This program is an example of two different object being used within an application program
  {                    //objects are instantiated from within a method
  
    public static void main (String []args)
       {
         double area;         
         int selection;
                  
         selection = getSelection();
         area =findArea(selection);
         PrtRpt(selection, area);
         System.exit(0);      
  }
       public static int getSelection()
        {
          int x;
          String input;
           input =JOptionPane.showInputDialog("\n\n Select a Shape \n1  Square\n2 Rectangle \n3  Triangle \n4 Circle");
          x = Integer.parseInt(input);
          return x;
        }
       public static double findArea(int x)
       {
         double r,y=0;
         switch(x)
          {
            case 4:  r =Double.parseDouble(JOptionPane.showInputDialog("What is the radius of your Circle"));
                    Circle myCircle = new Circle(r); 
                    y= myCircle.area();
                    
                    break;
            case 1: r =Double.parseDouble(JOptionPane.showInputDialog("What is the length of a side of your square"));
                    Quad mySquare = new Quad (r);
                    y= mySquare.area();
             }
           return y;
        }
        public static void PrtRpt (int x,double y)
          {
            switch(x)
              {
                case 1: System.out.println("square "+ y);
                       break;
                case 4: System.out.println("Circle " + y);
              }
          }
 }                      


 
