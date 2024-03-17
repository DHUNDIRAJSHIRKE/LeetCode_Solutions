package q_1380_LuckyNumbersInAMatrix;

import java.util.ArrayList;
import java.util.List;

/*
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
*/

/*
Constraints:

m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 105.
All elements in the matrix are distinct.
*/

class Solution {
	public static List<Integer> luckyNumbers(int[][] matrix) {
		int[] mins = new int[matrix.length];
		int[] maxs = new int[matrix[0].length];
		int min;
		for (int i = 0; i < matrix.length; i++) {
			min = 1000000;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}
			mins[i] = min;
		}
		int max = 0;
		for (int i = 0; i < matrix[0].length; i++) {
			max = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] > max) {
					max = matrix[j][i];
				}
			}
			maxs[i] = max;
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == maxs[j] && matrix[i][j] == mins[i]) {
					list.add(matrix[i][j]);
				}
			}
		}
		return list;
	}
}
