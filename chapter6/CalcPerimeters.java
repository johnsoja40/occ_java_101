import javax.swing.JOptionPane;
public class CalcPerimeters
  {
  
    public static void main (String []args)
       {
         Shape myShape; //I want one
                  
                   
         double perimeter;
         int selection;
         
         selection =getSelection();
         myShape = createShape(selection);
         perimeter = myShape.perimeter(selection);         
         System.out.println("Perimeter of your shape is " + perimeter);
       }
       public static int getSelection()
        {
          int x;
          String input;
           input =JOptionPane.showInputDialog("\n\n Select a Shape \n1  Square\n2 Rectangle \n3  Triangle \n4 Circle");
          x = Integer.parseInt(input);
          return x;
        }
       public static Shape createShape (int x)
        {
          double y,a,b;
          String input;
          Shape z= new Shape();
          switch (x)
            {
               case 1:  input =JOptionPane.showInputDialog("What is the length of the side of your square");
                        y = Double.parseDouble(input);
                        z = new Shape(y);
                        break;
               case 2:  input =JOptionPane.showInputDialog("What is the length of  your rectangle");
                        a = Double.parseDouble(input);
                        input =JOptionPane.showInputDialog("What is the width of  your rectangle");
                        b = Double.parseDouble(input);
                        z = new Shape(a,b);
         
             }           

            return z;
         }
        
        
       
            
  }       