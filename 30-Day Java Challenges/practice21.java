/*
Queue
Problem: First Negative Integer in Every Window of Size K
Difficulty

⭐⭐ Medium

Problem Statement

Given an array of N integers and an integer K, find the first negative integer in every contiguous subarray (window) of size K.

If a window does not contain any negative integer, print:

0

for that window.

Function Description

Implement the function:

public static void firstNegativeInWindow(int[] arr, int K)
Parameters
arr – An array of integers.
K – Size of the sliding window.
Returns
Print the first negative integer for each window.
Input Format

The first line contains two integers:

N K

The second line contains N space-separated integers.

Output Format

Print the first negative integer for every window of size K.

Constraints
1 ≤ K ≤ N ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
Sample Input
8 3
12 -1 -7 8 -15 30 16 28
Sample Output
-1 -1 -7 -15 -15 0
Explanation

Array:

12  -1  -7   8  -15  30  16  28
Window 1
12  -1  -7

First negative:

-1
Window 2
-1  -7   8

First negative:

-1
Window 3
-7   8  -15

First negative:

-7
*/
import java.util.*;

public class practice21 {

    // Function to print first negative integer in every window
    public static void firstNegativeInWindow(int[] arr, int K) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // Store index of negative numbers
            if (arr[i] < 0) {
                queue.offer(i);
            }

            // Remove indices that are outside the current window
            while (!queue.isEmpty() && queue.peek() <= i - K) {
                queue.poll();
            }

            // Start printing after the first window is formed
            if (i >= K - 1) {

                if (queue.isEmpty()) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(arr[queue.peek()] + " ");
                }
            }
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

        firstNegativeInWindow(arr, K);

        sc.close();
    }
}