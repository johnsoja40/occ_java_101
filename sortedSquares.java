import java.util.Arrays;

class Solution {
    public int[] squaredArray(int[] nums) {

        int[] x = new int[nums.length];
        
        for ( int i = 0; i < nums.length; i++ ) {
            System.out.println("nums of i is: " + nums[i] );
            x[i] = nums[i] * nums[i];
        }
        Arrays.sort(x);
        System.out.println("x is: " + Arrays.toString(x) );
        return x;
    }
}

public class sortedSquares {
    public static void main(String[] args ) {
        int[] nums = {-4,-1,0,3,10};

        Solution squares = new Solution();
        squares.squaredArray(nums);
    }
}
