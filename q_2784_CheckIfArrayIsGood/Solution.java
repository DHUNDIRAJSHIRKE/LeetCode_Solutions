package q_2784_CheckIfArrayIsGood;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
You are given an integer array nums. We consider an array good if it is a permutation of an array base[n].

base[n] = [1, 2, ..., n - 1, n, n] 
(in other words, it is an array of length n + 1 which contains 1 to n - 1 exactly once, plus two occurrences of n). 
For example, base[1] = [1, 1] and base[3] = [1, 2, 3, 3].

Return true if the given array is good, otherwise return false.

Note: A permutation of integers represents an arrangement of these numbers.
*/

/*
Constraints:

1 <= nums.length <= 100
1 <= num[i] <= 200
*/

class Solution {
	public static boolean isGood(int[] nums) {
		int l = nums.length;
		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			if (i != l - 1) {
				if (!set.add(i)) {
					return false;
				}
			}
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < l; i++) {
			list.add(i);
		}
		int count = 0;
		for (int i : nums) {
			if (i == l - 1) {
				count++;
				if (count > 2) {
					return false;
				}
			}
			if (!list.contains(i)) {
				return false;
			}
		}
		if (count != 2) {
			return false;
		}
		return true;
	}
}
