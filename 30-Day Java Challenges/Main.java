/*
Problem

Given an integer array, count how many even numbers are present in the array.

Example 1
Input:
[10, 5, 8, 7, 12, 3]

Output:
3

Explanation:

The even numbers are:

10, 8, 12

So the answer is 3.

Example 2
Input:
[1, 3, 5, 7]

Output:
0
Function

Write:

public static int countEven(int[] arr)
Constraints
1 <= arr.length <= 1000
-10^9 <= arr[i] <= 10^9
Hint 💡

Use the modulo operator:

number % 2 == 0
Your Task

Write the complete Java method and test it with:

int[] arr = {10, 5, 8, 7, 12, 3};
*/

public class Main {

    public static int countEven(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 7, 12, 3};

        int result = countEven(arr);

        System.out.println(result);
    }
}