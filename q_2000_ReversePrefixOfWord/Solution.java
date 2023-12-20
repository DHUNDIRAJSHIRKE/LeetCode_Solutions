package q_2000_ReversePrefixOfWord;


/*Given a 0-indexed string word and a character ch, 
 * reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive).
 *  If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). 
The resulting string will be "dcbaefd".
Return the resulting string.

Constraints:

1 <= word.length <= 250
word consists of lowercase English letters.
ch is a lowercase English letter.


 */



public class Solution {

	public static String reversePrefix(String word, char ch) {
		int index = word.indexOf(ch);
		if (index == -1) {
			return word;
		}
		String pre = word.substring(0, index + 1);
		String suf = word.substring(index + 1, word.length());
		char[] preArr = pre.toCharArray();
		int l = pre.length();
		char[] rev = new char[l];
		for (int i = 0; i < l; i++) {
			rev[l - i - 1] = preArr[i];
		}
		String ret = new String(rev);
		ret = ret + suf;
		return ret;
	}
}
