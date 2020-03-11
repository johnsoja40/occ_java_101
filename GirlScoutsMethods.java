/*
   name:       Jamie Johnson
   Assignment: Programming Challenges
   Problem:    
*/

import java.util.Scanner;

public class GirlScoutsMethods
{
   public static void main(String args[])
   {
      
      String name;
      int boxes = 0;
      int directions = 0;
      
      Scanner keyboard = new Scanner(System.in);
      directions = get_directions(keyboard);
      
      while (directions >= 1 && directions <=3)
      {
         switch(directions) {
            case 1:
            case 2:
               name = get_name(keyboard);
               System.out.println("\nHello " + name);
//                boxes = get_boxes(keyboard);
//                process_data(boxes);
               break;
            case 3:
               System.exit(0);
         }
         directions = get_directions(keyboard);
      }
   }
   
   public static int get_directions(Scanner keyboard) {
      int directions;
      System.out.println("What would you like to do ? ");
      directions = keyboard.nextInt();
      keyboard.nextLine();
      return directions;
   }
   
   public static String get_name(Scanner keyboard) {
      String name;
      System.out.println("What is your name ? ");
      name = keyboard.nextLine();
      return name;
   }
   
//    public static int get_boxes(Scanner keyboard) {
//       System.out.println("How many boxes of cookies did you sell ? ");
//       boxes = keyboard.nextInt();
//    }
//    
//    public static int process_data(int boxes) {
//    
//       if ( boxes >= 250 )
//          System.out.println("You win a laptop.");
//       else if ( boxes >= 100 )
//          System.out.println("You win a portable DVD player.");
//       else if ( boxes >= 50 )
//          System.out.println("You win an iPod.");
//       else
//          System.out.println("You suck at life.");   
//       
//    }
         
}