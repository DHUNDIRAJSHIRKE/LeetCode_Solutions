package q_9_PalindromeNumber;

/*
Given an integer x, return true if x is a palindrome, and false otherwise.
*/

/*
Constraints:

-231 <= x <= 231 - 1
*/

class Solution {
	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		if (x >= 0 && x <= 9) {
			return true;
		}
		String str = "" + x;
		char[] chars = str.toCharArray();
		int l = str.length();
		for (int i = 0; i < l / 2; i++) {
			if (chars[i] != chars[l - i - 1]) {
				return false;
			}
		}
		return true;
	}
}
