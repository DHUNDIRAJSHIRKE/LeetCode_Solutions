package q_121_BestTimeToBuyAndSellStock;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

/*
Constraints:

1 <= prices.length <= 10^5
0 <= prices[i] <= 10^4
*/

class Solution {
	public static int maxProfit(int[] prices) {
		int min = prices[0];
		int diff;
		int max = 0;
		for (int i = 0; i < prices.length; i++) {
			diff = prices[i] - min;
			if (diff > max) {
				max = diff;
			}
			if (min > prices[i]) {
				min = prices[i];
			}
		}
		return max;

	}
}
