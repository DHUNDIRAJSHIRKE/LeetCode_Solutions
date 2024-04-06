package q_1299_ReplaceElementsWithGreatestElementOnRightSide;

import static q_1299_ReplaceElementsWithGreatestElementOnRightSide.Solution.replaceElements;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] arr1 = { 17, 18, 5, 4, 6, 1 };
		System.out.println(Arrays.toString(replaceElements(arr1)));// [18, 6, 6, 6, 1, -1]

		// test case 2
		int[] arr2 = { 400 };
		System.out.println(Arrays.toString(replaceElements(arr2)));// [-1]

	}

}
