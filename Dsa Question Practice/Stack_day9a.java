/*Detect Duplicate Parentheses
You are given a balanced mathematical expression containing lowercase English letters, arithmetic operators (+, -, *, /), and parentheses ( and ).
Your task is to determine whether the given expression contains duplicate parentheses.

Definition
A pair of parentheses is considered duplicate if it encloses a subexpression that is already enclosed by another pair of parentheses, or if the parentheses do not add any meaningful grouping (i.e., they enclose no operator).
Return
true → if the expression contains duplicate parentheses
false → otherwise
Examples
Expression	Output	Explanation
((a+(b)))+(c+d)	true	(b) is redundantly enclosed
(((a)+(b))+c+d)	true	Extra parentheses around a and b
((a+b)+(c+d))	false	All parentheses are meaningful
(a)	true	Single variable inside parentheses
Constraints
The expression is balanced
1 ≤ length of expression ≤ 10⁵
Expression contains only:
lowercase letters (a–z)
operators (+ - * /)
parentheses ( and )
Expected Approach
Solve the problem using a stack-based approach.
Time Complexity: O(n)
Space Complexity: O(n) */
import java.util.*;
public class Stack_day9a {
    public static boolean isDublicate(String str){
         Stack<Character> s=new Stack<>();
         for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //closing
            if(ch==')'){
                 int count=0;
                 while(s.peek()!='('){
                    s.pop();
                    count++;
                 } 
                 if(count<1){
                    return true;
                 }
                 else{
                    s.pop();
                 }
            }
            else{
                s.push(ch);
            }
         }
         return false;
    }
    public static void main(String[] args){
          String str="((a+b))";
          String str1="(a-b)";
          System.out.println(isDublicate(str));

    }
}
