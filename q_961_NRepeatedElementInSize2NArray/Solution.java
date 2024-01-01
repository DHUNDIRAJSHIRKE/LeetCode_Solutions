package q_961_NRepeatedElementInSize2NArray;

import java.util.ArrayList;


/*You are given an integer array nums with the following properties:

nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times.
*/

/*Constraints:

2 <= n <= 5000
nums.length == 2 * n
0 <= nums[i] <= 104
nums contains n + 1 unique elements and one of them is repeated exactly n times.*/



class Solution {
	public static int repeatedNTimes(int[] nums) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (list.contains(nums[i])) {
				return nums[i];
			} else {
				list.add(nums[i]);
			}
		}
		return 0;
	}
}