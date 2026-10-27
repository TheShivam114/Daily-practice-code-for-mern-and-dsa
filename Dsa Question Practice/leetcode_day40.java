/*
Valid Palindrome
Difficulty: Easy
Topics: Strings, Two Pointers
🧩 Problem Statement
Given a string s, determine whether it is a palindrome.

A string is a palindrome if, after converting uppercase letters to lowercase and removing all non-alphanumeric characters, it reads the same forward and backward.

Note: Letters and numbers are alphanumeric. Spaces, commas, and other punctuation are ignored.
Example 1
Input:
s = "A man, a plan, a canal: Panama"

Output:
true

Explanation: After cleaning the string, we get amanaplanacanalpanama, which reads the same forward and backward.
Example 2
Input:
s = "race a car"

Output:
false

Explanation: After cleaning, we get raceacar, which is not a palindrome.
Example 3
Input:
s = " "

Output:
true

Explanation: After removing non-alphanumeric characters, the string is empty, so it is considered a palindrome.
*/
   public class leetcode_day40 {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric characters from the left
            while (left < right &&
                   !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from the right
            while (left < right &&
                   !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters without considering case
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);

        System.out.println(result);
    }
} 

