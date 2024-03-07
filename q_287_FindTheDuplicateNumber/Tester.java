package q_287_FindTheDuplicateNumber;

import static q_287_FindTheDuplicateNumber.Solution.findDuplicate;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] nums1 = { 1, 3, 4, 2, 2 };
		System.out.println(findDuplicate(nums1));// 2

		// test case 2
		int[] nums2 = { 3, 1, 3, 4, 2 };
		System.out.println(findDuplicate(nums2));// 3

		// test case 3
		int[] nums3 = { 3, 3, 3, 3, 3 };
		System.out.println(findDuplicate(nums3));// 3

	}

}
