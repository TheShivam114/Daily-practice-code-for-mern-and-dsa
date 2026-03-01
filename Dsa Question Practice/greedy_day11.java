/*
Problem Title:
Minimum Number of Indian Currency Notes and Coins
Problem Description:
You are given an infinite supply of Indian currency denominations:
{1, 2, 5, 10, 20, 50, 100, 500, 2000}
Given a target amount V, determine the minimum number of coins/notes required to make the exact amount.
Your task is to compute and return the minimum count of denominations needed.
Input:
A single integer V representing the amount of money.
Output:
Return a single integer representing the minimum number of coins/notes required.
Constraints:

1≤V≤10
Unlimited supply of each denomination is available.
Example 1:
Input:
V = 121

Output:
3
Explanation:
Minimum denominations required: 100 + 20 + 1 → 3 notes/coins

Example 2:
Input:
V = 590
Output:
4
Explanation:
Minimum denominations required: 500 + 50 + 20 + 20 → 4 notes/coins
*/  import java.util.*;
public class greedy_day11 
  {
    public static int minCoins(int V) {
        int[] denominations = {2000, 500, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;

        for (int coin : denominations) {
            if (V >= coin) {
                count += V / coin;   // take maximum possible coins
                V = V % coin;        // reduce remaining value
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int V = sc.nextInt();
        int result = minCoins(V);
        System.out.println("Minimum coins/notes required: " + result);
        sc.close();
    }
}

