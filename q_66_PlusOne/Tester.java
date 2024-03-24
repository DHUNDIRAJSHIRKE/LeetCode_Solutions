package q_66_PlusOne;

import static q_66_PlusOne.Solution.plusOne;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] digits1 = {1,2,3};
		System.out.println(Arrays.toString(plusOne(digits1)));//[1, 2, 4]

		// test case 2
		int[] digits2 = {4,3,2,1};
		System.out.println(Arrays.toString(plusOne(digits2)));//[4, 3, 2, 2]

		// test case 3
		int[] digits3 = {9};
		System.out.println(Arrays.toString(plusOne(digits3)));//[1, 0]

	}

}
