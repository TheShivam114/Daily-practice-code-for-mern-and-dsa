/*
78. Subsets
Medium
Topics
premium lock icon
Companies
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
*/

    import java.util.ArrayList;
import java.util.List;

public class problem_day50 {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, 0, new ArrayList<>(), result);

        return result;
    }

    public static void backtrack(
            int[] nums,
            int index,
            List<Integer> current,
            List<List<Integer>> result) {

        // Add a copy of the current subset
        result.add(new ArrayList<>(current));

        // Try including each remaining element
        for (int i = index; i < nums.length; i++) {

            current.add(nums[i]);

            backtrack(nums, i + 1, current, result);

            // Remove the last element to explore other subsets
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = subsets(nums);

        System.out.println("All possible subsets:");

        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
