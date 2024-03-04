package q_1816_TruncateSentence;

import static q_1816_TruncateSentence.Solution.truncateSentence;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		String s = "Hello how are you Contestant";
		int k = 4;
		System.out.println(truncateSentence(s, k));// Hello how are you

		// test case 2
		s = "What is the solution to this problem";
		k = 4;
		System.out.println(truncateSentence(s, k));// What is the solution

		// test case 3
		s = "chopper is not a tanuki";
		k = 5;
		System.out.println(truncateSentence(s, k));// chopper is not a tanuki
	}

}
