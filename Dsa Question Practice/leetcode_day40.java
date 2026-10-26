/*
Move Zeroes
Difficulty: Easy
Topics: Arrays, Two Pointers
Problem Statement
Given an integer array nums, move all 0s to the end of it while maintaining the relative order of the non-zero elements.

You must do this in-place, without making a copy of the array.
Example 1
Input:
nums = [0, 1, 0, 3, 12]

Output:
[1, 3, 12, 0, 0]

Explanation: The non-zero elements remain in their original order, and all zeros move to the end.
Example 2
Input:
nums = [0]

Output:
[0]

Example 3
Input:
nums = [1, 2, 3]

Output:
[1, 2, 3]

Constraints
- 1 <= nums.length <= 10⁴
- -2³¹ <= nums[i] <= 2³¹ - 1
Your Task
Write a complete Java program using public class Main and a main() method.

Rules:
1. Modify the original array in-place.
2. Do not create another array.
3. Maintain the relative order of non-zero elements.
4. Try to achieve O(n) time complexity and O(1) extra space.
*/
   import java.util.Arrays;

public class leetcode_day40 {

    public static void moveZeroes(int[] nums) {

        int j = 0;

        // Move all non-zero elements to the beginning
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill the remaining positions with zeros
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
} 

