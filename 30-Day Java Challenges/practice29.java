/*
Sure. Let's move to a different medium-level DSA topic.

Topic: Stack
Problem: Balanced Parentheses
Difficulty

⭐⭐ Medium

Problem Statement

Given a string containing only the following characters:

( ) { } [ ]

determine whether the parentheses are balanced.

A string is considered balanced if:

Every opening bracket has a corresponding closing bracket.
Brackets are closed in the correct order.
No closing bracket appears without its matching opening bracket.
Examples
Input:
{[()]}


Output:
true

Explanation:

{ [ ( ) ] }

Every bracket is correctly matched.

Example 2
Input:
([)]

Output:

false

Because [ is opened after (, but ) closes before ].

Example 3
Input:
((()))

Output:

true
Function Description

Implement:

public static boolean isBalanced(String s)
Parameters
s – A string containing brackets.
Returns
true if the brackets are balanced.
false otherwise.
*/
import java.util.*;

public class practice29 {

    public static boolean isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else {

                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching pair
                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        // All brackets must be matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            String s = sc.next();

            System.out.println(isBalanced(s));
        }

        sc.close();
    }
}
