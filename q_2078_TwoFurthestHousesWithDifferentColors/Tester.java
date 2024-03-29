package q_2078_TwoFurthestHousesWithDifferentColors;

import static q_2078_TwoFurthestHousesWithDifferentColors.Solution.maxDistance;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] colors1 = { 1, 1, 1, 6, 1, 1, 1 };
		System.out.println(maxDistance(colors1));// 3

		// test case 2
		int[] colors2 = { 1, 8, 3, 8, 3 };
		System.out.println(maxDistance(colors2));// 4

		// test case 3
		int[] colors3 = { 0, 1 };
		System.out.println(maxDistance(colors3));// 1

	}

}
