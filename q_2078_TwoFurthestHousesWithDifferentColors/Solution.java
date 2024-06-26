package q_2078_TwoFurthestHousesWithDifferentColors;

/*
There are n houses evenly lined up on the street, and each house is beautifully painted. 
You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.

Return the maximum distance between two houses with different colors.

The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.
*/

/*
Constraints:

n == colors.length
2 <= n <= 100
0 <= colors[i] <= 100
Test data are generated such that at least two houses have different colors.
*/

class Solution {
	public static int maxDistance(int[] colors) {
		int l = colors.length;
		int max = 0;
		int diff = 0;
		for (int i = l - 1; i >= 0; i--) {
			for (int j = 0; j < l; j++) {
				if (i != j && colors[i] != colors[j]) {
					if (i > j) {
						diff = i - j;
					} else {
						diff = j - i;
					}
					if (diff > max) {
						max = diff;
					}
				}
				if (i - j < max) {
					break;
				}
			}
		}
		return max;
	}
}
