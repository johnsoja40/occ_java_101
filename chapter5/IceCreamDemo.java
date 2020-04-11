//Methods using JOptionPane for input and PrintWriter for output
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
public class IceCreamDemo
  {
     public static void main(String [] args)throws IOException       
      {
         
         int item=1;
         int amtSundaes, amtShakes, amtCones;
         double iceCream;
         double nuts;
         double sauce;
         int cones;
         
          //input
          amtSundaes = getData(item);  //demonstrates use of ++
          amtShakes=getData(++item);   
          amtCones = getData(++item);
          //processing
          iceCream = calcIce(amtSundaes,amtShakes, amtCones);
          sauce = calcSauce(amtSundaes,amtShakes);
          nuts = calcNuts(amtSundaes, amtCones);
          cones = calcCones(amtCones);
          //output
          
          prtRpt(iceCream,nuts,sauce,cones);
          System.exit(0);    
       }
       
      public static int getData(int x)        
        {
           
           String input;
           int amount;
           int ex;
           
            if (x==1)
             input = JOptionPane.showInputDialog("Enter number of sundaes sold");
             else
                if(x==2)
                   input = JOptionPane.showInputDialog("Enter number of shakes sold");
                   else
                     input = JOptionPane.showInputDialog("Enter number of cones sold");

           amount = Integer.parseInt(input); 
           return amount;
         }      
      public static double calcIce(int x, int y, int z)
      
      {
         double totIce;
         
         totIce = (x * 8 + y * 10 + z * 6)/32.0;
         return totIce;                            
                    
      }
     public static double calcNuts(int x, int y)      
      {
         double totNuts;
         
         totNuts = (x * 2 + y)/16.0;
         return totNuts;                            
                    
    }

     public static double calcSauce(int x, int y)      
      {
         double totSauce;
         
         totSauce = (x * 3 + y * 2)/32.0;
         return totSauce;                            
                    
    }

     public static int calcCones(int x)
      
      {
         int totCones;
         
         totCones = x/12;
         if (x % 12 > 0)
            totCones++;
         return totCones;                            
                    
       }
       
      public static void prtRpt(double x, double y, double z,int a)throws IOException
         {
         String outputFilename;
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Enter output filename");
         outputFilename = keyboard.nextLine();
         
          File file = new File(outputFilename);
          if(file.exists())
            {
              System.out.println("Output File Exists");
              System.exit(0);
            }       
          PrintWriter outFile = new PrintWriter(file);           
           outFile.printf("Ice Cream %10.2f Quarts",x);
           outFile.println();            
           outFile.printf("Nuts %15.2f Pounds",y);
           outFile.println();
           outFile.printf("Sauce %14.2f Quarts",z);
           outFile.println();            
            
           outFile.printf("Cones %10d%11s ",a,"Units");
           outFile.println();            

           outFile.close();      
         }        
          
}          
          
              