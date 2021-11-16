import java.util.Arrays;

class Solution {
    public int evenNumbers(int[] nums) {

        int x = 0;

        for ( int i = 0; i < nums.length; i++) {
            String b = Integer.toString(nums[i]);
            int c = b.length();
            if ( c % 2 == 0) {
                x++;
            }            
        }
        System.out.println("x is " + x);
        return x;
    }
}

public class findEvenNumbers {
    public static void main(String[] args ) {
        int[] nums = {12,345,2,6,7896};

        Solution evens = new Solution();
        evens.evenNumbers(nums);
    }
}
