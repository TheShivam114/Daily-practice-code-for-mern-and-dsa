/*
Problem Statement

Given an array of N distinct integers, generate all possible subsets of the array.

A subset can contain any number of elements, including:

No elements — the empty subset
One element
Multiple elements
All elements

The order of subsets does not matter.

For example, for:

[1, 2, 3]

the possible subsets are:

[]
[1]
[2]
[3]
[1, 2]
[1, 3]
[2, 3]
[1, 2, 3]

There are 2^N total subsets.

Function Description

Implement the function:

public static void generateSubsets(int[] arr)
Parameters
arr – An array containing distinct integers.
Returns

Print all possible subsets.

Input Format

The first line contains an integer:

N

The second line contains N space-separated integers.

Output Format

Print each subset on a separate line.

Constraints
1 ≤ N ≤ 15
-100 ≤ arr[i] ≤ 100
All elements are distinct.
Sample Input
3
1 2 3
Sample Output
[]
[1]
[1, 2]
[1, 2, 3]
[1, 3]
[2]
[2, 3]
[3]

The exact order is not important.

Explanation

For every element, we have two choices:

Choice 1

Don't include the element.

Choice 2

Include the element.

For [1, 2, 3]:

                         []
                    /          \
                  skip          take 1
                  /                \
                []                 [1]
              /    \             /     \
           skip    take 2      skip    take 2
            |        |           |        |
           []       [2]         [1]      [1,2]

The process continues until all elements have been considered.

Important Concept

This is a classic backtracking problem.

The basic structure is:

backtrack(index)

At every index:

1. Don't take arr[index]
2. Take arr[index]
3. Move to the next index
Example

For:

arr = [1, 2]

Possible subsets:

[]
[1]
[2]
[1, 2]

Total:

2² = 4

For N = 3:

2³ = 8

For N = 4:

2⁴ = 16
Expected Time Complexity

There are 2^N subsets, so:

O(2^N)

The output itself contains 2^N subsets.

Expected Space Complexity

The recursion depth is N:

O(N)

excluding the space required to store/print the subsets.
*/
    import java.util.*;
public class practice23 {

    public static void generateSubsets(int[] arr) {

        ArrayList<Integer> current = new ArrayList<>();

        backtrack(arr, 0, current);
    }

    public static void backtrack(int[] arr, int index, ArrayList<Integer> current) {

        // Base case
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Choice 1: Do not include the current element
        backtrack(arr, index + 1, current);

        // Choice 2: Include the current element
        current.add(arr[index]);

        backtrack(arr, index + 1, current);

        // Backtrack
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        generateSubsets(arr);

        sc.close();
    }
}

