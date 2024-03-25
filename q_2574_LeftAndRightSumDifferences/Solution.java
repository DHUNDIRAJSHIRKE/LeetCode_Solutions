package q_2574_LeftAndRightSumDifferences;

/*
Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.
*/

/*
Constraints:

1 <= nums.length <= 1000
1 <= nums[i] <= 10^5
*/

class Solution {
	public static int[] leftRightDifference(int[] nums) {
		int l = nums.length;
		int[] arr = new int[l];
		int rSum = 0;
		int lSum = 0;
		for (int i : nums) {
			lSum += i;
		}
		int diff;
		for (int i = l - 1; i >= 0; i--) {
			lSum -= nums[i];
			diff = lSum - rSum;
			if (diff < 0) {
				diff *= -1;
			}
			arr[i] = diff;
			rSum += nums[i];
		}
		return arr;
	}
}
