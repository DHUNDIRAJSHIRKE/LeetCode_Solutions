package q_1252_CellsWithOddValuesInAMatrix;

/*There is an m x n matrix that is initialized to all 0's. 
 *There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
*/

public class Solution {
	public static int oddCells(int m, int n, int[][] indices) {
		int[][] matrix = new int[m][n];
		for (int i = 0; i < indices.length; i++) {
			rowOp(indices[i][0], matrix);
			colOp(indices[i][1], matrix);
		}

		return countOddCells(matrix);
	}

	public static int countOddCells(int[][] indices) {
		int count = 0;
		for (int i = 0; i < indices.length; i++) {
			for (int j = 0; j < indices[i].length; j++) {
				if (indices[i][j] % 2 == 1) {
					count++;
				}
			}
		}
		return count;
	}

	public static void rowOp(int row, int[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[row][i]++;
		}
	}

	public static void colOp(int col, int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col]++;
		}
	}
}
