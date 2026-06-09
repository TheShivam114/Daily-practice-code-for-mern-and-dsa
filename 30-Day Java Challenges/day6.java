/*
Pair Sum Using Two Pointers
Given a sorted array of integers and a target sum, determine whether there exists a pair of elements in the array whose sum is equal to the target value.
If such a pair exists, print the pair; otherwise, print "No Pair Found".

Example

Input

arr = [1, 2, 4, 7, 11, 15]
target = 15

Output

Pair Found: 4, 11
Explanation

The elements 4 and 11 add up to 15, which matches the target sum.

Constraints
2 ≤ n ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
The array is sorted in non-decreasing order.
Expected Complexity
Time Complexity: O(n)
Space Complexity: O(1)
Sample Input 1
arr = [1, 2, 4, 7, 11, 15]
target = 15
Sample Output 1
Pair Found: 4, 11
Sample Input 2
arr = [1, 3, 5, 7, 9]
target = 20
Sample Output 2
No Pair Found
*/
public class day6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 11, 15};
        int target = 15;
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair Found: " + arr[left] + ", " + arr[right]);
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        if (!found) {
            System.out.println("No Pair Found");
        }
    }
}
    