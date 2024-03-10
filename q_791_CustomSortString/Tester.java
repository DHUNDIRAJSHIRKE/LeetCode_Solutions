package q_791_CustomSortString;

import static q_791_CustomSortString.Solution.customSortString;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		String order = "cba";
		String s = "abcd";
		System.out.println(customSortString(order, s));// cbad

		// test case 2
		order = "bcafg";
		s = "abcd";
		System.out.println(customSortString(order, s));// bcad

	}

}
