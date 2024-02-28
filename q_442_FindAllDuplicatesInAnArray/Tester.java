package q_442_FindAllDuplicatesInAnArray;

import static q_442_FindAllDuplicatesInAnArray.Solution.findDuplicates;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] nums1 = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDuplicates(nums1));// [2, 3]

		// test case 2
		int[] nums2 = { 1, 1, 2 };
		System.out.println(findDuplicates(nums2));// [1]

		// test case 3
		int[] nums3 = { 1 };
		System.out.println(findDuplicates(nums3));// []
	}

}
