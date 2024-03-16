package q_1796_SecondLargestDigitInAString;

import static q_1796_SecondLargestDigitInAString.Solution.secondHighest;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		String s = "dfa12321afd";
		System.out.println(secondHighest(s));// 2

		// test case 2
		s = "abc1111";
		System.out.println(secondHighest(s));// -1

		// test case 3
		s = "ck077";
		System.out.println(secondHighest(s));// 0

	}

}
