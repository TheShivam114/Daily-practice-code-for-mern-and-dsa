/*
Sliding Window Maximum

You are given an array of integers nums and an integer k, which represents the size of a sliding window.
Your task is to find the maximum element in every contiguous subarray (window) of size k as the window slides from left to right.

 Objective

Return an array containing the maximum of each sliding window.

 Input
An integer array nums of size n
An integer k (window size)
 Output
An array of size n - k + 1 containing the maximum values of each window
 Example

Input:

nums = [1,2,3,4,5,6,7,8,9,10]
k = 3

Output:

[3,4,5,6,7,8,9,10]
 Explanation

Sliding window of size 3:

[1,2,3] → 3
[2,3,4] → 4
[3,4,5] → 5
[4,5,6] → 6
[5,6,7] → 7
[6,7,8] → 8
[7,8,9] → 9
[8,9,10] → 10
 Constraints
1 ≤ n ≤ 10^5
1 ≤ k ≤ n
-10^4 ≤ nums[i] ≤ 10^4
Follow-up
Can you solve this in O(n) time complexity?
Can you avoid using a heap?
*/
    import java.util.*;
public class heaps_day7 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); 
        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        int[] ans = maxSlidingWindow(nums, k);

        System.out.println("Sliding Window Maximum:");
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}

