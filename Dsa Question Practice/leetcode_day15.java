/*
. Excel Sheet Column Title
Easy
Topics
premium lock icon
Companies
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"
 

Constraints:

1 <= columnNumber <= 231 - 1
*/public class leetcode_day15 {

    public static String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {

            // Convert 1-based numbering to 0-based
            columnNumber--;

            // Get character A-Z
            char ch = (char) ('A' + (columnNumber % 26));

            result.append(ch);

            // Move to the next column position
            columnNumber /= 26;
        }

        // Reverse because characters are generated from right to left
        return result.reverse().toString();
    }

    public static void main(String[] args) {

        int columnNumber = 28;

        String answer = convertToTitle(columnNumber);

        System.out.println("Column Number: " + columnNumber);
        System.out.println("Column Title: " + answer);
    }
}