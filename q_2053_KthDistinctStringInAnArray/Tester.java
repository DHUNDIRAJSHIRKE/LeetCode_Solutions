package q_2053_KthDistinctStringInAnArray;

import static q_2053_KthDistinctStringInAnArray.Solution.kthDistinct;

public class Tester {

	public static void main(String[] args) {
		// Test case 1
//		String[] arr= {"d","b","c","b","c","a"};
//		int k=2;
		// "a"

		// Test case 2
//		String[] arr = { "aaa","aa","a" };
//		int k = 1;
		// "aaa"

		// Test case 1
		String[] arr = { "a","b","a" };
		int k = 3;
		// ""

		System.out.println(kthDistinct(arr, k));
	}

}
