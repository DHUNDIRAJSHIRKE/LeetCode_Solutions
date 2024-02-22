package q_807_MaxIncreaseToKeepCitySkyline;

/*
There is a city composed of n x n blocks, where each block contains a single building shaped like a vertical square prism. 
You are given a 0-indexed n x n integer matrix grid where grid[r][c] represents the height of the building located in the block at row r and column c.

A city's skyline is the outer contour formed by all the building when viewing the side of the city from a distance. 
The skyline from each cardinal direction north, east, south, and west may be different.

We are allowed to increase the height of any number of buildings by any amount (the amount can be different per building). 
The height of a 0-height building can also be increased. 
However, increasing the height of a building should not affect the city's skyline from any cardinal direction.

Return the maximum total sum that the height of the buildings can be increased by without changing the city's skyline from any cardinal direction.
*/

/*
Constraints:

n == grid.length
n == grid[r].length
2 <= n <= 50
0 <= grid[r][c] <= 100
*/

class Solution {
	public static int maxIncreaseKeepingSkyline(int[][] grid) {
		int l = grid.length;
		int[] rowMax = new int[l];
		int[] colMax = new int[l];
		int height = 0;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				if (rowMax[i] < grid[i][j]) {
					rowMax[i] = grid[i][j];
				}
			}
		}

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				if (colMax[i] < grid[j][i]) {
					colMax[i] = grid[j][i];
				}
			}
		}

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				if (rowMax[i] < colMax[j]) {
					height += rowMax[i] - grid[i][j];
				} else {
					height += colMax[j] - grid[i][j];
				}
			}
		}
		return height;
	}
}
