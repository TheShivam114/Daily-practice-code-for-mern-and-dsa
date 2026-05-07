/*
Majority Elements More Than ⌊n/3⌋ Times
Given an integer array nums of size n, find all elements that appear more than ⌊n/3⌋ times.
Return the elements in any order.
 Input Format
First line: Integer n → size of array
Second line: n space-separated integers
Output Format

Print all majority elements that appear more than ⌊n/3⌋ times.

If no such element exists, print:
-1
 Constraints
1 ≤ n ≤ 10^5
-10^9 ≤ nums[i] ≤ 10^9
 Example 1

Input:
8
1 3 2 5 1 3 1 5
Output:
1
 Example 2

Input:
2
1 2
Output:
1 2
 Example 3

Input:

5
1 2 3 4 5
Output:

-1
*/
    import java.util.*;
public class hashing_day7  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }  
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        boolean found = false;

        if (count1 > n / 3) {
            System.out.print(candidate1 + " ");
            found = true;
        }

        if (count2 > n / 3) {
            System.out.print(candidate2);
            found = true;
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}

