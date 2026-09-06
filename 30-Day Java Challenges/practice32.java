/*
Binary Search

Problem: Search in a Rotated Sorted Array

You are given an integer array nums that was originally sorted in ascending order, but it has been rotated at an unknown position.

Given a target value, return its index if the target exists in the array. Otherwise, return -1.

You must solve the problem in O(log n) time.

Example 1
Input:
nums = [4,5,6,7,0,1,2]
target = 0

Output:
4
Example 2
Input:
nums = [4,5,6,7,0,1,2]
target = 3

Output:
-1
Example 3
Input:
nums = [1]
target = 0

Output:
-1
Constraints
1 <= nums.length <= 5000
-10^4 <= nums[i] <= 10^4
All values in nums are unique.
-10^4 <= target <= 10^4
Your Task

Create:

public class leetcode_day11

and implement:

public static int search(int[] nums, int target)
*/
public class practice32 {

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {

                // Target lies in the sorted left half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } 
                else {
                    left = mid + 1;
                }

            } 
            // Right half is sorted
            else {

                // Target lies in the sorted right half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } 
                else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int target = 0;

        int result = search(nums, target);

        System.out.println("Index: " + result);
    }
}

