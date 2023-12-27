package q_34_FindFirstAndLastPositionOfElementInSortedArray;

/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109

*/


class Solution {
	public static int[] searchRange(int[] nums, int target) {
		int count = 0;
		for (int i : nums) {
			if (target == i) {
				count++;
			}
		}
		int[] two = { -1, -1 };

		if (count == 0) {
			return two;
		}
		int[] ret = new int[count];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				break;
			} else {
				if (nums[i] == target) {
					ret[j++] = i;
				}
			}
		}
		two[0] = min(ret);
		two[1] = max(ret);
		return two;
	}

	public static int min(int[] ret) {
		int min = Integer.MAX_VALUE;
		for (int i : ret) {
			if (min > i) {
				min = i;
			}
		}
		return min;
	}

	public static int max(int[] ret) {
		int max = Integer.MIN_VALUE;
		for (int i : ret) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}
}
