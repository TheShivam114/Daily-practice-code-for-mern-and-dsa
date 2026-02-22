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

import java.util.Arrays;
import java.util.Comparator;

public class greedy_day6 {

    public class FractionalKnapsack {

        
    }
      public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int W = 50;

        double ratio[][]=new double[val.length][2];
         //oth cal=>idx; 1st col=>ratio

         for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
         }

        // ascend
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity=W;
        int finalval=0;

        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx])//include full item
            {
                finalval +=val[idx];
                capacity -= weight[idx];

            }
            else   //include fraction item
            {
                finalval +=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
         System.out.println("final val="+finalval);

    }
}

