/**
Count Vowels in a String
Difficulty

⭐ Easy

Problem Statement

Given a string S consisting of uppercase and lowercase English letters, count the total number of vowels present in the string.

The vowels are:

A, E, I, O, U, a, e, i, o, u

Print the total number of vowels in the string.

Function Description

Implement the function:

public static int countVowels(String s)
Parameters
s – A string consisting of English letters.
Returns
An integer representing the number of vowels in the string.
Input Format

The first line contains a string:

S
Output Format

Print a single integer representing the number of vowels in the string.

Constraints
1 ≤ S.length() ≤ 10^5
Sample Input 1
Hello
Sample Output 1
2
Explanation

The vowels are:

e, o

Total vowels = 2

Sample Input 2
Programming
Sample Output 2
3
Explanation

The vowels are:

o, a, i

Total vowels = 3

Sample Input 3
rhythm
Sample Output 3
0
Explanation

There are no vowels in the string.

Expected Time Complexity
O(N)
Expected Space Complexity
O(1)
Concepts Covered
Strings
Character Traversal
Conditional Statements
Loops
 */
import java.util.*;

public class practice16 {

    // Function to count vowels
    public static int countVowels(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(countVowels(s));

        sc.close();
    }
}
