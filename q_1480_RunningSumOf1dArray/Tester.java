package q_1480_RunningSumOf1dArray;

import static q_1480_RunningSumOf1dArray.Solution.runningSum;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// test case 1
//		int[] nums = { 3, 1, 2, 10, 1 };

		// test case 2
//		int[] nums = { 1, 1, 1, 1, 1 };

		// test case 2
		int[] nums = { 1,2,3,4 };
		System.out.println(Arrays.toString(runningSum(nums)));

	}

}
