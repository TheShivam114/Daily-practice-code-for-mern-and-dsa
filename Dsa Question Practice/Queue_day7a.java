/*
A queue is a linear data structure that follows the FIFO (First In, First Out) principle.
You are required to implement a queue using two stacks such that the push (enqueue) operation takes O(n) 
time complexity, while the pop (dequeue) operation takes O(1) time complexity.
 Requirements:
Design a class QueueUsingStacks with the following methods:
void push(int x)
Inserts an element x into the queue.
This operation must take O(n) time complexity.
int pop()
Removes and returns the element from the front of the queue.
This operation must take O(1) time complexity.
If the queue is empty, return -1.
int peek()
Returns the front element without removing it.
If the queue is empty, return -1.
boolean isEmpty()
Returns true if the queue is empty, otherwise false.

 Constraints:
Only standard stack operations are allowed:
push()
pop()
peek()
isEmpty()
You may use two stacks (stack1 and stack2) only
The queue should maintain proper FIFO order.
 Example:
Input Operations:
push(10)
push(20)
push(30)
pop()
peek()


Output:
10
20
 Expected Approach Hint:
To make the push operation O(n):
Move all elements from Stack1 to Stack2.
Push the new element into Stack1.
Move all elements back from Stack2 to Stack1.
This ensures the oldest element remains on top of Stack1, making pop() O(1).
*/
import java.util.*;
public class Queue_day7a {
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        //add-
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            return s1.peek();
        }
        //peek
        public static int peek(){
            if (isEmpty()) {
                System.out.println("queue empty");
                 return -1;
            }
            return s1.pop();
        }

    }
    public static void main(String[] args){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
