/*
Question: Find the Index of the First Occurrence in a String

Given two strings haystack and needle, return the index of the first occurrence of needle in haystack.

If needle is not part of haystack, return -1.

Examples

Example 1:

Input:
haystack = "sadbutsad"
needle = "sad"

Output:
0

Example 2:

Input:
haystack = "leetcode"
needle = "leeto"

Output:
-1

Example 3:

Input:
haystack = "hello"
needle = "ll"

Output:
2
Constraints
1 <= haystack.length <= 10^4
1 <= needle.length <= 10^4
haystack and needle consist of only lowercase English characters.
 */
/**
 * practice37
 */
public class practice37 {

 

    public static int strStr(String haystack, String needle) {

        // Check every possible starting position
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            // Compare characters of needle with haystack
            while (j < needle.length()
                    && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If the complete needle is matched
            if (j == needle.length()) {
                return i;
            }
        }

        // needle was not found
        return -1;
    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int result = strStr(haystack, needle);

        System.out.println("Index: " + result);
    }
}
