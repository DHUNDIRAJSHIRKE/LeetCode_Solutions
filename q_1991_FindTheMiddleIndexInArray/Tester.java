package q_1991_FindTheMiddleIndexInArray;

import static q_1991_FindTheMiddleIndexInArray.Solution.findMiddleIndex;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] nums1 = { 2, 3, -1, 8, 4 };
		System.out.println(findMiddleIndex(nums1));// 3

		// test case 2
		int[] nums2 = { 1, -1, 4 };
		System.out.println(findMiddleIndex(nums2));// 2

		// test case 3
		int[] nums3 = { 2, 5 };
		System.out.println(findMiddleIndex(nums3));// -1
	}

}
