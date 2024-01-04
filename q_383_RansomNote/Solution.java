package q_383_RansomNote;

import java.util.ArrayList;

/*
 * Given two strings ransomNote and magazine, 
 * return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.*/

/*
 * Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
*/

class Solution {
	public static boolean canConstruct(String ransomNote, String magazine) {
		char[] ransom = ransomNote.toCharArray();
		char[] mag = magazine.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		int t = 0;
		for (char c : mag) {
			list.add(c);
		}
		for (char c : ransom) {
			if (!list.contains(c)) {
				return false;
			} else {
				t = list.indexOf(c);
				list.remove(t);
			}
		}
		return true;
	}
}
