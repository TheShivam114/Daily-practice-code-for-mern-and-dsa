/**
 Average of Every Subarray of Size K
Problem Statement

Given an array of N integers and an integer K, find the average of every contiguous subarray of size K.

A contiguous subarray is a sequence of consecutive elements within the array.

Function Description

Implement the function:

public static double[] averageOfSubarrays(int[] arr, int K)

Parameters

arr – An array of integers.

K – The size of the subarray.

Returns

A double[] containing the averages of all contiguous subarrays of size K.

Input Format

The first line contains two integers:

N K

The second line contains N space-separated integers.

Output Format

Print the averages of all subarrays of size K, separated by spaces.

Constraints

1 ≤ K ≤ N ≤ 10⁵

Sample Input
5 2
1 2 3 4 5
Sample Output
1.5 2.5 3.5 4.5
Explanation

Subarrays of size 2:

Subarray

	

Average
1 2

1.5
2 3
2.5
3 4
3.5
4 5
 */
import java.util.Scanner;
public class practice4 {
    public static void averageOfSubarrays(int[] arr, int K) {
        int windowSum = 0;

        // Calculate sum of first window
        for (int i = 0; i < K; i++) {
            windowSum += arr[i];
        }

        // Print average of first window
        System.out.printf("%.2f ", (double) windowSum / K);

        // Slide the window
        for (int i = K; i < arr.length; i++) {

            // Remove leftmost element
            windowSum -= arr[i - K];

            // Add new element
            windowSum += arr[i];

            // Print average
            System.out.printf("%.2f ", (double) windowSum / K);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        averageOfSubarrays(arr, K);

        sc.close();
    }
}
    
