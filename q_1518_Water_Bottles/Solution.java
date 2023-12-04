package q_1518_Water_Bottles;

class Solution {
	public static int numWaterBottles(int numBottles, int numExchange) {
		int emptyB = 0;
		int fullB = numBottles;
		int extra = 0;
		while (fullB != 0) {
			emptyB++;
			fullB--;
			if (emptyB >= numExchange) {
				emptyB -= numExchange;
				fullB++;
				extra++;
			}
		}
		return numBottles + extra;
	}
}
