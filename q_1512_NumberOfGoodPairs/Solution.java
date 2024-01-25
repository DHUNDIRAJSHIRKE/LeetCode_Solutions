package q_1512_NumberOfGoodPairs;

/*
 * Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*/

/*
 * Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

class Solution {
	public static int numIdenticalPairs(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (i != j && nums[i] == nums[j]) {
					count++;
				}
			}
		}
		return count;
	}
}
