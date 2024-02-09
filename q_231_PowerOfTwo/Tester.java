package q_231_PowerOfTwo;

import static q_231_PowerOfTwo.Solution.isPowerOfTwo;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int n = 16;
		System.out.println(isPowerOfTwo(n));// true;
		// test case 2
		n = 1;
		System.out.println(isPowerOfTwo(n));// true;
		// test case 3
		n = 3;
		System.out.println(isPowerOfTwo(n));// false;
	}

}
