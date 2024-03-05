package q_989_AddToArrayFormOfInteger;

import static q_989_AddToArrayFormOfInteger.Solution.addToArrayForm;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] num1 = { 1, 2, 0, 0 };
		int k = 34;
		System.out.println(addToArrayForm(num1, k));// [1, 2, 3, 4]

		// test case 2
		int[] num2 = { 2, 7, 4 };
		k = 181;
		System.out.println(addToArrayForm(num2, k));// [4, 5, 5]

		// test case 3
		int[] num3 = { 2, 1, 5 };
		k = 806;
		System.out.println(addToArrayForm(num3, k));// [1, 0, 2, 1]
	}

}
