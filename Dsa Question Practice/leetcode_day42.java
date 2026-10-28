/*
Reverse String
Easy
Topic: Arrays, Two Pointers


Problem
Write a Java program to reverse a character array in place.

Example 1

Input:
['h', 'e', 'l', 'l', 'o']


Output:
['o', 'l', 'l', 'e', 'h']


Example 2

Input:
['H', 'a', 'n', 'n', 'a', 'h']


Output:
['h', 'a', 'n', 'n', 'a', 'H']


Your challenge
- Use two pointers: left and right.
- Swap the characters at both pointers.
- Move left forward and right backward until they meet.
- Aim for O(n) time and O(1) extra space.

*/
    
import java.util.Arrays;

public class leetcode_day42 {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers toward the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}

