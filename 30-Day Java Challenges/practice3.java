/*
Given an array of N integers and an integer K, find the maximum sum of any contiguous subarray of size K.

A contiguous subarray is a sequence of consecutive elements within the array.

Function Description

Implement the function:

public static int maximumSubarraySum(int[] arr, int K)
Parameters
arr – An array of integers.
K – The size of the subarray.
Returns
An integer representing the maximum sum of any contiguous subarray of size K.
Input Format

The first line contains two integers:

N K

The second line contains N space-separated integers.

Output Format

Print a single integer representing the maximum subarray sum.

Constraints
1 ≤ K ≤ N ≤ 10^5
-10^4 ≤ arr[i] ≤ 10^4
Sample Input
8 3
2 1 5 1 3 2 8 1
Sample Output
13
Explanation

Subarrays of size 3:

Subarray	Sum
2 1 5	8
1 5 1	7
5 1 3	9
1 3 2	6
3 2 8	13
2 8 1	11

The maximum sum is:

13
Expected Time Complexity
O(N)
*/

    import java.util.Scanner;
public class practice3 {

    public static int maximumSubarraySum(int[] arr, int K) {

        int windowSum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < K; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = K; i < arr.length; i++) {

            // Remove the leftmost element
            windowSum -= arr[i - K];

            // Add the new element
            windowSum += arr[i];

            // Update maximum sum
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maximumSubarraySum(arr, K));

        sc.close();
    }
}
