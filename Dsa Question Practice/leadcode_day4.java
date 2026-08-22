/*
Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?
 
Discover more
Foreign Language Study
Seen this question in a real interview before?
1/6
Yes
No
Accepted
8,680,053/14.3M
Acceptance Rate
60.9%
Topics
icon
Companies
Hint 1
Similar Questions
Discussion (745)

Copyright © 2026 LeetCo
*/
public class leadcode_day4 {

    public static boolean isPalindrome(int x) {

        // Negative numbers are never palindromes
        if (x < 0) {
            return false;
        }

        // Numbers ending in 0 cannot be palindrome
        // except 0 itself
        if (x != 0 && x % 10 == 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x > 0) {

            int digit = x % 10;

            reversed = reversed * 10 + digit;

            x = x / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {

        int x = 121;

        System.out.println(isPalindrome(x));
    }
}
