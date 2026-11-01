/*
: Longest Common Prefix
Easy
Strings · Array

🧩 Problem Statement
Write a function to find the longest common prefix string among an array of strings.

If there is no common prefix, return an empty string "".
Example 1
Input:
String[] strs = {"flower", "flow", "flight"};


Output:
"fl"


Explanation: All three strings start with "fl".
Example 2
Input:
String[] strs = {"dog", "racecar", "car"};


Output:
""


Explanation: There is no common prefix.
Example 3
Input:
String[] strs = {"interview", "internet", "internal"};


Output:
"inter"

*/
    
public class leetcode_day46 {

    public static String longestCommonPrefix(String[] strs) {

        // Take the first string as the initial prefix
        String prefix = strs[0];

        // Compare it with every remaining string
        for (int i = 1; i < strs.length; i++) {

            // Keep shortening the prefix until it matches
            while (!strs[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                // No common prefix found
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        String result = longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);
    }
}


