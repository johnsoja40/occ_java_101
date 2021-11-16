public class Palindrone {

  public static void main(String[] args) {
    int x = 223322;

    isPalindrome(x);
  }

  public static boolean isPalindrome(int x) {
        
    // System.out.println("Inside palindrome function and x is " + x);
    String s = String.valueOf(x);
    // System.out.println("s is: " + s);
    char[] ch = s.toCharArray();
    // for(char c : ch) {
    //   System.out.println("char is " + c);
    // }
    int left = 0;
    int right = s.length() - 1;
    // System.out.println("left is " + left);
    // System.out.println("right is " + right);
    
    while( left < right) {
      if(ch[left] != ch[right])
        return false; 
        left ++;
        right --; 
    } 
    System.out.println("We have a palindrome");        
    return true;
  }
}


// import java.util.Scanner;

// public class Palindrone {
//   public boolean palindrone(char array[], int count) {
//     int p;
//     Scanner keyboard = new Scanner(System.in);

//     System.out.print("Please enter your palindrone test? ");
//     p = keyboard.nextInt();
//     keyboard.close();
//     return true;
//   }
// }
