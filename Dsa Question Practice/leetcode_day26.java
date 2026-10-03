/*
. Convert a Number to Hexadecimal
Easy
Topics
premium lock icon
Companies
Given a 32-bit integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.

All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.

Note: You are not allowed to use any built-in library method to directly solve this problem.

 

Example 1:

Input: num = 26
Output: "1a"
Example 2:

Input: num = -1
Output: "ffffffff"
 

Constraints:

-231 <= num <= 231 - 1
*/

import java.util.Scanner;

public class leetcode_day26 {

     public static String toHex(int num) {

        // Special case
        if (num == 0) {
            return "0";
        }

        // Hexadecimal characters
        char[] hex = {
            '0', '1', '2', '3',
            '4', '5', '6', '7',
            '8', '9', 'a', 'b',
            'c', 'd', 'e', 'f'
        };}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = toHex(num);

        System.out.println("Hexadecimal: " + result);

        sc.close();
    }
}
