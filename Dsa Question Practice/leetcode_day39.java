/*
Remove Element
Difficulty: Easy
Topic: Arrays, Two Pointers
Problem: LeetCode 27 — Remove Element
Problem Statement
You are given an integer array nums and an integer val.

Remove all occurrences of val from nums in-place. The relative order of the remaining elements may change.

Return k, the number of elements that are not equal to val.

The first k elements of nums must contain the elements that are not equal to val.
Example 1
Input:
nums = [3, 2, 2, 3]
val = 3

Output:
k = 2
nums = [2, 2, _, _]

Example 2
Input:
nums = [0, 1, 2, 2, 3, 0, 4, 2]
val = 2

Output:
k = 5
nums = [0, 1, 3, 0, 4, _, _, _]

The underscores represent elements that do not matter.
Constraints
- 0 <= nums.length <= 100
- 0 <= nums[i] <= 50
- 0 <= val <= 100
*/
    import java.util.Arrays;

public class leetcode_day39  {

    public static int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int k = removeElement(nums, val);

        System.out.println("Number of remaining elements: " + k);

        System.out.println(
            "Modified array: " + Arrays.toString(Arrays.copyOf(nums, k))
        );
    }
}

