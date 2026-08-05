/*

Prefix Sum
Problem: Range Sum Query
Difficulty

⭐ Easy

Problem Statement

You are given an array of N integers and Q queries.

Each query contains two integers L and R (0-based indices). For every query, find the sum of all elements from index L to R (inclusive).

To answer multiple queries efficiently, use the Prefix Sum technique.

Function Description

Implement the function:

public static int rangeSum(int[] prefix, int L, int R)
Parameters
prefix – The prefix sum array.
L – Starting index of the query.
R – Ending index of the query.
Returns
The sum of elements between indices L and R (inclusive).
Input Format
The first line contains two integers:
N Q
The second line contains N space-separated integers.
The next Q lines each contain two integers:
L R

representing a query.

Output Format

For each query, print the sum of elements from index L to R.

Constraints
1 ≤ N ≤ 10^5
1 ≤ Q ≤ 10^5
-10^4 ≤ arr[i] ≤ 10^4
0 ≤ L ≤ R < N
Sample Input
5 3
2 4 6 8 10
0 2
1 3
2 4
Sample Output
12
18
24
Explanation

Array:

Index : 0 1 2 3 4
Value : 2 4 6 8 10
Query 1
L = 0
R = 2

Sum:

2 + 4 + 6 = 12
Query 2
L = 1
R = 3

Sum:

4 + 6 + 8 = 18

*/

import java.util.*;

public class practice19 {

    // Function to return the sum from index L to R
    public static int rangeSum(int[] prefix, int L, int R) {

        if (L == 0) {
            return prefix[R];
        }

        return prefix[R] - prefix[L - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[N];
        int[] prefix = new int[N];

        // Read array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Build Prefix Sum Array
        prefix[0] = arr[0];

        for (int i = 1; i < N; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Process Queries
        for (int i = 0; i < Q; i++) {

            int L = sc.nextInt();
            int R = sc.nextInt();

            System.out.println(rangeSum(prefix, L, R));
        }

        sc.close();
    }
}