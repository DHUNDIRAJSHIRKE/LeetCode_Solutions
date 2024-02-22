package q_807_MaxIncreaseToKeepCitySkyline;

import static q_807_MaxIncreaseToKeepCitySkyline.Solution.maxIncreaseKeepingSkyline;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[][] grid1 = { { 3, 0, 8, 4 }, { 2, 4, 5, 7 }, { 9, 2, 6, 3 }, { 0, 3, 1, 0 } };
		System.out.println(maxIncreaseKeepingSkyline(grid1));// 35

		// test case 2
		int[][] grid2 = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		System.out.println(maxIncreaseKeepingSkyline(grid2));//0

	}

}
