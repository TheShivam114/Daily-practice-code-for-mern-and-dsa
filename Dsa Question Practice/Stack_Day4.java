/*You are given a stack of integers.
Your task is to reverse the stack such that the bottom element becomes the top and the top element becomes the bottom.
 Constraints / Rules
You may use recursion
You are not allowed to use any extra data structure (no arrays, no another stack)
You can only use standard stack operations:
push()
pop()
peek()
isEmpty()
 Input

A stack containing elements:
Top → 4 3 2 1
output
The stack after reversal:
Top → 1 2 3 4
 Example
Input Stack:
1
2
3
4

Output Stack:
4
3
2
1 */
    import java.util.*;
public class Stack_Day4 {
    public static void pushAtBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printstack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        // printstack(s);
        reverseStack(s);
        printstack(s);
    }
}

