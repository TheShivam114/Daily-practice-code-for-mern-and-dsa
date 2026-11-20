/*
Problem
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1
Input: nums = [1, 2, 3, 1]
Output: true


Explanation: The number 1 appears twice.
Example 2
Input: nums = [1, 2, 3, 4]
Output: false


Explanation: Every element is unique.
Example 3
Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output: true


Constraints
- 1 <= nums.length <= 10⁵
- -10⁹ <= nums[i] <= 10⁹
Your task
Try solving this using a HashSet with better than O(n²) time complexity.

Think about these steps:
1. Create a HashSet.
2. Traverse the array.
3. Check whether the current number already exists in the set.
4. If it exists, return true.
5. Otherwise, add it to the set.
6. If the loop finishes, return false.
*/
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);
    }
}