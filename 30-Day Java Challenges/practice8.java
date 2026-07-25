/*
Given an array of N integers, determine whether the array contains any duplicate elements.

If at least one element appears more than once, print YES. Otherwise, print NO.

Function Description

Implement the function:

public static boolean containsDuplicate(int[] arr)
Parameters
arr – An array of integers.
Returns
true if the array contains at least one duplicate element.
false otherwise.
Input Format
The first line contains an integer N, the number of elements in the array.
The second line contains N space-separated integers.
Output Format

Print:

YES if the array contains duplicates.
NO otherwise.
Constraints
1 ≤ N ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
Sample Input 1
5
1 2 3 4 2
Sample Output 1
YES
Explanation

The element 2 appears twice.

Therefore, the array contains duplicate elements.
*/
    import java.util.*;
public class practice8 {

    public static boolean containsDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        if (containsDuplicate(arr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

