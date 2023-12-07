package q_1232_CheckIfItIsAStraightLine;

/*You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
 *  Check if these points make a straight line in the XY plane.
 * Constraints:

2 <= coordinates.length <= 1000
coordinates[i].length == 2
-10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
coordinates contains no duplicate point.

*
*/

public class Solution {
	public static boolean checkStraightLine(int[][] coordinates) {
		int x = 0;
		int y = 0;
		double[] slopeArr = new double[coordinates.length - 1];
		for (int i = 0; i < coordinates.length - 1; i++) {
			// = calcSlope(coordinates[i],coordinates[i+1]);

			if (coordinates[i + 1][0] >= coordinates[i][0]) {
				x = (coordinates[i + 1][0] - coordinates[i][0]);
				y = (coordinates[i + 1][1] - coordinates[i][1]);
			} else {
				x = (coordinates[i][0] - coordinates[i + 1][0]);
				y = (coordinates[i][1] - coordinates[i + 1][1]);
			}

//			System.out.println("i = " + i + " x =" + coordinates[i][0] + " y =" + coordinates[i][1]);
//			System.out.println("i+1 = " + i + " x =" + coordinates[i + 1][0] + " y =" + coordinates[i + 1][1]);
			if (x == 0) {
//				System.out.println(" x1 " + coordinates[i][0] + " and y1 " + coordinates[i][1]);
//				System.out.println(" x2 " + coordinates[i + 1][0] + " and y2 " + coordinates[i + 1][1]);
//				System.out.println(coordinates[i][0] + " x1      x2 " + coordinates[i + 1][0]);
				if (coordinates[i][0] != coordinates[i + 1][0]) {
					return false;
				}
				if (x == 0) {
					slopeArr[i] = Double.MAX_VALUE;
				} else {
					slopeArr[i] = (y / x);
				}

				if (i > 0) {
					if (slopeArr[i] != slopeArr[i - 1]) {
//						System.out.println("slopeArr[i] " + slopeArr[i] + " != slopeArr[i-1] " + slopeArr[i - 1]);
						return false;
					}
				}
			} else {
//            	System.out.println("x " +x+" y"+y);
				slopeArr[i] = y / x + y % x;
				if (i > 0) {
					if (slopeArr[i] != slopeArr[i - 1]) {
//                 	   System.out.println("slopeArr[i] "+ slopeArr[i]+" != slopeArr[i-1] "+slopeArr[i-1]);
						return false;
					}
				}
			}
		}
		return true;
	}
}
