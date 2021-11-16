class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char I = 1;
        char v = 5;
        char x = 10;
        char l = 50;
        char c = 100;
        char d = 500;
        char m = 1000;

        char[] rm = s.toCharArray();
        for (char r : rm) {
            System.out.println(r);
        }
        // System.out.println("S is " + s);
        return result;
    }
}

public class romanToInt {
    public static void main(String[] args ) {
        String roman = "III";

        Solution sol = new Solution();
        sol.romanToInt(roman);
    }
}