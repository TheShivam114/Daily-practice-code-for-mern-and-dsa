/*
Problem Statement
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place so that each unique element appears only once.

Return the number of unique elements, k. The first k elements of nums must contain the unique elements in their original order.

You must solve the problem using O(1) extra space.
Example 1
Input:
nums = [1, 1, 2]

Output:
k = 2
nums = [1, 2, _]

Example 2
Input:
nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]

Output:
k = 5
nums = [0, 1, 2, 3, 4, _, _, _, _, _]

The underscores represent values that do not matter.
Constraints
- 1 <= nums.length <= 3 * 10⁴
- -100 <= nums[i] <= 100
- nums is sorted in non-decreasing order.
Your Task
Write a complete Java program using public class Main and main().

Rules:
1. Do not use another array.
2. Do not use a HashSet.
3. Modify the original array in-place.
4. Use the Two-Pointer technique.
*/
    import java.util.Arrays;

public class leetcode_day38  {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
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

        System.out.println("Modified array: "
                + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}

