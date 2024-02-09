package q_231_PowerOfTwo;

/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.
*/

/*
Constraints:

-231 <= n <= 231 - 1
*/


class Solution {
	public static boolean isPowerOfTwo(int n) {
		String bin = Integer.toBinaryString(n);
		int count =0;
		char[] bins = bin.toCharArray();
		for(char c : bins) {
			if(c=='1') {
				count++;
			}
			if(count>1) {
				return false;
			}
		}
		return true;
	}
}