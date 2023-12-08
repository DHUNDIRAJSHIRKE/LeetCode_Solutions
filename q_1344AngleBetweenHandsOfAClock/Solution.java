package q_1344AngleBetweenHandsOfAClock;


/*
 * 
 * Given two numbers, hour and minutes, return the smaller angle (in degrees) formed between the hour and the minute hand.

Answers within 10-5 of the actual value will be accepted as correct.

Constraints:

1 <= hour <= 12
0 <= minutes <= 59

*
*/


public class Solution {
	public static double angleClock(int hour, int minutes) {
		double mh = 0;
		double hh = 0;
		hh = (hour * 30) % 360 + (minutes * 0.5) % 360;
		mh = (minutes * 6) % 360;
		double angle = 0;
		if (hh >= mh) {
			angle = hh - mh;
		} else {
			angle = mh - hh;
		}

		if (angle > 180) {
			return 360 - angle;
		} else {
			return angle;
		}
	}
}
