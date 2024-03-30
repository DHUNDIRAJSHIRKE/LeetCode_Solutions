package q_3005_CountElementsWithMaximumFrequency;

import static q_3005_CountElementsWithMaximumFrequency.Solution.maxFrequencyElements;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] nums1 = { 1, 2, 2, 3, 1, 4 };
		System.out.println(maxFrequencyElements(nums1));// 4

		// test case 2
		int[] nums2 = { 1, 2, 3, 4, 5 };
		System.out.println(maxFrequencyElements(nums2));// 5

	}

}
