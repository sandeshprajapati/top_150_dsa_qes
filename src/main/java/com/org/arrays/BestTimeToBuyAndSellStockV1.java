package com.org.arrays;

public class BestTimeToBuyAndSellStockV1 {

	/*
	 * You are given an array prices where prices[i] is the price of a given stock
	 * on the ith day.
	 * 
	 * You want to maximize your profit by choosing a single day to buy one stock
	 * and choosing a different day in the future to sell that stock.
	 * 
	 * Return the maximum profit you can achieve from this transaction. If you
	 * cannot achieve any profit, return 0.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: prices = [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price = 1)
	 * and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2
	 * and selling on day 1 is not allowed because you must buy before you sell.
	 */
	// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };

		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {

		int buy_price = prices[0];
		int current_price = 0;
		int max_profit = 0;
		int n = prices.length;
		int i = 1;
		while (i < n) {
			if (buy_price > prices[i]) {
				buy_price = prices[i];
			} else {
				current_price = prices[i];
				max_profit = Math.max(max_profit, current_price - buy_price);
			}
			i++;
		}
		return max_profit;

	}
}
