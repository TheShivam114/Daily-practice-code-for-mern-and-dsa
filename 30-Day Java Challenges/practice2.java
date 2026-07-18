/*
Maximum Bitwise AND Under a Given Limit
Problem Statement
Given two positive integers N and K, consider the set of integers:
S = {1, 2, 3, ..., N}

Your task is to determine the maximum possible value of the bitwise AND (&) operation between any two distinct integers A and B from the set, such that:

1 ≤ A < B ≤ N
(A & B) < K

Return the largest value of (A & B) that satisfies the above conditions.

Function Description

Implement the function:

public static int maximumBitwiseAnd(int N, int K)
Parameters
N: The largest integer in the set {1, 2, ..., N}.
K: The upper limit for the bitwise AND result.
Returns
An integer representing the maximum value of (A & B) that is strictly less than K.
Input Format

The first line contains an integer T, the number of test cases.

Each of the next T lines contains two space-separated integers:

N K
Output Format

For each test case, print a single integer representing the maximum value of (A & B) that is less than K.

Constraints
1 ≤ T ≤ 100
2 ≤ N ≤ 10^3
1 ≤ K ≤ N
Sample Input
3
5 2
8 5
2 2
Sample Output
1
4
0
*/
    import java.util.Scanner;
public class practice2 {

    public static int maximumBitwiseAnd(int N, int K) {

        int max = 0;

        for (int A = 1; A <= N; A++) {
            for (int B = A + 1; B <= N; B++) {

                int andValue = A & B;

                if (andValue < K && andValue > max) {
                    max = andValue;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            int K = sc.nextInt();

            System.out.println(maximumBitwiseAnd(N, K));
        }

        sc.close();
    }
}

