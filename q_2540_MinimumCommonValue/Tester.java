package q_2540_MinimumCommonValue;

import static q_2540_MinimumCommonValue.Solution.getCommon;

public class Tester {

	public static void main(String[] args) {
		// Test case 1
//		int[] nums1= {1,2,3};
//		int[] nums2= {2,4};
		//ans = 2

		// Test case 2
		int[] nums1 = { 1, 2, 3, 6 };
		int[] nums2 = { 2, 3, 4, 5 };
		//ans = 2
		
		
		
		System.out.println(getCommon(nums1, nums2));
	}

}
