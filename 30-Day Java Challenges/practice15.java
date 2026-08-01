/**
Find the Second Largest Element in an Array
Difficulty

⭐ Easy

Problem Statement

Given an array of N integers, find the second largest distinct element in the array.

If the array does not contain a second largest distinct element (for example, all elements are the same), print -1.

Function Description

Implement the function:

public static int secondLargest(int[] arr)
Parameters
arr – An array of integers.
Returns
The second largest distinct element.
-1 if it does not exist.
Input Format
The first line contains an integer N, the number of elements.
The second line contains N space-separated integers.
Output Format

Print a single integer representing the second largest distinct element.

Constraints
2 ≤ N ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
Sample Input 1
5
10 20 30 40 50
Sample Output 1
40
Explanation

Largest element = 50

Second largest element = 40
 */
import java.util.*;
public class practice15 {

    public static int secondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            // Update largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }

            // Update only second largest
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(secondLargest(arr));

        sc.close();
    }
}
    
