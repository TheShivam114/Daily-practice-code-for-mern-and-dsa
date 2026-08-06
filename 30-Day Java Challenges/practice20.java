/*
Valid Parentheses
Difficulty

⭐ Easy

Problem Statement

Given a string S containing only the characters:

( ) { } [ ]

determine whether the brackets are valid.

A bracket sequence is valid if:

Every opening bracket has a matching closing bracket.
Brackets are closed in the correct order.
Examples of Valid Brackets
()
{}

[]

{[()]}
Examples of Invalid Brackets
(]

([)]

{[(])
Function Description

Implement the function:

public static boolean isValid(String s)
Parameters
s – A string containing brackets.
Returns
true if the bracket sequence is valid.
false otherwise.
Input Format

The first line contains a string:

S
Output Format

Print:

YES

if the brackets are valid.

Otherwise print:

NO
Constraints
1 ≤ S.length() ≤ 10^5
S contains only ()[]{}
Sample Input 1
{[()]}
Sample Output 1
YES
Explanation

Process:

{  → push
[  → push
(  → push
)  → remove (
]  → remove [
}  → remove {

Stack becomes empty, so the string is valid.

Sample Input 2
([)]
Sample Output 2
NO
Explanation

Processing:

( → push
[ → push
) → expected ], but found )

The order is incorrect.
*/
    import java.util.*;

public class practice20 {

    // Function to check valid parentheses
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Check closing brackets
            else {

                // If stack is empty, no opening bracket exists
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (isValid(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

