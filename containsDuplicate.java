import java.util.Arrays;

class Solution {
    public boolean dup(int[] nums) {

        Arrays.sort(nums);

        for ( int i = 0; i < nums.length -1; i++ ) {
            if ( nums[i] == nums[i + 1] ) return true;
        }
        return false;


        // time limit exceeded
        // for ( int i = 0; i < nums.length; i++ ) {
        //     for ( int j = i + 1; j < nums.length; j++ ) {
        //         if ( nums[i] == nums[j] ) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}

public class containsDuplicate {
    public static void main(String[] args ) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,1};

        Solution sum = new Solution();
        sum.dup(nums);
    }
}
