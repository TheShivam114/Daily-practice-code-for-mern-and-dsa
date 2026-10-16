/*
Give me another LeetCode-style question.”
🧩 Next Practice Question: 13. Roman to Integer → 12. Integer to Roman?
Let's try a new problem related to number conversion!
LeetCode 12. Integer to Roman
Difficulty: Medium
Problem
Seven different symbols represent Roman numerals:
Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000


Given an integer, convert it to a Roman numeral.
Remember these special cases:
- 4 = IV
- 9 = IX
- 40 = XL
- 90 = XC
- 400 = CD
- 900 = CM
Example 1
Input: num = 3749
Output: "MMMDCCXLIX"

Example 2
Input: num = 58
Output: "LVIII"

Example 3
Input: num = 1994
Output: "MCMXCIV"

Constraints
1 <= num <= 3999
*/
   public class practice_day49 {

    public static String intToRoman(int num) {

        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {

            while (num >= values[i]) {

                result.append(symbols[i]);

                num -= values[i];
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        int num = 3749;

        String result = intToRoman(num);

        System.out.println("Integer: " + num);
        System.out.println("Roman Numeral: " + result);
    }
} 

