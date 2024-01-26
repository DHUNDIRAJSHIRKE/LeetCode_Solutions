package q_1935_MaximumNumberOfWordsYouCanType;

import java.util.ArrayList;

/*There is a malfunctioning keyboard where some letter keys do not work. 
 * All other keys on the keyboard work properly.

Given a string text of words separated by a single space (no leading or trailing spaces) 
and a string brokenLetters of all distinct letter keys that are broken, 
return the number of words in text you can fully type using this keyboard.*/


/*
 * Constraints:

1 <= text.length <= 104
0 <= brokenLetters.length <= 26
text consists of words separated by a single space without any leading or trailing spaces.
Each word only consists of lowercase English letters.
brokenLetters consists of distinct lowercase English letters.
*/


class Solution {
	public static int canBeTypedWords(String text, String brokenLetters) {
		char[] broke = brokenLetters.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		for (char c : broke) {
			list.add(c);
		}

		String[] splited = text.split(" ");
		int count = splited.length;
		for (String s : splited) {
			char[] tem = s.toCharArray();
			for (char c : tem) {
				if (list.contains(c)) {
					count--;
					break;
				}
			}

		}
		return count;
	}
}
