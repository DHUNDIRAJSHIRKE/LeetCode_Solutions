package q_989_AddToArrayFormOfInteger;

import java.util.ArrayList;
import java.util.List;

/*
The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
*/

/*
Constraints:

1 <= num.length <= 10^4
0 <= num[i] <= 9
num does not contain any leading zeros except for the zero itself.
1 <= k <= 10^4
*/

class Solution {
	public static List<Integer> addToArrayForm(int[] num, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		String num1 = "";
		String num2 = "" + k;
		for (int n : num) {
			num1 += n;
		}
		String ans = addStrings(num1, num2);
		String temp;
		for (int i = 0; i < ans.length(); i++) {
			temp = "" + ans.charAt(i);
			list.add(Integer.parseInt(temp));
		}
		return list;
	}

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
