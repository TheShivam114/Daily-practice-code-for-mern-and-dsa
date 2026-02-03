/*Valid Parentheses Using Stack
Given a string s consisting only of the characters '(', ')', '{', '}', '[', and ']', determine whether the input string is valid.
A string is considered valid if all the following conditions are satisfied:
Every opening bracket is closed by the same type of bracket.
Brackets are closed in the correct order.
Every closing bracket has a corresponding opening bracket of the same type.
Task
Write a program to check whether the given string s is valid using a stack-based approach.
Input
A string s containing only the characters (), {}, and []
Output
Print true if the string is valid
Print false otherwise

Example 1
Input:
s = "()[]{}"
Output:
true

Example 2
Input:
s = "(]"
Output:
false

Example 3
Input:
s = "({[]})"
Output:
true

Example 4
Input:
s = "([)]"
Output:
false

Constraints
1 ≤ s.length ≤ 10^4
s consists only of characters '(){}[]'
Expected Time Complexity
O(N)
Expected Space Complexity
O(N) (for stack usage) */
import java.util.Stack;
public class Stack_day7 {
     public static boolean isValid(String s){
              Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
               
            }
        
     }
    
     public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "({[]})";
        String s4 = "([)]";

        System.out.println(isValid(s1)); 
        System.out.println(isValid(s2)); 
        System.out.println(isValid(s3)); 
        System.out.println(isValid(s4)); 
    }

}
