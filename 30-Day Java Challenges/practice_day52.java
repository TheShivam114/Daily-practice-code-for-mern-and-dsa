/*
. 3Sum Closest
Medium
Topics
premium lock icon
Companies
You are given an integer array nums of length n and an integer target.

Find three integers at distinct indices in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 

Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
*/
    import java.util.ArrayList;
import java.util.List;

public class practice_day52 {

    public static List<Integer> targetIndices(int[] nums, int target) {

        int smaller = 0;
        int equal = 0;

        for (int num : nums) {
            if (num < target) {
                smaller++;
            } else if (num == target) {
                equal++;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = smaller; i < smaller + equal; i++) {
            result.add(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        System.out.println(targetIndices(nums, target));
    }
}
