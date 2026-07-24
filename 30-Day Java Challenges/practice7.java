/*
Given an array of N integers and an integer Target, find two distinct indices of elements whose sum is equal to the target value.

You must return the indices of the two numbers.

Each input will have exactly one solution, and you cannot use the same element twice.

Function Description

Implement the function:

public static int[] twoSum(int[] arr, int target)
Parameters
arr – An array of integers.
target – The required sum value.
Returns
An integer array containing the indices of the two elements whose sum equals target.
Input Format

The first line contains an integer:

N

The second line contains N space-separated integers.

The third line contains:

target
Output Format

Print two indices separated by a space.

Constraints
2 ≤ N ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
-10^9 ≤ target ≤ 10^9
Sample Input 1
5
2 7 11 15 3
9
Sample Output 1
0 1
Explanation

Array:

[2, 7, 11, 15, 3]

Target:

9

Check pairs:

2 + 7 = 9

Their indices are:

0 and 1

Therefore output:

0 1
*/
    import java.util.*;
public class practice7 {
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int required = target - arr[i];
            if (map.containsKey(required)) {
                return new int[]{map.get(required), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] result = twoSum(arr, target);

        System.out.println(result[0] + " " + result[1]);

        sc.close();
    }
}

