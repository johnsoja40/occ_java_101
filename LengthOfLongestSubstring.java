import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
      String s = "abc";
  
      lengthOfLongestSubstring(s);
    }
  
    public static String lengthOfLongestSubstring(String s) {
        int x = 0;
        ArrayList<String> sub = new ArrayList<String>();
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        while( x < s.length()) {
            if ( ! sub.contains(chars[x])) {
                sub.add(chars[x]);
            } else {
                System.out.println("largest substring found");
            }
        }
        System.out.println(chars);
        String y = "Jamie";
        return y;
    }
}
  