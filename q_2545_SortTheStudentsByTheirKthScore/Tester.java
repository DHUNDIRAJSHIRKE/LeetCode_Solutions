package q_2545_SortTheStudentsByTheirKthScore;

import static q_2545_SortTheStudentsByTheirKthScore.Solution.sortTheStudents;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[][] score1 = { { 10, 6, 9, 1 }, { 7, 5, 11, 2 }, { 4, 8, 3, 15 } };
		int k = 2;

		int[][] sortedArr1 = sortTheStudents(score1, k);
		for(int[] oneDarray : sortedArr1) {
			System.out.println(Arrays.toString(oneDarray));
		}
		
		// test case 2
		int[][] score2 = {{3,4},{5,6}};
		k = 0;
		int[][] sortedArr2 = sortTheStudents(score2, k);
		for(int[] oneDarray : sortedArr2) {
			System.out.println(Arrays.toString(oneDarray));
		}

	}

}
