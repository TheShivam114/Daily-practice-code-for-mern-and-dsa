/*Maximum Element in an Array

Given an integer array arr[] of size n, write a program using the Divide and Conquer technique to find the maximum element in the array.

Approach Constraint

Do not use loops to directly find the maximum.

The solution must use recursion and follow the Divide and Conquer paradigm.

Divide and Conquer Strategy

Divide the array into two halves.

Conquer by finding the maximum in each half recursively.

Combine the results by comparing the two maximum values.

Input
arr = [3, 5, 1, 9, 2, 8]

Output
Maximum element = 9 */
public class div_and_conq_day1b {
    public static int findMax(int[] arr, int left, int right) {
        // Base case
        if (left == right) {
            return arr[left];
        }
        int mid = left + (right - left) / 2;
        int maxLeft = findMax(arr, left, mid);
        int maxRight = findMax(arr, mid + 1, right);

        // Combine
        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 9, 2, 8 };

        int result = findMax(arr, 0, arr.length - 1);
        System.out.println("Maximum element = " + result);
    }
}
