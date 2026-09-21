/*
LeetCode Easy
🔹 Question: Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.

Return the number of unique elements k.

The first k elements of nums should contain the unique values.

Example 1
Input:
nums = [1,1,2]

Output:
2

nums after modification:
[1,2,_]
Example 2
Input:
nums = [0,0,1,1,1,2,2,3,3,4]

Output:
5

nums after modification:
[0,1,2,3,4,_,_,_,_,_]
Constraints
1 <= nums.length <= 3 * 10^4
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
🎯 Your task

Write a complete Java program for VS Code, including:

public static void main(String[] args)
Hint 💡

Since the array is already sorted, think about using two pointers.

Target complexity: O(n) time and O(1) extra space.
*/
    import java.util.Arrays;

public class practice38 {

    public static int removeDuplicates(int[] nums) {

        // If array has only one element
        if (nums.length == 0) {
            return 0;
        }

        // Position where the next unique element will be placed
        int k = 1;

        // Start checking from the second element
        for (int i = 1; i < nums.length; i++) {

            // If current element is different from previous unique element
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.println("Array after removing duplicates:");

        // Print only the first k elements
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}

