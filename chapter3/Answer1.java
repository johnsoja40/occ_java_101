import java.util.Scanner;

/*
   name:       Jamie Johnson
   Assignment: Programming Challenges
   Problem:    1
*/

public class Answer1
{
   public static void main(String args[])
   {
   
      int num;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter a number between 1 and 10...");
      num = keyboard.nextInt();
    
      switch (num)
      {
         case 1:
            System.out.println("The number you entered is " + num + " and the roman numeral equivilent is I" );
            break;
         case 2:
            System.out.println("The number you entered is " + num + " and the roman numeral equivilent is II" );
            break;
         case 3:
            System.out.println("The number you entered is " + num + " and the roman numeral equivilent is III" );
            break;
         case 4:
            System.out.println("The number you entered is " + num + " and the roman numeral equivilent is IV" );
            break;
         case 5:
            System.out.println("The number you entered is " + num + " and the roman numeral equivilent is V" );
            break;
         case 6:
            System.out.println("The number you entered is " + num + "  and the roman numeral equivilent is VI" );
            break;
         case 7:
            System.out.println("The number you entered is " + num + " and the roman numeral equivilent is VII" );
            break;
         case 8:
            System.out.println("The number you entered is " + num + " and the roman numeral equivilent is VIII" );
            break;
         case 9:
            System.out.println("The number you entered is " + num + " and the roman numeral equivilent is IX" );
            break;
         case 10:
            System.out.println("The number you entered is " + num + " and the roman numeral equivilent is X" );
            break;
         default:
            System.out.println("You did not enter a number between 1 and 10... PISS OFF!!!" );
      }
   
      System.exit(0);
   }   
}