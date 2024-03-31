package q_1460_MakeTwoArraysEqualByReversingSubarrays;

import static q_1460_MakeTwoArraysEqualByReversingSubarrays.Solution.canBeEqual;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] target1 = { 1, 2, 3, 4 };
		int[] arr1 = { 2, 4, 1, 3 };
		System.out.println(canBeEqual(target1, arr1));// true

		// test case 2
		int[] target2 = { 7 };
		int[] arr2 = { 7 };
		System.out.println(canBeEqual(target2, arr2));// true

		// test case 3
		int[] target3 = { 3, 7, 9 };
		int[] arr3 = { 3, 7, 11 };
		System.out.println(canBeEqual(target3, arr3));// false
	}

}
