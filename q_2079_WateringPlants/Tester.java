package q_2079_WateringPlants;

import static q_2079_WateringPlants.Solution.wateringPlants;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] plants1 = { 2, 2, 3, 3 };
		int capacity = 5;
		System.out.println("Steps : " + wateringPlants(plants1, capacity));//Steps : 14

		// test case 2
		int[] plants2 = { 1, 1, 1, 4, 2, 3 };
		capacity = 4;
		System.out.println("Steps : " + wateringPlants(plants2, capacity));//Steps : 30

		// test case 3
		int[] plants3 = { 7,7,7,7,7,7,7 };
		capacity = 8;
		System.out.println("Steps : " + wateringPlants(plants3, capacity));//Steps : 49

	}

}
