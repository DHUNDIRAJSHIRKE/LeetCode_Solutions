package q_415_AddStrings;

/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). 
You must also not convert the inputs to integers directly.
*/

/*
Constraints:

1 <= num1.length, num2.length <= 104
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
*/

class Solution {
	public static String addStrings(String num1, String num2) {
		int small = num1.length();
		int big = num2.length();
		String smaller;
		String bigger;
		if (small < big) {
			smaller = num1;
			bigger = num2;
		} else {
			smaller = num2;
			bigger = num1;
			small = smaller.length();
			big = bigger.length();
		}
		char[] biggerChars = bigger.toCharArray();
		char[] smallerChars = smaller.toCharArray();
		String str = "";
		int carry = 0;
		int i = big - 1;
		int j = small - 1;
		int total = 0;
		while (i >= 0) {
			if (j >= 0) {
				total = carry + biggerChars[i] - '0' + smallerChars[j] - '0';
				if (total >= 10) {
					str = (total - 10) + str;
					carry = 1;
				} else {
					str = total + str;
					carry = 0;
				}
			} else {
				total = carry + biggerChars[i] - '0';
				if (total >= 10) {
					str = (total - 10) + str;
					carry = 1;
				} else {
					str = total + str;
					carry = 0;
				}
			}
			i--;
			j--;
		}
		if (carry != 0) {
			str = 1 + str;
		}
		return str;
	}
}
