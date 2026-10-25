/*
. Longest Common Prefix
Easy
Topics
premium lock icon
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
*/

public class leadcode_day7 {

    public static String longestCommonPrefix(String[] strs) {

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare prefix with every other string
        for (int i = 1; i < strs.length; i++) {

            int j = 0;

            // Compare characters one by one
            while (j < prefix.length()
                    && j < strs[i].length()
                    && prefix.charAt(j) == strs[i].charAt(j)) {

                j++;
            }

            // Keep only the common part
            prefix = prefix.substring(0, j);

            // No common prefix
            if (prefix.isEmpty()) {
                return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] strs = {
            "flower",
            "flow",
            "flight"
        };

        String result = longestCommonPrefix(strs);

        System.out.println(result);
    }
}