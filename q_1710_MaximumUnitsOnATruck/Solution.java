package q_1710_MaximumUnitsOnATruck;

import java.util.Arrays;

/*You are assigned to put some amount of boxes onto one truck. 
 * You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:

numberOfBoxesi is the number of boxes of type i.
numberOfUnitsPerBoxi is the number of units in each box of the type i.
You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. 
You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.

Return the maximum total number of units that can be put on the truck.*/

/*
 * Constraints:

1 <= boxTypes.length <= 1000
1 <= numberOfBoxesi, numberOfUnitsPerBoxi <= 1000
1 <= truckSize <= 106
*/

class Solution {
	public static int maximumUnits(int[][] boxTypes, int truckSize) {
		int[] tem = new int[2];
		for (int j = 0; j < boxTypes.length; j++) {
			for (int i = 0; i < boxTypes.length; i++) {
				if (boxTypes[i][1] < boxTypes[j][1]) {
					tem[0] = boxTypes[i][0];
					tem[1] = boxTypes[i][1];

					boxTypes[i][0] = boxTypes[j][0];
					boxTypes[i][1] = boxTypes[j][1];

					boxTypes[j][0] = tem[0];
					boxTypes[j][1] = tem[1];

				}
			}
		}
		for (int i = 0; i < boxTypes.length; i++) {
			System.out.print(Arrays.toString(boxTypes[i]));
		}
		int cap = 0;
		System.out.println();
		System.out.println("cap " + cap + " truckSize " + truckSize);
		for (int i = 0; i < boxTypes.length; i++) {

			if (truckSize <= 0) {
				break;
			}
			if (boxTypes[i][0] <= truckSize) {
				cap += boxTypes[i][0] * boxTypes[i][1];
				truckSize -= boxTypes[i][0];
			} else if (truckSize >= 1) {
				cap += boxTypes[i][1] * truckSize;
				truckSize = 0;
			}
			if (truckSize <= 0) {
				break;
			}
			System.out.println("cap " + cap + " truckSize " + truckSize);

		}

		return cap;
	}

}
