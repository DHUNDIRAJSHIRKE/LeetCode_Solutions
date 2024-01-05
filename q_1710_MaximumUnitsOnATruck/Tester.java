package q_1710_MaximumUnitsOnATruck;

import static q_1710_MaximumUnitsOnATruck.Solution.maximumUnits;

public class Tester {

	public static void main(String[] args) {
		// test case 1
//		int[][] boxTypes= {{5,10},{2,5},{4,7},{3,9}};
//		int truckSize=10;
		// 91

		// test case 2
		int[][] boxTypes = { { 1, 3 }, { 2, 2 }, { 3, 1 }};
		int truckSize = 4;
		// 8

		System.out.println(maximumUnits(boxTypes, truckSize));

	}

}
