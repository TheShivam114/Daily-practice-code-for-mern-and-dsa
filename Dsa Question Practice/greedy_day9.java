/*
   

 Maximum Absolute Difference

Instead of minimizing, pair elements such that the sum of absolute differences is maximum.

Input:
A = {1, 2, 3}
B = {4, 5, 6}
Task:

Return the maximum possible sum.
*/
import java.util.Arrays;
public class greedy_day9 {
    
    public static int maxDifference(int[] A, int[] B) {
        int n = A.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(A[i] - B[n - 1 - i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};
        int result = maxDifference(A, B);
        System.out.println("Maximum Absolute Difference Sum = " + result);
    }
}

