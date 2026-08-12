/*
Given a queue of integers, reverse the elements of the queue.
You must modify the queue in-place and return the reversed queue.

Example 1
Input:
Queue = [1, 2, 3, 4, 5]
Output:
[5, 4, 3, 2, 1]
Example 2
Input:
Queue = [10, 20]
Output:
[20, 10]
Constraints
1 ≤ n ≤ 10^5
You may use:
A Stack
OR recursion
Only standard queue operations are allowed:
add()
remove()
peek()
isEmpty()
Function Signature (Java)
public static void reverseQueue(Queue<Integer> q)
Follow-up
Can you reverse the queue using a stack?
Can you reverse it using recursion only (without extra data structures)?
What is the time and space complexity?
Expected Approach
Approach 1 (Using Stack)\
Remove all elements from queue and push them into a stack.\
Pop all elements from stack and add back to queue.
Approach 2 (Using Recursion)
Remove front element.
Recursively reverse remaining queue.
Add removed element at the rear.
*/

import java.util.*;

public class Queue_day9b {
    public static void reverse(Queue<Integer>q){
        Stack<Integer>s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
   public static void main(String[] args){
    Queue<Integer> q=new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    reverse(q);
    while (!q.isEmpty()) {
        System.out.print(q.remove()+" ");

    }
    System.out.println();
   } 
}
