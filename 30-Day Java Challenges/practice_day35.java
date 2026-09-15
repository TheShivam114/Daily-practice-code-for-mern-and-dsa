/*
Two Sum

Easy

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input has exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9.
Example 2
Input: nums = [3,2,4], target = 6
Output: [1,2]
Explanation: Because nums[1] + nums[2] == 6.
Example 3
Input: nums = [3,3], target = 6
Output: [0,1]
Constraints
2 <= nums.length <= 10⁴
-10⁹ <= nums[i] <= 10⁹
-10⁹ <= target <= 10⁹
Exactly one valid answer exists.
*/
    import java.util.HashMap;

class practice_day35  {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int required = target - nums[i];

            if (map.containsKey(required)) {
                return new int[] {map.get(required), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}

