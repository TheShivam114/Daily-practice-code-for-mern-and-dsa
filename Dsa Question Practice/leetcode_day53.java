/*
Best Time to Buy and Sell Stock II
Difficulty: Medium
 Greedy Algorithm

Problem
You are given an array prices, where prices[i] represents the stock price on the i-th day.

You can buy and sell stocks multiple times.

Rules:
- You can hold only one stock at a time.
- You can buy and sell on the same day only if you sell before buying again.
- Your goal is to maximize total profit.
Return the maximum profit you can achieve.
Example 1
Input: prices = [7, 1, 5, 3, 6, 4]
Output: 7


Explanation:
- Buy at ₹1 and sell at ₹5 → Profit = 4.
- Buy at ₹3 and sell at ₹6 → Profit = 3.
- Total profit = 7.
Example 2
Input: prices = [1, 2, 3, 4, 5]
Output: 4


Explanation:

Buy at ₹1 and sell at ₹5.

Total profit = 4.
Example 3
Input: prices = [7, 6, 4, 3, 1]
Output: 0


Explanation:

Prices continuously decrease, so no transaction is profitable.
Constraints
- 1 <= prices.length <= 3 * 10^4
- 0 <= prices[i] <= 10^4
Your challenge
Solve this using a single loop.

Hint: Whenever today's price is greater than yesterday's price, add the difference to your total profit.
\[
profit += \max(0, prices[i] - prices[i-1])
\]

Try writing the complete Java program using public class Main and main().

Type solution when you're ready!
*/
   
public class leetcode_day53{
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        System.out.println("Maximum Profit: " + profit);
    }
}

