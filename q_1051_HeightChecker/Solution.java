package q_1051_HeightChecker;

import java.util.Arrays;


/*A school is trying to take an annual photo of all the students. 
 * The students are asked to stand in a single file line in non-decreasing order by height. 
 * Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. 
Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].*/


public class Solution {
	public static int heightChecker(int[] heights) {
		int[] expected = new int[heights.length];
		int count = 0;
		for (int i = 0; i < heights.length; i++) {
			expected[i] = heights[i];
		}
		Arrays.sort(expected);
		for (int i = 0; i < expected.length; i++) {
			if (heights[i] != expected[i]) {
				count++;
			}
		}
		return count;
	}
}
