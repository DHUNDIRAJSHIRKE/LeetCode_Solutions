package q_2849_DetermineIfACellIsReachableAtAGivenTime;

import static q_2849_DetermineIfACellIsReachableAtAGivenTime.Solution.isReachableAtTime;

public class Tester {

	public static void main(String[] args) {
		// Test case 1
		int sx = 2;
		int sy = 4;
		int fx = 7;
		int fy = 7;
		int t = 6;
		System.out.println(isReachableAtTime(sx, sy, fx, fy, t));//true

		// Test case 2
		sx = 3;
		sy = 1;
		fx = 7;
		fy = 3;
		t = 3;
		System.out.println(isReachableAtTime(sx, sy, fx, fy, t));//false

	}

}
