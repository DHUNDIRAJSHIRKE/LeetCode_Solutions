package q_287_FindTheDuplicateNumber;

import java.util.HashSet;
import java.util.Set;

/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
*/

/*
Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
*/

class Solution {
	public static int findDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (!set.add(num)) {
				return num;
			}
		}
		return 0;
	}
}
