package q_2259_RemoveDigitFromNumberToMaximizeResult;

import static q_2259_RemoveDigitFromNumberToMaximizeResult.Solution.removeDigit;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		String number = "123";
		char digit = '3';
		System.out.println(removeDigit(number, digit));//12

		// test case 2
		number = "1231";
		digit = '1';
		System.out.println(removeDigit(number, digit));//231

		// test case 3
		number = "551";
		digit = '5';
		System.out.println(removeDigit(number, digit));//51

	}

}
