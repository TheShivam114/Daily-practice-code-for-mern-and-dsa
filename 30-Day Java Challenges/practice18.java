/*
Check if an Array is a Palindrome
Difficulty

⭐ Easy

Problem Statement

Given an array of N integers, determine whether the array is a palindrome.

An array is called a palindrome if it reads the same from left to right and from right to left.

If the array is a palindrome, print:

YES

Otherwise, print:

NO
Function Description

Implement the function:

public static boolean isPalindrome(int[] arr)
Parameters
arr – An array of integers.
Returns
true if the array is a palindrome.
false otherwise.
Input Format

The first line contains an integer:

N

The second line contains N space-separated integers.

Output Format

Print:

YES if the array is a palindrome.
NO otherwise.
Constraints
1 ≤ N ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
Sample Input 1
5
1 2 3 2 1
Sample Output 1
YES
Explanation

Array:

1 2 3 2 1

Reading from left to right and right to left gives the same sequence.
*/
import java.util.*;
public class practice18 {

    // Function to check if the array is a palindrome
    public static boolean isPalindrome(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        if (isPalindrome(arr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

