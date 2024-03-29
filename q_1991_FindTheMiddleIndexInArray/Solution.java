package q_1991_FindTheMiddleIndexInArray;

/*
Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

A middleIndex is an index 
where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

If middleIndex == 0, the left side sum is considered to be 0. Similarly,
if middleIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
*/

/*
Constraints:

1 <= nums.length <= 100
-1000 <= nums[i] <= 1000
*/

class Solution {
	public static int findMiddleIndex(int[] nums) {
		int lSum = 0;
		int rSum = 0;
		for (int i : nums) {
			rSum += i;
		}
		int l = nums.length;
		for (int i = 0; i < l; i++) {
			rSum -= nums[i];
			if (lSum == rSum) {
				return i;
			}
			lSum += nums[i];
		}
		return -1;
	}
}
