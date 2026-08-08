/*
Subarray Sum Equals K
You are given an integer array nums and an integer k.
Your task is to find the total number of continuous subarrays whose sum equals k.
 Objective

Return the count of subarrays whose sum is exactly equal to k.
 Input
An integer array nums of size n
An integer k
 Output
A single integer representing the number of valid subarrays
 Example 1

Input:

nums = [1, 1, 1]
k = 2
Output:
2
 Explanation

Subarrays:

[1,1] (index 0–1)
[1,1] (index 1–2)

 Total = 2
 Example 2

Input:

nums = [1, 2, 3]
k = 3
Output:
2

 [1,2] and [3]
 Constraints
1 ≤ n ≤ 10^5
-10^4 ≤ nums[i] ≤ 10^4
-10^9 ≤ k ≤ 10^9
 Requirements
Solve using HashMap + Prefix Sum
Target Time Complexity: O(n)
 */
import java.util.*;
public class hashing_day4 {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        int result = subarraySum(nums, k);

        System.out.println("Subarrays with sum = k: " + result);
    }
}
    
