package q_1528_ShuffleString;

import static q_1528_ShuffleString.Solution.restoreString;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		String s = "codeleet";
		int[] indices1 = { 4, 5, 6, 7, 0, 2, 1, 3 };
		System.out.println(restoreString(s, indices1));// leetcode

		// test case 2
		s = "abc";
		int[] indices2 = { 0, 1, 2 };
		System.out.println(restoreString(s, indices2));// abc

	}

}
