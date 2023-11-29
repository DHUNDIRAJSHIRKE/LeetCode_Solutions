package q_268_MissingNumber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*Given an array nums containing n distinct numbers in the range [0, n],
 *return the only number in the range that is missing from the array.*/

class Solution {
	public int missingNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i <= nums.length; i++) {
			map.put(i, 0);
		}
		for (int n : nums) {
			System.out.println(n);
			map.put(n, 1);
		}
		System.out.println(map);
		Set<Integer> set = map.keySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			int num = (int) itr.next();
			if (map.get(num) == 0) {
				return num;
			}
		}
		return 0;
	}
}
