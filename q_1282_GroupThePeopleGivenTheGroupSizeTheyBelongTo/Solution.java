package q_1282_GroupThePeopleGivenTheGroupSizeTheyBelongTo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
There are n people that are split into some unknown number of groups. Each person is labeled with a unique ID from 0 to n - 1.

You are given an integer array groupSizes, where groupSizes[i] is the size of the group that person i is in. For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.

Return a list of groups such that each person i is in a group of size groupSizes[i].

Each person should appear in exactly one group, and every person must be in a group. If there are multiple answers, return any of them. 
It is guaranteed that there will be at least one valid solution for the given input.
*/

/*
Constraints:

groupSizes.length == n
1 <= n <= 500
1 <= groupSizes[i] <= n
*/

class Solution {
	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		List<Integer> list;
		List<List<Integer>> lists = new ArrayList<>();
		for (int i = 0; i < groupSizes.length; i++) {
			if (!map.containsKey(groupSizes[i])) {
				list = new ArrayList<>();
				list.add(i);
				map.put(groupSizes[i], list);
			} else {
				list = map.get(groupSizes[i]);
				if (list.size() == groupSizes[i]) {
					lists.add(list);
					list = new ArrayList<Integer>();
					list.add(i);
					map.put(groupSizes[i], list);
				} else {
					list.add(i);
					map.put(groupSizes[i], list);
				}
			}
		}
		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
			lists.add(entry.getValue());
		}
		return lists;
	}
}
