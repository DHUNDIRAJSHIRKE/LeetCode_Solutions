package q_66_PlusOne;

import java.util.ArrayList;

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. 
The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
*/

/*
Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
*/

class Solution {
	public static int[] plusOne(int[] digits) {
		ArrayList<Integer> list = new ArrayList<>();
		int l = digits.length;
		int carry = 0;
		int current = 0;
		digits[l - 1] += 1;
		for (int i = l - 1; i >= 0; i--) {
			current = carry + digits[i];
			if (current > 9) {
				list.add(0, current - 10);
				carry = 1;
			} else {
				list.add(0, current);
				carry = 0;
			}
		}
		if (carry == 1) {
			list.add(0, 1);
		}
		l = list.size();
		int[] arr = new int[l];
		for (int i = 0; i < l; i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}
}
