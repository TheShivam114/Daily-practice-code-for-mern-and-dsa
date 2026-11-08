/*
Best Time to Buy and Sell Stock
Difficulty: Easy
 Array + Greedy Algorithm

Problem
You are given an array prices, where prices[i] represents the price of a stock on the i-th day.

You want to buy one stock on one day and sell it on a different day in the future.

Return the maximum profit you can achieve.

If you cannot make any profit, return 0.
Example 1
Input: prices = [7, 1, 5, 3, 6, 4]
Output: 5


Explanation:
- Buy the stock on day 2 for ₹1.
- Sell the stock on day 5 for ₹6.
- Profit = 6 - 1 = 5.
Example 2
Input: prices = [7, 6, 4, 3, 1]
Output: 0


Explanation:

Stock prices are continuously decreasing, so we cannot make a profit.
Example 3
Input: prices = [2, 4, 1]
Output: 2


Explanation:

Buy at ₹2 and sell at ₹4.

Profit = 2.
Constraints
- 1 <= prices.length <= 100000
- 0 <= prices[i] <= 10000
Your challenge
Solve this problem using a single loop.

Hint: Maintain two variables:
1. minPrice – the lowest stock price seen so far.
2. maxProfit – the maximum profit found so far.
Formula:
\[
profit = prices[i] - minPrice
\]
*/

public class leetcode_day52 {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Calculate profit if we sell today
            int profit = prices[i] - minPrice;

            // Update maximum profit
            maxProfit = Math.max(maxProfit, profit);

            // Update minimum buying price
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}


