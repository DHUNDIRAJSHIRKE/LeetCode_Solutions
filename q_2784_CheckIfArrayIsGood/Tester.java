package q_2784_CheckIfArrayIsGood;

import static q_2784_CheckIfArrayIsGood.Solution.isGood;

public class Tester {
	public static void main(String[] args) {
		// test case 1
		int[] nums1 = { 3, 4, 4, 1, 2, 1 };
		System.out.println(isGood(nums1));// false

		// test case 2
		int[] nums2 = { 1, 1 };
		System.out.println(isGood(nums2));// true

		// test case 3
		int[] nums3 = { 1, 3, 3, 2 };
		System.out.println(isGood(nums3));// true

	}
}
