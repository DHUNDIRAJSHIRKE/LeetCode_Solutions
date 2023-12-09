package q_2923_FindChampion_I;

/*There are n teams numbered from 0 to n - 1 in a tournament.

Given a 0-indexed 2D boolean matrix grid of size n * n. 
For all i, j that 0 <= i, j <= n - 1 and i != j team i is stronger than team j if grid[i][j] == 1, otherwise, 
team j is stronger than team i.

Team a will be the champion of the tournament if there is no team b that is stronger than team a.

Return the team that will be the champion of the tournament.

Constraints:

n == grid.length
n == grid[i].length
2 <= n <= 100
grid[i][j] is either 0 or 1.
For all i grid[i][i] is 0.
For all i, j that i != j, grid[i][j] != grid[j][i].
The input is generated such that if team a is stronger than team b and team b is stronger than team c,
then team a is stronger than team c.

*/



public class Solution {
	public static int findChampion(int[][] grid) {
		int l = grid.length;
		int[] arr = new int[l];
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				if (grid[i][j] == 1) {
					arr[i]++;
				}
			}
		}
		int max = 0;
		int maxIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
