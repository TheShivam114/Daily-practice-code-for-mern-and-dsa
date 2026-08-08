/*Push an Element at the Bottom of a Stack

You are given a stack of integers and a value X.
Your task is to insert X at the bottom of the stack without using any extra data structure (like another stack or array). You may use recursion.

 Requirements
You can only use standard stack operations:
push()
pop()
isEmpty()
peek()
Do not use loops for insertion at bottom.
Maintain the order of existing elements.
 Input
Stack: 1 2 3 4 (4 is at the top)
X = 9
 Output
Stack after insertion:
9 1 2 3 4 (9 is now at the bottom) */
import java.util.*;
public class Stack_day3a {
    public static void pushATBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushATBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        pushATBottom(s, 4);
        while (!s.empty()) {
            System.out.println(s.pop());
            
        }
    }
}
