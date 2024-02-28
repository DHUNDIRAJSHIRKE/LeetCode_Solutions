package q_442_FindAllDuplicatesInAnArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.
*/

/*
Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.
*/

class Solution {
	public static List<Integer> findDuplicates(int[] nums) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		ArrayList<Integer> dups = new ArrayList<>();
		for (int num : nums) {
			if (map.containsKey(num)) {
				map.put(num, true);
			} else {
				map.put(num, false);
			}
		}
		for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
			if (entry.getValue()) {
				dups.add(entry.getKey());
			}
		}
		return dups;
	}
}
