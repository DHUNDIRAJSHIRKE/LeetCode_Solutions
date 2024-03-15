package q_1556_ThousandSeparator;

import static q_1556_ThousandSeparator.Solution.thousandSeparator;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int n = 987;
		System.out.println(thousandSeparator(n));// 987

		// test case 2
		n = 1234;
		System.out.println(thousandSeparator(n));// 1.234

		// test case 3
		n = 123456789;
		System.out.println(thousandSeparator(n));// 123.456.789

	}

}
