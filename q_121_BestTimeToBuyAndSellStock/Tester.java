package q_121_BestTimeToBuyAndSellStock;

import static q_121_BestTimeToBuyAndSellStock.Solution.maxProfit;

public class Tester {

	public static void main(String[] args) {
		// test case 1
		int[] prices1 = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices1));// 5

		// test case 2
		int[] prices2 = { 7, 6, 4, 3, 1 };
		System.out.println(maxProfit(prices2));// 0

		// test case 3
		int[] prices3 = { 2, 4, 1 };
		System.out.println(maxProfit(prices3));// 2

	}

}
