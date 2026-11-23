/*
 Zigzag Conversion
Medium
Topics
premium lock icon
Companies
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
 

Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
*/
   import java.util.ArrayList;

public class leecode_day62 {

    public static String convert(String s, int numRows) {

        // Edge case
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        ArrayList<StringBuilder> rows = new ArrayList<>();

        // Create StringBuilder for each row
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        int direction = 1;

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            rows.get(currentRow).append(ch);

            // Change direction at top or bottom
            if (currentRow == 0) {
                direction = 1;
            } 
            else if (currentRow == numRows - 1) {
                direction = -1;
            }

            currentRow += direction;
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            result.append(rows.get(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int numRows = 3;

        String result = convert(s, numRows);

        System.out.println("Zigzag Conversion: " + result);
    }
} 

