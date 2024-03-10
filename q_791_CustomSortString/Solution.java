package q_791_CustomSortString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
You are given two strings order and s. All the characters of order are unique and were sorted in some custom order previously.

Permute the characters of s so that they match the order that order was sorted. 
More specifically, if a character x occurs before a character y in order, then x should occur before y in the permuted string.

Return any permutation of s that satisfies this property.
*/

/*
Constraints:

1 <= order.length <= 26
1 <= s.length <= 200
order and s consist of lowercase English letters.
All the characters of order are unique.
*/

class Solution {
	public static String customSortString(String order, String s) {
		List<Character> orderedLetters = new ArrayList<>();
		List<Character> notPresent = new ArrayList<>();
		String str = "";
		for (int i = 0; i < order.length(); i++) {
			orderedLetters.add(order.charAt(i));
		}
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (orderedLetters.contains(s.charAt(i))) {
				indexes.add(orderedLetters.indexOf(s.charAt(i)));
			} else {
				notPresent.add(s.charAt(i));
			}
		}
		Collections.sort(indexes);
		for (int index : indexes) {
			str += orderedLetters.get(index);
		}
		for (char c : notPresent) {
			str += c;
		}
		return str;
	}
}
