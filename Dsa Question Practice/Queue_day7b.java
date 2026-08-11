/*
   Here is a professional, interview-ready DSA question based on your requirement:
Problem Statement: Implement a Stack Using Two Queues (Push Operation – O(n))
A stack is a linear data structure that follows the LIFO (Last In, First Out) principle.
Your task is to implement a stack using two queues such that the push operation takes O(n) time complexity, 
while the pop operation takes O(1) time complexity.
 Requirements

Design a class StackUsingQueues that supports the following operations:
void push(int x)
Inserts element x onto the stack.
This operation must run in O(n) time.
int pop()
Removes and returns the element on the top of the stack.
This operation must run in O(1) time.
If the stack is empty, return -1.
int peek()
Returns the top element without removing it.
If the stack is empty, return -1.
boolean isEmpty()
Returns true if the stack is empty; otherwise, false.
 Constraints
Only standard queue operations are allowed:
add() (enqueue)
remove() (dequeue)
peek()
isEmpty()
You may use only two queues (q1 and q2).
The stack must maintain proper LIFO behavior.
 Example
Input Operations:
push(10)
push(20)
push(30)
pop()
peek()

Output:
30
20
 Expected Approach Hint
To make push O(n):
Insert the new element into q2.
Move all elements from q1 to q2.
Swap the names of q1 and q2.
This ensures the most recently added element is always at the front of q1, making pop() O(1).
*/

import java.util.LinkedList;
import java.util.Queue;

public class Queue_day7b {
    static class stack{
       static Queue<Integer>q1=new LinkedList<>();
       static Queue<Integer>q2=new LinkedList<>();
         public static boolean isEmpty(){
            return q1.isEmpty()&& q2.isEmpty();
         }
         public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
         }
         public static int pop(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            int top=-1;
            //case1
            if(!q1.isEmpty())
                {
                 while (!q1.isEmpty()) {
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                 }
            }
            else{//case2
                while (!q2.isEmpty()) {
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }               
            }
            return top;
         }
         public static int peek(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            int top=-1;
            //case1
            if(!q1.isEmpty())
                {
                 while (!q1.isEmpty()) {
                    top=q1.remove();
                    q2.add(top);
                 }
            }
            else{//case2
                while (!q2.isEmpty()) {
                    top=q2.remove();
                    q1.add(top);
                }               
            }
            return top;
         
         }

    }

    public static void main(String[] args){
      stack s=new stack();
      s.push(1);
      s.push(2);
      s.push(3);
      while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
        
      }
    }
}