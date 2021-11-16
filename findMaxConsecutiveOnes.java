import java.util.Arrays;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max_count = 0;

        for ( int i = 0; i < nums.length; i++) {
            // System.out.println("i is:" + i);
            if ( nums[i] == 1 ) {
                // System.out.println("nums of i is: " + nums[i]);
                count ++;
            } else {
                count = 0;
            }
            if ( count >= max_count ) {
                max_count = count;
            }
        }

        System.out.println("max_count is: " + max_count);
        return max_count;
    }
}

public class findMaxConsecutiveOnes {
    public static void main(String[] args ) {
        int[] nums = {1,0,1,1,0,1};

        Solution max = new Solution();
        max.findMaxConsecutiveOnes(nums);
    }
}
