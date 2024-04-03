package q_2085_CountCommonWordsWithOneOccurrence;

import java.util.HashMap;
import java.util.Map;

/*
Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.
*/

/*
Constraints:

1 <= words1.length, words2.length <= 1000
1 <= words1[i].length, words2[j].length <= 30
words1[i] and words2[j] consists only of lowercase English letters.
*/

class Solution {
	public static int countWords(String[] words1, String[] words2) {
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		int count = 0;
		for (String str : words1) {
			if (!map1.containsKey(str)) {
				map1.put(str, 1);
			} else {
				map1.put(str, map1.get(str) + 1);
			}
		}
		for (String str : words2) {
			if (!map2.containsKey(str)) {
				map2.put(str, 1);
			} else {
				map2.put(str, map2.get(str) + 1);
			}
		}
		for (Map.Entry<String, Integer> entry : map1.entrySet()) {
			if (entry.getValue() == 1) {
				if (map2.containsKey(entry.getKey())) {
					if (map2.get(entry.getKey()) == 1) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
