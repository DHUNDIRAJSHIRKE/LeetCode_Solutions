package q_1389_CreateTargetArrayInTheGivenOrder;

import java.util.ArrayList;
import java.util.List;

/*
Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.
*/

/*
Constraints:

1 <= nums.length, index.length <= 100
nums.length == index.length
0 <= nums[i] <= 100
0 <= index[i] <= i
*/

class Solution {
	public static int[] createTargetArray(int[] nums, int[] index) {
		int l = nums.length;
		List<Integer> list = new ArrayList<>();

		int[] target = new int[l];
		for (int i = 0; i < l; i++) {
			list.add(index[i], nums[i]);
		}
		for (int i = 0; i < l; i++) {
			target[i] = list.get(i);
		}
		return target;
	}
}