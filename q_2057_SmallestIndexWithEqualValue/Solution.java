package q_2057_SmallestIndexWithEqualValue;

/*Given a 0-indexed integer array nums, return the smallest index i of nums such that i mod 10 == nums[i], or -1 if such index does not exist.

x mod y denotes the remainder when x is divided by y.

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 9

*/

public class Solution {
	public static int smallestEqual(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if ((i % 10) == nums[i]) {
				return i;
			}
		}
		return -1;
	}

}
