/*
Valid Anagram
Given two strings s and t, determine whether t is an anagram of s.
An anagram is a word or phrase formed by rearranging the letters of another word, using all the original characters exactly once.
Return:
"TRUE" if t is an anagram of s
"FALSE" otherwise
Input Format
First line: String s
Second line: String t
 Output Format
Print:
TRUE
or
FALSE

Constraints
1 ≤ s.length, t.length ≤ 10^5
Strings contain only lowercase English letters
 Example 1
Input:

race
care
Output:

TRUE
 Example 2
Input:
heart
earth

Output:
TRUE
 Example 3
Input:
tulip
lipid

Output:
FALSE
 Hint

Two strings are anagrams if:
Their lengths are equal
Frequency of every character is the same
*/
    import java.util.*;
public class  hashing_day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if (s.length() != t.length()) {
            System.out.println("FALSE");
            return;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                System.out.println("FALSE");
                return;
            }
        }

        System.out.println("TRUE");
    }
}

