/*

 Intersection of Two Arrays
Easy
Topics
premium lock icon
Companies
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/
  import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class practice_day45 {

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();

        // Store elements of nums1
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> resultSet = new HashSet<>();

        // Find common elements
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert Set<Integer> to int[]
        int[] result = new int[resultSet.size()];
        int index = 0;

        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersection(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));
    }
}  

