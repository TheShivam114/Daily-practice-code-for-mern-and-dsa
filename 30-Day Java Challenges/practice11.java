/*
Find the First Occurrence of an Element
Difficulty

⭐ Easy

Problem Statement

Given a sorted array of N integers and a target value X, find the first occurrence of X in the array.

If the target element does not exist, print -1.

Function Description

Implement the function:

public static int firstOccurrence(int[] arr, int X)
Parameters
arr – A sorted array of integers.
X – The target element to search for.
Returns
The index of the first occurrence of X.
-1 if X is not present.
Input Format

The first line contains an integer:

N

The second line contains N space-separated sorted integers.

The third line contains the target value:

X
Output Format

Print the index of the first occurrence of X.

If X is not found, print -1.

Constraints
1 ≤ N ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
Sample Input 1
7
2 4 4 4 6 8 10
4
Sample Output 1
1
Explanation

The array is:

Index : 0 1 2 3 4 5 6
Value : 2 4 4 4 6 8 10

The value 4 appears at indices 1, 2, and 3.

The first occurrence is at index 1.

Sample Input 2
6
1 3 5 7 9 11
8
Sample Output 2
-1
Explanation

The value 8 does not exist in the array.

Sample Input 3
5
5 5 5 5 5
5
*/
    import java.util.Scanner;
public class practice11 {

    public static int firstOccurrence(int[] arr, int X) {

        int left = 0;
        int right = arr.length - 1;
        int answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == X) {
                answer = mid;      // Save the current index
                right = mid - 1;   // Search on the left side
            }
            else if (arr[mid] < X) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int X = sc.nextInt();

        System.out.println(firstOccurrence(arr, X));

        sc.close();
    }
}

