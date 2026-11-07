/*
Maximum Subarray
Difficulty: Medium
 Array + Dynamic Programming (Kadane's Algorithm)

Problem
Given an integer array nums, find the subarray with the largest sum and return its sum.

A subarray is a contiguous, non-empty part of an array.
Example 1
Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6


Explanation:

The subarray [4, -1, 2, 1] has the largest sum.

4 + (-1) + 2 + 1 = 6
Example 2
Input: nums = [1]
Output: 1


Example 3
Input: nums = [5, 4, -1, 7, 8]
Output: 23


Explanation:

The entire array has the largest sum.
Constraints
- 1 <= nums.length <= 100000
- -10000 <= nums[i] <= 10000
Your challenge
Solve this using Kadane's Algorithm.

Hint: At each element, decide whether to:
1. Add the current element to the previous subarray.
2. Start a new subarray from the current element.
The formula is:
\[
currentSum = \max(nums[i], currentSum + nums[i])
\]
*/
   
public class leetcode_day51 {

    public static int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("Maximum subarray sum: " + result);
    }
}
 

