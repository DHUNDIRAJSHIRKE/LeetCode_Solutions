package q_724_FindPivotIndex;

/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index 
where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. 
This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
*/

/*
Constraints:

1 <= nums.length <= 104
-1000 <= nums[i] <= 1000
*/

class Solution {
	public static int pivotIndex(int[] nums) {
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
