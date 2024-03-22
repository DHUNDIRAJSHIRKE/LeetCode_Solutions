package q_67_AddBinary;

import java.util.ArrayList;

/*
Given two binary strings a and b, return their sum as a binary string.
*/

/*
Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/

class Solution {
	public static String addBinary(String a, String b) {
		char[] aChars = a.toCharArray();
		char[] bChars = b.toCharArray();
		ArrayList<Integer> list = new ArrayList<>();
		int current = 0;
		int carry = 0;
		int aL = aChars.length;
		int bL = bChars.length;
		int i = aL - 1;
		int j = bL - 1;
		while (i >= 0 && j >= 0) {
			current = carry + aChars[i] - '0' + bChars[j] - '0';
			if (current >= 2) {
				list.add(0, current - 2);
				carry = 1;
			} else {
				list.add(0, current);
				carry = 0;
			}
			i--;
			j--;
		}
		if (i >= 0 || j >= 0) {
			if (i >= 0) {
				while (i >= 0) {
					current = carry + aChars[i] - '0';
					if (current >= 2) {
						list.add(0, current - 2);
						carry = 1;
					} else {
						list.add(0, current);
						carry = 0;
					}
					i--;
				}
			}
			if (j >= 0) {
				while (j >= 0) {
					current = carry + bChars[j] - '0';
					if (current >= 2) {
						list.add(0, current - 2);
						carry = 1;
					} else {
						list.add(0, current);
						carry = 0;
					}
					j--;
				}
			}
		}
		if (carry == 1) {
			list.add(0, carry);
		}
		String str = "";
		for (int num : list) {
			str += "" + num;
		}
		return str;
	}
}
