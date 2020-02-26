/*
   name:       Jamie Johnson
   Assignment: 
   Problem:
*/

import java.util.Scanner;
import java.io.*;

public class FileWriteDemo
{
   public static void main(String args[]) throws IOException
   {
    
    String filename;
    String friend_name;
    int num_friends;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("How many friends do you have? ");
    num_friends = keyboard.nextInt();
    
    keyboard.nextLine();
    
    System.out.print("Enter a file name: ");
    filename = keyboard.nextLine();
    
    PrintWriter outputFile = new PrintWriter(filename);
    
    for ( int i = 1; i <= num_friends; i++)
    {
      System.out.print("Enter the name of friend number " + i + ": ");
      friend_name = keyboard.nextLine();
      
      outputFile.println(friend_name);      
    }
    
    outputFile.close();
    System.out.println("Data written to file.");
    }
}
