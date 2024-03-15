package q_1556_ThousandSeparator;

/*
Given an integer n, add a dot (".") as the thousands separator and return it in string format.
*/

/*
Constraints:

0 <= n <= 231 - 1
*/

class Solution {
	public static String thousandSeparator(int n) {

		String num = "" + n;
		if (n < 1000) {
			return num;
		}
		char[] chars = num.toCharArray();
		String ret = "";
		int l = num.length();
		for (int i = 0; i <= l - 3; i++) {
			if (i == l - 9 && l > 9) {
				ret = ret + ".";
			}
			if (i == l - 6 && l > 6) {
				ret = ret + ".";
			}
			if (i == l - 3) {
				ret = ret + "." + chars[l - 3] + chars[l - 2] + chars[l - 1];
			} else {
				ret = ret + chars[i];
			}
		}
		return ret;
	}
}
