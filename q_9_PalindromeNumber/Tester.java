package q_9_PalindromeNumber;

import static q_9_PalindromeNumber.Solution.isPalindrome;

public class Tester {

	public static void main(String[] args) {
		// Test case 1
		int x = 121;
		System.out.println(isPalindrome(x));// true

		// Test case 2
		x = -121;
		System.out.println(isPalindrome(x));// false

		// Test case 3
		x = 10;
		System.out.println(isPalindrome(x));// false

	}

}
