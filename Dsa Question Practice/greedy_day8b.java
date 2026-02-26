/*
  You are given two integer arrays A and B, each of equal length n. Your task is to pair each element of array A with exactly one element from array B such that every element is used exactly once.

The objective is to minimize the total sum of absolute differences between the paired elements.

Formally, find a pairing that minimizes:
where 
𝜋
π is a permutation of indices of array B.

Input:
A = {1, 2, 3}
B = {2, 1, 3}
Output:

Return the minimum possible value of S.

Expected Output:
0
Constraints:

1 ≤ n ≤ 10^5

−10^9 ≤ A[i], B[i] ≤ 10^9
*/  
   import java.util.Arrays;
public class greedy_day8b {

    public static int minDifference(int[] A, int[] B) {
        int n = A.length;
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(A[i] - B[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {2, 1, 3};

        int result = minDifference(A, B);
        System.out.println("Minimum Absolute Difference Sum = " + result);
    }
}

