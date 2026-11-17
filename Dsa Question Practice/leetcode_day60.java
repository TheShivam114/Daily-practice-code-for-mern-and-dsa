/*
– Two Sum (LeetCode 1)
Easy
Array
HashMap

LeetCode: Two Sum – Problem 1
1. Problem Statement
Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.

Rules:
- Each input has exactly one solution.
- You cannot use the same element twice.
- You can return the answer in any order.
2. Examples
Example 1:
Input: nums = [2, 7, 11, 15]
       target = 9

Output: [0, 1]


Explanation:

nums[0] + nums[1] = 2 + 7 = 9

Example 2:
Input: nums = [3, 2, 4]
       target = 6

Output: [1, 2]


Explanation:

nums[1] + nums[2] = 2 + 4 = 6

Example 3:
Input: nums = [3, 3]
       target = 6

Output: [0, 1]


3. Constraints
- 2 <= nums.length <= 10⁴
- -10⁹ <= nums[i] <= 10⁹
- -10⁹ <= target <= 10⁹
- Exactly one valid answer exists.
4. Your Challenge
Solve this problem using HashMap with O(n) time complexity.

Hint:

Suppose:
nums = [2, 7, 11, 15]
target = 9


Use this formula:
\[
complement = target - nums[i]
\]

For every element:
1. Calculate the complement.
2. Check whether the complement exists in the HashMap.
3. If it exists, return both indices.
4. Otherwise, store the current number and its index.
5. Expected Java Structure
Write a complete runnable Java program containing:
- import java.util.HashMap;
- public class Main
- main() method
- twoSum() method returning int[]
*/
    
import java.util.HashMap;
import java.util.Arrays;

public class leetcode_day60  {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            // Check if complement already exists
            if (map.containsKey(complement)) {

                return new int[] {map.get(complement), i};
            }

            // Store number and its index
            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        int[] nums3 = {3, 3};
        int target3 = 6;

        System.out.println("Example 1: " +
                Arrays.toString(twoSum(nums1, target1)));

        System.out.println("Example 2: " +
                Arrays.toString(twoSum(nums2, target2)));

        System.out.println("Example 3: " +
                Arrays.toString(twoSum(nums3, target3)));
    }
}


