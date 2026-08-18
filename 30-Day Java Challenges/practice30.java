/*
First Non-Repeating Character
Difficulty

⭐⭐ Medium

Problem Statement

Given a string containing lowercase English letters, find the first character that appears exactly once in the string.

If every character appears more than once, return -1.

Example 1
Input:
aabbcdde

Character frequencies:

a → 2
b → 2
c → 1
d → 2
e → 1

The first character that appears only once is c.

Output:
c
Example 2
Input:
aabbcc

Every character appears more than once.

Output:
-1
Function Description

Implement:

public static char firstNonRepeating(String s)
Parameters
s – A string containing lowercase English letters.
Returns
The first non-repeating character.
Return '-' if no such character exists.
Input Format

The first line contains an integer T, the number of test cases.

Each of the next T lines contains a string.

Output Format

For each test case, print the first non-repeating character.

If there is no non-repeating character, print:

-
Constraints
1 ≤ T ≤ 100
1 ≤ length of s ≤ 10^5
s contains only lowercase English letters
Sample Input
4
aabbcdde
aabbcc
swiss
programming
*/
import java.util.*;

public class practice30 {

    public static char firstNonRepeating(String s) {

        // Step 1: Count frequency of each character
        int[] frequency = new int[26];

        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        // Step 2: Find the first character with frequency 1
        for (char ch : s.toCharArray()) {

            if (frequency[ch - 'a'] == 1) {
                return ch;
            }
        }

        // No non-repeating character found
        return '-';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            String s = sc.next();

            char result = firstNonRepeating(s);

            System.out.println(result);
        }

        sc.close();
    }
}