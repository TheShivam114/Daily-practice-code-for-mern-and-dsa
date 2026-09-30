/*
Given an integer array nums and an integer target, return the indices of the two numbers such that they add up to target.

You may assume that each input has exactly one solution, and you may not use the same element twice.

Example 1
Input:
nums = [2, 7, 11, 15]
target = 9

Output:
[0, 1]

Explanation:

nums[0] + nums[1]
2 + 7 = 9
Example 2
Input:
nums = [3, 2, 4]
target = 6

Output:
[1, 2]
Example 3
Input:
nums = [3, 3]
target = 6

Output:
[0, 1]
Constraints
2 <= nums.length <= 10⁴
-10⁹ <= nums[i] <= 10⁹
-10⁹ <= target <= 10⁹
Exactly one valid answer exists.
Your task

Write a complete runnable Java program with main().
*/
    import java.util.HashMap;
import java.util.Scanner;

public class practiceday44{

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];
            int needed = target - current;

            // Check if required number already exists
            if (map.containsKey(needed)) {
                return new int[] {
                    map.get(needed),
                    i
                };
            }

            // Store current number and its index
            map.put(current, i);
        }

        // No solution found
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        System.out.println(
            "Answer: [" + result[0] + ", " + result[1] + "]"
        );

        sc.close();
    }
}

