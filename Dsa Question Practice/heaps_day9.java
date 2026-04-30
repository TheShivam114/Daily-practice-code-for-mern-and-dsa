/*
Longest Substring Without Repeating Characters
You are given a string s. Your task is to find the length of the longest substring that contains no repeating characters.
 Objective

Return the maximum length of a substring with all unique characters.
 Input
A string s consisting of English letters, digits, symbols, and spaces
 Output
An integer representing the length of the longest substring without repeating characters
 Example 1

Input:
s = "abcabcbb"
Output:
3
 Explanation

The answer is "abc" with length = 3
Other substrings like "bca", "cab" also valid but max length = 3
 Example 2

Input:
s = "bbbbb"
Output:
1
 Only "b" is valid

 Example 3
Input:
s = "pwwkew"
Output:
3

 "wke" is longest substring without repeating characters

 Constraints
0 ≤ s.length ≤ 10^5
s contains ASCII characters
 Requirements
Solve using Sliding Window + HashSet / HashMap
Target Time Complexity: O(n)
*/
  import java.util.*;
public class heaps_day9 {
    public static int longestUniqueSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = longestUniqueSubstring(s);
        System.out.println("Longest Substring Length: " + result);
    }
}  

