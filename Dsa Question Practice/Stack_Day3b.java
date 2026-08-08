/*
Reverse a String Using a Stack

You are given a string S consisting of lowercase and uppercase English letters.
Your task is to reverse the string using a stack data structure.
Requirements
Use a stack to reverse the string
You may only use standard stack operations:
push()
pop()
isEmpty()
Do not use built-in reverse functions
 Input
A string S
Example:
S = "Stack"
 Output
Return the reversed string
Example:
"kc atS"
 Example
Input:  "hello"
Output: "olleh" 
*/
import java.util.*;
public class Stack_Day3b {
    public static String reverseString(String str){
         Stack<Character> s=new Stack<>();
         int idx=0;
         while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
         }
         StringBuilder result=new StringBuilder("");
         while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
         }
         return result.toString();
    }
    public static void main(String[] args){
        
         String str="abc";
         System.out.println(str);
          String result=reverseString(str);
          System.out.println(result);
    }
}
