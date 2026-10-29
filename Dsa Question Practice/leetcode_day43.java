/*
Contains Duplicate
Easy
Arrays · HashSet

🧩 Problem statement
Given an integer array nums, return true if any value appears at least twice in the array. Return false if every element is distinct.
Example 1
Input:
nums = new int[]{1, 2, 3, 1};


Output:
true


Explanation: The number 1 appears twice.
Example 2
Input:
nums = new int[]{1, 2, 3, 4};


Output:
false


Explanation: Every number is unique.
Example 3
Input:
nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};


Output:
true
*/
    
import java.util.HashSet;

public class leetcode_day43 {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            // If the number already exists, a duplicate is found
            if (set.contains(num)) {
                return true;
            }

            // Store the number
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate(nums);

        System.out.println(result);
    }
}


