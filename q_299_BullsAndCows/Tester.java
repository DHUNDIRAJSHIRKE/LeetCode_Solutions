package q_299_BullsAndCows;

import static q_299_BullsAndCows.Solution.getHint;

public class Tester {

	public static void main(String[] args) {
		// Test case 1
		String secret = "1807";
		String guess = "7810";
		System.out.println(getHint(secret, guess));//1A3B

		// Test case 2
		secret = "1123";
		guess = "0111";
		System.out.println(getHint(secret, guess));//1A1B

	}

}
