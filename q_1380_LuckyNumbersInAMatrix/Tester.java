package q_1380_LuckyNumbersInAMatrix;

import static q_1380_LuckyNumbersInAMatrix.Solution.luckyNumbers;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[][] matrix1 = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
		System.out.println(luckyNumbers(matrix1));// [15]

		// test case 2
		int[][] matrix2 = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };
		System.out.println(luckyNumbers(matrix2));// [12]

		// test case 3
		int[][] matrix3 = { { 7, 8 }, { 1, 2 } };
		System.out.println(luckyNumbers(matrix3));// [7]

	}

}
