package q_2525_CategorizeBoxAccordingToCriteria;

/*Given four integers length, width, height, and mass, representing the dimensions and mass of a box, respectively, return a string representing the category of the box.

The box is "Bulky" if:
Any of the dimensions of the box is greater or equal to 104.
Or, the volume of the box is greater or equal to 109.
If the mass of the box is greater or equal to 100, it is "Heavy".
If the box is both "Bulky" and "Heavy", then its category is "Both".
If the box is neither "Bulky" nor "Heavy", then its category is "Neither".
If the box is "Bulky" but not "Heavy", then its category is "Bulky".
If the box is "Heavy" but not "Bulky", then its category is "Heavy".
Note that the volume of the box is the product of its length, width and height.*/

/*
 * Constraints:

1 <= length, width, height <= 105
1 <= mass <= 103

*/

class Solution {
	public static String categorizeBox(int length, int width, int height, int mass) {
		String ret = null;
		long l = length;
		long w = width;
		long h = height;
		if (l >= 10000 || w >= 10000 || h >= 10000 || h * w * l >= 1000000000) {
			ret = "Bulky";
			if (mass >= 100) {
				ret = "Both";
			}
		} else if (mass >= 100) {
			ret = "Heavy";
		} else {
			ret = "Neither";
		}
		return ret;
	}
}
