import java.util.Scanner;

/*
   name:       Jamie Johnson
   Assignment: Programming Challenges
   Problem:    2
*/

public class Answer2
{
   public static void main(String args[])
   {
   
      int month;
      int day;
      String year;
      
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter a two digit year... ");
      year = keyboard.nextLine();
      
      if ( year.length() != 2 )
      {
         System.out.println("You entered a year that is more than two digits.");
         System.out.println("The program will now exit.");
         System.exit(1);
      }
      
      System.out.print("Please enter a month in numeric form...");
      month = keyboard.nextInt();
      
      System.out.print("Please enter a day in numeric form...");
      day = keyboard.nextInt();
    
   }   
}