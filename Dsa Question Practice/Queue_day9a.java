/*
Problem
Given a queue of even length n, your task is to interleave the first half of the queue with the second half.
The interleaving should be done such that:
The first element of the first half is followed by the first element of the second half.
The second element of the first half is followed by the second element of the second half.
And so on.
You must modify the queue in-place using only standard queue operations.
Example 1
Input:
Queue = [1, 2, 3, 4]
Output:
[1, 3, 2, 4]

Explanation:
First half = [1, 2]
Second half = [3, 4]
After interleaving:
1, 3, 2, 4
Example 2
Input:
Queue = [10, 20, 30, 40, 50, 60]

Output:
[10, 40, 20, 50, 30, 60]
Constraints
The number of elements in the queue is even.
2 ≤ n ≤ 10^5
You may use:
Another queue (if needed).
Standard queue operations:
add()
remove()
peek()
isEmpty()
Time Complexity should be O(n).
Extra Space Complexity should be O(n) or better.
Function Signature (Java)
public static void interleaveQueue(Queue<Integer> q)
Follow-Up
Can you solve the problem using only one additional queue?
Can you optimize space usage?
What happens if the queue has odd length?
Expected Approach Hint
Find half size n/2.
Push the first half into a temporary queue.
Interleave elements from:
Temporary queue
Remaining elements of original queue
*/
import java.util.*;
public class Queue_day9a {
       public static void interleave(Queue<Integer>q){
        Queue<Integer>firstHalf=new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
       }
    public static void main(String[] args){
     Queue<Integer> q=new LinkedList<>();
     q.add(1);
     q.add(2);
     q.add(3);
     q.add(4);
     q.add(5);
     q.add(6);
     q.add(7);
     q.add(8);
     q.add(9);
     q.add(10);
     interleave(q);
     while (!q.isEmpty()) {
        System.out.print(q.remove()+" ");
        
     }

     System.out.println();
    }
}
