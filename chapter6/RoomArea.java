import javax.swing.JOptionPane;

public class RoomArea  //Uses the rectangle class for room sizes--application program
{
  public static void main(String [] args)
   {
     double number;
     double totalArea;
     String input;
                                          //3 objects are created
     Rectangle kitchen = new Rectangle(); //uses the default constructor written in the object class code
     Rectangle bedroom = new Rectangle(); //length and width are set to zero
     Rectangle den     = new Rectangle();
     
     input= JOptionPane.showInputDialog(" what is the kitchen's length");
     number = Double.parseDouble(input);
     kitchen.setLength(number);              
     
     input= JOptionPane.showInputDialog(" what is the kitchen's width");
     number = Double.parseDouble(input);
     kitchen.setWidth(number);
     
     input= JOptionPane.showInputDialog(" what is the bedrooms's length");
     number = Double.parseDouble(input);
     bedroom.setLength(number);
     
     input= JOptionPane.showInputDialog(" what is the bedroom's width");
     number = Double.parseDouble(input);
     bedroom.setWidth(number);
     
     input= JOptionPane.showInputDialog(" what is the den's length");
     number = Double.parseDouble(input);
     den.setLength(number);
     
     input= JOptionPane.showInputDialog(" what is the den's width");
     number = Double.parseDouble(input);
     den.setWidth(number);
     
     totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
     
     JOptionPane.showMessageDialog(null, "The total area of the room is  " + totalArea);
     
     System.exit(0);
     
     
     }
     
  }



