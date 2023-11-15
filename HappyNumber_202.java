/*

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

*/

class HappyNumber_202 {
	public boolean isHappy(int n) {
		int count = 0;
		int ans = n;
		int max = 25;
		int[] answers = new int[max];
		for (int i = 0; i < max; i++) {
			answers[i] = 0;
		}
		while (count < max) {
			ans = check(ans);
			answers[count] = ans;
			for (int i = 0; i < count; i++) {
				if (ans == answers[i]) {
					return false;
				}
			}
			if (ans == 1) {
				return true;
			}
			if (ans != 1) {
				count++;
			}
		}
		return false;
	}

	private static int check(int n) {
		int num = n;
		int sum = 0;
		int tem = 0;
		while (num != 0) {
			tem = num % 10;
			num = num / 10;
			sum = sum + tem * tem;
		}
		return sum;
	}
}
