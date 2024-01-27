package q_561_ArrayPartition;

import java.util.Arrays;

/*Given an integer array nums of 2n integers, 
 * group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) 
 * such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.*/

/*
 * Constraints:

1 <= n <= 104
nums.length == 2 * n
-104 <= nums[i] <= 104
*/

class Solution {
	public static int arrayPairSum(int[] nums) {
		int sum = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			i++;
		}
		return sum;
	}
}
