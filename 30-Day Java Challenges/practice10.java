/*
Valid Parentheses
Difficulty

⭐ Easy

Problem Statement

Given a string containing only the characters:

( ) { } [ ]

determine whether the brackets are balanced.

A string is considered valid if:

Every opening bracket has a matching closing bracket.
Brackets are closed in the correct order.
Function Description

Implement the function:

public static boolean isValid(String s)
Parameters
s – A string containing brackets.
Returns
Return true if the brackets are balanced.
Return false otherwise.
Input Format

The first line contains a string S.

Output Format

Print:

Valid

if the brackets are balanced.

Otherwise print:

Invalid
Constraints
1 ≤ S.length() ≤ 10^5

The string contains only:

( ) { } [ ]
Sample Input 1
{[()]}
Sample Output 1
Valid
Explanation

The order is correct:

{
   [
      (
      )
   ]
}

Every opening bracket has a matching closing bracket.

Sample Input 2
{[(])}
*/
    import java.util.*;
public class practice10  {
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

          
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

           
            else {
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
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}

