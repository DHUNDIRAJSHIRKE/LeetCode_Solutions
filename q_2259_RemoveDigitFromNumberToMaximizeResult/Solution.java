package q_2259_RemoveDigitFromNumberToMaximizeResult;

import java.util.ArrayList;

/*
You are given a string number representing a positive integer and a character digit.

Return the resulting string after removing exactly one occurrence of digit from number 
such that the value of the resulting string in decimal form is maximized. 
The test cases are generated such that digit occurs at least once in number.
*/

/*
Constraints:

2 <= number.length <= 100
number consists of digits from '1' to '9'.
digit is a digit from '1' to '9'.
digit occurs at least once in number.
*/

class Solution {
	public static String removeDigit(String number, char digit) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> longs = new ArrayList<>();
		char[] chars = number.toCharArray();
		String str;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == digit) {
				str = "";
				for (int j = 0; j < chars.length; j++) {
					if (i != j) {
						str += chars[j];
					}
				}
				if (str.length() > 9) {
					longs.add(str);
				} else {
					list.add(Integer.parseInt(str));
				}
			}
		}
		String longest = "";
		if (longs.size() != 0) {
			for (String longer : longs) {
				if (longest.compareTo(longer) < 0) {
					longest = longer;
				}
			}
			return longest;
		}
		int max = -1;
		for (int num : list) {
			if (max < num) {
				max = num;
			}
		}
		return "" + max;
	}
}
