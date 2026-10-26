/*
Let's try LeetCode 189 — Rotate Array
Difficulty: Medium 🟡
Topics: Array, Two Pointers
🧩 Problem
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1
Input:
nums = [1, 2, 3, 4, 5, 6, 7]
k = 3

Output:
[5, 6, 7, 1, 2, 3, 4]

Explanation: Rotate the array right by 3 steps.
Example 2
Input:
nums = [-1, -100, 3, 99]
k = 2

Output:
[3, 99, -1, -100]

🎯 Your Task
Try solving it in Java.

Rules:
1. Modify the original array in place.
2. Use O(1) extra space.
3. Handle cases where k is greater than the array length.
Hint 💡: You can solve this using the array reversal technique.
*/

    import java.util.Arrays;

public class leetcode_day40  {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        // Handle cases where k is greater than the array length
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}

