package q_1207_UniqueNumberOfOccurrences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 */

/*
 * Constraints:

1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000
 * */


class Solution {
	public static boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int temp;
		for (int i : arr) {
			if (map.containsKey(i)) {
				temp = map.get(i);
				map.put(i, temp + 1);
			} else {
				map.put(i, 1);
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (list.contains(entry.getValue())) {
				return false;
			} else {
				list.add(entry.getValue());
			}
		}
		return true;
	}
}