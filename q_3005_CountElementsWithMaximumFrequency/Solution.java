package q_3005_CountElementsWithMaximumFrequency;

import java.util.HashMap;

/*
You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.
*/

/*
Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

class Solution {
	public static int maxFrequencyElements(int[] nums) {
		int max = 1;
		int count = 0;
		int temp = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
				if (max == 1) {
					max = 1;
					count += 1;
				}
			} else {
				temp = map.get(num) + 1;
				if (max < temp) {
					max = temp;
					count = max;
				} else if (max == temp) {
					count += temp;
				}
				map.put(num, temp);
			}
		}
		return count;
	}
}
