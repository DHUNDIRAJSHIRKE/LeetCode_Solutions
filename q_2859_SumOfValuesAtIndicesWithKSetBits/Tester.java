package q_2859_SumOfValuesAtIndicesWithKSetBits;

import static q_2859_SumOfValuesAtIndicesWithKSetBits.Solution.sumIndicesWithKSetBits;
import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] arr1 = { 5, 10, 1, 5, 2 };
		List<Integer> nums = new ArrayList<>();
		for (int i : arr1) {
			nums.add(i);
		}
		int k = 1;
		System.out.println(sumIndicesWithKSetBits(nums, k));// 13

		nums.clear();

		// test case 2
		int[] arr2 = { 4,3,2,1 };
		nums = new ArrayList<>();
		for (int i : arr2) {
			nums.add(i);
		}
		k = 2;
		System.out.println(sumIndicesWithKSetBits(nums, k));//1

	}

}
