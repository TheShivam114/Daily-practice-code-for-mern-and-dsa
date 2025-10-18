/*Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false*/

import java.util.Arrays;

public class day2 {

   
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
    }

    
    public static void main(String[] args) {
        day2 solution = new day2();

        String s1 = "listen";
        String s2 = "silent";

        if (solution.isAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
        }

      
        String s3 = "hello";
        String s4 = "world";

        if (solution.isAnagram(s3, s4)) {
            System.out.println(s3 + " and " + s4 + " are anagrams.");
        } else {
            System.out.println(s3 + " and " + s4 + " are NOT anagrams.");
        }
    }
}
