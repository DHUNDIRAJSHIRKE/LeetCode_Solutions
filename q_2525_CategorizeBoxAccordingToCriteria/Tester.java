package q_2525_CategorizeBoxAccordingToCriteria;

import static q_2525_CategorizeBoxAccordingToCriteria.Solution.categorizeBox;

public class Tester {

	public static void main(String[] args) {
		// Test case 1
		int length = 2909;
		int width = 3968;
		int height = 3272;
		int mass = 727;
		// Both

		// Test case 2
		length = 1000;
		width = 35;
		height = 700;
		mass = 300;
		// Heavy

		// Test case 3
		length = 200;
		width = 50;
		height = 800;
		mass = 50;
		//Neither

		System.out.println(categorizeBox(length, width, height, mass));

	}

}
