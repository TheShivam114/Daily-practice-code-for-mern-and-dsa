/*
Subarray Sum Equals K
Given an integer array nums and an integer k, return the total number of continuous subarrays whose sum equals k.

Input Format
First line: integer n → size of array
Second line: n space-separated integers
Third line: integer k
 Output Format
Print a single integer → number of subarrays whose sum = k
Constraints
1≤n≤10
5
−10
4
≤nums[i]≤10
4
−10
9
≤k≤10
9
 Sample Input
5
1 2 3 -2 5
5
 Sample Output
2
 Explanation
Subarrays with sum = 5:

[2, 3]
[5]
 Key Idea (IMPORTANT)

We use:
Prefix Sum
HashMap to store frequencies of prefix sums

 If:
currentSum - k = previousSum
Then a valid subarray exists.
*/
    import java.util.*;
public class hashing_day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

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

        System.out.println(count);
        sc.close();
    }
}

