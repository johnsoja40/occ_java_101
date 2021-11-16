import java.util.Arrays;

class Solution {
    public void dup(int[] nums) {
        // loop through array and find any zeros
        // if zero is found, move items to the right and insert zero at i

        for ( int i = 0; i < nums.length; i++) {
            // System.out.println("the length of the array is: " + nums.length);
            System.out.println("the array looks like this: " + nums[i]);
            if ( nums[i] == 0 ) {
                for ( int j = nums.length; j > i; j-- ) {
                    nums[i + 1] = nums[j];
                }
                nums[i] = 0;
            }
            
        }
        System.out.println("the NEW array looks like this: " + Arrays.toString(nums) );

    }
}

public class duplicateZeros {
    public static void main(String[] args ) {
        int[] nums = {1,0,2,3,0,4,5,0};

        Solution duplicateZeros = new Solution();
        duplicateZeros.dup(nums);
    }
}