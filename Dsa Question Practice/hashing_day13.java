/*
Largest Subarray with Sum 0

You are given an integer array arr[].
Your task is to find the length of the largest contiguous subarray whose sum is equal to 0.

If no such subarray exists, print 0.
Example 1
Input
arr = {15, -2, 2, -8, 1, 7, 10, 23}
Output
5
Explanation

The largest subarray with sum 0 is:

{-2, 2, -8, 1, 7}

Length = 5

Example 2
Input
arr = {3, 4, 5}
Output
0
Explanation

No subarray with sum 0 exists.

Constraints
1≤n≤10
5
−10
9
≤arr[i]≤10
9
Hint

Use:

Prefix Sum
HashMap to store the first occurrence of each prefix sum for efficient lookup.
*/
    import java.util.*;
public class  hashing_day13 {
    public static void main(String[] args) {

        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
            if (sum == 0) {
                maxLen = i + 1;
            }
            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen, len);

            } else {
                // Store first occurrence of sum
                map.put(sum, i);
            }
        }

        System.out.println("Largest Subarray Length = " + maxLen);
    }
}

