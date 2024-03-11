package q_415_AddStrings;

import static q_415_AddStrings.Solution.addStrings;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		String num1 = "11";
		String num2 = "123";
		System.out.println(addStrings(num1, num2));// 134

		// test case 2
		num1 = "456";
		num2 = "77";
		System.out.println(addStrings(num1, num2));// 533

		// test case 3
		num1 = "0";
		num2 = "0";
		System.out.println(addStrings(num1, num2));// 0
	}

}
