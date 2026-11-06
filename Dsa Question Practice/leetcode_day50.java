/*
House Robber
Difficulty: Medium
 Dynamic Programming

Problem
You are a robber planning to rob houses along a street.

Each house has some money. However, you cannot rob two adjacent houses because the security system will alert the police.

Given an integer array nums, return the maximum amount of money you can rob without robbing two adjacent houses.
Example 1
Input: nums = [1, 2, 3, 1]
Output: 4


Explanation:
- Rob house 1 → ₹1
- Skip house 2.
- Rob house 3 → ₹3.
- Skip house 4.
Total = 1 + 3 = 4.
Example 2
Input: nums = [2, 7, 9, 3, 1]
Output: 12


Explanation:

Rob houses with 2, 9, and 1.

Total = 12.
Constraints
- 1 <= nums.length <= 100
- 0 <= nums[i] <= 400
*/


public class leetcode_day50 {

    public static int rob(int[] nums) {

        int prev2 = 0;
        int prev1 = 0;

        for (int i = 0; i < nums.length; i++) {

            int robCurrent = nums[i] + prev2;

            int skipCurrent = prev1;

            int current = Math.max(robCurrent, skipCurrent);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        int result = rob(nums);

        System.out.println("Maximum money: " + result);
    }
}

    
