package q_2016_MaximumDifferenceBetweenIncreasingElements;

/*
Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] 
(i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].

Return the maximum difference. If no such i and j exists, return -1.
*/

/*
Constraints:

n == nums.length
2 <= n <= 1000
1 <= nums[i] <= 10^9
*/

class Solution {
	public static int maximumDifference(int[] nums) {
		int max = -1;
		int diff;
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			} else {
				diff = nums[i] - min;
				if (diff > max) {
					max = diff;
				}
			}
		}
		if (max > 0) {
			return max;
		} else {
			return -1;
		}
	}
}
