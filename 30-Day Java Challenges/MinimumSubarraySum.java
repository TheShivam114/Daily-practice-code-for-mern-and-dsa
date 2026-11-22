/*
Minimum Size Subarray Sum
Medium
Problem
Given an array of positive integers nums and a positive integer target, return the minimum length of a contiguous subarray whose sum is greater than or equal to target.

If no such subarray exists, return 0.
Example 1
Input:
nums = {2, 3, 1, 2, 4, 3}
target = 7

Output:
2


Explanation: The subarray {4, 3} has a sum of 7 and length 2, which is the minimum possible length.
Example 2
Input:
nums = {1, 4, 4}
target = 4

Output:
1


Example 3
Input:
nums = {1, 1, 1, 1, 1, 1, 1, 1}
target = 11

Output:
0
*/
public class MinimumSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum >= target) {

                int length = right - left + 1;

                minLength = Math.min(minLength, length);

                sum -= nums[left];
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int result = minSubArrayLen(target, nums);

        System.out.println("Minimum subarray length: " + result);
    }
}
