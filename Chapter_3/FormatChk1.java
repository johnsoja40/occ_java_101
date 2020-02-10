 class FormatChk1
   {
   
   
     public static void main(String[ ] args)
     {
      int x;
      float avg;
      float ord;
      char red;
      char yel;
      String BLURB = "Have a nice day";
 
     x = 2222;
     avg = 35.1234567f;
     ord = 236.445f;
     red = 'T';
     yel = 'Y';
 
     System.out.println ("1234567890123456789012345678901234567890\n\n");
 
     //unformatted output
 
     System.out.printf  ("%d%f%c\n\n", x ,avg ,red);
     
     System.out.printf("This is a char example %c\n",red);
 
     //formatted integer (int)
 
     System.out.printf ("%,d\n",x);    //demos comma
     System.out.printf ("%2d\n",x);    //size allotted too small
     System.out.printf ("%10d\n",x);   //default right justified
     System.out.printf ("%-10d%-10d%c\n",x,x,red);   //minus sign left justified
     System.out.printf ("   %,d\n\n",x); //adding spaces
 
     //formatted character  (char)
 
     System.out.printf ("%c\n",red);
     System.out.printf ("%5c\n",red);
     System.out.printf ("   %c\n",red);
     System.out.printf ("%-5c%c%c",red,yel,red);
     System.out.printf ("%c\n",red);
 
 
 
 
     //mixed char and int
 
     System.out.printf ("%d%c%5d%5c\n",x,red,x,yel);
     System.out.printf ("%c%c%5c%5c\n\n",red,red,yel,yel);
 
 
     //float display
     
      System.out.println ("1234567890123456789012345678901234567890\n\n");
 
 
     System.out.printf ("%f%f\n",avg,ord);
     System.out.printf ("%8.1f%9.4f%8.4f%7.2f\n",avg,ord,avg,ord);
     System.out.printf ("%.1f\n",ord);   //one decimal place
     System.out.printf ("$%,9.2f\n",10000.0);  // currency adding the dollar sign and comma
  
    //How the compiler Rounds
 
     System.out.printf ("%9.3f%9.3f%9.3f%9.3f%9.3f%9.3f\n",
            345.123556,345.123545,345.123500,
            345.123501, 345.123455,345.123499);
 
 
     //Strings and special characters
 
     System.out.printf ("%s\n",BLURB);
     System.out.printf ("%2s\n",BLURB);
     System.out.printf ("%30s\n",BLURB);
     System.out.printf ("%-30s\n",BLURB);
     System.out.printf ("%-30.6s\n",BLURB);
     System.out.printf ("**%5d**%d%d**\n",x,x,x,x);
     System.out.printf ("Adding Aterisks Zero padding and commas\n**%d**%5d%,010d**%05d\n",x,x,x,x);
     
     //formatting currency
      System.out.printf ("%s %,.2f\n","Formatting Currency",60000.0);
     }
   } 
 
