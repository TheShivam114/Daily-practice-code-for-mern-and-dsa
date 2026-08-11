/*
Problem Statement

Given an array of integers arr and an integer target, find two distinct elements whose sum is equal to target.

Return the indices of the two elements.

You may assume that exactly one valid pair exists.

The indices can be returned in any order.

Function Description

Implement the function:

public static int[] twoSum(int[] arr, int target)
Parameters
arr – An array of integers.
target – The required sum.
Returns

An integer array containing the two indices whose values add up to target.

Input Format

The first line contains two integers:

N target

The second line contains N space-separated integers.

Output Format

Print the two indices separated by a space.

Constraints
2 ≤ N ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
-10^9 ≤ target ≤ 10^9
Exactly one valid pair exists.
Sample Input 1
5 9
2 7 11 15 3
Sample Output 1
0 1
Explanation
arr[0] + arr[1]
= 2 + 7
= 9

Therefore, the answer is:

0 1
 */
import java.util.*;

public class practice24 {

    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            // Check if complement already exists
            if (map.containsKey(complement)) {

                return new int[] {
                    map.get(complement),
                    i
                };
            }

            // Store value and its index
            map.put(arr[i], i);
        }

        // No valid pair found
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = twoSum(arr, target);

        System.out.println(result[0] + " " + result[1]);

        sc.close();
    }
}