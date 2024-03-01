package q_49_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.
*/

/*
Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
*/

class Solution {
	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> lists = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			if (str.length() == 0) {
				if (!map.containsKey("")) {
					List<String> list = new ArrayList<>();
					list.add(str);
					map.put("", list);
				} else {
					List<String> list = map.get("");
					list.add(str);
				}
				continue;
			}
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String temp = "";
			for (int i = 0; i < chars.length; i++) {
				temp += chars[i];
			}
			if (!map.containsKey(temp)) {
				List<String> list = new ArrayList<>();
				list.add(str);
				map.put(temp, list);
			} else {
				List<String> list = map.get(temp);
				list.add(str);
			}
		}
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			List<String> list = entry.getValue();
			lists.add(list);
		}
		return lists;
	}
}
