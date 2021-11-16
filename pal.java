class Solution {
    public boolean pal(int x) {

        String s = String.valueOf(x);
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        
        while( left < right) {
          if(ch[left] != ch[right])
            return false;
            left ++;
            right --;
        }     
        System.out.println("Pal has been found");
        return true;
    }
}

public class pal {
    public static void main(String[] args ) {
        int x = 2442;

        Solution sol = new Solution();
        sol.pal(x);
    }
}