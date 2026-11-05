/*
Min Cost Climbing Stairs
Easy
Dynamic Programming · Arrays

Problem Statement
You are given an integer array cost, where cost[i] is the cost of stepping on the i-th stair.

Once you pay the cost, you can climb either one or two steps.

You can start from either step 0 or step 1.

Return the minimum cost to reach the top of the staircase.
Example 1
Input:
int[] cost = {10, 15, 20};


Output:
15


Explanation:
- Start at step 1 (cost = 15).
- Climb two steps to reach the top.
- Total cost = 15.
Example 2
Input:
int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};


Output:
6


Your challenge 🎯
Write a Java solution using:
1. public class Main
2. main() method
3. Dynamic Programming
4. Optimize the solution to O(1) extra space.
Hint 💡

To reach stair i, you can come from either:
- Stair i - 1
- Stair i - 2
Think about this formula:
\[
dp[i] = cost[i] + \min(dp[i-1],dp[i-2])
\]


*/
    
public class leetcode_day49 {

    public static int minCostClimbingStairs(int[] cost) {

        int prev2 = cost[0];
        int prev1 = cost[1];

        for (int i = 2; i < cost.length; i++) {

            int current = cost[i] + Math.min(prev1, prev2);

            prev2 = prev1;
            prev1 = current;
        }

        return Math.min(prev1, prev2);
    }

    public static void main(String[] args) {

        int[] cost = {10, 15, 20};

        int result = minCostClimbingStairs(cost);

        System.out.println("Minimum cost: " + result);
    }
}


