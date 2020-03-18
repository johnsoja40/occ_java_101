 class FormatChk1
   {


     public static void main(String[ ] args)
     {
        int x = 2222;
        int z = 65;
        float avg = 35.1234567f;
        float ord = 236.445f;
        char red = 'T';
        char yel = 'Y';
        double number = 1234567.456;
        String BLURB = "Have a nice day";
        double num = 60000;

       // System.out.println ("1234567890123456789012345678901234567890\n");
       //
       // //unformatted output
       // System.out.printf("%d%f%c\n\n", x, avg, red);
       // System.out.printf("This is a char example %c\n\n", red);
       // System.out.printf("This is a char example %c\n\n", yel);
       //
       // //formatted integer (int)
       // System.out.printf("%,d\n\n", x);    //demos comma
       // System.out.printf("%,d\n\n", x);
       // System.out.printf("%2d%2d\n\n", x,z);    //size allotted too small
       // System.out.printf("%10d\n\n", x);   //default right justified
       // System.out.printf("%,-10d%-10d%c\n\n", x, x, red);   //minus sign left justified
       // System.out.printf("   %,d\n\n", x); //adding spaces
       //
       // //formatted character  (char)
       // System.out.printf ("%c\n",red);
       // System.out.printf ("%5c\n",red);
       // System.out.printf ("   %c\n",red);
       // System.out.printf ("%-5c%c%c", red, yel, red);
       // System.out.printf ("%c\n", red);
       //
       // //mixed char and int
       // System.out.printf ("%,d%c%,5d%5c\n", x, red, x, yel);
       // System.out.printf ("%c%c%5c%5c\n\n", red, red, yel, yel);

       //float display
      //  System.out.println ("1234567890123456789012345678901234567890\n");
      //  System.out.printf ("%3.2f%7.2f\n", avg, ord);
      //  System.out.printf ("%8.1f%9.4f%8.4f%7.2f\n", avg, ord, avg, ord);
      //  System.out.printf ("%.1f\n", ord);   //one decimal place
       // System.out.printf ("$%,9.2f\n", 10000.0);  // currency adding the dollar sign and comma
       // System.out.printf ("$ %,.2f\n", num);  // currency adding the dollar sign and comma
      // //
      // //How the compiler Rounds
      //  System.out.printf ("%9.3f%9.3f%9.3f%9.3f%9.3f%9.3f\n",
      //         345.123556,345.123545,345.123500,
      //         345.123501, 345.123455,345.123499);
      //
      //  //Strings and special characters
      //  System.out.printf ("%s\n",BLURB);
      //  System.out.printf ("%2s\n",BLURB);
      //  System.out.printf ("%30s\n",BLURB);
      //  System.out.printf ("%-30s\n",BLURB);
      //  System.out.printf ("%-30.6s\n",BLURB);
      //  System.out.printf ("**%5d**%d%d**\n",x,x,x,x);
      //  System.out.printf ("Adding Aterisks Zero padding and commas\n**%d**%5d%,010d**%05d\n",x,x,x,x);
      //
      //  //formatting currency
        // System.out.printf ("%s %,.2f\n","Formatting Currency",60000.0);

      // int num = 1;
      //
      // do
      // {
      //   System.out.println("Hello I am num and I am: " + num++);
      //   num++;
      // } while (num <= 10);
     //  for ( int w = 0; w <=10; w++)
     //  {
     //    System.out.println("w is: " + w);
     //  }
     //
     //
     //  int v = 11;
     //
     //  switch (v)
     //  {
     //    case 10:
     //      System.out.println("User selected 10");
     //      break;
     //    default: System.out.println("User did not select 10");
     //  }
     double total = 1400.00;

     System.out.printf("\n%16s         $%-5.2f\n\n", "Amount Due", total);
     }
   }
