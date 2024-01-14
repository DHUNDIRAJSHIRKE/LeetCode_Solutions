package q_75_SortColors;

import static q_75_SortColors.Solution.sortColors;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// test case 1
//		int[] nums = {2,0,2,1,1,0};//[0, 0, 1, 1, 2, 2]

		// test case2
		int[] nums = { 2,0,1 };//[0, 1, 2]

		sortColors(nums);
		System.out.println(Arrays.toString(nums));

	}

}
