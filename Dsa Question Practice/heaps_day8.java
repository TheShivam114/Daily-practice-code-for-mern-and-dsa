/*
Longest Subarray with Sum ≤ K
You are given an array of positive integers nums and an integer k.
Your task is to find the length of the longest contiguous subarray such that the sum of its elements is less than or equal to k.

 Objective

Return the maximum length of such a subarray.

 Input
An integer array nums of size n
An integer k
 Output
A single integer representing the maximum length
 Example

Input:

nums = [1, 2, 1, 0, 1, 1, 0]
k = 4

Output:

5
 Explanation

One of the longest valid subarrays is:

[1, 2, 1, 0, 1] → sum = 5 (not valid)
[2, 1, 0, 1] → sum = 4 (length = 4)
[1, 0, 1, 1, 0] → sum = 3  (length = 5) ✔
Maximum length = 5

Constraints
1 ≤ n ≤ 10^5
0 ≤ nums[i] ≤ 10^4
1 ≤ k ≤ 10^9
Requirements
Solve using Sliding Window (Two Pointers)
Target Time Complexity: O(n)
*/
   import java.util.*;
public class heaps_day8 {
    public static int longestSubarray(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > k) {
                sum -= nums[left];
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 0, 1, 1, 0};
        int k = 4;
        int result = longestSubarray(nums, k);
        System.out.println("Longest Subarray Length: " + result);
    }
} 

