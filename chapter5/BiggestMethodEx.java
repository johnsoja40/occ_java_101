//This program figures out the largest value for three values//Ms. Jane Tucker
import java.util.Scanner;

public class BiggestMethodEx
  {
      public static void main(String[] args)
        {
          //declare all the necessary variables nneded
          int num1;
          int num2;
          int num3;
          int largest=0;

          Scanner keyboard = new Scanner(System.in);  //declare the Scanner object

          //console data input
          System.out.print("What was your first number "); //user data prompt
          num1 = keyboard.nextInt();                       //user input is converted and assigned to num1

          System.out.print("What was your second number "); //user data prompt
          num2 = keyboard.nextInt();                        //user input is converted and assigned to num2

          System.out.print("What was your third number "); //user data prompt
          num3 = keyboard.nextInt();                        //user input is converted and assigned to num3

          largest = bigest(num1,num2, num3);  //method call returns a value that is assigned to largest
          System.out.println("largest number is " + largest);

      }//end of main

      public static int bigest(int x, int y, int z)
      {
        int answer;  //local variable
        if (x > y)
          if(x > z)
            answer= x;
          else
            answer = z;
        else
          if (y > z)
            answer = y;
          else answer = z;
        return answer;
      }  //end of bigest
   }//end of class
