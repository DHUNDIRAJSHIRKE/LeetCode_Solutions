package q_2390_RemovingStarsFromAString;

import static q_2390_RemovingStarsFromAString.Solution.removeStars;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		String s = "leet**cod*e";
		System.out.println(removeStars(s));// "lecoe"

		// test case 2
		s = "erase*****";
		System.out.println(removeStars(s));// ""

		// test case 3
		s = "abb*cdfg*****x*";
		System.out.println(removeStars(s));// "a"

	}

}
