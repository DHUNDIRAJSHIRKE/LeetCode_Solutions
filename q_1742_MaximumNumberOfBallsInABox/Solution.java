package q_1742_MaximumNumberOfBallsInABox;

import java.util.HashMap;
import java.util.Map;


/*
You are working in a ball factory where you have n balls numbered from lowLimit up to highLimit inclusive (i.e., n == highLimit - lowLimit + 1), and an infinite number of boxes numbered from 1 to infinity.

Your job at this factory is to put each ball in the box with a number equal to the sum of digits of the ball's number. For example, the ball number 321 will be put in the box number 3 + 2 + 1 = 6 and the ball number 10 will be put in the box number 1 + 0 = 1.

Given two integers lowLimit and highLimit, return the number of balls in the box with the most balls.
*/

/*
Constraints:

1 <= lowLimit <= highLimit <= 105
*/

class Solution {
	public static int countBalls(int lowLimit, int highLimit) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int temp;
		int digit;
		for (int i = lowLimit; i <= highLimit; i++) {
			if (i < 10) {
				digit = i;
			} else {
				digit = getDigitSum(i);
			}
			if (map.containsKey(digit)) {
				temp = map.get(digit);
				map.put(digit, (temp + 1));
			} else {
				map.put(digit, 1);
			}
		}
		int max = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
			}
		}
		return max;
	}

	public static int getDigitSum(int num) {
		String str = "" + num;
		char[] chars = str.toCharArray();
		int sum = 0;
		for (char c : chars) {
			sum += c - '0';
		}
		return sum;
	}
}
