package q_1460_MakeTwoArraysEqualByReversingSubarrays;

import java.util.Arrays;

/*
You are given two integer arrays of equal length target and arr. 
In one step, you can select any non-empty subarray of arr and reverse it. You are allowed to make any number of steps.

Return true if you can make arr equal to target or false otherwise.
*/

/*
Constraints:

target.length == arr.length
1 <= target.length <= 1000
1 <= target[i] <= 1000
1 <= arr[i] <= 1000
*/

class Solution {
	public static boolean canBeEqual(int[] target, int[] arr) {
		Arrays.sort(target);
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (target[i] != arr[i]) {
				return false;
			}
		}
		return true;
	}
}
