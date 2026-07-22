/*
Find the First Non-Repeating Element

Problem Statement
Given an array of N integers, find the first element that appears exactly once in the array.
If no such element exists, print -1.
Function Description
Implement the function:

public static int firstNonRepeating(int[] arr)
Parameters
arr – An array of integers.
Returns
The first non-repeating element.
Return -1 if every element appears more than once.
Input Format
The first line contains an integer N, the number of elements.
The second line contains N space-separated integers.
Output Format

Print a single integer representing the first non-repeating element.
Constraints
1 ≤ N ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
Sample Input 1
6
2 3 4 2 3 5
Sample Output 1
4
Explanation

The frequencies are:

Element	Frequency
2	2
3	2
4	1
5	1

The first element with a frequency of 1 is 4.

Sample Input 2
5
1 1 2 2 3
Sample Output 2
3
Sample Input 3
4
7 7 8 8
Sample Output 3
-1
Expected Time Complexity
O(N)
Expected Space Complexity
O(N)
*/
    import java.util.*;
public class practice6 {
    public static int firstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count frequency of each element
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(firstNonRepeating(arr));
        sc.close();
    }
}

