package q_2500_DeleteGreatestValueInEachRow;

import static q_2500_DeleteGreatestValueInEachRow.Solution.deleteGreatestValue;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[][] grid1 = { { 1, 2, 4 }, { 3, 3, 1 } };
		System.out.println(deleteGreatestValue(grid1));// 8

		// test case 2
		int[][] grid2 = { { 10 } };
		System.out.println(deleteGreatestValue(grid2));//10

	}

}
