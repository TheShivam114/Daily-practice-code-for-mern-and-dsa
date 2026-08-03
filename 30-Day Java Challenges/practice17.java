/**
 First Non-Repeating Character in a String
Difficulty

⭐⭐ Easy–Medium

Problem Statement

Given a string S, find the first character that appears only once in the string.

If every character appears more than once, print:

-1
Function Description

Implement the function:

public static char firstNonRepeating(String s)
Parameters
s – A string containing lowercase English letters.
Returns
The first character that occurs exactly once.
Return '#' if no such character exists.
Input Format

The first line contains a string:

S
Output Format

Print the first non-repeating character.

If no unique character exists, print:

-1
Constraints
1 ≤ S.length() ≤ 10^5
S contains only lowercase English letters.
Sample Input 1
leetcode
Sample Output 1
l
Explanation

Character frequency:

l → 1
e → 3
t → 1
c → 1
o → 1
d → 1

The first character with frequency 1 is:

l
Sample Input 2
aabbcc
Sample Output 2
-1
Explanation

Frequency:

a → 2
b → 2
c → 2

No character appears only once.
 */
import java.util.*;

public class practice17 {

    // Function to find first non-repeating character
    public static char firstNonRepeating(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }


        // Step 2: Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '#';
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char result = firstNonRepeating(s);

        if (result == '#') {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }

        sc.close();
    }
}
    
