package q_977_SquaresOfASortedArray;

import java.util.Arrays;


/*Given an integer array nums sorted in non-decreasing order, 
 *return an array of the squares of each number sorted in non-decreasing order.
 *
 *Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order. 
 * */



public class Solution {
	public static int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
