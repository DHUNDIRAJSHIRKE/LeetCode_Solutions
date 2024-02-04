package q_2176CountEqualAndDivisiblePairsInAnArray;

/*
 * Given a 0-indexed integer array nums of length n and an integer k,
 *  return the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.
 */

/*
 * Constraints:

1 <= nums.length <= 100
1 <= nums[i], k <= 100
 */

class Solution {
	public static int countPairs(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] == nums[j] && (i * j % k == 0)) {
					count++;
				}
			}
		}
		return count / 2;
	}
}