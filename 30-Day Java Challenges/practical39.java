/*
Valid Parentheses

Given a string s containing only the characters:

'('  ')'  '{'  '}'  '['  ']'

determine if the input string is valid.

A string is valid if:

Every opening bracket has a corresponding closing bracket.
Brackets close in the correct order.
Every closing bracket has a matching opening bracket.
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
1 <= s.length <= 10^4
s consists only of parentheses, brackets, and braces.
 Hint

Think about a Stack.

When you see an opening bracket:

(  {  [

push it onto the stack.

When you see a closing bracket:

)  }  ]

check whether it matches the top of the stack.

Your task

Write a complete Java program for VS Code, including:

public static void main(String[] args)

Target complexity:

Time: O(n)
Space: O(n)

Try it yourself first. When you're ready, say “solution” and I'll give you the full runnable code.
*/
    import java.util.Stack;

public class practical39 {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing bracket ')'
            else if (ch == ')') {

                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }

            // Closing bracket '}'
            else if (ch == '}') {

                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

            // Closing bracket ']'
            else if (ch == ']') {

                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }

        // Stack should be empty if all brackets are matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "([{}])";

        boolean result = isValid(s);

        System.out.println("Input: " + s);
        System.out.println("Valid: " + result);
    }
}

