package q_2545_SortTheStudentsByTheirKthScore;

/*
There is a class with m students and n exams. You are given a 0-indexed m x n integer matrix score, where each row represents one student and score[i][j] denotes the score the ith student got in the jth exam. The matrix score contains distinct integers only.

You are also given an integer k. Sort the students (i.e., the rows of the matrix) by their scores in the kth (0-indexed) exam from the highest to the lowest.

Return the matrix after sorting it.
*/

/*
Constraints:

m == score.length
n == score[i].length
1 <= m, n <= 250
1 <= score[i][j] <= 105
score consists of distinct integers.
0 <= k < n
*/

class Solution {
	public static int[][] sortTheStudents(int[][] score, int k) {
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i][k] - score[j][k] < 1) {
					int[] temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		return score;
	}
}
