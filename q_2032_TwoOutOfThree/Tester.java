package q_2032_TwoOutOfThree;

import static q_2032_TwoOutOfThree.Solution.*;

import java.util.List;

public class Tester {

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {2,3};
		int[] nums3 = {3,1};
		List<Integer> list = twoOutOfThree(nums1, nums2, nums3);
		System.out.println(list);
	}

}
