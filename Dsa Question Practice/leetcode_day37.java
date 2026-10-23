/*
Merge Two Sorted Arrays
Difficulty: Easy
Topic: Arrays, Two Pointers
Problem Statement
You are given two integer arrays, nums1 and nums2, sorted in non-decreasing order, and two integers, m and n, representing the number of valid elements in each array.

Merge nums2 into nums1 so that the final array is sorted in non-decreasing order.

The array nums1 has enough space to hold all elements from both arrays.
Example 1
Input:
nums1 = [1, 4, 7, 0, 0, 0]
m = 3

nums2 = [2, 3, 6]
n = 3

Output:
[1, 2, 3, 4, 6, 7]

Example 2
Input:
nums1 = [5, 0, 0]
m = 1

nums2 = [1, 2]
n = 2

Output:
[1, 2, 5]

Example 3
Input:
nums1 = [1, 2, 3, 0, 0]
m = 3

nums2 = [4, 5]
n = 2

Output:
[1, 2, 3, 4, 5]

Constraints
- 0 <= m, n <= 200
- 1 <= m + n <= 200
- -10⁹ <= nums1[i], nums2[j] <= 10⁹
- Both arrays are sorted in non-decreasing order.
*/
    import java.util.Arrays;

public class leetcode_day37 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge from right to left
        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // Copy remaining elements from nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 4, 7, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 3, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}

