package q_884_UncommonWordsFromTwoSentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/*
A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
*/

/*
Constraints:

1 <= s1.length, s2.length <= 200
s1 and s2 consist of lowercase English letters and spaces.
s1 and s2 do not have leading or trailing spaces.
All the words in s1 and s2 are separated by a single space.
 */

class Solution {
	public static String[] uncommonFromSentences(String s1, String s2) {
		String[] s1Words = s1.split(" ");
		String[] s2Words = s2.split(" ");
		HashMap<String, Integer> s1Map = new HashMap<>();
		HashMap<String, Integer> s2Map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		String[] ret;
		for (String str : s1Words) {
			if (!s1Map.containsKey(str)) {
				s1Map.put(str, 1);
			} else {
				s1Map.put(str, s1Map.get(str) + 1);
			}
		}
		for (String str : s2Words) {
			if (!s2Map.containsKey(str)) {
				s2Map.put(str, 1);
			} else {
				s2Map.put(str, s2Map.get(str) + 1);
			}
		}
		for (Map.Entry<String, Integer> entry : s1Map.entrySet()) {
			if (entry.getValue() == 1) {
				if (!s2Map.containsKey(entry.getKey())) {
					list.add(entry.getKey());
				}
			}
		}
		for (Map.Entry<String, Integer> entry : s2Map.entrySet()) {
			if (entry.getValue() == 1) {
				if (!s1Map.containsKey(entry.getKey())) {
					list.add(entry.getKey());
				}
			}
		}
		ret = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ret[i] = list.get(i);
		}
		return ret;

	}
}
