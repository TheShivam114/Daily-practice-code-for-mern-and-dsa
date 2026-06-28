/*
Problem Statement

A string containing only the characters '(' and ')' is considered balanced if every opening parenthesis has a corresponding closing parenthesis in the correct order.

Write a class named Solution that uses a Stack to determine whether a given string is balanced.

Implement the following:

One instance variable for your Stack<Character>.
A method void pushCharacter(char ch) that pushes a character onto the stack.
A method char popCharacter() that pops and returns the top character from the stack.
A method boolean isBalanced(String s) that returns:
true if the string is balanced.
false otherwise.
Input Format

The first line contains an integer T, the number of test cases.

Each of the next T lines contains a string consisting only of '(' and ')'.

Constraints
1 ≤ T ≤ 100
1 ≤ length of string ≤ 1000
Output Format

For each test case, print:

Balanced if the string is balanced.
Not Balanced otherwise.
Sample Input
5
(())
()()
((())
)(
()
Sample Output
Balanced
Balanced
Not Balanced
Not Balanced
Not Balanced
Explanation
Test Case 1
(())
Push '('
Push '('
Pop '('
Pop '('

Stack becomes empty → Balanced

Test Case 2
()()

Every opening bracket has a matching closing bracket.

Output:

Balanced
Test Case 3
((())

One opening bracket remains unmatched.

Output:

Not Balanced
*/
    import java.util.Scanner;
import java.util.Stack;

public class day24{

    // Stack instance variable
    private Stack<Character> stack = new Stack<>();

    // Push character onto stack
    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    // Pop character from stack
    public char popCharacter() {
        return stack.pop();
    }

    // Check if the string is balanced
    public boolean isBalanced(String s) {

        // Clear stack before checking a new string
        stack.clear();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                pushCharacter(ch);
            } else if (ch == ')') {

                if (stack.isEmpty()) {
                    return false;
                }

                popCharacter();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        day24 obj = new day24();

        while (T-- > 0) {

            String s = sc.nextLine();

            if (obj.isBalanced(s)) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not Balanced");
            }
        }

        sc.close();
    }
}

