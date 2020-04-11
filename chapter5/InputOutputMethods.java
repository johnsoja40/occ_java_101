import java.util.Scanner;  //Need Scanner class to use the keyboard
import java.io.*;

public class InputOutputMethods 
  {
     public static void main (String [] args) throws IOException
      {
                          
         Scanner inputFile=getInputFile();
         PrintWriter outFile= getOutputFile();
         processData(inputFile, outFile);
       }
      public static Scanner getInputFile()throws IOException
            {
                Scanner keyboard = new Scanner(System.in);
                String inputFilename;
                
                System.out.print("Enter input filename");//uses sales2.txt and sales2018.txt
                inputFilename = keyboard.nextLine();
         
                File file = new File(inputFilename);
                Scanner inputFile = new Scanner(file);
                
                return inputFile;
             }
       public static  void processData( Scanner inputFile, PrintWriter outFile)throws IOException
             { 
               int code;
               int id;
               int years;
               double sales;
         
               double salesTot = 0;
               
               
               while(inputFile.hasNext())
                {
                  id = inputFile.nextInt();
                  code = inputFile.nextInt();
                  years = inputFile.nextInt();
                  sales = inputFile.nextDouble();
            
                  salesTot +=sales;
                  prtRpt(outFile,id,code,years,sales);
                       
           }
           outFile.printf("Total Sales = %9.2f",salesTot);
           outFile.close();
           inputFile.close();
 

      }
            
     public static PrintWriter getOutputFile()throws IOException       
        { 
         Scanner keyboard = new Scanner(System.in);
         String outputFilename;
         
         System.out.print("Enter output filename");
         outputFilename = keyboard.nextLine();
         
         File file2 = new File(outputFilename);/* Only needed if error checking then put file object instead of outputFilename*/        
         PrintWriter outFile = new PrintWriter(file2);

         return outFile;
       }
     public static void prtRpt(PrintWriter outFile, int x, int y,int z, double m)throws IOException    
       {
            outFile.printf("%-5d%-3d%3d%12.2f",x,y, z,m);
            outFile.println();   
       } 
  }    