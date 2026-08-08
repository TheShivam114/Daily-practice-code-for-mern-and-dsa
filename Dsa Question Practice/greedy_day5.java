/*
     Fractional Knapsack Problem (Greedy Algorithm)

You are given N items, where each item has a value and a weight. You are also given a knapsack with a maximum capacity W.

Unlike the 0/1 Knapsack problem, you are allowed to take fractions of items. Your objective is to determine the maximum total value that can be obtained by placing items (fully or partially) into the knapsack without exceeding its capacity.

Input:
value[]  = {60, 100, 120}
weight[] = {10, 20, 30}
W = 50
Task:

Determine the optimal fraction of each item to include.

Compute the maximum achievable total value.

Justify your approach using the appropriate greedy strategy.

Output:
Maximum Total Value = 240
Constraints:

1 ≤ N ≤ 10^5

1 ≤ value[i], weight[i], W ≤ 10^4
*/
public class greedy_day5 {

    public class FractionalKnapsack {

        
    }
      public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int W = 50;

        double result = getMaxValue(value, weight, W);
        System.out.println("Maximum Total Value = " + result);
    }
}
