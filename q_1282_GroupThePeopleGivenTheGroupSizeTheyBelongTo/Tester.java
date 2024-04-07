package q_1282_GroupThePeopleGivenTheGroupSizeTheyBelongTo;

import static q_1282_GroupThePeopleGivenTheGroupSizeTheyBelongTo.Solution.groupThePeople;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] groupSizes1 = { 3, 3, 3, 3, 3, 1, 3 };
		System.out.println(groupThePeople(groupSizes1));// [[0, 1, 2], [5], [3, 4, 6]]

		// test case 2
		int[] groupSizes2 = { 2, 1, 3, 3, 3, 2 };
		System.out.println(groupThePeople(groupSizes2));// [[1], [0, 5], [2, 3, 4]]

	}

}
