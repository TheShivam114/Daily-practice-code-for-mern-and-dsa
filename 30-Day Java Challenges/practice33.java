/*
Valid Parentheses

Difficulty: Easy–Medium
Topic: Stack

Given a string s containing only the characters:

'(' ')' '{' '}' '[' ']'

determine whether the input string is valid.

A string is valid if:

Every opening bracket has a matching closing bracket.
Brackets are closed in the correct order.
Each closing bracket corresponds to the most recent unmatched opening bracket.
Example 1
Input:
s = "()"

Output:
true
Example 2
Input:
s = "()[]{}"

Output:
true
Example 3
Input:
s = "(]"

Output:
false
Example 4
Input:
s = "([{}])"

Output:
true
Example 5
Input:
s = "([)]"

Output:
false
Constraints
1 <= s.length <= 10,000
s consists only of parentheses, brackets, and braces.
Your Task

Create:

public class leetcode_day12

and implement:

public static boolean isValid(String s)
💡 Hint

Use a Stack.

When you see an opening bracket:

(
[
{

push it onto the stack.

When you see a closing bracket:

)
]
}

check whether it matches the top element of the stack.

Target Complexity
Time:  O(n)
Space: O(n)
*/
    import java.util.*;

public class practice33 {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            // Closing brackets
            else {

                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching brackets
                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }

        // Stack must be empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "([{}])";

        boolean result = isValid(s);

        System.out.println(result);
    }
}

