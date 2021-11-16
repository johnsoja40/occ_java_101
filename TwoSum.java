import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] result = new int[2];
        // int left = 0;
        // int right = 1;
        // int size = nums.length - 1;

        // while ( left < right) {
        //     if ( nums[left] + nums[right] == target ) {
        //         result[0] = left;
        //         result[1] = right;
        //         left = size;
        //     } else if ( right == size) {
        //         left++;
        //         right = left+1;
        //     } else {
        //         right++;
        //     }
        // }
        // return result;
    // }

        for ( int left = 0; left < nums.length-1; left++) {
            for (int right = left + 1; right < nums.length; right++) {
                if ( nums[left] + nums[right] == target) {
                    return new int[] {left, right};
                }
            }
        }
        return null;
    }
}

public class TwoSum {
    public static void main(String[] args ) {
        int[] nums = {3,2,4};
        int target = 6;

        Solution sum = new Solution();
        sum.twoSum(nums, target);
    }
}
