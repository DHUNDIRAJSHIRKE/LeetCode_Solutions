package q_1389_CreateTargetArrayInTheGivenOrder;

import static q_1389_CreateTargetArrayInTheGivenOrder.Solution.createTargetArray;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] nums1 = { 0, 1, 2, 3, 4 };
		int[] index1 = { 0, 1, 2, 2, 1 };
		System.out.println(Arrays.toString(createTargetArray(nums1, index1)));// [0, 4, 1, 3, 2]

		// test case 2
		int[] nums2 = { 1, 2, 3, 4, 0 };
		int[] index2 = { 0, 1, 2, 3, 0 };
		System.out.println(Arrays.toString(createTargetArray(nums2, index2)));// [0, 1, 2, 3, 4]

		// test case 3
		int[] nums3 = { 1 };
		int[] index3 = { 0 };
		System.out.println(Arrays.toString(createTargetArray(nums3, index3)));//[1]
	}

}
