/* Design and implement a program to generate all valid binary strings of length N using the backtracking technique, 
subject to given constraints.
Problem Description
You are given an integer N. Your task is to generate all possible binary strings of length N such that:
Each string consists only of characters '0' and '1'
No two consecutive '1's are allowed in any valid string
The solution must be implemented using recursion with backtracking, ensuring that choices are reverted after each recursive call.

Input
An integer N representing the length of the binary string

Output
Print all valid binary strings of length N, one per line
Constraints
1 ≤ N ≤ 20
Use backtracking only (no iterative generation)
Do not use built-in string permutation libraries
Example
Input:
N = 3
Output:
000
001
010
100
101
*/
public class backTracking_day5b {
    public static void generateBinaryStrings(int n, int lastPlace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        generateBinaryStrings(n - 1, 0, str + "0");//choice 1
        if (lastPlace == 0) {
            generateBinaryStrings(n - 1, 1, str + "1");//choice 2
        }
    }
    public static void main(String[] args) {
        int n = 3;
        generateBinaryStrings(n, 0, "");
    }
}
