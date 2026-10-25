/**
8. Excel Sheet Column Title
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
 */

public class leetcode_day32 {

    public static String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {

            // Adjust because Excel columns start at 1
            columnNumber--;

            int remainder = columnNumber % 26;

            char letter = (char) ('A' + remainder);

            result.append(letter);

            columnNumber = columnNumber / 26;
        }

        // Letters were generated from right to left
        return result.reverse().toString();
    }

    public static void main(String[] args) {

        int columnNumber = 701;

        String title = convertToTitle(columnNumber);

        System.out.println("Column number: " + columnNumber);
        System.out.println("Column title: " + title);
    }
}
    