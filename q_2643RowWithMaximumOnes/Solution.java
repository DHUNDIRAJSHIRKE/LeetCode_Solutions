package q_2643RowWithMaximumOnes;


/*Given a m x n binary matrix mat, 
 * find the 0-indexed position of the row that contains the maximum count of ones, 
 * and the number of ones in that row.

In case there are multiple rows that have the maximum count of ones, 
the row with the smallest row number should be selected.

Return an array containing the index of the row, and the number of ones in it.

Constraints:

m == mat.length 
n == mat[i].length 
1 <= m, n <= 100 
mat[i][j] is either 0 or 1.

*/



public class Solution {
	public static int[] rowAndMaximumOnes(int[][] mat) {
		int[] ret = new int[2];
		int[] ones = new int[mat.length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1) {
					ones[i]++;
				}
			}
		}
		int max = 0;
		for (int i = ones.length - 1; i >= 0; i--) {
			if (ones[i] >= max) {
				max = ones[i];
				ret[0] = i;
				ret[1] = max;
			}
		}
		return ret;
	}
}
