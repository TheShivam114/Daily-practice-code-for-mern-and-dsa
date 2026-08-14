/*
Greedy Algorithm (Maximum Length Chain of Pairs)
Problem Title: Maximum Length Chain of Pairs
You are given n pairs of integers where in each pair the first number is strictly smaller than the second number.
A pair (c, d) can follow another pair (a, b) if and only if:
b<c
Your task is to determine the maximum length of a chain that can be formed using the given pairs.
Input
An integer n — the number of pairs.
A list of n pairs of integers where for each pair 

(x,y), 
x<y.

Output
Return a single integer representing the maximum number of pairs that can be arranged in a valid chain.
Example
Input:
pairs = {(5, 24), (39, 60), (5, 28), (27, 40), (50, 90)}

Output:
3
Explanation:
One possible maximum chain is:
(5, 24) → (27, 40) → (50, 90)
Thus, the maximum length of the chain is 3.
Constraints

1≤n≤10
≤x<y≤10
9
*/   import java.util.*;
public class greedy_day10 {
    public static int maxChainLength(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int count = 1; 
        int lastEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > lastEnd) {
                count++;
                lastEnd = pairs[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] pairs = {
            {5, 24},
            {39, 60},
            {5, 28},
            {27, 40},
            {50, 90}
        };

        System.out.println("Maximum Chain Length: " + maxChainLength(pairs));
    }
}

