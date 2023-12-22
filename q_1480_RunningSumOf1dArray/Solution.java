package q_1480_RunningSumOf1dArray;

/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6

*/

class Solution {
	public static int[] runningSum(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i > 0) {
				nums[i] += nums[i - 1];
			}
		}
		return nums;
	}
}