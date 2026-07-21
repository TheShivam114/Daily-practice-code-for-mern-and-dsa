/*
Frequency of Elements in an Array
Difficulty

⭐ Easy

Problem Statement

Given an array of N integers, determine the frequency (number of occurrences) of each distinct element in the array.

Print each unique element along with its frequency in the order of its first appearance in the array.

Function Description

Implement the function:

public static void printFrequency(int[] arr)
Parameters
arr – An array of integers.
Returns
The function does not return any value.
Print each distinct element followed by its frequency.
Input Format
The first line contains a single integer N, the number of elements in the array.
The second line contains N space-separated integers representing the array elements.
Output Format

For each distinct element, print a single line in the following format:

element -> frequency

The elements must be printed in the same order as their first occurrence in the array.

Constraints
1 ≤ N ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
Sample Input
6
1 2 2 3 1 2
Sample Output
1 -> 2
2 -> 3
3 -> 1
Explanation

The array is:

1 2 2 3 1 2
The element 1 appears 2 times.
The element 2 appears 3 times.
The element 3 appears 1 time.

Therefore, the output is:

1 -> 2
2 -> 3
3 -> 1
*/
    import java.util.*;
public class practice5 {

    public static void printFrequency(int[] arr) {

        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        printFrequency(arr);

        sc.close();
    }
}

