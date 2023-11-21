package q_2706_BuyTwoChocolates;

import java.util.Arrays;

/*You are given an integer array prices representing the prices of various chocolates in a store. 
 You are also given a single integer money, which represents your initial amount of money.
 
 You must buy exactly two chocolates in such a way that you still have some non-negative leftover money.
 You would like to minimize the sum of the prices of the two chocolates you buy.

 Return the amount of money you will have leftover after buying the two chocolates.
 If there is no way for you to buy two chocolates without ending up in debt, return money.
 Note that the leftover must be non-negative.
 */
public class Solution {
	public static int buyChoco(int[] prices, int money) {
		int sum = 0;
		Arrays.sort(prices);
		for (int i = 0; i < 2; i++) {
			sum += prices[i];
		}
		if (sum <= money) {
			return money - sum;
		} else {
			return money;
		}
	}

}
