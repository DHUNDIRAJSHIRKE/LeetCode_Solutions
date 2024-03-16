package q_1796_SecondLargestDigitInAString;

/*
Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits.
*/

/*
Constraints:

1 <= s.length <= 500
s consists of only lowercase English letters and/or digits.
*/
class Solution {
	public static int secondHighest(String s) {
		char[] arr = s.toCharArray();
		boolean[] digits = new boolean[10];
		// ArrayList<Byte> list = new ArrayList<>();
		// byte x =0;
		for (char c : arr) {
			if (c <= '9' && c >= '0') {
				digits[c - '0'] = true;
			}
		}
		boolean firstFound = false;
		for (int i = 9; i >= 0; i--) {
			if (digits[i] && !firstFound) {
				firstFound = true;
				;
			} else if (firstFound && digits[i]) {
				return i;
			}
		}
		return -1;
	}
}
